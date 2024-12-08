package mbpp_99_decimal_to_binary;

public class mbpp_99_decimal_to_binary {

    
    public static String decimalToBinary_Problem_0_6531a3af_d16b_490c_98f8_a4a162705dda(int n) {
        String binary = Integer.toBinaryString(n);
        binary = binary.substring(binary.length() - binary.length() % 8); // if length is not a multiple of 8, remove last character
        StringBuilder sb = new StringBuilder(binary);
        while (sb.length() < 32) // pad if int is less than 32 characters int
            sb.insert(0, 0);
        return sb.toString();
    }

    
    public static String decimalToBinary_Problem_1_620a975c_374c_46e7_aca0_f5880ec71d3d(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_0_f968ff61_0a80_4388_88e9_329f5532eb9e(int n) {
        return Integer.toBinaryString(n);
    }

    
    public static String decimalToBinary_Problem_2_847c65c7_d029_4cc7_8c18_7533781e2510(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_1_3f056fdb_551c_4e23_80fd_dc9a06b4d8b5(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_2_9a695255_d460_4f5e_8558_3e9b476e192c(int n) {
        StringBuffer binary = new StringBuffer("");
        for(int i = 7; i >= 0; i--){
            if((n & (1 << i)) != 0){
                binary.insert(0, 1);
            }
            else{
                binary.insert(0, 0);
            }
        }
        return binary.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_0_80f200ac_072e_4df5_a44e_081b9387569c(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_2_a8899ffc_aa5c_41b4_bc87_0bc723c45bec(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_0_ca64d010_a222_4b16_85a9_119138c43e7f(int n) {
        String decimalToBinary_Problem_0_ca64d010_a222_4b16_85a9_119138c43e7f = "000000000000000000000000000000000000000000000000";
        while (n>0) {
            int digit = n%2;
            decimalToBinary_Problem_0_ca64d010_a222_4b16_85a9_119138c43e7f += "" + digit;
            n = n/2;
        }
        return decimalToBinary_Problem_0_ca64d010_a222_4b16_85a9_119138c43e7f;
    }

    
    public static String decimalToBinary_Problem_0_f65016e6_a89c_4b75_925c_35cc8edadb7c(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_2_54123e31_afbf_4559_bb8b_67311584b1a4(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_1_245f0ae3_69f3_40a6_addb_3449546b6979(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_0_68025084_a5f7_4ac8_9788_60c6fda927a2(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_1_43c227e1_2c35_42b6_a5d3_0aabe91687f2(int n) {
        String binary = Integer.toBinaryString(n);
        return binary.substring(binary.length() - 1);
    }

    
    public static String decimalToBinary_Problem_1_33374f5d_b169_448a_b7d7_185b628b1644(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_0_337d89ef_5081_4355_98fa_7e0f91bbadb8(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_0_06ab20ef_ec54_431f_a4b7_b7fdd01d0be7(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_1_3e005187_8935_4f85_a46b_7f19788d7cdb(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_1_7258cc15_a8c3_4fba_ac51_2437bab354d5(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_0_245f0ae3_69f3_40a6_addb_3449546b6979(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_2_80f200ac_072e_4df5_a44e_081b9387569c(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_2_2cb341e9_6d66_49e3_b5c1_a81fd986808e(int n) {
        StringBuilder sb = new StringBuilder();
        while(n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_1_d1ed2c63_95a4_445d_bd7f_5e4d9b88fdf5(int n) {
        StringBuilder sb = new StringBuilder();
        while(n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_2_1bae5212_41e3_4aab_8a73_26e17676f5c4(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_0_addb941a_67c4_4cc9_b899_51d6cbe405f9(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_1_2874eb5f_9fa9_4fc6_ab5e_f7bc25542993(int n) {
        String str = Integer.toString(n);
        if(str.charAt(0) == '0')
            str = str.substring(1);
        return str;
    }

    
    public static String decimalToBinary_Problem_0_59785a25_c69b_441c_b554_c1c1b31beaa4(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n = n / 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_2_7884c8f7_3a0a_473f_a784_705b655754cc(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_2_966102fc_2861_4d16_9aaa_69e7f5eec6a1(int n) {
        StringBuilder sb = new StringBuilder();
        while(n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_0_37e2f8ef_f0e9_4851_a03e_2ed6250faca2(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_1_ff9d61c8_5251_4f35_bf9b_cb6caa9d2d4d(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_1_68025084_a5f7_4ac8_9788_60c6fda927a2(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_0_1ad7aaa4_6b6e_4598_90d0_6852053161b3(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_1_06f27199_5463_4b00_92f7_9a95332d579f(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_1_c4eb9380_8a40_4bb0_8021_8d166f1b7c3e(int n) {
        String binary = "";
        while (n > 0) {
            binary += (n % 2 == 0 ? "1" : "0");
            n = n / 2;
        }
        return binary;
    }

    
    public static String decimalToBinary_Problem_0_a5d75b3d_f566_4d2e_8b38_ae3a9b08593c(int n) {
        String binary = "";
        int x = 1;
        while (n>0) {
            if(n%2==1){
                binary=binary+x;
            }
            x=x*10;
            n=n/2;
        }
        return binary;
    }

    
    public static String decimalToBinary_Problem_0_4d4d810c_a30f_43ab_bb9c_6f392b3a77b8(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_2_f886fc5d_f3aa_4c3d_99a4_24208c634f66(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_2_b3022976_877d_40c5_91e9_602afec89f6b(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_0_ad064f5e_ee0f_461b_838a_5d428b8f0c6b(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_2_b8168033_f126_4366_a528_fb4f2dfeaa92(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_1_f968ff61_0a80_4388_88e9_329f5532eb9e(int n) {
        return Integer.toBinaryString(n);
    }

    
    public static String decimalToBinary_Problem_2_59e5b42b_1a44_4234_8e59_52f667c01831(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_0_09df0a27_8ce3_42c0_b7a1_c6d4adec2a7b(int n) {
        String binary = Integer.toBinaryString(n);
        int zeroCount = binary.length() - 1;
        return binary.substring(zeroCount);
    }

    
    public static String decimalToBinary_Problem_1_5d55a8ad_f4c1_4061_8b20_a349b1009f85(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_2_b9e46734_5240_4cd3_87ee_2c27c7d7b9e8(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_2_5d55a8ad_f4c1_4061_8b20_a349b1009f85(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_1_43d12aeb_8c9a_4289_a4cb_57265984daaf(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_1_018c72a6_50d6_40f2_a948_74e108cc5a4c(int n) {
        BigInteger num = new BigInteger(Integer.toString(n));
        return num.toString(2);
    }

    
    public static String decimalToBinary_Problem_1_cee584f5_5a4c_403a_835d_c2cd4f4ae0f1(int n) {
        String binary = "";
        while (n > 0) {
            binary += (n % 2);
            n /= 2;
        }
        return binary;
    }

    
    public static String decimalToBinary_Problem_2_06ab20ef_ec54_431f_a4b7_b7fdd01d0be7(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_0_b17c34d3_3ded_4a14_ad5e_1afc2bc3f32f(int n) {
        String binary = Integer.toString(n);
        int decimal = Integer.parseInt(binary);
        int remainder = decimal % 2;
        while (decimal >= 2) {
            decimal = decimal / 2;
            binary += Integer.toString(decimal).substring(1);
            decimal %= 2;
        }
        binary = binary + Integer.toString(remainder);
        return binary;
    }

    
    public static String decimalToBinary_Problem_1_4e1ae74e_8eb9_47e1_9d2e_685145e363d2(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_1_9e1b60d5_52cb_4c4d_92bd_5668336e8539(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_0_a704d082_d34c_4285_9a22_e8a41429b739(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_2_11db08e8_b5db_4987_96f3_0f60ab5e95a2(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_2_f968ff61_0a80_4388_88e9_329f5532eb9e(int n) {
        return Integer.toBinaryString(n);
    }

    
    public static String decimalToBinary_Problem_1_b170c4d1_f61a_4625_9e78_4c82bca8905a(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_0_eb35ace5_13e7_4a87_8b7d_1619c20686cc(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_1_e8a68b3d_f087_4bd5_b1b6_7d623e18d099(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_0_cee584f5_5a4c_403a_835d_c2cd4f4ae0f1(int n) {
        String binary = "";
        while (n > 0) {
            binary += (n % 2);
            n /= 2;
        }
        return binary;
    }

    
    public static String decimalToBinary_Problem_2_3d62e74c_1023_40f7_8d7f_2122ca1b5da9(int n) {
        String str = Integer.toString(n);
        str = str.replace('L', ' ');
        str = str.replace(',', ' ');
        str = str.substring(1);
        return str.substring(0, str.length()-1);
    }

    
    public static String decimalToBinary_Problem_0_feeb00e0_6736_4f06_8b2b_7671af121259(int n) {
        String binary = "";
        while (n > 0) {
            binary += (n % 2 == 0 ? "1" : "0");
            n /= 2;
        }
        return binary;
    }

    
    public static String decimalToBinary_Problem_0_ecd31c49_4e81_49e1_a3a4_05f5fa4c64c8(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_2_b3262a46_2541_463c_abcc_9926b7e2984a(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_0_035d8529_0387_44a7_b483_660c8c349f5e(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_0_eef8ba07_fe4f_424d_8e3b_7cd7b6cb257d(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_0_b3262a46_2541_463c_abcc_9926b7e2984a(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_0_12a9d7ba_11a5_49fb_b4b9_dcc749066a12(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_1_1bae5212_41e3_4aab_8a73_26e17676f5c4(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_2_470ea73e_5e57_43be_af73_e1db4d3f4d55(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_1_47551b0c_aa6a_4a79_a672_0f0f58075a1f(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_1_c32aed19_16c7_4747_bca4_362464ad315d(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_1_3d7942ab_0f25_4bc2_aed0_11364d6b5b46(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_0_2986bd9c_1ff8_4ec6_a77f_f898168ac79a(int n) {
        StringBuilder sb = new StringBuilder();
        while(n > 0) {
            sb.append(n % 2);
            n = n / 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_1_b585ead9_5ba0_479d_a4d9_651b1ccef313(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_2_b90d4d5b_7ce8_4903_a1cb_224c47db6023(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_2_005e458d_a285_4578_94c3_42c49982181b(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_2_3a3298bb_9f01_4fea_ba7f_7e12a887e679(int n) {
        StringBuilder sb = new StringBuilder();
        while(n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_2_3254c41c_9763_45e7_bf2a_e346a6c4036f(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_0_5f69ed40_133b_43b0_a29f_985d8a3c3efd(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_0_847c65c7_d029_4cc7_8c18_7533781e2510(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_0_515683b3_e951_409c_8ec0_e2275a793d8f(int n) {
        String decimal = Integer.toString(n);
        StringBuilder sb = new StringBuilder();
        char[] buf = new char[64];
        for (int i = 64; i >= 0; i--) {
            int val = decimal.charAt(i) - '0';
            if (val > 0) {
                sb.append(val % 2);
            }
            else {
                sb.append(val / 2);
            }
        }
        return sb.toString();
    }

    
    public static String decimalToBinary_Problem_0_1c4f310e_ae6e_434a_b6bf_ad0dee7178e6(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_1_78c7c6a0_3ff2_44de_b46d_a2f7dba6eb1e(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_0_f74b18bb_36a0_4237_8296_b1d3046a61a9(int n) {
        return String.format("%8s", Integer.toBinaryString(n)).replace(' ', '0');
    }

    
    public static String decimalToBinary_Problem_2_e58c75a0_0c79_48e6_884a_cb070054779e(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_1_3d3cc978_02bb_46b5_8612_dcc9284ebc8d(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_0_da853ef1_0864_43cc_b4d9_0d6abda5484b(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_0_64b78e19_92f8_43c3_925f_ed0867579f32(int n) {
        StringBuilder sb = new StringBuilder();
        while(n > 0) {
            sb.append(n % 2);
            n = n / 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_2_dac8d9a4_1963_4f8c_89c2_eb03a174d17f(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_1_32ab712e_a533_4174_9f6e_776633d32394(int n) {
        StringBuilder sb = new StringBuilder();
        while(n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_0_018c72a6_50d6_40f2_a948_74e108cc5a4c(int n) {
        BigInteger num = new BigInteger(Integer.toString(n));
        return num.toString(2);
    }

    
    public static String decimalToBinary_Problem_1_0f4c3a7d_2883_4fd9_8f44_e03a41fd8159(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_2_106ccc6a_6eaa_420d_9cc0_747c28741363(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_1_745219a1_c03e_46c8_b2ef_d01064b23624(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_1_f1345cc0_72e1_4c22_adc4_f9787e4d01bf(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_1_7340c7ff_82f6_4b5b_9fda_d2e99061ea10(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

    
    public static String decimalToBinary_Problem_0_3e0ac21a_dd0b_4002_87a2_1a77eeeee888(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

}
