package com.mytests.micronaut.startupEventListeners;

import io.micronaut.context.event.StartupEvent;
import io.micronaut.runtime.event.annotation.EventListener;

import javax.inject.Singleton;

/**
 * *
 * <p>Created by irina on 6/7/2021.</p>
 * <p>Project: micronaut-events</p>
 * *
 */
@Singleton
public class ThirdListener {

    @EventListener
    void onStartup(StartupEvent se) {
        System.out.println("StartupEvent from @EventListener-annotated method");
    }
}
