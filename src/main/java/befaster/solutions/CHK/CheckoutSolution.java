package befaster.solutions.CHK;

import befaster.runner.SolutionNotImplementedException;

public class CheckoutSolution {
    public Integer checkout(String skus)
    {
        int total=0;
       for(int i=0;i<skus.length();i++)
       {
           System.out.println(skus.charAt(i));
       }
        return total;
    }
}


