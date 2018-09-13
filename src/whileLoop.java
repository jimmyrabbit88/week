import javax.swing.*;

public class whileLoop {
    static int total=0, count=0;

    public static void main(String[] args) {
        String input;
        input = JOptionPane.showInputDialog(null, "Please enter a number, 'q' to quit.");
        while(!input.equals("q")){
            count += 1;
            total = total + Integer.parseInt(input);
            input = JOptionPane.showInputDialog(null, "Please enter another number, 'q' to quit.");
        }
        JOptionPane.showMessageDialog(null, "Grand Total : " + total + "\nNumber of entries : " + count);


    }
}
