package com.muti.cdi.weld.example.test.support;

import org.junit.runners.BlockJUnit4ClassRunner;
import org.junit.runners.model.InitializationError;

/**
 * JUnit Runner for Weld
 *
 * In order to enable CDI in JUnit tests, a custom JUnit runner was created
 * which enables to use Java EE annotations in our Unit tests
 */
public class WeldJUnit4Runner extends BlockJUnit4ClassRunner {

    /**
     * Public Constructor
     *
     * @param clazz
     * @throws InitializationError
     */
    public WeldJUnit4Runner(Class<Object> clazz) throws InitializationError {

        super(clazz);
    }

    @Override
    protected Object createTest() {

        final Class<?> test = getTestClass().getJavaClass();
        return WeldContext.INSTANCE.getBean(test);
    }
}