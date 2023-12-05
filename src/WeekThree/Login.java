package WeekThree;
import javax.swing.* ;
public class Login {
    public static void main(String[] args) {
        String userName = "Joe";
        String password = "cs";
        String user = JOptionPane.showInputDialog("Enter Username");
        String pass = JOptionPane.showInputDialog("Enter password");
        if (user.equals(userName))  {
            if (pass.equals(password)) {
                System.out.println("Welcome to CS121");}
            else {
                System.out.println("Incorrect Password");}
        }
        else if (pass.equals(password))  {
            System.out.println("Incorrect Username");}
            else{
                System.out.println("Incorrect Username and Password");
            }
        }
        }




