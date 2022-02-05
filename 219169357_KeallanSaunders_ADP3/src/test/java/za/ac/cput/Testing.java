/**
 * Testing.java
 * @author Keallan Saunders 219169357
 * TestingClass
 * 05 Feb 2022
 */
package za.ac.cput;

import java.time.Duration;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Assertions;
import za.ac.cput.Domain.MultiplyNumbers;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTimeoutPreemptively;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

public class Testing {



    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
    }
    @Test
    public void testEquality(){
        MultiplyNumbers a = new MultiplyNumbers("Bonno");
        assertEquals("Bonno",a.getSname());
        System.out.println("Equality is working!");
    }
    @Test
    public void testIdentity(){
        MultiplyNumbers a = new MultiplyNumbers("Bonno");
        assertTrue(a.Boosting());
        System.out.println("Identity is working!");
    }
    @Test
    public void testFailing(){
        Assertions.assertTrue(true);
        System.out.println("This program does not work!");
    }
    @Test
    @Timeout(4)
    public void timeouttest() throws InterruptedException {
        Thread.sleep(3500);
        System.out.println("This Test Passed within allocated Time");
    }

    @Test
    @Disabled
    public void testDisable(){
        System.out.println("This Test has been DISABLED!");
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }


    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception {
    }
}
