
import javax.print.DocFlavor.STRING;
import javax.swing.*;
public class main {

    public static void main(String[] args) {
        System.out.println("Everything Works");
        JOptionPane.showMessageDialog(null, "Welcome to Cafe billing app ");
        String[] menu1 = {"Latte", "Frappucino", "Americano", "Masala Tea", "Choco Milk"};
        int coffe = JOptionPane.showOptionDialog(
            null,
            "Select your Coffee by clciking on the button", 
            "Billing app", 
            JOptionPane.DEFAULT_OPTION, 
            0, 
            null, 
            menu1, 
            menu1[0]);
        String[] user = new String[5];
        int[] user1 = new int[5];
        if (coffe==0){
            user[0] = menu1[0];
        };
        if (coffe==1){
            user[0] = menu1[1];
        };
        if (coffe==2){
            user[0] = menu1[2];
        };
        if (coffe==3){
            user[0] = menu1[3];
        };
        if (coffe==4){
            user[0] = menu1[4];
        };
        System.out.println(user);
        String numcof = JOptionPane.showInputDialog(null, "How many would you like ");
        user1[0] = Integer.parseInt(numcof);
        String[] menu2 = {"Lava Cake", "Cookies", "Pastry", "Toast"};
        int sides = JOptionPane.showOptionDialog(
            null,
            "Select your Snack by clciking on the button", 
            "Billing app", 
            JOptionPane.DEFAULT_OPTION, 
            0, 
            null, 
            menu2, 
            menu2[0]);
        
        if (sides==0){
            user[1] = menu2[0];
        };
        if (sides==1){
            user[1] = menu2[1];
        };
        if (sides==2){
            user[1] = menu2[2];
        };
        if (sides==3){
            user[1] = menu2[3];
        };
        if (sides==4){
            user[1] = menu2[4];
        };

        // String name = JOptionPane.showInputDialog(null, "Enter your name please");
        // String number = JOptionPane.showInputDialog(null, "Enter your Mobile Number please");
        // String bill = JOptionPane.showMessageDialog(null, "Your name "+name);


    }
}