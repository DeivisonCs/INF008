package notification;

import models.Event;
import notification.handler.EmailHandler;
import notification.handler.GoogleCalendarHandler;
import notification.handler.NotificationHandler;
import notification.handler.WhatsAppHandler;

public class Notificator {
    private NotificationHandler notificationChain;

    public Notificator() {
        this.notificationChain = new GoogleCalendarHandler();
        this.notificationChain
            .setNext(new WhatsAppHandler())
            .setNext(new EmailHandler());
    }

    public void notify(Event event) {
        notificationChain.notify(event);
    }
}
