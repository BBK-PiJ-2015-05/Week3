
import javax.swing.JOptionPane;

/*
 * Week 3 Day 5
 * 4. Palindrome
 */
public class Palindrome {
    public static void main(String[] args) {
        String word = JOptionPane.showInputDialog("Enter a word to see if it is a palindrome");
        
        if(isPalindrome(word)){
            System.out.println(word + " is a palindrome!");
        }else{
            System.out.println(word + " is a not palindrome.");
        }
    }
    
    public static String reverseString(String s){
        int index = (s.length());
        System.out.println(index);
        if (index == 1){
            return s;
        }else{
            String reverse = s.substring((index - 1), index) + reverseString(s.substring(0, index - 1));
            return reverse;
        }
    }
    
    public static boolean isPalindrome(String a){
        System.out.println(reverseString(a));
        if(a.equals(reverseString(a))){
            return true;
        }else{
            return false;
        }
    }
}
