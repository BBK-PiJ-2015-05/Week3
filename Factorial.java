
import javax.swing.JOptionPane;

/*
 * Week 3 Day 5
 * 2.1 a) Factorial
 */

public class Factorial {

    public static void main(String[] args) {
        String choice = "";
        do{
            choice = JOptionPane.showInputDialog("What number would you like to calculate as a factorial?");
        }while (!isNumber(choice));
        
        int num = Integer.parseInt(choice);
        
        if(calcFact(num) == -1){
            System.out.println("Negative numbers do not have defined factorials.");
        }else{
            System.out.println("The factorial of " + choice + " is " + calcFact(num));
        }
        
    }
    public static int calcFact(int n){
        if (n == 0){
            return 1;
        }else if(n < 0){
            return -1;
        }else{
            int total = n * calcFact(n-1);
            return total;
        }
    }

    public static boolean isNumber(String m){
        try{
            int i = Integer.parseInt(m);
        }
        catch(NumberFormatException nfe){
            return false;
        }
        return true;
    }
}
