
package lambda;

import java.util.ArrayList;
import java.util.Scanner;


public class Lambda {

    
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
    ArrayList<String> letterChain = new ArrayList<String>();
    String c;
    
    for(int i=0; i<4; i++){
        System.out.println("Give string");
       c=sc.nextLine();
        letterChain.add(c);
    }
    
        System.out.println("Given letter chains");
        System.out.println(letterChain);
        letterChain.sort((a,b)-> a.length() - b.length());
        System.out.println("Sorted letter chains");
        System.out.println(letterChain);   
    }
    
}
