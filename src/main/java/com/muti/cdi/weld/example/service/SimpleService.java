package com.muti.cdi.weld.example.service;

/**
 * Simple Service
 */
public interface SimpleService {

    /**
     * Processes the request whose id is provided
     *
     * @param reqId the id of the request to process
     */
    void processRequest(String reqId);
}