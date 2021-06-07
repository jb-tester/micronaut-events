package com.mytests.micronaut.libraryEventsListening;

import com.mytests.micronaut.libevents.MyLibEvent2;
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
public class MyLibEvent2Listener implements ApplicationEventListener<MyLibEvent2> {
    @Override
    public void onApplicationEvent(MyLibEvent2 event) {
        System.out.println("MyLibEvent2 happened");
    }
}
