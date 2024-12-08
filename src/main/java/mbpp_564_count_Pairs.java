package mbpp_564_count_Pairs;

public class mbpp_564_count_Pairs {

    
    public static int countPairs_Problem_0_b3edca36_4040_45db_8d9d_1efb5b9b07e1(ArrayList<Integer> arr, int n) {
        int countA = 0;
        int countB = 0;
        for (int i : arr) {
            if (i != n - 1) {
                countA++;
            }
        }
        for (int i : arr) {
            if (i != 0) {
                countB++;
            }
        }
        return countA * countB;
    }

    
    public static int countPairs_Problem_0_1ec45c3a_2c25_4029_806f_2dfd9d4a6abb(ArrayList<Integer> arr, int n) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) != arr.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_0_389c1810_ae30_4a0f_884d_a17db75e8d79(ArrayList<Integer> arr, int n) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) != arr.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_0_b000be80_9005_4150_af8a_b62f668adda3(ArrayList<Integer> arr, int n) {
        int count = 0L;
        int size = arr.size();
        int pair;
        // Iterate through the array and calculate the number of pairs possible.
        for (int i = 0; i < size; i++) {
            pair = i;
            while (i < size && arr.get(i) == arr.get(i + 1)) {
                i++;
                pair++;
            }
            count += Math.pow(pair, 2);
        }
        return count;
    }

    
    public static int countPairs_Problem_2_9f86bc2f_f81a_4bfc_9af8_4e5741979f22(ArrayList<Integer> arr, int n) {
        int ans = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i+1; j < arr.size(); j++) {
                if(arr.get(i) == arr.get(j) && i != j) {
                    ans++;
                }
            }
        }
        return ans;
    }

    
    public static int countPairs_Problem_0_1dd676ea_b905_4bc2_a319_ee7db76a5b63(ArrayList<Integer> arr, int n) {
        int count = 0, counter = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i+1; j < arr.size(); j++) {
                if(arr.get(i) != arr.get(j)) {
                    counter++;
                }
            }
            count = counter;
            counter = 0;
        }
        return count;
    }

    
    public static int countPairs_Problem_1_ad84926b_45d4_43cc_811f_13da80a6f876(ArrayList<Integer> arr, int n) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) != arr.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_0_2eb50c14_ba52_44e0_b0c1_490f0e535464(ArrayList<Integer> arr, int n) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) != arr.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_2_6b7fb952_ab7a_4810_ad9c_aa92bd916e36(ArrayList<Integer> arr, int n) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) != arr.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_0_30dac20e_f952_4480_854e_ac22e15048b3(ArrayList<Integer> arr, int n) {
        int count = 0;
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            for(int j = i + 1; j < arr.size(); j++) {
                if(arr.get(i) == arr.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_2_61c75488_7519_4453_9fbd_6b2ab115d5b6(ArrayList<Integer> arr, int n) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) != arr.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_0_a5802c29_05f8_4173_8cbc_325e8f0478be(ArrayList<Integer> arr, int n) {
        int counter = 0;
        int minVal = Integer.MAX_VALUE;
        int maxVal = Integer.MIN_VALUE;
        for (Integer e : arr) {
            minVal = Math.min(minVal, e);
            maxVal = Math.max(maxVal, e);
            if (maxVal - minVal <= 1) {
                counter++;
            }
        }
        System.out.println(n + " pairs (" + counter + " pairs) are possible (" + minVal + " <= x <= " + maxVal + ")");
        return counter;
    }

    
    public static int countPairs_Problem_0_6ae424e0_0b4b_47cc_ad1e_5104078f7956(ArrayList<Integer> arr, int n) {
        int count = 0;
        int temp = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                if(arr.get(i) == arr.get(j)) {
                    temp++;
                }
            }
            if(temp == n) {
                count++;
                temp = 0;
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_0_1c24bbca_210f_4dba_b1c9_64d0995fccd8(ArrayList<Integer> arr, int n) {
        int count = 0;
        int pairs = 0;
        int temp = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                if(arr.get(i) == arr.get(j)) {
                    temp++;
                }
            }
            pairs += temp;
            temp = 0;
        }
        count += pairs;
        return count;
    }

    
    public static int countPairs_Problem_1_2617434c_2fbc_499e_852b_bcb3f9a491be(ArrayList<Integer> arr, int n) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) != arr.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_2_0fa391cc_741b_4338_baad_d7d6113059eb(ArrayList<Integer> arr, int n) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) != arr.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_2_e3c5b22c_c0a8_4ffa_a0f3_dcc34d85e9da(ArrayList<Integer> arr, int n) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) != arr.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_2_fd0da749_faff_42c0_93de_290df058ee7a(ArrayList<Integer> arr, int n) {
        // (1)
        int count = 0;
        // iterate the array
        for (int i = 0; i < arr.size() - 1; i++) {
            // if any pair is found, add the count
            if (arr.contains(i + n)) {
                count += 1;
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_1_88b20796_2bb5_48d2_b368_4f89f75aa19c(ArrayList<Integer> arr, int n) {
        int pairs=0;
        for(int i=0; i<arr.size(); i++){
            for(int j=i+1; j<arr.size(); j++){
                if (arr.get(i)!=arr.get(j)){
                    pairs += 1;
                    break;
                }
            }
        }
        return pairs;
    }

    
    public static int countPairs_Problem_0_1ed8942b_36b2_4fee_973a_6b9353645ead(ArrayList<Integer> arr, int n) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) != arr.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_2_a32829e2_686a_4116_b68c_01437d6f029a(ArrayList<Integer> arr, int n) {
        int count = 2;
        int maxNum = 1;
        for(int i=0; i<arr.size(); i++) {
            int num1 = Math.abs(arr.get(i));
            int num2 = Math.abs(arr.get(i-1));
            int sum = num1 + num2;
            int maxSum = Math.abs(sum);
            if (maxSum > n) {
                break;
            }
            if (sum == 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_2_d5187c67_bd25_445d_bec1_a986a6b2a828(ArrayList<Integer> arr, int n) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) != arr.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_2_64bb4bff_aa16_4118_914d_0b391d561373(ArrayList<Integer> arr, int n) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) != arr.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_0_08bd62a3_7009_4c94_a0e8_49268d7eecf3(ArrayList<Integer> arr, int n) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) != arr.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_1_3c1f09a3_7ff9_4e8f_acfe_6a7f7a760d24(ArrayList<Integer> arr, int n) {
        int count = 0;
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
        }
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                if(arr.get(i) == arr.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_1_0a0f67e7_f49f_4e92_8cb7_84fcae8e92e6(ArrayList<Integer> arr, int n) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) != arr.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_0_8ffa85b4_9b12_45b3_9207_53ab2c178c1a(ArrayList<Integer> arr, int n) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) != arr.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_2_e3cd375f_32b1_411e_aca1_4fae98f44da4(ArrayList<Integer> arr, int n) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) != arr.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_2_70e8ac9d_2a94_434d_97db_23a479f465d4(ArrayList<Integer> arr, int n) {
        Set<Integer> unorderedPairs = new HashSet<>();
        int count = 0;
        for(int i = 1; i<=n; i++) {
            for(int j=1; j<=n; j++) {
                int sum = i*j;
                if(sum == n) {
                    unorderedPairs.add(sum);
                }
            }
        }
        for(Integer unorderedPair : unorderedPairs) {
            for(Integer elem : arr) {
                if(elem == unorderedPair) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_0_67586498_fe25_498b_9d16_45fafc9c40b9(ArrayList<Integer> arr, int n) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) != arr.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_1_6ae424e0_0b4b_47cc_ad1e_5104078f7956(ArrayList<Integer> arr, int n) {
        int count = 0;
        int temp = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                if(arr.get(i) == arr.get(j)) {
                    temp++;
                }
            }
            if(temp == n) {
                count++;
                temp = 0;
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_0_1bba7d96_69f7_442f_ad98_f0dbb761b792(ArrayList<Integer> arr, int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            if (i > n / 2) {
                result *= i;
            }
            else
                result *= (arr.size() - i);
        }
        return result;
    }

    
    public static int countPairs_Problem_1_8b73ddd6_cbe3_4ec3_bcd7_ec807639e98b(ArrayList<Integer> arr, int n) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr.get(i) != arr.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_2_b000be80_9005_4150_af8a_b62f668adda3(ArrayList<Integer> arr, int n) {
        int count = 0L;
        int size = arr.size();
        int pair;
        // Iterate through the array and calculate the number of pairs possible.
        for (int i = 0; i < size; i++) {
            pair = i;
            while (i < size && arr.get(i) == arr.get(i + 1)) {
                i++;
                pair++;
            }
            count += Math.pow(pair, 2);
        }
        return count;
    }

    
    public static int countPairs_Problem_0_65fd176b_ec1d_4a14_9fda_ab467089bb1e(ArrayList<Integer> arr, int n) {
        int count = 0;
        int temp;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                if(arr.get(i) == arr.get(j)) {
                    temp = arr.get(i);
                    arr.set(i, arr.get(j));
                    arr.set(j, temp);
                }
            }
        }
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                if(arr.get(i) != arr.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_1_cfd34bee_1113_4a2d_9282_055020d7920a(ArrayList<Integer> arr, int n) {
        int count = 0;
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            for(int j = i + 1; j < arr.size(); j++) {
                if(arr.get(i) == arr.get(j)) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_1_e3cd375f_32b1_411e_aca1_4fae98f44da4(ArrayList<Integer> arr, int n) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) != arr.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_1_d9fb9da9_3a9a_471a_bb9b_1db279decda6(ArrayList<Integer> arr, int n) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) != arr.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_2_eb3a3d70_9ae9_4d82_a1e5_2a34bae8a3cd(ArrayList<Integer> arr, int n) {
        int count = 0;
        int sum = 0;
        int temp;
        for(int i = 0; i < arr.size(); i++) {
            temp = arr.get(i);
            for(int j = i + 1; j < arr.size(); j++) {
                if(arr.get(j) == temp) {
                    sum++;
                }
            }
            count += sum;
            sum = 0;
        }
        return count;
    }

    
    public static int countPairs_Problem_2_3f8b240d_bc45_4817_a53c_3a37c778d4e9(ArrayList<Integer> arr, int n) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) != arr.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_2_43d85d4e_2d45_4b91_a434_7fc402795f78(ArrayList<Integer> arr, int n) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) != arr.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_2_79b3179e_fd43_4dd4_baf7_76bfed7a20e6(ArrayList<Integer> arr, int n) {
        int count = 0;
        int temp = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i+1; j < arr.size(); j++) {
                if(arr.get(i) == arr.get(j)) {
                    temp++;
                }
            }
            count += temp;
            temp = 0;
        }
        return count;
    }

    
    public static int countPairs_Problem_1_4ee70026_0511_46a7_9faf_93264ecf0681(ArrayList<Integer> arr, int n) {
        int result=0;
        for (int i = 0; i < arr.size(); i++) {
            if(i>0)
            {
                if(arr.get(i)!=arr.get(i-1))
                {
                    result++;
                }
            }
        }
        int sum=n;
        return sum*(sum-1)/2+result;
    }

    
    public static int countPairs_Problem_2_e7722c59_108e_47d9_9886_94b9bf7e6735(ArrayList<Integer> arr, int n) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) != arr.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_1_519fe88f_f739_4cd2_a39b_b9caa148fdef(ArrayList<Integer> arr, int n) {
        int numPairs=0;
        for (Integer aa : arr) {
            for (Integer bb : arr) {
                if ((aa != bb) && ((aa == n) && (bb == n))) {
                    numPairs++;
                    break;
                }
            }
        }
        return numPairs;
    }

    
    public static int countPairs_Problem_2_83135af9_acd9_4627_8f59_ca5b4613d922(ArrayList<Integer> arr, int n) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) != arr.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_1_b3ae82af_bcc3_4bf7_a96b_2a6085294485(ArrayList<Integer> arr, int n) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr.get(i) != arr.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_0_b198ce45_f0bd_4292_a463_2c463a6d4ad5(ArrayList<Integer> arr, int n) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) != arr.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_2_2f8ac59a_adf0_4f58_ad02_9e5260754a42(ArrayList<Integer> arr, int n) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) != arr.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_1_eb3a3d70_9ae9_4d82_a1e5_2a34bae8a3cd(ArrayList<Integer> arr, int n) {
        int count = 0;
        int sum = 0;
        int temp;
        for(int i = 0; i < arr.size(); i++) {
            temp = arr.get(i);
            for(int j = i + 1; j < arr.size(); j++) {
                if(arr.get(j) == temp) {
                    sum++;
                }
            }
            count += sum;
            sum = 0;
        }
        return count;
    }

    
    public static int countPairs_Problem_1_c145d6d2_82e1_470e_949e_d0f08718a693(ArrayList<Integer> arr, int n) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) != arr.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_1_3d6b4ace_6072_45e7_bb14_afb514ba8444(ArrayList<Integer> arr, int n) {
        int counter = 0;
        for(int i =0; i < arr.size(); i++) {
            for(int j=i+1; j < arr.size(); j++) {
                if(arr.get(i) == arr.get(j)) {
                    counter++;
                }
            }
        }
        return counter;
    }

    
    public static int countPairs_Problem_1_aa0eee70_595c_4480_aa31_ef611af55a5f(ArrayList<Integer> arr, int n) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) != arr.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_1_ab2810b2_dbbf_4206_a2e9_0a5a416954f2(ArrayList<Integer> arr, int n) {
        int count = 0;
        int temp = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                if(arr.get(i) == arr.get(j)) {
                    temp++;
                }
            }
            if(temp == n) {
                count++;
                temp = 0;
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_1_d7e721ec_c56f_42a8_bc8a_3a484d8c14e1(ArrayList<Integer> arr, int n) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) != arr.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_1_8b3ac1b9_9a26_45f5_a6d7_46a612785a83(ArrayList<Integer> arr, int n) {
        int count = 0;
        int minNum = arr.get(0);
        int maxNum = arr.get(arr.size() - 1);
        for (int i = 0; i < arr.size(); i++) {
            if (i != 0) {
                int tempMinNum = minNum;
                int tempMaxNum = maxNum;
                minNum = Math.min(arr.get(i), minNum);
                maxNum = Math.max(arr.get(i), maxNum);
                if (tempMinNum == minNum && tempMaxNum == maxNum)
                    count++;
            }
            if (arr.get(i) == minNum && arr.get(i) == maxNum) {
                count++;
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_1_84ce8326_4755_4ad2_85ba_74396a2b1478(ArrayList<Integer> arr, int n) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) != arr.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_0_b364eb8a_489e_4dd0_a6b7_58af5e24cdb1(ArrayList<Integer> arr, int n) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) != arr.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_0_bf4f4a0c_3dd0_479a_a303_f99308aaec7b(ArrayList<Integer> arr, int n) {
        int count = 0;
        int temp;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                temp = arr.get(i);
                arr.set(i, arr.get(j));
                arr.set(j, temp);
                if(arr.get(i) != arr.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_2_fc81e216_ae7a_4e2e_bcae_93641ccb9fdb(ArrayList<Integer> arr, int n) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) != arr.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_2_19d8ca53_31dd_44e9_8f02_d895605241e7(ArrayList<Integer> arr, int n) {
        int count = 0;
        int sum = 0;
        int temp;
        for(int i = 0; i < arr.size(); i++) {
            temp = arr.get(i);
            for(int j = i + 1; j < arr.size(); j++) {
                if(temp == arr.get(j)) {
                    sum++;
                }
            }
            count += sum;
            sum = 0;
        }
        return count;
    }

    
    public static int countPairs_Problem_1_55a58254_93ba_450e_8b15_dbc0802cbb04(ArrayList<Integer> arr, int n) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) != arr.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_2_e6163523_be32_4695_8fa9_dc4404076378(ArrayList<Integer> arr, int n) {
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                if(arr.get(i) != arr.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_1_dad36eab_9839_4ef2_819e_47666f536262(ArrayList<Integer> arr, int n) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) != arr.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_0_a8cb4edb_c05d_459c_86a1_d7d4617bda2c(ArrayList<Integer> arr, int n) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) != arr.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_0_a6919288_2ab1_4af0_9c31_358af3da1959(ArrayList<Integer> arr, int n) {
        // Write your code here
        int count = 1;
        for(int i = 1; i < n; i++) {
            for(int j = i; j < n; j++) {
                int x = arr.get(i);
                int y = arr.get(j);
                if(x != y) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_0_b25ad25b_c34f_4b82_bae6_6d20bcfed244(ArrayList<Integer> arr, int n) {
        int countPairs_Problem_0_b25ad25b_c34f_4b82_bae6_6d20bcfed244=0;
        int temp;
        for(int i=0;i<arr.size()-1;i++){
            for(int j=i+1;j<arr.size();j++){
                temp=arr.get(i);
                arr.set(i, arr.get(j));
                arr.set(j, temp);
                if(arr.get(i)==arr.get(j)){
                    countPairs_Problem_0_b25ad25b_c34f_4b82_bae6_6d20bcfed244++;
                    for(int k=0;k<i;k++){
                        arr.set(i, arr.get(k));
                    }
                    for(int k=i;k<arr.size();k++){
                        arr.set(k, arr.get(k));
                    }
                }
            }
        }
        for(int i=0;i<arr.size();i++){
            arr.remove(i);
        }
        return countPairs_Problem_0_b25ad25b_c34f_4b82_bae6_6d20bcfed244;
    }

    
    public static int countPairs_Problem_2_c47433e4_ffdf_4456_a925_1de3e10b61b2(ArrayList<Integer> arr, int n) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) != arr.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_1_e6163523_be32_4695_8fa9_dc4404076378(ArrayList<Integer> arr, int n) {
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                if(arr.get(i) != arr.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_2_414d43ff_2f3d_429a_9d94_b08ba09fb50a(ArrayList<Integer> arr, int n) {
        int count = 0;
        for (int element : arr) {
            for (int element2 : arr) {
                if (element != element2) {
                    if (element % 2 == 0 && element2 % 2 == 1) {
                        count++;
                        break;
                    }
                    if (element % 2 == 1 && element2 % 2 == 0) {
                        count++;
                        break;
                    }
                    if (element % 2 == 1 && element2 % 2 == 1) {
                        count++;
                        break;
                    }
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_1_33201049_2ab0_4110_bfe3_599dc354c19d(ArrayList<Integer> arr, int n) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) != arr.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_1_f9d18198_ff70_427d_897c_880267785049(ArrayList<Integer> arr, int n) {
        int count = 0;
        int sum = 0;
        int temp = 0;
        for(int i = 0; i < arr.size(); i++) {
            temp = arr.get(i);
            for(int j = i + 1; j < arr.size(); j++) {
                sum += temp;
                count += sum;
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_0_19bb6771_c39d_4b75_96c7_aae8ce99d360(ArrayList<Integer> arr, int n) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr.get(i) != arr.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_0_66fc21f8_d003_48a1_b586_6a125d988d16(ArrayList<Integer> arr, int n) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) != arr.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_0_75a8196d_ef08_4bb7_9a9a_d5ac37697c0b(ArrayList<Integer> arr, int n) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) != arr.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_2_c145d6d2_82e1_470e_949e_d0f08718a693(ArrayList<Integer> arr, int n) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) != arr.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_0_64bb4bff_aa16_4118_914d_0b391d561373(ArrayList<Integer> arr, int n) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) != arr.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_0_fd0da749_faff_42c0_93de_290df058ee7a(ArrayList<Integer> arr, int n) {
        // (1)
        int count = 0;
        // iterate the array
        for (int i = 0; i < arr.size() - 1; i++) {
            // if any pair is found, add the count
            if (arr.contains(i + n)) {
                count += 1;
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_0_9395080a_60a3_4a62_b903_fa06d3122a0f(ArrayList<Integer> arr, int n) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) != arr.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_1_50b05cf0_af81_48e1_8ccd_e2501d20d3a0(ArrayList<Integer> arr, int n) {
        int count = 0;
        for( int i = 0; i < arr.size(); i++ ) {
            for( int j = i+1; j < arr.size(); j++ ) {
                if(arr.get(i) != arr.get(j)) {
                    count += 1;
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_1_5830c518_fbbb_4b3d_90f8_8a0668de8519(ArrayList<Integer> arr, int n) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) != arr.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_2_3f7ba1a9_468f_47d2_aea1_43767eeb212b(ArrayList<Integer> arr, int n) {
        // your answer starts here
        if (n <= 1)
            return n;
        int count1 = 1;
        int count2 = 1;
        for (Integer val: arr)
            if (val != n)
                count2++;
        for (Integer val: arr)
            if (val == n)
                count1++;
        if (count1 > count2)
            return count1;
        else
            return count2;
        // return (count1 + count2);
    }

    
    public static int countPairs_Problem_0_d5187c67_bd25_445d_bec1_a986a6b2a828(ArrayList<Integer> arr, int n) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) != arr.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_1_b13d7be6_5c60_4247_99dc_8f21c62715e0(ArrayList<Integer> arr, int n) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) != arr.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_1_f6191ac4_b578_400b_93e8_70f45b72ae84(ArrayList<Integer> arr, int n) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) != arr.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_1_2c2c1a7f_97d5_4a58_937c_fc53b1daedc7(ArrayList<Integer> arr, int n) {
        // TODO Auto-generated method stub
        int count=0;
        int total=0;
        for(Integer l : arr){
            int temp=0;
            for(Integer k : arr){
                int sum=l+k;
                temp+=Math.pow(sum,2);
            }
            count+=temp;
            total+=temp;
        }
        
        return total;
    }

    
    public static int countPairs_Problem_2_cad2f07c_f4dc_4555_9904_a7adb4dce37e(ArrayList<Integer> arr, int n) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr.get(i) != arr.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_1_19ac5e0c_4c1b_4449_8944_5af5c3c105d4(ArrayList<Integer> arr, int n) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) != arr.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_2_9ba39982_4c60_4389_b203_292633850cf5(ArrayList<Integer> arr, int n) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) != arr.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_1_9530883a_b335_4b44_89a0_ed9a5571bcff(ArrayList<Integer> arr, int n) {
        // Your code goes here
        int n1;
        int n2;
        int flag=0;
        ArrayList<Integer> arr1=new ArrayList<Integer>();
        for(int i=0;i<arr.size();i++){
            arr1.add(arr.get(i));
        }
        for(int i=0;i<arr.size();i++){
            for(int j=i+1;j<arr.size();j++){
                if(arr1.contains(arr.get(j)) == True){
                    n1= arr1.get(j);
                    arr1.remove(j);
                    n2= arr1.get(i);
                    arr1.remove(i);
                    if(n1!=n2){
                        flag++;
                    }
                }
            }
        }
        return flag;
    }

    
    public static int countPairs_Problem_0_1ce5b5c0_059e_4ae9_a506_41d0b3fe433d(ArrayList<Integer> arr, int n) {
        int count = 0;
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
        }
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                if(arr.get(i) == arr.get(j)) {
                    continue;
                }
                else {
                    if(arr.get(i) > arr.get(j)) {
                        count += n - sum;
                    }
                    else {
                        count += n - sum;
                    }
                    sum -= arr.get(j);
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_2_f6191ac4_b578_400b_93e8_70f45b72ae84(ArrayList<Integer> arr, int n) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) != arr.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_2_5a2b66fd_2474_4ef8_9a1c_f2232211e5c4(ArrayList<Integer> arr, int n) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) != arr.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_2_5c8594cc_f73e_4341_9a29_2752450395f1(ArrayList<Integer> arr, int n) {
        int result = 0;
        if (n != 0) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (i != j) {
                        if (arr.get(i) == arr.get(j)) {
                            result = result + 2;
                        }
                    }
                }
            }
        }
        return result;
    }

    
    public static int countPairs_Problem_1_3055feac_3485_4b3e_9d25_7af6a414e6cf(ArrayList<Integer> arr, int n) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) != arr.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_1_2eab2289_0523_4ea1_9e81_28d59db83096(ArrayList<Integer> arr, int n) {
        int count = 0;
        int temp;
        for(int i = 0; i < arr.size(); i++) {
            temp = arr.get(i);
            for(int j = i + 1; j < arr.size(); j++) {
                if(arr.get(j) != temp) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_2_58079bdf_0fec_423a_8fdc_a127d0077148(ArrayList<Integer> arr, int n) {
        int result = 0;
        int i;
        for (i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == j && i != n) {
                    continue;
                }
                if ((arr.contains(i * j)) && (i != j)) {
                    result++;
                }
            }
        }
        return result;
    }

    
    public static int countPairs_Problem_2_1bba7d96_69f7_442f_ad98_f0dbb761b792(ArrayList<Integer> arr, int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            if (i > n / 2) {
                result *= i;
            }
            else
                result *= (arr.size() - i);
        }
        return result;
    }

    
    public static int countPairs_Problem_2_91491cf5_186e_4b4c_ab82_156ad4ff330a(ArrayList<Integer> arr, int n) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) != arr.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_0_21f80961_32da_4484_9781_2941e0e3ce7e(ArrayList<Integer> arr, int n) {
        int count = 0;
        int temp;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                temp = arr.get(i);
                arr.set(i, arr.get(j));
                arr.set(j, temp);
                temp = arr.get(i);
                arr.set(i, arr.get(j));
                arr.set(j, temp);
                if(arr.get(i) == arr.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_2_c7e72634_e1c7_48ef_bf33_1516d0e6f3e3(ArrayList<Integer> arr, int n) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) != arr.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_0_cc3304e4_814e_4c0b_950d_7fdf31325dd9(ArrayList<Integer> arr, int n) {
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                if(arr.get(i) == arr.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_2_baf81f1f_eb13_4e93_8107_904fac5e3197(ArrayList<Integer> arr, int n) {
        // Your code here
        return 0;
    }

    
    public static int countPairs_Problem_2_222c12ec_a59f_44f5_b7de_9f0e6d5fb19e(ArrayList<Integer> arr, int n) {
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i+1; j < arr.size(); j++) {
                if(arr.get(i) == arr.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_2_04dea333_233a_47c2_952d_5c13b6ea0e3b(ArrayList<Integer> arr, int n) {
        int count = 0;
        int sum = 0;
        int temp;
        int temp2;
        for(int i = 0; i < arr.size(); i++) {
            temp = arr.get(i);
            for(int j = i+1; j < arr.size(); j++) {
                temp2 = arr.get(j);
                if(temp != temp2) {
                    count++;
                    sum += temp;
                    sum += temp2;
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_0_165a98b0_af05_4651_bf63_43577d7fac52(ArrayList<Integer> arr, int n) {
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i+1; j < arr.size(); j++) {
                if(arr.get(i) != arr.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_0_71df129a_ef85_4d01_9c0c_55943a5cac5e(ArrayList<Integer> arr, int n) {
        // Write your code here
        return 0;
    }

    
    public static int countPairs_Problem_1_6734d7df_5552_41d8_a681_23dfc2a09be0(ArrayList<Integer> arr, int n) {
        int counter = 0;
        for (int i = 0; i < n; i++) {
            if (i != n - 1) {
                for (int j = i + 1; j < n; j++) {
                    if (arr.get(i) != arr.get(j)) {
                        counter++;
                    }
                }
            }
        }
        return counter;
    }

    
    public static int countPairs_Problem_2_fbd0308b_6451_45d1_9f26_e78a8609b5af(ArrayList<Integer> arr, int n) {
        int count = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            int j = 0;
            while (j < arr.size() - 1 && !arr.get(i).equals(arr.get(j))) {
                j++;
            }
            if (j == arr.size() - 1) {
                count++;
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_1_0e9cc3f6_15a3_40ef_80cd_f17559f3e871(ArrayList<Integer> arr, int n) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        int result = 0;
        for(int i=0; i<arr.size(); i++){
            if(i==0 || i==arr.size() - 1){
                continue;
            }
            Integer left = arr.get(i);
            Integer right = arr.get(i-1);
            int val = (left * right) - ((left * left) + (right * right));
            map.put(left, right);
            map.put(right, left);
            if(map.containsKey(n) && map.containsKey(val)){
                result += map.get(n) - map.get(val);
            }
        }
        return result;
    }

    
    public static int countPairs_Problem_1_bb47899d_98eb_4540_9f5c_9cb902554f26(ArrayList<Integer> arr, int n) {
        int countPairs_Problem_1_bb47899d_98eb_4540_9f5c_9cb902554f26 = 0;
        ArrayList<Integer> unorderedPairs = new ArrayList<>();
        for (int i = 0; i < arr.size(); i++) {
            int x = arr.get(i);
            if (x == 1) {
                countPairs_Problem_1_bb47899d_98eb_4540_9f5c_9cb902554f26++;
            } else if (x == 2 || x == n - 1) {
                countPairs_Problem_1_bb47899d_98eb_4540_9f5c_9cb902554f26++;
            } else {
                int y = arr.get((i + 1) % arr.size());
                if (x != y) {
                    unorderedPairs.add(x);
                    unorderedPairs.add(y);
                }
            }
        }
        return countPairs_Problem_1_bb47899d_98eb_4540_9f5c_9cb902554f26 + unorderedPairs.size();
    }

    
    public static int countPairs_Problem_1_cad2f07c_f4dc_4555_9904_a7adb4dce37e(ArrayList<Integer> arr, int n) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr.get(i) != arr.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_1_56c7e39a_bedf_44eb_8fd1_e634f65ac8cd(ArrayList<Integer> arr, int n) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) != arr.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_1_3f7ba1a9_468f_47d2_aea1_43767eeb212b(ArrayList<Integer> arr, int n) {
        // your answer starts here
        if (n <= 1)
            return n;
        int count1 = 1;
        int count2 = 1;
        for (Integer val: arr)
            if (val != n)
                count2++;
        for (Integer val: arr)
            if (val == n)
                count1++;
        if (count1 > count2)
            return count1;
        else
            return count2;
        // return (count1 + count2);
    }

    
    public static int countPairs_Problem_2_831dfd73_c07b_4e04_9f72_0406f66ad1e2(ArrayList<Integer> arr, int n) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) != arr.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_1_5aba9a4d_1999_4c40_9c4e_8efb96b13a01(ArrayList<Integer> arr, int n) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) != arr.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_0_3055feac_3485_4b3e_9d25_7af6a414e6cf(ArrayList<Integer> arr, int n) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) != arr.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_0_4d02ab6e_a387_41a6_aa44_430962b6e02e(ArrayList<Integer> arr, int n) {
        // Write your logic here.
        
        
        // Write your logic here.
        return 0;
    }

    
    public static int countPairs_Problem_0_ca55081e_80cf_43c7_a3d2_6a676bfeebd4(ArrayList<Integer> arr, int n) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) != arr.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_2_49e07451_6095_4125_a275_0737c5dc11a4(ArrayList<Integer> arr, int n) {
        int count = 0;
        int n1 = arr.get(0);
        int n2 = arr.get(1);
        
        
        for (int i = 2; i < n; i++) {
            int n3 = arr.get(i);
            if (n1 != n3) {
                int n4 = arr.get(i-1);
                if (n2 != n4) {
                    count++;
                }
            }
        }
        
        return count;
    }

    
    public static int countPairs_Problem_2_8b73ddd6_cbe3_4ec3_bcd7_ec807639e98b(ArrayList<Integer> arr, int n) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr.get(i) != arr.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_2_a310f72c_dc8a_495a_8fbb_769700ad2164(ArrayList<Integer> arr, int n) {
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i+1; j < arr.size(); j++) {
                if(arr.get(i) != arr.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_0_70559d06_c763_4dd7_8801_b2b801a69cae(ArrayList<Integer> arr, int n) {
        int sum = 0L;
        int total = 0;

        for(int i = 0; i < n; i++) {
            for(int j = i+1; j < n; j++) {
                if(arr.get(i) != arr.get(j)) {
                    int left = arr.get(i);
                    int right = arr.get(j);
                    sum += (left + right) / 2;
                    total += (left + right);
                }
            }
        }

        return sum + total;
    }

    
    public static int countPairs_Problem_0_2affe0b7_a80c_45e4_be48_a89421d13c17(ArrayList<Integer> arr, int n) {
        int pairs = 0;
        for(int i=0; i<arr.size()-1; i++) {
            for(int j=i+1; j<arr.size(); j++) {
                if(arr.get(i) == arr.get(j)) {
                    pairs++;
                    if(arr.get(i) != arr.get(j+1)) {
                        pairs++;
                    }
                }
            }
        }
        return pairs;
    }

    
    public static int countPairs_Problem_0_5a2b66fd_2474_4ef8_9a1c_f2232211e5c4(ArrayList<Integer> arr, int n) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) != arr.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_1_c36cbcb0_da33_4045_bcaf_e6982949753c(ArrayList<Integer> arr, int n) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) != arr.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_1_bcd5b694_7522_4ae5_a506_a79fe1bcb20c(ArrayList<Integer> arr, int n) {
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                if(arr.get(i) == arr.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_1_5f5e5b63_1bb4_46f4_b0c9_0c56b1ed24e4(ArrayList<Integer> arr, int n) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) != arr.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_2_4b72705a_52f6_4d77_9626_cdfd868daf2e(ArrayList<Integer> arr, int n) {
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i+1; j < arr.size(); j++) {
                if(arr.get(i) != arr.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_1_f3e21a5e_bb49_48e8_a983_ddfd184e5253(ArrayList<Integer> arr, int n) {
        int pairs = 0L;

        for(int i = 0; i< arr.size(); i++){
            pairs += ((arr.size() - i)*(arr.size() - i));
            
            for(int j = i; j < arr.size(); j++){
                if(arr.get(i) == arr.get(j))
                    continue;
                pairs += ((arr.size() - i)*(arr.size() - j));
                pairs += ((arr.size() - j)*(arr.size() - i));
            }
        }
        return pairs;
    }

    
    public static int countPairs_Problem_2_cfd34bee_1113_4a2d_9282_055020d7920a(ArrayList<Integer> arr, int n) {
        int count = 0;
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            for(int j = i + 1; j < arr.size(); j++) {
                if(arr.get(i) == arr.get(j)) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_1_9ba39982_4c60_4389_b203_292633850cf5(ArrayList<Integer> arr, int n) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) != arr.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_2_e7575408_ed57_4832_9262_11da48c742af(ArrayList<Integer> arr, int n) {
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                if(arr.get(i) != arr.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_1_b198ce45_f0bd_4292_a463_2c463a6d4ad5(ArrayList<Integer> arr, int n) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) != arr.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_0_5c6905e7_513c_4226_b122_71f431b5fe2f(ArrayList<Integer> arr, int n) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) != arr.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_2_21f80961_32da_4484_9781_2941e0e3ce7e(ArrayList<Integer> arr, int n) {
        int count = 0;
        int temp;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                temp = arr.get(i);
                arr.set(i, arr.get(j));
                arr.set(j, temp);
                temp = arr.get(i);
                arr.set(i, arr.get(j));
                arr.set(j, temp);
                if(arr.get(i) == arr.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_0_00443053_1b7c_4cb6_b2c9_e4f1587fe3ee(ArrayList<Integer> arr, int n) {
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                if(arr.get(i) != arr.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_1_9b981eaf_d50f_49fb_970e_492adb6ea286(ArrayList<Integer> arr, int n) {
        int count = 0;
        for (int i : arr) {
            for (int j : arr) {
                if (i != j) {
                    count++;
                    boolean hasIt = False;
                    boolean hasJt = False;
                    for (Integer aL : arr) {
                        if (aL == i && j != aL) {
                            hasIt = True;
                        }
                        if (aL == j && i != aL) {
                            hasJt = True;
                        }
                    }
                    if (hasIt && hasJt) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_1_a08b0124_bcef_4c84_ba7d_3181ad1f9cff(ArrayList<Integer> arr, int n) {
        return 0;
    }

    
    public static int countPairs_Problem_0_3b1ab461_bfbf_4e8f_bf33_5ec93a0adf00(ArrayList<Integer> arr, int n) {
        int ans = 0;
        for(int i=0;i<arr.size();i++) {
            for(int j=0;j<arr.size();j++) {
                if(i != j && arr.get(i) == arr.get(j)) {
                    ans++;
                }
            }
        }
        return ans;
    }

    
    public static int countPairs_Problem_2_bc01be81_3732_4da3_a816_6595413c6f0a(ArrayList<Integer> arr, int n) {
        int count = 0;
        for (int i = 1; i < n; i++) {
            int sum = 0;
            int cur = arr.get(i);
            int j = i;
            while (j < n) {
                sum += arr.get(j);
                cur *= cur;
                j++;
            }
            count += sum + ((n & 1)) * cur;
        }
        return count;
    }

    
    public static int countPairs_Problem_1_f8f2ec94_4d97_4c04_8d92_c2417b7fc34a(ArrayList<Integer> arr, int n) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) != arr.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_1_ac0596e8_717c_44f4_a45d_39142dba9720(ArrayList<Integer> arr, int n) {
        // TODO: write code here
        ArrayList<Pair<Integer, Integer>> unorderedPairs = new ArrayList<>();
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) == arr.get(j)) {
                    unorderedPairs.add(new Pair<>(arr.get(i), arr.get(j)));
                }
            }
        }

        return unorderedPairs.size();
    }

    
    public static int countPairs_Problem_1_475f31d3_c9e1_4292_b215_61c9531d1e55(ArrayList<Integer> arr, int n) {
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i+1; j < arr.size(); j++) {
                if(arr.get(i) == arr.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_0_0347965a_a340_4174_aec7_bc0320f3f706(ArrayList<Integer> arr, int n) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) != arr.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_2_592954e4_a5f4_4383_b62d_8b09435bd5c2(ArrayList<Integer> arr, int n) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) != arr.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_0_fc81e216_ae7a_4e2e_bcae_93641ccb9fdb(ArrayList<Integer> arr, int n) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) != arr.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_0_ce2f53ed_664c_4464_9ec7_9e1ad76988c2(ArrayList<Integer> arr, int n) {
        int cnt = 0;
        int p1 = Integer.MAX_VALUE;
        int p2 = Integer.MAX_VALUE;
        for (Integer l : arr) {
            if (l != p1 && l != p2) {
                cnt++;
                if (p1 != p2)
                    p1 = p2;
                p2 = l;
            }
        }
        return cnt;
    }

    
    public static int countPairs_Problem_1_a147b56a_9214_432d_8f12_4784e49c64bb(ArrayList<Integer> arr, int n) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) != arr.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_2_d71997fb_fb64_4283_aa82_af06dc97af7b(ArrayList<Integer> arr, int n) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) != arr.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_0_e4c5e8da_5337_4ad0_a355_a8597c10bd1a(ArrayList<Integer> arr, int n) {
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < arr.size(); i++) {
            int currValue = arr.get(i);
            int index = map.get(currValue);
            if(index == -1) {
                index = arr.size();
                map.put(currValue, index);
            }
            for(int j = i + 1; j < arr.size(); j++) {
                int nextValue = arr.get(j);
                if(map.containsKey(nextValue)) {
                    map.put(nextValue, map.get(nextValue) + 1);
                    if(currValue == nextValue) {
                        count++;
                        break;
                    }
                }
            }
        }

        return count;
    }

    
    public static int countPairs_Problem_2_4381033e_d586_4527_a614_c6d0651a2da7(ArrayList<Integer> arr, int n) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) != arr.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_2_448c297c_0698_4d1c_ab14_d9d74cdf070d(ArrayList<Integer> arr, int n) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) != arr.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_0_d2c2bf47_21c5_4b4d_b5ef_e011701dd10f(ArrayList<Integer> arr, int n) {
        int count = 0;
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            for(int j = i + 1; j < arr.size(); j++) {
                if(arr.get(i) == arr.get(j)) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_2_7eddeef7_845f_4dba_ae4e_e275cde3c571(ArrayList<Integer> arr, int n) {
        int count = 0;
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            for(int j = i + 1; j < arr.size(); j++) {
                if(arr.get(i) == arr.get(j)) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_2_5f62447d_0ad2_4c7c_8637_9b5283495c77(ArrayList<Integer> arr, int n) {
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum++;
        }
        int result = 0;
        for(int i = 0; i < arr.size(); i++) {
            result += arr.get(i);
        }
        return result;
    }

    
    public static int countPairs_Problem_0_73f13eba_7a9c_45f3_a655_d9b99320a4fa(ArrayList<Integer> arr, int n) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr.get(i) != arr.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_0_f08e5f2d_4233_4950_bea1_f0eb95a1232e(ArrayList<Integer> arr, int n) {
        int count = 0;
        int temp;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                temp = arr.get(i);
                arr.set(i, arr.get(j));
                arr.set(j, temp);
                if(arr.get(i) == arr.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_0_2e55cffd_d57c_4acf_b365_b3c5fa9c15a6(ArrayList<Integer> arr, int n) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) != arr.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_0_19d8ca53_31dd_44e9_8f02_d895605241e7(ArrayList<Integer> arr, int n) {
        int count = 0;
        int sum = 0;
        int temp;
        for(int i = 0; i < arr.size(); i++) {
            temp = arr.get(i);
            for(int j = i + 1; j < arr.size(); j++) {
                if(temp == arr.get(j)) {
                    sum++;
                }
            }
            count += sum;
            sum = 0;
        }
        return count;
    }

    
    public static int countPairs_Problem_2_9a3579a5_bc66_40b7_8ba3_55f80535d42a(ArrayList<Integer> arr, int n) {
        int count = 0;
        
        int m = arr.size() - 1;
        for(int i = 1; i < m; i++) {
            for(int j = i + 1; j < m; j++) {
                if(i != j) {
                    if(arr.get(i) != arr.get(j)) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_1_3db74812_bf57_4b0d_9509_f6aa967f1738(ArrayList<Integer> arr, int n) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) != arr.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_1_0fa391cc_741b_4338_baad_d7d6113059eb(ArrayList<Integer> arr, int n) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) != arr.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_2_9119b942_30fb_4025_b2a5_46a4b9c87bda(ArrayList<Integer> arr, int n) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) != arr.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countPairs_Problem_2_5eb60095_0aa2_42fc_a139_d897fd7035f6(ArrayList<Integer> arr, int n) {
        int count = 0;
        int temp;
        int temp2;
        for(int i = 0; i < arr.size(); i++) {
            temp = arr.get(i);
            for(int j = i + 1; j < arr.size(); j++) {
                temp2 = arr.get(j);
                if(temp != temp2) {
                    count++;
                }
            }
        }
        return count;
    }

}
