package mbpp_442_positive_count;

public class mbpp_442_positive_count {

    
    public static float positiveCount_Problem_0_2dcced7e_cf18_44ac_8724_8e48290bbe4c(ArrayList<Integer> nums) {
        float count = 0;
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) > 0) {
                count++;
            }
        }
        return count / nums.size();
    }

    
    public static float positiveCount_Problem_1_def852e5_0294_4db1_9fa0_a0742f4e6a0d(ArrayList<Integer> nums) {
        int sum = 0;
        for (int num : nums) {
            if (num > 0) {
                sum = sum + num;
            }
        }
        float result = sum / nums.size();
        return result;
    }

    
    public static float positiveCount_Problem_0_077e41fe_fd0d_48e6_9946_3272ff637526(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static float positiveCount_Problem_1_212c65f5_7601_4b77_968c_79d1b2d701ce(ArrayList<Integer> nums) {
        int sum = 0;
        for (Integer l : nums) {
            sum += l;
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_0_6b779eb3_2069_4d26_92ec_2472e5ae642d(ArrayList<Integer> nums) {
        float sum = 0;
        for(Integer num : nums) {
            if(num > 0) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static float positiveCount_Problem_1_41eb5f57_363e_48af_b63a_b2de768fe591(ArrayList<Integer> nums) {
        int count = 0;
        for (int num : nums) {
            if (num > 0) {
                count++;
            }
        }
        return count /  nums.size();
    }

    
    public static float positiveCount_Problem_2_3e0821d4_3a2c_437e_bd6a_1b5934feb4dd(ArrayList<Integer> nums) {
        float sum = 0;
        for(Integer num : nums) {
            if(num > 0) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static float positiveCount_Problem_2_29d21b25_5495_4e70_914a_d5012b5a1111(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_0_eec63949_bd27_4318_adfc_31180d17fd7d(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_0_2880f3ba_8de0_480f_89e2_3669ac034391(ArrayList<Integer> nums) {
        float sum = 0;
        for (int num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_1_03deaec1_be80_4189_9111_5a70ce54a9e0(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_0_d71b0557_cd51_4abf_9200_c6c44bc81573(ArrayList<Integer> nums) {
        int count = 0;
        for(Integer num : nums){
            if(num > 0) count++;
        }
        return count/nums.size();
    }

    
    public static float positiveCount_Problem_0_171d6749_ef49_4a08_8c3a_1e9ca4865723(ArrayList<Integer> nums) {
        float sum = 0;
        for (int num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_2_ad75622a_0091_416a_b296_de8be6d8612f(ArrayList<Integer> nums) {
        float sum = 0;
        for(int num : nums) {
            if(num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_1_d650adcc_28bb_43dd_971d_ae38eb5a2d26(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_1_367e58a1_3597_4709_af48_f06ee3a7ed6d(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_1_78dcf44f_d0c8_4c1b_be1c_c0c9ae16455f(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_1_b0dc289e_aa03_44f6_8a2d_9992b482dbdc(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_2_fea3df22_7dcc_4a71_ac17_ab62060f6def(ArrayList<Integer> nums) {
        return nums.stream().filter(l -> l > 0).mapToInteger(Integer::intValue).sum() / nums.size();
    }

    
    public static float positiveCount_Problem_2_5880eb83_54a0_4917_8201_c13682f95a2a(ArrayList<Integer> nums) {
        float sum = 0;
        for (int num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_0_63d8be01_a3c0_4c01_9fb7_5c323f9d6770(ArrayList<Integer> nums) {
        float sum = 0f;
        for (int number : nums) {
            if (number > 0)
                sum += number;
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_1_7db3f10f_db19_4875_971c_a643a93611a7(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static float positiveCount_Problem_2_6ed954ba_9126_4df8_a9f1_60b49e980cc2(ArrayList<Integer> nums) {
        float sum = 0;
        for (int num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_0_fea3df22_7dcc_4a71_ac17_ab62060f6def(ArrayList<Integer> nums) {
        return nums.stream().filter(l -> l > 0).mapToInteger(Integer::intValue).sum() / nums.size();
    }

    
    public static float positiveCount_Problem_0_902006bb_ee7d_40a1_96b0_23ce453f743a(ArrayList<Integer> nums) {
        // Write your code here
        int positiveCount_Problem_0_902006bb_ee7d_40a1_96b0_23ce453f743a = 0;
        for (int num : nums) {
            if (num > 0) {
                positiveCount_Problem_0_902006bb_ee7d_40a1_96b0_23ce453f743a++;
            }
        }
        return positiveCount_Problem_0_902006bb_ee7d_40a1_96b0_23ce453f743a / nums.size();
    }

    
    public static float positiveCount_Problem_0_02115c24_7ec0_44b2_88db_8944c94dcf36(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_0_d7fa467f_9189_46f3_8023_a1631fd7e0bb(ArrayList<Integer> nums) {
        int positive=0;
        for (Integer num: nums) {
            if (num>0) {
                positive+=1;
            }
        }
        return positive/nums.size();
    }

    
    public static float positiveCount_Problem_0_78a3e2d6_38b0_4a72_8e8a_e90488191e50(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static float positiveCount_Problem_2_4c569a65_10fb_4910_b4ac_cbe0d50e681c(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_0_ce8beefa_a3c0_4e6c_a383_158867225c58(ArrayList<Integer> nums) {
        int count = 0;
        for (Integer n: nums) {
            if (n > 0) {
                count += 1;
            }
        }
        return (count) / nums.size();
    }

    
    public static float positiveCount_Problem_0_aee3a3f5_30fc_4af1_97fc_7b78b78b3a3c(ArrayList<Integer> nums) {
        float sum = 0;
        for(int i = 0; i < nums.size(); i++) {
            sum += nums.get(i);
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_2_949915bd_941b_4f5a_8e93_c3453dfd91b9(ArrayList<Integer> nums) {
        float numsSum = 0;
        int count = 0;
        int sum = 0;
        for(int num : nums) {
            numsSum += num;
            count += 1;
            sum += num;
        }
        return (numsSum / sum);
    }

    
    public static float positiveCount_Problem_0_c0991aac_2f0e_4f2b_8149_fb2ef5f0e745(ArrayList<Integer> nums) {
        float sum = 0;
        for (int num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_0_21979fe3_bf83_4809_8b47_0465d674f88c(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_1_78a3e2d6_38b0_4a72_8e8a_e90488191e50(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static float positiveCount_Problem_2_49b3afcc_6591_4d04_8257_a04562532762(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_2_2c46bb73_fd40_4b21_8081_768d716c16b9(ArrayList<Integer> nums) {
        float sum = 0;
        for (int n : nums)
            if (n >= 0)
                sum += n;
        return sum;
    }

    
    public static float positiveCount_Problem_1_27dfb5bb_6f76_4efc_9854_c6e96c05645e(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static float positiveCount_Problem_2_727b0934_e057_4bd7_81bc_41b14c244f2f(ArrayList<Integer> nums) {
        float sum = 0;
        for(int num : nums) {
            if(num > 0) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static float positiveCount_Problem_1_2b676495_9ac6_489b_ba07_ee457a4b3ed5(ArrayList<Integer> nums) {
        float sum = 0;
        for(int num : nums) {
            if(num > 0) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static float positiveCount_Problem_2_774ad0f8_c24e_418c_a311_931f43ed4fac(ArrayList<Integer> nums) {
        float sum = 0;
        for (int num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static float positiveCount_Problem_2_643f181b_83e6_4549_856b_0957dda8c755(ArrayList<Integer> nums) {
        float sum = 0;
        for (int num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_0_03b7bb63_0e45_44ec_8e18_e22d48f45be2(ArrayList<Integer> nums) {
        float sum = 0;
        for(int num : nums) {
            if(num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_2_3918ec0b_00fb_49da_936e_86b5cfd33c28(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_0_73933fec_52d8_4626_b81d_72298689beb6(ArrayList<Integer> nums) {
        int sum = 0;
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) > 0) {
                sum += nums.get(i);
            }
        }
        return  (sum /  nums.size());
    }

    
    public static float positiveCount_Problem_2_d6cee7c3_5e3a_40c1_9222_7f8faa9605a9(ArrayList<Integer> nums) {
        float sum = 0;
        for(Integer num : nums) {
            if(num > 0) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static float positiveCount_Problem_0_437b1ee3_65f5_4951_87f9_0fcf76babc36(ArrayList<Integer> nums) {
        float sum = 0;
        for (int num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_0_58324bf6_91b2_4cc9_88dc_d6d08caf1bef(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_1_9ebaf44e_7261_4ab4_aac5_cf07245ad110(ArrayList<Integer> nums) {
        float sum = 0;
        for (int num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_1_d56d7793_14ca_484f_8857_77b7634d61f9(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_2_ed4d96d8_aad0_4991_9055_04372ac0e506(ArrayList<Integer> nums) {
        int n = 0;
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) > 0) {
                n++;
            }
        }
        float pos =  n / nums.size();
        return pos;
    }

    
    public static float positiveCount_Problem_0_7d2b1486_f1d5_4ec3_a649_53431fa1691b(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_0_6625c594_a322_41c2_a4fa_8fc3a2224fd7(ArrayList<Integer> nums) {
        int num = 0;
        int sum = 0;
        for (int i = 0; i < nums.size(); i++) {
            sum = sum + nums.get(i);
            num = nums.get(i);
            if (num < 0) {
                num = sum - num;
            }
        }
        return num / nums.size();
    }

    
    public static float positiveCount_Problem_2_c1087e9b_3542_4f02_8ad1_6c6ecc987528(ArrayList<Integer> nums) {
        int total = 0;
        for(int i : nums) {
            if (i > 0) total++;
        }
        return (total)/nums.size();
    }

    
    public static float positiveCount_Problem_1_cc847865_403d_47a1_afcd_e87f8d9cbce7(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_0_b2956a90_310d_48d6_b805_0d693c39392f(ArrayList<Integer> nums) {
        float sum = 0;
        for (int num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_0_99536627_5d95_4141_84ff_9f9649395c86(ArrayList<Integer> nums) {
        float sum = 0;
        for (int num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_1_ae8c446b_4d2f_477a_a31c_93f46b61b306(ArrayList<Integer> nums) {
        float result = 0;
        for(int i = 0; i < nums.size(); i++) {
            if(nums.get(i) > 0) {
                result += nums.get(i);
            }
        }
        return result;
    }

    
    public static float positiveCount_Problem_2_4c8c656b_2ed9_4778_af92_2266b1e2e649(ArrayList<Integer> nums) {
        int sum = 0;
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) > 0) {
                sum = sum + nums.get(i);
            }
        }
        return  (sum / (nums.size()));
    }

    
    public static float positiveCount_Problem_1_bc7e5499_d5f0_431c_a252_8c5826e03137(ArrayList<Integer> nums) {
        float count=0;
        for(Integer num:nums){
            if(num>0){
                count++;
            }
        }
        return count;
    }

    
    public static float positiveCount_Problem_1_e8b1b6bb_469d_4c53_8bf9_3f7c94a92963(ArrayList<Integer> nums) {
        float sum = 0;
        for(Integer num : nums) {
            if(num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_1_dd0a8a22_14d7_4191_944e_34cecfe48a7f(ArrayList<Integer> nums) {
        float sum = 0;
        for(Integer num : nums) {
            sum += num;
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_0_a3c7922a_371b_4b5e_978a_8c5b268efe70(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_0_b0c2e53d_8cd6_418e_8044_1430eee73361(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_1_bf7d736b_bd59_4648_b641_54b3d31eca8e(ArrayList<Integer> nums) {
        float sum = 0;
        for(int i : nums) {
            if(i >= 0) 
                sum += i;
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_0_0a762068_0f69_4d38_a0c6_c6678cd33de1(ArrayList<Integer> nums) {
        int sum=0;
        int num=0;
        for(int i=0;i<nums.size();i++)
        {
            sum+=nums.get(i);
        }
        for(int i=0;i<nums.size();i++)
        {
            num=sum;
            sum-=nums.get(i);
        }
        return sum;
    }

    
    public static float positiveCount_Problem_2_df7453ef_4111_4aaf_984f_747f3f22c733(ArrayList<Integer> nums) {
        float sum = 0;
        for(Integer num : nums) {
            sum += num;
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_1_97f38d3d_9600_4dda_b645_11c8e50d50aa(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_0_8abad1cd_03a0_4c1a_82ab_ee8efcb53283(ArrayList<Integer> nums) {
        float sum = 0;
        for (int num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_1_ffcdf406_5213_4f8e_a56f_87183ac16c0d(ArrayList<Integer> nums) {
        float sum = 0;
        for (int num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_0_c4594537_afe4_403d_9a87_feae24f1dc9e(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static float positiveCount_Problem_1_ed2ab3e7_1edb_4251_9755_21a368435e08(ArrayList<Integer> nums) {
        float sum = 0;
        for(Integer num : nums) {
            sum += num;
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_0_07ab4e61_0cc4_4bb8_8213_29827f9212dd(ArrayList<Integer> nums) {
        // TODO Auto-generated method stub
        return 0;
    }

    
    public static float positiveCount_Problem_2_251bcaf0_8efc_4e1f_a133_69351aad6625(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_0_ddeac472_1b9c_4b74_9dd5_9d5014e91f49(ArrayList<Integer> nums) {
        float sum = 0;
        for(Integer num : nums) {
            if(num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_1_58324bf6_91b2_4cc9_88dc_d6d08caf1bef(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_1_ef1f4e7a_2f19_4bda_a82b_86648fe9f5d8(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_2_4299d0bc_d5f2_4eff_9673_fc96f28e5c10(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_1_0fb1e88d_1b90_44f2_9c40_9b1f62ee2b0e(ArrayList<Integer> nums) {
        float sum = 0;
        for(Integer num : nums) {
            sum += num;
        }
        return sum;
    }

    
    public static float positiveCount_Problem_0_ab7404de_555c_4a57_ae20_f67284f22726(ArrayList<Integer> nums) {
        float sum = 0;
        for (int i : nums) {
            if (i >= 0) {
                sum += i;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_1_5ab08fdd_b131_44ea_8818_3563d36bb16e(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_2_367e58a1_3597_4709_af48_f06ee3a7ed6d(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_0_5ba6669f_754d_4c4a_ae6f_f809c53ce7ca(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static float positiveCount_Problem_1_cfdbf9bb_2ebe_4289_895c_9af855e07538(ArrayList<Integer> nums) {
        float sum = 0;
        for (int num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static float positiveCount_Problem_0_a603baeb_aa01_4b9e_8132_a9dfd5fd870e(ArrayList<Integer> nums) {
        float positive = 0.0;
        for (Integer i : nums) {
            if (i > 0) positive = positive + i;
        }
        return positive;
    }

    
    public static float positiveCount_Problem_0_03deaec1_be80_4189_9111_5a70ce54a9e0(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_2_6f3c39ce_f4a0_45e6_ad4a_70b109e97fb9(ArrayList<Integer> nums) {
        // write your code here
        float sum=0;
        for (Integer i: nums)
        {
            if (i>0)
            {
                sum+=i;
            }
        }
        return sum;
    }

    
    public static float positiveCount_Problem_2_d93e972c_558a_481c_9c47_aab33c6a7a69(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_0_89d0ba5b_a3dc_4a34_a9d3_d785bca6b01c(ArrayList<Integer> nums) {
        float sum = 0;
        for(int i = 0; i < nums.size(); i++) {
            sum += nums.get(i);
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_1_3918ec0b_00fb_49da_936e_86b5cfd33c28(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_0_a512d8f2_6fd8_41eb_836c_86f6906f38e3(ArrayList<Integer> nums) {
        int sum=0;
        for(Integer x: nums) {
            if(x.intValue()>0) {
                sum+=x.intValue();
            }
        }
        return sum/nums.size();
    }

    
    public static float positiveCount_Problem_0_bffe95c3_e8d8_4cf0_a35c_ee9a64c74dc6(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static float positiveCount_Problem_0_886866d2_e627_42d3_8b21_3c70bf779e54(ArrayList<Integer> nums) {
        float sum = 0;
        for (int num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_1_9e5f50b5_0616_45fc_9d06_8414cd9fe661(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_2_dad7b4df_f30b_46ec_aacd_d89ebfe9a2a1(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_0_55b04624_bbb7_47b7_84d2_18701f3ffa84(ArrayList<Integer> nums) {
        float total = 0.0;
        for (int num : nums) {
            if (num > 0) {
                total += num;
            }
        }
        return total / nums.size();
    }

    
    public static float positiveCount_Problem_1_86e461aa_ae59_43ab_a05e_47b3931d0f6c(ArrayList<Integer> nums) {
        float sum = 0;
        for(int num : nums) {
            if(num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_1_ed6584f7_bbc7_4c7a_82ea_9d20b89034b6(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_0_49a65ba9_3e65_462f_ae29_ca486c894aa8(ArrayList<Integer> nums) {
        float sum = 0;
        for (int num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_1_4b9a3231_7264_4d37_8cea_6f18e9ef5ddc(ArrayList<Integer> nums) {
        if (nums.size() == 0) {
            return 0;
        }
        int sum = 0;
        for (Integer num : nums) {
            sum += num;
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_0_8b4f6378_ba2a_4e12_bb1c_32fb51b75981(ArrayList<Integer> nums) {
        float sum = 0;
        for (int n : nums) {
            if (n > 0) {
                sum += n;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_1_054ca6c2_338b_4a29_9d7f_9e2af1c9f7e9(ArrayList<Integer> nums) {
        float sum = 0;
        for (int num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_1_24ce0cf2_cb63_4d8b_852b_91a693f155e6(ArrayList<Integer> nums) {
        // Complete the code here.
        return 1.0;
    }

    
    public static float positiveCount_Problem_2_2d2e9f52_a83a_43e8_92d4_ce90ba90b811(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_1_aee3a3f5_30fc_4af1_97fc_7b78b78b3a3c(ArrayList<Integer> nums) {
        float sum = 0;
        for(int i = 0; i < nums.size(); i++) {
            sum += nums.get(i);
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_2_357e314a_4333_47fc_802e_3a47da9f9d07(ArrayList<Integer> nums) {
        int count = 0;
        for(int i = 0; i<nums.size(); i++)
        {
            if(nums.get(i)>0)
            {
                count++;
            }
        }
        return count/nums.size();
    }

    
    public static float positiveCount_Problem_1_57a4bc19_2349_4487_8741_145f81c53d2f(ArrayList<Integer> nums) {
        // Write your code here
        int sum = 0L;
        for(int i = 0; i < nums.size(); i++) {
            sum += nums.get(i);
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_2_14135a39_3482_4408_b829_958162d498ab(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_1_4299d0bc_d5f2_4eff_9673_fc96f28e5c10(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_2_49b84590_8873_4597_b959_c0c9d581a882(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_1_21648cca_b333_4b29_b309_a65079164065(ArrayList<Integer> nums) {
        float sum = 0;
        for(int num : nums) {
            if(num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

    
    public static float positiveCount_Problem_0_25f4384d_b1f7_4473_8325_d4bc2ad32ba8(ArrayList<Integer> nums) {
        float sum = 0;
        for (Integer num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum / nums.size();
    }

}
