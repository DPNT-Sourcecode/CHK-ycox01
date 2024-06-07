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
           else if(skus.charAt(i)=='B')
           {
               parb++;
           }
           else if(skus.charAt(i)=='C')
           {
               parc++;
           }
           else if(skus.charAt(i)=='D')
           {
               pard++;
           }
           else
           {
               return -1;
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
           total=total+para*50 + parb*30 + parc*20 + pard*15;
       }
        if(para%3==0 && parb%2!=0 )
        {
            total=total+ parb*30 + parc*20 + pard*15;
        }
        else if(para%3!=0 && parb%2==0 )
        {
            total=total+para*50 + parc*20 + pard*15;
        }

        //System.out.print('\n');
        return total;

    }
}





