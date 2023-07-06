import java.util.Scanner;

public class faternity {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int age;
        char gender;
        System.out.println("Please enter the age and Gender");
        age = input.nextInt();
        gender = input.next().charAt(0);

        if (age >= 19 && gender == 'M')
        {
            System.out.println("you're eligible!!!");
        }
        else {
            switch (gender) {
                case 'm':
                case 'M':
                case 'f':
                case 'F':
                    if (age >= 19) {
                        System.out.println("YOU'RE ELIGIBLE TO JOIN THE FATERNITY!!!!");
                    }//end if
                    else {
                        System.out.println("YOU'RE NOT ELIGIBLE TO JOIN THE FATERNITY!!!!");
                    }
                    break;
                default:
                    System.out.println("Oooops Please enter the correct gender!!!");
            }//end of switch
        }//end of else19
    }//end main
}
