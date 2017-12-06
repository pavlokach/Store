package inventory;

public class PhoneSpec {
    private boolean used;
    private Type type;
    private String model;

    public PhoneSpec(Type type, String model, Boolean used) {
        this.type = type;
        this.model = model;
        this.used = used;
    }

    public Type getType() {
        return type;
    }

    public String getModel() {
        return model;
    }

    public boolean isUsed() {
        return used;
    }

    public boolean sameAs(PhoneSpec other) {
        return other.getModel().equals(this.getModel())
                && other.isUsed() == this.isUsed()
                && other.getType().equals(this.getType());
    }

    @Override
    public String toString() {
        return "PhoneSpec{" +
                "used=" + used +
                ", type=" + type +
                ", model='" + model + '\'' +
                '}';
    }
}
