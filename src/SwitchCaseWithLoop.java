import javax.swing.*;

public class SwitchCaseWithLoop {
    public static void main(String[] args) {
        while(true) RunCalculator();



    }

    public static float DoCalc(float num1, float num2, char choice){

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

    public static void RunCalculator(){
        float num1=0f, num2=0f, result=0f;

        char choice = JOptionPane.showInputDialog(null,
                "Choose an option\nA - Addition:\nS - Subtraction:\nM - Multiplication:\nD - Division:\nQ - Quit").charAt(0);
        while(choice == 'Q'){
            int leave = JOptionPane.showConfirmDialog(null, "would you like to quit", "Quit??", JOptionPane.YES_NO_OPTION);
            if(leave == 0){
                System.exit(0);
            }
            else return;
        }
        num1 = Float.parseFloat(JOptionPane.showInputDialog(null, "Please enter a number : "));
        num2 = Float.parseFloat(JOptionPane.showInputDialog(null, "Please enter another number : "));

        JOptionPane.showMessageDialog(null,"Answer = " + DoCalc(num1, num2, choice));

    }
}
