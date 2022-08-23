package loops;

import java.util.Scanner;

public class gcd {
    public static void main(String[] args) {
        int number1, number2;
        Scanner input  = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        number1 = input.nextInt();

        System.out.print("Enter the second number : ");
        number2 = input.nextInt();
        
        System.out.print("the gcd of the entered numbers is : " +gcds(number1,number2)); 
    }
    public static int gcds(int m,int n) {
      int r;
      do {
        r = n % m;
        n = m;
        m = r;
      }while (r != 0);
        return n;
    }
    
}
