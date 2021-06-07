package com.mytests.micronaut.startupEventListeners;

import io.micronaut.aop.Adapter;
import io.micronaut.context.event.StartupEvent;
import io.micronaut.context.event.ApplicationEventListener;

import javax.inject.Singleton;

/**
 * *
 * <p>Created by irina on 6/7/2021.</p>
 * <p>Project: micronaut-events</p>
 * *
 */
@Singleton
public class SecondListener {

    // should navigate to io.micronaut.context.DefaultBeanContext.start
    @Adapter(ApplicationEventListener.class)
    void onStartup(StartupEvent event) {
        System.out.println("StartupEvent from @Adapter(ApplicationEventListener)");
    }
}
