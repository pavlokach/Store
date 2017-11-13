public class Phone {
    String serialNumber;
    float price;
    PhoneSpec spec;


    public Phone(String model, String serialNumber, Type type, float price, boolean used) {
        this.spec = new PhoneSpec(type, model, used);
        this.serialNumber = serialNumber;
        this.price = price;

    }


    public void setPrice(float price) {
        this.price = price;
    }

    public PhoneSpec getSpec() {
        return spec;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public float getPrice() {
        return price;
    }


}
