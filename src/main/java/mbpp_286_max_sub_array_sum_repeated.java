package mbpp_286_max_sub_array_sum_repeated;

public class mbpp_286_max_sub_array_sum_repeated {

    
    public static int maxSubArraySumRepeated_Problem_1_5ada410b_86cd_4d6d_ab8f_e328e8d6ccd5(ArrayList<Integer> a, int n, int k) {
        int sum = 0;
        int maxSum = 0;
        for (int i = 0; i < n; i++) {
            sum += a.get(i);
        }
        maxSum = sum;
        for (int i = 0; i < n; i++) {
            sum = sum - a.get(i) + a.get( (i + n));
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }

    
    public static int maxSubArraySumRepeated_Problem_1_26e8f176_7816_48c2_921b_5bfe1c0a7990(ArrayList<Integer> a, int n, int k) {
        // Write your code here.
        ArrayList<Integer> max = new ArrayList<>();
        int ans = 0, sum = 0;
        for (int i = 0; i < n; ++i) {
            sum = 0;
            int count = 0;
            int j = i;
            while (j < n && count < k) {
                sum += a.get(j);
                ++count;
                ++j;
            }
            ans = Math.max(ans, sum);
            max.add(sum);
        }
        Collections.sort(max);
        return ans;
    }

    
    public static int maxSubArraySumRepeated_Problem_2_b87faabd_2b98_48bd_bc63_df300ccc1bde(ArrayList<Integer> a, int n, int k) {
        int max_sum = 0;
        int max_ending_here = 0;
        int max_so_far = 0;
        int max_element = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            max_ending_here = max_ending_here + a.get(i);
            if (max_element < a.get(i))
                max_element = a.get(i);
            if (max_ending_here < 0)
                max_ending_here = 0;
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        if (max_so_far == 0)
            return max_element;
        max_sum = max_so_far;
        for (int i = 0; i < n; i++) {
            max_sum = max_sum + a.get(i);
        }
        max_sum = max_sum * (k - 2);
        max_ending_here = 0;
        for (int i = 0; i < n; i++) {
            max_ending_here = max_ending_here + a.get(i);
            if (max_ending_here < 0)
                max_ending_here = 0;
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        return max_sum + max_so_far;
    }

    
    public static int maxSubArraySumRepeated_Problem_0_df76f3a6_6b83_4866_b936_58dc34797ab5(ArrayList<Integer> a, int n, int k) {
        int sum=0;
        int max_sum=Integer.MIN_VALUE;
        for(int i=0;i<k;i++){
            ArrayList<Integer> b = new ArrayList<Integer>();
            for(int j=0;j<n;j++){
                b.add(a.get(j));
            }
            sum += maxSubArraySumRepeated_Problem_0_df76f3a6_6b83_4866_b936_58dc34797ab5(b,n,k);
        }
        return sum;
    }

    
    public static int maxSubArraySumRepeated_Problem_2_d9b27fc0_a303_433c_aea0_a34bddf47d63(ArrayList<Integer> a, int n, int k) {
        // Write your code here
        return 0;
    }

    
    public static int maxSubArraySumRepeated_Problem_2_14fa3545_9ad2_45ba_bf38_0050101823ae(ArrayList<Integer> a, int n, int k) {
        int max_sum = 0;
        int max_ending_here = 0;
        for (int i = 0; i < n; i++) {
            max_ending_here = max_ending_here + a.get(i);
            if (max_ending_here < 0)
                max_ending_here = 0;
            if (max_sum < max_ending_here)
                max_sum = max_ending_here;
        }
        if (k == 1)
            return max_sum;
        int max_sum_circular = max_sum;
        int curr_max = 0;
        for (int i = 0; i < n; i++) {
            curr_max = curr_max + a.get(i);
            max_ending_here = max_ending_here - a.get(i);
            if (max_ending_here < 0)
                max_ending_here = 0;
            if (max_sum < max_ending_here)
                max_sum = max_ending_here;
        }
        max_sum_circular = Math.max(max_sum_circular, curr_max + max_sum * (k - 2));
        return max_sum_circular;
    }

    
    public static int maxSubArraySumRepeated_Problem_2_0ac693a3_4881_49d1_a6d6_f759154bedc4(ArrayList<Integer> a, int n, int k) {
        int largeSum = Integer.MIN_VALUE;
        // Find starting point of array list
        int start = 0;
        // Find length of array list
        int len = 0;
        // Find length of repeating array list
        int lenOfRep = 0;
        // Find starting point of repeating array list
        int startOfRep = 0;
        // Loop to find length of array list and length of repeating array list
        for (int i = 0; i < (2 * k - 1); i++) {
            if (a.size() > (2 * k - 1)) {
                len = a.size() - i;
            } else {
                len = i;
            }
            if (i < k) {
                lenOfRep = a.size() - i;
            } else {
                lenOfRep = i;
            }
            // Find largest sum possible from repeating array list
            if (lenOfRep > largeSum) {
                largeSum = lenOfRep;
                start = i;
                startOfRep = startOfRep + i;
            }
        }
        // Loop to find largest sum from array list
        int largeSum2 = 0;
        // Loop to find largest sum possible from array list
        for (int i = start; i < a.size(); i++) {
            if (a.size() > (2 * k - 1)) {
                largeSum2 = largeSum2 + a.get(i);
            } else {
                largeSum2 = largeSum2 + a.get(i);
            }
            if (largeSum2 > largeSum) {
                largeSum = largeSum2;
            }
        }
        return largeSum;
    }

    
    public static int maxSubArraySumRepeated_Problem_2_8002f859_8448_418f_a023_0b6e18f1e8e2(ArrayList<Integer> a, int n, int k) {
        int max = 0;
        for(int i = 0; i < a.size(); i++) {
            int sum = 0;
            for(int j = i; j < a.size(); j++) {
                sum += a.get(j);
                if(sum < 0) {
                    sum = 0;
                }
                if(sum > max) {
                    max = sum;
                }
            }
        }
        return max;
    }

    
    public static int maxSubArraySumRepeated_Problem_2_c25d4d12_9af5_43c0_ab69_141f01f62c08(ArrayList<Integer> a, int n, int k) {
        int max = 0;
        for (int i = 0; i < a.size(); i++) {
            int sum = 0;
            for (int j = i; j < a.size(); j += k) {
                sum += a.get(j);
                if (sum > max) {
                    max = sum;
                }
            }
        }
        return max;
    }

    
    public static int maxSubArraySumRepeated_Problem_1_67649de2_4782_4a76_a0f1_d8d49a9a63d9(ArrayList<Integer> a, int n, int k) {
        int max_sum = 0;
        int curr_sum = 0;
        int max_element = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            max_element = Math.max(max_element, a.get(i));
            curr_sum += a.get(i);
            if (curr_sum < 0) {
                curr_sum = 0;
            }
            max_sum = Math.max(max_sum, curr_sum);
        }
        if (max_element < 0) {
            return max_element;
        }
        int max_wrap = 0;
        int curr_wrap = 0;
        for (int i = 0; i < n; i++) {
            curr_wrap += a.get(i);
            if (curr_wrap < 0) {
                curr_wrap = 0;
            }
            max_wrap = Math.max(max_wrap, curr_wrap);
        }
        if (k == 1) {
            return max_sum;
        }
        int ans = max_wrap + (k - 2) * curr_wrap + max_sum;
        return ans;
    }

    
    public static int maxSubArraySumRepeated_Problem_0_e552105d_6cee_4710_8b5b_217852db9bd4(ArrayList<Integer> a, int n, int k) {
        // Your code goes here
        return 0;
    }

    
    public static int maxSubArraySumRepeated_Problem_2_ce66c73d_9a15_4602_a5f4_d915176bd34d(ArrayList<Integer> a, int n, int k) {
        int max_sum = 0;
        int max_ending_here = 0;
        for (int i = 0; i < n; i++) {
            max_ending_here = max_ending_here + a.get(i);
            if (max_ending_here < 0)
                max_ending_here = 0;
            if (max_sum < max_ending_here)
                max_sum = max_ending_here;
        }
        int min_sum = 0;
        int min_ending_here = 0;
        for (int i = 0; i < n; i++) {
            min_ending_here = min_ending_here + a.get(i);
            if (min_ending_here > 0)
                min_ending_here = 0;
            if (min_sum > min_ending_here)
                min_sum = min_ending_here;
        }
        int sum = 0;
        for (int i = 0; i < n; i++)
            sum += a.get(i);
        if (k == 1)
            return max_sum;
        else
            return Math.max(max_sum, sum * k - min_sum);
    }

    
    public static int maxSubArraySumRepeated_Problem_1_ef8c65e3_321f_4355_980f_a9a9b3fca60b(ArrayList<Integer> a, int n, int k) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < a.size(); i++) {
            sum += a.get(i);
            if (sum > max) {
                max = sum;
            }
            if (i >= k) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSubArraySumRepeated_Problem_0_647c1c37_e283_40f3_85ac_af8eb056eb6a(ArrayList<Integer> a, int n, int k) {
        int max = 0;
        for (int i = 0; i < a.size(); i++) {
            int sum = 0;
            for (int j = i; j < a.size(); j += k) {
                sum += a.get(j);
            }
            max = Math.max(max, sum);
        }
        return max;
    }

    
    public static int maxSubArraySumRepeated_Problem_2_eb4d3417_67ba_4aa1_87ad_0bf9af565c55(ArrayList<Integer> a, int n, int k) {
        int sum = 0;
        int maxSum = 0;
        ArrayList<Integer> temp = new ArrayList<>();
        for(int i = 0; i < k; i++) {
            temp.add(a.get(i));
        }
        for(int i = 0; i < k; i++) {
            sum = 0;
            for(int j = 0; j < n; j++) {
                sum += a.get(j);
            }
            sum -= temp.get(i);
            if(sum > maxSum) {
                maxSum = sum;
            }
        }
        return maxSum;
    }

    
    public static int maxSubArraySumRepeated_Problem_0_4d51c89c_7a2c_4116_8be4_c473c620c4b3(ArrayList<Integer> a, int n, int k) {
        int max_sum = 0;
        int curr_sum = 0;
        for (int i = 0; i < n; i++) {
            curr_sum += a.get(i);
            if (curr_sum < 0) {
                curr_sum = 0;
            }
            max_sum = Math.max(max_sum, curr_sum);
        }
        if (k == 1) {
            return max_sum;
        }
        int max_wrap = 0;
        for (int i = 0; i < n; i++) {
            max_wrap += a.get(i);
            a.set(i, -a.get(i));
        }
        int curr_wrap = 0;
        for (int i = 0; i < n; i++) {
            curr_wrap += a.get(i);
            if (curr_wrap < 0) {
                curr_wrap = 0;
            }
            max_wrap = Math.max(max_wrap, curr_wrap);
        }
        max_wrap = Math.max(max_wrap, 0);
        return Math.max(max_sum, max_wrap * (k - 2) + max_sum);
    }

    
    public static int maxSubArraySumRepeated_Problem_2_5dbffbe4_840e_4dd1_8996_3a3ca7924b40(ArrayList<Integer> a, int n, int k) {
        int max_sum = 0;
        int curr_sum = 0;
        for (int i = 0; i < n; i++) {
            curr_sum += a.get(i);
            if (curr_sum < 0) {
                curr_sum = 0;
            }
            max_sum = Math.max(max_sum, curr_sum);
        }
        if (k == 1) {
            return max_sum;
        }
        int max_wrap = 0;
        for (int i = 0; i < n; i++) {
            max_wrap += a.get(i);
            a.set(i, -a.get(i));
        }
        int min_wrap = 0;
        curr_sum = 0;
        for (int i = 0; i < n; i++) {
            curr_sum += a.get(i);
            if (curr_sum > 0) {
                curr_sum = 0;
            }
            min_wrap = Math.min(min_wrap, curr_sum);
        }
        min_wrap = Math.abs(min_wrap);
        int ans1 = max_wrap + min_wrap * (k - 2);
        int ans2 = max_sum;
        return Math.max(ans1, ans2);
    }

    
    public static int maxSubArraySumRepeated_Problem_1_6c6d32ab_b047_4720_9959_353ac73c14b0(ArrayList<Integer> a, int n, int k) {
        int largestSum = 0, curSum = 0;
        int sum = 0;
        for (int i = 0; i <= k; i++) {
            sum = 0;
            for (int j = 0; j < a.size(); j++) {
                sum = sum + a.get(j);
                if (j + 1 < a.size())
                    sum = sum + a.get(j + 1);
            }
            sum += Math.pow(2, i);
            largestSum = largestSum >= sum ? largestSum : sum;
        }
        return largestSum;
    }

    
    public static int maxSubArraySumRepeated_Problem_1_59917f3d_2b4c_4f4b_afe5_10fbf5702a2c(ArrayList<Integer> a, int n, int k) {
        return a.stream().reduce(Integer::sum).orElse(0L);
    }

    
    public static int maxSubArraySumRepeated_Problem_1_b88c9b21_70b9_4955_9fcf_1fe9b18d1bc7(ArrayList<Integer> a, int n, int k) {
        int max_sum = 0;
        int curr_sum = 0;
        for (int i = 0; i < n; i++) {
            curr_sum += a.get(i);
            if (curr_sum > max_sum) {
                max_sum = curr_sum;
            }
            if (curr_sum < 0) {
                curr_sum = 0;
            }
        }
        if (k == 1) {
            return max_sum;
        }
        int max_wrap = 0;
        for (int i = 0; i < n; i++) {
            max_wrap += a.get(i);
            a.set(i, a.get(i) * -1);
        }
        int curr_wrap = 0;
        for (int i = 0; i < n; i++) {
            curr_wrap += a.get(i);
            if (curr_wrap > max_wrap) {
                max_wrap = curr_wrap;
            }
            if (curr_wrap < 0) {
                curr_wrap = 0;
            }
        }
        int ans = Math.max(max_sum, max_wrap + (k - 2) * max_wrap);
        return ans;
    }

    
    public static int maxSubArraySumRepeated_Problem_2_e8c993a3_f267_4ffe_af9c_1532ae1e9b03(ArrayList<Integer> a, int n, int k) {
        int max_sum = 0;
        int max_ending_here = 0;
        int max_so_far = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a.get(i);
        }
        max_so_far = sum;
        for (int i = 0; i < n; i++) {
            max_ending_here += a.get(i);
            if (max_ending_here < 0) {
                max_ending_here = 0;
            }
            if (max_so_far < max_ending_here) {
                max_so_far = max_ending_here;
            }
        }
        max_sum = Math.max(max_so_far, max_sum);
        if (k == 1) {
            return max_sum;
        }
        max_sum = Math.max(max_sum, sum * (k - 2) + max_so_far);
        return max_sum;
    }

    
    public static int maxSubArraySumRepeated_Problem_2_1fbb2147_aeea_4b49_afeb_bb73ad9dba98(ArrayList<Integer> a, int n, int k) {
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
        for (int i = 0; i < n; i++) {
            max_ending_here = max_ending_here + a.get(i);
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        int max_wrap = 0;
        for (int i = 0; i < n; i++) {
            max_wrap += a.get(i);
            max_ending_here += a.get(i);
            if (max_ending_here > max_wrap)
                max_wrap = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        max_wrap = max_wrap > 0 ? max_wrap : 0;
        if (k == 1)
            return max_so_far;
        else
            return Math.max(max_so_far, max_wrap * (k - 2) + max_so_far);
    }

    
    public static int maxSubArraySumRepeated_Problem_2_0500dcf2_fc29_4547_a380_0a39b54c6fe4(ArrayList<Integer> a, int n, int k) {
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
        for (int i = 0; i < n * k; i++) {
            max_ending_here = max_ending_here + a.get( (i % n));
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        return max_so_far;
    }

    
    public static int maxSubArraySumRepeated_Problem_2_a2df5028_626a_4907_94f5_d101d5d5b2f8(ArrayList<Integer> a, int n, int k) {
        int max_sum = 0;
        int curr_sum = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a.get(i);
        }
        for (int i = 0; i < n; i++) {
            curr_sum += a.get(i);
            if (curr_sum < 0) {
                curr_sum = 0;
            }
            max_sum = Math.max(max_sum, curr_sum);
        }
        if (k == 1) {
            return max_sum;
        }
        int max_wrap = 0;
        for (int i = 0; i < n; i++) {
            max_wrap += a.get(i);
            a.set(i, -a.get(i));
        }
        max_wrap = max_wrap + maxSubArraySumRepeated_Problem_2_a2df5028_626a_4907_94f5_d101d5d5b2f8(a, n, 1);
        return Math.max(max_sum, max_wrap);
    }

    
    public static int maxSubArraySumRepeated_Problem_2_43894cc7_330c_4c0e_b0ee_d06ac985a46c(ArrayList<Integer> a, int n, int k) {
        int max_sum = 0;
        int curr_sum = 0;
        for (int i = 0; i < n; i++) {
            curr_sum += a.get(i);
            if (curr_sum < 0)
                curr_sum = 0;
            max_sum = Math.max(max_sum, curr_sum);
        }
        if (k == 1)
            return max_sum;
        int max_wrap = 0;
        for (int i = 0; i < n; i++) {
            max_wrap += a.get(i);
            a.set(i, -a.get(i));
        }
        curr_sum = 0;
        for (int i = 0; i < n; i++) {
            curr_sum += a.get(i);
            if (curr_sum < 0)
                curr_sum = 0;
            max_sum = Math.max(max_sum, curr_sum);
        }
        max_wrap = max_wrap + curr_sum;
        if (max_wrap > max_sum)
            return (k - 2) * max_wrap + max_sum;
        return max_sum;
    }

    
    public static int maxSubArraySumRepeated_Problem_1_739c3e27_f32d_4f21_a53f_05008b0a359d(ArrayList<Integer> a, int n, int k) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < k; j++) {
                sum += a.get(i);
                i++;
            }
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }

    
    public static int maxSubArraySumRepeated_Problem_1_1fbb2147_aeea_4b49_afeb_bb73ad9dba98(ArrayList<Integer> a, int n, int k) {
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
        for (int i = 0; i < n; i++) {
            max_ending_here = max_ending_here + a.get(i);
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        int max_wrap = 0;
        for (int i = 0; i < n; i++) {
            max_wrap += a.get(i);
            max_ending_here += a.get(i);
            if (max_ending_here > max_wrap)
                max_wrap = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        max_wrap = max_wrap > 0 ? max_wrap : 0;
        if (k == 1)
            return max_so_far;
        else
            return Math.max(max_so_far, max_wrap * (k - 2) + max_so_far);
    }

    
    public static int maxSubArraySumRepeated_Problem_2_cca452f9_a8d2_4ebd_8a4a_b95ea9461d9c(ArrayList<Integer> a, int n, int k) {
        int sum = 0;
        ArrayList<Integer> newArray = new ArrayList<>();
        
        for (int i = 0; i < k; i++) {
            sum = 0;
            for (int j = 0; j < n; j++) {
                sum+=a.get(j);
                newArray.add(sum);
            }
            
        }
        
        sum = Collections.max(newArray);
        
        return sum;
    }

    
    public static int maxSubArraySumRepeated_Problem_2_1b3f4564_176f_4cf0_9f61_b7fd96aae6f1(ArrayList<Integer> a, int n, int k) {
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
        for (int i = 0; i < n; i++) {
            max_ending_here = max_ending_here + a.get(i);
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        int max_wrap = 0;
        for (int i = 0; i < n; i++) {
            max_wrap += a.get(i);
            a.set(i, a.get(i) * -1);
        }
        max_wrap = max_wrap * k;
        max_so_far = Math.max(max_so_far, max_wrap);
        max_ending_here = 0;
        for (int i = 0; i < n; i++) {
            max_ending_here = max_ending_here + a.get(i);
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        return max_so_far;
    }

    
    public static int maxSubArraySumRepeated_Problem_0_6e88db2d_9de8_4f7e_82b7_1c1b18397f46(ArrayList<Integer> a, int n, int k) {
        int max_sum = 0;
        int curr_sum = 0;
        for (int i = 0; i < n; i++) {
            curr_sum += a.get(i);
            if (curr_sum > max_sum) {
                max_sum = curr_sum;
            }
            if (curr_sum < 0) {
                curr_sum = 0;
            }
        }
        if (k == 1) {
            return max_sum;
        }
        int max_wrap = 0;
        for (int i = 0; i < n; i++) {
            max_wrap += a.get(i);
            a.set(i, a.get(i) * -1);
        }
        int curr_wrap = 0;
        for (int i = 0; i < n; i++) {
            curr_wrap += a.get(i);
            if (curr_wrap > max_wrap) {
                max_wrap = curr_wrap;
            }
            if (curr_wrap < 0) {
                curr_wrap = 0;
            }
        }
        int ans = max_sum + (k - 2) * max_wrap;
        return Math.max(ans, max_sum);
    }

    
    public static int maxSubArraySumRepeated_Problem_2_10e91119_c0ac_42b6_b8f9_b12d5b5815c0(ArrayList<Integer> a, int n, int k) {
        // Write your code here
        int sum = 0;
        ArrayList<Integer> b = new ArrayList<>(a);
        for(int i = 0; i <k; i++) {
            sum = sum + b.get(i);
        }
        int count = 0;
        for(Integer d : b) {
            sum += d;
            count++;
            if(b.get(count) == 0) {
                b.remove(count);
            }
        }
        return sum;
    }

    
    public static int maxSubArraySumRepeated_Problem_1_06fe1616_e8e9_4808_94ea_4e06e372d043(ArrayList<Integer> a, int n, int k) {
        int max_sum = 0;
        int temp = 0;
        for(int i = 0; i < a.size(); i++) {
            temp = temp + a.get(i);
            if(temp == k) {
                temp = 0;
                for (int j = i + 1; j < a.size(); j++) {
                    temp += a.get(j);
                    if (temp > max_sum) {
                        max_sum = temp;
                    }
                }
            }
        }
        return max_sum;
    }

    
    public static int maxSubArraySumRepeated_Problem_2_ddf1781e_099c_422e_a7d4_3601b3a6d42f(ArrayList<Integer> a, int n, int k) {
        int max = 0;
        for (int i = 0; i < a.size(); i++) {
            int sum = 0;
            for (int j = i; j < a.size(); j += k) {
                sum += a.get(j);
                if (sum > max) {
                    max = sum;
                }
            }
        }
        return max;
    }

    
    public static int maxSubArraySumRepeated_Problem_1_fa257d72_6c72_4a4c_9f83_26110f6950a9(ArrayList<Integer> a, int n, int k) {
        int max_sum = 0;
        int curr_sum = 0;
        for (int i = 0; i < n; i++) {
            curr_sum += a.get(i);
            if (curr_sum < 0)
                curr_sum = 0;
            max_sum = Math.max(max_sum, curr_sum);
        }
        if (k == 1)
            return max_sum;
        int max_wrap = 0;
        for (int i = 0; i < n; i++) {
            max_wrap += a.get(i);
            a.set(i, -a.get(i));
        }
        int max_wrap_sum = maxSubArraySumRepeated_Problem_1_fa257d72_6c72_4a4c_9f83_26110f6950a9(a, n, 1);
        max_wrap = max_wrap + max_wrap_sum;
        return Math.max(max_wrap, max_sum);
    }

    
    public static int maxSubArraySumRepeated_Problem_0_326567b5_8342_4635_a391_60384fc5f259(ArrayList<Integer> a, int n, int k) {
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
        for (int i = 0; i < n * k; i++) {
            max_ending_here = max_ending_here + a.get( (i % n));
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        return max_so_far;
    }

    
    public static int maxSubArraySumRepeated_Problem_2_647c1c37_e283_40f3_85ac_af8eb056eb6a(ArrayList<Integer> a, int n, int k) {
        int max = 0;
        for (int i = 0; i < a.size(); i++) {
            int sum = 0;
            for (int j = i; j < a.size(); j += k) {
                sum += a.get(j);
            }
            max = Math.max(max, sum);
        }
        return max;
    }

    
    public static int maxSubArraySumRepeated_Problem_2_b88c9b21_70b9_4955_9fcf_1fe9b18d1bc7(ArrayList<Integer> a, int n, int k) {
        int max_sum = 0;
        int curr_sum = 0;
        for (int i = 0; i < n; i++) {
            curr_sum += a.get(i);
            if (curr_sum > max_sum) {
                max_sum = curr_sum;
            }
            if (curr_sum < 0) {
                curr_sum = 0;
            }
        }
        if (k == 1) {
            return max_sum;
        }
        int max_wrap = 0;
        for (int i = 0; i < n; i++) {
            max_wrap += a.get(i);
            a.set(i, a.get(i) * -1);
        }
        int curr_wrap = 0;
        for (int i = 0; i < n; i++) {
            curr_wrap += a.get(i);
            if (curr_wrap > max_wrap) {
                max_wrap = curr_wrap;
            }
            if (curr_wrap < 0) {
                curr_wrap = 0;
            }
        }
        int ans = Math.max(max_sum, max_wrap + (k - 2) * max_wrap);
        return ans;
    }

    
    public static int maxSubArraySumRepeated_Problem_1_a7a5f0c2_f5fb_4b1c_8695_c1d97f117e3e(ArrayList<Integer> a, int n, int k) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                sum += a.get(j);
                if (sum > k) {
                    sum = k;
                    break;
                }
            }
        }
        return sum;
    }

    
    public static int maxSubArraySumRepeated_Problem_2_bfdca14f_e662_46d0_b734_1599186a77b7(ArrayList<Integer> a, int n, int k) {
        int max_sum = 0;
        int max_ending_here = 0;
        for (int i = 0; i < n; i++) {
            max_ending_here = max_ending_here + a.get(i);
            if (max_ending_here < 0)
                max_ending_here = 0;
            if (max_sum < max_ending_here)
                max_sum = max_ending_here;
        }
        if (k == 1)
            return max_sum;
        int max_sum_circular = max_sum;
        int curr_max = 0;
        for (int i = 0; i < n; i++) {
            curr_max = curr_max + a.get(i);
            max_sum_circular = max_sum_circular + a.get(i);
        }
        if (max_sum_circular > max_sum)
            max_sum = max_sum_circular;
        for (int i = 0; i < n; i++) {
            curr_max = curr_max - a.get(i);
            if (curr_max > max_sum)
                max_sum = curr_max;
        }
        return max_sum;
    }

    
    public static int maxSubArraySumRepeated_Problem_2_7122830b_8c4d_4801_8163_5b9103177290(ArrayList<Integer> a, int n, int k) {
        int sum = 0; // Initialize sum to zero

        // Iterate over every element in the array
        for (int i = 0; i < a.size(); i++) {
            sum += a.get(i); // Add the element to the sum

            // Repeat the element k times
            for (int j = 0; j < k; j++) {
                a.set(i, sum); // Add the sum to the element
                sum = 0; // Reset the sum
            }
        }

        // Return the sum of the final element
        return sum;
    }

    
    public static int maxSubArraySumRepeated_Problem_2_c43f3077_b534_4e41_91b6_6ea5d8a09bc5(ArrayList<Integer> a, int n, int k) {
        int max_so_far = 0, max_ending_here = 0;
        for (int i = 0; i < n; i++) {
            max_ending_here = max_ending_here + a.get(i);
            if (max_ending_here < 0)
                max_ending_here = 0;
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        if (k == 1)
            return max_so_far;
        int max_wrap = 0;
        for (int i = 0; i < n; i++) {
            max_wrap += a.get(i);
            a.set(i, a.get(i) * -1);
        }
        max_wrap = max_wrap + maxSubArraySumRepeated_Problem_2_c43f3077_b534_4e41_91b6_6ea5d8a09bc5(a, n, 1);
        return Math.max(max_so_far, max_wrap);
    }

    
    public static int maxSubArraySumRepeated_Problem_2_cdb1afcf_2595_472e_8440_8f9da1cead62(ArrayList<Integer> a, int n, int k) {
        // Write your code here
        int max_so_far = 0;
        int max_ending_here = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a.get(i);
            max_ending_here = Math.max(max_ending_here + a.get(i), a.get(i));
            max_so_far = Math.max(max_so_far, max_ending_here);
        }
        int max_wrap = 0;
        for (int i = 0; i < n; i++) {
            max_wrap += a.get(i);
            a.set(i, -a.get(i));
        }
        max_wrap = max_wrap + maxSubArraySumRepeated_Problem_2_cdb1afcf_2595_472e_8440_8f9da1cead62(a, n, 1);
        if (max_wrap > max_so_far && max_wrap != 0)
            max_so_far = max_wrap;
        return max_so_far * k;
    }

    
    public static int maxSubArraySumRepeated_Problem_1_4ad71d04_008d_483b_96ec_d6d91638c2e6(ArrayList<Integer> a, int n, int k) {
        int max_so_far = 0, max_ending_here = 0;
        for (int i = 0; i < n; i++) {
            max_ending_here = max_ending_here + a.get(i);
            if (max_ending_here < 0)
                max_ending_here = 0;
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        if (k == 1)
            return max_so_far;
        int max_wrap = 0;
        for (int i = 0; i < n; i++) {
            max_wrap += a.get(i);
            a.set(i, -a.get(i));
        }
        max_wrap = max_wrap + maxSubArraySumRepeated_Problem_1_4ad71d04_008d_483b_96ec_d6d91638c2e6(a, n, k - 2);
        return Math.max(max_so_far, max_wrap);
    }

    
    public static int maxSubArraySumRepeated_Problem_2_a2dd595a_1d3a_43f9_90d8_1719d01e26e1(ArrayList<Integer> a, int n, int k) {
        int max = 0;
        for (int i = 0; i < a.size(); i++) {
            int sum = 0;
            for (int j = i; j < a.size(); j += k) {
                sum += a.get(j);
                if (sum > max) {
                    max = sum;
                }
            }
        }
        return max;
    }

    
    public static int maxSubArraySumRepeated_Problem_1_eb7d8ff9_2d61_45ce_84ce_f037bc44ee1d(ArrayList<Integer> a, int n, int k) {
        ArrayList<Integer> modified = new ArrayList<Integer>();
        ArrayList<Integer> repeated = new ArrayList<Integer>();

        for(int i=0; i < n; i++) {
            for(int j=i; j < n; j++) {
                int temp = a.get(i);
                a.set(j, a.get(i));
                a.set(i, temp);
            }
        }

        for(int i=0; i < k; i++) {
            modified.addAll(a);
            repeated.addAll(a);
        }

        // Find the difference between all consecutive sums
        int diff = 0;
        for(int i=0; i < k; i++) {
            diff += repeated.get(i);
            repeated.removeAll(modified);
        }

        return diff;
    }

    
    public static int maxSubArraySumRepeated_Problem_0_eb4d3417_67ba_4aa1_87ad_0bf9af565c55(ArrayList<Integer> a, int n, int k) {
        int sum = 0;
        int maxSum = 0;
        ArrayList<Integer> temp = new ArrayList<>();
        for(int i = 0; i < k; i++) {
            temp.add(a.get(i));
        }
        for(int i = 0; i < k; i++) {
            sum = 0;
            for(int j = 0; j < n; j++) {
                sum += a.get(j);
            }
            sum -= temp.get(i);
            if(sum > maxSum) {
                maxSum = sum;
            }
        }
        return maxSum;
    }

    
    public static int maxSubArraySumRepeated_Problem_0_5ad767f6_05ed_4bb4_b87f_59ad11b8e883(ArrayList<Integer> a, int n, int k) {
        int max_sum = 0;
        int curr_sum = 0;
        for (int i = 0; i < n; i++) {
            curr_sum = Math.max(a.get(i), curr_sum + a.get(i));
            max_sum = Math.max(max_sum, curr_sum);
        }
        int max_wrap = 0;
        for (int i = 0; i < n; i++) {
            max_wrap += a.get(i);
            a.set(i, a.get(i) * -1);
        }
        curr_sum = 0;
        for (int i = 0; i < n; i++) {
            curr_sum = Math.max(a.get(i), curr_sum + a.get(i));
            max_sum = Math.max(max_sum, curr_sum);
        }
        max_wrap = max_wrap * k + max_sum;
        return Math.max(max_wrap, max_sum);
    }

    
    public static int maxSubArraySumRepeated_Problem_1_5cdb98a3_47ff_4901_8618_58853b4e2814(ArrayList<Integer> a, int n, int k) {
        int largest = 0;
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += a.get(i);
            largest = sum > largest ? sum : largest;
        }
        return largest;
    }

    
    public static int maxSubArraySumRepeated_Problem_0_43894cc7_330c_4c0e_b0ee_d06ac985a46c(ArrayList<Integer> a, int n, int k) {
        int max_sum = 0;
        int curr_sum = 0;
        for (int i = 0; i < n; i++) {
            curr_sum += a.get(i);
            if (curr_sum < 0)
                curr_sum = 0;
            max_sum = Math.max(max_sum, curr_sum);
        }
        if (k == 1)
            return max_sum;
        int max_wrap = 0;
        for (int i = 0; i < n; i++) {
            max_wrap += a.get(i);
            a.set(i, -a.get(i));
        }
        curr_sum = 0;
        for (int i = 0; i < n; i++) {
            curr_sum += a.get(i);
            if (curr_sum < 0)
                curr_sum = 0;
            max_sum = Math.max(max_sum, curr_sum);
        }
        max_wrap = max_wrap + curr_sum;
        if (max_wrap > max_sum)
            return (k - 2) * max_wrap + max_sum;
        return max_sum;
    }

    
    public static int maxSubArraySumRepeated_Problem_1_647c1c37_e283_40f3_85ac_af8eb056eb6a(ArrayList<Integer> a, int n, int k) {
        int max = 0;
        for (int i = 0; i < a.size(); i++) {
            int sum = 0;
            for (int j = i; j < a.size(); j += k) {
                sum += a.get(j);
            }
            max = Math.max(max, sum);
        }
        return max;
    }

    
    public static int maxSubArraySumRepeated_Problem_0_fa66c64c_53d8_4f11_a237_06de5e76a984(ArrayList<Integer> a, int n, int k) {
        int max_sum = 0;
        int curr_sum = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a.get(i);
        }
        for (int i = 0; i < n; i++) {
            curr_sum += a.get(i);
            if (curr_sum < 0) {
                curr_sum = 0;
            }
            max_sum = Math.max(max_sum, curr_sum);
        }
        if (k == 1) {
            return max_sum;
        }
        int max_wrap = 0;
        for (int i = 0; i < n; i++) {
            max_wrap += a.get(i);
            a.set(i, -a.get(i));
        }
        max_wrap = max_wrap + maxSubArraySumRepeated_Problem_0_fa66c64c_53d8_4f11_a237_06de5e76a984(a, n, 1);
        return Math.max(max_sum, max_wrap);
    }

    
    public static int maxSubArraySumRepeated_Problem_1_5e9d3dae_dd5c_4822_8244_6daf74e038be(ArrayList<Integer> a, int n, int k) {
        int max = 0;
        for (int i = 0; i < a.size(); i++) {
            int sum = 0;
            for (int j = i; j < a.size(); j += k) {
                sum += a.get(j);
            }
            max = Math.max(max, sum);
        }
        return max;
    }

    
    public static int maxSubArraySumRepeated_Problem_0_6d4c206d_cdff_4437_b014_2e33860d8fe1(ArrayList<Integer> a, int n, int k) {
        int max_so_far = 0, max_ending_here = 0;
        for (int i = 0; i < n * k; i++) {
            max_ending_here = max_ending_here + a.get( (i % n));
            if (max_ending_here < 0)
                max_ending_here = 0;
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        return max_so_far;
    }

    
    public static int maxSubArraySumRepeated_Problem_1_52cea992_c04b_455a_a3a1_a9861215e2c6(ArrayList<Integer> a, int n, int k) {
        int max_sum = 0;
        int curr_sum = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a.get(i);
        }
        for (int i = 0; i < n; i++) {
            curr_sum += a.get(i);
            if (curr_sum > max_sum) {
                max_sum = curr_sum;
            }
            if (curr_sum < 0) {
                curr_sum = 0;
            }
        }
        if (k == 1) {
            return max_sum;
        }
        int max_wrap = curr_sum;
        for (int i = 0; i < n; i++) {
            curr_sum += a.get(i);
            if (curr_sum > max_wrap) {
                max_wrap = curr_sum;
            }
            if (curr_sum < 0) {
                curr_sum = 0;
            }
        }
        if (k == 2) {
            return max_wrap;
        }
        int ans = Math.max(max_wrap, max_sum + (k - 2) * sum);
        return ans;
    }

    
    public static int maxSubArraySumRepeated_Problem_0_21864a41_940e_426d_a085_e53bb1fd27f9(ArrayList<Integer> a, int n, int k) {
        int max_so_far = Integer.MIN_VALUE;
        int max_ending_here = 0;
        for (int i = 0; i < n * k; i++) {
            max_ending_here = max_ending_here + a.get( (i % n));
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        return max_so_far;
    }

    
    public static int maxSubArraySumRepeated_Problem_0_5c1066ce_f271_47d4_8f4d_1a142c4d36ca(ArrayList<Integer> a, int n, int k) {
        int max_sum = Integer.MIN_VALUE;
        int curr_sum = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a.get(i);
        }
        for (int i = 0; i < n; i++) {
            curr_sum += a.get(i);
            if (i != 0) {
                curr_sum = Math.max(curr_sum, curr_sum + sum * (k - 1));
            }
            max_sum = Math.max(max_sum, curr_sum);
        }
        return max_sum;
    }

    
    public static int maxSubArraySumRepeated_Problem_0_cdb2e03a_8fe6_495a_9ab2_7dbd90566d6f(ArrayList<Integer> a, int n, int k) {
        int sum = 0, maxSum = 0, start = 0, end = 0, sumStart = 0;
        // Find the first element of the first array list that is >= k
        int firstElement = a.get(0);
        for(int i = 1; i < a.size(); i++) {
            if(a.get(i) >= k) {
                firstElement = a.get(i);
                break;
            }
        }
        // Find the first element of the remaining array list that is >= k
        int remainingElement = a.get(0);
        for(int i = 1; i < a.size(); i++) {
            if(a.get(i) >= k) {
                remainingElement = a.get(i);
                break;
            }
        }
        // Find the first element of the last array list that is >= k
        int lastElement = a.get(0);
        for(int i = 1; i < a.size(); i++) {
            if(a.get(i) >= k) {
                lastElement = a.get(i);
                break;
            }
        }
        // Find the largest sum of the remaining array list which is >= k
        while(remainingElement < n) {
            sum += remainingElement;
            maxSum = maxSum > sum ? maxSum : sum;
            remainingElement++;
        }
        // Find the largest sum of the first array list which is >= k
        while(firstElement < n) {
            sum += firstElement;
            sumStart = sumStart > sum ? sumStart : sum;
            firstElement++;
        }
        // Find the largest sum of the last array list which is >= k
        while(lastElement < n) {
            sum += lastElement;
            end = end > sum ? end : sum;
            lastElement++;
        }
        // Find the largest sum of the remaining array list which is >= k
        while(sum < k) {
            sum += remainingElement;
            maxSum = maxSum > sum ? maxSum : sum;
            remainingElement++;
        }
        // Find the largest sum of the first array list which is >= k
        while(sumStart < k) {
            sum += firstElement;
            sumStart = sumStart > sum ? sumStart : sum;
            firstElement++;
        }
        // Find the largest sum of the last array list which is >= k
        while(end < k) {
            sum += lastElement;
            end = end > sum ? end : sum;
            lastElement++;
        }
        // Find the largest sum of the remaining array list which is >= k
        while(sum < k) {
            sum += remainingElement;
            maxSum = maxSum > sum ? maxSum : sum;
            remainingElement++;
        }
        // Return the sum of the remaining array list
        return sum;
    }

    
    public static int maxSubArraySumRepeated_Problem_0_5a4440ca_af19_4987_9917_881a664b550e(ArrayList<Integer> a, int n, int k) {
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
        for (int i = 0; i < n; i++) {
            max_ending_here = max_ending_here + a.get(i);
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        int max_wrap = 0;
        for (int i = 0; i < n; i++) {
            max_wrap += a.get(i);
            max_ending_here += a.get(i);
            if (max_ending_here > max_wrap)
                max_wrap = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        int max_non_wrap = max_so_far;
        if (max_wrap > max_non_wrap)
            return (max_wrap * k) - max_wrap;
        else
            return (max_non_wrap * k);
    }

    
    public static int maxSubArraySumRepeated_Problem_2_1c636457_e34f_4731_8113_d051e69328cd(ArrayList<Integer> a, int n, int k) {
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
        for (int i = 0; i < n * k; i++) {
            max_ending_here = max_ending_here + a.get( (i % n));
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        return max_so_far;
    }

    
    public static int maxSubArraySumRepeated_Problem_0_7bdeb18d_506a_4a5e_a322_d2492e15f867(ArrayList<Integer> a, int n, int k) {
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a.get(i);
            max_ending_here = max_ending_here + a.get(i);
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        int max_wrap = 0;
        for (int i = 0; i < n; i++) {
            max_wrap += a.get(i);
            a.set(i, a.get(i) * -1);
        }
        max_wrap = max_wrap * k;
        max_ending_here = 0;
        for (int i = 0; i < n; i++) {
            max_ending_here = max_ending_here + a.get(i);
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        max_so_far = max_so_far + max_wrap;
        if (max_so_far > sum)
            return max_so_far;
        else
            return sum;
    }

    
    public static int maxSubArraySumRepeated_Problem_0_6f22b65e_1e32_4963_8e8c_47294b59aaf5(ArrayList<Integer> a, int n, int k) {
        int max = 0;
        for (int i = 0; i < a.size(); i++) {
            int sum = 0;
            for (int j = i; j < a.size(); j += k) {
                sum += a.get(j);
            }
            max = Math.max(max, sum);
        }
        return max;
    }

    
    public static int maxSubArraySumRepeated_Problem_0_b5c7d1e0_90c9_4ed4_befd_fba607d3c9cf(ArrayList<Integer> a, int n, int k) {
        int max_so_far = 0;
        int max_ending_here = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a.get(i);
            max_ending_here = Math.max(max_ending_here + a.get(i), 0);
            max_so_far = Math.max(max_so_far, max_ending_here);
        }
        int max_wrap = 0;
        for (int i = 0; i < n; i++) {
            max_wrap += a.get(i);
            max_ending_here = Math.max(max_ending_here + a.get(i), 0);
            max_so_far = Math.max(max_so_far, max_ending_here);
        }
        max_wrap = Math.max(max_wrap, 0);
        if (k == 1) {
            return max_so_far;
        }
        return Math.max(max_so_far, max_wrap * (k - 2) + sum);
    }

    
    public static int maxSubArraySumRepeated_Problem_0_cca452f9_a8d2_4ebd_8a4a_b95ea9461d9c(ArrayList<Integer> a, int n, int k) {
        int sum = 0;
        ArrayList<Integer> newArray = new ArrayList<>();
        
        for (int i = 0; i < k; i++) {
            sum = 0;
            for (int j = 0; j < n; j++) {
                sum+=a.get(j);
                newArray.add(sum);
            }
            
        }
        
        sum = Collections.max(newArray);
        
        return sum;
    }

    
    public static int maxSubArraySumRepeated_Problem_0_d29b6652_5aeb_44a0_80d4_d5139b316621(ArrayList<Integer> a, int n, int k) {
        int max_sum = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a.get(i);
        }
        max_sum = sum;
        for (int i = 0; i < n; i++) {
            sum = sum - a.get(i) + a.get( ((i + n) % n));
            max_sum = Math.max(max_sum, sum);
        }
        return max_sum * k;
    }

    
    public static int maxSubArraySumRepeated_Problem_1_8da6cdac_9e16_4d17_810a_9fc4c47d128a(ArrayList<Integer> a, int n, int k) {
        // TODO: Add code here
        int largestSum = 0;
        ArrayList <Integer> repeatedArray = new ArrayList<>();
        ArrayList <Integer> modifiedArray = new ArrayList<>();
        for(int i=0;i<k;i++){
            repeatedArray.addAll(a);
            repeatedArray.remove(i+1);
            modifiedArray.addAll(repeatedArray);
            modifiedArray.remove(i);
            modifiedArray.remove(i-1);
        }
        int repeatedCount = 0;
        int modifiedCount = 0;
        int maxIndex = 0;
        for(int i =0;i<modifiedArray.size();i++){
            repeatedCount = modifiedArray.size()-i;
            if(modifiedArray.size()-i == repeatedCount){
                largestSum = modifiedArray.get(i);
            }
        }
        return largestSum;
    }

    
    public static int maxSubArraySumRepeated_Problem_1_ce6ff9aa_5b65_4d1e_9f87_96365d6033b3(ArrayList<Integer> a, int n, int k) {
        int max_so_far = 0;
        int max_ending_here = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a.get(i);
            max_ending_here = max_ending_here + a.get(i);
            if (max_ending_here < 0)
                max_ending_here = 0;
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        if (sum < 0)
            return max_so_far;
        int max_sum = max_so_far;
        int min_sum = 0;
        for (int i = 0; i < n; i++) {
            max_ending_here = max_ending_here + a.get(i);
            if (max_ending_here > max_sum)
                max_sum = max_ending_here;
            if (max_ending_here < min_sum)
                min_sum = max_ending_here;
        }
        int max_wrap = 0;
        max_ending_here = 0;
        for (int i = 0; i < n; i++) {
            max_ending_here = max_ending_here + a.get(i);
            if (max_ending_here > max_wrap)
                max_wrap = max_ending_here;
        }
        if (k == 1)
            return max_sum;
        return Math.max(max_sum, max_wrap + (k - 2) * sum + min_sum);
    }

    
    public static int maxSubArraySumRepeated_Problem_1_e552105d_6cee_4710_8b5b_217852db9bd4(ArrayList<Integer> a, int n, int k) {
        // Your code goes here
        return 0;
    }

    
    public static int maxSubArraySumRepeated_Problem_0_52cea992_c04b_455a_a3a1_a9861215e2c6(ArrayList<Integer> a, int n, int k) {
        int max_sum = 0;
        int curr_sum = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a.get(i);
        }
        for (int i = 0; i < n; i++) {
            curr_sum += a.get(i);
            if (curr_sum > max_sum) {
                max_sum = curr_sum;
            }
            if (curr_sum < 0) {
                curr_sum = 0;
            }
        }
        if (k == 1) {
            return max_sum;
        }
        int max_wrap = curr_sum;
        for (int i = 0; i < n; i++) {
            curr_sum += a.get(i);
            if (curr_sum > max_wrap) {
                max_wrap = curr_sum;
            }
            if (curr_sum < 0) {
                curr_sum = 0;
            }
        }
        if (k == 2) {
            return max_wrap;
        }
        int ans = Math.max(max_wrap, max_sum + (k - 2) * sum);
        return ans;
    }

    
    public static int maxSubArraySumRepeated_Problem_0_74ad5b0d_ab0f_4b9a_a7a9_d546d0ecbab3(ArrayList<Integer> a, int n, int k) {
        int max_sum = 0;
        int curr_sum = 0;
        for (int i = 0; i < n; i++) {
            curr_sum += a.get(i);
            if (curr_sum < 0) {
                curr_sum = 0;
            }
            max_sum = Math.max(max_sum, curr_sum);
        }
        if (k == 1) {
            return max_sum;
        }
        int max_wrap = 0;
        for (int i = 0; i < n; i++) {
            max_wrap += a.get(i);
            a.set(i, a.get(i) * -1);
        }
        int curr_wrap = 0;
        for (int i = 0; i < n; i++) {
            curr_wrap += a.get(i);
            if (curr_wrap < 0) {
                curr_wrap = 0;
            }
            max_wrap = Math.max(max_wrap, curr_wrap);
        }
        max_wrap = Math.max(max_wrap, 0);
        return Math.max(max_sum, max_wrap * (k - 2) + max_sum);
    }

    
    public static int maxSubArraySumRepeated_Problem_1_76e2772e_fe20_4a7c_9436_61e0e0b8b460(ArrayList<Integer> a, int n, int k) {
        int maxSum = 0;
        int sum = 0;
        for(int i = 0; i < a.size(); i++) {
            sum += a.get(i);
            if(sum > maxSum) {
                maxSum = sum;
            }
            if(i >= k) {
                sum = 0;
            }
        }
        return maxSum;
    }

    
    public static int maxSubArraySumRepeated_Problem_1_16bc86ed_8a1c_4b95_92ce_7293f31772b7(ArrayList<Integer> a, int n, int k) {
        int max_sum = Integer.MIN_VALUE;
        int curr_sum = 0;
        for (int i = 0; i < n * k; i++) {
            curr_sum = curr_sum + a.get( (i % n));
            if (curr_sum > max_sum) {
                max_sum = curr_sum;
            }
            if (curr_sum < 0) {
                curr_sum = 0;
            }
        }
        return max_sum;
    }

    
    public static int maxSubArraySumRepeated_Problem_2_a2cc35bc_5c1a_4004_ae3f_31e1c6e32de6(ArrayList<Integer> a, int n, int k) {
        int maxSum = 0;
        for (int i = 0; i < k; i++) {
            int[] temp = new int[a.size()];
            System.arraycopy(a.toArray(), 0, temp, 0, a.size());
            int sum = 0;
            int endSum = 0;
            for (int j = 0; j < temp.length; j++) {
                sum += temp[j];
                endSum += temp[j];
            }
            if (endSum > maxSum) {
                maxSum = endSum;
            }
        }
        return maxSum;
    }

    
    public static int maxSubArraySumRepeated_Problem_1_f1ee8bf8_d39f_4b85_b06f_99520eb9ef49(ArrayList<Integer> a, int n, int k) {
        int sum = 0;
        int max = 0;
        ArrayList <Integer> arrayList = new ArrayList<Integer>();
        for (int i=0; i<n; i++) {
            arrayList.add(a.get(i));
        }
        ArrayList <Integer> temp = new ArrayList<Integer>();
        for (int i=0; i<k; i++) {
            for(int j=0; j<arrayList.size(); j++) {
                temp.add(arrayList.get(j));
            }
            arrayList.clear();
            arrayList.addAll(temp);
        }
        for (int i=0; i<arrayList.size(); i++) {
            sum+=arrayList.get(i);
            if(sum>max)
                max = sum;
        }
        return max;
    }

    
    public static int maxSubArraySumRepeated_Problem_0_75db17a4_8bac_46db_8ffc_f6e14053af3c(ArrayList<Integer> a, int n, int k) {
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
        for (int i = 0; i < n * k; i++) {
            max_ending_here = max_ending_here + a.get( (i % n));
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        return max_so_far;
    }

    
    public static int maxSubArraySumRepeated_Problem_0_0a320363_acd7_46a0_8ab2_5d63504fb66c(ArrayList<Integer> a, int n, int k) {
        // Write your code here
        int max_so_far = 0;
        int max_ending_here = 0;
        int max_sum = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a.get(i);
            max_ending_here += a.get(i);
            if (max_ending_here < 0)
                max_ending_here = 0;
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        max_sum = max_so_far;
        if (sum > 0)
            max_sum += (k - 2) * sum;
        for (int i = 0; i < n; i++) {
            sum += a.get(i);
            max_ending_here += a.get(i);
            if (max_ending_here < 0)
                max_ending_here = 0;
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        if (max_so_far > max_sum)
            max_sum = max_so_far;
        return max_sum;
    }

    
    public static int maxSubArraySumRepeated_Problem_2_5ad767f6_05ed_4bb4_b87f_59ad11b8e883(ArrayList<Integer> a, int n, int k) {
        int max_sum = 0;
        int curr_sum = 0;
        for (int i = 0; i < n; i++) {
            curr_sum = Math.max(a.get(i), curr_sum + a.get(i));
            max_sum = Math.max(max_sum, curr_sum);
        }
        int max_wrap = 0;
        for (int i = 0; i < n; i++) {
            max_wrap += a.get(i);
            a.set(i, a.get(i) * -1);
        }
        curr_sum = 0;
        for (int i = 0; i < n; i++) {
            curr_sum = Math.max(a.get(i), curr_sum + a.get(i));
            max_sum = Math.max(max_sum, curr_sum);
        }
        max_wrap = max_wrap * k + max_sum;
        return Math.max(max_wrap, max_sum);
    }

    
    public static int maxSubArraySumRepeated_Problem_2_f15a44d9_f37b_4e2a_bbc9_60c7b6b4b52e(ArrayList<Integer> a, int n, int k) {
        int sum = 0, max = 0, min = 0;
        for (Integer s : a) {
            sum += s;
            if (sum > max) {
                max = sum;
                min = 0;
            } else if (sum < max) {
                min = sum;
            }
        }
        return sum == 0 ? -1 : Math.max(sum, max - min);
    }

    
    public static int maxSubArraySumRepeated_Problem_0_67649de2_4782_4a76_a0f1_d8d49a9a63d9(ArrayList<Integer> a, int n, int k) {
        int max_sum = 0;
        int curr_sum = 0;
        int max_element = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            max_element = Math.max(max_element, a.get(i));
            curr_sum += a.get(i);
            if (curr_sum < 0) {
                curr_sum = 0;
            }
            max_sum = Math.max(max_sum, curr_sum);
        }
        if (max_element < 0) {
            return max_element;
        }
        int max_wrap = 0;
        int curr_wrap = 0;
        for (int i = 0; i < n; i++) {
            curr_wrap += a.get(i);
            if (curr_wrap < 0) {
                curr_wrap = 0;
            }
            max_wrap = Math.max(max_wrap, curr_wrap);
        }
        if (k == 1) {
            return max_sum;
        }
        int ans = max_wrap + (k - 2) * curr_wrap + max_sum;
        return ans;
    }

    
    public static int maxSubArraySumRepeated_Problem_1_f4c64568_b199_4472_8da0_9d6db2cca5ed(ArrayList<Integer> a, int n, int k) {
        int maxSum = 0;
        int maxSumSoFar = 0;
        int maxElement = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            maxSumSoFar += a.get(i);
            if (maxSumSoFar < 0) {
                maxSumSoFar = 0;
            }
            if (maxSum < maxSumSoFar) {
                maxSum = maxSumSoFar;
            }
            if (maxElement < a.get(i)) {
                maxElement = a.get(i);
            }
        }
        if (maxSum == 0) {
            return maxElement;
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a.get(i);
        }
        int maxSumRepeated = sum * (k - 2) + maxSum;
        int maxSumCircular = maxSumRepeated > maxSum ? maxSumRepeated : maxSum;
        return maxSumCircular;
    }

    
    public static int maxSubArraySumRepeated_Problem_0_d9b27fc0_a303_433c_aea0_a34bddf47d63(ArrayList<Integer> a, int n, int k) {
        // Write your code here
        return 0;
    }

    
    public static int maxSubArraySumRepeated_Problem_0_d2c41707_77e4_4a97_896c_70622aa66852(ArrayList<Integer> a, int n, int k) {
        int sum = 0;
        int sumOfSubArray = 0;
        
        // Sort the array arrayList in ascending order in O(nlogn)
        Collections.sort(a);
        // Create an empty list which will store all the numbers which will repeat k times
        ArrayList<Integer> list = new ArrayList<>();
        // Store the count for k
        int count = 0;
        
        // For all the k times repeating the array
        for(int i = 0; i < k; i++){
            list.clear();
            
            // For all the i times repeating the array
            for(int j = 0; j < i; j++){
                list.add(a.get(j));
            }
            
            // The current sum will be equal to 
            // sumOfSubArray
            sumOfSubArray = 0;
            
            // For all the k times repeating the array
            for(int j = 0; j < list.size(); j++){
                sumOfSubArray += list.get(j);
            }
            
            sum += sumOfSubArray;
            count++;
        }
        
        return sum;
    }

    
    public static int maxSubArraySumRepeated_Problem_1_4b602c4d_0f26_46dd_bb48_ade867c09ed1(ArrayList<Integer> a, int n, int k) {
        int max_sum = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a.get(i);
            max_sum = Math.max(max_sum, sum);
        }
        int max_wrap = 0;
        for (int i = 0; i < n; i++) {
            max_wrap += a.get(i);
            a.set(i, a.get(i) * -1);
        }
        sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a.get(i);
            max_sum = Math.max(max_sum, sum);
        }
        max_sum = Math.max(max_sum, max_wrap * (k - 2) + sum);
        return max_sum;
    }

    
    public static int maxSubArraySumRepeated_Problem_0_408113fb_cc03_4dbb_9c1f_a1c5ee839e43(ArrayList<Integer> a, int n, int k) {
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
        for (int i = 0; i < n * k; i++) {
            max_ending_here = max_ending_here + a.get( (i % n));
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        return max_so_far;
    }

    
    public static int maxSubArraySumRepeated_Problem_1_cca452f9_a8d2_4ebd_8a4a_b95ea9461d9c(ArrayList<Integer> a, int n, int k) {
        int sum = 0;
        ArrayList<Integer> newArray = new ArrayList<>();
        
        for (int i = 0; i < k; i++) {
            sum = 0;
            for (int j = 0; j < n; j++) {
                sum+=a.get(j);
                newArray.add(sum);
            }
            
        }
        
        sum = Collections.max(newArray);
        
        return sum;
    }

    
    public static int maxSubArraySumRepeated_Problem_1_bfdca14f_e662_46d0_b734_1599186a77b7(ArrayList<Integer> a, int n, int k) {
        int max_sum = 0;
        int max_ending_here = 0;
        for (int i = 0; i < n; i++) {
            max_ending_here = max_ending_here + a.get(i);
            if (max_ending_here < 0)
                max_ending_here = 0;
            if (max_sum < max_ending_here)
                max_sum = max_ending_here;
        }
        if (k == 1)
            return max_sum;
        int max_sum_circular = max_sum;
        int curr_max = 0;
        for (int i = 0; i < n; i++) {
            curr_max = curr_max + a.get(i);
            max_sum_circular = max_sum_circular + a.get(i);
        }
        if (max_sum_circular > max_sum)
            max_sum = max_sum_circular;
        for (int i = 0; i < n; i++) {
            curr_max = curr_max - a.get(i);
            if (curr_max > max_sum)
                max_sum = curr_max;
        }
        return max_sum;
    }

    
    public static int maxSubArraySumRepeated_Problem_1_5c1066ce_f271_47d4_8f4d_1a142c4d36ca(ArrayList<Integer> a, int n, int k) {
        int max_sum = Integer.MIN_VALUE;
        int curr_sum = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a.get(i);
        }
        for (int i = 0; i < n; i++) {
            curr_sum += a.get(i);
            if (i != 0) {
                curr_sum = Math.max(curr_sum, curr_sum + sum * (k - 1));
            }
            max_sum = Math.max(max_sum, curr_sum);
        }
        return max_sum;
    }

    
    public static int maxSubArraySumRepeated_Problem_1_a00105b8_d424_4e2f_91b6_991b323f5825(ArrayList<Integer> a, int n, int k) {
        int max_so_far = 0;
        int max_ending_here = 0;
        int max_sum = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a.get(i);
        }
        max_sum = sum * k;
        for (int i = 0; i < n; i++) {
            max_ending_here = max_ending_here + a.get(i);
            if (max_ending_here < 0) {
                max_ending_here = 0;
            }
            if (max_so_far < max_ending_here) {
                max_so_far = max_ending_here;
            }
        }
        return Math.max(max_sum, max_so_far);
    }

    
    public static int maxSubArraySumRepeated_Problem_2_cd0b8145_d915_48f7_8984_0e90c7071209(ArrayList<Integer> a, int n, int k) {
        int maxSum = 0;
        int sum = 0;
        ArrayList <Integer> newArr = new ArrayList <Integer> (a.size());
        for( int i = 1 ; i < k ; i++ ) {
            sum = sum + a.get (i) - a.get (0);
            newArr.add (sum);
            sum = 0;
        }
        for( int i = 0 ; i < a.size()-k ; i++ ) {
            sum = a.get(i) + newArr.get(i);
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }

    
    public static int maxSubArraySumRepeated_Problem_0_44e062b3_8384_44ef_8261_82607103679d(ArrayList<Integer> a, int n, int k) {
        int sum = 0;
        for(int i=0;i<n;i++)
            for(int j=0;j<k;j++)
                sum+=a.get(i)*a.get(j);
        return sum;
    }

    
    public static int maxSubArraySumRepeated_Problem_2_5e9d3dae_dd5c_4822_8244_6daf74e038be(ArrayList<Integer> a, int n, int k) {
        int max = 0;
        for (int i = 0; i < a.size(); i++) {
            int sum = 0;
            for (int j = i; j < a.size(); j += k) {
                sum += a.get(j);
            }
            max = Math.max(max, sum);
        }
        return max;
    }

    
    public static int maxSubArraySumRepeated_Problem_0_23319d21_b199_4845_8247_41ff3354add7(ArrayList<Integer> a, int n, int k) {
        int max_sum = 0;
        int curr_sum = 0;
        for (int i = 0; i < n; i++) {
            curr_sum += a.get(i);
        }
        max_sum = curr_sum;
        for (int i = 0; i < n; i++) {
            curr_sum += (k - 1) * a.get(i);
            max_sum = Math.max(max_sum, curr_sum);
        }
        return max_sum;
    }

    
    public static int maxSubArraySumRepeated_Problem_0_196b503c_e430_4d41_a994_5e3448a10316(ArrayList<Integer> a, int n, int k) {
        int max_sum = 0;
        int max_ending_here = 0;
        int max_so_far = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a.get(i);
        }
        for (int i = 0; i < n; i++) {
            max_ending_here = max_ending_here + a.get(i);
            if (max_ending_here < 0) {
                max_ending_here = 0;
            }
            if (max_so_far < max_ending_here) {
                max_so_far = max_ending_here;
            }
        }
        if (k == 1) {
            return max_so_far;
        }
        if (sum > 0) {
            max_sum = max_so_far + (k - 2) * sum;
        } else {
            max_sum = max_so_far;
        }
        for (int i = 0; i < n; i++) {
            max_ending_here = max_ending_here + a.get(i);
            if (max_ending_here < 0) {
                max_ending_here = 0;
            }
            if (max_sum < max_ending_here) {
                max_sum = max_ending_here;
            }
        }
        return max_sum;
    }

    
    public static int maxSubArraySumRepeated_Problem_0_670c1420_063b_40a4_9732_d708cd7f51dc(ArrayList<Integer> a, int n, int k) {
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
        for (int i = 0; i < n * k; i++) {
            max_ending_here = max_ending_here + a.get( (i % n));
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        return max_so_far;
    }

    
    public static int maxSubArraySumRepeated_Problem_2_21864a41_940e_426d_a085_e53bb1fd27f9(ArrayList<Integer> a, int n, int k) {
        int max_so_far = Integer.MIN_VALUE;
        int max_ending_here = 0;
        for (int i = 0; i < n * k; i++) {
            max_ending_here = max_ending_here + a.get( (i % n));
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        return max_so_far;
    }

    
    public static int maxSubArraySumRepeated_Problem_1_fa66c64c_53d8_4f11_a237_06de5e76a984(ArrayList<Integer> a, int n, int k) {
        int max_sum = 0;
        int curr_sum = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a.get(i);
        }
        for (int i = 0; i < n; i++) {
            curr_sum += a.get(i);
            if (curr_sum < 0) {
                curr_sum = 0;
            }
            max_sum = Math.max(max_sum, curr_sum);
        }
        if (k == 1) {
            return max_sum;
        }
        int max_wrap = 0;
        for (int i = 0; i < n; i++) {
            max_wrap += a.get(i);
            a.set(i, -a.get(i));
        }
        max_wrap = max_wrap + maxSubArraySumRepeated_Problem_1_fa66c64c_53d8_4f11_a237_06de5e76a984(a, n, 1);
        return Math.max(max_sum, max_wrap);
    }

    
    public static int maxSubArraySumRepeated_Problem_0_84c39e44_3b00_4ca0_9bcc_32318bd29628(ArrayList<Integer> a, int n, int k) {
        int max_sum = 0;
        int max_so_far = 0;
        int max_ending_here = 0;
        int max_element = Collections.max(a);
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a.get(i);
        }
        if (sum > 0) {
            max_sum = sum * k;
        } else {
            max_sum = max_element;
        }
        for (int i = 0; i < n; i++) {
            max_ending_here += a.get(i);
            if (max_ending_here < 0) {
                max_ending_here = 0;
            }
            if (max_so_far < max_ending_here) {
                max_so_far = max_ending_here;
            }
        }
        if ((max_so_far + (sum - max_so_far) * (k - 2)) > max_sum) {
            max_sum = max_so_far + (sum - max_so_far) * (k - 2);
        }
        return max_sum;
    }

    
    public static int maxSubArraySumRepeated_Problem_0_ef4d34d8_80b3_4f42_a5c4_4fc602d7f8c6(ArrayList<Integer> a, int n, int k) {
        
        // Your code goes here
        
        return -1;
    }

    
    public static int maxSubArraySumRepeated_Problem_2_cdb2e03a_8fe6_495a_9ab2_7dbd90566d6f(ArrayList<Integer> a, int n, int k) {
        int sum = 0, maxSum = 0, start = 0, end = 0, sumStart = 0;
        // Find the first element of the first array list that is >= k
        int firstElement = a.get(0);
        for(int i = 1; i < a.size(); i++) {
            if(a.get(i) >= k) {
                firstElement = a.get(i);
                break;
            }
        }
        // Find the first element of the remaining array list that is >= k
        int remainingElement = a.get(0);
        for(int i = 1; i < a.size(); i++) {
            if(a.get(i) >= k) {
                remainingElement = a.get(i);
                break;
            }
        }
        // Find the first element of the last array list that is >= k
        int lastElement = a.get(0);
        for(int i = 1; i < a.size(); i++) {
            if(a.get(i) >= k) {
                lastElement = a.get(i);
                break;
            }
        }
        // Find the largest sum of the remaining array list which is >= k
        while(remainingElement < n) {
            sum += remainingElement;
            maxSum = maxSum > sum ? maxSum : sum;
            remainingElement++;
        }
        // Find the largest sum of the first array list which is >= k
        while(firstElement < n) {
            sum += firstElement;
            sumStart = sumStart > sum ? sumStart : sum;
            firstElement++;
        }
        // Find the largest sum of the last array list which is >= k
        while(lastElement < n) {
            sum += lastElement;
            end = end > sum ? end : sum;
            lastElement++;
        }
        // Find the largest sum of the remaining array list which is >= k
        while(sum < k) {
            sum += remainingElement;
            maxSum = maxSum > sum ? maxSum : sum;
            remainingElement++;
        }
        // Find the largest sum of the first array list which is >= k
        while(sumStart < k) {
            sum += firstElement;
            sumStart = sumStart > sum ? sumStart : sum;
            firstElement++;
        }
        // Find the largest sum of the last array list which is >= k
        while(end < k) {
            sum += lastElement;
            end = end > sum ? end : sum;
            lastElement++;
        }
        // Find the largest sum of the remaining array list which is >= k
        while(sum < k) {
            sum += remainingElement;
            maxSum = maxSum > sum ? maxSum : sum;
            remainingElement++;
        }
        // Return the sum of the remaining array list
        return sum;
    }

    
    public static int maxSubArraySumRepeated_Problem_2_84449ab4_e4b5_41bf_8701_c3320bf14e6d(ArrayList<Integer> a, int n, int k) {
        int max_sum = Integer.MIN_VALUE;
        int curr_sum = 0;
        for (int i = 0; i < n * k; i++) {
            curr_sum += a.get( (i % n));
            if (curr_sum > max_sum) {
                max_sum = curr_sum;
            }
            if (curr_sum < 0) {
                curr_sum = 0;
            }
        }
        return max_sum;
    }

    
    public static int maxSubArraySumRepeated_Problem_1_4cb9a616_0433_4c26_a743_cab9cb80d5d5(ArrayList<Integer> a, int n, int k) {
        int max_so_far = 0, max_ending_here = 0;
        for (int i = 0; i < n; i++) {
            max_ending_here = max_ending_here + a.get(i);
            if (max_ending_here < 0)
                max_ending_here = 0;
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        if (k == 1)
            return max_so_far;
        int max_wrap = 0;
        for (int i = 0; i < n; i++) {
            max_wrap += a.get(i);
            a.set(i, a.get(i) * -1);
        }
        max_wrap = max_wrap + maxSubArraySumRepeated_Problem_1_4cb9a616_0433_4c26_a743_cab9cb80d5d5(a, n, 1);
        return Math.max(max_so_far, max_wrap);
    }

    
    public static int maxSubArraySumRepeated_Problem_1_a2cc35bc_5c1a_4004_ae3f_31e1c6e32de6(ArrayList<Integer> a, int n, int k) {
        int maxSum = 0;
        for (int i = 0; i < k; i++) {
            int[] temp = new int[a.size()];
            System.arraycopy(a.toArray(), 0, temp, 0, a.size());
            int sum = 0;
            int endSum = 0;
            for (int j = 0; j < temp.length; j++) {
                sum += temp[j];
                endSum += temp[j];
            }
            if (endSum > maxSum) {
                maxSum = endSum;
            }
        }
        return maxSum;
    }

}
