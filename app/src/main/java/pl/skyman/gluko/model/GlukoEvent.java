package pl.skyman.gluko.model;

import java.util.Date;
import java.util.List;

public class GlukoEvent {

    private final Date date;
    private final EventType type;
    private final List<EventValue> values;

    public GlukoEvent(Date date, EventType type, List<EventValue> values) {
        this.date = date;
        this.type = type;
        this.values = values;
    }

    public Date getDate() {
        return date;
    }

    public EventType getType() {
        return type;
    }

    public List<EventValue> getValues() {
        return values;
    }
}
