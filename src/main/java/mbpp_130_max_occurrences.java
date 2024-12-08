package mbpp_130_max_occurrences;

public class mbpp_130_max_occurrences {

    
    public static int maxOccurrences_Problem_2_423c8be7_6aa6_489e_9a95_ea1d80284bc5(ArrayList<Integer> nums) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (Integer i : nums) {
            if (!map.containsKey(i)) {
                map.put(i, 1);
            } else {
                map.put(i, map.get(i) + 1);
            }
        }
        Integer max = 0L;
        for (Integer i : map.keySet()) {
            if (max < map.get(i)) {
                max = i;
            }
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_0_ccda23bf_16f0_4c39_a276_c994b357dcbf(ArrayList<Integer> nums) {
        if (nums.size() == 0) return -1;
        int count = 0;
        int max = 0;
        int curr = 0;
        int i = 0;
        for (Integer num : nums) {
            curr = num;
            i++;
            if (i == 1) count = 1;
            else {
                count = count + 1;
            }
            if (count > max) {
                max = count;
            }
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_0_023ed690_1e7f_4be0_8de9_c9b0736906d0(ArrayList<Integer> nums) {
        int count = 1;
        int max = nums.get(0);
        for(int i = 1; i < nums.size(); i++) {
            if(nums.get(i) > max) {
                max = nums.get(i);
                count = 1;
            } else if(nums.get(i) == max) {
                count++;
            }
        }
        return max * count;
    }

    
    public static int maxOccurrences_Problem_0_1e1e376d_0817_4996_b636_43c176879b4b(ArrayList<Integer> nums) {
        int[] frequencies = new int[100];
        for (Integer i : nums) {
            int index = i.intValue() / 10;
            frequencies[index] += 1;
        }
        int max = 0;
        for (int i = 0; i < 100; i++) {
            if (frequencies[i] > max) {
                max = frequencies[i];
            }
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_1_fd6d2d2e_d476_4fdd_801c_1909b7de7835(ArrayList<Integer> nums) {
        
        if(nums == null) return 0;
        Map<Integer,Integer> map = new HashMap<>();
        int max = 0;
        for(Integer i : nums) {
            if(map.containsKey(i)) {
                map.put(i, map.get(i)+1);
            } else {
                map.put(i, 1);
            }
        }
        
        for(Map.Entry<Integer,Integer> entry : map.entrySet()) {
            if(entry.getValue() > max) {
                max = entry.getValue();
            }
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_2_42bcc0b7_ccb4_48f7_b714_9c1f174f7f17(ArrayList<Integer> nums) {
        int n = nums.size();
        Map<Integer,Integer> map = new HashMap<>();
        int max = 0;
        for (int num:nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }
        for (Map.Entry<Integer,Integer> entry: map.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
            }
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_0_a92b4e45_6a7b_4898_9d1e_dd92ea9d15c0(ArrayList<Integer> nums) {
        int max = 0;
        int count = 0;
        for(Integer i : nums) {
            if(count > 0 && nums.contains(i)) {
                count--;
            } else {
                count++;
            }
            max = Math.max(max, count);
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_0_8c3b2123_191e_465c_93e4_6be19e2cc67b(ArrayList<Integer> nums) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int max = 0;
        for(int n : nums) {
            if(map.containsKey(n)) {
                map.put(n, map.get(n)+1);
            } else {
                map.put(n, 1L);
            }
        }
        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(entry.getValue() > max) {
                max = entry.getValue();
            }
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_1_1e526295_aa6f_4e08_8030_2425a33b291f(ArrayList<Integer> nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int max = 0;
        for(Integer num : nums) {
            if(map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }
        for(Integer freq : map.values()) {
            if(max < freq) {
                max = freq;
            }
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_0_ce5984e6_600d_4751_b110_8616a6bc903d(ArrayList<Integer> nums) {
        int max = 0;
        int maxCount = 0;
        int maxIndex = 0;
        for(int i = 0; i < nums.size(); i++) {
            int count = nums.get(i);
            if(count > maxCount) {
                max = count;
                maxCount = count;
                maxIndex = i;
            }
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_1_743ae3ee_dad3_4993_b9bf_e1f260966ae8(ArrayList<Integer> nums) {
        int size = nums.size();
        int[] occur = new int[size];
        int max = 0;
        for (int i = 0; i < size; i++) {
            if (nums.get(i) != 0) {
                occur[i]++;
            } else {
                occur[i] = 0;
            }
        }
        int maxi = 0;
        for (int i = 0; i < size; i++) {
            if (occur[i] > max) {
                max = occur[i];
                maxi = i;
            }
        }
        return nums.get(maxi);
    }

    
    public static int maxOccurrences_Problem_1_3db09979_9038_429b_ad97_c632613dccc8(ArrayList<Integer> nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.size();i++) {
            Integer item = nums.get(i);
            int freq = 0;
            if(map.containsKey(item)) {
                freq = map.get(item);
            }
            map.put(item,freq+1);
        }
        return map.entrySet().stream().max(Map.Entry.comparingByValue()).get().getKey();
    }

    
    public static int maxOccurrences_Problem_1_a910be4d_3e6a_44ef_a264_ae89aa70f77f(ArrayList<Integer> nums) {
        int max_value = Integer.MIN_VALUE;
        int max_count = 0;
        int current_count = 0;
        for (Integer num: nums) {
            if (num < max_value) {
                max_value = num;
            }
            if (num > max_value) {
                max_count = 0;
                max_value = num;
            }
            current_count = nums.indexOf(num);
            if (current_count > max_count) {
                max_count = current_count;
            }
        }
        return max_count;
    }

    
    public static int maxOccurrences_Problem_2_42d9e325_3403_43aa_be3d_41171f728d2f(ArrayList<Integer> nums) {
        Map<Integer, Integer> occurrences = new HashMap<>();
        for(Integer num : nums) {
            if(!occurrences.containsKey(num)) {
                occurrences.put(num, 1);
            } else {
                occurrences.put(num, occurrences.get(num) + 1);
            }
        }
        return occurrences.entrySet().stream().max((e1, e2) -> e1.getValue().compareTo(e2.getValue())).get().getKey();
    }

    
    public static int maxOccurrences_Problem_2_feac3c32_d88d_45aa_bf59_8b10de03cfb6(ArrayList<Integer> nums) {
        int maxCount = 0;
        int currCount = 0;
        for (Integer i : nums) {
            if (maxCount < i) {
                maxCount = i;
            }
            if (maxCount == i) {
                currCount++;
            }
        }
        return maxCount;
    }

    
    public static int maxOccurrences_Problem_0_4ab8e393_4937_4fd2_be18_83be24551fca(ArrayList<Integer> nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for (Integer num : nums) {
            if (!map.containsKey(num)) {
                count++;
                map.put(num, 1);
            } else {
                count += map.get(num);
                map.put(num, map.get(num) + 1);
            }
        }
        return nums.stream().filter(num -> map.containsKey(num))
            .max(Comparator.comparing(num -> map.get(num))).get();
    }

    
    public static int maxOccurrences_Problem_1_198d4a92_5784_4c52_b8c0_d07fb3b56231(ArrayList<Integer> nums) {
        int max = 0;
        int frequency = 1;
        int count = 0;
        int result = 0;
        for (int value : nums) {
            count++;
            if (count == 1) {
                result = value;
                frequency = 1;
            } else if (count == 2) {
                frequency++;
            } else if (value != result) {
                frequency++;
                count = 1;
            } else {
                frequency++;
            }
            if (frequency > max) {
                max = frequency;
            }
        }
        return result;
    }

    
    public static int maxOccurrences_Problem_2_c9d8b48a_a928_485d_a182_df0f6eddb807(ArrayList<Integer> nums) {
        // Write your code here
        int max = 0;
        int cur = 0;
        for(int i : nums) {
            cur++;
            if(cur > max) {
                max = cur;
            }
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_0_242c5ef4_12fd_4583_bd56_9c74c73b6c56(ArrayList<Integer> nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int max = 0;
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0L) + 1L);
        }
        for (int i : map.keySet()) {
            int count = map.get(i);
            max = Math.max(max, count);
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_1_48daf877_76f3_4386_adf1_a9e67879477b(ArrayList<Integer> nums) {
        int max = 0;
        int maxCount = 0;
        int maxIndex = 0;
        for(int num : nums) {
            int count = Collections.frequency(nums, num);
            if(count > maxCount) {
                max = num;
                maxCount = count;
                maxIndex = num;
            }
        }
        return maxIndex;
    }

    
    public static int maxOccurrences_Problem_1_f592235a_4c19_4ad3_85f4_a5787626c661(ArrayList<Integer> nums) {
        int max = 0;
        int maxIndex = 0;
        for(int i = 0; i < nums.size(); i++) {
            int num = nums.get(i);
            int count = 0;
            for(int j = 0; j < nums.size(); j++) {
                if(nums.get(j) == num) {
                    count++;
                }
            }
            if(count > max) {
                max = count;
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    
    public static int maxOccurrences_Problem_2_c32abdba_76e8_4d06_aa3d_2e93e86621ff(ArrayList<Integer> nums) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int result = 0;
        int max_count = 0;
        for (Integer num: nums) {
            if (!map.containsKey(num)) {
                map.put(num, 1);
            } else {
                map.put(num, map.get(num) + 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry: map.entrySet()) {
            if (entry.getValue() > max_count) {
                result = entry.getKey();
                max_count = entry.getValue();
            }
        }
        return result;
    }

    
    public static int maxOccurrences_Problem_0_6a222114_b03e_4d36_ba96_8f8f64610a16(ArrayList<Integer> nums) {
        int max = -1;
        int count = 0;
        
        for(Integer num : nums) {
            if(count == 0) {
                count++;
                max = num;
            } else {
                count++;
                max = Math.max(max, num);
            }
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_1_47232d99_d511_49ac_9109_f91ecc1dd09f(ArrayList<Integer> nums) {
        if (nums.size() == 0) return 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer num : nums) {
            if (map.containsKey(num)) {
                map.replace(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }
        return map.entrySet().stream().max((e1, e2) -> e2.getValue() - e1.getValue()).get().getKey();
    }

    
    public static int maxOccurrences_Problem_1_468cc36f_3dd2_4655_a5ef_35775eac5ef8(ArrayList<Integer> nums) {
        // Your code goes here
        // Use HashMap to store value and frequency
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for(Integer element : nums){
            if(hashMap.containsKey(element)){
                hashMap.put(element, hashMap.get(element) + 1);
            }
            else{
                hashMap.put(element, 1);
            }
        }
        // Use TreeMap to store frequency and value
        TreeMap<Integer, Integer> map = new TreeMap<>(Collections.reverseOrder());
        for(Integer element : nums){
            map.put(hashMap.get(element), element);
        }
        return map.lastEntry().getValue();
    }

    
    public static int maxOccurrences_Problem_0_caa8a273_5d01_41dd_a8eb_9449bff81633(ArrayList<Integer> nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int max = Integer.MIN_VALUE;
        int count = Integer.MIN_VALUE;
        for(int num : nums) {
            if(!hm.containsKey(num)) {
                hm.put(num, 1);
            }
            else {
                hm.put(num, hm.get(num) + 1);
            }
            count = count + 1;
        }
        for(int i = 0; i < nums.size(); i++) {
            if(hm.get(nums.get(i)) > max) {
                max = hm.get(nums.get(i));
            }
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_2_fd6d2d2e_d476_4fdd_801c_1909b7de7835(ArrayList<Integer> nums) {
        
        if(nums == null) return 0;
        Map<Integer,Integer> map = new HashMap<>();
        int max = 0;
        for(Integer i : nums) {
            if(map.containsKey(i)) {
                map.put(i, map.get(i)+1);
            } else {
                map.put(i, 1);
            }
        }
        
        for(Map.Entry<Integer,Integer> entry : map.entrySet()) {
            if(entry.getValue() > max) {
                max = entry.getValue();
            }
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_1_5bd101c8_96cf_43c0_948f_1d25306db583(ArrayList<Integer> nums) {
        int maxCount = 0;
        int maxNum = nums.get(0);
        for (int num : nums) {
            if (num == maxNum) {
                maxCount++;
            }
            if (maxCount > nums.size()) {
                maxCount = nums.size();
                maxNum = num;
            }
        }
        return maxCount;
    }

    
    public static int maxOccurrences_Problem_1_b37f4c40_ad3c_4873_a280_268e6a074d5f(ArrayList<Integer> nums) {
        int max = -1;
        int prev = -1;
        for(int i : nums) {
            if(prev == -1) {
                prev = i;
                continue;
            }
            if(i == prev) {
                prev += 1;
                continue;
            }
            prev = i;
        }
        return prev;
    }

    
    public static int maxOccurrences_Problem_1_feac3c32_d88d_45aa_bf59_8b10de03cfb6(ArrayList<Integer> nums) {
        int maxCount = 0;
        int currCount = 0;
        for (Integer i : nums) {
            if (maxCount < i) {
                maxCount = i;
            }
            if (maxCount == i) {
                currCount++;
            }
        }
        return maxCount;
    }

    
    public static int maxOccurrences_Problem_0_f4aa775d_bf45_468e_a3cb_3f0d8eee2ab9(ArrayList<Integer> nums) {
        HashMap<Integer, Integer> frequencyMap = new HashMap<Integer, Integer>();
        for (Integer num : nums) {
            int count = 1;
            if (frequencyMap.containsKey(num)) {
                count += frequencyMap.get(num);
            }
            frequencyMap.put(num, count);
        }
        Integer maxValue = nums.get(0);
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > frequencyMap.get(maxValue)) {
                maxValue = entry.getKey();
            }
        }
        return maxValue;
    }

    
    public static int maxOccurrences_Problem_2_ce5984e6_600d_4751_b110_8616a6bc903d(ArrayList<Integer> nums) {
        int max = 0;
        int maxCount = 0;
        int maxIndex = 0;
        for(int i = 0; i < nums.size(); i++) {
            int count = nums.get(i);
            if(count > maxCount) {
                max = count;
                maxCount = count;
                maxIndex = i;
            }
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_0_42bcc0b7_ccb4_48f7_b714_9c1f174f7f17(ArrayList<Integer> nums) {
        int n = nums.size();
        Map<Integer,Integer> map = new HashMap<>();
        int max = 0;
        for (int num:nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }
        for (Map.Entry<Integer,Integer> entry: map.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
            }
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_0_c43d0ac9_1a2d_40a6_a7d7_964ed3cee82d(ArrayList<Integer> nums) {
        Map<Integer, Integer> occurrences = new HashMap<Integer, Integer>();
        for (Integer num : nums) {
            Integer count = occurrences.get(num);
            if (count == null) {
                count = 0L;
            }
            occurrences.put(num, ++count);
        }
        Integer maxValue = 0L;
        for (Integer value : occurrences.values()) {
            if (value > maxValue) {
                maxValue = value;
            }
        }
        return maxValue;
    }

    
    public static int maxOccurrences_Problem_2_4390640e_1c3d_4d20_ae44_192909deb341(ArrayList<Integer> nums) {
        int maxCount = 0;
        int maxNum = 0;
        for (int num : nums) {
            if (num > maxCount) {
                maxCount = num;
                maxNum = num;
            } else if (num == maxCount) {
                if (num > maxNum) {
                    maxCount = num;
                    maxNum = num;
                }
            }
        }
        return maxCount;
    }

    
    public static int maxOccurrences_Problem_1_48a4be11_6cf7_4dce_8f3c_8ddb8e52347e(ArrayList<Integer> nums) {
        Map<Integer, Integer> count = new HashMap<Integer, Integer>();
        for (Integer num : nums) {
            Integer countVal = count.get(num);
            countVal = countVal == null ? 0 : countVal + 1;
            count.put(num, countVal);
        }
        Integer maxVal = null;
        for (Integer val : count.values()) {
            if (maxVal == null || val > maxVal) {
                maxVal = val;
            }
        }
        return maxVal;
    }

    
    public static int maxOccurrences_Problem_0_7fc6a493_4ec4_440b_bc4b_26a027f35965(ArrayList<Integer> nums) {
        // Write your code here
        int max = nums.get(0);
        int count = 1;
        for (int i = 1; i < nums.size(); i++) {
            if (nums.get(i) != nums.get(i - 1)) {
                max = Math.max(count, max);
                count = 1;
            } else {
                count++;
            }
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_0_ffe1f046_01fb_483e_926a_2cb30f5885dd(ArrayList<Integer> nums) {
        int frequency = 0;
        int max = nums.get(0);
        for(int i=0;i<nums.size();i++){
            if(nums.get(i)>max){
                frequency = 1;
                max = nums.get(i);
            }else if(nums.get(i)==max){
                frequency ++;
            }
        }
        return frequency;
    }

    
    public static int maxOccurrences_Problem_1_caa8a273_5d01_41dd_a8eb_9449bff81633(ArrayList<Integer> nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int max = Integer.MIN_VALUE;
        int count = Integer.MIN_VALUE;
        for(int num : nums) {
            if(!hm.containsKey(num)) {
                hm.put(num, 1);
            }
            else {
                hm.put(num, hm.get(num) + 1);
            }
            count = count + 1;
        }
        for(int i = 0; i < nums.size(); i++) {
            if(hm.get(nums.get(i)) > max) {
                max = hm.get(nums.get(i));
            }
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_0_f29bd447_74aa_44e3_93ee_9b81028de642(ArrayList<Integer> nums) {
        if (nums.size() == 1) {
            return 1;
        }
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (Integer num : nums) {
            Integer freq = freqMap.getOrDefault(num, 0L);
            freqMap.put(num, freq + 1);
        }
        int maxFreq = Collections.max(freqMap.values());
        Integer max = null;
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            if (entry.getValue() == maxFreq) {
                if (max == null || entry.getKey() > max) {
                    max = entry.getKey();
                }
            }
        }
        return max == null ? 0L : max;
    }

    
    public static int maxOccurrences_Problem_0_42d9e325_3403_43aa_be3d_41171f728d2f(ArrayList<Integer> nums) {
        Map<Integer, Integer> occurrences = new HashMap<>();
        for(Integer num : nums) {
            if(!occurrences.containsKey(num)) {
                occurrences.put(num, 1);
            } else {
                occurrences.put(num, occurrences.get(num) + 1);
            }
        }
        return occurrences.entrySet().stream().max((e1, e2) -> e1.getValue().compareTo(e2.getValue())).get().getKey();
    }

    
    public static int maxOccurrences_Problem_0_48a4be11_6cf7_4dce_8f3c_8ddb8e52347e(ArrayList<Integer> nums) {
        Map<Integer, Integer> count = new HashMap<Integer, Integer>();
        for (Integer num : nums) {
            Integer countVal = count.get(num);
            countVal = countVal == null ? 0 : countVal + 1;
            count.put(num, countVal);
        }
        Integer maxVal = null;
        for (Integer val : count.values()) {
            if (maxVal == null || val > maxVal) {
                maxVal = val;
            }
        }
        return maxVal;
    }

    
    public static int maxOccurrences_Problem_0_9ed87abc_756b_42ec_a157_b64c47710479(ArrayList<Integer> nums) {
        // Write your code here
        Integer[] arr = nums.toArray(new Integer[nums.size()]);
        Arrays.sort(arr);
        int maxFreq = 0;
        Integer maxValue = arr[arr.length-1];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == maxValue) {
                maxFreq += 1;
            } else {
                break;
            }
        }
        return maxFreq;
    }

    
    public static int maxOccurrences_Problem_2_ffe1f046_01fb_483e_926a_2cb30f5885dd(ArrayList<Integer> nums) {
        int frequency = 0;
        int max = nums.get(0);
        for(int i=0;i<nums.size();i++){
            if(nums.get(i)>max){
                frequency = 1;
                max = nums.get(i);
            }else if(nums.get(i)==max){
                frequency ++;
            }
        }
        return frequency;
    }

    
    public static int maxOccurrences_Problem_1_4a0e286c_7d2c_4b38_90e3_626f8b8f46c5(ArrayList<Integer> nums) {
        // Write your code here
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i : nums) {
            if(map.containsKey(i)) {
                map.put(i, map.get(i)+1);
            } else {
                map.put(i, 1);
            }
        }
        Integer key = 0L;
        int max = 0;
        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(entry.getValue() > max) {
                key = entry.getKey();
                max = entry.getValue();
            }
        }
        return key;
    }

    
    public static int maxOccurrences_Problem_1_3bb3f763_69e8_4662_a225_efca1ea2a6a1(ArrayList<Integer> nums) {
        int maxFreq = 0;
        int maxVal = nums.get(0);
        for (int l : nums) {
            if (l != 0) {
                if (l > maxVal) {
                    maxVal = l;
                }
                int count = 0;
                for (int i = 0; i < nums.size(); i++) {
                    if (l == nums.get(i)) {
                        count++;
                        if (count > maxFreq) {
                            maxFreq = count;
                            maxVal = l;
                        }
                    }
                }
            }
        }
        return maxVal;
    }

    
    public static int maxOccurrences_Problem_0_b512e66b_31ea_41fd_8a76_85a383718a17(ArrayList<Integer> nums) {
        int max=0;
        int count=0;
        for(int i=0;i<nums.size();i++) {
            count=0;
            for(int j=0;j<nums.size();j++) {
                if(nums.get(i)==nums.get(j)) {
                    count++;
                }
            }
            if(max<count) {
                max=count;
            }
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_2_52d87a90_c21b_4a08_9b88_57469a9e5479(ArrayList<Integer> nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(Integer l : nums) {
            if(map.containsKey(l)) {
                map.put(l,map.get(l)+1);
            } else {
                map.put(l,1L);
            }
        }
        int max = 0L;
        for(Integer key : map.keySet()) {
            if(max < map.get(key)) {
                max = map.get(key);
            }
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_0_a5a272a7_0dfe_46b5_b1e6_e6841a0cefe8(ArrayList<Integer> nums) {
        if (nums.size() <= 1) return 0;
        int result = nums.get(0);
        int max = 0;
        for (int i : nums) {
            int temp = result;
            result = (i == temp) ? ++result : 0;
            max = (max < result) ? result : max;
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_1_6d08b36b_65ba_4a8f_9094_aa21de3af2ba(ArrayList<Integer> nums) {
        
        return 0;
    }

    
    public static int maxOccurrences_Problem_0_f7b96427_583d_47fa_8d20_ff01922ebed4(ArrayList<Integer> nums) {
        // Write your code here
        
        if(nums.size() == 0)
            return 0;
        
        int maxCount = nums.get(0);
        int maxIndex = 0;
        
        for(int i = 1; i < nums.size(); i++) {
            if(nums.get(i) > maxCount) {
                maxCount = nums.get(i);
                maxIndex = i;
            }
        }
        
        return maxIndex;
    }

    
    public static int maxOccurrences_Problem_1_aad1e19e_e4f0_4d9f_a13c_c43dfd0ddb2f(ArrayList<Integer> nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1L);
            }
        }
        int max = 0;
        for (int key : map.keySet()) {
            max = Math.max(max, map.get(key));
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_1_ccda23bf_16f0_4c39_a276_c994b357dcbf(ArrayList<Integer> nums) {
        if (nums.size() == 0) return -1;
        int count = 0;
        int max = 0;
        int curr = 0;
        int i = 0;
        for (Integer num : nums) {
            curr = num;
            i++;
            if (i == 1) count = 1;
            else {
                count = count + 1;
            }
            if (count > max) {
                max = count;
            }
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_2_bc160813_9296_4cb3_a3d0_294141b6374e(ArrayList<Integer> nums) {
        int max_count = 0;
        int prev_count = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer a: nums) {
            prev_count = map.getOrDefault(a, 0L);
            map.put(a, prev_count + 1);
            if (prev_count > max_count) {
                max_count = prev_count;
            }
        }
        return max_count;
    }

    
    public static int maxOccurrences_Problem_0_35fdb1ce_5937_4833_a41f_3d25d22307fe(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        Integer candidate = nums.get(0);
        for(int i=0; i<nums.size(); i++) {
            if(nums.get(i)==candidate) {
                max++;
            }
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_1_f01749ab_ba9a_4eca_b4d8_a2546e6ba346(ArrayList<Integer> nums) {
        int max = 0;
        int maxIndex = 0;
        for(int i = 0; i < nums.size(); i++) {
            int num = nums.get(i);
            int count = 0;
            for(int j = 0; j < nums.size(); j++) {
                if(nums.get(j) == num) {
                    count++;
                }
            }
            if(count > max) {
                max = count;
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    
    public static int maxOccurrences_Problem_0_a31dd9ea_97ed_47f7_80b4_049ba4b9880f(ArrayList<Integer> nums) {
        // Write your code here
        int max = 0;
        int val;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.size(); i++){
            val = nums.get(i);
            if(map.containsKey(val)){
                int count = map.get(val);
                count++;
                map.put(val, count);
            }else{
                map.put(val, 1);
            }
        }
        for(int k : map.keySet()){
            if(map.get(k) > max){
                max = map.get(k);
            }
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_2_b5895158_5bc4_47e7_92b1_ee60c240b9e1(ArrayList<Integer> nums) {
        int max = 0;
        int maxCount = 0;
        int maxIndex = 0;
        for(int num : nums) {
            int count = Collections.frequency(nums, num);
            if(count > maxCount) {
                max = num;
                maxCount = count;
                maxIndex = num;
            }
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_1_42fd808c_c878_4464_b2b4_dc66e7f6faf1(ArrayList<Integer> nums) {
        int max = 0;
        int count = 0;
        for (int i : nums) {
            if (count == 0) {
                count = 1;
                max = i;
            } else if (i == max) {
                count++;
            } else {
                count--;
            }
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_1_f4aa775d_bf45_468e_a3cb_3f0d8eee2ab9(ArrayList<Integer> nums) {
        HashMap<Integer, Integer> frequencyMap = new HashMap<Integer, Integer>();
        for (Integer num : nums) {
            int count = 1;
            if (frequencyMap.containsKey(num)) {
                count += frequencyMap.get(num);
            }
            frequencyMap.put(num, count);
        }
        Integer maxValue = nums.get(0);
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > frequencyMap.get(maxValue)) {
                maxValue = entry.getKey();
            }
        }
        return maxValue;
    }

    
    public static int maxOccurrences_Problem_1_3d645be9_1434_4b95_a6b3_67f2d198040c(ArrayList<Integer> nums) {
        // Write your code here
        int maxCount = 0;
        int maxNum = 0;
        for(int num : nums) {
            if(num > maxNum) {
                maxNum = num;
                maxCount = 1;
            }
            else if(num == maxNum) {
                maxCount++;
            }
        }
        return maxCount;
    }

    
    public static int maxOccurrences_Problem_2_f3d32a36_41f5_4c9d_aaef_33d91bc66ef2(ArrayList<Integer> nums) {
        int maxFreq = 0, maxOccur = 0;
        Set<Integer> hashSet = new HashSet<Integer>();
        for (Integer num : nums) {
            if (hashSet.contains(num)) {
                hashSet.remove(num);
                hashSet.add(num);
            } else {
                hashSet.add(num);
            }
        }
        for (Integer num : hashSet) {
            maxOccur = nums.size();
            maxFreq = nums.size();
            for (Integer num2 : nums) {
                if (num2 == num) {
                    maxOccur--;
                    maxFreq--;
                }
            }
            if (maxOccur > 0) {
                maxFreq = nums.size();
            } else {
                maxOccur = nums.size();
            }
        }
        return maxFreq;
    }

    
    public static int maxOccurrences_Problem_0_15805e77_773e_46ff_bf12_493217d3d172(ArrayList<Integer> nums) {
        int max = 0;
        int min = Integer.MAX_VALUE;
        int count = 0;
        HashSet<Integer> visited = new HashSet<>();
        for(Integer n : nums) {
            if(visited.contains(n)) {
                count++;
                continue;
            }
            visited.add(n);
            if(count > max) {
                max = count;
            }
            count = 1;
        }
        if(count > max) {
            max = count;
        }
        return max;
    }

    
    public static int maxOccurrences_Problem_0_7bcdaeb7_1b46_49ab_bbb3_e57de85ce81d(ArrayList<Integer> nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int maxCount = 0;
        for (int num: nums) {
            int count = map.getOrDefault(num, 0);
            count++;
            map.put(num, count);
            maxCount = Math.max(maxCount, count);
        }
        return maxCount;
    }

    
    public static int maxOccurrences_Problem_2_55e21097_f4f1_4fd4_84d3_4986be3d9d1d(ArrayList<Integer> nums) {
        HashMap<Integer, Integer> count = new HashMap<>();
        int max = -1;
        for(int num: nums) {
            if(count.containsKey(num)) {
                count.put(num, count.get(num) + 1);
            } else {
                count.put(num, 1);
            }
        }
        for(Map.Entry<Integer, Integer> entry : count.entrySet()) {
            if(entry.getValue() > max) max = entry.getValue();
        }
        return max;
    }

}
