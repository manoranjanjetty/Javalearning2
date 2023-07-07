public class Evenonlyfun {
    public static void main(String[] args){
        int input =0;
      //  System.out.print(input +"\t");
        while (input <= 100){
            if (input % 2 != 0){
                input++;
                continue;
            }
            System.out.print(input +"\t");
            input++;
        }




    }//end main
}
