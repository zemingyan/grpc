package com.example.demo.blockandfuture;


import com.example.selfTest.*;
import com.google.protobuf.ByteString;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class SelfBlockClient {

    private final SelfTestServiceGrpc.SelfTestServiceBlockingStub blockingStub;

    public SelfBlockClient(String host, int port) {
        ManagedChannel managedChannel = ManagedChannelBuilder.forAddress(host, port)
                // 使用安全机制传输
                .usePlaintext()
                //.useTransportSecurity()
                .build();
        blockingStub = SelfTestServiceGrpc.newBlockingStub(managedChannel);
    }

    public String first(SelfReq selfReq) {
        SelfReq req = SelfReq.newBuilder()
                .setPhoneNumber(selfReq.getPhoneNumber())
                .setType(selfReq.getType())
                .setUid(selfReq.getUid())
                .build();
        System.out.println("本地数据 " + req.toString());
        SelfResp resp = blockingStub.firstService(req);

        return resp.getResult();
    }
    public String serial(SelfReq selfReq) {
        SelfReq req = SelfReq.newBuilder()
                .setPhoneNumber(selfReq.getPhoneNumber())
                .setType(selfReq.getType())
                .setUid(selfReq.getUid())
                .build();
        ByteString byteString = req.toByteString();
        SerialReq request = SerialReq.newBuilder().setData(byteString).build();

        SelfResp resp = blockingStub.serial(request);
        return resp.getResult();
    }
}
