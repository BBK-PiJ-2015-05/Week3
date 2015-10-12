
import javax.swing.JOptionPane;

/*
 * Week 3 Day 5
 * 2.2 b) Fibonacci
 */

public class Fibonacci {

    public static void main(String[] args) {
        String choice = "";
        do{
            choice = JOptionPane.showInputDialog("What number would you like to calculate as a factorial?");
        }while (!isNumber(choice));
        
        int num = Integer.parseInt(choice);
        
           System.out.println("The factorial of " + choice + " is " + calcFibon(num));
    }
    
    public static int calcFibon(int n){
        if (n < 3 && n >= 0){
            return 1;
        }else if (n < 0){
            //formula for neg numbers is F(-n) = (-1)^(n+1)F(n)
            int total = (int)(Math.pow(-1.0, (n + 1.0)) * calcFibon(-n));
            return total;
        }else{
            //formula for pos numbers is F(n) = F(n-1) + F(n-2)
            int total = calcFibon(n - 1) + calcFibon(n - 2);
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
