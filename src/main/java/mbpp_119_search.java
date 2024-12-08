package mbpp_119_search;

public class mbpp_119_search {

    
    public static int search_Problem_0_ecd82e1e_25ed_4707_a84a_eb323245db35(ArrayList<Integer> arr) {
        int count = 0;
        int temp = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == temp) {
                count++;
            }
        }
        return count;
    }

    
    public static int search_Problem_2_fc40d6a2_662b_4afd_99ad_2d0a772c7882(ArrayList<Integer> arr) {
        int count = 0;
        for (int val: arr) {
            if (count == 0) return val;
            if (val == count) count++;
        }
        return -1;
    }

    
    public static int search_Problem_0_85637d3a_3be3_4987_9d15_8755d502155e(ArrayList<Integer> arr) {
        int result = 0;
        int count = 1;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == arr.get(i+1)) {
                count++;
            } else {
                if(count == 1) {
                    result = arr.get(i);
                }
                count = 1;
            }
        }
        return result;
    }

    
    public static int search_Problem_1_4f62a228_c72f_4a78_99ed_3e57c2b385b0(ArrayList<Integer> arr) {
        int max = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == max) {
                continue;
            }
            if(arr.get(i) < max) {
                max = arr.get(i);
            }
        }
        return max;
    }

    
    public static int search_Problem_1_7e40b5e2_acd2_4d22_8618_9255886f9ad7(ArrayList<Integer> arr) {
        int result = -1;
        int count = 1;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == result) {
                count++;
            } else {
                if(count == 1) {
                    result = arr.get(i);
                }
                count = 1;
            }
        }
        return result;
    }

    
    public static int search_Problem_2_b1b91365_b55b_441b_9756_9d73ed2bbd6c(ArrayList<Integer> arr) {
        int result = 0;
        int count = 1;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == arr.get(i)) {
                count++;
            }
        }
        if(count == 1) {
            result = arr.get(0);
        }
        return result;
    }

    
    public static int search_Problem_1_9e2dc89f_88ee_4676_9a96_308b6d2f2c67(ArrayList<Integer> arr) {
        int result = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == 1) {
                result = i;
                break;
            }
        }
        return result;
    }

    
    public static int search_Problem_0_b1b91365_b55b_441b_9756_9d73ed2bbd6c(ArrayList<Integer> arr) {
        int result = 0;
        int count = 1;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == arr.get(i)) {
                count++;
            }
        }
        if(count == 1) {
            result = arr.get(0);
        }
        return result;
    }

    
    public static int search_Problem_0_f1896028_2bcd_40b9_9570_560d0e9643b7(ArrayList<Integer> arr) {
        int result = 0;
        boolean found = False;
        for(int i = 0; i < arr.size(); i++) {
            if(!found) {
                if(arr.get(i) == 1) {
                    found = True;
                } else {
                    result = result + arr.get(i);
                }
            } else {
                result = result + arr.get(i);
            }
        }
        return result;
    }

    
    public static int search_Problem_0_707b9bc8_1dc2_4d86_80af_8f9648262e87(ArrayList<Integer> arr) {
        int result = -1;
        int count = 0;
        for (int i : arr) {
            if (i == 1) {
                count++;
                if (count == 1) {
                    result = i;
                    break;
                }
            }
        }
        return result;
    }

    
    public static int search_Problem_0_c63048c6_bf74_4565_b9bd_e597526626b2(ArrayList<Integer> arr) {
        int result = 0;
        int temp = 0;
        for(int i = 0; i < arr.size(); i++) {
            temp = arr.get(i);
            for(int j = i+1; j < arr.size(); j++) {
                if(temp == arr.get(j)) {
                    result = temp;
                    break;
                }
            }
        }
        return result;
    }

    
    public static int search_Problem_1_5f3a4434_8627_4d7a_aef4_97df8bfc0cc9(ArrayList<Integer> arr) {
        int result = 0;
        int temp = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == temp) {
                temp = arr.get(i) + 1;
            } else {
                temp = arr.get(i);
            }
        }
        return result;
    }

    
    public static int search_Problem_0_d3b93434_d867_4b81_85b8_9887961b2504(ArrayList<Integer> arr) {
        int result = 0;
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            int current = arr.get(i);
            for(int j = i + 1; j < arr.size(); j++) {
                if(current == arr.get(j)) {
                    count++;
                }
            }
            if(count == 1) {
                result = current;
                break;
            }
            count = 0;
        }
        return result;
    }

    
    public static int search_Problem_2_f5e1b9fa_9ede_46fa_a129_e77a936bb5b8(ArrayList<Integer> arr) {
        int result = 0;
        int temp = 0;
        for(int i = 0; i < arr.size(); i++) {
            temp = arr.get(i);
            for(int j = i+1; j < arr.size(); j++) {
                if(temp == arr.get(j)) {
                    result = result + 1;
                }
            }
        }
        return result;
    }

    
    public static int search_Problem_1_fc268d5d_8208_4c86_b301_53da315d8c38(ArrayList<Integer> arr) {
        int result = 0;
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == 1) {
                count++;
            }
            if(count == 1) {
                result = arr.get(i);
            }
        }
        return result;
    }

    
    public static int search_Problem_2_494159bf_f8a2_45cb_9969_7d949f8813b8(ArrayList<Integer> arr) {
        int result = 0;
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == arr.get(i)) {
                count++;
            }
        }
        if(count == 1) {
            result = arr.get(0);
        }
        return result;
    }

    
    public static int search_Problem_2_fabd4c05_871a_450b_a559_853531d9e9ab(ArrayList<Integer> arr) {
        int result = -1;
        int count = 1;
        for (int i : arr) {
            if (i == result) {
                count++;
            } else {
                if (count == 1) {
                    result = i;
                }
                count = 1;
            }
        }
        return result;
    }

    
    public static int search_Problem_1_589e5ff3_8757_40b6_a04e_80cf30916137(ArrayList<Integer> arr) {
        int result = -1;
        int prev = 0;
        int curr = arr.get(0);
        int count = 1;
        for(int i = 1; i < arr.size(); i++) {
            if(arr.get(i) == curr) {
                count++;
            } else {
                if(count == 1) {
                    result = curr;
                } else {
                    result = -1;
                    break;
                }
                count = 1;
                curr = arr.get(i);
            }
        }
        return result;
    }

    
    public static int search_Problem_1_dd866c31_b52c_48ea_ae88_6bce12bb3782(ArrayList<Integer> arr) {
        int result = -1;
        int count = 1;
        for (int i : arr) {
            if (i == count) {
                result = i;
                break;
            }
            count++;
        }
        return result;
    }

    
    public static int search_Problem_1_17377b8c_dde6_444c_a765_12a6a90beba5(ArrayList<Integer> arr) {
        int result = -1;
        int temp = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == temp) {
                temp = arr.get(i);
                i++;
            }
            else if (arr.get(i) > temp) {
                temp = arr.get(i);
                result = temp;
            }
        }
        return result;
    }

    
    public static int search_Problem_1_1c474911_2015_4297_82fc_73e81da12cfc(ArrayList<Integer> arr) {
        int result = -1;
        int count = 1;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == arr.get(i)) {
                count++;
            }
            if(count == 1) {
                result = arr.get(i);
            }
        }
        return result;
    }

    
    public static int search_Problem_0_981875f0_d32b_45f6_838f_daff1a90f9f9(ArrayList<Integer> arr) {
        int result = 0;
        int count = 1;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == arr.get(i-1)) {
                count++;
            }
            else {
                if(count == 1) {
                    result = arr.get(i);
                }
                count = 1;
            }
        }
        return result;
    }

    
    public static int search_Problem_2_23c51c6a_8758_4769_a0bd_b0833b6e4b8d(ArrayList<Integer> arr) {
        int result = -1;
        ArrayList<Integer> al = new ArrayList<>(arr);
        Collections.sort(al);
        for (int i = 0; i < al.size(); i++) {
            if (result == -1 && al.get(i) == 1) {
                result = i;
            }
            if (result == -1 && al.get(i) != 1) {
                result = -1;
            }
        }
        return result;
    }

    
    public static int search_Problem_0_35844f25_680d_4e00_a897_b0d0ea595b79(ArrayList<Integer> arr) {
        int result = -1;
        int firstElem = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i) > firstElem) {
                result = firstElem;
                break;
            } else {
                firstElem = arr.get(i);
            }
        }
        return result;
    }

    
    public static int search_Problem_0_ebd30727_ffad_48ff_97f7_87c1f32db71c(ArrayList<Integer> arr) {
        int result = -1;
        int temp = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == temp) {
                temp++;
            } else {
                temp = arr.get(i);
            }
        }
        return result;
    }

    
    public static int search_Problem_1_8114e5ec_8420_478a_9878_f8d4f8eb50d4(ArrayList<Integer> arr) {
        int start = 0;
        int end = arr.size() - 1;
        int mid = (start + (end - start)) / 2;
        while (start <= end) {
            if (arr.contains(mid)) {
                if (mid < arr.size() - 1) {
                    mid = (mid + end) / 2;
                    start = mid + 1;
                } else {
                    mid = (mid + start) / 2;
                    end = mid - 1;
                }
            } else {
                start = mid + 1;
            }
        }
        return arr.get(mid);
    }

    
    public static int search_Problem_0_8738f5cd_62f9_4863_bb04_9d8072d35282(ArrayList<Integer> arr) {
        int result = 0;
        int count = 1;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == arr.get(i+1)) {
                count++;
            }
            else {
                if(count == 1) {
                    result = arr.get(i);
                }
                count = 1;
            }
        }
        return result;
    }

    
    public static int search_Problem_1_c1224330_5d85_4d1d_a058_3a1146147d42(ArrayList<Integer> arr) {
        int result = -1;
        int count = 1;
        for(int i = 1; i < arr.size(); i++) {
            if(arr.get(i) == arr.get(i-1)) count++;
            else if(arr.get(i) > arr.get(i-1)) break;
            else result = arr.get(i);
        }
        return result;
    }

    
    public static int search_Problem_2_41cd25a7_6b26_4fda_b2e8_389019d1a5bb(ArrayList<Integer> arr) {
        int count = 0;
        int lastValue = arr.get(0);
        for(int i : arr) {
            if(i == lastValue) {
                count++;
            } else {
                count = 0;
            }
            lastValue = i;
        }
        return count;
    }

    
    public static int search_Problem_0_58781114_7016_4c3f_a16f_dfea225759d6(ArrayList<Integer> arr) {
        int result = -1;
        int count = 0;
        for (int i : arr) {
            if (i == 1) {
                count++;
                if (count == 1) {
                    result = i;
                    break;
                }
            }
        }
        return result;
    }

    
    public static int search_Problem_2_7e40b5e2_acd2_4d22_8618_9255886f9ad7(ArrayList<Integer> arr) {
        int result = -1;
        int count = 1;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == result) {
                count++;
            } else {
                if(count == 1) {
                    result = arr.get(i);
                }
                count = 1;
            }
        }
        return result;
    }

    
    public static int search_Problem_0_08de4047_bb9c_47a9_b0ef_ffdcf448fe77(ArrayList<Integer> arr) {
        int count = 1;
        int max = 0;
        int temp = 0;
        for(int i = 0; i < arr.size(); i++) {
            temp = arr.get(i);
            if(temp > max) {
                max = temp;
            }
            if(temp == max) {
                count++;
            }
        }
        return count;
    }

    
    public static int search_Problem_2_011294c5_0c89_4167_b1d3_52b92d3f7c3d(ArrayList<Integer> arr) {
        int result = 0;
        int temp = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == 1) {
                temp = i;
            }
        }
        for(int i = arr.size()-1; i >= 0; i--) {
            if(arr.get(i) == 1) {
                result = result + 1;
            }
        }
        return result;
    }

    
    public static int search_Problem_2_cebf434e_31f0_4fff_9847_8465d09d4222(ArrayList<Integer> arr) {
        int result = -1;
        int count = 0;
        for(int i : arr) {
            if(i == result) {
                count++;
            }
            else {
                if(count == 1) {
                    result = i;
                }
                count = 0;
            }
        }
        return result;
    }

    
    public static int search_Problem_1_cb0d16a4_3c97_4f67_a67d_7c5e2e67339d(ArrayList<Integer> arr) {
        int result = 0;
        int count = 1;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == arr.get(i)) {
                count++;
            } else {
                if(count == 1) {
                    result = arr.get(i);
                }
                count = 1;
            }
        }
        return result;
    }

    
    public static int search_Problem_2_a0fe351c_3ba6_4952_ae37_6bf294ca26f8(ArrayList<Integer> arr) {
        // Initialize a flag to check whether it is already in the array.
        boolean flag = True;
        int counter = 1;

        // Loop through the array list to check whether the current element appears once.
        for (int i = 0; i < arr.size(); i++) {
            if (flag) {
                flag = False;
            } else {
                if (arr.get(i) == counter) {
                    counter++;
                } else {
                    flag = True;
                }
            }
        }
        return counter;
    }

    
    public static int search_Problem_0_888fa97c_b067_4499_a0ab_601b9dff16a6(ArrayList<Integer> arr) {
        int ans = Integer.MAX_VALUE;
        int count = 0;
        for (Integer val : arr) {
            if (val == count) {
                count++;
            } else {
                count = val;
            }
        }
        ans = count;
        return ans;
    }

    
    public static int search_Problem_2_db08f7f4_f0a4_4820_b7d4_7e433c8d2885(ArrayList<Integer> arr) {
        int result = -1;
        int temp = 0;
        for(int i = 0; i < arr.size(); i++) {
            temp = arr.get(i);
            for(int j = i+1; j < arr.size(); j++) {
                if(temp == arr.get(j)) {
                    result = temp;
                    break;
                }
            }
        }
        return result;
    }

    
    public static int search_Problem_2_ed601480_37fb_4287_aeba_c5d9d6eb72d3(ArrayList<Integer> arr) {
        int result = 0;
        int count = 1;
        for(int i : arr) {
            if(i == count) {
                result = i;
                break;
            }
            count++;
        }
        return result;
    }

    
    public static int search_Problem_2_9e9a7398_1a79_4b46_8775_401b7a4ec3d6(ArrayList<Integer> arr) {
        int result = -1;
        int count = 1;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == result) {
                count++;
            }
            if(count == 1) {
                result = arr.get(i);
            }
        }
        return result;
    }

    
    public static int search_Problem_1_41cd25a7_6b26_4fda_b2e8_389019d1a5bb(ArrayList<Integer> arr) {
        int count = 0;
        int lastValue = arr.get(0);
        for(int i : arr) {
            if(i == lastValue) {
                count++;
            } else {
                count = 0;
            }
            lastValue = i;
        }
        return count;
    }

    
    public static int search_Problem_2_16031550_19ad_44e0_8141_b11ea35aebbb(ArrayList<Integer> arr) {
        int result = -1;
        int lastValue = -1;
        int count = 0;
        for (int i : arr) {
            if (i == lastValue) {
                count++;
            } else {
                if (count == 1) {
                    result = i;
                }
                lastValue = i;
                count = 1;
            }
        }
        return result;
    }

    
    public static int search_Problem_0_88eb38f8_36a6_4f6f_a58e_58be07592f89(ArrayList<Integer> arr) {
        int count = 0;
        int lastValue = arr.get(0);
        int lastCount = 1;
        for (int value : arr) {
            if (value == lastValue) {
                count++;
            } else {
                if (count == lastCount) {
                    return lastValue;
                } else {
                    lastValue = value;
                    lastCount = count;
                }
                count = 1;
            }
        }
        return lastValue;
    }

    
    public static int search_Problem_0_894f2213_c171_4ab8_9457_100b6ce57211(ArrayList<Integer> arr) {
        int result = -1;
        int count = 1;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == arr.get(i)) {
                count++;
            }
            if(count == 1) {
                result = arr.get(i);
            }
        }
        return result;
    }

    
    public static int search_Problem_1_1e9d31d8_d742_432c_bc39_f3fdee4c6a6f(ArrayList<Integer> arr) {
        int temp = 0;
        for (int i : arr) {
            if (arr.contains(i)) {
                temp++;
            }
        }
        return temp;
    }

    
    public static int search_Problem_0_3f811cda_7bb0_4fb1_a365_8cd2e6cc4376(ArrayList<Integer> arr) {
        int result = 0;
        int count = 1;
        for(int i = 1; i < arr.size(); i++) {
            if(arr.get(i) == arr.get(i-1)) count++;
            else result = arr.get(i-1);
        }
        return result;
    }

    
    public static int search_Problem_2_a808af77_b108_4750_a6cd_2540b2c9cb38(ArrayList<Integer> arr) {
        // code here
        int maxCount = 0 ;
        int temp ;
        int i= 0 ;
        for( ; i < arr.size() ; i++ ) {
            int count = 0;
            temp = arr.get(i) ;
            while( i < arr.size() ) {
                count++ ;
                i++;
            }
            if ( temp == arr.get(i) ) {
                count ++ ;
            }
            if ( maxCount < count ) {
                maxCount = count ;
            }
        }
        return maxCount ;
    }

    
    public static int search_Problem_2_1e9d31d8_d742_432c_bc39_f3fdee4c6a6f(ArrayList<Integer> arr) {
        int temp = 0;
        for (int i : arr) {
            if (arr.contains(i)) {
                temp++;
            }
        }
        return temp;
    }

    
    public static int search_Problem_1_a37439a1_6919_482b_abdd_965fc80b29fb(ArrayList<Integer> arr) {
        int result = -1;
        int count = 0;
        for (int i : arr) {
            if (i == 1) {
                count++;
                if (count == 1) {
                    result = i;
                    break;
                }
            }
        }
        return result;
    }

    
    public static int search_Problem_0_186d2b20_c70f_42a1_beb5_03bfffd5485c(ArrayList<Integer> arr) {
        int count = 0;
        int lastValue = arr.get(0);
        for(int i = 1; i < arr.size(); i++) {
            if(arr.get(i) == lastValue) {
                count++;
            } else {
                count = 0;
            }
            lastValue = arr.get(i);
        }
        return count;
    }

    
    public static int search_Problem_1_4bec2d11_5a1b_4566_a00d_6864aa407857(ArrayList<Integer> arr) {
        // Sort the ArrayList
        arr.sort(Comparator.comparingInteger(Integer::intValue));
        // Return first element that appears only once
        return IntStream.range(1, arr.size()).filter(i -> arr.get(i - 1) == arr.get(i)).count();
    }

    
    public static int search_Problem_2_b9c201ce_d5af_4a5d_adb9_944d91678bda(ArrayList<Integer> arr) {
        int count = 1;
        int result = -1;
        for (int i : arr) {
            if (i == count) {
                result = i;
                break;
            }
            count++;
        }
        return result;
    }

    
    public static int search_Problem_2_901a9932_823c_4efa_9b3d_18a7d81ca435(ArrayList<Integer> arr) {
        int result = 0;
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (count == 0) {
                count++;
                result = arr.get(i);
            } else if (arr.get(i) != result) {
                count--;
            }
        }
        return result;
    }

    
    public static int search_Problem_2_d9e738d7_802c_4f06_8c53_601731771bdb(ArrayList<Integer> arr) {
        int result = 0;
        int lastValue = arr.get(0);
        int lastCount = 0;
        for(int i = 1; i < arr.size(); i++) {
            if(arr.get(i) == lastValue) {
                lastCount++;
            } else {
                if(lastCount > 1) {
                    result = lastValue;
                    break;
                }
                lastValue = arr.get(i);
                lastCount = 1;
            }
        }
        return result;
    }

    
    public static int search_Problem_0_e1a7fe11_17fb_4acc_b796_86463b791617(ArrayList<Integer> arr) {
        int result = -1;
        int prev = 0;
        for(int i = 1; i < arr.size(); i++) {
            if(arr.get(i) == prev) {
                prev = arr.get(i);
            } else {
                result = arr.get(i);
                prev = arr.get(i);
            }
        }
        return result;
    }

    
    public static int search_Problem_2_9cafb583_e5fa_4735_917b_013ad2ac103a(ArrayList<Integer> arr) {
        int result = 0;
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == arr.get(i)) {
                count++;
            }
        }
        if(count == 1) {
            result = arr.get(0);
        }
        return result;
    }

    
    public static int search_Problem_0_894886b4_5701_41ee_9dd7_b9e3783248c2(ArrayList<Integer> arr) {
        int count = 0;
        int temp;
        for(int i = 0; i < arr.size(); i++) {
            temp = arr.get(i);
            for(int j = i + 1; j < arr.size(); j++) {
                if(temp == arr.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int search_Problem_2_ecd82e1e_25ed_4707_a84a_eb323245db35(ArrayList<Integer> arr) {
        int count = 0;
        int temp = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == temp) {
                count++;
            }
        }
        return count;
    }

    
    public static int search_Problem_0_d9c77908_9d34_4815_8c23_c883bc8e8a5d(ArrayList<Integer> arr) {
        // Write - Your - Code
        int result = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (i == 0) {
                if (arr.get(i) != arr.get(i + 1)) {
                    result = arr.get(i);
                    break;
                }
            } else if (i == arr.size() - 1) {
                if (arr.get(i) != arr.get(i - 1)) {
                    result = arr.get(i);
                    break;
                }
            } else {
                if (arr.get(i) != arr.get(i - 1) && arr.get(i) != arr.get(i + 1)) {
                    result = arr.get(i);
                    break;
                }
            }
        }
        return result;
    }

    
    public static int search_Problem_0_57e67dc6_d012_4d4d_a724_fa584d5599b5(ArrayList<Integer> arr) {
        // Write your code here
        int size = arr.size();
        int count = 1;
        for(int i=0;i<size;i++){
            if(arr.get(i)==1)
                count++;
        }
        for(int i=0;i<size;i++){
            if(arr.get(i)==1)
                arr.set(i,count);
        }
        int result = 1;
        for(int i=0;i<size;i++){
            if(arr.get(i)==1)
                result+=1;
        }
        return result;
    }

    
    public static int search_Problem_0_8c1e17da_c055_4b91_bf50_f4128c0d6f35(ArrayList<Integer> arr) {
        int result = 0;
        int count = 1;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == arr.get(i-1)) {
                count++;
            }
            else {
                if(count == 1) {
                    result = arr.get(i);
                }
                count = 1;
            }
        }
        return result;
    }

    
    public static int search_Problem_1_f208e2a9_5748_4167_bf83_2c404ea2aef6(ArrayList<Integer> arr) {
        int result = 0;
        int temp = 0;
        for(int i = 0; i < arr.size(); i++) {
            temp = arr.get(i);
            for(int j = i + 1; j < arr.size(); j++) {
                if(temp == arr.get(j)) {
                    result = result + 1;
                }
            }
        }
        return result;
    }

    
    public static int search_Problem_0_d9e738d7_802c_4f06_8c53_601731771bdb(ArrayList<Integer> arr) {
        int result = 0;
        int lastValue = arr.get(0);
        int lastCount = 0;
        for(int i = 1; i < arr.size(); i++) {
            if(arr.get(i) == lastValue) {
                lastCount++;
            } else {
                if(lastCount > 1) {
                    result = lastValue;
                    break;
                }
                lastValue = arr.get(i);
                lastCount = 1;
            }
        }
        return result;
    }

    
    public static int search_Problem_0_47b1cc23_c636_4406_b362_94935483762d(ArrayList<Integer> arr) {
        int count = 1;
        int max = 0;
        int min = 0;
        int temp = 0;
        for(int i = 0; i < arr.size(); i++) {
            temp = arr.get(i);
            if(temp > max) {
                max = temp;
            }
            if(temp < min) {
                min = temp;
            }
        }
        for(int i = 0; i < arr.size(); i++) {
            temp = arr.get(i);
            if(temp == max) {
                count++;
            }
        }
        return count;
    }

    
    public static int search_Problem_0_d95939fd_3f0f_4136_9696_959123d38d5e(ArrayList<Integer> arr) {
        int result = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (i == 0) {
                if (arr.get(i) != arr.get(i + 1)) {
                    result = arr.get(i);
                    break;
                }
            } else if (i == arr.size() - 1) {
                if (arr.get(i) != arr.get(i - 1)) {
                    result = arr.get(i);
                    break;
                }
            } else {
                if (arr.get(i) != arr.get(i - 1) && arr.get(i) != arr.get(i + 1)) {
                    result = arr.get(i);
                    break;
                }
            }
        }
        return result;
    }

    
    public static int search_Problem_2_17377b8c_dde6_444c_a765_12a6a90beba5(ArrayList<Integer> arr) {
        int result = -1;
        int temp = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == temp) {
                temp = arr.get(i);
                i++;
            }
            else if (arr.get(i) > temp) {
                temp = arr.get(i);
                result = temp;
            }
        }
        return result;
    }

    
    public static int search_Problem_1_fc40d6a2_662b_4afd_99ad_2d0a772c7882(ArrayList<Integer> arr) {
        int count = 0;
        for (int val: arr) {
            if (count == 0) return val;
            if (val == count) count++;
        }
        return -1;
    }

    
    public static int search_Problem_0_a22aefde_cbd3_43cb_a747_92da71df2489(ArrayList<Integer> arr) {
        int result = 0;
        int lastValue = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == lastValue) {
                lastValue++;
            } else {
                lastValue = arr.get(i);
                result = arr.get(i);
            }
        }
        return result;
    }

    
    public static int search_Problem_1_26a22519_5212_4324_9135_2ee2a0328e7b(ArrayList<Integer> arr) {
        int result = 0;
        int count = 1;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == arr.get(i)) {
                count++;
            }
        }
        if(count == 1) {
            result = arr.get(0);
        }
        return result;
    }

    
    public static int search_Problem_0_c7218cdf_2342_460c_a4bd_8a086898fe95(ArrayList<Integer> arr) {
        int count = 1;
        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i) == arr.get(i-1)) {
                count++;
            }
        }
        return count;
    }

    
    public static int search_Problem_1_16d53ba4_2c23_4099_8f36_9b28041b965e(ArrayList<Integer> arr) {
        int res = 0;
        for(int i = 0; i < arr.size(); i++) {
            int curr = arr.get(i);
            for(int j = i + 1; j < arr.size(); j++) {
                if(curr == arr.get(j)) {
                    res++;
                    i = j;
                    break;
                }
            }
        }
        return res;
    }

    
    public static int search_Problem_1_8133cc11_3ae9_4865_a7b6_cad103c09c2b(ArrayList<Integer> arr) {
        int result = -1;
        int count = 1;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == result) {
                count++;
            } else {
                if(count == 1) {
                    result = arr.get(i);
                }
                count = 1;
            }
        }
        return result;
    }

    
    public static int search_Problem_0_f5e1b9fa_9ede_46fa_a129_e77a936bb5b8(ArrayList<Integer> arr) {
        int result = 0;
        int temp = 0;
        for(int i = 0; i < arr.size(); i++) {
            temp = arr.get(i);
            for(int j = i+1; j < arr.size(); j++) {
                if(temp == arr.get(j)) {
                    result = result + 1;
                }
            }
        }
        return result;
    }

    
    public static int search_Problem_1_16031550_19ad_44e0_8141_b11ea35aebbb(ArrayList<Integer> arr) {
        int result = -1;
        int lastValue = -1;
        int count = 0;
        for (int i : arr) {
            if (i == lastValue) {
                count++;
            } else {
                if (count == 1) {
                    result = i;
                }
                lastValue = i;
                count = 1;
            }
        }
        return result;
    }

    
    public static int search_Problem_0_9443a450_adcb_4ef9_adc6_6fb0fd32a50e(ArrayList<Integer> arr) {
        int count= 0;
        int max = 0;
        for(int i = 0; i < arr.size(); i++){
            if(arr.get(i) == max){
                count++;
            }
            else{
                max = arr.get(i);
            }
        }
        return count;
    }

    
    public static int search_Problem_0_c9543b19_f518_4c7f_b88e_10adc22aa362(ArrayList<Integer> arr) {
        int result = 0;
        int temp = 0;
        for(int i = 0; i < arr.size(); i++) {
            temp = arr.get(i);
            for(int j = i + 1; j < arr.size(); j++) {
                if(temp == arr.get(j)) {
                    result = temp;
                    break;
                }
            }
        }
        return result;
    }

    
    public static int search_Problem_2_8442aa00_7a51_4928_8f7b_229404c73b8b(ArrayList<Integer> arr) {
        int result = 0;
        int count = 1;
        for(int i = 1; i < arr.size(); i++) {
            if(arr.get(i) == arr.get(i-1)) {
                count++;
            }
            else {
                if(count == 1) {
                    result = arr.get(i);
                }
                count = 1;
            }
        }
        return result;
    }

    
    public static int search_Problem_2_e3671ba9_cbe2_41db_8555_4e15b4b20b7a(ArrayList<Integer> arr) {
        int flag=0;
        for(int i=0; i<arr.size(); i++){
            if(arr.get(i)==i){
                flag++;
            }
            if(flag==1){
                return i;
            }
        }
        return -1;
    }

    
    public static int search_Problem_2_084ef049_bb1a_4a40_acb1_8b00a6b30a88(ArrayList<Integer> arr) {
        int result = -1;
        int prev = 0;
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            int current = arr.get(i);
            if(current == prev) {
                count++;
            }
            else {
                if(count == 1) {
                    result = current;
                }
                count = 1;
            }
            prev = current;
        }
        return result;
    }

    
    public static int search_Problem_0_9ea5cd6a_864e_4f98_99c7_3c77fbbe1619(ArrayList<Integer> arr) {
        int result = 0;
        int temp = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == temp) {
                temp++;
            } else {
                temp = 1;
                result = arr.get(i);
            }
        }
        return result;
    }

    
    public static int search_Problem_2_eec6392d_18df_4635_8c11_c48940c47e64(ArrayList<Integer> arr) {
        // Write your code here
        int result = 0;
        for(int i=0;i<arr.size();i++){
            if(i==0){
                if(arr.get(i) != arr.get(i+1)){
                    result = arr.get(i);
                    break;
                }
            }
            else if(i==arr.size()-1){
                if(arr.get(i) != arr.get(i-1)){
                    result = arr.get(i);
                    break;
                }
            }
            else{
                if(arr.get(i) != arr.get(i-1) && arr.get(i) != arr.get(i+1)){
                    result = arr.get(i);
                    break;
                }
            }
        }
        return result;
    }

    
    public static int search_Problem_2_9c1d6121_0b79_4f3a_8fbf_7a17c2ae942f(ArrayList<Integer> arr) {
        int result = 0, i= 0;
        for(int j=0;j<arr.size();j++) {
            int count = 0;
            for(int k: arr) {
                if( k == arr.get(j) ) {
                    count++;
                }
            }
            if(count==1) 
                return arr.get(j);
        }
        return -1; // not found
    }

    
    public static int search_Problem_0_c09cf7a4_7a7b_4125_b57e_9bddfec0fa1b(ArrayList<Integer> arr) {
        int result = 0;
        int count = 1;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == arr.get(i)) {
                count++;
            }
        }
        if(count == 1) {
            result = arr.get(0);
        }
        return result;
    }

    
    public static int search_Problem_0_e8a7475c_39b7_4bab_b3e3_b61cba66f573(ArrayList<Integer> arr) {
        int count = 1;
        Integer temp;
        for(int i = 0;i < arr.size(); i++) {
            temp = arr.get(i);
            if(arr.contains(temp)) {
                if(temp != count) {
                    count = 1;
                }
                else {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int search_Problem_2_eb27f75c_23ee_46aa_8812_5add71679697(ArrayList<Integer> arr) {
        int result = -1;
        int count = 1;
        for (int i : arr) {
            if (i == result) {
                count++;
            } else {
                if (count == 1) {
                    result = i;
                } else {
                    count = 1;
                }
            }
        }
        return result;
    }

    
    public static int search_Problem_2_2da6e0a5_4519_4330_bdab_8f885471e419(ArrayList<Integer> arr) {
        int result = -1;
        int count = 1;
        for (int i : arr) {
            if (i == count) {
                result = i;
                break;
            }
            count++;
        }
        return result;
    }

    
    public static int search_Problem_2_a164312c_20f1_4a61_ae9d_bbf0ad4e11e9(ArrayList<Integer> arr) {
        int result = -1;
        int count = 1;
        for (int i : arr) {
            if (i == 1) {
                result = i;
                break;
            }
            count += 1;
        }
        return result;
    }

    
    public static int search_Problem_0_6e45b7f6_e245_4427_a690_915924841ac3(ArrayList<Integer> arr) {
        int lastVal = arr.get(arr.size() - 1);
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == lastVal) {
                count++;
            }
        }
        if (count == 0) {
            return -1;
        }
        return lastVal;
    }

    
    public static int search_Problem_1_df011b4d_34ed_45fe_a5a6_5321d49b920c(ArrayList<Integer> arr) {
        int result = -1;
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == result) {
                count++;
            }
            if(count == 1) {
                result = arr.get(i);
            }
        }
        return result;
    }

    
    public static int search_Problem_2_b1912e0f_bd72_4833_8fb4_e02c4fdb8db0(ArrayList<Integer> arr) {
        int result = 0;
        int count = 1;
        for(int i = 1; i < arr.size(); i++) {
            if(arr.get(i) == arr.get(i-1)) {
                count++;
            }
            else {
                if(count == 1) {
                    result = arr.get(i);
                }
                count = 1;
            }
        }
        return result;
    }

    
    public static int search_Problem_2_9e2dc89f_88ee_4676_9a96_308b6d2f2c67(ArrayList<Integer> arr) {
        int result = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == 1) {
                result = i;
                break;
            }
        }
        return result;
    }

    
    public static int search_Problem_1_51b200c2_da0e_4a7c_938e_b2b05a6b6462(ArrayList<Integer> arr) {
        int result = 0;
        int temp = 0;
        for(int i = 0; i < arr.size(); i++) {
            temp = arr.get(i);
            for(int j = i + 1; j < arr.size(); j++) {
                if(temp == arr.get(j)) {
                    result = result + 1;
                }
            }
        }
        return result;
    }

    
    public static int search_Problem_1_59ff1606_d419_4db7_a54d_a9d8398c1fc0(ArrayList<Integer> arr) {
        int result = 0;
        int count = 1;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == arr.get(i)) {
                count++;
            }
        }
        if(count == 1) {
            result = arr.get(0);
        }
        return result;
    }

    
    public static int search_Problem_2_b7b94803_80d8_4106_91a0_d1d6016c909d(ArrayList<Integer> arr) {
        int result = 0;
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == arr.get(i)) {
                count++;
            }
        }
        if(count == 1) {
            result = arr.get(0);
        }
        return result;
    }

    
    public static int search_Problem_1_ebf510a9_02f0_456d_a9e4_e6061ad457f0(ArrayList<Integer> arr) {
        int count = 1;
        int result = -1;
        for(int i = 1; i < arr.size(); i++) {
            if(arr.get(i) == arr.get(i-1)) {
                count++;
            } else {
                if(count == 1) {
                    result = arr.get(i);
                }
                count = 1;
            }
        }
        return result;
    }

    
    public static int search_Problem_0_fabd4c05_871a_450b_a559_853531d9e9ab(ArrayList<Integer> arr) {
        int result = -1;
        int count = 1;
        for (int i : arr) {
            if (i == result) {
                count++;
            } else {
                if (count == 1) {
                    result = i;
                }
                count = 1;
            }
        }
        return result;
    }

    
    public static int search_Problem_1_b3e0e09c_6e3c_465d_9e21_81ff32bc06f8(ArrayList<Integer> arr) {
        int result = -1;
        int lastValue = -1;
        int currentValue = -1;
        int count = 0;
        for(int i : arr) {
            currentValue = i;
            count++;
            if(currentValue != lastValue) {
                lastValue = currentValue;
                result = currentValue;
            }
        }
        return result;
    }

    
    public static int search_Problem_0_1c2e85ad_86e6_4bc9_a46f_ce266751887b(ArrayList<Integer> arr) {
        int result = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            if (arr.get(i) == arr.get(i + 1)) {
                result++;
            }
        }
        return result;
    }

    
    public static int search_Problem_2_e9faf69e_36cb_4ea7_9643_092f201c98f3(ArrayList<Integer> arr) {
        int result = -1;
        int temp = 0;
        for(int i = 0; i < arr.size(); i++) {
            temp = arr.get(i);
            for(int j = i + 1; j < arr.size(); j++) {
                if(temp == arr.get(j)) {
                    result = temp;
                    break;
                }
            }
        }
        return result;
    }

    
    public static int search_Problem_0_578a1fca_754f_4faa_860d_e1b7cdd06886(ArrayList<Integer> arr) {
        int result = 0;
        int temp = 0;
        for(int i = 0; i < arr.size(); i++) {
            temp = arr.get(i);
            for(int j = i + 1; j < arr.size(); j++) {
                if(temp == arr.get(j)) {
                    result = temp;
                    break;
                }
            }
        }
        return result;
    }

    
    public static int search_Problem_2_97056423_8347_41cf_82a1_41f4a24da717(ArrayList<Integer> arr) {
        int result = 0;
        int temp = 0;
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == temp) {
                count++;
            }
            else {
                if(count == 1) {
                    result = arr.get(i);
                }
                count = 0;
                temp = arr.get(i);
            }
        }
        return result;
    }

    
    public static int search_Problem_0_40b50689_17d3_4ba8_9f22_93a4e239d089(ArrayList<Integer> arr) {
        int result = -1;
        int count = 0;
        for (int i : arr) {
            if (i == 1) {
                count++;
                if (count == 1) {
                    result = i;
                    break;
                }
            }
        }
        return result;
    }

    
    public static int search_Problem_0_8133cc11_3ae9_4865_a7b6_cad103c09c2b(ArrayList<Integer> arr) {
        int result = -1;
        int count = 1;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == result) {
                count++;
            } else {
                if(count == 1) {
                    result = arr.get(i);
                }
                count = 1;
            }
        }
        return result;
    }

    
    public static int search_Problem_0_2052b806_d38f_4156_8dca_feceacd8780c(ArrayList<Integer> arr) {
        int result = arr.get(0);
        int prev = -9999999;
        for(int i : arr) {
            if( i != prev) {
                result = i;
                prev = i;
            }
        }
        return result;
    }

    
    public static int search_Problem_1_b7b94803_80d8_4106_91a0_d1d6016c909d(ArrayList<Integer> arr) {
        int result = 0;
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == arr.get(i)) {
                count++;
            }
        }
        if(count == 1) {
            result = arr.get(0);
        }
        return result;
    }

    
    public static int search_Problem_2_9d35ab77_2890_4581_8d91_20e829b6d324(ArrayList<Integer> arr) {
        int result = 0;
        int count = 1;
        for(int i = 1; i < arr.size(); i++) {
            if(arr.get(i) == arr.get(i-1)) {
                count++;
            }
            else {
                if(count == 1) {
                    result = arr.get(i);
                }
                count = 1;
            }
        }
        return result;
    }

    
    public static int search_Problem_0_41cd25a7_6b26_4fda_b2e8_389019d1a5bb(ArrayList<Integer> arr) {
        int count = 0;
        int lastValue = arr.get(0);
        for(int i : arr) {
            if(i == lastValue) {
                count++;
            } else {
                count = 0;
            }
            lastValue = i;
        }
        return count;
    }

    
    public static int search_Problem_0_3a9c3697_36d6_4146_86bb_070fc881752d(ArrayList<Integer> arr) {
        int l = arr.size() - 1;
        int m = arr.get(0);
        int s = Integer.MAX_VALUE;
        for (int i = 1; ; i++) {
            if (arr.get(i) <= m) {
                int temp = m;
                m = arr.get(i);
                s = Math.min(s, temp);
            } else {
                break;
            }
        }
        int max = 0;
        for (int i = 0; i < l; i++) {
            if (arr.get(i) == s) {
                max = Math.max(max, m - arr.get(i));
            }
        }
        return max;
    }

    
    public static int search_Problem_2_a3fe5174_b539_4df1_8e42_ecd39aead917(ArrayList<Integer> arr) {
        int result = 0;
        int temp = 0;
        for(int i = 0; i < arr.size(); i++) {
            temp = arr.get(i);
            for(int j = i + 1; j < arr.size(); j++) {
                if(temp == arr.get(j)) {
                    result = result + 1;
                    break;
                }
            }
        }
        return result;
    }

    
    public static int search_Problem_0_e9805995_8d48_466d_9736_6e0d87668285(ArrayList<Integer> arr) {
        int result = -1;
        int count = 0;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == result) {
                count++;
            }
            if(count == 1) {
                result = arr.get(i);
            }
        }
        return result;
    }

    
    public static int search_Problem_1_894886b4_5701_41ee_9dd7_b9e3783248c2(ArrayList<Integer> arr) {
        int count = 0;
        int temp;
        for(int i = 0; i < arr.size(); i++) {
            temp = arr.get(i);
            for(int j = i + 1; j < arr.size(); j++) {
                if(temp == arr.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    
    public static int search_Problem_1_f5e1b9fa_9ede_46fa_a129_e77a936bb5b8(ArrayList<Integer> arr) {
        int result = 0;
        int temp = 0;
        for(int i = 0; i < arr.size(); i++) {
            temp = arr.get(i);
            for(int j = i+1; j < arr.size(); j++) {
                if(temp == arr.get(j)) {
                    result = result + 1;
                }
            }
        }
        return result;
    }

    
    public static int search_Problem_1_4f41425e_9d58_4b86_837a_2d164b9818a2(ArrayList<Integer> arr) {
        int count = 0L;
        int minElem = arr.get(0);
        for (Integer i : arr) {
            if (i != minElem)
                return -1;
            if (i == minElem)
                count++;
            minElem = i;
        }
        return count;
    }

    
    public static int search_Problem_2_9472846c_610c_4f65_8903_59bd6571745a(ArrayList<Integer> arr) {
        int count = 1;
        int max = 0;
        for(int i = 1; i < arr.size(); i++) {
            if(arr.get(i) == arr.get(i-1)) {
                count++;
            }
            else {
                if(count > max) {
                    max = count;
                }
                count = 1;
            }
        }
        return max;
    }

    
    public static int search_Problem_0_330cbef2_6375_4644_979f_1efe0ef487e2(ArrayList<Integer> arr) {
        int result = -1;
        int count = 0;
        for (int i : arr) {
            if (i == result) {
                count++;
            } else {
                if (count == 1) {
                    result = i;
                }
                count = 0;
            }
        }
        return result;
    }

    
    public static int search_Problem_0_a0b899ef_4b01_49d0_a32a_01c177e45a06(ArrayList<Integer> arr) {
        int result = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i) != result) {
                return result;
            }
        }
        return -1;
    }

    
    public static int search_Problem_1_e1a7fe11_17fb_4acc_b796_86463b791617(ArrayList<Integer> arr) {
        int result = -1;
        int prev = 0;
        for(int i = 1; i < arr.size(); i++) {
            if(arr.get(i) == prev) {
                prev = arr.get(i);
            } else {
                result = arr.get(i);
                prev = arr.get(i);
            }
        }
        return result;
    }

    
    public static int search_Problem_0_8442aa00_7a51_4928_8f7b_229404c73b8b(ArrayList<Integer> arr) {
        int result = 0;
        int count = 1;
        for(int i = 1; i < arr.size(); i++) {
            if(arr.get(i) == arr.get(i-1)) {
                count++;
            }
            else {
                if(count == 1) {
                    result = arr.get(i);
                }
                count = 1;
            }
        }
        return result;
    }

}
