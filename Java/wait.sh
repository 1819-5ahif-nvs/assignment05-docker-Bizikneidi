#!/bin/bash
# wait until MariaDB is really available
maxcounter=60
 
counter=1
while ! mysql -h mysql -u"root" -p"example" -e "show databases;"; do
    echo "waiting for Godot..."
    sleep 1
    counter=`expr $counter + 1`
    if [ $counter -gt $maxcounter ]; then
        >&2 echo "We have been waiting for MySQL too long already; failing."
        exit 1
    fi;
done
echo "yeah, mysql available, so lets go..."
java $JAVA_TOOL_OPTIONS -jar target/microprofile-thorntail.jar
