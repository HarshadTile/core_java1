

import java.util.Scanner;
class Arithematic_Calculator_Project {
    public static void main(String[] args) {
       
       Scanner si = new Scanner(System.in);
       System.out.println("-----------Arithematic Calculator----------");
       System.out.println("Enter 1st Number:");
       int no1 = si.nextInt();
       System.out.println("Enter 2nd  Number:");
       int no2 = si.nextInt();
       System.out.println("1:Addition|2:Substraction|3:Multiplication ");
       System.out.println("Enter Your Choice :");
       int choice = si.nextInt();
       
       switch(choice)
       {
           case 1 : int res1=no1+no2;
                    System.out.println("Addition is :"+res1);
                    break;
           case 2 : int res2=no1-no2;
                    System.out.println("Substraction is :"+res2);
                    break;
           case 3 : int res3 = no1*no2;
                    System.out.println("Multiplication is :"+res3);
                    break;
           default :
                    System.out.println("Invalid input");
                    break;
               
       }
       System.out.println("------------------------------------------");
       
       
       
    }
}