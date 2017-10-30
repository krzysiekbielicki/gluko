package pl.skyman.gluko.model;

public class EventValue {

    private final String label;
    private final String value;

    EventValue(String label, String value) {
        this.label = label;
        this.value = value;
    }

    public String getLabel() {
        return label;
    }

    public String getValue() {
        return value;
    }
}
