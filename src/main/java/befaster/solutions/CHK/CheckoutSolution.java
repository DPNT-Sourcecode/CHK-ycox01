package befaster.solutions.CHK;

import befaster.runner.SolutionNotImplementedException;

public class CheckoutSolution {
    public Integer checkout(String skus) {
        int total=0;
        for(int i=0;i<skus.length();i++) {
           if(skus[i]=='A')
           {
               total=total+50;
           }
           else if(skus[i]=="B")
           {
               total=total+30;
           }
           else if(skus[i]=="C")
           {
               total=total+20;
           }
           else
           {
               total=total+10;
           }

        }
        return total;
    }
}

