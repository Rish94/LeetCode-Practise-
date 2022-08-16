import java.util.*;
public class validparentheses {
    public static void main(String[] args) {
        String s = "({{))";
        Stack<Character> st = new Stack<>();
        if(s.charAt(0)==')' || s.charAt(0)=='}' || s.charAt(0)==']'){
            System.out.println("false");
        }
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='[' )
                st.push(s.charAt(i));
            else if(s.charAt(i)==')' || s.charAt(i)=='}' || s.charAt(i)==']'){
                if(st.isEmpty())
                    System.out.println("false");
                else if(st.peek()=='(' && s.charAt(i)==')')
                    st.pop();
                else if(st.peek()=='{' && s.charAt(i)=='}')
                    st.pop();
                else if(st.peek()=='[' && s.charAt(i)==']')
                    st.pop();
                else
                System.out.println("false");
            }
        }
        if(st.isEmpty())
        System.out.println("true");
            
    }
}
