#!/usr/bin/env bash

get_latest_release() {
  curl --silent "https://api.github.com/repos/$1/releases/latest" | # Get latest release from GitHub api
    grep '"tag_name":' |                                            # Get tag line
    sed -E 's/.*"([^"]+)".*/\1/'                                    # Pluck JSON value
}

get_download_url(){
  curl --silent "https://api.github.com/repos/$1/releases/latest" | # Get latest release from GitHub api
    grep '"browser_download_url":' | grep "all" | grep "tar.gz"  |                                          # Get tag line
    sed -E 's/.*"([^"]+)".*/\1/'                                    # Pluck JSON value
}




#latest=`get_latest_release "protocolbuffers/protobuf"`
url=`get_download_url "protocolbuffers/protobuf"`
#echo "latest version: $latest"
echo "url: $url"
#package="protobuf-all-$latest.tar.gz"
#curl -L "https://github.com/protocolbuffers/protobuf/releases/download/$latest/$package" -o $package
curl -L "$url" -o protobuf-all.tar.gz
tar zxvf protobuf-all.tar.gz

go get -u google.golang.org/grpc

