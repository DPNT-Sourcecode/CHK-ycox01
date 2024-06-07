package befaster.solutions.CHK;

import befaster.runner.SolutionNotImplementedException;

public class CheckoutSolution {
    public Integer checkout(String skus) {
        int parA=0;
        int parb=0;
        int parc=0;
        int pard=0;
        int total;
        for(int i=0; i<skus.length(); i++ )
        {
            if(skus[i]=="A")
            {
                parA++;
            }
            if(skus[i]=="B")
            {
                parb++;
            }
            if(skus[i]=="C")
            {
                parc++;
            }
            if(skus[i]=="D")
            {
                pard++;
            }
        }
        if(parA==3)
        {
            total=total+130;
            total=total+parb*30+parc*20+pard*15;
        }
        else if(parb==2)
        {
            total=total+45;
            total=total+parA*50+parc*20+pard*15;
        }
        else {
            total=parA*50+parb*30+parc*20+pard*15;
        }
        return total;
    }
}

