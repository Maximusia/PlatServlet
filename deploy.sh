#!/bin/bash

# Definition des varianles
APP_NAME="PlatServlet2"
SRC_DIR="src/main/java"
WEB_DIR="src/main/webapp"
BUILS_DIR="build"
LIB_DIR="lib"
TOMCAT_WEBAPPS="/opt/apache/apache-tomcat-10.0.16/webapps"
SERVLET_API_JAR="$LIB_DIR/servlet-api.jar"

# Netttoyage et creation du repertoire temporaire
rm -rf $BUILS_DIR
mkdir -p $BUILS_DIR/WEB-INF/classes
# Compilation des fichiers Java avec le JAR des Servlets
find $SRC_DIR -name "*.java" > sources.txt
javac -cp $SERVLET_API_JAR -d $BUILS_DIR/WEB-INF/classes @sources.txt
rm sources.txt

# Copier les fichiers web (web.xml, JSP, etc.)
cp -r $WEB_DIR/* $BUILS_DIR/

# Generer le fichier .war dans le dossier build
cd $BUILS_DIR || exit
jar -cvf $APP_NAME.war *
cd ..

# Deploiement dans Tomcat
cp -f $BUILS_DIR/$APP_NAME.war $TOMCAT_WEBAPPS/

echo ""

echo "Deploiement termine. Redemarrez Tomcat si necessaire."

echo ""