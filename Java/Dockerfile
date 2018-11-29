FROM ubuntu

RUN apt-get update && \
    apt-get install -y openjdk-11-jdk && \
    apt-get install -y mysql-client && \
    mkdir /data

WORKDIR /data

# ENV JAVA_HOME /usr/lib/jvm/java-11-openjdk
ENV JAVA_TOOL_OPTIONS="-Djava.net.preferIPv4Stack=true -Djava.net.preferIPv4Addresses=true"

CMD /bin/bash wait.sh
