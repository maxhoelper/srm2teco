package mbpp_786_right_insertion;

public class mbpp_786_right_insertion {

    
    public static int rightInsertion_Problem_2_d31344d7_3e04_4c6f_97cc_eb3f56c27084(ArrayList<Integer> a, int x) {
        return -1;
    }

    
    public static int rightInsertion_Problem_1_b2102f2f_5d7e_400b_8725_870f0c037997(ArrayList<Integer> a, int x) {
        int pos = 0;
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) <= x) {
                pos = i;
                break;
            }
        }
        return pos;
    }

    
    public static int rightInsertion_Problem_0_e25e8f3d_f296_4f01_ba41_0aee50cc98f4(ArrayList<Integer> a, int x) {
        int i = Collections.binarySearch(a, x);
        if (i <= 0) return 0;
        return i - 1;
    }

    
    public static int rightInsertion_Problem_0_ee933723_ca38_42bb_b9b9_ec6830576804(ArrayList<Integer> a, int x) {
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

    
    public static int rightInsertion_Problem_1_de7a74c5_ae31_40cf_a5fe_a0a811dd9733(ArrayList<Integer> a, int x) {
        int lo = 0, hi = a.size() - 1;
        while (lo < hi && a.get(lo) <= x) {
            lo++;
        }
        while (lo < hi && a.get(hi) > x) {
            hi--;
        }
        if (lo == hi) {
            return lo;
        }
        return a.size();
    }

    
    public static int rightInsertion_Problem_1_c30a3062_8efe_48eb_b76d_6a35a687349e(ArrayList<Integer> a, int x) {
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

    
    public static int rightInsertion_Problem_2_05dba66b_995a_4cfc_abec_44e6aad042e8(ArrayList<Integer> a, int x) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int index = -1;
        for (int i = 0; i < a.size(); i++) {
            int val =  (a.get(i));
            if (val < min) {
                min = val;
            }
            if (val > max) {
                max = val;
            }
            if (val == x) {
                index = i;
            }
        }
        if (index == -1) {
            return -1;
        }
        return (index + 1);
    }

    
    public static int rightInsertion_Problem_1_f5215c3e_15c3_47ab_875c_027898a0ba21(ArrayList<Integer> a, int x) {
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

    
    public static int rightInsertion_Problem_0_b2b7d3e7_978d_4971_9631_c65894ea39ee(ArrayList<Integer> a, int x) {
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

    
    public static int rightInsertion_Problem_1_109483c7_1e70_465e_b649_5c3b76b2e1db(ArrayList<Integer> a, int x) {
        ArrayList<Integer> a2 = new ArrayList<>(a);
        ArrayList<Integer> a3 = new ArrayList<>(a2);
        int insertionPoint = 0;
        for(int i=0; i < a3.size() - 1; i++) {
            if(a3.get(i) < x && a3.get(i+1) > x) {
                insertionPoint = i;
                break;
            }
        }
        a3.remove(insertionPoint);
        a3.add(0, x);
        a3.add(insertionPoint+1, x);
        return a3.stream().mapToInteger(Integer::intValue).sum();
    }

    
    public static int rightInsertion_Problem_0_22e4842b_1948_4005_a019_74b5fcab8757(ArrayList<Integer> a, int x) {
        int lastPosition = a.size();
        int firstPosition = lastPosition - 1;
        while (firstPosition >= 0 && x < a.get(firstPosition)) {
            firstPosition--;
        }
        Integer answer = (firstPosition >= 0) ? a.get(firstPosition + 1) : a.get(lastPosition);
        return (firstPosition >= 0) ? (firstPosition + 1) : lastPosition;
    }

    
    public static int rightInsertion_Problem_1_e25e8f3d_f296_4f01_ba41_0aee50cc98f4(ArrayList<Integer> a, int x) {
        int i = Collections.binarySearch(a, x);
        if (i <= 0) return 0;
        return i - 1;
    }

    
    public static int rightInsertion_Problem_0_3d0b43db_5ebc_414d_a5b0_9bc5c0c0860d(ArrayList<Integer> a, int x) {
        int i = 0;
        while(i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int rightInsertion_Problem_2_b2102f2f_5d7e_400b_8725_870f0c037997(ArrayList<Integer> a, int x) {
        int pos = 0;
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) <= x) {
                pos = i;
                break;
            }
        }
        return pos;
    }

    
    public static int rightInsertion_Problem_0_de7a74c5_ae31_40cf_a5fe_a0a811dd9733(ArrayList<Integer> a, int x) {
        int lo = 0, hi = a.size() - 1;
        while (lo < hi && a.get(lo) <= x) {
            lo++;
        }
        while (lo < hi && a.get(hi) > x) {
            hi--;
        }
        if (lo == hi) {
            return lo;
        }
        return a.size();
    }

    
    public static int rightInsertion_Problem_2_d31344d7_3e04_4c6f_97cc_eb3f56c27084(ArrayList<Integer> a, int x) {
        return -1;
    }

    
    public static int rightInsertion_Problem_0_ced5cda9_6307_479d_bd79_63b681f5f039(ArrayList<Integer> a, int x) {
        int low = 0;
        int high = a.size() - 1;
        while (low <= high) {
            int mid = (low + high) >>> 1;
            if (a.get(mid) > x) {
                low = mid + 1;
            } else if (a.get(mid) < x) {
                high = mid - 1;
            } else {
                low = mid + 1;
                high = mid - 1;
            }
        }
        return low;
    }

    
    public static int rightInsertion_Problem_0_6f443a1e_1a41_4c03_88f0_71034a1936d2(ArrayList<Integer> a, int x) {
        if (a.size()==0)
            return -1;
        int n = a.size();
        for (int i=0; i<n; i++) {
            int y = a.get(i);
            if (x < y) {
                int r = rightInsertion_Problem_0_6f443a1e_1a41_4c03_88f0_71034a1936d2(a, x);
                if (r==-1)
                    return i;
                else
                    return r-1;
            }
            if (x==y) {
                return i;
            }
        }
        return -1;
    }

    
    public static int rightInsertion_Problem_0_22b45005_82a7_4f4b_9b3d_d8491d254328(ArrayList<Integer> a, int x) {
        int j;
        for (j = 1; j <= a.size() - 1; j++) {
            if (a.get(j) > x) {
                break;
            }
        }
        return j;
    }

    
    public static int rightInsertion_Problem_1_f62806c9_1d17_4bc3_a2d2_1a7e7c6bc0c0(ArrayList<Integer> a, int x) {
        return Collections.binarySearch(a, x);
    }

    
    public static int rightInsertion_Problem_1_3676a652_60af_4431_8dcf_a2dcb64dac16(ArrayList<Integer> a, int x) {
        int count = 0;
        for(int i=0; i<a.size(); i++) {
            if(a.get(i) > x) count++;
        }
        return a.size() + count; // return last index + number of items greater than x
    }

    
    public static int rightInsertion_Problem_1_8bd6e1d8_6d34_4eb1_9f74_2ebb5b473ef0(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int rightInsertion_Problem_0_2c1ce94c_97e8_4a73_ac1b_10d282f00646(ArrayList<Integer> a, int x) {
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

    
    public static int rightInsertion_Problem_1_985e47a7_448b_4e5d_a483_e9e9f8c7022b(ArrayList<Integer> a, int x) {
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

    
    public static int rightInsertion_Problem_1_22b45005_82a7_4f4b_9b3d_d8491d254328(ArrayList<Integer> a, int x) {
        int j;
        for (j = 1; j <= a.size() - 1; j++) {
            if (a.get(j) > x) {
                break;
            }
        }
        return j;
    }

    
    public static int rightInsertion_Problem_0_f5215c3e_15c3_47ab_875c_027898a0ba21(ArrayList<Integer> a, int x) {
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

    
    public static int rightInsertion_Problem_1_4232967e_a8af_4edb_9e78_6370f82f25ae(ArrayList<Integer> a, int x) {
        int i = 0;
        while(i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int rightInsertion_Problem_1_d30735e0_bdfc_435e_9fdb_f532e94d59bb(ArrayList<Integer> a, int x) {
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

    
    public static int rightInsertion_Problem_1_27cbc4f7_de8b_4d4b_be49_bf3f892bc287(ArrayList<Integer> a, int x) {
        // TODO: Write your code here
        return -1;
    }

    
    public static int rightInsertion_Problem_2_ce4772ec_04a3_4f42_998f_6551d796cd3b(ArrayList<Integer> a, int x) {
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

    
    public static int rightInsertion_Problem_0_f62806c9_1d17_4bc3_a2d2_1a7e7c6bc0c0(ArrayList<Integer> a, int x) {
        return Collections.binarySearch(a, x);
    }

    
    public static int rightInsertion_Problem_0_9cbc1873_88d1_4ab1_be13_fd7e5a41e4ec(ArrayList<Integer> a, int x) {
        // initialize insertion point
        int i = 0; // index of first element less than x
        int last = i; // index of last element greater than x

        // loop until x is found
        while (a.size() > 1 && a.get(i) < x) {
            i++;
        }

        // if x was found, return its index
        if (i != 0) {
            int right = a.get(i - 1);
            if (right > x) {
                return i - 1;
            } else {
                return i;
            }
        }

        // x not found, return last index
        return last;
    }

    
    public static int rightInsertion_Problem_1_25833fc9_1259_45d2_9d0e_79860da15f97(ArrayList<Integer> a, int x) {
        int i = 0;
        while(i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int rightInsertion_Problem_0_139828a8_9c70_4983_b3fb_f056b23493d6(ArrayList<Integer> a, int x) {
        int i = 0;
        while(i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int rightInsertion_Problem_1_5228143d_4251_4945_ac70_fe7605c620bb(ArrayList<Integer> a, int x) {
        int i = a.size() - 1;
        for(; i >= 0 && a.get(i) < x; i--);
        return i;
    }

    
    public static int rightInsertion_Problem_2_8bd6e1d8_6d34_4eb1_9f74_2ebb5b473ef0(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int rightInsertion_Problem_2_dbe42a85_4a93_4542_8a71_03ef1729e7bd(ArrayList<Integer> a, int x) {
        int lo = 0;
        int hi = a.size() - 1;
        while (lo < hi) {
            int mid = (lo + hi) >>> 1;
            int midVal = a.get(mid);
            if (midVal < x) lo = mid;
            else if (midVal > x) hi = mid;
            else return mid;
        }
        return lo;
    }

    
    public static int rightInsertion_Problem_1_4d3b1af3_5b91_45c9_8a74_19a269c549cf(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int rightInsertion_Problem_0_4232967e_a8af_4edb_9e78_6370f82f25ae(ArrayList<Integer> a, int x) {
        int i = 0;
        while(i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int rightInsertion_Problem_1_48c3be70_f516_4319_bb03_8f891871f94a(ArrayList<Integer> a, int x) {
        int lo = 0;
        int hi = a.size();
        while (hi > lo) {
            int mid = lo + (hi - lo) / 2;
            if (a.get(mid) <= x) lo = mid;
            else hi = mid;
        }
        return lo;
    }

    
    public static int rightInsertion_Problem_2_b17483fb_9fef_49eb_8f41_a84284af1144(ArrayList<Integer> a, int x) {
        // Write your code here.
        
        for(int i = a.size(); i > 0; i--){
            if(a.get(i) < x){
                a.add(i-1, x);
                
            }
            if(a.get(i) == x){
                return i;
            }
            if(a.get(i) > x){
                a.add(i-1, x);
                
            }
            if(a.get(i) == x && i > 0){
                return i;
            }
        }
        
        
        return -1;
    }

    
    public static int rightInsertion_Problem_2_b2102f2f_5d7e_400b_8725_870f0c037997(ArrayList<Integer> a, int x) {
        int pos = 0;
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) <= x) {
                pos = i;
                break;
            }
        }
        return pos;
    }

    
    public static int rightInsertion_Problem_0_00db145c_f2c1_47f1_960b_ba97e0560086(ArrayList<Integer> a, int x) {
        // Write your code here
        return 0;
    }

    
    public static int rightInsertion_Problem_1_3d0b43db_5ebc_414d_a5b0_9bc5c0c0860d(ArrayList<Integer> a, int x) {
        int i = 0;
        while(i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int rightInsertion_Problem_1_e66b0ba0_5cdb_4d1e_845b_dba652ec41a2(ArrayList<Integer> a, int x) {
        if (x >= a.get(0)) {
            return 0;
        }
        if (a.get(0) == x || x > a.get(a.size() - 1)) {
            return a.size() - 1;
        }
        int lo = 0, hi = a.size() - 1;
        while(lo <= hi) {
            int mid = (lo + hi) / 2;
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

    
    public static int rightInsertion_Problem_1_4d3b1af3_5b91_45c9_8a74_19a269c549cf(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int rightInsertion_Problem_2_d30735e0_bdfc_435e_9fdb_f532e94d59bb(ArrayList<Integer> a, int x) {
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

    
    public static int rightInsertion_Problem_1_fa0b0d2f_afcc_4083_b15f_2312ef2e2d65(ArrayList<Integer> a, int x) {
        int low=0;
        int high = a.size()-1;
        int mid;
        while(low<=high){
            mid = (low+high)/2;
            if(a.get(mid)<x)
                low = mid +1;
            else if(a.get(mid)==x)
                return mid;
            else
                high = mid -1;
        }
        return low;
    }

    
    public static int rightInsertion_Problem_1_ce4772ec_04a3_4f42_998f_6551d796cd3b(ArrayList<Integer> a, int x) {
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

    
    public static int rightInsertion_Problem_0_f757e088_b942_4256_bef6_73b4c9ec165e(ArrayList<Integer> a, int x) {
        int lo = 0;
        int hi = a.size() - 1;

        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if (a.get(mid) == x)
                return mid;
            if (x < a.get(mid))
                lo = mid + 1;
            else
                hi = mid - 1;
        }

        return lo;
    }

    
    public static int rightInsertion_Problem_2_79fbdbfa_cdf6_467d_82f8_f4058169d59a(ArrayList<Integer> a, int x) {
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

    
    public static int rightInsertion_Problem_2_de7a74c5_ae31_40cf_a5fe_a0a811dd9733(ArrayList<Integer> a, int x) {
        int lo = 0, hi = a.size() - 1;
        while (lo < hi && a.get(lo) <= x) {
            lo++;
        }
        while (lo < hi && a.get(hi) > x) {
            hi--;
        }
        if (lo == hi) {
            return lo;
        }
        return a.size();
    }

    
    public static int rightInsertion_Problem_0_b2102f2f_5d7e_400b_8725_870f0c037997(ArrayList<Integer> a, int x) {
        int pos = 0;
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) <= x) {
                pos = i;
                break;
            }
        }
        return pos;
    }

    
    public static int rightInsertion_Problem_2_f757e088_b942_4256_bef6_73b4c9ec165e(ArrayList<Integer> a, int x) {
        int lo = 0;
        int hi = a.size() - 1;

        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if (a.get(mid) == x)
                return mid;
            if (x < a.get(mid))
                lo = mid + 1;
            else
                hi = mid - 1;
        }

        return lo;
    }

    
    public static int rightInsertion_Problem_1_25833fc9_1259_45d2_9d0e_79860da15f97(ArrayList<Integer> a, int x) {
        int i = 0;
        while(i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int rightInsertion_Problem_2_3077017c_dc92_45e5_b1ef_9af98c7f041c(ArrayList<Integer> a, int x) {
        int lo = 0, hi = a.size()-1;
        while(lo <= hi) {
            int mid = (lo + hi) >>> 1;
            if(a.get (mid) < x) return mid;
            else if(x < a.get (mid)) hi = mid-1;
            else lo = mid + 1;
        }
        return hi + 1;
    }

    
    public static int rightInsertion_Problem_1_48e33c26_a463_46d4_a9ea_b9e904a07fe6(ArrayList<Integer> a, int x) {
        int i = 0;
        while(i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int rightInsertion_Problem_2_e7222d0f_33a9_4785_983f_ab6376b4cdad(ArrayList<Integer> a, int x) {
        int position = 0;
        for (int i = 0; i < a.size() - 1; i++) {
            if (a.get(i) > x) {
                position++;
            }
        }
        return position;
    }

    
    public static int rightInsertion_Problem_1_1e027f74_2f19_4b5b_9df5_5c05ad44a66f(ArrayList<Integer> a, int x) {
        int rightMost = a.get(0); // Index of right element
        for (int i=1; i<a.size(); i++) {
            if (a.get(i) >= x) rightMost = i;
        }
        return rightMost;
    }

    
    public static int rightInsertion_Problem_1_424a4d74_bb06_41a3_9ef2_43c4c14345d6(ArrayList<Integer> a, int x) {
        int low = 0;
        int high = a.size();
        while (low < high) {
            int mid = (low + high) / 2;
            if (x == a.get(mid)) {
                return mid;
            } else if (x < a.get(mid)) {
                low = mid+1;
            } else {
                high = mid-1;
            }
        }
        return -1;
    }

    
    public static int rightInsertion_Problem_1_ced5cda9_6307_479d_bd79_63b681f5f039(ArrayList<Integer> a, int x) {
        int low = 0;
        int high = a.size() - 1;
        while (low <= high) {
            int mid = (low + high) >>> 1;
            if (a.get(mid) > x) {
                low = mid + 1;
            } else if (a.get(mid) < x) {
                high = mid - 1;
            } else {
                low = mid + 1;
                high = mid - 1;
            }
        }
        return low;
    }

    
    public static int rightInsertion_Problem_2_d31344d7_3e04_4c6f_97cc_eb3f56c27084(ArrayList<Integer> a, int x) {
        return -1;
    }

    
    public static int rightInsertion_Problem_1_d30623f4_d4f6_43b7_bc37_7ab29906f5c1(ArrayList<Integer> a, int x) {
        // TODO: Implement me!
        ArrayList<Integer> temp = new ArrayList<Integer>(a);
        int index = Collections.binarySearch(temp, x) - 1;
        return index;
    }

    
    public static int rightInsertion_Problem_1_b1eb669e_6452_48e4_8e14_93893b7f8e79(ArrayList<Integer> a, int x) {
        for(int i=0; i < a.size(); i++) {
            if(a.get(i) >= x)
                return i;
        }
        return a.size()+1;
    }

    
    public static int rightInsertion_Problem_0_b17483fb_9fef_49eb_8f41_a84284af1144(ArrayList<Integer> a, int x) {
        // Write your code here.
        
        for(int i = a.size(); i > 0; i--){
            if(a.get(i) < x){
                a.add(i-1, x);
                
            }
            if(a.get(i) == x){
                return i;
            }
            if(a.get(i) > x){
                a.add(i-1, x);
                
            }
            if(a.get(i) == x && i > 0){
                return i;
            }
        }
        
        
        return -1;
    }

    
    public static int rightInsertion_Problem_1_5f6130f8_eb53_454f_8da8_2f6aa366ed00(ArrayList<Integer> a, int x) {
        // base case
        if (a.contains(x)) {
            return a.indexOf(x);
        }
        if (a.isEmpty()) {
            return -1;
        }
        // recursion
        int rightPoint = a.size() - 1;
        int lowPoint = rightPoint - 1;
        while (!a.contains(lowPoint)) {
            lowPoint--;
        }
        while (!a.contains(rightPoint)) {
            rightPoint++;
        }
        return a.indexOf(lowPoint) + 1;
    }

    
    public static int rightInsertion_Problem_0_e25e8f3d_f296_4f01_ba41_0aee50cc98f4(ArrayList<Integer> a, int x) {
        int i = Collections.binarySearch(a, x);
        if (i <= 0) return 0;
        return i - 1;
    }

    
    public static int rightInsertion_Problem_1_d31344d7_3e04_4c6f_97cc_eb3f56c27084(ArrayList<Integer> a, int x) {
        return -1;
    }

    
    public static int rightInsertion_Problem_2_01596225_23b9_48ed_abaf_91ecb929249a(ArrayList<Integer> a, int x) {
        for(int i = 0; i < a.size(); i++) {
            if(a.get(i) >= x) {
                return i;
            }
        }
        return -1;
    }

    
    public static int rightInsertion_Problem_0_fd89cf90_b258_4914_b7d5_a2ff33494795(ArrayList<Integer> a, int x) {
        // Write your logic here
        return 0;
    }

    
    public static int rightInsertion_Problem_0_8bd6e1d8_6d34_4eb1_9f74_2ebb5b473ef0(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int rightInsertion_Problem_0_25833fc9_1259_45d2_9d0e_79860da15f97(ArrayList<Integer> a, int x) {
        int i = 0;
        while(i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int rightInsertion_Problem_1_8bd6e1d8_6d34_4eb1_9f74_2ebb5b473ef0(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int rightInsertion_Problem_1_25833fc9_1259_45d2_9d0e_79860da15f97(ArrayList<Integer> a, int x) {
        int i = 0;
        while(i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int rightInsertion_Problem_1_2c1ce94c_97e8_4a73_ac1b_10d282f00646(ArrayList<Integer> a, int x) {
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

    
    public static int rightInsertion_Problem_1_3077017c_dc92_45e5_b1ef_9af98c7f041c(ArrayList<Integer> a, int x) {
        int lo = 0, hi = a.size()-1;
        while(lo <= hi) {
            int mid = (lo + hi) >>> 1;
            if(a.get (mid) < x) return mid;
            else if(x < a.get (mid)) hi = mid-1;
            else lo = mid + 1;
        }
        return hi + 1;
    }

    
    public static int rightInsertion_Problem_2_b368c88e_a3c6_4e6c_b249_633deb339d60(ArrayList<Integer> a, int x) {
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

    
    public static int rightInsertion_Problem_1_83d78ba7_1c77_4ac4_b541_c6cdd6af55cd(ArrayList<Integer> a, int x) {
        if (x <= a.get(0))
            return 0;
        if (x >= a.get(a.size() - 1))
            return a.size();
        int left = 0, right = a.size() - 1, m = 0;
        while (left < right) {
            m = (left + right) >>> 1;
            if (x == a.get(m))
                return m;
            if (x < a.get(m))
                right = m;
            else
                left = m;
        }
        throw new RuntimeException("No insertion point found!");
    }

    
    public static int rightInsertion_Problem_2_fd89cf90_b258_4914_b7d5_a2ff33494795(ArrayList<Integer> a, int x) {
        // Write your logic here
        return 0;
    }

    
    public static int rightInsertion_Problem_0_78011b89_880a_4779_ac72_cd0ac5a9f5dc(ArrayList<Integer> a, int x) {
        int low = a.get(0);
        int high = a.get(0);
        int mid = 0;
        for (int i: a) {
            if (i == x) {
                return mid;
            }
            if (i < x) {
                low = i;
            } else {
                high = i;
            }
            mid = (low + high) / 2;
        }
        return mid;
    }

    
    public static int rightInsertion_Problem_2_de7a74c5_ae31_40cf_a5fe_a0a811dd9733(ArrayList<Integer> a, int x) {
        int lo = 0, hi = a.size() - 1;
        while (lo < hi && a.get(lo) <= x) {
            lo++;
        }
        while (lo < hi && a.get(hi) > x) {
            hi--;
        }
        if (lo == hi) {
            return lo;
        }
        return a.size();
    }

    
    public static int rightInsertion_Problem_0_424a4d74_bb06_41a3_9ef2_43c4c14345d6(ArrayList<Integer> a, int x) {
        int low = 0;
        int high = a.size();
        while (low < high) {
            int mid = (low + high) / 2;
            if (x == a.get(mid)) {
                return mid;
            } else if (x < a.get(mid)) {
                low = mid+1;
            } else {
                high = mid-1;
            }
        }
        return -1;
    }

    
    public static int rightInsertion_Problem_0_79fbdbfa_cdf6_467d_82f8_f4058169d59a(ArrayList<Integer> a, int x) {
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

    
    public static int rightInsertion_Problem_0_1e027f74_2f19_4b5b_9df5_5c05ad44a66f(ArrayList<Integer> a, int x) {
        int rightMost = a.get(0); // Index of right element
        for (int i=1; i<a.size(); i++) {
            if (a.get(i) >= x) rightMost = i;
        }
        return rightMost;
    }

    
    public static int rightInsertion_Problem_0_680b4d5e_dab3_483f_ad44_aba90a090af5(ArrayList<Integer> a, int x) {
        return Collections.binarySearch(a, x);
    }

    
    public static int rightInsertion_Problem_0_5f6130f8_eb53_454f_8da8_2f6aa366ed00(ArrayList<Integer> a, int x) {
        // base case
        if (a.contains(x)) {
            return a.indexOf(x);
        }
        if (a.isEmpty()) {
            return -1;
        }
        // recursion
        int rightPoint = a.size() - 1;
        int lowPoint = rightPoint - 1;
        while (!a.contains(lowPoint)) {
            lowPoint--;
        }
        while (!a.contains(rightPoint)) {
            rightPoint++;
        }
        return a.indexOf(lowPoint) + 1;
    }

    
    public static int rightInsertion_Problem_2_ae723e7a_a936_47be_a75b_dbed4e838f80(ArrayList<Integer> a, int x) {
        int pos = 0;
        int last = a.get(0);
        for (int i = 1; i < a.size(); i++) {
            int cur = a.get(i);
            if (cur < last)
                pos = i + 1;
            last = cur;
        }
        return pos;
    }

    
    public static int rightInsertion_Problem_0_4380be5e_b7b8_4ddf_b821_37e777287aa8(ArrayList<Integer> a, int x) {
        if(x < a.get(0))
            return 0;
        if(x == a.get(0))
            return a.size();
        for(int i = 1; i < a.size(); i++) {
            if(x == a.get(i))
                return i;
            if(x < a.get(i))
                return i;
        }
        return a.size();
    }

    
    public static int rightInsertion_Problem_1_5f6130f8_eb53_454f_8da8_2f6aa366ed00(ArrayList<Integer> a, int x) {
        // base case
        if (a.contains(x)) {
            return a.indexOf(x);
        }
        if (a.isEmpty()) {
            return -1;
        }
        // recursion
        int rightPoint = a.size() - 1;
        int lowPoint = rightPoint - 1;
        while (!a.contains(lowPoint)) {
            lowPoint--;
        }
        while (!a.contains(rightPoint)) {
            rightPoint++;
        }
        return a.indexOf(lowPoint) + 1;
    }

    
    public static int rightInsertion_Problem_2_f8a89db6_bd78_444f_be99_44fb40d5a423(ArrayList<Integer> a, int x) {
        // Your code goes here!
        
        
        return -1;
    }

    
    public static int rightInsertion_Problem_0_3d0b43db_5ebc_414d_a5b0_9bc5c0c0860d(ArrayList<Integer> a, int x) {
        int i = 0;
        while(i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int rightInsertion_Problem_1_1e2d57b9_1515_4b9e_a811_3b9f2cef0048(ArrayList<Integer> a, int x) {
        int rightIndex = 0; // index to left end of subarray
        for (int i = 0; i < a.size(); i++) { // find the right index of subarray
            if (a.get(i) >= x) { // if a number larger than x
                rightIndex = i;
                break;
            }
        }
        int leftIndex = rightIndex; // index of left end of subarray
        for (int j = rightIndex + 1; j < a.size(); j++) { // find the left index of subarray
            if (a.get(j) < x) { // if a number smaller than x
                leftIndex = j;
                break;
            }
        }
        return (rightIndex - leftIndex); // return the right index of subarray
    }

    
    public static int rightInsertion_Problem_2_b17483fb_9fef_49eb_8f41_a84284af1144(ArrayList<Integer> a, int x) {
        // Write your code here.
        
        for(int i = a.size(); i > 0; i--){
            if(a.get(i) < x){
                a.add(i-1, x);
                
            }
            if(a.get(i) == x){
                return i;
            }
            if(a.get(i) > x){
                a.add(i-1, x);
                
            }
            if(a.get(i) == x && i > 0){
                return i;
            }
        }
        
        
        return -1;
    }

    
    public static int rightInsertion_Problem_2_00db145c_f2c1_47f1_960b_ba97e0560086(ArrayList<Integer> a, int x) {
        // Write your code here
        return 0;
    }

    
    public static int rightInsertion_Problem_1_ff019265_a6f6_415e_adcd_9b11a7232007(ArrayList<Integer> a, int x) {
        // Write your code here
        if (x <= a.get(0)){
            return 0;
        }
        int l = 0;
        int r = a.size() - 1;
        while(r >= l){
            int mid = l + (r - l)/2;
            if (mid > x){
                r = mid - 1;
            }
            else{
                l = mid;
            }
        }
        return l;
    }

    
    public static int rightInsertion_Problem_0_d7bc5d66_2863_4e0b_b1f4_5427625d61c0(ArrayList<Integer> a, int x) {
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

    
    public static int rightInsertion_Problem_1_f895268a_297a_4413_aec1_b7638acdba6b(ArrayList<Integer> a, int x) {
        int last = 0;
        int pos = 0;
        for(pos = 0; pos < a.size(); pos++) {
            if(a.get(pos) > x) {
                break;
            }
            last = pos;
        }
        if(pos == a.size()) {
            pos = 0;
        }
        if(a.get(pos) == x) {
            return pos;
        }
        int nextpos = pos + 1;
        while(nextpos < a.size()) {
            if(a.get(nextpos) < x) {
                break;
            }
            nextpos++;
        }
        if(nextpos == a.size()) {
            nextpos = 0;
        }
        return last;
    }

    
    public static int rightInsertion_Problem_0_5f6130f8_eb53_454f_8da8_2f6aa366ed00(ArrayList<Integer> a, int x) {
        // base case
        if (a.contains(x)) {
            return a.indexOf(x);
        }
        if (a.isEmpty()) {
            return -1;
        }
        // recursion
        int rightPoint = a.size() - 1;
        int lowPoint = rightPoint - 1;
        while (!a.contains(lowPoint)) {
            lowPoint--;
        }
        while (!a.contains(rightPoint)) {
            rightPoint++;
        }
        return a.indexOf(lowPoint) + 1;
    }

    
    public static int rightInsertion_Problem_0_01596225_23b9_48ed_abaf_91ecb929249a(ArrayList<Integer> a, int x) {
        for(int i = 0; i < a.size(); i++) {
            if(a.get(i) >= x) {
                return i;
            }
        }
        return -1;
    }

    
    public static int rightInsertion_Problem_2_3676a652_60af_4431_8dcf_a2dcb64dac16(ArrayList<Integer> a, int x) {
        int count = 0;
        for(int i=0; i<a.size(); i++) {
            if(a.get(i) > x) count++;
        }
        return a.size() + count; // return last index + number of items greater than x
    }

    
    public static int rightInsertion_Problem_1_4cffcaa1_bd0f_4a73_8a08_2d571f53c731(ArrayList<Integer> a, int x) {
        if (a == null || a.isEmpty()) return 0;
        int left = 0;
        int right = a.size() - 1;
        while ((left < right) && (a.get(left) <= x)) {
            left++;
        }
        while ((left < right) && (a.get(right) >= x)) {
            right--;
        }
        if (left == right) return left;
        return right + 1;
    }

    
    public static int rightInsertion_Problem_0_c30a3062_8efe_48eb_b76d_6a35a687349e(ArrayList<Integer> a, int x) {
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

    
    public static int rightInsertion_Problem_0_f895268a_297a_4413_aec1_b7638acdba6b(ArrayList<Integer> a, int x) {
        int last = 0;
        int pos = 0;
        for(pos = 0; pos < a.size(); pos++) {
            if(a.get(pos) > x) {
                break;
            }
            last = pos;
        }
        if(pos == a.size()) {
            pos = 0;
        }
        if(a.get(pos) == x) {
            return pos;
        }
        int nextpos = pos + 1;
        while(nextpos < a.size()) {
            if(a.get(nextpos) < x) {
                break;
            }
            nextpos++;
        }
        if(nextpos == a.size()) {
            nextpos = 0;
        }
        return last;
    }

    
    public static int rightInsertion_Problem_1_00db145c_f2c1_47f1_960b_ba97e0560086(ArrayList<Integer> a, int x) {
        // Write your code here
        return 0;
    }

    
    public static int rightInsertion_Problem_2_424a4d74_bb06_41a3_9ef2_43c4c14345d6(ArrayList<Integer> a, int x) {
        int low = 0;
        int high = a.size();
        while (low < high) {
            int mid = (low + high) / 2;
            if (x == a.get(mid)) {
                return mid;
            } else if (x < a.get(mid)) {
                low = mid+1;
            } else {
                high = mid-1;
            }
        }
        return -1;
    }

    
    public static int rightInsertion_Problem_0_9756374a_f0e9_47c8_bf80_3253357c84da(ArrayList<Integer> a, int x) {
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

    
    public static int rightInsertion_Problem_0_985e47a7_448b_4e5d_a483_e9e9f8c7022b(ArrayList<Integer> a, int x) {
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

    
    public static int rightInsertion_Problem_0_27cbc4f7_de8b_4d4b_be49_bf3f892bc287(ArrayList<Integer> a, int x) {
        // TODO: Write your code here
        return -1;
    }

    
    public static int rightInsertion_Problem_1_f8a89db6_bd78_444f_be99_44fb40d5a423(ArrayList<Integer> a, int x) {
        // Your code goes here!
        
        
        return -1;
    }

    
    public static int rightInsertion_Problem_0_1e027f74_2f19_4b5b_9df5_5c05ad44a66f(ArrayList<Integer> a, int x) {
        int rightMost = a.get(0); // Index of right element
        for (int i=1; i<a.size(); i++) {
            if (a.get(i) >= x) rightMost = i;
        }
        return rightMost;
    }

    
    public static int rightInsertion_Problem_2_0a026104_a898_42c9_ab40_0f57aeac233b(ArrayList<Integer> a, int x) {
        int low = 0;
        int high = a.size()-1;
        while (low <= high) {
            int mid = (low + high)/2;
            if (x > a.get(mid))
                low = mid + 1;
            else if (x < a.get(mid))
                high = mid - 1;
            else
                return mid;
        }
        return low;
    }

    
    public static int rightInsertion_Problem_2_ff019265_a6f6_415e_adcd_9b11a7232007(ArrayList<Integer> a, int x) {
        // Write your code here
        if (x <= a.get(0)){
            return 0;
        }
        int l = 0;
        int r = a.size() - 1;
        while(r >= l){
            int mid = l + (r - l)/2;
            if (mid > x){
                r = mid - 1;
            }
            else{
                l = mid;
            }
        }
        return l;
    }

    
    public static int rightInsertion_Problem_0_ced5cda9_6307_479d_bd79_63b681f5f039(ArrayList<Integer> a, int x) {
        int low = 0;
        int high = a.size() - 1;
        while (low <= high) {
            int mid = (low + high) >>> 1;
            if (a.get(mid) > x) {
                low = mid + 1;
            } else if (a.get(mid) < x) {
                high = mid - 1;
            } else {
                low = mid + 1;
                high = mid - 1;
            }
        }
        return low;
    }

    
    public static int rightInsertion_Problem_2_109483c7_1e70_465e_b649_5c3b76b2e1db(ArrayList<Integer> a, int x) {
        ArrayList<Integer> a2 = new ArrayList<>(a);
        ArrayList<Integer> a3 = new ArrayList<>(a2);
        int insertionPoint = 0;
        for(int i=0; i < a3.size() - 1; i++) {
            if(a3.get(i) < x && a3.get(i+1) > x) {
                insertionPoint = i;
                break;
            }
        }
        a3.remove(insertionPoint);
        a3.add(0, x);
        a3.add(insertionPoint+1, x);
        return a3.stream().mapToInteger(Integer::intValue).sum();
    }

    
    public static int rightInsertion_Problem_2_ed1b41df_c8d2_4b72_baa4_09006eedefe0(ArrayList<Integer> a, int x) {
        int i = 0;
        while(i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int rightInsertion_Problem_0_b17483fb_9fef_49eb_8f41_a84284af1144(ArrayList<Integer> a, int x) {
        // Write your code here.
        
        for(int i = a.size(); i > 0; i--){
            if(a.get(i) < x){
                a.add(i-1, x);
                
            }
            if(a.get(i) == x){
                return i;
            }
            if(a.get(i) > x){
                a.add(i-1, x);
                
            }
            if(a.get(i) == x && i > 0){
                return i;
            }
        }
        
        
        return -1;
    }

    
    public static int rightInsertion_Problem_1_ae723e7a_a936_47be_a75b_dbed4e838f80(ArrayList<Integer> a, int x) {
        int pos = 0;
        int last = a.get(0);
        for (int i = 1; i < a.size(); i++) {
            int cur = a.get(i);
            if (cur < last)
                pos = i + 1;
            last = cur;
        }
        return pos;
    }

    
    public static int rightInsertion_Problem_2_e66b0ba0_5cdb_4d1e_845b_dba652ec41a2(ArrayList<Integer> a, int x) {
        if (x >= a.get(0)) {
            return 0;
        }
        if (a.get(0) == x || x > a.get(a.size() - 1)) {
            return a.size() - 1;
        }
        int lo = 0, hi = a.size() - 1;
        while(lo <= hi) {
            int mid = (lo + hi) / 2;
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

    
    public static int rightInsertion_Problem_1_fa0b0d2f_afcc_4083_b15f_2312ef2e2d65(ArrayList<Integer> a, int x) {
        int low=0;
        int high = a.size()-1;
        int mid;
        while(low<=high){
            mid = (low+high)/2;
            if(a.get(mid)<x)
                low = mid +1;
            else if(a.get(mid)==x)
                return mid;
            else
                high = mid -1;
        }
        return low;
    }

    
    public static int rightInsertion_Problem_0_e7222d0f_33a9_4785_983f_ab6376b4cdad(ArrayList<Integer> a, int x) {
        int position = 0;
        for (int i = 0; i < a.size() - 1; i++) {
            if (a.get(i) > x) {
                position++;
            }
        }
        return position;
    }

    
    public static int rightInsertion_Problem_2_2197fa6c_abeb_4e29_ac8f_e79bf6872da3(ArrayList<Integer> a, int x) {
        int low = 0, high = a.size() - 1;
        while (low <= high) {
            int mid = (low + high) >>> 1;
            int midVal = a.get(mid);
            if (midVal < x) {
                low = mid + 1;
            } else if (midVal > x) {
                high = mid - 1;
            } else {
                return mid; // Found
            }
        }
        return high + 1; // not found
    }

    
    public static int rightInsertion_Problem_1_fd89cf90_b258_4914_b7d5_a2ff33494795(ArrayList<Integer> a, int x) {
        // Write your logic here
        return 0;
    }

    
    public static int rightInsertion_Problem_1_aeb9d920_f4c5_4b58_95df_36e9c7f2a6c1(ArrayList<Integer> a, int x) {
        int i = 0;
        while(i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int rightInsertion_Problem_1_e7222d0f_33a9_4785_983f_ab6376b4cdad(ArrayList<Integer> a, int x) {
        int position = 0;
        for (int i = 0; i < a.size() - 1; i++) {
            if (a.get(i) > x) {
                position++;
            }
        }
        return position;
    }

    
    public static int rightInsertion_Problem_0_824dc500_a6b8_46a6_951c_4812f3b3405a(ArrayList<Integer> a, int x) {
        int low = a.get(0), high = a.get(0);
        for(int i = 1; i < a.size(); i++) {
            if(a.get(i) > x) {
                high = a.get(i);
            } else {
                low = a.get(i);
            }
        }
        return low + 1;
    }

    
    public static int rightInsertion_Problem_2_b7a07377_b4d1_4817_8b05_27dad302c41a(ArrayList<Integer> a, int x) {
        ArrayList<Integer> tmp = new ArrayList<Integer>(a);
        // Traverse the array from last element to first
        for(int i = a.size(); i > 0; i--) {
            if(a.get(i) > x) {
                tmp.add(i-1, x);
                break;
            }
        }
        // Now traverse the array from first element to last
        for(int i = 0; i <= a.size(); i++) {
            if(a.get(i) < x) {
                tmp.add(i+1, x);
                break;
            }
        }
        // Now traverse the array from first element to last
        for(int i = a.size(); i > 0; i--) {
            if(a.get(i) == x) {
                return i;
            }
        }
        // Not found
        return -1;
    }

    
    public static int rightInsertion_Problem_1_2197fa6c_abeb_4e29_ac8f_e79bf6872da3(ArrayList<Integer> a, int x) {
        int low = 0, high = a.size() - 1;
        while (low <= high) {
            int mid = (low + high) >>> 1;
            int midVal = a.get(mid);
            if (midVal < x) {
                low = mid + 1;
            } else if (midVal > x) {
                high = mid - 1;
            } else {
                return mid; // Found
            }
        }
        return high + 1; // not found
    }

    
    public static int rightInsertion_Problem_0_00db145c_f2c1_47f1_960b_ba97e0560086(ArrayList<Integer> a, int x) {
        // Write your code here
        return 0;
    }

    
    public static int rightInsertion_Problem_1_054f9d20_e54e_4a63_9ddf_90148b5d9435(ArrayList<Integer> a, int x) {
        int i = 0;
        while(i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int rightInsertion_Problem_1_4380be5e_b7b8_4ddf_b821_37e777287aa8(ArrayList<Integer> a, int x) {
        if(x < a.get(0))
            return 0;
        if(x == a.get(0))
            return a.size();
        for(int i = 1; i < a.size(); i++) {
            if(x == a.get(i))
                return i;
            if(x < a.get(i))
                return i;
        }
        return a.size();
    }

    
    public static int rightInsertion_Problem_0_109483c7_1e70_465e_b649_5c3b76b2e1db(ArrayList<Integer> a, int x) {
        ArrayList<Integer> a2 = new ArrayList<>(a);
        ArrayList<Integer> a3 = new ArrayList<>(a2);
        int insertionPoint = 0;
        for(int i=0; i < a3.size() - 1; i++) {
            if(a3.get(i) < x && a3.get(i+1) > x) {
                insertionPoint = i;
                break;
            }
        }
        a3.remove(insertionPoint);
        a3.add(0, x);
        a3.add(insertionPoint+1, x);
        return a3.stream().mapToInteger(Integer::intValue).sum();
    }

    
    public static int rightInsertion_Problem_1_25833fc9_1259_45d2_9d0e_79860da15f97(ArrayList<Integer> a, int x) {
        int i = 0;
        while(i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int rightInsertion_Problem_1_ff019265_a6f6_415e_adcd_9b11a7232007(ArrayList<Integer> a, int x) {
        // Write your code here
        if (x <= a.get(0)){
            return 0;
        }
        int l = 0;
        int r = a.size() - 1;
        while(r >= l){
            int mid = l + (r - l)/2;
            if (mid > x){
                r = mid - 1;
            }
            else{
                l = mid;
            }
        }
        return l;
    }

    
    public static int rightInsertion_Problem_0_8cc95de4_dba1_4f58_8757_c549af060bc2(ArrayList<Integer> a, int x) {
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

    
    public static int rightInsertion_Problem_1_de7a74c5_ae31_40cf_a5fe_a0a811dd9733(ArrayList<Integer> a, int x) {
        int lo = 0, hi = a.size() - 1;
        while (lo < hi && a.get(lo) <= x) {
            lo++;
        }
        while (lo < hi && a.get(hi) > x) {
            hi--;
        }
        if (lo == hi) {
            return lo;
        }
        return a.size();
    }

    
    public static int rightInsertion_Problem_1_01596225_23b9_48ed_abaf_91ecb929249a(ArrayList<Integer> a, int x) {
        for(int i = 0; i < a.size(); i++) {
            if(a.get(i) >= x) {
                return i;
            }
        }
        return -1;
    }

    
    public static int rightInsertion_Problem_2_0a026104_a898_42c9_ab40_0f57aeac233b(ArrayList<Integer> a, int x) {
        int low = 0;
        int high = a.size()-1;
        while (low <= high) {
            int mid = (low + high)/2;
            if (x > a.get(mid))
                low = mid + 1;
            else if (x < a.get(mid))
                high = mid - 1;
            else
                return mid;
        }
        return low;
    }

    
    public static int rightInsertion_Problem_1_e25e8f3d_f296_4f01_ba41_0aee50cc98f4(ArrayList<Integer> a, int x) {
        int i = Collections.binarySearch(a, x);
        if (i <= 0) return 0;
        return i - 1;
    }

    
    public static int rightInsertion_Problem_2_c30a3062_8efe_48eb_b76d_6a35a687349e(ArrayList<Integer> a, int x) {
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

    
    public static int rightInsertion_Problem_0_aeb9d920_f4c5_4b58_95df_36e9c7f2a6c1(ArrayList<Integer> a, int x) {
        int i = 0;
        while(i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int rightInsertion_Problem_1_de7a74c5_ae31_40cf_a5fe_a0a811dd9733(ArrayList<Integer> a, int x) {
        int lo = 0, hi = a.size() - 1;
        while (lo < hi && a.get(lo) <= x) {
            lo++;
        }
        while (lo < hi && a.get(hi) > x) {
            hi--;
        }
        if (lo == hi) {
            return lo;
        }
        return a.size();
    }

    
    public static int rightInsertion_Problem_1_d31344d7_3e04_4c6f_97cc_eb3f56c27084(ArrayList<Integer> a, int x) {
        return -1;
    }

    
    public static int rightInsertion_Problem_2_d31344d7_3e04_4c6f_97cc_eb3f56c27084(ArrayList<Integer> a, int x) {
        return -1;
    }

    
    public static int rightInsertion_Problem_0_3d0b43db_5ebc_414d_a5b0_9bc5c0c0860d(ArrayList<Integer> a, int x) {
        int i = 0;
        while(i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int rightInsertion_Problem_1_8752abcb_3afc_43d4_9636_cc025cb86b81(ArrayList<Integer> a, int x) {
        int insertionPoint = -1; // Assume failure
        for(int i = 1; i < a.size(); i++) {
            if(a.get(i) > x) {
                insertionPoint = i;
                break;
            }
        }
        return insertionPoint;
    }

    
    public static int rightInsertion_Problem_2_5f6130f8_eb53_454f_8da8_2f6aa366ed00(ArrayList<Integer> a, int x) {
        // base case
        if (a.contains(x)) {
            return a.indexOf(x);
        }
        if (a.isEmpty()) {
            return -1;
        }
        // recursion
        int rightPoint = a.size() - 1;
        int lowPoint = rightPoint - 1;
        while (!a.contains(lowPoint)) {
            lowPoint--;
        }
        while (!a.contains(rightPoint)) {
            rightPoint++;
        }
        return a.indexOf(lowPoint) + 1;
    }

    
    public static int rightInsertion_Problem_1_01596225_23b9_48ed_abaf_91ecb929249a(ArrayList<Integer> a, int x) {
        for(int i = 0; i < a.size(); i++) {
            if(a.get(i) >= x) {
                return i;
            }
        }
        return -1;
    }

    
    public static int rightInsertion_Problem_1_b9ba9bfd_9cad_45fb_8cde_035a495ba1e3(ArrayList<Integer> a, int x) {
        int high = a.get(0);
        int low = a.get(0);
        int mid = high / 2;
        while(low < high) {
            mid = low + ((high - low) / 2);
            if (mid > x) {
                high = mid - 1;
            }
            else if (mid < x) {
                low = mid + 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }

    
    public static int rightInsertion_Problem_2_c30a3062_8efe_48eb_b76d_6a35a687349e(ArrayList<Integer> a, int x) {
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

    
    public static int rightInsertion_Problem_2_985e47a7_448b_4e5d_a483_e9e9f8c7022b(ArrayList<Integer> a, int x) {
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

    
    public static int rightInsertion_Problem_1_3d0b43db_5ebc_414d_a5b0_9bc5c0c0860d(ArrayList<Integer> a, int x) {
        int i = 0;
        while(i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int rightInsertion_Problem_1_cd14bcdb_c31c_4bbc_b795_c99f423d0c6b(ArrayList<Integer> a, int x) {
        int start = 0, end = a.size() - 1;
        while (start < end) {
            int mid = (start + end) / 2;
            if (x < a.get(mid)) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

    
    public static int rightInsertion_Problem_1_b7a07377_b4d1_4817_8b05_27dad302c41a(ArrayList<Integer> a, int x) {
        ArrayList<Integer> tmp = new ArrayList<Integer>(a);
        // Traverse the array from last element to first
        for(int i = a.size(); i > 0; i--) {
            if(a.get(i) > x) {
                tmp.add(i-1, x);
                break;
            }
        }
        // Now traverse the array from first element to last
        for(int i = 0; i <= a.size(); i++) {
            if(a.get(i) < x) {
                tmp.add(i+1, x);
                break;
            }
        }
        // Now traverse the array from first element to last
        for(int i = a.size(); i > 0; i--) {
            if(a.get(i) == x) {
                return i;
            }
        }
        // Not found
        return -1;
    }

    
    public static int rightInsertion_Problem_0_109483c7_1e70_465e_b649_5c3b76b2e1db(ArrayList<Integer> a, int x) {
        ArrayList<Integer> a2 = new ArrayList<>(a);
        ArrayList<Integer> a3 = new ArrayList<>(a2);
        int insertionPoint = 0;
        for(int i=0; i < a3.size() - 1; i++) {
            if(a3.get(i) < x && a3.get(i+1) > x) {
                insertionPoint = i;
                break;
            }
        }
        a3.remove(insertionPoint);
        a3.add(0, x);
        a3.add(insertionPoint+1, x);
        return a3.stream().mapToInteger(Integer::intValue).sum();
    }

    
    public static int rightInsertion_Problem_2_c30a3062_8efe_48eb_b76d_6a35a687349e(ArrayList<Integer> a, int x) {
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

    
    public static int rightInsertion_Problem_0_2d1dd2cc_e9e5_47ac_855f_9b6832e2231e(ArrayList<Integer> a, int x) {
        int index = Collections.binarySearch(a, x);
        return index == 0 ? a.size() : index;
    }

    
    public static int rightInsertion_Problem_2_4380be5e_b7b8_4ddf_b821_37e777287aa8(ArrayList<Integer> a, int x) {
        if(x < a.get(0))
            return 0;
        if(x == a.get(0))
            return a.size();
        for(int i = 1; i < a.size(); i++) {
            if(x == a.get(i))
                return i;
            if(x < a.get(i))
                return i;
        }
        return a.size();
    }

    
    public static int rightInsertion_Problem_1_c37b8d59_f285_4589_a8f4_9aa3f91888db(ArrayList<Integer> a, int x) {
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

    
    public static int rightInsertion_Problem_0_d30623f4_d4f6_43b7_bc37_7ab29906f5c1(ArrayList<Integer> a, int x) {
        // TODO: Implement me!
        ArrayList<Integer> temp = new ArrayList<Integer>(a);
        int index = Collections.binarySearch(temp, x) - 1;
        return index;
    }

    
    public static int rightInsertion_Problem_2_b368c88e_a3c6_4e6c_b249_633deb339d60(ArrayList<Integer> a, int x) {
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

    
    public static int rightInsertion_Problem_1_1e027f74_2f19_4b5b_9df5_5c05ad44a66f(ArrayList<Integer> a, int x) {
        int rightMost = a.get(0); // Index of right element
        for (int i=1; i<a.size(); i++) {
            if (a.get(i) >= x) rightMost = i;
        }
        return rightMost;
    }

    
    public static int rightInsertion_Problem_1_3d0b43db_5ebc_414d_a5b0_9bc5c0c0860d(ArrayList<Integer> a, int x) {
        int i = 0;
        while(i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int rightInsertion_Problem_0_f757e088_b942_4256_bef6_73b4c9ec165e(ArrayList<Integer> a, int x) {
        int lo = 0;
        int hi = a.size() - 1;

        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if (a.get(mid) == x)
                return mid;
            if (x < a.get(mid))
                lo = mid + 1;
            else
                hi = mid - 1;
        }

        return lo;
    }

    
    public static int rightInsertion_Problem_1_f5215c3e_15c3_47ab_875c_027898a0ba21(ArrayList<Integer> a, int x) {
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

    
    public static int rightInsertion_Problem_0_054f9d20_e54e_4a63_9ddf_90148b5d9435(ArrayList<Integer> a, int x) {
        int i = 0;
        while(i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int rightInsertion_Problem_1_c37b8d59_f285_4589_a8f4_9aa3f91888db(ArrayList<Integer> a, int x) {
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

    
    public static int rightInsertion_Problem_1_22b45005_82a7_4f4b_9b3d_d8491d254328(ArrayList<Integer> a, int x) {
        int j;
        for (j = 1; j <= a.size() - 1; j++) {
            if (a.get(j) > x) {
                break;
            }
        }
        return j;
    }

    
    public static int rightInsertion_Problem_0_9cbc1873_88d1_4ab1_be13_fd7e5a41e4ec(ArrayList<Integer> a, int x) {
        // initialize insertion point
        int i = 0; // index of first element less than x
        int last = i; // index of last element greater than x

        // loop until x is found
        while (a.size() > 1 && a.get(i) < x) {
            i++;
        }

        // if x was found, return its index
        if (i != 0) {
            int right = a.get(i - 1);
            if (right > x) {
                return i - 1;
            } else {
                return i;
            }
        }

        // x not found, return last index
        return last;
    }

    
    public static int rightInsertion_Problem_1_6c6c5124_e788_487b_91ed_55e3cbe61d62(ArrayList<Integer> a, int x) {
        Collections.binarySearch(a, x);
        return Collections.binarySearch(a, x);
    }

    
    public static int rightInsertion_Problem_0_8752abcb_3afc_43d4_9636_cc025cb86b81(ArrayList<Integer> a, int x) {
        int insertionPoint = -1; // Assume failure
        for(int i = 1; i < a.size(); i++) {
            if(a.get(i) > x) {
                insertionPoint = i;
                break;
            }
        }
        return insertionPoint;
    }

    
    public static int rightInsertion_Problem_2_d7bc5d66_2863_4e0b_b1f4_5427625d61c0(ArrayList<Integer> a, int x) {
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

    
    public static int rightInsertion_Problem_0_5228143d_4251_4945_ac70_fe7605c620bb(ArrayList<Integer> a, int x) {
        int i = a.size() - 1;
        for(; i >= 0 && a.get(i) < x; i--);
        return i;
    }

    
    public static int rightInsertion_Problem_2_de7a74c5_ae31_40cf_a5fe_a0a811dd9733(ArrayList<Integer> a, int x) {
        int lo = 0, hi = a.size() - 1;
        while (lo < hi && a.get(lo) <= x) {
            lo++;
        }
        while (lo < hi && a.get(hi) > x) {
            hi--;
        }
        if (lo == hi) {
            return lo;
        }
        return a.size();
    }

    
    public static int rightInsertion_Problem_0_79fbdbfa_cdf6_467d_82f8_f4058169d59a(ArrayList<Integer> a, int x) {
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

    
    public static int rightInsertion_Problem_2_b7a07377_b4d1_4817_8b05_27dad302c41a(ArrayList<Integer> a, int x) {
        ArrayList<Integer> tmp = new ArrayList<Integer>(a);
        // Traverse the array from last element to first
        for(int i = a.size(); i > 0; i--) {
            if(a.get(i) > x) {
                tmp.add(i-1, x);
                break;
            }
        }
        // Now traverse the array from first element to last
        for(int i = 0; i <= a.size(); i++) {
            if(a.get(i) < x) {
                tmp.add(i+1, x);
                break;
            }
        }
        // Now traverse the array from first element to last
        for(int i = a.size(); i > 0; i--) {
            if(a.get(i) == x) {
                return i;
            }
        }
        // Not found
        return -1;
    }

    
    public static int rightInsertion_Problem_0_9782cae1_001f_44aa_97bb_bb0efb4c9899(ArrayList<Integer> a, int x) {
        int n = a.size();
        int i = 0;
        while (i < n && a.get(i) <= x) {
            i++;
        }
        if (i == n) return -1;
        while (i > 0 && a.get(i) > x) {
            i--;
        }
        return i;
    }

    
    public static int rightInsertion_Problem_0_78011b89_880a_4779_ac72_cd0ac5a9f5dc(ArrayList<Integer> a, int x) {
        int low = a.get(0);
        int high = a.get(0);
        int mid = 0;
        for (int i: a) {
            if (i == x) {
                return mid;
            }
            if (i < x) {
                low = i;
            } else {
                high = i;
            }
            mid = (low + high) / 2;
        }
        return mid;
    }

    
    public static int rightInsertion_Problem_1_2197fa6c_abeb_4e29_ac8f_e79bf6872da3(ArrayList<Integer> a, int x) {
        int low = 0, high = a.size() - 1;
        while (low <= high) {
            int mid = (low + high) >>> 1;
            int midVal = a.get(mid);
            if (midVal < x) {
                low = mid + 1;
            } else if (midVal > x) {
                high = mid - 1;
            } else {
                return mid; // Found
            }
        }
        return high + 1; // not found
    }

    
    public static int rightInsertion_Problem_1_fa0b0d2f_afcc_4083_b15f_2312ef2e2d65(ArrayList<Integer> a, int x) {
        int low=0;
        int high = a.size()-1;
        int mid;
        while(low<=high){
            mid = (low+high)/2;
            if(a.get(mid)<x)
                low = mid +1;
            else if(a.get(mid)==x)
                return mid;
            else
                high = mid -1;
        }
        return low;
    }

    
    public static int rightInsertion_Problem_2_105b3361_b557_457c_b71f_a31c2459b281(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int rightInsertion_Problem_2_824dc500_a6b8_46a6_951c_4812f3b3405a(ArrayList<Integer> a, int x) {
        int low = a.get(0), high = a.get(0);
        for(int i = 1; i < a.size(); i++) {
            if(a.get(i) > x) {
                high = a.get(i);
            } else {
                low = a.get(i);
            }
        }
        return low + 1;
    }

    
    public static int rightInsertion_Problem_1_b1eb669e_6452_48e4_8e14_93893b7f8e79(ArrayList<Integer> a, int x) {
        for(int i=0; i < a.size(); i++) {
            if(a.get(i) >= x)
                return i;
        }
        return a.size()+1;
    }

    
    public static int rightInsertion_Problem_2_ee933723_ca38_42bb_b9b9_ec6830576804(ArrayList<Integer> a, int x) {
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

    
    public static int rightInsertion_Problem_1_b2102f2f_5d7e_400b_8725_870f0c037997(ArrayList<Integer> a, int x) {
        int pos = 0;
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) <= x) {
                pos = i;
                break;
            }
        }
        return pos;
    }

    
    public static int rightInsertion_Problem_1_985e47a7_448b_4e5d_a483_e9e9f8c7022b(ArrayList<Integer> a, int x) {
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

    
    public static int rightInsertion_Problem_2_ce4772ec_04a3_4f42_998f_6551d796cd3b(ArrayList<Integer> a, int x) {
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

    
    public static int rightInsertion_Problem_1_5228143d_4251_4945_ac70_fe7605c620bb(ArrayList<Integer> a, int x) {
        int i = a.size() - 1;
        for(; i >= 0 && a.get(i) < x; i--);
        return i;
    }

    
    public static int rightInsertion_Problem_2_985e47a7_448b_4e5d_a483_e9e9f8c7022b(ArrayList<Integer> a, int x) {
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

    
    public static int rightInsertion_Problem_0_9756374a_f0e9_47c8_bf80_3253357c84da(ArrayList<Integer> a, int x) {
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

    
    public static int rightInsertion_Problem_1_ced5cda9_6307_479d_bd79_63b681f5f039(ArrayList<Integer> a, int x) {
        int low = 0;
        int high = a.size() - 1;
        while (low <= high) {
            int mid = (low + high) >>> 1;
            if (a.get(mid) > x) {
                low = mid + 1;
            } else if (a.get(mid) < x) {
                high = mid - 1;
            } else {
                low = mid + 1;
                high = mid - 1;
            }
        }
        return low;
    }

    
    public static int rightInsertion_Problem_2_f62806c9_1d17_4bc3_a2d2_1a7e7c6bc0c0(ArrayList<Integer> a, int x) {
        return Collections.binarySearch(a, x);
    }

    
    public static int rightInsertion_Problem_2_105b3361_b557_457c_b71f_a31c2459b281(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int rightInsertion_Problem_2_48e33c26_a463_46d4_a9ea_b9e904a07fe6(ArrayList<Integer> a, int x) {
        int i = 0;
        while(i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int rightInsertion_Problem_2_2c1ce94c_97e8_4a73_ac1b_10d282f00646(ArrayList<Integer> a, int x) {
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

    
    public static int rightInsertion_Problem_2_936215fc_39e3_4904_8504_8897ab2f8571(ArrayList<Integer> a, int x) {
        if (a.size() == 0) {
            return -1;
        }
        if (a.get(a.size() - 1) < x) {
            return a.size();
        }
        // If x > a[size() - 1], then search for the right position
        int idx = 1;
        while (idx < a.size() && x > a.get(idx)) {
            idx++;
        }
        if (idx < a.size()) {
            int j = idx - 1;
            while (j >= 0 && x > a.get(j)) {
                j--;
            }
            return j + 1;
        }
        return -1;
    }

    
    public static int rightInsertion_Problem_1_e7222d0f_33a9_4785_983f_ab6376b4cdad(ArrayList<Integer> a, int x) {
        int position = 0;
        for (int i = 0; i < a.size() - 1; i++) {
            if (a.get(i) > x) {
                position++;
            }
        }
        return position;
    }

    
    public static int rightInsertion_Problem_1_2c1ce94c_97e8_4a73_ac1b_10d282f00646(ArrayList<Integer> a, int x) {
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

    
    public static int rightInsertion_Problem_1_936215fc_39e3_4904_8504_8897ab2f8571(ArrayList<Integer> a, int x) {
        if (a.size() == 0) {
            return -1;
        }
        if (a.get(a.size() - 1) < x) {
            return a.size();
        }
        // If x > a[size() - 1], then search for the right position
        int idx = 1;
        while (idx < a.size() && x > a.get(idx)) {
            idx++;
        }
        if (idx < a.size()) {
            int j = idx - 1;
            while (j >= 0 && x > a.get(j)) {
                j--;
            }
            return j + 1;
        }
        return -1;
    }

    
    public static int rightInsertion_Problem_1_6c6c5124_e788_487b_91ed_55e3cbe61d62(ArrayList<Integer> a, int x) {
        Collections.binarySearch(a, x);
        return Collections.binarySearch(a, x);
    }

    
    public static int rightInsertion_Problem_1_de7a74c5_ae31_40cf_a5fe_a0a811dd9733(ArrayList<Integer> a, int x) {
        int lo = 0, hi = a.size() - 1;
        while (lo < hi && a.get(lo) <= x) {
            lo++;
        }
        while (lo < hi && a.get(hi) > x) {
            hi--;
        }
        if (lo == hi) {
            return lo;
        }
        return a.size();
    }

    
    public static int rightInsertion_Problem_2_22b45005_82a7_4f4b_9b3d_d8491d254328(ArrayList<Integer> a, int x) {
        int j;
        for (j = 1; j <= a.size() - 1; j++) {
            if (a.get(j) > x) {
                break;
            }
        }
        return j;
    }

    
    public static int rightInsertion_Problem_1_dbe42a85_4a93_4542_8a71_03ef1729e7bd(ArrayList<Integer> a, int x) {
        int lo = 0;
        int hi = a.size() - 1;
        while (lo < hi) {
            int mid = (lo + hi) >>> 1;
            int midVal = a.get(mid);
            if (midVal < x) lo = mid;
            else if (midVal > x) hi = mid;
            else return mid;
        }
        return lo;
    }

    
    public static int rightInsertion_Problem_1_4232967e_a8af_4edb_9e78_6370f82f25ae(ArrayList<Integer> a, int x) {
        int i = 0;
        while(i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int rightInsertion_Problem_2_3676a652_60af_4431_8dcf_a2dcb64dac16(ArrayList<Integer> a, int x) {
        int count = 0;
        for(int i=0; i<a.size(); i++) {
            if(a.get(i) > x) count++;
        }
        return a.size() + count; // return last index + number of items greater than x
    }

    
    public static int rightInsertion_Problem_0_e25e8f3d_f296_4f01_ba41_0aee50cc98f4(ArrayList<Integer> a, int x) {
        int i = Collections.binarySearch(a, x);
        if (i <= 0) return 0;
        return i - 1;
    }

    
    public static int rightInsertion_Problem_1_c30a3062_8efe_48eb_b76d_6a35a687349e(ArrayList<Integer> a, int x) {
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

    
    public static int rightInsertion_Problem_2_1e027f74_2f19_4b5b_9df5_5c05ad44a66f(ArrayList<Integer> a, int x) {
        int rightMost = a.get(0); // Index of right element
        for (int i=1; i<a.size(); i++) {
            if (a.get(i) >= x) rightMost = i;
        }
        return rightMost;
    }

    
    public static int rightInsertion_Problem_2_4380be5e_b7b8_4ddf_b821_37e777287aa8(ArrayList<Integer> a, int x) {
        if(x < a.get(0))
            return 0;
        if(x == a.get(0))
            return a.size();
        for(int i = 1; i < a.size(); i++) {
            if(x == a.get(i))
                return i;
            if(x < a.get(i))
                return i;
        }
        return a.size();
    }

    
    public static int rightInsertion_Problem_0_aeb9d920_f4c5_4b58_95df_36e9c7f2a6c1(ArrayList<Integer> a, int x) {
        int i = 0;
        while(i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int rightInsertion_Problem_2_5f6130f8_eb53_454f_8da8_2f6aa366ed00(ArrayList<Integer> a, int x) {
        // base case
        if (a.contains(x)) {
            return a.indexOf(x);
        }
        if (a.isEmpty()) {
            return -1;
        }
        // recursion
        int rightPoint = a.size() - 1;
        int lowPoint = rightPoint - 1;
        while (!a.contains(lowPoint)) {
            lowPoint--;
        }
        while (!a.contains(rightPoint)) {
            rightPoint++;
        }
        return a.indexOf(lowPoint) + 1;
    }

    
    public static int rightInsertion_Problem_0_ff019265_a6f6_415e_adcd_9b11a7232007(ArrayList<Integer> a, int x) {
        // Write your code here
        if (x <= a.get(0)){
            return 0;
        }
        int l = 0;
        int r = a.size() - 1;
        while(r >= l){
            int mid = l + (r - l)/2;
            if (mid > x){
                r = mid - 1;
            }
            else{
                l = mid;
            }
        }
        return l;
    }

    
    public static int rightInsertion_Problem_2_726b4652_cf4b_42cd_9cb1_910d8d57d198(ArrayList<Integer> a, int x) {
        ArrayList<Integer> b = new ArrayList<>(a);
        Collections.sort(b);
        int index = b.indexOf(x);
        if (index < 0) {
            index = b.size();
        }
        return index;
    }

    
    public static int rightInsertion_Problem_0_726b4652_cf4b_42cd_9cb1_910d8d57d198(ArrayList<Integer> a, int x) {
        ArrayList<Integer> b = new ArrayList<>(a);
        Collections.sort(b);
        int index = b.indexOf(x);
        if (index < 0) {
            index = b.size();
        }
        return index;
    }

    
    public static int rightInsertion_Problem_2_8cc95de4_dba1_4f58_8757_c549af060bc2(ArrayList<Integer> a, int x) {
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

    
    public static int rightInsertion_Problem_0_d31344d7_3e04_4c6f_97cc_eb3f56c27084(ArrayList<Integer> a, int x) {
        return -1;
    }

    
    public static int rightInsertion_Problem_2_680b4d5e_dab3_483f_ad44_aba90a090af5(ArrayList<Integer> a, int x) {
        return Collections.binarySearch(a, x);
    }

    
    public static int rightInsertion_Problem_2_b17483fb_9fef_49eb_8f41_a84284af1144(ArrayList<Integer> a, int x) {
        // Write your code here.
        
        for(int i = a.size(); i > 0; i--){
            if(a.get(i) < x){
                a.add(i-1, x);
                
            }
            if(a.get(i) == x){
                return i;
            }
            if(a.get(i) > x){
                a.add(i-1, x);
                
            }
            if(a.get(i) == x && i > 0){
                return i;
            }
        }
        
        
        return -1;
    }

    
    public static int rightInsertion_Problem_1_054f9d20_e54e_4a63_9ddf_90148b5d9435(ArrayList<Integer> a, int x) {
        int i = 0;
        while(i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int rightInsertion_Problem_0_01596225_23b9_48ed_abaf_91ecb929249a(ArrayList<Integer> a, int x) {
        for(int i = 0; i < a.size(); i++) {
            if(a.get(i) >= x) {
                return i;
            }
        }
        return -1;
    }

    
    public static int rightInsertion_Problem_2_5f6130f8_eb53_454f_8da8_2f6aa366ed00(ArrayList<Integer> a, int x) {
        // base case
        if (a.contains(x)) {
            return a.indexOf(x);
        }
        if (a.isEmpty()) {
            return -1;
        }
        // recursion
        int rightPoint = a.size() - 1;
        int lowPoint = rightPoint - 1;
        while (!a.contains(lowPoint)) {
            lowPoint--;
        }
        while (!a.contains(rightPoint)) {
            rightPoint++;
        }
        return a.indexOf(lowPoint) + 1;
    }

    
    public static int rightInsertion_Problem_1_b2102f2f_5d7e_400b_8725_870f0c037997(ArrayList<Integer> a, int x) {
        int pos = 0;
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) <= x) {
                pos = i;
                break;
            }
        }
        return pos;
    }

    
    public static int rightInsertion_Problem_2_6c6c5124_e788_487b_91ed_55e3cbe61d62(ArrayList<Integer> a, int x) {
        Collections.binarySearch(a, x);
        return Collections.binarySearch(a, x);
    }

    
    public static int rightInsertion_Problem_1_cd14bcdb_c31c_4bbc_b795_c99f423d0c6b(ArrayList<Integer> a, int x) {
        int start = 0, end = a.size() - 1;
        while (start < end) {
            int mid = (start + end) / 2;
            if (x < a.get(mid)) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

    
    public static int rightInsertion_Problem_2_f757e088_b942_4256_bef6_73b4c9ec165e(ArrayList<Integer> a, int x) {
        int lo = 0;
        int hi = a.size() - 1;

        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if (a.get(mid) == x)
                return mid;
            if (x < a.get(mid))
                lo = mid + 1;
            else
                hi = mid - 1;
        }

        return lo;
    }

    
    public static int rightInsertion_Problem_2_48c3be70_f516_4319_bb03_8f891871f94a(ArrayList<Integer> a, int x) {
        int lo = 0;
        int hi = a.size();
        while (hi > lo) {
            int mid = lo + (hi - lo) / 2;
            if (a.get(mid) <= x) lo = mid;
            else hi = mid;
        }
        return lo;
    }

    
    public static int rightInsertion_Problem_0_e35d0773_d7de_4963_ab76_ba1d3ef9fc6b(ArrayList<Integer> a, int x) {
        // write your code
        return 0;
    }

    
    public static int rightInsertion_Problem_1_1e027f74_2f19_4b5b_9df5_5c05ad44a66f(ArrayList<Integer> a, int x) {
        int rightMost = a.get(0); // Index of right element
        for (int i=1; i<a.size(); i++) {
            if (a.get(i) >= x) rightMost = i;
        }
        return rightMost;
    }

    
    public static int rightInsertion_Problem_0_0a026104_a898_42c9_ab40_0f57aeac233b(ArrayList<Integer> a, int x) {
        int low = 0;
        int high = a.size()-1;
        while (low <= high) {
            int mid = (low + high)/2;
            if (x > a.get(mid))
                low = mid + 1;
            else if (x < a.get(mid))
                high = mid - 1;
            else
                return mid;
        }
        return low;
    }

    
    public static int rightInsertion_Problem_1_22e4842b_1948_4005_a019_74b5fcab8757(ArrayList<Integer> a, int x) {
        int lastPosition = a.size();
        int firstPosition = lastPosition - 1;
        while (firstPosition >= 0 && x < a.get(firstPosition)) {
            firstPosition--;
        }
        Integer answer = (firstPosition >= 0) ? a.get(firstPosition + 1) : a.get(lastPosition);
        return (firstPosition >= 0) ? (firstPosition + 1) : lastPosition;
    }

    
    public static int rightInsertion_Problem_1_e66b0ba0_5cdb_4d1e_845b_dba652ec41a2(ArrayList<Integer> a, int x) {
        if (x >= a.get(0)) {
            return 0;
        }
        if (a.get(0) == x || x > a.get(a.size() - 1)) {
            return a.size() - 1;
        }
        int lo = 0, hi = a.size() - 1;
        while(lo <= hi) {
            int mid = (lo + hi) / 2;
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

    
    public static int rightInsertion_Problem_0_054f9d20_e54e_4a63_9ddf_90148b5d9435(ArrayList<Integer> a, int x) {
        int i = 0;
        while(i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int rightInsertion_Problem_1_25833fc9_1259_45d2_9d0e_79860da15f97(ArrayList<Integer> a, int x) {
        int i = 0;
        while(i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int rightInsertion_Problem_1_22b45005_82a7_4f4b_9b3d_d8491d254328(ArrayList<Integer> a, int x) {
        int j;
        for (j = 1; j <= a.size() - 1; j++) {
            if (a.get(j) > x) {
                break;
            }
        }
        return j;
    }

    
    public static int rightInsertion_Problem_0_ed1b41df_c8d2_4b72_baa4_09006eedefe0(ArrayList<Integer> a, int x) {
        int i = 0;
        while(i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int rightInsertion_Problem_1_22e4842b_1948_4005_a019_74b5fcab8757(ArrayList<Integer> a, int x) {
        int lastPosition = a.size();
        int firstPosition = lastPosition - 1;
        while (firstPosition >= 0 && x < a.get(firstPosition)) {
            firstPosition--;
        }
        Integer answer = (firstPosition >= 0) ? a.get(firstPosition + 1) : a.get(lastPosition);
        return (firstPosition >= 0) ? (firstPosition + 1) : lastPosition;
    }

    
    public static int rightInsertion_Problem_0_b368c88e_a3c6_4e6c_b249_633deb339d60(ArrayList<Integer> a, int x) {
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

    
    public static int rightInsertion_Problem_1_726b4652_cf4b_42cd_9cb1_910d8d57d198(ArrayList<Integer> a, int x) {
        ArrayList<Integer> b = new ArrayList<>(a);
        Collections.sort(b);
        int index = b.indexOf(x);
        if (index < 0) {
            index = b.size();
        }
        return index;
    }

    
    public static int rightInsertion_Problem_1_ae723e7a_a936_47be_a75b_dbed4e838f80(ArrayList<Integer> a, int x) {
        int pos = 0;
        int last = a.get(0);
        for (int i = 1; i < a.size(); i++) {
            int cur = a.get(i);
            if (cur < last)
                pos = i + 1;
            last = cur;
        }
        return pos;
    }

    
    public static int rightInsertion_Problem_0_fa0b0d2f_afcc_4083_b15f_2312ef2e2d65(ArrayList<Integer> a, int x) {
        int low=0;
        int high = a.size()-1;
        int mid;
        while(low<=high){
            mid = (low+high)/2;
            if(a.get(mid)<x)
                low = mid +1;
            else if(a.get(mid)==x)
                return mid;
            else
                high = mid -1;
        }
        return low;
    }

    
    public static int rightInsertion_Problem_0_9782cae1_001f_44aa_97bb_bb0efb4c9899(ArrayList<Integer> a, int x) {
        int n = a.size();
        int i = 0;
        while (i < n && a.get(i) <= x) {
            i++;
        }
        if (i == n) return -1;
        while (i > 0 && a.get(i) > x) {
            i--;
        }
        return i;
    }

    
    public static int rightInsertion_Problem_1_01596225_23b9_48ed_abaf_91ecb929249a(ArrayList<Integer> a, int x) {
        for(int i = 0; i < a.size(); i++) {
            if(a.get(i) >= x) {
                return i;
            }
        }
        return -1;
    }

    
    public static int rightInsertion_Problem_0_aeb9d920_f4c5_4b58_95df_36e9c7f2a6c1(ArrayList<Integer> a, int x) {
        int i = 0;
        while(i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int rightInsertion_Problem_2_b2b7d3e7_978d_4971_9631_c65894ea39ee(ArrayList<Integer> a, int x) {
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

    
    public static int rightInsertion_Problem_1_9782cae1_001f_44aa_97bb_bb0efb4c9899(ArrayList<Integer> a, int x) {
        int n = a.size();
        int i = 0;
        while (i < n && a.get(i) <= x) {
            i++;
        }
        if (i == n) return -1;
        while (i > 0 && a.get(i) > x) {
            i--;
        }
        return i;
    }

    
    public static int rightInsertion_Problem_1_cd14bcdb_c31c_4bbc_b795_c99f423d0c6b(ArrayList<Integer> a, int x) {
        int start = 0, end = a.size() - 1;
        while (start < end) {
            int mid = (start + end) / 2;
            if (x < a.get(mid)) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

    
    public static int rightInsertion_Problem_2_e25e8f3d_f296_4f01_ba41_0aee50cc98f4(ArrayList<Integer> a, int x) {
        int i = Collections.binarySearch(a, x);
        if (i <= 0) return 0;
        return i - 1;
    }

    
    public static int rightInsertion_Problem_0_05dba66b_995a_4cfc_abec_44e6aad042e8(ArrayList<Integer> a, int x) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int index = -1;
        for (int i = 0; i < a.size(); i++) {
            int val =  (a.get(i));
            if (val < min) {
                min = val;
            }
            if (val > max) {
                max = val;
            }
            if (val == x) {
                index = i;
            }
        }
        if (index == -1) {
            return -1;
        }
        return (index + 1);
    }

    
    public static int rightInsertion_Problem_2_1d05f17d_2b95_4b80_b208_b8cfdb3b470f(ArrayList<Integer> a, int x) {
        return  Math.floor((a.size() - 1) * Math.random() + 1);
    }

    
    public static int rightInsertion_Problem_2_4380be5e_b7b8_4ddf_b821_37e777287aa8(ArrayList<Integer> a, int x) {
        if(x < a.get(0))
            return 0;
        if(x == a.get(0))
            return a.size();
        for(int i = 1; i < a.size(); i++) {
            if(x == a.get(i))
                return i;
            if(x < a.get(i))
                return i;
        }
        return a.size();
    }

    
    public static int rightInsertion_Problem_2_424a4d74_bb06_41a3_9ef2_43c4c14345d6(ArrayList<Integer> a, int x) {
        int low = 0;
        int high = a.size();
        while (low < high) {
            int mid = (low + high) / 2;
            if (x == a.get(mid)) {
                return mid;
            } else if (x < a.get(mid)) {
                low = mid+1;
            } else {
                high = mid-1;
            }
        }
        return -1;
    }

    
    public static int rightInsertion_Problem_1_b2b7d3e7_978d_4971_9631_c65894ea39ee(ArrayList<Integer> a, int x) {
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

    
    public static int rightInsertion_Problem_1_01596225_23b9_48ed_abaf_91ecb929249a(ArrayList<Integer> a, int x) {
        for(int i = 0; i < a.size(); i++) {
            if(a.get(i) >= x) {
                return i;
            }
        }
        return -1;
    }

    
    public static int rightInsertion_Problem_0_8bd6e1d8_6d34_4eb1_9f74_2ebb5b473ef0(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int rightInsertion_Problem_1_f5215c3e_15c3_47ab_875c_027898a0ba21(ArrayList<Integer> a, int x) {
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

    
    public static int rightInsertion_Problem_1_8bd6e1d8_6d34_4eb1_9f74_2ebb5b473ef0(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int rightInsertion_Problem_2_ced5cda9_6307_479d_bd79_63b681f5f039(ArrayList<Integer> a, int x) {
        int low = 0;
        int high = a.size() - 1;
        while (low <= high) {
            int mid = (low + high) >>> 1;
            if (a.get(mid) > x) {
                low = mid + 1;
            } else if (a.get(mid) < x) {
                high = mid - 1;
            } else {
                low = mid + 1;
                high = mid - 1;
            }
        }
        return low;
    }

    
    public static int rightInsertion_Problem_2_f62806c9_1d17_4bc3_a2d2_1a7e7c6bc0c0(ArrayList<Integer> a, int x) {
        return Collections.binarySearch(a, x);
    }

    
    public static int rightInsertion_Problem_1_5f6130f8_eb53_454f_8da8_2f6aa366ed00(ArrayList<Integer> a, int x) {
        // base case
        if (a.contains(x)) {
            return a.indexOf(x);
        }
        if (a.isEmpty()) {
            return -1;
        }
        // recursion
        int rightPoint = a.size() - 1;
        int lowPoint = rightPoint - 1;
        while (!a.contains(lowPoint)) {
            lowPoint--;
        }
        while (!a.contains(rightPoint)) {
            rightPoint++;
        }
        return a.indexOf(lowPoint) + 1;
    }

    
    public static int rightInsertion_Problem_0_79fbdbfa_cdf6_467d_82f8_f4058169d59a(ArrayList<Integer> a, int x) {
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

    
    public static int rightInsertion_Problem_1_f895268a_297a_4413_aec1_b7638acdba6b(ArrayList<Integer> a, int x) {
        int last = 0;
        int pos = 0;
        for(pos = 0; pos < a.size(); pos++) {
            if(a.get(pos) > x) {
                break;
            }
            last = pos;
        }
        if(pos == a.size()) {
            pos = 0;
        }
        if(a.get(pos) == x) {
            return pos;
        }
        int nextpos = pos + 1;
        while(nextpos < a.size()) {
            if(a.get(nextpos) < x) {
                break;
            }
            nextpos++;
        }
        if(nextpos == a.size()) {
            nextpos = 0;
        }
        return last;
    }

    
    public static int rightInsertion_Problem_2_ce4772ec_04a3_4f42_998f_6551d796cd3b(ArrayList<Integer> a, int x) {
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

    
    public static int rightInsertion_Problem_1_b17483fb_9fef_49eb_8f41_a84284af1144(ArrayList<Integer> a, int x) {
        // Write your code here.
        
        for(int i = a.size(); i > 0; i--){
            if(a.get(i) < x){
                a.add(i-1, x);
                
            }
            if(a.get(i) == x){
                return i;
            }
            if(a.get(i) > x){
                a.add(i-1, x);
                
            }
            if(a.get(i) == x && i > 0){
                return i;
            }
        }
        
        
        return -1;
    }

    
    public static int rightInsertion_Problem_2_ae723e7a_a936_47be_a75b_dbed4e838f80(ArrayList<Integer> a, int x) {
        int pos = 0;
        int last = a.get(0);
        for (int i = 1; i < a.size(); i++) {
            int cur = a.get(i);
            if (cur < last)
                pos = i + 1;
            last = cur;
        }
        return pos;
    }

    
    public static int rightInsertion_Problem_1_01596225_23b9_48ed_abaf_91ecb929249a(ArrayList<Integer> a, int x) {
        for(int i = 0; i < a.size(); i++) {
            if(a.get(i) >= x) {
                return i;
            }
        }
        return -1;
    }

    
    public static int rightInsertion_Problem_1_48e33c26_a463_46d4_a9ea_b9e904a07fe6(ArrayList<Integer> a, int x) {
        int i = 0;
        while(i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int rightInsertion_Problem_2_cd14bcdb_c31c_4bbc_b795_c99f423d0c6b(ArrayList<Integer> a, int x) {
        int start = 0, end = a.size() - 1;
        while (start < end) {
            int mid = (start + end) / 2;
            if (x < a.get(mid)) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

    
    public static int rightInsertion_Problem_0_e7222d0f_33a9_4785_983f_ab6376b4cdad(ArrayList<Integer> a, int x) {
        int position = 0;
        for (int i = 0; i < a.size() - 1; i++) {
            if (a.get(i) > x) {
                position++;
            }
        }
        return position;
    }

    
    public static int rightInsertion_Problem_2_f895268a_297a_4413_aec1_b7638acdba6b(ArrayList<Integer> a, int x) {
        int last = 0;
        int pos = 0;
        for(pos = 0; pos < a.size(); pos++) {
            if(a.get(pos) > x) {
                break;
            }
            last = pos;
        }
        if(pos == a.size()) {
            pos = 0;
        }
        if(a.get(pos) == x) {
            return pos;
        }
        int nextpos = pos + 1;
        while(nextpos < a.size()) {
            if(a.get(nextpos) < x) {
                break;
            }
            nextpos++;
        }
        if(nextpos == a.size()) {
            nextpos = 0;
        }
        return last;
    }

    
    public static int rightInsertion_Problem_1_e35d0773_d7de_4963_ab76_ba1d3ef9fc6b(ArrayList<Integer> a, int x) {
        // write your code
        return 0;
    }

    
    public static int rightInsertion_Problem_0_8752abcb_3afc_43d4_9636_cc025cb86b81(ArrayList<Integer> a, int x) {
        int insertionPoint = -1; // Assume failure
        for(int i = 1; i < a.size(); i++) {
            if(a.get(i) > x) {
                insertionPoint = i;
                break;
            }
        }
        return insertionPoint;
    }

    
    public static int rightInsertion_Problem_1_9782cae1_001f_44aa_97bb_bb0efb4c9899(ArrayList<Integer> a, int x) {
        int n = a.size();
        int i = 0;
        while (i < n && a.get(i) <= x) {
            i++;
        }
        if (i == n) return -1;
        while (i > 0 && a.get(i) > x) {
            i--;
        }
        return i;
    }

    
    public static int rightInsertion_Problem_2_d30623f4_d4f6_43b7_bc37_7ab29906f5c1(ArrayList<Integer> a, int x) {
        // TODO: Implement me!
        ArrayList<Integer> temp = new ArrayList<Integer>(a);
        int index = Collections.binarySearch(temp, x) - 1;
        return index;
    }

    
    public static int rightInsertion_Problem_2_8cc95de4_dba1_4f58_8757_c549af060bc2(ArrayList<Integer> a, int x) {
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

    
    public static int rightInsertion_Problem_1_4232967e_a8af_4edb_9e78_6370f82f25ae(ArrayList<Integer> a, int x) {
        int i = 0;
        while(i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int rightInsertion_Problem_1_48c3be70_f516_4319_bb03_8f891871f94a(ArrayList<Integer> a, int x) {
        int lo = 0;
        int hi = a.size();
        while (hi > lo) {
            int mid = lo + (hi - lo) / 2;
            if (a.get(mid) <= x) lo = mid;
            else hi = mid;
        }
        return lo;
    }

    
    public static int rightInsertion_Problem_2_79fbdbfa_cdf6_467d_82f8_f4058169d59a(ArrayList<Integer> a, int x) {
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

    
    public static int rightInsertion_Problem_2_680b4d5e_dab3_483f_ad44_aba90a090af5(ArrayList<Integer> a, int x) {
        return Collections.binarySearch(a, x);
    }

    
    public static int rightInsertion_Problem_1_f8a89db6_bd78_444f_be99_44fb40d5a423(ArrayList<Integer> a, int x) {
        // Your code goes here!
        
        
        return -1;
    }

    
    public static int rightInsertion_Problem_0_48c3be70_f516_4319_bb03_8f891871f94a(ArrayList<Integer> a, int x) {
        int lo = 0;
        int hi = a.size();
        while (hi > lo) {
            int mid = lo + (hi - lo) / 2;
            if (a.get(mid) <= x) lo = mid;
            else hi = mid;
        }
        return lo;
    }

    
    public static int rightInsertion_Problem_1_0a026104_a898_42c9_ab40_0f57aeac233b(ArrayList<Integer> a, int x) {
        int low = 0;
        int high = a.size()-1;
        while (low <= high) {
            int mid = (low + high)/2;
            if (x > a.get(mid))
                low = mid + 1;
            else if (x < a.get(mid))
                high = mid - 1;
            else
                return mid;
        }
        return low;
    }

    
    public static int rightInsertion_Problem_1_f757e088_b942_4256_bef6_73b4c9ec165e(ArrayList<Integer> a, int x) {
        int lo = 0;
        int hi = a.size() - 1;

        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if (a.get(mid) == x)
                return mid;
            if (x < a.get(mid))
                lo = mid + 1;
            else
                hi = mid - 1;
        }

        return lo;
    }

    
    public static int rightInsertion_Problem_2_2197fa6c_abeb_4e29_ac8f_e79bf6872da3(ArrayList<Integer> a, int x) {
        int low = 0, high = a.size() - 1;
        while (low <= high) {
            int mid = (low + high) >>> 1;
            int midVal = a.get(mid);
            if (midVal < x) {
                low = mid + 1;
            } else if (midVal > x) {
                high = mid - 1;
            } else {
                return mid; // Found
            }
        }
        return high + 1; // not found
    }

    
    public static int rightInsertion_Problem_0_b2102f2f_5d7e_400b_8725_870f0c037997(ArrayList<Integer> a, int x) {
        int pos = 0;
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) <= x) {
                pos = i;
                break;
            }
        }
        return pos;
    }

    
    public static int rightInsertion_Problem_0_985e47a7_448b_4e5d_a483_e9e9f8c7022b(ArrayList<Integer> a, int x) {
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

    
    public static int rightInsertion_Problem_1_6f443a1e_1a41_4c03_88f0_71034a1936d2(ArrayList<Integer> a, int x) {
        if (a.size()==0)
            return -1;
        int n = a.size();
        for (int i=0; i<n; i++) {
            int y = a.get(i);
            if (x < y) {
                int r = rightInsertion_Problem_1_6f443a1e_1a41_4c03_88f0_71034a1936d2(a, x);
                if (r==-1)
                    return i;
                else
                    return r-1;
            }
            if (x==y) {
                return i;
            }
        }
        return -1;
    }

    
    public static int rightInsertion_Problem_2_c30a3062_8efe_48eb_b76d_6a35a687349e(ArrayList<Integer> a, int x) {
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

    
    public static int rightInsertion_Problem_1_b9ba9bfd_9cad_45fb_8cde_035a495ba1e3(ArrayList<Integer> a, int x) {
        int high = a.get(0);
        int low = a.get(0);
        int mid = high / 2;
        while(low < high) {
            mid = low + ((high - low) / 2);
            if (mid > x) {
                high = mid - 1;
            }
            else if (mid < x) {
                low = mid + 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }

    
    public static int rightInsertion_Problem_2_4cffcaa1_bd0f_4a73_8a08_2d571f53c731(ArrayList<Integer> a, int x) {
        if (a == null || a.isEmpty()) return 0;
        int left = 0;
        int right = a.size() - 1;
        while ((left < right) && (a.get(left) <= x)) {
            left++;
        }
        while ((left < right) && (a.get(right) >= x)) {
            right--;
        }
        if (left == right) return left;
        return right + 1;
    }

    
    public static int rightInsertion_Problem_0_109483c7_1e70_465e_b649_5c3b76b2e1db(ArrayList<Integer> a, int x) {
        ArrayList<Integer> a2 = new ArrayList<>(a);
        ArrayList<Integer> a3 = new ArrayList<>(a2);
        int insertionPoint = 0;
        for(int i=0; i < a3.size() - 1; i++) {
            if(a3.get(i) < x && a3.get(i+1) > x) {
                insertionPoint = i;
                break;
            }
        }
        a3.remove(insertionPoint);
        a3.add(0, x);
        a3.add(insertionPoint+1, x);
        return a3.stream().mapToInteger(Integer::intValue).sum();
    }

    
    public static int rightInsertion_Problem_2_cd14bcdb_c31c_4bbc_b795_c99f423d0c6b(ArrayList<Integer> a, int x) {
        int start = 0, end = a.size() - 1;
        while (start < end) {
            int mid = (start + end) / 2;
            if (x < a.get(mid)) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

    
    public static int rightInsertion_Problem_0_109483c7_1e70_465e_b649_5c3b76b2e1db(ArrayList<Integer> a, int x) {
        ArrayList<Integer> a2 = new ArrayList<>(a);
        ArrayList<Integer> a3 = new ArrayList<>(a2);
        int insertionPoint = 0;
        for(int i=0; i < a3.size() - 1; i++) {
            if(a3.get(i) < x && a3.get(i+1) > x) {
                insertionPoint = i;
                break;
            }
        }
        a3.remove(insertionPoint);
        a3.add(0, x);
        a3.add(insertionPoint+1, x);
        return a3.stream().mapToInteger(Integer::intValue).sum();
    }

    
    public static int rightInsertion_Problem_1_680b4d5e_dab3_483f_ad44_aba90a090af5(ArrayList<Integer> a, int x) {
        return Collections.binarySearch(a, x);
    }

    
    public static int rightInsertion_Problem_0_c37b8d59_f285_4589_a8f4_9aa3f91888db(ArrayList<Integer> a, int x) {
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

    
    public static int rightInsertion_Problem_1_d31344d7_3e04_4c6f_97cc_eb3f56c27084(ArrayList<Integer> a, int x) {
        return -1;
    }

    
    public static int rightInsertion_Problem_0_ed1b41df_c8d2_4b72_baa4_09006eedefe0(ArrayList<Integer> a, int x) {
        int i = 0;
        while(i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int rightInsertion_Problem_0_f757e088_b942_4256_bef6_73b4c9ec165e(ArrayList<Integer> a, int x) {
        int lo = 0;
        int hi = a.size() - 1;

        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if (a.get(mid) == x)
                return mid;
            if (x < a.get(mid))
                lo = mid + 1;
            else
                hi = mid - 1;
        }

        return lo;
    }

    
    public static int rightInsertion_Problem_0_f8a89db6_bd78_444f_be99_44fb40d5a423(ArrayList<Integer> a, int x) {
        // Your code goes here!
        
        
        return -1;
    }

    
    public static int rightInsertion_Problem_1_e7222d0f_33a9_4785_983f_ab6376b4cdad(ArrayList<Integer> a, int x) {
        int position = 0;
        for (int i = 0; i < a.size() - 1; i++) {
            if (a.get(i) > x) {
                position++;
            }
        }
        return position;
    }

    
    public static int rightInsertion_Problem_2_139828a8_9c70_4983_b3fb_f056b23493d6(ArrayList<Integer> a, int x) {
        int i = 0;
        while(i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int rightInsertion_Problem_0_dbe42a85_4a93_4542_8a71_03ef1729e7bd(ArrayList<Integer> a, int x) {
        int lo = 0;
        int hi = a.size() - 1;
        while (lo < hi) {
            int mid = (lo + hi) >>> 1;
            int midVal = a.get(mid);
            if (midVal < x) lo = mid;
            else if (midVal > x) hi = mid;
            else return mid;
        }
        return lo;
    }

    
    public static int rightInsertion_Problem_2_1e2d57b9_1515_4b9e_a811_3b9f2cef0048(ArrayList<Integer> a, int x) {
        int rightIndex = 0; // index to left end of subarray
        for (int i = 0; i < a.size(); i++) { // find the right index of subarray
            if (a.get(i) >= x) { // if a number larger than x
                rightIndex = i;
                break;
            }
        }
        int leftIndex = rightIndex; // index of left end of subarray
        for (int j = rightIndex + 1; j < a.size(); j++) { // find the left index of subarray
            if (a.get(j) < x) { // if a number smaller than x
                leftIndex = j;
                break;
            }
        }
        return (rightIndex - leftIndex); // return the right index of subarray
    }

    
    public static int rightInsertion_Problem_1_3676a652_60af_4431_8dcf_a2dcb64dac16(ArrayList<Integer> a, int x) {
        int count = 0;
        for(int i=0; i<a.size(); i++) {
            if(a.get(i) > x) count++;
        }
        return a.size() + count; // return last index + number of items greater than x
    }

    
    public static int rightInsertion_Problem_2_3676a652_60af_4431_8dcf_a2dcb64dac16(ArrayList<Integer> a, int x) {
        int count = 0;
        for(int i=0; i<a.size(); i++) {
            if(a.get(i) > x) count++;
        }
        return a.size() + count; // return last index + number of items greater than x
    }

    
    public static int rightInsertion_Problem_0_8bd6e1d8_6d34_4eb1_9f74_2ebb5b473ef0(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int rightInsertion_Problem_1_ff019265_a6f6_415e_adcd_9b11a7232007(ArrayList<Integer> a, int x) {
        // Write your code here
        if (x <= a.get(0)){
            return 0;
        }
        int l = 0;
        int r = a.size() - 1;
        while(r >= l){
            int mid = l + (r - l)/2;
            if (mid > x){
                r = mid - 1;
            }
            else{
                l = mid;
            }
        }
        return l;
    }

    
    public static int rightInsertion_Problem_2_4d3b1af3_5b91_45c9_8a74_19a269c549cf(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int rightInsertion_Problem_1_936215fc_39e3_4904_8504_8897ab2f8571(ArrayList<Integer> a, int x) {
        if (a.size() == 0) {
            return -1;
        }
        if (a.get(a.size() - 1) < x) {
            return a.size();
        }
        // If x > a[size() - 1], then search for the right position
        int idx = 1;
        while (idx < a.size() && x > a.get(idx)) {
            idx++;
        }
        if (idx < a.size()) {
            int j = idx - 1;
            while (j >= 0 && x > a.get(j)) {
                j--;
            }
            return j + 1;
        }
        return -1;
    }

    
    public static int rightInsertion_Problem_2_0a026104_a898_42c9_ab40_0f57aeac233b(ArrayList<Integer> a, int x) {
        int low = 0;
        int high = a.size()-1;
        while (low <= high) {
            int mid = (low + high)/2;
            if (x > a.get(mid))
                low = mid + 1;
            else if (x < a.get(mid))
                high = mid - 1;
            else
                return mid;
        }
        return low;
    }

    
    public static int rightInsertion_Problem_2_e66b0ba0_5cdb_4d1e_845b_dba652ec41a2(ArrayList<Integer> a, int x) {
        if (x >= a.get(0)) {
            return 0;
        }
        if (a.get(0) == x || x > a.get(a.size() - 1)) {
            return a.size() - 1;
        }
        int lo = 0, hi = a.size() - 1;
        while(lo <= hi) {
            int mid = (lo + hi) / 2;
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

    
    public static int rightInsertion_Problem_0_c37b8d59_f285_4589_a8f4_9aa3f91888db(ArrayList<Integer> a, int x) {
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

    
    public static int rightInsertion_Problem_1_0a026104_a898_42c9_ab40_0f57aeac233b(ArrayList<Integer> a, int x) {
        int low = 0;
        int high = a.size()-1;
        while (low <= high) {
            int mid = (low + high)/2;
            if (x > a.get(mid))
                low = mid + 1;
            else if (x < a.get(mid))
                high = mid - 1;
            else
                return mid;
        }
        return low;
    }

    
    public static int rightInsertion_Problem_0_0a026104_a898_42c9_ab40_0f57aeac233b(ArrayList<Integer> a, int x) {
        int low = 0;
        int high = a.size()-1;
        while (low <= high) {
            int mid = (low + high)/2;
            if (x > a.get(mid))
                low = mid + 1;
            else if (x < a.get(mid))
                high = mid - 1;
            else
                return mid;
        }
        return low;
    }

    
    public static int rightInsertion_Problem_1_b2b7d3e7_978d_4971_9631_c65894ea39ee(ArrayList<Integer> a, int x) {
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

    
    public static int rightInsertion_Problem_1_25833fc9_1259_45d2_9d0e_79860da15f97(ArrayList<Integer> a, int x) {
        int i = 0;
        while(i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int rightInsertion_Problem_0_d30735e0_bdfc_435e_9fdb_f532e94d59bb(ArrayList<Integer> a, int x) {
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

    
    public static int rightInsertion_Problem_1_78011b89_880a_4779_ac72_cd0ac5a9f5dc(ArrayList<Integer> a, int x) {
        int low = a.get(0);
        int high = a.get(0);
        int mid = 0;
        for (int i: a) {
            if (i == x) {
                return mid;
            }
            if (i < x) {
                low = i;
            } else {
                high = i;
            }
            mid = (low + high) / 2;
        }
        return mid;
    }

    
    public static int rightInsertion_Problem_1_dbe42a85_4a93_4542_8a71_03ef1729e7bd(ArrayList<Integer> a, int x) {
        int lo = 0;
        int hi = a.size() - 1;
        while (lo < hi) {
            int mid = (lo + hi) >>> 1;
            int midVal = a.get(mid);
            if (midVal < x) lo = mid;
            else if (midVal > x) hi = mid;
            else return mid;
        }
        return lo;
    }

    
    public static int rightInsertion_Problem_2_de7a74c5_ae31_40cf_a5fe_a0a811dd9733(ArrayList<Integer> a, int x) {
        int lo = 0, hi = a.size() - 1;
        while (lo < hi && a.get(lo) <= x) {
            lo++;
        }
        while (lo < hi && a.get(hi) > x) {
            hi--;
        }
        if (lo == hi) {
            return lo;
        }
        return a.size();
    }

    
    public static int rightInsertion_Problem_0_b9ba9bfd_9cad_45fb_8cde_035a495ba1e3(ArrayList<Integer> a, int x) {
        int high = a.get(0);
        int low = a.get(0);
        int mid = high / 2;
        while(low < high) {
            mid = low + ((high - low) / 2);
            if (mid > x) {
                high = mid - 1;
            }
            else if (mid < x) {
                low = mid + 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }

    
    public static int rightInsertion_Problem_0_aeb9d920_f4c5_4b58_95df_36e9c7f2a6c1(ArrayList<Integer> a, int x) {
        int i = 0;
        while(i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int rightInsertion_Problem_1_105b3361_b557_457c_b71f_a31c2459b281(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int rightInsertion_Problem_1_dbe42a85_4a93_4542_8a71_03ef1729e7bd(ArrayList<Integer> a, int x) {
        int lo = 0;
        int hi = a.size() - 1;
        while (lo < hi) {
            int mid = (lo + hi) >>> 1;
            int midVal = a.get(mid);
            if (midVal < x) lo = mid;
            else if (midVal > x) hi = mid;
            else return mid;
        }
        return lo;
    }

    
    public static int rightInsertion_Problem_2_d30735e0_bdfc_435e_9fdb_f532e94d59bb(ArrayList<Integer> a, int x) {
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

    
    public static int rightInsertion_Problem_2_b2b7d3e7_978d_4971_9631_c65894ea39ee(ArrayList<Integer> a, int x) {
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

    
    public static int rightInsertion_Problem_1_2197fa6c_abeb_4e29_ac8f_e79bf6872da3(ArrayList<Integer> a, int x) {
        int low = 0, high = a.size() - 1;
        while (low <= high) {
            int mid = (low + high) >>> 1;
            int midVal = a.get(mid);
            if (midVal < x) {
                low = mid + 1;
            } else if (midVal > x) {
                high = mid - 1;
            } else {
                return mid; // Found
            }
        }
        return high + 1; // not found
    }

    
    public static int rightInsertion_Problem_2_054f9d20_e54e_4a63_9ddf_90148b5d9435(ArrayList<Integer> a, int x) {
        int i = 0;
        while(i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int rightInsertion_Problem_2_680b4d5e_dab3_483f_ad44_aba90a090af5(ArrayList<Integer> a, int x) {
        return Collections.binarySearch(a, x);
    }

    
    public static int rightInsertion_Problem_1_936215fc_39e3_4904_8504_8897ab2f8571(ArrayList<Integer> a, int x) {
        if (a.size() == 0) {
            return -1;
        }
        if (a.get(a.size() - 1) < x) {
            return a.size();
        }
        // If x > a[size() - 1], then search for the right position
        int idx = 1;
        while (idx < a.size() && x > a.get(idx)) {
            idx++;
        }
        if (idx < a.size()) {
            int j = idx - 1;
            while (j >= 0 && x > a.get(j)) {
                j--;
            }
            return j + 1;
        }
        return -1;
    }

    
    public static int rightInsertion_Problem_0_f8a89db6_bd78_444f_be99_44fb40d5a423(ArrayList<Integer> a, int x) {
        // Your code goes here!
        
        
        return -1;
    }

    
    public static int rightInsertion_Problem_1_aeb9d920_f4c5_4b58_95df_36e9c7f2a6c1(ArrayList<Integer> a, int x) {
        int i = 0;
        while(i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int rightInsertion_Problem_2_139828a8_9c70_4983_b3fb_f056b23493d6(ArrayList<Integer> a, int x) {
        int i = 0;
        while(i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int rightInsertion_Problem_1_f62806c9_1d17_4bc3_a2d2_1a7e7c6bc0c0(ArrayList<Integer> a, int x) {
        return Collections.binarySearch(a, x);
    }

    
    public static int rightInsertion_Problem_1_4d3b1af3_5b91_45c9_8a74_19a269c549cf(ArrayList<Integer> a, int x) {
        int i = 0;
        while (i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

    
    public static int rightInsertion_Problem_0_f62806c9_1d17_4bc3_a2d2_1a7e7c6bc0c0(ArrayList<Integer> a, int x) {
        return Collections.binarySearch(a, x);
    }

    
    public static int rightInsertion_Problem_1_139828a8_9c70_4983_b3fb_f056b23493d6(ArrayList<Integer> a, int x) {
        int i = 0;
        while(i < a.size() && a.get(i) < x) {
            i++;
        }
        return i;
    }

}
