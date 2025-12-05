package com.ryu.backend.api.hello;

public class HelloResponse {

    private String message;
    private String version;

    public HelloResponse(String message, String version) {
        this.message = message;
        this.version = version;
    }

    public String getMessage() {
        return message;
    }

    public String getVersion() {
        return version;
    }
}
