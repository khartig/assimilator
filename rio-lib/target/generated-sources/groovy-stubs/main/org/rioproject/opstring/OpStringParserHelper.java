package org.rioproject.opstring;

import java.lang.*;
import java.io.*;
import java.net.*;
import java.util.*;
import groovy.lang.*;
import groovy.util.*;

public class OpStringParserHelper
  extends java.lang.Object  implements
    groovy.lang.GroovyObject {
public  groovy.lang.MetaClass getMetaClass() { return (groovy.lang.MetaClass)null;}
public  void setMetaClass(groovy.lang.MetaClass mc) { }
public  java.lang.Object invokeMethod(java.lang.String method, java.lang.Object arguments) { return null;}
public  java.lang.Object getProperty(java.lang.String property) { return null;}
public  void setProperty(java.lang.String property, java.lang.Object value) { }
public  org.rioproject.sla.RuleMap.RuleDefinition getInFlightRuleDefinition() { return (org.rioproject.sla.RuleMap.RuleDefinition)null;}
public  void setInFlightRuleDefinition(org.rioproject.sla.RuleMap.RuleDefinition value) { }
public  org.rioproject.sla.RuleMap.ServiceDefinition getInFlightRuleServiceDefinition() { return (org.rioproject.sla.RuleMap.ServiceDefinition)null;}
public  void setInFlightRuleServiceDefinition(org.rioproject.sla.RuleMap.ServiceDefinition value) { }
public  java.util.List<org.rioproject.sla.RuleMap.ServiceDefinition> getInFlightRuleServiceDefinitions() { return (java.util.List<org.rioproject.sla.RuleMap.ServiceDefinition>)null;}
public  void setInFlightRuleServiceDefinitions(java.util.List<org.rioproject.sla.RuleMap.ServiceDefinition> value) { }
public  java.util.List<org.rioproject.sla.RuleMap> getInFlightRuleMaps() { return (java.util.List<org.rioproject.sla.RuleMap>)null;}
public  void setInFlightRuleMaps(java.util.List<org.rioproject.sla.RuleMap> value) { }
public  org.rioproject.opstring.ServiceElement applyServiceElementAttributes(org.rioproject.opstring.ServiceElement service, java.util.Map attributes, java.util.Map globalSettings) { return (org.rioproject.opstring.ServiceElement)null;}
public  void processResources(java.lang.Object parent, java.lang.String codebase, org.rioproject.opstring.ServiceElement service, java.lang.String... resources) { }
public  org.rioproject.associations.AssociationDescriptor createAssociationDescriptor(java.util.Map attributes, java.lang.Object opStringName) { return (org.rioproject.associations.AssociationDescriptor)null;}
public  org.rioproject.associations.AssociationDescriptor createAssociationManagement(java.util.Map attributes, org.rioproject.associations.AssociationDescriptor associationDescriptor) { return (org.rioproject.associations.AssociationDescriptor)null;}
public  void addAssociationDescriptor(org.rioproject.associations.AssociationDescriptor associationDescriptor, org.rioproject.opstring.ServiceElement service, java.lang.Object opStringAssociations) { }
public  org.rioproject.deploy.SystemComponent createSystemComponent(java.util.Map attributes, java.lang.String... skip) { return (org.rioproject.deploy.SystemComponent)null;}
public  void createAndAddSystemComponent(java.lang.Object parent, java.util.Map attributes, java.util.Map systemRequirementsTable, org.rioproject.opstring.ServiceElement service) { }
public  void addSystemComponent(java.lang.Object parent, java.lang.Object systemComponent, java.lang.Object systemRequirementsTable, java.lang.Object service) { }
public  org.rioproject.sla.SLA createSLA(java.util.Map attributes, boolean asRelative) { return (org.rioproject.sla.SLA)null;}
public  org.rioproject.deploy.SystemRequirements merge(org.rioproject.deploy.SystemRequirements base, org.rioproject.deploy.SystemRequirements sysRequirements) { return (org.rioproject.deploy.SystemRequirements)null;}
public  java.lang.String getSLAPolicyHandler(java.lang.String type) { return (java.lang.String)null;}
public  java.lang.String getSystemRequirementID(java.lang.String s) { return (java.lang.String)null;}
public  boolean isSystemRequirementGlobal(java.lang.String s) { return false;}
public  java.lang.Object toArray(java.lang.String s) { return null;}
public  java.util.Map capitalizeFirstLetterOfEachKey(java.util.Map map) { return (java.util.Map)null;}
public  java.lang.String capitalizeFirstLetter(java.lang.String s) { return (java.lang.String)null;}
public  void handleCommandLine(org.rioproject.exec.ExecDescriptor execDescriptor, java.lang.String command) { }
public  java.lang.String[] getServiceInterfaceNames(java.lang.String serviceName, org.rioproject.opstring.OpString opString) { return (java.lang.String[])null;}
}
