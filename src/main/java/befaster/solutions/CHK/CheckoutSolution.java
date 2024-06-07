package befaster.solutions.CHK;

public class CheckoutSolution {
    public Integer checkout(String skus)
    {
        int total=0;
        int para=0;
        int parb=0;
        int parc=0;
        int pard=0;
       // System.out.println(skus.length());
       for(int i=0;i<skus.length();i++)
       {
           if(skus.charAt(i)=='A')
           {
               para++;
           }
           if(skus.charAt(i)=='B')
           {
               parb++;
           }
           if(skus.charAt(i)=='C')
           {
               parc++;
           }
           if(skus.charAt(i)=='D')
           {
               pard++;
           }
       }
       if(para%3==0)
       {
           total=total+130*(para/3);
       }
       if(parb%2==0)
       {
           total=total+45*(parb/2);
       }
       if(para%3!=0 && parb%2!=0 )
       {
           total=total+para*50 + parb+30 + parc*20 + pard*15;
       }

        //System.out.print('\n');
        return total;

    }
}


