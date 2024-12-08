package mbpp_166_find_even_pair;

public class mbpp_166_find_even_pair {

    
    public static int findEvenPair_Problem_2_1d1b9e6b_6591_4b47_b6af_b641bae1394b(ArrayList<Integer> A) {
        // Write code here
        int sum = 0, evenPairs = 0;
        for (int x : A) {
            int odd = 0;
            for (int i = 0; i < x; i++) {
                if (x % 2 == 1) {
                    odd += 1;
                }
                x += 1;
            }
            sum += x;
            if (odd % 2 == 0) {
                evenPairs += 1;
            }
        }
        return sum;
    }

    
    public static int findEvenPair_Problem_1_7b72ebb7_58fe_43b7_afef_b8b1ce95e243(ArrayList<Integer> A) {
        int count = 0;
        for (int i = 0; i < A.size(); i++) {
            for (int j = i + 1; j < A.size(); j++) {
                if ((A.get(i) ^ A.get(j)) % 2 == 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int findEvenPair_Problem_0_12640f59_7595_48f8_ad9d_231e438f1939(ArrayList<Integer> A) {
        return A.stream().filter((x)->(x ^ 2) % 2 == 0).count();
    }

    
    public static int findEvenPair_Problem_1_bd857eca_c7d5_48c3_aab7_774b18f6d0b5(ArrayList<Integer> A) {
        int count = -1;
        for(Integer x : A) {
            if (x%2 == 0) {
                for (Integer y : A) {
                    if (x==y) {
                        break;
                    }
                    else if (x!=y && x%2==0 && y%2!=0) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    
    public static int findEvenPair_Problem_1_a526201e_823f_49a1_83b4_428b83c48681(ArrayList<Integer> A) {
        // TODO: Fill in the body of this method below.
        ArrayList<Integer> evenPair = new ArrayList<>();
        for(Integer i : A) {
            for(Integer j : A) {
                if(i != j && (i % 2 == 0 || j % 2 == 0)) {
                    evenPair.add(i ^ j);
                }
            }
        }
        return evenPair.size();
    }

    
    public static int findEvenPair_Problem_0_79a368b2_4ba5_49b9_a8df_c6801a5db47c(ArrayList<Integer> A) {
        int count = 0;
        List<Integer> even = A.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
        for (Integer x: even) {
            for (Integer y: A) {
                if ((x != 0) && (y != 0) && (x!= y) && (x % y == 0)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int findEvenPair_Problem_0_fada2fc1_2a26_402d_9231_7f1acf402f10(ArrayList<Integer> A) {
        int evens = 0;
        for (int i = 0; i < A.size(); i = i + 2) {
            int xor = A.get(i);
            int i2 = i + 1;
            while (A.get(i2) != xor && i2 < A.size()) {
                xor = xor ^ A.get(i2);
                i2 = i2 + 2;
            }
            if (A.get(i2) == xor) {
                evens++;
            }
        }
        return evens;
    }

    
    public static int findEvenPair_Problem_2_8f9325bc_2885_4b05_a020_725ac06466be(ArrayList<Integer> A) {
        int n = A.size();
        int even = 0;
        for (int i = 0; i < n; i++) {
            int x = A.get(i);
            for (int j = i; j < n; j++) {
                int y = A.get(j);
                if ((x ^ y) % 2 == 0) {
                    even++;
                }
            }
        }
        return even;
    }

    
    public static int findEvenPair_Problem_1_3c1e79b7_e818_46f9_9493_3f0fbadc9982(ArrayList<Integer> A) {
        int count = 0;
        for (int i = 0; i < A.size(); i++) {
            for (int j = i + 1; j < A.size(); j++) {
                if ((A.get(i) ^ A.get(j)) % 2 == 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int findEvenPair_Problem_2_6046c8cd_f8c3_43c0_85ad_c69416ccd0c1(ArrayList<Integer> A) {
        int evenCount = 0;
        int i = 0;
        for (Integer xor : A) {
            if(xor % 2 == 0) {
                evenCount += 1;
            }
            i += 1;
        }
        return evenCount;
    }

    
    public static int findEvenPair_Problem_2_95117b42_8955_4e21_b1f1_06c323c4331c(ArrayList<Integer> A) {
        int sum = 0;
        int N =  A.size();
        for (int i = 0; i < N; i++) {
            if (i % 2 == 0) {
                sum += A.get(i) ^ A.get(N/2+i);
            }
        }
        return sum;
    }

    
    public static int findEvenPair_Problem_2_ff65a3b8_1aa4_4e54_b406_aae01a143865(ArrayList<Integer> A) {
        int count = 0;
        for(int i = 0; i < A.size(); i++) {
            for(int j = i + 1; j < A.size(); j++) {
                int x = A.get(i) ^ A.get(j);
                if(x % 2 == 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int findEvenPair_Problem_2_d000ec00_e915_4285_9955_7016ec6dcbf2(ArrayList<Integer> A) {
        int evenPair = 0;
        for(int i = 0; i < A.size(); i++) {
            int xor =  A.get(i)^2;
            for(int j = i; j < A.size(); j++) {
                xor ^= A.get(j);
                evenPair ^= xor;
            }
        }
        return evenPair;
    }

    
    public static int findEvenPair_Problem_0_8f9325bc_2885_4b05_a020_725ac06466be(ArrayList<Integer> A) {
        int n = A.size();
        int even = 0;
        for (int i = 0; i < n; i++) {
            int x = A.get(i);
            for (int j = i; j < n; j++) {
                int y = A.get(j);
                if ((x ^ y) % 2 == 0) {
                    even++;
                }
            }
        }
        return even;
    }

    
    public static int findEvenPair_Problem_0_6e3e4e48_2d38_4cc3_ab69_493a6eb67d57(ArrayList<Integer> A) {
        int count = 0;
        for(int i = 0; i < A.size(); i++) {
            for(int j = i + 1; j < A.size(); j++) {
                int xor = A.get(i) ^ A.get(j);
                if(xor % 2 == 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int findEvenPair_Problem_2_4501a285_4406_4b72_bcea_af800f109416(ArrayList<Integer> A) {
        int evenCount = 0;
        for (Integer i : A) {
            int xor = i ^ 0b1000000000;
            if(xor % 2 == 0) evenCount += 1;
        }
        return evenCount;
    }

    
    public static int findEvenPair_Problem_2_6bb91142_1710_49e6_bffb_88591266989a(ArrayList<Integer> A) {
        int pairs = 0;
        for(int i = 0; i < A.size(); i++){
            for(int j = 0; j < A.size(); j++){
                if((A.get(i) ^ A.get(j)) % 2 == 0){
                    pairs++;
                }
            }
        }
        return pairs;
    }

    
    public static int findEvenPair_Problem_1_4bf8a668_0b08_4087_9c28_3f11b8c4f45c(ArrayList<Integer> A) {
        int count = 0;
        for(int i = 0; i < A.size(); i++) {
            for(int j = i + 1; j < A.size(); j++) {
                int xor = A.get(i) ^ A.get(j);
                if(xor % 2 == 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int findEvenPair_Problem_0_0836f300_4fc3_45ca_98f1_9ee17f84e3c8(ArrayList<Integer> A) {
        int evenCount = 0;
        
        for(int i = 0; i < A.size(); i++){
            int x = 0;
            for(int j = 0; j < A.size(); j++){
                x = x ^ A.get(j);
            }
            if(x%2==0){
                evenCount++;
            }
        }
        
        return evenCount;
    }

    
    public static int findEvenPair_Problem_2_107fff69_7abb_4d40_883d_b4ad49a703ae(ArrayList<Integer> A) {
        int count=0;
        for(Integer i:A){
            if(i%2==0){
                count++;
            }
        }
        return count;
    }

    
    public static int findEvenPair_Problem_2_3753c073_58b1_4f8e_8b0c_8a2cf11e9fe2(ArrayList<Integer> A) {
        int n = 0;
        for (int i=0; i<A.size(); i++) {
            n += A.get(i) ^ (A.get(i) & 1);
        }
        return n;
    }

    
    public static int findEvenPair_Problem_2_a19ffe32_38e8_4106_bcf0_159705430ade(ArrayList<Integer> A) {
        int evenCount = 0, oddCount = 0;
        for (int i = 0; i < A.size(); i++) {
            if (A.get(i) % 2 == 0) {
                evenCount += A.get(i);
            } else {
                oddCount += A.get(i);
            }
        }
        return evenCount * oddCount;
    }

    
    public static int findEvenPair_Problem_0_0e84ccfc_6e9c_4a64_bb4d_4186af85601c(ArrayList<Integer> A) {
        // TODO: write your code here
        return 0;
    }

    
    public static int findEvenPair_Problem_2_293e934b_96e8_4716_8dcd_b981f506b2d0(ArrayList<Integer> A) {
        int count = 0;
        for (int i = 0; i < A.size(); i++) {
            for (int j = i + 1; j < A.size(); j++) {
                if ((A.get(i) ^ A.get(j)) % 2 == 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int findEvenPair_Problem_0_e554e3ea_7bec_4dc6_8062_22a48a7bbcff(ArrayList<Integer> A) {
        return A.stream().filter(x -> x % 2 == 0).count();
    }

    
    public static int findEvenPair_Problem_2_ae557780_f545_45eb_9901_f182a639b362(ArrayList<Integer> A) {
        int countEven = 0;
        int N = A.size();
        for (int i = 0; i < N; i++) {
            int a = A.get(i);
            for (int j = i+1; j < N; j++) {
                int b = A.get(j);
                if ((a ^ b) % 2 == 0) {
                    countEven++;
                }
            }
        }
        return countEven;
    }

    
    public static int findEvenPair_Problem_1_cbf4c409_d2bf_48bc_b41a_35f18d546ac2(ArrayList<Integer> A) {
        int count = 0;
        for(Integer i : A) {
            count += i%2 == 0? 1 : 0;
        }
        return count;
    }

    
    public static int findEvenPair_Problem_0_3dc336c5_6e99_410d_8f63_89faf1adcb01(ArrayList<Integer> A) {
        int sum = 0;
        for(Integer x : A) {
            sum += x;
        }
        for(Integer x : A) {
            sum += x;
        }
        return sum;
    }

    
    public static int findEvenPair_Problem_1_c8754ae7_ad6f_49f8_abf4_f3001ddaa86e(ArrayList<Integer> A) {
        int count = 0L;
        for (int i = 0; i < A.size(); i = i + 2) {
            final Integer a = A.get(i);
            final Integer b = A.get(i + 1);
            final Integer c = (a ^ b);
            final Integer d = (c << 1);
            if (d >= 2) {
                count = count + 1;
            }
        }
        return count;
    }

    
    public static int findEvenPair_Problem_0_ff65a3b8_1aa4_4e54_b406_aae01a143865(ArrayList<Integer> A) {
        int count = 0;
        for(int i = 0; i < A.size(); i++) {
            for(int j = i + 1; j < A.size(); j++) {
                int x = A.get(i) ^ A.get(j);
                if(x % 2 == 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int findEvenPair_Problem_2_65868022_1514_49ba_bbad_f81195f4e817(ArrayList<Integer> A) {
        int count = 0;
        for (int i = 0; i < A.size(); i++) {
            for (int j = i + 1; j < A.size(); j++) {
                if ((A.get(i) ^ A.get(j)) % 2 == 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int findEvenPair_Problem_1_0836f300_4fc3_45ca_98f1_9ee17f84e3c8(ArrayList<Integer> A) {
        int evenCount = 0;
        
        for(int i = 0; i < A.size(); i++){
            int x = 0;
            for(int j = 0; j < A.size(); j++){
                x = x ^ A.get(j);
            }
            if(x%2==0){
                evenCount++;
            }
        }
        
        return evenCount;
    }

    
    public static int findEvenPair_Problem_1_1d1b9e6b_6591_4b47_b6af_b641bae1394b(ArrayList<Integer> A) {
        // Write code here
        int sum = 0, evenPairs = 0;
        for (int x : A) {
            int odd = 0;
            for (int i = 0; i < x; i++) {
                if (x % 2 == 1) {
                    odd += 1;
                }
                x += 1;
            }
            sum += x;
            if (odd % 2 == 0) {
                evenPairs += 1;
            }
        }
        return sum;
    }

    
    public static int findEvenPair_Problem_1_a9e52847_ce2e_41c5_aadc_e39b0c1abd90(ArrayList<Integer> A) {
        int count = 0;
        for (int i = 0; i < A.size(); i++) {
            for (int j = i + 1; j < A.size(); j++) {
                if ((A.get(i) ^ A.get(j)) % 2 == 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int findEvenPair_Problem_1_b3882168_6869_48c4_8ce4_8b58716c8da9(ArrayList<Integer> A) {
        int count = 0L;
        for (int i : A)
            for (int j : A)
                if ((i ^ j) % 2 == 0)
                    count++;
        return count;
    }

    
    public static int findEvenPair_Problem_0_1d81b26e_cbe4_4058_bbec_7413887be05f(ArrayList<Integer> A) {
        // Code here.
        int evenPair = 0;
        for (Integer i : A) {
            while (i % 2 != 0 && i > 0) {
                --i;
            }
            evenPair++;
        }
        return evenPair;
    }

    
    public static int findEvenPair_Problem_0_95117b42_8955_4e21_b1f1_06c323c4331c(ArrayList<Integer> A) {
        int sum = 0;
        int N =  A.size();
        for (int i = 0; i < N; i++) {
            if (i % 2 == 0) {
                sum += A.get(i) ^ A.get(N/2+i);
            }
        }
        return sum;
    }

    
    public static int findEvenPair_Problem_2_1ad90c35_f5f8_49f4_b6b9_9b9d3df4f6f2(ArrayList<Integer> A) {
        int count = 0;
        for (int i = 0; i < A.size(); i++) {
            for (int j = i + 1; j < A.size(); j++) {
                if ((A.get(i) ^ A.get(j)) % 2 == 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int findEvenPair_Problem_1_3dc336c5_6e99_410d_8f63_89faf1adcb01(ArrayList<Integer> A) {
        int sum = 0;
        for(Integer x : A) {
            sum += x;
        }
        for(Integer x : A) {
            sum += x;
        }
        return sum;
    }

    
    public static int findEvenPair_Problem_1_65adc0cc_0912_4f71_ac64_a297679e60aa(ArrayList<Integer> A) {
        int count = 0;
        for (int i = 0; i < A.size(); i++) {
            for (int j = i + 1; j < A.size(); j++) {
                int x = A.get(i) ^ A.get(j);
                if (x % 2 == 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int findEvenPair_Problem_0_5d3817f6_423a_4eab_b8bf_f56802e6e3e7(ArrayList<Integer> A) {
        int evenPair = 0;
        int oddPair = 0;

        for (int element : A) {
            if (element % 2 == 0) {
                evenPair++;
            } else {
                oddPair++;
            }
        }
        return evenPair + oddPair;
    }

    
    public static int findEvenPair_Problem_0_89b0a860_e4a2_4585_be64_a2dec5ca7077(ArrayList<Integer> A) {
        int count = 0;
        for (int i = 0; i < A.size(); i++) {
            for (int j = i + 1; j < A.size(); j++) {
                int x = A.get(i) ^ A.get(j);
                if (x % 2 == 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int findEvenPair_Problem_1_cbdc3fed_265f_4232_bab4_f5ad889772bf(ArrayList<Integer> A) {
        
        //return A.stream().filter(x -> x % 2 == 0).count();
        
        int count = 0;
        int even = 0;
        
        for(int i=0;i<A.size();i++) {
            if((A.get(i)%2) == 0) {
                even++;
            }
        }
        
        return even;
    }

    
    public static int findEvenPair_Problem_0_a8a216e1_b474_46a3_a17b_6e330c437a62(ArrayList<Integer> A) {
        int count = 0;
        for (int i = 0; i < A.size(); i++) {
            for (int j = i + 1; j < A.size(); j++) {
                int xor = A.get(i) ^ A.get(j);
                if (xor % 2 == 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int findEvenPair_Problem_1_fa148969_e228_4443_bddd_439380955501(ArrayList<Integer> A) {
        Integer n = new Integer(0);
        for(int x : A) {
            n += x ^ 2;
        }
        return n;
    }

    
    public static int findEvenPair_Problem_1_9690c98b_ea3f_471b_ad8d_7c2232bc6ed9(ArrayList<Integer> A) {
        int count = 0;
        for(int i = 0; i < A.size(); i++) {
            for(int j = i + 1; j < A.size(); j++) {
                int x = A.get(i) ^ A.get(j);
                if(x % 2 == 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int findEvenPair_Problem_2_64329a33_6acf_4840_9b8e_d089ff4fbba2(ArrayList<Integer> A) {
        int evenPairCount = 0;
        for (int x : A) {
            int y = x;
            while (y % 2 == 0 && y != 0) {
                y = y / 2;
            }
            if (y == 0) evenPairCount++;
        }
        return evenPairCount;
    }

    
    public static int findEvenPair_Problem_0_7858632f_3f08_4ef0_8cf1_1da7ff53e80b(ArrayList<Integer> A) {
        int count = 0;
        for (int i = 0; i < A.size(); i++) {
            for (int j = i + 1; j < A.size(); j++) {
                int xor = A.get(i) ^ A.get(j);
                if (xor % 2 == 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int findEvenPair_Problem_1_8524b90b_83c3_4ce3_8b6c_ce3eb853eace(ArrayList<Integer> A) {
        int count = 0;
        for (int i = 0; i < A.size(); i++) {
            for (int j = i + 1; j < A.size(); j++) {
                int xor = A.get(i) ^ A.get(j);
                if (xor % 2 == 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int findEvenPair_Problem_2_92ae0011_f7c4_4132_afbe_33b1b4e519fd(ArrayList<Integer> A) {
        int evenPairCount = 0;
        int evenPairCount2 = 0;
        for( int i = 0; i < A.size(); i += 2) {
            int A0 = A.get(i);
            int A1 = A.get(i + 1);
            int countEven = 0;
            int countEven2 = 0;
            for( int j = i; j < A.size(); j++) {
                int B0 = A.get(j);
                int B1 = A.get(j + 1);
                if((A0 ^ A1) != (B0 ^ B1)) {
                    countEven++;
                    countEven2++;
                }
            }
            if(countEven2 == 2) {
                evenPairCount++;
                evenPairCount2++;
            }
        }
        int evenPairCount3 = evenPairCount * evenPairCount2;
        return evenPairCount3;
    }

    
    public static int findEvenPair_Problem_1_f42b58d7_604d_4087_9444_02e5cd7460d9(ArrayList<Integer> A) {
        int count = 0;
        for (int i = 0; i < A.size(); i++) {
            for (int j = i + 1; j < A.size(); j++) {
                if ((A.get(i) ^ A.get(j)) % 2 == 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int findEvenPair_Problem_2_baf5180a_bf94_48a3_b70f_288d71033adb(ArrayList<Integer> A) {
        int count = 0;
        for (int i = 0; i < A.size(); i++) {
            for (int j = i + 1; j < A.size(); j++) {
                int xor = A.get(i) ^ A.get(j);
                if (xor % 2 == 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int findEvenPair_Problem_1_0a7d1e14_f7d3_45b6_a862_92b35e50d608(ArrayList<Integer> A) {
        Set<Integer> set = new HashSet<Integer>();
        for (Integer i : A) {
            set.add(i ^ (i >> 1));
        }
        return set.size();
    }

    
    public static int findEvenPair_Problem_2_f36dee9b_3d4f_46b4_aee1_740b20514167(ArrayList<Integer> A) {
        // Initialize sum variable
        int sum = 0;
        for (int i : A) {
            for (int j : A) {
                if (i != j && (i ^ j) % 2 == 0) {
                    sum += i;
                    break;
                }
            }
        }
        return sum;
    }

    
    public static int findEvenPair_Problem_0_465ec386_0a0e_4b43_94bd_61db138af56f(ArrayList<Integer> A) {
        int result = 0;
        for(int i : A) {
            result |= i;
        }
        return result & 0x3fffffffffffffffL;
    }

    
    public static int findEvenPair_Problem_0_94940d7f_25ba_4db6_a648_4a125fd72add(ArrayList<Integer> A) {
        int sum = 0;
        for (int i = 0; i < A.size(); i++) {
            for (int j = i + 1; j < A.size(); j++) {
                if ((A.get(i) ^ A.get(j)) % 2 == 0) {
                    sum = sum + 1;
                    break;
                }
            }
        }
        return sum;
    }

    
    public static int findEvenPair_Problem_1_12640f59_7595_48f8_ad9d_231e438f1939(ArrayList<Integer> A) {
        return A.stream().filter((x)->(x ^ 2) % 2 == 0).count();
    }

    
    public static int findEvenPair_Problem_1_e996d386_449d_4eb4_95d1_ff6f6d633fb8(ArrayList<Integer> A) {
        // find even numbers
        int evenNumbers = A.stream().filter(n -> n%2 == 0).count();
        // find odd numbers
        int oddNumbers = A.stream().filter(n -> n%2 != 0).count();
        // return odd numbers / even numbers
        return (oddNumbers/evenNumbers);
    }

    
    public static int findEvenPair_Problem_0_1ad90c35_f5f8_49f4_b6b9_9b9d3df4f6f2(ArrayList<Integer> A) {
        int count = 0;
        for (int i = 0; i < A.size(); i++) {
            for (int j = i + 1; j < A.size(); j++) {
                if ((A.get(i) ^ A.get(j)) % 2 == 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int findEvenPair_Problem_2_b2083005_edad_4987_98d2_929b2ee95796(ArrayList<Integer> A) {
        int counter = 0;
        for (Integer x : A) {
            if (x % 2 == 0) {
                counter += 1;
            }
        }
        return counter;
    }

    
    public static int findEvenPair_Problem_0_0c2562fc_bbd2_49bd_986d_50dc6d1ea590(ArrayList<Integer> A) {
        //find pairs xor even
        int evenPairs = 0;
        for (int i = 0; i < A.size(); i++) {
            int a = A.get(i);
            for (int j = i + 1; j < A.size(); j++) {
                int b = A.get(j);
                int xor = a ^ b;
                if (xor % 2 == 0) {
                    evenPairs++;
                }
            }
        }
        return evenPairs;
    }

    
    public static int findEvenPair_Problem_1_e8917d79_74a5_4e2d_b84c_e3240c403bdf(ArrayList<Integer> A) {
        int evenCount = 0;
        int oddCount = 0;
        for(Integer x : A) {
            if (x % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        return evenCount % 2 == 0 ? evenCount : oddCount;
    }

    
    public static int findEvenPair_Problem_1_4501a285_4406_4b72_bcea_af800f109416(ArrayList<Integer> A) {
        int evenCount = 0;
        for (Integer i : A) {
            int xor = i ^ 0b1000000000;
            if(xor % 2 == 0) evenCount += 1;
        }
        return evenCount;
    }

}
