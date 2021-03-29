package org.rationalityfrontline.demo.pf4j;

import org.pf4j.ExtensionPoint;

public interface Greeting extends ExtensionPoint {
    String getGreeting();
}
