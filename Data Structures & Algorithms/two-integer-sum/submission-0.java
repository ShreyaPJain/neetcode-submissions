class Solution {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer,Integer> indx = new HashMap<Integer, Integer>();
        int cnt = 0;
        int diff = 0;
        for(int i : nums){
            diff = target-i;
            if(indx.containsKey(diff))
                return new int[] {indx.get(diff), cnt};
            indx.put(i, cnt);
            cnt++;
        }
        return new int[] {};
}
}
