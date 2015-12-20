/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.zrx.common.util.logger;

/**
 * <p>Description：
 * <p>Title：
 * @author 张日雄 <your.name at your.org>
 * @data 2015-12-20,14:07:32
 * @version 1.0
 */
public class Logger {
    
    private org.apache.log4j.Logger logger;
    
    /**
     * 
     * @param log4jLogger 
     */
    private Logger(org.apache.log4j.Logger log4jLogger) {
        logger = log4jLogger;
    }
    
    /**
     * 
     * @param classObject
     * @return 
     */
    public static Logger getLogger(Class classObject) {
        return null;
    }
    
    /**
     * 
     * @param loggerName
     * @return 
     */
    public static Logger getLogger(String loggerName) {
        return null;
    }
    
    /**
     * 
     * @param object 
     */
    public void debug(Object object) {
    }
    
    public void debug(Object object, Throwable e) {
    }
    
    public void info(Object object) {
    }
    
    public void info(Object object, Throwable e) {
    }
    
    public void warn(Object object) {
    }
    
    public void warn(Object object, Throwable e) {
    }
    
    public void error(Object object) {
    }
    
    public void error(Object object, Throwable e) {
    }
    
    public void fatal(Object object) {
    }
    
    public String getName() {
        return null;
    }
    
    public org.apache.log4j.Logger getLog4jLogger() {
        return null;
    }
    
    public boolean equals(Logger newLogger) {
        return false;
    }
    
}
