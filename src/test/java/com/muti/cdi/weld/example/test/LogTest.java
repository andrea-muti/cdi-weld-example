package com.muti.cdi.weld.example.test;

import com.muti.cdi.weld.example.service.SimpleService;
import com.muti.cdi.weld.example.test.support.WeldJUnit4Runner;
import org.junit.Test;
import org.junit.runner.RunWith;
import javax.inject.Inject;

import static org.junit.Assert.assertNotNull;

/**
 *
 */
@RunWith(WeldJUnit4Runner.class)
public class LogTest {

    @Inject
    private SimpleService courseService;

    @Test
    public void testCDI() {

        assertNotNull("The course service bean should be not null", courseService);

        courseService.registerCourse("learning jave ee");
    }

}
