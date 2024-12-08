package mbpp_223_is_majority;

public class mbpp_223_is_majority {

    
    public static boolean isMajority_Problem_2_9654ab50_dbea_4f85_a10b_01b5c21de9ac(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for(int i = 0; i < arr.size() && count < n/2; i++) {
            if(arr.get(i) == x) count++;
        }
        for(int i = arr.size() - 1; i >= 0 && count < n/2; i--) {
            if(arr.get(i) == x) count++;
        }
        return count > n/2;
    }

    
    public static boolean isMajority_Problem_1_2b938f27_fd7a_48ec_91d3_725a952d5267(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int count = 0;
        while (i < arr.size()) {
            if (arr.get(i) == x) {
                count++;
                if (count >= n / 2) {
                    return True;
                }
            }
            i++;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_1_e9e018f8_2df3_47b9_ac9a_d31027c3005b(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int count = 0;
        while(i < arr.size()) {
            if(arr.get(i) == x) {
                count++;
                if(count > n/2) {
                    return True;
                }
            }
            i++;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_db43d63c_0e14_41d1_90f8_20786dc3f6f8(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isMajority_Problem_1_7cb6a869_af1a_4dea_bbb4_fc7cf43f6f4e(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        return count > n / 2;
    }

    
    public static boolean isMajority_Problem_1_bbeda048_7bc8_4477_b1de_37586cc2362e(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int count = 0;
        while (i < arr.size()) {
            if (arr.get(i) == x) {
                count++;
                if (count >= n / 2) {
                    return True;
                }
            }
            i++;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_0_51eff934_a5c9_4467_b1ec_aa9ce193f59d(ArrayList<Integer> arr, int n, int x) {
        HashSet<Integer> set = new HashSet<>();
        boolean found = False;
        for (int i = 0; i < arr.size(); i++) {
            int y = arr.get(i);
            while (set.contains(y)) {
                set.remove(y);
                y = arr.get(i);
            }
            if (set.size() == n && y != x && y > n) {
                found = True;
                break;
            }
            if (!set.contains(y)) {
                set.add(x);
            }
        }
        return found;
    }

    
    public static boolean isMajority_Problem_3_8aadd67a_a4d5_45c5_84cd_04e7a558167b(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int j = arr.size() - 1;
        while (i < j) {
            if (arr.get(i) == x) {
                i++;
            } else if (arr.get(j) == x) {
                j--;
            } else {
                i++;
                j--;
            }
        }
        return i >= n/2;
    }

    
    public static boolean isMajority_Problem_0_a769a5ba_3eb4_4e15_ae0a_2990d8c62c6b(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_1_be374154_4eb3_416c_90b4_d8a6cb6d4376(ArrayList<Integer> arr, int n, int x) {
        boolean res = False;
        int c = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x && c > n/2) {
                c = 1;
            } else if (arr.get(i) == x && c == 0) {
                c = 1;
            } else {
                c = 0;
            }
        }
        if (c == n/2) {
            res = True;
        }
        return res;
    }

    
    public static boolean isMajority_Problem_3_5ca16123_9446_40f4_bd07_7e5ad356d5ef(ArrayList<Integer> arr, int n, int x) {
        ArrayList<Integer> sorted = new ArrayList<>(arr);
        Collections.sort(sorted);
        if (sorted == null || sorted.size() < n) {
            return False;
        }
        int count = 0;
        for (int i = 0; i < sorted.size(); i++) {
            if (sorted.get(i) == x) {
                count++;
            }
        }
        int threshold =  Math.ceil(n/2);
        return count > threshold;
    }

    
    public static boolean isMajority_Problem_1_7a188f9f_b12a_4d1d_b894_fdf59d8db9b0(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_0_0c720924_70b4_4fac_a11b_19d134e6814e(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        Iterator<Integer> itr = arr.iterator();
        while(itr.hasNext()) {
            if(itr.next().equals(x)) {
                count++;
            }
        }
        return (count > n/2);
    }

    
    public static boolean isMajority_Problem_3_cf903859_0930_41b5_a607_d851deb88ec8(ArrayList<Integer> arr, int n, int x) {
        boolean flag = False;
        int k = 0;
        for(int i = 0; i<arr.size(); i++)
        {
            int count = 0;
            int current = arr.get(i);
            if(current == x)
            {
                count++;
            }
            for(int j = 0; j<arr.size(); j++)
            {
                if(arr.get(j) == current)
                {
                    count++;
                }
            }
            if(count > n/2)
            {
                flag = True;
            }
        }
        return flag;
    }

    
    public static boolean isMajority_Problem_0_e1144275_3567_4b07_a1a6_2864b8c8925e(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int count = 0;
        for(Integer l : arr) {
            if(l == x) {
                count++;
                if(count > n/2) {
                    return True;
                }
            }
            i++;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_936576b9_0915_42d5_8456_5421c3f710f4(ArrayList<Integer> arr, int n, int x) {
        // Write your code here
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == x) {
                count++;
            }
        }
        if(count > n/2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_794eeb5f_5868_41b7_bff6_e32e1fa2f8c7(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int count = 0;
        while(i < arr.size()) {
            if(arr.get(i) == x) {
                count++;
                if(count > n/2) {
                    return True;
                }
            }
            i++;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_1_f2a8e96c_3821_4814_9019_f307bf74e9c0(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get( i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_1_c7de5bcc_371e_4fa6_807f_611a5aad66a2(ArrayList<Integer> arr, int n, int x) {
        int countElem = 0, countElem1 = 0;
        for(int i = 0; i<n; i++) {
            if(arr.get(i) == x) { countElem++; }
            if(arr.get(i) == arr.get(i-1)) { countElem1++; }
        }
        if(countElem > n/2) {
            return True;
        }
        else {
            if(countElem1 > n/2) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_54260d16_e535_4275_ba14_d1cb02f96702(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == x) {
                count++;
            }
        }
        if(count > n/2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_1_0f113501_6666_4a01_bf6b_54cb7d857c83(ArrayList<Integer> arr, int n, int x) {
        Map<Integer, Integer> map = new HashMap<>();
        for(Integer value : arr)
            map.putIfAbsent(value, 0L);
        if (map.containsKey(x))
            return False;
        map.put(x, map.get(x) + n);
        return True;
    }

    
    public static boolean isMajority_Problem_3_9b63db75_86dc_45d0_986c_89746c8a6f93(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i : arr) {
            if (i == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_1_44ba5088_e3b2_4921_b95a_0fc3608a938b(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int count = 0;
        while (i < arr.size()) {
            if (arr.get(i) == x) {
                count++;
                if (count >= n / 2) {
                    return True;
                }
            }
            i++;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_c5023254_280f_4635_b2da_d97d85f640f9(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        return count > n / 2;
    }

    
    public static boolean isMajority_Problem_2_4c3490f6_3969_4e31_a615_d7208128d4cc(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int count = 0;
        while (i < arr.size()) {
            if (arr.get(i) == x) {
                count++;
                if (count > n/2) {
                    return True;
                }
            }
            i++;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_910a1a30_e485_4a3e_8e8a_f522da46d1de(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_0_ddc88e1a_d018_460a_a29a_1c2d6b819578(ArrayList<Integer> arr, int n, int x) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < arr.size() && i < n; i++) {
            Integer key = arr.get(i);
            Integer val = (map.containsKey(key)) ? map.get(key) : 1;
            map.put(key, val+1);
        }
        if(map.containsKey(x)) {
            if(map.get(x) >= n/2) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_ddc88e1a_d018_460a_a29a_1c2d6b819578(ArrayList<Integer> arr, int n, int x) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < arr.size() && i < n; i++) {
            Integer key = arr.get(i);
            Integer val = (map.containsKey(key)) ? map.get(key) : 1;
            map.put(key, val+1);
        }
        if(map.containsKey(x)) {
            if(map.get(x) >= n/2) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_aeb8f6df_6dd4_4bd3_a110_09bf7129cf4b(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int j = arr.size() - 1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (arr.get(mid) == x) {
                i = mid + 1;
            } else if (arr.get(mid) < x) {
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }
        return i >= n / 2;
    }

    
    public static boolean isMajority_Problem_2_24bf2943_9120_42ca_8898_e56160fc3a44(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_0_9eeda306_ae53_49da_8090_9f7857fd84b8(ArrayList<Integer> arr, int n, int x) {
        // Write your code here
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == x) {
                count++;
            }
        }
        if(count > arr.size() / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_1_e3c07191_01f0_4015_8076_471110f6f3ee(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int count = 0;
        while (i < arr.size()) {
            if (arr.get(i) == x) {
                count++;
                if (count >= n / 2) {
                    return True;
                }
            }
            i++;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_1bec7bf3_77fe_4bb1_a34a_91d455d4a1c7(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for(int i = 0; i < arr.size(); i++){
            if(arr.get(i) == x){
                count++;
            }
        }
        return count > n/2;
    }

    
    public static boolean isMajority_Problem_1_f072387b_d65b_47d3_9b37_31f0ec633090(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        return count > n / 2;
    }

    
    public static boolean isMajority_Problem_2_183d25b2_2a21_4bfc_8770_232a05103496(ArrayList<Integer> arr, int n, int x) {
        // Write your code here
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == x) {
                count++;
            }
        }
        if(count > n/2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_b59d9c73_d3c1_42cf_b95f_52682a7837fe(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_0_210409c1_dd97_4b74_ac35_8d72d5e3de4e(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int j = arr.size() - 1;
        while (i <= j) {
            if (arr.get(i) == x) {
                i++;
            } else if (arr.get(j) == x) {
                j--;
            } else {
                if (i == j) {
                    return False;
                } else if (arr.get(i) > arr.get(j)) {
                    j--;
                } else {
                    i++;
                }
            }
        }
        return i > n / 2;
    }

    
    public static boolean isMajority_Problem_0_b99b4f59_9702_46b2_9a80_83978b587b20(ArrayList<Integer> arr, int n, int x) {
        //initialize count
        int count = 0;
        //initialize maj
        int maj = 0L;
        //loop through arr list
        for (Integer temp : arr) {
            //if temp is greater than maj, set maj to temp
            if (temp > maj) {
                maj = temp;
            }
            //if temp is equal to x, add 1 to count
            if (temp == x) {
                count++;
            }
        }
        //if count is greater than n/2, return True
        return count > n/2;
    }

    
    public static boolean isMajority_Problem_1_256ec4e4_3f43_48bf_8c50_316b80437a6f(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int count = 0;
        while(i < arr.size()) {
            if(arr.get(i) == x) {
                count++;
                if(count >= n/2) {
                    return True;
                }
            }
            i++;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_6844eaa7_2325_4eda_8435_0f96dff7bf3d(ArrayList<Integer> arr, int n, int x) {
        // Write your code here
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_36fa319a_f7af_41d3_a9bf_f4ff37c6429f(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_4fbdd526_cbd5_495e_9b48_c2efc2ce9248(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_0_369e7c97_9dbd_468c_9dc3_0e17f16bf584(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        return count > n/2;
    }

    
    public static boolean isMajority_Problem_2_e9e018f8_2df3_47b9_ac9a_d31027c3005b(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int count = 0;
        while(i < arr.size()) {
            if(arr.get(i) == x) {
                count++;
                if(count > n/2) {
                    return True;
                }
            }
            i++;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_9eeda306_ae53_49da_8090_9f7857fd84b8(ArrayList<Integer> arr, int n, int x) {
        // Write your code here
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == x) {
                count++;
            }
        }
        if(count > arr.size() / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_93c9a862_65cc_48e4_ba16_5da44030c0b2(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_41919845_9aae_49b0_9c36_4a449a7d4e2c(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for(Integer i: arr) {
            if(i == x) {
                count++;
            }
        }
        if(count > n/2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_54b18c3a_b13b_4ade_8c3e_37179dcf0bf9(ArrayList<Integer> arr, int n, int x) {
        boolean isMajority_Problem_2_54b18c3a_b13b_4ade_8c3e_37179dcf0bf9 = False;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr.get(i);
        }
        if (sum == n) {
            for (int i = 0; i < n; i++) {
                if (x == arr.get(i)) {
                    isMajority_Problem_2_54b18c3a_b13b_4ade_8c3e_37179dcf0bf9 = True;
                }
            }
        } else if (sum > n / 2) {
            isMajority_Problem_2_54b18c3a_b13b_4ade_8c3e_37179dcf0bf9 = True;
        }
        return isMajority_Problem_2_54b18c3a_b13b_4ade_8c3e_37179dcf0bf9;
    }

    
    public static boolean isMajority_Problem_2_e3a39152_d2f4_452d_8005_1a62a76d0d59(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x)
                count++;
            if (count == (n/2) - 1) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean isMajority_Problem_1_d2df6193_7f60_493d_b458_d8be5129d5b9(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_0_884d97c1_8f52_462d_88ae_3cdd89235cf2(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_2f46a9ee_7710_48e9_b865_ef2765041c7f(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_0_d13fe193_7705_4559_9fd1_f302abe6625a(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        return count > n/2;
    }

    
    public static boolean isMajority_Problem_0_bb661968_9bbe_450e_a235_310cb4be58e7(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i : arr) {
            if (i < x) {
                count++;
            }
        }
        return count > (n/2);
    }

    
    public static boolean isMajority_Problem_1_8f5a5e2e_bf43_4b72_b3af_93750cda322f(ArrayList<Integer> arr, int n, int x) {
        int counter = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                counter++;
            }
        }
        if (counter > (n / 2)) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isMajority_Problem_1_6c7e10bf_667d_4ed6_864e_c09f00e53663(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for(Integer i:arr) {
            if(i == x) count++;
        }
        return count > n/2;
    }

    
    public static boolean isMajority_Problem_2_dc9f7d77_346a_4660_b207_36d9b9a9dd68(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for(int i = 0; i < n; i++) {
            if(arr.get(i) == x) {
                count++;
            }
        }
        if(count > n/2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_0_adb0cfa1_b0ed_42b5_b07c_7464396471d9(ArrayList<Integer> arr, int n, int x) {
        double count = (double) Collections.frequency(arr, x);
        if (count / arr.size() >= n/2)
            return True;
        return False;
    }

    
    public static boolean isMajority_Problem_0_19df062f_bfa4_4ba8_8b83_73b01354b0b0(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == x) {
                count++;
            }
        }
        if(count > n/2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_987ef3c9_659c_4edc_8514_138cb8f10cdc(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_d14ab01a_7d4c_4a99_93d0_34376c6d090b(ArrayList<Integer> arr, int n, int x) {
        // Write your code here
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get( i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isMajority_Problem_3_6c1fd1ac_5ba9_4fa3_8095_70d12ec0bcce(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for(int i = 0; i < n; i++) {
            if(arr.get(i) == x) {
                count++;
            }
        }
        if(count > n/2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_004fff93_dfd6_4343_80d8_ccc5b74ad62e(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_0_c1d8054e_b7c3_46c9_852c_3ea7cdd1f447(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_1_8b630f10_cd84_4edd_9370_788ad38a5869(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int count = 0;
        while (i < arr.size()) {
            if (arr.get(i) == x) {
                count++;
                if (count >= n / 2) {
                    return True;
                }
            }
            i++;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_0_5c9eff8d_bf41_48b0_95dd_9e1d5f057672(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == x) {
                count++;
            }
        }
        return count > n/2;
    }

    
    public static boolean isMajority_Problem_2_9e227f46_ad47_4468_98f7_7ce0b0529783(ArrayList<Integer> arr, int n, int x) {
        
        ArrayList<Integer> arr1 = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            if (arr.get(i) == x)
                arr1.add(x);
        }
        int count = 0;
        for(int i = 0; i < arr1.size(); i++) {
            if(arr1.get(i) == x)
                count++;
            
        }
        if(count > n/2)
            return True;
        return False;
    }

    
    public static boolean isMajority_Problem_1_8f7433e2_bd6e_4b6e_973d_5017c75639c1(ArrayList<Integer> arr, int n, int x) {
        // Your code here
        int c = 0;
        boolean b = False;
        for(int i = 0 ; i < arr.size() ; i++) {
            if(arr.get(i) == x) {
                c++;
            }
        }
        if (c == n/2) {
            b = True;
        }
        return b;
    }

    
    public static boolean isMajority_Problem_0_70a32edb_cee4_4cd1_bd46_138c078f95f5(ArrayList<Integer> arr, int n, int x) {
        // Write your code here
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_0_b42b9021_f45f_4ac9_84c2_f7069516faac(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i : arr) {
            if (i == x) {
                count++;
            }
        }
        return count > (n / 2);
    }

    
    public static boolean isMajority_Problem_0_de61900b_b73b_4b5e_beb6_847c76f980d8(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for(int y: arr) {
            if(y == x) {
                count++;
            }
        }
        return count > n/2;
    }

    
    public static boolean isMajority_Problem_2_4db9fa9d_7d55_46a9_a55a_cb307d90b5d0(ArrayList<Integer> arr, int n, int x) {
        int count = 1;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        return count >= (n/2);
    }

    
    public static boolean isMajority_Problem_3_0611e6d4_23a4_4f93_9b31_7e1909f70b6e(ArrayList<Integer> arr, int n, int x) {
        /*
         * Your code here
         */
        if (arr.isEmpty()) {
            return False;
        }
        if (n == 0) {
            return True;
        }
        int count = 1;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count == (n + 1)) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isMajority_Problem_3_24bf2943_9120_42ca_8898_e56160fc3a44(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_0_e59f696e_120c_45b5_8545_762dd3c4f58e(ArrayList<Integer> arr, int n, int x) {
        if(arr.size() == 1) {
            return arr.get(0) == x;
        }
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == x) {
                count++;
            }
            if(count > n/2) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean isMajority_Problem_1_22f68ecb_7239_485c_90de_577cd7f2f650(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isMajority_Problem_3_af883098_bdcb_4638_aed0_aff576df049b(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i : arr) {
            if (i == x) {
                count++;
            }
        }
        return count > n / 2;
    }

    
    public static boolean isMajority_Problem_3_7709275a_5985_4199_8a60_3913be7ab762(ArrayList<Integer> arr, int n, int x) {
        // Write your code here
        int count = 0;
        for(int i = 0; i < arr.size(); i++){
            if(arr.get(i) == x){
                count++;
            }
        }
        if(count > n/2){
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_bac95519_e8c7_4adf_a499_b58b1213a06b(ArrayList<Integer> arr, int n, int x) {
        int counter = 0;
        for (Integer num : arr) {
            if (num == x) {
                counter++;
            }
            if (counter == n/2) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_e0db0bc9_2196_446a_a9b3_576738742ee0(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_af1dcde4_49cd_49eb_848e_ea94ae43eb62(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == x) {
                count++;
            }
        }
        if(count > n/2) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isMajority_Problem_0_2b44e83c_faa2_436a_83e3_8461c508475b(ArrayList<Integer> arr, int n, int x) {
        // Write your solution here
        if(arr.isEmpty()){
            return True;
        }
        int count = 1;
        int temp = 0;
        for (int i = 0; i < arr.size(); i++) {
            if(arr.contains(x)){
                count++;
            }
        }
        if(arr.contains(x)){
            temp = (n*(n+1)/2);
            if(count/2 == temp){
                return True;
            }
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_f2a8e96c_3821_4814_9019_f307bf74e9c0(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get( i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_d8b88c84_3f3f_4ce7_90db_064526ba9c97(ArrayList<Integer> arr, int n, int x) {
        boolean isMajority_Problem_3_d8b88c84_3f3f_4ce7_90db_064526ba9c97 = False;
        int count = 0;
        for (int i : arr) {
            if (i == x) {
                count++;
            }
        }
        if (count > (n/2L)) {
            isMajority_Problem_3_d8b88c84_3f3f_4ce7_90db_064526ba9c97 = True;
        }
        return isMajority_Problem_3_d8b88c84_3f3f_4ce7_90db_064526ba9c97;
    }

    
    public static boolean isMajority_Problem_0_e9e018f8_2df3_47b9_ac9a_d31027c3005b(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int count = 0;
        while(i < arr.size()) {
            if(arr.get(i) == x) {
                count++;
                if(count > n/2) {
                    return True;
                }
            }
            i++;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_0_e8e57958_5049_471b_b253_6d3432531947(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == x) {
                count++;
            }
            if(count == n/2) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_6844eaa7_2325_4eda_8435_0f96dff7bf3d(ArrayList<Integer> arr, int n, int x) {
        // Write your code here
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_25272680_bf47_45c8_afbc_18c86c0eb89e(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_fe2f6a09_4b57_4137_9ca2_9410ed582476(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_1_9654ab50_dbea_4f85_a10b_01b5c21de9ac(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for(int i = 0; i < arr.size() && count < n/2; i++) {
            if(arr.get(i) == x) count++;
        }
        for(int i = arr.size() - 1; i >= 0 && count < n/2; i--) {
            if(arr.get(i) == x) count++;
        }
        return count > n/2;
    }

    
    public static boolean isMajority_Problem_1_bfd67a4c_6544_499b_bfe2_1926b28ddec2(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int j = arr.size() - 1;
        while (i < j) {
            if (arr.get(i) == x) {
                i++;
            } else if (arr.get(j) == x) {
                j--;
            } else if (arr.get(i) > x) {
                i++;
            } else if (arr.get(j) > x) {
                j--;
            } else {
                i++;
                j--;
            }
        }
        return i >= n / 2;
    }

    
    public static boolean isMajority_Problem_3_65a50a89_d8f5_43fe_8b54_0da1633d924a(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        int index = arr.size() - 1;
        while (index >= 0) {
            if (arr.get(index) == x) {
                count++;
            }
            index--;
        }
        return count >= (n/2);
    }

    
    public static boolean isMajority_Problem_3_1e183f3d_d5aa_4809_bc6d_0df59022b4f0(ArrayList<Integer> arr, int n, int x) {
        // Write your code here
        int count = 0;
        for(int i = 0; i < n; i++) {
            if(arr.get(i) == x) {
                count++;
            }
        }
        if(count > n/2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_8f7d2973_4a11_44a2_b4ed_abc30507109a(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_49c150dd_1a85_4ed4_ab99_705a841bc5b4(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get( i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isMajority_Problem_0_e747da22_55e4_4a3b_82d0_1f52712e26c5(ArrayList<Integer> arr, int n, int x) {
        // Write your code here
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_1_0866f275_c5cb_4f49_9117_1bb6ec0292e3(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i : arr) {
            if (i == x)
                count++;
        }
        if (count > n/2)
            return True;
        return False;
    }

    
    public static boolean isMajority_Problem_1_a5af9ccb_8480_4d7c_84f7_3e371a325840(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i : arr) {
            if (i == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_a33207fb_83b8_498f_926c_076c03f87dbe(ArrayList<Integer> arr, int n, int x) {
        // Write your code here
        int count = 0;
        for(int i = 0; i < n; i++) {
            if(arr.get(i) == x) {
                count++;
            }
        }
        if(count > n/2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_de61900b_b73b_4b5e_beb6_847c76f980d8(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for(int y: arr) {
            if(y == x) {
                count++;
            }
        }
        return count > n/2;
    }

    
    public static boolean isMajority_Problem_0_77a17b06_6b07_47bb_acbd_9214170ce37c(ArrayList<Integer> arr, int n, int x) {
        boolean isMajority_Problem_0_77a17b06_6b07_47bb_acbd_9214170ce37c = False;
        int index = 0;
        while(index < arr.size()-1) {
            if(arr.get(index) == x) {
                if(arr.get(index+1) == x) {
                    isMajority_Problem_0_77a17b06_6b07_47bb_acbd_9214170ce37c = True;
                    break;
                }
            }
            index++;
        }
        return isMajority_Problem_0_77a17b06_6b07_47bb_acbd_9214170ce37c;
    }

    
    public static boolean isMajority_Problem_2_548b464b_e7a2_41cc_9cc3_a01946b529cf(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (Integer i : arr) {
            if (i.intValue() == x)
                count++;
            if (count > n/2)
                return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_57325a77_fd72_4e45_a7fb_2ec2c8a808ec(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isMajority_Problem_0_bac95519_e8c7_4adf_a499_b58b1213a06b(ArrayList<Integer> arr, int n, int x) {
        int counter = 0;
        for (Integer num : arr) {
            if (num == x) {
                counter++;
            }
            if (counter == n/2) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_7a0145d8_e47d_4c41_8064_9ea1bbac4d9d(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        return count > n / 2;
    }

    
    public static boolean isMajority_Problem_1_ddc88e1a_d018_460a_a29a_1c2d6b819578(ArrayList<Integer> arr, int n, int x) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < arr.size() && i < n; i++) {
            Integer key = arr.get(i);
            Integer val = (map.containsKey(key)) ? map.get(key) : 1;
            map.put(key, val+1);
        }
        if(map.containsKey(x)) {
            if(map.get(x) >= n/2) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_3b61cb22_eab8_4a77_a5a1_159c65d5a242(ArrayList<Integer> arr, int n, int x) {
        // Write your code here
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isMajority_Problem_0_c3311a17_8a41_4d4a_8f78_99201e16644e(ArrayList<Integer> arr, int n, int x) {
        // Write your code here
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == x) {
                count++;
            }
        }
        if(count > n/2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_1bc322a8_7087_4fdb_a7ab_ace668434915(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            count++;
            if(count == n/2)
                break;
            if(arr.get(i) == x) {
                count -= 1;
            }
        }
        return count > n/2;
    }

    
    public static boolean isMajority_Problem_3_a457447c_e444_4340_ab2b_b19d5a49c49c(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int count = 0;
        while(i < arr.size()) {
            if(arr.get(i) == x) {
                count++;
                if(count > n/2) {
                    return True;
                }
            }
            i++;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_0_5472a750_15e5_4716_ba18_86bd967d6e71(ArrayList<Integer> arr, int n, int x) {
        int count = 0; // keep track of how many times x appears in arr
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count % 2 == 0) {
            return True;
        }
        else {
            return False;
        }
    }

    
    public static boolean isMajority_Problem_2_bb856f27_f0e3_48ff_ac00_0a26e798ed4b(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        boolean result = False;
        for(int y: arr) {
            if(y == x)
                count++;
            if(count == n/2)
                result = True;
        }
        return result;
    }

    
    public static boolean isMajority_Problem_3_2ca55343_6b67_4314_906a_3062d42b90da(ArrayList<Integer> arr, int n, int x) {
        // Write your code here
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == x) {
                count++;
            }
        }
        if(count > n/2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_3957f931_79a7_44de_b7cb_4dc111024b88(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_74b385ed_96de_4dc6_9588_10de895ac036(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_3c1754a6_f1b0_4449_af04_0d5b7a8b8104(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_1_dea0ff3b_6a59_43d1_9c81_3ab30af4f0fd(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        boolean has = False;
        for (Integer val : arr) {
            if (val.equals(x)) {
                count++;
                if (count == n/2) {
                    has = True;
                    break;
                }
            }
        }
        return has;
    }

    
    public static boolean isMajority_Problem_3_f2eee1bb_8910_4d40_8514_30a1f2435d84(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for(int i = 0; i < n; i++) {
            if(arr.get(i) == x) {
                count++;
            }
        }
        if(count > n/2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_fd4e34b5_b449_4fbe_a952_a1bbfef92e9d(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_0_7a0fbbbd_0f34_4223_8ff4_e9319a96bfcc(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int count = 0;
        while(i < arr.size()) {
            if(arr.get(i) == x) {
                count++;
                if(count > n/2) {
                    return True;
                }
            }
            i++;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_95b9f4d4_a674_4c59_b9a3_46ddd7268373(ArrayList<Integer> arr, int n, int x) {
        // Write your code here
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_adf992ef_46d1_49fe_bc26_930187c00920(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for(int i=0; i<arr.size(); i++) {
            if(arr.get(i) == x) count++;
        }
        if(count%2 == 0) return True;
        else return False;
    }

    
    public static boolean isMajority_Problem_0_dd60960a_89be_4f1d_af18_034d679fb299(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        for(int j=1;j<arr.size();j++){
            if((arr.get(i)>x)&&(j<arr.size()-1)){
                i++;
            }
            if(i==n){
                return True;
            }
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_cb5c5652_067a_4771_bef7_f5e8954cdc1f(ArrayList<Integer> arr, int n, int x) {
        if (arr.isEmpty()) {
            return False;
        }
        ArrayList<Integer> sortedArr = new ArrayList<>();
        sortedArr.addAll(arr);
        Collections.sort(sortedArr);
        int highestCount = 0;
        for (int count : sortedArr) {
            if (count > highestCount) {
                highestCount = count;
            }
        }
        return highestCount == n / 2;
    }

    
    public static boolean isMajority_Problem_2_c4e066f2_9de7_49e9_95f1_618e644f71bd(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_7d68f855_e221_4cdd_a307_996188a36865(ArrayList<Integer> arr, int n, int x) {
        // Write your code here
        int count = 0;
        for(int i = 0; i < n; i++) {
            if(arr.get(i) == x) {
                count++;
            }
        }
        if(count > n/2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_0_727ffbc7_85e7_4915_baa6_e1f73024c2ba(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i : arr) {
            if (i == x) {
                count++;
            }
        }
        return count > n / 2;
    }

    
    public static boolean isMajority_Problem_2_253fabb1_0bad_458c_8ad6_2ccd60e11daf(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        return count > n / 2;
    }

    
    public static boolean isMajority_Problem_3_cb240ae4_b00e_44d4_b882_942f653c7585(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for(int val : arr) {
            if (val == x)
                count++;
        }
        int counter = Math.ceil((double)count/(double)(n/2));
        return (counter == n);
    }

    
    public static boolean isMajority_Problem_1_1b903c6e_04c0_4ff6_9a53_ecc48f4f2274(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n/2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_68433381_51dc_4e71_8818_ffc93fea3c6f(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i : arr) {
            if (i == x) {
                count++;
            }
        }
        return count > n / 2;
    }

    
    public static boolean isMajority_Problem_1_03a6b906_292c_4425_b649_5107bc02c76e(ArrayList<Integer> arr, int n, int x) {
        int count = 0; // the number of occurrences of the element 'x' in arr
        int half = n/2; // in half, the number of occurrences of the element 'x' in arr
        for(int i=0; i<n; i++) {
            if(arr.get(i) == x) {
                count++;
                if(count > half) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_70bdf47a_6081_414a_bc12_63245dce54e2(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get( i) == x) {
                count++;
            }
        }
        return count > n / 2;
    }

    
    public static boolean isMajority_Problem_0_23348112_8382_41e5_830e_0c8953bba1a3(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i : arr) {
            if (i == x) {
                count++;
            }
        }
        return count > n / 2;
    }

    
    public static boolean isMajority_Problem_0_4ade6436_0a88_4932_bc92_576dde777f08(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i : arr) {
            if (i == x) return True;
            count++;
        }
        return (count > n / 2);
    }

    
    public static boolean isMajority_Problem_3_a18c1fac_c26b_4eba_a1d8_3d649b88928f(ArrayList<Integer> arr, int n, int x) {
        // Write your code here
        int count = 0;
        for(int i = 0; i < n; i++){
            if(arr.get(i) == x){
                count++;
            }
        }
        if(count > n/2){
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_73e4d761_83bc_4400_9888_ca8544edd244(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (Integer i : arr) {
            if (i == x) {
                count++;
            }
        }
        return count > (n/2);
    }

    
    public static boolean isMajority_Problem_3_b59d9c73_d3c1_42cf_b95f_52682a7837fe(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_9eaea987_4010_4a09_acdc_20fb4b25c142(ArrayList<Integer> arr, int n, int x) {
        // your code here
        int count = 0;
        for(int i =0; i < arr.size(); i++) {
            if(arr.get(i) == x){
                count++;
            }
        }
        return (count > n/2);
    }

    
    public static boolean isMajority_Problem_0_0f113501_6666_4a01_bf6b_54cb7d857c83(ArrayList<Integer> arr, int n, int x) {
        Map<Integer, Integer> map = new HashMap<>();
        for(Integer value : arr)
            map.putIfAbsent(value, 0L);
        if (map.containsKey(x))
            return False;
        map.put(x, map.get(x) + n);
        return True;
    }

    
    public static boolean isMajority_Problem_2_dfe714b6_adee_4c44_881c_4d3c5573a6ee(ArrayList<Integer> arr, int n, int x) {
        // code here
        int halfLength = arr.size() / 2;
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count == halfLength) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isMajority_Problem_0_7cb6a869_af1a_4dea_bbb4_fc7cf43f6f4e(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        return count > n / 2;
    }

    
    public static boolean isMajority_Problem_3_e283a36c_f9c8_4a93_a46b_d02f73e2fb5a(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i : arr) {
            if (i == x) {
                count++;
            }
        }
        return count > n / 2;
    }

    
    public static boolean isMajority_Problem_2_746b1317_21ad_479b_afc0_7d4ca275a83a(ArrayList<Integer> arr, int n, int x) {
        // Write your code here
        int count = 0;
        for(int i=0;i<n;i++)
        {
            if(arr.get(i)==x)
            {
                count++;
            }
        }
        if(count>n/2)
        {
            return True;
        }
        else
        {
            return False;
        }
    }

    
    public static boolean isMajority_Problem_1_ba0b7815_e0ff_4f8e_9a8c_4006598f06d3(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i : arr) {
            if (i == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_1_7b25f2b6_565f_4c61_9b76_34889dc7c941(ArrayList<Integer> arr, int n, int x) {
        boolean result = False;
        for (int i : arr) {
            if (i / n > x) {
                result = True;
                break;
            }
        }
        return result;
    }

    
    public static boolean isMajority_Problem_3_bb661968_9bbe_450e_a235_310cb4be58e7(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i : arr) {
            if (i < x) {
                count++;
            }
        }
        return count > (n/2);
    }

    
    public static boolean isMajority_Problem_1_344def4d_18f1_4417_b1a5_9b2299272c2d(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == x) {
                count++;
            }
        }
        if(count > n/2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_0_bc36e8cd_b3b2_4eca_9f97_637941abed31(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int count = 0;
        while (i < arr.size()) {
            if (arr.get(i) == x) {
                count++;
                if (count > n / 2) {
                    return True;
                }
            }
            i++;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_d2df6193_7f60_493d_b458_d8be5129d5b9(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_1_0606287c_23e4_4996_bd89_674413b7f3de(ArrayList<Integer> arr, int n, int x) {
        // Write your answer here.
        int tempCount = 0;
        int tempSum = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                tempCount++;
                tempSum += x;
            }
        }
        if (tempCount % 2 == 0) {
            if (tempSum == n / 2) {
                return True;
            } else {
                return False;
            }
        } else {
            return False;
        }
    }

    
    public static boolean isMajority_Problem_0_7a0145d8_e47d_4c41_8064_9ea1bbac4d9d(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        return count > n / 2;
    }

    
    public static boolean isMajority_Problem_0_aeb8f6df_6dd4_4bd3_a110_09bf7129cf4b(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int j = arr.size() - 1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (arr.get(mid) == x) {
                i = mid + 1;
            } else if (arr.get(mid) < x) {
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }
        return i >= n / 2;
    }

    
    public static boolean isMajority_Problem_3_988c82a3_9021_4073_a589_cd64083b09cd(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        return count > n / 2;
    }

    
    public static boolean isMajority_Problem_2_0f113501_6666_4a01_bf6b_54cb7d857c83(ArrayList<Integer> arr, int n, int x) {
        Map<Integer, Integer> map = new HashMap<>();
        for(Integer value : arr)
            map.putIfAbsent(value, 0L);
        if (map.containsKey(x))
            return False;
        map.put(x, map.get(x) + n);
        return True;
    }

    
    public static boolean isMajority_Problem_0_f630de01_8073_4873_bc23_149a9328a0a0(ArrayList<Integer> arr, int n, int x) {
        ArrayList<Integer> sorted = new ArrayList<>(arr);
        Collections.sort(sorted);
        return sorted.stream().filter(l -> l % 2 == 0 && l != x).count() > n/2;
    }

    
    public static boolean isMajority_Problem_3_095b55f4_fd56_4849_a233_0e3ae6ffa0ea(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == x) {
                count ++;
            }
        }
        return count > n/2;
    }

    
    public static boolean isMajority_Problem_1_cd1e7940_a1b1_420d_a831_fe6f73d4e2d1(ArrayList<Integer> arr, int n, int x) {
        if (arr.size() <= n) {
            return False;
        }
        int halfIndex = arr.size() / 2;
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        return count == halfIndex;
    }

    
    public static boolean isMajority_Problem_1_c73ce00c_b6b5_4b11_8481_8b2c85d232b5(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i : arr) {
            if (i == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_1_d10153de_dbac_4727_80e1_7df63565637d(ArrayList<Integer> arr, int n, int x) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        int count = 0;
        for(int i : arr) {
            if(i == x) count++;
        }
        if(count > n/2)
            return True;
        return False;
    }

    
    public static boolean isMajority_Problem_1_70bb5d8d_047c_4fbe_a040_92b47859d5e4(ArrayList<Integer> arr, int n, int x) {
        // Write your code here
        int count = 0;
        for(int i = 0; i < n; i++) {
            if(arr.get(i) == x) {
                count++;
            }
        }
        if(count > n/2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_0_40e7074b_c514_49e5_ad84_d9ba6259dff8(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        return count > n / 2;
    }

    
    public static boolean isMajority_Problem_2_eee3eb0a_c081_4603_bb27_1bc3412f9e05(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        return count > n / 2;
    }

    
    public static boolean isMajority_Problem_2_ce55f810_d7ee_4839_b300_9eabf45ff278(ArrayList<Integer> arr, int n, int x) {
        boolean isMajority_Problem_2_ce55f810_d7ee_4839_b300_9eabf45ff278 = False;
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if ((count + 1 == (n/2))) {
            isMajority_Problem_2_ce55f810_d7ee_4839_b300_9eabf45ff278 = True;
        }
        return isMajority_Problem_2_ce55f810_d7ee_4839_b300_9eabf45ff278;
    }

    
    public static boolean isMajority_Problem_1_e1144275_3567_4b07_a1a6_2864b8c8925e(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int count = 0;
        for(Integer l : arr) {
            if(l == x) {
                count++;
                if(count > n/2) {
                    return True;
                }
            }
            i++;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_cc45e604_d688_4bdd_8dd2_1e9a816f4e10(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isMajority_Problem_1_c7df3376_bf02_45cd_801e_486d6307242d(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_e0db0bc9_2196_446a_a9b3_576738742ee0(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_0_d10153de_dbac_4727_80e1_7df63565637d(ArrayList<Integer> arr, int n, int x) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        int count = 0;
        for(int i : arr) {
            if(i == x) count++;
        }
        if(count > n/2)
            return True;
        return False;
    }

    
    public static boolean isMajority_Problem_1_f049a33e_b5c5_4fcb_9359_8c6e0f56d09e(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == x) {
                count++;
            }
        }
        if(count > n/2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_0_0553e750_cfa2_4d9d_a00e_ec3e166557fa(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        return count > n / 2;
    }

    
    public static boolean isMajority_Problem_0_ca7965e0_e34f_446d_a309_83f23769bc81(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_0_0606287c_23e4_4996_bd89_674413b7f3de(ArrayList<Integer> arr, int n, int x) {
        // Write your answer here.
        int tempCount = 0;
        int tempSum = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                tempCount++;
                tempSum += x;
            }
        }
        if (tempCount % 2 == 0) {
            if (tempSum == n / 2) {
                return True;
            } else {
                return False;
            }
        } else {
            return False;
        }
    }

    
    public static boolean isMajority_Problem_0_1812f420_26fa_4562_b0fe_008e1892624e(ArrayList<Integer> arr, int n, int x) {
        // Write your code here
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == x) {
                count++;
            }
        }
        return count > n/2;
    }

    
    public static boolean isMajority_Problem_1_af5c6076_ebc1_4f88_ad00_c9e896cb5ea8(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int count = 0;
        while(i < arr.size()) {
            if(arr.get(i) == x) {
                count++;
                if(count >= n/2) {
                    return True;
                }
            }
            i++;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_c551f105_01a3_4912_9cfb_7c536daf171e(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_54bd40bf_a542_40c9_b5fe_c943ff1aa762(ArrayList<Integer> arr, int n, int x) {
        // TODO: Implement this function
        return False;
    }

    
    public static boolean isMajority_Problem_1_ed69e024_fa98_4911_b6f0_0ac939fad33f(ArrayList<Integer> arr, int n, int x) {
        return arr.stream().filter(i -> i >= n/2).count() > n/2;
    }

    
    public static boolean isMajority_Problem_1_b966c2ed_7b43_43a6_bcc4_74a4c263e902(ArrayList<Integer> arr, int n, int x) {
        // Initialize result to False
        boolean result = False;

        // Initialize count
        int count = 0;

        // Loop through array
        for (Integer i : arr) {
            // Increment count
            count++;

            // If current element x is greater than the element in the array and count is greater than n/2, then result is True
            if (i > x && count > n/2) {
                result = True;
                break;
            }
        }
        return result;
    }

    
    public static boolean isMajority_Problem_2_af883098_bdcb_4638_aed0_aff576df049b(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i : arr) {
            if (i == x) {
                count++;
            }
        }
        return count > n / 2;
    }

    
    public static boolean isMajority_Problem_1_ca7965e0_e34f_446d_a309_83f23769bc81(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_32de4cc5_6db2_43f7_8b98_dde4215d6b77(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == x) {
                count++;
                if(count >= n/2) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_77a17b06_6b07_47bb_acbd_9214170ce37c(ArrayList<Integer> arr, int n, int x) {
        boolean isMajority_Problem_2_77a17b06_6b07_47bb_acbd_9214170ce37c = False;
        int index = 0;
        while(index < arr.size()-1) {
            if(arr.get(index) == x) {
                if(arr.get(index+1) == x) {
                    isMajority_Problem_2_77a17b06_6b07_47bb_acbd_9214170ce37c = True;
                    break;
                }
            }
            index++;
        }
        return isMajority_Problem_2_77a17b06_6b07_47bb_acbd_9214170ce37c;
    }

    
    public static boolean isMajority_Problem_3_b28a5bd7_cbca_4076_889c_02f5f45a5012(ArrayList<Integer> arr, int n, int x) {
        int count = 0; // count of occurrences of x
        for(int i = 0; i < n; i++){
            if (arr.get(i) == x){
                count++;
            }
        }
        // if count is greater than n/2, it is the majority
        return (count > n/2);
    }

    
    public static boolean isMajority_Problem_3_c237d233_fbba_4006_9a91_ea8bdfeabaec(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_bfd67a4c_6544_499b_bfe2_1926b28ddec2(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int j = arr.size() - 1;
        while (i < j) {
            if (arr.get(i) == x) {
                i++;
            } else if (arr.get(j) == x) {
                j--;
            } else if (arr.get(i) > x) {
                i++;
            } else if (arr.get(j) > x) {
                j--;
            } else {
                i++;
                j--;
            }
        }
        return i >= n / 2;
    }

    
    public static boolean isMajority_Problem_0_cedbf23d_44fb_4936_8b45_7a09acc774c6(ArrayList<Integer> arr, int n, int x) {
        int count = 0; // keep track of current count of majority
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) { // if current element equals x, add 1 to count
                count++;
            } else if (arr.get(i) > x) { // if current element is not equal to x, check if current count is greater than n/2
                count++;
                if (count >= n/2)
                    return True;
            }
        }
        return False;
    }

    
    public static boolean isMajority_Problem_0_ea551cee_aa7c_43d3_964b_7bcfd60abc58(ArrayList<Integer> arr, int n, int x) {
        ArrayList<Integer> majority = new ArrayList<>();
        int currentMajority = 0;
        int count = 0;
        for (int i : arr) {
            if (i == x && count != 0) {
                majority = arr;
                currentMajority = majority.get(majority.size() - 1);
            }
            if (i == x && count == 0) {
                count++;
            }
            if (i == currentMajority) {
                count++;
            } else {
                count--;
            }
        }
        return count%2==1;
    }

    
    public static boolean isMajority_Problem_1_210409c1_dd97_4b74_ac35_8d72d5e3de4e(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int j = arr.size() - 1;
        while (i <= j) {
            if (arr.get(i) == x) {
                i++;
            } else if (arr.get(j) == x) {
                j--;
            } else {
                if (i == j) {
                    return False;
                } else if (arr.get(i) > arr.get(j)) {
                    j--;
                } else {
                    i++;
                }
            }
        }
        return i > n / 2;
    }

    
    public static boolean isMajority_Problem_3_a03f55ac_33a0_4def_86b5_7ec3d1f2fb0c(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for(int a : arr)
        {
            if(a==x)
            {
                count++;
            }
            else
            {
                break;
            }
        }
        if(count>n/2)
        {
            return True;
        }
        else
        {
            return False;
        }
    }

    
    public static boolean isMajority_Problem_0_fc1327e2_1b0b_45c2_95ea_ef34ffd6435a(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        return count > n / 2;
    }

    
    public static boolean isMajority_Problem_3_dedcb0a6_01db_4c70_a3f5_4943edd9e377(ArrayList<Integer> arr, int n, int x) {
        // Write your code here
        return False; // change to True
    }

    
    public static boolean isMajority_Problem_3_46d0a89c_0ad3_4642_870a_772a3941f1b8(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_1_9b2b4aef_fa4a_49dc_b6be_fa4278ef73aa(ArrayList<Integer> arr, int n, int x) {
        // Initialize and set counter and count to 0
        int count = 0;
        int counter = 0;

        // Initialize to False, since the first element is not majority element
        boolean result = False;

        // For each element
        for (int element : arr) {
            // Increment counter
            counter++;
            // If counter is equal to n
            if (counter == n) {
                // Set the flag to True
                result = True;
                // Stop the for loop
                break;
            }
            // Increment count
            count++;
        }
        // Return result
        return result;
    }

    
    public static boolean isMajority_Problem_1_f4cb4e2b_5427_4122_8a59_f77b5701de2e(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_1_65d08711_e613_45e1_a91c_b00ccf92fde1(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int j = arr.size() - 1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (arr.get(mid) == x) {
                i = mid + 1;
            } else if (arr.get(mid) < x) {
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }
        return i > arr.size() / 2;
    }

    
    public static boolean isMajority_Problem_1_a5c3dfab_0724_49a7_a983_d3311d86f2c0(ArrayList<Integer> arr, int n, int x) {
        // Write your code here
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isMajority_Problem_3_e6422a58_8186_4ebd_8dfa_961c89aabdf3(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_cf903859_0930_41b5_a607_d851deb88ec8(ArrayList<Integer> arr, int n, int x) {
        boolean flag = False;
        int k = 0;
        for(int i = 0; i<arr.size(); i++)
        {
            int count = 0;
            int current = arr.get(i);
            if(current == x)
            {
                count++;
            }
            for(int j = 0; j<arr.size(); j++)
            {
                if(arr.get(j) == current)
                {
                    count++;
                }
            }
            if(count > n/2)
            {
                flag = True;
            }
        }
        return flag;
    }

    
    public static boolean isMajority_Problem_3_56ce9e7d_9931_482d_ada3_2c037a881c37(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i : arr) {
            if (i == x) {
                count++;
                if (count > n/2) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isMajority_Problem_0_60784034_a3aa_4ab0_beb3_fa751dfd29ac(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        return count > n / 2;
    }

    
    public static boolean isMajority_Problem_3_bbeda048_7bc8_4477_b1de_37586cc2362e(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int count = 0;
        while (i < arr.size()) {
            if (arr.get(i) == x) {
                count++;
                if (count >= n / 2) {
                    return True;
                }
            }
            i++;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_b731ff1f_79f9_4bfd_9df1_86a19e9f5381(ArrayList<Integer> arr, int n, int x) {
        boolean result = False;
        int count = 1;
        for (Integer i: arr) {
            if (i.intValue() == x) {
                count++;
            }
        }
        if (count > n/2) {
            result = True;
        }
        return result;
    }

    
    public static boolean isMajority_Problem_2_b2c61814_d5fa_4620_9e8a_d02a71dfd4ee(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for(int i = 0; i < n; i++) {
            if(arr.get(i) == x) {
                count++;
            }
        }
        return count > n/2;
    }

    
    public static boolean isMajority_Problem_1_548b464b_e7a2_41cc_9cc3_a01946b529cf(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (Integer i : arr) {
            if (i.intValue() == x)
                count++;
            if (count > n/2)
                return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_0_b96f3570_ada7_4c7d_8954_69c2474fe5dc(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get( i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_1_2b44e83c_faa2_436a_83e3_8461c508475b(ArrayList<Integer> arr, int n, int x) {
        // Write your solution here
        if(arr.isEmpty()){
            return True;
        }
        int count = 1;
        int temp = 0;
        for (int i = 0; i < arr.size(); i++) {
            if(arr.contains(x)){
                count++;
            }
        }
        if(arr.contains(x)){
            temp = (n*(n+1)/2);
            if(count/2 == temp){
                return True;
            }
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_78a880d5_0bdd_4706_8d67_b735ba3daf41(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int count = 0;
        while(i < arr.size()) {
            if(arr.get(i) == x) {
                count++;
                if(count > n/2) {
                    return True;
                }
            }
            i++;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_bac95519_e8c7_4adf_a499_b58b1213a06b(ArrayList<Integer> arr, int n, int x) {
        int counter = 0;
        for (Integer num : arr) {
            if (num == x) {
                counter++;
            }
            if (counter == n/2) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean isMajority_Problem_0_555044c7_649a_4710_b9fa_f68038614598(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int j = arr.size() - 1;
        while (i <= j) {
            if (arr.get(i) == x) {
                i++;
            } else if (arr.get(j) == x) {
                j--;
            } else if (arr.get(i) < x && arr.get(j) > x) {
                return True;
            } else {
                i++;
                j--;
            }
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_16a2fc9e_1728_48a6_90cf_705571ffe806(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int element : arr) {
            if (element == x) {
                count++;
            }
        }
        // majority element is n
        return count == n / 2;
    }

    
    public static boolean isMajority_Problem_1_c3b3fc78_81c2_4811_8929_ee3a4ea55b0a(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isMajority_Problem_3_b2c61814_d5fa_4620_9e8a_d02a71dfd4ee(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for(int i = 0; i < n; i++) {
            if(arr.get(i) == x) {
                count++;
            }
        }
        return count > n/2;
    }

    
    public static boolean isMajority_Problem_0_7fe75fa3_0d2f_41a2_8fa7_99c251b386d9(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_9e227f46_ad47_4468_98f7_7ce0b0529783(ArrayList<Integer> arr, int n, int x) {
        
        ArrayList<Integer> arr1 = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            if (arr.get(i) == x)
                arr1.add(x);
        }
        int count = 0;
        for(int i = 0; i < arr1.size(); i++) {
            if(arr1.get(i) == x)
                count++;
            
        }
        if(count > n/2)
            return True;
        return False;
    }

    
    public static boolean isMajority_Problem_3_e0b3f826_e1d2_4c9e_9de7_972bf361d376(ArrayList<Integer> arr, int n, int x) {
        int i = 0, count = 0;
        Integer currMax = arr.get(i);
        
        for (int j = 0; j < arr.size(); j++) {
            if (j > 0 && arr.get(j) == currMax) {
                count++;
            }
            if (count > n / 2) {
                return True;
            }
            currMax = arr.get(j);
        }
        return False;
    }

    
    public static boolean isMajority_Problem_1_54b18c3a_b13b_4ade_8c3e_37179dcf0bf9(ArrayList<Integer> arr, int n, int x) {
        boolean isMajority_Problem_1_54b18c3a_b13b_4ade_8c3e_37179dcf0bf9 = False;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr.get(i);
        }
        if (sum == n) {
            for (int i = 0; i < n; i++) {
                if (x == arr.get(i)) {
                    isMajority_Problem_1_54b18c3a_b13b_4ade_8c3e_37179dcf0bf9 = True;
                }
            }
        } else if (sum > n / 2) {
            isMajority_Problem_1_54b18c3a_b13b_4ade_8c3e_37179dcf0bf9 = True;
        }
        return isMajority_Problem_1_54b18c3a_b13b_4ade_8c3e_37179dcf0bf9;
    }

    
    public static boolean isMajority_Problem_0_7652b286_71a8_4597_bcb9_5fa7854d4d93(ArrayList<Integer> arr, int n, int x) {
        int count = 0, sum = 0;
        for (Integer elem : arr) {
            count += 1;
            sum += elem;
        }
        if (count > n/2) {
            return True;
        } else if (count == n/2 && sum > x) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isMajority_Problem_0_c3b3fc78_81c2_4811_8929_ee3a4ea55b0a(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isMajority_Problem_3_fcb145ed_2775_4d6e_b62a_8b9529edbe86(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_0_f5297add_0b98_4007_9e3f_c0de7a68c47b(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (Integer i : arr) {
            if (i == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isMajority_Problem_1_c3fb5b44_c29d_4eea_b4bd_83e9dbf0ebd2(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == x) {
                count++;
            }
        }
        if(count > n/2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_0_1bec7bf3_77fe_4bb1_a34a_91d455d4a1c7(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for(int i = 0; i < arr.size(); i++){
            if(arr.get(i) == x){
                count++;
            }
        }
        return count > n/2;
    }

    
    public static boolean isMajority_Problem_1_3eeacb4a_5f8c_4d65_bba9_8076e4f9f86b(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for(int i = 0; i < n; i++) {
            if(arr.get(i) == x) {
                count++;
            }
        }
        return count > n/2;
    }

    
    public static boolean isMajority_Problem_1_1615cd48_8c9f_4527_ac94_20117980b348(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        return count > n / 2;
    }

    
    public static boolean isMajority_Problem_2_8f5a5e2e_bf43_4b72_b3af_93750cda322f(ArrayList<Integer> arr, int n, int x) {
        int counter = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                counter++;
            }
        }
        if (counter > (n / 2)) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isMajority_Problem_3_b71db3ca_a6fd_4ee9_9d87_50ee5e29a104(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isMajority_Problem_0_f072387b_d65b_47d3_9b37_31f0ec633090(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        return count > n / 2;
    }

    
    public static boolean isMajority_Problem_0_af1dcde4_49cd_49eb_848e_ea94ae43eb62(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == x) {
                count++;
            }
        }
        if(count > n/2) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isMajority_Problem_3_e3126653_272d_48fe_abbf_57f5457f9ada(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for(int i = 0; i < n; i++) {
            if(arr.get(i) == x) {
                count++;
            }
            if(count > n/2) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean isMajority_Problem_2_fcb145ed_2775_4d6e_b62a_8b9529edbe86(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_0_41919845_9aae_49b0_9c36_4a449a7d4e2c(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for(Integer i: arr) {
            if(i == x) {
                count++;
            }
        }
        if(count > n/2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_1_70b84c62_2b90_4b9a_bbe3_06aec009c00c(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        return count > n / 2;
    }

    
    public static boolean isMajority_Problem_3_cb5c5652_067a_4771_bef7_f5e8954cdc1f(ArrayList<Integer> arr, int n, int x) {
        if (arr.isEmpty()) {
            return False;
        }
        ArrayList<Integer> sortedArr = new ArrayList<>();
        sortedArr.addAll(arr);
        Collections.sort(sortedArr);
        int highestCount = 0;
        for (int count : sortedArr) {
            if (count > highestCount) {
                highestCount = count;
            }
        }
        return highestCount == n / 2;
    }

    
    public static boolean isMajority_Problem_0_6c1fd1ac_5ba9_4fa3_8095_70d12ec0bcce(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for(int i = 0; i < n; i++) {
            if(arr.get(i) == x) {
                count++;
            }
        }
        if(count > n/2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_3_1615cd48_8c9f_4527_ac94_20117980b348(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        return count > n / 2;
    }

    
    public static boolean isMajority_Problem_0_bbeda048_7bc8_4477_b1de_37586cc2362e(ArrayList<Integer> arr, int n, int x) {
        int i = 0;
        int count = 0;
        while (i < arr.size()) {
            if (arr.get(i) == x) {
                count++;
                if (count >= n / 2) {
                    return True;
                }
            }
            i++;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_1_e0db0bc9_2196_446a_a9b3_576738742ee0(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        if (count > n / 2) {
            return True;
        }
        return False;
    }

    
    public static boolean isMajority_Problem_0_998b8dde_0e9d_40f5_a7d9_44dec07c05c9(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        return count > n / 2;
    }

    
    public static boolean isMajority_Problem_3_51eff934_a5c9_4467_b1ec_aa9ce193f59d(ArrayList<Integer> arr, int n, int x) {
        HashSet<Integer> set = new HashSet<>();
        boolean found = False;
        for (int i = 0; i < arr.size(); i++) {
            int y = arr.get(i);
            while (set.contains(y)) {
                set.remove(y);
                y = arr.get(i);
            }
            if (set.size() == n && y != x && y > n) {
                found = True;
                break;
            }
            if (!set.contains(y)) {
                set.add(x);
            }
        }
        return found;
    }

    
    public static boolean isMajority_Problem_1_1bec7bf3_77fe_4bb1_a34a_91d455d4a1c7(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for(int i = 0; i < arr.size(); i++){
            if(arr.get(i) == x){
                count++;
            }
        }
        return count > n/2;
    }

    
    public static boolean isMajority_Problem_0_94c7f65a_5e3f_43c5_acb8_a9d8a93b865d(ArrayList<Integer> arr, int n, int x) {
        int count=0;
        int mid=0;
        for(int i=0;i<arr.size()-1;i++){
            if(arr.get(i)==x){
                count++;
            }
            if(count>n/2){
                mid=i;
                break;
            }
        }
        if(count>n/2){
            return True;
        }
        else
        return False;
    }

    
    public static boolean isMajority_Problem_3_133b9592_dc11_4aaa_a96c_c08e5c6302da(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        return count > n / 2;
    }

    
    public static boolean isMajority_Problem_2_b3096296_6640_4aef_b3f6_66c4dc9d1226(ArrayList<Integer> arr, int n, int x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) == x) {
                count++;
            }
        }
        return count > n / 2;
    }

}
