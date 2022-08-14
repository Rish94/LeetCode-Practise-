import java.util.*;
import java.lang.*;
public class q121 {
    public static void main(String[] args) {
        int prices[] = {7,1,5,3,6,4};
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
        }
        Collections.sort(arr);
        System.out.println(arr);
        System.out.println(arr.get(arr.size()-1));
    }
}
