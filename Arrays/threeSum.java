

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> resultSet = new HashSet<>();
        Arrays.sort(nums); // Sort the array to make processing easier

        int n = nums.length;

        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    ArrayList<Integer> list = new ArrayList<>();
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[k]);
                        resultSet.add(list);
                    }
                }
            }
        }

        // Convert the set to a list and return
        return new ArrayList<>(resultSet);
    }
}
