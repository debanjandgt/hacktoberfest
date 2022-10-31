class Solution {
    public int findKthLargest(int[] nums, int k) {        
        ArrayList<Integer> al=new ArrayList<>();
        int val=0;
        for(int i=0;i<nums.length;i++)
            al.add(nums[i]);
       Collections.sort(al);

        return(al.get(al.size()-(k)));   
    }
}


