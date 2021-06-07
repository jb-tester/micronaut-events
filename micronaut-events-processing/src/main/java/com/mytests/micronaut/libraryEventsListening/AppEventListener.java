package com.mytests.micronaut.libraryEventsListening;

import com.mytests.micronaut.local.myevents.MyEvent1;
import io.micronaut.context.event.ApplicationEvent;
import io.micronaut.context.event.ApplicationEventListener;

import javax.inject.Singleton;

/**
 * *
 * <p>Created by irina on 6/7/2021.</p>
 * <p>Project: micronaut-events</p>
 * *
 */
@Singleton
public class AppEventListener implements ApplicationEventListener<ApplicationEvent> {
    @Override  // navigates to publisher in the diff module
    public void onApplicationEvent(ApplicationEvent event) {
        System.out.println("application event "+event.getClass().getName()+" happened");
    }
}
