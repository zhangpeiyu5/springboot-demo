package com.zpy.springboot.service;

import java.util.concurrent.Callable;
import java.util.logging.Logger;

public class HelloService {
    private Logger logger = Logger.getLogger("HelloService");

    Callable<HelloService> callable;

}
