import java.util.Scanner;
public class ifelseif {
    public static void main(String[] args)
    {
        int age;
        Scanner  input = new Scanner(System.in);
        System.out.println("please enter the age below:");
        age = input.nextInt();
        if (age >= 21)
        {
            System.out.println("Have a beer!");
        }
        else if (age >= 16)
        {
            System.out.println("have a coke, and atleast you can Drive!");
        }
        else {
            System.out.println("have a coke!!!");
        }
        System.out.println(" Thanks for visiting!!! Come again");
    }//end main
}
