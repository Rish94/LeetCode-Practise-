import java.util.*;
public class PlusOne66 {
    public static void main(String[] args) {
        // int digits[] = {9,9};
        // String s = "";
        // for(int i=0;i<digits.length;i++){
        //     s+=digits[i];
        // }
        // int no = Integer.parseInt(s) + 1;
        // String st =  String.valueOf(no);
        // System.out.println(st);
        // int a[] = new int[st.length()];
        // for(int j=0;j<st.length();j++){
        //     a[j] = st.charAt(j)-'0';
        // }
        // for(int k=0;k<a.length;k++){
        //     System.out.print(a[k]);
        // }
        int digits[] = {9,8,7,6,5,4,3,2,1,0};
        String s = "";
        for(int i=0;i<digits.length;i++){
            s+=digits[i];
        }
        System.out.print(s);
        int no = Integer.parseInt(s);
        no = no + 1;
        System.out.print(no);
        // ArrayList<Integer> arr = new ArrayList<>();
        // int rem = 0;
        // while(no>0){
        //     rem = no%10;
        //     arr.add(rem);
        //     no = no/10;
        // }
        // Collections.reverse(arr);
        // int a[] = new int[arr.size()];
        // for(int j=0;j<arr.size();j++){
        //     a[j] = arr.get(j);
        // }
        // System.out.print(a);
    }
}
