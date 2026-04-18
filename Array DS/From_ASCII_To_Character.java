import java.util.Arrays;
public class From_ASCII_To_Character {
    public static void main(String[] args) {
        char[] capital = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

        char[] smaller = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'} ;
        for (int i=0;i<smaller.length;i++){

        }
        for (int i = 0; i< smaller.length; i++){
            smaller[i]= smaller[i];
            System.out.print(((int) smaller[i])+" ");


        }
        System.out.println();
        for (int i = 0; i< capital.length;i++){
            capital[i]= capital[i];
            System.out.print(((int) capital[i])+" ");


        }
    }

}



