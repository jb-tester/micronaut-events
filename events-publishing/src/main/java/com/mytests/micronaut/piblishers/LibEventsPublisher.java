package com.mytests.micronaut.piblishers;

import com.mytests.micronaut.libevents.MyLibEvent1;
import com.mytests.micronaut.libevents.MyLibEvent2;
import io.micronaut.context.event.ApplicationEventPublisher;
import io.micronaut.scheduling.annotation.Scheduled;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * *
 * <p>Created by irina on 6/7/2021.</p>
 * <p>Project: micronaut-events</p>
 * *
 */
@Singleton
public class LibEventsPublisher {

    @Inject
    ApplicationEventPublisher eventPublisher;

    @Scheduled(fixedRate = "100s")  // should navigate to listeners in the diff module
    public void publishSampleEvent() {
        eventPublisher.publishEvent(new MyLibEvent1());
        eventPublisher.publishEvent(new MyLibEvent2(this));
        System.out.println("lib events published");
    }
}
