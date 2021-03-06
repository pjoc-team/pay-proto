// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.25.0-devel
// 	protoc        v3.13.0
// source: pay_gateway.proto

package pay

import (
	context "context"
	_ "github.com/envoyproxy/protoc-gen-validate/validate"
	_ "github.com/golang/protobuf/ptypes/timestamp"
	_ "github.com/grpc-ecosystem/grpc-gateway/v2/protoc-gen-openapiv2/options"
	_ "google.golang.org/genproto/googleapis/api/annotations"
	grpc "google.golang.org/grpc"
	codes "google.golang.org/grpc/codes"
	status "google.golang.org/grpc/status"
	protoreflect "google.golang.org/protobuf/reflect/protoreflect"
	protoimpl "google.golang.org/protobuf/runtime/protoimpl"
	reflect "reflect"
	sync "sync"
)

const (
	// Verify that this generated code is sufficiently up-to-date.
	_ = protoimpl.EnforceVersion(20 - protoimpl.MinVersion)
	// Verify that runtime/protoimpl is sufficiently up-to-date.
	_ = protoimpl.EnforceVersion(protoimpl.MaxVersion - 20)
)

type PayRequest struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// 版本
	Version string `protobuf:"bytes,100,opt,name=version,proto3" json:"version,omitempty"`
	// 业务订单号
	OutTradeNo string `protobuf:"bytes,1,opt,name=out_trade_no,json=outTradeNo,proto3" json:"out_trade_no,omitempty"`
	// 支付金额（分）
	PayAmount uint64 `protobuf:"varint,3,opt,name=pay_amount,json=payAmount,proto3" json:"pay_amount,omitempty"`
	// 币种
	Currency string `protobuf:"bytes,20,opt,name=currency,proto3" json:"currency,omitempty"`
	// 接收通知的地址，不能带参数（即：不能包含问号）
	NotifyUrl string `protobuf:"bytes,4,opt,name=notify_url,json=notifyUrl,proto3" json:"notify_url,omitempty"`
	// 支付后跳转的前端地址
	ReturnUrl string `protobuf:"bytes,5,opt,name=return_url,json=returnUrl,proto3" json:"return_url,omitempty"`
	// 系统给商户分配的app_id
	AppId string `protobuf:"bytes,6,opt,name=app_id,json=appId,proto3" json:"app_id,omitempty"`
	// 加密方法，RSA和MD5，默认RSA
	SignType string `protobuf:"bytes,7,opt,name=sign_type,json=signType,proto3" json:"sign_type,omitempty"`
	// 签名
	Sign string `protobuf:"bytes,14,opt,name=sign,proto3" json:"sign,omitempty"`
	// 业务方下单时间，时间格式: https://tools.ietf.org/html/rfc3339#section-5.6 例如：2021-01-01T01:01:01.001+08:00
	OrderTime string `protobuf:"bytes,8,opt,name=order_time,json=orderTime,proto3" json:"order_time,omitempty"`
	// 发起支付的用户ip
	UserIp string `protobuf:"bytes,9,opt,name=user_ip,json=userIp,proto3" json:"user_ip,omitempty"`
	// 用户在业务系统的id
	UserId string `protobuf:"bytes,18,opt,name=user_id,json=userId,proto3" json:"user_id,omitempty"`
	// 支付者账号，可选
	PayerAccount string `protobuf:"bytes,10,opt,name=payer_account,json=payerAccount,proto3" json:"payer_account,omitempty"`
	// 业务系统的产品id
	ProductId string `protobuf:"bytes,11,opt,name=product_id,json=productId,proto3" json:"product_id,omitempty"`
	// 商品名称
	ProductName string `protobuf:"bytes,12,opt,name=product_name,json=productName,proto3" json:"product_name,omitempty"`
	// 商品描述
	ProductDescribe string `protobuf:"bytes,13,opt,name=product_describe,json=productDescribe,proto3" json:"product_describe,omitempty"`
	// 参数编码，只允许utf-8编码；签名时一定要使用该编码获取字节然后再进行签名
	Charset string `protobuf:"bytes,15,opt,name=charset,proto3" json:"charset,omitempty"`
	// 回调业务系统时需要带上的字符串
	CallbackJson string `protobuf:"bytes,16,opt,name=callback_json,json=callbackJson,proto3" json:"callback_json,omitempty"`
	// 扩展json
	ExtJson string `protobuf:"bytes,17,opt,name=ext_json,json=extJson,proto3" json:"ext_json,omitempty"`
	// 渠道id（非必须），如果未指定method，系统会根据method来找到可用的channel_id
	ChannelId string `protobuf:"bytes,19,opt,name=channel_id,json=channelId,proto3" json:"channel_id,omitempty"`
	// 例如：二维码支付，银联支付等。
	Method Method `protobuf:"varint,98,opt,name=method,proto3,enum=pay.Method" json:"method,omitempty"`
}

func (x *PayRequest) Reset() {
	*x = PayRequest{}
	if protoimpl.UnsafeEnabled {
		mi := &file_pay_gateway_proto_msgTypes[0]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *PayRequest) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*PayRequest) ProtoMessage() {}

