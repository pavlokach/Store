package inventory;

public class Phone {
    private double price;
    private PhoneSpec spec;
    private String serialNumber;

    public Phone(String model, String serialNumber, Type type,
                 float price, boolean used) {
        this.spec = new PhoneSpec(type, model, used);
        this.serialNumber = serialNumber;
        this.price = price;
    }

    public void setPrice(double inputPrice) {
        this.price = inputPrice;
    }

    public PhoneSpec getSpec() {
        return spec;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Phone{"
                + "price="
                + price
                + ", spec="
                + spec
                + ", serialNumber='"
                + serialNumber
                + '\''
                + '}';
    }
}
