#!/usr/bin/env bash
go get -u google.golang.org/grpc
curl -fsSL https://goo.gl/getgrpc | bash -s -- --with-plugins
git clone git@github.com:googleapis/googleapis.git
sudo mv googleapis/google /usr/local/include/grpc/
folder=`ls /usr/local/Cellar/protobuf | head`
cp -R /usr/local/Cellar/protobuf/$folder/include/google /usr/local/include/grpc/