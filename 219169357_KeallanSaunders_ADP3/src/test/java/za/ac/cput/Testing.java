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

import static org.junit.jupiter.api.Assertions.assertTimeoutPreemptively;
import java.util.concurrent.TimeUnit;

public class Testing {
    public Testing Boom1;
    public Testing Boom2;
    public Testing Boom3;


    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
        Boom1 = new Testing();
        Boom2 = new Testing();
        Boom3 = new Testing();
        Boom3 = Boom1;
    }



    @Test
    public void testEquality(){
        Assertions.assertEquals(Boom1,Boom3);
        System.out.println("Equality is working!");
    }
    @Test
    public void testIdentity(){
        Assertions.assertSame(Boom1,Boom3);
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
