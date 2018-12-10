package org.eureka;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.springframework.boot.test.context.TestComponent;

import java.sql.Timestamp;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{

    public static void main(String[] args) {
        Timestamp time =new Timestamp(System.currentTimeMillis());
        System.out.println(time.getTime());
    }
}
