package notification.strategy;

import models.Event;

public class WhatsAppNotification implements NotificationStrategy {

    @Override
    public void send(Event event) {
        System.out.println("\nMessage sent by WhatsApp:" +
                            "\n\tPriority: " + event.getPriority() +
                            "\n\tDescription: " + event.getDescription() +
                            "\n\tStarts At: " + event.getStartDate() +
                            "\n\tLocation: " + event.getLocation()
        );
    }

}
