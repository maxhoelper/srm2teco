package mbpp_576_is_Sub_Array;

public class mbpp_576_is_Sub_Array {

    
    public static boolean isSubArray_Problem_2_ddb9a9ed_fc29_4d43_9831_d3915c2018f9(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0, j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i) == B.get(j)) {
                i++;
                j++;
            } else {
                i = i - j + 1;
                j = 0;
            }
        }
        if (j == B.size()) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isSubArray_Problem_0_891f0b4a_62ee_4232_93fc_9058f1d5f0a1(ArrayList<Integer> A, ArrayList<Integer> B) {
        boolean issubArray = True;
        for (int i = 0; i < A.size(); i++) {
            if (B.size() > i) {
                issubArray = issubArray && ((A.get(i) == B.get(i)));
            }
        }
        return issubArray;
    }

    
    public static boolean isSubArray_Problem_2_6c406197_ee16_44cd_9cb7_d785660c7d68(ArrayList<Integer> A, ArrayList<Integer> B) {
        boolean flag = False;
        if(A.size() >= B.size()) {
            for(int i = 0; i <A.size(); i++) {
                if((A.get(i) == B.get(i))) flag = True;
            }
        } else {
            return False;
        }
        return flag;
    }

    
    public static boolean isSubArray_Problem_0_bdf3b1a1_4462_4ff9_bc00_29a29ea9c5d1(ArrayList<Integer> A, ArrayList<Integer> B) {
        if (A.size() <= B.size()) {
            return False;
        }
        // write your code here
        Iterator<Integer> it = A.iterator();
        int count = 0;
        boolean subArray = True;
        while(it.hasNext()) {
            count++;
            if (count == B.size()) {
                subArray = True;
                break;
            }
            boolean match = False;
            for(int i = 0; i < B.size(); i++) {
                if (it.next().equals(B.get(i))) {
                    match = True;
                    break;
                }
            }
            if (!match) {
                subArray = False;
                break;
            }
        }
        return subArray;
    }

    
    public static boolean isSubArray_Problem_1_1f8d9bf7_9962_41c2_9e65_263b1809050e(ArrayList<Integer> A, ArrayList<Integer> B) {
        int n = A.size();
        int m = B.size();
        int i = 0, j = 0;
        while (i < n && j < m) {
            if (A.get(i) == B.get(j)) {
                i++;
                j++;
            } else {
                i = i - j + 1;
                j = 0;
            }
        }
        if (j == m) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isSubArray_Problem_1_32631fe9_d91d_468d_bcfd_c785a0103600(ArrayList<Integer> A, ArrayList<Integer> B) {
        if (A.size() > B.size()) {
            return False;
        } else if (A.size() < B.size()) {
            return True;
        }
        Integer[] arrayA = new Integer[A.size()];
        Integer[] arrayB = new Integer[B.size()];
        for (int i = 0; i < A.size(); i++) {
            arrayA[i] = A.get(i);
        }
        for (int j = 0; j < B.size(); j++) {
            arrayB[j] = B.get(j);
        }
        Arrays.sort(arrayA);
        Arrays.sort(arrayB);
        return Arrays.equals(arrayA, arrayB);
    }

    
    public static boolean isSubArray_Problem_1_5c79f354_2bc5_484c_9b16_b396f80d29bc(ArrayList<Integer> A, ArrayList<Integer> B) {
        // Write your code here.
        return False;
    }

    
    public static boolean isSubArray_Problem_0_2bf0a6c1_b181_499b_872a_ccb699ed996f(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0, j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i) == B.get(j)) {
                i++;
                j++;
            } else {
                j++;
            }
        }
        return i == A.size();
    }

    
    public static boolean isSubArray_Problem_0_f11c61bb_82fd_496b_b8fe_4a82d487abbe(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> A1 = new ArrayList<>();
        ArrayList<Integer> B1 = new ArrayList<>();
        for(Integer i : A) {
            A1.add(i);
        }
        for(Integer i : B) {
            B1.add(i);
        }
        ArrayList<Integer> A2 = new ArrayList<>();
        ArrayList<Integer> B2 = new ArrayList<>();
        for(Integer i : A) {
            A2.add(i);
        }
        for(Integer i : B) {
            B2.add(i);
        }
        if(A1.size() != A2.size()) {
            return False;
        }
        for(int i = 0; i < A1.size(); i++) {
            if(!A1.get(i).equals(A2.get(i))) {
                return False;
            }
        }
        return True;
    }

    
    public static boolean isSubArray_Problem_2_a34cfdd5_9cc3_4627_b0ce_066a66e0228a(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0;
        int j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i) == B.get(j)) {
                i++;
                j++;
            } else {
                j++;
            }
        }
        if (i == A.size()) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isSubArray_Problem_1_a391ef02_88a7_4eb0_bc69_6d4ec76078d9(ArrayList<Integer> A, ArrayList<Integer> B) {
        Set<Integer> setA = new HashSet<Integer>(A);
        Set<Integer> setB = new HashSet<Integer>(B);
        return setA.containsAll(setB);
    }

    
    public static boolean isSubArray_Problem_1_cf8caf77_b20b_4128_a918_56eff7129c8f(ArrayList<Integer> A, ArrayList<Integer> B) {
        return B.stream()
                .anyMatch(x -> A.contains(x));
    }

    
    public static boolean isSubArray_Problem_0_fb40ddde_d9d4_4f94_8416_4dce8d061402(ArrayList<Integer> A, ArrayList<Integer> B) {
        int n = A.size();
        if (A.size() > B.size()) {
            System.out.println("The array list is too large!");
            return False;
        }
        ArrayList<Integer> temp = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int a = A.get(i);
            int b = B.get(i);
            if (!temp.contains(a)) {
                temp.add(a);
            }
        }
        if (A.size() > n) {
            for (int i = n; i < A.size(); i++) {
                temp.add(A.get(i));
            }
        }
        for (int i = 0; i < B.size(); i++) {
            if (!temp.contains(B.get(i))) {
                return False;
            }
        }
        return True;
    }

    
    public static boolean isSubArray_Problem_0_edaffb95_ac2e_4239_a45c_743f936a8e08(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> A1 = new ArrayList<Integer>();
        ArrayList<Integer> B1 = new ArrayList<Integer>();
        for(int i = 0; i < A.size(); i++) {
            A1.add(A.get(i));
        }
        for(int i = 0; i < B.size(); i++) {
            B1.add(B.get(i));
        }
        if(A1.size() != B1.size()) {
            return False;
        }
        for(int i = 0; i < A1.size(); i++) {
            if(!A1.contains(B1.get(i))) {
                return False;
            }
        }
        return True;
    }

    
    public static boolean isSubArray_Problem_0_da4bdd0d_b719_4115_85a1_08f4736f8a13(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0, j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i) == B.get(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        if (j == B.size()) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isSubArray_Problem_0_ae0ab445_fba9_461c_ba18_7c468016ee8f(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> A1 = new ArrayList<Integer>();
        ArrayList<Integer> B1 = new ArrayList<Integer>();
        for(int i=0;i<A.size();i++) {
            A1.add(A.get(i));
        }
        for(int i=0;i<B.size();i++) {
            B1.add(B.get(i));
        }
        if(A1.containsAll(B1)) {
            return True;
        }
        return False;
    }

    
    public static boolean isSubArray_Problem_2_bc3a4140_a096_422c_8c79_746404b90506(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> A1 = new ArrayList<Integer>();
        ArrayList<Integer> B1 = new ArrayList<Integer>();
        for(int i=0;i<A.size();i++) {
            A1.add(A.get(i));
        }
        for(int i=0;i<B.size();i++) {
            B1.add(B.get(i));
        }
        if(A1.equals(B1)) {
            return True;
        }
        return False;
    }

    
    public static boolean isSubArray_Problem_0_bff9ea6d_f9a2_4380_b266_2c9b1e64f608(ArrayList<Integer> A, ArrayList<Integer> B) {
        int [] A1 = new int[A.size()];
        int [] B1 = new int[B.size()];
        for(int i = 0; i < A.size(); i++) {
            A1[i] = A.get(i);
        }
        for(int i = 0; i < B.size(); i++) {
            B1[i] = B.get(i);
        }
        Arrays.sort(A1);
        Arrays.sort(B1);
        for(int i = 0; i < A.size(); i++) {
            if(A1[i] != B1[i]) {
                return False;
            }
        }
        return True;
    }

    
    public static boolean isSubArray_Problem_1_f0cdedbb_0e07_4b07_821e_18537d3c19dc(ArrayList<Integer> A, ArrayList<Integer> B) {
        int size_A=A.size();
        int size_B=B.size();
        if(size_B <= size_A) {
            return False;
        }
        ArrayList<Integer> newList = new ArrayList<>(B.size());
        for (int i = size_A - 1; i >= 0; i--) {
            if (!A.contains(B.get(i))) {
                return False;
            }
        }
        return True;
    }

    
    public static boolean isSubArray_Problem_2_bac96cb3_a342_4f09_ac54_f6ef1558845f(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> B1 = new ArrayList<>();
        ArrayList<Integer> B2 = new ArrayList<>();
        int i = 0;
        int j = 0;
        int k = 0;
        for (i = 0; i < A.size(); i++) {
            B1.add(A.get(i));
        }
        for (j = 0; j < B.size(); j++) {
            B2.add(B.get(j));
        }
        for (i = 0; i <= B1.size() - B2.get(i); i++) {
            for (j = 0; j <= B2.size() - B1.get(j); j++) {
                if (B1.get(i) == B2.get(j)) {
                    k = k + 1;
                }
            }
        }
        if (k == B2.get(i)) {
            return True;
        }
        return False;
    }

    
    public static boolean isSubArray_Problem_2_0a6fa127_38c0_4515_b4a5_85b652cc2cff(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> C = new ArrayList<>();
        C.add(A.get(0));
        for(int i = 1; i < A.size(); i++) {
            if(A.get(i) == B.get(i)) {
                C.add(A.get(i));
            }
        }
        return C.equals(B);
    }

    
    public static boolean isSubArray_Problem_1_32da881c_4415_47a4_bb4b_12c2b8e40edc(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> C = new ArrayList<>();
        C.add(A.get(0));
        for(int i = 1; i < A.size(); i++) {
            if(A.get(i) == A.get(i-1)) {
                C.add(A.get(i));
            }
        }
        for(int i = 0; i < B.size(); i++) {
            if(C.contains(B.get(i))) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean isSubArray_Problem_0_f795ad92_9871_4e05_bd21_676e1c14a0f2(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> A1 = new ArrayList<Integer>(A.size());
        ArrayList<Integer> B1 = new ArrayList<Integer>(B.size());
        for(Integer i : A) {
            A1.add(i);
        }
        for(Integer i : B) {
            B1.add(i);
        }
        ArrayList<Integer> A2 = new ArrayList<Integer>(A1.size());
        ArrayList<Integer> B2 = new ArrayList<Integer>(B1.size());
        for(Integer i : A1) {
            A2.add(i);
        }
        for(Integer i : B1) {
            B2.add(i);
        }
        return A2.containsAll(B2);
    }

    
    public static boolean isSubArray_Problem_2_1f11bc3f_9994_46e0_b461_ba5f0362ec9e(ArrayList<Integer> A, ArrayList<Integer> B) {
        // Write your code to check if array A is subarray of B or not.
        // If yes, then return True, otherwise return False.
        for(int i=0;i<A.size();i++) {
            if(A.get(i) < B.size() && A.get(i) > -1 && A.get(i) == B.get(i)) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean isSubArray_Problem_2_fb40ddde_d9d4_4f94_8416_4dce8d061402(ArrayList<Integer> A, ArrayList<Integer> B) {
        int n = A.size();
        if (A.size() > B.size()) {
            System.out.println("The array list is too large!");
            return False;
        }
        ArrayList<Integer> temp = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int a = A.get(i);
            int b = B.get(i);
            if (!temp.contains(a)) {
                temp.add(a);
            }
        }
        if (A.size() > n) {
            for (int i = n; i < A.size(); i++) {
                temp.add(A.get(i));
            }
        }
        for (int i = 0; i < B.size(); i++) {
            if (!temp.contains(B.get(i))) {
                return False;
            }
        }
        return True;
    }

    
    public static boolean isSubArray_Problem_2_19838443_8552_473f_955d_46c2d587d30f(ArrayList<Integer> A, ArrayList<Integer> B) {
        // Your code goes here
        return A.containsAll(B.subList(B.size() - 1, B.size()));
    }

    
    public static boolean isSubArray_Problem_1_ae81f484_d211_4149_84d9_569678c65835(ArrayList<Integer> A, ArrayList<Integer> B) {
        if (A.isEmpty() && B.isEmpty()) return True;
        if (A.size() != B.size()) return False;
        
        if (A.size() == 0) return False;

        for(int i = 0; i < A.size(); i++) {
            if (A.get(i) < B.get(i)) return False;
            if (A.get(i) > B.get(i)) return False;
        }
        
        return True;
    }

    
    public static boolean isSubArray_Problem_1_6db860e3_85ee_4fca_b1ba_6d03a80f933f(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> AB = new ArrayList<Integer>();
        for (Integer i : A) {
            for (Integer j : B) {
                if (i.equals(j)) {
                    AB.add(i);
                }
            }
        }
        return AB.equals(B);
    }

    
    public static boolean isSubArray_Problem_1_280af11a_ea59_4d84_b59f_54acf281a2f4(ArrayList<Integer> A, ArrayList<Integer> B) {
        // Write your code here
        int sum = 0;
        int count = 0;
        for(int i = 0; i < A.size(); i++) {
            sum += A.get(i);
            for(int j = 0; j < B.size(); j++) {
                if(A.get(i) == B.get(j)) {
                    count++;
                }
            }
        }
        if(count == A.size()) {
            return True;
        }
        return False;
    }

    
    public static boolean isSubArray_Problem_0_f57b9932_9379_41f9_8109_fd297b1da044(ArrayList<Integer> A, ArrayList<Integer> B) {
        return A.stream().filter(i -> B.contains(i)).allMatch( i -> A.contains(i));
    }

    
    public static boolean isSubArray_Problem_1_7341ad5e_9573_4f7c_8fb8_8c3c556cc79a(ArrayList<Integer> A, ArrayList<Integer> B) {
        if (A.size() > B.size()) {
            return False;
        }
        for (int i = 0; i < B.size() - A.size() + 1; i++) {
            if (B.get(i).equals(A.get(0))) {
                boolean flag = True;
                for (int j = 1; j < A.size(); j++) {
                    if (!B.get(i + j).equals(A.get(j))) {
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

    
    public static boolean isSubArray_Problem_1_d28b0446_fd6b_488f_ab44_66d191b0a72e(ArrayList<Integer> A, ArrayList<Integer> B) {
        if (A.size() > B.size()) {
            return False;
        }
        for (int i = 0; i < B.size() - A.size() + 1; i++) {
            if (A.get(0) == B.get(i)) {
                boolean isSub = True;
                for (int j = 0; j < A.size(); j++) {
                    if (A.get(j) != B.get(i + j)) {
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

    
    public static boolean isSubArray_Problem_2_e0891221_f213_45fe_8f89_a8dc6c4f7a55(ArrayList<Integer> A, ArrayList<Integer> B) {
        if (A.size() > B.size()) {
            return False;
        }
        ArrayList<Integer> B1 = new ArrayList<Integer>(B);
        ArrayList<Integer> A1 = new ArrayList<Integer>(A);
        ArrayList<Integer> A2 = new ArrayList<Integer>(A.size());
        ArrayList<Integer> B2 = new ArrayList<Integer>(B.size());
        for (Integer i : A) {
            A1.remove(i);
        }
        boolean flag = False;
        int i = 0;
        while (i < A1.size() && i < B1.size()) {
            if (A1.get(i) == B1.get(i)) {
                A2.remove(i);
                i++;
            } else if (A1.get(i) > B1.get(i)) {
                flag = True;
                break;
            } else {
                B2.remove(i);
                i++;
            }
        }
        if (A1.size() < B1.size()) {
            flag = True;
        }
        if (A2.size() > B2.size()) {
            flag = False;
        }
        return flag;
    }

    
    public static boolean isSubArray_Problem_2_c8e55bc8_a517_49b8_a19c_fbb3649414fd(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0, j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i).equals(B.get(j))) {
                i++;
                j++;
            } else {
                i = i - j + 1;
                j = 0;
            }
        }
        return j == B.size();
    }

    
    public static boolean isSubArray_Problem_2_7badae59_e78f_4884_a761_d252e47c6e5e(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0;
        int j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i) == B.get(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        if (j == B.size()) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isSubArray_Problem_0_577ae08e_2e2c_488a_9e81_20b9e44356ee(ArrayList<Integer> A, ArrayList<Integer> B) {
        if (A == null || B == null || A.size() != B.size()) return False;
        int i = 0;
        int j = 0;
        for (i = A.size() - 1; i >= 0; i--)
            if (A.get(i) == B.get(j++)) return True;
        return False;
    }

    
    public static boolean isSubArray_Problem_1_52a3b074_e8fd_465c_b5d7_16fdf2ccfd87(ArrayList<Integer> A, ArrayList<Integer> B) {
        if (A.size() != B.size())
            return False;
        for (int i = 0; i < A.size(); i++) {
            if (!A.contains(B.get(i)))
                return False;
        }
        return True;
    }

    
    public static boolean isSubArray_Problem_1_f482b7d6_8da8_4e98_81be_d8fb4d6c9948(ArrayList<Integer> A, ArrayList<Integer> B) {
        return A.stream().anyMatch(A1 -> B.stream().anyMatch(B1 -> A1.equals(B1)));
    }

    
    public static boolean isSubArray_Problem_1_f5b1c3c0_aaff_496f_beb2_f3af81688778(ArrayList<Integer> A, ArrayList<Integer> B) {
        if(A.size() != B.size()) return False;
        int i = 0;
        for(Integer a : A) {
            if(!B.contains(a)) return False;
            i++;
        }
        return True;
    }

    
    public static boolean isSubArray_Problem_1_52e1a915_4d14_4b34_9244_52661f0fd5e1(ArrayList<Integer> A, ArrayList<Integer> B) {
        if(A.isEmpty()) return True;
        if(B.isEmpty()) return False;
        if(A.size()!=B.size()) return False;
        int diff=A.size()-B.size();
        for(int i=0;i<A.size();i++)
        {
            if(A.contains(B.get(i)) && !B.contains(A.get(i)))
            {
                return False;
            }
        }
        return True;
    }

    
    public static boolean isSubArray_Problem_1_b490f6ef_f7ee_4ff7_8cae_37cffdea0947(ArrayList<Integer> A, ArrayList<Integer> B) {
        // Write your code here
        return Arrays.asList(A).containsAll(Arrays.asList(B));
    }

    
    public static boolean isSubArray_Problem_1_8e9fd48b_e49c_4bb7_b62e_efb9c6d68c19(ArrayList<Integer> A, ArrayList<Integer> B) {
        //write your logic here
        return False;
    }

    
    public static boolean isSubArray_Problem_1_7fc22c76_813a_44c8_96b5_4771fe7cd4bb(ArrayList<Integer> A, ArrayList<Integer> B) {
        if (A.size() > B.size()) {
            return False;
        }
        int i = 0;
        int j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i) == B.get(j)) {
                i++;
                j++;
            } else {
                j++;
            }
        }
        if (i == A.size()) {
            return True;
        }
        return False;
    }

    
    public static boolean isSubArray_Problem_1_3add8d4a_68f1_4dfb_9f0e_24ef6b785606(ArrayList<Integer> A, ArrayList<Integer> B) {
        if(A.size() != B.size()) {
            return False;
        }
        for(int i = 0; i < A.size(); i++) {
            if(!A.get(i).equals(B.get(i))) {
                return False;
            }
        }
        return True;
    }

    
    public static boolean isSubArray_Problem_2_34311485_663e_406a_8d03_40d4f1b0d653(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0;
        int j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i).equals(B.get(j))) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        return j == B.size();
    }

    
    public static boolean isSubArray_Problem_2_4c062bbe_3c54_4848_a7ed_2586a61cb2e7(ArrayList<Integer> A, ArrayList<Integer> B) {
        // Write your code here
        
        int size = A.size();
        int arrSize1 = A.get(0).intValue();
        int arrSize2 = A.get(size-1).intValue();
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (A.get(i).intValue() == arrSize2) {
                count++;
            }
            if (A.get(i).intValue() == arrSize1) {
                count--;
            }
        }
        if (count == 0) {
            return True;
        }
        return False;
    }

    
    public static boolean isSubArray_Problem_1_17f33352_54ca_4dd0_a6c8_8f766ae1133a(ArrayList<Integer> A, ArrayList<Integer> B) {
        boolean result = False;
        int sizeA = A.size();
        int sizeB = B.size();
        int minSize = Math.min(sizeA, sizeB);
        int sum = 0;
        for (int i = 0; i < minSize; i++) {
            sum+=A.get(i);
        }
        for (int j = 0; j < minSize; j++) {
            sum+=B.get(j);
        }
        for (int i = 0; i < minSize; i++) {
            for (int j = 0; j < minSize; j++) {
                if(sum == A.get(i) + B.get(j)) {
                    result = True;
                }
            }
        }
        return result;
    }

    
    public static boolean isSubArray_Problem_0_4fb15af6_5978_4381_8fad_80e5e871ee75(ArrayList<Integer> A, ArrayList<Integer> B) {
        // Write your logic here
        int n = A.size();
        int m = B.size();
        int sum = 0;
        // We need to find out the smallest and the biggest subarray
        // and their sum
        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                if(A.get(i)>B.get(j)) {
                    sum -= A.get(i);
                    i++;
                }
                else if(A.get(i)<B.get(j)) {
                    sum -= B.get(j);
                    j++;
                }
                else {
                    sum += A.get(i);
                    i++;
                    j++;
                }
            }
        }
        return sum == 0;
    }

    
    public static boolean isSubArray_Problem_0_a23cc699_6a03_4e11_8d55_99dac03cd84e(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0;
        int j = 0;
        while(i < A.size() && j < B.size()) {
            if(A.get(i) == B.get(j)) {
                i++;
                j++;
            } else {
                i = i + 1;
                j = j + 1;
            }
        }
        return i == A.size();
    }

    
    public static boolean isSubArray_Problem_1_353e777f_629a_4634_b719_86cd1ed176a2(ArrayList<Integer> A, ArrayList<Integer> B) {
        if(A==null)return B==null;
        if(B==null)return False;
        if(A.size()==0)return B.size()==0;
        if(B.size()==0)return False;
        if(A.size()!=B.size())return False;
        Iterator<Integer> Aitr=A.iterator();
        Iterator<Integer> Bitr=B.iterator();
        while(Aitr.hasNext()){
            Integer Aval = Aitr.next();
            Integer Bval = Bitr.next();
            if(!Aval.equals(Bval))
                return False;
        }
        return True;
    }

    
    public static boolean isSubArray_Problem_0_20ee2403_90b0_4b26_95b2_7de679b08858(ArrayList<Integer> A, ArrayList<Integer> B) {
        if (A.size() > B.size()) return False;
        for (int i = 0; i < B.size() - A.size() + 1; i++) {
            boolean found = True;
            for (int j = 0; j < A.size(); j++) {
                if (A.get(j) != B.get(i + j)) {
                    found = False;
                    break;
                }
            }
            if (found) return True;
        }
        return False;
    }

    
    public static boolean isSubArray_Problem_1_2bf0a6c1_b181_499b_872a_ccb699ed996f(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0, j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i) == B.get(j)) {
                i++;
                j++;
            } else {
                j++;
            }
        }
        return i == A.size();
    }

    
    public static boolean isSubArray_Problem_0_69e300da_218b_4ce2_85d4_d3498fa2a2ab(ArrayList<Integer> A, ArrayList<Integer> B) {
        // Return True if both arrays are same
        if (A.size() == B.size()) {
            // Sort the array list
            ArrayList<Integer> sortedA = new ArrayList<>(A);
            Collections.sort(sortedA);
            ArrayList<Integer> sortedB = new ArrayList<>(B);
            Collections.sort(sortedB);
            // compare the first element of both arrays
            return ((sortedA.get(0)).equals(sortedB.get(0)));
        }
        return False;
    }

    
    public static boolean isSubArray_Problem_0_6453842a_57f5_4888_9245_97c222d21fbc(ArrayList<Integer> A, ArrayList<Integer> B) {
        
        return A.equals(B); // If A and B are of same size, then A and B are subarrays.
    }

    
    public static boolean isSubArray_Problem_1_ba305467_1476_4d20_a756_27969ddcac0f(ArrayList<Integer> A, ArrayList<Integer> B) {
        int size = A.size();
        if(size == 0) return False;
        ArrayList<Integer> result = new ArrayList<>();
        for(int i=0; i<A.size(); i++) {
            if(A.get(i) != B.get(i)) {
                return False;
            }
            result.add(A.get(i));
        }
        for(int i=0; i<A.size(); i++) {
            if(A.get(i) != B.get(i) && result.contains(A.get(i))) return False;
        }
        return True;
    }

    
    public static boolean isSubArray_Problem_1_cb763dc1_5240_483a_834e_444fea7f0ec9(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0;
        int j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i) == B.get(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        if (j == B.size()) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isSubArray_Problem_1_bac96cb3_a342_4f09_ac54_f6ef1558845f(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> B1 = new ArrayList<>();
        ArrayList<Integer> B2 = new ArrayList<>();
        int i = 0;
        int j = 0;
        int k = 0;
        for (i = 0; i < A.size(); i++) {
            B1.add(A.get(i));
        }
        for (j = 0; j < B.size(); j++) {
            B2.add(B.get(j));
        }
        for (i = 0; i <= B1.size() - B2.get(i); i++) {
            for (j = 0; j <= B2.size() - B1.get(j); j++) {
                if (B1.get(i) == B2.get(j)) {
                    k = k + 1;
                }
            }
        }
        if (k == B2.get(i)) {
            return True;
        }
        return False;
    }

    
    public static boolean isSubArray_Problem_2_ccbab410_8dc2_4247_aaa8_43c0af929b6f(ArrayList<Integer> A, ArrayList<Integer> B) {
        if (A.size() > B.size()) {
            return False;
        }
        int i = 0;
        int j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i).equals(B.get(j))) {
                i++;
                j++;
            } else {
                i = 0;
                j++;
            }
        }
        if (i == A.size()) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isSubArray_Problem_2_f6e562b6_d433_4323_ae5b_18a99236e8eb(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0;
        int j = 0;
        int n = A.size();
        int m = B.size();
        while (i < n && j < m) {
            if (A.get(i) == B.get(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        if (j == m) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isSubArray_Problem_0_4ba0ba9d_68a8_4deb_9f9a_7ef99e6b48d3(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0;
        int j = 0;
        int n = A.size();
        int m = B.size();
        while (i < n && j < m) {
            if (A.get(i) == B.get(j)) {
                i++;
                j++;
            } else {
                i = i - j + 1;
                j = 0;
            }
        }
        return (j == m);
    }

    
    public static boolean isSubArray_Problem_0_197fad79_c03c_47fb_b2f5_15f841ad1c9e(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0, j = 0;
        while(i < A.size() && j < B.size()) {
            if(A.get(i) == B.get(j)) {
                i++;
                j++;
            } else {
                i = i + 1;
                j = j + 1;
            }
        }
        return i == A.size() && j == B.size();
    }

    
    public static boolean isSubArray_Problem_2_bff9ea6d_f9a2_4380_b266_2c9b1e64f608(ArrayList<Integer> A, ArrayList<Integer> B) {
        int [] A1 = new int[A.size()];
        int [] B1 = new int[B.size()];
        for(int i = 0; i < A.size(); i++) {
            A1[i] = A.get(i);
        }
        for(int i = 0; i < B.size(); i++) {
            B1[i] = B.get(i);
        }
        Arrays.sort(A1);
        Arrays.sort(B1);
        for(int i = 0; i < A.size(); i++) {
            if(A1[i] != B1[i]) {
                return False;
            }
        }
        return True;
    }

    
    public static boolean isSubArray_Problem_2_c94c4cb9_fbf5_410a_8bf3_8682fd37b495(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> A_ = new ArrayList<>();
        A.forEach(x -> A_.add(x));

        ArrayList<Integer> B_ = new ArrayList<>();
        B.forEach(x -> B_.add(x));

        ArrayList<Integer> intersection = new ArrayList<>();
        intersection.addAll(A_);
        intersection.addAll(B_);

        return intersection.containsAll(A_) && intersection.containsAll(B_);
    }

    
    public static boolean isSubArray_Problem_1_c448691c_4348_4365_8e1d_b42fbdd3c752(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0, j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i) == B.get(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        if (j == B.size()) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isSubArray_Problem_0_b53f6d80_cfdb_464d_8d9e_25e468127dbd(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0, j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i) == B.get(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        return j == B.size();
    }

    
    public static boolean isSubArray_Problem_2_6885c8af_afba_445a_baa9_1e145b3168bc(ArrayList<Integer> A, ArrayList<Integer> B) {
        if (A.size() > B.size()) {
            return False;
        }
        int i = 0;
        int j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i).equals(B.get(j))) {
                i++;
                j++;
            } else {
                i = 0;
                j++;
            }
        }
        if (i == A.size()) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isSubArray_Problem_0_3167bc6e_6d56_444b_8eea_c4b7b153e699(ArrayList<Integer> A, ArrayList<Integer> B) {
        return A.subList(A.size() - B.size(), A.size()).containsAll(B);
    }

    
    public static boolean isSubArray_Problem_1_ebc57fca_09cd_49cb_a004_b8dee126d774(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> temp = new ArrayList<>();
        for(Integer i : A) {
            if(!temp.contains(i)) {
                temp.add(i);
            }
        }
        for(Integer i : B) {
            if(!temp.contains(i)) {
                temp.add(i);
            }
        }
        return temp.size() == A.size();
    }

    
    public static boolean isSubArray_Problem_0_aed045ed_ca4e_497d_b0af_88de03a40158(ArrayList<Integer> A, ArrayList<Integer> B) {
        if(A.size() != B.size()) return False;
        int i = 0;
        for(Integer a : A) {
            if(!B.contains(a)) return False;
            i++;
        }
        return True;
    }

    
    public static boolean isSubArray_Problem_1_9bc6cdf7_5d6f_4aba_ba8b_07f50775cd16(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> A_copy = new ArrayList<>();
        for (int i : A) {
            A_copy.add(i);
        }
        ArrayList<Integer> B_copy = new ArrayList<>();
        for (int j : B) {
            B_copy.add(j);
        }
        return A_copy.containsAll(B_copy);
    }

    
    public static boolean isSubArray_Problem_0_dfa3092f_e12f_4ad7_9ac8_74b122a3bf14(ArrayList<Integer> A, ArrayList<Integer> B) {
        int [] a = new int[A.size()];
        int [] b = new int[B.size()];
        for(int i = 0; i < A.size(); i++) {
            a[i] = A.get(i);
        }
        for(int i = 0; i < B.size(); i++) {
            b[i] = B.get(i);
        }
        Arrays.sort(a);
        Arrays.sort(b);
        for(int i = 0; i < a.length; i++) {
            if(a[i] != b[i]) {
                return False;
            }
        }
        return True;
    }

    
    public static boolean isSubArray_Problem_2_d92384f6_e708_47e3_89dd_759abb268849(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0;
        int j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i) == B.get(j)) {
                i++;
                j++;
            } else {
                i = i - j + 1;
                j = 0;
            }
        }
        if (j == B.size()) {
            return True;
        }
        return False;
    }

    
    public static boolean isSubArray_Problem_0_b8c32503_78e9_47a3_a757_753d7c87ff0d(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0, j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i) == B.get(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        if (j == B.size()) {
            return True;
        }
        return False;
    }

    
    public static boolean isSubArray_Problem_0_b46c3290_2777_4fae_92e6_b23f54f10683(ArrayList<Integer> A, ArrayList<Integer> B) {
        if (A.size() > B.size())
            return False;
        int aSize = A.size(), bSize = B.size();
        ArrayList<Integer> aTemp = new ArrayList<>(aSize);
        ArrayList<Integer> bTemp = new ArrayList<>(bSize);
        for (int i = 0; i < aSize; i++) {
            aTemp.add(A.get(i));
        }
        for (int i = 0; i < bSize; i++) {
            bTemp.add(B.get(i));
        }
        aTemp.removeAll(bTemp);
        if (0 != aTemp.size())
            return False;
        return True;
    }

    
    public static boolean isSubArray_Problem_1_eaffa1ec_b7ca_49ac_86d4_e2973f6c038c(ArrayList<Integer> A, ArrayList<Integer> B) {
        Set<Integer> set = new HashSet<Integer>();
        set.addAll(B);
        for (int i : A) if (!set.contains(i)) return False;
        return True;
    }

    
    public static boolean isSubArray_Problem_0_6f0539ef_2bb9_4a83_9ae3_15cb0e93f300(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> A1 = new ArrayList<Integer>();
        ArrayList<Integer> B1 = new ArrayList<Integer>();
        for(int i=0;i<A.size();i++) {
            A1.add(A.get(i));
        }
        for(int i=0;i<B.size();i++) {
            B1.add(B.get(i));
        }
        for(int i=0;i<A.size();i++) {
            for(int j=0;j<B.size();j++) {
                if(A1.get(i) == B1.get(j)) {
                    A1.remove(i);
                    B1.remove(j);
                }
            }
        }
        if(A1.size() == 0) {
            return True;
        }
        return False;
    }

    
    public static boolean isSubArray_Problem_0_35411b54_06bd_46a7_9332_34343bc8edd3(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0;
        int j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i) == B.get(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        if (j == B.size()) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isSubArray_Problem_1_f225f521_0807_43d4_9641_6b9537ea377a(ArrayList<Integer> A, ArrayList<Integer> B) {
        int n = A.size();
        int m = B.size();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = A.get(i);
        }
        Arrays.sort(array);
        int[] arrayB = new int[m];
        for (int i = 0; i < m; i++) {
            arrayB[i] = B.get(i);
        }
        Arrays.sort(arrayB);
        for (int i = 0; i < m && i < n; i++) {
            if (array[i] != arrayB[i]) {
                return False;
            }
        }
        return True;
    }

    
    public static boolean isSubArray_Problem_2_3ab105bd_f8fd_4ed5_8fdc_b24f4ba76cf4(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> A1 = new ArrayList<>(A);
        ArrayList<Integer> B1 = new ArrayList<>(B);
        return A.containsAll(B) && B.containsAll(A);
    }

    
    public static boolean isSubArray_Problem_0_64ed271d_9738_48d4_82a1_c9efd2e823d5(ArrayList<Integer> A, ArrayList<Integer> B) {
        // Write your code here
        ArrayList<Integer> A1 = new ArrayList<Integer>();
        ArrayList<Integer> B1 = new ArrayList<Integer>();
        for(int i = 0; i < A.size(); i++) {
            A1.add(A.get(i));
        }
        for(int i = 0; i < B.size(); i++) {
            B1.add(B.get(i));
        }
        boolean flag = False;
        for(int i = 0; i < A1.size(); i++) {
            for(int j = 0; j < B1.size(); j++) {
                if(A1.get(i) == B1.get(j)) {
                    flag = True;
                }
            }
        }
        return flag;
    }

    
    public static boolean isSubArray_Problem_0_75b24365_8233_44c0_8bb6_6c513daeba3e(ArrayList<Integer> A, ArrayList<Integer> B) {
        // Write your logic here.
        boolean flag = False;
        if (A.size() != B.size()) {
            return flag;
        }
        int i = 0;
        while (i < A.size() && !flag) {
            if (A.get(i).compareTo(B.get(i)) < 0) {
                break;
            }
            i++;
        }
        return flag;
    }

    
    public static boolean isSubArray_Problem_2_55e5d5fe_5100_4faf_b1b2_129cd872e11c(ArrayList<Integer> A, ArrayList<Integer> B) {
        // write code here
        return False;
    }

    
    public static boolean isSubArray_Problem_1_73a41bd6_432b_488f_b8b8_96fd64ec9ecc(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i) == B.get(j)) {
                i++;
                j++;
                k++;
            } else if (A.get(i) < B.get(j)) {
                i++;
            } else {
                j++;
            }
        }
        return k == A.size();
    }

    
    public static boolean isSubArray_Problem_0_7daae09b_e5ce_4037_b81f_dc3fb867c930(ArrayList<Integer> A, ArrayList<Integer> B) {
        if (A.size() > B.size()) {
            return False;
        }
        for (int i = 0; i <= B.size() - A.size(); i++) {
            boolean isSub = True;
            for (int j = 0; j < A.size(); j++) {
                if (A.get(j) != B.get(i + j)) {
                    isSub = False;
                    break;
                }
            }
            if (isSub) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean isSubArray_Problem_0_d817dc7b_9f96_487c_bbd0_932cf90f1fe2(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0;
        int j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i) == B.get(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        if (j == B.size()) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isSubArray_Problem_2_fc5941d0_851c_4e7e_9cb7_a8849da9a266(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> A1 = new ArrayList<Integer>(A);
        ArrayList<Integer> B1 = new ArrayList<Integer>(B);
        ArrayList<Integer> C = new ArrayList<Integer>();
        for(int i = 0; i < A.size(); i++) {
            if(!A1.contains(B.get(i))) {
                C.add(i);
            }
        }
        if(C.size() == A.size()) {
            return True;
        }
        return False;
    }

    
    public static boolean isSubArray_Problem_1_abfd79fb_5c83_4f80_974a_7176c029df4c(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0, j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i) == B.get(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        if (j == B.size()) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isSubArray_Problem_0_ce4a4398_c6a2_4076_9467_853ed11a096b(ArrayList<Integer> A, ArrayList<Integer> B) {
        if (A.isEmpty() && B.isEmpty()) return True;
        if (A.isEmpty()) return False;
        if (B.isEmpty()) return False;
        int N = A.size();
        int m = B.size();
        if (N != m) {
            return False;
        }
        int i = 0; // index for A
        int j = 0; // index for B
        int sum = 0; // check sum
        int flag = 0; // check flag
        while (i < N && j < m) {
            sum += A.get(i++);
            sum += B.get(j++);
            if (sum == 0) return False;
            if (sum > N) return False;
            if (sum < 0) return False;
        }
        int k = 0;
        while (k < m && j < m) {
            sum += A.get(k++);
            sum += B.get(j++);
            if (sum == 0) return False;
            if (sum > N) return False;
            if (sum < 0) return False;
        }
        while (i < N && k < (m - 1)) {
            sum += A.get(i++);
            sum += B.get(k++);
            if (sum == 0) return False;
            if (sum > N) return False;
            if (sum < 0) return False;
        }
        while (j < m && k < (m - 1)) {
            sum += A.get(k++);
            sum += B.get(j++);
            if (sum == 0) return False;
            if (sum > N) return False;
            if (sum < 0) return False;
        }
        return (i == N && j == m);
    }

    
    public static boolean isSubArray_Problem_1_f5bd34be_2567_45da_bbbd_26b00773c004(ArrayList<Integer> A, ArrayList<Integer> B) {
        List<Integer> subArr = B.stream().filter(s -> !A.contains(s)).collect(Collectors.toList());
        return A.stream().filter(s -> !B.contains(s)).collect(Collectors.toList()).containsAll(subArr);
    }

    
    public static boolean isSubArray_Problem_1_53151210_ea00_478f_8188_bd2424430673(ArrayList<Integer> A, ArrayList<Integer> B) {
        int count = 0;
        ArrayList<Integer> C = new ArrayList<>();
        for (int i = 0; i < A.size(); i++) {
            if (A.contains(B.get(i))) {
                count++;
                C.add(B.get(i));
            }
        }
        if (A.size() == C.size()) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isSubArray_Problem_2_a15c8b9a_54c7_4534_86aa_3219dc44e75f(ArrayList<Integer> A, ArrayList<Integer> B) {
        return A.equals(B);
    }

    
    public static boolean isSubArray_Problem_0_2fb849bd_9efe_46f8_8b19_89264e028ae5(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0;
        int j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i) == B.get(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        if (j == B.size()) {
            return True;
        }
        return False;
    }

    
    public static boolean isSubArray_Problem_0_1f11bc3f_9994_46e0_b461_ba5f0362ec9e(ArrayList<Integer> A, ArrayList<Integer> B) {
        // Write your code to check if array A is subarray of B or not.
        // If yes, then return True, otherwise return False.
        for(int i=0;i<A.size();i++) {
            if(A.get(i) < B.size() && A.get(i) > -1 && A.get(i) == B.get(i)) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean isSubArray_Problem_2_ea13a700_428a_4291_8706_37677367490e(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> A1 = new ArrayList<>();
        for (Integer value : A) {
            A1.add(value);
        }
        for (Integer value : B) {
            if (!A1.contains(value)) {
                return False;
            }
        }
        return True;
    }

    
    public static boolean isSubArray_Problem_1_ce4a4398_c6a2_4076_9467_853ed11a096b(ArrayList<Integer> A, ArrayList<Integer> B) {
        if (A.isEmpty() && B.isEmpty()) return True;
        if (A.isEmpty()) return False;
        if (B.isEmpty()) return False;
        int N = A.size();
        int m = B.size();
        if (N != m) {
            return False;
        }
        int i = 0; // index for A
        int j = 0; // index for B
        int sum = 0; // check sum
        int flag = 0; // check flag
        while (i < N && j < m) {
            sum += A.get(i++);
            sum += B.get(j++);
            if (sum == 0) return False;
            if (sum > N) return False;
            if (sum < 0) return False;
        }
        int k = 0;
        while (k < m && j < m) {
            sum += A.get(k++);
            sum += B.get(j++);
            if (sum == 0) return False;
            if (sum > N) return False;
            if (sum < 0) return False;
        }
        while (i < N && k < (m - 1)) {
            sum += A.get(i++);
            sum += B.get(k++);
            if (sum == 0) return False;
            if (sum > N) return False;
            if (sum < 0) return False;
        }
        while (j < m && k < (m - 1)) {
            sum += A.get(k++);
            sum += B.get(j++);
            if (sum == 0) return False;
            if (sum > N) return False;
            if (sum < 0) return False;
        }
        return (i == N && j == m);
    }

    
    public static boolean isSubArray_Problem_2_ce698eda_306d_4187_8613_d739ee4657de(ArrayList<Integer> A, ArrayList<Integer> B) {
        if (A.size() > B.size()) return False;
        for (int i = 0; i < B.size() - A.size() + 1; i++) {
            boolean isSub = True;
            for (int j = 0; j < A.size(); j++) {
                if (A.get(j) != B.get(i + j)) {
                    isSub = False;
                    break;
                }
            }
            if (isSub) return True;
        }
        return False;
    }

    
    public static boolean isSubArray_Problem_1_12b2904a_5252_4907_9cb5_92956aacf9d3(ArrayList<Integer> A, ArrayList<Integer> B) {
        int n = A.size();
        ArrayList<Integer> C = new ArrayList<>(n);
        for(int i = 0; i < n; i++) {
            if(A.get(i) > B.get(i))
                C.add(A.get(i));
        }
        if(C.size() == B.size())
            return True;
        else
            return False;
    }

    
    public static boolean isSubArray_Problem_0_b73a7345_9fc4_4106_a6a7_0044373590cb(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0, j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i) == B.get(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        if (j == B.size()) {
            return True;
        }
        return False;
    }

    
    public static boolean isSubArray_Problem_1_b3139b7b_e068_4f4c_a3b1_d925f10d6401(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0, j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i) == B.get(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        if (j == B.size()) {
            return True;
        }
        return False;
    }

    
    public static boolean isSubArray_Problem_2_7d92b1df_e257_410e_bea8_627099df7021(ArrayList<Integer> A, ArrayList<Integer> B) {
        return A.stream().filter(a -> B.contains(a)).collect(Collectors.toList()).equals(B);
    }

    
    public static boolean isSubArray_Problem_1_20ee2403_90b0_4b26_95b2_7de679b08858(ArrayList<Integer> A, ArrayList<Integer> B) {
        if (A.size() > B.size()) return False;
        for (int i = 0; i < B.size() - A.size() + 1; i++) {
            boolean found = True;
            for (int j = 0; j < A.size(); j++) {
                if (A.get(j) != B.get(i + j)) {
                    found = False;
                    break;
                }
            }
            if (found) return True;
        }
        return False;
    }

    
    public static boolean isSubArray_Problem_1_5ed10caa_97a3_4669_b9f0_330bcbad9578(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0, j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i) == B.get(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        return j == B.size();
    }

    
    public static boolean isSubArray_Problem_2_f795ad92_9871_4e05_bd21_676e1c14a0f2(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> A1 = new ArrayList<Integer>(A.size());
        ArrayList<Integer> B1 = new ArrayList<Integer>(B.size());
        for(Integer i : A) {
            A1.add(i);
        }
        for(Integer i : B) {
            B1.add(i);
        }
        ArrayList<Integer> A2 = new ArrayList<Integer>(A1.size());
        ArrayList<Integer> B2 = new ArrayList<Integer>(B1.size());
        for(Integer i : A1) {
            A2.add(i);
        }
        for(Integer i : B1) {
            B2.add(i);
        }
        return A2.containsAll(B2);
    }

    
    public static boolean isSubArray_Problem_1_b1177358_4a08_4af8_8be9_cac000b16c5b(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> A1 = new ArrayList<Integer>();
        ArrayList<Integer> B1 = new ArrayList<Integer>();
        for(int i = 0; i < A.size(); i++) {
            A1.add(A.get(i));
        }
        for(int i = 0; i < B.size(); i++) {
            B1.add(B.get(i));
        }
        ArrayList<Integer> A2 = new ArrayList<Integer>();
        ArrayList<Integer> B2 = new ArrayList<Integer>();
        for(int i = 0; i < A1.size(); i++) {
            A2.add(A1.get(i));
        }
        for(int i = 0; i < B1.size(); i++) {
            B2.add(B1.get(i));
        }
        if(A2.size() != B2.size()) {
            return False;
        }
        for(int i = 0; i < A2.size(); i++) {
            if(!A2.get(i).equals(B2.get(i))) {
                return False;
            }
        }
        return True;
    }

    
    public static boolean isSubArray_Problem_1_03879239_a673_4678_9d7f_6b46d1377576(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0, j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i) == B.get(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        if (j == B.size()) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isSubArray_Problem_1_fc638cb2_f31b_4a13_8afe_bef19dff66a8(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList newA = new ArrayList(A.size());
        for(Integer i: A) {
            newA.add(new Integer(i));
        }
        ArrayList newB = new ArrayList(B.size());
        for(Integer i: B) {
            newB.add(new Integer(i));
        }

        ArrayList tempA = new ArrayList(newA.size());
        ArrayList tempB = new ArrayList(newB.size());

        boolean flag = False;
        for(int i=0; i<newA.size(); i++) {
            tempA.add(i+1);
        }

        for(int i=0; i<newB.size(); i++) {
            tempB.add(i+1);
        }
        tempA.addAll(newA);
        tempB.addAll(newB);
        for(int i=0; i<newA.size() && i<newB.size(); i++) {
            if(tempB.contains(tempA.get(i))) flag = True;
        }
        return flag;
    }

    
    public static boolean isSubArray_Problem_1_b607d969_11df_4882_bf45_a339ff67cacb(ArrayList<Integer> A, ArrayList<Integer> B) {
        if (A.isEmpty() || B.isEmpty() || A.size() != B.size())
            return False;
        Set<Integer> setA = new HashSet<>(A);
        Set<Integer> setB = new HashSet<>(B);
        setA.retainAll(setB);
        setB.retainAll(setA);
        return setA.size() == 0 && setB.size() == 0;
    }

    
    public static boolean isSubArray_Problem_0_5ed3ec52_a6c7_44e3_9b57_4ca997cf1f82(ArrayList<Integer> A, ArrayList<Integer> B) {
        if (A.size() > B.size()) return False;
        for (int i = 0; i < B.size() - A.size() + 1; i++) {
            boolean flag = True;
            for (int j = 0; j < A.size(); j++) {
                if (A.get(j) != B.get(i + j)) {
                    flag = False;
                    break;
                }
            }
            if (flag) return True;
        }
        return False;
    }

    
    public static boolean isSubArray_Problem_0_b13fac2d_7259_4a59_b142_b253c6a8d046(ArrayList<Integer> A, ArrayList<Integer> B) {
        // Write your code here
        int flag = 0;
        if(A.size() != B.size()){
            return False;
        }
        for(int i=0; i<A.size(); i++){
            if(A.contains(B.get(i))){
                flag++;
            }
        }
        if(flag == A.size()){
            return True;
        }
        return False;
    }

    
    public static boolean isSubArray_Problem_0_92585f02_37d6_42a9_ae19_32f8e776b837(ArrayList<Integer> A, ArrayList<Integer> B) {
        //Write a code here
        if(A.size() != B.size())
            return False;
        
        ArrayList<Integer> sub = new ArrayList<Integer>();
        int temp;
        for(int i = 0; i < A.size(); i++) {
            temp = A.get(i);
            for(int j = i; j < A.size(); j++) {
                if(temp == B.get(j)) {
                    sub.add(temp);
                    j++;
                }
            }
        }
        
        for(int i = 0; i < A.size(); i++) {
            if(sub.contains(A.get(i))) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean isSubArray_Problem_0_55719a00_9f58_498f_a9c9_6d98482c2086(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0, j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i).equals(B.get(j))) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        if (j == B.size()) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isSubArray_Problem_2_7ca3dc85_d193_4ece_9bbc_fc05309f8fc8(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0;
        int j = 0;
        int k = 0;
        int l = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i) == B.get(j)) {
                i++;
                j++;
                k++;
                l++;
            } else if (A.get(i) > B.get(j)) {
                j++;
                k++;
                l++;
            } else {
                i++;
                k++;
                l++;
            }
        }
        return k == l;
    }

    
    public static boolean isSubArray_Problem_1_75b24365_8233_44c0_8bb6_6c513daeba3e(ArrayList<Integer> A, ArrayList<Integer> B) {
        // Write your logic here.
        boolean flag = False;
        if (A.size() != B.size()) {
            return flag;
        }
        int i = 0;
        while (i < A.size() && !flag) {
            if (A.get(i).compareTo(B.get(i)) < 0) {
                break;
            }
            i++;
        }
        return flag;
    }

    
    public static boolean isSubArray_Problem_2_67ddb410_83d2_45b9_9793_d20e2ca178d5(ArrayList<Integer> A, ArrayList<Integer> B) {
        boolean flag = False;
        int i = 0;
        for (int j = 0; j < A.size(); j++) {
            if((A.get (j) == B.get(i)) && ((i + 1) == B.size())) {
                flag = True;
            }
            i++;
        }
        return flag;
    }

    
    public static boolean isSubArray_Problem_0_5b636d7b_1fa0_4f37_b8aa_049388859379(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> C = new ArrayList<>(B);
        int t = 0;
        for (int i = 0; i< A.size(); i++){
            t += A.get(i);
        }
        if (t != 0){
            C.sort(Comparator.reverseOrder());
            if (C.equals(B))
                return True;
        }
        return False;
    }

    
    public static boolean isSubArray_Problem_1_fb40ddde_d9d4_4f94_8416_4dce8d061402(ArrayList<Integer> A, ArrayList<Integer> B) {
        int n = A.size();
        if (A.size() > B.size()) {
            System.out.println("The array list is too large!");
            return False;
        }
        ArrayList<Integer> temp = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int a = A.get(i);
            int b = B.get(i);
            if (!temp.contains(a)) {
                temp.add(a);
            }
        }
        if (A.size() > n) {
            for (int i = n; i < A.size(); i++) {
                temp.add(A.get(i));
            }
        }
        for (int i = 0; i < B.size(); i++) {
            if (!temp.contains(B.get(i))) {
                return False;
            }
        }
        return True;
    }

    
    public static boolean isSubArray_Problem_0_353e777f_629a_4634_b719_86cd1ed176a2(ArrayList<Integer> A, ArrayList<Integer> B) {
        if(A==null)return B==null;
        if(B==null)return False;
        if(A.size()==0)return B.size()==0;
        if(B.size()==0)return False;
        if(A.size()!=B.size())return False;
        Iterator<Integer> Aitr=A.iterator();
        Iterator<Integer> Bitr=B.iterator();
        while(Aitr.hasNext()){
            Integer Aval = Aitr.next();
            Integer Bval = Bitr.next();
            if(!Aval.equals(Bval))
                return False;
        }
        return True;
    }

    
    public static boolean isSubArray_Problem_1_4fb15af6_5978_4381_8fad_80e5e871ee75(ArrayList<Integer> A, ArrayList<Integer> B) {
        // Write your logic here
        int n = A.size();
        int m = B.size();
        int sum = 0;
        // We need to find out the smallest and the biggest subarray
        // and their sum
        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                if(A.get(i)>B.get(j)) {
                    sum -= A.get(i);
                    i++;
                }
                else if(A.get(i)<B.get(j)) {
                    sum -= B.get(j);
                    j++;
                }
                else {
                    sum += A.get(i);
                    i++;
                    j++;
                }
            }
        }
        return sum == 0;
    }

    
    public static boolean isSubArray_Problem_2_ebc57fca_09cd_49cb_a004_b8dee126d774(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> temp = new ArrayList<>();
        for(Integer i : A) {
            if(!temp.contains(i)) {
                temp.add(i);
            }
        }
        for(Integer i : B) {
            if(!temp.contains(i)) {
                temp.add(i);
            }
        }
        return temp.size() == A.size();
    }

    
    public static boolean isSubArray_Problem_0_00632c35_a34c_4c70_9465_97674e36d3dc(ArrayList<Integer> A, ArrayList<Integer> B) {
        // Check if A is an empty array list or not.
        if (A.isEmpty()) {
            return False;
        }

        // Check if the length of A is equal to the length of B
        if (A.size() != B.size()) {
            return False;
        }

        // Loop through the two lists and compare the two elements at respective indices if they are equal
        for (int i = 0; i < A.size(); i++) {
            if (A.get(i) != B.get(i)) {
                return False;
            }
        }

        // If we made it here then all the elements are equal and A is a subarray of B
        return True;
    }

    
    public static boolean isSubArray_Problem_1_1b8a8487_aedc_4b14_827b_fbe651b7a52b(ArrayList<Integer> A, ArrayList<Integer> B) {
        if (A.size() > B.size()) {
            return False;
        }
        int i = 0;
        int j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i).equals(B.get(j))) {
                i++;
                j++;
            } else {
                i = 0;
                j++;
            }
        }
        if (i == A.size()) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isSubArray_Problem_1_9c5290fe_a78d_4a11_b823_ec3aa0d85e8e(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> temp = A;
        int n = A.size();
        int m = B.size();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (A.get(i).compareTo(B.get(j)) < 0) {
                    temp.remove(i);
                    i--;
                }
            }
        }
        return A.isEmpty();
    }

    
    public static boolean isSubArray_Problem_0_b181c738_b1e3_4e7e_8b3a_d261c93f33ac(ArrayList<Integer> A, ArrayList<Integer> B) {
        if(A.size() <= B.size())
            return False;
        ArrayList<Integer> subArray = new ArrayList<>();
        for(int i=0; i<A.size(); i++)
            if(B.contains(A.get(i)))
                subArray.add(A.get(i));
        return subArray.equals(B);
    }

    
    public static boolean isSubArray_Problem_2_0b2c4e37_eba1_4478_9f97_0c03da193bd4(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0, j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i).equals(B.get(j))) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        return j == B.size();
    }

    
    public static boolean isSubArray_Problem_1_3a10e654_46cc_470a_88ae_c195652f5472(ArrayList<Integer> A, ArrayList<Integer> B) {
        // write your logic here
        return True; // <- the actual logic
    }

    
    public static boolean isSubArray_Problem_2_b2b0fb83_edc8_4756_bfba_748f34bb0129(ArrayList<Integer> A, ArrayList<Integer> B) {
        return A.subList(A.size() - B.size(), A.size()).equals(B);
    }

    
    public static boolean isSubArray_Problem_0_bdbcc40e_ade6_433c_b414_38608089b9a5(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> C = new ArrayList<Integer>();
        for (int i = 0; i < A.size(); i++) {
            int index = 0;
            while (index < B.size() && A.get(i) == B.get(index)) {
                index++;
            }
            C.add(A.get(i));
        }
        ArrayList<Integer> D = new ArrayList<Integer>();
        for (int i = 0; i < A.size(); i++) {
            int index = 0;
            while (index < C.size() && A.get(i) == C.get(index)) {
                index++;
            }
            D.add(A.get(i));
        }
        return A.equals(D);
    }

    
    public static boolean isSubArray_Problem_2_5b636d7b_1fa0_4f37_b8aa_049388859379(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> C = new ArrayList<>(B);
        int t = 0;
        for (int i = 0; i< A.size(); i++){
            t += A.get(i);
        }
        if (t != 0){
            C.sort(Comparator.reverseOrder());
            if (C.equals(B))
                return True;
        }
        return False;
    }

    
    public static boolean isSubArray_Problem_2_6db860e3_85ee_4fca_b1ba_6d03a80f933f(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> AB = new ArrayList<Integer>();
        for (Integer i : A) {
            for (Integer j : B) {
                if (i.equals(j)) {
                    AB.add(i);
                }
            }
        }
        return AB.equals(B);
    }

    
    public static boolean isSubArray_Problem_1_e0891221_f213_45fe_8f89_a8dc6c4f7a55(ArrayList<Integer> A, ArrayList<Integer> B) {
        if (A.size() > B.size()) {
            return False;
        }
        ArrayList<Integer> B1 = new ArrayList<Integer>(B);
        ArrayList<Integer> A1 = new ArrayList<Integer>(A);
        ArrayList<Integer> A2 = new ArrayList<Integer>(A.size());
        ArrayList<Integer> B2 = new ArrayList<Integer>(B.size());
        for (Integer i : A) {
            A1.remove(i);
        }
        boolean flag = False;
        int i = 0;
        while (i < A1.size() && i < B1.size()) {
            if (A1.get(i) == B1.get(i)) {
                A2.remove(i);
                i++;
            } else if (A1.get(i) > B1.get(i)) {
                flag = True;
                break;
            } else {
                B2.remove(i);
                i++;
            }
        }
        if (A1.size() < B1.size()) {
            flag = True;
        }
        if (A2.size() > B2.size()) {
            flag = False;
        }
        return flag;
    }

    
    public static boolean isSubArray_Problem_2_8e9fd48b_e49c_4bb7_b62e_efb9c6d68c19(ArrayList<Integer> A, ArrayList<Integer> B) {
        //write your logic here
        return False;
    }

    
    public static boolean isSubArray_Problem_2_3586f536_e855_449e_85e6_b078abff2c87(ArrayList<Integer> A, ArrayList<Integer> B) {
        int i = 0;
        int j = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i) == B.get(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        if (j == B.size()) {
            return True;
        } else {
            return False;
        }
    }

    
    public static boolean isSubArray_Problem_2_e76267e9_4fe4_4de4_ad68_b5519fd96a59(ArrayList<Integer> A, ArrayList<Integer> B) {
        // Write your code here
        ArrayList<Integer> temp = new ArrayList<Integer>();
        for(Integer i : A) {
            for(Integer j : B) {
                if(i == j) {
                    temp.add(i);
                }
            }
        }
        return temp.isEmpty();
    }

    
    public static boolean isSubArray_Problem_2_4fb15af6_5978_4381_8fad_80e5e871ee75(ArrayList<Integer> A, ArrayList<Integer> B) {
        // Write your logic here
        int n = A.size();
        int m = B.size();
        int sum = 0;
        // We need to find out the smallest and the biggest subarray
        // and their sum
        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                if(A.get(i)>B.get(j)) {
                    sum -= A.get(i);
                    i++;
                }
                else if(A.get(i)<B.get(j)) {
                    sum -= B.get(j);
                    j++;
                }
                else {
                    sum += A.get(i);
                    i++;
                    j++;
                }
            }
        }
        return sum == 0;
    }

    
    public static boolean isSubArray_Problem_0_9289599b_87cb_4d0f_9f37_8403fc0d40d2(ArrayList<Integer> A, ArrayList<Integer> B) {
        boolean isSubArray_Problem_0_9289599b_87cb_4d0f_9f37_8403fc0d40d2 = False;
        int [] a = new int[A.size()];
        int [] b = new int[B.size()];
        for(int i=0; i<A.size(); i++) {
            a[i] = A.get(i);
        }
        for(int i=0; i<B.size(); i++) {
            b[i] = B.get(i);
        }
        Arrays.sort(a);
        Arrays.sort(b);
        for(int i=0; i<a.length; i++) {
            if(a[i] != b[i]) {
                isSubArray_Problem_0_9289599b_87cb_4d0f_9f37_8403fc0d40d2 = False;
                break;
            }
        }
        return isSubArray_Problem_0_9289599b_87cb_4d0f_9f37_8403fc0d40d2;
    }

    
    public static boolean isSubArray_Problem_0_0eac9ac3_92fd_4a81_9033_d1d06203231d(ArrayList<Integer> A, ArrayList<Integer> B) {
        if (A.size() != B.size())
            return False;

        int i = 0, j = 0, k = 0;
        while (i < A.size() && j < B.size()) {
            if (A.get(i) > B.get(j))
                i++;
            else if (A.get(i) < B.get(j))
                j++;
            else {
                if (A.get(i) == B.get(j)) {
                    i++;
                    j++;
                } else if (A.get(i) > B.get(j)) {
                    i++;
                } else {
                    j++;
                }
            }
        }
        return i == A.size();
    }

    
    public static boolean isSubArray_Problem_1_dc34e281_3505_4e9c_b17a_bc85af920265(ArrayList<Integer> A, ArrayList<Integer> B) {
        if (A.size() != B.size()) {
            return False;
        }
        for (int i = 0; i < A.size(); i++) {
            if (A.get(i) != B.get(i)) {
                return False;
            }
        }
        return True;
    }

    
    public static boolean isSubArray_Problem_0_74672463_eb4f_4524_bba4_c73cd6d1ce81(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> A1 = new ArrayList<>();
        ArrayList<Integer> B1 = new ArrayList<>();
        for (int i = 0; i < A.size(); i++) {
            A1.add(A.get(i));
        }
        for (int i = 0; i < B.size(); i++) {
            B1.add(B.get(i));
        }
        if (A.size() != B.size()) {
            return False;
        }
        for (int i = 0; i < A.size(); i++) {
            if (!A1.contains(B.get(i))) {
                return False;
            }
        }
        return True;
    }

    
    public static boolean isSubArray_Problem_0_49f10157_70a9_48e0_95c2_555630a36f9b(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> A1 = new ArrayList<Integer>(A);
        ArrayList<Integer> B1 = new ArrayList<Integer>(B);
        ArrayList<Integer> C = new ArrayList<Integer>();
        for(int i = 0; i < A.size(); i++) {
            for(int j = 0; j < B.size(); j++) {
                if(A.get(i) == B.get(j)) {
                    C.add( i);
                    C.add( j);
                }
            }
        }
        boolean result = False;
        if(C.size() == A.size() && C.size() == B.size()) {
            result = True;
        }
        return result;
    }

    
    public static boolean isSubArray_Problem_2_5c79f354_2bc5_484c_9b16_b396f80d29bc(ArrayList<Integer> A, ArrayList<Integer> B) {
        // Write your code here.
        return False;
    }

    
    public static boolean isSubArray_Problem_2_577ae08e_2e2c_488a_9e81_20b9e44356ee(ArrayList<Integer> A, ArrayList<Integer> B) {
        if (A == null || B == null || A.size() != B.size()) return False;
        int i = 0;
        int j = 0;
        for (i = A.size() - 1; i >= 0; i--)
            if (A.get(i) == B.get(j++)) return True;
        return False;
    }

    
    public static boolean isSubArray_Problem_2_ae81f484_d211_4149_84d9_569678c65835(ArrayList<Integer> A, ArrayList<Integer> B) {
        if (A.isEmpty() && B.isEmpty()) return True;
        if (A.size() != B.size()) return False;
        
        if (A.size() == 0) return False;

        for(int i = 0; i < A.size(); i++) {
            if (A.get(i) < B.get(i)) return False;
            if (A.get(i) > B.get(i)) return False;
        }
        
        return True;
    }

    
    public static boolean isSubArray_Problem_1_2c1a2f83_577a_4218_a4db_ca5dc0b18a07(ArrayList<Integer> A, ArrayList<Integer> B) {
        for (int i = 0; i < B.size() - A.size() + 1; i++) {
            boolean isSub = True;
            for (int j = 0; j < A.size(); j++) {
                if (B.get(i + j) != A.get(j)) {
                    isSub = False;
                    break;
                }
            }
            if (isSub) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean isSubArray_Problem_0_32da881c_4415_47a4_bb4b_12c2b8e40edc(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> C = new ArrayList<>();
        C.add(A.get(0));
        for(int i = 1; i < A.size(); i++) {
            if(A.get(i) == A.get(i-1)) {
                C.add(A.get(i));
            }
        }
        for(int i = 0; i < B.size(); i++) {
            if(C.contains(B.get(i))) {
                return True;
            }
        }
        return False;
    }

    
    public static boolean isSubArray_Problem_1_961d4c66_c1ab_4348_ab82_64ff79bb3b78(ArrayList<Integer> A, ArrayList<Integer> B) {
        int [] a = new int[A.size()];
        int [] b = new int[B.size()];
        for(int i=0;i<A.size();i++) {
            a[i] = A.get(i);
        }
        for(int i=0;i<B.size();i++) {
            b[i] = B.get(i);
        }
        Arrays.sort(a);
        Arrays.sort(b);
        for(int i=0;i<a.length;i++) {
            if(a[i]!=b[i]) {
                return False;
            }
        }
        return True;
    }

}
