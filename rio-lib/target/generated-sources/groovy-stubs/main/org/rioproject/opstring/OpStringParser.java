package org.rioproject.opstring;

import java.lang.*;
import java.io.*;
import java.net.*;
import java.util.*;
import groovy.lang.*;
import groovy.util.*;

public interface OpStringParser
 {
 java.util.List<org.rioproject.opstring.OpString> parse(java.lang.Object source, java.lang.ClassLoader loader, java.lang.String[] defaultExportJars, java.lang.String[] defaultGroups, java.lang.Object loadPath);
}
