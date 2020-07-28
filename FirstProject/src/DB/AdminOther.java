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
            for (int i = 0; i <= Admin.adminUsername().size(); i++) {
                if (s.equals(Admin.adminUsername().get(i))) {
                    String password = br.readLine();
                    System.out.print("Enter PassWord ->" + password);
                    if (password.equals(Admin.adminPassword().get(i))) {
                        MenuForAdmin.menuOptionsforAdmin();
                        int selectedOption = MenuForAdmin.optionNumber();
                        switch (selectedOption) {
                            case 1:
                                Admin.AdminAdd();
                            case 2: {
                                System.out.println("Enter ID of Book Which You Want to Remove -> ");
                                Admin.AdminRemove();
                            }

                            case 3: {
                                Info info = new Info();
                                System.out.println(info.InfoBooks());
                            }
                            case 4: {
                                System.out.println("Exiting....");
                                break;
                            }
                            default: {
                                System.out.println("Re-Enter The Option");
                            }
                        }
                    } else {
                        System.out.println("Wrong PassWord");
                        break;
                    }
                } else {
                    System.out.println("Re-Enter the user name");
                    break;
                }
            }
        } catch (IOException | SQLException e)
        {
            e.printStackTrace();
        }
    }
}
