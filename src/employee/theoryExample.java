
package employee;

import java.util.Scanner;


public class theoryExample {

    
    public static void main(String[] args) {
      //recall -> you can use && and || and ! in boolean expressions
      //      and                     or                   Not
      int x = 12, y=17;
        System.out.println(x != y); //true
        System.out.println(x >= y || x < 15); //true
        System.out.println(x >= y && x < 15); //false
        
        //sample program
        //write 2 tests to see if you can be a manager, supervisor or clerk
        //manager = both scores > 90
        //supervisor = one score over 90 and other cant be below 50
        //clerk = one over 70 and nothing under 50
        
        int score1, score2;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Test score 1:");
        score1=s.nextInt();
        System.out.println("Enter Test score 2:");
        score2=s.nextInt();
        
        //if(score 1 ? 90 && score 2 > 90)
        //(score 1>90 or score2 > 90 && ! (score1<50 && score2 < 50))
        boolean bothover90 = score1>=90 && score2>=90;
        boolean atleastone90 = score1>=90 || score2>=90;
        boolean nofails = score1>=50 && score2>=50;
        boolean atleastone70 = score1>=70 || score2>=70;
        
        if(bothover90)
            System.out.println("Manager");
        else if(atleastone90 && nofails)
            System.out.println("Supervisor");
        else if (atleastone70 && nofails)
            System.out.println("Clerk");
        else
            System.out.println("Disqualified");
                
    }
    
    
}
