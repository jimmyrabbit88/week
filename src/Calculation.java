import javax.swing.*;

public class Calculation {


    public static void main(String[] args) {
        takeOrder();

    }

    public static void takeOrder(){
        String name, className;
        int numberOfSnacks;
        final int PRICE = 2;

        name = JOptionPane.showInputDialog(null, "Please enter your name");
        className = JOptionPane.showInputDialog(null, "Please enter the name of your class");
        numberOfSnacks = Integer.parseInt(JOptionPane.showInputDialog(null, "How many snacks would you like"));
        JOptionPane.showMessageDialog(null, "Name : " + name + "\nClass : " + className + "\nYou have ordered " + numberOfSnacks + " snacks.\ntotal cost = " + numberOfSnacks*PRICE + "Euro");
    }
}
