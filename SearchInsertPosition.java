class Solution {
    
    
    
    public static int searchInsert(int[] nums, int target) {
        for(int i = 0;i<nums.length;i++){
            if(target<=nums[i]){
                return i;
            }
        }
        return nums.length;
        //return array length
    }

    public static void main(String[] args) {
        int[] a = {1,3,5,6};
        int target = 5;
        System.out.println(searchInsert(a,target));

    }
}