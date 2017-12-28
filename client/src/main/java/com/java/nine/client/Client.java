package com.java.nine.client;

import com.java.nine.hello.Hello;

import java.util.Objects;

public class Client {

    private static final String DEFAULT_NAME = "Client";

    private final String NAME;
    private final Hello HELLO;

    public Client() {
        this(DEFAULT_NAME);
    }

    public Client(final String NAME) {
        this.NAME = NAME;
        this.HELLO = new Hello(this.NAME);
    }

    public void greeting() {
        System.out.println(HELLO);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Client)) return false;
        Client client = (Client) o;
        return Objects.equals(NAME, client.NAME) &&
                Objects.equals(HELLO, client.HELLO);
    }

    @Override
    public int hashCode() {

        return Objects.hash(NAME, HELLO);
    }

    @Override
    public String toString() {
        return NAME;
    }
}
