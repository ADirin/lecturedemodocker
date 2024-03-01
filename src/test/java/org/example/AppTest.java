package org.example;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit test for simple App.
 */
public class AppTest 
    {

        App app = new App();
        @Test
        public void addMeTest(){

            assertEquals(app.addMe(3,2 ), 5);
        }
}
