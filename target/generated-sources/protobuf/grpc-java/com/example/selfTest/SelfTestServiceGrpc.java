package com.example.selfTest;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.21.0)",
    comments = "Source: blockfuture/selff.proto")
public final class SelfTestServiceGrpc {

  private SelfTestServiceGrpc() {}

  public static final String SERVICE_NAME = "SelfTestService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.example.selfTest.SelfReq,
      com.example.selfTest.SelfResp> getFirstServiceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "firstService",
      requestType = com.example.selfTest.SelfReq.class,
      responseType = com.example.selfTest.SelfResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.selfTest.SelfReq,
      com.example.selfTest.SelfResp> getFirstServiceMethod() {
    io.grpc.MethodDescriptor<com.example.selfTest.SelfReq, com.example.selfTest.SelfResp> getFirstServiceMethod;
    if ((getFirstServiceMethod = SelfTestServiceGrpc.getFirstServiceMethod) == null) {
      synchronized (SelfTestServiceGrpc.class) {
        if ((getFirstServiceMethod = SelfTestServiceGrpc.getFirstServiceMethod) == null) {
          SelfTestServiceGrpc.getFirstServiceMethod = getFirstServiceMethod = 
              io.grpc.MethodDescriptor.<com.example.selfTest.SelfReq, com.example.selfTest.SelfResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "SelfTestService", "firstService"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.selfTest.SelfReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.selfTest.SelfResp.getDefaultInstance()))
                  .setSchemaDescriptor(new SelfTestServiceMethodDescriptorSupplier("firstService"))
                  .build();
          }
        }
     }
     return getFirstServiceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.selfTest.SerialReq,
      com.example.selfTest.SelfResp> getSerialMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "serial",
      requestType = com.example.selfTest.SerialReq.class,
      responseType = com.example.selfTest.SelfResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.selfTest.SerialReq,
      com.example.selfTest.SelfResp> getSerialMethod() {
    io.grpc.MethodDescriptor<com.example.selfTest.SerialReq, com.example.selfTest.SelfResp> getSerialMethod;
    if ((getSerialMethod = SelfTestServiceGrpc.getSerialMethod) == null) {
      synchronized (SelfTestServiceGrpc.class) {
        if ((getSerialMethod = SelfTestServiceGrpc.getSerialMethod) == null) {
          SelfTestServiceGrpc.getSerialMethod = getSerialMethod = 
              io.grpc.MethodDescriptor.<com.example.selfTest.SerialReq, com.example.selfTest.SelfResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "SelfTestService", "serial"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.selfTest.SerialReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.selfTest.SelfResp.getDefaultInstance()))
                  .setSchemaDescriptor(new SelfTestServiceMethodDescriptorSupplier("serial"))
                  .build();
          }
        }
     }
     return getSerialMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SelfTestServiceStub newStub(io.grpc.Channel channel) {
    return new SelfTestServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SelfTestServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new SelfTestServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SelfTestServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new SelfTestServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class SelfTestServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void firstService(com.example.selfTest.SelfReq request,
        io.grpc.stub.StreamObserver<com.example.selfTest.SelfResp> responseObserver) {
      asyncUnimplementedUnaryCall(getFirstServiceMethod(), responseObserver);
    }

    /**
     */
    public void serial(com.example.selfTest.SerialReq request,
        io.grpc.stub.StreamObserver<com.example.selfTest.SelfResp> responseObserver) {
      asyncUnimplementedUnaryCall(getSerialMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getFirstServiceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.example.selfTest.SelfReq,
                com.example.selfTest.SelfResp>(
                  this, METHODID_FIRST_SERVICE)))
          .addMethod(
            getSerialMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.example.selfTest.SerialReq,
                com.example.selfTest.SelfResp>(
                  this, METHODID_SERIAL)))
          .build();
    }
  }

  /**
   */
  public static final class SelfTestServiceStub extends io.grpc.stub.AbstractStub<SelfTestServiceStub> {
    private SelfTestServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SelfTestServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SelfTestServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SelfTestServiceStub(channel, callOptions);
    }

    /**
     */
    public void firstService(com.example.selfTest.SelfReq request,
        io.grpc.stub.StreamObserver<com.example.selfTest.SelfResp> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getFirstServiceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void serial(com.example.selfTest.SerialReq request,
        io.grpc.stub.StreamObserver<com.example.selfTest.SelfResp> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSerialMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class SelfTestServiceBlockingStub extends io.grpc.stub.AbstractStub<SelfTestServiceBlockingStub> {
    private SelfTestServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SelfTestServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SelfTestServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SelfTestServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.example.selfTest.SelfResp firstService(com.example.selfTest.SelfReq request) {
      return blockingUnaryCall(
          getChannel(), getFirstServiceMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.selfTest.SelfResp serial(com.example.selfTest.SerialReq request) {
      return blockingUnaryCall(
          getChannel(), getSerialMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class SelfTestServiceFutureStub extends io.grpc.stub.AbstractStub<SelfTestServiceFutureStub> {
    private SelfTestServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SelfTestServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SelfTestServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SelfTestServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.selfTest.SelfResp> firstService(
        com.example.selfTest.SelfReq request) {
      return futureUnaryCall(
          getChannel().newCall(getFirstServiceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.selfTest.SelfResp> serial(
        com.example.selfTest.SerialReq request) {
      return futureUnaryCall(
          getChannel().newCall(getSerialMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_FIRST_SERVICE = 0;
  private static final int METHODID_SERIAL = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SelfTestServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SelfTestServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_FIRST_SERVICE:
          serviceImpl.firstService((com.example.selfTest.SelfReq) request,
              (io.grpc.stub.StreamObserver<com.example.selfTest.SelfResp>) responseObserver);
          break;
        case METHODID_SERIAL:
          serviceImpl.serial((com.example.selfTest.SerialReq) request,
              (io.grpc.stub.StreamObserver<com.example.selfTest.SelfResp>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class SelfTestServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SelfTestServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.example.selfTest.SelfTestBuf.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SelfTestService");
    }
  }

  private static final class SelfTestServiceFileDescriptorSupplier
      extends SelfTestServiceBaseDescriptorSupplier {
    SelfTestServiceFileDescriptorSupplier() {}
  }

  private static final class SelfTestServiceMethodDescriptorSupplier
      extends SelfTestServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SelfTestServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (SelfTestServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SelfTestServiceFileDescriptorSupplier())
              .addMethod(getFirstServiceMethod())
              .addMethod(getSerialMethod())
              .build();
        }
      }
    }
    return result;
  }
}
