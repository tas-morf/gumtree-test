package com.gumtree.android.test.model.bean;

public class Metadata {
    private String name;
    private String value;

    private Metadata(Builder builder) {
        name = builder.name;
        value = builder.value;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getName() {
        return name;
    }

    public String getValue() {
        return value;
    }

    public static final class Builder {

        private String name;
        private String value;

        private Builder() {
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder value(String value) {
            this.value = value;
            return this;
        }

        public Metadata build() {
            return new Metadata(this);
        }
    }
}
