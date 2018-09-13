import javax.swing.*;

public class SwitchCaseWithLoop {
    public static void main(String[] args) {
        float num1=0f, num2=0f, result=0f;

        String choiceAsString = JOptionPane.showInputDialog(null,
                "Choose an option\nA - Addition:\nS - Subtraction:\nM - Multiplication:\nD - Division:");
        num1 = Float.parseFloat(JOptionPane.showInputDialog(null, "Please enter a number : "));
        num2 = Float.parseFloat(JOptionPane.showInputDialog(null, "Please enter another number : "));

        JOptionPane.showMessageDialog(null,"Answer = " + DoCalc(num1, num2, choiceAsString));


    }

    public static float DoCalc(float num1, float num2, String cAS){

        char choice = cAS.charAt(0);
        switch(choice){
            case 'A':
                return num1 + num2;
            case 'S':
                return num1 - num2;
            case 'M':
                return num1 * num2;
            case 'D':
                return num1 / num2;
            default:
                return 0;
        }
    }
}
