class PhoneSpec {
    private boolean used;
    private Type type;
    private String model;

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

    boolean isUsed() {
        return used;
    }

    boolean sameAs(PhoneSpec other) {
        return other.getModel().equals(this.getModel())
                && other.isUsed() == this.isUsed()
                && other.getType().equals(this.getType());
    }
}
