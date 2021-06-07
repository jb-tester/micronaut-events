package com.mytests.micronaut.startupEventListeners;

import io.micronaut.context.event.ApplicationEventListener;
import io.micronaut.context.event.StartupEvent;
import io.micronaut.runtime.server.event.ServerStartupEvent;

import javax.inject.Singleton;

/**
 * *
 * <p>Created by irina on 6/7/2021.</p>
 * <p>Project: micronaut-events</p>
 * *
 */
@Singleton
public class FirstListener implements ApplicationEventListener<StartupEvent> {
    @Override
    public void onApplicationEvent(StartupEvent event) {
        System.out.println("StartupEvent from class that implements ApplicationEventListener<StartupEvent>");
    }
}
