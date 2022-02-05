/**
 * testDivision.java
 * @author Raeece Samuels 217283764
 * TestingClass for Division
 * 05 Feb 2022
 */
package za.ac.cput;

import java.time.*;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.assertTimeoutPreemptively;
import java.util.concurrent.TimeUnit;
public class testDivision {
    public testDivision some1;
    public testDivision no1;
    public testDivision yes1;

    @org.junit.jupiter.api.BeforeAll
    public static void createClass() throws Exception {
    }

    @org.junit.jupiter.api.BeforeEach
    public void create() throws Exception {
        yes1 = new testDivision();
        no1 = new testDivision();
        some1 = new testDivision();
        yes1 = some1;
    }

    @Test
    public void testEqual() {
        Assertions.assertEquals(yes1, some1);
        System.out.println("Equality is successful!!!");
    }

    @Test
    public void testId() {
        Assertions.assertSame(yes1, some1);
        System.out.println("Identity is successful!!!");
    }

    @Test
    public void testFailed() {
        Assertions.assertTrue(true);
        System.out.println("This program is not working properly");
    }

    @Test
    @Timeout(4);
    public void testingTimeout() throws InterruptedException{
        Thread.sleep(3500);
        System.out.println("This test has been successful in the appropriate time length");
    }

    @Test
    @Disabled
    public void disablingtest(){

        System.out.println("Test has been successfully disabled");
    }





    @org.junit.jupiter.api.AfterAll
    public static void breakDownClass () throws Exception{
    }

    @org.junit.jupiter.api.AfterEach
    public void breakDown() throws Exception {
    }






}
