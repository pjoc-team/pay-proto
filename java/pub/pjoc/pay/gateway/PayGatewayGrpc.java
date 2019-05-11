package pub.pjoc.pay.gateway;

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
    value = "by gRPC proto compiler (version 1.15.2-SNAPSHOT)",
    comments = "Source: pay_gateway.proto")
public final class PayGatewayGrpc {

  private PayGatewayGrpc() {}

  public static final String SERVICE_NAME = "pay.PayGateway";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<pub.pjoc.pay.gateway.PayGatewayOuterClass.PayRequest,
      pub.pjoc.pay.gateway.PayGatewayOuterClass.PayResponse> getPayMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "pay",
      requestType = pub.pjoc.pay.gateway.PayGatewayOuterClass.PayRequest.class,
      responseType = pub.pjoc.pay.gateway.PayGatewayOuterClass.PayResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<pub.pjoc.pay.gateway.PayGatewayOuterClass.PayRequest,
      pub.pjoc.pay.gateway.PayGatewayOuterClass.PayResponse> getPayMethod() {
    io.grpc.MethodDescriptor<pub.pjoc.pay.gateway.PayGatewayOuterClass.PayRequest, pub.pjoc.pay.gateway.PayGatewayOuterClass.PayResponse> getPayMethod;
    if ((getPayMethod = PayGatewayGrpc.getPayMethod) == null) {
      synchronized (PayGatewayGrpc.class) {
        if ((getPayMethod = PayGatewayGrpc.getPayMethod) == null) {
          PayGatewayGrpc.getPayMethod = getPayMethod = 
              io.grpc.MethodDescriptor.<pub.pjoc.pay.gateway.PayGatewayOuterClass.PayRequest, pub.pjoc.pay.gateway.PayGatewayOuterClass.PayResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "pay.PayGateway", "pay"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  pub.pjoc.pay.gateway.PayGatewayOuterClass.PayRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  pub.pjoc.pay.gateway.PayGatewayOuterClass.PayResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new PayGatewayMethodDescriptorSupplier("pay"))
                  .build();
          }
        }
     }
     return getPayMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PayGatewayStub newStub(io.grpc.Channel channel) {
    return new PayGatewayStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PayGatewayBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new PayGatewayBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PayGatewayFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new PayGatewayFutureStub(channel);
  }

  /**
   */
  public static abstract class PayGatewayImplBase implements io.grpc.BindableService {

    /**
     */
    public void pay(pub.pjoc.pay.gateway.PayGatewayOuterClass.PayRequest request,
        io.grpc.stub.StreamObserver<pub.pjoc.pay.gateway.PayGatewayOuterClass.PayResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPayMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getPayMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                pub.pjoc.pay.gateway.PayGatewayOuterClass.PayRequest,
                pub.pjoc.pay.gateway.PayGatewayOuterClass.PayResponse>(
                  this, METHODID_PAY)))
          .build();
    }
  }

  /**
   */
  public static final class PayGatewayStub extends io.grpc.stub.AbstractStub<PayGatewayStub> {
    private PayGatewayStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PayGatewayStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PayGatewayStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PayGatewayStub(channel, callOptions);
    }

    /**
     */
    public void pay(pub.pjoc.pay.gateway.PayGatewayOuterClass.PayRequest request,
        io.grpc.stub.StreamObserver<pub.pjoc.pay.gateway.PayGatewayOuterClass.PayResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPayMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class PayGatewayBlockingStub extends io.grpc.stub.AbstractStub<PayGatewayBlockingStub> {
    private PayGatewayBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PayGatewayBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PayGatewayBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PayGatewayBlockingStub(channel, callOptions);
    }

    /**
     */
    public pub.pjoc.pay.gateway.PayGatewayOuterClass.PayResponse pay(pub.pjoc.pay.gateway.PayGatewayOuterClass.PayRequest request) {
      return blockingUnaryCall(
          getChannel(), getPayMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class PayGatewayFutureStub extends io.grpc.stub.AbstractStub<PayGatewayFutureStub> {
    private PayGatewayFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PayGatewayFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PayGatewayFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PayGatewayFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<pub.pjoc.pay.gateway.PayGatewayOuterClass.PayResponse> pay(
        pub.pjoc.pay.gateway.PayGatewayOuterClass.PayRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPayMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PAY = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final PayGatewayImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(PayGatewayImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_PAY:
          serviceImpl.pay((pub.pjoc.pay.gateway.PayGatewayOuterClass.PayRequest) request,
              (io.grpc.stub.StreamObserver<pub.pjoc.pay.gateway.PayGatewayOuterClass.PayResponse>) responseObserver);
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

  private static abstract class PayGatewayBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PayGatewayBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return pub.pjoc.pay.gateway.PayGatewayOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("PayGateway");
    }
  }

  private static final class PayGatewayFileDescriptorSupplier
      extends PayGatewayBaseDescriptorSupplier {
    PayGatewayFileDescriptorSupplier() {}
  }

  private static final class PayGatewayMethodDescriptorSupplier
      extends PayGatewayBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    PayGatewayMethodDescriptorSupplier(String methodName) {
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
      synchronized (PayGatewayGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PayGatewayFileDescriptorSupplier())
              .addMethod(getPayMethod())
              .build();
        }
      }
    }
    return result;
  }
}
