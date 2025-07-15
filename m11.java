import java.util.*;

public class m11 {
    // public static void printhello() {
    // System.out.println("Hello World");
    // return;
    // }
    // public static void calculateSum(int a, int b) {
    // // Scanner sc = new Scanner (System.in);
    // // int a = sc.nextInt();
    // // int b = sc.nextInt();
    // int sum = a + b;
    // System.out.println("Sum is " + sum);
    // return;
    // }
    // public static void main(String args[]) {
    // //printhello(); // fuction call
    // Scanner sc = new Scanner (System.in);
    // int a = sc.nextInt();
    // int b = sc.nextInt();
    // calculateSum(a,b);
    // System.out.println("Sum is " + sum);
    // }

    // public static void swap(int a,int b) {
    // //swap
    // int temp = a;
    // a = b;
    // b = temp;
    // System.out.println("a is " + a +" b is " + b);
    // }
    // public static void main(String[] args) {
    // //swap - values exchage
    // int a = 5;
    // int b = 10;
    // swap(a,b);
    // }

    // public static int multiply(int a,int b) {
    // int product = a * b;
    // return product;
    // }
    // public static void main(String args[]) {
    // int a = 3;
    // int b = 5;
    // int prod = multiply(a,b);
    // System.out.println("Product is " + prod);
    // prod = multiply(4,6);
    // System.out.println("Product is " + prod);
    // }

    // public static int factorial(int n) {
    // int f = 1;

    // for(int i=1; i<=n; i++) {
    // f = f * i;
    // }

    // return f;
    // }

    // for factorial
    // public static void main(String args[]) {
    // Scanner sc = new Scanner(System.in);
    // System.out.print("Enter the number : ");
    // int n = sc.nextInt();
    // int fact = factorial(n);
    // System.out.println("Factorial of " + n + " is " + fact);
    // }

    // public static int binCoeff(int n, int r) {
    // int fact_n = factorial(n);
    // int fact_r = factorial(r);
    // int fact_nmr = factorial(n-r);

    // int binCoeff = fact_n / (fact_r * fact_nmr);
    // return binCoeff;
    // }

    // public static void main(String[] args) {
    // System.out.println("Binomial Coefficient of 5C2 is " + binCoeff(5, 2));
    // }

    // Fuction overloading using parameters
    // public static int sum(int a, int b) {
    // return a + b;
    // }
    // public static int sum(int a, int b, int c) {
    // return a + b + c;
    // }
    // public static void main(String[] args) {
    // System.out.println("Sum of 2 numbers is " + sum(5, 10));
    // System.out.println("Sum of 3 numbers is " + sum(5, 10, 20));
    // }

    // Fuction overloading using Data Types
    // public static int sum(int a, int b) {
    // return a+b;
    // }
    // public static float sum(float a, float b) {
    // return a+b;
    // }
    // public static void main(String[] args) {
    // System.out.println("Sum of 2 numbers is " + sum(5, 10));
    // System.out.println("Sum of 3 numbers is " + sum(5.2f,4.5f));
    // }

    // Check if a number is prime or not
    // public static boolean isPrime(int n) {
    // //corner cases
    // if (n==2) {
    // return true;
    // }
    // for (int i = 2; i <= n-1; i++) {
    // if (n % i == 0) {
    // return false;

    // }
    // }
    // return true;
    // }

    // optimized
    // public static boolean isPrime(int n) {
    // if (n==2) {
    // return true;
    // }
    // for(int i = 2; i <= Math.sqrt(n); i++) {
    // if (n % i == 0) {
    // return false;
    // }
    // }
    // return true;
    // }
    // public static void main(String args[]) {
    // Scanner sc = new Scanner(System.in);
    // System.out.print("Enter the number to check its a Prime number or Not : ");
    // int n = sc.nextInt();
    // System.out.print(isPrime(n));
    // }

    // Convert from Binary to Decimal
    public static void binToDec(int binNum) {
        int mynum = binNum;
        int pow = 0;
        int decNum = 0;

        while(binNum > 0 ){
            int lastDigit = binNum % 10;
            decNum = decNum + (lastDigit * (int)Math.pow(2,pow));
            pow++;
            binNum /= 10;

        }
        System.out.println("Decimal Number of " + mynum +" is " + decNum);  
        
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int binNum = sc.nextInt();
        binToDec(binNum);

    }

}
