package com.muti.cdi.weld.example.test.support;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;

/**
 *
 */
public class WeldContext {

    public static final WeldContext INSTANCE = new WeldContext();

    private final Weld weld;
    private final WeldContainer container;

    /**
     *
     */
    private WeldContext() {

        this.weld = new Weld();
        this.container = weld.initialize();
        Runtime.getRuntime().addShutdownHook(new Thread() {
            @Override
            public void run() {
                weld.shutdown();
            }
        });
    }

    /**
     *
     * @param type
     * @param <T>
     * @return
     */
    public <T> T getBean(Class<T> type) {

        return container.select(type).get();
    }
}