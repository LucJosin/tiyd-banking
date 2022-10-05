package com.lucasjosino.models;

public class Contact {
    protected String phoneNumber;
    protected String website;
    protected String email;

    public Contact(String phoneNumber, String website, String email) {
        this.phoneNumber = phoneNumber;
        this.website = website;
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getWebsite() {
        return website;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "phoneNumber='" + phoneNumber + '\'' +
                ", website='" + website + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
