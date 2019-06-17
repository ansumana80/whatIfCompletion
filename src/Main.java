import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        int num1, num2, ave, sum, product;



        Scanner keyboard = new Scanner(System.in);

        System.out.println("First number? : ");
        num1 = keyboard.nextInt();

        System.out.println("Second number? : ");
        num2 = keyboard.nextInt();

        sum= num1 + num2;
        System.out.println("The sum of num1 and num2 is: " +sum);

        ave= sum/2;
        System.out.println("The ave of num1 and num2 is: " +ave);

        product= num1 * num2;
        System.out.println("The product of num1 and num2 is: " +product);








    }

}

