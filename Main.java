import java.sql.SQLOutput;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // =================== Day 4 Task 1 =====================

//        for (int i = 1; i <= 100; i++){
//            if(i % 3 == 0 && i % 5 == 0){
//                System.out.println("FizzBuzz");
//            }else if(i % 3 == 0){
//                System.out.println("Fizz");
//            }else if (i % 5 ==0){
//                System.out.println("Buzz");
//            }else{
//                System.out.println(i);
//            }
//
//        }


        // =================== Day 4 Task 2 =====================

//        System.out.println("enter the sentence to reverse: ");
//        String sentence = input.nextLine();
//        String reversed = "";
//        for (int i = sentence.length() - 1; i >= 0; i--) {
//            reversed += sentence.charAt(i);
//        }
//        System.out.println("the sentence reversed: " + reversed);

        // =================== Day 4 Task 3 =====================



//        System.out.println("Enter number: ");
//        int num = input.nextInt(),  factorial = 1;
//        if (num < 0) {
//            System.out.println("Factorial is not works for negative numbers.");
//        } else {
//            for (int i = 1; i <= num; i++) {
//                factorial *= i;
//                System.out.println(factorial);
//            }
//
//            System.out.println("Factorial of " + num + " is: " + factorial);
//        }


        // =================== Day 4 Task 4 =====================
//        int num, power, result = 1;
//        System.out.println("please enter number: ");
//        num = input.nextInt();
//        System.out.println("please enter the power: ");
//        power = input.nextInt();
//
//        for(int i = 0 ; i < power; i++){
//            result *= num;
//        }
//        System.out.println(num +" power of: "+ power + " is: " + result);

        // =================== Day 4 Task 5 =====================

//        int sumEven = 0, sumOdd = 0, num;
//        System.out.println("Enter the number of integer you wants: ");
//        num = input.nextInt();
//        for (int i = 0; i < num; i++){
//            if(i % 2 == 0){
//                sumEven += i;
//            }else{
//                sumOdd +=i;
//            }
//        }
//        System.out.println("The sum of the even: " + sumEven);
//        System.out.println("The sum of the odd: " + sumOdd);

        // =================== Day 4 Task 6 =====================


//                boolean isPrime = true;
//                System.out.println("Enter positive number: ");
//                int num = input.nextInt();
//                if (num <= 1) {
//                    System.out.println(num +" is not prime number.");
//                } else {
//
//                    for (int i = 2; i <= Math.sqrt(num); i++) {
//                        System.out.println("i = " + i + " sqrt = "+ Math.sqrt(num) );
//                        if (num % i == 0) {
//                            isPrime = false;
//                            break;
//                        }
//                    }
//                    if (isPrime) {
//                        System.out.println(num + " is a prime number.");
//                    } else {
//                        System.out.println(num + " is not a prime number.");
//                    }
//                }


        // =================== Day 4 Task 7 =====================
//        for (int i = 1; i <= 4; i++) {
//            System.out.println("Week " + i);
//            System.out.println(" ");
//            for (int j = 1; j <= 7; j++) {
//                System.out.println("Day" + j);
//            }
//
//            System.out.println(" ");
//        }



        // =================== Day 4 Task 8 =====================


//        System.out.println("Enter the word: ");
//        String word = input.nextLine();
//        boolean isPalindrome = true;
//        for (int i = 0; i < word.length() / 2; i++) {
//            if (word.charAt(i) != word.charAt(word.length() - 1 - i)) {
//                isPalindrome = false;
//                break;
//            }
//        }
//        if (isPalindrome) {
//            System.out.println("it is a palindrome");
//        } else {
//            System.out.println("it is not a palindrome");
//        }


    }
}