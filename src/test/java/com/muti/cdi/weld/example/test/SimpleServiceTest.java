package com.muti.cdi.weld.example.test;

import com.muti.cdi.weld.example.service.SimpleService;
import com.muti.cdi.weld.example.test.support.WeldJUnit4Runner;
import org.junit.Test;
import org.junit.runner.RunWith;
import javax.inject.Inject;

import static org.junit.Assert.assertNotNull;

/**
 * Unit Tests for SimpleService
 */
@RunWith(WeldJUnit4Runner.class)
public class SimpleServiceTest {

    @Inject
    private SimpleService simpleService;

    @Test
    public void testCDI() {

        assertNotNull("The simple service bean should be not null", simpleService);

        simpleService.processRequest("req-123");
    }
}