/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2_2;

/**
 *
 * @author usci
 */
public class HollePrintor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String hello = "Hello, World!"; 
        String hello1 = hello.replace('e', '0');
        String hello2 = hello1.replace('o','e');
        String hello3 = hello2.replace('0','o');
        System.out.println(hello3);
    }
    
}
