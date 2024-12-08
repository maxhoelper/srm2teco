package mbpp_723_count_same_pair;

public class mbpp_723_count_same_pair {

    
    public static int countSamePair_Problem_1_58174803_9a78_4a9d_b40d_df5034120cc5(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        // Write your code here
        int num_of_pairs = 0;
        int min_value = Math.min(nums1.size(), nums2.size());
        for (int i = 0; i < min_value; ++i) {
            if (nums1.get(i) == nums2.get(i)) {
                ++num_of_pairs;
            }
        }
        return num_of_pairs;
    }

    
    public static int countSamePair_Problem_3_a898470b_633f_44f5_af5d_d5c7bf9f51f2(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int sum = 0;
        boolean same = True;

        for(int i=0; i<nums1.size(); i++) {
            if(nums1.get(i) != nums2.get(i)) {
                same = False;
            }
        }

        if(same) {
            for(int i=0; i<nums1.size(); i++) {
                sum += nums1.get(i);
            }
        }

        return sum;
    }

    
    public static int countSamePair_Problem_1_8cbe3509_41ae_466a_9ffa_774dae767432(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        if (nums1.size() != nums2.size())
            return -1;

        for (int i = 0; i < nums1.size(); i++) {
            if (nums1.get(i) == nums2.get(i))
                count++;
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_a3509190_ec94_45ba_abb8_217785409668(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        return nums1.stream()
                .flatMap(i -> nums2.stream())
                .distinct()
                .count();
    }

    
    public static int countSamePair_Problem_2_565265ac_2757_42b7_80ee_008fee46a715(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_09913ea5_edf4_4434_b010_2fc0f30df03f(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_2cb57b91_3b6d_4ac8_8ad9_77012e5e888b(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j))
                    count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_dcde38f4_8253_4681_8824_d87ce17fdfbd(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_ac81386a_6e3e_44a2_9fb1_4d17f84dba96(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        // your code here
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums1.size(); i++) {
            if (!set.add(nums1.get(i))) {
                return i;
            }
        }
        for (int i = 0; i < nums2.size(); i++) {
            if (!set.add(nums2.get(i))) {
                return i;
            }
        }
        return nums1.size();
    }

    
    public static int countSamePair_Problem_2_e39e1f85_12a4_4242_9305_2c0aa3808e2b(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int samePairs = 0;
        for (int i = 0; i < nums1.size(); i++) {
            int num1 = nums1.get(i);
            int num2 = nums2.get(i);
            if (num1 == num2) {
                samePairs++;
            }
        }
        return samePairs;
    }

    
    public static int countSamePair_Problem_3_c317d590_1a17_4610_ac0e_b1a28e49d333(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            if(nums1.get(i) == nums2.get(i)) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_1340862d_bf2f_4719_83aa_0c88030bef8a(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        for(int i = 0; i < nums1.size(); i++) {
            if(!map.containsKey(nums1.get(i))) {
                map.put(nums1.get(i), new ArrayList<>());
            }
            map.get(nums1.get(i)).add(nums2.get(i));
        }
        return map.entrySet().stream().filter(entry -> entry.getValue().size() > 1).count();
    }

    
    public static int countSamePair_Problem_3_d6ecc4bb_7829_433c_959e_43718107df4f(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            ArrayList<Integer> subNums1 = new ArrayList<>(nums1);
            subNums1.remove(i);
            for (int j = 0; j < nums2.size(); j++) {
                ArrayList<Integer> subNums2 = new ArrayList<>(nums2);
                subNums2.remove(j);
                if (subNums1.equals(subNums2)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_55213487_f399_4261_9f43_8069fe2ebc4f(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_b81da558_1ede_4eba_a820_b4cd8660dbfd(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int size = nums1.size();
        for(int i = 0; i < size; i++) {
            for(int j = i + 1; j < size; j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_558bde51_77d0_45ac_a57e_eaf373fb5ed7(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_44daf954_4ccf_4263_9a5b_6f71131df0ab(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int max1 = nums1.get(nums1.size() - 1);
        int max2 = nums2.get(nums2.size() - 1);
        int min1 = nums1.get(0);
        int min2 = nums2.get(0);
        int sum = 0;
        for (int i = 0; i < nums1.size(); i++) {
            if (nums1.get(i) == max1 && nums2.get(i) == max2) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_7f6090c8_440e_44d2_ae36_d8f6f0d39bab(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        // Write your code here
        int len = nums1.size();
        if(len == 0 || nums2.size() == 0 || len != nums2.size()){
            return 0;
        }
        int count = 0;
        for(int i = 0; i < len; i++){
            if(nums1.get(i) == nums2.get(i)){
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_0a16c86c_5411_4e77_b53d_87783eb6602e(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_ef0dadca_6887_4c93_aad0_78a459767131(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0; // count starts at zero
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_51c1afed_6695_4b19_8a28_160ac3b4b81b(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_33bc0201_15cc_4b31_9e96_12d86129ba85(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (Integer num1 : nums1){
            for (Integer num2 : nums2){
                if (num1 == num2){
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_2c5fea74_bad1_4f82_9eb5_7b337178f4e3(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int cnt = 0;
        for(int i = 0; i < nums1.size(); i++) {
            if(nums1.get(i) == nums2.get(i)) {
                cnt++;
            }
        }
        return cnt;
    }

    
    public static int countSamePair_Problem_3_3b1878c4_3d75_41d0_9773_2d5d4690c714(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_d7849fe2_69bb_43e9_83a9_7d2bb741dc3a(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int counter = 0;
        for(int i=0; i<nums1.size(); i++) {
            for(int j=i+1; j<nums1.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    counter++;
                    break;
                }
            }
        }
        return counter;
    }

    
    public static int countSamePair_Problem_3_32222bbf_e35a_4f40_8748_d1c2a7027178(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_9a433929_387e_4760_b126_c5f47904d1ab(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_44daf954_4ccf_4263_9a5b_6f71131df0ab(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int max1 = nums1.get(nums1.size() - 1);
        int max2 = nums2.get(nums2.size() - 1);
        int min1 = nums1.get(0);
        int min2 = nums2.get(0);
        int sum = 0;
        for (int i = 0; i < nums1.size(); i++) {
            if (nums1.get(i) == max1 && nums2.get(i) == max2) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_3704af7f_70d8_449f_a79c_00fa1379050d(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_aae1f94e_68f4_4db8_b399_464d9beb0275(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        // Write your code here
        int count = 0;
        for(int i : nums1){
            for(int j : nums2){
                if (i == j){
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_81bad13a_f668_471d_ac39_d5074ef13239(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        ArrayList<Integer> same = new ArrayList<Integer>();
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    same.add(nums1.get(i));
                }
            }
        }
        return same.size();
    }

    
    public static int countSamePair_Problem_1_277fbc1a_a6a2_435f_968f_957dbb952a2b(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); ++i) {
            if(nums1.get(i) == nums2.get(i))
                count++;
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_314ba713_988b_43ff_afe0_05e928642dc6(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        ArrayList<Integer> temp = nums1;
        ArrayList<Integer> temp2 = nums2;
        while(!temp.isEmpty() && !temp2.isEmpty()) {
            Integer l1 = temp.get(0);
            Integer l2 = temp2.get(0);
            if(l1 == l2) count++;
            temp.remove(0);
            temp2.remove(0);
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_76b24447_5f3d_4390_987f_b02379c96a02(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int size1 = nums1.size();
        int size2 = nums2.size();
        int count = 0;
        if (size1 > size2) return count;
        for (int i = 0; i < size1; i++) {
            boolean same = True;
            for (int j = 0; j < size2; j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    same = False;
                }
            }
            if (same) count++;
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_f2783087_0a83_4af2_b241_1bcc2d6827c1(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        Map<Integer, Integer> counts = new HashMap<>();
        for (int i = 0; i < nums1.size(); i++) {
            counts.put(nums1.get(i), counts.getOrDefault(nums1.get(i), 0L) + 1);
        }
        int ret = 0;
        for (int i = 0; i < nums2.size(); i++) {
            if (counts.get(nums2.get(i)) > 0) {
                ret += counts.get(nums2.get(i));
                counts.put(nums2.get(i), counts.getOrDefault(nums2.get(i), 0L) - 1);
            }
        }
        return ret;
    }

    
    public static int countSamePair_Problem_2_905a7640_6af0_41ea_811d_b2d8a0135f30(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int result = 0;
        if (nums1.size() != nums2.size()) return -1;
        int len = nums1.size();
        for(int i = 0; i < len; i++) {
            if (nums1.get(i) != nums2.get(i)) break;
            result++;
        }
        return result;
    }

    
    public static int countSamePair_Problem_3_ef0dadca_6887_4c93_aad0_78a459767131(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0; // count starts at zero
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_544a8313_1ae4_4ff0_af12_3fb217c4b143(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int N = nums1.size();
        int M = nums2.size();
        if (N == M) {
            int ans = 0;
            int num1 = 0;
            for (int i = 0; i < N; i++) {
                num1 = nums1.get(i);
                int num2 = nums2.get(i);
                if (num1 == num2) {
                    ans++;
                }
            }
            return ans;
        }
        return -1;
    }

    
    public static int countSamePair_Problem_0_e7c674b3_050a_40ae_ae75_719a21d3bf90(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            int key = nums1.get(i);
            if (map.containsKey(key)) {
                count += map.get(key);
            }
            map.put(nums1.get(i), i);
        }
        for(int i = 0; i < nums2.size(); i++) {
            int key = nums2.get(i);
            if (map.containsKey(key)) {
                count += map.get(key);
            }
            map.put(nums2.get(i), i);
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_1d12c3a4_f313_4891_8553_646171188c92(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_f2783087_0a83_4af2_b241_1bcc2d6827c1(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        Map<Integer, Integer> counts = new HashMap<>();
        for (int i = 0; i < nums1.size(); i++) {
            counts.put(nums1.get(i), counts.getOrDefault(nums1.get(i), 0L) + 1);
        }
        int ret = 0;
        for (int i = 0; i < nums2.size(); i++) {
            if (counts.get(nums2.get(i)) > 0) {
                ret += counts.get(nums2.get(i));
                counts.put(nums2.get(i), counts.getOrDefault(nums2.get(i), 0L) - 1);
            }
        }
        return ret;
    }

    
    public static int countSamePair_Problem_2_a239dfd0_ca57_4f18_86b5_dfac4605f0e7(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        // Write your code here
        return 0;
    }

    
    public static int countSamePair_Problem_2_a1f7fc6e_c623_4dc9_a8a0_679c6b991ba5(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i).equals(nums2.get(j))) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_a8b6955a_9e11_4fd0_aaa9_ceb5e027bf3b(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_e603d3b6_276e_4422_8f03_4d20cd4970ff(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int size = nums1.size();
        HashMap<Integer, Integer> count = new HashMap<>();
        count.put(nums2.get(0), 0);
        for (int i = 0; i < size; i++) {
            if (nums1.get(i) == nums2.get(0)) {
                count.put(nums2.get(0), count.get(nums2.get(0)) + 1);
            }
        }
        return count.entrySet().stream().filter(e -> e.getValue() > 1).count();
    }

    
    public static int countSamePair_Problem_0_94f16011_c7db_42dc_a2c7_523d4ee4cb14(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int result = 0;
        for (int i = 0; i < nums1.size(); i++) {
            if (nums1.get(i) == nums2.get(i)) {
                result++;
            }
        }
        return result;
    }

    
    public static int countSamePair_Problem_2_0a16c86c_5411_4e77_b53d_87783eb6602e(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_beb2ee9f_fbd9_44cf_913f_37ad292693b9(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_23da1225_f0f2_4d93_a660_bf0e93df3095(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int result = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        if (nums1.size() != nums2.size()) {
            return 0;
        } else {
            int i = 0;
            int j = 0;
            while (i<nums1.size() && j<nums2.size()) {
                int num1 = nums1.get(i);
                int num2 = nums2.get(j);
                if (num1 == num2) {
                    i++;
                    j++;
                    result++;
                }
                if (num1 > num2) {
                    max = num2;
                } else {
                    min = num2;
                }
                if (max == min) {
                    break;
                }
                i++;
                j++;
            }
            if (i >= nums1.size()) {
                return result;
            } else {
                return 0;
            }
        }
    }

    
    public static int countSamePair_Problem_1_f4f5166c_86a9_427b_97b8_5c858ef118d0(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        // Write your code here
        int count = 0;
        for(int i = 0; i < nums1.size(); ++i) {
            for(int j = 0; j < nums2.size(); ++j) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_1fe54bc4_d4c6_42d9_a7c0_c0d412de09f0(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int sameValue = 0;
        for(int i = 0; i < nums1.size(); i++) {
            sameValue = nums1.get(i);
            for(int j = 0; j < nums2.size(); j++) {
                if(sameValue == nums2.get(j)) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_3b1878c4_3d75_41d0_9773_2d5d4690c714(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_3704af7f_70d8_449f_a79c_00fa1379050d(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_34b6b30d_6af5_4647_b84b_c26931671d7f(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int num1 = nums1.get(0);
        int num2 = nums2.get(0);
        int num3 = nums1.get(1);
        int num4 = nums2.get(1);
        if (num1 == num2 && num2 == num3) {
            count++;
        }
        if (num1 == num2 && num2 == num4) {
            count++;
        }
        if (num1 == num3 && num2 == num4) {
            count++;
        }
        if (num1 == num3 && num2 == num1) {
            count++;
        }
        if (num1 == num4 && num2 == num1) {
            count++;
        }
        if (num1 == num4 && num2 == num3) {
            count++;
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_c8c4f814_a289_425a_bcf3_06940de354e7(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int res = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(Integer l : nums1) {
            map.put(l, nums1.indexOf(l));
        }
        for(Integer l : nums2) {
            res += (map.get(l) == nums2.indexOf(l) ? 1 : 0);
        }
        return res;
    }

    
    public static int countSamePair_Problem_2_5d29c9c7_8006_46d0_8b5e_e6f92d84d685(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (Integer num1 : nums1) {
            for (Integer num2 : nums2) {
                if (num1 == num2) {
                    count += 1;
                    break;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_479a865f_d290_45fd_bc62_427f84d45bce(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        HashSet<Integer> set = new HashSet<>();
        for (Integer num : nums1) set.add(num);
        for (Integer num : nums2) set.add(num);
        return set.stream().filter(i -> {
            return nums1.contains(i) && nums2.contains(i);
        }).count();
    }

    
    public static int countSamePair_Problem_0_6efdd30d_c8d5_4853_9d4d_fc49dda9e43d(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        Integer[] arr = new Integer[nums1.size()];
        nums1.toArray(arr);
        int ind = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_982e0bcc_756f_4d03_a6b5_a431c6eda9d1(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_1fe54bc4_d4c6_42d9_a7c0_c0d412de09f0(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int sameValue = 0;
        for(int i = 0; i < nums1.size(); i++) {
            sameValue = nums1.get(i);
            for(int j = 0; j < nums2.size(); j++) {
                if(sameValue == nums2.get(j)) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_999b16ec_1fad_4f53_a1af_9d01e79376bf(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_314ba713_988b_43ff_afe0_05e928642dc6(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        ArrayList<Integer> temp = nums1;
        ArrayList<Integer> temp2 = nums2;
        while(!temp.isEmpty() && !temp2.isEmpty()) {
            Integer l1 = temp.get(0);
            Integer l2 = temp2.get(0);
            if(l1 == l2) count++;
            temp.remove(0);
            temp2.remove(0);
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_24728fb2_9536_4f8d_8c65_69512c828074(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_6282a880_b632_4a44_b4a5_fc1f2f9b7d50(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int max1 = nums1.get(nums1.size() - 1);
        int max2 = nums2.get(nums2.size() - 1);
        int min1 = nums1.get(0);
        int min2 = nums2.get(0);
        int mid1 = max1 + (max2 - min1) / 2;
        int mid2 = max2 + (max1 - min2) / 2;
        int diff1 = mid1 - min1;
        int diff2 = mid2 - min2;
        int diff3 = max1 - max2;
        if (diff1 < diff2 && diff1 < diff3) {
            count = count + 1;
        }
        if (diff2 < diff1 && diff2 < diff3) {
            count = count + 1;
        }
        if (diff3 < diff1 && diff3 < diff2) {
            count = count + 1;
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_f8864eae_26c3_476c_aa98_8aee6889dd03(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int max1 = nums1.get(0);
        int max2 = nums2.get(0);
        int min1 = nums1.get(nums1.size()-1);
        int min2 = nums2.get(nums2.size()-1);
        for(int i = 0; i < nums1.size(); i++) {
            if(nums1.get(i) == max1 && nums2.get(i) == max2) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_57990b01_82a1_4ef9_9a68_36b16a84e62d(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_7f9b13f0_bf5c_43c4_844f_03724ca58b7c(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int countSame = 0;
        for (int i = 0; i < nums1.size(); i++) {
            int l1 = nums1.get(i);
            int l2 = nums2.get(i);
            if (l1 == l2) countSame++;
        }
        return countSame;
    }

    
    public static int countSamePair_Problem_0_5a331477_a72f_40ef_b562_513c52c79455(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int res = 0;
        if (nums1.size() != nums2.size()) {
            return res;
        }
        for (int i = 0; i < nums1.size(); i++) {
            if (nums1.get(i) == nums2.get(i)) {
                res++;
            }
        }
        return res;
    }

    
    public static int countSamePair_Problem_1_c202f24c_2198_41db_8099_24b00e4bdd17(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int max1 = nums1.get(nums1.size()-1);
        int max2 = nums2.get(nums2.size()-1);
        int min1 = nums1.get(0);
        int min2 = nums2.get(0);
        int maxDiff = max1 - max2;
        int minDiff = min1 - min2;
        int diff;
        for(int i = 0; i < nums1.size(); i++) {
            diff = nums1.get(i) - nums2.get(i);
            if(diff == maxDiff) {
                count++;
            }
            if(diff == minDiff) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_f77175f5_da6f_4fea_af08_b837a8d3efb8(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_9dc1c3c6_3420_45aa_9602_bb5547228cf3(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int sum = 0;
        for(int i = 0; i < nums1.size(); i++) {
            sum += nums1.get(i);
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_637450f5_0515_4fcd_8ddb_5c3a4ca5ac96(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int max1 = nums1.get(nums1.size() - 1);
        int max2 = nums2.get(nums2.size() - 1);
        int min1 = nums1.get(0);
        int min2 = nums2.get(0);
        int maxDiff = max1 - max2;
        int minDiff = min1 - min2;
        if (maxDiff != minDiff) {
            count = maxDiff + minDiff;
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_4571681c_69ee_4702_a0b6_d0169eb768ea(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        
        for(int i = 0; i < nums1.size(); i++) {
            if(nums1.get(i) == nums2.get(i)) {
                count++;
            }
        }
        
        return count;
    }

    
    public static int countSamePair_Problem_1_6f21b78d_5877_4098_aec0_6a510b9c8dd1(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        if(nums1.size() != nums2.size()) return count;
        for(int i = 0; i < nums1.size(); i++) {
            if(nums1.get(i) == nums2.get(i)) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_55213487_f399_4261_9f43_8069fe2ebc4f(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_1340862d_bf2f_4719_83aa_0c88030bef8a(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        for(int i = 0; i < nums1.size(); i++) {
            if(!map.containsKey(nums1.get(i))) {
                map.put(nums1.get(i), new ArrayList<>());
            }
            map.get(nums1.get(i)).add(nums2.get(i));
        }
        return map.entrySet().stream().filter(entry -> entry.getValue().size() > 1).count();
    }

    
    public static int countSamePair_Problem_3_d491774b_37f9_4692_a199_fab4706bd23a(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        HashSet<Integer> set1 = new HashSet<>(nums1);
        HashSet<Integer> set2 = new HashSet<>(nums2);
        for(Integer i : set1){
            if(set2.contains(i)){
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_da135745_a753_4779_9bb5_850c739be176(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int sum = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = i + 1; j < nums1.size(); j++) {
                if (nums1.get(i).equals(nums1.get(j))) {
                    sum++;
                }
            }
        }
        for (int i = 0; i < nums2.size(); i++) {
            for (int j = i + 1; j < nums2.size(); j++) {
                if (nums2.get(i).equals(nums2.get(j))) {
                    sum++;
                }
            }
        }
        return sum;
    }

    
    public static int countSamePair_Problem_3_3f03b48b_ed42_4e73_a495_b3fc4fe6715b(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_94f16011_c7db_42dc_a2c7_523d4ee4cb14(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int result = 0;
        for (int i = 0; i < nums1.size(); i++) {
            if (nums1.get(i) == nums2.get(i)) {
                result++;
            }
        }
        return result;
    }

    
    public static int countSamePair_Problem_0_eb179196_f4ba_469a_b1bb_cbb42f19f6af(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_937b1a26_e17e_4ada_b85d_9949f3348897(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            if (nums1.get(i) == nums2.get(i)) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_3a59db8f_2737_498d_8473_f083db2ec182(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            if (nums1.get(i) == nums2.get(i)) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_473773fd_f173_40b8_8ce0_83c8e8983525(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int samePairs = 0;
        int sameValuesIndexes = 0;
        int j = 0;

        for(int i=0; i<nums1.size() && j<nums2.size(); i++) {
            int val1 = nums1.get(i);
            int val2 = nums2.get(j);

            if(val1 == val2) {
                samePairs++;
                sameValuesIndexes++;
            }
            j++;
        }

        return sameValuesIndexes;
    }

    
    public static int countSamePair_Problem_3_ffdbe437_2ebb_4c92_b9a5_f10c54a0a999(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        // Write your answer here
        int sum = 0;
        for( int i = 0; i < nums1.size(); i++){
            int j = 0;
            for( ; j < nums2.size(); j++){
                if( nums1.get(i) == nums2.get(j) ) sum += 1;
            }
        }
        return sum;
    }

    
    public static int countSamePair_Problem_0_ffdbe437_2ebb_4c92_b9a5_f10c54a0a999(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        // Write your answer here
        int sum = 0;
        for( int i = 0; i < nums1.size(); i++){
            int j = 0;
            for( ; j < nums2.size(); j++){
                if( nums1.get(i) == nums2.get(j) ) sum += 1;
            }
        }
        return sum;
    }

    
    public static int countSamePair_Problem_3_c0fcaf5e_10e0_4130_bedf_c62c09ffeb35(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        // Write your code here
        return 0;
    }

    
    public static int countSamePair_Problem_2_ffff3c5f_e933_4f20_be11_209288c5f78e(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        // Complete this function
        int count = 0;
        for(int i = 0; i < nums1.size(); i++){
            for(int j = 0; j < nums2.size(); j++){
                if(nums1.get(i) == nums2.get(j)){
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_0c8d4fd0_5a0a_43b2_a21b_acc7821941cf(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for(int j = i+1; j < nums1.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_ce155c18_c410_4df0_a13b_c70f9c64c3f2(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int l1 = nums1.size();
        int l2 = nums2.size();
        for(int i = 0; i < l1; i++) {
            if(nums1.get(i).equals(nums2.get(i))) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_7f531113_b04c_4d58_8d9c_25b9b5ad5864(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int max1 = nums1.get(nums1.size() - 1);
        int max2 = nums2.get(nums2.size() - 1);
        int min1 = nums1.get(0);
        int min2 = nums2.get(0);
        int maxDiff = max1 - max2;
        int minDiff = min1 - min2;
        if (maxDiff != minDiff) {
            count = maxDiff - minDiff;
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_2a5a23a1_c9d0_4a8b_85b6_3f8c91171f75(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_5e0a4ab7_0492_4f23_8f91_186b6eea718e(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        // Write your code here
        
        int count = 0;
        
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        
        for(int i = 0; i < nums1.size(); i++) {
            set1.add(nums1.get(i));
            set2.add(nums2.get(i));
        }
        
        Iterator<Integer> it1 = set1.iterator();
        Iterator<Integer> it2 = set2.iterator();
        
        while(it1.hasNext()) {
            if(it2.hasNext()) {
                if(it1.next() == it2.next()) {
                    count++;
                    it2.next();
                }
            }
        }
        
        return count;
    }

    
    public static int countSamePair_Problem_1_c317d590_1a17_4610_ac0e_b1a28e49d333(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            if(nums1.get(i) == nums2.get(i)) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_5b22ffee_ad6d_4584_b9a7_5a3144cc89ae(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        // Loop over the 2 arrays
        for (int num1 : nums1) {
            for (int num2 : nums2) {
                // Compare the 2 numbers 
                if (num1 == num2) {
                    // Increment the count
                    count++;
                }
            }
        }
        // Return the count variable
        return count;
    }

    
    public static int countSamePair_Problem_2_95b7d394_0c52_4702_8a42_bb12ac06ea39(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        // Iterate through the two lists simultaneously
        for (int element : nums1) {
            for (int element2 : nums2) {
                // If the elements of the two lists are equal
                if (element == element2) {
                    // Increment the count
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_ac84da5a_aacd_4f5b_b570_af8f5134ce8e(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        // Write your code here
        int count = 0;
        for(Integer a:nums1){
            for(Integer b:nums2){
                if(a==b){
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_5bf0cdb8_a374_427d_baa7_acf00dca8297(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        // write your code here
        int retval = 0;
        for (int i = 0; i < nums1.size(); i++) {
            int val1 = nums1.get(i);
            for (int j = 0; j < nums2.size(); j++) {
                int val2 = nums2.get(j);
                if (val1 == val2) {
                    retval++;
                    break;
                }
            }
        }
        return retval;
    }

    
    public static int countSamePair_Problem_3_c1db34cd_8f4c_4693_b81b_730c2e6d0e47(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_c56ef4bc_323d_4f57_a5a7_51d97319e6c0(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int ret = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    ret++;
                }
            }
        }
        return ret;
    }

    
    public static int countSamePair_Problem_1_66e38f38_b7a3_4ad5_a33a_f0c4fcfd13e3(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int max1 = nums1.get(nums1.size() - 1);
        int max2 = nums2.get(nums2.size() - 1);
        int min1 = nums1.get(0);
        int min2 = nums2.get(0);
        int maxDiff = max1 - max2;
        int minDiff = min1 - min2;
        if (maxDiff > minDiff) {
            count = maxDiff - minDiff;
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_df749f94_0be4_4cb8_9a55_84d6bf273cbb(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0L;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_8d3ff3dc_dea1_427f_b44e_c588aed19220(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_6dead7d2_d6a5_49d5_ab6e_8047bbf344c8(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int result = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    result++;
                }
            }
        }
        return result;
    }

    
    public static int countSamePair_Problem_0_17e1b432_2443_4e71_85ce_d7aed4b89573(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        return 0;
    }

    
    public static int countSamePair_Problem_2_21999e3b_66ab_4f44_bbed_e57971017e38(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        ArrayList<Integer> countList = new ArrayList<Integer>();
        int count = 0;
        for (Integer num : nums1) {
            if (nums2.contains(num)) {
                countList.add(num);
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_d6ecc4bb_7829_433c_959e_43718107df4f(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            ArrayList<Integer> subNums1 = new ArrayList<>(nums1);
            subNums1.remove(i);
            for (int j = 0; j < nums2.size(); j++) {
                ArrayList<Integer> subNums2 = new ArrayList<>(nums2);
                subNums2.remove(j);
                if (subNums1.equals(subNums2)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_aee8664f_17dc_4ee0_8c25_14d1a25af456(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_7876cb98_abdd_4355_aceb_59a77b44f0c2(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            Integer value = nums1.get(i);
            if(nums2.contains(value)) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_45dcca7f_e6ef_4729_bf47_7cc84d37c524(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        // write your code here
        int result = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    result++;
                }
            }
        }
        return result;
    }

    
    public static int countSamePair_Problem_0_21999e3b_66ab_4f44_bbed_e57971017e38(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        ArrayList<Integer> countList = new ArrayList<Integer>();
        int count = 0;
        for (Integer num : nums1) {
            if (nums2.contains(num)) {
                countList.add(num);
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_1569b77f_02e4_4cd0_a7e2_1fdbd659a6de(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        // This first list will be used to track which positions in nums1 are used.
        ArrayList<Integer> used1 = new ArrayList<>();
        // This second list will be used to track which positions in nums2 are used.
        ArrayList<Integer> used2 = new ArrayList<>();

        int pairs = 0;

        for (int i = 0; i < nums1.size(); i++) {
            // If nums1[i] is in used2, then it is not possible that nums2[i] is in used1 as well. Hence, nums1[i] and nums2[i] cannot be in the same pair.
            if (used2.contains(nums2.get(i))) {
                pairs += 1;
                continue;
            }

            // If nums1[i] is not in used1, then we can use nums1[i]. nums2[i] can still be in used2 as well, so it is not possible that nums1[i] and nums2[i] have the same value.
            if (used1.contains(nums1.get(i))) {
                continue;
            }

            // nums1[i] is in used1 and nums2[i] is in used2. So now we have to see if nums1[i] and nums2[i] have the same value. That is, nums1[i] == nums2[i]. Do this by comparing each element in the lists.
            for (int j = 0; j < nums2.size(); j++) {
                // If the values match, then we have found a match.
                if (nums1.get(i) == nums2.get(j)) {
                    // Remember which positions we have seen nums1[i] and nums2[i]
                    used1.add(i);
                    used2.add(j);

                    // We have found a pair. Increment the total number of pairs found.
                    pairs += 1;
                    break;
                }
            }
        }

        return pairs;
    }

    
    public static int countSamePair_Problem_1_331ccb65_de0d_4f53_badd_e2c53f8b5da1(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        // Note: The returned count should be a 32-bit unsigned integer.
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_989648b6_6966_4e71_8fdf_7581a43338b1(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int minValue = Math.min(nums1.get(0), nums2.get(0));
        int maxValue = Math.max(nums1.get(nums1.size()-1), nums2.get(nums2.size()-1));
        for (int value = minValue; value <= maxValue; value++) {
            if (nums1.contains(value) && nums2.contains(value)) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_73be3163_2f21_490d_ab48_7eb38efb2349(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        // Write your code here
        int count = 0;
        for(int i=0;i<nums1.size();i++) {
            int i1 = nums1.get(i);
            int i2 = nums2.get(i);
            if(i1 == i2) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_d8bbd3c6_ed9c_40a5_8cdc_fcda60abf02c(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_14201f96_86a1_4c43_b3c1_34a14ba14388(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_e3668522_7441_456e_8153_198e775abcb1(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int result = 0L;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    result++;
                }
            }
        }
        return result;
    }

    
    public static int countSamePair_Problem_3_147d9870_e1a2_46fe_ae1e_400eaa80cf2b(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_66e38f38_b7a3_4ad5_a33a_f0c4fcfd13e3(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int max1 = nums1.get(nums1.size() - 1);
        int max2 = nums2.get(nums2.size() - 1);
        int min1 = nums1.get(0);
        int min2 = nums2.get(0);
        int maxDiff = max1 - max2;
        int minDiff = min1 - min2;
        if (maxDiff > minDiff) {
            count = maxDiff - minDiff;
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_c6e46a25_f51f_4d7f_8d6a_3d60c45393dd(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_4571681c_69ee_4702_a0b6_d0169eb768ea(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        
        for(int i = 0; i < nums1.size(); i++) {
            if(nums1.get(i) == nums2.get(i)) {
                count++;
            }
        }
        
        return count;
    }

    
    public static int countSamePair_Problem_2_9dc1c3c6_3420_45aa_9602_bb5547228cf3(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int sum = 0;
        for(int i = 0; i < nums1.size(); i++) {
            sum += nums1.get(i);
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_966e43c1_6a2b_4b85_ab67_071ed34bf323(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        // The number of pairs of indices where the arrays have a pairwise equal value should be the sum of the sizes of those arrays.
        int sum = 0;
        // A pair is defined as an index pair in either of the two arrays. 
        int[] indices = new int[2];
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                // The indices are defined as the two indices where the corresponding values match.
                if (nums1.get(i) == nums2.get(j)) {
                    indices[0] = i;
                    indices[1] = j;
                    sum = nums1.size() * nums2.size();
                }
            }
        }
        return sum;
    }

    
    public static int countSamePair_Problem_0_e8f9ec08_66ed_4eaa_b1b8_c5b4a5737120(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_beb2ee9f_fbd9_44cf_913f_37ad292693b9(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_ffff3c5f_e933_4f20_be11_209288c5f78e(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        // Complete this function
        int count = 0;
        for(int i = 0; i < nums1.size(); i++){
            for(int j = 0; j < nums2.size(); j++){
                if(nums1.get(i) == nums2.get(j)){
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_b6a5f03a_74fb_481a_84cb_3a9e5ce76001(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        // Write your code here
        int numsSize = nums1.size();
        int nums2Size = nums2.size();
        int count = 0;
        int index = 0;
        if (numsSize < nums2Size) {
            while (index != numsSize - 1) {
                if (nums1.get(index) == nums2.get(index)) {
                    count++;
                    index++;
                } else if (nums2.get(index) == nums1.get(index)) {
                    count++;
                    index++;
                } else {
                    index++;
                }
            }
            return count;
        } else if (numsSize > nums2Size) {
            while (index != nums2Size - 1) {
                if (nums2.get(index) == nums1.get(index)) {
                    count++;
                    index++;
                } else if (nums1.get(index) == nums2.get(index)) {
                    count++;
                    index++;
                } else {
                    index++;
                }
            }
            return count;
        } else {
            return numsSize;
        }

    }

    
    public static int countSamePair_Problem_3_1ac70470_7fc1_4b62_984d_7ed55608e5f4(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int len = nums1.size();
        int sum = 0;
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    sum++;
                }
            }
        }
        return sum;
    }

    
    public static int countSamePair_Problem_2_34b6b30d_6af5_4647_b84b_c26931671d7f(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int num1 = nums1.get(0);
        int num2 = nums2.get(0);
        int num3 = nums1.get(1);
        int num4 = nums2.get(1);
        if (num1 == num2 && num2 == num3) {
            count++;
        }
        if (num1 == num2 && num2 == num4) {
            count++;
        }
        if (num1 == num3 && num2 == num4) {
            count++;
        }
        if (num1 == num3 && num2 == num1) {
            count++;
        }
        if (num1 == num4 && num2 == num1) {
            count++;
        }
        if (num1 == num4 && num2 == num3) {
            count++;
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_bc9c8dba_6a3b_44c1_bf7b_c0d98f4b9e26(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            if (nums1.get(i) == nums2.get(i)) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_5fa715c6_babf_4212_890f_1325619db372(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        // Write your code here
        int size = Math.min(nums1.size(), nums2.size());
        int same = 0;
        for (int i=0; i<size; i++) {
            if (nums1.get(i) == nums2.get(i))
                same++;
        }
        return same;
    }

    
    public static int countSamePair_Problem_1_105c3c5c_51da_41de_b076_fa175c98800a(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int sum = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                    sum += i;
                }
            }
        }
        return sum;
    }

    
    public static int countSamePair_Problem_0_00a8dbc6_dc64_4752_b634_f9d5da7cbd04(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        // Write your code here
        if(nums1.size() != nums2.size())
            throw new IllegalArgumentException();
        Integer[] array1 = nums1.toArray(new Integer[nums1.size()]);
        Integer[] array2 = nums2.toArray(new Integer[nums2.size()]);
        int result = 0;
        for(int i = 0; i < array1.length; ++i){
            if(array1[i] == array2[i])
                result += i;
        }
        return result;
    }

    
    public static int countSamePair_Problem_2_bf0e1ed6_f563_45c4_aa5e_9fc5c43e175d(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_9241711d_c7a6_4983_9af1_b5654ff0d370(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int max1 = nums1.get(nums1.size()-1);
        int max2 = nums2.get(nums2.size()-1);
        for(int i = 0; i < nums1.size(); i++) {
            int num1 = nums1.get(i);
            int num2 = nums2.get(i);
            if(num1 == num2) {
                count++;
            }
            if(num1 > max1 && num2 > max2) {
                max1 = num1;
                max2 = num2;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_2a5a23a1_c9d0_4a8b_85b6_3f8c91171f75(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_e9d62336_4745_4d14_b2fc_140bfd9a518e(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        
        if (nums1 == null || nums2 == null || nums1.size() != nums2.size()) {
            return count;
        }
        
        for (int i = 0; i < nums1.size(); i++) {
            if (nums1.get(i) == nums2.get(i)) {
                count++;
            }
        }
        
        return count;
    }

    
    public static int countSamePair_Problem_0_9576786b_5b18_4d6e_93e3_dfe598464a88(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            if (nums1.get(i) == nums2.get(i)) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_11d223a1_681c_4d9b_a673_853a7ee689ac(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i=0; i<nums1.size(); i++) {
            if (nums1.get(i) == nums2.get(i)) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_6187a30e_7257_4115_9966_192db6e24618(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_f53bdc11_ab49_4324_a56c_322807689442(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int numSame = 0;

        // Sort the two lists so we can compare them
        ArrayList<Integer> numsList = nums2;
        Collections.sort(numsList);

        for(int i=0; i<nums2.size(); i++) {
            int index = Collections.binarySearch(numsList, nums2.get(i));
            if (index >= 0) {
                numSame += 1;
                numsList.remove(i);
            }
        }

        return numSame;
    }

    
    public static int countSamePair_Problem_0_a03fda5f_08ca_431b_897a_0277b4d77823(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        boolean same = False;
        for(int num1 : nums1)
        {
            for(int num2 : nums2)
            {
                same = num1 == num2;
                if (same)
                {
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_999b16ec_1fad_4f53_a1af_9d01e79376bf(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_809e9efe_6ae4_44e9_81f1_2ea11bfb5fd1(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        if (nums1.size() != nums2.size()) return 0;
        
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            if (nums1.get(i) == nums2.get(i)) count++;
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_53795a48_407d_4c02_91b8_cae9e5318a3b(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_95b7d394_0c52_4702_8a42_bb12ac06ea39(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        // Iterate through the two lists simultaneously
        for (int element : nums1) {
            for (int element2 : nums2) {
                // If the elements of the two lists are equal
                if (element == element2) {
                    // Increment the count
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_b16a6b3d_a865_40a7_a32e_8da68913f22e(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        // Iterate over the first list and look for same values as in the second list
        for (int i = 0; i < nums1.size(); i++) {
            if (nums1.get(i) == nums2.get(i)) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_bdb69997_a2bb_49e4_b5cf_be49d2037eb4(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_5d956aa5_1f87_497e_bdcc_d2cbbd70732a(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int i = 0, j = 0;
        int count = 0;
        for(; i < nums1.size() && j < nums2.size(); i++) {
            if(nums1.get(i) == nums2.get(j)) {
                count++;
                j++;
            } else {
                j = 0;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_e7c674b3_050a_40ae_ae75_719a21d3bf90(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            int key = nums1.get(i);
            if (map.containsKey(key)) {
                count += map.get(key);
            }
            map.put(nums1.get(i), i);
        }
        for(int i = 0; i < nums2.size(); i++) {
            int key = nums2.get(i);
            if (map.containsKey(key)) {
                count += map.get(key);
            }
            map.put(nums2.get(i), i);
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_24728fb2_9536_4f8d_8c65_69512c828074(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_d989b7a6_98d8_4b4b_8f3c_d26f74205fbf(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int cnt = 0;
        for(int i = 0; i < nums1.size(); i++) {
            if(nums1.get(i).equals(nums2.get(i)))
                cnt++;
        }
        return cnt;
    }

    
    public static int countSamePair_Problem_2_dcde38f4_8253_4681_8824_d87ce17fdfbd(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_31e4e8f3_abee_4a30_bf77_47bced40904b(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            int first = nums1.get(i);
            int second = nums2.get(i);
            if (first == second) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_3ad5c9ee_1455_4ca5_a524_6f1f4c83a177(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int max1 = nums1.get(nums1.size() - 1);
        int max2 = nums2.get(nums2.size() - 1);
        int min1 = nums1.get(0);
        int min2 = nums2.get(0);
        int sum1 = 0, sum2 = 0;
        for (int i = 0; i < nums1.size(); i++) {
            sum1 += nums1.get(i);
        }
        for (int i = 0; i < nums2.size(); i++) {
            sum2 += nums2.get(i);
        }
        if (sum1 == sum2) {
            for (int i = 0; i < nums1.size(); i++) {
                if (nums1.get(i) == max1 && nums2.get(i) == max2) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_52074eea_4137_4169_9d7f_6970549321ad(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int max1 = nums1.get(nums1.size() - 1);
        int max2 = nums2.get(nums2.size() - 1);
        int min1 = nums1.get(0);
        int min2 = nums2.get(0);
        int maxDiff = max1 - max2;
        int minDiff = min1 - min2;
        if (maxDiff > minDiff) {
            count = maxDiff - minDiff;
        } else {
            count = minDiff - maxDiff;
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_84f6b94a_1cb6_4b04_be70_484f950048bb(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        Map<Integer, Integer> counts = new HashMap<>();
        counts.put(0L, 0L);
        for (int i = 0; i < nums1.size(); i++) {
            counts.put(nums1.get(i), counts.getOrDefault(nums1.get(i), 0L) + 1);
        }
        int count = 0L;
        for (int i = 0; i < nums2.size(); i++) {
            if (counts.containsKey(nums2.get(i))) {
                count += counts.get(nums2.get(i));
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_4570dc50_8b8e_4451_8170_d719078e6462(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = i + 1; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_ece4ad83_be97_4d76_9b67_8d57da2c9db5(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int max1 = nums1.get(nums1.size() - 1);
        int max2 = nums2.get(nums2.size() - 1);
        int min1 = nums1.get(0);
        int min2 = nums2.get(0);
        int maxDiff = max1 - max2;
        int minDiff = min1 - min2;
        if (maxDiff == minDiff) {
            count++;
        }
        for (int i = 0; i < nums1.size(); i++) {
            int num1 = nums1.get(i);
            int num2 = nums2.get(i);
            int diff = num1 - num2;
            if (maxDiff == minDiff) {
                count++;
            }
            if (diff == maxDiff) {
                count++;
            }
            if (diff == minDiff) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_f6b1b66a_d134_461b_9e1d_09b9dea0b2e1(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0L;
        for (int x : nums1) {
            boolean found = False;
            for (int y : nums2) {
                if (x == y) {
                    found = True;
                    break;
                }
            }
            if (found)
                count++;
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_6e902d9f_c34a_451b_836e_59aa8bca3b57(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int sum = 0;
        int max1 = nums1.stream().max(Integer::compareTo).get();
        int max2 = nums2.stream().max(Integer::compareTo).get();
        int min1 = nums1.stream().min(Integer::compareTo).get();
        int min2 = nums2.stream().min(Integer::compareTo).get();
        int maxDiff = max1 - max2;
        int minDiff = min1 - min2;
        if (maxDiff != minDiff) {
            count = maxDiff - minDiff;
        }
        int maxSum = nums1.stream().reduce(Integer::sum).get();
        int minSum = nums2.stream().reduce(Integer::sum).get();
        int sumDiff = maxSum - minSum;
        if (sumDiff != 0) {
            count = sumDiff;
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_5ffb90aa_255d_4b33_95d3_c631711138d0(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            if(nums1.get(i) == nums2.get(i)) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_30e02e26_9ea8_4a5e_ba1f_49ed4674583c(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int len1 = nums1.size();
        int len2 = nums2.size();
        for(int i = 0; i < len1; i++) {
            for(int j = 0; j < len2; j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_960599d8_a9dc_49c9_860c_9b50400ba3e9(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i=0;i<nums1.size();i++) {
            if (nums1.get(i)==nums2.get(i)) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_a03fda5f_08ca_431b_897a_0277b4d77823(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        boolean same = False;
        for(int num1 : nums1)
        {
            for(int num2 : nums2)
            {
                same = num1 == num2;
                if (same)
                {
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_500155ab_f771_4740_8474_f96d3ca17f8e(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int samePair=0;
        for(int i=0;i<nums1.size();i++) {
            for(int j=0;j<nums2.size();j++) {
                if(nums1.get(i)==nums2.get(j)) {
                    samePair++;
                }
            }
        }
        return samePair;
    }

    
    public static int countSamePair_Problem_3_2135c607_51f6_4df2_97f7_067bafd753db(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_e231b610_2ccf_423b_b06a_5464325a1479(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        HashSet<Integer> set1 = new HashSet<>(nums1);
        HashSet<Integer> set2 = new HashSet<>(nums2);
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            if (set1.contains(nums1.get(i))) count++;
        }
        for (int i = 0; i < nums2.size(); i++) {
            if (set2.contains(nums2.get(i))) count++;
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_00a8dbc6_dc64_4752_b634_f9d5da7cbd04(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        // Write your code here
        if(nums1.size() != nums2.size())
            throw new IllegalArgumentException();
        Integer[] array1 = nums1.toArray(new Integer[nums1.size()]);
        Integer[] array2 = nums2.toArray(new Integer[nums2.size()]);
        int result = 0;
        for(int i = 0; i < array1.length; ++i){
            if(array1[i] == array2[i])
                result += i;
        }
        return result;
    }

    
    public static int countSamePair_Problem_0_5bf0cdb8_a374_427d_baa7_acf00dca8297(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        // write your code here
        int retval = 0;
        for (int i = 0; i < nums1.size(); i++) {
            int val1 = nums1.get(i);
            for (int j = 0; j < nums2.size(); j++) {
                int val2 = nums2.get(j);
                if (val1 == val2) {
                    retval++;
                    break;
                }
            }
        }
        return retval;
    }

    
    public static int countSamePair_Problem_2_024afd8f_4749_48ee_8f3a_8bd768d66e55(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        Iterator<Integer> itr = nums1.iterator();
        Iterator<Integer> itr2 = nums2.iterator();

        int first = itr.next();
        int second = itr2.next();

        while(itr.hasNext() && itr2.hasNext()) {
            if (itr.next() == itr2.next()) {
                count++;
            }
        }

        return count;
    }

    
    public static int countSamePair_Problem_3_e9597d77_dcce_4c69_aa1c_81e81d8562ea(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int max1 = nums1.get(nums1.size() - 1);
        int max2 = nums2.get(nums2.size() - 1);
        int min1 = nums1.get(0);
        int min2 = nums2.get(0);
        int sum = 0;
        for (int i = 0; i < nums1.size(); i++) {
            int current1 = nums1.get(i);
            int current2 = nums2.get(i);
            if (current1 == current2) {
                count++;
            }
            if (current1 > max1) {
                max1 = current1;
            }
            if (current2 > max2) {
                max2 = current2;
            }
            if (current1 < min1) {
                min1 = current1;
            }
            if (current2 < min2) {
                min2 = current2;
            }
            sum += current1;
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_eb179196_f4ba_469a_b1bb_cbb42f19f6af(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_7dbc0a3e_fa15_4975_9f49_89b1da8285f4(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        if (nums1 == null || nums2 == null || nums1.size() != nums2.size()) {
            return 0;
        }
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums1.size(); i++) {
            if (map.containsKey(nums1.get(i))) {
                map.put(nums1.get(i), map.get(nums1.get(i)) + 1);
            } else {
                map.put(nums1.get(i), 1L);
            }
        }
        for (int i = 0; i < nums2.size(); i++) {
            if (map.containsKey(nums2.get(i))) {
                map.put(nums2.get(i), map.get(nums2.get(i)) + 1);
            } else {
                map.put(nums2.get(i), 1L);
            }
        }
        int count = 0;
        for (Integer val : map.keySet()) {
            if (map.get(val) == 2) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_4cd30a25_cc91_4e46_9eba_312270a5bc39(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int size = nums1.size();
        for (int i = 0; i < size; i++) {
            int a = nums1.get(i);
            int b = nums2.get(i);
            if (a == b) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_535439ac_50b8_4c50_aab0_39c1ab520175(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        Integer[] nums1Arr = nums1.toArray(new Integer[0]);
        Integer[] nums2Arr = nums2.toArray(new Integer[0]);

        int result = 0;
        Arrays.sort(nums1Arr);
        Arrays.sort(nums2Arr);
        for(int i = 0; i < nums1Arr.length; i++) {
            int temp = nums1Arr[i];
            int index = Arrays.binarySearch(nums2Arr, temp);
            if(index >= 0) {
                result++;
            }
        }
        return result;
    }

    
    public static int countSamePair_Problem_3_a3509190_ec94_45ba_abb8_217785409668(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        return nums1.stream()
                .flatMap(i -> nums2.stream())
                .distinct()
                .count();
    }

    
    public static int countSamePair_Problem_2_cf17457b_400e_4c26_9dda_a0f8a5913664(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int sum = 0;
        int max1 = nums1.get(nums1.size() - 1);
        int max2 = nums2.get(nums2.size() - 1);
        int min1 = nums1.get(0);
        int min2 = nums2.get(0);
        int mid1 = max1 + (max2 - min1) / 2;
        int mid2 = max1 + (max2 - min1) / 2;
        int mid = mid1 + (mid2 - min1) / 2;
        int diff1 = max1 - mid1;
        int diff2 = max2 - mid2;
        int diff = mid - min1;
        if (diff1 == diff2 && diff1 == diff) {
            count++;
            sum += max1 - min1;
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_5d4056aa_cca5_4be8_b3e2_5407c11819b7(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = nums1.stream().filter(x -> nums2.contains(x)).count();
        return count;
    }

    
    public static int countSamePair_Problem_0_4f9fcd48_8562_48fc_bae4_1e362854c442(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0; // Initializing count with zero
        for (int i = 0; i < nums1.size() && i < nums2.size(); i++) {
            if (nums1.get(i) == nums2.get(i)) { // Checks both lists elements match with the current index
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_0c8d4fd0_5a0a_43b2_a21b_acc7821941cf(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for(int j = i+1; j < nums1.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_b6aa95b5_c3b8_47cd_9571_f6c222bfec72(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        Map<Integer, Integer> m = new HashMap<>();
        int ans = 0;
        for (int i = 0; i < nums1.size(); i++) {
            int val = nums1.get(i);
            if (!m.containsKey(val)) {
                m.put(val, 1L);
            } else {
                m.put(val, m.get(val) + 1);
            }
        }
        for (int i = 0; i < nums2.size(); i++) {
            int val = nums2.get(i);
            if (!m.containsKey(val)) {
                m.put(val, 1L);
            } else {
                m.put(val, m.get(val) - 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : m.entrySet()) {
            if (entry.getValue() >= 0) {
                ans += entry.getValue();
            }
        }
        return ans;
    }

    
    public static int countSamePair_Problem_2_bbbce57b_a0b3_4fdd_9d3c_f091563af8e0(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int sum = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_c5f6b41f_a59e_4e96_b689_8ceb419b7590(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int sum = 0;

        // For each element in the arraylist
        for (int i : nums1) {
            for (int j : nums2) {
                // If the current number is the same
                if (i == j) {
                    // Add to the count
                    count++;
                    // Add 1 to the sum
                    sum++;
                }
            }
        }
        return sum;
    }

    
    public static int countSamePair_Problem_1_09913ea5_edf4_4434_b010_2fc0f30df03f(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_a7c3580c_e4d9_44f6_a18c_560a26ca2720(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); ++i) {
            for(int j = 0; j < nums2.size(); ++j) {
                if(nums1.get(i) == nums2.get(j)) {
                    ++count;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_aa28c26c_e182_4a19_a76e_4aef445939da(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int max1 = nums1.get(nums1.size() - 1);
        int max2 = nums2.get(nums2.size() - 1);
        int min1 = nums1.get(0);
        int min2 = nums2.get(0);
        int sum = 0;
        for (int i = 0; i < nums1.size(); i++) {
            int num1 = nums1.get(i);
            int num2 = nums2.get(i);
            if (num1 == max1 && num2 == max2) {
                count++;
            } else if (num1 == max1 && num2 == min2) {
                count++;
            } else if (num1 == min1 && num2 == max2) {
                count++;
            } else if (num1 == min1 && num2 == min2) {
                count++;
            } else if (num1 == max2 && num2 == min1) {
                count++;
            } else if (num1 == min2 && num2 == max1) {
                count++;
            } else if (num1 == max2 && num2 == min2) {
                count++;
            } else if (num1 == min2 && num2 == min1) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_e231b610_2ccf_423b_b06a_5464325a1479(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        HashSet<Integer> set1 = new HashSet<>(nums1);
        HashSet<Integer> set2 = new HashSet<>(nums2);
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            if (set1.contains(nums1.get(i))) count++;
        }
        for (int i = 0; i < nums2.size(); i++) {
            if (set2.contains(nums2.get(i))) count++;
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_331ccb65_de0d_4f53_badd_e2c53f8b5da1(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        // Note: The returned count should be a 32-bit unsigned integer.
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_f8b11c57_9975_428e_bfdd_ea369ea6b9c5(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            int j = 0;
            int n = nums1.get(i);
            for (int k = i; k < nums1.size(); k++) {
                if (n == nums2.get(j)) {
                    count++;
                }
                j++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_33bc0201_15cc_4b31_9e96_12d86129ba85(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (Integer num1 : nums1){
            for (Integer num2 : nums2){
                if (num1 == num2){
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_89b2b6e1_c5bb_430f_a808_1b2692bf8ff7(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_da135745_a753_4779_9bb5_850c739be176(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int sum = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = i + 1; j < nums1.size(); j++) {
                if (nums1.get(i).equals(nums1.get(j))) {
                    sum++;
                }
            }
        }
        for (int i = 0; i < nums2.size(); i++) {
            for (int j = i + 1; j < nums2.size(); j++) {
                if (nums2.get(i).equals(nums2.get(j))) {
                    sum++;
                }
            }
        }
        return sum;
    }

    
    public static int countSamePair_Problem_2_88fe6011_43d6_4190_9be9_461040a8320d(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int ret = 0;
        for (int i = 0; i < nums1.size(); i++) {
            if (nums1.get(i) == nums2.get(i)) {
                ret++;
            }
        }
        return ret;
    }

    
    public static int countSamePair_Problem_1_7cca4d67_78bf_44fe_ac63_480ea5520a82(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int sum = 0;
        for (int i = 0; i < nums1.size(); i++) {
            sum += nums1.get(i);
        }
        for (int i = 0; i < nums2.size(); i++) {
            sum += nums2.get(i);
        }
        for (int i = 0; i < nums1.size(); i++) {
            if (nums1.get(i) == nums2.get(i)) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_29723c65_ee60_486a_a6c8_97bae4b36093(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_fa561206_1218_4fa5_af6f_25e484b97c0c(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_f67c9c7c_218e_469f_b4f7_b21ce5a5c611(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i).intValue() == nums2.get(j).intValue()) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_8fe5dd5f_e894_4c5a_bb10_a5e1be5a8f72(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0L;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i).equals(nums2.get(j))) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_ee14686f_f110_4f77_8a98_6d5003bba25e(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int result = 0;
        Set<Integer> set = new HashSet<Integer>();
        
        for(int i = 0; i < nums1.size(); i++) {
            Integer num1 = nums1.get(i);
            Integer num2 = nums2.get(i);
            
            if(set.contains(num1)) {
                result++;
            }
            
            set.add(num1);
        }
        
        return result;
    }

    
    public static int countSamePair_Problem_1_de41a88a_2423_4452_942c_4ed5332786aa(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int idx1 = 0, idx2 = 0;
        int count = 0;
        while (idx1 < nums1.size() && idx2 < nums2.size()) {
            if (nums1.get(idx1) == nums2.get(idx2)) {
                count++;
                idx1++;
                idx2++;
            } else {
                if (idx1 < nums1.size() - 1) {
                    idx1++;
                } else {
                    idx2++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_b6aa95b5_c3b8_47cd_9571_f6c222bfec72(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        Map<Integer, Integer> m = new HashMap<>();
        int ans = 0;
        for (int i = 0; i < nums1.size(); i++) {
            int val = nums1.get(i);
            if (!m.containsKey(val)) {
                m.put(val, 1L);
            } else {
                m.put(val, m.get(val) + 1);
            }
        }
        for (int i = 0; i < nums2.size(); i++) {
            int val = nums2.get(i);
            if (!m.containsKey(val)) {
                m.put(val, 1L);
            } else {
                m.put(val, m.get(val) - 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : m.entrySet()) {
            if (entry.getValue() >= 0) {
                ans += entry.getValue();
            }
        }
        return ans;
    }

    
    public static int countSamePair_Problem_1_96905a6d_b8ae_4006_b659_45e73f13e355(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int countSamePair_Problem_1_96905a6d_b8ae_4006_b659_45e73f13e355 = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    countSamePair_Problem_1_96905a6d_b8ae_4006_b659_45e73f13e355++;
                }
            }
        }
        return countSamePair_Problem_1_96905a6d_b8ae_4006_b659_45e73f13e355;
    }

    
    public static int countSamePair_Problem_0_b26d6a33_8957_4e48_aaf7_4eadba56673f(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_30e02e26_9ea8_4a5e_ba1f_49ed4674583c(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int len1 = nums1.size();
        int len2 = nums2.size();
        for(int i = 0; i < len1; i++) {
            for(int j = 0; j < len2; j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_f2783087_0a83_4af2_b241_1bcc2d6827c1(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        Map<Integer, Integer> counts = new HashMap<>();
        for (int i = 0; i < nums1.size(); i++) {
            counts.put(nums1.get(i), counts.getOrDefault(nums1.get(i), 0L) + 1);
        }
        int ret = 0;
        for (int i = 0; i < nums2.size(); i++) {
            if (counts.get(nums2.get(i)) > 0) {
                ret += counts.get(nums2.get(i));
                counts.put(nums2.get(i), counts.getOrDefault(nums2.get(i), 0L) - 1);
            }
        }
        return ret;
    }

    
    public static int countSamePair_Problem_0_d6ae4036_df05_4ed6_b21a_70308c21bffe(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        // The solution only works for two unique array lists
        if(nums1.size() != nums2.size()) {
            return -1L;
        }
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < nums1.size(); i++) {
            set.add(nums1.get(i));
        }
        for(int i = 0; i < nums2.size(); i++) {
            if(set.contains(nums2.get(i))) {
                set.add(nums2.get(i));
            }
        }
        return set.size();
    }

    
    public static int countSamePair_Problem_3_89b2b6e1_c5bb_430f_a808_1b2692bf8ff7(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_65721580_417e_4ea1_ac3e_beeafb021e33(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int result = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    result++;
                }
            }
        }
        return result;
    }

    
    public static int countSamePair_Problem_3_d0c6d996_2407_4c1b_aebf_6f5c187e2a24(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_df749f94_0be4_4cb8_9a55_84d6bf273cbb(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0L;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_2ebcf6ec_a4a7_40cf_86e1_28efcb51b694(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_a0afce7c_841f_4b11_86bc_2181041d1e91(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_d8b592f1_a846_4e79_aa0d_653bc9aeb6d5(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int countsame = 0;
        int x = nums1.get(0);
        int y = nums2.get(0);
        int count = 0;
        while (x != y) {
            if (x == nums2.get(0)) {
                count++;
            }
            countsame++;
            count++;
            x = nums1.get(0);
            y = nums2.get(0);
        }
        return countsame;
    }

    
    public static int countSamePair_Problem_2_2d0f8b37_5ea0_4297_b23f_6acc38efdb05(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int n1:nums1){
            for(int n2:nums2){
                if(n1 == n2){
                    count ++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_dee772ce_3899_4786_a38f_923eda682533(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int n = nums1.size();
        int[] nums1s = new int[n];
        int[] nums2s = new int[n];
        for(int i = 0; i < n; i++) {
            nums1s[i] = nums1.get(i);
            nums2s[i] = nums2.get(i);
        }
        int count = 0;
        for(int i = 0; i < n; i++) {
            if(nums1s[i] == nums2s[i]) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_9ac7ceee_47b5_4e9a_ac76_4a0e1b92b619(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        HashSet<Integer> set = new HashSet<Integer>();
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            if(nums1.get(i).equals(nums2.get(i))) {
                count++;
                set.add(nums1.get(i));
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_937ec049_4f1e_4ca1_b9f1_f8482a3edb7f(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int max = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                    if (count > max) {
                        max = count;
                    }
                }
            }
        }
        return max;
    }

    
    public static int countSamePair_Problem_0_f6160236_3fb5_41de_93f0_b45118b55806(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        // your code here
        int sum = 0;
        for(int i=0; i<nums1.size(); i++){
            for(int j=0; j<nums2.size(); j++){
                if(nums1.get(i) == nums2.get(j)){
                    sum+=1;
                }
            }
        }
        return sum;
    }

    
    public static int countSamePair_Problem_0_02d967a3_fd6c_4f0e_a2d4_b337843010d0(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        if(nums1.size() != nums2.size()) {
            System.out.println("The lists are not of the same length");
        } else {
            for(int i=0; i<nums1.size(); i++) {
                if(nums1.get(i) == nums2.get(i)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_de41a88a_2423_4452_942c_4ed5332786aa(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int idx1 = 0, idx2 = 0;
        int count = 0;
        while (idx1 < nums1.size() && idx2 < nums2.size()) {
            if (nums1.get(idx1) == nums2.get(idx2)) {
                count++;
                idx1++;
                idx2++;
            } else {
                if (idx1 < nums1.size() - 1) {
                    idx1++;
                } else {
                    idx2++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_76ff891d_0186_4125_a733_ca21d0491574(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        if(nums1.size() != nums2.size()) {
            return count;
        }
        for(int i = 0; i < nums1.size(); i++) {
            if(nums1.get(i) == nums2.get(i)) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_aee8664f_17dc_4ee0_8c25_14d1a25af456(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_2cb57b91_3b6d_4ac8_8ad9_77012e5e888b(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j))
                    count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_fcbe7463_3d9a_4ffa_b7e1_09a2107c6077(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int sum = 0;
        // Iterate through the first list
        for (int i = 0; i < nums1.size(); i++) {
            // Iterate through the second list
            for (int j = 0; j < nums2.size(); j++) {
                // If the current index is the same in the two lists, add 1 to sum
                if (nums1.get(i) == nums2.get(j)) {
                    sum += 1;
                }
            }
        }
        return sum;
    }

    
    public static int countSamePair_Problem_2_937b1a26_e17e_4ada_b85d_9949f3348897(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            if (nums1.get(i) == nums2.get(i)) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_73be3163_2f21_490d_ab48_7eb38efb2349(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        // Write your code here
        int count = 0;
        for(int i=0;i<nums1.size();i++) {
            int i1 = nums1.get(i);
            int i2 = nums2.get(i);
            if(i1 == i2) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_11acdbb1_4588_4f9b_a5ed_9f8ea648fb08(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int same = 0;
        int max = Math.max(nums1.size(), nums2.size());
        for (int i = 0; i < max; i++) {
            if (nums1.get(i) == nums2.get(i)) {
                same += 1;
            }
        }
        return same;
    }

    
    public static int countSamePair_Problem_2_44daf954_4ccf_4263_9a5b_6f71131df0ab(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int max1 = nums1.get(nums1.size() - 1);
        int max2 = nums2.get(nums2.size() - 1);
        int min1 = nums1.get(0);
        int min2 = nums2.get(0);
        int sum = 0;
        for (int i = 0; i < nums1.size(); i++) {
            if (nums1.get(i) == max1 && nums2.get(i) == max2) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_f8f86c23_3a43_411e_ae3d_df8e0dcd3005(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_157fdf60_349a_4893_8be6_127bd6f3a9ab(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int[] temp = new int[nums1.size()];
        Arrays.fill(temp, 0);
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    temp[i]++;
                }
            }
        }
        return Arrays.stream(temp).sum();
    }

    
    public static int countSamePair_Problem_1_535439ac_50b8_4c50_aab0_39c1ab520175(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        Integer[] nums1Arr = nums1.toArray(new Integer[0]);
        Integer[] nums2Arr = nums2.toArray(new Integer[0]);

        int result = 0;
        Arrays.sort(nums1Arr);
        Arrays.sort(nums2Arr);
        for(int i = 0; i < nums1Arr.length; i++) {
            int temp = nums1Arr[i];
            int index = Arrays.binarySearch(nums2Arr, temp);
            if(index >= 0) {
                result++;
            }
        }
        return result;
    }

    
    public static int countSamePair_Problem_2_6b746ac0_870c_4a81_afce_414d7ba03115(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        if(nums1.size() != nums2.size()) return 0;
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            if(nums1.get(i) == nums2.get(i)) count++;
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_b6aa95b5_c3b8_47cd_9571_f6c222bfec72(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        Map<Integer, Integer> m = new HashMap<>();
        int ans = 0;
        for (int i = 0; i < nums1.size(); i++) {
            int val = nums1.get(i);
            if (!m.containsKey(val)) {
                m.put(val, 1L);
            } else {
                m.put(val, m.get(val) + 1);
            }
        }
        for (int i = 0; i < nums2.size(); i++) {
            int val = nums2.get(i);
            if (!m.containsKey(val)) {
                m.put(val, 1L);
            } else {
                m.put(val, m.get(val) - 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : m.entrySet()) {
            if (entry.getValue() >= 0) {
                ans += entry.getValue();
            }
        }
        return ans;
    }

    
    public static int countSamePair_Problem_3_55a99939_cad7_48ea_ae04_b77537813ad8(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int n = nums1.size();
        int m = nums2.size();
        int[] array = new int[n];
        int[] array2 = new int[m];
        int[] array3 = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = nums1.get(i);
        }
        for (int j = 0; j < m; j++) {
            array2[j] = nums2.get(j);
        }
        // System.out.println("array=" + Arrays.toString(array));
        for (int i = 0; i < n; i++) {
            if (array[i] == array2[i]) {
                for (int j = 0; j < n; j++) {
                    if (array[i] == array3[j]) {
                        count++;
                    }
                }
            }
        }
        // System.out.println("count=" + count);
        return count;
    }

    
    public static int countSamePair_Problem_3_099615c3_7269_49d0_8072_0256c2f3fe0f(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_1340862d_bf2f_4719_83aa_0c88030bef8a(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        for(int i = 0; i < nums1.size(); i++) {
            if(!map.containsKey(nums1.get(i))) {
                map.put(nums1.get(i), new ArrayList<>());
            }
            map.get(nums1.get(i)).add(nums2.get(i));
        }
        return map.entrySet().stream().filter(entry -> entry.getValue().size() > 1).count();
    }

    
    public static int countSamePair_Problem_2_e9597d77_dcce_4c69_aa1c_81e81d8562ea(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int max1 = nums1.get(nums1.size() - 1);
        int max2 = nums2.get(nums2.size() - 1);
        int min1 = nums1.get(0);
        int min2 = nums2.get(0);
        int sum = 0;
        for (int i = 0; i < nums1.size(); i++) {
            int current1 = nums1.get(i);
            int current2 = nums2.get(i);
            if (current1 == current2) {
                count++;
            }
            if (current1 > max1) {
                max1 = current1;
            }
            if (current2 > max2) {
                max2 = current2;
            }
            if (current1 < min1) {
                min1 = current1;
            }
            if (current2 < min2) {
                min2 = current2;
            }
            sum += current1;
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_7d2bd4ec_03ef_420b_9866_52cfb8762cc1(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int samePairCount = 0L;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i).equals(nums2.get(j))) {
                    samePairCount++;
                }
            }
        }
        return samePairCount;
    }

    
    public static int countSamePair_Problem_3_01419d17_58ce_4eb1_8ba2_2895fc96c04f(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        // write your logic here
        int numOne = 0;
        int numTwo = 0;
        int sum = 0;
        for(int i : nums1) {
            for(int j : nums2) {
                if(j == i) {
                    numOne++;
                }
                sum += j;
            }
        }
        if(numOne == nums2.size()) {
            return sum;
        } else {
            return -1;
        }
    }

    
    public static int countSamePair_Problem_0_e985f31c_20b4_49f4_a240_ebf003533dc9(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_d6707972_76c6_48f8_8c00_05ced137e08e(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        // write your code here
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums1.size(); i++) {
            map.put(nums1.get(i), nums2.get(i));
        }
        int count = 0;
        for(Integer num: map.values()){
            if(map.get(num) != null){
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_f77175f5_da6f_4fea_af08_b837a8d3efb8(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_672a2d76_5b73_4e6b_8abb_aaa68cc9c168(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int[] a1 = new int[nums1.size()];
        int[] a2 = new int[nums2.size()];
        for (int i = 0; i < nums1.size(); i++) {
            a1[i] = nums1.get(i);
        }
        for (int i = 0; i < nums2.size(); i++) {
            a2[i] = nums2.get(i);
        }
        Arrays.sort(a1);
        Arrays.sort(a2);
        int count = 0;
        for (int i = 1; i < a1.length; i++) {
            if (a1[i] == a2[i - 1]) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_7557985a_1d77_4e22_8431_e67a1ac6fad2(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        if (nums1 == null || nums2 == null || nums1.size() != nums2.size()) {
            return count;
        }
        for (int i = 0; i < nums1.size(); i++) {
            if (nums1.get(i).equals(nums2.get(i))) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_e39e1f85_12a4_4242_9305_2c0aa3808e2b(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int samePairs = 0;
        for (int i = 0; i < nums1.size(); i++) {
            int num1 = nums1.get(i);
            int num2 = nums2.get(i);
            if (num1 == num2) {
                samePairs++;
            }
        }
        return samePairs;
    }

    
    public static int countSamePair_Problem_3_3bb11b8c_7d05_46f1_8bbd_e335f2c52acb(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            Integer num1 = nums1.get(i);
            Integer num2 = nums2.get(i);
            if (num1 == num2) count++;
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_4571681c_69ee_4702_a0b6_d0169eb768ea(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        
        for(int i = 0; i < nums1.size(); i++) {
            if(nums1.get(i) == nums2.get(i)) {
                count++;
            }
        }
        
        return count;
    }

    
    public static int countSamePair_Problem_1_4c76b924_1780_489d_99a6_3ceee9cf3f01(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int sum = 0;
        for (int i = 0; i < nums1.size(); i++) {
            sum += nums1.get(i);
        }
        for (int i = 0; i < nums2.size(); i++) {
            sum += nums2.get(i);
        }
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_469cf4b3_9e3c_482f_a200_f9e047d4e555(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int len = nums1.size();
        for(int i = 0; i < len; i++) {
            if(nums1.get(i) == nums2.get(i)) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_2ad2d4f8_93be_42fb_bef3_b01658ef6e33(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        return nums1.stream().mapToInteger(a -> nums2.indexOf(a)).filter(a -> a != -1).count();
    }

    
    public static int countSamePair_Problem_1_eb179196_f4ba_469a_b1bb_cbb42f19f6af(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_7ded0297_0a04_4852_8b63_600bf042d8df(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_55213487_f399_4261_9f43_8069fe2ebc4f(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_7f531113_b04c_4d58_8d9c_25b9b5ad5864(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int max1 = nums1.get(nums1.size() - 1);
        int max2 = nums2.get(nums2.size() - 1);
        int min1 = nums1.get(0);
        int min2 = nums2.get(0);
        int maxDiff = max1 - max2;
        int minDiff = min1 - min2;
        if (maxDiff != minDiff) {
            count = maxDiff - minDiff;
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_c202f24c_2198_41db_8099_24b00e4bdd17(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int max1 = nums1.get(nums1.size()-1);
        int max2 = nums2.get(nums2.size()-1);
        int min1 = nums1.get(0);
        int min2 = nums2.get(0);
        int maxDiff = max1 - max2;
        int minDiff = min1 - min2;
        int diff;
        for(int i = 0; i < nums1.size(); i++) {
            diff = nums1.get(i) - nums2.get(i);
            if(diff == maxDiff) {
                count++;
            }
            if(diff == minDiff) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_f8b11c57_9975_428e_bfdd_ea369ea6b9c5(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            int j = 0;
            int n = nums1.get(i);
            for (int k = i; k < nums1.size(); k++) {
                if (n == nums2.get(j)) {
                    count++;
                }
                j++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_5d4056aa_cca5_4be8_b3e2_5407c11819b7(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = nums1.stream().filter(x -> nums2.contains(x)).count();
        return count;
    }

    
    public static int countSamePair_Problem_0_fa0486c5_bf42_48b2_9680_bf1b3133d1b8(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int sum = 0;
        int diff1 = 0;
        int diff2 = 0;
        // System.out.println(nums1);
        // System.out.println(nums2);
        // int size = nums1.size();
        // int size = nums2.size();
        for (int i = 0; i < nums1.size(); i++) {
            if (nums1.get(i) == nums2.get(i)) {
                sum += i;
                diff1 += nums1.get(i);
                diff2 += nums2.get(i);
            }
        }
        return sum;
    }

    
    public static int countSamePair_Problem_1_f6160236_3fb5_41de_93f0_b45118b55806(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        // your code here
        int sum = 0;
        for(int i=0; i<nums1.size(); i++){
            for(int j=0; j<nums2.size(); j++){
                if(nums1.get(i) == nums2.get(j)){
                    sum+=1;
                }
            }
        }
        return sum;
    }

    
    public static int countSamePair_Problem_2_ef0dadca_6887_4c93_aad0_78a459767131(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0; // count starts at zero
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_63208cdf_ef18_455d_a4e2_f63a7e652492(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int max1 = nums1.get(nums1.size()-1);
        int max2 = nums2.get(nums2.size()-1);
        int min1 = nums1.get(0);
        int min2 = nums2.get(0);
        for(int i = 0; i < nums1.size(); i++) {
            if(nums1.get(i) == max1 && nums2.get(i) == max2) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_89d619de_4027_47b9_afab_f04221b043b7(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int pairs = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    pairs++;
                }
            }
        }
        return pairs;
    }

    
    public static int countSamePair_Problem_0_a38e76c5_3919_4e92_b0cf_2c0c1bd1eb31(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int sum = 0;
        for(int i = 0; i < nums1.size(); i++) {
            sum += nums1.get(i);
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_73af5a18_bd8e_447b_b78c_e4733c49c48e(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        // TODO: Your code here
        int n1 = nums1.size();
        int n2 = nums2.size();
        if(n1 != n2){
            return 0;
        }
        int result = 0;
        for(int i=0; i<n1; i++){
            if(nums1.get(i) == nums2.get(i)){
                result++;
            }
        }
        return result;
    }

    
    public static int countSamePair_Problem_3_610cd7cf_dfcc_4ab0_977b_5b2597e7f3c9(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int temp1 = nums1.get(0) - nums1.get(1);
        int temp2 = nums2.get(0) - nums2.get(1);
        if (temp1 == temp2) {
            count++;
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_a8153fb4_abc0_4b60_8929_aee54f335c9d(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        boolean found1 = False;
        boolean found2 = False;
        for(int i = 0; i < nums1.size(); i++) {
            if(nums1.get(i) == nums2.get(i)) {
                found1 = True;
                found2 = True;
            }
        }
        
        if(found1 == True && found2 == True) {
            count++;
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_fd7ef3b7_78dc_4e45_af94_4ed9b7daeabd(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_099615c3_7269_49d0_8072_0256c2f3fe0f(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_0_93dd57ed_8b21_4998_af5b_1782de904f1f(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for(int i=0; i<nums1.size(); i++) {
            if(nums1.get(i) == nums2.get(i)) {
                count++;
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_2_f6cfdaa8_4a00_4012_90e9_323dbb625e0d(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_a0afce7c_841f_4b11_86bc_2181041d1e91(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_1_c2cdec22_850c_4afb_9eb1_a64ecb9b4954(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if (nums1.get(i) == nums2.get(j)) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    
    public static int countSamePair_Problem_3_1c99f120_d72e_494c_9b0d_0582514cb2f4(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        int count = 0;
        int sum = 0;
        for(int i = 0; i < nums1.size(); i++) {
            for(int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) == nums2.get(j)) {
                    count++;
                    sum += i;
                }
            }
        }
        return count;
    }

}
