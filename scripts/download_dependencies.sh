#!/usr/bin/env bash

cur_script_dir="$(cd $(dirname $0) && pwd)"
source ${cur_script_dir}/base.sh

repos=(
  "https://github.com/gogo/protobuf.git"
  "https://github.com/grpc-ecosystem/grpc-gateway.git"
  "https://github.com/protocolbuffers/protobuf.git"
  "https://github.com/envoyproxy/protoc-gen-validate.git"
  "https://github.com/googleapis/googleapis.git"
)

copy_proto_repos=(
  "github.com/protocolbuffers/protobuf/src/"
  "github.com/googleapis/googleapis/"
)

for url in ${repos[@]}; do
  echo "url=$url"
  schema=$(echo "$url" | awk -F ":" '{print $1}')
  echo "schema===$schema"
  domain=""
  path=""
  if [[ $url == http://* || $url == https://* ]]; then
    #echoRed "http... not support!"
    #exit 1
    domain=$(echo $url | grep -oE '(?:/)[^/]+(\.[^/]+)+(?:/)' | sed 's~/~~g')
    path=$(echo $url | grep -oE "[^/]+/[^/]+\.git$" | sed 's/.git//g')
  fi

  if [[ $url == git@* ]]; then
    echoYellow "use git clone..."
    domain=$(echo $schema | awk -F "@" '{print$2}')
    path=$(echo $url | awk -F ":" '{print $2}' | sed 's/.git$//')
  fi

  dir=$GOPATH/src/$domain/$path
  echoGreen "dir=$dir"
  git clone $url $dir
done

mkdir -p ${GOPATH}/src/protobuf
for repo in ${copy_proto_repos[@]}; do
  cp -R ${GOPATH}/src/$repo/* ${GOPATH}/src/protobuf/
done

#mkdir -p ${GOPATH}/src/github.com/envoyproxy && cd ${GOPATH}/src/github.com/envoyproxy
#[ ! -d "protoc-gen-validate" ] && git clone https://github.com/envoyproxy/protoc-gen-validate
#mkdir -p ${GOPATH}/src/protobuf ${GOPATH}/src/github.com/protocolbuffers && cd ${GOPATH}/src/github.com/protocolbuffers && [ ! -d "protobuf" ]  && git clone https://github.com/protocolbuffers/protobuf.git
#go get -u github.com/gogo/protobuf
#go get -u github.com/grpc-ecosystem/grpc-gateway
echo "!!!!!!!!!! please import: [${GOPATH}/src] as your protobuf path. "
echo "!!!!!!!!!! please import: [${GOPATH}/src/protobuf] as your protobuf path. "