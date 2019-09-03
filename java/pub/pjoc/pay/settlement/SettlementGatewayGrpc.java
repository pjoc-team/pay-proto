package pub.pjoc.pay.settlement;

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
    comments = "Source: pay_settlement.proto")
public final class SettlementGatewayGrpc {

  private SettlementGatewayGrpc() {}

  public static final String SERVICE_NAME = "pay.SettlementGateway";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<pub.pjoc.pay.settlement.PaySettlement.SettlementRequest,
      pub.pjoc.pay.settlement.PaySettlement.SettlementResponse> getProcessSuccessMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ProcessSuccess",
      requestType = pub.pjoc.pay.settlement.PaySettlement.SettlementRequest.class,
      responseType = pub.pjoc.pay.settlement.PaySettlement.SettlementResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<pub.pjoc.pay.settlement.PaySettlement.SettlementRequest,
      pub.pjoc.pay.settlement.PaySettlement.SettlementResponse> getProcessSuccessMethod() {
    io.grpc.MethodDescriptor<pub.pjoc.pay.settlement.PaySettlement.SettlementRequest, pub.pjoc.pay.settlement.PaySettlement.SettlementResponse> getProcessSuccessMethod;
    if ((getProcessSuccessMethod = SettlementGatewayGrpc.getProcessSuccessMethod) == null) {
      synchronized (SettlementGatewayGrpc.class) {
        if ((getProcessSuccessMethod = SettlementGatewayGrpc.getProcessSuccessMethod) == null) {
          SettlementGatewayGrpc.getProcessSuccessMethod = getProcessSuccessMethod =
              io.grpc.MethodDescriptor.<pub.pjoc.pay.settlement.PaySettlement.SettlementRequest, pub.pjoc.pay.settlement.PaySettlement.SettlementResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ProcessSuccess"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  pub.pjoc.pay.settlement.PaySettlement.SettlementRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  pub.pjoc.pay.settlement.PaySettlement.SettlementResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SettlementGatewayMethodDescriptorSupplier("ProcessSuccess"))
              .build();
        }
      }
    }
    return getProcessSuccessMethod;
  }

  private static volatile io.grpc.MethodDescriptor<pub.pjoc.pay.settlement.PaySettlement.SettlementPayOrder,
      pub.pjoc.pay.settlement.PaySettlement.SettlementResponse> getProcessOrderSuccessMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ProcessOrderSuccess",
      requestType = pub.pjoc.pay.settlement.PaySettlement.SettlementPayOrder.class,
      responseType = pub.pjoc.pay.settlement.PaySettlement.SettlementResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<pub.pjoc.pay.settlement.PaySettlement.SettlementPayOrder,
      pub.pjoc.pay.settlement.PaySettlement.SettlementResponse> getProcessOrderSuccessMethod() {
    io.grpc.MethodDescriptor<pub.pjoc.pay.settlement.PaySettlement.SettlementPayOrder, pub.pjoc.pay.settlement.PaySettlement.SettlementResponse> getProcessOrderSuccessMethod;
    if ((getProcessOrderSuccessMethod = SettlementGatewayGrpc.getProcessOrderSuccessMethod) == null) {
      synchronized (SettlementGatewayGrpc.class) {
        if ((getProcessOrderSuccessMethod = SettlementGatewayGrpc.getProcessOrderSuccessMethod) == null) {
          SettlementGatewayGrpc.getProcessOrderSuccessMethod = getProcessOrderSuccessMethod =
              io.grpc.MethodDescriptor.<pub.pjoc.pay.settlement.PaySettlement.SettlementPayOrder, pub.pjoc.pay.settlement.PaySettlement.SettlementResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ProcessOrderSuccess"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  pub.pjoc.pay.settlement.PaySettlement.SettlementPayOrder.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  pub.pjoc.pay.settlement.PaySettlement.SettlementResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SettlementGatewayMethodDescriptorSupplier("ProcessOrderSuccess"))
              .build();
        }
      }
    }
    return getProcessOrderSuccessMethod;
  }

