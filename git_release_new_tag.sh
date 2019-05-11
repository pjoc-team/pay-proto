#!/usr/bin/env bash
#set -x
git pull --tags
last=`git tag | sort | tail -n 1`
tag=""
if [[ -z "$last" ]]; then
    tag="v0.0.1"
else
    minor_version=`echo $last | awk -F "." '{print $NF}'`
    major_version=`echo $last | awk -F "." '{RS="";for(i=1;i<NF;i++){RS=RS""$i"."};print RS}'`
    new_minor_version=$((minor_version+1))
    tag="$major_version$new_minor_version"
fi

echo "newTag: $tag"
git tag $tag && git push --tag
