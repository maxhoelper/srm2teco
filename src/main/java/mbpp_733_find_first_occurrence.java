package mbpp_733_find_first_occurrence;

public class mbpp_733_find_first_occurrence {

    
    public static int findFirstOccurrence_Problem_0_b4de3648_586b_455c_a272_565b6513aa5d(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_8f970750_4f9a_4002_9354_0db75a3bde92(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == A.get(mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_53345b58_ab13_4e3a_b0bc_c2d683e57991(ArrayList<Integer> A, int x) {
        return A.indexOf(A.get( Math.floorDiv(A.size() - 1, x)));
    }

    
    public static int findFirstOccurrence_Problem_2_7c2c4c16_adfd_410d_ae66_f3a7f568194f(ArrayList<Integer> A, int x) {
        int first = 1;
        int count = 0;
        for (int i = 0; i < A.size(); i++) {
            if (A.get(i) == x) {
                count++;
            }
            if (A.get(i) < x) {
                if (count == 1) {
                    first = i;
                }
                break;
            }
        }
        return first;
    }

    
    public static int findFirstOccurrence_Problem_0_e881ed6a_735f_42d7_a7c4_b91c5fba0ce9(ArrayList<Integer> A, int x) {
        // Write your code here
        int low = 0;
        int high = A.size() - 1;
        int mid = 0;
        int result = -1;
        while (low <= high) {
            mid = (low + high) / 2;
            if (A.get( mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get( mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_f1463a92_bfee_46bb_a8e6_47223960e407(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_1_14d2fa57_b3c3_4563_b266_68c6d392595e(ArrayList<Integer> A, int x) {
        int low = 0, high = A.size() - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (A.get(mid) == x) {
                if (mid == 0 || A.get(mid - 1) != x) {
                    return mid;
                } else {
                    high = mid - 1;
                }
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_0_9d52cad2_e233_48fc_a70e_aed623eb3210(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int mid = 0;
        int result = -1;
        while (low <= high) {
            mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_bfce2605_c633_4ae5_9d80_210917e4834d(ArrayList<Integer> A, int x) {
        // Binary search
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_a8bdbc1a_815f_483c_b9f8_4e64a888c61d(ArrayList<Integer> A, int x) {
        int l = 0;
        int r = A.size() - 1;
        int m = 0;
        while (l <= r) {
            m = l + (r - l) / 2;
            if (A.get(m) == x) {
                if (m == 0 || A.get(m - 1) != x) {
                    return m;
                } else {
                    r = m - 1;
                }
            } else if (A.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_2_b521a1ad_7c28_4af3_b957_21343fbf731c(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_1_a69d0a27_faed_44fd_8d52_4fbbc003ca0a(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == A.get(mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_97c886ee_faac_4bea_a374_f01d77f7c334(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == A.get(mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_57b61c83_1599_4486_b3e6_2f057551b12c(ArrayList<Integer> A, int x) {
        // Write your code here
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_dca75944_5c44_44cb_a418_d8d38ef7c71c(ArrayList<Integer> A, int x) {
        // TODO: Write - Your - Code
        return 0;
    }

    
    public static int findFirstOccurrence_Problem_0_5aece756_745f_4312_a4e5_ce40a49ddfe0(ArrayList<Integer> A, int x) {
        int l = 0;
        int r = A.size() - 1;
        int ans = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (A.get( mid) == x) {
                ans = mid;
                r = mid - 1;
            } else if (A.get( mid) < x) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return ans;
    }

    
    public static int findFirstOccurrence_Problem_1_c07d320b_20e3_4e70_beec_9f190441c284(ArrayList<Integer> A, int x) {
        // TODO: Your code here
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_2_51454a07_7301_40e6_a0ac_5074358df2e6(ArrayList<Integer> A, int x) {
        int pos = 0;
        int i = 0;
        int found;
        while (i != A.size() - 1) {
            found =  A.get(i++);
            if (x == found) {
                return pos;
            }
            if (x > found) {
                pos = 0;
            } else {
                pos++;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_2_b36b5bd7_2775_42eb_8c05_20ebce4d23bd(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_2_ae510d87_502d_4297_8679_57a10a9944ef(ArrayList<Integer> A, int x) {
        // Binary search
        int low = 0;
        int high = A.size() - 1;
        int mid = 0;
        while (low <= high) {
            mid = (low + high) / 2;
            if (A.get(mid) == x) {
                if (mid == 0 || A.get(mid - 1) != x) {
                    return mid;
                } else {
                    high = mid - 1;
                }
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_2_3c64e59d_5a52_48d3_8387_ef26325cb248(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_1_517a8cee_89b7_4b8a_aa12_c199f5b8e885(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_2_780553cb_8e1f_426b_b955_9221a4fabefb(ArrayList<Integer> A, int x) {
        // TODO: Write - Your - Code
        return 0;
    }

    
    public static int findFirstOccurrence_Problem_2_a4468dc8_50e2_469d_87bc_22aae246e2e4(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_0_788b89d3_2b3b_473c_a73c_95e758dcea01(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (x == A.get(mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_b7a20c62_3569_48b4_af07_faea37f7f331(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_2_8d58b28e_0109_405d_9efb_d82e53ba5558(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_6a268f0f_9e2a_47d5_b9a5_cf0b6e83b11e(ArrayList<Integer> A, int x) {
        int lo = 0;
        int hi = A.size() - 1;
        int result = -1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (A.get(mid) >= x) {
                result = mid;
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_b28f08c7_60db_44c7_9011_4304734c6b32(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get( mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get( mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_97ef5f14_f5f1_403a_8937_97b2d2ff7c5e(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_2_7e0e2f67_c897_40d5_a0af_dad7124b6866(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_2_3edb2f94_5bec_481d_b9ca_1a001ae44690(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int mid = 0;
        int result = -1;
        while (low <= high) {
            mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_4e840c3c_0ec1_427c_8b64_a74ed68e7167(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_0_b390788d_ab83_4cae_933f_884cf6665397(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_0_7c7ae11b_0d83_459b_8b79_a197b36d640f(ArrayList<Integer> A, int x) {
        // TODO: Implement me!
        return 0;
    }

    
    public static int findFirstOccurrence_Problem_1_13f87ee2_edc1_459e_b26a_64d2629a897c(ArrayList<Integer> A, int x) {
        // Write your code here
        int low = 0;
        int high = A.size() - 1;
        int mid = 0;
        int result = -1;
        while (low <= high) {
            mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_a311b90b_3c46_4d7d_8aa4_a61681e02171(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int mid = 0;
        int result = -1;
        while (low <= high) {
            mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_1a2c274e_2703_44b3_8c96_33b3371f7474(ArrayList<Integer> A, int x) {
        // Write your code here
        int l = 0;
        int r = A.size() - 1;
        int ans = -1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (A.get( mid) == x) {
                ans = mid;
                r = mid - 1;
            } else if (A.get( mid) > x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return ans;
    }

    
    public static int findFirstOccurrence_Problem_1_8363a71c_caf1_49a3_b131_1a2d08af9363(ArrayList<Integer> A, int x) {
        // Write your code here
        int start = 0;
        int end = A.size() - 1;
        int result = -1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (x == A.get(mid)) {
                result = mid;
                end = mid - 1;
            } else if (x < A.get(mid)) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_189f9203_1f17_4f83_9ba9_88abf2c0d594(ArrayList<Integer> A, int x) {
        // Your code here
        int start = 0;
        int end = A.size() - 1;
        int mid = 0;
        int result = -1;
        while (start <= end) {
            mid = (start + end) / 2;
            if (A.get( mid) == x) {
                result = mid;
                end = mid - 1;
            } else if (A.get( mid) < x) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_30e8e639_8fcc_461e_b9d2_29f1157c60d3(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_0_ce9b87ec_1979_4cec_8c25_fb910ef680b3(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_92ed4a7d_26b3_4d75_88bd_dcacc7d891fe(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == A.get(mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_79df92ef_5bfe_4159_aecd_728e909e11dd(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_a787cfdf_4f73_4606_a942_fc352c9a9875(ArrayList<Integer> A, int x) {
        int left = 0;
        int right = A.size() - 1;
        int mid = 0;
        while (left <= right) {
            mid = (left + right) / 2;
            if (A.get(mid) == x) {
                if (mid == 0 || A.get(mid - 1) != x) {
                    return mid;
                } else {
                    right = mid - 1;
                }
            } else if (A.get(mid) < x) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_1_688493bc_43ed_43da_a312_820e1b8764f3(ArrayList<Integer> A, int x) {
        int index = -1;
        int i = 0;
        while(i < A.size() && A.get(i) < x) {
            i++;
        }
        while(i < A.size() && A.get(i) == x) {
            index = i;
            i++;
        }
        return index;
    }

    
    public static int findFirstOccurrence_Problem_2_2c7307de_0816_4aea_b386_b16a69f3e83d(ArrayList<Integer> A, int x) {
        // Write - Your - Code
        int low = 0;
        int high = A.size() - 1;
        int mid = 0;
        int result = -1;
        while (low <= high) {
            mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_7a054a4f_83db_4e23_96ef_015b8b7d0278(ArrayList<Integer> A, int x) {
        // write your logic here
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_2_8dfc532d_d318_495f_9733_bd1de930aefd(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_2_8ca1577b_9bc5_4d9a_b9fb_bde8164fc86c(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == A.get(mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_eb50211b_5bc1_4657_9c67_e036fead04af(ArrayList<Integer> A, int x) {
        // Binary search
        int low = 0;
        int high = A.size() - 1;
        int mid = 0;
        while (low <= high) {
            mid = (low + high) / 2;
            if (A.get(mid) == x) {
                if (mid == 0 || A.get(mid - 1) != x) {
                    return mid;
                } else {
                    high = mid - 1;
                }
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_1_722285e5_be31_48dc_a730_5c7d07b3b716(ArrayList<Integer> A, int x) {
        // Write your code here
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == A.get( mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get( mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_1089e287_0b3f_432d_9ed6_48b4858e2ff0(ArrayList<Integer> A, int x) {
        int index = -1;
        for (int i = 1; i < A.size(); i++) {
            if (A.get(i) > x) {
                index = i;
                break;
            }
        }
        return index;
    }

    
    public static int findFirstOccurrence_Problem_0_78429e4f_575a_4365_8196_a9a22855e939(ArrayList<Integer> A, int x) {
        int firstOccur = -1;
        int j = 0;
        // for (int i=0; i<A.size(); i++) {
        for (; j<A.size(); j++)
            if (A.get(j) == x)
                break;
        if (firstOccur==-1)
            firstOccur = j;
        return firstOccur;
    }
    public static void main(String[] args) {
    assert(findFirstOccurrence_Problem_0_78429e4f_575a_4365_8196_a9a22855e939((new ArrayList<Integer>(Arrays.asList(2, 5, 5, 5, 6, 6, 8, 9, 9, 9))), (5)) == (1));
    assert(findFirstOccurrence_Problem_0_78429e4f_575a_4365_8196_a9a22855e939((new ArrayList<Integer>(Arrays.asList(2, 3, 5, 5, 6, 6, 8, 9, 9, 9))), (5)) == (2));
    assert(findFirstOccurrence_Problem_0_78429e4f_575a_4365_8196_a9a22855e939((new ArrayList<Integer>(Arrays.asList(2, 4, 1, 5, 6, 6, 8, 9, 9, 9))), (6)) == (4));
    }

}

    
    public static int findFirstOccurrence_Problem_2_2108423b_8b3d_436e_b7e6_3d4b56c0cd97(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int mid = 0;
        int result = -1;
        while (low <= high) {
            mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_03580f70_660b_4b7d_9eaf_3f27b5057b92(ArrayList<Integer> A, int x) {
        int n = A.size();
        int low = 0;
        int high = n - 1;
        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_5efadfcf_e8f1_46d4_bcf7_41f7f369e4a3(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_76cac237_27a3_4953_a87e_fc44750373e0(ArrayList<Integer> A, int x) {
        int l = 0;
        int r = A.size() - 1;
        int result = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (A.get(mid) == x) {
                result = mid;
                r = mid - 1;
            } else if (A.get(mid) > x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_1df97f4e_47dd_4381_8b96_28edb6aa67d0(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_1_8eaeed3e_00e6_4ecf_8aed_923d5da8cb22(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == A.get(mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_60d7cdcf_1f2d_4809_b422_1d4bfc2730f1(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == A.get(mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_6a625ffa_a777_4924_bfc8_5d81c4bd2563(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_0_63054dd1_9ff9_45b5_b639_f67bfdd4b1fb(ArrayList<Integer> A, int x) {
        int left = 0;
        int right = A.size() - 1;
        int mid = 0;
        while (left <= right) {
            mid = left + (right - left) / 2;
            if (A.get(mid) == x) {
                if (mid == 0 || A.get(mid - 1) != x) {
                    return mid;
                } else {
                    right = mid - 1;
                }
            } else if (A.get(mid) > x) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_0_b547198e_6dae_4aeb_8a7a_3e46bd86694e(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_2_459e12c0_ec89_4275_bb61_a1c72d678558(ArrayList<Integer> A, int x) {
        // Write your code here
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_6e910605_4609_4d73_b222_9dc2bc0a398e(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_1_1b1123ea_35f7_4b3a_bcaf_d6ef79256332(ArrayList<Integer> A, int x) {
        // Write your code here
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == A.get( mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get( mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_e8828902_bb34_4a22_a23b_06646078ed17(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == A.get(mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_cb9775e8_306a_4c01_b367_9d76bdb8d307(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int mid = 0;
        int result = -1;
        while (low <= high) {
            mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_21e426f7_7cb4_440e_acb7_70b5d8bd7721(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_1_7c7ae11b_0d83_459b_8b79_a197b36d640f(ArrayList<Integer> A, int x) {
        // TODO: Implement me!
        return 0;
    }

    
    public static int findFirstOccurrence_Problem_1_58ab4625_067f_4e48_8811_ebc59028f8d3(ArrayList<Integer> A, int x) {
        // Write your code here
        int low = 0;
        int high = A.size() - 1;
        int mid = 0;
        while (low <= high) {
            mid = (low + high) / 2;
            if (A.get(mid) == x) {
                if (mid == 0 || A.get(mid - 1) != x) {
                    return mid;
                } else {
                    high = mid - 1;
                }
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_1_a311b90b_3c46_4d7d_8aa4_a61681e02171(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int mid = 0;
        int result = -1;
        while (low <= high) {
            mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_6222fd01_178b_43d5_ac71_340ac4e42f1e(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int mid = 0;
        int result = -1;
        while (low <= high) {
            mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_5cbeda81_67a9_44f3_a7e1_d0abe909c69b(ArrayList<Integer> A, int x) {
        // Write your code here
        // return -1;
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_772fc63b_918c_4abd_84dc_a3a72a927ed5(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_183833bd_ba8a_4a9c_92fb_b30de602924d(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_2_423058d8_24a8_4650_b423_8f9f363f490a(ArrayList<Integer> A, int x) {
        // Write your code here.
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == A.get(mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_d9b60ace_4553_402d_9f15_38099268ab1f(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == A.get(mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_2873c4ed_32b4_4fe6_85f5_ed0b4bd90923(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_1_78429e4f_575a_4365_8196_a9a22855e939(ArrayList<Integer> A, int x) {
        int firstOccur = -1;
        int j = 0;
        // for (int i=0; i<A.size(); i++) {
        for (; j<A.size(); j++)
            if (A.get(j) == x)
                break;
        if (firstOccur==-1)
            firstOccur = j;
        return firstOccur;
    }
    public static void main(String[] args) {
    assert(findFirstOccurrence_Problem_1_78429e4f_575a_4365_8196_a9a22855e939((new ArrayList<Integer>(Arrays.asList(2, 5, 5, 5, 6, 6, 8, 9, 9, 9))), (5)) == (1));
    assert(findFirstOccurrence_Problem_1_78429e4f_575a_4365_8196_a9a22855e939((new ArrayList<Integer>(Arrays.asList(2, 3, 5, 5, 6, 6, 8, 9, 9, 9))), (5)) == (2));
    assert(findFirstOccurrence_Problem_1_78429e4f_575a_4365_8196_a9a22855e939((new ArrayList<Integer>(Arrays.asList(2, 4, 1, 5, 6, 6, 8, 9, 9, 9))), (6)) == (4));
    }

}

    
    public static int findFirstOccurrence_Problem_1_5e73b0bd_ceb5_47be_bc01_a952e462d0ac(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int mid = 0;
        int result = -1;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_9b5a263c_a0cb_48ac_8230_33beb8f29701(ArrayList<Integer> A, int x) {
        // write your code here
        int low = 0, high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x && (mid == 0 || A.get(mid - 1) < x))
                return mid;
            else if (A.get(mid) >= x)
                high = mid - 1;
            else
                low = mid + 1;
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_1_b08815ae_b07e_4460_8a74_46b0a884eb02(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == A.get(mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_77661242_1ddd_4951_8294_fccb7f143ba5(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_f9723ed1_c340_46e2_95a5_08b61a26ebdc(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_1_3beb8f93_bf03_4254_9644_5bc5b6bde209(ArrayList<Integer> A, int x) {
        for (int i = 0; i < A.size(); i++) {
            if (A.get(i) == x) return i;
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_0_caf605d6_96b8_4cd5_8a4d_be7aed1753ac(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_2_3a03808e_b570_466d_82ad_24105c519733(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_efc1c736_39be_47b9_8ab4_ccf74a25abad(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_1_ebfdfe25_0007_40a6_83e8_34309c950489(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_1_ad36e8fe_9a36_42e6_b6c5_5427280b1781(ArrayList<Integer> A, int x) {
        if (A.size() == 0) return -1;
        // Ask the array list to find it
        int index = A.indexOf(x);
        // If it's not found, return the answer
        if (index == -1) return -1;
        // Otherwise move the pointer
        return index + 1;
    }

    
    public static int findFirstOccurrence_Problem_1_77661242_1ddd_4951_8294_fccb7f143ba5(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_d28658d8_db51_4ee2_9c2f_54bb6f9e7ec5(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) >>> 1;
            if (A.get(mid) < x)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return low;
    }

    
    public static int findFirstOccurrence_Problem_2_83e385de_ace3_4370_af0b_36c602288071(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int mid = 0;
        int result = -1;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_9fe0f1dd_862d_4c3b_a80b_fe7c99359f41(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == A.get(mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_0408f920_d866_4efa_959d_9d9d0a32db8c(ArrayList<Integer> A, int x) {
        // Your code goes here.
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_ccc286ad_a67f_4791_a26f_5e831ff77034(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_1_37b37a61_5e19_44d1_87f9_487098ce41c1(ArrayList<Integer> A, int x) {
        int lo = 0;
        int hi = A.size() - 1;
        int result = -1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (x == A.get(mid)) {
                result = mid;
                hi = mid - 1;
            } else if (x < A.get(mid)) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_14d2fa57_b3c3_4563_b266_68c6d392595e(ArrayList<Integer> A, int x) {
        int low = 0, high = A.size() - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (A.get(mid) == x) {
                if (mid == 0 || A.get(mid - 1) != x) {
                    return mid;
                } else {
                    high = mid - 1;
                }
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_0_e2bd3ad0_bdf4_4deb_9299_aea6e24d051d(ArrayList<Integer> A, int x) {
        int n = A.size();
        int low = 0;
        int high = n - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == A.get(mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_3b130185_45d6_4cdb_b555_a19bb4e4162e(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_1_d39c3723_9cb6_4fa4_a622_a459e4ab5b91(ArrayList<Integer> A, int x) {
        
        int result = -1;
        for (int i = 0; i < A.size(); i++) {
            if (A.get(i) == x) {
                result = i;
                break;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_f818fd59_d9be_4619_9603_bd4d1dba8f4b(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == A.get(mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_48b2ce7d_94dd_4834_b676_0e8f89998550(ArrayList<Integer> A, int x) {
        // return A.indexOf(x);
        int low = 0;
        int high = A.size() - 1;
        int mid = 0;
        while (low <= high) {
            mid = (low + high) / 2;
            if (A.get(mid) == x) {
                if (mid == 0 || A.get(mid - 1) != x) {
                    return mid;
                } else {
                    high = mid - 1;
                }
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_0_54111574_ba7a_4edb_86bd_1cc0be425e9b(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == A.get(mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_30f584ee_8aa9_4c27_86a6_7bc3317e7f77(ArrayList<Integer> A, int x) {
        // Binary search
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_8b961b5e_67cd_44d7_8c9a_ad80b9633ea0(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == A.get(mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_4b19012a_4220_4459_bc62_f95d41db9952(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_1_464eb54f_3f13_4f6d_9fe7_f886bc1ff7ea(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int mid = 0;
        int result = -1;
        while (low <= high) {
            mid = (low + high) / 2;
            if (x == A.get(mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_18b6cad1_1523_45ed_9e7b_0590d64e0f24(ArrayList<Integer> A, int x) {
        return Collections.binarySearch(A, x);
    }

    
    public static int findFirstOccurrence_Problem_2_09c89001_58fe_488a_8a9c_2d974c16d2f8(ArrayList<Integer> A, int x) {
        int low = 0, high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_967baf98_001a_43a5_bbda_6694e87e80ca(ArrayList<Integer> A, int x) {
        int low = 0, high = A.size() - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (A.get(mid) == x && (mid == 0 || A.get(mid - 1) != x)) {
                return mid;
            } else if (A.get(mid) >= x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_0_2817a559_598d_4feb_a2c6_397b9489f757(ArrayList<Integer> A, int x) {
        // Write your code here
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_0_eae5d8fa_de55_4636_971e_7a7b3cbb03b2(ArrayList<Integer> A, int x) {
        int index = -1;
        for(int i = 0; i < A.size(); i++) {
            if(A.get(i) == x) {
                index = i;
                break;
            }
        }
        return index;
    }

    
    public static int findFirstOccurrence_Problem_2_b0af17cb_832d_4c99_abb5_de8726b07546(ArrayList<Integer> A, int x) {
        int lo = 0;
        int hi = A.size() - 1;
        int result = -1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (x == A.get(mid)) {
                result = mid;
                hi = mid - 1;
            } else if (x < A.get(mid)) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_ceac88f1_23d6_472b_b622_073bfca534a5(ArrayList<Integer> A, int x) {
        // Write your code here
        int low = 0;
        int high = A.size() - 1;
        int mid = 0;
        while (low <= high) {
            mid = (low + high) / 2;
            if (A.get(mid) == x) {
                if (mid == 0 || A.get(mid - 1) != x) {
                    return mid;
                } else {
                    high = mid - 1;
                }
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_2_dc0a082e_57a2_4ae7_8039_bb565d083c0b(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == A.get(mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_b7a20c62_3569_48b4_af07_faea37f7f331(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_0_c3a436d8_3050_4e72_b0b2_f023046f9bd2(ArrayList<Integer> A, int x) {
        int lo = 0;
        int hi = A.size() - 1;
        int mid = 0;
        while (lo <= hi) {
            mid = (lo + hi) / 2;
            if (A.get( mid) == x) {
                if (mid == 0 || A.get( mid - 1) != x) {
                    return mid;
                } else {
                    hi = mid - 1;
                }
            } else if (A.get( mid) < x) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_1_66331285_2d48_4783_81e7_8da341cea695(ArrayList<Integer> A, int x) {
        int index = -1;
        for(int i = 0; i < A.size(); i++) {
            if(A.get(i) == x) {
                index = i;
                break;
            }
        }
        return index;
    }

    
    public static int findFirstOccurrence_Problem_2_688493bc_43ed_43da_a312_820e1b8764f3(ArrayList<Integer> A, int x) {
        int index = -1;
        int i = 0;
        while(i < A.size() && A.get(i) < x) {
            i++;
        }
        while(i < A.size() && A.get(i) == x) {
            index = i;
            i++;
        }
        return index;
    }

    
    public static int findFirstOccurrence_Problem_1_1423c1fa_ad6d_478f_987a_21d037736d1f(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_2_f1464485_7943_4b82_b1ef_326d6713f074(ArrayList<Integer> A, int x) {
        int i = 0;
        for(int a : A) {
            if(a == x) {
                return i;
            }
            i++;
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_0_e6d8742c_726a_497a_be2f_3deb30ff5089(ArrayList<Integer> A, int x) {
        // Write your code here
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_e2c6b56d_410d_497e_9b45_2c2bb37ced79(ArrayList<Integer> A, int x) {
        int index = A.indexOf(x);
        if (index > 0) {
            index = A.indexOf(x - 1);
        }
        return index;
    }

    
    public static int findFirstOccurrence_Problem_0_a787cfdf_4f73_4606_a942_fc352c9a9875(ArrayList<Integer> A, int x) {
        int left = 0;
        int right = A.size() - 1;
        int mid = 0;
        while (left <= right) {
            mid = (left + right) / 2;
            if (A.get(mid) == x) {
                if (mid == 0 || A.get(mid - 1) != x) {
                    return mid;
                } else {
                    right = mid - 1;
                }
            } else if (A.get(mid) < x) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_1_c141c3e3_638e_43d5_af41_c5f7f3876036(ArrayList<Integer> A, int x) {
        int index = Collections.binarySearch(A, x);
        if(index < 0)
            return -1;
        else if(index == 0)
            return 0;
        else
            return index-1;
    }

    
    public static int findFirstOccurrence_Problem_2_2d333671_9709_43eb_99b9_a698383e67d1(ArrayList<Integer> A, int x) {
        // Write your code here
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == A.get( mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get( mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_c761b763_d4cb_46f3_b5bc_3278c821e6b6(ArrayList<Integer> A, int x) {
        // Write your code here
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_77bf9cd5_5a58_42cf_ad7b_6c1048b69885(ArrayList<Integer> A, int x) {
        int index = -1;
        int j;
        for (j=0; j<A.size(); j++){
            if(A.get(j)==x){
                index=j;
                break;
            }
        }
        return index;
    }

    
    public static int findFirstOccurrence_Problem_0_fcfe0626_49d6_4081_bf33_9e53201b74cd(ArrayList<Integer> A, int x) {
        int index = 0;
        for (int i = 0; i < A.size(); i++) {
            if (A.get(i) > x) {
                break;
            }
            if (A.get(i) == x) {
                index = i;
            }
        }
        return index;
    }

    
    public static int findFirstOccurrence_Problem_1_a050b3ff_38c4_402e_b66f_4f048e7988ad(ArrayList<Integer> A, int x) {
        // Write your code here
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (A.get( mid) == x) {
                if (mid == 0 || A.get( mid - 1) != x) {
                    return mid;
                } else {
                    high = mid - 1;
                }
            } else if (A.get( mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_0_1a2c274e_2703_44b3_8c96_33b3371f7474(ArrayList<Integer> A, int x) {
        // Write your code here
        int l = 0;
        int r = A.size() - 1;
        int ans = -1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (A.get( mid) == x) {
                ans = mid;
                r = mid - 1;
            } else if (A.get( mid) > x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return ans;
    }

    
    public static int findFirstOccurrence_Problem_0_c07d320b_20e3_4e70_beec_9f190441c284(ArrayList<Integer> A, int x) {
        // TODO: Your code here
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_2_e6c2bf27_f428_4b5f_8a69_7c6f138763c6(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size()-1;
        while (high >= low) {
            int mid = (low + high) >>> 1;
            int midVal = A.get(mid);
            if (midVal == x) {
                return mid;
            }
            else if (midVal < x) {
                low = mid+1;
            }
            else {
                high = mid-1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_0_e81e617f_a0a5_4e05_8782_33a36711fd02(ArrayList<Integer> A, int x) {
        int idx = -1;
        int i = 0;
        
        while(i < A.size()) {
            idx = i;
            if(A.get(i) >= x)
                break;
            i++;
        }
        
        return idx;
    }

    
    public static int findFirstOccurrence_Problem_1_1b786603_0429_44ee_80ee_fb7d580e4a55(ArrayList<Integer> A, int x) {
        // Write your code here
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (A.get( mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get( mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_f55768a9_403b_49b9_999c_5492645b1907(ArrayList<Integer> A, int x) {
        // Write your code here
        int low = 0;
        int high = A.size() - 1;
        int mid = 0;
        int result = -1;
        while (low <= high) {
            mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_fe171dba_1037_42ed_bdd5_c5aaf954d414(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == A.get(mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_9409b7a3_58c0_4d9d_96cd_7f0f99239d43(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == A.get(mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_7a7eb96e_4b83_4200_9d38_f0b746eeea19(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_0_a050b3ff_38c4_402e_b66f_4f048e7988ad(ArrayList<Integer> A, int x) {
        // Write your code here
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (A.get( mid) == x) {
                if (mid == 0 || A.get( mid - 1) != x) {
                    return mid;
                } else {
                    high = mid - 1;
                }
            } else if (A.get( mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_1_6823514f_e736_48d4_b5b9_d4bfa84082fe(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low < high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }

    
    public static int findFirstOccurrence_Problem_1_310c2ff1_fd68_4c0f_82a8_63e724c455e8(ArrayList<Integer> A, int x) {
        int firstOccurrence = -1;
        int currentOccurrence = 0;
        int lastOccurrence = -1;
        for(int i = 0; i < A.size(); i++) {
            currentOccurrence = A.get(i);
            if(currentOccurrence == x) {
                firstOccurrence = i;
                break;
            }
            if(currentOccurrence < x) {
                lastOccurrence = i;
            }
        }
        return firstOccurrence;
    }

    
    public static int findFirstOccurrence_Problem_1_81b382b5_6774_4bfa_9229_794f02ad3a26(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == A.get(mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_e2bd3ad0_bdf4_4deb_9299_aea6e24d051d(ArrayList<Integer> A, int x) {
        int n = A.size();
        int low = 0;
        int high = n - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == A.get(mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_2b60ff46_fe87_4c73_a7fc_2eb09e157e76(ArrayList<Integer> A, int x) {
        // Binary search
        int left = 0;
        int right = A.size() - 1;
        int result = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (A.get(mid) == x) {
                result = mid;
                right = mid - 1;
            } else if (A.get(mid) > x) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_b2652073_0973_4ec1_a9a2_b5fd5e27f161(ArrayList<Integer> A, int x) {
        // Binary search
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (A.get(mid) == x) {
                if (mid == 0 || A.get(mid - 1) != x) {
                    return mid;
                } else {
                    high = mid - 1;
                }
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_2_7e9b399f_cf9e_41d3_965b_78e3e3c2e78e(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size()-1;

        while (low < high) {
            int mid = (low + high) >>> 1;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_2_655128c4_4c27_458a_9949_d6db2801f862(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_e2dfc515_07dd_4b6a_a605_188fa66448b1(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int mid = 0;
        int result = -1;
        while (low <= high) {
            mid = (low + high) / 2;
            if (x == A.get(mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_8d58b28e_0109_405d_9efb_d82e53ba5558(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_875c784e_7a29_4ed3_9cac_b9b95a6a7243(ArrayList<Integer> A, int x) {
        int l = 0;
        int r = A.size() - 1;
        int m = 0;
        int result = -1;
        while (l <= r) {
            m = l + (r - l) / 2;
            if (A.get(m) == x) {
                result = m;
                r = m - 1;
            } else if (A.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_2c7307de_0816_4aea_b386_b16a69f3e83d(ArrayList<Integer> A, int x) {
        // Write - Your - Code
        int low = 0;
        int high = A.size() - 1;
        int mid = 0;
        int result = -1;
        while (low <= high) {
            mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_e4d56735_b09d_4a51_a4f5_1076883e78a2(ArrayList<Integer> A, int x) {
        // Write your code here
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (x == A.get(mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_778be081_fd77_4ca7_b872_b0bbd004005f(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_1_6864aff6_043a_438e_a744_b09c120ead01(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_1_ef700317_8918_45d1_b94c_40c481d13975(ArrayList<Integer> A, int x) {
        int i = 0;
        for (int j = 1; j < A.size(); j++) {
            if (A.get(j) == x) {
                return i;
            }
            i = j;
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_2_2608d407_1a40_41ac_9b8a_2ef81f8a8567(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_853e4688_d7b5_4f71_a3c5_56021aa575c6(ArrayList<Integer> A, int x) {
        int l = 0;
        int r = A.size() - 1;
        int result = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (A.get(mid) == x) {
                result = mid;
                r = mid - 1;
            } else if (A.get(mid) > x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_ba6c93ef_6bb4_43a0_8bf0_a6ce844a34c8(ArrayList<Integer> A, int x) {
        int lo = 0;
        int hi = A.size() - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (A.get(mid) == x) {
                if (mid == 0 || A.get((mid - 1)) != x) {
                    return mid;
                } else {
                    hi = mid - 1;
                }
            } else if (A.get(mid) < x) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_1_9922fafe_270e_4afe_a754_352ab03dd282(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_eff0d365_6772_493d_9d62_bf372027f439(ArrayList<Integer> A, int x) {
        int index = -1;
        for(int i = 0; i < A.size(); i++) {
            if(A.get(i) == x) {
                index = i;
                break;
            }
        }
        return index;
    }

    
    public static int findFirstOccurrence_Problem_2_fc8bc993_c57f_4d69_b026_d493941a5010(ArrayList<Integer> A, int x) {
        int lo = 0;
        int hi = A.size() - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (A.get(mid) == x) {
                if (mid == 0 || A.get((mid - 1)) != x) {
                    return mid;
                } else {
                    hi = mid - 1;
                }
            } else if (A.get(mid) < x) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_1_5c6ca631_9a68_4f17_b556_eab1fb8f7008(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_37c83b8c_17d9_4736_a992_eec3ce904e3d(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_b314d390_f600_4c9c_bb98_32a2bcc3e565(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (x == A.get(mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_73ec0741_fa02_4085_a2cc_3a24b6027f91(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_33cfadb1_fe3f_4c92_bf0f_fcd800b5ff9b(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size()-1;
        while(low<=high){
            int mid = (low+high)/2;
            int midValue = A.get(mid);
            if(midValue==x){
                return mid;
            }
            else if(midValue>x){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_0_e1bd2a82_b10b_48bc_b228_4c1d837608f9(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_38c30b20_aca6_4fa0_943f_10aee02e2e26(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_0_6864aff6_043a_438e_a744_b09c120ead01(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_2_b74c0150_a335_462f_a6f7_e69d72b33140(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int mid = 0;
        int result = -1;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_e9e67b2f_26e0_4eac_8d0c_affb09ad01c9(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == A.get(mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_18b6cad1_1523_45ed_9e7b_0590d64e0f24(ArrayList<Integer> A, int x) {
        return Collections.binarySearch(A, x);
    }

    
    public static int findFirstOccurrence_Problem_2_083a47b5_78de_4868_97db_9b9c057bbfe1(ArrayList<Integer> A, int x) {
        // Write your code here
        int start = 0;
        int end = A.size() - 1;
        int result = -1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (A.get(mid) == x) {
                result = mid;
                end = mid - 1;
            } else if (A.get(mid) > x) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_c9f2af3d_e3bd_42fd_b2ea_4b5e621cc708(ArrayList<Integer> A, int x) {
        int firstOccurrence = -1;
        int lastOccurrence = -1;
        int currentOccurrence = -1;
        for(int i = 0; i < A.size(); i++) {
            currentOccurrence = A.get(i);
            if(currentOccurrence == x) {
                lastOccurrence = currentOccurrence;
                firstOccurrence = i;
            }
            if(currentOccurrence > x) {
                break;
            }
        }
        return firstOccurrence;
    }

    
    public static int findFirstOccurrence_Problem_2_2d16585c_b5b5_4a36_b625_f34d9f9f10b8(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == A.get(mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_da833948_6f9b_4b92_a31d_e45df21143ee(ArrayList<Integer> A, int x) {
        int l = 0;
        int r = A.size() - 1;
        int result = -1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (A.get( m) >= x) {
                result = m;
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_f55768a9_403b_49b9_999c_5492645b1907(ArrayList<Integer> A, int x) {
        // Write your code here
        int low = 0;
        int high = A.size() - 1;
        int mid = 0;
        int result = -1;
        while (low <= high) {
            mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_e6d8742c_726a_497a_be2f_3deb30ff5089(ArrayList<Integer> A, int x) {
        // Write your code here
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_5ddc43ed_6538_42b7_a2a0_61eac0aba5d7(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int mid = 0;
        int result = -1;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_b13d3c31_3e53_413b_8690_620304826d65(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_2_f818fd59_d9be_4619_9603_bd4d1dba8f4b(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == A.get(mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_111c3c62_fc8b_4516_bb45_3c435815a1b3(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == A.get(mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_1_2fe63b1d_009b_4ccf_ba25_7aad9c374788(ArrayList<Integer> A, int x) {
        // Write your code here
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_3cecfefa_1a34_4d78_a01c_c2100956daf1(ArrayList<Integer> A, int x) {
        int index = A.indexOf(x);
        if (index != -1) return index;
        else {
            int low=0;
            int high=A.size();
            while (low<high) {
                int mid = (low+high)/2;
                if (A.get(mid)<x) {
                    low = mid + 1;
                } else {
                    high = mid;
                }
            }
            return low;
        }
    }

    
    public static int findFirstOccurrence_Problem_2_7b8a7074_054c_48cb_af2a_c4460fc873dd(ArrayList<Integer> A, int x) {
        // TODO: Write - Your - Code
        return 0;
    }

    
    public static int findFirstOccurrence_Problem_2_788b89d3_2b3b_473c_a73c_95e758dcea01(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (x == A.get(mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_ea119ebc_805a_4516_82b1_ff0eb9815193(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_1_130186fd_ada6_4de5_81b0_201e77935657(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_2_12cb62d1_7196_41bd_a6ae_0e97ce94653c(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == A.get( mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get( mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_af7ce5c0_d583_4cea_96a3_63b9d1128ad7(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == A.get(mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_ce0f72e8_ff06_48e5_902e_983075735c5d(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == A.get( mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get( mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_13f87ee2_edc1_459e_b26a_64d2629a897c(ArrayList<Integer> A, int x) {
        // Write your code here
        int low = 0;
        int high = A.size() - 1;
        int mid = 0;
        int result = -1;
        while (low <= high) {
            mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_6864aff6_043a_438e_a744_b09c120ead01(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_0_ad51bf7c_5fc5_401e_ba48_376d840b6394(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_0_af85e61a_483a_4bb1_a753_cad13a952a55(ArrayList<Integer> A, int x) {
        int i = 0;
        for(int a : A) {
            if(a == x) {
                return i;
            }
            i++;
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_2_bfce2605_c633_4ae5_9d80_210917e4834d(ArrayList<Integer> A, int x) {
        // Binary search
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_cc9f5860_9559_4ee9_b2b9_c2bfb2c0df1c(ArrayList<Integer> A, int x) {
        // Write your code here
        int low = 0, high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x && (mid == 0 || A.get(mid - 1) < x)) {
                return mid;
            } else if (A.get(mid) >= x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_1_68b09b80_8d35_4ff4_85ec_d72843ed4403(ArrayList<Integer> A, int x) {
        // Write your code here
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_8232608d_ca97_4f95_814d_dcde26e1466b(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == A.get( mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get( mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_1a0dfe48_44c4_49ad_b4f7_6a4ceae8b211(ArrayList<Integer> A, int x) {
        int l = 0;
        int r = A.size() - 1;
        int result = -1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (A.get(m) == x) {
                result = m;
                r = m - 1;
            } else if (A.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_778be081_fd77_4ca7_b872_b0bbd004005f(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_2_8f970750_4f9a_4002_9354_0db75a3bde92(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x == A.get(mid)) {
                result = mid;
                high = mid - 1;
            } else if (x < A.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_572826d7_3a93_4920_90fe_6dbc80e4c0fd(ArrayList<Integer> A, int x) {
        // Implement this placeholder.
        return 0;
    }

    
    public static int findFirstOccurrence_Problem_1_5dfcda1a_035d_4df0_a3fd_d9e52cf54ff0(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x)
                return mid;
            if (A.get(mid) < x)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_0_487d25ce_ac3a_4ea1_9217_c8d5c3efc01a(ArrayList<Integer> A, int x) {
        // Binary search
        int low = 0;
        int high = A.size() - 1;
        int mid = 0;
        int result = -1;
        while(low <= high) {
            mid = (low + high) / 2;
            if(A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if(A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_0_e2c6b56d_410d_497e_9b45_2c2bb37ced79(ArrayList<Integer> A, int x) {
        int index = A.indexOf(x);
        if (index > 0) {
            index = A.indexOf(x - 1);
        }
        return index;
    }

    
    public static int findFirstOccurrence_Problem_0_0c20ac4e_a78b_42b8_b60d_2bb1cf5291c7(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_2_34629a8f_5eea_489d_8ba2_e93405e78764(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_1_27540340_4e3c_45af_807b_098759ebb566(ArrayList<Integer> A, int x) {
        int l = 0, r = A.size() - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (A.get(m) < x) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        if (A.get(l) == x) {
            return l;
        } else {
            return -1;
        }
    }

    
    public static int findFirstOccurrence_Problem_1_0f5820ce_4134_4c74_82d2_14a01915cbb3(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int mid = 0;
        int result = -1;
        while (low <= high) {
            mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_624f6a6c_4c79_4d4e_bead_0442cfbb5712(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (A.get(mid) == x) {
                return mid;
            } else if (A.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstOccurrence_Problem_2_73a84fd9_75f5_4004_bf84_9126daa3cd09(ArrayList<Integer> A, int x) {
        int low = 0;
        int high = A.size() - 1;
        int mid = 0;
        int result = -1;
        while (low <= high) {
            mid = (low + high) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    
    public static int findFirstOccurrence_Problem_2_7ae70577_cf9e_4f40_a55d_f49d200ad842(ArrayList<Integer> A, int x) {
        int low = 0, high = A.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (A.get(mid) == x) {
                result = mid;
                high = mid - 1;
            } else if (A.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

}
