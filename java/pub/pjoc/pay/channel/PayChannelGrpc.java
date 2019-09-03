package pub.pjoc.pay.channel;

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
    value = "by gRPC proto compiler (version 1.23.1-SNAPSHOT)",
    comments = "Source: pay_channel.proto")
public final class PayChannelGrpc {

  private PayChannelGrpc() {}

  public static final String SERVICE_NAME = "pay.PayChannel";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<pub.pjoc.pay.channel.PayChannelOuterClass.ChannelPayRequest,
      pub.pjoc.pay.channel.PayChannelOuterClass.ChannelPayResponse> getPayMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "pay",
      requestType = pub.pjoc.pay.channel.PayChannelOuterClass.ChannelPayRequest.class,
      responseType = pub.pjoc.pay.channel.PayChannelOuterClass.ChannelPayResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<pub.pjoc.pay.channel.PayChannelOuterClass.ChannelPayRequest,
      pub.pjoc.pay.channel.PayChannelOuterClass.ChannelPayResponse> getPayMethod() {
    io.grpc.MethodDescriptor<pub.pjoc.pay.channel.PayChannelOuterClass.ChannelPayRequest, pub.pjoc.pay.channel.PayChannelOuterClass.ChannelPayResponse> getPayMethod;
    if ((getPayMethod = PayChannelGrpc.getPayMethod) == null) {
      synchronized (PayChannelGrpc.class) {
        if ((getPayMethod = PayChannelGrpc.getPayMethod) == null) {
          PayChannelGrpc.getPayMethod = getPayMethod =
              io.grpc.MethodDescriptor.<pub.pjoc.pay.channel.PayChannelOuterClass.ChannelPayRequest, pub.pjoc.pay.channel.PayChannelOuterClass.ChannelPayResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "pay"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  pub.pjoc.pay.channel.PayChannelOuterClass.ChannelPayRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  pub.pjoc.pay.channel.PayChannelOuterClass.ChannelPayResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PayChannelMethodDescriptorSupplier("pay"))
              .build();
        }
      }
    }
    return getPayMethod;
  }

  private static volatile io.grpc.MethodDescriptor<pub.pjoc.pay.channel.PayChannelOuterClass.NotifyRequest,
      pub.pjoc.pay.channel.PayChannelOuterClass.NotifyResponse> getNotifyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "notify",
      requestType = pub.pjoc.pay.channel.PayChannelOuterClass.NotifyRequest.class,
      responseType = pub.pjoc.pay.channel.PayChannelOuterClass.NotifyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<pub.pjoc.pay.channel.PayChannelOuterClass.NotifyRequest,
      pub.pjoc.pay.channel.PayChannelOuterClass.NotifyResponse> getNotifyMethod() {
    io.grpc.MethodDescriptor<pub.pjoc.pay.channel.PayChannelOuterClass.NotifyRequest, pub.pjoc.pay.channel.PayChannelOuterClass.NotifyResponse> getNotifyMethod;
    if ((getNotifyMethod = PayChannelGrpc.getNotifyMethod) == null) {
      synchronized (PayChannelGrpc.class) {
        if ((getNotifyMethod = PayChannelGrpc.getNotifyMethod) == null) {
          PayChannelGrpc.getNotifyMethod = getNotifyMethod =
              io.grpc.MethodDescriptor.<pub.pjoc.pay.channel.PayChannelOuterClass.NotifyRequest, pub.pjoc.pay.channel.PayChannelOuterClass.NotifyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "notify"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  pub.pjoc.pay.channel.PayChannelOuterClass.NotifyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  pub.pjoc.pay.channel.PayChannelOuterClass.NotifyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PayChannelMethodDescriptorSupplier("notify"))
              .build();
        }
      }
    }
    return getNotifyMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PayChannelStub newStub(io.grpc.Channel channel) {
    return new PayChannelStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PayChannelBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new PayChannelBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PayChannelFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new PayChannelFutureStub(channel);
  }

  /**
   */
  public static abstract class PayChannelImplBase implements io.grpc.BindableService {

    /**
     */
    public void pay(pub.pjoc.pay.channel.PayChannelOuterClass.ChannelPayRequest request,
        io.grpc.stub.StreamObserver<pub.pjoc.pay.channel.PayChannelOuterClass.ChannelPayResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPayMethod(), responseObserver);
    }

    /**
     */
    public void notify(pub.pjoc.pay.channel.PayChannelOuterClass.NotifyRequest request,
        io.grpc.stub.StreamObserver<pub.pjoc.pay.channel.PayChannelOuterClass.NotifyResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getNotifyMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getPayMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                pub.pjoc.pay.channel.PayChannelOuterClass.ChannelPayRequest,
                pub.pjoc.pay.channel.PayChannelOuterClass.ChannelPayResponse>(
                  this, METHODID_PAY)))
          .addMethod(
            getNotifyMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                pub.pjoc.pay.channel.PayChannelOuterClass.NotifyRequest,
                pub.pjoc.pay.channel.PayChannelOuterClass.NotifyResponse>(
                  this, METHODID_NOTIFY)))
          .build();
    }
  }

  /**
   */
  public static final class PayChannelStub extends io.grpc.stub.AbstractStub<PayChannelStub> {
    private PayChannelStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PayChannelStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PayChannelStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PayChannelStub(channel, callOptions);
    }

    /**
     */
    public void pay(pub.pjoc.pay.channel.PayChannelOuterClass.ChannelPayRequest request,
        io.grpc.stub.StreamObserver<pub.pjoc.pay.channel.PayChannelOuterClass.ChannelPayResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPayMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void notify(pub.pjoc.pay.channel.PayChannelOuterClass.NotifyRequest request,
        io.grpc.stub.StreamObserver<pub.pjoc.pay.channel.PayChannelOuterClass.NotifyResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getNotifyMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class PayChannelBlockingStub extends io.grpc.stub.AbstractStub<PayChannelBlockingStub> {
    private PayChannelBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PayChannelBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PayChannelBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PayChannelBlockingStub(channel, callOptions);
    }

    /**
     */
    public pub.pjoc.pay.channel.PayChannelOuterClass.ChannelPayResponse pay(pub.pjoc.pay.channel.PayChannelOuterClass.ChannelPayRequest request) {
      return blockingUnaryCall(
          getChannel(), getPayMethod(), getCallOptions(), request);
    }

    /**
     */
    public pub.pjoc.pay.channel.PayChannelOuterClass.NotifyResponse notify(pub.pjoc.pay.channel.PayChannelOuterClass.NotifyRequest request) {
      return blockingUnaryCall(
          getChannel(), getNotifyMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class PayChannelFutureStub extends io.grpc.stub.AbstractStub<PayChannelFutureStub> {
    private PayChannelFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PayChannelFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PayChannelFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PayChannelFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<pub.pjoc.pay.channel.PayChannelOuterClass.ChannelPayResponse> pay(
        pub.pjoc.pay.channel.PayChannelOuterClass.ChannelPayRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPayMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<pub.pjoc.pay.channel.PayChannelOuterClass.NotifyResponse> notify(
        pub.pjoc.pay.channel.PayChannelOuterClass.NotifyRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getNotifyMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PAY = 0;
  private static final int METHODID_NOTIFY = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final PayChannelImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(PayChannelImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_PAY:
          serviceImpl.pay((pub.pjoc.pay.channel.PayChannelOuterClass.ChannelPayRequest) request,
              (io.grpc.stub.StreamObserver<pub.pjoc.pay.channel.PayChannelOuterClass.ChannelPayResponse>) responseObserver);
          break;
        case METHODID_NOTIFY:
          serviceImpl.notify((pub.pjoc.pay.channel.PayChannelOuterClass.NotifyRequest) request,
              (io.grpc.stub.StreamObserver<pub.pjoc.pay.channel.PayChannelOuterClass.NotifyResponse>) responseObserver);
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

  private static abstract class PayChannelBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PayChannelBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return pub.pjoc.pay.channel.PayChannelOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("PayChannel");
    }
  }

  private static final class PayChannelFileDescriptorSupplier
      extends PayChannelBaseDescriptorSupplier {
    PayChannelFileDescriptorSupplier() {}
  }

  private static final class PayChannelMethodDescriptorSupplier
      extends PayChannelBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    PayChannelMethodDescriptorSupplier(String methodName) {
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
      synchronized (PayChannelGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PayChannelFileDescriptorSupplier())
              .addMethod(getPayMethod())
              .addMethod(getNotifyMethod())
              .build();
        }
      }
    }
    return result;
  }
}
