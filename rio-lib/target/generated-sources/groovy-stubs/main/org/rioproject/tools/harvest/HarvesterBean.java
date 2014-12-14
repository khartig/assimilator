package org.rioproject.tools.harvest;

import java.lang.*;
import java.io.*;
import java.net.*;
import java.util.*;
import groovy.lang.*;
import groovy.util.*;

public class HarvesterBean
  extends java.lang.Object  implements
    org.rioproject.tools.harvest.Harvester,    groovy.lang.GroovyObject {
public HarvesterBean
(net.jini.discovery.DiscoveryManagement dMgr) {}
public  groovy.lang.MetaClass getMetaClass() { return (groovy.lang.MetaClass)null;}
public  void setMetaClass(groovy.lang.MetaClass mc) { }
public  java.lang.Object invokeMethod(java.lang.String method, java.lang.Object arguments) { return null;}
public  java.lang.Object getProperty(java.lang.String property) { return null;}
public  void setProperty(java.lang.String property, java.lang.Object value) { }
public  net.jini.lookup.JoinManager getJoiner() { return (net.jini.lookup.JoinManager)null;}
public  void setJoiner(net.jini.lookup.JoinManager value) { }
public  org.rioproject.deploy.ProvisionManager getMonitor() { return (org.rioproject.deploy.ProvisionManager)null;}
public  void setMonitor(org.rioproject.deploy.ProvisionManager value) { }
public final  java.util.List<org.rioproject.tools.harvest.HarvesterSession> getAgentsHandled() { return (java.util.List<org.rioproject.tools.harvest.HarvesterSession>)null;}
public  java.lang.Object getLogger() { return null;}
public  void setLogger(java.lang.Object value) { }
public  java.lang.String getHarvestDir() { return (java.lang.String)null;}
public  void setHarvestDir(java.lang.String value) { }
public  java.lang.Object export() { return null;}
public  java.lang.Object advertise(java.rmi.Remote remoteRef, net.jini.discovery.DiscoveryManagement dMgr) { return null;}
public  java.lang.Object unadvertise() { return null;}
public  org.rioproject.tools.harvest.HarvesterSession connect() { return (org.rioproject.tools.harvest.HarvesterSession)null;}
public  java.util.List<java.io.File> handleConnect(java.net.ServerSocket server, org.rioproject.tools.harvest.HarvesterSession hSession, java.io.File parent) { return (java.util.List<java.io.File>)null;}
public  int getAgentsHandledCount() { return (int)0;}
}
