import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int n,r,nMinusR,C,nFac = 1,rFac = 1,nMinusRFac = 1;

        // Formula --> C(n,r) = n! / (r! * (n-r)!)

        System.out.println("---------------------\nCalculation of C(n,r)\n---------------------\n");
        System.out.print("Enter the \"n\" value:");
        n  = scanner.nextInt();
        System.out.print("Enter the \"r\" value:");
        r = scanner.nextInt();

        for (int i=1;i<=n;i++){

            nFac = nFac * i;

        }


        for (int i=1;i<=r;i++){

            rFac = rFac * i;

        }

        nMinusR = n-r;

        for (int i=1;i<=nMinusR;i++){

            nMinusRFac = nMinusRFac * i;

        }

        C = nFac / (rFac * nMinusRFac);

        System.out.println("n!     = " + nFac);
        System.out.println("r!     = " + rFac);
        System.out.println("(n-r)! = " + nMinusRFac);

        System.out.println("\n*********************");
        System.out.println("C("+n+","+r+") = " + C);
        System.out.println("*********************");




    }
}
