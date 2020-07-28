package Application;
import menu.*;
import DB.*;
import java.io.IOException;
import java.sql.SQLException;
public class Main {
    public static void main(String[] args) {
        try  {
            Menu.menuOptions();
            int option = Menu.optionNumber();
            switch(option) {
                case 1: {
                    Info info = new Info();
                    System.out.println(info.InfoBooks());
                }
                case 2:
                {
                    AdminOther.AdminOther();
                }
                case 3:
                {
                    Admin.AdminSignUp();
                }
                default:
                {
                    System.out.println("Exiting...");
                }
            }
        }
        catch(SQLException e){
                    e.printStackTrace();
        }
    }
}
