import java.util.Scanner;

public class Switchcase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char grade;
        System.out.println("Please enter the Grade !!! ");
        grade = input.next().charAt(0);
        switch(grade){
            case 'a':
            case 'A':
                System.out.println("great job");
                break;
            case 'b':
            case 'B':
                System.out.println("Good Job !!!");
                break;
            case 'c':
            case 'C':
                System.out.println("Good job but need put some more efforts !!!");
                break;
            case 'd':
            case 'D':
                System.out.println("you're failed");
                break;
            default :
                System.out.println("You entered the wrong grade, Please correct it!!! ");
        }//end of switch
    }
}
