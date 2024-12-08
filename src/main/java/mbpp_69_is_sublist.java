package mbpp_69_is_sublist;

public class mbpp_69_is_sublist {

    
    public static boolean isSublist_Problem_1_9250528c_815b_4fe8_b5b7_fbdc2026c37c(ArrayList<Integer> l, ArrayList<Integer> s) {
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> s1 = new ArrayList<>();
        for(Integer i : l) {
            l1.add(i);
        }
        for(Integer i : s) {
            s1.add(i);
        }
        boolean result = l1.containsAll(s1);
        return result;
    }

    
    public static boolean isSublist_Problem_0_5d10c96e_048b_4d29_b993_cb63de3bdc1b(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) return False;
        for (int i = 0; i < l.size() - s.size() + 1; i++) {
            if (l.get(i).equals(s.get(0))) {
                int j = 0;
                while (j < s.size() && l.get(i + j).equals(s.get(j))) {
                    j++;
                }
                if (j == s.size()) return True;
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_0_6f893130_b41e_4de3_8346_66dfe1a1f4e2(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < l.size() && j < s.size()) {
            if (l.get(i) == s.get(j)) {
                i++;
                j++;
                k++;
            } else if (l.get(i) < s.get(j)) {
                i++;
            } else {
                j++;
            }
        }
        return k == s.size();
    }

    
    public static boolean isSublist_Problem_2_21b63637_323d_4607_8c25_0fa8208f0645(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0, j = 0;
        while (i < l.size() && j < s.size()) {
            if (l.get(i) == s.get(j)) {
                i++;
                j++;
            } else {
                j++;
            }
        }
        return i == l.size();
    }

    
    public static boolean isSublist_Problem_1_53bb7d4e_2ac8_4674_a15d_6322bca1b83d(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0;
        int j = 0;
        while (i < l.size() && j < s.size()) {
            if (l.get(i) == s.get(j)) {
                i++;
                j++;
            } else if (l.get(i) < s.get(j)) {
                i++;
            } else {
                j++;
            }
        }
        return i == l.size() && j == s.size();
    }

    
    public static boolean isSublist_Problem_2_3dc7382a_105a_4343_bf4e_05b21288be98(ArrayList<Integer> l, ArrayList<Integer> s) {
        ArrayList<Integer> sublist = new ArrayList<>();
        for(Integer i : s) {
            for(Integer j : l) {
                if(i.equals(j)) {
                    sublist.add(i);
                }
            }
        }
        return sublist.equals(s);
    }

    
    public static boolean isSublist_Problem_2_af0921a2_8f33_4785_a4ef_f6d43ad209b1(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size())
            return False;
        for (int i = 0; i < l.size() - s.size() + 1; i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean isSublist_Problem_2_af0921a2_8f33_4785_a4ef_f6d43ad209b1 = True;
                for (int j = 0; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        isSublist_Problem_2_af0921a2_8f33_4785_a4ef_f6d43ad209b1 = False;
                        break;
                    }
                }
                if (isSublist_Problem_2_af0921a2_8f33_4785_a4ef_f6d43ad209b1)
                    return True;
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_2_dd74becb_8c2e_497a_80c0_92747524d002(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i < l.size() - s.size() + 1; i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean found = True;
                for (int j = 1; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        found = False;
                        break;
                    }
                }
                if (found) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_1_e99b20ee_8f63_4a23_a7a6_969ac3bce3a2(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (l.size() < s.size()) {
            return False;
        }
        for (int i = 0; i < l.size() - s.size() + 1; i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean isSublist_Problem_1_e99b20ee_8f63_4a23_a7a6_969ac3bce3a2 = True;
                for (int j = 0; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        isSublist_Problem_1_e99b20ee_8f63_4a23_a7a6_969ac3bce3a2 = False;
                        break;
                    }
                }
                if (isSublist_Problem_1_e99b20ee_8f63_4a23_a7a6_969ac3bce3a2) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_1_19964757_e378_41de_b4c3_82315fe95d29(ArrayList<Integer> l, ArrayList<Integer> s) {
        return l.stream().filter(x -> s.contains(x)).count() == s.size();
    }

    
    public static boolean isSublist_Problem_1_648f238c_a07e_4e3e_898c_58b842dd77c4(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < l.size() && j < s.size()) {
            if (l.get(i) == s.get(j)) {
                i++;
                j++;
                k++;
            } else if (l.get(i) < s.get(j)) {
                i++;
            } else {
                j++;
            }
        }
        return k == s.size();
    }

    
    public static boolean isSublist_Problem_2_eca1002e_8fa1_4814_9b74_7ba4f3034978(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_2_1a881533_0284_4000_aa94_33bd1ebeea11(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (l.size() < s.size()) {
            return False;
        }
        for (int i = 0; i < s.size(); i++) {
            if (l.get(i) != s.get(i)) {
                return False;
            }
        }
        return True;
    }

    
    public static boolean isSublist_Problem_0_9e6c4162_4c3d_4f23_963d_96304927b7f5(ArrayList<Integer> l, ArrayList<Integer> s) {
        ArrayList<Integer> sublist = s.stream().filter(el -> !l.contains(el)).collect(Collectors.toCollection(ArrayList::new));
        return l.stream().noneMatch(el -> sublist.contains(el));
    }

    
    public static boolean isSublist_Problem_2_2dccfb81_600c_47d4_9cc6_d3249e4b4a1a(ArrayList<Integer> l, ArrayList<Integer> s) {
        int size = l.size();
        int subsize = s.size();
        if (size != subsize) {
            return False;
        } else {
            ArrayList<Integer> temp = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                if (l.get(i) != s.get(i)) {
                    return False;
                }
            }
            return True;
        }
    }

    
    public static boolean isSublist_Problem_2_fa0549d6_9290_46c0_b86d_bd9429c4bf04(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0;
        int j = 0;
        while (i < l.size() && j < s.size()) {
            if (l.get(i) == s.get(j)) {
                i++;
                j++;
            } else {
                i = i + j;
                j = 0;
            }
        }
        return i == l.size() && j == s.size();
    }

    
    public static boolean isSublist_Problem_2_6328a28f_1b50_48fa_bfe6_8a6c9f6eb0ef(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0, j = 0;
        while (i < l.size() && j < s.size()) {
            if (l.get(i) == s.get(j)) {
                i++;
                j++;
            } else {
                j++;
            }
        }
        return i == l.size() && j == s.size();
    }

    
    public static boolean isSublist_Problem_0_990c26c9_0f4b_461e_9950_53d07403271b(ArrayList<Integer> l, ArrayList<Integer> s) {
        int n = l.size();
        int m = s.size();
        for (int i = 0; i <= n - m; i++) {
            int j;
            for (j = 0; j < m; j++) {
                if (l.get(i + j) != s.get(j)) {
                    break;
                }
            }
            if (j == m) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_0_9ad6a662_7858_48ad_9297_0af067054f9b(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_2_44dc0792_f6e7_4362_9c2b_ea47fe2bed8d(ArrayList<Integer> l, ArrayList<Integer> s) {
        List<Integer> al = new ArrayList<>();
        al.addAll(l.subList(1,l.size()));
        al.addAll(s.subList(1,s.size()));
        System.out.println(al);
        return al.containsAll(l);
    }

    
    public static boolean isSublist_Problem_0_4a32d7a5_e0ad_4d4d_9dab_82287c73eef7(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_2_77564c1d_6a22_4367_b893_3be92bc36722(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() > s.size()) return False;
        for(int i = 0; i < l.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_1_1b4cc0d7_230b_46e2_b877_2dfb48b8a01d(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_1_7cf383c6_aeba_4bd7_ab78_ecb9800338e8(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_1_039181dd_f569_4762_b242_2fa4fdd0c906(ArrayList<Integer> l, ArrayList<Integer> s) {
        Set<Integer> set = new HashSet<>();
        l.stream().forEach(v -> set.add(v));
        s.stream().forEach(v -> set.add(v));
        return set.size() == l.size();
    }

    
    public static boolean isSublist_Problem_0_028e88fd_2542_4a50_82e9_9fcc78734c5b(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_0_e87bd369_430f_480c_a1b1_065d7a6157b3(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i < l.size() - s.size() + 1; i++) {
            if (l.get(i).equals(s.get(0))) {
                int j = 1;
                for (; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        break;
                    }
                }
                if (j == s.size()) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_1_d81341e5_9025_401e_bc26_59dd0a0480b6(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() <= 1) {
            return True;
        }
        List<Integer> l1 = l.subList(0, l.size()-1);
        List<Integer> s1 = s.subList(0, s.size() - 1);
        return l1.equals(s1);
    }

    
    public static boolean isSublist_Problem_0_dadb0d7d_beb8_4008_b513_355b87b56614(ArrayList<Integer> l, ArrayList<Integer> s) {
        Set<Integer> set1 = new HashSet<Integer>(l);
        Set<Integer> set2 = new HashSet<Integer>(s);
        set1.retainAll(set2);
        return set1.isEmpty() == False;
    }

    
    public static boolean isSublist_Problem_0_4c209046_6e39_4293_b90a_6bdaaeb5a584(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(s.get(i) > l.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_1_29773024_5cd1_4a64_aafd_61be34a23812(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0;
        int j = 0;
        while (i < l.size() && j < s.size()) {
            if (l.get(i) == s.get(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        return i == l.size() && j == s.size();
    }

    
    public static boolean isSublist_Problem_0_a36f5d3b_0c29_4ea5_bb52_d8e749b568f7(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_0_8174225c_c6ff_40fb_a133_2fb722320839(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() > s.size()) return False;
        for(int i = 0; i < l.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_2_b702b4dd_3bd1_4dfd_b4ff_a4dd3b8631a6(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(s.size() > l.size()) {
            return False;
        }
        for(int i = 0; i <= l.size() - s.size(); i++) {
            if(l.get(i).equals(s.get(0))) {
                boolean isSublist_Problem_2_b702b4dd_3bd1_4dfd_b4ff_a4dd3b8631a6 = True;
                for(int j = 0; j < s.size(); j++) {
                    if(!l.get(i + j).equals(s.get(j))) {
                        isSublist_Problem_2_b702b4dd_3bd1_4dfd_b4ff_a4dd3b8631a6 = False;
                        break;
                    }
                }
                if(isSublist_Problem_2_b702b4dd_3bd1_4dfd_b4ff_a4dd3b8631a6) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_2_9ad6a662_7858_48ad_9297_0af067054f9b(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_1_eeb09666_6e6b_471e_860e_dbf39ff1c8e9(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_1_69b0963c_62a3_4fcf_bf34_9fc52e3b98dc(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) return False;
        for (int i = 0; i <= l.size() - s.size(); i++) {
            if (l.get(i).equals(s.get(0))) {
                int j = 0;
                for (; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) break;
                }
                if (j == s.size()) return True;
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_1_e339f743_01b0_4128_90d1_88c34d6fcd9e(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i < l.size() - s.size() + 1; i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean isSublist_Problem_1_e339f743_01b0_4128_90d1_88c34d6fcd9e = True;
                for (int j = 0; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        isSublist_Problem_1_e339f743_01b0_4128_90d1_88c34d6fcd9e = False;
                        break;
                    }
                }
                if (isSublist_Problem_1_e339f743_01b0_4128_90d1_88c34d6fcd9e) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_0_68a72de4_7465_4ebf_9e15_ba04af519880(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (l.size() < s.size()) return False;
        for (int i = 0; i < s.size(); i++) {
            if (l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_0_49d3bf62_daea_4b89_affa_01d83fb3897b(ArrayList<Integer> l, ArrayList<Integer> s) {
        // Write your code here
        try{
            Arrays.asList(s.toArray());
        }catch (Exception e){
            return False;
        }
        try{
            Arrays.asList(l.toArray());
        }catch (Exception e){
            return False;
        }
        return False;
    }

    
    public static boolean isSublist_Problem_0_5b926126_5fe0_49ee_8722_e4d3235bfee1(ArrayList<Integer> l, ArrayList<Integer> s) {
        return l.stream().anyMatch(i -> s.stream().anyMatch(j -> i.equals(j)));
    }

    
    public static boolean isSublist_Problem_0_2b3d7506_98e3_4b68_958d_4cf532023d30(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(s.get(i) != l.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_0_1a881533_0284_4000_aa94_33bd1ebeea11(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (l.size() < s.size()) {
            return False;
        }
        for (int i = 0; i < s.size(); i++) {
            if (l.get(i) != s.get(i)) {
                return False;
            }
        }
        return True;
    }

    
    public static boolean isSublist_Problem_0_15c00517_442b_490b_a360_5b8b037bccf3(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_2_1a072364_e6db_4ca9_8ad4_84f59ce3a051(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (l.size() < s.size()) {
            return False;
        }
        for (int i = 0; i < l.size() - s.size() + 1; i++) {
            if (l.subList(i, i + s.size()).equals(s)) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_0_123c3498_4d37_4c27_8cf8_48234c825e2c(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_0_be5e6cf3_da1a_471d_b23c_7d4a4079dc05(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i <= l.size() - s.size(); i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean found = True;
                for (int j = 0; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        found = False;
                        break;
                    }
                }
                if (found) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_1_be3c9e8b_bbe3_4808_a9d9_5e6d322cbbcf(ArrayList<Integer> l, ArrayList<Integer> s) {
        int n = l.size();
        int m = s.size();
        for (int i = 0; i <= n - m; i++) {
            int j;
            for (j = 0; j < m; j++) {
                if (l.get(i + j) != s.get(j)) {
                    break;
                }
            }
            if (j == m) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_2_2938fda2_ade7_4f89_b86a_d777d4fbeb96(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (l.size() < s.size()) return False;
        for (int i = 0; i < s.size(); i++) {
            if (l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_1_f55923ea_3112_49a1_a3d0_336f6e2d9b21(ArrayList<Integer> l, ArrayList<Integer> s) {
        boolean result = False;

        for(int i=0;i<l.size();i++) {
            for(int j=0;j<s.size();j++) {
                if(l.get(i) == s.get(j)) {
                    result = True;
                    break;
                }
            }
        }

        return result;
    }

    
    public static boolean isSublist_Problem_0_d3a361f6_65ec_40d4_9602_1fca67aadd11(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i < l.size() - s.size() + 1; i++) {
            boolean isSublist_Problem_0_d3a361f6_65ec_40d4_9602_1fca67aadd11 = True;
            for (int j = 0; j < s.size(); j++) {
                if (l.get(i + j) != s.get(j)) {
                    isSublist_Problem_0_d3a361f6_65ec_40d4_9602_1fca67aadd11 = False;
                    break;
                }
            }
            if (isSublist_Problem_0_d3a361f6_65ec_40d4_9602_1fca67aadd11) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_1_e4d49bed_fe1b_4ea2_bdca_29c5cb5828be(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0;
        int j = 0;
        int l_size = l.size();
        int s_size = s.size();
        while (i < l_size && j < s_size) {
            if (l.get(i) == s.get(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        return (i == l_size && j == s_size);
    }

    
    public static boolean isSublist_Problem_0_d81341e5_9025_401e_bc26_59dd0a0480b6(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() <= 1) {
            return True;
        }
        List<Integer> l1 = l.subList(0, l.size()-1);
        List<Integer> s1 = s.subList(0, s.size() - 1);
        return l1.equals(s1);
    }

    
    public static boolean isSublist_Problem_1_6e732b6b_6ef0_483a_a871_e620db647710(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_1_f46e5471_0342_4abd_8280_1ad1a5e8cc2f(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i <= l.size() - s.size(); i++) {
            if (l.get(i).equals(s.get(0))) {
                int j = 0;
                while (j < s.size() && l.get(i + j).equals(s.get(j))) {
                    j++;
                }
                if (j == s.size()) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_1_af0921a2_8f33_4785_a4ef_f6d43ad209b1(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size())
            return False;
        for (int i = 0; i < l.size() - s.size() + 1; i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean isSublist_Problem_1_af0921a2_8f33_4785_a4ef_f6d43ad209b1 = True;
                for (int j = 0; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        isSublist_Problem_1_af0921a2_8f33_4785_a4ef_f6d43ad209b1 = False;
                        break;
                    }
                }
                if (isSublist_Problem_1_af0921a2_8f33_4785_a4ef_f6d43ad209b1)
                    return True;
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_1_b8b8d04e_884a_4f3e_a8f2_02177b115330(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_1_0b799a35_64ad_4eb8_bd4a_8b986af5c7e1(ArrayList<Integer> l, ArrayList<Integer> s) {
        return l.stream().anyMatch(i -> s.contains(i));
    }

    
    public static boolean isSublist_Problem_1_e99b20ee_8f63_4a23_a7a6_969ac3bce3a2(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (l.size() < s.size()) {
            return False;
        }
        for (int i = 0; i < l.size() - s.size() + 1; i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean isSublist_Problem_1_e99b20ee_8f63_4a23_a7a6_969ac3bce3a2 = True;
                for (int j = 0; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        isSublist_Problem_1_e99b20ee_8f63_4a23_a7a6_969ac3bce3a2 = False;
                        break;
                    }
                }
                if (isSublist_Problem_1_e99b20ee_8f63_4a23_a7a6_969ac3bce3a2) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_1_29f636b7_ccc7_446e_a799_6b1c9a12e827(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (l.size() < s.size())
            return False;
        for(int i=0; i<s.size(); i++) {
            if (!l.contains(s.get(i)))
                return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_2_931a70c1_f575_4979_bd6f_e371a9a12d89(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_0_f0b753ef_dc76_43ab_aec6_fdc4eef377c4(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0;
        int j = 0;
        while (i < l.size() && j < s.size()) {
            if (l.get(i) == s.get(j)) {
                i++;
                j++;
            } else if (l.get(i) < s.get(j)) {
                i++;
            } else {
                j++;
            }
        }
        return i == l.size() && j == s.size();
    }

    
    public static boolean isSublist_Problem_1_984d5cb9_605f_445f_b5a5_74afcbff58e5(ArrayList<Integer> l, ArrayList<Integer> s) {
        boolean b = False;
        for (Integer aInteger : l) {
            if (s.contains(aInteger)) {
                b = True;
            }
        }
        return b;
    }

    
    public static boolean isSublist_Problem_0_9f0d67b7_5b8e_4738_833d_ed0dce21ebe2(ArrayList<Integer> l, ArrayList<Integer> s) {
        ArrayList<Integer> temp = new ArrayList<>();
        for(Integer i : l) {
            for(Integer j : s) {
                if(i == j) {
                    temp.add(i);
                }
            }
        }
        boolean result = temp.isEmpty();
        return result;
    }

    
    public static boolean isSublist_Problem_1_23f895e8_ed35_464a_bf99_5bbcf0850dd7(ArrayList<Integer> l, ArrayList<Integer> s) {
        boolean flag = False;
        ArrayList<Integer> result = new ArrayList<>();
        for(int i : l) {
            if(!s.contains(i))
                return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_0_4e981614_7eff_4b04_81ba_71594b054798(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (l.size() < s.size()) return False;
        for (int i = 0; i < s.size(); i++) {
            if (l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_1_1b625091_0042_40f3_8977_6d5f5c41f63c(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (l.size() < s.size()) {
            return False;
        }
        for (int i = 0; i < l.size() - s.size() + 1; i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean found = True;
                for (int j = 0; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        found = False;
                        break;
                    }
                }
                if (found) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_2_13c67539_1904_4bfd_b0da_39bed3e28435(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0;
        int j = 0;
        int k = 0;
        while(i < l.size() && j < s.size()) {
            if(l.get(i) == s.get(j)) {
                i++;
                j++;
                k++;
            }
            else if(l.get(i) > s.get(j)) {
                j++;
            }
            else {
                i++;
            }
        }
        return k == s.size();
    }

    
    public static boolean isSublist_Problem_0_7e35ec33_fed4_47f8_a66e_afccb9c4b11a(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        int i = 0;
        int j = 0;
        while (i < l.size() && j < s.size()) {
            if (l.get(i).equals(s.get(j))) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        return j == s.size();
    }

    
    public static boolean isSublist_Problem_1_16d4f32e_2891_4699_b9bd_c944a77134bc(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) return False;
        for (int i = 0; i < l.size() - s.size() + 1; i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean found = True;
                for (int j = 1; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        found = False;
                        break;
                    }
                }
                if (found) return True;
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_0_7401dd33_967a_4531_a5a9_a2308e35595f(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_0_1b625091_0042_40f3_8977_6d5f5c41f63c(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (l.size() < s.size()) {
            return False;
        }
        for (int i = 0; i < l.size() - s.size() + 1; i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean found = True;
                for (int j = 0; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        found = False;
                        break;
                    }
                }
                if (found) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_1_dd75e223_e73d_44db_9920_5eee3bf27b6b(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i <= l.size() - s.size(); i++) {
            if (l.get(i).equals(s.get(0))) {
                int j = 0;
                while (j < s.size() && l.get(i + j).equals(s.get(j))) {
                    j++;
                }
                if (j == s.size()) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_1_9d56c486_1776_47c7_acbb_ba8214ebab31(ArrayList<Integer> l, ArrayList<Integer> s) {
        boolean res = True;
        for (Integer i : s) {
            for (Integer j : l) {
                if (i == j) {
                    res = False;
                    break;
                }
            }
        }
        return res;
    }

    
    public static boolean isSublist_Problem_0_5efb342a_c9d6_4791_9057_0366e49d81ea(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() > s.size()) return False;
        for(int i = 0; i < l.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_1_1b625091_0042_40f3_8977_6d5f5c41f63c(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (l.size() < s.size()) {
            return False;
        }
        for (int i = 0; i < l.size() - s.size() + 1; i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean found = True;
                for (int j = 0; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        found = False;
                        break;
                    }
                }
                if (found) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_2_b6f53d05_b6da_430f_b239_adab87e082d0(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < l.size() && j < s.size()) {
            if (l.get(i) == s.get(j)) {
                i++;
                j++;
                k++;
            } else if (l.get(i) < s.get(j)) {
                i++;
            } else {
                j++;
            }
        }
        return k == s.size();
    }

    
    public static boolean isSublist_Problem_1_e4784f26_cac5_4fbb_8a1f_2ea48f8ec6f7(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0;
        int j = 0;
        int k = 0;
        int l_size = l.size();
        int s_size = s.size();
        while (i < l_size && j < s_size) {
            if (l.get(i) == s.get(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        if (i == l_size && j == s_size) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isSublist_Problem_1_eeb09666_6e6b_471e_860e_dbf39ff1c8e9(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_2_27136bf9_5474_4c7d_8aa1_ce10d5d2c99e(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (l.size() < s.size()) return False;
        for (int i = 0; i < s.size(); i++) {
            if (l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_2_1b4cc0d7_230b_46e2_b877_2dfb48b8a01d(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_1_dd74becb_8c2e_497a_80c0_92747524d002(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i < l.size() - s.size() + 1; i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean found = True;
                for (int j = 1; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        found = False;
                        break;
                    }
                }
                if (found) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_0_550b69d3_dc85_492b_beb8_fa734122e4b9(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_2_1a881533_0284_4000_aa94_33bd1ebeea11(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (l.size() < s.size()) {
            return False;
        }
        for (int i = 0; i < s.size(); i++) {
            if (l.get(i) != s.get(i)) {
                return False;
            }
        }
        return True;
    }

    
    public static boolean isSublist_Problem_2_cc9c279d_a3df_4527_8574_73033532f9c1(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_1_e87bd369_430f_480c_a1b1_065d7a6157b3(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i < l.size() - s.size() + 1; i++) {
            if (l.get(i).equals(s.get(0))) {
                int j = 1;
                for (; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        break;
                    }
                }
                if (j == s.size()) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_1_46a34473_f0eb_44c4_8342_21846eaeb790(ArrayList<Integer> l, ArrayList<Integer> s) {
        ArrayList<Integer> temp = new ArrayList<>();
        for(Integer i : l) {
            if(!temp.contains(i)) {
                temp.add(i);
            }
        }
        for(Integer i : s) {
            if(!temp.contains(i)) {
                return False;
            }
        }
        return True;
    }

    
    public static boolean isSublist_Problem_0_eca1002e_8fa1_4814_9b74_7ba4f3034978(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_1_de3e81df_d345_4bf5_b6e5_dc94ae43d843(ArrayList<Integer> l, ArrayList<Integer> s) {
        ArrayList<Integer> l1 = new ArrayList<>(l);
        ArrayList<Integer> s1 = new ArrayList<>(s);
        ArrayList<Integer> l2 = new ArrayList<>();
        ArrayList<Integer> s2 = new ArrayList<>();
        for(int i=0; i<l1.size(); i++) {
            l2.add(l1.get(i));
        }
        for(int i=0; i<s1.size(); i++) {
            s2.add(s1.get(i));
        }
        for(int i=0; i<l2.size(); i++) {
            if(s2.contains(l2.get(i))) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_1_92758852_112a_4f79_bf3f_8b6cf645523b(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < l.size() && j < s.size()) {
            if (l.get(i) == s.get(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        return i == l.size() && j == s.size();
    }

    
    public static boolean isSublist_Problem_1_a33aa094_066c_4b60_b51f_0fd2d35d38bf(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0, j = 0;
        while(i < l.size() && j < s.size()) {
            if(l.get(i) == s.get(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        return i == l.size() && j == s.size();
    }

    
    public static boolean isSublist_Problem_2_cf6a57af_e06a_48a7_a164_4c81f4d93cca(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) return False;
        for (int i = 0; i <= l.size() - s.size(); i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean found = True;
                for (int j = 1; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        found = False;
                        break;
                    }
                }
                if (found) return True;
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_0_a33aa094_066c_4b60_b51f_0fd2d35d38bf(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0, j = 0;
        while(i < l.size() && j < s.size()) {
            if(l.get(i) == s.get(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        return i == l.size() && j == s.size();
    }

    
    public static boolean isSublist_Problem_0_8714f178_f6f1_43eb_a384_44676418f8ab(ArrayList<Integer> l, ArrayList<Integer> s) {
        // Write your code here
        ArrayList<Integer> l1 = new ArrayList<Integer>();
        ArrayList<Integer> s1 = new ArrayList<Integer>();
        for(Integer i : l) {
            l1.add(i);
        }
        for(Integer i : s) {
            s1.add(i);
        }
        boolean flag = False;
        for(int i=0;i<l1.size();i++) {
            for(int j=0;j<s1.size();j++) {
                if(l1.get(i).equals(s1.get(j))) {
                    flag = True;
                    break;
                }
            }
        }
        return flag;
    }

    
    public static boolean isSublist_Problem_2_6da25625_0ad0_4d1a_89e1_a6bbac463f19(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0;
        int j = 0;
        while (i < l.size() && j < s.size()) {
            if (l.get(i) == s.get(j)) {
                i++;
                j++;
            } else {
                j++;
            }
        }
        return i == l.size();
    }

    
    public static boolean isSublist_Problem_1_cd958c5b_add7_4cc0_a1e9_290353dcf20c(ArrayList<Integer> l, ArrayList<Integer> s) {
        ArrayList<Integer> l1 = new ArrayList<>(l);
        ArrayList<Integer> s1 = new ArrayList<>(s);
        ArrayList<Integer> l2 = new ArrayList<>();
        ArrayList<Integer> s2 = new ArrayList<>();
        for(int i = 0; i < l.size(); i++) {
            l2.add(l.get(i));
        }
        for(int i = 0; i < s.size(); i++) {
            s2.add(s.get(i));
        }
        for(int i = 0; i < l1.size(); i++) {
            if(!s2.contains(l1.get(i))) {
                return False;
            }
        }
        return True;
    }

    
    public static boolean isSublist_Problem_2_b2ccaffd_8d43_426a_8535_2e10c11db08a(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i < l.size() - s.size() + 1; i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean found = True;
                for (int j = 0; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        found = False;
                        break;
                    }
                }
                if (found) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_0_831316a9_f9de_44cd_bd1e_cbb239a688b1(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (l.size() < s.size()) return False;
        for (int i = 0; i < l.size() - s.size() + 1; i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean found = True;
                for (int j = 0; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        found = False;
                        break;
                    }
                }
                if (found) return True;
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_2_98ca632b_6721_4f2f_9645_22d1d0c4e79f(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) return False;
        for (int i = 0; i < l.size(); i++) {
            if (l.get(i) == s.get(0)) {
                boolean found = True;
                for (int j = 0; j < s.size(); j++) {
                    if (i + j >= l.size() || l.get(i + j) != s.get(j)) {
                        found = False;
                        break;
                    }
                }
                if (found) return True;
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_2_e943792f_b615_45f5_8f5a_d83e79c404b8(ArrayList<Integer> l, ArrayList<Integer> s) {
        ArrayList<Integer> temp = new ArrayList<>();
        for(int i = 0; i < l.size(); i++) {
            for(int j = 0; j < s.size(); j++) {
                if(l.get(i) == s.get(j)) {
                    temp.add(l.get(i));
                }
            }
        }
        return temp.size() == s.size();
    }

    
    public static boolean isSublist_Problem_1_21b63637_323d_4607_8c25_0fa8208f0645(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0, j = 0;
        while (i < l.size() && j < s.size()) {
            if (l.get(i) == s.get(j)) {
                i++;
                j++;
            } else {
                j++;
            }
        }
        return i == l.size();
    }

    
    public static boolean isSublist_Problem_2_0b799a35_64ad_4eb8_bd4a_8b986af5c7e1(ArrayList<Integer> l, ArrayList<Integer> s) {
        return l.stream().anyMatch(i -> s.contains(i));
    }

    
    public static boolean isSublist_Problem_0_6e732b6b_6ef0_483a_a871_e620db647710(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_2_718898dc_a583_46c6_b70a_c0824001eb7e(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i <= l.size() - s.size(); i++) {
            if (l.get(i).equals(s.get(0))) {
                int j = 1;
                while (j < s.size() && l.get(i + j).equals(s.get(j))) {
                    j++;
                }
                if (j == s.size()) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_0_e25d225a_bc2b_4344_a503_be0e012e2fe9(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_2_a2b2a12d_6033_4070_ba5e_337b033cd888(ArrayList<Integer> l, ArrayList<Integer> s) {
        return l.size() == s.size() && l.containsAll(s);
    }

    
    public static boolean isSublist_Problem_1_8711275a_a953_48a3_ae22_82cd2900cbab(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i <= l.size() - s.size(); i++) {
            if (l.subList(i, i + s.size()).equals(s)) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_0_b8a59836_88e8_440f_9635_bcf14a77f206(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) return False;
        for (int i = 0; i <= l.size() - s.size(); i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean isSublist_Problem_0_b8a59836_88e8_440f_9635_bcf14a77f206 = True;
                for (int j = 0; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        isSublist_Problem_0_b8a59836_88e8_440f_9635_bcf14a77f206 = False;
                        break;
                    }
                }
                if (isSublist_Problem_0_b8a59836_88e8_440f_9635_bcf14a77f206) return True;
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_0_fa1dc739_7b6b_43eb_a565_5a1375dc5a64(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) return False;
        for (int i = 0; i < l.size() - s.size() + 1; i++) {
            if (l.get(i).equals(s.get(0))) {
                int j = 0;
                for (; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) break;
                }
                if (j == s.size()) return True;
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_1_caafa263_3af7_4dc8_9152_712fb52cdf8b(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(s.get(i) != l.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_2_893d5ecf_3402_4556_8ad3_3e1a6ec76325(ArrayList<Integer> l, ArrayList<Integer> s) {
        ArrayList<Integer> sublist = new ArrayList<>();
        for(Integer i : l) {
            for(Integer j : s) {
                if(i.equals(j)) {
                    sublist.add(i);
                    break;
                }
            }
        }
        return sublist.equals(s);
    }

    
    public static boolean isSublist_Problem_2_82166f31_561d_49bb_b487_0456d84074f0(ArrayList<Integer> l, ArrayList<Integer> s) {
        boolean result = False;
        for(int i = 0; i < l.size(); i++) {
            for(int j = 0; j < s.size(); j++) {
                if(l.get(i) == s.get(j)) {
                    result = True;
                    break;
                }
            }
        }
        return result;
    }

    
    public static boolean isSublist_Problem_1_20c690cb_640c_41ba_b935_1b4653ddff24(ArrayList<Integer> l, ArrayList<Integer> s) {
        return l.stream().anyMatch(i -> s.contains(i));
    }

    
    public static boolean isSublist_Problem_1_0e8b6fc2_3e87_476c_9a32_c734044ac125(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i <= l.size() - s.size(); i++) {
            if (l.subList(i, i + s.size()).equals(s)) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_2_84ab34bc_92ac_4c34_b6e6_8c56b40a7a4c(ArrayList<Integer> l, ArrayList<Integer> s) {
        boolean flag = False;
        if (s.isEmpty()) {
            return flag;
        }
        for (int i = 0; i < l.size() - s.size(); i++) {
            if (l.subList(i, i + s.size()).equals(s)) {
                flag = True;
            }
        }
        return flag;
    }

    
    public static boolean isSublist_Problem_0_101227d9_93b8_4da3_a95f_804bb0582974(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) return False;
        for (int i = 0; i < l.size() - s.size() + 1; i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean isSublist_Problem_0_101227d9_93b8_4da3_a95f_804bb0582974 = True;
                for (int j = 0; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        isSublist_Problem_0_101227d9_93b8_4da3_a95f_804bb0582974 = False;
                        break;
                    }
                }
                if (isSublist_Problem_0_101227d9_93b8_4da3_a95f_804bb0582974) return True;
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_1_3cd41338_ee26_482d_bb1d_9f466c1534c6(ArrayList<Integer> l, ArrayList<Integer> s) {
        boolean flag = False;
        for(int i = 0; i < l.size(); i++) {
            for(int j = 0; j < s.size(); j++) {
                if(l.get(i) == s.get(j)) {
                    flag = True;
                    break;
                }
            }
        }
        return flag;
    }

    
    public static boolean isSublist_Problem_1_d81341e5_9025_401e_bc26_59dd0a0480b6(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() <= 1) {
            return True;
        }
        List<Integer> l1 = l.subList(0, l.size()-1);
        List<Integer> s1 = s.subList(0, s.size() - 1);
        return l1.equals(s1);
    }

    
    public static boolean isSublist_Problem_0_a4dd864c_4405_4344_a1e9_b62f25f91053(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() > s.size()) return False;
        for(int i = 0; i < l.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_0_14fd2743_2df2_4793_b6dd_f7c2db4243d2(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < l.size() && j < s.size()) {
            if (l.get(i) == s.get(j)) {
                i++;
                j++;
            } else {
                j++;
            }
        }
        if (i == l.size()) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isSublist_Problem_0_eee8b2cc_b33e_4a22_9ad2_5176955d3184(ArrayList<Integer> l, ArrayList<Integer> s) {
        return l.stream().anyMatch(i -> s.contains(i));
    }

    
    public static boolean isSublist_Problem_2_5bfc1975_d66b_4e70_aefd_9f880e53d47f(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0;
        int j = 0;
        while (i < l.size() && j < s.size()) {
            if (l.get(i) == s.get(j)) {
                i++;
                j++;
            } else {
                j = 0;
            }
        }
        return i == l.size();
    }

    
    public static boolean isSublist_Problem_2_991f573a_5e91_437f_ada8_5a6482a323f8(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() > s.size()) return False;
        for(int i = 0; i < l.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_0_037b7496_618a_49a0_be6e_72fffe8932a6(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i <= l.size() - s.size(); i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean found = True;
                for (int j = 1; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        found = False;
                        break;
                    }
                }
                if (found) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_0_36421673_f5ae_4a7c_8b28_ec0a4608bb3f(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0, j = 0;
        while (i < l.size() && j < s.size()) {
            if (l.get(i) == s.get(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        return i == l.size() && j == s.size();
    }

    
    public static boolean isSublist_Problem_0_976624a0_0c8f_4d58_9a96_510490d7bc90(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i <= l.size() - s.size(); i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean flag = True;
                for (int j = 1; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        flag = False;
                        break;
                    }
                }
                if (flag) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_1_3e94bdd1_c32a_4b30_a365_d89a931e55a5(ArrayList<Integer> l, ArrayList<Integer> s) {
        int n = l.size();
        int m = s.size();
        for (int i = 0; i <= n - m; i++) {
            int j;
            for (j = 0; j < m; j++) {
                if (l.get(i + j) != s.get(j)) {
                    break;
                }
            }
            if (j == m) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_0_38995b30_3cf6_4f36_a9e1_c962adc9cad6(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size())
            return False;
        for (int i = 0; i <= l.size() - s.size(); i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean isSublist_Problem_0_38995b30_3cf6_4f36_a9e1_c962adc9cad6 = True;
                for (int j = 1; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        isSublist_Problem_0_38995b30_3cf6_4f36_a9e1_c962adc9cad6 = False;
                        break;
                    }
                }
                if (isSublist_Problem_0_38995b30_3cf6_4f36_a9e1_c962adc9cad6)
                    return True;
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_0_0e8b6fc2_3e87_476c_9a32_c734044ac125(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i <= l.size() - s.size(); i++) {
            if (l.subList(i, i + s.size()).equals(s)) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_0_e6399167_aca7_4ae0_9f10_138f669d4ff0(ArrayList<Integer> l, ArrayList<Integer> s) {
        ArrayList<Integer> sublist = new ArrayList<>();
        for(int i = 0; i < l.size(); i++) {
            for(int j = 0; j < s.size(); j++) {
                if(l.get(i) == s.get(j)) {
                    sublist.add(l.get(i));
                }
            }
        }
        return sublist.equals(s);
    }

    
    public static boolean isSublist_Problem_0_aef8d866_ae7d_424b_86cb_b447babeca9a(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0;
        int j = 0;
        while (i < l.size() && j < s.size()) {
            if (l.get(i) == s.get(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        return i == l.size() && j == s.size();
    }

    
    public static boolean isSublist_Problem_2_5d98ce10_ed8b_40f7_adde_4547d696ed2f(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) return False;
        for (int i = 0; i <= l.size() - s.size(); i++) {
            if (l.subList(i, i + s.size()).equals(s)) return True;
        }
        return False;
    }

    
    public static boolean isSublist_Problem_2_7cf5b57f_7990_4a30_aad7_30ea3e6ef6d1(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) return False;
        for (int i = 0; i < l.size() - s.size() + 1; i++) {
            if (l.subList(i, i + s.size()).equals(s)) return True;
        }
        return False;
    }

    
    public static boolean isSublist_Problem_0_af0921a2_8f33_4785_a4ef_f6d43ad209b1(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size())
            return False;
        for (int i = 0; i < l.size() - s.size() + 1; i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean isSublist_Problem_0_af0921a2_8f33_4785_a4ef_f6d43ad209b1 = True;
                for (int j = 0; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        isSublist_Problem_0_af0921a2_8f33_4785_a4ef_f6d43ad209b1 = False;
                        break;
                    }
                }
                if (isSublist_Problem_0_af0921a2_8f33_4785_a4ef_f6d43ad209b1)
                    return True;
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_2_66088db6_2417_4390_a7d1_cd9536b93636(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_1_11e6c338_3567_4fab_a641_342667aaf7ce(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) return False;
        for (int i = 0; i < l.size() - s.size() + 1; i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean isSublist_Problem_1_11e6c338_3567_4fab_a641_342667aaf7ce = True;
                for (int j = 0; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        isSublist_Problem_1_11e6c338_3567_4fab_a641_342667aaf7ce = False;
                        break;
                    }
                }
                if (isSublist_Problem_1_11e6c338_3567_4fab_a641_342667aaf7ce) return True;
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_1_0e0b028a_bc6d_4535_a417_eca332ac7d67(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_2_53bb7d4e_2ac8_4674_a15d_6322bca1b83d(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0;
        int j = 0;
        while (i < l.size() && j < s.size()) {
            if (l.get(i) == s.get(j)) {
                i++;
                j++;
            } else if (l.get(i) < s.get(j)) {
                i++;
            } else {
                j++;
            }
        }
        return i == l.size() && j == s.size();
    }

    
    public static boolean isSublist_Problem_1_62ecd39b_07f7_4daa_892d_6a43b92953b3(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_2_8425bb06_d28b_463c_9c6a_7b4db25a7221(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < l.size() && j < s.size()) {
            if (l.get(i) == s.get(j)) {
                i++;
                j++;
                k++;
            } else if (l.get(i) > s.get(j)) {
                j++;
            } else {
                i++;
            }
        }
        return k == s.size();
    }

    
    public static boolean isSublist_Problem_0_fde80c87_4417_4b1a_9f52_7054bb509dd6(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0, j = 0;
        while (i < l.size() && j < s.size()) {
            if (l.get(i) == s.get(j)) {
                i++;
                j++;
            } else {
                j = 0;
            }
        }
        return i == l.size();
    }

    
    public static boolean isSublist_Problem_0_cd958c5b_add7_4cc0_a1e9_290353dcf20c(ArrayList<Integer> l, ArrayList<Integer> s) {
        ArrayList<Integer> l1 = new ArrayList<>(l);
        ArrayList<Integer> s1 = new ArrayList<>(s);
        ArrayList<Integer> l2 = new ArrayList<>();
        ArrayList<Integer> s2 = new ArrayList<>();
        for(int i = 0; i < l.size(); i++) {
            l2.add(l.get(i));
        }
        for(int i = 0; i < s.size(); i++) {
            s2.add(s.get(i));
        }
        for(int i = 0; i < l1.size(); i++) {
            if(!s2.contains(l1.get(i))) {
                return False;
            }
        }
        return True;
    }

    
    public static boolean isSublist_Problem_2_6328a28f_1b50_48fa_bfe6_8a6c9f6eb0ef(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0, j = 0;
        while (i < l.size() && j < s.size()) {
            if (l.get(i) == s.get(j)) {
                i++;
                j++;
            } else {
                j++;
            }
        }
        return i == l.size() && j == s.size();
    }

    
    public static boolean isSublist_Problem_2_f6d643af_0e52_475d_a038_8900d870eeb8(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0;
        int j = 0;
        while (i < l.size() && j < s.size()) {
            if (l.get(i) == s.get(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        return i == l.size() && j == s.size();
    }

    
    public static boolean isSublist_Problem_0_4a32d7a5_e0ad_4d4d_9dab_82287c73eef7(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_0_0a0928ce_794b_480d_8ca8_a5d030f83173(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() > s.size()) return False;
        for(int i = 0; i < l.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_0_1f4026b1_a985_4ce6_bfa2_afb00b18a8e9(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_0_7cf383c6_aeba_4bd7_ab78_ecb9800338e8(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_2_719ecc00_1a96_40c6_b39e_67d867b02dd9(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() > s.size()) return False;
        for(int i = 0; i < l.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_1_037b7496_618a_49a0_be6e_72fffe8932a6(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i <= l.size() - s.size(); i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean found = True;
                for (int j = 1; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        found = False;
                        break;
                    }
                }
                if (found) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_1_aad7cfdc_eab6_4ecb_b101_19c26909de99(ArrayList<Integer> l, ArrayList<Integer> s) {
        int n = l.size();
        int m = s.size();
        for (int i = 0; i < n; i++) {
            if (l.get(i) == s.get(0)) {
                int j = 0;
                while (j < m && l.get(i + j) == s.get(j)) {
                    j++;
                }
                if (j == m) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_2_faf380bd_f094_4060_8058_a50851febda2(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0, j = 0;
        while(i < l.size() && j < s.size()) {
            if(l.get(i) == s.get(j)) {
                i++;
                j++;
            } else {
                j = 0;
            }
        }
        return i == l.size() && j == s.size();
    }

    
    public static boolean isSublist_Problem_0_53ceed9d_ac76_49d7_80fc_2c3edba59314(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_1_990c26c9_0f4b_461e_9950_53d07403271b(ArrayList<Integer> l, ArrayList<Integer> s) {
        int n = l.size();
        int m = s.size();
        for (int i = 0; i <= n - m; i++) {
            int j;
            for (j = 0; j < m; j++) {
                if (l.get(i + j) != s.get(j)) {
                    break;
                }
            }
            if (j == m) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_0_dd75e223_e73d_44db_9920_5eee3bf27b6b(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i <= l.size() - s.size(); i++) {
            if (l.get(i).equals(s.get(0))) {
                int j = 0;
                while (j < s.size() && l.get(i + j).equals(s.get(j))) {
                    j++;
                }
                if (j == s.size()) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_0_42077c43_9f24_42dc_90ee_2394843b6b06(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_2_831316a9_f9de_44cd_bd1e_cbb239a688b1(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (l.size() < s.size()) return False;
        for (int i = 0; i < l.size() - s.size() + 1; i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean found = True;
                for (int j = 0; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        found = False;
                        break;
                    }
                }
                if (found) return True;
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_1_459083b2_21dd_46b3_ad42_2cd312eb5cc2(ArrayList<Integer> l, ArrayList<Integer> s) {
        ArrayList<Integer> l1 = new ArrayList<>(l);
        ArrayList<Integer> s1 = new ArrayList<>(s);
        boolean flag = False;
        for(int i = 0; i < l1.size(); i++) {
            for(int j = 0; j < s1.size(); j++) {
                if(l1.get(i).equals(s1.get(j))) {
                    flag = True;
                    break;
                }
            }
        }
        return flag;
    }

    
    public static boolean isSublist_Problem_1_e99b20ee_8f63_4a23_a7a6_969ac3bce3a2(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (l.size() < s.size()) {
            return False;
        }
        for (int i = 0; i < l.size() - s.size() + 1; i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean isSublist_Problem_1_e99b20ee_8f63_4a23_a7a6_969ac3bce3a2 = True;
                for (int j = 0; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        isSublist_Problem_1_e99b20ee_8f63_4a23_a7a6_969ac3bce3a2 = False;
                        break;
                    }
                }
                if (isSublist_Problem_1_e99b20ee_8f63_4a23_a7a6_969ac3bce3a2) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_2_27967709_3d6c_40b5_8806_be77c8f54739(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() > s.size()) return False;
        for(int i = 0; i < l.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_1_1d0bb2f9_e9e9_46bd_b0d5_97735b36e6cc(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0, j = 0;
        for (; i < l.size() && j < s.size(); i++) {
            if (l.get(i) == s.get(j)) {
                j++;
            } else {
                j = 0;
            }
        }
        return j == s.size();
    }

    
    public static boolean isSublist_Problem_1_a675dfe3_6208_45d7_9b5f_6aa6d71ecffc(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_1_0f2c1e6d_045c_4a7d_8aaf_34cb08b9a892(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (l.size() < s.size()) {
            return False;
        }
        for (int i = 0; i < l.size() - s.size() + 1; i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean isSub = True;
                for (int j = 1; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        isSub = False;
                        break;
                    }
                }
                if (isSub) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_2_8460de8e_30f7_486f_a016_f48488040ea4(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_0_4340aee6_9bba_4247_b84f_0400db6c106c(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_2_1b4cc0d7_230b_46e2_b877_2dfb48b8a01d(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_0_be445565_e29f_4a2e_bc96_64b70802aabd(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < l.size() && j < s.size()) {
            if (l.get(i) == s.get(j)) {
                i++;
                j++;
            } else {
                j++;
            }
        }
        if (i == l.size()) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isSublist_Problem_0_54862011_cb1d_41d2_9cf7_bd78a32ec751(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0;
        int j = 0;
        while (i < l.size() && j < s.size()) {
            if (l.get(i) == s.get(j)) {
                i++;
                j++;
            } else if (l.get(i) > s.get(j)) {
                j++;
            } else {
                i++;
            }
        }
        return i == l.size() && j == s.size();
    }

    
    public static boolean isSublist_Problem_1_233a5a70_ec80_4873_b1c9_d167aed4db6d(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i < l.size(); i++) {
            if (l.get(i) == s.get(0)) {
                int j = 0;
                while (j < s.size() && i + j < l.size() && l.get(i + j) == s.get(j)) {
                    j++;
                }
                if (j == s.size()) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_0_682f657b_360f_490c_b364_4c0e53553b21(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0;
        int j = 0;
        int size = l.size();
        int size2 = s.size();
        while (i < size && j < size2) {
            if (l.get(i) == s.get(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        return i == size && j == size2;
    }

    
    public static boolean isSublist_Problem_0_41eccd45_828c_4d0b_a89e_3583606e4afe(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0;
        int j = 0;
        int k = 0;
        int l_size = l.size();
        int s_size = s.size();
        while (i < l_size && j < s_size) {
            if (l.get(i) == s.get(j)) {
                i++;
                j++;
                k++;
            } else if (l.get(i) < s.get(j)) {
                i++;
            } else {
                j++;
            }
        }
        return k == s_size;
    }

    
    public static boolean isSublist_Problem_1_4a83d61d_48e6_4357_88f0_03a4b265096e(ArrayList<Integer> l, ArrayList<Integer> s) {
        return l.containsAll(s);
    }

    
    public static boolean isSublist_Problem_0_f0b753ef_dc76_43ab_aec6_fdc4eef377c4(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0;
        int j = 0;
        while (i < l.size() && j < s.size()) {
            if (l.get(i) == s.get(j)) {
                i++;
                j++;
            } else if (l.get(i) < s.get(j)) {
                i++;
            } else {
                j++;
            }
        }
        return i == l.size() && j == s.size();
    }

    
    public static boolean isSublist_Problem_2_309e49b4_ec51_49bf_961b_9391c484f19d(ArrayList<Integer> l, ArrayList<Integer> s) {
        int n = s.size();
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> a1 = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            a.add(s.get(i));
        }
        for(int i = 0; i < l.size(); i++) {
            a1.add(l.get(i));
        }
        boolean flag = False;
        for(int i = 0; i < a.size(); i++) {
            for(int j = 0; j < a1.size(); j++) {
                if(a.get(i) == a1.get(j)) {
                    flag = True;
                    break;
                }
            }
            if(flag)
                break;
        }
        return flag;
    }

    
    public static boolean isSublist_Problem_1_afa38060_412e_4908_b6cf_a2073f3c6a75(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_1_d32ff163_6412_47e4_97a2_567bbac3a498(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i <= l.size() - s.size(); i++) {
            if (l.get(i).equals(s.get(0))) {
                for (int j = 0; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        break;
                    }
                    if (j == s.size() - 1) {
                        return True;
                    }
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_1_161c2dd9_3a8c_40d9_b650_bd92ece17c3f(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_1_d72582db_f180_4ee0_9ca4_7575473c8fb5(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i < l.size() - s.size() + 1; i++) {
            boolean isSublist_Problem_1_d72582db_f180_4ee0_9ca4_7575473c8fb5 = True;
            for (int j = 0; j < s.size(); j++) {
                if (l.get(i + j) != s.get(j)) {
                    isSublist_Problem_1_d72582db_f180_4ee0_9ca4_7575473c8fb5 = False;
                    break;
                }
            }
            if (isSublist_Problem_1_d72582db_f180_4ee0_9ca4_7575473c8fb5) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_2_7920de7c_2267_4f00_ad60_e338da47ad58(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() == 0) {
            return True;
        }
        if (l.size() == 0) {
            return False;
        }
        int i = 0;
        int j = 0;
        while (i < l.size() && j < s.size()) {
            if (l.get(i).equals(s.get(j))) {
                j++;
            } else {
                j = 0;
            }
            i++;
        }
        return j == s.size();
    }

    
    public static boolean isSublist_Problem_2_bc7e1543_b9f6_481f_984c_a503904031b3(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_0_3cd41338_ee26_482d_bb1d_9f466c1534c6(ArrayList<Integer> l, ArrayList<Integer> s) {
        boolean flag = False;
        for(int i = 0; i < l.size(); i++) {
            for(int j = 0; j < s.size(); j++) {
                if(l.get(i) == s.get(j)) {
                    flag = True;
                    break;
                }
            }
        }
        return flag;
    }

    
    public static boolean isSublist_Problem_2_2dccfb81_600c_47d4_9cc6_d3249e4b4a1a(ArrayList<Integer> l, ArrayList<Integer> s) {
        int size = l.size();
        int subsize = s.size();
        if (size != subsize) {
            return False;
        } else {
            ArrayList<Integer> temp = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                if (l.get(i) != s.get(i)) {
                    return False;
                }
            }
            return True;
        }
    }

    
    public static boolean isSublist_Problem_2_c0c5ae37_d768_40aa_b6b7_7c7526c96848(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i <= l.size() - s.size(); i++) {
            if (l.get(i) == s.get(0)) {
                boolean match = True;
                for (int j = 0; j < s.size(); j++) {
                    if (l.get(i + j) != s.get(j)) {
                        match = False;
                        break;
                    }
                }
                if (match) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_2_3cd41338_ee26_482d_bb1d_9f466c1534c6(ArrayList<Integer> l, ArrayList<Integer> s) {
        boolean flag = False;
        for(int i = 0; i < l.size(); i++) {
            for(int j = 0; j < s.size(); j++) {
                if(l.get(i) == s.get(j)) {
                    flag = True;
                    break;
                }
            }
        }
        return flag;
    }

    
    public static boolean isSublist_Problem_2_9e57fd22_aa2e_40da_90b1_b35f11da96eb(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0, j = 0;
        for(; i < l.size() && j < s.size(); i++) {
            if(l.get(i) == s.get(j)) {
                j++;
            }
        }
        return j == s.size();
    }

    
    public static boolean isSublist_Problem_1_eca1002e_8fa1_4814_9b74_7ba4f3034978(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_2_a2f48f4d_7e72_400e_9e78_11616e0f6ab8(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_2_6d0eb92e_4b42_461b_af1b_5004a11c74e8(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() != s.size()) return False;
        
        ArrayList<Integer> l1 = new ArrayList<Integer>(l);
        for(int i = 0; i < s.size(); i++) {
            l1.remove(s.get(i));
        }
        
        boolean check = True;
        if(l.equals(l1)) {
            check = False;
        }
        return check;
    }

    
    public static boolean isSublist_Problem_2_f4cd7697_ff1d_441f_ae7f_b0438eb6e946(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i,j;
        for(i=0;i<l.size();i++){
            for(j=0;j<s.size();j++){
                if(l.get(i)==s.get(j)){
                    break;
                }
            }
            if(j==s.size())
                return True;
        }
        return False;
    }

    
    public static boolean isSublist_Problem_1_719df5c7_0a26_4bde_bb0e_4f1f9754c302(ArrayList<Integer> l, ArrayList<Integer> s) {
        ArrayList<Integer> l1 = new ArrayList<>(l);
        ArrayList<Integer> s1 = new ArrayList<>(s);
        ArrayList<Integer> l2 = new ArrayList<>();
        ArrayList<Integer> s2 = new ArrayList<>();
        for(int i=0; i<l1.size(); i++) {
            l2.add(l1.get(i));
        }
        for(int i=0; i<s1.size(); i++) {
            s2.add(s1.get(i));
        }
        for(int i=0; i<l2.size(); i++) {
            if(!s2.contains(l2.get(i))) {
                return False;
            }
        }
        return True;
    }

    
    public static boolean isSublist_Problem_0_a93d600f_5eb0_420c_97dc_facace1df003(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i <= l.size() - s.size(); i++) {
            if (l.subList(i, i + s.size()).equals(s)) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_2_14b635ef_41a6_4a08_9f37_9a72fb0c9ff8(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() > s.size()) return False;
        for(int i = 0; i < l.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_0_9c1a5c09_ae64_4718_b993_a6a7a48402b0(ArrayList<Integer> l, ArrayList<Integer> s) {
        ArrayList<Integer> sublist = new ArrayList<>();
        for(Integer i : s) {
            for(Integer j : l) {
                if(i == j) {
                    sublist.add(i);
                }
            }
        }
        return sublist.contains(s);
    }

    
    public static boolean isSublist_Problem_0_550b69d3_dc85_492b_beb8_fa734122e4b9(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_2_cc023ff8_21b5_46ec_8a94_4f4551231c66(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0;
        int j = 0;
        while (i < l.size() && j < s.size()) {
            if (l.get(i) == s.get(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        return i == l.size() && j == s.size();
    }

    
    public static boolean isSublist_Problem_1_1b6d5d47_a3c9_4406_a7c6_c2f6a207f1d1(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (l.size() < s.size()) return False;
        for (int i = 0; i < s.size(); i++) {
            if (l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_2_eca1002e_8fa1_4814_9b74_7ba4f3034978(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_1_60617548_c878_4930_b296_986971ac41eb(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0;
        int j = 0;
        int k = 0;
        int l_size = l.size();
        int s_size = s.size();
        while (i < l_size && j < s_size) {
            if (l.get(i) == s.get(j)) {
                i++;
                j++;
                k++;
            } else if (l.get(i) < s.get(j)) {
                i++;
            } else {
                j++;
            }
        }
        return k == s_size;
    }

    
    public static boolean isSublist_Problem_1_3e1f83a3_1c35_4a6e_a7ad_e7a913275b34(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0;
        int j = 0;
        while(i < l.size() && j < s.size()) {
            if(l.get(i) == s.get(j)) {
                i++;
                j++;
            } else {
                i = i + j - 1;
                j = 0;
            }
        }
        return i == l.size() && j == s.size();
    }

    
    public static boolean isSublist_Problem_1_14fd2743_2df2_4793_b6dd_f7c2db4243d2(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < l.size() && j < s.size()) {
            if (l.get(i) == s.get(j)) {
                i++;
                j++;
            } else {
                j++;
            }
        }
        if (i == l.size()) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isSublist_Problem_2_fde1641d_00d5_4ee9_8ca2_ac7857cc5d2b(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) return False;
        for (int i = 0; i <= l.size() - s.size(); i++) {
            if (l.subList(i, i + s.size()).equals(s)) return True;
        }
        return False;
    }

    
    public static boolean isSublist_Problem_1_5475b620_a7f4_47e4_9351_c32a151d61f0(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_0_0e8b6fc2_3e87_476c_9a32_c734044ac125(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i <= l.size() - s.size(); i++) {
            if (l.subList(i, i + s.size()).equals(s)) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_0_fc5a1f3c_0dca_441a_badf_6998fdfd6786(ArrayList<Integer> l, ArrayList<Integer> s) {
        return l.stream().anyMatch(a -> s.contains(a));
    }

    
    public static boolean isSublist_Problem_2_a2f48f4d_7e72_400e_9e78_11616e0f6ab8(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_0_539e387b_b152_4738_b653_b21395e3299b(ArrayList<Integer> l, ArrayList<Integer> s) {
        return l.equals(s);
    }

    
    public static boolean isSublist_Problem_1_56d8c86d_9bc8_4413_aae8_250e83ff6fbe(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_1_e5c1dbcf_c11f_4d45_b187_56ca589505fa(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_0_2938fda2_ade7_4f89_b86a_d777d4fbeb96(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (l.size() < s.size()) return False;
        for (int i = 0; i < s.size(); i++) {
            if (l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_2_bd1c7a2d_58d8_41c1_afff_1a3a7ef4fcfd(ArrayList<Integer> l, ArrayList<Integer> s) {
        // Write your code here
        ArrayList<Integer> n = new ArrayList<>();
        n.addAll(l);
        n.removeAll(s);
        if (n.isEmpty()) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isSublist_Problem_0_ddd6dfba_3b94_433d_a82f_fbc076a14bc4(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_2_78c63d39_ea81_4843_8b16_4825d1f7e4fa(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (l.size() < s.size()) return False;
        if (l.size() == s.size()) {
            for (int i = 0; i < l.size(); i++) {
                if (l.get(i) != s.get(i)) return False;
            }
            return True;
        }
        for (int i = 0; i < l.size() - s.size(); i++) {
            boolean found = True;
            for (int j = 0; j < s.size(); j++) {
                if (l.get(i+j) != s.get(j)) {
                    found = False;
                    break;
                }
            }
            if (found) return True;
        }
        return False;
    }

    
    public static boolean isSublist_Problem_0_e943792f_b615_45f5_8f5a_d83e79c404b8(ArrayList<Integer> l, ArrayList<Integer> s) {
        ArrayList<Integer> temp = new ArrayList<>();
        for(int i = 0; i < l.size(); i++) {
            for(int j = 0; j < s.size(); j++) {
                if(l.get(i) == s.get(j)) {
                    temp.add(l.get(i));
                }
            }
        }
        return temp.size() == s.size();
    }

    
    public static boolean isSublist_Problem_0_b3c46029_748c_4bf6_ba3e_9ca47c308ec2(ArrayList<Integer> l, ArrayList<Integer> s) {
        ArrayList<Integer> l1 = new ArrayList<Integer>(l);
        ArrayList<Integer> s1 = new ArrayList<Integer>(s);
        Collections.sort(l1);
        Collections.sort(s1);
        if (l1.equals(s1)) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isSublist_Problem_0_ef82ecbd_664f_4098_a9ec_130638e03e6d(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_2_b989c033_a94f_4df3_87bf_3dbf48037b8c(ArrayList<Integer> l, ArrayList<Integer> s) {
        return s.stream().anyMatch(l::contains);
    }

    
    public static boolean isSublist_Problem_2_a4328e1f_57f9_47c4_9190_887a59ee8dd4(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0;
        int j = 0;
        while (i < l.size() && j < s.size()) {
            if (l.get(i) == s.get(j)) {
                i++;
                j++;
            } else {
                j = 0;
            }
        }
        return i == l.size();
    }

    
    public static boolean isSublist_Problem_2_ec72a74c_2340_4704_8fc9_5fc5a436073e(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        int i = 0;
        int j = 0;
        while (i < l.size() && j < s.size()) {
            if (l.get(i) == s.get(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        if (j == s.size()) {
            return True;
        }
        return False;
    }

    
    public static boolean isSublist_Problem_0_f9064bdb_0afb_4ba3_bb06_7a37d4b076c9(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0;
        int j = 0;
        while (i < l.size() && j < s.size()) {
            if (l.get(i) == s.get(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        return i == l.size() && j == s.size();
    }

    
    public static boolean isSublist_Problem_2_8d41e7c9_22ea_41e9_b164_13adee9b0d88(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_0_2d61b802_4be3_4a36_bbb1_17e1a945b81d(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() > s.size()) return False;
        for(int i = 0; i < l.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_0_b2ccaffd_8d43_426a_8535_2e10c11db08a(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i < l.size() - s.size() + 1; i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean found = True;
                for (int j = 0; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        found = False;
                        break;
                    }
                }
                if (found) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_2_8efd2f0f_5f22_4734_be00_16e55e5326a8(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (l.size() < s.size()) {
            return False;
        }
        boolean result = True;
        for (int i = 0; i < s.size(); i++) {
            result &= (l.get(i) == s.get(i));
        }
        return result;
    }

    
    public static boolean isSublist_Problem_2_36421673_f5ae_4a7c_8b28_ec0a4608bb3f(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0, j = 0;
        while (i < l.size() && j < s.size()) {
            if (l.get(i) == s.get(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        return i == l.size() && j == s.size();
    }

    
    public static boolean isSublist_Problem_1_ee076d96_f32b_4e13_8e13_aef08a7de614(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0;
        int j = 0;
        while (i < l.size() && j < s.size()) {
            if (l.get(i) == s.get(j)) {
                i++;
                j++;
            } else {
                j = 0;
            }
        }
        return i == l.size();
    }

    
    public static boolean isSublist_Problem_0_9d5b61d8_f29c_4168_9ff3_1bf54bbcbcc5(ArrayList<Integer> l, ArrayList<Integer> s) {
        int n = l.size();
        int m = s.size();
        if (m > n) {
            return False;
        }
        for (int i = 0; i <= n - m; i++) {
            int j;
            for (j = 0; j < m; j++) {
                if (l.get(i + j) != s.get(j)) {
                    break;
                }
            }
            if (j == m) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_1_66088db6_2417_4390_a7d1_cd9536b93636(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_2_8208a0a5_253f_4459_b1dd_68bb8b2f2489(ArrayList<Integer> l, ArrayList<Integer> s) {
        ArrayList<Integer> sub = new ArrayList<Integer>();
        for(Integer i : s) {
            for(Integer j : l) {
                if(j.equals(i)) {
                    sub.add(i);
                }
            }
        }
        return sub.isEmpty();
    }

    
    public static boolean isSublist_Problem_2_eca1002e_8fa1_4814_9b74_7ba4f3034978(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_2_6328a28f_1b50_48fa_bfe6_8a6c9f6eb0ef(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0, j = 0;
        while (i < l.size() && j < s.size()) {
            if (l.get(i) == s.get(j)) {
                i++;
                j++;
            } else {
                j++;
            }
        }
        return i == l.size() && j == s.size();
    }

    
    public static boolean isSublist_Problem_2_0d33a3a1_2d79_4123_8619_1b24112fc357(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_2_b1045f02_88b3_49d9_aade_d6a66f772207(ArrayList<Integer> l, ArrayList<Integer> s) {
        ArrayList<Integer> sublist = new ArrayList<>();
        for(Integer i : l) {
            for(Integer j : s) {
                if(i == j) {
                    sublist.add(i);
                }
            }
        }
        return sublist.contains(l);
    }

    
    public static boolean isSublist_Problem_2_99892862_7bbc_4905_a923_9c741c2f6cca(ArrayList<Integer> l, ArrayList<Integer> s) {
        
        ArrayList<Integer> temp = new ArrayList<Integer>();
        for(int i=0;i<l.size();i++){
            for(int j=0;j<s.size();j++){
                if(l.get(i) == s.get(j)){
                    temp.add(l.get(i));
                    break;
                }
            }
        }
        
        for(int i=0;i<temp.size()-1;i++){
            if(temp.get(i) != temp.get(i+1)){
                return False;
            }
        }
        return True;
    }

    
    public static boolean isSublist_Problem_1_7e7109d2_612c_40cb_ad63_558349df89b6(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) return False;
        for (int i = 0; i <= l.size() - s.size(); i++) {
            if (l.subList(i, i + s.size()).equals(s)) return True;
        }
        return False;
    }

    
    public static boolean isSublist_Problem_1_44dc0792_f6e7_4362_9c2b_ea47fe2bed8d(ArrayList<Integer> l, ArrayList<Integer> s) {
        List<Integer> al = new ArrayList<>();
        al.addAll(l.subList(1,l.size()));
        al.addAll(s.subList(1,s.size()));
        System.out.println(al);
        return al.containsAll(l);
    }

    
    public static boolean isSublist_Problem_1_77ec45a3_5a40_4290_900b_a2ef31df38a4(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_2_8711275a_a953_48a3_ae22_82cd2900cbab(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i <= l.size() - s.size(); i++) {
            if (l.subList(i, i + s.size()).equals(s)) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_2_2b3d7506_98e3_4b68_958d_4cf532023d30(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(s.get(i) != l.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_1_d72582db_f180_4ee0_9ca4_7575473c8fb5(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i < l.size() - s.size() + 1; i++) {
            boolean isSublist_Problem_1_d72582db_f180_4ee0_9ca4_7575473c8fb5 = True;
            for (int j = 0; j < s.size(); j++) {
                if (l.get(i + j) != s.get(j)) {
                    isSublist_Problem_1_d72582db_f180_4ee0_9ca4_7575473c8fb5 = False;
                    break;
                }
            }
            if (isSublist_Problem_1_d72582db_f180_4ee0_9ca4_7575473c8fb5) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_2_76dbadc1_3878_4324_9af3_b38fab665e78(ArrayList<Integer> l, ArrayList<Integer> s) {
        boolean isSublist_Problem_2_76dbadc1_3878_4324_9af3_b38fab665e78 = False;
        if (s.size() > l.size()) {
            return False;
        } else {
            l.removeAll(new ArrayList<>());
            isSublist_Problem_2_76dbadc1_3878_4324_9af3_b38fab665e78 = l.equals(s);
        }
        return isSublist_Problem_2_76dbadc1_3878_4324_9af3_b38fab665e78;
    }

    
    public static boolean isSublist_Problem_2_ca3e0a19_825c_4c9d_bc39_508eda23c4f6(ArrayList<Integer> l, ArrayList<Integer> s) {
        boolean flag = True;
        for (int i : s) {
            if (!l.contains(i)) {
                flag = False;
                break;
            }
        }
        return flag;
    }

    
    public static boolean isSublist_Problem_1_1c273275_0945_4334_8a52_149e439eb20c(ArrayList<Integer> l, ArrayList<Integer> s) {
        // Your code here
        // The idea is to keep a flag indicating whether a particular sub-array is present or not.
        // If flag is set to True, then it means the sub-array is present and hence return True else return False.
        boolean flag = False;

        for(int i=0; i<l.size()-1; i++) {
            for(int j=i+1; j<l.size(); j++) {
                if (s.get(i).equals(l.get(j))) {
                    flag = True;
                }
            }
        }
        return flag;
    }

    
    public static boolean isSublist_Problem_1_f2e7bf14_fe39_4186_a77b_0fc32393fd8b(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i <= l.size() - s.size(); i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean isSublist_Problem_1_f2e7bf14_fe39_4186_a77b_0fc32393fd8b = True;
                for (int j = 0; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        isSublist_Problem_1_f2e7bf14_fe39_4186_a77b_0fc32393fd8b = False;
                        break;
                    }
                }
                if (isSublist_Problem_1_f2e7bf14_fe39_4186_a77b_0fc32393fd8b) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_0_4a83d61d_48e6_4357_88f0_03a4b265096e(ArrayList<Integer> l, ArrayList<Integer> s) {
        return l.containsAll(s);
    }

    
    public static boolean isSublist_Problem_0_831316a9_f9de_44cd_bd1e_cbb239a688b1(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (l.size() < s.size()) return False;
        for (int i = 0; i < l.size() - s.size() + 1; i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean found = True;
                for (int j = 0; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        found = False;
                        break;
                    }
                }
                if (found) return True;
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_0_127ad148_9f40_4c0e_8d08_4078175bd1f6(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_2_98072898_12a6_4776_8d9d_b2a0015e61c7(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() > s.size()) return False;
        for(int i = 0; i < l.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_0_976624a0_0c8f_4d58_9a96_510490d7bc90(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i <= l.size() - s.size(); i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean flag = True;
                for (int j = 1; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        flag = False;
                        break;
                    }
                }
                if (flag) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_1_3cd41338_ee26_482d_bb1d_9f466c1534c6(ArrayList<Integer> l, ArrayList<Integer> s) {
        boolean flag = False;
        for(int i = 0; i < l.size(); i++) {
            for(int j = 0; j < s.size(); j++) {
                if(l.get(i) == s.get(j)) {
                    flag = True;
                    break;
                }
            }
        }
        return flag;
    }

    
    public static boolean isSublist_Problem_1_739f76df_4cc1_476a_99f1_9a98699a99ff(ArrayList<Integer> l, ArrayList<Integer> s) {
        // Write your code here.
        ArrayList<Integer> a = new ArrayList<>();
        boolean flag = True;
        for(int i=0; i<l.size(); i++) {
            for(int j: l) {
                if(!s.contains(j)) {
                    flag = False;
                    break;
                }
            }
        }
        return flag;
    }

    
    public static boolean isSublist_Problem_0_aef8d866_ae7d_424b_86cb_b447babeca9a(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0;
        int j = 0;
        while (i < l.size() && j < s.size()) {
            if (l.get(i) == s.get(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        return i == l.size() && j == s.size();
    }

    
    public static boolean isSublist_Problem_0_9f0d67b7_5b8e_4738_833d_ed0dce21ebe2(ArrayList<Integer> l, ArrayList<Integer> s) {
        ArrayList<Integer> temp = new ArrayList<>();
        for(Integer i : l) {
            for(Integer j : s) {
                if(i == j) {
                    temp.add(i);
                }
            }
        }
        boolean result = temp.isEmpty();
        return result;
    }

    
    public static boolean isSublist_Problem_1_9d5b61d8_f29c_4168_9ff3_1bf54bbcbcc5(ArrayList<Integer> l, ArrayList<Integer> s) {
        int n = l.size();
        int m = s.size();
        if (m > n) {
            return False;
        }
        for (int i = 0; i <= n - m; i++) {
            int j;
            for (j = 0; j < m; j++) {
                if (l.get(i + j) != s.get(j)) {
                    break;
                }
            }
            if (j == m) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_1_a985b230_1c1b_48b7_9c88_c8c9b374e880(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0;
        int j = 0;
        while (i < l.size() && j < s.size()) {
            if (l.get(i) == s.get(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        return i == l.size() && j == s.size();
    }

    
    public static boolean isSublist_Problem_2_91044327_31d5_42e9_a258_1de271761c11(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0;
        int j = 0;
        while (i < l.size() && j < s.size()) {
            if (l.get(i) == s.get(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        return i == l.size() && j == s.size();
    }

    
    public static boolean isSublist_Problem_0_9ad6a662_7858_48ad_9297_0af067054f9b(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_1_e4d49bed_fe1b_4ea2_bdca_29c5cb5828be(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0;
        int j = 0;
        int l_size = l.size();
        int s_size = s.size();
        while (i < l_size && j < s_size) {
            if (l.get(i) == s.get(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        return (i == l_size && j == s_size);
    }

    
    public static boolean isSublist_Problem_0_672e2757_03f7_4138_b1ab_53ba84e0cdad(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i <= l.size() - s.size(); i++) {
            if (l.subList(i, i + s.size()).equals(s)) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_2_4019ed98_ba78_4932_a75a_9fce73e53e07(ArrayList<Integer> l, ArrayList<Integer> s) {
        int n = l.size();
        int m = s.size();
        if (m > n) {
            return False;
        }
        for (int i = 0; i <= n - m; i++) {
            int j;
            for (j = 0; j < m; j++) {
                if (l.get(i + j) != s.get(j)) {
                    break;
                }
            }
            if (j == m) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_2_42077c43_9f24_42dc_90ee_2394843b6b06(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_2_e977f4f6_98ba_4c8d_a08e_f54f42146c65(ArrayList<Integer> l, ArrayList<Integer> s) {
        ArrayList<Integer> temp = new ArrayList<>();
        for(int i = 0; i < l.size(); i++) {
            for(int j = 0; j < s.size(); j++) {
                if(l.get(i) == s.get(j)) {
                    temp.add(l.get(i));
                }
            }
        }
        return temp.size() == s.size();
    }

    
    public static boolean isSublist_Problem_1_1242fc41_e150_4f29_8a63_ab7e14c8958d(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i < l.size() - s.size() + 1; i++) {
            if (l.subList(i, i + s.size()).equals(s)) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_2_b2ccaffd_8d43_426a_8535_2e10c11db08a(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i < l.size() - s.size() + 1; i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean found = True;
                for (int j = 0; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        found = False;
                        break;
                    }
                }
                if (found) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_2_904306f2_d67f_48dd_b282_1b9babb49892(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i <= l.size() - s.size(); i++) {
            if (l.get(i).equals(s.get(0))) {
                int j = 0;
                while (j < s.size() && l.get(i + j).equals(s.get(j))) {
                    j++;
                }
                if (j == s.size()) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_2_eeb09666_6e6b_471e_860e_dbf39ff1c8e9(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_0_7e2fe111_cbfc_4065_be2d_b672f67c20c6(ArrayList<Integer> l, ArrayList<Integer> s) {
        ArrayList<Integer> ll = new ArrayList<Integer>(l);
        ArrayList<Integer> sl = new ArrayList<Integer>(s);
        return ll.containsAll(sl);
    }

    
    public static boolean isSublist_Problem_2_e87bd369_430f_480c_a1b1_065d7a6157b3(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i < l.size() - s.size() + 1; i++) {
            if (l.get(i).equals(s.get(0))) {
                int j = 1;
                for (; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        break;
                    }
                }
                if (j == s.size()) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_1_c7275919_2165_404d_9501_d9c859ce79ce(ArrayList<Integer> l, ArrayList<Integer> s) {
        ArrayList<Integer> result = new ArrayList<>();
        for(int i = 0; i < l.size(); i++) {
            Integer li = l.get(i);
            Integer si = s.get(i);
            if(li.compareTo(si) != 0) {
                result.add(li);
                result.add(si);
            }
        }
        return result.contains(l);
    }

    
    public static boolean isSublist_Problem_2_8174225c_c6ff_40fb_a133_2fb722320839(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() > s.size()) return False;
        for(int i = 0; i < l.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_1_a2aaa76d_7bd8_40e0_b8df_28bcbda0d3a1(ArrayList<Integer> l, ArrayList<Integer> s) {
        // Your code here
        return l.containsAll(s);
    }

    
    public static boolean isSublist_Problem_2_57805036_ed62_4c9b_a111_f75bba24c60f(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0, j = 0;
        for(; i < l.size() && j < s.size(); i++) {
            if(l.get(i) == s.get(j)) {
                j++;
            } else {
                j = 0;
            }
        }
        return j == s.size();
    }

    
    public static boolean isSublist_Problem_2_07ec9355_224f_40fd_9712_ad5c75d652d6(ArrayList<Integer> l, ArrayList<Integer> s) {
        for (int i = 0; i < s.size(); i++) {
            if (!l.contains(s.get(i)))
                return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_2_bb7a2d9f_78d1_4e13_81c3_6ed6b068357c(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i < l.size() - s.size() + 1; i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean isSublist_Problem_2_bb7a2d9f_78d1_4e13_81c3_6ed6b068357c = True;
                for (int j = 0; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        isSublist_Problem_2_bb7a2d9f_78d1_4e13_81c3_6ed6b068357c = False;
                        break;
                    }
                }
                if (isSublist_Problem_2_bb7a2d9f_78d1_4e13_81c3_6ed6b068357c) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_1_b6dc4093_d518_48d6_8c61_6870f50c298c(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_2_77ec45a3_5a40_4290_900b_a2ef31df38a4(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_2_b3edd6ae_9706_4049_89d0_ad3de68f767a(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_2_6fe7fd3a_ed60_4500_82f7_6b3b551128fc(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0, j = 0;
        while (i < l.size() && j < s.size()) {
            if (l.get(i) == s.get(j)) {
                i++;
                j++;
            } else {
                j++;
            }
        }
        return i == l.size();
    }

    
    public static boolean isSublist_Problem_1_3cd41338_ee26_482d_bb1d_9f466c1534c6(ArrayList<Integer> l, ArrayList<Integer> s) {
        boolean flag = False;
        for(int i = 0; i < l.size(); i++) {
            for(int j = 0; j < s.size(); j++) {
                if(l.get(i) == s.get(j)) {
                    flag = True;
                    break;
                }
            }
        }
        return flag;
    }

    
    public static boolean isSublist_Problem_2_8dfd6e57_503b_4668_803c_aa5dc61f4c0a(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_0_739f76df_4cc1_476a_99f1_9a98699a99ff(ArrayList<Integer> l, ArrayList<Integer> s) {
        // Write your code here.
        ArrayList<Integer> a = new ArrayList<>();
        boolean flag = True;
        for(int i=0; i<l.size(); i++) {
            for(int j: l) {
                if(!s.contains(j)) {
                    flag = False;
                    break;
                }
            }
        }
        return flag;
    }

    
    public static boolean isSublist_Problem_0_1b6d5d47_a3c9_4406_a7c6_c2f6a207f1d1(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (l.size() < s.size()) return False;
        for (int i = 0; i < s.size(); i++) {
            if (l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_0_e7002282_3b21_4dbb_80b7_088bbd14be23(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (l.size() < s.size()) return False;
        for (int i = 0; i < s.size(); i++) {
            if (l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_0_b2ccaffd_8d43_426a_8535_2e10c11db08a(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i < l.size() - s.size() + 1; i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean found = True;
                for (int j = 0; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        found = False;
                        break;
                    }
                }
                if (found) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_2_7cf383c6_aeba_4bd7_ab78_ecb9800338e8(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_1_af725686_ebc5_415f_9afd_1c1a551f5071(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < l.size() && j < s.size()) {
            if (l.get(i) == s.get(j)) {
                i++;
                j++;
                k++;
            } else if (l.get(i) < s.get(j)) {
                i++;
            } else {
                j++;
            }
        }
        return k == s.size();
    }

    
    public static boolean isSublist_Problem_1_700a42e7_c927_4dc2_ba7b_ac7b5b1b6c87(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i <= l.size() - s.size(); i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean isSublist_Problem_1_700a42e7_c927_4dc2_ba7b_ac7b5b1b6c87 = True;
                for (int j = 0; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        isSublist_Problem_1_700a42e7_c927_4dc2_ba7b_ac7b5b1b6c87 = False;
                        break;
                    }
                }
                if (isSublist_Problem_1_700a42e7_c927_4dc2_ba7b_ac7b5b1b6c87) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_0_77ec45a3_5a40_4290_900b_a2ef31df38a4(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_1_0ae58ff2_4d7f_420b_bd33_e84d7852e227(ArrayList<Integer> l, ArrayList<Integer> s) {
        return l.equals(s);
    }

    
    public static boolean isSublist_Problem_0_127ad148_9f40_4c0e_8d08_4078175bd1f6(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_2_14b635ef_41a6_4a08_9f37_9a72fb0c9ff8(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() > s.size()) return False;
        for(int i = 0; i < l.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_2_f4871d77_2a22_43c4_aa36_e14359c4c9ad(ArrayList<Integer> l, ArrayList<Integer> s) {
        
        return False;
    }

    
    public static boolean isSublist_Problem_0_df5837ca_c77b_4dd6_959f_661fea556f0b(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        int i = 0;
        for(Integer e : s) {
            if(l.get(i) != e) return False;
            i++;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_2_2d61b802_4be3_4a36_bbb1_17e1a945b81d(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() > s.size()) return False;
        for(int i = 0; i < l.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_1_913cc9f6_b1a0_486a_aeed_6b538c98138e(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0;
        int j = 0;
        int k = 0;
        int ln = l.size();
        int sn = s.size();
        while (i < ln && j < sn) {
            if (l.get(i) == s.get(j)) {
                i++;
                j++;
                k++;
            } else if (l.get(i) < s.get(j)) {
                i++;
            } else {
                j++;
            }
        }
        return k == sn;
    }

    
    public static boolean isSublist_Problem_2_eeb09666_6e6b_471e_860e_dbf39ff1c8e9(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_1_e160d2f5_3d67_451a_add2_64ef9853e198(ArrayList<Integer> l, ArrayList<Integer> s) {
        ArrayList<Integer> sub = new ArrayList<>();
        l.forEach(x -> {
            s.forEach(y -> {
                if (x.equals(y)) {
                    sub.add(x);
                }
            });
        });
        return sub.isEmpty();
    }

    
    public static boolean isSublist_Problem_2_3a2d7af0_5130_4f04_85cf_737ba3eb71b5(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) return False;
        for (int i = 0; i <= l.size() - s.size(); i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean isSublist_Problem_2_3a2d7af0_5130_4f04_85cf_737ba3eb71b5 = True;
                for (int j = 1; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        isSublist_Problem_2_3a2d7af0_5130_4f04_85cf_737ba3eb71b5 = False;
                        break;
                    }
                }
                if (isSublist_Problem_2_3a2d7af0_5130_4f04_85cf_737ba3eb71b5) return True;
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_0_8874a1e7_7656_4ca7_9852_37205fe6ac9c(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0, j = 0;
        while (i < l.size() && j < s.size()) {
            if (l.get(i) == s.get(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        return i == l.size() && j == s.size();
    }

    
    public static boolean isSublist_Problem_0_77564c1d_6a22_4367_b893_3be92bc36722(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() > s.size()) return False;
        for(int i = 0; i < l.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_1_41131089_d74d_41b2_b695_706990cc0f28(ArrayList<Integer> l, ArrayList<Integer> s) {
        ArrayList<Integer> temp = new ArrayList<>();
        for(Integer i : l) {
            if(!temp.contains(i)) {
                temp.add(i);
            }
        }
        for(Integer i : s) {
            if(!temp.contains(i)) {
                return False;
            }
        }
        return True;
    }

    
    public static boolean isSublist_Problem_0_0724c605_ddfe_490d_9654_9b42f5f0eb8e(ArrayList<Integer> l, ArrayList<Integer> s) {
        ArrayList<Integer> sublist = new ArrayList<>();
        for(int i = 0; i < l.size(); i++) {
            for(int j = 0; j < s.size(); j++) {
                if(l.get(i) == s.get(j)) {
                    sublist.add(l.get(i));
                }
            }
        }
        return sublist.equals(s);
    }

    
    public static boolean isSublist_Problem_1_bc7e1543_b9f6_481f_984c_a503904031b3(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_1_904306f2_d67f_48dd_b282_1b9babb49892(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i <= l.size() - s.size(); i++) {
            if (l.get(i).equals(s.get(0))) {
                int j = 0;
                while (j < s.size() && l.get(i + j).equals(s.get(j))) {
                    j++;
                }
                if (j == s.size()) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_0_7e2fe111_cbfc_4065_be2d_b672f67c20c6(ArrayList<Integer> l, ArrayList<Integer> s) {
        ArrayList<Integer> ll = new ArrayList<Integer>(l);
        ArrayList<Integer> sl = new ArrayList<Integer>(s);
        return ll.containsAll(sl);
    }

    
    public static boolean isSublist_Problem_0_8425bb06_d28b_463c_9c6a_7b4db25a7221(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < l.size() && j < s.size()) {
            if (l.get(i) == s.get(j)) {
                i++;
                j++;
                k++;
            } else if (l.get(i) > s.get(j)) {
                j++;
            } else {
                i++;
            }
        }
        return k == s.size();
    }

    
    public static boolean isSublist_Problem_0_a4dd864c_4405_4344_a1e9_b62f25f91053(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() > s.size()) return False;
        for(int i = 0; i < l.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_1_84382b2e_5e6a_4d76_8542_f61edd750eb9(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_0_faf380bd_f094_4060_8058_a50851febda2(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0, j = 0;
        while(i < l.size() && j < s.size()) {
            if(l.get(i) == s.get(j)) {
                i++;
                j++;
            } else {
                j = 0;
            }
        }
        return i == l.size() && j == s.size();
    }

    
    public static boolean isSublist_Problem_2_46a34473_f0eb_44c4_8342_21846eaeb790(ArrayList<Integer> l, ArrayList<Integer> s) {
        ArrayList<Integer> temp = new ArrayList<>();
        for(Integer i : l) {
            if(!temp.contains(i)) {
                temp.add(i);
            }
        }
        for(Integer i : s) {
            if(!temp.contains(i)) {
                return False;
            }
        }
        return True;
    }

    
    public static boolean isSublist_Problem_1_a33aa094_066c_4b60_b51f_0fd2d35d38bf(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0, j = 0;
        while(i < l.size() && j < s.size()) {
            if(l.get(i) == s.get(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        return i == l.size() && j == s.size();
    }

    
    public static boolean isSublist_Problem_0_8efd2f0f_5f22_4734_be00_16e55e5326a8(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (l.size() < s.size()) {
            return False;
        }
        boolean result = True;
        for (int i = 0; i < s.size(); i++) {
            result &= (l.get(i) == s.get(i));
        }
        return result;
    }

    
    public static boolean isSublist_Problem_2_ccf7f12c_b39e_4483_bc46_3940277272a7(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i < l.size() - s.size() + 1; i++) {
            if (l.get(i).equals(s.get(0))) {
                int j = 0;
                for (; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        break;
                    }
                }
                if (j == s.size()) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_0_b6f53d05_b6da_430f_b239_adab87e082d0(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < l.size() && j < s.size()) {
            if (l.get(i) == s.get(j)) {
                i++;
                j++;
                k++;
            } else if (l.get(i) < s.get(j)) {
                i++;
            } else {
                j++;
            }
        }
        return k == s.size();
    }

    
    public static boolean isSublist_Problem_0_986d93c4_f89a_4e8d_a7a7_0d9146e8dda6(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i < l.size() - s.size() + 1; i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean isSublist_Problem_0_986d93c4_f89a_4e8d_a7a7_0d9146e8dda6 = True;
                for (int j = 1; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        isSublist_Problem_0_986d93c4_f89a_4e8d_a7a7_0d9146e8dda6 = False;
                        break;
                    }
                }
                if (isSublist_Problem_0_986d93c4_f89a_4e8d_a7a7_0d9146e8dda6) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_1_8202300a_cac4_4837_87bd_f84524241dd2(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (l.size() != s.size()) return False;
        int i = 0;
        for (int j = 0; j < l.size(); j++)
            if (l.get(j) != s.get(j))
                return False;
            i++;
        return True;
    }

    
    public static boolean isSublist_Problem_1_67dc36c8_9caa_40fd_8af8_dc71398d6f00(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_1_3cd41338_ee26_482d_bb1d_9f466c1534c6(ArrayList<Integer> l, ArrayList<Integer> s) {
        boolean flag = False;
        for(int i = 0; i < l.size(); i++) {
            for(int j = 0; j < s.size(); j++) {
                if(l.get(i) == s.get(j)) {
                    flag = True;
                    break;
                }
            }
        }
        return flag;
    }

    
    public static boolean isSublist_Problem_1_6da25625_0ad0_4d1a_89e1_a6bbac463f19(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0;
        int j = 0;
        while (i < l.size() && j < s.size()) {
            if (l.get(i) == s.get(j)) {
                i++;
                j++;
            } else {
                j++;
            }
        }
        return i == l.size();
    }

    
    public static boolean isSublist_Problem_0_81702675_9859_495c_94a1_ee4b771f5ead(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i <= l.size() - s.size(); i++) {
            if (l.get(i).equals(s.get(0))) {
                int j = 1;
                for (; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        break;
                    }
                }
                if (j == s.size()) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_2_5efb342a_c9d6_4791_9057_0366e49d81ea(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() > s.size()) return False;
        for(int i = 0; i < l.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_0_9bb8125e_5981_4ed0_9734_a9c22ead0a0c(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (l.size() < s.size()) return False;
        for (int i = 0; i < s.size(); i++) {
            if (l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_2_e4d49bed_fe1b_4ea2_bdca_29c5cb5828be(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0;
        int j = 0;
        int l_size = l.size();
        int s_size = s.size();
        while (i < l_size && j < s_size) {
            if (l.get(i) == s.get(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        return (i == l_size && j == s_size);
    }

    
    public static boolean isSublist_Problem_0_b3c46029_748c_4bf6_ba3e_9ca47c308ec2(ArrayList<Integer> l, ArrayList<Integer> s) {
        ArrayList<Integer> l1 = new ArrayList<Integer>(l);
        ArrayList<Integer> s1 = new ArrayList<Integer>(s);
        Collections.sort(l1);
        Collections.sort(s1);
        if (l1.equals(s1)) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isSublist_Problem_1_98c85056_81ce_4b14_af8c_c40fb0bc35e5(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (l.size() < s.size()) {
            return False;
        }
        for (int i = 0; i < s.size(); i++) {
            if (l.get(i) != s.get(i)) {
                return False;
            }
        }
        return True;
    }

    
    public static boolean isSublist_Problem_2_90025507_0fbd_41b6_8414_c6b7f97d3491(ArrayList<Integer> l, ArrayList<Integer> s) {
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> s1 = new ArrayList<>();
        for(Integer i : l) {
            l1.add(i);
        }
        for(Integer i : s) {
            s1.add(i);
        }
        boolean flag = False;
        for(int i = 0; i < l1.size(); i++) {
            for(int j = 0; j < s1.size(); j++) {
                if(l1.get(i) == s1.get(j)) {
                    flag = True;
                    break;
                }
            }
        }
        return flag;
    }

    
    public static boolean isSublist_Problem_1_cd7f35a7_e401_406d_aea3_a9a67761906f(ArrayList<Integer> l, ArrayList<Integer> s) {
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> s1 = new ArrayList<>();
        for(Integer i : l) {
            l1.add(i);
        }
        for(Integer i : s) {
            s1.add(i);
        }
        if(l1.equals(s1)) {
            return True;
        }
        return False;
    }

    
    public static boolean isSublist_Problem_1_27e263d5_a51f_421a_8988_5591b31198f2(ArrayList<Integer> l, ArrayList<Integer> s) {
        int n = l.size();
        int m = s.size();
        for (int i = 0; i <= n - m; i++) {
            int j;
            for (j = 0; j < m; j++) {
                if (l.get(i + j) != s.get(j)) {
                    break;
                }
            }
            if (j == m) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_0_0e0b028a_bc6d_4535_a417_eca332ac7d67(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_2_9211e0a7_a97d_4b41_a625_f81c62c7f67b(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(s.get(i) != l.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_2_c0c5ae37_d768_40aa_b6b7_7c7526c96848(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i <= l.size() - s.size(); i++) {
            if (l.get(i) == s.get(0)) {
                boolean match = True;
                for (int j = 0; j < s.size(); j++) {
                    if (l.get(i + j) != s.get(j)) {
                        match = False;
                        break;
                    }
                }
                if (match) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_0_db01df21_ab42_4507_a2dd_07bf10fe8942(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0;
        int j = 0;
        while (i < l.size() && j < s.size()) {
            if (l.get(i).equals(s.get(j))) {
                j++;
            } else {
                j = 0;
            }
            i++;
        }
        return j == s.size();
    }

    
    public static boolean isSublist_Problem_1_0f2c1e6d_045c_4a7d_8aaf_34cb08b9a892(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (l.size() < s.size()) {
            return False;
        }
        for (int i = 0; i < l.size() - s.size() + 1; i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean isSub = True;
                for (int j = 1; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        isSub = False;
                        break;
                    }
                }
                if (isSub) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_1_4a4fbe25_b471_4734_a5a3_efcfd2af14bb(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0;
        int j = 0;
        while(i < l.size() && j < s.size()) {
            if(l.get(i) == s.get(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        return i == l.size() && j == s.size();
    }

    
    public static boolean isSublist_Problem_0_3dc7382a_105a_4343_bf4e_05b21288be98(ArrayList<Integer> l, ArrayList<Integer> s) {
        ArrayList<Integer> sublist = new ArrayList<>();
        for(Integer i : s) {
            for(Integer j : l) {
                if(i.equals(j)) {
                    sublist.add(i);
                }
            }
        }
        return sublist.equals(s);
    }

    
    public static boolean isSublist_Problem_2_5d10c96e_048b_4d29_b993_cb63de3bdc1b(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) return False;
        for (int i = 0; i < l.size() - s.size() + 1; i++) {
            if (l.get(i).equals(s.get(0))) {
                int j = 0;
                while (j < s.size() && l.get(i + j).equals(s.get(j))) {
                    j++;
                }
                if (j == s.size()) return True;
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_0_a33aa094_066c_4b60_b51f_0fd2d35d38bf(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0, j = 0;
        while(i < l.size() && j < s.size()) {
            if(l.get(i) == s.get(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        return i == l.size() && j == s.size();
    }

    
    public static boolean isSublist_Problem_0_5bde70ec_766f_4ceb_8919_a2ba350aba51(ArrayList<Integer> l, ArrayList<Integer> s) {
        ArrayList<Integer> l1 = new ArrayList<>(l);
        ArrayList<Integer> s1 = new ArrayList<>(s);
        ArrayList<Integer> l2 = new ArrayList<>();
        ArrayList<Integer> s2 = new ArrayList<>();
        for(int i = 0; i < l1.size(); i++) {
            l2.add(l1.get(i));
        }
        for(int i = 0; i < s1.size(); i++) {
            s2.add(s1.get(i));
        }
        for(int i = 0; i < l2.size(); i++) {
            if(!s2.contains(l2.get(i))) {
                return False;
            }
        }
        return True;
    }

    
    public static boolean isSublist_Problem_0_6d0eb92e_4b42_461b_af1b_5004a11c74e8(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() != s.size()) return False;
        
        ArrayList<Integer> l1 = new ArrayList<Integer>(l);
        for(int i = 0; i < s.size(); i++) {
            l1.remove(s.get(i));
        }
        
        boolean check = True;
        if(l.equals(l1)) {
            check = False;
        }
        return check;
    }

    
    public static boolean isSublist_Problem_2_db8cb7eb_d39f_4bf8_bdf4_0f1abe2edc28(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) return False;
        for (int i = 0; i <= l.size() - s.size(); i++) {
            if (l.subList(i, i + s.size()).equals(s)) return True;
        }
        return False;
    }

    
    public static boolean isSublist_Problem_2_e4b2d6c2_c142_4102_8a5e_26747220ce27(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() != s.size())
            return False;
        int i = 0, j = 0, k = 0;
        while(i < l.size() && j < s.size()) {
            if(l.get(i).equals(s.get(j)))
                i++;
            else if(l.get(i).compareTo(s.get(j)) > 0)
                i++;
            else
                return False;
            j++;
        }
        return i == l.size();
    }

    
    public static boolean isSublist_Problem_0_aef8d866_ae7d_424b_86cb_b447babeca9a(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0;
        int j = 0;
        while (i < l.size() && j < s.size()) {
            if (l.get(i) == s.get(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        return i == l.size() && j == s.size();
    }

    
    public static boolean isSublist_Problem_0_ee4baca4_3384_4b60_8677_1bee4c5b4d80(ArrayList<Integer> l, ArrayList<Integer> s) {
        for(int i = 0; i < l.size(); i++) {
            if(s.contains(l.get(i))) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_0_1612fc47_710a_4d52_bb90_7ad32931f963(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_0_1b6d5d47_a3c9_4406_a7c6_c2f6a207f1d1(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (l.size() < s.size()) return False;
        for (int i = 0; i < s.size(); i++) {
            if (l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_0_a2b2a12d_6033_4070_ba5e_337b033cd888(ArrayList<Integer> l, ArrayList<Integer> s) {
        return l.size() == s.size() && l.containsAll(s);
    }

    
    public static boolean isSublist_Problem_0_15529ed6_2a15_4f61_909d_b0b975e2f066(ArrayList<Integer> l, ArrayList<Integer> s) {
        ArrayList<Integer> sublist = new ArrayList<Integer>();
        for (int i = 0; i < Math.min(l.size(), s.size()); i++) {
            sublist.add(l.get(i));
        }
        for (int i = 0; i < s.size(); i++) {
            sublist.removeAll(s.subList(0, i));
            if (sublist.size() <= 0) {
                return False;
            }
        }
        return True;
    }

    
    public static boolean isSublist_Problem_1_2dccfb81_600c_47d4_9cc6_d3249e4b4a1a(ArrayList<Integer> l, ArrayList<Integer> s) {
        int size = l.size();
        int subsize = s.size();
        if (size != subsize) {
            return False;
        } else {
            ArrayList<Integer> temp = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                if (l.get(i) != s.get(i)) {
                    return False;
                }
            }
            return True;
        }
    }

    
    public static boolean isSublist_Problem_1_e160d2f5_3d67_451a_add2_64ef9853e198(ArrayList<Integer> l, ArrayList<Integer> s) {
        ArrayList<Integer> sub = new ArrayList<>();
        l.forEach(x -> {
            s.forEach(y -> {
                if (x.equals(y)) {
                    sub.add(x);
                }
            });
        });
        return sub.isEmpty();
    }

    
    public static boolean isSublist_Problem_2_a9f444ea_bdfe_445a_8b35_44142f4cde1f(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) return False;
        for (int i = 0; i < l.size() - s.size() + 1; i++) {
            if (l.get(i).equals(s.get(0))) {
                int j = 0;
                while (j < s.size() && l.get(i + j).equals(s.get(j))) j++;
                if (j == s.size()) return True;
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_2_1a072364_e6db_4ca9_8ad4_84f59ce3a051(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (l.size() < s.size()) {
            return False;
        }
        for (int i = 0; i < l.size() - s.size() + 1; i++) {
            if (l.subList(i, i + s.size()).equals(s)) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_0_8efd2f0f_5f22_4734_be00_16e55e5326a8(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (l.size() < s.size()) {
            return False;
        }
        boolean result = True;
        for (int i = 0; i < s.size(); i++) {
            result &= (l.get(i) == s.get(i));
        }
        return result;
    }

    
    public static boolean isSublist_Problem_1_27dd5801_e88e_4542_9762_47fd1bfa575e(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i <= l.size() - s.size(); i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean isSublist_Problem_1_27dd5801_e88e_4542_9762_47fd1bfa575e = True;
                for (int j = 1; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        isSublist_Problem_1_27dd5801_e88e_4542_9762_47fd1bfa575e = False;
                        break;
                    }
                }
                if (isSublist_Problem_1_27dd5801_e88e_4542_9762_47fd1bfa575e) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_1_0dd96788_8ef2_45ab_bf10_093fa529a015(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i <= l.size() - s.size(); i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean found = True;
                for (int j = 1; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        found = False;
                        break;
                    }
                }
                if (found) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_1_9d5e78d3_2626_4826_9167_0e891439ff60(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_0_43c30c23_592f_42b6_9816_a72b7112354f(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_1_9211e0a7_a97d_4b41_a625_f81c62c7f67b(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(s.get(i) != l.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_2_9bb8125e_5981_4ed0_9734_a9c22ead0a0c(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (l.size() < s.size()) return False;
        for (int i = 0; i < s.size(); i++) {
            if (l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_1_bedc7cdf_a2d7_4ed4_8c1e_f1ca2ae66b8a(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i <= l.size() - s.size(); i++) {
            if (l.subList(i, i + s.size()).equals(s)) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_0_ec79cff3_3be8_4db3_9879_5bb56c6fd607(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i <= l.size() - s.size(); i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean isSublist_Problem_0_ec79cff3_3be8_4db3_9879_5bb56c6fd607 = True;
                for (int j = 0; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        isSublist_Problem_0_ec79cff3_3be8_4db3_9879_5bb56c6fd607 = False;
                        break;
                    }
                }
                if (isSublist_Problem_0_ec79cff3_3be8_4db3_9879_5bb56c6fd607) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_1_3c277f1e_9062_4541_b9b5_816ff7c4e8dd(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) return False;
        for (int i = 0; i < l.size() - s.size() + 1; i++) {
            if (l.get(i).equals(s.get(0))) {
                int j = 0;
                for (; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) break;
                }
                if (j == s.size()) return True;
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_1_69c13a04_08bb_48c3_945d_1b34933bb2b0(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i < l.size(); i++) {
            if (l.get(i).equals(s.get(0))) {
                int j = 0;
                for (j = 0; j < s.size(); j++) {
                    if (i + j >= l.size() || !l.get(i + j).equals(s.get(j))) {
                        break;
                    }
                }
                if (j == s.size()) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_1_194620f5_6ff0_466c_98b9_5f19d357e2b8(ArrayList<Integer> l, ArrayList<Integer> s) {
        boolean result = False;
        for(int i = 0; i < l.size(); i++) {
            for(int j = 0; j < s.size(); j++) {
                if(l.get(i) == s.get(j)) {
                    result = True;
                    break;
                }
            }
        }
        return result;
    }

    
    public static boolean isSublist_Problem_0_1791d202_f836_41c3_88fb_4261837a0045(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i <= l.size() - s.size(); i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean found = True;
                for (int j = 0; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        found = False;
                        break;
                    }
                }
                if (found) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_1_5d10c96e_048b_4d29_b993_cb63de3bdc1b(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) return False;
        for (int i = 0; i < l.size() - s.size() + 1; i++) {
            if (l.get(i).equals(s.get(0))) {
                int j = 0;
                while (j < s.size() && l.get(i + j).equals(s.get(j))) {
                    j++;
                }
                if (j == s.size()) return True;
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_2_b5adac7e_4e2e_4d5b_9ea6_a4f174c3aa73(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) return False;
        for (int i = 0; i < l.size() - s.size() + 1; i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean found = True;
                for (int j = 1; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        found = False;
                        break;
                    }
                }
                if (found) return True;
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_2_fd682482_4055_48fd_8d98_1227db5277c6(ArrayList<Integer> l, ArrayList<Integer> s) {
        // write your logic here
        
        // return True if your logic passes successfully
        return False;
    }

    
    public static boolean isSublist_Problem_2_e7f8333f_431f_492c_a41e_fef23a940fe0(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) return False;
        for (int i = 0; i < l.size() - s.size() + 1; i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean isSublist_Problem_2_e7f8333f_431f_492c_a41e_fef23a940fe0 = True;
                for (int j = 0; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        isSublist_Problem_2_e7f8333f_431f_492c_a41e_fef23a940fe0 = False;
                        break;
                    }
                }
                if (isSublist_Problem_2_e7f8333f_431f_492c_a41e_fef23a940fe0) return True;
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_2_1b6d5d47_a3c9_4406_a7c6_c2f6a207f1d1(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (l.size() < s.size()) return False;
        for (int i = 0; i < s.size(); i++) {
            if (l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_1_6fe7fd3a_ed60_4500_82f7_6b3b551128fc(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0, j = 0;
        while (i < l.size() && j < s.size()) {
            if (l.get(i) == s.get(j)) {
                i++;
                j++;
            } else {
                j++;
            }
        }
        return i == l.size();
    }

    
    public static boolean isSublist_Problem_2_e23fea05_7bed_4d3d_b7c8_289fb7ccbbdc(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) return False;
        for (int i = 0; i < l.size() - s.size() + 1; i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean found = True;
                for (int j = 0; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        found = False;
                        break;
                    }
                }
                if (found) return True;
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_2_a4dd864c_4405_4344_a1e9_b62f25f91053(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() > s.size()) return False;
        for(int i = 0; i < l.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_2_127ad148_9f40_4c0e_8d08_4078175bd1f6(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_2_c159444a_a3ee_464f_b236_828b0f5ae838(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_0_5efb342a_c9d6_4791_9057_0366e49d81ea(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() > s.size()) return False;
        for(int i = 0; i < l.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_1_f55923ea_3112_49a1_a3d0_336f6e2d9b21(ArrayList<Integer> l, ArrayList<Integer> s) {
        boolean result = False;

        for(int i=0;i<l.size();i++) {
            for(int j=0;j<s.size();j++) {
                if(l.get(i) == s.get(j)) {
                    result = True;
                    break;
                }
            }
        }

        return result;
    }

    
    public static boolean isSublist_Problem_0_e943792f_b615_45f5_8f5a_d83e79c404b8(ArrayList<Integer> l, ArrayList<Integer> s) {
        ArrayList<Integer> temp = new ArrayList<>();
        for(int i = 0; i < l.size(); i++) {
            for(int j = 0; j < s.size(); j++) {
                if(l.get(i) == s.get(j)) {
                    temp.add(l.get(i));
                }
            }
        }
        return temp.size() == s.size();
    }

    
    public static boolean isSublist_Problem_1_19964757_e378_41de_b4c3_82315fe95d29(ArrayList<Integer> l, ArrayList<Integer> s) {
        return l.stream().filter(x -> s.contains(x)).count() == s.size();
    }

    
    public static boolean isSublist_Problem_0_71f7248b_3bf3_4fc0_9e05_f0bf24076ae2(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (l.size() < s.size()) return False;
        for (int i = 0; i < s.size(); i++) {
            if (l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_1_5c1baabd_1aa2_4166_b36f_c4d4c1f9eb1f(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0, j = 0;
        for(; i < l.size() && j < s.size(); ++i, ++j) {
            if(l.get(i) != s.get(j)) {
                return False;
            }
        }
        return i == l.size() && j == s.size();
    }

    
    public static boolean isSublist_Problem_1_29773024_5cd1_4a64_aafd_61be34a23812(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0;
        int j = 0;
        while (i < l.size() && j < s.size()) {
            if (l.get(i) == s.get(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        return i == l.size() && j == s.size();
    }

    
    public static boolean isSublist_Problem_1_29773024_5cd1_4a64_aafd_61be34a23812(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0;
        int j = 0;
        while (i < l.size() && j < s.size()) {
            if (l.get(i) == s.get(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        return i == l.size() && j == s.size();
    }

    
    public static boolean isSublist_Problem_2_7401dd33_967a_4531_a5a9_a2308e35595f(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_2_f54a3128_8885_4069_8652_60fe5d13d732(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < l.size() && j < s.size()) {
            if (l.get(i) == s.get(j)) {
                i++;
                j++;
                k++;
            } else if (l.get(i) < s.get(j)) {
                i++;
            } else {
                j++;
            }
        }
        return k == s.size();
    }

    
    public static boolean isSublist_Problem_2_42e002fe_f5c7_4e98_98ed_51396757190c(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_1_7bd62da5_25d5_495f_b2f3_148950e68130(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_2_a93d600f_5eb0_420c_97dc_facace1df003(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i <= l.size() - s.size(); i++) {
            if (l.subList(i, i + s.size()).equals(s)) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_0_faf380bd_f094_4060_8058_a50851febda2(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0, j = 0;
        while(i < l.size() && j < s.size()) {
            if(l.get(i) == s.get(j)) {
                i++;
                j++;
            } else {
                j = 0;
            }
        }
        return i == l.size() && j == s.size();
    }

    
    public static boolean isSublist_Problem_0_efd584f7_b0a6_41c0_986d_7daff7eac888(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() > s.size()) return False;
        for(int i = 0; i < l.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_1_84382b2e_5e6a_4d76_8542_f61edd750eb9(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_2_5aeee13e_a1e5_4f9b_b756_45d8f2914ecf(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i < l.size() - s.size() + 1; i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean found = True;
                for (int j = 0; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        found = False;
                        break;
                    }
                }
                if (found) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_1_a2aaa76d_7bd8_40e0_b8df_28bcbda0d3a1(ArrayList<Integer> l, ArrayList<Integer> s) {
        // Your code here
        return l.containsAll(s);
    }

    
    public static boolean isSublist_Problem_2_a33aa094_066c_4b60_b51f_0fd2d35d38bf(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0, j = 0;
        while(i < l.size() && j < s.size()) {
            if(l.get(i) == s.get(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        return i == l.size() && j == s.size();
    }

    
    public static boolean isSublist_Problem_1_3d69f560_19d5_49bb_aa0d_ed21656df0e7(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() > s.size()) return False;
        for(int i = 0; i < l.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_2_e1a9fcfa_2092_4573_a354_214f0f08d849(ArrayList<Integer> l, ArrayList<Integer> s) {
        // Write your code in Java 7
        ArrayList<Integer> result = new ArrayList<>();
        boolean flag = False;
        for(Integer value : l) {
            flag = True;
            for(Integer value1 : s) {
                if(value == value1) {
                    flag = False;
                    break;
                }
            }
            if(flag) result.add(value);
        }
        return result.equals(s);
    }

    
    public static boolean isSublist_Problem_0_b989c033_a94f_4df3_87bf_3dbf48037b8c(ArrayList<Integer> l, ArrayList<Integer> s) {
        return s.stream().anyMatch(l::contains);
    }

    
    public static boolean isSublist_Problem_0_6e732b6b_6ef0_483a_a871_e620db647710(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_1_2d81b165_e11c_48cc_ae38_19008e66e8cd(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_2_0e8b6fc2_3e87_476c_9a32_c734044ac125(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i <= l.size() - s.size(); i++) {
            if (l.subList(i, i + s.size()).equals(s)) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_2_15c00517_442b_490b_a360_5b8b037bccf3(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_2_e339f743_01b0_4128_90d1_88c34d6fcd9e(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i < l.size() - s.size() + 1; i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean isSublist_Problem_2_e339f743_01b0_4128_90d1_88c34d6fcd9e = True;
                for (int j = 0; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        isSublist_Problem_2_e339f743_01b0_4128_90d1_88c34d6fcd9e = False;
                        break;
                    }
                }
                if (isSublist_Problem_2_e339f743_01b0_4128_90d1_88c34d6fcd9e) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_0_cb159ef9_d5d8_4872_821e_0fdd82470018(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) return False;
        for (int i = 0; i < l.size() - s.size() + 1; i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean isSub = True;
                for (int j = 0; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        isSub = False;
                        break;
                    }
                }
                if (isSub) return True;
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_0_d81341e5_9025_401e_bc26_59dd0a0480b6(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() <= 1) {
            return True;
        }
        List<Integer> l1 = l.subList(0, l.size()-1);
        List<Integer> s1 = s.subList(0, s.size() - 1);
        return l1.equals(s1);
    }

    
    public static boolean isSublist_Problem_2_e5d05d03_976f_4c60_b436_e4c38871f04b(ArrayList<Integer> l, ArrayList<Integer> s) {
        // TODO Auto-generated method stub
        return l.equals(s);
    }

    
    public static boolean isSublist_Problem_1_904306f2_d67f_48dd_b282_1b9babb49892(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i <= l.size() - s.size(); i++) {
            if (l.get(i).equals(s.get(0))) {
                int j = 0;
                while (j < s.size() && l.get(i + j).equals(s.get(j))) {
                    j++;
                }
                if (j == s.size()) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_0_1c273275_0945_4334_8a52_149e439eb20c(ArrayList<Integer> l, ArrayList<Integer> s) {
        // Your code here
        // The idea is to keep a flag indicating whether a particular sub-array is present or not.
        // If flag is set to True, then it means the sub-array is present and hence return True else return False.
        boolean flag = False;

        for(int i=0; i<l.size()-1; i++) {
            for(int j=i+1; j<l.size(); j++) {
                if (s.get(i).equals(l.get(j))) {
                    flag = True;
                }
            }
        }
        return flag;
    }

    
    public static boolean isSublist_Problem_2_c7ff9ba8_02c9_4557_a927_4b21b1c7900a(ArrayList<Integer> l, ArrayList<Integer> s) {
        int n = l.size();
        int m = s.size();
        for (int i = 0; i <= n - m; i++) {
            int j;
            for (j = 0; j < m; j++)
                if (l.get(i + j) != s.get(j))
                    break;
            if (j == m)
                return True;
        }
        return False;
    }

    
    public static boolean isSublist_Problem_2_92758852_112a_4f79_bf3f_8b6cf645523b(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < l.size() && j < s.size()) {
            if (l.get(i) == s.get(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        return i == l.size() && j == s.size();
    }

    
    public static boolean isSublist_Problem_0_8711275a_a953_48a3_ae22_82cd2900cbab(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i <= l.size() - s.size(); i++) {
            if (l.subList(i, i + s.size()).equals(s)) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_1_f93ca3a5_a989_4dd3_83a7_64b2ab455c32(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) return False;
        for (int i = 0; i <= l.size() - s.size(); i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean isSub = True;
                for (int j = 0; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        isSub = False;
                        break;
                    }
                }
                if (isSub) return True;
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_2_99cf8c5b_5f6d_4c94_9e78_5c21e9d84300(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i <= l.size() - s.size(); i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean found = True;
                for (int j = 1; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        found = False;
                        break;
                    }
                }
                if (found) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_0_e5c1dbcf_c11f_4d45_b187_56ca589505fa(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_1_1d88c5db_58b5_484e_9e97_bf031ce3837f(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) return False;
        for (int i = 0; i < l.size(); i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean found = True;
                for (int j = 1; j < s.size(); j++) {
                    if (i + j >= l.size() || !l.get(i + j).equals(s.get(j))) {
                        found = False;
                        break;
                    }
                }
                if (found) return True;
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_0_4019ed98_ba78_4932_a75a_9fce73e53e07(ArrayList<Integer> l, ArrayList<Integer> s) {
        int n = l.size();
        int m = s.size();
        if (m > n) {
            return False;
        }
        for (int i = 0; i <= n - m; i++) {
            int j;
            for (j = 0; j < m; j++) {
                if (l.get(i + j) != s.get(j)) {
                    break;
                }
            }
            if (j == m) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_1_e4784f26_cac5_4fbb_8a1f_2ea48f8ec6f7(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0;
        int j = 0;
        int k = 0;
        int l_size = l.size();
        int s_size = s.size();
        while (i < l_size && j < s_size) {
            if (l.get(i) == s.get(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        if (i == l_size && j == s_size) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isSublist_Problem_2_913cc9f6_b1a0_486a_aeed_6b538c98138e(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0;
        int j = 0;
        int k = 0;
        int ln = l.size();
        int sn = s.size();
        while (i < ln && j < sn) {
            if (l.get(i) == s.get(j)) {
                i++;
                j++;
                k++;
            } else if (l.get(i) < s.get(j)) {
                i++;
            } else {
                j++;
            }
        }
        return k == sn;
    }

    
    public static boolean isSublist_Problem_1_e977f4f6_98ba_4c8d_a08e_f54f42146c65(ArrayList<Integer> l, ArrayList<Integer> s) {
        ArrayList<Integer> temp = new ArrayList<>();
        for(int i = 0; i < l.size(); i++) {
            for(int j = 0; j < s.size(); j++) {
                if(l.get(i) == s.get(j)) {
                    temp.add(l.get(i));
                }
            }
        }
        return temp.size() == s.size();
    }

    
    public static boolean isSublist_Problem_1_4e1be89f_f0d5_4782_9c08_724f2071bd64(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) return False;
        for (int i = 0; i < l.size() - s.size() + 1; i++) {
            boolean found = True;
            for (int j = 0; j < s.size(); j++) {
                if (l.get(i + j) != s.get(j)) {
                    found = False;
                    break;
                }
            }
            if (found) return True;
        }
        return False;
    }

    
    public static boolean isSublist_Problem_1_14b635ef_41a6_4a08_9f37_9a72fb0c9ff8(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() > s.size()) return False;
        for(int i = 0; i < l.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_1_9d5e78d3_2626_4826_9167_0e891439ff60(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_1_dbc6bda3_1838_4f34_983a_220315ce3c8e(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_2_913cc9f6_b1a0_486a_aeed_6b538c98138e(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0;
        int j = 0;
        int k = 0;
        int ln = l.size();
        int sn = s.size();
        while (i < ln && j < sn) {
            if (l.get(i) == s.get(j)) {
                i++;
                j++;
                k++;
            } else if (l.get(i) < s.get(j)) {
                i++;
            } else {
                j++;
            }
        }
        return k == sn;
    }

    
    public static boolean isSublist_Problem_1_57c0d0c2_66fb_40b6_8fa9_050d6cb74b0c(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_1_c0c5ae37_d768_40aa_b6b7_7c7526c96848(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i <= l.size() - s.size(); i++) {
            if (l.get(i) == s.get(0)) {
                boolean match = True;
                for (int j = 0; j < s.size(); j++) {
                    if (l.get(i + j) != s.get(j)) {
                        match = False;
                        break;
                    }
                }
                if (match) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_0_dd75e223_e73d_44db_9920_5eee3bf27b6b(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i <= l.size() - s.size(); i++) {
            if (l.get(i).equals(s.get(0))) {
                int j = 0;
                while (j < s.size() && l.get(i + j).equals(s.get(j))) {
                    j++;
                }
                if (j == s.size()) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_2_53bb7d4e_2ac8_4674_a15d_6322bca1b83d(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0;
        int j = 0;
        while (i < l.size() && j < s.size()) {
            if (l.get(i) == s.get(j)) {
                i++;
                j++;
            } else if (l.get(i) < s.get(j)) {
                i++;
            } else {
                j++;
            }
        }
        return i == l.size() && j == s.size();
    }

    
    public static boolean isSublist_Problem_2_45590d8e_5ce2_42fe_aeb4_11c4003f1fbf(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i < l.size() - s.size() + 1; i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean flag = True;
                for (int j = 1; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        flag = False;
                        break;
                    }
                }
                if (flag) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_0_7e598dd8_eac1_411a_95f1_7c42c242fc6d(ArrayList<Integer> l, ArrayList<Integer> s) {
        // Write your code here.
        int i=0,j=0;
        while(i<l.size() && j<s.size()){
            if (l.get(i)==s.get(j)) {
                i++;
                j++;
            }
            if (i<l.size()){
                i++;
            }
            if (j<s.size()){
                j++;
            }
        }
        return i<l.size() && j<s.size();
    }

    
    public static boolean isSublist_Problem_0_76dbadc1_3878_4324_9af3_b38fab665e78(ArrayList<Integer> l, ArrayList<Integer> s) {
        boolean isSublist_Problem_0_76dbadc1_3878_4324_9af3_b38fab665e78 = False;
        if (s.size() > l.size()) {
            return False;
        } else {
            l.removeAll(new ArrayList<>());
            isSublist_Problem_0_76dbadc1_3878_4324_9af3_b38fab665e78 = l.equals(s);
        }
        return isSublist_Problem_0_76dbadc1_3878_4324_9af3_b38fab665e78;
    }

    
    public static boolean isSublist_Problem_1_0724c605_ddfe_490d_9654_9b42f5f0eb8e(ArrayList<Integer> l, ArrayList<Integer> s) {
        ArrayList<Integer> sublist = new ArrayList<>();
        for(int i = 0; i < l.size(); i++) {
            for(int j = 0; j < s.size(); j++) {
                if(l.get(i) == s.get(j)) {
                    sublist.add(l.get(i));
                }
            }
        }
        return sublist.equals(s);
    }

    
    public static boolean isSublist_Problem_2_5c7a495b_c9ba_4d66_9dc9_fbcfc53598cd(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_0_f6d643af_0e52_475d_a038_8900d870eeb8(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0;
        int j = 0;
        while (i < l.size() && j < s.size()) {
            if (l.get(i) == s.get(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        return i == l.size() && j == s.size();
    }

    
    public static boolean isSublist_Problem_1_be3c9e8b_bbe3_4808_a9d9_5e6d322cbbcf(ArrayList<Integer> l, ArrayList<Integer> s) {
        int n = l.size();
        int m = s.size();
        for (int i = 0; i <= n - m; i++) {
            int j;
            for (j = 0; j < m; j++) {
                if (l.get(i + j) != s.get(j)) {
                    break;
                }
            }
            if (j == m) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_0_f54a3128_8885_4069_8652_60fe5d13d732(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < l.size() && j < s.size()) {
            if (l.get(i) == s.get(j)) {
                i++;
                j++;
                k++;
            } else if (l.get(i) < s.get(j)) {
                i++;
            } else {
                j++;
            }
        }
        return k == s.size();
    }

    
    public static boolean isSublist_Problem_1_3e1f83a3_1c35_4a6e_a7ad_e7a913275b34(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0;
        int j = 0;
        while(i < l.size() && j < s.size()) {
            if(l.get(i) == s.get(j)) {
                i++;
                j++;
            } else {
                i = i + j - 1;
                j = 0;
            }
        }
        return i == l.size() && j == s.size();
    }

    
    public static boolean isSublist_Problem_0_8934fb96_4d08_4e27_98c0_c8ce0b010034(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_2_62ecd39b_07f7_4daa_892d_6a43b92953b3(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_0_edb7ce5e_bbc8_4c4f_af86_4f0a1cd438a0(ArrayList<Integer> l, ArrayList<Integer> s) {
        return l.size() <= 1 || s.isEmpty() ? True : l.containsAll(s);
    }

    
    public static boolean isSublist_Problem_0_e160d2f5_3d67_451a_add2_64ef9853e198(ArrayList<Integer> l, ArrayList<Integer> s) {
        ArrayList<Integer> sub = new ArrayList<>();
        l.forEach(x -> {
            s.forEach(y -> {
                if (x.equals(y)) {
                    sub.add(x);
                }
            });
        });
        return sub.isEmpty();
    }

    
    public static boolean isSublist_Problem_1_ba075ef2_5597_4ffc_a5aa_343f9df0682a(ArrayList<Integer> l, ArrayList<Integer> s) {
        ArrayList<Integer> sublist = new ArrayList<>();
        for(Integer i : l) {
            for(Integer j : s) {
                if(i == j) {
                    sublist.add(i);
                }
            }
        }
        return sublist.equals(s);
    }

    
    public static boolean isSublist_Problem_1_eca1002e_8fa1_4814_9b74_7ba4f3034978(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_2_faf380bd_f094_4060_8058_a50851febda2(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0, j = 0;
        while(i < l.size() && j < s.size()) {
            if(l.get(i) == s.get(j)) {
                i++;
                j++;
            } else {
                j = 0;
            }
        }
        return i == l.size() && j == s.size();
    }

    
    public static boolean isSublist_Problem_1_eb51cdd1_244d_4820_a34d_863c3f733264(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_1_b9a0b66f_88b2_4bcb_9613_8b97dd47942c(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_2_2d0d6941_9055_451a_8114_09cb579e822f(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) return False;
        for (int i = 0; i <= l.size() - s.size(); i++) {
            if (l.subList(i, i + s.size()).equals(s)) return True;
        }
        return False;
    }

    
    public static boolean isSublist_Problem_1_fa1dc739_7b6b_43eb_a565_5a1375dc5a64(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) return False;
        for (int i = 0; i < l.size() - s.size() + 1; i++) {
            if (l.get(i).equals(s.get(0))) {
                int j = 0;
                for (; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) break;
                }
                if (j == s.size()) return True;
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_1_986d93c4_f89a_4e8d_a7a7_0d9146e8dda6(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i < l.size() - s.size() + 1; i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean isSublist_Problem_1_986d93c4_f89a_4e8d_a7a7_0d9146e8dda6 = True;
                for (int j = 1; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        isSublist_Problem_1_986d93c4_f89a_4e8d_a7a7_0d9146e8dda6 = False;
                        break;
                    }
                }
                if (isSublist_Problem_1_986d93c4_f89a_4e8d_a7a7_0d9146e8dda6) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_1_47ba365b_0d76_4285_9914_4f5268f08624(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.isEmpty()) {
            return True;
        } else {
            boolean result = False;
            for (int i = 0; i < l.size(); i++) {
                boolean found = False;
                for (int j = 0; j < s.size(); j++) {
                    if (l.get(i).compareTo(s.get(i)) < 0) {
                        found = True;
                        break;
                    }
                }
                if (!found) {
                    result = True;
                    break;
                }
            }
            return result;
        }
    }

    
    public static boolean isSublist_Problem_0_fde1641d_00d5_4ee9_8ca2_ac7857cc5d2b(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) return False;
        for (int i = 0; i <= l.size() - s.size(); i++) {
            if (l.subList(i, i + s.size()).equals(s)) return True;
        }
        return False;
    }

    
    public static boolean isSublist_Problem_2_037b7496_618a_49a0_be6e_72fffe8932a6(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i <= l.size() - s.size(); i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean found = True;
                for (int j = 1; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        found = False;
                        break;
                    }
                }
                if (found) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_2_5c1baabd_1aa2_4166_b36f_c4d4c1f9eb1f(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0, j = 0;
        for(; i < l.size() && j < s.size(); ++i, ++j) {
            if(l.get(i) != s.get(j)) {
                return False;
            }
        }
        return i == l.size() && j == s.size();
    }

    
    public static boolean isSublist_Problem_0_1c273275_0945_4334_8a52_149e439eb20c(ArrayList<Integer> l, ArrayList<Integer> s) {
        // Your code here
        // The idea is to keep a flag indicating whether a particular sub-array is present or not.
        // If flag is set to True, then it means the sub-array is present and hence return True else return False.
        boolean flag = False;

        for(int i=0; i<l.size()-1; i++) {
            for(int j=i+1; j<l.size(); j++) {
                if (s.get(i).equals(l.get(j))) {
                    flag = True;
                }
            }
        }
        return flag;
    }

    
    public static boolean isSublist_Problem_2_7e2fe111_cbfc_4065_be2d_b672f67c20c6(ArrayList<Integer> l, ArrayList<Integer> s) {
        ArrayList<Integer> ll = new ArrayList<Integer>(l);
        ArrayList<Integer> sl = new ArrayList<Integer>(s);
        return ll.containsAll(sl);
    }

    
    public static boolean isSublist_Problem_1_69ed85ff_5780_4fd6_9714_f9f28f22bede(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0, j = 0;
        while (i < l.size() && j < s.size()) {
            if (l.get(i) == s.get(j)) {
                i++;
                j++;
            } else {
                j = 0;
            }
        }
        return i == l.size() && j == s.size();
    }

    
    public static boolean isSublist_Problem_0_b6f53d05_b6da_430f_b239_adab87e082d0(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < l.size() && j < s.size()) {
            if (l.get(i) == s.get(j)) {
                i++;
                j++;
                k++;
            } else if (l.get(i) < s.get(j)) {
                i++;
            } else {
                j++;
            }
        }
        return k == s.size();
    }

    
    public static boolean isSublist_Problem_0_991f573a_5e91_437f_ada8_5a6482a323f8(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() > s.size()) return False;
        for(int i = 0; i < l.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_0_e977f4f6_98ba_4c8d_a08e_f54f42146c65(ArrayList<Integer> l, ArrayList<Integer> s) {
        ArrayList<Integer> temp = new ArrayList<>();
        for(int i = 0; i < l.size(); i++) {
            for(int j = 0; j < s.size(); j++) {
                if(l.get(i) == s.get(j)) {
                    temp.add(l.get(i));
                }
            }
        }
        return temp.size() == s.size();
    }

    
    public static boolean isSublist_Problem_2_69ea369b_9248_4e04_a177_5398b836e7e0(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) return False;
        for (int i = 0; i <= l.size() - s.size(); i++) {
            if (l.subList(i, i + s.size()).equals(s)) return True;
        }
        return False;
    }

    
    public static boolean isSublist_Problem_0_1612fc47_710a_4d52_bb90_7ad32931f963(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_2_68a72de4_7465_4ebf_9e15_ba04af519880(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (l.size() < s.size()) return False;
        for (int i = 0; i < s.size(); i++) {
            if (l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_0_e5c1dbcf_c11f_4d45_b187_56ca589505fa(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_2_3cd41338_ee26_482d_bb1d_9f466c1534c6(ArrayList<Integer> l, ArrayList<Integer> s) {
        boolean flag = False;
        for(int i = 0; i < l.size(); i++) {
            for(int j = 0; j < s.size(); j++) {
                if(l.get(i) == s.get(j)) {
                    flag = True;
                    break;
                }
            }
        }
        return flag;
    }

    
    public static boolean isSublist_Problem_0_faf380bd_f094_4060_8058_a50851febda2(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0, j = 0;
        while(i < l.size() && j < s.size()) {
            if(l.get(i) == s.get(j)) {
                i++;
                j++;
            } else {
                j = 0;
            }
        }
        return i == l.size() && j == s.size();
    }

    
    public static boolean isSublist_Problem_2_29773024_5cd1_4a64_aafd_61be34a23812(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0;
        int j = 0;
        while (i < l.size() && j < s.size()) {
            if (l.get(i) == s.get(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        return i == l.size() && j == s.size();
    }

    
    public static boolean isSublist_Problem_0_644c5fdd_47bf_4fd0_b848_3eabbee27f73(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i <= l.size() - s.size(); i++) {
            if (l.get(i) == s.get(0)) {
                boolean found = True;
                for (int j = 1; j < s.size(); j++) {
                    if (l.get(i + j) != s.get(j)) {
                        found = False;
                        break;
                    }
                }
                if (found) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_2_b9a0b66f_88b2_4bcb_9613_8b97dd47942c(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_0_9d56c486_1776_47c7_acbb_ba8214ebab31(ArrayList<Integer> l, ArrayList<Integer> s) {
        boolean res = True;
        for (Integer i : s) {
            for (Integer j : l) {
                if (i == j) {
                    res = False;
                    break;
                }
            }
        }
        return res;
    }

    
    public static boolean isSublist_Problem_2_aef8d866_ae7d_424b_86cb_b447babeca9a(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0;
        int j = 0;
        while (i < l.size() && j < s.size()) {
            if (l.get(i) == s.get(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        return i == l.size() && j == s.size();
    }

    
    public static boolean isSublist_Problem_2_70dcfe58_a16a_4028_bacb_f5e3c4674b77(ArrayList<Integer> l, ArrayList<Integer> s) {
        // write your code here
        int i = 0, j = 0;
        ArrayList<Integer> a = new ArrayList<Integer>(l);
        ArrayList<Integer> b = new ArrayList<Integer>(s);
        int n = a.size();
        int m = b.size();
        if (n != m) {
            return False;
        }
        ArrayList<Integer> x = new ArrayList<Integer>();
        ArrayList<Integer> y = new ArrayList<Integer>();
        for (i = 0; i < n; i++) {
            if (a.get(i) == b.get(j)) {
                x.add(a.get(i));
                j++;
            } else {
                y.add(a.get(i));
            }
        }
        if (x.size() != y.size()) {
            return False;
        } else {
            return True;
        }
    }

    
    public static boolean isSublist_Problem_2_529e52f7_3aa9_4177_8d09_f97616c4e75c(ArrayList<Integer> l, ArrayList<Integer> s) {
        int n = l.size();
        int m = s.size();
        if (m > n) return False;
        int i = 0, j = 0;
        while (i < n && j < m) {
            if (l.get(i).equals(s.get(j))) {
                i++;
                j++;
            } else {
                i = i - j + 1;
                j = 0;
            }
        }
        return j == m;
    }

    
    public static boolean isSublist_Problem_1_e7002282_3b21_4dbb_80b7_088bbd14be23(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (l.size() < s.size()) return False;
        for (int i = 0; i < s.size(); i++) {
            if (l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_1_38995b30_3cf6_4f36_a9e1_c962adc9cad6(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size())
            return False;
        for (int i = 0; i <= l.size() - s.size(); i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean isSublist_Problem_1_38995b30_3cf6_4f36_a9e1_c962adc9cad6 = True;
                for (int j = 1; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        isSublist_Problem_1_38995b30_3cf6_4f36_a9e1_c962adc9cad6 = False;
                        break;
                    }
                }
                if (isSublist_Problem_1_38995b30_3cf6_4f36_a9e1_c962adc9cad6)
                    return True;
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_0_4d03905f_69e0_46bb_8221_8d15aa65eb2a(ArrayList<Integer> l, ArrayList<Integer> s) {
        return l.stream()
                .anyMatch(x -> s.stream().anyMatch(y->x==y));
    }

    
    public static boolean isSublist_Problem_0_45590d8e_5ce2_42fe_aeb4_11c4003f1fbf(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i < l.size() - s.size() + 1; i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean flag = True;
                for (int j = 1; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        flag = False;
                        break;
                    }
                }
                if (flag) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_0_5efb342a_c9d6_4791_9057_0366e49d81ea(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() > s.size()) return False;
        for(int i = 0; i < l.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_0_e59b0aae_91fe_4836_9e60_b8c129f41d8a(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i < l.size() - s.size() + 1; i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean isSublist_Problem_0_e59b0aae_91fe_4836_9e60_b8c129f41d8a = True;
                for (int j = 0; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        isSublist_Problem_0_e59b0aae_91fe_4836_9e60_b8c129f41d8a = False;
                        break;
                    }
                }
                if (isSublist_Problem_0_e59b0aae_91fe_4836_9e60_b8c129f41d8a) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_2_92fc83ab_9be0_4a80_b6f0_6508fbf4befd(ArrayList<Integer> l, ArrayList<Integer> s) {
        ArrayList<Integer> sublist = new ArrayList<Integer>();
        for(int i = 0; i < l.size(); i++) {
            for(int j = 0; j < s.size(); j++) {
                if(l.get(i) == s.get(j)) {
                    sublist.add(l.get(i));
                }
            }
        }
        return sublist.equals(s);
    }

    
    public static boolean isSublist_Problem_0_a9f444ea_bdfe_445a_8b35_44142f4cde1f(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) return False;
        for (int i = 0; i < l.size() - s.size() + 1; i++) {
            if (l.get(i).equals(s.get(0))) {
                int j = 0;
                while (j < s.size() && l.get(i + j).equals(s.get(j))) j++;
                if (j == s.size()) return True;
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_2_ce29be5d_d3a1_4885_a668_ad13d57c6581(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i <= l.size() - s.size(); i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean isSublist_Problem_2_ce29be5d_d3a1_4885_a668_ad13d57c6581 = True;
                for (int j = 0; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        isSublist_Problem_2_ce29be5d_d3a1_4885_a668_ad13d57c6581 = False;
                        break;
                    }
                }
                if (isSublist_Problem_2_ce29be5d_d3a1_4885_a668_ad13d57c6581) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_0_1b6d5d47_a3c9_4406_a7c6_c2f6a207f1d1(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (l.size() < s.size()) return False;
        for (int i = 0; i < s.size(); i++) {
            if (l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_1_3a2d7af0_5130_4f04_85cf_737ba3eb71b5(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) return False;
        for (int i = 0; i <= l.size() - s.size(); i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean isSublist_Problem_1_3a2d7af0_5130_4f04_85cf_737ba3eb71b5 = True;
                for (int j = 1; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        isSublist_Problem_1_3a2d7af0_5130_4f04_85cf_737ba3eb71b5 = False;
                        break;
                    }
                }
                if (isSublist_Problem_1_3a2d7af0_5130_4f04_85cf_737ba3eb71b5) return True;
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_0_e4784f26_cac5_4fbb_8a1f_2ea48f8ec6f7(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0;
        int j = 0;
        int k = 0;
        int l_size = l.size();
        int s_size = s.size();
        while (i < l_size && j < s_size) {
            if (l.get(i) == s.get(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        if (i == l_size && j == s_size) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isSublist_Problem_2_92a12aef_8427_45eb_99a2_05060d255098(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_2_529e52f7_3aa9_4177_8d09_f97616c4e75c(ArrayList<Integer> l, ArrayList<Integer> s) {
        int n = l.size();
        int m = s.size();
        if (m > n) return False;
        int i = 0, j = 0;
        while (i < n && j < m) {
            if (l.get(i).equals(s.get(j))) {
                i++;
                j++;
            } else {
                i = i - j + 1;
                j = 0;
            }
        }
        return j == m;
    }

    
    public static boolean isSublist_Problem_0_9e6c4162_4c3d_4f23_963d_96304927b7f5(ArrayList<Integer> l, ArrayList<Integer> s) {
        ArrayList<Integer> sublist = s.stream().filter(el -> !l.contains(el)).collect(Collectors.toCollection(ArrayList::new));
        return l.stream().noneMatch(el -> sublist.contains(el));
    }

    
    public static boolean isSublist_Problem_2_84ab34bc_92ac_4c34_b6e6_8c56b40a7a4c(ArrayList<Integer> l, ArrayList<Integer> s) {
        boolean flag = False;
        if (s.isEmpty()) {
            return flag;
        }
        for (int i = 0; i < l.size() - s.size(); i++) {
            if (l.subList(i, i + s.size()).equals(s)) {
                flag = True;
            }
        }
        return flag;
    }

    
    public static boolean isSublist_Problem_1_230f8b6b_cc74_49eb_abc9_558fbeee96a0(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < l.size() && j < s.size()) {
            if (l.get(i) == s.get(j)) {
                i++;
                j++;
                k++;
            } else if (l.get(i) < s.get(j)) {
                i++;
            } else {
                j++;
            }
        }
        return k == s.size();
    }

    
    public static boolean isSublist_Problem_1_529e52f7_3aa9_4177_8d09_f97616c4e75c(ArrayList<Integer> l, ArrayList<Integer> s) {
        int n = l.size();
        int m = s.size();
        if (m > n) return False;
        int i = 0, j = 0;
        while (i < n && j < m) {
            if (l.get(i).equals(s.get(j))) {
                i++;
                j++;
            } else {
                i = i - j + 1;
                j = 0;
            }
        }
        return j == m;
    }

    
    public static boolean isSublist_Problem_0_a012c966_f4bd_4a32_9a91_d479c763eac1(ArrayList<Integer> l, ArrayList<Integer> s) {
        // Write your code here
        return s.containsAll(l);
    }

    
    public static boolean isSublist_Problem_1_68a72de4_7465_4ebf_9e15_ba04af519880(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (l.size() < s.size()) return False;
        for (int i = 0; i < s.size(); i++) {
            if (l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_1_53bb7d4e_2ac8_4674_a15d_6322bca1b83d(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0;
        int j = 0;
        while (i < l.size() && j < s.size()) {
            if (l.get(i) == s.get(j)) {
                i++;
                j++;
            } else if (l.get(i) < s.get(j)) {
                i++;
            } else {
                j++;
            }
        }
        return i == l.size() && j == s.size();
    }

    
    public static boolean isSublist_Problem_1_9ad6a662_7858_48ad_9297_0af067054f9b(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_0_77ec45a3_5a40_4290_900b_a2ef31df38a4(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_0_47ba365b_0d76_4285_9914_4f5268f08624(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.isEmpty()) {
            return True;
        } else {
            boolean result = False;
            for (int i = 0; i < l.size(); i++) {
                boolean found = False;
                for (int j = 0; j < s.size(); j++) {
                    if (l.get(i).compareTo(s.get(i)) < 0) {
                        found = True;
                        break;
                    }
                }
                if (!found) {
                    result = True;
                    break;
                }
            }
            return result;
        }
    }

    
    public static boolean isSublist_Problem_0_3b54570c_a60d_4527_b9d3_ba1ebaebb85b(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0, j = 0;
        while (i < l.size() && j < s.size()) {
            if (l.get(i) == s.get(j)) {
                i++;
                j++;
            } else {
                j = 0;
            }
        }
        return i == l.size();
    }

    
    public static boolean isSublist_Problem_2_d51cfe8d_a2aa_4c64_998c_5ddadb4f72d3(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i < l.size() - s.size() + 1; i++) {
            if (l.get(i).equals(s.get(0))) {
                int j = 0;
                for (; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        break;
                    }
                }
                if (j == s.size()) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_0_8ca63073_15ed_4284_8d2e_60a00b3a4f8a(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_0_d65ee803_bfb6_4a1e_b246_91b96315d905(ArrayList<Integer> l, ArrayList<Integer> s) {
        ArrayList<Integer> sublist = new ArrayList<>();
        for(Integer i : s) {
            for(Integer j : l) {
                if(i.equals(j)) {
                    sublist.add(i);
                }
            }
        }
        return sublist.equals(l);
    }

    
    public static boolean isSublist_Problem_0_ed5f0390_8ef6_4fd7_8515_d15ae214c8a8(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i <= l.size() - s.size(); i++) {
            if (l.subList(i, i + s.size()).equals(s)) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_1_a2f48f4d_7e72_400e_9e78_11616e0f6ab8(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_1_8d41e7c9_22ea_41e9_b164_13adee9b0d88(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_2_45590d8e_5ce2_42fe_aeb4_11c4003f1fbf(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i < l.size() - s.size() + 1; i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean flag = True;
                for (int j = 1; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        flag = False;
                        break;
                    }
                }
                if (flag) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_2_76dbadc1_3878_4324_9af3_b38fab665e78(ArrayList<Integer> l, ArrayList<Integer> s) {
        boolean isSublist_Problem_2_76dbadc1_3878_4324_9af3_b38fab665e78 = False;
        if (s.size() > l.size()) {
            return False;
        } else {
            l.removeAll(new ArrayList<>());
            isSublist_Problem_2_76dbadc1_3878_4324_9af3_b38fab665e78 = l.equals(s);
        }
        return isSublist_Problem_2_76dbadc1_3878_4324_9af3_b38fab665e78;
    }

    
    public static boolean isSublist_Problem_1_9ad6a662_7858_48ad_9297_0af067054f9b(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_1_cd7f35a7_e401_406d_aea3_a9a67761906f(ArrayList<Integer> l, ArrayList<Integer> s) {
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> s1 = new ArrayList<>();
        for(Integer i : l) {
            l1.add(i);
        }
        for(Integer i : s) {
            s1.add(i);
        }
        if(l1.equals(s1)) {
            return True;
        }
        return False;
    }

    
    public static boolean isSublist_Problem_1_1a881533_0284_4000_aa94_33bd1ebeea11(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (l.size() < s.size()) {
            return False;
        }
        for (int i = 0; i < s.size(); i++) {
            if (l.get(i) != s.get(i)) {
                return False;
            }
        }
        return True;
    }

    
    public static boolean isSublist_Problem_2_a4328e1f_57f9_47c4_9190_887a59ee8dd4(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0;
        int j = 0;
        while (i < l.size() && j < s.size()) {
            if (l.get(i) == s.get(j)) {
                i++;
                j++;
            } else {
                j = 0;
            }
        }
        return i == l.size();
    }

    
    public static boolean isSublist_Problem_1_9f0d67b7_5b8e_4738_833d_ed0dce21ebe2(ArrayList<Integer> l, ArrayList<Integer> s) {
        ArrayList<Integer> temp = new ArrayList<>();
        for(Integer i : l) {
            for(Integer j : s) {
                if(i == j) {
                    temp.add(i);
                }
            }
        }
        boolean result = temp.isEmpty();
        return result;
    }

    
    public static boolean isSublist_Problem_1_71f7248b_3bf3_4fc0_9e05_f0bf24076ae2(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (l.size() < s.size()) return False;
        for (int i = 0; i < s.size(); i++) {
            if (l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_1_755f6ed7_a3f3_4d89_a1ce_8c5720ff542e(ArrayList<Integer> l, ArrayList<Integer> s) {
        return l.size() == s.size() && l.subList(0, s.size()).containsAll(s);
    }

    
    public static boolean isSublist_Problem_0_89601132_d6f3_4ce1_9c73_7869ab953205(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() > s.size()) return False;
        for(int i = 0; i < l.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_2_2a41d708_d094_4792_aa8d_5cb9daa41e63(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) return False;
        for (int i = 0; i < l.size() - s.size() + 1; i++) {
            boolean isSub = True;
            for (int j = 0; j < s.size(); j++) {
                if (l.get(i + j) != s.get(j)) {
                    isSub = False;
                    break;
                }
            }
            if (isSub) return True;
        }
        return False;
    }

    
    public static boolean isSublist_Problem_2_6a9e2cb0_fa71_4a3f_afb1_5753293228cd(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_2_480f13b1_2334_4593_97e5_1b30ddfb4a74(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i < l.size(); i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean isSublist_Problem_2_480f13b1_2334_4593_97e5_1b30ddfb4a74 = True;
                for (int j = 0; j < s.size(); j++) {
                    if (i + j >= l.size() || !l.get(i + j).equals(s.get(j))) {
                        isSublist_Problem_2_480f13b1_2334_4593_97e5_1b30ddfb4a74 = False;
                        break;
                    }
                }
                if (isSublist_Problem_2_480f13b1_2334_4593_97e5_1b30ddfb4a74) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_0_39d8cdb7_0b53_4aea_8520_e483726d3200(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0;
        int j = 0;
        boolean flag = False;
        if (s.isEmpty()) {
            return True;
        }
        if (l.isEmpty()) {
            return False;
        }
        if (s.equals(l)) {
            return True;
        }
        for (; i < l.size(); i++) {
            if (s.equals(l.get(i))) {
                flag = True;
            } else {
                flag = False;
                break;
            }
        }
        if (flag) {
            System.out.println("Sublist found");
        } else {
            System.out.println("Sublist not found.");
        }
        return False;
    }

    
    public static boolean isSublist_Problem_1_27dd5801_e88e_4542_9762_47fd1bfa575e(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i <= l.size() - s.size(); i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean isSublist_Problem_1_27dd5801_e88e_4542_9762_47fd1bfa575e = True;
                for (int j = 1; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        isSublist_Problem_1_27dd5801_e88e_4542_9762_47fd1bfa575e = False;
                        break;
                    }
                }
                if (isSublist_Problem_1_27dd5801_e88e_4542_9762_47fd1bfa575e) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_1_b6f53d05_b6da_430f_b239_adab87e082d0(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < l.size() && j < s.size()) {
            if (l.get(i) == s.get(j)) {
                i++;
                j++;
                k++;
            } else if (l.get(i) < s.get(j)) {
                i++;
            } else {
                j++;
            }
        }
        return k == s.size();
    }

    
    public static boolean isSublist_Problem_0_fc5a1f3c_0dca_441a_badf_6998fdfd6786(ArrayList<Integer> l, ArrayList<Integer> s) {
        return l.stream().anyMatch(a -> s.contains(a));
    }

    
    public static boolean isSublist_Problem_1_44dc0792_f6e7_4362_9c2b_ea47fe2bed8d(ArrayList<Integer> l, ArrayList<Integer> s) {
        List<Integer> al = new ArrayList<>();
        al.addAll(l.subList(1,l.size()));
        al.addAll(s.subList(1,s.size()));
        System.out.println(al);
        return al.containsAll(l);
    }

    
    public static boolean isSublist_Problem_0_b702b4dd_3bd1_4dfd_b4ff_a4dd3b8631a6(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(s.size() > l.size()) {
            return False;
        }
        for(int i = 0; i <= l.size() - s.size(); i++) {
            if(l.get(i).equals(s.get(0))) {
                boolean isSublist_Problem_0_b702b4dd_3bd1_4dfd_b4ff_a4dd3b8631a6 = True;
                for(int j = 0; j < s.size(); j++) {
                    if(!l.get(i + j).equals(s.get(j))) {
                        isSublist_Problem_0_b702b4dd_3bd1_4dfd_b4ff_a4dd3b8631a6 = False;
                        break;
                    }
                }
                if(isSublist_Problem_0_b702b4dd_3bd1_4dfd_b4ff_a4dd3b8631a6) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_1_f203bf51_ce56_4b6a_947f_2fa04ae9fa43(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i <= l.size() - s.size(); i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean isSublist_Problem_1_f203bf51_ce56_4b6a_947f_2fa04ae9fa43 = True;
                for (int j = 0; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        isSublist_Problem_1_f203bf51_ce56_4b6a_947f_2fa04ae9fa43 = False;
                        break;
                    }
                }
                if (isSublist_Problem_1_f203bf51_ce56_4b6a_947f_2fa04ae9fa43) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_1_9d56c486_1776_47c7_acbb_ba8214ebab31(ArrayList<Integer> l, ArrayList<Integer> s) {
        boolean res = True;
        for (Integer i : s) {
            for (Integer j : l) {
                if (i == j) {
                    res = False;
                    break;
                }
            }
        }
        return res;
    }

    
    public static boolean isSublist_Problem_2_700a42e7_c927_4dc2_ba7b_ac7b5b1b6c87(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i <= l.size() - s.size(); i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean isSublist_Problem_2_700a42e7_c927_4dc2_ba7b_ac7b5b1b6c87 = True;
                for (int j = 0; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        isSublist_Problem_2_700a42e7_c927_4dc2_ba7b_ac7b5b1b6c87 = False;
                        break;
                    }
                }
                if (isSublist_Problem_2_700a42e7_c927_4dc2_ba7b_ac7b5b1b6c87) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_0_5bfc1975_d66b_4e70_aefd_9f880e53d47f(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0;
        int j = 0;
        while (i < l.size() && j < s.size()) {
            if (l.get(i) == s.get(j)) {
                i++;
                j++;
            } else {
                j = 0;
            }
        }
        return i == l.size();
    }

    
    public static boolean isSublist_Problem_0_e0149b92_84fd_4735_bb07_055103ab96b4(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_0_b9a0b66f_88b2_4bcb_9613_8b97dd47942c(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_0_76dbadc1_3878_4324_9af3_b38fab665e78(ArrayList<Integer> l, ArrayList<Integer> s) {
        boolean isSublist_Problem_0_76dbadc1_3878_4324_9af3_b38fab665e78 = False;
        if (s.size() > l.size()) {
            return False;
        } else {
            l.removeAll(new ArrayList<>());
            isSublist_Problem_0_76dbadc1_3878_4324_9af3_b38fab665e78 = l.equals(s);
        }
        return isSublist_Problem_0_76dbadc1_3878_4324_9af3_b38fab665e78;
    }

    
    public static boolean isSublist_Problem_2_5128dc52_ee0a_485e_9713_4d46b3ee8cd3(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        int i = 0;
        for(Integer e : s) {
            if(i >= l.size()) return False;
            if(l.get(i) != e) return False;
            i++;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_1_719df5c7_0a26_4bde_bb0e_4f1f9754c302(ArrayList<Integer> l, ArrayList<Integer> s) {
        ArrayList<Integer> l1 = new ArrayList<>(l);
        ArrayList<Integer> s1 = new ArrayList<>(s);
        ArrayList<Integer> l2 = new ArrayList<>();
        ArrayList<Integer> s2 = new ArrayList<>();
        for(int i=0; i<l1.size(); i++) {
            l2.add(l1.get(i));
        }
        for(int i=0; i<s1.size(); i++) {
            s2.add(s1.get(i));
        }
        for(int i=0; i<l2.size(); i++) {
            if(!s2.contains(l2.get(i))) {
                return False;
            }
        }
        return True;
    }

    
    public static boolean isSublist_Problem_0_15deca29_d197_4f6d_9e1e_302045b71c78(ArrayList<Integer> l, ArrayList<Integer> s) {
        ArrayList<Integer> l2 = new ArrayList<>();
        l2.addAll(l);
        ArrayList<Integer> s2 = new ArrayList<>();
        s2.addAll(s);
        Collections.sort(l);
        Collections.sort(s);
        int l_size = l.size();
        int s_size = s.size();
        int m_size = Math.max(l_size, s_size);
        for (int i = 0; i < m_size; i++) {
            if (i < l_size && i < s_size) {
                l2.add(l.get(i));
                s2.add(s.get(i));
            } else if (i == l_size) {
                l2.add(s.get(i));
            } else if (i == s_size) {
                l2.add(l.get(i));
            } else if (i < l_size && i < s_size && i == l_size || i < l_size && i == s_size) {
                l2.add(l.get(i));
                s2.add(l.get(i));
            } else if (i > l_size && i < s_size) {
                l2.add(s.get(i));
                s2.add(l.get(i));
            } else if (i > l_size && i > s_size && i == s_size) {
                l2.add(s.get(i));
                s2.add(s.get(i));
            } else {
                l2.add(l.get(i));
                s2.add(s.get(i));
            }
        }
        l2.removeAll(l2);
        s2.removeAll(s2);
        return l2.isEmpty() && s2.isEmpty();
    }

    
    public static boolean isSublist_Problem_2_8460de8e_30f7_486f_a016_f48488040ea4(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_1_b3c919f0_b9b2_487c_a151_0cf4d0111940(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) return False;
        for (int i = 0; i < l.size() - s.size() + 1; i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean found = True;
                for (int j = 0; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        found = False;
                        break;
                    }
                }
                if (found) return True;
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_1_d32ff163_6412_47e4_97a2_567bbac3a498(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i <= l.size() - s.size(); i++) {
            if (l.get(i).equals(s.get(0))) {
                for (int j = 0; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        break;
                    }
                    if (j == s.size() - 1) {
                        return True;
                    }
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_1_70d18527_40e5_4865_8500_746c2d931962(ArrayList<Integer> l, ArrayList<Integer> s) {
        // Write your code here
        
        

        
        return True;
    }

    
    public static boolean isSublist_Problem_1_e6399167_aca7_4ae0_9f10_138f669d4ff0(ArrayList<Integer> l, ArrayList<Integer> s) {
        ArrayList<Integer> sublist = new ArrayList<>();
        for(int i = 0; i < l.size(); i++) {
            for(int j = 0; j < s.size(); j++) {
                if(l.get(i) == s.get(j)) {
                    sublist.add(l.get(i));
                }
            }
        }
        return sublist.equals(s);
    }

    
    public static boolean isSublist_Problem_0_c49623fb_020f_435c_93af_f4f4e81fd756(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i <= l.size() - s.size(); i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean isSublist_Problem_0_c49623fb_020f_435c_93af_f4f4e81fd756 = True;
                for (int j = 0; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        isSublist_Problem_0_c49623fb_020f_435c_93af_f4f4e81fd756 = False;
                        break;
                    }
                }
                if (isSublist_Problem_0_c49623fb_020f_435c_93af_f4f4e81fd756) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_2_fbf93d90_e09b_4b84_9fca_6530c13c5c74(ArrayList<Integer> l, ArrayList<Integer> s) {
        for(int i = 0; i < l.size(); i++) {
            for(int j = 0; j < s.size(); j++) {
                if(l.get(i) == s.get(j))
                    return True;
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_0_4d1c77e7_71c5_4434_a806_93f4a7a39346(ArrayList<Integer> l, ArrayList<Integer> s) {
        
        //return ((ArrayList<Integer>) l).containsAll(s);
        return l.containsAll(s);
    }

    
    public static boolean isSublist_Problem_0_986d93c4_f89a_4e8d_a7a7_0d9146e8dda6(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i < l.size() - s.size() + 1; i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean isSublist_Problem_0_986d93c4_f89a_4e8d_a7a7_0d9146e8dda6 = True;
                for (int j = 1; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        isSublist_Problem_0_986d93c4_f89a_4e8d_a7a7_0d9146e8dda6 = False;
                        break;
                    }
                }
                if (isSublist_Problem_0_986d93c4_f89a_4e8d_a7a7_0d9146e8dda6) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_0_ce760bd0_031e_46f4_966c_9c89357cae18(ArrayList<Integer> l, ArrayList<Integer> s) {
        int n = l.size();
        int m = s.size();
        if (m > n) return False;
        for (int i = 0; i <= n - m; i++) {
            int j;
            for (j = 0; j < m; j++) {
                if (l.get(i + j) != s.get(j)) break;
            }
            if (j == m) return True;
        }
        return False;
    }

    
    public static boolean isSublist_Problem_0_de3e81df_d345_4bf5_b6e5_dc94ae43d843(ArrayList<Integer> l, ArrayList<Integer> s) {
        ArrayList<Integer> l1 = new ArrayList<>(l);
        ArrayList<Integer> s1 = new ArrayList<>(s);
        ArrayList<Integer> l2 = new ArrayList<>();
        ArrayList<Integer> s2 = new ArrayList<>();
        for(int i=0; i<l1.size(); i++) {
            l2.add(l1.get(i));
        }
        for(int i=0; i<s1.size(); i++) {
            s2.add(s1.get(i));
        }
        for(int i=0; i<l2.size(); i++) {
            if(s2.contains(l2.get(i))) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_1_127ad148_9f40_4c0e_8d08_4078175bd1f6(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_2_8934fb96_4d08_4e27_98c0_c8ce0b010034(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_0_a7f4bc79_7bbd_4eaa_b161_4c9a6449861c(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_0_57805036_ed62_4c9b_a111_f75bba24c60f(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0, j = 0;
        for(; i < l.size() && j < s.size(); i++) {
            if(l.get(i) == s.get(j)) {
                j++;
            } else {
                j = 0;
            }
        }
        return j == s.size();
    }

    
    public static boolean isSublist_Problem_0_60617548_c878_4930_b296_986971ac41eb(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0;
        int j = 0;
        int k = 0;
        int l_size = l.size();
        int s_size = s.size();
        while (i < l_size && j < s_size) {
            if (l.get(i) == s.get(j)) {
                i++;
                j++;
                k++;
            } else if (l.get(i) < s.get(j)) {
                i++;
            } else {
                j++;
            }
        }
        return k == s_size;
    }

    
    public static boolean isSublist_Problem_2_1791d202_f836_41c3_88fb_4261837a0045(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i <= l.size() - s.size(); i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean found = True;
                for (int j = 0; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        found = False;
                        break;
                    }
                }
                if (found) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_0_e47f869c_fbb3_4b92_9302_e83631efc288(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() > s.size()) return False;
        for(int i = 0; i < l.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_1_4e981614_7eff_4b04_81ba_71594b054798(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (l.size() < s.size()) return False;
        for (int i = 0; i < s.size(); i++) {
            if (l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_0_53bb7d4e_2ac8_4674_a15d_6322bca1b83d(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0;
        int j = 0;
        while (i < l.size() && j < s.size()) {
            if (l.get(i) == s.get(j)) {
                i++;
                j++;
            } else if (l.get(i) < s.get(j)) {
                i++;
            } else {
                j++;
            }
        }
        return i == l.size() && j == s.size();
    }

    
    public static boolean isSublist_Problem_0_e6399167_aca7_4ae0_9f10_138f669d4ff0(ArrayList<Integer> l, ArrayList<Integer> s) {
        ArrayList<Integer> sublist = new ArrayList<>();
        for(int i = 0; i < l.size(); i++) {
            for(int j = 0; j < s.size(); j++) {
                if(l.get(i) == s.get(j)) {
                    sublist.add(l.get(i));
                }
            }
        }
        return sublist.equals(s);
    }

    
    public static boolean isSublist_Problem_0_648f238c_a07e_4e3e_898c_58b842dd77c4(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < l.size() && j < s.size()) {
            if (l.get(i) == s.get(j)) {
                i++;
                j++;
                k++;
            } else if (l.get(i) < s.get(j)) {
                i++;
            } else {
                j++;
            }
        }
        return k == s.size();
    }

    
    public static boolean isSublist_Problem_0_92a12aef_8427_45eb_99a2_05060d255098(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_1_15776ef8_f750_406b_81a6_b7e4bb21b6db(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_2_4824795b_c939_40c9_b345_98e0422ff265(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0;
        int j = 0;
        while (i < l.size() && j < s.size()) {
            if (l.get(i).equals(s.get(j))) {
                j++;
            } else {
                j = 0;
            }
            i++;
        }
        return j == s.size();
    }

    
    public static boolean isSublist_Problem_1_986d93c4_f89a_4e8d_a7a7_0d9146e8dda6(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i < l.size() - s.size() + 1; i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean isSublist_Problem_1_986d93c4_f89a_4e8d_a7a7_0d9146e8dda6 = True;
                for (int j = 1; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        isSublist_Problem_1_986d93c4_f89a_4e8d_a7a7_0d9146e8dda6 = False;
                        break;
                    }
                }
                if (isSublist_Problem_1_986d93c4_f89a_4e8d_a7a7_0d9146e8dda6) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_1_27136bf9_5474_4c7d_8aa1_ce10d5d2c99e(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (l.size() < s.size()) return False;
        for (int i = 0; i < s.size(); i++) {
            if (l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_0_5c7a495b_c9ba_4d66_9dc9_fbcfc53598cd(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_1_0ae58ff2_4d7f_420b_bd33_e84d7852e227(ArrayList<Integer> l, ArrayList<Integer> s) {
        return l.equals(s);
    }

    
    public static boolean isSublist_Problem_0_68a72de4_7465_4ebf_9e15_ba04af519880(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (l.size() < s.size()) return False;
        for (int i = 0; i < s.size(); i++) {
            if (l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_0_991f573a_5e91_437f_ada8_5a6482a323f8(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() > s.size()) return False;
        for(int i = 0; i < l.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_2_c969f04b_9b86_42c9_910e_2a6a84c684c6(ArrayList<Integer> l, ArrayList<Integer> s) {
        ArrayList<Integer> tempList = new ArrayList<Integer>();
        for(int i=0; i<l.size(); i++) {
            tempList.add(l.get(i));
        }
        for(int i=0; i<s.size(); i++) {
            tempList.add(s.get(i));
        }
        return tempList.stream().allMatch(l::contains);
    }

    
    public static boolean isSublist_Problem_2_fb19f6f2_bcdd_4dcc_9a0b_624ddbddc2de(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0;
        int j = 0;
        while (i < l.size() && j < s.size()) {
            if (l.get(i) == s.get(j)) {
                i++;
                j++;
            } else {
                j = 0;
            }
        }
        return i == l.size();
    }

    
    public static boolean isSublist_Problem_2_e6b6a92e_f2ae_490a_a7d3_73d70c1185e2(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) return False;
        for (int i = 0; i < l.size() - s.size() + 1; i++) {
            if (l.get(i).equals(s.get(0))) {
                int j = 0;
                for (j = 0; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) break;
                }
                if (j == s.size()) return True;
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_0_c7ff9ba8_02c9_4557_a927_4b21b1c7900a(ArrayList<Integer> l, ArrayList<Integer> s) {
        int n = l.size();
        int m = s.size();
        for (int i = 0; i <= n - m; i++) {
            int j;
            for (j = 0; j < m; j++)
                if (l.get(i + j) != s.get(j))
                    break;
            if (j == m)
                return True;
        }
        return False;
    }

    
    public static boolean isSublist_Problem_1_ba075ef2_5597_4ffc_a5aa_343f9df0682a(ArrayList<Integer> l, ArrayList<Integer> s) {
        ArrayList<Integer> sublist = new ArrayList<>();
        for(Integer i : l) {
            for(Integer j : s) {
                if(i == j) {
                    sublist.add(i);
                }
            }
        }
        return sublist.equals(s);
    }

    
    public static boolean isSublist_Problem_2_d65ee803_bfb6_4a1e_b246_91b96315d905(ArrayList<Integer> l, ArrayList<Integer> s) {
        ArrayList<Integer> sublist = new ArrayList<>();
        for(Integer i : s) {
            for(Integer j : l) {
                if(i.equals(j)) {
                    sublist.add(i);
                }
            }
        }
        return sublist.equals(l);
    }

    
    public static boolean isSublist_Problem_0_e160d2f5_3d67_451a_add2_64ef9853e198(ArrayList<Integer> l, ArrayList<Integer> s) {
        ArrayList<Integer> sub = new ArrayList<>();
        l.forEach(x -> {
            s.forEach(y -> {
                if (x.equals(y)) {
                    sub.add(x);
                }
            });
        });
        return sub.isEmpty();
    }

    
    public static boolean isSublist_Problem_2_a7f4bc79_7bbd_4eaa_b161_4c9a6449861c(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_2_98f9505e_d7c2_4471_b029_bfd0f916a426(ArrayList<Integer> l, ArrayList<Integer> s) {
        ArrayList<Integer> l1 = new ArrayList<>(l);
        ArrayList<Integer> s1 = new ArrayList<>(s);
        ArrayList<Integer> l2 = new ArrayList<>();
        ArrayList<Integer> s2 = new ArrayList<>();
        for(int i = 0; i < l1.size(); i++) {
            l2.add(l1.get(i));
        }
        for(int i = 0; i < s1.size(); i++) {
            s2.add(s1.get(i));
        }
        for(int i = 0; i < l2.size(); i++) {
            if(!s2.contains(l2.get(i))) {
                return False;
            }
        }
        return True;
    }

    
    public static boolean isSublist_Problem_2_e23fea05_7bed_4d3d_b7c8_289fb7ccbbdc(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) return False;
        for (int i = 0; i < l.size() - s.size() + 1; i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean found = True;
                for (int j = 0; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        found = False;
                        break;
                    }
                }
                if (found) return True;
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_1_dbc6bda3_1838_4f34_983a_220315ce3c8e(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_2_9bb8125e_5981_4ed0_9734_a9c22ead0a0c(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (l.size() < s.size()) return False;
        for (int i = 0; i < s.size(); i++) {
            if (l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_0_cd0da67c_3c71_4b8e_86f8_f15cb18eaa53(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i <= l.size() - s.size(); i++) {
            if (l.subList(i, i + s.size()).equals(s)) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_0_2149fd93_bf90_4212_ba4a_fca2e5d74782(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i <= l.size() - s.size(); i++) {
            if (l.subList(i, i + s.size()).equals(s)) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_0_d87f2285_d289_4463_82cf_33bb36c1e330(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0, j = 0;
        while (i < l.size() && j < s.size()) {
            if (l.get(i) == s.get(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        return i == l.size() && j == s.size();
    }

    
    public static boolean isSublist_Problem_1_27967709_3d6c_40b5_8806_be77c8f54739(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() > s.size()) return False;
        for(int i = 0; i < l.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_1_a8aa4b1b_0196_4509_bf2a_9be1ee72e4dc(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i <= l.size() - s.size(); i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean isSublist_Problem_1_a8aa4b1b_0196_4509_bf2a_9be1ee72e4dc = True;
                for (int j = 0; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        isSublist_Problem_1_a8aa4b1b_0196_4509_bf2a_9be1ee72e4dc = False;
                        break;
                    }
                }
                if (isSublist_Problem_1_a8aa4b1b_0196_4509_bf2a_9be1ee72e4dc) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_2_e8c033da_6676_4f6a_a79d_a29a6eb696c4(ArrayList<Integer> l, ArrayList<Integer> s) {
        ArrayList<Integer> l1 = new ArrayList<>(l);
        ArrayList<Integer> s1 = new ArrayList<>(s);
        boolean result = False;
        for(int i = 0; i < l1.size(); i++) {
            for(int j = 0; j < s1.size(); j++) {
                if(l1.get(i) == s1.get(j)) {
                    result = True;
                }
            }
        }
        return result;
    }

    
    public static boolean isSublist_Problem_1_9ad6a662_7858_48ad_9297_0af067054f9b(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_2_29773024_5cd1_4a64_aafd_61be34a23812(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0;
        int j = 0;
        while (i < l.size() && j < s.size()) {
            if (l.get(i) == s.get(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        return i == l.size() && j == s.size();
    }

    
    public static boolean isSublist_Problem_1_3e1f83a3_1c35_4a6e_a7ad_e7a913275b34(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0;
        int j = 0;
        while(i < l.size() && j < s.size()) {
            if(l.get(i) == s.get(j)) {
                i++;
                j++;
            } else {
                i = i + j - 1;
                j = 0;
            }
        }
        return i == l.size() && j == s.size();
    }

    
    public static boolean isSublist_Problem_2_4a4fbe25_b471_4734_a5a3_efcfd2af14bb(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0;
        int j = 0;
        while(i < l.size() && j < s.size()) {
            if(l.get(i) == s.get(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        return i == l.size() && j == s.size();
    }

    
    public static boolean isSublist_Problem_1_8efd2f0f_5f22_4734_be00_16e55e5326a8(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (l.size() < s.size()) {
            return False;
        }
        boolean result = True;
        for (int i = 0; i < s.size(); i++) {
            result &= (l.get(i) == s.get(i));
        }
        return result;
    }

    
    public static boolean isSublist_Problem_2_57805036_ed62_4c9b_a111_f75bba24c60f(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0, j = 0;
        for(; i < l.size() && j < s.size(); i++) {
            if(l.get(i) == s.get(j)) {
                j++;
            } else {
                j = 0;
            }
        }
        return j == s.size();
    }

    
    public static boolean isSublist_Problem_0_0b799a35_64ad_4eb8_bd4a_8b986af5c7e1(ArrayList<Integer> l, ArrayList<Integer> s) {
        return l.stream().anyMatch(i -> s.contains(i));
    }

    
    public static boolean isSublist_Problem_0_0dd96788_8ef2_45ab_bf10_093fa529a015(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i <= l.size() - s.size(); i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean found = True;
                for (int j = 1; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        found = False;
                        break;
                    }
                }
                if (found) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_1_f9064bdb_0afb_4ba3_bb06_7a37d4b076c9(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0;
        int j = 0;
        while (i < l.size() && j < s.size()) {
            if (l.get(i) == s.get(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        return i == l.size() && j == s.size();
    }

    
    public static boolean isSublist_Problem_2_ec79cff3_3be8_4db3_9879_5bb56c6fd607(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i <= l.size() - s.size(); i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean isSublist_Problem_2_ec79cff3_3be8_4db3_9879_5bb56c6fd607 = True;
                for (int j = 0; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        isSublist_Problem_2_ec79cff3_3be8_4db3_9879_5bb56c6fd607 = False;
                        break;
                    }
                }
                if (isSublist_Problem_2_ec79cff3_3be8_4db3_9879_5bb56c6fd607) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_2_0e8b6fc2_3e87_476c_9a32_c734044ac125(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i <= l.size() - s.size(); i++) {
            if (l.subList(i, i + s.size()).equals(s)) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_2_5128dc52_ee0a_485e_9713_4d46b3ee8cd3(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        int i = 0;
        for(Integer e : s) {
            if(i >= l.size()) return False;
            if(l.get(i) != e) return False;
            i++;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_1_66c05780_0026_432b_93f8_5450bcb16f08(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_2_463a627f_0b05_4a5d_a2bd_b31395d68324(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i < l.size() - s.size() + 1; i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean found = True;
                for (int j = 1; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        found = False;
                        break;
                    }
                }
                if (found) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_2_749fa8b0_9c5c_4a55_a72f_84b5cee96a6f(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() > s.size()) return False;
        for(int i = 0; i < l.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_0_07ec9355_224f_40fd_9712_ad5c75d652d6(ArrayList<Integer> l, ArrayList<Integer> s) {
        for (int i = 0; i < s.size(); i++) {
            if (!l.contains(s.get(i)))
                return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_1_f4cd7697_ff1d_441f_ae7f_b0438eb6e946(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i,j;
        for(i=0;i<l.size();i++){
            for(j=0;j<s.size();j++){
                if(l.get(i)==s.get(j)){
                    break;
                }
            }
            if(j==s.size())
                return True;
        }
        return False;
    }

    
    public static boolean isSublist_Problem_2_f7cdb66d_9ff5_4dd0_a5bc_84f6f69faa85(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_2_45590d8e_5ce2_42fe_aeb4_11c4003f1fbf(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i < l.size() - s.size() + 1; i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean flag = True;
                for (int j = 1; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        flag = False;
                        break;
                    }
                }
                if (flag) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_2_81702675_9859_495c_94a1_ee4b771f5ead(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i <= l.size() - s.size(); i++) {
            if (l.get(i).equals(s.get(0))) {
                int j = 1;
                for (; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        break;
                    }
                }
                if (j == s.size()) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_0_a36f5d3b_0c29_4ea5_bb52_d8e749b568f7(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_0_49d3bf62_daea_4b89_affa_01d83fb3897b(ArrayList<Integer> l, ArrayList<Integer> s) {
        // Write your code here
        try{
            Arrays.asList(s.toArray());
        }catch (Exception e){
            return False;
        }
        try{
            Arrays.asList(l.toArray());
        }catch (Exception e){
            return False;
        }
        return False;
    }

    
    public static boolean isSublist_Problem_1_7767fc25_7e2a_4a9a_95cb_9d49d0cff6e5(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_0_15c00517_442b_490b_a360_5b8b037bccf3(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_2_ed5f0390_8ef6_4fd7_8515_d15ae214c8a8(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i <= l.size() - s.size(); i++) {
            if (l.subList(i, i + s.size()).equals(s)) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_1_f6a795b4_5699_4408_a11b_d47fd371a7d6(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (l.size() < s.size()) {
            return False;
        }
        for (int i = 0; i < s.size(); i++) {
            if (l.get(i) != s.get(i)) {
                return False;
            }
        }
        return True;
    }

    
    public static boolean isSublist_Problem_1_14fd2743_2df2_4793_b6dd_f7c2db4243d2(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < l.size() && j < s.size()) {
            if (l.get(i) == s.get(j)) {
                i++;
                j++;
            } else {
                j++;
            }
        }
        if (i == l.size()) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isSublist_Problem_0_ec72a74c_2340_4704_8fc9_5fc5a436073e(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        int i = 0;
        int j = 0;
        while (i < l.size() && j < s.size()) {
            if (l.get(i) == s.get(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        if (j == s.size()) {
            return True;
        }
        return False;
    }

    
    public static boolean isSublist_Problem_1_98ca632b_6721_4f2f_9645_22d1d0c4e79f(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) return False;
        for (int i = 0; i < l.size(); i++) {
            if (l.get(i) == s.get(0)) {
                boolean found = True;
                for (int j = 0; j < s.size(); j++) {
                    if (i + j >= l.size() || l.get(i + j) != s.get(j)) {
                        found = False;
                        break;
                    }
                }
                if (found) return True;
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_0_70dcfe58_a16a_4028_bacb_f5e3c4674b77(ArrayList<Integer> l, ArrayList<Integer> s) {
        // write your code here
        int i = 0, j = 0;
        ArrayList<Integer> a = new ArrayList<Integer>(l);
        ArrayList<Integer> b = new ArrayList<Integer>(s);
        int n = a.size();
        int m = b.size();
        if (n != m) {
            return False;
        }
        ArrayList<Integer> x = new ArrayList<Integer>();
        ArrayList<Integer> y = new ArrayList<Integer>();
        for (i = 0; i < n; i++) {
            if (a.get(i) == b.get(j)) {
                x.add(a.get(i));
                j++;
            } else {
                y.add(a.get(i));
            }
        }
        if (x.size() != y.size()) {
            return False;
        } else {
            return True;
        }
    }

    
    public static boolean isSublist_Problem_1_2d81b165_e11c_48cc_ae38_19008e66e8cd(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_0_480f13b1_2334_4593_97e5_1b30ddfb4a74(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i < l.size(); i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean isSublist_Problem_0_480f13b1_2334_4593_97e5_1b30ddfb4a74 = True;
                for (int j = 0; j < s.size(); j++) {
                    if (i + j >= l.size() || !l.get(i + j).equals(s.get(j))) {
                        isSublist_Problem_0_480f13b1_2334_4593_97e5_1b30ddfb4a74 = False;
                        break;
                    }
                }
                if (isSublist_Problem_0_480f13b1_2334_4593_97e5_1b30ddfb4a74) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_2_4a83d61d_48e6_4357_88f0_03a4b265096e(ArrayList<Integer> l, ArrayList<Integer> s) {
        return l.containsAll(s);
    }

    
    public static boolean isSublist_Problem_1_efe53321_aec8_4f35_8e12_ba10425bdec0(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_2_e1a9fcfa_2092_4573_a354_214f0f08d849(ArrayList<Integer> l, ArrayList<Integer> s) {
        // Write your code in Java 7
        ArrayList<Integer> result = new ArrayList<>();
        boolean flag = False;
        for(Integer value : l) {
            flag = True;
            for(Integer value1 : s) {
                if(value == value1) {
                    flag = False;
                    break;
                }
            }
            if(flag) result.add(value);
        }
        return result.equals(s);
    }

    
    public static boolean isSublist_Problem_2_e4b2d6c2_c142_4102_8a5e_26747220ce27(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() != s.size())
            return False;
        int i = 0, j = 0, k = 0;
        while(i < l.size() && j < s.size()) {
            if(l.get(i).equals(s.get(j)))
                i++;
            else if(l.get(i).compareTo(s.get(j)) > 0)
                i++;
            else
                return False;
            j++;
        }
        return i == l.size();
    }

    
    public static boolean isSublist_Problem_0_3e1f83a3_1c35_4a6e_a7ad_e7a913275b34(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0;
        int j = 0;
        while(i < l.size() && j < s.size()) {
            if(l.get(i) == s.get(j)) {
                i++;
                j++;
            } else {
                i = i + j - 1;
                j = 0;
            }
        }
        return i == l.size() && j == s.size();
    }

    
    public static boolean isSublist_Problem_2_3a2d7af0_5130_4f04_85cf_737ba3eb71b5(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) return False;
        for (int i = 0; i <= l.size() - s.size(); i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean isSublist_Problem_2_3a2d7af0_5130_4f04_85cf_737ba3eb71b5 = True;
                for (int j = 1; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        isSublist_Problem_2_3a2d7af0_5130_4f04_85cf_737ba3eb71b5 = False;
                        break;
                    }
                }
                if (isSublist_Problem_2_3a2d7af0_5130_4f04_85cf_737ba3eb71b5) return True;
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_2_2107db2f_9f94_49d7_aeb1_a24c153bd534(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_1_edb7ce5e_bbc8_4c4f_af86_4f0a1cd438a0(ArrayList<Integer> l, ArrayList<Integer> s) {
        return l.size() <= 1 || s.isEmpty() ? True : l.containsAll(s);
    }

    
    public static boolean isSublist_Problem_0_990c26c9_0f4b_461e_9950_53d07403271b(ArrayList<Integer> l, ArrayList<Integer> s) {
        int n = l.size();
        int m = s.size();
        for (int i = 0; i <= n - m; i++) {
            int j;
            for (j = 0; j < m; j++) {
                if (l.get(i + j) != s.get(j)) {
                    break;
                }
            }
            if (j == m) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_2_18b9fbef_44e6_4c8f_bc96_c5293a7c1762(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_0_e8c033da_6676_4f6a_a79d_a29a6eb696c4(ArrayList<Integer> l, ArrayList<Integer> s) {
        ArrayList<Integer> l1 = new ArrayList<>(l);
        ArrayList<Integer> s1 = new ArrayList<>(s);
        boolean result = False;
        for(int i = 0; i < l1.size(); i++) {
            for(int j = 0; j < s1.size(); j++) {
                if(l1.get(i) == s1.get(j)) {
                    result = True;
                }
            }
        }
        return result;
    }

    
    public static boolean isSublist_Problem_0_8460de8e_30f7_486f_a016_f48488040ea4(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_0_e2bf29a5_d7e9_4eb6_9a08_48dd374af40f(ArrayList<Integer> l, ArrayList<Integer> s) {
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> s1 = new ArrayList<>();
        for(Integer i : l) {
            l1.add(i);
        }
        for(Integer i : s) {
            s1.add(i);
        }
        boolean result = l1.containsAll(s1);
        return result;
    }

    
    public static boolean isSublist_Problem_0_4340aee6_9bba_4247_b84f_0400db6c106c(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_2_64f8695f_6a75_4db4_9374_d6b49214aed1(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_0_b9a0b66f_88b2_4bcb_9613_8b97dd47942c(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_1_ddd6dfba_3b94_433d_a82f_fbc076a14bc4(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_2_3b54570c_a60d_4527_b9d3_ba1ebaebb85b(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0, j = 0;
        while (i < l.size() && j < s.size()) {
            if (l.get(i) == s.get(j)) {
                i++;
                j++;
            } else {
                j = 0;
            }
        }
        return i == l.size();
    }

    
    public static boolean isSublist_Problem_2_7920de7c_2267_4f00_ad60_e338da47ad58(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() == 0) {
            return True;
        }
        if (l.size() == 0) {
            return False;
        }
        int i = 0;
        int j = 0;
        while (i < l.size() && j < s.size()) {
            if (l.get(i).equals(s.get(j))) {
                j++;
            } else {
                j = 0;
            }
            i++;
        }
        return j == s.size();
    }

    
    public static boolean isSublist_Problem_1_d87f2285_d289_4463_82cf_33bb36c1e330(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0, j = 0;
        while (i < l.size() && j < s.size()) {
            if (l.get(i) == s.get(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        return i == l.size() && j == s.size();
    }

    
    public static boolean isSublist_Problem_1_1a881533_0284_4000_aa94_33bd1ebeea11(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (l.size() < s.size()) {
            return False;
        }
        for (int i = 0; i < s.size(); i++) {
            if (l.get(i) != s.get(i)) {
                return False;
            }
        }
        return True;
    }

    
    public static boolean isSublist_Problem_2_39d8cdb7_0b53_4aea_8520_e483726d3200(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0;
        int j = 0;
        boolean flag = False;
        if (s.isEmpty()) {
            return True;
        }
        if (l.isEmpty()) {
            return False;
        }
        if (s.equals(l)) {
            return True;
        }
        for (; i < l.size(); i++) {
            if (s.equals(l.get(i))) {
                flag = True;
            } else {
                flag = False;
                break;
            }
        }
        if (flag) {
            System.out.println("Sublist found");
        } else {
            System.out.println("Sublist not found.");
        }
        return False;
    }

    
    public static boolean isSublist_Problem_0_b6dc4093_d518_48d6_8c61_6870f50c298c(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_1_c7275919_2165_404d_9501_d9c859ce79ce(ArrayList<Integer> l, ArrayList<Integer> s) {
        ArrayList<Integer> result = new ArrayList<>();
        for(int i = 0; i < l.size(); i++) {
            Integer li = l.get(i);
            Integer si = s.get(i);
            if(li.compareTo(si) != 0) {
                result.add(li);
                result.add(si);
            }
        }
        return result.contains(l);
    }

    
    public static boolean isSublist_Problem_0_529e52f7_3aa9_4177_8d09_f97616c4e75c(ArrayList<Integer> l, ArrayList<Integer> s) {
        int n = l.size();
        int m = s.size();
        if (m > n) return False;
        int i = 0, j = 0;
        while (i < n && j < m) {
            if (l.get(i).equals(s.get(j))) {
                i++;
                j++;
            } else {
                i = i - j + 1;
                j = 0;
            }
        }
        return j == m;
    }

    
    public static boolean isSublist_Problem_1_99cf8c5b_5f6d_4c94_9e78_5c21e9d84300(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i <= l.size() - s.size(); i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean found = True;
                for (int j = 1; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        found = False;
                        break;
                    }
                }
                if (found) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_2_4824795b_c939_40c9_b345_98e0422ff265(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0;
        int j = 0;
        while (i < l.size() && j < s.size()) {
            if (l.get(i).equals(s.get(j))) {
                j++;
            } else {
                j = 0;
            }
            i++;
        }
        return j == s.size();
    }

    
    public static boolean isSublist_Problem_1_edb7ce5e_bbc8_4c4f_af86_4f0a1cd438a0(ArrayList<Integer> l, ArrayList<Integer> s) {
        return l.size() <= 1 || s.isEmpty() ? True : l.containsAll(s);
    }

    
    public static boolean isSublist_Problem_1_a2b2a12d_6033_4070_ba5e_337b033cd888(ArrayList<Integer> l, ArrayList<Integer> s) {
        return l.size() == s.size() && l.containsAll(s);
    }

    
    public static boolean isSublist_Problem_2_f46e5471_0342_4abd_8280_1ad1a5e8cc2f(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i <= l.size() - s.size(); i++) {
            if (l.get(i).equals(s.get(0))) {
                int j = 0;
                while (j < s.size() && l.get(i + j).equals(s.get(j))) {
                    j++;
                }
                if (j == s.size()) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_1_8711275a_a953_48a3_ae22_82cd2900cbab(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i <= l.size() - s.size(); i++) {
            if (l.subList(i, i + s.size()).equals(s)) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_0_299b2236_6045_4af1_9b26_49e07c15ff7d(ArrayList<Integer> l, ArrayList<Integer> s) {
        ArrayList<Integer> a = new ArrayList<>(l);
        ArrayList<Integer> b = new ArrayList<>(s);
        return a.containsAll(b);
    }

    
    public static boolean isSublist_Problem_0_fde1641d_00d5_4ee9_8ca2_ac7857cc5d2b(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) return False;
        for (int i = 0; i <= l.size() - s.size(); i++) {
            if (l.subList(i, i + s.size()).equals(s)) return True;
        }
        return False;
    }

    
    public static boolean isSublist_Problem_0_a2c23fff_0803_49a7_9067_5a0ea2bc4884(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0, j = 0;
        while (i < l.size() && j < s.size()) {
            if (l.get(i) == s.get(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        return i == l.size() && j == s.size();
    }

    
    public static boolean isSublist_Problem_2_9b17005f_b37b_4f86_a055_daa44dc9378e(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0, j = 0;
        while (i < l.size() && j < s.size()) {
            if (l.get(i) == s.get(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        return i == l.size() && j == s.size();
    }

    
    public static boolean isSublist_Problem_0_d72582db_f180_4ee0_9ca4_7575473c8fb5(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i < l.size() - s.size() + 1; i++) {
            boolean isSublist_Problem_0_d72582db_f180_4ee0_9ca4_7575473c8fb5 = True;
            for (int j = 0; j < s.size(); j++) {
                if (l.get(i + j) != s.get(j)) {
                    isSublist_Problem_0_d72582db_f180_4ee0_9ca4_7575473c8fb5 = False;
                    break;
                }
            }
            if (isSublist_Problem_0_d72582db_f180_4ee0_9ca4_7575473c8fb5) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_0_71f7248b_3bf3_4fc0_9e05_f0bf24076ae2(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (l.size() < s.size()) return False;
        for (int i = 0; i < s.size(); i++) {
            if (l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_2_76dbadc1_3878_4324_9af3_b38fab665e78(ArrayList<Integer> l, ArrayList<Integer> s) {
        boolean isSublist_Problem_2_76dbadc1_3878_4324_9af3_b38fab665e78 = False;
        if (s.size() > l.size()) {
            return False;
        } else {
            l.removeAll(new ArrayList<>());
            isSublist_Problem_2_76dbadc1_3878_4324_9af3_b38fab665e78 = l.equals(s);
        }
        return isSublist_Problem_2_76dbadc1_3878_4324_9af3_b38fab665e78;
    }

    
    public static boolean isSublist_Problem_0_81702675_9859_495c_94a1_ee4b771f5ead(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i <= l.size() - s.size(); i++) {
            if (l.get(i).equals(s.get(0))) {
                int j = 1;
                for (; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        break;
                    }
                }
                if (j == s.size()) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_1_644c5fdd_47bf_4fd0_b848_3eabbee27f73(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i <= l.size() - s.size(); i++) {
            if (l.get(i) == s.get(0)) {
                boolean found = True;
                for (int j = 1; j < s.size(); j++) {
                    if (l.get(i + j) != s.get(j)) {
                        found = False;
                        break;
                    }
                }
                if (found) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_1_0f2c1e6d_045c_4a7d_8aaf_34cb08b9a892(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (l.size() < s.size()) {
            return False;
        }
        for (int i = 0; i < l.size() - s.size() + 1; i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean isSub = True;
                for (int j = 1; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        isSub = False;
                        break;
                    }
                }
                if (isSub) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_0_fd5d251c_2a87_4825_b7e2_cc6583b50412(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_1_b21f891c_eca3_4dc6_9d3e_c6c26563ab1b(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) return False;
        for (int i = 0; i < l.size() - s.size() + 1; i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean found = True;
                for (int j = 0; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        found = False;
                        break;
                    }
                }
                if (found) return True;
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_1_b15e24d6_1ecf_4048_a025_b6dc7df913c3(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) return False;
        for (int i = 0; i < l.size() - s.size() + 1; i++) {
            boolean found = True;
            for (int j = 0; j < s.size(); j++) {
                if (l.get(i + j) != s.get(j)) {
                    found = False;
                    break;
                }
            }
            if (found) return True;
        }
        return False;
    }

    
    public static boolean isSublist_Problem_1_45590d8e_5ce2_42fe_aeb4_11c4003f1fbf(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i < l.size() - s.size() + 1; i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean flag = True;
                for (int j = 1; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        flag = False;
                        break;
                    }
                }
                if (flag) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_2_df5837ca_c77b_4dd6_959f_661fea556f0b(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        int i = 0;
        for(Integer e : s) {
            if(l.get(i) != e) return False;
            i++;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_0_afa38060_412e_4908_b6cf_a2073f3c6a75(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_1_8dfd6e57_503b_4668_803c_aa5dc61f4c0a(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_0_aaa75101_fbec_4e18_bb3d_1f7e181acb34(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i <= l.size() - s.size(); i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean isSublist_Problem_0_aaa75101_fbec_4e18_bb3d_1f7e181acb34 = True;
                for (int j = 0; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        isSublist_Problem_0_aaa75101_fbec_4e18_bb3d_1f7e181acb34 = False;
                        break;
                    }
                }
                if (isSublist_Problem_0_aaa75101_fbec_4e18_bb3d_1f7e181acb34) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_2_5aeee13e_a1e5_4f9b_b756_45d8f2914ecf(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i < l.size() - s.size() + 1; i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean found = True;
                for (int j = 0; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        found = False;
                        break;
                    }
                }
                if (found) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_2_4c209046_6e39_4293_b90a_6bdaaeb5a584(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(s.get(i) > l.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_2_7e7109d2_612c_40cb_ad63_558349df89b6(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) return False;
        for (int i = 0; i <= l.size() - s.size(); i++) {
            if (l.subList(i, i + s.size()).equals(s)) return True;
        }
        return False;
    }

    
    public static boolean isSublist_Problem_2_99fbd926_e94f_4e03_a2ac_bc9586c6ee78(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i <= l.size() - s.size(); i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean found = True;
                for (int j = 1; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        found = False;
                        break;
                    }
                }
                if (found) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_2_2d61b802_4be3_4a36_bbb1_17e1a945b81d(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() > s.size()) return False;
        for(int i = 0; i < l.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_1_4a8632a6_7a3e_42b5_92f4_627c4dbf6d53(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0, j = 0;
        while (i < l.size() && j < s.size()) {
            if (l.get(i) == s.get(j)) {
                i++;
                j++;
            } else {
                j = 0;
            }
        }
        return i == l.size();
    }

    
    public static boolean isSublist_Problem_0_70dcfe58_a16a_4028_bacb_f5e3c4674b77(ArrayList<Integer> l, ArrayList<Integer> s) {
        // write your code here
        int i = 0, j = 0;
        ArrayList<Integer> a = new ArrayList<Integer>(l);
        ArrayList<Integer> b = new ArrayList<Integer>(s);
        int n = a.size();
        int m = b.size();
        if (n != m) {
            return False;
        }
        ArrayList<Integer> x = new ArrayList<Integer>();
        ArrayList<Integer> y = new ArrayList<Integer>();
        for (i = 0; i < n; i++) {
            if (a.get(i) == b.get(j)) {
                x.add(a.get(i));
                j++;
            } else {
                y.add(a.get(i));
            }
        }
        if (x.size() != y.size()) {
            return False;
        } else {
            return True;
        }
    }

    
    public static boolean isSublist_Problem_0_309e49b4_ec51_49bf_961b_9391c484f19d(ArrayList<Integer> l, ArrayList<Integer> s) {
        int n = s.size();
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> a1 = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            a.add(s.get(i));
        }
        for(int i = 0; i < l.size(); i++) {
            a1.add(l.get(i));
        }
        boolean flag = False;
        for(int i = 0; i < a.size(); i++) {
            for(int j = 0; j < a1.size(); j++) {
                if(a.get(i) == a1.get(j)) {
                    flag = True;
                    break;
                }
            }
            if(flag)
                break;
        }
        return flag;
    }

    
    public static boolean isSublist_Problem_2_e943792f_b615_45f5_8f5a_d83e79c404b8(ArrayList<Integer> l, ArrayList<Integer> s) {
        ArrayList<Integer> temp = new ArrayList<>();
        for(int i = 0; i < l.size(); i++) {
            for(int j = 0; j < s.size(); j++) {
                if(l.get(i) == s.get(j)) {
                    temp.add(l.get(i));
                }
            }
        }
        return temp.size() == s.size();
    }

    
    public static boolean isSublist_Problem_0_99fbd926_e94f_4e03_a2ac_bc9586c6ee78(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i <= l.size() - s.size(); i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean found = True;
                for (int j = 1; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        found = False;
                        break;
                    }
                }
                if (found) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_1_1d88c5db_58b5_484e_9e97_bf031ce3837f(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) return False;
        for (int i = 0; i < l.size(); i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean found = True;
                for (int j = 1; j < s.size(); j++) {
                    if (i + j >= l.size() || !l.get(i + j).equals(s.get(j))) {
                        found = False;
                        break;
                    }
                }
                if (found) return True;
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_1_98c85056_81ce_4b14_af8c_c40fb0bc35e5(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (l.size() < s.size()) {
            return False;
        }
        for (int i = 0; i < s.size(); i++) {
            if (l.get(i) != s.get(i)) {
                return False;
            }
        }
        return True;
    }

    
    public static boolean isSublist_Problem_0_77ec45a3_5a40_4290_900b_a2ef31df38a4(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_0_76dbadc1_3878_4324_9af3_b38fab665e78(ArrayList<Integer> l, ArrayList<Integer> s) {
        boolean isSublist_Problem_0_76dbadc1_3878_4324_9af3_b38fab665e78 = False;
        if (s.size() > l.size()) {
            return False;
        } else {
            l.removeAll(new ArrayList<>());
            isSublist_Problem_0_76dbadc1_3878_4324_9af3_b38fab665e78 = l.equals(s);
        }
        return isSublist_Problem_0_76dbadc1_3878_4324_9af3_b38fab665e78;
    }

    
    public static boolean isSublist_Problem_0_7e598dd8_eac1_411a_95f1_7c42c242fc6d(ArrayList<Integer> l, ArrayList<Integer> s) {
        // Write your code here.
        int i=0,j=0;
        while(i<l.size() && j<s.size()){
            if (l.get(i)==s.get(j)) {
                i++;
                j++;
            }
            if (i<l.size()){
                i++;
            }
            if (j<s.size()){
                j++;
            }
        }
        return i<l.size() && j<s.size();
    }

    
    public static boolean isSublist_Problem_1_5ea2ab97_970d_47fa_b366_466a71a9552a(ArrayList<Integer> l, ArrayList<Integer> s) {
        return l.equals(s);
    }

    
    public static boolean isSublist_Problem_0_aa178538_83be_40f6_9aab_77fc067933f8(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (l.size() < s.size()) {
            return False;
        }
        for (int i = 0; i < s.size(); i++) {
            if (l.get(i) != s.get(i)) {
                return False;
            }
        }
        return True;
    }

    
    public static boolean isSublist_Problem_0_0a0928ce_794b_480d_8ca8_a5d030f83173(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() > s.size()) return False;
        for(int i = 0; i < l.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_1_0931c67a_01fe_488f_a567_c46439b9e35f(ArrayList<Integer> l, ArrayList<Integer> s) {
        for (Integer i : l) {
            if (l.contains(i)) {
                for (Integer j : s) {
                    if (l.contains(j))
                        return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_1_e5d05d03_976f_4c60_b436_e4c38871f04b(ArrayList<Integer> l, ArrayList<Integer> s) {
        // TODO Auto-generated method stub
        return l.equals(s);
    }

    
    public static boolean isSublist_Problem_2_27e263d5_a51f_421a_8988_5591b31198f2(ArrayList<Integer> l, ArrayList<Integer> s) {
        int n = l.size();
        int m = s.size();
        for (int i = 0; i <= n - m; i++) {
            int j;
            for (j = 0; j < m; j++) {
                if (l.get(i + j) != s.get(j)) {
                    break;
                }
            }
            if (j == m) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_0_1c59777a_487f_4a58_bb0f_40774c1f5ba8(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i <= l.size() - s.size(); i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean found = True;
                for (int j = 1; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        found = False;
                        break;
                    }
                }
                if (found) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_0_5bde70ec_766f_4ceb_8919_a2ba350aba51(ArrayList<Integer> l, ArrayList<Integer> s) {
        ArrayList<Integer> l1 = new ArrayList<>(l);
        ArrayList<Integer> s1 = new ArrayList<>(s);
        ArrayList<Integer> l2 = new ArrayList<>();
        ArrayList<Integer> s2 = new ArrayList<>();
        for(int i = 0; i < l1.size(); i++) {
            l2.add(l1.get(i));
        }
        for(int i = 0; i < s1.size(); i++) {
            s2.add(s1.get(i));
        }
        for(int i = 0; i < l2.size(); i++) {
            if(!s2.contains(l2.get(i))) {
                return False;
            }
        }
        return True;
    }

    
    public static boolean isSublist_Problem_2_91044327_31d5_42e9_a258_1de271761c11(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0;
        int j = 0;
        while (i < l.size() && j < s.size()) {
            if (l.get(i) == s.get(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        return i == l.size() && j == s.size();
    }

    
    public static boolean isSublist_Problem_1_d65ee803_bfb6_4a1e_b246_91b96315d905(ArrayList<Integer> l, ArrayList<Integer> s) {
        ArrayList<Integer> sublist = new ArrayList<>();
        for(Integer i : s) {
            for(Integer j : l) {
                if(i.equals(j)) {
                    sublist.add(i);
                }
            }
        }
        return sublist.equals(l);
    }

    
    public static boolean isSublist_Problem_1_afa38060_412e_4908_b6cf_a2073f3c6a75(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_1_64f8695f_6a75_4db4_9374_d6b49214aed1(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_2_4d03905f_69e0_46bb_8221_8d15aa65eb2a(ArrayList<Integer> l, ArrayList<Integer> s) {
        return l.stream()
                .anyMatch(x -> s.stream().anyMatch(y->x==y));
    }

    
    public static boolean isSublist_Problem_2_eca1002e_8fa1_4814_9b74_7ba4f3034978(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_1_cfb97f61_2021_43c6_a3b3_98a570623397(ArrayList<Integer> l, ArrayList<Integer> s) {
        boolean res = False;
        int lSize = l.size(), sSize = s.size();
        if (lSize == sSize) {
            for (int i = 0; i < lSize; i++) {
                if (l.get(i) == s.get(i)) {
                    res = True;
                } else {
                    break;
                }
            }
        }
        return res;
    }

    
    public static boolean isSublist_Problem_0_b702b4dd_3bd1_4dfd_b4ff_a4dd3b8631a6(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(s.size() > l.size()) {
            return False;
        }
        for(int i = 0; i <= l.size() - s.size(); i++) {
            if(l.get(i).equals(s.get(0))) {
                boolean isSublist_Problem_0_b702b4dd_3bd1_4dfd_b4ff_a4dd3b8631a6 = True;
                for(int j = 0; j < s.size(); j++) {
                    if(!l.get(i + j).equals(s.get(j))) {
                        isSublist_Problem_0_b702b4dd_3bd1_4dfd_b4ff_a4dd3b8631a6 = False;
                        break;
                    }
                }
                if(isSublist_Problem_0_b702b4dd_3bd1_4dfd_b4ff_a4dd3b8631a6) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_1_a2f48f4d_7e72_400e_9e78_11616e0f6ab8(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_1_70d18527_40e5_4865_8500_746c2d931962(ArrayList<Integer> l, ArrayList<Integer> s) {
        // Write your code here
        
        

        
        return True;
    }

    
    public static boolean isSublist_Problem_1_41eccd45_828c_4d0b_a89e_3583606e4afe(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0;
        int j = 0;
        int k = 0;
        int l_size = l.size();
        int s_size = s.size();
        while (i < l_size && j < s_size) {
            if (l.get(i) == s.get(j)) {
                i++;
                j++;
                k++;
            } else if (l.get(i) < s.get(j)) {
                i++;
            } else {
                j++;
            }
        }
        return k == s_size;
    }

    
    public static boolean isSublist_Problem_1_b15e24d6_1ecf_4048_a025_b6dc7df913c3(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) return False;
        for (int i = 0; i < l.size() - s.size() + 1; i++) {
            boolean found = True;
            for (int j = 0; j < s.size(); j++) {
                if (l.get(i + j) != s.get(j)) {
                    found = False;
                    break;
                }
            }
            if (found) return True;
        }
        return False;
    }

    
    public static boolean isSublist_Problem_2_70d18527_40e5_4865_8500_746c2d931962(ArrayList<Integer> l, ArrayList<Integer> s) {
        // Write your code here
        
        

        
        return True;
    }

    
    public static boolean isSublist_Problem_2_77564c1d_6a22_4367_b893_3be92bc36722(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() > s.size()) return False;
        for(int i = 0; i < l.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_0_e23fea05_7bed_4d3d_b7c8_289fb7ccbbdc(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) return False;
        for (int i = 0; i < l.size() - s.size() + 1; i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean found = True;
                for (int j = 0; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        found = False;
                        break;
                    }
                }
                if (found) return True;
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_2_b5adac7e_4e2e_4d5b_9ea6_a4f174c3aa73(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) return False;
        for (int i = 0; i < l.size() - s.size() + 1; i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean found = True;
                for (int j = 1; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        found = False;
                        break;
                    }
                }
                if (found) return True;
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_0_0931c67a_01fe_488f_a567_c46439b9e35f(ArrayList<Integer> l, ArrayList<Integer> s) {
        for (Integer i : l) {
            if (l.contains(i)) {
                for (Integer j : s) {
                    if (l.contains(j))
                        return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_1_296d3b1f_d231_4768_8044_02e4c6f11266(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (l.size() < s.size()) return False;
        for (int i = 0; i < s.size(); i++) {
            if (l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_2_39d8cdb7_0b53_4aea_8520_e483726d3200(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0;
        int j = 0;
        boolean flag = False;
        if (s.isEmpty()) {
            return True;
        }
        if (l.isEmpty()) {
            return False;
        }
        if (s.equals(l)) {
            return True;
        }
        for (; i < l.size(); i++) {
            if (s.equals(l.get(i))) {
                flag = True;
            } else {
                flag = False;
                break;
            }
        }
        if (flag) {
            System.out.println("Sublist found");
        } else {
            System.out.println("Sublist not found.");
        }
        return False;
    }

    
    public static boolean isSublist_Problem_1_127ad148_9f40_4c0e_8d08_4078175bd1f6(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_1_5aeee13e_a1e5_4f9b_b756_45d8f2914ecf(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i < l.size() - s.size() + 1; i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean found = True;
                for (int j = 0; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        found = False;
                        break;
                    }
                }
                if (found) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_1_bd85ab9d_4a4b_404e_94ca_713ef2e4b9d3(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_1_44dc0792_f6e7_4362_9c2b_ea47fe2bed8d(ArrayList<Integer> l, ArrayList<Integer> s) {
        List<Integer> al = new ArrayList<>();
        al.addAll(l.subList(1,l.size()));
        al.addAll(s.subList(1,s.size()));
        System.out.println(al);
        return al.containsAll(l);
    }

    
    public static boolean isSublist_Problem_2_309e49b4_ec51_49bf_961b_9391c484f19d(ArrayList<Integer> l, ArrayList<Integer> s) {
        int n = s.size();
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> a1 = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            a.add(s.get(i));
        }
        for(int i = 0; i < l.size(); i++) {
            a1.add(l.get(i));
        }
        boolean flag = False;
        for(int i = 0; i < a.size(); i++) {
            for(int j = 0; j < a1.size(); j++) {
                if(a.get(i) == a1.get(j)) {
                    flag = True;
                    break;
                }
            }
            if(flag)
                break;
        }
        return flag;
    }

    
    public static boolean isSublist_Problem_0_49d3bf62_daea_4b89_affa_01d83fb3897b(ArrayList<Integer> l, ArrayList<Integer> s) {
        // Write your code here
        try{
            Arrays.asList(s.toArray());
        }catch (Exception e){
            return False;
        }
        try{
            Arrays.asList(l.toArray());
        }catch (Exception e){
            return False;
        }
        return False;
    }

    
    public static boolean isSublist_Problem_1_aa178538_83be_40f6_9aab_77fc067933f8(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (l.size() < s.size()) {
            return False;
        }
        for (int i = 0; i < s.size(); i++) {
            if (l.get(i) != s.get(i)) {
                return False;
            }
        }
        return True;
    }

    
    public static boolean isSublist_Problem_2_8711275a_a953_48a3_ae22_82cd2900cbab(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i <= l.size() - s.size(); i++) {
            if (l.subList(i, i + s.size()).equals(s)) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_1_23f895e8_ed35_464a_bf99_5bbcf0850dd7(ArrayList<Integer> l, ArrayList<Integer> s) {
        boolean flag = False;
        ArrayList<Integer> result = new ArrayList<>();
        for(int i : l) {
            if(!s.contains(i))
                return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_2_09ce9c0e_c2ff_489c_9955_00c4ad6ed772(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (l.size() < s.size()) return False;
        for (int i = 0; i < s.size(); i++) {
            if (l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_1_bd1c7a2d_58d8_41c1_afff_1a3a7ef4fcfd(ArrayList<Integer> l, ArrayList<Integer> s) {
        // Write your code here
        ArrayList<Integer> n = new ArrayList<>();
        n.addAll(l);
        n.removeAll(s);
        if (n.isEmpty()) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isSublist_Problem_0_8efd2f0f_5f22_4734_be00_16e55e5326a8(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (l.size() < s.size()) {
            return False;
        }
        boolean result = True;
        for (int i = 0; i < s.size(); i++) {
            result &= (l.get(i) == s.get(i));
        }
        return result;
    }

    
    public static boolean isSublist_Problem_1_66088db6_2417_4390_a7d1_cd9536b93636(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_0_7e598dd8_eac1_411a_95f1_7c42c242fc6d(ArrayList<Integer> l, ArrayList<Integer> s) {
        // Write your code here.
        int i=0,j=0;
        while(i<l.size() && j<s.size()){
            if (l.get(i)==s.get(j)) {
                i++;
                j++;
            }
            if (i<l.size()){
                i++;
            }
            if (j<s.size()){
                j++;
            }
        }
        return i<l.size() && j<s.size();
    }

    
    public static boolean isSublist_Problem_2_67dc36c8_9caa_40fd_8af8_dc71398d6f00(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_1_dd75e223_e73d_44db_9920_5eee3bf27b6b(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i <= l.size() - s.size(); i++) {
            if (l.get(i).equals(s.get(0))) {
                int j = 0;
                while (j < s.size() && l.get(i + j).equals(s.get(j))) {
                    j++;
                }
                if (j == s.size()) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_0_ee076d96_f32b_4e13_8e13_aef08a7de614(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0;
        int j = 0;
        while (i < l.size() && j < s.size()) {
            if (l.get(i) == s.get(j)) {
                i++;
                j++;
            } else {
                j = 0;
            }
        }
        return i == l.size();
    }

    
    public static boolean isSublist_Problem_1_3d69f560_19d5_49bb_aa0d_ed21656df0e7(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() > s.size()) return False;
        for(int i = 0; i < l.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_0_be5e6cf3_da1a_471d_b23c_7d4a4079dc05(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i <= l.size() - s.size(); i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean found = True;
                for (int j = 0; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        found = False;
                        break;
                    }
                }
                if (found) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_1_eb51cdd1_244d_4820_a34d_863c3f733264(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_1_f9064bdb_0afb_4ba3_bb06_7a37d4b076c9(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0;
        int j = 0;
        while (i < l.size() && j < s.size()) {
            if (l.get(i) == s.get(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        return i == l.size() && j == s.size();
    }

    
    public static boolean isSublist_Problem_1_ee4baca4_3384_4b60_8677_1bee4c5b4d80(ArrayList<Integer> l, ArrayList<Integer> s) {
        for(int i = 0; i < l.size(); i++) {
            if(s.contains(l.get(i))) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_2_484f2b08_1d39_4434_8e0a_b79e60ef80a9(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (l.size() < s.size()) {
            return False;
        }
        for (int i = 0; i <= l.size() - s.size(); i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean isSublist_Problem_2_484f2b08_1d39_4434_8e0a_b79e60ef80a9 = True;
                for (int j = 0; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        isSublist_Problem_2_484f2b08_1d39_4434_8e0a_b79e60ef80a9 = False;
                        break;
                    }
                }
                if (isSublist_Problem_2_484f2b08_1d39_4434_8e0a_b79e60ef80a9) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_1_f6a795b4_5699_4408_a11b_d47fd371a7d6(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (l.size() < s.size()) {
            return False;
        }
        for (int i = 0; i < s.size(); i++) {
            if (l.get(i) != s.get(i)) {
                return False;
            }
        }
        return True;
    }

    
    public static boolean isSublist_Problem_0_be445565_e29f_4a2e_bc96_64b70802aabd(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < l.size() && j < s.size()) {
            if (l.get(i) == s.get(j)) {
                i++;
                j++;
            } else {
                j++;
            }
        }
        if (i == l.size()) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isSublist_Problem_1_77ec45a3_5a40_4290_900b_a2ef31df38a4(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_1_42e002fe_f5c7_4e98_98ed_51396757190c(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_0_54862011_cb1d_41d2_9cf7_bd78a32ec751(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0;
        int j = 0;
        while (i < l.size() && j < s.size()) {
            if (l.get(i) == s.get(j)) {
                i++;
                j++;
            } else if (l.get(i) > s.get(j)) {
                j++;
            } else {
                i++;
            }
        }
        return i == l.size() && j == s.size();
    }

    
    public static boolean isSublist_Problem_1_e2bf29a5_d7e9_4eb6_9a08_48dd374af40f(ArrayList<Integer> l, ArrayList<Integer> s) {
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> s1 = new ArrayList<>();
        for(Integer i : l) {
            l1.add(i);
        }
        for(Integer i : s) {
            s1.add(i);
        }
        boolean result = l1.containsAll(s1);
        return result;
    }

    
    public static boolean isSublist_Problem_1_230f8b6b_cc74_49eb_abc9_558fbeee96a0(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < l.size() && j < s.size()) {
            if (l.get(i) == s.get(j)) {
                i++;
                j++;
                k++;
            } else if (l.get(i) < s.get(j)) {
                i++;
            } else {
                j++;
            }
        }
        return k == s.size();
    }

    
    public static boolean isSublist_Problem_2_9e6c4162_4c3d_4f23_963d_96304927b7f5(ArrayList<Integer> l, ArrayList<Integer> s) {
        ArrayList<Integer> sublist = s.stream().filter(el -> !l.contains(el)).collect(Collectors.toCollection(ArrayList::new));
        return l.stream().noneMatch(el -> sublist.contains(el));
    }

    
    public static boolean isSublist_Problem_0_e5966a00_4148_4d30_bb74_ed44c6d73076(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i < l.size() - s.size() + 1; i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean found = True;
                for (int j = 0; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        found = False;
                        break;
                    }
                }
                if (found) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_2_0ae58ff2_4d7f_420b_bd33_e84d7852e227(ArrayList<Integer> l, ArrayList<Integer> s) {
        return l.equals(s);
    }

    
    public static boolean isSublist_Problem_1_a675dfe3_6208_45d7_9b5f_6aa6d71ecffc(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_2_1b4cc0d7_230b_46e2_b877_2dfb48b8a01d(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_2_dbc6bda3_1838_4f34_983a_220315ce3c8e(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_1_57c0d0c2_66fb_40b6_8fa9_050d6cb74b0c(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_1_ee58d81a_e9a7_4f70_bc9c_fbc673cf858b(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i <= l.size() - s.size(); i++) {
            if (l.subList(i, i + s.size()).equals(s)) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_0_18e4a846_3f91_4039_83bd_c538e59486b3(ArrayList<Integer> l, ArrayList<Integer> s) {
        int n = l.size();
        int m = s.size();
        for (int i = 0; i <= n - m; i++) {
            int j;
            for (j = 0; j < m; j++) {
                if (l.get(i + j) != s.get(j)) {
                    break;
                }
            }
            if (j == m) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_0_60617548_c878_4930_b296_986971ac41eb(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0;
        int j = 0;
        int k = 0;
        int l_size = l.size();
        int s_size = s.size();
        while (i < l_size && j < s_size) {
            if (l.get(i) == s.get(j)) {
                i++;
                j++;
                k++;
            } else if (l.get(i) < s.get(j)) {
                i++;
            } else {
                j++;
            }
        }
        return k == s_size;
    }

    
    public static boolean isSublist_Problem_0_7cf383c6_aeba_4bd7_ab78_ecb9800338e8(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_2_c0fb15f9_0a64_452d_8f41_735a3851f56e(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i < l.size() - s.size() + 1; i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean isSublist_Problem_2_c0fb15f9_0a64_452d_8f41_735a3851f56e = True;
                for (int j = 0; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        isSublist_Problem_2_c0fb15f9_0a64_452d_8f41_735a3851f56e = False;
                        break;
                    }
                }
                if (isSublist_Problem_2_c0fb15f9_0a64_452d_8f41_735a3851f56e) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_0_f46e5471_0342_4abd_8280_1ad1a5e8cc2f(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i <= l.size() - s.size(); i++) {
            if (l.get(i).equals(s.get(0))) {
                int j = 0;
                while (j < s.size() && l.get(i + j).equals(s.get(j))) {
                    j++;
                }
                if (j == s.size()) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_2_64f8695f_6a75_4db4_9374_d6b49214aed1(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_1_42077c43_9f24_42dc_90ee_2394843b6b06(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_0_893d5ecf_3402_4556_8ad3_3e1a6ec76325(ArrayList<Integer> l, ArrayList<Integer> s) {
        ArrayList<Integer> sublist = new ArrayList<>();
        for(Integer i : l) {
            for(Integer j : s) {
                if(i.equals(j)) {
                    sublist.add(i);
                    break;
                }
            }
        }
        return sublist.equals(s);
    }

    
    public static boolean isSublist_Problem_0_cd958c5b_add7_4cc0_a1e9_290353dcf20c(ArrayList<Integer> l, ArrayList<Integer> s) {
        ArrayList<Integer> l1 = new ArrayList<>(l);
        ArrayList<Integer> s1 = new ArrayList<>(s);
        ArrayList<Integer> l2 = new ArrayList<>();
        ArrayList<Integer> s2 = new ArrayList<>();
        for(int i = 0; i < l.size(); i++) {
            l2.add(l.get(i));
        }
        for(int i = 0; i < s.size(); i++) {
            s2.add(s.get(i));
        }
        for(int i = 0; i < l1.size(); i++) {
            if(!s2.contains(l1.get(i))) {
                return False;
            }
        }
        return True;
    }

    
    public static boolean isSublist_Problem_2_8934fb96_4d08_4e27_98c0_c8ce0b010034(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_2_4a83d61d_48e6_4357_88f0_03a4b265096e(ArrayList<Integer> l, ArrayList<Integer> s) {
        return l.containsAll(s);
    }

    
    public static boolean isSublist_Problem_0_ba86dde6_7f12_4f01_a5e5_10bc7ceb550d(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0;
        int j = 0;
        while (i < l.size() && j < s.size()) {
            if (l.get(i) == s.get(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        return i == l.size() && j == s.size();
    }

    
    public static boolean isSublist_Problem_1_101227d9_93b8_4da3_a95f_804bb0582974(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) return False;
        for (int i = 0; i < l.size() - s.size() + 1; i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean isSublist_Problem_1_101227d9_93b8_4da3_a95f_804bb0582974 = True;
                for (int j = 0; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        isSublist_Problem_1_101227d9_93b8_4da3_a95f_804bb0582974 = False;
                        break;
                    }
                }
                if (isSublist_Problem_1_101227d9_93b8_4da3_a95f_804bb0582974) return True;
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_0_959afae6_6ecd_4b8f_8701_03f601f3ac15(ArrayList<Integer> l, ArrayList<Integer> s) {
        int n = l.size();
        int m = s.size();
        for (int i = 0; i < n - m + 1; i++) {
            int j;
            for (j = 0; j < m; j++) {
                if (l.get(i + j) != s.get(j)) {
                    break;
                }
            }
            if (j == m) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_0_d3f24548_cf1a_48cd_a2ff_a0add096eae1(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_0_a9f444ea_bdfe_445a_8b35_44142f4cde1f(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) return False;
        for (int i = 0; i < l.size() - s.size() + 1; i++) {
            if (l.get(i).equals(s.get(0))) {
                int j = 0;
                while (j < s.size() && l.get(i + j).equals(s.get(j))) j++;
                if (j == s.size()) return True;
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_1_fd682482_4055_48fd_8d98_1227db5277c6(ArrayList<Integer> l, ArrayList<Integer> s) {
        // write your logic here
        
        // return True if your logic passes successfully
        return False;
    }

    
    public static boolean isSublist_Problem_0_15776ef8_f750_406b_81a6_b7e4bb21b6db(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_0_0724c605_ddfe_490d_9654_9b42f5f0eb8e(ArrayList<Integer> l, ArrayList<Integer> s) {
        ArrayList<Integer> sublist = new ArrayList<>();
        for(int i = 0; i < l.size(); i++) {
            for(int j = 0; j < s.size(); j++) {
                if(l.get(i) == s.get(j)) {
                    sublist.add(l.get(i));
                }
            }
        }
        return sublist.equals(s);
    }

    
    public static boolean isSublist_Problem_0_e0149b92_84fd_4735_bb07_055103ab96b4(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_0_ce760bd0_031e_46f4_966c_9c89357cae18(ArrayList<Integer> l, ArrayList<Integer> s) {
        int n = l.size();
        int m = s.size();
        if (m > n) return False;
        for (int i = 0; i <= n - m; i++) {
            int j;
            for (j = 0; j < m; j++) {
                if (l.get(i + j) != s.get(j)) break;
            }
            if (j == m) return True;
        }
        return False;
    }

    
    public static boolean isSublist_Problem_1_89601132_d6f3_4ce1_9c73_7869ab953205(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() > s.size()) return False;
        for(int i = 0; i < l.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_2_c159444a_a3ee_464f_b236_828b0f5ae838(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_2_4a8632a6_7a3e_42b5_92f4_627c4dbf6d53(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0, j = 0;
        while (i < l.size() && j < s.size()) {
            if (l.get(i) == s.get(j)) {
                i++;
                j++;
            } else {
                j = 0;
            }
        }
        return i == l.size();
    }

    
    public static boolean isSublist_Problem_0_0931c67a_01fe_488f_a567_c46439b9e35f(ArrayList<Integer> l, ArrayList<Integer> s) {
        for (Integer i : l) {
            if (l.contains(i)) {
                for (Integer j : s) {
                    if (l.contains(j))
                        return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_2_a985b230_1c1b_48b7_9c88_c8c9b374e880(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0;
        int j = 0;
        while (i < l.size() && j < s.size()) {
            if (l.get(i) == s.get(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        return i == l.size() && j == s.size();
    }

    
    public static boolean isSublist_Problem_1_c0c5ae37_d768_40aa_b6b7_7c7526c96848(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i <= l.size() - s.size(); i++) {
            if (l.get(i) == s.get(0)) {
                boolean match = True;
                for (int j = 0; j < s.size(); j++) {
                    if (l.get(i + j) != s.get(j)) {
                        match = False;
                        break;
                    }
                }
                if (match) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_2_19e800a7_cd92_4baf_861e_d7597d433af8(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() == 0) return True;
        if (l.size() == 0) return False;
        if (l.size() < s.size()) return False;
        for (int i = 0; i < l.size() - s.size() + 1; i++) {
            boolean match = True;
            for (int j = 0; j < s.size(); j++) {
                if (l.get(i + j) != s.get(j)) {
                    match = False;
                    break;
                }
            }
            if (match) return True;
        }
        return False;
    }

    
    public static boolean isSublist_Problem_2_6da25625_0ad0_4d1a_89e1_a6bbac463f19(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0;
        int j = 0;
        while (i < l.size() && j < s.size()) {
            if (l.get(i) == s.get(j)) {
                i++;
                j++;
            } else {
                j++;
            }
        }
        return i == l.size();
    }

    
    public static boolean isSublist_Problem_1_00c730ab_60b0_4cab_b479_e03d8861e245(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_2_ee4baca4_3384_4b60_8677_1bee4c5b4d80(ArrayList<Integer> l, ArrayList<Integer> s) {
        for(int i = 0; i < l.size(); i++) {
            if(s.contains(l.get(i))) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_0_a675dfe3_6208_45d7_9b5f_6aa6d71ecffc(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_1_78c63d39_ea81_4843_8b16_4825d1f7e4fa(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (l.size() < s.size()) return False;
        if (l.size() == s.size()) {
            for (int i = 0; i < l.size(); i++) {
                if (l.get(i) != s.get(i)) return False;
            }
            return True;
        }
        for (int i = 0; i < l.size() - s.size(); i++) {
            boolean found = True;
            for (int j = 0; j < s.size(); j++) {
                if (l.get(i+j) != s.get(j)) {
                    found = False;
                    break;
                }
            }
            if (found) return True;
        }
        return False;
    }

    
    public static boolean isSublist_Problem_0_6e732b6b_6ef0_483a_a871_e620db647710(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_1_6fe7fd3a_ed60_4500_82f7_6b3b551128fc(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0, j = 0;
        while (i < l.size() && j < s.size()) {
            if (l.get(i) == s.get(j)) {
                i++;
                j++;
            } else {
                j++;
            }
        }
        return i == l.size();
    }

    
    public static boolean isSublist_Problem_2_ca3e0a19_825c_4c9d_bc39_508eda23c4f6(ArrayList<Integer> l, ArrayList<Integer> s) {
        boolean flag = True;
        for (int i : s) {
            if (!l.contains(i)) {
                flag = False;
                break;
            }
        }
        return flag;
    }

    
    public static boolean isSublist_Problem_2_e47f869c_fbb3_4b92_9302_e83631efc288(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() > s.size()) return False;
        for(int i = 0; i < l.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_2_e23fea05_7bed_4d3d_b7c8_289fb7ccbbdc(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) return False;
        for (int i = 0; i < l.size() - s.size() + 1; i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean found = True;
                for (int j = 0; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        found = False;
                        break;
                    }
                }
                if (found) return True;
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_0_89601132_d6f3_4ce1_9c73_7869ab953205(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() > s.size()) return False;
        for(int i = 0; i < l.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_1_e23fea05_7bed_4d3d_b7c8_289fb7ccbbdc(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) return False;
        for (int i = 0; i < l.size() - s.size() + 1; i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean found = True;
                for (int j = 0; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        found = False;
                        break;
                    }
                }
                if (found) return True;
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_2_cc2607df_ea6e_4849_83b9_d111973beb07(ArrayList<Integer> l, ArrayList<Integer> s) {
        // Write your code here
        return l.equals(s);
    }

    
    public static boolean isSublist_Problem_0_42077c43_9f24_42dc_90ee_2394843b6b06(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_0_67dc36c8_9caa_40fd_8af8_dc71398d6f00(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_0_e2bf29a5_d7e9_4eb6_9a08_48dd374af40f(ArrayList<Integer> l, ArrayList<Integer> s) {
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> s1 = new ArrayList<>();
        for(Integer i : l) {
            l1.add(i);
        }
        for(Integer i : s) {
            s1.add(i);
        }
        boolean result = l1.containsAll(s1);
        return result;
    }

    
    public static boolean isSublist_Problem_0_41131089_d74d_41b2_b695_706990cc0f28(ArrayList<Integer> l, ArrayList<Integer> s) {
        ArrayList<Integer> temp = new ArrayList<>();
        for(Integer i : l) {
            if(!temp.contains(i)) {
                temp.add(i);
            }
        }
        for(Integer i : s) {
            if(!temp.contains(i)) {
                return False;
            }
        }
        return True;
    }

    
    public static boolean isSublist_Problem_1_e3a5ac86_9b37_4614_85d6_285a16e5c5d2(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0;
        int j = 0;
        while(i < l.size() && j < s.size()) {
            if(l.get(i) == s.get(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        return i == l.size() && j == s.size();
    }

    
    public static boolean isSublist_Problem_0_463a627f_0b05_4a5d_a2bd_b31395d68324(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i < l.size() - s.size() + 1; i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean found = True;
                for (int j = 1; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        found = False;
                        break;
                    }
                }
                if (found) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_2_161c2dd9_3a8c_40d9_b650_bd92ece17c3f(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_2_b2ccaffd_8d43_426a_8535_2e10c11db08a(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i < l.size() - s.size() + 1; i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean found = True;
                for (int j = 0; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        found = False;
                        break;
                    }
                }
                if (found) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_2_20c690cb_640c_41ba_b935_1b4653ddff24(ArrayList<Integer> l, ArrayList<Integer> s) {
        return l.stream().anyMatch(i -> s.contains(i));
    }

    
    public static boolean isSublist_Problem_2_d37e166e_4656_4dc9_ac45_3ae6ba4d16d0(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() == 0) return True;
        if (l.size() == 0) return False;
        if (l.size() < s.size()) return False;
        for (int i = 0; i < l.size() - s.size() + 1; i++) {
            boolean isSub = True;
            for (int j = 0; j < s.size(); j++) {
                if (!l.get(i + j).equals(s.get(j))) {
                    isSub = False;
                    break;
                }
            }
            if (isSub) return True;
        }
        return False;
    }

    
    public static boolean isSublist_Problem_0_9d56c486_1776_47c7_acbb_ba8214ebab31(ArrayList<Integer> l, ArrayList<Integer> s) {
        boolean res = True;
        for (Integer i : s) {
            for (Integer j : l) {
                if (i == j) {
                    res = False;
                    break;
                }
            }
        }
        return res;
    }

    
    public static boolean isSublist_Problem_0_6e732b6b_6ef0_483a_a871_e620db647710(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_2_68a72de4_7465_4ebf_9e15_ba04af519880(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (l.size() < s.size()) return False;
        for (int i = 0; i < s.size(); i++) {
            if (l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_0_0e0b028a_bc6d_4535_a417_eca332ac7d67(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_2_ee8af824_d884_4942_878e_d3b6f8a70e3e(ArrayList<Integer> l, ArrayList<Integer> s) {
        return Arrays.asList(l).containsAll(Arrays.asList(s));
    }

    
    public static boolean isSublist_Problem_0_9250528c_815b_4fe8_b5b7_fbdc2026c37c(ArrayList<Integer> l, ArrayList<Integer> s) {
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> s1 = new ArrayList<>();
        for(Integer i : l) {
            l1.add(i);
        }
        for(Integer i : s) {
            s1.add(i);
        }
        boolean result = l1.containsAll(s1);
        return result;
    }

    
    public static boolean isSublist_Problem_1_8a031536_4dd5_47ad_9338_92d19739d184(ArrayList<Integer> l, ArrayList<Integer> s) {
        return l.containsAll(s);
    }

    
    public static boolean isSublist_Problem_0_8711275a_a953_48a3_ae22_82cd2900cbab(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i <= l.size() - s.size(); i++) {
            if (l.subList(i, i + s.size()).equals(s)) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_1_9211e0a7_a97d_4b41_a625_f81c62c7f67b(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(s.get(i) != l.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_0_a675dfe3_6208_45d7_9b5f_6aa6d71ecffc(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_0_9fe83b70_2bd8_48ed_81fc_ebff4a798667(ArrayList<Integer> l, ArrayList<Integer> s) {
        boolean result = False;
        for(Integer i : l) {
            for(Integer j : s) {
                if(l.contains(j) && s.contains(i)) {
                    result = True;
                }
            }
        }
        return result;
    }

    
    public static boolean isSublist_Problem_1_56d8c86d_9bc8_4413_aae8_250e83ff6fbe(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_2_47ba365b_0d76_4285_9914_4f5268f08624(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.isEmpty()) {
            return True;
        } else {
            boolean result = False;
            for (int i = 0; i < l.size(); i++) {
                boolean found = False;
                for (int j = 0; j < s.size(); j++) {
                    if (l.get(i).compareTo(s.get(i)) < 0) {
                        found = True;
                        break;
                    }
                }
                if (!found) {
                    result = True;
                    break;
                }
            }
            return result;
        }
    }

    
    public static boolean isSublist_Problem_1_af725686_ebc5_415f_9afd_1c1a551f5071(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < l.size() && j < s.size()) {
            if (l.get(i) == s.get(j)) {
                i++;
                j++;
                k++;
            } else if (l.get(i) < s.get(j)) {
                i++;
            } else {
                j++;
            }
        }
        return k == s.size();
    }

    
    public static boolean isSublist_Problem_1_9d56c486_1776_47c7_acbb_ba8214ebab31(ArrayList<Integer> l, ArrayList<Integer> s) {
        boolean res = True;
        for (Integer i : s) {
            for (Integer j : l) {
                if (i == j) {
                    res = False;
                    break;
                }
            }
        }
        return res;
    }

    
    public static boolean isSublist_Problem_1_8425bb06_d28b_463c_9c6a_7b4db25a7221(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < l.size() && j < s.size()) {
            if (l.get(i) == s.get(j)) {
                i++;
                j++;
                k++;
            } else if (l.get(i) > s.get(j)) {
                j++;
            } else {
                i++;
            }
        }
        return k == s.size();
    }

    
    public static boolean isSublist_Problem_1_f54a3128_8885_4069_8652_60fe5d13d732(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < l.size() && j < s.size()) {
            if (l.get(i) == s.get(j)) {
                i++;
                j++;
                k++;
            } else if (l.get(i) < s.get(j)) {
                i++;
            } else {
                j++;
            }
        }
        return k == s.size();
    }

    
    public static boolean isSublist_Problem_2_e5966a00_4148_4d30_bb74_ed44c6d73076(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i < l.size() - s.size() + 1; i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean found = True;
                for (int j = 0; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        found = False;
                        break;
                    }
                }
                if (found) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_0_98072898_12a6_4776_8d9d_b2a0015e61c7(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() > s.size()) return False;
        for(int i = 0; i < l.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_2_035a859e_8d56_4486_87b4_d47b4b12b7d5(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (l.size() < s.size()) return False;
        for (int i = 0; i < s.size(); i++) {
            if (l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_0_648f238c_a07e_4e3e_898c_58b842dd77c4(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < l.size() && j < s.size()) {
            if (l.get(i) == s.get(j)) {
                i++;
                j++;
                k++;
            } else if (l.get(i) < s.get(j)) {
                i++;
            } else {
                j++;
            }
        }
        return k == s.size();
    }

    
    public static boolean isSublist_Problem_2_9e303d14_2530_4baf_a2a5_606d9cf62c68(ArrayList<Integer> l, ArrayList<Integer> s) {
        boolean sub = False;
        try{
            if(!l.containsAll(s)){
                sub=False;
            }
        }catch(Exception ex){
            sub = True;
        }
        return sub;
    }

    
    public static boolean isSublist_Problem_0_682f657b_360f_490c_b364_4c0e53553b21(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0;
        int j = 0;
        int size = l.size();
        int size2 = s.size();
        while (i < size && j < size2) {
            if (l.get(i) == s.get(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        return i == size && j == size2;
    }

    
    public static boolean isSublist_Problem_1_6854a34c_0993_4b12_a2d1_b788f149ba50(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i <= l.size() - s.size(); i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean found = True;
                for (int j = 1; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        found = False;
                        break;
                    }
                }
                if (found) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_1_dbc6bda3_1838_4f34_983a_220315ce3c8e(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_2_bb7a2d9f_78d1_4e13_81c3_6ed6b068357c(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i < l.size() - s.size() + 1; i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean isSublist_Problem_2_bb7a2d9f_78d1_4e13_81c3_6ed6b068357c = True;
                for (int j = 0; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        isSublist_Problem_2_bb7a2d9f_78d1_4e13_81c3_6ed6b068357c = False;
                        break;
                    }
                }
                if (isSublist_Problem_2_bb7a2d9f_78d1_4e13_81c3_6ed6b068357c) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_0_0d33a3a1_2d79_4123_8619_1b24112fc357(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_2_986d93c4_f89a_4e8d_a7a7_0d9146e8dda6(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i < l.size() - s.size() + 1; i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean isSublist_Problem_2_986d93c4_f89a_4e8d_a7a7_0d9146e8dda6 = True;
                for (int j = 1; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        isSublist_Problem_2_986d93c4_f89a_4e8d_a7a7_0d9146e8dda6 = False;
                        break;
                    }
                }
                if (isSublist_Problem_2_986d93c4_f89a_4e8d_a7a7_0d9146e8dda6) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_1_8425bb06_d28b_463c_9c6a_7b4db25a7221(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < l.size() && j < s.size()) {
            if (l.get(i) == s.get(j)) {
                i++;
                j++;
                k++;
            } else if (l.get(i) > s.get(j)) {
                j++;
            } else {
                i++;
            }
        }
        return k == s.size();
    }

    
    public static boolean isSublist_Problem_1_a7f4bc79_7bbd_4eaa_b161_4c9a6449861c(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_0_1b6d5d47_a3c9_4406_a7c6_c2f6a207f1d1(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (l.size() < s.size()) return False;
        for (int i = 0; i < s.size(); i++) {
            if (l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_0_56d8c86d_9bc8_4413_aae8_250e83ff6fbe(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_0_66c05780_0026_432b_93f8_5450bcb16f08(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_2_9bb8125e_5981_4ed0_9734_a9c22ead0a0c(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (l.size() < s.size()) return False;
        for (int i = 0; i < s.size(); i++) {
            if (l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_1_f54a3128_8885_4069_8652_60fe5d13d732(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < l.size() && j < s.size()) {
            if (l.get(i) == s.get(j)) {
                i++;
                j++;
                k++;
            } else if (l.get(i) < s.get(j)) {
                i++;
            } else {
                j++;
            }
        }
        return k == s.size();
    }

    
    public static boolean isSublist_Problem_0_e3a5ac86_9b37_4614_85d6_285a16e5c5d2(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0;
        int j = 0;
        while(i < l.size() && j < s.size()) {
            if(l.get(i) == s.get(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        return i == l.size() && j == s.size();
    }

    
    public static boolean isSublist_Problem_2_3ea1fa79_333c_4559_83a4_c43f4cb80458(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (l.size() < s.size()) return False;
        for (int i = 0; i < s.size(); i++) {
            if (l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_1_480f13b1_2334_4593_97e5_1b30ddfb4a74(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i < l.size(); i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean isSublist_Problem_1_480f13b1_2334_4593_97e5_1b30ddfb4a74 = True;
                for (int j = 0; j < s.size(); j++) {
                    if (i + j >= l.size() || !l.get(i + j).equals(s.get(j))) {
                        isSublist_Problem_1_480f13b1_2334_4593_97e5_1b30ddfb4a74 = False;
                        break;
                    }
                }
                if (isSublist_Problem_1_480f13b1_2334_4593_97e5_1b30ddfb4a74) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_2_e943792f_b615_45f5_8f5a_d83e79c404b8(ArrayList<Integer> l, ArrayList<Integer> s) {
        ArrayList<Integer> temp = new ArrayList<>();
        for(int i = 0; i < l.size(); i++) {
            for(int j = 0; j < s.size(); j++) {
                if(l.get(i) == s.get(j)) {
                    temp.add(l.get(i));
                }
            }
        }
        return temp.size() == s.size();
    }

    
    public static boolean isSublist_Problem_0_d81341e5_9025_401e_bc26_59dd0a0480b6(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() <= 1) {
            return True;
        }
        List<Integer> l1 = l.subList(0, l.size()-1);
        List<Integer> s1 = s.subList(0, s.size() - 1);
        return l1.equals(s1);
    }

    
    public static boolean isSublist_Problem_2_0b8158bf_4337_4448_ac3a_3a609c5b23c2(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_2_e4b2d6c2_c142_4102_8a5e_26747220ce27(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() != s.size())
            return False;
        int i = 0, j = 0, k = 0;
        while(i < l.size() && j < s.size()) {
            if(l.get(i).equals(s.get(j)))
                i++;
            else if(l.get(i).compareTo(s.get(j)) > 0)
                i++;
            else
                return False;
            j++;
        }
        return i == l.size();
    }

    
    public static boolean isSublist_Problem_2_ccf7f12c_b39e_4483_bc46_3940277272a7(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i < l.size() - s.size() + 1; i++) {
            if (l.get(i).equals(s.get(0))) {
                int j = 0;
                for (; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        break;
                    }
                }
                if (j == s.size()) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_2_5c1baabd_1aa2_4166_b36f_c4d4c1f9eb1f(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0, j = 0;
        for(; i < l.size() && j < s.size(); ++i, ++j) {
            if(l.get(i) != s.get(j)) {
                return False;
            }
        }
        return i == l.size() && j == s.size();
    }

    
    public static boolean isSublist_Problem_0_529e52f7_3aa9_4177_8d09_f97616c4e75c(ArrayList<Integer> l, ArrayList<Integer> s) {
        int n = l.size();
        int m = s.size();
        if (m > n) return False;
        int i = 0, j = 0;
        while (i < n && j < m) {
            if (l.get(i).equals(s.get(j))) {
                i++;
                j++;
            } else {
                i = i - j + 1;
                j = 0;
            }
        }
        return j == m;
    }

    
    public static boolean isSublist_Problem_0_14fd2743_2df2_4793_b6dd_f7c2db4243d2(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < l.size() && j < s.size()) {
            if (l.get(i) == s.get(j)) {
                i++;
                j++;
            } else {
                j++;
            }
        }
        if (i == l.size()) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isSublist_Problem_2_5b926126_5fe0_49ee_8722_e4d3235bfee1(ArrayList<Integer> l, ArrayList<Integer> s) {
        return l.stream().anyMatch(i -> s.stream().anyMatch(j -> i.equals(j)));
    }

    
    public static boolean isSublist_Problem_2_9d56c486_1776_47c7_acbb_ba8214ebab31(ArrayList<Integer> l, ArrayList<Integer> s) {
        boolean res = True;
        for (Integer i : s) {
            for (Integer j : l) {
                if (i == j) {
                    res = False;
                    break;
                }
            }
        }
        return res;
    }

    
    public static boolean isSublist_Problem_0_7767fc25_7e2a_4a9a_95cb_9d49d0cff6e5(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_2_eb8aef41_aa02_4c7b_b72b_8d4123c7b27b(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i <= l.size() - s.size(); i++) {
            if (l.get(i).equals(s.get(0))) {
                if (l.subList(i, i + s.size()).equals(s)) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_0_817894ac_6d26_4a18_90f8_58672498e0bf(ArrayList<Integer> l, ArrayList<Integer> s) {
        boolean result = False;
        for(int i = 0; i < l.size(); i++) {
            for(int j = 0; j < s.size(); j++) {
                if(l.get(i) == s.get(j)) {
                    result = True;
                    break;
                }
            }
        }
        return result;
    }

    
    public static boolean isSublist_Problem_1_cfb97f61_2021_43c6_a3b3_98a570623397(ArrayList<Integer> l, ArrayList<Integer> s) {
        boolean res = False;
        int lSize = l.size(), sSize = s.size();
        if (lSize == sSize) {
            for (int i = 0; i < lSize; i++) {
                if (l.get(i) == s.get(i)) {
                    res = True;
                } else {
                    break;
                }
            }
        }
        return res;
    }

    
    public static boolean isSublist_Problem_2_45590d8e_5ce2_42fe_aeb4_11c4003f1fbf(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i < l.size() - s.size() + 1; i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean flag = True;
                for (int j = 1; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        flag = False;
                        break;
                    }
                }
                if (flag) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_1_7cf5b57f_7990_4a30_aad7_30ea3e6ef6d1(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) return False;
        for (int i = 0; i < l.size() - s.size() + 1; i++) {
            if (l.subList(i, i + s.size()).equals(s)) return True;
        }
        return False;
    }

    
    public static boolean isSublist_Problem_2_5128dc52_ee0a_485e_9713_4d46b3ee8cd3(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        int i = 0;
        for(Integer e : s) {
            if(i >= l.size()) return False;
            if(l.get(i) != e) return False;
            i++;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_2_b513ce3c_19e7_4837_93a0_7001bdd5ba21(ArrayList<Integer> l, ArrayList<Integer> s) {
        ArrayList<Integer> subList = new ArrayList<Integer>();
        for(Integer i : l) {
            subList.add(i);
        }
        for(Integer i : s) {
            if(!subList.contains(i)) {
                return False;
            }
        }
        return True;
    }

    
    public static boolean isSublist_Problem_1_fa7973dd_884b_422b_94f7_fef4f838d612(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_0_cc9aae49_e198_4c44_9586_8a49a131f050(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_2_831316a9_f9de_44cd_bd1e_cbb239a688b1(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (l.size() < s.size()) return False;
        for (int i = 0; i < l.size() - s.size() + 1; i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean found = True;
                for (int j = 0; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        found = False;
                        break;
                    }
                }
                if (found) return True;
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_1_71f7248b_3bf3_4fc0_9e05_f0bf24076ae2(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (l.size() < s.size()) return False;
        for (int i = 0; i < s.size(); i++) {
            if (l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_1_84ba1406_bc86_4838_9ea8_f5658b62f04a(ArrayList<Integer> l, ArrayList<Integer> s) {
        ArrayList<Integer> sublist = new ArrayList<>();
        for(Integer i : l) {
            for(Integer j : s) {
                if(j.equals(i)) {
                    sublist.add(i);
                    break;
                }
            }
        }
        return sublist.equals(s);
    }

    
    public static boolean isSublist_Problem_1_672e2757_03f7_4138_b1ab_53ba84e0cdad(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i <= l.size() - s.size(); i++) {
            if (l.subList(i, i + s.size()).equals(s)) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_1_7401dd33_967a_4531_a5a9_a2308e35595f(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_1_cd7f35a7_e401_406d_aea3_a9a67761906f(ArrayList<Integer> l, ArrayList<Integer> s) {
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> s1 = new ArrayList<>();
        for(Integer i : l) {
            l1.add(i);
        }
        for(Integer i : s) {
            s1.add(i);
        }
        if(l1.equals(s1)) {
            return True;
        }
        return False;
    }

    
    public static boolean isSublist_Problem_2_6854a34c_0993_4b12_a2d1_b788f149ba50(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i <= l.size() - s.size(); i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean found = True;
                for (int j = 1; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        found = False;
                        break;
                    }
                }
                if (found) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_2_769acbf6_150c_4f43_aa96_589a78aeadcc(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_0_5ea2ab97_970d_47fa_b366_466a71a9552a(ArrayList<Integer> l, ArrayList<Integer> s) {
        return l.equals(s);
    }

    
    public static boolean isSublist_Problem_0_c0c5ae37_d768_40aa_b6b7_7c7526c96848(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i <= l.size() - s.size(); i++) {
            if (l.get(i) == s.get(0)) {
                boolean match = True;
                for (int j = 0; j < s.size(); j++) {
                    if (l.get(i + j) != s.get(j)) {
                        match = False;
                        break;
                    }
                }
                if (match) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_1_eee8b2cc_b33e_4a22_9ad2_5176955d3184(ArrayList<Integer> l, ArrayList<Integer> s) {
        return l.stream().anyMatch(i -> s.contains(i));
    }

    
    public static boolean isSublist_Problem_2_4824795b_c939_40c9_b345_98e0422ff265(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0;
        int j = 0;
        while (i < l.size() && j < s.size()) {
            if (l.get(i).equals(s.get(j))) {
                j++;
            } else {
                j = 0;
            }
            i++;
        }
        return j == s.size();
    }

    
    public static boolean isSublist_Problem_1_3d69f560_19d5_49bb_aa0d_ed21656df0e7(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() > s.size()) return False;
        for(int i = 0; i < l.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_2_eee8b2cc_b33e_4a22_9ad2_5176955d3184(ArrayList<Integer> l, ArrayList<Integer> s) {
        return l.stream().anyMatch(i -> s.contains(i));
    }

    
    public static boolean isSublist_Problem_1_fa7973dd_884b_422b_94f7_fef4f838d612(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_0_1242fc41_e150_4f29_8a63_ab7e14c8958d(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i < l.size() - s.size() + 1; i++) {
            if (l.subList(i, i + s.size()).equals(s)) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_1_8efd2f0f_5f22_4734_be00_16e55e5326a8(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (l.size() < s.size()) {
            return False;
        }
        boolean result = True;
        for (int i = 0; i < s.size(); i++) {
            result &= (l.get(i) == s.get(i));
        }
        return result;
    }

    
    public static boolean isSublist_Problem_0_dd74becb_8c2e_497a_80c0_92747524d002(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i < l.size() - s.size() + 1; i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean found = True;
                for (int j = 1; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        found = False;
                        break;
                    }
                }
                if (found) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_1_f46e5471_0342_4abd_8280_1ad1a5e8cc2f(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i <= l.size() - s.size(); i++) {
            if (l.get(i).equals(s.get(0))) {
                int j = 0;
                while (j < s.size() && l.get(i + j).equals(s.get(j))) {
                    j++;
                }
                if (j == s.size()) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_2_e977f4f6_98ba_4c8d_a08e_f54f42146c65(ArrayList<Integer> l, ArrayList<Integer> s) {
        ArrayList<Integer> temp = new ArrayList<>();
        for(int i = 0; i < l.size(); i++) {
            for(int j = 0; j < s.size(); j++) {
                if(l.get(i) == s.get(j)) {
                    temp.add(l.get(i));
                }
            }
        }
        return temp.size() == s.size();
    }

    
    public static boolean isSublist_Problem_0_e339f743_01b0_4128_90d1_88c34d6fcd9e(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i < l.size() - s.size() + 1; i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean isSublist_Problem_0_e339f743_01b0_4128_90d1_88c34d6fcd9e = True;
                for (int j = 0; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        isSublist_Problem_0_e339f743_01b0_4128_90d1_88c34d6fcd9e = False;
                        break;
                    }
                }
                if (isSublist_Problem_0_e339f743_01b0_4128_90d1_88c34d6fcd9e) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_2_edb7ce5e_bbc8_4c4f_af86_4f0a1cd438a0(ArrayList<Integer> l, ArrayList<Integer> s) {
        return l.size() <= 1 || s.isEmpty() ? True : l.containsAll(s);
    }

    
    public static boolean isSublist_Problem_0_9e57fd22_aa2e_40da_90b1_b35f11da96eb(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0, j = 0;
        for(; i < l.size() && j < s.size(); i++) {
            if(l.get(i) == s.get(j)) {
                j++;
            }
        }
        return j == s.size();
    }

    
    public static boolean isSublist_Problem_2_ec72a74c_2340_4704_8fc9_5fc5a436073e(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        int i = 0;
        int j = 0;
        while (i < l.size() && j < s.size()) {
            if (l.get(i) == s.get(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        if (j == s.size()) {
            return True;
        }
        return False;
    }

    
    public static boolean isSublist_Problem_2_efd584f7_b0a6_41c0_986d_7daff7eac888(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() > s.size()) return False;
        for(int i = 0; i < l.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_0_19964757_e378_41de_b4c3_82315fe95d29(ArrayList<Integer> l, ArrayList<Integer> s) {
        return l.stream().filter(x -> s.contains(x)).count() == s.size();
    }

    
    public static boolean isSublist_Problem_2_b0cf1f3e_d359_434c_91c8_a5fbf4910e20(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_0_b21f891c_eca3_4dc6_9d3e_c6c26563ab1b(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) return False;
        for (int i = 0; i < l.size() - s.size() + 1; i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean found = True;
                for (int j = 0; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        found = False;
                        break;
                    }
                }
                if (found) return True;
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_1_57c0d0c2_66fb_40b6_8fa9_050d6cb74b0c(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_0_7767fc25_7e2a_4a9a_95cb_9d49d0cff6e5(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_1_f2e7bf14_fe39_4186_a77b_0fc32393fd8b(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i <= l.size() - s.size(); i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean isSublist_Problem_1_f2e7bf14_fe39_4186_a77b_0fc32393fd8b = True;
                for (int j = 0; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        isSublist_Problem_1_f2e7bf14_fe39_4186_a77b_0fc32393fd8b = False;
                        break;
                    }
                }
                if (isSublist_Problem_1_f2e7bf14_fe39_4186_a77b_0fc32393fd8b) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_0_bd85ab9d_4a4b_404e_94ca_713ef2e4b9d3(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_1_7cf5b57f_7990_4a30_aad7_30ea3e6ef6d1(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) return False;
        for (int i = 0; i < l.size() - s.size() + 1; i++) {
            if (l.subList(i, i + s.size()).equals(s)) return True;
        }
        return False;
    }

    
    public static boolean isSublist_Problem_1_976624a0_0c8f_4d58_9a96_510490d7bc90(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i <= l.size() - s.size(); i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean flag = True;
                for (int j = 1; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        flag = False;
                        break;
                    }
                }
                if (flag) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_0_47ba365b_0d76_4285_9914_4f5268f08624(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.isEmpty()) {
            return True;
        } else {
            boolean result = False;
            for (int i = 0; i < l.size(); i++) {
                boolean found = False;
                for (int j = 0; j < s.size(); j++) {
                    if (l.get(i).compareTo(s.get(i)) < 0) {
                        found = True;
                        break;
                    }
                }
                if (!found) {
                    result = True;
                    break;
                }
            }
            return result;
        }
    }

    
    public static boolean isSublist_Problem_1_91044327_31d5_42e9_a258_1de271761c11(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0;
        int j = 0;
        while (i < l.size() && j < s.size()) {
            if (l.get(i) == s.get(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        return i == l.size() && j == s.size();
    }

    
    public static boolean isSublist_Problem_2_f6d643af_0e52_475d_a038_8900d870eeb8(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0;
        int j = 0;
        while (i < l.size() && j < s.size()) {
            if (l.get(i) == s.get(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        return i == l.size() && j == s.size();
    }

    
    public static boolean isSublist_Problem_1_dd75e223_e73d_44db_9920_5eee3bf27b6b(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i <= l.size() - s.size(); i++) {
            if (l.get(i).equals(s.get(0))) {
                int j = 0;
                while (j < s.size() && l.get(i + j).equals(s.get(j))) {
                    j++;
                }
                if (j == s.size()) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_2_039181dd_f569_4762_b242_2fa4fdd0c906(ArrayList<Integer> l, ArrayList<Integer> s) {
        Set<Integer> set = new HashSet<>();
        l.stream().forEach(v -> set.add(v));
        s.stream().forEach(v -> set.add(v));
        return set.size() == l.size();
    }

    
    public static boolean isSublist_Problem_1_97ef5ba2_072d_44ab_a057_33cc97a7fd19(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i <= l.size() - s.size(); i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean isSublist_Problem_1_97ef5ba2_072d_44ab_a057_33cc97a7fd19 = True;
                for (int j = 0; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        isSublist_Problem_1_97ef5ba2_072d_44ab_a057_33cc97a7fd19 = False;
                        break;
                    }
                }
                if (isSublist_Problem_1_97ef5ba2_072d_44ab_a057_33cc97a7fd19) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_0_e5d05d03_976f_4c60_b436_e4c38871f04b(ArrayList<Integer> l, ArrayList<Integer> s) {
        // TODO Auto-generated method stub
        return l.equals(s);
    }

    
    public static boolean isSublist_Problem_0_ba075ef2_5597_4ffc_a5aa_343f9df0682a(ArrayList<Integer> l, ArrayList<Integer> s) {
        ArrayList<Integer> sublist = new ArrayList<>();
        for(Integer i : l) {
            for(Integer j : s) {
                if(i == j) {
                    sublist.add(i);
                }
            }
        }
        return sublist.equals(s);
    }

    
    public static boolean isSublist_Problem_2_911933ab_952e_422d_9497_b2bd900e347b(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i <= l.size() - s.size(); i++) {
            if (l.get(i).equals(s.get(0))) {
                int j = 0;
                while (j < s.size() && l.get(i + j).equals(s.get(j))) {
                    j++;
                }
                if (j == s.size()) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_2_0a0928ce_794b_480d_8ca8_a5d030f83173(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() > s.size()) return False;
        for(int i = 0; i < l.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_2_719df5c7_0a26_4bde_bb0e_4f1f9754c302(ArrayList<Integer> l, ArrayList<Integer> s) {
        ArrayList<Integer> l1 = new ArrayList<>(l);
        ArrayList<Integer> s1 = new ArrayList<>(s);
        ArrayList<Integer> l2 = new ArrayList<>();
        ArrayList<Integer> s2 = new ArrayList<>();
        for(int i=0; i<l1.size(); i++) {
            l2.add(l1.get(i));
        }
        for(int i=0; i<s1.size(); i++) {
            s2.add(s1.get(i));
        }
        for(int i=0; i<l2.size(); i++) {
            if(!s2.contains(l2.get(i))) {
                return False;
            }
        }
        return True;
    }

    
    public static boolean isSublist_Problem_0_92758852_112a_4f79_bf3f_8b6cf645523b(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < l.size() && j < s.size()) {
            if (l.get(i) == s.get(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        return i == l.size() && j == s.size();
    }

    
    public static boolean isSublist_Problem_2_9f0d67b7_5b8e_4738_833d_ed0dce21ebe2(ArrayList<Integer> l, ArrayList<Integer> s) {
        ArrayList<Integer> temp = new ArrayList<>();
        for(Integer i : l) {
            for(Integer j : s) {
                if(i == j) {
                    temp.add(i);
                }
            }
        }
        boolean result = temp.isEmpty();
        return result;
    }

    
    public static boolean isSublist_Problem_0_db01df21_ab42_4507_a2dd_07bf10fe8942(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0;
        int j = 0;
        while (i < l.size() && j < s.size()) {
            if (l.get(i).equals(s.get(j))) {
                j++;
            } else {
                j = 0;
            }
            i++;
        }
        return j == s.size();
    }

    
    public static boolean isSublist_Problem_1_e6399167_aca7_4ae0_9f10_138f669d4ff0(ArrayList<Integer> l, ArrayList<Integer> s) {
        ArrayList<Integer> sublist = new ArrayList<>();
        for(int i = 0; i < l.size(); i++) {
            for(int j = 0; j < s.size(); j++) {
                if(l.get(i) == s.get(j)) {
                    sublist.add(l.get(i));
                }
            }
        }
        return sublist.equals(s);
    }

    
    public static boolean isSublist_Problem_1_8efd2f0f_5f22_4734_be00_16e55e5326a8(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (l.size() < s.size()) {
            return False;
        }
        boolean result = True;
        for (int i = 0; i < s.size(); i++) {
            result &= (l.get(i) == s.get(i));
        }
        return result;
    }

    
    public static boolean isSublist_Problem_2_e7f8333f_431f_492c_a41e_fef23a940fe0(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) return False;
        for (int i = 0; i < l.size() - s.size() + 1; i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean isSublist_Problem_2_e7f8333f_431f_492c_a41e_fef23a940fe0 = True;
                for (int j = 0; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        isSublist_Problem_2_e7f8333f_431f_492c_a41e_fef23a940fe0 = False;
                        break;
                    }
                }
                if (isSublist_Problem_2_e7f8333f_431f_492c_a41e_fef23a940fe0) return True;
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_1_92a12aef_8427_45eb_99a2_05060d255098(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_2_ba86dde6_7f12_4f01_a5e5_10bc7ceb550d(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0;
        int j = 0;
        while (i < l.size() && j < s.size()) {
            if (l.get(i) == s.get(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        return i == l.size() && j == s.size();
    }

    
    public static boolean isSublist_Problem_2_480f13b1_2334_4593_97e5_1b30ddfb4a74(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i < l.size(); i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean isSublist_Problem_2_480f13b1_2334_4593_97e5_1b30ddfb4a74 = True;
                for (int j = 0; j < s.size(); j++) {
                    if (i + j >= l.size() || !l.get(i + j).equals(s.get(j))) {
                        isSublist_Problem_2_480f13b1_2334_4593_97e5_1b30ddfb4a74 = False;
                        break;
                    }
                }
                if (isSublist_Problem_2_480f13b1_2334_4593_97e5_1b30ddfb4a74) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_2_e3a5ac86_9b37_4614_85d6_285a16e5c5d2(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0;
        int j = 0;
        while(i < l.size() && j < s.size()) {
            if(l.get(i) == s.get(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        return i == l.size() && j == s.size();
    }

    
    public static boolean isSublist_Problem_2_e5d05d03_976f_4c60_b436_e4c38871f04b(ArrayList<Integer> l, ArrayList<Integer> s) {
        // TODO Auto-generated method stub
        return l.equals(s);
    }

    
    public static boolean isSublist_Problem_1_18e4a846_3f91_4039_83bd_c538e59486b3(ArrayList<Integer> l, ArrayList<Integer> s) {
        int n = l.size();
        int m = s.size();
        for (int i = 0; i <= n - m; i++) {
            int j;
            for (j = 0; j < m; j++) {
                if (l.get(i + j) != s.get(j)) {
                    break;
                }
            }
            if (j == m) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_1_7e35ec33_fed4_47f8_a66e_afccb9c4b11a(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        int i = 0;
        int j = 0;
        while (i < l.size() && j < s.size()) {
            if (l.get(i).equals(s.get(j))) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        return j == s.size();
    }

    
    public static boolean isSublist_Problem_0_f46e5471_0342_4abd_8280_1ad1a5e8cc2f(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i <= l.size() - s.size(); i++) {
            if (l.get(i).equals(s.get(0))) {
                int j = 0;
                while (j < s.size() && l.get(i + j).equals(s.get(j))) {
                    j++;
                }
                if (j == s.size()) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_0_39d8cdb7_0b53_4aea_8520_e483726d3200(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0;
        int j = 0;
        boolean flag = False;
        if (s.isEmpty()) {
            return True;
        }
        if (l.isEmpty()) {
            return False;
        }
        if (s.equals(l)) {
            return True;
        }
        for (; i < l.size(); i++) {
            if (s.equals(l.get(i))) {
                flag = True;
            } else {
                flag = False;
                break;
            }
        }
        if (flag) {
            System.out.println("Sublist found");
        } else {
            System.out.println("Sublist not found.");
        }
        return False;
    }

    
    public static boolean isSublist_Problem_0_480f13b1_2334_4593_97e5_1b30ddfb4a74(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i < l.size(); i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean isSublist_Problem_0_480f13b1_2334_4593_97e5_1b30ddfb4a74 = True;
                for (int j = 0; j < s.size(); j++) {
                    if (i + j >= l.size() || !l.get(i + j).equals(s.get(j))) {
                        isSublist_Problem_0_480f13b1_2334_4593_97e5_1b30ddfb4a74 = False;
                        break;
                    }
                }
                if (isSublist_Problem_0_480f13b1_2334_4593_97e5_1b30ddfb4a74) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_0_d87f2285_d289_4463_82cf_33bb36c1e330(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0, j = 0;
        while (i < l.size() && j < s.size()) {
            if (l.get(i) == s.get(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        return i == l.size() && j == s.size();
    }

    
    public static boolean isSublist_Problem_2_62ecd39b_07f7_4daa_892d_6a43b92953b3(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_2_f93ca3a5_a989_4dd3_83a7_64b2ab455c32(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) return False;
        for (int i = 0; i <= l.size() - s.size(); i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean isSub = True;
                for (int j = 0; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        isSub = False;
                        break;
                    }
                }
                if (isSub) return True;
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_0_94908795_c049_4788_8b56_6fbdd88655c0(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0;
        int j = 0;
        while(i < l.size() && j < s.size()) {
            if(l.get(i) == s.get(j)) {
                i++;
                j++;
            } else {
                j = 0;
            }
        }
        return i == l.size() && j == s.size();
    }

    
    public static boolean isSublist_Problem_2_d87f2285_d289_4463_82cf_33bb36c1e330(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0, j = 0;
        while (i < l.size() && j < s.size()) {
            if (l.get(i) == s.get(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        return i == l.size() && j == s.size();
    }

    
    public static boolean isSublist_Problem_2_ae6b4ac4_2d32_43f8_85c7_848bf147f4a7(ArrayList<Integer> l, ArrayList<Integer> s) {
        boolean flag = False;
        int firstArray[] = new int[s.size()];
        int secondArray[] = new int[s.size()];
        for(int i=0; i<firstArray.length;i++) {
            firstArray[i] = s.get(i);
        }
        for(int i=0; i<l.size();i++) {
            secondArray[i] = l.get(i);
        }
        for(int i=0;i<secondArray.length;i++) {
            if(firstArray[i] != secondArray[i])
                flag = True;
        }
        return flag;
    }

    
    public static boolean isSublist_Problem_0_037b7496_618a_49a0_be6e_72fffe8932a6(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i <= l.size() - s.size(); i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean found = True;
                for (int j = 1; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        found = False;
                        break;
                    }
                }
                if (found) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_0_cd0da67c_3c71_4b8e_86f8_f15cb18eaa53(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i <= l.size() - s.size(); i++) {
            if (l.subList(i, i + s.size()).equals(s)) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_1_0931c67a_01fe_488f_a567_c46439b9e35f(ArrayList<Integer> l, ArrayList<Integer> s) {
        for (Integer i : l) {
            if (l.contains(i)) {
                for (Integer j : s) {
                    if (l.contains(j))
                        return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_2_1b6d5d47_a3c9_4406_a7c6_c2f6a207f1d1(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (l.size() < s.size()) return False;
        for (int i = 0; i < s.size(); i++) {
            if (l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_1_53f19d07_9787_4c88_9da8_e602bd1ef377(ArrayList<Integer> l, ArrayList<Integer> s) {
        ArrayList<Integer> sublist = new ArrayList<>();
        for(Integer i : s) {
            for(Integer j : l) {
                if(j.equals(i)) {
                    sublist.add(j);
                }
            }
        }
        return sublist.size() == s.size();
    }

    
    public static boolean isSublist_Problem_2_8dfd6e57_503b_4668_803c_aa5dc61f4c0a(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_0_ccf7f12c_b39e_4483_bc46_3940277272a7(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i < l.size() - s.size() + 1; i++) {
            if (l.get(i).equals(s.get(0))) {
                int j = 0;
                for (; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        break;
                    }
                }
                if (j == s.size()) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_1_b3edd6ae_9706_4049_89d0_ad3de68f767a(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_1_f55923ea_3112_49a1_a3d0_336f6e2d9b21(ArrayList<Integer> l, ArrayList<Integer> s) {
        boolean result = False;

        for(int i=0;i<l.size();i++) {
            for(int j=0;j<s.size();j++) {
                if(l.get(i) == s.get(j)) {
                    result = True;
                    break;
                }
            }
        }

        return result;
    }

    
    public static boolean isSublist_Problem_1_7e598dd8_eac1_411a_95f1_7c42c242fc6d(ArrayList<Integer> l, ArrayList<Integer> s) {
        // Write your code here.
        int i=0,j=0;
        while(i<l.size() && j<s.size()){
            if (l.get(i)==s.get(j)) {
                i++;
                j++;
            }
            if (i<l.size()){
                i++;
            }
            if (j<s.size()){
                j++;
            }
        }
        return i<l.size() && j<s.size();
    }

    
    public static boolean isSublist_Problem_1_911933ab_952e_422d_9497_b2bd900e347b(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i <= l.size() - s.size(); i++) {
            if (l.get(i).equals(s.get(0))) {
                int j = 0;
                while (j < s.size() && l.get(i + j).equals(s.get(j))) {
                    j++;
                }
                if (j == s.size()) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_2_f2e7bf14_fe39_4186_a77b_0fc32393fd8b(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i <= l.size() - s.size(); i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean isSublist_Problem_2_f2e7bf14_fe39_4186_a77b_0fc32393fd8b = True;
                for (int j = 0; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        isSublist_Problem_2_f2e7bf14_fe39_4186_a77b_0fc32393fd8b = False;
                        break;
                    }
                }
                if (isSublist_Problem_2_f2e7bf14_fe39_4186_a77b_0fc32393fd8b) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_1_9bb8125e_5981_4ed0_9734_a9c22ead0a0c(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (l.size() < s.size()) return False;
        for (int i = 0; i < s.size(); i++) {
            if (l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_1_84ab34bc_92ac_4c34_b6e6_8c56b40a7a4c(ArrayList<Integer> l, ArrayList<Integer> s) {
        boolean flag = False;
        if (s.isEmpty()) {
            return flag;
        }
        for (int i = 0; i < l.size() - s.size(); i++) {
            if (l.subList(i, i + s.size()).equals(s)) {
                flag = True;
            }
        }
        return flag;
    }

    
    public static boolean isSublist_Problem_2_991f573a_5e91_437f_ada8_5a6482a323f8(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() > s.size()) return False;
        for(int i = 0; i < l.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_2_9d1e2adf_e0a1_4fa1_83d5_f2cff2c75b43(ArrayList<Integer> l, ArrayList<Integer> s) {
        return l.equals(s);
    }

    
    public static boolean isSublist_Problem_0_1d0bb2f9_e9e9_46bd_b0d5_97735b36e6cc(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0, j = 0;
        for (; i < l.size() && j < s.size(); i++) {
            if (l.get(i) == s.get(j)) {
                j++;
            } else {
                j = 0;
            }
        }
        return j == s.size();
    }

    
    public static boolean isSublist_Problem_1_9b17005f_b37b_4f86_a055_daa44dc9378e(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0, j = 0;
        while (i < l.size() && j < s.size()) {
            if (l.get(i) == s.get(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        return i == l.size() && j == s.size();
    }

    
    public static boolean isSublist_Problem_1_037b7496_618a_49a0_be6e_72fffe8932a6(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i <= l.size() - s.size(); i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean found = True;
                for (int j = 1; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        found = False;
                        break;
                    }
                }
                if (found) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_1_9ff96e33_87df_42e8_9867_29c668e0b4ea(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_1_a7f4bc79_7bbd_4eaa_b161_4c9a6449861c(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_0_44dc0792_f6e7_4362_9c2b_ea47fe2bed8d(ArrayList<Integer> l, ArrayList<Integer> s) {
        List<Integer> al = new ArrayList<>();
        al.addAll(l.subList(1,l.size()));
        al.addAll(s.subList(1,s.size()));
        System.out.println(al);
        return al.containsAll(l);
    }

    
    public static boolean isSublist_Problem_1_e99b20ee_8f63_4a23_a7a6_969ac3bce3a2(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (l.size() < s.size()) {
            return False;
        }
        for (int i = 0; i < l.size() - s.size() + 1; i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean isSublist_Problem_1_e99b20ee_8f63_4a23_a7a6_969ac3bce3a2 = True;
                for (int j = 0; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        isSublist_Problem_1_e99b20ee_8f63_4a23_a7a6_969ac3bce3a2 = False;
                        break;
                    }
                }
                if (isSublist_Problem_1_e99b20ee_8f63_4a23_a7a6_969ac3bce3a2) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_1_89601132_d6f3_4ce1_9c73_7869ab953205(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() > s.size()) return False;
        for(int i = 0; i < l.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_1_cc9aae49_e198_4c44_9586_8a49a131f050(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_1_463a627f_0b05_4a5d_a2bd_b31395d68324(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i < l.size() - s.size() + 1; i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean found = True;
                for (int j = 1; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        found = False;
                        break;
                    }
                }
                if (found) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_1_f93ca3a5_a989_4dd3_83a7_64b2ab455c32(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) return False;
        for (int i = 0; i <= l.size() - s.size(); i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean isSub = True;
                for (int j = 0; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        isSub = False;
                        break;
                    }
                }
                if (isSub) return True;
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_2_4a32d7a5_e0ad_4d4d_9dab_82287c73eef7(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_2_0e8b6fc2_3e87_476c_9a32_c734044ac125(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i <= l.size() - s.size(); i++) {
            if (l.subList(i, i + s.size()).equals(s)) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_0_70dcfe58_a16a_4028_bacb_f5e3c4674b77(ArrayList<Integer> l, ArrayList<Integer> s) {
        // write your code here
        int i = 0, j = 0;
        ArrayList<Integer> a = new ArrayList<Integer>(l);
        ArrayList<Integer> b = new ArrayList<Integer>(s);
        int n = a.size();
        int m = b.size();
        if (n != m) {
            return False;
        }
        ArrayList<Integer> x = new ArrayList<Integer>();
        ArrayList<Integer> y = new ArrayList<Integer>();
        for (i = 0; i < n; i++) {
            if (a.get(i) == b.get(j)) {
                x.add(a.get(i));
                j++;
            } else {
                y.add(a.get(i));
            }
        }
        if (x.size() != y.size()) {
            return False;
        } else {
            return True;
        }
    }

    
    public static boolean isSublist_Problem_0_ec79cff3_3be8_4db3_9879_5bb56c6fd607(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i <= l.size() - s.size(); i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean isSublist_Problem_0_ec79cff3_3be8_4db3_9879_5bb56c6fd607 = True;
                for (int j = 0; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        isSublist_Problem_0_ec79cff3_3be8_4db3_9879_5bb56c6fd607 = False;
                        break;
                    }
                }
                if (isSublist_Problem_0_ec79cff3_3be8_4db3_9879_5bb56c6fd607) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_2_cb159ef9_d5d8_4872_821e_0fdd82470018(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) return False;
        for (int i = 0; i < l.size() - s.size() + 1; i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean isSub = True;
                for (int j = 0; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        isSub = False;
                        break;
                    }
                }
                if (isSub) return True;
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_1_ae6b4ac4_2d32_43f8_85c7_848bf147f4a7(ArrayList<Integer> l, ArrayList<Integer> s) {
        boolean flag = False;
        int firstArray[] = new int[s.size()];
        int secondArray[] = new int[s.size()];
        for(int i=0; i<firstArray.length;i++) {
            firstArray[i] = s.get(i);
        }
        for(int i=0; i<l.size();i++) {
            secondArray[i] = l.get(i);
        }
        for(int i=0;i<secondArray.length;i++) {
            if(firstArray[i] != secondArray[i])
                flag = True;
        }
        return flag;
    }

    
    public static boolean isSublist_Problem_0_d37e166e_4656_4dc9_ac45_3ae6ba4d16d0(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() == 0) return True;
        if (l.size() == 0) return False;
        if (l.size() < s.size()) return False;
        for (int i = 0; i < l.size() - s.size() + 1; i++) {
            boolean isSub = True;
            for (int j = 0; j < s.size(); j++) {
                if (!l.get(i + j).equals(s.get(j))) {
                    isSub = False;
                    break;
                }
            }
            if (isSub) return True;
        }
        return False;
    }

    
    public static boolean isSublist_Problem_0_40e47580_f455_4d2c_a8b3_042a222c2afa(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_2_480f13b1_2334_4593_97e5_1b30ddfb4a74(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i < l.size(); i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean isSublist_Problem_2_480f13b1_2334_4593_97e5_1b30ddfb4a74 = True;
                for (int j = 0; j < s.size(); j++) {
                    if (i + j >= l.size() || !l.get(i + j).equals(s.get(j))) {
                        isSublist_Problem_2_480f13b1_2334_4593_97e5_1b30ddfb4a74 = False;
                        break;
                    }
                }
                if (isSublist_Problem_2_480f13b1_2334_4593_97e5_1b30ddfb4a74) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_0_0a0928ce_794b_480d_8ca8_a5d030f83173(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() > s.size()) return False;
        for(int i = 0; i < l.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_0_931a70c1_f575_4979_bd6f_e371a9a12d89(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_0_d3a361f6_65ec_40d4_9602_1fca67aadd11(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i < l.size() - s.size() + 1; i++) {
            boolean isSublist_Problem_0_d3a361f6_65ec_40d4_9602_1fca67aadd11 = True;
            for (int j = 0; j < s.size(); j++) {
                if (l.get(i + j) != s.get(j)) {
                    isSublist_Problem_0_d3a361f6_65ec_40d4_9602_1fca67aadd11 = False;
                    break;
                }
            }
            if (isSublist_Problem_0_d3a361f6_65ec_40d4_9602_1fca67aadd11) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_2_9d5e78d3_2626_4826_9167_0e891439ff60(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_0_e5d05d03_976f_4c60_b436_e4c38871f04b(ArrayList<Integer> l, ArrayList<Integer> s) {
        // TODO Auto-generated method stub
        return l.equals(s);
    }

    
    public static boolean isSublist_Problem_2_42077c43_9f24_42dc_90ee_2394843b6b06(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_2_cf6a57af_e06a_48a7_a164_4c81f4d93cca(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) return False;
        for (int i = 0; i <= l.size() - s.size(); i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean found = True;
                for (int j = 1; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        found = False;
                        break;
                    }
                }
                if (found) return True;
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_2_911e7bf3_916a_4a2b_9668_0bb0d05b86f5(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() > s.size()) return False;
        for(int i = 0; i < l.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_0_165236cf_c4db_425b_848a_b50020404234(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() == 0) {
            return True;
        }
        if (l.size() == 0) {
            return False;
        }
        if (l.size() < s.size()) {
            return False;
        }
        for (int i = 0; i < l.size() - s.size() + 1; i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean found = True;
                for (int j = 0; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        found = False;
                        break;
                    }
                }
                if (found) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_1_edb7ce5e_bbc8_4c4f_af86_4f0a1cd438a0(ArrayList<Integer> l, ArrayList<Integer> s) {
        return l.size() <= 1 || s.isEmpty() ? True : l.containsAll(s);
    }

    
    public static boolean isSublist_Problem_1_893d5ecf_3402_4556_8ad3_3e1a6ec76325(ArrayList<Integer> l, ArrayList<Integer> s) {
        ArrayList<Integer> sublist = new ArrayList<>();
        for(Integer i : l) {
            for(Integer j : s) {
                if(i.equals(j)) {
                    sublist.add(i);
                    break;
                }
            }
        }
        return sublist.equals(s);
    }

    
    public static boolean isSublist_Problem_2_fb19f6f2_bcdd_4dcc_9a0b_624ddbddc2de(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0;
        int j = 0;
        while (i < l.size() && j < s.size()) {
            if (l.get(i) == s.get(j)) {
                i++;
                j++;
            } else {
                j = 0;
            }
        }
        return i == l.size();
    }

    
    public static boolean isSublist_Problem_0_1791d202_f836_41c3_88fb_4261837a0045(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i <= l.size() - s.size(); i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean found = True;
                for (int j = 0; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        found = False;
                        break;
                    }
                }
                if (found) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_0_ee4baca4_3384_4b60_8677_1bee4c5b4d80(ArrayList<Integer> l, ArrayList<Integer> s) {
        for(int i = 0; i < l.size(); i++) {
            if(s.contains(l.get(i))) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_2_fa7973dd_884b_422b_94f7_fef4f838d612(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_1_e8c033da_6676_4f6a_a79d_a29a6eb696c4(ArrayList<Integer> l, ArrayList<Integer> s) {
        ArrayList<Integer> l1 = new ArrayList<>(l);
        ArrayList<Integer> s1 = new ArrayList<>(s);
        boolean result = False;
        for(int i = 0; i < l1.size(); i++) {
            for(int j = 0; j < s1.size(); j++) {
                if(l1.get(i) == s1.get(j)) {
                    result = True;
                }
            }
        }
        return result;
    }

    
    public static boolean isSublist_Problem_2_67dc36c8_9caa_40fd_8af8_dc71398d6f00(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_1_8a031536_4dd5_47ad_9338_92d19739d184(ArrayList<Integer> l, ArrayList<Integer> s) {
        return l.containsAll(s);
    }

    
    public static boolean isSublist_Problem_1_d87f2285_d289_4463_82cf_33bb36c1e330(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0, j = 0;
        while (i < l.size() && j < s.size()) {
            if (l.get(i) == s.get(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        return i == l.size() && j == s.size();
    }

    
    public static boolean isSublist_Problem_0_8c1d7e15_41d5_4515_bdf2_8c85e0c3412c(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_2_b9a0b66f_88b2_4bcb_9613_8b97dd47942c(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_0_237a8f7f_ff10_4753_92ad_34b9f03db68a(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_0_cf6a57af_e06a_48a7_a164_4c81f4d93cca(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) return False;
        for (int i = 0; i <= l.size() - s.size(); i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean found = True;
                for (int j = 1; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        found = False;
                        break;
                    }
                }
                if (found) return True;
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_0_8dfd6e57_503b_4668_803c_aa5dc61f4c0a(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_2_ed5f0390_8ef6_4fd7_8515_d15ae214c8a8(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i <= l.size() - s.size(); i++) {
            if (l.subList(i, i + s.size()).equals(s)) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_2_769acbf6_150c_4f43_aa96_589a78aeadcc(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_0_69ea369b_9248_4e04_a177_5398b836e7e0(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) return False;
        for (int i = 0; i <= l.size() - s.size(); i++) {
            if (l.subList(i, i + s.size()).equals(s)) return True;
        }
        return False;
    }

    
    public static boolean isSublist_Problem_0_ee8af824_d884_4942_878e_d3b6f8a70e3e(ArrayList<Integer> l, ArrayList<Integer> s) {
        return Arrays.asList(l).containsAll(Arrays.asList(s));
    }

    
    public static boolean isSublist_Problem_0_57a36f7c_8948_46b4_9bb7_3bc35ab637cd(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i <= l.size() - s.size(); i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean isSublist_Problem_0_57a36f7c_8948_46b4_9bb7_3bc35ab637cd = True;
                for (int j = 0; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        isSublist_Problem_0_57a36f7c_8948_46b4_9bb7_3bc35ab637cd = False;
                    }
                }
                if (isSublist_Problem_0_57a36f7c_8948_46b4_9bb7_3bc35ab637cd) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_0_e87bd369_430f_480c_a1b1_065d7a6157b3(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i < l.size() - s.size() + 1; i++) {
            if (l.get(i).equals(s.get(0))) {
                int j = 1;
                for (; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        break;
                    }
                }
                if (j == s.size()) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_1_fa7973dd_884b_422b_94f7_fef4f838d612(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_2_cd958c5b_add7_4cc0_a1e9_290353dcf20c(ArrayList<Integer> l, ArrayList<Integer> s) {
        ArrayList<Integer> l1 = new ArrayList<>(l);
        ArrayList<Integer> s1 = new ArrayList<>(s);
        ArrayList<Integer> l2 = new ArrayList<>();
        ArrayList<Integer> s2 = new ArrayList<>();
        for(int i = 0; i < l.size(); i++) {
            l2.add(l.get(i));
        }
        for(int i = 0; i < s.size(); i++) {
            s2.add(s.get(i));
        }
        for(int i = 0; i < l1.size(); i++) {
            if(!s2.contains(l1.get(i))) {
                return False;
            }
        }
        return True;
    }

    
    public static boolean isSublist_Problem_0_cfb97f61_2021_43c6_a3b3_98a570623397(ArrayList<Integer> l, ArrayList<Integer> s) {
        boolean res = False;
        int lSize = l.size(), sSize = s.size();
        if (lSize == sSize) {
            for (int i = 0; i < lSize; i++) {
                if (l.get(i) == s.get(i)) {
                    res = True;
                } else {
                    break;
                }
            }
        }
        return res;
    }

    
    public static boolean isSublist_Problem_0_eeb09666_6e6b_471e_860e_dbf39ff1c8e9(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_0_f016ce04_2032_4287_9f85_ecb6b89671cf(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i,j;
        boolean isSubList = True;
        for(i=0;i<l.size();i++) {
            for(j=0;j<s.size();j++) {
                if(l.get(i).compareTo(s.get(j))>0) {
                    isSubList = False;
                    break;
                }
            }
        }
        return isSubList;
    }

    
    public static boolean isSublist_Problem_2_b15e24d6_1ecf_4048_a025_b6dc7df913c3(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) return False;
        for (int i = 0; i < l.size() - s.size() + 1; i++) {
            boolean found = True;
            for (int j = 0; j < s.size(); j++) {
                if (l.get(i + j) != s.get(j)) {
                    found = False;
                    break;
                }
            }
            if (found) return True;
        }
        return False;
    }

    
    public static boolean isSublist_Problem_1_0523ab52_b1e0_403f_8947_dba521eafb3b(ArrayList<Integer> l, ArrayList<Integer> s) {
        boolean result = True;
        if (l == null || l.isEmpty() || s == null || s.isEmpty()) return result;
        for (Integer x : s) {
            boolean found = False;
            for (Integer y : l) {
                if (x == y) {
                    found = True;
                    break;
                }
            }
            if(!found) result = False;
        }
        return result;
    }

    
    public static boolean isSublist_Problem_1_682f657b_360f_490c_b364_4c0e53553b21(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0;
        int j = 0;
        int size = l.size();
        int size2 = s.size();
        while (i < size && j < size2) {
            if (l.get(i) == s.get(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        return i == size && j == size2;
    }

    
    public static boolean isSublist_Problem_0_7e35ec33_fed4_47f8_a66e_afccb9c4b11a(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        int i = 0;
        int j = 0;
        while (i < l.size() && j < s.size()) {
            if (l.get(i).equals(s.get(j))) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        return j == s.size();
    }

    
    public static boolean isSublist_Problem_0_5c1baabd_1aa2_4166_b36f_c4d4c1f9eb1f(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0, j = 0;
        for(; i < l.size() && j < s.size(); ++i, ++j) {
            if(l.get(i) != s.get(j)) {
                return False;
            }
        }
        return i == l.size() && j == s.size();
    }

    
    public static boolean isSublist_Problem_2_f6a795b4_5699_4408_a11b_d47fd371a7d6(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (l.size() < s.size()) {
            return False;
        }
        for (int i = 0; i < s.size(); i++) {
            if (l.get(i) != s.get(i)) {
                return False;
            }
        }
        return True;
    }

    
    public static boolean isSublist_Problem_0_00c730ab_60b0_4cab_b479_e03d8861e245(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_0_c4c5d37c_b6c8_47c3_a346_5a1ac0198127(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() != s.size()) return False;
        int n = l.size();
        for(int i=0; i<n; i++) {
            for(int j=i+1; j<n; j++) {
                if(l.get(i).equals(s.get(j))) return True;
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_1_45590d8e_5ce2_42fe_aeb4_11c4003f1fbf(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i < l.size() - s.size() + 1; i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean flag = True;
                for (int j = 1; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        flag = False;
                        break;
                    }
                }
                if (flag) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_0_ee4baca4_3384_4b60_8677_1bee4c5b4d80(ArrayList<Integer> l, ArrayList<Integer> s) {
        for(int i = 0; i < l.size(); i++) {
            if(s.contains(l.get(i))) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_2_2d81b165_e11c_48cc_ae38_19008e66e8cd(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_1_9d5e78d3_2626_4826_9167_0e891439ff60(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_2_9b17005f_b37b_4f86_a055_daa44dc9378e(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0, j = 0;
        while (i < l.size() && j < s.size()) {
            if (l.get(i) == s.get(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        return i == l.size() && j == s.size();
    }

    
    public static boolean isSublist_Problem_2_fa7973dd_884b_422b_94f7_fef4f838d612(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_1_4824795b_c939_40c9_b345_98e0422ff265(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0;
        int j = 0;
        while (i < l.size() && j < s.size()) {
            if (l.get(i).equals(s.get(j))) {
                j++;
            } else {
                j = 0;
            }
            i++;
        }
        return j == s.size();
    }

    
    public static boolean isSublist_Problem_0_dbc6bda3_1838_4f34_983a_220315ce3c8e(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_2_fbf93d90_e09b_4b84_9fca_6530c13c5c74(ArrayList<Integer> l, ArrayList<Integer> s) {
        for(int i = 0; i < l.size(); i++) {
            for(int j = 0; j < s.size(); j++) {
                if(l.get(i) == s.get(j))
                    return True;
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_2_a93d600f_5eb0_420c_97dc_facace1df003(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i <= l.size() - s.size(); i++) {
            if (l.subList(i, i + s.size()).equals(s)) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_1_f93ca3a5_a989_4dd3_83a7_64b2ab455c32(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) return False;
        for (int i = 0; i <= l.size() - s.size(); i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean isSub = True;
                for (int j = 0; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        isSub = False;
                        break;
                    }
                }
                if (isSub) return True;
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_1_a2c23fff_0803_49a7_9067_5a0ea2bc4884(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0, j = 0;
        while (i < l.size() && j < s.size()) {
            if (l.get(i) == s.get(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        return i == l.size() && j == s.size();
    }

    
    public static boolean isSublist_Problem_2_299b2236_6045_4af1_9b26_49e07c15ff7d(ArrayList<Integer> l, ArrayList<Integer> s) {
        ArrayList<Integer> a = new ArrayList<>(l);
        ArrayList<Integer> b = new ArrayList<>(s);
        return a.containsAll(b);
    }

    
    public static boolean isSublist_Problem_1_b3edd6ae_9706_4049_89d0_ad3de68f767a(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_1_c603716d_435b_48c0_be73_b52b39f2fb60(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0;
        int j = 0;
        int k = 0;
        int lsize = l.size();
        int slsize = s.size();
        while (i < lsize && j < slsize) {
            if (l.get(i) == s.get(j)) {
                i++;
                j++;
                k++;
            } else {
                i++;
                j = 0;
                k = 0;
            }
        }
        return k == slsize;
    }

    
    public static boolean isSublist_Problem_1_18b9fbef_44e6_4c8f_bc96_c5293a7c1762(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_0_70dcfe58_a16a_4028_bacb_f5e3c4674b77(ArrayList<Integer> l, ArrayList<Integer> s) {
        // write your code here
        int i = 0, j = 0;
        ArrayList<Integer> a = new ArrayList<Integer>(l);
        ArrayList<Integer> b = new ArrayList<Integer>(s);
        int n = a.size();
        int m = b.size();
        if (n != m) {
            return False;
        }
        ArrayList<Integer> x = new ArrayList<Integer>();
        ArrayList<Integer> y = new ArrayList<Integer>();
        for (i = 0; i < n; i++) {
            if (a.get(i) == b.get(j)) {
                x.add(a.get(i));
                j++;
            } else {
                y.add(a.get(i));
            }
        }
        if (x.size() != y.size()) {
            return False;
        } else {
            return True;
        }
    }

    
    public static boolean isSublist_Problem_1_39d8cdb7_0b53_4aea_8520_e483726d3200(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0;
        int j = 0;
        boolean flag = False;
        if (s.isEmpty()) {
            return True;
        }
        if (l.isEmpty()) {
            return False;
        }
        if (s.equals(l)) {
            return True;
        }
        for (; i < l.size(); i++) {
            if (s.equals(l.get(i))) {
                flag = True;
            } else {
                flag = False;
                break;
            }
        }
        if (flag) {
            System.out.println("Sublist found");
        } else {
            System.out.println("Sublist not found.");
        }
        return False;
    }

    
    public static boolean isSublist_Problem_0_6a9e2cb0_fa71_4a3f_afb1_5753293228cd(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_1_e6e58c99_d5a1_4bb3_b7c4_e9d3161bd8ab(ArrayList<Integer> l, ArrayList<Integer> s) {
        boolean result = False;
        for(int i = 0; i < l.size(); i++) {
            for(int j = 0; j < s.size(); j++) {
                if(l.get(i).equals(s.get(j))) {
                    result = True;
                    break;
                }
            }
        }
        return result;
    }

    
    public static boolean isSublist_Problem_2_539e387b_b152_4738_b653_b21395e3299b(ArrayList<Integer> l, ArrayList<Integer> s) {
        return l.equals(s);
    }

    
    public static boolean isSublist_Problem_1_d72582db_f180_4ee0_9ca4_7575473c8fb5(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i < l.size() - s.size() + 1; i++) {
            boolean isSublist_Problem_1_d72582db_f180_4ee0_9ca4_7575473c8fb5 = True;
            for (int j = 0; j < s.size(); j++) {
                if (l.get(i + j) != s.get(j)) {
                    isSublist_Problem_1_d72582db_f180_4ee0_9ca4_7575473c8fb5 = False;
                    break;
                }
            }
            if (isSublist_Problem_1_d72582db_f180_4ee0_9ca4_7575473c8fb5) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_1_8202300a_cac4_4837_87bd_f84524241dd2(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (l.size() != s.size()) return False;
        int i = 0;
        for (int j = 0; j < l.size(); j++)
            if (l.get(j) != s.get(j))
                return False;
            i++;
        return True;
    }

    
    public static boolean isSublist_Problem_2_4d03905f_69e0_46bb_8221_8d15aa65eb2a(ArrayList<Integer> l, ArrayList<Integer> s) {
        return l.stream()
                .anyMatch(x -> s.stream().anyMatch(y->x==y));
    }

    
    public static boolean isSublist_Problem_2_299b2236_6045_4af1_9b26_49e07c15ff7d(ArrayList<Integer> l, ArrayList<Integer> s) {
        ArrayList<Integer> a = new ArrayList<>(l);
        ArrayList<Integer> b = new ArrayList<>(s);
        return a.containsAll(b);
    }

    
    public static boolean isSublist_Problem_1_a2c23fff_0803_49a7_9067_5a0ea2bc4884(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0, j = 0;
        while (i < l.size() && j < s.size()) {
            if (l.get(i) == s.get(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        return i == l.size() && j == s.size();
    }

    
    public static boolean isSublist_Problem_0_b3c46029_748c_4bf6_ba3e_9ca47c308ec2(ArrayList<Integer> l, ArrayList<Integer> s) {
        ArrayList<Integer> l1 = new ArrayList<Integer>(l);
        ArrayList<Integer> s1 = new ArrayList<Integer>(s);
        Collections.sort(l1);
        Collections.sort(s1);
        if (l1.equals(s1)) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isSublist_Problem_2_1b625091_0042_40f3_8977_6d5f5c41f63c(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (l.size() < s.size()) {
            return False;
        }
        for (int i = 0; i < l.size() - s.size() + 1; i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean found = True;
                for (int j = 0; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        found = False;
                        break;
                    }
                }
                if (found) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_0_c969f04b_9b86_42c9_910e_2a6a84c684c6(ArrayList<Integer> l, ArrayList<Integer> s) {
        ArrayList<Integer> tempList = new ArrayList<Integer>();
        for(int i=0; i<l.size(); i++) {
            tempList.add(l.get(i));
        }
        for(int i=0; i<s.size(); i++) {
            tempList.add(s.get(i));
        }
        return tempList.stream().allMatch(l::contains);
    }

    
    public static boolean isSublist_Problem_2_4a4fbe25_b471_4734_a5a3_efcfd2af14bb(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0;
        int j = 0;
        while(i < l.size() && j < s.size()) {
            if(l.get(i) == s.get(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        return i == l.size() && j == s.size();
    }

    
    public static boolean isSublist_Problem_2_9e57fd22_aa2e_40da_90b1_b35f11da96eb(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0, j = 0;
        for(; i < l.size() && j < s.size(); i++) {
            if(l.get(i) == s.get(j)) {
                j++;
            }
        }
        return j == s.size();
    }

    
    public static boolean isSublist_Problem_2_99cf8c5b_5f6d_4c94_9e78_5c21e9d84300(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i <= l.size() - s.size(); i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean found = True;
                for (int j = 1; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        found = False;
                        break;
                    }
                }
                if (found) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_0_e8c033da_6676_4f6a_a79d_a29a6eb696c4(ArrayList<Integer> l, ArrayList<Integer> s) {
        ArrayList<Integer> l1 = new ArrayList<>(l);
        ArrayList<Integer> s1 = new ArrayList<>(s);
        boolean result = False;
        for(int i = 0; i < l1.size(); i++) {
            for(int j = 0; j < s1.size(); j++) {
                if(l1.get(i) == s1.get(j)) {
                    result = True;
                }
            }
        }
        return result;
    }

    
    public static boolean isSublist_Problem_1_67dc36c8_9caa_40fd_8af8_dc71398d6f00(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_0_b0cf1f3e_d359_434c_91c8_a5fbf4910e20(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_2_165236cf_c4db_425b_848a_b50020404234(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() == 0) {
            return True;
        }
        if (l.size() == 0) {
            return False;
        }
        if (l.size() < s.size()) {
            return False;
        }
        for (int i = 0; i < l.size() - s.size() + 1; i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean found = True;
                for (int j = 0; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        found = False;
                        break;
                    }
                }
                if (found) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_0_860cbffe_0530_488e_9ca8_d74f3edb9184(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0;
        int j = 0;
        while (i < l.size() && j < s.size()) {
            if (l.get(i).equals(s.get(j))) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        return j == s.size();
    }

    
    public static boolean isSublist_Problem_0_be445565_e29f_4a2e_bc96_64b70802aabd(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < l.size() && j < s.size()) {
            if (l.get(i) == s.get(j)) {
                i++;
                j++;
            } else {
                j++;
            }
        }
        if (i == l.size()) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isSublist_Problem_2_edb7ce5e_bbc8_4c4f_af86_4f0a1cd438a0(ArrayList<Integer> l, ArrayList<Integer> s) {
        return l.size() <= 1 || s.isEmpty() ? True : l.containsAll(s);
    }

    
    public static boolean isSublist_Problem_1_640321c8_4a6c_42a2_b638_7a19a18ff636(ArrayList<Integer> l, ArrayList<Integer> s) {
        // Write your code here
        for(int i=0;i<l.size();i++)
        {
            if(l.get(i).equals(s.get(i)))
            {
                System.out.println("found");
            }
            else
            {
                System.out.println("not found");
                return False;
            }
        }
        System.out.println("not found");
        return True;
    }

    
    public static boolean isSublist_Problem_0_a33aa094_066c_4b60_b51f_0fd2d35d38bf(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0, j = 0;
        while(i < l.size() && j < s.size()) {
            if(l.get(i) == s.get(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        return i == l.size() && j == s.size();
    }

    
    public static boolean isSublist_Problem_2_8711275a_a953_48a3_ae22_82cd2900cbab(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i <= l.size() - s.size(); i++) {
            if (l.subList(i, i + s.size()).equals(s)) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_1_53ceed9d_ac76_49d7_80fc_2c3edba59314(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_1_e8c033da_6676_4f6a_a79d_a29a6eb696c4(ArrayList<Integer> l, ArrayList<Integer> s) {
        ArrayList<Integer> l1 = new ArrayList<>(l);
        ArrayList<Integer> s1 = new ArrayList<>(s);
        boolean result = False;
        for(int i = 0; i < l1.size(); i++) {
            for(int j = 0; j < s1.size(); j++) {
                if(l1.get(i) == s1.get(j)) {
                    result = True;
                }
            }
        }
        return result;
    }

    
    public static boolean isSublist_Problem_2_19928bb6_4c5f_4dc0_a95c_ccd2886214c6(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < l.size() && j < s.size()) {
            if (l.get(i) == s.get(j)) {
                i++;
                j++;
                k++;
            } else if (l.get(i) < s.get(j)) {
                i++;
            } else {
                j++;
            }
        }
        return k == s.size();
    }

    
    public static boolean isSublist_Problem_1_e5966a00_4148_4d30_bb74_ed44c6d73076(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i < l.size() - s.size() + 1; i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean found = True;
                for (int j = 0; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        found = False;
                        break;
                    }
                }
                if (found) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_0_ba86dde6_7f12_4f01_a5e5_10bc7ceb550d(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0;
        int j = 0;
        while (i < l.size() && j < s.size()) {
            if (l.get(i) == s.get(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        return i == l.size() && j == s.size();
    }

    
    public static boolean isSublist_Problem_1_a93d600f_5eb0_420c_97dc_facace1df003(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i <= l.size() - s.size(); i++) {
            if (l.subList(i, i + s.size()).equals(s)) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_0_984d5cb9_605f_445f_b5a5_74afcbff58e5(ArrayList<Integer> l, ArrayList<Integer> s) {
        boolean b = False;
        for (Integer aInteger : l) {
            if (s.contains(aInteger)) {
                b = True;
            }
        }
        return b;
    }

    
    public static boolean isSublist_Problem_1_18b9fbef_44e6_4c8f_bc96_c5293a7c1762(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_2_c0fb15f9_0a64_452d_8f41_735a3851f56e(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i < l.size() - s.size() + 1; i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean isSublist_Problem_2_c0fb15f9_0a64_452d_8f41_735a3851f56e = True;
                for (int j = 0; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        isSublist_Problem_2_c0fb15f9_0a64_452d_8f41_735a3851f56e = False;
                        break;
                    }
                }
                if (isSublist_Problem_2_c0fb15f9_0a64_452d_8f41_735a3851f56e) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_1_700a42e7_c927_4dc2_ba7b_ac7b5b1b6c87(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i <= l.size() - s.size(); i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean isSublist_Problem_1_700a42e7_c927_4dc2_ba7b_ac7b5b1b6c87 = True;
                for (int j = 0; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        isSublist_Problem_1_700a42e7_c927_4dc2_ba7b_ac7b5b1b6c87 = False;
                        break;
                    }
                }
                if (isSublist_Problem_1_700a42e7_c927_4dc2_ba7b_ac7b5b1b6c87) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_2_70dcfe58_a16a_4028_bacb_f5e3c4674b77(ArrayList<Integer> l, ArrayList<Integer> s) {
        // write your code here
        int i = 0, j = 0;
        ArrayList<Integer> a = new ArrayList<Integer>(l);
        ArrayList<Integer> b = new ArrayList<Integer>(s);
        int n = a.size();
        int m = b.size();
        if (n != m) {
            return False;
        }
        ArrayList<Integer> x = new ArrayList<Integer>();
        ArrayList<Integer> y = new ArrayList<Integer>();
        for (i = 0; i < n; i++) {
            if (a.get(i) == b.get(j)) {
                x.add(a.get(i));
                j++;
            } else {
                y.add(a.get(i));
            }
        }
        if (x.size() != y.size()) {
            return False;
        } else {
            return True;
        }
    }

    
    public static boolean isSublist_Problem_1_15529ed6_2a15_4f61_909d_b0b975e2f066(ArrayList<Integer> l, ArrayList<Integer> s) {
        ArrayList<Integer> sublist = new ArrayList<Integer>();
        for (int i = 0; i < Math.min(l.size(), s.size()); i++) {
            sublist.add(l.get(i));
        }
        for (int i = 0; i < s.size(); i++) {
            sublist.removeAll(s.subList(0, i));
            if (sublist.size() <= 0) {
                return False;
            }
        }
        return True;
    }

    
    public static boolean isSublist_Problem_2_4019ed98_ba78_4932_a75a_9fce73e53e07(ArrayList<Integer> l, ArrayList<Integer> s) {
        int n = l.size();
        int m = s.size();
        if (m > n) {
            return False;
        }
        for (int i = 0; i <= n - m; i++) {
            int j;
            for (j = 0; j < m; j++) {
                if (l.get(i + j) != s.get(j)) {
                    break;
                }
            }
            if (j == m) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_0_de3e81df_d345_4bf5_b6e5_dc94ae43d843(ArrayList<Integer> l, ArrayList<Integer> s) {
        ArrayList<Integer> l1 = new ArrayList<>(l);
        ArrayList<Integer> s1 = new ArrayList<>(s);
        ArrayList<Integer> l2 = new ArrayList<>();
        ArrayList<Integer> s2 = new ArrayList<>();
        for(int i=0; i<l1.size(); i++) {
            l2.add(l1.get(i));
        }
        for(int i=0; i<s1.size(); i++) {
            s2.add(s1.get(i));
        }
        for(int i=0; i<l2.size(); i++) {
            if(s2.contains(l2.get(i))) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_2_b8a59836_88e8_440f_9635_bcf14a77f206(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) return False;
        for (int i = 0; i <= l.size() - s.size(); i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean isSublist_Problem_2_b8a59836_88e8_440f_9635_bcf14a77f206 = True;
                for (int j = 0; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        isSublist_Problem_2_b8a59836_88e8_440f_9635_bcf14a77f206 = False;
                        break;
                    }
                }
                if (isSublist_Problem_2_b8a59836_88e8_440f_9635_bcf14a77f206) return True;
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_0_2107db2f_9f94_49d7_aeb1_a24c153bd534(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_1_45590d8e_5ce2_42fe_aeb4_11c4003f1fbf(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i < l.size() - s.size() + 1; i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean flag = True;
                for (int j = 1; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        flag = False;
                        break;
                    }
                }
                if (flag) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_0_cce324f6_9229_4384_b7ba_6f8db9aed423(ArrayList<Integer> l, ArrayList<Integer> s) {
        boolean flag = True;
        int i = 0;
        int j = 0;
        while(i < l.size() && j < s.size()) {
            if(l.get(i) > s.get(j)) {
                i++;
            }
            else {
                if(s.get(j) > l.get(i)) {
                    flag = False;
                }
                else {
                    i++;
                    j++;
                }
            }
        }
        return flag;
    }

    
    public static boolean isSublist_Problem_0_1a072364_e6db_4ca9_8ad4_84f59ce3a051(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (l.size() < s.size()) {
            return False;
        }
        for (int i = 0; i < l.size() - s.size() + 1; i++) {
            if (l.subList(i, i + s.size()).equals(s)) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_2_b8b8d04e_884a_4f3e_a8f2_02177b115330(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_1_959afae6_6ecd_4b8f_8701_03f601f3ac15(ArrayList<Integer> l, ArrayList<Integer> s) {
        int n = l.size();
        int m = s.size();
        for (int i = 0; i < n - m + 1; i++) {
            int j;
            for (j = 0; j < m; j++) {
                if (l.get(i + j) != s.get(j)) {
                    break;
                }
            }
            if (j == m) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_1_6328a28f_1b50_48fa_bfe6_8a6c9f6eb0ef(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0, j = 0;
        while (i < l.size() && j < s.size()) {
            if (l.get(i) == s.get(j)) {
                i++;
                j++;
            } else {
                j++;
            }
        }
        return i == l.size() && j == s.size();
    }

    
    public static boolean isSublist_Problem_1_a8aa4b1b_0196_4509_bf2a_9be1ee72e4dc(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i <= l.size() - s.size(); i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean isSublist_Problem_1_a8aa4b1b_0196_4509_bf2a_9be1ee72e4dc = True;
                for (int j = 0; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        isSublist_Problem_1_a8aa4b1b_0196_4509_bf2a_9be1ee72e4dc = False;
                        break;
                    }
                }
                if (isSublist_Problem_1_a8aa4b1b_0196_4509_bf2a_9be1ee72e4dc) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_0_94908795_c049_4788_8b56_6fbdd88655c0(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0;
        int j = 0;
        while(i < l.size() && j < s.size()) {
            if(l.get(i) == s.get(j)) {
                i++;
                j++;
            } else {
                j = 0;
            }
        }
        return i == l.size() && j == s.size();
    }

    
    public static boolean isSublist_Problem_0_296d3b1f_d231_4768_8044_02e4c6f11266(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (l.size() < s.size()) return False;
        for (int i = 0; i < s.size(); i++) {
            if (l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_1_4a32d7a5_e0ad_4d4d_9dab_82287c73eef7(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_2_644c5fdd_47bf_4fd0_b848_3eabbee27f73(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i <= l.size() - s.size(); i++) {
            if (l.get(i) == s.get(0)) {
                boolean found = True;
                for (int j = 1; j < s.size(); j++) {
                    if (l.get(i + j) != s.get(j)) {
                        found = False;
                        break;
                    }
                }
                if (found) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_2_27dd5801_e88e_4542_9762_47fd1bfa575e(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i <= l.size() - s.size(); i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean isSublist_Problem_2_27dd5801_e88e_4542_9762_47fd1bfa575e = True;
                for (int j = 1; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        isSublist_Problem_2_27dd5801_e88e_4542_9762_47fd1bfa575e = False;
                        break;
                    }
                }
                if (isSublist_Problem_2_27dd5801_e88e_4542_9762_47fd1bfa575e) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_0_c159444a_a3ee_464f_b236_828b0f5ae838(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_2_a2f48f4d_7e72_400e_9e78_11616e0f6ab8(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_0_caafa263_3af7_4dc8_9152_712fb52cdf8b(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(s.get(i) != l.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_2_3d69f560_19d5_49bb_aa0d_ed21656df0e7(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() > s.size()) return False;
        for(int i = 0; i < l.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_0_4a4fbe25_b471_4734_a5a3_efcfd2af14bb(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0;
        int j = 0;
        while(i < l.size() && j < s.size()) {
            if(l.get(i) == s.get(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        return i == l.size() && j == s.size();
    }

    
    public static boolean isSublist_Problem_2_e3a5ac86_9b37_4614_85d6_285a16e5c5d2(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0;
        int j = 0;
        while(i < l.size() && j < s.size()) {
            if(l.get(i) == s.get(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        return i == l.size() && j == s.size();
    }

    
    public static boolean isSublist_Problem_1_14b635ef_41a6_4a08_9f37_9a72fb0c9ff8(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() > s.size()) return False;
        for(int i = 0; i < l.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_1_efd584f7_b0a6_41c0_986d_7daff7eac888(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() > s.size()) return False;
        for(int i = 0; i < l.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_2_5d10c96e_048b_4d29_b993_cb63de3bdc1b(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) return False;
        for (int i = 0; i < l.size() - s.size() + 1; i++) {
            if (l.get(i).equals(s.get(0))) {
                int j = 0;
                while (j < s.size() && l.get(i + j).equals(s.get(j))) {
                    j++;
                }
                if (j == s.size()) return True;
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_0_9ad6a662_7858_48ad_9297_0af067054f9b(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_0_6a9e2cb0_fa71_4a3f_afb1_5753293228cd(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_1_b0cf1f3e_d359_434c_91c8_a5fbf4910e20(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_1_ec72a74c_2340_4704_8fc9_5fc5a436073e(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        int i = 0;
        int j = 0;
        while (i < l.size() && j < s.size()) {
            if (l.get(i) == s.get(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        if (j == s.size()) {
            return True;
        }
        return False;
    }

    
    public static boolean isSublist_Problem_1_f4cd7697_ff1d_441f_ae7f_b0438eb6e946(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i,j;
        for(i=0;i<l.size();i++){
            for(j=0;j<s.size();j++){
                if(l.get(i)==s.get(j)){
                    break;
                }
            }
            if(j==s.size())
                return True;
        }
        return False;
    }

    
    public static boolean isSublist_Problem_2_d37e166e_4656_4dc9_ac45_3ae6ba4d16d0(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() == 0) return True;
        if (l.size() == 0) return False;
        if (l.size() < s.size()) return False;
        for (int i = 0; i < l.size() - s.size() + 1; i++) {
            boolean isSub = True;
            for (int j = 0; j < s.size(); j++) {
                if (!l.get(i + j).equals(s.get(j))) {
                    isSub = False;
                    break;
                }
            }
            if (isSub) return True;
        }
        return False;
    }

    
    public static boolean isSublist_Problem_0_a4dd864c_4405_4344_a1e9_b62f25f91053(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() > s.size()) return False;
        for(int i = 0; i < l.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_1_5fc22b45_523c_4b49_80d7_6cc10dc79e69(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (l.size() < s.size()) {
            return False;
        }
        for (int i = 0; i < l.size(); i++) {
            if (l.get(i) != s.get(i)) {
                return False;
            }
        }
        return True;
    }

    
    public static boolean isSublist_Problem_0_90025507_0fbd_41b6_8414_c6b7f97d3491(ArrayList<Integer> l, ArrayList<Integer> s) {
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> s1 = new ArrayList<>();
        for(Integer i : l) {
            l1.add(i);
        }
        for(Integer i : s) {
            s1.add(i);
        }
        boolean flag = False;
        for(int i = 0; i < l1.size(); i++) {
            for(int j = 0; j < s1.size(); j++) {
                if(l1.get(i) == s1.get(j)) {
                    flag = True;
                    break;
                }
            }
        }
        return flag;
    }

    
    public static boolean isSublist_Problem_1_ae6b4ac4_2d32_43f8_85c7_848bf147f4a7(ArrayList<Integer> l, ArrayList<Integer> s) {
        boolean flag = False;
        int firstArray[] = new int[s.size()];
        int secondArray[] = new int[s.size()];
        for(int i=0; i<firstArray.length;i++) {
            firstArray[i] = s.get(i);
        }
        for(int i=0; i<l.size();i++) {
            secondArray[i] = l.get(i);
        }
        for(int i=0;i<secondArray.length;i++) {
            if(firstArray[i] != secondArray[i])
                flag = True;
        }
        return flag;
    }

    
    public static boolean isSublist_Problem_1_2d81b165_e11c_48cc_ae38_19008e66e8cd(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_2_237a8f7f_ff10_4753_92ad_34b9f03db68a(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_1_97ef5ba2_072d_44ab_a057_33cc97a7fd19(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i <= l.size() - s.size(); i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean isSublist_Problem_1_97ef5ba2_072d_44ab_a057_33cc97a7fd19 = True;
                for (int j = 0; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        isSublist_Problem_1_97ef5ba2_072d_44ab_a057_33cc97a7fd19 = False;
                        break;
                    }
                }
                if (isSublist_Problem_1_97ef5ba2_072d_44ab_a057_33cc97a7fd19) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_0_a012c966_f4bd_4a32_9a91_d479c763eac1(ArrayList<Integer> l, ArrayList<Integer> s) {
        // Write your code here
        return s.containsAll(l);
    }

    
    public static boolean isSublist_Problem_2_84382b2e_5e6a_4d76_8542_f61edd750eb9(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_0_9b17005f_b37b_4f86_a055_daa44dc9378e(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0, j = 0;
        while (i < l.size() && j < s.size()) {
            if (l.get(i) == s.get(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        return i == l.size() && j == s.size();
    }

    
    public static boolean isSublist_Problem_2_127ad148_9f40_4c0e_8d08_4078175bd1f6(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_0_127ad148_9f40_4c0e_8d08_4078175bd1f6(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_0_8ca63073_15ed_4284_8d2e_60a00b3a4f8a(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_2_9b17005f_b37b_4f86_a055_daa44dc9378e(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0, j = 0;
        while (i < l.size() && j < s.size()) {
            if (l.get(i) == s.get(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        return i == l.size() && j == s.size();
    }

    
    public static boolean isSublist_Problem_2_0a0928ce_794b_480d_8ca8_a5d030f83173(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() > s.size()) return False;
        for(int i = 0; i < l.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_1_fde80c87_4417_4b1a_9f52_7054bb509dd6(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0, j = 0;
        while (i < l.size() && j < s.size()) {
            if (l.get(i) == s.get(j)) {
                i++;
                j++;
            } else {
                j = 0;
            }
        }
        return i == l.size();
    }

    
    public static boolean isSublist_Problem_1_c4c5d37c_b6c8_47c3_a346_5a1ac0198127(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() != s.size()) return False;
        int n = l.size();
        for(int i=0; i<n; i++) {
            for(int j=i+1; j<n; j++) {
                if(l.get(i).equals(s.get(j))) return True;
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_2_de3e81df_d345_4bf5_b6e5_dc94ae43d843(ArrayList<Integer> l, ArrayList<Integer> s) {
        ArrayList<Integer> l1 = new ArrayList<>(l);
        ArrayList<Integer> s1 = new ArrayList<>(s);
        ArrayList<Integer> l2 = new ArrayList<>();
        ArrayList<Integer> s2 = new ArrayList<>();
        for(int i=0; i<l1.size(); i++) {
            l2.add(l1.get(i));
        }
        for(int i=0; i<s1.size(); i++) {
            s2.add(s1.get(i));
        }
        for(int i=0; i<l2.size(); i++) {
            if(s2.contains(l2.get(i))) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_0_4a8632a6_7a3e_42b5_92f4_627c4dbf6d53(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0, j = 0;
        while (i < l.size() && j < s.size()) {
            if (l.get(i) == s.get(j)) {
                i++;
                j++;
            } else {
                j = 0;
            }
        }
        return i == l.size();
    }

    
    public static boolean isSublist_Problem_1_b3edd6ae_9706_4049_89d0_ad3de68f767a(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_1_769acbf6_150c_4f43_aa96_589a78aeadcc(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_1_e59b0aae_91fe_4836_9e60_b8c129f41d8a(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i < l.size() - s.size() + 1; i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean isSublist_Problem_1_e59b0aae_91fe_4836_9e60_b8c129f41d8a = True;
                for (int j = 0; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        isSublist_Problem_1_e59b0aae_91fe_4836_9e60_b8c129f41d8a = False;
                        break;
                    }
                }
                if (isSublist_Problem_1_e59b0aae_91fe_4836_9e60_b8c129f41d8a) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_1_07d3ed14_62c5_47ab_8145_f4d0aa0bcd42(ArrayList<Integer> l, ArrayList<Integer> s) {
        //write your code here
        //return True if s is a sublist of l and False if not.
        for(int i=0; i< l.size();i++) {
            if(s.contains(l.get(i))) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_2_27e263d5_a51f_421a_8988_5591b31198f2(ArrayList<Integer> l, ArrayList<Integer> s) {
        int n = l.size();
        int m = s.size();
        for (int i = 0; i <= n - m; i++) {
            int j;
            for (j = 0; j < m; j++) {
                if (l.get(i + j) != s.get(j)) {
                    break;
                }
            }
            if (j == m) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_1_5475b620_a7f4_47e4_9351_c32a151d61f0(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_0_b6dc4093_d518_48d6_8c61_6870f50c298c(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_1_d87f2285_d289_4463_82cf_33bb36c1e330(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0, j = 0;
        while (i < l.size() && j < s.size()) {
            if (l.get(i) == s.get(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        return i == l.size() && j == s.size();
    }

    
    public static boolean isSublist_Problem_2_460d4f76_7956_4fbe_ae78_0a277d5202d4(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (l.size() < s.size()) {
            return False;
        }
        for (int i = 0; i < s.size(); i++) {
            if (l.get(i) != s.get(i)) {
                return False;
            }
        }
        return True;
    }

    
    public static boolean isSublist_Problem_2_aa1a8096_4186_43ff_a8e9_de76d2d39b13(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() > s.size()) return False;
        for(int i = 0; i < l.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_1_92758852_112a_4f79_bf3f_8b6cf645523b(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < l.size() && j < s.size()) {
            if (l.get(i) == s.get(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        return i == l.size() && j == s.size();
    }

    
    public static boolean isSublist_Problem_2_f46e5471_0342_4abd_8280_1ad1a5e8cc2f(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i <= l.size() - s.size(); i++) {
            if (l.get(i).equals(s.get(0))) {
                int j = 0;
                while (j < s.size() && l.get(i + j).equals(s.get(j))) {
                    j++;
                }
                if (j == s.size()) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_0_27e263d5_a51f_421a_8988_5591b31198f2(ArrayList<Integer> l, ArrayList<Integer> s) {
        int n = l.size();
        int m = s.size();
        for (int i = 0; i <= n - m; i++) {
            int j;
            for (j = 0; j < m; j++) {
                if (l.get(i + j) != s.get(j)) {
                    break;
                }
            }
            if (j == m) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_2_ca3e0a19_825c_4c9d_bc39_508eda23c4f6(ArrayList<Integer> l, ArrayList<Integer> s) {
        boolean flag = True;
        for (int i : s) {
            if (!l.contains(i)) {
                flag = False;
                break;
            }
        }
        return flag;
    }

    
    public static boolean isSublist_Problem_2_1a072364_e6db_4ca9_8ad4_84f59ce3a051(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (l.size() < s.size()) {
            return False;
        }
        for (int i = 0; i < l.size() - s.size() + 1; i++) {
            if (l.subList(i, i + s.size()).equals(s)) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_0_ee076d96_f32b_4e13_8e13_aef08a7de614(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0;
        int j = 0;
        while (i < l.size() && j < s.size()) {
            if (l.get(i) == s.get(j)) {
                i++;
                j++;
            } else {
                j = 0;
            }
        }
        return i == l.size();
    }

    
    public static boolean isSublist_Problem_0_fa1dc739_7b6b_43eb_a565_5a1375dc5a64(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) return False;
        for (int i = 0; i < l.size() - s.size() + 1; i++) {
            if (l.get(i).equals(s.get(0))) {
                int j = 0;
                for (; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) break;
                }
                if (j == s.size()) return True;
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_1_7cf5b57f_7990_4a30_aad7_30ea3e6ef6d1(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) return False;
        for (int i = 0; i < l.size() - s.size() + 1; i++) {
            if (l.subList(i, i + s.size()).equals(s)) return True;
        }
        return False;
    }

    
    public static boolean isSublist_Problem_1_e59b0aae_91fe_4836_9e60_b8c129f41d8a(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i < l.size() - s.size() + 1; i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean isSublist_Problem_1_e59b0aae_91fe_4836_9e60_b8c129f41d8a = True;
                for (int j = 0; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        isSublist_Problem_1_e59b0aae_91fe_4836_9e60_b8c129f41d8a = False;
                        break;
                    }
                }
                if (isSublist_Problem_1_e59b0aae_91fe_4836_9e60_b8c129f41d8a) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_0_09ce9c0e_c2ff_489c_9955_00c4ad6ed772(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (l.size() < s.size()) return False;
        for (int i = 0; i < s.size(); i++) {
            if (l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_1_233a5a70_ec80_4873_b1c9_d167aed4db6d(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i < l.size(); i++) {
            if (l.get(i) == s.get(0)) {
                int j = 0;
                while (j < s.size() && i + j < l.size() && l.get(i + j) == s.get(j)) {
                    j++;
                }
                if (j == s.size()) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_1_a4dd864c_4405_4344_a1e9_b62f25f91053(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() > s.size()) return False;
        for(int i = 0; i < l.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_2_c0c5ae37_d768_40aa_b6b7_7c7526c96848(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i <= l.size() - s.size(); i++) {
            if (l.get(i) == s.get(0)) {
                boolean match = True;
                for (int j = 0; j < s.size(); j++) {
                    if (l.get(i + j) != s.get(j)) {
                        match = False;
                        break;
                    }
                }
                if (match) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_1_7e7109d2_612c_40cb_ad63_558349df89b6(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) return False;
        for (int i = 0; i <= l.size() - s.size(); i++) {
            if (l.subList(i, i + s.size()).equals(s)) return True;
        }
        return False;
    }

    
    public static boolean isSublist_Problem_1_b3c919f0_b9b2_487c_a151_0cf4d0111940(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) return False;
        for (int i = 0; i < l.size() - s.size() + 1; i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean found = True;
                for (int j = 0; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        found = False;
                        break;
                    }
                }
                if (found) return True;
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_0_8711275a_a953_48a3_ae22_82cd2900cbab(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i <= l.size() - s.size(); i++) {
            if (l.subList(i, i + s.size()).equals(s)) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_0_0523ab52_b1e0_403f_8947_dba521eafb3b(ArrayList<Integer> l, ArrayList<Integer> s) {
        boolean result = True;
        if (l == null || l.isEmpty() || s == null || s.isEmpty()) return result;
        for (Integer x : s) {
            boolean found = False;
            for (Integer y : l) {
                if (x == y) {
                    found = True;
                    break;
                }
            }
            if(!found) result = False;
        }
        return result;
    }

    
    public static boolean isSublist_Problem_2_a4dd864c_4405_4344_a1e9_b62f25f91053(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() > s.size()) return False;
        for(int i = 0; i < l.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_1_6a9e2cb0_fa71_4a3f_afb1_5753293228cd(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_2_be3c9e8b_bbe3_4808_a9d9_5e6d322cbbcf(ArrayList<Integer> l, ArrayList<Integer> s) {
        int n = l.size();
        int m = s.size();
        for (int i = 0; i <= n - m; i++) {
            int j;
            for (j = 0; j < m; j++) {
                if (l.get(i + j) != s.get(j)) {
                    break;
                }
            }
            if (j == m) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_0_cb159ef9_d5d8_4872_821e_0fdd82470018(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) return False;
        for (int i = 0; i < l.size() - s.size() + 1; i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean isSub = True;
                for (int j = 0; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        isSub = False;
                        break;
                    }
                }
                if (isSub) return True;
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_1_8ca63073_15ed_4284_8d2e_60a00b3a4f8a(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_2_8714f178_f6f1_43eb_a384_44676418f8ab(ArrayList<Integer> l, ArrayList<Integer> s) {
        // Write your code here
        ArrayList<Integer> l1 = new ArrayList<Integer>();
        ArrayList<Integer> s1 = new ArrayList<Integer>();
        for(Integer i : l) {
            l1.add(i);
        }
        for(Integer i : s) {
            s1.add(i);
        }
        boolean flag = False;
        for(int i=0;i<l1.size();i++) {
            for(int j=0;j<s1.size();j++) {
                if(l1.get(i).equals(s1.get(j))) {
                    flag = True;
                    break;
                }
            }
        }
        return flag;
    }

    
    public static boolean isSublist_Problem_1_caafa263_3af7_4dc8_9152_712fb52cdf8b(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(s.get(i) != l.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_1_af725686_ebc5_415f_9afd_1c1a551f5071(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < l.size() && j < s.size()) {
            if (l.get(i) == s.get(j)) {
                i++;
                j++;
                k++;
            } else if (l.get(i) < s.get(j)) {
                i++;
            } else {
                j++;
            }
        }
        return k == s.size();
    }

    
    public static boolean isSublist_Problem_1_38995b30_3cf6_4f36_a9e1_c962adc9cad6(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size())
            return False;
        for (int i = 0; i <= l.size() - s.size(); i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean isSublist_Problem_1_38995b30_3cf6_4f36_a9e1_c962adc9cad6 = True;
                for (int j = 1; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        isSublist_Problem_1_38995b30_3cf6_4f36_a9e1_c962adc9cad6 = False;
                        break;
                    }
                }
                if (isSublist_Problem_1_38995b30_3cf6_4f36_a9e1_c962adc9cad6)
                    return True;
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_2_0b8158bf_4337_4448_ac3a_3a609c5b23c2(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_0_82166f31_561d_49bb_b487_0456d84074f0(ArrayList<Integer> l, ArrayList<Integer> s) {
        boolean result = False;
        for(int i = 0; i < l.size(); i++) {
            for(int j = 0; j < s.size(); j++) {
                if(l.get(i) == s.get(j)) {
                    result = True;
                    break;
                }
            }
        }
        return result;
    }

    
    public static boolean isSublist_Problem_2_1791d202_f836_41c3_88fb_4261837a0045(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i <= l.size() - s.size(); i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean found = True;
                for (int j = 0; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        found = False;
                        break;
                    }
                }
                if (found) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_0_6328a28f_1b50_48fa_bfe6_8a6c9f6eb0ef(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0, j = 0;
        while (i < l.size() && j < s.size()) {
            if (l.get(i) == s.get(j)) {
                i++;
                j++;
            } else {
                j++;
            }
        }
        return i == l.size() && j == s.size();
    }

    
    public static boolean isSublist_Problem_2_039181dd_f569_4762_b242_2fa4fdd0c906(ArrayList<Integer> l, ArrayList<Integer> s) {
        Set<Integer> set = new HashSet<>();
        l.stream().forEach(v -> set.add(v));
        s.stream().forEach(v -> set.add(v));
        return set.size() == l.size();
    }

    
    public static boolean isSublist_Problem_2_cd958c5b_add7_4cc0_a1e9_290353dcf20c(ArrayList<Integer> l, ArrayList<Integer> s) {
        ArrayList<Integer> l1 = new ArrayList<>(l);
        ArrayList<Integer> s1 = new ArrayList<>(s);
        ArrayList<Integer> l2 = new ArrayList<>();
        ArrayList<Integer> s2 = new ArrayList<>();
        for(int i = 0; i < l.size(); i++) {
            l2.add(l.get(i));
        }
        for(int i = 0; i < s.size(); i++) {
            s2.add(s.get(i));
        }
        for(int i = 0; i < l1.size(); i++) {
            if(!s2.contains(l1.get(i))) {
                return False;
            }
        }
        return True;
    }

    
    public static boolean isSublist_Problem_0_904306f2_d67f_48dd_b282_1b9babb49892(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i <= l.size() - s.size(); i++) {
            if (l.get(i).equals(s.get(0))) {
                int j = 0;
                while (j < s.size() && l.get(i + j).equals(s.get(j))) {
                    j++;
                }
                if (j == s.size()) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_2_d81341e5_9025_401e_bc26_59dd0a0480b6(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() <= 1) {
            return True;
        }
        List<Integer> l1 = l.subList(0, l.size()-1);
        List<Integer> s1 = s.subList(0, s.size() - 1);
        return l1.equals(s1);
    }

    
    public static boolean isSublist_Problem_1_e6e58c99_d5a1_4bb3_b7c4_e9d3161bd8ab(ArrayList<Integer> l, ArrayList<Integer> s) {
        boolean result = False;
        for(int i = 0; i < l.size(); i++) {
            for(int j = 0; j < s.size(); j++) {
                if(l.get(i).equals(s.get(j))) {
                    result = True;
                    break;
                }
            }
        }
        return result;
    }

    
    public static boolean isSublist_Problem_0_11e6c338_3567_4fab_a641_342667aaf7ce(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) return False;
        for (int i = 0; i < l.size() - s.size() + 1; i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean isSublist_Problem_0_11e6c338_3567_4fab_a641_342667aaf7ce = True;
                for (int j = 0; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        isSublist_Problem_0_11e6c338_3567_4fab_a641_342667aaf7ce = False;
                        break;
                    }
                }
                if (isSublist_Problem_0_11e6c338_3567_4fab_a641_342667aaf7ce) return True;
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_2_fa1dc739_7b6b_43eb_a565_5a1375dc5a64(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) return False;
        for (int i = 0; i < l.size() - s.size() + 1; i++) {
            if (l.get(i).equals(s.get(0))) {
                int j = 0;
                for (; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) break;
                }
                if (j == s.size()) return True;
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_2_dd75e223_e73d_44db_9920_5eee3bf27b6b(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i <= l.size() - s.size(); i++) {
            if (l.get(i).equals(s.get(0))) {
                int j = 0;
                while (j < s.size() && l.get(i + j).equals(s.get(j))) {
                    j++;
                }
                if (j == s.size()) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_1_a4328e1f_57f9_47c4_9190_887a59ee8dd4(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0;
        int j = 0;
        while (i < l.size() && j < s.size()) {
            if (l.get(i) == s.get(j)) {
                i++;
                j++;
            } else {
                j = 0;
            }
        }
        return i == l.size();
    }

    
    public static boolean isSublist_Problem_1_ddd6dfba_3b94_433d_a82f_fbc076a14bc4(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_1_672e2757_03f7_4138_b1ab_53ba84e0cdad(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i <= l.size() - s.size(); i++) {
            if (l.subList(i, i + s.size()).equals(s)) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_2_ddd6dfba_3b94_433d_a82f_fbc076a14bc4(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_2_ce760bd0_031e_46f4_966c_9c89357cae18(ArrayList<Integer> l, ArrayList<Integer> s) {
        int n = l.size();
        int m = s.size();
        if (m > n) return False;
        for (int i = 0; i <= n - m; i++) {
            int j;
            for (j = 0; j < m; j++) {
                if (l.get(i + j) != s.get(j)) break;
            }
            if (j == m) return True;
        }
        return False;
    }

    
    public static boolean isSublist_Problem_2_19928bb6_4c5f_4dc0_a95c_ccd2886214c6(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < l.size() && j < s.size()) {
            if (l.get(i) == s.get(j)) {
                i++;
                j++;
                k++;
            } else if (l.get(i) < s.get(j)) {
                i++;
            } else {
                j++;
            }
        }
        return k == s.size();
    }

    
    public static boolean isSublist_Problem_1_92758852_112a_4f79_bf3f_8b6cf645523b(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < l.size() && j < s.size()) {
            if (l.get(i) == s.get(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        return i == l.size() && j == s.size();
    }

    
    public static boolean isSublist_Problem_2_e4d49bed_fe1b_4ea2_bdca_29c5cb5828be(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0;
        int j = 0;
        int l_size = l.size();
        int s_size = s.size();
        while (i < l_size && j < s_size) {
            if (l.get(i) == s.get(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        return (i == l_size && j == s_size);
    }

    
    public static boolean isSublist_Problem_2_e59b0aae_91fe_4836_9e60_b8c129f41d8a(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i < l.size() - s.size() + 1; i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean isSublist_Problem_2_e59b0aae_91fe_4836_9e60_b8c129f41d8a = True;
                for (int j = 0; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        isSublist_Problem_2_e59b0aae_91fe_4836_9e60_b8c129f41d8a = False;
                        break;
                    }
                }
                if (isSublist_Problem_2_e59b0aae_91fe_4836_9e60_b8c129f41d8a) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_2_5c1baabd_1aa2_4166_b36f_c4d4c1f9eb1f(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0, j = 0;
        for(; i < l.size() && j < s.size(); ++i, ++j) {
            if(l.get(i) != s.get(j)) {
                return False;
            }
        }
        return i == l.size() && j == s.size();
    }

    
    public static boolean isSublist_Problem_1_df5837ca_c77b_4dd6_959f_661fea556f0b(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        int i = 0;
        for(Integer e : s) {
            if(l.get(i) != e) return False;
            i++;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_0_3e94bdd1_c32a_4b30_a365_d89a931e55a5(ArrayList<Integer> l, ArrayList<Integer> s) {
        int n = l.size();
        int m = s.size();
        for (int i = 0; i <= n - m; i++) {
            int j;
            for (j = 0; j < m; j++) {
                if (l.get(i + j) != s.get(j)) {
                    break;
                }
            }
            if (j == m) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_0_ed5f0390_8ef6_4fd7_8515_d15ae214c8a8(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i <= l.size() - s.size(); i++) {
            if (l.subList(i, i + s.size()).equals(s)) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_0_bd1c7a2d_58d8_41c1_afff_1a3a7ef4fcfd(ArrayList<Integer> l, ArrayList<Integer> s) {
        // Write your code here
        ArrayList<Integer> n = new ArrayList<>();
        n.addAll(l);
        n.removeAll(s);
        if (n.isEmpty()) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isSublist_Problem_0_5bde70ec_766f_4ceb_8919_a2ba350aba51(ArrayList<Integer> l, ArrayList<Integer> s) {
        ArrayList<Integer> l1 = new ArrayList<>(l);
        ArrayList<Integer> s1 = new ArrayList<>(s);
        ArrayList<Integer> l2 = new ArrayList<>();
        ArrayList<Integer> s2 = new ArrayList<>();
        for(int i = 0; i < l1.size(); i++) {
            l2.add(l1.get(i));
        }
        for(int i = 0; i < s1.size(); i++) {
            s2.add(s1.get(i));
        }
        for(int i = 0; i < l2.size(); i++) {
            if(!s2.contains(l2.get(i))) {
                return False;
            }
        }
        return True;
    }

    
    public static boolean isSublist_Problem_2_739f76df_4cc1_476a_99f1_9a98699a99ff(ArrayList<Integer> l, ArrayList<Integer> s) {
        // Write your code here.
        ArrayList<Integer> a = new ArrayList<>();
        boolean flag = True;
        for(int i=0; i<l.size(); i++) {
            for(int j: l) {
                if(!s.contains(j)) {
                    flag = False;
                    break;
                }
            }
        }
        return flag;
    }

    
    public static boolean isSublist_Problem_1_c159444a_a3ee_464f_b236_828b0f5ae838(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_1_ba075ef2_5597_4ffc_a5aa_343f9df0682a(ArrayList<Integer> l, ArrayList<Integer> s) {
        ArrayList<Integer> sublist = new ArrayList<>();
        for(Integer i : l) {
            for(Integer j : s) {
                if(i == j) {
                    sublist.add(i);
                }
            }
        }
        return sublist.equals(s);
    }

    
    public static boolean isSublist_Problem_1_e99b20ee_8f63_4a23_a7a6_969ac3bce3a2(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (l.size() < s.size()) {
            return False;
        }
        for (int i = 0; i < l.size() - s.size() + 1; i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean isSublist_Problem_1_e99b20ee_8f63_4a23_a7a6_969ac3bce3a2 = True;
                for (int j = 0; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        isSublist_Problem_1_e99b20ee_8f63_4a23_a7a6_969ac3bce3a2 = False;
                        break;
                    }
                }
                if (isSublist_Problem_1_e99b20ee_8f63_4a23_a7a6_969ac3bce3a2) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_2_1b6d5d47_a3c9_4406_a7c6_c2f6a207f1d1(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (l.size() < s.size()) return False;
        for (int i = 0; i < s.size(); i++) {
            if (l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_1_fde80c87_4417_4b1a_9f52_7054bb509dd6(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0, j = 0;
        while (i < l.size() && j < s.size()) {
            if (l.get(i) == s.get(j)) {
                i++;
                j++;
            } else {
                j = 0;
            }
        }
        return i == l.size();
    }

    
    public static boolean isSublist_Problem_0_23f895e8_ed35_464a_bf99_5bbcf0850dd7(ArrayList<Integer> l, ArrayList<Integer> s) {
        boolean flag = False;
        ArrayList<Integer> result = new ArrayList<>();
        for(int i : l) {
            if(!s.contains(i))
                return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_0_230f8b6b_cc74_49eb_abc9_558fbeee96a0(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < l.size() && j < s.size()) {
            if (l.get(i) == s.get(j)) {
                i++;
                j++;
                k++;
            } else if (l.get(i) < s.get(j)) {
                i++;
            } else {
                j++;
            }
        }
        return k == s.size();
    }

    
    public static boolean isSublist_Problem_0_739f76df_4cc1_476a_99f1_9a98699a99ff(ArrayList<Integer> l, ArrayList<Integer> s) {
        // Write your code here.
        ArrayList<Integer> a = new ArrayList<>();
        boolean flag = True;
        for(int i=0; i<l.size(); i++) {
            for(int j: l) {
                if(!s.contains(j)) {
                    flag = False;
                    break;
                }
            }
        }
        return flag;
    }

    
    public static boolean isSublist_Problem_1_07d3ed14_62c5_47ab_8145_f4d0aa0bcd42(ArrayList<Integer> l, ArrayList<Integer> s) {
        //write your code here
        //return True if s is a sublist of l and False if not.
        for(int i=0; i< l.size();i++) {
            if(s.contains(l.get(i))) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_1_ee8af824_d884_4942_878e_d3b6f8a70e3e(ArrayList<Integer> l, ArrayList<Integer> s) {
        return Arrays.asList(l).containsAll(Arrays.asList(s));
    }

    
    public static boolean isSublist_Problem_2_2b3d7506_98e3_4b68_958d_4cf532023d30(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(s.get(i) != l.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_1_b3c46029_748c_4bf6_ba3e_9ca47c308ec2(ArrayList<Integer> l, ArrayList<Integer> s) {
        ArrayList<Integer> l1 = new ArrayList<Integer>(l);
        ArrayList<Integer> s1 = new ArrayList<Integer>(s);
        Collections.sort(l1);
        Collections.sort(s1);
        if (l1.equals(s1)) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isSublist_Problem_1_b8b8d04e_884a_4f3e_a8f2_02177b115330(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_1_8208a0a5_253f_4459_b1dd_68bb8b2f2489(ArrayList<Integer> l, ArrayList<Integer> s) {
        ArrayList<Integer> sub = new ArrayList<Integer>();
        for(Integer i : s) {
            for(Integer j : l) {
                if(j.equals(i)) {
                    sub.add(i);
                }
            }
        }
        return sub.isEmpty();
    }

    
    public static boolean isSublist_Problem_2_2b3d7506_98e3_4b68_958d_4cf532023d30(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(s.get(i) != l.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_0_41eccd45_828c_4d0b_a89e_3583606e4afe(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0;
        int j = 0;
        int k = 0;
        int l_size = l.size();
        int s_size = s.size();
        while (i < l_size && j < s_size) {
            if (l.get(i) == s.get(j)) {
                i++;
                j++;
                k++;
            } else if (l.get(i) < s.get(j)) {
                i++;
            } else {
                j++;
            }
        }
        return k == s_size;
    }

    
    public static boolean isSublist_Problem_2_54862011_cb1d_41d2_9cf7_bd78a32ec751(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0;
        int j = 0;
        while (i < l.size() && j < s.size()) {
            if (l.get(i) == s.get(j)) {
                i++;
                j++;
            } else if (l.get(i) > s.get(j)) {
                j++;
            } else {
                i++;
            }
        }
        return i == l.size() && j == s.size();
    }

    
    public static boolean isSublist_Problem_1_fde1641d_00d5_4ee9_8ca2_ac7857cc5d2b(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) return False;
        for (int i = 0; i <= l.size() - s.size(); i++) {
            if (l.subList(i, i + s.size()).equals(s)) return True;
        }
        return False;
    }

    
    public static boolean isSublist_Problem_0_fde80c87_4417_4b1a_9f52_7054bb509dd6(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0, j = 0;
        while (i < l.size() && j < s.size()) {
            if (l.get(i) == s.get(j)) {
                i++;
                j++;
            } else {
                j = 0;
            }
        }
        return i == l.size();
    }

    
    public static boolean isSublist_Problem_1_fbf93d90_e09b_4b84_9fca_6530c13c5c74(ArrayList<Integer> l, ArrayList<Integer> s) {
        for(int i = 0; i < l.size(); i++) {
            for(int j = 0; j < s.size(); j++) {
                if(l.get(i) == s.get(j))
                    return True;
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_2_b0cf1f3e_d359_434c_91c8_a5fbf4910e20(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_0_eb8aef41_aa02_4c7b_b72b_8d4123c7b27b(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i <= l.size() - s.size(); i++) {
            if (l.get(i).equals(s.get(0))) {
                if (l.subList(i, i + s.size()).equals(s)) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_0_f46e5471_0342_4abd_8280_1ad1a5e8cc2f(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i <= l.size() - s.size(); i++) {
            if (l.get(i).equals(s.get(0))) {
                int j = 0;
                while (j < s.size() && l.get(i + j).equals(s.get(j))) {
                    j++;
                }
                if (j == s.size()) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_1_2d61b802_4be3_4a36_bbb1_17e1a945b81d(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() > s.size()) return False;
        for(int i = 0; i < l.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_2_d72582db_f180_4ee0_9ca4_7575473c8fb5(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i < l.size() - s.size() + 1; i++) {
            boolean isSublist_Problem_2_d72582db_f180_4ee0_9ca4_7575473c8fb5 = True;
            for (int j = 0; j < s.size(); j++) {
                if (l.get(i + j) != s.get(j)) {
                    isSublist_Problem_2_d72582db_f180_4ee0_9ca4_7575473c8fb5 = False;
                    break;
                }
            }
            if (isSublist_Problem_2_d72582db_f180_4ee0_9ca4_7575473c8fb5) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_0_57c0d0c2_66fb_40b6_8fa9_050d6cb74b0c(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_2_77ec45a3_5a40_4290_900b_a2ef31df38a4(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_1_1791d202_f836_41c3_88fb_4261837a0045(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i <= l.size() - s.size(); i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean found = True;
                for (int j = 0; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        found = False;
                        break;
                    }
                }
                if (found) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_2_82bd1def_a3cd_4ea4_8a72_c228a5655a60(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_1_719df5c7_0a26_4bde_bb0e_4f1f9754c302(ArrayList<Integer> l, ArrayList<Integer> s) {
        ArrayList<Integer> l1 = new ArrayList<>(l);
        ArrayList<Integer> s1 = new ArrayList<>(s);
        ArrayList<Integer> l2 = new ArrayList<>();
        ArrayList<Integer> s2 = new ArrayList<>();
        for(int i=0; i<l1.size(); i++) {
            l2.add(l1.get(i));
        }
        for(int i=0; i<s1.size(); i++) {
            s2.add(s1.get(i));
        }
        for(int i=0; i<l2.size(); i++) {
            if(!s2.contains(l2.get(i))) {
                return False;
            }
        }
        return True;
    }

    
    public static boolean isSublist_Problem_1_f7cdb66d_9ff5_4dd0_a5bc_84f6f69faa85(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_0_99cf8c5b_5f6d_4c94_9e78_5c21e9d84300(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i <= l.size() - s.size(); i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean found = True;
                for (int j = 1; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        found = False;
                        break;
                    }
                }
                if (found) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_0_ca3e0a19_825c_4c9d_bc39_508eda23c4f6(ArrayList<Integer> l, ArrayList<Integer> s) {
        boolean flag = True;
        for (int i : s) {
            if (!l.contains(i)) {
                flag = False;
                break;
            }
        }
        return flag;
    }

    
    public static boolean isSublist_Problem_2_1242fc41_e150_4f29_8a63_ab7e14c8958d(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i < l.size() - s.size() + 1; i++) {
            if (l.subList(i, i + s.size()).equals(s)) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_2_cc023ff8_21b5_46ec_8a94_4f4551231c66(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0;
        int j = 0;
        while (i < l.size() && j < s.size()) {
            if (l.get(i) == s.get(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        return i == l.size() && j == s.size();
    }

    
    public static boolean isSublist_Problem_1_b3c919f0_b9b2_487c_a151_0cf4d0111940(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) return False;
        for (int i = 0; i < l.size() - s.size() + 1; i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean found = True;
                for (int j = 0; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        found = False;
                        break;
                    }
                }
                if (found) return True;
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_0_c0c5ae37_d768_40aa_b6b7_7c7526c96848(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i <= l.size() - s.size(); i++) {
            if (l.get(i) == s.get(0)) {
                boolean match = True;
                for (int j = 0; j < s.size(); j++) {
                    if (l.get(i + j) != s.get(j)) {
                        match = False;
                        break;
                    }
                }
                if (match) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_1_66088db6_2417_4390_a7d1_cd9536b93636(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_2_f6d643af_0e52_475d_a038_8900d870eeb8(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0;
        int j = 0;
        while (i < l.size() && j < s.size()) {
            if (l.get(i) == s.get(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        return i == l.size() && j == s.size();
    }

    
    public static boolean isSublist_Problem_0_15529ed6_2a15_4f61_909d_b0b975e2f066(ArrayList<Integer> l, ArrayList<Integer> s) {
        ArrayList<Integer> sublist = new ArrayList<Integer>();
        for (int i = 0; i < Math.min(l.size(), s.size()); i++) {
            sublist.add(l.get(i));
        }
        for (int i = 0; i < s.size(); i++) {
            sublist.removeAll(s.subList(0, i));
            if (sublist.size() <= 0) {
                return False;
            }
        }
        return True;
    }

    
    public static boolean isSublist_Problem_0_e6b6a92e_f2ae_490a_a7d3_73d70c1185e2(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) return False;
        for (int i = 0; i < l.size() - s.size() + 1; i++) {
            if (l.get(i).equals(s.get(0))) {
                int j = 0;
                for (j = 0; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) break;
                }
                if (j == s.size()) return True;
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_2_e6e58c99_d5a1_4bb3_b7c4_e9d3161bd8ab(ArrayList<Integer> l, ArrayList<Integer> s) {
        boolean result = False;
        for(int i = 0; i < l.size(); i++) {
            for(int j = 0; j < s.size(); j++) {
                if(l.get(i).equals(s.get(j))) {
                    result = True;
                    break;
                }
            }
        }
        return result;
    }

    
    public static boolean isSublist_Problem_0_0b8158bf_4337_4448_ac3a_3a609c5b23c2(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_1_aef8d866_ae7d_424b_86cb_b447babeca9a(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0;
        int j = 0;
        while (i < l.size() && j < s.size()) {
            if (l.get(i) == s.get(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        return i == l.size() && j == s.size();
    }

    
    public static boolean isSublist_Problem_2_62ecd39b_07f7_4daa_892d_6a43b92953b3(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_0_fd0c5b6e_4781_47fe_9b61_98c225319e41(ArrayList<Integer> l, ArrayList<Integer> s) {
        ArrayList<Integer> x = new ArrayList<Integer>(s);
        boolean isSub = False;
        Iterator<Integer> itr = l.iterator();
        while (itr.hasNext()) {
            Integer n = itr.next();
            x.remove(n);
            if (x.isEmpty()) {
                isSub = True;
                break;
            }
        }
        return isSub;
    }

    
    public static boolean isSublist_Problem_0_9fe83b70_2bd8_48ed_81fc_ebff4a798667(ArrayList<Integer> l, ArrayList<Integer> s) {
        boolean result = False;
        for(Integer i : l) {
            for(Integer j : s) {
                if(l.contains(j) && s.contains(i)) {
                    result = True;
                }
            }
        }
        return result;
    }

    
    public static boolean isSublist_Problem_0_c4c5d37c_b6c8_47c3_a346_5a1ac0198127(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() != s.size()) return False;
        int n = l.size();
        for(int i=0; i<n; i++) {
            for(int j=i+1; j<n; j++) {
                if(l.get(i).equals(s.get(j))) return True;
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_2_af725686_ebc5_415f_9afd_1c1a551f5071(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < l.size() && j < s.size()) {
            if (l.get(i) == s.get(j)) {
                i++;
                j++;
                k++;
            } else if (l.get(i) < s.get(j)) {
                i++;
            } else {
                j++;
            }
        }
        return k == s.size();
    }

    
    public static boolean isSublist_Problem_1_e4784f26_cac5_4fbb_8a1f_2ea48f8ec6f7(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0;
        int j = 0;
        int k = 0;
        int l_size = l.size();
        int s_size = s.size();
        while (i < l_size && j < s_size) {
            if (l.get(i) == s.get(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        if (i == l_size && j == s_size) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isSublist_Problem_1_cf6a57af_e06a_48a7_a164_4c81f4d93cca(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) return False;
        for (int i = 0; i <= l.size() - s.size(); i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean found = True;
                for (int j = 1; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        found = False;
                        break;
                    }
                }
                if (found) return True;
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_0_d4dca47d_cb84_499c_a452_6f038e08091f(ArrayList<Integer> l, ArrayList<Integer> s) {
        // Create a boolean array to store the result.
        boolean[] result = new boolean[l.size()];
        int i = 0;
        for (Integer num : l) {
            if (s.contains(num)) {
                result[i] = True;
                i++;
            }
        }
        return Arrays.asList(result).contains(True);
    }

    
    public static boolean isSublist_Problem_0_aa178538_83be_40f6_9aab_77fc067933f8(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (l.size() < s.size()) {
            return False;
        }
        for (int i = 0; i < s.size(); i++) {
            if (l.get(i) != s.get(i)) {
                return False;
            }
        }
        return True;
    }

    
    public static boolean isSublist_Problem_2_2dccfb81_600c_47d4_9cc6_d3249e4b4a1a(ArrayList<Integer> l, ArrayList<Integer> s) {
        int size = l.size();
        int subsize = s.size();
        if (size != subsize) {
            return False;
        } else {
            ArrayList<Integer> temp = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                if (l.get(i) != s.get(i)) {
                    return False;
                }
            }
            return True;
        }
    }

    
    public static boolean isSublist_Problem_2_0ae58ff2_4d7f_420b_bd33_e84d7852e227(ArrayList<Integer> l, ArrayList<Integer> s) {
        return l.equals(s);
    }

    
    public static boolean isSublist_Problem_1_769acbf6_150c_4f43_aa96_589a78aeadcc(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_1_94908795_c049_4788_8b56_6fbdd88655c0(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0;
        int j = 0;
        while(i < l.size() && j < s.size()) {
            if(l.get(i) == s.get(j)) {
                i++;
                j++;
            } else {
                j = 0;
            }
        }
        return i == l.size() && j == s.size();
    }

    
    public static boolean isSublist_Problem_1_56d8c86d_9bc8_4413_aae8_250e83ff6fbe(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_0_efd584f7_b0a6_41c0_986d_7daff7eac888(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() > s.size()) return False;
        for(int i = 0; i < l.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_1_66088db6_2417_4390_a7d1_cd9536b93636(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_2_39a6409b_eacc_47d4_8572_517a06301da2(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_2_8714f178_f6f1_43eb_a384_44676418f8ab(ArrayList<Integer> l, ArrayList<Integer> s) {
        // Write your code here
        ArrayList<Integer> l1 = new ArrayList<Integer>();
        ArrayList<Integer> s1 = new ArrayList<Integer>();
        for(Integer i : l) {
            l1.add(i);
        }
        for(Integer i : s) {
            s1.add(i);
        }
        boolean flag = False;
        for(int i=0;i<l1.size();i++) {
            for(int j=0;j<s1.size();j++) {
                if(l1.get(i).equals(s1.get(j))) {
                    flag = True;
                    break;
                }
            }
        }
        return flag;
    }

    
    public static boolean isSublist_Problem_2_682f657b_360f_490c_b364_4c0e53553b21(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0;
        int j = 0;
        int size = l.size();
        int size2 = s.size();
        while (i < size && j < size2) {
            if (l.get(i) == s.get(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        return i == size && j == size2;
    }

    
    public static boolean isSublist_Problem_0_749fa8b0_9c5c_4a55_a72f_84b5cee96a6f(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() > s.size()) return False;
        for(int i = 0; i < l.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_0_de705347_9143_416c_97f8_9d3a00786276(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_1_7e35ec33_fed4_47f8_a66e_afccb9c4b11a(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        int i = 0;
        int j = 0;
        while (i < l.size() && j < s.size()) {
            if (l.get(i).equals(s.get(j))) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        return j == s.size();
    }

    
    public static boolean isSublist_Problem_0_8202300a_cac4_4837_87bd_f84524241dd2(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (l.size() != s.size()) return False;
        int i = 0;
        for (int j = 0; j < l.size(); j++)
            if (l.get(j) != s.get(j))
                return False;
            i++;
        return True;
    }

    
    public static boolean isSublist_Problem_0_9f0d67b7_5b8e_4738_833d_ed0dce21ebe2(ArrayList<Integer> l, ArrayList<Integer> s) {
        ArrayList<Integer> temp = new ArrayList<>();
        for(Integer i : l) {
            for(Integer j : s) {
                if(i == j) {
                    temp.add(i);
                }
            }
        }
        boolean result = temp.isEmpty();
        return result;
    }

    
    public static boolean isSublist_Problem_2_8425bb06_d28b_463c_9c6a_7b4db25a7221(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < l.size() && j < s.size()) {
            if (l.get(i) == s.get(j)) {
                i++;
                j++;
                k++;
            } else if (l.get(i) > s.get(j)) {
                j++;
            } else {
                i++;
            }
        }
        return k == s.size();
    }

    
    public static boolean isSublist_Problem_0_b513ce3c_19e7_4837_93a0_7001bdd5ba21(ArrayList<Integer> l, ArrayList<Integer> s) {
        ArrayList<Integer> subList = new ArrayList<Integer>();
        for(Integer i : l) {
            subList.add(i);
        }
        for(Integer i : s) {
            if(!subList.contains(i)) {
                return False;
            }
        }
        return True;
    }

    
    public static boolean isSublist_Problem_1_42e002fe_f5c7_4e98_98ed_51396757190c(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_2_1c59777a_487f_4a58_bb0f_40774c1f5ba8(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i <= l.size() - s.size(); i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean found = True;
                for (int j = 1; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        found = False;
                        break;
                    }
                }
                if (found) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_0_98ca632b_6721_4f2f_9645_22d1d0c4e79f(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) return False;
        for (int i = 0; i < l.size(); i++) {
            if (l.get(i) == s.get(0)) {
                boolean found = True;
                for (int j = 0; j < s.size(); j++) {
                    if (i + j >= l.size() || l.get(i + j) != s.get(j)) {
                        found = False;
                        break;
                    }
                }
                if (found) return True;
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_1_682f657b_360f_490c_b364_4c0e53553b21(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0;
        int j = 0;
        int size = l.size();
        int size2 = s.size();
        while (i < size && j < size2) {
            if (l.get(i) == s.get(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        return i == size && j == size2;
    }

    
    public static boolean isSublist_Problem_0_8202300a_cac4_4837_87bd_f84524241dd2(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (l.size() != s.size()) return False;
        int i = 0;
        for (int j = 0; j < l.size(); j++)
            if (l.get(j) != s.get(j))
                return False;
            i++;
        return True;
    }

    
    public static boolean isSublist_Problem_1_7e7109d2_612c_40cb_ad63_558349df89b6(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) return False;
        for (int i = 0; i <= l.size() - s.size(); i++) {
            if (l.subList(i, i + s.size()).equals(s)) return True;
        }
        return False;
    }

    
    public static boolean isSublist_Problem_2_9211e0a7_a97d_4b41_a625_f81c62c7f67b(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(s.get(i) != l.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_1_cd0da67c_3c71_4b8e_86f8_f15cb18eaa53(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i <= l.size() - s.size(); i++) {
            if (l.subList(i, i + s.size()).equals(s)) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_0_cfb97f61_2021_43c6_a3b3_98a570623397(ArrayList<Integer> l, ArrayList<Integer> s) {
        boolean res = False;
        int lSize = l.size(), sSize = s.size();
        if (lSize == sSize) {
            for (int i = 0; i < lSize; i++) {
                if (l.get(i) == s.get(i)) {
                    res = True;
                } else {
                    break;
                }
            }
        }
        return res;
    }

    
    public static boolean isSublist_Problem_0_84ba1406_bc86_4838_9ea8_f5658b62f04a(ArrayList<Integer> l, ArrayList<Integer> s) {
        ArrayList<Integer> sublist = new ArrayList<>();
        for(Integer i : l) {
            for(Integer j : s) {
                if(j.equals(i)) {
                    sublist.add(i);
                    break;
                }
            }
        }
        return sublist.equals(s);
    }

    
    public static boolean isSublist_Problem_0_e4784f26_cac5_4fbb_8a1f_2ea48f8ec6f7(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0;
        int j = 0;
        int k = 0;
        int l_size = l.size();
        int s_size = s.size();
        while (i < l_size && j < s_size) {
            if (l.get(i) == s.get(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        if (i == l_size && j == s_size) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isSublist_Problem_0_27136bf9_5474_4c7d_8aa1_ce10d5d2c99e(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (l.size() < s.size()) return False;
        for (int i = 0; i < s.size(); i++) {
            if (l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_0_3d69f560_19d5_49bb_aa0d_ed21656df0e7(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() > s.size()) return False;
        for(int i = 0; i < l.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_0_98072898_12a6_4776_8d9d_b2a0015e61c7(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() > s.size()) return False;
        for(int i = 0; i < l.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_2_2d81b165_e11c_48cc_ae38_19008e66e8cd(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_0_e99b20ee_8f63_4a23_a7a6_969ac3bce3a2(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (l.size() < s.size()) {
            return False;
        }
        for (int i = 0; i < l.size() - s.size() + 1; i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean isSublist_Problem_0_e99b20ee_8f63_4a23_a7a6_969ac3bce3a2 = True;
                for (int j = 0; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        isSublist_Problem_0_e99b20ee_8f63_4a23_a7a6_969ac3bce3a2 = False;
                        break;
                    }
                }
                if (isSublist_Problem_0_e99b20ee_8f63_4a23_a7a6_969ac3bce3a2) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_2_5bfc1975_d66b_4e70_aefd_9f880e53d47f(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0;
        int j = 0;
        while (i < l.size() && j < s.size()) {
            if (l.get(i) == s.get(j)) {
                i++;
                j++;
            } else {
                j = 0;
            }
        }
        return i == l.size();
    }

    
    public static boolean isSublist_Problem_2_84ba1406_bc86_4838_9ea8_f5658b62f04a(ArrayList<Integer> l, ArrayList<Integer> s) {
        ArrayList<Integer> sublist = new ArrayList<>();
        for(Integer i : l) {
            for(Integer j : s) {
                if(j.equals(i)) {
                    sublist.add(i);
                    break;
                }
            }
        }
        return sublist.equals(s);
    }

    
    public static boolean isSublist_Problem_1_5aeee13e_a1e5_4f9b_b756_45d8f2914ecf(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i < l.size() - s.size() + 1; i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean found = True;
                for (int j = 0; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        found = False;
                        break;
                    }
                }
                if (found) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_1_69ed85ff_5780_4fd6_9714_f9f28f22bede(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0, j = 0;
        while (i < l.size() && j < s.size()) {
            if (l.get(i) == s.get(j)) {
                i++;
                j++;
            } else {
                j = 0;
            }
        }
        return i == l.size() && j == s.size();
    }

    
    public static boolean isSublist_Problem_0_18e4a846_3f91_4039_83bd_c538e59486b3(ArrayList<Integer> l, ArrayList<Integer> s) {
        int n = l.size();
        int m = s.size();
        for (int i = 0; i <= n - m; i++) {
            int j;
            for (j = 0; j < m; j++) {
                if (l.get(i + j) != s.get(j)) {
                    break;
                }
            }
            if (j == m) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_0_14fd2743_2df2_4793_b6dd_f7c2db4243d2(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < l.size() && j < s.size()) {
            if (l.get(i) == s.get(j)) {
                i++;
                j++;
            } else {
                j++;
            }
        }
        if (i == l.size()) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isSublist_Problem_0_e5966a00_4148_4d30_bb74_ed44c6d73076(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i < l.size() - s.size() + 1; i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean found = True;
                for (int j = 0; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        found = False;
                        break;
                    }
                }
                if (found) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_1_4019ed98_ba78_4932_a75a_9fce73e53e07(ArrayList<Integer> l, ArrayList<Integer> s) {
        int n = l.size();
        int m = s.size();
        if (m > n) {
            return False;
        }
        for (int i = 0; i <= n - m; i++) {
            int j;
            for (j = 0; j < m; j++) {
                if (l.get(i + j) != s.get(j)) {
                    break;
                }
            }
            if (j == m) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_1_ae6b4ac4_2d32_43f8_85c7_848bf147f4a7(ArrayList<Integer> l, ArrayList<Integer> s) {
        boolean flag = False;
        int firstArray[] = new int[s.size()];
        int secondArray[] = new int[s.size()];
        for(int i=0; i<firstArray.length;i++) {
            firstArray[i] = s.get(i);
        }
        for(int i=0; i<l.size();i++) {
            secondArray[i] = l.get(i);
        }
        for(int i=0;i<secondArray.length;i++) {
            if(firstArray[i] != secondArray[i])
                flag = True;
        }
        return flag;
    }

    
    public static boolean isSublist_Problem_2_fa0549d6_9290_46c0_b86d_bd9429c4bf04(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0;
        int j = 0;
        while (i < l.size() && j < s.size()) {
            if (l.get(i) == s.get(j)) {
                i++;
                j++;
            } else {
                i = i + j;
                j = 0;
            }
        }
        return i == l.size() && j == s.size();
    }

    
    public static boolean isSublist_Problem_0_faf380bd_f094_4060_8058_a50851febda2(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0, j = 0;
        while(i < l.size() && j < s.size()) {
            if(l.get(i) == s.get(j)) {
                i++;
                j++;
            } else {
                j = 0;
            }
        }
        return i == l.size() && j == s.size();
    }

    
    public static boolean isSublist_Problem_1_460d4f76_7956_4fbe_ae78_0a277d5202d4(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (l.size() < s.size()) {
            return False;
        }
        for (int i = 0; i < s.size(); i++) {
            if (l.get(i) != s.get(i)) {
                return False;
            }
        }
        return True;
    }

    
    public static boolean isSublist_Problem_0_755f6ed7_a3f3_4d89_a1ce_8c5720ff542e(ArrayList<Integer> l, ArrayList<Integer> s) {
        return l.size() == s.size() && l.subList(0, s.size()).containsAll(s);
    }

    
    public static boolean isSublist_Problem_2_165236cf_c4db_425b_848a_b50020404234(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() == 0) {
            return True;
        }
        if (l.size() == 0) {
            return False;
        }
        if (l.size() < s.size()) {
            return False;
        }
        for (int i = 0; i < l.size() - s.size() + 1; i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean found = True;
                for (int j = 0; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        found = False;
                        break;
                    }
                }
                if (found) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_1_986d93c4_f89a_4e8d_a7a7_0d9146e8dda6(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i < l.size() - s.size() + 1; i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean isSublist_Problem_1_986d93c4_f89a_4e8d_a7a7_0d9146e8dda6 = True;
                for (int j = 1; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        isSublist_Problem_1_986d93c4_f89a_4e8d_a7a7_0d9146e8dda6 = False;
                        break;
                    }
                }
                if (isSublist_Problem_1_986d93c4_f89a_4e8d_a7a7_0d9146e8dda6) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_0_ccf7f12c_b39e_4483_bc46_3940277272a7(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i < l.size() - s.size() + 1; i++) {
            if (l.get(i).equals(s.get(0))) {
                int j = 0;
                for (; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        break;
                    }
                }
                if (j == s.size()) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_1_de705347_9143_416c_97f8_9d3a00786276(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_1_3ea1fa79_333c_4559_83a4_c43f4cb80458(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (l.size() < s.size()) return False;
        for (int i = 0; i < s.size(); i++) {
            if (l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_1_be3c9e8b_bbe3_4808_a9d9_5e6d322cbbcf(ArrayList<Integer> l, ArrayList<Integer> s) {
        int n = l.size();
        int m = s.size();
        for (int i = 0; i <= n - m; i++) {
            int j;
            for (j = 0; j < m; j++) {
                if (l.get(i + j) != s.get(j)) {
                    break;
                }
            }
            if (j == m) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_2_b15e24d6_1ecf_4048_a025_b6dc7df913c3(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) return False;
        for (int i = 0; i < l.size() - s.size() + 1; i++) {
            boolean found = True;
            for (int j = 0; j < s.size(); j++) {
                if (l.get(i + j) != s.get(j)) {
                    found = False;
                    break;
                }
            }
            if (found) return True;
        }
        return False;
    }

    
    public static boolean isSublist_Problem_0_6f893130_b41e_4de3_8346_66dfe1a1f4e2(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < l.size() && j < s.size()) {
            if (l.get(i) == s.get(j)) {
                i++;
                j++;
                k++;
            } else if (l.get(i) < s.get(j)) {
                i++;
            } else {
                j++;
            }
        }
        return k == s.size();
    }

    
    public static boolean isSublist_Problem_1_84ba1406_bc86_4838_9ea8_f5658b62f04a(ArrayList<Integer> l, ArrayList<Integer> s) {
        ArrayList<Integer> sublist = new ArrayList<>();
        for(Integer i : l) {
            for(Integer j : s) {
                if(j.equals(i)) {
                    sublist.add(i);
                    break;
                }
            }
        }
        return sublist.equals(s);
    }

    
    public static boolean isSublist_Problem_0_7bd62da5_25d5_495f_b2f3_148950e68130(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_2_3c277f1e_9062_4541_b9b5_816ff7c4e8dd(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) return False;
        for (int i = 0; i < l.size() - s.size() + 1; i++) {
            if (l.get(i).equals(s.get(0))) {
                int j = 0;
                for (; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) break;
                }
                if (j == s.size()) return True;
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_0_36421673_f5ae_4a7c_8b28_ec0a4608bb3f(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0, j = 0;
        while (i < l.size() && j < s.size()) {
            if (l.get(i) == s.get(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        return i == l.size() && j == s.size();
    }

    
    public static boolean isSublist_Problem_2_11e6c338_3567_4fab_a641_342667aaf7ce(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) return False;
        for (int i = 0; i < l.size() - s.size() + 1; i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean isSublist_Problem_2_11e6c338_3567_4fab_a641_342667aaf7ce = True;
                for (int j = 0; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        isSublist_Problem_2_11e6c338_3567_4fab_a641_342667aaf7ce = False;
                        break;
                    }
                }
                if (isSublist_Problem_2_11e6c338_3567_4fab_a641_342667aaf7ce) return True;
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_2_92758852_112a_4f79_bf3f_8b6cf645523b(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < l.size() && j < s.size()) {
            if (l.get(i) == s.get(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        return i == l.size() && j == s.size();
    }

    
    public static boolean isSublist_Problem_1_6d0eb92e_4b42_461b_af1b_5004a11c74e8(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() != s.size()) return False;
        
        ArrayList<Integer> l1 = new ArrayList<Integer>(l);
        for(int i = 0; i < s.size(); i++) {
            l1.remove(s.get(i));
        }
        
        boolean check = True;
        if(l.equals(l1)) {
            check = False;
        }
        return check;
    }

    
    public static boolean isSublist_Problem_0_3b54570c_a60d_4527_b9d3_ba1ebaebb85b(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0, j = 0;
        while (i < l.size() && j < s.size()) {
            if (l.get(i) == s.get(j)) {
                i++;
                j++;
            } else {
                j = 0;
            }
        }
        return i == l.size();
    }

    
    public static boolean isSublist_Problem_2_460d4f76_7956_4fbe_ae78_0a277d5202d4(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (l.size() < s.size()) {
            return False;
        }
        for (int i = 0; i < s.size(); i++) {
            if (l.get(i) != s.get(i)) {
                return False;
            }
        }
        return True;
    }

    
    public static boolean isSublist_Problem_1_ce760bd0_031e_46f4_966c_9c89357cae18(ArrayList<Integer> l, ArrayList<Integer> s) {
        int n = l.size();
        int m = s.size();
        if (m > n) return False;
        for (int i = 0; i <= n - m; i++) {
            int j;
            for (j = 0; j < m; j++) {
                if (l.get(i + j) != s.get(j)) break;
            }
            if (j == m) return True;
        }
        return False;
    }

    
    public static boolean isSublist_Problem_0_e8c033da_6676_4f6a_a79d_a29a6eb696c4(ArrayList<Integer> l, ArrayList<Integer> s) {
        ArrayList<Integer> l1 = new ArrayList<>(l);
        ArrayList<Integer> s1 = new ArrayList<>(s);
        boolean result = False;
        for(int i = 0; i < l1.size(); i++) {
            for(int j = 0; j < s1.size(); j++) {
                if(l1.get(i) == s1.get(j)) {
                    result = True;
                }
            }
        }
        return result;
    }

    
    public static boolean isSublist_Problem_2_959afae6_6ecd_4b8f_8701_03f601f3ac15(ArrayList<Integer> l, ArrayList<Integer> s) {
        int n = l.size();
        int m = s.size();
        for (int i = 0; i < n - m + 1; i++) {
            int j;
            for (j = 0; j < m; j++) {
                if (l.get(i + j) != s.get(j)) {
                    break;
                }
            }
            if (j == m) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_2_20c690cb_640c_41ba_b935_1b4653ddff24(ArrayList<Integer> l, ArrayList<Integer> s) {
        return l.stream().anyMatch(i -> s.contains(i));
    }

    
    public static boolean isSublist_Problem_0_5bfc1975_d66b_4e70_aefd_9f880e53d47f(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0;
        int j = 0;
        while (i < l.size() && j < s.size()) {
            if (l.get(i) == s.get(j)) {
                i++;
                j++;
            } else {
                j = 0;
            }
        }
        return i == l.size();
    }

    
    public static boolean isSublist_Problem_2_5c1baabd_1aa2_4166_b36f_c4d4c1f9eb1f(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0, j = 0;
        for(; i < l.size() && j < s.size(); ++i, ++j) {
            if(l.get(i) != s.get(j)) {
                return False;
            }
        }
        return i == l.size() && j == s.size();
    }

    
    public static boolean isSublist_Problem_2_c969f04b_9b86_42c9_910e_2a6a84c684c6(ArrayList<Integer> l, ArrayList<Integer> s) {
        ArrayList<Integer> tempList = new ArrayList<Integer>();
        for(int i=0; i<l.size(); i++) {
            tempList.add(l.get(i));
        }
        for(int i=0; i<s.size(); i++) {
            tempList.add(s.get(i));
        }
        return tempList.stream().allMatch(l::contains);
    }

    
    public static boolean isSublist_Problem_2_5efb342a_c9d6_4791_9057_0366e49d81ea(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() > s.size()) return False;
        for(int i = 0; i < l.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_1_101227d9_93b8_4da3_a95f_804bb0582974(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) return False;
        for (int i = 0; i < l.size() - s.size() + 1; i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean isSublist_Problem_1_101227d9_93b8_4da3_a95f_804bb0582974 = True;
                for (int j = 0; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        isSublist_Problem_1_101227d9_93b8_4da3_a95f_804bb0582974 = False;
                        break;
                    }
                }
                if (isSublist_Problem_1_101227d9_93b8_4da3_a95f_804bb0582974) return True;
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_1_539e387b_b152_4738_b653_b21395e3299b(ArrayList<Integer> l, ArrayList<Integer> s) {
        return l.equals(s);
    }

    
    public static boolean isSublist_Problem_1_d1354184_2d51_4f4c_ac45_6a97c7446b73(ArrayList<Integer> l, ArrayList<Integer> s) {
        boolean sublist = False; // to store the result
        for (int i = 0; i < l.size() - s.size(); i++) {
            ArrayList<Integer> temp = new ArrayList<Integer>(s);
            temp.add(l.get(i));
            for (int j = i + 1; j < l.size(); j++) {
                temp.add(l.get(j));
                if (temp.equals(s)) {
                    sublist = True;
                    break;
                }
            }
            if (!sublist) break;
        }
        return sublist;
    }

    
    public static boolean isSublist_Problem_0_ab0d6d35_16eb_470a_a87b_dd31f186133c(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_1_fd0c5b6e_4781_47fe_9b61_98c225319e41(ArrayList<Integer> l, ArrayList<Integer> s) {
        ArrayList<Integer> x = new ArrayList<Integer>(s);
        boolean isSub = False;
        Iterator<Integer> itr = l.iterator();
        while (itr.hasNext()) {
            Integer n = itr.next();
            x.remove(n);
            if (x.isEmpty()) {
                isSub = True;
                break;
            }
        }
        return isSub;
    }

    
    public static boolean isSublist_Problem_0_f55923ea_3112_49a1_a3d0_336f6e2d9b21(ArrayList<Integer> l, ArrayList<Integer> s) {
        boolean result = False;

        for(int i=0;i<l.size();i++) {
            for(int j=0;j<s.size();j++) {
                if(l.get(i) == s.get(j)) {
                    result = True;
                    break;
                }
            }
        }

        return result;
    }

    
    public static boolean isSublist_Problem_2_cd0da67c_3c71_4b8e_86f8_f15cb18eaa53(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i <= l.size() - s.size(); i++) {
            if (l.subList(i, i + s.size()).equals(s)) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_2_035a859e_8d56_4486_87b4_d47b4b12b7d5(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (l.size() < s.size()) return False;
        for (int i = 0; i < s.size(); i++) {
            if (l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_0_233a5a70_ec80_4873_b1c9_d167aed4db6d(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i < l.size(); i++) {
            if (l.get(i) == s.get(0)) {
                int j = 0;
                while (j < s.size() && i + j < l.size() && l.get(i + j) == s.get(j)) {
                    j++;
                }
                if (j == s.size()) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_2_7e35ec33_fed4_47f8_a66e_afccb9c4b11a(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        int i = 0;
        int j = 0;
        while (i < l.size() && j < s.size()) {
            if (l.get(i).equals(s.get(j))) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        return j == s.size();
    }

    
    public static boolean isSublist_Problem_0_2d81b165_e11c_48cc_ae38_19008e66e8cd(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_1_c603716d_435b_48c0_be73_b52b39f2fb60(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0;
        int j = 0;
        int k = 0;
        int lsize = l.size();
        int slsize = s.size();
        while (i < lsize && j < slsize) {
            if (l.get(i) == s.get(j)) {
                i++;
                j++;
                k++;
            } else {
                i++;
                j = 0;
                k = 0;
            }
        }
        return k == slsize;
    }

    
    public static boolean isSublist_Problem_2_8174225c_c6ff_40fb_a133_2fb722320839(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() > s.size()) return False;
        for(int i = 0; i < l.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_0_7401dd33_967a_4531_a5a9_a2308e35595f(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_2_b3c46029_748c_4bf6_ba3e_9ca47c308ec2(ArrayList<Integer> l, ArrayList<Integer> s) {
        ArrayList<Integer> l1 = new ArrayList<Integer>(l);
        ArrayList<Integer> s1 = new ArrayList<Integer>(s);
        Collections.sort(l1);
        Collections.sort(s1);
        if (l1.equals(s1)) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isSublist_Problem_0_98f9505e_d7c2_4471_b029_bfd0f916a426(ArrayList<Integer> l, ArrayList<Integer> s) {
        ArrayList<Integer> l1 = new ArrayList<>(l);
        ArrayList<Integer> s1 = new ArrayList<>(s);
        ArrayList<Integer> l2 = new ArrayList<>();
        ArrayList<Integer> s2 = new ArrayList<>();
        for(int i = 0; i < l1.size(); i++) {
            l2.add(l1.get(i));
        }
        for(int i = 0; i < s1.size(); i++) {
            s2.add(s1.get(i));
        }
        for(int i = 0; i < l2.size(); i++) {
            if(!s2.contains(l2.get(i))) {
                return False;
            }
        }
        return True;
    }

    
    public static boolean isSublist_Problem_1_0dd96788_8ef2_45ab_bf10_093fa529a015(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i <= l.size() - s.size(); i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean found = True;
                for (int j = 1; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        found = False;
                        break;
                    }
                }
                if (found) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_1_29f636b7_ccc7_446e_a799_6b1c9a12e827(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (l.size() < s.size())
            return False;
        for(int i=0; i<s.size(); i++) {
            if (!l.contains(s.get(i)))
                return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_2_19928bb6_4c5f_4dc0_a95c_ccd2886214c6(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < l.size() && j < s.size()) {
            if (l.get(i) == s.get(j)) {
                i++;
                j++;
                k++;
            } else if (l.get(i) < s.get(j)) {
                i++;
            } else {
                j++;
            }
        }
        return k == s.size();
    }

    
    public static boolean isSublist_Problem_2_98c85056_81ce_4b14_af8c_c40fb0bc35e5(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (l.size() < s.size()) {
            return False;
        }
        for (int i = 0; i < s.size(); i++) {
            if (l.get(i) != s.get(i)) {
                return False;
            }
        }
        return True;
    }

    
    public static boolean isSublist_Problem_2_769acbf6_150c_4f43_aa96_589a78aeadcc(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_2_cafdebf9_4980_490a_8362_e70f1809e776(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i < l.size() - s.size() + 1; i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean isSublist_Problem_2_cafdebf9_4980_490a_8362_e70f1809e776 = True;
                for (int j = 1; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        isSublist_Problem_2_cafdebf9_4980_490a_8362_e70f1809e776 = False;
                        break;
                    }
                }
                if (isSublist_Problem_2_cafdebf9_4980_490a_8362_e70f1809e776) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_0_4e981614_7eff_4b04_81ba_71594b054798(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (l.size() < s.size()) return False;
        for (int i = 0; i < s.size(); i++) {
            if (l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_0_ae3aafeb_44fb_4bd1_9f49_bcd1bfe30772(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_2_a2c23fff_0803_49a7_9067_5a0ea2bc4884(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0, j = 0;
        while (i < l.size() && j < s.size()) {
            if (l.get(i) == s.get(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        return i == l.size() && j == s.size();
    }

    
    public static boolean isSublist_Problem_1_00c730ab_60b0_4cab_b479_e03d8861e245(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_1_fbbd428b_f7d6_4fd1_9596_3f0fad28ccd2(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(s.get(i) > l.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_0_b3c919f0_b9b2_487c_a151_0cf4d0111940(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) return False;
        for (int i = 0; i < l.size() - s.size() + 1; i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean found = True;
                for (int j = 0; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        found = False;
                        break;
                    }
                }
                if (found) return True;
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_1_161c2dd9_3a8c_40d9_b650_bd92ece17c3f(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_0_bdb23632_be1b_4dba_962c_78931071dd3f(ArrayList<Integer> l, ArrayList<Integer> s) {
        boolean flag = False;
        for (int i = 0; i < l.size(); i++) {
            flag = flag || l.get(i).equals(s.get(i));
        }
        return flag;
    }

    
    public static boolean isSublist_Problem_0_43c30c23_592f_42b6_9816_a72b7112354f(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_0_dd74becb_8c2e_497a_80c0_92747524d002(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i < l.size() - s.size() + 1; i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean found = True;
                for (int j = 1; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        found = False;
                        break;
                    }
                }
                if (found) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_0_035a859e_8d56_4486_87b4_d47b4b12b7d5(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (l.size() < s.size()) return False;
        for (int i = 0; i < s.size(); i++) {
            if (l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_0_ba075ef2_5597_4ffc_a5aa_343f9df0682a(ArrayList<Integer> l, ArrayList<Integer> s) {
        ArrayList<Integer> sublist = new ArrayList<>();
        for(Integer i : l) {
            for(Integer j : s) {
                if(i == j) {
                    sublist.add(i);
                }
            }
        }
        return sublist.equals(s);
    }

    
    public static boolean isSublist_Problem_2_98072898_12a6_4776_8d9d_b2a0015e61c7(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() > s.size()) return False;
        for(int i = 0; i < l.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_2_1a072364_e6db_4ca9_8ad4_84f59ce3a051(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (l.size() < s.size()) {
            return False;
        }
        for (int i = 0; i < l.size() - s.size() + 1; i++) {
            if (l.subList(i, i + s.size()).equals(s)) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_1_62ecd39b_07f7_4daa_892d_6a43b92953b3(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_0_1b625091_0042_40f3_8977_6d5f5c41f63c(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (l.size() < s.size()) {
            return False;
        }
        for (int i = 0; i < l.size() - s.size() + 1; i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean found = True;
                for (int j = 0; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        found = False;
                        break;
                    }
                }
                if (found) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_1_e47f869c_fbb3_4b92_9302_e83631efc288(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() > s.size()) return False;
        for(int i = 0; i < l.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_0_4d1c77e7_71c5_4434_a806_93f4a7a39346(ArrayList<Integer> l, ArrayList<Integer> s) {
        
        //return ((ArrayList<Integer>) l).containsAll(s);
        return l.containsAll(s);
    }

    
    public static boolean isSublist_Problem_0_39d8cdb7_0b53_4aea_8520_e483726d3200(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0;
        int j = 0;
        boolean flag = False;
        if (s.isEmpty()) {
            return True;
        }
        if (l.isEmpty()) {
            return False;
        }
        if (s.equals(l)) {
            return True;
        }
        for (; i < l.size(); i++) {
            if (s.equals(l.get(i))) {
                flag = True;
            } else {
                flag = False;
                break;
            }
        }
        if (flag) {
            System.out.println("Sublist found");
        } else {
            System.out.println("Sublist not found.");
        }
        return False;
    }

    
    public static boolean isSublist_Problem_1_2a41d708_d094_4792_aa8d_5cb9daa41e63(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) return False;
        for (int i = 0; i < l.size() - s.size() + 1; i++) {
            boolean isSub = True;
            for (int j = 0; j < s.size(); j++) {
                if (l.get(i + j) != s.get(j)) {
                    isSub = False;
                    break;
                }
            }
            if (isSub) return True;
        }
        return False;
    }

    
    public static boolean isSublist_Problem_1_7e2fe111_cbfc_4065_be2d_b672f67c20c6(ArrayList<Integer> l, ArrayList<Integer> s) {
        ArrayList<Integer> ll = new ArrayList<Integer>(l);
        ArrayList<Integer> sl = new ArrayList<Integer>(s);
        return ll.containsAll(sl);
    }

    
    public static boolean isSublist_Problem_1_4e981614_7eff_4b04_81ba_71594b054798(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (l.size() < s.size()) return False;
        for (int i = 0; i < s.size(); i++) {
            if (l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_0_41131089_d74d_41b2_b695_706990cc0f28(ArrayList<Integer> l, ArrayList<Integer> s) {
        ArrayList<Integer> temp = new ArrayList<>();
        for(Integer i : l) {
            if(!temp.contains(i)) {
                temp.add(i);
            }
        }
        for(Integer i : s) {
            if(!temp.contains(i)) {
                return False;
            }
        }
        return True;
    }

    
    public static boolean isSublist_Problem_1_cd7f35a7_e401_406d_aea3_a9a67761906f(ArrayList<Integer> l, ArrayList<Integer> s) {
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> s1 = new ArrayList<>();
        for(Integer i : l) {
            l1.add(i);
        }
        for(Integer i : s) {
            s1.add(i);
        }
        if(l1.equals(s1)) {
            return True;
        }
        return False;
    }

    
    public static boolean isSublist_Problem_0_ab0d6d35_16eb_470a_a87b_dd31f186133c(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_0_d51cfe8d_a2aa_4c64_998c_5ddadb4f72d3(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i < l.size() - s.size() + 1; i++) {
            if (l.get(i).equals(s.get(0))) {
                int j = 0;
                for (; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        break;
                    }
                }
                if (j == s.size()) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_0_de3e81df_d345_4bf5_b6e5_dc94ae43d843(ArrayList<Integer> l, ArrayList<Integer> s) {
        ArrayList<Integer> l1 = new ArrayList<>(l);
        ArrayList<Integer> s1 = new ArrayList<>(s);
        ArrayList<Integer> l2 = new ArrayList<>();
        ArrayList<Integer> s2 = new ArrayList<>();
        for(int i=0; i<l1.size(); i++) {
            l2.add(l1.get(i));
        }
        for(int i=0; i<s1.size(); i++) {
            s2.add(s1.get(i));
        }
        for(int i=0; i<l2.size(); i++) {
            if(s2.contains(l2.get(i))) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_0_18b9fbef_44e6_4c8f_bc96_c5293a7c1762(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_0_a8aa4b1b_0196_4509_bf2a_9be1ee72e4dc(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i <= l.size() - s.size(); i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean isSublist_Problem_0_a8aa4b1b_0196_4509_bf2a_9be1ee72e4dc = True;
                for (int j = 0; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        isSublist_Problem_0_a8aa4b1b_0196_4509_bf2a_9be1ee72e4dc = False;
                        break;
                    }
                }
                if (isSublist_Problem_0_a8aa4b1b_0196_4509_bf2a_9be1ee72e4dc) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_0_ae3aafeb_44fb_4bd1_9f49_bcd1bfe30772(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_0_5ea2ab97_970d_47fa_b366_466a71a9552a(ArrayList<Integer> l, ArrayList<Integer> s) {
        return l.equals(s);
    }

    
    public static boolean isSublist_Problem_1_f6d643af_0e52_475d_a038_8900d870eeb8(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0;
        int j = 0;
        while (i < l.size() && j < s.size()) {
            if (l.get(i) == s.get(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        return i == l.size() && j == s.size();
    }

    
    public static boolean isSublist_Problem_2_6da25625_0ad0_4d1a_89e1_a6bbac463f19(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0;
        int j = 0;
        while (i < l.size() && j < s.size()) {
            if (l.get(i) == s.get(j)) {
                i++;
                j++;
            } else {
                j++;
            }
        }
        return i == l.size();
    }

    
    public static boolean isSublist_Problem_2_e6b6a92e_f2ae_490a_a7d3_73d70c1185e2(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) return False;
        for (int i = 0; i < l.size() - s.size() + 1; i++) {
            if (l.get(i).equals(s.get(0))) {
                int j = 0;
                for (j = 0; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) break;
                }
                if (j == s.size()) return True;
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_1_d3a361f6_65ec_40d4_9602_1fca67aadd11(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i < l.size() - s.size() + 1; i++) {
            boolean isSublist_Problem_1_d3a361f6_65ec_40d4_9602_1fca67aadd11 = True;
            for (int j = 0; j < s.size(); j++) {
                if (l.get(i + j) != s.get(j)) {
                    isSublist_Problem_1_d3a361f6_65ec_40d4_9602_1fca67aadd11 = False;
                    break;
                }
            }
            if (isSublist_Problem_1_d3a361f6_65ec_40d4_9602_1fca67aadd11) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_2_831316a9_f9de_44cd_bd1e_cbb239a688b1(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (l.size() < s.size()) return False;
        for (int i = 0; i < l.size() - s.size() + 1; i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean found = True;
                for (int j = 0; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        found = False;
                        break;
                    }
                }
                if (found) return True;
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_2_23f895e8_ed35_464a_bf99_5bbcf0850dd7(ArrayList<Integer> l, ArrayList<Integer> s) {
        boolean flag = False;
        ArrayList<Integer> result = new ArrayList<>();
        for(int i : l) {
            if(!s.contains(i))
                return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_1_ec24452c_8f9f_4bb2_ac2d_5d26afc787ee(ArrayList<Integer> l, ArrayList<Integer> s) {
        // write your code here
        ArrayList<Integer> ss = new ArrayList<Integer>();
        for(Integer i : s)
            ss.add(i);
        for(int i=0;i<l.size();i++)
            if(!ss.contains(l.get(i)))
                return False;
        return True;
    }

    
    public static boolean isSublist_Problem_0_df5837ca_c77b_4dd6_959f_661fea556f0b(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        int i = 0;
        for(Integer e : s) {
            if(l.get(i) != e) return False;
            i++;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_2_92fc83ab_9be0_4a80_b6f0_6508fbf4befd(ArrayList<Integer> l, ArrayList<Integer> s) {
        ArrayList<Integer> sublist = new ArrayList<Integer>();
        for(int i = 0; i < l.size(); i++) {
            for(int j = 0; j < s.size(); j++) {
                if(l.get(i) == s.get(j)) {
                    sublist.add(l.get(i));
                }
            }
        }
        return sublist.equals(s);
    }

    
    public static boolean isSublist_Problem_0_53f19d07_9787_4c88_9da8_e602bd1ef377(ArrayList<Integer> l, ArrayList<Integer> s) {
        ArrayList<Integer> sublist = new ArrayList<>();
        for(Integer i : s) {
            for(Integer j : l) {
                if(j.equals(i)) {
                    sublist.add(j);
                }
            }
        }
        return sublist.size() == s.size();
    }

    
    public static boolean isSublist_Problem_1_49bc148a_631d_4f73_8b30_519cda67c1b3(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        int i = 0;
        int j = 0;
        while (i < l.size() && j < s.size()) {
            if (l.get(i).equals(s.get(j))) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        return j == s.size();
    }

    
    public static boolean isSublist_Problem_1_8dfd6e57_503b_4668_803c_aa5dc61f4c0a(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_0_893d5ecf_3402_4556_8ad3_3e1a6ec76325(ArrayList<Integer> l, ArrayList<Integer> s) {
        ArrayList<Integer> sublist = new ArrayList<>();
        for(Integer i : l) {
            for(Integer j : s) {
                if(i.equals(j)) {
                    sublist.add(i);
                    break;
                }
            }
        }
        return sublist.equals(s);
    }

    
    public static boolean isSublist_Problem_0_0e0b028a_bc6d_4535_a417_eca332ac7d67(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_2_27e263d5_a51f_421a_8988_5591b31198f2(ArrayList<Integer> l, ArrayList<Integer> s) {
        int n = l.size();
        int m = s.size();
        for (int i = 0; i <= n - m; i++) {
            int j;
            for (j = 0; j < m; j++) {
                if (l.get(i + j) != s.get(j)) {
                    break;
                }
            }
            if (j == m) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_1_97ef5ba2_072d_44ab_a057_33cc97a7fd19(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i <= l.size() - s.size(); i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean isSublist_Problem_1_97ef5ba2_072d_44ab_a057_33cc97a7fd19 = True;
                for (int j = 0; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        isSublist_Problem_1_97ef5ba2_072d_44ab_a057_33cc97a7fd19 = False;
                        break;
                    }
                }
                if (isSublist_Problem_1_97ef5ba2_072d_44ab_a057_33cc97a7fd19) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_0_0e8b6fc2_3e87_476c_9a32_c734044ac125(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i <= l.size() - s.size(); i++) {
            if (l.subList(i, i + s.size()).equals(s)) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_1_89601132_d6f3_4ce1_9c73_7869ab953205(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() > s.size()) return False;
        for(int i = 0; i < l.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_0_bb7a2d9f_78d1_4e13_81c3_6ed6b068357c(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i < l.size() - s.size() + 1; i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean isSublist_Problem_0_bb7a2d9f_78d1_4e13_81c3_6ed6b068357c = True;
                for (int j = 0; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        isSublist_Problem_0_bb7a2d9f_78d1_4e13_81c3_6ed6b068357c = False;
                        break;
                    }
                }
                if (isSublist_Problem_0_bb7a2d9f_78d1_4e13_81c3_6ed6b068357c) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_0_f4cd7697_ff1d_441f_ae7f_b0438eb6e946(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i,j;
        for(i=0;i<l.size();i++){
            for(j=0;j<s.size();j++){
                if(l.get(i)==s.get(j)){
                    break;
                }
            }
            if(j==s.size())
                return True;
        }
        return False;
    }

    
    public static boolean isSublist_Problem_0_f203bf51_ce56_4b6a_947f_2fa04ae9fa43(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i <= l.size() - s.size(); i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean isSublist_Problem_0_f203bf51_ce56_4b6a_947f_2fa04ae9fa43 = True;
                for (int j = 0; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        isSublist_Problem_0_f203bf51_ce56_4b6a_947f_2fa04ae9fa43 = False;
                        break;
                    }
                }
                if (isSublist_Problem_0_f203bf51_ce56_4b6a_947f_2fa04ae9fa43) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_0_3b54570c_a60d_4527_b9d3_ba1ebaebb85b(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0, j = 0;
        while (i < l.size() && j < s.size()) {
            if (l.get(i) == s.get(j)) {
                i++;
                j++;
            } else {
                j = 0;
            }
        }
        return i == l.size();
    }

    
    public static boolean isSublist_Problem_0_2b4037db_529a_4af9_a82f_81d2d0759d94(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i < l.size(); i++) {
            if (l.get(i) == s.get(0)) {
                int j = 0;
                for (j = 0; j < s.size(); j++) {
                    if (l.get(i + j) != s.get(j)) {
                        break;
                    }
                }
                if (j == s.size()) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_1_237a8f7f_ff10_4753_92ad_34b9f03db68a(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_0_39d8cdb7_0b53_4aea_8520_e483726d3200(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0;
        int j = 0;
        boolean flag = False;
        if (s.isEmpty()) {
            return True;
        }
        if (l.isEmpty()) {
            return False;
        }
        if (s.equals(l)) {
            return True;
        }
        for (; i < l.size(); i++) {
            if (s.equals(l.get(i))) {
                flag = True;
            } else {
                flag = False;
                break;
            }
        }
        if (flag) {
            System.out.println("Sublist found");
        } else {
            System.out.println("Sublist not found.");
        }
        return False;
    }

    
    public static boolean isSublist_Problem_0_5ea2ab97_970d_47fa_b366_466a71a9552a(ArrayList<Integer> l, ArrayList<Integer> s) {
        return l.equals(s);
    }

    
    public static boolean isSublist_Problem_0_a93d600f_5eb0_420c_97dc_facace1df003(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i <= l.size() - s.size(); i++) {
            if (l.subList(i, i + s.size()).equals(s)) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_0_e5966a00_4148_4d30_bb74_ed44c6d73076(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i < l.size() - s.size() + 1; i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean found = True;
                for (int j = 0; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        found = False;
                        break;
                    }
                }
                if (found) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_2_f9064bdb_0afb_4ba3_bb06_7a37d4b076c9(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0;
        int j = 0;
        while (i < l.size() && j < s.size()) {
            if (l.get(i) == s.get(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        return i == l.size() && j == s.size();
    }

    
    public static boolean isSublist_Problem_0_aaa75101_fbec_4e18_bb3d_1f7e181acb34(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i <= l.size() - s.size(); i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean isSublist_Problem_0_aaa75101_fbec_4e18_bb3d_1f7e181acb34 = True;
                for (int j = 0; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        isSublist_Problem_0_aaa75101_fbec_4e18_bb3d_1f7e181acb34 = False;
                        break;
                    }
                }
                if (isSublist_Problem_0_aaa75101_fbec_4e18_bb3d_1f7e181acb34) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_1_ce29be5d_d3a1_4885_a668_ad13d57c6581(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i <= l.size() - s.size(); i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean isSublist_Problem_1_ce29be5d_d3a1_4885_a668_ad13d57c6581 = True;
                for (int j = 0; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        isSublist_Problem_1_ce29be5d_d3a1_4885_a668_ad13d57c6581 = False;
                        break;
                    }
                }
                if (isSublist_Problem_1_ce29be5d_d3a1_4885_a668_ad13d57c6581) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_2_0b8158bf_4337_4448_ac3a_3a609c5b23c2(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_0_028e88fd_2542_4a50_82e9_9fcc78734c5b(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_2_19928bb6_4c5f_4dc0_a95c_ccd2886214c6(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < l.size() && j < s.size()) {
            if (l.get(i) == s.get(j)) {
                i++;
                j++;
                k++;
            } else if (l.get(i) < s.get(j)) {
                i++;
            } else {
                j++;
            }
        }
        return k == s.size();
    }

    
    public static boolean isSublist_Problem_1_4d1c77e7_71c5_4434_a806_93f4a7a39346(ArrayList<Integer> l, ArrayList<Integer> s) {
        
        //return ((ArrayList<Integer>) l).containsAll(s);
        return l.containsAll(s);
    }

    
    public static boolean isSublist_Problem_0_2149fd93_bf90_4212_ba4a_fca2e5d74782(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i <= l.size() - s.size(); i++) {
            if (l.subList(i, i + s.size()).equals(s)) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_0_e6b6a92e_f2ae_490a_a7d3_73d70c1185e2(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) return False;
        for (int i = 0; i < l.size() - s.size() + 1; i++) {
            if (l.get(i).equals(s.get(0))) {
                int j = 0;
                for (j = 0; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) break;
                }
                if (j == s.size()) return True;
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_1_719ecc00_1a96_40c6_b39e_67d867b02dd9(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() > s.size()) return False;
        for(int i = 0; i < l.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_2_15776ef8_f750_406b_81a6_b7e4bb21b6db(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_2_a2b2a12d_6033_4070_ba5e_337b033cd888(ArrayList<Integer> l, ArrayList<Integer> s) {
        return l.size() == s.size() && l.containsAll(s);
    }

    
    public static boolean isSublist_Problem_0_a2c23fff_0803_49a7_9067_5a0ea2bc4884(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0, j = 0;
        while (i < l.size() && j < s.size()) {
            if (l.get(i) == s.get(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        return i == l.size() && j == s.size();
    }

    
    public static boolean isSublist_Problem_0_5475b620_a7f4_47e4_9351_c32a151d61f0(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_1_84ab34bc_92ac_4c34_b6e6_8c56b40a7a4c(ArrayList<Integer> l, ArrayList<Integer> s) {
        boolean flag = False;
        if (s.isEmpty()) {
            return flag;
        }
        for (int i = 0; i < l.size() - s.size(); i++) {
            if (l.subList(i, i + s.size()).equals(s)) {
                flag = True;
            }
        }
        return flag;
    }

    
    public static boolean isSublist_Problem_1_299b2236_6045_4af1_9b26_49e07c15ff7d(ArrayList<Integer> l, ArrayList<Integer> s) {
        ArrayList<Integer> a = new ArrayList<>(l);
        ArrayList<Integer> b = new ArrayList<>(s);
        return a.containsAll(b);
    }

    
    public static boolean isSublist_Problem_0_0d33a3a1_2d79_4123_8619_1b24112fc357(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_1_5bde70ec_766f_4ceb_8919_a2ba350aba51(ArrayList<Integer> l, ArrayList<Integer> s) {
        ArrayList<Integer> l1 = new ArrayList<>(l);
        ArrayList<Integer> s1 = new ArrayList<>(s);
        ArrayList<Integer> l2 = new ArrayList<>();
        ArrayList<Integer> s2 = new ArrayList<>();
        for(int i = 0; i < l1.size(); i++) {
            l2.add(l1.get(i));
        }
        for(int i = 0; i < s1.size(); i++) {
            s2.add(s1.get(i));
        }
        for(int i = 0; i < l2.size(); i++) {
            if(!s2.contains(l2.get(i))) {
                return False;
            }
        }
        return True;
    }

    
    public static boolean isSublist_Problem_0_98ca632b_6721_4f2f_9645_22d1d0c4e79f(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) return False;
        for (int i = 0; i < l.size(); i++) {
            if (l.get(i) == s.get(0)) {
                boolean found = True;
                for (int j = 0; j < s.size(); j++) {
                    if (i + j >= l.size() || l.get(i + j) != s.get(j)) {
                        found = False;
                        break;
                    }
                }
                if (found) return True;
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_0_15deca29_d197_4f6d_9e1e_302045b71c78(ArrayList<Integer> l, ArrayList<Integer> s) {
        ArrayList<Integer> l2 = new ArrayList<>();
        l2.addAll(l);
        ArrayList<Integer> s2 = new ArrayList<>();
        s2.addAll(s);
        Collections.sort(l);
        Collections.sort(s);
        int l_size = l.size();
        int s_size = s.size();
        int m_size = Math.max(l_size, s_size);
        for (int i = 0; i < m_size; i++) {
            if (i < l_size && i < s_size) {
                l2.add(l.get(i));
                s2.add(s.get(i));
            } else if (i == l_size) {
                l2.add(s.get(i));
            } else if (i == s_size) {
                l2.add(l.get(i));
            } else if (i < l_size && i < s_size && i == l_size || i < l_size && i == s_size) {
                l2.add(l.get(i));
                s2.add(l.get(i));
            } else if (i > l_size && i < s_size) {
                l2.add(s.get(i));
                s2.add(l.get(i));
            } else if (i > l_size && i > s_size && i == s_size) {
                l2.add(s.get(i));
                s2.add(s.get(i));
            } else {
                l2.add(l.get(i));
                s2.add(s.get(i));
            }
        }
        l2.removeAll(l2);
        s2.removeAll(s2);
        return l2.isEmpty() && s2.isEmpty();
    }

    
    public static boolean isSublist_Problem_0_11df5940_1ab5_4c59_addd_6fcd3a03197a(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0;
        int j = 0;
        while (i < l.size() && j < s.size()) {
            if (l.get(i) == s.get(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        return (i == l.size() && j == s.size());
    }

    
    public static boolean isSublist_Problem_1_c49623fb_020f_435c_93af_f4f4e81fd756(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i <= l.size() - s.size(); i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean isSublist_Problem_1_c49623fb_020f_435c_93af_f4f4e81fd756 = True;
                for (int j = 0; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        isSublist_Problem_1_c49623fb_020f_435c_93af_f4f4e81fd756 = False;
                        break;
                    }
                }
                if (isSublist_Problem_1_c49623fb_020f_435c_93af_f4f4e81fd756) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_2_484f2b08_1d39_4434_8e0a_b79e60ef80a9(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (l.size() < s.size()) {
            return False;
        }
        for (int i = 0; i <= l.size() - s.size(); i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean isSublist_Problem_2_484f2b08_1d39_4434_8e0a_b79e60ef80a9 = True;
                for (int j = 0; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        isSublist_Problem_2_484f2b08_1d39_4434_8e0a_b79e60ef80a9 = False;
                        break;
                    }
                }
                if (isSublist_Problem_2_484f2b08_1d39_4434_8e0a_b79e60ef80a9) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_1_13c67539_1904_4bfd_b0da_39bed3e28435(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0;
        int j = 0;
        int k = 0;
        while(i < l.size() && j < s.size()) {
            if(l.get(i) == s.get(j)) {
                i++;
                j++;
                k++;
            }
            else if(l.get(i) > s.get(j)) {
                j++;
            }
            else {
                i++;
            }
        }
        return k == s.size();
    }

    
    public static boolean isSublist_Problem_1_1b6d5d47_a3c9_4406_a7c6_c2f6a207f1d1(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (l.size() < s.size()) return False;
        for (int i = 0; i < s.size(); i++) {
            if (l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_1_e5d05d03_976f_4c60_b436_e4c38871f04b(ArrayList<Integer> l, ArrayList<Integer> s) {
        // TODO Auto-generated method stub
        return l.equals(s);
    }

    
    public static boolean isSublist_Problem_0_f2e7bf14_fe39_4186_a77b_0fc32393fd8b(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i <= l.size() - s.size(); i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean isSublist_Problem_0_f2e7bf14_fe39_4186_a77b_0fc32393fd8b = True;
                for (int j = 0; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        isSublist_Problem_0_f2e7bf14_fe39_4186_a77b_0fc32393fd8b = False;
                        break;
                    }
                }
                if (isSublist_Problem_0_f2e7bf14_fe39_4186_a77b_0fc32393fd8b) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_1_cc2607df_ea6e_4849_83b9_d111973beb07(ArrayList<Integer> l, ArrayList<Integer> s) {
        // Write your code here
        return l.equals(s);
    }

    
    public static boolean isSublist_Problem_0_b6dc4093_d518_48d6_8c61_6870f50c298c(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_2_8d41e7c9_22ea_41e9_b164_13adee9b0d88(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_1_98072898_12a6_4776_8d9d_b2a0015e61c7(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() > s.size()) return False;
        for(int i = 0; i < l.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_1_00c730ab_60b0_4cab_b479_e03d8861e245(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_2_b8b8d04e_884a_4f3e_a8f2_02177b115330(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_0_4d1c77e7_71c5_4434_a806_93f4a7a39346(ArrayList<Integer> l, ArrayList<Integer> s) {
        
        //return ((ArrayList<Integer>) l).containsAll(s);
        return l.containsAll(s);
    }

    
    public static boolean isSublist_Problem_2_6d0eb92e_4b42_461b_af1b_5004a11c74e8(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() != s.size()) return False;
        
        ArrayList<Integer> l1 = new ArrayList<Integer>(l);
        for(int i = 0; i < s.size(); i++) {
            l1.remove(s.get(i));
        }
        
        boolean check = True;
        if(l.equals(l1)) {
            check = False;
        }
        return check;
    }

    
    public static boolean isSublist_Problem_2_4a83d61d_48e6_4357_88f0_03a4b265096e(ArrayList<Integer> l, ArrayList<Integer> s) {
        return l.containsAll(s);
    }

    
    public static boolean isSublist_Problem_0_97ef5ba2_072d_44ab_a057_33cc97a7fd19(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i <= l.size() - s.size(); i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean isSublist_Problem_0_97ef5ba2_072d_44ab_a057_33cc97a7fd19 = True;
                for (int j = 0; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        isSublist_Problem_0_97ef5ba2_072d_44ab_a057_33cc97a7fd19 = False;
                        break;
                    }
                }
                if (isSublist_Problem_0_97ef5ba2_072d_44ab_a057_33cc97a7fd19) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_0_29f636b7_ccc7_446e_a799_6b1c9a12e827(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (l.size() < s.size())
            return False;
        for(int i=0; i<s.size(); i++) {
            if (!l.contains(s.get(i)))
                return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_0_c969f04b_9b86_42c9_910e_2a6a84c684c6(ArrayList<Integer> l, ArrayList<Integer> s) {
        ArrayList<Integer> tempList = new ArrayList<Integer>();
        for(int i=0; i<l.size(); i++) {
            tempList.add(l.get(i));
        }
        for(int i=0; i<s.size(); i++) {
            tempList.add(s.get(i));
        }
        return tempList.stream().allMatch(l::contains);
    }

    
    public static boolean isSublist_Problem_2_8018e0d5_9009_404c_89cb_3f7550d4ddb4(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0;
        int j = 0;
        while(i < l.size() && j < s.size()) {
            if(l.get(i) == s.get(j)) {
                i++;
                j++;
            } else {
                i = i + j;
                j = 0;
            }
        }
        return i == l.size();
    }

    
    public static boolean isSublist_Problem_0_1791d202_f836_41c3_88fb_4261837a0045(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i <= l.size() - s.size(); i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean found = True;
                for (int j = 0; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        found = False;
                        break;
                    }
                }
                if (found) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_1_60617548_c878_4930_b296_986971ac41eb(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0;
        int j = 0;
        int k = 0;
        int l_size = l.size();
        int s_size = s.size();
        while (i < l_size && j < s_size) {
            if (l.get(i) == s.get(j)) {
                i++;
                j++;
                k++;
            } else if (l.get(i) < s.get(j)) {
                i++;
            } else {
                j++;
            }
        }
        return k == s_size;
    }

    
    public static boolean isSublist_Problem_1_5bfc1975_d66b_4e70_aefd_9f880e53d47f(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0;
        int j = 0;
        while (i < l.size() && j < s.size()) {
            if (l.get(i) == s.get(j)) {
                i++;
                j++;
            } else {
                j = 0;
            }
        }
        return i == l.size();
    }

    
    public static boolean isSublist_Problem_1_4a4fbe25_b471_4734_a5a3_efcfd2af14bb(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0;
        int j = 0;
        while(i < l.size() && j < s.size()) {
            if(l.get(i) == s.get(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        return i == l.size() && j == s.size();
    }

    
    public static boolean isSublist_Problem_1_a012c966_f4bd_4a32_9a91_d479c763eac1(ArrayList<Integer> l, ArrayList<Integer> s) {
        // Write your code here
        return s.containsAll(l);
    }

    
    public static boolean isSublist_Problem_1_caafa263_3af7_4dc8_9152_712fb52cdf8b(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(s.get(i) != l.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_1_1b625091_0042_40f3_8977_6d5f5c41f63c(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (l.size() < s.size()) {
            return False;
        }
        for (int i = 0; i < l.size() - s.size() + 1; i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean found = True;
                for (int j = 0; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        found = False;
                        break;
                    }
                }
                if (found) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_1_faf380bd_f094_4060_8058_a50851febda2(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0, j = 0;
        while(i < l.size() && j < s.size()) {
            if(l.get(i) == s.get(j)) {
                i++;
                j++;
            } else {
                j = 0;
            }
        }
        return i == l.size() && j == s.size();
    }

    
    public static boolean isSublist_Problem_2_9d5b61d8_f29c_4168_9ff3_1bf54bbcbcc5(ArrayList<Integer> l, ArrayList<Integer> s) {
        int n = l.size();
        int m = s.size();
        if (m > n) {
            return False;
        }
        for (int i = 0; i <= n - m; i++) {
            int j;
            for (j = 0; j < m; j++) {
                if (l.get(i + j) != s.get(j)) {
                    break;
                }
            }
            if (j == m) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_1_2938fda2_ade7_4f89_b86a_d777d4fbeb96(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (l.size() < s.size()) return False;
        for (int i = 0; i < s.size(); i++) {
            if (l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_2_e59b0aae_91fe_4836_9e60_b8c129f41d8a(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i < l.size() - s.size() + 1; i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean isSublist_Problem_2_e59b0aae_91fe_4836_9e60_b8c129f41d8a = True;
                for (int j = 0; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        isSublist_Problem_2_e59b0aae_91fe_4836_9e60_b8c129f41d8a = False;
                        break;
                    }
                }
                if (isSublist_Problem_2_e59b0aae_91fe_4836_9e60_b8c129f41d8a) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_1_49bc148a_631d_4f73_8b30_519cda67c1b3(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        int i = 0;
        int j = 0;
        while (i < l.size() && j < s.size()) {
            if (l.get(i).equals(s.get(j))) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        return j == s.size();
    }

    
    public static boolean isSublist_Problem_2_3dc7382a_105a_4343_bf4e_05b21288be98(ArrayList<Integer> l, ArrayList<Integer> s) {
        ArrayList<Integer> sublist = new ArrayList<>();
        for(Integer i : s) {
            for(Integer j : l) {
                if(i.equals(j)) {
                    sublist.add(i);
                }
            }
        }
        return sublist.equals(s);
    }

    
    public static boolean isSublist_Problem_0_d4dca47d_cb84_499c_a452_6f038e08091f(ArrayList<Integer> l, ArrayList<Integer> s) {
        // Create a boolean array to store the result.
        boolean[] result = new boolean[l.size()];
        int i = 0;
        for (Integer num : l) {
            if (s.contains(num)) {
                result[i] = True;
                i++;
            }
        }
        return Arrays.asList(result).contains(True);
    }

    
    public static boolean isSublist_Problem_1_07d3ed14_62c5_47ab_8145_f4d0aa0bcd42(ArrayList<Integer> l, ArrayList<Integer> s) {
        //write your code here
        //return True if s is a sublist of l and False if not.
        for(int i=0; i< l.size();i++) {
            if(s.contains(l.get(i))) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_2_984d5cb9_605f_445f_b5a5_74afcbff58e5(ArrayList<Integer> l, ArrayList<Integer> s) {
        boolean b = False;
        for (Integer aInteger : l) {
            if (s.contains(aInteger)) {
                b = True;
            }
        }
        return b;
    }

    
    public static boolean isSublist_Problem_0_8d41e7c9_22ea_41e9_b164_13adee9b0d88(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_1_9d5b61d8_f29c_4168_9ff3_1bf54bbcbcc5(ArrayList<Integer> l, ArrayList<Integer> s) {
        int n = l.size();
        int m = s.size();
        if (m > n) {
            return False;
        }
        for (int i = 0; i <= n - m; i++) {
            int j;
            for (j = 0; j < m; j++) {
                if (l.get(i + j) != s.get(j)) {
                    break;
                }
            }
            if (j == m) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_2_c7275919_2165_404d_9501_d9c859ce79ce(ArrayList<Integer> l, ArrayList<Integer> s) {
        ArrayList<Integer> result = new ArrayList<>();
        for(int i = 0; i < l.size(); i++) {
            Integer li = l.get(i);
            Integer si = s.get(i);
            if(li.compareTo(si) != 0) {
                result.add(li);
                result.add(si);
            }
        }
        return result.contains(l);
    }

    
    public static boolean isSublist_Problem_2_5128dc52_ee0a_485e_9713_4d46b3ee8cd3(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        int i = 0;
        for(Integer e : s) {
            if(i >= l.size()) return False;
            if(l.get(i) != e) return False;
            i++;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_2_f0e08dbd_0ad5_45a7_81da_c589ee90389e(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i < l.size(); i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean isSub = True;
                for (int j = 0; j < s.size(); j++) {
                    if (i + j >= l.size() || !l.get(i + j).equals(s.get(j))) {
                        isSub = False;
                        break;
                    }
                }
                if (isSub) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_0_78c63d39_ea81_4843_8b16_4825d1f7e4fa(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (l.size() < s.size()) return False;
        if (l.size() == s.size()) {
            for (int i = 0; i < l.size(); i++) {
                if (l.get(i) != s.get(i)) return False;
            }
            return True;
        }
        for (int i = 0; i < l.size() - s.size(); i++) {
            boolean found = True;
            for (int j = 0; j < s.size(); j++) {
                if (l.get(i+j) != s.get(j)) {
                    found = False;
                    break;
                }
            }
            if (found) return True;
        }
        return False;
    }

    
    public static boolean isSublist_Problem_2_e99b20ee_8f63_4a23_a7a6_969ac3bce3a2(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (l.size() < s.size()) {
            return False;
        }
        for (int i = 0; i < l.size() - s.size() + 1; i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean isSublist_Problem_2_e99b20ee_8f63_4a23_a7a6_969ac3bce3a2 = True;
                for (int j = 0; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        isSublist_Problem_2_e99b20ee_8f63_4a23_a7a6_969ac3bce3a2 = False;
                        break;
                    }
                }
                if (isSublist_Problem_2_e99b20ee_8f63_4a23_a7a6_969ac3bce3a2) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_2_e25d225a_bc2b_4344_a503_be0e012e2fe9(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_2_9bb8125e_5981_4ed0_9734_a9c22ead0a0c(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (l.size() < s.size()) return False;
        for (int i = 0; i < s.size(); i++) {
            if (l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_0_49d3bf62_daea_4b89_affa_01d83fb3897b(ArrayList<Integer> l, ArrayList<Integer> s) {
        // Write your code here
        try{
            Arrays.asList(s.toArray());
        }catch (Exception e){
            return False;
        }
        try{
            Arrays.asList(l.toArray());
        }catch (Exception e){
            return False;
        }
        return False;
    }

    
    public static boolean isSublist_Problem_2_640321c8_4a6c_42a2_b638_7a19a18ff636(ArrayList<Integer> l, ArrayList<Integer> s) {
        // Write your code here
        for(int i=0;i<l.size();i++)
        {
            if(l.get(i).equals(s.get(i)))
            {
                System.out.println("found");
            }
            else
            {
                System.out.println("not found");
                return False;
            }
        }
        System.out.println("not found");
        return True;
    }

    
    public static boolean isSublist_Problem_1_84382b2e_5e6a_4d76_8542_f61edd750eb9(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_2_904306f2_d67f_48dd_b282_1b9babb49892(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i <= l.size() - s.size(); i++) {
            if (l.get(i).equals(s.get(0))) {
                int j = 0;
                while (j < s.size() && l.get(i + j).equals(s.get(j))) {
                    j++;
                }
                if (j == s.size()) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_0_2d0d6941_9055_451a_8114_09cb579e822f(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) return False;
        for (int i = 0; i <= l.size() - s.size(); i++) {
            if (l.subList(i, i + s.size()).equals(s)) return True;
        }
        return False;
    }

    
    public static boolean isSublist_Problem_2_8dfd6e57_503b_4668_803c_aa5dc61f4c0a(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_1_2b3d7506_98e3_4b68_958d_4cf532023d30(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(s.get(i) != l.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_2_c4c5d37c_b6c8_47c3_a346_5a1ac0198127(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() != s.size()) return False;
        int n = l.size();
        for(int i=0; i<n; i++) {
            for(int j=i+1; j<n; j++) {
                if(l.get(i).equals(s.get(j))) return True;
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_2_19e800a7_cd92_4baf_861e_d7597d433af8(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() == 0) return True;
        if (l.size() == 0) return False;
        if (l.size() < s.size()) return False;
        for (int i = 0; i < l.size() - s.size() + 1; i++) {
            boolean match = True;
            for (int j = 0; j < s.size(); j++) {
                if (l.get(i + j) != s.get(j)) {
                    match = False;
                    break;
                }
            }
            if (match) return True;
        }
        return False;
    }

    
    public static boolean isSublist_Problem_2_97ef5ba2_072d_44ab_a057_33cc97a7fd19(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i <= l.size() - s.size(); i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean isSublist_Problem_2_97ef5ba2_072d_44ab_a057_33cc97a7fd19 = True;
                for (int j = 0; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        isSublist_Problem_2_97ef5ba2_072d_44ab_a057_33cc97a7fd19 = False;
                        break;
                    }
                }
                if (isSublist_Problem_2_97ef5ba2_072d_44ab_a057_33cc97a7fd19) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_2_f55923ea_3112_49a1_a3d0_336f6e2d9b21(ArrayList<Integer> l, ArrayList<Integer> s) {
        boolean result = False;

        for(int i=0;i<l.size();i++) {
            for(int j=0;j<s.size();j++) {
                if(l.get(i) == s.get(j)) {
                    result = True;
                    break;
                }
            }
        }

        return result;
    }

    
    public static boolean isSublist_Problem_2_c4c5d37c_b6c8_47c3_a346_5a1ac0198127(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() != s.size()) return False;
        int n = l.size();
        for(int i=0; i<n; i++) {
            for(int j=i+1; j<n; j++) {
                if(l.get(i).equals(s.get(j))) return True;
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_0_5efb342a_c9d6_4791_9057_0366e49d81ea(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() > s.size()) return False;
        for(int i = 0; i < l.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_2_f0e08dbd_0ad5_45a7_81da_c589ee90389e(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i < l.size(); i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean isSub = True;
                for (int j = 0; j < s.size(); j++) {
                    if (i + j >= l.size() || !l.get(i + j).equals(s.get(j))) {
                        isSub = False;
                        break;
                    }
                }
                if (isSub) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_0_296d3b1f_d231_4768_8044_02e4c6f11266(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (l.size() < s.size()) return False;
        for (int i = 0; i < s.size(); i++) {
            if (l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_0_92fc83ab_9be0_4a80_b6f0_6508fbf4befd(ArrayList<Integer> l, ArrayList<Integer> s) {
        ArrayList<Integer> sublist = new ArrayList<Integer>();
        for(int i = 0; i < l.size(); i++) {
            for(int j = 0; j < s.size(); j++) {
                if(l.get(i) == s.get(j)) {
                    sublist.add(l.get(i));
                }
            }
        }
        return sublist.equals(s);
    }

    
    public static boolean isSublist_Problem_0_2938fda2_ade7_4f89_b86a_d777d4fbeb96(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (l.size() < s.size()) return False;
        for (int i = 0; i < s.size(); i++) {
            if (l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_1_1c273275_0945_4334_8a52_149e439eb20c(ArrayList<Integer> l, ArrayList<Integer> s) {
        // Your code here
        // The idea is to keep a flag indicating whether a particular sub-array is present or not.
        // If flag is set to True, then it means the sub-array is present and hence return True else return False.
        boolean flag = False;

        for(int i=0; i<l.size()-1; i++) {
            for(int j=i+1; j<l.size(); j++) {
                if (s.get(i).equals(l.get(j))) {
                    flag = True;
                }
            }
        }
        return flag;
    }

    
    public static boolean isSublist_Problem_2_fde1641d_00d5_4ee9_8ca2_ac7857cc5d2b(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) return False;
        for (int i = 0; i <= l.size() - s.size(); i++) {
            if (l.subList(i, i + s.size()).equals(s)) return True;
        }
        return False;
    }

    
    public static boolean isSublist_Problem_1_e23fea05_7bed_4d3d_b7c8_289fb7ccbbdc(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) return False;
        for (int i = 0; i < l.size() - s.size() + 1; i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean found = True;
                for (int j = 0; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        found = False;
                        break;
                    }
                }
                if (found) return True;
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_0_e5c1dbcf_c11f_4d45_b187_56ca589505fa(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_2_539e387b_b152_4738_b653_b21395e3299b(ArrayList<Integer> l, ArrayList<Integer> s) {
        return l.equals(s);
    }

    
    public static boolean isSublist_Problem_1_39d8cdb7_0b53_4aea_8520_e483726d3200(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0;
        int j = 0;
        boolean flag = False;
        if (s.isEmpty()) {
            return True;
        }
        if (l.isEmpty()) {
            return False;
        }
        if (s.equals(l)) {
            return True;
        }
        for (; i < l.size(); i++) {
            if (s.equals(l.get(i))) {
                flag = True;
            } else {
                flag = False;
                break;
            }
        }
        if (flag) {
            System.out.println("Sublist found");
        } else {
            System.out.println("Sublist not found.");
        }
        return False;
    }

    
    public static boolean isSublist_Problem_2_8c1d7e15_41d5_4515_bdf2_8c85e0c3412c(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_0_5ea2ab97_970d_47fa_b366_466a71a9552a(ArrayList<Integer> l, ArrayList<Integer> s) {
        return l.equals(s);
    }

    
    public static boolean isSublist_Problem_2_e943792f_b615_45f5_8f5a_d83e79c404b8(ArrayList<Integer> l, ArrayList<Integer> s) {
        ArrayList<Integer> temp = new ArrayList<>();
        for(int i = 0; i < l.size(); i++) {
            for(int j = 0; j < s.size(); j++) {
                if(l.get(i) == s.get(j)) {
                    temp.add(l.get(i));
                }
            }
        }
        return temp.size() == s.size();
    }

    
    public static boolean isSublist_Problem_0_cafdebf9_4980_490a_8362_e70f1809e776(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i < l.size() - s.size() + 1; i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean isSublist_Problem_0_cafdebf9_4980_490a_8362_e70f1809e776 = True;
                for (int j = 1; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        isSublist_Problem_0_cafdebf9_4980_490a_8362_e70f1809e776 = False;
                        break;
                    }
                }
                if (isSublist_Problem_0_cafdebf9_4980_490a_8362_e70f1809e776) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_1_a985b230_1c1b_48b7_9c88_c8c9b374e880(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0;
        int j = 0;
        while (i < l.size() && j < s.size()) {
            if (l.get(i) == s.get(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        return i == l.size() && j == s.size();
    }

    
    public static boolean isSublist_Problem_2_8efd2f0f_5f22_4734_be00_16e55e5326a8(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (l.size() < s.size()) {
            return False;
        }
        boolean result = True;
        for (int i = 0; i < s.size(); i++) {
            result &= (l.get(i) == s.get(i));
        }
        return result;
    }

    
    public static boolean isSublist_Problem_1_ec72a74c_2340_4704_8fc9_5fc5a436073e(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        int i = 0;
        int j = 0;
        while (i < l.size() && j < s.size()) {
            if (l.get(i) == s.get(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        if (j == s.size()) {
            return True;
        }
        return False;
    }

    
    public static boolean isSublist_Problem_1_a985b230_1c1b_48b7_9c88_c8c9b374e880(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0;
        int j = 0;
        while (i < l.size() && j < s.size()) {
            if (l.get(i) == s.get(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        return i == l.size() && j == s.size();
    }

    
    public static boolean isSublist_Problem_1_15deca29_d197_4f6d_9e1e_302045b71c78(ArrayList<Integer> l, ArrayList<Integer> s) {
        ArrayList<Integer> l2 = new ArrayList<>();
        l2.addAll(l);
        ArrayList<Integer> s2 = new ArrayList<>();
        s2.addAll(s);
        Collections.sort(l);
        Collections.sort(s);
        int l_size = l.size();
        int s_size = s.size();
        int m_size = Math.max(l_size, s_size);
        for (int i = 0; i < m_size; i++) {
            if (i < l_size && i < s_size) {
                l2.add(l.get(i));
                s2.add(s.get(i));
            } else if (i == l_size) {
                l2.add(s.get(i));
            } else if (i == s_size) {
                l2.add(l.get(i));
            } else if (i < l_size && i < s_size && i == l_size || i < l_size && i == s_size) {
                l2.add(l.get(i));
                s2.add(l.get(i));
            } else if (i > l_size && i < s_size) {
                l2.add(s.get(i));
                s2.add(l.get(i));
            } else if (i > l_size && i > s_size && i == s_size) {
                l2.add(s.get(i));
                s2.add(s.get(i));
            } else {
                l2.add(l.get(i));
                s2.add(s.get(i));
            }
        }
        l2.removeAll(l2);
        s2.removeAll(s2);
        return l2.isEmpty() && s2.isEmpty();
    }

    
    public static boolean isSublist_Problem_0_7e7109d2_612c_40cb_ad63_558349df89b6(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) return False;
        for (int i = 0; i <= l.size() - s.size(); i++) {
            if (l.subList(i, i + s.size()).equals(s)) return True;
        }
        return False;
    }

    
    public static boolean isSublist_Problem_1_8018e0d5_9009_404c_89cb_3f7550d4ddb4(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0;
        int j = 0;
        while(i < l.size() && j < s.size()) {
            if(l.get(i) == s.get(j)) {
                i++;
                j++;
            } else {
                i = i + j;
                j = 0;
            }
        }
        return i == l.size();
    }

    
    public static boolean isSublist_Problem_1_e977f4f6_98ba_4c8d_a08e_f54f42146c65(ArrayList<Integer> l, ArrayList<Integer> s) {
        ArrayList<Integer> temp = new ArrayList<>();
        for(int i = 0; i < l.size(); i++) {
            for(int j = 0; j < s.size(); j++) {
                if(l.get(i) == s.get(j)) {
                    temp.add(l.get(i));
                }
            }
        }
        return temp.size() == s.size();
    }

    
    public static boolean isSublist_Problem_1_18b9fbef_44e6_4c8f_bc96_c5293a7c1762(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_2_7cf5b57f_7990_4a30_aad7_30ea3e6ef6d1(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) return False;
        for (int i = 0; i < l.size() - s.size() + 1; i++) {
            if (l.subList(i, i + s.size()).equals(s)) return True;
        }
        return False;
    }

    
    public static boolean isSublist_Problem_0_3dc7382a_105a_4343_bf4e_05b21288be98(ArrayList<Integer> l, ArrayList<Integer> s) {
        ArrayList<Integer> sublist = new ArrayList<>();
        for(Integer i : s) {
            for(Integer j : l) {
                if(i.equals(j)) {
                    sublist.add(i);
                }
            }
        }
        return sublist.equals(s);
    }

    
    public static boolean isSublist_Problem_2_98c85056_81ce_4b14_af8c_c40fb0bc35e5(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (l.size() < s.size()) {
            return False;
        }
        for (int i = 0; i < s.size(); i++) {
            if (l.get(i) != s.get(i)) {
                return False;
            }
        }
        return True;
    }

    
    public static boolean isSublist_Problem_0_f4871d77_2a22_43c4_aa36_e14359c4c9ad(ArrayList<Integer> l, ArrayList<Integer> s) {
        
        return False;
    }

    
    public static boolean isSublist_Problem_2_ddd6dfba_3b94_433d_a82f_fbc076a14bc4(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_0_9250528c_815b_4fe8_b5b7_fbdc2026c37c(ArrayList<Integer> l, ArrayList<Integer> s) {
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> s1 = new ArrayList<>();
        for(Integer i : l) {
            l1.add(i);
        }
        for(Integer i : s) {
            s1.add(i);
        }
        boolean result = l1.containsAll(s1);
        return result;
    }

    
    public static boolean isSublist_Problem_0_0dd96788_8ef2_45ab_bf10_093fa529a015(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i <= l.size() - s.size(); i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean found = True;
                for (int j = 1; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        found = False;
                        break;
                    }
                }
                if (found) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_2_69ed85ff_5780_4fd6_9714_f9f28f22bede(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0, j = 0;
        while (i < l.size() && j < s.size()) {
            if (l.get(i) == s.get(j)) {
                i++;
                j++;
            } else {
                j = 0;
            }
        }
        return i == l.size() && j == s.size();
    }

    
    public static boolean isSublist_Problem_1_b702b4dd_3bd1_4dfd_b4ff_a4dd3b8631a6(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(s.size() > l.size()) {
            return False;
        }
        for(int i = 0; i <= l.size() - s.size(); i++) {
            if(l.get(i).equals(s.get(0))) {
                boolean isSublist_Problem_1_b702b4dd_3bd1_4dfd_b4ff_a4dd3b8631a6 = True;
                for(int j = 0; j < s.size(); j++) {
                    if(!l.get(i + j).equals(s.get(j))) {
                        isSublist_Problem_1_b702b4dd_3bd1_4dfd_b4ff_a4dd3b8631a6 = False;
                        break;
                    }
                }
                if(isSublist_Problem_1_b702b4dd_3bd1_4dfd_b4ff_a4dd3b8631a6) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_1_035a859e_8d56_4486_87b4_d47b4b12b7d5(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (l.size() < s.size()) return False;
        for (int i = 0; i < s.size(); i++) {
            if (l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_2_d4dca47d_cb84_499c_a452_6f038e08091f(ArrayList<Integer> l, ArrayList<Integer> s) {
        // Create a boolean array to store the result.
        boolean[] result = new boolean[l.size()];
        int i = 0;
        for (Integer num : l) {
            if (s.contains(num)) {
                result[i] = True;
                i++;
            }
        }
        return Arrays.asList(result).contains(True);
    }

    
    public static boolean isSublist_Problem_2_b3edd6ae_9706_4049_89d0_ad3de68f767a(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_2_3a2d7af0_5130_4f04_85cf_737ba3eb71b5(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) return False;
        for (int i = 0; i <= l.size() - s.size(); i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean isSublist_Problem_2_3a2d7af0_5130_4f04_85cf_737ba3eb71b5 = True;
                for (int j = 1; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        isSublist_Problem_2_3a2d7af0_5130_4f04_85cf_737ba3eb71b5 = False;
                        break;
                    }
                }
                if (isSublist_Problem_2_3a2d7af0_5130_4f04_85cf_737ba3eb71b5) return True;
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_1_27967709_3d6c_40b5_8806_be77c8f54739(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() > s.size()) return False;
        for(int i = 0; i < l.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_1_3dc7382a_105a_4343_bf4e_05b21288be98(ArrayList<Integer> l, ArrayList<Integer> s) {
        ArrayList<Integer> sublist = new ArrayList<>();
        for(Integer i : s) {
            for(Integer j : l) {
                if(i.equals(j)) {
                    sublist.add(i);
                }
            }
        }
        return sublist.equals(s);
    }

    
    public static boolean isSublist_Problem_2_4a32d7a5_e0ad_4d4d_9dab_82287c73eef7(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_2_e900f642_4c57_4505_a1b8_70f1e5cd92ba(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0;
        int j = 0;
        while (i < l.size() && j < s.size()) {
            if (l.get(i) == s.get(j)) {
                i++;
                j++;
            } else {
                j = 0;
            }
        }
        return i == l.size();
    }

    
    public static boolean isSublist_Problem_1_e25d225a_bc2b_4344_a503_be0e012e2fe9(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_2_3a2d7af0_5130_4f04_85cf_737ba3eb71b5(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) return False;
        for (int i = 0; i <= l.size() - s.size(); i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean isSublist_Problem_2_3a2d7af0_5130_4f04_85cf_737ba3eb71b5 = True;
                for (int j = 1; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        isSublist_Problem_2_3a2d7af0_5130_4f04_85cf_737ba3eb71b5 = False;
                        break;
                    }
                }
                if (isSublist_Problem_2_3a2d7af0_5130_4f04_85cf_737ba3eb71b5) return True;
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_1_719ecc00_1a96_40c6_b39e_67d867b02dd9(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() > s.size()) return False;
        for(int i = 0; i < l.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_2_101227d9_93b8_4da3_a95f_804bb0582974(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) return False;
        for (int i = 0; i < l.size() - s.size() + 1; i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean isSublist_Problem_2_101227d9_93b8_4da3_a95f_804bb0582974 = True;
                for (int j = 0; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        isSublist_Problem_2_101227d9_93b8_4da3_a95f_804bb0582974 = False;
                        break;
                    }
                }
                if (isSublist_Problem_2_101227d9_93b8_4da3_a95f_804bb0582974) return True;
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_2_e2bf29a5_d7e9_4eb6_9a08_48dd374af40f(ArrayList<Integer> l, ArrayList<Integer> s) {
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> s1 = new ArrayList<>();
        for(Integer i : l) {
            l1.add(i);
        }
        for(Integer i : s) {
            s1.add(i);
        }
        boolean result = l1.containsAll(s1);
        return result;
    }

    
    public static boolean isSublist_Problem_2_0523ab52_b1e0_403f_8947_dba521eafb3b(ArrayList<Integer> l, ArrayList<Integer> s) {
        boolean result = True;
        if (l == null || l.isEmpty() || s == null || s.isEmpty()) return result;
        for (Integer x : s) {
            boolean found = False;
            for (Integer y : l) {
                if (x == y) {
                    found = True;
                    break;
                }
            }
            if(!found) result = False;
        }
        return result;
    }

    
    public static boolean isSublist_Problem_1_1b5c6a03_0bd4_46a2_b030_047ac5de28b4(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0, j = 0;
        while (i < l.size() && j < s.size()) {
            if (l.get(i) == s.get(j)) {
                i++;
                j++;
            } else {
                j = 0;
            }
        }
        return i == l.size();
    }

    
    public static boolean isSublist_Problem_0_afa38060_412e_4908_b6cf_a2073f3c6a75(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_1_831316a9_f9de_44cd_bd1e_cbb239a688b1(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (l.size() < s.size()) return False;
        for (int i = 0; i < l.size() - s.size() + 1; i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean found = True;
                for (int j = 0; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        found = False;
                        break;
                    }
                }
                if (found) return True;
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_2_a675dfe3_6208_45d7_9b5f_6aa6d71ecffc(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_1_fc5a1f3c_0dca_441a_badf_6998fdfd6786(ArrayList<Integer> l, ArrayList<Integer> s) {
        return l.stream().anyMatch(a -> s.contains(a));
    }

    
    public static boolean isSublist_Problem_1_db01df21_ab42_4507_a2dd_07bf10fe8942(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0;
        int j = 0;
        while (i < l.size() && j < s.size()) {
            if (l.get(i).equals(s.get(j))) {
                j++;
            } else {
                j = 0;
            }
            i++;
        }
        return j == s.size();
    }

    
    public static boolean isSublist_Problem_1_5efb342a_c9d6_4791_9057_0366e49d81ea(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() > s.size()) return False;
        for(int i = 0; i < l.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_1_f0e08dbd_0ad5_45a7_81da_c589ee90389e(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i < l.size(); i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean isSub = True;
                for (int j = 0; j < s.size(); j++) {
                    if (i + j >= l.size() || !l.get(i + j).equals(s.get(j))) {
                        isSub = False;
                        break;
                    }
                }
                if (isSub) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_0_fde1641d_00d5_4ee9_8ca2_ac7857cc5d2b(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) return False;
        for (int i = 0; i <= l.size() - s.size(); i++) {
            if (l.subList(i, i + s.size()).equals(s)) return True;
        }
        return False;
    }

    
    public static boolean isSublist_Problem_2_5fc22b45_523c_4b49_80d7_6cc10dc79e69(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (l.size() < s.size()) {
            return False;
        }
        for (int i = 0; i < l.size(); i++) {
            if (l.get(i) != s.get(i)) {
                return False;
            }
        }
        return True;
    }

    
    public static boolean isSublist_Problem_0_749fa8b0_9c5c_4a55_a72f_84b5cee96a6f(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() > s.size()) return False;
        for(int i = 0; i < l.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_0_42e002fe_f5c7_4e98_98ed_51396757190c(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_1_94908795_c049_4788_8b56_6fbdd88655c0(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0;
        int j = 0;
        while(i < l.size() && j < s.size()) {
            if(l.get(i) == s.get(j)) {
                i++;
                j++;
            } else {
                j = 0;
            }
        }
        return i == l.size() && j == s.size();
    }

    
    public static boolean isSublist_Problem_1_c7ff9ba8_02c9_4557_a927_4b21b1c7900a(ArrayList<Integer> l, ArrayList<Integer> s) {
        int n = l.size();
        int m = s.size();
        for (int i = 0; i <= n - m; i++) {
            int j;
            for (j = 0; j < m; j++)
                if (l.get(i + j) != s.get(j))
                    break;
            if (j == m)
                return True;
        }
        return False;
    }

    
    public static boolean isSublist_Problem_0_20c690cb_640c_41ba_b935_1b4653ddff24(ArrayList<Integer> l, ArrayList<Integer> s) {
        return l.stream().anyMatch(i -> s.contains(i));
    }

    
    public static boolean isSublist_Problem_0_84382b2e_5e6a_4d76_8542_f61edd750eb9(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_1_e5c1dbcf_c11f_4d45_b187_56ca589505fa(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_0_1b625091_0042_40f3_8977_6d5f5c41f63c(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (l.size() < s.size()) {
            return False;
        }
        for (int i = 0; i < l.size() - s.size() + 1; i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean found = True;
                for (int j = 0; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        found = False;
                        break;
                    }
                }
                if (found) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_1_e59b0aae_91fe_4836_9e60_b8c129f41d8a(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i < l.size() - s.size() + 1; i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean isSublist_Problem_1_e59b0aae_91fe_4836_9e60_b8c129f41d8a = True;
                for (int j = 0; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        isSublist_Problem_1_e59b0aae_91fe_4836_9e60_b8c129f41d8a = False;
                        break;
                    }
                }
                if (isSublist_Problem_1_e59b0aae_91fe_4836_9e60_b8c129f41d8a) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_2_f6a795b4_5699_4408_a11b_d47fd371a7d6(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (l.size() < s.size()) {
            return False;
        }
        for (int i = 0; i < s.size(); i++) {
            if (l.get(i) != s.get(i)) {
                return False;
            }
        }
        return True;
    }

    
    public static boolean isSublist_Problem_1_70d18527_40e5_4865_8500_746c2d931962(ArrayList<Integer> l, ArrayList<Integer> s) {
        // Write your code here
        
        

        
        return True;
    }

    
    public static boolean isSublist_Problem_1_7401dd33_967a_4531_a5a9_a2308e35595f(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_1_27dd5801_e88e_4542_9762_47fd1bfa575e(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i <= l.size() - s.size(); i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean isSublist_Problem_1_27dd5801_e88e_4542_9762_47fd1bfa575e = True;
                for (int j = 1; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        isSublist_Problem_1_27dd5801_e88e_4542_9762_47fd1bfa575e = False;
                        break;
                    }
                }
                if (isSublist_Problem_1_27dd5801_e88e_4542_9762_47fd1bfa575e) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_1_5128dc52_ee0a_485e_9713_4d46b3ee8cd3(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        int i = 0;
        for(Integer e : s) {
            if(i >= l.size()) return False;
            if(l.get(i) != e) return False;
            i++;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_0_29f636b7_ccc7_446e_a799_6b1c9a12e827(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (l.size() < s.size())
            return False;
        for(int i=0; i<s.size(); i++) {
            if (!l.contains(s.get(i)))
                return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_2_1612fc47_710a_4d52_bb90_7ad32931f963(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_1_70dcfe58_a16a_4028_bacb_f5e3c4674b77(ArrayList<Integer> l, ArrayList<Integer> s) {
        // write your code here
        int i = 0, j = 0;
        ArrayList<Integer> a = new ArrayList<Integer>(l);
        ArrayList<Integer> b = new ArrayList<Integer>(s);
        int n = a.size();
        int m = b.size();
        if (n != m) {
            return False;
        }
        ArrayList<Integer> x = new ArrayList<Integer>();
        ArrayList<Integer> y = new ArrayList<Integer>();
        for (i = 0; i < n; i++) {
            if (a.get(i) == b.get(j)) {
                x.add(a.get(i));
                j++;
            } else {
                y.add(a.get(i));
            }
        }
        if (x.size() != y.size()) {
            return False;
        } else {
            return True;
        }
    }

    
    public static boolean isSublist_Problem_0_194620f5_6ff0_466c_98b9_5f19d357e2b8(ArrayList<Integer> l, ArrayList<Integer> s) {
        boolean result = False;
        for(int i = 0; i < l.size(); i++) {
            for(int j = 0; j < s.size(); j++) {
                if(l.get(i) == s.get(j)) {
                    result = True;
                    break;
                }
            }
        }
        return result;
    }

    
    public static boolean isSublist_Problem_2_ab0d6d35_16eb_470a_a87b_dd31f186133c(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_2_3dc7382a_105a_4343_bf4e_05b21288be98(ArrayList<Integer> l, ArrayList<Integer> s) {
        ArrayList<Integer> sublist = new ArrayList<>();
        for(Integer i : s) {
            for(Integer j : l) {
                if(i.equals(j)) {
                    sublist.add(i);
                }
            }
        }
        return sublist.equals(s);
    }

    
    public static boolean isSublist_Problem_1_7e598dd8_eac1_411a_95f1_7c42c242fc6d(ArrayList<Integer> l, ArrayList<Integer> s) {
        // Write your code here.
        int i=0,j=0;
        while(i<l.size() && j<s.size()){
            if (l.get(i)==s.get(j)) {
                i++;
                j++;
            }
            if (i<l.size()){
                i++;
            }
            if (j<s.size()){
                j++;
            }
        }
        return i<l.size() && j<s.size();
    }

    
    public static boolean isSublist_Problem_1_69b0963c_62a3_4fcf_bf34_9fc52e3b98dc(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) return False;
        for (int i = 0; i <= l.size() - s.size(); i++) {
            if (l.get(i).equals(s.get(0))) {
                int j = 0;
                for (; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) break;
                }
                if (j == s.size()) return True;
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_2_39a6409b_eacc_47d4_8572_517a06301da2(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_1_c7275919_2165_404d_9501_d9c859ce79ce(ArrayList<Integer> l, ArrayList<Integer> s) {
        ArrayList<Integer> result = new ArrayList<>();
        for(int i = 0; i < l.size(); i++) {
            Integer li = l.get(i);
            Integer si = s.get(i);
            if(li.compareTo(si) != 0) {
                result.add(li);
                result.add(si);
            }
        }
        return result.contains(l);
    }

    
    public static boolean isSublist_Problem_0_5128dc52_ee0a_485e_9713_4d46b3ee8cd3(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        int i = 0;
        for(Integer e : s) {
            if(i >= l.size()) return False;
            if(l.get(i) != e) return False;
            i++;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_0_efd584f7_b0a6_41c0_986d_7daff7eac888(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() > s.size()) return False;
        for(int i = 0; i < l.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_1_76dbadc1_3878_4324_9af3_b38fab665e78(ArrayList<Integer> l, ArrayList<Integer> s) {
        boolean isSublist_Problem_1_76dbadc1_3878_4324_9af3_b38fab665e78 = False;
        if (s.size() > l.size()) {
            return False;
        } else {
            l.removeAll(new ArrayList<>());
            isSublist_Problem_1_76dbadc1_3878_4324_9af3_b38fab665e78 = l.equals(s);
        }
        return isSublist_Problem_1_76dbadc1_3878_4324_9af3_b38fab665e78;
    }

    
    public static boolean isSublist_Problem_0_5fc22b45_523c_4b49_80d7_6cc10dc79e69(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (l.size() < s.size()) {
            return False;
        }
        for (int i = 0; i < l.size(); i++) {
            if (l.get(i) != s.get(i)) {
                return False;
            }
        }
        return True;
    }

    
    public static boolean isSublist_Problem_1_53bb7d4e_2ac8_4674_a15d_6322bca1b83d(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0;
        int j = 0;
        while (i < l.size() && j < s.size()) {
            if (l.get(i) == s.get(j)) {
                i++;
                j++;
            } else if (l.get(i) < s.get(j)) {
                i++;
            } else {
                j++;
            }
        }
        return i == l.size() && j == s.size();
    }

    
    public static boolean isSublist_Problem_2_de705347_9143_416c_97f8_9d3a00786276(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_0_230f8b6b_cc74_49eb_abc9_558fbeee96a0(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < l.size() && j < s.size()) {
            if (l.get(i) == s.get(j)) {
                i++;
                j++;
                k++;
            } else if (l.get(i) < s.get(j)) {
                i++;
            } else {
                j++;
            }
        }
        return k == s.size();
    }

    
    public static boolean isSublist_Problem_2_84ba1406_bc86_4838_9ea8_f5658b62f04a(ArrayList<Integer> l, ArrayList<Integer> s) {
        ArrayList<Integer> sublist = new ArrayList<>();
        for(Integer i : l) {
            for(Integer j : s) {
                if(j.equals(i)) {
                    sublist.add(i);
                    break;
                }
            }
        }
        return sublist.equals(s);
    }

    
    public static boolean isSublist_Problem_1_dd74becb_8c2e_497a_80c0_92747524d002(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i < l.size() - s.size() + 1; i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean found = True;
                for (int j = 1; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        found = False;
                        break;
                    }
                }
                if (found) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_2_4a32d7a5_e0ad_4d4d_9dab_82287c73eef7(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_0_e3a5ac86_9b37_4614_85d6_285a16e5c5d2(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0;
        int j = 0;
        while(i < l.size() && j < s.size()) {
            if(l.get(i) == s.get(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        return i == l.size() && j == s.size();
    }

    
    public static boolean isSublist_Problem_2_9e57fd22_aa2e_40da_90b1_b35f11da96eb(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0, j = 0;
        for(; i < l.size() && j < s.size(); i++) {
            if(l.get(i) == s.get(j)) {
                j++;
            }
        }
        return j == s.size();
    }

    
    public static boolean isSublist_Problem_0_9d1e2adf_e0a1_4fa1_83d5_f2cff2c75b43(ArrayList<Integer> l, ArrayList<Integer> s) {
        return l.equals(s);
    }

    
    public static boolean isSublist_Problem_2_21b63637_323d_4607_8c25_0fa8208f0645(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0, j = 0;
        while (i < l.size() && j < s.size()) {
            if (l.get(i) == s.get(j)) {
                i++;
                j++;
            } else {
                j++;
            }
        }
        return i == l.size();
    }

    
    public static boolean isSublist_Problem_0_682f657b_360f_490c_b364_4c0e53553b21(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0;
        int j = 0;
        int size = l.size();
        int size2 = s.size();
        while (i < size && j < size2) {
            if (l.get(i) == s.get(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        return i == size && j == size2;
    }

    
    public static boolean isSublist_Problem_2_faf380bd_f094_4060_8058_a50851febda2(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0, j = 0;
        while(i < l.size() && j < s.size()) {
            if(l.get(i) == s.get(j)) {
                i++;
                j++;
            } else {
                j = 0;
            }
        }
        return i == l.size() && j == s.size();
    }

    
    public static boolean isSublist_Problem_2_4340aee6_9bba_4247_b84f_0400db6c106c(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_2_2149fd93_bf90_4212_ba4a_fca2e5d74782(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i <= l.size() - s.size(); i++) {
            if (l.subList(i, i + s.size()).equals(s)) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_1_41eccd45_828c_4d0b_a89e_3583606e4afe(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0;
        int j = 0;
        int k = 0;
        int l_size = l.size();
        int s_size = s.size();
        while (i < l_size && j < s_size) {
            if (l.get(i) == s.get(j)) {
                i++;
                j++;
                k++;
            } else if (l.get(i) < s.get(j)) {
                i++;
            } else {
                j++;
            }
        }
        return k == s_size;
    }

    
    public static boolean isSublist_Problem_1_817894ac_6d26_4a18_90f8_58672498e0bf(ArrayList<Integer> l, ArrayList<Integer> s) {
        boolean result = False;
        for(int i = 0; i < l.size(); i++) {
            for(int j = 0; j < s.size(); j++) {
                if(l.get(i) == s.get(j)) {
                    result = True;
                    break;
                }
            }
        }
        return result;
    }

    
    public static boolean isSublist_Problem_0_309e49b4_ec51_49bf_961b_9391c484f19d(ArrayList<Integer> l, ArrayList<Integer> s) {
        int n = s.size();
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> a1 = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            a.add(s.get(i));
        }
        for(int i = 0; i < l.size(); i++) {
            a1.add(l.get(i));
        }
        boolean flag = False;
        for(int i = 0; i < a.size(); i++) {
            for(int j = 0; j < a1.size(); j++) {
                if(a.get(i) == a1.get(j)) {
                    flag = True;
                    break;
                }
            }
            if(flag)
                break;
        }
        return flag;
    }

    
    public static boolean isSublist_Problem_0_e160d2f5_3d67_451a_add2_64ef9853e198(ArrayList<Integer> l, ArrayList<Integer> s) {
        ArrayList<Integer> sub = new ArrayList<>();
        l.forEach(x -> {
            s.forEach(y -> {
                if (x.equals(y)) {
                    sub.add(x);
                }
            });
        });
        return sub.isEmpty();
    }

    
    public static boolean isSublist_Problem_1_fbf93d90_e09b_4b84_9fca_6530c13c5c74(ArrayList<Integer> l, ArrayList<Integer> s) {
        for(int i = 0; i < l.size(); i++) {
            for(int j = 0; j < s.size(); j++) {
                if(l.get(i) == s.get(j))
                    return True;
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_1_64f8695f_6a75_4db4_9374_d6b49214aed1(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_2_f6a795b4_5699_4408_a11b_d47fd371a7d6(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (l.size() < s.size()) {
            return False;
        }
        for (int i = 0; i < s.size(); i++) {
            if (l.get(i) != s.get(i)) {
                return False;
            }
        }
        return True;
    }

    
    public static boolean isSublist_Problem_2_4d1c77e7_71c5_4434_a806_93f4a7a39346(ArrayList<Integer> l, ArrayList<Integer> s) {
        
        //return ((ArrayList<Integer>) l).containsAll(s);
        return l.containsAll(s);
    }

    
    public static boolean isSublist_Problem_0_7cf383c6_aeba_4bd7_ab78_ecb9800338e8(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_0_20c690cb_640c_41ba_b935_1b4653ddff24(ArrayList<Integer> l, ArrayList<Integer> s) {
        return l.stream().anyMatch(i -> s.contains(i));
    }

    
    public static boolean isSublist_Problem_0_2b3d7506_98e3_4b68_958d_4cf532023d30(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(s.get(i) != l.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_2_b6dc4093_d518_48d6_8c61_6870f50c298c(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_0_53bb7d4e_2ac8_4674_a15d_6322bca1b83d(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0;
        int j = 0;
        while (i < l.size() && j < s.size()) {
            if (l.get(i) == s.get(j)) {
                i++;
                j++;
            } else if (l.get(i) < s.get(j)) {
                i++;
            } else {
                j++;
            }
        }
        return i == l.size() && j == s.size();
    }

    
    public static boolean isSublist_Problem_0_3c277f1e_9062_4541_b9b5_816ff7c4e8dd(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) return False;
        for (int i = 0; i < l.size() - s.size() + 1; i++) {
            if (l.get(i).equals(s.get(0))) {
                int j = 0;
                for (; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) break;
                }
                if (j == s.size()) return True;
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_0_8460de8e_30f7_486f_a016_f48488040ea4(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_0_cfb97f61_2021_43c6_a3b3_98a570623397(ArrayList<Integer> l, ArrayList<Integer> s) {
        boolean res = False;
        int lSize = l.size(), sSize = s.size();
        if (lSize == sSize) {
            for (int i = 0; i < lSize; i++) {
                if (l.get(i) == s.get(i)) {
                    res = True;
                } else {
                    break;
                }
            }
        }
        return res;
    }

    
    public static boolean isSublist_Problem_0_b513ce3c_19e7_4837_93a0_7001bdd5ba21(ArrayList<Integer> l, ArrayList<Integer> s) {
        ArrayList<Integer> subList = new ArrayList<Integer>();
        for(Integer i : l) {
            subList.add(i);
        }
        for(Integer i : s) {
            if(!subList.contains(i)) {
                return False;
            }
        }
        return True;
    }

    
    public static boolean isSublist_Problem_1_cd958c5b_add7_4cc0_a1e9_290353dcf20c(ArrayList<Integer> l, ArrayList<Integer> s) {
        ArrayList<Integer> l1 = new ArrayList<>(l);
        ArrayList<Integer> s1 = new ArrayList<>(s);
        ArrayList<Integer> l2 = new ArrayList<>();
        ArrayList<Integer> s2 = new ArrayList<>();
        for(int i = 0; i < l.size(); i++) {
            l2.add(l.get(i));
        }
        for(int i = 0; i < s.size(); i++) {
            s2.add(s.get(i));
        }
        for(int i = 0; i < l1.size(); i++) {
            if(!s2.contains(l1.get(i))) {
                return False;
            }
        }
        return True;
    }

    
    public static boolean isSublist_Problem_2_911e7bf3_916a_4a2b_9668_0bb0d05b86f5(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() > s.size()) return False;
        for(int i = 0; i < l.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_1_986d93c4_f89a_4e8d_a7a7_0d9146e8dda6(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i < l.size() - s.size() + 1; i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean isSublist_Problem_1_986d93c4_f89a_4e8d_a7a7_0d9146e8dda6 = True;
                for (int j = 1; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        isSublist_Problem_1_986d93c4_f89a_4e8d_a7a7_0d9146e8dda6 = False;
                        break;
                    }
                }
                if (isSublist_Problem_1_986d93c4_f89a_4e8d_a7a7_0d9146e8dda6) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_0_5d98ce10_ed8b_40f7_adde_4547d696ed2f(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) return False;
        for (int i = 0; i <= l.size() - s.size(); i++) {
            if (l.subList(i, i + s.size()).equals(s)) return True;
        }
        return False;
    }

    
    public static boolean isSublist_Problem_2_3e94bdd1_c32a_4b30_a365_d89a931e55a5(ArrayList<Integer> l, ArrayList<Integer> s) {
        int n = l.size();
        int m = s.size();
        for (int i = 0; i <= n - m; i++) {
            int j;
            for (j = 0; j < m; j++) {
                if (l.get(i + j) != s.get(j)) {
                    break;
                }
            }
            if (j == m) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_0_ae6b4ac4_2d32_43f8_85c7_848bf147f4a7(ArrayList<Integer> l, ArrayList<Integer> s) {
        boolean flag = False;
        int firstArray[] = new int[s.size()];
        int secondArray[] = new int[s.size()];
        for(int i=0; i<firstArray.length;i++) {
            firstArray[i] = s.get(i);
        }
        for(int i=0; i<l.size();i++) {
            secondArray[i] = l.get(i);
        }
        for(int i=0;i<secondArray.length;i++) {
            if(firstArray[i] != secondArray[i])
                flag = True;
        }
        return flag;
    }

    
    public static boolean isSublist_Problem_1_5c7a495b_c9ba_4d66_9dc9_fbcfc53598cd(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_1_b8b8d04e_884a_4f3e_a8f2_02177b115330(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_2_42e002fe_f5c7_4e98_98ed_51396757190c(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_1_9d5e78d3_2626_4826_9167_0e891439ff60(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_0_0b8158bf_4337_4448_ac3a_3a609c5b23c2(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_2_7e7109d2_612c_40cb_ad63_558349df89b6(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) return False;
        for (int i = 0; i <= l.size() - s.size(); i++) {
            if (l.subList(i, i + s.size()).equals(s)) return True;
        }
        return False;
    }

    
    public static boolean isSublist_Problem_2_69b0963c_62a3_4fcf_bf34_9fc52e3b98dc(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) return False;
        for (int i = 0; i <= l.size() - s.size(); i++) {
            if (l.get(i).equals(s.get(0))) {
                int j = 0;
                for (; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) break;
                }
                if (j == s.size()) return True;
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_0_42077c43_9f24_42dc_90ee_2394843b6b06(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_2_ec24452c_8f9f_4bb2_ac2d_5d26afc787ee(ArrayList<Integer> l, ArrayList<Integer> s) {
        // write your code here
        ArrayList<Integer> ss = new ArrayList<Integer>();
        for(Integer i : s)
            ss.add(i);
        for(int i=0;i<l.size();i++)
            if(!ss.contains(l.get(i)))
                return False;
        return True;
    }

    
    public static boolean isSublist_Problem_0_cc2607df_ea6e_4849_83b9_d111973beb07(ArrayList<Integer> l, ArrayList<Integer> s) {
        // Write your code here
        return l.equals(s);
    }

    
    public static boolean isSublist_Problem_1_8d41e7c9_22ea_41e9_b164_13adee9b0d88(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_0_60617548_c878_4930_b296_986971ac41eb(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0;
        int j = 0;
        int k = 0;
        int l_size = l.size();
        int s_size = s.size();
        while (i < l_size && j < s_size) {
            if (l.get(i) == s.get(j)) {
                i++;
                j++;
                k++;
            } else if (l.get(i) < s.get(j)) {
                i++;
            } else {
                j++;
            }
        }
        return k == s_size;
    }

    
    public static boolean isSublist_Problem_2_8efd2f0f_5f22_4734_be00_16e55e5326a8(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (l.size() < s.size()) {
            return False;
        }
        boolean result = True;
        for (int i = 0; i < s.size(); i++) {
            result &= (l.get(i) == s.get(i));
        }
        return result;
    }

    
    public static boolean isSublist_Problem_1_92fc83ab_9be0_4a80_b6f0_6508fbf4befd(ArrayList<Integer> l, ArrayList<Integer> s) {
        ArrayList<Integer> sublist = new ArrayList<Integer>();
        for(int i = 0; i < l.size(); i++) {
            for(int j = 0; j < s.size(); j++) {
                if(l.get(i) == s.get(j)) {
                    sublist.add(l.get(i));
                }
            }
        }
        return sublist.equals(s);
    }

    
    public static boolean isSublist_Problem_2_fde1641d_00d5_4ee9_8ca2_ac7857cc5d2b(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) return False;
        for (int i = 0; i <= l.size() - s.size(); i++) {
            if (l.subList(i, i + s.size()).equals(s)) return True;
        }
        return False;
    }

    
    public static boolean isSublist_Problem_1_b1045f02_88b3_49d9_aade_d6a66f772207(ArrayList<Integer> l, ArrayList<Integer> s) {
        ArrayList<Integer> sublist = new ArrayList<>();
        for(Integer i : l) {
            for(Integer j : s) {
                if(i == j) {
                    sublist.add(i);
                }
            }
        }
        return sublist.contains(l);
    }

    
    public static boolean isSublist_Problem_2_62daae90_e9ea_4487_bfa8_7860dc3c8f3f(ArrayList<Integer> l, ArrayList<Integer> s) {
        // write your code here
        int result = -1;
        // check if the sizes of both the lists are same
        if(l.size() != s.size()) {
            return False;
        }
        // check each element of the array list individually
        for(int i = 0; i < l.size(); i++) {
            if(s.get(i) != l.get(i)) {
                return False;
            }
        }
        return True;
    }

    
    public static boolean isSublist_Problem_1_e4d49bed_fe1b_4ea2_bdca_29c5cb5828be(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0;
        int j = 0;
        int l_size = l.size();
        int s_size = s.size();
        while (i < l_size && j < s_size) {
            if (l.get(i) == s.get(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        return (i == l_size && j == s_size);
    }

    
    public static boolean isSublist_Problem_0_3cd41338_ee26_482d_bb1d_9f466c1534c6(ArrayList<Integer> l, ArrayList<Integer> s) {
        boolean flag = False;
        for(int i = 0; i < l.size(); i++) {
            for(int j = 0; j < s.size(); j++) {
                if(l.get(i) == s.get(j)) {
                    flag = True;
                    break;
                }
            }
        }
        return flag;
    }

    
    public static boolean isSublist_Problem_1_4ec85f2d_2140_4b04_a4f1_42b3b511b3c2(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_2_db8cb7eb_d39f_4bf8_bdf4_0f1abe2edc28(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) return False;
        for (int i = 0; i <= l.size() - s.size(); i++) {
            if (l.subList(i, i + s.size()).equals(s)) return True;
        }
        return False;
    }

    
    public static boolean isSublist_Problem_1_27136bf9_5474_4c7d_8aa1_ce10d5d2c99e(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (l.size() < s.size()) return False;
        for (int i = 0; i < s.size(); i++) {
            if (l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_1_459083b2_21dd_46b3_ad42_2cd312eb5cc2(ArrayList<Integer> l, ArrayList<Integer> s) {
        ArrayList<Integer> l1 = new ArrayList<>(l);
        ArrayList<Integer> s1 = new ArrayList<>(s);
        boolean flag = False;
        for(int i = 0; i < l1.size(); i++) {
            for(int j = 0; j < s1.size(); j++) {
                if(l1.get(i).equals(s1.get(j))) {
                    flag = True;
                    break;
                }
            }
        }
        return flag;
    }

    
    public static boolean isSublist_Problem_2_1b4cc0d7_230b_46e2_b877_2dfb48b8a01d(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_1_4e1be89f_f0d5_4782_9c08_724f2071bd64(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) return False;
        for (int i = 0; i < l.size() - s.size() + 1; i++) {
            boolean found = True;
            for (int j = 0; j < s.size(); j++) {
                if (l.get(i + j) != s.get(j)) {
                    found = False;
                    break;
                }
            }
            if (found) return True;
        }
        return False;
    }

    
    public static boolean isSublist_Problem_1_529e52f7_3aa9_4177_8d09_f97616c4e75c(ArrayList<Integer> l, ArrayList<Integer> s) {
        int n = l.size();
        int m = s.size();
        if (m > n) return False;
        int i = 0, j = 0;
        while (i < n && j < m) {
            if (l.get(i).equals(s.get(j))) {
                i++;
                j++;
            } else {
                i = i - j + 1;
                j = 0;
            }
        }
        return j == m;
    }

    
    public static boolean isSublist_Problem_1_42077c43_9f24_42dc_90ee_2394843b6b06(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_0_4340aee6_9bba_4247_b84f_0400db6c106c(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_1_4824795b_c939_40c9_b345_98e0422ff265(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0;
        int j = 0;
        while (i < l.size() && j < s.size()) {
            if (l.get(i).equals(s.get(j))) {
                j++;
            } else {
                j = 0;
            }
            i++;
        }
        return j == s.size();
    }

    
    public static boolean isSublist_Problem_0_60617548_c878_4930_b296_986971ac41eb(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0;
        int j = 0;
        int k = 0;
        int l_size = l.size();
        int s_size = s.size();
        while (i < l_size && j < s_size) {
            if (l.get(i) == s.get(j)) {
                i++;
                j++;
                k++;
            } else if (l.get(i) < s.get(j)) {
                i++;
            } else {
                j++;
            }
        }
        return k == s_size;
    }

    
    public static boolean isSublist_Problem_2_e943792f_b615_45f5_8f5a_d83e79c404b8(ArrayList<Integer> l, ArrayList<Integer> s) {
        ArrayList<Integer> temp = new ArrayList<>();
        for(int i = 0; i < l.size(); i++) {
            for(int j = 0; j < s.size(); j++) {
                if(l.get(i) == s.get(j)) {
                    temp.add(l.get(i));
                }
            }
        }
        return temp.size() == s.size();
    }

    
    public static boolean isSublist_Problem_2_e4d49bed_fe1b_4ea2_bdca_29c5cb5828be(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0;
        int j = 0;
        int l_size = l.size();
        int s_size = s.size();
        while (i < l_size && j < s_size) {
            if (l.get(i) == s.get(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        return (i == l_size && j == s_size);
    }

    
    public static boolean isSublist_Problem_2_66c05780_0026_432b_93f8_5450bcb16f08(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_1_ae3aafeb_44fb_4bd1_9f49_bcd1bfe30772(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_0_ddd6dfba_3b94_433d_a82f_fbc076a14bc4(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_2_99fbd926_e94f_4e03_a2ac_bc9586c6ee78(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i <= l.size() - s.size(); i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean found = True;
                for (int j = 1; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        found = False;
                        break;
                    }
                }
                if (found) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_2_9250528c_815b_4fe8_b5b7_fbdc2026c37c(ArrayList<Integer> l, ArrayList<Integer> s) {
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> s1 = new ArrayList<>();
        for(Integer i : l) {
            l1.add(i);
        }
        for(Integer i : s) {
            s1.add(i);
        }
        boolean result = l1.containsAll(s1);
        return result;
    }

    
    public static boolean isSublist_Problem_2_0b8158bf_4337_4448_ac3a_3a609c5b23c2(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_0_3dc7382a_105a_4343_bf4e_05b21288be98(ArrayList<Integer> l, ArrayList<Integer> s) {
        ArrayList<Integer> sublist = new ArrayList<>();
        for(Integer i : s) {
            for(Integer j : l) {
                if(i.equals(j)) {
                    sublist.add(i);
                }
            }
        }
        return sublist.equals(s);
    }

    
    public static boolean isSublist_Problem_2_6328a28f_1b50_48fa_bfe6_8a6c9f6eb0ef(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0, j = 0;
        while (i < l.size() && j < s.size()) {
            if (l.get(i) == s.get(j)) {
                i++;
                j++;
            } else {
                j++;
            }
        }
        return i == l.size() && j == s.size();
    }

    
    public static boolean isSublist_Problem_0_b3edd6ae_9706_4049_89d0_ad3de68f767a(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_1_4d1c77e7_71c5_4434_a806_93f4a7a39346(ArrayList<Integer> l, ArrayList<Integer> s) {
        
        //return ((ArrayList<Integer>) l).containsAll(s);
        return l.containsAll(s);
    }

    
    public static boolean isSublist_Problem_1_8934fb96_4d08_4e27_98c0_c8ce0b010034(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_2_56d8c86d_9bc8_4413_aae8_250e83ff6fbe(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_1_644c5fdd_47bf_4fd0_b848_3eabbee27f73(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i <= l.size() - s.size(); i++) {
            if (l.get(i) == s.get(0)) {
                boolean found = True;
                for (int j = 1; j < s.size(); j++) {
                    if (l.get(i + j) != s.get(j)) {
                        found = False;
                        break;
                    }
                }
                if (found) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_2_e6e58c99_d5a1_4bb3_b7c4_e9d3161bd8ab(ArrayList<Integer> l, ArrayList<Integer> s) {
        boolean result = False;
        for(int i = 0; i < l.size(); i++) {
            for(int j = 0; j < s.size(); j++) {
                if(l.get(i).equals(s.get(j))) {
                    result = True;
                    break;
                }
            }
        }
        return result;
    }

    
    public static boolean isSublist_Problem_1_fa1dc739_7b6b_43eb_a565_5a1375dc5a64(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) return False;
        for (int i = 0; i < l.size() - s.size() + 1; i++) {
            if (l.get(i).equals(s.get(0))) {
                int j = 0;
                for (; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) break;
                }
                if (j == s.size()) return True;
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_0_19964757_e378_41de_b4c3_82315fe95d29(ArrayList<Integer> l, ArrayList<Integer> s) {
        return l.stream().filter(x -> s.contains(x)).count() == s.size();
    }

    
    public static boolean isSublist_Problem_2_986d93c4_f89a_4e8d_a7a7_0d9146e8dda6(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i < l.size() - s.size() + 1; i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean isSublist_Problem_2_986d93c4_f89a_4e8d_a7a7_0d9146e8dda6 = True;
                for (int j = 1; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        isSublist_Problem_2_986d93c4_f89a_4e8d_a7a7_0d9146e8dda6 = False;
                        break;
                    }
                }
                if (isSublist_Problem_2_986d93c4_f89a_4e8d_a7a7_0d9146e8dda6) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_1_98f9505e_d7c2_4471_b029_bfd0f916a426(ArrayList<Integer> l, ArrayList<Integer> s) {
        ArrayList<Integer> l1 = new ArrayList<>(l);
        ArrayList<Integer> s1 = new ArrayList<>(s);
        ArrayList<Integer> l2 = new ArrayList<>();
        ArrayList<Integer> s2 = new ArrayList<>();
        for(int i = 0; i < l1.size(); i++) {
            l2.add(l1.get(i));
        }
        for(int i = 0; i < s1.size(); i++) {
            s2.add(s1.get(i));
        }
        for(int i = 0; i < l2.size(); i++) {
            if(!s2.contains(l2.get(i))) {
                return False;
            }
        }
        return True;
    }

    
    public static boolean isSublist_Problem_1_4019ed98_ba78_4932_a75a_9fce73e53e07(ArrayList<Integer> l, ArrayList<Integer> s) {
        int n = l.size();
        int m = s.size();
        if (m > n) {
            return False;
        }
        for (int i = 0; i <= n - m; i++) {
            int j;
            for (j = 0; j < m; j++) {
                if (l.get(i + j) != s.get(j)) {
                    break;
                }
            }
            if (j == m) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_2_53ceed9d_ac76_49d7_80fc_2c3edba59314(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_1_035a859e_8d56_4486_87b4_d47b4b12b7d5(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (l.size() < s.size()) return False;
        for (int i = 0; i < s.size(); i++) {
            if (l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_0_c0fb15f9_0a64_452d_8f41_735a3851f56e(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i < l.size() - s.size() + 1; i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean isSublist_Problem_0_c0fb15f9_0a64_452d_8f41_735a3851f56e = True;
                for (int j = 0; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        isSublist_Problem_0_c0fb15f9_0a64_452d_8f41_735a3851f56e = False;
                        break;
                    }
                }
                if (isSublist_Problem_0_c0fb15f9_0a64_452d_8f41_735a3851f56e) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_2_d65ee803_bfb6_4a1e_b246_91b96315d905(ArrayList<Integer> l, ArrayList<Integer> s) {
        ArrayList<Integer> sublist = new ArrayList<>();
        for(Integer i : s) {
            for(Integer j : l) {
                if(i.equals(j)) {
                    sublist.add(i);
                }
            }
        }
        return sublist.equals(l);
    }

    
    public static boolean isSublist_Problem_1_3c5bceaf_6262_43ed_b99b_162928847a56(ArrayList<Integer> l, ArrayList<Integer> s) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i=0; i<l.size(); i++) {
            if (s.contains(l.get(i))) list.add(l.get(i));
        }
        return list.isEmpty();
    }

    
    public static boolean isSublist_Problem_1_299b2236_6045_4af1_9b26_49e07c15ff7d(ArrayList<Integer> l, ArrayList<Integer> s) {
        ArrayList<Integer> a = new ArrayList<>(l);
        ArrayList<Integer> b = new ArrayList<>(s);
        return a.containsAll(b);
    }

    
    public static boolean isSublist_Problem_1_9f0d67b7_5b8e_4738_833d_ed0dce21ebe2(ArrayList<Integer> l, ArrayList<Integer> s) {
        ArrayList<Integer> temp = new ArrayList<>();
        for(Integer i : l) {
            for(Integer j : s) {
                if(i == j) {
                    temp.add(i);
                }
            }
        }
        boolean result = temp.isEmpty();
        return result;
    }

    
    public static boolean isSublist_Problem_0_4340aee6_9bba_4247_b84f_0400db6c106c(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_2_0523ab52_b1e0_403f_8947_dba521eafb3b(ArrayList<Integer> l, ArrayList<Integer> s) {
        boolean result = True;
        if (l == null || l.isEmpty() || s == null || s.isEmpty()) return result;
        for (Integer x : s) {
            boolean found = False;
            for (Integer y : l) {
                if (x == y) {
                    found = True;
                    break;
                }
            }
            if(!found) result = False;
        }
        return result;
    }

    
    public static boolean isSublist_Problem_1_7e598dd8_eac1_411a_95f1_7c42c242fc6d(ArrayList<Integer> l, ArrayList<Integer> s) {
        // Write your code here.
        int i=0,j=0;
        while(i<l.size() && j<s.size()){
            if (l.get(i)==s.get(j)) {
                i++;
                j++;
            }
            if (i<l.size()){
                i++;
            }
            if (j<s.size()){
                j++;
            }
        }
        return i<l.size() && j<s.size();
    }

    
    public static boolean isSublist_Problem_0_71f7248b_3bf3_4fc0_9e05_f0bf24076ae2(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (l.size() < s.size()) return False;
        for (int i = 0; i < s.size(); i++) {
            if (l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_0_82bd1def_a3cd_4ea4_8a72_c228a5655a60(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_0_19e800a7_cd92_4baf_861e_d7597d433af8(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() == 0) return True;
        if (l.size() == 0) return False;
        if (l.size() < s.size()) return False;
        for (int i = 0; i < l.size() - s.size() + 1; i++) {
            boolean match = True;
            for (int j = 0; j < s.size(); j++) {
                if (l.get(i + j) != s.get(j)) {
                    match = False;
                    break;
                }
            }
            if (match) return True;
        }
        return False;
    }

    
    public static boolean isSublist_Problem_2_e8c033da_6676_4f6a_a79d_a29a6eb696c4(ArrayList<Integer> l, ArrayList<Integer> s) {
        ArrayList<Integer> l1 = new ArrayList<>(l);
        ArrayList<Integer> s1 = new ArrayList<>(s);
        boolean result = False;
        for(int i = 0; i < l1.size(); i++) {
            for(int j = 0; j < s1.size(); j++) {
                if(l1.get(i) == s1.get(j)) {
                    result = True;
                }
            }
        }
        return result;
    }

    
    public static boolean isSublist_Problem_1_70d18527_40e5_4865_8500_746c2d931962(ArrayList<Integer> l, ArrayList<Integer> s) {
        // Write your code here
        
        

        
        return True;
    }

    
    public static boolean isSublist_Problem_1_77564c1d_6a22_4367_b893_3be92bc36722(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() > s.size()) return False;
        for(int i = 0; i < l.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_1_991f573a_5e91_437f_ada8_5a6482a323f8(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() > s.size()) return False;
        for(int i = 0; i < l.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_0_b3c46029_748c_4bf6_ba3e_9ca47c308ec2(ArrayList<Integer> l, ArrayList<Integer> s) {
        ArrayList<Integer> l1 = new ArrayList<Integer>(l);
        ArrayList<Integer> s1 = new ArrayList<Integer>(s);
        Collections.sort(l1);
        Collections.sort(s1);
        if (l1.equals(s1)) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isSublist_Problem_2_1d88c5db_58b5_484e_9e97_bf031ce3837f(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) return False;
        for (int i = 0; i < l.size(); i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean found = True;
                for (int j = 1; j < s.size(); j++) {
                    if (i + j >= l.size() || !l.get(i + j).equals(s.get(j))) {
                        found = False;
                        break;
                    }
                }
                if (found) return True;
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_0_84ab34bc_92ac_4c34_b6e6_8c56b40a7a4c(ArrayList<Integer> l, ArrayList<Integer> s) {
        boolean flag = False;
        if (s.isEmpty()) {
            return flag;
        }
        for (int i = 0; i < l.size() - s.size(); i++) {
            if (l.subList(i, i + s.size()).equals(s)) {
                flag = True;
            }
        }
        return flag;
    }

    
    public static boolean isSublist_Problem_1_47ba365b_0d76_4285_9914_4f5268f08624(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.isEmpty()) {
            return True;
        } else {
            boolean result = False;
            for (int i = 0; i < l.size(); i++) {
                boolean found = False;
                for (int j = 0; j < s.size(); j++) {
                    if (l.get(i).compareTo(s.get(i)) < 0) {
                        found = True;
                        break;
                    }
                }
                if (!found) {
                    result = True;
                    break;
                }
            }
            return result;
        }
    }

    
    public static boolean isSublist_Problem_1_ce760bd0_031e_46f4_966c_9c89357cae18(ArrayList<Integer> l, ArrayList<Integer> s) {
        int n = l.size();
        int m = s.size();
        if (m > n) return False;
        for (int i = 0; i <= n - m; i++) {
            int j;
            for (j = 0; j < m; j++) {
                if (l.get(i + j) != s.get(j)) break;
            }
            if (j == m) return True;
        }
        return False;
    }

    
    public static boolean isSublist_Problem_1_a36f5d3b_0c29_4ea5_bb52_d8e749b568f7(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_0_8460de8e_30f7_486f_a016_f48488040ea4(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_2_9e303d14_2530_4baf_a2a5_606d9cf62c68(ArrayList<Integer> l, ArrayList<Integer> s) {
        boolean sub = False;
        try{
            if(!l.containsAll(s)){
                sub=False;
            }
        }catch(Exception ex){
            sub = True;
        }
        return sub;
    }

    
    public static boolean isSublist_Problem_2_296d3b1f_d231_4768_8044_02e4c6f11266(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (l.size() < s.size()) return False;
        for (int i = 0; i < s.size(); i++) {
            if (l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_1_e4d49bed_fe1b_4ea2_bdca_29c5cb5828be(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0;
        int j = 0;
        int l_size = l.size();
        int s_size = s.size();
        while (i < l_size && j < s_size) {
            if (l.get(i) == s.get(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        return (i == l_size && j == s_size);
    }

    
    public static boolean isSublist_Problem_2_972d9d30_d04a_4cae_9bcf_3e2836439254(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i <= l.size() - s.size(); i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean found = True;
                for (int j = 0; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        found = False;
                        break;
                    }
                }
                if (found) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_1_cfb97f61_2021_43c6_a3b3_98a570623397(ArrayList<Integer> l, ArrayList<Integer> s) {
        boolean res = False;
        int lSize = l.size(), sSize = s.size();
        if (lSize == sSize) {
            for (int i = 0; i < lSize; i++) {
                if (l.get(i) == s.get(i)) {
                    res = True;
                } else {
                    break;
                }
            }
        }
        return res;
    }

    
    public static boolean isSublist_Problem_2_99892862_7bbc_4905_a923_9c741c2f6cca(ArrayList<Integer> l, ArrayList<Integer> s) {
        
        ArrayList<Integer> temp = new ArrayList<Integer>();
        for(int i=0;i<l.size();i++){
            for(int j=0;j<s.size();j++){
                if(l.get(i) == s.get(j)){
                    temp.add(l.get(i));
                    break;
                }
            }
        }
        
        for(int i=0;i<temp.size()-1;i++){
            if(temp.get(i) != temp.get(i+1)){
                return False;
            }
        }
        return True;
    }

    
    public static boolean isSublist_Problem_0_4e981614_7eff_4b04_81ba_71594b054798(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (l.size() < s.size()) return False;
        for (int i = 0; i < s.size(); i++) {
            if (l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_2_913cc9f6_b1a0_486a_aeed_6b538c98138e(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0;
        int j = 0;
        int k = 0;
        int ln = l.size();
        int sn = s.size();
        while (i < ln && j < sn) {
            if (l.get(i) == s.get(j)) {
                i++;
                j++;
                k++;
            } else if (l.get(i) < s.get(j)) {
                i++;
            } else {
                j++;
            }
        }
        return k == sn;
    }

    
    public static boolean isSublist_Problem_2_4a32d7a5_e0ad_4d4d_9dab_82287c73eef7(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_2_1d88c5db_58b5_484e_9e97_bf031ce3837f(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) return False;
        for (int i = 0; i < l.size(); i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean found = True;
                for (int j = 1; j < s.size(); j++) {
                    if (i + j >= l.size() || !l.get(i + j).equals(s.get(j))) {
                        found = False;
                        break;
                    }
                }
                if (found) return True;
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_0_1791d202_f836_41c3_88fb_4261837a0045(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i <= l.size() - s.size(); i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean found = True;
                for (int j = 0; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        found = False;
                        break;
                    }
                }
                if (found) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_0_cafdebf9_4980_490a_8362_e70f1809e776(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i < l.size() - s.size() + 1; i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean isSublist_Problem_0_cafdebf9_4980_490a_8362_e70f1809e776 = True;
                for (int j = 1; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        isSublist_Problem_0_cafdebf9_4980_490a_8362_e70f1809e776 = False;
                        break;
                    }
                }
                if (isSublist_Problem_0_cafdebf9_4980_490a_8362_e70f1809e776) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_0_e5966a00_4148_4d30_bb74_ed44c6d73076(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i < l.size() - s.size() + 1; i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean found = True;
                for (int j = 0; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        found = False;
                        break;
                    }
                }
                if (found) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_1_ed5f0390_8ef6_4fd7_8515_d15ae214c8a8(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i <= l.size() - s.size(); i++) {
            if (l.subList(i, i + s.size()).equals(s)) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_1_f7cdb66d_9ff5_4dd0_a5bc_84f6f69faa85(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_1_c159444a_a3ee_464f_b236_828b0f5ae838(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_0_4e1be89f_f0d5_4782_9c08_724f2071bd64(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) return False;
        for (int i = 0; i < l.size() - s.size() + 1; i++) {
            boolean found = True;
            for (int j = 0; j < s.size(); j++) {
                if (l.get(i + j) != s.get(j)) {
                    found = False;
                    break;
                }
            }
            if (found) return True;
        }
        return False;
    }

    
    public static boolean isSublist_Problem_0_af0921a2_8f33_4785_a4ef_f6d43ad209b1(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size())
            return False;
        for (int i = 0; i < l.size() - s.size() + 1; i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean isSublist_Problem_0_af0921a2_8f33_4785_a4ef_f6d43ad209b1 = True;
                for (int j = 0; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        isSublist_Problem_0_af0921a2_8f33_4785_a4ef_f6d43ad209b1 = False;
                        break;
                    }
                }
                if (isSublist_Problem_0_af0921a2_8f33_4785_a4ef_f6d43ad209b1)
                    return True;
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_1_b9a0b66f_88b2_4bcb_9613_8b97dd47942c(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_2_484f2b08_1d39_4434_8e0a_b79e60ef80a9(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (l.size() < s.size()) {
            return False;
        }
        for (int i = 0; i <= l.size() - s.size(); i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean isSublist_Problem_2_484f2b08_1d39_4434_8e0a_b79e60ef80a9 = True;
                for (int j = 0; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        isSublist_Problem_2_484f2b08_1d39_4434_8e0a_b79e60ef80a9 = False;
                        break;
                    }
                }
                if (isSublist_Problem_2_484f2b08_1d39_4434_8e0a_b79e60ef80a9) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_0_986d93c4_f89a_4e8d_a7a7_0d9146e8dda6(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i < l.size() - s.size() + 1; i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean isSublist_Problem_0_986d93c4_f89a_4e8d_a7a7_0d9146e8dda6 = True;
                for (int j = 1; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        isSublist_Problem_0_986d93c4_f89a_4e8d_a7a7_0d9146e8dda6 = False;
                        break;
                    }
                }
                if (isSublist_Problem_0_986d93c4_f89a_4e8d_a7a7_0d9146e8dda6) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_2_3c5bceaf_6262_43ed_b99b_162928847a56(ArrayList<Integer> l, ArrayList<Integer> s) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i=0; i<l.size(); i++) {
            if (s.contains(l.get(i))) list.add(l.get(i));
        }
        return list.isEmpty();
    }

    
    public static boolean isSublist_Problem_2_69ea369b_9248_4e04_a177_5398b836e7e0(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) return False;
        for (int i = 0; i <= l.size() - s.size(); i++) {
            if (l.subList(i, i + s.size()).equals(s)) return True;
        }
        return False;
    }

    
    public static boolean isSublist_Problem_1_e943792f_b615_45f5_8f5a_d83e79c404b8(ArrayList<Integer> l, ArrayList<Integer> s) {
        ArrayList<Integer> temp = new ArrayList<>();
        for(int i = 0; i < l.size(); i++) {
            for(int j = 0; j < s.size(); j++) {
                if(l.get(i) == s.get(j)) {
                    temp.add(l.get(i));
                }
            }
        }
        return temp.size() == s.size();
    }

    
    public static boolean isSublist_Problem_1_9d5b61d8_f29c_4168_9ff3_1bf54bbcbcc5(ArrayList<Integer> l, ArrayList<Integer> s) {
        int n = l.size();
        int m = s.size();
        if (m > n) {
            return False;
        }
        for (int i = 0; i <= n - m; i++) {
            int j;
            for (j = 0; j < m; j++) {
                if (l.get(i + j) != s.get(j)) {
                    break;
                }
            }
            if (j == m) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_1_194620f5_6ff0_466c_98b9_5f19d357e2b8(ArrayList<Integer> l, ArrayList<Integer> s) {
        boolean result = False;
        for(int i = 0; i < l.size(); i++) {
            for(int j = 0; j < s.size(); j++) {
                if(l.get(i) == s.get(j)) {
                    result = True;
                    break;
                }
            }
        }
        return result;
    }

    
    public static boolean isSublist_Problem_0_be5e6cf3_da1a_471d_b23c_7d4a4079dc05(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i <= l.size() - s.size(); i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean found = True;
                for (int j = 0; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        found = False;
                        break;
                    }
                }
                if (found) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_1_d81341e5_9025_401e_bc26_59dd0a0480b6(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() <= 1) {
            return True;
        }
        List<Integer> l1 = l.subList(0, l.size()-1);
        List<Integer> s1 = s.subList(0, s.size() - 1);
        return l1.equals(s1);
    }

    
    public static boolean isSublist_Problem_1_e3a5ac86_9b37_4614_85d6_285a16e5c5d2(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0;
        int j = 0;
        while(i < l.size() && j < s.size()) {
            if(l.get(i) == s.get(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        return i == l.size() && j == s.size();
    }

    
    public static boolean isSublist_Problem_2_e160d2f5_3d67_451a_add2_64ef9853e198(ArrayList<Integer> l, ArrayList<Integer> s) {
        ArrayList<Integer> sub = new ArrayList<>();
        l.forEach(x -> {
            s.forEach(y -> {
                if (x.equals(y)) {
                    sub.add(x);
                }
            });
        });
        return sub.isEmpty();
    }

    
    public static boolean isSublist_Problem_1_8efd2f0f_5f22_4734_be00_16e55e5326a8(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (l.size() < s.size()) {
            return False;
        }
        boolean result = True;
        for (int i = 0; i < s.size(); i++) {
            result &= (l.get(i) == s.get(i));
        }
        return result;
    }

    
    public static boolean isSublist_Problem_0_2107db2f_9f94_49d7_aeb1_a24c153bd534(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_0_9250528c_815b_4fe8_b5b7_fbdc2026c37c(ArrayList<Integer> l, ArrayList<Integer> s) {
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> s1 = new ArrayList<>();
        for(Integer i : l) {
            l1.add(i);
        }
        for(Integer i : s) {
            s1.add(i);
        }
        boolean result = l1.containsAll(s1);
        return result;
    }

    
    public static boolean isSublist_Problem_2_3cd41338_ee26_482d_bb1d_9f466c1534c6(ArrayList<Integer> l, ArrayList<Integer> s) {
        boolean flag = False;
        for(int i = 0; i < l.size(); i++) {
            for(int j = 0; j < s.size(); j++) {
                if(l.get(i) == s.get(j)) {
                    flag = True;
                    break;
                }
            }
        }
        return flag;
    }

    
    public static boolean isSublist_Problem_2_41131089_d74d_41b2_b695_706990cc0f28(ArrayList<Integer> l, ArrayList<Integer> s) {
        ArrayList<Integer> temp = new ArrayList<>();
        for(Integer i : l) {
            if(!temp.contains(i)) {
                temp.add(i);
            }
        }
        for(Integer i : s) {
            if(!temp.contains(i)) {
                return False;
            }
        }
        return True;
    }

    
    public static boolean isSublist_Problem_1_19964757_e378_41de_b4c3_82315fe95d29(ArrayList<Integer> l, ArrayList<Integer> s) {
        return l.stream().filter(x -> s.contains(x)).count() == s.size();
    }

    
    public static boolean isSublist_Problem_1_4a83d61d_48e6_4357_88f0_03a4b265096e(ArrayList<Integer> l, ArrayList<Integer> s) {
        return l.containsAll(s);
    }

    
    public static boolean isSublist_Problem_0_9d1e2adf_e0a1_4fa1_83d5_f2cff2c75b43(ArrayList<Integer> l, ArrayList<Integer> s) {
        return l.equals(s);
    }

    
    public static boolean isSublist_Problem_2_11e6c338_3567_4fab_a641_342667aaf7ce(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) return False;
        for (int i = 0; i < l.size() - s.size() + 1; i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean isSublist_Problem_2_11e6c338_3567_4fab_a641_342667aaf7ce = True;
                for (int j = 0; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        isSublist_Problem_2_11e6c338_3567_4fab_a641_342667aaf7ce = False;
                        break;
                    }
                }
                if (isSublist_Problem_2_11e6c338_3567_4fab_a641_342667aaf7ce) return True;
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_2_5128dc52_ee0a_485e_9713_4d46b3ee8cd3(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        int i = 0;
        for(Integer e : s) {
            if(i >= l.size()) return False;
            if(l.get(i) != e) return False;
            i++;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_1_19964757_e378_41de_b4c3_82315fe95d29(ArrayList<Integer> l, ArrayList<Integer> s) {
        return l.stream().filter(x -> s.contains(x)).count() == s.size();
    }

    
    public static boolean isSublist_Problem_2_d81341e5_9025_401e_bc26_59dd0a0480b6(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() <= 1) {
            return True;
        }
        List<Integer> l1 = l.subList(0, l.size()-1);
        List<Integer> s1 = s.subList(0, s.size() - 1);
        return l1.equals(s1);
    }

    
    public static boolean isSublist_Problem_1_18e4a846_3f91_4039_83bd_c538e59486b3(ArrayList<Integer> l, ArrayList<Integer> s) {
        int n = l.size();
        int m = s.size();
        for (int i = 0; i <= n - m; i++) {
            int j;
            for (j = 0; j < m; j++) {
                if (l.get(i + j) != s.get(j)) {
                    break;
                }
            }
            if (j == m) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_1_11e6c338_3567_4fab_a641_342667aaf7ce(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) return False;
        for (int i = 0; i < l.size() - s.size() + 1; i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean isSublist_Problem_1_11e6c338_3567_4fab_a641_342667aaf7ce = True;
                for (int j = 0; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        isSublist_Problem_1_11e6c338_3567_4fab_a641_342667aaf7ce = False;
                        break;
                    }
                }
                if (isSublist_Problem_1_11e6c338_3567_4fab_a641_342667aaf7ce) return True;
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_1_eb51cdd1_244d_4820_a34d_863c3f733264(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_1_ee076d96_f32b_4e13_8e13_aef08a7de614(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0;
        int j = 0;
        while (i < l.size() && j < s.size()) {
            if (l.get(i) == s.get(j)) {
                i++;
                j++;
            } else {
                j = 0;
            }
        }
        return i == l.size();
    }

    
    public static boolean isSublist_Problem_2_c0fb15f9_0a64_452d_8f41_735a3851f56e(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i < l.size() - s.size() + 1; i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean isSublist_Problem_2_c0fb15f9_0a64_452d_8f41_735a3851f56e = True;
                for (int j = 0; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        isSublist_Problem_2_c0fb15f9_0a64_452d_8f41_735a3851f56e = False;
                        break;
                    }
                }
                if (isSublist_Problem_2_c0fb15f9_0a64_452d_8f41_735a3851f56e) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_0_0d33a3a1_2d79_4123_8619_1b24112fc357(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_1_98ca632b_6721_4f2f_9645_22d1d0c4e79f(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) return False;
        for (int i = 0; i < l.size(); i++) {
            if (l.get(i) == s.get(0)) {
                boolean found = True;
                for (int j = 0; j < s.size(); j++) {
                    if (i + j >= l.size() || l.get(i + j) != s.get(j)) {
                        found = False;
                        break;
                    }
                }
                if (found) return True;
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_2_1b625091_0042_40f3_8977_6d5f5c41f63c(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (l.size() < s.size()) {
            return False;
        }
        for (int i = 0; i < l.size() - s.size() + 1; i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean found = True;
                for (int j = 0; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        found = False;
                        break;
                    }
                }
                if (found) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_2_cd0da67c_3c71_4b8e_86f8_f15cb18eaa53(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i <= l.size() - s.size(); i++) {
            if (l.subList(i, i + s.size()).equals(s)) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_0_27e263d5_a51f_421a_8988_5591b31198f2(ArrayList<Integer> l, ArrayList<Integer> s) {
        int n = l.size();
        int m = s.size();
        for (int i = 0; i <= n - m; i++) {
            int j;
            for (j = 0; j < m; j++) {
                if (l.get(i + j) != s.get(j)) {
                    break;
                }
            }
            if (j == m) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_2_cafdebf9_4980_490a_8362_e70f1809e776(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i < l.size() - s.size() + 1; i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean isSublist_Problem_2_cafdebf9_4980_490a_8362_e70f1809e776 = True;
                for (int j = 1; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        isSublist_Problem_2_cafdebf9_4980_490a_8362_e70f1809e776 = False;
                        break;
                    }
                }
                if (isSublist_Problem_2_cafdebf9_4980_490a_8362_e70f1809e776) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_0_e8c033da_6676_4f6a_a79d_a29a6eb696c4(ArrayList<Integer> l, ArrayList<Integer> s) {
        ArrayList<Integer> l1 = new ArrayList<>(l);
        ArrayList<Integer> s1 = new ArrayList<>(s);
        boolean result = False;
        for(int i = 0; i < l1.size(); i++) {
            for(int j = 0; j < s1.size(); j++) {
                if(l1.get(i) == s1.get(j)) {
                    result = True;
                }
            }
        }
        return result;
    }

    
    public static boolean isSublist_Problem_1_2d0d6941_9055_451a_8114_09cb579e822f(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) return False;
        for (int i = 0; i <= l.size() - s.size(); i++) {
            if (l.subList(i, i + s.size()).equals(s)) return True;
        }
        return False;
    }

    
    public static boolean isSublist_Problem_0_69ed85ff_5780_4fd6_9714_f9f28f22bede(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0, j = 0;
        while (i < l.size() && j < s.size()) {
            if (l.get(i) == s.get(j)) {
                i++;
                j++;
            } else {
                j = 0;
            }
        }
        return i == l.size() && j == s.size();
    }

    
    public static boolean isSublist_Problem_1_9e57fd22_aa2e_40da_90b1_b35f11da96eb(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0, j = 0;
        for(; i < l.size() && j < s.size(); i++) {
            if(l.get(i) == s.get(j)) {
                j++;
            }
        }
        return j == s.size();
    }

    
    public static boolean isSublist_Problem_2_4e1be89f_f0d5_4782_9c08_724f2071bd64(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) return False;
        for (int i = 0; i < l.size() - s.size() + 1; i++) {
            boolean found = True;
            for (int j = 0; j < s.size(); j++) {
                if (l.get(i + j) != s.get(j)) {
                    found = False;
                    break;
                }
            }
            if (found) return True;
        }
        return False;
    }

    
    public static boolean isSublist_Problem_0_ee8af824_d884_4942_878e_d3b6f8a70e3e(ArrayList<Integer> l, ArrayList<Integer> s) {
        return Arrays.asList(l).containsAll(Arrays.asList(s));
    }

    
    public static boolean isSublist_Problem_1_755f6ed7_a3f3_4d89_a1ce_8c5720ff542e(ArrayList<Integer> l, ArrayList<Integer> s) {
        return l.size() == s.size() && l.subList(0, s.size()).containsAll(s);
    }

    
    public static boolean isSublist_Problem_0_e25d225a_bc2b_4344_a503_be0e012e2fe9(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_0_0931c67a_01fe_488f_a567_c46439b9e35f(ArrayList<Integer> l, ArrayList<Integer> s) {
        for (Integer i : l) {
            if (l.contains(i)) {
                for (Integer j : s) {
                    if (l.contains(j))
                        return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_2_cc9c279d_a3df_4527_8574_73033532f9c1(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_0_2d81b165_e11c_48cc_ae38_19008e66e8cd(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_1_b3c46029_748c_4bf6_ba3e_9ca47c308ec2(ArrayList<Integer> l, ArrayList<Integer> s) {
        ArrayList<Integer> l1 = new ArrayList<Integer>(l);
        ArrayList<Integer> s1 = new ArrayList<Integer>(s);
        Collections.sort(l1);
        Collections.sort(s1);
        if (l1.equals(s1)) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isSublist_Problem_2_78c63d39_ea81_4843_8b16_4825d1f7e4fa(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (l.size() < s.size()) return False;
        if (l.size() == s.size()) {
            for (int i = 0; i < l.size(); i++) {
                if (l.get(i) != s.get(i)) return False;
            }
            return True;
        }
        for (int i = 0; i < l.size() - s.size(); i++) {
            boolean found = True;
            for (int j = 0; j < s.size(); j++) {
                if (l.get(i+j) != s.get(j)) {
                    found = False;
                    break;
                }
            }
            if (found) return True;
        }
        return False;
    }

    
    public static boolean isSublist_Problem_1_1c273275_0945_4334_8a52_149e439eb20c(ArrayList<Integer> l, ArrayList<Integer> s) {
        // Your code here
        // The idea is to keep a flag indicating whether a particular sub-array is present or not.
        // If flag is set to True, then it means the sub-array is present and hence return True else return False.
        boolean flag = False;

        for(int i=0; i<l.size()-1; i++) {
            for(int j=i+1; j<l.size(); j++) {
                if (s.get(i).equals(l.get(j))) {
                    flag = True;
                }
            }
        }
        return flag;
    }

    
    public static boolean isSublist_Problem_1_ce29be5d_d3a1_4885_a668_ad13d57c6581(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i <= l.size() - s.size(); i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean isSublist_Problem_1_ce29be5d_d3a1_4885_a668_ad13d57c6581 = True;
                for (int j = 0; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        isSublist_Problem_1_ce29be5d_d3a1_4885_a668_ad13d57c6581 = False;
                        break;
                    }
                }
                if (isSublist_Problem_1_ce29be5d_d3a1_4885_a668_ad13d57c6581) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_1_1a881533_0284_4000_aa94_33bd1ebeea11(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (l.size() < s.size()) {
            return False;
        }
        for (int i = 0; i < s.size(); i++) {
            if (l.get(i) != s.get(i)) {
                return False;
            }
        }
        return True;
    }

    
    public static boolean isSublist_Problem_1_1f4026b1_a985_4ce6_bfa2_afb00b18a8e9(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_1_2a41d708_d094_4792_aa8d_5cb9daa41e63(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) return False;
        for (int i = 0; i < l.size() - s.size() + 1; i++) {
            boolean isSub = True;
            for (int j = 0; j < s.size(); j++) {
                if (l.get(i + j) != s.get(j)) {
                    isSub = False;
                    break;
                }
            }
            if (isSub) return True;
        }
        return False;
    }

    
    public static boolean isSublist_Problem_0_af0921a2_8f33_4785_a4ef_f6d43ad209b1(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size())
            return False;
        for (int i = 0; i < l.size() - s.size() + 1; i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean isSublist_Problem_0_af0921a2_8f33_4785_a4ef_f6d43ad209b1 = True;
                for (int j = 0; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        isSublist_Problem_0_af0921a2_8f33_4785_a4ef_f6d43ad209b1 = False;
                        break;
                    }
                }
                if (isSublist_Problem_0_af0921a2_8f33_4785_a4ef_f6d43ad209b1)
                    return True;
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_1_8a031536_4dd5_47ad_9338_92d19739d184(ArrayList<Integer> l, ArrayList<Integer> s) {
        return l.containsAll(s);
    }

    
    public static boolean isSublist_Problem_2_09ce9c0e_c2ff_489c_9955_00c4ad6ed772(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (l.size() < s.size()) return False;
        for (int i = 0; i < s.size(); i++) {
            if (l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_2_817894ac_6d26_4a18_90f8_58672498e0bf(ArrayList<Integer> l, ArrayList<Integer> s) {
        boolean result = False;
        for(int i = 0; i < l.size(); i++) {
            for(int j = 0; j < s.size(); j++) {
                if(l.get(i) == s.get(j)) {
                    result = True;
                    break;
                }
            }
        }
        return result;
    }

    
    public static boolean isSublist_Problem_0_82bd1def_a3cd_4ea4_8a72_c228a5655a60(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_2_8018e0d5_9009_404c_89cb_3f7550d4ddb4(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0;
        int j = 0;
        while(i < l.size() && j < s.size()) {
            if(l.get(i) == s.get(j)) {
                i++;
                j++;
            } else {
                i = i + j;
                j = 0;
            }
        }
        return i == l.size();
    }

    
    public static boolean isSublist_Problem_2_5b926126_5fe0_49ee_8722_e4d3235bfee1(ArrayList<Integer> l, ArrayList<Integer> s) {
        return l.stream().anyMatch(i -> s.stream().anyMatch(j -> i.equals(j)));
    }

    
    public static boolean isSublist_Problem_2_529e52f7_3aa9_4177_8d09_f97616c4e75c(ArrayList<Integer> l, ArrayList<Integer> s) {
        int n = l.size();
        int m = s.size();
        if (m > n) return False;
        int i = 0, j = 0;
        while (i < n && j < m) {
            if (l.get(i).equals(s.get(j))) {
                i++;
                j++;
            } else {
                i = i - j + 1;
                j = 0;
            }
        }
        return j == m;
    }

    
    public static boolean isSublist_Problem_2_bedc7cdf_a2d7_4ed4_8c1e_f1ca2ae66b8a(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() > l.size()) {
            return False;
        }
        for (int i = 0; i <= l.size() - s.size(); i++) {
            if (l.subList(i, i + s.size()).equals(s)) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_2_b3c46029_748c_4bf6_ba3e_9ca47c308ec2(ArrayList<Integer> l, ArrayList<Integer> s) {
        ArrayList<Integer> l1 = new ArrayList<Integer>(l);
        ArrayList<Integer> s1 = new ArrayList<Integer>(s);
        Collections.sort(l1);
        Collections.sort(s1);
        if (l1.equals(s1)) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isSublist_Problem_2_550b69d3_dc85_492b_beb8_fa734122e4b9(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_1_b6f53d05_b6da_430f_b239_adab87e082d0(ArrayList<Integer> l, ArrayList<Integer> s) {
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < l.size() && j < s.size()) {
            if (l.get(i) == s.get(j)) {
                i++;
                j++;
                k++;
            } else if (l.get(i) < s.get(j)) {
                i++;
            } else {
                j++;
            }
        }
        return k == s.size();
    }

    
    public static boolean isSublist_Problem_1_19964757_e378_41de_b4c3_82315fe95d29(ArrayList<Integer> l, ArrayList<Integer> s) {
        return l.stream().filter(x -> s.contains(x)).count() == s.size();
    }

    
    public static boolean isSublist_Problem_1_984d5cb9_605f_445f_b5a5_74afcbff58e5(ArrayList<Integer> l, ArrayList<Integer> s) {
        boolean b = False;
        for (Integer aInteger : l) {
            if (s.contains(aInteger)) {
                b = True;
            }
        }
        return b;
    }

    
    public static boolean isSublist_Problem_2_0e0b028a_bc6d_4535_a417_eca332ac7d67(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() < s.size()) return False;
        for(int i = 0; i < s.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_0_27967709_3d6c_40b5_8806_be77c8f54739(ArrayList<Integer> l, ArrayList<Integer> s) {
        if(l.size() > s.size()) return False;
        for(int i = 0; i < l.size(); i++) {
            if(l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_1_2938fda2_ade7_4f89_b86a_d777d4fbeb96(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (l.size() < s.size()) return False;
        for (int i = 0; i < s.size(); i++) {
            if (l.get(i) != s.get(i)) return False;
        }
        return True;
    }

    
    public static boolean isSublist_Problem_0_1b625091_0042_40f3_8977_6d5f5c41f63c(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (l.size() < s.size()) {
            return False;
        }
        for (int i = 0; i < l.size() - s.size() + 1; i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean found = True;
                for (int j = 0; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        found = False;
                        break;
                    }
                }
                if (found) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_1_165236cf_c4db_425b_848a_b50020404234(ArrayList<Integer> l, ArrayList<Integer> s) {
        if (s.size() == 0) {
            return True;
        }
        if (l.size() == 0) {
            return False;
        }
        if (l.size() < s.size()) {
            return False;
        }
        for (int i = 0; i < l.size() - s.size() + 1; i++) {
            if (l.get(i).equals(s.get(0))) {
                boolean found = True;
                for (int j = 0; j < s.size(); j++) {
                    if (!l.get(i + j).equals(s.get(j))) {
                        found = False;
                        break;
                    }
                }
                if (found) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean isSublist_Problem_1_459083b2_21dd_46b3_ad42_2cd312eb5cc2(ArrayList<Integer> l, ArrayList<Integer> s) {
        ArrayList<Integer> l1 = new ArrayList<>(l);
        ArrayList<Integer> s1 = new ArrayList<>(s);
        boolean flag = False;
        for(int i = 0; i < l1.size(); i++) {
            for(int j = 0; j < s1.size(); j++) {
                if(l1.get(i).equals(s1.get(j))) {
                    flag = True;
                    break;
                }
            }
        }
        return flag;
    }

}
