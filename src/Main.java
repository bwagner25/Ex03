import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double tempF = 0;
        while (tempF > -460) {
            tempF = tempPrompt();
            double tempC = conversion(tempF);
            output(tempC);
        }
    }

    static double tempPrompt(){
        Scanner input = new Scanner(System.in);
        System.out.println("What is the temperature you wish to convert?");
        double tempF = input.nextInt();
        return tempF;
    }

    static double conversion(double tempF){
        double tempC = ((tempF - 32)*5)/9;
        return tempC;
    }

    static void output(double tempC){
        System.out.println("The converted temperature is " + tempC);
    }

}