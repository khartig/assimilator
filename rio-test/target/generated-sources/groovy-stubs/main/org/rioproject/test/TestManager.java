package org.rioproject.test;

import org.rioproject.opstring.*;
import java.lang.*;
import java.io.*;
import java.net.*;
import java.util.*;
import groovy.lang.*;
import groovy.util.*;

@groovy.util.logging.Slf4j() public class TestManager
  extends java.lang.Object  implements
    groovy.lang.GroovyObject {
public TestManager
() {
super ();
}
public TestManager
(boolean createShutdownHook) {}
public  groovy.lang.MetaClass getMetaClass() { return (groovy.lang.MetaClass)null;}
public  void setMetaClass(groovy.lang.MetaClass mc) { }
public  java.lang.Object invokeMethod(java.lang.String method, java.lang.Object arguments) { return null;}
public  java.lang.Object getProperty(java.lang.String property) { return null;}
public  void setProperty(java.lang.String property, java.lang.Object value) { }
public static final  java.lang.String getTEST_HOSTS() { return (java.lang.String)null;}
public  java.util.List<org.rioproject.tools.webster.Webster> getWebsters() { return (java.util.List<org.rioproject.tools.webster.Webster>)null;}
public  void setWebsters(java.util.List<org.rioproject.tools.webster.Webster> value) { }
public  java.util.List<java.lang.Process> getProcesses() { return (java.util.List<java.lang.Process>)null;}
public  void setProcesses(java.util.List<java.lang.Process> value) { }
public  org.rioproject.resources.client.JiniClient getClient() { return (org.rioproject.resources.client.JiniClient)null;}
public  void setClient(org.rioproject.resources.client.JiniClient value) { }
public  java.lang.String getRioHome() { return (java.lang.String)null;}
public  void setRioHome(java.lang.String value) { }
public  java.lang.String getGroups() { return (java.lang.String)null;}
public  void setGroups(java.lang.String value) { }
public  java.lang.String getOpStringToDeploy() { return (java.lang.String)null;}
public  void setOpStringToDeploy(java.lang.String value) { }
public  org.rioproject.opstring.OperationalStringManager getDeployedOperationalStringManager() { return (org.rioproject.opstring.OperationalStringManager)null;}
public  void setDeployedOperationalStringManager(org.rioproject.opstring.OperationalStringManager value) { }
public  net.jini.lookup.ServiceDiscoveryManager getServiceDiscoveryManager() { return (net.jini.lookup.ServiceDiscoveryManager)null;}
public  void setServiceDiscoveryManager(net.jini.lookup.ServiceDiscoveryManager value) { }
public  java.util.List<java.lang.String> getHostList() { return (java.util.List<java.lang.String>)null;}
public  void setHostList(java.util.List<java.lang.String> value) { }
public  java.lang.Object getConfig() { return null;}
public  void setConfig(java.lang.Object value) { }
public  boolean getCreateShutdownHook() { return false;}
public  boolean isCreateShutdownHook() { return false;}
public  void setCreateShutdownHook(boolean value) { }
public  org.rioproject.test.TestConfig getTestConfig() { return (org.rioproject.test.TestConfig)null;}
public  void setTestConfig(org.rioproject.test.TestConfig value) { }
public  void init(org.rioproject.test.TestConfig testConfig) { }
public  java.lang.Object postInit() { return null;}
public  org.rioproject.cybernode.Cybernode startCybernode() { return (org.rioproject.cybernode.Cybernode)null;}
public  org.rioproject.cybernode.Cybernode startCybernode(int hostIndex) { return (org.rioproject.cybernode.Cybernode)null;}
public  org.rioproject.monitor.ProvisionMonitor startProvisionMonitor() { return (org.rioproject.monitor.ProvisionMonitor)null;}
public  org.rioproject.monitor.ProvisionMonitor startProvisionMonitor(int hostIndex) { return (org.rioproject.monitor.ProvisionMonitor)null;}
public  org.rioproject.tools.webster.Webster startWebster(int port, java.lang.String dirs) { return (org.rioproject.tools.webster.Webster)null;}
public  net.jini.core.lookup.ServiceRegistrar startReggie() { return (net.jini.core.lookup.ServiceRegistrar)null;}
public  org.rioproject.opstring.OperationalStringManager deploy() { return (org.rioproject.opstring.OperationalStringManager)null;}
public  org.rioproject.opstring.OperationalStringManager deploy(java.lang.String opstring) { return (org.rioproject.opstring.OperationalStringManager)null;}
public  org.rioproject.opstring.OperationalStringManager deploy(java.io.File opstring) { return (org.rioproject.opstring.OperationalStringManager)null;}
public  org.rioproject.opstring.OperationalStringManager deploy(java.io.File opstring, org.rioproject.monitor.ProvisionMonitor monitor) { return (org.rioproject.opstring.OperationalStringManager)null;}
public  org.rioproject.opstring.OperationalStringManager deploy(java.net.URL opstring) { return (org.rioproject.opstring.OperationalStringManager)null;}
public  org.rioproject.opstring.OperationalStringManager deploy(java.net.URL opstring, org.rioproject.monitor.ProvisionMonitor monitor) { return (org.rioproject.opstring.OperationalStringManager)null;}
public  org.rioproject.opstring.OperationalStringManager deploy(org.rioproject.opstring.OperationalString opstring, org.rioproject.monitor.ProvisionMonitor monitor) { return (org.rioproject.opstring.OperationalStringManager)null;}
public  boolean undeploy(java.lang.String name) { return false;}
public  boolean undeploy(java.lang.String name, org.rioproject.monitor.ProvisionMonitor monitor) { return false;}
public  java.lang.Object undeployAll(org.rioproject.monitor.ProvisionMonitor monitor) { return null;}
public  org.rioproject.opstring.OperationalStringManager getOperationalStringManager() { return (org.rioproject.opstring.OperationalStringManager)null;}
public  org.rioproject.opstring.OperationalStringManager getOperationalStringManager(java.lang.String name) { return (org.rioproject.opstring.OperationalStringManager)null;}
public  java.lang.Object stopCybernode(java.lang.Object service) { return null;}
public  java.lang.Object stopProvisionMonitor(java.lang.Object service) { return null;}
public  java.lang.Object stopService(java.lang.Object service, java.lang.String name) { return null;}
public  java.lang.Object shutdown() { return null;}
public  java.lang.Object maybeRunHarvester() { return null;}
public  java.lang.Object getHarvester(net.jini.discovery.DiscoveryManagement dMgr) { return null;}
public  void waitForDeployment(org.rioproject.opstring.OperationalStringManager mgr) { }
public  net.jini.core.lookup.ServiceItem[] getServiceItems(java.lang.Class type) { return (net.jini.core.lookup.ServiceItem[])null;}
public  java.lang.Object getServices(java.lang.Class type) { return null;}
public  java.lang.Object getServices(java.lang.Class type, java.lang.String name) { return null;}
public  java.lang.Object waitForService(java.lang.Class type) { return null;}
public  java.lang.Object waitForService(java.lang.String serviceName) { return null;}
public  java.lang.Object waitForService(java.lang.Class type, java.lang.String name) { return null;}
}
