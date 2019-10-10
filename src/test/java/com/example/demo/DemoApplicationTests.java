package com.example.demo;

import com.example.demo.blockandfuture.SelfService;
import com.example.demo.blockandfuture.SelfBlockClient;
import com.example.message.Information;
import com.example.selfTest.SelfReq;
import com.example.selfTest.Type;
import com.google.protobuf.InvalidProtocolBufferException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.serialization.protobuf.advanced.Staff;
import org.serialization.protobuf.imported.CombinationStaff;
import org.serialization.protobuf.imported.PhoneNumber;
import org.serialization.protobuf.quickstart.PersonProtobuf;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {


    @Test
    public void selfTest() throws IOException {
        int port = 8433;
        SelfService server = new SelfService(port);
        server.start();
        SelfBlockClient client = new SelfBlockClient("localhost", port);
        SelfReq.Builder builder = SelfReq.newBuilder();
        builder.setUid(1);
        builder.setType(Type.SECOND);
        builder.setPhoneNumber("13123456789");
        SelfReq selfReq = builder.build();
        builder.clear();
        String res = client.first(selfReq);
        System.out.println("结束");
        System.out.println(res);

        String end = client.serial(selfReq);
        System.out.println("end = " + end);
    }

    @Test
    public void persion() throws InvalidProtocolBufferException {
        PersonProtobuf.Person.Builder persionBuilder = PersonProtobuf.Person.newBuilder();
        persionBuilder.setAge(100);
        persionBuilder.setName("dssssssssssssssssssssss");

        PersonProtobuf.Person person = persionBuilder.build();
        System.out.println("反序列化");
        byte[] data = person.toByteArray();
        PersonProtobuf.Person res = PersonProtobuf.Person.parseFrom(data);
        System.out.println(res.toString());

    }
    @Test
    public void  information() throws InvalidProtocolBufferException {

        Information.Builder informationBuilder = Information.newBuilder();
        informationBuilder.setId(12);
        informationBuilder.setContext("sssssssssssssssssssssssssssfffffffffffffffffffffff");
        Information information = informationBuilder.build();
        byte[] bytes = information.toByteArray();
        Information res = Information.parseFrom(bytes);
    }
    @Test
    public void staff() throws InvalidProtocolBufferException {
        Staff.Builder staffBuilder = Staff.newBuilder();
        staffBuilder.setEmail("3424@gmail.com");
        staffBuilder.setId(1);
        staffBuilder.setName("theName");

        //set list
        List<Staff.PhoneNumber> list = new ArrayList();
        Staff.PhoneNumber.Builder phoneBuilder = Staff.PhoneNumber.newBuilder();
        phoneBuilder.setType(Staff.PhoneType.TELEPHONE);
        phoneBuilder.setNumber("13790453353");
        Staff.PhoneNumber phoneNumber = phoneBuilder.build();
        list.add(phoneNumber);
        phoneBuilder.clear();
        phoneBuilder.setType(Staff.PhoneType.MOBILE);
        phoneBuilder.setNumber("244-324-432");
        list.add(phoneBuilder.build());
        staffBuilder.addAllPhones(list);

        //set map
        Staff.Map.Builder mapBuilder = Staff.Map.newBuilder();
        mapBuilder.setKey("key");
        mapBuilder.setValue("value");
        staffBuilder.setMap(mapBuilder.build());

        Staff staff = staffBuilder.build();

        byte[] bytes = staff.toByteArray();
        System.out.println("反序列化");

        Staff res = Staff.parseFrom(bytes);
        System.out.println(res);
    }

    @Test
    public void  combinationStaff(){
        CombinationStaff.Builder staffBuilder = CombinationStaff.newBuilder();
        staffBuilder.setId(1);
        staffBuilder.setName("张三丰");
        //staffBuilder.setEmail("zhangsanfeng@wudang.org");

        // 构建引用消息（import message）PhoneNumber
        List list = new ArrayList();
        PhoneNumber.Builder phoneBuilder = PhoneNumber.newBuilder();
        phoneBuilder.setType(PhoneNumber.PhoneType.TELEPHONE);
        phoneBuilder.setNumber("010-12345678");
        PhoneNumber phoneNumber = phoneBuilder.build();
        list.add(phoneNumber);
        phoneBuilder.clear();
        phoneBuilder.setType(PhoneNumber.PhoneType.MOBILE);
        phoneBuilder.setNumber("13912345678");
        list.add(phoneBuilder.build());
        staffBuilder.addAllPhone(list);
        // 完成staff的构建
        CombinationStaff zhangsanfeng = staffBuilder.build();
        // 序列化，byte[]可以被写到磁盘文件，或者通过网络发送出去。
        byte[] data = zhangsanfeng.toByteArray();
        System.out.println("serialization end.");



        // 反序列化，byte[]可以读文件或者读取网络数据构建。
        System.out.println("deserialization begin.");
        try {
            CombinationStaff staff = CombinationStaff.parseFrom(data);
            System.out.println(staff.getId());
            System.out.println(staff.getName());
            staff.getPhoneList().forEach(x -> System.out.println(x.toString()));
        } catch (InvalidProtocolBufferException e) {
            e.printStackTrace();
        }
    }



}
