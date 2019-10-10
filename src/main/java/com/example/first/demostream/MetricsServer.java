package com.example.first.demostream;


import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

/**
 * Created by rayt on 5/16/16.
 */
public class MetricsServer {

    private static Server server;
    public MetricsServer(int port){
         server = ServerBuilder.forPort(port).addService(new MetricsServiceImpl()).build();


    }
    public void start() throws IOException {
        server.start();
    }

    public void shutdown() {
        server.shutdown();
    }
}