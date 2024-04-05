import java.util.Scanner;  // Import the Scanner class

public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter Amount of Printed Didgets: ");
        String amountOfDidgets = myObj.nextLine();  // Read user input
        System.out.println("Enter #1: ");
        String number1 = myObj.nextLine();  // Read user input
        System.out.println("Enter #2: ");
        String number2 = myObj.nextLine();  // Read user input
        System.out.println(amountOfDidgets +" , " + number1+ " , "+  number2 );


        Fibonacci newFib = new Fibonacci(Integer.parseInt(amountOfDidgets),Integer.parseInt(number1),Integer.parseInt(number2));
        Thread thread1 = new Thread(newFib);
        thread1.start();

    }
}