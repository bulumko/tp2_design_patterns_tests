/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.nyaba.test.structural;

import com.nyaba.tp2_design_patterns.structural.Composite.Component;
import com.nyaba.tp2_design_patterns.structural.Composite.Composit;
import com.nyaba.tp2_design_patterns.structural.Composite.Leaf;
import java.awt.Composite;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author cnyaba
 */
public class TestComposite {
    
    public TestComposite() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testingComposite() {
        int id =0;
        Leaf leaf = new Leaf("Buja");
        Composit composite = new Composit();
        
        composite.add(leaf);
        Component index = composite.getComponent(id);
        
        assertNotNull(index);
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
