package pub.pjoc.pay.dbservice;

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
    comments = "Source: pay_db_service.proto")
public final class PayDatabaseServiceGrpc {

  private PayDatabaseServiceGrpc() {}

  public static final String SERVICE_NAME = "pay.PayDatabaseService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<pub.pjoc.pay.dbservice.PayDbService.PayOrder,
      pub.pjoc.channel.Common.ReturnResult> getSavePayOrderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SavePayOrder",
      requestType = pub.pjoc.pay.dbservice.PayDbService.PayOrder.class,
      responseType = pub.pjoc.channel.Common.ReturnResult.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<pub.pjoc.pay.dbservice.PayDbService.PayOrder,
      pub.pjoc.channel.Common.ReturnResult> getSavePayOrderMethod() {
    io.grpc.MethodDescriptor<pub.pjoc.pay.dbservice.PayDbService.PayOrder, pub.pjoc.channel.Common.ReturnResult> getSavePayOrderMethod;
    if ((getSavePayOrderMethod = PayDatabaseServiceGrpc.getSavePayOrderMethod) == null) {
      synchronized (PayDatabaseServiceGrpc.class) {
        if ((getSavePayOrderMethod = PayDatabaseServiceGrpc.getSavePayOrderMethod) == null) {
          PayDatabaseServiceGrpc.getSavePayOrderMethod = getSavePayOrderMethod =
              io.grpc.MethodDescriptor.<pub.pjoc.pay.dbservice.PayDbService.PayOrder, pub.pjoc.channel.Common.ReturnResult>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SavePayOrder"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  pub.pjoc.pay.dbservice.PayDbService.PayOrder.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  pub.pjoc.channel.Common.ReturnResult.getDefaultInstance()))
              .setSchemaDescriptor(new PayDatabaseServiceMethodDescriptorSupplier("SavePayOrder"))
              .build();
        }
      }
    }
    return getSavePayOrderMethod;
  }

  private static volatile io.grpc.MethodDescriptor<pub.pjoc.pay.dbservice.PayDbService.PayOrder,
      pub.pjoc.channel.Common.ReturnResult> getUpdatePayOrderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdatePayOrder",
      requestType = pub.pjoc.pay.dbservice.PayDbService.PayOrder.class,
      responseType = pub.pjoc.channel.Common.ReturnResult.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<pub.pjoc.pay.dbservice.PayDbService.PayOrder,
      pub.pjoc.channel.Common.ReturnResult> getUpdatePayOrderMethod() {
    io.grpc.MethodDescriptor<pub.pjoc.pay.dbservice.PayDbService.PayOrder, pub.pjoc.channel.Common.ReturnResult> getUpdatePayOrderMethod;
    if ((getUpdatePayOrderMethod = PayDatabaseServiceGrpc.getUpdatePayOrderMethod) == null) {
      synchronized (PayDatabaseServiceGrpc.class) {
        if ((getUpdatePayOrderMethod = PayDatabaseServiceGrpc.getUpdatePayOrderMethod) == null) {
          PayDatabaseServiceGrpc.getUpdatePayOrderMethod = getUpdatePayOrderMethod =
              io.grpc.MethodDescriptor.<pub.pjoc.pay.dbservice.PayDbService.PayOrder, pub.pjoc.channel.Common.ReturnResult>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdatePayOrder"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  pub.pjoc.pay.dbservice.PayDbService.PayOrder.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  pub.pjoc.channel.Common.ReturnResult.getDefaultInstance()))
              .setSchemaDescriptor(new PayDatabaseServiceMethodDescriptorSupplier("UpdatePayOrder"))
              .build();
        }
      }
    }
    return getUpdatePayOrderMethod;
  }

  private static volatile io.grpc.MethodDescriptor<pub.pjoc.pay.dbservice.PayDbService.PayOrder,
      pub.pjoc.pay.dbservice.PayDbService.PayOrderResponse> getFindPayOrderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FindPayOrder",
      requestType = pub.pjoc.pay.dbservice.PayDbService.PayOrder.class,
      responseType = pub.pjoc.pay.dbservice.PayDbService.PayOrderResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<pub.pjoc.pay.dbservice.PayDbService.PayOrder,
      pub.pjoc.pay.dbservice.PayDbService.PayOrderResponse> getFindPayOrderMethod() {
    io.grpc.MethodDescriptor<pub.pjoc.pay.dbservice.PayDbService.PayOrder, pub.pjoc.pay.dbservice.PayDbService.PayOrderResponse> getFindPayOrderMethod;
    if ((getFindPayOrderMethod = PayDatabaseServiceGrpc.getFindPayOrderMethod) == null) {
      synchronized (PayDatabaseServiceGrpc.class) {
        if ((getFindPayOrderMethod = PayDatabaseServiceGrpc.getFindPayOrderMethod) == null) {
          PayDatabaseServiceGrpc.getFindPayOrderMethod = getFindPayOrderMethod =
              io.grpc.MethodDescriptor.<pub.pjoc.pay.dbservice.PayDbService.PayOrder, pub.pjoc.pay.dbservice.PayDbService.PayOrderResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FindPayOrder"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  pub.pjoc.pay.dbservice.PayDbService.PayOrder.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  pub.pjoc.pay.dbservice.PayDbService.PayOrderResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PayDatabaseServiceMethodDescriptorSupplier("FindPayOrder"))
              .build();
        }
      }
    }
    return getFindPayOrderMethod;
  }

