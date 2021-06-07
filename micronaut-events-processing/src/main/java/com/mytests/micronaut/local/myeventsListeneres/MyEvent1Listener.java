package com.mytests.micronaut.local.myeventsListeneres;

import com.mytests.micronaut.local.myevents.MyEvent1;
import io.micronaut.context.event.ApplicationEventListener;

import javax.inject.Singleton;

/**
 * *
 * <p>Created by irina on 6/7/2021.</p>
 * <p>Project: micronaut-events</p>
 * *
 */
@Singleton
public class MyEvent1Listener implements ApplicationEventListener<MyEvent1> {
    @Override
    public void onApplicationEvent(MyEvent1 event) {
        System.out.println("MyEvent1 from class implementing ApplicationEventListener");
    }
}
