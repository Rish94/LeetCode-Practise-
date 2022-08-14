import java.util.*;

import javax.print.attribute.SupportedValuesAttribute;

import java.lang.*;
public class q121 {
    public static void main(String[] args) {
        int prices[] = {7,5,1,4,6,2};
        int c = 0;
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0;i<prices.length;i++){
            int num = prices[i];
            int max = 0;
            for(int j=i+1;j<prices.length;j++){
                if(max<prices[j]){
                    max = prices[j];
                }
            }
            if(max>num){
                arr.add(Math.abs(num-max));
            }
            else{
                c++;
            }
        }
        Collections.sort(arr);
        System.out.println(arr);
        if(arr.size()!=0){
            System.out.println(arr.get(arr.size()-1));
        }
        
        else if(c==prices.length){
            System.out.println("0");
        }
    }
}
