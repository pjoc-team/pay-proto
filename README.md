# proto
## Install grpc
```shell
go get -u google.golang.org/grpc

get_latest_release() {
  curl --silent "https://api.github.com/repos/$1/releases/latest" | # Get latest release from GitHub api
    grep '"tag_name":' |                                            # Get tag line
    sed -E 's/.*"([^"]+)".*/\1/'                                    # Pluck JSON value
}

latest=`get_latest_release "protocolbuffers/protobuf"`
package="protobuf-all-$latest.tar.gz"
curl -L "https://github.com/protocolbuffers/protobuf/releases/download/$latest/$package" -o $package
```
