package mbpp_767_get_pairs_count;

public class mbpp_767_get_pairs_count {

    
    public static int getPairsCount_Problem_3_e032fcf6_6c26_455b_8d87_abbc83a41a81(ArrayList<Integer> arr, int sum) {
        // Your code goes here
        int count = 0L;
        int currentSum = 0L;
        for (Integer num : arr) {
            currentSum += num;
            if (currentSum == sum) {
                count++;
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_1_2e1846e8_84c1_4dce_ab88_ea8aac664373(ArrayList<Integer> arr, int sum) {
        // Write your code here
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_3_b138d2b2_81e3_4432_890e_6fe0baf178b6(ArrayList<Integer> arr, int sum) {
        // Write your code here
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_2_fe161724_555a_476e_bb90_7a3d4060f9d9(ArrayList<Integer> arr, int sum) {
        // Your code goes here
        int ans = 0;
        for (int i = 0; i < arr.size()-1; i++) {
            for (int j = i+1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == sum) {
                    ans++;
                }
            }
        }
        return ans;
    }

    
    public static int getPairsCount_Problem_2_c5dbcf74_871d_45fc_8fea_62f344d5fcec(ArrayList<Integer> arr, int sum) {
        int count = 0; // initialize count = 0
        for (Integer i: arr) {
            count += i;
        }
        return count;
    }

    
    public static int getPairsCount_Problem_0_5848dab1_ad58_45a4_8063_140dc451e5b0(ArrayList<Integer> arr, int sum) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            int sum1 = sum - arr.get(i);
            int sum2 = sum - arr.get(i + 1);
            if (sum1 >= 0 && sum2 >= 0) {
                if (sum1 < sum2) {
                    count++;
                } else {
                    count--;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_0_7b9391b3_e63e_4cf1_a45a_574857db986e(ArrayList<Integer> arr, int sum) {
        // your code goes here
        int count = 0;
        for(int i=0;i<arr.size();i++) {
            for(int j=i+1;j<arr.size();j++) {
                if(arr.get(i) + arr.get(j) == sum){
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_2_e7cafe5a_aea6_460b_b02d_5f12bae12104(ArrayList<Integer> arr, int sum) {
        // write your code here
        return 0;
    }

    
    public static int getPairsCount_Problem_3_da68c33a_d916_4c5a_9419_04f0b9a27523(ArrayList<Integer> arr, int sum) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_0_dbf6256f_40dd_41fc_9991_05121b60e577(ArrayList<Integer> arr, int sum) {
        // Write your code here
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_0_34038a77_c265_4ae1_a9a7_3a1d76869f87(ArrayList<Integer> arr, int sum) {
        int count = 0;
        for (int element : arr)
            if (element != 0 && element <= sum)
                count++;
        return count;
    }

    
    public static int getPairsCount_Problem_2_18fc81e7_a31a_4cc1_ab8c_c9a49dd2fe56(ArrayList<Integer> arr, int sum) {
        return  Math.ceil( arr.stream().filter(x->(x+sum)==sum).count()*1.0/2 );
    }

    
    public static int getPairsCount_Problem_1_a21acf3c_0358_411e_8149_4c210ccb1348(ArrayList<Integer> arr, int sum) {
        int numPairs = 0;
        for(int i : arr){
            int temp = i - sum;
            if(temp>=0) {
                numPairs += 1;
            }
        }
        return numPairs;
    }

    
    public static int getPairsCount_Problem_3_1f4f5249_3fe2_4fcb_b3fb_c843d93bc938(ArrayList<Integer> arr, int sum) {
        int totalPairsCount = 0;
        for (int l : arr) {
            for (int r : arr) {
                if (l == r) {
                    continue;
                }
                if (l + r == sum) {
                    totalPairsCount++;
                }
            }
        }
        return totalPairsCount;
    }

    
    public static int getPairsCount_Problem_2_ca6d972e_7309_4fa6_8c3d_419050a7bbcc(ArrayList<Integer> arr, int sum) {
        // Write your code here
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_3_e3bece64_7ba6_4582_a721_daf32362f9db(ArrayList<Integer> arr, int sum) {
        int pairs = 0L;
        for (Integer num : arr) {
            pairs += arr.stream().filter(w -> w == num).count();
        }
        return pairs;
    }

    
    public static int getPairsCount_Problem_1_d1e78ee9_2722_4ccd_a103_b0a414447646(ArrayList<Integer> arr, int sum) {
        int count = 0;
        for (Integer num : arr) {
            if (sum - num == 0)
                count++;
        }
        return count;
    }

    
    public static int getPairsCount_Problem_3_d6bf8b18_5514_44ce_a51b_01e7fb32069b(ArrayList<Integer> arr, int sum) {
        int count = 0;
        int sumOfArray = arr.get(0);
        for(int i = 1; i < arr.size(); i++) {
            sumOfArray += arr.get(i);
            if(sumOfArray == sum) {
                count++;
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_3_0e386f84_706d_4e91_a892_cffa23b945f3(ArrayList<Integer> arr, int sum) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            int left = arr.get(i);
            int right = arr.get(i + 1);
            while (left >= right) {
                left -= right;
                count += 1;
            }
            if (i == arr.size() - 1) {
                break;
            }
            int temp = arr.get(i);
            arr.set(i, arr.get(i + 1));
            arr.set(i + 1, temp);
            sum = sum - left;
            count = count + getPairsCount_Problem_3_0e386f84_706d_4e91_a892_cffa23b945f3(arr, sum);
            arr.set(i, arr.get(i + 1));
            arr.set(i + 1, temp);
            sum = sum - right;
            count = count + getPairsCount_Problem_3_0e386f84_706d_4e91_a892_cffa23b945f3(arr, sum);
        }
        return count;
    }

    
    public static int getPairsCount_Problem_2_90bfd318_c99c_45d2_a798_cb2085313520(ArrayList<Integer> arr, int sum) {
        int count = 0;
        for (Integer i : arr) {
            count += i;
        }
        count = count - sum;
        count = count + 1;
        return count;
    }

    
    public static int getPairsCount_Problem_1_4c43875b_9c19_44fe_82d7_24d9585f7a56(ArrayList<Integer> arr, int sum) {
        // Write your code here
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                if(arr.get(i) + arr.get(j) == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_3_51914fc2_46c0_4136_9662_94896c9cd6ef(ArrayList<Integer> arr, int sum) {
        return arr
                .stream()
                .filter(x -> x.equals(sum))
                .count();
    }

    
    public static int getPairsCount_Problem_1_d7eae898_e211_459a_9284_624cabc4c3f3(ArrayList<Integer> arr, int sum) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_0_9ca0d72a_09e6_4ec0_9468_ab416e26d9dd(ArrayList<Integer> arr, int sum) {
        int count = 0;
        for( int i : arr){
            for( int j : arr){
                if((i+j) == sum){
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_3_9958079f_5f75_44b5_b238_2eb5e6062ab1(ArrayList<Integer> arr, int sum) {
        int pairs = 0, lastArrElem = arr.get(arr.size() - 1);
        for (Integer num : arr) {
            if (num != lastArrElem)
                pairs++;
            lastArrElem = num;
        }
        return pairs;
    }

    
    public static int getPairsCount_Problem_2_06c06822_9b06_450a_baf6_b3158f26b07a(ArrayList<Integer> arr, int sum) {
        return  arr.stream().filter(x -> x + sum == sum).count();
    }

    
    public static int getPairsCount_Problem_2_3f302be8_53e5_4695_924b_c98e398c0f26(ArrayList<Integer> arr, int sum) {
        // write your code here
        return sum;
    }

    
    public static int getPairsCount_Problem_1_dbf6256f_40dd_41fc_9991_05121b60e577(ArrayList<Integer> arr, int sum) {
        // Write your code here
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_1_4fb72899_6e48_4d96_a410_382cc332e336(ArrayList<Integer> arr, int sum) {
        int count = 0;
        int sumOfArray = 0;
        for (int i : arr) {
            sumOfArray += i;
        }
        for (int i : arr) {
            sumOfArray -= i;
            if (sumOfArray == sum) {
                count++;
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_0_a585aeb3_cdd3_4f0e_afbb_189fc23851d1(ArrayList<Integer> arr, int sum) {
        int countPairs = 0;
        for (int i = 0; i < arr.size(); i++) {
            int first = arr.get(i);
            for (int j = i + 1; j < arr.size(); j++) {
                int second = arr.get(j);
                if (first + second == sum) {
                    countPairs++;
                }
            }
        }
        return countPairs;
    }

    
    public static int getPairsCount_Problem_2_6393d037_caf1_49ec_8d1f_6e8af2730553(ArrayList<Integer> arr, int sum) {
        // Write your code here
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_3_829538b5_7c91_4f4e_9652_0adf895c30dd(ArrayList<Integer> arr, int sum) {
        // Write your code here
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_0_ebe3d30a_ea93_4ac6_9ceb_62ce8897f2c6(ArrayList<Integer> arr, int sum) {
        int count = 0;
        for (int element : arr) {
            count += element % 2 == 0 ? 1 : 0;
        }
        return count;
    }

    
    public static int getPairsCount_Problem_2_6688d5fe_bb6a_42c4_ac9c_846b1d011f08(ArrayList<Integer> arr, int sum) {
        return arr.stream().filter(x -> x == sum).count() * arr.size();
    }

    
    public static int getPairsCount_Problem_3_c5dbcf74_871d_45fc_8fea_62f344d5fcec(ArrayList<Integer> arr, int sum) {
        int count = 0; // initialize count = 0
        for (Integer i: arr) {
            count += i;
        }
        return count;
    }

    
    public static int getPairsCount_Problem_3_9ca0d72a_09e6_4ec0_9468_ab416e26d9dd(ArrayList<Integer> arr, int sum) {
        int count = 0;
        for( int i : arr){
            for( int j : arr){
                if((i+j) == sum){
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_0_af3bf0b0_b105_4caf_b7ec_ccca0b0ac116(ArrayList<Integer> arr, int sum) {
        // Write your code here
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                if (arr.get(j) + arr.get(i) == sum)
                    count++;
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_1_a4ea5238_0045_4bbd_b969_124e7129e975(ArrayList<Integer> arr, int sum) {
        // initialize variables 
        int count = 0;
        int k = 0;
        int currentSum = 0;
        int sumOfNextTwoElements = -1;
        
        // traverse the array list 
        for(int i = 0; i < arr.size(); i++) {
            currentSum = arr.get(i);
            
            // if the current element sum is equal to sum, then increment the count 
            if(currentSum == sum) {
                count++;
            }
            // if current element sum is not equal to sum, then get the sum of next two elements 
            else if(currentSum != sum) {
                sumOfNextTwoElements = arr.get(i+1);
            }
        }
        
        // return the count 
        return count;
    }

    
    public static int getPairsCount_Problem_3_7f5fe650_8710_47a4_885c_65ae0359132d(ArrayList<Integer> arr, int sum) {
        int count = 0;
        int sumOfArray = arr.stream().mapToInteger(Integer::intValue).sum();
        if (sumOfArray == sum) {
            count = arr.stream().filter(x -> x == sum).count();
        }
        return count;
    }

    
    public static int getPairsCount_Problem_1_73f848cd_d752_4789_afc3_8dcf993ee0db(ArrayList<Integer> arr, int sum) {
        int count = 0;
        for(int i = 0; i<arr.size()-1; i++){
            int x = arr.get(i);
            int y = arr.get(i+1);
            if(x+y == sum){
                count++;
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_3_b8d1bec3_390a_4797_97be_ed014723a7c0(ArrayList<Integer> arr, int sum) {
        int result = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == sum) {
                result ++;
            }
        }
        return result;
    }

    
    public static int getPairsCount_Problem_2_162e0c75_8f9a_40d8_a693_ef9668a57933(ArrayList<Integer> arr, int sum) {
        // Write your code here
        return 0;
    }

    
    public static int getPairsCount_Problem_2_b138d2b2_81e3_4432_890e_6fe0baf178b6(ArrayList<Integer> arr, int sum) {
        // Write your code here
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_1_34f5d18a_c298_46cf_af7a_b8e0e12a75ae(ArrayList<Integer> arr, int sum) {
        // Write your code here
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_0_66f4e8e8_2f65_463f_966e_c5eb29c3f693(ArrayList<Integer> arr, int sum) {
        int numPairs = 0;
        for (Integer num : arr) {
            if (num.intValue() >= sum) {
                numPairs++;
            }
        }
        return numPairs;
    }

    
    public static int getPairsCount_Problem_1_b66fa464_ca18_470d_b329_4fd47ccff495(ArrayList<Integer> arr, int sum) {
        // Return the result in a int.
        int result = 0;
        // Write your code here
        for(int i=0; i<arr.size(); i++){
            for(int j=i+1; j<arr.size(); j++){
                if(arr.get(i)+arr.get(j) == sum){
                    result++;
                }
            }
        }
        return result;
    }

    
    public static int getPairsCount_Problem_1_7f5fe650_8710_47a4_885c_65ae0359132d(ArrayList<Integer> arr, int sum) {
        int count = 0;
        int sumOfArray = arr.stream().mapToInteger(Integer::intValue).sum();
        if (sumOfArray == sum) {
            count = arr.stream().filter(x -> x == sum).count();
        }
        return count;
    }

    
    public static int getPairsCount_Problem_3_b841a84b_53bd_4eeb_90c1_c0654d5efa1d(ArrayList<Integer> arr, int sum) {
        int count = 0;
        for (int i : arr) {
            for (int j : arr) {
                if (i != j && i + j == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_1_09190476_5911_4164_9ba7_df31573d6c3a(ArrayList<Integer> arr, int sum) {
        int result = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == sum) {
                    result = result + 1;
                    break;
                }
            }
        }
        return result;
    }

    
    public static int getPairsCount_Problem_2_f24360b3_62fe_4bf6_9660_51c862abec6c(ArrayList<Integer> arr, int sum) {
        int pairs = 0L;
        for (Integer x : arr) {
            pairs += arr.stream().filter((y) -> y == x).count();
        }
        return pairs;
    }

    
    public static int getPairsCount_Problem_2_399fd699_e425_48a0_b9a4_9d53cfcc3ab8(ArrayList<Integer> arr, int sum) {
        int count = 0;
        int sumOfArray = 0;
        for (int i : arr) {
            sumOfArray += i;
        }
        for (int i : arr) {
            if (sumOfArray == sum) {
                count++;
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_2_25b16e83_72b5_4522_93f2_2531ea8625bd(ArrayList<Integer> arr, int sum) {
        return arr.stream().filter( x -> x % 2 == 1 ).collect(Collectors.toList()).size();
    }

    
    public static int getPairsCount_Problem_1_e142d193_970a_41c0_9878_dd3f72583ed6(ArrayList<Integer> arr, int sum) {
        // Write your code here
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_3_8db6232d_7789_4b13_8bc7_88fb36a3ebc8(ArrayList<Integer> arr, int sum) {
        int pairsCount = 0;

        // loop the array list to count the pairs whose sum is equal to sum
        for (Integer i : arr) {
            int tempSum = sum;
            tempSum += i;
            for (Integer j : arr) {
                tempSum -= j;
                if (tempSum == sum) {
                    pairsCount++;
                }
            }
        }
        return pairsCount;
    }

    
    public static int getPairsCount_Problem_3_716c0b91_dafd_4f24_bb90_d2a9a41c0c4f(ArrayList<Integer> arr, int sum) {
        int count = 0;
        ArrayList<Integer> ints = new ArrayList<>();
        arr.stream().mapToInteger(Integer::intValue).forEach(n-> {
            if (sum == n) {
                ints.add(n);
            }
        });
        for (int n : ints) {
            for (int m : ints) {
                if (n == m && n != 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_1_863952c9_8791_4c88_a646_3b16f8684ad0(ArrayList<Integer> arr, int sum) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            int n = arr.get(i);
            int s = sum - n;
            if (s == 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_3_963963aa_aa8f_430a_a19f_b6286f06217e(ArrayList<Integer> arr, int sum) {
        // Create a Java stream on the array of numbers.
        int count = arr.stream().filter(num -> num % 2 == 0).count();
        // Return the number of pairs.
        return count;
    }

    
    public static int getPairsCount_Problem_3_06c06822_9b06_450a_baf6_b3158f26b07a(ArrayList<Integer> arr, int sum) {
        return  arr.stream().filter(x -> x + sum == sum).count();
    }

    
    public static int getPairsCount_Problem_3_d26eae03_a2c9_4ad3_a44a_5b3ef0d4e051(ArrayList<Integer> arr, int sum) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_3_f0a6869f_f4bc_4592_84c6_0a6702a36e48(ArrayList<Integer> arr, int sum) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            int leftSum = arr.get(i);
            int rightSum = sum - leftSum;
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(j) == rightSum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_1_903e7c64_fa11_4716_b8b9_6c8997dad9ec(ArrayList<Integer> arr, int sum) {
        int count = 0, result = 0;

        for (int n : arr)
            result += (n / 2) * (n / 2);

        if (result == sum)
            count++;

        return count;
    }

    
    public static int getPairsCount_Problem_3_eb49b993_8aa3_4fef_90d1_63dddb13cdd7(ArrayList<Integer> arr, int sum) {
        int count = 0;
        Integer[] numbers = new Integer[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            numbers[i] = arr.get(i);
        }
        Arrays.sort(numbers);
        for (int i = 0; i < numbers.length; i++) {
            count += Math.abs((numbers[i] + numbers[i + 1]) - sum);
        }
        return count;
    }

    
    public static int getPairsCount_Problem_3_c910f71a_e5cf_4e9e_ac20_b7f63034f4ee(ArrayList<Integer> arr, int sum) {
        if (arr.size() > 2) {
            int sum1 = 0;
            int sum2 = 0;
            for (int i = 0; i < arr.size() - 1; i++) {
                sum1 += arr.get(i);
                sum2 += arr.get(i + 1);
            }
            if (sum1 == sum) {
                return sum2;
            } else if (sum2 != sum) {
                return sum1;
            } else {
                return 0;
            }
        } else {
            return 0;
        }
    }

    
    public static int getPairsCount_Problem_1_90f8eaed_2043_4d1f_a494_2d5d8c69f596(ArrayList<Integer> arr, int sum) {
        int count = 0;
        for (Integer i : arr) {
            for (Integer j : arr) {
                if (i != j && i + j == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_1_269b40e0_a21a_4b1e_ab92_afc82f509afe(ArrayList<Integer> arr, int sum) {
        int count = 0;
        int sumOfArray = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            sumOfArray += arr.get(i);
            if (sumOfArray == sum) {
                count++;
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_1_51914fc2_46c0_4136_9662_94896c9cd6ef(ArrayList<Integer> arr, int sum) {
        return arr
                .stream()
                .filter(x -> x.equals(sum))
                .count();
    }

    
    public static int getPairsCount_Problem_2_954f6348_67a5_491a_b69c_854938e34a85(ArrayList<Integer> arr, int sum) {
        int pairs = 0;
        for (Integer i: arr) {
            for (Integer j: arr) {
                if (i != j && sum-i == j) {
                    pairs++;
                }
            }
        }
        return pairs;
    }

    
    public static int getPairsCount_Problem_1_2124efb2_f6f7_473a_ac22_a098e6f84034(ArrayList<Integer> arr, int sum) {
        int count = 0L;
        for (Integer l : arr) {
            for (Integer r : arr) {
                if (l != r) {
                    if (sum == sum) {
                        count += 2;
                    } else if (sum < sum) {
                        sum += l;
                        count += 2;
                    }
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_3_e803b43c_99e9_4719_b431_358d67a59159(ArrayList<Integer> arr, int sum) {
        // Write your code here.
        int count = 0;
        int sum1 = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum1 += arr.get(i);
        }
        if (sum1 == sum) {
            count += 1;
        }
        sum1 = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum1 += arr.get(i);
            if (sum1 == sum) {
                count += 1;
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_3_58153cf3_8fa3_41ee_a79d_5eda914800fd(ArrayList<Integer> arr, int sum) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_3_18fc81e7_a31a_4cc1_ab8c_c9a49dd2fe56(ArrayList<Integer> arr, int sum) {
        return  Math.ceil( arr.stream().filter(x->(x+sum)==sum).count()*1.0/2 );
    }

    
    public static int getPairsCount_Problem_2_fb36cdf4_d211_40d3_aea5_d66661184a70(ArrayList<Integer> arr, int sum) {
        // Write your code here
        // To print results to the standard output you can use System.out.println()
        // Example: System.out.println("Hello world!");
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_3_ef6b30c9_e37d_4ae7_8d87_f33472b6d355(ArrayList<Integer> arr, int sum) {
        int pairsCount = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == sum) {
                pairsCount++;
            }
        }
        return pairsCount;
    }

    
    public static int getPairsCount_Problem_0_e383d20c_f4ee_4f97_a308_07ab03c220a7(ArrayList<Integer> arr, int sum) {
        return IntStream.range(0, arr.size() - 1).filter(i -> arr.get(i) + arr.get(i + 1) == sum)
                .count();
    }

    
    public static int getPairsCount_Problem_0_ea2bc567_97a9_48f9_8f75_b93183034058(ArrayList<Integer> arr, int sum) {
        int count = 0;
        // write your code here
        for(int i = 0; i < arr.size(); i++){
            for(int j = 0; j < arr.size(); j++){
                if(i != j){
                    if(arr.get(i) == (arr.get(j) + sum)){
                        count++;
                    }
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_2_6a60ed38_3385_4dfc_a618_d19cf095bfd6(ArrayList<Integer> arr, int sum) {
        int count = 0;
        for (int e : arr) {
            if (sum - e == 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_0_f4b3917d_f84b_4b8c_a4a7_25056198d699(ArrayList<Integer> arr, int sum) {
        int count = 0;
        // loop on each element and add it to the sum
        for (int element : arr) {
            sum += element;
            // loop on the elements of the list and compare if the sum of them is equal to the sum
            for (int element2 : arr) {
                if (element == element2) {
                    count++;
                    // if the sum of two elements are equal then the loop will stop
                    break;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_0_84aec0ff_5e2d_4fe1_b6e7_00e04277490d(ArrayList<Integer> arr, int sum) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_0_4d568a5e_ae70_4791_bbd8_ae188c15ba03(ArrayList<Integer> arr, int sum) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_3_07d9c842_ae8d_4839_a11f_153585ac6a84(ArrayList<Integer> arr, int sum) {
        // Write your code here
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_1_fe161724_555a_476e_bb90_7a3d4060f9d9(ArrayList<Integer> arr, int sum) {
        // Your code goes here
        int ans = 0;
        for (int i = 0; i < arr.size()-1; i++) {
            for (int j = i+1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == sum) {
                    ans++;
                }
            }
        }
        return ans;
    }

    
    public static int getPairsCount_Problem_1_628da007_86e7_4d73_a70b_cdc8e985f384(ArrayList<Integer> arr, int sum) {
        int pairs = 0L;
        for (int i : arr) {
            if (sum - i != 0) {
                pairs += arr.indexOf(i + 1);
            }
        }
        return pairs;
    }

    
    public static int getPairsCount_Problem_1_bd142ef8_5b76_4414_8bce_76046e2d2dcf(ArrayList<Integer> arr, int sum) {
        // Write your code here
        return 0;
    }

    
    public static int getPairsCount_Problem_0_55ba9876_5b6a_445d_9d6c_7d290de240ae(ArrayList<Integer> arr, int sum) {
        int count = 0L;
        for (int l : arr) {
            for (int r : arr) {
                if (l == r) {
                    continue;
                }
                if (l > r) {
                    continue;
                }
                if (l >= sum) {
                    continue;
                }
                if (r >= sum) {
                    continue;
                }
                count ++;
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_1_cfba60ec_c9c9_47e2_be0d_567978ad410a(ArrayList<Integer> arr, int sum) {
        // Write your code here
        int sumPairs = 0;
        for(Integer l : arr) {
            for(Integer r : arr) {
                if (sum == l+r) {
                    sumPairs++;
                }
            }
        }
        return sumPairs;
    }

    
    public static int getPairsCount_Problem_0_663ece32_000a_4315_a2ec_ca33d79284c4(ArrayList<Integer> arr, int sum) {
        int count = 0;
        int sumOfArray = 0;
        for (int i : arr) {
            sumOfArray += i;
            if (sumOfArray == sum) {
                count++;
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_3_e4f0fa0b_b9d5_4c58_b398_a19b2706a265(ArrayList<Integer> arr, int sum) {
        int total = 0;
        int count = 0;
        for (int i : arr) {
            if (total + i == sum) {
                total++;
                count++;
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_2_9ca0d72a_09e6_4ec0_9468_ab416e26d9dd(ArrayList<Integer> arr, int sum) {
        int count = 0;
        for( int i : arr){
            for( int j : arr){
                if((i+j) == sum){
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_2_ceed6d88_1e04_477b_abb3_c1f14edca3e4(ArrayList<Integer> arr, int sum) {
        int totalPairCount = 0L;

        // Write your code here
        for (int n : arr) {
            totalPairCount += (n * (n + 1L) / 2);
        }
        return totalPairCount;
    }

    
    public static int getPairsCount_Problem_0_97a3b87c_9c4b_4541_bc2e_da700e257e0a(ArrayList<Integer> arr, int sum) {
        int count = 0;
        for (Integer i : arr) {
            for (Integer j : arr) {
                if (i != j && i + j == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_2_d45a0b6b_5a2c_4f67_881d_aa5a3136b79a(ArrayList<Integer> arr, int sum) {
        // Write your code here
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_2_bd142ef8_5b76_4414_8bce_76046e2d2dcf(ArrayList<Integer> arr, int sum) {
        // Write your code here
        return 0;
    }

    
    public static int getPairsCount_Problem_3_504d1fa1_e21e_4b74_9e8e_67a5ce331f58(ArrayList<Integer> arr, int sum) {
        int size = arr.size();
        int count =  Math.pow(arr.size(), 2);
        int sumOfPairs = sum;
        int pairs = 0;
        for(int i = 0; i < size; i++) {
            int temp = arr.get(i);
            for(int j=i; j < size; j++) {
                int temp2 = arr.get(j);
                if(temp+temp2 == sumOfPairs) {
                    pairs++;
                    break;
                }
            }
        }
        return pairs;
    }

    
    public static int getPairsCount_Problem_0_9958079f_5f75_44b5_b238_2eb5e6062ab1(ArrayList<Integer> arr, int sum) {
        int pairs = 0, lastArrElem = arr.get(arr.size() - 1);
        for (Integer num : arr) {
            if (num != lastArrElem)
                pairs++;
            lastArrElem = num;
        }
        return pairs;
    }

    
    public static int getPairsCount_Problem_3_f4b3917d_f84b_4b8c_a4a7_25056198d699(ArrayList<Integer> arr, int sum) {
        int count = 0;
        // loop on each element and add it to the sum
        for (int element : arr) {
            sum += element;
            // loop on the elements of the list and compare if the sum of them is equal to the sum
            for (int element2 : arr) {
                if (element == element2) {
                    count++;
                    // if the sum of two elements are equal then the loop will stop
                    break;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_0_92291222_0804_486c_9217_a18c6ec06dc7(ArrayList<Integer> arr, int sum) {
        // Write your code here
        int count = 0;
        for(int i = 0; i < arr.size(); i++){
            for(int j = i+1; j < arr.size(); j++){
                if(arr.get(i) + arr.get(j) == sum){
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_2_a21acf3c_0358_411e_8149_4c210ccb1348(ArrayList<Integer> arr, int sum) {
        int numPairs = 0;
        for(int i : arr){
            int temp = i - sum;
            if(temp>=0) {
                numPairs += 1;
            }
        }
        return numPairs;
    }

    
    public static int getPairsCount_Problem_0_39106257_0c2b_482f_8cc0_287cf6984d44(ArrayList<Integer> arr, int sum) {
        int pairs = 0;
        // Write code here
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i+1; j < arr.size(); j++) {
                if(arr.get(i) + arr.get(j) == sum) {
                    pairs++;
                }
            }
        }
        return pairs;
    }

    
    public static int getPairsCount_Problem_0_98014f3f_d912_4440_980f_6e766646016f(ArrayList<Integer> arr, int sum) {
        int count = 0;
        for (Integer v : arr) {
            if (v != 0) {
                int temp = sum - v;
                if (temp > 0) {
                    count += temp;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_3_f4a07523_67a3_4b3d_a59e_7e21b5216d94(ArrayList<Integer> arr, int sum) {
        // Write your code here
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_1_fdf355e4_57e0_440e_8582_a5c899bff259(ArrayList<Integer> arr, int sum) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_1_716c0b91_dafd_4f24_bb90_d2a9a41c0c4f(ArrayList<Integer> arr, int sum) {
        int count = 0;
        ArrayList<Integer> ints = new ArrayList<>();
        arr.stream().mapToInteger(Integer::intValue).forEach(n-> {
            if (sum == n) {
                ints.add(n);
            }
        });
        for (int n : ints) {
            for (int m : ints) {
                if (n == m && n != 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_0_a3da53cc_64f1_4276_93e6_9bb5968e16b2(ArrayList<Integer> arr, int sum) {
        // write your code here
        int count = 0;
        int temp = 0;
        for (int i = 0; i < arr.size(); i++) {
            int num = arr.get(i);
            if (num > sum) {
                count += 1;
            } else if (num == sum) {
                temp += 1;
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_1_30fad1e5_5e47_4784_83bf_b789c9c5e318(ArrayList<Integer> arr, int sum) {
        int count = 0;
        int sumOfArray = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            sumOfArray = sumOfArray + arr.get(i);
            if (sumOfArray == sum) {
                count++;
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_0_f24360b3_62fe_4bf6_9660_51c862abec6c(ArrayList<Integer> arr, int sum) {
        int pairs = 0L;
        for (Integer x : arr) {
            pairs += arr.stream().filter((y) -> y == x).count();
        }
        return pairs;
    }

    
    public static int getPairsCount_Problem_0_a78a09f3_50a4_4df5_98b2_32b11f2d336e(ArrayList<Integer> arr, int sum) {
        int pairs = 0;
        
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i+1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == sum) {
                    pairs++;
                }
            }
        }
        
        return pairs;
    }

    
    public static int getPairsCount_Problem_1_c910f71a_e5cf_4e9e_ac20_b7f63034f4ee(ArrayList<Integer> arr, int sum) {
        if (arr.size() > 2) {
            int sum1 = 0;
            int sum2 = 0;
            for (int i = 0; i < arr.size() - 1; i++) {
                sum1 += arr.get(i);
                sum2 += arr.get(i + 1);
            }
            if (sum1 == sum) {
                return sum2;
            } else if (sum2 != sum) {
                return sum1;
            } else {
                return 0;
            }
        } else {
            return 0;
        }
    }

    
    public static int getPairsCount_Problem_3_34f5d18a_c298_46cf_af7a_b8e0e12a75ae(ArrayList<Integer> arr, int sum) {
        // Write your code here
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_3_162e0c75_8f9a_40d8_a693_ef9668a57933(ArrayList<Integer> arr, int sum) {
        // Write your code here
        return 0;
    }

    
    public static int getPairsCount_Problem_3_663ece32_000a_4315_a2ec_ca33d79284c4(ArrayList<Integer> arr, int sum) {
        int count = 0;
        int sumOfArray = 0;
        for (int i : arr) {
            sumOfArray += i;
            if (sumOfArray == sum) {
                count++;
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_2_b1dc579f_eb6d_44a1_95f6_a459d4bb050f(ArrayList<Integer> arr, int sum) {
        int result = 0;
        for (int i = 0; i < arr.size(); i++) {
            int num = arr.get(i);
            if (num != 0) {
                if (sum - num == 0) {
                    result += 1;
                }
            }
        }
        return result;
    }

    
    public static int getPairsCount_Problem_2_180155b1_33cd_4c8a_a28f_ad9d8d2940ae(ArrayList<Integer> arr, int sum) {
        // Write your code here
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_1_97a3b87c_9c4b_4541_bc2e_da700e257e0a(ArrayList<Integer> arr, int sum) {
        int count = 0;
        for (Integer i : arr) {
            for (Integer j : arr) {
                if (i != j && i + j == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_3_55ba9876_5b6a_445d_9d6c_7d290de240ae(ArrayList<Integer> arr, int sum) {
        int count = 0L;
        for (int l : arr) {
            for (int r : arr) {
                if (l == r) {
                    continue;
                }
                if (l > r) {
                    continue;
                }
                if (l >= sum) {
                    continue;
                }
                if (r >= sum) {
                    continue;
                }
                count ++;
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_1_5d5cb827_41dd_4be8_b8fd_fd7abcf53a20(ArrayList<Integer> arr, int sum) {
        if (arr.size() == 0) {
            return 0;
        }
        int countPairs = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            int firstNum = arr.get(i);
            int secondNum = arr.get(i + 1);
            if (firstNum + secondNum == sum) {
                countPairs++;
            }
        }
        return countPairs;
    }

    
    public static int getPairsCount_Problem_0_44da26a2_c685_4b5b_9b05_552ca1d3d1b6(ArrayList<Integer> arr, int sum) {
        int count = 0;
        for (Integer i : arr) {
            for (Integer j : arr) {
                if (i != j && sum - i + j == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_1_ab8da46c_3928_46dc_b449_a8f7407d09c4(ArrayList<Integer> arr, int sum) {
        // Write your code here
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_0_1434279b_aa51_4fd5_8805_e718ae18c643(ArrayList<Integer> arr, int sum) {
        int count = 0L;
        for(int i=0; i<arr.size(); i++){
            for(int j=i+1; j<arr.size(); j++){
                if(arr.get(i) + arr.get(j) == sum)
                    count ++;
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_3_6847cfd6_8cf9_4a2b_a427_845dec99a757(ArrayList<Integer> arr, int sum) {
        // Write your code here
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                if(arr.get(i) + arr.get(j) == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int getPairsCount_Problem_3_903e7c64_fa11_4716_b8b9_6c8997dad9ec(ArrayList<Integer> arr, int sum) {
        int count = 0, result = 0;

        for (int n : arr)
            result += (n / 2) * (n / 2);

        if (result == sum)
            count++;

        return count;
    }

}
