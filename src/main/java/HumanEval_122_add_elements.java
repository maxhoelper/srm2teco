package HumanEval_122_add_elements;

public class HumanEval_122_add_elements {

    
    public static int addElements_Problem_2_d4ee99ff_542e_453f_b4ee_06f057785e24(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_2e329d2c_4a59_4009_a08b_e3b5db83c482(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_0_af5b6d54_80eb_4292_b0a3_3ad19fbb5ef5(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_1_c3638e6c_ba0a_4319_883b_6cd174e94b82(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_0_91daae77_0ddf_48af_89ab_0b4d9de429d8(ArrayList<Integer> arr, int k) {
        throw new IllegalArgumentException("Not yet implemented");
    }

    
    public static int addElements_Problem_4_6caaff1e_7bee_465e_9748_1d6966f74614(ArrayList<Integer> arr, int k) {
        return arr.stream().limit(k).filter(e -> e.toString().length() <= 2).mapToInteger(e -> e).sum();
    }

    
    public static int addElements_Problem_3_e548f926_e78d_4607_9c9b_abcedd79131c(ArrayList<Integer> arr, int k) {
        return 0;
    }

    
    public static int addElements_Problem_0_88a2e97c_38f4_4005_b581_6673acb0985a(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_4_7b1af37e_70a2_4b12_9a72_cfade962afe8(ArrayList<Integer> arr, int k) {
        int sum = 0;
        if (k > arr.size())
            return 0;
        int maxDigits = Math.max(2,  Math.log10(Math.max(arr.get(0), arr.get(arr.size() - 1))) - 2);
        for (int i = 0; i < Math.min(k, arr.size()); i++) {
            sum += arr.get(i) % 10 + arr.get(i) / 100;
        }
        return sum % 10 == 0 ? sum : sum % 10 == 0 ? sum + 10 : sum;
    }

    
    public static int addElements_Problem_4_3d655a56_fe67_4cf8_9d03_2b64d60bace6(ArrayList<Integer> arr, int k) {

        // Write your code here
        return arr.stream().limit(k).mapToInteger(Integer::intValue).sum();
    }

    
    public static int addElements_Problem_1_46d28423_4c6f_4b31_ac9d_d1ffca009434(ArrayList<Integer> arr, int k) {

        // Your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_0_e204e3fd_0a3f_4d0c_b492_cf8d91e1212d(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_1_a7a61efe_14af_456f_afa3_0b5968000d1d(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_4_f1c14a85_2060_410e_93a8_a98c899630a4(ArrayList<Integer> arr, int k) {

        // Write your code here
        int n = arr.size();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_2bc2c8b9_b368_48ac_bcf3_a816771c790d(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i<arr.size()-k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_dd637cbb_2389_4ff9_8904_201b885f0b51(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_1_e5d949fe_79f0_4e83_98d8_6afe15a1dd93(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_0_86f521c9_579b_40d4_b278_4039e2a2713b(ArrayList<Integer> arr, int k) {

        // Your code here
        int sum = 0;
        for(int i = 0; i < k; i++){
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_5213e5d1_7cc8_4118_95ec_78febb590331(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            int num = arr.get(i);
            if (num < 10) {
                sum += num;
            } else if (num < 100) {
                sum += num % 10;
                sum += num / 10;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_0_67290664_a271_4e4a_94be_dbd171791c43(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_0_ca25da6c_8e93_45d7_97bb_3577084d41ec(ArrayList<Integer> arr, int k) {

        // Write your code here
        return arr.stream().limit(k).mapToInteger(x -> x).sum();
    }

    
    public static int addElements_Problem_1_54341e54_ea3f_46fc_bfdd_31435aab1e52(ArrayList<Integer> arr, int k) {
        return arr.stream().limit(k).filter(n -> n < 100).mapToInteger(Integer::intValue).sum();
    }

    
    public static int addElements_Problem_0_36b56a8c_7909_4e10_8daa_577d8bde9e1f(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_5e23cc4f_5818_45ab_938c_aa8ce53f6757(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        int res = 0;
        while (sum > 9) {
            res += sum % 10;
            sum /= 10;
        }
        res += sum;
        return res;
    }

    
    public static int addElements_Problem_3_28269ed5_31ac_414e_874e_cfc33b8a0f25(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_0_29b7bed2_be5a_49f4_8ab5_497d695ddc77(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i< arr.size(); i++) {
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_0_901d2709_d16c_4a54_9936_19bc342b1f2f(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_2_755339ac_7eed_44cb_83c6_721a91b39a25(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_2_a05dcdb5_5e4a_4b14_a7a8_d6bb3fd6fe88(ArrayList<Integer> arr, int k) {

        // Write your code here
        return arr.stream().limit(k).mapToInteger(Integer::intValue).sum();
    }

    
    public static int addElements_Problem_2_61d56cd5_a386_4675_8f56_c4882a181a55(ArrayList<Integer> arr, int k) {
        int sum = 0;
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (count < k) {
                sum += arr.get(i);
                count++;
            }
            if (count >= k) {
                sum += arr.get(i);
                count -= k + 1;
                i++;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_1_787b9d9a_90cb_4006_a05d_8f92771585bb(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_2_993e4b10_1a7a_4ba5_886e_28ab5cea6cc4(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_0_be1c71f1_3a8e_4df6_9b1e_b2007783f930(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_5163456a_6d7b_4266_9609_cbfca08eec48(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i=0;i<k;i++) {
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_3_bbccfcae_8f09_4efb_ad8f_a788afd484d2(ArrayList<Integer> arr, int k) {

        return arr.stream().limit(k).mapToInteger(Integer::intValue).sum();
    }

    
    public static int addElements_Problem_0_f560794d_9450_45d4_b5f1_fe5f04e35f1c(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_4_a5c21be9_a34d_4448_aaea_d4b3d9c2b84c(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_0_d79385e4_b2e6_4e33_b885_ca646b3ce93a(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_2_ca591e17_dc28_46f4_81d8_7c6504a39c7a(ArrayList<Integer> arr, int k) {
        return arr.stream().limit(k).filter(x -> x < 100).mapToInteger(x -> x).sum();
    }

    
    public static int addElements_Problem_2_4d66ee54_619c_4a90_9ac4_3b2b31b90579(ArrayList<Integer> arr, int k) {
        return 1;
    }

    
    public static int addElements_Problem_2_30ed58ba_c9e4_4dbb_b9e2_10ecbb913864(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for(int i = 0; i < k; i++) {
            if(arr.get(i) < 10) {
                sum += arr.get(i);
            } else if(arr.get(i) < 100) {
                sum += arr.get(i) / 10;
            } else {
                sum += arr.get(i) / 100;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_1_c9b0706f_3039_483a_95fd_57e8af6d218d(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_626aef34_cc8f_46e5_8f45_fe7115732e7d(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_2_28269ed5_31ac_414e_874e_cfc33b8a0f25(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_3_b8bfc3cc_5477_49a5_89e6_1e170deafdf6(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_0_ab965fd7_9c18_434c_9012_3ae878673a60(ArrayList<Integer> arr, int k) {

        // Write your code here
        int n = arr.size();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr.get(i);
        }
        if (sum > 99) {
            return sum;
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (count == k) {
                break;
            }
            if (arr.get(i) < 10) {
                count++;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_1_24215a82_3ff2_4ad6_944d_66279d2d20a9(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_14a62712_d3d1_4fd6_b00e_265d90a23726(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        int i = 0;
        while (i < k) {
            int temp = sum;
            sum = 0;
            while (temp > 0) {
                sum += temp % 10;
                temp /= 10;
            }
            i++;
        }
        return sum;
    }

    
    public static int addElements_Problem_1_568a7616_dd1c_4b86_b221_0cf6ecc5406d(ArrayList<Integer> arr, int k) {
        int sum = 0;
        int sum2 = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
            sum2 += arr.get(i);
        }
        return sum + sum2;
    }

    
    public static int addElements_Problem_4_9af93756_3433_4c99_b923_46bfaaac5f30(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_8ebb7175_e77c_4f8e_b9e0_133f3518521b(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_1_2ab7cfa6_ec14_47d6_a33a_6019b07b79e6(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_f6f72a8f_945e_415f_a182_7e6bc0e1550a(ArrayList<Integer> arr, int k) {

        // Write your code here
        return arr.stream().limit(k).mapToInteger(Integer::intValue).sum();
    }

    
    public static int addElements_Problem_4_073c36f6_0425_432b_9396_df856f145808(ArrayList<Integer> arr, int k) {
        int sum = 0;
        int i = 0;
        while (i < k) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
            i += 1;
        }
        return sum;
    }

    
    public static int addElements_Problem_0_e2089649_c420_43c8_bcc5_265b65008741(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_67d74c11_4a95_4ca6_bcb1_345a64b1aad2(ArrayList<Integer> arr, int k) {
        return arr.stream().limit(k).filter(x -> x <= 99).reduce(0, (x, y) -> x + y);
    }

    
    public static int addElements_Problem_0_214cacfc_5232_44fe_acd8_621dbe17596c(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_4_1781cb1b_8297_4d37_a029_36444bc105c4(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        int i = 0;
        while (i < k) {
            sum += arr.get(i);
            i++;
        }
        return sum;
    }

    
    public static int addElements_Problem_0_a39a7068_587d_4c8d_b3ca_2a4e55399674(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_0_555225b7_78bf_4263_b34e_1c9151d46242(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_25dbc2c9_82db_478a_acdf_94b9ecf084e3(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_16129956_8be3_4be8_8c58_ae9781910eb5(ArrayList<Integer> arr, int k) {
        return arr.stream().filter(x -> x < 100).limit(k).reduce(0, (x, y) -> x + y);
    }

    
    public static int addElements_Problem_1_683998cd_fe41_4e43_9a67_1d913f2dbe9d(ArrayList<Integer> arr, int k) {

        // Write your code here
        return arr.stream().limit(k).mapToInteger(x -> x).sum();
    }

    
    public static int addElements_Problem_2_87371a4e_d04f_46ff_8776_d44a91bf1af5(ArrayList<Integer> arr, int k) {
        ArrayList<Integer> elems = new ArrayList<Integer>();
        for (int el : arr) {
            if (el < 100) {
                elems.add(el);
            }
        }
        int kth = (k < elems.size()) ? k : elems.size();
        int ret = (kth > 0) ? elems.subList(0, kth).stream().reduce(0, (Integer a, Integer b) -> a + b) : 0;
        return ret;
    }

    
    public static int addElements_Problem_2_6caaff1e_7bee_465e_9748_1d6966f74614(ArrayList<Integer> arr, int k) {
        return arr.stream().limit(k).filter(e -> e.toString().length() <= 2).mapToInteger(e -> e).sum();
    }

    
    public static int addElements_Problem_4_6fe1109b_60c4_46f4_ab84_b16c0f70a574(ArrayList<Integer> arr, int k) {
        // >>> arr.stream().filter(x -> x.toString().length() <= 2).limit(k).mapToInteger(x -> x).sum()
        // (24)
        return arr.stream().filter(x -> x.toString().length() <= 2).limit(k).mapToInteger(x -> x).sum();
    }

    
    public static int addElements_Problem_0_ee545bec_84ad_4222_8b59_1d4219b95f99(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_4_a77f50f2_269c_4c14_b276_8980ff89572d(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_08114c5f_96d9_4f11_84bf_88b62ba31e07(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_0_ce5adda8_3049_4430_b12a_f42f17e4d627(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            int num = arr.get(i);
            if (num >= 100) {
                num = num % 100;
            }
            sum += num;
        }
        return sum;
    }

    
    public static int addElements_Problem_0_ecd0f4e8_ada1_4da1_97b2_4fe981269851(ArrayList<Integer> arr, int k) {

        // Write your code here
        int len = arr.size();
        int sum = 0;
        for(int i = 0; i < len; i++){
            if(i + k <= len){
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_0_c602c7ca_7cc4_4219_8721_9a9bf2774ae0(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_a714fb2f_f361_4a14_a564_667dfc126919(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_4_8bcdab1c_633a_4b27_a829_e45c3cc365c4(ArrayList<Integer> arr, int k) {
        return arr.stream().limit(k).filter(x -> x.toString().length() <= 2).mapToInteger(x -> x).sum();
    }

    
    public static int addElements_Problem_2_30b1c3a6_78a3_4500_93ca_de3d4d7b3155(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_1_82e3fb0f_bc5a_4327_a2a9_a722921f4475(ArrayList<Integer> arr, int k) {
        return arr.stream().limit(k).filter(x -> x < 100).mapToInteger(x -> x).sum();
    }

    
    public static int addElements_Problem_4_2d548dba_a2b6_46ea_a7d7_318d7c91206d(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_91ba5067_7c4a_43b1_913e_06e5683d28d2(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_2_98289b08_c935_4417_be27_6dc715118ef6(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        int i = 0;
        for (int num : arr) {
            if (i < k) {
                sum += num;
                i++;
            } else {
                break;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_1_8f745cd9_e5a7_4073_8d1b_f6f2fc01e90b(ArrayList<Integer> arr, int k) {
        return 0;
    }

    
    public static int addElements_Problem_0_ac1cbbd6_e8dc_44a2_9319_051c61e35832(ArrayList<Integer> arr, int k) {

        // Write your code here
        int len = arr.size();
        int start = 0;
        int end = len - 1;
        int sum = 0;
        while (start <= end) {
            sum += arr.get(start);
            sum += arr.get(end);
            if (sum > k) {
                sum = sum - arr.get(start);
                start++;
            } else if (sum < k) {
                sum = sum - arr.get(end);
                end--;
            } else {
                return sum;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_1_8b47ffe5_2e0c_48c9_83cb_0883afe1faf3(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_1ef3031a_743a_4252_a0d4_a29057b14e83(ArrayList<Integer> arr, int k) {
        return arr.stream().limit(k).filter(x -> x < 100).reduce(0, (x, y) -> x + y);
    }

    
    public static int addElements_Problem_2_30de6ef4_951c_4c5e_8547_62cc916792b4(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_1_659e3ed4_bcee_4fd5_b506_c609b2fbadbc(ArrayList<Integer> arr, int k) {

        // Write your code here
        return arr.stream().limit(k).mapToInteger(Integer::intValue).sum();
    }

    
    public static int addElements_Problem_2_ac738554_f122_4770_928d_0cff19ad4742(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_0_016d0ee3_3348_4e5b_b1a5_75f2445aacd1(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 10) {
                sum += arr.get(i);
            } else if (arr.get(i) < 100) {
                sum += arr.get(i) - (arr.get(i) % 10);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_2_a42e51f1_26bd_4bb0_93cd_18335d545207(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_2_e48e33c1_1ab2_4da6_9252_8f2a71d11fcf(ArrayList<Integer> arr, int k) {
        int sum = 0;
        int maxSum = 0;
        int maxSumIndex = 0;
        int maxSumDigit = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        for(int i = 0; i < k; i++) {
            int digit = arr.get(i) % 10;
            sum += digit;
            if(maxSumDigit < digit) {
                maxSumDigit = digit;
                maxSumIndex = i;
                maxSum = sum;
            }
        }
        return maxSum;

    }

    
    public static int addElements_Problem_3_fdbddc60_d9de_43d4_8290_385655969ba8(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            int num = arr.get(i);
            if (num < 100) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_1_b50dbcde_d4fc_45c9_b938_904b8c46a34e(ArrayList<Integer> arr, int k) {

        // Write your code here
        return arr.stream().limit(k).mapToInteger(Integer::intValue).map(x -> x % 10 + (x / 10) % 10).sum();
    }

    
    public static int addElements_Problem_1_3edc93ac_3b56_45a8_9507_e84daba58da8(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_8b080bef_1863_41df_b5a4_c6ad89ef946a(ArrayList<Integer> arr, int k) {
        // Your code goes here.
        return 0;
    }

    
    public static int addElements_Problem_0_839a1920_030f_4bea_b6f3_7b0fd8642bb2(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_0_8dc9e32a_d260_49f0_950b_71579716fc81(ArrayList<Integer> arr, int k) {
        return StreamSupport.stream(arr.spliterator(), False).mapToInteger(n -> (n < 100) ? n : 0).sum();
    }

    
    public static int addElements_Problem_1_109a8dd7_bff8_4794_b9ad_3753ee67ac06(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i<k; i++){
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_1_9a82551a_185f_4bb5_bf8d_80a07cad4042(ArrayList<Integer> arr, int k) {
        return arr.stream().limit(k).filter(x -> x < 100).mapToInteger(x -> x).sum();
    }

    
    public static int addElements_Problem_3_46d28423_4c6f_4b31_ac9d_d1ffca009434(ArrayList<Integer> arr, int k) {

        // Your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_4_32fba272_32a7_43b3_ae51_f987de3998fe(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_85bfb2fa_5829_4a8a_b604_7af5fb705975(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_ca25da6c_8e93_45d7_97bb_3577084d41ec(ArrayList<Integer> arr, int k) {

        // Write your code here
        return arr.stream().limit(k).mapToInteger(x -> x).sum();
    }

    
    public static int addElements_Problem_4_44526b27_a5e9_4557_a0d9_f3e9ed908dfa(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_6cddfc8e_4027_4a48_ab38_11fdc7449782(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_a8ee8b57_b0ec_438d_85ba_10ad12451203(ArrayList<Integer> arr, int k) {
        if (k <= 0) {
            return 0;
        }
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 10) {
                sum += arr.get(i);
            } else if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_2_e8e3c4cf_e7ff_43ed_bdbe_7a0725f9bca9(ArrayList<Integer> arr, int k) {
        return arr.stream().limit(k).filter(x -> x < 100).reduce(0, (x, y) -> x + y);
    }

    
    public static int addElements_Problem_3_0b2319ac_02d3_4a4c_8983_74430b13edbc(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i<k; i++) {
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_3_3fcb179e_dd57_43f8_922f_38c04a7b43be(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (i == k) {
                break;
            }
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_3_46951616_4f16_4b97_9fc8_bcd284080d0b(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_0_a476a392_e1a7_49c2_902b_a2dd2ed55bf5(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_ad9479c5_109e_41fe_a060_b3d767089e94(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_4_b6d72bd7_880f_43a8_b64f_562c66420fd1(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_ab965fd7_9c18_434c_9012_3ae878673a60(ArrayList<Integer> arr, int k) {

        // Write your code here
        int n = arr.size();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr.get(i);
        }
        if (sum > 99) {
            return sum;
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (count == k) {
                break;
            }
            if (arr.get(i) < 10) {
                count++;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_0_95a8b919_ea32_42c0_9a7b_9c95b805c154(ArrayList<Integer> arr, int k) {
        int result = 0;
        for (int i = 0; i < k; i = i + 1) {
            if (Math.floor(arr.get(i).doubleValue() / 10d) < 1d) {
                result = result + arr.get(i);
            }
        }
        return result;
    }

    
    public static int addElements_Problem_3_46945bef_ec77_4feb_99fc_d2db8fe60ded(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            int num = arr.get(i);
            if (num < 100) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_4_fac6a74f_2bff_44f3_8d0b_d2a5f1071495(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_4_a951b8ee_4ef9_48df_b5d7_29a9af760836(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_fe0f8a80_75b0_4f36_ab97_c2683aee85e8(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_0_f1c9de6c_6e72_461e_af66_d700345ebec0(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_0_ae6722c2_9d28_437c_98f9_7003bb2350a0(ArrayList<Integer> arr, int k) {
        return arr.stream().limit(k).filter(x -> x < 100).reduce(0, (x, y) -> x + y);
    }

    
    public static int addElements_Problem_4_8cad8120_70dd_4dc2_aa7d_a9295ca2f071(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for(int i = 0; i < k; i++) {
            if(arr.get(i) < 10) {
                sum += arr.get(i);
            } else if(arr.get(i) < 100) {
                sum += arr.get(i);
            } else {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_0_70167f05_7372_4f58_a15d_8955ce223353(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i< k; i++){
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_0_093e7bce_8625_49e1_a1be_ec817f94f5df(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_0_f1576de5_0468_47e7_9fa0_1404f62cee1f(ArrayList<Integer> arr, int k) {

        // Write your code here
        int len = arr.size();
        int start = 0;
        int end = len - 1;
        int sum = 0;
        while (start <= end) {
            sum += arr.get(start);
            if (sum >= k) {
                sum -= arr.get(end);
                end--;
            } else {
                start++;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_3_a6f0752c_5d53_4e50_90f6_b4e35a1895c1(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            int num = arr.get(i);
            if (num < 10) {
                sum += num;
            } else if (num < 100) {
                sum += num / 10;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_1_06ec1fc1_e246_4a64_8ac8_3126c90dd9ca(ArrayList<Integer> arr, int k) {
        return arr.stream().filter(x -> x < 100).limit(k).mapToInteger(x -> x).sum();
    }

    
    public static int addElements_Problem_4_ab5a6294_2ff0_40ad_86b7_b26448cbfad3(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_4_6810f905_77a1_4975_ace5_c3ce36543cf3(ArrayList<Integer> arr, int k) {
        return arr.stream().limit(k).filter(x -> x < 100).reduce(0, (x, y) -> x + y);
    }

    
    public static int addElements_Problem_0_e89588a0_d751_4d69_adcc_b7f25f20cd0a(ArrayList<Integer> arr, int k) {

        // Write your code here
        int len = arr.size();
        int i = 0;
        int sum = 0;
        while(i < len) {
            if(i + k <= len) {
                sum += arr.get(i);
                i += k;
            } else {
                sum += arr.get(i);
                break;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_1_30fcdfda_9754_4fa6_a8ba_faebda010c1c(ArrayList<Integer> arr, int k) {
        int index = 0;
        int sum = 0;
        while (index < k) {
            int elem = arr.get(index);
            if (elem < 10) {
                sum += elem;
            } else if (elem < 100) {
                sum += elem;
            }
            index++;
        }
        return sum;
    }

    
    public static int addElements_Problem_4_b6e4cbdb_e5a5_4d16_a880_3c5f02a71d8a(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_5e62f928_3747_408f_b1ab_044f6cfc1d78(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_0_ee4ee21c_81e4_4319_b32e_8ce9c6d481e7(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_4_5d372076_e337_4ca0_ad70_647491960871(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_4_ab04d6c2_0135_4c3b_83f2_f26a5d9a1c1a(ArrayList<Integer> arr, int k) {

        // Write your code here
        return arr.stream().limit(k).mapToInteger(Integer::intValue).sum();
    }

    
    public static int addElements_Problem_3_782c8664_6a1e_4de9_b925_e98c5726fc92(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_4_476feb18_c1aa_4626_8ece_7600556a9e59(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            String s = arr.get(i).toString();
            if (s.length() <= 2) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_4_e13c953e_9846_4893_a936_97a4cbc4d9d1(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_0_b6f086f7_bf79_4762_951b_ba53544b5c8b(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for(int i = 0; i < k; i++){
            if(arr.get(i) < 10){
                sum += arr.get(i);
            }
            else if(arr.get(i) < 100){
                sum += arr.get(i);
                sum -= arr.get(i) % 10;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_2_8d22d0a2_e9d4_4c58_be4d_007b5e6e7034(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_1_0f987b91_32ca_4f23_89f8_e01e189bac2b(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_4_83ae8097_4317_462b_85f7_fb81aac37a8c(ArrayList<Integer> arr, int k) {
        return arr.stream().filter(x -> x < 100).limit(k).mapToInteger(x -> x).sum();
    }

    
    public static int addElements_Problem_2_40fd3c43_165a_4c80_a604_05b1abf3583c(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_11bcb5a5_14b2_4852_aa35_d0b73d40be5d(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 10) {
                sum += arr.get(i);
            } else if (arr.get(i) < 100) {
                sum += arr.get(i) / 10 + arr.get(i) % 10;
            } else {
                sum += arr.get(i) / 100 + arr.get(i) % 100 / 10 + arr.get(i) % 100 % 10;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_4_ae1dd2fc_00e2_49dc_b431_9cec96b01b26(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_4_627e7f1b_d64f_419f_8eff_01a8390d80e5(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_1a11aa60_d054_4c8e_8247_b81bfc0c19f7(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_1_34eb8995_3180_4a4d_b205_7812aa04713d(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) <= 99) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_3_7a291287_112d_43ac_b31f_5fe6c102f3bb(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_0_8ebb7175_e77c_4f8e_b9e0_133f3518521b(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_2_9fb26cca_69ce_44b3_91eb_a5471c51700f(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_5b2b98c6_9201_421f_a1bf_e27f4281c3be(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_4_f3c8ea00_efd8_4820_bd14_48e75cc5ded2(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_0_969777ea_8ed4_40f0_a80c_05ee5a3bc942(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) >= 10 && arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_4_558d4fea_b98e_4108_8294_8f25aad629c6(ArrayList<Integer> arr, int k) {

        int len = arr.size();
        int i = 0;
        int j = len - 1;
        int sum = 0;
        while (i < j) {
            sum += arr.get(i);
            if (sum > k) {
                sum -= arr.get(j);
                j--;
            } else {
                i++;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_2_3c331023_dbd5_4b18_b0db_4b373bf511f5(ArrayList<Integer> arr, int k) {
        return arr.stream().limit(k).filter(x -> x < 100).reduce(0, (x, y) -> x + y);
    }

    
    public static int addElements_Problem_2_f3946b0b_e9db_4d49_b3ef_a35e115365b9(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_1_5225306d_5d4a_49ee_bdf2_9010b25867c9(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 1; i <= k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_3af24118_b778_4f32_8ebd_fb76e02a7090(ArrayList<Integer> arr, int k) {

        // Your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_b8dda961_28e5_4698_9335_3deb3913c890(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_6bd87348_097a_4262_a781_665801a78335(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_4_7caaaeb5_91dc_40a6_9255_d926a3101107(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_4_4c4f2b68_4e2f_4908_ab29_e4a19ec9eb35(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_2e2fd028_684a_49eb_a37f_a85e7cb4bf9e(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) >= 10) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_1_e5a0e429_ba15_4dc9_a4fa_c41cc23fc6e3(ArrayList<Integer> arr, int k) {
        return arr.stream().limit(k).filter(x -> x < 100).mapToInteger(x -> x).sum();
    }

    
    public static int addElements_Problem_3_9a9e1a4a_6f9e_42df_8289_00d9aaaf7e78(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_3_ca3f571c_5202_4a64_92f6_f5a3071773de(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_4_27a8c491_da31_48c4_b0fe_fd8a49d50db2(ArrayList<Integer> arr, int k) {
        return arr.stream().limit(k).filter(x -> x < 100).reduce(0, (x, y) -> x + y);
    }

    
    public static int addElements_Problem_4_08754c1a_2a05_4302_b89f_52d79a55b4db(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_1203aac5_111d_4464_9969_813d8d038fb8(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for(int i = 0; i < k; i++) {
            if(arr.get(i) < 10) {
                sum += arr.get(i);
            } else if(arr.get(i) < 100) {
                sum += arr.get(i);
            } else {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_1_3dedd83a_35df_4487_bd5a_76d9fcd6da3f(ArrayList<Integer> arr, int k) {
        int sum = 0;
        int max = 0;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
            max = Math.max(max, arr.get(i));
            min = Math.min(min, arr.get(i));
        }
        sum += max;
        sum += min;
        return sum;
    }

    
    public static int addElements_Problem_0_3cc61ab8_cbb4_4a9c_9163_3b672d2110f8(ArrayList<Integer> arr, int k) {
        return arr.stream().limit(k).filter(x -> x < 100).reduce(0, (x, y) -> x + y);
    }

    
    public static int addElements_Problem_1_7e592b0c_03dc_4e3f_bbd1_5a8d0788a02b(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 99) {
                continue;
            }
            sum += arr.get(i);
            if (i == k - 1) {
                break;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_1_a8d5b767_28d8_4d6e_bf47_44cd4a097f74(ArrayList<Integer> arr, int k) {

        // Write your code here
        return arr.stream().limit(k).mapToInteger(Integer::intValue).sum();
    }

    
    public static int addElements_Problem_1_c7e47870_b84a_4d2b_ab68_2082b0b7e86d(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        int i = 0;
        while (i < k) {
            int j = i + 1;
            while (j < k && arr.get(i) == arr.get(j)) {
                j++;
            }
            if (j - i <= 2) {
                sum += arr.get(i);
            }
            i = j;
        }
        return sum;
    }

    
    public static int addElements_Problem_1_81574c41_6040_4398_ba41_d688cbd481b0(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_0_f28c144c_0b92_49bb_90b1_f44bb630dc6e(ArrayList<Integer> arr, int k) {
        int sum = 0;
        int max = 0;
        int min = 0;
        for(int i = 0; i< arr.size(); i++) {
            max = Math.max(max, arr.get(i));
            min = Math.min(min, arr.get(i));
        }
        for(int i = 0; i< arr.size(); i++) {
            sum += arr.get(i);
            if(sum >= max && sum < (max-min)) {
                sum += (max-min);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_2_60716c18_4fca_48e5_b8df_306f80a9039b(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_b13d722f_1b6d_4616_a62b_e9f563b2b4e3(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_0_3a3069b3_64b7_4c3f_9649_7b934ac36558(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_1_91ba5067_7c4a_43b1_913e_06e5683d28d2(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_0_d4ee99ff_542e_453f_b4ee_06f057785e24(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_1e8b1011_eee8_4a1d_a9f8_33bc7dd08b48(ArrayList<Integer> arr, int k) {

        // Write your code here
        return arr.stream().limit(k).mapToInteger(x -> x).sum();
    }

    
    public static int addElements_Problem_1_9db41a97_8e62_4a1e_9293_62741f609b6f(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_2_f9ab9eb3_71fb_4ca4_8cf9_b8d7de678386(ArrayList<Integer> arr, int k) {
        if (arr.size() < 1) {
            return 0L;
        }
        if (k > arr.size()) {
            k = arr.size();
        }
        int sum = 0L;
        boolean isFirstDigitDigit = False;
        for (int i = 0; i < k; i++) {
            int sum2 = sum + arr.get(i);
            boolean isFirstDigitDigit2 = isFirstDigitDigit;
            if (sum2 % 10L == 0 && sum2 > 0){
                return sum;
            }
            sum = 0L;
            isFirstDigitDigit = False;
            int lastDigitSum = sum2;
            for (int j = i; j < arr.size(); j++) {
                int sum3 = sum2 + arr.get(j);
                if (sum3 % 10L == 0 && sum3 > 0) {
                    if (sum3 > lastDigitSum) {
                        lastDigitSum = sum3;
                        sum = sum3;
                        isFirstDigitDigit = True;
                    }
                }
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_1_fd74e686_8be5_496b_a48c_61d10bcb2dca(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        int i = 0;
        while (i < k) {
            if (arr.get(i) < 100) {
                break;
            }
            sum += arr.get(i) % 100;
            i++;
        }
        return sum;
    }

    
    public static int addElements_Problem_2_b75a8857_aecd_43a0_acea_4a371b481eab(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_062c946e_6836_41f5_b550_7f72bd58fe12(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            int num = arr.get(i);
            if (num < 100) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_0_681ef997_0bb2_4fe6_a246_2586fd704f00(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i<k; i++){
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_4_2ae18eee_13a3_4c83_b7b1_f40b0df2d9d5(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_4_a7a61efe_14af_456f_afa3_0b5968000d1d(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_1_29c97820_a059_4596_88ce_9677a8ba2846(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_1_1c604c12_1f24_4874_b342_8024e29a711b(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_0_f9f4a199_3c74_4a9c_83be_f86a6a00d23a(ArrayList<Integer> arr, int k) {
        return arr.stream().limit(k).filter(x -> x < 100).reduce(0, (x, y) -> x + y);
    }

    
    public static int addElements_Problem_3_a3b2902a_2276_47bd_a90e_aa4d641c7159(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_0_6394ecff_3e5e_49df_b69e_3ea1806164e4(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_4_f51b4f29_5288_438c_9443_5ef7d4ff141f(ArrayList<Integer> arr, int k) {
        // Your code here
        return 0;
    }

    
    public static int addElements_Problem_2_a041a3ec_bdcf_430c_9fb0_59c2f8b5b75d(ArrayList<Integer> arr, int k) {

        return arr.stream().limit(k).mapToInteger(l -> l).sum();
    }

    
    public static int addElements_Problem_2_9885b1e5_5dd2_4543_a497_dde17930e395(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_0_786b8c63_fc4d_428f_8d52_b7f6bb216049(ArrayList<Integer> arr, int k) {

        // Write your code here
        return arr.stream().limit(k).mapToInteger(Integer::intValue).filter(i -> i < 10 || i > 99).sum();
    }

    
    public static int addElements_Problem_4_d317be96_bfc9_498b_90d6_13dfd39d23df(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_1470d7b4_0f85_42dd_a955_ac0e81408d4a(ArrayList<Integer> arr, int k) {

        ArrayList<Integer> arr2 = new ArrayList<Integer>();
        for(int i = 0; i < arr.size(); i++) {
            if(i < k) {
                arr2.add(arr.get(i));
            }
        }
        int sum = 0;
        for(int i = 0; i < arr2.size(); i++) {
            sum += arr2.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_98250708_9e4a_4db5_943e_ee64da1ada2e(ArrayList<Integer> arr, int k) {
        return arr.stream().limit(k).filter(x -> x < 100).reduce(0, (x, y) -> x + y);
    }

    
    public static int addElements_Problem_0_9fb4cb20_dd0c_4b3d_b182_72de8cc3b75b(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_2_c8ca3587_c516_4854_9cd7_9aae4cab7009(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        int i = 0;
        while(i < k) {
            sum += arr.get(i);
            i++;
        }
        return sum;
    }

    
    public static int addElements_Problem_0_e3cf34bf_e387_4fe5_b288_a8f4f64bc763(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_fa133a04_1689_4cdd_8f3e_087225574612(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_6a9a703c_dff3_4b6a_8079_3f8f26f2dc69(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_0_90363815_0756_472d_a6c6_c3046f0e87b5(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i< arr.size()-k; i++){
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_8194b20b_8248_433a_8d64_833ac85894ed(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_ddad392f_5168_4b78_8ea6_0ab0d35d8eb3(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_525a12f8_7553_46c7_bde2_1c9a28aeb535(ArrayList<Integer> arr, int k) {

        ArrayList<Integer> arr2 = new ArrayList<Integer>();
        int j = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (j < k) {
                arr2.add(arr.get(i));
                j++;
            }
        }
        int sum = 0;
        for (int i = 0; i < arr2.size(); i++) {
            sum += arr2.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_5cfbaa3a_3245_4020_8a99_19581fa63ffe(ArrayList<Integer> arr, int k) {
        if (k > arr.size())
            k = arr.size();

        int sum = 0;
        int remain = k;

        for (int i = 0; i < k; i++) {
            remain -= arr.get(i);
            sum += remain;
        }

        return sum;
    }

    
    public static int addElements_Problem_4_562a263f_4de7_401d_9eae_3de738a7b9a8(ArrayList<Integer> arr, int k) {
        return arr.stream().limit(k).filter(x -> x < 100).mapToInteger(x -> x).sum();
    }

    
    public static int addElements_Problem_3_8dd77e4f_e285_4486_95bf_da5200f3620a(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_3_078f6dba_c8e7_4ee6_9cb3_7af0c4482f0a(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_8dd77e4f_e285_4486_95bf_da5200f3620a(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_0_4ec8eb36_c79e_4bde_9246_83163049f6d8(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i< arr.size()-k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_4_a4d35b2d_83c1_49d9_92c2_f2c510a1f326(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        int i = 0;
        while(i < k) {
            sum += arr.get(i);
            i++;
        }
        return sum;
    }

    
    public static int addElements_Problem_2_ae11f72f_4eda_41f7_aa5d_191d40c78443(ArrayList<Integer> arr, int k) {
        return arr.stream().limit(k).filter(x -> x < 100).reduce(0, (x, y) -> x + y);
    }

    
    public static int addElements_Problem_4_ddbcb832_f510_4934_8c2a_3a57fc3cef98(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_0_5224fa7c_6ed9_4ede_861d_6c0027a633d3(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_2_8e05e58e_1a38_4096_a3ad_19894e8c2a11(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_0_38a1d821_cf7d_47e7_a578_33688a507fbf(ArrayList<Integer> arr, int k) {

        // Write your code here
        ArrayList<Integer> arr2 = new ArrayList<Integer>();
        int sum = 0;
        for (int i = 0; i < k; i++) {
            arr2.add(arr.get(i));
        }
        for (int i = 0; i < arr2.size(); i++) {
            sum += arr2.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_4_cc382de1_1692_4750_8d83_34339c36adb5(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            int num = arr.get(i);
            if (num < 10) {
                sum += num;
            } else if (num < 100) {
                sum += num - (num % 10);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_4_dd637cbb_2389_4ff9_8904_201b885f0b51(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_3_cc382de1_1692_4750_8d83_34339c36adb5(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            int num = arr.get(i);
            if (num < 10) {
                sum += num;
            } else if (num < 100) {
                sum += num - (num % 10);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_2_3c8d856b_383b_4773_898b_38dbe352ae1e(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_a0e55dfa_8650_4f0f_aab0_406e740f5729(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_1_f018019f_2f09_4193_b8f5_5136db08138c(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i=0;i<k;i++){
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_3_f37d6d10_b29c_427a_a186_3cad27b9c8c8(ArrayList<Integer> arr, int k) {
        return arr.stream().limit(k).filter(x -> x < 100).mapToInteger(x -> x).sum();
    }

    
    public static int addElements_Problem_2_ae6362b5_cf9c_4ac8_80f4_cb19b5efbb23(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_016d0ee3_3348_4e5b_b1a5_75f2445aacd1(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 10) {
                sum += arr.get(i);
            } else if (arr.get(i) < 100) {
                sum += arr.get(i) - (arr.get(i) % 10);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_1_2a9f87a3_a951_4921_9102_137be5560141(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_4_453afb9f_d701_457d_b812_e6b92f6ebbba(ArrayList<Integer> arr, int k) {
        int i = 0;
        int ans = 0;
        while (i < k) {
            if (arr.get(i) < 100) {
                ans = ans + arr.get(i);
            }
            i = i + 1;
        }
        return ans;
    }

    
    public static int addElements_Problem_0_d180c610_8dff_454d_9da1_726aa3ec3af4(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_2_8b756e9e_7454_4fa3_8226_5c3f095ddfbb(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_4_9c8fa3ef_e293_43ee_83e2_751a009be85f(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_3_555a32c4_bf3e_4e37_9b52_88ba1f495999(ArrayList<Integer> arr, int k) {
        return (k == 0 ? 0 : arr.get((k - 1)) > 100 ? addElements_Problem_3_555a32c4_bf3e_4e37_9b52_88ba1f495999(arr, k - 1) : addElements_Problem_3_555a32c4_bf3e_4e37_9b52_88ba1f495999(arr, k - 1) + arr.get((k - 1)));
    }

    
    public static int addElements_Problem_1_9f5f0596_42bd_4254_8c2c_f18ff9c33986(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for(int i = 0; i < k; i++){
            if(arr.get(i) < 10){
                sum += arr.get(i);
            }
            else if(arr.get(i) < 100){
                sum += arr.get(i);
                sum += arr.get(i);
            }
            else{
                sum += arr.get(i);
                sum += arr.get(i);
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_1_6ceb75f7_450d_4686_8400_2aad890306b7(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 10) {
                sum += arr.get(i);
            } else if (arr.get(i) < 100) {
                sum += arr.get(i) / 10;
            } else {
                sum += arr.get(i) / 100;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_0_afb82dbd_adef_48d7_903b_ba3d77a35fa0(ArrayList<Integer> arr, int k) {
        List<Integer> myIntegers = arr.stream().filter(n -> n < 100).collect(Collectors.toList());
        int[] myArray = myIntegers.stream().mapToInteger(l -> l).toArray();
        Arrays.sort(myArray);
        Integer[] myIntegerArray = Arrays.stream(myArray).boxed().toArray(Integer[]::new);
        ArrayList<Integer> myIntegerArrayList = new ArrayList<Integer>(Arrays.asList(myIntegerArray));
        int mySum = 0;
        for (int i = 0; i < myIntegerArrayList.size(); i++) {
            if (i == k) {
                break;
            }
            mySum += myIntegerArrayList.get(i);
        }
        return mySum;
    }

    
    public static int addElements_Problem_3_1ef53c23_e4fd_4dd2_b181_e81a03e63216(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_8ce801ba_29d6_4dfe_92e1_b797702f1357(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_3_9d832a0f_bb84_4697_bca2_b718650a7bdb(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_0_45675520_f0c2_4e4b_9487_2f8059799a5c(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 10) {
                sum += arr.get(i);
            } else if (arr.get(i) < 100) {
                sum += arr.get(i) / 10 + arr.get(i) % 10;
            } else {
                sum += arr.get(i) / 100 + arr.get(i) % 100 / 10 + arr.get(i) % 100 % 10;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_3_dcd2cbb3_2989_4713_be8b_5569eb47336d(ArrayList<Integer> arr, int k) {

        return arr.stream().limit(k).map(x -> String.valueOf(x).length() <= 2 ? x : 0).mapToInteger(x -> x).sum();
    }

    
    public static int addElements_Problem_2_4c2a901a_07bb_49f8_b98f_118f01114ec8(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_3_087be793_e9c3_4e66_8d43_aa258de87562(ArrayList<Integer> arr, int k) {
        return arr.stream().limit(k).filter(x -> x < 100).mapToInteger(x -> x).sum();
    }

    
    public static int addElements_Problem_2_a59b8972_d81c_46fe_a641_2c6b797538db(ArrayList<Integer> arr, int k) {

        // Write your code here
        return arr.stream().limit(k).mapToInteger(x -> x).sum();
    }

    
    public static int addElements_Problem_2_ac974388_4f7f_4dcc_a8e4_518175148b73(ArrayList<Integer> arr, int k) {
        return arr.stream().filter(x -> x < 100).limit(k).reduce(0, (x, y) -> x + y);
    }

    
    public static int addElements_Problem_2_47c18bf6_c3fa_4ec0_97a8_70ff718315cc(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_3a6015ec_a081_46f2_908e_33d4e240a1bc(ArrayList<Integer> arr, int k) {
        return 0;
    }

    
    public static int addElements_Problem_2_bb1b8492_a5ff_48a7_b42b_04cf14ed2d0a(ArrayList<Integer> arr, int k) {
        int result = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) >= 100) {
                arr.set(i, 99);
            }
        }
        for (int i = 0; i < k; i++) {
            result += arr.get(i);
        }
        return result;
    }

    
    public static int addElements_Problem_2_a0b89d8d_5121_4644_9122_b032757c1b41(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_519ac2bc_4103_4670_861d_e729c0726eda(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) > 9) {
                sum += arr.get(i);
            } else {
                sum += arr.get(i) * 10;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_1_0ce1d843_2c14_4280_9755_68959d25afe5(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for(int i = 0; i < k; i++){
            if(arr.get(i) < 10){
                sum += arr.get(i);
            }
            else if(arr.get(i) < 100){
                sum += arr.get(i);
                sum += arr.get(i) / 10;
            }
            else{
                sum += arr.get(i) / 100;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_0_88f49cfa_3cc7_472a_ae3e_38cee3291941(ArrayList<Integer> arr, int k) {

        ArrayList<Integer> arr2 = new ArrayList<Integer>();
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) < 10) {
                arr2.add(arr.get(i));
            }
        }
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr2.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_0_70c1317b_79b0_41cd_be9a_108b3ed55ab5(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_4_1b7601a8_3bf2_4e25_b464_b10fd79af4fd(ArrayList<Integer> arr, int k) {
        // Replace this line with your solution.
        return (0);
    }

    
    public static int addElements_Problem_2_0f367103_90f6_45bd_86c8_6c27f8c1fbdb(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            int num = arr.get(i);
            if (num < 100) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_4_db13bc10_a5a1_4765_a5fd_81b993c51fd7(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_981cd110_7f06_4196_95b0_5fe3d15c432e(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        int i = 0;
        while (i < k) {
            sum += arr.get(i);
            i++;
        }
        return sum;
    }

    
    public static int addElements_Problem_4_d6668cda_dbfc_4fd5_a992_098a34575e65(ArrayList<Integer> arr, int k) {

        // Write your code here
        return arr.stream().limit(k).mapToInteger(Integer::intValue).filter(x -> x < 10 || x > 99).sum();
    }

    
    public static int addElements_Problem_2_eaa0a5d6_b6cf_4998_90c5_04b29b5ad2f5(ArrayList<Integer> arr, int k) {
        // first, we need to create a subarray of arr with only the first k elements.
        // Since we don't have a built-in library method to do that, we will just
        // iterate from the beginning of arr to k and populate a new ArrayList with
        // those elements.
        ArrayList<Integer> subArr = new ArrayList<Integer>();
        for (int i = 0; i < k; i++) {
            subArr.add(arr.get(i));
        }
        // Now, we need to filter the subarray to just elements with two digits.
        // Again, since we don't have a built-in library method to do that, we will
        // iterate over the array and only add elements that have two digits to a
        // new ArrayList.
        ArrayList<Integer> filteredSubArr = new ArrayList<Integer>();
        for (int i = 0; i < subArr.size(); i++) {
            if (subArr.get(i) > 9 && subArr.get(i) < 100) {
                filteredSubArr.add(subArr.get(i));
            }
        }
        // Now, we need to return the sum of the elements in filteredSubArr. Again,
        // since we don't have a built-in library method to do that, we will iterate
        // over filteredSubArr and sum the elements.
        int sum = 0;
        for (int i = 0; i < filteredSubArr.size(); i++) {
            sum += filteredSubArr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_b5707718_3d76_4abd_9ec3_2966fd42903c(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_1ef3031a_743a_4252_a0d4_a29057b14e83(ArrayList<Integer> arr, int k) {
        return arr.stream().limit(k).filter(x -> x < 100).reduce(0, (x, y) -> x + y);
    }

    
    public static int addElements_Problem_3_8faa1d52_8f4f_41a0_8b51_3df590b3847b(ArrayList<Integer> arr, int k) {
        int sum = 0;
        int max = 0;
        int min = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
            max = Math.max(max, arr.get(i));
            min = Math.min(min, arr.get(i));
        }
        sum += max;
        sum += min;
        return sum;
    }

    
    public static int addElements_Problem_1_096a8739_3cf5_4bf7_9312_4d782d9db5a4(ArrayList<Integer> arr, int k) {
        int result = 0;
        for (int index = 0; index < k; index++) {
            result += ((arr.get(index) < 100) ? arr.get(index) : 0);
        }
        return result;
    }

    
    public static int addElements_Problem_4_d4ac403f_66ef_4ca5_9363_95576e78e8b3(ArrayList<Integer> arr, int k) {
        return arr.stream().limit(k).filter(x -> x < 100).mapToInteger(x -> x).sum();
    }

    
    public static int addElements_Problem_0_8b47c449_cd77_4960_ad4a_f7c5c9340a10(ArrayList<Integer> arr, int k) {
        // Write your code here
        return 0;
    }

    
    public static int addElements_Problem_2_003fcd57_1c49_4942_89cd_9a79ec4d21d9(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_1_c92a3773_a3bf_4adb_ba63_5aa838e9c004(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_2_493087a8_d97d_4939_a496_9c8bdcff8b15(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_4_b27f2575_25a4_4e1b_a090_e45936be2e65(ArrayList<Integer> arr, int k) {
        // sum of the elements with at most two digits from the first k elements of arr
        return arr.stream().limit(k).filter(x -> x < 100).reduce(0, (x, y) -> x + y);
    }

    
    public static int addElements_Problem_3_413bc288_0e71_4a5b_8776_05651ddd2af6(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i<k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_493087a8_d97d_4939_a496_9c8bdcff8b15(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_0_be7ce192_eb1b_4cbd_b0a8_c7ed17275678(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_0_37cd2d24_400d_4bee_878e_4dd50ed17aa1(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_a41838ad_53e6_4d55_a20c_09b457eeab56(ArrayList<Integer> arr, int k) {
        return 0;
    }

    
    public static int addElements_Problem_0_08dc81fc_b5b0_4c25_bf05_e1f21cdbbdfb(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_7d79f912_ed37_45b1_847e_8768c0014f37(ArrayList<Integer> arr, int k) {

        // Write your code here
        int len = arr.size();
        int i = 0;
        int j = len - 1;
        int sum = 0;
        while (i < j) {
            if (arr.get(i) + arr.get(j) <= k) {
                sum += arr.get(i) + arr.get(j);
                i++;
            } else {
                sum += arr.get(j) - arr.get(i);
                j--;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_3_d8cb849e_b132_4a00_8986_594d9dfe74e0(ArrayList<Integer> arr, int k) {

        // Write your code here
        int n = arr.size();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr.get(i);
        }
        int ans = sum;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                ans += arr.get(j);
            }
        }
        return ans;
    }

    
    public static int addElements_Problem_0_14c97f9b_1195_41a9_8390_da47bcb0e41e(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_3_e4a00d78_75bc_4994_8a8f_81f330e3110d(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 10) {
                sum += arr.get(i);
            } else if (arr.get(i) < 100) {
                sum += arr.get(i) - (arr.get(i) % 10);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_4_85bfb2fa_5829_4a8a_b604_7af5fb705975(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_0_43e5817b_7127_47eb_88a3_746b261cb12d(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_2_b43cb919_0f56_4107_8682_53934eb4c85d(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_3155c73b_b1e4_4827_8bd2_ad5360940ba9(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_0_5763d0d4_a1e3_4db5_992e_103913c5874a(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_608bb4ff_e661_455b_8c0d_02b583299785(ArrayList<Integer> arr, int k) {
        return arr.stream().limit(k).filter(x -> x < 100).mapToInteger(x -> x).sum();
    }

    
    public static int addElements_Problem_4_7cfb0ffc_602c_41b9_9f71_f023114d3d9f(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_1b21a8a8_5f09_44f1_8b77_916f78b1f7ce(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            int num = arr.get(i);
            if (num < 100) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_1_20c287e3_b319_4039_a01c_ba9916245433(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_0_a2ee8221_119c_449a_bb97_29522fc06112(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 10) {
                sum += arr.get(i);
            } else if (arr.get(i) < 100) {
                sum += arr.get(i) - (arr.get(i) % 10);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_0_95afaa58_f486_40b6_907f_af8f555446df(ArrayList<Integer> arr, int k) {

        // Your code here
        // return 0;
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_0_55b06019_b840_4b12_b7f0_6ecae14c930c(ArrayList<Integer> arr, int k) {

        int sum = 0;
        int size = arr.size();
        if (k > size) {
            k = size;
        }
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_4_993e4b10_1a7a_4ba5_886e_28ab5cea6cc4(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_4_3aa3432e_93f7_4b43_bdd5_39faacd8df43(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_2_0b2d8184_0d36_49b2_b166_3e893df03be2(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_3c331023_dbd5_4b18_b0db_4b373bf511f5(ArrayList<Integer> arr, int k) {
        return arr.stream().limit(k).filter(x -> x < 100).reduce(0, (x, y) -> x + y);
    }

    
    public static int addElements_Problem_0_5a1a0710_11ae_40a5_b960_f7991526be74(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        int i = 0;
        while (i < k) {
            sum += arr.get(i);
            i++;
        }
        return sum;
    }

    
    public static int addElements_Problem_3_a491fb98_070e_48e8_88e2_e6db0fcad92f(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_1_33c9145d_8bbf_4fc9_86a5_e9d042f02e60(ArrayList<Integer> arr, int k) {

        // Write your code here
        int n = arr.size();
        int i = 0;
        int j = n - 1;
        int sum = 0;
        while (i < j) {
            int a = arr.get(i);
            int b = arr.get(j);
            if (a + b <= k) {
                sum += a + b;
                i++;
            } else {
                sum += a;
                sum += b;
                j--;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_0_23d007f5_01d4_499b_8761_e45dcedf8dd3(ArrayList<Integer> arr, int k) {
        return arr.stream().limit(k).filter(x -> x < 100).reduce(0, (a, b) -> a + b);
    }

    
    public static int addElements_Problem_0_e4e18c43_7b58_4f1c_995c_f847334cc16d(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_0_7cd7d95b_2617_4352_ac20_1dc5599dd67f(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        int temp = sum;
        while (temp > 99) {
            sum = sum % 100;
            temp = temp / 100;
        }
        return sum;
    }

    
    public static int addElements_Problem_0_c4e5e444_e101_4b9c_9804_c52066440ff7(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_6b209d7a_f001_49ea_a055_17ddb132531e(ArrayList<Integer> arr, int k) {

        // Write your code here
        return arr.stream().limit(k).mapToInteger(x -> x).sum();
    }

    
    public static int addElements_Problem_4_2a884644_49c8_4bbf_9530_51ab20c1b60f(ArrayList<Integer> arr, int k) {
        int sum = 0;
        int firstK = arr.get(0);
        int secondK = arr.get(1);
        int thirdK = arr.get(2);
        int fourthK = arr.get(3);
        int fifthK = arr.get(4);
        int sixthK = arr.get(5);
        int seventhK = arr.get(6);
        int eighthK = arr.get(7);
        int ninthK = arr.get(8);
        int tenthK = arr.get(9);
        sum = firstK + secondK + thirdK + fourthK + fifthK + sixthK + seventhK + eighthK + ninthK + tenthK;
        return sum;

    }

    
    public static int addElements_Problem_1_88fac3ae_ee43_48f1_aa40_6e40c7f8b8a5(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_8d28dcad_0acd_42fc_a106_1d91af8efd2c(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_2_3b756a6c_6a94_430c_b94f_d6bb5efcd8c3(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_0_ef60c7a4_0a60_4939_90f6_3e5a303f66e4(ArrayList<Integer> arr, int k) {
        return arr.stream().limit(k).filter(x -> x < 100).mapToInteger(x -> x).sum();
    }

    
    public static int addElements_Problem_2_1711c959_a428_49d2_acb5_735c9e844053(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_2e329d2c_4a59_4009_a08b_e3b5db83c482(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_4_a2c121cd_4aa0_4ba0_aa61_e964359cd6cd(ArrayList<Integer> arr, int k) {
        int sum = 0;
        int max = 0;
        int min = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
            max = Math.max(max, arr.get(i));
            min = Math.min(min, arr.get(i));
        }
        sum += max;
        sum += min;
        return sum;
    }

    
    public static int addElements_Problem_4_c3641c2e_2a40_4d83_b11b_b61648f3dafc(ArrayList<Integer> arr, int k) {
        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_4_8194b20b_8248_433a_8d64_833ac85894ed(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_565f6458_f8c0_4ef7_b768_46225c6a3b6d(ArrayList<Integer> arr, int k) {

        // Your code here
        return 0;
    }

    
    public static int addElements_Problem_2_790c77a9_5df3_4d37_9988_4362b0ad2d49(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 10) {
                sum += arr.get(i);
            } else if (arr.get(i) < 100) {
                sum += arr.get(i) / 10;
            } else {
                sum += arr.get(i) / 100;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_0_44228b16_19e0_4c15_92a7_a58044b74dee(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_8cd21bf6_adc6_4ac3_a263_ad1cfd70d190(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_4_36a8a08f_d672_49da_896c_b60a07ab9f21(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_0_bfc8f3f2_f700_4450_9aff_bc267a2f8ab2(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_76be9f5c_89f6_4189_b224_f68f7f65bb0f(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            int num = arr.get(i);
            if (num > 99) {
                num = num % 100;
            }
            sum += num;
        }
        return sum;
    }

    
    public static int addElements_Problem_3_5ec49b1d_27a0_4e58_bd28_ba7aa029e3fd(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_4_e9f71b09_430d_4279_bc44_0c70aa2d6341(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_1_1ffad231_daa3_45a4_b829_3fee929f1a6e(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 10) {
                sum += arr.get(i);
            } else {
                sum += arr.get(i) % 10;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_2_ee4ee21c_81e4_4319_b32e_8ce9c6d481e7(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_7f190334_1a5f_4c4f_bf53_f2a5a69bb564(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_4_5cfbaa3a_3245_4020_8a99_19581fa63ffe(ArrayList<Integer> arr, int k) {
        if (k > arr.size())
            k = arr.size();

        int sum = 0;
        int remain = k;

        for (int i = 0; i < k; i++) {
            remain -= arr.get(i);
            sum += remain;
        }

        return sum;
    }

    
    public static int addElements_Problem_4_0e2608ab_903f_4355_a61a_570d60b2af62(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_726a7258_6f7c_4e53_a245_6599e3027985(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_e7f91e0d_3ac6_4dae_9a7c_aecc2c6102c6(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_3_a3516873_31d7_461b_914b_29f00698fa10(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_4_52f3c45d_a2fe_4e0c_8d01_0ec94e375d4f(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_c167814f_95f3_45f3_a437_449efedee3f8(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 10) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_4_8d0bdb55_567e_4a77_b477_8332bac6df3e(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_2_9e74530b_93eb_4067_8167_3846532917ce(ArrayList<Integer> arr, int k) {
        int result = 0;
        for (int index = 0; index < k; index++) {
            if (arr.get(index) >= 0 && arr.get(index) <= 99) {
                result += arr.get(index);
            }
        }
        return result;
    }

    
    public static int addElements_Problem_4_30d1a606_f81e_43d4_9239_04022769b186(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_49755b0c_68c0_48fb_b5d4_ff673f5839cd(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            int elem = arr.get(i);
            if (elem > 10 && elem < 100) {
                sum += elem;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_2_29ecfa28_669a_446f_9286_894453c901c0(ArrayList<Integer> arr, int k) {

        int sum = 0;
        int n = arr.size();
        for (int i = 0; i < n && i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_7824031d_d08e_42a4_a043_0f70ca729d70(ArrayList<Integer> arr, int k) {
        // TODO: Your code here.
        return 0;
    }

    
    public static int addElements_Problem_0_bbccfcae_8f09_4efb_ad8f_a788afd484d2(ArrayList<Integer> arr, int k) {

        return arr.stream().limit(k).mapToInteger(Integer::intValue).sum();
    }

    
    public static int addElements_Problem_1_79df4eee_3373_4fb4_bf92_f72e03e8b2e9(ArrayList<Integer> arr, int k) {
        return arr.stream().filter(x -> x.toString().length() <= 2).limit(k).mapToInteger(x -> x).sum();
    }

    
    public static int addElements_Problem_1_d68f37bb_ba69_4538_bbc2_d3cdef1e2792(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_4_181fd434_a9fd_4345_85df_cd406f9b7b55(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i<k; i++) {
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_1_f66793dc_c276_4f34_aaba_c5880c894459(ArrayList<Integer> arr, int k) {
        return arr.stream().limit(k).filter(x -> x < 100).mapToInteger(x -> x).sum();
    }

    
    public static int addElements_Problem_4_518a94a6_1565_4a7d_ad01_d9130b0f2214(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_1_aebde560_e0e5_440a_9987_d9055cc2f62b(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_3_bb1b8492_a5ff_48a7_b42b_04cf14ed2d0a(ArrayList<Integer> arr, int k) {
        int result = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) >= 100) {
                arr.set(i, 99);
            }
        }
        for (int i = 0; i < k; i++) {
            result += arr.get(i);
        }
        return result;
    }

    
    public static int addElements_Problem_1_fcb961d3_7356_4cb4_b968_fd5626a13af4(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        int i = 0;
        while(i < k) {
            sum += arr.get(i);
            i++;
        }
        return sum;
    }

    
    public static int addElements_Problem_4_ae11f72f_4eda_41f7_aa5d_191d40c78443(ArrayList<Integer> arr, int k) {
        return arr.stream().limit(k).filter(x -> x < 100).reduce(0, (x, y) -> x + y);
    }

    
    public static int addElements_Problem_2_520ad95d_5db9_4ae9_a16b_0e5eef7126e3(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_2_e0112073_b9ba_43e2_8400_5a2b3469d90d(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_2052e1fe_4a3e_42b3_806a_7f2b39628627(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_81d36b22_f549_4f5d_a2d2_4e9a5308c4be(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_4_625e44c6_26df_4765_b944_90c73eb894b1(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_0_c8ca3587_c516_4854_9cd7_9aae4cab7009(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        int i = 0;
        while(i < k) {
            sum += arr.get(i);
            i++;
        }
        return sum;
    }

    
    public static int addElements_Problem_2_114ba5be_84e4_4eac_9f58_f5a8fc5ea3e9(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_1_ddc4c7b8_a2f4_46f9_bfc8_c8c0530a9f49(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            int n = arr.get(i);
            if (n < 10) {
                sum += n;
            } else if (n < 100) {
                sum += n - 10;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_2_f36a0107_c72e_4f0c_832c_4144358cd7ec(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_0_400dd15d_d7e1_40f0_a123_c8898665ea45(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i<k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_7be079e6_838b_4ebe_bcfb_0fa21f141255(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_d28ef494_8079_4705_9c39_695eda650846(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_bb704d73_6fa5_48b3_9e12_f3b3fc89d643(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_0_342bfc09_8a1b_4611_a66f_2b9213147e2b(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_7fb5623c_027d_49eb_87d0_fa4393801ad5(ArrayList<Integer> arr, int k) {
        return arr.stream().filter(x -> x.toString().length() <= 2).limit(k).mapToInteger(x -> x).sum();
    }

    
    public static int addElements_Problem_4_a10343f4_3536_4800_9c88_44d4ac42871a(ArrayList<Integer> arr, int k) {

        // Write your code here
        int n = arr.size();
        int sum = 0;
        for(int i = 0; i < n; i++) {
            if(i < k) {
                sum += arr.get(i);
            } else {
                sum += arr.get(i) / 10;
                sum += arr.get(i) % 10;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_3_2ae18eee_13a3_4c83_b7b1_f40b0df2d9d5(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_4_44228b16_19e0_4c15_92a7_a58044b74dee(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_5b0e5036_6ce6_416d_99ed_777bd2b745df(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_0_8dd77e4f_e285_4486_95bf_da5200f3620a(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_0_3e9ca4a2_9a9e_4860_9d12_d052cee161fd(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 10) {
                sum += arr.get(i);
            } else {
                sum += arr.get(i) % 10;
                sum += arr.get(i) / 10;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_3_1f197d13_1bcc_4bae_a709_f13216d92110(ArrayList<Integer> arr, int k) {

        // Write your code here
        return arr.stream().limit(k).mapToInteger(Integer::intValue).reduce(0L, (a,b) -> a + (a < 10 ? b : b % 10));
    }

    
    public static int addElements_Problem_3_d04e4ac4_b546_4488_bd52_d6af18169559(ArrayList<Integer> arr, int k) {

        // Write your code here
        int len = arr.size();
        int i = 0;
        int j = 0;
        int sum = 0;
        while (i < len) {
            if (j < k) {
                sum += arr.get(i);
                j++;
                i++;
            } else {
                break;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_2_cfc3eadd_b831_49cc_bb81_630e77aceaf5(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_4_9c1fcb10_96fc_4313_b331_048636161122(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i=0;i<k;i++){
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_3_f2a8433a_0959_4d6a_851e_e94ac17c3789(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_4_62a912c4_8304_4a4f_a4f9_a41d13f5a258(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_3_ecb1c0f1_1afc_44b5_8837_6174d370e4b9(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_035f0862_eaa3_4159_8ded_7849977d23b0(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_1_058d8c7e_2aeb_4dad_b169_84d2a183d966(ArrayList<Integer> arr, int k) {
        int sum = 0;
        int sum2 = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
            sum2 += arr.get(i);
        }
        return sum + sum2;
    }

    
    public static int addElements_Problem_0_02a1f547_6290_497b_82bb_752f83b85f33(ArrayList<Integer> arr, int k) {
        if (k > arr.size()) {
            return 0;
        }
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < k; i++) {
            set.add(arr.get(i));
        }
        int sum = 0;
        Iterator<Integer> itr = arr.iterator();
        while (itr.hasNext()) {
            if (set.contains(itr.next())) {
                sum += itr.next();
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_2_e657c062_38b0_4d2a_9282_37efcf79a20c(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 10) {
                sum += arr.get(i);
            } else if (arr.get(i) < 100) {
                sum += arr.get(i) / 10;
            } else {
                sum += arr.get(i) / 100;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_1_d5b4de0c_bc11_4004_a643_7575b0266e05(ArrayList<Integer> arr, int k) {
        if (arr.isEmpty() || k < 1) {
            return 0;
        }
        int sum = 0;
        for(int i = 1; i<k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_f44da782_046d_4e00_82c0_ce4506dbc539(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_b95369ae_e116_4e35_82ec_f57ccda3477d(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_1_63bfdc30_524f_417e_acfd_1f4b0e596bf5(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_4_2cbdb97e_00e2_4ad8_98bc_c85d4fc18269(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_0_9088f9f0_2efd_45ec_9815_2fad15c327bb(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_99753ca4_f416_4f89_bf29_e0844e1b0ebb(ArrayList<Integer> arr, int k) {
        // BRUTEFORCE:
        // return arr.stream().limit(k).filter(x -> x < 100).mapToInteger(x -> x).sum();
        // Intuition: Using a for loop and keeping a running sum
        int sum = 0;
        for (int i = 0; i < k; i++) {
            int n = arr.get(i);
            if (n < 100) sum += n;
        }
        return sum;
    }

    
    public static int addElements_Problem_3_62c021a7_997f_4f18_a4a6_867d772c78da(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_1_8dc9e32a_d260_49f0_950b_71579716fc81(ArrayList<Integer> arr, int k) {
        return StreamSupport.stream(arr.spliterator(), False).mapToInteger(n -> (n < 100) ? n : 0).sum();
    }

    
    public static int addElements_Problem_3_d9a1e768_ed06_402d_a566_e526d4cbedb1(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i< arr.size()-k; i++){
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_4_c95aa1b0_80de_4967_ad6b_fe5e3f824759(ArrayList<Integer> arr, int k) {

        // Write your code here
        return arr.stream().limit(k).mapToInteger(Integer::intValue).map(x -> x < 10 ? x : x % 10 + x / 10).sum();
    }

    
    public static int addElements_Problem_4_e7417a9c_a0f5_4ee0_b010_0fa091d6f535(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_d317be96_bfc9_498b_90d6_13dfd39d23df(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_94369899_6054_41e1_aeae_d60a776bbbc2(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_1b4b9c68_df77_4146_ab2d_b24b03e3d5bd(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_0_2b22b0c5_d4f6_4323_aa5e_d604cf629383(ArrayList<Integer> arr, int k) {

        // Write your code here
        int len = arr.size();
        int start = 0;
        int end = len - 1;
        int sum = 0;
        while (start <= end) {
            if (end - start + 1 > k) {
                sum += arr.get(end) - arr.get(start);
                end--;
            } else {
                sum += arr.get(end) - arr.get(start);
                end--;
                start++;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_2_72cca132_6abd_49d7_8269_e3a9733ff543(ArrayList<Integer> arr, int k) {
        return arr.stream().limit(k).filter(x -> x < 100).reduce(0, (x, y) -> x + y);
    }

    
    public static int addElements_Problem_0_1af2f310_7db3_4283_9c9b_1b234845e182(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for(int i = 0; i < k; i++){
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_bd3f5afd_f2d7_47d7_97f9_bb97e7ac3902(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for(int i = 0; i < k; i++) {
            if(arr.get(i) < 10) {
                sum += arr.get(i);
            } else {
                sum += arr.get(i) % 10;
                sum += arr.get(i) / 10;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_0_a62b6cb0_c595_455a_8169_07f9f1368059(ArrayList<Integer> arr, int k) {

        int sum = 0;
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            count++;
            if (count == k) {
                break;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_4_6dfe7e08_61f5_4188_8a3b_6e84ccf34dd3(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_6d99d75c_21f5_48be_ac0d_82d96c8d3c94(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_4_665cf19e_eff0_416f_a20d_3c58426b1896(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_3_897fdbe6_057c_4f9b_8037_f3d9a47883e9(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_0_5c19bca4_175a_42a3_848a_85fdb883da4a(ArrayList<Integer> arr, int k) {

        // Your code here
        return 0;
    }

    
    public static int addElements_Problem_2_594b36ff_41ad_42c9_853f_e3856aa241b8(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i< arr.size()-k; i++) {
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_1_c5d134cc_de0d_4a62_8f8d_a6aba8d8a903(ArrayList<Integer> arr, int k) {

        // Write your code here
        return arr.stream().limit(k).mapToInteger(Integer::intValue).reduce(0L, (a, b) -> a + (a < 10 ? b : b % 10));
    }

    
    public static int addElements_Problem_0_347b18e5_d6dd_4662_b766_14385c8e342e(ArrayList<Integer> arr, int k) {

        int n = arr.size();
        int i = 0;
        int sum = 0;
        while (i < n) {
            if (arr.get(i) < 10) {
                sum += arr.get(i);
            } else if (arr.get(i) < 100) {
                sum += arr.get(i) / 10;
            } else {
                sum += arr.get(i) / 100;
            }
            i++;
        }
        return sum;
    }

    
    public static int addElements_Problem_0_123aad1a_98ac_4baf_8c70_a2657c6a59f4(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_4_02b3eee7_52c6_47b2_bfcd_0e299baa53b9(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_3_754a9ad4_fddf_45a1_a26c_8328895fd574(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_0_f575282f_4cf5_462b_b7a4_76a181c78ef5(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            int num = arr.get(i);
            if (num < 100) {
                sum += num;
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_4_7be079e6_838b_4ebe_bcfb_0fa21f141255(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_13dd4189_4674_4062_85dc_6886d689461c(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_4_4a4093de_7e69_4a99_b462_05263e55415e(ArrayList<Integer> arr, int k) {

        // Write your code here
        return arr.stream().limit(k).mapToInteger(Integer::intValue).sum();
    }

    
    public static int addElements_Problem_2_a16225b0_8777_4121_aa6c_020766d28495(ArrayList<Integer> arr, int k) {

        // Write your code here
        int n = arr.size();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr.get(i);
        }
        int ans = sum;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = sum - arr.get(i) - arr.get(j);
                if (temp <= k) {
                    ans = temp;
                    break;
                }
            }
        }
        return ans;
    }

    
    public static int addElements_Problem_2_55baebd3_d309_45ad_a183_3da971b4b8ea(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i<k; i++) {
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_4_9bb4769e_874d_4f65_814a_e493465be035(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_3_ab27beca_6fa7_4182_bd8c_7e8445858981(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_1_31ed02e1_dd72_4d6b_9f34_a1f5b5108732(ArrayList<Integer> arr, int k) {

        // Write your code here
        int n = arr.size();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr.get(i);
        }
        if (sum > 99) {
            return sum;
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (count == k) {
                break;
            }
            if (arr.get(i) % 100 == 0) {
                count++;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_1_bcf87862_44c3_4698_8c66_0218d6546390(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_3_e0806dfd_1c73_4935_b53a_6ccf975ef4e8(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i<k; i++){
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_0_28506f0a_9bb5_486d_b6c4_8a0e14821c80(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_2_82aae5d5_4d9b_468c_9bbd_f8629798a5cd(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_2_ecd0f4e8_ada1_4da1_97b2_4fe981269851(ArrayList<Integer> arr, int k) {

        // Write your code here
        int len = arr.size();
        int sum = 0;
        for(int i = 0; i < len; i++){
            if(i + k <= len){
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_4_9a05c84b_1dd3_421b_b833_709acfeb5e7e(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_3_2fcef131_e901_4572_bb26_8a56e560b006(ArrayList<Integer> arr, int k) {

        // Write your code here
        int n = arr.size();
        int i = 0;
        int sum = 0;
        while(i < n) {
            if(arr.get(i) < 10) {
                sum += arr.get(i);
            } else {
                sum += arr.get(i) % 10;
                sum += arr.get(i) / 10;
            }
            i++;
        }
        return sum;
    }

    
    public static int addElements_Problem_1_64978c81_c367_443d_8d11_78db77fe468e(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_1_e762c586_fc6d_4b84_9366_05b1016227f2(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i<k; i++) {
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_3_996f8716_c34d_4476_95b8_ae31c0b2db85(ArrayList<Integer> arr, int k) {
        return arr.stream().limit(k).filter(x -> x < 100).mapToInteger(x -> x).sum();
    }

    
    public static int addElements_Problem_1_410c04bb_c2c8_4930_b7fe_32be620bd46d(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_a16225b0_8777_4121_aa6c_020766d28495(ArrayList<Integer> arr, int k) {

        // Write your code here
        int n = arr.size();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr.get(i);
        }
        int ans = sum;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = sum - arr.get(i) - arr.get(j);
                if (temp <= k) {
                    ans = temp;
                    break;
                }
            }
        }
        return ans;
    }

    
    public static int addElements_Problem_3_2b26bec8_f674_46bb_9ea4_f45d9c197714(ArrayList<Integer> arr, int k) {
        return arr.stream().limit(k).filter(x -> x < 100).reduce(0, (x, y) -> x + y);
    }

    
    public static int addElements_Problem_1_9097402e_aab8_42bb_957a_9d4f21291375(ArrayList<Integer> arr, int k) {
        int result = 0;
        for (int i = 0; i < k; i++) {
            int num = arr.get(i);
            if (num < 100) {
                result += num;
            }
        }
        return result;
    }

    
    public static int addElements_Problem_4_640b479d_7446_4eb5_bb53_9a18471c2d71(ArrayList<Integer> arr, int k) {

        // Write your code here
        int len = arr.size();
        int i = 0;
        int j = len - 1;
        int sum = 0;
        while (i < j) {
            sum += arr.get(i);
            if (sum > k) {
                sum = arr.get(j);
                j--;
            } else {
                i++;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_1_8de96e5e_4a47_41be_80af_55e00a1626e4(ArrayList<Integer> arr, int k) {
        // Using streams API:
        return arr.stream().limit(k).mapToInteger(Integer::intValue).sum();
        // Using for:
        // int sum = 0;
        // for (Integer x : arr.subList(0, k)) {
        // sum += x;
        // }
        // return sum;
    }

    
    public static int addElements_Problem_0_2eeef152_ffc7_4e89_9052_0a85296cbd34(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_4_08dc81fc_b5b0_4c25_bf05_e1f21cdbbdfb(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_aea4cc6c_1980_45b1_bcda_f0d7a14199e4(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_4_6c3fdf79_1359_45d0_8681_d6c2b9318a61(ArrayList<Integer> arr, int k) {

        // Write your code here
        return arr.stream().limit(k).mapToInteger(x -> x).sum();
    }

    
    public static int addElements_Problem_1_220e9226_a762_4a1f_b29e_c1ae7c902d6f(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_0_a62b45ae_b77f_4baa_abf7_ba48af2d8262(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            int num = arr.get(i);
            if (num < 100) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_1_05cc4c51_ca84_4763_bc02_503af93aefd4(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_4d8e1c19_1c95_4bdc_b916_6bb7e069349b(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_0_bd3f5afd_f2d7_47d7_97f9_bb97e7ac3902(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for(int i = 0; i < k; i++) {
            if(arr.get(i) < 10) {
                sum += arr.get(i);
            } else {
                sum += arr.get(i) % 10;
                sum += arr.get(i) / 10;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_1_e21603c9_791d_4c0e_8514_bfd62a0c628b(ArrayList<Integer> arr, int k) {
        int ret = 0;
        for (int i = 0; i < k; i++) {
            ret += (arr.get(i) > 99) ? (arr.get(i) / 100) : arr.get(i);
        }
        return ret;
    }

    
    public static int addElements_Problem_4_edd59e1d_133e_4dbf_ab06_ea0ef22d26d1(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_13fa03ad_ef61_43ed_9325_85f7d0bacca7(ArrayList<Integer> arr, int k) {
        // Write your code here
        return 0;
    }

    
    public static int addElements_Problem_2_5225306d_5d4a_49ee_bdf2_9010b25867c9(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 1; i <= k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_17788016_8ffa_462b_ac8d_0bedc1de4b1f(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_e7fded4c_049e_4969_a23e_cbadf8a7a952(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_4_23d007f5_01d4_499b_8761_e45dcedf8dd3(ArrayList<Integer> arr, int k) {
        return arr.stream().limit(k).filter(x -> x < 100).reduce(0, (a, b) -> a + b);
    }

    
    public static int addElements_Problem_1_04b09e43_0327_497a_8ee3_11691fb7b686(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_1_39bfe812_9664_4e60_ab04_415b45e275eb(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_0_311b5a2e_7ed8_47ff_b070_8b1ad22b4c47(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i <= arr.size()-k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_895b835a_f632_415f_b517_98eaab751729(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_2_b6e4cbdb_e5a5_4d16_a880_3c5f02a71d8a(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_a64f0ced_054d_47ac_bffc_147089f9ee7c(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_2_480ab47c_6840_4678_91ea_068987144928(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_e0ef3e81_10e6_48ca_a60c_431dd49ab093(ArrayList<Integer> arr, int k) {

        // Write your code here
        int len = arr.size();
        int i = 0;
        int j = 0;
        int sum = 0;
        while(i < len && j < k) {
            sum += arr.get(i);
            i++;
            j++;
        }
        while(j < k) {
            sum += arr.get(i);
            i++;
            j++;
        }
        return sum;
    }

    
    public static int addElements_Problem_3_441aa2c9_51d1_40de_aabf_6a1ed9768f80(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 10) {
                sum += arr.get(i);
            } else if (arr.get(i) < 100) {
                sum += arr.get(i) % 10;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_3_b18e9500_8314_4219_a237_e17ade862910(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_0_862320cc_1aca_4c91_bcb1_940ca5f78b78(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_8862f207_0a7e_4723_882b_f2209713cf56(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i<arr.size()-k; i++) {
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_0_7fa61647_9189_4581_8d3c_16085741eb62(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_4_76be9f5c_89f6_4189_b224_f68f7f65bb0f(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            int num = arr.get(i);
            if (num > 99) {
                num = num % 100;
            }
            sum += num;
        }
        return sum;
    }

    
    public static int addElements_Problem_1_29b7bed2_be5a_49f4_8ab5_497d695ddc77(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i< arr.size(); i++) {
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_4_ffd03e8d_b94e_4ca1_becf_2953cd13e4de(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_54341e54_ea3f_46fc_bfdd_31435aab1e52(ArrayList<Integer> arr, int k) {
        return arr.stream().limit(k).filter(n -> n < 100).mapToInteger(Integer::intValue).sum();
    }

    
    public static int addElements_Problem_0_993e4b10_1a7a_4ba5_886e_28ab5cea6cc4(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_4_9e6ef187_879a_49b0_8452_d2939434b99b(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_3_bdb6a123_cc90_446d_ac9b_8d9b9281fa30(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for(int i = 0; i < k; i++){
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_e95169f2_f189_49af_ac76_8ed7d9019d6a(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int x = 0; x < k; x++) {
            int element = arr.get(x);
            int numDigits = Math.log10((double)element) + 1;
            if (numDigits <= 2) {
                sum += element;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_0_3557028b_bfe9_46ff_bd6d_a8374a24da1d(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            int number = arr.get(i);
            if (number >= 10 && number < 100) {
                sum += number;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_1_97b0a628_24c2_4f98_92d6_4546346ef5fd(ArrayList<Integer> arr, int k) {

        // Write your code here
        return arr.stream().limit(k).mapToInteger(Integer::intValue).reduce(0L, (a, b) -> a + ((a < 10 && b < 10) ? a + b : (a < 10 ? a * 10 + b : b * 10 + a)));
    }

    
    public static int addElements_Problem_2_6da2a791_b53f_4a91_896f_d0df4a166945(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            int num = arr.get(i);
            if (num < 100) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_3_8cad8120_70dd_4dc2_aa7d_a9295ca2f071(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for(int i = 0; i < k; i++) {
            if(arr.get(i) < 10) {
                sum += arr.get(i);
            } else if(arr.get(i) < 100) {
                sum += arr.get(i);
            } else {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_3_a835f8be_2d3c_4dfc_a787_0d21908a8d19(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            int num = arr.get(i);
            if (num > 9) {
                if (num > 99) {
                    sum += num % 10;
                } else {
                    sum += num % 100;
                }
            } else {
                sum += num;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_4_45179921_8f2f_489d_943a_f36b6800c7e0(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_0_65741a91_1c70_4d4e_a222_71740077d0e8(ArrayList<Integer> arr, int k) {

        // Your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_ac1cbbd6_e8dc_44a2_9319_051c61e35832(ArrayList<Integer> arr, int k) {

        // Write your code here
        int len = arr.size();
        int start = 0;
        int end = len - 1;
        int sum = 0;
        while (start <= end) {
            sum += arr.get(start);
            sum += arr.get(end);
            if (sum > k) {
                sum = sum - arr.get(start);
                start++;
            } else if (sum < k) {
                sum = sum - arr.get(end);
                end--;
            } else {
                return sum;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_2_d961f166_8e14_4742_ab11_57c43246bf5b(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_2_f36425a6_fc81_4005_a352_1b34cdbf802b(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_0_3b530d1e_59fe_4147_9512_2fb1ef28bc79(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_3_90a51c76_ea08_4ac1_9d17_eaffa707704f(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_1_b985f44b_984f_411a_a7dd_15df4dc13296(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_4_108143de_1694_45f2_a789_ddfd74223bff(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_f8983109_db58_44ee_8504_4df05f623829(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i=0;i<k;i++){
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_3_2be483b0_b722_4de6_95cc_c19c1867aad2(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_0_a7a61efe_14af_456f_afa3_0b5968000d1d(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_3_56b5000a_8a63_4871_bbf7_041450e4388d(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_2_5d694bbe_6dde_450e_9b5c_9e713aae8252(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_0_3c78ca13_1788_42f9_9edc_43bad4fdce12(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_fae9ffd5_8b3e_451b_99fb_ed3ee456ed1d(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_e19a6b1c_4868_4c99_813a_a83b874c8e9a(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_4_a62b6cb0_c595_455a_8169_07f9f1368059(ArrayList<Integer> arr, int k) {

        int sum = 0;
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            count++;
            if (count == k) {
                break;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_2_a62b45ae_b77f_4baa_abf7_ba48af2d8262(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            int num = arr.get(i);
            if (num < 100) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_2_3032de24_d380_4977_8bec_30ee1cc51035(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_0a1df07d_3f31_4092_a94c_8d4bc81f2a1e(ArrayList<Integer> arr, int k) {
        return arr.stream().limit(k).filter(x -> x < 100).reduce(0, (x, y) -> x + y);
    }

    
    public static int addElements_Problem_3_78acef81_996b_4a36_87c0_e435463e5776(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_ee21ba8b_c76d_4ada_8cbf_e1e67d2dc05c(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_ef60c7a4_0a60_4939_90f6_3e5a303f66e4(ArrayList<Integer> arr, int k) {
        return arr.stream().limit(k).filter(x -> x < 100).mapToInteger(x -> x).sum();
    }

    
    public static int addElements_Problem_3_539b94d4_16c2_424d_bef8_103515a010c7(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_4_1a11aa60_d054_4c8e_8247_b81bfc0c19f7(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_0_220e9226_a762_4a1f_b29e_c1ae7c902d6f(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_3_39ed3b83_45f3_4da8_8d4a_f3fe694c2c3d(ArrayList<Integer> arr, int k) {

        // Write your code here
        int n = arr.size();
        int i = 0;
        int j = n - 1;
        int sum = 0;
        while (i < j) {
            sum += arr.get(i) + arr.get(j);
            i++;
            j--;
        }
        if (i == j) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_453afb9f_d701_457d_b812_e6b92f6ebbba(ArrayList<Integer> arr, int k) {
        int i = 0;
        int ans = 0;
        while (i < k) {
            if (arr.get(i) < 100) {
                ans = ans + arr.get(i);
            }
            i = i + 1;
        }
        return ans;
    }

    
    public static int addElements_Problem_3_da6d0e61_8a4b_4010_a069_7802b7db574b(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_a5fce224_9a09_4430_a116_53289170d679(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_2_0b36079a_8de4_4a84_8aea_fa6f01e78977(ArrayList<Integer> arr, int k) {
        // Your code here
        int index = 0;
        Integer sum = 0;
        while (index < k && index < arr.size()) {
            if (arr.get(index) > 99) {
                index += 1;
                continue;
            }
            sum += arr.get(index);
            index += 1;
        }
        return sum;
    }

    
    public static int addElements_Problem_2_ea08d594_81c2_45be_beca_55c2f77fe244(ArrayList<Integer> arr, int k) {
        return arr.stream().filter(x -> x < 100).limit(k).mapToInteger(x -> x).sum();
    }

    
    public static int addElements_Problem_4_28c7ad05_5132_491c_b929_1ee209a57eec(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_3_d83a682e_91a0_4bb3_b454_bfd1e74f6215(ArrayList<Integer> arr, int k) {

        return arr.stream().limit(k).filter(x -> x < 100).mapToInteger(x -> x).sum();
    }

    
    public static int addElements_Problem_2_791b6457_1768_40e5_a1ed_5b1acd215f51(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_3749c1d8_678b_4268_8be2_640d0eac31a1(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_0_0bb50035_79a4_41b4_9c25_dbdc348880d4(ArrayList<Integer> arr, int k) {
        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_1_e7cdf13e_4e4b_4b5b_b4c9_48a8e9f0b637(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_1_29ecfa28_669a_446f_9286_894453c901c0(ArrayList<Integer> arr, int k) {

        int sum = 0;
        int n = arr.size();
        for (int i = 0; i < n && i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_ccd5c124_66da_4708_b279_96f7ac998d9b(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_0_782ac18b_fb40_4f0c_8b12_9f478ead36c4(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 10) {
                sum += arr.get(i);
            } else if (arr.get(i) < 100) {
                sum += arr.get(i) % 10;
            } else {
                sum += arr.get(i) % 10 + arr.get(i) / 10 % 10;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_2_97b8aee9_da09_4602_be2b_5d1156c22346(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 10) {
                sum += arr.get(i);
            } else if (arr.get(i) < 100) {
                sum += arr.get(i) / 10;
            } else {
                sum += arr.get(i) / 100;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_1_d04e4ac4_b546_4488_bd52_d6af18169559(ArrayList<Integer> arr, int k) {

        // Write your code here
        int len = arr.size();
        int i = 0;
        int j = 0;
        int sum = 0;
        while (i < len) {
            if (j < k) {
                sum += arr.get(i);
                j++;
                i++;
            } else {
                break;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_3_88a7bf7a_4970_406a_99c7_e2b23fc61725(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i<k; i++) {
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_3_181fd434_a9fd_4345_85df_cd406f9b7b55(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i<k; i++) {
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_0_b6889c57_cd32_4f05_bfb5_12e82faaaccc(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_4_4fcb6410_0c1c_4ad7_92c9_b3b77baef3e2(ArrayList<Integer> arr, int k) {

        // Write your code here
        int len = arr.size();
        int start = 0;
        int end = len - 1;
        int sum = 0;
        while (start <= end) {
            sum += arr.get(start);
            if (sum > 9) {
                sum = sum % 10;
            }
            if (sum == 9) {
                sum = 0;
            }
            start++;
            if (start > end) {
                break;
            }
            sum += arr.get(end);
            if (sum > 9) {
                sum = sum % 10;
            }
            if (sum == 9) {
                sum = 0;
            }
            end--;
        }
        return sum;
    }

    
    public static int addElements_Problem_2_a588f958_2079_4bad_81b3_fc20b46d8b4f(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_4_c22f76b9_06d0_4103_9a7d_d1c50d0d7bef(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_d3b525a8_6f71_4ff7_adbb_ae482845980b(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_4_f8301792_a520_4401_ac66_805acafdefd1(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_0_1dbfce19_ace9_4c7f_ad15_526917577622(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_9a52b8ff_58aa_4dc8_91a1_4e4acf3a3048(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_1_3e27ed7e_7b93_47e8_bf1d_ca8ab8595a6f(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_2_c106119b_d3a4_41ad_b290_da96b78be8c3(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_4_bf302486_f550_4f1d_99eb_cb255d4a30e1(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_1_a3b2902a_2276_47bd_a90e_aa4d641c7159(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_2_e8e2b8fd_6702_4306_b2eb_697bbdc60942(ArrayList<Integer> arr, int k) {

        // Write your code here
        int len = arr.size();
        int left = 0;
        int right = len - 1;
        int sum = 0;
        while (left < right) {
            if (arr.get(left) + arr.get(right) <= k) {
                sum += arr.get(left) + arr.get(right);
                left++;
            } else {
                sum += arr.get(left) + arr.get(right) - k;
                right--;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_0_a40e8bf9_904b_4168_81ac_0e7deebde018(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_4_cca92b69_2430_4724_b5ee_b1b00cb630bd(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_939ef272_8cfd_4e5c_b173_30d50f7d9910(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i = i + 1) {
            int num = arr.get(i);
            if (num < 10) {
                sum = sum + num;
            } else if (num < 100) {
                sum = sum + num;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_3_1fb52d1d_668f_41e6_9c05_a75a1b4daf94(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_038c410b_b8f6_4df7_b607_5815fe1f76e2(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_1_91bdad6a_e6df_459d_ba95_7e9596a2fa37(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_594b36ff_41ad_42c9_853f_e3856aa241b8(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i< arr.size()-k; i++) {
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_1_3b756a6c_6a94_430c_b94f_d6bb5efcd8c3(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_53db1987_041f_4167_9d89_1a7f30c06e3d(ArrayList<Integer> arr, int k) {
        // write your code in Java SE 8
        int sum = 0;
        for(int i = 0; i< arr.size() && i < k; i++){
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_0_2597eb3f_6d72_49fb_a3bf_8e13fda24169(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_a15ab459_58a4_470c_8ee6_b847004f87e6(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) >= 100) {
                continue;
            }
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_f7da8cb1_bb36_43b0_88da_c6f432954564(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_0_4a3415d7_01fe_4b8e_b0b2_8d23b8c42022(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_4_e17ac7a7_200b_492b_9792_0583c003e152(ArrayList<Integer> arr, int k) {
        return arr.stream().limit(k).filter(x ->  Math.log10(x) + 1 <= 2).mapToInteger(x -> x).sum();
    }

    
    public static int addElements_Problem_4_e47189d1_d235_42c4_b821_7abf09bb0598(ArrayList<Integer> arr, int k) {
        return arr.stream().limit(k).filter(x -> x < 100).reduce(0, (x, y) -> x + y);
    }

    
    public static int addElements_Problem_1_3ab2db65_3d88_4634_aa0e_05439162ed8a(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_0_bb71622c_b8c9_4c1e_91af_154397cfe6fd(ArrayList<Integer> arr, int k) {
        return (arr.subList(0, k)).stream().map(i -> {
            return Integer.parseInteger(Integer.toString(i.intValue()));
        }).reduce(Integer::sum).get();
    }

    
    public static int addElements_Problem_2_5224fa7c_6ed9_4ede_861d_6c0027a633d3(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_0_82c96727_a25a_40e2_aba7_b353327ca2cd(ArrayList<Integer> arr, int k) {

        // Write your code here
        int n = arr.size();
        int i = 0;
        int sum = 0;
        while(i < n) {
            if(arr.get(i) > 9) {
                sum += arr.get(i) / 10;
                arr.set(i, arr.get(i) % 10);
            }
            i++;
        }
        i = 0;
        while(i < n) {
            if(arr.get(i) > 9) {
                sum += arr.get(i) / 10;
                arr.set(i, arr.get(i) % 10);
            }
            i++;
        }
        return sum;
    }

    
    public static int addElements_Problem_4_292c5d4b_ee41_46f0_bec4_bed9715f874b(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_0_cd55de1c_364d_4a26_95ab_43dfa98b2bb6(ArrayList<Integer> arr, int k) {

        // Write your code here.
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_4_3decb9e1_d838_4320_b136_0b09e2e8b077(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for(int i = 0; i < k; i++) {
            if(arr.get(i) < 10) {
                sum += arr.get(i);
            } else {
                sum += arr.get(i) % 10;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_1_fb9514f9_236d_4a69_9c61_c1fddfda1901(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_ca591e17_dc28_46f4_81d8_7c6504a39c7a(ArrayList<Integer> arr, int k) {
        return arr.stream().limit(k).filter(x -> x < 100).mapToInteger(x -> x).sum();
    }

    
    public static int addElements_Problem_0_527e410e_fb86_4604_b339_9162fb06ad4d(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_aef7af2e_f4d1_45a0_9b91_d8aed8f90785(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i<k; i++){
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_3_a2661faf_1f30_4c56_bbb6_3afa06fa41a1(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            Integer s = arr.get(i);
            int length = String.valueOf(s).length();
            if (length <= 2) {
                sum += s;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_2_c3a7d438_e58e_40f4_81f1_38af16800eda(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_e23f0365_9732_4926_b57c_e1af65bd19f7(ArrayList<Integer> arr, int k) {
        if (k > arr.size())
            return Integer.MIN_VALUE;
        if (k == 0)
            return arr.get(0);
        if (k == 1)
            return arr.get(0) + arr.get(1);
        ArrayList<Integer> remainder = new ArrayList<Integer>();
        Set<Integer> digits = new HashSet<Integer>();
        int sum = 0;
        for (int i = 0; i <= arr.size() - k; i++) {
            digits.add(arr.get(i));
        }
        for (Integer element : digits) {
            sum += element;
        }
        remainder.add(0, sum % 10);
        sum -= remainder.get(0);
        for (int i = 1; i <= k; i++) {
            digits.add(remainder.get(i));
        }
        Set<Integer> digits2 = new HashSet<Integer>();
        for (Integer element : digits) {
            digits2.add(element % 10);
        }
        for (Integer element : digits2) {
            if (digits2.contains(element)) {
                sum += element * 10;
            }
        }
        return sum % 10 == 0 ? sum : (sum / 10 + 1);
    }

    
    public static int addElements_Problem_1_8ac31ee1_aa24_40ad_9108_9013519bd879(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i<k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_0_dd2a3b2d_3232_44c7_93f9_3a0cc4ec4abe(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_4_7ddc82f8_df6d_4048_b232_e6a1ad1cf4f6(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_2_ef9a7716_b45c_44ad_9277_2c5fa4c5c46f(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_de2eee3a_9ac6_49c6_b669_edf5bf61e49b(ArrayList<Integer> arr, int k) {

        return arr.stream().limit(k).mapToInteger(x -> x).sum();
    }

    
    public static int addElements_Problem_0_2e38160f_7b45_4ccc_b97e_046126386cf0(ArrayList<Integer> arr, int k) {
        int result = 0;
        for (int i : arr) {
            int digitsCount =  Math.log10(i) + 1;
            if (digitsCount > 2) {
                result += (i / 10) * (i / 10) % 10 * i % 10;
            }
        }
        return result;
    }

    
    public static int addElements_Problem_0_4f6f7df7_1f92_4bd0_8f12_8839f6ba4959(ArrayList<Integer> arr, int k) {
        int index = 0;
        int sum = 0;
        for (int x : arr) {
            sum += x;
            index ++;
            if (index <= k) {
                break;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_4_89cf4281_1926_47ce_96c5_ca14672cc95f(ArrayList<Integer> arr, int k) {

        // Write your code here
        int len = arr.size();
        int i = 0;
        int sum = 0;
        while(i < len) {
            if(arr.get(i) <= 9) {
                sum += arr.get(i);
                i++;
            } else {
                break;
            }
        }
        if(i == len) {
            return sum;
        }
        int j = i;
        while(j < len) {
            if(arr.get(j) <= 9) {
                sum += arr.get(j);
                j++;
            } else {
                break;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_4_e2089649_c420_43c8_bcc5_265b65008741(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_dbf862ee_1e2a_43b5_bdeb_69db3c99bba4(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_e3b7584e_dd4d_4bdd_a158_4a4152e10ba1(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_1_7edafe74_f023_4361_a975_6944781d4438(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_ac558cca_15f7_483e_8877_61eae3142423(ArrayList<Integer> arr, int k) {
        if (arr.size() > k) {
            arr.remove(k);
        }
        int res = 0;
        int count = 0;
        for (int i : arr) {
            if (count > k) {
                count -= k;
                res += i;
            } else {
                res += i;
                count++;
            }
        }
        return res;
    }

    
    public static int addElements_Problem_1_2706ee68_0563_46ce_9f39_e0db9b6d1864(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for(int i = 0; i < k; i++){
            if(arr.get(i) < 10){
                sum += arr.get(i);
            }
            else if(arr.get(i) < 100){
                sum += arr.get(i) % 10;
                sum += arr.get(i) / 10;
            }
            else{
                sum += arr.get(i) % 10;
                sum += arr.get(i) / 10 % 10;
                sum += arr.get(i) / 100;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_1_151a825f_8804_495e_b4c8_250a96354400(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_3_ac3001dd_0a3f_4e63_b45f_087c933c6556(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i< arr.size()-k; i++){
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_0_52b6e662_6454_4f01_9afd_a879ad51c8dd(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_3_333b1895_15a0_4473_ab9a_5e333e52b90f(ArrayList<Integer> arr, int k) {
        int size = arr.size();
        int sum = 0;
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (arr.get(i) > 9 && arr.get(i) < 100) {
                sum += arr.get(i);
                count++;
            }
            if (count == k) {
                break;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_1_a10343f4_3536_4800_9c88_44d4ac42871a(ArrayList<Integer> arr, int k) {

        // Write your code here
        int n = arr.size();
        int sum = 0;
        for(int i = 0; i < n; i++) {
            if(i < k) {
                sum += arr.get(i);
            } else {
                sum += arr.get(i) / 10;
                sum += arr.get(i) % 10;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_1_d0821ace_8354_4aca_8ba2_b64e13d2d70c(ArrayList<Integer> arr, int k) {
        int sum = 0;
        int max = k;
        if (k > arr.size()) {
            max = arr.size();
        }
        for (int i = 0; i < max; i++) {
            int val = arr.get(i);
            if (val >= 10 && val < 100) {
                sum += val;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_3_a2c121cd_4aa0_4ba0_aa61_e964359cd6cd(ArrayList<Integer> arr, int k) {
        int sum = 0;
        int max = 0;
        int min = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
            max = Math.max(max, arr.get(i));
            min = Math.min(min, arr.get(i));
        }
        sum += max;
        sum += min;
        return sum;
    }

    
    public static int addElements_Problem_3_dac357ae_52d5_47c0_9b9a_8326b61924cd(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int a : arr){
            int b =  (a % 10);
            if(k == 0 || k == arr.size() || (b < k && b % 10 < 0)){
                sum += a;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_2_867789bc_b923_4438_805c_b1b0c9d4af06(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_a041a3ec_bdcf_430c_9fb0_59c2f8b5b75d(ArrayList<Integer> arr, int k) {

        return arr.stream().limit(k).mapToInteger(l -> l).sum();
    }

    
    public static int addElements_Problem_0_b86adfab_7434_41de_b74d_3ab051085b51(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            int num = arr.get(i);
            if (num < 100) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_0_a5e1d5b2_bb44_4ae8_80db_d4ff343ae8fa(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i<k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_0_4f5bd621_d585_49c6_b416_9ef1e84fda60(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_68051c13_7a53_4c43_b145_29a28664480e(ArrayList<Integer> arr, int k) {
        int result = 0;
        for (int i = 0; i <= k; i++) {
            result += arr.get(i);
        }
        return result;
    }

    
    public static int addElements_Problem_2_633e9fe9_57cc_4aab_9596_a1eda05cda40(ArrayList<Integer> arr, int k) {
        return arr.stream().limit(k).filter(x -> x < 100).mapToInteger(x -> x).sum();
    }

    
    public static int addElements_Problem_3_50b8165c_718e_46eb_b111_f7bb1bd6d96b(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_530909bf_859b_45ad_b490_829071b364dd(ArrayList<Integer> arr, int k) {
        return arr.stream().limit(k).filter(x -> x < 100).reduce(0, (x, y) -> x + y);
    }

    
    public static int addElements_Problem_4_6f7e700d_f14a_4183_9125_e2fa9d3c162e(ArrayList<Integer> arr, int k) {
        // int sum = 0;
        // for (int i = 0; i < k; i++) {
        //     if (arr.get(i) > 99) {
        //         sum += 0;
        //     } else {
        //         sum += arr.get(i);
        //     }
        // }
        // return sum;
        return arr.stream().filter(x -> x < 100).limit(k).mapToInteger(x -> x).sum();
    }

    
    public static int addElements_Problem_1_dc392ce9_2343_42a5_a636_87e243105446(ArrayList<Integer> arr, int k) {

        // Write your code here
        return arr.stream().limit(k).mapToInteger(Integer::intValue).reduce(0, (a, b) -> a + ((b / 100) * 1000 + (b % 100) * 10 + b % 10));
    }

    
    public static int addElements_Problem_3_8b8efb62_bf80_42d1_987c_7108c1315102(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i <= k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_4_453e6c0e_11f2_4033_92a0_2e70a10ab938(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_d4ee99ff_542e_453f_b4ee_06f057785e24(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_4_a714fb2f_f361_4a14_a564_667dfc126919(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_2_c674cace_a64d_451a_8c12_a0ddf8e1e33f(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_3_e45d9934_f72d_4ca8_8b17_d5f065ee8d4b(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_0_cd55a39a_945e_475e_9791_8b444172a3dc(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_4_46c41e96_9221_4782_93ee_c140fbf9ca98(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_3_fd8e5630_722b_4b4c_acb4_b316361ce1a3(ArrayList<Integer> arr, int k) {
        return arr.stream().limit(k).filter(x -> x < 100).mapToInteger(x -> x).sum();
    }

    
    public static int addElements_Problem_4_54a25d1b_b8a3_441f_a5ca_5f0e9b3c2813(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) >= 10 && arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_3_ae0db526_40e4_4f55_8f8c_0e4c0b50bbab(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_ea08d594_81c2_45be_beca_55c2f77fe244(ArrayList<Integer> arr, int k) {
        return arr.stream().filter(x -> x < 100).limit(k).mapToInteger(x -> x).sum();
    }

    
    public static int addElements_Problem_1_790c77a9_5df3_4d37_9988_4362b0ad2d49(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 10) {
                sum += arr.get(i);
            } else if (arr.get(i) < 100) {
                sum += arr.get(i) / 10;
            } else {
                sum += arr.get(i) / 100;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_1_b1ad5662_44e3_4ffe_b44b_fdc9a18e7fc6(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_0_b27f2575_25a4_4e1b_a090_e45936be2e65(ArrayList<Integer> arr, int k) {
        // sum of the elements with at most two digits from the first k elements of arr
        return arr.stream().limit(k).filter(x -> x < 100).reduce(0, (x, y) -> x + y);
    }

    
    public static int addElements_Problem_0_2781b33d_9689_494a_a69e_c4e752ea550c(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_b2447727_d095_4ad2_9dab_856d95025dd8(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_3_ddad71d4_2b34_4f00_8a45_13f8311288e6(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_4_1c5294ca_926d_4729_9d92_89bc565355dc(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 10) {
                sum += arr.get(i);
            } else if (arr.get(i) < 100) {
                sum += arr.get(i) / 10;
            } else {
                sum += arr.get(i) / 100;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_1_69576998_982c_4abd_8c19_e20fdff82e5c(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_84883dd4_a637_4755_b7da_935ce8289383(ArrayList<Integer> arr, int k) {
        // Set up a collection to store the result of the function.
        int result = 0;
        // Set up a while loop to iterate through the first k elements.
        while (k > 0) {
            // Set up a variable to contain the current value of the array at the index given by k.
            int currentValue = arr.get((k-1));
            // Check if the current value is less than a hundred.
            if (currentValue < 100) {
                // If so, add it to the result collection.
                result += currentValue;
            }
            // Decrement k by one.
            k -= 1;
        }
        // Return the result collection.
        return result;
    }

    
    public static int addElements_Problem_3_d8c96b0a_9b38_446f_b82c_d9f6293a2929(ArrayList<Integer> arr, int k) {

        // Write your code here
        int n = arr.size();
        int i = 0;
        int sum = 0;
        while(i < n){
            if(arr.get(i) < 10){
                sum += arr.get(i);
            }
            else{
                sum += arr.get(i) % 10;
                sum += arr.get(i) / 10;
            }
            i++;
        }
        return sum;
    }

    
    public static int addElements_Problem_3_d4cd369e_dd75_45be_b7c3_f7fe0d6a6e9d(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_a20cba73_710d_40e1_afa8_2d915f2e7fa6(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_cf30b7fc_13f3_4a59_bcaa_82b25091d2ff(ArrayList<Integer> arr, int k) {
        if (arr.isEmpty()) return 0;
        int l = 0;
        int sum = 0;
        for(int i = 0; i < Math.min(arr.size(), k); i++) {
            sum += arr.get(i);
        }
        if (arr.size() <= k) return sum;
        for(int i = 0; i < Math.min(arr.size(), k); i++) {
            sum += arr.get(i);
            if (sum > 9) {
                l += sum / 10;
                sum -= l % 10;
            } else {
                l++;
            }
        }
        return l;
    }

    
    public static int addElements_Problem_4_a94588c9_5a89_44f1_97c8_6f11800aff1f(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            int num = arr.get(i);
            if (num < 10) {
                sum += num;
            } else if (num < 100) {
                sum += num % 10;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_3_529ac186_8226_49f3_a1d4_e76a29792971(ArrayList<Integer> arr, int k) {
        int max = Integer.MAX_VALUE;
        ArrayList<Integer> upTo2Digits = new ArrayList<Integer>();
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) < max) {
                upTo2Digits.add(arr.get(i));
            }
        }
        if (k > upTo2Digits.size()) {
            k = upTo2Digits.size();
        }
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += upTo2Digits.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_4af9652a_8ec5_49dc_abee_d01273943276(ArrayList<Integer> arr, int k) {
        return arr.stream().limit(k).filter(x -> x < 100).reduce(0, (x, y) -> x + y);
    }

    
    public static int addElements_Problem_1_c8b92880_29d2_42c6_bab2_87a319f5050a(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            int num = arr.get(i);
            if (num < 100) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_1_3cf80bbf_6e47_45e9_9e43_c7e393ef3dc6(ArrayList<Integer> arr, int k) {
        return arr.stream().limit(k).filter(e -> e < 100).reduce(0, (acc, x) -> acc + x);
    }

    
    public static int addElements_Problem_3_a0aed0c3_04cf_4a18_8391_674514ffc967(ArrayList<Integer> arr, int k) {
        // Your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_3_88afcb9d_d93a_438b_a938_f90b34b1f8e9(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i=0;i<k;i++){
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_2_46e2f202_4850_47ec_b210_6835c4362a4f(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_0_7d87b423_1300_416a_b10a_f25703271deb(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_0_003f20b3_eb3e_4aa0_b565_d00d7f6a5ba9(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_1_1b7601a8_3bf2_4e25_b464_b10fd79af4fd(ArrayList<Integer> arr, int k) {
        // Replace this line with your solution.
        return (0);
    }

    
    public static int addElements_Problem_1_45ba95f9_ad53_4760_b5b3_096501b6393e(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_fb166533_e84b_4f2e_994f_4204f3041f07(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            int num = arr.get(i);
            if (num < 10) {
                sum += num;
            } else if (num < 100) {
                sum += num - 10;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_0_91174b4c_1bf3_465f_86d0_6bef8a8a5140(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_0_6c4034fd_b93f_446a_8add_3bef842c54be(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) >= 10) {
                continue;
            }
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_4_72909e77_d888_4708_8bfd_f7c1bef011ee(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_4_de3ea0a8_9411_416e_9497_2b0051fee7b5(ArrayList<Integer> arr, int k) {

        // Write your code here
        int len = arr.size();
        int i = 0;
        int j = 0;
        int sum = 0;
        while(i < len){
            if(j == k){
                break;
            }
            if(j == 0){
                sum += arr.get(i);
                j++;
            }
            else if(j == 1){
                if(arr.get(i) > 9){
                    sum += arr.get(i) % 10;
                    j++;
                }
                else{
                    sum += arr.get(i);
                    j++;
                }
            }
            else{
                if(arr.get(i) > 9){
                    sum += arr.get(i) % 10;
                    j++;
                }
                else{
                    sum += arr.get(i);
                    j++;
                }
            }
            i++;
        }
        return sum;
    }

    
    public static int addElements_Problem_4_795c9d9b_0ed5_452d_94b5_fc17fd1656bb(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_3_520ad95d_5db9_4ae9_a16b_0e5eef7126e3(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_3_e13c953e_9846_4893_a936_97a4cbc4d9d1(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_0_9c8fa3ef_e293_43ee_83e2_751a009be85f(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_3_c02020af_ccaf_4543_9e22_a96b49b85582(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_cc956be9_eb77_448d_a40c_8e7146cb88db(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_4_c97ba479_02d5_4716_be49_cc6e829cb1d2(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_27aa20d7_407c_4318_9c65_a2b57d671b97(ArrayList<Integer> arr, int k) {
        var sum = 0;
        for (var i = 0; i < k; i++) {
            var v = arr.get(i);
            if (v >= 10 && v < 100) {
                sum += v;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_4_62c021a7_997f_4f18_a4a6_867d772c78da(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_3_d3025009_6d8b_4436_93b2_276afb98e2a8(ArrayList<Integer> arr, int k) {

        // Your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_c5270379_dd6a_4a4e_b94e_3089c328e3f3(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for(int i = 0; i < k; i++) {
            if(arr.get(i) < 10) {
                sum += arr.get(i);
            } else {
                sum += arr.get(i) % 10;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_2_606672f5_6b3a_4001_ac63_7097374dfd47(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i< arr.size(); i++) {
            sum += arr.get(i);
            if((i+1)<arr.size() && arr.get(i+1)<10) {
                sum += arr.get(i+1);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_1_5fc1dd4d_e1a1_49b7_a344_8ce03c450cfd(ArrayList<Integer> arr, int k) {

        // Write your code here
        int len = arr.size();
        int i = 0;
        int j = len - 1;
        int sum = 0;
        while (i < j) {
            if (arr.get(i) + arr.get(j) <= k) {
                sum += arr.get(i) + arr.get(j);
                i++;
                j--;
            } else {
                sum += arr.get(i) + arr.get(j) - k;
                j--;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_0_a8ceab84_600f_4ac1_af7b_ab585f848cf0(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100)
                sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_4fda675c_f5cc_447e_8830_b8b68317b500(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i<arr.size()-k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_2f008a0f_fef3_423d_b1fe_5cff577409d8(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 10) {
                sum += arr.get(i);
            } else if (arr.get(i) < 100) {
                sum += arr.get(i) / 10;
            } else {
                sum += arr.get(i) / 100;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_2_a15ab459_58a4_470c_8ee6_b847004f87e6(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) >= 100) {
                continue;
            }
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_4_cb86baa6_c822_4580_977d_6d4380d97436(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_0_c0eca4ba_3031_408c_b0a9_8e672802ec93(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_47c18bf6_c3fa_4ec0_97a8_70ff718315cc(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_4_c34a9c17_6ad1_49dc_b583_d582044f1acc(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_0_2052e1fe_4a3e_42b3_806a_7f2b39628627(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_0_e7008e00_7510_4c89_90af_d7d5bd97712c(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_6dfe7e08_61f5_4188_8a3b_6e84ccf34dd3(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_a60dc380_e1c4_49f4_a4d5_e19368c5ecaa(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_a3786e1e_b876_4443_be56_b488e0702883(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_2_8692b924_3695_44a0_85f6_17316c3fab27(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_727d5244_9a62_4f93_8aef_916e0292323b(ArrayList<Integer> arr, int k) {

        // Write your code here
        int n = arr.size();
        int i = 0;
        int j = 0;
        int sum = 0;
        while (i < n) {
            if (j == k) {
                break;
            }
            sum += arr.get(i);
            i++;
            j++;
        }
        return sum;
    }

    
    public static int addElements_Problem_1_b2e54032_29b0_4aa8_af06_fb3c6f9ea711(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        int size = arr.size();
        if (k > size) {
            return sum;
        }
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_4_90ae7006_e859_4833_900b_faadacb20c27(ArrayList<Integer> arr, int k) {
        return arr.stream().limit(k).filter(x -> x < 100).reduce(0, (x, y) -> x + y);
    }

    
    public static int addElements_Problem_2_a3ef44c6_1763_48a7_8b4a_6df7bcb9cb32(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_0_f69c99c5_efdd_4820_9265_3ab95b747d4e(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_2_4b9d7764_a39d_4951_8800_a47be4f2416c(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            int num = arr.get(i);
            if (num < 100) {
                sum += num;
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_4_2773fa64_70db_4e26_9f51_5579a437206f(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 10) {
                sum += arr.get(i);
            } else if (arr.get(i) < 100) {
                sum += arr.get(i) / 10 + arr.get(i) % 10;
            } else {
                sum += arr.get(i) / 100 + arr.get(i) % 100 / 10 + arr.get(i) % 100 % 10;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_3_fd1151e2_c3ba_44c7_9796_44c0861b38b6(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for(int i = 0; i < k; i++){
            if(arr.get(i) < 10){
                sum += arr.get(i);
            }
            else{
                sum += arr.get(i) % 10;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_1_79f0d5cd_ce87_4cd2_b61c_6a9132107168(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_2_29b7bed2_be5a_49f4_8ab5_497d695ddc77(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i< arr.size(); i++) {
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_0_ef07c8d4_a8b4_495c_bb54_cfce93fbe7ef(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_67519e65_24a1_4ab1_82a3_d17601a7d6a0(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_2_3750b6c9_e922_4841_8a4b_39c1affd9d9d(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_4_429df7a9_42aa_4c33_9095_824d1573b60d(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_dba83c00_d81a_46ca_b57f_eda41df838c6(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_52f3c45d_a2fe_4e0c_8d01_0ec94e375d4f(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_1df32723_b779_436f_8bfc_aaa80f03786f(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 10) {
                sum += arr.get(i);
            } else {
                sum += arr.get(i) % 10;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_4_c611cd0e_913d_42ce_a233_523c55d2e471(ArrayList<Integer> arr, int k) {
        int sum = 0;
        int max = 0;
        int min = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
            max = Math.max(max, arr.get(i));
            min = Math.min(min, arr.get(i));
        }
        sum += max;
        sum += min;
        return sum;
    }

    
    public static int addElements_Problem_2_acd7a494_f504_42d7_aa76_bcea15722b27(ArrayList<Integer> arr, int k) {

        return arr.stream().limit(k).mapToInteger(Integer::intValue).sum();
    }

    
    public static int addElements_Problem_3_6a59ba16_5122_4f07_9c8f_a9a989754081(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_1_7230cf85_8b09_4896_aefa_aa4d65d7da43(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_0_f96d622a_dc30_4b0d_84e3_d7afeda5203c(ArrayList<Integer> arr, int k) {

        // Write your code here
        int len = arr.size();
        int start = 0;
        int end = len - 1;
        int sum = 0;
        while (start <= end) {
            if (end - start + 1 >= k) {
                sum += arr.get(end) - arr.get(start);
                start++;
                end--;
            } else {
                sum += arr.get(end) - arr.get(start);
                end--;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_3_763c8bfb_8f1f_448f_ad5a_fe667ffbc939(ArrayList<Integer> arr, int k) {

        return arr.stream().limit(k).mapToInteger(x -> x).sum();
    }

    
    public static int addElements_Problem_1_f387efb8_d40a_4d06_8289_98f698ba7c94(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_4_30a27801_4786_4537_a095_dffc4fc3e60b(ArrayList<Integer> arr, int k) {

        // Write your code here
        int len = arr.size();
        int i = 0;
        int j = len - 1;
        int sum = 0;
        while (i < j) {
            if (arr.get(i) + arr.get(j) <= k) {
                sum += arr.get(i) + arr.get(j);
                i++;
            } else {
                sum += arr.get(j);
                j--;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_0_ffabb148_dce0_46b4_8557_115325d90b97(ArrayList<Integer> arr, int k) {
        int result = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                result += arr.get(i);
            }
        }
        return result;
    }

    
    public static int addElements_Problem_4_895b835a_f632_415f_b517_98eaab751729(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_1_78a704ad_d95d_44a7_a013_33205854fb78(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_4_53b9f289_97c9_41b0_bf82_860ed631c4c4(ArrayList<Integer> arr, int k) {

        return arr.stream().limit(k).mapToInteger(Integer::intValue).sum();
    }

    
    public static int addElements_Problem_0_dac357ae_52d5_47c0_9b9a_8326b61924cd(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int a : arr){
            int b =  (a % 10);
            if(k == 0 || k == arr.size() || (b < k && b % 10 < 0)){
                sum += a;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_4_6f8df1d8_4226_4f43_ad3d_fdbce1a95e2d(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i=0;i<k;i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_4_8bc54d37_7430_482d_b9a9_ee6966b5ba90(ArrayList<Integer> arr, int k) {

        // Write your code here
        ArrayList<Integer> arr2 = new ArrayList<>();
        int i = 0;
        while(i < k){
            arr2.add(arr.get(i));
            i++;
        }
        int sum = 0;
        for(int j = 0; j < arr2.size(); j++){
            sum += arr2.get(j);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_f870476c_690d_4cbc_be9e_560d99e63dbe(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_4_c340171b_d3bc_453d_9595_684dc70e444e(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i< arr.size()-k; i++){
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_0_66e91b8a_853c_44a2_8ecb_38b7a5fa5490(ArrayList<Integer> arr, int k) {

        // Write your code here
        return arr.stream().limit(k).mapToInteger(Integer::intValue).sum();
    }

    
    public static int addElements_Problem_3_a2ee8221_119c_449a_bb97_29522fc06112(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 10) {
                sum += arr.get(i);
            } else if (arr.get(i) < 100) {
                sum += arr.get(i) - (arr.get(i) % 10);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_3_a19b0cf6_7dc5_40ee_bf2a_897597232a0f(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_b255152b_2b68_4892_b525_35e281672ced(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_2_e9c6e174_342f_4eea_baaf_2f48210f3eb0(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_0_ec450376_d4e0_4643_8988_b40a35657f59(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) <= 99) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_2_f69c99c5_efdd_4820_9265_3ab95b747d4e(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_0_5cd5b14e_4854_4c9f_98e8_d4bea2359eb8(ArrayList<Integer> arr, int k) {
        return arr.stream().limit(k).filter(i -> i < 100).reduce(0, (x, y) -> x + y);
    }

    
    public static int addElements_Problem_3_69ea0791_93bd_41aa_8f1a_ffb3ea66da2e(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_4_0f4f50ca_f90f_4580_98ab_51f26eb484de(ArrayList<Integer> arr, int k) {
        int result = 0;
        int[] temp = new int[arr.size()];
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            int num = arr.get(i);
            if (num < 100) {
                result += num;
                count++;
            }
            else {
                temp[i] = arr.get(i);
            }
        }
        int size = count;
        if (k > size) {
            for (int i = 0; i < temp.length; i++) {
                if (temp[i] > 0) {
                    result += temp[i];
                    size++;
                }
                if (size == k)
                    break;
            }
        }
        return result;
    }

    
    public static int addElements_Problem_3_a8d86a70_d5c5_4e62_b287_1ca6116bc9f1(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_2_86e734b3_2302_48e7_9674_3621f62ccc88(ArrayList<Integer> arr, int k) {
        throw new UnsupportedOperationException("Please remove this line and implement your code here!");
    }

    
    public static int addElements_Problem_1_e3cf34bf_e387_4fe5_b288_a8f4f64bc763(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_74452e23_a895_4a4a_819b_50efc6c5ded3(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_c0eca4ba_3031_408c_b0a9_8e672802ec93(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_dfc75216_ede9_4333_b0e3_30a2474047ae(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_2_e1084825_4084_4255_ba2b_9b72a539fd40(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_2_4ba35c88_c49d_40d3_b2d4_1c255c6f3217(ArrayList<Integer> arr, int k) {

        // Write your code here
        ArrayList<Integer> arr2 = new ArrayList<Integer>();
        int sum = 0;
        for (int i = 0; i < k; i++) {
            arr2.add(arr.get(i));
        }
        for (int i = 0; i < arr2.size(); i++) {
            sum += arr2.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_507f7385_00a7_49d4_af9f_97d69db0a86f(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_4_848daf2e_54e6_4761_9ae8_72e2478d7b26(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_4_6c4034fd_b93f_446a_8add_3bef842c54be(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) >= 10) {
                continue;
            }
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_044bd4e0_b3b3_487d_a444_32dd30bdb08e(ArrayList<Integer> arr, int k) {

        int sum = 0;
        int size = arr.size();
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_0_cfafa7a2_18a6_4fc1_b450_81b8bd1030f2(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_2_a2f42ec4_ce50_424c_b3a5_e685565a6a9b(ArrayList<Integer> arr, int k) {

        // Write your code here
        return arr.stream().limit(k).mapToInteger(Integer::intValue).filter(i -> i < 100).sum();
    }

    
    public static int addElements_Problem_3_94369899_6054_41e1_aeae_d60a776bbbc2(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_89262f92_c508_402c_a817_06cc108e9b27(ArrayList<Integer> arr, int k) {

        int sum = 0;
        int i = 0;
        while (i < k) {
            sum += arr.get(i);
            i++;
        }
        return sum;
    }

    
    public static int addElements_Problem_4_9fc37d3a_3527_4d54_b84b_9294302c5684(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_2_971c130c_7f9b_4e27_b4d5_61f487f2e09f(ArrayList<Integer> arr, int k) {

        // Write your code here
        int len = arr.size();
        int i = 0;
        int j = 0;
        int sum = 0;
        while(i < len){
            if(j == k){
                break;
            }
            if(j == 0){
                sum += arr.get(i);
                j++;
            }
            else{
                if(arr.get(i) < 10){
                    sum += arr.get(i);
                    j++;
                }
                else{
                    break;
                }
            }
            i++;
        }
        return sum;
    }

    
    public static int addElements_Problem_4_b7a9ce8d_4213_4546_aef2_8937da7a8b1b(ArrayList<Integer> arr, int k) {

        // Write your code here
        int n = arr.size();
        int i = 0;
        int j = n - 1;
        int sum = 0;
        while (i < j) {
            sum += arr.get(i);
            if (sum > k) {
                sum -= arr.get(j);
                j--;
            } else {
                i++;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_3_57f58985_a6d5_4039_be1b_859dd2cf4599(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_6cc8fe64_754c_456a_9e05_ba7d3ec2aad3(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_2_568a7616_dd1c_4b86_b221_0cf6ecc5406d(ArrayList<Integer> arr, int k) {
        int sum = 0;
        int sum2 = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
            sum2 += arr.get(i);
        }
        return sum + sum2;
    }

    
    public static int addElements_Problem_2_17c4ba25_d049_4de4_95d8_6b53c9bae712(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 99) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_4_36f9b0f1_2d1c_44ee_84be_58ae15d40a80(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_1_20e479fe_fa96_43d2_80a5_9088cbc05b61(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_0_f41ffe54_f523_455b_9a71_3ae7b7f9a305(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 10) {
                sum += arr.get(i);
            } else if (arr.get(i) < 100) {
                sum += arr.get(i) - 10;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_1_d870058c_886b_4faa_8792_5a297c1628f9(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            int num = arr.get(i);
            if (num < 100) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_3_86ffa56c_d9ac_4f5e_8385_26b023eb5dc0(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_421caa3e_804f_4cac_a795_15f37e560fa1(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            int num = arr.get(i);
            if (num < 100) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_1_21940948_e60a_42ef_80ae_cea02bc84d74(ArrayList<Integer> arr, int k) {
        int retVal = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                retVal += arr.get(i);
            }
        }
        return retVal;
    }

    
    public static int addElements_Problem_4_253b350c_ad65_4632_abfd_dd3fe29626a9(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_4_139aa8b0_6cda_41ef_8104_256cbd15a4ab(ArrayList<Integer> arr, int k) {
        int count = 0;
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) < 100 && count < k) {
                sum += arr.get(i);
                count++;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_1_a0e55dfa_8650_4f0f_aab0_406e740f5729(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_4_a83737d0_8e78_4e4f_a807_2ff0479d18c3(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_0_0dbe6280_fce3_4363_87f2_fd9d1bb1ac65(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_0_925bfe70_1f43_4962_8893_1d5c60fc5b5b(ArrayList<Integer> arr, int k) {

        return arr.stream().limit(k).mapToInteger(x -> x).sum();
    }

    
    public static int addElements_Problem_0_864557ed_50ab_4a66_a273_b695a1ab3f34(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 10) {
                sum += arr.get(i);
            } else if (arr.get(i) < 100) {
                sum += arr.get(i) / 10;
            } else {
                sum += arr.get(i) / 100;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_0_938bb325_305b_434b_8838_314ee8d72113(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for(int i = 0; i < k; i++) {
            if(arr.get(i) < 10) {
                sum += arr.get(i);
            } else if(arr.get(i) < 100) {
                sum += arr.get(i);
            } else {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_0_c0cb9004_890d_47ea_a794_a4fe18bda182(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i< arr.size(); i++) {
            sum += arr.get(i);
            if((i+1)<arr.size() && arr.get(i+1)<10) {
                sum += arr.get(i+1);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_2_27aa20d7_407c_4318_9c65_a2b57d671b97(ArrayList<Integer> arr, int k) {
        var sum = 0;
        for (var i = 0; i < k; i++) {
            var v = arr.get(i);
            if (v >= 10 && v < 100) {
                sum += v;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_2_6ed5ac5a_583d_47fd_afe1_eb656cee3942(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_2_67fb24c8_c8ea_4123_9fbd_9a841c404f92(ArrayList<Integer> arr, int k) {

        // Write your code here
        return arr.stream().limit(k).mapToInteger(Integer::intValue).sum();
    }

    
    public static int addElements_Problem_2_a4bd6579_4208_4458_a68b_d1612b8de5c1(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_0_1c5294ca_926d_4729_9d92_89bc565355dc(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 10) {
                sum += arr.get(i);
            } else if (arr.get(i) < 100) {
                sum += arr.get(i) / 10;
            } else {
                sum += arr.get(i) / 100;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_0_3a2bf0e7_4f38_498d_b8db_7b5555a49502(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_3032de24_d380_4977_8bec_30ee1cc51035(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_4_8692b924_3695_44a0_85f6_17316c3fab27(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_5e488f58_260a_45b3_a7ae_f9927e49f417(ArrayList<Integer> arr, int k) {

        // Write your code here
        int len = arr.size();
        int i = 0;
        int j = 0;
        int sum = 0;
        while(i < len) {
            if(j < k) {
                sum += arr.get(i);
                i++;
            } else {
                sum += arr.get(j);
                j++;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_4_389d86f8_5292_4462_b4ac_b646981e2a89(ArrayList<Integer> arr, int k) {
        return 0;
    }

    
    public static int addElements_Problem_2_66788bca_bc30_446d_843c_c70db777982c(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_2_035f0862_eaa3_4159_8ded_7849977d23b0(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_1_36b45b6e_4e07_41f7_9617_023169df61b4(ArrayList<Integer> arr, int k) {
        int ret = 0;
        for(int i = 0; i< arr.size()-k; i++){
            ret += arr.get(i);
        }
        return ret;
    }

    
    public static int addElements_Problem_0_5c65fcd0_b916_457a_9ee9_78b0591a7006(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_4_14c97f9b_1195_41a9_8390_da47bcb0e41e(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_3_cac50de1_f28b_4c5c_8b65_a1e8640435c7(ArrayList<Integer> arr, int k) {
        return arr.stream().limit(k).filter(x -> x < 100).mapToInteger(x -> x).sum();
    }

    
    public static int addElements_Problem_1_d3025009_6d8b_4436_93b2_276afb98e2a8(ArrayList<Integer> arr, int k) {

        // Your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_4_3fb08884_45e5_49e3_a558_0e9e1afd00a5(ArrayList<Integer> arr, int k) {
        // Start by building a stream of the first k elements
        Stream<Integer> s = arr.stream().limit(k);
        // Then, filter the stream down to elements with at most two digits,
        // and finally, reduce the elements down to a sum
        return s.filter(x -> x.toString().length() <= 2).reduce(0, (x, y) -> x + y);
    }

    
    public static int addElements_Problem_1_a1cc82ef_4a1e_409d_a13b_75e7fa086616(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_2_39eb068a_1f3d_4762_9de4_96e062d6c410(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_0_2bb6f2d0_cc4d_471c_9e80_3125df339888(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            int num = arr.get(i);
            if (num < 100) {
                sum += num;
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_4_d90db5be_5515_4b75_844e_096a117fc547(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_2_6d99d75c_21f5_48be_ac0d_82d96c8d3c94(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_600cbea2_0a2f_450c_bf4b_269193db8d1e(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) >= 0 && arr.get(i) <= 99) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_0_48967c55_eac2_424e_9648_6ff6a3956e1f(ArrayList<Integer> arr, int k) {

        // Write your code here
        int n = arr.size();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_cd55de1c_364d_4a26_95ab_43dfa98b2bb6(ArrayList<Integer> arr, int k) {

        // Write your code here.
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_4_ae6722c2_9d28_437c_98f9_7003bb2350a0(ArrayList<Integer> arr, int k) {
        return arr.stream().limit(k).filter(x -> x < 100).reduce(0, (x, y) -> x + y);
    }

    
    public static int addElements_Problem_0_0b520e9d_b834_40c6_b1d3_ec2eca08822b(ArrayList<Integer> arr, int k) {

        // Write your code here
        int len = arr.size();
        int i = 0;
        int sum = 0;
        while(i < len) {
            if(i + k > len) {
                sum += arr.get(i);
                break;
            }
            sum += arr.get(i);
            i++;
        }
        return sum;
    }

    
    public static int addElements_Problem_0_453e6c0e_11f2_4033_92a0_2e70a10ab938(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_4_608bb4ff_e661_455b_8c0d_02b583299785(ArrayList<Integer> arr, int k) {
        return arr.stream().limit(k).filter(x -> x < 100).mapToInteger(x -> x).sum();
    }

    
    public static int addElements_Problem_1_d7f964a7_03f7_48ad_bd22_cac2c0ad8a53(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i<k; i++){
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_1a9ac1bf_67bc_45bc_a70f_5f1aaa4b61ea(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_66e91b8a_853c_44a2_8ecb_38b7a5fa5490(ArrayList<Integer> arr, int k) {

        // Write your code here
        return arr.stream().limit(k).mapToInteger(Integer::intValue).sum();
    }

    
    public static int addElements_Problem_4_ab33f643_f5b6_4f8d_89a8_88e51b346bae(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            String s = String.valueOf(arr.get(i));
            if (s.length() > 2) {
                s = s.substring(0, 2);
            }
            sum += Integer.parseInteger(s);
        }
        return sum;
    }

    
    public static int addElements_Problem_0_b18e9500_8314_4219_a237_e17ade862910(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_2_541ebf1b_fbad_40af_b3ed_4a7c2c76da48(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_0_c674cace_a64d_451a_8c12_a0ddf8e1e33f(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_4_54854d41_5ba3_4fda_9569_1bdcd438b16c(ArrayList<Integer> arr, int k) {

        return arr.stream().limit(k).mapToInteger(Integer::intValue).sum();
    }

    
    public static int addElements_Problem_1_2510e3fd_d7e4_423d_a356_2c45ea3e0810(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_4_838ba12b_9c0e_4b51_829d_9d53b43bdeeb(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_4_0f02c0c0_c143_4c6c_9628_72339518ff09(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_0_639e02d4_a01d_466d_baac_5e2d169b51a9(ArrayList<Integer> arr, int k) {

        // Write your code here
        int len = arr.size();
        int i = 0;
        int j = len - 1;
        int sum = 0;
        while (i < j) {
            if (arr.get(i) + arr.get(j) < k) {
                sum += arr.get(i);
                i++;
            } else {
                sum += arr.get(j);
                j--;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_3_aaf478cf_f94b_4343_94a0_283d1f3df01e(ArrayList<Integer> arr, int k) {

        // Write your code here.
        return arr.stream().limit(k).mapToInteger(i -> i).sum();
    }

    
    public static int addElements_Problem_2_a44f6db7_eec3_4036_bcf0_3cafcc749352(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_4_3cf56dc2_db78_43da_b9f9_f2eebd56a7ec(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_0_828ca588_312c_409f_bebd_7799587f90b4(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            int num = arr.get(i);
            if (num < 100) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_3_dbf62268_a929_4e76_8a43_65e9b5503667(ArrayList<Integer> arr, int k) {
        int sum = 0;
        int i = 0;
        while (i < k) {
            int num = arr.get(i);
            if (num < 100) {
                sum += num;
            }
            i++;
        }
        return sum;

    }

    
    public static int addElements_Problem_1_ccac9ed7_7967_46f8_bd74_bb92b022f16c(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        int i = 0;
        int j = 0;
        while(i < arr.size() && j < k) {
            sum += arr.get(i);
            i++;
            j++;
        }
        while(j < k) {
            sum += arr.get(i);
            i++;
            j++;
        }
        return sum;
    }

    
    public static int addElements_Problem_1_25b2e131_8f40_4e6c_b6e7_75ceab4c8e42(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_4_a83b4fc7_e0fb_4c6f_8b69_11ab64b0dae4(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_3ef46768_30e1_44a6_9bb1_eab008ab38da(ArrayList<Integer> arr, int k) {
        // Your code here.
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_2_46ab8b2e_3169_4f09_99af_fbdfb7cd01c8(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_0_e5a0e429_ba15_4dc9_a4fa_c41cc23fc6e3(ArrayList<Integer> arr, int k) {
        return arr.stream().limit(k).filter(x -> x < 100).mapToInteger(x -> x).sum();
    }

    
    public static int addElements_Problem_3_98250708_9e4a_4db5_943e_ee64da1ada2e(ArrayList<Integer> arr, int k) {
        return arr.stream().limit(k).filter(x -> x < 100).reduce(0, (x, y) -> x + y);
    }

    
    public static int addElements_Problem_0_6ea620e0_256a_487b_97cc_0a8fd79eeee1(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_4_23277c69_ae53_417e_8ffd_3b32f14150d5(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_0_078f6dba_c8e7_4ee6_9cb3_7af0c4482f0a(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_4a2bc2dc_7c49_4a75_9b2c_e3cd6532a8e2(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_2_91daae77_0ddf_48af_89ab_0b4d9de429d8(ArrayList<Integer> arr, int k) {
        throw new IllegalArgumentException("Not yet implemented");
    }

    
    public static int addElements_Problem_2_6cd7b425_a6fd_4c25_a4e5_f1e1f7a1e4e0(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            int num = arr.get(i);
            if (num < 100) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_1_55e991cb_8b7d_4cf2_8d4d_f32e17942f17(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_0_eaa0a5d6_b6cf_4998_90c5_04b29b5ad2f5(ArrayList<Integer> arr, int k) {
        // first, we need to create a subarray of arr with only the first k elements.
        // Since we don't have a built-in library method to do that, we will just
        // iterate from the beginning of arr to k and populate a new ArrayList with
        // those elements.
        ArrayList<Integer> subArr = new ArrayList<Integer>();
        for (int i = 0; i < k; i++) {
            subArr.add(arr.get(i));
        }
        // Now, we need to filter the subarray to just elements with two digits.
        // Again, since we don't have a built-in library method to do that, we will
        // iterate over the array and only add elements that have two digits to a
        // new ArrayList.
        ArrayList<Integer> filteredSubArr = new ArrayList<Integer>();
        for (int i = 0; i < subArr.size(); i++) {
            if (subArr.get(i) > 9 && subArr.get(i) < 100) {
                filteredSubArr.add(subArr.get(i));
            }
        }
        // Now, we need to return the sum of the elements in filteredSubArr. Again,
        // since we don't have a built-in library method to do that, we will iterate
        // over filteredSubArr and sum the elements.
        int sum = 0;
        for (int i = 0; i < filteredSubArr.size(); i++) {
            sum += filteredSubArr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_71a1f693_61b6_479f_8280_f03ddec1f7bb(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_0_bdaeb67a_f279_42e6_a004_f4eedd2a4495(ArrayList<Integer> arr, int k) {

        // Write your code here
        int n = arr.size();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr.get(i);
        }
        if (k == 0) {
            return sum;
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (count == k) {
                break;
            }
            sum -= arr.get(i);
            count++;
        }
        return sum;
    }

    
    public static int addElements_Problem_1_e45d9934_f72d_4ca8_8b17_d5f065ee8d4b(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_4_1c9af279_3b15_41d9_88c0_e7c5e9b1d03d(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        int i = 0;
        while (i < k) {
            sum += arr.get(i);
            i++;
        }
        return sum;
    }

    
    public static int addElements_Problem_3_1f3c293d_2fae_4850_b28f_dabd2bf041ad(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            int n = arr.get(i);
            int tmp;
            if (n > 9) {
                tmp = n / 10;
                n = n % 10;
                if (tmp > 9) {
                    sum += tmp / 10;
                    tmp = tmp % 10;
                }
                sum += tmp;
            }
            sum += n;
        }
        return sum;
    }

    
    public static int addElements_Problem_3_3d02eee5_6bbf_4392_98e5_a7643a5fe2bc(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_0_8cd21bf6_adc6_4ac3_a263_ad1cfd70d190(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_4_9fcb98cd_baa7_4c3f_abf3_3a63878d4ddf(ArrayList<Integer> arr, int k) {

        // Write your code here
        int n = arr.size();
        int i = 0;
        int sum = 0;
        while (i < n) {
            sum += arr.get(i);
            if (i + 1 < n && sum > k) {
                sum = arr.get(i + 1) + sum - k;
                i++;
            }
            i++;
        }
        return sum;
    }

    
    public static int addElements_Problem_0_fea23963_eee3_4d7a_8dbb_3b18024f4996(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 10) {
                sum += arr.get(i);
            } else if (arr.get(i) < 100) {
                sum += arr.get(i) - 10;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_3_60f95858_c9a0_4f20_9320_26f697736f70(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_3_722f5fa8_dd4a_4b45_8dd9_972b62eb8e83(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_1_1e7627ae_27df_4de2_a27b_5dd7efe23bfa(ArrayList<Integer> arr, int k) {
        return arr.stream().limit(k).filter(x -> x < 100).mapToInteger(x -> x).sum();
    }

    
    public static int addElements_Problem_4_6cddfc8e_4027_4a48_ab38_11fdc7449782(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_a0dfb669_a843_4b6c_96ce_ffac293f662e(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_4_538d5fb0_e7c7_44d2_a839_2edc395d8800(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_0_66a207ea_ac25_4011_9909_cd563c8b114c(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            int num = arr.get(i);
            if (num < 100) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_4_84883dd4_a637_4755_b7da_935ce8289383(ArrayList<Integer> arr, int k) {
        // Set up a collection to store the result of the function.
        int result = 0;
        // Set up a while loop to iterate through the first k elements.
        while (k > 0) {
            // Set up a variable to contain the current value of the array at the index given by k.
            int currentValue = arr.get((k-1));
            // Check if the current value is less than a hundred.
            if (currentValue < 100) {
                // If so, add it to the result collection.
                result += currentValue;
            }
            // Decrement k by one.
            k -= 1;
        }
        // Return the result collection.
        return result;
    }

    
    public static int addElements_Problem_3_9ef0fc8b_2ef2_4bab_88e3_accb765d6527(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i< arr.size()-k; i++){
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_4_e23f0365_9732_4926_b57c_e1af65bd19f7(ArrayList<Integer> arr, int k) {
        if (k > arr.size())
            return Integer.MIN_VALUE;
        if (k == 0)
            return arr.get(0);
        if (k == 1)
            return arr.get(0) + arr.get(1);
        ArrayList<Integer> remainder = new ArrayList<Integer>();
        Set<Integer> digits = new HashSet<Integer>();
        int sum = 0;
        for (int i = 0; i <= arr.size() - k; i++) {
            digits.add(arr.get(i));
        }
        for (Integer element : digits) {
            sum += element;
        }
        remainder.add(0, sum % 10);
        sum -= remainder.get(0);
        for (int i = 1; i <= k; i++) {
            digits.add(remainder.get(i));
        }
        Set<Integer> digits2 = new HashSet<Integer>();
        for (Integer element : digits) {
            digits2.add(element % 10);
        }
        for (Integer element : digits2) {
            if (digits2.contains(element)) {
                sum += element * 10;
            }
        }
        return sum % 10 == 0 ? sum : (sum / 10 + 1);
    }

    
    public static int addElements_Problem_2_579dd519_abab_43f3_98cf_4ddd094dfd11(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_0_eba4afd1_ddf4_4fb9_a727_3ca84efb21a3(ArrayList<Integer> arr, int k) {

        // Write your code here
        int len = arr.size();
        int start = 0;
        int end = len - 1;
        int sum = 0;
        while (start <= end) {
            if (end - start + 1 > k) {
                sum += arr.get(end);
                end--;
            } else {
                sum += arr.get(start);
                start++;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_1_88d72944_445f_4987_a5cb_4ca4f49e95a2(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            int num = arr.get(i);
            if (num < 100) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_2_17b878a3_a74c_473e_9490_172d3611a390(ArrayList<Integer> arr, int k) {

        // Write your code here
        return arr.stream().limit(k).mapToInteger(x -> x).sum();
    }

    
    public static int addElements_Problem_2_d8280c80_be21_4b7d_81a0_9889eb973ad1(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_0_cbde1573_ac0a_4163_9484_06372d822a3d(ArrayList<Integer> arr, int k) {
        //System.out.println(arr.size());
        //System.out.println(k);
        int count = 0;
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 99) {
                continue;
            }
            sum += arr.get(i);
            count++;
            if (count == k) {
                break;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_0_a80355d5_38a2_4bd1_affc_4e7cc2c52d63(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_6a9a703c_dff3_4b6a_8079_3f8f26f2dc69(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_2_487d9f45_ca72_41ad_8f62_5df42e0ea65b(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_4_7ba971c9_635c_43c4_8ab7_4b62e1601176(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_b7b18806_2537_4cc5_8c19_64948c93353a(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_0_2fcef9c3_bf17_47bf_86d3_6bbe9897f8a2(ArrayList<Integer> arr, int k) {
        return arr.stream().limit(k).filter(x -> x < 100).reduce(0, (x, y) -> x + y);
    }

    
    public static int addElements_Problem_0_5163456a_6d7b_4266_9609_cbfca08eec48(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i=0;i<k;i++) {
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_1_6a9a703c_dff3_4b6a_8079_3f8f26f2dc69(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_2_38303f39_9faa_4863_81c4_7dad8d8b85ea(ArrayList<Integer> arr, int k) {
        return arr.stream().limit(k).filter(x -> x < 100).mapToInteger(Integer::intValue).sum();
    }

    
    public static int addElements_Problem_1_056d40e5_8888_4f31_a1d4_25100722c33d(ArrayList<Integer> arr, int k) {

        // Write your code here
        return arr.stream().limit(k).mapToInteger(Integer::intValue).filter(x -> x < 100).sum();
    }

    
    public static int addElements_Problem_3_a3791a65_6c92_479f_b6ee_3714a2bef4dd(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_0_0cc5f289_cbb4_4387_b417_dbaf0eac0132(ArrayList<Integer> arr, int k) {
        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_3_fa1ac239_d13d_4f43_bac7_300c42a76595(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_7631ae0e_a7f3_44a2_850b_db581d125798(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_2_a835f8be_2d3c_4dfc_a787_0d21908a8d19(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            int num = arr.get(i);
            if (num > 9) {
                if (num > 99) {
                    sum += num % 10;
                } else {
                    sum += num % 100;
                }
            } else {
                sum += num;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_4_b2756745_7fbe_435c_a22e_c83b7f4c5360(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_16b6ba98_f391_4103_b200_cce27796fd1f(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_4_3155c73b_b1e4_4827_8bd2_ad5360940ba9(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_4_69334526_56a6_43e9_af4c_f364b401dc67(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_4896c8cc_4c1f_48ee_b12d_b23d7835e8ba(ArrayList<Integer> arr, int k) {
        if (arr.isEmpty() || k == 0) {
            return 0;
        }
        int count = 0;
        int max = 0;
        int prevMax = 0;
        for (int e : arr) {
            int current = Math.abs(e);
            if (current > max) {
                max = current;
                count = 0;
            }
            if (count < k) {
                max = Math.max(max, current);
                count += 1;
            }
            int newPrevMax = Math.abs(arr.get(arr.size() - 1) - max);
            if (newPrevMax > prevMax) {
                prevMax = newPrevMax;
                count = 0;
            }
        }
        return max;
    }

    
    public static int addElements_Problem_0_d870058c_886b_4faa_8792_5a297c1628f9(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            int num = arr.get(i);
            if (num < 100) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_1_c3b0b092_0457_4c14_ad26_c7d01dffbc97(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_3_0f4f50ca_f90f_4580_98ab_51f26eb484de(ArrayList<Integer> arr, int k) {
        int result = 0;
        int[] temp = new int[arr.size()];
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            int num = arr.get(i);
            if (num < 100) {
                result += num;
                count++;
            }
            else {
                temp[i] = arr.get(i);
            }
        }
        int size = count;
        if (k > size) {
            for (int i = 0; i < temp.length; i++) {
                if (temp[i] > 0) {
                    result += temp[i];
                    size++;
                }
                if (size == k)
                    break;
            }
        }
        return result;
    }

    
    public static int addElements_Problem_3_d7134dde_a52c_4c62_bc42_790241a3230b(ArrayList<Integer> arr, int k) {

        // Write your code here.
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_4_dcd2cbb3_2989_4713_be8b_5569eb47336d(ArrayList<Integer> arr, int k) {

        return arr.stream().limit(k).map(x -> String.valueOf(x).length() <= 2 ? x : 0).mapToInteger(x -> x).sum();
    }

    
    public static int addElements_Problem_0_54a25d1b_b8a3_441f_a5ca_5f0e9b3c2813(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) >= 10 && arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_2_3f1efb60_bc51_4e5b_8fdf_9d6af86eed00(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_1_81680634_4590_4cf1_938e_0f82d3e2d197(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i< arr.size()-k; i++) {
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_3_77ed67a5_ef30_4cb6_a833_92df66b84410(ArrayList<Integer> arr, int k) {

        // Write your code here
        return arr.stream().limit(k).mapToInteger(x -> x).sum();
    }

    
    public static int addElements_Problem_3_5ed69716_0ab8_4a79_a9c9_2cec3e505dac(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i<arr.size()-k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_45675520_f0c2_4e4b_9487_2f8059799a5c(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 10) {
                sum += arr.get(i);
            } else if (arr.get(i) < 100) {
                sum += arr.get(i) / 10 + arr.get(i) % 10;
            } else {
                sum += arr.get(i) / 100 + arr.get(i) % 100 / 10 + arr.get(i) % 100 % 10;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_3_005d835f_5d22_49a2_8ed2_4d6f7d09b53a(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_9a05c84b_1dd3_421b_b833_709acfeb5e7e(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_2_dbcfa6d4_f7f5_4e42_a1a7_9a40950083bc(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_4_de1fb459_9a95_4616_a3d8_9c055caafb25(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_0_0f1f05d8_b2a9_45f0_93eb_de11462a9d6f(ArrayList<Integer> arr, int k) {
        // // Check for correct input.
        // assert(1 <= arr.size() && arr.size() <= 100);
        // assert(1 <= k && k <= arr.size());
        // // Create a new, sorted list.
        // ArrayList<Integer> sorted = new ArrayList<Integer>(arr);
        // Collections.sort(sorted);
        // // Add all elements to the sum.
        // int total = 0;
        // for (int i = 0; i < k; i++) {
        //     if (sorted.get(i) <= 99) {
        //         total += sorted.get(i);
        //     }
        // }
        // return total;
        return 0;
    }

    
    public static int addElements_Problem_2_d0898bf8_5bf8_4a47_89a7_c5369c33ad64(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_4_5c19bca4_175a_42a3_848a_85fdb883da4a(ArrayList<Integer> arr, int k) {

        // Your code here
        return 0;
    }

    
    public static int addElements_Problem_4_0ab920ab_c3d5_4ffb_a431_d222da04fd99(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for(int i = 0; i < k; i++) {
            if(arr.get(i) < 10) {
                sum += arr.get(i);
            } else if(arr.get(i) < 100) {
                sum += arr.get(i) / 10;
            } else {
                sum += arr.get(i) / 100;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_2_c09fc3dc_4dfb_4f46_bf3c_9679c6114435(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_1_e89588a0_d751_4d69_adcc_b7f25f20cd0a(ArrayList<Integer> arr, int k) {

        // Write your code here
        int len = arr.size();
        int i = 0;
        int sum = 0;
        while(i < len) {
            if(i + k <= len) {
                sum += arr.get(i);
                i += k;
            } else {
                sum += arr.get(i);
                break;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_4_9097402e_aab8_42bb_957a_9d4f21291375(ArrayList<Integer> arr, int k) {
        int result = 0;
        for (int i = 0; i < k; i++) {
            int num = arr.get(i);
            if (num < 100) {
                result += num;
            }
        }
        return result;
    }

    
    public static int addElements_Problem_0_8da11753_efac_4c08_9569_d4e1491ff1b7(ArrayList<Integer> arr, int k) {
        if(arr == null || arr.size() == 0) {
            return 0;
        }
        if(k > arr.size()) {
            k = arr.size();
        }
        int result = 0;
        for(int i = 0; i < k; i++) {
            int element = arr.get(i);
            if(element < 100) {
                result += element;
            }
        }
        return result;
    }

    
    public static int addElements_Problem_1_faecd649_2fb5_46b5_87f3_ed9ca6ec5f86(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for( int i=1; i<=k; i++ ) {
            sum = sum + arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_27052540_0feb_4c39_98f8_a421c4df72bf(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            int num = arr.get(i);
            if (num < 100) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_4_9c6675cf_a523_4ab4_9d8b_86cfe43156ec(ArrayList<Integer> arr, int k) {
        // arr2[i] = arr[i] % 100, i=0..k-1
        // Sum of elements 0..k-1 of arr2 is the same as sum of first k digits of arr
        // (because elements with > 2 digits are all 0)
        int[] arr2 = new int[k];
        for (int i = 0; i < k; i++)
            arr2[i] = arr.get(i) % 100;
        return Arrays.stream(arr2).sum();
    }

    
    public static int addElements_Problem_3_625dde8c_b83f_4e23_80a6_578296c7b655(ArrayList<Integer> arr, int k) {
        return arr.stream().limit(k).filter(x -> x < 100).mapToInteger(x -> x).sum();
    }

    
    public static int addElements_Problem_4_a14f9c45_a3d1_4711_9114_d6400a43ad00(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_36a8a08f_d672_49da_896c_b60a07ab9f21(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_3_33f36eef_eec3_4639_a960_681ce9c780cf(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_0_1c5d519c_de43_417b_ba04_a834bcf61335(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_0_3cf80bbf_6e47_45e9_9e43_c7e393ef3dc6(ArrayList<Integer> arr, int k) {
        return arr.stream().limit(k).filter(e -> e < 100).reduce(0, (acc, x) -> acc + x);
    }

    
    public static int addElements_Problem_2_e37ffaca_3d8a_4b87_bb18_7c8392375277(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            int num = arr.get(i);
            if (num < 100) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_1_f6ab0401_7eb4_4a49_9e6b_5f5c304fbcd6(ArrayList<Integer> arr, int k) {

        // Write your code here
        return arr.stream().limit(k).mapToInteger(x -> x).sum();
    }

    
    public static int addElements_Problem_4_d0ecf114_876e_4109_b4c3_04fb52c2f8c5(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_2_62ea2765_cf26_4c81_98ed_4418e4ddf0ff(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_2_6b209d7a_f001_49ea_a055_17ddb132531e(ArrayList<Integer> arr, int k) {

        // Write your code here
        return arr.stream().limit(k).mapToInteger(x -> x).sum();
    }

    
    public static int addElements_Problem_1_098712ea_6851_492e_a854_0b34c5b82ee0(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            int n = arr.get(i);
            if (n < 100) {
                sum += n;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_2_a1086722_d78c_4500_a98b_eff0f98d99d2(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_4_3eb7f45e_a3a8_4dd3_be62_0384f2365fcd(ArrayList<Integer> arr, int k) {
        if (k == 0) {
            return 0;
        } else {
            int el = arr.get((k - 1));
            if (10 <= el && el < 100) {
                return el + addElements_Problem_4_3eb7f45e_a3a8_4dd3_be62_0384f2365fcd(arr, k - 1);
            } else {
                return addElements_Problem_4_3eb7f45e_a3a8_4dd3_be62_0384f2365fcd(arr, k - 1);
            }
        }
    }

    
    public static int addElements_Problem_4_a5bcb540_40dd_4a8e_a38c_e00201d0b6ac(ArrayList<Integer> arr, int k) {
        return arr.stream().limit(k).filter(x -> x < 100).mapToInteger(x -> x).sum();
    }

    
    public static int addElements_Problem_0_1c60fad1_f8af_4c27_87c4_b3e158f14fea(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_0_8ad2b02b_64cb_4573_aa6b_037d7406547d(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_0_6caaff1e_7bee_465e_9748_1d6966f74614(ArrayList<Integer> arr, int k) {
        return arr.stream().limit(k).filter(e -> e.toString().length() <= 2).mapToInteger(e -> e).sum();
    }

    
    public static int addElements_Problem_4_9fb4cb20_dd0c_4b3d_b182_72de8cc3b75b(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_1_6fe7fc84_6afb_414c_8cd9_fe6fb71ff877(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_0_676b686c_854e_4828_9e27_f1e2289afa34(ArrayList<Integer> arr, int k) {
        int ans = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) >= 10) {
                if (arr.get(i) < 100) {
                    ans += arr.get(i);
                }
            } else {
                ans += arr.get(i);
            }
        }
        return ans;
    }

    
    public static int addElements_Problem_0_9ab23cdd_7c71_42c0_9ef0_11dea8f6e3b8(ArrayList<Integer> arr, int k) {

        // Write your code here
        int n = arr.size();
        int sum = 0;
        for(int i = 0; i < n; i++){
            if(i < k){
                sum += arr.get(i);
            }else{
                sum += arr.get(i) / 10;
                sum += arr.get(i) % 10;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_3_91daae48_ae78_4285_9633_39dbb511c2e8(ArrayList<Integer> arr, int k) {

        // Write your code here
        return arr.stream().limit(k).mapToInteger(x -> x).sum();
    }

    
    public static int addElements_Problem_1_2ca42881_c015_4c82_aa36_98ca169943fc(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        int temp = sum;
        while (temp > 99) {
            sum = sum % 100;
            temp = temp / 100;
        }
        return sum;
    }

    
    public static int addElements_Problem_1_987fd6e8_fd21_4dd3_99f7_c1350cceef38(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 10) {
                sum += arr.get(i);
            } else if (arr.get(i) < 100) {
                sum += arr.get(i) / 10;
            } else {
                sum += arr.get(i) / 100;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_1_1f066f98_c997_4b23_83fb_c71530f9576e(ArrayList<Integer> arr, int k) {
        int m = arr.size();
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_781c4dcd_3d2c_4f23_a400_64ad0057cf2a(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_4_7454cc9d_a9c6_47ef_816f_dcb8b3cf2cc5(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_0_e7cdf13e_4e4b_4b5b_b4c9_48a8e9f0b637(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_0_30de6ef4_951c_4c5e_8547_62cc916792b4(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_1_985d3369_5507_4141_875b_abea1e19dc0c(ArrayList<Integer> arr, int k) {

        // Write your code here
        int len = arr.size();
        int i = 0;
        int sum = 0;
        while(i < len && k > 0) {
            sum += arr.get(i);
            i++;
            k--;
        }
        return sum;
    }

    
    public static int addElements_Problem_0_81244fce_75f1_4e78_8de3_234aa8433df6(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_fa7d49de_e48c_4b6e_8bc0_6749066d9e46(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for(int i = 0; i < k; i++) {
            if(arr.get(i) < 10) {
                sum += arr.get(i);
            } else if(arr.get(i) < 100) {
                sum += arr.get(i);
            } else {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_4_3860ccaf_d6b2_42c5_ad17_55488679cf58(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_1_1c0e3bd8_adec_477f_8bcb_4b07ecdfe6fc(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            int num = arr.get(i);
            if (num < 100) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_0_1e7627ae_27df_4de2_a27b_5dd7efe23bfa(ArrayList<Integer> arr, int k) {
        return arr.stream().limit(k).filter(x -> x < 100).mapToInteger(x -> x).sum();
    }

    
    public static int addElements_Problem_2_8ac31ee1_aa24_40ad_9108_9013519bd879(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i<k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_5ef8fc8b_0ae6_446b_ad63_2e268da6237c(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for(int i = 0; i < k; i++) {
            if(arr.get(i) < 10) {
                sum += arr.get(i);
            } else if(arr.get(i) < 100) {
                sum += arr.get(i) % 10;
            } else {
                sum += arr.get(i) % 10 + arr.get(i) / 10 % 10;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_2_2cbdb97e_00e2_4ad8_98bc_c85d4fc18269(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_17fe4dc2_e42b_43f9_a341_ad4a30eae99b(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i< arr.size()-k; i++) {
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_3_683571e2_327d_47ed_8cde_abc3c4634f04(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_4fcb6410_0c1c_4ad7_92c9_b3b77baef3e2(ArrayList<Integer> arr, int k) {

        // Write your code here
        int len = arr.size();
        int start = 0;
        int end = len - 1;
        int sum = 0;
        while (start <= end) {
            sum += arr.get(start);
            if (sum > 9) {
                sum = sum % 10;
            }
            if (sum == 9) {
                sum = 0;
            }
            start++;
            if (start > end) {
                break;
            }
            sum += arr.get(end);
            if (sum > 9) {
                sum = sum % 10;
            }
            if (sum == 9) {
                sum = 0;
            }
            end--;
        }
        return sum;
    }

    
    public static int addElements_Problem_4_3cc61ab8_cbb4_4a9c_9163_3b672d2110f8(ArrayList<Integer> arr, int k) {
        return arr.stream().limit(k).filter(x -> x < 100).reduce(0, (x, y) -> x + y);
    }

    
    public static int addElements_Problem_2_cb80a313_51fa_40cd_a562_5507b77cca38(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_2_6182953e_bba0_47b0_bf42_90fa10925e27(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_865af318_aa2d_4ee5_8c1a_739bc7046f8e(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_b8a81f70_6883_4380_b5db_156128636837(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 10) {
                sum += arr.get(i);
            } else if (arr.get(i) < 100) {
                sum += arr.get(i);
            } else {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_1_5b6c5296_9de9_49a7_87de_b0a0b7d13ca2(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_4_272c253a_54d5_4e5e_b103_15b67d76eaf0(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_a16225b0_8777_4121_aa6c_020766d28495(ArrayList<Integer> arr, int k) {

        // Write your code here
        int n = arr.size();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr.get(i);
        }
        int ans = sum;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = sum - arr.get(i) - arr.get(j);
                if (temp <= k) {
                    ans = temp;
                    break;
                }
            }
        }
        return ans;
    }

    
    public static int addElements_Problem_0_1bef2a86_7ec2_40db_bd33_8f9d44612d2a(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_0_dbf62268_a929_4e76_8a43_65e9b5503667(ArrayList<Integer> arr, int k) {
        int sum = 0;
        int i = 0;
        while (i < k) {
            int num = arr.get(i);
            if (num < 100) {
                sum += num;
            }
            i++;
        }
        return sum;

    }

    
    public static int addElements_Problem_3_cab59008_993d_4059_a2c4_07a61c067d83(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_1_1b7c464b_1b85_464d_99f4_a0ff72ef6cf3(ArrayList<Integer> arr, int k) {
        return arr.stream().limit(k).filter(x -> x < 100).mapToInteger(x -> x).sum();
    }

    
    public static int addElements_Problem_2_4bdfa795_3c73_4d22_80d0_f9a5779562ee(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        int temp = sum;
        while (temp > 99) {
            sum = sum - temp % 100 + temp % 100;
            temp = temp / 100;
        }
        return sum;
    }

    
    public static int addElements_Problem_0_a27825c3_aceb_4a83_b7c9_c3840c1370fc(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_d590081c_3ce3_4fec_89a6_93a982487621(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            int num = arr.get(i);
            if (num < 100) {
                sum += num;
            } else {
                sum += num % 10 + num / 10;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_4_3557028b_bfe9_46ff_bd6d_a8374a24da1d(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            int number = arr.get(i);
            if (number >= 10 && number < 100) {
                sum += number;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_0_e0806dfd_1c73_4935_b53a_6ccf975ef4e8(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i<k; i++){
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_0_fb166533_e84b_4f2e_994f_4204f3041f07(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            int num = arr.get(i);
            if (num < 10) {
                sum += num;
            } else if (num < 100) {
                sum += num - 10;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_0_e1591885_fce2_4f73_ae0f_dfdaa0becd35(ArrayList<Integer> arr, int k) {

        int sum = 0;
        int size = arr.size();
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_4_e657c062_38b0_4d2a_9282_37efcf79a20c(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 10) {
                sum += arr.get(i);
            } else if (arr.get(i) < 100) {
                sum += arr.get(i) / 10;
            } else {
                sum += arr.get(i) / 100;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_3_74452e23_a895_4a4a_819b_50efc6c5ded3(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_0_f5fa053f_ba97_4e87_8181_1ab61afadaf3(ArrayList<Integer> arr, int k) {
        if (arr.size() < k) {
            throw new IllegalArgumentException();
        }

        int sum = 0;
        for (int num : arr) {
            if (num % 10 > 0) {
                sum += num;
            } else if (num % 10 == 0) {
                sum += num / 10;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_3_981598be_3651_44f0_ba39_258af9789a6c(ArrayList<Integer> arr, int k) {
        return arr.stream().limit(k).filter(x -> x < 100).mapToInteger(x -> x).sum();
    }

    
    public static int addElements_Problem_0_c137fe0a_a74a_4341_ba77_b8b51fde2666(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_4_525a12f8_7553_46c7_bde2_1c9a28aeb535(ArrayList<Integer> arr, int k) {

        ArrayList<Integer> arr2 = new ArrayList<Integer>();
        int j = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (j < k) {
                arr2.add(arr.get(i));
                j++;
            }
        }
        int sum = 0;
        for (int i = 0; i < arr2.size(); i++) {
            sum += arr2.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_0be11d3c_a243_4424_a5d8_8c2ccf093172(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            int num = arr.get(i);
            if (num < 100) {
                sum += num;
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_4_c9fe1a3c_46fd_4ea8_8e62_416323276b83(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_3_ff54b83d_9228_41f0_a010_daafedef7852(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_35af0d87_9783_48ae_a07e_f14838b9bcef(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            int n = arr.get(i);
            if (n < 10) {
                sum += n;
            } else if (n < 100) {
                sum += n - (n % 10);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_2_389d86f8_5292_4462_b4ac_b646981e2a89(ArrayList<Integer> arr, int k) {
        return 0;
    }

    
    public static int addElements_Problem_4_06c72d70_1076_4ebc_8de5_e7a126245f40(ArrayList<Integer> arr, int k) {
        List<Integer> arr2 = arr.stream().filter(x -> (x <= 99 && x >= 10)).collect(Collectors.toList());
        return arr2.stream().limit(k).mapToInteger(Integer::intValue).sum();
    }

    
    public static int addElements_Problem_3_8a4d3fb6_44ca_46e4_bfe7_1c2da4792deb(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_4_112b8637_ca86_4829_8896_d9bba1bd57a5(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_4_a55057ef_5bb3_4afb_80fc_b0954548534b(ArrayList<Integer> arr, int k) {

        // Write your code here
        return arr.stream().limit(k).mapToInteger(x -> x).sum();
    }

    
    public static int addElements_Problem_1_8d28dcad_0acd_42fc_a106_1d91af8efd2c(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_3_3e27ed7e_7b93_47e8_bf1d_ca8ab8595a6f(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_2_fb0450d9_b3ef_4504_80c5_276a67ad377d(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i<k; i++){
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_0_e48e33c1_1ab2_4da6_9252_8f2a71d11fcf(ArrayList<Integer> arr, int k) {
        int sum = 0;
        int maxSum = 0;
        int maxSumIndex = 0;
        int maxSumDigit = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        for(int i = 0; i < k; i++) {
            int digit = arr.get(i) % 10;
            sum += digit;
            if(maxSumDigit < digit) {
                maxSumDigit = digit;
                maxSumIndex = i;
                maxSum = sum;
            }
        }
        return maxSum;

    }

    
    public static int addElements_Problem_0_381f39af_1e08_463f_9c39_edcee3693722(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            int num = arr.get(i);
            if (num < 100) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_1_1e0209da_3f78_448e_b597_1846797aae94(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_f67be95a_5f7b_4a51_b809_f9e63738ba45(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            String str = arr.get(i).toString();
            if (str.length() <= 2) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_3_ca06c897_73f3_4c82_9ffb_471e75828098(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i< k; i++){
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_4_ac84b544_74f2_4fe3_a73f_0e0c20d7fe19(ArrayList<Integer> arr, int k) {
        int sum = 0;
        int sum2 = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
            sum2 += arr.get(i);
        }
        return sum + sum2;
    }

    
    public static int addElements_Problem_2_343cb05c_f1af_4bff_ba24_fe3e35eeaf45(ArrayList<Integer> arr, int k) {

        // Write your code here
        return arr.stream().limit(k).mapToInteger(Integer::intValue).reduce(0L, (a, b) -> a + ((b / 100) * 1000) + ((b % 100) * 10) + (b % 10));
    }

    
    public static int addElements_Problem_4_2e38160f_7b45_4ccc_b97e_046126386cf0(ArrayList<Integer> arr, int k) {
        int result = 0;
        for (int i : arr) {
            int digitsCount =  Math.log10(i) + 1;
            if (digitsCount > 2) {
                result += (i / 10) * (i / 10) % 10 * i % 10;
            }
        }
        return result;
    }

    
    public static int addElements_Problem_4_fb166533_e84b_4f2e_994f_4204f3041f07(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            int num = arr.get(i);
            if (num < 10) {
                sum += num;
            } else if (num < 100) {
                sum += num - 10;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_3_71a1f693_61b6_479f_8280_f03ddec1f7bb(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_3_27ffb4cb_43b2_43b0_a8d3_c84cde729cb4(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i<arr.size()-k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_0_5dc42f3c_1f4c_4086_85d0_1772e8d95c65(ArrayList<Integer> arr, int k) {

        // Write your code here
        int len = arr.size();
        int i = 0;
        int sum = 0;
        while(i < len){
            if(arr.get(i) <= 9){
                sum += arr.get(i);
                i++;
            }
            else{
                break;
            }
        }
        if(i == len){
            return sum;
        }
        else{
            int j = 0;
            while(j < k){
                if(arr.get(j) <= 9){
                    sum += arr.get(j);
                    j++;
                }
                else{
                    break;
                }
            }
            return sum;
        }
    }

    
    public static int addElements_Problem_1_3eb7f45e_a3a8_4dd3_be62_0384f2365fcd(ArrayList<Integer> arr, int k) {
        if (k == 0) {
            return 0;
        } else {
            int el = arr.get((k - 1));
            if (10 <= el && el < 100) {
                return el + addElements_Problem_1_3eb7f45e_a3a8_4dd3_be62_0384f2365fcd(arr, k - 1);
            } else {
                return addElements_Problem_1_3eb7f45e_a3a8_4dd3_be62_0384f2365fcd(arr, k - 1);
            }
        }
    }

    
    public static int addElements_Problem_4_5224fa7c_6ed9_4ede_861d_6c0027a633d3(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_0_a55057ef_5bb3_4afb_80fc_b0954548534b(ArrayList<Integer> arr, int k) {

        // Write your code here
        return arr.stream().limit(k).mapToInteger(x -> x).sum();
    }

    
    public static int addElements_Problem_3_5a37af62_3ba2_4841_9602_2fd219962b9e(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_0_859b9cb9_191c_4e88_bb98_fce62ee5a5e7(ArrayList<Integer> arr, int k) {
        //your code here
        return 0;
    }

    
    public static int addElements_Problem_0_cc22243b_d378_419f_9b3b_4a59b1c1ad16(ArrayList<Integer> arr, int k) {

        // Write your code here.
        int n = arr.size();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr.get(i);
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (count == k) {
                break;
            }
            if (sum - arr.get(i) <= 9) {
                count++;
            }
        }
        return sum - count;
    }

    
    public static int addElements_Problem_4_fe0f8a80_75b0_4f36_ab97_c2683aee85e8(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_0_6b209d7a_f001_49ea_a055_17ddb132531e(ArrayList<Integer> arr, int k) {

        // Write your code here
        return arr.stream().limit(k).mapToInteger(x -> x).sum();
    }

    
    public static int addElements_Problem_2_79f0d5cd_ce87_4cd2_b61c_6a9132107168(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_0_a8d86a70_d5c5_4e62_b287_1ca6116bc9f1(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_1_d14ef0ee_79be_4b6a_9b1b_0f3725b53f84(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_0_76c5d2f1_ff3d_44bc_991c_6a93fc02fde9(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_7692c5a7_9b03_4b24_93fb_91a2a16153ef(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_0287ea1a_460b_4b90_870b_2831d04a6c5b(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_1_c58beacb_24c9_48f8_a20a_50c4bf9bec6f(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_4_5b0e5036_6ce6_416d_99ed_777bd2b745df(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_aa6668d5_870d_4558_83b9_d71e4b4e75b0(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_ea4957fb_9509_47bf_b1c0_8ef525db713f(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_3a3069b3_64b7_4c3f_9649_7b934ac36558(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_2_04ffdb63_0ba2_41c1_a8c6_3c81361ac865(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_62ea2765_cf26_4c81_98ed_4418e4ddf0ff(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_4_b829c0b3_44f8_4e5a_9629_783641a4bb1c(ArrayList<Integer> arr, int k) {
        int len = arr.size();
        int sum = 0;
        int i = 0;
        while (i < len && i < k) {
            if (arr.get(i) >= 10 && arr.get(i) < 100) {
                sum += arr.get(i);
            }
            i++;
        }
        return sum;
    }

    
    public static int addElements_Problem_2_b829c0b3_44f8_4e5a_9629_783641a4bb1c(ArrayList<Integer> arr, int k) {
        int len = arr.size();
        int sum = 0;
        int i = 0;
        while (i < len && i < k) {
            if (arr.get(i) >= 10 && arr.get(i) < 100) {
                sum += arr.get(i);
            }
            i++;
        }
        return sum;
    }

    
    public static int addElements_Problem_1_f0d47038_1f9d_4dac_9e27_7d057b3a296a(ArrayList<Integer> arr, int k) {
        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_8692b924_3695_44a0_85f6_17316c3fab27(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_66a207ea_ac25_4011_9909_cd563c8b114c(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            int num = arr.get(i);
            if (num < 100) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_0_94868793_86bd_4fac_b31c_98f0de41bcc7(ArrayList<Integer> arr, int k) {
        int result = 0;
        for (int i = 0; i < k; i++) {
            int curLen = Math.log10(arr.get(i)) + 1;
            if (curLen <= 2) {
                result += arr.get(i);
            }
        }
        return result;
    }

    
    public static int addElements_Problem_2_29c97820_a059_4596_88ce_9677a8ba2846(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_4_9088f9f0_2efd_45ec_9815_2fad15c327bb(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_932f1ed3_865d_4222_8d60_746d7e95db0f(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_1_907b6822_1fb1_4fd1_8900_91e2689f9ce6(ArrayList<Integer> arr, int k) {
        // Write your code here
        return 0;
    }

    
    public static int addElements_Problem_4_46e2f202_4850_47ec_b210_6835c4362a4f(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_45b0b802_0cac_4762_9f74_e575203bfb1c(ArrayList<Integer> arr, int k) {

        // Write your code here
        return arr.stream().limit(k).mapToInteger(Integer::intValue).reduce(0L, (a, b) -> a + ((a < 10) ? b : b % 10));
    }

    
    public static int addElements_Problem_4_e4e18c43_7b58_4f1c_995c_f847334cc16d(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_865af318_aa2d_4ee5_8c1a_739bc7046f8e(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_6a59ba16_5122_4f07_9c8f_a9a989754081(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_1_54b4a33e_6074_44d4_82a2_01f0a363589d(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            int num = arr.get(i);
            if (num < 100) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_1_e7b342d0_e40d_4337_a6d7_bdfce0e2cc50(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 10) {
                sum += arr.get(i);
            } else if (arr.get(i) < 100) {
                sum += arr.get(i) / 10;
            } else {
                sum += arr.get(i) / 100;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_1_5692050c_c17b_4dbd_bb6b_4408c9cd8785(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            int num = arr.get(i);
            if (num < 10) {
                sum += num;
            } else if (num < 100) {
                sum += num;
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_0_c58beacb_24c9_48f8_a20a_50c4bf9bec6f(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_0_c22f76b9_06d0_4103_9a7d_d1c50d0d7bef(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_532502ea_183d_4f6e_88aa_73f81d43f86a(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_3_30d1a606_f81e_43d4_9239_04022769b186(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_3eb7f45e_a3a8_4dd3_be62_0384f2365fcd(ArrayList<Integer> arr, int k) {
        if (k == 0) {
            return 0;
        } else {
            int el = arr.get((k - 1));
            if (10 <= el && el < 100) {
                return el + addElements_Problem_2_3eb7f45e_a3a8_4dd3_be62_0384f2365fcd(arr, k - 1);
            } else {
                return addElements_Problem_2_3eb7f45e_a3a8_4dd3_be62_0384f2365fcd(arr, k - 1);
            }
        }
    }

    
    public static int addElements_Problem_4_5e62f928_3747_408f_b1ab_044f6cfc1d78(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_0_d7ecbd4c_64c9_44cd_bfba_314de81dd7b8(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_4_5c65fcd0_b916_457a_9ee9_78b0591a7006(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_2_938e40f4_9999_4adf_bfbb_ee36b1e6ab0e(ArrayList<Integer> arr, int k) {

        // Write your code here
        ArrayList<Integer> arr2 = new ArrayList<>();
        int size = arr.size();
        int j = 0;
        for (int i = 0; i < size; i++) {
            if (j < k) {
                arr2.add(arr.get(i));
                j++;
            }
        }
        int sum = 0;
        for (int i = 0; i < arr2.size(); i++) {
            sum += arr2.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_d79385e4_b2e6_4e33_b885_ca646b3ce93a(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_1_dab6200c_85ec_4423_879e_dae296d3d0fb(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_4_0b6eefbe_3177_41ed_92ba_aa9c36736be9(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_2_22a5bd41_382a_4b03_bcd7_247d48683b71(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            int num = arr.get(i);
            if (num < 100) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_0_c27c17d4_f29d_46d9_847c_c0d17509f55f(ArrayList<Integer> arr, int k) {

        // Write your code here
        int n = arr.size();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr.get(i);
        }
        int ans = sum;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = sum - arr.get(i) - arr.get(j);
                if (temp <= k) {
                    ans += temp;
                }
            }
        }
        return ans;
    }

    
    public static int addElements_Problem_2_781a9c2f_0ded_4d4b_9c19_c829e3907f36(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_3_137e5465_f7c0_4c6e_9596_467b29728237(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_4_2e329d2c_4a59_4009_a08b_e3b5db83c482(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_0_53d58c2e_90bb_478d_8ed9_4f7b2e28030f(ArrayList<Integer> arr, int k) {

        // Write your code here
        return arr.stream().limit(k).mapToInteger(Integer::intValue).filter(x -> x < 100).sum();
    }

    
    public static int addElements_Problem_3_cb86baa6_c822_4580_977d_6d4380d97436(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_0_83f4171e_95eb_448e_be06_50b834d7668b(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_1_ca66dcad_248d_4647_88d9_0ed477654dc5(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_aa50ab51_90f9_4a77_89f2_528fcb18680c(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i<k; i++){
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_0_93daeb16_8aef_449f_a33c_5dfb5333b419(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            int num = arr.get(i);
            if (num < 100) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_0_37609cda_4539_4b4e_a152_59f85bd99b7f(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_3_044bd4e0_b3b3_487d_a444_32dd30bdb08e(ArrayList<Integer> arr, int k) {

        int sum = 0;
        int size = arr.size();
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_4_ddc513ee_5cb3_418b_a479_7b6406d05fc6(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            int num = arr.get(i);
            if (num < 100) {
                sum += num;
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_3_20998754_cb9f_4ed1_b9de_e01bdeecca41(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_0_53c85df9_ac52_4823_a5d4_33fcca93546e(ArrayList<Integer> arr, int k) {

        // Write your code here
        return arr.stream().limit(k).mapToInteger(Integer::intValue).filter(x -> x < 100).sum();
    }

    
    public static int addElements_Problem_0_fe855857_2276_4bb5_9e10_0c9b94a30765(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i=0;i<k;i++){
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_4_d7ecbd4c_64c9_44cd_bfba_314de81dd7b8(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_1_16129956_8be3_4be8_8c58_ae9781910eb5(ArrayList<Integer> arr, int k) {
        return arr.stream().filter(x -> x < 100).limit(k).reduce(0, (x, y) -> x + y);
    }

    
    public static int addElements_Problem_0_36790938_a959_4e8e_aa13_616777998931(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_0_acd7a494_f504_42d7_aa76_bcea15722b27(ArrayList<Integer> arr, int k) {

        return arr.stream().limit(k).mapToInteger(Integer::intValue).sum();
    }

    
    public static int addElements_Problem_1_c13e6aa9_8e4d_4c28_9cc2_8dcae4474d75(ArrayList<Integer> arr, int k) {

        // Write your code here
        int n = arr.size();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr.get(i);
        }
        if (k == 1) {
            return sum;
        }
        int[] dp = new int[n + 1];
        dp[0] = sum;
        for (int i = 1; i <= n; i++) {
            dp[i] = dp[i - 1];
            for (int j = 1; j <= i; j++) {
                dp[i] += arr.get(i - j);
            }
        }
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            ans += dp[i];
        }
        return ans;
    }

    
    public static int addElements_Problem_0_dfcdd328_ce37_4af2_9e73_912ead636401(ArrayList<Integer> arr, int k) {
        return arr.stream().limit(k).filter(x -> x < 100).reduce(0, (a, b) -> a + b);
    }

    
    public static int addElements_Problem_0_518a94a6_1565_4a7d_ad01_d9130b0f2214(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_1_40762643_0342_4394_952c_92ef17d31b56(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_5035b162_12c3_4c65_8959_22f68e970fd8(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i<arr.size()-k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_3cc61ab8_cbb4_4a9c_9163_3b672d2110f8(ArrayList<Integer> arr, int k) {
        return arr.stream().limit(k).filter(x -> x < 100).reduce(0, (x, y) -> x + y);
    }

    
    public static int addElements_Problem_4_852ba96e_9043_4156_9db7_c63cfa5f636f(ArrayList<Integer> arr, int k) {
        ArrayList<Integer> l = new ArrayList<>();
        for(int i : arr) {
            if(l.size() >= k) {
                break;
            }
            l.add(i);
        }
        int sum = 0;
        for(int i : l) {
            if(i%10 != 0) {
                sum += i;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_3_f358c0df_ecea_4930_a79b_bb6ca125b2e1(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_06c72d70_1076_4ebc_8de5_e7a126245f40(ArrayList<Integer> arr, int k) {
        List<Integer> arr2 = arr.stream().filter(x -> (x <= 99 && x >= 10)).collect(Collectors.toList());
        return arr2.stream().limit(k).mapToInteger(Integer::intValue).sum();
    }

    
    public static int addElements_Problem_3_95afaa58_f486_40b6_907f_af8f555446df(ArrayList<Integer> arr, int k) {

        // Your code here
        // return 0;
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_bca8efec_b1af_4331_b6de_34f85bcae36e(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_4_6fe7fc84_6afb_414c_8cd9_fe6fb71ff877(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_4_1c5d519c_de43_417b_ba04_a834bcf61335(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_0_1475e414_091f_41d5_a249_99e9d8385d68(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_4_95a8b919_ea32_42c0_9a7b_9c95b805c154(ArrayList<Integer> arr, int k) {
        int result = 0;
        for (int i = 0; i < k; i = i + 1) {
            if (Math.floor(arr.get(i).doubleValue() / 10d) < 1d) {
                result = result + arr.get(i);
            }
        }
        return result;
    }

    
    public static int addElements_Problem_2_0035b721_7d08_4168_bdcd_b933b156a59f(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for(int i = 0; i < k; i++){
            if(arr.get(i) < 10){
                sum += arr.get(i);
            }
            else if(arr.get(i) < 100){
                sum += arr.get(i);
            }
            else{
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_4_a14f79d2_99b5_4f8f_a91f_fede9a1ad24a(ArrayList<Integer> arr, int k) {
        int result = 0;
        for (int i = 0; i < k; i++) {
            result += arr.get(i);
        }
        return result;
    }

    
    public static int addElements_Problem_4_cdd3d862_068b_41e1_8122_9fc925573fba(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_a951b8ee_4ef9_48df_b5d7_29a9af760836(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_cb86baa6_c822_4580_977d_6d4380d97436(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_4_0e4a40f0_fe56_452f_9c93_c490267f3bde(ArrayList<Integer> arr, int k) {

        // Write your code here
        int len = arr.size();
        int i = 0;
        int sum = 0;
        while(i < len) {
            if(len - i < 2) {
                break;
            }
            sum += arr.get(i);
            i++;
        }
        return sum;
    }

    
    public static int addElements_Problem_2_ac07dbac_dc68_48df_a678_0b4c1c423932(ArrayList<Integer> arr, int k) {
        // Write your code here
        return 0;
    }

    
    public static int addElements_Problem_1_52e82fb4_06e1_4751_b0bd_dcb53aea1098(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_0_b795ca99_8810_45e9_8f07_169b1444d3f0(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            int num = arr.get(i);
            if (num < 100) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_4_434bcd95_7655_4fa0_a0cc_528b1495d840(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_2_1391d3ba_b6dd_4bda_a8ff_41a8c505238f(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_0_188fb71b_ce26_4098_a115_c476dd2f54b7(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_fd8e5630_722b_4b4c_acb4_b316361ce1a3(ArrayList<Integer> arr, int k) {
        return arr.stream().limit(k).filter(x -> x < 100).mapToInteger(x -> x).sum();
    }

    
    public static int addElements_Problem_2_6347afe0_c9df_49a5_9b64_571194d1a0d7(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_2_c707fa78_886b_42c5_aee4_73cc637e6f30(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_2_76be9f5c_89f6_4189_b224_f68f7f65bb0f(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            int num = arr.get(i);
            if (num > 99) {
                num = num % 100;
            }
            sum += num;
        }
        return sum;
    }

    
    public static int addElements_Problem_4_260fecd0_b978_4363_9529_f63447ec9c98(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_8da11753_efac_4c08_9569_d4e1491ff1b7(ArrayList<Integer> arr, int k) {
        if(arr == null || arr.size() == 0) {
            return 0;
        }
        if(k > arr.size()) {
            k = arr.size();
        }
        int result = 0;
        for(int i = 0; i < k; i++) {
            int element = arr.get(i);
            if(element < 100) {
                result += element;
            }
        }
        return result;
    }

    
    public static int addElements_Problem_0_ff54b83d_9228_41f0_a010_daafedef7852(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_4370742d_6947_4533_aa40_4987a9ca4ff6(ArrayList<Integer> arr, int k) {
        int sum = 0;
        // iterate from 0 to k - 1
        for (int i = 0; i < k; i++) {
            // iterate over all elements in arr
            for (Integer element : arr) {
                sum += element;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_3_d10d32cd_c9d8_4d3d_99b8_f8683123ce9c(ArrayList<Integer> arr, int k) {

        // Write your code here
        int len = arr.size();
        int i = 0;
        int j = len - 1;
        int sum = 0;
        while (i < j) {
            if (arr.get(i) + arr.get(j) < 10) {
                sum += arr.get(i) + arr.get(j);
                i++;
                j--;
            } else {
                sum += arr.get(i) + arr.get(j) / 10;
                j--;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_4_3251b566_4570_46f0_938b_66c7b81079d3(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_0_e065708c_588e_4dd1_9028_d14cd89adb82(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_2_1af2f310_7db3_4283_9c9b_1b234845e182(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for(int i = 0; i < k; i++){
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_93daeb16_8aef_449f_a33c_5dfb5333b419(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            int num = arr.get(i);
            if (num < 100) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_3_29c97820_a059_4596_88ce_9677a8ba2846(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_1_1af2f310_7db3_4283_9c9b_1b234845e182(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for(int i = 0; i < k; i++){
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_f64edcb0_ccaa_4af6_82ce_a64cd2302551(ArrayList<Integer> arr, int k) {
        return arr.stream().limit(k).filter(x -> x < 100).mapToInteger(x -> x).sum();
    }

    
    public static int addElements_Problem_4_763981aa_9390_42f0_b102_c69bbd9a9201(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_3_0b36079a_8de4_4a84_8aea_fa6f01e78977(ArrayList<Integer> arr, int k) {
        // Your code here
        int index = 0;
        Integer sum = 0;
        while (index < k && index < arr.size()) {
            if (arr.get(index) > 99) {
                index += 1;
                continue;
            }
            sum += arr.get(index);
            index += 1;
        }
        return sum;
    }

    
    public static int addElements_Problem_0_9e74530b_93eb_4067_8167_3846532917ce(ArrayList<Integer> arr, int k) {
        int result = 0;
        for (int index = 0; index < k; index++) {
            if (arr.get(index) >= 0 && arr.get(index) <= 99) {
                result += arr.get(index);
            }
        }
        return result;
    }

    
    public static int addElements_Problem_0_c5d134cc_de0d_4a62_8f8d_a6aba8d8a903(ArrayList<Integer> arr, int k) {

        // Write your code here
        return arr.stream().limit(k).mapToInteger(Integer::intValue).reduce(0L, (a, b) -> a + (a < 10 ? b : b % 10));
    }

    
    public static int addElements_Problem_1_f358c0df_ecea_4930_a79b_bb6ca125b2e1(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_7e9994fb_9ab0_4379_92f7_9d8555fd13bb(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i<k; i++) {
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_4_3af24118_b778_4f32_8ebd_fb76e02a7090(ArrayList<Integer> arr, int k) {

        // Your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_6e9e688e_f936_4b88_8f07_e8ed87612af3(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_2_fb166533_e84b_4f2e_994f_4204f3041f07(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            int num = arr.get(i);
            if (num < 10) {
                sum += num;
            } else if (num < 100) {
                sum += num - 10;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_1_9546ff62_bb9f_462a_8c1f_1556abdd4a1d(ArrayList<Integer> arr, int k) {

        // Write your code here
        int n = arr.size();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr.get(i);
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (count == k) {
                break;
            }
            int temp = sum - arr.get(i);
            if (temp % 100 <= 9) {
                count++;
            }
        }
        return sum - count;
    }

    
    public static int addElements_Problem_3_7f9eaf21_b655_48d8_8ebf_79de89d25b26(ArrayList<Integer> arr, int k) {

        // Your code here
        return 0;
    }

    
    public static int addElements_Problem_0_e8ceb3cc_18d1_4439_bdfa_25e28de2730c(ArrayList<Integer> arr, int k) {
        // write your code here
        int sum = 0;
        for(int i = 0; i< arr.size()-k+1; i++) {
            sum+=arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_53e05365_1b77_42f6_bc71_a676fc992bd2(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_3_00d36ed3_2ec6_43ea_a1d8_88868b6a9249(ArrayList<Integer> arr, int k) {

        // Write your code here
        int n = arr.size();
        int i = 0;
        int j = n - 1;
        int sum = 0;
        while (i < j) {
            if (arr.get(i) + arr.get(j) <= k) {
                sum += arr.get(i) + arr.get(j);
                i++;
            } else {
                sum += arr.get(j) - arr.get(i);
                j--;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_4_594b36ff_41ad_42c9_853f_e3856aa241b8(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i< arr.size()-k; i++) {
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_2_bbafbad8_2a7b_45a8_9e47_1ba86dceb07c(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_4_cc22243b_d378_419f_9b3b_4a59b1c1ad16(ArrayList<Integer> arr, int k) {

        // Write your code here.
        int n = arr.size();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr.get(i);
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (count == k) {
                break;
            }
            if (sum - arr.get(i) <= 9) {
                count++;
            }
        }
        return sum - count;
    }

    
    public static int addElements_Problem_3_87d7be09_316c_4a79_a7ed_51bc97b03c91(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_7d6606ea_4a39_4ba9_bd35_b71e90260d39(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_683998cd_fe41_4e43_9a67_1d913f2dbe9d(ArrayList<Integer> arr, int k) {

        // Write your code here
        return arr.stream().limit(k).mapToInteger(x -> x).sum();
    }

    
    public static int addElements_Problem_0_66aca7f4_651e_47c2_85f0_e0e1d99e745f(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_87a56e00_1df2_4f0b_924c_002d48835f2d(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_0_82aae5d5_4d9b_468c_9bbd_f8629798a5cd(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_3_859b9cb9_191c_4e88_bb98_fce62ee5a5e7(ArrayList<Integer> arr, int k) {
        //your code here
        return 0;
    }

    
    public static int addElements_Problem_3_42b2292e_085f_422b_980c_cacd1f9463a4(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_4_df0ba358_a185_4129_ad03_64621afafd6a(ArrayList<Integer> arr, int k) {
        return arr.stream().limit(k).filter(x -> x < 100).mapToInteger(x -> x).sum();
    }

    
    public static int addElements_Problem_0_056cee23_9b67_462c_9594_1b7993a555d8(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_1_86f521c9_579b_40d4_b278_4039e2a2713b(ArrayList<Integer> arr, int k) {

        // Your code here
        int sum = 0;
        for(int i = 0; i < k; i++){
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_65f1079f_29be_4cae_a268_59f5f670cb09(ArrayList<Integer> arr, int k) {
        return arr.stream().limit(k).filter(i -> (i < 100)).reduce(0, (a,b) -> (a + b));
    }

    
    public static int addElements_Problem_0_97b0a628_24c2_4f98_92d6_4546346ef5fd(ArrayList<Integer> arr, int k) {

        // Write your code here
        return arr.stream().limit(k).mapToInteger(Integer::intValue).reduce(0L, (a, b) -> a + ((a < 10 && b < 10) ? a + b : (a < 10 ? a * 10 + b : b * 10 + a)));
    }

    
    public static int addElements_Problem_0_91d9889e_6c31_4969_9601_3837cc0d6223(ArrayList<Integer> arr, int k) {
        return arr.stream().filter(x -> x < 100).limit(k).mapToInteger(x -> x).sum();
    }

    
    public static int addElements_Problem_0_25db9000_95fb_4e04_8bfc_6cc516c20fb5(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i< arr.size()-k; i++) {
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_1_6215cadb_b2c1_4ad3_aaa4_7f6aa7b8ade8(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_0_d9b59d2d_9e9c_4e0a_9918_dbdc35be5210(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_4_052d5bba_36cb_4fc1_85f4_1724dc9ab27b(ArrayList<Integer> arr, int k) {

        // Write your code here
        int i = 0;
        int j = 0;
        int sum = 0;
        while (i < arr.size()) {
            if (j < k) {
                sum += arr.get(i);
                i++;
                j++;
            } else {
                sum += arr.get(i) / 10;
                i++;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_0_74d8e621_a152_4ade_b4de_7445f8574056(ArrayList<Integer> arr, int k) {
        int ans = 0L;
        for (int elem : arr) {
            ans += elem;
            if (ans >= 10) {
                ans -= 10;
                ans += (10 * Math.pow(10, arr.size() - k));
            }
        }
        return ans;
    }

    
    public static int addElements_Problem_0_2e0c8394_f505_4943_b4a5_290cdfd1235a(ArrayList<Integer> arr, int k) {
        return 0;
    }

    
    public static int addElements_Problem_0_4b589125_d992_4414_bfbe_ad276744007a(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_3_d56a9034_5aff_40e2_b55c_5e311d62e745(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_0_07913233_27e5_4d4e_a848_58ade0961177(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_4_a27825c3_aceb_4a83_b7c9_c3840c1370fc(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_44228b16_19e0_4c15_92a7_a58044b74dee(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_cb80a313_51fa_40cd_a562_5507b77cca38(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_3_c9f7c0f9_452c_41ec_acb8_a2cc70046ca9(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_4214bb9d_87d3_442b_88b0_1d30f74eb3bc(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_2_fdbddc60_d9de_43d4_8290_385655969ba8(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            int num = arr.get(i);
            if (num < 100) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_0_28eab288_38b6_4d6e_bd3c_5dc680b6e1c9(ArrayList<Integer> arr, int k) {

        // Write your code here
        int len = arr.size();
        int i = 0;
        int j = 0;
        int sum = 0;
        while(j < len) {
            if(j == k) {
                break;
            }
            if(arr.get(j) < 10) {
                sum += arr.get(j);
                j++;
            } else {
                break;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_4_90363815_0756_472d_a6c6_c3046f0e87b5(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i< arr.size()-k; i++){
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_30a27801_4786_4537_a095_dffc4fc3e60b(ArrayList<Integer> arr, int k) {

        // Write your code here
        int len = arr.size();
        int i = 0;
        int j = len - 1;
        int sum = 0;
        while (i < j) {
            if (arr.get(i) + arr.get(j) <= k) {
                sum += arr.get(i) + arr.get(j);
                i++;
            } else {
                sum += arr.get(j);
                j--;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_0_2ceb1e33_dd79_49d7_89ce_6fcf668e41f5(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_0_22268cf9_b6da_4797_8011_1f636eefdae9(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            int num = arr.get(i);
            if (num < 10) {
                sum += num;
            } else if (num < 100) {
                sum += num % 10;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_2_5a37af62_3ba2_4841_9602_2fd219962b9e(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_0_6f7e700d_f14a_4183_9125_e2fa9d3c162e(ArrayList<Integer> arr, int k) {
        // int sum = 0;
        // for (int i = 0; i < k; i++) {
        //     if (arr.get(i) > 99) {
        //         sum += 0;
        //     } else {
        //         sum += arr.get(i);
        //     }
        // }
        // return sum;
        return arr.stream().filter(x -> x < 100).limit(k).mapToInteger(x -> x).sum();
    }

    
    public static int addElements_Problem_0_50b8165c_718e_46eb_b111_f7bb1bd6d96b(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_e62ef732_95ea_4087_bc37_4d9af3b4e9cb(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_859b9cb9_191c_4e88_bb98_fce62ee5a5e7(ArrayList<Integer> arr, int k) {
        //your code here
        return 0;
    }

    
    public static int addElements_Problem_0_7f5c43ca_63bf_47eb_a5fc_dba03476e106(ArrayList<Integer> arr, int k) {

        // Write your code here
        int len = arr.size();
        if (len == 0) {
            return 0;
        }
        int i = 0;
        int j = 0;
        int sum = 0;
        while (i < len) {
            if (j == k) {
                break;
            }
            if (j == 0) {
                sum += arr.get(i);
                j++;
            } else {
                if (j == 1) {
                    sum += arr.get(i);
                    j++;
                } else {
                    if (j == 2) {
                        sum += arr.get(i);
                        j++;
                    }
                }
            }
            i++;
        }
        return sum;
    }

    
    public static int addElements_Problem_2_d3025009_6d8b_4436_93b2_276afb98e2a8(ArrayList<Integer> arr, int k) {

        // Your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_4_062c946e_6836_41f5_b550_7f72bd58fe12(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            int num = arr.get(i);
            if (num < 100) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_0_ab33f643_f5b6_4f8d_89a8_88e51b346bae(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            String s = String.valueOf(arr.get(i));
            if (s.length() > 2) {
                s = s.substring(0, 2);
            }
            sum += Integer.parseInteger(s);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_3adc0487_78fe_435a_a334_980081e4e4c5(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_8c97b3cb_8432_4e5f_aa4b_565114664f08(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_3_e3e53189_b699_4c90_b049_1718beab7726(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_4_0e109f82_72a8_4780_9f57_144ccb5e73a6(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            int n = arr.get(i);
            if (n < 100) {
                sum += n;
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_2_c1d132f2_a8b0_4300_a22e_3610296110dc(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_3_83f4171e_95eb_448e_be06_50b834d7668b(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_4_a207e5ce_bc3f_4089_bde6_f58fec770052(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_cd44e3bf_affe_4a2f_8a36_0fd80acab3d5(ArrayList<Integer> arr, int k) {
        // Write your code here.
        return arr.stream().filter(i -> i >= 1 && i <= 99).limit(k).mapToInteger(i -> i).sum();
    }

    
    public static int addElements_Problem_1_a14f79d2_99b5_4f8f_a91f_fede9a1ad24a(ArrayList<Integer> arr, int k) {
        int result = 0;
        for (int i = 0; i < k; i++) {
            result += arr.get(i);
        }
        return result;
    }

    
    public static int addElements_Problem_1_339a3ce4_1657_4988_a55d_9308d0f76cd0(ArrayList<Integer> arr, int k) {

        // Your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_26243255_dc2d_421c_b1a0_1c04baf8fb66(ArrayList<Integer> arr, int k) {
        return 0;
    }

    
    public static int addElements_Problem_1_9c8fa3ef_e293_43ee_83e2_751a009be85f(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_1_f37d6d10_b29c_427a_a186_3cad27b9c8c8(ArrayList<Integer> arr, int k) {
        return arr.stream().limit(k).filter(x -> x < 100).mapToInteger(x -> x).sum();
    }

    
    public static int addElements_Problem_0_46945bef_ec77_4feb_99fc_d2db8fe60ded(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            int num = arr.get(i);
            if (num < 100) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_0_d68748bb_ef6a_42f8_9418_fff5a3e4f9b5(ArrayList<Integer> arr, int k) {

        // Write your code here
        return arr.stream().limit(k).mapToInteger(Integer::intValue).filter(i -> i < 10 || i > 99).sum();
    }

    
    public static int addElements_Problem_0_1464d9a2_9028_4e85_88a3_d28b39e3e3d0(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_3_ac1cbbd6_e8dc_44a2_9319_051c61e35832(ArrayList<Integer> arr, int k) {

        // Write your code here
        int len = arr.size();
        int start = 0;
        int end = len - 1;
        int sum = 0;
        while (start <= end) {
            sum += arr.get(start);
            sum += arr.get(end);
            if (sum > k) {
                sum = sum - arr.get(start);
                start++;
            } else if (sum < k) {
                sum = sum - arr.get(end);
                end--;
            } else {
                return sum;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_4_799a4eb9_0a7f_4080_a3eb_1b1d434b141d(ArrayList<Integer> arr, int k) {
        return -1;
    }

    
    public static int addElements_Problem_3_76d0d3b7_c1a9_49f0_b08a_d3d1664ffd88(ArrayList<Integer> arr, int k) {
        // Find sum of first k elements of arr
        // If arr is empty or k is <= 0 return 0.
        if (arr.size() == 0 || k <= 0) {
            return 0;
        }
        // Else return the sum of the first k elements
        // where if an element is greater than 99, only add the
        // last two digits.
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            } else {
                sum += arr.get(i) % 100;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_3_971c130c_7f9b_4e27_b4d5_61f487f2e09f(ArrayList<Integer> arr, int k) {

        // Write your code here
        int len = arr.size();
        int i = 0;
        int j = 0;
        int sum = 0;
        while(i < len){
            if(j == k){
                break;
            }
            if(j == 0){
                sum += arr.get(i);
                j++;
            }
            else{
                if(arr.get(i) < 10){
                    sum += arr.get(i);
                    j++;
                }
                else{
                    break;
                }
            }
            i++;
        }
        return sum;
    }

    
    public static int addElements_Problem_4_13fa03ad_ef61_43ed_9325_85f7d0bacca7(ArrayList<Integer> arr, int k) {
        // Write your code here
        return 0;
    }

    
    public static int addElements_Problem_0_2b0b6ae0_b7ee_4889_8f8f_8165c263430b(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_2_981598be_3651_44f0_ba39_258af9789a6c(ArrayList<Integer> arr, int k) {
        return arr.stream().limit(k).filter(x -> x < 100).mapToInteger(x -> x).sum();
    }

    
    public static int addElements_Problem_2_1bddb132_7173_4147_8e78_40c116997e46(ArrayList<Integer> arr, int k) {
        int sum = 0;
        int max = 0;
        int min = 0;
        for(int i = 0; i<arr.size(); i++) {
            max = Math.max(max, arr.get(i));
            min = Math.min(min, arr.get(i));
        }
        for(int i = 0; i<arr.size(); i++) {
            sum += arr.get(i);
            if((sum % 10) == 0) {
                sum += k;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_0_c41e6b14_879c_4b3d_b877_6f809adddb24(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_0_b6442679_50ef_4480_b22a_da039f51c7ef(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        int max = 0;
        int min = 0;
        for(int i = 0; i < k; i++) {
            if(arr.get(i) > max) {
                max = arr.get(i);
            }
            if(arr.get(i) < min) {
                min = arr.get(i);
            }
        }
        int max1 = 0;
        int min1 = 0;
        for(int i = 0; i < k; i++) {
            if(arr.get(i) > max1) {
                max1 = arr.get(i);
            }
            if(arr.get(i) < min1) {
                min1 = arr.get(i);
            }
        }
        if(max1 - min1 > 9) {
            return sum;
        }
        return sum + max1 - min1;
    }

    
    public static int addElements_Problem_4_e48e33c1_1ab2_4da6_9252_8f2a71d11fcf(ArrayList<Integer> arr, int k) {
        int sum = 0;
        int maxSum = 0;
        int maxSumIndex = 0;
        int maxSumDigit = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        for(int i = 0; i < k; i++) {
            int digit = arr.get(i) % 10;
            sum += digit;
            if(maxSumDigit < digit) {
                maxSumDigit = digit;
                maxSumIndex = i;
                maxSum = sum;
            }
        }
        return maxSum;

    }

    
    public static int addElements_Problem_0_e07c8aa2_a2e8_4291_912e_fd8fef5262f4(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_1_5de24867_db7a_497b_b431_ef2280a35f92(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_fcc65487_7b37_48ba_be78_ff8fe800ccc6(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_0_ff344328_0815_49f0_b860_5d52cbda672c(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_4_801bf8e7_f536_429b_a893_7f182eb0e529(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            int num = arr.get(i);
            if (num < 100) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_2_91ca5632_f0b7_4fbf_a380_43b6e48b6638(ArrayList<Integer> arr, int k) {
        // Write your code here.
        int sum = 0;
        for(int i = 0; i < arr.size()-k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_4_555a32c4_bf3e_4e37_9b52_88ba1f495999(ArrayList<Integer> arr, int k) {
        return (k == 0 ? 0 : arr.get((k - 1)) > 100 ? addElements_Problem_4_555a32c4_bf3e_4e37_9b52_88ba1f495999(arr, k - 1) : addElements_Problem_4_555a32c4_bf3e_4e37_9b52_88ba1f495999(arr, k - 1) + arr.get((k - 1)));
    }

    
    public static int addElements_Problem_4_57891572_4bd8_426d_9d91_91ad2e9e3ebc(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_0_c106119b_d3a4_41ad_b290_da96b78be8c3(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_4_2510e3fd_d7e4_423d_a356_2c45ea3e0810(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_17f18299_9c92_47cf_8601_3e80b7bfb0e9(ArrayList<Integer> arr, int k) {
        return arr.stream().filter(x -> x < 100).limit(k).mapToInteger(x -> x).sum();
    }

    
    public static int addElements_Problem_0_098712ea_6851_492e_a854_0b34c5b82ee0(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            int n = arr.get(i);
            if (n < 100) {
                sum += n;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_3_f465aa8f_77cf_4cfb_b4e9_5d246da70266(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_0_6810f905_77a1_4975_ace5_c3ce36543cf3(ArrayList<Integer> arr, int k) {
        return arr.stream().limit(k).filter(x -> x < 100).reduce(0, (x, y) -> x + y);
    }

    
    public static int addElements_Problem_4_5ae0a4ec_dafb_4ded_abc2_6e7d34e00f41(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_2_453e6c0e_11f2_4033_92a0_2e70a10ab938(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_4_29c97820_a059_4596_88ce_9677a8ba2846(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_2_786b8c63_fc4d_428f_8d52_b7f6bb216049(ArrayList<Integer> arr, int k) {

        // Write your code here
        return arr.stream().limit(k).mapToInteger(Integer::intValue).filter(i -> i < 10 || i > 99).sum();
    }

    
    public static int addElements_Problem_0_79072ccb_f4b4_4ee9_b321_3720f1819c09(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 10) {
                sum += arr.get(i);
            } else if (arr.get(i) < 100) {
                sum += arr.get(i) / 10;
            } else {
                sum += arr.get(i) / 100;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_1_e17c6c34_8767_477d_b7fc_46bfffc4287b(ArrayList<Integer> arr, int k) {

        return arr.stream().limit(k).filter(x -> x < 100).mapToInteger(x -> x).sum();
    }

    
    public static int addElements_Problem_3_08dc81fc_b5b0_4c25_bf05_e1f21cdbbdfb(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_0_5632bf14_aace_4390_9e12_05f884a74efb(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_4_39eb068a_1f3d_4762_9de4_96e062d6c410(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_4_d042dbf5_87d4_451d_b909_60fee1f6ad6b(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_2_d7baf9a5_db5a_4583_9891_97d962a67d71(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_1_7be55507_8f70_4623_829a_b5cb62a65255(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_33a728cc_5324_4adb_9bd3_bfdf03b2654c(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i<k; i++){
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_1_87d7be09_316c_4a79_a7ed_51bc97b03c91(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_a55057ef_5bb3_4afb_80fc_b0954548534b(ArrayList<Integer> arr, int k) {

        // Write your code here
        return arr.stream().limit(k).mapToInteger(x -> x).sum();
    }

    
    public static int addElements_Problem_1_a7cd62ec_60ae_4c26_98f5_3f37f2fe81d0(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_4_7e592b0c_03dc_4e3f_bbd1_5a8d0788a02b(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 99) {
                continue;
            }
            sum += arr.get(i);
            if (i == k - 1) {
                break;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_0_e56b2048_9ea0_4eff_a537_304814420072(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_e7f91e0d_3ac6_4dae_9a7c_aecc2c6102c6(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_4_62ac284c_a82e_4952_a408_bba33d688b10(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_015354f9_47af_4bf1_9f54_5916ea7b9c72(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_2_8c5640b0_4072_4715_8b91_bbb3cf826663(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_4_a3b2902a_2276_47bd_a90e_aa4d641c7159(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_4_1f197d13_1bcc_4bae_a709_f13216d92110(ArrayList<Integer> arr, int k) {

        // Write your code here
        return arr.stream().limit(k).mapToInteger(Integer::intValue).reduce(0L, (a,b) -> a + (a < 10 ? b : b % 10));
    }

    
    public static int addElements_Problem_0_810e2440_19c3_4560_b0cc_e2a292b05eca(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_4_016d0ee3_3348_4e5b_b1a5_75f2445aacd1(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 10) {
                sum += arr.get(i);
            } else if (arr.get(i) < 100) {
                sum += arr.get(i) - (arr.get(i) % 10);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_1_be65f4b4_8c89_45c5_982b_697859a0862f(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 10) {
                sum += arr.get(i);
            } else {
                sum += (arr.get(i) % 10);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_1_13fa03ad_ef61_43ed_9325_85f7d0bacca7(ArrayList<Integer> arr, int k) {
        // Write your code here
        return 0;
    }

    
    public static int addElements_Problem_3_64978c81_c367_443d_8d11_78db77fe468e(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_3_e4f5050f_0cbf_473a_ba46_dc00b3ad2517(ArrayList<Integer> arr, int k) {
        int sum = 0;
        int sumOfTwoDigits = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        for(int i = 0; i < k; i++) {
            sumOfTwoDigits += arr.get(i);
        }
        return sum + sumOfTwoDigits;

    }

    
    public static int addElements_Problem_0_aa97f894_5a33_4c57_9e76_5b1c6e8770b2(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_3_c12978c7_877f_4a71_afbf_a7f0d1279311(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i< arr.size()-k; i++){
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_4_727d5244_9a62_4f93_8aef_916e0292323b(ArrayList<Integer> arr, int k) {

        // Write your code here
        int n = arr.size();
        int i = 0;
        int j = 0;
        int sum = 0;
        while (i < n) {
            if (j == k) {
                break;
            }
            sum += arr.get(i);
            i++;
            j++;
        }
        return sum;
    }

    
    public static int addElements_Problem_4_ef2cb340_ba8c_4495_84d3_a90995456c0a(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_4_cd2b277c_8686_49d4_9e1b_abd55609e717(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_c3c094f8_7dad_406f_a589_a5ace0be5921(ArrayList<Integer> arr, int k) {

        // Write your code here
        return arr.stream().limit(k).mapToInteger(x -> x).sum();
    }

    
    public static int addElements_Problem_2_8e1cd073_d695_44b1_8038_d32a8ffd1f78(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for(int i = 0; i < k; i++) {
            if(arr.get(i) < 10) {
                sum += arr.get(i);
            } else {
                sum += (arr.get(i) / 10) + (arr.get(i) % 10);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_0_bc282ee9_f9a9_430a_8ed2_8b17943d1573(ArrayList<Integer> arr, int k) {
        int sum = 0;
        int limit = k > arr.size() ? arr.size() : k;
        for (int i = 0; i < limit; i++) {
            Integer elem = arr.get(i);
            if (elem > 0 && elem < 100) {
                sum += elem;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_1_87e4a76b_4869_45c1_80ab_c47249736446(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_0_b6e4cbdb_e5a5_4d16_a880_3c5f02a71d8a(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_0_8b8c57e6_ead7_44db_bd51_f9444ed6465b(ArrayList<Integer> arr, int k) {
        // your code here
        return 0;
    }

    
    public static int addElements_Problem_4_96287488_7ac4_488c_a86c_dd5359699abe(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        int i = 0;
        while (i < k) {
            int temp = sum;
            sum = 0;
            while (temp > 0) {
                sum += temp % 10;
                temp /= 10;
            }
            i++;
        }
        return sum;
    }

    
    public static int addElements_Problem_3_8dce508c_3691_48a2_8d5c_18b358cfca72(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_33a728cc_5324_4adb_9bd3_bfdf03b2654c(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i<k; i++){
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_3_aec8e00e_4886_40cb_9c2a_aafeccd8e33c(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_08b59625_cade_49d0_afcc_e47cabd94a5d(ArrayList<Integer> arr, int k) {

        // Write your code here
        int len = arr.size();
        int i = 0;
        int j = len - 1;
        int sum = 0;
        while(i < j) {
            if(arr.get(i) + arr.get(j) < 10) {
                sum += arr.get(i) + arr.get(j);
                i++;
                j--;
            } else if(arr.get(i) + arr.get(j) >= 10) {
                sum += arr.get(i) + arr.get(j) / 10;
                j--;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_2_2bc7db5b_b288_4386_bba3_1b3a84a66420(ArrayList<Integer> arr, int k) {

        return arr.stream().limit(k).mapToInteger(x -> x).sum();
    }

    
    public static int addElements_Problem_2_686ef015_f7d2_482b_a694_868802dcc0f9(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_795c9d9b_0ed5_452d_94b5_fc17fd1656bb(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_0_e306eaae_66f7_45bf_bb96_ce3dcbea9e5a(ArrayList<Integer> arr, int k) {

        // Write your code here
        int len = arr.size();
        int i = 0;
        int j = 0;
        int sum = 0;
        while(i < len && j < k){
            sum += arr.get(i);
            i++;
            j++;
        }
        while(i < len){
            sum += arr.get(i);
            i++;
        }
        return sum;
    }

    
    public static int addElements_Problem_4_576f2334_c2ec_4bf1_bd47_b4351b7fa94e(ArrayList<Integer> arr, int k) {
        return 0;
    }

    
    public static int addElements_Problem_0_08eb274a_ece5_49b8_92c0_6c97eb899a71(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_2_d9c7eb39_1270_471f_99a9_4cf097275e2a(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_4_fb88df5e_3bb8_4928_98a4_b1b5549460dd(ArrayList<Integer> arr, int k) {

        // Write your code here
        return arr.stream().limit(k).mapToInteger(x -> x).sum();
    }

    
    public static int addElements_Problem_1_1f197d13_1bcc_4bae_a709_f13216d92110(ArrayList<Integer> arr, int k) {

        // Write your code here
        return arr.stream().limit(k).mapToInteger(Integer::intValue).reduce(0L, (a,b) -> a + (a < 10 ? b : b % 10));
    }

    
    public static int addElements_Problem_2_441aa2c9_51d1_40de_aabf_6a1ed9768f80(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 10) {
                sum += arr.get(i);
            } else if (arr.get(i) < 100) {
                sum += arr.get(i) % 10;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_3_ba4417df_1286_47ac_9420_7aaad47864ea(ArrayList<Integer> arr, int k) {

        // Write your code here
        return arr.stream().limit(k).mapToInteger(i -> i).sum();
    }

    
    public static int addElements_Problem_1_181fd434_a9fd_4345_85df_cd406f9b7b55(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i<k; i++) {
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_4_5632bf14_aace_4390_9e12_05f884a74efb(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_0_0ec9fbf4_24e2_4745_a548_9dbd4e8a2dec(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 10) {
                sum += arr.get(i);
            } else if (arr.get(i) < 100) {
                sum += arr.get(i) / 10;
                sum += arr.get(i) % 10;
            } else {
                sum += arr.get(i) / 100;
                sum += (arr.get(i) % 100) / 10;
                sum += (arr.get(i) % 100) % 10;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_1_a4d35b2d_83c1_49d9_92c2_f2c510a1f326(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        int i = 0;
        while(i < k) {
            sum += arr.get(i);
            i++;
        }
        return sum;
    }

    
    public static int addElements_Problem_0_a14f79d2_99b5_4f8f_a91f_fede9a1ad24a(ArrayList<Integer> arr, int k) {
        int result = 0;
        for (int i = 0; i < k; i++) {
            result += arr.get(i);
        }
        return result;
    }

    
    public static int addElements_Problem_4_9f977c5a_c4d8_453e_b8a9_7f78690e7a45(ArrayList<Integer> arr, int k) {
        // Your code here
        int sum = 0;
        Set<Integer> set = new HashSet<Integer>();
        for(int i=0;i<k;i++){
            set.add(arr.get(i));
        }
        for(int x: set){
            sum += x;
        }
        return sum;
    }

    
    public static int addElements_Problem_0_c13e6aa9_8e4d_4c28_9cc2_8dcae4474d75(ArrayList<Integer> arr, int k) {

        // Write your code here
        int n = arr.size();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr.get(i);
        }
        if (k == 1) {
            return sum;
        }
        int[] dp = new int[n + 1];
        dp[0] = sum;
        for (int i = 1; i <= n; i++) {
            dp[i] = dp[i - 1];
            for (int j = 1; j <= i; j++) {
                dp[i] += arr.get(i - j);
            }
        }
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            ans += dp[i];
        }
        return ans;
    }

    
    public static int addElements_Problem_2_b4b6ec5d_2e4b_4f3f_9570_c1cd439ca6e0(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_1_ef1aecec_fd19_4bfc_af70_5c7451aa97f6(ArrayList<Integer> arr, int k) {

        // Write your code here
        return arr.stream().limit(k).mapToInteger(Integer::intValue).filter(x -> x < 100).sum();
    }

    
    public static int addElements_Problem_2_862320cc_1aca_4c91_bcb1_940ca5f78b78(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_7b1af37e_70a2_4b12_9a72_cfade962afe8(ArrayList<Integer> arr, int k) {
        int sum = 0;
        if (k > arr.size())
            return 0;
        int maxDigits = Math.max(2,  Math.log10(Math.max(arr.get(0), arr.get(arr.size() - 1))) - 2);
        for (int i = 0; i < Math.min(k, arr.size()); i++) {
            sum += arr.get(i) % 10 + arr.get(i) / 100;
        }
        return sum % 10 == 0 ? sum : sum % 10 == 0 ? sum + 10 : sum;
    }

    
    public static int addElements_Problem_3_1be9fbd0_b586_4230_9723_8c9bd0cb702b(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        int i = 0;
        while (i < k) {
            int temp = sum;
            sum = 0;
            while (temp > 0) {
                sum += temp % 10;
                temp /= 10;
            }
            i++;
        }
        return sum;
    }

    
    public static int addElements_Problem_2_4b613339_875f_4874_a19d_d08a2660cfb2(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            int num = arr.get(i);
            if (num < 100) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_1_5b3cc31d_19f1_41ce_90d8_39d4aeadf8cb(ArrayList<Integer> arr, int k) {

        // Write your code here
        return arr.stream().limit(k).mapToInteger(Integer::intValue).filter(x -> x < 100).sum();
    }

    
    public static int addElements_Problem_1_539b94d4_16c2_424d_bef8_103515a010c7(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_31a92e39_96f7_4319_b74e_066651ed043d(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_f66793dc_c276_4f34_aaba_c5880c894459(ArrayList<Integer> arr, int k) {
        return arr.stream().limit(k).filter(x -> x < 100).mapToInteger(x -> x).sum();
    }

    
    public static int addElements_Problem_4_4bdfa795_3c73_4d22_80d0_f9a5779562ee(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        int temp = sum;
        while (temp > 99) {
            sum = sum - temp % 100 + temp % 100;
            temp = temp / 100;
        }
        return sum;
    }

    
    public static int addElements_Problem_1_22268cf9_b6da_4797_8011_1f636eefdae9(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            int num = arr.get(i);
            if (num < 10) {
                sum += num;
            } else if (num < 100) {
                sum += num % 10;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_0_7daffbf3_f02e_4dae_b89b_dbcc5cbf56fe(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for(int i = 0; i < k; i++){
            if(arr.get(i) < 10){
                sum += arr.get(i);
            }
            else if(arr.get(i) < 100){
                sum += arr.get(i) / 10;
                sum += arr.get(i) % 10;
            }
            else{
                sum += arr.get(i) / 100;
                sum += (arr.get(i) % 100) / 10;
                sum += (arr.get(i) % 100) % 10;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_0_7be079e6_838b_4ebe_bcfb_0fa21f141255(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_0_035f0862_eaa3_4159_8ded_7849977d23b0(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_3_2eeef152_ffc7_4e89_9052_0a85296cbd34(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_46c41e96_9221_4782_93ee_c140fbf9ca98(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_1_9672128c_5366_4e46_92d4_e42512ab0be7(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_1_6cd1a308_8332_4d67_b1e5_d3f836570df8(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_b3c90d08_0f7c_4f65_a470_af5c3ca2025b(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_1_08114c5f_96d9_4f11_84bf_88b62ba31e07(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_347b18e5_d6dd_4662_b766_14385c8e342e(ArrayList<Integer> arr, int k) {

        int n = arr.size();
        int i = 0;
        int sum = 0;
        while (i < n) {
            if (arr.get(i) < 10) {
                sum += arr.get(i);
            } else if (arr.get(i) < 100) {
                sum += arr.get(i) / 10;
            } else {
                sum += arr.get(i) / 100;
            }
            i++;
        }
        return sum;
    }

    
    public static int addElements_Problem_4_e5a0e429_ba15_4dc9_a4fa_c41cc23fc6e3(ArrayList<Integer> arr, int k) {
        return arr.stream().limit(k).filter(x -> x < 100).mapToInteger(x -> x).sum();
    }

    
    public static int addElements_Problem_2_8c97b3cb_8432_4e5f_aa4b_565114664f08(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_0_4b9a8e63_91c8_43e1_99f6_a372b128561d(ArrayList<Integer> arr, int k) {

        // Write your code here
        int len = arr.size();
        int i = 0;
        int sum = 0;
        while (i < len) {
            if (arr.get(i) < 10) {
                sum += arr.get(i);
            } else {
                sum += arr.get(i) % 10;
                sum += arr.get(i) / 10;
            }
            i++;
        }
        return sum;
    }

    
    public static int addElements_Problem_3_163ffc7f_5553_4185_a10d_6700ceed5002(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 10) {
                sum += arr.get(i);
            } else if (arr.get(i) < 100) {
                sum += arr.get(i);
            } else {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_0_3251b566_4570_46f0_938b_66c7b81079d3(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_0_9a5570a4_bdc0_45a0_aff4_14c59dda2823(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_0_c9be97d4_83d7_4033_88fa_c1e76c0cecf1(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i< arr.size()-k; i++){
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_2_10fe45ea_ab1c_4d00_88d1_5734260000d3(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_b8dda961_28e5_4698_9335_3deb3913c890(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_ae6722c2_9d28_437c_98f9_7003bb2350a0(ArrayList<Integer> arr, int k) {
        return arr.stream().limit(k).filter(x -> x < 100).reduce(0, (x, y) -> x + y);
    }

    
    public static int addElements_Problem_0_8ea0038d_8cbf_47a2_ad48_6fcd74aa0cd1(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_0_db2a8751_e643_49f6_8138_ea632eff6392(ArrayList<Integer> arr, int k) {

        return arr.stream().limit(k).mapToInteger(Integer::intValue).sum();
    }

    
    public static int addElements_Problem_3_694e58b4_f3b3_4223_ba29_c8e67a8f701f(ArrayList<Integer> arr, int k) {

        // Your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_4_2d3ae3be_489e_4ff8_a049_1f4cf94cf954(ArrayList<Integer> arr, int k) {
        int sum = 0;
        int maxSum = 0;
        for(int i = 0; i<arr.size(); i++) {
            int currentSum = 0;
            for(int j = 0; j<k; j++) {
                currentSum += arr.get(i-j);
            }
            sum += currentSum;
            if(currentSum > maxSum) {
                maxSum = currentSum;
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_3_20a610d1_866e_4ecc_8131_7a86c2a46534(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_4_8bb99756_0986_4006_b404_48e9b1e9b683(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_0_8f745cd9_e5a7_4073_8d1b_f6f2fc01e90b(ArrayList<Integer> arr, int k) {
        return 0;
    }

    
    public static int addElements_Problem_1_cb84528d_5715_40f7_996f_175564239d6d(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_c4f9489c_dbd9_47ef_9973_771dddfc3d4b(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int a : arr)
            sum += a;
        int limit = Math.min(sum / 10, k);
        sum -= limit * 10;
        for (int a : arr)
            sum += (a / limit);
        return sum;
    }

    
    public static int addElements_Problem_3_790c77a9_5df3_4d37_9988_4362b0ad2d49(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 10) {
                sum += arr.get(i);
            } else if (arr.get(i) < 100) {
                sum += arr.get(i) / 10;
            } else {
                sum += arr.get(i) / 100;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_0_c1fbc9da_8899_45cd_a50c_b5fbbbaec1a0(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_4_46ba719a_271d_4854_80c4_1d5fd0080068(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_1_c49a50bf_f08b_45bf_8c10_3660f6cef3d7(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_a2c121cd_4aa0_4ba0_aa61_e964359cd6cd(ArrayList<Integer> arr, int k) {
        int sum = 0;
        int max = 0;
        int min = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
            max = Math.max(max, arr.get(i));
            min = Math.min(min, arr.get(i));
        }
        sum += max;
        sum += min;
        return sum;
    }

    
    public static int addElements_Problem_0_541ebf1b_fbad_40af_b3ed_4a7c2c76da48(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_2_dd2a3b2d_3232_44c7_93f9_3a0cc4ec4abe(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_1_2b0b6ae0_b7ee_4889_8f8f_8165c263430b(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_2_f4691985_61c4_4955_bc01_0d2d21b810cd(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_401e82d7_b69c_460c_aca2_5e182e1af6b7(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_4_d8280c80_be21_4b7d_81a0_9889eb973ad1(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_2597eb3f_6d72_49fb_a3bf_8e13fda24169(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_91ca5632_f0b7_4fbf_a380_43b6e48b6638(ArrayList<Integer> arr, int k) {
        // Write your code here.
        int sum = 0;
        for(int i = 0; i < arr.size()-k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_d56a9034_5aff_40e2_b55c_5e311d62e745(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_0_579dd519_abab_43f3_98cf_4ddd094dfd11(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_53d58c2e_90bb_478d_8ed9_4f7b2e28030f(ArrayList<Integer> arr, int k) {

        // Write your code here
        return arr.stream().limit(k).mapToInteger(Integer::intValue).filter(x -> x < 100).sum();
    }

    
    public static int addElements_Problem_3_d94681fc_a862_449f_9224_839c391f7fc4(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_d961f166_8e14_4742_ab11_57c43246bf5b(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_4_484f0bac_0113_416e_8cae_f5f4d3a75a77(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_4_e1084825_4084_4255_ba2b_9b72a539fd40(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_3_fbbd9613_ccdd_45a5_a184_8a65a6a5a817(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_2_5baa5d28_3412_4a44_9b03_1220ad94e2fd(ArrayList<Integer> arr, int k) {
        return arr.stream().filter(n -> (n<100)).limit(k).reduce(0, (n1, n2) -> (n1+n2));
    }

    
    public static int addElements_Problem_0_e9f71b09_430d_4279_bc44_0c70aa2d6341(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_1_3c229453_87d7_4b8d_af0a_1edf6f73b62f(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_4_c0eca4ba_3031_408c_b0a9_8e672802ec93(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_938bb325_305b_434b_8838_314ee8d72113(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for(int i = 0; i < k; i++) {
            if(arr.get(i) < 10) {
                sum += arr.get(i);
            } else if(arr.get(i) < 100) {
                sum += arr.get(i);
            } else {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_4_8d28dcad_0acd_42fc_a106_1d91af8efd2c(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_2_683571e2_327d_47ed_8cde_abc3c4634f04(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_714d1045_a933_405c_ba44_91d791e788b9(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_1_60f95858_c9a0_4f20_9320_26f697736f70(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_3_aafc4dcc_a144_4c06_9bad_3cbf5c560f1e(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_94c150d3_b74c_48b7_ada5_b0244279c58b(ArrayList<Integer> arr, int k) {

        // Write your code here
        int len = arr.size();
        int i = 0;
        int j = len - 1;
        int sum = 0;
        while (i < j) {
            if (arr.get(i) + arr.get(j) <= k) {
                sum += arr.get(i) + arr.get(j);
                i++;
                j--;
            } else {
                sum += arr.get(i) + arr.get(j) - k;
                j--;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_2_f7b89701_602f_4d2d_9cb0_5486941ca653(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i=0;i<k;i++) {
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_0_106435b9_8922_4e73_aefb_8a75505ce11f(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_4_4de43451_5169_41e0_85e2_aa245d73164b(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            int num = arr.get(i);
            if (num < 100) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_3_36790938_a959_4e8e_aa13_616777998931(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_4_033b2bf1_3f71_4dcb_9885_f5f8eada42f2(ArrayList<Integer> arr, int k) {

        // Write your code here
        int n = arr.size();
        int i = 0;
        int j = n-1;
        int sum = 0;
        while(i<j){
            if(arr.get(i) + arr.get(j) <= k){
                sum += arr.get(i) + arr.get(j);
                i++;
                j--;
            }
            else{
                sum += arr.get(i) + arr.get(j) - k;
                j--;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_2_f3ed7090_4b48_450f_8b3b_99ff5a60f3cf(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) > 99) {
                sum += arr.get(i) % 100;
            } else {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_4_d79385e4_b2e6_4e33_b885_ca646b3ce93a(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_2_1fee2249_9e85_4497_bd80_c03c497bf040(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_2af4b16e_3e3a_451a_97f0_980e3006cbba(ArrayList<Integer> arr, int k) {

        // Write your code here
        int len = arr.size();
        int i = 0;
        int sum = 0;
        while(i < len) {
            if(arr.get(i) > 9) {
                sum += arr.get(i) / 10;
                sum += arr.get(i) % 10;
            } else {
                sum += arr.get(i);
            }
            i++;
        }
        return sum;
    }

    
    public static int addElements_Problem_4_f114a2a4_7832_45da_9260_828cee8ca577(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_2_3fcb179e_dd57_43f8_922f_38c04a7b43be(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (i == k) {
                break;
            }
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_1_eca0408c_80e3_4171_be55_f4d5825db54a(ArrayList<Integer> arr, int k) {

        // Write your code here
        int len = arr.size();
        int start = 0;
        int end = len - 1;
        int sum = 0;
        while (start <= end) {
            sum += arr.get(start);
            if (sum > 9) {
                sum = sum % 10;
                start++;
            } else {
                break;
            }
        }
        if (start > end) {
            sum += arr.get(end);
        }
        return sum;
    }

    
    public static int addElements_Problem_4_88a2e97c_38f4_4005_b581_6673acb0985a(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_4_4ec8eb36_c79e_4bde_9246_83163049f6d8(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i< arr.size()-k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_f2d34d35_0716_4136_9ccf_b9a746fc7aa5(ArrayList<Integer> arr, int k) {

        // Write your code here
        return arr.stream().limit(k).mapToInteger(Integer::intValue).filter(x -> x < 10 || x > 99).sum();
    }

    
    public static int addElements_Problem_4_971c130c_7f9b_4e27_b4d5_61f487f2e09f(ArrayList<Integer> arr, int k) {

        // Write your code here
        int len = arr.size();
        int i = 0;
        int j = 0;
        int sum = 0;
        while(i < len){
            if(j == k){
                break;
            }
            if(j == 0){
                sum += arr.get(i);
                j++;
            }
            else{
                if(arr.get(i) < 10){
                    sum += arr.get(i);
                    j++;
                }
                else{
                    break;
                }
            }
            i++;
        }
        return sum;
    }

    
    public static int addElements_Problem_0_e762c586_fc6d_4b84_9366_05b1016227f2(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i<k; i++) {
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_4_33f36eef_eec3_4639_a960_681ce9c780cf(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_ae6362b5_cf9c_4ac8_80f4_cb19b5efbb23(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_25b2e131_8f40_4e6c_b6e7_75ceab4c8e42(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_4_d6a77a7f_00d3_40ae_bcf1_992bb04523ee(ArrayList<Integer> arr, int k) {

        // Write your code here
        return arr.stream().limit(k).mapToInteger(Integer::intValue).sum();
    }

    
    public static int addElements_Problem_1_52b4c0c7_6625_4c5b_82a0_bdfa6f3eefaf(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_625dde8c_b83f_4e23_80a6_578296c7b655(ArrayList<Integer> arr, int k) {
        return arr.stream().limit(k).filter(x -> x < 100).mapToInteger(x -> x).sum();
    }

    
    public static int addElements_Problem_4_7292f41a_fa92_45ac_ad33_118bfb90d45c(ArrayList<Integer> arr, int k) {

        // Write your code here
        int n = arr.size();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_5c065c2f_e7c4_41ab_811a_d32a74b8742a(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_2_aaec0e69_29fb_450a_8f18_b4bcfaca8505(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i< arr.size()-k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_44643214_8ee1_4595_a7e0_54c42053ffa6(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++){
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_0ee2626d_b9ea_4b35_bd77_eedf7b7729c5(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_2_7e2e17c4_706a_44dd_be8d_3b58d094313d(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_3439ad34_d079_45e2_a719_9361e5233d7c(ArrayList<Integer> arr, int k) {
        int sum = 0;
        int max = 0;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
            max = Math.max(max, arr.get(i));
            min = Math.min(min, arr.get(i));
        }
        sum += max;
        sum += min;
        return sum;
    }

    
    public static int addElements_Problem_0_a7a65e55_3f19_4740_ad29_02798a7023ad(ArrayList<Integer> arr, int k) {
        return 0;
    }

    
    public static int addElements_Problem_1_7d87b423_1300_416a_b10a_f25703271deb(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_3_fd2bf1da_4caa_4d2d_b991_26a736f50338(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_c848eec8_0939_4f19_8c82_3baa1164b963(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_2_f575282f_4cf5_462b_b7a4_76a181c78ef5(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            int num = arr.get(i);
            if (num < 100) {
                sum += num;
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_2_763981aa_9390_42f0_b102_c69bbd9a9201(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_4_693a1522_b934_403e_ae48_f4c01c59a661(ArrayList<Integer> arr, int k) {
        // int result = 0;
        // for (int i = 0; i < Math.min(k, arr.size()); i++) {
        //     String str = String.valueOf(arr.get(i));
        //     if (str.length() < 3) {
        //         result += arr.get(i);
        //     }
        // }
        // return result;
        return arr.stream().limit(k).filter(x -> String.valueOf(x).length() < 3).mapToInteger(x -> x).sum();
    }

    
    public static int addElements_Problem_4_4f5bd621_d585_49c6_b416_9ef1e84fda60(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_4_20998754_cb9f_4ed1_b9de_e01bdeecca41(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_0_1a87f485_f584_44ce_92a5_f2800491341b(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_0_bdb6a123_cc90_446d_ac9b_8d9b9281fa30(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for(int i = 0; i < k; i++){
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_25b2e131_8f40_4e6c_b6e7_75ceab4c8e42(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_d36f0a1c_0e9b_48d5_9756_afab0f1a5181(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_1_b75a8857_aecd_43a0_acea_4a371b481eab(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_d14ef0ee_79be_4b6a_9b1b_0f3725b53f84(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_f84794e4_a13c_49b0_9ce9_cd41cb93ef84(ArrayList<Integer> arr, int k) {

        // Write your code here
        int len = arr.size();
        int i = 0;
        int j = 0;
        int sum = 0;
        while (i < len && j < k) {
            sum += arr.get(i);
            i++;
            j++;
        }
        while (j < k) {
            sum += arr.get(i);
            i++;
            j++;
        }
        return sum;
    }

    
    public static int addElements_Problem_3_c9b0706f_3039_483a_95fd_57e8af6d218d(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_69ce742c_1edd_423d_9134_42a48c0c37f0(ArrayList<Integer> arr, int k) {

        // Write your code here
        int n = arr.size();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (i < k) {
                sum += arr.get(i);
            } else {
                sum += arr.get(i) / 10;
                sum += arr.get(i) % 10;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_0_431e0e88_4bc9_442b_8530_25693225c5e4(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_0_d6668cda_dbfc_4fd5_a992_098a34575e65(ArrayList<Integer> arr, int k) {

        // Write your code here
        return arr.stream().limit(k).mapToInteger(Integer::intValue).filter(x -> x < 10 || x > 99).sum();
    }

    
    public static int addElements_Problem_0_073c36f6_0425_432b_9396_df856f145808(ArrayList<Integer> arr, int k) {
        int sum = 0;
        int i = 0;
        while (i < k) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
            i += 1;
        }
        return sum;
    }

    
    public static int addElements_Problem_3_00206733_1d94_42d0_ad78_d7e04753b61e(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            int num = arr.get(i);
            if (num < 100) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_0_2419793c_bf23_4f57_aa11_dedd47d1fdeb(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_ee21ba8b_c76d_4ada_8cbf_e1e67d2dc05c(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_7631ae0e_a7f3_44a2_850b_db581d125798(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_1_1dbfce19_ace9_4c7f_ad15_526917577622(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_0_33bcbfa9_ee30_4758_a3db_79160d0b27ae(ArrayList<Integer> arr, int k) {
        // Your code here
        return 0;
    }

    
    public static int addElements_Problem_1_f62afcf4_f761_4e63_a874_6cdfb06858a0(ArrayList<Integer> arr, int k) {

        // Write your code here
        int n = arr.size();
        int l = 0;
        int r = n - 1;
        int sum = 0;
        while (l <= r) {
            sum += arr.get(l);
            if (sum > k) {
                sum -= arr.get(r);
                r--;
            } else {
                l++;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_2_0b16f4ce_7275_465a_9ca8_d7293b13a674(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_633e9fe9_57cc_4aab_9596_a1eda05cda40(ArrayList<Integer> arr, int k) {
        return arr.stream().limit(k).filter(x -> x < 100).mapToInteger(x -> x).sum();
    }

    
    public static int addElements_Problem_4_55a33d52_8d74_42dd_820b_89085616700b(ArrayList<Integer> arr, int k) {
        int sum = 0;
        int max = 0;
        int min = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
            max = Math.max(max, arr.get(i));
            min = Math.min(min, arr.get(i));
        }
        sum += max;
        sum += min;
        return sum;
    }

    
    public static int addElements_Problem_2_333b1895_15a0_4473_ab9a_5e333e52b90f(ArrayList<Integer> arr, int k) {
        int size = arr.size();
        int sum = 0;
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (arr.get(i) > 9 && arr.get(i) < 100) {
                sum += arr.get(i);
                count++;
            }
            if (count == k) {
                break;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_4_4b9a8e63_91c8_43e1_99f6_a372b128561d(ArrayList<Integer> arr, int k) {

        // Write your code here
        int len = arr.size();
        int i = 0;
        int sum = 0;
        while (i < len) {
            if (arr.get(i) < 10) {
                sum += arr.get(i);
            } else {
                sum += arr.get(i) % 10;
                sum += arr.get(i) / 10;
            }
            i++;
        }
        return sum;
    }

    
    public static int addElements_Problem_2_c611cd0e_913d_42ce_a233_523c55d2e471(ArrayList<Integer> arr, int k) {
        int sum = 0;
        int max = 0;
        int min = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
            max = Math.max(max, arr.get(i));
            min = Math.min(min, arr.get(i));
        }
        sum += max;
        sum += min;
        return sum;
    }

    
    public static int addElements_Problem_0_fd8e5630_722b_4b4c_acb4_b316361ce1a3(ArrayList<Integer> arr, int k) {
        return arr.stream().limit(k).filter(x -> x < 100).mapToInteger(x -> x).sum();
    }

    
    public static int addElements_Problem_1_0a068e5b_f77d_4376_8fe6_41cbe4927f09(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_3_dba83c00_d81a_46ca_b57f_eda41df838c6(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_7a00d708_7ef6_48cd_a0bb_9a3e22ab7c7d(ArrayList<Integer> arr, int k) {
        return arr.stream().limit(k).filter(x -> x < 100).mapToInteger(x -> x).sum();
    }

    
    public static int addElements_Problem_4_f5651c2a_44b4_4169_b256_2e713e30c018(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_0_6b29c45a_2a82_4241_a84a_2b1cfcea181b(ArrayList<Integer> arr, int k) {
        return arr.stream().filter(x -> (1 <= x) && (x <= 99)).limit(k).reduce(0, (x, y) -> x + y);
    }

    
    public static int addElements_Problem_3_2e38160f_7b45_4ccc_b97e_046126386cf0(ArrayList<Integer> arr, int k) {
        int result = 0;
        for (int i : arr) {
            int digitsCount =  Math.log10(i) + 1;
            if (digitsCount > 2) {
                result += (i / 10) * (i / 10) % 10 * i % 10;
            }
        }
        return result;
    }

    
    public static int addElements_Problem_3_5de24867_db7a_497b_b431_ef2280a35f92(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_c8ca3587_c516_4854_9cd7_9aae4cab7009(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        int i = 0;
        while(i < k) {
            sum += arr.get(i);
            i++;
        }
        return sum;
    }

    
    public static int addElements_Problem_2_ef8ad0c6_f16f_4470_90e1_65f692f04d6e(ArrayList<Integer> arr, int k) {

        // Write your code here
        int n = arr.size();
        int i = 0;
        int j = n - 1;
        int sum = 0;
        while (i <= j) {
            if (arr.get(i) + arr.get(j) <= k) {
                sum += arr.get(i) + arr.get(j);
                i++;
                j--;
            } else {
                sum += arr.get(i) + arr.get(j) - k;
                i++;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_4_a2ee8221_119c_449a_bb97_29522fc06112(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 10) {
                sum += arr.get(i);
            } else if (arr.get(i) < 100) {
                sum += arr.get(i) - (arr.get(i) % 10);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_1_0f4f50ca_f90f_4580_98ab_51f26eb484de(ArrayList<Integer> arr, int k) {
        int result = 0;
        int[] temp = new int[arr.size()];
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            int num = arr.get(i);
            if (num < 100) {
                result += num;
                count++;
            }
            else {
                temp[i] = arr.get(i);
            }
        }
        int size = count;
        if (k > size) {
            for (int i = 0; i < temp.length; i++) {
                if (temp[i] > 0) {
                    result += temp[i];
                    size++;
                }
                if (size == k)
                    break;
            }
        }
        return result;
    }

    
    public static int addElements_Problem_3_a4d35b2d_83c1_49d9_92c2_f2c510a1f326(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        int i = 0;
        while(i < k) {
            sum += arr.get(i);
            i++;
        }
        return sum;
    }

    
    public static int addElements_Problem_2_82ac04a2_dbb2_4f0b_9ac0_643722e127e1(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 10) {
                sum += arr.get(i);
            } else if (arr.get(i) < 100) {
                sum += arr.get(i) - 10;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_0_a41838ad_53e6_4d55_a20c_09b457eeab56(ArrayList<Integer> arr, int k) {
        return 0;
    }

    
    public static int addElements_Problem_0_89262f92_c508_402c_a817_06cc108e9b27(ArrayList<Integer> arr, int k) {

        int sum = 0;
        int i = 0;
        while (i < k) {
            sum += arr.get(i);
            i++;
        }
        return sum;
    }

    
    public static int addElements_Problem_1_2af4b16e_3e3a_451a_97f0_980e3006cbba(ArrayList<Integer> arr, int k) {

        // Write your code here
        int len = arr.size();
        int i = 0;
        int sum = 0;
        while(i < len) {
            if(arr.get(i) > 9) {
                sum += arr.get(i) / 10;
                sum += arr.get(i) % 10;
            } else {
                sum += arr.get(i);
            }
            i++;
        }
        return sum;
    }

    
    public static int addElements_Problem_3_a15ab459_58a4_470c_8ee6_b847004f87e6(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) >= 100) {
                continue;
            }
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_13fa03ad_ef61_43ed_9325_85f7d0bacca7(ArrayList<Integer> arr, int k) {
        // Write your code here
        return 0;
    }

    
    public static int addElements_Problem_4_6a223fda_37fa_44d0_9a22_e0b74de7c3a4(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_3_16129956_8be3_4be8_8c58_ae9781910eb5(ArrayList<Integer> arr, int k) {
        return arr.stream().filter(x -> x < 100).limit(k).reduce(0, (x, y) -> x + y);
    }

    
    public static int addElements_Problem_1_bb56396e_b8f6_4bf3_92df_266a2b4fc698(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for(int i = 0; i < k; i++) {
            if(arr.get(i) < 10) {
                sum += arr.get(i);
            } else {
                sum += arr.get(i) % 10;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_4_fd1151e2_c3ba_44c7_9796_44c0861b38b6(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for(int i = 0; i < k; i++){
            if(arr.get(i) < 10){
                sum += arr.get(i);
            }
            else{
                sum += arr.get(i) % 10;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_2_74f174e1_1ef0_49be_8dba_c700a3985dcf(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_76ceb2ed_2b34_44d9_97f8_f4e0a17734c6(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_1_944e442e_eaa1_44e0_8466_789030b6bc9e(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_1_f44f3e26_f1ce_43c2_9983_25fe66b9d768(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_4_947e08ee_70f4_4211_ace0_9bd255c5c2a3(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_4_f37d6d10_b29c_427a_a186_3cad27b9c8c8(ArrayList<Integer> arr, int k) {
        return arr.stream().limit(k).filter(x -> x < 100).mapToInteger(x -> x).sum();
    }

    
    public static int addElements_Problem_1_f9393b7f_c651_4161_add0_bdd95c3303d6(ArrayList<Integer> arr, int k) {
        if (arr.isEmpty()) {
            return 0;
        }
        Set<Integer> digits = new HashSet<>();
        int total = 0;
        for (int i = 0; i < k; i++) {
            digits.add(arr.get(i) / 100);
        }
        for (Integer number : arr) {
            total += number / 100;
        }
        Set<Integer> set = new HashSet<>(arr);
        set.removeAll(digits);
        set.removeAll(set);
        return set.stream().mapToInteger(x -> x * 10).sum();
    }

    
    public static int addElements_Problem_0_90a51c76_ea08_4ac1_9d17_eaffa707704f(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_3_dd2ba09f_c377_4232_9e96_6d0a9f3ec839(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_28269ed5_31ac_414e_874e_cfc33b8a0f25(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_1_541ebf1b_fbad_40af_b3ed_4a7c2c76da48(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_2_72472434_7a35_49bd_942e_eee8b9b2e0b8(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for(int i = 0; i < k; i++) {
            if(arr.get(i) < 10) {
                sum += arr.get(i);
            } else if(arr.get(i) < 100) {
                sum += arr.get(i) / 10;
            } else {
                sum += arr.get(i) / 100;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_2_0203665a_9090_4b15_82dd_66497e4d6d5c(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_1_812e08be_24b2_4693_bbe0_1d5314332420(ArrayList<Integer> arr, int k) {
        // Your code here
        return 0;
    }

    
    public static int addElements_Problem_4_8126070c_c0ff_4ebb_8bba_e19968043d97(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_4_c707fa78_886b_42c5_aee4_73cc637e6f30(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_1_e45d779a_f2de_4423_953a_3e8c2168f7c9(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i<k; i++){
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_4_ac1cbbd6_e8dc_44a2_9319_051c61e35832(ArrayList<Integer> arr, int k) {

        // Write your code here
        int len = arr.size();
        int start = 0;
        int end = len - 1;
        int sum = 0;
        while (start <= end) {
            sum += arr.get(start);
            sum += arr.get(end);
            if (sum > k) {
                sum = sum - arr.get(start);
                start++;
            } else if (sum < k) {
                sum = sum - arr.get(end);
                end--;
            } else {
                return sum;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_0_a0b89d8d_5121_4644_9122_b032757c1b41(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_4_be7ce192_eb1b_4cbd_b0a8_c7ed17275678(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_03a16364_7ae6_4537_85e9_9dfd23a76419(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (Integer l : arr) {
            if (k <= l) {
                sum += l;
                k--;
            } else {
                break;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_2_3ec42401_f0d2_4da5_8107_c40be6cdfe4f(ArrayList<Integer> arr, int k) {
        return arr.stream().limit(k).filter(x -> x < 100).reduce(0, (x, y) -> x + y);
    }

    
    public static int addElements_Problem_0_ee5904cf_4128_47d9_8bb3_5e48b54ec4e2(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for(int i = 0; i < k; i++){
            if(arr.get(i) < 10){
                sum += arr.get(i);
            }
            else if(arr.get(i) < 100){
                sum += arr.get(i) / 10;
                sum += arr.get(i) % 10;
            }
            else{
                sum += arr.get(i) / 100;
                sum += (arr.get(i) % 100) / 10;
                sum += (arr.get(i) % 100) % 10;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_2_6a59ba16_5122_4f07_9c8f_a9a989754081(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_3_7cd8175d_c675_48bf_b43c_a36ff87e3d96(ArrayList<Integer> arr, int k) {

        // Write your code here
        return arr.stream().limit(k).mapToInteger(Integer::intValue).sum();
    }

    
    public static int addElements_Problem_3_c5eebdb1_b4f1_4a2b_842a_919db1f1e36d(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_2_7daffbf3_f02e_4dae_b89b_dbcc5cbf56fe(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for(int i = 0; i < k; i++){
            if(arr.get(i) < 10){
                sum += arr.get(i);
            }
            else if(arr.get(i) < 100){
                sum += arr.get(i) / 10;
                sum += arr.get(i) % 10;
            }
            else{
                sum += arr.get(i) / 100;
                sum += (arr.get(i) % 100) / 10;
                sum += (arr.get(i) % 100) % 10;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_4_f870476c_690d_4cbc_be9e_560d99e63dbe(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_0_ce74df5c_b927_451a_befe_af9321393247(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;

    }

    
    public static int addElements_Problem_1_3032de24_d380_4977_8bec_30ee1cc51035(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_4_7a8593cb_2d71_4100_86ce_8fcf73a72432(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 10) {
                sum += arr.get(i);
            } else if (arr.get(i) < 100) {
                sum += arr.get(i) - (arr.get(i) % 10);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_3_44526b27_a5e9_4557_a0d9_f3e9ed908dfa(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_0d7e488a_3b17_4572_a958_354d9da532d2(ArrayList<Integer> arr, int k) {

        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 10) {
                sum += arr.get(i);
            } else {
                sum += arr.get(i) % 10;
                sum += arr.get(i) / 10;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_0_d957aa00_cb1b_4423_b6b7_36d90c0f33aa(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            String s = arr.get(i).toString();
            if (s.length() <= 2) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_0_4f4dedce_b446_43c9_97cb_3bf273a6221d(ArrayList<Integer> arr, int k) {

        int len = arr.size();
        int i = 0;
        int j = 0;
        int sum = 0;
        while (i < len) {
            if (j < k) {
                sum += arr.get(i);
                i++;
                j++;
            } else {
                break;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_4_e783b00e_bfa3_4daf_bdf1_12597ef038bd(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_1_2cd8feb0_75d7_4dcd_8d1d_23850d5c8a97(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_1_c602c7ca_7cc4_4219_8721_9a9bf2774ae0(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_d1fc5c94_20a3_4ddb_afe1_4106bef933fe(ArrayList<Integer> arr, int k) {
        // Your code here
        int sum = 0;
        for(int i=1;i<k;i++){
            sum+= arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_801bf8e7_f536_429b_a893_7f182eb0e529(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            int num = arr.get(i);
            if (num < 100) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_4_89ccad15_3322_4033_87d3_1911058eb5c5(ArrayList<Integer> arr, int k) {

        // Write your code here
        int n = arr.size();
        int sum = 0;
        for(int i = 0; i < n; i++){
            if(arr.get(i) > 9){
                sum += arr.get(i) / 10;
                sum += arr.get(i) % 10;
            }else{
                sum += arr.get(i);
            }
            if(i >= k - 1){
                break;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_4_d5615c9e_27f0_41c7_b416_927a52b2949b(ArrayList<Integer> arr, int k) {

        // Write your code here
        return arr.stream().limit(k).mapToInteger(Integer::intValue).filter(x -> x < 100).sum();
    }

    
    public static int addElements_Problem_4_f0d47038_1f9d_4dac_9e27_7d057b3a296a(ArrayList<Integer> arr, int k) {
        // Write your code here
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_3a2bf0e7_4f38_498d_b8db_7b5555a49502(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_4_fb9514f9_236d_4a69_9c61_c1fddfda1901(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_2_88a2e97c_38f4_4005_b581_6673acb0985a(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_1_25db9000_95fb_4e04_8bfc_6cc516c20fb5(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i< arr.size()-k; i++) {
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_2_4a2bc2dc_7c49_4a75_9b2c_e3cd6532a8e2(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;

    }

    
    public static int addElements_Problem_4_72f70645_88e1_4690_af3e_2b1a57931fe5(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_3_fe611c91_2275_4716_9a6a_5c24e574ff13(ArrayList<Integer> arr, int k) {
        return arr.stream().filter(x -> x.toString().length() <= 2).limit(k).mapToInteger(x -> x).sum();
    }

    
    public static int addElements_Problem_2_24ced16e_5092_4eea_ab16_8251abe52e3f(ArrayList<Integer> arr, int k) {

        int sum = 0;
        for(int i = 0; i < k; i++) {
            if(arr.get(i) < 10) {
                sum += arr.get(i);
            } else {
                sum += arr.get(i) % 10;
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_0_271de92a_4b69_4aa6_b46b_841ded02e0dd(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            if (arr.get(i) < 100) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int addElements_Problem_4_6ad56578_c6ad_408b_9442_a317f14488fb(ArrayList<Integer> arr, int k) {
        return arr.stream().filter(x -> x < 100).limit(k).mapToInteger(x -> x).sum();
    }

    
    public static int addElements_Problem_2_52e82fb4_06e1_4751_b0bd_dcb53aea1098(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int addElements_Problem_4_a0756727_bf02_4edd_b02f_c15bd409faca(ArrayList<Integer> arr, int k) {
        int result = 0;
        for (int i = 0; i < k; i++) {
            int n = arr.get(i);
            if (n < 100) {
                result += n;
            }
        }
        return result;
    }

}
