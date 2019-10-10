package com.example.first.self;

import com.example.first.demostream.MetricsClient;
import com.example.first.demostream.MetricsServer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;
import java.util.stream.Stream;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StreamTest {

    @Test
    public void streamOpear(){
       // Stream.of(1L, 2L, 3L, 4L, 5L).map(l -> StreamingExample.Metric.newBuilder().setMetric(l).build()).forEach(collect::onNext);
        Stream.of(1L, 2L, 3L, 4L, 5L).forEach(System.out::println);


       Stream.of("aaa","bbb", "ccc").map(String::toUpperCase).forEach(System.out::println);

    }
    @Test
    public void stream() throws IOException, InterruptedException {
        int port = 8433;
        MetricsServer server = new MetricsServer(port);
        server.start();
        MetricsClient client = new MetricsClient("localhost", port);
        client.collect();
        Thread.sleep(2000);
    }
}
