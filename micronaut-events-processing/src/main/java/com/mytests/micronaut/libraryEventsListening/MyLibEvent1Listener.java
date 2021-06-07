package com.mytests.micronaut.libraryEventsListening;

import com.mytests.micronaut.libevents.MyLibEvent1;
import io.micronaut.runtime.event.annotation.EventListener;

import javax.inject.Singleton;

/**
 * *
 * <p>Created by irina on 6/7/2021.</p>
 * <p>Project: micronaut-events</p>
 * *
 */
@Singleton
public class MyLibEvent1Listener {

    @EventListener
    public void onMyLibEvent1(MyLibEvent1 event){
        System.out.println(event.getMessage());
    }
}
