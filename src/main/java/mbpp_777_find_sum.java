package mbpp_777_find_sum;

public class mbpp_777_find_sum {

    
    public static int findSum_Problem_0_0d864a29_2ad3_48c4_8063_91214169c8ed(ArrayList<Integer> arr) {
        int sum = 0;
        for (Integer i : arr) {
            if (!arr.contains(i)) {
                arr.add(i);
                sum += i;
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_2_c468f6f8_cffc_4aab_91e1_dd7528f1f23e(ArrayList<Integer> arr) {
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i+1; j < arr.size(); j++) {
                if(arr.get(i) == arr.get(j)) {
                    arr.remove(j);
                    j--;
                }
            }
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int findSum_Problem_2_f4e6ecce_8efa_431f_8dca_cabe7f887a72(ArrayList<Integer> arr) {
        return arr.stream().distinct().mapToInteger(Integer::intValue).sum();
    }

    
    public static int findSum_Problem_0_fcaa84f9_b2a1_4ab5_8f6c_e0b681a05414(ArrayList<Integer> arr) {
        // Write your code here.
        return arr.stream().distinct().mapToInteger(x -> x).sum();
    }

    
    public static int findSum_Problem_2_f6fd04fc_c6fd_42d7_b4f9_64ec060d5bf2(ArrayList<Integer> arr) {
        return arr.stream().distinct().mapToInteger(Integer::intValue).sum();
    }

    
    public static int findSum_Problem_0_9f37b5cc_8570_4e57_b629_5c46b13195aa(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i : arr) {
            if (!arr.contains(i)) {
                sum += i;
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_0_90ecfda1_a3db_4ccc_8624_df99eafa5aae(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i : arr) {
            if (arr.indexOf(i) == arr.lastIndexOf(i)) {
                sum += i;
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_2_a2ef5542_e46a_4f28_b426_1d80294a4774(ArrayList<Integer> arr) {
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i+1; j < arr.size(); j++) {
                if(arr.get(i) == arr.get(j)) {
                    arr.remove(j);
                    j--;
                }
            }
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int findSum_Problem_2_f5a5569a_917c_4b5f_a04d_200ace968ecd(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            int num = arr.get(i);
            if (arr.indexOf(num) == arr.lastIndexOf(num)) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_2_f136b7c0_2c17_4799_999e_77ea97213622(ArrayList<Integer> arr) {
        int sum = 0;
        for(Integer i : arr) {
            sum += i;
        }
        return sum;
    }

    
    public static int findSum_Problem_2_556e74e2_4436_4bb8_9c2a_124bc0c0a4c0(ArrayList<Integer> arr) {
        int sum = 0;
        for (Integer i : arr) {
            if (!arr.contains(i)) {
                arr.add(i);
            }
        }
        for (Integer i : arr) {
            sum += i;
        }
        return sum;
    }

    
    public static int findSum_Problem_0_4a8709b6_5367_4da3_b346_9e7aab56ab86(ArrayList<Integer> arr) {
        return arr.stream().distinct().mapToInteger(Integer::intValue).sum();
    }

    
    public static int findSum_Problem_0_81af000d_7674_405e_8bd0_5cfe12bd92dd(ArrayList<Integer> arr) {
        // Write your code here.
        return arr.stream().distinct().mapToInteger(Integer::intValue).sum();
    }

    
    public static int findSum_Problem_2_af36705b_5e3c_4649_ae1b_c10fab6b48d6(ArrayList<Integer> arr) {
        return arr.stream().distinct().mapToInteger((x) -> x).sum();
    }

    
    public static int findSum_Problem_2_87d087fe_2788_4921_baaf_d54a2f009644(ArrayList<Integer> arr) {
        int sum = 0;
        for(Integer i : arr) {
            sum += i;
        }
        return sum;
    }

    
    public static int findSum_Problem_0_07c71e23_c374_4c46_9458_142baf2b70ac(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) == arr.get(j)) {
                    arr.remove(j);
                    j--;
                }
            }
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int findSum_Problem_2_5342ca7a_5039_43cd_a299_854814b90833(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) == arr.get(j)) {
                    arr.remove(j);
                    j--;
                }
            }
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int findSum_Problem_0_540d1202_e965_4ff1_9fd5_5e0b0733da00(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            int num = arr.get(i);
            if (!arr.subList(i + 1, arr.size()).contains(num)) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_2_90ac471d_894b_4f67_a5e6_7b03d904102f(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            boolean isRepeated = False;
            for (int j = 0; j < arr.size(); j++) {
                if (i != j && arr.get(i) == arr.get(j)) {
                    isRepeated = True;
                    break;
                }
            }
            if (!isRepeated) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_2_3db86a3d_3bb8_43d2_8161_8e51520583a9(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) == arr.get(j)) {
                    arr.remove(j);
                    j--;
                }
            }
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int findSum_Problem_2_b6458159_f3c4_4c39_9f52_5d75a99172dd(ArrayList<Integer> arr) {
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i+1; j < arr.size(); j++) {
                if(arr.get(i) == arr.get(j)) {
                    arr.remove(j);
                    j--;
                }
            }
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int findSum_Problem_2_7d884efd_df98_4607_bea8_f2a3bd93621b(ArrayList<Integer> arr) {
        int sum = 0;
        for (Integer i : arr) {
            if (!arr.contains(i)) {
                sum += i;
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_0_e8435b5c_42e1_4273_bfa0_18b41f059f40(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) == arr.get(j)) {
                    arr.remove(j);
                    j--;
                }
            }
        }
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int findSum_Problem_2_9c948f2a_4016_4861_a8df_69028b79243d(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            int num = arr.get(i);
            if (arr.indexOf(num) == arr.lastIndexOf(num)) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_2_5c2d9fb9_c083_4080_9b43_ce83e7309170(ArrayList<Integer> arr) {
        return arr.stream().distinct().mapToInteger(Integer::intValue).sum();
    }

    
    public static int findSum_Problem_0_1aaa6cc6_69c2_4b8c_962b_f0f7dc341078(ArrayList<Integer> arr) {
        int sum = 0;
        for (Integer i : arr) {
            if (!arr.contains(i)) {
                arr.add(i);
            }
        }
        for (Integer i : arr) {
            sum += i;
        }
        return sum;
    }

    
    public static int findSum_Problem_0_6fcc60d5_209f_4051_9614_3bb9a6d14317(ArrayList<Integer> arr) {
        return arr.stream().distinct().mapToInteger(Integer::intValue).sum();
    }

    
    public static int findSum_Problem_0_d4f963d1_4d0b_4cb4_b4f5_d7a800e0aed1(ArrayList<Integer> arr) {
        return arr.stream().distinct().mapToInteger(Integer::intValue).sum();
    }

    
    public static int findSum_Problem_0_6d07543c_9b58_4cf7_a9eb_4c3e8609cf0e(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) == arr.get(j)) {
                    arr.remove(j);
                    j--;
                }
            }
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int findSum_Problem_0_c83505b4_0597_4b8e_a2a2_fdd085e878bc(ArrayList<Integer> arr) {
        int sum = 0;
        for (Integer i : arr) {
            if (!arr.contains(i)) {
                sum += i;
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_0_d9dfdfa4_af5f_4f69_97f3_0a05c1f9ab3e(ArrayList<Integer> arr) {
        int sum = 0;
        for (Integer i : arr) {
            if (!arr.contains(i)) {
                arr.add(i);
                sum += i;
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_0_6ae01729_46de_42a1_b776_9ea47f4dc5b5(ArrayList<Integer> arr) {
        return arr.stream().distinct().reduce(0L, (a, b) -> a + b);
    }

    
    public static int findSum_Problem_0_79a0e38d_9796_4b14_9a37_8d10204193ef(ArrayList<Integer> arr) {
        int sum = 0;
        for(Integer i : arr) {
            sum += i;
        }
        return sum;
    }

    
    public static int findSum_Problem_0_f3a40880_518d_4126_bbb3_335abd9b5c39(ArrayList<Integer> arr) {
        return arr.stream().distinct().mapToInteger(Integer::intValue).sum();
    }

    
    public static int findSum_Problem_2_4dcf7991_2e40_4c3c_8820_fd088f8e2c43(ArrayList<Integer> arr) {
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i+1; j < arr.size(); j++) {
                if(arr.get(i) == arr.get(j)) {
                    arr.remove(j);
                    j--;
                }
            }
        }
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int findSum_Problem_0_0b286540_5ea9_42d6_81bc_69cbd95f3c0d(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) == arr.get(j)) {
                    arr.remove(j);
                    j--;
                }
            }
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int findSum_Problem_0_03558a69_852d_4a51_9ad8_fac75855f938(ArrayList<Integer> arr) {
        // Write your code here
        return arr.stream().distinct().mapToInteger(Integer::intValue).sum();
    }

    
    public static int findSum_Problem_2_8f941f08_0fd9_4a4d_9088_5bc8fc7004fd(ArrayList<Integer> arr) {
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i+1; j < arr.size(); j++) {
                if(arr.get(i) == arr.get(j)) {
                    sum += arr.get(i);
                }
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_0_a7333809_49e2_468d_af57_8df99caf69ae(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) == arr.get(j)) {
                    arr.remove(j);
                    j--;
                }
            }
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int findSum_Problem_0_65bfa823_f90a_425c_ae98_6fec71854581(ArrayList<Integer> arr) {
        return arr.stream().distinct().mapToInteger(Integer::intValue).sum();
    }

    
    public static int findSum_Problem_0_841eb482_e8d0_4ebd_9e8b_d9254943a714(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) == arr.get(j)) {
                    arr.remove(j);
                    j--;
                }
            }
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int findSum_Problem_2_6613749f_5d51_4deb_b11b_4948c3c8b1b4(ArrayList<Integer> arr) {
        return arr.stream().distinct().mapToInteger(Integer::intValue).sum();
    }

    
    public static int findSum_Problem_2_d03ed881_c938_4860_8e19_8761f0dad0e3(ArrayList<Integer> arr) {
        int sum = 0;
        for (Integer i : arr) {
            if (!arr.contains(i)) {
                arr.add(i);
                sum += i;
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_2_c7381037_f4b7_4a2e_8639_134620f22272(ArrayList<Integer> arr) {
        int sum = 0;
        for (Integer i : arr) {
            if (!arr.contains(i)) {
                sum += i;
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_2_7066df1f_5b8f_41bd_ad7d_055675eccaed(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (i == arr.lastIndexOf(arr.get(i))) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_0_77d088d4_93e8_4d11_b837_20d52f3b55b8(ArrayList<Integer> arr) {
        return arr.stream().distinct().mapToInteger(Integer::intValue).sum();
    }

    
    public static int findSum_Problem_0_777990e7_0e98_46b8_9eab_2d86a01f5fe2(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) == arr.get(j)) {
                    arr.remove(j);
                    j--;
                }
            }
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int findSum_Problem_2_cf912e9d_fb9b_450e_b353_4f24d78f5e14(ArrayList<Integer> arr) {
        int sum = 0;
        for(int l : arr) {
            sum += l;
        }
        return sum;
    }

    
    public static int findSum_Problem_0_77baae95_2e89_48ba_b04f_8571a2aa95d8(ArrayList<Integer> arr) {
        int sum = 0;
        for (Integer i : arr) {
            sum += i;
        }
        return sum;
    }

    
    public static int findSum_Problem_2_7fa41923_726b_40cd_92ec_efbae4b100b1(ArrayList<Integer> arr) {
        int sum = 0;
        for(Integer i : arr) {
            if(!arr.contains(i)) {
                arr.add(i);
                sum += i;
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_0_ceef4980_5151_4166_90b6_07570dcf1497(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            boolean isRepeated = False;
            for (int j = 0; j < arr.size(); j++) {
                if (i != j && arr.get(i) == arr.get(j)) {
                    isRepeated = True;
                    break;
                }
            }
            if (!isRepeated) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_2_51bd1857_b87d_4cfe_9e2e_28af87f294b5(ArrayList<Integer> arr) {
        return arr.stream().distinct().mapToInteger(x -> x).sum();
    }

    
    public static int findSum_Problem_2_742bb636_aec4_4b3e_a17a_2945c4e1d281(ArrayList<Integer> arr) {
        return arr.stream().distinct().mapToInteger(Integer::intValue).sum();
    }

    
    public static int findSum_Problem_0_e06bf368_5444_478d_a84a_e23245609966(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) == arr.get(j)) {
                    arr.remove(j);
                    j--;
                }
            }
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int findSum_Problem_0_88a8d9c0_f388_4308_a537_2d698bef2ace(ArrayList<Integer> arr) {
        return arr.stream().distinct().mapToInteger(Integer::intValue).sum();
    }

    
    public static int findSum_Problem_0_7165254a_84da_4131_959b_e340a7d33d58(ArrayList<Integer> arr) {
        return arr.stream().distinct().mapToInteger(Integer::intValue).sum();
    }

    
    public static int findSum_Problem_2_90db3ee2_a33c_41aa_9b9d_c7fe57170c00(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) == arr.get(j)) {
                    arr.remove(j);
                    j--;
                }
            }
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int findSum_Problem_0_f3e12d04_1257_4995_963d_cc87ff4791f3(ArrayList<Integer> arr) {
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i+1; j < arr.size(); j++) {
                if(arr.get(i) == arr.get(j)) {
                    arr.remove(j);
                    j--;
                }
            }
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int findSum_Problem_2_67506d49_b42d_4fbf_aa62_ad906ff1656d(ArrayList<Integer> arr) {
        return arr.stream().distinct().mapToInteger(Integer::intValue).sum();
    }

    
    public static int findSum_Problem_0_1e9dd2e8_5a93_426a_b6f8_cd36afde01fc(ArrayList<Integer> arr) {
        int sum = 0;
        for(Integer i : arr) {
            if(!arr.contains(i)) {
                sum += i;
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_2_f53040a5_0568_48df_81e5_9d6feadfea1b(ArrayList<Integer> arr) {
        int sum = 0;
        for(Integer i : arr) {
            if(!arr.contains(i)) {
                sum += i;
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_0_5e0bc954_5e90_4912_b00b_fe8532d0f35f(ArrayList<Integer> arr) {
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                if(arr.get(i) == arr.get(j)) {
                    arr.remove(j);
                    j--;
                }
            }
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int findSum_Problem_2_eb0b0620_e802_461a_a332_f593e0b32b49(ArrayList<Integer> arr) {
        int sum = 0;
        for (Integer i : arr) {
            sum += i;
        }
        return sum;
    }

    
    public static int findSum_Problem_0_918aac4c_b3ca_48b4_8599_a6bbb6301033(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (!arr.subList(i + 1, arr.size()).contains(arr.get(i))) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_0_5342ca7a_5039_43cd_a299_854814b90833(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) == arr.get(j)) {
                    arr.remove(j);
                    j--;
                }
            }
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int findSum_Problem_0_228cb530_ead4_43ed_8d3b_5f1f91705f9f(ArrayList<Integer> arr) {
        int sum = 0;
        for (Integer i : arr) {
            sum += i;
        }
        return sum;
    }

    
    public static int findSum_Problem_2_81d3ee1e_e7af_47af_8f49_b0428e1d38a4(ArrayList<Integer> arr) {
        return arr.stream().distinct().mapToInteger(x -> x).sum();
    }

    
    public static int findSum_Problem_2_67e81755_981b_4792_b115_e691ce115be3(ArrayList<Integer> arr) {
        return arr.stream().distinct().mapToInteger(Integer::intValue).sum();
    }

    
    public static int findSum_Problem_2_77baae95_2e89_48ba_b04f_8571a2aa95d8(ArrayList<Integer> arr) {
        int sum = 0;
        for (Integer i : arr) {
            sum += i;
        }
        return sum;
    }

    
    public static int findSum_Problem_0_20efd860_5062_45fe_9e0a_a388d4211ef6(ArrayList<Integer> arr) {
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                if(arr.get(i) == arr.get(j)) {
                    arr.remove(j);
                    j--;
                }
            }
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int findSum_Problem_2_92587418_6b09_4883_b988_801de302ab1e(ArrayList<Integer> arr) {
        // Write your code here
        int sum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
        }
        for (int i : arr) {
            if (map.get(i) == 1) {
                sum += i;
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_2_b956176d_1f58_4817_b747_fa582ce3c2e0(ArrayList<Integer> arr) {
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                if(arr.get(i) == arr.get(j)) {
                    arr.remove(j);
                    j--;
                }
            }
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int findSum_Problem_2_fc7759df_cddf_4612_8113_b2b4cc35847a(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) == arr.get(j)) {
                    arr.remove(j);
                    j--;
                }
            }
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int findSum_Problem_0_9c24ed84_5564_477a_b51d_cd40441e5d84(ArrayList<Integer> arr) {
        // Write your code here
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            boolean flag = False;
            for (int j = 0; j < arr.size(); j++) {
                if (i != j && arr.get(i) == arr.get(j)) {
                    flag = True;
                    break;
                }
            }
            if (!flag) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_2_4b9f4071_577b_4fae_bb93_28f5ea887bd2(ArrayList<Integer> arr) {
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(!arr.subList(i + 1, arr.size()).contains(arr.get(i))) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_0_29c168b8_910b_4784_b32a_c1c6fc150ec7(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) == arr.get(j)) {
                    arr.remove(j);
                    j--;
                }
            }
        }
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int findSum_Problem_0_4b34fab4_5528_46a0_abf4_a64e722f7a82(ArrayList<Integer> arr) {
        // Write your code here
        int sum = 0;
        for(int i = 0; i < arr.size(); i++){
            if(!arr.contains(arr.get(i))){
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_0_8f941f08_0fd9_4a4d_9088_5bc8fc7004fd(ArrayList<Integer> arr) {
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i+1; j < arr.size(); j++) {
                if(arr.get(i) == arr.get(j)) {
                    sum += arr.get(i);
                }
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_0_d1ac80fb_339d_4ccf_bce9_f98a54ab7368(ArrayList<Integer> arr) {
        int sum = 0;
        for(Integer i : arr) {
            if(!arr.contains(i)) {
                arr.add(i);
            }
        }
        for(Integer i : arr) {
            sum += i;
        }
        return sum;
    }

    
    public static int findSum_Problem_2_4c8be963_f35a_43a8_837f_6989c4a28f54(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            int num = arr.get(i);
            if (arr.indexOf(num) == arr.lastIndexOf(num)) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_2_33b82266_d093_4599_99be_e157033c96ed(ArrayList<Integer> arr) {
        // Write your code here
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (i == arr.lastIndexOf(arr.get(i))) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_0_af36705b_5e3c_4649_ae1b_c10fab6b48d6(ArrayList<Integer> arr) {
        return arr.stream().distinct().mapToInteger((x) -> x).sum();
    }

    
    public static int findSum_Problem_0_cb3de2fa_638f_478d_8a6b_88a6855abacb(ArrayList<Integer> arr) {
        // Write your code here
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.indexOf(arr.get(i)) == arr.lastIndexOf(arr.get(i))) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_2_d6043f35_13a9_4e4e_8f59_84ce5dafa20f(ArrayList<Integer> arr) {
        int sum = 0;
        for(Integer i : arr) {
            sum += i;
        }
        return sum;
    }

    
    public static int findSum_Problem_2_5a136999_6ca2_4b1b_915f_eb0f22300fd4(ArrayList<Integer> arr) {
        int sum = 0;
        for (Integer i : arr) {
            if (!arr.contains(i)) {
                arr.add(i);
                sum += i;
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_0_f53040a5_0568_48df_81e5_9d6feadfea1b(ArrayList<Integer> arr) {
        int sum = 0;
        for(Integer i : arr) {
            if(!arr.contains(i)) {
                sum += i;
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_0_1bfc308e_b225_403f_9e68_32d5ad763013(ArrayList<Integer> arr) {
        return arr.stream().distinct().mapToInteger(Integer::intValue).sum();
    }

    
    public static int findSum_Problem_2_6d07543c_9b58_4cf7_a9eb_4c3e8609cf0e(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) == arr.get(j)) {
                    arr.remove(j);
                    j--;
                }
            }
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int findSum_Problem_0_668ff4fe_21a3_4178_a457_fc3584aadabe(ArrayList<Integer> arr) {
        return arr.stream().distinct().mapToInteger(x -> x).sum();
    }

    
    public static int findSum_Problem_0_f6fd04fc_c6fd_42d7_b4f9_64ec060d5bf2(ArrayList<Integer> arr) {
        return arr.stream().distinct().mapToInteger(Integer::intValue).sum();
    }

    
    public static int findSum_Problem_2_9c24ed84_5564_477a_b51d_cd40441e5d84(ArrayList<Integer> arr) {
        // Write your code here
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            boolean flag = False;
            for (int j = 0; j < arr.size(); j++) {
                if (i != j && arr.get(i) == arr.get(j)) {
                    flag = True;
                    break;
                }
            }
            if (!flag) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_0_a9127359_9f84_4822_b0b9_b7fb55f761d3(ArrayList<Integer> arr) {
        return arr.stream().distinct().mapToInteger(x -> x).sum();
    }

    
    public static int findSum_Problem_0_df6e8e10_128c_437d_a472_c24c422199ec(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            int num = arr.get(i);
            if (arr.indexOf(num) == arr.lastIndexOf(num)) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_0_e3b207a0_34a8_40db_993e_5adf8cd4e79d(ArrayList<Integer> arr) {
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                if(arr.get(i) == arr.get(j)) {
                    arr.remove(j);
                    j--;
                }
            }
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int findSum_Problem_0_f5a5569a_917c_4b5f_a04d_200ace968ecd(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            int num = arr.get(i);
            if (arr.indexOf(num) == arr.lastIndexOf(num)) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_0_40f143b6_66be_4b50_811e_53ffacb95181(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) == arr.get(j)) {
                    arr.remove(j);
                    j--;
                }
            }
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int findSum_Problem_0_789a5d50_8359_4ffa_9455_55cf2bf5ce6b(ArrayList<Integer> arr) {
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i+1; j < arr.size(); j++) {
                if(arr.get(i) == arr.get(j)) {
                    sum += arr.get(i);
                }
            }
        }
        return sum;
    }

    
    public static int findSum_Problem_2_0fccf3a4_e121_49f9_9a7b_99fd681ada9e(ArrayList<Integer> arr) {
        // Write your code here.
        return arr.stream().distinct().mapToInteger(Integer::intValue).sum();
    }

    
    public static int findSum_Problem_0_b8f32fb6_3401_4dc8_82cc_8d4c42da85ef(ArrayList<Integer> arr) {
        // Write your code here
        return arr.stream().distinct().mapToInteger(x -> x).sum();
    }

    
    public static int findSum_Problem_2_6ceceeea_1de0_46f1_9472_2360b4d1b865(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) == arr.get(j)) {
                    arr.remove(j);
                    j--;
                }
            }
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int findSum_Problem_2_e8435b5c_42e1_4273_bfa0_18b41f059f40(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) == arr.get(j)) {
                    arr.remove(j);
                    j--;
                }
            }
        }
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int findSum_Problem_0_9ff91285_bae1_45ca_9bb1_86695b66a2e6(ArrayList<Integer> arr) {
        int sum = 0;
        for (Integer i : arr) {
            if (arr.indexOf(i) == arr.lastIndexOf(i)) {
                sum += i;
            }
        }
        return sum;
    }

}
