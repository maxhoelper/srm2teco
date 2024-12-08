package mbpp_414_overlapping;

public class mbpp_414_overlapping {

    
    public static boolean overlapping_Problem_2_d5cdb1fb_5953_4999_9c83_7fa477e6ba83(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        HashSet<Integer> set = new HashSet<Integer>();
        for (Integer i : list1) {
            set.add(i);
        }
        for (Integer i : list2) {
            if (set.contains(i)) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean overlapping_Problem_0_453a661b_0031_47e4_999c_37b92be98b1f(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        HashSet<Integer> set = new HashSet<Integer>();
        for (Integer i : list1) {
            set.add(i);
        }
        for (Integer i : list2) {
            if (set.contains(i)) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean overlapping_Problem_1_ef1a233d_9534_4a9d_bb55_36d1b76cbeb9(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        for (Integer l1 : list1) {
            for (Integer l2 : list2) {
                if (l1 == l2) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean overlapping_Problem_0_d5cdb1fb_5953_4999_9c83_7fa477e6ba83(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        HashSet<Integer> set = new HashSet<Integer>();
        for (Integer i : list1) {
            set.add(i);
        }
        for (Integer i : list2) {
            if (set.contains(i)) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean overlapping_Problem_0_251f058e_f2d6_4178_8bb9_8d4ca4a4310b(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        HashSet<Integer> set1 = new HashSet<Integer>(list1);
        HashSet<Integer> set2 = new HashSet<Integer>(list2);
        return !Collections.disjoint(set1, set2);
    }

    
    public static boolean overlapping_Problem_1_fc5c6b02_213b_4a8f_b816_00ff5eb70f6f(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        // Write your code here
        if (list1.size() == list2.size()){
            return False;
        }
        else{
            return True;
        }
    }

    
    public static boolean overlapping_Problem_2_f8d9ed79_6359_497d_869d_6e3e3943b854(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        boolean result = False;
        if(list1.size() == 0 && list2.size() == 0) {
            result = True;
        }
        if(list1.size() > 0) {
            for(int i = 0; i < list1.size(); i++) {
                if(list1.get(i) > 0 && list2.get(i) > 0) {
                    result = True;
                    break;
                }
            }
        }
        return result;
    }

    
    public static boolean overlapping_Problem_1_9e58ca21_ad32_40b3_b64f_f75501a6c87c(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        HashSet<Integer> set = new HashSet<Integer>();
        for (Integer x : list1) {
            set.add(x);
        }
        for (Integer x : list2) {
            if (set.contains(x)) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean overlapping_Problem_0_dd50bc07_3433_4e46_b333_075ffd0212e7(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        for (Integer i : list1) {
            if (list2.contains(i)) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean overlapping_Problem_2_e639653b_0f59_46f9_b518_51855f2b2337(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        for (Integer i : list1) {
            if (list2.contains(i)) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean overlapping_Problem_1_acfe596b_5f53_47c0_891b_1950a885d7bb(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        HashSet<Integer> set1 = new HashSet<Integer>(list1);
        HashSet<Integer> set2 = new HashSet<Integer>(list2);
        for (Integer item : set1) {
            if (set2.contains(item)) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean overlapping_Problem_2_6ee61519_93e0_43cd_b670_5577f3bbd6a5(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        for (int i = 0; i < list1.size(); i++) {
            for (int j = 0; j < list2.size(); j++) {
                if (list1.get(i) == list2.get(j)) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean overlapping_Problem_2_ebeefca3_2609_408f_b83d_8d75bf6a1aa0(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        return list1.stream().anyMatch(list2::contains);
    }

    
    public static boolean overlapping_Problem_1_2a958e97_f95e_4c6d_8a6f_43b9ed75bf03(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        HashSet<Integer> set = new HashSet<>();
        for (Integer i : list1) {
            set.add(i);
        }
        for (Integer i : list2) {
            if (set.contains(i)) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean overlapping_Problem_0_813a2e0f_6106_4352_9c0b_a1c7f30ef3f2(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        return list2.stream().anyMatch(list1::contains);
    }

    
    public static boolean overlapping_Problem_2_1a5bac6f_0b02_455c_abec_92c231a02dc6(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        HashSet<Integer> set = new HashSet<Integer>();
        for (Integer i : list1) {
            set.add(i);
        }
        for (Integer i : list2) {
            if (set.contains(i)) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean overlapping_Problem_0_84c60735_9fbd_4aaa_bcaa_4e4f1943f9b9(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        HashSet<Integer> set1 = new HashSet<Integer>(list1);
        HashSet<Integer> set2 = new HashSet<Integer>(list2);
        return !Collections.disjoint(set1, set2);
    }

    
    public static boolean overlapping_Problem_2_86fdd115_a2ea_4d08_b528_46b846262bb2(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        for(int i = 0; i < list2.size(); i++) {
            for(int j = 0; j < list1.size(); j++) {
                if(list2.get(i).equals(list1.get(j))) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean overlapping_Problem_1_f4bec62a_6b82_404b_a971_0a052b762079(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        HashSet<Integer> set = new HashSet<Integer>();
        for (Integer i : list1) {
            set.add(i);
        }
        for (Integer i : list2) {
            if (set.contains(i)) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean overlapping_Problem_0_1186a1c4_96c5_4283_ab2a_12a62bdeb15f(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        for (int i = 0; i < list1.size(); i++) {
            for (int j = 0; j < list2.size(); j++) {
                if (list1.get(i) == list2.get(j)) return True;
            }
        }
        return False;
    }

    
    public static boolean overlapping_Problem_1_bb33b041_7f26_4f5a_91b7_0cdf8ebb7f65(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        for (Integer i : list1) {
            if (list2.contains(i)) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean overlapping_Problem_2_7d775cf7_9c83_4866_a680_6f61677a46a7(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        HashSet<Integer> set1 = new HashSet<Integer>(list1);
        HashSet<Integer> set2 = new HashSet<Integer>(list2);
        for (Integer item : set1) {
            if (set2.contains(item)) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean overlapping_Problem_0_7b4024fe_13b4_4b3b_8f9e_cbedf10f3918(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        for (Integer i : list1) {
            if (list2.contains(i)) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean overlapping_Problem_2_114d77ad_9255_424e_97c2_ce93c15e8ed6(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        boolean result = False;
        if (list1.size() > list2.size()) {
            list2.addAll(list1);
        }
        for (Integer i : list1) {
            for (Integer j : list2) {
                if (i.equals(j)) {
                    result = True;
                    break;
                }
            }
        }
        return result;
    }

    
    public static boolean overlapping_Problem_2_c1b2720a_05e3_4ba0_97b1_d49cc2054b15(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        HashSet<Integer> set1 = new HashSet<Integer>(list1);
        HashSet<Integer> set2 = new HashSet<Integer>(list2);
        for (Integer i : set2) {
            if (set1.contains(i)) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean overlapping_Problem_1_caae6c6a_5e60_420f_a8cc_c349e47b3df5(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        Iterator<Integer> it = list2.iterator();
        while(it.hasNext()){
            Integer a = it.next();
            if(list1.contains(a))
                return True;
        }
        return False;
    }

    
    public static boolean overlapping_Problem_2_b780ad9f_a2b6_4d25_b3d6_30dadb9049e2(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        ArrayList<Integer> list3 = new ArrayList<>();
        int max1 = list1.get(0).intValue();
        int min1 = list1.get(list1.size() - 1).intValue();
        int max2 = list2.get(0).intValue();
        int min2 = list2.get(list2.size() - 1).intValue();
        int max3 = Math.max(max1, max2);
        int min3 = Math.min(min1, min2);
        for (int i = min3; i <= max3; i++) {
            if (list1.contains(i)) {
                list3.add(i);
            }
        }
        for (int i = min3; i <= max3; i++) {
            if (list2.contains(i)) {
                list3.add(i);
            }
        }
        list3.removeAll(new ArrayList<>(list1));
        list3.removeAll(new ArrayList<>(list2));
        if (list3.isEmpty()) {
            return True;
        }
        else {
            return False;
        }
    }

    
    public static boolean overlapping_Problem_2_264154b9_b361_4ce8_a179_cc68607f13be(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        // Write your code here
        // To print results to the standard output you can use System.out.println()
        // Example: System.out.println("Hello world!");
        return list1.stream().anyMatch(list2::contains);
    }

    
    public static boolean overlapping_Problem_1_f8fc0b0f_a674_4206_a3ff_5d1a8aa8841d(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        HashSet<Integer> set = new HashSet<Integer>();
        for (Integer i : list1) {
            set.add(i);
        }
        for (Integer i : list2) {
            if (set.contains(i)) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean overlapping_Problem_1_251f058e_f2d6_4178_8bb9_8d4ca4a4310b(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        HashSet<Integer> set1 = new HashSet<Integer>(list1);
        HashSet<Integer> set2 = new HashSet<Integer>(list2);
        return !Collections.disjoint(set1, set2);
    }

    
    public static boolean overlapping_Problem_1_def2d1ec_63c6_45da_af67_31b4d57af272(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        int index1 = 0;
        int index2 = 0;
        int size = list1.size() > list2.size() ? list1.size() : list2.size();
        for (int i = 0; i < size; i++) {
            if (list1.get(index1) == list2.get(index2)) {
                index2++;
                if (index2 == list2.size()) {
                    return True;
                }
            } else {
                index2 = 0;
                index1++;
            }
        }
        return False;
    }

    
    public static boolean overlapping_Problem_2_b18c7acc_961f_433d_bbae_3361dad68f2e(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        for (Integer i : list1) {
            if (list2.contains(i)) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean overlapping_Problem_0_4bfd036f_07d9_41ae_848f_03101d34444b(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        int len = list1.size();
        for (int i = 0; i < len; ++i) {
            if (list1.get(i) == list2.get(i)) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean overlapping_Problem_2_588ca6a1_77b1_4f2f_865f_dd837809cd5e(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        HashSet<Integer> set = new HashSet<>();
        for (Integer i : list1) {
            set.add(i);
        }
        for (Integer i : list2) {
            if (set.contains(i)) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean overlapping_Problem_1_84c60735_9fbd_4aaa_bcaa_4e4f1943f9b9(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        HashSet<Integer> set1 = new HashSet<Integer>(list1);
        HashSet<Integer> set2 = new HashSet<Integer>(list2);
        return !Collections.disjoint(set1, set2);
    }

    
    public static boolean overlapping_Problem_1_b26e5418_d8bc_4e54_b9bc_86fe6e0c3953(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        for(Integer i : list1) {
            for(Integer j : list2) {
                if(i == j) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean overlapping_Problem_2_aa595fbf_4efe_445b_a0db_7244f852c7c2(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        HashSet<Integer> set1 = new HashSet<Integer>(list1);
        HashSet<Integer> set2 = new HashSet<Integer>(list2);
        for (Integer i : set1) {
            if (set2.contains(i)) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean overlapping_Problem_0_1182da36_2dd3_4da6_b074_b1ad07748764(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        HashSet<Integer> set1 = new HashSet<Integer>(list1);
        HashSet<Integer> set2 = new HashSet<Integer>(list2);
        return !Collections.disjoint(set1, set2);
    }

    
    public static boolean overlapping_Problem_2_5e8c9230_095d_4f56_88b8_c98712294870(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        return list1.stream().anyMatch(list2::contains);
    }

    
    public static boolean overlapping_Problem_0_0f2f5a8b_f064_4b9b_ae85_9731b5c8b38b(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        HashSet<Integer> set = new HashSet<Integer>();
        for (Integer i : list1) {
            set.add(i);
        }
        for (Integer i : list2) {
            if (set.contains(i)) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean overlapping_Problem_2_a0018d79_e6e6_4d0e_8db3_2231ea0bdbfc(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        for (Integer l : list1) {
            if (list2.contains(l)) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean overlapping_Problem_1_f9f51c47_4887_4c54_80a1_f0b84b06004a(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        if (list2.size() > list1.size()) {
            list2.subList(list1.size(), list2.size())
                    .forEach((e) -> {
                        list2.remove(e);
                    });
        }
        boolean isExist = False;
        int firstValue = list1.get(0);
        int secondValue = list2.get(0);
        int minVal = Collections.min(list1);
        int maxVal = Collections.max(list1);
        for (Integer value : list2) {
            int first = value.compareTo(firstValue);
            int second = value.compareTo(secondValue);
            if (first < 0) {
                firstValue = value;
            } else if (second < 0) {
                secondValue = value;
            } else if (first == 0 && second > 0) {
                isExist = True;
                firstValue = value;
                secondValue = value;
            } else if (first == 0 && second < 0) {
                isExist = False;
                break;
            }
        }
        return isExist;
    }

    
    public static boolean overlapping_Problem_0_caae6c6a_5e60_420f_a8cc_c349e47b3df5(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        Iterator<Integer> it = list2.iterator();
        while(it.hasNext()){
            Integer a = it.next();
            if(list1.contains(a))
                return True;
        }
        return False;
    }

    
    public static boolean overlapping_Problem_2_b2f29ed1_8bf5_448e_aca3_b52d189e4eee(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        HashSet<Integer> set = new HashSet<Integer>();
        for (Integer i : list1) {
            set.add(i);
        }
        for (Integer i : list2) {
            if (set.contains(i)) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean overlapping_Problem_1_b9d09213_a689_481d_a7ae_5876a9f7e28c(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        for(Integer list2Element : list2) {
            boolean flag = False;
            for(Integer list1Element : list1) {
                if(list2Element == list1Element) {
                    flag = True;
                    break;
                }
            }
            if(!flag) {
                return False;
            }
        }
        return True;
    }

    
    public static boolean overlapping_Problem_0_0187fa4a_e44c_48b9_9c91_2842c9b83d94(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        HashSet<Integer> set1 = new HashSet<Integer>(list1);
        HashSet<Integer> set2 = new HashSet<Integer>(list2);
        for (Integer i : set1) {
            if (set2.contains(i)) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean overlapping_Problem_1_aa595fbf_4efe_445b_a0db_7244f852c7c2(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        HashSet<Integer> set1 = new HashSet<Integer>(list1);
        HashSet<Integer> set2 = new HashSet<Integer>(list2);
        for (Integer i : set1) {
            if (set2.contains(i)) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean overlapping_Problem_2_75940790_adfe_4fb1_bfad_ff8d22fab634(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        HashSet<Integer> set1 = new HashSet<Integer>(list1);
        HashSet<Integer> set2 = new HashSet<Integer>(list2);
        for (Integer item : set1) {
            if (set2.contains(item)) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean overlapping_Problem_1_7b4024fe_13b4_4b3b_8f9e_cbedf10f3918(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        for (Integer i : list1) {
            if (list2.contains(i)) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean overlapping_Problem_2_d97317ae_0d7c_4dd1_84fe_ce889b2904d1(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        // Write your logic here
        for(int i : list1){
            for(int j : list2){
                if(i != j){
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean overlapping_Problem_2_97bb019c_6aa6_4d0a_acec_a3abc740e1aa(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        HashSet<Integer> set1 = new HashSet<Integer>(list1);
        HashSet<Integer> set2 = new HashSet<Integer>(list2);
        return !Collections.disjoint(set1, set2);
    }

    
    public static boolean overlapping_Problem_0_c2ebb656_20af_4f1b_beda_d136fa654698(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        return list1.stream().anyMatch(list2::contains);
    }

    
    public static boolean overlapping_Problem_1_8c2d3186_3316_4774_a6b0_3ba17301633e(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        HashSet<Integer> set1 = new HashSet<>(list1);
        HashSet<Integer> set2 = new HashSet<>(list2);
        for (Integer i : set1) {
            if (set2.contains(i)) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean overlapping_Problem_1_f776eb8f_ddf0_4faf_b7bb_a217068e9fe7(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        return list1.stream().anyMatch(list2::contains);
    }

    
    public static boolean overlapping_Problem_2_a67d887a_e932_42e2_9b6d_95428229bb11(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        // Write your code here
        Integer sum1 = 0L, sum2 = 0L;
        for (Integer i : list1) {
            sum1 += i;
        }
        for (Integer i : list2) {
            sum2 += i;
        }
        return sum1.equals(sum2);
    }

    
    public static boolean overlapping_Problem_1_79451152_b647_4f91_b2fa_0add6c530509(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        return list1.stream().anyMatch(list2::contains);
    }

    
    public static boolean overlapping_Problem_0_20d0dcba_357f_4292_bf94_2d250bc6fe0f(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        list1.removeAll(list2);
        return (list1.isEmpty() || list2.isEmpty());
    }

    
    public static boolean overlapping_Problem_0_06e44d6d_cf6f_400e_bce9_0b1db8356039(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        if(list1.size() != list2.size())
            return False;

        int max = Math.max(list1.size(), list2.size());
        for(int i = 0; i < max; i++) {
            if(!list1.get(i).equals(list2.get(i)))
                return False;
        }
        return True;
    }

    
    public static boolean overlapping_Problem_0_b0b41b8e_eeb1_46c2_8f9c_855c0acfb769(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        HashSet<Integer> set = new HashSet<>();
        for (Integer i : list1) {
            set.add(i);
        }
        for (Integer i : list2) {
            if (set.contains(i)) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean overlapping_Problem_2_e79ee4dc_1ab3_4220_b66d_2eb172a94e14(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        return list1.stream().anyMatch(list2::contains);
    }

    
    public static boolean overlapping_Problem_0_bf438a1a_7ca5_4af5_b959_ab509834cd5a(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        boolean result = False;
        if (list1.size() > 0 && list2.size() > 0) {
            int first = list1.get(0);
            int last = list2.get(list2.size() - 1);
            int mid = first + (last - first) / 2;
            for (int i = 0; i < list1.size(); i++) {
                if (list1.get(i) == mid) {
                    result = True;
                    break;
                }
            }
            for (int i = 0; i < list2.size(); i++) {
                if (list2.get(i) == mid) {
                    result = True;
                    break;
                }
            }
        }
        return result;
    }

    
    public static boolean overlapping_Problem_0_8d5063b1_d05f_49e5_b6a2_a366a6de66db(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        int len = list1.size();
        int len_of_list2 = list2.size();
        boolean flag = False;
        
        if(list1.isEmpty() || list2.isEmpty())
            return flag;
        
        for(int i=0;i<len;i++) {
            for(int j=0;j<len_of_list2;j++) {
                if(list1.get(i)>list2.get(j)) {
                    flag = True;
                    break;
                }
            }
        }
        
        return flag;
    }

    
    public static boolean overlapping_Problem_1_f78818fd_ec96_40c7_9c47_ce0614fd4d18(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        return list1.stream().anyMatch(list2::contains);
    }

    
    public static boolean overlapping_Problem_0_d606f45c_01f9_4071_a38e_27dd81e19508(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        for (Integer val : list1) {
            boolean result = False;
            for (Integer val2 : list2) {
                if (val == val2) {
                    result = True;
                    break;
                }
            }
            if (!result) {
                return False;
            }
        }
        return True;
    }

    
    public static boolean overlapping_Problem_0_d97d8943_e338_430f_afd6_333edb4cb244(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        HashSet<Integer> set1 = new HashSet<Integer>(list1);
        HashSet<Integer> set2 = new HashSet<Integer>(list2);
        for (Integer i : set1) {
            if (set2.contains(i)) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean overlapping_Problem_1_cb90bd61_91aa_49b4_86e4_5bcf5dbec02e(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        for (Integer i : list1) {
            if (list2.contains(i)) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean overlapping_Problem_1_f988c8a4_3df1_43a2_8652_dd9fcb6cd5d1(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        return list1.stream().anyMatch(list2::contains);
    }

    
    public static boolean overlapping_Problem_0_4db7083d_3206_4906_8fd6_462f2e54c39f(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        if(list1.size() != list2.size()){
            return False;
        }
        int first1 = list1.get(0); // list1 first element
        int last1 = list1.get(list1.size() - 1); // list1 last element
        int first2 = list2.get(0); // list2 first element
        int last2 = list2.get(list2.size() - 1); // list2 last element
        // System.out.println("first1: "+first1+" last1: "+last1+" first2: "+first2+" last2: "+last2);
        for (int i = first1; i <= last1; i++) {
            for (int j = first2; j <= last2; j++) {
                if(list1.contains(list2)){
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean overlapping_Problem_1_b7581cec_dff8_474a_a38c_ad97f2d01c05(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        Set<Integer> set1 = new HashSet<>(list1);
        Set<Integer> set2 = new HashSet<>(list2);
        set1.retainAll(set2);
        return !set1.isEmpty();
    }

    
    public static boolean overlapping_Problem_2_5c9c065d_de98_4bf3_bdd4_55960fc81e12(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        HashSet<Integer> set1 = new HashSet<Integer>(list1);
        HashSet<Integer> set2 = new HashSet<Integer>(list2);
        for (Integer i : set1) {
            if (set2.contains(i)) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean overlapping_Problem_2_dde42b28_2831_4463_96c0_282b3ef098ad(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        HashSet<Integer> set = new HashSet<Integer>();
        for (Integer i : list1) {
            set.add(i);
        }
        for (Integer i : list2) {
            if (set.contains(i)) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean overlapping_Problem_2_06e44d6d_cf6f_400e_bce9_0b1db8356039(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        if(list1.size() != list2.size())
            return False;

        int max = Math.max(list1.size(), list2.size());
        for(int i = 0; i < max; i++) {
            if(!list1.get(i).equals(list2.get(i)))
                return False;
        }
        return True;
    }

    
    public static boolean overlapping_Problem_2_416e4a6a_f307_4407_b3f5_988d526d9b8c(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        return list2.stream().anyMatch(l -> list1.contains(l));
    }

    
    public static boolean overlapping_Problem_1_bf438a1a_7ca5_4af5_b959_ab509834cd5a(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        boolean result = False;
        if (list1.size() > 0 && list2.size() > 0) {
            int first = list1.get(0);
            int last = list2.get(list2.size() - 1);
            int mid = first + (last - first) / 2;
            for (int i = 0; i < list1.size(); i++) {
                if (list1.get(i) == mid) {
                    result = True;
                    break;
                }
            }
            for (int i = 0; i < list2.size(); i++) {
                if (list2.get(i) == mid) {
                    result = True;
                    break;
                }
            }
        }
        return result;
    }

    
    public static boolean overlapping_Problem_0_f4bec62a_6b82_404b_a971_0a052b762079(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        HashSet<Integer> set = new HashSet<Integer>();
        for (Integer i : list1) {
            set.add(i);
        }
        for (Integer i : list2) {
            if (set.contains(i)) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean overlapping_Problem_0_e9cb28ba_3336_405b_a8dd_dc9517062ce9(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        for (Integer i : list1) {
            if (list2.contains(i)) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean overlapping_Problem_0_979a8787_746e_4d5f_a1a8_3c5d6c97b3b6(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        int a = list1.get(0);
        int b = list2.get(0);
        int c = list1.get(list1.size()-1);
        int d = list2.get(list2.size()-1);
        if (a <= c && c <= b) {
            return True;
        }
        else if (b <= d && d <= c) {
            return True;
        }
        else if (c <= a && a <= d) {
            return True;
        }
        else if (d <= b && b <= c) {
            return True;
        }
        else 
            return False;
    }

    
    public static boolean overlapping_Problem_0_2e32d259_1a3b_41b4_919d_469aa0935919(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        // Complete this function
        int min1 = list1.get(0);
        int max1 = list1.get(0);
        int min2 = list2.get(0);
        int max2 = list2.get(0);
        for (int i : list1) {
            min1 = Math.min(min1, i);
            max1 = Math.max(max1, i);
        }
        for (int i : list2) {
            min2 = Math.min(min2, i);
            max2 = Math.max(max2, i);
        }
        if (max1 >= min2 && max2 >= min1) {
            return True;
        }
        return False;
    }

    
    public static boolean overlapping_Problem_2_9e98862f_55ca_4131_a2ba_5fb689dcdaf3(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();
        for (Integer val : list1) {
            l1.add(val);
        }
        for (Integer val : list2) {
            l2.add(val);
        }
        return l1.stream().anyMatch(t -> l2.contains(t));
    }

    
    public static boolean overlapping_Problem_2_146082dd_0b29_4679_8d10_317720460669(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        HashSet<Integer> set = new HashSet<>();
        for (Integer i : list1) {
            set.add(i);
        }
        for (Integer i : list2) {
            if (set.contains(i)) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean overlapping_Problem_2_712e66c3_9e70_4ff2_985c_5b761e7b49a5(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        if (list2.isEmpty()) return False;
        int max = list1.get(0); 
        for (int l: list1) 
            if (l > max) 
                max = l;
        int min = list1.get(0);
        for (int l: list1) 
            if (l < min) 
                min = l;
        return max <= min;
    }

    
    public static boolean overlapping_Problem_2_77991d03_3b70_473a_805a_a2a07c4bedd3(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        HashSet<Integer> set1 = new HashSet<Integer>(list1);
        HashSet<Integer> set2 = new HashSet<Integer>(list2);
        return !Collections.disjoint(set1, set2);
    }

    
    public static boolean overlapping_Problem_1_a0b99bbc_ae6b_4239_b499_3c5ff6dc7b2f(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        HashSet<Integer> set = new HashSet<>();
        for (Integer l : list1) {
            set.add(l);
        }
        for (Integer l : list2) {
            if (set.contains(l)) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean overlapping_Problem_0_f50b40a3_0a75_4ce9_8e04_2ea2d00d5ec7(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        boolean result = False;
        for (int i : list1) {
            if (list2.contains(i)) {
                result = True;
                break;
            }
        }
        return result;
    }

    
    public static boolean overlapping_Problem_0_ec88573a_cbe3_4663_afb2_6367236eb258(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        for (int i = 0; i < list1.size(); i++) {
            if (list2.contains(list1.get(i))) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean overlapping_Problem_0_660212ea_616b_4f98_ae1c_1dd895766084(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        HashSet<Integer> set = new HashSet<>();
        for (Integer i : list1) {
            set.add(i);
        }
        for (Integer i : list2) {
            if (set.contains(i)) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean overlapping_Problem_1_11b128da_e7f2_49a7_a2d2_cb617658c434(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        boolean isOverlap = False;
        for (Integer i : list1) {
            for (Integer j : list2) {
                if (i.equals(j)) {
                    isOverlap = True;
                    break;
                }
            }
        }
        return isOverlap;
    }

    
    public static boolean overlapping_Problem_0_7b27ce77_73ed_45fc_af75_428df4927283(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        // return list1.stream().anyMatch(l1 -> list2.contains(l1));
        return list1.parallelStream().anyMatch(l1 -> list2.contains(l1));
    }

    
    public static boolean overlapping_Problem_1_2917ad95_c64c_4edf_b86f_891a212d1f9b(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        for (Integer i : list1) {
            for (Integer j : list2) {
                if (i == j) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean overlapping_Problem_2_d5f6151f_e787_4c85_ae4f_20df73b946de(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        boolean result = False;
        // Write your code here
        for (Integer i : list1) {
            if (list2.contains(i)) {
                result = True;
                break;
            }
        }
        return result;
    }

    
    public static boolean overlapping_Problem_0_42bbe8ba_57c8_4fb4_8636_cc262e46df91(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        return list1.stream().anyMatch(list2::contains);
    }

    
    public static boolean overlapping_Problem_0_a3f19b63_5c6e_4d6c_bb4d_a28910a39017(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        HashSet<Integer> set1 = new HashSet<>(list1);
        HashSet<Integer> set2 = new HashSet<>(list2);
        for (Integer l : set1) {
            if (set2.contains(l)) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean overlapping_Problem_2_5f62d934_36a4_41ab_ba0c_f2c94385677f(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        return list1.stream().anyMatch(l -> list2.contains(l));
    }

    
    public static boolean overlapping_Problem_1_339ebd35_f386_4bd0_ab17_8bf0fb24e382(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        if(list1.size() != list2.size()) {
            return False;
        }

        for(int i = 0; i < list1.size(); i++) {
            Integer val1 = list1.get(i);
            Integer val2 = list2.get(i);

            if(val1 == null || val2 == null) {
                return False;
            }

            int diff = val1.intValue() - val2.intValue();

            if(diff > 0) {
                return True;
            }
        }

        return False;
    }

    
    public static boolean overlapping_Problem_0_e3237a5f_7f3b_4fad_a76d_933a005719ef(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        return list1.stream().anyMatch(l1-> {
            return list2.stream().anyMatch(l2-> {
                return (Math.abs(l1.intValue() - l2.intValue()) < 1);
            });
        });
    }

    
    public static boolean overlapping_Problem_1_d97317ae_0d7c_4dd1_84fe_ce889b2904d1(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        // Write your logic here
        for(int i : list1){
            for(int j : list2){
                if(i != j){
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean overlapping_Problem_0_fa7b848c_958a_462c_b21d_c5fb115fd9db(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        HashSet<Integer> set = new HashSet<>();
        for (Integer i : list1) {
            set.add(i);
        }
        for (Integer i : list2) {
            if (set.contains(i)) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean overlapping_Problem_0_975d0c22_4045_4818_8dd6_f840d4783ddd(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        for (Integer i : list1) {
            if (list2.contains(i)) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean overlapping_Problem_1_c1b2720a_05e3_4ba0_97b1_d49cc2054b15(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        HashSet<Integer> set1 = new HashSet<Integer>(list1);
        HashSet<Integer> set2 = new HashSet<Integer>(list2);
        for (Integer i : set2) {
            if (set1.contains(i)) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean overlapping_Problem_1_a0843e1a_2940_497a_935a_2c28076f93d5(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        boolean flag = False;
        for(int i : list1) {
            for(int j : list2) {
                if(i != j && list1.contains(j)) {
                    flag = True;
                    break;
                }
            }
        }
        return flag;
    }

    
    public static boolean overlapping_Problem_2_718e2a2a_aa44_46c8_b241_5919d0578300(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        // Write your code here
        return list1.stream().anyMatch(list2::contains);
    }

    
    public static boolean overlapping_Problem_0_3e036f26_0fa5_4b24_95cf_9fd2978eb910(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        HashSet<Integer> set = new HashSet<>();
        for (Integer i : list1) {
            set.add(i);
        }
        for (Integer i : list2) {
            if (set.contains(i)) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean overlapping_Problem_0_e88b1245_4617_4227_a67b_6ac987654ba5(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        HashSet<Integer> set1 = new HashSet<Integer>(list1);
        HashSet<Integer> set2 = new HashSet<Integer>(list2);
        return !Collections.disjoint(set1, set2);
    }

    
    public static boolean overlapping_Problem_0_b0edc5f5_f1f2_410b_98c4_8bb68e6b27d1(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        // Write your code here
        return False;
    }

    
    public static boolean overlapping_Problem_0_f776eb8f_ddf0_4faf_b7bb_a217068e9fe7(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        return list1.stream().anyMatch(list2::contains);
    }

    
    public static boolean overlapping_Problem_0_d1b0d2aa_a830_4fc8_9ce2_b0924f43eddf(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        for (Integer i : list1) {
            if (list2.contains(i)) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean overlapping_Problem_2_2b2e835d_8b07_4bb4_b9bd_2855721c5dc9(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        for (Integer i : list1) {
            if (list2.contains(i)) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean overlapping_Problem_0_c0f8e780_5c61_4bbf_ada0_1e571236b766(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        for (Integer l1 : list1) {
            for (Integer l2 : list2) {
                if (l1 == l2) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean overlapping_Problem_2_9bd1ada4_42ff_4f2a_8eb2_fcdbd55404ca(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        if (list1.size() != list2.size()) return False;

        for (Integer value : list1) {
            if (list2.contains(value)) return True;
        }
        return False;
    }

    
    public static boolean overlapping_Problem_1_4a47d74d_80f4_4a1e_9f7c_707cc151585c(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        return list1.stream().anyMatch(list2::contains);
    }

    
    public static boolean overlapping_Problem_0_0882bca3_a6e9_4e96_bf04_79c28f3e9d43(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        int l1 = list1.get(0);
        int l2 = list2.get(0);
        int l3 = list1.get(list1.size()-1);
        int l4 = list2.get(list2.size()-1);
        boolean flag = False;
        for(int i = 0; i<list1.size()-1; i++) {
            if((l1 == list1.get(i)) && (l2 == list2.get(i))) {
                flag = True;
                break;
            }
        }
        for(int i = 0; i<list2.size()-1; i++) {
            if((l3 == list2.get(i)) && (l4 == list2.get(i))) {
                flag = True;
                break;
            }
        }
        return flag;
    }

    
    public static boolean overlapping_Problem_0_8eec7ef6_55ba_47b6_a302_525df17dcbac(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        boolean found = False;
        for (int i = 0; i < list1.size() && !found; i++) {
            for (int j = 0; j < list2.size() && !found; j++) {
                if (list1.get(i).equals(list2.get(j))) {
                    found = True;
                    break;
                }
            }
        }
        return found;
    }

    
    public static boolean overlapping_Problem_1_4bfd036f_07d9_41ae_848f_03101d34444b(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        int len = list1.size();
        for (int i = 0; i < len; ++i) {
            if (list1.get(i) == list2.get(i)) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean overlapping_Problem_1_660212ea_616b_4f98_ae1c_1dd895766084(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        HashSet<Integer> set = new HashSet<>();
        for (Integer i : list1) {
            set.add(i);
        }
        for (Integer i : list2) {
            if (set.contains(i)) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean overlapping_Problem_0_146082dd_0b29_4679_8d10_317720460669(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        HashSet<Integer> set = new HashSet<>();
        for (Integer i : list1) {
            set.add(i);
        }
        for (Integer i : list2) {
            if (set.contains(i)) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean overlapping_Problem_1_0ab7ff7b_b8e5_4a66_b795_b5309d1f91d8(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        return list1.stream().anyMatch(list2::contains);
    }

    
    public static boolean overlapping_Problem_0_75c3b5a6_946f_4389_9844_990d68e4412a(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        ArrayList<Integer> intersection = new ArrayList<>(list1);
        intersection.removeAll(list2);

        // if list1 has any elements that are in list2 then there is an overlapping_Problem_0_75c3b5a6_946f_4389_9844_990d68e4412a else not.
        return intersection.isEmpty();
    }

    
    public static boolean overlapping_Problem_1_8c875ac5_cb82_4caa_98dd_74360279ecf8(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        for(int i=0; i<list1.size(); i++) {
            for(int j=0; j<list2.size(); j++) {
                if(list1.get(i) == list2.get(j)) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean overlapping_Problem_2_1ee4bf0b_333a_4123_bfaf_5300a443e198(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        HashSet<Integer> set = new HashSet<Integer>();
        for (Integer l : list1) {
            set.add(l);
        }
        for (Integer l : list2) {
            if (set.contains(l)) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean overlapping_Problem_0_d97317ae_0d7c_4dd1_84fe_ce889b2904d1(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        // Write your logic here
        for(int i : list1){
            for(int j : list2){
                if(i != j){
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean overlapping_Problem_0_e1488d11_0682_4470_8fbb_f3ffe85ff781(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        Set<Integer> set1 = new HashSet<Integer>(list1);
        Set<Integer> set2 = new HashSet<Integer>(list2);
        return !Collections.disjoint(set1, set2);
    }

    
    public static boolean overlapping_Problem_2_fc2f9e71_dde2_4e6f_9ddb_b9fa39fa82e1(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        int l1 = list1.get(0);
        int l2 = list2.get(0);
        int l3 = list1.get(list1.size()-1);
        int l4 = list2.get(list2.size()-1);
        boolean flag = False;
        for(int i = 0; i<list1.size()-1; i++) {
            if(list1.get(i) == l1 && list2.get(i) == l2) {
                flag = True;
                break;
            }
        }
        for(int i = 0; i<list2.size()-1; i++) {
            if(list1.get(i) == l2 && list2.get(i) == l3) {
                flag = True;
                break;
            }
        }
        for(int i = 0; i<list1.size()-1; i++) {
            if(list1.get(i) == l3 && list2.get(i) == l4) {
                flag = True;
                break;
            }
        }
        for(int i = 0; i<list2.size()-1; i++) {
            if(list1.get(i) == l4 && list2.get(i) == l1) {
                flag = True;
                break;
            }
        }
        return flag;
    }

    
    public static boolean overlapping_Problem_2_c7b70aa9_e66c_4414_b325_6b8a626cdec0(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        // Write your code here
        // To print results to the standard output you can use System.out.println()
        // Example: System.out.println("Hello world!");
        return list1.stream().anyMatch(list2::contains);
    }

    
    public static boolean overlapping_Problem_0_2c1b808b_5e47_4156_b3e2_b34be5168e15(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        return list1.stream().anyMatch(list2::contains);
    }

    
    public static boolean overlapping_Problem_1_6519c364_efd4_4374_9754_4ab93646b79c(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        for(Integer l1 : list1) {
            for(Integer l2 : list2) {
                if(l1.equals(l2)) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean overlapping_Problem_2_e88b1245_4617_4227_a67b_6ac987654ba5(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        HashSet<Integer> set1 = new HashSet<Integer>(list1);
        HashSet<Integer> set2 = new HashSet<Integer>(list2);
        return !Collections.disjoint(set1, set2);
    }

    
    public static boolean overlapping_Problem_2_0e3a8e7f_d0e3_4dcc_93d0_8127d57b209c(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        for (Integer i : list1) {
            if (list2.contains(i)) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean overlapping_Problem_2_e9a39174_1430_41be_9ee4_fb3ac614dd50(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        Set<Integer> set1 = new HashSet<Integer>(list1);
        Set<Integer> set2 = new HashSet<Integer>(list2);
        set1.retainAll(set2);
        return !set1.isEmpty();
    }

    
    public static boolean overlapping_Problem_2_3f778a29_9324_4cc0_84cc_e6f25066ad72(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        boolean retval = False;
        //System.out.println("list1" + list1);
        //System.out.println("list2" + list2);
        for(int i = 0; i < list1.size(); i++) {
            if(list2.contains(list1.get(i))) {
                retval = True;
                break;
            }
        }
        return retval;
    }

    
    public static boolean overlapping_Problem_1_f1f8739b_7ed4_414b_bba0_9b4b7efc1288(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        if (list1 == null || list2 == null || list1.isEmpty() || list2.isEmpty()) {
            return False;
        }
        int commonElement = list1.get(0) == list2.get(0) ? list1.get(0) : 0;
        for (int i = 1; i < list1.size(); i++) {
            if (list1.get(i) != list2.get(i)) {
                if (list1.get(i) > commonElement) {
                    return True;
                } else if (list2.get(i) > commonElement) {
                    return True;
                } else if (list1.get(i) == commonElement && list2.get(i) == commonElement) {
                    commonElement = list1.get(i);
                } else if (list1.get(i) != commonElement && list2.get(i) == commonElement) {
                    return True;
                } else if (list1.get(i) == commonElement && list2.get(i) != commonElement) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean overlapping_Problem_0_eaf6ba5e_2200_4a2c_95e1_ced72fd37abf(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        boolean flag = False;
        for(int i : list1) {
            for(int j : list2) {
                if(j == i) {
                    flag = True;
                    break;
                }
            }
        }
        return flag;
    }

    
    public static boolean overlapping_Problem_2_5e1a774a_42dd_4811_bb76_3f3ccf614abf(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        for(Integer l : list1) {
            if(list2.contains(l)) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean overlapping_Problem_1_de94b876_bc08_483d_8cf8_d42af319741a(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        return list1.stream().anyMatch(list2::contains);
    }

    
    public static boolean overlapping_Problem_0_f822f134_5958_41c6_bceb_d309b808fb98(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        boolean result = False;
        for (int i : list1) {
            if (list2.contains(i)) {
                result = True;
                break;
            }
        }
        return result;
    }

    
    public static boolean overlapping_Problem_0_3cc4434d_004e_431e_a55c_d637ee4e13c0(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        List<Integer> list = new ArrayList<>(list1);
        list.retainAll(list2);
        return (list.size() > 0);
    }

    
    public static boolean overlapping_Problem_1_e639653b_0f59_46f9_b518_51855f2b2337(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        for (Integer i : list1) {
            if (list2.contains(i)) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean overlapping_Problem_0_7d5d390c_3cc7_4706_80d9_c8ae8f79b3a7(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        return list1.stream().anyMatch(list2::contains);
    }

    
    public static boolean overlapping_Problem_0_93a24781_a8f9_437f_9afc_a306c4208aa8(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        HashSet<Integer> set1 = new HashSet<>(list1);
        HashSet<Integer> set2 = new HashSet<>(list2);
        return !Collections.disjoint(set1, set2);
    }

    
    public static boolean overlapping_Problem_2_004c0e53_49ba_4a30_8d78_a516f9763061(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        return list1.stream().anyMatch(list2::contains);
    }

    
    public static boolean overlapping_Problem_0_53dbd785_864b_4ac2_8c0f_adaad1a62f03(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        boolean flag = False;
        for(int l1 : list1) {
            for(int l2 : list2) {
                if(l1 == l2) {
                    flag = True;
                    break;
                }
            }
        }
        return flag;
    }

    
    public static boolean overlapping_Problem_0_a0018d79_e6e6_4d0e_8db3_2231ea0bdbfc(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        for (Integer l : list1) {
            if (list2.contains(l)) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean overlapping_Problem_0_3c3ca221_f4ee_4a3f_85ae_16466fc560be(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        for (int element : list1) {
            if (list2.contains(element)) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean overlapping_Problem_2_b9d2a41f_de84_49ea_a72e_0994e0d8f782(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        // Write your code here
        return list1.stream().anyMatch(list2::contains);
    }

    
    public static boolean overlapping_Problem_1_2a4783ba_380d_4367_807a_75f6ff399b80(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        int size = list1.size();
        if (size == 0) return False;
        else if (size == list2.size()) return True;
        else {
            int start = 0;
            int end = list1.get(0) + list1.get(size-1);
            int count = 0;
            for (int i = 0; i < size-1; i++) {
                int middle = list1.get(i)+list1.get(i+1);
                if (middle > end && start <= middle) count++;
                if (middle < end && start >= middle) count++;
            }
            return count >= 2;
        }
    }

    
    public static boolean overlapping_Problem_2_952e41fa_bba4_4e45_8018_60e948694429(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        return list1.stream().anyMatch(list2::contains);
    }

    
    public static boolean overlapping_Problem_2_8cf82e8e_e95d_4e63_a06c_07c81f129a27(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        HashSet<Integer> set = new HashSet<>();
        for (Integer i : list1) {
            set.add(i);
        }
        for (Integer i : list2) {
            if (set.contains(i)) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean overlapping_Problem_1_6ee61519_93e0_43cd_b670_5577f3bbd6a5(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        for (int i = 0; i < list1.size(); i++) {
            for (int j = 0; j < list2.size(); j++) {
                if (list1.get(i) == list2.get(j)) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean overlapping_Problem_1_84189dae_d088_43d8_bf6b_4e613854b7a9(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        HashSet<Integer> set = new HashSet<Integer>();
        for (Integer i : list1) {
            set.add(i);
        }
        for (Integer i : list2) {
            if (set.contains(i)) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean overlapping_Problem_1_64d023fe_05fb_4f45_9de4_c0d07760b526(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        return list1.stream().anyMatch(list2::contains);
    }

    
    public static boolean overlapping_Problem_0_2c9dd70a_7320_4ac8_aa0e_8452e7209082(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        // Write your code here
        if (list1.size() > list2.size()) {
            System.out.println("list1 is greater than list2");
            return False;
        }
        int n = 0;
        for (Integer l1 : list1) {
            boolean found = False;
            for (Integer l2 : list2) {
                if (l1 == l2) {
                    found = True;
                    break;
                }
            }
            if (!found) {
                System.out.println(n + " is missing in list2");
                return False;
            }
            n++;
        }
        return True;
    }

    
    public static boolean overlapping_Problem_1_b0edc5f5_f1f2_410b_98c4_8bb68e6b27d1(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        // Write your code here
        return False;
    }

    
    public static boolean overlapping_Problem_2_c614e62a_9368_4dbc_84b5_75466368d92e(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        HashSet<Integer> set1 = new HashSet<Integer>(list1);
        HashSet<Integer> set2 = new HashSet<Integer>(list2);
        for (Integer i : set2) {
            if (set1.contains(i)) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean overlapping_Problem_2_18b20f5e_456e_4629_a09a_2523f2b3cf82(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        int size = Math.min(list1.size(), list2.size());
        for (int i = 0; i < size; i++) {
            Integer a = list1.get(i);
            Integer b = list2.get(i);
            if (a != b) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean overlapping_Problem_0_81fa57b9_fb89_4d5f_9c81_5edd3eb2303f(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        HashSet<Integer> set = new HashSet<Integer>();
        for (Integer i : list1) {
            set.add(i);
        }
        for (Integer i : list2) {
            if (set.contains(i)) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean overlapping_Problem_2_a3646c82_db40_4e9c_a231_6b6755ba4cba(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        for(Integer i : list1) {
            for(Integer j : list2) {
                if(i.equals(j)) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean overlapping_Problem_1_24ae069a_e77e_490c_84f8_6b2d023119f5(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        boolean result = False;
        // Loop through all the elements in both lists
        for (Integer a1 : list1) {
            for (Integer a2 : list2) {
                // If an element from list1 is found in list2, the function will return True
                if (a1 == a2) {
                    result = True;
                }
            }
        }
        return result;
    }

    
    public static boolean overlapping_Problem_2_e3237a5f_7f3b_4fad_a76d_933a005719ef(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        return list1.stream().anyMatch(l1-> {
            return list2.stream().anyMatch(l2-> {
                return (Math.abs(l1.intValue() - l2.intValue()) < 1);
            });
        });
    }

    
    public static boolean overlapping_Problem_0_712e66c3_9e70_4ff2_985c_5b761e7b49a5(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        if (list2.isEmpty()) return False;
        int max = list1.get(0); 
        for (int l: list1) 
            if (l > max) 
                max = l;
        int min = list1.get(0);
        for (int l: list1) 
            if (l < min) 
                min = l;
        return max <= min;
    }

    
    public static boolean overlapping_Problem_1_a0018d79_e6e6_4d0e_8db3_2231ea0bdbfc(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        for (Integer l : list1) {
            if (list2.contains(l)) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean overlapping_Problem_0_18b20f5e_456e_4629_a09a_2523f2b3cf82(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        int size = Math.min(list1.size(), list2.size());
        for (int i = 0; i < size; i++) {
            Integer a = list1.get(i);
            Integer b = list2.get(i);
            if (a != b) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean overlapping_Problem_0_75e2ce65_3892_4244_9487_99aaaf3ba9e7(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        if(list1.size() < list2.size())
            return False;
        for(int l : list2)
            if(list1.contains(l))
                return True;
        return False;
    }

    
    public static boolean overlapping_Problem_2_1393bc93_d27a_43be_95c6_420a8cd1ce2e(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        HashSet<Integer> set1 = new HashSet<>(list1);
        HashSet<Integer> set2 = new HashSet<>(list2);
        return !set1.equals(set2);
    }

    
    public static boolean overlapping_Problem_0_2245cf79_7028_47f4_a23f_c264ea3715a8(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        // Write your code here
        for (Integer i : list1) {
            if (list2.contains(i)) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean overlapping_Problem_1_690a1277_1893_4fcd_978a_8a920aaf5b34(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        if (list1.size() > list2.size()) {
            list2 = new ArrayList<>(list1);
            list2.removeAll(list1);
        }
        int result=0;
        for(Integer l1: list1) {
            for(Integer l2: list2) {
                if((l1==l2)) {
                    result++;
                }
            }
        }
        return result == list2.size();
    }

    
    public static boolean overlapping_Problem_1_718e2a2a_aa44_46c8_b241_5919d0578300(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        // Write your code here
        return list1.stream().anyMatch(list2::contains);
    }

    
    public static boolean overlapping_Problem_0_a3646c82_db40_4e9c_a231_6b6755ba4cba(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        for(Integer i : list1) {
            for(Integer j : list2) {
                if(i.equals(j)) {
                    return True;
                }
            }
        }
        return False;
    }

    
    public static boolean overlapping_Problem_1_b7b7d8e0_523e_42eb_a4a5_ff547e9044b5(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        return list1.containsAll(list2);
    }

    
    public static boolean overlapping_Problem_2_9b159934_cc84_46e1_a983_5609c7abd608(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        HashSet<Integer> set1 = new HashSet<Integer>(list1);
        HashSet<Integer> set2 = new HashSet<Integer>(list2);
        for (Integer i : set1) {
            if (set2.contains(i)) {
                return True;
            }
        }
        return False;
    }

}
