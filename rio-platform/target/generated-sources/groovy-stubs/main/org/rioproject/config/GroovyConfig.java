package org.rioproject.config;

import net.jini.config.*;
import java.lang.*;
import java.io.*;
import java.net.*;
import java.util.*;
import groovy.lang.*;
import groovy.util.*;

@groovy.util.logging.Slf4j() public class GroovyConfig
  extends java.lang.Object  implements
    net.jini.config.Configuration,    groovy.lang.GroovyObject {
@java.lang.SuppressWarnings(value="unused") public GroovyConfig
(java.lang.String gFile) {}
public GroovyConfig
(java.lang.String[] args, java.lang.ClassLoader loader) {}
public  groovy.lang.MetaClass getMetaClass() { return (groovy.lang.MetaClass)null;}
public  void setMetaClass(groovy.lang.MetaClass mc) { }
public  java.lang.Object invokeMethod(java.lang.String method, java.lang.Object arguments) { return null;}
public  java.lang.Object getProperty(java.lang.String property) { return null;}
public  void setProperty(java.lang.String property, java.lang.Object value) { }
public  java.lang.Object checkInputs(java.lang.String... args) { return null;}
public  java.lang.Object traverseInputs(java.lang.String[] args, java.lang.ClassLoader loader) { return null;}
public  java.lang.Object clear() { return null;}
public  java.lang.Object parseAndLoad(groovy.lang.GroovyCodeSource groovyCodeSource, groovy.lang.GroovyClassLoader gcl) { return null;}
public  java.lang.Object load(java.lang.Class groovyClass) { return null;}
public  java.lang.String getComponentName(groovy.lang.MetaClass mc) { return (java.lang.String)null;}
public  java.lang.Object getEntry(java.lang.String component, java.lang.String name, java.lang.Class type) { return null;}
public  java.lang.Object getEntry(java.lang.String component, java.lang.String name, java.lang.Class type, java.lang.Object defaultValue) { return null;}
public  java.lang.Object getEntry(java.lang.String component, java.lang.String name, java.lang.Class type, java.lang.Object defaultValue, java.lang.Object data) { return null;}
public  java.lang.Object getPrimitiveType(java.lang.Class type) { return null;}
public  boolean validIdentifier(java.lang.String name) { return false;}
public  boolean validQualifiedIdentifier(java.lang.String name) { return false;}
}
