package DB;
import DB.*;
import menu.MenuForAdmin;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;

public class AdminOther {
    public static void AdminOther() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter UserName -> ");
            String s = null;
            s = br.readLine();
            System.out.println();
            System.out.print("Enter PassWord -> ");
            String password = br.readLine();
            System.out.println();
            if (s.equals("drew") && password.equals("123")) {
                MenuForAdmin.menuOptionsforAdmin();
                int selectedOption = MenuForAdmin.optionNumber();
                switch (selectedOption) {
                    case 1: {
                        Admin.AdminAdd();
                        break;
                    }
                    case 2: {
                        System.out.println("Enter ID of Book Which You Want to Remove -> ");
                        Admin.AdminRemove();
                        break;
                    }

                    case 3: {
                        Info info = new Info();
                        info.InfoBooks();
                        break;
                    }
                    case 4: {
                        System.out.println("Exiting....");
                        break;
                    }
                    default: {
                        System.out.println("Re-Enter The Option");
                        break;
                    }
                }
            } else {
                System.out.println("Re-Enter the user name or Password");
            }
        } catch (IOException | SQLException e) {
            e.printStackTrace();
        }

    }
}
