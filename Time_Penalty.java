class Solution {
    public static ArrayList<Integer> valEqualToPos(int[] arr) {
        ArrayList<Integer> ans = new ArrayList<>();
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == i + 1) {
                ans.add(arr[i]);
            }
        }
        
        return ans;
    }
}