func (x *PayRequest) ProtoReflect() protoreflect.Message {
	mi := &file_pay_gateway_proto_msgTypes[0]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use PayRequest.ProtoReflect.Descriptor instead.
func (*PayRequest) Descriptor() ([]byte, []int) {
	return file_pay_gateway_proto_rawDescGZIP(), []int{0}
}

func (x *PayRequest) GetVersion() string {
	if x != nil {
		return x.Version
	}
	return ""
}

func (x *PayRequest) GetOutTradeNo() string {
	if x != nil {
		return x.OutTradeNo
	}
	return ""
}

func (x *PayRequest) GetPayAmount() uint64 {
	if x != nil {
		return x.PayAmount
	}
	return 0
}

func (x *PayRequest) GetCurrency() string {
	if x != nil {
		return x.Currency
	}
	return ""
}

func (x *PayRequest) GetNotifyUrl() string {
	if x != nil {
		return x.NotifyUrl
	}
	return ""
}

func (x *PayRequest) GetReturnUrl() string {
	if x != nil {
		return x.ReturnUrl
	}
	return ""
}

func (x *PayRequest) GetAppId() string {
	if x != nil {
		return x.AppId
	}
	return ""
}

func (x *PayRequest) GetSignType() string {
	if x != nil {
		return x.SignType
	}
	return ""
}

func (x *PayRequest) GetSign() string {
	if x != nil {
		return x.Sign
	}
	return ""
}

func (x *PayRequest) GetOrderTime() string {
	if x != nil {
		return x.OrderTime
	}
	return ""
}

func (x *PayRequest) GetUserIp() string {
	if x != nil {
		return x.UserIp
	}
	return ""
}

func (x *PayRequest) GetUserId() string {
	if x != nil {
		return x.UserId
	}
	return ""
}

func (x *PayRequest) GetPayerAccount() string {
	if x != nil {
		return x.PayerAccount
	}
	return ""
}

func (x *PayRequest) GetProductId() string {
	if x != nil {
		return x.ProductId
	}
	return ""
}

func (x *PayRequest) GetProductName() string {
	if x != nil {
		return x.ProductName
	}
	return ""
}

func (x *PayRequest) GetProductDescribe() string {
	if x != nil {
		return x.ProductDescribe
	}
	return ""
}

func (x *PayRequest) GetCharset() string {
	if x != nil {
		return x.Charset
	}
	return ""
}

func (x *PayRequest) GetCallbackJson() string {
	if x != nil {
		return x.CallbackJson
	}
	return ""
}

func (x *PayRequest) GetExtJson() string {
	if x != nil {
		return x.ExtJson
	}
	return ""
}

func (x *PayRequest) GetChannelId() string {
	if x != nil {
		return x.ChannelId
	}
	return ""
}

func (x *PayRequest) GetMethod() Method {
	if x != nil {
		return x.Method
	}
	return Method_WEB
}

type PayResponse struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Result         *ReturnResult     `protobuf:"bytes,1,opt,name=result,proto3" json:"result,omitempty"`
	GatewayOrderId string            `protobuf:"bytes,2,opt,name=gateway_order_id,json=gatewayOrderId,proto3" json:"gateway_order_id,omitempty"`
	CreateTime     string            `protobuf:"bytes,3,opt,name=create_time,json=createTime,proto3" json:"create_time,omitempty"`
	UpdateTime     string            `protobuf:"bytes,4,opt,name=update_time,json=updateTime,proto3" json:"update_time,omitempty"`
	Data           map[string]string `protobuf:"bytes,5,rep,name=data,proto3" json:"data,omitempty" protobuf_key:"bytes,1,opt,name=key,proto3" protobuf_val:"bytes,2,opt,name=value,proto3"`
}

func (x *PayResponse) Reset() {
	*x = PayResponse{}
	if protoimpl.UnsafeEnabled {
		mi := &file_pay_gateway_proto_msgTypes[1]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *PayResponse) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*PayResponse) ProtoMessage() {}

