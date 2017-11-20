class Phone {
    private double price;
    private PhoneSpec spec;
    private String serialNumber;

    Phone(String model, String serialNumber, Type type,
          double price, boolean used) {
        this.spec = new PhoneSpec(type, model, used);
        this.serialNumber = serialNumber;
        this.price = price;
    }

    void setPrice(double inputPrice) {
        this.price = inputPrice;
    }

    PhoneSpec getSpec() {
        return spec;
    }

    String getSerialNumber() {
        return serialNumber;
    }

    double getPrice() {
        return price;
    }
}
