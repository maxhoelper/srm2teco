package HumanEval_94_skjkasdkd;

public class HumanEval_94_skjkasdkd {

    
    public static int skjkasdkd_Problem_4_0c1d4b1c_1234_4ba1_ac1a_46ddb6f2f166(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for (int l : lst) {
            if (l > max) {
                max = l;
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_6_05699823_09b4_41b4_aebd_2ec028f314af(ArrayList<Integer> lst) {
        int max = 0;
        int sum = 0;
        for (int i : lst) {
            sum += i;
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }

    
    public static int skjkasdkd_Problem_5_b84db7ef_13a2_4999_9215_424366accedc(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for (Integer l : lst) {
            if (l > max) {
                max = l;
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_5_99967f3e_5046_4998_86a8_6b9885fefccd(ArrayList<Integer> lst) {

        return 0;
    }

    
    public static int skjkasdkd_Problem_4_b64002b9_723d_4dc5_9c9d_088c185067a8(ArrayList<Integer> lst) {
        int largest = 0;
        for (Integer l : lst) {
            boolean isPrime = True;
            for(int i = 2; i * i <= l; i ++) {
                if((l % i) == 0) {
                    isPrime = False;
                }
            }
            if(isPrime) {
                largest += l;
            }
        }
        return largest;
    }

    
    public static int skjkasdkd_Problem_5_eb71f64d_f75d_4410_8f26_28072be2f39c(ArrayList<Integer> lst) {
        int largestPrime = 0;
        int sum = 0;
        for(Integer i : lst) {
            if(i>largestPrime) {
                largestPrime = i;
            }
        }
        for(Integer i : lst) {
            if(i>largestPrime) {
                sum = sum + i;
            }
        }
        return sum;

    }

    
    public static int skjkasdkd_Problem_5_523000d7_494a_4089_9fea_7273c22f408e(ArrayList<Integer> lst) {
        int max = 0;
        for(Integer i : lst) {
            if(i > max) {
                max = i;
            }
        }
        int sum = 0;
        while(max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_4_c205c886_ffd3_47c5_8cfc_d3089c4518bb(ArrayList<Integer> lst) {
        int max = 0;
        int sum = 0;
        for (Integer l : lst) {
            sum += l;
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }

    
    public static int skjkasdkd_Problem_7_2a0443ef_c0b7_4a10_a93b_883df59e908f(ArrayList<Integer> lst) {
        int largestPrime = 0;
        int sumOfDigits = 0;
        for(int i : lst) {
            if(i>largestPrime) {
                largestPrime = i;
            }
            sumOfDigits += i;
        }
        return sumOfDigits;

    }

    
    public static int skjkasdkd_Problem_3_d4258f4f_8fd6_4676_b91d_44c692b71c6d(ArrayList<Integer> lst) {
        int max = 0;
        int sum = 0;
        for (int num : lst) {
            sum += num;
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }

    
    public static int skjkasdkd_Problem_2_10e9323c_2407_498d_bfb1_e8d16ad3eed9(ArrayList<Integer> lst) {

        int max = 0;
        for (Integer i : lst) {
            if (i > max) {
                max = i;
            }
        }
        int sum = 0;
        for (Integer i : lst) {
            if (i > max) {
                sum += i;
            }
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_3_c14cead9_af7c_4449_b80a_858ca016e4d6(ArrayList<Integer> lst) {

        return lst.stream().filter(x -> {
            for (int i = 2; i < x; i++) {
                if (x % i == 0) {
                    return False;
                }
            }
            return True;
        }).mapToInteger(x -> x).sum();
    }

    
    public static int skjkasdkd_Problem_6_2915f7cf_bf14_4099_9ef0_e501507f20bb(ArrayList<Integer> lst) {
        // Your code here
        return 0;

    }

    
    public static int skjkasdkd_Problem_8_a70bb8f6_16bd_4f4e_80ab_883a5822270e(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for (int l : lst) {
            if (l > max) {
                max = l;
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_5_ae9445c0_82ff_432b_af63_b45ccc17598e(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for (int i : lst) {
            if (i > max) {
                max = i;
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_0_3d5c810c_f51d_40d1_89b6_a0ed93e51d5f(ArrayList<Integer> lst) {
        // Write your code here
        return 0;

    }

    
    public static int skjkasdkd_Problem_4_09f1b021_2986_450a_887b_ab9d2995aafb(ArrayList<Integer> lst) {

        int max = 0;
        for (Integer l : lst) {
            if (l > max) {
                max = l;
            }
        }
        int res = 0;
        for (Integer l : lst) {
            if (l > max) {
                res += l;
            }
        }
        return res;
    }

    
    public static int skjkasdkd_Problem_8_1584f53b_939f_4497_9533_8b617c98eac4(ArrayList<Integer> lst) {

        int max = 0;
        for (Integer l : lst) {
            if (l > max) {
                max = l;
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_7_f93c9065_2fc1_436b_8109_7a5d6c41f3a4(ArrayList<Integer> lst) {
        int max = 0;
        for (Integer i : lst) {
            int temp = i;
            while (temp > 0) {
                int digit = temp % 10;
                if (digit > max) {
                    max = digit;
                }
                temp /= 10;
            }
        }
        return max;
    }

    
    public static int skjkasdkd_Problem_5_54ad14d9_2527_435f_8aaa_d1aeffeb7d2c(ArrayList<Integer> lst) {
        int max = 0;
        int sum = 0;
        for (int i : lst) {
            sum += i;
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }

    
    public static int skjkasdkd_Problem_1_1468b839_b6f7_43b4_ab88_a96eb16880f6(ArrayList<Integer> lst) {
        // Your code here
        return 0;

    }

    
    public static int skjkasdkd_Problem_0_07999c87_44af_4958_9e19_e6fa8f1ba6de(ArrayList<Integer> lst) {

        return lst.stream().mapToInteger(Integer::intValue).filter(i -> i > 1).max().orElse(0);
    }

    
    public static int skjkasdkd_Problem_0_2753d94e_dffc_4eb2_8306_c294cb582785(ArrayList<Integer> lst) {

        int max = 0;
        for (int i : lst) {
            if (i > max) {
                max = i;
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_2_098a432b_45df_4ec9_a493_bde424571ddf(ArrayList<Integer> lst) {
        int max = 0;
        int sum = 0;
        for (int i : lst) {
            sum += i;
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }

    
    public static int skjkasdkd_Problem_7_4b0e9fc5_c8a9_420c_9bd4_29dbaa0c5a69(ArrayList<Integer> lst) {

        // Write your code here
        return lst.stream().mapToInteger(x -> x).max().getAsInteger();
    }

    
    public static int skjkasdkd_Problem_6_d45a26f7_2fb6_46ab_bf91_cba4f31733fb(ArrayList<Integer> lst) {
        int max = 0;
        for (Integer i : lst) {
            int n = i;
            int sum = 0;
            while (n > 0) {
                sum += n % 10;
                n /= 10;
            }
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }

    
    public static int skjkasdkd_Problem_2_35b48e9e_1a2e_41e4_a36c_391891d20362(ArrayList<Integer> lst) {
        // Your code here
        return 0;

    }

    
    public static int skjkasdkd_Problem_6_70ac5832_db77_42bd_93e5_a02c5fd37cdb(ArrayList<Integer> lst) {

        int sum = 0;
        for (int l : lst) {
            if (l > 0) {
                sum += l;
            }
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_2_7a38a74e_d11a_45fd_8104_e150dc288734(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for (int i = 0; i < lst.size(); i++) {
            if (lst.get(i) > max) {
                max = lst.get(i);
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_6_c14cead9_af7c_4449_b80a_858ca016e4d6(ArrayList<Integer> lst) {

        return lst.stream().filter(x -> {
            for (int i = 2; i < x; i++) {
                if (x % i == 0) {
                    return False;
                }
            }
            return True;
        }).mapToInteger(x -> x).sum();
    }

    
    public static int skjkasdkd_Problem_4_27cdd710_5e88_4d7f_994e_a03b949b6489(ArrayList<Integer> lst) {
        int maxPrime = 0;
        int maxSum = 0;
        int sum = 0;
        for (Integer num : lst) {
            boolean isPrime = True;
            int divisor = 1;
            while (divisor < num) {
                if (num % divisor == 0) {
                    isPrime = False;
                    break;
                }
                divisor++;
            }
            if (isPrime) {
                sum += num;
                if (sum > maxSum) {
                    maxSum = sum;
                    maxPrime = num;
                }
            }
        }
        return maxPrime;
    }

    
    public static int skjkasdkd_Problem_3_0eae6474_0cb3_484e_a5ad_2d545e2d36d9(ArrayList<Integer> lst) {

        int max = 0;
        for (int l : lst) {
            if (l > max) {
                max = l;
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_8_ea9f7eb6_b97f_4c82_8798_803d7392cf04(ArrayList<Integer> lst) {
        int max = 0;
        for (int i : lst) {
            if (i > max) {
                max = i;
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_5_9ced51c0_f91d_4bff_8d36_0cfd9d64a0d1(ArrayList<Integer> lst) {

        int max = 0;
        for (int i : lst) {
            if (i > max) {
                max = i;
            }
        }
        int sum = 0;
        for (int i = max; i > 0; i--) {
            if (max % i == 0) {
                sum += i;
            }
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_1_26b49788_8d9a_4cc7_bfea_e56e42b7a9c2(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for (int i : lst) {
            if (i > max) {
                max = i;
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_2_ffe675af_0290_452d_a092_5ba2e13124fe(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for (int i : lst) {
            if (i > max) {
                max = i;
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_7_c27adafd_b462_451c_854f_1e1f04e77351(ArrayList<Integer> lst) {

        int max = 0;
        for (int l : lst) {
            if (l > max) {
                max = l;
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_4_b9f22d7a_c0a8_440a_87f6_1a80c796b2df(ArrayList<Integer> lst) {

        return lst.stream().filter(x -> {
            boolean isPrime = True;
            for (int i = 2; i < x; i++) {
                if (x % i == 0) {
                    isPrime = False;
                    break;
                }
            }
            return isPrime;
        }).mapToInteger(x -> x).sum();
    }

    
    public static int skjkasdkd_Problem_6_18b3799d_e39d_46d5_91cd_8308069c85a5(ArrayList<Integer> lst) {
        int largestPrime = 0;
        int sum = 0;
        int sumOfDigits = 0;
        for(int i : lst) {
            if(i>largestPrime) {
                largestPrime = i;
            }
            sum += i;
            sumOfDigits += i;
        }
        return sumOfDigits;

    }

    
    public static int skjkasdkd_Problem_1_f2c694cf_40fc_4ade_abd0_1eb7f677e150(ArrayList<Integer> lst) {
        // Your code here.
        return 0;
    }

    
    public static int skjkasdkd_Problem_7_d90181a3_479a_4843_bb28_e98b13dc4e5f(ArrayList<Integer> lst) {
        int max = 0;
        int sum = 0;
        int prime = 0;
        for (int i : lst) {
            if (i % 2 == 0) {
                prime = i;
            }
            if (prime > max) {
                max = prime;
            }
            sum += i;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_2_f7130975_7670_4aa9_9b1a_ce107f7e0f44(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for (Integer l : lst) {
            if (l > max) {
                max = l;
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_6_802ddd16_8fe5_468a_8714_c842d10c0ced(ArrayList<Integer> lst) {
        int maxPrime = 0;
        int sum = 0;
        for(Integer i : lst) {
            if(i>maxPrime) {
                maxPrime = i;
            }
        }
        for(Integer i : lst) {
            if(i>maxPrime) {
                sum += i;
            }
        }
        return sum;

    }

    
    public static int skjkasdkd_Problem_3_1f91bde0_62da_409b_8ac6_71f4d83c6507(ArrayList<Integer> lst) {

        int max = 0;
        for (int i : lst) {
            if (i > max) {
                max = i;
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_2_81978f6f_2032_4484_aec5_d6e5d3df0a82(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for (int l : lst) {
            if (l > max) {
                max = l;
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_2_276d196b_388a_40a8_9a30_62c12bc0f25b(ArrayList<Integer> lst) {
        // Your code here
        List<Integer> digits = lst.stream().map(x ->  (x % 10d)).collect(Collectors.toList());
        int sum = 0;
        for (int i = 0; i < digits.size(); i++) {
            if (digits.get(i) == 0) {
                continue;
            }
            if (digits.get(i) > 0) {
                sum += digits.get(i);
                for (int j = i; j < digits.size(); j++) {
                    if (digits.get(j) > 0) {
                        sum += digits.get(j);
                    }
                }
            }
        }
        int sum2 = sum % 10;
        if (sum2 > 0) {
            return sum2;
        } else {
            return 0;
        }
    }

    
    public static int skjkasdkd_Problem_2_149e8576_d54a_4ffb_80bb_b53ca738beb7(ArrayList<Integer> lst) {

        return lst.stream().map(x -> x.toString()).map(x -> x.chars().map(y -> y - 48).sum()).max(Comparator.naturalOrder()).get();
    }

    
    public static int skjkasdkd_Problem_0_84c1d2cc_4e80_4860_9c65_52f8481f29c5(ArrayList<Integer> lst) {
        int largestPrime = -1;
        ArrayList<Integer> primes = new ArrayList<>();
        int temp = 0;
        for (int n : lst) {
            if (n > largestPrime) {
                largestPrime = n;
            }
            while (n % 10 != 0) {
                primes.add(n);
                n /= 10;
            }
        }
        for (int n : primes) {
            if (temp == 0) {
                temp = n;
            } else {
                if (temp < n) {
                    temp = n;
                }
            }
        }
        return largestPrime;
    }

    
    public static int skjkasdkd_Problem_4_68a646af_7c28_45c5_b366_d42053170366(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for (int i = 0; i < lst.size(); i++) {
            if (lst.get(i) > max) {
                max = lst.get(i);
            }
        }
        int maxPrime = 0;
        for (int i = 2; i <= max; i++) {
            if (max % i == 0) {
                maxPrime = i;
            }
        }
        int sum = 0;
        while (maxPrime > 0) {
            sum += maxPrime % 10;
            maxPrime /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_4_01b44709_9b03_41c1_95e0_884ff876a910(ArrayList<Integer> lst) {
        int max = 0;
        int sum = 0;
        for (int l : lst) {
            sum += l;
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }

    
    public static int skjkasdkd_Problem_2_c9128ce0_415c_4ac9_9a7f_980cde88e82c(ArrayList<Integer> lst) {
        final int N = lst.size();
        if (N == 0)
            return 0;
        int maxPrime = 0;
        int sum = 0;
        int max = 0;
        // Step 1: sort and find largest prime
        int k = 0;
        while (k <= N - 2) {
            int a = lst.get(k);
            int b = 0;
            while (k <= N - 2) {
                if (lst.get(k) == a)
                    b++;
                k++;
            }
            if (b > max)
                max = b;
            if (max > maxPrime) {
                maxPrime = max;
            }
            k++;
        }
        // Step 2: sum digits
        k = 0;
        while (k <= N - 2) {
            int a = lst.get(k);
            int b = 0;
            while (k <= N - 2) {
                if (lst.get(k) == a)
                    b++;
                k++;
            }
            sum += b;
            k++;
        }
        // Step 3: add 1 to largest
        maxPrime++;
        return sum;
    }

    
    public static int skjkasdkd_Problem_2_bc9f1236_16c6_4aba_816e_7b8b51ff3dbe(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for (int l : lst) {
            if (l > max) {
                max = l;
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_2_84f31c53_34dc_4101_8bc3_5193f6610d93(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for (int i = 0; i < lst.size(); i++) {
            if (lst.get(i) > max) {
                max = lst.get(i);
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_1_ba69497f_f4ed_4dd8_960c_6c1031c6c49a(ArrayList<Integer> lst) {

        int max = 0;
        for(int i : lst) {
            if(i > max) {
                max = i;
            }
        }
        int sum = 0;
        for(int i : lst) {
            if(i > max) {
                sum += i;
            }
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_5_2a0443ef_c0b7_4a10_a93b_883df59e908f(ArrayList<Integer> lst) {
        int largestPrime = 0;
        int sumOfDigits = 0;
        for(int i : lst) {
            if(i>largestPrime) {
                largestPrime = i;
            }
            sumOfDigits += i;
        }
        return sumOfDigits;

    }

    
    public static int skjkasdkd_Problem_2_6fa81ca0_9025_4b46_b357_0b06e5d2fec4(ArrayList<Integer> lst) {
        int maxSum =  0;
        int sumOfDigits = 0;
        boolean isPrime;
        for (Integer l : lst) {
            isPrime = False;
            double d = Math.sqrt(l);
            int i =  d;
            while (i < 10) {
                if (l % i == 0) {
                    isPrime = True;
                    break;
                }
                i++;
            }
            if (isPrime) {
                sumOfDigits +=  Math.ceil(l / Math.pow(10, l.getClass().getSimpleName().length()));
            }
        }
        System.out.println( sumOfDigits);
        return sumOfDigits;
    }

    
    public static int skjkasdkd_Problem_3_09be2f93_395f_494a_b7ae_a5523ebd342a(ArrayList<Integer> lst) {
        int max = 0;
        int sum = 0;
        int largestPrime = 0;
        for(int i : lst) {
            if(i>largestPrime) {
                largestPrime = i;
            }
            if(i%largestPrime==0) {
                sum += i;
            }
        }
        max = sum;
        return max;

    }

    
    public static int skjkasdkd_Problem_1_6da8aed6_ac45_43c4_b8f4_3d1716e70efc(ArrayList<Integer> lst) {

        int max = 0;
        for (int i : lst) {
            if (i > max) {
                max = i;
            }
        }
        int sum = 0;
        for (int i : lst) {
            if (i > 0 && i <= max) {
                sum += i;
            }
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_2_c39bd141_1920_4170_bfa7_f78602a56545(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for (int i : lst) {
            if (i > max) {
                max = i;
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_0_b486890a_0144_4b0a_ab51_1248016fb2c2(ArrayList<Integer> lst) {
        // Your code here
        return 0;
    }

    
    public static int skjkasdkd_Problem_0_31160bc1_3d12_4c2a_acbb_3c58269003e5(ArrayList<Integer> lst) {
        int max = 0;
        int sum = 0;
        for(Integer i : lst) {
            if(i>max) {
                max = i;
            }
        }
        for(Integer i : lst) {
            if(i>max) {
                sum = sum + i;
            }
        }
        return sum;

    }

    
    public static int skjkasdkd_Problem_6_1037b190_d038_4539_8159_3fede626cd9d(ArrayList<Integer> lst) {
        int max = 0;
        int sum = 0;
        for (int i : lst) {
            sum += i;
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }

    
    public static int skjkasdkd_Problem_5_6154a99f_01fb_4714_8b62_0068f8e15016(ArrayList<Integer> lst) {
        int maxPrime = 0;
        int sum = 0;
        for(int i : lst) {
            if(i>maxPrime) {
                maxPrime = i;
            }
            sum += i;
        }
        return sum;

    }

    
    public static int skjkasdkd_Problem_0_7b4148bf_4088_4a43_a2d8_b38b15f4bbb8(ArrayList<Integer> lst) {

        return 0;
    }

    
    public static int skjkasdkd_Problem_6_248cd964_88e1_4a93_ae2e_cd98ef1ea29b(ArrayList<Integer> lst) {
        int max = 0;
        int sum = 0;
        for(int i : lst) {
            if(i>max) {
                max = i;
            }
            sum += i;
        }
        return sum;

    }

    
    public static int skjkasdkd_Problem_2_4cc985f9_ad62_4603_ae76_105280874267(ArrayList<Integer> lst) {
        int max = 0;
        int sum = 0;
        int largestPrime = 0;
        for(int i : lst) {
            if(i>largestPrime) {
                largestPrime = i;
            }
            if(i>max) {
                max = i;
            }
            if(i>sum) {
                sum = i;
            }
        }
        return sum;

    }

    
    public static int skjkasdkd_Problem_5_86c44e02_19f6_42c4_9d4b_36b07cb9a0ce(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for (Integer l : lst) {
            if (l > max) {
                max = l;
            }
        }
        int res = 0;
        while (max > 0) {
            int rem = max % 10;
            if (rem == 2 || rem == 3 || rem == 5 || rem == 7) {
                res += rem;
            }
            max /= 10;
        }
        return res;
    }

    
    public static int skjkasdkd_Problem_6_5224f015_527a_4ee7_9bf6_740a9d4820ad(ArrayList<Integer> lst) {

        // Write your code here
        int sum = 0;
        for (int i : lst) {
            sum += i;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_7_e614421e_4a82_4b11_aa13_905a30e3dcb7(ArrayList<Integer> lst) {

        return 0;
    }

    
    public static int skjkasdkd_Problem_2_c86dab82_0514_43eb_817b_01c2af50d395(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for (int l : lst) {
            if (l > max) {
                max = l;
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_3_70ac5832_db77_42bd_93e5_a02c5fd37cdb(ArrayList<Integer> lst) {

        int sum = 0;
        for (int l : lst) {
            if (l > 0) {
                sum += l;
            }
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_3_6c9e9821_3ba3_443f_ba5c_ba8acc38f984(ArrayList<Integer> lst) {

        int max = 0;
        for (int i : lst) {
            if (i > max) {
                max = i;
            }
        }
        int sum = 0;
        for (int i = max; i > 0; i--) {
            if (max % i == 0) {
                sum += i;
            }
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_7_e1403471_8574_4567_9461_cd06da260b44(ArrayList<Integer> lst) {

        int max = 0;
        for (int i = 0; i < lst.size(); i++) {
            if (lst.get(i) > max) {
                max = lst.get(i);
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_0_7898a7da_69be_4d63_aa83_a9fb1fdcdc54(ArrayList<Integer> lst) {

        return lst.stream().mapToInteger(l -> l).filter(l -> l > 0).filter(l -> {
            for (int i = 2; i <= l / 2; i++) {
                if (l % i == 0) {
                    return False;
                }
            }
            return True;
        }).sum();
    }

    
    public static int skjkasdkd_Problem_1_07e75c63_acbb_4938_afa1_c43fd507015a(ArrayList<Integer> lst) {
        int max = 0;
        int sum = 0;
        for (int l : lst) {
            sum += l;
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }

    
    public static int skjkasdkd_Problem_7_d3964f57_6cb0_4120_89f5_0b977cd24bd4(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for(int i : lst) {
            if(i > max) {
                max = i;
            }
        }
        int sum = 0;
        while(max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_1_dabcd70b_88f9_4c2a_addc_0dd0991bbe6e(ArrayList<Integer> lst) {
        int max = 0;
        for (int l : lst) {
            if (l > max) {
                max = l;
            }
        }
        return max;

    }

    
    public static int skjkasdkd_Problem_1_4591f762_51cd_4613_909e_5c97f5dfbaf9(ArrayList<Integer> lst) {
        int maxPrime = 0;
        int sum = 0;
        for(int i : lst) {
            if(i>maxPrime) {
                maxPrime = i;
            }
            sum += i;
        }
        return sum;

    }

    
    public static int skjkasdkd_Problem_1_8e7a446b_b821_4ad9_9455_ffedc7582c5c(ArrayList<Integer> lst) {
        int max = 0;
        int sum = 0;
        for(int i : lst) {
            if(i>0) {
                int temp = i;
                while(temp>0) {
                    if(temp%10==0) {
                        break;
                    }
                    temp/=10;
                }
                if(i>temp) {
                    max = i;
                    sum += i;
                }
            }
        }
        return sum;

    }

    
    public static int skjkasdkd_Problem_3_8351f3d1_67dd_4fa5_b110_33852ce11b1d(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for (Integer l : lst) {
            if (l > max) {
                max = l;
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_5_140980e1_6552_4b0f_82f3_d78eaccf57c6(ArrayList<Integer> lst) {
        int max = 0;
        int sum = 0;
        int prime = 0;
        for (int i : lst) {
            if (i % 2 == 0) {
                prime = i;
            }
            if (prime > max) {
                max = prime;
            }
            sum += i;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_7_8aed0fb7_76e6_4521_8047_b73e2f3234c4(ArrayList<Integer> lst) {
        if (lst.isEmpty()) return 0;
        ArrayList<Integer> num = new ArrayList<>();
        for (Integer l : lst) {
            while (num.size() < 2) {
                num.add(l);
            }
            if (num.get(0) > l) num.set(0, l);
            if (num.get(1) < l) num.set(1, l);
        }
        int p = 1;
        for (int i = 1; i < num.size() - 1; i++) {
            if (num.get(i) > num.get(i - 1)) num.set(i, num.get(i));
        }
        for (int i = num.size() - 2; i >= 0; i--) {
            if (num.get(i) > num.get(i - 1)) num.set(i, num.get(i));
        }
        int sum = 0;
        for (int i = num.size() - 1; i >= 0; i--) {
            sum += num.get(i).intValue();
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_7_1584f53b_939f_4497_9533_8b617c98eac4(ArrayList<Integer> lst) {

        int max = 0;
        for (Integer l : lst) {
            if (l > max) {
                max = l;
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_8_d3d7d328_dda1_4b62_815c_8927f67157e9(ArrayList<Integer> lst) {

        // Write your code here
        return lst.stream().filter(x -> {
            boolean isPrime = True;
            for (int i = 2; i < x; i++) {
                if (x % i == 0) {
                    isPrime = False;
                    break;
                }
            }
            return isPrime;
        }).mapToInteger(x -> x).sum();
    }

    
    public static int skjkasdkd_Problem_6_84c1d2cc_4e80_4860_9c65_52f8481f29c5(ArrayList<Integer> lst) {
        int largestPrime = -1;
        ArrayList<Integer> primes = new ArrayList<>();
        int temp = 0;
        for (int n : lst) {
            if (n > largestPrime) {
                largestPrime = n;
            }
            while (n % 10 != 0) {
                primes.add(n);
                n /= 10;
            }
        }
        for (int n : primes) {
            if (temp == 0) {
                temp = n;
            } else {
                if (temp < n) {
                    temp = n;
                }
            }
        }
        return largestPrime;
    }

    
    public static int skjkasdkd_Problem_2_7d0a353a_2806_4c32_b044_e3f349c29864(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for(int i : lst){
            if(i > max){
                max = i;
            }
        }
        int sum = 0;
        while(max > 0){
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_7_4230e945_b534_4c64_9268_1a9e840e07d4(ArrayList<Integer> lst) {
        int largestPrimeValue = 0;
        int primeCounter = 1;
        int totalDigits = 0;
        for (int i : lst) {
            if (i % 2 == 0)
                largestPrimeValue = (largestPrimeValue + i / 2) % 1000000007L;
            else
                largestPrimeValue = (largestPrimeValue + i % 2) % 1000000007L;
            totalDigits += i;
        }
        int sum = 0;
        for (int i = 2; i <= largestPrimeValue; i++) {
            if (largestPrimeValue % i == 0) {
                primeCounter++;
                sum += i;
            }
        }
        System.out.println(largestPrimeValue);
        return totalDigits + (primeCounter) * (sum);
    }

    
    public static int skjkasdkd_Problem_8_92e4e53a_9e7f_4750_8814_fb9846746aad(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for (int l : lst) {
            if (l > max) {
                max = l;
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_5_eba187a8_7378_455b_aaa7_f650568720a8(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for (int i = 0; i < lst.size(); i++) {
            if (lst.get(i) > max) {
                max = lst.get(i);
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max = max / 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_4_c6365a0a_9e21_48b2_a4a9_c645a2f92d2a(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for (int l : lst) {
            if (l > max) {
                max = l;
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_0_68a646af_7c28_45c5_b366_d42053170366(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for (int i = 0; i < lst.size(); i++) {
            if (lst.get(i) > max) {
                max = lst.get(i);
            }
        }
        int maxPrime = 0;
        for (int i = 2; i <= max; i++) {
            if (max % i == 0) {
                maxPrime = i;
            }
        }
        int sum = 0;
        while (maxPrime > 0) {
            sum += maxPrime % 10;
            maxPrime /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_0_5d0652c5_d04a_4ea5_a3b9_69eafbd43abf(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for (Integer i : lst) {
            if (i > max) {
                max = i;
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_7_0268c1ca_38a4_4fe7_ae3b_ffd8bedd4852(ArrayList<Integer> lst) {

        return 0;
    }

    
    public static int skjkasdkd_Problem_5_84f31c53_34dc_4101_8bc3_5193f6610d93(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for (int i = 0; i < lst.size(); i++) {
            if (lst.get(i) > max) {
                max = lst.get(i);
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_8_e926e772_92d3_4100_9c97_710f39aaabcc(ArrayList<Integer> lst) {
        // Write your code here
        int maxPrime=0;
        for(Integer a:lst)
        {
            if(a%2==0)
            {
                continue;
            }
            for(int i=3;i*i<=a;i+=2)
            {
                if(a%i==0)
                {
                    continue;
                }
                if(a%i==1 && maxPrime<a) 
                {
                    maxPrime=a;
                }
            }
        }
        return maxPrime;
    }

    
    public static int skjkasdkd_Problem_2_0ef8cb2a_2f52_4db5_8481_77cf34af5e25(ArrayList<Integer> lst) {
        int max = 0;
        int sum = 0;
        for (int l : lst) {
            sum += l;
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }

    
    public static int skjkasdkd_Problem_4_84c1d2cc_4e80_4860_9c65_52f8481f29c5(ArrayList<Integer> lst) {
        int largestPrime = -1;
        ArrayList<Integer> primes = new ArrayList<>();
        int temp = 0;
        for (int n : lst) {
            if (n > largestPrime) {
                largestPrime = n;
            }
            while (n % 10 != 0) {
                primes.add(n);
                n /= 10;
            }
        }
        for (int n : primes) {
            if (temp == 0) {
                temp = n;
            } else {
                if (temp < n) {
                    temp = n;
                }
            }
        }
        return largestPrime;
    }

    
    public static int skjkasdkd_Problem_1_63b1fe0b_29b2_4a7a_9fc0_2e9472c30994(ArrayList<Integer> lst) {

        int max = 0;
        for (int l : lst) {
            if (l > max) {
                max = l;
            }
        }
        int sum = 0;
        for (int l : lst) {
            if (l > 0) {
                sum += l;
            }
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_1_3d1c4ed8_1b61_47cb_981a_c637ddbd7073(ArrayList<Integer> lst) {
        int largestPrime = 0;
        int sumOfDigits = 0;
        for (int i : lst) {
            largestPrime = i;
            sumOfDigits += i;
        }
        return sumOfDigits + largestPrime;
    }

    
    public static int skjkasdkd_Problem_7_69d7b533_f2c4_4be3_adae_95eace1e774e(ArrayList<Integer> lst) {

        // Fill this in.
        int max = 0;
        for (int l : lst) {
            if (l > max) {
                max = l;
            }
        }
        int count = 0;
        while (max > 0) {
            count += max % 10;
            max /= 10;
        }
        return count;
    }

    
    public static int skjkasdkd_Problem_4_95cb48af_2446_4b29_879a_63ba8eda4a94(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for (int i : lst) {
            if (i > max) {
                max = i;
            }
        }
        int res = 0;
        while (max > 0) {
            int rem = max % 10;
            if (rem == 2 || rem == 3 || rem == 5 || rem == 7) {
                res += rem;
            }
            max /= 10;
        }
        return res;
    }

    
    public static int skjkasdkd_Problem_3_f3a7f4b8_52b8_48f9_b09b_60a8136d277a(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for (int l : lst) {
            if (l > max) {
                max = l;
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_4_5403f3de_e7ec_4ec6_8390_789bb00631bd(ArrayList<Integer> lst) {

        // Write your code here
        int sum = 0;
        for (int l : lst) {
            sum += l;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_3_3d141da2_de05_4517_8312_91273ee4b38a(ArrayList<Integer> lst) {
        int largestPrime = 0;
        int sum = 0;
        for(int i : lst) {
            if(i>largestPrime) {
                largestPrime = i;
            }
            sum += i;
        }
        return sum;

    }

    
    public static int skjkasdkd_Problem_7_9cb867fd_fa9b_4b8b_af7a_77160e253d95(ArrayList<Integer> lst) {
        int largestPrime = 0;
        int sum = 0;
        for (int value : lst) {
            if (value != 0 && value > largestPrime) {
                largestPrime = value;
            }
            if (value % 2 == 0) {
                for (int j = 3; j < value; j += 2) {
                    if (value % j == 0) {
                        break;
                    }
                }
            }
            if (value % 3 == 0) {
                for (int j = 5; j < value; j += 3) {
                    if (value % j == 0) {
                        break;
                    }
                }
            }
            sum -= value % 10;
            if (sum < 0) {
                sum = 0;
            }
        }
        return largestPrime;
    }

    
    public static int skjkasdkd_Problem_5_7309b7d3_8ba0_4a20_ad51_2376dcb6960c(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for (int i : lst) {
            if (i > max) {
                max = i;
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_3_dbe2b3de_f9c3_486e_94fc_38846e411428(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for (int i = 0; i < lst.size(); i++) {
            if (lst.get(i) > max) {
                max = lst.get(i);
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_4_f2c694cf_40fc_4ade_abd0_1eb7f677e150(ArrayList<Integer> lst) {
        // Your code here.
        return 0;
    }

    
    public static int skjkasdkd_Problem_1_c804a9af_a47e_4736_bba8_8bbffac14d67(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for (int l : lst) {
            if (l > max) {
                max = l;
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_3_43bf8527_f44c_4659_9c56_a315c877e7ab(ArrayList<Integer> lst) {
        int max = 0;
        for (int i : lst) {
            if (i > max) {
                max = i;
            }
        }
        return max;

    }

    
    public static int skjkasdkd_Problem_6_6d25e705_2cbc_482b_ab05_a275f8af57d7(ArrayList<Integer> lst) {
        int maxPrime = 0;
        int sum = 0;
        for (int i : lst) {
            sum += i;
            if (sum > maxPrime) {
                maxPrime = sum;
            }
        }
        return maxPrime;
    }

    
    public static int skjkasdkd_Problem_5_03096768_6d24_43c0_8da6_65adb04e70a1(ArrayList<Integer> lst) {

        // write your code here
        int sum = 0;
        for (int l : lst) {
            if (l > 0) {
                sum += l;
            }
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_6_79b8d147_658f_402f_bc7b_b7669648f10a(ArrayList<Integer> lst) {
        int max = 0;
        for (Integer i : lst) {
            if (i > max) {
                max = i;
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_2_9b51df1b_abfa_4be1_b411_78d0bf043186(ArrayList<Integer> lst) {

        return lst.stream().mapToInteger(x -> x).max().getAsInteger();
    }

    
    public static int skjkasdkd_Problem_7_216174b5_35aa_444f_9c05_44736f6a1ef7(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for(int i = 0; i < lst.size(); i++) {
            if(lst.get(i) > max) {
                max = lst.get(i);
            }
        }
        int sum = 0;
        while(max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_4_140980e1_6552_4b0f_82f3_d78eaccf57c6(ArrayList<Integer> lst) {
        int max = 0;
        int sum = 0;
        int prime = 0;
        for (int i : lst) {
            if (i % 2 == 0) {
                prime = i;
            }
            if (prime > max) {
                max = prime;
            }
            sum += i;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_5_aca2d26b_3838_45e1_9e74_7726d75fd6ce(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for(int i : lst) {
            if(i > max) {
                max = i;
            }
        }
        int sum = 0;
        while(max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_6_29f2a845_52a4_40c6_9ce0_55137d65d7cb(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for (int i : lst) {
            if (i > max) {
                max = i;
            }
        }
        int count = 0;
        while (max > 0) {
            if (max % 10 == 2 || max % 10 == 3 || max % 10 == 5 || max % 10 == 7) {
                count += 1;
            }
            max = max / 10;
        }
        return count;
    }

    
    public static int skjkasdkd_Problem_6_4885f670_3963_4014_bc37_0545e7781d79(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for(int i : lst) {
            if(i > max) {
                max = i;
            }
        }
        int sum = 0;
        while(max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_3_eba187a8_7378_455b_aaa7_f650568720a8(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for (int i = 0; i < lst.size(); i++) {
            if (lst.get(i) > max) {
                max = lst.get(i);
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max = max / 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_0_4885f670_3963_4014_bc37_0545e7781d79(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for(int i : lst) {
            if(i > max) {
                max = i;
            }
        }
        int sum = 0;
        while(max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_4_c9128ce0_415c_4ac9_9a7f_980cde88e82c(ArrayList<Integer> lst) {
        final int N = lst.size();
        if (N == 0)
            return 0;
        int maxPrime = 0;
        int sum = 0;
        int max = 0;
        // Step 1: sort and find largest prime
        int k = 0;
        while (k <= N - 2) {
            int a = lst.get(k);
            int b = 0;
            while (k <= N - 2) {
                if (lst.get(k) == a)
                    b++;
                k++;
            }
            if (b > max)
                max = b;
            if (max > maxPrime) {
                maxPrime = max;
            }
            k++;
        }
        // Step 2: sum digits
        k = 0;
        while (k <= N - 2) {
            int a = lst.get(k);
            int b = 0;
            while (k <= N - 2) {
                if (lst.get(k) == a)
                    b++;
                k++;
            }
            sum += b;
            k++;
        }
        // Step 3: add 1 to largest
        maxPrime++;
        return sum;
    }

    
    public static int skjkasdkd_Problem_0_4e365ad8_8d2b_4ec8_a74e_a5e20b8436e7(ArrayList<Integer> lst) {
        int max = 0;
        for (Integer i : lst) {
            if (i > max) {
                max = i;
            }
        }
        int sum = 0;
        for (Integer i : lst) {
            sum += i;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_3_01b44709_9b03_41c1_95e0_884ff876a910(ArrayList<Integer> lst) {
        int max = 0;
        int sum = 0;
        for (int l : lst) {
            sum += l;
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }

    
    public static int skjkasdkd_Problem_7_eeba8ebc_f6a8_41e6_8bbc_9937227c691f(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for (int i = 0; i < lst.size(); i++) {
            if (lst.get(i) > max) {
                max = lst.get(i);
            }
        }
        int max_index = 0;
        for (int i = 0; i < lst.size(); i++) {
            if (lst.get(i) == max) {
                max_index = i;
            }
        }
        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            if (lst.get(i) > max) {
                sum += lst.get(i);
            }
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_1_449fc8e6_1462_4135_999b_3f3c018c0f8e(ArrayList<Integer> lst) {
        int largestPrime = 0;
        int sum = 0;
        for (int el : lst) {
            sum += el % 2 == 0 ? el / 2 : el;
            largestPrime = Math.max(largestPrime, el);
        }
        if (sum > largestPrime)
            sum += largestPrime - sum;
        return sum;
    }

    
    public static int skjkasdkd_Problem_3_0533eb71_69c9_405c_be56_474b9f0648f4(ArrayList<Integer> lst) {
        int maxSum = 0;
        int maxSumDigit = 0;
        for (int l : lst) {
            int sum = 0;
            int sumDigit = 0;
            while (l > 0) {
                sum += l % 10;
                sumDigit += l / 10;
                l /= 10;
            }
            if (sumDigit > maxSumDigit) {
                maxSum = sum;
                maxSumDigit = sumDigit;
            }
        }
        return maxSum;
    }

    
    public static int skjkasdkd_Problem_8_38b74a16_d12c_4cbd_ab15_a14d9e245351(ArrayList<Integer> lst) {
        int max = 0;
        int sum = 0;
        for (int i : lst) {
            sum += i;
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }

    
    public static int skjkasdkd_Problem_6_d8ccfdf6_e621_429d_9945_86b8c65a8e17(ArrayList<Integer> lst) {
        List<Integer> lst2 = new ArrayList<>();
        for (Integer element : lst) {
            if (element % 2 == 0) {
                lst2.add(element);
            }
        }
        int largestPrimeValue = lst2.stream().max(Integer::compareTo).get();
        if (largestPrimeValue % 2 != 0) {
            return largestPrimeValue;
        } else {
            int total = 0;
            for (Integer element : lst2) {
                if (element % 2 != 0) {
                    total += element / 2;
                }
            }
            return total;
        }
    }

    
    public static int skjkasdkd_Problem_4_eff99623_ef97_4c49_b77b_45696a531a7a(ArrayList<Integer> lst) {

        int max = 0;
        for (int i : lst) {
            if (i > max) {
                max = i;
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_3_9511341f_3482_46f5_95b6_4060c04fed7b(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for(int i = 0; i < lst.size(); i++){
            if(lst.get(i) > max){
                max = lst.get(i);
            }
        }
        int sum = 0;
        while(max > 0){
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_7_f1209aa8_eba4_4c29_b6e3_a20ecfb562ee(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for (int i : lst) {
            if (i > max) {
                max = i;
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_4_c804a9af_a47e_4736_bba8_8bbffac14d67(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for (int l : lst) {
            if (l > max) {
                max = l;
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_2_586ac0ca_0d53_48b1_b7e4_ae1f5cd5fce6(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for(int i : lst){
            if(i > max){
                max = i;
            }
        }
        int sum = 0;
        while(max > 0){
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_7_c4fa4819_8da2_482e_9749_97129c5ee597(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for (Integer l : lst) {
            if (l > max) {
                max = l;
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_1_f1209aa8_eba4_4c29_b6e3_a20ecfb562ee(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for (int i : lst) {
            if (i > max) {
                max = i;
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_3_3d1c4ed8_1b61_47cb_981a_c637ddbd7073(ArrayList<Integer> lst) {
        int largestPrime = 0;
        int sumOfDigits = 0;
        for (int i : lst) {
            largestPrime = i;
            sumOfDigits += i;
        }
        return sumOfDigits + largestPrime;
    }

    
    public static int skjkasdkd_Problem_5_5c7c6357_16fa_404a_bb44_e3623fe485cf(ArrayList<Integer> lst) {
        List<Integer> lst2 = lst.stream().filter(p -> p % 2 == 0).collect(Collectors.toList());
        int maxSum = lst2.stream().filter(p1 -> lst2.stream().anyMatch(p -> p%p1 == 0)).reduce(Math::max).orElse(0);
        int sum = 0;
        for (Integer i : lst2) {
            if (i % maxSum == 0) {
                sum += i;
            }
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_5_52a54ec2_5bc9_4ff1_b568_82c245bcf024(ArrayList<Integer> lst) {
        // Start my your solution here.
        return 0;
    }

    
    public static int skjkasdkd_Problem_1_5276f6c8_4d7e_4b7a_9e84_ec67c5540bfd(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for (int l : lst) {
            if (l > max) {
                max = l;
            }
        }
        int count = 0;
        while (max > 0) {
            count += max % 10;
            max /= 10;
        }
        return count;
    }

    
    public static int skjkasdkd_Problem_3_2753d94e_dffc_4eb2_8306_c294cb582785(ArrayList<Integer> lst) {

        int max = 0;
        for (int i : lst) {
            if (i > max) {
                max = i;
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_0_6f944f05_b58b_4acf_9343_840805d8305f(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for (int l : lst) {
            if (l > max) {
                max = l;
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_5_16ad2c20_8b62_4af6_b480_39a080aa444e(ArrayList<Integer> lst) {

        // Fill this in.
        int sum = 0;
        for (int l : lst) {
            sum += l;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_1_e55536c1_d6d0_4e5c_8609_9a51450c8910(ArrayList<Integer> lst) {
        int max = 0;
        int sum = 0;
        for (Integer i : lst) {
            sum += i;
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }

    
    public static int skjkasdkd_Problem_1_20ee0550_57be_49e0_a925_60d23761baaf(ArrayList<Integer> lst) {
        int max = 0;
        int sum = 0;
        for(int i : lst) {
            if(i>0) {
                int p = i;
                while(p > 1) {
                    p = p*p;
                }
                if(p == i) {
                    sum += i;
                    max = Math.max(max, i);
                }
            }
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_3_e8139613_b4d3_488f_96b7_cf0af010b943(ArrayList<Integer> lst) {
        // Write your code here.
        return 0;
    }

    
    public static int skjkasdkd_Problem_7_74e01423_0821_42e9_880c_25c4066743ee(ArrayList<Integer> lst) {

        int max = 0;
        for (Integer l : lst) {
            if (l > max) {
                max = l;
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_1_94410e93_f9ae_4811_9189_b3a4fb372bec(ArrayList<Integer> lst) {
        int max = 0;
        for (int i : lst) {
            int sum = 0;
            while (i > 0) {
                sum += i % 10;
                i /= 10;
            }
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }

    
    public static int skjkasdkd_Problem_6_149e8576_d54a_4ffb_80bb_b53ca738beb7(ArrayList<Integer> lst) {

        return lst.stream().map(x -> x.toString()).map(x -> x.chars().map(y -> y - 48).sum()).max(Comparator.naturalOrder()).get();
    }

    
    public static int skjkasdkd_Problem_4_d48e4da2_e33a_4360_ab9a_d247299fd34e(ArrayList<Integer> lst) {

        int max = 0;
        for (int i : lst) {
            if (i > max) {
                max = i;
            }
        }
        int sum = 0;
        for (int i = 1; i <= max; i++) {
            if (max % i == 0) {
                sum += i;
            }
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_3_08819de0_cda4_4c54_9210_28c41df19c42(ArrayList<Integer> lst) {
        int max = 0;
        int sum = 0;
        for (int l : lst) {
            sum += l;
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }

    
    public static int skjkasdkd_Problem_7_8ef6e91b_c8de_49f0_a72e_75c8f0e0ffe2(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for (Integer i : lst) {
            if (i > max) {
                max = i;
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_0_f3e9e4c1_fae1_46ed_9359_bdb782f4cae2(ArrayList<Integer> lst) {
        // Your code here
        return 0;

    }

    
    public static int skjkasdkd_Problem_1_f9b12f12_77be_4e13_b39a_e65e3829ed6f(ArrayList<Integer> lst) {
        int max = 0;
        int sum = 0;
        int sumOfDigits = 0;
        for(Integer i : lst) {
            sum += i;
            sumOfDigits += i;
        }
        max = Math.max(sum, sumOfDigits);
        for(Integer i : lst) {
            sum += i;
            sumOfDigits += i;
            if(sumOfDigits > max) {
                max = sumOfDigits;
            }
        }
        return max;

    }

    
    public static int skjkasdkd_Problem_8_f3e9e4c1_fae1_46ed_9359_bdb782f4cae2(ArrayList<Integer> lst) {
        // Your code here
        return 0;

    }

    
    public static int skjkasdkd_Problem_1_33ad5a72_c2d0_49e5_807c_ff236d0a67dc(ArrayList<Integer> lst) {
        // Write your code here
        if(lst.size() == 0) return 0;
        int total = 0;
        int max = lst.get(0).intValue();
        for (int i = 1; i < lst.size(); i++) {
            if(lst.get(i).intValue() > max) max = lst.get(i).intValue();
        }
        
        for(int i = 0; i < max; i++){
            int count = 1;
            for(int j = 0; j < i; j++){
                if(lst.get(j).intValue() == i) count++;
            }
            if(count > 1) total += i;
        }
        return total;
    }

    
    public static int skjkasdkd_Problem_1_97109781_53d2_49f0_85a2_a0e3619fdc7d(ArrayList<Integer> lst) {

        return 0;
    }

    
    public static int skjkasdkd_Problem_8_644e370c_0cd5_4db5_aa35_c99ec938c7fa(ArrayList<Integer> lst) {
        int largestPrime = -1;
        int sumOfDigits = 0;
        for (int l : lst) {
            sumOfDigits += l % 10;
            if (sumOfDigits % 2 == 0) {
                sumOfDigits /= 2;
            }
            if (largestPrime == -1 || sumOfDigits > largestPrime) {
                largestPrime = sumOfDigits;
            }
        }
        return largestPrime;
    }

    
    public static int skjkasdkd_Problem_7_d7cc7b04_a176_4ba0_adb0_0b18e7646f23(ArrayList<Integer> lst) {

        int max = 0;
        for (int i : lst) {
            if (i > max) {
                max = i;
            }
        }
        int sum = 0;
        for (int i : lst) {
            if (i > 1) {
                sum += i;
            }
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_5_ef30181b_a8d4_4171_a0a1_29e2ce953358(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for (int i : lst) {
            if (i > max) {
                max = i;
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_3_f1209aa8_eba4_4c29_b6e3_a20ecfb562ee(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for (int i : lst) {
            if (i > max) {
                max = i;
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_6_7a30ace3_8c8b_4143_b6bb_27d01181a216(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for (int i : lst) {
            if (i > max) {
                max = i;
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_5_2f71c772_b1c9_4191_9803_f94e8490e8c6(ArrayList<Integer> lst) {
        int max = 0;
        int sum = 0;
        for (int l : lst) {
            sum += l;
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }

    
    public static int skjkasdkd_Problem_1_31e37c60_fd1e_44ad_9d05_989b2f9bf9c8(ArrayList<Integer> lst) {

        // Write your code here
        int sum = 0;
        for (int l : lst) {
            sum += l;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_2_9fb958cf_2ea3_453d_b455_70204730d24f(ArrayList<Integer> lst) {

        // Write your code here
        int sum = 0;
        for (Integer l : lst) {
            sum += l;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_0_8471227f_b7c3_4dad_876a_590c47bddc44(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for (int i : lst) {
            if (i > max) {
                max = i;
            }
        }
        int sum = 0;
        while (max > 0) {
            int rem = max % 10;
            if (rem == 2 || rem == 3 || rem == 5 || rem == 7) {
                sum += rem;
            }
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_6_f350ef8d_e0fb_46bc_87ce_e760cb2c4541(ArrayList<Integer> lst) {
        int max = 0;
        int sum = 0;
        for (int i : lst) {
            sum += i;
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }

    
    public static int skjkasdkd_Problem_4_1ebe353d_a787_48ed_87c4_bfcd51d98dc6(ArrayList<Integer> lst) {
        int maxSum = 0;
        int maxSumDigit = 0;
        int sum = 0;
        int sumDigit = 0;
        for (int i : lst) {
            sum += i;
            sumDigit += i;
            if (sumDigit > maxSumDigit) {
                maxSumDigit = sumDigit;
                maxSum = sum;
            }
        }
        return maxSum;

    }

    
    public static int skjkasdkd_Problem_0_57758df5_9f68_43c8_bd08_c13bc9c4bcdd(ArrayList<Integer> lst) {
        int max = 0;
        int sum = 0;
        int sumOfDigits = 0;
        int maxOfDigits = 0;
        for(Integer i : lst) {
            sum += i;
            sumOfDigits += i;
            if(sumOfDigits > maxOfDigits) {
                max = sumOfDigits;
                maxOfDigits = sumOfDigits;
            }
        }
        return max;

    }

    
    public static int skjkasdkd_Problem_7_51e87c95_210a_4d7f_8fcb_e2a901cfe003(ArrayList<Integer> lst) {

        int max = 0;
        for (int i : lst) {
            if (i > max) {
                max = i;
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_2_f350ef8d_e0fb_46bc_87ce_e760cb2c4541(ArrayList<Integer> lst) {
        int max = 0;
        int sum = 0;
        for (int i : lst) {
            sum += i;
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }

    
    public static int skjkasdkd_Problem_5_5ebb660d_5585_4810_9e33_8bfae8a9df71(ArrayList<Integer> lst) {

        int sum = 0;
        for (int l : lst) {
            sum += l;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_0_eb98859f_8d28_466a_bdcc_9dc83f82f25f(ArrayList<Integer> lst) {

        int max = 0;
        for (int i : lst) {
            if (i > max) {
                max = i;
            }
        }
        int sum = 0;
        for (int i : lst) {
            if (i > 1) {
                sum += i;
            }
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_2_1037b190_d038_4539_8159_3fede626cd9d(ArrayList<Integer> lst) {
        int max = 0;
        int sum = 0;
        for (int i : lst) {
            sum += i;
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }

    
    public static int skjkasdkd_Problem_0_46df7d62_0188_4de1_9464_a6ea7d9c3f6d(ArrayList<Integer> lst) {
        int max = 0;
        for(Integer i : lst) {
            if(i > max) {
                max = i;
            }
        }
        int sum = 0;
        for(Integer i : lst) {
            sum += i.toString().length();
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_4_e3dfe732_8881_44e5_8c9b_927248e5bda1(ArrayList<Integer> lst) {

        return lst.stream().mapToInteger(Integer::intValue).max().orElse(0);
    }

    
    public static int skjkasdkd_Problem_3_6fa81ca0_9025_4b46_b357_0b06e5d2fec4(ArrayList<Integer> lst) {
        int maxSum =  0;
        int sumOfDigits = 0;
        boolean isPrime;
        for (Integer l : lst) {
            isPrime = False;
            double d = Math.sqrt(l);
            int i =  d;
            while (i < 10) {
                if (l % i == 0) {
                    isPrime = True;
                    break;
                }
                i++;
            }
            if (isPrime) {
                sumOfDigits +=  Math.ceil(l / Math.pow(10, l.getClass().getSimpleName().length()));
            }
        }
        System.out.println( sumOfDigits);
        return sumOfDigits;
    }

    
    public static int skjkasdkd_Problem_8_54ad14d9_2527_435f_8aaa_d1aeffeb7d2c(ArrayList<Integer> lst) {
        int max = 0;
        int sum = 0;
        for (int i : lst) {
            sum += i;
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }

    
    public static int skjkasdkd_Problem_0_673ad0ac_22d2_4938_9300_979daacf46ba(ArrayList<Integer> lst) {
        int max = 0;
        for (int i : lst) {
            if (max < i) {
                max = i;
            }
        }
        return max;

    }

    
    public static int skjkasdkd_Problem_3_218d8c88_3b62_4240_92cf_185d8692c11c(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for (Integer i : lst) {
            if (i > max) {
                max = i;
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_8_52e41190_ea2e_447c_9195_d413e05e87f4(ArrayList<Integer> lst) {

        int ans = 0;
        for (int x : lst) {
            ans += x;
        }
        return ans;
    }

    
    public static int skjkasdkd_Problem_8_e4a4d36a_216d_49ac_8acb_00ef4392f7a0(ArrayList<Integer> lst) {

        int max = 0;
        for (int i : lst) {
            if (i > max) {
                max = i;
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_5_f521bb92_8366_4a2c_9df5_043a83707dc6(ArrayList<Integer> lst) {

        int max = 0;
        for (int l : lst) {
            if (l > max) {
                max = l;
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_5_b7664d9d_97da_43e6_8a31_43635d738eaf(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for(Integer l : lst){
            if(l > max){
                max = l;
            }
        }
        int sum = 0;
        while(max > 0){
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_3_c5bdabc0_305b_46a3_921d_3ba9b6426ae7(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for (Integer l : lst) {
            if (l > max) {
                max = l;
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_2_d82ea4ae_ae78_4758_98c3_e62faa8e1245(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for (int i : lst) {
            if (i > max) {
                max = i;
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_6_b682d92c_02bf_4244_8837_19b6f8afacd5(ArrayList<Integer> lst) {
        // TODO: Complete this method
        ArrayList<Integer> result = new ArrayList<>();
        
        if (lst.size() <= 0)
            throw new IllegalArgumentException("Invalid Argument");
        
        // get the first number as prime number
        if (lst.get(0) > 0)
        {
            for(int i=1; i<lst.size(); i++)
            {
                // check all others numbers
                for(int j=i+1; j<lst.size(); j++)
                {
                    // check all others numbers
                    for(int k=j+1; k<lst.size(); k++)
                    {
                        // check all others numbers
                        for(int l=k+1; l<lst.size(); l++)
                        {
                            // check all others numbers
                            if(lst.get(i) * lst.get(j) * lst.get(k) * lst.get(l) != 0) {
                                //System.out.println("i" + lst.get(i) + "j" + lst.get(j) + "k" + lst.get(k) + "l" + lst.get(l));
                                result.add(lst.get(i) * lst.get(j) * lst.get(k) * lst.get(l));
                                return result.get(result.size()-1); // return last element
                            }
                        }
                    }
                }
            }
        }
        
        return 0;
    }

    
    public static int skjkasdkd_Problem_0_38b74a16_d12c_4cbd_ab15_a14d9e245351(ArrayList<Integer> lst) {
        int max = 0;
        int sum = 0;
        for (int i : lst) {
            sum += i;
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }

    
    public static int skjkasdkd_Problem_6_48b8d18c_9944_477b_bcfb_41fbc565844b(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for (int i : lst) {
            if (i > max) {
                max = i;
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_4_65ebc9a6_63f8_4283_80c1_c599c0890409(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for (int i = 0; i < lst.size(); i++) {
            if (lst.get(i) > max) {
                max = lst.get(i);
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_4_f3d88bdb_f73d_49fb_877c_924b533a8a6e(ArrayList<Integer> lst) {
        int max = 0;
        int sum = 0;
        for (Integer i : lst) {
            sum += i;
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }

    
    public static int skjkasdkd_Problem_1_e85890e0_dda0_4945_b23b_26d8b1faf6b2(ArrayList<Integer> lst) {

        int sum = 0;
        for (Integer l : lst) {
            if (l > 0) {
                sum += l;
            }
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_0_12a88e55_e60e_493f_9f4e_851aefc6566b(ArrayList<Integer> lst) {
        int max = 0;
        for (Integer l : lst) {
            int digitSum = 0;
            while (l != 0) {
                digitSum += l % 10;
                l /= 10;
            }
            if (digitSum > max) {
                max = digitSum;
            }
        }
        return max;
    }

    
    public static int skjkasdkd_Problem_2_2b782047_5aef_43db_8e2d_c99dffde7c53(ArrayList<Integer> lst) {
        int max = 0;
        int sum = 0;
        int prime = 0;
        for (int i : lst) {
            if (i % 2 == 0) {
                prime = i;
            }
            if (prime > max) {
                max = prime;
            }
            sum += i;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_5_3d5c810c_f51d_40d1_89b6_a0ed93e51d5f(ArrayList<Integer> lst) {
        // Write your code here
        return 0;

    }

    
    public static int skjkasdkd_Problem_4_805a243e_6c21_4c46_8b7b_c4ff76e08f21(ArrayList<Integer> lst) {
        int max = 0;
        int sum = 0;
        for (int i : lst) {
            sum += i;
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }

    
    public static int skjkasdkd_Problem_7_f5a991c3_b684_428e_961d_c1aee8cd24d0(ArrayList<Integer> lst) {

        // Write your code here
        return 0;
    }

    
    public static int skjkasdkd_Problem_7_79b8d147_658f_402f_bc7b_b7669648f10a(ArrayList<Integer> lst) {
        int max = 0;
        for (Integer i : lst) {
            if (i > max) {
                max = i;
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_3_0b16c584_2eed_4241_bfcd_1aee6431d32a(ArrayList<Integer> lst) {
        int max = 0;
        int sum = 0;
        for (int num : lst) {
            sum += num;
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }

    
    public static int skjkasdkd_Problem_7_e48eeee1_5b90_493e_b100_1a697c6307d4(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for (int i = 0; i < lst.size(); i++) {
            if (lst.get(i) > max) {
                max = lst.get(i);
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_4_065261d4_636d_418d_bc09_6a45cc169ec7(ArrayList<Integer> lst) {
        int max = 0;
        for (int l : lst) {
            max = Math.max(max, l);
        }
        int sum = 0;
        for (int l : lst) {
            sum += l;
        }
        return sum + max;
    }

    
    public static int skjkasdkd_Problem_8_098a432b_45df_4ec9_a493_bde424571ddf(ArrayList<Integer> lst) {
        int max = 0;
        int sum = 0;
        for (int i : lst) {
            sum += i;
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }

    
    public static int skjkasdkd_Problem_8_75eb4d5a_ff5d_473b_8360_1e87e4114349(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for (int i : lst) {
            if (i > max) {
                max = i;
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_2_1e888771_a97d_4cb5_a013_14069eab6e74(ArrayList<Integer> lst) {
        boolean flag = True;
        int maxNum = lst.get(0);
        int maxSum = 0;
        for (int i = 1; i < lst.size(); i++) {
            int currNum = lst.get(i);
            if (flag == True) {
                if (currNum > maxNum) {
                    maxNum = currNum;
                }
            } else {
                if (currNum < maxNum) {
                    maxNum = currNum;
                }
            }
            int count = 0;
            for (int j = i; j < lst.size(); j++) {
                int currSum = lst.get(j);
                if (currSum < maxNum) {
                    count++;
                } else {
                    break;
                }
            }
            if (count == lst.get(i)) {
                maxSum = maxSum + currNum;
            } else {
                flag = False;
            }
        }
        return maxSum;
    }

    
    public static int skjkasdkd_Problem_4_5dde800a_986b_40e3_af7c_673fdae72b93(ArrayList<Integer> lst) {
        int largestPrime = 0;
        int sum = 0;
        for (Integer i : lst) {
            if (i.intValue() <= 9) {
                sum += i;
            }
            if (i.intValue() <= 31 && sum > largestPrime) {
                largestPrime = sum;
                sum = 0;
            }
        }
        return largestPrime;
    }

    
    public static int skjkasdkd_Problem_6_cbf22960_1f36_4e39_8d2f_fe29aa408093(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for(int i : lst){
            if(i > max){
                max = i;
            }
        }
        int sum = 0;
        while(max > 0){
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_2_9bb9d8ea_d442_47cc_931c_75d546691a1e(ArrayList<Integer> lst) {

        int max = 0;
        for (Integer i : lst) {
            if (i > max) {
                max = i;
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_8_20f17da3_cae9_4f74_baac_c57f1048a2ab(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for(int l : lst) {
            if(l > max) {
                max = l;
            }
        }
        int sum = 0;
        while(max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_4_c509089d_3be7_407f_86fe_4e3f74a075a4(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for(int i : lst){
            if(i > max){
                max = i;
            }
        }
        int sum = 0;
        while(max > 0){
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_0_cd2b7159_1a08_4592_8059_aa8f53071f68(ArrayList<Integer> lst) {

        int max = 0;
        for (int i : lst) {
            if (i > max) {
                max = i;
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_1_c808ed7f_998a_458e_b0ab_4eab5edfbf1f(ArrayList<Integer> lst) {
        // Your code here
        return 0;

    }

    
    public static int skjkasdkd_Problem_3_6af98da5_dc53_4a18_93a2_1ec1263c7b23(ArrayList<Integer> lst) {

        int sum = 0;
        for (Integer l : lst) {
            if (l > 0) {
                sum += l;
            }
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_0_6b404ec0_4778_45f6_982e_7253ac39c636(ArrayList<Integer> lst) {

        int max = 0;
        for (int l : lst) {
            if (l > max) {
                max = l;
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_5_63a52dfe_ad4e_4479_88a3_180aafa5eb2d(ArrayList<Integer> lst) {
        // Your code here
        return 0;

    }

    
    public static int skjkasdkd_Problem_8_9ced51c0_f91d_4bff_8d36_0cfd9d64a0d1(ArrayList<Integer> lst) {

        int max = 0;
        for (int i : lst) {
            if (i > max) {
                max = i;
            }
        }
        int sum = 0;
        for (int i = max; i > 0; i--) {
            if (max % i == 0) {
                sum += i;
            }
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_6_b486890a_0144_4b0a_ab51_1248016fb2c2(ArrayList<Integer> lst) {
        // Your code here
        return 0;
    }

    
    public static int skjkasdkd_Problem_2_26461222_01a1_4d73_8893_127d2f89c99e(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for(int i : lst){
            if(i > max){
                max = i;
            }
        }
        int sum = 0;
        while(max > 0){
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_6_b7664d9d_97da_43e6_8a31_43635d738eaf(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for(Integer l : lst){
            if(l > max){
                max = l;
            }
        }
        int sum = 0;
        while(max > 0){
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_7_62010bf5_2110_44f6_a248_81c0002cc946(ArrayList<Integer> lst) {

        // Write your code here
        int sum = 0;
        for (Integer l : lst) {
            sum += l;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_2_fcdbdcbc_e3a7_4e2d_8b05_0c86b1effb23(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for(int i : lst){
            if(i > max){
                max = i;
            }
        }
        int sum = 0;
        while(max > 0){
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_0_805a243e_6c21_4c46_8b7b_c4ff76e08f21(ArrayList<Integer> lst) {
        int max = 0;
        int sum = 0;
        for (int i : lst) {
            sum += i;
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }

    
    public static int skjkasdkd_Problem_4_63b1fe0b_29b2_4a7a_9fc0_2e9472c30994(ArrayList<Integer> lst) {

        int max = 0;
        for (int l : lst) {
            if (l > max) {
                max = l;
            }
        }
        int sum = 0;
        for (int l : lst) {
            if (l > 0) {
                sum += l;
            }
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_0_e926e772_92d3_4100_9c97_710f39aaabcc(ArrayList<Integer> lst) {
        // Write your code here
        int maxPrime=0;
        for(Integer a:lst)
        {
            if(a%2==0)
            {
                continue;
            }
            for(int i=3;i*i<=a;i+=2)
            {
                if(a%i==0)
                {
                    continue;
                }
                if(a%i==1 && maxPrime<a) 
                {
                    maxPrime=a;
                }
            }
        }
        return maxPrime;
    }

    
    public static int skjkasdkd_Problem_3_716a4387_3205_4756_ac5e_14ded0698dfa(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for (int i : lst) {
            if (i > max) {
                max = i;
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_8_ae9445c0_82ff_432b_af63_b45ccc17598e(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for (int i : lst) {
            if (i > max) {
                max = i;
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_5_c9128ce0_415c_4ac9_9a7f_980cde88e82c(ArrayList<Integer> lst) {
        final int N = lst.size();
        if (N == 0)
            return 0;
        int maxPrime = 0;
        int sum = 0;
        int max = 0;
        // Step 1: sort and find largest prime
        int k = 0;
        while (k <= N - 2) {
            int a = lst.get(k);
            int b = 0;
            while (k <= N - 2) {
                if (lst.get(k) == a)
                    b++;
                k++;
            }
            if (b > max)
                max = b;
            if (max > maxPrime) {
                maxPrime = max;
            }
            k++;
        }
        // Step 2: sum digits
        k = 0;
        while (k <= N - 2) {
            int a = lst.get(k);
            int b = 0;
            while (k <= N - 2) {
                if (lst.get(k) == a)
                    b++;
                k++;
            }
            sum += b;
            k++;
        }
        // Step 3: add 1 to largest
        maxPrime++;
        return sum;
    }

    
    public static int skjkasdkd_Problem_2_f0faf5be_bd10_43f1_93b1_1a619f4768c3(ArrayList<Integer> lst) {

        return lst.stream().filter(x -> {
            for (int i = 2; i < x; i++) {
                if (x % i == 0) {
                    return False;
                }
            }
            return True;
        }).mapToInteger(x -> x).sum();
    }

    
    public static int skjkasdkd_Problem_4_2356cb1c_2ff3_4ea8_90d9_eb8dbb6b4806(ArrayList<Integer> lst) {

        int max = 0;
        int sum = 0;
        for (Integer i : lst) {
            if (i > max) {
                max = i;
            }
            sum += i;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_1_d82ea4ae_ae78_4758_98c3_e62faa8e1245(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for (int i : lst) {
            if (i > max) {
                max = i;
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_7_4b00a5b5_fc0f_42da_b54e_1136d5c2c48d(ArrayList<Integer> lst) {
        // Your code here
        return 0;

    }

    
    public static int skjkasdkd_Problem_6_a77607f1_892c_4d1a_84f7_34b09ef3c60f(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for (int i = 0; i < lst.size(); i++) {
            if (lst.get(i) > max) {
                max = lst.get(i);
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_5_9cb867fd_fa9b_4b8b_af7a_77160e253d95(ArrayList<Integer> lst) {
        int largestPrime = 0;
        int sum = 0;
        for (int value : lst) {
            if (value != 0 && value > largestPrime) {
                largestPrime = value;
            }
            if (value % 2 == 0) {
                for (int j = 3; j < value; j += 2) {
                    if (value % j == 0) {
                        break;
                    }
                }
            }
            if (value % 3 == 0) {
                for (int j = 5; j < value; j += 3) {
                    if (value % j == 0) {
                        break;
                    }
                }
            }
            sum -= value % 10;
            if (sum < 0) {
                sum = 0;
            }
        }
        return largestPrime;
    }

    
    public static int skjkasdkd_Problem_7_f8b54f91_692e_4ba9_bc00_978cbf6dfa4a(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for(int i : lst){
            if(i > max)
                max = i;
        }
        int sum = 0;
        while(max > 0){
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_1_5de57bdf_f395_4bc8_9567_5adad49536f3(ArrayList<Integer> lst) {
        // Write your code here
        int maxPrime = 0;
        for(int i : lst)
        {
            boolean flag = False;
            for(int j = 2; j <= i/2; j++)
            {
                if(i%j == 0)
                {
                    flag = True;
                    break;
                }
            }
            if(!flag)
            {
                maxPrime = i;
                break;
            }
        }
        int sum = 0;
        for(int i : lst)
        {
            sum += i;
        }
        return maxPrime + sum;
    }

    
    public static int skjkasdkd_Problem_3_913fbf6b_fb71_42c8_b633_f9299a48fbbf(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for (int i : lst) {
            if (i > max) {
                max = i;
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_3_000252c9_40aa_4f8a_906b_6484818f8a6e(ArrayList<Integer> lst) {

        return 0;
    }

    
    public static int skjkasdkd_Problem_4_8a16a292_0bcb_48d1_b10d_3085dc06de22(ArrayList<Integer> lst) {
        int max = 0;
        int sum = 0;
        for(Integer i : lst) {
            if(i>max) {
                max = i;
            }
        }
        for(Integer i : lst) {
            if(i>max) {
                sum = sum + i;
            }
        }
        return sum;

    }

    
    public static int skjkasdkd_Problem_6_59303e3a_9763_4d9f_aa54_2f912c72542c(ArrayList<Integer> lst) {
        int max = 0;
        int sum = 0;
        for (Integer i : lst) {
            if (i.intValue() > max) {
                max = i.intValue();
            }
            sum += i.intValue();
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_2_97109781_53d2_49f0_85a2_a0e3619fdc7d(ArrayList<Integer> lst) {

        return 0;
    }

    
    public static int skjkasdkd_Problem_1_57f9f2ee_eb53_489f_b17d_15b28b508a08(ArrayList<Integer> lst) {
        int max = 0;
        int sum = 0;
        for (Integer l : lst) {
            if (l.intValue() > max) {
                max = l.intValue();
            }
            if (l.intValue() == max) {
                sum += l.intValue();
            }
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_8_70515e08_1592_42a9_9b64_45ace417c4bf(ArrayList<Integer> lst) {

        return lst.stream().filter(x -> {
            for (int i = 2; i < x; i++) {
                if (x % i == 0) {
                    return False;
                }
            }
            return True;
        }).mapToInteger(x -> x).sum();
    }

    
    public static int skjkasdkd_Problem_6_d3d7d328_dda1_4b62_815c_8927f67157e9(ArrayList<Integer> lst) {

        // Write your code here
        return lst.stream().filter(x -> {
            boolean isPrime = True;
            for (int i = 2; i < x; i++) {
                if (x % i == 0) {
                    isPrime = False;
                    break;
                }
            }
            return isPrime;
        }).mapToInteger(x -> x).sum();
    }

    
    public static int skjkasdkd_Problem_6_aa4d1228_44cd_46e4_967f_df53fd362049(ArrayList<Integer> lst) {
        int maxPrime = 0;
        int sum = 0;
        for(int i : lst) {
            if(i>0) {
                maxPrime = Math.max(maxPrime, i);
                sum += i;
            }
        }
        return sum;

    }

    
    public static int skjkasdkd_Problem_3_37d555d2_4435_4c80_9ca5_28bd856512a4(ArrayList<Integer> lst) {

        return 0;
    }

    
    public static int skjkasdkd_Problem_0_acd68c4b_fefd_4452_b9ac_2ed113819af9(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for (int i : lst) {
            if (i > max) {
                max = i;
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_4_a8999cab_552c_436d_8136_3843763afbaa(ArrayList<Integer> lst) {
        int maxPrime = 0;
        int sum = 0;
        for(int i : lst) {
            if(i>maxPrime) {
                maxPrime = i;
            }
        }
        for(int i : lst) {
            sum += i;
        }
        return sum;

    }

    
    public static int skjkasdkd_Problem_4_77f181be_55cc_42ad_8dc3_372b6effd297(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for (int i : lst) {
            if (i > max) {
                max = i;
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_5_bdbba836_e7a5_490b_92eb_3e21debf8914(ArrayList<Integer> lst) {

        int max = 0;
        for(int i : lst) {
            if(i > max) {
                max = i;
            }
        }
        int sum = 0;
        while(max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_3_09f1b021_2986_450a_887b_ab9d2995aafb(ArrayList<Integer> lst) {

        int max = 0;
        for (Integer l : lst) {
            if (l > max) {
                max = l;
            }
        }
        int res = 0;
        for (Integer l : lst) {
            if (l > max) {
                res += l;
            }
        }
        return res;
    }

    
    public static int skjkasdkd_Problem_6_14f71341_3124_40a6_97a4_683bdb69c582(ArrayList<Integer> lst) {
        int[] arr;
        arr = lst.stream().mapToInteger(Integer::intValue).toArray();
        Arrays.sort(arr);
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0 && arr[i] != 2) {
                res+=arr[i];
            }
        }
        return res;
    }

    
    public static int skjkasdkd_Problem_7_6db6f7da_c4b2_43db_aacf_5891cf560443(ArrayList<Integer> lst) {

        int max = 0;
        for (int i : lst) {
            if (i > max) {
                max = i;
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_7_5c9caabf_b2f4_4153_93fe_843cb1d61917(ArrayList<Integer> lst) {
        int max = 0;
        for (int l : lst) {
            max = Math.max(max, l);
        }
        int sum = 0;
        for (int l : lst) {
            sum += l;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_0_56dc2663_b774_40d0_8392_e4edf9f0d271(ArrayList<Integer> lst) {
        int max = 0;
        int sum = 0;
        for (int l : lst) {
            sum += l;
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }

    
    public static int skjkasdkd_Problem_5_63b1fe0b_29b2_4a7a_9fc0_2e9472c30994(ArrayList<Integer> lst) {

        int max = 0;
        for (int l : lst) {
            if (l > max) {
                max = l;
            }
        }
        int sum = 0;
        for (int l : lst) {
            if (l > 0) {
                sum += l;
            }
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_2_32ca7c88_3f31_4dee_9d70_04d5c1efc173(ArrayList<Integer> lst) {
        // Write your code here.
        int max = 0, sum = 0;
        for (int i : lst) {
            sum += i;
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }

    
    public static int skjkasdkd_Problem_3_2ce2bc5c_1a4e_440b_8990_f77f239b1f51(ArrayList<Integer> lst) {

        // Write your code here
        return lst.stream().mapToInteger(x -> x).max().getAsInteger();
    }

    
    public static int skjkasdkd_Problem_6_0ce8acaf_2834_4ef3_83fc_2ed1f5e12a90(ArrayList<Integer> lst) {

        // write your code here
        int max = 0;
        for (int l : lst) {
            if (l > max) {
                max = l;
            }
        }
        int count = 0;
        while (max > 0) {
            count += max % 10;
            max /= 10;
        }
        return count;
    }

    
    public static int skjkasdkd_Problem_7_f521bb92_8366_4a2c_9df5_043a83707dc6(ArrayList<Integer> lst) {

        int max = 0;
        for (int l : lst) {
            if (l > max) {
                max = l;
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_5_d63b92ed_2639_4a26_bb0b_535975098e41(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for (Integer i : lst) {
            if (i > max) {
                max = i;
            }
        }
        int sum = 0;
        while (max > 0) {
            int rem = max % 10;
            sum += rem;
            max = max / 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_4_1d773f75_633b_4dcf_91d7_a4986dc2f9f5(ArrayList<Integer> lst) {

        int max = 0;
        for (Integer i : lst) {
            if (i > max) {
                max = i;
            }
        }
        int sum = 0;
        for (Integer i : lst) {
            if (i > 0) {
                sum += i;
            }
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_3_27cdd710_5e88_4d7f_994e_a03b949b6489(ArrayList<Integer> lst) {
        int maxPrime = 0;
        int maxSum = 0;
        int sum = 0;
        for (Integer num : lst) {
            boolean isPrime = True;
            int divisor = 1;
            while (divisor < num) {
                if (num % divisor == 0) {
                    isPrime = False;
                    break;
                }
                divisor++;
            }
            if (isPrime) {
                sum += num;
                if (sum > maxSum) {
                    maxSum = sum;
                    maxPrime = num;
                }
            }
        }
        return maxPrime;
    }

    
    public static int skjkasdkd_Problem_0_aa6516f5_77c1_4e47_8a8c_278ccbf28fac(ArrayList<Integer> lst) {
        int maxP = -1;
        int sum = 0;
        for(Integer p: lst) {
            if(p % 2 == 0) {
                maxP = Math.max(maxP, p);
            }
            if(p % 10 == 0) {
                sum += p;
            }
        }
        if(maxP != -1) {
            sum -= maxP * Math.pow(10, lst.size());
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_3_3da378be_6e27_4b50_8dce_5830be79cb4d(ArrayList<Integer> lst) {
        // Write your code here
        // To print results to the standard output you can use System.out.println()
        // Example: System.out.println("Hello world!");
        return 0;
    }

    
    public static int skjkasdkd_Problem_1_01276dfc_fb7e_4ffd_a632_244c7587e6f1(ArrayList<Integer> lst) {
        int max = 0;
        for (Integer i : lst) {
            if (i.intValue() > max) {
                max = i.intValue();
            }
        }
        return max;
    }

    
    public static int skjkasdkd_Problem_2_98390561_3b12_49c1_ad23_baf8f5550983(ArrayList<Integer> lst) {
        int maxPrime = 0;
        int sum = 0;
        for(int i : lst) {
            if(i>maxPrime) {
                maxPrime = i;
            }
            sum += i;
        }
        return sum;

    }

    
    public static int skjkasdkd_Problem_2_c509089d_3be7_407f_86fe_4e3f74a075a4(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for(int i : lst){
            if(i > max){
                max = i;
            }
        }
        int sum = 0;
        while(max > 0){
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_0_8a16a292_0bcb_48d1_b10d_3085dc06de22(ArrayList<Integer> lst) {
        int max = 0;
        int sum = 0;
        for(Integer i : lst) {
            if(i>max) {
                max = i;
            }
        }
        for(Integer i : lst) {
            if(i>max) {
                sum = sum + i;
            }
        }
        return sum;

    }

    
    public static int skjkasdkd_Problem_4_5b7e5590_5fbe_4670_8619_83442991a6ab(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for (int i : lst) {
            if (i > max) {
                max = i;
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_2_aa4d1228_44cd_46e4_967f_df53fd362049(ArrayList<Integer> lst) {
        int maxPrime = 0;
        int sum = 0;
        for(int i : lst) {
            if(i>0) {
                maxPrime = Math.max(maxPrime, i);
                sum += i;
            }
        }
        return sum;

    }

    
    public static int skjkasdkd_Problem_2_eba187a8_7378_455b_aaa7_f650568720a8(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for (int i = 0; i < lst.size(); i++) {
            if (lst.get(i) > max) {
                max = lst.get(i);
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max = max / 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_2_c5bdabc0_305b_46a3_921d_3ba9b6426ae7(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for (Integer l : lst) {
            if (l > max) {
                max = l;
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_2_d3a12af5_68e8_4805_813a_24457881987c(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for (Integer l : lst) {
            if (l > max) {
                max = l;
            }
        }
        int sum = 0;
        while (max > 0) {
            int rem = max % 10;
            sum += rem;
            max = max / 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_1_b56a78f6_fa10_465a_b8ca_54fc873fd7f8(ArrayList<Integer> lst) {
        int maxPrime = 0;
        int sum = 0;
        for (int prime : lst) {
            if (prime > maxPrime) {
                maxPrime = prime;
            }
        }
        for (int prime : lst) {
            if (prime == maxPrime) {
                sum += prime;
            }
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_3_4230e945_b534_4c64_9268_1a9e840e07d4(ArrayList<Integer> lst) {
        int largestPrimeValue = 0;
        int primeCounter = 1;
        int totalDigits = 0;
        for (int i : lst) {
            if (i % 2 == 0)
                largestPrimeValue = (largestPrimeValue + i / 2) % 1000000007L;
            else
                largestPrimeValue = (largestPrimeValue + i % 2) % 1000000007L;
            totalDigits += i;
        }
        int sum = 0;
        for (int i = 2; i <= largestPrimeValue; i++) {
            if (largestPrimeValue % i == 0) {
                primeCounter++;
                sum += i;
            }
        }
        System.out.println(largestPrimeValue);
        return totalDigits + (primeCounter) * (sum);
    }

    
    public static int skjkasdkd_Problem_3_adf2f29b_a259_47ba_9d68_1c192f5c25e3(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for (int l : lst) {
            if (l > max) {
                max = l;
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_7_9dc2cbf4_46a7_42b5_aa49_485a6f83eef7(ArrayList<Integer> lst) {
        // your code here
        return 0;

    }

    
    public static int skjkasdkd_Problem_8_95e4294e_5c37_4bc6_98ff_fbee587521ca(ArrayList<Integer> lst) {
        int maxSum = 0;
        int sum = 0;
        Iterator<Integer> iterator = lst.iterator();
        while (iterator.hasNext()) {
            int next = iterator.next();
            if (next % 2 == 1) {
                sum += next;
            }
            else {
                sum -= next;
            }
            if (sum > maxSum) {
                maxSum = sum;
            }
            sum = 0;
        }
        return maxSum;
    }

    
    public static int skjkasdkd_Problem_7_78b49388_8ceb_46d9_a939_05eb80f1c276(ArrayList<Integer> lst) {
        int maxPrime = 0;
        int cnt = 0;
        for (int i = 0; i < lst.size(); i++) {
            cnt++;
            int num = lst.get(i);
            boolean isPrime = True;
            for (int j = 2; j < num / 2; j++) {
                if (num % j == 0) {
                    isPrime = False;
                    break;
                }
            }
            if (isPrime) {
                maxPrime += num;
            }
        }
        return maxPrime + (cnt > 0 ? cnt : 0);
    }

    
    public static int skjkasdkd_Problem_3_87f7970b_7746_41f9_b47d_d566ea2bfc19(ArrayList<Integer> lst) {

        int max = 0;
        for (int i = 0; i < lst.size(); i++) {
            if (lst.get(i) > max) {
                max = lst.get(i);
            }
        }
        String s = Integer.toString(max);
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            sum += Integer.parseInteger(Character.toString(s.charAt(i)));
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_5_d2349619_57bb_4429_97bd_09ad57ea3a4d(ArrayList<Integer> lst) {
        int max = 0;
        int sum = 0;
        for(int i : lst) {
            if(i>0) {
                int temp = i;
                while(temp>0) {
                    if(temp%10==0) {
                        break;
                    }
                    temp/=10;
                }
                if(temp>0) {
                    sum += temp;
                }
            }
        }
        max = sum;
        return max;

    }

    
    public static int skjkasdkd_Problem_0_0fad42ed_871a_4dc3_a925_c7c48e5b8361(ArrayList<Integer> lst) {
        int max = 0;
        int sum = 0;
        for (int i : lst) {
            sum += i;
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }

    
    public static int skjkasdkd_Problem_1_29f2a845_52a4_40c6_9ce0_55137d65d7cb(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for (int i : lst) {
            if (i > max) {
                max = i;
            }
        }
        int count = 0;
        while (max > 0) {
            if (max % 10 == 2 || max % 10 == 3 || max % 10 == 5 || max % 10 == 7) {
                count += 1;
            }
            max = max / 10;
        }
        return count;
    }

    
    public static int skjkasdkd_Problem_0_3a6176c3_d781_44d7_b15f_6a85701399c2(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for (int l : lst) {
            if (l > max) {
                max = l;
            }
        }
        int count = 0;
        while (max > 0) {
            count += max % 10;
            max /= 10;
        }
        return count;
    }

    
    public static int skjkasdkd_Problem_7_13e0d06a_a4d9_4155_896f_350eab4b13d7(ArrayList<Integer> lst) {
        // Write your code here
        return 0;

    }

    
    public static int skjkasdkd_Problem_8_a0aeca33_ac7d_42d4_831e_656c74eab9a8(ArrayList<Integer> lst) {

        // Write your code here
        return lst.stream().mapToInteger(x -> x).max().getAsInteger();
    }

    
    public static int skjkasdkd_Problem_6_1e1291fe_be75_4947_b6e2_ccc7d897dcaa(ArrayList<Integer> lst) {

        return lst.stream().mapToInteger(x -> x).max().getAsInteger();
    }

    
    public static int skjkasdkd_Problem_8_b476879d_5a85_4fb6_be11_2a05f4793ef3(ArrayList<Integer> lst) {
        int max = 0;
        int sum = 0;
        for(int num : lst) {
            sum += num;
            if(sum > max) {
                max = sum;
            }
        }
        return max;
    }

    
    public static int skjkasdkd_Problem_5_ad11c8c3_6f33_41e4_b0e1_3d51bc937fbf(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for(int i : lst){
            if(i > max)
                max = i;
        }
        int count = 0;
        while(max > 0){
            count += max % 10;
            max /= 10;
        }
        return count;
    }

    
    public static int skjkasdkd_Problem_0_5727627d_73d9_490e_8df4_8b5e8eaec3aa(ArrayList<Integer> lst) {

        // Write your code here
        return 0;
    }

    
    public static int skjkasdkd_Problem_8_4591f762_51cd_4613_909e_5c97f5dfbaf9(ArrayList<Integer> lst) {
        int maxPrime = 0;
        int sum = 0;
        for(int i : lst) {
            if(i>maxPrime) {
                maxPrime = i;
            }
            sum += i;
        }
        return sum;

    }

    
    public static int skjkasdkd_Problem_1_d0d4d7ff_e600_4f31_af28_a2b6fc29bb65(ArrayList<Integer> lst) {
        int maxNum = lst.get(0);
        for (Integer i : lst) {
            if (i > maxNum) {
                maxNum = i;
            }
        }
        int sum = 0;
        for (Integer i : lst) {
            int mod = i % maxNum;
            if (mod == 0) {
                sum += i;
            }
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_2_90f19683_a3e8_4538_863b_ac5403772d67(ArrayList<Integer> lst) {
        int max = 0;
        for (int num : lst) {
            int sum = 0;
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }

    
    public static int skjkasdkd_Problem_7_26c16560_61ee_4179_a833_52b977bf2054(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for (Integer l : lst) {
            if (l > max) {
                max = l;
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_1_958bb63b_c0ae_4941_bfba_ad1e7ff0cbd2(ArrayList<Integer> lst) {
        int max = 0;
        int sum = 0;
        int temp = 0;
        for(int i : lst) {
            temp = i;
            while(temp > 0) {
                temp = temp / 10;
                sum += temp;
            }
            if(max < sum) {
                max = sum;
            }
            sum = 0;
        }
        return max;

    }

    
    public static int skjkasdkd_Problem_3_8a16a292_0bcb_48d1_b10d_3085dc06de22(ArrayList<Integer> lst) {
        int max = 0;
        int sum = 0;
        for(Integer i : lst) {
            if(i>max) {
                max = i;
            }
        }
        for(Integer i : lst) {
            if(i>max) {
                sum = sum + i;
            }
        }
        return sum;

    }

    
    public static int skjkasdkd_Problem_0_4ffa7611_ec6b_45f4_9cb1_c663f0037f7c(ArrayList<Integer> lst) {

        int max = 0;
        for (Integer l : lst) {
            if (l > max) {
                max = l;
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_4_302418ea_ac20_422a_937a_5c04899697f8(ArrayList<Integer> lst) {
        int max = 0;
        int sum = 0;
        for (int l : lst) {
            sum += l;
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }

    
    public static int skjkasdkd_Problem_8_d6a32c82_61d7_4c04_a817_d38e9c2d34ed(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for (int i : lst) {
            if (i > max) {
                max = i;
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_2_eeba8ebc_f6a8_41e6_8bbc_9937227c691f(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for (int i = 0; i < lst.size(); i++) {
            if (lst.get(i) > max) {
                max = lst.get(i);
            }
        }
        int max_index = 0;
        for (int i = 0; i < lst.size(); i++) {
            if (lst.get(i) == max) {
                max_index = i;
            }
        }
        int sum = 0;
        for (int i = 0; i < lst.size(); i++) {
            if (lst.get(i) > max) {
                sum += lst.get(i);
            }
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_8_6a2b0b86_1624_4c1d_a23b_f108ad80b035(ArrayList<Integer> lst) {
        int sum = 0;
        for(Integer i : lst) {
            sum += i;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_8_a6ade364_001c_4a85_a9a3_158359bc5ce7(ArrayList<Integer> lst) {

        return lst.stream().filter(x -> {
            for (int i = 2; i <= Math.sqrt(x); i++) {
                if (x % i == 0) {
                    return False;
                }
            }
            return True;
        }).mapToInteger(x -> x).sum();
    }

    
    public static int skjkasdkd_Problem_3_f8aafcb6_7545_4309_a8ee_11dc0d3daab1(ArrayList<Integer> lst) {

        int max = 0;
        for (Integer l : lst) {
            if (l > max) {
                max = l;
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_5_f3ace76c_4e9f_47c0_acf6_76df7d30165f(ArrayList<Integer> lst) {

        int sum = 0;
        for (int l : lst) {
            sum += l;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_1_5dde800a_986b_40e3_af7c_673fdae72b93(ArrayList<Integer> lst) {
        int largestPrime = 0;
        int sum = 0;
        for (Integer i : lst) {
            if (i.intValue() <= 9) {
                sum += i;
            }
            if (i.intValue() <= 31 && sum > largestPrime) {
                largestPrime = sum;
                sum = 0;
            }
        }
        return largestPrime;
    }

    
    public static int skjkasdkd_Problem_8_90f19683_a3e8_4538_863b_ac5403772d67(ArrayList<Integer> lst) {
        int max = 0;
        for (int num : lst) {
            int sum = 0;
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }

    
    public static int skjkasdkd_Problem_7_6bcd6e61_18bc_450b_84d9_408a8c2542ec(ArrayList<Integer> lst) {
        return 0;
    }

    
    public static int skjkasdkd_Problem_0_47ca0f5d_09ab_4e83_83ff_8d02de74f23d(ArrayList<Integer> lst) {

        // Write your code here
        return 0;
    }

    
    public static int skjkasdkd_Problem_7_51b92484_33b0_44e7_b469_a2420e69a6fb(ArrayList<Integer> lst) {
        int max = 0;
        int sum = 0;
        for(int i : lst) {
            if(i>max) {
                max = i;
            }
            sum += i;
        }
        return sum;

    }

    
    public static int skjkasdkd_Problem_7_d45a26f7_2fb6_46ab_bf91_cba4f31733fb(ArrayList<Integer> lst) {
        int max = 0;
        for (Integer i : lst) {
            int n = i;
            int sum = 0;
            while (n > 0) {
                sum += n % 10;
                n /= 10;
            }
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }

    
    public static int skjkasdkd_Problem_2_e3517fea_7efc_4f01_80dc_1c15a477575e(ArrayList<Integer> lst) {

        return lst.stream().mapToInteger(Integer::intValue).max().getAsInteger();
    }

    
    public static int skjkasdkd_Problem_5_33c11237_93f7_4a37_98af_fb374cbe8fb0(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for(int i : lst){
            if(i > max){
                max = i;
            }
        }
        int sum = 0;
        while(max > 0){
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_8_7001a003_f133_4d31_a1ec_74dfb3ae6348(ArrayList<Integer> lst) {

        // write your code here
        return lst.stream().filter(x -> {
            if (x == 0) {
                return False;
            }
            for (int i = 2; i < x; i++) {
                if (x % i == 0) {
                    return False;
                }
            }
            return True;
        }).mapToInteger(x -> x).sum();
    }

    
    public static int skjkasdkd_Problem_1_26c16560_61ee_4179_a833_52b977bf2054(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for (Integer l : lst) {
            if (l > max) {
                max = l;
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_2_4e6deb13_d395_4629_be22_cef275cfc3a5(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for (int i : lst) {
            if (i > max) {
                max = i;
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_4_6b404ec0_4778_45f6_982e_7253ac39c636(ArrayList<Integer> lst) {

        int max = 0;
        for (int l : lst) {
            if (l > max) {
                max = l;
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_6_a52d8b66_6a84_48ee_93cd_2166a5efe8d9(ArrayList<Integer> lst) {

        // Write your code here
        return 0;
    }

    
    public static int skjkasdkd_Problem_0_9bb9d8ea_d442_47cc_931c_75d546691a1e(ArrayList<Integer> lst) {

        int max = 0;
        for (Integer i : lst) {
            if (i > max) {
                max = i;
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_0_b1ad198f_456c_4608_94b5_767c1eb59b63(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for(int i = 0; i < lst.size(); i++){
            if(lst.get(i) > max){
                max = lst.get(i);
            }
        }
        int sum = 0;
        while(max > 0){
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_6_2f71c772_b1c9_4191_9803_f94e8490e8c6(ArrayList<Integer> lst) {
        int max = 0;
        int sum = 0;
        for (int l : lst) {
            sum += l;
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }

    
    public static int skjkasdkd_Problem_0_0b16c584_2eed_4241_bfcd_1aee6431d32a(ArrayList<Integer> lst) {
        int max = 0;
        int sum = 0;
        for (int num : lst) {
            sum += num;
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }

    
    public static int skjkasdkd_Problem_5_c31af565_4548_4258_aee1_64612f555429(ArrayList<Integer> lst) {
        int maxPrime = 0;
        int sum = 0;
        for (int i : lst) {
            int prime = i;
            while (prime > 1) {
                int nextPrime = prime + 1;
                while (nextPrime < i) {
                    nextPrime += prime;
                }
                if (nextPrime > maxPrime) {
                    maxPrime = nextPrime;
                }
                prime = nextPrime;
            }
            sum += i;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_3_cb1838bc_5871_495d_a913_456660763451(ArrayList<Integer> lst) {
        int maxPrime = 0;
        int sum = 0;
        int prime = 0;
        for (int i : lst) {
            prime = i;
            while (prime > 1) {
                if (prime % 2 == 0) {
                    prime = prime / 2;
                } else {
                    prime = 3 * prime + 1;
                }
            }
            if (prime > maxPrime) {
                maxPrime = prime;
                sum = i;
            }
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_3_6154a99f_01fb_4714_8b62_0068f8e15016(ArrayList<Integer> lst) {
        int maxPrime = 0;
        int sum = 0;
        for(int i : lst) {
            if(i>maxPrime) {
                maxPrime = i;
            }
            sum += i;
        }
        return sum;

    }

    
    public static int skjkasdkd_Problem_3_6d25e705_2cbc_482b_ab05_a275f8af57d7(ArrayList<Integer> lst) {
        int maxPrime = 0;
        int sum = 0;
        for (int i : lst) {
            sum += i;
            if (sum > maxPrime) {
                maxPrime = sum;
            }
        }
        return maxPrime;
    }

    
    public static int skjkasdkd_Problem_2_5403f3de_e7ec_4ec6_8390_789bb00631bd(ArrayList<Integer> lst) {

        // Write your code here
        int sum = 0;
        for (int l : lst) {
            sum += l;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_2_830d5a3f_4b1f_424c_be4b_240e9e8251ff(ArrayList<Integer> lst) {

        // Write your code here
        int sum = 0;
        for (int i : lst) {
            sum += i;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_0_1e1291fe_be75_4947_b6e2_ccc7d897dcaa(ArrayList<Integer> lst) {

        return lst.stream().mapToInteger(x -> x).max().getAsInteger();
    }

    
    public static int skjkasdkd_Problem_5_76316e86_f39d_4a57_a8ca_20c9229bb525(ArrayList<Integer> lst) {

        int sum = 0;
        for (int i : lst) {
            sum += i;
        }
        int max = lst.stream().max(Comparator.naturalOrder()).get();
        while (max > 0) {
            if (max % 10 == 0) {
                max /= 10;
            } else {
                break;
            }
        }
        int res = 0;
        while (max > 0) {
            if (max % 10 == 0) {
                res += max % 10;
                max /= 10;
            } else {
                break;
            }
        }
        return res;
    }

    
    public static int skjkasdkd_Problem_2_63bf4d75_7a35_48f4_b55b_5c128e4eac34(ArrayList<Integer> lst) {

        int max = 0;
        for (int i : lst) {
            if (i > max) {
                max = i;
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_2_548c21f5_345c_4906_ae3c_6f50a09ed006(ArrayList<Integer> lst) {
        if(lst.isEmpty()) {
            return 0;
        }
        List<Integer> copy = new ArrayList<>(lst);
        copy.removeIf(i -> i == 0);
        Integer max = Collections.max(copy);
        Integer sum = 0;
        for(Integer i : copy) {
            if(i == max) {
                sum += i;
            }
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_6_fee8df46_db54_400d_91bd_ae25e99c1762(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for (int i : lst) {
            if (i > max) {
                max = i;
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_6_e38357fc_9b7e_4b54_9f26_0f656f41d720(ArrayList<Integer> lst) {
        // your code here
        return 0;

    }

    
    public static int skjkasdkd_Problem_8_355ecc73_1c8d_4492_9795_3464f178dc29(ArrayList<Integer> lst) {

        // Write your code here
        return 0;
    }

    
    public static int skjkasdkd_Problem_3_b7664d9d_97da_43e6_8a31_43635d738eaf(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for(Integer l : lst){
            if(l > max){
                max = l;
            }
        }
        int sum = 0;
        while(max > 0){
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_0_01b44709_9b03_41c1_95e0_884ff876a910(ArrayList<Integer> lst) {
        int max = 0;
        int sum = 0;
        for (int l : lst) {
            sum += l;
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }

    
    public static int skjkasdkd_Problem_3_887da22c_197c_43fa_aaf6_8ae037b55182(ArrayList<Integer> lst) {

        int max = 0;
        for (Integer l : lst) {
            if (l > max) {
                max = l;
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_5_94410e93_f9ae_4811_9189_b3a4fb372bec(ArrayList<Integer> lst) {
        int max = 0;
        for (int i : lst) {
            int sum = 0;
            while (i > 0) {
                sum += i % 10;
                i /= 10;
            }
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }

    
    public static int skjkasdkd_Problem_4_cc2fd665_5a90_4eeb_a7c5_8729938117f1(ArrayList<Integer> lst) {

        return lst.stream().filter(x -> x > 1).max(Comparator.naturalOrder()).get();
    }

    
    public static int skjkasdkd_Problem_1_9d07bc97_2e4d_4c04_bec6_d6b51e5f8bf4(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for (Integer i : lst) {
            if (i > max) {
                max = i;
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_0_153fc4b8_cde9_47b4_83d4_df57395e50ac(ArrayList<Integer> lst) {
        int max = 0;
        int sum = 0;
        for (int i : lst) {
            sum += i;
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }

    
    public static int skjkasdkd_Problem_7_cfdd5559_687b_4fa5_93ca_7289caef9f54(ArrayList<Integer> lst) {
        int maxPrime = 0;
        int sum = 0;
        for(int i : lst) {
            if(i%2 == 0) {
                maxPrime = i;
            }
            if(i%2 == 1) {
                int prime = i;
                while(prime != 1) {
                    if(prime % 2 == 0) {
                        prime = prime/2;
                    } else {
                        prime = 3*prime+1;
                    }
                }
                if(prime > maxPrime) {
                    maxPrime = prime;
                }
            }
        }
        for(int i : lst) {
            sum += i;
        }
        return sum;

    }

    
    public static int skjkasdkd_Problem_7_3e2bafd4_8c6b_47ee_b2cc_e87f6ddb78eb(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for (int l : lst) {
            if (l > max) {
                max = l;
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_3_4b00a5b5_fc0f_42da_b54e_1136d5c2c48d(ArrayList<Integer> lst) {
        // Your code here
        return 0;

    }

    
    public static int skjkasdkd_Problem_8_507f498b_547f_432d_a97f_fc6afa337afe(ArrayList<Integer> lst) {

        int max = 0;
        for (int i : lst) {
            if (i > max) {
                max = i;
            }
        }
        int sum = 0;
        for (int i = max; i > 0; i--) {
            if (max % i == 0) {
                sum += i;
            }
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_8_9511341f_3482_46f5_95b6_4060c04fed7b(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for(int i = 0; i < lst.size(); i++){
            if(lst.get(i) > max){
                max = lst.get(i);
            }
        }
        int sum = 0;
        while(max > 0){
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_3_bcfc3b8f_399c_4543_a03a_bb68f12e25a4(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for (int i : lst) {
            if (i > max) {
                max = i;
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_4_332fb464_2599_4375_bf9c_7adb49f814aa(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for (int i : lst) {
            if (i > max) {
                max = i;
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_0_7309b7d3_8ba0_4a20_ad51_2376dcb6960c(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for (int i : lst) {
            if (i > max) {
                max = i;
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_5_7a38a74e_d11a_45fd_8104_e150dc288734(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for (int i = 0; i < lst.size(); i++) {
            if (lst.get(i) > max) {
                max = lst.get(i);
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_6_220f5cb1_1a69_402c_9a6f_73cccf7d5d8f(ArrayList<Integer> lst) {

        int max = 0;
        for (Integer i : lst) {
            if (i > max) {
                max = i;
            }
        }
        if (max == 0) {
            return 0;
        }
        int sum = 0;
        for (Integer i : lst) {
            if (i > 0) {
                sum += i;
            }
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_3_645fca7d_0e71_4516_9a25_e48c1a82e6d9(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for (int i : lst) {
            if (i > max) {
                max = i;
            }
        }
        int sum = 0;
        while (max > 0) {
            int digit = max % 10;
            if (digit == 2 || digit == 3 || digit == 5 || digit == 7) {
                sum += digit;
            }
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_1_db97b7cd_31fc_4fc4_951a_3c1471f0fcfa(ArrayList<Integer> lst) {
        // Write your code here
        int largestPrime = 1;
        int i = 0;
        Iterator<Integer> iterator = lst.iterator();
        while(iterator.hasNext()) {
            int nextNum = iterator.next();
            while(i < nextNum && largestPrime < nextNum) {
                largestPrime++;
                i++;
            }
        }
        int result = largestPrime;
        for(int num : lst) {
            result += Math.pow(10, num);
        }
        return result;
    }

    
    public static int skjkasdkd_Problem_6_91f36e6b_0280_4df7_8a03_7ef19dbb8610(ArrayList<Integer> lst) {
        int max = 0;
        for (int i : lst) {
            int sum = 0;
            while (i > 0) {
                sum += i % 10;
                i /= 10;
            }
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }

    
    public static int skjkasdkd_Problem_3_be33389c_3207_4f88_8639_9a6091e85dee(ArrayList<Integer> lst) {
        // Write your code here
        return 0;

    }

    
    public static int skjkasdkd_Problem_0_812f445b_6e80_4c6b_9b8a_40e916e7cc56(ArrayList<Integer> lst) {

        return lst.stream().mapToInteger(Integer::intValue).max().orElse(0);
    }

    
    public static int skjkasdkd_Problem_3_f2c694cf_40fc_4ade_abd0_1eb7f677e150(ArrayList<Integer> lst) {
        // Your code here.
        return 0;
    }

    
    public static int skjkasdkd_Problem_5_e76fba9d_cda2_48f9_af16_5342025b3750(ArrayList<Integer> lst) {
        int max = 0;
        int sum = 0;
        for (Integer l : lst) {
            if (l % 2 == 0) {
                max = Math.max(max, l);
            }
        }
        for (Integer l : lst) {
            if (l % 2 == 0) {
                sum += l;
            }
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_3_c4a3bf5e_e15e_4a65_b4f7_e2ba10362672(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for (int i : lst) {
            if (i > max) {
                max = i;
            }
        }
        int count = 0;
        while (max > 0) {
            count += max % 10;
            max /= 10;
        }
        return count;
    }

    
    public static int skjkasdkd_Problem_3_c9c34ccc_94eb_41cc_9630_01bd5ff45fa5(ArrayList<Integer> lst) {
        int max = 0;
        int prime = 0;
        boolean isPrime = True;
        int sum = 0;
        for(int l:lst) {
            if (isPrime) {
                if (l%2==0) {
                    isPrime = False;
                }
                else {
                    prime = l;
                }
            }
            else {
                if (l%2!=0) {
                    isPrime = True;
                }
                else {
                    if(prime>l) {
                        prime = l;
                    }
                }
            }
            if (prime>max) {
                max = prime;
                sum = 0;
            }
            else {
                sum += l%10;
            }
        }
        return (sum*max);
    }

    
    public static int skjkasdkd_Problem_1_9c9712ab_5296_4242_a150_eb4578aa38de(ArrayList<Integer> lst) {

        // Write your code here
        return 0;
    }

    
    public static int skjkasdkd_Problem_2_9cb867fd_fa9b_4b8b_af7a_77160e253d95(ArrayList<Integer> lst) {
        int largestPrime = 0;
        int sum = 0;
        for (int value : lst) {
            if (value != 0 && value > largestPrime) {
                largestPrime = value;
            }
            if (value % 2 == 0) {
                for (int j = 3; j < value; j += 2) {
                    if (value % j == 0) {
                        break;
                    }
                }
            }
            if (value % 3 == 0) {
                for (int j = 5; j < value; j += 3) {
                    if (value % j == 0) {
                        break;
                    }
                }
            }
            sum -= value % 10;
            if (sum < 0) {
                sum = 0;
            }
        }
        return largestPrime;
    }

    
    public static int skjkasdkd_Problem_3_64afe6aa_dd5f_4e79_84eb_59461f7de52d(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for (int i : lst) {
            if (i > max) {
                max = i;
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_0_3340cc8c_51bf_429f_92c1_873522c549c5(ArrayList<Integer> lst) {
        // Your code here
        return 0;
    }

    
    public static int skjkasdkd_Problem_4_716a4387_3205_4756_ac5e_14ded0698dfa(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for (int i : lst) {
            if (i > max) {
                max = i;
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_5_a0aeca33_ac7d_42d4_831e_656c74eab9a8(ArrayList<Integer> lst) {

        // Write your code here
        return lst.stream().mapToInteger(x -> x).max().getAsInteger();
    }

    
    public static int skjkasdkd_Problem_7_12a88e55_e60e_493f_9f4e_851aefc6566b(ArrayList<Integer> lst) {
        int max = 0;
        for (Integer l : lst) {
            int digitSum = 0;
            while (l != 0) {
                digitSum += l % 10;
                l /= 10;
            }
            if (digitSum > max) {
                max = digitSum;
            }
        }
        return max;
    }

    
    public static int skjkasdkd_Problem_1_b486890a_0144_4b0a_ab51_1248016fb2c2(ArrayList<Integer> lst) {
        // Your code here
        return 0;
    }

    
    public static int skjkasdkd_Problem_2_c0ce151b_6942_4ae7_bfec_b6b72d297254(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for (int i = 0; i < lst.size(); i++) {
            if (lst.get(i) > max) {
                max = lst.get(i);
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_3_2a0443ef_c0b7_4a10_a93b_883df59e908f(ArrayList<Integer> lst) {
        int largestPrime = 0;
        int sumOfDigits = 0;
        for(int i : lst) {
            if(i>largestPrime) {
                largestPrime = i;
            }
            sumOfDigits += i;
        }
        return sumOfDigits;

    }

    
    public static int skjkasdkd_Problem_6_09be2f93_395f_494a_b7ae_a5523ebd342a(ArrayList<Integer> lst) {
        int max = 0;
        int sum = 0;
        int largestPrime = 0;
        for(int i : lst) {
            if(i>largestPrime) {
                largestPrime = i;
            }
            if(i%largestPrime==0) {
                sum += i;
            }
        }
        max = sum;
        return max;

    }

    
    public static int skjkasdkd_Problem_5_ef1a9fea_a299_4afb_9c8b_3c1f0cdf8b6a(ArrayList<Integer> lst) {
        int maxPrime = 0;
        int sum = 0;
        for (Integer i : lst) {
            sum += i;
            if (sum > maxPrime) {
                maxPrime = sum;
            }
        }
        return maxPrime;
    }

    
    public static int skjkasdkd_Problem_8_54755588_5779_4549_9e47_951c71f800f3(ArrayList<Integer> lst) {

        int max = 0;
        for (Integer i : lst) {
            if (i > max) {
                max = i;
            }
        }
        int sum = 0;
        for (Integer i : lst) {
            if (i > max) {
                continue;
            }
            sum += i;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_4_f3a7f4b8_52b8_48f9_b09b_60a8136d277a(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for (int l : lst) {
            if (l > max) {
                max = l;
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_0_a77607f1_892c_4d1a_84f7_34b09ef3c60f(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for (int i = 0; i < lst.size(); i++) {
            if (lst.get(i) > max) {
                max = lst.get(i);
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_1_5270ee7c_d1c2_46a9_b93c_8982d0a10477(ArrayList<Integer> lst) {
        int max = 0;
        int sum = 0;
        int maxNum = 0;
        int sumNum = 0;
        for(int num : lst) {
            sum += num;
            if(sum > max) {
                max = sum;
                maxNum = num;
            }
            sumNum += num;
        }
        return sumNum;

    }

    
    public static int skjkasdkd_Problem_0_a1091aaa_5e85_443e_8632_7a819df32de3(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for (int i : lst) {
            if (i > max) {
                max = i;
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_6_dfebf82a_b7c2_408e_acb5_42e8df77dc8e(ArrayList<Integer> lst) {

        return 0;
    }

    
    public static int skjkasdkd_Problem_1_d4258f4f_8fd6_4676_b91d_44c692b71c6d(ArrayList<Integer> lst) {
        int max = 0;
        int sum = 0;
        for (int num : lst) {
            sum += num;
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }

    
    public static int skjkasdkd_Problem_1_14486301_92f5_44d1_9790_84e4d0a62a36(ArrayList<Integer> lst) {
        int sum = 0;
        int largest = lst.get(0);
        for(int l : lst) {
            if (l%2 != 0) continue;
            if (l%3 != 0) continue;
            if (l%5 != 0) continue;
            sum += l;
            if (sum > largest) largest = sum;
            sum = 0;
        }
        return largest;
    }

    
    public static int skjkasdkd_Problem_5_76445849_abe2_4c90_a540_1b407c3cdc7d(ArrayList<Integer> lst) {
        int maxPrime = 0;
        int sum = 0;
        for (int l : lst) {
            boolean isPrime = True;
            for (int i = 2; i <= l; i++) {
                if (l % i == 0) {
                    isPrime = False;
                    break;
                }
            }
            if (isPrime) {
                sum += l;
                maxPrime = l;
            }
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_6_642dacad_a83a_4264_a0ab_9fef3b1cba7a(ArrayList<Integer> lst) {
        int result = 0;
        int maxPrime = lst.get(0);
        int sum = 0;

        for(Integer num : lst) {
            for(int i = 2; i <= Math.sqrt(num); i++) {
                if(num % i == 0) {
                    return -1;
                }
            }
            for(int i = 2; i <= Math.sqrt(num); i++) {
                if(maxPrime % i == 0) {
                    maxPrime += i;
                }
            }
            if(maxPrime == num) {
                sum += num;
            }
            maxPrime = num;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_5_8f9ea5b3_3ea0_4d1e_b78e_154a63068403(ArrayList<Integer> lst) {
        int max = 0;
        int sum = 0;
        for(int i : lst) {
            if(i>0) {
                if(i%2 == 0) {
                    if(i>max) {
                        max = i;
                    }
                    if(i<max) {
                        sum += i;
                    }
                }
                else {
                    if(i>max) {
                        max = i;
                    }
                    if(i<max) {
                        sum += i;
                    }
                }
            }
        }
        return sum;

    }

    
    public static int skjkasdkd_Problem_7_8412ef25_7f84_4ead_b32e_bf06e9af4ff3(ArrayList<Integer> lst) {

        int max = 0;
        for (int i : lst) {
            if (i > max) {
                max = i;
            }
        }
        int sum = 0;
        while (max > 0) {
            int temp = max % 10;
            sum += temp;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_6_d63b92ed_2639_4a26_bb0b_535975098e41(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for (Integer i : lst) {
            if (i > max) {
                max = i;
            }
        }
        int sum = 0;
        while (max > 0) {
            int rem = max % 10;
            sum += rem;
            max = max / 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_4_000252c9_40aa_4f8a_906b_6484818f8a6e(ArrayList<Integer> lst) {

        return 0;
    }

    
    public static int skjkasdkd_Problem_4_47ca0f5d_09ab_4e83_83ff_8d02de74f23d(ArrayList<Integer> lst) {

        // Write your code here
        return 0;
    }

    
    public static int skjkasdkd_Problem_5_5276f6c8_4d7e_4b7a_9e84_ec67c5540bfd(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for (int l : lst) {
            if (l > max) {
                max = l;
            }
        }
        int count = 0;
        while (max > 0) {
            count += max % 10;
            max /= 10;
        }
        return count;
    }

    
    public static int skjkasdkd_Problem_4_1a0985a0_61be_4f70_b339_cab63768eb6b(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for (int i = 0; i < lst.size(); i++) {
            if (lst.get(i) > max) {
                max = lst.get(i);
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_0_7a30ace3_8c8b_4143_b6bb_27d01181a216(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for (int i : lst) {
            if (i > max) {
                max = i;
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_2_f064d27a_d4ff_489b_b946_7738506161a3(ArrayList<Integer> lst) {

        int max = 0;
        for (int l : lst) {
            if (l > max) {
                max = l;
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_3_9c9712ab_5296_4242_a150_eb4578aa38de(ArrayList<Integer> lst) {

        // Write your code here
        return 0;
    }

    
    public static int skjkasdkd_Problem_2_9ec4bc6e_8cea_4e16_8a0b_671ed28110c5(ArrayList<Integer> lst) {

        return 0;
    }

    
    public static int skjkasdkd_Problem_3_332fb464_2599_4375_bf9c_7adb49f814aa(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for (int i : lst) {
            if (i > max) {
                max = i;
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_1_d3d7d328_dda1_4b62_815c_8927f67157e9(ArrayList<Integer> lst) {

        // Write your code here
        return lst.stream().filter(x -> {
            boolean isPrime = True;
            for (int i = 2; i < x; i++) {
                if (x % i == 0) {
                    isPrime = False;
                    break;
                }
            }
            return isPrime;
        }).mapToInteger(x -> x).sum();
    }

    
    public static int skjkasdkd_Problem_1_c6365a0a_9e21_48b2_a4a9_c645a2f92d2a(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for (int l : lst) {
            if (l > max) {
                max = l;
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_6_0469cf79_8db6_4c32_95fe_43699f38a00c(ArrayList<Integer> lst) {

        int max = 0;
        for (int i : lst) {
            if (i > max) {
                max = i;
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_5_55fede67_e826_40d4_bde8_fa982fcc536d(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for (Integer i : lst) {
            if (i > max) {
                max = i;
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_6_e8139613_b4d3_488f_96b7_cf0af010b943(ArrayList<Integer> lst) {
        // Write your code here.
        return 0;
    }

    
    public static int skjkasdkd_Problem_0_7a38a74e_d11a_45fd_8104_e150dc288734(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for (int i = 0; i < lst.size(); i++) {
            if (lst.get(i) > max) {
                max = lst.get(i);
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_4_ff1e1c6f_260e_4c18_9750_3fd5613d6371(ArrayList<Integer> lst) {
        // Your code here
        return 0;

    }

    
    public static int skjkasdkd_Problem_6_6c368ee2_4234_4ca7_b3e1_5b1cadc37b2f(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for (int i = 0; i < lst.size(); i++) {
            if (lst.get(i) > max) {
                max = lst.get(i);
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_5_c808ed7f_998a_458e_b0ab_4eab5edfbf1f(ArrayList<Integer> lst) {
        // Your code here
        return 0;

    }

    
    public static int skjkasdkd_Problem_0_c27adafd_b462_451c_854f_1e1f04e77351(ArrayList<Integer> lst) {

        int max = 0;
        for (int l : lst) {
            if (l > max) {
                max = l;
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_3_3fc9e968_f9b7_4cb3_b31c_8a74070c1394(ArrayList<Integer> lst) {
        int maxPrime = 0;
        int sum = 0;
        int prime = 0;
        for (int i : lst) {
            prime = i;
            while (prime > 1) {
                if (prime % 2 == 0) {
                    prime = prime / 2;
                } else {
                    prime = prime * 3;
                }
            }
            if (prime > maxPrime) {
                maxPrime = prime;
                sum = i;
            }
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_5_ed531a6f_9225_4d59_8d0d_41f5ff864f8e(ArrayList<Integer> lst) {
        int maxPrime = 0;
        int sum = 0;
        for (int i : lst) {
            int prime = i;
            while (prime > 1) {
                int nextPrime = prime + 1;
                while (nextPrime < i) {
                    nextPrime += prime;
                }
                if (nextPrime > maxPrime) {
                    maxPrime = nextPrime;
                }
                prime = nextPrime;
            }
            sum += i;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_6_91099b62_aa29_4c21_875e_1dc6abf0d2e4(ArrayList<Integer> lst) {

        int max = 0;
        for(int i : lst) {
            if(i > max) {
                max = i;
            }
        }
        int sum = 0;
        for(int i : lst) {
            if(i > 0 && i <= max) {
                sum += i;
            }
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_6_f064d27a_d4ff_489b_b946_7738506161a3(ArrayList<Integer> lst) {

        int max = 0;
        for (int l : lst) {
            if (l > max) {
                max = l;
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_5_55edf37a_85b6_4053_9f60_03ae6c38b6d0(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for(int l : lst) {
            if(l > max) {
                max = l;
            }
        }
        int sum = 0;
        while(max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_5_4cc985f9_ad62_4603_ae76_105280874267(ArrayList<Integer> lst) {
        int max = 0;
        int sum = 0;
        int largestPrime = 0;
        for(int i : lst) {
            if(i>largestPrime) {
                largestPrime = i;
            }
            if(i>max) {
                max = i;
            }
            if(i>sum) {
                sum = i;
            }
        }
        return sum;

    }

    
    public static int skjkasdkd_Problem_8_59303e3a_9763_4d9f_aa54_2f912c72542c(ArrayList<Integer> lst) {
        int max = 0;
        int sum = 0;
        for (Integer i : lst) {
            if (i.intValue() > max) {
                max = i.intValue();
            }
            sum += i.intValue();
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_6_ba69497f_f4ed_4dd8_960c_6c1031c6c49a(ArrayList<Integer> lst) {

        int max = 0;
        for(int i : lst) {
            if(i > max) {
                max = i;
            }
        }
        int sum = 0;
        for(int i : lst) {
            if(i > max) {
                sum += i;
            }
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_3_e20c9daa_bb61_413a_bee9_f2f27be040e8(ArrayList<Integer> lst) {
        // Write your solution here
        int sum = 0;
        final int ONE = 1;
        boolean isPrime = True;
        for (int l: lst) {
            if (l == 0)
                continue;
            if (isPrime) {
                if (l % 2 == 0)
                    l = l / 2;
                else
                    l = l + ONE;
                if (l < 2)
                    isPrime = False;
            }
            if (l > Math.sqrt(l))
                isPrime = False;
            sum += l;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_0_c86dab82_0514_43eb_817b_01c2af50d395(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for (int l : lst) {
            if (l > max) {
                max = l;
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_7_f350ef8d_e0fb_46bc_87ce_e760cb2c4541(ArrayList<Integer> lst) {
        int max = 0;
        int sum = 0;
        for (int i : lst) {
            sum += i;
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }

    
    public static int skjkasdkd_Problem_6_e926e772_92d3_4100_9c97_710f39aaabcc(ArrayList<Integer> lst) {
        // Write your code here
        int maxPrime=0;
        for(Integer a:lst)
        {
            if(a%2==0)
            {
                continue;
            }
            for(int i=3;i*i<=a;i+=2)
            {
                if(a%i==0)
                {
                    continue;
                }
                if(a%i==1 && maxPrime<a) 
                {
                    maxPrime=a;
                }
            }
        }
        return maxPrime;
    }

    
    public static int skjkasdkd_Problem_1_6bcd6e61_18bc_450b_84d9_408a8c2542ec(ArrayList<Integer> lst) {
        return 0;
    }

    
    public static int skjkasdkd_Problem_4_7caf3e07_1bfb_41bd_ad14_9f3bfb2f7348(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for (int i : lst) {
            if (i > max) {
                max = i;
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_1_df38616e_75ae_4a77_80c2_494a1224e410(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for(int i = 0; i < lst.size(); i++) {
            if(lst.get(i) > max) {
                max = lst.get(i);
            }
        }
        int sum = 0;
        while(max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_3_276d196b_388a_40a8_9a30_62c12bc0f25b(ArrayList<Integer> lst) {
        // Your code here
        List<Integer> digits = lst.stream().map(x ->  (x % 10d)).collect(Collectors.toList());
        int sum = 0;
        for (int i = 0; i < digits.size(); i++) {
            if (digits.get(i) == 0) {
                continue;
            }
            if (digits.get(i) > 0) {
                sum += digits.get(i);
                for (int j = i; j < digits.size(); j++) {
                    if (digits.get(j) > 0) {
                        sum += digits.get(j);
                    }
                }
            }
        }
        int sum2 = sum % 10;
        if (sum2 > 0) {
            return sum2;
        } else {
            return 0;
        }
    }

    
    public static int skjkasdkd_Problem_1_0469cf79_8db6_4c32_95fe_43699f38a00c(ArrayList<Integer> lst) {

        int max = 0;
        for (int i : lst) {
            if (i > max) {
                max = i;
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_5_20bcc6d4_c5e9_4642_a435_518fcee6caff(ArrayList<Integer> lst) {
        int max = 0;
        for (int i : lst) {
            if (i > max) {
                max = i;
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_1_548c21f5_345c_4906_ae3c_6f50a09ed006(ArrayList<Integer> lst) {
        if(lst.isEmpty()) {
            return 0;
        }
        List<Integer> copy = new ArrayList<>(lst);
        copy.removeIf(i -> i == 0);
        Integer max = Collections.max(copy);
        Integer sum = 0;
        for(Integer i : copy) {
            if(i == max) {
                sum += i;
            }
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_2_dce44720_30c8_4022_a11d_1dcc670efd93(ArrayList<Integer> lst) {
        int max = 0;
        int sum = 0;
        for(Integer i : lst) {
            if(i>max) {
                max = i;
            }
        }
        for(Integer i : lst) {
            if(i>max) {
                sum += i;
            }
        }
        return sum;

    }

    
    public static int skjkasdkd_Problem_3_0c1d4b1c_1234_4ba1_ac1a_46ddb6f2f166(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for (int l : lst) {
            if (l > max) {
                max = l;
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_6_4ea784e2_4088_47cc_b1e5_bcd73ae4015e(ArrayList<Integer> lst) {
        int maxPrime = 0;
        int sum = 0;
        for(int num : lst) {
            sum += num;
            if(num > maxPrime) {
                maxPrime = num;
            }
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_3_daeadc41_0cab_47a4_9fa8_370f0110c69c(ArrayList<Integer> lst) {
        int maxSum = lst.get(0);
        int sum = 0;
        for (int i : lst) {
            sum += i;
            if (sum > maxSum) {
                maxSum = sum;
            }
        }
        return maxSum;
    }

    
    public static int skjkasdkd_Problem_4_4334e247_b7d0_4c1e_a052_11a4ce969ea3(ArrayList<Integer> lst) {
        int maxPrime = 0;
        int sum = 0;
        for(int i : lst) {
            if(i>maxPrime) {
                maxPrime = i;
            }
            sum += i;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_3_a274a37f_f1d4_4050_bbd6_b3883994e25e(ArrayList<Integer> lst) {

        int max = 0;
        for (int i : lst) {
            if (i > max) {
                max = i;
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_3_6339f60c_6e2f_4864_b5ec_50d2ca4f947b(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for(int l : lst) {
            if(l > max) {
                max = l;
            }
        }
        int sum = 0;
        while(max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_2_5b7e5590_5fbe_4670_8619_83442991a6ab(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for (int i : lst) {
            if (i > max) {
                max = i;
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_4_75a88d79_41ce_4541_8c57_3028ec707c5d(ArrayList<Integer> lst) {
        // Your code here
        return 0;

    }

    
    public static int skjkasdkd_Problem_7_ddf21f27_e3f8_447f_9f6a_e888f929386d(ArrayList<Integer> lst) {
        if(lst.isEmpty()) return 0;
        int max = -1;
        for(int l : lst) {
            if(max<l) max = l;
        }
        int sum = 0;
        for(int l : lst) {
            if((l%max)==0) {
                sum += l;
            }
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_1_5d0652c5_d04a_4ea5_a3b9_69eafbd43abf(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for (Integer i : lst) {
            if (i > max) {
                max = i;
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_3_449fc8e6_1462_4135_999b_3f3c018c0f8e(ArrayList<Integer> lst) {
        int largestPrime = 0;
        int sum = 0;
        for (int el : lst) {
            sum += el % 2 == 0 ? el / 2 : el;
            largestPrime = Math.max(largestPrime, el);
        }
        if (sum > largestPrime)
            sum += largestPrime - sum;
        return sum;
    }

    
    public static int skjkasdkd_Problem_1_aae0195b_4599_4cc0_b1af_a3533a133592(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for (int i : lst) {
            if (i > max) {
                max = i;
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_1_2747f1c7_54f7_4866_80ab_0727632ed886(ArrayList<Integer> lst) {
        // Your code here.
        return 0;
    }

    
    public static int skjkasdkd_Problem_2_d45a26f7_2fb6_46ab_bf91_cba4f31733fb(ArrayList<Integer> lst) {
        int max = 0;
        for (Integer i : lst) {
            int n = i;
            int sum = 0;
            while (n > 0) {
                sum += n % 10;
                n /= 10;
            }
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }

    
    public static int skjkasdkd_Problem_7_276d196b_388a_40a8_9a30_62c12bc0f25b(ArrayList<Integer> lst) {
        // Your code here
        List<Integer> digits = lst.stream().map(x ->  (x % 10d)).collect(Collectors.toList());
        int sum = 0;
        for (int i = 0; i < digits.size(); i++) {
            if (digits.get(i) == 0) {
                continue;
            }
            if (digits.get(i) > 0) {
                sum += digits.get(i);
                for (int j = i; j < digits.size(); j++) {
                    if (digits.get(j) > 0) {
                        sum += digits.get(j);
                    }
                }
            }
        }
        int sum2 = sum % 10;
        if (sum2 > 0) {
            return sum2;
        } else {
            return 0;
        }
    }

    
    public static int skjkasdkd_Problem_0_e614421e_4a82_4b11_aa13_905a30e3dcb7(ArrayList<Integer> lst) {

        return 0;
    }

    
    public static int skjkasdkd_Problem_3_963fb1b9_023b_44d6_abe7_2b4e780b7783(ArrayList<Integer> lst) {
        ArrayList<Integer> primes = new ArrayList<>();
        int primeSum = 0;
        int tempSum = 0;
        int largestPrime = 0;
        int largestDigit = 0;
        int largestDivisor = 0;
        int largestDivs = 0;
        int sumOfDigits = 0;
        boolean isPrime = True;
        
        for(int i = 0; i < lst.size(); i++) {
            isPrime = True;
            tempSum = 0;
            for(int j = 0; j < primes.size(); j++) {
                if(lst.get(i) == primes.get(j)) {
                    isPrime = False;
                    break;
                }
            }
            if(isPrime) {
                primes.add(lst.get(i));
            }
        }
        
        for(int i = 0; i < primes.size(); i++) {
            tempSum += primes.get(i);
        }
        
        for(int i = 0; i < primes.size(); i++) {
            sumOfDigits += primes.get(i);
            
            if(sumOfDigits > tempSum) {
                largestPrime = primes.get(i);
                largestDivisor = tempSum;
                largestDivs = sumOfDigits;
            }
        }
        
        for(int i = 0; i < lst.size(); i++) {
            isPrime = True;
            tempSum = 0;
            for(int j = 0; j < primes.size(); j++) {
                if(lst.get(i) == primes.get(j)) {
                    isPrime = False;
                    break;
                }
            }
            if(isPrime) {
                primeSum = primeSum + lst.get(i);
            }
        }
        
        return largestPrime;
    }

    
    public static int skjkasdkd_Problem_1_041b05fe_5669_4203_8fb8_9c1452394220(ArrayList<Integer> lst) {

        // Write your code here
        return 0;
    }

    
    public static int skjkasdkd_Problem_4_276d196b_388a_40a8_9a30_62c12bc0f25b(ArrayList<Integer> lst) {
        // Your code here
        List<Integer> digits = lst.stream().map(x ->  (x % 10d)).collect(Collectors.toList());
        int sum = 0;
        for (int i = 0; i < digits.size(); i++) {
            if (digits.get(i) == 0) {
                continue;
            }
            if (digits.get(i) > 0) {
                sum += digits.get(i);
                for (int j = i; j < digits.size(); j++) {
                    if (digits.get(j) > 0) {
                        sum += digits.get(j);
                    }
                }
            }
        }
        int sum2 = sum % 10;
        if (sum2 > 0) {
            return sum2;
        } else {
            return 0;
        }
    }

    
    public static int skjkasdkd_Problem_0_1f91bde0_62da_409b_8ac6_71f4d83c6507(ArrayList<Integer> lst) {

        int max = 0;
        for (int i : lst) {
            if (i > max) {
                max = i;
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_8_3cfd2bbf_ea88_476d_9b96_7f0d9067c2cb(ArrayList<Integer> lst) {
        int max = 0;
        for (int i : lst) {
            if (i > max) {
                max = i;
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_0_9ec4bc6e_8cea_4e16_8a0b_671ed28110c5(ArrayList<Integer> lst) {

        return 0;
    }

    
    public static int skjkasdkd_Problem_6_5ebb660d_5585_4810_9e33_8bfae8a9df71(ArrayList<Integer> lst) {

        int sum = 0;
        for (int l : lst) {
            sum += l;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_4_1468b839_b6f7_43b4_ab88_a96eb16880f6(ArrayList<Integer> lst) {
        // Your code here
        return 0;

    }

    
    public static int skjkasdkd_Problem_5_87afc909_fc96_4055_a8b2_5720f543d834(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for (int i : lst) {
            if (i > max) {
                max = i;
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_2_2ac57de2_f93e_4c3b_ab33_cf6f974ad3e8(ArrayList<Integer> lst) {
        int max = 0;
        for (Integer i : lst) {
            if (i > max) {
                max = i;
            }
        }
        int sum = 0;
        for (Integer i : lst) {
            sum += i;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_0_f3d88bdb_f73d_49fb_877c_924b533a8a6e(ArrayList<Integer> lst) {
        int max = 0;
        int sum = 0;
        for (Integer i : lst) {
            sum += i;
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }

    
    public static int skjkasdkd_Problem_5_d3964f57_6cb0_4120_89f5_0b977cd24bd4(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for(int i : lst) {
            if(i > max) {
                max = i;
            }
        }
        int sum = 0;
        while(max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_2_5270ee7c_d1c2_46a9_b93c_8982d0a10477(ArrayList<Integer> lst) {
        int max = 0;
        int sum = 0;
        int maxNum = 0;
        int sumNum = 0;
        for(int num : lst) {
            sum += num;
            if(sum > max) {
                max = sum;
                maxNum = num;
            }
            sumNum += num;
        }
        return sumNum;

    }

    
    public static int skjkasdkd_Problem_8_17d4ba4b_8faa_4ada_9b28_0063fed03bbb(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for (Integer l : lst) {
            if (l > max) {
                max = l;
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_6_da91680d_cd9c_48da_b74a_900303b46143(ArrayList<Integer> lst) {

        // Write your code here
        return 0;
    }

    
    public static int skjkasdkd_Problem_8_0be74426_96c1_4b6e_af3d_6732dd32a4d1(ArrayList<Integer> lst) {

        int max = 0;
        for (Integer i : lst) {
            if (i > max) {
                max = i;
            }
        }
        int sum = 0;
        for (Integer i : lst) {
            if (i > max) {
                sum += i;
            }
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_0_c262b3a8_6cb2_402c_88ad_7b93655bd7b9(ArrayList<Integer> lst) {
        int max = 0;
        for (int i : lst) {
            max = Math.max(max, i);
        }
        int sum = 0;
        for (int i : lst) {
            sum += i;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_2_e926e772_92d3_4100_9c97_710f39aaabcc(ArrayList<Integer> lst) {
        // Write your code here
        int maxPrime=0;
        for(Integer a:lst)
        {
            if(a%2==0)
            {
                continue;
            }
            for(int i=3;i*i<=a;i+=2)
            {
                if(a%i==0)
                {
                    continue;
                }
                if(a%i==1 && maxPrime<a) 
                {
                    maxPrime=a;
                }
            }
        }
        return maxPrime;
    }

    
    public static int skjkasdkd_Problem_3_6db6f7da_c4b2_43db_aacf_5891cf560443(ArrayList<Integer> lst) {

        int max = 0;
        for (int i : lst) {
            if (i > max) {
                max = i;
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_5_59303e3a_9763_4d9f_aa54_2f912c72542c(ArrayList<Integer> lst) {
        int max = 0;
        int sum = 0;
        for (Integer i : lst) {
            if (i.intValue() > max) {
                max = i.intValue();
            }
            sum += i.intValue();
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_0_bac790e8_fc30_4754_9aaf_fd9af54bdc8e(ArrayList<Integer> lst) {
        int max = 0;
        int sum = 0;
        for (int i : lst) {
            sum += i;
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }

    
    public static int skjkasdkd_Problem_0_b476879d_5a85_4fb6_be11_2a05f4793ef3(ArrayList<Integer> lst) {
        int max = 0;
        int sum = 0;
        for(int num : lst) {
            sum += num;
            if(sum > max) {
                max = sum;
            }
        }
        return max;
    }

    
    public static int skjkasdkd_Problem_2_48d01bc0_3aee_4820_8ed8_21467c9c6432(ArrayList<Integer> lst) {

        return lst.stream().mapToInteger(Integer::intValue).filter(i -> i > 1).max().orElse(0);
    }

    
    public static int skjkasdkd_Problem_8_7b84bad1_b31d_470b_81ac_cdb0bf5aa470(ArrayList<Integer> lst) {
        int max = 0;
        int sum = 0;
        for (int i : lst) {
            sum += i;
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }

    
    public static int skjkasdkd_Problem_7_35de2645_eff7_464a_bf42_c42c4535c9bb(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for (int l : lst) {
            if (l > max) {
                max = l;
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_3_574c5178_fd0d_4151_a6eb_b4beeb2c5241(ArrayList<Integer> lst) {
        int max = 0;
        int sum = 0;
        for (Integer i : lst) {
            sum += i;
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }

    
    public static int skjkasdkd_Problem_8_8b730023_f19c_4f81_bcd2_6edec0c922f7(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for (Integer l : lst) {
            if (l > max) {
                max = l;
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_8_c838f1e7_96a7_4f07_a138_f3b8c7987151(ArrayList<Integer> lst) {
        int maxPrime = 0;
        int sum = 0;
        for(int i : lst) {
            sum += i;
            if(sum > maxPrime) {
                maxPrime = sum;
            }
        }
        return maxPrime;
    }

    
    public static int skjkasdkd_Problem_4_6bcd6e61_18bc_450b_84d9_408a8c2542ec(ArrayList<Integer> lst) {
        return 0;
    }

    
    public static int skjkasdkd_Problem_4_8f6e2aea_9da2_45f2_b2fa_253e02ae5f07(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for (int i = 0; i < lst.size(); i++) {
            if (lst.get(i) > max) {
                max = lst.get(i);
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_2_b8476982_3196_4504_89d3_0f870b50c479(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for(int i : lst){
            if(i > max){
                max = i;
            }
        }
        int sum = 0;
        while(max > 0){
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_0_1d9574c4_69aa_40bb_a422_65fb48ccd65f(ArrayList<Integer> lst) {
        int sum = 0;
        for (int n: lst) {
            // find the next prime number
            int i = 2;
            int k = 0;
            while (i < n / i) {
                k = i * i;
                if (n % k == 0) {
                    break;
                }
                i++;
            }
            // add digits
            if (k > 0) {
                sum +=  Math.ceil(n * Math.log10(k));
            }
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_6_31b020ef_90d4_44d9_a6bb_092744060807(ArrayList<Integer> lst) {

        // Write your code here
        int sum = 0;
        for (int l : lst) {
            sum += l;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_2_6333e481_160d_41f8_bf3f_2a46616711a8(ArrayList<Integer> lst) {
        int maxPrime = 0;
        int sum = 0;
        int prime = 0;
        int primeSum = 0;
        for (int i : lst) {
            prime = i;
            primeSum = 0;
            while (prime > 1) {
                if (prime % 2 == 0) {
                    prime = prime / 2;
                    primeSum += 2;
                } else {
                    prime = prime * 3;
                    primeSum += 3;
                }
            }
            if (primeSum > maxPrime) {
                maxPrime = primeSum;
                sum = primeSum;
            }
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_3_59303e3a_9763_4d9f_aa54_2f912c72542c(ArrayList<Integer> lst) {
        int max = 0;
        int sum = 0;
        for (Integer i : lst) {
            if (i.intValue() > max) {
                max = i.intValue();
            }
            sum += i.intValue();
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_3_f6ae395a_52c9_41c1_8b0e_a25778618824(ArrayList<Integer> lst) {
        int max = 0;
        int sum = 0;
        for(int i : lst) {
            if(i>max) {
                max = i;
            }
        }
        for(int i : lst) {
            if(i>max) {
                sum = sum + i;
            }
        }
        return sum;

    }

    
    public static int skjkasdkd_Problem_7_5224f015_527a_4ee7_9bf6_740a9d4820ad(ArrayList<Integer> lst) {

        // Write your code here
        int sum = 0;
        for (int i : lst) {
            sum += i;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_0_bcfc3b8f_399c_4543_a03a_bb68f12e25a4(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for (int i : lst) {
            if (i > max) {
                max = i;
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_7_7d0a353a_2806_4c32_b044_e3f349c29864(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for(int i : lst){
            if(i > max){
                max = i;
            }
        }
        int sum = 0;
        while(max > 0){
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_8_716a4387_3205_4756_ac5e_14ded0698dfa(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for (int i : lst) {
            if (i > max) {
                max = i;
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_0_43602f1a_7e58_47ea_9450_ff31d26e29df(ArrayList<Integer> lst) {

        return 0;
    }

    
    public static int skjkasdkd_Problem_7_146af880_8ae2_471c_ad39_ddf9273b1875(ArrayList<Integer> lst) {
        int max = 0;
        for (int num : lst) {
            boolean isPrime = True;
            for (int i = 1; i <= (Math.sqrt(num) + 1); i++) {
                if (num % i == 0) {
                    isPrime = False;
                    break;
                }
            }
            if (isPrime) {
                max += num;
            }
        }
        return max;
    }

    
    public static int skjkasdkd_Problem_4_94e52668_8ee8_4784_a1d1_3face6d4ccc5(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for (int i : lst) {
            if (i > max) {
                max = i;
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_7_18b3799d_e39d_46d5_91cd_8308069c85a5(ArrayList<Integer> lst) {
        int largestPrime = 0;
        int sum = 0;
        int sumOfDigits = 0;
        for(int i : lst) {
            if(i>largestPrime) {
                largestPrime = i;
            }
            sum += i;
            sumOfDigits += i;
        }
        return sumOfDigits;

    }

    
    public static int skjkasdkd_Problem_4_eb71f64d_f75d_4410_8f26_28072be2f39c(ArrayList<Integer> lst) {
        int largestPrime = 0;
        int sum = 0;
        for(Integer i : lst) {
            if(i>largestPrime) {
                largestPrime = i;
            }
        }
        for(Integer i : lst) {
            if(i>largestPrime) {
                sum = sum + i;
            }
        }
        return sum;

    }

    
    public static int skjkasdkd_Problem_3_0837b61f_bd49_4e2e_b069_3524487243ce(ArrayList<Integer> lst) {
        // >>> your code goes here <<<
        return 0;
    }

    
    public static int skjkasdkd_Problem_0_d0d4d7ff_e600_4f31_af28_a2b6fc29bb65(ArrayList<Integer> lst) {
        int maxNum = lst.get(0);
        for (Integer i : lst) {
            if (i > maxNum) {
                maxNum = i;
            }
        }
        int sum = 0;
        for (Integer i : lst) {
            int mod = i % maxNum;
            if (mod == 0) {
                sum += i;
            }
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_6_403d0bc9_9545_4e9f_b226_7a89f8b81621(ArrayList<Integer> lst) {
        int biggerPrime = 0;
        int sum = 0;
        for (int i : lst) {
            int checkIfPrime = i + 1;
            boolean checkIfPrimeIsPrime = True;
            while (checkIfPrimeIsPrime) {
                boolean checkIfPrimeIsNotPrime = True;
                for (int j : lst) {
                    if (j != checkIfPrime) {
                        if (i % j == 0) {
                            checkIfPrimeIsNotPrime = False;
                            break;
                        }
                    }
                }
                if (checkIfPrimeIsNotPrime) {
                    checkIfPrimeIsPrime = False;
                    break;
                }
            }
            if (checkIfPrime % 2 == 1) {
                checkIfPrimeIsPrime = False;
            }
            if (checkIfPrime == 2) {
                checkIfPrimeIsPrime = False;
            }
            if (checkIfPrime % 2 != 0) {
                checkIfPrimeIsPrime = False;
            }
            if (checkIfPrime != 2) {
                biggerPrime = checkIfPrime;
            }
        }
        for (int i : lst) {
            sum += i;
        }
        return biggerPrime;
    }

    
    public static int skjkasdkd_Problem_5_3f4c8d92_6c2f_486a_82bb_9212e0be3e8b(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for (Integer l : lst) {
            if (l > max) {
                max = l;
            }
        }
        int maxPrime = 0;
        for (int i = 2; i < max; i++) {
            if (max % i == 0) {
                maxPrime = i;
            }
        }
        return maxPrime;
    }

    
    public static int skjkasdkd_Problem_5_20a9b698_e1b3_4dfd_812f_b82fd88a7b7d(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for (int i : lst) {
            if (i > max) {
                max = i;
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_5_574c5178_fd0d_4151_a6eb_b4beeb2c5241(ArrayList<Integer> lst) {
        int max = 0;
        int sum = 0;
        for (Integer i : lst) {
            sum += i;
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }

    
    public static int skjkasdkd_Problem_5_c262b3a8_6cb2_402c_88ad_7b93655bd7b9(ArrayList<Integer> lst) {
        int max = 0;
        for (int i : lst) {
            max = Math.max(max, i);
        }
        int sum = 0;
        for (int i : lst) {
            sum += i;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_2_d6754568_4f18_4d49_bdad_8a4562c4e0c9(ArrayList<Integer> lst) {
        int maxPrime = 0;
        int sum = 0;
        for(int i : lst) {
            if(i>maxPrime) {
                maxPrime = i;
            }
            sum += i;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_0_4f447e5a_ca78_4a9f_b558_5f0327bd96de(ArrayList<Integer> lst) {
        int max = 0;
        int sum = 0;
        for (int i : lst) {
            sum += i;
            if (sum > max) {
                max = sum;
            }
        }
        return max;

    }

    
    public static int skjkasdkd_Problem_4_e6613c1d_ea43_4f85_a212_bec955f9d3f3(ArrayList<Integer> lst) {

        return lst.stream().mapToInteger(Integer::intValue).max().orElse(0);
    }

    
    public static int skjkasdkd_Problem_3_1f524e76_8245_4712_99e8_3cb4baaae0fd(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for (int l : lst) {
            if (l > max) {
                max = l;
            }
        }
        int count = 0;
        while (max > 0) {
            count += max % 10;
            max /= 10;
        }
        return count;
    }

    
    public static int skjkasdkd_Problem_5_1a7347b9_7085_4ab3_8bfa_055494da32b2(ArrayList<Integer> lst) {
        int largestPrime = 0;
        int sum = 0;
        for(int i : lst) {
            if(i%2 == 0) {
                largestPrime = i;
            }
            if(i%2 != 0) {
                largestPrime = i;
            }
            if(i%2 == 0) {
                sum = sum + i;
            }
            if(i%2 != 0) {
                sum = sum + i;
            }
        }
        return sum;

    }

    
    public static int skjkasdkd_Problem_7_70ac5832_db77_42bd_93e5_a02c5fd37cdb(ArrayList<Integer> lst) {

        int sum = 0;
        for (int l : lst) {
            if (l > 0) {
                sum += l;
            }
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_5_a52d8b66_6a84_48ee_93cd_2166a5efe8d9(ArrayList<Integer> lst) {

        // Write your code here
        return 0;
    }

    
    public static int skjkasdkd_Problem_0_6db6f7da_c4b2_43db_aacf_5891cf560443(ArrayList<Integer> lst) {

        int max = 0;
        for (int i : lst) {
            if (i > max) {
                max = i;
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_1_1a0985a0_61be_4f70_b339_cab63768eb6b(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for (int i = 0; i < lst.size(); i++) {
            if (lst.get(i) > max) {
                max = lst.get(i);
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_7_c205c886_ffd3_47c5_8cfc_d3089c4518bb(ArrayList<Integer> lst) {
        int max = 0;
        int sum = 0;
        for (Integer l : lst) {
            sum += l;
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }

    
    public static int skjkasdkd_Problem_7_984026c9_dd70_4f31_9802_cc32c21d556e(ArrayList<Integer> lst) {
        int max = 0;
        int sum = 0;
        for(int i : lst) {
            if(i>0) {
                sum += i;
                if(i>max) {
                    max = i;
                }
            }
        }
        return sum;

    }

    
    public static int skjkasdkd_Problem_6_05c92a02_898c_4ab6_b939_7315d1756862(ArrayList<Integer> lst) {
        int max = 0;
        int sum = 0;
        for(int i : lst) {
            if(i>max) {
                max = i;
            }
            sum += i;
        }
        return sum;

    }

    
    public static int skjkasdkd_Problem_2_f0ddd8a1_f552_47fc_92e4_1ec6ba844ba9(ArrayList<Integer> lst) {
        int max = 0;
        int sum = 0;
        for(Integer i : lst) {
            if(i>max) {
                max = i;
            }
            sum += i;
        }
        return sum;

    }

    
    public static int skjkasdkd_Problem_7_6af98da5_dc53_4a18_93a2_1ec1263c7b23(ArrayList<Integer> lst) {

        int sum = 0;
        for (Integer l : lst) {
            if (l > 0) {
                sum += l;
            }
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_3_acdb6c29_3e94_42d4_95fe_3453afbe864a(ArrayList<Integer> lst) {

        int max = 0;
        for (Integer i : lst) {
            if (i > max) {
                max = i;
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_4_2f71c772_b1c9_4191_9803_f94e8490e8c6(ArrayList<Integer> lst) {
        int max = 0;
        int sum = 0;
        for (int l : lst) {
            sum += l;
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }

    
    public static int skjkasdkd_Problem_8_fd499dc9_edfa_438b_9cb8_74adadb05aa9(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for (Integer l : lst) {
            if (l > max) {
                max = l;
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_7_5991eb1f_f9c9_474a_aeb8_eca8a326974d(ArrayList<Integer> lst) {
        int max = 0;
        for (Integer i : lst) {
            if (i > max) {
                max = i;
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_5_bfef38de_b42f_4c4e_8a89_32d8f6006a73(ArrayList<Integer> lst) {
        // Your code here
        return 0;

    }

    
    public static int skjkasdkd_Problem_3_2747f1c7_54f7_4866_80ab_0727632ed886(ArrayList<Integer> lst) {
        // Your code here.
        return 0;
    }

    
    public static int skjkasdkd_Problem_5_95e4294e_5c37_4bc6_98ff_fbee587521ca(ArrayList<Integer> lst) {
        int maxSum = 0;
        int sum = 0;
        Iterator<Integer> iterator = lst.iterator();
        while (iterator.hasNext()) {
            int next = iterator.next();
            if (next % 2 == 1) {
                sum += next;
            }
            else {
                sum -= next;
            }
            if (sum > maxSum) {
                maxSum = sum;
            }
            sum = 0;
        }
        return maxSum;
    }

    
    public static int skjkasdkd_Problem_4_548c21f5_345c_4906_ae3c_6f50a09ed006(ArrayList<Integer> lst) {
        if(lst.isEmpty()) {
            return 0;
        }
        List<Integer> copy = new ArrayList<>(lst);
        copy.removeIf(i -> i == 0);
        Integer max = Collections.max(copy);
        Integer sum = 0;
        for(Integer i : copy) {
            if(i == max) {
                sum += i;
            }
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_4_c96d4c1f_999f_438b_9f68_095ad14f96da(ArrayList<Integer> lst) {
        // Your code here.
        return 0;
    }

    
    public static int skjkasdkd_Problem_7_332fb464_2599_4375_bf9c_7adb49f814aa(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for (int i : lst) {
            if (i > max) {
                max = i;
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_1_805a243e_6c21_4c46_8b7b_c4ff76e08f21(ArrayList<Integer> lst) {
        int max = 0;
        int sum = 0;
        for (int i : lst) {
            sum += i;
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }

    
    public static int skjkasdkd_Problem_7_236e5455_dd2f_43b4_b8e2_792ea4803183(ArrayList<Integer> lst) {
        int max = 0;
        int sum = 0;
        for (int i : lst) {
            sum += i;
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }

    
    public static int skjkasdkd_Problem_7_75eb4d5a_ff5d_473b_8360_1e87e4114349(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for (int i : lst) {
            if (i > max) {
                max = i;
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_0_1b312526_d46b_43ef_9f34_b62ba2aec0cd(ArrayList<Integer> lst) {
        int max = 0;
        int sum = 0;
        for (int l : lst) {
            sum += l;
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }

    
    public static int skjkasdkd_Problem_4_7898a7da_69be_4d63_aa83_a9fb1fdcdc54(ArrayList<Integer> lst) {

        return lst.stream().mapToInteger(l -> l).filter(l -> l > 0).filter(l -> {
            for (int i = 2; i <= l / 2; i++) {
                if (l % i == 0) {
                    return False;
                }
            }
            return True;
        }).sum();
    }

    
    public static int skjkasdkd_Problem_6_0837b61f_bd49_4e2e_b069_3524487243ce(ArrayList<Integer> lst) {
        // >>> your code goes here <<<
        return 0;
    }

    
    public static int skjkasdkd_Problem_5_acd68c4b_fefd_4452_b9ac_2ed113819af9(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for (int i : lst) {
            if (i > max) {
                max = i;
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_0_8ab7ee13_04e1_46ba_b73e_fe00bd0e9315(ArrayList<Integer> lst) {
        // Your code here
        return 0;

    }

    
    public static int skjkasdkd_Problem_1_87afc909_fc96_4055_a8b2_5720f543d834(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for (int i : lst) {
            if (i > max) {
                max = i;
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_5_d3ce0ca2_b6ae_4f54_985c_3f050be23866(ArrayList<Integer> lst) {
        int max = 0;
        int sum = 0;
        for (Integer i : lst) {
            if (i.intValue() > max) {
                max = i.intValue();
            }
            if (i.intValue() % max == 0) {
                sum += i.intValue() % max;
            }
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_7_99d936fb_f562_4b99_ba77_2819e1c6b908(ArrayList<Integer> lst) {

        int max = 0;
        for (int i : lst) {
            if (i > max) {
                max = i;
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_1_90e0a473_9f4e_4f3d_b83d_03df6cb87575(ArrayList<Integer> lst) {
        // Your code here
        return 0;
    }

    
    public static int skjkasdkd_Problem_2_642dacad_a83a_4264_a0ab_9fef3b1cba7a(ArrayList<Integer> lst) {
        int result = 0;
        int maxPrime = lst.get(0);
        int sum = 0;

        for(Integer num : lst) {
            for(int i = 2; i <= Math.sqrt(num); i++) {
                if(num % i == 0) {
                    return -1;
                }
            }
            for(int i = 2; i <= Math.sqrt(num); i++) {
                if(maxPrime % i == 0) {
                    maxPrime += i;
                }
            }
            if(maxPrime == num) {
                sum += num;
            }
            maxPrime = num;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_7_e6613c1d_ea43_4f85_a212_bec955f9d3f3(ArrayList<Integer> lst) {

        return lst.stream().mapToInteger(Integer::intValue).max().orElse(0);
    }

    
    public static int skjkasdkd_Problem_2_bcfc3b8f_399c_4543_a03a_bb68f12e25a4(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for (int i : lst) {
            if (i > max) {
                max = i;
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_6_c38aa3f6_c4e7_43dc_904d_d9d4e502e472(ArrayList<Integer> lst) {

        int max = 0;
        for (int i : lst) {
            if (i > max) {
                max = i;
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_3_35d504c7_fa75_409a_bb9c_a3403453875d(ArrayList<Integer> lst) {
        int maxVal = Integer.MIN_VALUE;
        for (int l : lst) {
            int val =  l;
            int divNum = 1;
            while (val != 0) {
                while (val % divNum == 0) {
                    val/=divNum;
                }
                divNum++;
            }
            maxVal = (val < maxVal) ? val : maxVal;
        }
        return maxVal;
    }

    
    public static int skjkasdkd_Problem_5_276d196b_388a_40a8_9a30_62c12bc0f25b(ArrayList<Integer> lst) {
        // Your code here
        List<Integer> digits = lst.stream().map(x ->  (x % 10d)).collect(Collectors.toList());
        int sum = 0;
        for (int i = 0; i < digits.size(); i++) {
            if (digits.get(i) == 0) {
                continue;
            }
            if (digits.get(i) > 0) {
                sum += digits.get(i);
                for (int j = i; j < digits.size(); j++) {
                    if (digits.get(j) > 0) {
                        sum += digits.get(j);
                    }
                }
            }
        }
        int sum2 = sum % 10;
        if (sum2 > 0) {
            return sum2;
        } else {
            return 0;
        }
    }

    
    public static int skjkasdkd_Problem_2_5f81c9df_cb71_45fc_a7d4_779625416d73(ArrayList<Integer> lst) {
        int max = 0;
        int sum = 0;
        for (int i : lst) {
            sum += i;
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }

    
    public static int skjkasdkd_Problem_8_789926e0_1b90_4680_a58c_b0ec0960e51a(ArrayList<Integer> lst) {
        int counter = 0;
        int maxSum = lst.get(0);
        int primeSum = lst.get(1);
        int sum = 0;
        int sumOfDigits = 0;
        for (int i = 2; i <= lst.size(); i++) {
            primeSum += lst.get(i);
            if (primeSum >= maxSum) {
                counter++;
                maxSum = primeSum;
            }
            if (counter != 0) {
                for (int j = 0; j < i; j++) {
                    sumOfDigits += lst.get(j);
                }
                sum += sumOfDigits % 10;
                sumOfDigits = sumOfDigits / 10;
            }
        }
        return (sum + lst.get(lst.size() - 1));
    }

    
    public static int skjkasdkd_Problem_6_05dcce01_5412_4ec8_a558_dfe85a783192(ArrayList<Integer> lst) {

        int max = 0;
        for (int i : lst) {
            if (i > max) {
                max = i;
            }
        }
        int sum = 0;
        for (int i : lst) {
            if (i > max) {
                sum += i;
            }
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_5_4238f6fb_ea1d_4aea_b374_4651725e5c53(ArrayList<Integer> lst) {
        int max = 0;
        int sum = 0;
        for(Integer i : lst) {
            if(i>max) {
                max = i;
            }
            sum += i;
        }
        return sum;

    }

    
    public static int skjkasdkd_Problem_1_0ce8acaf_2834_4ef3_83fc_2ed1f5e12a90(ArrayList<Integer> lst) {

        // write your code here
        int max = 0;
        for (int l : lst) {
            if (l > max) {
                max = l;
            }
        }
        int count = 0;
        while (max > 0) {
            count += max % 10;
            max /= 10;
        }
        return count;
    }

    
    public static int skjkasdkd_Problem_3_d90181a3_479a_4843_bb28_e98b13dc4e5f(ArrayList<Integer> lst) {
        int max = 0;
        int sum = 0;
        int prime = 0;
        for (int i : lst) {
            if (i % 2 == 0) {
                prime = i;
            }
            if (prime > max) {
                max = prime;
            }
            sum += i;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_4_e4a4d36a_216d_49ac_8acb_00ef4392f7a0(ArrayList<Integer> lst) {

        int max = 0;
        for (int i : lst) {
            if (i > max) {
                max = i;
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_3_78dbc74b_0ef1_4340_a651_95971b0237ff(ArrayList<Integer> lst) {

        // Write your code here
        return lst.stream().mapToInteger(x -> x).max().getAsInteger();
    }

    
    public static int skjkasdkd_Problem_0_da225c6c_a4c5_4cb2_8637_4233554c6d13(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for (int i : lst) {
            if (i > max) {
                max = i;
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_2_3c062cdc_aa8a_4515_a895_7c33cafc451e(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for (int l : lst) {
            if (l > max) {
                max = l;
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_7_72dd6596_863a_4104_a98e_5a3e23f2f8ec(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for (int i : lst) {
            if (i > max) {
                max = i;
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_7_5bf453a9_141d_4f92_8750_11f670022c3e(ArrayList<Integer> lst) {

        // Write your code here
        return lst.stream().mapToInteger(x -> x).max().getAsInteger();
    }

    
    public static int skjkasdkd_Problem_6_d2349619_57bb_4429_97bd_09ad57ea3a4d(ArrayList<Integer> lst) {
        int max = 0;
        int sum = 0;
        for(int i : lst) {
            if(i>0) {
                int temp = i;
                while(temp>0) {
                    if(temp%10==0) {
                        break;
                    }
                    temp/=10;
                }
                if(temp>0) {
                    sum += temp;
                }
            }
        }
        max = sum;
        return max;

    }

    
    public static int skjkasdkd_Problem_4_fd499dc9_edfa_438b_9cb8_74adadb05aa9(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for (Integer l : lst) {
            if (l > max) {
                max = l;
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_3_91f36e6b_0280_4df7_8a03_7ef19dbb8610(ArrayList<Integer> lst) {
        int max = 0;
        for (int i : lst) {
            int sum = 0;
            while (i > 0) {
                sum += i % 10;
                i /= 10;
            }
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }

    
    public static int skjkasdkd_Problem_5_aa6516f5_77c1_4e47_8a8c_278ccbf28fac(ArrayList<Integer> lst) {
        int maxP = -1;
        int sum = 0;
        for(Integer p: lst) {
            if(p % 2 == 0) {
                maxP = Math.max(maxP, p);
            }
            if(p % 10 == 0) {
                sum += p;
            }
        }
        if(maxP != -1) {
            sum -= maxP * Math.pow(10, lst.size());
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_1_9230dba0_310a_49a4_a9c9_08c618527de4(ArrayList<Integer> lst) {
        int max = 0;
        int sum = 0;
        for (int l : lst) {
            sum += l;
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }

    
    public static int skjkasdkd_Problem_2_215cdce8_b552_4685_9a1a_9320c02941bb(ArrayList<Integer> lst) {
        Integer max = null;
        for (int num : lst) {
            if (num > 0) {
                boolean isPrime = True;
                for (int i = 2; i < num; i++) {
                    if (num % i == 0) {
                        isPrime = False;
                        break;
                    }
                }
                if (isPrime) {
                    if (max != null && max < num) {
                        max = num;
                    }
                }
            }
        }
        return max == null ? 0 : max;
    }

    
    public static int skjkasdkd_Problem_2_8a16a292_0bcb_48d1_b10d_3085dc06de22(ArrayList<Integer> lst) {
        int max = 0;
        int sum = 0;
        for(Integer i : lst) {
            if(i>max) {
                max = i;
            }
        }
        for(Integer i : lst) {
            if(i>max) {
                sum = sum + i;
            }
        }
        return sum;

    }

    
    public static int skjkasdkd_Problem_1_bf475010_b3ea_41d1_9cbf_f06aa88208cd(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for(int i : lst){
            if(i > max){
                max = i;
            }
        }
        int sum = 0;
        while(max > 0){
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_5_20f17da3_cae9_4f74_baac_c57f1048a2ab(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for(int l : lst) {
            if(l > max) {
                max = l;
            }
        }
        int sum = 0;
        while(max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_4_4ea784e2_4088_47cc_b1e5_bcd73ae4015e(ArrayList<Integer> lst) {
        int maxPrime = 0;
        int sum = 0;
        for(int num : lst) {
            sum += num;
            if(num > maxPrime) {
                maxPrime = num;
            }
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_8_58f69e48_98e1_4848_b395_2bec3601de8c(ArrayList<Integer> lst) {
        int max = 0;
        int sum = 0;
        for (int i : lst) {
            sum += i;
            if (sum > max) {
                max = sum;
            }
        }
        return max;

    }

    
    public static int skjkasdkd_Problem_7_8785dd23_ad50_45d4_a81d_49ad5b66a2f2(ArrayList<Integer> lst) {
        int max = 0;
        int sum = 0;
        for (int i : lst) {
            sum += i;
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }

    
    public static int skjkasdkd_Problem_0_9b745c40_095a_4d78_bdb3_7ece103f1837(ArrayList<Integer> lst) {
        int max = 0;
        int sum = 0;
        int prime = 0;
        for (int i : lst) {
            if (i % 2 == 0) {
                prime = i;
            }
            if (prime > max) {
                max = prime;
            }
            sum += i % 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_1_da225c6c_a4c5_4cb2_8637_4233554c6d13(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for (int i : lst) {
            if (i > max) {
                max = i;
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_2_7caf3e07_1bfb_41bd_ad14_9f3bfb2f7348(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for (int i : lst) {
            if (i > max) {
                max = i;
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_5_f2678dae_a274_4619_9c01_b590fde3f769(ArrayList<Integer> lst) {
        int maxSum = lst.get(0);
        int sum = 0;
        int maxPrime = 0;
        for (int prime : lst) {
            if (prime > maxPrime) {
                maxPrime = prime;
            }
            if (prime > maxSum) {
                maxSum = prime;
            }
            sum += prime;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_0_87afc909_fc96_4055_a8b2_5720f543d834(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for (int i : lst) {
            if (i > max) {
                max = i;
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_1_4851ccb4_9863_4167_9a27_d163617d7470(ArrayList<Integer> lst) {

        int sum = 0;
        for (int l : lst) {
            sum += l;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_1_9a52d2c9_6c7f_4119_bc38_5728c3f2bed1(ArrayList<Integer> lst) {

        int max = 0;
        for (int i : lst) {
            if (i > max)
                max = i;
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_4_919e2613_b152_4f17_9bb0_d87566015881(ArrayList<Integer> lst) {

        return lst.stream().filter(x -> x > 1).map(x -> x.toString().chars().map(Character::getNumericValue).sum()).max(Comparator.naturalOrder()).orElse(0);
    }

    
    public static int skjkasdkd_Problem_7_3796013c_9c96_4379_98d2_5a65d2198ae4(ArrayList<Integer> lst) {
        int max = 0;
        int sum = 0;
        for (int i : lst) {
            sum += i;
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }

    
    public static int skjkasdkd_Problem_8_36a315a7_ef82_43cb_a8f9_9683af51606e(ArrayList<Integer> lst) {

        return lst.stream().filter(x -> {
            for (int i = 2; i < x; i++) {
                if (x % i == 0) {
                    return False;
                }
            }
            return True;
        }).reduce(0, (x, y) -> x + y);
    }

    
    public static int skjkasdkd_Problem_3_7ee5bc9c_f2c3_4974_a302_f5405e46d81a(ArrayList<Integer> lst) {

        int max = 0;
        for (int i : lst) {
            if (i > max) {
                max = i;
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_3_794b0158_d9be_4548_84fb_ee200bf27a61(ArrayList<Integer> lst) {

        return 0;
    }

    
    public static int skjkasdkd_Problem_7_da225c6c_a4c5_4cb2_8637_4233554c6d13(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for (int i : lst) {
            if (i > max) {
                max = i;
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_7_c509089d_3be7_407f_86fe_4e3f74a075a4(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for(int i : lst){
            if(i > max){
                max = i;
            }
        }
        int sum = 0;
        while(max > 0){
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_8_0ad9d6a6_53f6_467d_b0cc_9e3f93a1cd4a(ArrayList<Integer> lst) {

        // Write your code here
        int sum = 0;
        for (int l : lst) {
            sum += l;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_8_6154a99f_01fb_4714_8b62_0068f8e15016(ArrayList<Integer> lst) {
        int maxPrime = 0;
        int sum = 0;
        for(int i : lst) {
            if(i>maxPrime) {
                maxPrime = i;
            }
            sum += i;
        }
        return sum;

    }

    
    public static int skjkasdkd_Problem_4_3790615b_0207_4e03_8958_886f139f3be8(ArrayList<Integer> lst) {

        return 0;
    }

    
    public static int skjkasdkd_Problem_7_a0a1681e_3aab_4418_9571_5c58daa50dee(ArrayList<Integer> lst) {
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        for (int num : lst) {
            sum += num;
            if (sum > maxSum) {
                maxSum = sum;
            }
        }
        return maxSum;
    }

    
    public static int skjkasdkd_Problem_1_8ab7ee13_04e1_46ba_b73e_fe00bd0e9315(ArrayList<Integer> lst) {
        // Your code here
        return 0;

    }

    
    public static int skjkasdkd_Problem_3_66013cab_4ec7_42b0_ba93_0a8187dc9251(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for (int l : lst) {
            if (l > max) {
                max = l;
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_7_7db4b225_8772_4816_be4d_cd0f568e6ad8(ArrayList<Integer> lst) {
        int maxPrime = 0;
        int sum = 0;
        for(Integer l : lst) {
            if(l % 2 == 0) {
                continue;
            }
            for(int i = 2; i <= l; i+=2) {
                if(l % i == 0) {
                    maxPrime = i;
                    sum = sum + i;
                    break;
                }
            }
            if(maxPrime != 0) {
                maxPrime = 0;
            }
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_6_68a462a7_da65_4ba4_a8a2_2362e4bcd251(ArrayList<Integer> lst) {
        int res = 0;
        for (Integer i : lst) {
            if (i.intValue() > 1) {
                boolean bPrime = True;
                int curSum = 0;
                for (int j : lst) {
                    if (j == i) {
                        continue;
                    }
                    if (j > i) {
                        break;
                    }
                    while (j % i == 0) {
                        bPrime = False;
                        curSum += j;
                        j++;
                    }
                }
                if (bPrime) {
                    res = Math.max(res, curSum);
                }
            }
        }
        return res;
    }

    
    public static int skjkasdkd_Problem_6_6232eb17_ba17_433e_871e_e038a1b67143(ArrayList<Integer> lst) {
        int maxPrime = 0;
        int sum = 0;
        for (int prime : lst) {
            if (prime > maxPrime) {
                maxPrime = prime;
            }
        }
        for (int prime : lst) {
            if (prime > maxPrime) {
                sum += prime % maxPrime;
            }
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_7_ea9f7eb6_b97f_4c82_8798_803d7392cf04(ArrayList<Integer> lst) {
        int max = 0;
        for (int i : lst) {
            if (i > max) {
                max = i;
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_2_cd2b7159_1a08_4592_8059_aa8f53071f68(ArrayList<Integer> lst) {

        int max = 0;
        for (int i : lst) {
            if (i > max) {
                max = i;
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_2_1ccb58c1_0f39_4724_b66a_f4825b7d2535(ArrayList<Integer> lst) {

        int max = 0;
        for (int i : lst) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }

    
    public static int skjkasdkd_Problem_0_02f7b3de_bb9f_4289_99d2_a9bb2f0b14ec(ArrayList<Integer> lst) {
        int maxPrime = 0;
        int sum = 0;
        int prime = 0;
        int sumOfDigits = 0;
        for(int i : lst) {
            prime = i;
            while(prime > 1) {
                prime = prime / 10;
            }
            sumOfDigits += prime % 10;
            sum += i;
            if(sumOfDigits > maxPrime) {
                maxPrime = sumOfDigits;
            }
        }
        return sum;

    }

    
    public static int skjkasdkd_Problem_0_78cd0298_587e_4930_a08a_16de13cca616(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for (Integer l : lst) {
            if (l > max) {
                max = l;
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_8_07999c87_44af_4958_9e19_e6fa8f1ba6de(ArrayList<Integer> lst) {

        return lst.stream().mapToInteger(Integer::intValue).filter(i -> i > 1).max().orElse(0);
    }

    
    public static int skjkasdkd_Problem_8_6a61ff6a_6f01_465e_ad8b_70406133af6e(ArrayList<Integer> lst) {
        int maxPrime = 0;
        int sum = 0;
        int prime = 0;
        int primeSum = 0;
        boolean isPrime = True;
        int temp = 0;
        for (int i : lst) {
            if (isPrime) {
                prime = i;
                primeSum = i;
                isPrime = False;
            }
            if (i % prime == 0) {
                isPrime = True;
                primeSum += i;
            }
            if (primeSum > maxPrime) {
                maxPrime = primeSum;
                sum = primeSum;
            }
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_6_d12dd76a_ff19_4f48_9258_f0190bcd2170(ArrayList<Integer> lst) {
        int max = 0;
        for (int l : lst) {
            int sum = 0;
            while (l > 0) {
                sum += l % 10;
                l /= 10;
            }
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }

    
    public static int skjkasdkd_Problem_4_ab711e15_3bed_46c6_bdae_ef16e95cdb11(ArrayList<Integer> lst) {

        // Write your code here
        int sum = 0;
        for(int l : lst){
            if(l > 0){
                sum += l;
            }
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_0_0cdea5cb_8276_449f_aaa0_e728c7252b37(ArrayList<Integer> lst) {
        int maxSum = Integer.MIN_VALUE;
        for (int l : lst) {
            int sum = 0;
            while (l != 0) {
                sum += l % 10;
                l /= 10;
            }
            if (sum > maxSum) {
                maxSum = sum;
            }
        }
        return maxSum;
    }

    
    public static int skjkasdkd_Problem_7_d3a12af5_68e8_4805_813a_24457881987c(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for (Integer l : lst) {
            if (l > max) {
                max = l;
            }
        }
        int sum = 0;
        while (max > 0) {
            int rem = max % 10;
            sum += rem;
            max = max / 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_2_ca39f108_6e4c_4a0d_b6a2_be8b98518da5(ArrayList<Integer> lst) {

        int max = 0;
        for (Integer l : lst) {
            if (l > max) {
                max = l;
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_7_8471227f_b7c3_4dad_876a_590c47bddc44(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for (int i : lst) {
            if (i > max) {
                max = i;
            }
        }
        int sum = 0;
        while (max > 0) {
            int rem = max % 10;
            if (rem == 2 || rem == 3 || rem == 5 || rem == 7) {
                sum += rem;
            }
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_1_45ad6077_8af3_4226_9f56_a0646d709a96(ArrayList<Integer> lst) {
        int max = 0;
        int sum = 0;
        for (int l : lst) {
            sum += l;
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }

    
    public static int skjkasdkd_Problem_6_7aa03ab6_090b_4e33_bb37_fc5edb1d41d1(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for(int i : lst){
            if(i > max) max = i;
        }
        int sum = 0;
        while(max > 0){
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_0_f064d27a_d4ff_489b_b946_7738506161a3(ArrayList<Integer> lst) {

        int max = 0;
        for (int l : lst) {
            if (l > max) {
                max = l;
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_0_c8b3391a_247a_44b8_ba89_fe617bf0a3da(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for (int l : lst) {
            if (l > max) {
                max = l;
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_4_54ad14d9_2527_435f_8aaa_d1aeffeb7d2c(ArrayList<Integer> lst) {
        int max = 0;
        int sum = 0;
        for (int i : lst) {
            sum += i;
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }

    
    public static int skjkasdkd_Problem_4_3fc9e968_f9b7_4cb3_b31c_8a74070c1394(ArrayList<Integer> lst) {
        int maxPrime = 0;
        int sum = 0;
        int prime = 0;
        for (int i : lst) {
            prime = i;
            while (prime > 1) {
                if (prime % 2 == 0) {
                    prime = prime / 2;
                } else {
                    prime = prime * 3;
                }
            }
            if (prime > maxPrime) {
                maxPrime = prime;
                sum = i;
            }
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_0_54ad14d9_2527_435f_8aaa_d1aeffeb7d2c(ArrayList<Integer> lst) {
        int max = 0;
        int sum = 0;
        for (int i : lst) {
            sum += i;
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }

    
    public static int skjkasdkd_Problem_4_44300134_d3c8_44cd_94c9_db99046a30c6(ArrayList<Integer> lst) {
        int largestPrime = 0;
        int sumOfLargestPrimeDigits = 0;
        for (int i : lst) {
            if (new BigInteger(String.valueOf(i)).isProbablePrime(500)) {
                if (i > largestPrime) {
                    largestPrime = i;
                }
            }
        }
        for (int x : (new BigInteger(String.valueOf(largestPrime))).toByteArray()) {
            sumOfLargestPrimeDigits += x;
        }
        return sumOfLargestPrimeDigits;
    }

    
    public static int skjkasdkd_Problem_3_3c062cdc_aa8a_4515_a895_7c33cafc451e(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for (int l : lst) {
            if (l > max) {
                max = l;
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_0_0837b61f_bd49_4e2e_b069_3524487243ce(ArrayList<Integer> lst) {
        // >>> your code goes here <<<
        return 0;
    }

    
    public static int skjkasdkd_Problem_6_0cdea5cb_8276_449f_aaa0_e728c7252b37(ArrayList<Integer> lst) {
        int maxSum = Integer.MIN_VALUE;
        for (int l : lst) {
            int sum = 0;
            while (l != 0) {
                sum += l % 10;
                l /= 10;
            }
            if (sum > maxSum) {
                maxSum = sum;
            }
        }
        return maxSum;
    }

    
    public static int skjkasdkd_Problem_5_31160bc1_3d12_4c2a_acbb_3c58269003e5(ArrayList<Integer> lst) {
        int max = 0;
        int sum = 0;
        for(Integer i : lst) {
            if(i>max) {
                max = i;
            }
        }
        for(Integer i : lst) {
            if(i>max) {
                sum = sum + i;
            }
        }
        return sum;

    }

    
    public static int skjkasdkd_Problem_0_3da378be_6e27_4b50_8dce_5830be79cb4d(ArrayList<Integer> lst) {
        // Write your code here
        // To print results to the standard output you can use System.out.println()
        // Example: System.out.println("Hello world!");
        return 0;
    }

    
    public static int skjkasdkd_Problem_7_59303e3a_9763_4d9f_aa54_2f912c72542c(ArrayList<Integer> lst) {
        int max = 0;
        int sum = 0;
        for (Integer i : lst) {
            if (i.intValue() > max) {
                max = i.intValue();
            }
            sum += i.intValue();
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_4_c262b3a8_6cb2_402c_88ad_7b93655bd7b9(ArrayList<Integer> lst) {
        int max = 0;
        for (int i : lst) {
            max = Math.max(max, i);
        }
        int sum = 0;
        for (int i : lst) {
            sum += i;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_1_61c7d8ed_dc62_4731_b89a_9ca25387dc9e(ArrayList<Integer> lst) {
        int maxSum = lst.get(0);
        int sum = 0;
        for(int i = 1; i < lst.size(); i++) {
            int curSum = lst.get(i);
            sum += curSum;
            if(curSum > maxSum) {
                maxSum = curSum;
            }
        }
        return sum;

    }

    
    public static int skjkasdkd_Problem_1_248cd964_88e1_4a93_ae2e_cd98ef1ea29b(ArrayList<Integer> lst) {
        int max = 0;
        int sum = 0;
        for(int i : lst) {
            if(i>max) {
                max = i;
            }
            sum += i;
        }
        return sum;

    }

    
    public static int skjkasdkd_Problem_8_a0eb6969_efc4_4e8b_8133_ed4e0a1303ee(ArrayList<Integer> lst) {
        int max = 0;
        for (int l : lst) {
            max = Math.max(max, l);
        }
        int sum = 0;
        for (int l : lst) {
            sum += l;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_6_0a9eb408_6276_4924_a1fc_0f85aaf5fa73(ArrayList<Integer> lst) {
        int max = 0;
        int sum = 0;
        int prime = 0;
        for (int i : lst) {
            if (i % 2 == 0) {
                prime = i;
            }
            if (prime > max) {
                max = prime;
            }
            sum += i;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_3_8f6e2aea_9da2_45f2_b2fa_253e02ae5f07(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for (int i = 0; i < lst.size(); i++) {
            if (lst.get(i) > max) {
                max = lst.get(i);
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_2_7b84bad1_b31d_470b_81ac_cdb0bf5aa470(ArrayList<Integer> lst) {
        int max = 0;
        int sum = 0;
        for (int i : lst) {
            sum += i;
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }

    
    public static int skjkasdkd_Problem_8_f521bb92_8366_4a2c_9df5_043a83707dc6(ArrayList<Integer> lst) {

        int max = 0;
        for (int l : lst) {
            if (l > max) {
                max = l;
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_6_5891d155_8620_4449_96e3_20e13cc2ed7e(ArrayList<Integer> lst) {

        int max = 0;
        for (Integer i : lst) {
            if (i > max) {
                max = i;
            }
        }
        int sum = 0;
        for (Integer i : lst) {
            if (i > max) {
                continue;
            }
            sum += i;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_6_c262b3a8_6cb2_402c_88ad_7b93655bd7b9(ArrayList<Integer> lst) {
        int max = 0;
        for (int i : lst) {
            max = Math.max(max, i);
        }
        int sum = 0;
        for (int i : lst) {
            sum += i;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_1_716a4387_3205_4756_ac5e_14ded0698dfa(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for (int i : lst) {
            if (i > max) {
                max = i;
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_5_1ca9af90_2569_4044_832d_fc155bf63c8e(ArrayList<Integer> lst) {
        int max = 0;
        int sum = 0;
        for (Integer i : lst) {
            sum += i;
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }

    
    public static int skjkasdkd_Problem_6_c3b23dd8_30be_4892_9eae_d0d13e00577a(ArrayList<Integer> lst) {
        int max = lst.get(0);
        int sum = 0;
        for (Integer item : lst) {
            if (item > max) {
                max = item;
            }
        }
        for (Integer item : lst) {
            if (item == max) {
                sum += item.intValue();
            }
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_5_16b4d00f_6b97_4a6e_9272_63c49251f700(ArrayList<Integer> lst) {
        int maxSum = Integer.MIN_VALUE;
        for (int num : lst) {
            int sum = 0;
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            if (sum > maxSum) {
                maxSum = sum;
            }
        }
        return maxSum;
    }

    
    public static int skjkasdkd_Problem_1_c838f1e7_96a7_4f07_a138_f3b8c7987151(ArrayList<Integer> lst) {
        int maxPrime = 0;
        int sum = 0;
        for(int i : lst) {
            sum += i;
            if(sum > maxPrime) {
                maxPrime = sum;
            }
        }
        return maxPrime;
    }

    
    public static int skjkasdkd_Problem_3_70a546f7_1e5a_4711_b6f0_fdc7f78524ef(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for(int l : lst){
            if(l > max){
                max = l;
            }
        }
        int sum = 0;
        while(max > 0){
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_3_f3ace76c_4e9f_47c0_acf6_76df7d30165f(ArrayList<Integer> lst) {

        int sum = 0;
        for (int l : lst) {
            sum += l;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_1_b46d7aba_274a_4b2a_88e1_63954600aada(ArrayList<Integer> lst) {
        int maxSum = Integer.MIN_VALUE;
        int maxSumDigit = 0;
        for (int l : lst) {
            int sumDigit = 0;
            int sum = 0;
            while (l > 0) {
                sumDigit += l % 10;
                l /= 10;
            }
            sum += sumDigit;
            if (sum > maxSum) {
                maxSum = sum;
                maxSumDigit = sumDigit;
            }
        }
        return maxSumDigit;
    }

    
    public static int skjkasdkd_Problem_0_63bf4d75_7a35_48f4_b55b_5c128e4eac34(ArrayList<Integer> lst) {

        int max = 0;
        for (int i : lst) {
            if (i > max) {
                max = i;
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_6_f6a64c21_9c5f_4aa1_a33b_0e00b206a118(ArrayList<Integer> lst) {
        int max = 0;
        for (int i : lst) {
            if (i > max) {
                max = i;
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_7_eba187a8_7378_455b_aaa7_f650568720a8(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for (int i = 0; i < lst.size(); i++) {
            if (lst.get(i) > max) {
                max = lst.get(i);
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max = max / 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_6_000252c9_40aa_4f8a_906b_6484818f8a6e(ArrayList<Integer> lst) {

        return 0;
    }

    
    public static int skjkasdkd_Problem_1_673ad0ac_22d2_4938_9300_979daacf46ba(ArrayList<Integer> lst) {
        int max = 0;
        for (int i : lst) {
            if (max < i) {
                max = i;
            }
        }
        return max;

    }

    
    public static int skjkasdkd_Problem_4_ddf21f27_e3f8_447f_9f6a_e888f929386d(ArrayList<Integer> lst) {
        if(lst.isEmpty()) return 0;
        int max = -1;
        for(int l : lst) {
            if(max<l) max = l;
        }
        int sum = 0;
        for(int l : lst) {
            if((l%max)==0) {
                sum += l;
            }
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_5_80dd7af5_aad2_4ac1_bdeb_776046892c6f(ArrayList<Integer> lst) {
        int max = 0;
        int sum = 0;
        for (Integer i : lst) {
            if (i.intValue() > max) {
                max = i.intValue();
            }
            sum += i.intValue();
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_1_1f524e76_8245_4712_99e8_3cb4baaae0fd(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for (int l : lst) {
            if (l > max) {
                max = l;
            }
        }
        int count = 0;
        while (max > 0) {
            count += max % 10;
            max /= 10;
        }
        return count;
    }

    
    public static int skjkasdkd_Problem_8_9ea546dc_e9fc_4858_b941_70ea39f3b2ac(ArrayList<Integer> lst) {
        int biggestPrime = lst.get(0);
        for (int prime : lst) {
            if (prime > biggestPrime) {
                biggestPrime = prime;
            }
        }

        // we now have a prime number in the biggestPrime variable.
        // let's find the sum of its digits.
        int sum = 0;
        for (int prime : lst) {
            if (prime > biggestPrime) {
                break;
            }
            sum += prime % 10;
            prime /= 10;
        }
        // print the result
        System.out.println("(" + sum + ")");

        return sum;
    }

    
    public static int skjkasdkd_Problem_7_d8ccfdf6_e621_429d_9945_86b8c65a8e17(ArrayList<Integer> lst) {
        List<Integer> lst2 = new ArrayList<>();
        for (Integer element : lst) {
            if (element % 2 == 0) {
                lst2.add(element);
            }
        }
        int largestPrimeValue = lst2.stream().max(Integer::compareTo).get();
        if (largestPrimeValue % 2 != 0) {
            return largestPrimeValue;
        } else {
            int total = 0;
            for (Integer element : lst2) {
                if (element % 2 != 0) {
                    total += element / 2;
                }
            }
            return total;
        }
    }

    
    public static int skjkasdkd_Problem_0_e8139613_b4d3_488f_96b7_cf0af010b943(ArrayList<Integer> lst) {
        // Write your code here.
        return 0;
    }

    
    public static int skjkasdkd_Problem_7_07a1685c_eee0_478f_b73c_3b0a07d80116(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for(int i : lst){
            if(i > max){
                max = i;
            }
        }
        int sum = 0;
        while(max > 0){
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_7_38c52a7f_de8b_40b5_980b_fc3c677028d0(ArrayList<Integer> lst) {
        int maxPrime = 0;
        int sum = 0;
        for(int i : lst) {
            if(i>maxPrime) {
                maxPrime = i;
            }
        }
        for(int i : lst) {
            sum += i;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_0_cc2fd665_5a90_4eeb_a7c5_8729938117f1(ArrayList<Integer> lst) {

        return lst.stream().filter(x -> x > 1).max(Comparator.naturalOrder()).get();
    }

    
    public static int skjkasdkd_Problem_3_f0ddd8a1_f552_47fc_92e4_1ec6ba844ba9(ArrayList<Integer> lst) {
        int max = 0;
        int sum = 0;
        for(Integer i : lst) {
            if(i>max) {
                max = i;
            }
            sum += i;
        }
        return sum;

    }

    
    public static int skjkasdkd_Problem_1_f5a991c3_b684_428e_961d_c1aee8cd24d0(ArrayList<Integer> lst) {

        // Write your code here
        return 0;
    }

    
    public static int skjkasdkd_Problem_2_0a082712_fe18_418a_9bc3_f04c816ba0da(ArrayList<Integer> lst) {

        int max = 0;
        for (int i : lst) {
            if (i > max) {
                max = i;
            }
        }
        int sum = 0;
        for (int i : lst) {
            if (i > max) {
                continue;
            }
            sum += i;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_8_d3964f57_6cb0_4120_89f5_0b977cd24bd4(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for(int i : lst) {
            if(i > max) {
                max = i;
            }
        }
        int sum = 0;
        while(max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_7_05699823_09b4_41b4_aebd_2ec028f314af(ArrayList<Integer> lst) {
        int max = 0;
        int sum = 0;
        for (int i : lst) {
            sum += i;
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }

    
    public static int skjkasdkd_Problem_0_bc9f1236_16c6_4aba_816e_7b8b51ff3dbe(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for (int l : lst) {
            if (l > max) {
                max = l;
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_5_14e184fd_5fbe_4efa_b807_958961f10045(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for(int i : lst){
            if(i > max)
                max = i;
        }
        int sum = 0;
        while(max > 0){
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_8_c6c94ff6_50e6_405d_bbe5_21790aca1142(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for (int l : lst) {
            if (l > max) {
                max = l;
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_3_d45a26f7_2fb6_46ab_bf91_cba4f31733fb(ArrayList<Integer> lst) {
        int max = 0;
        for (Integer i : lst) {
            int n = i;
            int sum = 0;
            while (n > 0) {
                sum += n % 10;
                n /= 10;
            }
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }

    
    public static int skjkasdkd_Problem_2_e720dbd7_3b2d_4af8_aac1_93b917997995(ArrayList<Integer> lst) {
        int max = 0;
        int sum = 0;
        for (int i : lst) {
            sum += i;
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }

    
    public static int skjkasdkd_Problem_4_c3225615_9c97_494e_be4d_ba59f412b413(ArrayList<Integer> lst) {
        // Your code here
        return 0;

    }

    
    public static int skjkasdkd_Problem_5_c63eea46_56b2_47a4_b227_1a3d59422ebc(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for (int i : lst) {
            if (i > max) {
                max = i;
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_3_37b39b97_a8b6_4c70_81d7_11b871e1be9a(ArrayList<Integer> lst) {
        int max = 0;
        int sum = 0;
        for (Integer l : lst) {
            sum += l;
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }

    
    public static int skjkasdkd_Problem_6_4be063e7_3d3b_46fc_bac9_4b15b120297e(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for(int i : lst) {
            if(i > max) {
                max = i;
            }
        }
        int sum = 0;
        while(max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_1_f93c9065_2fc1_436b_8109_7a5d6c41f3a4(ArrayList<Integer> lst) {
        int max = 0;
        for (Integer i : lst) {
            int temp = i;
            while (temp > 0) {
                int digit = temp % 10;
                if (digit > max) {
                    max = digit;
                }
                temp /= 10;
            }
        }
        return max;
    }

    
    public static int skjkasdkd_Problem_7_37198aa9_70a7_46ab_bb31_052a5cc48260(ArrayList<Integer> lst) {
        int maxPrime = 0;
        int sum = 0;
        for (int l : lst) {
            sum += l;
            if (sum > maxPrime) {
                maxPrime = sum;
            }
        }
        return maxPrime;
    }

    
    public static int skjkasdkd_Problem_3_fcdbdcbc_e3a7_4e2d_8b05_0c86b1effb23(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for(int i : lst){
            if(i > max){
                max = i;
            }
        }
        int sum = 0;
        while(max > 0){
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_3_1479db82_46c0_43bc_bfb9_e15ff80022f3(ArrayList<Integer> lst) {

        int max = 0;
        for (Integer l : lst) {
            if (l > max) {
                max = l;
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_0_f5a991c3_b684_428e_961d_c1aee8cd24d0(ArrayList<Integer> lst) {

        // Write your code here
        return 0;
    }

    
    public static int skjkasdkd_Problem_4_81978f6f_2032_4484_aec5_d6e5d3df0a82(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for (int l : lst) {
            if (l > max) {
                max = l;
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_2_7001a003_f133_4d31_a1ec_74dfb3ae6348(ArrayList<Integer> lst) {

        // write your code here
        return lst.stream().filter(x -> {
            if (x == 0) {
                return False;
            }
            for (int i = 2; i < x; i++) {
                if (x % i == 0) {
                    return False;
                }
            }
            return True;
        }).mapToInteger(x -> x).sum();
    }

    
    public static int skjkasdkd_Problem_2_518459ab_08f1_46ec_bc10_67d1a18bbb60(ArrayList<Integer> lst) {
        int max = 0;
        for (int i : lst) {
            if (i > max) {
                max = i;
            }
        }
        return max;

    }

    
    public static int skjkasdkd_Problem_8_77c941d2_fe7b_4bc8_8a9b_c9bafa7da65d(ArrayList<Integer> lst) {

        return 0;
    }

    
    public static int skjkasdkd_Problem_7_aa6516f5_77c1_4e47_8a8c_278ccbf28fac(ArrayList<Integer> lst) {
        int maxP = -1;
        int sum = 0;
        for(Integer p: lst) {
            if(p % 2 == 0) {
                maxP = Math.max(maxP, p);
            }
            if(p % 10 == 0) {
                sum += p;
            }
        }
        if(maxP != -1) {
            sum -= maxP * Math.pow(10, lst.size());
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_3_5270ee7c_d1c2_46a9_b93c_8982d0a10477(ArrayList<Integer> lst) {
        int max = 0;
        int sum = 0;
        int maxNum = 0;
        int sumNum = 0;
        for(int num : lst) {
            sum += num;
            if(sum > max) {
                max = sum;
                maxNum = num;
            }
            sumNum += num;
        }
        return sumNum;

    }

    
    public static int skjkasdkd_Problem_2_b0507bf4_f87e_431e_af6d_6206d4b5a5bf(ArrayList<Integer> lst) {
        int max = 0;
        int sum = 0;
        for (int i : lst) {
            sum += i;
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }

    
    public static int skjkasdkd_Problem_3_b682d92c_02bf_4244_8837_19b6f8afacd5(ArrayList<Integer> lst) {
        // TODO: Complete this method
        ArrayList<Integer> result = new ArrayList<>();
        
        if (lst.size() <= 0)
            throw new IllegalArgumentException("Invalid Argument");
        
        // get the first number as prime number
        if (lst.get(0) > 0)
        {
            for(int i=1; i<lst.size(); i++)
            {
                // check all others numbers
                for(int j=i+1; j<lst.size(); j++)
                {
                    // check all others numbers
                    for(int k=j+1; k<lst.size(); k++)
                    {
                        // check all others numbers
                        for(int l=k+1; l<lst.size(); l++)
                        {
                            // check all others numbers
                            if(lst.get(i) * lst.get(j) * lst.get(k) * lst.get(l) != 0) {
                                //System.out.println("i" + lst.get(i) + "j" + lst.get(j) + "k" + lst.get(k) + "l" + lst.get(l));
                                result.add(lst.get(i) * lst.get(j) * lst.get(k) * lst.get(l));
                                return result.get(result.size()-1); // return last element
                            }
                        }
                    }
                }
            }
        }
        
        return 0;
    }

    
    public static int skjkasdkd_Problem_8_378563fc_ce1d_4462_8ad2_65a89106d208(ArrayList<Integer> lst) {

        // Fill this in.
        int sum = 0;
        for (Integer l : lst) {
            sum += l;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_4_b7c463a3_16f2_4489_8722_13489d1f10b4(ArrayList<Integer> lst) {
        Integer max = lst.get(0);
        for (Integer val : lst) {
            if (val > max) {
                max = val;
            }
        }
        int sum = 0;
        for (Integer val : lst) {
            if (val > max) {
                continue;
            }
            sum += val % 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_0_4da3ddd5_0fed_4113_800c_36ca2504f2fe(ArrayList<Integer> lst) {

        return lst.stream().filter(x -> {
            if (x == 0) {
                return False;
            }
            for (int i = 2; i < x; i++) {
                if (x % i == 0) {
                    return False;
                }
            }
            return True;
        }).mapToInteger(x -> x).sum();
    }

    
    public static int skjkasdkd_Problem_8_72dd6596_863a_4104_a98e_5a3e23f2f8ec(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for (int i : lst) {
            if (i > max) {
                max = i;
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_2_5bf453a9_141d_4f92_8750_11f670022c3e(ArrayList<Integer> lst) {

        // Write your code here
        return lst.stream().mapToInteger(x -> x).max().getAsInteger();
    }

    
    public static int skjkasdkd_Problem_4_9efedb71_9e64_4299_8cb7_e09986f5d8dc(ArrayList<Integer> lst) {

        return lst.stream().map(i -> i.toString()).map(i -> i.chars().map(j -> j - '0').sum()).max(Comparator.naturalOrder()).get();
    }

    
    public static int skjkasdkd_Problem_4_098a432b_45df_4ec9_a493_bde424571ddf(ArrayList<Integer> lst) {
        int max = 0;
        int sum = 0;
        for (int i : lst) {
            sum += i;
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }

    
    public static int skjkasdkd_Problem_6_9b51df1b_abfa_4be1_b411_78d0bf043186(ArrayList<Integer> lst) {

        return lst.stream().mapToInteger(x -> x).max().getAsInteger();
    }

    
    public static int skjkasdkd_Problem_1_d45a26f7_2fb6_46ab_bf91_cba4f31733fb(ArrayList<Integer> lst) {
        int max = 0;
        for (Integer i : lst) {
            int n = i;
            int sum = 0;
            while (n > 0) {
                sum += n % 10;
                n /= 10;
            }
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }

    
    public static int skjkasdkd_Problem_5_6333e481_160d_41f8_bf3f_2a46616711a8(ArrayList<Integer> lst) {
        int maxPrime = 0;
        int sum = 0;
        int prime = 0;
        int primeSum = 0;
        for (int i : lst) {
            prime = i;
            primeSum = 0;
            while (prime > 1) {
                if (prime % 2 == 0) {
                    prime = prime / 2;
                    primeSum += 2;
                } else {
                    prime = prime * 3;
                    primeSum += 3;
                }
            }
            if (primeSum > maxPrime) {
                maxPrime = primeSum;
                sum = primeSum;
            }
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_5_f350ef8d_e0fb_46bc_87ce_e760cb2c4541(ArrayList<Integer> lst) {
        int max = 0;
        int sum = 0;
        for (int i : lst) {
            sum += i;
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }

    
    public static int skjkasdkd_Problem_3_4334e247_b7d0_4c1e_a052_11a4ce969ea3(ArrayList<Integer> lst) {
        int maxPrime = 0;
        int sum = 0;
        for(int i : lst) {
            if(i>maxPrime) {
                maxPrime = i;
            }
            sum += i;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_3_a0a1681e_3aab_4418_9571_5c58daa50dee(ArrayList<Integer> lst) {
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        for (int num : lst) {
            sum += num;
            if (sum > maxSum) {
                maxSum = sum;
            }
        }
        return maxSum;
    }

    
    public static int skjkasdkd_Problem_7_642dacad_a83a_4264_a0ab_9fef3b1cba7a(ArrayList<Integer> lst) {
        int result = 0;
        int maxPrime = lst.get(0);
        int sum = 0;

        for(Integer num : lst) {
            for(int i = 2; i <= Math.sqrt(num); i++) {
                if(num % i == 0) {
                    return -1;
                }
            }
            for(int i = 2; i <= Math.sqrt(num); i++) {
                if(maxPrime % i == 0) {
                    maxPrime += i;
                }
            }
            if(maxPrime == num) {
                sum += num;
            }
            maxPrime = num;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_8_153fc4b8_cde9_47b4_83d4_df57395e50ac(ArrayList<Integer> lst) {
        int max = 0;
        int sum = 0;
        for (int i : lst) {
            sum += i;
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }

    
    public static int skjkasdkd_Problem_4_ec35fe8a_791a_4e5a_8cc2_97582dd2010d(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for(int i : lst) {
            if(i > max) {
                max = i;
            }
        }
        int sum = 0;
        while(max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_1_e443efe4_dbb5_4bbd_b823_23d9f265903f(ArrayList<Integer> lst) {

        return 0;
    }

    
    public static int skjkasdkd_Problem_3_523000d7_494a_4089_9fea_7273c22f408e(ArrayList<Integer> lst) {
        int max = 0;
        for(Integer i : lst) {
            if(i > max) {
                max = i;
            }
        }
        int sum = 0;
        while(max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_6_75eb4d5a_ff5d_473b_8360_1e87e4114349(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for (int i : lst) {
            if (i > max) {
                max = i;
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_6_bbf9083a_54bf_400a_9321_03b3fb0092e8(ArrayList<Integer> lst) {
        int largestPrime = 0;
        for (int prime : lst) {
            final int N = prime % 10;
            if (N > largestPrime) {
                largestPrime = N;
            }
        }
        return largestPrime;
    }

    
    public static int skjkasdkd_Problem_1_43bf8527_f44c_4659_9c56_a315c877e7ab(ArrayList<Integer> lst) {
        int max = 0;
        for (int i : lst) {
            if (i > max) {
                max = i;
            }
        }
        return max;

    }

    
    public static int skjkasdkd_Problem_0_70ac5832_db77_42bd_93e5_a02c5fd37cdb(ArrayList<Integer> lst) {

        int sum = 0;
        for (int l : lst) {
            if (l > 0) {
                sum += l;
            }
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_7_153fc4b8_cde9_47b4_83d4_df57395e50ac(ArrayList<Integer> lst) {
        int max = 0;
        int sum = 0;
        for (int i : lst) {
            sum += i;
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }

    
    public static int skjkasdkd_Problem_3_b486890a_0144_4b0a_ab51_1248016fb2c2(ArrayList<Integer> lst) {
        // Your code here
        return 0;
    }

    
    public static int skjkasdkd_Problem_1_a4bae279_c99a_4afe_a3f8_477ae2be0423(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for (int l : lst) {
            if (l > max) {
                max = l;
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_7_b56a78f6_fa10_465a_b8ca_54fc873fd7f8(ArrayList<Integer> lst) {
        int maxPrime = 0;
        int sum = 0;
        for (int prime : lst) {
            if (prime > maxPrime) {
                maxPrime = prime;
            }
        }
        for (int prime : lst) {
            if (prime == maxPrime) {
                sum += prime;
            }
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_2_fb835bea_2ca4_4386_9a92_1d2c20f618d2(ArrayList<Integer> lst) {
        int maxValue = 0;
        int sum = 0;
        for (int v : lst) {
            sum += v;
            maxValue = Math.max(maxValue, v);
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_5_b84806cc_df6b_4312_88aa_5900b34bb04f(ArrayList<Integer> lst) {

        int max = 0;
        for (Integer l : lst) {
            if (l > max) {
                max = l;
            }
        }
        int sum = 0;
        for (Integer l : lst) {
            if (l > max) {
                sum += l;
            }
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_2_1468b839_b6f7_43b4_ab88_a96eb16880f6(ArrayList<Integer> lst) {
        // Your code here
        return 0;

    }

    
    public static int skjkasdkd_Problem_6_ae9445c0_82ff_432b_af63_b45ccc17598e(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for (int i : lst) {
            if (i > max) {
                max = i;
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_6_1a46efdc_fa6d_435a_bb70_33576f461754(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for(int l : lst){
            if(l > max){
                max = l;
            }
        }
        int sum = 0;
        while(max > 0){
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_7_6c368ee2_4234_4ca7_b3e1_5b1cadc37b2f(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for (int i = 0; i < lst.size(); i++) {
            if (lst.get(i) > max) {
                max = lst.get(i);
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_0_a70bb8f6_16bd_4f4e_80ab_883a5822270e(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for (int l : lst) {
            if (l > max) {
                max = l;
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_7_18b1a156_47a0_4251_8e40_13633f758913(ArrayList<Integer> lst) {

        int max = 0;
        for (int l : lst) {
            if (l > max) {
                max = l;
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_3_4591f762_51cd_4613_909e_5c97f5dfbaf9(ArrayList<Integer> lst) {
        int maxPrime = 0;
        int sum = 0;
        for(int i : lst) {
            if(i>maxPrime) {
                maxPrime = i;
            }
            sum += i;
        }
        return sum;

    }

    
    public static int skjkasdkd_Problem_6_9667c74a_048d_4cd2_90cb_af3149d72195(ArrayList<Integer> lst) {

        int max = 0;
        for (int i : lst) {
            if (i > max) {
                max = i;
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_0_215cdce8_b552_4685_9a1a_9320c02941bb(ArrayList<Integer> lst) {
        Integer max = null;
        for (int num : lst) {
            if (num > 0) {
                boolean isPrime = True;
                for (int i = 2; i < num; i++) {
                    if (num % i == 0) {
                        isPrime = False;
                        break;
                    }
                }
                if (isPrime) {
                    if (max != null && max < num) {
                        max = num;
                    }
                }
            }
        }
        return max == null ? 0 : max;
    }

    
    public static int skjkasdkd_Problem_2_b46d7aba_274a_4b2a_88e1_63954600aada(ArrayList<Integer> lst) {
        int maxSum = Integer.MIN_VALUE;
        int maxSumDigit = 0;
        for (int l : lst) {
            int sumDigit = 0;
            int sum = 0;
            while (l > 0) {
                sumDigit += l % 10;
                l /= 10;
            }
            sum += sumDigit;
            if (sum > maxSum) {
                maxSum = sum;
                maxSumDigit = sumDigit;
            }
        }
        return maxSumDigit;
    }

    
    public static int skjkasdkd_Problem_3_43a94afa_4da8_40c6_8603_55bb02abd68b(ArrayList<Integer> lst) {

        // Write your code here
        return 0;
    }

    
    public static int skjkasdkd_Problem_3_440302f6_1556_4779_a34d_6da4faf3178f(ArrayList<Integer> lst) {
        if(lst==null || lst.size()<2) throw new IllegalArgumentException();
        int largest=lst.get(0);
        int largestNumber=2;
        int sum=0;
        for(int i=1;i<lst.size();i++) {
            int number=lst.get(i);
            if(i>1)
                sum+=number;
            else
                sum=number;
            if(largestNumber<number) {
                largest=number;
                largestNumber=number;
            }
            if(sum==number) {
                sum=0;
                largestNumber=number;
            }
        }
        for(int i=1;i<lst.size();i++)
            sum-=lst.get(i);
        largest+=sum;
        return largest;
    }

    
    public static int skjkasdkd_Problem_1_44300134_d3c8_44cd_94c9_db99046a30c6(ArrayList<Integer> lst) {
        int largestPrime = 0;
        int sumOfLargestPrimeDigits = 0;
        for (int i : lst) {
            if (new BigInteger(String.valueOf(i)).isProbablePrime(500)) {
                if (i > largestPrime) {
                    largestPrime = i;
                }
            }
        }
        for (int x : (new BigInteger(String.valueOf(largestPrime))).toByteArray()) {
            sumOfLargestPrimeDigits += x;
        }
        return sumOfLargestPrimeDigits;
    }

    
    public static int skjkasdkd_Problem_5_57de8c97_2e3f_40c4_9c0e_8f735004a51b(ArrayList<Integer> lst) {

        return 0;
    }

    
    public static int skjkasdkd_Problem_3_bc60b6cf_ef8b_4e27_a33d_7c0ce1ef7edf(ArrayList<Integer> lst) {

        int max = 0;
        for (int i : lst) {
            if (i > max) {
                max = i;
            }
        }
        int sum = 0;
        for (int i = 0; i < max; i++) {
            if (max % i == 0) {
                sum += i;
            }
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_1_f350ef8d_e0fb_46bc_87ce_e760cb2c4541(ArrayList<Integer> lst) {
        int max = 0;
        int sum = 0;
        for (int i : lst) {
            sum += i;
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }

    
    public static int skjkasdkd_Problem_4_0268c1ca_38a4_4fe7_ae3b_ffd8bedd4852(ArrayList<Integer> lst) {

        return 0;
    }

    
    public static int skjkasdkd_Problem_5_74b8c429_5daf_4bf9_800e_0e80bc0f4a63(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for (int i = 0; i < lst.size(); i++) {
            if (lst.get(i) > max) {
                max = lst.get(i);
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_5_68a646af_7c28_45c5_b366_d42053170366(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for (int i = 0; i < lst.size(); i++) {
            if (lst.get(i) > max) {
                max = lst.get(i);
            }
        }
        int maxPrime = 0;
        for (int i = 2; i <= max; i++) {
            if (max % i == 0) {
                maxPrime = i;
            }
        }
        int sum = 0;
        while (maxPrime > 0) {
            sum += maxPrime % 10;
            maxPrime /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_2_662d404f_5629_441e_80a1_1da13279215e(ArrayList<Integer> lst) {
        int largestPrimeNumber = 0;
        for (Integer number : lst) {
            // checking if the number is prime
            boolean isPrime = True;
            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    isPrime = False;
                    break;
                }
            }
            if (isPrime) {
                if (number > largestPrimeNumber) {
                    largestPrimeNumber = number;
                }
            }
        }
        int result = 0;
        while (largestPrimeNumber > 0) {
            result += largestPrimeNumber % 10;
            largestPrimeNumber /= 10;
        }
        return result;
    }

    
    public static int skjkasdkd_Problem_7_2356cb1c_2ff3_4ea8_90d9_eb8dbb6b4806(ArrayList<Integer> lst) {

        int max = 0;
        int sum = 0;
        for (Integer i : lst) {
            if (i > max) {
                max = i;
            }
            sum += i;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_4_9cb867fd_fa9b_4b8b_af7a_77160e253d95(ArrayList<Integer> lst) {
        int largestPrime = 0;
        int sum = 0;
        for (int value : lst) {
            if (value != 0 && value > largestPrime) {
                largestPrime = value;
            }
            if (value % 2 == 0) {
                for (int j = 3; j < value; j += 2) {
                    if (value % j == 0) {
                        break;
                    }
                }
            }
            if (value % 3 == 0) {
                for (int j = 5; j < value; j += 3) {
                    if (value % j == 0) {
                        break;
                    }
                }
            }
            sum -= value % 10;
            if (sum < 0) {
                sum = 0;
            }
        }
        return largestPrime;
    }

    
    public static int skjkasdkd_Problem_2_6a2b0b86_1624_4c1d_a23b_f108ad80b035(ArrayList<Integer> lst) {
        int sum = 0;
        for(Integer i : lst) {
            sum += i;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_2_1e1291fe_be75_4947_b6e2_ccc7d897dcaa(ArrayList<Integer> lst) {

        return lst.stream().mapToInteger(x -> x).max().getAsInteger();
    }

    
    public static int skjkasdkd_Problem_0_149e8576_d54a_4ffb_80bb_b53ca738beb7(ArrayList<Integer> lst) {

        return lst.stream().map(x -> x.toString()).map(x -> x.chars().map(y -> y - 48).sum()).max(Comparator.naturalOrder()).get();
    }

    
    public static int skjkasdkd_Problem_4_c808ed7f_998a_458e_b0ab_4eab5edfbf1f(ArrayList<Integer> lst) {
        // Your code here
        return 0;

    }

    
    public static int skjkasdkd_Problem_7_2ac57de2_f93e_4c3b_ab33_cf6f974ad3e8(ArrayList<Integer> lst) {
        int max = 0;
        for (Integer i : lst) {
            if (i > max) {
                max = i;
            }
        }
        int sum = 0;
        for (Integer i : lst) {
            sum += i;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_0_302418ea_ac20_422a_937a_5c04899697f8(ArrayList<Integer> lst) {
        int max = 0;
        int sum = 0;
        for (int l : lst) {
            sum += l;
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }

    
    public static int skjkasdkd_Problem_4_78b49388_8ceb_46d9_a939_05eb80f1c276(ArrayList<Integer> lst) {
        int maxPrime = 0;
        int cnt = 0;
        for (int i = 0; i < lst.size(); i++) {
            cnt++;
            int num = lst.get(i);
            boolean isPrime = True;
            for (int j = 2; j < num / 2; j++) {
                if (num % j == 0) {
                    isPrime = False;
                    break;
                }
            }
            if (isPrime) {
                maxPrime += num;
            }
        }
        return maxPrime + (cnt > 0 ? cnt : 0);
    }

    
    public static int skjkasdkd_Problem_5_88924cf7_cfb7_4703_b172_40b9a0d9df18(ArrayList<Integer> lst) {
        int largestPrimeSum = 0;
        int largestPrime = lst.get(0);
        int largestPrimeCount = 0;
        boolean largestPrimeFound = False;
        for (Integer prime : lst) {
            if (prime > largestPrime) {
                largestPrimeSum = prime - largestPrime;
                largestPrime = prime;
                largestPrimeCount = 1;
            } else if (prime == largestPrime) {
                largestPrimeCount++;
            }
        }
        if (largestPrimeFound) {
            largestPrimeSum = largestPrime - largestPrime;
        }
        return largestPrimeSum;
    }

    
    public static int skjkasdkd_Problem_8_19bc1d33_9ddd_4a84_968b_d825e1379feb(ArrayList<Integer> lst) {

        int max = 0;
        for(Integer l : lst) {
            if(l > max) {
                max = l;
            }
        }
        int sum = 0;
        for(Integer l : lst) {
            if(l > max) {
                sum += l;
            }
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_7_54ad14d9_2527_435f_8aaa_d1aeffeb7d2c(ArrayList<Integer> lst) {
        int max = 0;
        int sum = 0;
        for (int i : lst) {
            sum += i;
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }

    
    public static int skjkasdkd_Problem_3_805a243e_6c21_4c46_8b7b_c4ff76e08f21(ArrayList<Integer> lst) {
        int max = 0;
        int sum = 0;
        for (int i : lst) {
            sum += i;
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }

    
    public static int skjkasdkd_Problem_4_0bc1ee70_f919_4bf4_be12_b1c3d25e21ab(ArrayList<Integer> lst) {

        int max = 0;
        for (Integer l : lst) {
            if (l > max) {
                max = l;
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_0_f8cd7f45_1be2_47b3_8c98_991b6456add3(ArrayList<Integer> lst) {
        if(lst.isEmpty()) return 0;
        final int N = lst.size();
        
        int max = Integer.MIN_VALUE;
        int sum = 0;
        
        for (int i = 0; i < N; i++) {
            final int num = lst.get(i);
            if (num > max) {
                max = num;
                sum = 0;
            }
            
            if (num % 2 == 0) {
                sum += 1;
            }
        }
        
        return sum;
    }

    
    public static int skjkasdkd_Problem_8_d2349619_57bb_4429_97bd_09ad57ea3a4d(ArrayList<Integer> lst) {
        int max = 0;
        int sum = 0;
        for(int i : lst) {
            if(i>0) {
                int temp = i;
                while(temp>0) {
                    if(temp%10==0) {
                        break;
                    }
                    temp/=10;
                }
                if(temp>0) {
                    sum += temp;
                }
            }
        }
        max = sum;
        return max;

    }

    
    public static int skjkasdkd_Problem_6_19c8d3b6_464a_457b_9fe1_494a6bbe5c40(ArrayList<Integer> lst) {
        int largestPrime = 0;
        int sum = 0;
        for(int i : lst) {
            if(i>largestPrime) {
                largestPrime = i;
            }
        }
        for(int i : lst) {
            sum += i;
        }
        return sum;

    }

    
    public static int skjkasdkd_Problem_2_5ebb660d_5585_4810_9e33_8bfae8a9df71(ArrayList<Integer> lst) {

        int sum = 0;
        for (int l : lst) {
            sum += l;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_8_444dc38c_0ffa_484e_a3be_10cb04adf0a6(ArrayList<Integer> lst) {

        // Write your code here
        return 0;
    }

    
    public static int skjkasdkd_Problem_3_85ff8f17_5bb0_4cba_b315_ed3ff7a55b68(ArrayList<Integer> lst) {

        int max = 0;
        for (int i : lst) {
            if (i > max) {
                max = i;
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_5_75f2d89c_ae02_4c0c_a597_0fb482e40081(ArrayList<Integer> lst) {
        int max = 0;
        int sum = 0;
        for (int i : lst) {
            sum += i;
            if (sum > max) {
                max = sum;
            }
        }
        return max;

    }

    
    public static int skjkasdkd_Problem_7_4cf6714b_5bfc_44c3_8dc5_81bd1dfbd170(ArrayList<Integer> lst) {

        return 0;
    }

    
    public static int skjkasdkd_Problem_0_1eacdc5d_97ae_42b6_ba48_0d41e2ea6cb4(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for (int i = 0; i < lst.size(); i++) {
            if (lst.get(i) > max) {
                max = lst.get(i);
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_8_cbf22960_1f36_4e39_8d2f_fe29aa408093(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for(int i : lst){
            if(i > max){
                max = i;
            }
        }
        int sum = 0;
        while(max > 0){
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_6_26461222_01a1_4d73_8893_127d2f89c99e(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for(int i : lst){
            if(i > max){
                max = i;
            }
        }
        int sum = 0;
        while(max > 0){
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_8_e4db686d_0994_43a1_b8be_cf1ccfc6b372(ArrayList<Integer> lst) {
        int maxPrime = 0;
        int sum = 0;
        int prime = 0;
        for (int i : lst) {
            prime = i;
            while (prime > 1) {
                if (prime % 2 == 0) {
                    prime = prime / 2;
                } else {
                    prime = 3 * prime + 1;
                }
            }
            if (prime > maxPrime) {
                maxPrime = prime;
                sum = i;
            }
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_7_d310250f_c452_4da8_83ec_8817330f7e90(ArrayList<Integer> lst) {
        int maxSum = 0;
        int sum = 0;
        int maxPrime = 0;
        int prime = 0;
        int sumOfDigits = 0;
        for(int i : lst) {
            sum += i;
            sumOfDigits += i;
        }
        for(int i : lst) {
            prime = i;
            while(prime > 1) {
                if(prime % 2 == 0) {
                    prime = prime / 2;
                } else {
                    prime = prime * 3;
                }
            }
            if(prime > maxPrime) {
                maxPrime = prime;
            }
        }
        for(int i : lst) {
            sum += i;
            sumOfDigits += i;
        }
        for(int i : lst) {
            if(sumOfDigits % maxPrime == 0) {
                maxSum = sum;
            }
        }
        return maxSum;

    }

    
    public static int skjkasdkd_Problem_8_923c10b6_4915_4cd0_b263_3a200f050b7b(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for (int i : lst) {
            if (i > max) {
                max = i;
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_2_4da3ddd5_0fed_4113_800c_36ca2504f2fe(ArrayList<Integer> lst) {

        return lst.stream().filter(x -> {
            if (x == 0) {
                return False;
            }
            for (int i = 2; i < x; i++) {
                if (x % i == 0) {
                    return False;
                }
            }
            return True;
        }).mapToInteger(x -> x).sum();
    }

    
    public static int skjkasdkd_Problem_2_984026c9_dd70_4f31_9802_cc32c21d556e(ArrayList<Integer> lst) {
        int max = 0;
        int sum = 0;
        for(int i : lst) {
            if(i>0) {
                sum += i;
                if(i>max) {
                    max = i;
                }
            }
        }
        return sum;

    }

    
    public static int skjkasdkd_Problem_0_d82ea4ae_ae78_4758_98c3_e62faa8e1245(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for (int i : lst) {
            if (i > max) {
                max = i;
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_5_cfdd5559_687b_4fa5_93ca_7289caef9f54(ArrayList<Integer> lst) {
        int maxPrime = 0;
        int sum = 0;
        for(int i : lst) {
            if(i%2 == 0) {
                maxPrime = i;
            }
            if(i%2 == 1) {
                int prime = i;
                while(prime != 1) {
                    if(prime % 2 == 0) {
                        prime = prime/2;
                    } else {
                        prime = 3*prime+1;
                    }
                }
                if(prime > maxPrime) {
                    maxPrime = prime;
                }
            }
        }
        for(int i : lst) {
            sum += i;
        }
        return sum;

    }

    
    public static int skjkasdkd_Problem_4_a0f4f9ff_0f0c_49aa_ab55_f2ce32fb51d8(ArrayList<Integer> lst) {

        int sum = 0;
        for (int l : lst) {
            sum += l;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_8_5ebb660d_5585_4810_9e33_8bfae8a9df71(ArrayList<Integer> lst) {

        int sum = 0;
        for (int l : lst) {
            sum += l;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_0_98390561_3b12_49c1_ad23_baf8f5550983(ArrayList<Integer> lst) {
        int maxPrime = 0;
        int sum = 0;
        for(int i : lst) {
            if(i>maxPrime) {
                maxPrime = i;
            }
            sum += i;
        }
        return sum;

    }

    
    public static int skjkasdkd_Problem_4_3d1c4ed8_1b61_47cb_981a_c637ddbd7073(ArrayList<Integer> lst) {
        int largestPrime = 0;
        int sumOfDigits = 0;
        for (int i : lst) {
            largestPrime = i;
            sumOfDigits += i;
        }
        return sumOfDigits + largestPrime;
    }

    
    public static int skjkasdkd_Problem_3_f7130975_7670_4aa9_9b1a_ce107f7e0f44(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for (Integer l : lst) {
            if (l > max) {
                max = l;
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_1_4cf6714b_5bfc_44c3_8dc5_81bd1dfbd170(ArrayList<Integer> lst) {

        return 0;
    }

    
    public static int skjkasdkd_Problem_3_1d4b400d_76e7_4572_a8c0_2d7a80eb8f57(ArrayList<Integer> lst) {
        int maxSum = 0, sum = 0;
        for (Integer l : lst) {
            sum += l.intValue();
            if (sum > maxSum) {
                maxSum = sum;
            }
        }
        return maxSum;
    }

    
    public static int skjkasdkd_Problem_6_07a1685c_eee0_478f_b73c_3b0a07d80116(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for(int i : lst){
            if(i > max){
                max = i;
            }
        }
        int sum = 0;
        while(max > 0){
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_2_fd6c99a8_c231_41ac_9bd5_cf049e36b8b2(ArrayList<Integer> lst) {
        int maxPrime = 0;
        int sum = 0;
        for(int i : lst) {
            if(i>maxPrime) {
                maxPrime = i;
            }
            sum += i;
        }
        return sum;

    }

    
    public static int skjkasdkd_Problem_0_ca39f108_6e4c_4a0d_b6a2_be8b98518da5(ArrayList<Integer> lst) {

        int max = 0;
        for (Integer l : lst) {
            if (l > max) {
                max = l;
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_6_5403f3de_e7ec_4ec6_8390_789bb00631bd(ArrayList<Integer> lst) {

        // Write your code here
        int sum = 0;
        for (int l : lst) {
            sum += l;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_6_2747f1c7_54f7_4866_80ab_0727632ed886(ArrayList<Integer> lst) {
        // Your code here.
        return 0;
    }

    
    public static int skjkasdkd_Problem_8_196a1d53_bc1f_4852_80bb_91b7fb42ae8e(ArrayList<Integer> lst) {

        int sum = 0;
        for (int l : lst) {
            sum += l;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_1_91af3356_80ae_4041_8fed_4b26a879d35a(ArrayList<Integer> lst) {
        int max = 0;
        for (int i : lst) {
            if (i > max) {
                max = i;
            }
        }
        int maxPrime = 0;
        for (int i = 2; i <= max; i++) {
            boolean isPrime = True;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = False;
                    break;
                }
            }
            if (isPrime) {
                maxPrime = i;
            }
        }
        int sum = 0;
        while (maxPrime > 0) {
            sum += maxPrime % 10;
            maxPrime /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_3_c31af565_4548_4258_aee1_64612f555429(ArrayList<Integer> lst) {
        int maxPrime = 0;
        int sum = 0;
        for (int i : lst) {
            int prime = i;
            while (prime > 1) {
                int nextPrime = prime + 1;
                while (nextPrime < i) {
                    nextPrime += prime;
                }
                if (nextPrime > maxPrime) {
                    maxPrime = nextPrime;
                }
                prime = nextPrime;
            }
            sum += i;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_6_6b404ec0_4778_45f6_982e_7253ac39c636(ArrayList<Integer> lst) {

        int max = 0;
        for (int l : lst) {
            if (l > max) {
                max = l;
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_7_cb1838bc_5871_495d_a913_456660763451(ArrayList<Integer> lst) {
        int maxPrime = 0;
        int sum = 0;
        int prime = 0;
        for (int i : lst) {
            prime = i;
            while (prime > 1) {
                if (prime % 2 == 0) {
                    prime = prime / 2;
                } else {
                    prime = 3 * prime + 1;
                }
            }
            if (prime > maxPrime) {
                maxPrime = prime;
                sum = i;
            }
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_3_bfef38de_b42f_4c4e_8a89_32d8f6006a73(ArrayList<Integer> lst) {
        // Your code here
        return 0;

    }

    
    public static int skjkasdkd_Problem_6_f9b12f12_77be_4e13_b39a_e65e3829ed6f(ArrayList<Integer> lst) {
        int max = 0;
        int sum = 0;
        int sumOfDigits = 0;
        for(Integer i : lst) {
            sum += i;
            sumOfDigits += i;
        }
        max = Math.max(sum, sumOfDigits);
        for(Integer i : lst) {
            sum += i;
            sumOfDigits += i;
            if(sumOfDigits > max) {
                max = sumOfDigits;
            }
        }
        return max;

    }

    
    public static int skjkasdkd_Problem_0_962aa2b5_6f6a_4d11_b840_e56f810615c3(ArrayList<Integer> lst) {
        Set<Integer> primes = new HashSet<>();
        int largestPrime = -1;
        int sumOfDigits = 0;

        Collections.sort(lst);

        for (int value : lst) {
            sumOfDigits += value;
        }

        for (int value : lst) {
            if (value % 2 != 0) {
                continue;
            }

            boolean isPrime = True;
            for (int prime : primes) {
                if (value % prime == 0) {
                    isPrime = False;
                    break;
                }
            }

            if (isPrime) {
                primes.add(value);
                if (value == largestPrime) {
                    largestPrime = value;
                }
            }
        }

        if (primes.isEmpty()) {
            return 0;
        }

        return largestPrime + (sumOfDigits % primes.size());
    }

    
    public static int skjkasdkd_Problem_6_97109781_53d2_49f0_85a2_a0e3619fdc7d(ArrayList<Integer> lst) {

        return 0;
    }

    
    public static int skjkasdkd_Problem_6_065261d4_636d_418d_bc09_6a45cc169ec7(ArrayList<Integer> lst) {
        int max = 0;
        for (int l : lst) {
            max = Math.max(max, l);
        }
        int sum = 0;
        for (int l : lst) {
            sum += l;
        }
        return sum + max;
    }

    
    public static int skjkasdkd_Problem_7_f064d27a_d4ff_489b_b946_7738506161a3(ArrayList<Integer> lst) {

        int max = 0;
        for (int l : lst) {
            if (l > max) {
                max = l;
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_3_9efedb71_9e64_4299_8cb7_e09986f5d8dc(ArrayList<Integer> lst) {

        return lst.stream().map(i -> i.toString()).map(i -> i.chars().map(j -> j - '0').sum()).max(Comparator.naturalOrder()).get();
    }

    
    public static int skjkasdkd_Problem_2_9ced51c0_f91d_4bff_8d36_0cfd9d64a0d1(ArrayList<Integer> lst) {

        int max = 0;
        for (int i : lst) {
            if (i > max) {
                max = i;
            }
        }
        int sum = 0;
        for (int i = max; i > 0; i--) {
            if (max % i == 0) {
                sum += i;
            }
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_5_4e6deb13_d395_4629_be22_cef275cfc3a5(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for (int i : lst) {
            if (i > max) {
                max = i;
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_1_b7a3231e_b4f3_4d42_9871_8b453b5709c8(ArrayList<Integer> lst) {
        // initialize max and min values
        int max = 0;
        int min = Integer.MAX_VALUE;
        // traverse the list of integers
        for(Integer i : lst) {
            // check if i is greater than max or smaller than min
            if(i.compareTo(max) < 0 || i.compareTo(min) > 0) {
                // update the max and min values
                max = i;
                min = i;
            }
            
            // check if i is a factor
            for(int j : lst) {
                if(j == i) // i is a factor of j
                    continue;
                
                if(i % j == 0) // i is not a factor of j
                    max = i;
                
                // if i is not a factor of j
                min = i;
            }
        }
        // return the sum of the digits of (max - min)
        return Integer.parseInteger(String.valueOf(max-min));
    }

    
    public static int skjkasdkd_Problem_0_9b51df1b_abfa_4be1_b411_78d0bf043186(ArrayList<Integer> lst) {

        return lst.stream().mapToInteger(x -> x).max().getAsInteger();
    }

    
    public static int skjkasdkd_Problem_0_85ff8f17_5bb0_4cba_b315_ed3ff7a55b68(ArrayList<Integer> lst) {

        int max = 0;
        for (int i : lst) {
            if (i > max) {
                max = i;
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_5_92e4e53a_9e7f_4750_8814_fb9846746aad(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for (int l : lst) {
            if (l > max) {
                max = l;
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_7_16ad2c20_8b62_4af6_b480_39a080aa444e(ArrayList<Integer> lst) {

        // Fill this in.
        int sum = 0;
        for (int l : lst) {
            sum += l;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_8_a52d8b66_6a84_48ee_93cd_2166a5efe8d9(ArrayList<Integer> lst) {

        // Write your code here
        return 0;
    }

    
    public static int skjkasdkd_Problem_6_99d936fb_f562_4b99_ba77_2819e1c6b908(ArrayList<Integer> lst) {

        int max = 0;
        for (int i : lst) {
            if (i > max) {
                max = i;
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_0_8412ef25_7f84_4ead_b32e_bf06e9af4ff3(ArrayList<Integer> lst) {

        int max = 0;
        for (int i : lst) {
            if (i > max) {
                max = i;
            }
        }
        int sum = 0;
        while (max > 0) {
            int temp = max % 10;
            sum += temp;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_8_75f2d89c_ae02_4c0c_a597_0fb482e40081(ArrayList<Integer> lst) {
        int max = 0;
        int sum = 0;
        for (int i : lst) {
            sum += i;
            if (sum > max) {
                max = sum;
            }
        }
        return max;

    }

    
    public static int skjkasdkd_Problem_5_1a46efdc_fa6d_435a_bb70_33576f461754(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for(int l : lst){
            if(l > max){
                max = l;
            }
        }
        int sum = 0;
        while(max > 0){
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_4_6339f60c_6e2f_4864_b5ec_50d2ca4f947b(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for(int l : lst) {
            if(l > max) {
                max = l;
            }
        }
        int sum = 0;
        while(max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_3_69123330_9637_47f3_91cd_ced085feccea(ArrayList<Integer> lst) {

        int max = 0;
        for (int i : lst) {
            if (i > max) {
                max = i;
            }
        }
        int count = 0;
        while (max > 0) {
            if (max % 10 == 2 || max % 10 == 3 || max % 10 == 5 || max % 10 == 7) {
                count += 1;
            }
            max /= 10;
        }
        return count;
    }

    
    public static int skjkasdkd_Problem_1_8cebe18c_45ae_4b4b_83e3_fe37a3d0ac04(ArrayList<Integer> lst) {

        int max = 0;
        for (Integer i : lst) {
            if (i > max) {
                max = i;
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_7_eff99623_ef97_4c49_b77b_45696a531a7a(ArrayList<Integer> lst) {

        int max = 0;
        for (int i : lst) {
            if (i > max) {
                max = i;
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_3_1ebe353d_a787_48ed_87c4_bfcd51d98dc6(ArrayList<Integer> lst) {
        int maxSum = 0;
        int maxSumDigit = 0;
        int sum = 0;
        int sumDigit = 0;
        for (int i : lst) {
            sum += i;
            sumDigit += i;
            if (sumDigit > maxSumDigit) {
                maxSumDigit = sumDigit;
                maxSum = sum;
            }
        }
        return maxSum;

    }

    
    public static int skjkasdkd_Problem_4_f698537d_a20e_4998_92ea_abc5d85b2ae2(ArrayList<Integer> lst) {

        int sum = 0;
        for (Integer l : lst) {
            sum += l;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_8_c3b23dd8_30be_4892_9eae_d0d13e00577a(ArrayList<Integer> lst) {
        int max = lst.get(0);
        int sum = 0;
        for (Integer item : lst) {
            if (item > max) {
                max = item;
            }
        }
        for (Integer item : lst) {
            if (item == max) {
                sum += item.intValue();
            }
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_7_c4a3bf5e_e15e_4a65_b4f7_e2ba10362672(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for (int i : lst) {
            if (i > max) {
                max = i;
            }
        }
        int count = 0;
        while (max > 0) {
            count += max % 10;
            max /= 10;
        }
        return count;
    }

    
    public static int skjkasdkd_Problem_1_c652599f_31fc_4870_8ac7_8b507553cdfd(ArrayList<Integer> lst) {
        int max = 0, sum = 0;
        for (int l : lst) {
            if (l > max) {
                max = l;
                sum = sum + max - l;
            }
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_1_cd2b7159_1a08_4592_8059_aa8f53071f68(ArrayList<Integer> lst) {

        int max = 0;
        for (int i : lst) {
            if (i > max) {
                max = i;
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_0_70515e08_1592_42a9_9b64_45ace417c4bf(ArrayList<Integer> lst) {

        return lst.stream().filter(x -> {
            for (int i = 2; i < x; i++) {
                if (x % i == 0) {
                    return False;
                }
            }
            return True;
        }).mapToInteger(x -> x).sum();
    }

    
    public static int skjkasdkd_Problem_1_33c11237_93f7_4a37_98af_fb374cbe8fb0(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for(int i : lst){
            if(i > max){
                max = i;
            }
        }
        int sum = 0;
        while(max > 0){
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_3_79601e7b_dc05_476a_9190_23a90dabe7f8(ArrayList<Integer> lst) {
        int max = 0, sum = 0;
        int n = lst.get(0);
        boolean prime = False;
        int m = n + 1;
        for(int i = 1; i < lst.size(); i++) {
            m = lst.get(i);
            if (m > n)
                prime = True;
            sum += Math.abs(m - n);
        }
        if (prime)
            max = sum;
        else
            max = n;
        return max;
    }

    
    public static int skjkasdkd_Problem_8_1eacdc5d_97ae_42b6_ba48_0d41e2ea6cb4(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for (int i = 0; i < lst.size(); i++) {
            if (lst.get(i) > max) {
                max = lst.get(i);
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_8_eff99623_ef97_4c49_b77b_45696a531a7a(ArrayList<Integer> lst) {

        int max = 0;
        for (int i : lst) {
            if (i > max) {
                max = i;
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_0_45ad6077_8af3_4226_9f56_a0646d709a96(ArrayList<Integer> lst) {
        int max = 0;
        int sum = 0;
        for (int l : lst) {
            sum += l;
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }

    
    public static int skjkasdkd_Problem_1_8208fbe8_6097_463e_a09f_9d72b613314c(ArrayList<Integer> lst) {
        int max = 0;
        int sum = 0;
        for (int i : lst) {
            sum += i;
            if (sum > max) {
                max = sum;
            }
        }
        return max;

    }

    
    public static int skjkasdkd_Problem_0_90e0a473_9f4e_4f3d_b83d_03df6cb87575(ArrayList<Integer> lst) {
        // Your code here
        return 0;
    }

    
    public static int skjkasdkd_Problem_6_94e52668_8ee8_4784_a1d1_3face6d4ccc5(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for (int i : lst) {
            if (i > max) {
                max = i;
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_8_000c2cfd_819a_4593_ba81_6976d9af0922(ArrayList<Integer> lst) {
        int max = 0;
        int sum = 0;
        for (Integer i : lst) {
            sum += i;
            if (sum > max) {
                max = sum;
            }
        }
        return max;

    }

    
    public static int skjkasdkd_Problem_3_07999c87_44af_4958_9e19_e6fa8f1ba6de(ArrayList<Integer> lst) {

        return lst.stream().mapToInteger(Integer::intValue).filter(i -> i > 1).max().orElse(0);
    }

    
    public static int skjkasdkd_Problem_6_c63eea46_56b2_47a4_b227_1a3d59422ebc(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for (int i : lst) {
            if (i > max) {
                max = i;
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_0_4c03a897_5553_4535_b7a7_100c3f4afa60(ArrayList<Integer> lst) {
        return lst.stream()
                .filter((e) -> e % 2 == 0 || e % 3 == 0)
                .filter((e) -> e < 2)
                .mapToInteger((e) -> e).sum();
    }

    
    public static int skjkasdkd_Problem_0_acdb6c29_3e94_42d4_95fe_3453afbe864a(ArrayList<Integer> lst) {

        int max = 0;
        for (Integer i : lst) {
            if (i > max) {
                max = i;
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_1_ef1a9fea_a299_4afb_9c8b_3c1f0cdf8b6a(ArrayList<Integer> lst) {
        int maxPrime = 0;
        int sum = 0;
        for (Integer i : lst) {
            sum += i;
            if (sum > maxPrime) {
                maxPrime = sum;
            }
        }
        return maxPrime;
    }

    
    public static int skjkasdkd_Problem_6_daeadc41_0cab_47a4_9fa8_370f0110c69c(ArrayList<Integer> lst) {
        int maxSum = lst.get(0);
        int sum = 0;
        for (int i : lst) {
            sum += i;
            if (sum > maxSum) {
                maxSum = sum;
            }
        }
        return maxSum;
    }

    
    public static int skjkasdkd_Problem_8_3a6176c3_d781_44d7_b15f_6a85701399c2(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for (int l : lst) {
            if (l > max) {
                max = l;
            }
        }
        int count = 0;
        while (max > 0) {
            count += max % 10;
            max /= 10;
        }
        return count;
    }

    
    public static int skjkasdkd_Problem_3_6a61ff6a_6f01_465e_ad8b_70406133af6e(ArrayList<Integer> lst) {
        int maxPrime = 0;
        int sum = 0;
        int prime = 0;
        int primeSum = 0;
        boolean isPrime = True;
        int temp = 0;
        for (int i : lst) {
            if (isPrime) {
                prime = i;
                primeSum = i;
                isPrime = False;
            }
            if (i % prime == 0) {
                isPrime = True;
                primeSum += i;
            }
            if (primeSum > maxPrime) {
                maxPrime = primeSum;
                sum = primeSum;
            }
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_8_26b49788_8d9a_4cc7_bfea_e56e42b7a9c2(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for (int i : lst) {
            if (i > max) {
                max = i;
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_1_69123330_9637_47f3_91cd_ced085feccea(ArrayList<Integer> lst) {

        int max = 0;
        for (int i : lst) {
            if (i > max) {
                max = i;
            }
        }
        int count = 0;
        while (max > 0) {
            if (max % 10 == 2 || max % 10 == 3 || max % 10 == 5 || max % 10 == 7) {
                count += 1;
            }
            max /= 10;
        }
        return count;
    }

    
    public static int skjkasdkd_Problem_5_a428e703_2072_4ae6_a425_2b6c0a676290(ArrayList<Integer> lst) {
        int max = 0;
        for (Integer i : lst) {
            if (i > max) {
                max = i;
            }
        }
        int sum = 0;
        for (Integer i : lst) {
            sum += i;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_3_0fad42ed_871a_4dc3_a925_c7c48e5b8361(ArrayList<Integer> lst) {
        int max = 0;
        int sum = 0;
        for (int i : lst) {
            sum += i;
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }

    
    public static int skjkasdkd_Problem_2_f6313606_270d_424a_a949_f7d0940cdb29(ArrayList<Integer> lst) {
        List<Integer> newLst = new ArrayList<>(lst);
        int maxSum = Integer.MIN_VALUE;
        int maxSumDigit = 0;
        for (Integer i : newLst) {
            if (i % 10 == 1) {
                maxSumDigit += i;
            }
            if (i % 10 != 1 && i % 10 != 2) {
                maxSumDigit += i;
                if (maxSumDigit > maxSum) {
                    maxSum = maxSumDigit;
                }
                maxSumDigit = 0;
            }
        }
        return maxSum;
    }

    
    public static int skjkasdkd_Problem_8_f3ace76c_4e9f_47c0_acf6_76df7d30165f(ArrayList<Integer> lst) {

        int sum = 0;
        for (int l : lst) {
            sum += l;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_5_a0f4f9ff_0f0c_49aa_ab55_f2ce32fb51d8(ArrayList<Integer> lst) {

        int sum = 0;
        for (int l : lst) {
            sum += l;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_5_f1209aa8_eba4_4c29_b6e3_a20ecfb562ee(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for (int i : lst) {
            if (i > max) {
                max = i;
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_6_c509089d_3be7_407f_86fe_4e3f74a075a4(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for(int i : lst){
            if(i > max){
                max = i;
            }
        }
        int sum = 0;
        while(max > 0){
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_4_794b0158_d9be_4548_84fb_ee200bf27a61(ArrayList<Integer> lst) {

        return 0;
    }

    
    public static int skjkasdkd_Problem_4_5ebbee7f_7c8e_4be3_8a08_5b6cb26c3203(ArrayList<Integer> lst) {
        int max = 0;
        for (Integer i : lst) {
            if (i > max) {
                max = i;
            }
        }
        int sum = 0;
        for (Integer i : lst) {
            sum += (i % 10);
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_8_acdb6c29_3e94_42d4_95fe_3453afbe864a(ArrayList<Integer> lst) {

        int max = 0;
        for (Integer i : lst) {
            if (i > max) {
                max = i;
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_6_8208fbe8_6097_463e_a09f_9d72b613314c(ArrayList<Integer> lst) {
        int max = 0;
        int sum = 0;
        for (int i : lst) {
            sum += i;
            if (sum > max) {
                max = sum;
            }
        }
        return max;

    }

    
    public static int skjkasdkd_Problem_8_7ee5bc9c_f2c3_4974_a302_f5405e46d81a(ArrayList<Integer> lst) {

        int max = 0;
        for (int i : lst) {
            if (i > max) {
                max = i;
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_5_3a6176c3_d781_44d7_b15f_6a85701399c2(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for (int l : lst) {
            if (l > max) {
                max = l;
            }
        }
        int count = 0;
        while (max > 0) {
            count += max % 10;
            max /= 10;
        }
        return count;
    }

    
    public static int skjkasdkd_Problem_0_c4a3bf5e_e15e_4a65_b4f7_e2ba10362672(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for (int i : lst) {
            if (i > max) {
                max = i;
            }
        }
        int count = 0;
        while (max > 0) {
            count += max % 10;
            max /= 10;
        }
        return count;
    }

    
    public static int skjkasdkd_Problem_1_1d4b400d_76e7_4572_a8c0_2d7a80eb8f57(ArrayList<Integer> lst) {
        int maxSum = 0, sum = 0;
        for (Integer l : lst) {
            sum += l.intValue();
            if (sum > maxSum) {
                maxSum = sum;
            }
        }
        return maxSum;
    }

    
    public static int skjkasdkd_Problem_2_57f9f2ee_eb53_489f_b17d_15b28b508a08(ArrayList<Integer> lst) {
        int max = 0;
        int sum = 0;
        for (Integer l : lst) {
            if (l.intValue() > max) {
                max = l.intValue();
            }
            if (l.intValue() == max) {
                sum += l.intValue();
            }
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_7_bac790e8_fc30_4754_9aaf_fd9af54bdc8e(ArrayList<Integer> lst) {
        int max = 0;
        int sum = 0;
        for (int i : lst) {
            sum += i;
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }

    
    public static int skjkasdkd_Problem_3_f3d88bdb_f73d_49fb_877c_924b533a8a6e(ArrayList<Integer> lst) {
        int max = 0;
        int sum = 0;
        for (Integer i : lst) {
            sum += i;
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }

    
    public static int skjkasdkd_Problem_0_2ac57de2_f93e_4c3b_ab33_cf6f974ad3e8(ArrayList<Integer> lst) {
        int max = 0;
        for (Integer i : lst) {
            if (i > max) {
                max = i;
            }
        }
        int sum = 0;
        for (Integer i : lst) {
            sum += i;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_0_8f6e2aea_9da2_45f2_b2fa_253e02ae5f07(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for (int i = 0; i < lst.size(); i++) {
            if (lst.get(i) > max) {
                max = lst.get(i);
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_3_f8cd7f45_1be2_47b3_8c98_991b6456add3(ArrayList<Integer> lst) {
        if(lst.isEmpty()) return 0;
        final int N = lst.size();
        
        int max = Integer.MIN_VALUE;
        int sum = 0;
        
        for (int i = 0; i < N; i++) {
            final int num = lst.get(i);
            if (num > max) {
                max = num;
                sum = 0;
            }
            
            if (num % 2 == 0) {
                sum += 1;
            }
        }
        
        return sum;
    }

    
    public static int skjkasdkd_Problem_4_9ea546dc_e9fc_4858_b941_70ea39f3b2ac(ArrayList<Integer> lst) {
        int biggestPrime = lst.get(0);
        for (int prime : lst) {
            if (prime > biggestPrime) {
                biggestPrime = prime;
            }
        }

        // we now have a prime number in the biggestPrime variable.
        // let's find the sum of its digits.
        int sum = 0;
        for (int prime : lst) {
            if (prime > biggestPrime) {
                break;
            }
            sum += prime % 10;
            prime /= 10;
        }
        // print the result
        System.out.println("(" + sum + ")");

        return sum;
    }

    
    public static int skjkasdkd_Problem_1_a31550d6_e011_4ecb_8a9c_3a53d949aa58(ArrayList<Integer> lst) {

        int sum = 0;
        for (int l : lst) {
            if (l > 0) {
                sum += l;
            }
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_0_9511341f_3482_46f5_95b6_4060c04fed7b(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for(int i = 0; i < lst.size(); i++){
            if(lst.get(i) > max){
                max = lst.get(i);
            }
        }
        int sum = 0;
        while(max > 0){
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_3_0a8b2ae7_d59c_40f3_937e_470653b2e2db(ArrayList<Integer> lst) {
        // Your code goes here
        return 0;

    }

    
    public static int skjkasdkd_Problem_6_c1c740da_c0fa_423f_b2b3_f0e5a6ab0526(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for (int i = 0; i < lst.size(); i++) {
            if (lst.get(i) > max) {
                max = lst.get(i);
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_2_132d47f6_4c47_4f10_b5bf_7a9b614d24cf(ArrayList<Integer> lst) {
        int max = 0;
        int sum = 0;
        for (int i : lst) {
            sum += i;
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }

    
    public static int skjkasdkd_Problem_4_6b233497_89aa_4b1d_8698_12d18ded3a35(ArrayList<Integer> lst) {
        int largestPrime = 0;
        int sumOfDigits = 0;
        for (int i : lst) {
            sumOfDigits += i;
            if (sumOfDigits > largestPrime) {
                largestPrime = sumOfDigits;
            }
        }
        return largestPrime;

    }

    
    public static int skjkasdkd_Problem_6_20be2349_4a08_4dea_ba06_183071e5d7d4(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for (int l : lst) {
            if (l > max) {
                max = l;
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_7_69c4bf4c_1b81_4438_8d1a_9e5ce12b26ff(ArrayList<Integer> lst) {
        // Write your code here
        return 0;

    }

    
    public static int skjkasdkd_Problem_8_4851ccb4_9863_4167_9a27_d163617d7470(ArrayList<Integer> lst) {

        int sum = 0;
        for (int l : lst) {
            sum += l;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_4_52e41190_ea2e_447c_9195_d413e05e87f4(ArrayList<Integer> lst) {

        int ans = 0;
        for (int x : lst) {
            ans += x;
        }
        return ans;
    }

    
    public static int skjkasdkd_Problem_8_2d9344c1_59bf_463d_aa80_b77d1b53d12d(ArrayList<Integer> lst) {
        int max = 0;
        int sum = 0;
        for(int i : lst) {
            if(i>max) {
                max = i;
            }
            sum += i;
        }
        return sum;

    }

    
    public static int skjkasdkd_Problem_2_507f498b_547f_432d_a97f_fc6afa337afe(ArrayList<Integer> lst) {

        int max = 0;
        for (int i : lst) {
            if (i > max) {
                max = i;
            }
        }
        int sum = 0;
        for (int i = max; i > 0; i--) {
            if (max % i == 0) {
                sum += i;
            }
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_0_7db4b225_8772_4816_be4d_cd0f568e6ad8(ArrayList<Integer> lst) {
        int maxPrime = 0;
        int sum = 0;
        for(Integer l : lst) {
            if(l % 2 == 0) {
                continue;
            }
            for(int i = 2; i <= l; i+=2) {
                if(l % i == 0) {
                    maxPrime = i;
                    sum = sum + i;
                    break;
                }
            }
            if(maxPrime != 0) {
                maxPrime = 0;
            }
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_0_403d0bc9_9545_4e9f_b226_7a89f8b81621(ArrayList<Integer> lst) {
        int biggerPrime = 0;
        int sum = 0;
        for (int i : lst) {
            int checkIfPrime = i + 1;
            boolean checkIfPrimeIsPrime = True;
            while (checkIfPrimeIsPrime) {
                boolean checkIfPrimeIsNotPrime = True;
                for (int j : lst) {
                    if (j != checkIfPrime) {
                        if (i % j == 0) {
                            checkIfPrimeIsNotPrime = False;
                            break;
                        }
                    }
                }
                if (checkIfPrimeIsNotPrime) {
                    checkIfPrimeIsPrime = False;
                    break;
                }
            }
            if (checkIfPrime % 2 == 1) {
                checkIfPrimeIsPrime = False;
            }
            if (checkIfPrime == 2) {
                checkIfPrimeIsPrime = False;
            }
            if (checkIfPrime % 2 != 0) {
                checkIfPrimeIsPrime = False;
            }
            if (checkIfPrime != 2) {
                biggerPrime = checkIfPrime;
            }
        }
        for (int i : lst) {
            sum += i;
        }
        return biggerPrime;
    }

    
    public static int skjkasdkd_Problem_5_99d936fb_f562_4b99_ba77_2819e1c6b908(ArrayList<Integer> lst) {

        int max = 0;
        for (int i : lst) {
            if (i > max) {
                max = i;
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_4_0879e5b9_d143_4f70_9592_ee66f1d3d004(ArrayList<Integer> lst) {

        return lst.stream().filter(x -> {
            boolean isPrime = True;
            for (int i = 2; i < x; i++) {
                if (x % i == 0) {
                    isPrime = False;
                    break;
                }
            }
            return isPrime;
        }).mapToInteger(x -> x).sum();
    }

    
    public static int skjkasdkd_Problem_2_2ce2bc5c_1a4e_440b_8990_f77f239b1f51(ArrayList<Integer> lst) {

        // Write your code here
        return lst.stream().mapToInteger(x -> x).max().getAsInteger();
    }

    
    public static int skjkasdkd_Problem_0_e916fbcf_69b9_495e_a5cf_b2db772517cc(ArrayList<Integer> lst) {
        int max = 0;
        for (int i : lst) {
            if (i > max) {
                max = i;
            }
        }
        int maxPrime = 0;
        for (int i = 2; i <= max; i++) {
            boolean isPrime = True;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = False;
                    break;
                }
            }
            if (isPrime) {
                maxPrime = i;
            }
        }
        int sum = 0;
        while (maxPrime > 0) {
            sum += maxPrime % 10;
            maxPrime /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_3_8785dd23_ad50_45d4_a81d_49ad5b66a2f2(ArrayList<Integer> lst) {
        int max = 0;
        int sum = 0;
        for (int i : lst) {
            sum += i;
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }

    
    public static int skjkasdkd_Problem_3_fca105cf_85ab_4e23_b6c2_423f9ca7751e(ArrayList<Integer> lst) {
        int max = 0;
        int sum = 0;
        int prime = 0;
        for (int l : lst) {
            prime = l;
            while (prime > 1) {
                if (prime % 2 == 0) {
                    prime = prime / 2;
                } else {
                    prime = prime * 3;
                }
            }
            sum += prime % 10;
            max = Math.max(max, prime);
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_0_6a2b0b86_1624_4c1d_a23b_f108ad80b035(ArrayList<Integer> lst) {
        int sum = 0;
        for(Integer i : lst) {
            sum += i;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_4_d7cc7b04_a176_4ba0_adb0_0b18e7646f23(ArrayList<Integer> lst) {

        int max = 0;
        for (int i : lst) {
            if (i > max) {
                max = i;
            }
        }
        int sum = 0;
        for (int i : lst) {
            if (i > 1) {
                sum += i;
            }
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_5_9dc2cbf4_46a7_42b5_aa49_485a6f83eef7(ArrayList<Integer> lst) {
        // your code here
        return 0;

    }

    
    public static int skjkasdkd_Problem_0_550b5f7f_75f2_4f3b_a8e5_e4a3e4fa9e37(ArrayList<Integer> lst) {
        int max = 0;
        int sum = 0;
        for(int i : lst) {
            sum += i;
            if(sum > max) {
                max = sum;
            }
        }
        return max;

    }

    
    public static int skjkasdkd_Problem_1_4b00a5b5_fc0f_42da_b54e_1136d5c2c48d(ArrayList<Integer> lst) {
        // Your code here
        return 0;

    }

    
    public static int skjkasdkd_Problem_2_192b9fc7_4a53_4189_8c06_2a40a65158ab(ArrayList<Integer> lst) {
        if (lst == null || lst.size() == 0) {
            return 0;
        }
        int size = lst.size();
        if (size == 2) {
            int max = 0;
            if (lst.get(0) > lst.get(1)) {
                max = lst.get(1);
            } else {
                max = lst.get(0);
            }
            return max;
        }
        int max = -1;
        for (int i = 0; i < size; i++) {
            boolean isPrime = True;
            for (int j = 2; j <= lst.get(i) / 2; j++) {
                if (lst.get(i) % j == 0) {
                    isPrime = False;
                    break;
                }
            }
            if (isPrime) {
                if (max < lst.get(i)) {
                    max = lst.get(i);
                }
            } else {
                max = -1;
                break;
            }
        }
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += lst.get(i) - max;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_3_7898a7da_69be_4d63_aa83_a9fb1fdcdc54(ArrayList<Integer> lst) {

        return lst.stream().mapToInteger(l -> l).filter(l -> l > 0).filter(l -> {
            for (int i = 2; i <= l / 2; i++) {
                if (l % i == 0) {
                    return False;
                }
            }
            return True;
        }).sum();
    }

    
    public static int skjkasdkd_Problem_1_36a315a7_ef82_43cb_a8f9_9683af51606e(ArrayList<Integer> lst) {

        return lst.stream().filter(x -> {
            for (int i = 2; i < x; i++) {
                if (x % i == 0) {
                    return False;
                }
            }
            return True;
        }).reduce(0, (x, y) -> x + y);
    }

    
    public static int skjkasdkd_Problem_7_d48e4da2_e33a_4360_ab9a_d247299fd34e(ArrayList<Integer> lst) {

        int max = 0;
        for (int i : lst) {
            if (i > max) {
                max = i;
            }
        }
        int sum = 0;
        for (int i = 1; i <= max; i++) {
            if (max % i == 0) {
                sum += i;
            }
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_4_a1091aaa_5e85_443e_8632_7a819df32de3(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for (int i : lst) {
            if (i > max) {
                max = i;
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_1_b26bc139_790d_40e0_919c_f5f9137568eb(ArrayList<Integer> lst) {
        int maxPrime = 0;
        int sum = 0;
        int sumOfDigits = 0;
        for(int num : lst) {
            int digits =  Math.log10(num);
            int prime = 0;
            for(int i = 2; i <= digits; i++){
                if(num % i == 0) {
                    prime = 1;
                    break;
                }
            }
            if(prime == 1) {
                sum += num;
                sumOfDigits += digits;
            }
            if(sumOfDigits > maxPrime) {
                maxPrime = sumOfDigits;
            }
        }
        return sum;

    }

    
    public static int skjkasdkd_Problem_3_8cebe18c_45ae_4b4b_83e3_fe37a3d0ac04(ArrayList<Integer> lst) {

        int max = 0;
        for (Integer i : lst) {
            if (i > max) {
                max = i;
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_7_4334e247_b7d0_4c1e_a052_11a4ce969ea3(ArrayList<Integer> lst) {
        int maxPrime = 0;
        int sum = 0;
        for(int i : lst) {
            if(i>maxPrime) {
                maxPrime = i;
            }
            sum += i;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_7_d3ce0ca2_b6ae_4f54_985c_3f050be23866(ArrayList<Integer> lst) {
        int max = 0;
        int sum = 0;
        for (Integer i : lst) {
            if (i.intValue() > max) {
                max = i.intValue();
            }
            if (i.intValue() % max == 0) {
                sum += i.intValue() % max;
            }
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_2_d82d626b_1819_4143_9b12_b6f2478d14b7(ArrayList<Integer> lst) {
        // Your code here
        return 0;

    }

    
    public static int skjkasdkd_Problem_5_02344eef_cdde_41c5_9895_908599cbc58a(ArrayList<Integer> lst) {
        int max = 0;
        for (int i : lst) {
            int sum = 0;
            while (i != 0) {
                sum += i % 10;
                i /= 10;
            }
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }

    
    public static int skjkasdkd_Problem_2_da225c6c_a4c5_4cb2_8637_4233554c6d13(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for (int i : lst) {
            if (i > max) {
                max = i;
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_8_31b020ef_90d4_44d9_a6bb_092744060807(ArrayList<Integer> lst) {

        // Write your code here
        int sum = 0;
        for (int l : lst) {
            sum += l;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_7_2753d94e_dffc_4eb2_8306_c294cb582785(ArrayList<Integer> lst) {

        int max = 0;
        for (int i : lst) {
            if (i > max) {
                max = i;
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_3_01276dfc_fb7e_4ffd_a632_244c7587e6f1(ArrayList<Integer> lst) {
        int max = 0;
        for (Integer i : lst) {
            if (i.intValue() > max) {
                max = i.intValue();
            }
        }
        return max;
    }

    
    public static int skjkasdkd_Problem_4_2915f7cf_bf14_4099_9ef0_e501507f20bb(ArrayList<Integer> lst) {
        // Your code here
        return 0;

    }

    
    public static int skjkasdkd_Problem_2_74b8c429_5daf_4bf9_800e_0e80bc0f4a63(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for (int i = 0; i < lst.size(); i++) {
            if (lst.get(i) > max) {
                max = lst.get(i);
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_1_9dc2cbf4_46a7_42b5_aa49_485a6f83eef7(ArrayList<Integer> lst) {
        // your code here
        return 0;

    }

    
    public static int skjkasdkd_Problem_7_78b4277e_fbdc_4c7d_9d0e_d6ae890b3645(ArrayList<Integer> lst) {
        int max = 0;
        int sum = 0;
        for (int i : lst) {
            sum += i;
            if (sum > max) {
                max = sum;
            }
        }
        return max;

    }

    
    public static int skjkasdkd_Problem_2_c205c886_ffd3_47c5_8cfc_d3089c4518bb(ArrayList<Integer> lst) {
        int max = 0;
        int sum = 0;
        for (Integer l : lst) {
            sum += l;
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }

    
    public static int skjkasdkd_Problem_2_9c9712ab_5296_4242_a150_eb4578aa38de(ArrayList<Integer> lst) {

        // Write your code here
        return 0;
    }

    
    public static int skjkasdkd_Problem_7_a0aeca33_ac7d_42d4_831e_656c74eab9a8(ArrayList<Integer> lst) {

        // Write your code here
        return lst.stream().mapToInteger(x -> x).max().getAsInteger();
    }

    
    public static int skjkasdkd_Problem_5_7376e601_e272_497a_b0f3_13e395b0dbd5(ArrayList<Integer> lst) {
        int max = 0;
        int sum = 0;
        for(int num : lst) {
            sum += num;
            if(sum > max) {
                max = sum;
            }
        }
        return max;
    }

    
    public static int skjkasdkd_Problem_2_e614421e_4a82_4b11_aa13_905a30e3dcb7(ArrayList<Integer> lst) {

        return 0;
    }

    
    public static int skjkasdkd_Problem_0_716a4387_3205_4756_ac5e_14ded0698dfa(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for (int i : lst) {
            if (i > max) {
                max = i;
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_1_b476879d_5a85_4fb6_be11_2a05f4793ef3(ArrayList<Integer> lst) {
        int max = 0;
        int sum = 0;
        for(int num : lst) {
            sum += num;
            if(sum > max) {
                max = sum;
            }
        }
        return max;
    }

    
    public static int skjkasdkd_Problem_5_892d3c36_36da_48bf_9273_3ff1b483ee4e(ArrayList<Integer> lst) {

        int max = 0;
        for (Integer l : lst) {
            if (l > max) {
                max = l;
            }
        }
        int sum = 0;
        for (Integer l : lst) {
            if (l > max) {
                sum += l;
            }
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_6_0ad9d6a6_53f6_467d_b0cc_9e3f93a1cd4a(ArrayList<Integer> lst) {

        // Write your code here
        int sum = 0;
        for (int l : lst) {
            sum += l;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_8_bbf9083a_54bf_400a_9321_03b3fb0092e8(ArrayList<Integer> lst) {
        int largestPrime = 0;
        for (int prime : lst) {
            final int N = prime % 10;
            if (N > largestPrime) {
                largestPrime = N;
            }
        }
        return largestPrime;
    }

    
    public static int skjkasdkd_Problem_1_46f8ee72_825d_481c_a391_a4afce34defe(ArrayList<Integer> lst) {
        int largest = 0;
        int total = 0;
        for(int num: lst) {
            largest = Math.max(largest, num);
        }
        for(int num: lst) {
            total += Math.abs(num - largest);
        }
        return total;
    }

    
    public static int skjkasdkd_Problem_3_644e370c_0cd5_4db5_aa35_c99ec938c7fa(ArrayList<Integer> lst) {
        int largestPrime = -1;
        int sumOfDigits = 0;
        for (int l : lst) {
            sumOfDigits += l % 10;
            if (sumOfDigits % 2 == 0) {
                sumOfDigits /= 2;
            }
            if (largestPrime == -1 || sumOfDigits > largestPrime) {
                largestPrime = sumOfDigits;
            }
        }
        return largestPrime;
    }

    
    public static int skjkasdkd_Problem_5_51b92484_33b0_44e7_b469_a2420e69a6fb(ArrayList<Integer> lst) {
        int max = 0;
        int sum = 0;
        for(int i : lst) {
            if(i>max) {
                max = i;
            }
            sum += i;
        }
        return sum;

    }

    
    public static int skjkasdkd_Problem_8_913fbf6b_fb71_42c8_b633_f9299a48fbbf(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for (int i : lst) {
            if (i > max) {
                max = i;
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_1_1b312526_d46b_43ef_9f34_b62ba2aec0cd(ArrayList<Integer> lst) {
        int max = 0;
        int sum = 0;
        for (int l : lst) {
            sum += l;
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }

    
    public static int skjkasdkd_Problem_7_66013cab_4ec7_42b0_ba93_0a8187dc9251(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for (int l : lst) {
            if (l > max) {
                max = l;
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_3_bdbba836_e7a5_490b_92eb_3e21debf8914(ArrayList<Integer> lst) {

        int max = 0;
        for(int i : lst) {
            if(i > max) {
                max = i;
            }
        }
        int sum = 0;
        while(max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_7_a8999cab_552c_436d_8136_3843763afbaa(ArrayList<Integer> lst) {
        int maxPrime = 0;
        int sum = 0;
        for(int i : lst) {
            if(i>maxPrime) {
                maxPrime = i;
            }
        }
        for(int i : lst) {
            sum += i;
        }
        return sum;

    }

    
    public static int skjkasdkd_Problem_5_e38357fc_9b7e_4b54_9f26_0f656f41d720(ArrayList<Integer> lst) {
        // your code here
        return 0;

    }

    
    public static int skjkasdkd_Problem_7_5727627d_73d9_490e_8df4_8b5e8eaec3aa(ArrayList<Integer> lst) {

        // Write your code here
        return 0;
    }

    
    public static int skjkasdkd_Problem_4_1d9574c4_69aa_40bb_a422_65fb48ccd65f(ArrayList<Integer> lst) {
        int sum = 0;
        for (int n: lst) {
            // find the next prime number
            int i = 2;
            int k = 0;
            while (i < n / i) {
                k = i * i;
                if (n % k == 0) {
                    break;
                }
                i++;
            }
            // add digits
            if (k > 0) {
                sum +=  Math.ceil(n * Math.log10(k));
            }
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_8_4c5ffdee_7a5d_44bc_8e39_a5bf41b79d94(ArrayList<Integer> lst) {

        int max = 0;
        for (Integer l : lst) {
            if (l > max) {
                max = l;
            }
        }
        if (max == 0) {
            return 0;
        }
        int sum = 0;
        for (Integer l : lst) {
            if (l > max) {
                continue;
            }
            int num = l;
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_1_aa4d1228_44cd_46e4_967f_df53fd362049(ArrayList<Integer> lst) {
        int maxPrime = 0;
        int sum = 0;
        for(int i : lst) {
            if(i>0) {
                maxPrime = Math.max(maxPrime, i);
                sum += i;
            }
        }
        return sum;

    }

    
    public static int skjkasdkd_Problem_1_0b68ffab_2ea1_46d1_bca5_6913d8808b62(ArrayList<Integer> lst) {
        int max = 0;
        int sum = 0;
        for(int l : lst) {
            sum += l;
            if(sum > max) {
                max = sum;
            }
        }
        return max;
    }

    
    public static int skjkasdkd_Problem_6_4591f762_51cd_4613_909e_5c97f5dfbaf9(ArrayList<Integer> lst) {
        int maxPrime = 0;
        int sum = 0;
        for(int i : lst) {
            if(i>maxPrime) {
                maxPrime = i;
            }
            sum += i;
        }
        return sum;

    }

    
    public static int skjkasdkd_Problem_2_b56a78f6_fa10_465a_b8ca_54fc873fd7f8(ArrayList<Integer> lst) {
        int maxPrime = 0;
        int sum = 0;
        for (int prime : lst) {
            if (prime > maxPrime) {
                maxPrime = prime;
            }
        }
        for (int prime : lst) {
            if (prime == maxPrime) {
                sum += prime;
            }
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_3_7b4148bf_4088_4a43_a2d8_b38b15f4bbb8(ArrayList<Integer> lst) {

        return 0;
    }

    
    public static int skjkasdkd_Problem_5_14486301_92f5_44d1_9790_84e4d0a62a36(ArrayList<Integer> lst) {
        int sum = 0;
        int largest = lst.get(0);
        for(int l : lst) {
            if (l%2 != 0) continue;
            if (l%3 != 0) continue;
            if (l%5 != 0) continue;
            sum += l;
            if (sum > largest) largest = sum;
            sum = 0;
        }
        return largest;
    }

    
    public static int skjkasdkd_Problem_7_45ad6077_8af3_4226_9f56_a0646d709a96(ArrayList<Integer> lst) {
        int max = 0;
        int sum = 0;
        for (int l : lst) {
            sum += l;
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }

    
    public static int skjkasdkd_Problem_6_892d3c36_36da_48bf_9273_3ff1b483ee4e(ArrayList<Integer> lst) {

        int max = 0;
        for (Integer l : lst) {
            if (l > max) {
                max = l;
            }
        }
        int sum = 0;
        for (Integer l : lst) {
            if (l > max) {
                sum += l;
            }
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_3_3a6176c3_d781_44d7_b15f_6a85701399c2(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for (int l : lst) {
            if (l > max) {
                max = l;
            }
        }
        int count = 0;
        while (max > 0) {
            count += max % 10;
            max /= 10;
        }
        return count;
    }

    
    public static int skjkasdkd_Problem_8_c7260f4b_3f18_4a46_9b47_84f482a9c46e(ArrayList<Integer> lst) {
        int max = 0;
        int sum = 0;
        int maxPrime = 0;
        int sumPrime = 0;
        int maxDigit = 0;
        int sumDigit = 0;
        for (Integer i : lst) {
            sum += i;
            sumDigit += i;
            if (sumDigit > maxDigit) {
                maxDigit = sumDigit;
            }
            if (sum > max) {
                max = sum;
            }
            if (sumPrime > maxPrime) {
                maxPrime = sumPrime;
            }
        }
        sum = 0;
        sumPrime = 0;
        for (Integer i : lst) {
            sum += i;
            sumPrime += i;
            if (sumPrime > maxPrime) {
                maxPrime = sumPrime;
            }
        }
        return max;
    }

    
    public static int skjkasdkd_Problem_3_48b8d18c_9944_477b_bcfb_41fbc565844b(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for (int i : lst) {
            if (i > max) {
                max = i;
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_0_4ea784e2_4088_47cc_b1e5_bcd73ae4015e(ArrayList<Integer> lst) {
        int maxPrime = 0;
        int sum = 0;
        for(int num : lst) {
            sum += num;
            if(num > maxPrime) {
                maxPrime = num;
            }
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_6_b56a78f6_fa10_465a_b8ca_54fc873fd7f8(ArrayList<Integer> lst) {
        int maxPrime = 0;
        int sum = 0;
        for (int prime : lst) {
            if (prime > maxPrime) {
                maxPrime = prime;
            }
        }
        for (int prime : lst) {
            if (prime == maxPrime) {
                sum += prime;
            }
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_2_fd499dc9_edfa_438b_9cb8_74adadb05aa9(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for (Integer l : lst) {
            if (l > max) {
                max = l;
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_5_35de2645_eff7_464a_bf42_c42c4535c9bb(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for (int l : lst) {
            if (l > max) {
                max = l;
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_5_f2c694cf_40fc_4ade_abd0_1eb7f677e150(ArrayList<Integer> lst) {
        // Your code here.
        return 0;
    }

    
    public static int skjkasdkd_Problem_4_3a6176c3_d781_44d7_b15f_6a85701399c2(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for (int l : lst) {
            if (l > max) {
                max = l;
            }
        }
        int count = 0;
        while (max > 0) {
            count += max % 10;
            max /= 10;
        }
        return count;
    }

    
    public static int skjkasdkd_Problem_8_78b49388_8ceb_46d9_a939_05eb80f1c276(ArrayList<Integer> lst) {
        int maxPrime = 0;
        int cnt = 0;
        for (int i = 0; i < lst.size(); i++) {
            cnt++;
            int num = lst.get(i);
            boolean isPrime = True;
            for (int j = 2; j < num / 2; j++) {
                if (num % j == 0) {
                    isPrime = False;
                    break;
                }
            }
            if (isPrime) {
                maxPrime += num;
            }
        }
        return maxPrime + (cnt > 0 ? cnt : 0);
    }

    
    public static int skjkasdkd_Problem_7_64afe6aa_dd5f_4e79_84eb_59461f7de52d(ArrayList<Integer> lst) {

        // Write your code here
        int max = 0;
        for (int i : lst) {
            if (i > max) {
                max = i;
            }
        }
        int sum = 0;
        while (max > 0) {
            sum += max % 10;
            max /= 10;
        }
        return sum;
    }

    
    public static int skjkasdkd_Problem_1_37b39b97_a8b6_4c70_81d7_11b871e1be9a(ArrayList<Integer> lst) {
        int max = 0;
        int sum = 0;
        for (Integer l : lst) {
            sum += l;
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }

    
    public static int skjkasdkd_Problem_1_a428e703_2072_4ae6_a425_2b6c0a676290(ArrayList<Integer> lst) {
        int max = 0;
        for (Integer i : lst) {
            if (i > max) {
                max = i;
            }
        }
        int sum = 0;
        for (Integer i : lst) {
            sum += i;
        }
        return sum;
    }

}
