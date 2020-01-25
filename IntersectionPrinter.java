/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2__1;

/**
 *
 * @author usci
 */
import java.util.Random;
import java.awt.Rectangle;

public class IntersectionPrinter
{
    public static void main(String[] args)
    {
        Random x = new Random();
        Random y = new Random();
        Random width = new Random();
        Random height = new Random();
        Rectangle r1 = new Rectangle(x.nextInt(51),y.nextInt(51),width.nextInt(51),height.nextInt(51));
        Rectangle r2 = new Rectangle(x.nextInt(51),y.nextInt(51),width.nextInt(51),height.nextInt(51));
        Rectangle r3 = r1.intersection(r2);
        System.out.println(r1);
        System.out.println(r2);
        System.out.print("Is the intersected rectangle empty:?");
        System.out.println(r3.isEmpty());
        
    }
}