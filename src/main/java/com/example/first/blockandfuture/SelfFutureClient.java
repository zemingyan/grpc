package com.example.first.blockandfuture;

import com.example.selfTest.SelfReq;
import com.example.selfTest.SelfResp;
import com.example.selfTest.SelfTestServiceGrpc;
import com.example.selfTest.SerialReq;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.protobuf.ByteString;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;

public class SelfFutureClient {
    private static final Logger logger = LoggerFactory.getLogger(SelfFutureClient.class);
    private final SelfTestServiceGrpc.SelfTestServiceFutureStub futureStub;

    public SelfFutureClient(String host, int port) {
        ManagedChannel managedChannel = ManagedChannelBuilder.forAddress(host, port)
                // 使用安全机制传输
                .usePlaintext()
                //.useTransportSecurity()
                .build();
        futureStub = SelfTestServiceGrpc.newFutureStub(managedChannel);
    }

    public String serial(SelfReq selfReq) {

        SelfReq req = SelfReq.newBuilder()
                .setPhoneNumber(selfReq.getPhoneNumber())
                .setType(selfReq.getType())
                .setUid(selfReq.getUid())
                .build();
        ByteString byteString = req.toByteString();
        SerialReq request = SerialReq.newBuilder().setData(byteString).build();
        ListenableFuture<SelfResp> listenableFuture = futureStub.serial(request);
        listenableFuture.addListener(()->{
            try {
                SelfResp response = listenableFuture.get();
                logger.info(response.getResult());
                logger.info("success");

            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }

        }, Executors.newFixedThreadPool(2));

        return "-1";
    }


}
