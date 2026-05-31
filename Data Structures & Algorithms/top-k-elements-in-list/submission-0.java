class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
          map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        int[] res = new int[k];

        for(int i = 0; i< k; i++){

            int freq = 0;
            int ele = 0;
 for(int key : map.keySet()){
                if(map.get(key) > freq){
                    freq = map.get(key);
                    ele = key;
                }
            }

            res[i] = ele;
            map.remove(ele); 
        } 

        return res;
        
    }
}
