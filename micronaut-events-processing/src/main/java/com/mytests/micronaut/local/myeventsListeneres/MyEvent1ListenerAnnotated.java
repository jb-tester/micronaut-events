package com.mytests.micronaut.local.myeventsListeneres;

import com.mytests.micronaut.local.myevents.MyEvent1;
import io.micronaut.runtime.event.annotation.EventListener;

import javax.inject.Singleton;

/**
 * *
 * <p>Created by irina on 6/7/2021.</p>
 * <p>Project: micronaut-events</p>
 * *
 */
@Singleton
public class MyEvent1ListenerAnnotated {

    @EventListener
    public void onMyEvent1(MyEvent1 event) {
        System.out.println("MyEvent1 from annotated listener method");
    }


}
