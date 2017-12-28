package com.java.nine.hello;

import java.util.Objects;

public final class Hello {

    private static final String DEFAULT_NAME = "World";

    private final String NAME;

    public Hello() {
        this(DEFAULT_NAME);
    }

    public Hello(final String NAME) {
        this.NAME = NAME;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Hello)) return false;
        Hello hello = (Hello) o;
        return Objects.equals(NAME, hello.NAME);
    }

    @Override
    public int hashCode() {

        return Objects.hash(NAME);
    }

    @Override
    public String toString() {
        final String FORMAT = "Hello, %s!";
        final boolean IS_NAME_INITIALIZED = NAME != null && !NAME.equals("");
        final String OUTPUT_NAME = IS_NAME_INITIALIZED ? NAME : DEFAULT_NAME;
        return String.format(FORMAT, OUTPUT_NAME);
    }
}
