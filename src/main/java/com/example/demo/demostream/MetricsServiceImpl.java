package com.example.demo.demostream;



import com.example.server.streaming.MetricsServiceGrpc;
import com.example.server.streaming.StreamingExample;
import io.grpc.stub.StreamObserver;

import java.util.stream.Stream;

/**
 * Created by rayt on 5/16/16.
 */
public class MetricsServiceImpl extends MetricsServiceGrpc.MetricsServiceImplBase {
    @Override
    public StreamObserver<StreamingExample.Metric> collect(StreamObserver<StreamingExample.Average> responseObserver) {
        return new StreamObserver<StreamingExample.Metric>() {
            //private long sum = 0;
            private long count = 0;

            @Override
            public void onNext(StreamingExample.Metric value) {
                System.out.println("server deal data -- value: " + value);
                //sum += value.getMetric();
                count+=2;

            }

            @Override
            public void onError(Throwable t) {
                responseObserver.onError(t);
            }

            @Override
            public void onCompleted() {
                Stream.of(count).map(v->StreamingExample.Average.newBuilder().setVal(v).build())
                        .forEach(responseObserver::onNext);
            }
        };
    }
}