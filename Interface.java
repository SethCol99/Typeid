import java.util.*;
import java.io.File;

/*
 * here goes nothing, just tryna write a speed 
 * typing program, finna be fun when completed
 */

public class Interface {

    public static void main(String [] args){

        System.out.println("Welcome to Typeid (it's like \"Type\" and \"rapid\" like, yea)");
        System.out.println("\nAlright let's jump in, hit enter to start a round");
        
        File file = new File("words.txt");
        Scanner in = new Scanner(System.in);

        while(in.nextLine().equals("")){
        if(in.nextLine().equals("")){
            round();
        }
    }
}

    public static void round() {

}
    }