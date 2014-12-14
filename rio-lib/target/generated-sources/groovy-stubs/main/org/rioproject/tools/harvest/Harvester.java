package org.rioproject.tools.harvest;

import java.lang.*;
import java.io.*;
import java.net.*;
import java.util.*;
import groovy.lang.*;
import groovy.util.*;

public interface Harvester
  extends
    java.rmi.Remote {
 org.rioproject.tools.harvest.HarvesterSession connect()throws java.rmi.RemoteException;
}
