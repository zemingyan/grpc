package com.example.first.blockandfuture;

import com.example.selfTest.*;
import com.google.protobuf.ByteString;
import com.google.protobuf.InvalidProtocolBufferException;
import io.grpc.stub.StreamObserver;

public class SelfGrpcService extends SelfTestServiceGrpc.SelfTestServiceImplBase {


    @Override
    public void firstService(SelfReq request, StreamObserver<SelfResp> responseObserver) {
        SelfReq req = request.getDefaultInstanceForType();
        req.toString();
        System.out.println("打印数据  " + (req == null) + "  "+ request.toString());
        SelfResp resp = SelfResp.newBuilder().setResult("res = " + request.toString()).build();
        responseObserver.onNext(resp);
        responseObserver.onCompleted();
    }

    public void serial(SerialReq request, StreamObserver<SelfResp> responseObserver)  {
        ByteString bytes;
        bytes = request.getData();
        System.out.println("byteString=  " + bytes);
        SelfReq   selfReq = null;
        try {
            selfReq = SelfReq.parseFrom(bytes);
        } catch (InvalidProtocolBufferException e) {
            e.printStackTrace();
        }

        System.out.println("反序列化数据　"+ selfReq.toString());
        SelfResp resp = SelfResp.newBuilder().setResult(selfReq.toString()).build();
        responseObserver.onNext(resp);
        responseObserver.onCompleted();
    }
}
