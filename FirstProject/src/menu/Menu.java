package menu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.*;

public class Menu {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void menuOptions()
    {
        System.out.println("Welcome To Digital Library");
        System.out.println("Press 1. To Log in As A Normal User");
        System.out.println("Press 2. To log in as Admin");
        System.out.println("Press 3. To Sign up as Admin");
        System.out.println("Press 4. To Exit");

    }
    public static int optionNumber()
    {
        int option = 0 ;
        try
        {
            option = Integer.parseInt(br.readLine());

        }
        catch (IOException e)
        {
            System.out.println("");
        }
        return option;
    }


}
