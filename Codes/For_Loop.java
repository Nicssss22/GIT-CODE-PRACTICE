package Codes;

import java.util.Scanner;

public class For_Loop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int choice;

        for(int i = 0; i < 5; i++){
            System.out.println("Hello For loop");
        }
        System.out.println("Enter 1 to loop, enter any number to terminate the loop");
        choice = scanner.nextInt();
        while(choice == 1){
            System.out.println("Hello");
            choice = scanner.nextInt();
        }
        System.out.println("Program End.");
        System.out.println("Do you want to reset the program?");


        System.out.println("HEYHEYHEYHEYHEYHEY");

    }
}