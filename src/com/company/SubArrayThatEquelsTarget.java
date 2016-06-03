package com.company;

/**
 * Created by admin on 03.06.2016.
 */
public final class SubArrayThatEquelsTarget {

    /**
     *
     * @param nums
     * @param target
     * @return
     */
    public static boolean execute(int[] nums, int target){
        return groupSumRecursive(0,1,0,nums,target);
    }

    private static boolean groupSumRecursive(int start,int end, int sum, int[] nums, int target) {
        if(sum == target && start != end) return true;
        if(start ==0 && end == nums.length) return sum == target;
        if(end == nums.length && start == nums.length) return false;
        if(sum < target)
            return groupSumRecursive(start,end+1,sum + nums[end],nums,target);
        else
            return groupSumRecursive(start+1,end, sum - nums[start],nums,target);
    }

}
