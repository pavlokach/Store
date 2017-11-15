class Phone {
    private String serialNumber;
    float price;
    PhoneSpec spec;


    Phone(String model, String serialNumber, Type type, float price, boolean used) {
        this.spec = new PhoneSpec(type, model, used);
        this.serialNumber = serialNumber;
        this.price = price;
    }

    void setPrice(float price) {
        this.price = price;
    }

    PhoneSpec getSpec() {
        return spec;
    }

    String getSerialNumber() {
        return serialNumber;
    }

    float getPrice() {
        return price;
    }
}
