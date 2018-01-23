package org.kie.server.controller.client.examples;

public final class Utils {

    public static final String WEB_SOCKET_URL = "ws://localhost:8230/kie-server-controller/websocket/controller";
    public static final String REST_URL = "http://localhost:8230/kie-server-controller/rest/controller";
    public static final String USER = "kieserver";
    public static final String PASSWORD = "kieserver1!";

    private Utils(){}

    public static String getWebSocketUrl(){
        return System.getProperty("org.kie.server.controller", WEB_SOCKET_URL);
    }

    public static String getRestUrl() {
        return System.getProperty("org.kie.server.controller", REST_URL);
    }

    public static String getUser() {
        return System.getProperty("org.kie.server.controller.user", USER);
    }

    public static String getPassword() {
        return System.getProperty("org.kie.server.controller.pwd", PASSWORD);
    }
}
