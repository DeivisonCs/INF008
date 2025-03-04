package notification.handler;

import models.Event;
import notification.strategy.GoogleCalendarNotification;

public class GoogleCalendarHandler extends NotificationHandler{

    public GoogleCalendarHandler() {
        super(new GoogleCalendarNotification());
    }

    @Override
    protected boolean canHandle(Event event) {
        return event.getPriority() >= 1;
    }

    @Override
    protected void processNotification(Event event) {
       super.strategy.send(event);
    }

}