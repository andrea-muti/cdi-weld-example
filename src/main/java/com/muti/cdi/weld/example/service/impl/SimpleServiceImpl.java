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

    /**
     * Processes the request whose id is provided
     *
     * @param reqId the id of the request to process
     */
    public void processRequest(String reqId) {

        LOG.info("processing request id: {}", reqId);
    }
}