  private static volatile io.grpc.MethodDescriptor<pub.pjoc.pay.settlement.PaySettlement.SettlementPayOrder,
      pub.pjoc.pay.settlement.PaySettlement.SettlementResponse> getNotifyOrderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "NotifyOrder",
      requestType = pub.pjoc.pay.settlement.PaySettlement.SettlementPayOrder.class,
      responseType = pub.pjoc.pay.settlement.PaySettlement.SettlementResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<pub.pjoc.pay.settlement.PaySettlement.SettlementPayOrder,
      pub.pjoc.pay.settlement.PaySettlement.SettlementResponse> getNotifyOrderMethod() {
    io.grpc.MethodDescriptor<pub.pjoc.pay.settlement.PaySettlement.SettlementPayOrder, pub.pjoc.pay.settlement.PaySettlement.SettlementResponse> getNotifyOrderMethod;
    if ((getNotifyOrderMethod = SettlementGatewayGrpc.getNotifyOrderMethod) == null) {
      synchronized (SettlementGatewayGrpc.class) {
        if ((getNotifyOrderMethod = SettlementGatewayGrpc.getNotifyOrderMethod) == null) {
          SettlementGatewayGrpc.getNotifyOrderMethod = getNotifyOrderMethod =
              io.grpc.MethodDescriptor.<pub.pjoc.pay.settlement.PaySettlement.SettlementPayOrder, pub.pjoc.pay.settlement.PaySettlement.SettlementResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "NotifyOrder"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  pub.pjoc.pay.settlement.PaySettlement.SettlementPayOrder.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  pub.pjoc.pay.settlement.PaySettlement.SettlementResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SettlementGatewayMethodDescriptorSupplier("NotifyOrder"))
              .build();
        }
      }
    }
    return getNotifyOrderMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SettlementGatewayStub newStub(io.grpc.Channel channel) {
    return new SettlementGatewayStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SettlementGatewayBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new SettlementGatewayBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SettlementGatewayFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new SettlementGatewayFutureStub(channel);
  }

  /**
   */
  public static abstract class SettlementGatewayImplBase implements io.grpc.BindableService {

    /**
     */
    public void processSuccess(pub.pjoc.pay.settlement.PaySettlement.SettlementRequest request,
        io.grpc.stub.StreamObserver<pub.pjoc.pay.settlement.PaySettlement.SettlementResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getProcessSuccessMethod(), responseObserver);
    }

