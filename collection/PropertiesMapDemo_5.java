package collection;

import java.util.*;

public class PropertiesMapDemo_5 {
    public static void main(String[] args) {
        Properties props = new Properties();

        props.setProperty("username", "admin");
        props.setProperty("password", "1234");

        System.out.println("Properties: " + props);

        // Access properties
        String user = props.getProperty("username");
        String pass = props.getProperty("password");
        System.out.println("Username: " + user + ", Password: " + pass);

        // Iterate over properties
        for (String key : props.stringPropertyNames()) {
            System.out.println(key + " => " + props.getProperty(key));
        }
    }
}