func (x *PayResponse) ProtoReflect() protoreflect.Message {
	mi := &file_pay_gateway_proto_msgTypes[1]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use PayResponse.ProtoReflect.Descriptor instead.
func (*PayResponse) Descriptor() ([]byte, []int) {
	return file_pay_gateway_proto_rawDescGZIP(), []int{1}
}

func (x *PayResponse) GetResult() *ReturnResult {
	if x != nil {
		return x.Result
	}
	return nil
}

func (x *PayResponse) GetGatewayOrderId() string {
	if x != nil {
		return x.GatewayOrderId
	}
	return ""
}

func (x *PayResponse) GetCreateTime() string {
	if x != nil {
		return x.CreateTime
	}
	return ""
}

func (x *PayResponse) GetUpdateTime() string {
	if x != nil {
		return x.UpdateTime
	}
	return ""
}

func (x *PayResponse) GetData() map[string]string {
	if x != nil {
		return x.Data
	}
	return nil
}

var File_pay_gateway_proto protoreflect.FileDescriptor

var file_pay_gateway_proto_rawDesc = []byte{
	0x0a, 0x11, 0x70, 0x61, 0x79, 0x5f, 0x67, 0x61, 0x74, 0x65, 0x77, 0x61, 0x79, 0x2e, 0x70, 0x72,
	0x6f, 0x74, 0x6f, 0x12, 0x03, 0x70, 0x61, 0x79, 0x1a, 0x1c, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65,
	0x2f, 0x61, 0x70, 0x69, 0x2f, 0x61, 0x6e, 0x6e, 0x6f, 0x74, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x73,
	0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x1f, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2f, 0x70,
	0x72, 0x6f, 0x74, 0x6f, 0x62, 0x75, 0x66, 0x2f, 0x74, 0x69, 0x6d, 0x65, 0x73, 0x74, 0x61, 0x6d,
	0x70, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x0c, 0x63, 0x6f, 0x6d, 0x6d, 0x6f, 0x6e, 0x2e,
	0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x17, 0x76, 0x61, 0x6c, 0x69, 0x64, 0x61, 0x74, 0x65, 0x2f,
	0x76, 0x61, 0x6c, 0x69, 0x64, 0x61, 0x74, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x2e,
	0x70, 0x72, 0x6f, 0x74, 0x6f, 0x63, 0x2d, 0x67, 0x65, 0x6e, 0x2d, 0x6f, 0x70, 0x65, 0x6e, 0x61,
	0x70, 0x69, 0x76, 0x32, 0x2f, 0x6f, 0x70, 0x74, 0x69, 0x6f, 0x6e, 0x73, 0x2f, 0x61, 0x6e, 0x6e,
	0x6f, 0x74, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x73, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x22, 0x92,
	0x07, 0x0a, 0x0a, 0x50, 0x61, 0x79, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x12, 0x18, 0x0a,
	0x07, 0x76, 0x65, 0x72, 0x73, 0x69, 0x6f, 0x6e, 0x18, 0x64, 0x20, 0x01, 0x28, 0x09, 0x52, 0x07,
	0x76, 0x65, 0x72, 0x73, 0x69, 0x6f, 0x6e, 0x12, 0x3b, 0x0a, 0x0c, 0x6f, 0x75, 0x74, 0x5f, 0x74,
	0x72, 0x61, 0x64, 0x65, 0x5f, 0x6e, 0x6f, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x42, 0x19, 0xfa,
	0x42, 0x16, 0x72, 0x14, 0x18, 0x40, 0x32, 0x10, 0x5e, 0x5b, 0x41, 0x2d, 0x5a, 0x61, 0x2d, 0x7a,
	0x30, 0x2d, 0x39, 0x5f, 0x2d, 0x5d, 0x2b, 0x24, 0x52, 0x0a, 0x6f, 0x75, 0x74, 0x54, 0x72, 0x61,
	0x64, 0x65, 0x4e, 0x6f, 0x12, 0x2c, 0x0a, 0x0a, 0x70, 0x61, 0x79, 0x5f, 0x61, 0x6d, 0x6f, 0x75,
	0x6e, 0x74, 0x18, 0x03, 0x20, 0x01, 0x28, 0x04, 0x42, 0x0d, 0xfa, 0x42, 0x0a, 0x32, 0x08, 0x18,
	0x80, 0x94, 0xeb, 0xdc, 0x03, 0x28, 0x01, 0x52, 0x09, 0x70, 0x61, 0x79, 0x41, 0x6d, 0x6f, 0x75,
	0x6e, 0x74, 0x12, 0x1a, 0x0a, 0x08, 0x63, 0x75, 0x72, 0x72, 0x65, 0x6e, 0x63, 0x79, 0x18, 0x14,
	0x20, 0x01, 0x28, 0x09, 0x52, 0x08, 0x63, 0x75, 0x72, 0x72, 0x65, 0x6e, 0x63, 0x79, 0x12, 0x1d,
	0x0a, 0x0a, 0x6e, 0x6f, 0x74, 0x69, 0x66, 0x79, 0x5f, 0x75, 0x72, 0x6c, 0x18, 0x04, 0x20, 0x01,
	0x28, 0x09, 0x52, 0x09, 0x6e, 0x6f, 0x74, 0x69, 0x66, 0x79, 0x55, 0x72, 0x6c, 0x12, 0x1d, 0x0a,
	0x0a, 0x72, 0x65, 0x74, 0x75, 0x72, 0x6e, 0x5f, 0x75, 0x72, 0x6c, 0x18, 0x05, 0x20, 0x01, 0x28,
	0x09, 0x52, 0x09, 0x72, 0x65, 0x74, 0x75, 0x72, 0x6e, 0x55, 0x72, 0x6c, 0x12, 0x25, 0x0a, 0x06,
	0x61, 0x70, 0x70, 0x5f, 0x69, 0x64, 0x18, 0x06, 0x20, 0x01, 0x28, 0x09, 0x42, 0x0e, 0xfa, 0x42,
	0x0b, 0x72, 0x09, 0x10, 0x01, 0x32, 0x05, 0x5e, 0x5c, 0x77, 0x2b, 0x24, 0x52, 0x05, 0x61, 0x70,
	0x70, 0x49, 0x64, 0x12, 0x1b, 0x0a, 0x09, 0x73, 0x69, 0x67, 0x6e, 0x5f, 0x74, 0x79, 0x70, 0x65,
	0x18, 0x07, 0x20, 0x01, 0x28, 0x09, 0x52, 0x08, 0x73, 0x69, 0x67, 0x6e, 0x54, 0x79, 0x70, 0x65,
	0x12, 0x34, 0x0a, 0x04, 0x73, 0x69, 0x67, 0x6e, 0x18, 0x0e, 0x20, 0x01, 0x28, 0x09, 0x42, 0x20,
	0xfa, 0x42, 0x1d, 0x72, 0x1b, 0x10, 0x01, 0x32, 0x17, 0x5e, 0x5b, 0x41, 0x2d, 0x5a, 0x61, 0x2d,
	0x7a, 0x30, 0x2d, 0x39, 0x2b, 0x2f, 0x3d, 0x5c, 0x73, 0x5c, 0x6e, 0x5c, 0x72, 0x5d, 0x2b, 0x24,
	0x52, 0x04, 0x73, 0x69, 0x67, 0x6e, 0x12, 0xbe, 0x01, 0x0a, 0x0a, 0x6f, 0x72, 0x64, 0x65, 0x72,
	0x5f, 0x74, 0x69, 0x6d, 0x65, 0x18, 0x08, 0x20, 0x01, 0x28, 0x09, 0x42, 0x9e, 0x01, 0xfa, 0x42,
	0x9a, 0x01, 0x72, 0x97, 0x01, 0x10, 0x14, 0x18, 0x40, 0x32, 0x90, 0x01, 0x5e, 0x5b, 0x30, 0x2d,
	0x39, 0x5d, 0x7b, 0x34, 0x7d, 0x2d, 0x28, 0x30, 0x5b, 0x31, 0x2d, 0x39, 0x5d, 0x7c, 0x31, 0x5b,
	0x30, 0x2d, 0x32, 0x5d, 0x29, 0x2d, 0x28, 0x30, 0x5b, 0x31, 0x2d, 0x39, 0x5d, 0x7c, 0x5b, 0x31,
	0x2d, 0x32, 0x5d, 0x5b, 0x30, 0x2d, 0x39, 0x5d, 0x7c, 0x33, 0x5b, 0x30, 0x2d, 0x31, 0x5d, 0x29,
	0x5b, 0x54, 0x2c, 0x74, 0x5d, 0x28, 0x5b, 0x30, 0x2d, 0x31, 0x5d, 0x5b, 0x30, 0x2d, 0x39, 0x5d,
	0x7c, 0x32, 0x5b, 0x30, 0x2d, 0x33, 0x5d, 0x29, 0x3a, 0x5b, 0x30, 0x2d, 0x35, 0x5d, 0x5b, 0x30,
	0x2d, 0x39, 0x5d, 0x3a, 0x28, 0x5b, 0x30, 0x2d, 0x35, 0x5d, 0x5b, 0x30, 0x2d, 0x39, 0x5d, 0x7c,
	0x36, 0x30, 0x29, 0x28, 0x5b, 0x2e, 0x5d, 0x5b, 0x30, 0x2d, 0x39, 0x5d, 0x2b, 0x29, 0x3f, 0x28,
	0x5b, 0x5a, 0x7a, 0x5d, 0x7c, 0x5b, 0x2b, 0x2d, 0x5d, 0x5b, 0x30, 0x2d, 0x39, 0x5d, 0x7b, 0x32,
	0x7d, 0x3a, 0x5b, 0x30, 0x2d, 0x39, 0x5d, 0x7b, 0x32, 0x7d, 0x29, 0x24, 0x52, 0x09, 0x6f, 0x72,
	0x64, 0x65, 0x72, 0x54, 0x69, 0x6d, 0x65, 0x12, 0x17, 0x0a, 0x07, 0x75, 0x73, 0x65, 0x72, 0x5f,
	0x69, 0x70, 0x18, 0x09, 0x20, 0x01, 0x28, 0x09, 0x52, 0x06, 0x75, 0x73, 0x65, 0x72, 0x49, 0x70,
	0x12, 0x17, 0x0a, 0x07, 0x75, 0x73, 0x65, 0x72, 0x5f, 0x69, 0x64, 0x18, 0x12, 0x20, 0x01, 0x28,
	0x09, 0x52, 0x06, 0x75, 0x73, 0x65, 0x72, 0x49, 0x64, 0x12, 0x23, 0x0a, 0x0d, 0x70, 0x61, 0x79,
	0x65, 0x72, 0x5f, 0x61, 0x63, 0x63, 0x6f, 0x75, 0x6e, 0x74, 0x18, 0x0a, 0x20, 0x01, 0x28, 0x09,
	0x52, 0x0c, 0x70, 0x61, 0x79, 0x65, 0x72, 0x41, 0x63, 0x63, 0x6f, 0x75, 0x6e, 0x74, 0x12, 0x1d,
	0x0a, 0x0a, 0x70, 0x72, 0x6f, 0x64, 0x75, 0x63, 0x74, 0x5f, 0x69, 0x64, 0x18, 0x0b, 0x20, 0x01,
	0x28, 0x09, 0x52, 0x09, 0x70, 0x72, 0x6f, 0x64, 0x75, 0x63, 0x74, 0x49, 0x64, 0x12, 0x21, 0x0a,
	0x0c, 0x70, 0x72, 0x6f, 0x64, 0x75, 0x63, 0x74, 0x5f, 0x6e, 0x61, 0x6d, 0x65, 0x18, 0x0c, 0x20,
	0x01, 0x28, 0x09, 0x52, 0x0b, 0x70, 0x72, 0x6f, 0x64, 0x75, 0x63, 0x74, 0x4e, 0x61, 0x6d, 0x65,
	0x12, 0x29, 0x0a, 0x10, 0x70, 0x72, 0x6f, 0x64, 0x75, 0x63, 0x74, 0x5f, 0x64, 0x65, 0x73, 0x63,
	0x72, 0x69, 0x62, 0x65, 0x18, 0x0d, 0x20, 0x01, 0x28, 0x09, 0x52, 0x0f, 0x70, 0x72, 0x6f, 0x64,
	0x75, 0x63, 0x74, 0x44, 0x65, 0x73, 0x63, 0x72, 0x69, 0x62, 0x65, 0x12, 0x18, 0x0a, 0x07, 0x63,
	0x68, 0x61, 0x72, 0x73, 0x65, 0x74, 0x18, 0x0f, 0x20, 0x01, 0x28, 0x09, 0x52, 0x07, 0x63, 0x68,
	0x61, 0x72, 0x73, 0x65, 0x74, 0x12, 0x23, 0x0a, 0x0d, 0x63, 0x61, 0x6c, 0x6c, 0x62, 0x61, 0x63,
	0x6b, 0x5f, 0x6a, 0x73, 0x6f, 0x6e, 0x18, 0x10, 0x20, 0x01, 0x28, 0x09, 0x52, 0x0c, 0x63, 0x61,
	0x6c, 0x6c, 0x62, 0x61, 0x63, 0x6b, 0x4a, 0x73, 0x6f, 0x6e, 0x12, 0x19, 0x0a, 0x08, 0x65, 0x78,
	0x74, 0x5f, 0x6a, 0x73, 0x6f, 0x6e, 0x18, 0x11, 0x20, 0x01, 0x28, 0x09, 0x52, 0x07, 0x65, 0x78,
	0x74, 0x4a, 0x73, 0x6f, 0x6e, 0x12, 0x1d, 0x0a, 0x0a, 0x63, 0x68, 0x61, 0x6e, 0x6e, 0x65, 0x6c,
	0x5f, 0x69, 0x64, 0x18, 0x13, 0x20, 0x01, 0x28, 0x09, 0x52, 0x09, 0x63, 0x68, 0x61, 0x6e, 0x6e,
	0x65, 0x6c, 0x49, 0x64, 0x12, 0x2d, 0x0a, 0x06, 0x6d, 0x65, 0x74, 0x68, 0x6f, 0x64, 0x18, 0x62,
	0x20, 0x01, 0x28, 0x0e, 0x32, 0x0b, 0x2e, 0x70, 0x61, 0x79, 0x2e, 0x4d, 0x65, 0x74, 0x68, 0x6f,
	0x64, 0x42, 0x08, 0xfa, 0x42, 0x05, 0x82, 0x01, 0x02, 0x10, 0x01, 0x52, 0x06, 0x6d, 0x65, 0x74,
	0x68, 0x6f, 0x64, 0x22, 0xd1, 0x04, 0x0a, 0x0b, 0x50, 0x61, 0x79, 0x52, 0x65, 0x73, 0x70, 0x6f,
	0x6e, 0x73, 0x65, 0x12, 0x29, 0x0a, 0x06, 0x72, 0x65, 0x73, 0x75, 0x6c, 0x74, 0x18, 0x01, 0x20,
	0x01, 0x28, 0x0b, 0x32, 0x11, 0x2e, 0x70, 0x61, 0x79, 0x2e, 0x52, 0x65, 0x74, 0x75, 0x72, 0x6e,
	0x52, 0x65, 0x73, 0x75, 0x6c, 0x74, 0x52, 0x06, 0x72, 0x65, 0x73, 0x75, 0x6c, 0x74, 0x12, 0x28,
	0x0a, 0x10, 0x67, 0x61, 0x74, 0x65, 0x77, 0x61, 0x79, 0x5f, 0x6f, 0x72, 0x64, 0x65, 0x72, 0x5f,
	0x69, 0x64, 0x18, 0x02, 0x20, 0x01, 0x28, 0x09, 0x52, 0x0e, 0x67, 0x61, 0x74, 0x65, 0x77, 0x61,
	0x79, 0x4f, 0x72, 0x64, 0x65, 0x72, 0x49, 0x64, 0x12, 0xc0, 0x01, 0x0a, 0x0b, 0x63, 0x72, 0x65,
	0x61, 0x74, 0x65, 0x5f, 0x74, 0x69, 0x6d, 0x65, 0x18, 0x03, 0x20, 0x01, 0x28, 0x09, 0x42, 0x9e,
	0x01, 0xfa, 0x42, 0x9a, 0x01, 0x72, 0x97, 0x01, 0x10, 0x14, 0x18, 0x40, 0x32, 0x90, 0x01, 0x5e,
	0x5b, 0x30, 0x2d, 0x39, 0x5d, 0x7b, 0x34, 0x7d, 0x2d, 0x28, 0x30, 0x5b, 0x31, 0x2d, 0x39, 0x5d,
	0x7c, 0x31, 0x5b, 0x30, 0x2d, 0x32, 0x5d, 0x29, 0x2d, 0x28, 0x30, 0x5b, 0x31, 0x2d, 0x39, 0x5d,
	0x7c, 0x5b, 0x31, 0x2d, 0x32, 0x5d, 0x5b, 0x30, 0x2d, 0x39, 0x5d, 0x7c, 0x33, 0x5b, 0x30, 0x2d,
	0x31, 0x5d, 0x29, 0x5b, 0x54, 0x2c, 0x74, 0x5d, 0x28, 0x5b, 0x30, 0x2d, 0x31, 0x5d, 0x5b, 0x30,
	0x2d, 0x39, 0x5d, 0x7c, 0x32, 0x5b, 0x30, 0x2d, 0x33, 0x5d, 0x29, 0x3a, 0x5b, 0x30, 0x2d, 0x35,
	0x5d, 0x5b, 0x30, 0x2d, 0x39, 0x5d, 0x3a, 0x28, 0x5b, 0x30, 0x2d, 0x35, 0x5d, 0x5b, 0x30, 0x2d,
	0x39, 0x5d, 0x7c, 0x36, 0x30, 0x29, 0x28, 0x5b, 0x2e, 0x5d, 0x5b, 0x30, 0x2d, 0x39, 0x5d, 0x2b,
	0x29, 0x3f, 0x28, 0x5b, 0x5a, 0x7a, 0x5d, 0x7c, 0x5b, 0x2b, 0x2d, 0x5d, 0x5b, 0x30, 0x2d, 0x39,
	0x5d, 0x7b, 0x32, 0x7d, 0x3a, 0x5b, 0x30, 0x2d, 0x39, 0x5d, 0x7b, 0x32, 0x7d, 0x29, 0x24, 0x52,
	0x0a, 0x63, 0x72, 0x65, 0x61, 0x74, 0x65, 0x54, 0x69, 0x6d, 0x65, 0x12, 0xc0, 0x01, 0x0a, 0x0b,
	0x75, 0x70, 0x64, 0x61, 0x74, 0x65, 0x5f, 0x74, 0x69, 0x6d, 0x65, 0x18, 0x04, 0x20, 0x01, 0x28,
	0x09, 0x42, 0x9e, 0x01, 0xfa, 0x42, 0x9a, 0x01, 0x72, 0x97, 0x01, 0x10, 0x14, 0x18, 0x40, 0x32,
	0x90, 0x01, 0x5e, 0x5b, 0x30, 0x2d, 0x39, 0x5d, 0x7b, 0x34, 0x7d, 0x2d, 0x28, 0x30, 0x5b, 0x31,
	0x2d, 0x39, 0x5d, 0x7c, 0x31, 0x5b, 0x30, 0x2d, 0x32, 0x5d, 0x29, 0x2d, 0x28, 0x30, 0x5b, 0x31,
	0x2d, 0x39, 0x5d, 0x7c, 0x5b, 0x31, 0x2d, 0x32, 0x5d, 0x5b, 0x30, 0x2d, 0x39, 0x5d, 0x7c, 0x33,
	0x5b, 0x30, 0x2d, 0x31, 0x5d, 0x29, 0x5b, 0x54, 0x2c, 0x74, 0x5d, 0x28, 0x5b, 0x30, 0x2d, 0x31,
	0x5d, 0x5b, 0x30, 0x2d, 0x39, 0x5d, 0x7c, 0x32, 0x5b, 0x30, 0x2d, 0x33, 0x5d, 0x29, 0x3a, 0x5b,
	0x30, 0x2d, 0x35, 0x5d, 0x5b, 0x30, 0x2d, 0x39, 0x5d, 0x3a, 0x28, 0x5b, 0x30, 0x2d, 0x35, 0x5d,
	0x5b, 0x30, 0x2d, 0x39, 0x5d, 0x7c, 0x36, 0x30, 0x29, 0x28, 0x5b, 0x2e, 0x5d, 0x5b, 0x30, 0x2d,
	0x39, 0x5d, 0x2b, 0x29, 0x3f, 0x28, 0x5b, 0x5a, 0x7a, 0x5d, 0x7c, 0x5b, 0x2b, 0x2d, 0x5d, 0x5b,
	0x30, 0x2d, 0x39, 0x5d, 0x7b, 0x32, 0x7d, 0x3a, 0x5b, 0x30, 0x2d, 0x39, 0x5d, 0x7b, 0x32, 0x7d,
	0x29, 0x24, 0x52, 0x0a, 0x75, 0x70, 0x64, 0x61, 0x74, 0x65, 0x54, 0x69, 0x6d, 0x65, 0x12, 0x2e,
	0x0a, 0x04, 0x64, 0x61, 0x74, 0x61, 0x18, 0x05, 0x20, 0x03, 0x28, 0x0b, 0x32, 0x1a, 0x2e, 0x70,
	0x61, 0x79, 0x2e, 0x50, 0x61, 0x79, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x2e, 0x44,
	0x61, 0x74, 0x61, 0x45, 0x6e, 0x74, 0x72, 0x79, 0x52, 0x04, 0x64, 0x61, 0x74, 0x61, 0x1a, 0x37,
	0x0a, 0x09, 0x44, 0x61, 0x74, 0x61, 0x45, 0x6e, 0x74, 0x72, 0x79, 0x12, 0x10, 0x0a, 0x03, 0x6b,
	0x65, 0x79, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x52, 0x03, 0x6b, 0x65, 0x79, 0x12, 0x14, 0x0a,
	0x05, 0x76, 0x61, 0x6c, 0x75, 0x65, 0x18, 0x02, 0x20, 0x01, 0x28, 0x09, 0x52, 0x05, 0x76, 0x61,
	0x6c, 0x75, 0x65, 0x3a, 0x02, 0x38, 0x01, 0x32, 0x53, 0x0a, 0x0a, 0x50, 0x61, 0x79, 0x47, 0x61,
	0x74, 0x65, 0x77, 0x61, 0x79, 0x12, 0x45, 0x0a, 0x03, 0x50, 0x61, 0x79, 0x12, 0x0f, 0x2e, 0x70,
	0x61, 0x79, 0x2e, 0x50, 0x61, 0x79, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x1a, 0x10, 0x2e,
	0x70, 0x61, 0x79, 0x2e, 0x50, 0x61, 0x79, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x22,
	0x1b, 0x82, 0xd3, 0xe4, 0x93, 0x02, 0x15, 0x22, 0x10, 0x2f, 0x76, 0x31, 0x2f, 0x70, 0x61, 0x79,
	0x2f, 0x7b, 0x6d, 0x65, 0x74, 0x68, 0x6f, 0x64, 0x7d, 0x3a, 0x01, 0x2a, 0x42, 0xe0, 0x01, 0x0a,
	0x14, 0x70, 0x75, 0x62, 0x2e, 0x70, 0x6a, 0x6f, 0x63, 0x2e, 0x70, 0x61, 0x79, 0x2e, 0x67, 0x61,
	0x74, 0x65, 0x77, 0x61, 0x79, 0x5a, 0x03, 0x70, 0x61, 0x79, 0x92, 0x41, 0xc1, 0x01, 0x12, 0x11,
	0x0a, 0x0f, 0x70, 0x61, 0x79, 0x2d, 0x67, 0x61, 0x74, 0x65, 0x77, 0x61, 0x79, 0x20, 0x61, 0x70,
	0x69, 0x1a, 0x1c, 0x7b, 0x70, 0x72, 0x65, 0x66, 0x69, 0x78, 0x7d, 0x70, 0x61, 0x79, 0x2d, 0x67,
	0x61, 0x74, 0x65, 0x77, 0x61, 0x79, 0x2e, 0x70, 0x6a, 0x6f, 0x63, 0x2e, 0x70, 0x75, 0x62, 0x2a,
	0x01, 0x01, 0x32, 0x10, 0x61, 0x70, 0x70, 0x6c, 0x69, 0x63, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x2f,
	0x6a, 0x73, 0x6f, 0x6e, 0x3a, 0x10, 0x61, 0x70, 0x70, 0x6c, 0x69, 0x63, 0x61, 0x74, 0x69, 0x6f,
	0x6e, 0x2f, 0x6a, 0x73, 0x6f, 0x6e, 0x5a, 0x59, 0x0a, 0x57, 0x0a, 0x06, 0x62, 0x65, 0x61, 0x72,
	0x65, 0x72, 0x12, 0x4d, 0x08, 0x02, 0x12, 0x38, 0x41, 0x75, 0x74, 0x68, 0x65, 0x6e, 0x74, 0x69,
	0x63, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x20, 0x74, 0x6f, 0x6b, 0x65, 0x6e, 0x2c, 0x20, 0x70, 0x72,
	0x65, 0x66, 0x69, 0x78, 0x65, 0x64, 0x20, 0x62, 0x79, 0x20, 0x42, 0x65, 0x61, 0x72, 0x65, 0x72,
	0x3a, 0x20, 0x42, 0x65, 0x61, 0x72, 0x65, 0x72, 0x20, 0x3c, 0x74, 0x6f, 0x6b, 0x65, 0x6e, 0x3e,
	0x1a, 0x0d, 0x41, 0x75, 0x74, 0x68, 0x6f, 0x72, 0x69, 0x7a, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x20,
	0x02, 0x62, 0x0c, 0x0a, 0x0a, 0x0a, 0x06, 0x62, 0x65, 0x61, 0x72, 0x65, 0x72, 0x12, 0x00, 0x62,
	0x06, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x33,
}

var (
	file_pay_gateway_proto_rawDescOnce sync.Once
	file_pay_gateway_proto_rawDescData = file_pay_gateway_proto_rawDesc
)

func file_pay_gateway_proto_rawDescGZIP() []byte {
	file_pay_gateway_proto_rawDescOnce.Do(func() {
		file_pay_gateway_proto_rawDescData = protoimpl.X.CompressGZIP(file_pay_gateway_proto_rawDescData)
	})
	return file_pay_gateway_proto_rawDescData
}

var file_pay_gateway_proto_msgTypes = make([]protoimpl.MessageInfo, 3)
var file_pay_gateway_proto_goTypes = []interface{}{
	(*PayRequest)(nil),   // 0: pay.PayRequest
	(*PayResponse)(nil),  // 1: pay.PayResponse
	nil,                  // 2: pay.PayResponse.DataEntry
	(Method)(0),          // 3: pay.Method
	(*ReturnResult)(nil), // 4: pay.ReturnResult
}
var file_pay_gateway_proto_depIdxs = []int32{
	3, // 0: pay.PayRequest.method:type_name -> pay.Method
	4, // 1: pay.PayResponse.result:type_name -> pay.ReturnResult
	2, // 2: pay.PayResponse.data:type_name -> pay.PayResponse.DataEntry
	0, // 3: pay.PayGateway.Pay:input_type -> pay.PayRequest
	1, // 4: pay.PayGateway.Pay:output_type -> pay.PayResponse
	4, // [4:5] is the sub-list for method output_type
	3, // [3:4] is the sub-list for method input_type
	3, // [3:3] is the sub-list for extension type_name
	3, // [3:3] is the sub-list for extension extendee
	0, // [0:3] is the sub-list for field type_name
}

func init() { file_pay_gateway_proto_init() }
func file_pay_gateway_proto_init() {
	if File_pay_gateway_proto != nil {
		return
	}
	file_common_proto_init()
	if !protoimpl.UnsafeEnabled {
		file_pay_gateway_proto_msgTypes[0].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*PayRequest); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
		file_pay_gateway_proto_msgTypes[1].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*PayResponse); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
	}
	type x struct{}
	out := protoimpl.TypeBuilder{
		File: protoimpl.DescBuilder{
			GoPackagePath: reflect.TypeOf(x{}).PkgPath(),
			RawDescriptor: file_pay_gateway_proto_rawDesc,
			NumEnums:      0,
			NumMessages:   3,
			NumExtensions: 0,
			NumServices:   1,
		},
		GoTypes:           file_pay_gateway_proto_goTypes,
		DependencyIndexes: file_pay_gateway_proto_depIdxs,
		MessageInfos:      file_pay_gateway_proto_msgTypes,
	}.Build()
	File_pay_gateway_proto = out.File
	file_pay_gateway_proto_rawDesc = nil
	file_pay_gateway_proto_goTypes = nil
	file_pay_gateway_proto_depIdxs = nil
}

