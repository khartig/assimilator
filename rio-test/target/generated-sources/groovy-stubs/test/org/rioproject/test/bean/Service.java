package org.rioproject.test.bean;

import java.lang.*;
import java.io.*;
import java.net.*;
import java.util.*;
import groovy.lang.*;
import groovy.util.*;

public class Service
  extends java.lang.Object  implements
    org.rioproject.test.bean.ServiceInterface,    groovy.lang.GroovyObject {
public  groovy.lang.MetaClass getMetaClass() { return (groovy.lang.MetaClass)null;}
public  void setMetaClass(groovy.lang.MetaClass mc) { }
public  java.lang.Object invokeMethod(java.lang.String method, java.lang.Object arguments) { return null;}
public  java.lang.Object getProperty(java.lang.String property) { return null;}
public  void setProperty(java.lang.String property, java.lang.Object value) { }
public  boolean getInitializedInvoked() { return false;}
public  boolean isInitializedInvoked() { return false;}
public  void setInitializedInvoked(boolean value) { }
public  boolean getStartedInvoked() { return false;}
public  boolean isStartedInvoked() { return false;}
public  void setStartedInvoked(boolean value) { }
public  boolean getDestroyedInvoked() { return false;}
public  boolean isDestroyedInvoked() { return false;}
public  void setDestroyedInvoked(boolean value) { }
public  void setSomething(java.lang.String value) { }
public  java.lang.String getSomething2() { return (java.lang.String)null;}
public  void setSomething2(java.lang.String value) { }
public  java.util.Map<java.lang.String, ?> getParms() { return (java.util.Map<java.lang.String, ?>)null;}
public  void setParms(java.util.Map<java.lang.String, ?> value) { }
public  org.rioproject.test.bean.ServiceInterfaceProxy getBogusProxy() { return (org.rioproject.test.bean.ServiceInterfaceProxy)null;}
public  void setBogusProxy(org.rioproject.test.bean.ServiceInterfaceProxy value) { }
public  java.util.List<java.lang.String> getOrder() { return (java.util.List<java.lang.String>)null;}
public  void setOrder(java.util.List<java.lang.String> value) { }
@org.rioproject.bean.Initialized() public  void initialized() { }
@org.rioproject.bean.PreAdvertise() public  void preAdvertise() { }
@org.rioproject.bean.Started() public  void started() { }
public  void setService(org.rioproject.test.bean.ServiceInterface service) { }
@org.rioproject.bean.PreDestroy() public  void destroyed() { }
@org.rioproject.bean.SetConfiguration() public  void setDaConfiguration(net.jini.config.Configuration config) { }
public  java.lang.String getSomething() { return (java.lang.String)null;}
@org.rioproject.bean.SetParameters() public  void parms(java.util.Map<java.lang.String, ?> p) { }
@org.rioproject.bean.CreateProxy() public  org.rioproject.test.bean.ServiceInterface makeOne(org.rioproject.test.bean.ServiceInterface o) { return (org.rioproject.test.bean.ServiceInterface)null;}
}
