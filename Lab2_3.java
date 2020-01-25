/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2_3;

/**
 *
 * @author usci
 */
import java.util.GregorianCalendar;
public class Lab2_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    GregorianCalendar now = new GregorianCalendar();
    GregorianCalendar myBirthday = new GregorianCalendar(2001,
GregorianCalendar.AUGUST, 1);
    now.add(GregorianCalendar.DAY_OF_MONTH, 100);
    int dayOfMonth = now.get(GregorianCalendar.DAY_OF_MONTH);
    int month = now.get(GregorianCalendar.MONTH);
    int year = now.get(GregorianCalendar.YEAR);
    int weekday = now.get(GregorianCalendar.DAY_OF_WEEK);
    System.out.print(weekday);
    System.out.print(' ');
    System.out.print(dayOfMonth);
    System.out.print(' ');
    System.out.print(month);
    System.out.print(' ');
    System.out.println(year);
    
    myBirthday.add(GregorianCalendar.DAY_OF_MONTH,1000); 
    int dayOfMonthB = myBirthday.get(GregorianCalendar.DAY_OF_MONTH);
    int monthB = myBirthday.get(GregorianCalendar.MONTH);
    int yearB = myBirthday.get(GregorianCalendar.YEAR);
    int weekdayB = myBirthday.get(GregorianCalendar.DAY_OF_WEEK);
    System.out.print(weekdayB);
    System.out.print(' ');
    System.out.print(dayOfMonthB);
    System.out.print(' ');
    System.out.print(monthB);
    System.out.print(' ');
    System.out.print(yearB);
    }
    
}
