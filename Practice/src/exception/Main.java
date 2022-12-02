package exception;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number:");
        int input = sc.nextInt();

        int num = 100;

        try{
            double result = num/input;
            System.out.println(result);
            return;
        }
        catch(ArithmeticException ae){
            System.out.println(ae.getMessage());
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }

        finally {
            System.out.println("Finally will always execute");
        }



        System.out.println("After division");
    }
}
