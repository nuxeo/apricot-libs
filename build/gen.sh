#!/bin/bash -i

GEN_NAME=org.nuxeo.osgi.ide.project.generator
GEN_DIR=ide/project-generator
JAR=${GEN_DIR}/target/${GEN_NAME}-*.jar

#JAVA_OPTS="$JAVA_OPTS -Xdebug -Xrunjdwp:transport=dt_socket,address=8787,server=y,suspend=y"

echo "Generating plugins ..."

java $JAVA_OPTS -cp ${JAR} org.nuxeo.osgi.ide.project.generator.ProjectGenerator -clean ../ . plugins/pom.xml

echo "Done."