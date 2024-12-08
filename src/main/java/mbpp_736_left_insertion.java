package mbpp_736_left_insertion;

public class mbpp_736_left_insertion {

    
    public static int leftInsertion_Problem_2_a78dd784_3029_4889_a688_dfc131951f90(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_3e9329ff_f49f_4e62_87e3_32247b4f389f(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get( m) == x) {
                return m;
            } else if (a.get( m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_7bab89c2_ffc0_44b6_904c_985bfa58e6bb(ArrayList<Integer> a, int x) {
        int lo = 0;
        int hi = a.size() - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (a.get(mid) < x) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return lo;
    }

    
    public static int leftInsertion_Problem_2_280ac273_50b0_412d_a04d_f27fd6aed594(ArrayList<Integer> a, int x) {
        int lo = 0;
        int hi = a.size() - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (a.get(mid) < x) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return lo;
    }

    
    public static int leftInsertion_Problem_2_a1c8b87a_ff8f_403b_b023_a708d4988e76(ArrayList<Integer> a, int x) {
        if (x < a.get(0)) {
            return 1;
        } else if (x > a.get(a.size()-1)) {
            return a.size()-1;
        } else {
            int low = 0;
            int high = a.size()-1;
            while (low < high) {
                int mid = (low+high)/2;
                if (x < a.get(mid)) {
                    low = mid + 1;
                } else {
                    high = mid;
                }
            }
            return low;
        }
    }

    
    public static int leftInsertion_Problem_2_98685c02_daee_4da0_8ecc_b3f3813a134c(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while(l <= r) {
            int m = (l + r) / 2;
            if(a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_51f2c169_4aa9_46b2_8991_01885c6a627a(ArrayList<Integer> a, int x) {
        boolean found = False;
        for (int i = 0; i < a.size(); i++) {
            if (x == a.get(i)) {
                found = True;
                break;
            }
        }
        if (!found) {
            a.add(x);
        }
        return 0;
    }

    
    public static int leftInsertion_Problem_0_9726315d_159b_469a_bde8_a204c0939e30(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_673a9a66_8168_4713_85e0_ea9aced809e6(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_c152721a_5711_4791_911f_34fc1a5c7ee2(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_388dab4a_a364_4743_8913_f19278e0b66f(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_bb5ab7b8_3a20_458e_98df_0e9ae6987419(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_59cd5a5b_3bb9_4d6b_ae87_ceec118f0591(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (a.get(mid) >= x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_70bff59c_e1ed_43c0_8810_e365a3d22775(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_d2f58aad_9fb2_46e2_a32e_9f26221a5a5d(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get( m) == x) {
                return m;
            } else if (a.get( m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_027ddd08_dd4d_41a6_be14_eea103fd4744(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_9e347a80_527a_4582_b5e2_360fe2d0b416(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_0c7cd09e_e020_496d_a1d3_3f64a093d25c(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_c293ce0f_f59b_4b32_962b_ab1b9b0f8504(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_f83fa504_172c_41bf_92eb_ffbac77fb519(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_77072d03_7371_4bfd_8aa5_0c771b7dc0de(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_e7f826c8_9df5_4749_b6e7_d66dfb3ec072(ArrayList<Integer> a, int x) {
        int low = 0;
        int high = a.size() - 1;
        int mid;
        while (low <= high) {
            mid = (low + high) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }

    
    public static int leftInsertion_Problem_2_b3120f44_40a8_4143_b7e6_0a921629ea92(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_f29020d3_6340_47f4_81d2_a0a089dadf60(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_cf08f2a6_1500_489d_99f3_b0c947560da9(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_f6bfb32c_c739_4d5c_859b_758280c91f0c(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_b266e47f_7efd_47d8_880b_352a2a4ab959(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_e062551a_3ca6_4551_8ceb_e0d9202b7b40(ArrayList<Integer> a, int x) {
        if (a.size() == 0) return 0;
        int l = 0, r = a.size() - 1;
        while (l < r) {
            int mid = (l + r) / 2;
            if (a.get(mid) < x) l = mid + 1;
            else r = mid;
        }
        return a.get(l) >= x ? l : l + 1;
    }

    
    public static int leftInsertion_Problem_0_6770f9c5_08c5_41bf_b700_c7e69eb5426e(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_fdd988ff_8593_4534_b5e1_6deb6d542249(ArrayList<Integer> a, int x) {
        // Write - Your - Code
        int left = 0;
        int right = a.size() - 1;
        while (left < right) {
            int mid = (left + right) / 2;
            if (a.get(mid) < x) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }

    
    public static int leftInsertion_Problem_0_ff092044_d53a_467c_8539_1080dbd955b4(ArrayList<Integer> a, int x) {
        int low = 0;
        int high = a.size() - 1;
        int mid = 0;
        while (low <= high) {
            mid = (low + high) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    
    public static int leftInsertion_Problem_2_1829883e_0b9c_40dc_bb6b_8d6eedec0fb0(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size()-1;
        while (l <= r) {
            int m = l + (r-l)/2;
            if (a.get(m) == x) {
                return m;
            }
            if (a.get(m) > x) {
                r = m-1;
            } else {
                l = m+1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_44521739_8d19_4c14_92d7_65a8ce36444a(ArrayList<Integer> a, int x) {
        int min = Collections.min(a);
        if (x == min) return 0;
        else if (x < min) return Collections.binarySearch(a, min) - 1;
        else return Collections.binarySearch(a, x) - 1;
    }

    
    public static int leftInsertion_Problem_1_e0b21528_dc4b_4b42_8e93_e5e50f4a6fd5(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_5e4c2db9_c389_4f52_8ed5_201af9a6820b(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_38a03503_959a_4f16_a507_a4b93990aded(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_b17e7d54_6848_47b3_a2e8_8bcb98b6b214(ArrayList<Integer> a, int x) {
        int low = 0;
        int high = a.size() - 1;
        int mid = 0;
        while (low <= high) {
            mid = (low + high) / 2;
            if (x > a.get(mid)) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }

    
    public static int leftInsertion_Problem_2_0af0df10_2fbf_44cc_8db5_84fe34b0e510(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0, r = n - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (a.get(mid) >= x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_fd5de8dc_73e1_4464_b3c3_9bcddd342928(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_98685c02_daee_4da0_8ecc_b3f3813a134c(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while(l <= r) {
            int m = (l + r) / 2;
            if(a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_58731924_4216_46c6_8aba_e6e73cf74d54(ArrayList<Integer> a, int x) {
        int left = 0;
        int right = a.size() - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (a.get(mid) < x) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }

    
    public static int leftInsertion_Problem_1_027ddd08_dd4d_41a6_be14_eea103fd4744(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_ff2cfd3e_ac6d_4f72_99f2_246338ae243b(ArrayList<Integer> a, int x) {
        int lo = 0;
        int hi = a.size() - 1;
        while (lo < hi) {
            int mid = (lo + hi) / 2;
            if (a.get(mid) < x) {
                lo = mid + 1;
            } else {
                hi = mid;
            }
        }
        return lo;
    }

    
    public static int leftInsertion_Problem_2_4af41461_3e11_4527_852a_1de37f7839a7(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0, r = n - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_aed35e9e_bb6a_446c_ad97_e1391fc810d3(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0;
        int r = n - 1;
        int m = 0;
        while (l <= r) {
            m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_0b729237_b7b3_49d8_a678_9e4bf7031aa9(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_e4069b37_d5ef_4d9b_a2de_04fbe7d25596(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_31372648_2d71_4109_aa29_53fbb59653cb(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_b38bf438_d39c_46ed_b6ae_87a73ca73eea(ArrayList<Integer> a, int x) {
        int lo = 0;
        int hi = a.size() - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (x == a.get(mid)) {
                return mid;
            } else if (x < a.get(mid)) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return lo;
    }

    
    public static int leftInsertion_Problem_0_b33e4a78_57cb_4fda_ad81_eb58f3d689a0(ArrayList<Integer> a, int x) {
        int low = 0;
        int high = a.size() - 1;
        int mid = 0;

        while (low <= high) {
            mid = (low + high) / 2;

            if (a.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }

        return mid + 1; // if mid > high, then it means x was present at the end
    }

    
    public static int leftInsertion_Problem_1_fdd988ff_8593_4534_b5e1_6deb6d542249(ArrayList<Integer> a, int x) {
        // Write - Your - Code
        int left = 0;
        int right = a.size() - 1;
        while (left < right) {
            int mid = (left + right) / 2;
            if (a.get(mid) < x) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }

    
    public static int leftInsertion_Problem_2_49152b37_5fbe_43a7_9735_d83642abfa7b(ArrayList<Integer> a, int x) {
        int i = 0;
        int j = a.size() - 1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (a.get(mid) < x) {
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_a77b52c5_6ee8_49b4_ba4f_ba8ecce110db(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_ec7e8ea0_99c8_4c43_8d75_285dad869966(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_4e8a8012_2b10_489a_b9f8_a1ca02047af0(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_2e781554_f4d1_443f_8818_5d4103a4cb2b(ArrayList<Integer> a, int x) {
        int lo = 0;
        int hi = a.size() - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) > x) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return lo;
    }

    
    public static int leftInsertion_Problem_0_a971de80_bbac_4e81_8685_8d68a04c4bfd(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_63ee34d4_7157_4eb8_91f1_8b94e69bccc1(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_fab0a78e_11a9_4c6d_9145_a0a14a41ac2b(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_f9886055_d6fb_4e30_8544_17c82c63b5cf(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_81b73118_f864_498e_a5b9_acca1f612f56(ArrayList<Integer> a, int x) {
        int leftInsertPoint = 0;
        for (int i = 0; i < a.size() && a.get(i) > x; i++) leftInsertPoint = a.get(i);
        return leftInsertPoint;
    }

    
    public static int leftInsertion_Problem_0_15073c5b_4a42_4b1d_8d99_849486b977d9(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_7cc6c843_90f8_4b35_9f76_5ac3bd241fbf(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_4013f215_73b2_444b_85fc_7694b38f7ddf(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_edebeb89_35df_4168_93f8_502c6cf830bd(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get( m) == x) {
                return m;
            } else if (a.get( m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_78681d5e_df11_47c1_b570_fcd87093707d(ArrayList<Integer> a, int x) {
        int i = 0;
        while(i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_16cae836_596f_4dd0_b4db_9b400b839e65(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_443330a5_8f82_456f_bc46_4cdaee57c4e0(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_790e2bfd_4832_4063_8130_5daaeaaab2eb(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_d6a1f0be_dfbc_40fd_ba45_15b6fe3540a3(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_1829883e_0b9c_40dc_bb6b_8d6eedec0fb0(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size()-1;
        while (l <= r) {
            int m = l + (r-l)/2;
            if (a.get(m) == x) {
                return m;
            }
            if (a.get(m) > x) {
                r = m-1;
            } else {
                l = m+1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_2c9a81e0_732f_4fe8_adbd_b347b08e50f5(ArrayList<Integer> a, int x) {
        int left = 0;
        int right = a.size() - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) < x) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }

    
    public static int leftInsertion_Problem_0_b1cc5cc3_1801_4bc9_b4d9_6c6273295ed3(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_b1d3d340_83d1_4f47_b248_a0599277e073(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) > x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_5fbab564_9ac3_4e0d_a7e2_1b1eb6a38610(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_c152721a_5711_4791_911f_34fc1a5c7ee2(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_aed35e9e_bb6a_446c_ad97_e1391fc810d3(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0;
        int r = n - 1;
        int m = 0;
        while (l <= r) {
            m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_d621b0ad_219d_47a3_b092_cbce79115e95(ArrayList<Integer> a, int x) {
        int lo = 0;
        int hi = a.size() - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) > x) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return lo;
    }

    
    public static int leftInsertion_Problem_0_4631e12b_81e2_47db_9372_dfdabbc13862(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_ef20686a_75dc_47ff_8f4f_ca2e1555500b(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get( m) == x) {
                return m;
            } else if (a.get( m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_fc8b43cc_7baf_4bdb_8550_e530dc71ba05(ArrayList<Integer> a, int x) {
        int n = a.size();
        if (x <= a.get(0)) {
            return 0;
        }
        if (x > a.get(n - 1)) {
            return n;
        }
        int lo = 0;
        int hi = n - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (x <= a.get(mid)) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return lo;
    }

    
    public static int leftInsertion_Problem_0_15e5dfde_6140_4e2f_be61_88d4d0840b5b(ArrayList<Integer> a, int x) {
        int lo = 0;
        int hi = a.size() - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (x <= a.get(mid)) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return lo;
    }

    
    public static int leftInsertion_Problem_0_7393c1ae_2add_40b1_8da1_c18c1a82df2c(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_9d3634bf_20a8_419c_a1c2_2bf6dab35f04(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) < x) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_c758362a_8f91_4ab4_9210_237f77700e82(ArrayList<Integer> a, int x) {
        int left = 0;
        int right = a.size() - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) > x) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    
    public static int leftInsertion_Problem_2_0209af93_28bf_4ce1_b2ba_6c889e54ebff(ArrayList<Integer> a, int x) {
        int low = 0;
        int high = a.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    
    public static int leftInsertion_Problem_2_c42c2188_52d0_4126_9340_237234269af2(ArrayList<Integer> a, int x) {
        int i = 0;
        while(i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_648066c5_6571_42bc_a9f5_93c08b00b8c0(ArrayList<Integer> a, int x) {
        int lo = 0;
        int hi = a.size() - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) < x) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return lo;
    }

    
    public static int leftInsertion_Problem_2_9726315d_159b_469a_bde8_a204c0939e30(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_81bf7b85_b493_4fda_a7dc_2f2e0ef944f7(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get( m) == x) {
                return m;
            } else if (a.get( m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_0e90249e_c7de_4198_91a3_539267e4d3e0(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_d12f0a4e_d2be_4dd6_b1c2_cd641b6906f0(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0, r = n - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_a78dd784_3029_4889_a688_dfc131951f90(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_c5f97816_a2d5_453b_af36_4cdd08eac3f1(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get( m) == x) {
                return m;
            } else if (a.get( m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_59272947_1035_4e2e_bf10_3571e6c4a075(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) > x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_962dc8c5_ae8e_41fd_91d2_a86ed56f4766(ArrayList<Integer> a, int x) {
        int lo = 0;
        int hi = a.size() - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (a.get(mid) < x) {
                lo = mid + 1;
            } else if (a.get(mid) > x) {
                hi = mid - 1;
            } else {
                return mid;
            }
        }
        return lo;
    }

    
    public static int leftInsertion_Problem_0_e944a07b_240c_4370_a384_828ecf0d0f61(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0, r = n - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) < x) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_4594895a_c033_4701_ba2b_7f8e9cd4ea2f(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_2c9a81e0_732f_4fe8_adbd_b347b08e50f5(ArrayList<Integer> a, int x) {
        int left = 0;
        int right = a.size() - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) < x) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }

    
    public static int leftInsertion_Problem_2_c8e3e3b8_4ee4_494e_82f5_d827111b57e2(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_78b21298_7948_4326_b304_276db6ed28fa(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_5df5f81a_9a99_47fd_855e_f03c61613d5e(ArrayList<Integer> a, int x) {
        int lo = 0;
        int hi = a.size() - 1;
        while (lo < hi) {
            int mid = (lo + hi) / 2;
            if (a.get(mid) < x) {
                lo = mid + 1;
            } else {
                hi = mid;
            }
        }
        return lo;
    }

    
    public static int leftInsertion_Problem_0_ae4ca3f0_4900_4695_a06e_6094193dd386(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_ff47de4b_6a41_44d3_98a1_b5f953866286(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_a971de80_bbac_4e81_8685_8d68a04c4bfd(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_78681d5e_df11_47c1_b570_fcd87093707d(ArrayList<Integer> a, int x) {
        int i = 0;
        while(i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_e0c466b1_eaf0_4fa3_a7f7_2546a8336421(ArrayList<Integer> a, int x) {
        int i = 0;
        int j = a.size() - 1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (a.get(mid) < x) {
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_275edc80_3b0e_4a0e_8fc2_6cded258dd03(ArrayList<Integer> a, int x) {
        int lo = 0, hi = a.size() - 1;
        while (lo < hi) {
            int mid = (lo + hi) / 2;
            if (a.get(mid) < x) lo = mid + 1;
            else hi = mid;
        }
        return lo;
    }

    
    public static int leftInsertion_Problem_1_f45a8fa6_2a2d_4214_aae8_3e1c418acf87(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_dbb5b594_8005_4517_8fef_bad1d75235c3(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_5b8e346d_7c57_4be8_97d6_fa2a6d759044(ArrayList<Integer> a, int x) {
        // Write your code here
        // To print results to the standard output you can use System.out.println()
        // Example: System.out.println("Hello world!");
        int low = 0;
        int high = a.size() - 1;
        int mid = 0;
        while (low <= high) {
            mid = (low + high) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }

    
    public static int leftInsertion_Problem_0_e8d7b364_9a47_4764_b873_efbc5e9a58dc(ArrayList<Integer> a, int x) {
        int low = 0; int high = a.size()-1;
        while (low<=high) {
            int mid = (low+high)/2;
            if (a.get(mid)>=x) {
                high = mid -1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    
    public static int leftInsertion_Problem_2_10755c05_46f4_43a1_8e58_96c741bf2b27(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0, r = n - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) >= x) {
                r = m;
            } else {
                l = m + 1;
            }
        }
        if (a.get(l) < x) {
            return l + 1;
        } else {
            return l;
        }
    }

    
    public static int leftInsertion_Problem_1_ea91ac95_a1e5_48d6_9b4a_fc1eb9eb2f4c(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_99dd79d0_a4ba_43a3_84e0_73015d2f219d(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_182dc868_a1c6_461d_bfd8_1465cfdaf0ea(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_2c9a81e0_732f_4fe8_adbd_b347b08e50f5(ArrayList<Integer> a, int x) {
        int left = 0;
        int right = a.size() - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) < x) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }

    
    public static int leftInsertion_Problem_2_61ab6d8b_1b8d_4086_8203_8c7a50fbbdd8(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0, r = n - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_4e486eba_3f32_4b30_98be_7dde4a1214c0(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_15073c5b_4a42_4b1d_8d99_849486b977d9(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_f6bfb32c_c739_4d5c_859b_758280c91f0c(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_40030029_9c55_4066_8e27_8d582405f819(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_29adf24e_65b2_4b7e_b836_8795efc8bc73(ArrayList<Integer> a, int x) {
        int i =  Math.floor(a.size()/2.0);
        while(i >= 0 && a.get(i) <= x) i--;
        return i+1;
    }

    
    public static int leftInsertion_Problem_1_065ee834_f493_43b0_8787_85547effd492(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_67a8715a_30da_4e4c_8457_534c40b20359(ArrayList<Integer> a, int x) {
        // Write - Your - Code
        int low = 0;
        int high = a.size() - 1;
        int mid = 0;
        while (low <= high) {
            mid = (low + high) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    
    public static int leftInsertion_Problem_0_027d2151_495d_4eb4_9969_11e2bd0675b8(ArrayList<Integer> a, int x) {
        // Write your code here
        return 0;
    }

    
    public static int leftInsertion_Problem_2_f65420b8_9d80_4191_b21a_cf8e32e37e77(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_df01a568_a295_4e8c_a725_bd288beb324a(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0;
        int r = n - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_91333fff_63d3_46de_a204_dc010e6cbc57(ArrayList<Integer> a, int x) {
        int lo = 0;
        int hi = a.size() - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (a.get(mid) < x) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return lo;
    }

    
    public static int leftInsertion_Problem_2_db45e9b6_bcc9_4d01_91f1_9dd1834d842d(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_6ca9dd10_e959_42c5_8c46_8b4041fe9fb8(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0, r = n - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) >= x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_5e02e26a_bc12_4492_9eab_c4fc88dd7872(ArrayList<Integer> a, int x) {
        int left = 0;
        int right = a.get(0); // get first element
        while (right < a.size() - 1) { // while right is less than the size of the array
            if (x <= right) { // if x is less than the right element
                left = right + 1; // set left to the right element + 1
            } else {
                left++; // if x is greater than the right element, set left to right element + 1
            }
            right++; // increment right by 1
        }
        return left; // return the left insertion point
    }

    
    public static int leftInsertion_Problem_2_fc48ae4e_87b1_4850_b2c2_39bbe4f55d8d(ArrayList<Integer> a, int x) {
        int i = 0;
        while(i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_21660841_5dd1_487c_a02d_c2cb4bac87f0(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get( m) < x) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_c904ec36_840d_456c_87fb_b222ae25883b(ArrayList<Integer> a, int x) {
        int i = 0;
        while(i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_a74e8b96_a5a4_4b92_90e1_fc69d5c137e9(ArrayList<Integer> a, int x) {
        int i = 0;
        int j = a.size() - 1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) < x) {
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_9b31183b_b6ea_4b09_9906_ba5ed0864563(ArrayList<Integer> a, int x) {
        int i = 0;
        int j = a.size() - 1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (a.get(mid) < x) {
                i = mid + 1;
            } else if (a.get(mid) > x) {
                j = mid - 1;
            } else {
                return mid;
            }
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_790e2bfd_4832_4063_8130_5daaeaaab2eb(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_8858567e_e640_4cbe_a3a0_c423ea7469b3(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_e833699d_7324_4cfd_9c64_0ae5b44bec68(ArrayList<Integer> a, int x) {
        int i = 0;
        while(i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_e0b21528_dc4b_4b42_8e93_e5e50f4a6fd5(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_21461799_5768_4adf_bd51_34ead0ca0e87(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_b3a4e312_621d_467a_a4cb_62e53ea3f7fc(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_5d6869a4_3c0c_4232_92e0_0107b72740fa(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_f6799bbd_3f28_451b_adaa_decdfa17c42f(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0;
        int r = n - 1;
        int mid = 0;
        while (l <= r) {
            mid = (l + r) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) < x) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_fe967955_80a9_405f_8f0a_1ff0a540dbd4(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) > x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_c5a2a5ed_2fff_4f70_bba0_917aa5ce7241(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_50289cff_8f6f_4f66_a771_292c0003c4c7(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0, r = n - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) return m;
            if (a.get(m) > x) r = m - 1;
            else l = m + 1;
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_f3701d2b_a965_4e0b_aff6_54880b4547e1(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_f65420b8_9d80_4191_b21a_cf8e32e37e77(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_e0b21528_dc4b_4b42_8e93_e5e50f4a6fd5(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_ce868931_5b04_4371_a974_8ab76d99ff83(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) < x) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_c2e5e6e7_6678_4a95_a7ee_acb30b05d028(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_1cef567f_70a2_4f91_a548_f80430e6a7e3(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_29710456_fac7_4bb1_8f07_cd3e48612a83(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_3d308fbc_1b89_4caf_a0a8_25e20558e9e5(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_ff2cfd3e_ac6d_4f72_99f2_246338ae243b(ArrayList<Integer> a, int x) {
        int lo = 0;
        int hi = a.size() - 1;
        while (lo < hi) {
            int mid = (lo + hi) / 2;
            if (a.get(mid) < x) {
                lo = mid + 1;
            } else {
                hi = mid;
            }
        }
        return lo;
    }

    
    public static int leftInsertion_Problem_1_027ddd08_dd4d_41a6_be14_eea103fd4744(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_ff47de4b_6a41_44d3_98a1_b5f953866286(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_4d7876a7_662e_4337_903e_3fcfe6aabc45(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_bc99e938_35db_4ac1_ad6b_0d4fd622b8a0(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_5159133f_6717_4177_8ffe_abc94caab3e2(ArrayList<Integer> a, int x) {
        int lo = 0;
        int hi = a.size() - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (a.get(mid) < x) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return lo;
    }

    
    public static int leftInsertion_Problem_0_72d40f0c_52bd_4847_9e0b_4e9e27f9ea86(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_e82667d0_445e_4385_b979_110ce5508099(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0, r = n - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) > x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_37d70147_45a2_4b0d_8737_b9ace4da2385(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_a78dd784_3029_4889_a688_dfc131951f90(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_648066c5_6571_42bc_a9f5_93c08b00b8c0(ArrayList<Integer> a, int x) {
        int lo = 0;
        int hi = a.size() - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) < x) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return lo;
    }

    
    public static int leftInsertion_Problem_2_b8ddce07_d84d_450b_acfd_8dbb76bc80c4(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l < r) {
            int mid = (l + r) / 2;
            if (a.get(mid) < x) {
                l = mid + 1;
            } else {
                r = mid;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_9ac877df_4927_465e_8fde_ab07a82fd97e(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_33c19768_9da3_440c_8466_b7462ea61e88(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_c8a05570_d3d1_47b4_8f5c_e3b6dd5ebb32(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_a7243909_b446_492b_b4de_f2c10d1e1e31(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0, r = n - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_a7ec39d4_dec1_419c_b0ac_1492c368eeab(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_797300fb_5a1d_405e_8e6d_3e9bfaa6677c(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_d2f58aad_9fb2_46e2_a32e_9f26221a5a5d(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get( m) == x) {
                return m;
            } else if (a.get( m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_de3a7c43_fcde_4321_b4d5_dae2a4d20874(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0;
        int r = n - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_e41b21a0_f9f3_46da_9fab_c50dc3759fcd(ArrayList<Integer> a, int x) {
        // Write - Your - Code
        int start = 0;
        int end = a.size() - 1;
        int mid = 0;
        while (start <= end) {
            mid = (start + end) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) < x) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return start;
    }

    
    public static int leftInsertion_Problem_2_94e7a63a_caab_4e70_b3da_9fbf9b56e04f(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_067fda54_a864_4af7_b106_74d3b3d68937(ArrayList<Integer> a, int x) {
        int i = 0;
        while(i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_4d7876a7_662e_4337_903e_3fcfe6aabc45(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_91333fff_63d3_46de_a204_dc010e6cbc57(ArrayList<Integer> a, int x) {
        int lo = 0;
        int hi = a.size() - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (a.get(mid) < x) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return lo;
    }

    
    public static int leftInsertion_Problem_1_dffce6a0_11b7_4023_8f6c_5a496a42c52a(ArrayList<Integer> a, int x) {
        int i = 0;
        int j = a.size() - 1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (a.get(mid) < x) {
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_58731924_4216_46c6_8aba_e6e73cf74d54(ArrayList<Integer> a, int x) {
        int left = 0;
        int right = a.size() - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (a.get(mid) < x) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }

    
    public static int leftInsertion_Problem_1_78b21298_7948_4326_b304_276db6ed28fa(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_f0395f92_37b7_452c_9568_393dd650a98c(ArrayList<Integer> a, int x) {
        int lo = 0;
        int hi = a.size() - 1;
        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if (a.get(mid) < x) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return lo;
    }

    
    public static int leftInsertion_Problem_0_55ae56cd_f4c8_4226_81fc_7cb23565c4a3(ArrayList<Integer> a, int x) {
        if (a.size() == 0) {
            return 0;
        }
        int l = 0;
        int r = a.size() - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        if (a.get(l) < x) {
            return l + 1;
        } else {
            return l;
        }
    }

    
    public static int leftInsertion_Problem_0_cbe42833_f0ce_4742_b20d_0f7143992319(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_5cfa0bf6_b75c_4888_9217_471598ef73e1(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l < r) {
            int mid = (l + r) / 2;
            if (a.get(mid) < x) {
                l = mid + 1;
            } else {
                r = mid;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_5d6869a4_3c0c_4232_92e0_0107b72740fa(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_1dee6844_1a14_42fc_b643_86b9f5ef96ba(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) > x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_a55c3b22_54ef_4114_9997_14045cb5db38(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_9d86c068_8644_416c_8802_1a681da1cee5(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_f29020d3_6340_47f4_81d2_a0a089dadf60(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_396ed8fa_be76_4d9f_9b98_516f87033f3e(ArrayList<Integer> a, int x) {
        int i = Collections.binarySearch(a, x);
        if (i < 0)
            i = (-i - 2) / 2;
        return i;
    }

    
    public static int leftInsertion_Problem_0_182dc868_a1c6_461d_bfd8_1465cfdaf0ea(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_e99320ad_d7af_4772_876f_7f8f2e7c3324(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_e83dd92c_d557_45ee_8d6a_7d82dcb30356(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0, r = n - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_4af40a06_7938_4226_811b_464b0a6581e3(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_4631e12b_81e2_47db_9372_dfdabbc13862(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_8f7b9e7a_cad5_4101_a633_7712dff3c114(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_fca8b5de_7e62_4f67_aebf_220ea858b322(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0, r = n - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_8b84ea82_0ff8_4927_bdfb_eba6403bd07f(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_8e42ead9_8c68_4d2c_9328_6c65113c6e4c(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_37d70147_45a2_4b0d_8737_b9ace4da2385(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_6fcbf03a_2172_4371_97a8_a1c73457d16e(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            }
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_3b90e66e_63a5_492a_86b2_bec77592f0c7(ArrayList<Integer> a, int x) {
        // Write your code here
        // To print results to the standard output you can use System.out.println()
        // Example: System.out.println("Hello world!");
        int l = 0, r = a.size() - 1;
        while(l < r) {
            int mid = (l + r) / 2;
            if(a.get(mid) >= x) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_a78dd784_3029_4889_a688_dfc131951f90(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_c24f1f85_fc33_43bf_b45b_0f45f61e4e32(ArrayList<Integer> a, int x) {
        int i = 0;
        while(i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_29710456_fac7_4bb1_8f07_cd3e48612a83(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_9726315d_159b_469a_bde8_a204c0939e30(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_c152721a_5711_4791_911f_34fc1a5c7ee2(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_583dc8bf_baa7_4d51_a154_4b6330f50427(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) > x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_28324be7_89ba_411b_8691_7318590869ca(ArrayList<Integer> a, int x) {
        if (x > 0) {
            for (int i = 0; i < a.size(); i++) {
                if (a.get(i) <= x)
                    return i;
            }
        }
        return a.size();
    }

    
    public static int leftInsertion_Problem_0_edebeb89_35df_4168_93f8_502c6cf830bd(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get( m) == x) {
                return m;
            } else if (a.get( m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_0a5401a6_371a_4200_ab05_b4f6c88b1857(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_23106685_6168_4bf4_aa3e_22672d99912c(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_426f1907_d14e_426f_9f13_dae66dbafe5b(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (a.get( m) == x) {
                return m;
            } else if (a.get( m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_beb20844_f7ee_4e3f_9545_dd31269357b8(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0, r = n - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_02bcbc0e_f2e0_47c7_aece_12e7558feee0(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_78589b61_2ec8_45eb_b296_1885f22ceeb8(ArrayList<Integer> a, int x) {
        int i = 0;
        int j = a.size() - 1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (a.get(mid) < x) {
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_f84cfd1b_d195_4878_b56a_5391d957c0f7(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_2c909bd7_7182_403f_9a23_e335505e459c(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) > x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_5e4c2db9_c389_4f52_8ed5_201af9a6820b(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_9ed02925_6b02_4496_8521_7d80ccd16029(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get( m) == x) {
                return m;
            } else if (a.get( m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_426f1907_d14e_426f_9f13_dae66dbafe5b(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (a.get( m) == x) {
                return m;
            } else if (a.get( m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_c61b37cd_9e10_423d_881b_6a100bff3399(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_c3114250_1782_4a55_b08b_d83c23f54ef3(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_50e4349c_c79a_49fa_9cd9_6691f7144f71(ArrayList<Integer> a, int x) {
        int low = 0;
        int high = a.size() - 1;
        int mid;
        while (low <= high) {
            mid = (low + high) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    
    public static int leftInsertion_Problem_2_31372648_2d71_4109_aa29_53fbb59653cb(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_8ed10174_4dab_448a_b993_68289a8d627d(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_456c3c1c_8508_4583_88e8_c8178ca8a300(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_790e2bfd_4832_4063_8130_5daaeaaab2eb(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_11a4b1c1_8fe2_4452_a453_5312f8bf591c(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_5159133f_6717_4177_8ffe_abc94caab3e2(ArrayList<Integer> a, int x) {
        int lo = 0;
        int hi = a.size() - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (a.get(mid) < x) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return lo;
    }

    
    public static int leftInsertion_Problem_1_c2e5e6e7_6678_4a95_a7ee_acb30b05d028(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_0d30acbe_3d2e_4bac_a332_26f2b7f83435(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0;
        int r = n - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_a9c3da70_9cd3_4810_a102_bcf93a328795(ArrayList<Integer> a, int x) {
        int low = 0, high = a.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }

    
    public static int leftInsertion_Problem_2_b643f026_a4db_4cea_aa3d_8bb658f4b50a(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_9d351df8_a3c8_44d3_b8e9_0f387c22f389(ArrayList<Integer> a, int x) {
        int lo = 0;
        int hi = a.size() - 1;
        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if (a.get(mid) < x) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return lo;
    }

    
    public static int leftInsertion_Problem_0_2ce7fe92_b7b5_4419_a162_cd66a4281117(ArrayList<Integer> a, int x) {
        int i = 0;
        while(i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_b224eb1f_6032_45e0_87a5_a38078030532(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_8bbd239e_1609_486c_b07d_600b410f7af2(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_e99320ad_d7af_4772_876f_7f8f2e7c3324(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_fe967955_80a9_405f_8f0a_1ff0a540dbd4(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) > x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_25ccb5bf_edb7_4762_9d38_8e21a8ea45e4(ArrayList<Integer> a, int x) {
        if (a.size() == 0) return 0;
        if (a.get(0) >= x) return 0;
        if (a.get(a.size() - 1) < x) return a.size();
        int left = 0;
        int right = a.size() - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (a.get(mid) >= x) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    
    public static int leftInsertion_Problem_1_3cef9728_92f5_4a15_aab9_263c7ba377c0(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_86e74ccd_9b69_401a_a2dd_a4aaf3af3f76(ArrayList<Integer> a, int x) {
        int low = 0;
        int high = a.size() - 1;

        while ((low <= high)) {
            int mid = low + (high - low) / 2;
            if (a.get(mid) >= x) low = mid + 1;
            else high = mid - 1;
        }
        return low;
    }

    
    public static int leftInsertion_Problem_2_fcad39f5_3e88_4a8a_98e8_aa526645964a(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_2b16b72e_c120_4f60_b47c_8d019f2715ae(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) >= x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_0607a234_355f_42b6_a67f_1c12c520d09c(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_6fa3108e_45a1_4964_9f98_87aeebe540b5(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_3b32eab2_3ac9_4560_adaa_6f8e360cfd60(ArrayList<Integer> a, int x) {
        // binary search
        int lo = 0;
        int hi = a.size() - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (a.get(mid) < x) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return lo;
    }

    
    public static int leftInsertion_Problem_0_fa6670e4_c426_4f84_bd45_3897d533caf6(ArrayList<Integer> a, int x) {
        int lo = 0;
        int hi = a.size() - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) < x) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return lo;
    }

    
    public static int leftInsertion_Problem_2_81df455d_474b_44e3_83d5_92948ceec0db(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0, r = n - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x)
                return m;
            else if (a.get(m) < x)
                l = m + 1;
            else
                r = m - 1;
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_52c994e3_466d_4c0d_b3eb_e162c8df50ff(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_bd3fa2f1_be0b_4dc8_b2f9_3709ab7b3d5d(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) >= x) {
                r = m;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_41f5071d_430e_43f6_a3fa_f5398bccbffb(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0;
        int r = n - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_0e90249e_c7de_4198_91a3_539267e4d3e0(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_49354172_adf7_48e1_9694_fc398d40f6bc(ArrayList<Integer> a, int x) {
        int i = 0;
        while(i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_f84cfd1b_d195_4878_b56a_5391d957c0f7(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_81bf7b85_b493_4fda_a7dc_2f2e0ef944f7(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get( m) == x) {
                return m;
            } else if (a.get( m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_d0d24fde_ce5f_460c_b638_22ab77162486(ArrayList<Integer> a, int x) {
        int left = 0;
        int right = a.size() - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (a.get(mid) < x) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }

    
    public static int leftInsertion_Problem_1_e742c3e1_3641_4353_a86a_a9f2fa05211c(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_426f1907_d14e_426f_9f13_dae66dbafe5b(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (a.get( m) == x) {
                return m;
            } else if (a.get( m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_a1c8b87a_ff8f_403b_b023_a708d4988e76(ArrayList<Integer> a, int x) {
        if (x < a.get(0)) {
            return 1;
        } else if (x > a.get(a.size()-1)) {
            return a.size()-1;
        } else {
            int low = 0;
            int high = a.size()-1;
            while (low < high) {
                int mid = (low+high)/2;
                if (x < a.get(mid)) {
                    low = mid + 1;
                } else {
                    high = mid;
                }
            }
            return low;
        }
    }

    
    public static int leftInsertion_Problem_2_f598fc21_fa89_441b_a0a7_ccab9d38273b(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get( m) == x) {
                return m;
            } else if (a.get( m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_6b83e411_cb1e_4c93_90e3_e5afa3fef5a8(ArrayList<Integer> a, int x) {
        int i = 0;
        while(i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_cbe42833_f0ce_4742_b20d_0f7143992319(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_b18659c0_a5b1_4fd0_a68f_5dff5cc4008b(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get( m) < x) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_c5f7f99f_14f7_48ee_acf7_2177cdd1e17a(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_ecbeebcd_02ee_4c5c_8fb6_0356603e6ded(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_d6a1f0be_dfbc_40fd_ba45_15b6fe3540a3(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_82af4c3c_f1c4_442b_8ad4_d3df937754fd(ArrayList<Integer> a, int x) {
        // binary search
        int l = 0, r = a.size() - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) >= x) {
                r = m;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_2b94548c_52ab_4211_a2c6_e576487d4d01(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_65c264d5_fcbd_496b_ab26_463b362b7139(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0;
        int r = n - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_8e42ead9_8c68_4d2c_9328_6c65113c6e4c(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_89133432_6ec6_4292_a7f1_d5fd1691aaa8(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_13df4cbf_713a_440d_9b58_50db5de0f665(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_57ac3722_1ff4_4a0b_b620_73f32aa87c91(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_1062165e_72a4_4260_a296_ef010d2e0c2e(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0, r = n - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            }
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_aa576efa_80cd_4a93_bb77_8f3c0c7e665d(ArrayList<Integer> a, int x) {
        int left = 0;
        int right = a.size() - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (a.get( mid) == x) {
                return mid;
            } else if (a.get( mid) > x) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    
    public static int leftInsertion_Problem_1_8019dd26_f99e_4e25_8328_b1357e61686a(ArrayList<Integer> a, int x) {
        int low = 0;
        int high = a.size() - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (x < a.get(mid))
                high = mid - 1;
            else if (x > a.get(mid))
                low = mid + 1;
            else
                return mid;
        }
        return low;
    }

    
    public static int leftInsertion_Problem_1_a7b38517_2dd0_4746_8ce9_f2c32b314e80(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_a1c8b87a_ff8f_403b_b023_a708d4988e76(ArrayList<Integer> a, int x) {
        if (x < a.get(0)) {
            return 1;
        } else if (x > a.get(a.size()-1)) {
            return a.size()-1;
        } else {
            int low = 0;
            int high = a.size()-1;
            while (low < high) {
                int mid = (low+high)/2;
                if (x < a.get(mid)) {
                    low = mid + 1;
                } else {
                    high = mid;
                }
            }
            return low;
        }
    }

    
    public static int leftInsertion_Problem_0_a35941c3_bf07_418c_9692_448aadf52c98(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) > x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_eabab773_c981_43c2_800e_8df50a53bc5c(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_a5a22ea0_d1a9_4a8f_9772_dbb5d8ee4804(ArrayList<Integer> a, int x) {
        int low = 0;
        int high = a.size() - 1;
        int mid = 0;
        while (low <= high) {
            mid = (low + high) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    
    public static int leftInsertion_Problem_0_a163fd6e_c8c4_4f8b_8cb0_8253d152c6a9(ArrayList<Integer> a, int x) {
        int lo = 0;
        int hi = a.size() - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (a.get( mid) < x) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return lo;
    }

    
    public static int leftInsertion_Problem_1_41f5071d_430e_43f6_a3fa_f5398bccbffb(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0;
        int r = n - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_c24f1f85_fc33_43bf_b45b_0f45f61e4e32(ArrayList<Integer> a, int x) {
        int i = 0;
        while(i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_0691d7c0_1999_40c0_9284_f79be957086f(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0, r = n - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) >= x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_3b32eab2_3ac9_4560_adaa_6f8e360cfd60(ArrayList<Integer> a, int x) {
        // binary search
        int lo = 0;
        int hi = a.size() - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (a.get(mid) < x) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return lo;
    }

    
    public static int leftInsertion_Problem_1_c6b3a682_4945_4012_a016_ab1a49d3611e(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_31372648_2d71_4109_aa29_53fbb59653cb(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_bc99e938_35db_4ac1_ad6b_0d4fd622b8a0(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_022459b5_c70a_4cdc_93a4_1d73287d1114(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) < x)
                l = m + 1;
            else
                r = m;
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_a163fd6e_c8c4_4f8b_8cb0_8253d152c6a9(ArrayList<Integer> a, int x) {
        int lo = 0;
        int hi = a.size() - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (a.get( mid) < x) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return lo;
    }

    
    public static int leftInsertion_Problem_2_1829883e_0b9c_40dc_bb6b_8d6eedec0fb0(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size()-1;
        while (l <= r) {
            int m = l + (r-l)/2;
            if (a.get(m) == x) {
                return m;
            }
            if (a.get(m) > x) {
                r = m-1;
            } else {
                l = m+1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_0f8406a7_d192_4aba_ac08_366535be7615(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            }
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_9747a05e_5677_4b7f_b98a_73fcd594240a(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_5d6869a4_3c0c_4232_92e0_0107b72740fa(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_179ee06a_4fae_4d6c_96aa_fe3210962acf(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_179ee06a_4fae_4d6c_96aa_fe3210962acf(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_c152721a_5711_4791_911f_34fc1a5c7ee2(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_0d02f193_9cfd_4c79_b5df_1bc897bec614(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (a.get(m) >= x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_7ad1eb0d_a61d_4ea9_867d_f55803c4150e(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_86e74ccd_9b69_401a_a2dd_a4aaf3af3f76(ArrayList<Integer> a, int x) {
        int low = 0;
        int high = a.size() - 1;

        while ((low <= high)) {
            int mid = low + (high - low) / 2;
            if (a.get(mid) >= x) low = mid + 1;
            else high = mid - 1;
        }
        return low;
    }

    
    public static int leftInsertion_Problem_0_6fcbf03a_2172_4371_97a8_a1c73457d16e(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            }
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_4af41461_3e11_4527_852a_1de37f7839a7(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0, r = n - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_486c5805_a826_4a95_8009_4a17d4aea2da(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_4206dff5_c56d_47a2_bae1_e84de4d08590(ArrayList<Integer> a, int x) {
        int start = 0;
        int end = a.size() - 1;
        int mid = (start + end) / 2;
        while (start <= end && a.get(mid) < x) {
            if(a.get(mid) == x) {
                return mid;
            }
            if(a.get(mid) > x) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
            mid = (start + end) / 2;
        }
        return -1;
    }

    
    public static int leftInsertion_Problem_0_d7fa4ee7_f424_4329_b39e_e2c165148d67(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_dc2ebb02_4337_4b53_b3ae_213ee340d9c7(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_6a2cb328_09db_4b15_88a5_4d701ee4ab42(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_b1cc5cc3_1801_4bc9_b4d9_6c6273295ed3(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_2907dd53_5c21_4c41_accb_115697f62476(ArrayList<Integer> a, int x) {
        // Write your code here
        int low = 0;
        int high = a.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (a.get( mid) == x) {
                return mid;
            } else if (a.get( mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    
    public static int leftInsertion_Problem_1_e971a812_5c7b_4675_aab3_16d935ac70a3(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0, r = n - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (a.get(mid) < x) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_0d02f193_9cfd_4c79_b5df_1bc897bec614(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (a.get(m) >= x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_4c59c2e1_e99d_495b_913d_c4a1fb3b71fd(ArrayList<Integer> a, int x) {
        int pos = -1;
        for(int i = 0; i <= a.size(); i++){
            if(a.get(i) == x){
                pos = i;
                break;
            }
        }
        if(pos == -1){
            return -1;
        }
        return pos;
    }

    
    public static int leftInsertion_Problem_2_0607a234_355f_42b6_a67f_1c12c520d09c(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_882322fe_a767_456f_9049_d29e30278111(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_5cfa0bf6_b75c_4888_9217_471598ef73e1(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l < r) {
            int mid = (l + r) / 2;
            if (a.get(mid) < x) {
                l = mid + 1;
            } else {
                r = mid;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_c8a05570_d3d1_47b4_8f5c_e3b6dd5ebb32(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_81bf7b85_b493_4fda_a7dc_2f2e0ef944f7(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get( m) == x) {
                return m;
            } else if (a.get( m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_33c19768_9da3_440c_8466_b7462ea61e88(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_a89d2b01_cab7_4a53_b6fb_0b62bc6db8b1(ArrayList<Integer> a, int x) {
        int index = Collections.binarySearch(a, x);
        if (index < 0) {
            return -(index + 1);
        } else {
            return index;
        }
    }

    
    public static int leftInsertion_Problem_2_c2e5e6e7_6678_4a95_a7ee_acb30b05d028(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_e41b21a0_f9f3_46da_9fab_c50dc3759fcd(ArrayList<Integer> a, int x) {
        // Write - Your - Code
        int start = 0;
        int end = a.size() - 1;
        int mid = 0;
        while (start <= end) {
            mid = (start + end) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) < x) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return start;
    }

    
    public static int leftInsertion_Problem_2_52e00d42_0c54_45fd_9f61_b33a3ea7d6cf(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_527d7b71_d79b_4152_bd3f_52e6cab0f705(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) > x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_1a5a5f55_3990_49b6_8127_fa4b28c680ea(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            }
            if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_4c59c2e1_e99d_495b_913d_c4a1fb3b71fd(ArrayList<Integer> a, int x) {
        int pos = -1;
        for(int i = 0; i <= a.size(); i++){
            if(a.get(i) == x){
                pos = i;
                break;
            }
        }
        if(pos == -1){
            return -1;
        }
        return pos;
    }

    
    public static int leftInsertion_Problem_0_2ce7fe92_b7b5_4419_a162_cd66a4281117(ArrayList<Integer> a, int x) {
        int i = 0;
        while(i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_b9404433_b011_41a3_bcf6_798caf99830d(ArrayList<Integer> a, int x) {
        // Write - Your - Code
        int low = 0;
        int high = a.size() - 1;
        int mid = 0;
        while (low <= high) {
            mid = (low + high) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }

    
    public static int leftInsertion_Problem_0_ee9e87f0_5569_4b3d_b804_dddac9656953(ArrayList<Integer> a, int x) {
        int i = 0;
        while(i < a.size() && x <= a.get(i)) {
            i++;
        }
        if (i == a.size())
            return a.size() - 1;
        return i;
    }

    
    public static int leftInsertion_Problem_2_8e42ead9_8c68_4d2c_9328_6c65113c6e4c(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_aad14374_3139_40f4_b04b_f26645340f4d(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_e677199c_5ee0_48fe_900c_cf7d680552f2(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get( m) == x) {
                return m;
            } else if (a.get( m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_41bdc8aa_6ff0_4138_b19b_0e5ea59ca404(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_ade993e9_8413_4c55_a2bf_1b84f50c39ba(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_98685c02_daee_4da0_8ecc_b3f3813a134c(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while(l <= r) {
            int m = (l + r) / 2;
            if(a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_9279a6b2_a024_47d6_b761_129747f087d5(ArrayList<Integer> a, int x) {
        int left = 0;
        int right = a.get(0); // get first element
        while (right < a.size() - 1) { // while right is less than the size of the array
            if (x <= right) { // if x is less than right
                left = right + 1; // set left to the right plus one
            } else { // if x is greater than right
                left = right - 1; // set left to the right minus one
            }
            right++; // increment right
        }
        return left; // return the left insertion point
    }

    
    public static int leftInsertion_Problem_0_5edde7b0_e007_4123_984c_0c841346a8c8(ArrayList<Integer> a, int x) {
        int i = 0;
        for (; i < a.size(); i++) {
            if (a.get(i) < x) {
                break;
            }
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_c42c2188_52d0_4126_9340_237234269af2(ArrayList<Integer> a, int x) {
        int i = 0;
        while(i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_edebeb89_35df_4168_93f8_502c6cf830bd(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get( m) == x) {
                return m;
            } else if (a.get( m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_f1081771_fadd_41b0_8bd3_eda138970ba9(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_5e4b4185_8562_46b7_96d1_ecbfc49d56a9(ArrayList<Integer> a, int x) {
        int low = 0;
        int high = a.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }

    
    public static int leftInsertion_Problem_2_c4769b62_fee5_45b6_aa65_8b137638f40d(ArrayList<Integer> a, int x) {
        int i = 0;
        while(i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_4144302d_b83c_4d67_a075_8d3aa6677a63(ArrayList<Integer> a, int x) {
        int low = 0, high = a.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (a.get( mid) == x) {
                return mid;
            } else if (a.get( mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    
    public static int leftInsertion_Problem_0_65c62366_44d0_48cb_8f30_ba1fe73f032a(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_1664502f_9e79_428d_a597_7ddc6631ee70(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_2b16b72e_c120_4f60_b47c_8d019f2715ae(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) >= x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_ce868931_5b04_4371_a974_8ab76d99ff83(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) < x) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_1b6255e6_d4a0_4c1b_bf0d_fd53a24065b2(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_7bab89c2_ffc0_44b6_904c_985bfa58e6bb(ArrayList<Integer> a, int x) {
        int lo = 0;
        int hi = a.size() - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (a.get(mid) < x) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return lo;
    }

    
    public static int leftInsertion_Problem_1_fd5de8dc_73e1_4464_b3c3_9bcddd342928(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_a971de80_bbac_4e81_8685_8d68a04c4bfd(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_3a9f8029_3b97_436d_a929_ee0ba2b69319(ArrayList<Integer> a, int x) {
        int left = 0;
        int right = a.size() - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) < x) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }

    
    public static int leftInsertion_Problem_1_15e5dfde_6140_4e2f_be61_88d4d0840b5b(ArrayList<Integer> a, int x) {
        int lo = 0;
        int hi = a.size() - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (x <= a.get(mid)) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return lo;
    }

    
    public static int leftInsertion_Problem_2_9d351df8_a3c8_44d3_b8e9_0f387c22f389(ArrayList<Integer> a, int x) {
        int lo = 0;
        int hi = a.size() - 1;
        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if (a.get(mid) < x) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return lo;
    }

    
    public static int leftInsertion_Problem_2_78cc098c_ba5c_42d7_82b2_eef84cdc17e3(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_5fbab564_9ac3_4e0d_a7e2_1b1eb6a38610(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_6fa82fca_7079_4451_a9b5_2aa288483761(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_7a15de1e_f016_4e32_8d99_f47084f3aeef(ArrayList<Integer> a, int x) {
        int i = 0;
        int j = a.size() - 1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (a.get(mid) < x) {
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_a01a6672_faf8_4571_8ebe_12a24b13f56b(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_97311d2f_5b27_4f2b_ab81_94fde705e673(ArrayList<Integer> a, int x) {
        int lo = 0, hi = a.size() - 1;
        while (lo < hi) {
            int mid = (lo + hi) / 2;
            if (a.get(mid) < x) lo = mid + 1;
            else hi = mid;
        }
        return lo;
    }

    
    public static int leftInsertion_Problem_0_0af0df10_2fbf_44cc_8db5_84fe34b0e510(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0, r = n - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (a.get(mid) >= x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_0e90249e_c7de_4198_91a3_539267e4d3e0(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_c9a4991f_efe4_463e_bf46_69fa30097832(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0, r = n - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_d9395b4e_081d_4880_b952_c5c8435ae62c(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) < x) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_94647665_c92d_4e1d_a8fa_1e05ef3eb636(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0, r = n - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_61ef73a5_6f7b_45b7_8b85_6ef2db877eef(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_7809c37a_117d_4825_9275_40434ac0544c(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) > x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_7d68b3e3_9ef4_4a92_9906_8b430c681643(ArrayList<Integer> a, int x) {
        int left = 0;
        int right = a.size() - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) > x) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    
    public static int leftInsertion_Problem_0_022459b5_c70a_4cdc_93a4_1d73287d1114(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) < x)
                l = m + 1;
            else
                r = m;
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_61ef73a5_6f7b_45b7_8b85_6ef2db877eef(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_f02358d4_3da7_4243_8f4d_c924963a665a(ArrayList<Integer> a, int x) {
        int low = 0;
        int high = a.size() - 1;
        int mid = 0;
        while (low <= high) {
            mid = (low + high) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    
    public static int leftInsertion_Problem_0_f868728a_ba36_4780_8626_35120d1e33ef(ArrayList<Integer> a, int x) {
        int lo = 0;
        int hi = a.size() - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (a.get(mid) < x) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return lo;
    }

    
    public static int leftInsertion_Problem_2_3cef9728_92f5_4a15_aab9_263c7ba377c0(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_133d3cc9_609c_47bf_9d48_92091b169908(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0, r = n - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_e677199c_5ee0_48fe_900c_cf7d680552f2(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get( m) == x) {
                return m;
            } else if (a.get( m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_ff0a3b3e_b7c5_4523_8121_5af97a2c8e8a(ArrayList<Integer> a, int x) {
        int lo = 0;
        int hi = a.size() - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (a.get(mid) < x) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return lo;
    }

    
    public static int leftInsertion_Problem_1_ee9e87f0_5569_4b3d_b804_dddac9656953(ArrayList<Integer> a, int x) {
        int i = 0;
        while(i < a.size() && x <= a.get(i)) {
            i++;
        }
        if (i == a.size())
            return a.size() - 1;
        return i;
    }

    
    public static int leftInsertion_Problem_0_b38bf438_d39c_46ed_b6ae_87a73ca73eea(ArrayList<Integer> a, int x) {
        int lo = 0;
        int hi = a.size() - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (x == a.get(mid)) {
                return mid;
            } else if (x < a.get(mid)) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return lo;
    }

    
    public static int leftInsertion_Problem_2_64dd69ad_dc5e_4f7c_8a13_0ed46602d22a(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_9726315d_159b_469a_bde8_a204c0939e30(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_11a4b1c1_8fe2_4452_a453_5312f8bf591c(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_3d308fbc_1b89_4caf_a0a8_25e20558e9e5(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_7fc61827_c3fe_45de_88e6_44e34d9f902b(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_f0395f92_37b7_452c_9568_393dd650a98c(ArrayList<Integer> a, int x) {
        int lo = 0;
        int hi = a.size() - 1;
        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if (a.get(mid) < x) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return lo;
    }

    
    public static int leftInsertion_Problem_1_871cef1a_575e_4d94_b540_0fbf071f9722(ArrayList<Integer> a, int x) {
        int i;
        int pos = 0;
        for (i = 1; i < a.size(); i++) {
            if (x < a.get(i)) {
                pos = i;
                break;
            } else if (x == a.get(i)) {
                pos = i;
                break;
            }
        }
        if (pos != 0) {
            for (i = 0; i < a.size(); i++) {
                if (x > a.get(i)) {
                    pos = i;
                    break;
                }
            }
        }
        if (pos == 0) {
            for (i = 0; i < a.size(); i++) {
                if (x < a.get(i)) {
                    pos = i;
                    break;
                }
            }
        }
        return pos;
    }

    
    public static int leftInsertion_Problem_0_e7f826c8_9df5_4749_b6e7_d66dfb3ec072(ArrayList<Integer> a, int x) {
        int low = 0;
        int high = a.size() - 1;
        int mid;
        while (low <= high) {
            mid = (low + high) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }

    
    public static int leftInsertion_Problem_2_98685c02_daee_4da0_8ecc_b3f3813a134c(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while(l <= r) {
            int m = (l + r) / 2;
            if(a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_31dccf97_1853_4650_a739_1d44acb22f95(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0, r = n - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_1aeee9f7_9124_4ca0_8578_21ab4d6064be(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (a.get(m) >= x)
                r = m - 1;
            else
                l = m + 1;
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_c42c2188_52d0_4126_9340_237234269af2(ArrayList<Integer> a, int x) {
        int i = 0;
        while(i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_b78a73f0_494a_402a_873d_d1a471528ad3(ArrayList<Integer> a, int x) {
        int left = 0;
        int right = a.get(0); // get first element of array
        while (right < a.size() - 1) { // while right is less than the size of the array
            if (x <= right) { // if x is less than the right element
                left++;
                right++;
            } else { // if x is greater than the right element
                right++;
            }
        }
        return left;
    }

    
    public static int leftInsertion_Problem_2_cb5ad0e1_7545_43ff_b634_060b300f7769(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_a0329f65_8e1b_4f2b_b379_f6837ff99a32(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_a948f7c7_85ac_4906_a8cb_e978aaa09373(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_b17e7d54_6848_47b3_a2e8_8bcb98b6b214(ArrayList<Integer> a, int x) {
        int low = 0;
        int high = a.size() - 1;
        int mid = 0;
        while (low <= high) {
            mid = (low + high) / 2;
            if (x > a.get(mid)) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }

    
    public static int leftInsertion_Problem_1_00287734_281c_4588_a0de_3f5fade38476(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_56fa580b_9e9c_489f_b9f1_bedf175234b6(ArrayList<Integer> a, int x) {
        int low = 0;
        int high = a.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (a.get(mid) == x) {
                return mid;
            }
            if (a.get(mid) > x) {
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }
        return low;
    }

    
    public static int leftInsertion_Problem_2_0607a234_355f_42b6_a67f_1c12c520d09c(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_acc6f6de_9165_4571_8b7e_5b3488a9c0a7(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_ec7e8ea0_99c8_4c43_8d75_285dad869966(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_50289cff_8f6f_4f66_a771_292c0003c4c7(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0, r = n - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) return m;
            if (a.get(m) > x) r = m - 1;
            else l = m + 1;
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_f6bfb32c_c739_4d5c_859b_758280c91f0c(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_5d7f8d2b_30d7_4390_80bd_ce917c848ad2(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_9cdf7a58_951f_4507_b9b8_cccb5481d949(ArrayList<Integer> a, int x) {
        int left = 0;
        while (left < a.size() && x > a.get(left)) {
            left++;
        }
        return left;
    }

    
    public static int leftInsertion_Problem_0_264ecdf8_4d30_41c3_9b66_b1f5fa997dbb(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_25ccb5bf_edb7_4762_9d38_8e21a8ea45e4(ArrayList<Integer> a, int x) {
        if (a.size() == 0) return 0;
        if (a.get(0) >= x) return 0;
        if (a.get(a.size() - 1) < x) return a.size();
        int left = 0;
        int right = a.size() - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (a.get(mid) >= x) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    
    public static int leftInsertion_Problem_1_c0bb1ad5_686b_4593_9ac3_eab62c22cb5d(ArrayList<Integer> a, int x) {
        if (a.size() == 0) return 0;
        int lo = 0;
        int hi = a.size() - 1;
        while (lo < hi) {
            int mid = (lo + hi) / 2;
            if (a.get(mid) < x) {
                lo = mid + 1;
            } else {
                hi = mid;
            }
        }
        return lo;
    }

    
    public static int leftInsertion_Problem_2_fab0a78e_11a9_4c6d_9145_a0a14a41ac2b(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_b643f026_a4db_4cea_aa3d_8bb658f4b50a(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_c2b27b3d_5629_46a8_8797_c22a0e8cf9fc(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_5778df42_e845_484a_bac9_1d454ff642e1(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_201d07b0_6453_45a0_ac73_0b6bdfaa9f02(ArrayList<Integer> a, int x) {
        int low = 0;
        int high = a.size() - 1;

        while (low <= high) {
            int mid = low + ((high - low) / 2);

            if (x < a.get(mid)) {
                high = mid - 1;
            } else if (x > a.get(mid)) {
                low = mid + 1;
            } else {
                return mid;
            }
        }

        return -1;
    }

    
    public static int leftInsertion_Problem_1_b0183ac7_a71b_4a70_8f07_4552bd400e3d(ArrayList<Integer> a, int x) {
        int l = 0;
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) < x) {
                l++;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_608d5fee_733f_4cc1_b2de_ffeb2decb5ea(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0;
        int r = n - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_f9886055_d6fb_4e30_8544_17c82c63b5cf(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_201d07b0_6453_45a0_ac73_0b6bdfaa9f02(ArrayList<Integer> a, int x) {
        int low = 0;
        int high = a.size() - 1;

        while (low <= high) {
            int mid = low + ((high - low) / 2);

            if (x < a.get(mid)) {
                high = mid - 1;
            } else if (x > a.get(mid)) {
                low = mid + 1;
            } else {
                return mid;
            }
        }

        return -1;
    }

    
    public static int leftInsertion_Problem_1_02bcbc0e_f2e0_47c7_aece_12e7558feee0(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_2300c325_df95_44ec_84a6_66ca08551624(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_201d07b0_6453_45a0_ac73_0b6bdfaa9f02(ArrayList<Integer> a, int x) {
        int low = 0;
        int high = a.size() - 1;

        while (low <= high) {
            int mid = low + ((high - low) / 2);

            if (x < a.get(mid)) {
                high = mid - 1;
            } else if (x > a.get(mid)) {
                low = mid + 1;
            } else {
                return mid;
            }
        }

        return -1;
    }

    
    public static int leftInsertion_Problem_1_067837af_4d21_45bf_960d_a8c53d586f96(ArrayList<Integer> a, int x) {
        int i = 0;
        while(i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_7fd69580_0e6c_4b52_a662_0dbcfb61fdce(ArrayList<Integer> a, int x) {
        int i = 0;
        int j = a.size() - 1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) < x) {
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_dbeea9a7_1de2_42f7_b525_fc46281701d5(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_6c4a8209_59ec_4377_8ee7_0842e4a2e53f(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0, r = n - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) > x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_00772111_d73d_423b_b4e8_1ca1adf7d6c2(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0;
        int r = n - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_d0a49e29_2d39_4a80_b08c_b2925995ca34(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size();
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) >= x) {
                r = m;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_dfa5cf75_26bd_44c6_9d2b_cd641ef3e45c(ArrayList<Integer> a, int x) {
        int low = 0;
        int high = a.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }

    
    public static int leftInsertion_Problem_1_64dd69ad_dc5e_4f7c_8a13_0ed46602d22a(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_5a9d75ce_5abf_4aa9_9b7c_936a4c20ff78(ArrayList<Integer> a, int x) {
        int low = 0;
        int high = a.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }

    
    public static int leftInsertion_Problem_1_2ce7fe92_b7b5_4419_a162_cd66a4281117(ArrayList<Integer> a, int x) {
        int i = 0;
        while(i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_bd63f70c_0abf_4059_9113_776ffc5bc4e1(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0;
        int r = n - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) >= x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_4af40a06_7938_4226_811b_464b0a6581e3(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_ec7e8ea0_99c8_4c43_8d75_285dad869966(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_e8d7b364_9a47_4764_b873_efbc5e9a58dc(ArrayList<Integer> a, int x) {
        int low = 0; int high = a.size()-1;
        while (low<=high) {
            int mid = (low+high)/2;
            if (a.get(mid)>=x) {
                high = mid -1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    
    public static int leftInsertion_Problem_0_8bbd239e_1609_486c_b07d_600b410f7af2(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_4631e12b_81e2_47db_9372_dfdabbc13862(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_782fb18c_bd74_487d_8150_e875ac85e56e(ArrayList<Integer> a, int x) {
        int i = 0;
        int j = a.size() - 1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) < x) {
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_f84cfd1b_d195_4878_b56a_5391d957c0f7(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_10121dec_98b8_477c_b3d1_f3bbc6f8751c(ArrayList<Integer> a, int x) {
        int lo = 0;
        int hi = a.size() - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) < x) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return lo;
    }

    
    public static int leftInsertion_Problem_0_b8ddce07_d84d_450b_acfd_8dbb76bc80c4(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l < r) {
            int mid = (l + r) / 2;
            if (a.get(mid) < x) {
                l = mid + 1;
            } else {
                r = mid;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_c3114250_1782_4a55_b08b_d83c23f54ef3(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_a7ec39d4_dec1_419c_b0ac_1492c368eeab(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_7766f85f_e95e_4c99_ae76_5302d3aaa176(ArrayList<Integer> a, int x) {
        int low = 0;
        int high = a.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (a.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }

    
    public static int leftInsertion_Problem_2_4013f215_73b2_444b_85fc_7694b38f7ddf(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_1664502f_9e79_428d_a597_7ddc6631ee70(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_65c62366_44d0_48cb_8f30_ba1fe73f032a(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_cd163849_bc08_4330_ae97_1a88fccbbbe1(ArrayList<Integer> a, int x) {
        int i = 0;
        int j = a.size() - 1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) < x) {
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_dbeea9a7_1de2_42f7_b525_fc46281701d5(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_4737e315_7dcd_4721_89c8_b68c3c98d904(ArrayList<Integer> a, int x) {
        return a.indexOf(x);
    }

    
    public static int leftInsertion_Problem_1_3f129c66_e71e_43e3_bc7f_3e27511fcf1e(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0;
        int r = n - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_9d86c068_8644_416c_8802_1a681da1cee5(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_6c457338_8d04_4bf4_9be1_f3c27c5543eb(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_5fbab564_9ac3_4e0d_a7e2_1b1eb6a38610(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_8dc291a2_27ec_4068_a4f7_79bf9adca68e(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) > x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_f0395f92_37b7_452c_9568_393dd650a98c(ArrayList<Integer> a, int x) {
        int lo = 0;
        int hi = a.size() - 1;
        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if (a.get(mid) < x) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return lo;
    }

    
    public static int leftInsertion_Problem_1_d07bbe78_2e47_469b_ae2a_215b9090daab(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_fca8b5de_7e62_4f67_aebf_220ea858b322(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0, r = n - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_c9a4991f_efe4_463e_bf46_69fa30097832(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0, r = n - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_acc6f6de_9165_4571_8b7e_5b3488a9c0a7(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_29adf24e_65b2_4b7e_b836_8795efc8bc73(ArrayList<Integer> a, int x) {
        int i =  Math.floor(a.size()/2.0);
        while(i >= 0 && a.get(i) <= x) i--;
        return i+1;
    }

    
    public static int leftInsertion_Problem_2_ff16babc_5071_4526_82cc_9590a3d25c82(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_e41b21a0_f9f3_46da_9fab_c50dc3759fcd(ArrayList<Integer> a, int x) {
        // Write - Your - Code
        int start = 0;
        int end = a.size() - 1;
        int mid = 0;
        while (start <= end) {
            mid = (start + end) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) < x) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return start;
    }

    
    public static int leftInsertion_Problem_0_ab789545_a81c_4444_9cb9_be44d4fb7b5f(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_73ce71ac_83ec_4955_8c82_3e990a65c941(ArrayList<Integer> a, int x) {
        int lo = 0;
        int hi = a.size() - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) > x) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return lo;
    }

    
    public static int leftInsertion_Problem_0_e7f826c8_9df5_4749_b6e7_d66dfb3ec072(ArrayList<Integer> a, int x) {
        int low = 0;
        int high = a.size() - 1;
        int mid;
        while (low <= high) {
            mid = (low + high) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }

    
    public static int leftInsertion_Problem_2_2c9a81e0_732f_4fe8_adbd_b347b08e50f5(ArrayList<Integer> a, int x) {
        int left = 0;
        int right = a.size() - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) < x) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }

    
    public static int leftInsertion_Problem_0_9d351df8_a3c8_44d3_b8e9_0f387c22f389(ArrayList<Integer> a, int x) {
        int lo = 0;
        int hi = a.size() - 1;
        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if (a.get(mid) < x) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return lo;
    }

    
    public static int leftInsertion_Problem_0_f7d323f9_0f40_48cd_8222_6f5479ce61f4(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0, r = n - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) < x) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_2e781554_f4d1_443f_8818_5d4103a4cb2b(ArrayList<Integer> a, int x) {
        int lo = 0;
        int hi = a.size() - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) > x) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return lo;
    }

    
    public static int leftInsertion_Problem_1_1325f5ac_efa8_4fa6_8de1_36380ff96f7d(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_b00c20e5_60d5_4a5a_a5ee_10ec4db618ed(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0, r = n - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_696be341_b04c_47a6_a429_151883d213cc(ArrayList<Integer> a, int x) {
        int i = 0;
        while(i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_e13c5b83_2890_4797_bf83_d05a873cf032(ArrayList<Integer> a, int x) {
        int low = 0;
        int high = a.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    
    public static int leftInsertion_Problem_0_449e8895_0f78_45ae_ae30_e027385b72a5(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_0d30acbe_3d2e_4bac_a332_26f2b7f83435(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0;
        int r = n - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_68dec6d2_edce_4b0e_a40e_1511129d331e(ArrayList<Integer> a, int x) {
        int i = 0;
        int j = 1;
        for(; i < a.size(); i++) {
            if(a.get(i) > x) {
                if(a.get(j) > x) {
                    j++;
                } else {
                    return j;
                }
            } else {
                break;
            }
        }
        j++;
        for(; i < a.size(); i++) {
            if(a.get(i) <= x) {
                return i;
            }
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_a89d2b01_cab7_4a53_b6fb_0b62bc6db8b1(ArrayList<Integer> a, int x) {
        int index = Collections.binarySearch(a, x);
        if (index < 0) {
            return -(index + 1);
        } else {
            return index;
        }
    }

    
    public static int leftInsertion_Problem_0_ff2cfd3e_ac6d_4f72_99f2_246338ae243b(ArrayList<Integer> a, int x) {
        int lo = 0;
        int hi = a.size() - 1;
        while (lo < hi) {
            int mid = (lo + hi) / 2;
            if (a.get(mid) < x) {
                lo = mid + 1;
            } else {
                hi = mid;
            }
        }
        return lo;
    }

    
    public static int leftInsertion_Problem_0_797300fb_5a1d_405e_8e6d_3e9bfaa6677c(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_49d71936_6f07_46f6_9a6d_a539d9e5b9f2(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0;
        int r = n - 1;
        while (l < r) {
            int m = l + (r - l) / 2;
            if (a.get(m) >= x) {
                r = m;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_d8b83826_285c_4575_8232_fd268d53ba42(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_022459b5_c70a_4cdc_93a4_1d73287d1114(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) < x)
                l = m + 1;
            else
                r = m;
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_81734291_3a05_4c5a_9052_75c8378119d4(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_68dec6d2_edce_4b0e_a40e_1511129d331e(ArrayList<Integer> a, int x) {
        int i = 0;
        int j = 1;
        for(; i < a.size(); i++) {
            if(a.get(i) > x) {
                if(a.get(j) > x) {
                    j++;
                } else {
                    return j;
                }
            } else {
                break;
            }
        }
        j++;
        for(; i < a.size(); i++) {
            if(a.get(i) <= x) {
                return i;
            }
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_52e00d42_0c54_45fd_9f61_b33a3ea7d6cf(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_ae528a80_1758_48d4_8e39_20986e6e4e1b(ArrayList<Integer> a, int x) {
        int i = 0;
        int j = a.size() - 1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (a.get(mid) < x) {
                i = mid + 1;
            } else if (a.get(mid) > x) {
                j = mid - 1;
            } else {
                return mid;
            }
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_b33e4a78_57cb_4fda_ad81_eb58f3d689a0(ArrayList<Integer> a, int x) {
        int low = 0;
        int high = a.size() - 1;
        int mid = 0;

        while (low <= high) {
            mid = (low + high) / 2;

            if (a.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }

        return mid + 1; // if mid > high, then it means x was present at the end
    }

    
    public static int leftInsertion_Problem_1_ff16babc_5071_4526_82cc_9590a3d25c82(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_2f41f48c_0293_4161_b8d6_5e35e6445e31(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_ce868931_5b04_4371_a974_8ab76d99ff83(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) < x) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_7d68b3e3_9ef4_4a92_9906_8b430c681643(ArrayList<Integer> a, int x) {
        int left = 0;
        int right = a.size() - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) > x) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    
    public static int leftInsertion_Problem_0_7bab8a00_bbc1_4f7d_817e_684bcb5b0a9c(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) > x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_099747d7_4a29_4610_b3e2_202848e425b0(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get( m) == x) {
                return m;
            } else if (a.get( m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_e062551a_3ca6_4551_8ceb_e0d9202b7b40(ArrayList<Integer> a, int x) {
        if (a.size() == 0) return 0;
        int l = 0, r = a.size() - 1;
        while (l < r) {
            int mid = (l + r) / 2;
            if (a.get(mid) < x) l = mid + 1;
            else r = mid;
        }
        return a.get(l) >= x ? l : l + 1;
    }

    
    public static int leftInsertion_Problem_1_3101a680_a72f_46f9_ae8e_eac9a73caf2a(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get( m) == x) {
                return m;
            } else if (a.get( m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_52c994e3_466d_4c0d_b3eb_e162c8df50ff(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_d6f097b6_040d_4956_961a_a9d571ad51d3(ArrayList<Integer> a, int x) {
        return -1; // TODO: implement this function
    }

    
    public static int leftInsertion_Problem_2_ff2cfd3e_ac6d_4f72_99f2_246338ae243b(ArrayList<Integer> a, int x) {
        int lo = 0;
        int hi = a.size() - 1;
        while (lo < hi) {
            int mid = (lo + hi) / 2;
            if (a.get(mid) < x) {
                lo = mid + 1;
            } else {
                hi = mid;
            }
        }
        return lo;
    }

    
    public static int leftInsertion_Problem_1_4c59c2e1_e99d_495b_913d_c4a1fb3b71fd(ArrayList<Integer> a, int x) {
        int pos = -1;
        for(int i = 0; i <= a.size(); i++){
            if(a.get(i) == x){
                pos = i;
                break;
            }
        }
        if(pos == -1){
            return -1;
        }
        return pos;
    }

    
    public static int leftInsertion_Problem_1_bf486a86_69fa_4b23_835b_9f970b39cb94(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_86e74ccd_9b69_401a_a2dd_a4aaf3af3f76(ArrayList<Integer> a, int x) {
        int low = 0;
        int high = a.size() - 1;

        while ((low <= high)) {
            int mid = low + (high - low) / 2;
            if (a.get(mid) >= x) low = mid + 1;
            else high = mid - 1;
        }
        return low;
    }

    
    public static int leftInsertion_Problem_0_df6aa422_f51e_45d8_85de_daceb4326025(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_c6b3a682_4945_4012_a016_ab1a49d3611e(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_8036ca2f_4c66_4ce3_820b_e31cc78b5df5(ArrayList<Integer> a, int x) {
        int left = 0;
        int right = a.size() - 1;
        while (left < right) {
            int mid = (left + right) / 2;
            if (a.get(mid) < x) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }

    
    public static int leftInsertion_Problem_0_0bd088c1_7ffd_4ba4_975f_ec61983227ad(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) > x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_8859698a_5414_4583_85d9_3d80ff20b74e(ArrayList<Integer> a, int x) {
        int lo = 0;
        int hi = a.size() - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) > x) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return lo;
    }

    
    public static int leftInsertion_Problem_0_fade40ef_beff_4e7a_b8b4_7b0219cf9f0b(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_38a03503_959a_4f16_a507_a4b93990aded(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_b1d3d340_83d1_4f47_b248_a0599277e073(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) > x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_8e42ead9_8c68_4d2c_9328_6c65113c6e4c(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_842de59c_893b_4be7_8045_dd5c127aab9e(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0, r = n - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_00287734_281c_4588_a0de_3f5fade38476(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_56fa580b_9e9c_489f_b9f1_bedf175234b6(ArrayList<Integer> a, int x) {
        int low = 0;
        int high = a.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (a.get(mid) == x) {
                return mid;
            }
            if (a.get(mid) > x) {
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }
        return low;
    }

    
    public static int leftInsertion_Problem_1_1743e432_2f17_4b8b_92e5_9b50494b0b79(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_2b94548c_52ab_4211_a2c6_e576487d4d01(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_8bbd239e_1609_486c_b07d_600b410f7af2(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_7bab89c2_ffc0_44b6_904c_985bfa58e6bb(ArrayList<Integer> a, int x) {
        int lo = 0;
        int hi = a.size() - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (a.get(mid) < x) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return lo;
    }

    
    public static int leftInsertion_Problem_2_03159ca5_1694_45d0_96a6_be4526f0fa74(ArrayList<Integer> a, int x) {
        int low = 0;
        int high = a.size() - 1;
        int mid = 0;
        while (low < high) {
            mid = (low + high) / 2;
            if (a.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }

    
    public static int leftInsertion_Problem_2_182dc868_a1c6_461d_bfd8_1465cfdaf0ea(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_dbeea9a7_1de2_42f7_b525_fc46281701d5(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_4594895a_c033_4701_ba2b_7f8e9cd4ea2f(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_fa6670e4_c426_4f84_bd45_3897d533caf6(ArrayList<Integer> a, int x) {
        int lo = 0;
        int hi = a.size() - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) < x) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return lo;
    }

    
    public static int leftInsertion_Problem_0_182dc868_a1c6_461d_bfd8_1465cfdaf0ea(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_7f07d246_ee01_46b8_a225_3df7ead4ac31(ArrayList<Integer> a, int x) {
        int i = 0;
        while(i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_067fda54_a864_4af7_b106_74d3b3d68937(ArrayList<Integer> a, int x) {
        int i = 0;
        while(i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_beb20844_f7ee_4e3f_9545_dd31269357b8(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0, r = n - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_264ecdf8_4d30_41c3_9b66_b1f5fa997dbb(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_ea2a6024_4a4f_407e_b4b6_11e2a8c62668(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            }
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_00482753_a6a1_4b38_a896_7737d625bd86(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_1ca1eac9_d305_42d3_b869_508c53246821(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0;
        int r = n - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_6a90d2c2_55c9_483a_a27c_a598f975c24b(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_2f41f48c_0293_4161_b8d6_5e35e6445e31(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_b8ddce07_d84d_450b_acfd_8dbb76bc80c4(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l < r) {
            int mid = (l + r) / 2;
            if (a.get(mid) < x) {
                l = mid + 1;
            } else {
                r = mid;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_264ecdf8_4d30_41c3_9b66_b1f5fa997dbb(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_7766f85f_e95e_4c99_ae76_5302d3aaa176(ArrayList<Integer> a, int x) {
        int low = 0;
        int high = a.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (a.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }

    
    public static int leftInsertion_Problem_0_02bcbc0e_f2e0_47c7_aece_12e7558feee0(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_2ce7fe92_b7b5_4419_a162_cd66a4281117(ArrayList<Integer> a, int x) {
        int i = 0;
        while(i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_a1654e6a_e5d5_45e8_bab9_df7dac9a59e3(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0, r = n - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_2c1092ae_29d1_40c5_9db2_c0cc8602f7d3(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0;
        int r = n - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_bd6fb50d_454b_4214_bc4d_0789f109561c(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) > x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_a2549f68_3380_4a85_bcaf_58ee67b28976(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_864bddac_15b0_47e2_a7ee_8b3a0a978671(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0;
        int r = n - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_735f576f_f683_49b4_9637_37698314238b(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get( m) == x) {
                return m;
            } else if (a.get( m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_e4069b37_d5ef_4d9b_a2de_04fbe7d25596(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_cbb71219_535d_4f80_b640_de9fce55212a(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get( m) == x) {
                return m;
            } else if (a.get( m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_2907dd53_5c21_4c41_accb_115697f62476(ArrayList<Integer> a, int x) {
        // Write your code here
        int low = 0;
        int high = a.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (a.get( mid) == x) {
                return mid;
            } else if (a.get( mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    
    public static int leftInsertion_Problem_1_bb59df7b_e1eb_4792_9845_2ab68c239229(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0;
        int r = n;
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_6fcbf03a_2172_4371_97a8_a1c73457d16e(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            }
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_027ddd08_dd4d_41a6_be14_eea103fd4744(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_4737e315_7dcd_4721_89c8_b68c3c98d904(ArrayList<Integer> a, int x) {
        return a.indexOf(x);
    }

    
    public static int leftInsertion_Problem_2_21660841_5dd1_487c_a02d_c2cb4bac87f0(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get( m) < x) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_99dd79d0_a4ba_43a3_84e0_73015d2f219d(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_82555770_8f36_427f_91d8_1c3cc9b5c52b(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_fa6abc67_d1da_4853_bd80_c339c67ef2e9(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_a8d6577b_a9f8_4467_9d7c_46b302bb2034(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_8bbd239e_1609_486c_b07d_600b410f7af2(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_33e98aed_4d16_4daa_9477_fa3a9e7e3027(ArrayList<Integer> a, int x) {
        int i = 0;
        while(i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_a88aad3f_9d22_493e_9047_5a10558d0d08(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_7cc6c843_90f8_4b35_9f76_5ac3bd241fbf(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_7dd493f9_8f15_4994_9671_5e4e3083e24d(ArrayList<Integer> a, int x) {
        int lo = 0;
        int hi = a.size() - 1;
        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if (a.get(mid) < x) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return lo;
    }

    
    public static int leftInsertion_Problem_0_4dbe2793_4bbb_48bc_9c51_1087d9ef5666(ArrayList<Integer> a, int x) {
        int i = 0;
        int j = a.size() - 1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (a.get(mid) < x) {
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_f02358d4_3da7_4243_8f4d_c924963a665a(ArrayList<Integer> a, int x) {
        int low = 0;
        int high = a.size() - 1;
        int mid = 0;
        while (low <= high) {
            mid = (low + high) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    
    public static int leftInsertion_Problem_0_e99320ad_d7af_4772_876f_7f8f2e7c3324(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_f8363248_e285_446b_a105_1b9a5dfa082a(ArrayList<Integer> a, int x) {
        if (a.size() == 0) {
            return 0;
        }
        int l = 0;
        int r = a.size() - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        if (a.get(l) < x) {
            return l + 1;
        } else {
            return l;
        }
    }

    
    public static int leftInsertion_Problem_2_c758362a_8f91_4ab4_9210_237f77700e82(ArrayList<Integer> a, int x) {
        int left = 0;
        int right = a.size() - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) > x) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    
    public static int leftInsertion_Problem_2_179ee06a_4fae_4d6c_96aa_fe3210962acf(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_8c4a6055_5c00_4bc0_b9f0_fb16e334589b(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_b00c20e5_60d5_4a5a_a5ee_10ec4db618ed(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0, r = n - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_04f46739_c4ec_4059_8bc2_b46ab2c941fc(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_9b247553_a6c3_4a74_a722_89c0f58e5306(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_10755c05_46f4_43a1_8e58_96c741bf2b27(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0, r = n - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) >= x) {
                r = m;
            } else {
                l = m + 1;
            }
        }
        if (a.get(l) < x) {
            return l + 1;
        } else {
            return l;
        }
    }

    
    public static int leftInsertion_Problem_2_c5f97816_a2d5_453b_af36_4cdd08eac3f1(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get( m) == x) {
                return m;
            } else if (a.get( m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_73173a7f_9e07_4698_81c2_84fdc865d31a(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0;
        int r = n - 1;
        while (l < r) {
            int mid = (l + r) / 2;
            if (a.get(mid) < x) {
                l = mid + 1;
            } else {
                r = mid;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_9726315d_159b_469a_bde8_a204c0939e30(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_b1cc5cc3_1801_4bc9_b4d9_6c6273295ed3(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_443330a5_8f82_456f_bc46_4cdaee57c4e0(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_c8e3e3b8_4ee4_494e_82f5_d827111b57e2(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_18ef59fe_4865_4b90_8ec5_2faf4daff3ba(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (a.get(m) >= x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_b224eb1f_6032_45e0_87a5_a38078030532(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_2c9a81e0_732f_4fe8_adbd_b347b08e50f5(ArrayList<Integer> a, int x) {
        int left = 0;
        int right = a.size() - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) < x) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }

    
    public static int leftInsertion_Problem_2_f3a94335_ab76_4cd7_a5a8_97c9178c078a(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_a5a22ea0_d1a9_4a8f_9772_dbb5d8ee4804(ArrayList<Integer> a, int x) {
        int low = 0;
        int high = a.size() - 1;
        int mid = 0;
        while (low <= high) {
            mid = (low + high) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    
    public static int leftInsertion_Problem_2_e4069b37_d5ef_4d9b_a2de_04fbe7d25596(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_61ab6d8b_1b8d_4086_8203_8c7a50fbbdd8(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0, r = n - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_08956495_c326_4d11_b0ef_ea0e49ee175c(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size();
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_5e02e26a_bc12_4492_9eab_c4fc88dd7872(ArrayList<Integer> a, int x) {
        int left = 0;
        int right = a.get(0); // get first element
        while (right < a.size() - 1) { // while right is less than the size of the array
            if (x <= right) { // if x is less than the right element
                left = right + 1; // set left to the right element + 1
            } else {
                left++; // if x is greater than the right element, set left to right element + 1
            }
            right++; // increment right by 1
        }
        return left; // return the left insertion point
    }

    
    public static int leftInsertion_Problem_2_f45a8fa6_2a2d_4214_aae8_3e1c418acf87(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_f868728a_ba36_4780_8626_35120d1e33ef(ArrayList<Integer> a, int x) {
        int lo = 0;
        int hi = a.size() - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (a.get(mid) < x) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return lo;
    }

    
    public static int leftInsertion_Problem_2_a88aad3f_9d22_493e_9047_5a10558d0d08(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_442b9a78_45cc_4173_b594_28966d4e9c22(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_c8a12e64_3734_4631_98f9_6003d4393c68(ArrayList<Integer> a, int x) {
        int left = 0;
        int right = a.size() - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) > x) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    
    public static int leftInsertion_Problem_1_934faa85_96e2_408a_925c_c5151d6137aa(ArrayList<Integer> a, int x) {
        int i = 0;
        while(i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_40030029_9c55_4066_8e27_8d582405f819(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_e76c6090_3126_4541_80a7_35983c968dd3(ArrayList<Integer> a, int x) {
        int lo = 0;
        int hi = a.size() - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) > x) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return lo;
    }

    
    public static int leftInsertion_Problem_1_4631e12b_81e2_47db_9372_dfdabbc13862(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_61ab6d8b_1b8d_4086_8203_8c7a50fbbdd8(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0, r = n - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_e971a812_5c7b_4675_aab3_16d935ac70a3(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0, r = n - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (a.get(mid) < x) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_23106685_6168_4bf4_aa3e_22672d99912c(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_44521739_8d19_4c14_92d7_65a8ce36444a(ArrayList<Integer> a, int x) {
        int min = Collections.min(a);
        if (x == min) return 0;
        else if (x < min) return Collections.binarySearch(a, min) - 1;
        else return Collections.binarySearch(a, x) - 1;
    }

    
    public static int leftInsertion_Problem_1_44521739_8d19_4c14_92d7_65a8ce36444a(ArrayList<Integer> a, int x) {
        int min = Collections.min(a);
        if (x == min) return 0;
        else if (x < min) return Collections.binarySearch(a, min) - 1;
        else return Collections.binarySearch(a, x) - 1;
    }

    
    public static int leftInsertion_Problem_0_5f6540b4_fd08_4047_befd_3b78d49149e7(ArrayList<Integer> a, int x) {
        // a is sorted
        // return the index of the leftmost insertion point for x in a
        // if x is already in a, return the index of the leftmost occurrence of x
        // if x is greater than all elements in a, return a.size()
        // if x is less than all elements in a, return 0
        // if a is empty, return 0
        if (a.size() == 0) return 0;
        int lo = 0;
        int hi = a.size() - 1;
        while (lo < hi) {
            int mid = (lo + hi) / 2;
            if (a.get(mid) < x) lo = mid + 1;
            else hi = mid;
        }
        if (a.get(lo) < x) return lo + 1;
        else return lo;
    }

    
    public static int leftInsertion_Problem_1_c79bf331_4900_4f16_ba1e_cb9d79253c6e(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (a.get(m) == x) {
                return m;
            }
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_941728e8_4d2f_45ec_abe9_85d624b2d4f8(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_73ce71ac_83ec_4955_8c82_3e990a65c941(ArrayList<Integer> a, int x) {
        int lo = 0;
        int hi = a.size() - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) > x) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return lo;
    }

    
    public static int leftInsertion_Problem_0_b6be7186_e241_430d_ac9e_05290e0cc905(ArrayList<Integer> a, int x) {
        int lo = 0, hi = a.size() - 1;
        while (lo < hi) {
            int mid = (lo + hi) / 2;
            if (a.get(mid) < x) {
                lo = mid + 1;
            } else {
                hi = mid;
            }
        }
        return lo;
    }

    
    public static int leftInsertion_Problem_2_12a85099_e231_4914_a592_0c57a065274b(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_0b1fb858_e258_45ed_bfa2_20de6d5ccf67(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_91127709_9752_4099_b746_c3bfd4d1644e(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_8898a257_f776_4627_948d_3427593aabb3(ArrayList<Integer> a, int x) {
        for(int i = 0; i < a.size(); i++) {
            int left = a.get(i);
            int right = a.get((i+1)%a.size());
            if(x > left) {
                int temp = left;
                left = right;
                right = temp;
            }
            if(x > right) {
                return i;
            }
        }
        return a.size();
    }

    
    public static int leftInsertion_Problem_2_d964f095_be65_451d_b711_db6a45263d72(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_cf08f2a6_1500_489d_99f3_b0c947560da9(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_72d40f0c_52bd_4847_9e0b_4e9e27f9ea86(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_8b84ea82_0ff8_4927_bdfb_eba6403bd07f(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_15073c5b_4a42_4b1d_8d99_849486b977d9(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_d461856e_03b3_42b2_ac60_e45b1ae2fee2(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_0a5401a6_371a_4200_ab05_b4f6c88b1857(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_b8bf35a9_ec3f_4a38_a654_7236a78da870(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0, r = n - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_d1a3e408_bb4d_43ba_a9ce_95cdebed7edf(ArrayList<Integer> a, int x) {
        return Collections.binarySearch(a, x);
    }

    
    public static int leftInsertion_Problem_2_578b40ab_59b0_4280_b5d3_cb274f0115b0(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_10121dec_98b8_477c_b3d1_f3bbc6f8751c(ArrayList<Integer> a, int x) {
        int lo = 0;
        int hi = a.size() - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) < x) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return lo;
    }

    
    public static int leftInsertion_Problem_0_d7d1f40d_be62_4dae_b69c_76db272faa08(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_4d7876a7_662e_4337_903e_3fcfe6aabc45(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_b6be7186_e241_430d_ac9e_05290e0cc905(ArrayList<Integer> a, int x) {
        int lo = 0, hi = a.size() - 1;
        while (lo < hi) {
            int mid = (lo + hi) / 2;
            if (a.get(mid) < x) {
                lo = mid + 1;
            } else {
                hi = mid;
            }
        }
        return lo;
    }

    
    public static int leftInsertion_Problem_0_9fb252da_dde8_4e57_8adf_c844b6f262f6(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_fade40ef_beff_4e7a_b8b4_7b0219cf9f0b(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_10755c05_46f4_43a1_8e58_96c741bf2b27(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0, r = n - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) >= x) {
                r = m;
            } else {
                l = m + 1;
            }
        }
        if (a.get(l) < x) {
            return l + 1;
        } else {
            return l;
        }
    }

    
    public static int leftInsertion_Problem_0_44acab14_46e3_408f_9fa3_3ba915c31c7c(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get( m) == x) {
                return m;
            } else if (a.get( m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_e76c6090_3126_4541_80a7_35983c968dd3(ArrayList<Integer> a, int x) {
        int lo = 0;
        int hi = a.size() - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) > x) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return lo;
    }

    
    public static int leftInsertion_Problem_2_40030029_9c55_4066_8e27_8d582405f819(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_9490ca09_d2df_4d9c_8afe_c63a18a93f05(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_ec7e8ea0_99c8_4c43_8d75_285dad869966(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_90d3a769_c85d_4549_987e_690cc8c0aaa7(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size();
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_4d6f5d1e_921d_4697_b4a2_68993a67c01d(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_d8cba282_4ec7_46f3_a862_210562cbe323(ArrayList<Integer> a, int x) {
        int n = a.size();
        int pivot = a.get( (n - 1));
        int left = 0;
        int right = 0;
        for (int i = 0; i < n; i++) {
            if (a.get(i) > pivot) {
                right++;
            } else if (a.get(i) < pivot) {
                left++;
            } else {
                return i;
            }
        }
        if (right < left) {
            return -1;
        } else if (right == left) {
            return 0;
        } else {
            return  (right + 1);
        }
    }

    
    public static int leftInsertion_Problem_1_890a9f5a_1201_4790_bdd8_345fb615fe44(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_fca8b5de_7e62_4f67_aebf_220ea858b322(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0, r = n - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_b3a4e312_621d_467a_a4cb_62e53ea3f7fc(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_1aeee9f7_9124_4ca0_8578_21ab4d6064be(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (a.get(m) >= x)
                r = m - 1;
            else
                l = m + 1;
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_bf457f08_8de6_469d_a0ad_babdc5b4bd11(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_3fcd62f7_3407_4d53_a35f_923200d65198(ArrayList<Integer> a, int x) {
        int i= 0;
        int last=0;
        int lastindex=0;
        int curr=0;
        boolean found = False;
        for ( i = 0; i<a.size(); i++){
            curr=a.get(i);
            if (curr == x){
                found = True;
                break;
            }
            if (found && curr < x){
                i++;
                last = curr; lastindex = i;
            }
        }
        if (found)
            return lastindex;
        else
            return -1;
    }

    
    public static int leftInsertion_Problem_2_31372648_2d71_4109_aa29_53fbb59653cb(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_ee2e0703_9aa7_47ed_b878_675e766bac5a(ArrayList<Integer> a, int x) {
        int result = -1;
        for(int i = 0; i < a.size(); i++) {
            if(a.get(i) > x) {
                result = i;
                break;
            }
        }
        if(result != -1) {
            int index = a.size() - 1;
            while(index > 0 && a.get(index) == a.get(index - 1)) {
                index--;
            }
            a.set(index + 1, x);
        }
        return result;
    }

    
    public static int leftInsertion_Problem_1_1aeee9f7_9124_4ca0_8578_21ab4d6064be(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (a.get(m) >= x)
                r = m - 1;
            else
                l = m + 1;
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_60de35b4_8d33_4481_a928_aa795143fbb5(ArrayList<Integer> a, int x) {
        int i = 0;
        while(i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_6c4a8209_59ec_4377_8ee7_0842e4a2e53f(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0, r = n - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) > x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_12a85099_e231_4914_a592_0c57a065274b(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_1b24d47d_6691_4e3a_82bf_a9b38baddd4b(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_dfa5cf75_26bd_44c6_9d2b_cd641ef3e45c(ArrayList<Integer> a, int x) {
        int low = 0;
        int high = a.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }

    
    public static int leftInsertion_Problem_2_1664502f_9e79_428d_a597_7ddc6631ee70(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_33e98aed_4d16_4daa_9477_fa3a9e7e3027(ArrayList<Integer> a, int x) {
        int i = 0;
        while(i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_16cae836_596f_4dd0_b4db_9b400b839e65(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_99dd79d0_a4ba_43a3_84e0_73015d2f219d(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_dffce6a0_11b7_4023_8f6c_5a496a42c52a(ArrayList<Integer> a, int x) {
        int i = 0;
        int j = a.size() - 1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (a.get(mid) < x) {
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_3d4f2b8c_9a25_4d5a_9fe4_1cb488defb7f(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_1062165e_72a4_4260_a296_ef010d2e0c2e(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0, r = n - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            }
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_57ac3722_1ff4_4a0b_b620_73f32aa87c91(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_1062165e_72a4_4260_a296_ef010d2e0c2e(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0, r = n - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            }
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_e742c3e1_3641_4353_a86a_a9f2fa05211c(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_dbeea9a7_1de2_42f7_b525_fc46281701d5(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_9279a6b2_a024_47d6_b761_129747f087d5(ArrayList<Integer> a, int x) {
        int left = 0;
        int right = a.get(0); // get first element
        while (right < a.size() - 1) { // while right is less than the size of the array
            if (x <= right) { // if x is less than right
                left = right + 1; // set left to the right plus one
            } else { // if x is greater than right
                left = right - 1; // set left to the right minus one
            }
            right++; // increment right
        }
        return left; // return the left insertion point
    }

    
    public static int leftInsertion_Problem_1_0f8406a7_d192_4aba_ac08_366535be7615(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            }
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_c5f7f99f_14f7_48ee_acf7_2177cdd1e17a(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_067837af_4d21_45bf_960d_a8c53d586f96(ArrayList<Integer> a, int x) {
        int i = 0;
        while(i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_f3a94335_ab76_4cd7_a5a8_97c9178c078a(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_075c1a13_7b6d_4f60_ad56_0ae7f9cf1806(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_df01a568_a295_4e8c_a725_bd288beb324a(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0;
        int r = n - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_cfa421b3_c53e_43d3_a7b9_eaef53b5b3f8(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size();
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_486c5805_a826_4a95_8009_4a17d4aea2da(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_6c31e1c2_cfc9_45bb_ab6e_ac73c3aeed1d(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_d9689457_433d_47ee_9bc2_add310dc90db(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0, r = n - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) > x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_77072d03_7371_4bfd_8aa5_0c771b7dc0de(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_a1654e6a_e5d5_45e8_bab9_df7dac9a59e3(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0, r = n - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_49d71936_6f07_46f6_9a6d_a539d9e5b9f2(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0;
        int r = n - 1;
        while (l < r) {
            int m = l + (r - l) / 2;
            if (a.get(m) >= x) {
                r = m;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_7dd493f9_8f15_4994_9671_5e4e3083e24d(ArrayList<Integer> a, int x) {
        int lo = 0;
        int hi = a.size() - 1;
        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if (a.get(mid) < x) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return lo;
    }

    
    public static int leftInsertion_Problem_0_693eb0cc_ed71_44d3_bcda_6e5d21bd1bbe(ArrayList<Integer> a, int x) {
        int i = 0;
        while(i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_a9c3da70_9cd3_4810_a102_bcf93a328795(ArrayList<Integer> a, int x) {
        int low = 0, high = a.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }

    
    public static int leftInsertion_Problem_0_3b32eab2_3ac9_4560_adaa_6f8e360cfd60(ArrayList<Integer> a, int x) {
        // binary search
        int lo = 0;
        int hi = a.size() - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (a.get(mid) < x) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return lo;
    }

    
    public static int leftInsertion_Problem_1_a0329f65_8e1b_4f2b_b379_f6837ff99a32(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_d621b0ad_219d_47a3_b092_cbce79115e95(ArrayList<Integer> a, int x) {
        int lo = 0;
        int hi = a.size() - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) > x) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return lo;
    }

    
    public static int leftInsertion_Problem_1_f6bfb32c_c739_4d5c_859b_758280c91f0c(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_9cdf7a58_951f_4507_b9b8_cccb5481d949(ArrayList<Integer> a, int x) {
        int left = 0;
        while (left < a.size() && x > a.get(left)) {
            left++;
        }
        return left;
    }

    
    public static int leftInsertion_Problem_0_1ca1eac9_d305_42d3_b869_508c53246821(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0;
        int r = n - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_ca87eab6_1fde_4dd1_a84f_4e8daf69f319(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_da6e5f96_1af3_4906_8411_50573146f7fe(ArrayList<Integer> a, int x) {
        int low = 0, high = a.size() - 1;
        int curr = 0;

        while (low < high) {
            int mid = (low + high) >>> 1;
            curr = a.get(mid);

            if (curr < x)
                low = mid + 1;
            else if (curr > x)
                high = mid - 1;
            else
                return mid;
        }
        return low;
    }

    
    public static int leftInsertion_Problem_1_ff0a3b3e_b7c5_4523_8121_5af97a2c8e8a(ArrayList<Integer> a, int x) {
        int lo = 0;
        int hi = a.size() - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (a.get(mid) < x) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return lo;
    }

    
    public static int leftInsertion_Problem_0_8858567e_e640_4cbe_a3a0_c423ea7469b3(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_b643f026_a4db_4cea_aa3d_8bb658f4b50a(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_c293ce0f_f59b_4b32_962b_ab1b9b0f8504(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_b3a4e312_621d_467a_a4cb_62e53ea3f7fc(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_0fe27770_d012_4d42_b404_30702dc6ac68(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_4737e315_7dcd_4721_89c8_b68c3c98d904(ArrayList<Integer> a, int x) {
        return a.indexOf(x);
    }

    
    public static int leftInsertion_Problem_2_8898a257_f776_4627_948d_3427593aabb3(ArrayList<Integer> a, int x) {
        for(int i = 0; i < a.size(); i++) {
            int left = a.get(i);
            int right = a.get((i+1)%a.size());
            if(x > left) {
                int temp = left;
                left = right;
                right = temp;
            }
            if(x > right) {
                return i;
            }
        }
        return a.size();
    }

    
    public static int leftInsertion_Problem_2_456c3c1c_8508_4583_88e8_c8178ca8a300(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_4d6f5d1e_921d_4697_b4a2_68993a67c01d(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_6c31e1c2_cfc9_45bb_ab6e_ac73c3aeed1d(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_820b5f66_7784_41cb_a2e8_9129b37dbe43(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0, r = n - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_cfecd472_7f6b_4969_9068_743c1ac35b8f(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_4c393fb8_74c1_4f0f_9180_0b5993f2a93c(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_bd63f70c_0abf_4059_9113_776ffc5bc4e1(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0;
        int r = n - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) >= x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_a1c8b87a_ff8f_403b_b023_a708d4988e76(ArrayList<Integer> a, int x) {
        if (x < a.get(0)) {
            return 1;
        } else if (x > a.get(a.size()-1)) {
            return a.size()-1;
        } else {
            int low = 0;
            int high = a.size()-1;
            while (low < high) {
                int mid = (low+high)/2;
                if (x < a.get(mid)) {
                    low = mid + 1;
                } else {
                    high = mid;
                }
            }
            return low;
        }
    }

    
    public static int leftInsertion_Problem_0_648066c5_6571_42bc_a9f5_93c08b00b8c0(ArrayList<Integer> a, int x) {
        int lo = 0;
        int hi = a.size() - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) < x) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return lo;
    }

    
    public static int leftInsertion_Problem_2_c9a4991f_efe4_463e_bf46_69fa30097832(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0, r = n - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_ee9e87f0_5569_4b3d_b804_dddac9656953(ArrayList<Integer> a, int x) {
        int i = 0;
        while(i < a.size() && x <= a.get(i)) {
            i++;
        }
        if (i == a.size())
            return a.size() - 1;
        return i;
    }

    
    public static int leftInsertion_Problem_0_9490ca09_d2df_4d9c_8afe_c63a18a93f05(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_6346e24a_c90d_4ccc_b9a6_586efb6c7b8c(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0;
        int r = n - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_896b8fc2_14db_4037_baf8_b6900676da95(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_49152b37_5fbe_43a7_9735_d83642abfa7b(ArrayList<Integer> a, int x) {
        int i = 0;
        int j = a.size() - 1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (a.get(mid) < x) {
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_21660841_5dd1_487c_a02d_c2cb4bac87f0(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get( m) < x) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_63ecc62d_2ccb_48b5_b9d0_9ebd7babe3a6(ArrayList<Integer> a, int x) {
        int i=0, j=0;
        int k = 0;
        while(i<a.size() && x<a.get(i)) {
            i++;
        }
        while(i<a.size() && x>a.get(i)) {
            i++;
        }
        while(j<a.size() && x<a.get(j)) {
            j++;
        }
        if(i<a.size()) {
            k = a.get(i);
            a.set(i, a.get(j));
            a.set(j, k);
            return i;
        }
        return -1;
    }

    
    public static int leftInsertion_Problem_1_d7d1f40d_be62_4dae_b69c_76db272faa08(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_8036ca2f_4c66_4ce3_820b_e31cc78b5df5(ArrayList<Integer> a, int x) {
        int left = 0;
        int right = a.size() - 1;
        while (left < right) {
            int mid = (left + right) / 2;
            if (a.get(mid) < x) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }

    
    public static int leftInsertion_Problem_0_a8d6577b_a9f8_4467_9d7c_46b302bb2034(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_c088f15f_9c11_4f46_b23d_746f36f86715(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x)
                return m;
            else if (a.get(m) > x)
                r = m - 1;
            else
                l = m + 1;
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_5d7f8d2b_30d7_4390_80bd_ce917c848ad2(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_8ed10174_4dab_448a_b993_68289a8d627d(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_87d8024b_1767_45af_b49b_55a5e64cc700(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_86851f59_2c27_4dd3_b7d7_2bab816fb49c(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_449e8895_0f78_45ae_ae30_e027385b72a5(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_c6b3a682_4945_4012_a016_ab1a49d3611e(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_486c5805_a826_4a95_8009_4a17d4aea2da(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_e6a23d32_2e25_4bbd_873b_154a12824d96(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_3fcd62f7_3407_4d53_a35f_923200d65198(ArrayList<Integer> a, int x) {
        int i= 0;
        int last=0;
        int lastindex=0;
        int curr=0;
        boolean found = False;
        for ( i = 0; i<a.size(); i++){
            curr=a.get(i);
            if (curr == x){
                found = True;
                break;
            }
            if (found && curr < x){
                i++;
                last = curr; lastindex = i;
            }
        }
        if (found)
            return lastindex;
        else
            return -1;
    }

    
    public static int leftInsertion_Problem_2_a2549f68_3380_4a85_bcaf_58ee67b28976(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_de62b5e7_2b8c_48b8_90e4_2c59e8243b0a(ArrayList<Integer> a, int x) {
        int lo = 0;
        int hi = a.size()-1;
        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) < x) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return lo;
    }

    
    public static int leftInsertion_Problem_2_027d2151_495d_4eb4_9969_11e2bd0675b8(ArrayList<Integer> a, int x) {
        // Write your code here
        return 0;
    }

    
    public static int leftInsertion_Problem_0_62e9aacf_ddbf_4f51_bbfb_a3ba9f90cc70(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_038339b1_8654_4f1a_8c3e_7019a2c96388(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get( m) == x) {
                return m;
            } else if (a.get( m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_4631e12b_81e2_47db_9372_dfdabbc13862(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_ae3ed6e4_d50b_4ee1_ba61_40abee85aba6(ArrayList<Integer> a, int x) {
        int low = 0;
        int high = a.size() - 1;
        while (low <= high) {
            int mid = (low + high) >>> 1;
            int midVal = a.get(mid);
            if (midVal < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }

    
    public static int leftInsertion_Problem_2_0bd088c1_7ffd_4ba4_975f_ec61983227ad(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) > x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_21461799_5768_4adf_bd51_34ead0ca0e87(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_d964f095_be65_451d_b711_db6a45263d72(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_ed3722ae_e47d_4f54_93de_eaa9c7fe39db(ArrayList<Integer> a, int x) {
        int n = a.size();
        int lo = 0;
        int hi = n - 1;
        int mid = 0;
        while (lo <= hi) {
            mid = lo + (hi - lo) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) > x) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return lo;
    }

    
    public static int leftInsertion_Problem_1_9d3634bf_20a8_419c_a1c2_2bf6dab35f04(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) < x) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_797300fb_5a1d_405e_8e6d_3e9bfaa6677c(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_515e5948_0a98_408e_91f3_2fd03ae64def(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        int m = 0;
        while (l <= r) {
            m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_afe2df4c_eec2_45a0_ba86_3fcd30fe301c(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_c3114250_1782_4a55_b08b_d83c23f54ef3(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_2300c325_df95_44ec_84a6_66ca08551624(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_a971de80_bbac_4e81_8685_8d68a04c4bfd(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_a7b61031_225d_4295_9f25_ef44c46ac4a0(ArrayList<Integer> a, int x) {
        int i = 0;
        int j = a.size() - 1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (a.get(mid) < x) {
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_1062165e_72a4_4260_a296_ef010d2e0c2e(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0, r = n - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            }
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_14f0f991_2075_4cc3_8bb6_90fe4d79eecd(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) >= x)
                r = m - 1;
            else
                l = m + 1;
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_fdfec69a_5754_4d3c_a465_e07013dfa6c8(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) >= x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_527d7b71_d79b_4152_bd3f_52e6cab0f705(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) > x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_ca61a315_0352_4102_a35a_632116943a3b(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        int m = 0;
        while (l <= r) {
            m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_4e0ea9dd_41c1_4648_bd16_eee4ceb7d2ac(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_78589b61_2ec8_45eb_b296_1885f22ceeb8(ArrayList<Integer> a, int x) {
        int i = 0;
        int j = a.size() - 1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (a.get(mid) < x) {
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_bc4daef2_a344_47d1_a235_9f23c6e8cc1f(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_78589b61_2ec8_45eb_b296_1885f22ceeb8(ArrayList<Integer> a, int x) {
        int i = 0;
        int j = a.size() - 1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (a.get(mid) < x) {
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_d9395b4e_081d_4880_b952_c5c8435ae62c(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) < x) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_9d3634bf_20a8_419c_a1c2_2bf6dab35f04(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) < x) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_fdc4628d_48e6_4082_8297_aba195f6b518(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_4737e315_7dcd_4721_89c8_b68c3c98d904(ArrayList<Integer> a, int x) {
        return a.indexOf(x);
    }

    
    public static int leftInsertion_Problem_1_44521739_8d19_4c14_92d7_65a8ce36444a(ArrayList<Integer> a, int x) {
        int min = Collections.min(a);
        if (x == min) return 0;
        else if (x < min) return Collections.binarySearch(a, min) - 1;
        else return Collections.binarySearch(a, x) - 1;
    }

    
    public static int leftInsertion_Problem_0_9726315d_159b_469a_bde8_a204c0939e30(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_7bab8a00_bbc1_4f7d_817e_684bcb5b0a9c(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) > x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_648066c5_6571_42bc_a9f5_93c08b00b8c0(ArrayList<Integer> a, int x) {
        int lo = 0;
        int hi = a.size() - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) < x) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return lo;
    }

    
    public static int leftInsertion_Problem_2_a7b38517_2dd0_4746_8ce9_f2c32b314e80(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_6a90d2c2_55c9_483a_a27c_a598f975c24b(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_97fa7b19_5f34_438a_983f_2d77acfb2c5f(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get( m) == x) {
                return m;
            } else if (a.get( m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_e0c466b1_eaf0_4fa3_a7f7_2546a8336421(ArrayList<Integer> a, int x) {
        int i = 0;
        int j = a.size() - 1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (a.get(mid) < x) {
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_6210b452_c882_46ea_a23d_a12dbd6af8e0(ArrayList<Integer> a, int x) {
        int i = 0;
        int j = a.size() - 1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (a.get(mid) < x) {
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_563abecb_1078_4389_b10c_62e2f49def77(ArrayList<Integer> a, int x) {
        for(int i = 0 ; i < a.size(); i++) {
            if(a.get(i) <= x) {
                return i;
            }
        }
        return -1;
    }

    
    public static int leftInsertion_Problem_0_7bab89c2_ffc0_44b6_904c_985bfa58e6bb(ArrayList<Integer> a, int x) {
        int lo = 0;
        int hi = a.size() - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (a.get(mid) < x) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return lo;
    }

    
    public static int leftInsertion_Problem_1_182dc868_a1c6_461d_bfd8_1465cfdaf0ea(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_edebeb89_35df_4168_93f8_502c6cf830bd(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get( m) == x) {
                return m;
            } else if (a.get( m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_9772e0d7_9cce_40ec_a899_6e023290141d(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_94694dfd_8598_40d5_8877_7984c5955c68(ArrayList<Integer> a, int x) {
        int l = a.size();
        int i = 1;
        while (i < l && a.get(i) < x) {
            i++;
        }
        int left = (a.get(i - 1) != null) ? a.get(i) - 1 : 0L;
        int mid = i - 1;
        while (i < l && a.get(mid) < x) {
            mid++;
        }
        int right = (a.get(mid) != null) ? a.get(mid) : 0L;
        return (left + right);
    }

    
    public static int leftInsertion_Problem_1_b6be7186_e241_430d_ac9e_05290e0cc905(ArrayList<Integer> a, int x) {
        int lo = 0, hi = a.size() - 1;
        while (lo < hi) {
            int mid = (lo + hi) / 2;
            if (a.get(mid) < x) {
                lo = mid + 1;
            } else {
                hi = mid;
            }
        }
        return lo;
    }

    
    public static int leftInsertion_Problem_2_b1c7d2b3_af4b_40aa_8f47_58eadcb1b9d0(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_583dc8bf_baa7_4d51_a154_4b6330f50427(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) > x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_ae528a80_1758_48d4_8e39_20986e6e4e1b(ArrayList<Integer> a, int x) {
        int i = 0;
        int j = a.size() - 1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (a.get(mid) < x) {
                i = mid + 1;
            } else if (a.get(mid) > x) {
                j = mid - 1;
            } else {
                return mid;
            }
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_d4dd9121_574f_4a62_9aac_aa0622c5741f(ArrayList<Integer> a, int x) {
        int n = a.size();
        if (x <= a.get(0)) {
            return 0;
        }
        if (x > a.get(n - 1)) {
            return n;
        }
        int lo = 0;
        int hi = n - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) < x && a.get(mid + 1) > x) {
                return mid + 1;
            } else if (a.get(mid) < x) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return -1;
    }

    
    public static int leftInsertion_Problem_2_090c98c0_19ce_4bea_8cdc_df860b2df17c(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_515e5948_0a98_408e_91f3_2fd03ae64def(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        int m = 0;
        while (l <= r) {
            m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_bc4daef2_a344_47d1_a235_9f23c6e8cc1f(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_81df455d_474b_44e3_83d5_92948ceec0db(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0, r = n - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x)
                return m;
            else if (a.get(m) < x)
                l = m + 1;
            else
                r = m - 1;
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_29df1537_0567_48b6_83bf_3084dd2009c4(ArrayList<Integer> a, int x) {
        int i = 0;
        int j = a.size() - 1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (a.get(mid) < x) {
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_45df30f0_4de1_4716_b353_447ed5dace8c(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_68dec6d2_edce_4b0e_a40e_1511129d331e(ArrayList<Integer> a, int x) {
        int i = 0;
        int j = 1;
        for(; i < a.size(); i++) {
            if(a.get(i) > x) {
                if(a.get(j) > x) {
                    j++;
                } else {
                    return j;
                }
            } else {
                break;
            }
        }
        j++;
        for(; i < a.size(); i++) {
            if(a.get(i) <= x) {
                return i;
            }
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_ca22f63e_1c45_4600_97ab_ef83e2b04b80(ArrayList<Integer> a, int x) {
        int left = 0;
        int right = a.get(a.size() - 1);
        while (right > x) {
            if (x <= right) {
                left = right + 1;
                break;
            } else {
                right = right - 1;
            }
        }
        return left;
    }

    
    public static int leftInsertion_Problem_2_dc2ebb02_4337_4b53_b3ae_213ee340d9c7(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_7c508be0_bd67_49e8_93e1_17d3febfd06a(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_57ac3722_1ff4_4a0b_b620_73f32aa87c91(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_aad14374_3139_40f4_b04b_f26645340f4d(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_fade40ef_beff_4e7a_b8b4_7b0219cf9f0b(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_f29020d3_6340_47f4_81d2_a0a089dadf60(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_25ccb5bf_edb7_4762_9d38_8e21a8ea45e4(ArrayList<Integer> a, int x) {
        if (a.size() == 0) return 0;
        if (a.get(0) >= x) return 0;
        if (a.get(a.size() - 1) < x) return a.size();
        int left = 0;
        int right = a.size() - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (a.get(mid) >= x) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    
    public static int leftInsertion_Problem_1_1aeee9f7_9124_4ca0_8578_21ab4d6064be(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (a.get(m) >= x)
                r = m - 1;
            else
                l = m + 1;
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_e25dc101_d94b_44e0_b198_0c3c49dc413b(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_fd748118_753b_40db_8bc9_22c73ec5eb1c(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0;
        int r = n - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_790e2bfd_4832_4063_8130_5daaeaaab2eb(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_00482753_a6a1_4b38_a896_7737d625bd86(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_7bab8a00_bbc1_4f7d_817e_684bcb5b0a9c(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) > x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_0209af93_28bf_4ce1_b2ba_6c889e54ebff(ArrayList<Integer> a, int x) {
        int low = 0;
        int high = a.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    
    public static int leftInsertion_Problem_1_fd748118_753b_40db_8bc9_22c73ec5eb1c(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0;
        int r = n - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_afe2df4c_eec2_45a0_ba86_3fcd30fe301c(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_a8fdb54d_0aff_43df_a52a_e9e064b97299(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_da6e5f96_1af3_4906_8411_50573146f7fe(ArrayList<Integer> a, int x) {
        int low = 0, high = a.size() - 1;
        int curr = 0;

        while (low < high) {
            int mid = (low + high) >>> 1;
            curr = a.get(mid);

            if (curr < x)
                low = mid + 1;
            else if (curr > x)
                high = mid - 1;
            else
                return mid;
        }
        return low;
    }

    
    public static int leftInsertion_Problem_0_b5328ce7_d647_431c_b27b_a3e712d2ce93(ArrayList<Integer> a, int x) {
        int lo = 0;
        int hi = a.size() - 1;
        while (lo < hi) {
            int mid = (lo + hi) / 2;
            if (a.get(mid) < x) {
                lo = mid + 1;
            } else {
                hi = mid;
            }
        }
        return lo;
    }

    
    public static int leftInsertion_Problem_2_69e47501_83bf_47bb_9ecd_d823822bc38e(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_f02358d4_3da7_4243_8f4d_c924963a665a(ArrayList<Integer> a, int x) {
        int low = 0;
        int high = a.size() - 1;
        int mid = 0;
        while (low <= high) {
            mid = (low + high) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    
    public static int leftInsertion_Problem_0_c530c3e8_37a9_4c7e_ba6a_4c16415cfe81(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_0d02f193_9cfd_4c79_b5df_1bc897bec614(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (a.get(m) >= x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_0b1fb858_e258_45ed_bfa2_20de6d5ccf67(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_41bdc8aa_6ff0_4138_b19b_0e5ea59ca404(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_ae3ed6e4_d50b_4ee1_ba61_40abee85aba6(ArrayList<Integer> a, int x) {
        int low = 0;
        int high = a.size() - 1;
        while (low <= high) {
            int mid = (low + high) >>> 1;
            int midVal = a.get(mid);
            if (midVal < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }

    
    public static int leftInsertion_Problem_2_61ef73a5_6f7b_45b7_8b85_6ef2db877eef(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_91333fff_63d3_46de_a204_dc010e6cbc57(ArrayList<Integer> a, int x) {
        int lo = 0;
        int hi = a.size() - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (a.get(mid) < x) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return lo;
    }

    
    public static int leftInsertion_Problem_1_ef20686a_75dc_47ff_8f4f_ca2e1555500b(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get( m) == x) {
                return m;
            } else if (a.get( m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_5cfa0bf6_b75c_4888_9217_471598ef73e1(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l < r) {
            int mid = (l + r) / 2;
            if (a.get(mid) < x) {
                l = mid + 1;
            } else {
                r = mid;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_3f129c66_e71e_43e3_bc7f_3e27511fcf1e(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0;
        int r = n - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_7ad1eb0d_a61d_4ea9_867d_f55803c4150e(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_8bbd239e_1609_486c_b07d_600b410f7af2(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_8858567e_e640_4cbe_a3a0_c423ea7469b3(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_6b83e411_cb1e_4c93_90e3_e5afa3fef5a8(ArrayList<Integer> a, int x) {
        int i = 0;
        while(i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_a7243909_b446_492b_b4de_f2c10d1e1e31(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0, r = n - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_bd6fb50d_454b_4214_bc4d_0789f109561c(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) > x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_3d308fbc_1b89_4caf_a0a8_25e20558e9e5(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_82b5c533_15b6_4dcc_bb31_a7598a7757c1(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_69759bc2_6456_48b4_b3ef_dbc9590240ea(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_2d655ae4_9649_434e_ace8_a3541c9320be(ArrayList<Integer> a, int x) {
        int i = 0;
        int j = a.size() - 1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (a.get(mid) < x) {
                i = mid + 1;
            } else if (a.get(mid) > x) {
                j = mid - 1;
            } else {
                return mid;
            }
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_91127709_9752_4099_b746_c3bfd4d1644e(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_cfecd472_7f6b_4969_9068_743c1ac35b8f(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_ef5a15e8_1a11_4169_bcdb_ef049c8ad7e3(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_8960c4c5_008d_46de_82ee_674c729a9abd(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_8b84ea82_0ff8_4927_bdfb_eba6403bd07f(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_38c20a8f_32d7_463a_8bdd_6ca617597ad3(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_b2cc95bb_079b_444c_844b_f4139856de5b(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1, m;
        while (l <= r) {
            m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_45df30f0_4de1_4716_b353_447ed5dace8c(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_673a9a66_8168_4713_85e0_ea9aced809e6(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_b2a95aa3_5812_4dfe_9e5b_1ef972660280(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_8036ca2f_4c66_4ce3_820b_e31cc78b5df5(ArrayList<Integer> a, int x) {
        int left = 0;
        int right = a.size() - 1;
        while (left < right) {
            int mid = (left + right) / 2;
            if (a.get(mid) < x) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }

    
    public static int leftInsertion_Problem_0_e115d05b_97ed_40e9_b58e_4063c05ae1a0(ArrayList<Integer> a, int x) {
        int lo = 0;
        int hi = a.size() - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) > x) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return lo;
    }

    
    public static int leftInsertion_Problem_2_fcad39f5_3e88_4a8a_98e8_aa526645964a(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_f84cfd1b_d195_4878_b56a_5391d957c0f7(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_0607a234_355f_42b6_a67f_1c12c520d09c(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_87d8024b_1767_45af_b49b_55a5e64cc700(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_3db3c1cb_760e_4254_9312_94b6190aab51(ArrayList<Integer> a, int x) {
        int i = 0;
        int j = a.size() - 1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (a.get(mid) < x) {
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_4c59c2e1_e99d_495b_913d_c4a1fb3b71fd(ArrayList<Integer> a, int x) {
        int pos = -1;
        for(int i = 0; i <= a.size(); i++){
            if(a.get(i) == x){
                pos = i;
                break;
            }
        }
        if(pos == -1){
            return -1;
        }
        return pos;
    }

    
    public static int leftInsertion_Problem_2_842de59c_893b_4be7_8045_dd5c127aab9e(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0, r = n - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_69759bc2_6456_48b4_b3ef_dbc9590240ea(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_f6bfb32c_c739_4d5c_859b_758280c91f0c(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_63ecc62d_2ccb_48b5_b9d0_9ebd7babe3a6(ArrayList<Integer> a, int x) {
        int i=0, j=0;
        int k = 0;
        while(i<a.size() && x<a.get(i)) {
            i++;
        }
        while(i<a.size() && x>a.get(i)) {
            i++;
        }
        while(j<a.size() && x<a.get(j)) {
            j++;
        }
        if(i<a.size()) {
            k = a.get(i);
            a.set(i, a.get(j));
            a.set(j, k);
            return i;
        }
        return -1;
    }

    
    public static int leftInsertion_Problem_1_e062551a_3ca6_4551_8ceb_e0d9202b7b40(ArrayList<Integer> a, int x) {
        if (a.size() == 0) return 0;
        int l = 0, r = a.size() - 1;
        while (l < r) {
            int mid = (l + r) / 2;
            if (a.get(mid) < x) l = mid + 1;
            else r = mid;
        }
        return a.get(l) >= x ? l : l + 1;
    }

    
    public static int leftInsertion_Problem_0_6a2cb328_09db_4b15_88a5_4d701ee4ab42(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_4d6f5d1e_921d_4697_b4a2_68993a67c01d(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_e173cd17_9ffb_42a6_a121_a432c59e4d7b(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_ddb2a8a5_85f5_4cac_ad8a_81974310c3a4(ArrayList<Integer> a, int x) {
        // Write - Your - Code
        int low = 0;
        int high = a.size() - 1;
        int mid = 0;
        while (low <= high) {
            mid = (low + high) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    
    public static int leftInsertion_Problem_0_ea91ac95_a1e5_48d6_9b4a_fc1eb9eb2f4c(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_7cc6c843_90f8_4b35_9f76_5ac3bd241fbf(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_cbb71219_535d_4f80_b640_de9fce55212a(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get( m) == x) {
                return m;
            } else if (a.get( m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_55ae56cd_f4c8_4226_81fc_7cb23565c4a3(ArrayList<Integer> a, int x) {
        if (a.size() == 0) {
            return 0;
        }
        int l = 0;
        int r = a.size() - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        if (a.get(l) < x) {
            return l + 1;
        } else {
            return l;
        }
    }

    
    public static int leftInsertion_Problem_2_a7f63580_b353_451f_8e17_3b63b27d2a35(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_38a03503_959a_4f16_a507_a4b93990aded(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_d9689457_433d_47ee_9bc2_add310dc90db(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0, r = n - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) > x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_de62b5e7_2b8c_48b8_90e4_2c59e8243b0a(ArrayList<Integer> a, int x) {
        int lo = 0;
        int hi = a.size()-1;
        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) < x) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return lo;
    }

    
    public static int leftInsertion_Problem_2_bd6fb50d_454b_4214_bc4d_0789f109561c(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) > x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_c5a2a5ed_2fff_4f70_bba0_917aa5ce7241(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_44521739_8d19_4c14_92d7_65a8ce36444a(ArrayList<Integer> a, int x) {
        int min = Collections.min(a);
        if (x == min) return 0;
        else if (x < min) return Collections.binarySearch(a, min) - 1;
        else return Collections.binarySearch(a, x) - 1;
    }

    
    public static int leftInsertion_Problem_2_73173a7f_9e07_4698_81c2_84fdc865d31a(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0;
        int r = n - 1;
        while (l < r) {
            int mid = (l + r) / 2;
            if (a.get(mid) < x) {
                l = mid + 1;
            } else {
                r = mid;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_21461799_5768_4adf_bd51_34ead0ca0e87(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_929269f1_1d72_446b_bc0f_5b6dd9dd7344(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_648066c5_6571_42bc_a9f5_93c08b00b8c0(ArrayList<Integer> a, int x) {
        int lo = 0;
        int hi = a.size() - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) < x) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return lo;
    }

    
    public static int leftInsertion_Problem_0_b08faf2d_edd1_416d_90a2_53d57ac747d2(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_86851f59_2c27_4dd3_b7d7_2bab816fb49c(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_c5f7f99f_14f7_48ee_acf7_2177cdd1e17a(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_edebeb89_35df_4168_93f8_502c6cf830bd(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get( m) == x) {
                return m;
            } else if (a.get( m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_0209af93_28bf_4ce1_b2ba_6c889e54ebff(ArrayList<Integer> a, int x) {
        int low = 0;
        int high = a.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    
    public static int leftInsertion_Problem_2_16ece67d_e1c6_49ed_a647_be56f63dced3(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0;
        int r = n - 1;
        int mid = 0;
        while (l <= r) {
            mid = (l + r) / 2;
            if (x > a.get(mid)) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_9e8a657f_fd35_4afb_a3ec_0a9172919ac4(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_fca8b5de_7e62_4f67_aebf_220ea858b322(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0, r = n - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_4fdf4c5e_f90f_41cc_a5f4_b018342d1b08(ArrayList<Integer> a, int x) {
        int low = 0;
        int high = a.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x > a.get(mid)) high = mid - 1;
            if (x < a.get(mid)) low = mid + 1;
            if (mid > 0)
                if (x < a.get(mid - 1)) high = mid - 1;
                if (x > a.get(mid + 1)) low = mid + 1;
        }
        if (low > high) {
            return low;
        } else {
            a.add(low, x);
            a.add(high, x);
            return low + 1;
        }
    }

    
    public static int leftInsertion_Problem_1_fa6abc67_d1da_4853_bd80_c339c67ef2e9(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_cfa421b3_c53e_43d3_a7b9_eaef53b5b3f8(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size();
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_c79bf331_4900_4f16_ba1e_cb9d79253c6e(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (a.get(m) == x) {
                return m;
            }
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_c5f97816_a2d5_453b_af36_4cdd08eac3f1(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get( m) == x) {
                return m;
            } else if (a.get( m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_e4069b37_d5ef_4d9b_a2de_04fbe7d25596(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_934faa85_96e2_408a_925c_c5151d6137aa(ArrayList<Integer> a, int x) {
        int i = 0;
        while(i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_16884574_b23c_43db_88ca_bf354c9d2dce(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_10755c05_46f4_43a1_8e58_96c741bf2b27(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0, r = n - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) >= x) {
                r = m;
            } else {
                l = m + 1;
            }
        }
        if (a.get(l) < x) {
            return l + 1;
        } else {
            return l;
        }
    }

    
    public static int leftInsertion_Problem_2_8682c081_83ad_4793_84c0_9202e89c7f7a(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_3a1e40dc_d559_42b8_8be5_5f5219a62472(ArrayList<Integer> a, int x) {
        int low = 0;
        int high = a.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    
    public static int leftInsertion_Problem_2_009ac5d3_97af_4dd3_9e79_c7e8c6c2e7ee(ArrayList<Integer> a, int x) {
        int left = 0;
        int right = a.size() - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) > x) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    
    public static int leftInsertion_Problem_2_782fb18c_bd74_487d_8150_e875ac85e56e(ArrayList<Integer> a, int x) {
        int i = 0;
        int j = a.size() - 1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) < x) {
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_7dd493f9_8f15_4994_9671_5e4e3083e24d(ArrayList<Integer> a, int x) {
        int lo = 0;
        int hi = a.size() - 1;
        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if (a.get(mid) < x) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return lo;
    }

    
    public static int leftInsertion_Problem_1_02bcbc0e_f2e0_47c7_aece_12e7558feee0(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_3e9329ff_f49f_4e62_87e3_32247b4f389f(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get( m) == x) {
                return m;
            } else if (a.get( m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_941728e8_4d2f_45ec_abe9_85d624b2d4f8(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_dfa5cf75_26bd_44c6_9d2b_cd641ef3e45c(ArrayList<Integer> a, int x) {
        int low = 0;
        int high = a.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }

    
    public static int leftInsertion_Problem_1_bf457f08_8de6_469d_a0ad_babdc5b4bd11(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_a35941c3_bf07_418c_9692_448aadf52c98(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) > x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_313bc4ac_5278_4b1e_a075_69ee346d719b(ArrayList<Integer> a, int x) {
        int i = 0;
        boolean found = False;
        while (i < a.size() && !found) {
            if (a.get(i) < x) {
                i++;
            } else {
                found = True;
            }
        }
        
        return i;
    }

    
    public static int leftInsertion_Problem_2_2b94548c_52ab_4211_a2c6_e576487d4d01(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_29df1537_0567_48b6_83bf_3084dd2009c4(ArrayList<Integer> a, int x) {
        int i = 0;
        int j = a.size() - 1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (a.get(mid) < x) {
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_a89d2b01_cab7_4a53_b6fb_0b62bc6db8b1(ArrayList<Integer> a, int x) {
        int index = Collections.binarySearch(a, x);
        if (index < 0) {
            return -(index + 1);
        } else {
            return index;
        }
    }

    
    public static int leftInsertion_Problem_0_81734291_3a05_4c5a_9052_75c8378119d4(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_0e90249e_c7de_4198_91a3_539267e4d3e0(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_7d68b3e3_9ef4_4a92_9906_8b430c681643(ArrayList<Integer> a, int x) {
        int left = 0;
        int right = a.size() - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) > x) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    
    public static int leftInsertion_Problem_1_41f5071d_430e_43f6_a3fa_f5398bccbffb(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0;
        int r = n - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_c530c3e8_37a9_4c7e_ba6a_4c16415cfe81(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_9ac877df_4927_465e_8fde_ab07a82fd97e(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_f5e37530_b221_431f_a9e7_c07afe0c5185(ArrayList<Integer> a, int x) {
        int i = 0;
        while(i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_696be341_b04c_47a6_a429_151883d213cc(ArrayList<Integer> a, int x) {
        int i = 0;
        while(i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_0209af93_28bf_4ce1_b2ba_6c889e54ebff(ArrayList<Integer> a, int x) {
        int low = 0;
        int high = a.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    
    public static int leftInsertion_Problem_2_d6f097b6_040d_4956_961a_a9d571ad51d3(ArrayList<Integer> a, int x) {
        return -1; // TODO: implement this function
    }

    
    public static int leftInsertion_Problem_1_d6f097b6_040d_4956_961a_a9d571ad51d3(ArrayList<Integer> a, int x) {
        return -1; // TODO: implement this function
    }

    
    public static int leftInsertion_Problem_0_00482753_a6a1_4b38_a896_7737d625bd86(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_c42c2188_52d0_4126_9340_237234269af2(ArrayList<Integer> a, int x) {
        int i = 0;
        while(i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_fdd988ff_8593_4534_b5e1_6deb6d542249(ArrayList<Integer> a, int x) {
        // Write - Your - Code
        int left = 0;
        int right = a.size() - 1;
        while (left < right) {
            int mid = (left + right) / 2;
            if (a.get(mid) < x) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }

    
    public static int leftInsertion_Problem_0_d7d1f40d_be62_4dae_b69c_76db272faa08(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_10755c05_46f4_43a1_8e58_96c741bf2b27(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0, r = n - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) >= x) {
                r = m;
            } else {
                l = m + 1;
            }
        }
        if (a.get(l) < x) {
            return l + 1;
        } else {
            return l;
        }
    }

    
    public static int leftInsertion_Problem_1_cfa421b3_c53e_43d3_a7b9_eaef53b5b3f8(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size();
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_5e4b4185_8562_46b7_96d1_ecbfc49d56a9(ArrayList<Integer> a, int x) {
        int low = 0;
        int high = a.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }

    
    public static int leftInsertion_Problem_1_681034f7_842d_4bcf_ae4c_2f5800295346(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_34d6ef68_1412_4b05_b8fc_ae2dda158edf(ArrayList<Integer> a, int x) {
        if (a.size() == 0) return 0;
        if (a.get(a.size() - 1) <= x) return a.size();
        int l = 0, r = a.size() - 1;
        while (l < r) {
            int mid = (l + r) / 2;
            if (a.get(mid) <= x) l = mid + 1;
            else r = mid;
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_a74e8b96_a5a4_4b92_90e1_fc69d5c137e9(ArrayList<Integer> a, int x) {
        int i = 0;
        int j = a.size() - 1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) < x) {
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_14e277af_f6dd_44e5_b5bf_cb4068665221(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0, r = n - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_15e5dfde_6140_4e2f_be61_88d4d0840b5b(ArrayList<Integer> a, int x) {
        int lo = 0;
        int hi = a.size() - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (x <= a.get(mid)) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return lo;
    }

    
    public static int leftInsertion_Problem_2_6fa2d90a_54f1_4f77_9587_99ad9f58fceb(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_1bd0229f_7ee3_41b7_9958_fd4e77e33a24(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get( m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_4d48fe40_312b_4ffb_b7bf_bb5dd6390b5d(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) < x)
                l = m + 1;
            else
                r = m - 1;
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_f3a94335_ab76_4cd7_a5a8_97c9178c078a(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_2e5f6766_cc47_4941_9e9a_02c940e3ea40(ArrayList<Integer> a, int x) {
        int i = 0;
        int j = a.size() - 1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (a.get(mid) < x) {
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_8ecd5517_e4dd_45b5_afc5_a0f6cd188720(ArrayList<Integer> a, int x) {
        int i = 0;
        while(i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_94647665_c92d_4e1d_a8fa_1e05ef3eb636(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0, r = n - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_c8a12e64_3734_4631_98f9_6003d4393c68(ArrayList<Integer> a, int x) {
        int left = 0;
        int right = a.size() - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) > x) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    
    public static int leftInsertion_Problem_2_fdc4628d_48e6_4082_8297_aba195f6b518(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_4594895a_c033_4701_ba2b_7f8e9cd4ea2f(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_a89d2b01_cab7_4a53_b6fb_0b62bc6db8b1(ArrayList<Integer> a, int x) {
        int index = Collections.binarySearch(a, x);
        if (index < 0) {
            return -(index + 1);
        } else {
            return index;
        }
    }

    
    public static int leftInsertion_Problem_1_72260940_3b31_4cff_898e_e483e7c28d29(ArrayList<Integer> a, int x) {
        // Binary search
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_3a1e40dc_d559_42b8_8be5_5f5219a62472(ArrayList<Integer> a, int x) {
        int low = 0;
        int high = a.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    
    public static int leftInsertion_Problem_0_59272947_1035_4e2e_bf10_3571e6c4a075(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) > x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_44521739_8d19_4c14_92d7_65a8ce36444a(ArrayList<Integer> a, int x) {
        int min = Collections.min(a);
        if (x == min) return 0;
        else if (x < min) return Collections.binarySearch(a, min) - 1;
        else return Collections.binarySearch(a, x) - 1;
    }

    
    public static int leftInsertion_Problem_2_5e02e26a_bc12_4492_9eab_c4fc88dd7872(ArrayList<Integer> a, int x) {
        int left = 0;
        int right = a.get(0); // get first element
        while (right < a.size() - 1) { // while right is less than the size of the array
            if (x <= right) { // if x is less than the right element
                left = right + 1; // set left to the right element + 1
            } else {
                left++; // if x is greater than the right element, set left to right element + 1
            }
            right++; // increment right by 1
        }
        return left; // return the left insertion point
    }

    
    public static int leftInsertion_Problem_0_61ef73a5_6f7b_45b7_8b85_6ef2db877eef(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_7dd493f9_8f15_4994_9671_5e4e3083e24d(ArrayList<Integer> a, int x) {
        int lo = 0;
        int hi = a.size() - 1;
        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if (a.get(mid) < x) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return lo;
    }

    
    public static int leftInsertion_Problem_2_a7243909_b446_492b_b4de_f2c10d1e1e31(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0, r = n - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_16ece67d_e1c6_49ed_a647_be56f63dced3(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0;
        int r = n - 1;
        int mid = 0;
        while (l <= r) {
            mid = (l + r) / 2;
            if (x > a.get(mid)) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_ddb2a8a5_85f5_4cac_ad8a_81974310c3a4(ArrayList<Integer> a, int x) {
        // Write - Your - Code
        int low = 0;
        int high = a.size() - 1;
        int mid = 0;
        while (low <= high) {
            mid = (low + high) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    
    public static int leftInsertion_Problem_2_70ae3e9d_e6da_48db_bc83_453eee68914e(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_d1a3e408_bb4d_43ba_a9ce_95cdebed7edf(ArrayList<Integer> a, int x) {
        return Collections.binarySearch(a, x);
    }

    
    public static int leftInsertion_Problem_0_e062551a_3ca6_4551_8ceb_e0d9202b7b40(ArrayList<Integer> a, int x) {
        if (a.size() == 0) return 0;
        int l = 0, r = a.size() - 1;
        while (l < r) {
            int mid = (l + r) / 2;
            if (a.get(mid) < x) l = mid + 1;
            else r = mid;
        }
        return a.get(l) >= x ? l : l + 1;
    }

    
    public static int leftInsertion_Problem_1_b56062ea_a91a_4b99_b47e_8384b614c93c(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_99569999_6c3b_4900_b360_8e6a72481311(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_3f129c66_e71e_43e3_bc7f_3e27511fcf1e(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0;
        int r = n - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_9747a05e_5677_4b7f_b98a_73fcd594240a(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_bb90046b_189e_4791_a7d5_5f31d99cc7b4(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_dfa5cf75_26bd_44c6_9d2b_cd641ef3e45c(ArrayList<Integer> a, int x) {
        int low = 0;
        int high = a.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }

    
    public static int leftInsertion_Problem_2_e2f512d5_ba22_4403_977a_5b7280e509fd(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_97fa7b19_5f34_438a_983f_2d77acfb2c5f(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get( m) == x) {
                return m;
            } else if (a.get( m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_3d4f2b8c_9a25_4d5a_9fe4_1cb488defb7f(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_63e85437_debf_4868_be18_57cdbe6614d3(ArrayList<Integer> a, int x) {
        int left = 0;
        int right = a.size() - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) > x) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    
    public static int leftInsertion_Problem_2_f60dbc8b_4738_4a64_8f62_046d1543566b(ArrayList<Integer> a, int x) {
        int lo = 0;
        int hi = a.size() - 1;
        while (lo < hi) {
            int mid = (lo + hi) / 2;
            if (a.get(mid) < x) {
                lo = mid + 1;
            } else {
                hi = mid;
            }
        }
        return lo;
    }

    
    public static int leftInsertion_Problem_1_1aeee9f7_9124_4ca0_8578_21ab4d6064be(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (a.get(m) >= x)
                r = m - 1;
            else
                l = m + 1;
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_d2f58aad_9fb2_46e2_a32e_9f26221a5a5d(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get( m) == x) {
                return m;
            } else if (a.get( m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_928d908c_319a_493b_bb08_2f4df70aa193(ArrayList<Integer> a, int x) {
        return Collections.binarySearch(a, x);
    }

    
    public static int leftInsertion_Problem_2_0b1fb858_e258_45ed_bfa2_20de6d5ccf67(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_4206dff5_c56d_47a2_bae1_e84de4d08590(ArrayList<Integer> a, int x) {
        int start = 0;
        int end = a.size() - 1;
        int mid = (start + end) / 2;
        while (start <= end && a.get(mid) < x) {
            if(a.get(mid) == x) {
                return mid;
            }
            if(a.get(mid) > x) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
            mid = (start + end) / 2;
        }
        return -1;
    }

    
    public static int leftInsertion_Problem_0_92c57932_f315_463f_a501_6864767b4b28(ArrayList<Integer> a, int x) {
        int low = 0, high = a.size() - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int midValue = a.get(mid);

            if (midValue < x) {
                low = mid + 1;
            } else if (midValue > x) {
                high = mid - 1;
            } else {
                return mid;
            }
        }
        return low;
    }

    
    public static int leftInsertion_Problem_1_0d02f193_9cfd_4c79_b5df_1bc897bec614(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (a.get(m) >= x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_f5e37530_b221_431f_a9e7_c07afe0c5185(ArrayList<Integer> a, int x) {
        int i = 0;
        while(i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_9fb252da_dde8_4e57_8adf_c844b6f262f6(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_df6aa422_f51e_45d8_85de_daceb4326025(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_cf08f2a6_1500_489d_99f3_b0c947560da9(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_63ee34d4_7157_4eb8_91f1_8b94e69bccc1(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_3d4f2b8c_9a25_4d5a_9fe4_1cb488defb7f(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_f02358d4_3da7_4243_8f4d_c924963a665a(ArrayList<Integer> a, int x) {
        int low = 0;
        int high = a.size() - 1;
        int mid = 0;
        while (low <= high) {
            mid = (low + high) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    
    public static int leftInsertion_Problem_1_ae9f68ed_5cac_4ed4_bee7_9d2c53393bd5(ArrayList<Integer> a, int x) {
        int i = 0;
        while(i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_ae4ca3f0_4900_4695_a06e_6094193dd386(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_aca6e635_5fd8_4ccf_8457_048ee5883e42(ArrayList<Integer> a, int x) {
        // Binary search
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_5df5f81a_9a99_47fd_855e_f03c61613d5e(ArrayList<Integer> a, int x) {
        int lo = 0;
        int hi = a.size() - 1;
        while (lo < hi) {
            int mid = (lo + hi) / 2;
            if (a.get(mid) < x) {
                lo = mid + 1;
            } else {
                hi = mid;
            }
        }
        return lo;
    }

    
    public static int leftInsertion_Problem_1_24690c19_9576_4fd0_b131_be23d658e185(ArrayList<Integer> a, int x) {
        int i = 0;
        while(i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_928d908c_319a_493b_bb08_2f4df70aa193(ArrayList<Integer> a, int x) {
        return Collections.binarySearch(a, x);
    }

    
    public static int leftInsertion_Problem_2_b1c7d2b3_af4b_40aa_8f47_58eadcb1b9d0(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_61ab6d8b_1b8d_4086_8203_8c7a50fbbdd8(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0, r = n - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_9fb252da_dde8_4e57_8adf_c844b6f262f6(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_1bd0229f_7ee3_41b7_9958_fd4e77e33a24(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get( m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_fd748118_753b_40db_8bc9_22c73ec5eb1c(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0;
        int r = n - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_1743e432_2f17_4b8b_92e5_9b50494b0b79(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_ef20686a_75dc_47ff_8f4f_ca2e1555500b(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get( m) == x) {
                return m;
            } else if (a.get( m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_5df5f81a_9a99_47fd_855e_f03c61613d5e(ArrayList<Integer> a, int x) {
        int lo = 0;
        int hi = a.size() - 1;
        while (lo < hi) {
            int mid = (lo + hi) / 2;
            if (a.get(mid) < x) {
                lo = mid + 1;
            } else {
                hi = mid;
            }
        }
        return lo;
    }

    
    public static int leftInsertion_Problem_2_b9404433_b011_41a3_bcf6_798caf99830d(ArrayList<Integer> a, int x) {
        // Write - Your - Code
        int low = 0;
        int high = a.size() - 1;
        int mid = 0;
        while (low <= high) {
            mid = (low + high) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }

    
    public static int leftInsertion_Problem_0_f83fa504_172c_41bf_92eb_ffbac77fb519(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_73ce71ac_83ec_4955_8c82_3e990a65c941(ArrayList<Integer> a, int x) {
        int lo = 0;
        int hi = a.size() - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) > x) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return lo;
    }

    
    public static int leftInsertion_Problem_1_82555770_8f36_427f_91d8_1c3cc9b5c52b(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_29df1537_0567_48b6_83bf_3084dd2009c4(ArrayList<Integer> a, int x) {
        int i = 0;
        int j = a.size() - 1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (a.get(mid) < x) {
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_4af40a06_7938_4226_811b_464b0a6581e3(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_9b31183b_b6ea_4b09_9906_ba5ed0864563(ArrayList<Integer> a, int x) {
        int i = 0;
        int j = a.size() - 1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (a.get(mid) < x) {
                i = mid + 1;
            } else if (a.get(mid) > x) {
                j = mid - 1;
            } else {
                return mid;
            }
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_51031fd9_cdcc_4db9_bdcf_b8e255f934f1(ArrayList<Integer> a, int x) {
        int pos = -1;
        // loop through the array from start to end and compare the values
        for(int i = 0; i < a.size(); i++) {
            if(a.get(i) >= x) {
                // if the value is greater than the specified value
                if(x < a.get(i)) {
                    pos = i;
                    break;
                }
                else {
                    // if the value is less than the specified value, we did not find a match
                    pos = -1;
                    break;
                }
            }
        }
        // if the value is less than the specified value
        if(pos == -1) {
            return 0;
        }
        else {
            // else return the index of the value that is less than the specified value
            return pos;
        }
    }

    
    public static int leftInsertion_Problem_2_87d8024b_1767_45af_b49b_55a5e64cc700(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_9279a6b2_a024_47d6_b761_129747f087d5(ArrayList<Integer> a, int x) {
        int left = 0;
        int right = a.get(0); // get first element
        while (right < a.size() - 1) { // while right is less than the size of the array
            if (x <= right) { // if x is less than right
                left = right + 1; // set left to the right plus one
            } else { // if x is greater than right
                left = right - 1; // set left to the right minus one
            }
            right++; // increment right
        }
        return left; // return the left insertion point
    }

    
    public static int leftInsertion_Problem_0_62e9aacf_ddbf_4f51_bbfb_a3ba9f90cc70(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_cb5ad0e1_7545_43ff_b634_060b300f7769(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_1bd0229f_7ee3_41b7_9958_fd4e77e33a24(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get( m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_3d308fbc_1b89_4caf_a0a8_25e20558e9e5(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_f868728a_ba36_4780_8626_35120d1e33ef(ArrayList<Integer> a, int x) {
        int lo = 0;
        int hi = a.size() - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (a.get(mid) < x) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return lo;
    }

    
    public static int leftInsertion_Problem_0_3a1e40dc_d559_42b8_8be5_5f5219a62472(ArrayList<Integer> a, int x) {
        int low = 0;
        int high = a.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    
    public static int leftInsertion_Problem_1_7c508be0_bd67_49e8_93e1_17d3febfd06a(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_941728e8_4d2f_45ec_abe9_85d624b2d4f8(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_009ac5d3_97af_4dd3_9e79_c7e8c6c2e7ee(ArrayList<Integer> a, int x) {
        int left = 0;
        int right = a.size() - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) > x) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    
    public static int leftInsertion_Problem_2_1ef3da60_e6ca_40d7_877f_342d9bb349ac(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_b8bf35a9_ec3f_4a38_a654_7236a78da870(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0, r = n - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_c6b3a682_4945_4012_a016_ab1a49d3611e(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_60de35b4_8d33_4481_a928_aa795143fbb5(ArrayList<Integer> a, int x) {
        int i = 0;
        while(i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_b3120f44_40a8_4143_b7e6_0a921629ea92(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_a88aad3f_9d22_493e_9047_5a10558d0d08(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_37d70147_45a2_4b0d_8737_b9ace4da2385(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_d964f095_be65_451d_b711_db6a45263d72(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_22ec5f73_8068_4697_8f4b_a9dd6d662e46(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_2907dd53_5c21_4c41_accb_115697f62476(ArrayList<Integer> a, int x) {
        // Write your code here
        int low = 0;
        int high = a.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (a.get( mid) == x) {
                return mid;
            } else if (a.get( mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    
    public static int leftInsertion_Problem_2_04f46739_c4ec_4059_8bc2_b46ab2c941fc(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_ff47de4b_6a41_44d3_98a1_b5f953866286(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_03159ca5_1694_45d0_96a6_be4526f0fa74(ArrayList<Integer> a, int x) {
        int low = 0;
        int high = a.size() - 1;
        int mid = 0;
        while (low < high) {
            mid = (low + high) / 2;
            if (a.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }

    
    public static int leftInsertion_Problem_0_91080372_7d83_4645_a604_8677f5ffd453(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_8dc291a2_27ec_4068_a4f7_79bf9adca68e(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) > x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_a77f515a_951d_423c_8cc9_3b647f3cdddf(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_00287734_281c_4588_a0de_3f5fade38476(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_928d908c_319a_493b_bb08_2f4df70aa193(ArrayList<Integer> a, int x) {
        return Collections.binarySearch(a, x);
    }

    
    public static int leftInsertion_Problem_1_aed35e9e_bb6a_446c_ad97_e1391fc810d3(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0;
        int r = n - 1;
        int m = 0;
        while (l <= r) {
            m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_c5f97816_a2d5_453b_af36_4cdd08eac3f1(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get( m) == x) {
                return m;
            } else if (a.get( m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_a1c8b87a_ff8f_403b_b023_a708d4988e76(ArrayList<Integer> a, int x) {
        if (x < a.get(0)) {
            return 1;
        } else if (x > a.get(a.size()-1)) {
            return a.size()-1;
        } else {
            int low = 0;
            int high = a.size()-1;
            while (low < high) {
                int mid = (low+high)/2;
                if (x < a.get(mid)) {
                    low = mid + 1;
                } else {
                    high = mid;
                }
            }
            return low;
        }
    }

    
    public static int leftInsertion_Problem_0_81df455d_474b_44e3_83d5_92948ceec0db(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0, r = n - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x)
                return m;
            else if (a.get(m) < x)
                l = m + 1;
            else
                r = m - 1;
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_12a85099_e231_4914_a592_0c57a065274b(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_ecbeebcd_02ee_4c5c_8fb6_0356603e6ded(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_13df4cbf_713a_440d_9b58_50db5de0f665(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_d8fc851e_9290_42f1_ae56_152c8022d3aa(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_e3ee864b_9e58_45a9_9e94_f54eb7382151(ArrayList<Integer> a, int x) {
        // Your code goes here
        int left_insertion_point = 0;
        int i = 0;
        while (i < a.size() - 1 && x > a.get(i)) {
            left_insertion_point++;
            i++;
        }
        i++;
        while (i < a.size() && x > a.get(i)) {
            left_insertion_point++;
            i++;
        }
        return left_insertion_point;
    }

    
    public static int leftInsertion_Problem_2_d029e802_bc6e_4588_9ae3_061accfdeddb(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0, r = n - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_9ecff97b_6455_4dde_90db_931669d32a4c(ArrayList<Integer> a, int x) {
        int lo = 0;
        int hi = a.size() - 1;
        while (lo < hi) {
            int mid = (lo + hi) / 2;
            if (a.get(mid) < x) {
                lo = mid + 1;
            } else {
                hi = mid;
            }
        }
        return lo;
    }

    
    public static int leftInsertion_Problem_1_16884574_b23c_43db_88ca_bf354c9d2dce(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_9747a05e_5677_4b7f_b98a_73fcd594240a(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_c42c2188_52d0_4126_9340_237234269af2(ArrayList<Integer> a, int x) {
        int i = 0;
        while(i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_1a5a5f55_3990_49b6_8127_fa4b28c680ea(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            }
            if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_c9a4991f_efe4_463e_bf46_69fa30097832(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0, r = n - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_090c98c0_19ce_4bea_8cdc_df860b2df17c(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_ff0a3b3e_b7c5_4523_8121_5af97a2c8e8a(ArrayList<Integer> a, int x) {
        int lo = 0;
        int hi = a.size() - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (a.get(mid) < x) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return lo;
    }

    
    public static int leftInsertion_Problem_0_e25dc101_d94b_44e0_b198_0c3c49dc413b(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_f6799bbd_3f28_451b_adaa_decdfa17c42f(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0;
        int r = n - 1;
        int mid = 0;
        while (l <= r) {
            mid = (l + r) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) < x) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_e99320ad_d7af_4772_876f_7f8f2e7c3324(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_0f8406a7_d192_4aba_ac08_366535be7615(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            }
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_6fa3108e_45a1_4964_9f98_87aeebe540b5(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_a55c3b22_54ef_4114_9997_14045cb5db38(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_14e277af_f6dd_44e5_b5bf_cb4068665221(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0, r = n - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_2eb7751a_6478_426b_b301_2512546e8768(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_dc2ebb02_4337_4b53_b3ae_213ee340d9c7(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_a4db0988_d54a_4a96_a55a_0beacfb61dd8(ArrayList<Integer> a, int x) {
        int i = 0;
        int j = a.size() - 1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (a.get(mid) < x) {
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_2d655ae4_9649_434e_ace8_a3541c9320be(ArrayList<Integer> a, int x) {
        int i = 0;
        int j = a.size() - 1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (a.get(mid) < x) {
                i = mid + 1;
            } else if (a.get(mid) > x) {
                j = mid - 1;
            } else {
                return mid;
            }
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_5df5f81a_9a99_47fd_855e_f03c61613d5e(ArrayList<Integer> a, int x) {
        int lo = 0;
        int hi = a.size() - 1;
        while (lo < hi) {
            int mid = (lo + hi) / 2;
            if (a.get(mid) < x) {
                lo = mid + 1;
            } else {
                hi = mid;
            }
        }
        return lo;
    }

    
    public static int leftInsertion_Problem_2_ea91ac95_a1e5_48d6_9b4a_fc1eb9eb2f4c(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_b17e7d54_6848_47b3_a2e8_8bcb98b6b214(ArrayList<Integer> a, int x) {
        int low = 0;
        int high = a.size() - 1;
        int mid = 0;
        while (low <= high) {
            mid = (low + high) / 2;
            if (x > a.get(mid)) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }

    
    public static int leftInsertion_Problem_1_a163fd6e_c8c4_4f8b_8cb0_8253d152c6a9(ArrayList<Integer> a, int x) {
        int lo = 0;
        int hi = a.size() - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (a.get( mid) < x) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return lo;
    }

    
    public static int leftInsertion_Problem_0_10755c05_46f4_43a1_8e58_96c741bf2b27(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0, r = n - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) >= x) {
                r = m;
            } else {
                l = m + 1;
            }
        }
        if (a.get(l) < x) {
            return l + 1;
        } else {
            return l;
        }
    }

    
    public static int leftInsertion_Problem_2_ae4ca3f0_4900_4695_a06e_6094193dd386(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_e83dd92c_d557_45ee_8d6a_7d82dcb30356(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0, r = n - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_8bbd239e_1609_486c_b07d_600b410f7af2(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_4c393fb8_74c1_4f0f_9180_0b5993f2a93c(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_1bd0229f_7ee3_41b7_9958_fd4e77e33a24(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get( m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_34d6ef68_1412_4b05_b8fc_ae2dda158edf(ArrayList<Integer> a, int x) {
        if (a.size() == 0) return 0;
        if (a.get(a.size() - 1) <= x) return a.size();
        int l = 0, r = a.size() - 1;
        while (l < r) {
            int mid = (l + r) / 2;
            if (a.get(mid) <= x) l = mid + 1;
            else r = mid;
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_63e85437_debf_4868_be18_57cdbe6614d3(ArrayList<Integer> a, int x) {
        int left = 0;
        int right = a.size() - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) > x) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    
    public static int leftInsertion_Problem_1_3bef690e_cbf5_4b4b_8c8c_c0df2a15e89e(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_8ed10174_4dab_448a_b993_68289a8d627d(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_388dab4a_a364_4743_8913_f19278e0b66f(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_bd63f70c_0abf_4059_9113_776ffc5bc4e1(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0;
        int r = n - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) >= x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_928d908c_319a_493b_bb08_2f4df70aa193(ArrayList<Integer> a, int x) {
        return Collections.binarySearch(a, x);
    }

    
    public static int leftInsertion_Problem_2_86e74ccd_9b69_401a_a2dd_a4aaf3af3f76(ArrayList<Integer> a, int x) {
        int low = 0;
        int high = a.size() - 1;

        while ((low <= high)) {
            int mid = low + (high - low) / 2;
            if (a.get(mid) >= x) low = mid + 1;
            else high = mid - 1;
        }
        return low;
    }

    
    public static int leftInsertion_Problem_2_022459b5_c70a_4cdc_93a4_1d73287d1114(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) < x)
                l = m + 1;
            else
                r = m;
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_3f129c66_e71e_43e3_bc7f_3e27511fcf1e(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0;
        int r = n - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_c0bb1ad5_686b_4593_9ac3_eab62c22cb5d(ArrayList<Integer> a, int x) {
        if (a.size() == 0) return 0;
        int lo = 0;
        int hi = a.size() - 1;
        while (lo < hi) {
            int mid = (lo + hi) / 2;
            if (a.get(mid) < x) {
                lo = mid + 1;
            } else {
                hi = mid;
            }
        }
        return lo;
    }

    
    public static int leftInsertion_Problem_2_3b90e66e_63a5_492a_86b2_bec77592f0c7(ArrayList<Integer> a, int x) {
        // Write your code here
        // To print results to the standard output you can use System.out.println()
        // Example: System.out.println("Hello world!");
        int l = 0, r = a.size() - 1;
        while(l < r) {
            int mid = (l + r) / 2;
            if(a.get(mid) >= x) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_e83dd92c_d557_45ee_8d6a_7d82dcb30356(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0, r = n - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_9ecff97b_6455_4dde_90db_931669d32a4c(ArrayList<Integer> a, int x) {
        int lo = 0;
        int hi = a.size() - 1;
        while (lo < hi) {
            int mid = (lo + hi) / 2;
            if (a.get(mid) < x) {
                lo = mid + 1;
            } else {
                hi = mid;
            }
        }
        return lo;
    }

    
    public static int leftInsertion_Problem_1_cdd7c969_9515_432f_98a5_5d39e1597645(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0;
        int r = n - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (a.get(m) >= x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_6a2cb328_09db_4b15_88a5_4d701ee4ab42(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_f02358d4_3da7_4243_8f4d_c924963a665a(ArrayList<Integer> a, int x) {
        int low = 0;
        int high = a.size() - 1;
        int mid = 0;
        while (low <= high) {
            mid = (low + high) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    
    public static int leftInsertion_Problem_1_388dab4a_a364_4743_8913_f19278e0b66f(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_d9395b4e_081d_4880_b952_c5c8435ae62c(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) < x) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_dbeea9a7_1de2_42f7_b525_fc46281701d5(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_bb59df7b_e1eb_4792_9845_2ab68c239229(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0;
        int r = n;
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_5699f555_03b9_45eb_b814_aac97c4fa7e8(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_a89d2b01_cab7_4a53_b6fb_0b62bc6db8b1(ArrayList<Integer> a, int x) {
        int index = Collections.binarySearch(a, x);
        if (index < 0) {
            return -(index + 1);
        } else {
            return index;
        }
    }

    
    public static int leftInsertion_Problem_2_d07bbe78_2e47_469b_ae2a_215b9090daab(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_a7b61031_225d_4295_9f25_ef44c46ac4a0(ArrayList<Integer> a, int x) {
        int i = 0;
        int j = a.size() - 1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (a.get(mid) < x) {
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_51fb6192_4791_4134_ae73_e1e911bdad96(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size();
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get( m) < x) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_2300c325_df95_44ec_84a6_66ca08551624(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_a9c3da70_9cd3_4810_a102_bcf93a328795(ArrayList<Integer> a, int x) {
        int low = 0, high = a.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }

    
    public static int leftInsertion_Problem_0_2271f33d_ce62_45dc_9c05_cab7cc45e605(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_72d40f0c_52bd_4847_9e0b_4e9e27f9ea86(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_4e0ea9dd_41c1_4648_bd16_eee4ceb7d2ac(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_4f02411b_856c_44c9_aac0_e38a7418a7c5(ArrayList<Integer> a, int x) {
        int i = 0;
        while(i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_c324f79b_0ea8_4592_8ab5_c076d276b2d2(ArrayList<Integer> a, int x) {
        int left = 0;
        int right = a.size() - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) > x) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    
    public static int leftInsertion_Problem_2_dbb5b594_8005_4517_8fef_bad1d75235c3(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_b0183ac7_a71b_4a70_8f07_4552bd400e3d(ArrayList<Integer> a, int x) {
        int l = 0;
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) < x) {
                l++;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_b38bf438_d39c_46ed_b6ae_87a73ca73eea(ArrayList<Integer> a, int x) {
        int lo = 0;
        int hi = a.size() - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (x == a.get(mid)) {
                return mid;
            } else if (x < a.get(mid)) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return lo;
    }

    
    public static int leftInsertion_Problem_1_5b8e346d_7c57_4be8_97d6_fa2a6d759044(ArrayList<Integer> a, int x) {
        // Write your code here
        // To print results to the standard output you can use System.out.println()
        // Example: System.out.println("Hello world!");
        int low = 0;
        int high = a.size() - 1;
        int mid = 0;
        while (low <= high) {
            mid = (low + high) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }

    
    public static int leftInsertion_Problem_1_4d6f5d1e_921d_4697_b4a2_68993a67c01d(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_7cc6c843_90f8_4b35_9f76_5ac3bd241fbf(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_49354172_adf7_48e1_9694_fc398d40f6bc(ArrayList<Integer> a, int x) {
        int i = 0;
        while(i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_6fa2d90a_54f1_4f77_9587_99ad9f58fceb(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_b2a95aa3_5812_4dfe_9e5b_1ef972660280(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_a1654e6a_e5d5_45e8_bab9_df7dac9a59e3(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0, r = n - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_c9cd2f69_b969_4abc_b483_afcca1105dc8(ArrayList<Integer> a, int x) {
        int low = 0, high = a.size() - 1, mid;
        while ((low <= high) && (x == a.get(low))) {
            mid = (low + high) / 2;
            while (x <= a.get(mid)) {
                high = mid - 1;
            }
            while (x >= a.get(mid)) {
                low = mid + 1;
            }
            if (mid < high) {
                return mid;
            }
        }
        return -1;
    }

    
    public static int leftInsertion_Problem_2_fdfec69a_5754_4d3c_a465_e07013dfa6c8(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) >= x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_f9bb478f_cf00_47d9_b025_a49d40576e43(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_ef20686a_75dc_47ff_8f4f_ca2e1555500b(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get( m) == x) {
                return m;
            } else if (a.get( m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_97fa7b19_5f34_438a_983f_2d77acfb2c5f(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get( m) == x) {
                return m;
            } else if (a.get( m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_72d40f0c_52bd_4847_9e0b_4e9e27f9ea86(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_099747d7_4a29_4610_b3e2_202848e425b0(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get( m) == x) {
                return m;
            } else if (a.get( m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_681034f7_842d_4bcf_ae4c_2f5800295346(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_6210b452_c882_46ea_a23d_a12dbd6af8e0(ArrayList<Integer> a, int x) {
        int i = 0;
        int j = a.size() - 1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (a.get(mid) < x) {
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_486c5805_a826_4a95_8009_4a17d4aea2da(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_5d7f8d2b_30d7_4390_80bd_ce917c848ad2(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_c9a4991f_efe4_463e_bf46_69fa30097832(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0, r = n - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_a89d2b01_cab7_4a53_b6fb_0b62bc6db8b1(ArrayList<Integer> a, int x) {
        int index = Collections.binarySearch(a, x);
        if (index < 0) {
            return -(index + 1);
        } else {
            return index;
        }
    }

    
    public static int leftInsertion_Problem_0_3d76cec4_0868_4d20_9373_3a3d5a57f70f(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0;
        int r = n - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_c8a12e64_3734_4631_98f9_6003d4393c68(ArrayList<Integer> a, int x) {
        int left = 0;
        int right = a.size() - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) > x) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    
    public static int leftInsertion_Problem_0_3db3c1cb_760e_4254_9312_94b6190aab51(ArrayList<Integer> a, int x) {
        int i = 0;
        int j = a.size() - 1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (a.get(mid) < x) {
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_2e5f6766_cc47_4941_9e9a_02c940e3ea40(ArrayList<Integer> a, int x) {
        int i = 0;
        int j = a.size() - 1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (a.get(mid) < x) {
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_d2f58aad_9fb2_46e2_a32e_9f26221a5a5d(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get( m) == x) {
                return m;
            } else if (a.get( m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_8036ca2f_4c66_4ce3_820b_e31cc78b5df5(ArrayList<Integer> a, int x) {
        int left = 0;
        int right = a.size() - 1;
        while (left < right) {
            int mid = (left + right) / 2;
            if (a.get(mid) < x) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }

    
    public static int leftInsertion_Problem_1_81734291_3a05_4c5a_9052_75c8378119d4(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_38a03503_959a_4f16_a507_a4b93990aded(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_b38bf438_d39c_46ed_b6ae_87a73ca73eea(ArrayList<Integer> a, int x) {
        int lo = 0;
        int hi = a.size() - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (x == a.get(mid)) {
                return mid;
            } else if (x < a.get(mid)) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return lo;
    }

    
    public static int leftInsertion_Problem_1_e4069b37_d5ef_4d9b_a2de_04fbe7d25596(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_b643f026_a4db_4cea_aa3d_8bb658f4b50a(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_9747a05e_5677_4b7f_b98a_73fcd594240a(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_7809c37a_117d_4825_9275_40434ac0544c(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) > x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_78589b61_2ec8_45eb_b296_1885f22ceeb8(ArrayList<Integer> a, int x) {
        int i = 0;
        int j = a.size() - 1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (a.get(mid) < x) {
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_075c1a13_7b6d_4f60_ad56_0ae7f9cf1806(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_9b31183b_b6ea_4b09_9906_ba5ed0864563(ArrayList<Integer> a, int x) {
        int i = 0;
        int j = a.size() - 1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (a.get(mid) < x) {
                i = mid + 1;
            } else if (a.get(mid) > x) {
                j = mid - 1;
            } else {
                return mid;
            }
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_29710456_fac7_4bb1_8f07_cd3e48612a83(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_1e2841d9_fb1a_44f9_aed9_1d9199cde751(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_deccd74c_da88_4061_9cdf_1bcd0e981645(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_0860d7b1_3849_4604_bee9_b602f9d899fe(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_2871eb27_e220_4a59_86c1_fdc1ef71b765(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_51f2c169_4aa9_46b2_8991_01885c6a627a(ArrayList<Integer> a, int x) {
        boolean found = False;
        for (int i = 0; i < a.size(); i++) {
            if (x == a.get(i)) {
                found = True;
                break;
            }
        }
        if (!found) {
            a.add(x);
        }
        return 0;
    }

    
    public static int leftInsertion_Problem_1_04f46739_c4ec_4059_8bc2_b46ab2c941fc(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_cd163849_bc08_4330_ae97_1a88fccbbbe1(ArrayList<Integer> a, int x) {
        int i = 0;
        int j = a.size() - 1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) < x) {
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_890a9f5a_1201_4790_bdd8_345fb615fe44(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_790e2bfd_4832_4063_8130_5daaeaaab2eb(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_c87a79ef_91b5_4d10_978c_ec8d0ab78183(ArrayList<Integer> a, int x) {
        int low = 0;
        int high = a.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    
    public static int leftInsertion_Problem_1_e99320ad_d7af_4772_876f_7f8f2e7c3324(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_f02358d4_3da7_4243_8f4d_c924963a665a(ArrayList<Integer> a, int x) {
        int low = 0;
        int high = a.size() - 1;
        int mid = 0;
        while (low <= high) {
            mid = (low + high) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    
    public static int leftInsertion_Problem_1_7393c1ae_2add_40b1_8da1_c18c1a82df2c(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_9e297cca_dc0c_453b_ba9d_395bc9e36fba(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_f0fd63f1_e471_458b_808e_60f6e4676227(ArrayList<Integer> a, int x) {
        int i = 0;
        int j = a.size() - 1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) < x) {
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_6389981e_1314_40cb_9fbb_f7e762215db4(ArrayList<Integer> a, int x) {
        int leftIndex = 0;
        int currentX;
        
        for (int i = 0; i < a.size(); i++) {
            currentX = a.get(i);
            if (currentX < x) {
                leftIndex = i;
            }
        }
        
        a.add(leftIndex, x);
        return leftIndex;
    }

    
    public static int leftInsertion_Problem_0_4b588803_77df_4d5c_a86f_87fca0ed5c0e(ArrayList<Integer> a, int x) {
        int i = 0;
        while(i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_890a9f5a_1201_4790_bdd8_345fb615fe44(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_864bddac_15b0_47e2_a7ee_8b3a0a978671(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0;
        int r = n - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_8036ca2f_4c66_4ce3_820b_e31cc78b5df5(ArrayList<Integer> a, int x) {
        int left = 0;
        int right = a.size() - 1;
        while (left < right) {
            int mid = (left + right) / 2;
            if (a.get(mid) < x) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }

    
    public static int leftInsertion_Problem_2_70ae3e9d_e6da_48db_bc83_453eee68914e(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_78b21298_7948_4326_b304_276db6ed28fa(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_1ccd9c78_993b_4f6c_9935_5d99b82bbd1e(ArrayList<Integer> a, int x) {
        int i = 0;
        int j = a.size() - 1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (a.get(mid) < x) {
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_c5f97816_a2d5_453b_af36_4cdd08eac3f1(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get( m) == x) {
                return m;
            } else if (a.get( m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_075c1a13_7b6d_4f60_ad56_0ae7f9cf1806(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_6ca9dd10_e959_42c5_8c46_8b4041fe9fb8(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0, r = n - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) >= x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_70bff59c_e1ed_43c0_8810_e365a3d22775(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_fc8b43cc_7baf_4bdb_8550_e530dc71ba05(ArrayList<Integer> a, int x) {
        int n = a.size();
        if (x <= a.get(0)) {
            return 0;
        }
        if (x > a.get(n - 1)) {
            return n;
        }
        int lo = 0;
        int hi = n - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (x <= a.get(mid)) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return lo;
    }

    
    public static int leftInsertion_Problem_0_a7b38517_2dd0_4746_8ce9_f2c32b314e80(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_67ae05c7_3b7a_4944_89e9_296c6d97dbc9(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_7d8762d1_82dc_423f_9a2e_3624eadb26e4(ArrayList<Integer> a, int x) {
        int low = 0;
        int high = a.size()-1;
        while (low <= high) {
            int mid = (low + high)/2;
            if (x < a.get(mid))
                high = mid - 1;
            else if (x > a.get(mid))
                low = mid + 1;
            else {
                System.out.println("Left Insertion Point: " + mid);
                return mid;
            }
        }
        System.out.println("Left Insertion Point: -1");
        return -1;
    }

    
    public static int leftInsertion_Problem_0_70bff59c_e1ed_43c0_8810_e365a3d22775(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_094b5f66_6f37_4e50_8789_55fdb7e56db0(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_59e10411_9b59_48b7_b866_522fb101b351(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_fd5de8dc_73e1_4464_b3c3_9bcddd342928(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_69759bc2_6456_48b4_b3ef_dbc9590240ea(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_1ef3da60_e6ca_40d7_877f_342d9bb349ac(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_f45a8fa6_2a2d_4214_aae8_3e1c418acf87(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_f65420b8_9d80_4191_b21a_cf8e32e37e77(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_e833699d_7324_4cfd_9c64_0ae5b44bec68(ArrayList<Integer> a, int x) {
        int i = 0;
        while(i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_2c9a81e0_732f_4fe8_adbd_b347b08e50f5(ArrayList<Integer> a, int x) {
        int left = 0;
        int right = a.size() - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) < x) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }

    
    public static int leftInsertion_Problem_2_9747a05e_5677_4b7f_b98a_73fcd594240a(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_a81f707a_bae8_41e5_8bbf_587bebb7d289(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l < r) {
            int mid = (l + r) / 2;
            if (a.get(mid) < x) {
                l = mid + 1;
            } else {
                r = mid;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_929269f1_1d72_446b_bc0f_5b6dd9dd7344(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_be14e084_89cd_4ba3_8067_2a0157b87dae(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_f44396eb_95fc_493a_a2fb_10f83e5bd7ee(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_fd748118_753b_40db_8bc9_22c73ec5eb1c(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0;
        int r = n - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_5b8e346d_7c57_4be8_97d6_fa2a6d759044(ArrayList<Integer> a, int x) {
        // Write your code here
        // To print results to the standard output you can use System.out.println()
        // Example: System.out.println("Hello world!");
        int low = 0;
        int high = a.size() - 1;
        int mid = 0;
        while (low <= high) {
            mid = (low + high) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }

    
    public static int leftInsertion_Problem_0_1cef567f_70a2_4f91_a548_f80430e6a7e3(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_c293ce0f_f59b_4b32_962b_ab1b9b0f8504(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_e0b21528_dc4b_4b42_8e93_e5e50f4a6fd5(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_4c393fb8_74c1_4f0f_9180_0b5993f2a93c(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_14f0f991_2075_4cc3_8bb6_90fe4d79eecd(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) >= x)
                r = m - 1;
            else
                l = m + 1;
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_d68aeab2_7f4b_413f_8ee2_13ac49ca8b73(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_da249019_d634_4f86_904d_a56082a664e3(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_094b5f66_6f37_4e50_8789_55fdb7e56db0(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_fab0a78e_11a9_4c6d_9145_a0a14a41ac2b(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_b1c7d2b3_af4b_40aa_8f47_58eadcb1b9d0(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_d12f0a4e_d2be_4dd6_b1c2_cd641b6906f0(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0, r = n - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_81df455d_474b_44e3_83d5_92948ceec0db(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0, r = n - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x)
                return m;
            else if (a.get(m) < x)
                l = m + 1;
            else
                r = m - 1;
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_4d48fe40_312b_4ffb_b7bf_bb5dd6390b5d(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) < x)
                l = m + 1;
            else
                r = m - 1;
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_22ec5f73_8068_4697_8f4b_a9dd6d662e46(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_c9cd2f69_b969_4abc_b483_afcca1105dc8(ArrayList<Integer> a, int x) {
        int low = 0, high = a.size() - 1, mid;
        while ((low <= high) && (x == a.get(low))) {
            mid = (low + high) / 2;
            while (x <= a.get(mid)) {
                high = mid - 1;
            }
            while (x >= a.get(mid)) {
                low = mid + 1;
            }
            if (mid < high) {
                return mid;
            }
        }
        return -1;
    }

    
    public static int leftInsertion_Problem_2_a81f707a_bae8_41e5_8bbf_587bebb7d289(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l < r) {
            int mid = (l + r) / 2;
            if (a.get(mid) < x) {
                l = mid + 1;
            } else {
                r = mid;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_f868728a_ba36_4780_8626_35120d1e33ef(ArrayList<Integer> a, int x) {
        int lo = 0;
        int hi = a.size() - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (a.get(mid) < x) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return lo;
    }

    
    public static int leftInsertion_Problem_1_90229816_c24f_4b42_97a1_95d6c2b23a21(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_578b40ab_59b0_4280_b5d3_cb274f0115b0(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_1ef3da60_e6ca_40d7_877f_342d9bb349ac(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_1ca1eac9_d305_42d3_b869_508c53246821(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0;
        int r = n - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_5e4c2db9_c389_4f52_8ed5_201af9a6820b(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_c9cd2f69_b969_4abc_b483_afcca1105dc8(ArrayList<Integer> a, int x) {
        int low = 0, high = a.size() - 1, mid;
        while ((low <= high) && (x == a.get(low))) {
            mid = (low + high) / 2;
            while (x <= a.get(mid)) {
                high = mid - 1;
            }
            while (x >= a.get(mid)) {
                low = mid + 1;
            }
            if (mid < high) {
                return mid;
            }
        }
        return -1;
    }

    
    public static int leftInsertion_Problem_1_b24f9964_d914_495a_81e8_b8f2780873c9(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) l = m + 1;
            else r = m;
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_5edde7b0_e007_4123_984c_0c841346a8c8(ArrayList<Integer> a, int x) {
        int i = 0;
        for (; i < a.size(); i++) {
            if (a.get(i) < x) {
                break;
            }
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_cdd7c969_9515_432f_98a5_5d39e1597645(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0;
        int r = n - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (a.get(m) >= x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_9d86c068_8644_416c_8802_1a681da1cee5(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_4c393fb8_74c1_4f0f_9180_0b5993f2a93c(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_89133432_6ec6_4292_a7f1_d5fd1691aaa8(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_442b9a78_45cc_4173_b594_28966d4e9c22(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_bc99e938_35db_4ac1_ad6b_0d4fd622b8a0(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_022459b5_c70a_4cdc_93a4_1d73287d1114(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) < x)
                l = m + 1;
            else
                r = m;
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_cfecd472_7f6b_4969_9068_743c1ac35b8f(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_426f1907_d14e_426f_9f13_dae66dbafe5b(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (a.get( m) == x) {
                return m;
            } else if (a.get( m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_b643f026_a4db_4cea_aa3d_8bb658f4b50a(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_0b55230a_53e7_43ce_ae7b_33e1905da725(ArrayList<Integer> a, int x) {
        int i = 0;
        while(i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_5b8e346d_7c57_4be8_97d6_fa2a6d759044(ArrayList<Integer> a, int x) {
        // Write your code here
        // To print results to the standard output you can use System.out.println()
        // Example: System.out.println("Hello world!");
        int low = 0;
        int high = a.size() - 1;
        int mid = 0;
        while (low <= high) {
            mid = (low + high) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }

    
    public static int leftInsertion_Problem_2_00482753_a6a1_4b38_a896_7737d625bd86(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_a394b534_d6ed_4fe3_b356_00b2a76d2793(ArrayList<Integer> a, int x) {
        int result = Integer.MAX_VALUE;
        int j = -1;
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) > x && result != Integer.MAX_VALUE) {
                result = a.get(i);
                j = i;
            }
        }
        while (j != -1) {
            a.set(++j, x);
            j = --j;
        }
        return result;
    }

    
    public static int leftInsertion_Problem_1_065ee834_f493_43b0_8787_85547effd492(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_3a9f8029_3b97_436d_a929_ee0ba2b69319(ArrayList<Integer> a, int x) {
        int left = 0;
        int right = a.size() - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) < x) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }

    
    public static int leftInsertion_Problem_0_ca61a315_0352_4102_a35a_632116943a3b(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        int m = 0;
        while (l <= r) {
            m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_b224eb1f_6032_45e0_87a5_a38078030532(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_d0a49e29_2d39_4a80_b08c_b2925995ca34(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size();
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) >= x) {
                r = m;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_4ce64969_c9b6_4477_9cbd_13714bd35f53(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_41f5071d_430e_43f6_a3fa_f5398bccbffb(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0;
        int r = n - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_2271f33d_ce62_45dc_9c05_cab7cc45e605(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_4f45afe2_9050_45e6_86c0_1a5c0f3a0237(ArrayList<Integer> a, int x) {
        int leftIndex = 0;
        int rightIndex = a.size() - 1;
        while (True) {
            while (leftIndex < rightIndex && x <= a.get(rightIndex)) {
                rightIndex--;
            }
            while (leftIndex < rightIndex && x > a.get(leftIndex)) {
                leftIndex++;
            }
            if (leftIndex == rightIndex) {
                return leftIndex;
            }
            if (x < a.get(leftIndex)) {
                leftIndex++;
            }
        }
    }

    
    public static int leftInsertion_Problem_1_fdd988ff_8593_4534_b5e1_6deb6d542249(ArrayList<Integer> a, int x) {
        // Write - Your - Code
        int left = 0;
        int right = a.size() - 1;
        while (left < right) {
            int mid = (left + right) / 2;
            if (a.get(mid) < x) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }

    
    public static int leftInsertion_Problem_0_16ece67d_e1c6_49ed_a647_be56f63dced3(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0;
        int r = n - 1;
        int mid = 0;
        while (l <= r) {
            mid = (l + r) / 2;
            if (x > a.get(mid)) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_bc99e938_35db_4ac1_ad6b_0d4fd622b8a0(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_df6aa422_f51e_45d8_85de_daceb4326025(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_be14e084_89cd_4ba3_8067_2a0157b87dae(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_b24f9964_d914_495a_81e8_b8f2780873c9(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) l = m + 1;
            else r = m;
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_f45a8fa6_2a2d_4214_aae8_3e1c418acf87(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_72260940_3b31_4cff_898e_e483e7c28d29(ArrayList<Integer> a, int x) {
        // Binary search
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_b1c7d2b3_af4b_40aa_8f47_58eadcb1b9d0(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_c5f97816_a2d5_453b_af36_4cdd08eac3f1(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get( m) == x) {
                return m;
            } else if (a.get( m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_2f41f48c_0293_4161_b8d6_5e35e6445e31(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_442b9a78_45cc_4173_b594_28966d4e9c22(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_81b73118_f864_498e_a5b9_acca1f612f56(ArrayList<Integer> a, int x) {
        int leftInsertPoint = 0;
        for (int i = 0; i < a.size() && a.get(i) > x; i++) leftInsertPoint = a.get(i);
        return leftInsertPoint;
    }

    
    public static int leftInsertion_Problem_2_dbeea9a7_1de2_42f7_b525_fc46281701d5(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_9ed02925_6b02_4496_8521_7d80ccd16029(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get( m) == x) {
                return m;
            } else if (a.get( m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_4dbe2793_4bbb_48bc_9c51_1087d9ef5666(ArrayList<Integer> a, int x) {
        int i = 0;
        int j = a.size() - 1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (a.get(mid) < x) {
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_3cef9728_92f5_4a15_aab9_263c7ba377c0(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_681034f7_842d_4bcf_ae4c_2f5800295346(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_bb59df7b_e1eb_4792_9845_2ab68c239229(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0;
        int r = n;
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_a0fcc403_9e23_456d_9fd5_86a25f9ac32b(ArrayList<Integer> a, int x) {
        int i = 0;
        int j = a.size() - 1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) < x) {
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_2e5f6766_cc47_4941_9e9a_02c940e3ea40(ArrayList<Integer> a, int x) {
        int i = 0;
        int j = a.size() - 1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (a.get(mid) < x) {
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_e4069b37_d5ef_4d9b_a2de_04fbe7d25596(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_7e36dea5_eb83_4105_94a1_6a258751e415(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0, r = n - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_64dd69ad_dc5e_4f7c_8a13_0ed46602d22a(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_1325f5ac_efa8_4fa6_8de1_36380ff96f7d(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_59487c11_b1b7_446d_92f3_cbe328d3e4e3(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_58731924_4216_46c6_8aba_e6e73cf74d54(ArrayList<Integer> a, int x) {
        int left = 0;
        int right = a.size() - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (a.get(mid) < x) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }

    
    public static int leftInsertion_Problem_0_6b47c77a_16d4_4dc8_b611_e6cb7f8ef44e(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_7393c1ae_2add_40b1_8da1_c18c1a82df2c(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_85e49a87_412e_4a65_8cbd_765de5faa32f(ArrayList<Integer> a, int x) {
        int low = 0;
        int high = a.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    
    public static int leftInsertion_Problem_2_94e7a63a_caab_4e70_b3da_9fbf9b56e04f(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_9830c8e1_1f7b_4059_9934_336482e1cc7f(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_5bf9e094_885f_4cf9_b283_89332fde30df(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_038339b1_8654_4f1a_8c3e_7019a2c96388(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get( m) == x) {
                return m;
            } else if (a.get( m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_0b1fb858_e258_45ed_bfa2_20de6d5ccf67(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_c61b37cd_9e10_423d_881b_6a100bff3399(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_4b588803_77df_4d5c_a86f_87fca0ed5c0e(ArrayList<Integer> a, int x) {
        int i = 0;
        while(i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_f3a94335_ab76_4cd7_a5a8_97c9178c078a(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_7dd493f9_8f15_4994_9671_5e4e3083e24d(ArrayList<Integer> a, int x) {
        int lo = 0;
        int hi = a.size() - 1;
        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if (a.get(mid) < x) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return lo;
    }

    
    public static int leftInsertion_Problem_0_52e00d42_0c54_45fd_9f61_b33a3ea7d6cf(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_a8fdb54d_0aff_43df_a52a_e9e064b97299(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_bf457f08_8de6_469d_a0ad_babdc5b4bd11(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_486c5805_a826_4a95_8009_4a17d4aea2da(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_bf486a86_69fa_4b23_835b_9f970b39cb94(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_9c7b2f17_5306_49b3_9fc7_78f210f88a7b(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_56fa580b_9e9c_489f_b9f1_bedf175234b6(ArrayList<Integer> a, int x) {
        int low = 0;
        int high = a.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (a.get(mid) == x) {
                return mid;
            }
            if (a.get(mid) > x) {
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }
        return low;
    }

    
    public static int leftInsertion_Problem_1_52c994e3_466d_4c0d_b3eb_e162c8df50ff(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_0b1fb858_e258_45ed_bfa2_20de6d5ccf67(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_bcc2a37f_7fc5_44aa_a160_a2c185a16ff3(ArrayList<Integer> a, int x) {
        // write your code here
        int leftInsertion_Problem_2_bcc2a37f_7fc5_44aa_a160_a2c185a16ff3 = -1; 
        for(int i = 0; i < a.size() && x > a.get(i);
                i++){
            if(a.get(i) >= x)
                leftInsertion_Problem_2_bcc2a37f_7fc5_44aa_a160_a2c185a16ff3 = i;
        }
        return leftInsertion_Problem_2_bcc2a37f_7fc5_44aa_a160_a2c185a16ff3;
    }

    
    public static int leftInsertion_Problem_0_ec7e8ea0_99c8_4c43_8d75_285dad869966(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_e0c466b1_eaf0_4fa3_a7f7_2546a8336421(ArrayList<Integer> a, int x) {
        int i = 0;
        int j = a.size() - 1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (a.get(mid) < x) {
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_3e9329ff_f49f_4e62_87e3_32247b4f389f(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get( m) == x) {
                return m;
            } else if (a.get( m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_e062551a_3ca6_4551_8ceb_e0d9202b7b40(ArrayList<Integer> a, int x) {
        if (a.size() == 0) return 0;
        int l = 0, r = a.size() - 1;
        while (l < r) {
            int mid = (l + r) / 2;
            if (a.get(mid) < x) l = mid + 1;
            else r = mid;
        }
        return a.get(l) >= x ? l : l + 1;
    }

    
    public static int leftInsertion_Problem_2_b6be7186_e241_430d_ac9e_05290e0cc905(ArrayList<Integer> a, int x) {
        int lo = 0, hi = a.size() - 1;
        while (lo < hi) {
            int mid = (lo + hi) / 2;
            if (a.get(mid) < x) {
                lo = mid + 1;
            } else {
                hi = mid;
            }
        }
        return lo;
    }

    
    public static int leftInsertion_Problem_2_29adf24e_65b2_4b7e_b836_8795efc8bc73(ArrayList<Integer> a, int x) {
        int i =  Math.floor(a.size()/2.0);
        while(i >= 0 && a.get(i) <= x) i--;
        return i+1;
    }

    
    public static int leftInsertion_Problem_0_c5f7f99f_14f7_48ee_acf7_2177cdd1e17a(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_b2a95aa3_5812_4dfe_9e5b_1ef972660280(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_c152721a_5711_4791_911f_34fc1a5c7ee2(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_a88aad3f_9d22_493e_9047_5a10558d0d08(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_a7ec39d4_dec1_419c_b0ac_1492c368eeab(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_69759bc2_6456_48b4_b3ef_dbc9590240ea(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_440402a4_cf90_463a_8f83_b0fdc8107284(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_e13c5b83_2890_4797_bf83_d05a873cf032(ArrayList<Integer> a, int x) {
        int low = 0;
        int high = a.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    
    public static int leftInsertion_Problem_1_e971a812_5c7b_4675_aab3_16d935ac70a3(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0, r = n - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (a.get(mid) < x) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_c2e5e6e7_6678_4a95_a7ee_acb30b05d028(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_7f124665_b7a5_4d64_a89b_8c4d65e369b9(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_ae3ed6e4_d50b_4ee1_ba61_40abee85aba6(ArrayList<Integer> a, int x) {
        int low = 0;
        int high = a.size() - 1;
        while (low <= high) {
            int mid = (low + high) >>> 1;
            int midVal = a.get(mid);
            if (midVal < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }

    
    public static int leftInsertion_Problem_2_d029e802_bc6e_4588_9ae3_061accfdeddb(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0, r = n - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_2e93f3af_d440_4a89_ab96_7dccce70c561(ArrayList<Integer> a, int x) {
        int lo = 0;
        int hi = a.size() - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) > x) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return lo;
    }

    
    public static int leftInsertion_Problem_0_44acab14_46e3_408f_9fa3_3ba915c31c7c(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get( m) == x) {
                return m;
            } else if (a.get( m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_980c73d4_91db_4191_99bb_f3d2a955faac(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_99569999_6c3b_4900_b360_8e6a72481311(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_f9886055_d6fb_4e30_8544_17c82c63b5cf(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_4194edca_cb18_43f0_8be0_4a344cfd16a1(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_8ced5828_5e0c_4790_905f_f2281fe6bed3(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_acc6f6de_9165_4571_8b7e_5b3488a9c0a7(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_7d8762d1_82dc_423f_9a2e_3624eadb26e4(ArrayList<Integer> a, int x) {
        int low = 0;
        int high = a.size()-1;
        while (low <= high) {
            int mid = (low + high)/2;
            if (x < a.get(mid))
                high = mid - 1;
            else if (x > a.get(mid))
                low = mid + 1;
            else {
                System.out.println("Left Insertion Point: " + mid);
                return mid;
            }
        }
        System.out.println("Left Insertion Point: -1");
        return -1;
    }

    
    public static int leftInsertion_Problem_1_a0fcc403_9e23_456d_9fd5_86a25f9ac32b(ArrayList<Integer> a, int x) {
        int i = 0;
        int j = a.size() - 1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) < x) {
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_f868728a_ba36_4780_8626_35120d1e33ef(ArrayList<Integer> a, int x) {
        int lo = 0;
        int hi = a.size() - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (a.get(mid) < x) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return lo;
    }

    
    public static int leftInsertion_Problem_1_f3701d2b_a965_4e0b_aff6_54880b4547e1(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_afe2df4c_eec2_45a0_ba86_3fcd30fe301c(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_59c156f8_dd7b_4c40_9891_87f7ee924b9c(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_c86c5db1_027f_42d7_83da_1653a041d202(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_d7fa4ee7_f424_4329_b39e_e2c165148d67(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_e115d05b_97ed_40e9_b58e_4063c05ae1a0(ArrayList<Integer> a, int x) {
        int lo = 0;
        int hi = a.size() - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) > x) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return lo;
    }

    
    public static int leftInsertion_Problem_0_6b47c77a_16d4_4dc8_b611_e6cb7f8ef44e(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_51f2c169_4aa9_46b2_8991_01885c6a627a(ArrayList<Integer> a, int x) {
        boolean found = False;
        for (int i = 0; i < a.size(); i++) {
            if (x == a.get(i)) {
                found = True;
                break;
            }
        }
        if (!found) {
            a.add(x);
        }
        return 0;
    }

    
    public static int leftInsertion_Problem_2_de3a7c43_fcde_4321_b4d5_dae2a4d20874(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0;
        int r = n - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_1062165e_72a4_4260_a296_ef010d2e0c2e(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0, r = n - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            }
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_a0329f65_8e1b_4f2b_b379_f6837ff99a32(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_29adf24e_65b2_4b7e_b836_8795efc8bc73(ArrayList<Integer> a, int x) {
        int i =  Math.floor(a.size()/2.0);
        while(i >= 0 && a.get(i) <= x) i--;
        return i+1;
    }

    
    public static int leftInsertion_Problem_1_f7d323f9_0f40_48cd_8222_6f5479ce61f4(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0, r = n - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) < x) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_db45e9b6_bcc9_4d01_91f1_9dd1834d842d(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_4194edca_cb18_43f0_8be0_4a344cfd16a1(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_b643f026_a4db_4cea_aa3d_8bb658f4b50a(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_ff0a3b3e_b7c5_4523_8121_5af97a2c8e8a(ArrayList<Integer> a, int x) {
        int lo = 0;
        int hi = a.size() - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (a.get(mid) < x) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return lo;
    }

    
    public static int leftInsertion_Problem_2_929269f1_1d72_446b_bc0f_5b6dd9dd7344(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_8f7b9e7a_cad5_4101_a633_7712dff3c114(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_85e49a87_412e_4a65_8cbd_765de5faa32f(ArrayList<Integer> a, int x) {
        int low = 0;
        int high = a.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    
    public static int leftInsertion_Problem_0_275edc80_3b0e_4a0e_8fc2_6cded258dd03(ArrayList<Integer> a, int x) {
        int lo = 0, hi = a.size() - 1;
        while (lo < hi) {
            int mid = (lo + hi) / 2;
            if (a.get(mid) < x) lo = mid + 1;
            else hi = mid;
        }
        return lo;
    }

    
    public static int leftInsertion_Problem_2_896b8fc2_14db_4037_baf8_b6900676da95(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_b5328ce7_d647_431c_b27b_a3e712d2ce93(ArrayList<Integer> a, int x) {
        int lo = 0;
        int hi = a.size() - 1;
        while (lo < hi) {
            int mid = (lo + hi) / 2;
            if (a.get(mid) < x) {
                lo = mid + 1;
            } else {
                hi = mid;
            }
        }
        return lo;
    }

    
    public static int leftInsertion_Problem_1_fe967955_80a9_405f_8f0a_1ff0a540dbd4(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) > x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_da6e5f96_1af3_4906_8411_50573146f7fe(ArrayList<Integer> a, int x) {
        int low = 0, high = a.size() - 1;
        int curr = 0;

        while (low < high) {
            int mid = (low + high) >>> 1;
            curr = a.get(mid);

            if (curr < x)
                low = mid + 1;
            else if (curr > x)
                high = mid - 1;
            else
                return mid;
        }
        return low;
    }

    
    public static int leftInsertion_Problem_2_b0183ac7_a71b_4a70_8f07_4552bd400e3d(ArrayList<Integer> a, int x) {
        int l = 0;
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) < x) {
                l++;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_9d351df8_a3c8_44d3_b8e9_0f387c22f389(ArrayList<Integer> a, int x) {
        int lo = 0;
        int hi = a.size() - 1;
        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if (a.get(mid) < x) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return lo;
    }

    
    public static int leftInsertion_Problem_0_86e74ccd_9b69_401a_a2dd_a4aaf3af3f76(ArrayList<Integer> a, int x) {
        int low = 0;
        int high = a.size() - 1;

        while ((low <= high)) {
            int mid = low + (high - low) / 2;
            if (a.get(mid) >= x) low = mid + 1;
            else high = mid - 1;
        }
        return low;
    }

    
    public static int leftInsertion_Problem_1_00236230_3202_4298_9283_eb24fc7f20c8(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_2907dd53_5c21_4c41_accb_115697f62476(ArrayList<Integer> a, int x) {
        // Write your code here
        int low = 0;
        int high = a.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (a.get( mid) == x) {
                return mid;
            } else if (a.get( mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    
    public static int leftInsertion_Problem_2_9d351df8_a3c8_44d3_b8e9_0f387c22f389(ArrayList<Integer> a, int x) {
        int lo = 0;
        int hi = a.size() - 1;
        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if (a.get(mid) < x) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return lo;
    }

    
    public static int leftInsertion_Problem_1_fa6abc67_d1da_4853_bd80_c339c67ef2e9(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_c3114250_1782_4a55_b08b_d83c23f54ef3(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_94694dfd_8598_40d5_8877_7984c5955c68(ArrayList<Integer> a, int x) {
        int l = a.size();
        int i = 1;
        while (i < l && a.get(i) < x) {
            i++;
        }
        int left = (a.get(i - 1) != null) ? a.get(i) - 1 : 0L;
        int mid = i - 1;
        while (i < l && a.get(mid) < x) {
            mid++;
        }
        int right = (a.get(mid) != null) ? a.get(mid) : 0L;
        return (left + right);
    }

    
    public static int leftInsertion_Problem_0_2c1092ae_29d1_40c5_9db2_c0cc8602f7d3(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0;
        int r = n - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_15073c5b_4a42_4b1d_8d99_849486b977d9(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_ddb2a8a5_85f5_4cac_ad8a_81974310c3a4(ArrayList<Integer> a, int x) {
        // Write - Your - Code
        int low = 0;
        int high = a.size() - 1;
        int mid = 0;
        while (low <= high) {
            mid = (low + high) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    
    public static int leftInsertion_Problem_0_70ae3e9d_e6da_48db_bc83_453eee68914e(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_4d6f5d1e_921d_4697_b4a2_68993a67c01d(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_92c57932_f315_463f_a501_6864767b4b28(ArrayList<Integer> a, int x) {
        int low = 0, high = a.size() - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int midValue = a.get(mid);

            if (midValue < x) {
                low = mid + 1;
            } else if (midValue > x) {
                high = mid - 1;
            } else {
                return mid;
            }
        }
        return low;
    }

    
    public static int leftInsertion_Problem_2_fe967955_80a9_405f_8f0a_1ff0a540dbd4(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) > x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_81bf7b85_b493_4fda_a7dc_2f2e0ef944f7(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get( m) == x) {
                return m;
            } else if (a.get( m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_ee2e0703_9aa7_47ed_b878_675e766bac5a(ArrayList<Integer> a, int x) {
        int result = -1;
        for(int i = 0; i < a.size(); i++) {
            if(a.get(i) > x) {
                result = i;
                break;
            }
        }
        if(result != -1) {
            int index = a.size() - 1;
            while(index > 0 && a.get(index) == a.get(index - 1)) {
                index--;
            }
            a.set(index + 1, x);
        }
        return result;
    }

    
    public static int leftInsertion_Problem_1_0af0df10_2fbf_44cc_8db5_84fe34b0e510(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0, r = n - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (a.get(mid) >= x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_1664502f_9e79_428d_a597_7ddc6631ee70(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_a5a22ea0_d1a9_4a8f_9772_dbb5d8ee4804(ArrayList<Integer> a, int x) {
        int low = 0;
        int high = a.size() - 1;
        int mid = 0;
        while (low <= high) {
            mid = (low + high) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    
    public static int leftInsertion_Problem_2_a1654e6a_e5d5_45e8_bab9_df7dac9a59e3(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0, r = n - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_3847e30c_a2a4_4ba7_8397_709086ce5b35(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0;
        int r = n - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_648066c5_6571_42bc_a9f5_93c08b00b8c0(ArrayList<Integer> a, int x) {
        int lo = 0;
        int hi = a.size() - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) < x) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return lo;
    }

    
    public static int leftInsertion_Problem_1_67a8715a_30da_4e4c_8457_534c40b20359(ArrayList<Integer> a, int x) {
        // Write - Your - Code
        int low = 0;
        int high = a.size() - 1;
        int mid = 0;
        while (low <= high) {
            mid = (low + high) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    
    public static int leftInsertion_Problem_0_ade993e9_8413_4c55_a2bf_1b84f50c39ba(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_4fdf4c5e_f90f_41cc_a5f4_b018342d1b08(ArrayList<Integer> a, int x) {
        int low = 0;
        int high = a.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x > a.get(mid)) high = mid - 1;
            if (x < a.get(mid)) low = mid + 1;
            if (mid > 0)
                if (x < a.get(mid - 1)) high = mid - 1;
                if (x > a.get(mid + 1)) low = mid + 1;
        }
        if (low > high) {
            return low;
        } else {
            a.add(low, x);
            a.add(high, x);
            return low + 1;
        }
    }

    
    public static int leftInsertion_Problem_1_1b24d47d_6691_4e3a_82bf_a9b38baddd4b(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_4f02411b_856c_44c9_aac0_e38a7418a7c5(ArrayList<Integer> a, int x) {
        int i = 0;
        while(i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_a5d0b024_d8d9_453c_97ae_10355b100613(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_78681d5e_df11_47c1_b570_fcd87093707d(ArrayList<Integer> a, int x) {
        int i = 0;
        while(i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_52e00d42_0c54_45fd_9f61_b33a3ea7d6cf(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_2c9a81e0_732f_4fe8_adbd_b347b08e50f5(ArrayList<Integer> a, int x) {
        int left = 0;
        int right = a.size() - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) < x) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }

    
    public static int leftInsertion_Problem_2_c9a4991f_efe4_463e_bf46_69fa30097832(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0, r = n - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_9ed02925_6b02_4496_8521_7d80ccd16029(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get( m) == x) {
                return m;
            } else if (a.get( m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_c3114250_1782_4a55_b08b_d83c23f54ef3(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_99dd79d0_a4ba_43a3_84e0_73015d2f219d(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_21461799_5768_4adf_bd51_34ead0ca0e87(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_790e2bfd_4832_4063_8130_5daaeaaab2eb(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_49354172_adf7_48e1_9694_fc398d40f6bc(ArrayList<Integer> a, int x) {
        int i = 0;
        while(i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_3e9329ff_f49f_4e62_87e3_32247b4f389f(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get( m) == x) {
                return m;
            } else if (a.get( m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_15e5dfde_6140_4e2f_be61_88d4d0840b5b(ArrayList<Integer> a, int x) {
        int lo = 0;
        int hi = a.size() - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (x <= a.get(mid)) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return lo;
    }

    
    public static int leftInsertion_Problem_1_14e277af_f6dd_44e5_b5bf_cb4068665221(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0, r = n - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_c5f7f99f_14f7_48ee_acf7_2177cdd1e17a(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_df6aa422_f51e_45d8_85de_daceb4326025(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_4fdf4c5e_f90f_41cc_a5f4_b018342d1b08(ArrayList<Integer> a, int x) {
        int low = 0;
        int high = a.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x > a.get(mid)) high = mid - 1;
            if (x < a.get(mid)) low = mid + 1;
            if (mid > 0)
                if (x < a.get(mid - 1)) high = mid - 1;
                if (x > a.get(mid + 1)) low = mid + 1;
        }
        if (low > high) {
            return low;
        } else {
            a.add(low, x);
            a.add(high, x);
            return low + 1;
        }
    }

    
    public static int leftInsertion_Problem_2_3a1e40dc_d559_42b8_8be5_5f5219a62472(ArrayList<Integer> a, int x) {
        int low = 0;
        int high = a.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    
    public static int leftInsertion_Problem_1_b643f026_a4db_4cea_aa3d_8bb658f4b50a(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_0a5401a6_371a_4200_ab05_b4f6c88b1857(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_d0d24fde_ce5f_460c_b638_22ab77162486(ArrayList<Integer> a, int x) {
        int left = 0;
        int right = a.size() - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (a.get(mid) < x) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }

    
    public static int leftInsertion_Problem_2_2e88e560_240e_45ae_b6f2_c87a61b7eabd(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_f1081771_fadd_41b0_8bd3_eda138970ba9(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_9ef521e4_aad0_4160_9fe2_29f4279ba6f5(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_7f07d246_ee01_46b8_a225_3df7ead4ac31(ArrayList<Integer> a, int x) {
        int i = 0;
        while(i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_c5f97816_a2d5_453b_af36_4cdd08eac3f1(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get( m) == x) {
                return m;
            } else if (a.get( m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_2d3c8dfc_f905_4269_8282_7bacd41f7d9f(ArrayList<Integer> a, int x) {
        int lo = 0;
        int hi = a.size() - 1;
        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if (a.get(mid) < x) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return lo;
    }

    
    public static int leftInsertion_Problem_0_77072d03_7371_4bfd_8aa5_0c771b7dc0de(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_5713c8b8_0092_4618_98c6_4092f2fc9d10(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0, r = n - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) > x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_6a2cb328_09db_4b15_88a5_4d701ee4ab42(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_40030029_9c55_4066_8e27_8d582405f819(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_bd6fb50d_454b_4214_bc4d_0789f109561c(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) > x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_4ce64969_c9b6_4477_9cbd_13714bd35f53(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_b6be7186_e241_430d_ac9e_05290e0cc905(ArrayList<Integer> a, int x) {
        int lo = 0, hi = a.size() - 1;
        while (lo < hi) {
            int mid = (lo + hi) / 2;
            if (a.get(mid) < x) {
                lo = mid + 1;
            } else {
                hi = mid;
            }
        }
        return lo;
    }

    
    public static int leftInsertion_Problem_0_a89d2b01_cab7_4a53_b6fb_0b62bc6db8b1(ArrayList<Integer> a, int x) {
        int index = Collections.binarySearch(a, x);
        if (index < 0) {
            return -(index + 1);
        } else {
            return index;
        }
    }

    
    public static int leftInsertion_Problem_2_b3120f44_40a8_4143_b7e6_0a921629ea92(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_b17e7d54_6848_47b3_a2e8_8bcb98b6b214(ArrayList<Integer> a, int x) {
        int low = 0;
        int high = a.size() - 1;
        int mid = 0;
        while (low <= high) {
            mid = (low + high) / 2;
            if (x > a.get(mid)) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }

    
    public static int leftInsertion_Problem_2_9fb252da_dde8_4e57_8adf_c844b6f262f6(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_1ef3da60_e6ca_40d7_877f_342d9bb349ac(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_9e297cca_dc0c_453b_ba9d_395bc9e36fba(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_d964f095_be65_451d_b711_db6a45263d72(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_14f0f991_2075_4cc3_8bb6_90fe4d79eecd(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) >= x)
                r = m - 1;
            else
                l = m + 1;
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_ae9f68ed_5cac_4ed4_bee7_9d2c53393bd5(ArrayList<Integer> a, int x) {
        int i = 0;
        while(i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_4631e12b_81e2_47db_9372_dfdabbc13862(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_1a5a5f55_3990_49b6_8127_fa4b28c680ea(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            }
            if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_e76c6090_3126_4541_80a7_35983c968dd3(ArrayList<Integer> a, int x) {
        int lo = 0;
        int hi = a.size() - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) > x) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return lo;
    }

    
    public static int leftInsertion_Problem_2_a8d6577b_a9f8_4467_9d7c_46b302bb2034(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_896b8fc2_14db_4037_baf8_b6900676da95(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_e944a07b_240c_4370_a384_828ecf0d0f61(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0, r = n - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) < x) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_29df1537_0567_48b6_83bf_3084dd2009c4(ArrayList<Integer> a, int x) {
        int i = 0;
        int j = a.size() - 1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (a.get(mid) < x) {
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_4737e315_7dcd_4721_89c8_b68c3c98d904(ArrayList<Integer> a, int x) {
        return a.indexOf(x);
    }

    
    public static int leftInsertion_Problem_1_1ccd9c78_993b_4f6c_9935_5d99b82bbd1e(ArrayList<Integer> a, int x) {
        int i = 0;
        int j = a.size() - 1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (a.get(mid) < x) {
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_dbb5b594_8005_4517_8fef_bad1d75235c3(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_133d3cc9_609c_47bf_9d48_92091b169908(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0, r = n - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_59272947_1035_4e2e_bf10_3571e6c4a075(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) > x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_a74e8b96_a5a4_4b92_90e1_fc69d5c137e9(ArrayList<Integer> a, int x) {
        int i = 0;
        int j = a.size() - 1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) < x) {
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_c4769b62_fee5_45b6_aa65_8b137638f40d(ArrayList<Integer> a, int x) {
        int i = 0;
        while(i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_81b73118_f864_498e_a5b9_acca1f612f56(ArrayList<Integer> a, int x) {
        int leftInsertPoint = 0;
        for (int i = 0; i < a.size() && a.get(i) > x; i++) leftInsertPoint = a.get(i);
        return leftInsertPoint;
    }

    
    public static int leftInsertion_Problem_1_4194edca_cb18_43f0_8be0_4a344cfd16a1(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_6ca9dd10_e959_42c5_8c46_8b4041fe9fb8(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0, r = n - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) >= x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_9490ca09_d2df_4d9c_8afe_c63a18a93f05(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_bd63f70c_0abf_4059_9113_776ffc5bc4e1(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0;
        int r = n - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) >= x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_bd63f70c_0abf_4059_9113_776ffc5bc4e1(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0;
        int r = n - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) >= x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_264ecdf8_4d30_41c3_9b66_b1f5fa997dbb(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_18ef59fe_4865_4b90_8ec5_2faf4daff3ba(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (a.get(m) >= x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_8858567e_e640_4cbe_a3a0_c423ea7469b3(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_c324f79b_0ea8_4592_8ab5_c076d276b2d2(ArrayList<Integer> a, int x) {
        int left = 0;
        int right = a.size() - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) > x) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    
    public static int leftInsertion_Problem_2_c9cd2f69_b969_4abc_b483_afcca1105dc8(ArrayList<Integer> a, int x) {
        int low = 0, high = a.size() - 1, mid;
        while ((low <= high) && (x == a.get(low))) {
            mid = (low + high) / 2;
            while (x <= a.get(mid)) {
                high = mid - 1;
            }
            while (x >= a.get(mid)) {
                low = mid + 1;
            }
            if (mid < high) {
                return mid;
            }
        }
        return -1;
    }

    
    public static int leftInsertion_Problem_2_87d8024b_1767_45af_b49b_55a5e64cc700(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_027ddd08_dd4d_41a6_be14_eea103fd4744(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_4144302d_b83c_4d67_a075_8d3aa6677a63(ArrayList<Integer> a, int x) {
        int low = 0, high = a.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (a.get( mid) == x) {
                return mid;
            } else if (a.get( mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    
    public static int leftInsertion_Problem_2_69e47501_83bf_47bb_9ecd_d823822bc38e(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_e173cd17_9ffb_42a6_a121_a432c59e4d7b(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_2c1092ae_29d1_40c5_9db2_c0cc8602f7d3(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0;
        int r = n - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_d8cba282_4ec7_46f3_a862_210562cbe323(ArrayList<Integer> a, int x) {
        int n = a.size();
        int pivot = a.get( (n - 1));
        int left = 0;
        int right = 0;
        for (int i = 0; i < n; i++) {
            if (a.get(i) > pivot) {
                right++;
            } else if (a.get(i) < pivot) {
                left++;
            } else {
                return i;
            }
        }
        if (right < left) {
            return -1;
        } else if (right == left) {
            return 0;
        } else {
            return  (right + 1);
        }
    }

    
    public static int leftInsertion_Problem_1_9ac877df_4927_465e_8fde_ab07a82fd97e(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_608d5fee_733f_4cc1_b2de_ffeb2decb5ea(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0;
        int r = n - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_5fbab564_9ac3_4e0d_a7e2_1b1eb6a38610(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_bb5ab7b8_3a20_458e_98df_0e9ae6987419(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_6fa2d90a_54f1_4f77_9587_99ad9f58fceb(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_64dd69ad_dc5e_4f7c_8a13_0ed46602d22a(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_25ccb5bf_edb7_4762_9d38_8e21a8ea45e4(ArrayList<Integer> a, int x) {
        if (a.size() == 0) return 0;
        if (a.get(0) >= x) return 0;
        if (a.get(a.size() - 1) < x) return a.size();
        int left = 0;
        int right = a.size() - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (a.get(mid) >= x) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    
    public static int leftInsertion_Problem_0_00772111_d73d_423b_b4e8_1ca1adf7d6c2(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0;
        int r = n - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_62e9aacf_ddbf_4f51_bbfb_a3ba9f90cc70(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_fc8b43cc_7baf_4bdb_8550_e530dc71ba05(ArrayList<Integer> a, int x) {
        int n = a.size();
        if (x <= a.get(0)) {
            return 0;
        }
        if (x > a.get(n - 1)) {
            return n;
        }
        int lo = 0;
        int hi = n - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (x <= a.get(mid)) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return lo;
    }

    
    public static int leftInsertion_Problem_1_022459b5_c70a_4cdc_93a4_1d73287d1114(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) < x)
                l = m + 1;
            else
                r = m;
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_8858567e_e640_4cbe_a3a0_c423ea7469b3(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_78589b61_2ec8_45eb_b296_1885f22ceeb8(ArrayList<Integer> a, int x) {
        int i = 0;
        int j = a.size() - 1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (a.get(mid) < x) {
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_d9fb7303_537f_49c0_a8a7_e54cebb874ee(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_fca8b5de_7e62_4f67_aebf_220ea858b322(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0, r = n - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_8019dd26_f99e_4e25_8328_b1357e61686a(ArrayList<Integer> a, int x) {
        int low = 0;
        int high = a.size() - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (x < a.get(mid))
                high = mid - 1;
            else if (x > a.get(mid))
                low = mid + 1;
            else
                return mid;
        }
        return low;
    }

    
    public static int leftInsertion_Problem_1_ecbeebcd_02ee_4c5c_8fb6_0356603e6ded(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_921a9062_4dd8_468d_8625_43d346625faf(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0, r = n - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_3a1e40dc_d559_42b8_8be5_5f5219a62472(ArrayList<Integer> a, int x) {
        int low = 0;
        int high = a.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    
    public static int leftInsertion_Problem_0_896b8fc2_14db_4037_baf8_b6900676da95(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_86851f59_2c27_4dd3_b7d7_2bab816fb49c(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_f868728a_ba36_4780_8626_35120d1e33ef(ArrayList<Integer> a, int x) {
        int lo = 0;
        int hi = a.size() - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (a.get(mid) < x) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return lo;
    }

    
    public static int leftInsertion_Problem_2_681034f7_842d_4bcf_ae4c_2f5800295346(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_a88aad3f_9d22_493e_9047_5a10558d0d08(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_3db3c1cb_760e_4254_9312_94b6190aab51(ArrayList<Integer> a, int x) {
        int i = 0;
        int j = a.size() - 1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (a.get(mid) < x) {
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_c918e9c1_1a46_48e6_b050_9194bf953c91(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_182dc868_a1c6_461d_bfd8_1465cfdaf0ea(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_4dbe2793_4bbb_48bc_9c51_1087d9ef5666(ArrayList<Integer> a, int x) {
        int i = 0;
        int j = a.size() - 1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (a.get(mid) < x) {
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_090c98c0_19ce_4bea_8cdc_df860b2df17c(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_7db7dbf7_010f_47e7_8a2b_57024ed3886b(ArrayList<Integer> a, int x) {
        int i = 0;
        int j = a.size() - 1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (a.get(mid) < x) {
                i = mid + 1;
            } else if (a.get(mid) > x) {
                j = mid - 1;
            } else {
                return mid;
            }
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_d12f0a4e_d2be_4dd6_b1c2_cd641b6906f0(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0, r = n - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_2c9a81e0_732f_4fe8_adbd_b347b08e50f5(ArrayList<Integer> a, int x) {
        int left = 0;
        int right = a.size() - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) < x) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }

    
    public static int leftInsertion_Problem_2_f84cfd1b_d195_4878_b56a_5391d957c0f7(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_acaefa7e_180e_4e4f_989c_bb201a0152f1(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_e82667d0_445e_4385_b979_110ce5508099(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0, r = n - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) > x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_e99320ad_d7af_4772_876f_7f8f2e7c3324(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_9747a05e_5677_4b7f_b98a_73fcd594240a(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_c5f97816_a2d5_453b_af36_4cdd08eac3f1(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get( m) == x) {
                return m;
            } else if (a.get( m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_8e42ead9_8c68_4d2c_9328_6c65113c6e4c(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_63be5b32_1c83_43fc_a5f5_e2aa7a32be76(ArrayList<Integer> a, int x) {
        int low = 0;
        int high = a.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    
    public static int leftInsertion_Problem_0_ca60d43b_10e0_4162_a708_1c066e6783c5(ArrayList<Integer> a, int x) {
        int i = 0;
        while(i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_648066c5_6571_42bc_a9f5_93c08b00b8c0(ArrayList<Integer> a, int x) {
        int lo = 0;
        int hi = a.size() - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) < x) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return lo;
    }

    
    public static int leftInsertion_Problem_2_f83fa504_172c_41bf_92eb_ffbac77fb519(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_13df4cbf_713a_440d_9b58_50db5de0f665(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_067837af_4d21_45bf_960d_a8c53d586f96(ArrayList<Integer> a, int x) {
        int i = 0;
        while(i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_a77f515a_951d_423c_8cc9_3b647f3cdddf(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_4fdf4c5e_f90f_41cc_a5f4_b018342d1b08(ArrayList<Integer> a, int x) {
        int low = 0;
        int high = a.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x > a.get(mid)) high = mid - 1;
            if (x < a.get(mid)) low = mid + 1;
            if (mid > 0)
                if (x < a.get(mid - 1)) high = mid - 1;
                if (x > a.get(mid + 1)) low = mid + 1;
        }
        if (low > high) {
            return low;
        } else {
            a.add(low, x);
            a.add(high, x);
            return low + 1;
        }
    }

    
    public static int leftInsertion_Problem_2_fdd988ff_8593_4534_b5e1_6deb6d542249(ArrayList<Integer> a, int x) {
        // Write - Your - Code
        int left = 0;
        int right = a.size() - 1;
        while (left < right) {
            int mid = (left + right) / 2;
            if (a.get(mid) < x) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }

    
    public static int leftInsertion_Problem_2_90d3a769_c85d_4549_987e_690cc8c0aaa7(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size();
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_bb5ab7b8_3a20_458e_98df_0e9ae6987419(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_7e99fb53_19c9_4102_9030_30e07f375dd6(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0;
        int r = n - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_456c3c1c_8508_4583_88e8_c8178ca8a300(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_78cc098c_ba5c_42d7_82b2_eef84cdc17e3(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_99569999_6c3b_4900_b360_8e6a72481311(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_5713c8b8_0092_4618_98c6_4092f2fc9d10(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0, r = n - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) > x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_27b4550d_5834_4b38_a1aa_cf513f0ab034(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0, r = n - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_4194edca_cb18_43f0_8be0_4a344cfd16a1(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_094b5f66_6f37_4e50_8789_55fdb7e56db0(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_f8363248_e285_446b_a105_1b9a5dfa082a(ArrayList<Integer> a, int x) {
        if (a.size() == 0) {
            return 0;
        }
        int l = 0;
        int r = a.size() - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        if (a.get(l) < x) {
            return l + 1;
        } else {
            return l;
        }
    }

    
    public static int leftInsertion_Problem_0_91127709_9752_4099_b746_c3bfd4d1644e(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_9fb252da_dde8_4e57_8adf_c844b6f262f6(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_c758362a_8f91_4ab4_9210_237f77700e82(ArrayList<Integer> a, int x) {
        int left = 0;
        int right = a.size() - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) > x) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    
    public static int leftInsertion_Problem_1_51fb6192_4791_4134_ae73_e1e911bdad96(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size();
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get( m) < x) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_72260940_3b31_4cff_898e_e483e7c28d29(ArrayList<Integer> a, int x) {
        // Binary search
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_6c457338_8d04_4bf4_9be1_f3c27c5543eb(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_d6f097b6_040d_4956_961a_a9d571ad51d3(ArrayList<Integer> a, int x) {
        return -1; // TODO: implement this function
    }

    
    public static int leftInsertion_Problem_2_9747a05e_5677_4b7f_b98a_73fcd594240a(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_c918e9c1_1a46_48e6_b050_9194bf953c91(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_cfa421b3_c53e_43d3_a7b9_eaef53b5b3f8(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size();
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_3488096a_5619_4bd2_9fe1_18caf4dcd71b(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0, r = n - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_9d351df8_a3c8_44d3_b8e9_0f387c22f389(ArrayList<Integer> a, int x) {
        int lo = 0;
        int hi = a.size() - 1;
        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if (a.get(mid) < x) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return lo;
    }

    
    public static int leftInsertion_Problem_2_b9404433_b011_41a3_bcf6_798caf99830d(ArrayList<Integer> a, int x) {
        // Write - Your - Code
        int low = 0;
        int high = a.size() - 1;
        int mid = 0;
        while (low <= high) {
            mid = (low + high) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }

    
    public static int leftInsertion_Problem_1_73ce71ac_83ec_4955_8c82_3e990a65c941(ArrayList<Integer> a, int x) {
        int lo = 0;
        int hi = a.size() - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) > x) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return lo;
    }

    
    public static int leftInsertion_Problem_1_c0bb1ad5_686b_4593_9ac3_eab62c22cb5d(ArrayList<Integer> a, int x) {
        if (a.size() == 0) return 0;
        int lo = 0;
        int hi = a.size() - 1;
        while (lo < hi) {
            int mid = (lo + hi) / 2;
            if (a.get(mid) < x) {
                lo = mid + 1;
            } else {
                hi = mid;
            }
        }
        return lo;
    }

    
    public static int leftInsertion_Problem_0_acaefa7e_180e_4e4f_989c_bb201a0152f1(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_6c457338_8d04_4bf4_9be1_f3c27c5543eb(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_7bab8a00_bbc1_4f7d_817e_684bcb5b0a9c(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) > x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_82b5c533_15b6_4dcc_bb31_a7598a7757c1(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_51031fd9_cdcc_4db9_bdcf_b8e255f934f1(ArrayList<Integer> a, int x) {
        int pos = -1;
        // loop through the array from start to end and compare the values
        for(int i = 0; i < a.size(); i++) {
            if(a.get(i) >= x) {
                // if the value is greater than the specified value
                if(x < a.get(i)) {
                    pos = i;
                    break;
                }
                else {
                    // if the value is less than the specified value, we did not find a match
                    pos = -1;
                    break;
                }
            }
        }
        // if the value is less than the specified value
        if(pos == -1) {
            return 0;
        }
        else {
            // else return the index of the value that is less than the specified value
            return pos;
        }
    }

    
    public static int leftInsertion_Problem_1_067fda54_a864_4af7_b106_74d3b3d68937(ArrayList<Integer> a, int x) {
        int i = 0;
        while(i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_4f02411b_856c_44c9_aac0_e38a7418a7c5(ArrayList<Integer> a, int x) {
        int i = 0;
        while(i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_9db50a46_c0fc_4141_bc88_44b22c1b33e7(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_0b1fb858_e258_45ed_bfa2_20de6d5ccf67(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_e4069b37_d5ef_4d9b_a2de_04fbe7d25596(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_e2c687ea_7a29_4fef_8164_51e45372855b(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_3bef690e_cbf5_4b4b_8c8c_c0df2a15e89e(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_5aa1ff8b_c30e_467f_90d9_6d82099c6c1e(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size()-1;
        while (l <= r) {
            int m = l + (r-l)/2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_8e42ead9_8c68_4d2c_9328_6c65113c6e4c(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_f9bb478f_cf00_47d9_b025_a49d40576e43(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_40030029_9c55_4066_8e27_8d582405f819(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_9b247553_a6c3_4a74_a722_89c0f58e5306(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_23462824_a7ec_4a45_9aac_fa25aa2d7337(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) < x) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_8019dd26_f99e_4e25_8328_b1357e61686a(ArrayList<Integer> a, int x) {
        int low = 0;
        int high = a.size() - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (x < a.get(mid))
                high = mid - 1;
            else if (x > a.get(mid))
                low = mid + 1;
            else
                return mid;
        }
        return low;
    }

    
    public static int leftInsertion_Problem_0_94647665_c92d_4e1d_a8fa_1e05ef3eb636(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0, r = n - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_de3a7c43_fcde_4321_b4d5_dae2a4d20874(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0;
        int r = n - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_27b4550d_5834_4b38_a1aa_cf513f0ab034(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0, r = n - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_1ef3da60_e6ca_40d7_877f_342d9bb349ac(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_6346e24a_c90d_4ccc_b9a6_586efb6c7b8c(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0;
        int r = n - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_99dd79d0_a4ba_43a3_84e0_73015d2f219d(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_67a8715a_30da_4e4c_8457_534c40b20359(ArrayList<Integer> a, int x) {
        // Write - Your - Code
        int low = 0;
        int high = a.size() - 1;
        int mid = 0;
        while (low <= high) {
            mid = (low + high) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    
    public static int leftInsertion_Problem_2_5d7f8d2b_30d7_4390_80bd_ce917c848ad2(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_a8fdb54d_0aff_43df_a52a_e9e064b97299(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_bee08ac0_bc0a_4ca9_a069_3703596e1e7d(ArrayList<Integer> a, int x) {
        return Collections.binarySearch(a, x);
    }

    
    public static int leftInsertion_Problem_0_df6aa422_f51e_45d8_85de_daceb4326025(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_b8bf35a9_ec3f_4a38_a654_7236a78da870(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0, r = n - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_248530e5_e2fb_4db0_9d7a_d194b7ce77cf(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_9d3634bf_20a8_419c_a1c2_2bf6dab35f04(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) < x) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_449e8895_0f78_45ae_ae30_e027385b72a5(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_6389981e_1314_40cb_9fbb_f7e762215db4(ArrayList<Integer> a, int x) {
        int leftIndex = 0;
        int currentX;
        
        for (int i = 0; i < a.size(); i++) {
            currentX = a.get(i);
            if (currentX < x) {
                leftIndex = i;
            }
        }
        
        a.add(leftIndex, x);
        return leftIndex;
    }

    
    public static int leftInsertion_Problem_0_59cd5a5b_3bb9_4d6b_ae87_ceec118f0591(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (a.get(mid) >= x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_1664502f_9e79_428d_a597_7ddc6631ee70(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_027ddd08_dd4d_41a6_be14_eea103fd4744(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_3b32eab2_3ac9_4560_adaa_6f8e360cfd60(ArrayList<Integer> a, int x) {
        // binary search
        int lo = 0;
        int hi = a.size() - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (a.get(mid) < x) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return lo;
    }

    
    public static int leftInsertion_Problem_0_683c1cd5_6ac7_47ac_806b_8d717cafa027(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_1aeee9f7_9124_4ca0_8578_21ab4d6064be(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (a.get(m) >= x)
                r = m - 1;
            else
                l = m + 1;
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_a88aad3f_9d22_493e_9047_5a10558d0d08(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_4631e12b_81e2_47db_9372_dfdabbc13862(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_b24f9964_d914_495a_81e8_b8f2780873c9(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) l = m + 1;
            else r = m;
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_133d3cc9_609c_47bf_9d48_92091b169908(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0, r = n - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_bcc2a37f_7fc5_44aa_a160_a2c185a16ff3(ArrayList<Integer> a, int x) {
        // write your code here
        int leftInsertion_Problem_1_bcc2a37f_7fc5_44aa_a160_a2c185a16ff3 = -1; 
        for(int i = 0; i < a.size() && x > a.get(i);
                i++){
            if(a.get(i) >= x)
                leftInsertion_Problem_1_bcc2a37f_7fc5_44aa_a160_a2c185a16ff3 = i;
        }
        return leftInsertion_Problem_1_bcc2a37f_7fc5_44aa_a160_a2c185a16ff3;
    }

    
    public static int leftInsertion_Problem_0_54afee51_5db1_4088_b2e8_a4a3bc9ced63(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_5bf9e094_885f_4cf9_b283_89332fde30df(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_5aa1ff8b_c30e_467f_90d9_6d82099c6c1e(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size()-1;
        while (l <= r) {
            int m = l + (r-l)/2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_bcc2a37f_7fc5_44aa_a160_a2c185a16ff3(ArrayList<Integer> a, int x) {
        // write your code here
        int leftInsertion_Problem_0_bcc2a37f_7fc5_44aa_a160_a2c185a16ff3 = -1; 
        for(int i = 0; i < a.size() && x > a.get(i);
                i++){
            if(a.get(i) >= x)
                leftInsertion_Problem_0_bcc2a37f_7fc5_44aa_a160_a2c185a16ff3 = i;
        }
        return leftInsertion_Problem_0_bcc2a37f_7fc5_44aa_a160_a2c185a16ff3;
    }

    
    public static int leftInsertion_Problem_1_fc8b43cc_7baf_4bdb_8550_e530dc71ba05(ArrayList<Integer> a, int x) {
        int n = a.size();
        if (x <= a.get(0)) {
            return 0;
        }
        if (x > a.get(n - 1)) {
            return n;
        }
        int lo = 0;
        int hi = n - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (x <= a.get(mid)) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return lo;
    }

    
    public static int leftInsertion_Problem_0_e4069b37_d5ef_4d9b_a2de_04fbe7d25596(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_33e98aed_4d16_4daa_9477_fa3a9e7e3027(ArrayList<Integer> a, int x) {
        int i = 0;
        while(i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_343b71bb_76e8_4c8c_b022_3c5a49cacd25(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_6b47c77a_16d4_4dc8_b611_e6cb7f8ef44e(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_cfecd472_7f6b_4969_9068_743c1ac35b8f(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_7cc6c843_90f8_4b35_9f76_5ac3bd241fbf(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_5b8e346d_7c57_4be8_97d6_fa2a6d759044(ArrayList<Integer> a, int x) {
        // Write your code here
        // To print results to the standard output you can use System.out.println()
        // Example: System.out.println("Hello world!");
        int low = 0;
        int high = a.size() - 1;
        int mid = 0;
        while (low <= high) {
            mid = (low + high) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }

    
    public static int leftInsertion_Problem_0_db45e9b6_bcc9_4d01_91f1_9dd1834d842d(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_2e88e560_240e_45ae_b6f2_c87a61b7eabd(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_d9689457_433d_47ee_9bc2_add310dc90db(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0, r = n - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) > x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_4f45afe2_9050_45e6_86c0_1a5c0f3a0237(ArrayList<Integer> a, int x) {
        int leftIndex = 0;
        int rightIndex = a.size() - 1;
        while (True) {
            while (leftIndex < rightIndex && x <= a.get(rightIndex)) {
                rightIndex--;
            }
            while (leftIndex < rightIndex && x > a.get(leftIndex)) {
                leftIndex++;
            }
            if (leftIndex == rightIndex) {
                return leftIndex;
            }
            if (x < a.get(leftIndex)) {
                leftIndex++;
            }
        }
    }

    
    public static int leftInsertion_Problem_2_ddb2a8a5_85f5_4cac_ad8a_81974310c3a4(ArrayList<Integer> a, int x) {
        // Write - Your - Code
        int low = 0;
        int high = a.size() - 1;
        int mid = 0;
        while (low <= high) {
            mid = (low + high) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    
    public static int leftInsertion_Problem_0_94694dfd_8598_40d5_8877_7984c5955c68(ArrayList<Integer> a, int x) {
        int l = a.size();
        int i = 1;
        while (i < l && a.get(i) < x) {
            i++;
        }
        int left = (a.get(i - 1) != null) ? a.get(i) - 1 : 0L;
        int mid = i - 1;
        while (i < l && a.get(mid) < x) {
            mid++;
        }
        int right = (a.get(mid) != null) ? a.get(mid) : 0L;
        return (left + right);
    }

    
    public static int leftInsertion_Problem_0_d1a3e408_bb4d_43ba_a9ce_95cdebed7edf(ArrayList<Integer> a, int x) {
        return Collections.binarySearch(a, x);
    }

    
    public static int leftInsertion_Problem_1_797300fb_5a1d_405e_8e6d_3e9bfaa6677c(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_7393c1ae_2add_40b1_8da1_c18c1a82df2c(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_5778df42_e845_484a_bac9_1d454ff642e1(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_e0b21528_dc4b_4b42_8e93_e5e50f4a6fd5(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_8036ca2f_4c66_4ce3_820b_e31cc78b5df5(ArrayList<Integer> a, int x) {
        int left = 0;
        int right = a.size() - 1;
        while (left < right) {
            int mid = (left + right) / 2;
            if (a.get(mid) < x) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }

    
    public static int leftInsertion_Problem_1_4af41461_3e11_4527_852a_1de37f7839a7(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0, r = n - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_7e36dea5_eb83_4105_94a1_6a258751e415(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0, r = n - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_5aa1ff8b_c30e_467f_90d9_6d82099c6c1e(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size()-1;
        while (l <= r) {
            int m = l + (r-l)/2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_4013f215_73b2_444b_85fc_7694b38f7ddf(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_673a9a66_8168_4713_85e0_ea9aced809e6(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_d9395b4e_081d_4880_b952_c5c8435ae62c(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) < x) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_7e99fb53_19c9_4102_9030_30e07f375dd6(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0;
        int r = n - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_2c909bd7_7182_403f_9a23_e335505e459c(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) > x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_de3a7c43_fcde_4321_b4d5_dae2a4d20874(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0;
        int r = n - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_24690c19_9576_4fd0_b131_be23d658e185(ArrayList<Integer> a, int x) {
        int i = 0;
        while(i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_6389981e_1314_40cb_9fbb_f7e762215db4(ArrayList<Integer> a, int x) {
        int leftIndex = 0;
        int currentX;
        
        for (int i = 0; i < a.size(); i++) {
            currentX = a.get(i);
            if (currentX < x) {
                leftIndex = i;
            }
        }
        
        a.add(leftIndex, x);
        return leftIndex;
    }

    
    public static int leftInsertion_Problem_2_00482753_a6a1_4b38_a896_7737d625bd86(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_6fa3108e_45a1_4964_9f98_87aeebe540b5(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_5713c8b8_0092_4618_98c6_4092f2fc9d10(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0, r = n - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) > x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_f598fc21_fa89_441b_a0a7_ccab9d38273b(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get( m) == x) {
                return m;
            } else if (a.get( m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_84fd5e2d_ad84_4583_8cdb_86770159687d(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_d9fb7303_537f_49c0_a8a7_e54cebb874ee(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_dbeea9a7_1de2_42f7_b525_fc46281701d5(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_871cef1a_575e_4d94_b540_0fbf071f9722(ArrayList<Integer> a, int x) {
        int i;
        int pos = 0;
        for (i = 1; i < a.size(); i++) {
            if (x < a.get(i)) {
                pos = i;
                break;
            } else if (x == a.get(i)) {
                pos = i;
                break;
            }
        }
        if (pos != 0) {
            for (i = 0; i < a.size(); i++) {
                if (x > a.get(i)) {
                    pos = i;
                    break;
                }
            }
        }
        if (pos == 0) {
            for (i = 0; i < a.size(); i++) {
                if (x < a.get(i)) {
                    pos = i;
                    break;
                }
            }
        }
        return pos;
    }

    
    public static int leftInsertion_Problem_0_cf08f2a6_1500_489d_99f3_b0c947560da9(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_3bef690e_cbf5_4b4b_8c8c_c0df2a15e89e(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_921a9062_4dd8_468d_8625_43d346625faf(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0, r = n - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_d0a49e29_2d39_4a80_b08c_b2925995ca34(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size();
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) >= x) {
                r = m;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_021ab0c4_fe39_4c04_a5ed_68283dabbe32(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) > x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_f02358d4_3da7_4243_8f4d_c924963a665a(ArrayList<Integer> a, int x) {
        int low = 0;
        int high = a.size() - 1;
        int mid = 0;
        while (low <= high) {
            mid = (low + high) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    
    public static int leftInsertion_Problem_0_63ee34d4_7157_4eb8_91f1_8b94e69bccc1(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_27b4550d_5834_4b38_a1aa_cf513f0ab034(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0, r = n - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_c5f97816_a2d5_453b_af36_4cdd08eac3f1(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get( m) == x) {
                return m;
            } else if (a.get( m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_bb5ab7b8_3a20_458e_98df_0e9ae6987419(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_7e99fb53_19c9_4102_9030_30e07f375dd6(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0;
        int r = n - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_78cc098c_ba5c_42d7_82b2_eef84cdc17e3(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_7ac81f7c_3487_47e5_9cb9_a490b0d5b303(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_e8d7b364_9a47_4764_b873_efbc5e9a58dc(ArrayList<Integer> a, int x) {
        int low = 0; int high = a.size()-1;
        while (low<=high) {
            int mid = (low+high)/2;
            if (a.get(mid)>=x) {
                high = mid -1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    
    public static int leftInsertion_Problem_0_10121dec_98b8_477c_b3d1_f3bbc6f8751c(ArrayList<Integer> a, int x) {
        int lo = 0;
        int hi = a.size() - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) < x) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return lo;
    }

    
    public static int leftInsertion_Problem_1_bb59df7b_e1eb_4792_9845_2ab68c239229(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0;
        int r = n;
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_cd163849_bc08_4330_ae97_1a88fccbbbe1(ArrayList<Integer> a, int x) {
        int i = 0;
        int j = a.size() - 1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) < x) {
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_201d07b0_6453_45a0_ac73_0b6bdfaa9f02(ArrayList<Integer> a, int x) {
        int low = 0;
        int high = a.size() - 1;

        while (low <= high) {
            int mid = low + ((high - low) / 2);

            if (x < a.get(mid)) {
                high = mid - 1;
            } else if (x > a.get(mid)) {
                low = mid + 1;
            } else {
                return mid;
            }
        }

        return -1;
    }

    
    public static int leftInsertion_Problem_1_3f129c66_e71e_43e3_bc7f_3e27511fcf1e(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0;
        int r = n - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_133d3cc9_609c_47bf_9d48_92091b169908(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0, r = n - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_91127709_9752_4099_b746_c3bfd4d1644e(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_6210b452_c882_46ea_a23d_a12dbd6af8e0(ArrayList<Integer> a, int x) {
        int i = 0;
        int j = a.size() - 1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (a.get(mid) < x) {
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_ce0df905_771f_4787_b2eb_02e70a9b3118(ArrayList<Integer> a, int x) {
        // Binary search
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_b266e47f_7efd_47d8_880b_352a2a4ab959(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_82b5c533_15b6_4dcc_bb31_a7598a7757c1(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_3fcd62f7_3407_4d53_a35f_923200d65198(ArrayList<Integer> a, int x) {
        int i= 0;
        int last=0;
        int lastindex=0;
        int curr=0;
        boolean found = False;
        for ( i = 0; i<a.size(); i++){
            curr=a.get(i);
            if (curr == x){
                found = True;
                break;
            }
            if (found && curr < x){
                i++;
                last = curr; lastindex = i;
            }
        }
        if (found)
            return lastindex;
        else
            return -1;
    }

    
    public static int leftInsertion_Problem_2_e7f826c8_9df5_4749_b6e7_d66dfb3ec072(ArrayList<Integer> a, int x) {
        int low = 0;
        int high = a.size() - 1;
        int mid;
        while (low <= high) {
            mid = (low + high) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }

    
    public static int leftInsertion_Problem_1_ef5a15e8_1a11_4169_bcdb_ef049c8ad7e3(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_9db50a46_c0fc_4141_bc88_44b22c1b33e7(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_10755c05_46f4_43a1_8e58_96c741bf2b27(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0, r = n - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) >= x) {
                r = m;
            } else {
                l = m + 1;
            }
        }
        if (a.get(l) < x) {
            return l + 1;
        } else {
            return l;
        }
    }

    
    public static int leftInsertion_Problem_0_182dc868_a1c6_461d_bfd8_1465cfdaf0ea(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_1ca1eac9_d305_42d3_b869_508c53246821(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0;
        int r = n - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_b224eb1f_6032_45e0_87a5_a38078030532(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_e3ee864b_9e58_45a9_9e94_f54eb7382151(ArrayList<Integer> a, int x) {
        // Your code goes here
        int left_insertion_point = 0;
        int i = 0;
        while (i < a.size() - 1 && x > a.get(i)) {
            left_insertion_point++;
            i++;
        }
        i++;
        while (i < a.size() && x > a.get(i)) {
            left_insertion_point++;
            i++;
        }
        return left_insertion_point;
    }

    
    public static int leftInsertion_Problem_2_fdc4628d_48e6_4082_8297_aba195f6b518(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_29adf24e_65b2_4b7e_b836_8795efc8bc73(ArrayList<Integer> a, int x) {
        int i =  Math.floor(a.size()/2.0);
        while(i >= 0 && a.get(i) <= x) i--;
        return i+1;
    }

    
    public static int leftInsertion_Problem_1_de3a7c43_fcde_4321_b4d5_dae2a4d20874(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0;
        int r = n - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_22980695_7a25_493a_aea8_631bcd8aedc5(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0;
        int r = n - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_cfecd472_7f6b_4969_9068_743c1ac35b8f(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_7e4712a3_bf58_4489_bed6_89c7e8aed7b9(ArrayList<Integer> a, int x) {
        int idx = a.size() - 1;
        int cmp = a.get(idx).compareTo(x);
        while (cmp < 0 && a.get(idx) != x) {
            idx--;
            cmp = a.get(idx).compareTo(x);
        }
        if (cmp > 0) {
            return idx;
        }
        return idx;
    }

    
    public static int leftInsertion_Problem_0_486c5805_a826_4a95_8009_4a17d4aea2da(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_1062165e_72a4_4260_a296_ef010d2e0c2e(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0, r = n - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            }
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_c293ce0f_f59b_4b32_962b_ab1b9b0f8504(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_4594895a_c033_4701_ba2b_7f8e9cd4ea2f(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_90229816_c24f_4b42_97a1_95d6c2b23a21(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_6389981e_1314_40cb_9fbb_f7e762215db4(ArrayList<Integer> a, int x) {
        int leftIndex = 0;
        int currentX;
        
        for (int i = 0; i < a.size(); i++) {
            currentX = a.get(i);
            if (currentX < x) {
                leftIndex = i;
            }
        }
        
        a.add(leftIndex, x);
        return leftIndex;
    }

    
    public static int leftInsertion_Problem_0_ea2a6024_4a4f_407e_b4b6_11e2a8c62668(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            }
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_7f124665_b7a5_4d64_a89b_8c4d65e369b9(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_c4769b62_fee5_45b6_aa65_8b137638f40d(ArrayList<Integer> a, int x) {
        int i = 0;
        while(i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_7cee3cc5_5700_4abf_ad3d_97c10f5aeedb(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_14f0f991_2075_4cc3_8bb6_90fe4d79eecd(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) >= x)
                r = m - 1;
            else
                l = m + 1;
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_5d6869a4_3c0c_4232_92e0_0107b72740fa(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_c8a12e64_3734_4631_98f9_6003d4393c68(ArrayList<Integer> a, int x) {
        int left = 0;
        int right = a.size() - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) > x) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    
    public static int leftInsertion_Problem_2_16884574_b23c_43db_88ca_bf354c9d2dce(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_6fa82fca_7079_4451_a9b5_2aa288483761(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_e062551a_3ca6_4551_8ceb_e0d9202b7b40(ArrayList<Integer> a, int x) {
        if (a.size() == 0) return 0;
        int l = 0, r = a.size() - 1;
        while (l < r) {
            int mid = (l + r) / 2;
            if (a.get(mid) < x) l = mid + 1;
            else r = mid;
        }
        return a.get(l) >= x ? l : l + 1;
    }

    
    public static int leftInsertion_Problem_1_61ab6d8b_1b8d_4086_8203_8c7a50fbbdd8(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0, r = n - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_45df30f0_4de1_4716_b353_447ed5dace8c(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_b17e7d54_6848_47b3_a2e8_8bcb98b6b214(ArrayList<Integer> a, int x) {
        int low = 0;
        int high = a.size() - 1;
        int mid = 0;
        while (low <= high) {
            mid = (low + high) / 2;
            if (x > a.get(mid)) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }

    
    public static int leftInsertion_Problem_1_f29020d3_6340_47f4_81d2_a0a089dadf60(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_cfa421b3_c53e_43d3_a7b9_eaef53b5b3f8(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size();
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_e944a07b_240c_4370_a384_828ecf0d0f61(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0, r = n - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) < x) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_e6a23d32_2e25_4bbd_873b_154a12824d96(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_63ee34d4_7157_4eb8_91f1_8b94e69bccc1(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_b33e4a78_57cb_4fda_ad81_eb58f3d689a0(ArrayList<Integer> a, int x) {
        int low = 0;
        int high = a.size() - 1;
        int mid = 0;

        while (low <= high) {
            mid = (low + high) / 2;

            if (a.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }

        return mid + 1; // if mid > high, then it means x was present at the end
    }

    
    public static int leftInsertion_Problem_0_094b5f66_6f37_4e50_8789_55fdb7e56db0(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_c904ec36_840d_456c_87fb_b222ae25883b(ArrayList<Integer> a, int x) {
        int i = 0;
        while(i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_c5f97816_a2d5_453b_af36_4cdd08eac3f1(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get( m) == x) {
                return m;
            } else if (a.get( m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_6770f9c5_08c5_41bf_b700_c7e69eb5426e(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_aaa987b4_3cf9_4930_874b_03792c4c891e(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_ef20686a_75dc_47ff_8f4f_ca2e1555500b(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get( m) == x) {
                return m;
            } else if (a.get( m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_2b16b72e_c120_4f60_b47c_8d019f2715ae(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) >= x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_4d7876a7_662e_4337_903e_3fcfe6aabc45(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_871cef1a_575e_4d94_b540_0fbf071f9722(ArrayList<Integer> a, int x) {
        int i;
        int pos = 0;
        for (i = 1; i < a.size(); i++) {
            if (x < a.get(i)) {
                pos = i;
                break;
            } else if (x == a.get(i)) {
                pos = i;
                break;
            }
        }
        if (pos != 0) {
            for (i = 0; i < a.size(); i++) {
                if (x > a.get(i)) {
                    pos = i;
                    break;
                }
            }
        }
        if (pos == 0) {
            for (i = 0; i < a.size(); i++) {
                if (x < a.get(i)) {
                    pos = i;
                    break;
                }
            }
        }
        return pos;
    }

    
    public static int leftInsertion_Problem_0_2b16b72e_c120_4f60_b47c_8d019f2715ae(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) >= x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_882322fe_a767_456f_9049_d29e30278111(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_aca6e635_5fd8_4ccf_8457_048ee5883e42(ArrayList<Integer> a, int x) {
        // Binary search
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_59cd5a5b_3bb9_4d6b_ae87_ceec118f0591(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (a.get(mid) >= x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_065ee834_f493_43b0_8787_85547effd492(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_70bff59c_e1ed_43c0_8810_e365a3d22775(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_c8a12e64_3734_4631_98f9_6003d4393c68(ArrayList<Integer> a, int x) {
        int left = 0;
        int right = a.size() - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) > x) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    
    public static int leftInsertion_Problem_0_acaefa7e_180e_4e4f_989c_bb201a0152f1(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_7ad1eb0d_a61d_4ea9_867d_f55803c4150e(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_b224eb1f_6032_45e0_87a5_a38078030532(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_b56062ea_a91a_4b99_b47e_8384b614c93c(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_94e7a63a_caab_4e70_b3da_9fbf9b56e04f(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_6389981e_1314_40cb_9fbb_f7e762215db4(ArrayList<Integer> a, int x) {
        int leftIndex = 0;
        int currentX;
        
        for (int i = 0; i < a.size(); i++) {
            currentX = a.get(i);
            if (currentX < x) {
                leftIndex = i;
            }
        }
        
        a.add(leftIndex, x);
        return leftIndex;
    }

    
    public static int leftInsertion_Problem_2_dbb5b594_8005_4517_8fef_bad1d75235c3(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_0691d7c0_1999_40c0_9284_f79be957086f(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0, r = n - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) >= x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_16cae836_596f_4dd0_b4db_9b400b839e65(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_6a90d2c2_55c9_483a_a27c_a598f975c24b(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_6c31e1c2_cfc9_45bb_ab6e_ac73c3aeed1d(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_9e347a80_527a_4582_b5e2_360fe2d0b416(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_ff2cfd3e_ac6d_4f72_99f2_246338ae243b(ArrayList<Integer> a, int x) {
        int lo = 0;
        int hi = a.size() - 1;
        while (lo < hi) {
            int mid = (lo + hi) / 2;
            if (a.get(mid) < x) {
                lo = mid + 1;
            } else {
                hi = mid;
            }
        }
        return lo;
    }

    
    public static int leftInsertion_Problem_0_2871eb27_e220_4a59_86c1_fdc1ef71b765(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_264ecdf8_4d30_41c3_9b66_b1f5fa997dbb(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_be14e084_89cd_4ba3_8067_2a0157b87dae(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_dffce6a0_11b7_4023_8f6c_5a496a42c52a(ArrayList<Integer> a, int x) {
        int i = 0;
        int j = a.size() - 1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (a.get(mid) < x) {
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_4dbe2793_4bbb_48bc_9c51_1087d9ef5666(ArrayList<Integer> a, int x) {
        int i = 0;
        int j = a.size() - 1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (a.get(mid) < x) {
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_5d6869a4_3c0c_4232_92e0_0107b72740fa(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_060ebcf7_18f3_41e3_baf8_0969fafc3d6f(ArrayList<Integer> a, int x) {
        int low = 0;
        int high = a.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }

    
    public static int leftInsertion_Problem_2_d68aeab2_7f4b_413f_8ee2_13ac49ca8b73(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_4594895a_c033_4701_ba2b_7f8e9cd4ea2f(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_280ac273_50b0_412d_a04d_f27fd6aed594(ArrayList<Integer> a, int x) {
        int lo = 0;
        int hi = a.size() - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (a.get(mid) < x) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return lo;
    }

    
    public static int leftInsertion_Problem_1_b1c7d2b3_af4b_40aa_8f47_58eadcb1b9d0(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_3af47a2f_e1f8_417c_8887_2d64eeb9b6ac(ArrayList<Integer> a, int x) {
        int i = 0;
        while(i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_e83dd92c_d557_45ee_8d6a_7d82dcb30356(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0, r = n - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_f44396eb_95fc_493a_a2fb_10f83e5bd7ee(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_c8671377_1f1a_44e1_b8f1_f1faf0881db5(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_a1654e6a_e5d5_45e8_bab9_df7dac9a59e3(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0, r = n - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_515e5948_0a98_408e_91f3_2fd03ae64def(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        int m = 0;
        while (l <= r) {
            m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_871cef1a_575e_4d94_b540_0fbf071f9722(ArrayList<Integer> a, int x) {
        int i;
        int pos = 0;
        for (i = 1; i < a.size(); i++) {
            if (x < a.get(i)) {
                pos = i;
                break;
            } else if (x == a.get(i)) {
                pos = i;
                break;
            }
        }
        if (pos != 0) {
            for (i = 0; i < a.size(); i++) {
                if (x > a.get(i)) {
                    pos = i;
                    break;
                }
            }
        }
        if (pos == 0) {
            for (i = 0; i < a.size(); i++) {
                if (x < a.get(i)) {
                    pos = i;
                    break;
                }
            }
        }
        return pos;
    }

    
    public static int leftInsertion_Problem_1_fdfec69a_5754_4d3c_a465_e07013dfa6c8(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) >= x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_0d30acbe_3d2e_4bac_a332_26f2b7f83435(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0;
        int r = n - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_0e90249e_c7de_4198_91a3_539267e4d3e0(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_21e639ea_e5ce_4c80_a893_216e8533e8bd(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0;
        int r = n - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_72d40f0c_52bd_4847_9e0b_4e9e27f9ea86(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_b3a4e312_621d_467a_a4cb_62e53ea3f7fc(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_4fdf4c5e_f90f_41cc_a5f4_b018342d1b08(ArrayList<Integer> a, int x) {
        int low = 0;
        int high = a.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x > a.get(mid)) high = mid - 1;
            if (x < a.get(mid)) low = mid + 1;
            if (mid > 0)
                if (x < a.get(mid - 1)) high = mid - 1;
                if (x > a.get(mid + 1)) low = mid + 1;
        }
        if (low > high) {
            return low;
        } else {
            a.add(low, x);
            a.add(high, x);
            return low + 1;
        }
    }

    
    public static int leftInsertion_Problem_0_ca60d43b_10e0_4162_a708_1c066e6783c5(ArrayList<Integer> a, int x) {
        int i = 0;
        while(i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_00287734_281c_4588_a0de_3f5fade38476(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_b1d3d340_83d1_4f47_b248_a0599277e073(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) > x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_f3a94335_ab76_4cd7_a5a8_97c9178c078a(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_c86c5db1_027f_42d7_83da_1653a041d202(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_8f7b9e7a_cad5_4101_a633_7712dff3c114(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_c2b27b3d_5629_46a8_8797_c22a0e8cf9fc(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_4d48fe40_312b_4ffb_b7bf_bb5dd6390b5d(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) < x)
                l = m + 1;
            else
                r = m - 1;
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_7e99fb53_19c9_4102_9030_30e07f375dd6(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0;
        int r = n - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_14f0f991_2075_4cc3_8bb6_90fe4d79eecd(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) >= x)
                r = m - 1;
            else
                l = m + 1;
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_be14e084_89cd_4ba3_8067_2a0157b87dae(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_1664502f_9e79_428d_a597_7ddc6631ee70(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_db45e9b6_bcc9_4d01_91f1_9dd1834d842d(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_e6a23d32_2e25_4bbd_873b_154a12824d96(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_b3120f44_40a8_4143_b7e6_0a921629ea92(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_08956495_c326_4d11_b0ef_ea0e49ee175c(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size();
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_a0329f65_8e1b_4f2b_b379_f6837ff99a32(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_28324be7_89ba_411b_8691_7318590869ca(ArrayList<Integer> a, int x) {
        if (x > 0) {
            for (int i = 0; i < a.size(); i++) {
                if (a.get(i) <= x)
                    return i;
            }
        }
        return a.size();
    }

    
    public static int leftInsertion_Problem_1_c2b27b3d_5629_46a8_8797_c22a0e8cf9fc(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_8b84ea82_0ff8_4927_bdfb_eba6403bd07f(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_928d908c_319a_493b_bb08_2f4df70aa193(ArrayList<Integer> a, int x) {
        return Collections.binarySearch(a, x);
    }

    
    public static int leftInsertion_Problem_2_275edc80_3b0e_4a0e_8fc2_6cded258dd03(ArrayList<Integer> a, int x) {
        int lo = 0, hi = a.size() - 1;
        while (lo < hi) {
            int mid = (lo + hi) / 2;
            if (a.get(mid) < x) lo = mid + 1;
            else hi = mid;
        }
        return lo;
    }

    
    public static int leftInsertion_Problem_1_b5328ce7_d647_431c_b27b_a3e712d2ce93(ArrayList<Integer> a, int x) {
        int lo = 0;
        int hi = a.size() - 1;
        while (lo < hi) {
            int mid = (lo + hi) / 2;
            if (a.get(mid) < x) {
                lo = mid + 1;
            } else {
                hi = mid;
            }
        }
        return lo;
    }

    
    public static int leftInsertion_Problem_1_8b84ea82_0ff8_4927_bdfb_eba6403bd07f(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_4631e12b_81e2_47db_9372_dfdabbc13862(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_9c7b2f17_5306_49b3_9fc7_78f210f88a7b(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_d8b83826_285c_4575_8232_fd268d53ba42(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_1a5a5f55_3990_49b6_8127_fa4b28c680ea(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            }
            if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_e8d7b364_9a47_4764_b873_efbc5e9a58dc(ArrayList<Integer> a, int x) {
        int low = 0; int high = a.size()-1;
        while (low<=high) {
            int mid = (low+high)/2;
            if (a.get(mid)>=x) {
                high = mid -1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    
    public static int leftInsertion_Problem_0_6fa2d90a_54f1_4f77_9587_99ad9f58fceb(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_406c6540_0f62_447a_aafe_dfdd3b0bf120(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0, r = n - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_5fbab564_9ac3_4e0d_a7e2_1b1eb6a38610(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_bee08ac0_bc0a_4ca9_a069_3703596e1e7d(ArrayList<Integer> a, int x) {
        return Collections.binarySearch(a, x);
    }

    
    public static int leftInsertion_Problem_1_e83dd92c_d557_45ee_8d6a_7d82dcb30356(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0, r = n - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_bcc2a37f_7fc5_44aa_a160_a2c185a16ff3(ArrayList<Integer> a, int x) {
        // write your code here
        int leftInsertion_Problem_0_bcc2a37f_7fc5_44aa_a160_a2c185a16ff3 = -1; 
        for(int i = 0; i < a.size() && x > a.get(i);
                i++){
            if(a.get(i) >= x)
                leftInsertion_Problem_0_bcc2a37f_7fc5_44aa_a160_a2c185a16ff3 = i;
        }
        return leftInsertion_Problem_0_bcc2a37f_7fc5_44aa_a160_a2c185a16ff3;
    }

    
    public static int leftInsertion_Problem_0_49152b37_5fbe_43a7_9735_d83642abfa7b(ArrayList<Integer> a, int x) {
        int i = 0;
        int j = a.size() - 1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (a.get(mid) < x) {
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_e41b21a0_f9f3_46da_9fab_c50dc3759fcd(ArrayList<Integer> a, int x) {
        // Write - Your - Code
        int start = 0;
        int end = a.size() - 1;
        int mid = 0;
        while (start <= end) {
            mid = (start + end) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) < x) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return start;
    }

    
    public static int leftInsertion_Problem_1_de3a7c43_fcde_4321_b4d5_dae2a4d20874(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0;
        int r = n - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_5b8e346d_7c57_4be8_97d6_fa2a6d759044(ArrayList<Integer> a, int x) {
        // Write your code here
        // To print results to the standard output you can use System.out.println()
        // Example: System.out.println("Hello world!");
        int low = 0;
        int high = a.size() - 1;
        int mid = 0;
        while (low <= high) {
            mid = (low + high) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }

    
    public static int leftInsertion_Problem_0_6c457338_8d04_4bf4_9be1_f3c27c5543eb(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_d07bbe78_2e47_469b_ae2a_215b9090daab(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_e677199c_5ee0_48fe_900c_cf7d680552f2(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get( m) == x) {
                return m;
            } else if (a.get( m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_9490ca09_d2df_4d9c_8afe_c63a18a93f05(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_b643f026_a4db_4cea_aa3d_8bb658f4b50a(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_e41b21a0_f9f3_46da_9fab_c50dc3759fcd(ArrayList<Integer> a, int x) {
        // Write - Your - Code
        int start = 0;
        int end = a.size() - 1;
        int mid = 0;
        while (start <= end) {
            mid = (start + end) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) < x) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return start;
    }

    
    public static int leftInsertion_Problem_2_90229816_c24f_4b42_97a1_95d6c2b23a21(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_14e277af_f6dd_44e5_b5bf_cb4068665221(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0, r = n - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_2b16b72e_c120_4f60_b47c_8d019f2715ae(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) >= x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_b643f026_a4db_4cea_aa3d_8bb658f4b50a(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_cd163849_bc08_4330_ae97_1a88fccbbbe1(ArrayList<Integer> a, int x) {
        int i = 0;
        int j = a.size() - 1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) < x) {
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_f83fa504_172c_41bf_92eb_ffbac77fb519(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_3db3c1cb_760e_4254_9312_94b6190aab51(ArrayList<Integer> a, int x) {
        int i = 0;
        int j = a.size() - 1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (a.get(mid) < x) {
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_8b7e4b70_1739_464f_9a63_90bb9adf7bef(ArrayList<Integer> a, int x) {
        int lo = 0;
        int hi = a.size() - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (a.get(mid) < x) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return lo;
    }

    
    public static int leftInsertion_Problem_2_e13c5b83_2890_4797_bf83_d05a873cf032(ArrayList<Integer> a, int x) {
        int low = 0;
        int high = a.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    
    public static int leftInsertion_Problem_0_fd5de8dc_73e1_4464_b3c3_9bcddd342928(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_63be5b32_1c83_43fc_a5f5_e2aa7a32be76(ArrayList<Integer> a, int x) {
        int low = 0;
        int high = a.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    
    public static int leftInsertion_Problem_2_fd748118_753b_40db_8bc9_22c73ec5eb1c(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0;
        int r = n - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_1664502f_9e79_428d_a597_7ddc6631ee70(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_f6bfb32c_c739_4d5c_859b_758280c91f0c(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_0f8406a7_d192_4aba_ac08_366535be7615(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            }
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_83b52693_e195_4223_95fb_318338208e5c(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_a35941c3_bf07_418c_9692_448aadf52c98(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) > x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_4144302d_b83c_4d67_a075_8d3aa6677a63(ArrayList<Integer> a, int x) {
        int low = 0, high = a.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (a.get( mid) == x) {
                return mid;
            } else if (a.get( mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    
    public static int leftInsertion_Problem_0_c3114250_1782_4a55_b08b_d83c23f54ef3(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_49354172_adf7_48e1_9694_fc398d40f6bc(ArrayList<Integer> a, int x) {
        int i = 0;
        while(i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_a5d0b024_d8d9_453c_97ae_10355b100613(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_34d6ef68_1412_4b05_b8fc_ae2dda158edf(ArrayList<Integer> a, int x) {
        if (a.size() == 0) return 0;
        if (a.get(a.size() - 1) <= x) return a.size();
        int l = 0, r = a.size() - 1;
        while (l < r) {
            int mid = (l + r) / 2;
            if (a.get(mid) <= x) l = mid + 1;
            else r = mid;
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_54afee51_5db1_4088_b2e8_a4a3bc9ced63(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_4c393fb8_74c1_4f0f_9180_0b5993f2a93c(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_a88aad3f_9d22_493e_9047_5a10558d0d08(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_56fa580b_9e9c_489f_b9f1_bedf175234b6(ArrayList<Integer> a, int x) {
        int low = 0;
        int high = a.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (a.get(mid) == x) {
                return mid;
            }
            if (a.get(mid) > x) {
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }
        return low;
    }

    
    public static int leftInsertion_Problem_1_f868728a_ba36_4780_8626_35120d1e33ef(ArrayList<Integer> a, int x) {
        int lo = 0;
        int hi = a.size() - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (a.get(mid) < x) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return lo;
    }

    
    public static int leftInsertion_Problem_1_44acab14_46e3_408f_9fa3_3ba915c31c7c(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get( m) == x) {
                return m;
            } else if (a.get( m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_099747d7_4a29_4610_b3e2_202848e425b0(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get( m) == x) {
                return m;
            } else if (a.get( m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_4af41461_3e11_4527_852a_1de37f7839a7(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0, r = n - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_16884574_b23c_43db_88ca_bf354c9d2dce(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_15073c5b_4a42_4b1d_8d99_849486b977d9(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_b00c20e5_60d5_4a5a_a5ee_10ec4db618ed(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0, r = n - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_4e0ea9dd_41c1_4648_bd16_eee4ceb7d2ac(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_c0f0bce1_9c05_475e_939b_0328984072cc(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) return m;
            else if (a.get(m) > x) r = m - 1;
            else l = m + 1;
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_a89d2b01_cab7_4a53_b6fb_0b62bc6db8b1(ArrayList<Integer> a, int x) {
        int index = Collections.binarySearch(a, x);
        if (index < 0) {
            return -(index + 1);
        } else {
            return index;
        }
    }

    
    public static int leftInsertion_Problem_0_a78dd784_3029_4889_a688_dfc131951f90(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_b18659c0_a5b1_4fd0_a68f_5dff5cc4008b(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get( m) < x) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_e9ccc0f6_65fe_4660_9d81_3c0d07314a29(ArrayList<Integer> a, int x) {
        // Write - Your - Code
        int low = 0;
        int high = a.size() - 1;
        int mid = 0;
        while (low <= high) {
            mid = (low + high) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    
    public static int leftInsertion_Problem_1_ff2cfd3e_ac6d_4f72_99f2_246338ae243b(ArrayList<Integer> a, int x) {
        int lo = 0;
        int hi = a.size() - 1;
        while (lo < hi) {
            int mid = (lo + hi) / 2;
            if (a.get(mid) < x) {
                lo = mid + 1;
            } else {
                hi = mid;
            }
        }
        return lo;
    }

    
    public static int leftInsertion_Problem_1_f29020d3_6340_47f4_81d2_a0a089dadf60(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_5cfa0bf6_b75c_4888_9217_471598ef73e1(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l < r) {
            int mid = (l + r) / 2;
            if (a.get(mid) < x) {
                l = mid + 1;
            } else {
                r = mid;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_6b47c77a_16d4_4dc8_b611_e6cb7f8ef44e(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_78681d5e_df11_47c1_b570_fcd87093707d(ArrayList<Integer> a, int x) {
        int i = 0;
        while(i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_3d76cec4_0868_4d20_9373_3a3d5a57f70f(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0;
        int r = n - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_e41b21a0_f9f3_46da_9fab_c50dc3759fcd(ArrayList<Integer> a, int x) {
        // Write - Your - Code
        int start = 0;
        int end = a.size() - 1;
        int mid = 0;
        while (start <= end) {
            mid = (start + end) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) < x) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return start;
    }

    
    public static int leftInsertion_Problem_1_a9c3da70_9cd3_4810_a102_bcf93a328795(ArrayList<Integer> a, int x) {
        int low = 0, high = a.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }

    
    public static int leftInsertion_Problem_0_da6e5f96_1af3_4906_8411_50573146f7fe(ArrayList<Integer> a, int x) {
        int low = 0, high = a.size() - 1;
        int curr = 0;

        while (low < high) {
            int mid = (low + high) >>> 1;
            curr = a.get(mid);

            if (curr < x)
                low = mid + 1;
            else if (curr > x)
                high = mid - 1;
            else
                return mid;
        }
        return low;
    }

    
    public static int leftInsertion_Problem_2_00236230_3202_4298_9283_eb24fc7f20c8(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_673a9a66_8168_4713_85e0_ea9aced809e6(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_3fcd62f7_3407_4d53_a35f_923200d65198(ArrayList<Integer> a, int x) {
        int i= 0;
        int last=0;
        int lastindex=0;
        int curr=0;
        boolean found = False;
        for ( i = 0; i<a.size(); i++){
            curr=a.get(i);
            if (curr == x){
                found = True;
                break;
            }
            if (found && curr < x){
                i++;
                last = curr; lastindex = i;
            }
        }
        if (found)
            return lastindex;
        else
            return -1;
    }

    
    public static int leftInsertion_Problem_1_027d2151_495d_4eb4_9969_11e2bd0675b8(ArrayList<Integer> a, int x) {
        // Write your code here
        return 0;
    }

    
    public static int leftInsertion_Problem_2_a8fdb54d_0aff_43df_a52a_e9e064b97299(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_acc6f6de_9165_4571_8b7e_5b3488a9c0a7(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_90229816_c24f_4b42_97a1_95d6c2b23a21(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_782fb18c_bd74_487d_8150_e875ac85e56e(ArrayList<Integer> a, int x) {
        int i = 0;
        int j = a.size() - 1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) < x) {
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_b17e7d54_6848_47b3_a2e8_8bcb98b6b214(ArrayList<Integer> a, int x) {
        int low = 0;
        int high = a.size() - 1;
        int mid = 0;
        while (low <= high) {
            mid = (low + high) / 2;
            if (x > a.get(mid)) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }

    
    public static int leftInsertion_Problem_2_b38bf438_d39c_46ed_b6ae_87a73ca73eea(ArrayList<Integer> a, int x) {
        int lo = 0;
        int hi = a.size() - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (x == a.get(mid)) {
                return mid;
            } else if (x < a.get(mid)) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return lo;
    }

    
    public static int leftInsertion_Problem_1_87d8024b_1767_45af_b49b_55a5e64cc700(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_5778df42_e845_484a_bac9_1d454ff642e1(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_021ab0c4_fe39_4c04_a5ed_68283dabbe32(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) > x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_ea2a6024_4a4f_407e_b4b6_11e2a8c62668(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            }
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_be14e084_89cd_4ba3_8067_2a0157b87dae(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_e83dd92c_d557_45ee_8d6a_7d82dcb30356(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0, r = n - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_f7d323f9_0f40_48cd_8222_6f5479ce61f4(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0, r = n - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) < x) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_a1c8b87a_ff8f_403b_b023_a708d4988e76(ArrayList<Integer> a, int x) {
        if (x < a.get(0)) {
            return 1;
        } else if (x > a.get(a.size()-1)) {
            return a.size()-1;
        } else {
            int low = 0;
            int high = a.size()-1;
            while (low < high) {
                int mid = (low+high)/2;
                if (x < a.get(mid)) {
                    low = mid + 1;
                } else {
                    high = mid;
                }
            }
            return low;
        }
    }

    
    public static int leftInsertion_Problem_0_280ac273_50b0_412d_a04d_f27fd6aed594(ArrayList<Integer> a, int x) {
        int lo = 0;
        int hi = a.size() - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (a.get(mid) < x) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return lo;
    }

    
    public static int leftInsertion_Problem_1_64dd69ad_dc5e_4f7c_8a13_0ed46602d22a(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_e71d1394_027d_4951_9649_45eb8f8c6c92(ArrayList<Integer> a, int x) {
        int i = 0;
        while(i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_a81f707a_bae8_41e5_8bbf_587bebb7d289(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l < r) {
            int mid = (l + r) / 2;
            if (a.get(mid) < x) {
                l = mid + 1;
            } else {
                r = mid;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_50e4349c_c79a_49fa_9cd9_6691f7144f71(ArrayList<Integer> a, int x) {
        int low = 0;
        int high = a.size() - 1;
        int mid;
        while (low <= high) {
            mid = (low + high) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    
    public static int leftInsertion_Problem_1_8b84ea82_0ff8_4927_bdfb_eba6403bd07f(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_ea2a6024_4a4f_407e_b4b6_11e2a8c62668(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            }
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_6b83e411_cb1e_4c93_90e3_e5afa3fef5a8(ArrayList<Integer> a, int x) {
        int i = 0;
        while(i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_b8bf35a9_ec3f_4a38_a654_7236a78da870(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0, r = n - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_50e4349c_c79a_49fa_9cd9_6691f7144f71(ArrayList<Integer> a, int x) {
        int low = 0;
        int high = a.size() - 1;
        int mid;
        while (low <= high) {
            mid = (low + high) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    
    public static int leftInsertion_Problem_2_527d7b71_d79b_4152_bd3f_52e6cab0f705(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) > x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_00772111_d73d_423b_b4e8_1ca1adf7d6c2(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0;
        int r = n - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_fdc4628d_48e6_4082_8297_aba195f6b518(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_3101a680_a72f_46f9_ae8e_eac9a73caf2a(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get( m) == x) {
                return m;
            } else if (a.get( m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_e99320ad_d7af_4772_876f_7f8f2e7c3324(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_bf486a86_69fa_4b23_835b_9f970b39cb94(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_a0fcc403_9e23_456d_9fd5_86a25f9ac32b(ArrayList<Integer> a, int x) {
        int i = 0;
        int j = a.size() - 1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) < x) {
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_396ed8fa_be76_4d9f_9b98_516f87033f3e(ArrayList<Integer> a, int x) {
        int i = Collections.binarySearch(a, x);
        if (i < 0)
            i = (-i - 2) / 2;
        return i;
    }

    
    public static int leftInsertion_Problem_2_962dc8c5_ae8e_41fd_91d2_a86ed56f4766(ArrayList<Integer> a, int x) {
        int lo = 0;
        int hi = a.size() - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (a.get(mid) < x) {
                lo = mid + 1;
            } else if (a.get(mid) > x) {
                hi = mid - 1;
            } else {
                return mid;
            }
        }
        return lo;
    }

    
    public static int leftInsertion_Problem_0_9b08cd6f_8393_4ebc_bfc1_975a9394d0d6(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) < x) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_c758362a_8f91_4ab4_9210_237f77700e82(ArrayList<Integer> a, int x) {
        int left = 0;
        int right = a.size() - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) > x) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    
    public static int leftInsertion_Problem_0_b8bf35a9_ec3f_4a38_a654_7236a78da870(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0, r = n - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_693eb0cc_ed71_44d3_bcda_6e5d21bd1bbe(ArrayList<Integer> a, int x) {
        int i = 0;
        while(i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_f65420b8_9d80_4191_b21a_cf8e32e37e77(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_1a5a5f55_3990_49b6_8127_fa4b28c680ea(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            }
            if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_2271f33d_ce62_45dc_9c05_cab7cc45e605(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_8c4a6055_5c00_4bc0_b9f0_fb16e334589b(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_934faa85_96e2_408a_925c_c5151d6137aa(ArrayList<Integer> a, int x) {
        int i = 0;
        while(i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_d461856e_03b3_42b2_ac60_e45b1ae2fee2(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_91333fff_63d3_46de_a204_dc010e6cbc57(ArrayList<Integer> a, int x) {
        int lo = 0;
        int hi = a.size() - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (a.get(mid) < x) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return lo;
    }

    
    public static int leftInsertion_Problem_2_78b21298_7948_4326_b304_276db6ed28fa(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_f8363248_e285_446b_a105_1b9a5dfa082a(ArrayList<Integer> a, int x) {
        if (a.size() == 0) {
            return 0;
        }
        int l = 0;
        int r = a.size() - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        if (a.get(l) < x) {
            return l + 1;
        } else {
            return l;
        }
    }

    
    public static int leftInsertion_Problem_0_b2cc95bb_079b_444c_844b_f4139856de5b(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1, m;
        while (l <= r) {
            m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_81bf7b85_b493_4fda_a7dc_2f2e0ef944f7(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get( m) == x) {
                return m;
            } else if (a.get( m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_64dd69ad_dc5e_4f7c_8a13_0ed46602d22a(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_fe967955_80a9_405f_8f0a_1ff0a540dbd4(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) > x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_8daf76df_a04a_4200_89ea_d0feea6534ab(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_78681d5e_df11_47c1_b570_fcd87093707d(ArrayList<Integer> a, int x) {
        int i = 0;
        while(i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_a8fdb54d_0aff_43df_a52a_e9e064b97299(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_97311d2f_5b27_4f2b_ab81_94fde705e673(ArrayList<Integer> a, int x) {
        int lo = 0, hi = a.size() - 1;
        while (lo < hi) {
            int mid = (lo + hi) / 2;
            if (a.get(mid) < x) lo = mid + 1;
            else hi = mid;
        }
        return lo;
    }

    
    public static int leftInsertion_Problem_1_e742c3e1_3641_4353_a86a_a9f2fa05211c(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_8036ca2f_4c66_4ce3_820b_e31cc78b5df5(ArrayList<Integer> a, int x) {
        int left = 0;
        int right = a.size() - 1;
        while (left < right) {
            int mid = (left + right) / 2;
            if (a.get(mid) < x) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }

    
    public static int leftInsertion_Problem_1_3db3c1cb_760e_4254_9312_94b6190aab51(ArrayList<Integer> a, int x) {
        int i = 0;
        int j = a.size() - 1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (a.get(mid) < x) {
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_82af4c3c_f1c4_442b_8ad4_d3df937754fd(ArrayList<Integer> a, int x) {
        // binary search
        int l = 0, r = a.size() - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) >= x) {
                r = m;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_c79bf331_4900_4f16_ba1e_cb9d79253c6e(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (a.get(m) == x) {
                return m;
            }
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_83b52693_e195_4223_95fb_318338208e5c(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_78cc098c_ba5c_42d7_82b2_eef84cdc17e3(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_d621b0ad_219d_47a3_b092_cbce79115e95(ArrayList<Integer> a, int x) {
        int lo = 0;
        int hi = a.size() - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) > x) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return lo;
    }

    
    public static int leftInsertion_Problem_1_5a9d75ce_5abf_4aa9_9b7c_936a4c20ff78(ArrayList<Integer> a, int x) {
        int low = 0;
        int high = a.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }

    
    public static int leftInsertion_Problem_0_6fcbf03a_2172_4371_97a8_a1c73457d16e(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            }
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_bcc2a37f_7fc5_44aa_a160_a2c185a16ff3(ArrayList<Integer> a, int x) {
        // write your code here
        int leftInsertion_Problem_0_bcc2a37f_7fc5_44aa_a160_a2c185a16ff3 = -1; 
        for(int i = 0; i < a.size() && x > a.get(i);
                i++){
            if(a.get(i) >= x)
                leftInsertion_Problem_0_bcc2a37f_7fc5_44aa_a160_a2c185a16ff3 = i;
        }
        return leftInsertion_Problem_0_bcc2a37f_7fc5_44aa_a160_a2c185a16ff3;
    }

    
    public static int leftInsertion_Problem_1_583dc8bf_baa7_4d51_a154_4b6330f50427(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) > x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_4013f215_73b2_444b_85fc_7694b38f7ddf(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_64dd69ad_dc5e_4f7c_8a13_0ed46602d22a(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_c79bf331_4900_4f16_ba1e_cb9d79253c6e(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (a.get(m) == x) {
                return m;
            }
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_a55c3b22_54ef_4114_9997_14045cb5db38(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_49d71936_6f07_46f6_9a6d_a539d9e5b9f2(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0;
        int r = n - 1;
        while (l < r) {
            int m = l + (r - l) / 2;
            if (a.get(m) >= x) {
                r = m;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_91333fff_63d3_46de_a204_dc010e6cbc57(ArrayList<Integer> a, int x) {
        int lo = 0;
        int hi = a.size() - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (a.get(mid) < x) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return lo;
    }

    
    public static int leftInsertion_Problem_1_e8d7b364_9a47_4764_b873_efbc5e9a58dc(ArrayList<Integer> a, int x) {
        int low = 0; int high = a.size()-1;
        while (low<=high) {
            int mid = (low+high)/2;
            if (a.get(mid)>=x) {
                high = mid -1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    
    public static int leftInsertion_Problem_2_6b83e411_cb1e_4c93_90e3_e5afa3fef5a8(ArrayList<Integer> a, int x) {
        int i = 0;
        while(i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_928d908c_319a_493b_bb08_2f4df70aa193(ArrayList<Integer> a, int x) {
        return Collections.binarySearch(a, x);
    }

    
    public static int leftInsertion_Problem_0_3bef690e_cbf5_4b4b_8c8c_c0df2a15e89e(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_81df455d_474b_44e3_83d5_92948ceec0db(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0, r = n - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x)
                return m;
            else if (a.get(m) < x)
                l = m + 1;
            else
                r = m - 1;
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_c8e3e3b8_4ee4_494e_82f5_d827111b57e2(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_7cee3cc5_5700_4abf_ad3d_97c10f5aeedb(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_15e5dfde_6140_4e2f_be61_88d4d0840b5b(ArrayList<Integer> a, int x) {
        int lo = 0;
        int hi = a.size() - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (x <= a.get(mid)) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return lo;
    }

    
    public static int leftInsertion_Problem_1_f65420b8_9d80_4191_b21a_cf8e32e37e77(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_9e297cca_dc0c_453b_ba9d_395bc9e36fba(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_56c31ba3_39dc_4bb8_830c_7fcd04d9b4fe(ArrayList<Integer> a, int x) {
        int i = 0;
        int j = a.size() - 1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (a.get(mid) < x) {
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_16cae836_596f_4dd0_b4db_9b400b839e65(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_21e639ea_e5ce_4c80_a893_216e8533e8bd(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0;
        int r = n - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_ff092044_d53a_467c_8539_1080dbd955b4(ArrayList<Integer> a, int x) {
        int low = 0;
        int high = a.size() - 1;
        int mid = 0;
        while (low <= high) {
            mid = (low + high) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    
    public static int leftInsertion_Problem_0_89133432_6ec6_4292_a7f1_d5fd1691aaa8(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_f598fc21_fa89_441b_a0a7_ccab9d38273b(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get( m) == x) {
                return m;
            } else if (a.get( m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_b0183ac7_a71b_4a70_8f07_4552bd400e3d(ArrayList<Integer> a, int x) {
        int l = 0;
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) < x) {
                l++;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_5d7f8d2b_30d7_4390_80bd_ce917c848ad2(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_f3a94335_ab76_4cd7_a5a8_97c9178c078a(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_59cd5a5b_3bb9_4d6b_ae87_ceec118f0591(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (a.get(mid) >= x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_b18659c0_a5b1_4fd0_a68f_5dff5cc4008b(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get( m) < x) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_e71d1394_027d_4951_9649_45eb8f8c6c92(ArrayList<Integer> a, int x) {
        int i = 0;
        while(i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_edebeb89_35df_4168_93f8_502c6cf830bd(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get( m) == x) {
                return m;
            } else if (a.get( m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_6770f9c5_08c5_41bf_b700_c7e69eb5426e(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_51f2c169_4aa9_46b2_8991_01885c6a627a(ArrayList<Integer> a, int x) {
        boolean found = False;
        for (int i = 0; i < a.size(); i++) {
            if (x == a.get(i)) {
                found = True;
                break;
            }
        }
        if (!found) {
            a.add(x);
        }
        return 0;
    }

    
    public static int leftInsertion_Problem_2_8bbd239e_1609_486c_b07d_600b410f7af2(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_2b94548c_52ab_4211_a2c6_e576487d4d01(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_1e2841d9_fb1a_44f9_aed9_1d9199cde751(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_62e9aacf_ddbf_4f51_bbfb_a3ba9f90cc70(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_94694dfd_8598_40d5_8877_7984c5955c68(ArrayList<Integer> a, int x) {
        int l = a.size();
        int i = 1;
        while (i < l && a.get(i) < x) {
            i++;
        }
        int left = (a.get(i - 1) != null) ? a.get(i) - 1 : 0L;
        int mid = i - 1;
        while (i < l && a.get(mid) < x) {
            mid++;
        }
        int right = (a.get(mid) != null) ? a.get(mid) : 0L;
        return (left + right);
    }

    
    public static int leftInsertion_Problem_0_a01a6672_faf8_4571_8ebe_12a24b13f56b(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_0b729237_b7b3_49d8_a678_9e4bf7031aa9(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_52c994e3_466d_4c0d_b3eb_e162c8df50ff(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_c6b3a682_4945_4012_a016_ab1a49d3611e(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_72260940_3b31_4cff_898e_e483e7c28d29(ArrayList<Integer> a, int x) {
        // Binary search
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_a7b38517_2dd0_4746_8ce9_f2c32b314e80(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_41bdc8aa_6ff0_4138_b19b_0e5ea59ca404(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_e41b21a0_f9f3_46da_9fab_c50dc3759fcd(ArrayList<Integer> a, int x) {
        // Write - Your - Code
        int start = 0;
        int end = a.size() - 1;
        int mid = 0;
        while (start <= end) {
            mid = (start + end) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) < x) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return start;
    }

    
    public static int leftInsertion_Problem_0_6b47c77a_16d4_4dc8_b611_e6cb7f8ef44e(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_4e2a8611_1811_4c52_af61_4c7bb9a6c6c3(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_871cef1a_575e_4d94_b540_0fbf071f9722(ArrayList<Integer> a, int x) {
        int i;
        int pos = 0;
        for (i = 1; i < a.size(); i++) {
            if (x < a.get(i)) {
                pos = i;
                break;
            } else if (x == a.get(i)) {
                pos = i;
                break;
            }
        }
        if (pos != 0) {
            for (i = 0; i < a.size(); i++) {
                if (x > a.get(i)) {
                    pos = i;
                    break;
                }
            }
        }
        if (pos == 0) {
            for (i = 0; i < a.size(); i++) {
                if (x < a.get(i)) {
                    pos = i;
                    break;
                }
            }
        }
        return pos;
    }

    
    public static int leftInsertion_Problem_1_e4069b37_d5ef_4d9b_a2de_04fbe7d25596(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_e4d0f7df_7a17_4d48_b2e7_3978e6815e80(ArrayList<Integer> a, int x) {
        int j = a.size() - 1;
        while (j > 0 && x < a.get(j)) {
            a.set(j + 1, a.get(j));
            j = j - 1;
        }
        a.set(j + 1, x);
        return x;
    }

    
    public static int leftInsertion_Problem_0_ed3dbb8c_917e_4462_a27c_919f59f9a76a(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_d6f097b6_040d_4956_961a_a9d571ad51d3(ArrayList<Integer> a, int x) {
        return -1; // TODO: implement this function
    }

    
    public static int leftInsertion_Problem_2_0691d7c0_1999_40c0_9284_f79be957086f(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0, r = n - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) >= x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_563abecb_1078_4389_b10c_62e2f49def77(ArrayList<Integer> a, int x) {
        for(int i = 0 ; i < a.size(); i++) {
            if(a.get(i) <= x) {
                return i;
            }
        }
        return -1;
    }

    
    public static int leftInsertion_Problem_0_86e74ccd_9b69_401a_a2dd_a4aaf3af3f76(ArrayList<Integer> a, int x) {
        int low = 0;
        int high = a.size() - 1;

        while ((low <= high)) {
            int mid = low + (high - low) / 2;
            if (a.get(mid) >= x) low = mid + 1;
            else high = mid - 1;
        }
        return low;
    }

    
    public static int leftInsertion_Problem_1_790e2bfd_4832_4063_8130_5daaeaaab2eb(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_38a03503_959a_4f16_a507_a4b93990aded(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_3fcd62f7_3407_4d53_a35f_923200d65198(ArrayList<Integer> a, int x) {
        int i= 0;
        int last=0;
        int lastindex=0;
        int curr=0;
        boolean found = False;
        for ( i = 0; i<a.size(); i++){
            curr=a.get(i);
            if (curr == x){
                found = True;
                break;
            }
            if (found && curr < x){
                i++;
                last = curr; lastindex = i;
            }
        }
        if (found)
            return lastindex;
        else
            return -1;
    }

    
    public static int leftInsertion_Problem_1_c4769b62_fee5_45b6_aa65_8b137638f40d(ArrayList<Integer> a, int x) {
        int i = 0;
        while(i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_14f0f991_2075_4cc3_8bb6_90fe4d79eecd(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) >= x)
                r = m - 1;
            else
                l = m + 1;
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_8858567e_e640_4cbe_a3a0_c423ea7469b3(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_02bcbc0e_f2e0_47c7_aece_12e7558feee0(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_c61b37cd_9e10_423d_881b_6a100bff3399(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_5699f555_03b9_45eb_b814_aac97c4fa7e8(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_b3120f44_40a8_4143_b7e6_0a921629ea92(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_70bff59c_e1ed_43c0_8810_e365a3d22775(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_820b5f66_7784_41cb_a2e8_9129b37dbe43(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0, r = n - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_1cef567f_70a2_4f91_a548_f80430e6a7e3(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_2871eb27_e220_4a59_86c1_fdc1ef71b765(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_e4d0f7df_7a17_4d48_b2e7_3978e6815e80(ArrayList<Integer> a, int x) {
        int j = a.size() - 1;
        while (j > 0 && x < a.get(j)) {
            a.set(j + 1, a.get(j));
            j = j - 1;
        }
        a.set(j + 1, x);
        return x;
    }

    
    public static int leftInsertion_Problem_2_3d4f2b8c_9a25_4d5a_9fe4_1cb488defb7f(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_2e93f3af_d440_4a89_ab96_7dccce70c561(ArrayList<Integer> a, int x) {
        int lo = 0;
        int hi = a.size() - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) > x) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return lo;
    }

    
    public static int leftInsertion_Problem_1_cd163849_bc08_4330_ae97_1a88fccbbbe1(ArrayList<Integer> a, int x) {
        int i = 0;
        int j = a.size() - 1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) < x) {
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_5f6540b4_fd08_4047_befd_3b78d49149e7(ArrayList<Integer> a, int x) {
        // a is sorted
        // return the index of the leftmost insertion point for x in a
        // if x is already in a, return the index of the leftmost occurrence of x
        // if x is greater than all elements in a, return a.size()
        // if x is less than all elements in a, return 0
        // if a is empty, return 0
        if (a.size() == 0) return 0;
        int lo = 0;
        int hi = a.size() - 1;
        while (lo < hi) {
            int mid = (lo + hi) / 2;
            if (a.get(mid) < x) lo = mid + 1;
            else hi = mid;
        }
        if (a.get(lo) < x) return lo + 1;
        else return lo;
    }

    
    public static int leftInsertion_Problem_0_11a4b1c1_8fe2_4452_a453_5312f8bf591c(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_0af0df10_2fbf_44cc_8db5_84fe34b0e510(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0, r = n - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (a.get(mid) >= x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_258af634_9b99_41a8_a732_c6779017bf94(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_59e10411_9b59_48b7_b866_522fb101b351(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_7a15de1e_f016_4e32_8d99_f47084f3aeef(ArrayList<Integer> a, int x) {
        int i = 0;
        int j = a.size() - 1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (a.get(mid) < x) {
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_67ae05c7_3b7a_4944_89e9_296c6d97dbc9(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_b17e7d54_6848_47b3_a2e8_8bcb98b6b214(ArrayList<Integer> a, int x) {
        int low = 0;
        int high = a.size() - 1;
        int mid = 0;
        while (low <= high) {
            mid = (low + high) / 2;
            if (x > a.get(mid)) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }

    
    public static int leftInsertion_Problem_0_f7d323f9_0f40_48cd_8222_6f5479ce61f4(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0, r = n - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) < x) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_3abcc77d_90c8_4793_ad79_9a45a5a52cc8(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_8b84ea82_0ff8_4927_bdfb_eba6403bd07f(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_b9404433_b011_41a3_bcf6_798caf99830d(ArrayList<Integer> a, int x) {
        // Write - Your - Code
        int low = 0;
        int high = a.size() - 1;
        int mid = 0;
        while (low <= high) {
            mid = (low + high) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }

    
    public static int leftInsertion_Problem_2_bee08ac0_bc0a_4ca9_a069_3703596e1e7d(ArrayList<Integer> a, int x) {
        return Collections.binarySearch(a, x);
    }

    
    public static int leftInsertion_Problem_0_e0b21528_dc4b_4b42_8e93_e5e50f4a6fd5(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_099747d7_4a29_4610_b3e2_202848e425b0(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get( m) == x) {
                return m;
            } else if (a.get( m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_0e90249e_c7de_4198_91a3_539267e4d3e0(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_65c62366_44d0_48cb_8f30_ba1fe73f032a(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_f1081771_fadd_41b0_8bd3_eda138970ba9(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_b1c7d2b3_af4b_40aa_8f47_58eadcb1b9d0(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_ff47de4b_6a41_44d3_98a1_b5f953866286(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_d621b0ad_219d_47a3_b092_cbce79115e95(ArrayList<Integer> a, int x) {
        int lo = 0;
        int hi = a.size() - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) > x) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return lo;
    }

    
    public static int leftInsertion_Problem_1_578b40ab_59b0_4280_b5d3_cb274f0115b0(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_090c98c0_19ce_4bea_8cdc_df860b2df17c(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_bd6fb50d_454b_4214_bc4d_0789f109561c(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) > x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_8b7e4b70_1739_464f_9a63_90bb9adf7bef(ArrayList<Integer> a, int x) {
        int lo = 0;
        int hi = a.size() - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (a.get(mid) < x) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return lo;
    }

    
    public static int leftInsertion_Problem_0_5aa1ff8b_c30e_467f_90d9_6d82099c6c1e(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size()-1;
        while (l <= r) {
            int m = l + (r-l)/2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_a74e8b96_a5a4_4b92_90e1_fc69d5c137e9(ArrayList<Integer> a, int x) {
        int i = 0;
        int j = a.size() - 1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) < x) {
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_d9689457_433d_47ee_9bc2_add310dc90db(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0, r = n - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) > x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_38c20a8f_32d7_463a_8bdd_6ca617597ad3(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_8dc291a2_27ec_4068_a4f7_79bf9adca68e(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) > x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_4c59c2e1_e99d_495b_913d_c4a1fb3b71fd(ArrayList<Integer> a, int x) {
        int pos = -1;
        for(int i = 0; i <= a.size(); i++){
            if(a.get(i) == x){
                pos = i;
                break;
            }
        }
        if(pos == -1){
            return -1;
        }
        return pos;
    }

    
    public static int leftInsertion_Problem_2_d12f0a4e_d2be_4dd6_b1c2_cd641b6906f0(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0, r = n - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_9726315d_159b_469a_bde8_a204c0939e30(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_5778df42_e845_484a_bac9_1d454ff642e1(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_8b63d3f1_3d4d_444e_a1cc_6e013eb2cd72(ArrayList<Integer> a, int x) {
        int lo = 0;
        int hi = a.size() - 1;
        while (lo < hi) {
            int mid = (lo + hi) / 2;
            if (a.get(mid) < x) {
                lo = mid + 1;
            } else {
                hi = mid;
            }
        }
        return lo;
    }

    
    public static int leftInsertion_Problem_1_4d7876a7_662e_4337_903e_3fcfe6aabc45(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_94e7a63a_caab_4e70_b3da_9fbf9b56e04f(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_bc4daef2_a344_47d1_a235_9f23c6e8cc1f(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_e8d7b364_9a47_4764_b873_efbc5e9a58dc(ArrayList<Integer> a, int x) {
        int low = 0; int high = a.size()-1;
        while (low<=high) {
            int mid = (low+high)/2;
            if (a.get(mid)>=x) {
                high = mid -1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    
    public static int leftInsertion_Problem_2_693eb0cc_ed71_44d3_bcda_6e5d21bd1bbe(ArrayList<Integer> a, int x) {
        int i = 0;
        while(i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_68dec6d2_edce_4b0e_a40e_1511129d331e(ArrayList<Integer> a, int x) {
        int i = 0;
        int j = 1;
        for(; i < a.size(); i++) {
            if(a.get(i) > x) {
                if(a.get(j) > x) {
                    j++;
                } else {
                    return j;
                }
            } else {
                break;
            }
        }
        j++;
        for(; i < a.size(); i++) {
            if(a.get(i) <= x) {
                return i;
            }
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_4fdf4c5e_f90f_41cc_a5f4_b018342d1b08(ArrayList<Integer> a, int x) {
        int low = 0;
        int high = a.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x > a.get(mid)) high = mid - 1;
            if (x < a.get(mid)) low = mid + 1;
            if (mid > 0)
                if (x < a.get(mid - 1)) high = mid - 1;
                if (x > a.get(mid + 1)) low = mid + 1;
        }
        if (low > high) {
            return low;
        } else {
            a.add(low, x);
            a.add(high, x);
            return low + 1;
        }
    }

    
    public static int leftInsertion_Problem_2_7766f85f_e95e_4c99_ae76_5302d3aaa176(ArrayList<Integer> a, int x) {
        int low = 0;
        int high = a.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (a.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }

    
    public static int leftInsertion_Problem_2_23462824_a7ec_4a45_9aac_fa25aa2d7337(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) < x) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_f3a94335_ab76_4cd7_a5a8_97c9178c078a(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_2b94548c_52ab_4211_a2c6_e576487d4d01(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_4d48fe40_312b_4ffb_b7bf_bb5dd6390b5d(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) < x)
                l = m + 1;
            else
                r = m - 1;
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_cf08f2a6_1500_489d_99f3_b0c947560da9(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_00772111_d73d_423b_b4e8_1ca1adf7d6c2(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0;
        int r = n - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_dbb5b594_8005_4517_8fef_bad1d75235c3(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_08956495_c326_4d11_b0ef_ea0e49ee175c(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size();
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_00772111_d73d_423b_b4e8_1ca1adf7d6c2(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0;
        int r = n - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_7e4712a3_bf58_4489_bed6_89c7e8aed7b9(ArrayList<Integer> a, int x) {
        int idx = a.size() - 1;
        int cmp = a.get(idx).compareTo(x);
        while (cmp < 0 && a.get(idx) != x) {
            idx--;
            cmp = a.get(idx).compareTo(x);
        }
        if (cmp > 0) {
            return idx;
        }
        return idx;
    }

    
    public static int leftInsertion_Problem_1_bc4daef2_a344_47d1_a235_9f23c6e8cc1f(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_0a5401a6_371a_4200_ab05_b4f6c88b1857(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_ec7e8ea0_99c8_4c43_8d75_285dad869966(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_31dccf97_1853_4650_a739_1d44acb22f95(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0, r = n - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_edebeb89_35df_4168_93f8_502c6cf830bd(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get( m) == x) {
                return m;
            } else if (a.get( m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_b8bf35a9_ec3f_4a38_a654_7236a78da870(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0, r = n - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_2e781554_f4d1_443f_8818_5d4103a4cb2b(ArrayList<Integer> a, int x) {
        int lo = 0;
        int hi = a.size() - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) > x) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return lo;
    }

    
    public static int leftInsertion_Problem_1_4206dff5_c56d_47a2_bae1_e84de4d08590(ArrayList<Integer> a, int x) {
        int start = 0;
        int end = a.size() - 1;
        int mid = (start + end) / 2;
        while (start <= end && a.get(mid) < x) {
            if(a.get(mid) == x) {
                return mid;
            }
            if(a.get(mid) > x) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
            mid = (start + end) / 2;
        }
        return -1;
    }

    
    public static int leftInsertion_Problem_1_060ebcf7_18f3_41e3_baf8_0969fafc3d6f(ArrayList<Integer> a, int x) {
        int low = 0;
        int high = a.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }

    
    public static int leftInsertion_Problem_0_941728e8_4d2f_45ec_abe9_85d624b2d4f8(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_e8d7b364_9a47_4764_b873_efbc5e9a58dc(ArrayList<Integer> a, int x) {
        int low = 0; int high = a.size()-1;
        while (low<=high) {
            int mid = (low+high)/2;
            if (a.get(mid)>=x) {
                high = mid -1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    
    public static int leftInsertion_Problem_1_bb8bbed3_2b7d_4193_bf0e_5b5248174aff(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_a8fdb54d_0aff_43df_a52a_e9e064b97299(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_735f576f_f683_49b4_9637_37698314238b(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get( m) == x) {
                return m;
            } else if (a.get( m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_3b32eab2_3ac9_4560_adaa_6f8e360cfd60(ArrayList<Integer> a, int x) {
        // binary search
        int lo = 0;
        int hi = a.size() - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (a.get(mid) < x) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return lo;
    }

    
    public static int leftInsertion_Problem_0_e82667d0_445e_4385_b979_110ce5508099(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0, r = n - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) > x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_15073c5b_4a42_4b1d_8d99_849486b977d9(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_89133432_6ec6_4292_a7f1_d5fd1691aaa8(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_2c9a81e0_732f_4fe8_adbd_b347b08e50f5(ArrayList<Integer> a, int x) {
        int left = 0;
        int right = a.size() - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) < x) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }

    
    public static int leftInsertion_Problem_0_9cdf7a58_951f_4507_b9b8_cccb5481d949(ArrayList<Integer> a, int x) {
        int left = 0;
        while (left < a.size() && x > a.get(left)) {
            left++;
        }
        return left;
    }

    
    public static int leftInsertion_Problem_2_ae528a80_1758_48d4_8e39_20986e6e4e1b(ArrayList<Integer> a, int x) {
        int i = 0;
        int j = a.size() - 1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (a.get(mid) < x) {
                i = mid + 1;
            } else if (a.get(mid) > x) {
                j = mid - 1;
            } else {
                return mid;
            }
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_afe2df4c_eec2_45a0_ba86_3fcd30fe301c(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_da249019_d634_4f86_904d_a56082a664e3(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_6a2cb328_09db_4b15_88a5_4d701ee4ab42(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_89133432_6ec6_4292_a7f1_d5fd1691aaa8(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_16884574_b23c_43db_88ca_bf354c9d2dce(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_00236230_3202_4298_9283_eb24fc7f20c8(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_7cc6c843_90f8_4b35_9f76_5ac3bd241fbf(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_94647665_c92d_4e1d_a8fa_1e05ef3eb636(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0, r = n - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_78cc098c_ba5c_42d7_82b2_eef84cdc17e3(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_c42c2188_52d0_4126_9340_237234269af2(ArrayList<Integer> a, int x) {
        int i = 0;
        while(i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_45df30f0_4de1_4716_b353_447ed5dace8c(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_b0183ac7_a71b_4a70_8f07_4552bd400e3d(ArrayList<Integer> a, int x) {
        int l = 0;
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) < x) {
                l++;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_b8ddce07_d84d_450b_acfd_8dbb76bc80c4(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l < r) {
            int mid = (l + r) / 2;
            if (a.get(mid) < x) {
                l = mid + 1;
            } else {
                r = mid;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_ed3dbb8c_917e_4462_a27c_919f59f9a76a(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_00236230_3202_4298_9283_eb24fc7f20c8(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_4594895a_c033_4701_ba2b_7f8e9cd4ea2f(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_d0a49e29_2d39_4a80_b08c_b2925995ca34(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size();
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) >= x) {
                r = m;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_820b5f66_7784_41cb_a2e8_9129b37dbe43(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0, r = n - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_7a15de1e_f016_4e32_8d99_f47084f3aeef(ArrayList<Integer> a, int x) {
        int i = 0;
        int j = a.size() - 1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (a.get(mid) < x) {
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_8dc291a2_27ec_4068_a4f7_79bf9adca68e(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) > x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_91080372_7d83_4645_a604_8677f5ffd453(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_d8cba282_4ec7_46f3_a862_210562cbe323(ArrayList<Integer> a, int x) {
        int n = a.size();
        int pivot = a.get( (n - 1));
        int left = 0;
        int right = 0;
        for (int i = 0; i < n; i++) {
            if (a.get(i) > pivot) {
                right++;
            } else if (a.get(i) < pivot) {
                left++;
            } else {
                return i;
            }
        }
        if (right < left) {
            return -1;
        } else if (right == left) {
            return 0;
        } else {
            return  (right + 1);
        }
    }

    
    public static int leftInsertion_Problem_2_29adf24e_65b2_4b7e_b836_8795efc8bc73(ArrayList<Integer> a, int x) {
        int i =  Math.floor(a.size()/2.0);
        while(i >= 0 && a.get(i) <= x) i--;
        return i+1;
    }

    
    public static int leftInsertion_Problem_1_2b16b72e_c120_4f60_b47c_8d019f2715ae(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) >= x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_ff16babc_5071_4526_82cc_9590a3d25c82(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_027ddd08_dd4d_41a6_be14_eea103fd4744(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_a8fdb54d_0aff_43df_a52a_e9e064b97299(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_fa6670e4_c426_4f84_bd45_3897d533caf6(ArrayList<Integer> a, int x) {
        int lo = 0;
        int hi = a.size() - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) < x) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return lo;
    }

    
    public static int leftInsertion_Problem_2_44521739_8d19_4c14_92d7_65a8ce36444a(ArrayList<Integer> a, int x) {
        int min = Collections.min(a);
        if (x == min) return 0;
        else if (x < min) return Collections.binarySearch(a, min) - 1;
        else return Collections.binarySearch(a, x) - 1;
    }

    
    public static int leftInsertion_Problem_1_067fda54_a864_4af7_b106_74d3b3d68937(ArrayList<Integer> a, int x) {
        int i = 0;
        while(i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_f83fa504_172c_41bf_92eb_ffbac77fb519(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_2c9a81e0_732f_4fe8_adbd_b347b08e50f5(ArrayList<Integer> a, int x) {
        int left = 0;
        int right = a.size() - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) < x) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }

    
    public static int leftInsertion_Problem_0_3f129c66_e71e_43e3_bc7f_3e27511fcf1e(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0;
        int r = n - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_eabab773_c981_43c2_800e_8df50a53bc5c(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_f3701d2b_a965_4e0b_aff6_54880b4547e1(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_aaa987b4_3cf9_4930_874b_03792c4c891e(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_c42c2188_52d0_4126_9340_237234269af2(ArrayList<Integer> a, int x) {
        int i = 0;
        while(i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_c5a2a5ed_2fff_4f70_bba0_917aa5ce7241(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_08956495_c326_4d11_b0ef_ea0e49ee175c(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size();
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_735f576f_f683_49b4_9637_37698314238b(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get( m) == x) {
                return m;
            } else if (a.get( m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_aed35e9e_bb6a_446c_ad97_e1391fc810d3(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0;
        int r = n - 1;
        int m = 0;
        while (l <= r) {
            m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_2d655ae4_9649_434e_ace8_a3541c9320be(ArrayList<Integer> a, int x) {
        int i = 0;
        int j = a.size() - 1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (a.get(mid) < x) {
                i = mid + 1;
            } else if (a.get(mid) > x) {
                j = mid - 1;
            } else {
                return mid;
            }
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_b08faf2d_edd1_416d_90a2_53d57ac747d2(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_0860d7b1_3849_4604_bee9_b602f9d899fe(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_0f8406a7_d192_4aba_ac08_366535be7615(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            }
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_c8e3e3b8_4ee4_494e_82f5_d827111b57e2(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_60de35b4_8d33_4481_a928_aa795143fbb5(ArrayList<Integer> a, int x) {
        int i = 0;
        while(i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_0691d7c0_1999_40c0_9284_f79be957086f(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0, r = n - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) >= x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_790e2bfd_4832_4063_8130_5daaeaaab2eb(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_59e10411_9b59_48b7_b866_522fb101b351(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_c5f7f99f_14f7_48ee_acf7_2177cdd1e17a(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_3b90e66e_63a5_492a_86b2_bec77592f0c7(ArrayList<Integer> a, int x) {
        // Write your code here
        // To print results to the standard output you can use System.out.println()
        // Example: System.out.println("Hello world!");
        int l = 0, r = a.size() - 1;
        while(l < r) {
            int mid = (l + r) / 2;
            if(a.get(mid) >= x) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_aed35e9e_bb6a_446c_ad97_e1391fc810d3(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0;
        int r = n - 1;
        int m = 0;
        while (l <= r) {
            m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_91127709_9752_4099_b746_c3bfd4d1644e(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_f598fc21_fa89_441b_a0a7_ccab9d38273b(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get( m) == x) {
                return m;
            } else if (a.get( m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_65c62366_44d0_48cb_8f30_ba1fe73f032a(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_82ec6658_e228_4ada_9e50_80d72b4cb41d(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_c0bb1ad5_686b_4593_9ac3_eab62c22cb5d(ArrayList<Integer> a, int x) {
        if (a.size() == 0) return 0;
        int lo = 0;
        int hi = a.size() - 1;
        while (lo < hi) {
            int mid = (lo + hi) / 2;
            if (a.get(mid) < x) {
                lo = mid + 1;
            } else {
                hi = mid;
            }
        }
        return lo;
    }

    
    public static int leftInsertion_Problem_0_e062551a_3ca6_4551_8ceb_e0d9202b7b40(ArrayList<Integer> a, int x) {
        if (a.size() == 0) return 0;
        int l = 0, r = a.size() - 1;
        while (l < r) {
            int mid = (l + r) / 2;
            if (a.get(mid) < x) l = mid + 1;
            else r = mid;
        }
        return a.get(l) >= x ? l : l + 1;
    }

    
    public static int leftInsertion_Problem_1_d964f095_be65_451d_b711_db6a45263d72(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_ce868931_5b04_4371_a974_8ab76d99ff83(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) < x) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_067fda54_a864_4af7_b106_74d3b3d68937(ArrayList<Integer> a, int x) {
        int i = 0;
        while(i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_782fb18c_bd74_487d_8150_e875ac85e56e(ArrayList<Integer> a, int x) {
        int i = 0;
        int j = a.size() - 1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) < x) {
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_9b31183b_b6ea_4b09_9906_ba5ed0864563(ArrayList<Integer> a, int x) {
        int i = 0;
        int j = a.size() - 1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (a.get(mid) < x) {
                i = mid + 1;
            } else if (a.get(mid) > x) {
                j = mid - 1;
            } else {
                return mid;
            }
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_1ca1eac9_d305_42d3_b869_508c53246821(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0;
        int r = n - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_3fcd62f7_3407_4d53_a35f_923200d65198(ArrayList<Integer> a, int x) {
        int i= 0;
        int last=0;
        int lastindex=0;
        int curr=0;
        boolean found = False;
        for ( i = 0; i<a.size(); i++){
            curr=a.get(i);
            if (curr == x){
                found = True;
                break;
            }
            if (found && curr < x){
                i++;
                last = curr; lastindex = i;
            }
        }
        if (found)
            return lastindex;
        else
            return -1;
    }

    
    public static int leftInsertion_Problem_2_29adf24e_65b2_4b7e_b836_8795efc8bc73(ArrayList<Integer> a, int x) {
        int i =  Math.floor(a.size()/2.0);
        while(i >= 0 && a.get(i) <= x) i--;
        return i+1;
    }

    
    public static int leftInsertion_Problem_0_91080372_7d83_4645_a604_8677f5ffd453(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_8960c4c5_008d_46de_82ee_674c729a9abd(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_6389981e_1314_40cb_9fbb_f7e762215db4(ArrayList<Integer> a, int x) {
        int leftIndex = 0;
        int currentX;
        
        for (int i = 0; i < a.size(); i++) {
            currentX = a.get(i);
            if (currentX < x) {
                leftIndex = i;
            }
        }
        
        a.add(leftIndex, x);
        return leftIndex;
    }

    
    public static int leftInsertion_Problem_2_980c73d4_91db_4191_99bb_f3d2a955faac(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_4e0ea9dd_41c1_4648_bd16_eee4ceb7d2ac(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_ec7e8ea0_99c8_4c43_8d75_285dad869966(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_090c98c0_19ce_4bea_8cdc_df860b2df17c(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_e742c3e1_3641_4353_a86a_a9f2fa05211c(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_df6aa422_f51e_45d8_85de_daceb4326025(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_2ce7fe92_b7b5_4419_a162_cd66a4281117(ArrayList<Integer> a, int x) {
        int i = 0;
        while(i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_8c4a6055_5c00_4bc0_b9f0_fb16e334589b(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_99dd79d0_a4ba_43a3_84e0_73015d2f219d(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_07a7fc49_fdc9_4ec0_beba_7162810c05fb(ArrayList<Integer> a, int x) {
        int low = 0;
        int high = a.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    
    public static int leftInsertion_Problem_0_f44396eb_95fc_493a_a2fb_10f83e5bd7ee(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_15e5dfde_6140_4e2f_be61_88d4d0840b5b(ArrayList<Integer> a, int x) {
        int lo = 0;
        int hi = a.size() - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (x <= a.get(mid)) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return lo;
    }

    
    public static int leftInsertion_Problem_1_24690c19_9576_4fd0_b131_be23d658e185(ArrayList<Integer> a, int x) {
        int i = 0;
        while(i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_ef5a15e8_1a11_4169_bcdb_ef049c8ad7e3(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_3a9f8029_3b97_436d_a929_ee0ba2b69319(ArrayList<Integer> a, int x) {
        int left = 0;
        int right = a.size() - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) < x) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }

    
    public static int leftInsertion_Problem_2_9fb252da_dde8_4e57_8adf_c844b6f262f6(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_c61b37cd_9e10_423d_881b_6a100bff3399(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_86e74ccd_9b69_401a_a2dd_a4aaf3af3f76(ArrayList<Integer> a, int x) {
        int low = 0;
        int high = a.size() - 1;

        while ((low <= high)) {
            int mid = low + (high - low) / 2;
            if (a.get(mid) >= x) low = mid + 1;
            else high = mid - 1;
        }
        return low;
    }

    
    public static int leftInsertion_Problem_1_90d3a769_c85d_4549_987e_690cc8c0aaa7(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size();
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_2ce7fe92_b7b5_4419_a162_cd66a4281117(ArrayList<Integer> a, int x) {
        int i = 0;
        while(i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_00236230_3202_4298_9283_eb24fc7f20c8(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_2300c325_df95_44ec_84a6_66ca08551624(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_2d3c8dfc_f905_4269_8282_7bacd41f7d9f(ArrayList<Integer> a, int x) {
        int lo = 0;
        int hi = a.size() - 1;
        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if (a.get(mid) < x) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return lo;
    }

    
    public static int leftInsertion_Problem_1_0a5401a6_371a_4200_ab05_b4f6c88b1857(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_c24f1f85_fc33_43bf_b45b_0f45f61e4e32(ArrayList<Integer> a, int x) {
        int i = 0;
        while(i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_cbb71219_535d_4f80_b640_de9fce55212a(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get( m) == x) {
                return m;
            } else if (a.get( m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_41f5071d_430e_43f6_a3fa_f5398bccbffb(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0;
        int r = n - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_9772e0d7_9cce_40ec_a899_6e023290141d(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_49152b37_5fbe_43a7_9735_d83642abfa7b(ArrayList<Integer> a, int x) {
        int i = 0;
        int j = a.size() - 1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (a.get(mid) < x) {
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_4af41461_3e11_4527_852a_1de37f7839a7(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0, r = n - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_22980695_7a25_493a_aea8_631bcd8aedc5(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0;
        int r = n - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_aaa987b4_3cf9_4930_874b_03792c4c891e(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_df6aa422_f51e_45d8_85de_daceb4326025(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_63ecc62d_2ccb_48b5_b9d0_9ebd7babe3a6(ArrayList<Integer> a, int x) {
        int i=0, j=0;
        int k = 0;
        while(i<a.size() && x<a.get(i)) {
            i++;
        }
        while(i<a.size() && x>a.get(i)) {
            i++;
        }
        while(j<a.size() && x<a.get(j)) {
            j++;
        }
        if(i<a.size()) {
            k = a.get(i);
            a.set(i, a.get(j));
            a.set(j, k);
            return i;
        }
        return -1;
    }

    
    public static int leftInsertion_Problem_0_e76c6090_3126_4541_80a7_35983c968dd3(ArrayList<Integer> a, int x) {
        int lo = 0;
        int hi = a.size() - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) > x) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return lo;
    }

    
    public static int leftInsertion_Problem_1_a1654e6a_e5d5_45e8_bab9_df7dac9a59e3(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0, r = n - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_28324be7_89ba_411b_8691_7318590869ca(ArrayList<Integer> a, int x) {
        if (x > 0) {
            for (int i = 0; i < a.size(); i++) {
                if (a.get(i) <= x)
                    return i;
            }
        }
        return a.size();
    }

    
    public static int leftInsertion_Problem_1_31372648_2d71_4109_aa29_53fbb59653cb(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_51031fd9_cdcc_4db9_bdcf_b8e255f934f1(ArrayList<Integer> a, int x) {
        int pos = -1;
        // loop through the array from start to end and compare the values
        for(int i = 0; i < a.size(); i++) {
            if(a.get(i) >= x) {
                // if the value is greater than the specified value
                if(x < a.get(i)) {
                    pos = i;
                    break;
                }
                else {
                    // if the value is less than the specified value, we did not find a match
                    pos = -1;
                    break;
                }
            }
        }
        // if the value is less than the specified value
        if(pos == -1) {
            return 0;
        }
        else {
            // else return the index of the value that is less than the specified value
            return pos;
        }
    }

    
    public static int leftInsertion_Problem_2_7d68b3e3_9ef4_4a92_9906_8b430c681643(ArrayList<Integer> a, int x) {
        int left = 0;
        int right = a.size() - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) > x) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    
    public static int leftInsertion_Problem_1_021ab0c4_fe39_4c04_a5ed_68283dabbe32(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) > x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_69759bc2_6456_48b4_b3ef_dbc9590240ea(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_8b7e4b70_1739_464f_9a63_90bb9adf7bef(ArrayList<Integer> a, int x) {
        int lo = 0;
        int hi = a.size() - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (a.get(mid) < x) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return lo;
    }

    
    public static int leftInsertion_Problem_1_1ef3da60_e6ca_40d7_877f_342d9bb349ac(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_5f6540b4_fd08_4047_befd_3b78d49149e7(ArrayList<Integer> a, int x) {
        // a is sorted
        // return the index of the leftmost insertion point for x in a
        // if x is already in a, return the index of the leftmost occurrence of x
        // if x is greater than all elements in a, return a.size()
        // if x is less than all elements in a, return 0
        // if a is empty, return 0
        if (a.size() == 0) return 0;
        int lo = 0;
        int hi = a.size() - 1;
        while (lo < hi) {
            int mid = (lo + hi) / 2;
            if (a.get(mid) < x) lo = mid + 1;
            else hi = mid;
        }
        if (a.get(lo) < x) return lo + 1;
        else return lo;
    }

    
    public static int leftInsertion_Problem_1_442b9a78_45cc_4173_b594_28966d4e9c22(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_e173cd17_9ffb_42a6_a121_a432c59e4d7b(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_ae528a80_1758_48d4_8e39_20986e6e4e1b(ArrayList<Integer> a, int x) {
        int i = 0;
        int j = a.size() - 1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (a.get(mid) < x) {
                i = mid + 1;
            } else if (a.get(mid) > x) {
                j = mid - 1;
            } else {
                return mid;
            }
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_cbb71219_535d_4f80_b640_de9fce55212a(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get( m) == x) {
                return m;
            } else if (a.get( m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_d461856e_03b3_42b2_ac60_e45b1ae2fee2(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_22ec5f73_8068_4697_8f4b_a9dd6d662e46(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_e13c5b83_2890_4797_bf83_d05a873cf032(ArrayList<Integer> a, int x) {
        int low = 0;
        int high = a.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    
    public static int leftInsertion_Problem_1_94647665_c92d_4e1d_a8fa_1e05ef3eb636(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0, r = n - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_8682c081_83ad_4793_84c0_9202e89c7f7a(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_d68aeab2_7f4b_413f_8ee2_13ac49ca8b73(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_8e42ead9_8c68_4d2c_9328_6c65113c6e4c(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_099747d7_4a29_4610_b3e2_202848e425b0(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get( m) == x) {
                return m;
            } else if (a.get( m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_d6b2966e_5e7b_426a_9f56_4ea4cbc23dfe(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0, r = n - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_49d71936_6f07_46f6_9a6d_a539d9e5b9f2(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0;
        int r = n - 1;
        while (l < r) {
            int m = l + (r - l) / 2;
            if (a.get(m) >= x) {
                r = m;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_a7f63580_b353_451f_8e17_3b63b27d2a35(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_1829883e_0b9c_40dc_bb6b_8d6eedec0fb0(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size()-1;
        while (l <= r) {
            int m = l + (r-l)/2;
            if (a.get(m) == x) {
                return m;
            }
            if (a.get(m) > x) {
                r = m-1;
            } else {
                l = m+1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_aa576efa_80cd_4a93_bb77_8f3c0c7e665d(ArrayList<Integer> a, int x) {
        int left = 0;
        int right = a.size() - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (a.get( mid) == x) {
                return mid;
            } else if (a.get( mid) > x) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    
    public static int leftInsertion_Problem_1_a1c8b87a_ff8f_403b_b023_a708d4988e76(ArrayList<Integer> a, int x) {
        if (x < a.get(0)) {
            return 1;
        } else if (x > a.get(a.size()-1)) {
            return a.size()-1;
        } else {
            int low = 0;
            int high = a.size()-1;
            while (low < high) {
                int mid = (low+high)/2;
                if (x < a.get(mid)) {
                    low = mid + 1;
                } else {
                    high = mid;
                }
            }
            return low;
        }
    }

    
    public static int leftInsertion_Problem_1_0860d7b1_3849_4604_bee9_b602f9d899fe(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_d8cba282_4ec7_46f3_a862_210562cbe323(ArrayList<Integer> a, int x) {
        int n = a.size();
        int pivot = a.get( (n - 1));
        int left = 0;
        int right = 0;
        for (int i = 0; i < n; i++) {
            if (a.get(i) > pivot) {
                right++;
            } else if (a.get(i) < pivot) {
                left++;
            } else {
                return i;
            }
        }
        if (right < left) {
            return -1;
        } else if (right == left) {
            return 0;
        } else {
            return  (right + 1);
        }
    }

    
    public static int leftInsertion_Problem_1_11a4b1c1_8fe2_4452_a453_5312f8bf591c(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_1cef567f_70a2_4f91_a548_f80430e6a7e3(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_0607a234_355f_42b6_a67f_1c12c520d09c(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_3b90e66e_63a5_492a_86b2_bec77592f0c7(ArrayList<Integer> a, int x) {
        // Write your code here
        // To print results to the standard output you can use System.out.println()
        // Example: System.out.println("Hello world!");
        int l = 0, r = a.size() - 1;
        while(l < r) {
            int mid = (l + r) / 2;
            if(a.get(mid) >= x) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_5e4c2db9_c389_4f52_8ed5_201af9a6820b(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_99dd79d0_a4ba_43a3_84e0_73015d2f219d(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_2ce7fe92_b7b5_4419_a162_cd66a4281117(ArrayList<Integer> a, int x) {
        int i = 0;
        while(i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_21660841_5dd1_487c_a02d_c2cb4bac87f0(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get( m) < x) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_3f129c66_e71e_43e3_bc7f_3e27511fcf1e(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0;
        int r = n - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_e76c6090_3126_4541_80a7_35983c968dd3(ArrayList<Integer> a, int x) {
        int lo = 0;
        int hi = a.size() - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) > x) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return lo;
    }

    
    public static int leftInsertion_Problem_2_ecbeebcd_02ee_4c5c_8fb6_0356603e6ded(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_e6a23d32_2e25_4bbd_873b_154a12824d96(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_81bf7b85_b493_4fda_a7dc_2f2e0ef944f7(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get( m) == x) {
                return m;
            } else if (a.get( m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_d621b0ad_219d_47a3_b092_cbce79115e95(ArrayList<Integer> a, int x) {
        int lo = 0;
        int hi = a.size() - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) > x) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return lo;
    }

    
    public static int leftInsertion_Problem_0_1ef3da60_e6ca_40d7_877f_342d9bb349ac(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_86851f59_2c27_4dd3_b7d7_2bab816fb49c(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_c0bb1ad5_686b_4593_9ac3_eab62c22cb5d(ArrayList<Integer> a, int x) {
        if (a.size() == 0) return 0;
        int lo = 0;
        int hi = a.size() - 1;
        while (lo < hi) {
            int mid = (lo + hi) / 2;
            if (a.get(mid) < x) {
                lo = mid + 1;
            } else {
                hi = mid;
            }
        }
        return lo;
    }

    
    public static int leftInsertion_Problem_0_78b21298_7948_4326_b304_276db6ed28fa(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_cb5ad0e1_7545_43ff_b634_060b300f7769(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_cdd7c969_9515_432f_98a5_5d39e1597645(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0;
        int r = n - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (a.get(m) >= x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_ea91ac95_a1e5_48d6_9b4a_fc1eb9eb2f4c(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_bd3fa2f1_be0b_4dc8_b2f9_3709ab7b3d5d(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) >= x) {
                r = m;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_3b32eab2_3ac9_4560_adaa_6f8e360cfd60(ArrayList<Integer> a, int x) {
        // binary search
        int lo = 0;
        int hi = a.size() - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (a.get(mid) < x) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return lo;
    }

    
    public static int leftInsertion_Problem_0_b5328ce7_d647_431c_b27b_a3e712d2ce93(ArrayList<Integer> a, int x) {
        int lo = 0;
        int hi = a.size() - 1;
        while (lo < hi) {
            int mid = (lo + hi) / 2;
            if (a.get(mid) < x) {
                lo = mid + 1;
            } else {
                hi = mid;
            }
        }
        return lo;
    }

    
    public static int leftInsertion_Problem_1_a55c3b22_54ef_4114_9997_14045cb5db38(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_78cc098c_ba5c_42d7_82b2_eef84cdc17e3(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_b18659c0_a5b1_4fd0_a68f_5dff5cc4008b(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get( m) < x) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_4af41461_3e11_4527_852a_1de37f7839a7(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0, r = n - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_583dc8bf_baa7_4d51_a154_4b6330f50427(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) > x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_067837af_4d21_45bf_960d_a8c53d586f96(ArrayList<Integer> a, int x) {
        int i = 0;
        while(i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_c61b37cd_9e10_423d_881b_6a100bff3399(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_f44396eb_95fc_493a_a2fb_10f83e5bd7ee(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_f1081771_fadd_41b0_8bd3_eda138970ba9(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_2eb7751a_6478_426b_b301_2512546e8768(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_b1d3d340_83d1_4f47_b248_a0599277e073(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) > x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_29df1537_0567_48b6_83bf_3084dd2009c4(ArrayList<Integer> a, int x) {
        int i = 0;
        int j = a.size() - 1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (a.get(mid) < x) {
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_e83dd92c_d557_45ee_8d6a_7d82dcb30356(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0, r = n - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_51f2c169_4aa9_46b2_8991_01885c6a627a(ArrayList<Integer> a, int x) {
        boolean found = False;
        for (int i = 0; i < a.size(); i++) {
            if (x == a.get(i)) {
                found = True;
                break;
            }
        }
        if (!found) {
            a.add(x);
        }
        return 0;
    }

    
    public static int leftInsertion_Problem_2_4af40a06_7938_4226_811b_464b0a6581e3(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_45df30f0_4de1_4716_b353_447ed5dace8c(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_8ced5828_5e0c_4790_905f_f2281fe6bed3(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_40030029_9c55_4066_8e27_8d582405f819(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_df01a568_a295_4e8c_a725_bd288beb324a(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0;
        int r = n - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_4737e315_7dcd_4721_89c8_b68c3c98d904(ArrayList<Integer> a, int x) {
        return a.indexOf(x);
    }

    
    public static int leftInsertion_Problem_0_d6a1f0be_dfbc_40fd_ba45_15b6fe3540a3(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_065ee834_f493_43b0_8787_85547effd492(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_3d76cec4_0868_4d20_9373_3a3d5a57f70f(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0;
        int r = n - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_91333fff_63d3_46de_a204_dc010e6cbc57(ArrayList<Integer> a, int x) {
        int lo = 0;
        int hi = a.size() - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (a.get(mid) < x) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return lo;
    }

    
    public static int leftInsertion_Problem_1_ecbeebcd_02ee_4c5c_8fb6_0356603e6ded(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_b2a95aa3_5812_4dfe_9e5b_1ef972660280(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_bb90046b_189e_4791_a7d5_5f31d99cc7b4(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_1bd0229f_7ee3_41b7_9958_fd4e77e33a24(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get( m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_a971de80_bbac_4e81_8685_8d68a04c4bfd(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_a55c3b22_54ef_4114_9997_14045cb5db38(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_5bf9e094_885f_4cf9_b283_89332fde30df(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_673a9a66_8168_4713_85e0_ea9aced809e6(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_bb5ab7b8_3a20_458e_98df_0e9ae6987419(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_bd3fa2f1_be0b_4dc8_b2f9_3709ab7b3d5d(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) >= x) {
                r = m;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_cf08f2a6_1500_489d_99f3_b0c947560da9(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_9ef521e4_aad0_4160_9fe2_29f4279ba6f5(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_038339b1_8654_4f1a_8c3e_7019a2c96388(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get( m) == x) {
                return m;
            } else if (a.get( m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_7e36dea5_eb83_4105_94a1_6a258751e415(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0, r = n - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_57ac3722_1ff4_4a0b_b620_73f32aa87c91(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_e3ee864b_9e58_45a9_9e94_f54eb7382151(ArrayList<Integer> a, int x) {
        // Your code goes here
        int left_insertion_point = 0;
        int i = 0;
        while (i < a.size() - 1 && x > a.get(i)) {
            left_insertion_point++;
            i++;
        }
        i++;
        while (i < a.size() && x > a.get(i)) {
            left_insertion_point++;
            i++;
        }
        return left_insertion_point;
    }

    
    public static int leftInsertion_Problem_2_97311d2f_5b27_4f2b_ab81_94fde705e673(ArrayList<Integer> a, int x) {
        int lo = 0, hi = a.size() - 1;
        while (lo < hi) {
            int mid = (lo + hi) / 2;
            if (a.get(mid) < x) lo = mid + 1;
            else hi = mid;
        }
        return lo;
    }

    
    public static int leftInsertion_Problem_1_e6a23d32_2e25_4bbd_873b_154a12824d96(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_21e639ea_e5ce_4c80_a893_216e8533e8bd(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0;
        int r = n - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_8859698a_5414_4583_85d9_3d80ff20b74e(ArrayList<Integer> a, int x) {
        int lo = 0;
        int hi = a.size() - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) > x) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return lo;
    }

    
    public static int leftInsertion_Problem_1_ea91ac95_a1e5_48d6_9b4a_fc1eb9eb2f4c(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_2f41f48c_0293_4161_b8d6_5e35e6445e31(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_1062165e_72a4_4260_a296_ef010d2e0c2e(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0, r = n - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            }
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_fe967955_80a9_405f_8f0a_1ff0a540dbd4(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) > x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_820b5f66_7784_41cb_a2e8_9129b37dbe43(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0, r = n - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_313bc4ac_5278_4b1e_a075_69ee346d719b(ArrayList<Integer> a, int x) {
        int i = 0;
        boolean found = False;
        while (i < a.size() && !found) {
            if (a.get(i) < x) {
                i++;
            } else {
                found = True;
            }
        }
        
        return i;
    }

    
    public static int leftInsertion_Problem_0_027ddd08_dd4d_41a6_be14_eea103fd4744(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_a7ec39d4_dec1_419c_b0ac_1492c368eeab(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_1dee6844_1a14_42fc_b643_86b9f5ef96ba(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) > x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_c293ce0f_f59b_4b32_962b_ab1b9b0f8504(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_5a9d75ce_5abf_4aa9_9b7c_936a4c20ff78(ArrayList<Integer> a, int x) {
        int low = 0;
        int high = a.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }

    
    public static int leftInsertion_Problem_2_d9689457_433d_47ee_9bc2_add310dc90db(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0, r = n - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) > x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_4fdf4c5e_f90f_41cc_a5f4_b018342d1b08(ArrayList<Integer> a, int x) {
        int low = 0;
        int high = a.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (x > a.get(mid)) high = mid - 1;
            if (x < a.get(mid)) low = mid + 1;
            if (mid > 0)
                if (x < a.get(mid - 1)) high = mid - 1;
                if (x > a.get(mid + 1)) low = mid + 1;
        }
        if (low > high) {
            return low;
        } else {
            a.add(low, x);
            a.add(high, x);
            return low + 1;
        }
    }

    
    public static int leftInsertion_Problem_0_24690c19_9576_4fd0_b131_be23d658e185(ArrayList<Integer> a, int x) {
        int i = 0;
        while(i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_934faa85_96e2_408a_925c_c5151d6137aa(ArrayList<Integer> a, int x) {
        int i = 0;
        while(i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_bb8bbed3_2b7d_4193_bf0e_5b5248174aff(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_7db7dbf7_010f_47e7_8a2b_57024ed3886b(ArrayList<Integer> a, int x) {
        int i = 0;
        int j = a.size() - 1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (a.get(mid) < x) {
                i = mid + 1;
            } else if (a.get(mid) > x) {
                j = mid - 1;
            } else {
                return mid;
            }
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_8ced5828_5e0c_4790_905f_f2281fe6bed3(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_ca22f63e_1c45_4600_97ab_ef83e2b04b80(ArrayList<Integer> a, int x) {
        int left = 0;
        int right = a.get(a.size() - 1);
        while (right > x) {
            if (x <= right) {
                left = right + 1;
                break;
            } else {
                right = right - 1;
            }
        }
        return left;
    }

    
    public static int leftInsertion_Problem_1_85e49a87_412e_4a65_8cbd_765de5faa32f(ArrayList<Integer> a, int x) {
        int low = 0;
        int high = a.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    
    public static int leftInsertion_Problem_2_a55c3b22_54ef_4114_9997_14045cb5db38(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_1829883e_0b9c_40dc_bb6b_8d6eedec0fb0(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size()-1;
        while (l <= r) {
            int m = l + (r-l)/2;
            if (a.get(m) == x) {
                return m;
            }
            if (a.get(m) > x) {
                r = m-1;
            } else {
                l = m+1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_bf486a86_69fa_4b23_835b_9f970b39cb94(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_99569999_6c3b_4900_b360_8e6a72481311(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_97fa7b19_5f34_438a_983f_2d77acfb2c5f(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get( m) == x) {
                return m;
            } else if (a.get( m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_f8363248_e285_446b_a105_1b9a5dfa082a(ArrayList<Integer> a, int x) {
        if (a.size() == 0) {
            return 0;
        }
        int l = 0;
        int r = a.size() - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        if (a.get(l) < x) {
            return l + 1;
        } else {
            return l;
        }
    }

    
    public static int leftInsertion_Problem_2_e76c6090_3126_4541_80a7_35983c968dd3(ArrayList<Integer> a, int x) {
        int lo = 0;
        int hi = a.size() - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) > x) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return lo;
    }

    
    public static int leftInsertion_Problem_2_7db7dbf7_010f_47e7_8a2b_57024ed3886b(ArrayList<Integer> a, int x) {
        int i = 0;
        int j = a.size() - 1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (a.get(mid) < x) {
                i = mid + 1;
            } else if (a.get(mid) > x) {
                j = mid - 1;
            } else {
                return mid;
            }
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_9cb4abad_ca52_49c1_bf7d_09f1bcb714e9(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_8898a257_f776_4627_948d_3427593aabb3(ArrayList<Integer> a, int x) {
        for(int i = 0; i < a.size(); i++) {
            int left = a.get(i);
            int right = a.get((i+1)%a.size());
            if(x > left) {
                int temp = left;
                left = right;
                right = temp;
            }
            if(x > right) {
                return i;
            }
        }
        return a.size();
    }

    
    public static int leftInsertion_Problem_1_3847e30c_a2a4_4ba7_8397_709086ce5b35(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0;
        int r = n - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_7fc61827_c3fe_45de_88e6_44e34d9f902b(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_ef8692b5_b4f3_4d8c_8775_42d53c9e1093(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_a7b61031_225d_4295_9f25_ef44c46ac4a0(ArrayList<Integer> a, int x) {
        int i = 0;
        int j = a.size() - 1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (a.get(mid) < x) {
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_3b90e66e_63a5_492a_86b2_bec77592f0c7(ArrayList<Integer> a, int x) {
        // Write your code here
        // To print results to the standard output you can use System.out.println()
        // Example: System.out.println("Hello world!");
        int l = 0, r = a.size() - 1;
        while(l < r) {
            int mid = (l + r) / 2;
            if(a.get(mid) >= x) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_3a1e40dc_d559_42b8_8be5_5f5219a62472(ArrayList<Integer> a, int x) {
        int low = 0;
        int high = a.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    
    public static int leftInsertion_Problem_0_9726315d_159b_469a_bde8_a204c0939e30(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_a55c3b22_54ef_4114_9997_14045cb5db38(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_a4db0988_d54a_4a96_a55a_0beacfb61dd8(ArrayList<Integer> a, int x) {
        int i = 0;
        int j = a.size() - 1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (a.get(mid) < x) {
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_90d3a769_c85d_4549_987e_690cc8c0aaa7(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size();
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_4dbe2793_4bbb_48bc_9c51_1087d9ef5666(ArrayList<Integer> a, int x) {
        int i = 0;
        int j = a.size() - 1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (a.get(mid) < x) {
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_9747a05e_5677_4b7f_b98a_73fcd594240a(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_4d6f5d1e_921d_4697_b4a2_68993a67c01d(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_060ebcf7_18f3_41e3_baf8_0969fafc3d6f(ArrayList<Integer> a, int x) {
        int low = 0;
        int high = a.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }

    
    public static int leftInsertion_Problem_0_78589b61_2ec8_45eb_b296_1885f22ceeb8(ArrayList<Integer> a, int x) {
        int i = 0;
        int j = a.size() - 1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (a.get(mid) < x) {
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_77072d03_7371_4bfd_8aa5_0c771b7dc0de(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_9e8a657f_fd35_4afb_a3ec_0a9172919ac4(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_44acab14_46e3_408f_9fa3_3ba915c31c7c(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get( m) == x) {
                return m;
            } else if (a.get( m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_81b73118_f864_498e_a5b9_acca1f612f56(ArrayList<Integer> a, int x) {
        int leftInsertPoint = 0;
        for (int i = 0; i < a.size() && a.get(i) > x; i++) leftInsertPoint = a.get(i);
        return leftInsertPoint;
    }

    
    public static int leftInsertion_Problem_2_8960c4c5_008d_46de_82ee_674c729a9abd(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_fa6abc67_d1da_4853_bd80_c339c67ef2e9(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_18ef59fe_4865_4b90_8ec5_2faf4daff3ba(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (a.get(m) >= x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_5778df42_e845_484a_bac9_1d454ff642e1(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_d621b0ad_219d_47a3_b092_cbce79115e95(ArrayList<Integer> a, int x) {
        int lo = 0;
        int hi = a.size() - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) > x) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return lo;
    }

    
    public static int leftInsertion_Problem_2_8e42ead9_8c68_4d2c_9328_6c65113c6e4c(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_264ecdf8_4d30_41c3_9b66_b1f5fa997dbb(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_e115d05b_97ed_40e9_b58e_4063c05ae1a0(ArrayList<Integer> a, int x) {
        int lo = 0;
        int hi = a.size() - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) > x) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return lo;
    }

    
    public static int leftInsertion_Problem_1_d2f58aad_9fb2_46e2_a32e_9f26221a5a5d(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get( m) == x) {
                return m;
            } else if (a.get( m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_258af634_9b99_41a8_a732_c6779017bf94(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_b643f026_a4db_4cea_aa3d_8bb658f4b50a(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_7c508be0_bd67_49e8_93e1_17d3febfd06a(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_a7ec39d4_dec1_419c_b0ac_1492c368eeab(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_82af4c3c_f1c4_442b_8ad4_d3df937754fd(ArrayList<Integer> a, int x) {
        // binary search
        int l = 0, r = a.size() - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) >= x) {
                r = m;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_6fa3108e_45a1_4964_9f98_87aeebe540b5(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_59c156f8_dd7b_4c40_9891_87f7ee924b9c(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_3cef9728_92f5_4a15_aab9_263c7ba377c0(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_34d6ef68_1412_4b05_b8fc_ae2dda158edf(ArrayList<Integer> a, int x) {
        if (a.size() == 0) return 0;
        if (a.get(a.size() - 1) <= x) return a.size();
        int l = 0, r = a.size() - 1;
        while (l < r) {
            int mid = (l + r) / 2;
            if (a.get(mid) <= x) l = mid + 1;
            else r = mid;
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_99569999_6c3b_4900_b360_8e6a72481311(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_ff0a3b3e_b7c5_4523_8121_5af97a2c8e8a(ArrayList<Integer> a, int x) {
        int lo = 0;
        int hi = a.size() - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (a.get(mid) < x) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return lo;
    }

    
    public static int leftInsertion_Problem_0_57ac3722_1ff4_4a0b_b620_73f32aa87c91(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_608d5fee_733f_4cc1_b2de_ffeb2decb5ea(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0;
        int r = n - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_a163fd6e_c8c4_4f8b_8cb0_8253d152c6a9(ArrayList<Integer> a, int x) {
        int lo = 0;
        int hi = a.size() - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (a.get( mid) < x) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return lo;
    }

    
    public static int leftInsertion_Problem_2_8898a257_f776_4627_948d_3427593aabb3(ArrayList<Integer> a, int x) {
        for(int i = 0; i < a.size(); i++) {
            int left = a.get(i);
            int right = a.get((i+1)%a.size());
            if(x > left) {
                int temp = left;
                left = right;
                right = temp;
            }
            if(x > right) {
                return i;
            }
        }
        return a.size();
    }

    
    public static int leftInsertion_Problem_0_29adf24e_65b2_4b7e_b836_8795efc8bc73(ArrayList<Integer> a, int x) {
        int i =  Math.floor(a.size()/2.0);
        while(i >= 0 && a.get(i) <= x) i--;
        return i+1;
    }

    
    public static int leftInsertion_Problem_1_78589b61_2ec8_45eb_b296_1885f22ceeb8(ArrayList<Integer> a, int x) {
        int i = 0;
        int j = a.size() - 1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (a.get(mid) < x) {
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_c79bf331_4900_4f16_ba1e_cb9d79253c6e(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (a.get(m) == x) {
                return m;
            }
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_3bef690e_cbf5_4b4b_8c8c_c0df2a15e89e(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_3b90e66e_63a5_492a_86b2_bec77592f0c7(ArrayList<Integer> a, int x) {
        // Write your code here
        // To print results to the standard output you can use System.out.println()
        // Example: System.out.println("Hello world!");
        int l = 0, r = a.size() - 1;
        while(l < r) {
            int mid = (l + r) / 2;
            if(a.get(mid) >= x) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_fdd988ff_8593_4534_b5e1_6deb6d542249(ArrayList<Integer> a, int x) {
        // Write - Your - Code
        int left = 0;
        int right = a.size() - 1;
        while (left < right) {
            int mid = (left + right) / 2;
            if (a.get(mid) < x) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }

    
    public static int leftInsertion_Problem_0_7ad1eb0d_a61d_4ea9_867d_f55803c4150e(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_f9bb478f_cf00_47d9_b025_a49d40576e43(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_fd5de8dc_73e1_4464_b3c3_9bcddd342928(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_58731924_4216_46c6_8aba_e6e73cf74d54(ArrayList<Integer> a, int x) {
        int left = 0;
        int right = a.size() - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (a.get(mid) < x) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }

    
    public static int leftInsertion_Problem_0_0af0df10_2fbf_44cc_8db5_84fe34b0e510(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0, r = n - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (a.get(mid) >= x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_eabab773_c981_43c2_800e_8df50a53bc5c(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_d9fb7303_537f_49c0_a8a7_e54cebb874ee(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_7ad1eb0d_a61d_4ea9_867d_f55803c4150e(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_3abcc77d_90c8_4793_ad79_9a45a5a52cc8(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_02bcbc0e_f2e0_47c7_aece_12e7558feee0(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_c8a12e64_3734_4631_98f9_6003d4393c68(ArrayList<Integer> a, int x) {
        int left = 0;
        int right = a.size() - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) > x) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    
    public static int leftInsertion_Problem_0_50289cff_8f6f_4f66_a771_292c0003c4c7(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0, r = n - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) return m;
            if (a.get(m) > x) r = m - 1;
            else l = m + 1;
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_2e93f3af_d440_4a89_ab96_7dccce70c561(ArrayList<Integer> a, int x) {
        int lo = 0;
        int hi = a.size() - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) > x) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return lo;
    }

    
    public static int leftInsertion_Problem_1_f0395f92_37b7_452c_9568_393dd650a98c(ArrayList<Integer> a, int x) {
        int lo = 0;
        int hi = a.size() - 1;
        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if (a.get(mid) < x) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return lo;
    }

    
    public static int leftInsertion_Problem_0_f84cfd1b_d195_4878_b56a_5391d957c0f7(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_d4dd9121_574f_4a62_9aac_aa0622c5741f(ArrayList<Integer> a, int x) {
        int n = a.size();
        if (x <= a.get(0)) {
            return 0;
        }
        if (x > a.get(n - 1)) {
            return n;
        }
        int lo = 0;
        int hi = n - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) < x && a.get(mid + 1) > x) {
                return mid + 1;
            } else if (a.get(mid) < x) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return -1;
    }

    
    public static int leftInsertion_Problem_0_6a90d2c2_55c9_483a_a27c_a598f975c24b(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_94e7a63a_caab_4e70_b3da_9fbf9b56e04f(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_b33e4a78_57cb_4fda_ad81_eb58f3d689a0(ArrayList<Integer> a, int x) {
        int low = 0;
        int high = a.size() - 1;
        int mid = 0;

        while (low <= high) {
            mid = (low + high) / 2;

            if (a.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }

        return mid + 1; // if mid > high, then it means x was present at the end
    }

    
    public static int leftInsertion_Problem_2_11a4b1c1_8fe2_4452_a453_5312f8bf591c(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_ee9e87f0_5569_4b3d_b804_dddac9656953(ArrayList<Integer> a, int x) {
        int i = 0;
        while(i < a.size() && x <= a.get(i)) {
            i++;
        }
        if (i == a.size())
            return a.size() - 1;
        return i;
    }

    
    public static int leftInsertion_Problem_1_81734291_3a05_4c5a_9052_75c8378119d4(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_e062551a_3ca6_4551_8ceb_e0d9202b7b40(ArrayList<Integer> a, int x) {
        if (a.size() == 0) return 0;
        int l = 0, r = a.size() - 1;
        while (l < r) {
            int mid = (l + r) / 2;
            if (a.get(mid) < x) l = mid + 1;
            else r = mid;
        }
        return a.get(l) >= x ? l : l + 1;
    }

    
    public static int leftInsertion_Problem_1_08956495_c326_4d11_b0ef_ea0e49ee175c(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size();
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_722e0c23_d4cd_4e86_ab50_479d23d1a599(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_8f7b9e7a_cad5_4101_a633_7712dff3c114(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_7bab89c2_ffc0_44b6_904c_985bfa58e6bb(ArrayList<Integer> a, int x) {
        int lo = 0;
        int hi = a.size() - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (a.get(mid) < x) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return lo;
    }

    
    public static int leftInsertion_Problem_2_16ece67d_e1c6_49ed_a647_be56f63dced3(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0;
        int r = n - 1;
        int mid = 0;
        while (l <= r) {
            mid = (l + r) / 2;
            if (x > a.get(mid)) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_a2549f68_3380_4a85_bcaf_58ee67b28976(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_91127709_9752_4099_b746_c3bfd4d1644e(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_4e2a8611_1811_4c52_af61_4c7bb9a6c6c3(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_563abecb_1078_4389_b10c_62e2f49def77(ArrayList<Integer> a, int x) {
        for(int i = 0 ; i < a.size(); i++) {
            if(a.get(i) <= x) {
                return i;
            }
        }
        return -1;
    }

    
    public static int leftInsertion_Problem_2_ef8692b5_b4f3_4d8c_8775_42d53c9e1093(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_83b52693_e195_4223_95fb_318338208e5c(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_cd163849_bc08_4330_ae97_1a88fccbbbe1(ArrayList<Integer> a, int x) {
        int i = 0;
        int j = a.size() - 1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) < x) {
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_1aeee9f7_9124_4ca0_8578_21ab4d6064be(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (a.get(m) >= x)
                r = m - 1;
            else
                l = m + 1;
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_e3ee864b_9e58_45a9_9e94_f54eb7382151(ArrayList<Integer> a, int x) {
        // Your code goes here
        int left_insertion_point = 0;
        int i = 0;
        while (i < a.size() - 1 && x > a.get(i)) {
            left_insertion_point++;
            i++;
        }
        i++;
        while (i < a.size() && x > a.get(i)) {
            left_insertion_point++;
            i++;
        }
        return left_insertion_point;
    }

    
    public static int leftInsertion_Problem_0_075c1a13_7b6d_4f60_ad56_0ae7f9cf1806(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_a8d6577b_a9f8_4467_9d7c_46b302bb2034(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_b08faf2d_edd1_416d_90a2_53d57ac747d2(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_264ecdf8_4d30_41c3_9b66_b1f5fa997dbb(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_0b55230a_53e7_43ce_ae7b_33e1905da725(ArrayList<Integer> a, int x) {
        int i = 0;
        while(i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_23462824_a7ec_4a45_9aac_fa25aa2d7337(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) < x) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_9ac877df_4927_465e_8fde_ab07a82fd97e(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_52c994e3_466d_4c0d_b3eb_e162c8df50ff(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_797300fb_5a1d_405e_8e6d_3e9bfaa6677c(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_e83dd92c_d557_45ee_8d6a_7d82dcb30356(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0, r = n - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_9772e0d7_9cce_40ec_a899_6e023290141d(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_22ec5f73_8068_4697_8f4b_a9dd6d662e46(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_8019dd26_f99e_4e25_8328_b1357e61686a(ArrayList<Integer> a, int x) {
        int low = 0;
        int high = a.size() - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (x < a.get(mid))
                high = mid - 1;
            else if (x > a.get(mid))
                low = mid + 1;
            else
                return mid;
        }
        return low;
    }

    
    public static int leftInsertion_Problem_2_78b21298_7948_4326_b304_276db6ed28fa(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_d9689457_433d_47ee_9bc2_add310dc90db(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0, r = n - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) > x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_0d02f193_9cfd_4c79_b5df_1bc897bec614(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (a.get(m) >= x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_bb8bbed3_2b7d_4193_bf0e_5b5248174aff(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_c87a79ef_91b5_4d10_978c_ec8d0ab78183(ArrayList<Integer> a, int x) {
        int low = 0;
        int high = a.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    
    public static int leftInsertion_Problem_1_f6799bbd_3f28_451b_adaa_decdfa17c42f(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0;
        int r = n - 1;
        int mid = 0;
        while (l <= r) {
            mid = (l + r) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) < x) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_8682c081_83ad_4793_84c0_9202e89c7f7a(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_ae3ed6e4_d50b_4ee1_ba61_40abee85aba6(ArrayList<Integer> a, int x) {
        int low = 0;
        int high = a.size() - 1;
        while (low <= high) {
            int mid = (low + high) >>> 1;
            int midVal = a.get(mid);
            if (midVal < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }

    
    public static int leftInsertion_Problem_0_9b08cd6f_8393_4ebc_bfc1_975a9394d0d6(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) < x) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_5aa1ff8b_c30e_467f_90d9_6d82099c6c1e(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size()-1;
        while (l <= r) {
            int m = l + (r-l)/2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_b1cc5cc3_1801_4bc9_b4d9_6c6273295ed3(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_782fb18c_bd74_487d_8150_e875ac85e56e(ArrayList<Integer> a, int x) {
        int i = 0;
        int j = a.size() - 1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) < x) {
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_de62b5e7_2b8c_48b8_90e4_2c59e8243b0a(ArrayList<Integer> a, int x) {
        int lo = 0;
        int hi = a.size()-1;
        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) < x) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return lo;
    }

    
    public static int leftInsertion_Problem_2_c61b37cd_9e10_423d_881b_6a100bff3399(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_a88aad3f_9d22_493e_9047_5a10558d0d08(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_c3114250_1782_4a55_b08b_d83c23f54ef3(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_275edc80_3b0e_4a0e_8fc2_6cded258dd03(ArrayList<Integer> a, int x) {
        int lo = 0, hi = a.size() - 1;
        while (lo < hi) {
            int mid = (lo + hi) / 2;
            if (a.get(mid) < x) lo = mid + 1;
            else hi = mid;
        }
        return lo;
    }

    
    public static int leftInsertion_Problem_1_f7d323f9_0f40_48cd_8222_6f5479ce61f4(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0, r = n - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) < x) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_cf08f2a6_1500_489d_99f3_b0c947560da9(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_5db21ecd_a026_4a02_97f8_b080e252375d(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_49354172_adf7_48e1_9694_fc398d40f6bc(ArrayList<Integer> a, int x) {
        int i = 0;
        while(i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_c8671377_1f1a_44e1_b8f1_f1faf0881db5(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_1b24d47d_6691_4e3a_82bf_a9b38baddd4b(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_3d4f2b8c_9a25_4d5a_9fe4_1cb488defb7f(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_e41b21a0_f9f3_46da_9fab_c50dc3759fcd(ArrayList<Integer> a, int x) {
        // Write - Your - Code
        int start = 0;
        int end = a.size() - 1;
        int mid = 0;
        while (start <= end) {
            mid = (start + end) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) < x) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return start;
    }

    
    public static int leftInsertion_Problem_0_5cfa0bf6_b75c_4888_9217_471598ef73e1(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l < r) {
            int mid = (l + r) / 2;
            if (a.get(mid) < x) {
                l = mid + 1;
            } else {
                r = mid;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_5a9d75ce_5abf_4aa9_9b7c_936a4c20ff78(ArrayList<Integer> a, int x) {
        int low = 0;
        int high = a.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }

    
    public static int leftInsertion_Problem_0_5159133f_6717_4177_8ffe_abc94caab3e2(ArrayList<Integer> a, int x) {
        int lo = 0;
        int hi = a.size() - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (a.get(mid) < x) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return lo;
    }

    
    public static int leftInsertion_Problem_1_3101a680_a72f_46f9_ae8e_eac9a73caf2a(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get( m) == x) {
                return m;
            } else if (a.get( m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_2271f33d_ce62_45dc_9c05_cab7cc45e605(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_1dee6844_1a14_42fc_b643_86b9f5ef96ba(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) > x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_29adf24e_65b2_4b7e_b836_8795efc8bc73(ArrayList<Integer> a, int x) {
        int i =  Math.floor(a.size()/2.0);
        while(i >= 0 && a.get(i) <= x) i--;
        return i+1;
    }

    
    public static int leftInsertion_Problem_1_7dd493f9_8f15_4994_9671_5e4e3083e24d(ArrayList<Integer> a, int x) {
        int lo = 0;
        int hi = a.size() - 1;
        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if (a.get(mid) < x) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return lo;
    }

    
    public static int leftInsertion_Problem_2_deccd74c_da88_4061_9cdf_1bcd0e981645(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_67ae05c7_3b7a_4944_89e9_296c6d97dbc9(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_5db21ecd_a026_4a02_97f8_b080e252375d(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_49354172_adf7_48e1_9694_fc398d40f6bc(ArrayList<Integer> a, int x) {
        int i = 0;
        while(i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_21e639ea_e5ce_4c80_a893_216e8533e8bd(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0;
        int r = n - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_fdfec69a_5754_4d3c_a465_e07013dfa6c8(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) >= x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_9e347a80_527a_4582_b5e2_360fe2d0b416(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_99dd79d0_a4ba_43a3_84e0_73015d2f219d(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_bd3fa2f1_be0b_4dc8_b2f9_3709ab7b3d5d(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) >= x) {
                r = m;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_d9689457_433d_47ee_9bc2_add310dc90db(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0, r = n - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) > x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_6ca9dd10_e959_42c5_8c46_8b4041fe9fb8(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0, r = n - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) >= x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_ae3ed6e4_d50b_4ee1_ba61_40abee85aba6(ArrayList<Integer> a, int x) {
        int low = 0;
        int high = a.size() - 1;
        while (low <= high) {
            int mid = (low + high) >>> 1;
            int midVal = a.get(mid);
            if (midVal < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }

    
    public static int leftInsertion_Problem_2_d7fa4ee7_f424_4329_b39e_e2c165148d67(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_e7f826c8_9df5_4749_b6e7_d66dfb3ec072(ArrayList<Integer> a, int x) {
        int low = 0;
        int high = a.size() - 1;
        int mid;
        while (low <= high) {
            mid = (low + high) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }

    
    public static int leftInsertion_Problem_2_d461856e_03b3_42b2_ac60_e45b1ae2fee2(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_426f1907_d14e_426f_9f13_dae66dbafe5b(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (a.get( m) == x) {
                return m;
            } else if (a.get( m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_78681d5e_df11_47c1_b570_fcd87093707d(ArrayList<Integer> a, int x) {
        int i = 0;
        while(i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_5bf9e094_885f_4cf9_b283_89332fde30df(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_21660841_5dd1_487c_a02d_c2cb4bac87f0(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get( m) < x) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_094b5f66_6f37_4e50_8789_55fdb7e56db0(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_11a4b1c1_8fe2_4452_a453_5312f8bf591c(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_d1a3e408_bb4d_43ba_a9ce_95cdebed7edf(ArrayList<Integer> a, int x) {
        return Collections.binarySearch(a, x);
    }

    
    public static int leftInsertion_Problem_1_5e02e26a_bc12_4492_9eab_c4fc88dd7872(ArrayList<Integer> a, int x) {
        int left = 0;
        int right = a.get(0); // get first element
        while (right < a.size() - 1) { // while right is less than the size of the array
            if (x <= right) { // if x is less than the right element
                left = right + 1; // set left to the right element + 1
            } else {
                left++; // if x is greater than the right element, set left to right element + 1
            }
            right++; // increment right by 1
        }
        return left; // return the left insertion point
    }

    
    public static int leftInsertion_Problem_1_1829883e_0b9c_40dc_bb6b_8d6eedec0fb0(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size()-1;
        while (l <= r) {
            int m = l + (r-l)/2;
            if (a.get(m) == x) {
                return m;
            }
            if (a.get(m) > x) {
                r = m-1;
            } else {
                l = m+1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_7393c1ae_2add_40b1_8da1_c18c1a82df2c(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_fab0a78e_11a9_4c6d_9145_a0a14a41ac2b(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_0b55230a_53e7_43ce_ae7b_33e1905da725(ArrayList<Integer> a, int x) {
        int i = 0;
        while(i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_2907dd53_5c21_4c41_accb_115697f62476(ArrayList<Integer> a, int x) {
        // Write your code here
        int low = 0;
        int high = a.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (a.get( mid) == x) {
                return mid;
            } else if (a.get( mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    
    public static int leftInsertion_Problem_2_038339b1_8654_4f1a_8c3e_7019a2c96388(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get( m) == x) {
                return m;
            } else if (a.get( m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_9fb252da_dde8_4e57_8adf_c844b6f262f6(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_8c4a6055_5c00_4bc0_b9f0_fb16e334589b(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_ed3722ae_e47d_4f54_93de_eaa9c7fe39db(ArrayList<Integer> a, int x) {
        int n = a.size();
        int lo = 0;
        int hi = n - 1;
        int mid = 0;
        while (lo <= hi) {
            mid = lo + (hi - lo) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) > x) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return lo;
    }

    
    public static int leftInsertion_Problem_1_6c457338_8d04_4bf4_9be1_f3c27c5543eb(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_21461799_5768_4adf_bd51_34ead0ca0e87(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_44acab14_46e3_408f_9fa3_3ba915c31c7c(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get( m) == x) {
                return m;
            } else if (a.get( m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_4594895a_c033_4701_ba2b_7f8e9cd4ea2f(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_ff2cfd3e_ac6d_4f72_99f2_246338ae243b(ArrayList<Integer> a, int x) {
        int lo = 0;
        int hi = a.size() - 1;
        while (lo < hi) {
            int mid = (lo + hi) / 2;
            if (a.get(mid) < x) {
                lo = mid + 1;
            } else {
                hi = mid;
            }
        }
        return lo;
    }

    
    public static int leftInsertion_Problem_2_ef5a15e8_1a11_4169_bcdb_ef049c8ad7e3(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_59c156f8_dd7b_4c40_9891_87f7ee924b9c(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_2271f33d_ce62_45dc_9c05_cab7cc45e605(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_65c62366_44d0_48cb_8f30_ba1fe73f032a(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_03159ca5_1694_45d0_96a6_be4526f0fa74(ArrayList<Integer> a, int x) {
        int low = 0;
        int high = a.size() - 1;
        int mid = 0;
        while (low < high) {
            mid = (low + high) / 2;
            if (a.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }

    
    public static int leftInsertion_Problem_0_70bff59c_e1ed_43c0_8810_e365a3d22775(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_ca61a315_0352_4102_a35a_632116943a3b(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        int m = 0;
        while (l <= r) {
            m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_4ce64969_c9b6_4477_9cbd_13714bd35f53(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_696be341_b04c_47a6_a429_151883d213cc(ArrayList<Integer> a, int x) {
        int i = 0;
        while(i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_23462824_a7ec_4a45_9aac_fa25aa2d7337(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) < x) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_1325f5ac_efa8_4fa6_8de1_36380ff96f7d(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_bd63f70c_0abf_4059_9113_776ffc5bc4e1(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0;
        int r = n - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) >= x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_f3701d2b_a965_4e0b_aff6_54880b4547e1(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_c9cd2f69_b969_4abc_b483_afcca1105dc8(ArrayList<Integer> a, int x) {
        int low = 0, high = a.size() - 1, mid;
        while ((low <= high) && (x == a.get(low))) {
            mid = (low + high) / 2;
            while (x <= a.get(mid)) {
                high = mid - 1;
            }
            while (x >= a.get(mid)) {
                low = mid + 1;
            }
            if (mid < high) {
                return mid;
            }
        }
        return -1;
    }

    
    public static int leftInsertion_Problem_0_8960c4c5_008d_46de_82ee_674c729a9abd(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_8f7b9e7a_cad5_4101_a633_7712dff3c114(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_c61b37cd_9e10_423d_881b_6a100bff3399(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_5edde7b0_e007_4123_984c_0c841346a8c8(ArrayList<Integer> a, int x) {
        int i = 0;
        for (; i < a.size(); i++) {
            if (a.get(i) < x) {
                break;
            }
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_a88aad3f_9d22_493e_9047_5a10558d0d08(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_d7fa4ee7_f424_4329_b39e_e2c165148d67(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_0dd8cd70_d61b_41de_baf1_ff6ddca4221b(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_0f8406a7_d192_4aba_ac08_366535be7615(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            }
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_527d7b71_d79b_4152_bd3f_52e6cab0f705(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) > x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_ee2e0703_9aa7_47ed_b878_675e766bac5a(ArrayList<Integer> a, int x) {
        int result = -1;
        for(int i = 0; i < a.size(); i++) {
            if(a.get(i) > x) {
                result = i;
                break;
            }
        }
        if(result != -1) {
            int index = a.size() - 1;
            while(index > 0 && a.get(index) == a.get(index - 1)) {
                index--;
            }
            a.set(index + 1, x);
        }
        return result;
    }

    
    public static int leftInsertion_Problem_2_456c3c1c_8508_4583_88e8_c8178ca8a300(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_9830c8e1_1f7b_4059_9934_336482e1cc7f(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_6c4a8209_59ec_4377_8ee7_0842e4a2e53f(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0, r = n - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) > x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_099747d7_4a29_4610_b3e2_202848e425b0(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get( m) == x) {
                return m;
            } else if (a.get( m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_4e0ea9dd_41c1_4648_bd16_eee4ceb7d2ac(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_f8363248_e285_446b_a105_1b9a5dfa082a(ArrayList<Integer> a, int x) {
        if (a.size() == 0) {
            return 0;
        }
        int l = 0;
        int r = a.size() - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        if (a.get(l) < x) {
            return l + 1;
        } else {
            return l;
        }
    }

    
    public static int leftInsertion_Problem_0_7393c1ae_2add_40b1_8da1_c18c1a82df2c(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_a4db0988_d54a_4a96_a55a_0beacfb61dd8(ArrayList<Integer> a, int x) {
        int i = 0;
        int j = a.size() - 1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (a.get(mid) < x) {
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_a74e8b96_a5a4_4b92_90e1_fc69d5c137e9(ArrayList<Integer> a, int x) {
        int i = 0;
        int j = a.size() - 1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) < x) {
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_00236230_3202_4298_9283_eb24fc7f20c8(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_e8d7b364_9a47_4764_b873_efbc5e9a58dc(ArrayList<Integer> a, int x) {
        int low = 0; int high = a.size()-1;
        while (low<=high) {
            int mid = (low+high)/2;
            if (a.get(mid)>=x) {
                high = mid -1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    
    public static int leftInsertion_Problem_1_ff16babc_5071_4526_82cc_9590a3d25c82(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_59c156f8_dd7b_4c40_9891_87f7ee924b9c(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_d4dd9121_574f_4a62_9aac_aa0622c5741f(ArrayList<Integer> a, int x) {
        int n = a.size();
        if (x <= a.get(0)) {
            return 0;
        }
        if (x > a.get(n - 1)) {
            return n;
        }
        int lo = 0;
        int hi = n - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) < x && a.get(mid + 1) > x) {
                return mid + 1;
            } else if (a.get(mid) < x) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return -1;
    }

    
    public static int leftInsertion_Problem_1_7dd493f9_8f15_4994_9671_5e4e3083e24d(ArrayList<Integer> a, int x) {
        int lo = 0;
        int hi = a.size() - 1;
        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if (a.get(mid) < x) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return lo;
    }

    
    public static int leftInsertion_Problem_1_6fa3108e_45a1_4964_9f98_87aeebe540b5(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_16cae836_596f_4dd0_b4db_9b400b839e65(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_4b588803_77df_4d5c_a86f_87fca0ed5c0e(ArrayList<Integer> a, int x) {
        int i = 0;
        while(i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_7e99fb53_19c9_4102_9030_30e07f375dd6(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0;
        int r = n - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_ca60d43b_10e0_4162_a708_1c066e6783c5(ArrayList<Integer> a, int x) {
        int i = 0;
        while(i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_099747d7_4a29_4610_b3e2_202848e425b0(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get( m) == x) {
                return m;
            } else if (a.get( m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_a971de80_bbac_4e81_8685_8d68a04c4bfd(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_b1c7d2b3_af4b_40aa_8f47_58eadcb1b9d0(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_8858567e_e640_4cbe_a3a0_c423ea7469b3(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_90d3a769_c85d_4549_987e_690cc8c0aaa7(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size();
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_a2549f68_3380_4a85_bcaf_58ee67b28976(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_e0b21528_dc4b_4b42_8e93_e5e50f4a6fd5(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_4e0ea9dd_41c1_4648_bd16_eee4ceb7d2ac(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_10121dec_98b8_477c_b3d1_f3bbc6f8751c(ArrayList<Integer> a, int x) {
        int lo = 0;
        int hi = a.size() - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) < x) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return lo;
    }

    
    public static int leftInsertion_Problem_1_15e5dfde_6140_4e2f_be61_88d4d0840b5b(ArrayList<Integer> a, int x) {
        int lo = 0;
        int hi = a.size() - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (x <= a.get(mid)) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return lo;
    }

    
    public static int leftInsertion_Problem_1_5cfa0bf6_b75c_4888_9217_471598ef73e1(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l < r) {
            int mid = (l + r) / 2;
            if (a.get(mid) < x) {
                l = mid + 1;
            } else {
                r = mid;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_2c1092ae_29d1_40c5_9db2_c0cc8602f7d3(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0;
        int r = n - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_41bdc8aa_6ff0_4138_b19b_0e5ea59ca404(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_c86c5db1_027f_42d7_83da_1653a041d202(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_c530c3e8_37a9_4c7e_ba6a_4c16415cfe81(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_fd5de8dc_73e1_4464_b3c3_9bcddd342928(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_68dec6d2_edce_4b0e_a40e_1511129d331e(ArrayList<Integer> a, int x) {
        int i = 0;
        int j = 1;
        for(; i < a.size(); i++) {
            if(a.get(i) > x) {
                if(a.get(j) > x) {
                    j++;
                } else {
                    return j;
                }
            } else {
                break;
            }
        }
        j++;
        for(; i < a.size(); i++) {
            if(a.get(i) <= x) {
                return i;
            }
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_bf486a86_69fa_4b23_835b_9f970b39cb94(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_ed3dbb8c_917e_4462_a27c_919f59f9a76a(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_e13c5b83_2890_4797_bf83_d05a873cf032(ArrayList<Integer> a, int x) {
        int low = 0;
        int high = a.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    
    public static int leftInsertion_Problem_1_5159133f_6717_4177_8ffe_abc94caab3e2(ArrayList<Integer> a, int x) {
        int lo = 0;
        int hi = a.size() - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (a.get(mid) < x) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return lo;
    }

    
    public static int leftInsertion_Problem_2_864bddac_15b0_47e2_a7ee_8b3a0a978671(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0;
        int r = n - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_d4dd9121_574f_4a62_9aac_aa0622c5741f(ArrayList<Integer> a, int x) {
        int n = a.size();
        if (x <= a.get(0)) {
            return 0;
        }
        if (x > a.get(n - 1)) {
            return n;
        }
        int lo = 0;
        int hi = n - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) < x && a.get(mid + 1) > x) {
                return mid + 1;
            } else if (a.get(mid) < x) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return -1;
    }

    
    public static int leftInsertion_Problem_2_24690c19_9576_4fd0_b131_be23d658e185(ArrayList<Integer> a, int x) {
        int i = 0;
        while(i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_c530c3e8_37a9_4c7e_ba6a_4c16415cfe81(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_022459b5_c70a_4cdc_93a4_1d73287d1114(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) < x)
                l = m + 1;
            else
                r = m;
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_c0bb1ad5_686b_4593_9ac3_eab62c22cb5d(ArrayList<Integer> a, int x) {
        if (a.size() == 0) return 0;
        int lo = 0;
        int hi = a.size() - 1;
        while (lo < hi) {
            int mid = (lo + hi) / 2;
            if (a.get(mid) < x) {
                lo = mid + 1;
            } else {
                hi = mid;
            }
        }
        return lo;
    }

    
    public static int leftInsertion_Problem_2_eabab773_c981_43c2_800e_8df50a53bc5c(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_91080372_7d83_4645_a604_8677f5ffd453(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_ce868931_5b04_4371_a974_8ab76d99ff83(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) < x) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_7ac81f7c_3487_47e5_9cb9_a490b0d5b303(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_63e85437_debf_4868_be18_57cdbe6614d3(ArrayList<Integer> a, int x) {
        int left = 0;
        int right = a.size() - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) > x) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    
    public static int leftInsertion_Problem_2_b00c20e5_60d5_4a5a_a5ee_10ec4db618ed(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0, r = n - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_ae4ca3f0_4900_4695_a06e_6094193dd386(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_e173cd17_9ffb_42a6_a121_a432c59e4d7b(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_a01a6672_faf8_4571_8ebe_12a24b13f56b(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_8859698a_5414_4583_85d9_3d80ff20b74e(ArrayList<Integer> a, int x) {
        int lo = 0;
        int hi = a.size() - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) > x) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return lo;
    }

    
    public static int leftInsertion_Problem_2_e3ee864b_9e58_45a9_9e94_f54eb7382151(ArrayList<Integer> a, int x) {
        // Your code goes here
        int left_insertion_point = 0;
        int i = 0;
        while (i < a.size() - 1 && x > a.get(i)) {
            left_insertion_point++;
            i++;
        }
        i++;
        while (i < a.size() && x > a.get(i)) {
            left_insertion_point++;
            i++;
        }
        return left_insertion_point;
    }

    
    public static int leftInsertion_Problem_2_890a9f5a_1201_4790_bdd8_345fb615fe44(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_ca87eab6_1fde_4dd1_a84f_4e8daf69f319(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_1829883e_0b9c_40dc_bb6b_8d6eedec0fb0(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size()-1;
        while (l <= r) {
            int m = l + (r-l)/2;
            if (a.get(m) == x) {
                return m;
            }
            if (a.get(m) > x) {
                r = m-1;
            } else {
                l = m+1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_0b729237_b7b3_49d8_a678_9e4bf7031aa9(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_722e0c23_d4cd_4e86_ab50_479d23d1a599(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_87d8024b_1767_45af_b49b_55a5e64cc700(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_d8b83826_285c_4575_8232_fd268d53ba42(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_896b8fc2_14db_4037_baf8_b6900676da95(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_d6f097b6_040d_4956_961a_a9d571ad51d3(ArrayList<Integer> a, int x) {
        return -1; // TODO: implement this function
    }

    
    public static int leftInsertion_Problem_2_7d8762d1_82dc_423f_9a2e_3624eadb26e4(ArrayList<Integer> a, int x) {
        int low = 0;
        int high = a.size()-1;
        while (low <= high) {
            int mid = (low + high)/2;
            if (x < a.get(mid))
                high = mid - 1;
            else if (x > a.get(mid))
                low = mid + 1;
            else {
                System.out.println("Left Insertion Point: " + mid);
                return mid;
            }
        }
        System.out.println("Left Insertion Point: -1");
        return -1;
    }

    
    public static int leftInsertion_Problem_1_6c457338_8d04_4bf4_9be1_f3c27c5543eb(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_0d30acbe_3d2e_4bac_a332_26f2b7f83435(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0;
        int r = n - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_9ed02925_6b02_4496_8521_7d80ccd16029(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get( m) == x) {
                return m;
            } else if (a.get( m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_bb5ab7b8_3a20_458e_98df_0e9ae6987419(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_0_7766f85f_e95e_4c99_ae76_5302d3aaa176(ArrayList<Integer> a, int x) {
        int low = 0;
        int high = a.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (a.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }

    
    public static int leftInsertion_Problem_2_212b36f3_e52f_4b94_8dae_894e00cf1c0e(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_82af4c3c_f1c4_442b_8ad4_d3df937754fd(ArrayList<Integer> a, int x) {
        // binary search
        int l = 0, r = a.size() - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) >= x) {
                r = m;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_8be99c2f_fc92_4e19_be8a_411ea5f263cb(ArrayList<Integer> a, int x) {
        int i = 0;
        int j = a.size() - 1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (a.get(mid) < x) {
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_e944a07b_240c_4370_a384_828ecf0d0f61(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0, r = n - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) < x) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_a9c3da70_9cd3_4810_a102_bcf93a328795(ArrayList<Integer> a, int x) {
        int low = 0, high = a.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (a.get(mid) == x) {
                return mid;
            } else if (a.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }

    
    public static int leftInsertion_Problem_0_ee9e87f0_5569_4b3d_b804_dddac9656953(ArrayList<Integer> a, int x) {
        int i = 0;
        while(i < a.size() && x <= a.get(i)) {
            i++;
        }
        if (i == a.size())
            return a.size() - 1;
        return i;
    }

    
    public static int leftInsertion_Problem_2_c2e5e6e7_6678_4a95_a7ee_acb30b05d028(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_8c4a6055_5c00_4bc0_b9f0_fb16e334589b(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_2_f9bb478f_cf00_47d9_b025_a49d40576e43(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_6b47c77a_16d4_4dc8_b611_e6cb7f8ef44e(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_65c264d5_fcbd_496b_ab26_463b362b7139(ArrayList<Integer> a, int x) {
        int n = a.size();
        int l = 0;
        int r = n - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_37d70147_45a2_4b0d_8737_b9ace4da2385(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_e173cd17_9ffb_42a6_a121_a432c59e4d7b(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_7766f85f_e95e_4c99_ae76_5302d3aaa176(ArrayList<Integer> a, int x) {
        int low = 0;
        int high = a.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (a.get(mid) < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }

    
    public static int leftInsertion_Problem_1_3d308fbc_1b89_4caf_a0a8_25e20558e9e5(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_1ef3da60_e6ca_40d7_877f_342d9bb349ac(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_2_d964f095_be65_451d_b711_db6a45263d72(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int leftInsertion_Problem_1_258af634_9b99_41a8_a732_c6779017bf94(ArrayList<Integer> a, int x) {
        int l = 0, r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_1_b78a73f0_494a_402a_873d_d1a471528ad3(ArrayList<Integer> a, int x) {
        int left = 0;
        int right = a.get(0); // get first element of array
        while (right < a.size() - 1) { // while right is less than the size of the array
            if (x <= right) { // if x is less than the right element
                left++;
                right++;
            } else { // if x is greater than the right element
                right++;
            }
        }
        return left;
    }

    
    public static int leftInsertion_Problem_1_5159133f_6717_4177_8ffe_abc94caab3e2(ArrayList<Integer> a, int x) {
        int lo = 0;
        int hi = a.size() - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (a.get(mid) < x) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return lo;
    }

    
    public static int leftInsertion_Problem_2_9772e0d7_9cce_40ec_a899_6e023290141d(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (a.get(m) == x) {
                return m;
            } else if (a.get(m) > x) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l;
    }

    
    public static int leftInsertion_Problem_0_4e2a8611_1811_4c52_af61_4c7bb9a6c6c3(ArrayList<Integer> a, int x) {
        int l = 0;
        int r = a.size() - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (a.get(m) < x) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return l;
    }

}
