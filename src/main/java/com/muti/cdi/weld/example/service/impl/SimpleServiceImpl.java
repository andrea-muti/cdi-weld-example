package com.muti.cdi.weld.example.service.impl;

import com.muti.cdi.weld.example.Log;
import com.muti.cdi.weld.example.service.SimpleService;
import org.slf4j.Logger;
import javax.inject.Inject;

/**
 * Implementation of SimpleService
 */
public class SimpleServiceImpl implements SimpleService {

    /**
     * The logger is injected with CDI
     */
    @Inject @Log
    private Logger LOG;

    public void registerCourse(String course) {

        LOG.info("adding course: " + course);
    }
}