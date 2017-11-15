class Phone {
    private float price;
    private PhoneSpec spec;
    private String serialNumber;

    Phone(String model, String serialNumber, Type type,
          float price, boolean used) {
        this.spec = new PhoneSpec(type, model, used);
        this.serialNumber = serialNumber;
        this.price = price;
    }

    void setPrice(float inputPrice) {
        this.price = inputPrice;
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
