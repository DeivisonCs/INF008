package notification.strategy;

import models.Event;

public interface NotificationStrategy {
    public void send(Event event);
}
