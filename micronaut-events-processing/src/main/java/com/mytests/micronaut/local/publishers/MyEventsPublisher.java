package com.mytests.micronaut.local.publishers;

import com.mytests.micronaut.local.myevents.MyEvent1;
import io.micronaut.context.event.ApplicationEventPublisher;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * *
 * <p>Created by irina on 6/7/2021.</p>
 * <p>Project: micronaut-events</p>
 * *
 */
@Singleton
public class MyEventsPublisher {

    @Inject
    ApplicationEventPublisher eventPublisher;

    public void publishSampleEvent() {
        eventPublisher.publishEvent(new MyEvent1());
    }
}
