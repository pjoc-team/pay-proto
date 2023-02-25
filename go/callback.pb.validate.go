// Code generated by protoc-gen-validate. DO NOT EDIT.
// source: callback.proto

package pay

import (
	"bytes"
	"errors"
	"fmt"
	"net"
	"net/mail"
	"net/url"
	"regexp"
	"strings"
	"time"
	"unicode/utf8"

	"github.com/golang/protobuf/ptypes"
)

// ensure the imports are used
var (
	_ = bytes.MinRead
	_ = errors.New("")
	_ = fmt.Print
	_ = utf8.UTFMax
	_ = (*regexp.Regexp)(nil)
	_ = (*strings.Reader)(nil)
	_ = net.IPv4len
	_ = time.Duration(0)
	_ = (*url.URL)(nil)
	_ = (*mail.Address)(nil)
	_ = ptypes.DynamicAny{}
)

// define the regex for a UUID once up-front
var _callback_uuidPattern = regexp.MustCompile("^[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}$")

// Validate checks the field values on HttpCallbackRequest with the rules
// defined in the proto definition for this message. If any rules are
// violated, an error is returned.
func (m *HttpCallbackRequest) Validate() error {
	if m == nil {
		return nil
	}

	// no validation rules for Channel

	// no validation rules for Account

	// no validation rules for OrderId

	// no validation rules for HttpMethod

	if v, ok := interface{}(m.GetBody()).(interface{ Validate() error }); ok {
		if err := v.Validate(); err != nil {
			return HttpCallbackRequestValidationError{
				field:  "Body",
				reason: "embedded message failed validation",
				cause:  err,
			}
		}
	}

	return nil
}

// HttpCallbackRequestValidationError is the validation error returned by
// HttpCallbackRequest.Validate if the designated constraints aren't met.
type HttpCallbackRequestValidationError struct {
	field  string
	reason string
	cause  error
	key    bool
}

// Field function returns field value.
func (e HttpCallbackRequestValidationError) Field() string { return e.field }

// Reason function returns reason value.
func (e HttpCallbackRequestValidationError) Reason() string { return e.reason }

// Cause function returns cause value.
func (e HttpCallbackRequestValidationError) Cause() error { return e.cause }

// Key function returns key value.
func (e HttpCallbackRequestValidationError) Key() bool { return e.key }

// ErrorName returns error name.
func (e HttpCallbackRequestValidationError) ErrorName() string {
	return "HttpCallbackRequestValidationError"
}

// Error satisfies the builtin error interface
func (e HttpCallbackRequestValidationError) Error() string {
	cause := ""
	if e.cause != nil {
		cause = fmt.Sprintf(" | caused by: %v", e.cause)
	}

	key := ""
	if e.key {
		key = "key for "
	}

	return fmt.Sprintf(
		"invalid %sHttpCallbackRequest.%s: %s%s",
		key,
		e.field,
		e.reason,
		cause)
}

var _ error = HttpCallbackRequestValidationError{}

var _ interface {
	Field() string
	Reason() string
	Key() bool
	Cause() error
	ErrorName() string
} = HttpCallbackRequestValidationError{}

// Validate checks the field values on HttpCallbackResponse with the rules
// defined in the proto definition for this message. If any rules are
// violated, an error is returned.
func (m *HttpCallbackResponse) Validate() error {
	if m == nil {
		return nil
	}

	// no validation rules for Body

	// no validation rules for Header

	return nil
}

// HttpCallbackResponseValidationError is the validation error returned by
// HttpCallbackResponse.Validate if the designated constraints aren't met.
type HttpCallbackResponseValidationError struct {
	field  string
	reason string
	cause  error
	key    bool
}

// Field function returns field value.
func (e HttpCallbackResponseValidationError) Field() string { return e.field }

// Reason function returns reason value.
func (e HttpCallbackResponseValidationError) Reason() string { return e.reason }

// Cause function returns cause value.
func (e HttpCallbackResponseValidationError) Cause() error { return e.cause }

// Key function returns key value.
func (e HttpCallbackResponseValidationError) Key() bool { return e.key }

// ErrorName returns error name.
func (e HttpCallbackResponseValidationError) ErrorName() string {
	return "HttpCallbackResponseValidationError"
}

// Error satisfies the builtin error interface
func (e HttpCallbackResponseValidationError) Error() string {
	cause := ""
	if e.cause != nil {
		cause = fmt.Sprintf(" | caused by: %v", e.cause)
	}

	key := ""
	if e.key {
		key = "key for "
	}

	return fmt.Sprintf(
		"invalid %sHttpCallbackResponse.%s: %s%s",
		key,
		e.field,
		e.reason,
		cause)
}

var _ error = HttpCallbackResponseValidationError{}

var _ interface {
	Field() string
	Reason() string
	Key() bool
	Cause() error
	ErrorName() string
} = HttpCallbackResponseValidationError{}