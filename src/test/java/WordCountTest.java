/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author renee
 */
public class WordCountTest {
    
    public WordCountTest() {
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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unittests;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import com.plesba.kinesisproducer.*; 
import java.net.URI;

/**
 *
 * @author renee
 */
public class KProducerTest {
    long count ;
    String loadfilename;
    String propertiesFilename;
    
    private Object Files;
    
    
    public KProducerTest() {
        count = 0;
        loadfilename = null;
        propertiesFilename = null;
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

   @Test
    public void testRun() {
        System.out.println("run KProducerTest");
        
        String[] args = new String[2];
        args[0] =  "/home/renee/git/KinesisProducer/config.properties";
        args[1] = "/home/renee/git/KinesisProducer/HamCallSigns.csv";
        KProducer.main(args); 
        
    }
}

