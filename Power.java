
import javax.swing.JOptionPane;

/*
 * Week 3 Day 5
 * 5. Power
 */
public class Power {

    public static void main(String[] args) {
        String base = "";
        String expStr = "";
        expo num = new expo();
        
        //ensure base is an integer
        do{
            base = JOptionPane.showInputDialog("What is the base number?");
        }while (!isNumber(base));
        
        //ensure exponent is an integer
        do{
            expStr = JOptionPane.showInputDialog("What is the exponent?");
        }while (!isNumber(expStr));
        
        num.base = Integer.parseInt(base);
        num.exponent = Integer.parseInt(expStr);
        System.out.println(num.base + " to the power of " + num.exponent + " is "+ num.pow(num));
        
    }
    
    public static class expo{
        int base;
        int exponent;
        
        public int pow (expo i){
            
            if (i.exponent == 0){
                return 1;
            }else{
                i.exponent = i.exponent - 1;
                int result = i.base * pow(i);
                return result;
            }
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
