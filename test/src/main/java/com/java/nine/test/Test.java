package com.java.nine.test;

import com.java.nine.client.Client;

public class Test {

    public static void main(String[] args) {
        final String CLIENT_NAME = "Yevhen";
        Client client = new Client(CLIENT_NAME);
        client.greeting();
    }
}
