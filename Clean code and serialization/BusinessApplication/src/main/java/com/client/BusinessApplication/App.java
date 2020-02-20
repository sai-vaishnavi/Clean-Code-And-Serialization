package com.client.BusinessApplication;
/**
 * Hello world!
 *
 */
public class App 
{
   public int SimpleInterest(int profit,int rate,int term)
   {
	   return profit*rate*term;
   }
   public int CoumpoundInterest(int profit,int rate,int term)
   {
	   int x=rate+1;
	   int power=(int)Math.pow(x, term);
	   return (profit*power)-profit;
   }
   public int houseConstructionRate(int materialstandard,int totalarea)
   {int res=0;
      if(materialstandard==1) 
         
        res=(int)1200*totalarea;
      
      else if(materialstandard==2) 
	        res=(int)1500*totalarea;
      
      else if(materialstandard==3) 
	        res=(int)1800*totalarea;
      
      else if(materialstandard==4) 
	         res= (int)2500*totalarea;
      
      return res;
     }
  }
