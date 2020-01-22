#!/bin/sh
mvn clean package && docker build -t ca.nait.dmit/dmit2015-exercises-jalejano1 .
docker rm -f dmit2015-exercises-jalejano1 || true && docker run -d -p 9080:9080 -p 9443:9443 --name dmit2015-exercises-jalejano1 ca.nait.dmit/dmit2015-exercises-jalejano1