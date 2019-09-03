export PATH := ${GOPATH}/bin:${PATH}

gen:
#	export GO111MODULE=off
#	go get github.com/mwitkow/go-proto-validators
#	go install github.com/mwitkow/go-proto-validators/protoc-gen-govalidators
#	export GO111MODULE=on
#		docker run --rm -v `pwd`/entrypoint.sh:/usr/local/bin/entrypoint.sh -v ${GOPATH}/bin/protoc-gen-govalidators:/bin/protoc-gen-govalidators -v `pwd`:/defs -v ${GOPATH}:/go registry.github.com/pjoc-team/docker-protoc -i /defs/proto -i /go/src -d $$base_dir -l $$l -o $$l --debug -a "--govalidators_out=/defs/go" $addition;\
	# build go and java
	base_dir="/defs/"; for l in go java ; do \
		[[ "$$l" == "go" ]] && addition=" --with-gateway"; \
		docker run --rm -v `pwd`:/defs blademainer/protoc-all:1.23_v0.0.3 -i /defs/proto -i /go/src -d $$base_dir/proto -l $$l -o $$l -a "--govalidators_out=/defs/go" $$addition;\
		addition=""; \
    done;

local-gen:
	protoc  \
        --proto_path=${GOPATH}/src/ \
        --proto_path=./proto \
        --go_out=go/ \
        --govalidators_out=go/ \
        ./proto/*.proto

gateway:
#	if [ ! -a ../pay-grpc-gateway ]; then mkdir -p ../pay-grpc-gateway; fi;
#	ifeq ("$(wildcard ../pay-grpc-gateway)","")
#	  mkdir -p ../pay-grpc-gateway/src/pkg/main/
#	  mkdir -p ../pay-grpc-gateway/src/gen/pb-go/
#	else
#	  $(info "pay-grpc-gateway exists")
#	endif
	docker run --rm -v `pwd`:/defs -v `pwd`/channel-grpc-gateway:/defs/channel-grpc-gateway namely/gen-grpc-gateway -f /defs/proto/pay_channel.proto -s PayChannel -o channel-grpc-gateway
	docker run --rm -v `pwd`:/defs -v `pwd`/channel-grpc-gateway:/defs/channel-grpc-gateway namely/gen-grpc-gateway -f /defs/proto/pay_gateway.proto -s PayGateway -o pay-grpc-gateway
#	docker run --rm -v `pwd`/proto/pjoc/pay/gateway:/defs/proto/pjoc/pay/gateway -v `pwd`/pay-grpc-gateway:/defs/pay-grpc-gateway namely/gen-grpc-gateway -f /defs/proto/pjoc -s PayGateway -o pay-grpc-gateway

#	docker run --rm -v `pwd`:/defs namely/gen-grpc-gateway -f /defs/proto/pjoc/pay/gateway -s PayGateway -o pay-grpc-gateway
#	docker run --rm -v `pwd`:/defs namely/gen-grpc-gateway -f /defs/proto/pjoc -s Service -o grpc-gateway
#	base_dir="/defs/proto/pjoc/"; for dir in "pay/gateway" "pay/channel" ; do \
#		docker run --rm -v `pwd`:/defs namely/gen-grpc-gateway -f $$base_dir$$dir -o grpc-gateway; \
#	done;
#	[ -n "../pay-grpc-gateway" ]

	for l in pay-grpc-gateway channel-grpc-gateway ; do \
		[ ! -a ../pay-grpc-gateway ] && mkdir -p ../$$l/src/pkg/main/ && mkdir -p ../$$l/src/gen/pb-go/; \
		cp -frp $$l/src/pkg/main/main.go ../$$l/src/pkg/main/; \
		cp -frp `find $$l -name "*json"` ../$$l/src/gen/pb-go/; \
	done;


#	cp -frp pay-grpc-gateway/src/pkg/main/main.go ../pay-grpc-gateway/src/pkg/main/;
	cp -frp `find pay-grpc-gateway -name "*json"` ../pay-grpc-gateway/src/gen/pb-go/;


#	cp -frp channel-grpc-gateway/src/pkg/main/main.go
#	cp -frp pay-grpc-gateway ../
#	cp -frp channel-grpc-gateway ../

verify:
	base_dir="/defs/"; for l in go java ; do \
    		[[ "$$l" == "go" ]] && addition=" --with-gateway"; \
    		docker run --rm -v `pwd`:/defs pjoc/docker-protoc:v0.0.2 -i /defs/proto -i /go/src -d $$base_dir -l $$l -o /$$l -a "--govalidators_out=/defs/go" $$addition;\
    		addition=""; \
        done;

clean:
	rm -fr go
	rm -fr java