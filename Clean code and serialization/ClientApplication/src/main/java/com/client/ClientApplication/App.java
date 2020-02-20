package com.client.ClientApplication;
import java.io.IOException;
import java.util.*;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
       // System.out.println( "Hello World!" );
    	Scanner sc=new Scanner(System.in);
    	System.out.write("Enter profit to calculate simple Interest".getBytes());
    	int profit=sc.nextInt();
    	System.out.write("Enter rate to calculate simple Interest".getBytes());
    	int rate=sc.nextInt();
    	System.out.write("Enter term to calculate simple Interest".getBytes());
    	int term=sc.nextInt();
    	System.out.write("Enter materialStandard  1 for standard materials ,2 for above Standard materials,3 for high standard materials,4 for high standard and fully autopmated home to calculate house construction cost ".getBytes());
    	int materialStandard=sc.nextInt();
    	System.out.write("Enter  to totalarea for calculation of construction of house".getBytes());
    	int totalarea=sc.nextInt();
    	App FirstClient=new App();
    	int result=new com.client.BusinessApplication.SimpleInterest(profit,rate,term);
    	System.out.format("%d", result1);
    	int result2=new com.client.BusinessApplication.houseConstructionRate(materialStandard,totalarea);
    	System.out.format("%d", result2);
    }
}
