package org.rioproject.test.bean;

import java.lang.*;
import java.io.*;
import java.net.*;
import java.util.*;
import groovy.lang.*;
import groovy.util.*;

public class AnnotatedService
  extends java.lang.Object  implements
    groovy.lang.GroovyObject {
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
public  boolean getConfigInvoked() { return false;}
public  boolean isConfigInvoked() { return false;}
public  void setConfigInvoked(boolean value) { }
public  boolean getContextInvoked() { return false;}
public  boolean isContextInvoked() { return false;}
public  void setContextInvoked(boolean value) { }
public  boolean getPreAdvertisedInvoked() { return false;}
public  boolean isPreAdvertisedInvoked() { return false;}
public  void setPreAdvertisedInvoked(boolean value) { }
public  boolean getPostUnAdvertisedInvoked() { return false;}
public  boolean isPostUnAdvertisedInvoked() { return false;}
public  void setPostUnAdvertisedInvoked(boolean value) { }
public  boolean getParametersInvoked() { return false;}
public  boolean isParametersInvoked() { return false;}
public  void setParametersInvoked(boolean value) { }
public  boolean getServiceBeanInvoked() { return false;}
public  boolean isServiceBeanInvoked() { return false;}
public  void setServiceBeanInvoked(boolean value) { }
public  java.util.List<java.lang.String> getOrder() { return (java.util.List<java.lang.String>)null;}
public  void setOrder(java.util.List<java.lang.String> value) { }
@org.rioproject.bean.Initialized() public  void initialized() { }
@org.rioproject.bean.Started() public  void started() { }
@org.rioproject.bean.PreDestroy() public  void destroyed() { }
@org.rioproject.bean.SetConfiguration() public  void config(net.jini.config.Configuration config) { }
@org.rioproject.bean.SetServiceBeanContext() public  void context(org.rioproject.core.jsb.ServiceBeanContext context) { }
@org.rioproject.bean.SetParameters() public  void parameters(java.util.Map<java.lang.String, java.lang.Object> parameters) { }
@org.rioproject.bean.SetServiceBean() public  void serviceBean(org.rioproject.core.jsb.ServiceBean bean) { }
@org.rioproject.bean.PreAdvertise() public  void preAdvertise() { }
@org.rioproject.bean.PostUnAdvertise() public  void postUnAdvertise() { }
}
