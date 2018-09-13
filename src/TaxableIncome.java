import javax.swing.*;
import java.awt.*;

public class TaxableIncome {
    public static void main(String[] args) {
        String name;
        int income;




        name = JOptionPane.showInputDialog(null, " Please enter your name");
        income = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter your taxable Income"));
        showTax(income);


    }
    public static void showTax(int inc){
        final float RATE1 = 0f, RATE2 = .2f, RATE3 = .41f;
        final int CUT1 = 20000, CUT2 = 36000;
        float tax=0f, incAfterTax=0f;
        float rate=0;

        if(inc < CUT1){
            tax = inc*RATE1;
            rate = RATE1*100;
            incAfterTax = inc - tax;
        }
        else if (inc < CUT2){
            tax = inc*RATE2;
            rate = RATE2*100;
            incAfterTax = inc - tax;
        }
        else {
            tax = inc*RATE3;
            rate = RATE3*100;
            incAfterTax = inc - tax;
        }

        JOptionPane.showMessageDialog(null, "Gross Income : $"+ inc + "\n Tax Rate :"+rate+"%\nTax : $"+ tax+
                                        "\nIncome after Tax : $"+incAfterTax);

    }
}
