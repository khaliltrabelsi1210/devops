/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testjava;

import static org.junit.Assert.assertEquals;
//import org.junit.Test;

/**
 *
 * @author emnat
 */
public class TestJava {
 public static int add(int a,int b)
{
    return a+b;
}
public static void addTest(){
    assertEquals(add(3,2),6);
}
 public static int multiply(int a,int b)
{
    return a*b;
}
  public static void multiplyTest()
{
    assertEquals(multiply(3,2),6);
}
   public static int divide(int a,int b)
{if (b==0)
    
            {throw new DivisionParZeroException();
            }
    return a/b;
}
     public static void divideTest()
{
    assertEquals(divide(4,0),2);
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
 try {
          divideTest();
        } catch (DivisionParZeroException e) {
            System.out.println("Une erreur s'est produite : " + e.getMessage());
        }
    }
    
}