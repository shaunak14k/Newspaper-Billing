/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DateCallculator;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author shaun
 */
public class CalculateDays 
{
    
    public static int getWorkingDaysBetweenTwoDates(Date startDate, Date endDate, boolean firstTimeBill) {
        
        if(firstTimeBill)
        {
            //Set start date to one day prior date
            startDate = new Date(startDate.getTime()-2);
        }
        
        Calendar startCal = Calendar.getInstance();
        startCal.setTime(startDate);        

        Calendar endCal = Calendar.getInstance();
        endCal.setTime(endDate);

        int workDays = 0;

        //Return 0 if start and end are the same
        if (startCal.getTimeInMillis() == endCal.getTimeInMillis()) {
            return 0;
        }

        if (startCal.getTimeInMillis() > endCal.getTimeInMillis()) {
            startCal.setTime(endDate);
            endCal.setTime(startDate);
        }

        do {
           //excluding start date
            startCal.add(Calendar.DAY_OF_MONTH, 1);
            if (startCal.get(Calendar.DAY_OF_WEEK) != Calendar.SUNDAY) {
                ++workDays;
            }
        } while (startCal.getTimeInMillis() < endCal.getTimeInMillis()); //excluding end date

        return workDays;
    }
    
    
    public static int getSundaysBetweenTwoDates(Date startDate, Date endDate, boolean firstTimeBill) {
        
        if(firstTimeBill)
        {
            //Set start date to one day prior date
            startDate = new Date(startDate.getTime()-2);
        }
        
        Calendar startCal = Calendar.getInstance();
        startCal.setTime(startDate);        

        Calendar endCal = Calendar.getInstance();
        endCal.setTime(endDate);

        int workDays = 0;

        //Return 0 if start and end are the same
        if (startCal.getTimeInMillis() == endCal.getTimeInMillis()) {
            return 0;
        }

        if (startCal.getTimeInMillis() > endCal.getTimeInMillis()) {
            startCal.setTime(endDate);
            endCal.setTime(startDate);
        }

        do {
           //excluding start date
            startCal.add(Calendar.DAY_OF_MONTH, 1);
            if (startCal.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
                ++workDays;
            }

        } while (startCal.getTimeInMillis() < endCal.getTimeInMillis()); //excluding end date

        return workDays;
    }
}
