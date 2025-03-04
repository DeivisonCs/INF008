package notification.strategy;

import models.Event;

public class GoogleCalendarNotification implements NotificationStrategy {

    @Override
    public void send(Event event) {
        System.out.println("\n📆 Message added to google calendar:" +
                            "\n\tPriority: " + event.getPriority() +
                            "\n\tDescription: " + event.getDescription() +
                            "\n\tStarts At: " + event.getStartDate() +
                            "\n\tLocation: " + event.getLocation()
        );
    }

}
