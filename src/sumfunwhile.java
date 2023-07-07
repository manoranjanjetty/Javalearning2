import java.util.Scanner;

public class sumfunwhile {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int input;
        int sum =0;
        System.out.println("Please enter the integer value to add");
        System.out.println("Please enter the negative value to exit!!!");
        input = keyboard.nextInt();
        while(input >= 0){
            sum += input;
            System.out.println("Please enter the integer value to add");
            System.out.println("Please enter the negative value to exit!!!");
             input = keyboard.nextInt();

        }//end while
        //sum = sum - input;
        System.out.println("total sum of the value" + sum);
    }//end main
}
