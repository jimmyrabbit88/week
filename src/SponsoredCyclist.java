import javax.swing.*;

public class SponsoredCyclist {

    public static void main(String[] args) {
        String name, initial, surname;
        int km=0;

        name = JOptionPane.showInputDialog(null, "Please enter your First name :","Enter Name",JOptionPane.QUESTION_MESSAGE);
        initial = JOptionPane.showInputDialog(null, "Please enter your initial :", "Enter Initial", 3);
        surname = JOptionPane.showInputDialog(null, "Please enter your Surname :", "Enter Surname", 3);
        km = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter the amount of KM's you have cycled", "Enter Distance",3));
        JOptionPane.showMessageDialog(null, "Cyclist : " + name +" "+ initial +" "+ surname + "\nDistance : " + km + "\nAmount due : " + calcMoneyDue(km)+" Euro", "Amount Due", 2 );

    }

    public static float calcMoneyDue(int km){
        float total=0f;
        final float RATE1 = .07f, RATE2 = .1f;
        final int THRESHOLD = 10;
        if(km > THRESHOLD){
            total= THRESHOLD*RATE1;
            km -= THRESHOLD;
            total += km*RATE2;
            return total;
        }
        else{
            total = km*RATE1;
            return total;
        }

    }
}
