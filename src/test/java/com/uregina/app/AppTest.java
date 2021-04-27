package com.uregina.app;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue(){
        assertTrue(true);
    }

//////////////////Question 2 tests///////////////////////////////////////////
    @Test
    public void time24_am(){
        
        Time24 time24 = null;
        time24 = time24.toTime24(3, 36, AmPm.am);

        assertTrue(time24.toString().equals(" 3:36"));
    }

    @Test
    public void time24_pm(){
        
        Time24 time24 = null;
        time24 = time24.toTime24(3, 36, AmPm.pm);
        
        assertTrue(time24.toString().equals("15:36"));
        

    }

//**************SITUATIONS TO CONSIDER*************************
    //too short airport code
    //too long airport code
    //correct airport code

    //current arrival location != next departure location
    //current arrival location is next departure location

    //!= a Schengen area
    //is a Schengen area

    //no Schengen visa
    //have a Schengen visa

    //no ticket exists that meets requirements
        //due to layover time
        //due to flight time
        //due to both
    //ticket exists that meets requirements

    //arrival - departure > 2 days apart
    //arrival - departure <= 2 days apart





}
