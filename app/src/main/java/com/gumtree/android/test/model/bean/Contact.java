package com.gumtree.android.test.model.bean;

import java.util.Date;

public class Contact {
    private String name;
    private String email;
    private String phone;
    private String postingPeriod;

    private Contact(Builder builder) {
        name = builder.name;
        email = builder.email;
        phone = builder.phone;
        postingPeriod = builder.postingPeriod;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getPostingPeriod() {
        return postingPeriod;
    }

    public static final class Builder {

        private String name;
        private String email;
        private String phone;
        private String postingPeriod;

        private Builder() {
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public Builder postingPeriod(String postingPeriod) {
            this.postingPeriod = postingPeriod;
            return this;
        }

        public Contact build() {
            return new Contact(this);
        }
    }
}