    /**
     */
    public void processOrderSuccess(pub.pjoc.pay.settlement.PaySettlement.SettlementPayOrder request,
        io.grpc.stub.StreamObserver<pub.pjoc.pay.settlement.PaySettlement.SettlementResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getProcessOrderSuccessMethod(), responseObserver);
    }

    /**
     */
    public void notifyOrder(pub.pjoc.pay.settlement.PaySettlement.SettlementPayOrder request,
        io.grpc.stub.StreamObserver<pub.pjoc.pay.settlement.PaySettlement.SettlementResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getNotifyOrderMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getProcessSuccessMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                pub.pjoc.pay.settlement.PaySettlement.SettlementRequest,
                pub.pjoc.pay.settlement.PaySettlement.SettlementResponse>(
                  this, METHODID_PROCESS_SUCCESS)))
          .addMethod(
            getProcessOrderSuccessMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                pub.pjoc.pay.settlement.PaySettlement.SettlementPayOrder,
                pub.pjoc.pay.settlement.PaySettlement.SettlementResponse>(
                  this, METHODID_PROCESS_ORDER_SUCCESS)))
          .addMethod(
            getNotifyOrderMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                pub.pjoc.pay.settlement.PaySettlement.SettlementPayOrder,
                pub.pjoc.pay.settlement.PaySettlement.SettlementResponse>(
                  this, METHODID_NOTIFY_ORDER)))
          .build();
    }
  }

  /**
   */
  public static final class SettlementGatewayStub extends io.grpc.stub.AbstractStub<SettlementGatewayStub> {
    private SettlementGatewayStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SettlementGatewayStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SettlementGatewayStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SettlementGatewayStub(channel, callOptions);
    }

    /**
     */
    public void processSuccess(pub.pjoc.pay.settlement.PaySettlement.SettlementRequest request,
        io.grpc.stub.StreamObserver<pub.pjoc.pay.settlement.PaySettlement.SettlementResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getProcessSuccessMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void processOrderSuccess(pub.pjoc.pay.settlement.PaySettlement.SettlementPayOrder request,
        io.grpc.stub.StreamObserver<pub.pjoc.pay.settlement.PaySettlement.SettlementResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getProcessOrderSuccessMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void notifyOrder(pub.pjoc.pay.settlement.PaySettlement.SettlementPayOrder request,
        io.grpc.stub.StreamObserver<pub.pjoc.pay.settlement.PaySettlement.SettlementResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getNotifyOrderMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class SettlementGatewayBlockingStub extends io.grpc.stub.AbstractStub<SettlementGatewayBlockingStub> {
    private SettlementGatewayBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SettlementGatewayBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SettlementGatewayBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SettlementGatewayBlockingStub(channel, callOptions);
    }

    /**
     */
    public pub.pjoc.pay.settlement.PaySettlement.SettlementResponse processSuccess(pub.pjoc.pay.settlement.PaySettlement.SettlementRequest request) {
      return blockingUnaryCall(
          getChannel(), getProcessSuccessMethod(), getCallOptions(), request);
    }

    /**
     */
    public pub.pjoc.pay.settlement.PaySettlement.SettlementResponse processOrderSuccess(pub.pjoc.pay.settlement.PaySettlement.SettlementPayOrder request) {
      return blockingUnaryCall(
          getChannel(), getProcessOrderSuccessMethod(), getCallOptions(), request);
    }

    /**
     */
    public pub.pjoc.pay.settlement.PaySettlement.SettlementResponse notifyOrder(pub.pjoc.pay.settlement.PaySettlement.SettlementPayOrder request) {
      return blockingUnaryCall(
          getChannel(), getNotifyOrderMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class SettlementGatewayFutureStub extends io.grpc.stub.AbstractStub<SettlementGatewayFutureStub> {
    private SettlementGatewayFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SettlementGatewayFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SettlementGatewayFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SettlementGatewayFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<pub.pjoc.pay.settlement.PaySettlement.SettlementResponse> processSuccess(
        pub.pjoc.pay.settlement.PaySettlement.SettlementRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getProcessSuccessMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<pub.pjoc.pay.settlement.PaySettlement.SettlementResponse> processOrderSuccess(
        pub.pjoc.pay.settlement.PaySettlement.SettlementPayOrder request) {
      return futureUnaryCall(
          getChannel().newCall(getProcessOrderSuccessMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<pub.pjoc.pay.settlement.PaySettlement.SettlementResponse> notifyOrder(
        pub.pjoc.pay.settlement.PaySettlement.SettlementPayOrder request) {
      return futureUnaryCall(
          getChannel().newCall(getNotifyOrderMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PROCESS_SUCCESS = 0;
  private static final int METHODID_PROCESS_ORDER_SUCCESS = 1;
  private static final int METHODID_NOTIFY_ORDER = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SettlementGatewayImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SettlementGatewayImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_PROCESS_SUCCESS:
          serviceImpl.processSuccess((pub.pjoc.pay.settlement.PaySettlement.SettlementRequest) request,
              (io.grpc.stub.StreamObserver<pub.pjoc.pay.settlement.PaySettlement.SettlementResponse>) responseObserver);
          break;
        case METHODID_PROCESS_ORDER_SUCCESS:
          serviceImpl.processOrderSuccess((pub.pjoc.pay.settlement.PaySettlement.SettlementPayOrder) request,
              (io.grpc.stub.StreamObserver<pub.pjoc.pay.settlement.PaySettlement.SettlementResponse>) responseObserver);
          break;
        case METHODID_NOTIFY_ORDER:
          serviceImpl.notifyOrder((pub.pjoc.pay.settlement.PaySettlement.SettlementPayOrder) request,
              (io.grpc.stub.StreamObserver<pub.pjoc.pay.settlement.PaySettlement.SettlementResponse>) responseObserver);
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

  private static abstract class SettlementGatewayBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SettlementGatewayBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return pub.pjoc.pay.settlement.PaySettlement.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SettlementGateway");
    }
  }

  private static final class SettlementGatewayFileDescriptorSupplier
      extends SettlementGatewayBaseDescriptorSupplier {
    SettlementGatewayFileDescriptorSupplier() {}
  }

  private static final class SettlementGatewayMethodDescriptorSupplier
      extends SettlementGatewayBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SettlementGatewayMethodDescriptorSupplier(String methodName) {
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
      synchronized (SettlementGatewayGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SettlementGatewayFileDescriptorSupplier())
              .addMethod(getProcessSuccessMethod())
              .addMethod(getProcessOrderSuccessMethod())
              .addMethod(getNotifyOrderMethod())
              .build();
        }
      }
    }
    return result;
  }
}
