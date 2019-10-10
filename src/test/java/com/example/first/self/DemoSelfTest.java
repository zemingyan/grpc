package com.example.first.self;


import com.example.first.blockandfuture.SelfFutureClient;
import com.example.first.blockandfuture.SelfService;
import com.example.selfTest.SelfReq;
import com.example.selfTest.Type;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoSelfTest {

    @Test
    public void futureTest() throws IOException, InterruptedException {
        int port = 8443;
        SelfService server = new SelfService(port);
        server.start();
        SelfFutureClient client = new SelfFutureClient("localhost", port);
        SelfReq.Builder builder = SelfReq.newBuilder();
        builder.setUid(1);
        builder.setType(Type.SECOND);
        builder.setPhoneNumber("13123456789");
        SelfReq selfReq = builder.build();
        builder.clear();
       /* String res = client.first(selfReq);
        System.out.println("结束");
        System.out.println(res);*/

        String end = client.serial(selfReq);
        System.out.println("end = " + end);
        Thread.sleep(2000);
    }

}