// Reference imports to suppress errors if they are not otherwise used.
var _ context.Context
var _ grpc.ClientConnInterface

// This is a compile-time assertion to ensure that this generated file
// is compatible with the grpc package it is being compiled against.
const _ = grpc.SupportPackageIsVersion6

// PayGatewayClient is the client API for PayGateway service.
//
// For semantics around ctx use and closing/ending streaming RPCs, please refer to https://godoc.org/google.golang.org/grpc#ClientConn.NewStream.
type PayGatewayClient interface {
	Pay(ctx context.Context, in *PayRequest, opts ...grpc.CallOption) (*PayResponse, error)
}

type payGatewayClient struct {
	cc grpc.ClientConnInterface
}

func NewPayGatewayClient(cc grpc.ClientConnInterface) PayGatewayClient {
	return &payGatewayClient{cc}
}

func (c *payGatewayClient) Pay(ctx context.Context, in *PayRequest, opts ...grpc.CallOption) (*PayResponse, error) {
	out := new(PayResponse)
	err := c.cc.Invoke(ctx, "/pay.PayGateway/Pay", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

// PayGatewayServer is the server API for PayGateway service.
type PayGatewayServer interface {
	Pay(context.Context, *PayRequest) (*PayResponse, error)
}

// UnimplementedPayGatewayServer can be embedded to have forward compatible implementations.
type UnimplementedPayGatewayServer struct {
}

func (*UnimplementedPayGatewayServer) Pay(context.Context, *PayRequest) (*PayResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method Pay not implemented")
}

func RegisterPayGatewayServer(s *grpc.Server, srv PayGatewayServer) {
	s.RegisterService(&_PayGateway_serviceDesc, srv)
}

func _PayGateway_Pay_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(PayRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(PayGatewayServer).Pay(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/pay.PayGateway/Pay",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(PayGatewayServer).Pay(ctx, req.(*PayRequest))
	}
	return interceptor(ctx, in, info, handler)
}

var _PayGateway_serviceDesc = grpc.ServiceDesc{
	ServiceName: "pay.PayGateway",
	HandlerType: (*PayGatewayServer)(nil),
	Methods: []grpc.MethodDesc{
		{
			MethodName: "Pay",
			Handler:    _PayGateway_Pay_Handler,
		},
	},
	Streams:  []grpc.StreamDesc{},
	Metadata: "pay_gateway.proto",
}
