package com.uregina.app;



import com.uregina.exceptions.MoreThanOneDayException;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
//import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertEquals;
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


//////////////////Question 3 tests///////////////////////////////////////////
    @Test
    public void Sub12Hr_test1 (){
        try{
        Time12 t1 = new Time12(2,2,AmPm.am);
        Time12 t2 = new Time12(1,1,AmPm.pm);
        int dif = t1.subtract(t1, t2);
        assertTrue(dif == -659);
        }catch(Exception InvalidTimeException){}
    }

    @Test
    public void Sub12Hr_test2 (){
        try{
        Time12 t1 = new Time12(2,1,AmPm.pm);
        Time12 t2 = new Time12(1,2,AmPm.am);
        int dif = t1.subtract(t1, t2);
        assertTrue(dif == 779);
        }catch(Exception InvalidTimeException){}
    }

    @Test
    public void Sub12Hr_test3 (){
        try{
        Time12 t1 = new Time12(2,1,AmPm.am);
        Time12 t2 = new Time12(1,1,AmPm.am);
        int dif = t1.subtract(t1, t2);
        assertTrue(dif == 60);
        }catch(Exception InvalidTimeException){}
    }

    @Test
    public void Sub12Hr_test4 (){
        try{
        Time12 t1 = new Time12(1,1,AmPm.am);
        Time12 t2 = new Time12(2,2,AmPm.am);
        int dif = t1.subtract(t1, t2);
        assertTrue(dif == -61);
        }catch(Exception InvalidTimeException){}
    }

    @Test
    public void Sub12Hr_test5 (){
        try{
        Time12 t1 = new Time12(1,1,AmPm.am);
        Time12 t2 = new Time12(2,1,AmPm.pm);
        int dif = t1.subtract(t1, t2);
        assertTrue(dif == -780);
        }catch(Exception InvalidTimeException){}
    }

    @Test
    public void Sub12Hr_test6 (){
        try{
        Time12 t1 = new Time12(1,2,AmPm.pm);
        Time12 t2 = new Time12(2,1,AmPm.am);
        int dif = t1.subtract(t1, t2);
        assertTrue(dif == 661);
        }catch(Exception InvalidTimeException){}
    }

    @Test
    public void Sub12Hr_test7 (){
        try{
        Time12 t1 = new Time12(1,1,AmPm.pm);
        Time12 t2 = new Time12(1,1,AmPm.am);
        int dif = t1.subtract(t1, t2);
        assertTrue(dif == 720);
        }catch(Exception InvalidTimeException){}
    }

    @Test
    public void Sub12Hr_test8 (){
        try{
        Time12 t1 = new Time12(1,2,AmPm.am);
        Time12 t2 = new Time12(1,1,AmPm.am);
        int dif = t1.subtract(t1, t2);
        assertTrue(dif == 1);
        }catch(Exception InvalidTimeException){}
    }

    @Test
    public void Sub12Hr_test9 (){
        try{
        Time12 t1 = new Time12(1,1,AmPm.am);
        Time12 t2 = new Time12(1,2,AmPm.pm);
        int dif = t1.subtract(t1, t2);
        assertTrue(dif == -721);
        }catch(Exception InvalidTimeException){}
    }

//////////////////Question 4 tests///////////////////////////////////////////
    @Test
    public void DateLessThan_test1 (){
        //mdy
        try{
        Date d1 = new Date(1,1,2001);
        Date d2 = new Date(2,2,2002);

        assertTrue(Date.lessThan(d1, d2));
        }catch(Exception InvalidDateException){}
    }

    @Test
    public void DateLessThan_test2 (){
        //mdy
        try{
        Date d1 = new Date(1,1,2001);
        Date d2 = new Date(1,2,2001);

        assertTrue(Date.lessThan(d1, d2));
        }catch(Exception InvalidDateException){}
    }
    
    @Test
    public void DateLessThan_test3 (){
        //mdy
        try{
        Date d1 = new Date(2,1,2002);
        Date d2 = new Date(1,2,2001);

        assertFalse(Date.lessThan(d1, d2));
        }catch(Exception InvalidDateException){}
    }

    
    @Test
    public void DateLessThan_test4 (){
        //mdy
        try{
        Date d1 = new Date(1,1,2002);
        Date d2 = new Date(1,1,2001);

        assertFalse(Date.lessThan(d1, d2));
        }catch(Exception InvalidDateException){}
    }

    
    @Test
    public void DateLessThan_test5 (){
        //mdy
        try{
        Date d1 = new Date(2,1,2001);
        Date d2 = new Date(1,1,2002);

        assertTrue(Date.lessThan(d1, d2));
        }catch(Exception InvalidDateException){}
    }

    
    @Test
    public void DateLessThan_test6 (){
        //mdy
        try{
        Date d1 = new Date(1,1,2001);
        Date d2 = new Date(2,1,2001);

        assertTrue(Date.lessThan(d1, d2));
        }catch(Exception InvalidDateException){}
    }

    
    @Test
    public void DateLessThan_test7 (){
        //mdy
        try{
        Date d1 = new Date(2,2,2001);
        Date d2 = new Date(1,1,2001);

        assertFalse(Date.lessThan(d1, d2));
        }catch(Exception InvalidDateException){}
    }

    
    @Test
    public void DateLessThan_test8 (){
        //mdy
        try{
        Date d1 = new Date(1,2,2002);
        Date d2 = new Date(2,1,2001);

        assertFalse(Date.lessThan(d1, d2));
        }catch(Exception InvalidDateException){}
    }

    
    @Test
    public void DateLessThan_test9 (){
        //mdy
        try{
        Date d1 = new Date(1,2,2001);
        Date d2 = new Date(1,1,2002);

        assertTrue(Date.lessThan(d1, d2));
        }catch(Exception InvalidDateException){}
    }

/*/////////////////Question 5 tests///////////////////////////////////////////
    @Test
    public void DateTimeSub_test1 (){
        try{
            DateTime d1 = new DateTime(new Date(1,1,2001), new Time12(6,0,AmPm.am));
            DateTime d2 = new DateTime(new Date(1,1,2002), new Time12(6,0,AmPm.am));
            assertThrows(MoreThanOneDayException.class, () -> {
                DateTime.subtract(d1,d2);
            });
    }catch(Exception invalidDatException){}
    }*/

    @Test
    public void DateTimeSub_test2 (){
        try{
            DateTime d1 = new DateTime(new Date(1,1,2001), new Time12(6,0,AmPm.pm));
            DateTime d2 = new DateTime(new Date(1,2,2001), new Time12(4,0,AmPm.am));
            assertEquals(DateTime.subtract(d1, d2), -600);
        }catch(Exception invalidDatException){}
    }

    @Test
    public void DateTimeSub_test3 (){
        try{
            DateTime d1 = new DateTime(new Date(12,31,2001), new Time12(6,0,AmPm.am));
            DateTime d2 = new DateTime(new Date(1,1,2002), new Time12(6,0,AmPm.pm));
            assertEquals(DateTime.subtract(d1, d2), -2160);
        }catch(Exception invalidDatException){}
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
