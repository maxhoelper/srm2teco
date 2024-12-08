package mbpp_296_get_Inv_Count;

public class mbpp_296_get_Inv_Count {

    
    public static int getInvCount_Problem_1_b765e693_6935_4eb7_8923_b7431676d8f7(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;
        return inv_count;
    }

    
    public static int getInvCount_Problem_1_240c0060_728f_4be7_85d5_0036fecc9606(ArrayList<Integer> arr) {
        int count = 0;
        for (Integer num : arr) {
            if (arr.indexOf(num) < arr.lastIndexOf(num)) {
                count += arr.indexOf(num) - arr.lastIndexOf(num);
            }
        }
        return count;
    }

    
    public static int getInvCount_Problem_0_24cc1571_6a73_49a3_b2ab_3c734bb005fb(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;
        return inv_count;
    }

    
    public static int getInvCount_Problem_1_3b3d30ff_70ed_4c2b_a471_d2a15b540499(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_2_0722a92b_7378_4b56_ac32_206176f083f3(ArrayList<Integer> arr) {
        int n = arr.size();
        int inv_count = 0;
        for (int i = 0; i < n - 1; i++)
            for (int j = i + 1; j < n; j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_2_2a0026bb_14a2_4316_8e51_45bf2ec1866f(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_1_82514ba3_6c0a_4f1f_b883_b686e25d90e2(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_0_c21a62e1_ac80_482f_accd_8309adaffab8(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_0_dfda92fd_e3d7_4467_aeeb_d0f70cef189c(ArrayList<Integer> arr) {
        int invCount = 0;
        for (int i : arr) {
            if (i < 0) continue;
            if (i > 0) invCount = invCount + 1;
        }
        return invCount;
    }

    
    public static int getInvCount_Problem_1_6e3d3190_5448_4e7d_979f_bc91875910e4(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_1_71a2b533_d8e0_43ce_9089_8b801f1651a4(ArrayList<Integer> arr) {
        // Initialize some variables we will need.
        int count = 0;
        int sum = 0;
        int temp = arr.get(0);
        // Iterate through the arraylist backwards, starting at the end.
        for (int i = arr.size()-1; i >= 0; i--) {
            // If the current number is not greater than the one before it, add one to the count. Otherwise, subtract one from the count.
            if (arr.get(i) < temp) {
                count++;
            } else {
                count--;
            }
            // Add the current number to the sum.
            sum += arr.get(i);
            // Finally, store the current number as the current temporary number for comparison.
            temp = arr.get(i);
        }
        // Return the count
        return count;
    }

    
    public static int getInvCount_Problem_0_69444241_d3fe_4680_941c_d4dc9df79aa0(ArrayList<Integer> arr) {
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            int left = Math.max(arr.get(i), arr.get(i+1));
            int right = Math.min(arr.get(i), arr.get(i+1));
            if((left != right) && arr.get(i) > arr.get(i+1)) {
                count++;
            }
        }
        return count;
    }

    
    public static int getInvCount_Problem_0_c1e35c26_690f_4a84_8742_8dd9a43121f4(ArrayList<Integer> arr) {
        int inv_count = 0;
        int n = arr.size();
        for (int i = 0; i < n - 1; i++)
            for (int j = i + 1; j < n; j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;
        return inv_count;
    }

    
    public static int getInvCount_Problem_0_1716d0d6_b527_40f3_ac60_8fe0f983377f(ArrayList<Integer> arr) {
        int n = arr.size();
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++)
            sum += arr.get(i);
        for (int i = 0; i < n; i++) {
            if (max < arr.get(i))
                max = arr.get(i);
            if (min > arr.get(i))
                min = arr.get(i);
        }
        return sum - max - min;
    }

    
    public static int getInvCount_Problem_0_0b22de3d_f531_4bf2_95a7_4b37974eb5d5(ArrayList<Integer> arr) {
        int count = 0;
        for (Integer val : arr) {
            if (arr.indexOf(val) > arr.lastIndexOf(val)) {
                count++;
            }
        }
        return count;
    }

    
    public static int getInvCount_Problem_2_b7924f6b_6d89_4fb4_9e60_b320b2a3508c(ArrayList<Integer> arr) {
        // Write code here
        int count = 0L;
        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i) < arr.get(i-1)) {
                count++;
            }
        }
        return count;
    }

    
    public static int getInvCount_Problem_0_cb23dbdc_4dfc_4ca3_9cd7_9b2c24789f5b(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_1_a7dd5965_1bf8_4060_94da_0feb6a570aab(ArrayList<Integer> arr) {
        // Complete code here
        return 0;
    }

    
    public static int getInvCount_Problem_1_35bc02dd_7189_46ee_96d9_3b2cd7c4465f(ArrayList<Integer> arr) {
        int inv = 0, count = 0;
        for(int i = 0; i < arr.size(); i++) {
            int x = arr.get(i);
            for(int j = i + 1; j < arr.size(); j++) {
                if(x > arr.get(j)) {
                    inv = inv + 1;
                }
            }
        }
        System.out.println(inv);
        return inv;
    }

    
    public static int getInvCount_Problem_0_05042086_f6a2_44c8_9f79_c3a612f3b48b(ArrayList<Integer> arr) {
        int count = 0;
        for (int n : arr) {
            int temp;
            temp = n;
            while (temp > 0) {
                if (arr.get(arr.size() - 1) - temp < 0) {
                    temp--;
                } else {
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    
    public static int getInvCount_Problem_1_dfda92fd_e3d7_4467_aeeb_d0f70cef189c(ArrayList<Integer> arr) {
        int invCount = 0;
        for (int i : arr) {
            if (i < 0) continue;
            if (i > 0) invCount = invCount + 1;
        }
        return invCount;
    }

    
    public static int getInvCount_Problem_1_75f16c5e_8dd6_4062_917c_d7cd90528ad2(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_2_0beaf653_9e78_413d_b686_8fc25415bb33(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;
        return inv_count;
    }

    
    public static int getInvCount_Problem_1_bd9a1fcd_50c2_4610_8bd1_870d6052d9c5(ArrayList<Integer> arr) {
        int count = 0;
        for(int i = 1; i < arr.size(); i++) {
            if(arr.get(i) > arr.get(i-1)) {
                count++;
            }
        }
        return count;
    }

    
    public static int getInvCount_Problem_0_e9aee3dc_7e54_437f_bb21_74f22fbddcd1(ArrayList<Integer> arr) {
        int count = 0;
        for(int i = 1; i < arr.size(); i++) {
            if( arr.get(i) > arr.get(i-1)) {
                count++;
            }
        }
        return count;
    }

    
    public static int getInvCount_Problem_0_458e150b_fe50_4b61_a66f_c98d65e23aa5(ArrayList<Integer> arr) {
        int count = 0;
        for( int i = 1; i < arr.size(); i++ ) {
            if( arr.get(i) > arr.get(i-1) ) count++;
        }
        return count;
    }

    
    public static int getInvCount_Problem_0_b514b78c_aa8c_4d56_af70_f020fd33692a(ArrayList<Integer> arr) {
        int count = 0;
        for(int i = arr.size(); i-- > 0;) {
            int j = 0;
            while(j < i) {
                if(arr.get(j) > arr.get(j+1)) {
                    count++;
                }
                j++;
            }
        }
        return count;
    }

    
    public static int getInvCount_Problem_0_10cdff8a_b736_426f_9c7c_58fc0fe27757(ArrayList<Integer> arr) {
        int count = 0;
        Integer curr = arr.get(0);
        boolean first = True;
        for(int i = 1; i < arr.size(); i++) {
            Integer next = arr.get(i);
            if(curr < next) {
                count++;
            }
            curr = next;
            first = False;
        }
        return count;
    }

    
    public static int getInvCount_Problem_1_cbb7ee57_5746_4946_9683_52169f681e22(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_1_6c07a625_4745_42e9_83ca_be3f4ccb8dd5(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_0_2a6e4f95_750a_4256_8303_e1f060a5b1e8(ArrayList<Integer> arr) {
        return Collections.frequency(arr, arr.size()-1);
    }

    
    public static int getInvCount_Problem_0_03647675_0d26_42b3_bf96_fc40d41625ff(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_1_043b9a23_85c5_4d47_a9af_3d9192a319fc(ArrayList<Integer> arr) {
        int count = 0;
        for(int i: arr) {
            if( i >= 0) {
                count = count + 1;
            }
        }
        return count;
    }

    
    public static int getInvCount_Problem_2_e4d1c465_7fd3_4e98_b689_716659c2e1e3(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_2_65100397_6c40_47f9_ae97_570dd23c6694(ArrayList<Integer> arr) {
        int count = 0;
        for(int i = 1; i < arr.size() - 1; i++) {
            if(arr.get(i) > arr.get(i+1)) {
                count++;
            }
        }
        return count;
    }

    
    public static int getInvCount_Problem_0_2fa64175_8397_47a4_8cd6_02b3a6a9f1a7(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_0_10e62b1b_efaa_46e2_a0ec_58e911377bc2(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_0_32d38156_f371_4ca2_b4ac_6d9a5f74e0b1(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_1_074fae26_0fb9_4a75_9c72_d05ad391ab2e(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_1_bb5fb170_7b15_4555_9aa3_06fcadf39ab0(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;
        return inv_count;
    }

    
    public static int getInvCount_Problem_1_60301210_a0c4_4168_b986_86bba6e78d7d(ArrayList<Integer> arr) {
        int count = 0;
        int maxVal = Collections.max(arr);
        for (int num : arr) {
            if (num < maxVal) {
                count += num - maxVal;
                maxVal = num;
            }
        }
        return count;
    }

    
    public static int getInvCount_Problem_2_043b9a23_85c5_4d47_a9af_3d9192a319fc(ArrayList<Integer> arr) {
        int count = 0;
        for(int i: arr) {
            if( i >= 0) {
                count = count + 1;
            }
        }
        return count;
    }

    
    public static int getInvCount_Problem_1_b68cb691_5d8c_4612_a952_afe478a5f811(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;
        return inv_count;
    }

    
    public static int getInvCount_Problem_1_9d5325cd_f76d_4d6f_9e19_cdda6c162a70(ArrayList<Integer> arr) {
        int countInversion = 0;
        for(int i = 1; i < arr.size(); i++) {
            int leftElement = arr.get(i);
            for(int j = i; j > 0; j--) {
                int rightElement = arr.get(j);
                if(leftElement > rightElement) {
                    break;
                }
                countInversion++;
            }
        }
        return countInversion;
    }

    
    public static int getInvCount_Problem_1_8e2879bb_641b_4b38_9f76_6bc020e7e7e9(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;
        return inv_count;
    }

    
    public static int getInvCount_Problem_2_5e365892_8aee_450b_9fc7_f91f66bf0d73(ArrayList<Integer> arr) {
        // Write your code here
        int count = 0;
        for(int i = 0; i < arr.size(); i++){
            for(int j = i + 1; j < arr.size(); j++){
                if(arr.get(i) > arr.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getInvCount_Problem_2_8e2879bb_641b_4b38_9f76_6bc020e7e7e9(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;
        return inv_count;
    }

    
    public static int getInvCount_Problem_2_cb23dbdc_4dfc_4ca3_9cd7_9b2c24789f5b(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_2_c6b9605e_45d1_4a33_b469_ae90dd272c63(ArrayList<Integer> arr) {
        int res = 0;
        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i) > arr.get(i - 1)) {
                res++;
            }
        }
        return res;
    }

    
    public static int getInvCount_Problem_2_9d5325cd_f76d_4d6f_9e19_cdda6c162a70(ArrayList<Integer> arr) {
        int countInversion = 0;
        for(int i = 1; i < arr.size(); i++) {
            int leftElement = arr.get(i);
            for(int j = i; j > 0; j--) {
                int rightElement = arr.get(j);
                if(leftElement > rightElement) {
                    break;
                }
                countInversion++;
            }
        }
        return countInversion;
    }

    
    public static int getInvCount_Problem_2_0915114f_a28d_47b8_bf65_9c0e8b4d960f(ArrayList<Integer> arr) {
        // Your code goes here
        // Create a list to store inversions
        ArrayList<Integer> invs = new ArrayList<>();
        for(int i=0;i<arr.size()-1;i++) {
            for(int j=i+1;j<arr.size();j++) {
                if(arr.get(i)>arr.get(j)) {
                    if(invs.contains(j)) {
                        invs.remove(j);
                    } else {
                        invs.add(j);
                    }
                }
            }
        }
        // return the count
        return invs.size();
    }

    
    public static int getInvCount_Problem_1_57fcdeda_bed3_41f5_b666_c5b6014cb538(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_2_03d5aad7_62b6_48af_9bff_23355a2013b8(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_2_2c00e1f4_5acc_41f3_8038_c83e1282b35d(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_2_32ad7cd0_b06a_45b1_840e_0c9336272233(ArrayList<Integer> arr) {
        int size = arr.size();
        if (size == 0)
            return 0;
        if (size == 1)
            return arr.get(0);

        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            int x = arr.get(i);
            int j = 0;
            int k = i;
            while (k > 0 && j < size) {
                if (x < (arr.get(k - 1)))
                    res.add(k);
                k--;
                j++;
            }
        }
        return res.stream().mapToInt(x -> x).sum();
    }

    
    public static int getInvCount_Problem_1_04a6dcbd_e1fe_4056_82e9_5aab3fba08d1(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) > arr.get(j)) {
                    inv_count++;
                }
            }
        }
        return inv_count;
    }

    
    public static int getInvCount_Problem_2_063996fd_8049_4009_9a12_43d47b1d504e(ArrayList<Integer> arr) {
        int count = 0L;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) > arr.get(j)) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    
    public static int getInvCount_Problem_0_abbc6829_d33c_4682_b063_4ac007ff39eb(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_1_f1521c2d_48e8_4813_a0e9_2b1f945785f5(ArrayList<Integer> arr) {
        int count = 0;
        for (int element : arr)
            if (element > 0)
                count++;
        return count;
    }

    
    public static int getInvCount_Problem_1_0b22de3d_f531_4bf2_95a7_4b37974eb5d5(ArrayList<Integer> arr) {
        int count = 0;
        for (Integer val : arr) {
            if (arr.indexOf(val) > arr.lastIndexOf(val)) {
                count++;
            }
        }
        return count;
    }

    
    public static int getInvCount_Problem_0_7bb4c670_8e48_4e0c_b7c5_39c8e63d4199(ArrayList<Integer> arr) {
        // count number of inversions and sort list
        int count = 0;
        Integer max = arr.get(0);
        for (Integer val : arr) {
            if (val > max) {
                max = val;
            }
        }
        arr.sort(Comparator.naturalOrder());

        // count number of inversions in sorted list
        for (Integer val : arr) {
            if (val > max) {
                count++;
                max = val;
            }
        }
        return count;
    }

    
    public static int getInvCount_Problem_0_16950f86_145e_4170_8220_8286357d1054(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_1_e7fe483d_db7e_4ef9_8504_d870a2e0754d(ArrayList<Integer> arr) {
        int invCount = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) > arr.get(j)) {
                    invCount++;
                }
            }
        }
        return invCount;
    }

    
    public static int getInvCount_Problem_2_b1996f42_97c6_4797_bac6_048369d7388d(ArrayList<Integer> arr) {
        int inversions = 0;
        for (int i = 0; i < arr.size(); ++i) {
            for (int j = i + 1; j < arr.size(); ++j) {
                if (arr.get(i) > arr.get(j)) {
                    inversions += arr.get(j) - arr.get(i);
                }
            }
        }
        return inversions;
    }

    
    public static int getInvCount_Problem_0_4a2ea937_918c_42bd_9181_0b66174c4ee1(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;
        return inv_count;
    }

    
    public static int getInvCount_Problem_0_6298155f_ce38_4d7b_ac04_f00baa538fc0(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;
        return inv_count;
    }

    
    public static int getInvCount_Problem_2_6bce3042_9385_4642_a7e8_0745520e4043(ArrayList<Integer> arr) {
        // Write your code here
        int sum = 0;
        for(int i=0;i<arr.size();i++)
        {
            for(int j=i+1;j<arr.size();j++)
            {
                if(arr.get(i)>arr.get(j))
                {
                    int temp = arr.get(i);
                    arr.set(i,arr.get(j));
                    arr.set(j,temp);
                    i++;
                    j--;
                }
            }
        }
        return sum;
    }

    
    public static int getInvCount_Problem_0_c7170404_055c_475c_b435_608d0dad7cf7(ArrayList<Integer> arr) {
        int count = 0;
        int temp;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i+1; j < arr.size(); j++) {
                if(arr.get(i) > arr.get(j)) {
                    temp = arr.get(i);
                    arr.set(i, arr.get(j));
                    arr.set(j, temp);
                }
            }
        }
        return count;
    }

    
    public static int getInvCount_Problem_1_799b1733_fdae_4b64_897d_29340a6bebce(ArrayList<Integer> arr) {
        int invCount = 0;
        // loop through the array
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                for (int j = i; j < arr.size(); j++) {
                    if (arr.get(j) > 0) {
                        Integer currentInv = arr.get(j) - arr.get(i);
                        if (currentInv < 0) {
                            invCount += currentInv;
                            // remove the item from array list
                            arr.remove(i);
                            // increment index
                            i--;
                        } else {
                            // remove item from array list
                            arr.remove(j);
                            // increment index
                            j--;
                        }
                    }
                }
            }
        }
        return invCount;
    }

    
    public static int getInvCount_Problem_0_edfbe9d5_5f80_479c_8568_1317756cc33a(ArrayList<Integer> arr) {
        int count = 0;
        for(int i=0; i < arr.size()-1; i++) {
            int a = arr.get(i);
            int b = arr.get(i+1);
            if (b > a) {
                count ++;
            }
        }
        return count;
    }

    
    public static int getInvCount_Problem_2_5e7f1676_b8f7_4924_8a6f_a5cc5530da8d(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;
        return inv_count;
    }

    
    public static int getInvCount_Problem_2_0c03e62e_5141_4d87_8774_ea35387de45b(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_0_c96d0eba_a1a6_4e58_ab78_725feb9defb3(ArrayList<Integer> arr) {
        if (arr.size() <= 1) return 0;
        Integer start = arr.get(0);
        Integer end = arr.get(arr.size() - 1);
        int count = 0;
        for (Integer curr = start; curr <= end; curr++) {
            int diff = arr.get(arr.indexOf(curr)) - curr;
            if (diff < 0)
                diff *= -1;
            if (diff != 0) {
                count += diff;
            }
        }
        return count;
    }

    
    public static int getInvCount_Problem_2_b06ed069_5f51_4550_a0b6_cb740f439380(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_2_e7f70e51_4a2d_4ad0_bc6f_1ca7fc647524(ArrayList<Integer> arr) {
        int count = 0;
        int temp;
        for (int val : arr) {
            temp = val;
            while (temp != 0) {
                temp = temp / 2;
                count += temp;
            }
        }
        return count;
    }

    
    public static int getInvCount_Problem_0_063996fd_8049_4009_9a12_43d47b1d504e(ArrayList<Integer> arr) {
        int count = 0L;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) > arr.get(j)) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    
    public static int getInvCount_Problem_2_f2cfea35_b01b_4f2d_9973_3bb718330c90(ArrayList<Integer> arr) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            int temp = arr.get(i);
            while (--temp >= 0) {
                if (i == arr.indexOf(temp)) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    
    public static int getInvCount_Problem_2_f1521c2d_48e8_4813_a0e9_2b1f945785f5(ArrayList<Integer> arr) {
        int count = 0;
        for (int element : arr)
            if (element > 0)
                count++;
        return count;
    }

    
    public static int getInvCount_Problem_1_d6f7010b_78f6_4dba_bfbd_26c7a8a76acd(ArrayList<Integer> arr) {
        int count = 0;
        for (int i = arr.size() - 1; i >= 0; i--) {
            if (arr.get(i) > arr.get(i + 1)) {
                count++;
            }
        }
        return count;
    }

    
    public static int getInvCount_Problem_1_3ad19e46_aaa4_4f60_ac86_1e92ec4ba9c8(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_1_22d1c082_c307_42f7_ae24_06f681294421(ArrayList<Integer> arr) {
        int count = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) > arr.get(j)) {
                    int temp = arr.get(i);
                    arr.set(i, arr.get(j));
                    arr.set(j, temp);
                    count += arr.size() - j;
                }
            }
        }
        return count;
    }

    
    public static int getInvCount_Problem_2_9a2f535b_4399_44b8_9a75_dea0d7b4a128(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;
        return inv_count;
    }

    
    public static int getInvCount_Problem_2_409da736_71a4_4a19_8972_bfcfa931743b(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;
        return inv_count;
    }

    
    public static int getInvCount_Problem_2_074fae26_0fb9_4a75_9c72_d05ad391ab2e(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_0_57fcdeda_bed3_41f5_b666_c5b6014cb538(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_0_753b1356_9445_4aa8_8096_fc68e5574b6a(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_0_ef0f4a89_7f55_482a_ba24_b8efeb76a88d(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_1_764fd5de_da5c_490f_8477_9e163d6a21a5(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_0_bd9a1fcd_50c2_4610_8bd1_870d6052d9c5(ArrayList<Integer> arr) {
        int count = 0;
        for(int i = 1; i < arr.size(); i++) {
            if(arr.get(i) > arr.get(i-1)) {
                count++;
            }
        }
        return count;
    }

    
    public static int getInvCount_Problem_0_65100397_6c40_47f9_ae97_570dd23c6694(ArrayList<Integer> arr) {
        int count = 0;
        for(int i = 1; i < arr.size() - 1; i++) {
            if(arr.get(i) > arr.get(i+1)) {
                count++;
            }
        }
        return count;
    }

    
    public static int getInvCount_Problem_2_447c618e_f1eb_4e07_ace6_16ab7d276503(ArrayList<Integer> arr) {
        int count = 0;
        for (Integer i : arr) {
            for (Integer j : arr) {
                if (i != j) {
                    if (j > i) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    
    public static int getInvCount_Problem_2_24bc0e20_5d9b_40fc_b5fd_30faa8dc339e(ArrayList<Integer> arr) {
        if (arr.isEmpty()){
            return 0;
        }

        int minVal = arr.get(0);
        int invCount = 0;

        // Find minimum
        for(int i = 1; i < arr.size(); i++){
            if(arr.get(i) < minVal){
                minVal = arr.get(i);
            }
        }
        // Find count of each inversion
        for (int inv = minVal; inv <= arr.size(); inv++) {
            invCount += (arr.size() - inv + 1) * Math.log(arr.size() - inv + 1);
        }
        return invCount;
    }

    
    public static int getInvCount_Problem_2_c1e35c26_690f_4a84_8742_8dd9a43121f4(ArrayList<Integer> arr) {
        int inv_count = 0;
        int n = arr.size();
        for (int i = 0; i < n - 1; i++)
            for (int j = i + 1; j < n; j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;
        return inv_count;
    }

    
    public static int getInvCount_Problem_2_03647675_0d26_42b3_bf96_fc40d41625ff(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_2_41a4ad24_3cbf_452c_80e9_5d5e461c7469(ArrayList<Integer> arr) {
        int n = arr.size();
        int inv_count = 0;
        for (int i = 0; i < n - 1; i++)
            for (int j = i + 1; j < n; j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_2_c96d0eba_a1a6_4e58_ab78_725feb9defb3(ArrayList<Integer> arr) {
        if (arr.size() <= 1) return 0;
        Integer start = arr.get(0);
        Integer end = arr.get(arr.size() - 1);
        int count = 0;
        for (Integer curr = start; curr <= end; curr++) {
            int diff = arr.get(arr.indexOf(curr)) - curr;
            if (diff < 0)
                diff *= -1;
            if (diff != 0) {
                count += diff;
            }
        }
        return count;
    }

    
    public static int getInvCount_Problem_2_763d2711_daff_40e2_91b5_a3e541f8cc1e(ArrayList<Integer> arr) {
        int arrSize = arr.size();
        int invCount = 0;
        // loop over all array elements
        for (int i = 0; i < arrSize; i++)
        {
            // loop over all array elements
            for (int j = i+1; j < arrSize; j++)
            {
                // if the current element of array 1 is greater than
                // the current element of array 2
                if (arr.get(i) > arr.get(j))
                {
                    // add 1 to the inversion count
                    invCount++;
                }
            }
        }
        return invCount;
    }

    
    public static int getInvCount_Problem_0_763d2711_daff_40e2_91b5_a3e541f8cc1e(ArrayList<Integer> arr) {
        int arrSize = arr.size();
        int invCount = 0;
        // loop over all array elements
        for (int i = 0; i < arrSize; i++)
        {
            // loop over all array elements
            for (int j = i+1; j < arrSize; j++)
            {
                // if the current element of array 1 is greater than
                // the current element of array 2
                if (arr.get(i) > arr.get(j))
                {
                    // add 1 to the inversion count
                    invCount++;
                }
            }
        }
        return invCount;
    }

    
    public static int getInvCount_Problem_0_75f16c5e_8dd6_4062_917c_d7cd90528ad2(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_1_9fb97b15_38cd_499a_8844_ba0221debf18(ArrayList<Integer> arr) {
        // Write your Java code here
        // Your code goes here
        int temp;
        int result=0;
        for(int i=0;i<arr.size();i++)
        {
        temp = arr.get(i);
        for(int j=i+1;j<arr.size();j++)
        {
            if(arr.get(j) > temp)
            {
                temp = arr.get(j);
            }
        }
        result = result + (temp - i);
        }
        return result;
    }

    
    public static int getInvCount_Problem_1_b27f7722_8bbc_4e91_84a9_2848f2887196(ArrayList<Integer> arr) {
        int count = 0L;
        for (int elem : arr) {
            if (elem > 0)
                count += 1;
        }
        return count;
    }

    
    public static int getInvCount_Problem_1_cb3a5965_27dd_4a25_981d_22b9d3479cfe(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_2_32d38156_f371_4ca2_b4ac_6d9a5f74e0b1(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_2_a85ef941_b9e2_4aa2_b639_f6395376da8d(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;
        return inv_count;
    }

    
    public static int getInvCount_Problem_1_77f66888_5794_44f5_96b0_5f41ff7731ef(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_0_38a0cd26_44cc_433b_9db7_d299da60e239(ArrayList<Integer> arr) {
        int inversions = 0;
        int n = arr.size();
        for (int i = 0; i < n; i++) {
            int a = arr.get(i);
            int j = 0;
            while (j++ < i && a > arr.get(j)) {
                j++;
            }
            int k = j;
            while (k++ < i && a < arr.get(k)) {
                k++;
            }
            inversions += (j - k + 1);
        }
        return inversions;
    }

    
    public static int getInvCount_Problem_0_82514ba3_6c0a_4f1f_b883_b686e25d90e2(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_1_e6b2e7de_564b_4e26_97a9_c29f87d52b26(ArrayList<Integer> arr) {
        int count = 0, inversions = 0;
        for(Integer num : arr) {
            if(num == Integer.MIN_VALUE)
                continue;
            count++;
            while(num != 0) {
                if(num % 2 == 0)
                    num =  Math.pow(num, 2);
                else {
                    num = num / 2;
                    inversions++;
                }
            }
        }
        System.out.println("inversions = " + inversions);
        return count * inversions;
    }

    
    public static int getInvCount_Problem_1_eaac5f1f_8707_4193_a911_8331af345746(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_1_4514f380_cf54_416a_9db2_c97cebf3b891(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_2_e6b2e7de_564b_4e26_97a9_c29f87d52b26(ArrayList<Integer> arr) {
        int count = 0, inversions = 0;
        for(Integer num : arr) {
            if(num == Integer.MIN_VALUE)
                continue;
            count++;
            while(num != 0) {
                if(num % 2 == 0)
                    num =  Math.pow(num, 2);
                else {
                    num = num / 2;
                    inversions++;
                }
            }
        }
        System.out.println("inversions = " + inversions);
        return count * inversions;
    }

    
    public static int getInvCount_Problem_2_31d813fd_e5b4_4503_80bc_d4eb31927c3a(ArrayList<Integer> arr) {
        // Declare a counter variable and initialise it to zero.
        int count = 0;
        // Write a loop to find the number of inversions in a given array of integers
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) < arr.get(i + 1)) {
                count++;
            }
        }
        return count;
    }

    
    public static int getInvCount_Problem_2_33d01a31_20d1_423d_90cf_e38039a4cbc3(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_1_5e7f1676_b8f7_4924_8a6f_a5cc5530da8d(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;
        return inv_count;
    }

    
    public static int getInvCount_Problem_0_5bc3b619_bceb_4c4b_a2a7_a474185221a5(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_0_068dd061_af2b_4811_b65a_8b28898466ca(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_2_8eb8f408_bca1_4c69_908b_ff61057f0aa9(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;
        return inv_count;
    }

    
    public static int getInvCount_Problem_1_e03b71c2_fb6f_4516_b136_909690ae2a47(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;
        return inv_count;
    }

    
    public static int getInvCount_Problem_0_755604d7_148d_4f15_a7bc_31c7c6489a13(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_0_cb3a5965_27dd_4a25_981d_22b9d3479cfe(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_1_88e6bd78_4fa0_43f5_ba89_3871804e71c2(ArrayList<Integer> arr) {
        int count = 0;
        for (int a : arr) {
            for (int b : arr) {
                if (b > a) {
                    if (a > b) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    
    public static int getInvCount_Problem_0_19bf5fab_2dd3_4dc6_b1eb_4b02e76cdf04(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_1_38fec224_bad9_411b_9603_9cdef1f6ab1e(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size(); i++) {
            int j = arr.size() - i - 1;
            if (i == j) {
                continue;
            }
            if (arr.get(i) < arr.get(j)) {
                inv_count += 1;
            }
        }
        return inv_count;
    }

    
    public static int getInvCount_Problem_2_ee7fa7aa_59b3_473f_99dc_230d4461b60d(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;
        return inv_count;
    }

    
    public static int getInvCount_Problem_2_917f88ed_737f_43d1_8cab_bba4fe15e51f(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_2_4a16c93d_95ea_4044_bf35_3402acce76b5(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_2_6be9073c_6091_4195_8eed_81eba1ef66fc(ArrayList<Integer> arr) {
        int count = 0; // to keep track of inversions
        for (int i : arr) {
            for (int j : arr) {
                if (i == j) {
                    continue;
                }
                if (i < j) {
                    if (arr.contains(i + 1)) {
                        count++;
                    }
                }
                if (j < i) {
                    if (arr.contains(j + 1)) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    
    public static int getInvCount_Problem_2_36f02e81_12f6_4675_b3c3_6ad21ccec52c(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;
        return inv_count;
    }

    
    public static int getInvCount_Problem_2_f3330944_30e0_4106_be41_586c4a7b648c(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_1_256ace03_f426_4902_9df3_37d14e79ab45(ArrayList<Integer> arr) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            int j = 0;
            while (j < arr.size() &&
                    arr.get(j) <= arr.get(i)) {
                j++;
            }
            if (i == j) {
                count++;
            }
        }
        return count;
    }

    
    public static int getInvCount_Problem_1_e9aee3dc_7e54_437f_bb21_74f22fbddcd1(ArrayList<Integer> arr) {
        int count = 0;
        for(int i = 1; i < arr.size(); i++) {
            if( arr.get(i) > arr.get(i-1)) {
                count++;
            }
        }
        return count;
    }

    
    public static int getInvCount_Problem_2_eb061cf7_f2ee_45bb_8c92_0f43de8ce78f(ArrayList<Integer> arr) {
        int invCount = 0;
        for(int i=0; i<arr.size(); i++){
            int leftIndex = i;
            for(int j=i; j>0; j--){
                if(arr.get(j) > arr.get(leftIndex)){
                    leftIndex = j;
                }
            }
            invCount += Math.abs(arr.get(i) - arr.get(leftIndex));
            System.out.println("left: " + leftIndex);
            System.out.println("right: " + i);
        }
        System.out.println("inv: " + invCount);
        return invCount;
    }

    
    public static int getInvCount_Problem_2_2a190df7_13b6_418c_8a00_1dc247aadc67(ArrayList<Integer> arr) {
        int inv_count = 0;
        int n = arr.size();
        for (int i = 0; i < n - 1; i++)
            for (int j = i + 1; j < n; j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;
        return inv_count;
    }

    
    public static int getInvCount_Problem_1_1716d0d6_b527_40f3_ac60_8fe0f983377f(ArrayList<Integer> arr) {
        int n = arr.size();
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++)
            sum += arr.get(i);
        for (int i = 0; i < n; i++) {
            if (max < arr.get(i))
                max = arr.get(i);
            if (min > arr.get(i))
                min = arr.get(i);
        }
        return sum - max - min;
    }

    
    public static int getInvCount_Problem_1_938194f0_cde6_4c98_af48_4e6056167a52(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;
        return inv_count;
    }

    
    public static int getInvCount_Problem_1_03647675_0d26_42b3_bf96_fc40d41625ff(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_1_95305ac5_6b06_42eb_8438_5dae5f1c8b6d(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_2_cb569211_36f4_4fa6_b9d6_cc45ce8ea6c0(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

    
    public static int getInvCount_Problem_0_702fcc0c_5788_4734_80ec_f53dc5f7e133(ArrayList<Integer> arr) {
        int inv_count = 0;
        for (int i = 0; i < arr.size() - 1; i++)
            for (int j = i + 1; j < arr.size(); j++)
                if (arr.get(i) > arr.get(j))
                    inv_count++;

        return inv_count;
    }

}