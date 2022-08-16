import java.util.*;
public class reversevowelsofastring {
    public static void main(String[] args) {
        Stack<Character> st = new Stack<>();
        String s = "leetcode";
        char[] a = s.toCharArray(); 
        for(int i=0;i<a.length;i++){
            if(a[i]=='a' || a[i]=='e' || a[i]=='i' || a[i]=='o' || a[i]=='u' || a[i]=='A' || a[i]=='E' || a[i]=='I' || a[i]=='O' || a[i]=='U'){
                st.push(a[i]);
            }
        }
        for(int j=0;j<a.length;j++){
            if(a[j]=='a' || a[j]=='e' || a[j]=='i' || a[j]=='o' || a[j]=='u' || a[j]=='A' || a[j]=='E' || a[j]=='I' || a[j]=='O' || a[j]=='U'){
                a[j] = st.pop();
            }
        }
        String c = new String(a);
        System.out.println(c);
    }
}
