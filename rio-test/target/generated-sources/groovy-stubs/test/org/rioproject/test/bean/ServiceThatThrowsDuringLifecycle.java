package org.rioproject.test.bean;

import java.lang.*;
import java.io.*;
import java.net.*;
import java.util.*;
import groovy.lang.*;
import groovy.util.*;

public class ServiceThatThrowsDuringLifecycle
  extends java.lang.Object  implements
    groovy.lang.GroovyObject {
public  groovy.lang.MetaClass getMetaClass() { return (groovy.lang.MetaClass)null;}
public  void setMetaClass(groovy.lang.MetaClass mc) { }
public  java.lang.Object invokeMethod(java.lang.String method, java.lang.Object arguments) { return null;}
public  java.lang.Object getProperty(java.lang.String property) { return null;}
public  void setProperty(java.lang.String property, java.lang.Object value) { }
@org.rioproject.bean.Initialized() public  void initialized() { }
@org.rioproject.bean.Started() public  void started() { }
@org.rioproject.bean.PreDestroy() public  void destroyed() { }
@org.rioproject.bean.SetConfiguration() public  void setDaConfiguration(net.jini.config.Configuration config) { }
@org.rioproject.bean.SetParameters() public  void parms(java.util.Map<java.lang.String, ?> p) { }
@org.rioproject.bean.CreateProxy() public  java.lang.Object makeOne(java.lang.Object o) { return null;}
@org.rioproject.bean.PreAdvertise() public  java.lang.Object preAdv() { return null;}
}
