package org.rationalityfrontline.demo.pf4j;

import org.pf4j.Extension;

@Extension
public class WelcomeGreeting implements Greeting {
    public String getGreeting() {
        return "Welcome";
    }
}