  private static volatile io.grpc.MethodDescriptor<pub.pjoc.pay.dbservice.PayDbService.PayOrderOk,
      pub.pjoc.channel.Common.ReturnResult> getSavePayOrderOkMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SavePayOrderOk",
      requestType = pub.pjoc.pay.dbservice.PayDbService.PayOrderOk.class,
      responseType = pub.pjoc.channel.Common.ReturnResult.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<pub.pjoc.pay.dbservice.PayDbService.PayOrderOk,
      pub.pjoc.channel.Common.ReturnResult> getSavePayOrderOkMethod() {
    io.grpc.MethodDescriptor<pub.pjoc.pay.dbservice.PayDbService.PayOrderOk, pub.pjoc.channel.Common.ReturnResult> getSavePayOrderOkMethod;
    if ((getSavePayOrderOkMethod = PayDatabaseServiceGrpc.getSavePayOrderOkMethod) == null) {
      synchronized (PayDatabaseServiceGrpc.class) {
        if ((getSavePayOrderOkMethod = PayDatabaseServiceGrpc.getSavePayOrderOkMethod) == null) {
          PayDatabaseServiceGrpc.getSavePayOrderOkMethod = getSavePayOrderOkMethod =
              io.grpc.MethodDescriptor.<pub.pjoc.pay.dbservice.PayDbService.PayOrderOk, pub.pjoc.channel.Common.ReturnResult>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SavePayOrderOk"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  pub.pjoc.pay.dbservice.PayDbService.PayOrderOk.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  pub.pjoc.channel.Common.ReturnResult.getDefaultInstance()))
              .setSchemaDescriptor(new PayDatabaseServiceMethodDescriptorSupplier("SavePayOrderOk"))
              .build();
        }
      }
    }
    return getSavePayOrderOkMethod;
  }

  private static volatile io.grpc.MethodDescriptor<pub.pjoc.pay.dbservice.PayDbService.PayOrderOk,
      pub.pjoc.channel.Common.ReturnResult> getUpdatePayOrderOkMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdatePayOrderOk",
      requestType = pub.pjoc.pay.dbservice.PayDbService.PayOrderOk.class,
      responseType = pub.pjoc.channel.Common.ReturnResult.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<pub.pjoc.pay.dbservice.PayDbService.PayOrderOk,
      pub.pjoc.channel.Common.ReturnResult> getUpdatePayOrderOkMethod() {
    io.grpc.MethodDescriptor<pub.pjoc.pay.dbservice.PayDbService.PayOrderOk, pub.pjoc.channel.Common.ReturnResult> getUpdatePayOrderOkMethod;
    if ((getUpdatePayOrderOkMethod = PayDatabaseServiceGrpc.getUpdatePayOrderOkMethod) == null) {
      synchronized (PayDatabaseServiceGrpc.class) {
        if ((getUpdatePayOrderOkMethod = PayDatabaseServiceGrpc.getUpdatePayOrderOkMethod) == null) {
          PayDatabaseServiceGrpc.getUpdatePayOrderOkMethod = getUpdatePayOrderOkMethod =
              io.grpc.MethodDescriptor.<pub.pjoc.pay.dbservice.PayDbService.PayOrderOk, pub.pjoc.channel.Common.ReturnResult>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdatePayOrderOk"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  pub.pjoc.pay.dbservice.PayDbService.PayOrderOk.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  pub.pjoc.channel.Common.ReturnResult.getDefaultInstance()))
              .setSchemaDescriptor(new PayDatabaseServiceMethodDescriptorSupplier("UpdatePayOrderOk"))
              .build();
        }
      }
    }
    return getUpdatePayOrderOkMethod;
  }

  private static volatile io.grpc.MethodDescriptor<pub.pjoc.pay.dbservice.PayDbService.PayOrderOk,
      pub.pjoc.pay.dbservice.PayDbService.PayOrderOkResponse> getFindPayOrderOkMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FindPayOrderOk",
      requestType = pub.pjoc.pay.dbservice.PayDbService.PayOrderOk.class,
      responseType = pub.pjoc.pay.dbservice.PayDbService.PayOrderOkResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<pub.pjoc.pay.dbservice.PayDbService.PayOrderOk,
      pub.pjoc.pay.dbservice.PayDbService.PayOrderOkResponse> getFindPayOrderOkMethod() {
    io.grpc.MethodDescriptor<pub.pjoc.pay.dbservice.PayDbService.PayOrderOk, pub.pjoc.pay.dbservice.PayDbService.PayOrderOkResponse> getFindPayOrderOkMethod;
    if ((getFindPayOrderOkMethod = PayDatabaseServiceGrpc.getFindPayOrderOkMethod) == null) {
      synchronized (PayDatabaseServiceGrpc.class) {
        if ((getFindPayOrderOkMethod = PayDatabaseServiceGrpc.getFindPayOrderOkMethod) == null) {
          PayDatabaseServiceGrpc.getFindPayOrderOkMethod = getFindPayOrderOkMethod =
              io.grpc.MethodDescriptor.<pub.pjoc.pay.dbservice.PayDbService.PayOrderOk, pub.pjoc.pay.dbservice.PayDbService.PayOrderOkResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FindPayOrderOk"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  pub.pjoc.pay.dbservice.PayDbService.PayOrderOk.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  pub.pjoc.pay.dbservice.PayDbService.PayOrderOkResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PayDatabaseServiceMethodDescriptorSupplier("FindPayOrderOk"))
              .build();
        }
      }
    }
    return getFindPayOrderOkMethod;
  }

