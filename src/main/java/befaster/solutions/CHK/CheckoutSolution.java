package befaster.solutions.CHK;

import befaster.runner.SolutionNotImplementedException;

public class CheckoutSolution {
    public Integer checkout(String skus)
    {
        int total=0;
        System.out.println(skus.length());
       for(int i=0;i<skus.length();i++)
       {
           if(skus.charAt(i)=='A');
           {
               total++;
           }

       }

        return total;
    }
}





