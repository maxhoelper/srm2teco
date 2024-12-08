package mbpp_793_last;

public class mbpp_793_last {

    
    public static int last_Problem_0_836541d4_e3d0_4daa_b202_8338cdf9fe32(ArrayList<Integer> arr, int x) {
        int n = arr.size();
        int low = 0, high = n - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr.get(mid) == x && (mid == n - 1 || arr.get(mid + 1) != x)) {
                return mid;
            } else if (arr.get(mid) <= x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int last_Problem_0_fecb1b25_1dd3_4eb6_bb03_0d29e7897bca(ArrayList<Integer> arr, int x) {
        int size = arr.size();
        int p1 = size - 1;
        int p2 = size;
        while (p1 >= 0 && p2 >= 0) {
            if (x == arr.get(p1)) {
                return p1;
            }
            if (x == arr.get(p2)) {
                return p2;
            }
            p1--;
            p2++;
        }
        return -1;
    }

    
    public static int last_Problem_1_82271e1b_9eb7_495d_a141_2ef378c3c74f(ArrayList<Integer> arr, int x) {
        int i = 0;
        int j = arr.size() - 1;
        int m = 0;
        while (i <= j) {
            m = (i + j) / 2;
            if (arr.get(m) == x) {
                if (m == arr.size() - 1) {
                    return m;
                } else if (arr.get(m + 1) != x) {
                    return m;
                } else {
                    i = m + 1;
                }
            } else if (arr.get(m) < x) {
                i = m + 1;
            } else {
                j = m - 1;
            }
        }
        return -1;
    }

    
    public static int last_Problem_2_5587a248_5702_4b05_a300_f88aee138413(ArrayList<Integer> arr, int x) {
        int lo = 0, hi = arr.size() - 1;
        while (lo < hi) {
            int mid = (lo + hi + 1) / 2;
            if (arr.get(mid) <= x) {
                lo = mid;
            } else {
                hi = mid - 1;
            }
        }
        return arr.get(lo) == x ? lo : -1;
    }

    
    public static int last_Problem_2_6b2e3c95_4bed_44fd_9f09_a743c319724e(ArrayList<Integer> arr, int x) {
        int pos = -1;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == x) {
                pos = i;
                break;
            }
        }
        return pos;
    }

    
    public static int last_Problem_2_ab8334e3_3528_454c_bcb6_388db3e97def(ArrayList<Integer> arr, int x) {
        int l = 0, r = arr.size() - 1;
        while (l < r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) <= x) {
                l = mid + 1;
            } else {
                r = mid;
            }
        }
        if (arr.get(l) == x) {
            return l;
        }
        return -1;
    }

    
    public static int last_Problem_2_3c6d5112_dcb7_4b2d_b7bc_5b3159e80626(ArrayList<Integer> arr, int x) {
        int n = arr.size();
        int l = 0, r = n - 1;
        int ans = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                l = mid + 1;
            } else if (arr.get(mid) < x) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_2_7aac1cea_032e_4356_a2fe_e133b425ed39(ArrayList<Integer> arr, int x) {
        int n = arr.size();
        int low = 0;
        int high = n - 1;
        int ans = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                low = mid + 1;
            } else if (arr.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_2_84dc205f_f3f8_478f_b4eb_0995564a0ff5(ArrayList<Integer> arr, int x) {
        int n = arr.size();
        int l = 0;
        int r = n - 1;
        int ans = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                l = mid + 1;
            } else if (arr.get(mid) < x) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_1_b1f57407_f157_4239_ad34_287f476e2abc(ArrayList<Integer> arr, int x) {
        int lo = 0;
        int hi = arr.size() - 1;
        int mid = 0;
        while (lo <= hi) {
            mid = (lo + hi) / 2;
            if (arr.get(mid) == x) {
                if (mid == arr.size() - 1 || arr.get(mid + 1) != x) {
                    return mid;
                } else {
                    lo = mid + 1;
                }
            } else if (arr.get(mid) > x) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return -1;
    }

    
    public static int last_Problem_2_af9d8e4a_a93e_4c45_9927_3aeb83b23e9e(ArrayList<Integer> arr, int x) {
        // Write your code here.
        int low = 0;
        int high = arr.size() - 1;
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr.get(mid) <= x) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_1_af7b7630_7432_4f16_af7c_e685536f988d(ArrayList<Integer> arr, int x) {
        int n = arr.size();
        int low = 0;
        int high = n-1;
        int ans = -1;
        while(low <= high) {
            int mid = low + (high - low)/2;
            if(arr.get(mid) == x) {
                ans = mid;
                low = mid + 1;
            }
            else if(arr.get(mid) > x) {
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_1_ba5c8beb_59aa_45a7_a10d_aa05c9dba8ef(ArrayList<Integer> arr, int x) {
        int l = 0, r = arr.size() - 1;
        while (l < r) {
            int m = (l + r + 1) / 2;
            if (arr.get(m) <= x) {
                l = m;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int last_Problem_2_0f7e91f2_e3a4_4b96_85bb_c94e3a62c1b3(ArrayList<Integer> arr, int x) {
        int lo = 0;
        int hi = arr.size() - 1;
        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if (arr.get( mid) == x) {
                if (mid == arr.size() - 1) {
                    return mid;
                } else if (arr.get( mid + 1) != x) {
                    return mid;
                } else {
                    lo = mid + 1;
                }
            } else if (arr.get( mid) < x) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return -1;
    }

    
    public static int last_Problem_0_47e52c74_382a_4d45_a20f_238976d657dc(ArrayList<Integer> arr, int x) {
        int l = 0, r = arr.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (arr.get(m) == x) {
                if (m == arr.size() - 1 || arr.get(m + 1) != x) {
                    return m;
                }
                l = m + 1;
            } else if (arr.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return -1;
    }

    
    public static int last_Problem_2_da043d39_96dc_4bf5_9c1b_2258489e1985(ArrayList<Integer> arr, int x) {
        if (arr.isEmpty()) return -1;
        int len = arr.size();
        return (arr.get(len - 1) == x) ? len - 1 : -1;
    }

    
    public static int last_Problem_1_103e9610_121a_41ac_97e4_fa35fd626294(ArrayList<Integer> arr, int x) {
        return arr.last_Problem_1_103e9610_121a_41ac_97e4_fa35fd626294IndexOf(x);
    }

    
    public static int last_Problem_0_bc85d3d9_1770_417e_9f29_c0e08490b45e(ArrayList<Integer> arr, int x) {
        int l = 0, r = arr.size() - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) == x) {
                if (mid == arr.size() - 1 || arr.get(mid + 1) != x) {
                    return mid;
                } else {
                    l = mid + 1;
                }
            } else if (arr.get(mid) < x) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return -1;
    }

    
    public static int last_Problem_1_fa3d7322_fcda_4f24_912c_8005ba4ee44d(ArrayList<Integer> arr, int x) {
        int l = 0, r = arr.size() - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (arr.get(m) <= x) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return arr.get(l) == x ? l : -1;
    }

    
    public static int last_Problem_0_15eff960_3331_42d6_8f5b_163cc2329376(ArrayList<Integer> arr, int x) {
        int last_Problem_0_15eff960_3331_42d6_8f5b_163cc2329376 = 0;
        int prev = 0;
        int len = arr.size();
        for(int i = 0; i < len; i++){
            if(arr.get(i) == x){
                last_Problem_0_15eff960_3331_42d6_8f5b_163cc2329376 = i;
            }
            if(arr.get(i) > x){
                prev = i;
            }
        }
        return last_Problem_0_15eff960_3331_42d6_8f5b_163cc2329376;
    }

    
    public static int last_Problem_0_5b4df95f_e4ea_48d1_8d40_979810c67650(ArrayList<Integer> arr, int x) {
        int n = arr.size();
        int low = 0;
        int high = n - 1;
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                low = mid + 1;
            } else if (arr.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_1_e682aa4c_a2c6_4809_a56b_7ade637fa024(ArrayList<Integer> arr, int x) {
        // your code goes here
        int i = arr.size() - 1;
        while(arr.get(i) != x)
            i--;
        return i;
    }

    
    public static int last_Problem_1_849fa70d_6b69_4afd_b663_f74e1ec9b90d(ArrayList<Integer> arr, int x) {
        int i = arr.size() - 1;
        while (i >= 0 && arr.get(i) != x) {
            i--;
        }
        return i;
    }

    
    public static int last_Problem_2_175d5f38_3c1f_43ab_8ca4_d0fa58be03ab(ArrayList<Integer> arr, int x) {
        return arr.last_Problem_2_175d5f38_3c1f_43ab_8ca4_d0fa58be03abIndexOf(x);
    }

    
    public static int last_Problem_2_742380df_0c67_4752_975c_888f1fb165c1(ArrayList<Integer> arr, int x) {
        int l = 0;
        int r = arr.size() - 1;
        int ans = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                l = mid + 1;
            } else if (arr.get(mid) < x) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_1_69134755_49d7_4aa2_a10d_0a21fbafe409(ArrayList<Integer> arr, int x) {
        int n = arr.size();
        int l = 0, r = n - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) == x) {
                if (mid == n - 1 || arr.get(mid + 1) != x) {
                    return mid;
                } else {
                    l = mid + 1;
                }
            } else if (arr.get(mid) < x) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return -1;
    }

    
    public static int last_Problem_0_6b8bd222_ec56_4f1b_8787_d09b02b618b0(ArrayList<Integer> arr, int x) {
        // Write your code here
        int low = 0;
        int high = arr.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr.get( mid) == x) {
                result = mid;
                low = mid + 1;
            } else if (arr.get( mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return result;
    }

    
    public static int last_Problem_0_6a70f410_204d_442a_8e52_7a802996335e(ArrayList<Integer> arr, int x) {
        int n = arr.size();
        int low = 0, high = n - 1;
        int ans = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                low = mid + 1;
            } else if (arr.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_0_1672e808_8425_4d8f_a35e_7a7493aa0327(ArrayList<Integer> arr, int x) {
        int l = 0, r = arr.size() - 1;
        while (l < r) {
            int mid = (l + r + 1) / 2;
            if (arr.get(mid) <= x) {
                l = mid;
            } else {
                r = mid - 1;
            }
        }
        return arr.get(l) == x ? l : -1;
    }

    
    public static int last_Problem_0_55c787ae_50e1_4246_a753_fcf0dcbfd6fe(ArrayList<Integer> arr, int x) {
        // Write your code here
        int n = arr.size();
        int low = 0;
        int high = n - 1;
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                low = mid + 1;
            } else if (arr.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_2_99912270_68c3_485b_b95a_18cac3fe1157(ArrayList<Integer> arr, int x) {
        // Write your code here
        // To print results to the standard output you can use System.out.println()
        // Example: System.out.println("Hello world!");
        int n = arr.size();
        int l = 0;
        int r = n - 1;
        int ans = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                l = mid + 1;
            } else if (arr.get(mid) > x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_1_4a3962be_3d65_4a78_a813_685a92596f59(ArrayList<Integer> arr, int x) {
        int l = 0, r = arr.size() - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) == x) {
                if (mid == arr.size() - 1 || arr.get(mid + 1) != x) {
                    return mid;
                } else {
                    l = mid + 1;
                }
            } else if (arr.get(mid) > x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return -1;
    }

    
    public static int last_Problem_2_22f3fd5d_5653_4402_980c_752db15da4e0(ArrayList<Integer> arr, int x) {
        int l = 0;
        int r = arr.size() - 1;
        while(l <= r) {
            int mid = l + (r - l)/2;
            if(arr.get(mid) < x)
                l = mid+1;
            else
                r = mid - 1;
        }
        if(l > arr.size() - 1)
            return -1;
        return arr.get(l);
    }

    
    public static int last_Problem_1_ab51dff6_61ee_4fac_aa46_e1ec0c6d3279(ArrayList<Integer> arr, int x) {
        int l = 0;
        int r = arr.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (arr.get(m) == x) {
                if (m == arr.size() - 1 || arr.get(m + 1) != x) {
                    return m;
                } else {
                    l = m + 1;
                }
            } else if (arr.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return -1;
    }

    
    public static int last_Problem_1_62a7d54c_0b5a_4016_a858_c0af9f800f80(ArrayList<Integer> arr, int x) {
        int start = 0;
        int end = arr.size() - 1;
        int ans = -1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                start = mid + 1;
            } else if (arr.get(mid) > x) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_1_ffd1b8da_b8a1_4fe9_bc3f_0fb1ef5ac256(ArrayList<Integer> arr, int x) {
        int low = 0;
        int high = arr.size() - 1;
        int mid = 0;
        while (low <= high) {
            mid = (low + high) / 2;
            if (arr.get(mid) == x && (mid == arr.size() - 1 || arr.get(mid + 1) != x)) {
                return mid;
            } else if (arr.get(mid) <= x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int last_Problem_0_22f3fd5d_5653_4402_980c_752db15da4e0(ArrayList<Integer> arr, int x) {
        int l = 0;
        int r = arr.size() - 1;
        while(l <= r) {
            int mid = l + (r - l)/2;
            if(arr.get(mid) < x)
                l = mid+1;
            else
                r = mid - 1;
        }
        if(l > arr.size() - 1)
            return -1;
        return arr.get(l);
    }

    
    public static int last_Problem_0_8c651095_a50a_4fbf_9854_319248d87cc7(ArrayList<Integer> arr, int x) {
        int low = 0;
        int high = arr.size() - 1;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr.get(mid) <= x) {
                result = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return result;
    }

    
    public static int last_Problem_2_1672e808_8425_4d8f_a35e_7a7493aa0327(ArrayList<Integer> arr, int x) {
        int l = 0, r = arr.size() - 1;
        while (l < r) {
            int mid = (l + r + 1) / 2;
            if (arr.get(mid) <= x) {
                l = mid;
            } else {
                r = mid - 1;
            }
        }
        return arr.get(l) == x ? l : -1;
    }

    
    public static int last_Problem_2_ada59fc3_2093_4c4c_81d2_c13a9510bfe9(ArrayList<Integer> arr, int x) {
        if(arr.size() == 0) return 0;
        else {
            int n = arr.get(arr.size() - 1);
            if(n == x) return arr.size();
            else {
                int i = arr.size() - 1;
                while(i >= 0) {
                    if(arr.get(i) == x) return i;
                    else if(arr.get(i) > x) return -1;
                    i--;
                }
                return -1;
            }
        }
    }

    
    public static int last_Problem_2_7be468f8_2f70_4af4_9b23_60a871817aef(ArrayList<Integer> arr, int x) {
        int lo = 0;
        int hi = arr.size() - 1;
        int ans = -1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (arr.get(mid) <= x) {
                ans = mid;
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_0_40772e04_8782_4816_82a6_981147fef1b9(ArrayList<Integer> arr, int x) {
        int l = 0;
        int r = arr.size() - 1;
        int ans = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                l = mid + 1;
            } else if (arr.get(mid) < x) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_2_e23ecb91_f998_4d73_bbf2_22a2b0396074(ArrayList<Integer> arr, int x) {
        if (arr.size() == 0) {
            return -1;
        }
        int size = arr.size();
        int i = size - 1;
        while (i >= 0 && arr.get(i) != x) {
            i--;
        }
        return i;
    }

    
    public static int last_Problem_2_0ff1f16b_a103_4038_ace3_13712ae247cf(ArrayList<Integer> arr, int x) {
        int i = 0;
        int j = arr.size() - 1;
        while (i < j) {
            int mid = (i + j) / 2;
            if (arr.get(mid) <= x) {
                i = mid + 1;
            } else {
                j = mid;
            }
        }
        if (arr.get(i) == x) {
            return i;
        }
        return -1;
    }

    
    public static int last_Problem_2_fb8cb9aa_7023_428e_aab1_97532cb193e6(ArrayList<Integer> arr, int x) {
        int last_Problem_2_fb8cb9aa_7023_428e_aab1_97532cb193e6 = -1;
        int i = 0;
        for (Integer i1 : arr) {
            if (i1 == x) {
                last_Problem_2_fb8cb9aa_7023_428e_aab1_97532cb193e6 = i1;
                break;
            }
            i++;
        }
        if (last_Problem_2_fb8cb9aa_7023_428e_aab1_97532cb193e6 == -1) {
            last_Problem_2_fb8cb9aa_7023_428e_aab1_97532cb193e6 = -2;
        }
        return last_Problem_2_fb8cb9aa_7023_428e_aab1_97532cb193e6;
    }

    
    public static int last_Problem_1_7676984e_b608_430d_8849_c5ebe156ab39(ArrayList<Integer> arr, int x) {
        int i = arr.size() - 1;
        if(arr.get(i) == x) {
            return i;
        }
        while(arr.get(i) < x) {
            i--;
        }
        return i;
    }

    
    public static int last_Problem_0_22536d0c_a048_48dc_9418_9316eef29744(ArrayList<Integer> arr, int x) {
        int last_Problem_0_22536d0c_a048_48dc_9418_9316eef29744 = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == x) {
                last_Problem_0_22536d0c_a048_48dc_9418_9316eef29744 = i;
            }
        }
        return last_Problem_0_22536d0c_a048_48dc_9418_9316eef29744;
    }

    
    public static int last_Problem_1_352a7816_827a_4ae3_9e00_7f96bb3cb871(ArrayList<Integer> arr, int x) {
        // if the length of the array is 0, return -1
        if (arr.size() == 0) {
            return -1;
        }
        int pos = arr.indexOf(x);
        if (pos == arr.size() - 1) {
            return pos;
        } else {
            return arr.get(arr.size() - 1);
        }
    }

    
    public static int last_Problem_1_81294282_c655_4c68_8c32_e7e0f808a78f(ArrayList<Integer> arr, int x) {
        int i = arr.size() - 1;
        while (i >= 0 && arr.get(i) != x) {
            i--;
        }
        return i;
    }

    
    public static int last_Problem_0_8d976609_411c_4547_8f46_3fae9f188049(ArrayList<Integer> arr, int x) {
        int i = 0;
        int j = arr.size()-1;
        while(i<=j) {
            int mid = (i+j)/2;
            if(arr.get(mid) == x) {
                j = mid-1;
            }
            if(arr.get(mid) > x) {
                j = mid-1;
            }
            if(arr.get(mid) < x) {
                i = mid+1;
            }
        }
        if(i == arr.size()) return -1;
        else return arr.get(i);
    }

    
    public static int last_Problem_1_46d9e4db_efb4_4a64_8a4e_56c7c65ce1b1(ArrayList<Integer> arr, int x) {
        int last_Problem_1_46d9e4db_efb4_4a64_8a4e_56c7c65ce1b1 = -1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                last_Problem_1_46d9e4db_efb4_4a64_8a4e_56c7c65ce1b1 = i;
            }
        }
        return last_Problem_1_46d9e4db_efb4_4a64_8a4e_56c7c65ce1b1;
    }

    
    public static int last_Problem_0_ab51dff6_61ee_4fac_aa46_e1ec0c6d3279(ArrayList<Integer> arr, int x) {
        int l = 0;
        int r = arr.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (arr.get(m) == x) {
                if (m == arr.size() - 1 || arr.get(m + 1) != x) {
                    return m;
                } else {
                    l = m + 1;
                }
            } else if (arr.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return -1;
    }

    
    public static int last_Problem_2_58d573f8_876b_4fac_b766_0e39f93630dd(ArrayList<Integer> arr, int x) {
        // Write your code here
        return 0;
    }

    
    public static int last_Problem_0_ead8a688_4052_4231_9573_f3c5f24219ff(ArrayList<Integer> arr, int x) {
        int l = 0;
        int r = arr.size() - 1;
        int ans = -1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                l = mid + 1;
            } else if (arr.get(mid) > x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_1_85bdd37c_a72d_45e9_9ca6_e82614d8a6be(ArrayList<Integer> arr, int x) {
        int low = 0;
        int high = arr.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr.get(mid) == x) {
                if (mid == arr.size() - 1 || arr.get(mid + 1) != x) {
                    return mid;
                } else {
                    low = mid + 1;
                }
            } else if (arr.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    
    public static int last_Problem_0_39fac3ed_28a3_43f5_886a_fecbab7e59ce(ArrayList<Integer> arr, int x) {
        int l = 0, r = arr.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (arr.get(m) == x) {
                if (m == arr.size() - 1 || arr.get(m + 1) != x)
                    return m;
                else
                    l = m + 1;
            } else if (arr.get(m) < x)
                l = m + 1;
            else
                r = m - 1;
        }
        return -1;
    }

    
    public static int last_Problem_2_31fc6182_0b76_4650_bc95_7f4212ea7093(ArrayList<Integer> arr, int x) {
        int i = arr.size() - 1;
        while (i >= 0 && arr.get(i) > x) {
            i--;
        }
        return i;
    }

    
    public static int last_Problem_1_cd1914aa_13d3_414a_8013_355f71bb784f(ArrayList<Integer> arr, int x) {
        // your code here
        return 0;
    }

    
    public static int last_Problem_0_a1b55bff_4fef_4be0_9377_05450693b2d4(ArrayList<Integer> arr, int x) {
        int len = arr.size();
        int low = 0, high = len - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr.get(mid) < x) {
                low = mid + 1;
            }
            else if (arr.get(mid) > x) {
                high = mid - 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }

    
    public static int last_Problem_1_4fd5c6dd_9892_4823_8fb1_000a1b7aa3f7(ArrayList<Integer> arr, int x) {
        int i = 0;
        int j = arr.size() - 1;
        while (i < j) {
            int mid = (i + j) / 2;
            if (arr.get(mid) <= x) {
                i = mid + 1;
            } else {
                j = mid;
            }
        }
        if (arr.get(i) == x) {
            return i;
        }
        return -1;
    }

    
    public static int last_Problem_0_3c6d5112_dcb7_4b2d_b7bc_5b3159e80626(ArrayList<Integer> arr, int x) {
        int n = arr.size();
        int l = 0, r = n - 1;
        int ans = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                l = mid + 1;
            } else if (arr.get(mid) < x) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_0_4fd5c6dd_9892_4823_8fb1_000a1b7aa3f7(ArrayList<Integer> arr, int x) {
        int i = 0;
        int j = arr.size() - 1;
        while (i < j) {
            int mid = (i + j) / 2;
            if (arr.get(mid) <= x) {
                i = mid + 1;
            } else {
                j = mid;
            }
        }
        if (arr.get(i) == x) {
            return i;
        }
        return -1;
    }

    
    public static int last_Problem_0_9d58161d_4398_45b9_88b8_532df8e6e15b(ArrayList<Integer> arr, int x) {
        int n = arr.size();
        int low = 0;
        int high = n - 1;
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                low = mid + 1;
            } else if (arr.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_0_fa3d7322_fcda_4f24_912c_8005ba4ee44d(ArrayList<Integer> arr, int x) {
        int l = 0, r = arr.size() - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (arr.get(m) <= x) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return arr.get(l) == x ? l : -1;
    }

    
    public static int last_Problem_1_6e3acdd4_963b_4a3b_8065_686457a22ccf(ArrayList<Integer> arr, int x) {
        int n = arr.size();
        int l = 0, r = n - 1;
        int ans = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                l = mid + 1;
            } else if (arr.get(mid) > x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_2_c2635a16_aaec_459a_b728_7f70757fafb5(ArrayList<Integer> arr, int x) {
        int l = 0, r = arr.size() - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) == x) {
                if (mid == arr.size() - 1 || arr.get(mid + 1) != x) {
                    return mid;
                } else {
                    l = mid + 1;
                }
            } else if (arr.get(mid) > x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return -1;
    }

    
    public static int last_Problem_0_d85284dd_5f83_4e4f_8712_7e896314bb3c(ArrayList<Integer> arr, int x) {
        int l = 0, r = arr.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (arr.get(m) == x) {
                if (m == arr.size() - 1 || arr.get(m + 1) != x) {
                    return m;
                } else {
                    l = m + 1;
                }
            } else if (arr.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return -1;
    }

    
    public static int last_Problem_1_dd3289b7_b021_4433_b581_74aeec35f12f(ArrayList<Integer> arr, int x) {
        // Your code here
        int low = 0;
        int high = arr.size() - 1;
        int ans = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr.get( mid) <= x) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_2_04d3fa3b_8048_437b_a0e2_7926dc3e9f3e(ArrayList<Integer> arr, int x) {
        return arr.last_Problem_2_04d3fa3b_8048_437b_a0e2_7926dc3e9f3eIndexOf(x);
    }

    
    public static int last_Problem_1_d695cedd_97dc_418c_958e_48625667978a(ArrayList<Integer> arr, int x) {
        // Your Function Here
        int i = arr.size() - 1;
        while (i >= 0) {
            if (arr.get(i) == x)
                return i;
            i--;
        }
        return -1;
    }

    
    public static int last_Problem_0_d29d6a94_8968_43a6_892c_38cbd716c6b2(ArrayList<Integer> arr, int x) {
        int pos = 0;
        int temp = 0;
        boolean found = False;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == x) {
                pos = i;
                found = True;
                break;
            }
            if(arr.get(i) > x) {
                pos = i - 1;
                break;
            }
            if(arr.get(i) < x && found) {
                temp = arr.get(i);
                pos = i;
                break;
            }
        }
        return pos;
    }

    
    public static int last_Problem_0_cce1997d_278d_46b3_998b_72cd67f80ad1(ArrayList<Integer> arr, int x) {
        int left = 0;
        int right = arr.size() - 1;
        int mid = 0;
        while (left <= right) {
            mid = (left + right) / 2;
            if (arr.get(mid) > x) {
                right = mid - 1;
            } else if (arr.get(mid) < x) {
                left = mid + 1;
            } else {
                left = right = mid;
            }
        }
        return left;
    }

    
    public static int last_Problem_0_b6b2588d_38c1_483c_a406_e90064dce7bc(ArrayList<Integer> arr, int x) {
        int i = arr.size() - 1;
        while(i >= 0 && arr.get(i) != x) {
            i--;
        }
        return i;
    }

    
    public static int last_Problem_1_6f9abccf_2eff_42c4_b8d8_86d0a3562280(ArrayList<Integer> arr, int x) {
        int l = 0, r = arr.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (arr.get(m) == x) {
                if (m == arr.size() - 1 || arr.get(m + 1) != x) {
                    return m;
                } else {
                    l = m + 1;
                }
            } else if (arr.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return -1;
    }

    
    public static int last_Problem_0_88c043f1_3f43_47b1_a5d3_9ee428b51f7a(ArrayList<Integer> arr, int x) {
        int l = 0, r = arr.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (arr.get(m) == x) {
                if (m == arr.size() - 1 || arr.get(m + 1) != x) {
                    return m;
                } else {
                    l = m + 1;
                }
            } else if (arr.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return -1;
    }

    
    public static int last_Problem_2_1a507574_4493_4ddf_b036_b3a1f73ddb56(ArrayList<Integer> arr, int x) {
        // Write your code here
        int low = 0;
        int high = arr.size() - 1;
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                low = mid + 1;
            } else if (arr.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_0_a4c9fac2_ae37_4c65_878f_a07fffc9434c(ArrayList<Integer> arr, int x) {
        int l = 0;
        int r = arr.size() - 1;
        int ans = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                l = mid + 1;
            } else if (arr.get(mid) > x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_1_2a443942_cf1e_4cec_b4c6_ad2eff8ece4a(ArrayList<Integer> arr, int x) {
        return arr.last_Problem_1_2a443942_cf1e_4cec_b4c6_ad2eff8ece4aIndexOf(x);
    }

    
    public static int last_Problem_0_2a588641_921e_4733_ad46_09a568b073cb(ArrayList<Integer> arr, int x) {
        int low = 0;
        int high = arr.size() - 1;
        int ans = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                low = mid + 1;
            } else if (arr.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_0_c95b5b52_a29f_43ad_b8c2_e46c797746dd(ArrayList<Integer> arr, int x) {
        int l = 0;
        int r = arr.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (arr.get(m) == x) {
                if (m == arr.size() - 1) {
                    return m;
                }
                if (arr.get(m + 1) != x) {
                    return m;
                }
                l = m + 1;
            } else if (arr.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return -1;
    }

    
    public static int last_Problem_1_594855ac_4ebb_483d_b685_e3515833b3d9(ArrayList<Integer> arr, int x) {
        int len = arr.size();
        if (len == 0) return 0;
        int low = 0;
        int high = len - 1;
        while (low < high) {
            int mid = (low + high) / 2;
            if (arr.get(mid) > x) high = mid - 1;
            else low = mid + 1;
        }
        if (arr.get(high) != x) return 0;
        else return high;
    }

    
    public static int last_Problem_0_a74b9b6b_b806_4594_a330_d622123267d2(ArrayList<Integer> arr, int x) {
        int l = 0, r = arr.size() - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) == x) {
                if (mid == arr.size() - 1 || arr.get(mid + 1) != x) {
                    return mid;
                } else {
                    l = mid + 1;
                }
            } else if (arr.get(mid) > x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return -1;
    }

    
    public static int last_Problem_1_cb6273ff_3baa_4cd2_8b43_e071ee6ec4b5(ArrayList<Integer> arr, int x) {
        int l = 0;
        int r = arr.size() - 1;
        int ans = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                l = mid + 1;
            } else if (arr.get(mid) > x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_2_ec71e663_db5b_4809_8746_222db8841c30(ArrayList<Integer> arr, int x) {
        int low = 0;
        int high = arr.size() - 1;
        int ans = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                low = mid + 1;
            } else if (arr.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_1_79174da8_76a2_4d49_a56b_31a122513ff7(ArrayList<Integer> arr, int x) {
        int i = arr.size() - 1;
        while (i >= 0 && arr.get(i) != x) {
            i--;
        }
        return i;
    }

    
    public static int last_Problem_1_5d5f68d2_f0bd_474f_8421_29de191921d6(ArrayList<Integer> arr, int x) {
        int n = arr.size();
        int l = 0, r = n - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (arr.get(mid) == x) {
                if (mid == n - 1 || arr.get(mid + 1) != x) {
                    return mid;
                } else {
                    l = mid + 1;
                }
            } else if (arr.get(mid) > x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return -1;
    }

    
    public static int last_Problem_2_9d58161d_4398_45b9_88b8_532df8e6e15b(ArrayList<Integer> arr, int x) {
        int n = arr.size();
        int low = 0;
        int high = n - 1;
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                low = mid + 1;
            } else if (arr.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_2_a1831691_e53e_4445_8366_92610f85b637(ArrayList<Integer> arr, int x) {
        int l = 0;
        int r = arr.size() - 1;
        int ans = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                l = mid + 1;
            } else if (arr.get(mid) > x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_1_1932fb0e_214f_4c1a_b202_ea3d0ad73285(ArrayList<Integer> arr, int x) {
        int l = 0;
        int r = arr.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (arr.get(m) == x) {
                if (m == arr.size() - 1) {
                    return m;
                } else if (arr.get(m + 1) != x) {
                    return m;
                } else {
                    l = m + 1;
                }
            } else if (arr.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return -1;
    }

    
    public static int last_Problem_0_d3c6a319_95b0_4730_9e61_6cfc8dd940b2(ArrayList<Integer> arr, int x) {
        int last_Problem_0_d3c6a319_95b0_4730_9e61_6cfc8dd940b2 = arr.get(arr.size() - 1);
        if(last_Problem_0_d3c6a319_95b0_4730_9e61_6cfc8dd940b2 == x)
            return arr.size() - 1;
        else {
            int low = 0, high = arr.size() - 1;
            while(low <= high) {
                int mid = (low + high) / 2;
                if(arr.get(mid) == x)
                    return mid;
                else if(arr.get(mid) < x)
                    low = mid + 1;
                else
                    high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int last_Problem_2_76ae6cc6_9644_4cac_b5f1_b65fae6150cd(ArrayList<Integer> arr, int x) {
        int l = 0, r = arr.size() - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (arr.get(m) == x) {
                if (m == arr.size() - 1 || arr.get(m + 1) != x) {
                    return m;
                }
                l = m + 1;
            } else if (arr.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return -1;
    }

    
    public static int last_Problem_1_4777b671_3c48_49f5_8bbe_fca6c2d6fd4b(ArrayList<Integer> arr, int x) {
        // Your code here
        int l = 0;
        int r = arr.size() - 1;
        int ans = -1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (arr.get( mid) == x) {
                ans = mid;
                l = mid + 1;
            } else if (arr.get( mid) > x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_0_549238cb_4e59_4cb1_a4ab_0346d0ee056e(ArrayList<Integer> arr, int x) {
        int pos = arr.size();
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) > x) {
                pos = i;
            }
        }
        return pos;
    }

    
    public static int last_Problem_2_8a08c7d7_3d08_4b08_a236_037fa6eb26b3(ArrayList<Integer> arr, int x) {
        int n = arr.size();
        int low = 0;
        int high = n - 1;
        int ans = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                low = mid + 1;
            } else if (arr.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_1_7653084a_87fd_46b6_9c03_eb37309ff692(ArrayList<Integer> arr, int x) {
        int l = 0;
        int r = arr.size() - 1;
        int ans = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                l = mid + 1;
            } else if (arr.get(mid) < x) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_0_6e3acdd4_963b_4a3b_8065_686457a22ccf(ArrayList<Integer> arr, int x) {
        int n = arr.size();
        int l = 0, r = n - 1;
        int ans = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                l = mid + 1;
            } else if (arr.get(mid) > x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_1_6574f783_0947_40d1_8ebc_7d0374bc5eaa(ArrayList<Integer> arr, int x) {
        int l = 0, r = arr.size() - 1;
        while (l < r) {
            int mid = (l + r + 1) / 2;
            if (arr.get(mid) <= x) {
                l = mid;
            } else {
                r = mid - 1;
            }
        }
        return l;
    }

    
    public static int last_Problem_1_58d0056e_0008_4178_a7fc_94e735515c2e(ArrayList<Integer> arr, int x) {
        int l = 0, r = arr.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (arr.get(m) == x) {
                if (m == arr.size() - 1 || arr.get(m + 1) != x) {
                    return m;
                }
                l = m + 1;
            } else if (arr.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return -1;
    }

    
    public static int last_Problem_1_0d45b6c1_afbe_4024_baeb_41d6a3c78f14(ArrayList<Integer> arr, int x) {
        int low = 0;
        int high = arr.size() - 1;
        int ans = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                low = mid + 1;
            } else if (arr.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_1_ec71e663_db5b_4809_8746_222db8841c30(ArrayList<Integer> arr, int x) {
        int low = 0;
        int high = arr.size() - 1;
        int ans = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                low = mid + 1;
            } else if (arr.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_1_48b59d90_52b0_4b5b_9dcd_131d48bbc7a7(ArrayList<Integer> arr, int x) {
        int curr = 0;
        int prev = -1;
        for (int i : arr) {
            if (i == x) {
                return curr;
            } else if (i > x) {
                prev = curr;
                curr++;
            }
        }
        return prev;
    }

    
    public static int last_Problem_1_3476f474_e153_4b21_8287_3e25517e9176(ArrayList<Integer> arr, int x) {
        int i = arr.size() - 1;
        while (i >= 0 && arr.get(i) != x) {
            i--;
        }
        return i;
    }

    
    public static int last_Problem_1_df519f29_2d14_4ee4_80f1_13362e5e0c85(ArrayList<Integer> arr, int x) {
        // Write your code here
        int l = 0, r = arr.size() - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) == x) {
                if (mid == arr.size() - 1 || arr.get(mid + 1) != x) {
                    return mid;
                }
                l = mid + 1;
            } else if (arr.get(mid) < x) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return -1;
    }

    
    public static int last_Problem_0_ebbc1a0b_587d_4923_80e1_1c4aab5edb10(ArrayList<Integer> arr, int x) {
        int n = arr.size();
        int l = 0, r = n - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) == x) {
                if (mid == n - 1 || arr.get(mid + 1) != x) {
                    return mid;
                }
                l = mid + 1;
            } else if (arr.get(mid) < x) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return -1;
    }

    
    public static int last_Problem_2_6574f783_0947_40d1_8ebc_7d0374bc5eaa(ArrayList<Integer> arr, int x) {
        int l = 0, r = arr.size() - 1;
        while (l < r) {
            int mid = (l + r + 1) / 2;
            if (arr.get(mid) <= x) {
                l = mid;
            } else {
                r = mid - 1;
            }
        }
        return l;
    }

    
    public static int last_Problem_2_ea0386e0_1646_4bef_947c_8bd45bece6d5(ArrayList<Integer> arr, int x) {
        int l = 0, r = arr.size() - 1;
        while (l < r) {
            int m = (l + r + 1) / 2;
            if (arr.get(m) <= x) {
                l = m;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int last_Problem_0_f08ce035_e2cd_4a69_ada3_8984296ca8cd(ArrayList<Integer> arr, int x) {
        int n = arr.size();
        int l = 0, r = n - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) == x && (mid == n - 1 || arr.get(mid + 1) != x))
                return mid;
            else if (arr.get(mid) <= x)
                l = mid + 1;
            else
                r = mid - 1;
        }
        return -1;
    }

    
    public static int last_Problem_1_b9aa6465_864c_4bb5_972d_0d6dd77fc6d6(ArrayList<Integer> arr, int x) {
        return arr.stream().filter(i -> i == x).count() - 1;
    }

    
    public static int last_Problem_0_56b9a794_fe76_4cac_9917_093d994a1681(ArrayList<Integer> arr, int x) {
        int last_Problem_0_56b9a794_fe76_4cac_9917_093d994a1681 = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == x) {
                last_Problem_0_56b9a794_fe76_4cac_9917_093d994a1681 = i;
            }
        }
        return last_Problem_0_56b9a794_fe76_4cac_9917_093d994a1681;
    }

    
    public static int last_Problem_2_819c0ef1_724c_43e6_a101_f74ccee543e5(ArrayList<Integer> arr, int x) {
        int low = 0;
        int high = arr.size() - 1;
        int pos = 0;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return arr.get(low);
    }

    
    public static int last_Problem_0_f3e460eb_e03c_4942_9d1f_00f99f0cddc0(ArrayList<Integer> arr, int x) {
        int low = 0;
        int high = arr.size() - 1;
        int ans = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr.get( mid) == x) {
                ans = mid;
                low = mid + 1;
            } else if (arr.get( mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_1_7a21ea0d_b86c_4168_a34c_0997f3eae4ae(ArrayList<Integer> arr, int x) {
        int i = 0;
        for(int l : arr) {
            if(l == x) {
                return i;
            }
            i++;
        }
        return -1;
    }

    
    public static int last_Problem_2_5b7262e9_5a38_4712_8025_345b356250b6(ArrayList<Integer> arr, int x) {
        int l = 0, r = arr.size() - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) == x) {
                if (mid == arr.size() - 1 || arr.get(mid + 1) != x) return mid;
                else l = mid + 1;
            }
            else if (arr.get(mid) > x) r = mid - 1;
            else l = mid + 1;
        }
        return -1;
    }

    
    public static int last_Problem_0_c0a147e8_8ff3_4c86_86f6_a914351d13fe(ArrayList<Integer> arr, int x) {
        int l = 0;
        int r = arr.size() - 1;
        int ans = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                l = mid + 1;
            } else if (arr.get(mid) > x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_1_495975d8_e239_4c6c_a7a2_c157801b1fa1(ArrayList<Integer> arr, int x) {
        int result = -1;
        for(int i = arr.size()-1; i >= 0; i--) {
            if(arr.get(i) == x) {
                result = i;
                break;
            }
        }
        return result;
    }

    
    public static int last_Problem_0_5328d9c9_33cc_4538_830e_f961e3c24521(ArrayList<Integer> arr, int x) {
        int l = 0, r = arr.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (arr.get(m) <= x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return r;
    }

    
    public static int last_Problem_0_aa3ae3f8_a189_4f52_b850_25be7646697f(ArrayList<Integer> arr, int x) {
        int len = arr.size();
        if (len < 1) return -1;
        int low = 0, high = len - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int mid_val = arr.get(mid);
            if (x == mid_val) return mid;
            if (x < mid_val)
                high = mid - 1;
            else
                low = mid + 1;
        }
        return -1;
    }

    
    public static int last_Problem_0_d7eafbc3_9ac6_4002_9dd7_80855ef6dbcb(ArrayList<Integer> arr, int x) {
        int i = arr.size() - 1;
        while (i >= 0 && arr.get(i) != x) {
            i--;
        }
        return i;
    }

    
    public static int last_Problem_2_309c0cc5_2866_4f6f_bc88_6b40ee019b7b(ArrayList<Integer> arr, int x) {
        int l = 0, r = arr.size() - 1;
        while (l < r) {
            int mid = (l + r + 1) / 2;
            if (arr.get( mid) <= x) {
                l = mid;
            } else {
                r = mid - 1;
            }
        }
        if (arr.get( l) == x) {
            return l;
        }
        return -1;
    }

    
    public static int last_Problem_0_ba5c8beb_59aa_45a7_a10d_aa05c9dba8ef(ArrayList<Integer> arr, int x) {
        int l = 0, r = arr.size() - 1;
        while (l < r) {
            int m = (l + r + 1) / 2;
            if (arr.get(m) <= x) {
                l = m;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int last_Problem_0_6f9abccf_2eff_42c4_b8d8_86d0a3562280(ArrayList<Integer> arr, int x) {
        int l = 0, r = arr.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (arr.get(m) == x) {
                if (m == arr.size() - 1 || arr.get(m + 1) != x) {
                    return m;
                } else {
                    l = m + 1;
                }
            } else if (arr.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return -1;
    }

    
    public static int last_Problem_0_900b848f_304b_473e_8ec4_1ffa13760f25(ArrayList<Integer> arr, int x) {
        int low = 0;
        int high = arr.size() - 1;
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                low = mid + 1;
            } else if (arr.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_0_3476f474_e153_4b21_8287_3e25517e9176(ArrayList<Integer> arr, int x) {
        int i = arr.size() - 1;
        while (i >= 0 && arr.get(i) != x) {
            i--;
        }
        return i;
    }

    
    public static int last_Problem_1_ec115ef7_4fbd_41ca_97cd_6e785f2bf111(ArrayList<Integer> arr, int x) {
        // Write your code here
        int l = 0;
        int r = arr.size() - 1;
        int ans = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get( mid) == x) {
                ans = mid;
                l = mid + 1;
            } else if (arr.get( mid) > x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_1_ff8c8cd4_ea24_4b2c_b18b_7d3df64ed250(ArrayList<Integer> arr, int x) {
        int n = arr.size();
        int low = 0;
        int high = n - 1;
        int ans = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                low = mid + 1;
            } else if (arr.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_0_b6afb45c_1e25_4a8e_9c18_3ee7eb40038a(ArrayList<Integer> arr, int x) {
        int l = 0;
        int r = arr.size() - 1;
        int ans = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get( mid) == x) {
                ans = mid;
                l = mid + 1;
            } else if (arr.get( mid) < x) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_0_62cbcdf4_4adc_4215_9e12_0c8ada8f314d(ArrayList<Integer> arr, int x) {
        // Write your code here
        // To print results to the standard output you can use System.out.println()
        // Example: System.out.println("Hello world!");
        int l = 0;
        int r = arr.size() - 1;
        int m = 0;
        while (l <= r) {
            m = (l + r) / 2;
            if (arr.get(m) == x) {
                if (m == arr.size() - 1) {
                    return m;
                } else if (arr.get(m + 1) != x) {
                    return m;
                } else {
                    l = m + 1;
                }
            } else if (arr.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return -1;
    }

    
    public static int last_Problem_0_6677fdd7_e41e_4013_9d7e_67ee5b6420b6(ArrayList<Integer> arr, int x) {
        int low = 0;
        int high = arr.size() - 1;
        int ans = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                low = mid + 1;
            } else if (arr.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_1_c388ed57_bfa2_445f_bb9c_e4c34a2ba70a(ArrayList<Integer> arr, int x) {
        // Write your code here
        return 0;
    }

    
    public static int last_Problem_1_b2df7a43_4d5e_465a_b33d_db9e0a7d3e6e(ArrayList<Integer> arr, int x) {
        int l = 0, r = arr.size() - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (arr.get(m) == x) {
                if (m == arr.size() - 1 || arr.get(m + 1) != x) {
                    return m;
                } else {
                    l = m + 1;
                }
            } else if (arr.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return -1;
    }

    
    public static int last_Problem_1_6a70f410_204d_442a_8e52_7a802996335e(ArrayList<Integer> arr, int x) {
        int n = arr.size();
        int low = 0, high = n - 1;
        int ans = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                low = mid + 1;
            } else if (arr.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_1_47fb6415_7c67_4792_a5d5_86a8ca0b7e3f(ArrayList<Integer> arr, int x) {
        if(arr.size() == 1) return arr.get(0);
        if(arr.size() == 0) return -1;
        int low = 0;
        int high = arr.size() - 1;
        int mid = (low + high) / 2;
        while(low < high) {
            if(arr.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid;
            }
            mid = (low + high) / 2;
        }
        if(arr.get(mid) < x) return mid;
        if(arr.get(mid) > x) return mid - 1;
        else return mid;
    }

    
    public static int last_Problem_1_0f7e91f2_e3a4_4b96_85bb_c94e3a62c1b3(ArrayList<Integer> arr, int x) {
        int lo = 0;
        int hi = arr.size() - 1;
        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if (arr.get( mid) == x) {
                if (mid == arr.size() - 1) {
                    return mid;
                } else if (arr.get( mid + 1) != x) {
                    return mid;
                } else {
                    lo = mid + 1;
                }
            } else if (arr.get( mid) < x) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return -1;
    }

    
    public static int last_Problem_1_6b2e3c95_4bed_44fd_9f09_a743c319724e(ArrayList<Integer> arr, int x) {
        int pos = -1;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == x) {
                pos = i;
                break;
            }
        }
        return pos;
    }

    
    public static int last_Problem_2_be822927_f721_4d9f_bfc2_ba2a8425a5df(ArrayList<Integer> arr, int x) {
        int n = arr.size();
        int l = 0, r = n - 1;
        int ans = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                l = mid + 1;
            } else if (arr.get(mid) < x) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_0_1f73c180_acc5_417f_a283_11083f181509(ArrayList<Integer> arr, int x) {
        int l = 0;
        int r = arr.size() - 1;
        int ans = -1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (arr.get( m) == x) {
                ans = m;
                l = m + 1;
            } else if (arr.get( m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_1_d5ac729b_ecfc_484a_99bd_ec47e80e6922(ArrayList<Integer> arr, int x) {
        int i = arr.size()-1;
        while (arr.get(i) != x && i>=0) i--;
        if (i == -1) return -1;
        else return i;
    }

    
    public static int last_Problem_2_0fbc6f7e_73f4_42a4_b88a_637bbffb7b14(ArrayList<Integer> arr, int x) {
        int l = 0;
        int r = arr.size() - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) == x) {
                r = mid - 1;
            } else if (arr.get(mid) > x) {
                r = mid - 1;
            } else if (arr.get(mid) < x) {
                l = mid + 1;
            }
        }
        return arr.get(l);
    }

    
    public static int last_Problem_0_f0b164ef_d3d8_491c_bafe_9d324fe6c942(ArrayList<Integer> arr, int x) {
        int n = arr.size();
        int l = 0;
        int r = n - 1;
        int ans = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                l = mid + 1;
            } else if (arr.get(mid) > x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_2_e8255dc6_aedf_4350_993e_548713d3c22c(ArrayList<Integer> arr, int x) {
        // Write your code here
        int low = 0;
        int high = arr.size()-1;
        int ans = -1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr.get(mid)==x){
                ans = mid;
                low = mid+1;
            }
            else if(arr.get(mid)<x){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_2_9b4b62f0_a5cd_4393_bded_1050c9add3f7(ArrayList<Integer> arr, int x) {
        int l = 0;
        int r = arr.size() - 1;
        int ans = -1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (arr.get(m) == x) {
                ans = m;
                l = m + 1;
            } else if (arr.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_2_b0aba73a_c114_4fbc_908f_bed1690c698b(ArrayList<Integer> arr, int x) {
        int i = 0, j = arr.size() - 1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (arr.get(mid) == x) {
                return arr.get(mid);
            } else if (arr.get(mid) < x) {
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }
        return -1;
    }

    
    public static int last_Problem_2_d5056366_3ba2_49bd_ac7e_2ed10a61028f(ArrayList<Integer> arr, int x) {
        int l = 0, r = arr.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (arr.get(m) == x) {
                if (m == arr.size() - 1 || arr.get(m + 1) != x)
                    return m;
                else
                    l = m + 1;
            } else if (arr.get(m) < x)
                l = m + 1;
            else
                r = m - 1;
        }
        return -1;
    }

    
    public static int last_Problem_1_4b8ed2a8_5e25_4ea2_b8dd_4babeec3bf31(ArrayList<Integer> arr, int x) {
        return arr.size() - 1 - arr.indexOf(x);
    }

    
    public static int last_Problem_0_f80bf4b8_7798_441e_b06e_7e436b0de32b(ArrayList<Integer> arr, int x) {
        int last_Problem_0_f80bf4b8_7798_441e_b06e_7e436b0de32b = -1;
        int i = arr.size() - 1;
        while (i >= 0) {
            if (arr.get(i) == x) {
                last_Problem_0_f80bf4b8_7798_441e_b06e_7e436b0de32b = i;
                break;
            }
            i--;
        }
        return last_Problem_0_f80bf4b8_7798_441e_b06e_7e436b0de32b;
    }

    
    public static int last_Problem_1_cddae996_6bb9_4b13_bb64_41280946ff46(ArrayList<Integer> arr, int x) {
        return arr.stream().filter(i -> i == x).reduce((a, b) -> b).orElse(0);
    }

    
    public static int last_Problem_1_dfd3b5a8_6ad8_4148_9f69_72b11d89992e(ArrayList<Integer> arr, int x) {
        return arr.size() - 1;
    }

    
    public static int last_Problem_2_62eb0155_7a70_46c9_a2ce_1b327f8c1b47(ArrayList<Integer> arr, int x) {
        int last_Problem_2_62eb0155_7a70_46c9_a2ce_1b327f8c1b47 = -1;
        for(int i = arr.size()-1; i >= 0; i--) {
            if(arr.get(i) == x) {
                last_Problem_2_62eb0155_7a70_46c9_a2ce_1b327f8c1b47 = i;
                break;
            }
        }
        return last_Problem_2_62eb0155_7a70_46c9_a2ce_1b327f8c1b47;
    }

    
    public static int last_Problem_0_8b318709_cb9b_4477_a5e8_2f0d803b0833(ArrayList<Integer> arr, int x) {
        int l = 0;
        int r = arr.size() - 1;
        int ans = -1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                l = mid + 1;
            } else if (arr.get(mid) < x) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_0_48d39480_10f8_40a4_8292_8b044bc0f2cf(ArrayList<Integer> arr, int x) {
        // Write your code here
        int low = 0;
        int high = arr.size() - 1;
        int ans = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                low = mid + 1;
            } else if (arr.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_1_309c0cc5_2866_4f6f_bc88_6b40ee019b7b(ArrayList<Integer> arr, int x) {
        int l = 0, r = arr.size() - 1;
        while (l < r) {
            int mid = (l + r + 1) / 2;
            if (arr.get( mid) <= x) {
                l = mid;
            } else {
                r = mid - 1;
            }
        }
        if (arr.get( l) == x) {
            return l;
        }
        return -1;
    }

    
    public static int last_Problem_0_81294282_c655_4c68_8c32_e7e0f808a78f(ArrayList<Integer> arr, int x) {
        int i = arr.size() - 1;
        while (i >= 0 && arr.get(i) != x) {
            i--;
        }
        return i;
    }

    
    public static int last_Problem_1_6d8ed952_4efd_4be4_844b_56b495e7d91f(ArrayList<Integer> arr, int x) {
        int ret = -1;
        int pos = -1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                pos = i;
                break;
            }
        }
        if (pos != -1) {
            ret = arr.get(pos);
        }
        return ret;
    }

    
    public static int last_Problem_2_1cbc3ae3_feb0_4ba7_ac4b_9f12971fc64a(ArrayList<Integer> arr, int x) {
        int result = 0;
        if(arr.size() > 0) {
            result = arr.size()-1;
        }
        for(int i = arr.size()-1; i >= 0; i--) {
            if(arr.get(i) == x) {
                result = i;
                break;
            }
        }
        return result;
    }

    
    public static int last_Problem_0_89c5ef86_1d6c_4fb6_95a7_80daf71d9e17(ArrayList<Integer> arr, int x) {
        int pos = arr.last_Problem_0_89c5ef86_1d6c_4fb6_95a7_80daf71d9e17IndexOf(x);
        return arr.get(pos);
    }

    
    public static int last_Problem_1_7d066944_4c57_42c6_9e2d_311e72905f15(ArrayList<Integer> arr, int x) {
        int n = arr.size();
        for(int i = 0; i < n; i++) {
            if(arr.get(i) == x) {
                return i;
            }
        }
        return -1;
    }

    
    public static int last_Problem_1_6ec43528_9399_45ac_99e3_e3ddc9de9b0d(ArrayList<Integer> arr, int x) {
        int ret = -1;
        int index = -1;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) > x) {
                index = i;
                break;
            }
        }
        if(index != -1) {
            ret = arr.get(index);
        }
        return ret;
    }

    
    public static int last_Problem_2_aa602647_8143_45b8_8688_7250f5b0aaab(ArrayList<Integer> arr, int x) {
        int l = 0;
        int r = arr.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (arr.get(m) == x) {
                if (m == arr.size() - 1) {
                    return m;
                } else if (arr.get(m + 1) != x) {
                    return m;
                } else {
                    l = m + 1;
                }
            } else if (arr.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return -1;
    }

    
    public static int last_Problem_0_098f0446_08d6_4979_b742_62ee3ca9f3ef(ArrayList<Integer> arr, int x) {
        int last_Problem_0_098f0446_08d6_4979_b742_62ee3ca9f3ef = -1;
        int i = arr.size() - 1;
        while (i >= 0) {
            if (arr.get(i) == x) {
                last_Problem_0_098f0446_08d6_4979_b742_62ee3ca9f3ef = i;
                break;
            }
            i--;
        }
        return last_Problem_0_098f0446_08d6_4979_b742_62ee3ca9f3ef;
    }

    
    public static int last_Problem_0_3d6c0276_cc50_4002_af7c_8835c982e5c8(ArrayList<Integer> arr, int x) {
        int l = 0, r = arr.size() - 1;
        while (l < r) {
            int m = (l + r + 1) / 2;
            if (arr.get(m) <= x) {
                l = m;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int last_Problem_0_b55cf356_3c2d_487c_99bb_ed6e450b7b4b(ArrayList<Integer> arr, int x) {
        int start = 0;
        int end = arr.size() - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr.get(mid) < x) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return start == arr.size() ? -1 : arr.get(start);
    }

    
    public static int last_Problem_2_6f9abccf_2eff_42c4_b8d8_86d0a3562280(ArrayList<Integer> arr, int x) {
        int l = 0, r = arr.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (arr.get(m) == x) {
                if (m == arr.size() - 1 || arr.get(m + 1) != x) {
                    return m;
                } else {
                    l = m + 1;
                }
            } else if (arr.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return -1;
    }

    
    public static int last_Problem_1_8858644f_fc9e_45a2_971e_9284cb0223ab(ArrayList<Integer> arr, int x) {
        int i = arr.size() - 1;
        int l = 0;
        int r = arr.size();
        while (l < r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) == x) {
                return mid;
            } else if (arr.get(mid) < x) {
                l = mid + 1;
            } else {
                r = mid;
            }
        }
        return i;
    }

    
    public static int last_Problem_1_3d68b9a9_e686_453a_b1c7_23f10769c158(ArrayList<Integer> arr, int x) {
        int n = arr.size();
        int l = 0, r = n - 1;
        int ans = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                l = mid + 1;
            } else if (arr.get(mid) < x) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_2_11a614a3_de86_49a7_a4ff_5a3c62187aad(ArrayList<Integer> arr, int x) {
        int l = 0;
        int r = arr.size() - 1;
        int ans = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                l = mid + 1;
            } else if (arr.get(mid) < x) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_1_8cba830f_1f39_453c_b392_18216ef235ed(ArrayList<Integer> arr, int x) {
        int l = 0, r = arr.size() - 1;
        while (l < r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) <= x) {
                l = mid + 1;
            } else {
                r = mid;
            }
        }
        if (arr.get(l) == x) {
            return l;
        }
        return -1;
    }

    
    public static int last_Problem_2_82271e1b_9eb7_495d_a141_2ef378c3c74f(ArrayList<Integer> arr, int x) {
        int i = 0;
        int j = arr.size() - 1;
        int m = 0;
        while (i <= j) {
            m = (i + j) / 2;
            if (arr.get(m) == x) {
                if (m == arr.size() - 1) {
                    return m;
                } else if (arr.get(m + 1) != x) {
                    return m;
                } else {
                    i = m + 1;
                }
            } else if (arr.get(m) < x) {
                i = m + 1;
            } else {
                j = m - 1;
            }
        }
        return -1;
    }

    
    public static int last_Problem_1_d4f17061_613f_4198_b9a7_5f85285b071b(ArrayList<Integer> arr, int x) {
        if (arr.isEmpty()) return -1;
        int l = 0, r = arr.size()-1;
        while (l <= r) {
            int mid = (l+r) / 2;
            if (arr.get(mid).equals(x)) return mid;
            if (arr.get(mid) < x) {
                l = mid+1;
            } else {
                r = mid-1;
            }
        }
        return -1;
    }

    
    public static int last_Problem_1_2a72f404_3b32_4172_8b7f_61477ff6028f(ArrayList<Integer> arr, int x) {
        return arr.last_Problem_1_2a72f404_3b32_4172_8b7f_61477ff6028fIndexOf(x);
    }

    
    public static int last_Problem_0_0ff1f16b_a103_4038_ace3_13712ae247cf(ArrayList<Integer> arr, int x) {
        int i = 0;
        int j = arr.size() - 1;
        while (i < j) {
            int mid = (i + j) / 2;
            if (arr.get(mid) <= x) {
                i = mid + 1;
            } else {
                j = mid;
            }
        }
        if (arr.get(i) == x) {
            return i;
        }
        return -1;
    }

    
    public static int last_Problem_0_4e6f87e5_477f_4349_ac2d_35319f27b4ef(ArrayList<Integer> arr, int x) {
        int low = 0;
        int high = arr.size() - 1;
        int ans = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                low = mid + 1;
            } else if (arr.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_0_0a042d9a_de23_4820_ad46_7908714e47e1(ArrayList<Integer> arr, int x) {
        int size = arr.size();
        int start = 0;
        int end = size - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr.get(mid) > x) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

    
    public static int last_Problem_2_b55cf356_3c2d_487c_99bb_ed6e450b7b4b(ArrayList<Integer> arr, int x) {
        int start = 0;
        int end = arr.size() - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr.get(mid) < x) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return start == arr.size() ? -1 : arr.get(start);
    }

    
    public static int last_Problem_2_c4d49d66_709c_4d8a_897c_2fcf15492f66(ArrayList<Integer> arr, int x) {
        int l = 0;
        int r = arr.size() - 1;
        int ans = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                l = mid + 1;
            } else if (arr.get(mid) > x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_0_6b2e3c95_4bed_44fd_9f09_a743c319724e(ArrayList<Integer> arr, int x) {
        int pos = -1;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == x) {
                pos = i;
                break;
            }
        }
        return pos;
    }

    
    public static int last_Problem_1_bb163659_7424_4139_a58f_52880aea7e12(ArrayList<Integer> arr, int x) {
        int l = 0, r = arr.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (arr.get(m) == x) {
                if (m == arr.size() - 1 || arr.get(m + 1) != x)
                    return m;
                else
                    l = m + 1;
            } else if (arr.get(m) > x)
                r = m - 1;
            else
                l = m + 1;
        }
        return -1;
    }

    
    public static int last_Problem_0_b97900e8_f34f_4609_892f_03663ce56772(ArrayList<Integer> arr, int x) {
        int l = 0, r = arr.size() - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) == x) {
                if (mid == arr.size() - 1 || arr.get(mid + 1) > x)
                    return mid;
                else
                    l = mid + 1;
            } else if (arr.get(mid) < x)
                l = mid + 1;
            else
                r = mid - 1;
        }
        return -1;
    }

    
    public static int last_Problem_0_62a7d54c_0b5a_4016_a858_c0af9f800f80(ArrayList<Integer> arr, int x) {
        int start = 0;
        int end = arr.size() - 1;
        int ans = -1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                start = mid + 1;
            } else if (arr.get(mid) > x) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_0_200044cc_0af0_4d45_a585_ec8600d01a96(ArrayList<Integer> arr, int x) {
        int n = arr.size();
        int low = 0, high = n - 1;
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                low = mid + 1;
            } else if (arr.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_0_7c849b71_0079_45f7_9eba_5ceb40f2d513(ArrayList<Integer> arr, int x) {
        int n = arr.size();
        int low = 0, high = n - 1;
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                low = mid + 1;
            } else if (arr.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_2_4fcfc69f_4263_46d1_8b9a_651d4333bd0e(ArrayList<Integer> arr, int x) {
        int l = 0;
        int r = arr.size() - 1;
        int ans = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                l = mid + 1;
            } else if (arr.get(mid) < x) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_1_3fc25ee6_d243_473f_ae7f_cd88ba8360b2(ArrayList<Integer> arr, int x) {
        // Your code here
        int n = arr.size();
        int l = 0, r = n - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (arr.get(mid) == x) {
                if (mid == n - 1 || arr.get(mid + 1) != x)
                    return mid;
                else
                    l = mid + 1;
            } else if (arr.get(mid) < x)
                l = mid + 1;
            else
                r = mid - 1;
        }
        return -1;
    }

    
    public static int last_Problem_0_d695cedd_97dc_418c_958e_48625667978a(ArrayList<Integer> arr, int x) {
        // Your Function Here
        int i = arr.size() - 1;
        while (i >= 0) {
            if (arr.get(i) == x)
                return i;
            i--;
        }
        return -1;
    }

    
    public static int last_Problem_0_c388ed57_bfa2_445f_bb9c_e4c34a2ba70a(ArrayList<Integer> arr, int x) {
        // Write your code here
        return 0;
    }

    
    public static int last_Problem_0_6574f783_0947_40d1_8ebc_7d0374bc5eaa(ArrayList<Integer> arr, int x) {
        int l = 0, r = arr.size() - 1;
        while (l < r) {
            int mid = (l + r + 1) / 2;
            if (arr.get(mid) <= x) {
                l = mid;
            } else {
                r = mid - 1;
            }
        }
        return l;
    }

    
    public static int last_Problem_2_9b0fc5ab_4851_4336_9d05_9741afc417c7(ArrayList<Integer> arr, int x) {
        int low = 0;
        int high = arr.size() - 1;
        int mid = 0;
        while (low <= high) {
            mid = (low + high) / 2;
            if (arr.get(mid) == x && (mid == arr.size() - 1 || arr.get(mid + 1) > x)) {
                return mid;
            } else if (arr.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    
    public static int last_Problem_1_f889c38d_9703_4378_bde9_95ac29e8f8a9(ArrayList<Integer> arr, int x) {
        // Complete this function
        int i = 0;
        while(arr.size() > 0) {
            i = arr.get(arr.size()-1);
            if(i < x) {
                arr.remove(arr.size()-1);
            }
            else {
                break;
            }
        }
        return i;
    }

    
    public static int last_Problem_0_352a7816_827a_4ae3_9e00_7f96bb3cb871(ArrayList<Integer> arr, int x) {
        // if the length of the array is 0, return -1
        if (arr.size() == 0) {
            return -1;
        }
        int pos = arr.indexOf(x);
        if (pos == arr.size() - 1) {
            return pos;
        } else {
            return arr.get(arr.size() - 1);
        }
    }

    
    public static int last_Problem_0_1e3812dd_71ed_4a5b_ac19_b399452b62cd(ArrayList<Integer> arr, int x) {
        return (arr.get(arr.size() - 1) == x) ? arr.size() - 1 : arr.last_Problem_0_1e3812dd_71ed_4a5b_ac19_b399452b62cdIndexOf(x);
    }

    
    public static int last_Problem_1_5587a248_5702_4b05_a300_f88aee138413(ArrayList<Integer> arr, int x) {
        int lo = 0, hi = arr.size() - 1;
        while (lo < hi) {
            int mid = (lo + hi + 1) / 2;
            if (arr.get(mid) <= x) {
                lo = mid;
            } else {
                hi = mid - 1;
            }
        }
        return arr.get(lo) == x ? lo : -1;
    }

    
    public static int last_Problem_1_b8c5ec45_4c08_4f85_97db_6457bbc0d9e7(ArrayList<Integer> arr, int x) {
        int n = arr.size();
        int low = 0;
        int high = n - 1;
        int ans = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                low = mid + 1;
            } else if (arr.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    
    public static int last_Problem_1_6471e48d_db97_467b_a4ee_e70c522b76ec(ArrayList<Integer> arr, int x) {
        int pos = -1;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == x) {
                pos = i;
            }
        }
        return pos;
    }

    
    public static int last_Problem_0_8cba830f_1f39_453c_b392_18216ef235ed(ArrayList<Integer> arr, int x) {
        int l = 0, r = arr.size() - 1;
        while (l < r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) <= x) {
                l = mid + 1;
            } else {
                r = mid;
            }
        }
        if (arr.get(l) == x) {
            return l;
        }
        return -1;
    }

    
    public static int last_Problem_1_487e46bb_5749_403b_b93a_404b12661c96(ArrayList<Integer> arr, int x) {
        int n = arr.size();
        int l = 0;
        int r = n - 1;
        int ans = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) == x) {
                ans = mid;
                l = mid + 1;
            } else if (arr.get(mid) < x) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return ans;
    }

}