  private static volatile io.grpc.MethodDescriptor<pub.pjoc.pay.dbservice.PayDbService.PayNotice,
      pub.pjoc.channel.Common.ReturnResult> getSavePayNoticeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SavePayNotice",
      requestType = pub.pjoc.pay.dbservice.PayDbService.PayNotice.class,
      responseType = pub.pjoc.channel.Common.ReturnResult.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<pub.pjoc.pay.dbservice.PayDbService.PayNotice,
      pub.pjoc.channel.Common.ReturnResult> getSavePayNoticeMethod() {
    io.grpc.MethodDescriptor<pub.pjoc.pay.dbservice.PayDbService.PayNotice, pub.pjoc.channel.Common.ReturnResult> getSavePayNoticeMethod;
    if ((getSavePayNoticeMethod = PayDatabaseServiceGrpc.getSavePayNoticeMethod) == null) {
      synchronized (PayDatabaseServiceGrpc.class) {
        if ((getSavePayNoticeMethod = PayDatabaseServiceGrpc.getSavePayNoticeMethod) == null) {
          PayDatabaseServiceGrpc.getSavePayNoticeMethod = getSavePayNoticeMethod =
              io.grpc.MethodDescriptor.<pub.pjoc.pay.dbservice.PayDbService.PayNotice, pub.pjoc.channel.Common.ReturnResult>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SavePayNotice"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  pub.pjoc.pay.dbservice.PayDbService.PayNotice.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  pub.pjoc.channel.Common.ReturnResult.getDefaultInstance()))
              .setSchemaDescriptor(new PayDatabaseServiceMethodDescriptorSupplier("SavePayNotice"))
              .build();
        }
      }
    }
    return getSavePayNoticeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<pub.pjoc.pay.dbservice.PayDbService.PayNotice,
      pub.pjoc.channel.Common.ReturnResult> getUpdatePayNoticeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdatePayNotice",
      requestType = pub.pjoc.pay.dbservice.PayDbService.PayNotice.class,
      responseType = pub.pjoc.channel.Common.ReturnResult.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<pub.pjoc.pay.dbservice.PayDbService.PayNotice,
      pub.pjoc.channel.Common.ReturnResult> getUpdatePayNoticeMethod() {
    io.grpc.MethodDescriptor<pub.pjoc.pay.dbservice.PayDbService.PayNotice, pub.pjoc.channel.Common.ReturnResult> getUpdatePayNoticeMethod;
    if ((getUpdatePayNoticeMethod = PayDatabaseServiceGrpc.getUpdatePayNoticeMethod) == null) {
      synchronized (PayDatabaseServiceGrpc.class) {
        if ((getUpdatePayNoticeMethod = PayDatabaseServiceGrpc.getUpdatePayNoticeMethod) == null) {
          PayDatabaseServiceGrpc.getUpdatePayNoticeMethod = getUpdatePayNoticeMethod =
              io.grpc.MethodDescriptor.<pub.pjoc.pay.dbservice.PayDbService.PayNotice, pub.pjoc.channel.Common.ReturnResult>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdatePayNotice"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  pub.pjoc.pay.dbservice.PayDbService.PayNotice.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  pub.pjoc.channel.Common.ReturnResult.getDefaultInstance()))
              .setSchemaDescriptor(new PayDatabaseServiceMethodDescriptorSupplier("UpdatePayNotice"))
              .build();
        }
      }
    }
    return getUpdatePayNoticeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<pub.pjoc.pay.dbservice.PayDbService.PayNotice,
      pub.pjoc.pay.dbservice.PayDbService.PayNoticeResponse> getFindPayNoticeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FindPayNotice",
      requestType = pub.pjoc.pay.dbservice.PayDbService.PayNotice.class,
      responseType = pub.pjoc.pay.dbservice.PayDbService.PayNoticeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<pub.pjoc.pay.dbservice.PayDbService.PayNotice,
      pub.pjoc.pay.dbservice.PayDbService.PayNoticeResponse> getFindPayNoticeMethod() {
    io.grpc.MethodDescriptor<pub.pjoc.pay.dbservice.PayDbService.PayNotice, pub.pjoc.pay.dbservice.PayDbService.PayNoticeResponse> getFindPayNoticeMethod;
    if ((getFindPayNoticeMethod = PayDatabaseServiceGrpc.getFindPayNoticeMethod) == null) {
      synchronized (PayDatabaseServiceGrpc.class) {
        if ((getFindPayNoticeMethod = PayDatabaseServiceGrpc.getFindPayNoticeMethod) == null) {
          PayDatabaseServiceGrpc.getFindPayNoticeMethod = getFindPayNoticeMethod =
              io.grpc.MethodDescriptor.<pub.pjoc.pay.dbservice.PayDbService.PayNotice, pub.pjoc.pay.dbservice.PayDbService.PayNoticeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FindPayNotice"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  pub.pjoc.pay.dbservice.PayDbService.PayNotice.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  pub.pjoc.pay.dbservice.PayDbService.PayNoticeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PayDatabaseServiceMethodDescriptorSupplier("FindPayNotice"))
              .build();
        }
      }
    }
    return getFindPayNoticeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<pub.pjoc.pay.dbservice.PayDbService.PayNotice,
      pub.pjoc.pay.dbservice.PayDbService.PayNoticeResponse> getFindPayNoticeLessThenTimeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FindPayNoticeLessThenTime",
      requestType = pub.pjoc.pay.dbservice.PayDbService.PayNotice.class,
      responseType = pub.pjoc.pay.dbservice.PayDbService.PayNoticeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<pub.pjoc.pay.dbservice.PayDbService.PayNotice,
      pub.pjoc.pay.dbservice.PayDbService.PayNoticeResponse> getFindPayNoticeLessThenTimeMethod() {
    io.grpc.MethodDescriptor<pub.pjoc.pay.dbservice.PayDbService.PayNotice, pub.pjoc.pay.dbservice.PayDbService.PayNoticeResponse> getFindPayNoticeLessThenTimeMethod;
    if ((getFindPayNoticeLessThenTimeMethod = PayDatabaseServiceGrpc.getFindPayNoticeLessThenTimeMethod) == null) {
      synchronized (PayDatabaseServiceGrpc.class) {
        if ((getFindPayNoticeLessThenTimeMethod = PayDatabaseServiceGrpc.getFindPayNoticeLessThenTimeMethod) == null) {
          PayDatabaseServiceGrpc.getFindPayNoticeLessThenTimeMethod = getFindPayNoticeLessThenTimeMethod =
              io.grpc.MethodDescriptor.<pub.pjoc.pay.dbservice.PayDbService.PayNotice, pub.pjoc.pay.dbservice.PayDbService.PayNoticeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FindPayNoticeLessThenTime"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  pub.pjoc.pay.dbservice.PayDbService.PayNotice.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  pub.pjoc.pay.dbservice.PayDbService.PayNoticeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PayDatabaseServiceMethodDescriptorSupplier("FindPayNoticeLessThenTime"))
              .build();
        }
      }
    }
    return getFindPayNoticeLessThenTimeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<pub.pjoc.pay.dbservice.PayDbService.PayNoticeOk,
      pub.pjoc.channel.Common.ReturnResult> getSavePayNotifyOkMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SavePayNotifyOk",
      requestType = pub.pjoc.pay.dbservice.PayDbService.PayNoticeOk.class,
      responseType = pub.pjoc.channel.Common.ReturnResult.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<pub.pjoc.pay.dbservice.PayDbService.PayNoticeOk,
      pub.pjoc.channel.Common.ReturnResult> getSavePayNotifyOkMethod() {
    io.grpc.MethodDescriptor<pub.pjoc.pay.dbservice.PayDbService.PayNoticeOk, pub.pjoc.channel.Common.ReturnResult> getSavePayNotifyOkMethod;
    if ((getSavePayNotifyOkMethod = PayDatabaseServiceGrpc.getSavePayNotifyOkMethod) == null) {
      synchronized (PayDatabaseServiceGrpc.class) {
        if ((getSavePayNotifyOkMethod = PayDatabaseServiceGrpc.getSavePayNotifyOkMethod) == null) {
          PayDatabaseServiceGrpc.getSavePayNotifyOkMethod = getSavePayNotifyOkMethod =
              io.grpc.MethodDescriptor.<pub.pjoc.pay.dbservice.PayDbService.PayNoticeOk, pub.pjoc.channel.Common.ReturnResult>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SavePayNotifyOk"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  pub.pjoc.pay.dbservice.PayDbService.PayNoticeOk.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  pub.pjoc.channel.Common.ReturnResult.getDefaultInstance()))
              .setSchemaDescriptor(new PayDatabaseServiceMethodDescriptorSupplier("SavePayNotifyOk"))
              .build();
        }
      }
    }
    return getSavePayNotifyOkMethod;
  }

  private static volatile io.grpc.MethodDescriptor<pub.pjoc.pay.dbservice.PayDbService.PayNoticeOk,
      pub.pjoc.pay.dbservice.PayDbService.PayNoticeOkResponse> getFindPayNotifyOkMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FindPayNotifyOk",
      requestType = pub.pjoc.pay.dbservice.PayDbService.PayNoticeOk.class,
      responseType = pub.pjoc.pay.dbservice.PayDbService.PayNoticeOkResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<pub.pjoc.pay.dbservice.PayDbService.PayNoticeOk,
      pub.pjoc.pay.dbservice.PayDbService.PayNoticeOkResponse> getFindPayNotifyOkMethod() {
    io.grpc.MethodDescriptor<pub.pjoc.pay.dbservice.PayDbService.PayNoticeOk, pub.pjoc.pay.dbservice.PayDbService.PayNoticeOkResponse> getFindPayNotifyOkMethod;
    if ((getFindPayNotifyOkMethod = PayDatabaseServiceGrpc.getFindPayNotifyOkMethod) == null) {
      synchronized (PayDatabaseServiceGrpc.class) {
        if ((getFindPayNotifyOkMethod = PayDatabaseServiceGrpc.getFindPayNotifyOkMethod) == null) {
          PayDatabaseServiceGrpc.getFindPayNotifyOkMethod = getFindPayNotifyOkMethod =
              io.grpc.MethodDescriptor.<pub.pjoc.pay.dbservice.PayDbService.PayNoticeOk, pub.pjoc.pay.dbservice.PayDbService.PayNoticeOkResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FindPayNotifyOk"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  pub.pjoc.pay.dbservice.PayDbService.PayNoticeOk.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  pub.pjoc.pay.dbservice.PayDbService.PayNoticeOkResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PayDatabaseServiceMethodDescriptorSupplier("FindPayNotifyOk"))
              .build();
        }
      }
    }
    return getFindPayNotifyOkMethod;
  }

  private static volatile io.grpc.MethodDescriptor<pub.pjoc.pay.dbservice.PayDbService.PayNoticeOk,
      pub.pjoc.channel.Common.ReturnResult> getUpdatePayNoticeOkMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdatePayNoticeOk",
      requestType = pub.pjoc.pay.dbservice.PayDbService.PayNoticeOk.class,
      responseType = pub.pjoc.channel.Common.ReturnResult.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<pub.pjoc.pay.dbservice.PayDbService.PayNoticeOk,
      pub.pjoc.channel.Common.ReturnResult> getUpdatePayNoticeOkMethod() {
    io.grpc.MethodDescriptor<pub.pjoc.pay.dbservice.PayDbService.PayNoticeOk, pub.pjoc.channel.Common.ReturnResult> getUpdatePayNoticeOkMethod;
    if ((getUpdatePayNoticeOkMethod = PayDatabaseServiceGrpc.getUpdatePayNoticeOkMethod) == null) {
      synchronized (PayDatabaseServiceGrpc.class) {
        if ((getUpdatePayNoticeOkMethod = PayDatabaseServiceGrpc.getUpdatePayNoticeOkMethod) == null) {
          PayDatabaseServiceGrpc.getUpdatePayNoticeOkMethod = getUpdatePayNoticeOkMethod =
              io.grpc.MethodDescriptor.<pub.pjoc.pay.dbservice.PayDbService.PayNoticeOk, pub.pjoc.channel.Common.ReturnResult>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdatePayNoticeOk"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  pub.pjoc.pay.dbservice.PayDbService.PayNoticeOk.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  pub.pjoc.channel.Common.ReturnResult.getDefaultInstance()))
              .setSchemaDescriptor(new PayDatabaseServiceMethodDescriptorSupplier("UpdatePayNoticeOk"))
              .build();
        }
      }
    }
    return getUpdatePayNoticeOkMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PayDatabaseServiceStub newStub(io.grpc.Channel channel) {
    return new PayDatabaseServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PayDatabaseServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new PayDatabaseServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PayDatabaseServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new PayDatabaseServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class PayDatabaseServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void savePayOrder(pub.pjoc.pay.dbservice.PayDbService.PayOrder request,
        io.grpc.stub.StreamObserver<pub.pjoc.channel.Common.ReturnResult> responseObserver) {
      asyncUnimplementedUnaryCall(getSavePayOrderMethod(), responseObserver);
    }

    /**
     */
    public void updatePayOrder(pub.pjoc.pay.dbservice.PayDbService.PayOrder request,
        io.grpc.stub.StreamObserver<pub.pjoc.channel.Common.ReturnResult> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdatePayOrderMethod(), responseObserver);
    }

    /**
     */
    public void findPayOrder(pub.pjoc.pay.dbservice.PayDbService.PayOrder request,
        io.grpc.stub.StreamObserver<pub.pjoc.pay.dbservice.PayDbService.PayOrderResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getFindPayOrderMethod(), responseObserver);
    }

    /**
     */
    public void savePayOrderOk(pub.pjoc.pay.dbservice.PayDbService.PayOrderOk request,
        io.grpc.stub.StreamObserver<pub.pjoc.channel.Common.ReturnResult> responseObserver) {
      asyncUnimplementedUnaryCall(getSavePayOrderOkMethod(), responseObserver);
    }

    /**
     */
    public void updatePayOrderOk(pub.pjoc.pay.dbservice.PayDbService.PayOrderOk request,
        io.grpc.stub.StreamObserver<pub.pjoc.channel.Common.ReturnResult> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdatePayOrderOkMethod(), responseObserver);
    }

    /**
     */
    public void findPayOrderOk(pub.pjoc.pay.dbservice.PayDbService.PayOrderOk request,
        io.grpc.stub.StreamObserver<pub.pjoc.pay.dbservice.PayDbService.PayOrderOkResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getFindPayOrderOkMethod(), responseObserver);
    }

    /**
     */
    public void savePayNotice(pub.pjoc.pay.dbservice.PayDbService.PayNotice request,
        io.grpc.stub.StreamObserver<pub.pjoc.channel.Common.ReturnResult> responseObserver) {
      asyncUnimplementedUnaryCall(getSavePayNoticeMethod(), responseObserver);
    }

    /**
     */
    public void updatePayNotice(pub.pjoc.pay.dbservice.PayDbService.PayNotice request,
        io.grpc.stub.StreamObserver<pub.pjoc.channel.Common.ReturnResult> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdatePayNoticeMethod(), responseObserver);
    }

    /**
     */
    public void findPayNotice(pub.pjoc.pay.dbservice.PayDbService.PayNotice request,
        io.grpc.stub.StreamObserver<pub.pjoc.pay.dbservice.PayDbService.PayNoticeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getFindPayNoticeMethod(), responseObserver);
    }

