package Sprint_02;

public class Problem_18 {
    public static void main(String[] args) {
        
                int[] nums = {1, 2, 3}; // your input set
                int n = nums.length;

                int totalSubsets = (int)Math.pow(2, n); // total subsets = 2^n

                for (int i = 0; i < totalSubsets; i++) {
                    System.out.print("{ ");
                    for (int j = 0; j < n; j++) {
                        // check if j-th bit in i is set
                        if ((i & (1 << j)) != 0) {
                            System.out.print(nums[j] + " ");
                        }
                    }
                    System.out.println("}");
                }
            }
        }



