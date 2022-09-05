/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;

import java.util.Scanner;

/**
 *
 * @author test05
 */
public class IOB 
{   

    /**
     *
     * @param args
     */
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
     A obj1=new A();
     System.out.println(obj1.getbalance());
     B obj2=new B();
     System.out.println(obj2.getbalance());
     C obj3=new C();
     System.out.println(obj3.getbalance());
    }          
}
class bank
{
  Scanner obj=new Scanner(System.in);  
int getbalance()
{
return 0;
}
           
  } 
class A extends bank
{
int getbalance()
{
    int amount;
  System.out.println("enter rhe amount in A");
  amount=obj.nextInt();
  return amount;
}
}
class B extends bank
{
int getbalance()
{
int amount;
  System.out.println("enter rhe amount in B");
  amount=obj.nextInt();
  return amount;
}
}
class C extends bank
{
int getbalance()
{
int amount;
  System.out.println("enter rhe amount in C");
  amount=obj.nextInt();
  return amount;
}
}