
import javax.swing.JOptionPane;

/*
 * Week 3 Day 5
 * 2.3 c) Hanoi Towers
 */
public class Hanoi {

    public static void main(String[] args) {
        String amount = "";
        do{
            amount = JOptionPane.showInputDialog("How many disks does your tower have?");
        }while (!isNumber(amount));
        
        int num = Integer.parseInt(amount);
        System.out.println("The minimum amount of moves needed for " + amount + " discs is " + calcMoves(num));
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
    
    public static int calcMoves(int n){
        if (n == 1){
            return 1;
        } else if(n <= 0){
            return 0;
        }else{
            int result = (int)Math.pow(2, (n - 1)) + calcMoves(n - 1);
            return result;
        }
    }
}
