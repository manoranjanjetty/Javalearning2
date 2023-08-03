public class Evenonlyfun {
    public static void main(String[] args){
        int input =1;
        int count = 0;
      //  System.out.print(input +"\t");
        while (input <= 200){
            if (input % 2 != 0){
                input++;
                count++;
                continue;
            }
            if(input == 50 || input ==100||input ==150|| input == 200) {
                System.out.println(input);
                input++;}
            else{
                System.out.print(input + "\t");
                input++;
            }
        }
        System.out.println("\n");
        System.out.println(count);


    }//end main
}