    /**
     */
    public void findPayNoticeLessThenTime(pub.pjoc.pay.dbservice.PayDbService.PayNotice request,
        io.grpc.stub.StreamObserver<pub.pjoc.pay.dbservice.PayDbService.PayNoticeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getFindPayNoticeLessThenTimeMethod(), responseObserver);
    }

    /**
     */
    public void savePayNotifyOk(pub.pjoc.pay.dbservice.PayDbService.PayNoticeOk request,
        io.grpc.stub.StreamObserver<pub.pjoc.channel.Common.ReturnResult> responseObserver) {
      asyncUnimplementedUnaryCall(getSavePayNotifyOkMethod(), responseObserver);
    }

    /**
     */
    public void findPayNotifyOk(pub.pjoc.pay.dbservice.PayDbService.PayNoticeOk request,
        io.grpc.stub.StreamObserver<pub.pjoc.pay.dbservice.PayDbService.PayNoticeOkResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getFindPayNotifyOkMethod(), responseObserver);
    }

    /**
     */
    public void updatePayNoticeOk(pub.pjoc.pay.dbservice.PayDbService.PayNoticeOk request,
        io.grpc.stub.StreamObserver<pub.pjoc.channel.Common.ReturnResult> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdatePayNoticeOkMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSavePayOrderMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                pub.pjoc.pay.dbservice.PayDbService.PayOrder,
                pub.pjoc.channel.Common.ReturnResult>(
                  this, METHODID_SAVE_PAY_ORDER)))
          .addMethod(
            getUpdatePayOrderMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                pub.pjoc.pay.dbservice.PayDbService.PayOrder,
                pub.pjoc.channel.Common.ReturnResult>(
                  this, METHODID_UPDATE_PAY_ORDER)))
          .addMethod(
            getFindPayOrderMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                pub.pjoc.pay.dbservice.PayDbService.PayOrder,
                pub.pjoc.pay.dbservice.PayDbService.PayOrderResponse>(
                  this, METHODID_FIND_PAY_ORDER)))
          .addMethod(
            getSavePayOrderOkMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                pub.pjoc.pay.dbservice.PayDbService.PayOrderOk,
                pub.pjoc.channel.Common.ReturnResult>(
                  this, METHODID_SAVE_PAY_ORDER_OK)))
          .addMethod(
            getUpdatePayOrderOkMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                pub.pjoc.pay.dbservice.PayDbService.PayOrderOk,
                pub.pjoc.channel.Common.ReturnResult>(
                  this, METHODID_UPDATE_PAY_ORDER_OK)))
          .addMethod(
            getFindPayOrderOkMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                pub.pjoc.pay.dbservice.PayDbService.PayOrderOk,
                pub.pjoc.pay.dbservice.PayDbService.PayOrderOkResponse>(
                  this, METHODID_FIND_PAY_ORDER_OK)))
          .addMethod(
            getSavePayNoticeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                pub.pjoc.pay.dbservice.PayDbService.PayNotice,
                pub.pjoc.channel.Common.ReturnResult>(
                  this, METHODID_SAVE_PAY_NOTICE)))
          .addMethod(
            getUpdatePayNoticeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                pub.pjoc.pay.dbservice.PayDbService.PayNotice,
                pub.pjoc.channel.Common.ReturnResult>(
                  this, METHODID_UPDATE_PAY_NOTICE)))
          .addMethod(
            getFindPayNoticeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                pub.pjoc.pay.dbservice.PayDbService.PayNotice,
                pub.pjoc.pay.dbservice.PayDbService.PayNoticeResponse>(
                  this, METHODID_FIND_PAY_NOTICE)))
          .addMethod(
            getFindPayNoticeLessThenTimeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                pub.pjoc.pay.dbservice.PayDbService.PayNotice,
                pub.pjoc.pay.dbservice.PayDbService.PayNoticeResponse>(
                  this, METHODID_FIND_PAY_NOTICE_LESS_THEN_TIME)))
          .addMethod(
            getSavePayNotifyOkMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                pub.pjoc.pay.dbservice.PayDbService.PayNoticeOk,
                pub.pjoc.channel.Common.ReturnResult>(
                  this, METHODID_SAVE_PAY_NOTIFY_OK)))
          .addMethod(
            getFindPayNotifyOkMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                pub.pjoc.pay.dbservice.PayDbService.PayNoticeOk,
                pub.pjoc.pay.dbservice.PayDbService.PayNoticeOkResponse>(
                  this, METHODID_FIND_PAY_NOTIFY_OK)))
          .addMethod(
            getUpdatePayNoticeOkMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                pub.pjoc.pay.dbservice.PayDbService.PayNoticeOk,
                pub.pjoc.channel.Common.ReturnResult>(
                  this, METHODID_UPDATE_PAY_NOTICE_OK)))
          .build();
    }
  }

  /**
   */
  public static final class PayDatabaseServiceStub extends io.grpc.stub.AbstractStub<PayDatabaseServiceStub> {
    private PayDatabaseServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PayDatabaseServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PayDatabaseServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PayDatabaseServiceStub(channel, callOptions);
    }

    /**
     */
    public void savePayOrder(pub.pjoc.pay.dbservice.PayDbService.PayOrder request,
        io.grpc.stub.StreamObserver<pub.pjoc.channel.Common.ReturnResult> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSavePayOrderMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updatePayOrder(pub.pjoc.pay.dbservice.PayDbService.PayOrder request,
        io.grpc.stub.StreamObserver<pub.pjoc.channel.Common.ReturnResult> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdatePayOrderMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void findPayOrder(pub.pjoc.pay.dbservice.PayDbService.PayOrder request,
        io.grpc.stub.StreamObserver<pub.pjoc.pay.dbservice.PayDbService.PayOrderResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getFindPayOrderMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void savePayOrderOk(pub.pjoc.pay.dbservice.PayDbService.PayOrderOk request,
        io.grpc.stub.StreamObserver<pub.pjoc.channel.Common.ReturnResult> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSavePayOrderOkMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updatePayOrderOk(pub.pjoc.pay.dbservice.PayDbService.PayOrderOk request,
        io.grpc.stub.StreamObserver<pub.pjoc.channel.Common.ReturnResult> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdatePayOrderOkMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void findPayOrderOk(pub.pjoc.pay.dbservice.PayDbService.PayOrderOk request,
        io.grpc.stub.StreamObserver<pub.pjoc.pay.dbservice.PayDbService.PayOrderOkResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getFindPayOrderOkMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void savePayNotice(pub.pjoc.pay.dbservice.PayDbService.PayNotice request,
        io.grpc.stub.StreamObserver<pub.pjoc.channel.Common.ReturnResult> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSavePayNoticeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updatePayNotice(pub.pjoc.pay.dbservice.PayDbService.PayNotice request,
        io.grpc.stub.StreamObserver<pub.pjoc.channel.Common.ReturnResult> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdatePayNoticeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void findPayNotice(pub.pjoc.pay.dbservice.PayDbService.PayNotice request,
        io.grpc.stub.StreamObserver<pub.pjoc.pay.dbservice.PayDbService.PayNoticeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getFindPayNoticeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void findPayNoticeLessThenTime(pub.pjoc.pay.dbservice.PayDbService.PayNotice request,
        io.grpc.stub.StreamObserver<pub.pjoc.pay.dbservice.PayDbService.PayNoticeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getFindPayNoticeLessThenTimeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void savePayNotifyOk(pub.pjoc.pay.dbservice.PayDbService.PayNoticeOk request,
        io.grpc.stub.StreamObserver<pub.pjoc.channel.Common.ReturnResult> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSavePayNotifyOkMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void findPayNotifyOk(pub.pjoc.pay.dbservice.PayDbService.PayNoticeOk request,
        io.grpc.stub.StreamObserver<pub.pjoc.pay.dbservice.PayDbService.PayNoticeOkResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getFindPayNotifyOkMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updatePayNoticeOk(pub.pjoc.pay.dbservice.PayDbService.PayNoticeOk request,
        io.grpc.stub.StreamObserver<pub.pjoc.channel.Common.ReturnResult> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdatePayNoticeOkMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class PayDatabaseServiceBlockingStub extends io.grpc.stub.AbstractStub<PayDatabaseServiceBlockingStub> {
    private PayDatabaseServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PayDatabaseServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PayDatabaseServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PayDatabaseServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public pub.pjoc.channel.Common.ReturnResult savePayOrder(pub.pjoc.pay.dbservice.PayDbService.PayOrder request) {
      return blockingUnaryCall(
          getChannel(), getSavePayOrderMethod(), getCallOptions(), request);
    }

    /**
     */
    public pub.pjoc.channel.Common.ReturnResult updatePayOrder(pub.pjoc.pay.dbservice.PayDbService.PayOrder request) {
      return blockingUnaryCall(
          getChannel(), getUpdatePayOrderMethod(), getCallOptions(), request);
    }

    /**
     */
    public pub.pjoc.pay.dbservice.PayDbService.PayOrderResponse findPayOrder(pub.pjoc.pay.dbservice.PayDbService.PayOrder request) {
      return blockingUnaryCall(
          getChannel(), getFindPayOrderMethod(), getCallOptions(), request);
    }

    /**
     */
    public pub.pjoc.channel.Common.ReturnResult savePayOrderOk(pub.pjoc.pay.dbservice.PayDbService.PayOrderOk request) {
      return blockingUnaryCall(
          getChannel(), getSavePayOrderOkMethod(), getCallOptions(), request);
    }

    /**
     */
    public pub.pjoc.channel.Common.ReturnResult updatePayOrderOk(pub.pjoc.pay.dbservice.PayDbService.PayOrderOk request) {
      return blockingUnaryCall(
          getChannel(), getUpdatePayOrderOkMethod(), getCallOptions(), request);
    }

    /**
     */
    public pub.pjoc.pay.dbservice.PayDbService.PayOrderOkResponse findPayOrderOk(pub.pjoc.pay.dbservice.PayDbService.PayOrderOk request) {
      return blockingUnaryCall(
          getChannel(), getFindPayOrderOkMethod(), getCallOptions(), request);
    }

    /**
     */
    public pub.pjoc.channel.Common.ReturnResult savePayNotice(pub.pjoc.pay.dbservice.PayDbService.PayNotice request) {
      return blockingUnaryCall(
          getChannel(), getSavePayNoticeMethod(), getCallOptions(), request);
    }

    /**
     */
    public pub.pjoc.channel.Common.ReturnResult updatePayNotice(pub.pjoc.pay.dbservice.PayDbService.PayNotice request) {
      return blockingUnaryCall(
          getChannel(), getUpdatePayNoticeMethod(), getCallOptions(), request);
    }

    /**
     */
    public pub.pjoc.pay.dbservice.PayDbService.PayNoticeResponse findPayNotice(pub.pjoc.pay.dbservice.PayDbService.PayNotice request) {
      return blockingUnaryCall(
          getChannel(), getFindPayNoticeMethod(), getCallOptions(), request);
    }

    /**
     */
    public pub.pjoc.pay.dbservice.PayDbService.PayNoticeResponse findPayNoticeLessThenTime(pub.pjoc.pay.dbservice.PayDbService.PayNotice request) {
      return blockingUnaryCall(
          getChannel(), getFindPayNoticeLessThenTimeMethod(), getCallOptions(), request);
    }

    /**
     */
    public pub.pjoc.channel.Common.ReturnResult savePayNotifyOk(pub.pjoc.pay.dbservice.PayDbService.PayNoticeOk request) {
      return blockingUnaryCall(
          getChannel(), getSavePayNotifyOkMethod(), getCallOptions(), request);
    }

    /**
     */
    public pub.pjoc.pay.dbservice.PayDbService.PayNoticeOkResponse findPayNotifyOk(pub.pjoc.pay.dbservice.PayDbService.PayNoticeOk request) {
      return blockingUnaryCall(
          getChannel(), getFindPayNotifyOkMethod(), getCallOptions(), request);
    }

    /**
     */
    public pub.pjoc.channel.Common.ReturnResult updatePayNoticeOk(pub.pjoc.pay.dbservice.PayDbService.PayNoticeOk request) {
      return blockingUnaryCall(
          getChannel(), getUpdatePayNoticeOkMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class PayDatabaseServiceFutureStub extends io.grpc.stub.AbstractStub<PayDatabaseServiceFutureStub> {
    private PayDatabaseServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PayDatabaseServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PayDatabaseServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PayDatabaseServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<pub.pjoc.channel.Common.ReturnResult> savePayOrder(
        pub.pjoc.pay.dbservice.PayDbService.PayOrder request) {
      return futureUnaryCall(
          getChannel().newCall(getSavePayOrderMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<pub.pjoc.channel.Common.ReturnResult> updatePayOrder(
        pub.pjoc.pay.dbservice.PayDbService.PayOrder request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdatePayOrderMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<pub.pjoc.pay.dbservice.PayDbService.PayOrderResponse> findPayOrder(
        pub.pjoc.pay.dbservice.PayDbService.PayOrder request) {
      return futureUnaryCall(
          getChannel().newCall(getFindPayOrderMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<pub.pjoc.channel.Common.ReturnResult> savePayOrderOk(
        pub.pjoc.pay.dbservice.PayDbService.PayOrderOk request) {
      return futureUnaryCall(
          getChannel().newCall(getSavePayOrderOkMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<pub.pjoc.channel.Common.ReturnResult> updatePayOrderOk(
        pub.pjoc.pay.dbservice.PayDbService.PayOrderOk request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdatePayOrderOkMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<pub.pjoc.pay.dbservice.PayDbService.PayOrderOkResponse> findPayOrderOk(
        pub.pjoc.pay.dbservice.PayDbService.PayOrderOk request) {
      return futureUnaryCall(
          getChannel().newCall(getFindPayOrderOkMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<pub.pjoc.channel.Common.ReturnResult> savePayNotice(
        pub.pjoc.pay.dbservice.PayDbService.PayNotice request) {
      return futureUnaryCall(
          getChannel().newCall(getSavePayNoticeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<pub.pjoc.channel.Common.ReturnResult> updatePayNotice(
        pub.pjoc.pay.dbservice.PayDbService.PayNotice request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdatePayNoticeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<pub.pjoc.pay.dbservice.PayDbService.PayNoticeResponse> findPayNotice(
        pub.pjoc.pay.dbservice.PayDbService.PayNotice request) {
      return futureUnaryCall(
          getChannel().newCall(getFindPayNoticeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<pub.pjoc.pay.dbservice.PayDbService.PayNoticeResponse> findPayNoticeLessThenTime(
        pub.pjoc.pay.dbservice.PayDbService.PayNotice request) {
      return futureUnaryCall(
          getChannel().newCall(getFindPayNoticeLessThenTimeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<pub.pjoc.channel.Common.ReturnResult> savePayNotifyOk(
        pub.pjoc.pay.dbservice.PayDbService.PayNoticeOk request) {
      return futureUnaryCall(
          getChannel().newCall(getSavePayNotifyOkMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<pub.pjoc.pay.dbservice.PayDbService.PayNoticeOkResponse> findPayNotifyOk(
        pub.pjoc.pay.dbservice.PayDbService.PayNoticeOk request) {
      return futureUnaryCall(
          getChannel().newCall(getFindPayNotifyOkMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<pub.pjoc.channel.Common.ReturnResult> updatePayNoticeOk(
        pub.pjoc.pay.dbservice.PayDbService.PayNoticeOk request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdatePayNoticeOkMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SAVE_PAY_ORDER = 0;
  private static final int METHODID_UPDATE_PAY_ORDER = 1;
  private static final int METHODID_FIND_PAY_ORDER = 2;
  private static final int METHODID_SAVE_PAY_ORDER_OK = 3;
  private static final int METHODID_UPDATE_PAY_ORDER_OK = 4;
  private static final int METHODID_FIND_PAY_ORDER_OK = 5;
  private static final int METHODID_SAVE_PAY_NOTICE = 6;
  private static final int METHODID_UPDATE_PAY_NOTICE = 7;
  private static final int METHODID_FIND_PAY_NOTICE = 8;
  private static final int METHODID_FIND_PAY_NOTICE_LESS_THEN_TIME = 9;
  private static final int METHODID_SAVE_PAY_NOTIFY_OK = 10;
  private static final int METHODID_FIND_PAY_NOTIFY_OK = 11;
  private static final int METHODID_UPDATE_PAY_NOTICE_OK = 12;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final PayDatabaseServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(PayDatabaseServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SAVE_PAY_ORDER:
          serviceImpl.savePayOrder((pub.pjoc.pay.dbservice.PayDbService.PayOrder) request,
              (io.grpc.stub.StreamObserver<pub.pjoc.channel.Common.ReturnResult>) responseObserver);
          break;
        case METHODID_UPDATE_PAY_ORDER:
          serviceImpl.updatePayOrder((pub.pjoc.pay.dbservice.PayDbService.PayOrder) request,
              (io.grpc.stub.StreamObserver<pub.pjoc.channel.Common.ReturnResult>) responseObserver);
          break;
        case METHODID_FIND_PAY_ORDER:
          serviceImpl.findPayOrder((pub.pjoc.pay.dbservice.PayDbService.PayOrder) request,
              (io.grpc.stub.StreamObserver<pub.pjoc.pay.dbservice.PayDbService.PayOrderResponse>) responseObserver);
          break;
        case METHODID_SAVE_PAY_ORDER_OK:
          serviceImpl.savePayOrderOk((pub.pjoc.pay.dbservice.PayDbService.PayOrderOk) request,
              (io.grpc.stub.StreamObserver<pub.pjoc.channel.Common.ReturnResult>) responseObserver);
          break;
        case METHODID_UPDATE_PAY_ORDER_OK:
          serviceImpl.updatePayOrderOk((pub.pjoc.pay.dbservice.PayDbService.PayOrderOk) request,
              (io.grpc.stub.StreamObserver<pub.pjoc.channel.Common.ReturnResult>) responseObserver);
          break;
        case METHODID_FIND_PAY_ORDER_OK:
          serviceImpl.findPayOrderOk((pub.pjoc.pay.dbservice.PayDbService.PayOrderOk) request,
              (io.grpc.stub.StreamObserver<pub.pjoc.pay.dbservice.PayDbService.PayOrderOkResponse>) responseObserver);
          break;
        case METHODID_SAVE_PAY_NOTICE:
          serviceImpl.savePayNotice((pub.pjoc.pay.dbservice.PayDbService.PayNotice) request,
              (io.grpc.stub.StreamObserver<pub.pjoc.channel.Common.ReturnResult>) responseObserver);
          break;
        case METHODID_UPDATE_PAY_NOTICE:
          serviceImpl.updatePayNotice((pub.pjoc.pay.dbservice.PayDbService.PayNotice) request,
              (io.grpc.stub.StreamObserver<pub.pjoc.channel.Common.ReturnResult>) responseObserver);
          break;
        case METHODID_FIND_PAY_NOTICE:
          serviceImpl.findPayNotice((pub.pjoc.pay.dbservice.PayDbService.PayNotice) request,
              (io.grpc.stub.StreamObserver<pub.pjoc.pay.dbservice.PayDbService.PayNoticeResponse>) responseObserver);
          break;
        case METHODID_FIND_PAY_NOTICE_LESS_THEN_TIME:
          serviceImpl.findPayNoticeLessThenTime((pub.pjoc.pay.dbservice.PayDbService.PayNotice) request,
              (io.grpc.stub.StreamObserver<pub.pjoc.pay.dbservice.PayDbService.PayNoticeResponse>) responseObserver);
          break;
        case METHODID_SAVE_PAY_NOTIFY_OK:
          serviceImpl.savePayNotifyOk((pub.pjoc.pay.dbservice.PayDbService.PayNoticeOk) request,
              (io.grpc.stub.StreamObserver<pub.pjoc.channel.Common.ReturnResult>) responseObserver);
          break;
        case METHODID_FIND_PAY_NOTIFY_OK:
          serviceImpl.findPayNotifyOk((pub.pjoc.pay.dbservice.PayDbService.PayNoticeOk) request,
              (io.grpc.stub.StreamObserver<pub.pjoc.pay.dbservice.PayDbService.PayNoticeOkResponse>) responseObserver);
          break;
        case METHODID_UPDATE_PAY_NOTICE_OK:
          serviceImpl.updatePayNoticeOk((pub.pjoc.pay.dbservice.PayDbService.PayNoticeOk) request,
              (io.grpc.stub.StreamObserver<pub.pjoc.channel.Common.ReturnResult>) responseObserver);
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

  private static abstract class PayDatabaseServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PayDatabaseServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return pub.pjoc.pay.dbservice.PayDbService.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("PayDatabaseService");
    }
  }

  private static final class PayDatabaseServiceFileDescriptorSupplier
      extends PayDatabaseServiceBaseDescriptorSupplier {
    PayDatabaseServiceFileDescriptorSupplier() {}
  }

  private static final class PayDatabaseServiceMethodDescriptorSupplier
      extends PayDatabaseServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    PayDatabaseServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (PayDatabaseServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PayDatabaseServiceFileDescriptorSupplier())
              .addMethod(getSavePayOrderMethod())
              .addMethod(getUpdatePayOrderMethod())
              .addMethod(getFindPayOrderMethod())
              .addMethod(getSavePayOrderOkMethod())
              .addMethod(getUpdatePayOrderOkMethod())
              .addMethod(getFindPayOrderOkMethod())
              .addMethod(getSavePayNoticeMethod())
              .addMethod(getUpdatePayNoticeMethod())
              .addMethod(getFindPayNoticeMethod())
              .addMethod(getFindPayNoticeLessThenTimeMethod())
              .addMethod(getSavePayNotifyOkMethod())
              .addMethod(getFindPayNotifyOkMethod())
              .addMethod(getUpdatePayNoticeOkMethod())
              .build();
        }
      }
    }
    return result;
  }
}
