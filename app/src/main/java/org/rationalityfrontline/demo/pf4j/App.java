package org.rationalityfrontline.demo.pf4j;

import org.pf4j.DefaultPluginManager;
import org.pf4j.PluginManager;
import java.util.List;

public class App {
    public static void main(String[] args) {
        PluginManager manager = new DefaultPluginManager();
        manager.loadPlugins();
        manager.startPlugins();
        List<Greeting> greetings = manager.getExtensions(Greeting.class);
        for (Greeting greeting: greetings) {
            System.out.println(">>> " + greeting.getGreeting());
        }
        manager.stopPlugins();
        manager.unloadPlugins();
    }
}
