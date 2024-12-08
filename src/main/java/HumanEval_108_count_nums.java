package HumanEval_108_count_nums;

public class HumanEval_108_count_nums {

    
    public static int countNums_Problem_5_e80b2b4d_c7da_4c27_9511_99a76b56133d(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> Math.abs(x) % 9 != 0).count();
    }

    
    public static int countNums_Problem_7_4f9dfb4b_8348_474f_92a3_0cbc99c61c91(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0 && (x % 10) > 0).count();
    }

    
    public static int countNums_Problem_6_585d9b6c_1537_404e_b54e_f46feeea60d4(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            if (i > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_6_e5f4560d_e4bb_4a9b_a9ee_fc535c670ab4(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer l : arr) {
            if (l > 0) {
                count++;
            } else {
                int sum = 0;
                while (l < 0) {
                    sum += l % 10;
                    l /= 10;
                }
                if (sum > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_1_c576e6aa_bdcc_42c8_b308_d473195410a8(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> Math.abs(x) > 0).count();
    }

    
    public static int countNums_Problem_7_3894c90f_fa0d_49f2_9f9a_0e174fa562ec(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer l : arr) {
            if (l > 0) {
                count += l;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_4_76a921fe_02ac_4381_8b76_685f90b45674(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0 && x % 10 != 0).count();
    }

    
    public static int countNums_Problem_1_821ea9f8_dc1b_4597_adc1_361c88e3f47d(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer i : arr) {
            if (i > 0) {
                int sum = 0;
                while (i > 0) {
                    sum += i % 10;
                    i /= 10;
                }
                if (sum > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_6_5e4544d6_e837_41f5_af69_b7d0563ae0eb(ArrayList<Integer> arr) {

        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) < 0) {
                sum += arr.get(i) % 10;
            } else {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int countNums_Problem_4_4980e646_1d95_4f2d_a3a0_e34badc66aaf(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> Math.abs(x) > 0).count();
    }

    
    public static int countNums_Problem_4_2fff1e5c_5fa2_44a8_92f9_70ee3138363c(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            int sum = 0;
            while (i != 0) {
                sum += i % 10;
                i /= 10;
            }
            if (sum > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_5_d404aef0_7d00_4e40_829e_43d641069835(ArrayList<Integer> arr) {

        int count = 0;
        for (int num : arr) {
            if (num > 0) {
                count += 1;
            } else if (num < 0) {
                int sum = 0;
                while (num != 0) {
                    sum += Math.abs(num % 10);
                    num /= 10;
                }
                if (sum > 0) {
                    count += 1;
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_5_241d4e4c_06d2_48dd_9d6a_16067506fd43(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            if (i > 0) {
                int sum = 0;
                while (i > 0) {
                    sum += i % 10;
                    i /= 10;
                }
                if (sum > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_5_ecdd04c1_7bf0_4d6b_8a38_fa3305e019f3(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0).count();
    }

    
    public static int countNums_Problem_1_003e01c5_f35b_46e9_9729_c6fe04713401(ArrayList<Integer> arr) {

        int sum = 0;
        for (Integer x : arr) {
            if (x < 0) {
                sum += x % 10;
            } else {
                sum += x % 10;
            }
        }
        return sum;
    }

    
    public static int countNums_Problem_1_adb70d70_d5b5_41e7_a596_54361fcc0d31(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0).map(x -> x.toString().chars().map(c -> c - '0').sum()).count();
    }

    
    public static int countNums_Problem_5_03f6f11a_f321_4cd1_9a8e_64c0369ff1ad(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer i : arr) {
            int sum = 0;
            while (i != 0) {
                sum += i % 10;
                i /= 10;
            }
            if (sum > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_2_fb01c732_375c_4987_bb41_1c2161ce8ba0(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer x : arr) {
            if (x < 0) {
                count += x % 10;
            } else {
                count += x % 10;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_6_99397586_947b_4143_bdeb_bd26401ebe63(ArrayList<Integer> arr) {
        int count = 0;
        if (arr.isEmpty()) return 0;
        Collections.sort(arr);
        for (int num : arr) {
            if (num >= 0) count += Math.abs(num) % 10;
            else count += Math.abs(num) / 10;
        }
        return count;
    }

    
    public static int countNums_Problem_7_77792491_0d19_481e_a8f6_860c5c1274c7(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0).count();
    }

    
    public static int countNums_Problem_1_d5757160_7846_43aa_b756_dcb074ddcfc4(ArrayList<Integer> arr) {
        int sum = 0;
        
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

    
    public static int countNums_Problem_3_6d1f2999_d246_4376_b105_0ce12e4c9d1d(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer l : arr) {
            if (l > 0) {
                count += l;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_2_d410ace6_75ee_4791_bb31_703124954294(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer n : arr) {
            if (n < 0) {
                count += (n % 10);
            } else {
                count += (n % 10);
            }
        }
        return count;
    }

    
    public static int countNums_Problem_6_7bbf436f_9cbb_4350_b67f_217077e78c03(ArrayList<Integer> arr) {

        int count = 0;
        for (int num : arr) {
            if (num < 0) {
                num = Math.abs(num);
            }
            int sum = 0;
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            if (sum > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_5_30abaa7e_d252_40ad_a708_570c4af2cb81(ArrayList<Integer> arr) {
        return arr.stream().filter(i -> i>0).count();
    }

    
    public static int countNums_Problem_0_e90f8be6_f49b_4301_a338_8dc01b5eade7(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0).count();
    }

    
    public static int countNums_Problem_5_2ceb9a83_776b_4e6b_843a_922e5d702e80(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            if (i > 0) {
                int sum = 0;
                while (i > 0) {
                    sum += i % 10;
                    i /= 10;
                }
                if (sum > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_4_990eee07_de38_44d9_95d7_7a9340c25174(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer l : arr) {
            if (l > 0) {
                count += l;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_3_de5d137b_55f8_42be_b599_dfd7e853d794(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0 && x % 10 > 0).count();
    }

    
    public static int countNums_Problem_3_8d83016b_477a_4706_a486_75447d7bac2a(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            int sum = 0;
            int num = i;
            while (num != 0) {
                sum += num % 10;
                num /= 10;
            }
            if (sum > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_6_82d1e594_0cc7_4f90_b2c0_544c21b9c1f2(ArrayList<Integer> arr) {
        return arr.stream().filter(x -> x.toString().chars().map(y -> y - '0').sum() > 0).count();
    }

    
    public static int countNums_Problem_3_82fdef11_8061_4563_a2bb_092f55a870fd(ArrayList<Integer> arr) {

        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) < 0) {
                sum += arr.get(i) % 10;
            } else {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int countNums_Problem_4_4f3102fe_1958_4036_a7c1_cf1d820f727a(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0 && x % 10 != 0).count();
    }

    
    public static int countNums_Problem_4_d71379c6_9616_45eb_a9ec_7e488fabd3c4(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer l : arr) {
            if (l > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_3_c7188f9d_c628_4b39_86c0_a3e649aa2c82(ArrayList<Integer> arr) {

        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int countNums_Problem_5_e12d71d7_e44b_4e17_abce_60100b3610e2(ArrayList<Integer> arr) {
        int count = 0;
        for (Integer i : arr) {
            if (i < 0) {
                count += Math.abs(i) % 10;
            } else {
                count += i % 10;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_5_fd0da131_6ae5_4ac0_9570_3f5eb89fe8af(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer num : arr) {
            if (num > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_2_1ea213d6_362a_4c5c_aca8_693123b9da60(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0 && x % 10 > 0).count();
    }

    
    public static int countNums_Problem_3_98606f5a_a023_479c_8983_eb802bdcb1ed(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> Math.abs(x) % 9 != 0).count();
    }

    
    public static int countNums_Problem_2_de5c68d1_3232_4afa_b071_34157a20c115(ArrayList<Integer> arr) {

        int sum = 0;
        for (Integer n : arr) {
            if (n < 0) {
                sum += n % 10;
            } else {
                sum += n;
            }
        }
        return sum;
    }

    
    public static int countNums_Problem_2_dc16bff2_b9f2_4386_a9a6_480b91ed17d8(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            int sum = 0;
            while (i != 0) {
                sum += i % 10;
                i /= 10;
            }
            if (sum > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_6_903ebd11_16a3_467e_af6b_459c4c40f3dd(ArrayList<Integer> arr) {

        // Write your code here
        return arr.stream().filter(x -> x < 0 ? x % 10 == 0 : x % 10 > 0).count();
    }

    
    public static int countNums_Problem_0_e79c01a6_5b18_4418_9714_4aafce2e633c(ArrayList<Integer> arr) {

        int count = 0;
        for (int num : arr) {
            if (num > 0) {
                int sum = 0;
                while (num > 0) {
                    sum += num % 10;
                    num /= 10;
                }
                if (sum > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_0_c93af3bf_35df_43b4_bc8f_e7bed5f5a05c(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> Math.abs(x) > 0).count();
    }

    
    public static int countNums_Problem_0_30b7735c_60c0_44aa_b4e3_b4829e337344(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0 && (x % 10) > 0).count();
    }

    
    public static int countNums_Problem_6_c04cea67_d1ab_4ec6_b393_a63de15e1372(ArrayList<Integer> arr) {
        int ans = 0L;
        for (int l : arr) {
            ans += l > 0 ? l % 10L : 0;
        }
        return ans;
    }

    
    public static int countNums_Problem_5_493adbdd_9e88_4ae2_9eaf_f91e9016889b(ArrayList<Integer> arr) {

        int count = 0;
        for (int num : arr) {
            int sum = 0;
            while (num != 0) {
                sum += num % 10;
                num /= 10;
            }
            if (sum > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_7_a52dedd4_8445_4c61_9b7b_ef1d288ac4c3(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> Math.abs(x) > 0).count();
    }

    
    public static int countNums_Problem_2_efc781f8_8efc_49f9_a3b3_7df22586ea62(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            int sum = 0;
            while (i != 0) {
                sum += i % 10;
                i /= 10;
            }
            if (sum > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_1_c96bbaad_4c49_468d_9195_e18445aa9243(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> Math.abs(x) > 0).count();
    }

    
    public static int countNums_Problem_5_4f58a50b_9bbe_44c3_b7ac_1f80b7f9d61b(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0).count();
    }

    
    public static int countNums_Problem_6_cbaa461e_a026_48a9_97b5_7418720eefaa(ArrayList<Integer> arr) {
        int res = 0;
        for (Integer e : arr)
            if (e > 0)
                res += e;
        return res;
    }

    
    public static int countNums_Problem_2_6ed806b7_52a3_41db_aebc_44837ea25674(ArrayList<Integer> arr) {

        int count = 0;
        for (int num : arr) {
            int sum = 0;
            while (num != 0) {
                sum += num % 10;
                num /= 10;
            }
            if (sum > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_6_9ddf584d_81b9_4b85_8536_20c309955b62(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> Math.abs(x) % 9 != 0).count();
    }

    
    public static int countNums_Problem_7_bafe9fc9_6828_479c_a100_9d4f69f5c78a(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            if (i < 0) {
                count += (i % 10);
            } else {
                count += (i % 10);
            }
        }
        return count;
    }

    
    public static int countNums_Problem_0_5e4544d6_e837_41f5_af69_b7d0563ae0eb(ArrayList<Integer> arr) {

        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) < 0) {
                sum += arr.get(i) % 10;
            } else {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int countNums_Problem_4_1884cef5_2aa9_4b7b_8b9f_2141925f9bf7(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer n : arr) {
            if (n < 0) {
                count += (n % 10);
            } else {
                count += (n % 10);
            }
        }
        return count;
    }

    
    public static int countNums_Problem_6_a125f9da_fa9c_447f_b867_01c3328ad7ad(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> Math.abs(x) > 0).count();
    }

    
    public static int countNums_Problem_6_caf04899_01fe_45bc_a617_817d87e358e6(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer num : arr) {
            if (num > 0) {
                int sum = 0;
                while (num > 0) {
                    sum += num % 10;
                    num /= 10;
                }
                if (sum > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_1_ff367049_6cf8_4a58_a076_8b114cea2c65(ArrayList<Integer> arr) {
        int result = 0;
        for (int i = 0; i < arr.size(); i++) {
            Integer v = arr.get(i);
            if (v < 0)
                v = -(v);
            result += Math.pow(10, (v >> 48) - 1) * Math.pow(10, (v >> 32) - 1) * Math.pow(10, (v >> 16) - 1) * Math.pow(10, (v >> 8) - 1) * Math.pow(10, (v >> 0) - 1);
        }
        return result;
    }

    
    public static int countNums_Problem_6_9af3d54d_f86b_4e6d_bed6_daa044dd78df(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            if (i > 0) {
                if (i < 10) {
                    count++;
                } else {
                    int sum = 0;
                    while (i > 0) {
                        sum += i % 10;
                        i /= 10;
                    }
                    if (sum > 0) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_2_5681f585_c4a7_4062_b320_90aa0e6071a4(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer l : arr) {
            if (l > 0) {
                count += l;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_4_10916bdd_512c_487e_af23_650c42f482e8(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            if (i > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_1_7c0a5505_589e_4ad3_866a_a94460c9067f(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0).map(x -> x.toString().chars().map(c -> c - '0').sum()).count();
    }

    
    public static int countNums_Problem_6_474fcba4_affc_4647_a907_0f4bdb0ebaa7(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer num : arr) {
            if (num > 0) {
                count += num;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_0_0add751d_bcc8_4553_b62a_149af8a77686(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> Math.abs(x) > 0).count();
    }

    
    public static int countNums_Problem_3_c643bf14_99be_4883_a802_24338adc37ab(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            if (i > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_5_0a389bb7_ecb0_4459_bb97_84efb7776871(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            if (i > 0) {
                int sum = 0;
                while (i > 0) {
                    sum += i % 10;
                    i /= 10;
                }
                if (sum > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_7_693452d7_56a5_447a_99ff_5bba5d52a3a2(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            if (i > 0) {
                int sum = 0;
                while (i > 0) {
                    sum += i % 10;
                    i /= 10;
                }
                if (sum > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_7_629068ed_7815_44c4_ace9_d549aa96a149(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0 && (x % 10) > 0).count();
    }

    
    public static int countNums_Problem_2_53c6bff9_0ba8_4188_a29b_150e6ed993d1(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            int sum = 0;
            while (i != 0) {
                sum += i % 10;
                i /= 10;
            }
            if (sum > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_0_7f454c4b_df69_49cc_a7fe_1286bd798399(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer num : arr) {
            if (num > 0) {
                int sum = 0;
                while (num > 0) {
                    sum += num % 10;
                    num /= 10;
                }
                if (sum > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_2_ba9e94c9_1590_4a52_92df_b4b2da66782f(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> Math.abs(x) > 0).count();
    }

    
    public static int countNums_Problem_1_1928dea1_5a29_4027_a6fa_3086f369f47e(ArrayList<Integer> arr) {
        return arr.stream().filter(x -> Math.abs(x) > 0).count();
    }

    
    public static int countNums_Problem_7_1c53849b_9d40_415c_9add_ec32ec4ea21f(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> Math.abs(x) > 0).count();
    }

    
    public static int countNums_Problem_1_01bc47c2_c107_4654_8c7a_cf4460ec5cfe(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            if (i > 0) {
                if (i < 10) {
                    count++;
                } else {
                    int sum = 0;
                    while (i > 0) {
                        sum += i % 10;
                        i /= 10;
                    }
                    if (sum > 0) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_5_f849769e_99d3_49eb_8de5_a744bc0ca548(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> Math.abs(x) > 0).count();
    }

    
    public static int countNums_Problem_6_f48e3daa_6cb0_4cf5_a658_33352bdbe853(ArrayList<Integer> arr) {
        int sum = 0;
        for (Integer val : arr) {
            sum += val;
        }
        return sum;
    }

    
    public static int countNums_Problem_5_05851248_5fc5_452a_94cc_5359baccff22(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> Math.abs(x) > 0).count();
    }

    
    public static int countNums_Problem_2_555fd757_ea14_4b6a_92fe_07936bdab221(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            if (i > 0) {
                int sum = 0;
                while (i > 0) {
                    sum += i % 10;
                    i /= 10;
                }
                if (sum > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_6_147cc9b8_5e76_42ee_9995_a4b26a76dc99(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer num : arr) {
            if (num > 0) {
                count += num;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_4_d89693f9_cd3c_4c0b_ad9e_dc81594500a1(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            if (i > 0) {
                int sum = 0;
                while (i > 0) {
                    sum += i % 10;
                    i /= 10;
                }
                if (sum > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_7_53c6bff9_0ba8_4188_a29b_150e6ed993d1(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            int sum = 0;
            while (i != 0) {
                sum += i % 10;
                i /= 10;
            }
            if (sum > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_2_1c53849b_9d40_415c_9add_ec32ec4ea21f(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> Math.abs(x) > 0).count();
    }

    
    public static int countNums_Problem_2_0b5b3a9e_ef3e_4e99_a15f_7cd439ef24c3(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            if (i > 0) {
                int sum = 0;
                while (i > 0) {
                    sum += i % 10;
                    i /= 10;
                }
                if (sum > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_6_2db8fbb4_325b_409f_90dc_f867b651ebc5(ArrayList<Integer> arr) {
        int nums = 0;
        for (Integer num : arr) {
            final int sum = num.intValue();
            for (int i = -1000; i <= 1000; i++) {
                if (sum % i == 0) {
                    nums++;
                    break;
                }
            }
        }
        return nums;
    }

    
    public static int countNums_Problem_0_de7d7365_e785_44c4_b633_3b287c6d8f0f(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            int sum = 0;
            while (i != 0) {
                sum += i % 10;
                i /= 10;
            }
            if (sum > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_3_501f3674_444d_428c_baa2_4f5759fa3975(ArrayList<Integer> arr) {
        // write your logic here
        int count = 0L;
        if (arr.size() > 0) {
            Integer temp =  arr.get(0);
            while (arr.size() > 1) {
                int temp_int = 0;
                for (int i = 1; i < arr.size(); i++) {
                    if (arr.get(i) > 0) {
                        temp_int += arr.get(i).intValue();
                    } else {
                        temp_int += (temp_int < 0 ? temp : -temp);
                        temp_int = temp_int % 10;
                    }
                }
                if (temp_int > 0) {
                    count += temp_int;
                }
                temp =  arr.get(0);
            }
        }
        return count;
    }

    
    public static int countNums_Problem_7_c7188f9d_c628_4b39_86c0_a3e649aa2c82(ArrayList<Integer> arr) {

        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int countNums_Problem_4_986173bf_bbd3_4495_8251_052ab6bde857(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            int sum = 0;
            while (i != 0) {
                sum += i % 10;
                i /= 10;
            }
            if (sum > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_0_8ac4bf3d_963e_4811_9f80_219d5e5e73b1(ArrayList<Integer> arr) {
        // use Streams to count the digits of every number in the array
        return arr.stream()
            .filter(x -> x >= 0) // filter to keep only positive numbers
            .map(x -> x % 10)
            .distinct() // remove duplicates
            .count();
    }

    
    public static int countNums_Problem_1_023cd291_0b46_4e3a_8140_27b03ea9e2cd(ArrayList<Integer> arr) {

        int count = 0;
        for (int num : arr) {
            if (num < 0) {
                num = -num;
            }
            while (num > 0) {
                count += num % 10;
                num /= 10;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_0_5e32ad8b_79ac_40f7_a9d9_e37b1b6c7a5e(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            int sum = 0;
            while (i != 0) {
                sum += i % 10;
                i /= 10;
            }
            if (sum > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_5_83d8fe70_0998_42c4_bedf_967efff543b8(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            if (i > 0) {
                int sum = 0;
                while (i > 0) {
                    sum += i % 10;
                    i /= 10;
                }
                if (sum > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_2_24301114_faa6_4665_a499_5df9fd89f42f(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> Math.abs(x) > 0).count();
    }

    
    public static int countNums_Problem_6_caf2ccec_a8cf_4fd7_b322_84fca1212947(ArrayList<Integer> arr) {

        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_0_ff5987ee_e465_4b17_91c4_18c53fd02108(ArrayList<Integer> arr) {
        return arr.stream().filter(l -> l.intValue() > 0).count();
    }

    
    public static int countNums_Problem_7_9f853432_8ead_44b9_96f2_faa478ec73b0(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0).count();
    }

    
    public static int countNums_Problem_4_30f9b897_24e8_4f8b_a7d9_657a516e96c4(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> Math.abs(x) > 0).count();
    }

    
    public static int countNums_Problem_2_70b1017d_d065_4d2c_b6d2_f11e14cb1d46(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> Math.abs(x) > 0).count();
    }

    
    public static int countNums_Problem_7_50010bac_e9a6_43ed_bf1b_b5879ab5654a(ArrayList<Integer> arr) {
        if (arr.isEmpty())
            return 0;
        int n = 0;
        int first =  arr.get(0);
        if (first < 0) return 0;
        for (Integer d : arr)
            n += first * 10 + d;
        return n;
    }

    
    public static int countNums_Problem_0_e86635b0_12fa_4d9b_93dc_5522fc5763d3(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer l : arr) {
            if (l > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_0_0b5b3a9e_ef3e_4e99_a15f_7cd439ef24c3(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            if (i > 0) {
                int sum = 0;
                while (i > 0) {
                    sum += i % 10;
                    i /= 10;
                }
                if (sum > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_6_4fe20e5b_b25f_48e2_83cb_9fd4f2fc1251(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> Math.abs(x) > 0).count();
    }

    
    public static int countNums_Problem_6_76a921fe_02ac_4381_8b76_685f90b45674(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0 && x % 10 != 0).count();
    }

    
    public static int countNums_Problem_6_af310107_4914_4014_b269_913faebcdf42(ArrayList<Integer> arr) {

        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int countNums_Problem_2_4666e62c_276f_4152_b277_4043f30ca7c6(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer num : arr) {
            if (num > 0) {
                count += num;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_7_4d618a13_d69c_4da6_90f0_79c20c6eb404(ArrayList<Integer> arr) {
        if (arr.isEmpty()) return (0L);
        Integer sum = 0L;
        int digitSum = 0L;
        for(int i = 0; i < arr.size(); i++) {
            sum += (arr.get(i).intValue() % 10);
            digitSum += arr.get(i).intValue() % 10;
        }
        if (sum > 0 && digitSum > 0) {
            return  Math.ceil((double)digitSum * Math.pow(10, arr.size() - 1));
        }
        return (0L);
    }

    
    public static int countNums_Problem_3_a16b6cd9_a555_42b4_9358_737a6c5e0a60(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0 && x % 10 != 0).count();
    }

    
    public static int countNums_Problem_7_e12d71d7_e44b_4e17_abce_60100b3610e2(ArrayList<Integer> arr) {
        int count = 0;
        for (Integer i : arr) {
            if (i < 0) {
                count += Math.abs(i) % 10;
            } else {
                count += i % 10;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_5_3c0912e4_bdb5_465b_92de_24d974e73311(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer l : arr) {
            if (l > 0) {
                count += l;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_2_b071764a_2752_4119_8dce_fa8ee339730a(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> Math.abs(x) > 0).count();
    }

    
    public static int countNums_Problem_0_d8149be0_03ac_4353_9eef_755427f80ce6(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            int sum = 0;
            while (i != 0) {
                sum += i % 10;
                i /= 10;
            }
            if (sum > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_7_2558a93b_8191_4574_8c4d_33cab2d0ea69(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer l : arr) {
            if (l > 0) {
                int sum = 0;
                while (l > 0) {
                    sum += l % 10;
                    l /= 10;
                }
                if (sum > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_0_ea20fe18_7874_494d_8b81_c0aa5f77b950(ArrayList<Integer> arr) {
        // Write your code here
        int sum = 0;
        for (int num : arr)
            sum += num;
        if (sum < 0)
            sum *= -1;
        int count = 0;
        for (int num : arr)
            count += Math.abs(num % 10);
        return count;
    }

    
    public static int countNums_Problem_4_0b6f7c05_6e6c_40d5_98f5_fbb7756498b7(ArrayList<Integer> arr) {

        int count = 0;
        for (int num : arr) {
            if (num > 0) {
                int sum = 0;
                while (num > 0) {
                    sum += num % 10;
                    num /= 10;
                }
                if (sum > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_1_ae61d976_322b_4a20_9834_b6b7d8762689(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0).mapToInteger(x -> {
            int sum = 0;
            while (x > 0) {
                sum += x % 10;
                x /= 10;
            }
            return sum;
        }).filter(x -> x > 0).count();
    }

    
    public static int countNums_Problem_6_61d9d584_11da_4083_89ee_b7b2b6afba4c(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0).count();
    }

    
    public static int countNums_Problem_2_1ecaa3a3_328c_4a44_b858_2448d0893bad(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            if (i > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_2_da65f4b7_0a4b_446a_966c_f963a46c1db4(ArrayList<Integer> arr) {

        int count = 0;
        for (int num : arr) {
            if (num > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_3_a79241c9_7012_4fde_a1e8_97f5d61462b3(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> Math.abs(x) > 0).count();
    }

    
    public static int countNums_Problem_7_ae61d976_322b_4a20_9834_b6b7d8762689(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0).mapToInteger(x -> {
            int sum = 0;
            while (x > 0) {
                sum += x % 10;
                x /= 10;
            }
            return sum;
        }).filter(x -> x > 0).count();
    }

    
    public static int countNums_Problem_0_119f7bc6_d456_440a_aff6_485b278def89(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0).count();
    }

    
    public static int countNums_Problem_0_27a3ffa6_dfaf_47ff_b247_e474a40326c4(ArrayList<Integer> arr) {

        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_0_cb3c7476_17f3_41b6_b71f_75d29011e2a4(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer l : arr) {
            if (l > 0) {
                count += l;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_5_e17f287b_9a71_46e0_ad7f_3cbb787a24b0(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0 && x % 10 > 0).count();
    }

    
    public static int countNums_Problem_3_ca214c16_81ee_4e90_8661_88bd61678a60(ArrayList<Integer> arr) {
        int sum = 0, count = 1;
        for(int i = 0; i < arr.size(); i++) {
            sum += Math.abs(arr.get(i));
            count += arr.contains(Math.abs(arr.get(i))) ? 1 : 0;
        }
        return sum;
    }

    
    public static int countNums_Problem_7_8dd69a6a_db4a_4c0b_8d9c_3dfade123cbf(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            int sum = 0;
            while (i != 0) {
                sum += i % 10;
                i /= 10;
            }
            if (sum > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_6_6a49699a_b2f2_475c_b0cc_fcdeb250dfd6(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> Math.abs(x) > 0).count();
    }

    
    public static int countNums_Problem_5_6ad14d26_ef8f_498d_91e8_b96cab71a109(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0 && x % 10 != 0).count();
    }

    
    public static int countNums_Problem_1_cf7aa7ef_0b41_4561_8fbc_80e8868efbd3(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0 && x % 10 != 0).count();
    }

    
    public static int countNums_Problem_2_af539267_9023_4cd9_be0c_bfbceeeadf68(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0).count();
    }

    
    public static int countNums_Problem_7_30f9b897_24e8_4f8b_a7d9_657a516e96c4(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> Math.abs(x) > 0).count();
    }

    
    public static int countNums_Problem_3_a13fe099_cba6_46c6_92a5_68abdf80e7df(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> Math.abs(x) > 0).count();
    }

    
    public static int countNums_Problem_4_99397586_947b_4143_bdeb_bd26401ebe63(ArrayList<Integer> arr) {
        int count = 0;
        if (arr.isEmpty()) return 0;
        Collections.sort(arr);
        for (int num : arr) {
            if (num >= 0) count += Math.abs(num) % 10;
            else count += Math.abs(num) / 10;
        }
        return count;
    }

    
    public static int countNums_Problem_0_403d2c27_5e58_47b8_b812_56bfaa554c1b(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0 && x % 10 != 0).count();
    }

    
    public static int countNums_Problem_3_a4f7c9a7_878e_4ba1_9b0c_aa01b7601819(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            if (i > 0) {
                count += 1;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_5_ace0a91f_6020_4c34_949e_1afe8138bff8(ArrayList<Integer> arr) {

        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            int n = arr.get(i);
            if (n < 0) {
                n = n * -1;
            }
            count += n;
        }
        return count;
    }

    
    public static int countNums_Problem_5_4980e646_1d95_4f2d_a3a0_e34badc66aaf(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> Math.abs(x) > 0).count();
    }

    
    public static int countNums_Problem_6_32a02a14_9a4e_428d_803c_70941c62f4d0(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            int sum = 0;
            while (i != 0) {
                sum += i % 10;
                i /= 10;
            }
            if (sum > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_0_1c97d6bb_ec32_433a_ac78_7d7e1c349f13(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            if (i > 0) {
                int sum = 0;
                while (i > 0) {
                    sum += i % 10;
                    i /= 10;
                }
                if (sum > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_5_f78bff9a_8b20_4803_9bf4_6408832181de(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            if (i > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_7_42f3f7c1_d3fc_4489_aef8_b3687fb2273c(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer i : arr) {
            if (i > 0) {
                int sum = 0;
                while (i > 0) {
                    sum += i % 10;
                    i /= 10;
                }
                if (sum > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_4_4daf16c1_6a95_47dd_acd4_9ed34e1bb6a6(ArrayList<Integer> arr) {
        // write your solution here
        return 0;
    }

    
    public static int countNums_Problem_2_7bbf436f_9cbb_4350_b67f_217077e78c03(ArrayList<Integer> arr) {

        int count = 0;
        for (int num : arr) {
            if (num < 0) {
                num = Math.abs(num);
            }
            int sum = 0;
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            if (sum > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_5_214a1b60_5b72_4942_8431_c11508789518(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> Math.abs(x) > 0).count();
    }

    
    public static int countNums_Problem_5_ee62fcba_59ac_49f2_9e9e_1532fc4f3b5f(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer x : arr) {
            if (x < 0) {
                x = x * -1;
            }
            int x_digits = 0;
            while (x > 0) {
                x_digits++;
                x = x / 10;
            }
            if (x_digits > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_5_e93d61db_6b08_4e76_8d7a_0274c20c3dba(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer num : arr) {
            if (num > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_7_8403fe0c_7c70_4e2b_b24b_7d04062f439b(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> Math.abs(x) > 0).count();
    }

    
    public static int countNums_Problem_6_e7a4196b_0201_4720_a925_26dbaea62cbc(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer l : arr) {
            if (l > 0) {
                count += l;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_3_bdd0784d_e686_4bc1_b491_0d6bdc499f43(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            if (i > 0) {
                String s = String.valueOf(i);
                int sum = 0;
                for (int j = 0; j < s.length(); j++) {
                    sum += Character.getNumericValue(s.charAt(j));
                }
                if (sum > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_1_3644f005_21f9_44be_a373_d50f9607727f(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0).map(x -> x % 10).mapToInteger(x -> x).sum();
    }

    
    public static int countNums_Problem_3_954a2fcf_fb07_4a76_9021_faed3175ad40(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer l : arr) {
            if (l > 0) {
                count += l;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_0_2ceb9a83_776b_4e6b_843a_922e5d702e80(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            if (i > 0) {
                int sum = 0;
                while (i > 0) {
                    sum += i % 10;
                    i /= 10;
                }
                if (sum > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_7_26b0aba5_19a5_437b_a4d6_42884dd170dd(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer l : arr) {
            if (l > 0) {
                count += l;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_4_bfa7bea8_eca4_41cf_ac03_b6aa6fa3ee37(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0 && x % 10 > 0).count();
    }

    
    public static int countNums_Problem_3_0cb91d9c_1611_4228_b8e7_a8ada0b33a2c(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer n : arr) {
            if (n < 0) {
                count += n % 10;
            } else {
                count += n % 10;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_7_46bb843d_325b_4c96_8b22_00365a099c94(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0 && (x % 10) > 0).count();
    }

    
    public static int countNums_Problem_2_bf600e05_0bd1_4a6b_9c11_48cdc6d7f5e2(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0).count();
    }

    
    public static int countNums_Problem_6_990eee07_de38_44d9_95d7_7a9340c25174(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer l : arr) {
            if (l > 0) {
                count += l;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_1_9af5116f_5310_43dd_b42a_acea1b67fc2b(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0).count();
    }

    
    public static int countNums_Problem_7_014f924a_0db0_4330_9fd8_7560501c7992(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            if (i > 0) {
                int sum = 0;
                while (i > 0) {
                    sum += i % 10;
                    i /= 10;
                }
                if (sum > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_6_c93af3bf_35df_43b4_bc8f_e7bed5f5a05c(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> Math.abs(x) > 0).count();
    }

    
    public static int countNums_Problem_6_5c59e77b_c61b_41a7_ac83_357efd16f671(ArrayList<Integer> arr) {
        int nums = 0;
        for (Integer n : arr)
            if (n > 0)
                nums += (n - 1) / 10;
                
        return nums;
    }

    
    public static int countNums_Problem_5_2bda7a25_656e_49c7_8dfd_31bceeccafb7(ArrayList<Integer> arr) {

        // Write your code here
        return arr.stream().filter(x -> x > 0).mapToInteger(x -> x).count();
    }

    
    public static int countNums_Problem_5_23a81f97_3030_40ef_aa65_a226facf34ba(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0 && x % 10 != 0).count();
    }

    
    public static int countNums_Problem_5_c643bf14_99be_4883_a802_24338adc37ab(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            if (i > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_5_1bffefb4_834f_490c_9d71_b7eb55d726aa(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            int sum = 0;
            while (i != 0) {
                sum += i % 10;
                i /= 10;
            }
            if (sum > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_3_7358cb3f_bb61_4e24_81b0_d0755654bff3(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer num : arr) {
            if (num > 0) {
                int sum = 0;
                while (num > 0) {
                    sum += num % 10;
                    num /= 10;
                }
                if (sum > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_0_0f31c26c_b895_4c64_9010_738301cc602e(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            if (i > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_7_2a492c38_45cf_4122_8521_c14e2407adad(ArrayList<Integer> arr) {
        int sum = 0;
        for (Integer val : arr) {
            sum += val.intValue();
        }
        return sum;
    }

    
    public static int countNums_Problem_3_20df0b7a_3e7a_46c1_9256_5c17587e44d0(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            if (i > 0) {
                int sum = 0;
                while (i > 0) {
                    sum += i % 10;
                    i /= 10;
                }
                if (sum > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_1_53c6bff9_0ba8_4188_a29b_150e6ed993d1(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            int sum = 0;
            while (i != 0) {
                sum += i % 10;
                i /= 10;
            }
            if (sum > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_0_a272458a_b399_4dc4_8d7a_a11978f2f6ea(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> Math.abs(x) > 0).count();
    }

    
    public static int countNums_Problem_7_ecdd04c1_7bf0_4d6b_8a38_fa3305e019f3(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0).count();
    }

    
    public static int countNums_Problem_2_4bba5b93_692f_4928_9190_2fcf79928417(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0).count();
    }

    
    public static int countNums_Problem_5_26169975_5120_4e18_8dc5_704a869ed6d8(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> Math.abs(x) > 0).count();
    }

    
    public static int countNums_Problem_5_fe245933_1bf8_4bfd_8af0_f1b90d2ad974(ArrayList<Integer> arr) {
        int count = 0;
        for (Integer l : arr) {
            int n = Math.abs(l);
            count +=  Math.pow(10, arr.indexOf(n) + 1) - 1;
        }
        return count;
    }

    
    public static int countNums_Problem_3_b33c4c5a_15f9_4f2a_a2af_f856a5381a6d(ArrayList<Integer> arr) {
        int sum = 0;
        for (Integer l : arr) {
            sum += Math.abs(l);
        }
        return sum;
    }

    
    public static int countNums_Problem_4_68204905_d9e5_4015_9836_d52c65dae3de(ArrayList<Integer> arr) {

        int count = 0;
        for (int num : arr) {
            if (num > 0) {
                int sum = 0;
                while (num > 0) {
                    sum += num % 10;
                    num /= 10;
                }
                if (sum > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_6_73d2e66e_fc2d_4964_bbd2_50d29d72b83c(ArrayList<Integer> arr) {
        if (arr.isEmpty()) return (0);
        int count = 0;
        for (int i : arr) {
            if (i > 0) count += i;
            else if ((i & Integer.MIN_VALUE) > 0) count += Integer.MIN_VALUE;
        }
        return count;
    }

    
    public static int countNums_Problem_0_876983ad_9e84_4473_99f1_fb58d56030bc(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0 && (x % 10) > 0).count();
    }

    
    public static int countNums_Problem_6_4666e62c_276f_4152_b277_4043f30ca7c6(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer num : arr) {
            if (num > 0) {
                count += num;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_7_2a48330a_6fc2_4083_8131_f0017a609315(ArrayList<Integer> arr) {

        int count = 0;
        for (int num : arr) {
            if (num > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_1_a72f9772_b000_448a_ba70_7a6f6461f914(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> Math.abs(x) > 0).count();
    }

    
    public static int countNums_Problem_1_98606f5a_a023_479c_8983_eb802bdcb1ed(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> Math.abs(x) % 9 != 0).count();
    }

    
    public static int countNums_Problem_4_221e3b25_a126_4576_bd43_0731241ef2ba(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer i : arr) {
            if (i > 0) {
                int sum = 0;
                while (i > 0) {
                    sum += i % 10;
                    i /= 10;
                }
                if (sum > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_4_eb13cd91_196c_4c00_9609_32c3ce6f59d5(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            int sum = 0;
            while (i != 0) {
                sum += i % 10;
                i /= 10;
            }
            if (sum > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_1_0051274c_ca2f_4dbb_b26b_906ea723b763(ArrayList<Integer> arr) {

        return arr.stream().filter(num -> {
            String numStr = num.toString();
            String[] numStrArr = numStr.split("");
            return numStrArr.length > 1 && numStrArr.length == numStr.length() && numStrArr.length == numStr.replaceAll("-", "").length();
        }).count();
    }

    
    public static int countNums_Problem_2_1cbb9ef4_967d_44d0_a523_01f323a5e637(ArrayList<Integer> arr) {

        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) < 0) {
                sum += (arr.get(i) % 10);
            } else {
                sum += (arr.get(i) % 10);
            }
        }
        return sum;
    }

    
    public static int countNums_Problem_1_efc781f8_8efc_49f9_a3b3_7df22586ea62(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            int sum = 0;
            while (i != 0) {
                sum += i % 10;
                i /= 10;
            }
            if (sum > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_0_63288411_bf5c_4d8f_80bc_d4fb08bc6d93(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0 && x % 10 != 0).count();
    }

    
    public static int countNums_Problem_4_a84e5d15_61bd_422a_b0ce_d9fb9cd6cf25(ArrayList<Integer> arr) {

        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                count += 1;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_4_042f4d94_be38_453d_8b33_1b26f26b6b93(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0 && x % 10 != 0).count();
    }

    
    public static int countNums_Problem_7_7f454c4b_df69_49cc_a7fe_1286bd798399(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer num : arr) {
            if (num > 0) {
                int sum = 0;
                while (num > 0) {
                    sum += num % 10;
                    num /= 10;
                }
                if (sum > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_3_1e613fc8_aeff_400b_b890_0fccf0fb5c10(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0 && x % 10 != 0).count();
    }

    
    public static int countNums_Problem_0_0b05b989_3ed7_4994_8897_879815fa1916(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer l : arr) {
            if (l > 0) {
                count += l;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_3_866cbb0d_8e43_4bf5_a5b2_a9a8bc218059(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> Math.abs(x) > 0).count();
    }

    
    public static int countNums_Problem_0_42b882cf_a3cc_43ad_8e59_e2b26da8e8db(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer l : arr) {
            if (l > 0) {
                count += l;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_4_b200b562_aad3_4f52_be80_fdccefb8316b(ArrayList<Integer> arr) {
        int sum = 0;
        boolean negative = False;
        boolean negativeSigned = False;
        for (int i = 0; i < arr.size(); i++) {
            int num = arr.get(i);
            sum += num;
            if (num < 0) {
                negativeSigned = True;
            } else {
                negativeSigned = False;
            }
            if (i == 0 || num < 0) {
                negative = True;
            }
        }
        if (negative && negativeSigned) {
            throw new RuntimeException("Negative and positive numbers.");
        }
        return sum;
    }

    
    public static int countNums_Problem_4_0b5b3a9e_ef3e_4e99_a15f_7cd439ef24c3(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            if (i > 0) {
                int sum = 0;
                while (i > 0) {
                    sum += i % 10;
                    i /= 10;
                }
                if (sum > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_4_e850074b_ce5d_47a2_9bd1_43ac7f15e158(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0).map(x -> x.toString().chars().map(c -> c - '0').sum()).filter(x -> x > 0).count();
    }

    
    public static int countNums_Problem_3_778d2da2_41ac_4f46_a807_1dfb77893c43(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> Math.abs(x) > 0).count();
    }

    
    public static int countNums_Problem_4_1cbb9ef4_967d_44d0_a523_01f323a5e637(ArrayList<Integer> arr) {

        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) < 0) {
                sum += (arr.get(i) % 10);
            } else {
                sum += (arr.get(i) % 10);
            }
        }
        return sum;
    }

    
    public static int countNums_Problem_0_9af5116f_5310_43dd_b42a_acea1b67fc2b(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0).count();
    }

    
    public static int countNums_Problem_0_92839b16_7013_4782_b800_40228bf495ce(ArrayList<Integer> arr) {

        int sum = 0;
        for (int n : arr) {
            if (n < 0) {
                sum += (n % 10);
            } else {
                sum += n;
            }
        }
        return sum;
    }

    
    public static int countNums_Problem_7_c93af3bf_35df_43b4_bc8f_e7bed5f5a05c(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> Math.abs(x) > 0).count();
    }

    
    public static int countNums_Problem_1_52499aaa_6632_4e84_8085_1ae9ac6067ab(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer num : arr) {
            if (num > 0) {
                int sum = 0;
                while (num > 0) {
                    sum += num % 10;
                    num /= 10;
                }
                if (sum > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_3_4efa2523_f75d_4087_8f14_dd89856d6498(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer l : arr) {
            if (l > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_1_28e26eb7_7d3d_4760_86f8_9c4b1ab2874a(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0).mapToInteger(x -> Integer.parseInteger(x.toString().replaceAll("-", ""))).sum();
    }

    
    public static int countNums_Problem_3_caf04899_01fe_45bc_a617_817d87e358e6(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer num : arr) {
            if (num > 0) {
                int sum = 0;
                while (num > 0) {
                    sum += num % 10;
                    num /= 10;
                }
                if (sum > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_6_8c559e46_f6f3_412c_96c3_84245f4f39e1(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer num : arr) {
            if (num > 0) {
                int sum = 0;
                while (num > 0) {
                    sum += num % 10;
                    num /= 10;
                }
                if (sum > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_3_f9153e9d_2310_4108_a2c1_5aeada0a20c1(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0).count();
    }

    
    public static int countNums_Problem_7_70f2b06b_246b_4794_bd58_e0fc76920d15(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0 && x % 10 != 0).count();
    }

    
    public static int countNums_Problem_3_e5c45bd3_035a_4eee_9a91_4fa8b2d02629(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer num : arr) {
            if (num > 0) {
                int sum = 0;
                while (num > 0) {
                    sum += num % 10;
                    num /= 10;
                }
                if (sum > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_1_841d198e_e7e8_4f38_a7da_637516550787(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            if (i > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_2_67e1f515_ab32_44f5_a984_f89f7756e36c(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            if (i > 0) {
                int sum = 0;
                while (i > 0) {
                    sum += i % 10;
                    i /= 10;
                }
                if (sum > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_7_7f62cc56_3ff1_4cd3_9ff8_376a8ddf78ca(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer num : arr) {
            if (num > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_7_24fb877f_c0ea_42ac_89b3_f803408f0524(ArrayList<Integer> arr) {

        int count = 0;
        for (int num : arr) {
            if (num > 0) {
                int sum = 0;
                while (num > 0) {
                    sum += num % 10;
                    num /= 10;
                }
                if (sum > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_4_f51e9c6a_714b_429a_99bd_d3b7f7457a28(ArrayList<Integer> arr) {
        int sum = 0;
        for (Integer i : arr) {
            sum += i;
        }
        return sum;

    }

    
    public static int countNums_Problem_2_1623ea02_deff_4c3b_8f2a_2f5a0c632859(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            int sum = 0;
            while (i != 0) {
                sum += i % 10;
                i /= 10;
            }
            if (sum > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_2_576c0270_6042_4ba2_a27a_201195fab2c2(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0 && x % 10 != 0).count();
    }

    
    public static int countNums_Problem_6_eb13cd91_196c_4c00_9609_32c3ce6f59d5(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            int sum = 0;
            while (i != 0) {
                sum += i % 10;
                i /= 10;
            }
            if (sum > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_5_0d548398_3b4c_4e13_9d4f_c02dfc871dac(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer l : arr) {
            if (l > 0) {
                int sum = 0;
                while (l > 0) {
                    sum += l % 10;
                    l /= 10;
                }
                if (sum > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_6_bf600e05_0bd1_4a6b_9c11_48cdc6d7f5e2(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0).count();
    }

    
    public static int countNums_Problem_2_4ed7851f_2e91_47a2_a843_e2ab23efb532(ArrayList<Integer> arr) {

        int count = 0;
        for (int num : arr) {
            int sum = 0;
            while (num != 0) {
                sum += num % 10;
                num /= 10;
            }
            if (sum > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_1_d9dce561_d961_4663_8f77_db304b2ab001(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer num : arr) {
            if (num > 0) {
                int sum = 0;
                while (num > 0) {
                    sum += num % 10;
                    num /= 10;
                }
                if (sum > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_7_221e3b25_a126_4576_bd43_0731241ef2ba(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer i : arr) {
            if (i > 0) {
                int sum = 0;
                while (i > 0) {
                    sum += i % 10;
                    i /= 10;
                }
                if (sum > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_0_107440d5_d66f_497b_9340_75a54968a018(ArrayList<Integer> arr) {
        return arr.stream().filter((item) -> item.intValue() > 0)
            .mapToInteger((item) -> item.intValue()).count();
    }

    
    public static int countNums_Problem_1_86f9bc6d_1077_49a9_9a0a_a7ab9ced2918(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> Math.abs(x) % 9 != 0).count();
    }

    
    public static int countNums_Problem_6_d0eccfa9_8326_47bc_96e4_f43345111bbc(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer num : arr) {
            if (num > 0) {
                count += num;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_1_241d4e4c_06d2_48dd_9d6a_16067506fd43(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            if (i > 0) {
                int sum = 0;
                while (i > 0) {
                    sum += i % 10;
                    i /= 10;
                }
                if (sum > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_7_977f7658_aed7_43b9_82fb_57682f826de0(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0 && x % 10 > 0).count();
    }

    
    public static int countNums_Problem_5_778d2da2_41ac_4f46_a807_1dfb77893c43(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> Math.abs(x) > 0).count();
    }

    
    public static int countNums_Problem_7_6a47bff8_e889_41f1_8c9a_4ed77fe95ac0(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer num : arr) {
            if (num > 0) {
                int sum = 0;
                while (num > 0) {
                    sum += num % 10;
                    num /= 10;
                }
                if (sum > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_7_e5f4560d_e4bb_4a9b_a9ee_fc535c670ab4(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer l : arr) {
            if (l > 0) {
                count++;
            } else {
                int sum = 0;
                while (l < 0) {
                    sum += l % 10;
                    l /= 10;
                }
                if (sum > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_0_99ef846c_80c7_4013_af5e_5c71082b45bb(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer num : arr) {
            if (num > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_2_2c9c1c01_e6a1_4e8c_aac5_2fc43f295f0b(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0 && x % 10 != 0).count();
    }

    
    public static int countNums_Problem_0_1e613fc8_aeff_400b_b890_0fccf0fb5c10(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0 && x % 10 != 0).count();
    }

    
    public static int countNums_Problem_5_84bfd40d_e603_4f6c_9037_1395be9b20e3(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer n : arr) {
            if (n < 0) {
                count += n % 10;
            } else {
                count += n % 10;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_3_eaaca435_3215_472d_a37c_13a2b8a2c287(ArrayList<Integer> arr) {
        int sum = 0;
        for (Integer n : arr) {
            sum += n % 10;
        }
        return sum;
    }

    
    public static int countNums_Problem_5_a586b6a9_91d6_4965_af84_f6ac4848edbf(ArrayList<Integer> arr) {
        int sum = 0;
        for (Integer x : arr)
            if (x > 0)
                sum += x;
        return sum;
    }

    
    public static int countNums_Problem_3_b04a7c72_3b55_45ac_9aa9_8874b13858ef(ArrayList<Integer> arr) {

        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_3_81dc2557_5ccf_49af_80fb_52c9f3cc4cdd(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer l : arr) {
            if (l < 0) {
                count += l % 10;
            } else {
                count += l;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_2_ec2f79fc_4bb2_4ced_b244_abb58111b971(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            if (i > 0) {
                int sum = 0;
                while (i > 0) {
                    sum += i % 10;
                    i /= 10;
                }
                if (sum > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_0_2242adfa_72f4_46f3_8b1a_a6fb3bff5758(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0 && x % 10 > 0).count();
    }

    
    public static int countNums_Problem_6_dc7324f2_991f_4301_ae17_2619b3d740da(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            if (i > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_1_3066c044_02fb_4ea3_af4b_524c3811d71f(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0).count();
    }

    
    public static int countNums_Problem_1_b88cdbcd_9908_4c3f_9ca9_0bf1943a5093(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer l : arr) {
            if (l > 0) {
                count++;
            } else {
                int sum = 0;
                while (l < 0) {
                    sum += l % 10;
                    l /= 10;
                }
                if (sum > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_5_737be9d4_8845_400a_ae47_4144de5ab972(ArrayList<Integer> arr) {

        int sum = 0;
        for (Integer n : arr) {
            if (n < 0) {
                sum += (n % 10);
            } else {
                sum += n;
            }
        }
        return sum;
    }

    
    public static int countNums_Problem_3_9ddf584d_81b9_4b85_8536_20c309955b62(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> Math.abs(x) % 9 != 0).count();
    }

    
    public static int countNums_Problem_2_d7808304_9d05_4f35_9592_ec878ceac2df(ArrayList<Integer> arr) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) < 0)
                arr.set(i, arr.get(i) * -1);
            while (arr.get(i) >= 10) {
                arr.set(i, arr.get(i) / 10);
                count += 1;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_2_c4444219_c3e7_4632_b323_c495c135ac62(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0).count();
    }

    
    public static int countNums_Problem_4_8977157a_7dc1_4698_b9b8_e4f9adaf8a38(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            if (i > 0) {
                String str = Integer.toString(i);
                int sum = 0;
                for (int j = 0; j < str.length(); j++) {
                    sum += Character.getNumericValue(str.charAt(j));
                }
                if (sum > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_7_fa2d3b72_b4bf_4d4f_9ae0_8c915bfde1dd(ArrayList<Integer> arr) {

        return arr.stream().filter(n -> Math.abs(n) > 0).count();
    }

    
    public static int countNums_Problem_6_276a80d0_b80b_433a_8257_531fd598da60(ArrayList<Integer> arr) {
        int sum = 0;
        for(Integer l : arr) {
            sum += l;
        }
        return sum;
    }

    
    public static int countNums_Problem_6_10916bdd_512c_487e_af23_650c42f482e8(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            if (i > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_3_28dac5c0_d3e8_4123_a046_a060527467d2(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer l : arr) {
            if (l > 0) {
                count += l;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_6_3b8e8b2b_586e_4008_8906_d178f4bf6591(ArrayList<Integer> arr) {

        int count = 0;
        for (int num : arr) {
            if (num > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_3_2c9c1c01_e6a1_4e8c_aac5_2fc43f295f0b(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0 && x % 10 != 0).count();
    }

    
    public static int countNums_Problem_5_9f875514_d30f_4639_9811_0e6e3df5ced9(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> Math.abs(x) > 0).count();
    }

    
    public static int countNums_Problem_7_9325ba02_53ff_4778_b62f_34efbaf2660f(ArrayList<Integer> arr) {
        if (arr.isEmpty()) return 0;

        // A positive number has a positive first digit
        if (arr.stream().filter(i -> i >= 0).count() == 1) return 1;

        // A negative number has a negative first digit
        if (arr.stream().filter(i -> i < 0).count() == 1) return -1;

        // A number that has all digits positive has even one non-negative digit
        if (arr.stream().filter(i -> i >= 0).collect(Collectors.toSet()).contains(1)) return arr.stream().filter(i -> i >= 0).count();

        // A number that has all digits negative has even one non-negative digit
        if (arr.stream().filter(i -> i < 0).collect(Collectors.toSet()).contains(-1)) return arr.stream().filter(i -> i < 0).count();

        int sumOfDigits = 0;
        int firstNegative = arr.stream()
                .filter(i -> i < 0)
                .findFirst()
                .orElse(0);

        // Count the number that has all non-negative digits > 0
        sumOfDigits += arr.stream()
                .filter(i -> i >= 0)
                .filter(i -> i < firstNegative)
                .collect(Collectors.toSet()).size();

        // Count the number that has all non-negative digits < 0
        sumOfDigits += arr.stream()
                .filter(i -> i < 0)
                .filter(i -> i < firstNegative)
                .filter(i -> i >= 0)
                .collect(Collectors.toSet()).size();

        return sumOfDigits;
    }

    
    public static int countNums_Problem_4_d404aef0_7d00_4e40_829e_43d641069835(ArrayList<Integer> arr) {

        int count = 0;
        for (int num : arr) {
            if (num > 0) {
                count += 1;
            } else if (num < 0) {
                int sum = 0;
                while (num != 0) {
                    sum += Math.abs(num % 10);
                    num /= 10;
                }
                if (sum > 0) {
                    count += 1;
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_0_0de15b4d_1659_4ab5_a65b_768a9f7dc432(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            if (i > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_5_a2f047c7_3d6b_4640_89ed_9d4dcc4f0916(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0 && (x % 10) > 0).count();
    }

    
    public static int countNums_Problem_3_379a9df7_1036_43dd_a57f_67c76d3491fb(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0).count();
    }

    
    public static int countNums_Problem_4_558a1b25_3eb5_4912_ac5e_d522e7e5bc69(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> Math.abs(x) > 0).count();
    }

    
    public static int countNums_Problem_1_1d0efca3_f0bb_4e17_8921_17a8829322d8(ArrayList<Integer> arr) {
        int sum = 0;
        for (int num : arr) {
            if (num > 0) {
                sum += Math.abs(num);
            }
            if (num < 0) {
                sum += num * (num / Math.abs(num));
            }
        }
        return sum;
    }

    
    public static int countNums_Problem_3_5ac944b6_ee03_42af_a38c_3da5c681caa1(ArrayList<Integer> arr) {
        int count = 0;
        for (int i : arr) {
            int sum = 0;
            int v = i;
            if (v < 0) {
                v = v * -1;
            }
            while (v > 0) {
                sum += v % 10;
                v = v / 10;
            }
            if (sum > 0) {
                count += 1;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_1_185554a9_6ba9_4d99_8b2a_1b168d74d9fb(ArrayList<Integer> arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

    
    public static int countNums_Problem_2_f662ab31_53a0_4785_90dd_634dbd17c504(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> Math.abs(x) > 0).count();
    }

    
    public static int countNums_Problem_0_bafe9fc9_6828_479c_a100_9d4f69f5c78a(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            if (i < 0) {
                count += (i % 10);
            } else {
                count += (i % 10);
            }
        }
        return count;
    }

    
    public static int countNums_Problem_0_e9b013fe_c205_45e2_82f4_c336033b529e(ArrayList<Integer> arr) {

        return arr.stream().filter(n -> n > 0 && n % 10 > 0).count();
    }

    
    public static int countNums_Problem_5_715eaa98_ad5c_41b8_8dca_dbf25b0e9cd8(ArrayList<Integer> arr) {
        if (arr.isEmpty())
            return 0;
        int firstDigit = arr.get(0);
        if (firstDigit < 0) {
            firstDigit *= -1;
            arr.set(0,firstDigit);
        }
        int sum = 0;
        for (int l : arr) {
            sum += l;
        }
        return sum;
    }

    
    public static int countNums_Problem_2_9ddf584d_81b9_4b85_8536_20c309955b62(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> Math.abs(x) % 9 != 0).count();
    }

    
    public static int countNums_Problem_3_ecdd04c1_7bf0_4d6b_8a38_fa3305e019f3(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0).count();
    }

    
    public static int countNums_Problem_3_6b14b790_0e76_4d9b_9002_5670f623791f(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> Math.abs(x) > 0).count();
    }

    
    public static int countNums_Problem_1_715eaa98_ad5c_41b8_8dca_dbf25b0e9cd8(ArrayList<Integer> arr) {
        if (arr.isEmpty())
            return 0;
        int firstDigit = arr.get(0);
        if (firstDigit < 0) {
            firstDigit *= -1;
            arr.set(0,firstDigit);
        }
        int sum = 0;
        for (int l : arr) {
            sum += l;
        }
        return sum;
    }

    
    public static int countNums_Problem_0_83d8fe70_0998_42c4_bedf_967efff543b8(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            if (i > 0) {
                int sum = 0;
                while (i > 0) {
                    sum += i % 10;
                    i /= 10;
                }
                if (sum > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_2_ebf98b78_9da6_46c7_95f0_424f0e93e234(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer l : arr) {
            if (l > 0) {
                count += l;
            } else {
                count += l * -1;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_5_1c3874f3_85e0_4271_b5a4_0ca41f4e4f2d(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0 && x % 10 != 0).count();
    }

    
    public static int countNums_Problem_4_04694d8d_2794_4735_87a6_e27d619d604d(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            int sum = 0;
            while (i != 0) {
                sum += i % 10;
                i /= 10;
            }
            if (sum > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_6_cdec4f60_d4de_4ea2_a765_c6a00f570d67(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0 && x % 10 != 0).count();
    }

    
    public static int countNums_Problem_4_1c53849b_9d40_415c_9add_ec32ec4ea21f(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> Math.abs(x) > 0).count();
    }

    
    public static int countNums_Problem_1_986173bf_bbd3_4495_8251_052ab6bde857(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            int sum = 0;
            while (i != 0) {
                sum += i % 10;
                i /= 10;
            }
            if (sum > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_3_7235bd05_438a_47af_aeee_8b781c4c6187(ArrayList<Integer> arr) {

        int count = 0;
        for (int num : arr) {
            if (num < 0) {
                num = -num;
            }
            int sum = 0;
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            if (sum > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_4_82d1e594_0cc7_4f90_b2c0_544c21b9c1f2(ArrayList<Integer> arr) {
        return arr.stream().filter(x -> x.toString().chars().map(y -> y - '0').sum() > 0).count();
    }

    
    public static int countNums_Problem_6_84bfd40d_e603_4f6c_9037_1395be9b20e3(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer n : arr) {
            if (n < 0) {
                count += n % 10;
            } else {
                count += n % 10;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_0_5db36fc0_c35c_432c_b1ab_545717b039c3(ArrayList<Integer> arr) {
        int sum = 0;
        int cnt = 0;
        for(int i=0; i<arr.size(); i++) {
            sum += arr.get(i);
            if(sum < 0) {
                cnt += sum < 0 ? 1 : 0;
                sum = 0;
            } else {
                cnt += 1;
            }
        }
        return cnt;
    }

    
    public static int countNums_Problem_4_187022e9_b009_4828_971f_a406fcf4b436(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            int sum = 0;
            while (i != 0) {
                sum += i % 10;
                i /= 10;
            }
            if (sum > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_6_b39c0c40_c758_403a_904b_5b2bf3b7fbf1(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> Math.abs(x) > 0).count();
    }

    
    public static int countNums_Problem_1_1ea213d6_362a_4c5c_aca8_693123b9da60(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0 && x % 10 > 0).count();
    }

    
    public static int countNums_Problem_2_a2abcfd0_4f22_4868_b3a5_437183abb796(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> Math.abs(x) > 0).count();
    }

    
    public static int countNums_Problem_5_8ac8c01e_d8ca_4698_b57c_648bf6c70ca7(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> Math.abs(x) > 0).count();
    }

    
    public static int countNums_Problem_6_2a492c38_45cf_4122_8521_c14e2407adad(ArrayList<Integer> arr) {
        int sum = 0;
        for (Integer val : arr) {
            sum += val.intValue();
        }
        return sum;
    }

    
    public static int countNums_Problem_1_b91ac2f8_bff1_419a_a29c_7b0597b2675a(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0).map(x -> x.toString().chars().map(c -> c - 48).sum()).count();
    }

    
    public static int countNums_Problem_5_a24bb581_35c3_480a_9d4f_12a4e04548bd(ArrayList<Integer> arr) {

        int count = 0;
        for (int num : arr) {
            int sum = 0;
            while (num != 0) {
                sum += num % 10;
                num /= 10;
            }
            if (sum > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_3_f256f790_213d_4f1f_87f8_d412414b94d5(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer l : arr) {
            if (l > 0) {
                count += l;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_2_c6e7c926_9681_4471_ab49_8d1f6c8432dd(ArrayList<Integer> arr) {
        if (arr.size() == 0) {
            return 0;
        }
        Set<Integer> set = new HashSet<Integer>();
        for (Integer l : arr) {
            if (l < 0) {
                l = -l;
            }
            set.add(l);
        }
        int ret = 0;
        for (Integer l : arr) {
            if (set.contains(Math.abs(l))) { // abs() returns positive if positive, negative if negative
                ret++;
            }
        }
        return ret;
    }

    
    public static int countNums_Problem_4_474fcba4_affc_4647_a907_0f4bdb0ebaa7(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer num : arr) {
            if (num > 0) {
                count += num;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_0_572ac331_8252_4c52_a46f_14168a1798d4(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer num : arr) {
            if (num > 0) {
                count += num;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_4_c6d42dba_821d_4edf_ba20_08427c337b02(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer l : arr) {
            if (l > 0) {
                int sum = 0;
                while (l > 0) {
                    sum += l % 10;
                    l /= 10;
                }
                if (sum > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_7_eb1bec51_d822_4c97_8b9b_2c23ac2ae264(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0).count();
    }

    
    public static int countNums_Problem_1_d1f292b3_0e5e_418b_89e8_b5d64667b726(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer i : arr) {
            if (i > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_1_a9366de0_725f_4cd0_ab40_c5ac4ebdfab5(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> Math.abs(x) % 9 != 0).count();
    }

    
    public static int countNums_Problem_5_3da00303_7374_47ed_a565_2ba1d08d35db(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            if (i < 0) {
                i = Math.abs(i);
            }
            int sum = 0;
            while (i > 0) {
                sum += i % 10;
                i /= 10;
            }
            if (sum > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_1_ec2f79fc_4bb2_4ced_b244_abb58111b971(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            if (i > 0) {
                int sum = 0;
                while (i > 0) {
                    sum += i % 10;
                    i /= 10;
                }
                if (sum > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_5_5681f585_c4a7_4062_b320_90aa0e6071a4(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer l : arr) {
            if (l > 0) {
                count += l;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_1_8f619695_0ca3_404d_8ebb_9e620af48e93(ArrayList<Integer> arr) {
        int total = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                total += arr.get(i);
            }
        }
        return total;
    }

    
    public static int countNums_Problem_5_4666e62c_276f_4152_b277_4043f30ca7c6(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer num : arr) {
            if (num > 0) {
                count += num;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_0_ca214c16_81ee_4e90_8661_88bd61678a60(ArrayList<Integer> arr) {
        int sum = 0, count = 1;
        for(int i = 0; i < arr.size(); i++) {
            sum += Math.abs(arr.get(i));
            count += arr.contains(Math.abs(arr.get(i))) ? 1 : 0;
        }
        return sum;
    }

    
    public static int countNums_Problem_7_99d16ead_a6cd_4e7e_8a62_bb510387925c(ArrayList<Integer> arr) {
        int count = 0;
        for (int num : arr) {
            if (num > 0) {
                if (num % 10 != 0) {
                    count += 1;
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_7_add6d9ae_2d72_46c7_bb88_c720730fb9e6(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer num : arr) {
            if (num > 0) {
                count += num;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_0_e45f8595_fc30_43d9_a010_b4b296534106(ArrayList<Integer> arr) {

        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_6_f3da485f_5e48_4cf5_b811_8a28f49e17f8(ArrayList<Integer> arr) {
        int sum = 0;
        boolean first = True;
        for (int num : arr) {
            if (num < 0) {
                num *= -1;
            }
            if (first) {
                first = False;
                continue;
            }
            sum += num % 10;
            while (sum > 9) {
                sum -= 10;
            }
        }
        return sum;
    }

    
    public static int countNums_Problem_2_1c97d6bb_ec32_433a_ac78_7d7e1c349f13(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            if (i > 0) {
                int sum = 0;
                while (i > 0) {
                    sum += i % 10;
                    i /= 10;
                }
                if (sum > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_6_0e5f03af_ce87_4c33_95d9_58b5449ce25b(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0 && (x % 10) > 0).count();
    }

    
    public static int countNums_Problem_1_1bcb2e99_c412_4e27_bd50_23fb1a5541a7(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer num : arr) {
            if (num > 0) {
                count += num;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_4_3ebbcb70_8866_4341_8ca2_780126fb1968(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0 && x % 10 != 0).count();
    }

    
    public static int countNums_Problem_0_866cbb0d_8e43_4bf5_a5b2_a9a8bc218059(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> Math.abs(x) > 0).count();
    }

    
    public static int countNums_Problem_4_1d0efca3_f0bb_4e17_8921_17a8829322d8(ArrayList<Integer> arr) {
        int sum = 0;
        for (int num : arr) {
            if (num > 0) {
                sum += Math.abs(num);
            }
            if (num < 0) {
                sum += num * (num / Math.abs(num));
            }
        }
        return sum;
    }

    
    public static int countNums_Problem_0_a1f52acc_f359_4370_a94e_e20acee8f9ad(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            int sum = 0;
            while (i != 0) {
                sum += i % 10;
                i /= 10;
            }
            if (sum > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_5_77792491_0d19_481e_a8f6_860c5c1274c7(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0).count();
    }

    
    public static int countNums_Problem_4_3066c044_02fb_4ea3_af4b_524c3811d71f(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0).count();
    }

    
    public static int countNums_Problem_2_015337e9_fc93_493e_b2ca_71c593292af3(ArrayList<Integer> arr) {
        return arr.stream().filter(x -> x.toString().chars().map(y -> y - '0').sum() > 0).count();
    }

    
    public static int countNums_Problem_0_bfa7bea8_eca4_41cf_ac03_b6aa6fa3ee37(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0 && x % 10 > 0).count();
    }

    
    public static int countNums_Problem_2_36f65138_b50f_436c_8350_754fb226e88f(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            int sum = 0;
            while (i != 0) {
                sum += i % 10;
                i /= 10;
            }
            if (sum > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_1_73b40750_cdbe_4da6_9322_97e2441c202f(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer x : arr) {
            if (x > 0) {
                count += x;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_5_2a492c38_45cf_4122_8521_c14e2407adad(ArrayList<Integer> arr) {
        int sum = 0;
        for (Integer val : arr) {
            sum += val.intValue();
        }
        return sum;
    }

    
    public static int countNums_Problem_6_4daf16c1_6a95_47dd_acd4_9ed34e1bb6a6(ArrayList<Integer> arr) {
        // write your solution here
        return 0;
    }

    
    public static int countNums_Problem_2_215a6cd4_5204_4a70_bc63_8a7bf46b7da0(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            if (i > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_0_caf2ccec_a8cf_4fd7_b322_84fca1212947(ArrayList<Integer> arr) {

        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_0_d7842cb1_55a1_4e3c_aff8_36f8d81b4b7a(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0).count();
    }

    
    public static int countNums_Problem_0_50010bac_e9a6_43ed_bf1b_b5879ab5654a(ArrayList<Integer> arr) {
        if (arr.isEmpty())
            return 0;
        int n = 0;
        int first =  arr.get(0);
        if (first < 0) return 0;
        for (Integer d : arr)
            n += first * 10 + d;
        return n;
    }

    
    public static int countNums_Problem_2_4249ab2e_f4b9_41a0_9cec_636726bb6fa8(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> {
            String s = x.toString();
            if (s.charAt(0) == '-') {
                return False;
            }
            int sum = 0;
            for (int i = 0; i < s.length(); i++) {
                sum += Character.getNumericValue(s.charAt(i));
            }
            return sum > 0;
        }).count();
    }

    
    public static int countNums_Problem_1_eedc342d_7aef_4623_bd33_50d080a31cd9(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer num : arr) {
            if (num > 0) {
                int sum = 0;
                while (num > 0) {
                    sum += num % 10;
                    num /= 10;
                }
                if (sum > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_3_513f7d9c_04aa_4ef4_a34e_69d68ec64c1f(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0 && x % 10 != 0).count();
    }

    
    public static int countNums_Problem_2_bb8c9c09_5851_4611_a386_4e347851ccd0(ArrayList<Integer> arr) {

        return arr.stream().filter(n -> n > 0 && n % 10 != 0).count();
    }

    
    public static int countNums_Problem_3_eb1bec51_d822_4c97_8b9b_2c23ac2ae264(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0).count();
    }

    
    public static int countNums_Problem_5_7c0a5505_589e_4ad3_866a_a94460c9067f(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0).map(x -> x.toString().chars().map(c -> c - '0').sum()).count();
    }

    
    public static int countNums_Problem_2_2b5e1ae6_9729_46f5_959f_359a45cb307e(ArrayList<Integer> arr) {
        int sum = 0;
        for (Integer num : arr) {
            sum += num;
        }
        return sum;

    }

    
    public static int countNums_Problem_7_e5ea8bc9_93cc_4dc3_ae71_c69bd5325555(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0 && x % 10 != 0).count();
    }

    
    public static int countNums_Problem_6_67db4763_7261_4eb4_8cd4_9e70b1b91287(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> Math.abs(x) > 0).count();
    }

    
    public static int countNums_Problem_3_7d9e2cd3_eafc_4fff_92bc_394e188d0aa2(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0 && x % 10 != 0).count();
    }

    
    public static int countNums_Problem_6_1cd2dd1c_3655_436e_a75b_326ba4d66483(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> Math.abs(x) > 0).count();
    }

    
    public static int countNums_Problem_3_a1f52acc_f359_4370_a94e_e20acee8f9ad(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            int sum = 0;
            while (i != 0) {
                sum += i % 10;
                i /= 10;
            }
            if (sum > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_3_20dbfccf_5908_4eb3_a618_6a56ca353f36(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            int sum = 0;
            while (i != 0) {
                sum += i % 10;
                i /= 10;
            }
            if (sum > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_1_f849769e_99d3_49eb_8de5_a744bc0ca548(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> Math.abs(x) > 0).count();
    }

    
    public static int countNums_Problem_3_02671935_170b_4dc9_8e7a_edcdec9b29d6(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            if (i > 0) {
                String s = String.valueOf(i);
                int sum = 0;
                for (int j = 0; j < s.length(); j++) {
                    sum += s.charAt(j) - '0';
                }
                if (sum > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_1_fe245933_1bf8_4bfd_8af0_f1b90d2ad974(ArrayList<Integer> arr) {
        int count = 0;
        for (Integer l : arr) {
            int n = Math.abs(l);
            count +=  Math.pow(10, arr.indexOf(n) + 1) - 1;
        }
        return count;
    }

    
    public static int countNums_Problem_6_f78bff9a_8b20_4803_9bf4_6408832181de(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            if (i > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_5_5c59e77b_c61b_41a7_ac83_357efd16f671(ArrayList<Integer> arr) {
        int nums = 0;
        for (Integer n : arr)
            if (n > 0)
                nums += (n - 1) / 10;
                
        return nums;
    }

    
    public static int countNums_Problem_4_977b6d1e_465b_450b_b9f7_aa0b71fb9300(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> Math.abs(x) > 0).count();
    }

    
    public static int countNums_Problem_1_fd0da131_6ae5_4ac0_9570_3f5eb89fe8af(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer num : arr) {
            if (num > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_0_513f7d9c_04aa_4ef4_a34e_69d68ec64c1f(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0 && x % 10 != 0).count();
    }

    
    public static int countNums_Problem_0_cec6e3c6_a527_4498_9e71_57d38a320179(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer l : arr) {
            if (l > 0) {
                count += l;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_4_45d9bf77_d3a8_43e2_81ef_b6402826647c(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0 && (x % 10) > 0).count();
    }

    
    public static int countNums_Problem_5_dc7324f2_991f_4301_ae17_2619b3d740da(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            if (i > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_1_42b882cf_a3cc_43ad_8e59_e2b26da8e8db(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer l : arr) {
            if (l > 0) {
                count += l;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_2_28d68097_571e_4e3e_8c02_c7ad32818b32(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> Math.abs(x) > 0).count();
    }

    
    public static int countNums_Problem_3_09161157_e82d_45e5_88e2_fe0274be137e(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0 && (x % 10) > 0).count();
    }

    
    public static int countNums_Problem_1_d4a02942_3de1_402e_9d9a_18ad77d4a39e(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0 && x % 10 != 0).count();
    }

    
    public static int countNums_Problem_3_4daf16c1_6a95_47dd_acd4_9ed34e1bb6a6(ArrayList<Integer> arr) {
        // write your solution here
        return 0;
    }

    
    public static int countNums_Problem_6_2b442412_ae5e_4440_8d53_cad4e1f61cfa(ArrayList<Integer> arr) {

        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) < 0) {
                count += (arr.get(i) % 10);
            } else {
                count += (arr.get(i) % 10);
            }
        }
        return count;
    }

    
    public static int countNums_Problem_1_624e555e_383f_49cb_a8d7_c4b0cfffecba(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0).count();
    }

    
    public static int countNums_Problem_5_30f9b897_24e8_4f8b_a7d9_657a516e96c4(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> Math.abs(x) > 0).count();
    }

    
    public static int countNums_Problem_2_c7b6a784_64ec_480f_be8f_1cc498d04a8f(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            int sum = 0;
            while (i != 0) {
                sum += i % 10;
                i /= 10;
            }
            if (sum > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_5_501f3674_444d_428c_baa2_4f5759fa3975(ArrayList<Integer> arr) {
        // write your logic here
        int count = 0L;
        if (arr.size() > 0) {
            Integer temp =  arr.get(0);
            while (arr.size() > 1) {
                int temp_int = 0;
                for (int i = 1; i < arr.size(); i++) {
                    if (arr.get(i) > 0) {
                        temp_int += arr.get(i).intValue();
                    } else {
                        temp_int += (temp_int < 0 ? temp : -temp);
                        temp_int = temp_int % 10;
                    }
                }
                if (temp_int > 0) {
                    count += temp_int;
                }
                temp =  arr.get(0);
            }
        }
        return count;
    }

    
    public static int countNums_Problem_5_45d9bf77_d3a8_43e2_81ef_b6402826647c(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0 && (x % 10) > 0).count();
    }

    
    public static int countNums_Problem_5_59992054_83a7_45a4_b37a_dcf59c539b66(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer num : arr) {
            if (num > 0) {
                int sum = 0;
                while (num > 0) {
                    sum += num % 10;
                    num /= 10;
                }
                if (sum > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_1_55bd8aaf_0211_4aa1_93ff_f4ddbea5ad00(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0).count();
    }

    
    public static int countNums_Problem_3_9041c07b_6a95_4789_9ad8_71d6e6d035c3(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            if (i > 0) {
                if (i < 10) {
                    count++;
                } else {
                    int temp = i;
                    while (temp > 0) {
                        if (temp % 10 > 0) {
                            count++;
                        }
                        temp /= 10;
                    }
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_2_45e4852a_1207_4a92_8d69_afe2510d74da(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0).count();
    }

    
    public static int countNums_Problem_2_2d828198_ae28_4411_8d6f_1201c6214b37(ArrayList<Integer> arr) {
        if(arr.size() == 0) return 0L;
        int sum = 0L;
        for(int num : arr) sum += num;
        return sum;
    }

    
    public static int countNums_Problem_3_bf07982b_1623_4a9a_baef_fedfdf129d86(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0).count();
    }

    
    public static int countNums_Problem_1_dc04b08a_aaf2_4e24_8f56_713fa6974f80(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer l : arr) {
            if (l > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_5_bfa7bea8_eca4_41cf_ac03_b6aa6fa3ee37(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0 && x % 10 > 0).count();
    }

    
    public static int countNums_Problem_5_d551a381_0b62_45ec_bbad_e16a5d4b202a(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> Math.abs(x) > 0).count();
    }

    
    public static int countNums_Problem_7_d410ace6_75ee_4791_bb31_703124954294(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer n : arr) {
            if (n < 0) {
                count += (n % 10);
            } else {
                count += (n % 10);
            }
        }
        return count;
    }

    
    public static int countNums_Problem_7_c6e7c926_9681_4471_ab49_8d1f6c8432dd(ArrayList<Integer> arr) {
        if (arr.size() == 0) {
            return 0;
        }
        Set<Integer> set = new HashSet<Integer>();
        for (Integer l : arr) {
            if (l < 0) {
                l = -l;
            }
            set.add(l);
        }
        int ret = 0;
        for (Integer l : arr) {
            if (set.contains(Math.abs(l))) { // abs() returns positive if positive, negative if negative
                ret++;
            }
        }
        return ret;
    }

    
    public static int countNums_Problem_3_cf7aa7ef_0b41_4561_8fbc_80e8868efbd3(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0 && x % 10 != 0).count();
    }

    
    public static int countNums_Problem_4_214a1b60_5b72_4942_8431_c11508789518(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> Math.abs(x) > 0).count();
    }

    
    public static int countNums_Problem_1_e850074b_ce5d_47a2_9bd1_43ac7f15e158(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0).map(x -> x.toString().chars().map(c -> c - '0').sum()).filter(x -> x > 0).count();
    }

    
    public static int countNums_Problem_0_0a389bb7_ecb0_4459_bb97_84efb7776871(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            if (i > 0) {
                int sum = 0;
                while (i > 0) {
                    sum += i % 10;
                    i /= 10;
                }
                if (sum > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_7_27a3ffa6_dfaf_47ff_b247_e474a40326c4(ArrayList<Integer> arr) {

        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_2_d7842cb1_55a1_4e3c_aff8_36f8d81b4b7a(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0).count();
    }

    
    public static int countNums_Problem_5_b91ac2f8_bff1_419a_a29c_7b0597b2675a(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0).map(x -> x.toString().chars().map(c -> c - 48).sum()).count();
    }

    
    public static int countNums_Problem_2_c6bdae9a_2c15_4760_846f_08ef7ad38c92(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            if (i > 0) {
                int sum = 0;
                while (i > 0) {
                    sum += i % 10;
                    i /= 10;
                }
                if (sum > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_7_1222f4af_d68e_410f_9ae8_6e0f9da5df54(ArrayList<Integer> arr) {

        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) < 0) {
                sum += arr.get(i) % 10;
            } else {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int countNums_Problem_2_d89693f9_cd3c_4c0b_ad9e_dc81594500a1(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            if (i > 0) {
                int sum = 0;
                while (i > 0) {
                    sum += i % 10;
                    i /= 10;
                }
                if (sum > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_1_19c7bbd4_c6cd_4a22_9a92_25a848a324a4(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer num : arr) {
            if (num > 0) {
                int sum = 0;
                while (num > 0) {
                    sum += num % 10;
                    num /= 10;
                }
                if (sum > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_6_367f0a43_8bcb_4939_a6ce_adbe474f910b(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            int sum = 0;
            while (i != 0) {
                sum += i % 10;
                i /= 10;
            }
            if (sum > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_7_d045ebc8_a6ac_4187_a684_342442592328(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            int sum = 0;
            while (i != 0) {
                sum += i % 10;
                i /= 10;
            }
            if (sum > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_7_067a38ea_5e0e_4e90_8c23_7c371588c7a9(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            int sum = 0;
            while (i != 0) {
                sum += i % 10;
                i /= 10;
            }
            if (sum > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_0_dc448b06_61ff_4200_b059_24a2ab486d6a(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0).count();
    }

    
    public static int countNums_Problem_3_214a1b60_5b72_4942_8431_c11508789518(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> Math.abs(x) > 0).count();
    }

    
    public static int countNums_Problem_3_e871c437_ac0e_475d_9cb0_e234f99bb747(ArrayList<Integer> arr) {
        int sum = 0;
        for (Integer l : arr) {
            sum += Math.abs(l);
        }
        return sum;
    }

    
    public static int countNums_Problem_2_d1f86c9f_2242_40c6_8483_8b85ba5d3168(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> Math.abs(x) % 9 != 0).count();
    }

    
    public static int countNums_Problem_7_a84e5d15_61bd_422a_b0ce_d9fb9cd6cf25(ArrayList<Integer> arr) {

        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                count += 1;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_6_14300fd0_ad04_455d_a3f8_a72245801005(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> Math.abs(x) > 0).count();
    }

    
    public static int countNums_Problem_4_539c032b_3858_46bf_a102_98e447961b00(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0 && x % 10 != 0).count();
    }

    
    public static int countNums_Problem_3_502910ce_5b34_4acc_8108_e83a8d5dc877(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0 && x % 10 != 0).count();
    }

    
    public static int countNums_Problem_2_8c346a47_0c56_49a2_9f43_10e9fff843a1(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer num : arr) {
            if (num > 0) {
                int sum = 0;
                while (num > 0) {
                    sum += num % 10;
                    num /= 10;
                }
                if (sum > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_3_55bd8aaf_0211_4aa1_93ff_f4ddbea5ad00(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0).count();
    }

    
    public static int countNums_Problem_7_0d139008_cc77_4896_9b76_f585ada19f17(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer num : arr) {
            if (num > 0) {
                int sum = 0;
                while (num > 0) {
                    sum += num % 10;
                    num /= 10;
                }
                if (sum > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_2_cb3c7476_17f3_41b6_b71f_75d29011e2a4(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer l : arr) {
            if (l > 0) {
                count += l;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_6_a52dedd4_8445_4c61_9b7b_ef1d288ac4c3(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> Math.abs(x) > 0).count();
    }

    
    public static int countNums_Problem_0_de5d137b_55f8_42be_b599_dfd7e853d794(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0 && x % 10 > 0).count();
    }

    
    public static int countNums_Problem_7_22f4ded8_4690_4f2b_b2b2_c6a5f4daf4b5(ArrayList<Integer> arr) {
        int result = 0;
        for (int n : arr) {
            result +=  Math.abs(n);
        }
        return result;
    }

    
    public static int countNums_Problem_1_9fb7204e_aa6a_48bd_bde0_3c27000db70b(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer l : arr) {
            if (l > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_4_4eeb51e2_7e1a_4002_b5ea_c2b44e732f71(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            int sum = 0;
            while (i != 0) {
                sum += i % 10;
                i /= 10;
            }
            if (sum > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_0_2c5a1fc6_7803_4775_9eae_97fe4978e69e(ArrayList<Integer> arr) {
        int result = 0;
        for (int l : arr) {
            if (l >= 0) {
                result += Math.abs(l);
            }
            else {
                result -= Math.abs(l);
            }
        }
        return result;
    }

    
    public static int countNums_Problem_5_3cf5ccb9_db3f_4dca_831b_9dd1f2105420(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0).count();
    }

    
    public static int countNums_Problem_3_649c8816_1369_409f_818b_affc9cf1ca71(ArrayList<Integer> arr) {
        Integer sumOfFirstDigits = arr.get(0).intValue();
        Integer sumOfSecondDigits = arr.get(1).intValue();
        if (sumOfFirstDigits < 0 || sumOfSecondDigits < 0)
            return 1;
        
        int firstSignedDigit = arr.get(0).intValue() % 10;
        int secondSignedDigit = arr.get(1).intValue() % 10;

        if (firstSignedDigit == secondSignedDigit && firstSignedDigit > 0)
            return 1;
        else if (firstSignedDigit == secondSignedDigit && firstSignedDigit < 0)
            return (-firstSignedDigit + 1) % 10;
        else if (firstSignedDigit < secondSignedDigit)
            return (firstSignedDigit + 1) % 10;
        else
            return 0;
    }

    
    public static int countNums_Problem_4_ee9298e4_4f87_4532_975c_ae8e3d8f63cb(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> Math.abs(x) > 0).count();
    }

    
    public static int countNums_Problem_0_28dac5c0_d3e8_4123_a046_a060527467d2(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer l : arr) {
            if (l > 0) {
                count += l;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_1_63739945_9d25_468b_95b9_2322fca6bb4f(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> Math.abs(x) % 9 != 0).count();
    }

    
    public static int countNums_Problem_5_68df87b8_f902_4eaa_ac12_eae3d801c80e(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer num : arr) {
            if (num > 0) {
                int sum = 0;
                while (num > 0) {
                    sum += num % 10;
                    num /= 10;
                }
                if (sum > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_7_d551a381_0b62_45ec_bbad_e16a5d4b202a(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> Math.abs(x) > 0).count();
    }

    
    public static int countNums_Problem_7_d404aef0_7d00_4e40_829e_43d641069835(ArrayList<Integer> arr) {

        int count = 0;
        for (int num : arr) {
            if (num > 0) {
                count += 1;
            } else if (num < 0) {
                int sum = 0;
                while (num != 0) {
                    sum += Math.abs(num % 10);
                    num /= 10;
                }
                if (sum > 0) {
                    count += 1;
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_2_6e0c08c6_c6f4_42b8_8674_09f39b7e6fb3(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0).count();
    }

    
    public static int countNums_Problem_4_7335bd96_6f90_44db_842f_d37ff858d0ec(ArrayList<Integer> arr) {
        int count = 0;
        for (int num : arr) {
            int sum = 0;
            while (num > 0) {
                sum += (num % 10); // get last digit
                num /= 10;          // remove last digit
            }
            if (sum > 0)
                count++;
        }
        return count;
    }

    
    public static int countNums_Problem_4_00792e18_2878_4c33_9472_c2e94fec5187(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0).count();
    }

    
    public static int countNums_Problem_6_5681f585_c4a7_4062_b320_90aa0e6071a4(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer l : arr) {
            if (l > 0) {
                count += l;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_5_624e555e_383f_49cb_a8d7_c4b0cfffecba(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0).count();
    }

    
    public static int countNums_Problem_0_b33c4c5a_15f9_4f2a_a2af_f856a5381a6d(ArrayList<Integer> arr) {
        int sum = 0;
        for (Integer l : arr) {
            sum += Math.abs(l);
        }
        return sum;
    }

    
    public static int countNums_Problem_0_693452d7_56a5_447a_99ff_5bba5d52a3a2(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            if (i > 0) {
                int sum = 0;
                while (i > 0) {
                    sum += i % 10;
                    i /= 10;
                }
                if (sum > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_5_3066c044_02fb_4ea3_af4b_524c3811d71f(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0).count();
    }

    
    public static int countNums_Problem_1_2558a93b_8191_4574_8c4d_33cab2d0ea69(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer l : arr) {
            if (l > 0) {
                int sum = 0;
                while (l > 0) {
                    sum += l % 10;
                    l /= 10;
                }
                if (sum > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_5_42b882cf_a3cc_43ad_8e59_e2b26da8e8db(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer l : arr) {
            if (l > 0) {
                count += l;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_1_f5fd4a2f_400c_41e9_9f79_eae50662dcc8(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0).count();
    }

    
    public static int countNums_Problem_7_4bb9e8e8_e6c4_46a9_9190_001475736238(ArrayList<Integer> arr) {

        int count = 0;
        for (int x : arr) {
            if (x < 0) {
                x = -x;
            }
            int x_digits = 0;
            while (x > 0) {
                x_digits++;
                x /= 10;
            }
            if (x_digits > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_0_a63943fb_8b47_4859_b432_72cfe30721f6(ArrayList<Integer> arr) {
        // Complete the function here.
        int len = arr.size();
        int sum = 0;
        for(int l : arr) {
            sum += Math.abs(l % 10);
        }
        return sum;
    }

    
    public static int countNums_Problem_4_caf04899_01fe_45bc_a617_817d87e358e6(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer num : arr) {
            if (num > 0) {
                int sum = 0;
                while (num > 0) {
                    sum += num % 10;
                    num /= 10;
                }
                if (sum > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_5_977b6d1e_465b_450b_b9f7_aa0b71fb9300(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> Math.abs(x) > 0).count();
    }

    
    public static int countNums_Problem_3_a9366de0_725f_4cd0_ab40_c5ac4ebdfab5(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> Math.abs(x) % 9 != 0).count();
    }

    
    public static int countNums_Problem_7_95f228db_69ff_4e4c_b310_8f9501bf8bc9(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            if (i > 0) {
                count += i;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_7_f509092b_a2ad_45a7_b72f_4808bdaf332f(ArrayList<Integer> arr) {

        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int countNums_Problem_1_502910ce_5b34_4acc_8108_e83a8d5dc877(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0 && x % 10 != 0).count();
    }

    
    public static int countNums_Problem_7_45285dbf_b8e9_4287_9c21_96961f97baeb(ArrayList<Integer> arr) {

        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            int num = arr.get(i);
            if (num > 0) {
                count++;
            } else {
                int sum = 0;
                while (num != 0) {
                    sum += num % 10;
                    num /= 10;
                }
                if (sum > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_4_11f5da2a_5375_44b2_ad07_f09414a27fb4(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0 && x % 10 != 0).count();
    }

    
    public static int countNums_Problem_7_b039a16a_8c36_4d2f_a3f6_66cf64a8ae60(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0 && x % 10 > 0).count();
    }

    
    public static int countNums_Problem_2_778d2da2_41ac_4f46_a807_1dfb77893c43(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> Math.abs(x) > 0).count();
    }

    
    public static int countNums_Problem_4_c96bbaad_4c49_468d_9195_e18445aa9243(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> Math.abs(x) > 0).count();
    }

    
    public static int countNums_Problem_3_19c7bbd4_c6cd_4a22_9a92_25a848a324a4(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer num : arr) {
            if (num > 0) {
                int sum = 0;
                while (num > 0) {
                    sum += num % 10;
                    num /= 10;
                }
                if (sum > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_2_94841746_4b07_41d1_acb7_9a6423246334(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0).count();
    }

    
    public static int countNums_Problem_1_d59ca86b_9999_4883_ad34_6c55d5f7bd95(ArrayList<Integer> arr) {
        int ans = 0, num = 0;
        for (Integer i : arr) {
            num += i;
            if (num > 0) {
                ans += 1;
                num %= 10;
            }
        }
        return ans;
    }

    
    public static int countNums_Problem_2_dde1e814_61d4_444d_b7d4_5e42d87753ab(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> Math.abs(x) > 0).count();
    }

    
    public static int countNums_Problem_5_0b05b989_3ed7_4994_8897_879815fa1916(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer l : arr) {
            if (l > 0) {
                count += l;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_0_b29e7d8b_cc48_4970_b791_a44f7702acfd(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer num : arr) {
            if (num > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_5_af539267_9023_4cd9_be0c_bfbceeeadf68(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0).count();
    }

    
    public static int countNums_Problem_1_a600051c_1018_4430_b05a_16ebadf9df92(ArrayList<Integer> arr) {
        int cnt = 0;
        for (Integer i : arr) {
            int d = i % 10;
            if (d > 0) {
                d += 9 - d;
            }
            if (d >= 0) {
                cnt += d;
            }
        }
        return cnt;
    }

    
    public static int countNums_Problem_0_d9dce561_d961_4663_8f77_db304b2ab001(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer num : arr) {
            if (num > 0) {
                int sum = 0;
                while (num > 0) {
                    sum += num % 10;
                    num /= 10;
                }
                if (sum > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_4_c4056aae_62da_4e26_ae34_4af9bd10fbd4(ArrayList<Integer> arr) {

        int count = 0;
        for (int num : arr) {
            if (num > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_2_ea20fe18_7874_494d_8b81_c0aa5f77b950(ArrayList<Integer> arr) {
        // Write your code here
        int sum = 0;
        for (int num : arr)
            sum += num;
        if (sum < 0)
            sum *= -1;
        int count = 0;
        for (int num : arr)
            count += Math.abs(num % 10);
        return count;
    }

    
    public static int countNums_Problem_0_3644f005_21f9_44be_a373_d50f9607727f(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0).map(x -> x % 10).mapToInteger(x -> x).sum();
    }

    
    public static int countNums_Problem_2_eedc342d_7aef_4623_bd33_50d080a31cd9(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer num : arr) {
            if (num > 0) {
                int sum = 0;
                while (num > 0) {
                    sum += num % 10;
                    num /= 10;
                }
                if (sum > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_4_f75bd5dd_68ca_44ab_935d_9f5732da653d(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer num : arr) {
            if (num > 0) {
                int sum = 0;
                while (num > 0) {
                    sum += num % 10;
                    num /= 10;
                }
                if (sum > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_2_99d16ead_a6cd_4e7e_8a62_bb510387925c(ArrayList<Integer> arr) {
        int count = 0;
        for (int num : arr) {
            if (num > 0) {
                if (num % 10 != 0) {
                    count += 1;
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_2_fa533192_4ea0_4a8e_968e_1848e2a8a2cc(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer l : arr) {
            if (l > 0) {
                count += l;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_2_ace0a91f_6020_4c34_949e_1afe8138bff8(ArrayList<Integer> arr) {

        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            int n = arr.get(i);
            if (n < 0) {
                n = n * -1;
            }
            count += n;
        }
        return count;
    }

    
    public static int countNums_Problem_7_4fe20e5b_b25f_48e2_83cb_9fd4f2fc1251(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> Math.abs(x) > 0).count();
    }

    
    public static int countNums_Problem_0_af58c75b_5250_40e8_a58b_bea619d0d379(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> Math.abs(x) > 0).count();
    }

    
    public static int countNums_Problem_3_e33cd4ad_039e_4262_9d4f_314a0e3d653f(ArrayList<Integer> arr) {
        // Write your code here
        int countNums_Problem_3_e33cd4ad_039e_4262_9d4f_314a0e3d653f = 0;
        boolean firstNumNegative = arr.get(0).intValue() < 0;
        for (int i : arr) {
            if (i == 0)
                continue;
            int sumOfDigits = Integer.parseInteger(String.valueOf(i));
            countNums_Problem_3_e33cd4ad_039e_4262_9d4f_314a0e3d653f += sumOfDigits > 0 ? sumOfDigits : 0;
            if (firstNumNegative) {
                countNums_Problem_3_e33cd4ad_039e_4262_9d4f_314a0e3d653f += sumOfDigits < 0 ? -sumOfDigits : sumOfDigits;
            }
        }
        return countNums_Problem_3_e33cd4ad_039e_4262_9d4f_314a0e3d653f;
    }

    
    public static int countNums_Problem_3_1bacefbe_6858_4b87_8c1d_9c23d8dac72e(ArrayList<Integer> arr) {
        int nums = 0;
        for(Integer number : arr) {
            int sum = 0;
            while(number > 0) {
                sum += number % 10;
                number /= 10;
            }
            if(sum > 0) nums++;
        }
        return nums;
    }

    
    public static int countNums_Problem_4_c6e7c926_9681_4471_ab49_8d1f6c8432dd(ArrayList<Integer> arr) {
        if (arr.size() == 0) {
            return 0;
        }
        Set<Integer> set = new HashSet<Integer>();
        for (Integer l : arr) {
            if (l < 0) {
                l = -l;
            }
            set.add(l);
        }
        int ret = 0;
        for (Integer l : arr) {
            if (set.contains(Math.abs(l))) { // abs() returns positive if positive, negative if negative
                ret++;
            }
        }
        return ret;
    }

    
    public static int countNums_Problem_0_da65f4b7_0a4b_446a_966c_f963a46c1db4(ArrayList<Integer> arr) {

        int count = 0;
        for (int num : arr) {
            if (num > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_3_7f62cc56_3ff1_4cd3_9ff8_376a8ddf78ca(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer num : arr) {
            if (num > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_4_03fc2e6b_1d21_4788_8502_7c61928fad0e(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            int sum = 0;
            while (i != 0) {
                sum += i % 10;
                i /= 10;
            }
            if (sum > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_6_92839b16_7013_4782_b800_40228bf495ce(ArrayList<Integer> arr) {

        int sum = 0;
        for (int n : arr) {
            if (n < 0) {
                sum += (n % 10);
            } else {
                sum += n;
            }
        }
        return sum;
    }

    
    public static int countNums_Problem_5_e6fa265b_c54f_4ae5_8a30_23e896044150(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> Math.abs(x) > 0).count();
    }

    
    public static int countNums_Problem_4_ee1dc039_475c_4428_bf60_b77e37871cdb(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer l : arr) {
            if (l > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_3_22f4ded8_4690_4f2b_b2b2_c6a5f4daf4b5(ArrayList<Integer> arr) {
        int result = 0;
        for (int n : arr) {
            result +=  Math.abs(n);
        }
        return result;
    }

    
    public static int countNums_Problem_7_897946ad_c329_4ae1_8116_a5023c8118bb(ArrayList<Integer> arr) {

        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int countNums_Problem_3_215a6cd4_5204_4a70_bc63_8a7bf46b7da0(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            if (i > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_7_e871c437_ac0e_475d_9cb0_e234f99bb747(ArrayList<Integer> arr) {
        int sum = 0;
        for (Integer l : arr) {
            sum += Math.abs(l);
        }
        return sum;
    }

    
    public static int countNums_Problem_4_f256f790_213d_4f1f_87f8_d412414b94d5(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer l : arr) {
            if (l > 0) {
                count += l;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_2_caf2ccec_a8cf_4fd7_b322_84fca1212947(ArrayList<Integer> arr) {

        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_4_c54214d1_5a94_47b9_bb3a_6cde2c946134(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer num : arr) {
            if (num > 0) {
                int sum = 0;
                while (num > 0) {
                    sum += num % 10;
                    num /= 10;
                }
                if (sum > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_2_876983ad_9e84_4473_99f1_fb58d56030bc(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0 && (x % 10) > 0).count();
    }

    
    public static int countNums_Problem_0_fe245933_1bf8_4bfd_8af0_f1b90d2ad974(ArrayList<Integer> arr) {
        int count = 0;
        for (Integer l : arr) {
            int n = Math.abs(l);
            count +=  Math.pow(10, arr.indexOf(n) + 1) - 1;
        }
        return count;
    }

    
    public static int countNums_Problem_3_721cb2b1_5c8c_4e6a_807d_d2f4d964960b(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            if (i > 0) {
                int sum = 0;
                while (i > 0) {
                    sum += i % 10;
                    i /= 10;
                }
                if (sum > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_1_e38531ca_492c_4f3f_b80b_5d93163172aa(ArrayList<Integer> arr) {
        // Write your code here
        int count = 0;
        for (Integer l : arr) {
            int sum = 0;
            while (l > 0) {
                sum += l % 10;
                l /= 10;
            }
            if (sum > 0)
                ++count;
        }
        return count;
    }

    
    public static int countNums_Problem_5_7f62cc56_3ff1_4cd3_9ff8_376a8ddf78ca(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer num : arr) {
            if (num > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_3_b039a16a_8c36_4d2f_a3f6_66cf64a8ae60(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0 && x % 10 > 0).count();
    }

    
    public static int countNums_Problem_6_83dd47d6_96d2_435d_ae6a_e745347f2b76(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer l : arr) {
            if (l > 0) {
                count += l;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_5_4b25b8f8_5446_46e2_831f_bbf863098751(ArrayList<Integer> arr) {
        return arr.stream()
                .filter(e -> e > 0)
                .collect(Collectors.toList()).size();
    }

    
    public static int countNums_Problem_7_5180178d_e3e4_4ace_93fc_96ef46ace3bd(ArrayList<Integer> arr) {

        return arr.stream().filter(n -> n > 0).count();
    }

    
    public static int countNums_Problem_7_e5c45bd3_035a_4eee_9a91_4fa8b2d02629(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer num : arr) {
            if (num > 0) {
                int sum = 0;
                while (num > 0) {
                    sum += num % 10;
                    num /= 10;
                }
                if (sum > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_3_8dd69a6a_db4a_4c0b_8d9c_3dfade123cbf(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            int sum = 0;
            while (i != 0) {
                sum += i % 10;
                i /= 10;
            }
            if (sum > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_3_f849769e_99d3_49eb_8de5_a744bc0ca548(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> Math.abs(x) > 0).count();
    }

    
    public static int countNums_Problem_6_107440d5_d66f_497b_9340_75a54968a018(ArrayList<Integer> arr) {
        return arr.stream().filter((item) -> item.intValue() > 0)
            .mapToInteger((item) -> item.intValue()).count();
    }

    
    public static int countNums_Problem_2_d0eccfa9_8326_47bc_96e4_f43345111bbc(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer num : arr) {
            if (num > 0) {
                count += num;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_6_75f7ce4e_051c_46a4_8449_762bf4c75f30(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0 && x % 10 != 0).count();
    }

    
    public static int countNums_Problem_3_3c7d3f13_fd58_43b9_aa24_dcff2d3e91bc(ArrayList<Integer> arr) {

        int count = 0;
        for (int num : arr) {
            if (num > 0) {
                int sum = 0;
                while (num > 0) {
                    sum += num % 10;
                    num /= 10;
                }
                if (sum > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_4_e1ed4de7_f83f_4c85_b477_d21dbf99b906(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer l : arr) {
            if (l > 0) {
                count += l;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_0_0d45769d_8139_4f52_b833_862e5d048a68(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            int sum = 0;
            while (i != 0) {
                sum += i % 10;
                i /= 10;
            }
            if (sum > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_5_3ebbcb70_8866_4341_8ca2_780126fb1968(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0 && x % 10 != 0).count();
    }

    
    public static int countNums_Problem_4_b04a7c72_3b55_45ac_9aa9_8874b13858ef(ArrayList<Integer> arr) {

        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_5_e38531ca_492c_4f3f_b80b_5d93163172aa(ArrayList<Integer> arr) {
        // Write your code here
        int count = 0;
        for (Integer l : arr) {
            int sum = 0;
            while (l > 0) {
                sum += l % 10;
                l /= 10;
            }
            if (sum > 0)
                ++count;
        }
        return count;
    }

    
    public static int countNums_Problem_7_ffa4b568_d53c_4fde_8749_74657dcbc8af(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> Math.abs(x) > 0).count();
    }

    
    public static int countNums_Problem_1_0693bd7f_45a6_47a7_a15c_e84cefc15d56(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> Math.abs(x) > 0).count();
    }

    
    public static int countNums_Problem_6_fa533192_4ea0_4a8e_968e_1848e2a8a2cc(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer l : arr) {
            if (l > 0) {
                count += l;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_2_11f5da2a_5375_44b2_ad07_f09414a27fb4(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0 && x % 10 != 0).count();
    }

    
    public static int countNums_Problem_3_e0c51d0c_3092_4a06_ac71_b77d5cffdcad(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer num : arr) {
            if (num > 0) {
                count += num;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_2_22c73cd1_f08e_4b87_94cc_2a0f8d720fba(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0).count();
    }

    
    public static int countNums_Problem_1_5de01940_ef4e_494c_baad_782ec7e6675d(ArrayList<Integer> arr) {

        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            int num = arr.get(i);
            int sum = 0;
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            if (sum > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_1_6585d4a6_d6e0_4ccb_a6d8_756a1748b4e8(ArrayList<Integer> arr) {
        return arr.stream().filter(n -> n%10 != 0).count();
    }

    
    public static int countNums_Problem_4_bf07982b_1623_4a9a_baef_fedfdf129d86(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0).count();
    }

    
    public static int countNums_Problem_1_c04cea67_d1ab_4ec6_b393_a63de15e1372(ArrayList<Integer> arr) {
        int ans = 0L;
        for (int l : arr) {
            ans += l > 0 ? l % 10L : 0;
        }
        return ans;
    }

    
    public static int countNums_Problem_3_d0b6cf6c_8663_4315_b83a_b2b2c480e39c(ArrayList<Integer> arr) {

        int count = 0;
        for (int num : arr) {
            if (num < 0) {
                num = -num;
            }
            int sum = 0;
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            if (sum > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_0_eb1bec51_d822_4c97_8b9b_2c23ac2ae264(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0).count();
    }

    
    public static int countNums_Problem_3_1405488e_37a8_42fa_b186_76d9553ff166(ArrayList<Integer> arr) {

        int count = 0;
        for (int num : arr) {
            if (num > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_2_b88cdbcd_9908_4c3f_9ca9_0bf1943a5093(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer l : arr) {
            if (l > 0) {
                count++;
            } else {
                int sum = 0;
                while (l < 0) {
                    sum += l % 10;
                    l /= 10;
                }
                if (sum > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_4_9fb7204e_aa6a_48bd_bde0_3c27000db70b(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer l : arr) {
            if (l > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_5_319d1fa1_143d_47a0_829d_f89888f347bc(ArrayList<Integer> arr) {
        // return 0 if the array is empty or the array contains only zeros
        if (arr.isEmpty() || arr.stream().allMatch(i -> i == 0) || arr.stream().anyMatch(i -> i < 0))
            return 0;

        // count the numbers with non-negative sum
        int count = 0;
        for (Integer i : arr) {
            int sum = 0;
            while (i != 0) {
                sum += i % 10;
                i /= 10;
            }
            if (sum > 0) {
                count++;
            }
        }

        return count;
    }

    
    public static int countNums_Problem_5_75f7ce4e_051c_46a4_8449_762bf4c75f30(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0 && x % 10 != 0).count();
    }

    
    public static int countNums_Problem_7_a55e9f32_4b74_4f77_aa54_5e884a6bbc3e(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            if (i > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_7_b822bf0a_e1ce_4efa_9bd9_fa672dd19063(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            if (i > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_3_75f7ce4e_051c_46a4_8449_762bf4c75f30(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0 && x % 10 != 0).count();
    }

    
    public static int countNums_Problem_1_10916bdd_512c_487e_af23_650c42f482e8(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            if (i > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_4_8ac4bf3d_963e_4811_9f80_219d5e5e73b1(ArrayList<Integer> arr) {
        // use Streams to count the digits of every number in the array
        return arr.stream()
            .filter(x -> x >= 0) // filter to keep only positive numbers
            .map(x -> x % 10)
            .distinct() // remove duplicates
            .count();
    }

    
    public static int countNums_Problem_3_03fa7cc1_feb1_4e4e_8f52_dbe3decd6eab(ArrayList<Integer> arr) {
        // write your code here
        int n = arr.size();
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            int x = arr.get(i);
            int sign = x < 0 ? - Math.abs(x) :  Math.abs(x);
            int sum = 0;
            while (x > 0) {
                int digit =  (x % 10);
                sum += digit;
                x /= 10;
            }
            if (sum > 0 && sum < sign) {
                cnt++;
            }
        }
        return cnt;
    }

    
    public static int countNums_Problem_6_eb1bec51_d822_4c97_8b9b_2c23ac2ae264(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0).count();
    }

    
    public static int countNums_Problem_0_95f228db_69ff_4e4c_b310_8f9501bf8bc9(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            if (i > 0) {
                count += i;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_5_9f853432_8ead_44b9_96f2_faa478ec73b0(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0).count();
    }

    
    public static int countNums_Problem_0_6ad14d26_ef8f_498d_91e8_b96cab71a109(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0 && x % 10 != 0).count();
    }

    
    public static int countNums_Problem_2_81dc2557_5ccf_49af_80fb_52c9f3cc4cdd(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer l : arr) {
            if (l < 0) {
                count += l % 10;
            } else {
                count += l;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_1_4f9dfb4b_8348_474f_92a3_0cbc99c61c91(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0 && (x % 10) > 0).count();
    }

    
    public static int countNums_Problem_4_d5757160_7846_43aa_b756_dcb074ddcfc4(ArrayList<Integer> arr) {
        int sum = 0;
        
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

    
    public static int countNums_Problem_3_4666e62c_276f_4152_b277_4043f30ca7c6(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer num : arr) {
            if (num > 0) {
                count += num;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_7_276a80d0_b80b_433a_8257_531fd598da60(ArrayList<Integer> arr) {
        int sum = 0;
        for(Integer l : arr) {
            sum += l;
        }
        return sum;
    }

    
    public static int countNums_Problem_1_ea20fe18_7874_494d_8b81_c0aa5f77b950(ArrayList<Integer> arr) {
        // Write your code here
        int sum = 0;
        for (int num : arr)
            sum += num;
        if (sum < 0)
            sum *= -1;
        int count = 0;
        for (int num : arr)
            count += Math.abs(num % 10);
        return count;
    }

    
    public static int countNums_Problem_1_46ebf058_1747_402f_9c74_394b811ece6e(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0).count();
    }

    
    public static int countNums_Problem_4_6e683c31_9848_4ca8_8cd7_18cf22d26acb(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> Math.abs(x) > 0).count();
    }

    
    public static int countNums_Problem_1_e5c45bd3_035a_4eee_9a91_4fa8b2d02629(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer num : arr) {
            if (num > 0) {
                int sum = 0;
                while (num > 0) {
                    sum += num % 10;
                    num /= 10;
                }
                if (sum > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_5_558a1b25_3eb5_4912_ac5e_d522e7e5bc69(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> Math.abs(x) > 0).count();
    }

    
    public static int countNums_Problem_5_e45f8595_fc30_43d9_a010_b4b296534106(ArrayList<Integer> arr) {

        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_5_8977157a_7dc1_4698_b9b8_e4f9adaf8a38(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            if (i > 0) {
                String str = Integer.toString(i);
                int sum = 0;
                for (int j = 0; j < str.length(); j++) {
                    sum += Character.getNumericValue(str.charAt(j));
                }
                if (sum > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_3_29a2d272_21c4_474b_a78c_6f21070a84e4(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            if (i > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_7_24301114_faa6_4665_a499_5df9fd89f42f(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> Math.abs(x) > 0).count();
    }

    
    public static int countNums_Problem_6_81f6ff5b_28f3_4ef8_ab9e_eb613cad2187(ArrayList<Integer> arr) {

        int count = 0;
        for (int num : arr) {
            if (num > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_5_ac260abe_f265_4b11_b0a4_0a1c14914122(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer num : arr) {
            if (num > 0) {
                count += num;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_7_1c97d6bb_ec32_433a_ac78_7d7e1c349f13(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            if (i > 0) {
                int sum = 0;
                while (i > 0) {
                    sum += i % 10;
                    i /= 10;
                }
                if (sum > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_0_f75bd5dd_68ca_44ab_935d_9f5732da653d(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer num : arr) {
            if (num > 0) {
                int sum = 0;
                while (num > 0) {
                    sum += num % 10;
                    num /= 10;
                }
                if (sum > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_3_a72f9772_b000_448a_ba70_7a6f6461f914(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> Math.abs(x) > 0).count();
    }

    
    public static int countNums_Problem_4_cf7aa7ef_0b41_4561_8fbc_80e8868efbd3(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0 && x % 10 != 0).count();
    }

    
    public static int countNums_Problem_6_a5b05ecd_c645_43f6_a10f_8b4909b6794d(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer l : arr) {
            if (l > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_1_c1d48ae6_c166_48dc_89d5_8a763b9131e4(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> Math.abs(x) > 0).count();
    }

    
    public static int countNums_Problem_3_4d0dcff4_3417_4a67_aa00_e39d55a17491(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0 && x % 10 > 0).count();
    }

    
    public static int countNums_Problem_7_adb70d70_d5b5_41e7_a596_54361fcc0d31(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0).map(x -> x.toString().chars().map(c -> c - '0').sum()).count();
    }

    
    public static int countNums_Problem_4_6b0c154a_d108_4e9a_b204_79de9d858dab(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0 && x % 10 > 0).count();
    }

    
    public static int countNums_Problem_1_5c59e77b_c61b_41a7_ac83_357efd16f671(ArrayList<Integer> arr) {
        int nums = 0;
        for (Integer n : arr)
            if (n > 0)
                nums += (n - 1) / 10;
                
        return nums;
    }

    
    public static int countNums_Problem_4_513f7d9c_04aa_4ef4_a34e_69d68ec64c1f(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0 && x % 10 != 0).count();
    }

    
    public static int countNums_Problem_0_d21be8b9_5dbb_4d65_a357_d4eab838d86f(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0 && x % 10 != 0).count();
    }

    
    public static int countNums_Problem_5_1bacefbe_6858_4b87_8c1d_9c23d8dac72e(ArrayList<Integer> arr) {
        int nums = 0;
        for(Integer number : arr) {
            int sum = 0;
            while(number > 0) {
                sum += number % 10;
                number /= 10;
            }
            if(sum > 0) nums++;
        }
        return nums;
    }

    
    public static int countNums_Problem_2_8dd69a6a_db4a_4c0b_8d9c_3dfade123cbf(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            int sum = 0;
            while (i != 0) {
                sum += i % 10;
                i /= 10;
            }
            if (sum > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_7_da65f4b7_0a4b_446a_966c_f963a46c1db4(ArrayList<Integer> arr) {

        int count = 0;
        for (int num : arr) {
            if (num > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_6_369e3f93_95a2_45c8_b7da_ce03c7097298(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0).count();
    }

    
    public static int countNums_Problem_2_c576e6aa_bdcc_42c8_b308_d473195410a8(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> Math.abs(x) > 0).count();
    }

    
    public static int countNums_Problem_4_7efd602c_9790_4179_b0b4_182afeeac21a(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            if (i > 0) {
                if (i < 10) {
                    count++;
                } else {
                    int sum = 0;
                    while (i > 0) {
                        sum += i % 10;
                        i /= 10;
                    }
                    if (sum > 0) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_3_3b8e8b2b_586e_4008_8906_d178f4bf6591(ArrayList<Integer> arr) {

        int count = 0;
        for (int num : arr) {
            if (num > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_6_fb1f304e_ea6a_405b_b6e1_123d00037dd4(ArrayList<Integer> arr) {

        return arr.stream().filter(n -> n > 0 && n % 10 != 0).count();
    }

    
    public static int countNums_Problem_6_06c4bc16_e2ed_45b8_833f_635375125f12(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0 && x % 10 != 0).count();
    }

    
    public static int countNums_Problem_6_346053de_c51a_4baf_a2d8_ac92c2ca522d(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer l : arr) {
            if (l > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_3_e66e0930_4177_4915_8a9c_43c807292cbb(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0 && x % 10 > 0).count();
    }

    
    public static int countNums_Problem_7_05851248_5fc5_452a_94cc_5359baccff22(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> Math.abs(x) > 0).count();
    }

    
    public static int countNums_Problem_2_d0da2346_2657_4d44_8cea_8d3eb5bab5bf(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer num : arr) {
            if (num > 0) {
                int sum = 0;
                while (num > 0) {
                    sum += num % 10;
                    num /= 10;
                }
                if (sum > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_2_ee1dc039_475c_4428_bf60_b77e37871cdb(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer l : arr) {
            if (l > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_5_151fee26_a3d9_44c7_9a8a_fab506a43f1e(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            int sum = 0;
            while (i != 0) {
                sum += i % 10;
                i /= 10;
            }
            if (sum > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_2_d8808281_3e0e_4824_bb89_6ddbdf1d3ed8(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0 && x % 10 != 0).count();
    }

    
    public static int countNums_Problem_5_1a5e8fd6_464d_48f9_9dd0_75e0f5503ba1(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0 && x % 10 > 0).count();
    }

    
    public static int countNums_Problem_2_7358cb3f_bb61_4e24_81b0_d0755654bff3(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer num : arr) {
            if (num > 0) {
                int sum = 0;
                while (num > 0) {
                    sum += num % 10;
                    num /= 10;
                }
                if (sum > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_3_ecba2b62_732a_4975_b761_95cc907eeec0(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer num : arr) {
            if (num > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_7_19c7bbd4_c6cd_4a22_9a92_25a848a324a4(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer num : arr) {
            if (num > 0) {
                int sum = 0;
                while (num > 0) {
                    sum += num % 10;
                    num /= 10;
                }
                if (sum > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_0_2bda7a25_656e_49c7_8dfd_31bceeccafb7(ArrayList<Integer> arr) {

        // Write your code here
        return arr.stream().filter(x -> x > 0).mapToInteger(x -> x).count();
    }

    
    public static int countNums_Problem_4_d410ace6_75ee_4791_bb31_703124954294(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer n : arr) {
            if (n < 0) {
                count += (n % 10);
            } else {
                count += (n % 10);
            }
        }
        return count;
    }

    
    public static int countNums_Problem_0_015337e9_fc93_493e_b2ca_71c593292af3(ArrayList<Integer> arr) {
        return arr.stream().filter(x -> x.toString().chars().map(y -> y - '0').sum() > 0).count();
    }

    
    public static int countNums_Problem_7_eb93d87c_55ea_4a62_ba2a_ce48a7cb401b(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer l : arr) {
            if (l > 0) {
                int sum = 0;
                while (l > 0) {
                    sum += l % 10;
                    l /= 10;
                }
                if (sum > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_5_800f3daa_03a3_46d2_bde8_47b1f77dc320(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer x : arr) {
            if (x > 0) {
                count += x;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_7_d1f86c9f_2242_40c6_8483_8b85ba5d3168(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> Math.abs(x) % 9 != 0).count();
    }

    
    public static int countNums_Problem_7_82d1e594_0cc7_4f90_b2c0_544c21b9c1f2(ArrayList<Integer> arr) {
        return arr.stream().filter(x -> x.toString().chars().map(y -> y - '0').sum() > 0).count();
    }

    
    public static int countNums_Problem_3_82d1e594_0cc7_4f90_b2c0_544c21b9c1f2(ArrayList<Integer> arr) {
        return arr.stream().filter(x -> x.toString().chars().map(y -> y - '0').sum() > 0).count();
    }

    
    public static int countNums_Problem_2_a84e5d15_61bd_422a_b0ce_d9fb9cd6cf25(ArrayList<Integer> arr) {

        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                count += 1;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_1_474fcba4_affc_4647_a907_0f4bdb0ebaa7(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer num : arr) {
            if (num > 0) {
                count += num;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_0_1b8219c0_9dda_44a6_8cee_754b42935216(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0).count();
    }

    
    public static int countNums_Problem_1_04694d8d_2794_4735_87a6_e27d619d604d(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            int sum = 0;
            while (i != 0) {
                sum += i % 10;
                i /= 10;
            }
            if (sum > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_6_9325ba02_53ff_4778_b62f_34efbaf2660f(ArrayList<Integer> arr) {
        if (arr.isEmpty()) return 0;

        // A positive number has a positive first digit
        if (arr.stream().filter(i -> i >= 0).count() == 1) return 1;

        // A negative number has a negative first digit
        if (arr.stream().filter(i -> i < 0).count() == 1) return -1;

        // A number that has all digits positive has even one non-negative digit
        if (arr.stream().filter(i -> i >= 0).collect(Collectors.toSet()).contains(1)) return arr.stream().filter(i -> i >= 0).count();

        // A number that has all digits negative has even one non-negative digit
        if (arr.stream().filter(i -> i < 0).collect(Collectors.toSet()).contains(-1)) return arr.stream().filter(i -> i < 0).count();

        int sumOfDigits = 0;
        int firstNegative = arr.stream()
                .filter(i -> i < 0)
                .findFirst()
                .orElse(0);

        // Count the number that has all non-negative digits > 0
        sumOfDigits += arr.stream()
                .filter(i -> i >= 0)
                .filter(i -> i < firstNegative)
                .collect(Collectors.toSet()).size();

        // Count the number that has all non-negative digits < 0
        sumOfDigits += arr.stream()
                .filter(i -> i < 0)
                .filter(i -> i < firstNegative)
                .filter(i -> i >= 0)
                .collect(Collectors.toSet()).size();

        return sumOfDigits;
    }

    
    public static int countNums_Problem_4_34059a80_8f18_4b49_966d_83df95eb05e0(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0 && x % 10 > 0).count();
    }

    
    public static int countNums_Problem_3_f037c83b_c3e9_42fd_9e1d_411187914f6e(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            if (i > 0) {
                int sum = 0;
                while (i > 0) {
                    sum += i % 10;
                    i /= 10;
                }
                if (sum > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_6_59992054_83a7_45a4_b37a_dcf59c539b66(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer num : arr) {
            if (num > 0) {
                int sum = 0;
                while (num > 0) {
                    sum += num % 10;
                    num /= 10;
                }
                if (sum > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_1_e5f4560d_e4bb_4a9b_a9ee_fc535c670ab4(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer l : arr) {
            if (l > 0) {
                count++;
            } else {
                int sum = 0;
                while (l < 0) {
                    sum += l % 10;
                    l /= 10;
                }
                if (sum > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_0_185554a9_6ba9_4d99_8b2a_1b168d74d9fb(ArrayList<Integer> arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

    
    public static int countNums_Problem_5_042f4d94_be38_453d_8b33_1b26f26b6b93(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0 && x % 10 != 0).count();
    }

    
    public static int countNums_Problem_4_6319b119_841b_45f1_8cd0_c35205e696d9(ArrayList<Integer> arr) {
        
        if (arr.size() < 1) {
            return 0;
        }
        
        List<Integer> nums = arr.stream()
                .filter(n -> n > 0)
                .collect(Collectors.toList());
        
        int ans = nums.size();
        
        int digitSum = 0;
        
        // iterate over all numbers to find the digit sum
        for (int i = 0; i < ans; i++){
            digitSum += nums.get(i);
        }
        
        return digitSum;
    }

    
    public static int countNums_Problem_6_c7188f9d_c628_4b39_86c0_a3e649aa2c82(ArrayList<Integer> arr) {

        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int countNums_Problem_2_187022e9_b009_4828_971f_a406fcf4b436(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            int sum = 0;
            while (i != 0) {
                sum += i % 10;
                i /= 10;
            }
            if (sum > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_3_2ceb9a83_776b_4e6b_843a_922e5d702e80(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            if (i > 0) {
                int sum = 0;
                while (i > 0) {
                    sum += i % 10;
                    i /= 10;
                }
                if (sum > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_1_be80d431_0d69_48e9_a76a_cf2f9ac7f8ea(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer l : arr) {
            if (l > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_4_ed5dccc0_4bc5_4173_a13c_2cbc9f0aab93(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> Math.abs(x) > 0).count();
    }

    
    public static int countNums_Problem_5_693452d7_56a5_447a_99ff_5bba5d52a3a2(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            if (i > 0) {
                int sum = 0;
                while (i > 0) {
                    sum += i % 10;
                    i /= 10;
                }
                if (sum > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_1_c7395e8f_b0d1_484d_a15b_feec4da0a089(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer l : arr) {
            if (l > 0) {
                count += l;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_1_fe1d94d0_ec74_4c22_861f_408322f35a8b(ArrayList<Integer> arr) {

        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int countNums_Problem_2_0e5f03af_ce87_4c33_95d9_58b5449ce25b(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0 && (x % 10) > 0).count();
    }

    
    public static int countNums_Problem_6_3c7d3f13_fd58_43b9_aa24_dcff2d3e91bc(ArrayList<Integer> arr) {

        int count = 0;
        for (int num : arr) {
            if (num > 0) {
                int sum = 0;
                while (num > 0) {
                    sum += num % 10;
                    num /= 10;
                }
                if (sum > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_7_d33b75e3_9a52_4b1f_83be_28e67ca25a43(ArrayList<Integer> arr) {

        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) < 0) {
                count += arr.get(i) / Math.abs(arr.get(i));
            } else {
                count += arr.get(i) / arr.get(i);
            }
        }
        return count;
    }

    
    public static int countNums_Problem_0_f17672a2_bf3c_4e66_bfe8_ab7390b957f7(ArrayList<Integer> arr) {
        // TODO: Write code here.
        return 0;
    }

    
    public static int countNums_Problem_1_46f8d45c_d889_4170_9a7b_3acf6b01d7d2(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0).count();
    }

    
    public static int countNums_Problem_7_bd265983_bd3e_4e6a_8d0c_cf69f4ee652c(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            if (i > 0) {
                int sum = 0;
                while (i > 0) {
                    sum += i % 10;
                    i /= 10;
                }
                if (sum > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_6_e66e0930_4177_4915_8a9c_43c807292cbb(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0 && x % 10 > 0).count();
    }

    
    public static int countNums_Problem_1_4bc4031c_31cb_4ddf_ad06_f571f8caa42a(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer l : arr) {
            if (l > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_4_a79955a2_41a5_40fd_ab3b_80025ee1069e(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer num : arr) {
            if (num > 0) {
                int sum = 0;
                while (num > 0) {
                    sum += num % 10;
                    num /= 10;
                }
                if (sum > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_0_f5fd4a2f_400c_41e9_9f79_eae50662dcc8(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0).count();
    }

    
    public static int countNums_Problem_2_7257a84a_86e3_49c4_b777_a8ca2c595a53(ArrayList<Integer> arr) {
        int sum = 0;
        for (Integer l : arr) {
            sum += Math.signum(l);
        }
        return sum;
    }

    
    public static int countNums_Problem_5_8489b3b1_1bf8_4d28_bbed_99813efb2ec3(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            int sum = 0;
            while (i != 0) {
                sum += i % 10;
                i /= 10;
            }
            if (sum > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_5_597ac498_ec48_40dd_8a5e_1546a5f7b1f8(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> Math.abs(x) > 0).count();
    }

    
    public static int countNums_Problem_0_1623ea02_deff_4c3b_8f2a_2f5a0c632859(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            int sum = 0;
            while (i != 0) {
                sum += i % 10;
                i /= 10;
            }
            if (sum > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_7_67ab501b_9ff4_4963_bb1c_93edabcdb3aa(ArrayList<Integer> arr) {
        int sum = 0;
        int count = 0;
        for(int x: arr) {
            sum = sum + x;
            count++;
            if(sum > 0) break;
        }
        return count;
    }

    
    public static int countNums_Problem_3_28234d1d_615c_4f29_a2b3_90ea6c518114(ArrayList<Integer> arr) {
        int sum = 0;
        for(int num : arr) {
            sum += num;
        }
        return sum;

    }

    
    public static int countNums_Problem_0_cf36b2b0_079e_4ca7_a583_0b1af067c7ed(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0 && x % 10 != 0).count();
    }

    
    public static int countNums_Problem_1_bdd0784d_e686_4bc1_b491_0d6bdc499f43(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            if (i > 0) {
                String s = String.valueOf(i);
                int sum = 0;
                for (int j = 0; j < s.length(); j++) {
                    sum += Character.getNumericValue(s.charAt(j));
                }
                if (sum > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_1_e5ea8bc9_93cc_4dc3_ae71_c69bd5325555(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0 && x % 10 != 0).count();
    }

    
    public static int countNums_Problem_3_c1d408a3_05c1_454b_b532_118b1c74a914(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> Math.abs(x) > 0).count();
    }

    
    public static int countNums_Problem_4_c65c88c0_a8ea_42eb_b60f_e6e05cc2c1da(ArrayList<Integer> arr) {
        return IntStream.range(0, arr.size())
                .filter(i -> IntStream.range(0,9).allMatch(j -> arr.get(i) % Math.pow(10, j) >= 0))
                .count();
    }

    
    public static int countNums_Problem_4_4ed7851f_2e91_47a2_a843_e2ab23efb532(ArrayList<Integer> arr) {

        int count = 0;
        for (int num : arr) {
            int sum = 0;
            while (num != 0) {
                sum += num % 10;
                num /= 10;
            }
            if (sum > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_5_7257a84a_86e3_49c4_b777_a8ca2c595a53(ArrayList<Integer> arr) {
        int sum = 0;
        for (Integer l : arr) {
            sum += Math.signum(l);
        }
        return sum;
    }

    
    public static int countNums_Problem_4_014f924a_0db0_4330_9fd8_7560501c7992(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            if (i > 0) {
                int sum = 0;
                while (i > 0) {
                    sum += i % 10;
                    i /= 10;
                }
                if (sum > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_6_86f9bc6d_1077_49a9_9a0a_a7ab9ced2918(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> Math.abs(x) % 9 != 0).count();
    }

    
    public static int countNums_Problem_7_c65c88c0_a8ea_42eb_b60f_e6e05cc2c1da(ArrayList<Integer> arr) {
        return IntStream.range(0, arr.size())
                .filter(i -> IntStream.range(0,9).allMatch(j -> arr.get(i) % Math.pow(10, j) >= 0))
                .count();
    }

    
    public static int countNums_Problem_7_83d8fe70_0998_42c4_bedf_967efff543b8(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            if (i > 0) {
                int sum = 0;
                while (i > 0) {
                    sum += i % 10;
                    i /= 10;
                }
                if (sum > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_6_f17672a2_bf3c_4e66_bfe8_ab7390b957f7(ArrayList<Integer> arr) {
        // TODO: Write code here.
        return 0;
    }

    
    public static int countNums_Problem_5_215a6cd4_5204_4a70_bc63_8a7bf46b7da0(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            if (i > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_6_eaaca435_3215_472d_a37c_13a2b8a2c287(ArrayList<Integer> arr) {
        int sum = 0;
        for (Integer n : arr) {
            sum += n % 10;
        }
        return sum;
    }

    
    public static int countNums_Problem_1_5e4544d6_e837_41f5_af69_b7d0563ae0eb(ArrayList<Integer> arr) {

        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) < 0) {
                sum += arr.get(i) % 10;
            } else {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int countNums_Problem_1_5ac944b6_ee03_42af_a38c_3da5c681caa1(ArrayList<Integer> arr) {
        int count = 0;
        for (int i : arr) {
            int sum = 0;
            int v = i;
            if (v < 0) {
                v = v * -1;
            }
            while (v > 0) {
                sum += v % 10;
                v = v / 10;
            }
            if (sum > 0) {
                count += 1;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_1_513f7d9c_04aa_4ef4_a34e_69d68ec64c1f(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0 && x % 10 != 0).count();
    }

    
    public static int countNums_Problem_7_a9366de0_725f_4cd0_ab40_c5ac4ebdfab5(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> Math.abs(x) % 9 != 0).count();
    }

    
    public static int countNums_Problem_4_1623ea02_deff_4c3b_8f2a_2f5a0c632859(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            int sum = 0;
            while (i != 0) {
                sum += i % 10;
                i /= 10;
            }
            if (sum > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_0_7d9e2cd3_eafc_4fff_92bc_394e188d0aa2(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0 && x % 10 != 0).count();
    }

    
    public static int countNums_Problem_2_ca214c16_81ee_4e90_8661_88bd61678a60(ArrayList<Integer> arr) {
        int sum = 0, count = 1;
        for(int i = 0; i < arr.size(); i++) {
            sum += Math.abs(arr.get(i));
            count += arr.contains(Math.abs(arr.get(i))) ? 1 : 0;
        }
        return sum;
    }

    
    public static int countNums_Problem_2_cd2d520d_8eef_43d0_8cf1_7854be2a272c(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0 && x % 10 != 0).count();
    }

    
    public static int countNums_Problem_1_550d137d_529e_4ab6_b561_46f525f694f5(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0).count();
    }

    
    public static int countNums_Problem_2_7335bd96_6f90_44db_842f_d37ff858d0ec(ArrayList<Integer> arr) {
        int count = 0;
        for (int num : arr) {
            int sum = 0;
            while (num > 0) {
                sum += (num % 10); // get last digit
                num /= 10;          // remove last digit
            }
            if (sum > 0)
                count++;
        }
        return count;
    }

    
    public static int countNums_Problem_7_d71379c6_9616_45eb_a9ec_7e488fabd3c4(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer l : arr) {
            if (l > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_1_e80b2b4d_c7da_4c27_9511_99a76b56133d(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> Math.abs(x) % 9 != 0).count();
    }

    
    public static int countNums_Problem_6_014eb7b5_76fa_4d98_960c_0cc54ae4befd(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> Math.abs(x) > 0).count();
    }

    
    public static int countNums_Problem_0_08991e79_3387_429a_ac34_82c4a1bd844a(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> Math.abs(x) > 0).count();
    }

    
    public static int countNums_Problem_2_6e683c31_9848_4ca8_8cd7_18cf22d26acb(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> Math.abs(x) > 0).count();
    }

    
    public static int countNums_Problem_3_a415ae38_8852_4d99_85c3_e4f793ebe4f8(ArrayList<Integer> arr) {
        if (arr.isEmpty()) return 0;
        int sum = 0;
        int num = arr.get(0);
        boolean negative = num < 0;
        int firstDigit = num % 10;
        for (int i : arr) {
            sum += Math.abs(i - firstDigit);
        }
        return sum;
    }

    
    public static int countNums_Problem_6_7cc68336_7855_4de7_aa36_0f40cbabd19f(ArrayList<Integer> arr) {

        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            int num = arr.get(i);
            if (num < 0) {
                num = Math.abs(num);
            }
            int sum = 0;
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            if (sum > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_5_fe1abed7_b765_4a0b_a41d_8f47057e622f(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            if (i > 0) {
                if (i < 10) {
                    count++;
                } else {
                    int temp = i;
                    while (temp > 0) {
                        if (temp % 10 > 0) {
                            count++;
                        }
                        temp /= 10;
                    }
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_3_0f31c26c_b895_4c64_9010_738301cc602e(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            if (i > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_1_fde43f9b_5902_4483_88ad_28d94e24602b(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            if (i > 0) {
                int sum = 0;
                while (i > 0) {
                    sum += i % 10;
                    i /= 10;
                }
                if (sum > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_1_3e862e7c_d777_42f8_99b3_2bce2dc17162(ArrayList<Integer> arr) {
        return arr.stream().filter(x -> x.toString().chars().map(y -> y - '0').sum() > 0).count();
    }

    
    public static int countNums_Problem_4_5db36fc0_c35c_432c_b1ab_545717b039c3(ArrayList<Integer> arr) {
        int sum = 0;
        int cnt = 0;
        for(int i=0; i<arr.size(); i++) {
            sum += arr.get(i);
            if(sum < 0) {
                cnt += sum < 0 ? 1 : 0;
                sum = 0;
            } else {
                cnt += 1;
            }
        }
        return cnt;
    }

    
    public static int countNums_Problem_1_53702d28_157e_4c10_b0b8_bdae639e5dbb(ArrayList<Integer> arr) {
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            int sum = 0;
            for (int j = 0; j < arr.get(i).intValue(); j++) {
                sum += j;
            }
            if (sum > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_7_abb096a9_493a_4c18_9b32_04793052c018(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer n : arr) {
            if (n < 0) {
                count += (n % 10);
            } else {
                count += (n % 10);
            }
        }
        return count;
    }

    
    public static int countNums_Problem_2_cf7aa7ef_0b41_4561_8fbc_80e8868efbd3(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0 && x % 10 != 0).count();
    }

    
    public static int countNums_Problem_0_f78bff9a_8b20_4803_9bf4_6408832181de(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            if (i > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_6_1222f4af_d68e_410f_9ae8_6e0f9da5df54(ArrayList<Integer> arr) {

        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) < 0) {
                sum += arr.get(i) % 10;
            } else {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int countNums_Problem_7_ac260abe_f265_4b11_b0a4_0a1c14914122(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer num : arr) {
            if (num > 0) {
                count += num;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_4_2c9c1c01_e6a1_4e8c_aac5_2fc43f295f0b(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0 && x % 10 != 0).count();
    }

    
    public static int countNums_Problem_5_d856d05a_b563_4fee_817a_7c83dba26c33(ArrayList<Integer> arr) {
        int count = 1;
        for (Integer l : arr) {
            int sum = 0;
            while (l != 0) {
                sum += l % 10;
                l = l / 10;
            }
            if (sum > 0) count++;
        }
        return count;
    }

    
    public static int countNums_Problem_7_81f6ff5b_28f3_4ef8_ab9e_eb613cad2187(ArrayList<Integer> arr) {

        int count = 0;
        for (int num : arr) {
            if (num > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_0_45e4852a_1207_4a92_8d69_afe2510d74da(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0).count();
    }

    
    public static int countNums_Problem_5_06135adb_a107_4d38_83d5_d7633cf9da32(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer i : arr) {
            if (i > 0) {
                int sum = 0;
                while (i > 0) {
                    sum += i % 10;
                    i /= 10;
                }
                if (sum > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_2_55efaa75_75d6_451f_9931_26682af57cf8(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer x : arr) {
            if (x < 0) {
                count += x % 10;
            } else {
                count += x % 10;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_1_d0b6cf6c_8663_4315_b83a_b2b2c480e39c(ArrayList<Integer> arr) {

        int count = 0;
        for (int num : arr) {
            if (num < 0) {
                num = -num;
            }
            int sum = 0;
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            if (sum > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_5_77d91662_8ad1_43d6_ae90_cbd5a109bd1d(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer l : arr) {
            if (l > 0) {
                int sum = 0;
                while (l > 0) {
                    sum += l % 10;
                    l /= 10;
                }
                if (sum > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_1_a415ae38_8852_4d99_85c3_e4f793ebe4f8(ArrayList<Integer> arr) {
        if (arr.isEmpty()) return 0;
        int sum = 0;
        int num = arr.get(0);
        boolean negative = num < 0;
        int firstDigit = num % 10;
        for (int i : arr) {
            sum += Math.abs(i - firstDigit);
        }
        return sum;
    }

    
    public static int countNums_Problem_5_f5fd4a2f_400c_41e9_9f79_eae50662dcc8(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0).count();
    }

    
    public static int countNums_Problem_2_d41ef822_3770_418c_973c_c67fb52428fc(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            int sum = 0;
            while (i != 0) {
                sum += i % 10;
                i /= 10;
            }
            if (sum > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_5_6892c7f2_e48f_4b67_9d35_d58c812503f2(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0 && x % 10 > 0).count();
    }

    
    public static int countNums_Problem_4_68df87b8_f902_4eaa_ac12_eae3d801c80e(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer num : arr) {
            if (num > 0) {
                int sum = 0;
                while (num > 0) {
                    sum += num % 10;
                    num /= 10;
                }
                if (sum > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_3_24301114_faa6_4665_a499_5df9fd89f42f(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> Math.abs(x) > 0).count();
    }

    
    public static int countNums_Problem_2_7efd602c_9790_4179_b0b4_182afeeac21a(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            if (i > 0) {
                if (i < 10) {
                    count++;
                } else {
                    int sum = 0;
                    while (i > 0) {
                        sum += i % 10;
                        i /= 10;
                    }
                    if (sum > 0) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_0_926a453b_1320_42bb_8e2e_0cc5a7b1243c(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer num : arr) {
            if (num > 0) {
                count += num;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_0_d490d36e_046b_40fb_b653_8cc919bea41f(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            int sum = 0;
            while (i != 0) {
                sum += i % 10;
                i /= 10;
            }
            if (sum > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_3_50010bac_e9a6_43ed_bf1b_b5879ab5654a(ArrayList<Integer> arr) {
        if (arr.isEmpty())
            return 0;
        int n = 0;
        int first =  arr.get(0);
        if (first < 0) return 0;
        for (Integer d : arr)
            n += first * 10 + d;
        return n;
    }

    
    public static int countNums_Problem_3_576c0270_6042_4ba2_a27a_201195fab2c2(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0 && x % 10 != 0).count();
    }

    
    public static int countNums_Problem_7_ec342d30_97a1_4f6f_91a1_b67395b464ad(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> Math.abs(x) > 0).count();
    }

    
    public static int countNums_Problem_7_6c37b440_da90_4128_953c_03e825792d5e(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            if (i > 0) {
                int sum = 0;
                while (i > 0) {
                    sum += i % 10;
                    i /= 10;
                }
                if (sum > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_4_63288411_bf5c_4d8f_80bc_d4fb08bc6d93(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0 && x % 10 != 0).count();
    }

    
    public static int countNums_Problem_3_147cc9b8_5e76_42ee_9995_a4b26a76dc99(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer num : arr) {
            if (num > 0) {
                count += num;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_5_1451808e_16d9_4796_abac_bb966d6e34b4(ArrayList<Integer> arr) {
        int count = 1;
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            boolean negative = arr.get(i) < 0;
            if (negative) {
                sum += (Math.pow(10, arr.size() - 1 - i) * arr.get(i));
            }
            if (sum > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_6_c1d408a3_05c1_454b_b532_118b1c74a914(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> Math.abs(x) > 0).count();
    }

    
    public static int countNums_Problem_5_ea20fe18_7874_494d_8b81_c0aa5f77b950(ArrayList<Integer> arr) {
        // Write your code here
        int sum = 0;
        for (int num : arr)
            sum += num;
        if (sum < 0)
            sum *= -1;
        int count = 0;
        for (int num : arr)
            count += Math.abs(num % 10);
        return count;
    }

    
    public static int countNums_Problem_1_ad23efde_7c36_487e_9088_c994a6f0a70c(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0).count();
    }

    
    public static int countNums_Problem_4_7d9e2cd3_eafc_4fff_92bc_394e188d0aa2(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0 && x % 10 != 0).count();
    }

    
    public static int countNums_Problem_4_ecba2b62_732a_4975_b761_95cc907eeec0(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer num : arr) {
            if (num > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_5_eb13cd91_196c_4c00_9609_32c3ce6f59d5(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            int sum = 0;
            while (i != 0) {
                sum += i % 10;
                i /= 10;
            }
            if (sum > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_7_c836875c_b3a3_4b3e_a29e_a0a64ade4ef5(ArrayList<Integer> arr) {

        int count = 0;
        for (int num : arr) {
            if (num < 0) {
                num = -num;
            }
            int sum = 0;
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            if (sum > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_6_ec2f79fc_4bb2_4ced_b244_abb58111b971(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            if (i > 0) {
                int sum = 0;
                while (i > 0) {
                    sum += i % 10;
                    i /= 10;
                }
                if (sum > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_5_9041c07b_6a95_4789_9ad8_71d6e6d035c3(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            if (i > 0) {
                if (i < 10) {
                    count++;
                } else {
                    int temp = i;
                    while (temp > 0) {
                        if (temp % 10 > 0) {
                            count++;
                        }
                        temp /= 10;
                    }
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_4_98606f5a_a023_479c_8983_eb802bdcb1ed(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> Math.abs(x) % 9 != 0).count();
    }

    
    public static int countNums_Problem_4_09161157_e82d_45e5_88e2_fe0274be137e(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0 && (x % 10) > 0).count();
    }

    
    public static int countNums_Problem_4_391c2e76_dea9_4238_b1d4_8e32bee9a064(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> Math.abs(x) > 0).count();
    }

    
    public static int countNums_Problem_6_c4444219_c3e7_4632_b323_c495c135ac62(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0).count();
    }

    
    public static int countNums_Problem_0_ae7cb4a7_d9a5_4b5e_8361_961cc727fea7(ArrayList<Integer> arr) {

        return arr.stream().filter(n -> n > 0).count();
    }

    
    public static int countNums_Problem_2_c65c88c0_a8ea_42eb_b60f_e6e05cc2c1da(ArrayList<Integer> arr) {
        return IntStream.range(0, arr.size())
                .filter(i -> IntStream.range(0,9).allMatch(j -> arr.get(i) % Math.pow(10, j) >= 0))
                .count();
    }

    
    public static int countNums_Problem_0_412ed3b9_1d2f_4248_95d6_cacbe778704b(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0 && (x % 10) > 0).count();
    }

    
    public static int countNums_Problem_2_e86635b0_12fa_4d9b_93dc_5522fc5763d3(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer l : arr) {
            if (l > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_1_c6e7c926_9681_4471_ab49_8d1f6c8432dd(ArrayList<Integer> arr) {
        if (arr.size() == 0) {
            return 0;
        }
        Set<Integer> set = new HashSet<Integer>();
        for (Integer l : arr) {
            if (l < 0) {
                l = -l;
            }
            set.add(l);
        }
        int ret = 0;
        for (Integer l : arr) {
            if (set.contains(Math.abs(l))) { // abs() returns positive if positive, negative if negative
                ret++;
            }
        }
        return ret;
    }

    
    public static int countNums_Problem_3_2e047386_36fc_407a_b328_e88d92bff506(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0 && (x % 10) > 0).count();
    }

    
    public static int countNums_Problem_2_0ac7af06_a5a6_44ca_bc92_0099a80f03d0(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0 && (x % 10 > 0 || x % 10 == 0)).count();
    }

    
    public static int countNums_Problem_0_147cc9b8_5e76_42ee_9995_a4b26a76dc99(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer num : arr) {
            if (num > 0) {
                count += num;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_3_68df87b8_f902_4eaa_ac12_eae3d801c80e(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer num : arr) {
            if (num > 0) {
                int sum = 0;
                while (num > 0) {
                    sum += num % 10;
                    num /= 10;
                }
                if (sum > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_4_28dac5c0_d3e8_4123_a046_a060527467d2(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer l : arr) {
            if (l > 0) {
                count += l;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_6_c576e6aa_bdcc_42c8_b308_d473195410a8(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> Math.abs(x) > 0).count();
    }

    
    public static int countNums_Problem_7_d0eccfa9_8326_47bc_96e4_f43345111bbc(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer num : arr) {
            if (num > 0) {
                count += num;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_6_b29e7d8b_cc48_4970_b791_a44f7702acfd(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer num : arr) {
            if (num > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_7_fe245933_1bf8_4bfd_8af0_f1b90d2ad974(ArrayList<Integer> arr) {
        int count = 0;
        for (Integer l : arr) {
            int n = Math.abs(l);
            count +=  Math.pow(10, arr.indexOf(n) + 1) - 1;
        }
        return count;
    }

    
    public static int countNums_Problem_6_5db36fc0_c35c_432c_b1ab_545717b039c3(ArrayList<Integer> arr) {
        int sum = 0;
        int cnt = 0;
        for(int i=0; i<arr.size(); i++) {
            sum += arr.get(i);
            if(sum < 0) {
                cnt += sum < 0 ? 1 : 0;
                sum = 0;
            } else {
                cnt += 1;
            }
        }
        return cnt;
    }

    
    public static int countNums_Problem_7_1cd2dd1c_3655_436e_a75b_326ba4d66483(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> Math.abs(x) > 0).count();
    }

    
    public static int countNums_Problem_0_55bd8aaf_0211_4aa1_93ff_f4ddbea5ad00(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0).count();
    }

    
    public static int countNums_Problem_3_88e74d1e_1d5f_45fa_8606_796b1abbe49c(ArrayList<Integer> arr) {

        int count = 0;
        for (int num : arr) {
            if (num < 0) {
                num = Math.abs(num);
            }
            int sum = 0;
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            if (sum > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_0_e871c437_ac0e_475d_9cb0_e234f99bb747(ArrayList<Integer> arr) {
        int sum = 0;
        for (Integer l : arr) {
            sum += Math.abs(l);
        }
        return sum;
    }

    
    public static int countNums_Problem_5_6a49699a_b2f2_475c_b0cc_fcdeb250dfd6(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> Math.abs(x) > 0).count();
    }

    
    public static int countNums_Problem_6_66c302c8_66e2_439c_ad41_2dfb6bf838fd(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0).count();
    }

    
    public static int countNums_Problem_5_f9db484b_4ff4_4653_9245_923fd644b5e7(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0).mapToInteger(x -> x).sum();
    }

    
    public static int countNums_Problem_0_75f7ce4e_051c_46a4_8449_762bf4c75f30(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0 && x % 10 != 0).count();
    }

    
    public static int countNums_Problem_6_16478396_2ca4_45a1_804e_fead43fe651f(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0).count();
    }

    
    public static int countNums_Problem_0_1222f4af_d68e_410f_9ae8_6e0f9da5df54(ArrayList<Integer> arr) {

        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) < 0) {
                sum += arr.get(i) % 10;
            } else {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    
    public static int countNums_Problem_3_e93d61db_6b08_4e76_8d7a_0274c20c3dba(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer num : arr) {
            if (num > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_2_6ad14d26_ef8f_498d_91e8_b96cab71a109(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0 && x % 10 != 0).count();
    }

    
    public static int countNums_Problem_0_29565b5f_14b1_4ab1_999f_e4bfcc7d446b(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> Math.abs(x) > 0).count();
    }

    
    public static int countNums_Problem_1_a4f7c9a7_878e_4ba1_9b0c_aa01b7601819(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            if (i > 0) {
                count += 1;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_1_008496c3_2ce3_4ca3_a647_4812ad0633d6(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            int sum = 0;
            while (i != 0) {
                sum += i % 10;
                i /= 10;
            }
            if (sum > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_1_b039a16a_8c36_4d2f_a3f6_66cf64a8ae60(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0 && x % 10 > 0).count();
    }

    
    public static int countNums_Problem_3_e86635b0_12fa_4d9b_93dc_5522fc5763d3(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer l : arr) {
            if (l > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_6_de7d7365_e785_44c4_b633_3b287c6d8f0f(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            int sum = 0;
            while (i != 0) {
                sum += i % 10;
                i /= 10;
            }
            if (sum > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_4_8403fe0c_7c70_4e2b_b24b_7d04062f439b(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> Math.abs(x) > 0).count();
    }

    
    public static int countNums_Problem_4_003e01c5_f35b_46e9_9729_c6fe04713401(ArrayList<Integer> arr) {

        int sum = 0;
        for (Integer x : arr) {
            if (x < 0) {
                sum += x % 10;
            } else {
                sum += x % 10;
            }
        }
        return sum;
    }

    
    public static int countNums_Problem_7_5ee17ee9_dd59_47ab_8f12_f60c4317bdd5(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0).count();
    }

    
    public static int countNums_Problem_2_b4c91c8d_2db3_437d_a2f6_67b5524fb3c6(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0 && (x % 10 > 0 || x % 10 == 0)).count();
    }

    
    public static int countNums_Problem_0_cbaa461e_a026_48a9_97b5_7418720eefaa(ArrayList<Integer> arr) {
        int res = 0;
        for (Integer e : arr)
            if (e > 0)
                res += e;
        return res;
    }

    
    public static int countNums_Problem_0_d4e0901d_6e9e_42f2_a4e0_6f3640248a24(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> Math.abs(x) > 0).count();
    }

    
    public static int countNums_Problem_7_a1f1a560_5e91_4599_a6e8_6ba2d0363026(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0 && x % 10 > 0).count();
    }

    
    public static int countNums_Problem_2_9128c9c3_2b8b_4766_944a_9c3e2d51a385(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            if (i > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_6_0b6f7c05_6e6c_40d5_98f5_fbb7756498b7(ArrayList<Integer> arr) {

        int count = 0;
        for (int num : arr) {
            if (num > 0) {
                int sum = 0;
                while (num > 0) {
                    sum += num % 10;
                    num /= 10;
                }
                if (sum > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_5_309f2c1a_70c6_4da5_8fae_0ffd07bb7f11(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            if (i > 0) {
                int sum = 0;
                while (i > 0) {
                    sum += i % 10;
                    i /= 10;
                }
                if (sum > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_4_897946ad_c329_4ae1_8116_a5023c8118bb(ArrayList<Integer> arr) {

        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int countNums_Problem_0_5cafc1d3_5146_49b7_953c_719419ad7b59(ArrayList<Integer> arr) {
        // YOUR CODE GOES BELOW
        int numSum = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) < 0) numSum = Math.abs(numSum) + Math.abs(arr.get(i));
            else numSum = numSum + arr.get(i);
        }
        return numSum;
    }

    
    public static int countNums_Problem_7_e93d61db_6b08_4e76_8d7a_0274c20c3dba(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer num : arr) {
            if (num > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_3_b5e20268_a3ae_4c81_9370_8998dfeb4415(ArrayList<Integer> arr) {

        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) < 0) {
                count += arr.get(i) / Math.abs(arr.get(i));
            } else {
                count += arr.get(i) / arr.get(i);
            }
        }
        return count;
    }

    
    public static int countNums_Problem_6_49e41556_54cf_44b7_9eb0_3821b47cf993(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer l : arr) {
            if (l > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_5_c4444219_c3e7_4632_b323_c495c135ac62(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0).count();
    }

    
    public static int countNums_Problem_4_27ff188f_cd19_47cd_966a_3937c7c128fb(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> Math.abs(x) > 0).count();
    }

    
    public static int countNums_Problem_2_19c7bbd4_c6cd_4a22_9a92_25a848a324a4(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer num : arr) {
            if (num > 0) {
                int sum = 0;
                while (num > 0) {
                    sum += num % 10;
                    num /= 10;
                }
                if (sum > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_6_22c73cd1_f08e_4b87_94cc_2a0f8d720fba(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0).count();
    }

    
    public static int countNums_Problem_6_0d20a906_2d8f_44aa_90e6_6a6f21846a3f(ArrayList<Integer> arr) {

        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            int num = arr.get(i);
            if (num > 0) {
                count++;
            }
            else {
                int sum = 0;
                while (num != 0) {
                    sum += num % 10;
                    num /= 10;
                }
                if (sum > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_1_83dd47d6_96d2_435d_ae6a_e745347f2b76(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer l : arr) {
            if (l > 0) {
                count += l;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_5_fb01c732_375c_4987_bb41_1c2161ce8ba0(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer x : arr) {
            if (x < 0) {
                count += x % 10;
            } else {
                count += x % 10;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_1_a79241c9_7012_4fde_a1e8_97f5d61462b3(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> Math.abs(x) > 0).count();
    }

    
    public static int countNums_Problem_3_4a23e970_6561_410b_a7fa_8d18bd0c50f5(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> Math.abs(x) > 0).count();
    }

    
    public static int countNums_Problem_7_a9d15901_b07d_49f6_9fcb_5cef6163a2ce(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0 && x % 10 > 0).count();
    }

    
    public static int countNums_Problem_1_4eeb51e2_7e1a_4002_b5ea_c2b44e732f71(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            int sum = 0;
            while (i != 0) {
                sum += i % 10;
                i /= 10;
            }
            if (sum > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_3_a0e27526_98e8_4c97_b937_97dd41bb17c7(ArrayList<Integer> arr) {
        int sum = 0;
        for (Integer l : arr) {
            sum += l;
        }
        return sum;
    }

    
    public static int countNums_Problem_6_800f3daa_03a3_46d2_bde8_47b1f77dc320(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer x : arr) {
            if (x > 0) {
                count += x;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_7_29565b5f_14b1_4ab1_999f_e4bfcc7d446b(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> Math.abs(x) > 0).count();
    }

    
    public static int countNums_Problem_0_09161157_e82d_45e5_88e2_fe0274be137e(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0 && (x % 10) > 0).count();
    }

    
    public static int countNums_Problem_5_ae7cb4a7_d9a5_4b5e_8361_961cc727fea7(ArrayList<Integer> arr) {

        return arr.stream().filter(n -> n > 0).count();
    }

    
    public static int countNums_Problem_2_1bcb2e99_c412_4e27_bd50_23fb1a5541a7(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer num : arr) {
            if (num > 0) {
                count += num;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_2_fe245933_1bf8_4bfd_8af0_f1b90d2ad974(ArrayList<Integer> arr) {
        int count = 0;
        for (Integer l : arr) {
            int n = Math.abs(l);
            count +=  Math.pow(10, arr.indexOf(n) + 1) - 1;
        }
        return count;
    }

    
    public static int countNums_Problem_2_a72f9772_b000_448a_ba70_7a6f6461f914(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> Math.abs(x) > 0).count();
    }

    
    public static int countNums_Problem_5_0d20a906_2d8f_44aa_90e6_6a6f21846a3f(ArrayList<Integer> arr) {

        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            int num = arr.get(i);
            if (num > 0) {
                count++;
            }
            else {
                int sum = 0;
                while (num != 0) {
                    sum += num % 10;
                    num /= 10;
                }
                if (sum > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_7_3f564c46_c3bf_41a1_80c8_1bd01eae631c(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer l : arr) {
            if (l > 0) {
                count++;
            } else {
                int sum = 0;
                while (l < 0) {
                    sum += l % 10;
                    l /= 10;
                }
                if (sum > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int countNums_Problem_3_da495c2c_1b85_48f6_a74f_b919abcb61e8(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            int sum = 0;
            while (i != 0) {
                sum += i % 10;
                i /= 10;
            }
            if (sum > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_2_6901a365_71fb_4543_b2b2_ca9dd534857c(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0).count();
    }

    
    public static int countNums_Problem_3_2fff1e5c_5fa2_44a8_92f9_70ee3138363c(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            int sum = 0;
            while (i != 0) {
                sum += i % 10;
                i /= 10;
            }
            if (sum > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_2_84bfd40d_e603_4f6c_9037_1395be9b20e3(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer n : arr) {
            if (n < 0) {
                count += n % 10;
            } else {
                count += n % 10;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_5_98606f5a_a023_479c_8983_eb802bdcb1ed(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> Math.abs(x) % 9 != 0).count();
    }

    
    public static int countNums_Problem_0_83dd47d6_96d2_435d_ae6a_e745347f2b76(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer l : arr) {
            if (l > 0) {
                count += l;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_1_6ad14d26_ef8f_498d_91e8_b96cab71a109(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0 && x % 10 != 0).count();
    }

    
    public static int countNums_Problem_7_4eeb51e2_7e1a_4002_b5ea_c2b44e732f71(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            int sum = 0;
            while (i != 0) {
                sum += i % 10;
                i /= 10;
            }
            if (sum > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_0_76bbf884_5dd0_4b62_8c5c_90981590f92c(ArrayList<Integer> arr) {
        // write your solution here
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

    
    public static int countNums_Problem_2_37ef7589_1b5f_47f7_8fba_ea84aff16701(ArrayList<Integer> arr) {
        int sum = 0;
        for (int l : arr) {
            sum += Math.abs(l);
        }
        return sum;
    }

    
    public static int countNums_Problem_2_6585d4a6_d6e0_4ccb_a6d8_756a1748b4e8(ArrayList<Integer> arr) {
        return arr.stream().filter(n -> n%10 != 0).count();
    }

    
    public static int countNums_Problem_2_4b25b8f8_5446_46e2_831f_bbf863098751(ArrayList<Integer> arr) {
        return arr.stream()
                .filter(e -> e > 0)
                .collect(Collectors.toList()).size();
    }

    
    public static int countNums_Problem_7_6a17d503_2b2f_44b0_b356_a7e3561da34e(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            int sum = 0;
            while (i != 0) {
                sum += i % 10;
                i /= 10;
            }
            if (sum > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_3_014eb7b5_76fa_4d98_960c_0cc54ae4befd(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> Math.abs(x) > 0).count();
    }

    
    public static int countNums_Problem_0_69c8042a_1ac5_4e0a_a122_2788c8f98a85(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> Math.abs(x) > 0).count();
    }

    
    public static int countNums_Problem_5_95c470ce_01af_4904_8c82_6afd91a4db46(ArrayList<Integer> arr) {

        int count = 0;
        for (int i : arr) {
            int sum = 0;
            int num = i;
            while (num != 0) {
                sum += num % 10;
                num /= 10;
            }
            if (sum > 0) {
                count++;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_7_0a2b0811_7db4_4d65_ad33_08d29277f2d2(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0 && x % 10 != 0).count();
    }

    
    public static int countNums_Problem_6_1b5dccc7_360a_44e4_8518_1992259617d0(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0 && x % 10 > 0).count();
    }

    
    public static int countNums_Problem_1_a125f9da_fa9c_447f_b867_01c3328ad7ad(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> Math.abs(x) > 0).count();
    }

    
    public static int countNums_Problem_0_73b40750_cdbe_4da6_9322_97e2441c202f(ArrayList<Integer> arr) {

        int count = 0;
        for (Integer x : arr) {
            if (x > 0) {
                count += x;
            }
        }
        return count;
    }

    
    public static int countNums_Problem_4_d7842cb1_55a1_4e3c_aff8_36f8d81b4b7a(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0).count();
    }

    
    public static int countNums_Problem_0_952c190c_09e3_4d16_9f4d_7ca2bcecd73c(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> Math.abs(x) > 0).count();
    }

    
    public static int countNums_Problem_0_369e3f93_95a2_45c8_b7da_ce03c7097298(ArrayList<Integer> arr) {

        return arr.stream().filter(x -> x > 0).count();
    }

}
