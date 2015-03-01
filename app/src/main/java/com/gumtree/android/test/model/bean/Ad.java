package com.gumtree.android.test.model.bean;

import java.util.List;

public class Ad {

    private String title;
    private String description;
    private String location;
    private String shareUrl;
    private int price;
    private long reference;
    private Contact contact;
    private List<String> imageUrls;
    private List<Metadata> metadataList;
    private double latitude;
    private double longitude;

    private Ad(Builder builder) {
        title = builder.title;
        description = builder.description;
        location = builder.location;
        shareUrl = builder.shareUrl;
        price = builder.price;
        reference = builder.reference;
        contact = builder.contact;
        imageUrls = builder.imageUrls;
        metadataList = builder.metadataList;
        latitude = builder.latitude;
        longitude = builder.longitude;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getLocation() {
        return location;
    }

    public String getShareUrl() {
        return shareUrl;
    }

    public int getPrice() {
        return price;
    }

    public long getReference() {
        return reference;
    }

    public Contact getContact() {
        return contact;
    }

    public List<String> getImageUrls() {
        return imageUrls;
    }

    public List<Metadata> getMetadataList() {
        return metadataList;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public static final class Builder {

        private String title;
        private String description;
        private String location;
        private String shareUrl;
        private int price;
        private long reference;
        private Contact contact;
        private List<String> imageUrls;
        private List<Metadata> metadataList;
        private double latitude;
        private double longitude;

        private Builder() {
        }

        public Builder title(String title) {
            this.title = title;
            return this;
        }

        public Builder description(String description) {
            this.description = description;
            return this;
        }

        public Builder location(String location) {
            this.location = location;
            return this;
        }

        public Builder shareUrl(String shareUrl) {
            this.shareUrl = shareUrl;
            return this;
        }

        public Builder price(int price) {
            this.price = price;
            return this;
        }

        public Builder reference(long reference) {
            this.reference = reference;
            return this;
        }

        public Builder contact(Contact contact) {
            this.contact = contact;
            return this;
        }

        public Builder imageUrls(List<String> imageUrls) {
            this.imageUrls = imageUrls;
            return this;
        }

        public Builder metadataList(List<Metadata> metadataList) {
            this.metadataList = metadataList;
            return this;
        }

        public Builder latitude(double latitude) {
            this.latitude = latitude;
            return this;
        }

        public Builder longitude(double longitude) {
            this.longitude = longitude;
            return this;
        }

        public Ad build() {
            return new Ad(this);
        }
    }
}
