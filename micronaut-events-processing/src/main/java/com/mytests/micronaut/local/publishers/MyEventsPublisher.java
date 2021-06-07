package com.mytests.micronaut.local.publishers;

import com.mytests.micronaut.eventsLibrary.MyLibEvent00;
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
        eventPublisher.publishEvent(new MyEvent1());  // navigates to listeners in the same module
        eventPublisher.publishEvent(new MyLibEvent00());  // navigates to listener in diff module
    }
}
