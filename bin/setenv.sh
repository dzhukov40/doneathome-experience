CATALINA_OPTS="
-Dcom.sun.management.jmxremote
  -Dcom.sun.management.jmxremote.port=8090
  -Dcom.sun.management.jmxremote.ssl=false
  -Dcom.sun.management.jmxremote.authenticate=false
  -Djava.rmi.server.hostname=195.26.187.155
  -Xms2048m
  -Xmx2048m
  -XX:MaxPermSize=256m
  -DconfigLocation=/opt/searchwiz/conf
  -Dfile.encoding=UTF8
  -Dlog.base=/opt/searchwiz
  -Dlog4j.configuration=file:/opt/searchwiz/conf/coordinator-log4j.properties"

CATALINA_PID=/opt/searchwiz/coordinator/temp/catalina.pid