import javax.swing.*;

public class Equilibrium {
    public static void main(String[] args) {
        int numberOfEntries =0;
        String stringOfNumbers;



        numberOfEntries = Integer.parseInt(JOptionPane.showInputDialog(null, "enter first line"));
        stringOfNumbers = JOptionPane.showInputDialog(null, "Enter the second line");
        int[] numbers = new int[numberOfEntries];
        numbers = GetArray(numberOfEntries, stringOfNumbers);
        int left=0;
        int right=0;
        String output="";
        for (int i=0;i<numbers.length;i++) {

            for (int j = 0; j < i; j++) {
                left += numbers[j];
            }
            for (int j = i + 1; j < numbers.length; j++) {
                right += numbers[j];
            }
            if(left == right){
                output += i + " ";
            }
            left = 0;
            right = 0;

        }
        JOptionPane.showMessageDialog(null, output);






    }


    public static int[] GetArray(int numberOfEntries, String stringOfNumbers){
        int end, j=0;
        String tempNumAsString="";


        end = stringOfNumbers.indexOf('\\');
        int[] numbers = new int[numberOfEntries];

        for(int i=0;i<end+1;i++){
            if(stringOfNumbers.charAt(i) == ' ' || i == end){
                numbers[j] = Integer.parseInt(tempNumAsString);
                tempNumAsString = "";
                j++;
            }
            else{
                tempNumAsString += stringOfNumbers.charAt(i);
            }
        }
        return numbers;

    }


}
