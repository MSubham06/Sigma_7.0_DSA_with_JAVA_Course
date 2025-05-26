import java.util.*;

public class m10 {
    public static void main(String[] args) {
        
        // Print the Star Pattern with *
        // for (int line=1; line<=4; line++) {
        //     for (int star=1; star<=line; star++) {
        //         System.out.print("*");
        //     }
        //     System.out.println("");
        // }


        // Print the Reverse Star Pattern with *
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the no. of lines : ");
        // int n = sc.nextInt();       
        // for (int line=1; line<=n; line++) {
        //     for (int star=1; star<=n-line+1; star++) {
        //         System.out.print("*");
        //     }
        //     System.out.println("");
        // }



        // Print the HALF PYRAMIND Pattern with 1234
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the no. of lines : ");
        // int n = sc.nextInt();       
        // for (int line=1; line<=n; line++) {
        //     for (int num=1; num<=line; num++) {
        //         System.out.print(num);
        //     }
        //     System.out.println("");
        // }




        // Print the CHARACTER Pattern  
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of lines : ");
        int n = sc.nextInt();      
        char ch = 'A'; 
        for (int line=1; line<=n; line++) {
            for (int chars=1; chars<=line; chars++) {
                System.out.print(ch);
                ch++; // Increment the character
            }
            System.out.println("");
        }




        





    }

}
