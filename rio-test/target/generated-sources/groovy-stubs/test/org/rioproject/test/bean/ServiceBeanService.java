package org.rioproject.test.bean;

import java.lang.*;
import java.io.*;
import java.net.*;
import java.util.*;
import groovy.lang.*;
import groovy.util.*;

public class ServiceBeanService
  extends org.rioproject.jsb.ServiceBeanAdapter  implements
    org.rioproject.test.bean.ServiceBeanServiceInterface,    groovy.lang.GroovyObject {
public  groovy.lang.MetaClass getMetaClass() { return (groovy.lang.MetaClass)null;}
public  void setMetaClass(groovy.lang.MetaClass mc) { }
public  java.lang.Object invokeMethod(java.lang.String method, java.lang.Object arguments) { return null;}
public  java.lang.Object getProperty(java.lang.String property) { return null;}
public  void setProperty(java.lang.String property, java.lang.Object value) { }
public  java.util.concurrent.atomic.AtomicInteger getCount() { return (java.util.concurrent.atomic.AtomicInteger)null;}
public  void setCount(java.util.concurrent.atomic.AtomicInteger value) { }
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
public  org.rioproject.test.bean.ServiceBeanServiceInterfaceProxy getBogusProxy() { return (org.rioproject.test.bean.ServiceBeanServiceInterfaceProxy)null;}
public  void setBogusProxy(org.rioproject.test.bean.ServiceBeanServiceInterfaceProxy value) { }
@org.rioproject.bean.Initialized() public  void initialized() { }
@org.rioproject.bean.Started() public  void started() { }
@org.rioproject.bean.PreDestroy() public  void destroyed() { }
@org.rioproject.bean.SetConfiguration() public  void setDaConfiguration(net.jini.config.Configuration config) { }
public  java.lang.String getSomething() { return (java.lang.String)null;}
@org.rioproject.bean.SetServiceBeanContext() public  void setsbc(org.rioproject.core.jsb.ServiceBeanContext sbc) { }
@org.rioproject.bean.SetParameters() public  void parms(java.util.Map<java.lang.String, ?> p) { }
@org.rioproject.bean.CreateProxy() public  org.rioproject.test.bean.ServiceBeanServiceInterface makeOne(org.rioproject.test.bean.ServiceBeanServiceInterface o) { return (org.rioproject.test.bean.ServiceBeanServiceInterface)null;}
}
