public class continuebreak {
    public static void main (String[] args){
        int input = 0;
        while(input < 10){
            if (input == 5) {
                input++;
                break;
            }
            System.out.print(input + "\t");
input++;
        }//end while
        input =0;
        System.out.println("");
        while (input <20){
            if (input == 10){
                input++;
                continue;
            }//end if
            System.out.print(input + "\t");
            input++;
        }//end while
    }//end main
}
