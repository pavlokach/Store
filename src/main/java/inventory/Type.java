package inventory;

public enum Type {
    SLIDER, BAR, FLIP, SMARTPHONE;

    public String getString() {
        switch (this) {
            case BAR:
                return "bar";
            case FLIP:
                return "flip";
            case SLIDER:
                return "slider";
            case SMARTPHONE:
                return "smartphone";
            default:
                return "Wrong type";
        }
    }
}

