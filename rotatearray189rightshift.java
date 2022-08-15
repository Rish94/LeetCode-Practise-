public class rotatearray189rightshift {
    public static void main(String[] args) {
        int nums[] = {1,2,3,4,5,6,7};
        int k = 3;
        while(k>0){
            int temp = nums[nums.length-1];
            for(int i=nums.length-1;i>0;i--){
                nums[i] = nums[i-1];
            }
            nums[0] = temp;
            k--;
        }
        for(int j=0;j<nums.length;j++){
            System.out.println(nums[j]);
        }
    }

}
