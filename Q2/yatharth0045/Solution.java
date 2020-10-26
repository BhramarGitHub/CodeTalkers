import java.util.Scanner;

class Solution {

    public static void main (String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Numerator 1 : ");
        int num1=scan.nextInt();
        System.out.print("Enter Denominator 1 : ");
        int den1=scan.nextInt();
        System.out.print("Enter Numerator 2 : ");
        int num2=scan.nextInt();
        System.out.print("Enter Denominator 2 : ");
        int den2=scan.nextInt();
        fractionSum(num1, den1, num2, den2);
    }

    static void fractionSum(int num1, int den1, int num2, int den2) {
        int numx=1;
        int denx=1;
        if (den1 == den2 ){
            denx = den1;
            numx = num1 + num2;
            System.out.println(numx + " / " + denx );
        } else if(den1 < den2) {
            if ( den2 % den1 == 0 ) {
                denx = den2;
                numx = num2 + (num1 * (den2 / den1));
                System.out.println(numx + " / " + denx );
            } else {
                isMultiple(den2, den1, num2, num1);
            }
        } else {
            if ( den1 % den2 == 0) {
                denx = den1;
                numx = num1 + (num1 * (den1 / den2));
                System.out.println(numx + " / " + denx );
            } else {
                isMultiple(den1, den2, num1, num2);
            }
        }
    }

    static void isMultiple(int den1, int den2, int num1, int num2) {
        int numx=1;
        int denx=1;
        for(int i = 2 ; i <= ((den2 / 2) + 1) ; i++){
            while(den1 % i == 0) {
                den1 = den1 / i;
                den2 = den2 / i;
                denx = denx * i;
            }
        }
        denx = den1 * den2;
        numx = (num1 * den2) + (num2 * den1);
        System.out.println( numx + " / " + denx );
    }
}