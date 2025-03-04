package notification.handler;

import java.time.LocalDate;

import models.Event;
import notification.strategy.WhatsAppNotification;

public class WhatsAppHandler  extends NotificationHandler{

    public WhatsAppHandler() {
        super(new WhatsAppNotification());
    }

    @Override
    protected boolean canHandle(Event event) {
        return event.getPriority() == 10 && event.startsAt(LocalDate.now());
    }

    @Override
    protected void processNotification(Event event) {
       super.strategy.send(event);
    }

}