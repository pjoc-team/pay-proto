.DEFAULT: protos

protos: generate_proto

generate_proto:
	sh scripts/generate_proto.sh  "go" "proto" "./go"

deps:
	sh scripts/download_dependencies.sh