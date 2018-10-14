/*TODO:Create listeners for spring events.*/
package com.exercise.event;

import org.springframework.context.event.ContextStartedEvent;
import org.springframework.context.event.ContextStoppedEvent;
import org.springframework.context.event.EventListener;

public class MultiEventListener {
    @EventListener(ContextStartedEvent.class)
    void start() {
        System.out.println("----------------start");
    }

    @EventListener(ContextStoppedEvent.class)
    void stopped() {
        System.out.println("----------------stopped");
    }
}
