import java.util.*;

public class m9 {
    public static void main(String[] args) {

        //While loop
        // int counter = 0;
        // while (counter<100){
        //     System.out.println("Hello, World!");
        //     counter++;
        // }
        // System.out.println("Counter reached 100, exiting loop.");

        //print mumber from 1 to 10
        // int counter=1;
        // while (counter<=10){
        //     System.out.println(counter);
        //     counter++;
        // }

        //print mumber from 1 to n
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int counter=1;
        // while (counter<=n){
        //     System.out.println(counter);
        //     counter++;
        // }

        
        //Print sum of first n nutural number
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int sum = 0;
        // int i =1;
        // while (i<=n) {
        //     sum = sum + i;
        //     i++;  
        // }
        // System.out.println("Sum of first " + n + " natural numbers is: " + sum);



        //for loop
        //print Square Pattern
        // for (int line=1; line<=4; line++){
        //     System.out.println("****");
        // }  

        //Print reverse of a number
        // int n = 10899;

        // while (n>0){
        //     int lastDigit = n % 10; // Get the last digit
        //     System.out.print(lastDigit); // Print the last digit
        //     n = n / 10; // Remove the last digit from n
        // }


        //Print reverse of a given number
        // int n = 10899;
        // int rev = 0;

        // while (n>0){
        //     int lastDigit = n % 10; // Get the last digit
        //     rev = (rev*10) + lastDigit; // Build the reversed number
        //     n = n / 10; // Remove the last digit from n
        // }
        // System.out.println(rev);

        // do while
        // int counter = 1;

        // do{
        //     System.out.println("hello world!!");
        //     counter++;
        //     break;
        // } while(counter<=10);

        //hackerrank question
        //1
        // Scanner sc = new Scanner(System.in);
        // int N = sc.nextInt();

        // if ((N%2)!=0) {
        //     System.out.println("Weird");
        // } else if (N%2==0 && N>=2 && N<=5) {
        //     System.out.println("Not Weird");
        // } else if (N%2==0 && N>=6 && N<=20) {
        //     System.out.println("Weird");
        // } else {
        //     System.out.println("Not Weird");
        // }

        //2
        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int c = sc.nextInt();
        

        // System.out.println(a);
        // System.out.println(b);
        // System.out.println(c);

        //3
        // Scanner scan = new Scanner(System.in);
        // int i = scan.nextInt();
        // Double d = scan.nextDouble();
        // scan.nextLine();
        // String s = scan.nextLine();
        

        // System.out.println("String: " + s);
        // System.out.println("Double: " + d);
        // System.out.println("Int: " + i);

        //continue statement
        // for (int i = 1; i <= 10; i++) {
        //     if (i == 5) {
        //         continue; // Skip the rest of the loop when i is 5
        //     }
        //     System.out.println(i); // This will not print when i is 5
        // }

        //Continue Question
        // Dispaly all number entered by user except multiples of 10
        // Scanner sc = new Scanner(System.in);

        // do{
        //     System.out.print("Emter your number : ");
        //     int n = sc.nextInt();

        //     if (n%10 ==0){
        //         System.out.println("Multiple of 10, skipping...");
        //         continue;
        //     }
        //     System.out.println(n);
        // } while (true);

        // Check if a number is prime or not. prime : 2,3,4,7,11
        // System.out.println("Check Number is PRIME or NOT");
        // System.out.print("Enter the number : ");
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();

        // if (n == 2){
        //     System.out.println(n + " is a prime number");
        // } else {
        //     boolean isPrime = true;
        //     //for(int i=2; i<=n-1; i++) //sloww
        //     for(int i=2; i<=Math.sqrt(n); i++){  // Math.sqrt(n) fast for bigger numbers 
        //         if(n%i==0) {
        //             isPrime = false; // If n is divisible by any number other than 1 and itself, it's not prime
        //             break; // No need to check further
        //         }
        //     }
        //     if(isPrime == true){
        //         System.out.println(n + " is a prime number.");
        //     } else {
        //         System.out.println(n + " is not a prime number.");
        //     }

        // }


        // Practice
        //Q3
        Scanner sc = new Scanner(System.in);
        int num;
        int fact=1;

        System.out.print("Enter a number to find its factorial: ");
        num = sc.nextInt();

        for(int i = 1; i <= num; i++) {
            fact *= i; // Multiply fact by i
        }

        System.out.println("Factorial of " + num + " is: " + fact);

        


    }
}