package unittests;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import com.plesba.beamtransformers.*; 
import java.net.URI;

import com.plesba.beamtransformers.*; 
 
/**
 *
 * @author renee
 */
public class WordCountTest {
    int count ;
    String loadFilename;   
    private Object Files;
    String outFilename;
    Object result;
    
    public WordCountTest() { 
        count = 0;
        loadFilename = "/home/renee/git/BeamTransformers/HamCallSigns.csv";
        outFilename = "/home/renee/git/BeamTransformers/TransformedHamCallSigns.csv";  
        result =null;
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
    public void testRun() throws InterruptedException { 
        Object result = null;
        String[] args = new String[2]; 
        args[0] =  loadFilename;
        args[1] = outFilename;
        
        WordCount.main(args); 
       
        
}
}

  