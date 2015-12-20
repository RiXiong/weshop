/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zrx.common.util;

import freemarker.template.Template;
import java.util.Map;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 张日雄 <your.name at your.org>
 */
public class FreemarkerTest {
    
    public FreemarkerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of print method, of class Freemarker.
     */
    @Test
    public void testPrint() throws Exception {
        System.out.println("print");
        String ftlName = "";
        Map<String, Object> root = null;
        String ftlPath = "";
        Freemarker.print(ftlName, root, ftlPath);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of printFile method, of class Freemarker.
     */
    @Test
    public void testPrintFile() throws Exception {
        System.out.println("printFile");
        String ftlName = "";
        Map<String, Object> root = null;
        String outFile = "";
        String filePath = "";
        String ftlPath = "";
        Freemarker.printFile(ftlName, root, outFile, filePath, ftlPath);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTemplate method, of class Freemarker.
     */
    @Test
    public void testGetTemplate() throws Exception {
        System.out.println("getTemplate");
        String ftlName = "";
        String ftlPath = "";
        Template expResult = null;
        Template result = Freemarker.getTemplate(ftlName, ftlPath);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
