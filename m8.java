import java.util.*;

public class M8 {
    
    public static void main(String[] args) {
        
        //if else prep
        // int age = 16;
        // if (age >= 18) {
        //     System.out.println("You are eligible to vote.");
        // }
        // if (age > 13 && age < 18){
        //     System.out.println("You are teenager."); }
        
        // else {
        //     System.out.println("You are not eligible to vote.");
        // }

        //largest of two number
        // int A = 1;
        // int B = 5;
        // if (A>=B) {
        //     System.out.println("A is largest of 2 numbers");
            
        // } else {
        //     System.out.println("B is largest of 2 numbers");
        // }


        //print if a munber is odd even
        // Scanner sc= new Scanner(System.in);
        // int num = sc.nextInt();
        // if (num%2==0) {
        //     System.out.println("Even numbers");
            
        // } else {
        //     System.out.println("Odd numbers");
        // }


        //else if
        // int age = 16;
        // if (age >= 18) {
        //     System.out.println("You are eligible to vote.");
        // }
        // else if (age > 13 && age < 18){
        //     System.out.println("You are teenager."); }
        
        // else {
        //     System.out.println("You are not eligible to vote.");
        // }

        //problem : income tax
        // Scanner sc= new Scanner(System.in);
        // int income = sc.nextInt();
        // int tax;

        // if (income < 500000) {
        //     tax = 0;
        // } 
        // else if (income >= 500000 && income <1000000) {
        //     tax = (int)(income*0.2);
        // }
        // else {
        //     tax = (int)(income*0.3);
        // }

        // System.out.println("Your tax is : " + tax);

        //problem : largest of 3 number
        // Scanner sc= new Scanner(System.in);
        // int num1 = sc.nextInt();
        // int num2 = sc.nextInt();
        // int num3 = sc.nextInt();
        
        // int tax;

        // if ((num1>=num2)&&(num1>=num2)) {
        //     System.out.println("Largest Number is " + num1);
        // } 
        // else if ((num2>=num1)&&(num2>=num3)) {
        //     System.out.println("Largest Number is " + num2);
            
        // }
        // else {
        //     System.out.println("Largest Number is " + num3);
        // }

        //ternary operator
        // int marks = 40;
        // String result = (marks >= 33) ? "Pass" : "Fail";
        // System.out.println(result);


        //Switch statement
        // Scanner sc = new Scanner(System.in);
        // int num = sc.nextInt();
        // switch (num) {
        //     case 1 : System.out.println("Somosa");
        //         break;
        //     case 2 : System.out.println("burger");
        //         break;
        //     case 3 : System.out.println("Mango Shake");
        //         break;
        //     case 4 : System.out.println("Iphone");
        //         break;
        
        //     default:System.out.println("We wake up");
        // }

        // Calculator task
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter 1st Num :");
        // int a = sc.nextInt();
        // System.out.println("Enter 2nd Num :");
        // int b = sc.nextInt();
        // System.out.println("Enter Operator :");
        // char op = sc.next().charAt(0);

        // switch (op) {
        //         case '+' : System.out.println(a+b);
        //             break;
        //         case '-' : System.out.println(a-b);
        //             break;
        //         case '*' : System.out.println(a*b);
        //             break;
        //         case '/' : System.out.println(a/b);
        //             break;
        //         case '%' : System.out.println(a/b);
        //             break;
            
        //         default:System.out.println("Wrong Operator");
        //     }

        //Q1 - PQ's
        // Scanner sc = new Scanner(System.in);
        // int Num = sc.nextInt();
        // String type=(Num>0)? "Positive":"Negative";
        // System.out.println(type);


        //Q2 - PQ's
        // Scanner sc = new Scanner(System.in);
        // double Num = sc.nextDouble();
        // String type=(Num>100)? "You have Fever":"You Don't have Fever";
        // System.out.println(type);
        

        //Q3 - PQ's
        // Scanner sc = new Scanner(System.in);
        // int week = sc.nextInt();
        // switch (week) {
        //         case 1 : System.out.println("Sunday");
        //             break;
        //         case 2 : System.out.println("Monday");
        //             break;
        //         case 3 : System.out.println("Tuesday");
        //               break;
        //         case 4 : System.out.println("Wednesday");
        //              break;
        //         case 5 : System.out.println("Thursday");
        //              break;
        //         case 6 : System.out.println("Friday");
        //             break;
        //         case 7 : System.out.println("Saturday");
        //             break;
                
                
        //             default:System.out.println("Wrong Number (instert only btw 1-7)");
        //         }


        //Q4 - PQ's
        // My answer : false 63 - correct answer


        //Q5 - PQ's ( One more way to solve it is avaiable in Solutions for Practice Qs)
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if (year%4 == 0){
            if ((year%100) == 0){
                if (year%400 == 0){
                    System.out.println("Leap Year");
                } else {
                    System.out.println("Not Leap Year");
                }
            } else {
                System.out.println("Leap Year");
            }
        }
        else {
            System.out.println("Not Leap Year");
        }

    }
}
