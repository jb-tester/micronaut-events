package com.mytests.micronaut.listeners;

import com.mytests.micronaut.eventsLibrary.MyLibEvent00;
import io.micronaut.runtime.event.annotation.EventListener;

import javax.inject.Singleton;

/**
 * *
 * <p>Created by irina on 6/7/2021.</p>
 * <p>Project: micronaut-events</p>
 * *
 */
@Singleton
public class MyLibEvent00Listener {

    @EventListener  // should navigate to publisher in the diff module
    public void onMyLibEvent00(MyLibEvent00 event){
        System.out.println(event.getMessage());
    }
}
