class Solution {
    public static int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length-1;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i] + nums[j] == target)
                {
                    return new int[]{i,j};
                }
            }
           
        }
         return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        int[] a = {1,3,5,6};
        int target = 5;
        System.out.println(twoSum(a,target));

    }
}
