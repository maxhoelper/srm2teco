package mbpp_245_max_sum;

public class mbpp_245_max_sum {

    
    public static int maxSum_Problem_2_1812cfe8_d050_405b_a8ab_3e683a7a267d(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(i > 0 && arr.get(i) < arr.get(i-1)) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_5d5b3168_1ef5_41bb_ba49_3e11bd3eeb3d(ArrayList<Integer> arr) {
        int maxSum_Problem_0_5d5b3168_1ef5_41bb_ba49_3e11bd3eeb3d = 0;
        int sum = 0;
        int maxSum_Problem_0_5d5b3168_1ef5_41bb_ba49_3e11bd3eeb3dOfSubSequence = 0;
        for(int i = 1; i < arr.size(); i++) {
            sum = arr.get(i);
            for(int j = i; j < arr.size(); j++) {
                sum = sum + arr.get(j);
                if(sum > maxSum_Problem_0_5d5b3168_1ef5_41bb_ba49_3e11bd3eeb3d) {
                    maxSum_Problem_0_5d5b3168_1ef5_41bb_ba49_3e11bd3eeb3d = sum;
                    maxSum_Problem_0_5d5b3168_1ef5_41bb_ba49_3e11bd3eeb3dOfSubSequence = maxSum_Problem_0_5d5b3168_1ef5_41bb_ba49_3e11bd3eeb3d;
                }
            }
        }
        return maxSum_Problem_0_5d5b3168_1ef5_41bb_ba49_3e11bd3eeb3dOfSubSequence;
    }

    
    public static int maxSum_Problem_0_58b6ea71_e18b_47e7_8dae_3a98f5eaa1e8(ArrayList<Integer> arr) {
        int max = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                int sum = arr.get(i) + arr.get(j);
                if(sum > max) {
                    max = sum;
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_1_4f170142_c458_45cb_9dc3_6e2aecb7ee67(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if (sum > max) {
                max = sum;
            }
            if (i < arr.size() - 1) {
                sum -= arr.get(i);
                if (sum < 0) {
                    sum = 0;
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_654a2045_b7c5_41c2_befd_3d3020804e1a(ArrayList<Integer> arr) {
        int[] inc = new int[arr.size()];
        int[] dec = new int[arr.size()];
        inc[0] = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            inc[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(i) > arr.get(j)) {
                    inc[i] = Math.max(inc[i], inc[j] + arr.get(i));
                }
            }
        }
        dec[arr.size() - 1] = arr.get(arr.size() - 1);
        for (int i = arr.size() - 2; i >= 0; i--) {
            dec[i] = arr.get(i);
            for (int j = arr.size() - 1; j > i; j--) {
                if (arr.get(i) > arr.get(j)) {
                    dec[i] = Math.max(dec[i], dec[j] + arr.get(i));
                }
            }
        }
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            max = Math.max(max, inc[i] + dec[i] - arr.get(i));
        }
        return max;
    }

    
    public static int maxSum_Problem_0_65da6de7_0e07_4336_94c0_178622351dbb(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int sum = arr.get(i) + arr.get(j);
                if (sum > max) {
                    max = sum;
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_2_d0bb1d60_2b3f_4bef_95ba_d0bf22e31405(ArrayList<Integer> arr) {
        int[] maxSum_Problem_2_d0bb1d60_2b3f_4bef_95ba_d0bf22e31405 = new int[arr.size()];
        int[] maxSum_Problem_2_d0bb1d60_2b3f_4bef_95ba_d0bf22e31405Reverse = new int[arr.size()];
        maxSum_Problem_2_d0bb1d60_2b3f_4bef_95ba_d0bf22e31405[0] = arr.get(0);
        maxSum_Problem_2_d0bb1d60_2b3f_4bef_95ba_d0bf22e31405Reverse[arr.size() - 1] = arr.get(arr.size() - 1);
        for (int i = 1; i < arr.size(); i++) {
            maxSum_Problem_2_d0bb1d60_2b3f_4bef_95ba_d0bf22e31405[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(i) > arr.get(j)) {
                    maxSum_Problem_2_d0bb1d60_2b3f_4bef_95ba_d0bf22e31405[i] = Math.max(maxSum_Problem_2_d0bb1d60_2b3f_4bef_95ba_d0bf22e31405[i], maxSum_Problem_2_d0bb1d60_2b3f_4bef_95ba_d0bf22e31405[j] + arr.get(i));
                }
            }
        }
        for (int i = arr.size() - 2; i >= 0; i--) {
            maxSum_Problem_2_d0bb1d60_2b3f_4bef_95ba_d0bf22e31405Reverse[i] = arr.get(i);
            for (int j = arr.size() - 1; j > i; j--) {
                if (arr.get(i) > arr.get(j)) {
                    maxSum_Problem_2_d0bb1d60_2b3f_4bef_95ba_d0bf22e31405Reverse[i] = Math.max(maxSum_Problem_2_d0bb1d60_2b3f_4bef_95ba_d0bf22e31405Reverse[i], maxSum_Problem_2_d0bb1d60_2b3f_4bef_95ba_d0bf22e31405Reverse[j] + arr.get(i));
                }
            }
        }
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            max = Math.max(max, maxSum_Problem_2_d0bb1d60_2b3f_4bef_95ba_d0bf22e31405[i] + maxSum_Problem_2_d0bb1d60_2b3f_4bef_95ba_d0bf22e31405Reverse[i] - arr.get(i));
        }
        return max;
    }

    
    public static int maxSum_Problem_2_a7b79163_e887_4e4f_a04b_8688618575a2(ArrayList<Integer> arr) {
        int max = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                int sum = arr.get(i) + arr.get(j);
                if(sum > max) {
                    max = sum;
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_1_5fe35593_7728_4906_b0d5_0a5cc9a2e2fb(ArrayList<Integer> arr) {
        int[] maxSum_Problem_1_5fe35593_7728_4906_b0d5_0a5cc9a2e2fb = new int[arr.size()];
        int[] maxSum_Problem_1_5fe35593_7728_4906_b0d5_0a5cc9a2e2fbRev = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            maxSum_Problem_1_5fe35593_7728_4906_b0d5_0a5cc9a2e2fb[i] = arr.get(i);
            maxSum_Problem_1_5fe35593_7728_4906_b0d5_0a5cc9a2e2fbRev[i] = arr.get(i);
        }
        for (int i = 1; i < arr.size(); i++) {
            for (int j = 0; j < i; j++) {
                if (arr.get(i) > arr.get(j)) {
                    maxSum_Problem_1_5fe35593_7728_4906_b0d5_0a5cc9a2e2fb[i] = Math.max(maxSum_Problem_1_5fe35593_7728_4906_b0d5_0a5cc9a2e2fb[i], maxSum_Problem_1_5fe35593_7728_4906_b0d5_0a5cc9a2e2fb[j] + arr.get(i));
                }
            }
        }
        for (int i = arr.size() - 2; i >= 0; i--) {
            for (int j = arr.size() - 1; j > i; j--) {
                if (arr.get(i) > arr.get(j)) {
                    maxSum_Problem_1_5fe35593_7728_4906_b0d5_0a5cc9a2e2fbRev[i] = Math.max(maxSum_Problem_1_5fe35593_7728_4906_b0d5_0a5cc9a2e2fbRev[i], maxSum_Problem_1_5fe35593_7728_4906_b0d5_0a5cc9a2e2fbRev[j] + arr.get(i));
                }
            }
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.size(); i++) {
            max = Math.max(max, maxSum_Problem_1_5fe35593_7728_4906_b0d5_0a5cc9a2e2fb[i] + maxSum_Problem_1_5fe35593_7728_4906_b0d5_0a5cc9a2e2fbRev[i] - arr.get(i));
        }
        return max;
    }

    
    public static int maxSum_Problem_0_48166a44_2795_4beb_a8bf_878ad9de0660(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(i > 0 && arr.get(i) < arr.get(i-1)) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_1_eb499456_6c18_48e6_8600_efba0f7ea4ca(ArrayList<Integer> arr) {
        int[] dp = new int[arr.size()];
        int[] dp2 = new int[arr.size()];
        dp[0] = arr.get(0);
        dp2[arr.size() - 1] = arr.get(arr.size() - 1);
        for (int i = 1; i < arr.size(); i++) {
            dp[i] = Math.max(arr.get(i), dp[i - 1] + arr.get(i));
        }
        for (int i = arr.size() - 2; i >= 0; i--) {
            dp2[i] = Math.max(arr.get(i), dp2[i + 1] + arr.get(i));
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.size(); i++) {
            max = Math.max(max, dp[i] + dp2[i] - arr.get(i));
        }
        return max;
    }

    
    public static int maxSum_Problem_2_93ea4c5e_d066_430b_b843_8f82017540bd(ArrayList<Integer> arr) {
        int maxSum_Problem_2_93ea4c5e_d066_430b_b843_8f82017540bd = 0;
        int sum = 0;
        int maxSum_Problem_2_93ea4c5e_d066_430b_b843_8f82017540bdOfSubsequence = 0;
        int sumOfSubsequence = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum = sum + arr.get(i);
            if(sum > maxSum_Problem_2_93ea4c5e_d066_430b_b843_8f82017540bd) {
                maxSum_Problem_2_93ea4c5e_d066_430b_b843_8f82017540bd = sum;
            }
        }
        for(int i = 0; i < arr.size(); i++) {
            sumOfSubsequence = sumOfSubsequence + arr.get(i);
            if(sumOfSubsequence > maxSum_Problem_2_93ea4c5e_d066_430b_b843_8f82017540bdOfSubsequence) {
                maxSum_Problem_2_93ea4c5e_d066_430b_b843_8f82017540bdOfSubsequence = sumOfSubsequence;
            }
        }
        return maxSum_Problem_2_93ea4c5e_d066_430b_b843_8f82017540bdOfSubsequence;
    }

    
    public static int maxSum_Problem_0_e8002407_4069_4d64_817e_968e19a0e360(ArrayList<Integer> arr) {
        int max = 0;
        int len = arr.size();
        if(len == 1) return arr.get(0);
        if(len == 2) return arr.get(0) + arr.get(1);
        if(arr.get(0) > arr.get(1)) return arr.get(0) + arr.get(1);
        if(arr.get(0) < arr.get(1)) return arr.get(0) + arr.get(1);
        for(int i = 1; i < len; i++) {
            int sum = arr.get(i) + arr.get(i-1);
            if(sum > max) max = sum;
        }
        return max;
    }

    
    public static int maxSum_Problem_1_f6adc699_1282_4b82_b6d2_a3422bcad081(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) > max) {
                    max = arr.get(i) + arr.get(j);
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_db195c15_9c8a_4702_b31d_f3817e2e07d0(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if (i == 0) {
                max = sum;
            } else if (sum > max) {
                max = sum;
            } else {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_1_c58db391_1458_4665_ad43_b33b1b6ca3d2(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(sum < 0) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_1_5d5b3168_1ef5_41bb_ba49_3e11bd3eeb3d(ArrayList<Integer> arr) {
        int maxSum_Problem_1_5d5b3168_1ef5_41bb_ba49_3e11bd3eeb3d = 0;
        int sum = 0;
        int maxSum_Problem_1_5d5b3168_1ef5_41bb_ba49_3e11bd3eeb3dOfSubSequence = 0;
        for(int i = 1; i < arr.size(); i++) {
            sum = arr.get(i);
            for(int j = i; j < arr.size(); j++) {
                sum = sum + arr.get(j);
                if(sum > maxSum_Problem_1_5d5b3168_1ef5_41bb_ba49_3e11bd3eeb3d) {
                    maxSum_Problem_1_5d5b3168_1ef5_41bb_ba49_3e11bd3eeb3d = sum;
                    maxSum_Problem_1_5d5b3168_1ef5_41bb_ba49_3e11bd3eeb3dOfSubSequence = maxSum_Problem_1_5d5b3168_1ef5_41bb_ba49_3e11bd3eeb3d;
                }
            }
        }
        return maxSum_Problem_1_5d5b3168_1ef5_41bb_ba49_3e11bd3eeb3dOfSubSequence;
    }

    
    public static int maxSum_Problem_2_1d84d0dd_72fb_4a3b_bc23_448b851b192c(ArrayList<Integer> arr) {
        // Write your code here
        int n = arr.size();
        int[] inc = new int[ n];
        int[] dec = new int[ n];
        inc[0] = arr.get(0);
        dec[ n - 1] = arr.get( n - 1);
        for (int i = 1; i < n; i++) {
            inc[ i] = Math.max(inc[ (i - 1)], arr.get( i));
        }
        for (int i = n - 2; i >= 0; i--) {
            dec[ i] = Math.max(dec[ (i + 1)], arr.get( i));
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            max = Math.max(max, inc[ i] + dec[ i] - arr.get( i));
        }
        return max;
    }

    
    public static int maxSum_Problem_0_bbbaa31f_ff7b_47a4_8236_c8396dc27a4d(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) > max) {
                    max = arr.get(i) + arr.get(j);
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_f4ddfa6f_0d1e_4571_bcc2_87bdeab19bc5(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if (sum > max) {
                max = sum;
            }
            if (i < arr.size() - 1) {
                sum -= arr.get(i);
                if (sum < 0) {
                    sum = 0;
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_1_68b3e077_c5b3_435b_b114_2d872b8180d6(ArrayList<Integer> arr) {
        int n = arr.size();
        int[] inc = new int[n];
        int[] dec = new int[n];
        inc[0] = arr.get(0);
        dec[n - 1] = arr.get(n - 1);
        for (int i = 1; i < n; i++) {
            inc[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(i) > arr.get(j)) {
                    inc[i] = Math.max(inc[i], inc[j] + arr.get(i));
                }
            }
        }
        for (int i = n - 2; i >= 0; i--) {
            dec[i] = arr.get(i);
            for (int j = n - 1; j > i; j--) {
                if (arr.get(i) > arr.get(j)) {
                    dec[i] = Math.max(dec[i], dec[j] + arr.get(i));
                }
            }
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans = Math.max(ans, inc[i] + dec[i] - arr.get(i));
        }
        return ans;
    }

    
    public static int maxSum_Problem_0_6cada2bc_1e15_49e3_9d0f_b7eabf76b8c6(ArrayList<Integer> arr) {
        int max = arr.get(0);
        for(int i = 1; i < arr.size(); i++) {
            max = Math.max(max, arr.get(i));
        }
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum < 0) {
                sum = 0;
            }
            if(sum > max) {
                max = sum;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_81631487_9203_405f_b0d9_33b963f392bd(ArrayList<Integer> arr) {
        int[] maxSum_Problem_0_81631487_9203_405f_b0d9_33b963f392bd = new int[arr.size()];
        int[] maxSum_Problem_0_81631487_9203_405f_b0d9_33b963f392bdRev = new int[arr.size()];
        maxSum_Problem_0_81631487_9203_405f_b0d9_33b963f392bd[0] = arr.get(0);
        maxSum_Problem_0_81631487_9203_405f_b0d9_33b963f392bdRev[arr.size() - 1] = arr.get(arr.size() - 1);
        for (int i = 1; i < arr.size(); i++) {
            maxSum_Problem_0_81631487_9203_405f_b0d9_33b963f392bd[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(i) > arr.get(j)) {
                    maxSum_Problem_0_81631487_9203_405f_b0d9_33b963f392bd[i] = Math.max(maxSum_Problem_0_81631487_9203_405f_b0d9_33b963f392bd[i], maxSum_Problem_0_81631487_9203_405f_b0d9_33b963f392bd[j] + arr.get(i));
                }
            }
        }
        for (int i = arr.size() - 2; i >= 0; i--) {
            maxSum_Problem_0_81631487_9203_405f_b0d9_33b963f392bdRev[i] = arr.get(i);
            for (int j = arr.size() - 1; j > i; j--) {
                if (arr.get(i) > arr.get(j)) {
                    maxSum_Problem_0_81631487_9203_405f_b0d9_33b963f392bdRev[i] = Math.max(maxSum_Problem_0_81631487_9203_405f_b0d9_33b963f392bdRev[i], maxSum_Problem_0_81631487_9203_405f_b0d9_33b963f392bdRev[j] + arr.get(i));
                }
            }
        }
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            max = Math.max(max, maxSum_Problem_0_81631487_9203_405f_b0d9_33b963f392bd[i] + maxSum_Problem_0_81631487_9203_405f_b0d9_33b963f392bdRev[i] - arr.get(i));
        }
        return max;
    }

    
    public static int maxSum_Problem_1_d0bc4396_78b1_4a93_8e49_532676fe2350(ArrayList<Integer> arr) {
        // Write your code here
        int[] dp = new int[arr.size()];
        int[] dp2 = new int[arr.size()];
        for(int i = 0; i < arr.size(); i++) {
            dp[i] = arr.get(i);
            dp2[i] = arr.get(i);
        }
        for(int i = 1; i < arr.size(); i++) {
            for(int j = 0; j < i; j++) {
                if(arr.get(i) > arr.get(j)) {
                    dp[i] = Math.max(dp[i], dp[j] + arr.get(i));
                }
            }
        }
        for(int i = arr.size() - 2; i >= 0; i--) {
            for(int j = arr.size() - 1; j > i; j--) {
                if(arr.get(i) > arr.get(j)) {
                    dp2[i] = Math.max(dp2[i], dp2[j] + arr.get(i));
                }
            }
        }
        int max = 0;
        for(int i = 0; i < arr.size(); i++) {
            max = Math.max(max, dp[i] + dp2[i] - arr.get(i));
        }
        return max;
    }

    
    public static int maxSum_Problem_2_b11fcae9_450e_4894_8326_6dfac378c9b5(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(sum < 0) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_2_7fc37ae3_8f7b_4501_8aa2_569b846e9830(ArrayList<Integer> arr) {
        // Write your code here
        int[] inc = new int[arr.size()];
        int[] dec = new int[arr.size()];
        inc[0] = arr.get(0);
        dec[arr.size()-1] = arr.get(arr.size()-1);
        for(int i=1;i<arr.size();i++) {
            inc[i] = arr.get(i);
            for(int j=0;j<i;j++) {
                if(arr.get(j)<arr.get(i)) {
                    inc[i] = Math.max(inc[i],inc[j]+arr.get(i));
                }
            }
        }
        for(int i=arr.size()-2;i>=0;i--) {
            dec[i] = arr.get(i);
            for(int j=arr.size()-1;j>i;j--) {
                if(arr.get(j)<arr.get(i)) {
                    dec[i] = Math.max(dec[i],dec[j]+arr.get(i));
                }
            }
        }
        int max = 0;
        for(int i=0;i<arr.size();i++) {
            max = Math.max(max,inc[i]+dec[i]-arr.get(i));
        }
        return max;
    }

    
    public static int maxSum_Problem_2_2e559049_9cea_4180_8aed_fab0aa84bb87(ArrayList<Integer> arr) {
        int max = 0;
        int n = arr.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                int sum = arr.get(i) + arr.get(j);
                if (sum > max) {
                    max = sum;
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_bf746a22_ea62_4e14_b358_83c4e4a27e6d(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(i > 0 && arr.get(i) < arr.get(i - 1)) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_2_d3d9dbbf_04ef_4456_add7_b519ef37d8ec(ArrayList<Integer> arr) {
        int max = 0;
        int len = arr.size();
        int i = 0;
        int j = len - 1;
        while (i < j) {
            if (arr.get(i) < arr.get(j)) {
                max = Math.max(max, arr.get(i) + arr.get(j));
                i++;
                j--;
            } else {
                max = Math.max(max, arr.get(i) + arr.get(j));
                j--;
                i++;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_639e7372_4bd5_4d62_b8a3_08a17068fc8f(ArrayList<Integer> arr) {
        int max = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                int sum = arr.get(i) + arr.get(j);
                if(sum > max) {
                    max = sum;
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_2_1c80c326_c968_4325_8628_dd82b993aaa7(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(i < arr.size() - 1) {
                sum -= arr.get(i);
                if(sum < 0) {
                    sum = 0;
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_1_92c48d6a_2f9d_4e49_8a73_890adc786c8d(ArrayList<Integer> arr) {
        int max = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                int sum = arr.get(i) + arr.get(j);
                if(sum > max) {
                    max = sum;
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_6a0a843a_b983_4ab8_b50f_2dc89a932cd5(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if (sum > max) {
                max = sum;
            }
            if (i < arr.size() - 1) {
                sum -= arr.get(i);
                if (sum < 0) {
                    sum = 0;
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_1_e7a0c9d4_801f_46b4_8016_fa469995427c(ArrayList<Integer> arr) {
        int max = arr.get(0);
        for(int i = 1; i < arr.size(); i++) {
            max = Math.max(max, arr.get(i) + arr.get(i-1));
        }
        return max;
    }

    
    public static int maxSum_Problem_1_0823c2c4_b797_4dc2_86d3_4fca156df13b(ArrayList<Integer> arr) {
        int n = arr.size();
        int[] inc = new int[n];
        int[] dec = new int[n];
        inc[0] = arr.get(0);
        for (int i = 1; i < n; i++) {
            inc[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(i) > arr.get(j)) {
                    inc[i] = Math.max(inc[i], inc[j] + arr.get(i));
                }
            }
        }
        dec[n - 1] = arr.get(n - 1);
        for (int i = n - 2; i >= 0; i--) {
            dec[i] = arr.get(i);
            for (int j = n - 1; j > i; j--) {
                if (arr.get(i) > arr.get(j)) {
                    dec[i] = Math.max(dec[i], dec[j] + arr.get(i));
                }
            }
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans = Math.max(ans, inc[i] + dec[i] - arr.get(i));
        }
        return ans;
    }

    
    public static int maxSum_Problem_2_0a4a14d2_ad6c_4a2c_aca6_b89da8171a90(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(sum < 0) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_c9842102_5242_413d_9829_b3a753ac64fb(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(i > 0 && arr.get(i) < arr.get(i - 1)) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_1_e99d09c9_fa60_4740_ba04_7ff530724d49(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int sum = arr.get(i) + arr.get(j);
                if (sum > max) {
                    max = sum;
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_1_a650a410_5c62_4d07_a197_5cb32d703ff2(ArrayList<Integer> arr) {
        int max = arr.get(0);
        for(int i = 1; i < arr.size(); i++) {
            max = Math.max(max, arr.get(i));
            for(int j = i - 1; j >= 0; j--) {
                max = Math.max(max, arr.get(j) + arr.get(i));
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_2_e2db645b_5ca4_42af_b9ce_1e6c666659c6(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            sum = arr.get(i) + arr.get(i + 1);
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_1_19e1ac9d_b5df_4887_945a_530b6e48106b(ArrayList<Integer> arr) {
        int[] inc = new int[arr.size()];
        int[] dec = new int[arr.size()];
        inc[0] = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            inc[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(j) < arr.get(i)) {
                    inc[i] = Math.max(inc[i], inc[j] + arr.get(i));
                }
            }
        }
        dec[arr.size() - 1] = arr.get(arr.size() - 1);
        for (int i = arr.size() - 2; i >= 0; i--) {
            dec[i] = arr.get(i);
            for (int j = arr.size() - 1; j > i; j--) {
                if (arr.get(j) < arr.get(i)) {
                    dec[i] = Math.max(dec[i], dec[j] + arr.get(i));
                }
            }
        }
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            max = Math.max(max, inc[i] + dec[i] - arr.get(i));
        }
        return max;
    }

    
    public static int maxSum_Problem_1_33854ae3_b291_4378_97c4_883764f21c4c(ArrayList<Integer> arr) {
        int[] dp = new int[arr.size()];
        int[] dp2 = new int[arr.size()];
        dp[0] = arr.get(0);
        dp2[arr.size()-1] = arr.get(arr.size()-1);
        for(int i = 1; i < arr.size(); i++) {
            dp[i] = arr.get(i);
            for(int j = 0; j < i; j++) {
                if(arr.get(j) < arr.get(i)) {
                    dp[i] = Math.max(dp[i], dp[j] + arr.get(i));
                }
            }
        }
        for(int i = arr.size()-2; i >= 0; i--) {
            dp2[i] = arr.get(i);
            for(int j = arr.size()-1; j > i; j--) {
                if(arr.get(j) < arr.get(i)) {
                    dp2[i] = Math.max(dp2[i], dp2[j] + arr.get(i));
                }
            }
        }
        int max = 0;
        for(int i = 0; i < arr.size(); i++) {
            max = Math.max(max, dp[i] + dp2[i] - arr.get(i));
        }
        return max;
    }

    
    public static int maxSum_Problem_0_4f170142_c458_45cb_9dc3_6e2aecb7ee67(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if (sum > max) {
                max = sum;
            }
            if (i < arr.size() - 1) {
                sum -= arr.get(i);
                if (sum < 0) {
                    sum = 0;
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_cec85cdb_7bf6_4c96_9add_302d2090cb18(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(i < arr.size() - 1) {
                sum -= arr.get(i);
                if(sum < 0) {
                    sum = 0;
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_1_bbbaa31f_ff7b_47a4_8236_c8396dc27a4d(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) > max) {
                    max = arr.get(i) + arr.get(j);
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_c25b78b4_c7ae_40e2_a356_822d6d6c994e(ArrayList<Integer> arr) {
        int max = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                int sum = arr.get(i) + arr.get(j);
                if(sum > max) {
                    max = sum;
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_1_cede8b2b_3df0_420b_91b6_1936f6336b67(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
        }
        for(int i = 0; i < arr.size() - 1; i++) {
            sum += arr.get(i);
            if(sum < max) {
                max = sum;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_2_46606935_ec6f_412b_8f56_634292babafc(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if (sum > max) {
                max = sum;
            }
            if (i < arr.size() - 1) {
                if (sum < 0) {
                    sum = 0;
                }
                if (arr.get(i) < arr.get(i + 1)) {
                    sum = 0;
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_2_bc495105_a151_46dd_93a7_3d01455fbb23(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(i > 0 && arr.get(i) < arr.get(i-1)) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_1_46606935_ec6f_412b_8f56_634292babafc(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if (sum > max) {
                max = sum;
            }
            if (i < arr.size() - 1) {
                if (sum < 0) {
                    sum = 0;
                }
                if (arr.get(i) < arr.get(i + 1)) {
                    sum = 0;
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_781cb344_c383_4f49_a600_e5ddf3feb730(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(i > 0 && sum < 0) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_08c24dda_2620_4b85_bf33_0084f6c42024(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(i > 0 && arr.get(i) < arr.get(i-1)) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_fdd3b4b3_f230_40fa_a80d_463a77681495(ArrayList<Integer> arr) {
        int maxSum_Problem_0_fdd3b4b3_f230_40fa_a80d_463a77681495 = 0;
        int sum = 0;
        int max = 0;
        int sumOfSubSeq = 0;
        int maxOfSubSeq = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum = arr.get(i);
            sumOfSubSeq = sum;
            max = sum;
            for(int j = i; j < arr.size(); j++) {
                sumOfSubSeq += arr.get(j);
                if(sumOfSubSeq > max) {
                    max = sumOfSubSeq;
                }
            }
            if(max > maxSum_Problem_0_fdd3b4b3_f230_40fa_a80d_463a77681495) {
                maxSum_Problem_0_fdd3b4b3_f230_40fa_a80d_463a77681495 = max;
                maxOfSubSeq = sumOfSubSeq;
            }
        }
        return maxSum_Problem_0_fdd3b4b3_f230_40fa_a80d_463a77681495;
    }

    
    public static int maxSum_Problem_1_7cb9b4b1_04b4_47b5_8cfc_2f2cbca2b53a(ArrayList<Integer> arr) {
        int[] max = new int[arr.size()];
        int[] min = new int[arr.size()];
        max[0] = arr.get(0);
        min[arr.size()-1] = arr.get(arr.size()-1);
        for (int i = 1; i < arr.size(); i++) {
            max[i] = Math.max(max[i-1], arr.get(i));
        }
        for (int i = arr.size()-2; i >= 0; i--) {
            min[i] = Math.min(min[i+1], arr.get(i));
        }
        int res = 0;
        for (int i = 0; i < arr.size(); i++) {
            res = Math.max(res, max[i] + min[i] - arr.get(i));
        }
        return res;
    }

    
    public static int maxSum_Problem_1_99fc55ee_94b6_47e5_854f_2e33abf23fa7(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(i > 0 && sum < 0) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_1_f4ddfa6f_0d1e_4571_bcc2_87bdeab19bc5(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if (sum > max) {
                max = sum;
            }
            if (i < arr.size() - 1) {
                sum -= arr.get(i);
                if (sum < 0) {
                    sum = 0;
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_2_81bfb812_a6b2_47a2_a704_4b5b0e0fde9e(ArrayList<Integer> arr) {
        // Write your code here
        int max = 0;
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            max = Math.max(max, sum);
            if (sum < 0) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_1_126ac29d_4bad_4ef4_9bf6_1b5cbd76df9c(ArrayList<Integer> arr) {
        int n = arr.size();
        int[] inc = new int[n];
        int[] dec = new int[n];
        inc[0] = arr.get(0);
        for (int i = 1; i < n; i++) {
            inc[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(i) > arr.get(j)) {
                    inc[i] = Math.max(inc[i], inc[j] + arr.get(i));
                }
            }
        }
        dec[n - 1] = arr.get(n - 1);
        for (int i = n - 2; i >= 0; i--) {
            dec[i] = arr.get(i);
            for (int j = n - 1; j > i; j--) {
                if (arr.get(i) > arr.get(j)) {
                    dec[i] = Math.max(dec[i], dec[j] + arr.get(i));
                }
            }
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            max = Math.max(max, inc[i] + dec[i] - arr.get(i));
        }
        return max;
    }

    
    public static int maxSum_Problem_2_71ee2623_ee38_4dbb_8dc5_fb21eaf798ec(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            sum += arr.get(i);
            if (sum > max) {
                max = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
        for (int i = 0; i < arr.size() - 1; i++) {
            sum += arr.get(i);
            if (sum > max) {
                max = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_1_e2db645b_5ca4_42af_b9ce_1e6c666659c6(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            sum = arr.get(i) + arr.get(i + 1);
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_1a71d834_5b1d_41aa_aa49_99ccc91327c0(ArrayList<Integer> arr) {
        // Write your code here
        int n = arr.size();
        int[] inc = new int[n];
        int[] dec = new int[n];
        inc[0] = arr.get(0);
        for(int i = 1; i < n; i++) {
            inc[i] = arr.get(i);
            for(int j = 0; j < i; j++) {
                if(arr.get(i) > arr.get(j)) {
                    inc[i] = Math.max(inc[i], inc[j] + arr.get(i));
                }
            }
        }
        dec[n - 1] = arr.get(n - 1);
        for(int i = n - 2; i >= 0; i--) {
            dec[i] = arr.get(i);
            for(int j = n - 1; j > i; j--) {
                if(arr.get(i) > arr.get(j)) {
                    dec[i] = Math.max(dec[i], dec[j] + arr.get(i));
                }
            }
        }
        int ans = 0;
        for(int i = 0; i < n; i++) {
            ans = Math.max(ans, inc[i] + dec[i] - arr.get(i));
        }
        return ans;
    }

    
    public static int maxSum_Problem_0_77f90d4a_d94a_480e_a748_ab9a2efaba4b(ArrayList<Integer> arr) {
        int maxSum_Problem_0_77f90d4a_d94a_480e_a748_ab9a2efaba4b = 0;
        int sum = 0;
        int maxSum_Problem_0_77f90d4a_d94a_480e_a748_ab9a2efaba4bOfSubsequence = 0;
        int sumOfSubsequence = 0;
        for(int i = 1; i < arr.size(); i++) {
            sum = arr.get(i);
            sumOfSubsequence += sum;
            if(sumOfSubsequence > maxSum_Problem_0_77f90d4a_d94a_480e_a748_ab9a2efaba4bOfSubsequence) {
                maxSum_Problem_0_77f90d4a_d94a_480e_a748_ab9a2efaba4bOfSubsequence = sumOfSubsequence;
            }
            sumOfSubsequence = 0;
        }
        maxSum_Problem_0_77f90d4a_d94a_480e_a748_ab9a2efaba4b = arr.get(0);
        sumOfSubsequence += maxSum_Problem_0_77f90d4a_d94a_480e_a748_ab9a2efaba4b;
        if(sumOfSubsequence > maxSum_Problem_0_77f90d4a_d94a_480e_a748_ab9a2efaba4bOfSubsequence) {
            maxSum_Problem_0_77f90d4a_d94a_480e_a748_ab9a2efaba4bOfSubsequence = sumOfSubsequence;
        }
        return maxSum_Problem_0_77f90d4a_d94a_480e_a748_ab9a2efaba4bOfSubsequence;
    }

    
    public static int maxSum_Problem_0_a1263dd4_f8f0_49d2_9a7a_f8980f98fb81(ArrayList<Integer> arr) {
        // Write your code here
        int[] max = new int[arr.size()];
        int[] min = new int[arr.size()];
        max[0] = arr.get(0);
        min[arr.size() - 1] = arr.get(arr.size() - 1);
        for (int i = 1; i < arr.size(); i++) {
            max[i] = Math.max(max[i - 1], arr.get(i));
        }
        for (int i = arr.size() - 2; i >= 0; i--) {
            min[i] = Math.min(min[i + 1], arr.get(i));
        }
        int ans = Integer.MIN_VALUE;
        for (int i = 0; i < arr.size(); i++) {
            ans = Math.max(ans, max[i] + min[i] - arr.get(i));
        }
        return ans;
    }

    
    public static int maxSum_Problem_2_3981110e_8890_4d57_8aed_b0218b668e8b(ArrayList<Integer> arr) {
        int max = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            max = Math.max(max, arr.get(i) + arr.get(i - 1));
        }
        return max;
    }

    
    public static int maxSum_Problem_2_c4bf226d_b7b8_45b5_979b_242e00ed96e7(ArrayList<Integer> arr) {
        // Write your code here
        int[] inc = new int[arr.size()];
        int[] dec = new int[arr.size()];
        inc[0] = arr.get(0);
        dec[arr.size() - 1] = arr.get(arr.size() - 1);
        for (int i = 1; i < arr.size(); i++) {
            inc[i] = Math.max(inc[i - 1], arr.get(i));
        }
        for (int i = arr.size() - 2; i >= 0; i--) {
            dec[i] = Math.max(dec[i + 1], arr.get(i));
        }
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            max = Math.max(max, inc[i] + dec[i] - arr.get(i));
        }
        return max;
    }

    
    public static int maxSum_Problem_2_dc3525a1_ba14_4b36_97a6_ac42cc97d446(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(sum < 0) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_1_337557f5_1c9a_4769_b613_c7856a3236a2(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if (i == 0) {
                max = sum;
            } else {
                if (sum > max) {
                    max = sum;
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_1_b059dc4a_aabe_4942_9e89_c3eb25a1b1af(ArrayList<Integer> arr) {
        int[] inc = new int[arr.size()];
        int[] dec = new int[arr.size()];
        inc[0] = arr.get(0);
        dec[arr.size() - 1] = arr.get(arr.size() - 1);
        for (int i = 1; i < arr.size(); i++) {
            inc[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(i) > arr.get(j)) {
                    inc[i] = Math.max(inc[i], inc[j] + arr.get(i));
                }
            }
        }
        for (int i = arr.size() - 2; i >= 0; i--) {
            dec[i] = arr.get(i);
            for (int j = arr.size() - 1; j > i; j--) {
                if (arr.get(i) > arr.get(j)) {
                    dec[i] = Math.max(dec[i], dec[j] + arr.get(i));
                }
            }
        }
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            max = Math.max(max, inc[i] + dec[i] - arr.get(i));
        }
        return max;
    }

    
    public static int maxSum_Problem_2_5789f66e_114d_4417_b406_894e9cdd0474(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(sum < 0) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_5f99b585_2604_42c0_a607_a9aebbd2f013(ArrayList<Integer> arr) {
        int[] maxSum_Problem_0_5f99b585_2604_42c0_a607_a9aebbd2f013 = new int[arr.size()];
        int[] maxSum_Problem_0_5f99b585_2604_42c0_a607_a9aebbd2f013Rev = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            maxSum_Problem_0_5f99b585_2604_42c0_a607_a9aebbd2f013[i] = arr.get(i);
            maxSum_Problem_0_5f99b585_2604_42c0_a607_a9aebbd2f013Rev[i] = arr.get(i);
        }
        for (int i = 1; i < arr.size(); i++) {
            for (int j = 0; j < i; j++) {
                if (arr.get(i) > arr.get(j) && maxSum_Problem_0_5f99b585_2604_42c0_a607_a9aebbd2f013[i] < maxSum_Problem_0_5f99b585_2604_42c0_a607_a9aebbd2f013[j] + arr.get(i)) {
                    maxSum_Problem_0_5f99b585_2604_42c0_a607_a9aebbd2f013[i] = maxSum_Problem_0_5f99b585_2604_42c0_a607_a9aebbd2f013[j] + arr.get(i);
                }
            }
        }
        for (int i = arr.size() - 2; i >= 0; i--) {
            for (int j = arr.size() - 1; j > i; j--) {
                if (arr.get(i) > arr.get(j) && maxSum_Problem_0_5f99b585_2604_42c0_a607_a9aebbd2f013Rev[i] < maxSum_Problem_0_5f99b585_2604_42c0_a607_a9aebbd2f013Rev[j] + arr.get(i)) {
                    maxSum_Problem_0_5f99b585_2604_42c0_a607_a9aebbd2f013Rev[i] = maxSum_Problem_0_5f99b585_2604_42c0_a607_a9aebbd2f013Rev[j] + arr.get(i);
                }
            }
        }
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            max = Math.max(max, maxSum_Problem_0_5f99b585_2604_42c0_a607_a9aebbd2f013[i] + maxSum_Problem_0_5f99b585_2604_42c0_a607_a9aebbd2f013Rev[i] - arr.get(i));
        }
        return max;
    }

    
    public static int maxSum_Problem_0_43b4c20c_e22f_4dbb_81c2_7e7f697b6e55(ArrayList<Integer> arr) {
        int[] inc = new int[arr.size()];
        int[] dec = new int[arr.size()];
        inc[0] = arr.get(0);
        dec[arr.size() - 1] = arr.get(arr.size() - 1);
        for (int i = 1; i < arr.size(); i++) {
            inc[i] = Math.max(inc[i - 1], arr.get(i));
        }
        for (int i = arr.size() - 2; i >= 0; i--) {
            dec[i] = Math.max(dec[i + 1], arr.get(i));
        }
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            max = Math.max(max, inc[i] + dec[i] - arr.get(i));
        }
        return max;
    }

    
    public static int maxSum_Problem_1_8b309073_c578_49cd_8cfe_af8c50f0df31(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            sum += arr.get(i);
            if (sum > max) {
                max = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_2_77754d7f_cf77_4aae_a647_fee833987546(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int sum = arr.get(i) + arr.get(j);
                if (sum > max) {
                    max = sum;
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_71fd85b3_746a_422e_80ca_795e39c341cc(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            sum = arr.get(i) + arr.get(i + 1);
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_538d0ebc_23fc_404f_b53d_bbe4b24fcc84(ArrayList<Integer> arr) {
        int max = arr.get(0);
        int sum = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            sum = sum + arr.get(i);
            if (sum > max) {
                max = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_2_783f4fc7_2b59_482e_af16_da5b085cbe8a(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(i < arr.size() - 1) {
                if(arr.get(i) < arr.get(i + 1)) {
                    sum = 0;
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_bbc92669_dbaf_4485_88d8_79e587e24ec9(ArrayList<Integer> arr) {
        int max = arr.get(0);
        for(int i = 1; i < arr.size(); i++) {
            max = Math.max(max, arr.get(i));
            for(int j = i + 1; j < arr.size(); j++) {
                if(arr.get(j) > arr.get(i) && arr.get(j) > arr.get(i + 1)) {
                    max = Math.max(max, arr.get(j) + arr.get(i) + arr.get(i + 1));
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_337557f5_1c9a_4769_b613_c7856a3236a2(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if (i == 0) {
                max = sum;
            } else {
                if (sum > max) {
                    max = sum;
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_1_870137b9_930d_471f_a526_dd76966af61a(ArrayList<Integer> arr) {
        int[] dp = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            dp[i] = arr.get(i);
        }
        for (int i = 1; i < arr.size(); i++) {
            for (int j = 0; j < i; j++) {
                if (arr.get(i) > arr.get(j)) {
                    dp[i] = Math.max(dp[i], dp[j] + arr.get(i));
                }
            }
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.size(); i++) {
            max = Math.max(max, dp[i]);
        }
        return max;
    }

    
    public static int maxSum_Problem_0_b496c5d7_03a5_48d3_accc_f3a7ff11ba45(ArrayList<Integer> arr) {
        int[] dp = new int[arr.size()];
        int[] dp2 = new int[arr.size()];
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            dp[i] = arr.get(i);
            dp2[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(i) > arr.get(j)) {
                    dp[i] = Math.max(dp[i], dp[j] + arr.get(i));
                }
                if (arr.get(i) < arr.get(j)) {
                    dp2[i] = Math.max(dp2[i], dp2[j] + arr.get(i));
                }
            }
            max = Math.max(max, dp[i]);
            max = Math.max(max, dp2[i]);
        }
        return max;
    }

    
    public static int maxSum_Problem_0_57bc82c6_3056_41bc_a31b_3888d1e11a77(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if (sum > max) {
                max = sum;
            }
            if (i < arr.size() - 1) {
                sum -= arr.get(i);
                if (sum < 0) {
                    sum = 0;
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_0e990caf_f513_4dce_a17a_d47a3e0d680d(ArrayList<Integer> arr) {
        int[] dp = new int[arr.size()];
        int[] dp2 = new int[arr.size()];
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            dp[i] = arr.get(i);
            dp2[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(j) < arr.get(i)) {
                    dp[i] = Math.max(dp[i], dp[j] + arr.get(i));
                }
            }
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(j) < arr.get(i)) {
                    dp2[i] = Math.max(dp2[i], dp2[j] + arr.get(i));
                }
            }
            max = Math.max(max, dp[i] + dp2[i] - arr.get(i));
        }
        return max;
    }

    
    public static int maxSum_Problem_1_c9e6356e_d519_4ab6_a8b1_e588c82a738e(ArrayList<Integer> arr) {
        int[] inc = new int[arr.size()];
        int[] dec = new int[arr.size()];
        inc[0] = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            inc[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(i) > arr.get(j)) {
                    inc[i] = Math.max(inc[i], inc[j] + arr.get(i));
                }
            }
        }
        dec[arr.size() - 1] = arr.get(arr.size() - 1);
        for (int i = arr.size() - 2; i >= 0; i--) {
            dec[i] = arr.get(i);
            for (int j = arr.size() - 1; j > i; j--) {
                if (arr.get(i) > arr.get(j)) {
                    dec[i] = Math.max(dec[i], dec[j] + arr.get(i));
                }
            }
        }
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            max = Math.max(max, inc[i] + dec[i] - arr.get(i));
        }
        return max;
    }

    
    public static int maxSum_Problem_1_dc4ef6cb_e76a_45bd_816a_42094bf8ec8b(ArrayList<Integer> arr) {
        int[] dp = new int[arr.size()];
        int[] dp2 = new int[arr.size()];
        dp[0] = arr.get(0);
        dp2[arr.size() - 1] = arr.get(arr.size() - 1);
        for (int i = 1; i < arr.size(); i++) {
            dp[i] = Math.max(dp[i - 1] + arr.get(i), arr.get(i));
        }
        for (int i = arr.size() - 2; i >= 0; i--) {
            dp2[i] = Math.max(dp2[i + 1] + arr.get(i), arr.get(i));
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.size(); i++) {
            max = Math.max(max, dp[i] + dp2[i] - arr.get(i));
        }
        return max;
    }

    
    public static int maxSum_Problem_2_71fd85b3_746a_422e_80ca_795e39c341cc(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            sum = arr.get(i) + arr.get(i + 1);
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_1_0f6227b9_7466_4063_8014_ab987e1f4818(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(i < arr.size() - 1) {
                sum -= arr.get(i);
                if(sum < 0) {
                    sum = 0;
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_1b6813b2_8734_4691_996c_50884792a3d4(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            sum = arr.get(i) + arr.get(i+1);
            if(sum > max) {
                max = sum;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_fb8a33e1_1c15_480e_b700_c03106515378(ArrayList<Integer> arr) {
        int max = arr.get(0);
        int sum = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            sum = sum + arr.get(i);
            if (sum > max) {
                max = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_1_41afaa44_6d8d_4edf_920d_3228ebd53098(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(i > 0 && arr.get(i) < arr.get(i-1)) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_2_f6e9b29c_c46e_4bce_beb1_4bc3a1325b49(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(i < arr.size() - 1) {
                sum -= arr.get(i);
                if(sum < 0) {
                    sum = 0;
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_2_468bfbcc_1910_4a97_aa65_1e456e47701b(ArrayList<Integer> arr) {
        int max = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                int sum = arr.get(i) + arr.get(j);
                if(sum > max) {
                    max = sum;
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_1_d853401f_2de2_4563_a3dc_fbd73943ab6d(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(i < arr.size() - 1) {
                sum -= arr.get(i);
                if(sum < 0) {
                    sum = 0;
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_2_d853401f_2de2_4563_a3dc_fbd73943ab6d(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(i < arr.size() - 1) {
                sum -= arr.get(i);
                if(sum < 0) {
                    sum = 0;
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_2_50256662_c4b8_4e90_93a0_c6e03a1decf4(ArrayList<Integer> arr) {
        ArrayList<Integer> inc = new ArrayList<Integer>();
        ArrayList<Integer> dec = new ArrayList<Integer>();
        for (int i = 0; i < arr.size(); i++) {
            inc.add(arr.get(i));
            dec.add(arr.get(i));
        }
        for (int i = 1; i < arr.size(); i++) {
            for (int j = 0; j < i; j++) {
                if (arr.get(i) > arr.get(j) && inc.get(i) < inc.get(j) + arr.get(i)) {
                    inc.set(i, inc.get(j) + arr.get(i));
                }
            }
        }
        for (int i = arr.size() - 2; i >= 0; i--) {
            for (int j = arr.size() - 1; j > i; j--) {
                if (arr.get(i) > arr.get(j) && dec.get(i) < dec.get(j) + arr.get(i)) {
                    dec.set(i, dec.get(j) + arr.get(i));
                }
            }
        }
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (max < inc.get(i) + dec.get(i) - arr.get(i)) {
                max = inc.get(i) + dec.get(i) - arr.get(i);
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_2_626a740a_46bc_4e5d_a3a9_9fb867fb3f82(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(i > 0 && arr.get(i) < arr.get(i-1)) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_d4c26c74_cb8e_498e_8826_edbf2a8c9ecb(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if (sum > max) {
                max = sum;
            }
            if (i < arr.size() - 1) {
                sum -= arr.get(i);
                if (sum < 0) {
                    sum = 0;
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_a102357d_4377_4d06_b75f_abc4a585c31c(ArrayList<Integer> arr) {
        // write your function here
        int maxsum = 0;
        int prevsum = 0;
        int currentsum = 0;
        int minsum = (Integer.MAX_VALUE / 2);
        for(int i = 0; i < arr.size(); i++)
        {
            prevsum = currentsum;
            currentsum = arr.get(i);
            if(currentsum < minsum)
            {
                minsum = currentsum;
            }
            for(int j = i + 1; j < arr.size(); j++)
            {
                currentsum = arr.get(j);
                if(currentsum > prevsum)
                {
                    maxsum += minsum;
                    break;
                }
                maxsum += currentsum;
                prevsum = currentsum;
            }
        }
        return maxsum;
    }

    
    public static int maxSum_Problem_2_7cb9b4b1_04b4_47b5_8cfc_2f2cbca2b53a(ArrayList<Integer> arr) {
        int[] max = new int[arr.size()];
        int[] min = new int[arr.size()];
        max[0] = arr.get(0);
        min[arr.size()-1] = arr.get(arr.size()-1);
        for (int i = 1; i < arr.size(); i++) {
            max[i] = Math.max(max[i-1], arr.get(i));
        }
        for (int i = arr.size()-2; i >= 0; i--) {
            min[i] = Math.min(min[i+1], arr.get(i));
        }
        int res = 0;
        for (int i = 0; i < arr.size(); i++) {
            res = Math.max(res, max[i] + min[i] - arr.get(i));
        }
        return res;
    }

    
    public static int maxSum_Problem_1_6709b93f_c1b9_409f_b24c_ae41a8fe3cc5(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int sum = arr.get(i) + arr.get(j);
                if (sum > max) {
                    max = sum;
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_1_08c24dda_2620_4b85_bf33_0084f6c42024(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(i > 0 && arr.get(i) < arr.get(i-1)) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_dda89315_b64d_4986_a50d_de5d60779793(ArrayList<Integer> arr) {
        int[] dp = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            dp[i] = arr.get(i);
        }
        for (int i = 1; i < arr.size(); i++) {
            for (int j = 0; j < i; j++) {
                if (arr.get(i) > arr.get(j)) {
                    dp[i] = Math.max(dp[i], dp[j] + arr.get(i));
                }
            }
        }
        int max = 0;
        for (int i : dp) {
            max = Math.max(max, i);
        }
        return max;
    }

    
    public static int maxSum_Problem_1_e10c453f_e294_4f44_8bd7_81c3a7468fb1(ArrayList<Integer> arr) {
        int max = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                int sum = arr.get(i) + arr.get(j);
                if(sum > max) {
                    max = sum;
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_1_735b834f_a333_43d9_9c2e_94e373d993a0(ArrayList<Integer> arr) {
        // Write your code here
        int[] dp = new int[arr.size()];
        int[] dp2 = new int[arr.size()];
        dp[0] = arr.get(0);
        dp2[arr.size() - 1] = arr.get(arr.size() - 1);
        for (int i = 1; i < arr.size(); i++) {
            dp[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(j) < arr.get(i)) {
                    dp[i] = Math.max(dp[i], dp[j] + arr.get(i));
                }
            }
        }
        for (int i = arr.size() - 2; i >= 0; i--) {
            dp2[i] = arr.get(i);
            for (int j = arr.size() - 1; j > i; j--) {
                if (arr.get(j) < arr.get(i)) {
                    dp2[i] = Math.max(dp2[i], dp2[j] + arr.get(i));
                }
            }
        }
        int ans = 0;
        for (int i = 0; i < arr.size(); i++) {
            ans = Math.max(ans, dp[i] + dp2[i] - arr.get(i));
        }
        return ans;
    }

    
    public static int maxSum_Problem_0_54dcf902_4680_4fa8_9938_8b266986a669(ArrayList<Integer> arr) {
        // Write your code here
        int[] inc = new int[arr.size()];
        int[] dec = new int[arr.size()];
        inc[0] = arr.get(0);
        dec[arr.size() - 1] = arr.get(arr.size() - 1);
        for (int i = 1; i < arr.size(); i++) {
            inc[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(i) > arr.get(j)) {
                    inc[i] = Math.max(inc[i], inc[j] + arr.get(i));
                }
            }
        }
        for (int i = arr.size() - 2; i >= 0; i--) {
            dec[i] = arr.get(i);
            for (int j = arr.size() - 1; j > i; j--) {
                if (arr.get(i) > arr.get(j)) {
                    dec[i] = Math.max(dec[i], dec[j] + arr.get(i));
                }
            }
        }
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            max = Math.max(max, inc[i] + dec[i] - arr.get(i));
        }
        return max;
    }

    
    public static int maxSum_Problem_2_ec7ec36b_51f5_441a_9822_296e2e506622(ArrayList<Integer> arr) {
        int maxSum_Problem_2_ec7ec36b_51f5_441a_9822_296e2e506622 = 0;
        int[] maxSum_Problem_2_ec7ec36b_51f5_441a_9822_296e2e506622EndingAt = new int[arr.size()];
        int[] maxSum_Problem_2_ec7ec36b_51f5_441a_9822_296e2e506622StartingAt = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            maxSum_Problem_2_ec7ec36b_51f5_441a_9822_296e2e506622EndingAt[i] = arr.get(i);
            maxSum_Problem_2_ec7ec36b_51f5_441a_9822_296e2e506622StartingAt[i] = arr.get(i);
        }
        for (int i = 1; i < arr.size(); i++) {
            for (int j = 0; j < i; j++) {
                if (arr.get(i) > arr.get(j)) {
                    maxSum_Problem_2_ec7ec36b_51f5_441a_9822_296e2e506622EndingAt[i] = Math.max(maxSum_Problem_2_ec7ec36b_51f5_441a_9822_296e2e506622EndingAt[i], maxSum_Problem_2_ec7ec36b_51f5_441a_9822_296e2e506622EndingAt[j] + arr.get(i));
                }
            }
        }
        for (int i = arr.size() - 2; i >= 0; i--) {
            for (int j = arr.size() - 1; j > i; j--) {
                if (arr.get(i) > arr.get(j)) {
                    maxSum_Problem_2_ec7ec36b_51f5_441a_9822_296e2e506622StartingAt[i] = Math.max(maxSum_Problem_2_ec7ec36b_51f5_441a_9822_296e2e506622StartingAt[i], maxSum_Problem_2_ec7ec36b_51f5_441a_9822_296e2e506622StartingAt[j] + arr.get(i));
                }
            }
        }
        for (int i = 0; i < arr.size(); i++) {
            maxSum_Problem_2_ec7ec36b_51f5_441a_9822_296e2e506622 = Math.max(maxSum_Problem_2_ec7ec36b_51f5_441a_9822_296e2e506622, maxSum_Problem_2_ec7ec36b_51f5_441a_9822_296e2e506622EndingAt[i] + maxSum_Problem_2_ec7ec36b_51f5_441a_9822_296e2e506622StartingAt[i] - arr.get(i));
        }
        return maxSum_Problem_2_ec7ec36b_51f5_441a_9822_296e2e506622;
    }

    
    public static int maxSum_Problem_0_783f4fc7_2b59_482e_af16_da5b085cbe8a(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(i < arr.size() - 1) {
                if(arr.get(i) < arr.get(i + 1)) {
                    sum = 0;
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_2_11407895_2434_4f7d_a98f_93f5fba8d9b7(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if (sum > max) {
                max = sum;
            }
            if (i < arr.size() - 1) {
                sum -= arr.get(i);
                if (sum < 0) {
                    sum = 0;
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_2_bbbaa31f_ff7b_47a4_8236_c8396dc27a4d(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) > max) {
                    max = arr.get(i) + arr.get(j);
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_1_0de2235d_f909_49b7_bb4e_faddbc7f9d93(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if (sum > max) {
                max = sum;
            }
            if (i < arr.size() - 1) {
                sum -= arr.get(i);
                if (sum < 0) {
                    sum = 0;
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_b5c8147f_026d_4213_af0b_5e130cd24fd1(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if (sum > max) {
                max = sum;
            }
            if (i < arr.size() - 1) {
                sum -= arr.get(i);
                if (sum < 0) {
                    sum = 0;
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_e10c453f_e294_4f44_8bd7_81c3a7468fb1(ArrayList<Integer> arr) {
        int max = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                int sum = arr.get(i) + arr.get(j);
                if(sum > max) {
                    max = sum;
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_2_cb36c30d_6f6b_48ef_8444_2b473a347d2a(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int sum = arr.get(i) + arr.get(j);
                if (sum > max) {
                    max = sum;
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_2_86e4025d_721e_4ff1_9757_3a8bbf643209(ArrayList<Integer> arr) {
        int max = 0;
        int n = arr.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                int sum = arr.get(i) + arr.get(j);
                if (sum > max) {
                    max = sum;
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_2_84718c35_0f76_4cc5_9644_1a76bcae9d39(ArrayList<Integer> arr) {
        int max = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                int sum = arr.get(i) + arr.get(j);
                if(sum > max) {
                    max = sum;
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_6709b93f_c1b9_409f_b24c_ae41a8fe3cc5(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int sum = arr.get(i) + arr.get(j);
                if (sum > max) {
                    max = sum;
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_d5ff24f3_4001_4b8a_8007_1d6caf39efbd(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(sum < 0) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_2_3198a509_8416_4d6d_896f_a5789790cb96(ArrayList<Integer> arr) {
        int[] max = new int[arr.size()];
        int[] min = new int[arr.size()];
        int[] maxSum_Problem_2_3198a509_8416_4d6d_896f_a5789790cb96 = new int[arr.size()];
        int[] minSum = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            max[i] = arr.get(i);
            min[i] = arr.get(i);
        }
        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < i; j++) {
                if (arr.get(i) > arr.get(j)) {
                    max[i] = Math.max(max[i], max[j] + arr.get(i));
                }
                if (arr.get(i) < arr.get(j)) {
                    min[i] = Math.max(min[i], min[j] + arr.get(i));
                }
            }
        }
        for (int i = arr.size() - 1; i >= 0; i--) {
            for (int j = arr.size() - 1; j > i; j--) {
                if (arr.get(i) > arr.get(j)) {
                    maxSum_Problem_2_3198a509_8416_4d6d_896f_a5789790cb96[i] = Math.max(maxSum_Problem_2_3198a509_8416_4d6d_896f_a5789790cb96[i], maxSum_Problem_2_3198a509_8416_4d6d_896f_a5789790cb96[j] + arr.get(i));
                }
                if (arr.get(i) < arr.get(j)) {
                    minSum[i] = Math.max(minSum[i], minSum[j] + arr.get(i));
                }
            }
        }
        int ans = 0;
        for (int i = 0; i < arr.size(); i++) {
            ans = Math.max(ans, max[i] + minSum[i]);
            ans = Math.max(ans, min[i] + maxSum_Problem_2_3198a509_8416_4d6d_896f_a5789790cb96[i]);
        }
        return ans;
    }

    
    public static int maxSum_Problem_2_9d8a7806_ab64_4313_840d_9dcb67f14bfc(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if (sum > max) {
                max = sum;
            }
            if (i > 0 && arr.get(i) < arr.get(i - 1)) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_1_2e559049_9cea_4180_8aed_fab0aa84bb87(ArrayList<Integer> arr) {
        int max = 0;
        int n = arr.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                int sum = arr.get(i) + arr.get(j);
                if (sum > max) {
                    max = sum;
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_1_8e271b28_8eb7_4f96_8ad9_7a476292eba6(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
        }
        for(int i = 0; i < arr.size() - 1; i++) {
            sum += arr.get(i);
            if(sum < max) {
                max = sum;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_1_bca9215b_740f_49c3_b017_a54b86615fa2(ArrayList<Integer> arr) {
        int max = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                int sum = arr.get(i) + arr.get(j);
                if(sum > max) {
                    max = sum;
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_2e559049_9cea_4180_8aed_fab0aa84bb87(ArrayList<Integer> arr) {
        int max = 0;
        int n = arr.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                int sum = arr.get(i) + arr.get(j);
                if (sum > max) {
                    max = sum;
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_1_8ceebed5_4984_4f38_8bb7_30e9342c4db0(ArrayList<Integer> arr) {
        int[] dp = new int[arr.size()];
        dp[0] = arr.get(0);
        for(int i = 1; i < arr.size(); i++) {
            dp[i] = arr.get(i);
            for(int j = 0; j < i; j++) {
                if(arr.get(j) < arr.get(i)) {
                    dp[i] = Math.max(dp[i], dp[j] + arr.get(i));
                }
            }
        }
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.size(); i++) {
            max = Math.max(max, dp[i]);
        }
        return max;
    }

    
    public static int maxSum_Problem_0_4bcd43ba_c502_4f94_863d_5865fd9b472f(ArrayList<Integer> arr) {
        int[] maxSum_Problem_0_4bcd43ba_c502_4f94_863d_5865fd9b472f = new int[arr.size()];
        int[] maxSum_Problem_0_4bcd43ba_c502_4f94_863d_5865fd9b472fReverse = new int[arr.size()];
        maxSum_Problem_0_4bcd43ba_c502_4f94_863d_5865fd9b472f[0] = arr.get(0);
        maxSum_Problem_0_4bcd43ba_c502_4f94_863d_5865fd9b472fReverse[arr.size() - 1] = arr.get(arr.size() - 1);
        for (int i = 1; i < arr.size(); i++) {
            maxSum_Problem_0_4bcd43ba_c502_4f94_863d_5865fd9b472f[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(j) < arr.get(i)) {
                    maxSum_Problem_0_4bcd43ba_c502_4f94_863d_5865fd9b472f[i] = Math.max(maxSum_Problem_0_4bcd43ba_c502_4f94_863d_5865fd9b472f[i], maxSum_Problem_0_4bcd43ba_c502_4f94_863d_5865fd9b472f[j] + arr.get(i));
                }
            }
        }
        for (int i = arr.size() - 2; i >= 0; i--) {
            maxSum_Problem_0_4bcd43ba_c502_4f94_863d_5865fd9b472fReverse[i] = arr.get(i);
            for (int j = arr.size() - 1; j > i; j--) {
                if (arr.get(j) < arr.get(i)) {
                    maxSum_Problem_0_4bcd43ba_c502_4f94_863d_5865fd9b472fReverse[i] = Math.max(maxSum_Problem_0_4bcd43ba_c502_4f94_863d_5865fd9b472fReverse[i], maxSum_Problem_0_4bcd43ba_c502_4f94_863d_5865fd9b472fReverse[j] + arr.get(i));
                }
            }
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.size(); i++) {
            max = Math.max(max, maxSum_Problem_0_4bcd43ba_c502_4f94_863d_5865fd9b472f[i] + maxSum_Problem_0_4bcd43ba_c502_4f94_863d_5865fd9b472fReverse[i] - arr.get(i));
        }
        return max;
    }

    
    public static int maxSum_Problem_0_d5445717_df65_4ac9_ad0d_a5fc00137739(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) > max) {
                    max = arr.get(i) + arr.get(j);
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_2_3e6ab88c_9886_4e9b_9586_140cee5d9591(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(i > 0 && arr.get(i) < arr.get(i - 1)) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_5b660c12_c171_4294_be3e_0f6ef6d4fdfc(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(i < arr.size() - 1) {
                sum -= arr.get(i);
                if(sum < 0) {
                    sum = 0;
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_2_cb8e9e89_39bc_45f0_8f68_084b84889784(ArrayList<Integer> arr) {
        int max = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                if(arr.get(i) + arr.get(j) > max) {
                    max = arr.get(i) + arr.get(j);
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_6d11760c_d5ef_4e44_9171_19ffc145805f(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(i > 0 && sum < 0) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_2_6333f9cc_a038_416e_91a6_74dd27455de7(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            sum = arr.get(i) + arr.get(i + 1);
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_2_cbc8e701_69fe_4ab1_b55f_b4a34ec532b8(ArrayList<Integer> arr) {
        int[] maxSum_Problem_2_cbc8e701_69fe_4ab1_b55f_b4a34ec532b8 = new int[arr.size()];
        int[] maxSum_Problem_2_cbc8e701_69fe_4ab1_b55f_b4a34ec532b8Reverse = new int[arr.size()];
        maxSum_Problem_2_cbc8e701_69fe_4ab1_b55f_b4a34ec532b8[0] = arr.get(0);
        maxSum_Problem_2_cbc8e701_69fe_4ab1_b55f_b4a34ec532b8Reverse[arr.size() - 1] = arr.get(arr.size() - 1);
        for (int i = 1; i < arr.size(); i++) {
            maxSum_Problem_2_cbc8e701_69fe_4ab1_b55f_b4a34ec532b8[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(i) > arr.get(j) && maxSum_Problem_2_cbc8e701_69fe_4ab1_b55f_b4a34ec532b8[i] < maxSum_Problem_2_cbc8e701_69fe_4ab1_b55f_b4a34ec532b8[j] + arr.get(i)) {
                    maxSum_Problem_2_cbc8e701_69fe_4ab1_b55f_b4a34ec532b8[i] = maxSum_Problem_2_cbc8e701_69fe_4ab1_b55f_b4a34ec532b8[j] + arr.get(i);
                }
            }
        }
        for (int i = arr.size() - 2; i >= 0; i--) {
            maxSum_Problem_2_cbc8e701_69fe_4ab1_b55f_b4a34ec532b8Reverse[i] = arr.get(i);
            for (int j = arr.size() - 1; j > i; j--) {
                if (arr.get(i) > arr.get(j) && maxSum_Problem_2_cbc8e701_69fe_4ab1_b55f_b4a34ec532b8Reverse[i] < maxSum_Problem_2_cbc8e701_69fe_4ab1_b55f_b4a34ec532b8Reverse[j] + arr.get(i)) {
                    maxSum_Problem_2_cbc8e701_69fe_4ab1_b55f_b4a34ec532b8Reverse[i] = maxSum_Problem_2_cbc8e701_69fe_4ab1_b55f_b4a34ec532b8Reverse[j] + arr.get(i);
                }
            }
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.size(); i++) {
            max = Math.max(max, maxSum_Problem_2_cbc8e701_69fe_4ab1_b55f_b4a34ec532b8[i] + maxSum_Problem_2_cbc8e701_69fe_4ab1_b55f_b4a34ec532b8Reverse[i] - arr.get(i));
        }
        return max;
    }

    
    public static int maxSum_Problem_1_57bc82c6_3056_41bc_a31b_3888d1e11a77(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if (sum > max) {
                max = sum;
            }
            if (i < arr.size() - 1) {
                sum -= arr.get(i);
                if (sum < 0) {
                    sum = 0;
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_1_84eff1fd_2846_4f24_81de_f919bb2dea35(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if (sum > max) {
                max = sum;
            }
            if (i < arr.size() - 1) {
                if (sum < 0) {
                    sum = 0;
                }
                sum += arr.get(i + 1);
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_135522c4_d5dc_44ca_bebb_0a0956c864a3(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(i > 0 && arr.get(i) < arr.get(i-1)) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_2_e4ae5760_dd7c_477d_a320_843c03d55517(ArrayList<Integer> arr) {
        int[] inc = new int[arr.size()];
        int[] dec = new int[arr.size()];
        inc[0] = arr.get(0);
        dec[arr.size() - 1] = arr.get(arr.size() - 1);
        for (int i = 1; i < arr.size(); i++) {
            inc[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(i) > arr.get(j)) {
                    inc[i] = Math.max(inc[i], inc[j] + arr.get(i));
                }
            }
        }
        for (int i = arr.size() - 2; i >= 0; i--) {
            dec[i] = arr.get(i);
            for (int j = arr.size() - 1; j > i; j--) {
                if (arr.get(i) > arr.get(j)) {
                    dec[i] = Math.max(dec[i], dec[j] + arr.get(i));
                }
            }
        }
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            max = Math.max(max, inc[i] + dec[i] - arr.get(i));
        }
        return max;
    }

    
    public static int maxSum_Problem_0_b9707490_6f20_4a3b_98cd_99ee45b06d5a(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            int sum = 0;
            for (int j = i; j < arr.size(); j++) {
                sum += arr.get(j);
                if (sum > max) {
                    max = sum;
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_1_165824c4_ffc3_4383_8bf4_f90b8294e92e(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(i > 0 && arr.get(i) > arr.get(i-1)) {
                sum -= arr.get(i-1);
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_9d7acd53_e717_4b65_894d_63361a1f4436(ArrayList<Integer> arr) {
        int max = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                int sum = arr.get(i) + arr.get(j);
                if(sum > max) {
                    max = sum;
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_db11fa65_fc56_4da2_a0bc_eba73f8a9dc6(ArrayList<Integer> arr) {
        int[] dp = new int[arr.size()];
        dp[0] = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            dp[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(i) > arr.get(j)) {
                    dp[i] = Math.max(dp[i], dp[j] + arr.get(i));
                }
            }
        }
        int max = dp[0];
        for (int i = 1; i < dp.length; i++) {
            max = Math.max(max, dp[i]);
        }
        return max;
    }

    
    public static int maxSum_Problem_1_1812cfe8_d050_405b_a8ab_3e683a7a267d(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(i > 0 && arr.get(i) < arr.get(i-1)) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_cbb7b31c_225b_4785_b2ba_dc53154ba942(ArrayList<Integer> arr) {
        int max = arr.get(0);
        int sum = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            sum = arr.get(i) + sum;
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_1_69f8481f_d50a_4443_a1f8_623dd812f0b7(ArrayList<Integer> arr) {
        int[] maxSum_Problem_1_69f8481f_d50a_4443_a1f8_623dd812f0b7 = new int[arr.size()];
        int[] maxSum_Problem_1_69f8481f_d50a_4443_a1f8_623dd812f0b7Reverse = new int[arr.size()];
        maxSum_Problem_1_69f8481f_d50a_4443_a1f8_623dd812f0b7[0] = arr.get(0);
        maxSum_Problem_1_69f8481f_d50a_4443_a1f8_623dd812f0b7Reverse[arr.size() - 1] = arr.get(arr.size() - 1);
        for (int i = 1; i < arr.size(); i++) {
            maxSum_Problem_1_69f8481f_d50a_4443_a1f8_623dd812f0b7[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(j) < arr.get(i)) {
                    maxSum_Problem_1_69f8481f_d50a_4443_a1f8_623dd812f0b7[i] = Math.max(maxSum_Problem_1_69f8481f_d50a_4443_a1f8_623dd812f0b7[i], maxSum_Problem_1_69f8481f_d50a_4443_a1f8_623dd812f0b7[j] + arr.get(i));
                }
            }
        }
        for (int i = arr.size() - 2; i >= 0; i--) {
            maxSum_Problem_1_69f8481f_d50a_4443_a1f8_623dd812f0b7Reverse[i] = arr.get(i);
            for (int j = arr.size() - 1; j > i; j--) {
                if (arr.get(j) < arr.get(i)) {
                    maxSum_Problem_1_69f8481f_d50a_4443_a1f8_623dd812f0b7Reverse[i] = Math.max(maxSum_Problem_1_69f8481f_d50a_4443_a1f8_623dd812f0b7Reverse[i], maxSum_Problem_1_69f8481f_d50a_4443_a1f8_623dd812f0b7Reverse[j] + arr.get(i));
                }
            }
        }
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            max = Math.max(max, maxSum_Problem_1_69f8481f_d50a_4443_a1f8_623dd812f0b7[i] + maxSum_Problem_1_69f8481f_d50a_4443_a1f8_623dd812f0b7Reverse[i] - arr.get(i));
        }
        return max;
    }

    
    public static int maxSum_Problem_0_0bf26df3_43db_4644_a0d0_8b11d49d2f28(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
        }
        for(int i = 0; i < arr.size() - 1; i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_1_77754d7f_cf77_4aae_a647_fee833987546(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int sum = arr.get(i) + arr.get(j);
                if (sum > max) {
                    max = sum;
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_2_68845c20_5212_47e6_a793_ba3959aa3c87(ArrayList<Integer> arr) {
        int max = arr.get(0);
        int sum = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i) > arr.get(i - 1)) {
                sum += arr.get(i);
            } else {
                sum = arr.get(i);
            }
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_22602da9_81f7_43ff_8b7c_0947f1d1b69a(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(sum < 0) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_11407895_2434_4f7d_a98f_93f5fba8d9b7(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if (sum > max) {
                max = sum;
            }
            if (i < arr.size() - 1) {
                sum -= arr.get(i);
                if (sum < 0) {
                    sum = 0;
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_2_db0feb26_009b_427c_8108_75054b76993d(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            sum = arr.get(i) + arr.get(i + 1);
            if(sum > max) {
                max = sum;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_2062a172_51c4_4e3b_b939_3cb331a5c811(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if (sum > max) {
                max = sum;
            }
            if (i < arr.size() - 1) {
                sum -= arr.get(i);
                if (sum < 0) {
                    sum = 0;
                }
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_1_b84ea3b9_cc82_4707_9f64_9bbef8d581e8(ArrayList<Integer> arr) {
        int[] maxSum_Problem_1_b84ea3b9_cc82_4707_9f64_9bbef8d581e8 = new int[arr.size()];
        int[] maxSum_Problem_1_b84ea3b9_cc82_4707_9f64_9bbef8d581e8Rev = new int[arr.size()];
        maxSum_Problem_1_b84ea3b9_cc82_4707_9f64_9bbef8d581e8[0] = arr.get(0);
        maxSum_Problem_1_b84ea3b9_cc82_4707_9f64_9bbef8d581e8Rev[arr.size() - 1] = arr.get(arr.size() - 1);
        for (int i = 1; i < arr.size(); i++) {
            maxSum_Problem_1_b84ea3b9_cc82_4707_9f64_9bbef8d581e8[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(i) > arr.get(j)) {
                    maxSum_Problem_1_b84ea3b9_cc82_4707_9f64_9bbef8d581e8[i] = Math.max(maxSum_Problem_1_b84ea3b9_cc82_4707_9f64_9bbef8d581e8[i], maxSum_Problem_1_b84ea3b9_cc82_4707_9f64_9bbef8d581e8[j] + arr.get(i));
                }
            }
        }
        for (int i = arr.size() - 2; i >= 0; i--) {
            maxSum_Problem_1_b84ea3b9_cc82_4707_9f64_9bbef8d581e8Rev[i] = arr.get(i);
            for (int j = arr.size() - 1; j > i; j--) {
                if (arr.get(i) > arr.get(j)) {
                    maxSum_Problem_1_b84ea3b9_cc82_4707_9f64_9bbef8d581e8Rev[i] = Math.max(maxSum_Problem_1_b84ea3b9_cc82_4707_9f64_9bbef8d581e8Rev[i], maxSum_Problem_1_b84ea3b9_cc82_4707_9f64_9bbef8d581e8Rev[j] + arr.get(i));
                }
            }
        }
        int ans = 0;
        for (int i = 0; i < arr.size(); i++) {
            ans = Math.max(ans, maxSum_Problem_1_b84ea3b9_cc82_4707_9f64_9bbef8d581e8[i] + maxSum_Problem_1_b84ea3b9_cc82_4707_9f64_9bbef8d581e8Rev[i] - arr.get(i));
        }
        return ans;
    }

    
    public static int maxSum_Problem_1_af74bc66_e9aa_4b0e_a7a1_96df88443e1f(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum > max) {
                max = sum;
            }
            if(sum < 0) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_fb4a88a0_73f6_454b_8848_f4e1e98a0376(ArrayList<Integer> arr) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if (sum > max) {
                max = sum;
            }
            if (i > 0 && arr.get(i) < arr.get(i - 1)) {
                sum = 0;
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_2ba2d7df_b2e3_4f6f_b555_b8f799842929(ArrayList<Integer> arr) {
        int max = arr.get(0);
        for(int i = 1; i < arr.size(); i++) {
            if(arr.get(i) > max) {
                max = arr.get(i);
            }
        }
        return max;
    }

    
    public static int maxSum_Problem_0_3fbc5625_6609_489f_83fe_1232fc509667(ArrayList<Integer> arr) {
        int n = arr.size();
        int[] inc = new int[n];
        int[] dec = new int[n];
        inc[0] = arr.get(0);
        dec[n - 1] = arr.get(n - 1);
        for (int i = 1; i < n; i++) {
            inc[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(i) > arr.get(j)) {
                    inc[i] = Math.max(inc[i], inc[j] + arr.get(i));
                }
            }
        }
        for (int i = n - 2; i >= 0; i--) {
            dec[i] = arr.get(i);
            for (int j = n - 1; j > i; j--) {
                if (arr.get(i) > arr.get(j)) {
                    dec[i] = Math.max(dec[i], dec[j] + arr.get(i));
                }
            }
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans = Math.max(ans, inc[i] + dec[i] - arr.get(i));
        }
        return ans;
    }

    
    public static int maxSum_Problem_1_d24ed62d_b6c0_48b9_abcc_cd0179d58391(ArrayList<Integer> arr) {
        int max = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            max = Math.max(max, arr.get(i));
            if (arr.get(i) < arr.get(i - 1)) {
                max = Math.max(max, arr.get(i) + arr.get(i - 1));
            }
        }
        return max;
    }

}
