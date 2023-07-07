import java.util.Random;
public class randomfun {
    public static void main(String[] args) {
        Random random = new Random();
        int randomnumber = random.nextInt(10);
        System.out.println("Random number between 0 to 10 \t" + randomnumber);

        randomnumber = random.nextInt(1000);
        System.out.println("Random number between 0 to 999 \t" + randomnumber);

        randomnumber = random.nextInt(1000) + 1;
        System.out.println("Random number between 0 to 1000 \t" + randomnumber);


    }
}
