class PhoneSpec {
    private Type type;
    private String model;
    Boolean used;

    PhoneSpec(Type type, String model, Boolean used) {
        this.type = type;
        this.model = model;
        this.used = used;
    }

    Type getType() {
        return type;
    }

    String getModel() {
        return model;
    }

    Boolean isUsed() {
        return used;
    }

    boolean sameAs(PhoneSpec other) {
        return other.getModel().equals(this.getModel()) && other.isUsed().equals(this.isUsed()) && other.getType().equals(this.getType());
    }
}
