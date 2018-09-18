import javax.swing.*;

public class kFlips {
    static int[] numbers;

    public static void main(String[] args) {
        int numberOfEntries = 0;
        int big = 0;
        int highIndex = 0;
        String stringOfNumbers;
        String index = "";


        numberOfEntries = Integer.parseInt(JOptionPane.showInputDialog(null, "enter first line"));
        stringOfNumbers = JOptionPane.showInputDialog(null, "Enter the second line");
        numbers = new int[numberOfEntries];
        numbers = GetArray(numberOfEntries, stringOfNumbers);
        while (numberOfEntries > 0) {
            for (int i = 0; i < numberOfEntries; i++) {
                if (numbers[i] > big) {
                    big = numbers[i];
                    highIndex = i;
                }
            }
            if (highIndex == 0) {
                performKflip(numberOfEntries - 1);
                index += numberOfEntries;
                numberOfEntries -= 1;
            }
            else {
                if (highIndex != numberOfEntries - 1) {
                    index += highIndex;
                    performKflip(highIndex);

                } else {
                    numberOfEntries -= 1;
                }
            }

            for (int i=0;i<numbers.length;i++){
                System.out.print(numbers[i]+" ");
            }
            System.out.print("\n");
            big = 0;
        }
        for (int i=0;i<numbers.length;i++){
            System.out.print(numbers[i]+" ");
        }
        System.out.println(index);

    }

    public static void performKflip(int j){
        int temp;
        for(int i=0; i<j; i++,j--){
            temp=numbers[i];
            numbers[i] = numbers[j];
            numbers[j]=temp;
        }
    }


    private static int[] GetArray(int numberOfEntries, String stringOfNumbers){
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

