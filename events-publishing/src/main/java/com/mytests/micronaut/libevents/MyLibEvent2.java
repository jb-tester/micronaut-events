package com.mytests.micronaut.libevents;

import io.micronaut.context.event.ApplicationEvent;

/**
 * *
 * <p>Created by irina on 6/7/2021.</p>
 * <p>Project: micronaut-events</p>
 * *
 */
public class MyLibEvent2 extends ApplicationEvent {
    /**
     * Constructs a prototypical Event.
     *
     * @param source The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    public MyLibEvent2(Object source) {
        super(source);
    }
}
