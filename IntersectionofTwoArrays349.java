import java.util.ArrayList;

public class IntersectionofTwoArrays349 {
    public static void main(String[] args) {
        int nums1[] = {1,2,2,1};
        int nums2[] = {2,2};
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
             for(int j=0;j<nums2.length;j++){
                 if(nums1[i]==nums2[j]){
                     arr.add(nums1[i]);
                 }
             }
        }
        int r = 0;
        ArrayList<Integer> arry = new ArrayList<>();
        for(int k = 0;k<arr.size()-1;k++){
        }
        int array[] = new int[arry.size()];
        for(int p = 0;p<arry.size();p++){
            array[p] = arry.get(p);
        }
        for(int t = 0;t<array.length;t++){
           System.out.print(" "+ array[t]);
        }
    }
}
