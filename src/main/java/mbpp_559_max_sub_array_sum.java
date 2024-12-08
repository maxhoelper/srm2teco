package mbpp_559_max_sub_array_sum;

public class mbpp_559_max_sub_array_sum {

    
    public static int maxSubArraySum_Problem_1_3bf31d1c_231c_49c6_a7b3_ad2e5ad92b5f(ArrayList<Integer> a, int size) {
        int maxSum = 0;
        int sum = 0;
        for(int i = 0; i < a.size(); i++) {
            sum += a.get(i);
            if(sum > maxSum) {
                maxSum = sum;
            }
        }
        return maxSum;
    }

    
    public static int maxSubArraySum_Problem_1_371e067f_8ede_4de7_ad00_06383342081a(ArrayList<Integer> a, int size) {
        int max_so_far = a.get(0);
        int curr_max = a.get(0);
        for (int i = 1; i < size; i++) {
            curr_max = Math.max(a.get(i), curr_max + a.get(i));
            max_so_far = Math.max(max_so_far, curr_max);
        }
        return max_so_far;
    }

    
    public static int maxSubArraySum_Problem_1_24c15fe6_d105_4b79_b850_9b02c2c89b27(ArrayList<Integer> a, int size) {
        // Fill this in.
        int sum = 0;
        for (int i = 0; i < size; i++) {
            for (int j = i; j < size; j++) {
                sum = sum + a.get(j);
            }
        }
        return sum;
    }

    
    public static int maxSubArraySum_Problem_1_68e33145_806e_4420_bd76_a5f0d785509f(ArrayList<Integer> a, int size) {
        int sum = 0;
        int maxSum = 0;
        for(int i = 0; i < a.size(); i++) {
            if(i == 0) {
                sum = a.get(i);
                maxSum = sum;
            }
            else {
                sum = a.get(i) + sum;
                if(sum > maxSum) {
                    maxSum = sum;
                }
            }
        }
        return maxSum;
    }

    
    public static int maxSubArraySum_Problem_1_3d23bdfb_5d74_4288_a3f0_944a9dadcb77(ArrayList<Integer> a, int size) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += a.get(i);
            if (sum > max) {
                max = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSubArraySum_Problem_1_f734f5d6_eda0_4e88_8353_feb0776e5976(ArrayList<Integer> a, int size) {
        int max_so_far = a.get(0);
        int curr_max = a.get(0);
        for (int i = 1; i < size; i++) {
            curr_max = Math.max(a.get(i), curr_max + a.get(i));
            max_so_far = Math.max(max_so_far, curr_max);
        }
        return max_so_far;
    }

    
    public static int maxSubArraySum_Problem_2_643aeb03_abb3_415c_bcd8_0e1dc24087ed(ArrayList<Integer> a, int size) {
        int max = Integer.MIN_VALUE;
        ArrayList<Integer> tmp = new ArrayList<>();
        int sum = 0;
        int index = -1;
        for (int l : a) {
            if (tmp.size() > 0) {
                sum = (sum + l) % size;
                if (sum > max) {
                    max = sum;
                    index = tmp.size() - 1;
                }
            } else {
                sum = sum + l;
                if (sum > max) {
                    max = sum;
                    index = tmp.size() - 1;
                }
            }
            tmp.add(sum);
        }
        return sum;
    }

    
    public static int maxSubArraySum_Problem_2_a6c46b51_4fa0_48e2_8837_486ab4d6a18c(ArrayList<Integer> a, int size) {
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        int currentSum = 0;
        int currentMaxSum = Integer.MIN_VALUE;
        for(int i = 0; i < a.size(); i++) {
            currentSum = a.get(i);
            currentMaxSum = currentSum;
            for(int j = i; j < a.size(); j++) {
                currentSum += a.get(j);
                if(currentSum > currentMaxSum) {
                    currentMaxSum = currentSum;
                }
            }
            sum += currentMaxSum;
            if(sum > maxSum) {
                maxSum = sum;
            }
        }
        return maxSum;
    }

    
    public static int maxSubArraySum_Problem_2_a1c5c7e9_11a0_4951_9fd3_364d3985ee3f(ArrayList<Integer> a, int size) {
        int sum = Integer.MIN_VALUE;
        int currentSum = 0, maxSum = 0, index = 0;
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (currentSum + a.get(i) > maxSum) {
                maxSum = currentSum;
            }
            if (a.get(i) == maxSum) {
                count++;
            }
            currentSum += a.get(i);
            if (index == size - 1 && i == size) {
                sum -= maxSum;
                currentSum = 0;
                maxSum = 0;
                index = 0;
            }
        }
        return sum;
    }

    
    public static int maxSubArraySum_Problem_1_800d4ed8_7bca_4661_ab71_f0ff8c87e60a(ArrayList<Integer> a, int size) {
        int max_so_far = a.get(0);
        int curr_max = a.get(0);

        for (int i = 1; i < size; i++) {
            curr_max = Math.max(a.get(i), curr_max + a.get(i));
            max_so_far = Math.max(max_so_far, curr_max);
        }
        return max_so_far;
    }

    
    public static int maxSubArraySum_Problem_2_8594a440_100e_4639_a806_abae28101da1(ArrayList<Integer> a, int size) {
        int sum = 0, max = 0, temp = 0;
        int N = a.size();
        int last = 0;
        for(int i = 0; i < N; i++) {
            sum = sum + a.get(i);
            if(sum > size) {
                max = temp;
                temp = 0;
            } else {
                if(sum > max) {
                    max = sum;
                }
                temp += a.get(i);
            }
        }
        return max;
    }

    
    public static int maxSubArraySum_Problem_1_1f9ec917_b7f4_4354_9c01_4b1f7195d2d8(ArrayList<Integer> a, int size) {
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        int maxSumIndex = 0;
        int currentSum = 0;
        int currentSumIndex = 0;
        for(int i = 0; i < a.size(); i++) {
            currentSum = a.get(i);
            currentSumIndex = a.get(i);
            for(int j = i + 1; j < a.size(); j++) {
                currentSum += a.get(j);
                currentSumIndex += a.get(j);
                if(currentSum > maxSum) {
                    maxSum = currentSum;
                    maxSumIndex = currentSumIndex;
                }
            }
        }
        return maxSum;
    }

    
    public static int maxSubArraySum_Problem_1_b8af9a28_18a5_4e52_9e60_b2a73c7c1a75(ArrayList<Integer> a, int size) {
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0; i < a.size(); i++) {
            sum += a.get(i);
            if(sum > maxSum) {
                maxSum = sum;
            }
        }
        return maxSum;
    }

    
    public static int maxSubArraySum_Problem_1_7eb1e68e_55ee_46aa_8048_4656d8bb4220(ArrayList<Integer> a, int size) {
        int max_so_far = a.get(0);
        int curr_max = a.get(0);
        for (int i = 1; i < size; i++) {
            curr_max = Math.max(a.get(i), curr_max + a.get(i));
            max_so_far = Math.max(max_so_far, curr_max);
        }
        return max_so_far;
    }

    
    public static int maxSubArraySum_Problem_1_e80996df_fcfe_45bf_b4a2_07b9b8a06db3(ArrayList<Integer> a, int size) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += a.get(i);
            if (sum > max) {
                max = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSubArraySum_Problem_2_d56da683_4fd8_4548_af45_6065b0bd3ecb(ArrayList<Integer> a, int size) {
        int max_so_far = 0, max_ending_here = 0;
        for (int i = 0; i < size; i++) {
            max_ending_here = max_ending_here + a.get(i);
            if (max_ending_here < 0)
                max_ending_here = 0;
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        return max_so_far;
    }

    
    public static int maxSubArraySum_Problem_1_9e90da8e_7a67_410c_986e_99a4072c8923(ArrayList<Integer> a, int size) {
        int max_so_far = 0, max_ending_here = 0;
        for (int i = 0; i < size; i++) {
            max_ending_here = max_ending_here + a.get(i);
            if (max_ending_here < 0)
                max_ending_here = 0;
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        return max_so_far;
    }

    
    public static int maxSubArraySum_Problem_1_d1b1e160_5634_45db_b2bf_426279e34dd4(ArrayList<Integer> a, int size) {
        int maxSum = 0;

        // Loop through the array and find the largest subarray sum.
        for (int start = 0; start < a.size() - size; start += size) {
            int curSum = 0;
            for (int i = start; i < start + size; i++) {
                curSum += a.get(i);
            }

            maxSum = Math.max(curSum, maxSum);
        }

        return maxSum;
    }

    
    public static int maxSubArraySum_Problem_1_45f00c47_09ed_4d18_a8c9_e2ba999aeb90(ArrayList<Integer> a, int size) {
        int max_so_far = a.get(0);
        int curr_max = a.get(0);
        for (int i = 1; i < size; i++) {
            curr_max = Math.max(a.get(i), curr_max + a.get(i));
            max_so_far = Math.max(max_so_far, curr_max);
        }
        return max_so_far;
    }

    
    public static int maxSubArraySum_Problem_2_7f4515c0_a61b_4330_9894_f3b822d75eed(ArrayList<Integer> a, int size) {
        if (size == 0) return 0;
        ArrayList<Integer> subArray = new ArrayList<>();
        int maxSum = a.get(0); // Store the max sum for the first subarray
        for (int i = 0; i < a.size() - 1; i++) {
            int newSum = a.size() - i - 1;
            subArray.add(newSum);
            if (newSum > maxSum) {
                maxSum = newSum;
            }
        }
        int j = 1;
        while (j < a.size()) {
            int newSum = a.get(j);
            if (subArray.contains(newSum)) {
                continue;
            }
            subArray.add(newSum);
            if (newSum > maxSum) {
                maxSum = newSum;
            }
            j++;
        }
        return maxSum;
    }

    
    public static int maxSubArraySum_Problem_2_e718c631_64c1_4410_aa7b_050ca51c70b1(ArrayList<Integer> a, int size) {
        int max_so_far = a.get(0);
        int curr_max = a.get(0);
        for (int i = 1; i < size; i++) {
            curr_max = Math.max(a.get(i), curr_max + a.get(i));
            max_so_far = Math.max(max_so_far, curr_max);
        }
        return max_so_far;
    }

    
    public static int maxSubArraySum_Problem_2_45e2b2d6_526f_42c0_abd8_3b68b5e6b9e6(ArrayList<Integer> a, int size) {
        // Write your code here.
        int maxSum = 0L;
        int start = -1L;
        int end = 0L;
        Integer sum = null;
        for(int i = 0;i<a.size(); i++) {
            if(i == 0 || i == a.size() - 1) {
                sum += a.get(i);
            } else {
                if((sum + a.get(i)) > sum) {
                    start = i;
                    sum = (sum + a.get(i));
                }
                if((sum + a.get(i)) > sum) {
                    end = i;
                    sum = (sum + a.get(i));
                }
            }
        }
        if(sum != null && end > start && start < size) {
            maxSum = sum;
        }
        return maxSum;
    }

    
    public static int maxSubArraySum_Problem_1_443cd702_121b_4b06_8e24_8cc3d589578e(ArrayList<Integer> a, int size) {
        int max_so_far = a.get(0);
        int curr_max = a.get(0);
        for (int i = 1; i < size; i++) {
            curr_max = Math.max(a.get(i), curr_max + a.get(i));
            max_so_far = Math.max(max_so_far, curr_max);
        }
        return max_so_far;
    }

    
    public static int maxSubArraySum_Problem_1_4cfa8558_664b_4072_98ca_fa10b475c58d(ArrayList<Integer> a, int size) {
        int sum = 0;
        int maxSum = 0;
        for(int i = 0; i < a.size(); i++) {
            sum += a.get(i);
            if(sum > maxSum) {
                maxSum = sum;
            }
        }
        return maxSum;
    }

    
    public static int maxSubArraySum_Problem_1_17e901e8_0bde_4d55_a173_b2e71c18c1f2(ArrayList<Integer> a, int size) {
        int max_so_far = a.get(0);
        int curr_max = a.get(0);
        for (int i = 1; i < size; i++) {
            curr_max = Math.max(a.get(i), curr_max + a.get(i));
            max_so_far = Math.max(max_so_far, curr_max);
        }
        return max_so_far;
    }

    
    public static int maxSubArraySum_Problem_1_f4e7c7f2_2beb_4428_b946_4ec0dae33998(ArrayList<Integer> a, int size) {
        int max_so_far = a.get(0);
        int curr_max = a.get(0);

        for (int i = 1; i < size; i++) {
            curr_max = Math.max(a.get(i), curr_max + a.get(i));
            max_so_far = Math.max(max_so_far, curr_max);
        }
        return max_so_far;
    }

    
    public static int maxSubArraySum_Problem_1_28745cd0_90b6_495f_88eb_529df1a74efd(ArrayList<Integer> a, int size) {
        int sum = 0;
        int max = a.get(0);
        int maxSum = a.get(0);
        for(int i = 1; i < a.size(); i++) {
            sum += a.get(i);
            if(sum > maxSum) {
                maxSum = sum;
                max = a.get(i);
            }
        }
        return maxSum;
    }

    
    public static int maxSubArraySum_Problem_1_8d53228e_b53b_490e_aa26_28532a4b0729(ArrayList<Integer> a, int size) {
        int sum = 0;
        int maxSum = 0;
        int maxSumIndex = 0;
        for(int i = 0; i < a.size(); i++) {
            if(i == a.size() - 1) {
                sum += a.get(i);
            } else {
                sum += a.get(i + 1);
            }
            if(sum > maxSum) {
                maxSum = sum;
                maxSumIndex = i;
            }
        }
        return maxSum;
    }

    
    public static int maxSubArraySum_Problem_1_617b675b_68c8_4fc9_bff7_4257ce291cdd(ArrayList<Integer> a, int size) {
        int maxSum = 0;
        int sum = 0;
        for(int i = 0; i < a.size(); i++) {
            sum = a.get(i);
            for(int j = i; j < a.size(); j++) {
                sum -= a.get(j);
                if(sum > maxSum) {
                    maxSum = sum;
                }
            }
        }
        return maxSum;
    }

    
    public static int maxSubArraySum_Problem_1_61eb3e52_238d_4710_9d21_22064cc997d5(ArrayList<Integer> a, int size) {
        int sum = 0;
        int maxSum = 0;
        int maxSumIndex = 0;
        for(int i = 0; i < a.size(); i++) {
            sum = 0;
            for(int j = i; j < a.size(); j++) {
                sum += a.get(j);
                if(sum > maxSum) {
                    maxSum = sum;
                    maxSumIndex = j;
                }
            }
        }
        return maxSum;
    }

    
    public static int maxSubArraySum_Problem_2_5141b6ef_27c6_4b75_b091_0edaa647428f(ArrayList<Integer> a, int size) {
        int maxsum = a.get(0); // Set max sum equal to first element of list.
        int maxLength = 0; // Initialize max length to 0
        int start = 0; // Initialize start to 0.
        // Iterate over the array and keep track of the largest sum and the max length of the subarray so far.
        for (int i = 0; i < a.size(); i++) {
            int cursum = a.get(i); // Initialize current sum to current element of array.
            if (cursum > maxsum) { // If current sum is greater than previous sum.
                if (cursum > maxsum) { // Check if current sum is greater than previous max sum.
                    maxLength = i - start; // If it is, then store current length as new max length.
                    maxsum = cursum; // Store new max sum.
                } // Else if current sum is smaller than previous max sum, then it must be equal to previous max sum.
            } else { // Else keep the current sum as current max sum.
                maxsum = cursum; // Update current sum.
            }
            // If current length is greater than 0 then store the current start index.
            if (maxLength > 0) {
                start = i;
            }
        }
        return maxsum;
    }

    
    public static int maxSubArraySum_Problem_1_eef75969_9bde_4356_9374_de039f2dea7f(ArrayList<Integer> a, int size) {
        if(size == 0)
            return 0;
        int leftSum = 0, rightSum = 0;
        int sum = Integer.MIN_VALUE;
        for(int i = 0; i < size - 1; i++) {
            leftSum += a.get(i);
            rightSum = leftSum + a.get(i + 1);
            sum += Math.max(leftSum, rightSum);
        }
        return sum;
    }

    
    public static int maxSubArraySum_Problem_1_f920877b_9054_46bf_9eca_c53345a072fb(ArrayList<Integer> a, int size) {
        int sum = 0;
        int maxSum = 0;
        int maxStart = 0;
        int maxEnd = 0;
        int maxSumOfSubArray = 0;
        for(int i = 0; i < a.size(); i++) {
            if(i == 0) {
                sum = a.get(i);
                maxSum = sum;
                maxStart = i;
                maxEnd = i;
                maxSumOfSubArray = sum;
            }
            if(i == a.size() - 1) {
                sum = a.get(i) + sum;
                maxSum = sum;
                maxStart = i;
                maxEnd = i;
                maxSumOfSubArray = sum;
            }
            if(a.get(i) > maxSum) {
                sum = sum + a.get(i);
                maxSum = sum;
                maxStart = i;
                maxEnd = i;
                maxSumOfSubArray = sum;
            }
            if(a.get(i) < maxSum) {
                sum = sum - a.get(i);
                maxSum = sum;
                maxStart = i;
                maxEnd = i;
                maxSumOfSubArray = sum;
            }
        }
        return maxSumOfSubArray;
    }

    
    public static int maxSubArraySum_Problem_2_99ce8e96_3337_42c9_91d0_634087018ceb(ArrayList<Integer> a, int size) {
        int sum = 0;
        int maxSum = 0;
        int currentSum = 0;
        int currentMaxSum = 0;
        for(int i = 0; i < a.size(); i++) {
            currentSum = a.get(i);
            currentMaxSum = currentSum;
            for(int j = i; j < a.size(); j++) {
                currentSum = currentSum + a.get(j);
                if(currentSum > currentMaxSum) {
                    currentMaxSum = currentSum;
                }
            }
            sum += currentMaxSum;
            if(sum > maxSum) {
                maxSum = sum;
            }
        }
        return maxSum;
    }

    
    public static int maxSubArraySum_Problem_1_21f9b7c3_202e_422d_9687_299311667639(ArrayList<Integer> a, int size) {
        int sum = 0;
        List<Integer> list = new ArrayList<>();
        for (Integer i : a) {
            sum += i;
            if (sum > size) {
                list.clear();
                sum = i;
            } else {
                list.add(i);
            }
        }
        
        if (list.size() > 0) {
            sum = list.get(list.size() - 1);
            list.remove(list.size() - 1);
        }
        
        
        
        if (sum > size) {
            sum = size;
        }
        return sum;
    }

    
    public static int maxSubArraySum_Problem_1_23cd3655_38e3_4048_b6df_bf01065477df(ArrayList<Integer> a, int size) {
        int max_so_far = a.get(0);
        int curr_max = a.get(0);
        for (int i = 1; i < size; i++) {
            curr_max = Math.max(a.get(i), curr_max + a.get(i));
            max_so_far = Math.max(max_so_far, curr_max);
        }
        return max_so_far;
    }

    
    public static int maxSubArraySum_Problem_2_fe21dbdc_e14b_4af8_9f3f_834a935b7959(ArrayList<Integer> a, int size) {
        int max_so_far = a.get(0);
        int curr_max = a.get(0);
        for (int i = 1; i < size; i++) {
            curr_max = Math.max(a.get(i), curr_max + a.get(i));
            max_so_far = Math.max(max_so_far, curr_max);
        }
        return max_so_far;
    }

    
    public static int maxSubArraySum_Problem_2_b217cd47_3ffa_4ec5_9977_ce03f534ea42(ArrayList<Integer> a, int size) {
        int sum = 0;
        int index = 0;
        while (index < a.size() - 1) {
            sum = sum + a.get(index + 1);
            if (sum > size) {
                return sum;
            }
            index++;
        }
        return sum;
    }

    
    public static int maxSubArraySum_Problem_2_010b64aa_fee3_4b00_a4a4_cec805344556(ArrayList<Integer> a, int size) {
        int ans = a.get(0);
        for (int i = 1; i < a.size(); i++) {
            int subsum = 0;
            int j = 0;
            for (int k = 0; k <= i; k++) {
                subsum += a.get(k);
                if (subsum > ans) {
                    ans = subsum;
                }
            }
        }
        return ans;
    }

    
    public static int maxSubArraySum_Problem_2_98acbeee_de5f_4779_a461_0dcddfefb45c(ArrayList<Integer> a, int size) {
        if (size == 0)
            return 0;
        if (size == 1) {
            return a.get(0);
        }
        int sum = 0;
        int maxSum = 0;
        for (int i = 1; i < a.size(); i++) {
            sum += a.get(i);
            maxSum = Math.max(maxSum, sum);
            sum -= a.get(i);
        }
        return maxSum;
    }

    
    public static int maxSubArraySum_Problem_2_0dec9cac_64de_46bb_beb5_a0b64ae64fd8(ArrayList<Integer> a, int size) {
        int sum = 0;
        int maxSum = 0;
        int maxSumIndex = 0;
        int currentSum = 0;
        int currentMaxSum = 0;
        int currentMaxSumIndex = 0;
        int currentIndex = 0;
        for(int i = 0; i < a.size(); i++) {
            currentSum = a.get(i);
            currentMaxSum = currentSum;
            currentMaxSumIndex = i;
            for(int j = i; j < a.size(); j++) {
                currentSum = currentSum + a.get(j);
                if(currentSum > currentMaxSum) {
                    currentMaxSum = currentSum;
                    currentMaxSumIndex = j;
                }
            }
            if(currentMaxSumIndex != i) {
                sum += currentMaxSum;
                maxSum = currentMaxSum;
                maxSumIndex = currentMaxSumIndex;
            }
        }
        return sum;
    }

    
    public static int maxSubArraySum_Problem_1_09606517_7b98_42bc_8010_478a30078c3d(ArrayList<Integer> a, int size) {
        int max_so_far = a.get(0);
        int curr_max = a.get(0);
        for (int i = 1; i < size; i++) {
            curr_max = Math.max(a.get(i), curr_max + a.get(i));
            max_so_far = Math.max(max_so_far, curr_max);
        }
        return max_so_far;
    }

    
    public static int maxSubArraySum_Problem_1_c54c17e3_d81e_4100_ba5a_e318055fcbea(ArrayList<Integer> a, int size) {
        int max_so_far = a.get(0);
        int curr_max = a.get(0);

        for (int i = 1; i < size; i++) {
            curr_max = Math.max(a.get(i), curr_max + a.get(i));
            max_so_far = Math.max(max_so_far, curr_max);
        }
        return max_so_far;
    }

    
    public static int maxSubArraySum_Problem_1_26aca141_0ffc_497e_a96a_e710018b234d(ArrayList<Integer> a, int size) {
        int max_so_far = a.get(0);
        int curr_max = a.get(0);

        for (int i = 1; i < size; i++) {
            curr_max = Math.max(a.get(i), curr_max + a.get(i));
            max_so_far = Math.max(max_so_far, curr_max);
        }
        return max_so_far;
    }

    
    public static int maxSubArraySum_Problem_2_4eab9ecc_9c7f_4290_b8ff_1d950c1bca05(ArrayList<Integer> a, int size) {
        int max_so_far = a.get(0);
        int curr_max = a.get(0);
        for (int i = 1; i < size; i++) {
            curr_max = Math.max(a.get(i), curr_max + a.get(i));
            max_so_far = Math.max(max_so_far, curr_max);
        }
        return max_so_far;
    }

    
    public static int maxSubArraySum_Problem_1_d1111f74_4694_4ccf_9a9c_507c25c1ac60(ArrayList<Integer> a, int size) {
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
        for (int i = 0; i < size; i++) {
            max_ending_here = max_ending_here + a.get(i);
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        return max_so_far;
    }

    
    public static int maxSubArraySum_Problem_1_74bffb82_defd_4ac0_bda4_466d524de48e(ArrayList<Integer> a, int size) {
        int max_sum = 0;
        
        int start = 0;
        
        while (start < size) {
            
            int j = start;
            int sum = 0;
            
            while (j < size && a.get(j) < size) {
                
                sum += a.get(j++);
            }
            
            int current_max = Math.max(sum, max_sum);
            
            if (sum > max_sum) {
                
                max_sum = sum;
                
                start = j;
                
            }
        }
        
        return max_sum;
    }

    
    public static int maxSubArraySum_Problem_1_cda0a60e_eb06_4020_9a29_476d241c2be1(ArrayList<Integer> a, int size) {
        int max = -1;
        int sum = 0;
        for(int i = a.size()-1; i >= 0; i--) {
            sum += a.get(i);
            if(sum > max) {
                max = sum;
            }
        }
        return max;
    }

    
    public static int maxSubArraySum_Problem_1_bff7f71a_098c_4772_a4b4_250bb957300b(ArrayList<Integer> a, int size) {
        return a.stream().mapToInteger(i -> i * i).sum();
    }

    
    public static int maxSubArraySum_Problem_1_61e27a72_f4fa_4853_840e_8dbcded7ab39(ArrayList<Integer> a, int size) {
        int sum = 0;
        int maxSum = 0;
        for(int i = 0; i < a.size(); i++) {
            sum += a.get(i);
            if(sum > maxSum) {
                maxSum = sum;
            }
        }
        for(int i = 0; i < a.size(); i++) {
            sum -= a.get(i);
            if(sum > maxSum) {
                maxSum = sum;
            }
        }
        return maxSum;
    }

    
    public static int maxSubArraySum_Problem_1_dcfeec8c_63e0_4167_ab0b_31f4d8dead5d(ArrayList<Integer> a, int size) {
        int n = a.size();
        int i = 0;
        int j = 0;
        int sum = 0;
        int k = 0;
        while (j < n) {
            int count = 0;
            while (j < n && k < n) {
                if (j < n && a.get(j) >= a.get(k)) {
                    count += 1;
                    j++;
                }
                else {
                    count += 1;
                    k++;
                }
            }
            if (count == 2) {
                sum += a.get(j);
                j++;
            }
            else if (count > 2) {
                sum = sum + a.get(j);
                j++;
                k++;
            }
        }
        return sum;
    }

    
    public static int maxSubArraySum_Problem_2_cda0a60e_eb06_4020_9a29_476d241c2be1(ArrayList<Integer> a, int size) {
        int max = -1;
        int sum = 0;
        for(int i = a.size()-1; i >= 0; i--) {
            sum += a.get(i);
            if(sum > max) {
                max = sum;
            }
        }
        return max;
    }

    
    public static int maxSubArraySum_Problem_2_550d3dca_ca33_4716_aea4_556d24892ffe(ArrayList<Integer> a, int size) {
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        int maxSumIndex = 0;
        int maxSumSize = 0;
        int maxSumSizeIndex = 0;
        for(int i = 0; i < a.size(); i++) {
            int currentSum = 0;
            for(int j = i; j < a.size(); j++) {
                currentSum += a.get(j);
                if(currentSum > maxSum) {
                    maxSum = currentSum;
                    maxSumIndex = i;
                    maxSumSize = j - i;
                    maxSumSizeIndex = j;
                }
            }
        }
        return maxSum;
    }

    
    public static int maxSubArraySum_Problem_2_96976865_1d03_409d_8eaa_01eb04a3035c(ArrayList<Integer> a, int size) {
        // your code goes here
        int maxSum = -size+1;
        ArrayList<Integer> maxSubArray = new ArrayList<Integer>();
        for(int i = 0; i <= size; i++) {
            maxSubArray.add(i, -size);
        }
        for(int i = 0; i <= size; i++) {
            for(int j = i; j <= size; j++) {
                if(a.get(j) < 0 || a.get(j) > size) {
                    if(j - i >= 1) {
                        maxSubArray.set(j-i, a.get(j));
                        int sum = maxSubArray.get(j-i)+maxSubArray.get(j);
                        maxSum = Math.max(sum, maxSum);
                        if(sum > maxSum) {
                            maxSubArray.set(j, sum);
                        }
                    }
                }
            }
        }
        return maxSum;
    }

    
    public static int maxSubArraySum_Problem_1_26a4b2d9_430a_4985_9f3b_edce0a57bcf6(ArrayList<Integer> a, int size) {
        int sum = 0;
        int maxSum = 0;
        int maxSumIndex = 0;
        int currentSum = 0;
        int currentSumIndex = 0;
        int currentMaxSum = 0;
        int currentMaxSumIndex = 0;
        for(int i = 0; i < a.size(); i++) {
            currentSum = a.get(i);
            currentSumIndex = 0;
            currentMaxSum = a.get(i);
            currentMaxSumIndex = 0;
            for(int j = i; j < a.size(); j++) {
                currentSum = a.get(j);
                currentSumIndex++;
                currentMaxSum = Math.max(currentSum, currentMaxSum);
                currentMaxSumIndex++;
                if(currentSumIndex == size) {
                    sum += currentMaxSum;
                    maxSum = Math.max(maxSum, currentMaxSum);
                    maxSumIndex = currentMaxSumIndex;
                }
            }
        }
        return sum;
    }

    
    public static int maxSubArraySum_Problem_2_897ac834_9219_4573_8eb2_7ea1e4c296e2(ArrayList<Integer> a, int size) {
        int sum = 0L;
        int maxSum = 0L;
        ArrayList<Integer> subArray = new ArrayList<Integer>();
        for (int i = 0; i < size; i++) {
            if (subArray.size() == 0) {
                subArray.add(a.get(i));
            } else if (subArray.get(subArray.size() - 1) > a.get(i)) {
                subArray.add(a.get(i));
            } else {
                sum -= subArray.get(subArray.size() - 1);
                sum += a.get(i);
                subArray.removeAll(subArray);
                maxSum = Math.max(maxSum, sum);
            }
        }
        return maxSum;
    }

    
    public static int maxSubArraySum_Problem_1_5005a45d_f1cb_409e_a6e3_48cdb9d64d28(ArrayList<Integer> a, int size) {
        int n = a.size();
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int i=0; i<n; i++) {
            sum += a.get(i);
            if(sum > max) {
                max = sum;
            }
        }
        return max;
    }

    
    public static int maxSubArraySum_Problem_1_602bf444_5a59_4a62_bb54_89e16110f667(ArrayList<Integer> a, int size) {
        int max_so_far = a.get(0);
        int curr_max = a.get(0);
        for (int i = 1; i < size; i++) {
            curr_max = Math.max(a.get(i), curr_max + a.get(i));
            max_so_far = Math.max(max_so_far, curr_max);
        }
        return max_so_far;
    }

    
    public static int maxSubArraySum_Problem_2_12a3f72b_9c2d_4e81_822c_cc6f15e35c5b(ArrayList<Integer> a, int size) {
        int i = 0;
        int j = 0;
        int sum = 0;
        while(j < a.size() - 1) {
            sum += a.get(j + 1);
            i = j + 1;
            while(i < size && a.get(i) <= a.get(j + 1)) {
                i++;
            }
            j++;
        }
        return sum;
    }

    
    public static int maxSubArraySum_Problem_2_1b4a3944_275b_478a_87c8_ea5d04020f20(ArrayList<Integer> a, int size) {
        int sum = 0;
        int max = a.get(0);
        int start = 0;
        int end = 0;
        for(int i = 1; i < a.size(); i++) {
            sum += a.get(i);
            if(sum > max) {
                max = sum;
                start = i;
            }
            else if(sum < max) {
                end = i;
            }
        }
        return sum;
    }

    
    public static int maxSubArraySum_Problem_1_31def91a_9763_4849_a359_c5975e225500(ArrayList<Integer> a, int size) {
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        for(int i = 0; i < a.size(); i++) {
            sum += a.get(i);
            if(sum > maxSum) {
                maxSum = sum;
            }
        }
        return maxSum;
    }

    
    public static int maxSubArraySum_Problem_1_162fb9cb_3bc8_4c62_a975_68af7c6d6a9d(ArrayList<Integer> a, int size) {
        int max_so_far = a.get(0);
        int curr_max = a.get(0);
        for (int i = 1; i < size; i++) {
            curr_max = Math.max(a.get(i), curr_max + a.get(i));
            max_so_far = Math.max(max_so_far, curr_max);
        }
        return max_so_far;
    }

    
    public static int maxSubArraySum_Problem_1_47bb25fc_ae50_4a7f_8a68_c2b3b16f8061(ArrayList<Integer> a, int size) {
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0; i < a.size(); i++) {
            sum += a.get(i);
            if(sum > maxSum) {
                maxSum = sum;
            }
        }
        return maxSum;
    }

    
    public static int maxSubArraySum_Problem_1_573a4b3a_c69b_4783_b4ff_bdd105578087(ArrayList<Integer> a, int size) {
        int[] ar = new int[a.size()];
        int sum = 0;
        // Write your code here.
        for(int i=0;i<a.size();i++) {
            ar[i] = a.get(i);
        }

        for(int j=0;j<ar.length;j++) {
            for(int i=j+1;i<ar.length;i++) {
                if(ar[j]+ar[i]>sum) {
                    sum = ar[j]+ar[i];
                }
            }
        }
        return sum;
    }

    
    public static int maxSubArraySum_Problem_2_46d4f5da_ab24_4f3d_8de5_fa92d2d2659f(ArrayList<Integer> a, int size) {
        int[] a1 = new int[a.size()];
        int sum = 0;
        for (int i = 0; i < size; i++) {
            a1[i] = a.get(i);
        }

        for (int i = 0; i < size - 1; i++) {
            int temp = a1[i + 1] - a1[i];
            sum += temp;
        }
        return sum;
    }

    
    public static int maxSubArraySum_Problem_2_0dbc3b6e_7369_4dd1_9b8f_c2491e6f7cd8(ArrayList<Integer> a, int size) {
        int maxSum = 0;
        int sum = 0;
        int currentSum = 0;
        int currentMaxSum = 0;
        int currentMaxSumIndex = 0;
        for(int i = 0; i < a.size(); i++) {
            currentSum = a.get(i);
            currentMaxSum = currentSum;
            currentMaxSumIndex = i;
            for(int j = i + 1; j < a.size(); j++) {
                currentSum = currentSum + a.get(j);
                if(currentSum > currentMaxSum) {
                    currentMaxSum = currentSum;
                    currentMaxSumIndex = j;
                }
            }
            sum += currentMaxSum;
            if(sum > maxSum) {
                maxSum = sum;
            }
        }
        return maxSum;
    }

    
    public static int maxSubArraySum_Problem_2_2bf79f39_0e69_4ab2_8c97_f19ea28e42c4(ArrayList<Integer> a, int size) {
        if (size == 0) {
            return 0;
        }
        int max = a.get(0);
        int sum = 0;
        for (int i = 1; i < a.size(); i++) {
            sum = a.get(i);
            if (sum > max) {
                max = sum;
            }
        }
        for (int i = 0; i < a.size(); i++) {
            sum = a.get(i);
            if (sum > max) {
                max = sum;
            }
            if (sum > max) {
                sum -= max;
                max = 0;
            }
        }
        sum -= max;
        return sum;
    }

    
    public static int maxSubArraySum_Problem_2_bf733cf7_8f00_428b_a0a6_620fae73ed97(ArrayList<Integer> a, int size) {
        int maxSum = 0;
        int sum = 0;
        for (int i = 0; i < a.size(); i++) {
            sum += a.get(i);
            if (sum > maxSum) {
                maxSum = sum;
            } else if (sum < maxSum) {
                maxSum = sum;
            }
        }
        return maxSum;
    }

    
    public static int maxSubArraySum_Problem_2_47bb25fc_ae50_4a7f_8a68_c2b3b16f8061(ArrayList<Integer> a, int size) {
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0; i < a.size(); i++) {
            sum += a.get(i);
            if(sum > maxSum) {
                maxSum = sum;
            }
        }
        return maxSum;
    }

    
    public static int maxSubArraySum_Problem_1_37184106_fc79_4cd9_8a5f_dbaa1189f0df(ArrayList<Integer> a, int size) {
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
        for (int i = 0; i < size; i++) {
            max_ending_here = max_ending_here + a.get(i);
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        return max_so_far;
    }

}
