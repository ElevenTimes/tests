import java.util.Scanner;

public class uzdevumi {
    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);

        // 1.uzd Make program with asks shape A and B sides, and then prints its perimeters and area.

        // int aMala = scanner.nextInt();
        // int bMala = scanner.nextInt();

        // System.out.println("Perimeters: " + (aMala * 2 + bMala * 2));
        // System.out.println("Laukums: " + aMala * bMala);
        
        // 2.uzd Write a program that asks the user for three integers and prints their average.

        // int sk1 = scanner.nextInt();
        // int sk2 = scanner.nextInt();
        // int sk3 = scanner.nextInt();
        
        // System.out.println("Vidējais lielums: " + (sk1 + sk2 + sk3) / 3);

        // 3.uzd Write a program that asks the user for an integer and prints the string "Speeding ticket!" if the input is greater than 120.

        // int atrums = scanner.nextInt();
        
        // if (atrums > 120) {
        //     System.out.println("Speeding ticket!");
        // }
        
        // 4.uzd Write a program that prompts the user for two integers and prints the larger of the two. If the numbers are the same, then the program informs us about this as well.

        // int sk1 = scanner.nextInt();
        // int sk2 = scanner.nextInt();
              
        // if (sk1 == sk2) {
        //     System.out.println("Skaitļi ir vienādi");
        // }
        // else {
        //     System.out.println(Math.max(sk1, sk2));
        // }

        // 5.uzd 'Write a program that prompts the user for a number between one and one hundred, and prints that number. 
        // If the number is divisible by three, then print "Fizz" instead of the number. If the number is divisible by five, then print "Buzz" instead of the number. 
        // If the number is divisible by both three and five, then print "FizzBuzz" instead of the number.
        


        int sk1 = scanner.nextInt();
        if (sk1 >= 1 && sk1 <= 100) {


            if (sk1 % 3 == 0 && sk1 % 5 == 0)
                System.out.println("FizzBuzz");
            
            else if (sk1 % 5 == 0)
                System.out.println("Buzz");
            else if (sk1 % 3 == 0) {
                System.out.println("Fizz");
            }
        }

    }
}