package com.zpy.springboot;

import com.zpy.springboot.domain.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class SpringbootApplicationTests {
    private static final Logger LOGGER = LoggerFactory.getLogger(SpringbootApplicationTests.class);

    @Autowired
    private Person person;

    @Autowired
    private ApplicationContext applicationContext;

    @Test
    public void testAnnotation() {
        System.out.println(person);
        System.out.println(applicationContext.containsBean("helloService2"));
    }

    @Test
    public void testLogLevel() {
        LOGGER.trace("trace...");
        LOGGER.debug("debug...");
        LOGGER.info("info...");
        LOGGER.warn("warn...");
        LOGGER.error("error...");
    }
}
