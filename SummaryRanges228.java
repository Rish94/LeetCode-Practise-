import java.util.*;
public class SummaryRanges228 {
    public static void main(String[] args) {
        int nums[] = {0,1,2,4,5,7};
        ArrayList<String> arr = new ArrayList<>();
        ArrayList<Integer> a = new ArrayList<>();
        int ele = nums[nums.length-1];
        System.out.println(ele);
        for(int i=0;i<=ele;i++){
            if(nums[i]==i){
                a.add(nums[i]);
            }
            if(i>nums.length){
                break;
            }
        }   
        System.out.println(arr);
    }
}
