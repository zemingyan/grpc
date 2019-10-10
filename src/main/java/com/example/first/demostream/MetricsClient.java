package com.example.first.demostream;



import com.example.server.streaming.MetricsServiceGrpc;
import com.example.server.streaming.StreamingExample;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

import java.util.stream.Stream;

/**
 * Created by rayt on 5/16/16.
 */
public class MetricsClient {
    private final MetricsServiceGrpc.MetricsServiceStub stub;

    public MetricsClient(String host, int port) {
        ManagedChannel managedChannel = ManagedChannelBuilder.forAddress(host, port)
                // 使用安全机制传输
                .usePlaintext()
                //.useTransportSecurity()
                .build();
        stub = MetricsServiceGrpc.newStub(managedChannel);
    }



    public void collect() throws InterruptedException {

        StreamObserver<StreamingExample.Metric> collect = stub.collect(new StreamObserver<StreamingExample.Average>() {
            @Override
            public void onNext(StreamingExample.Average value) {
                System.out.println("Average: " + value.getVal());
            }

            @Override
            public void onError(Throwable t) {

            }

            @Override
            public void onCompleted() {

            }
        });

        Stream.of(1L, 2L, 3L, 4L, 5L).map(l -> StreamingExample.Metric.newBuilder().setMetric(l).build())
                .forEach(v-> collect.onNext(v) );
        collect.onCompleted();

        //channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
    }
}