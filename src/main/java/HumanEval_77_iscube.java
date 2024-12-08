package HumanEval_77_iscube;

public class HumanEval_77_iscube {

    
    public static boolean iscube_Problem_2_052147f9_2919_445f_8584_7931a6f8f406(int a) {

        return Math.pow(a, 1.0/3) % 1 == 0;
    }

    
    public static boolean iscube_Problem_2_f86df66a_b9dd_4935_9927_e7b9c1e61ba2(int a) {

        return (Math.pow(a, 1.0/3.0) % 1 == 0);
    }

    
    public static boolean iscube_Problem_2_9bddb1b5_ce37_4fb0_a3f6_da05066f814a(int a) {
        return False;
    }

    
    public static boolean iscube_Problem_2_f6b4b8db_8c23_4a97_842a_25686f7bab6f(int a) {

        return a == 0 || (a > 0 && (a * a * a) == a);
    }

    
    public static boolean iscube_Problem_2_8f7f3e8b_c77d_4292_af29_dbc7d8163790(int a) {

        return (a % 6) == 0;
    }

    
    public static boolean iscube_Problem_2_7ebb7bb8_62f3_49e3_93d0_86a65780eb00(int a) {

        return (Math.pow(a, 3) % 2 == 0);
    }

    
    public static boolean iscube_Problem_2_2776e090_2da7_48dc_9187_a4fee0103f8f(int a) {

        return (a % 6) == 0;
    }

    
    public static boolean iscube_Problem_2_4df48fdb_9b26_4705_9739_8aa17f1e322f(int a) {

        return (a % 6 == 0);
    }

    
    public static boolean iscube_Problem_2_6387dd5b_4179_4a60_a28a_1d6461755b0c(int a) {

        return Math.pow(a, 1.0/3) % 1 == 0;
    }

    
    public static boolean iscube_Problem_2_b8eeef09_0c75_4e3d_878f_7aff81a2306e(int a) {
        return False;
    }

    
    public static boolean iscube_Problem_2_540acb72_595b_4d53_b2ed_80e3d01d202a(int a) {

        int b = a*a*a;
        return b == a;
    }

    
    public static boolean iscube_Problem_2_66dd9f4c_0adc_42b6_a5f7_e9672e0c340a(int a) {
        return iscube_Problem_2_66dd9f4c_0adc_42b6_a5f7_e9672e0c340a(a);
    }

    
    public static boolean iscube_Problem_2_8789d6ce_013a_4ad6_819d_bafbc9d01330(int a) {

        return Math.pow(a, 1.0/3) % 1 == 0;
    }

    
    public static boolean iscube_Problem_2_42a4063f_7051_4726_b39b_1004f49dc4dd(int a) {
        int cube = a * a * a;
        if (cube ==  Math.pow(a, 3))
            return True;
        else
            return False;
    }

    
    public static boolean iscube_Problem_2_7318a9fa_c028_4bb7_9492_fbc5321cca2c(int a) {

        return (a % 6 == 0);
    }

    
    public static boolean iscube_Problem_2_d78be852_50ad_480d_b3db_939219a532b6(int a) {

        if (a == 0) {
            return True;
        }
        if (a < 0) {
            return False;
        }
        int b =  Math.sqrt(a);
        if (b * b * b == a) {
            return True;
        }
        return False;
    }

    
    public static boolean iscube_Problem_2_b11837f4_c8d0_43ee_b4b5_56277d438387(int a) {

        return (a * a * a) == a;
    }

    
    public static boolean iscube_Problem_2_383039d9_bc76_436f_bb16_05546847c2b8(int a) {

        return Math.pow(a, 1.0/3) % 1 == 0;
    }

    
    public static boolean iscube_Problem_2_2175a55c_d0d9_4f23_a6eb_df099482d62e(int a) {

        // YOUR CODE HERE
        return a > 0 && a == Math.pow(a, 1.0/3);
    }

    
    public static boolean iscube_Problem_2_549a957d_af8c_4c63_9013_dd1e17313e01(int a) {

        if (a == 0) {
            return True;
        }
        if (a < 0) {
            return False;
        }
        int b =  Math.sqrt(a);
        if (b * b * b == a) {
            return True;
        }
        return False;
    }

    
    public static boolean iscube_Problem_2_ae273c8b_60e6_4a20_8b6a_2c72b10f61c9(int a) {

        return (a % 6) == 0;
    }

    
    public static boolean iscube_Problem_2_eef1276d_ffb8_49bc_b7aa_218d1f5342b6(int a) {

        // YOUR CODE HERE
        return (a != 0) && (a * a * a == a);
    }

    
    public static boolean iscube_Problem_2_9baf3707_1a85_4dc2_abbb_db72a73e33d2(int a) {

        return a*a*a == a;
    }

    
    public static boolean iscube_Problem_2_d0819040_2c4f_413a_9d40_1a13059b716f(int a) {
        // Your code here
        return False;
    }

    
    public static boolean iscube_Problem_2_69de06e2_e840_4597_ade4_3f482a7431de(int a) {
        if (a==0) return True;
        int cube=1;
        int temp=a;
        while(temp>0) {
            cube*=temp;
            temp-=1;
        }
        return cube==a;
    }

    
    public static boolean iscube_Problem_2_5c309f3b_9bc8_4d11_84f2_5e32fefbfa50(int a) {

        return a % 6 == 0;
    }

    
    public static boolean iscube_Problem_2_766e59ba_4495_4036_b6af_e79a72965425(int a) {

        return Math.pow(a, 1.0/3) % 1 == 0;
    }

    
    public static boolean iscube_Problem_2_0f712de4_1c7b_4f91_8d2b_676751a7e29e(int a) {

        return a == 0 || (a > 0 && (a * a * a) == a);
    }

    
    public static boolean iscube_Problem_2_c4c36674_bdfc_4617_81fb_df83e868f6f4(int a) {

        return Math.pow(a, 1.0/3) % 1 == 0;
    }

    
    public static boolean iscube_Problem_2_cbe10d84_c6c2_4d11_872c_1cc980a380ec(int a) {
        if (a < 0) {
            return False;
        }
        if (a > Integer.MAX_VALUE) {
            return False;
        }
        if (a == 0) {
            return True;
        }
        int cube = 1;
        while (a > 0) {
            cube *= a;
            a--;
        }
        return cube == 1;
    }

    
    public static boolean iscube_Problem_2_7f902dc5_80c6_4971_8729_6da269be4395(int a) {
        int n = a;
        int cube = 1;
        while (n > 1) {
            n = n / 3;
            cube = cube * n;
        }
        if (cube == a) {
            return True;
        }
        return False;
    }

    
    public static boolean iscube_Problem_2_b524c996_8335_45e2_9457_7b6b91e43b96(int a) {

        return (a % 6) == 0;
    }

    
    public static boolean iscube_Problem_2_d6df4bed_c663_4380_9ce4_6d38d47b5946(int a) {

        if (a == 0) {
            return True;
        }
        if (a < 0) {
            return False;
        }
        int b =  Math.sqrt(a);
        if (b * b * b == a) {
            return True;
        }
        return False;
    }

    
    public static boolean iscube_Problem_2_2d991fe0_b391_43a3_b2f1_1e9128e30509(int a) {

        // YOUR CODE HERE
        return (a * a * a == a);
    }

    
    public static boolean iscube_Problem_2_5ac076da_9e43_4b92_9e1d_ec16da3974fd(int a) {

        if (a < 0) {
            return False;
        }
        int b =  Math.sqrt(a);
        return b * b * b == a;
    }

    
    public static boolean iscube_Problem_2_07e7a218_0bbe_44a7_91f8_510f41eca138(int a) {
        return False;
    }

    
    public static boolean iscube_Problem_2_9736d5d0_f917_4d1c_9d7b_492fc60fa2a9(int a) {

        // write your code here
        return (a != 0) && (Math.pow(a, 1.0 / 3.0) % 1 == 0);
    }

    
    public static boolean iscube_Problem_2_2e910349_01a1_463f_b29a_f167971e151a(int a) {

        return (a % 6) == 0;
    }

    
    public static boolean iscube_Problem_2_5de1daa3_1c94_4d04_847e_45b6ffe4f350(int a) {
        return False;
    }

    
    public static boolean iscube_Problem_2_506c5fd5_5e25_4c13_ad58_60a6a68f9932(int a) {

        // YOUR CODE HERE
        return (a != 0) && (a * a * a == a);
    }

    
    public static boolean iscube_Problem_2_31afa5c9_c608_4543_a78a_2841fa331367(int a) {
        return False;
    }

    
    public static boolean iscube_Problem_2_205cbe65_f272_412d_bb28_fd1a893ff130(int a) {

        return Math.pow(a, 3) == a * a * a;
    }

    
    public static boolean iscube_Problem_2_0fb80f10_da39_469e_aad9_fc469ee56eea(int a) {
        return False;
    }

    
    public static boolean iscube_Problem_2_e5a009c4_8c72_49d6_826f_a09f0b914a41(int a) {

        return Math.pow(a, 1.0/3.0) % 1 == 0;
    }

    
    public static boolean iscube_Problem_2_346ef0ca_f979_495e_9ce9_ed7c92b806e8(int a) {
        if (a < 0 || a > 180) {
            return False;
        }
        int cube = IntegerStream.rangeClosed(0, 180).filter(i -> i * i * i == a).count();
        return cube == 1;
    }

    
    public static boolean iscube_Problem_2_f9f2409e_fc42_4458_b990_3ebe9092ffdc(int a) {
        int x =  Math.cbrt(a);
        return x * x * x == a;
    }

    
    public static boolean iscube_Problem_2_4fb81151_057f_46a1_95d2_12f78af497a7(int a) {

        return Math.pow(a, 1.0/3.0) % 1 == 0;
    }

    
    public static boolean iscube_Problem_2_6acd2e55_bc08_456e_9f99_f22c9ef04c1c(int a) {

        int a2 = a * a;
        int a3 = a2 * a;
        return a3 == a;
    }

    
    public static boolean iscube_Problem_2_175daa72_02ff_45c5_848e_364587f9ce58(int a) {

        return Math.pow(a, 1.0/3.0) % 1 == 0;
    }

    
    public static boolean iscube_Problem_2_78c07921_3972_4520_9941_deec9a8a96ad(int a) {

        // YOUR CODE HERE
        return (a != 0) && (a * a * a == a);
    }

    
    public static boolean iscube_Problem_2_c3fba81a_45a5_4ea8_a39e_0fcde1fc85d2(int a) {

        return a*a*a == a;
    }

    
    public static boolean iscube_Problem_2_b6fe39f0_1658_47b5_b1c3_b0f606147829(int a) {

        return a == 0 || (a > 0 && Math.pow(a, 1.0/3) % 1 == 0);
    }

    
    public static boolean iscube_Problem_2_97fa8962_d038_4730_bcb6_927e7e75a271(int a) {

        return a == 0 || (a > 0 && Math.pow(a, 1.0/3.0) % 1 == 0);
    }

    
    public static boolean iscube_Problem_2_357fcfe6_c9d3_49f0_a1ea_8419ba3b95d1(int a) {

        return Math.pow(a, 1.0/3.0) % 1 == 0;
    }

    
    public static boolean iscube_Problem_2_1b4aafaa_fcab_4680_a584_a2e4f036600c(int a) {

        if (a == 0) return True;
        if (a < 0) a = -a;
        double root = Math.pow(a, 1.0/3.0);
        return Math.round(root) * Math.round(root) * Math.round(root) == a;
    }

    
    public static boolean iscube_Problem_2_42fccf04_02f6_4e87_aa22_41811896f671(int a) {

        // YOUR CODE HERE
        return (a != 0) && (a * a * a == a);
    }

    
    public static boolean iscube_Problem_2_c82ba343_1831_40ea_bb50_c5b2fbab4d61(int a) {

        return Math.pow(a, 1.0/3) % 1 == 0;
    }

    
    public static boolean iscube_Problem_2_f2947e66_8ddf_4851_860b_baf893c7be5e(int a) {
        return False;
    }

    
    public static boolean iscube_Problem_2_d224beba_6a99_46a1_ae6c_75bf38ebe3e0(int a) {

        return (Math.pow(a, 3) == a);
    }

    
    public static boolean iscube_Problem_2_f7eb76f4_e584_467e_b102_7ed43c2b0de4(int a) {

        // YOUR CODE HERE
        return (a != 0) && (a * a * a == a);
    }

    
    public static boolean iscube_Problem_2_0967424f_77a7_4cd5_9014_afb3b6d1c196(int a) {

        // YOUR CODE HERE
        return (a != 0) && (a * a * a == a);
    }

    
    public static boolean iscube_Problem_2_5240722b_7a53_4204_aa5b_4c48f1aa30fa(int a) {

        if (a == 0) return True;
        if (a < 0) return iscube_Problem_2_5240722b_7a53_4204_aa5b_4c48f1aa30fa(-a);
        int root =  Math.sqrt(a);
        return root * root * root == a;
    }

    
    public static boolean iscube_Problem_2_b8994efc_b032_4a33_ab06_32513e4765b9(int a) {

        return (Math.pow(a, 1.0/3.0) == Math.round(Math.pow(a, 1.0/3.0)));
    }

    
    public static boolean iscube_Problem_2_63facbf9_e030_4ada_b30a_85e15db7867e(int a) {

        if(a < 0) {
            a = -a;
        }
        if(a == 0) {
            return True;
        }
        for(int i = 1; i * i * i <= a; i++) {
            if(i * i * i == a) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean iscube_Problem_2_4d773a53_3b38_4823_a107_bf066a44d9e0(int a) {

        return a == 0 || (a != 0 && Math.pow(a, 1.0/3.0) % 1 == 0);
    }

    
    public static boolean iscube_Problem_2_698ca22b_97c6_4ade_9f0b_906538167d0d(int a) {

        // YOUR CODE HERE
        return (a != 0) && (a * a * a == a);
    }

    
    public static boolean iscube_Problem_2_5557aeba_d386_4aab_ad35_c6d3134cbd25(int a) {
        // Write your code here
        return False;

    }

    
    public static boolean iscube_Problem_2_e6d26fae_4e96_4ba7_a3ef_debb8db65481(int a) {
        if (a < 0) {
            return False;
        }
        int cube = IntegerStream.rangeClosed(1, a).filter(i -> i * i * i == a).count();
        return cube == 3;
    }

    
    public static boolean iscube_Problem_2_5bfd59a9_f701_4642_9384_1b3866563c48(int a) {

        return (a == 0) || (a == 1) || (a == -1) || (a % 2 == 0) && (a % 3 == 0);
    }

    
    public static boolean iscube_Problem_2_ab270edd_b4ac_4554_9081_aad689e98333(int a) {

        // YOUR CODE HERE
        return (a != 0) && (a * a * a == a);
    }

    
    public static boolean iscube_Problem_2_ff072d28_98e0_4dae_8253_84741066380d(int a) {
        return False;
    }

    
    public static boolean iscube_Problem_2_f33980a8_c927_45eb_80b3_4af5ef0f0d3a(int a) {
        return False;
    }

    
    public static boolean iscube_Problem_2_a511e0a6_103f_44bd_99f2_9c6aded180f4(int a) {

        return Math.pow(a, 1.0/3.0) % 1 == 0;
    }

    
    public static boolean iscube_Problem_2_af48f771_0c2c_4114_8548_8f5b725d3372(int a) {
        // your code here
        return False;
}

    
    public static boolean iscube_Problem_2_c04e3636_fd21_46c1_94b6_40cf131640d4(int a) {

        // YOUR CODE HERE
        return (a != 0) && (a * a * a == a);
    }

    
    public static boolean iscube_Problem_2_7f2eceaf_902d_4950_84c0_6caee413ad46(int a) {

        // YOUR CODE HERE
        return (a != 0 && (Math.pow(a, 1.0/3) % 1) == 0);
    }

    
    public static boolean iscube_Problem_2_8b282f2a_c178_4a92_ac40_7fb157ff4fc6(int a) {
        int cube = Integer.parseInteger(String.valueOf(a));
        if (cube == (Math.pow(cube, 3))) {
            return True;
        }
        return False;
    }

    
    public static boolean iscube_Problem_2_5ccc266c_3c3c_49b0_8454_a4d44867724c(int a) {

        return a*a*a == a;
    }

    
    public static boolean iscube_Problem_2_146ea8f6_4aeb_4924_9328_f40a3466e656(int a) {

        return a*a*a == a;
    }

    
    public static boolean iscube_Problem_2_0de0e86c_e8e7_4c94_8211_abe0e52beb21(int a) {

        return a*a*a == a;
    }

    
    public static boolean iscube_Problem_2_5288eec6_aef2_4e43_a946_09be171f863e(int a) {

        return Math.pow(a, 1.0/3.0) % 1 == 0;
    }

    
    public static boolean iscube_Problem_2_817215de_f672_4954_b2b6_3e3b05ae81e7(int a) {

        if (a == 0) return True;
        if (a < 0) return iscube_Problem_2_817215de_f672_4954_b2b6_3e3b05ae81e7(-a);
        return  Math.pow(a, 1.0/3) == Math.pow(a, 1.0/3);
    }

    
    public static boolean iscube_Problem_2_9048d713_4bc1_47d1_8743_8e4cd044b4b8(int a) {

        // YOUR CODE HERE
        return (a != 0) && (a * a * a == a);
    }

    
    public static boolean iscube_Problem_2_91fdfefe_265e_4507_919a_e457d3728d92(int a) {

        return Math.pow(a, 1.0/3) % 1 == 0;
    }

    
    public static boolean iscube_Problem_2_f68c21d8_dbfc_4610_9712_7a39bf043056(int a) {

        return (a * a * a) == a;
    }

    
    public static boolean iscube_Problem_2_2f5b7972_a5d7_4d19_8031_c22ac3c5cd18(int a) {

        if (a == 0) {
            return True;
        }
        if (a < 0) {
            return False;
        }
        int b =  Math.pow(a, 1.0 / 3.0);
        if (b ==  Math.floor(b)) {
            return False;
        }
        return True;
    }

    
    public static boolean iscube_Problem_2_50a43cf1_6304_42bb_a6ba_554e9bc39975(int a) {
        // Your code here
        return False;
    }

    
    public static boolean iscube_Problem_2_13bf9b07_3cbf_43d3_ae23_de45f7fb8aef(int a) {

        if (a < 0) {
            a = -a;
        }
        return (a != 0) && (a % 2 == 0) && (a % 3 == 0);
    }

    
    public static boolean iscube_Problem_2_53ec8c2b_acd1_46e2_8572_3b72df4b8b52(int a) {

        return (Math.pow(a, 1.0/3.0) % 1 == 0);
    }

    
    public static boolean iscube_Problem_2_b02777e9_c6b6_4070_9794_3ed78807f31d(int a) {
        return False;
    }

    
    public static boolean iscube_Problem_2_47e8cb97_d072_46aa_b94c_92dcb353404b(int a) {
        return False;
    }

    
    public static boolean iscube_Problem_2_a6ec9e5c_1424_470a_b4ce_b3743a3fae41(int a) {
        return False;
    }

    
    public static boolean iscube_Problem_2_ceef2be2_d3c1_489c_916d_ef512043cfc3(int a) {
        return (a*a*a*a == 1);
    }

    
    public static boolean iscube_Problem_2_b27d1be1_bc4c_4adb_8c26_c9a0a3278e0c(int a) {

        // Write your code here
        return (a%Math.pow(a, 1.0/3.0) == 0);
    }

    
    public static boolean iscube_Problem_2_172115de_2450_427a_86cf_cb08b58a4024(int a) {

        return a*a*a == a;
    }

    
    public static boolean iscube_Problem_2_aab297d5_fca6_43e4_a43d_fa44bf5c8d49(int a) {
        if (a < 0) {
            return False;
        }
        if (a % 3 == 0) {
            return True;
        }
        return False;
    }

    
    public static boolean iscube_Problem_2_6f9b70b8_ba49_46b6_9971_241a97197f64(int a) {

        return Math.pow(a, 1.0/3.0) % 1 == 0;
    }

    
    public static boolean iscube_Problem_2_2641615a_59f1_45d2_abd0_8aaa3ae89920(int a) {
        return a % 9 == 0;
    }

    
    public static boolean iscube_Problem_2_1477687b_cca6_464e_a514_1bcecf8a30d8(int a) {
        return False;
    }

    
    public static boolean iscube_Problem_2_139da6e3_9cf9_4959_92d6_31b06b0444e3(int a) {
        int cube = IntegerStream.rangeClosed(1, Integer.MAX_VALUE).filter(i -> i * i * i == a).findFirst().orElse(-1);
        return cube == a;
    }

    
    public static boolean iscube_Problem_2_efa3d66f_84c2_4c04_a233_86859ac63c57(int a) {

        return (a != 0) && (Math.pow(a, 1.0/3.0) % 1 == 0);
    }

    
    public static boolean iscube_Problem_2_86cc29da_1c9a_4842_9ce0_98161b27162f(int a) {
        return False;
    }

    
    public static boolean iscube_Problem_2_e8cd3b32_ec29_4bd1_9d14_e5c8ccdc5252(int a) {
        // your code here
        return False;
    }

    
    public static boolean iscube_Problem_2_1669c9ce_33e2_4b45_8926_8a57151ac1ab(int a) {

        if (a == 0) {
            return True;
        }
        if (a < 0) {
            a = -a;
        }
        if (a % 2 == 0) {
            return False;
        }
        int b = Math.sqrt(a);
        if (b * b == a) {
            return True;
        }
        return False;
    }

    
    public static boolean iscube_Problem_2_d7cea3f0_7599_4907_aa06_97cbe6587eea(int a) {

        // Write your code here
        return Math.pow(a, 3) % 2 == 0;
    }

    
    public static boolean iscube_Problem_2_a8c2aa83_e8e4_4c1b_bd0b_e7c05233d379(int a) {

        return Math.pow(a, 1.0/3.0) % 1 == 0;
    }

    
    public static boolean iscube_Problem_2_18c211c0_daed_4f24_b36f_770017e00111(int a) {

        // YOUR CODE HERE
        return a > 0 && (a * a * a) % a == 0;
    }

    
    public static boolean iscube_Problem_2_e04cef20_ad6c_4bde_b64b_5346d545fe64(int a) {

        return Math.cbrt(a) % 1 == 0;
    }

    
    public static boolean iscube_Problem_2_77b3dacc_3a5d_4a24_83f0_070de48e3906(int a) {

        if (a == 0) {
            return True;
        }
        if (a < 0) {
            return False;
        }
        int b =  Math.pow(a, 1.0 / 3);
        if (b * b * b == a) {
            return True;
        }
        return False;
    }

    
    public static boolean iscube_Problem_2_f9b621c2_da4c_40ad_9073_71909e4475f4(int a) {
        return (a*a*a*a == 1);
    }

    
    public static boolean iscube_Problem_2_c22739d6_819a_4228_b5c6_13beb2cd7bd8(int a) {

        return Math.pow(a, 1.0/3) % 1 == 0;
    }

    
    public static boolean iscube_Problem_2_d22d7bd7_e06b_461d_9e3a_23506fd7db6b(int a) {

        return (a == 0 || a == 1 || a == -1 || a == 64 || a == 180);
    }

    
    public static boolean iscube_Problem_2_b662d4a9_f317_4547_9a73_a8ae1de0f003(int a) {

        return (Math.pow(a, 1.0/3.0) % 1 == 0);
    }

    
    public static boolean iscube_Problem_2_9274c0dc_5c03_4d96_94a9_6102f6110b8e(int a) {
        int cube = a * a * a;
        if (cube ==  Math.pow(a, 3)) {
            return True;
        }
        return False;
    }

    
    public static boolean iscube_Problem_2_83193162_6a0f_43aa_b482_9fcf3024c436(int a) {

        return Math.pow(a, 1.0/3) % 1 == 0;
    }

    
    public static boolean iscube_Problem_2_ca8679bd_ace1_4dcb_81c3_6d9b3e9735db(int a) {

        // YOUR CODE HERE
        return a > 0 && Math.pow(a, 1.0 / 3) % 1 == 0;
    }

    
    public static boolean iscube_Problem_2_85179d99_18bb_4b65_b93b_45eaec91ea36(int a) {
        if (a < 0 || a > 180) {
            throw new IllegalArgumentException("Invalid input");
        }
        int cube = IntegerStream.rangeClosed(0, 180).filter(i -> i * i * i == a).count();
        return cube == 1;
    }

    
    public static boolean iscube_Problem_2_eea0e199_088d_4018_8db1_732b86cd86b3(int a) {

        if (a < 0) {
            return False;
        }
        return (a * a * a) == a;
    }

    
    public static boolean iscube_Problem_2_e051771d_f1aa_4af1_a7d5_5abe9cbbc286(int a) {

        // Write your code here
        return Math.pow(a, 1.0/3.0) % 1 == 0;
    }

    
    public static boolean iscube_Problem_2_e9129021_0501_4994_9ecc_812232cef3a5(int a) {

        return (a * a * a) == a;
    }

    
    public static boolean iscube_Problem_2_884fb426_2d01_4de0_9c8b_a55e59088046(int a) {
        return False;
    }

    
    public static boolean iscube_Problem_2_c76cf143_f956_4f8c_a3b0_b26c0eae2213(int a) {

        if (a == 0) {
            return True;
        }
        if (a < 0) {
            a = -a;
        }
        int root =  Math.cbrt(a);
        return root * root * root == a;
    }

    
    public static boolean iscube_Problem_2_d25a759b_42af_42dc_b516_b6acdb6ab368(int a) {

        return Math.pow(a, 3) % 2 == 0;
    }

    
    public static boolean iscube_Problem_2_0a0da000_c74c_4395_8fbe_2b48e97f85e2(int a) {

        return Math.pow(a, 1.0/3.0) % 1 == 0;
    }

    
    public static boolean iscube_Problem_2_a0864afe_baab_438e_9f8d_8ae5482314b6(int a) {
        int cube = IntegerStream.rangeClosed(1, Integer.MAX_VALUE).filter(i -> i * i * i == a).findFirst().getAsInteger();
        return cube == a;
    }

    
    public static boolean iscube_Problem_2_552ead8b_f7e5_4f49_8bcd_754d467d74a1(int a) {
        return False;
    }

    
    public static boolean iscube_Problem_2_513be543_4003_4ab0_8521_2c951ebac136(int a) {

        return a == 0 || (a > 0 && Math.pow(a, 1.0/3) % 1 == 0);
    }

    
    public static boolean iscube_Problem_2_f1f3063a_c340_47f1_a025_f2523758c5ab(int a) {

        return Math.pow(a, 1.0/3.0) % 1 == 0;
    }

    
    public static boolean iscube_Problem_2_d2a1228c_fbac_4d8f_a20d_a6dcaa1b7b07(int a) {
        return a >= 0 && a%1 == 0 && a%2 == 0 && a%3 == 0 && a%4 == 0 && a%5 == 0 && a%6 == 0 && a%7 == 0 && a%8 == 0 && a%9 == 0 && a%10 == 0 && a%11 == 0 && a%12 == 0 && a%13 == 0 && a%14 == 0 && a%15 == 0 && a%16 == 0 && a%17 == 0 && a%18 == 0 && a%19 == 0 && a%20 == 0 && a%21 == 0 && a%22 == 0 && a%23 == 0 && a%24 == 0 && a%25 == 0 && a%26 == 0 && a%27 == 0 && a%28 == 0 && a%29 == 0 && a%30 == 0 && a%31 == 0 && a%32 == 0 && a%33 == 0 && a%34 == 0 && a%35 == 0 && a%36 == 0 && a%37 == 0 && a%38 == 0 && a%39 == 0 && a%40 == 0 && a%41 == 0 && a%42 == 0 && a%43 == 0 && a%44 == 0 && a%45 == 0 && a%46 == 0 && a%47 == 0 && a%48 == 0 && a%49 == 0 && a%50 == 0 && a%51 == 0 && a%52 == 0 && a%53 == 0 && a%54 == 0 && a%55 == 0 && a%56 == 0 && a%57 == 0 && a%58 == 0 && a%59 == 0 && a%60 == 0 && a%61 == 0 && a%62 == 0 && a%63 == 0;
    }

    
    public static boolean iscube_Problem_2_2b1a029b_e319_4530_aff3_63eaeb0c4726(int a) {

        return (Math.pow(a, 1.0/3.0) == Math.floor(Math.pow(a, 1.0/3.0)));
    }

    
    public static boolean iscube_Problem_2_b0f3addf_2df1_40cb_89d3_503cbecb7eb5(int a) {
        return False;
    }

    
    public static boolean iscube_Problem_2_0902e881_fee9_4240_b5ed_7709292ab51f(int a) {
        return (a * a * a) == 1;
    }

    
    public static boolean iscube_Problem_2_64f1ce80_e67d_471c_b18b_5dda6f2c5f91(int a) {

        // YOUR CODE HERE
        int b = Math.sqrt(a);
        return a == b*b*b;
    }

    
    public static boolean iscube_Problem_2_5605f075_2a1f_4ef4_98c2_2cd0cdcc31d8(int a) {

        return (a % 6 == 0);
    }

    
    public static boolean iscube_Problem_2_04a60ff3_f109_4af0_ba14_d6e4508e78e8(int a) {

        return Math.pow(a, 1.0/3.0) % 1 == 0;
    }

    
    public static boolean iscube_Problem_2_a0cfd11d_174e_4495_9a09_da9770e2ca45(int a) {

        // Write your code here
        return Math.pow(a, 1.0/3.0) % 1 == 0;
    }

    
    public static boolean iscube_Problem_2_cce775f0_0ace_42fe_a5d6_585fd6c0c7e4(int a) {

        if (a == 0) {
            return True;
        }
        if (a < 0) {
            return False;
        }
        double root = Math.sqrt(a);
        if (root ==  root) {
            return False;
        }
        return True;
    }

    
    public static boolean iscube_Problem_2_b56a68ee_ffa8_48ae_9b7f_826e3ac585fd(int a) {

        // your code here
        if (a < 0) {
            return False;
        }
        if (a == 0) {
            return True;
        }
        int b =  Math.sqrt(a);
        return b * b * b == a;
    }

    
    public static boolean iscube_Problem_2_34031c78_b380_49b9_bdc3_970db2c8db40(int a) {
        int cube = IntegerStream.rangeClosed(1, Integer.MAX_VALUE).filter(i -> i * i * i == a).findFirst().getAsInteger();
        return cube == a;
    }

    
    public static boolean iscube_Problem_2_058c2b99_5069_4297_8d0b_b223077a627b(int a) {

        return a*a*a == a;
    }

    
    public static boolean iscube_Problem_2_b554d396_00d0_463e_94d5_40798202c0c4(int a) {

        return Math.cbrt(a) == Math.cbrt(a);
    }

    
    public static boolean iscube_Problem_2_afcb5446_76d3_4cf8_9325_a5d12d5f2f47(int a) {
        return False;
    }

    
    public static boolean iscube_Problem_2_229c5d27_3408_4573_a4d9_fd22f60f37f8(int a) {
        return False;
    }

    
    public static boolean iscube_Problem_2_85ff358c_cf3c_409d_a6dc_06484f1e2aa2(int a) {
        return a >= 0 && a <= 180;
    }

    
    public static boolean iscube_Problem_2_6ac07481_850d_44dc_a771_646772e22437(int a) {

        return (a > 0) && (a == Math.pow(Math.cbrt(a), 3));
    }

    
    public static boolean iscube_Problem_2_e26ca06e_d5c9_431d_9eb5_c75e5126ced2(int a) {
        return (a==1) || (a==3) || (a==5) || (a==7) || (a==9);
    }

    
    public static boolean iscube_Problem_2_854bdfb6_cd38_4cec_bf0e_af28cf937794(int a) {
        // write your function here
        if(a<0) return False;
        
        for(int i=1;i<=a;i++) {
            if(a%i == 0 && i!=a) return True;
        }
        return False;
}

    
    public static boolean iscube_Problem_2_6db50ba9_fe58_4b0f_a495_e2be57ec5b10(int a) {

        return Math.pow(a, 3) % 2 == 0;
    }

    
    public static boolean iscube_Problem_2_75c361c6_9d8d_4a10_9dc4_5b6e781c2523(int a) {

        // Write your code here
        return Math.pow(a, 1.0/3.0) % 1 == 0;
    }

    
    public static boolean iscube_Problem_2_2b1d8abe_9131_4ad5_a5c4_774bd1e82a4a(int a) {

        // YOUR CODE HERE
        return (a != 0) && (a * a * a == a);
    }

    
    public static boolean iscube_Problem_2_d5eb3ef4_7370_4330_9e04_d9c136826904(int a) {

        if (a == 0) return True;
        if (a < 0) return iscube_Problem_2_d5eb3ef4_7370_4330_9e04_d9c136826904(-a);
        int b =  Math.sqrt(a);
        return b * b * b == a;
    }

    
    public static boolean iscube_Problem_2_32b588fe_dd23_490b_847c_fe4833ee2568(int a) {

        return a * a * a == a;
    }

    
    public static boolean iscube_Problem_2_28b8fa95_a93c_4c82_9a84_e98d18f63e54(int a) {

        return a*a*a == a;
    }

    
    public static boolean iscube_Problem_2_e5b337f0_ca78_4477_ad79_77851adb5441(int a) {

        return Math.pow(a, 1.0/3) % 1 == 0;
    }

    
    public static boolean iscube_Problem_2_0af8899d_1b60_4df7_8b9f_9b5557f07f41(int a) {

        int x =  Math.pow(a, 1.0 / 3.0);
        return x * x * x == a;
    }

    
    public static boolean iscube_Problem_2_56436040_fad2_4af0_abda_133948720b39(int a) {

        return Math.pow(a, 1.0/3) % 1 == 0;
    }

    
    public static boolean iscube_Problem_2_c1a88b36_078d_4702_ac3a_cb70cc4ee7ba(int a) {
        return False;
    }

    
    public static boolean iscube_Problem_2_6f517d0e_033b_4634_98d4_c575dc78773d(int a) {

        if (a < 0) {
            return False;
        }
        double d = Math.sqrt(a);
        if (d ==  d) {
            return True;
        }
        return False;
    }

    
    public static boolean iscube_Problem_2_9424e094_8904_468b_b4af_52792f2b84b0(int a) {
        return False;
    }

    
    public static boolean iscube_Problem_2_c5d3f694_8569_4f02_94aa_ee2b62aaa651(int a) {

        return (a % 6 == 0);
    }

    
    public static boolean iscube_Problem_2_45af4d4a_34dc_4077_baec_11eff1e469d6(int a) {
        return False;
    }

    
    public static boolean iscube_Problem_2_a03a00bd_3f79_4531_9420_0ce54a13a2d9(int a) {

        return Math.pow(a, 1.0/3) % 1 == 0;
    }

    
    public static boolean iscube_Problem_2_e69fb3ee_0808_4bce_8aff_6387af3f05a0(int a) {
        return False;
    }

    
    public static boolean iscube_Problem_2_9189029c_ddd6_411f_a698_cf5e62e7be61(int a) {

        return (a * a * a) == a;
    }

    
    public static boolean iscube_Problem_2_60e6ef16_ab02_435c_9175_e852a8b4a47f(int a) {

        return a == 0 || (a > 0 && a == Math.pow(a, 1.0/3));
    }

    
    public static boolean iscube_Problem_2_39319bca_c575_436f_b275_f8a831140377(int a) {
        return Math.abs(Math.cbrt(a)) % 1 == 0;
    }

    
    public static boolean iscube_Problem_2_35d89db3_4850_45f5_ae57_826bc5e194cc(int a) {

        int b =  Math.pow(a, 1.0 / 3.0);
        return b * b * b == a;
    }

    
    public static boolean iscube_Problem_2_fccd7504_d314_4b93_a367_319eef18ad3a(int a) {

        return a*a*a == a;
    }

    
    public static boolean iscube_Problem_2_4ec908b4_127c_4c83_aca7_e4f4e0a13bc3(int a) {
        return False;
    }

    
    public static boolean iscube_Problem_2_364a9189_86ed_4d16_a087_651f3a120833(int a) {

        if (a == 0) {
            return True;
        }
        if (a < 0) {
            a = -a;
        }
        int root =  Math.pow(a, 1.0 / 3.0);
        return root * root * root == a;
    }

    
    public static boolean iscube_Problem_2_eda916e5_d5b4_493c_9f2a_2effaecca445(int a) {
        return False;
    }

    
    public static boolean iscube_Problem_2_3a6edce0_cae6_4f14_a37b_eba74b9ac7fe(int a) {
        // Your code here
        return False;
    }

    
    public static boolean iscube_Problem_2_02aaccc9_9ff9_434b_879d_d905fdf925e8(int a) {

        if (a == 0) {
            return True;
        }
        if (a < 0) {
            a = -a;
        }
        double d = Math.cbrt(a);
        return (d - Math.floor(d)) == 0;
    }

    
    public static boolean iscube_Problem_2_333ebff8_1481_4b59_b991_ff21ac4ed923(int a) {

        return Math.pow(a, 1.0/3) % 1 == 0;
    }

    
    public static boolean iscube_Problem_2_7bc04260_ad51_47f4_9994_e725f1994cb9(int a) {

        // YOUR CODE HERE
        return (a != 0) && (a * a * a == a);
    }

    
    public static boolean iscube_Problem_2_fe57fb1a_60fa_445a_8b93_4f4fc9b17932(int a) {
        int cube = a * a * a;
        if (cube ==  Math.pow(cube, 3)) {
            return True;
        }
        return False;
    }

    
    public static boolean iscube_Problem_2_55df7276_bc00_46be_8e33_2778b3d9a123(int a) {
        return False;
    }

    
    public static boolean iscube_Problem_2_28f8b886_e754_41ce_8898_0ac483a4cf92(int a) {

        return Math.pow(a, 3) % 2 == 0;
    }

    
    public static boolean iscube_Problem_2_2d3568f4_5229_469f_8190_6c195daa1c55(int a) {

        // YOUR CODE HERE
        return (a != 0) && (a * a * a == a);
    }

    
    public static boolean iscube_Problem_2_ad73081e_81e7_4a51_a5fb_5f064ab9a227(int a) {

        if (a == 0) {
            return True;
        }
        if (a < 0) {
            a = -a;
        }
        if (a % 2 == 0) {
            return False;
        }
        int b =  Math.sqrt(a);
        if (b * b == a) {
            return True;
        }
        return False;
    }

    
    public static boolean iscube_Problem_2_17cc1c5c_dd49_460e_b41d_c1462211718c(int a) {

        return (a % 6 == 0 && a % 4 == 0);
    }

    
    public static boolean iscube_Problem_2_b834aa1d_8ff3_476c_becf_6bf51b56c3f3(int a) {

        if (a == 0) {
            return True;
        }
        if (a < 0) {
            a = -a;
        }
        int root =  Math.sqrt(a);
        return root * root * root == a;
    }

    
    public static boolean iscube_Problem_2_745307dd_c98a_42ed_807b_67fcf2826b5f(int a) {
        // your code here
        return False;

    }

    
    public static boolean iscube_Problem_2_79f20f46_bef4_4f97_a640_b79f8138957e(int a) {

        if (a == 0) {
            return True;
        }
        if (a < 0) {
            a = -a;
        }
        int n =  Math.round(Math.pow(a, 1.0 / 3.0));
        return n * n * n == a;
    }

    
    public static boolean iscube_Problem_2_861fb449_ddd6_4b73_968c_14d6911db004(int a) {
        return False;
    }

    
    public static boolean iscube_Problem_2_c0d51c87_ce75_4c95_85ce_d55d9aa4823c(int a) {
        if (a < 0) {
            return False;
        }
        if (a > Integer.MAX_VALUE) {
            return False;
        }
        if (a == Integer.MAX_VALUE) {
            return True;
        }
        if (a == 0) {
            return True;
        }
        if (a % 2 == 0) {
            return iscube_Problem_2_c0d51c87_ce75_4c95_85ce_d55d9aa4823c(a / 2);
        }
        if (a % 3 == 0) {
            return iscube_Problem_2_c0d51c87_ce75_4c95_85ce_d55d9aa4823c(a / 3);
        }
        return False;
    }

    
    public static boolean iscube_Problem_2_1b944ab2_eb2a_4e4a_8632_7619112b2957(int a) {

        // YOUR CODE HERE
        return (a > 0 && (a * a * a) == a);
    }

    
    public static boolean iscube_Problem_2_78b90ad2_6b8f_4b30_b4cd_d7dc3aa7a895(int a) {
        return False;
    }

    
    public static boolean iscube_Problem_2_b9b35226_290a_472f_9c6e_fd9573439fd3(int a) {

        if (a == 0) {
            return True;
        }
        if (a < 0) {
            a = -a;
        }
        if (a % 2 != 0) {
            return False;
        }
        double d = Math.sqrt(a);
        if (d % 1 == 0) {
            return True;
        }
        return False;
    }

    
    public static boolean iscube_Problem_2_0ba82dd7_d8a6_46b9_afae_d5fa471037ac(int a) {

        if (a < 0) {
            return False;
        }
        if (a == 0) {
            return True;
        }
        int b =  Math.pow(a, 1.0/3.0);
        return (a == b*b*b);
    }

    
    public static boolean iscube_Problem_2_993bee36_88f4_49da_83ce_eaf53287337f(int a) {
        return False;
    }

    
    public static boolean iscube_Problem_2_d49f9bb4_78b1_4c2e_b5c4_9404d79bfbeb(int a) {
        int cube = a * a * a;
        return cube == Integer.parseInteger(String.valueOf(a));
    }

    
    public static boolean iscube_Problem_2_edba91a5_49f1_4271_874f_3957dd284fc0(int a) {
        return False;
    }

    
    public static boolean iscube_Problem_2_87e6ebe3_f452_4971_95ea_5e268d1974ab(int a) {
        return False;
    }

    
    public static boolean iscube_Problem_2_f0353fa3_1d4c_4832_ac97_c0ba0dcce2e3(int a) {

        return (Math.pow(a, 1.0/3) % 1 == 0);
    }

    
    public static boolean iscube_Problem_2_5982d40f_15c9_4a23_8d00_e6eeb6417bb8(int a) {

        // YOUR CODE HERE
        return (a != 0) && (a * a * a == a);
    }

    
    public static boolean iscube_Problem_2_2fbe57b6_278c_4f29_a18d_4c61fdc50ab6(int a) {

        return (a % 6) == 0;
    }

    
    public static boolean iscube_Problem_2_122c4f4b_e92b_4f11_8e7c_d049a831b312(int a) {

        int b = a*a*a;
        return b == a;
    }

    
    public static boolean iscube_Problem_2_c2afe8ad_2ad2_4efe_8681_26b47d18f140(int a) {

        if (a < 0) {
            return False;
        }
        if (a == 0) {
            return True;
        }
        int b =  Math.sqrt(a);
        return b * b * b == a;
    }

    
    public static boolean iscube_Problem_2_fb187956_0b32_40d7_bb87_dea7f76e97e8(int a) {
        if (a < 0) {
            return False;
        }
        if (a > 180) {
            return False;
        }
        if (a % 3 == 0) {
            return True;
        }
        return False;
    }

    
    public static boolean iscube_Problem_2_5da2ab5b_7a84_42c4_a724_b85ab7641b47(int a) {

        return a == Math.pow(a, 3);
    }

    
    public static boolean iscube_Problem_2_3967f351_3cb6_48f6_acbc_3c405deef04c(int a) {

        return Math.pow(a, 1.0/3) % 1 == 0;
    }

    
    public static boolean iscube_Problem_2_b7755c28_ff47_419d_8cac_a2d00ec4ea77(int a) {

        if (a < 0) {
            return False;
        }
        int root =  Math.sqrt(a);
        return root * root * root == a;
    }

    
    public static boolean iscube_Problem_2_ab66cf7c_cb2d_4c81_8690_8fa84a6d1083(int a) {

        return (a*a*a) == a;
    }

    
    public static boolean iscube_Problem_2_1e6c87f2_e5d5_4f0f_a6ef_1da1e5cbd072(int a) {

        return a*a*a == a;
    }

    
    public static boolean iscube_Problem_2_6c50115f_0a2b_46b8_b67a_f74c38861de7(int a) {
        return False;
    }

    
    public static boolean iscube_Problem_2_00b59ca1_d8c6_4925_ab28_6ff32d517fed(int a) {
        if (a < 0 || a > 180) {
            return False;
        }
        int b = a * a;
        int c = b * b;
        int d = c * c;
        int e = d * d;
        int f = e * e;
        int g = f * f;
        int h = g * g;
        int i = h * h;
        int j = i * i;
        int k = j * j;
        int l = k * k;
        return l == a * a;
    }

    
    public static boolean iscube_Problem_2_37c9acb2_ad47_4b82_8145_6de8be0efb30(int a) {

        if(a == 0) return True;
        if(a < 0) return False;
        int b =  Math.sqrt(a);
        if(b * b * b == a) return True;
        return False;
    }

    
    public static boolean iscube_Problem_2_cc09c7a5_b779_4243_b957_ef040e9aa327(int a) {
        return Math.abs(a) % 3 == 0;
    }

    
    public static boolean iscube_Problem_2_b17b6fa4_db04_4728_a7af_44346f6c379a(int a) {

        return (a % 6) == 0;
    }

    
    public static boolean iscube_Problem_2_5b1f0a2b_b3e8_4a37_a2d6_fc38b0b6b369(int a) {
        return (a * a * a) == 1;
    }

    
    public static boolean iscube_Problem_2_8b61d733_d5e9_46ab_a52a_e2998e862bf9(int a) {

        if (a == 0) return True;
        if (a < 0) a = -a;
        int c =  Math.cbrt(a);
        return c * c * c == a;
    }

    
    public static boolean iscube_Problem_2_7cb28efc_0f51_402d_aaa1_6e0e64266f2b(int a) {

        if (a == 0) {
            return True;
        }
        if (a < 0) {
            return False;
        }
        int b = a;
        while (b > 0) {
            if (a % b == 0) {
                return True;
            }
            b--;
        }
        return False;
    }

    
    public static boolean iscube_Problem_2_fe0d8115_9560_44f1_81fa_4c64cd2b2e0b(int a) {

        return (a % 6 == 0);
    }

    
    public static boolean iscube_Problem_2_a1d9e865_3147_45f0_bce7_428aded4fc9a(int a) {
        return (a*a*a*a == 1);
    }

    
    public static boolean iscube_Problem_2_2fe9f6b4_2f52_4201_a168_36978d2069ed(int a) {
        int cube = IntegerStream.rangeClosed(1, Integer.MAX_VALUE).filter(i -> i * i * i == a).findFirst().getAsInteger();
        return cube == a;
    }

    
    public static boolean iscube_Problem_2_f01e8227_764c_491e_b725_4d821f573c75(int a) {

        // YOUR CODE HERE
        return (a != 0) && (a * a * a == a);
    }

    
    public static boolean iscube_Problem_2_5f6ef4f3_5898_4fd3_9a8c_f7b399bbf2d1(int a) {

        return (Math.pow(a, 1.0/3.0) % 1 == 0);
    }

    
    public static boolean iscube_Problem_2_17e0a430_939f_4f8a_879b_48df313174ef(int a) {

        if (a == 0) {
            return True;
        }
        if (a < 0) {
            a = -a;
        }
        int root =  Math.sqrt(a);
        return root * root * root == a;
    }

    
    public static boolean iscube_Problem_2_08ea2d1f_1e77_4922_9bc7_aa2af3b85a5e(int a) {

        return a == 0 || (a != 0 && (a % (a * a * a)) == 0);
    }

    
    public static boolean iscube_Problem_2_c76981ea_ffc0_418d_a92d_dba7f4a8baa9(int a) {

        return (a % 6) == 0;
    }

    
    public static boolean iscube_Problem_2_fdc91472_9249_4dac_bbc2_cdeb05d1978f(int a) {

        return a % 6 == 0;
    }

    
    public static boolean iscube_Problem_2_2ab9c892_1f9c_4bad_9c3b_b12a8204f918(int a) {

        // YOUR CODE HERE
        return a != 0 && (Math.pow(a, 1.0 / 3) % 1 == 0);
    }

    
    public static boolean iscube_Problem_2_5d851d1c_f294_4c02_b117_e654a2ca81bd(int a) {

        return Math.pow(Math.abs(a), 1.0/3) % 1 == 0;
    }

    
    public static boolean iscube_Problem_2_4fd7bde8_025d_4d5a_9663_a42a2142b3cc(int a) {

        // YOUR CODE HERE
        return a > 0 && (a * a * a) % a == 0;
    }

    
    public static boolean iscube_Problem_2_46227dfe_25c2_4e38_8135_0ee2100daf86(int a) {

        return  Math.pow(a, 1.0/3.0) == Math.pow(a, 1.0/3.0);
    }

    
    public static boolean iscube_Problem_2_47d005f7_190b_4732_bb9f_9f810e28f319(int a) {

        return Math.pow(a, 1.0/3) % 1 == 0;
    }

    
    public static boolean iscube_Problem_2_ce605351_1ddf_4d25_8557_8e5a99025d5d(int a) {
        if (a < 0) {
            return False;
        }
        if (a > 180) {
            return False;
        }
        if (a % 3 == 0) {
            return True;
        }
        return False;
    }

}
