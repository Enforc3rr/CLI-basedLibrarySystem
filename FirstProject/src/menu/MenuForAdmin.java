package menu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MenuForAdmin {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void menuOptionsforAdmin(){
        System.out.println("Press 1. To Add A Book");
        System.out.println("Press 2. To Remove A Book");
        System.out.println("Press 3. To View DataBase Info");
        System.out.println("Press 4. To Exit");
    }
   public static int optionNumber() throws  IOException{
        int option = Integer.parseInt(br.readLine());
        return option;

   }
}
