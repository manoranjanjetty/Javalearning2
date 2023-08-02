public class Evenonlyfun {
    public static void main(String[] args){
        int input =0;
        int count = 0;
      //  System.out.print(input +"\t");
        while (input <= 200){
            if (input % 2 != 0){
                input++;
                count++;
                continue;
            }
            if(input == 24 || input ==50 ||input ==76 || input == 100) {
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
