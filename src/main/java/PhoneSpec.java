public class PhoneSpec {
    Type type;
    String model;
    Boolean used;

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

    public Boolean isUsed() {
        return used;
    }

    public boolean sameAs(PhoneSpec other) {
        if (other.getModel().equals(this.getModel())) {
            return false;
        }
        if (other.isUsed().equals(this.isUsed())) {
            return false;
        }
        if (other.getType().equals(this.getType())) {
            return false;
        }
        return true;
    }
}
