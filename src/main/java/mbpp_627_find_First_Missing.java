package mbpp_627_find_First_Missing;

public class mbpp_627_find_First_Missing {

    
    public static int findFirstMissing_Problem_1_b510c663_7a1a_43aa_8a27_738dc237637c(ArrayList<Integer> array) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) < min) {
                min = array.get(i);
            }
        }
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) != min) {
                return min - array.get(i);
            }
        }
        return min;
    }

    
    public static int findFirstMissing_Problem_1_5f25427f_d20c_4ebc_9654_9b8f8cfc611d(ArrayList<Integer> array) {
        int n = array.size();
        int low = 0;
        int high = n - 1;
        int mid = 0;
        while (low <= high) {
            mid = (low + high) / 2;
            if (array.get(mid) != mid + 1 && array.get(mid - 1) == mid) {
                return mid + 1;
            }
            if (array.get(mid) != mid + 1) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return mid + 1;
    }

    
    public static int findFirstMissing_Problem_1_3a32be4f_b81e_4c51_9de0_90b4d15d8dd7(ArrayList<Integer> array) {
        int min = array.get(0);
        int max = array.get(array.size() - 1);
        int sum = array.stream().reduce(0L, (a, b) -> a + b);
        int expectedSum = (min + max) * (max - min + 1) / 2;
        return expectedSum - sum;
    }

    
    public static int findFirstMissing_Problem_1_fdb0ce2c_b1b4_44e4_af56_a79cc04ccf60(ArrayList<Integer> array) {
        int max = array.get(array.size() - 1);
        int min = array.get(0);
        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        int expectedSum = (max * (max + 1)) / 2;
        if (expectedSum == sum) {
            return max + 1;
        }
        return expectedSum - sum;
    }

    
    public static int findFirstMissing_Problem_0_d36930e6_6435_4b8f_b1f2_6fd8fc8ea891(ArrayList<Integer> array) {
        int firstMissing = 0;
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) != i) {
                firstMissing = i;
                break;
            }
        }
        return firstMissing;
    }

    
    public static int findFirstMissing_Problem_2_a1e07eb3_ae23_48f4_9fda_39378933ed4f(ArrayList<Integer> array) {
        int min = array.get(0);
        int max = array.get(array.size() - 1);
        int sum = 0;
        for (int i = 0; i < array.size(); i++) {
            sum += array.get(i);
        }
        int expectedSum = (min + max) * (max - min + 1) / 2;
        return expectedSum - sum;
    }

    
    public static int findFirstMissing_Problem_0_53e6b1e5_2eae_4fa1_81ef_e6db2ec10aad(ArrayList<Integer> array) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i : array) {
            if(i > max) {
                max = i;
            }
            if(i < min) {
                min = i;
            }
        }
        int missing = max + 1;
        for(int i = min; i <= max; i++) {
            if(!array.contains(i)) {
                missing = i;
                break;
            }
        }
        return missing;
    }

    
    public static int findFirstMissing_Problem_0_8c7cbcc1_8f21_4750_bacf_858819010c8e(ArrayList<Integer> array) {
        int min = array.get(0);
        int max = array.get(array.size() - 1);
        int missing = 0;
        for (int i = min; i <= max; i++) {
            if (!array.contains(i)) {
                missing = i;
                break;
            }
        }
        return missing;
    }

    
    public static int findFirstMissing_Problem_0_8ddd506e_e32f_4083_9ac3_d4e2627f9029(ArrayList<Integer> array) {
        int low = 0;
        int high = array.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (array.get( mid) != mid && array.get( mid - 1) == mid - 1) {
                return mid;
            } else if (array.get( mid) == mid) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstMissing_Problem_1_8c7cbcc1_8f21_4750_bacf_858819010c8e(ArrayList<Integer> array) {
        int min = array.get(0);
        int max = array.get(array.size() - 1);
        int missing = 0;
        for (int i = min; i <= max; i++) {
            if (!array.contains(i)) {
                missing = i;
                break;
            }
        }
        return missing;
    }

    
    public static int findFirstMissing_Problem_2_2c970e1a_96b9_448e_9963_eca2058e3d08(ArrayList<Integer> array) {
        int first = array.get(0);
        int last = array.get(array.size() - 1);
        int sum = 0;
        for (int i = first; i <= last; i++) {
            sum += i;
        }
        int actualSum = 0;
        for (int i : array) {
            actualSum += i;
        }
        return sum - actualSum;
    }

    
    public static int findFirstMissing_Problem_2_cb6fa25a_5713_4c3b_b60f_ab733857aa5a(ArrayList<Integer> array) {
        int firstMissing = 1;
        for (int i : array) {
            if (i == firstMissing) {
                firstMissing++;
            }
        }
        return firstMissing;
    }

    
    public static int findFirstMissing_Problem_1_7097cb9c_e6a0_4dfb_888b_2d20894c4c73(ArrayList<Integer> array) {
        int firstMissing = 0;
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) != i) {
                firstMissing = i;
                break;
            }
        }
        return firstMissing;
    }

    
    public static int findFirstMissing_Problem_2_eaae8ad2_17d4_4406_83fa_082ec8b593d3(ArrayList<Integer> array) {
        int i = 0;
        for (int j : array) {
            if (j != i) {
                return i;
            }
            i++;
        }
        return i;
    }

    
    public static int findFirstMissing_Problem_0_ce935072_bc62_43f2_a979_5f632fd013a6(ArrayList<Integer> array) {
        int first = array.get(0);
        int last = array.get(array.size() - 1);
        int missing = 0;
        for (int i = first; i <= last; i++) {
            if (!array.contains(i)) {
                missing = i;
                break;
            }
        }
        return missing;
    }

    
    public static int findFirstMissing_Problem_0_08dd5b5f_7a4f_431e_ac7b_3f31c4d475ff(ArrayList<Integer> array) {
        // Write your code here
        int max = array.stream().max(Integer::compareTo).get();
        int min = array.stream().min(Integer::compareTo).get();
        int sum = array.stream().mapToInteger(Integer::intValue).sum();
        int sumOfN = (max * (max + 1)) / 2;
        if (sumOfN == sum) {
            return max + 1;
        }
        return sumOfN - sum;
    }

    
    public static int findFirstMissing_Problem_0_da2df285_3bca_4a9b_9cee_fcf63301c0cf(ArrayList<Integer> array) {
        int i = 0;
        for (int num : array) {
            if (num != i) {
                return i;
            }
            i++;
        }
        return i;
    }

    
    public static int findFirstMissing_Problem_2_17fc6d58_4e02_4c96_bfed_c1f00f473d23(ArrayList<Integer> array) {
        int firstMissing = 0;
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) != i) {
                firstMissing = i;
                break;
            }
        }
        return firstMissing;
    }

    
    public static int findFirstMissing_Problem_2_d36930e6_6435_4b8f_b1f2_6fd8fc8ea891(ArrayList<Integer> array) {
        int firstMissing = 0;
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) != i) {
                firstMissing = i;
                break;
            }
        }
        return firstMissing;
    }

    
    public static int findFirstMissing_Problem_2_05fff9ed_9241_4897_95ee_87c088dcf14a(ArrayList<Integer> array) {
        int last = array.get(array.size() - 1);
        for (int i = 0; i < last; i++) {
            if (!array.contains(i)) {
                return i;
            }
        }
        return last + 1;
    }

    
    public static int findFirstMissing_Problem_2_088ba0ec_bb72_400c_85d7_0ed5b2b8d490(ArrayList<Integer> array) {
        int first = array.get(0);
        int last = array.get(array.size() - 1);
        int mid = (first + last) / 2;
        int midIndex = (first + last) / 2;
        if (first == last) {
            return first + 1;
        }
        if (array.get( midIndex) == mid) {
            return findFirstMissing_Problem_2_088ba0ec_bb72_400c_85d7_0ed5b2b8d490(new ArrayList<Integer>(array.subList( midIndex, array.size())));
        } else {
            return findFirstMissing_Problem_2_088ba0ec_bb72_400c_85d7_0ed5b2b8d490(new ArrayList<Integer>(array.subList(0,  midIndex)));
        }
    }

    
    public static int findFirstMissing_Problem_1_ae84d8c6_f95f_4772_980c_c18670a1be77(ArrayList<Integer> array) {
        int current = 1;
        for (int i : array) {
            if (i == current) {
                current++;
            } else {
                return current;
            }
        }
        return current;
    }

    
    public static int findFirstMissing_Problem_0_dd938762_f8cd_4bd4_83ab_7410f2d5d2aa(ArrayList<Integer> array) {
        int first = array.get(0);
        int last = array.get(array.size() - 1);
        int diff = last - first;
        int missing = 0;
        if (diff == array.size() - 1) {
            return last + 1;
        }
        for (int i = 0; i < array.size() - 1; i++) {
            if (array.get(i + 1) - array.get(i) > 1) {
                missing = array.get(i) + 1;
                break;
            }
        }
        return missing;
    }

    
    public static int findFirstMissing_Problem_0_5cf22ab0_7820_4968_a227_28451a8e8c99(ArrayList<Integer> array) {
        int first = array.get(0);
        int last = array.get(array.size() - 1);
        int missing = -1;
        for (int i = first; i <= last; i++) {
            if (!array.contains(i)) {
                missing = i;
                break;
            }
        }
        return missing;
    }

    
    public static int findFirstMissing_Problem_2_5e5e746d_d6ba_49f5_8da2_7999998b545a(ArrayList<Integer> array) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i : array) {
            if (i > max) {
                max = i;
            }
            if (i < min) {
                min = i;
            }
        }
        int result = min + 1;
        for (int i = min + 1; i <= max; i++) {
            if (array.contains(i)) {
                continue;
            }
            result = i;
            break;
        }
        return result;
    }

    
    public static int findFirstMissing_Problem_2_7f1ee345_2ccd_4da8_b930_8b7704dd0bde(ArrayList<Integer> array) {
        int first = array.get(0);
        int last = array.get(array.size() - 1);
        int expected = first;
        for (int i = first; i <= last; i++) {
            if (array.contains(i)) {
                expected = i + 1;
            } else {
                return expected;
            }
        }
        return expected;
    }

    
    public static int findFirstMissing_Problem_0_77c305c7_d72a_40eb_ad9d_e46cb5611aa2(ArrayList<Integer> array) {
        int first = array.get(0);
        int last = array.get(array.size() - 1);
        int expected = first;
        for (int i = first; i <= last; i++) {
            if (i != expected) {
                return expected;
            }
            expected++;
        }
        return expected;
    }

    
    public static int findFirstMissing_Problem_0_21233f26_8449_46f4_b640_645f0526d9f5(ArrayList<Integer> array) {
        int max = array.get(array.size() - 1);
        int min = array.get(0);
        int sum = 0;
        for (int i = 0; i < array.size(); i++) {
            sum += array.get(i);
        }
        int expectedSum = (max * (max + 1)) / 2;
        if (expectedSum == sum) {
            return max + 1;
        }
        return expectedSum - sum;
    }

    
    public static int findFirstMissing_Problem_1_be17ab68_5e35_4566_b346_ac689e473dca(ArrayList<Integer> array) {
        int firstMissing = 0;
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) != i + 1) {
                firstMissing = i + 1;
                break;
            }
        }
        return firstMissing;
    }

    
    public static int findFirstMissing_Problem_2_edd9cc9b_a172_4ca6_a8a4_f47578ac1185(ArrayList<Integer> array) {
        int firstMissing = 0;
        for(int i = 0; i < array.size(); i++)
        {
            if (array.get(i) == 0)
            {
                firstMissing = i;
                break;
            }
        }
        return firstMissing;
    }

    
    public static int findFirstMissing_Problem_2_4fabbd6e_c950_448f_8724_9f8524a450a9(ArrayList<Integer> array) {
        int first = array.get(0);
        int last = array.get(array.size() - 1);
        int mid = (first + last) / 2;
        while (first <= mid && mid < last) {
            if (array.contains(mid)) {
                mid++;
            } else {
                return mid;
            }
        }
        return mid;
    }

    
    public static int findFirstMissing_Problem_2_bf1b6aa1_1776_4a51_8dfd_61eeb3c5dd07(ArrayList<Integer> array) {
        // Write your code here
        int result = 0;
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) != i + 1) {
                result = i + 1;
                break;
            }
        }
        return result;
    }

    
    public static int findFirstMissing_Problem_1_6cdd483e_b331_4703_8723_c9777b8666ea(ArrayList<Integer> array) {
        int first = array.get(0);
        int last = array.get(array.size() - 1);
        int mid = 0;
        while (first <= last) {
            mid = (first + last) / 2;
            if (array.get( mid) == mid) {
                first = mid + 1;
            } else {
                last = mid - 1;
            }
        }
        return first;
    }

    
    public static int findFirstMissing_Problem_2_de6927ec_dd95_46b0_a8ad_4448131521d3(ArrayList<Integer> array) {
        int i = 0;
        for (int x : array) {
            if (x != i) {
                return i;
            }
            i++;
        }
        return i;
    }

    
    public static int findFirstMissing_Problem_0_a2fc60e9_3d5b_43fa_a198_7245d98446ff(ArrayList<Integer> array) {
        // Write your code here
        int min = array.get(0);
        int max = array.get(array.size() - 1);
        int sum = 0;
        for (int i = 0; i < array.size(); i++) {
            sum += array.get(i);
        }
        int sum2 = 0;
        for (int i = min; i <= max; i++) {
            sum2 += i;
        }
        return sum2 - sum;
    }

    
    public static int findFirstMissing_Problem_2_08d9887d_2cbe_42d6_b690_592691216588(ArrayList<Integer> array) {
        int i = 0;
        for (int num : array) {
            if (num != i) {
                return i;
            }
            i++;
        }
        return i;
    }

    
    public static int findFirstMissing_Problem_2_3d727610_8450_4406_977b_b5f7cf8366cc(ArrayList<Integer> array) {
        int min = array.get(0);
        int max = array.get(array.size() - 1);
        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        int expectedSum = (min + max) * (max - min + 1) / 2;
        return expectedSum - sum;
    }

    
    public static int findFirstMissing_Problem_1_b5dac986_b1b4_49e4_a30b_9089a72e7be5(ArrayList<Integer> array) {
        int min = array.get(0);
        int max = array.get(array.size() - 1);
        int sum = 0;
        for (int i = min; i <= max; i++) {
            sum += i;
        }
        int actualSum = 0;
        for (int i : array) {
            actualSum += i;
        }
        return sum - actualSum;
    }

    
    public static int findFirstMissing_Problem_2_7b34522b_09f8_4c69_ac3a_53fbf3051d20(ArrayList<Integer> array) {
        int firstMissing = 0;
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) != i) {
                firstMissing = i;
                break;
            }
        }
        return firstMissing;
    }

    
    public static int findFirstMissing_Problem_0_c35c9c0e_12c1_46c5_8ecf_239d64f1b782(ArrayList<Integer> array) {
        int first = array.get(0);
        int last = array.get(array.size() - 1);
        int mid = (first + last) / 2;
        int midIndex = array.indexOf(mid);
        if (midIndex == -1) {
            if (mid == first) {
                return mid + 1;
            } else {
                return mid;
            }
        } else {
            if (midIndex == 0) {
                return mid + 1;
            } else {
                ArrayList<Integer> left = new ArrayList<Integer>();
                for (int i = 0; i < midIndex; i++) {
                    left.add(array.get(i));
                }
                return findFirstMissing_Problem_0_c35c9c0e_12c1_46c5_8ecf_239d64f1b782(left);
            }
        }
    }

    
    public static int findFirstMissing_Problem_2_ae84d8c6_f95f_4772_980c_c18670a1be77(ArrayList<Integer> array) {
        int current = 1;
        for (int i : array) {
            if (i == current) {
                current++;
            } else {
                return current;
            }
        }
        return current;
    }

    
    public static int findFirstMissing_Problem_1_2a9b9a78_3cdc_4723_b7d5_5aaae398792f(ArrayList<Integer> array) {
        int max = array.get(array.size() - 1);
        int min = array.get(0);
        int sum = 0;
        for (int i = 0; i < array.size(); i++) {
            sum += array.get(i);
        }
        int expectedSum = (max * (max + 1)) / 2;
        if (expectedSum == sum) {
            return max + 1;
        }
        int diff = expectedSum - sum;
        return min - diff;
    }

    
    public static int findFirstMissing_Problem_1_e1235515_5037_4a44_a353_a58477b26048(ArrayList<Integer> array) {
        int firstMissing = -1;
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) != i + 1) {
                firstMissing = i + 1;
                break;
            }
        }
        return firstMissing;
    }

    
    public static int findFirstMissing_Problem_0_21a004f9_3e6c_42f9_84c9_6da6625f2560(ArrayList<Integer> array) {
        int n = array.size();
        int sum = (n * (n + 1)) / 2;
        int total = 0;
        for (int i = 0; i < n; i++) {
            total += array.get(i);
        }
        return sum - total;
    }

    
    public static int findFirstMissing_Problem_2_bcf2a0d6_6847_443e_b70c_9c41c94d2627(ArrayList<Integer> array) {
        int current = 1;
        for (int i : array) {
            if (i == current) {
                current++;
            }
        }
        return current;
    }

    
    public static int findFirstMissing_Problem_1_ad8ae82c_2c4c_414e_874a_132f7574684d(ArrayList<Integer> array) {
        int last = array.get(array.size() - 1);
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) != i) {
                return i;
            }
        }
        return last + 1;
    }

    
    public static int findFirstMissing_Problem_0_7627f116_3013_4647_8513_4016f99a5eb3(ArrayList<Integer> array) {
        int i = 0;
        for (int j : array) {
            if (j != i) {
                return i;
            }
            i++;
        }
        return i;
    }

    
    public static int findFirstMissing_Problem_2_a85946dc_7aa9_41e5_b1bf_45d982034946(ArrayList<Integer> array) {
        int first = array.get(0);
        int last = array.get(array.size() - 1);
        int expected = first;
        for (int i = first; i <= last; i++) {
            if (array.contains(expected)) {
                expected++;
            } else {
                return expected;
            }
        }
        return expected;
    }

    
    public static int findFirstMissing_Problem_1_3b03e96d_b5c7_4950_9621_8ee2d2d7563a(ArrayList<Integer> array) {
        int min = array.get(0);
        int max = array.get(array.size() - 1);
        int sum = 0;
        for (int i = min; i <= max; i++) {
            sum += i;
        }
        int actualSum = 0;
        for (int i : array) {
            actualSum += i;
        }
        return sum - actualSum;
    }

    
    public static int findFirstMissing_Problem_0_9236a89d_b099_479e_a972_2c5e5ff3c890(ArrayList<Integer> array) {
        int firstMissing = 0;
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) != i + 1) {
                firstMissing = i + 1;
                break;
            }
        }
        return firstMissing;
    }

    
    public static int findFirstMissing_Problem_1_f7979f6a_3fd9_40ba_8ae9_4a8765f2d4b1(ArrayList<Integer> array) {
        int n = array.size();
        int low = 0;
        int high = n - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (array.get(mid) != mid && array.get(mid - 1) == mid - 1) {
                return mid;
            } else if (array.get(mid) == mid) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstMissing_Problem_2_c35c9c0e_12c1_46c5_8ecf_239d64f1b782(ArrayList<Integer> array) {
        int first = array.get(0);
        int last = array.get(array.size() - 1);
        int mid = (first + last) / 2;
        int midIndex = array.indexOf(mid);
        if (midIndex == -1) {
            if (mid == first) {
                return mid + 1;
            } else {
                return mid;
            }
        } else {
            if (midIndex == 0) {
                return mid + 1;
            } else {
                ArrayList<Integer> left = new ArrayList<Integer>();
                for (int i = 0; i < midIndex; i++) {
                    left.add(array.get(i));
                }
                return findFirstMissing_Problem_2_c35c9c0e_12c1_46c5_8ecf_239d64f1b782(left);
            }
        }
    }

    
    public static int findFirstMissing_Problem_0_c03a94da_938d_44d0_b54c_6ffc1764bca7(ArrayList<Integer> array) {
        int max = array.get(array.size() - 1);
        int min = array.get(0);
        int sum = 0;
        for (int i = min; i <= max; i++) {
            sum += i;
        }
        int actualSum = 0;
        for (int i = 0; i < array.size(); i++) {
            actualSum += array.get( i);
        }
        return sum - actualSum;
    }

    
    public static int findFirstMissing_Problem_0_a3728ff4_9eff_4312_a24a_bcaa96e5f0f7(ArrayList<Integer> array) {
        int i = 0;
        for (int l : array) {
            if (l != i) {
                return i;
            }
            i++;
        }
        return i;
    }

    
    public static int findFirstMissing_Problem_0_01469752_efe4_4e1c_90d2_74c63fcf6095(ArrayList<Integer> array) {
        int first = array.get(0);
        int last = array.get(array.size() - 1);
        int missing = first + 1;
        while (missing <= last) {
            if (array.contains(missing)) {
                missing++;
            } else {
                return missing;
            }
        }
        return missing;
    }

    
    public static int findFirstMissing_Problem_2_b4c6b3b0_2a50_4c01_bd42_7c4049ea5f9d(ArrayList<Integer> array) {
        int firstMissing = 0;
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) != i + 1) {
                firstMissing = i + 1;
                break;
            }
        }
        return firstMissing;
    }

    
    public static int findFirstMissing_Problem_0_ec42a962_7405_4b3c_8f86_fbd29e9c870c(ArrayList<Integer> array) {
        int firstMissing = 1;
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) == firstMissing) {
                firstMissing++;
            }
        }
        return firstMissing;
    }

    
    public static int findFirstMissing_Problem_2_ba932310_5619_4359_860d_64509b7d86f4(ArrayList<Integer> array) {
        // Write your code here
        int result = 0;
        int prev = array.get(0);
        for (int i = 1; i < array.size(); i++) {
            if (array.get(i) - prev > 1) {
                result = prev + 1;
                break;
            }
            prev = array.get(i);
        }
        return result;
    }

    
    public static int findFirstMissing_Problem_2_037ea5b4_2c99_4d2e_b69b_b3e871202f7b(ArrayList<Integer> array) {
        int first = array.get(0);
        int last = array.get(array.size() - 1);
        int mid = 0;
        while (first <= last) {
            mid = (first + last) / 2;
            if (array.get( mid) != mid) {
                if (mid == 0 || array.get( mid - 1) == mid - 1) {
                    return mid;
                }
                last = mid - 1;
            } else {
                first = mid + 1;
            }
        }
        return -1;
    }

    
    public static int findFirstMissing_Problem_1_de6927ec_dd95_46b0_a8ad_4448131521d3(ArrayList<Integer> array) {
        int i = 0;
        for (int x : array) {
            if (x != i) {
                return i;
            }
            i++;
        }
        return i;
    }

    
    public static int findFirstMissing_Problem_1_e02cd845_853d_4f98_88dc_0c26dcf0f054(ArrayList<Integer> array) {
        int max = array.get(array.size() - 1);
        int min = array.get(0);
        int range = max - min + 1;
        int[] count = new int[ range];
        for (int i = 0; i < array.size(); i++) {
            count[ (array.get( i) - min)]++;
        }
        for (int i = 0; i < count.length; i++) {
            if (count[ i] == 0) {
                return i + min;
            }
        }
        return max + 1;
    }

    
    public static int findFirstMissing_Problem_2_23580f12_2d57_4411_94c1_c0ad188c2175(ArrayList<Integer> array) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (Integer i : array) {
            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }
        }
        int result = max + 1;
        for (Integer i : array) {
            if (i < result) {
                result = i;
            }
        }
        return result;
    }

    
    public static int findFirstMissing_Problem_1_afdc4cce_339f_44d9_a695_021a2c0da9a5(ArrayList<Integer> array) {
        int low = 0;
        int high = array.size() - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (array.get(mid) != mid) {
                if (mid == 0 || array.get((mid - 1)) == mid - 1) {
                    return mid;
                }
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        if (low == array.size()) {
            return array.size();
        }
        return -1;
    }

    
    public static int findFirstMissing_Problem_0_2efd3608_c46a_477f_9c27_a6539907ba0c(ArrayList<Integer> array) {
        int n = array.size();
        int low = 0;
        int high = n - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (array.get(mid) != mid + 1 && array.get(mid - 1) == mid) {
                return mid + 1;
            } else if (array.get(mid) != mid + 1) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    
    public static int findFirstMissing_Problem_2_10bf45a1_3dfc_4ccd_ad2d_d1038cf4cd65(ArrayList<Integer> array) {
        int i = 0;
        for (int l : array) {
            if (l != i) {
                return i;
            }
            i++;
        }
        return i;
    }

    
    public static int findFirstMissing_Problem_0_05fff9ed_9241_4897_95ee_87c088dcf14a(ArrayList<Integer> array) {
        int last = array.get(array.size() - 1);
        for (int i = 0; i < last; i++) {
            if (!array.contains(i)) {
                return i;
            }
        }
        return last + 1;
    }

    
    public static int findFirstMissing_Problem_1_696e4b8e_1e4a_4a43_b34a_92c15460e5c4(ArrayList<Integer> array) {
        int first = array.get(0);
        int last = array.get(array.size() - 1);
        int missing = 0;
        for (int i = first; i <= last; i++) {
            if (!array.contains(i)) {
                missing = i;
                break;
            }
        }
        return missing;
    }

    
    public static int findFirstMissing_Problem_2_08dd5b5f_7a4f_431e_ac7b_3f31c4d475ff(ArrayList<Integer> array) {
        // Write your code here
        int max = array.stream().max(Integer::compareTo).get();
        int min = array.stream().min(Integer::compareTo).get();
        int sum = array.stream().mapToInteger(Integer::intValue).sum();
        int sumOfN = (max * (max + 1)) / 2;
        if (sumOfN == sum) {
            return max + 1;
        }
        return sumOfN - sum;
    }

    
    public static int findFirstMissing_Problem_1_464bb5ec_9629_4cfd_8708_123af9c6e95c(ArrayList<Integer> array) {
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) != i + 1) {
                return i + 1;
            }
        }
        return array.size() + 1;
    }

    
    public static int findFirstMissing_Problem_1_bf24b236_95e4_4a4b_b73e_03fa78f5b806(ArrayList<Integer> array) {
        int first = array.get(0);
        int last = array.get(array.size() - 1);
        int missing = -1;
        for (int i = first; i <= last; i++) {
            if (!array.contains(i)) {
                missing = i;
                break;
            }
        }
        return missing;
    }

    
    public static int findFirstMissing_Problem_1_b389cc35_7843_40c4_aa6d_50df35b83e6a(ArrayList<Integer> array) {
        int firstMissing = 1;
        for (int i : array) {
            if (i == firstMissing) {
                firstMissing++;
            }
        }
        return firstMissing;
    }

    
    public static int findFirstMissing_Problem_0_ec026742_a681_4222_baa9_7baf70e5df29(ArrayList<Integer> array) {
        int min = array.get(0);
        int max = array.get(array.size() - 1);
        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        int expectedSum = (min + max) * (max - min + 1) / 2;
        return expectedSum - sum;
    }

    
    public static int findFirstMissing_Problem_0_410fdce5_9a98_4365_a0ee_ad9691dc9e4c(ArrayList<Integer> array) {
        int min = array.get(0);
        int max = array.get(array.size() - 1);
        int sum = array.stream().reduce(0L, (a, b) -> a + b);
        int expectedSum = (min + max) * (max - min + 1) / 2;
        return expectedSum - sum;
    }

    
    public static int findFirstMissing_Problem_0_e5b17b3c_bcf8_45e2_95ac_8c51fc94b495(ArrayList<Integer> array) {
        int first = array.get(0);
        int last = array.get(array.size() - 1);
        int mid = (first + last) / 2;
        if (first == last) {
            return first + 1;
        }
        if (array.contains(mid)) {
            return findFirstMissing_Problem_0_e5b17b3c_bcf8_45e2_95ac_8c51fc94b495(new ArrayList<Integer>(array.subList(array.indexOf(mid) + 1, array.size())));
        } else {
            return findFirstMissing_Problem_0_e5b17b3c_bcf8_45e2_95ac_8c51fc94b495(new ArrayList<Integer>(array.subList(0, array.indexOf(mid))));
        }
    }

    
    public static int findFirstMissing_Problem_0_26d6b73d_6bec_4522_bfcc_bad07b02bad1(ArrayList<Integer> array) {
        int i = 0;
        for (int item : array) {
            if (item != i) {
                return i;
            }
            i++;
        }
        return i;
    }

    
    public static int findFirstMissing_Problem_2_696e4b8e_1e4a_4a43_b34a_92c15460e5c4(ArrayList<Integer> array) {
        int first = array.get(0);
        int last = array.get(array.size() - 1);
        int missing = 0;
        for (int i = first; i <= last; i++) {
            if (!array.contains(i)) {
                missing = i;
                break;
            }
        }
        return missing;
    }

    
    public static int findFirstMissing_Problem_2_ad8ae82c_2c4c_414e_874a_132f7574684d(ArrayList<Integer> array) {
        int last = array.get(array.size() - 1);
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) != i) {
                return i;
            }
        }
        return last + 1;
    }

    
    public static int findFirstMissing_Problem_2_e079ba9e_3161_4555_b1ef_00a1cbe1913f(ArrayList<Integer> array) {
        int first = array.get(0);
        int last = array.get(array.size() - 1);
        if (first != 1) {
            return 1;
        }
        for (int i = 0; i < array.size() - 1; i++) {
            if (array.get(i + 1) - array.get(i) != 1) {
                return array.get(i) + 1;
            }
        }
        return last + 1;
    }

    
    public static int findFirstMissing_Problem_2_410fdce5_9a98_4365_a0ee_ad9691dc9e4c(ArrayList<Integer> array) {
        int min = array.get(0);
        int max = array.get(array.size() - 1);
        int sum = array.stream().reduce(0L, (a, b) -> a + b);
        int expectedSum = (min + max) * (max - min + 1) / 2;
        return expectedSum - sum;
    }

    
    public static int findFirstMissing_Problem_0_db76f5df_9ece_4132_be1a_d758733c0638(ArrayList<Integer> array) {
        int last = array.get(0);
        for (int i : array) {
            if (i - last != 1) {
                return last + 1;
            }
            last = i;
        }
        return last + 1;
    }

    
    public static int findFirstMissing_Problem_0_5f25427f_d20c_4ebc_9654_9b8f8cfc611d(ArrayList<Integer> array) {
        int n = array.size();
        int low = 0;
        int high = n - 1;
        int mid = 0;
        while (low <= high) {
            mid = (low + high) / 2;
            if (array.get(mid) != mid + 1 && array.get(mid - 1) == mid) {
                return mid + 1;
            }
            if (array.get(mid) != mid + 1) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return mid + 1;
    }

    
    public static int findFirstMissing_Problem_0_a4f80249_c1f6_4079_831b_dabad985a068(ArrayList<Integer> array) {
        int firstMissing = -1;
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) != i + 1) {
                firstMissing = i + 1;
                break;
            }
        }
        return firstMissing;
    }

    
    public static int findFirstMissing_Problem_2_c1fbce78_2910_446f_af27_7d38ff8faf01(ArrayList<Integer> array) {
        int firstMissing = 0;
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) != i + 1) {
                firstMissing = i + 1;
                break;
            }
        }
        return firstMissing;
    }

    
    public static int findFirstMissing_Problem_0_f7979f6a_3fd9_40ba_8ae9_4a8765f2d4b1(ArrayList<Integer> array) {
        int n = array.size();
        int low = 0;
        int high = n - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (array.get(mid) != mid && array.get(mid - 1) == mid - 1) {
                return mid;
            } else if (array.get(mid) == mid) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    
    public static int findFirstMissing_Problem_1_a1e07eb3_ae23_48f4_9fda_39378933ed4f(ArrayList<Integer> array) {
        int min = array.get(0);
        int max = array.get(array.size() - 1);
        int sum = 0;
        for (int i = 0; i < array.size(); i++) {
            sum += array.get(i);
        }
        int expectedSum = (min + max) * (max - min + 1) / 2;
        return expectedSum - sum;
    }

    
    public static int findFirstMissing_Problem_1_21a004f9_3e6c_42f9_84c9_6da6625f2560(ArrayList<Integer> array) {
        int n = array.size();
        int sum = (n * (n + 1)) / 2;
        int total = 0;
        for (int i = 0; i < n; i++) {
            total += array.get(i);
        }
        return sum - total;
    }

    
    public static int findFirstMissing_Problem_2_bd746a46_139e_47e9_ac2e_15359a148900(ArrayList<Integer> array) {
        // Write your code here
        int first = array.get(0);
        int last = array.get(array.size()-1);
        int sum = 0;
        for(int i = 0; i < array.size(); i++){
            sum += array.get(i);
        }
        int sum2 = 0;
        for(int i = first; i <= last; i++){
            sum2 += i;
        }
        return sum2 - sum;
    }

    
    public static int findFirstMissing_Problem_0_cb6fa25a_5713_4c3b_b60f_ab733857aa5a(ArrayList<Integer> array) {
        int firstMissing = 1;
        for (int i : array) {
            if (i == firstMissing) {
                firstMissing++;
            }
        }
        return firstMissing;
    }

    
    public static int findFirstMissing_Problem_1_6c2c5aa5_8cb6_4003_85f2_6a70f8c0e8af(ArrayList<Integer> array) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i : array) {
            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }
        }
        int missing = max + 1;
        for (int i = min; i <= max; i++) {
            if (!array.contains(i)) {
                missing = i;
                break;
            }
        }
        return missing;
    }

    
    public static int findFirstMissing_Problem_1_23580f12_2d57_4411_94c1_c0ad188c2175(ArrayList<Integer> array) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (Integer i : array) {
            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }
        }
        int result = max + 1;
        for (Integer i : array) {
            if (i < result) {
                result = i;
            }
        }
        return result;
    }

    
    public static int findFirstMissing_Problem_1_05fff9ed_9241_4897_95ee_87c088dcf14a(ArrayList<Integer> array) {
        int last = array.get(array.size() - 1);
        for (int i = 0; i < last; i++) {
            if (!array.contains(i)) {
                return i;
            }
        }
        return last + 1;
    }

    
    public static int findFirstMissing_Problem_1_1cacf502_edb9_4240_89f0_905ec058c55d(ArrayList<Integer> array) {
        int min = array.get(0);
        int max = array.get(array.size()-1);
        int sum = 0;
        for (int i = min; i <= max; i++) {
            sum += i;
        }
        int actualSum = 0;
        for (int i : array) {
            actualSum += i;
        }
        return sum - actualSum;
    }

    
    public static int findFirstMissing_Problem_0_ebcbc365_660c_42e4_b560_4c393f90306f(ArrayList<Integer> array) {
        int i = 0;
        for (int l : array) {
            if (l != i) {
                return i;
            }
            i++;
        }
        return i;
    }

    
    public static int findFirstMissing_Problem_0_55e2ab10_eb88_4914_87c3_023146049e55(ArrayList<Integer> array) {
        int first = array.get(0);
        int last = array.get(array.size() - 1);
        int missing = first;
        for (int i = first; i <= last; i++) {
            if (!array.contains(i)) {
                missing = i;
                break;
            }
        }
        return missing;
    }

    
    public static int findFirstMissing_Problem_0_f9514fe9_4b4c_45f7_bbe0_df024fb40474(ArrayList<Integer> array) {
        int n = array.size();
        int low = 0;
        int high = n - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (array.get(mid) != mid + 1 && array.get(mid - 1) == mid) {
                return mid + 1;
            } else if (array.get(mid) != mid + 1) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return n + 1;
    }

    
    public static int findFirstMissing_Problem_1_93722323_8dc9_44d1_8f3e_495356e013b1(ArrayList<Integer> array) {
        // Write your code here
        int min = array.get(0);
        int max = array.get(array.size() - 1);
        int sum = 0;
        for (int i = min; i <= max; i++) {
            sum += i;
        }
        int sum2 = 0;
        for (int i = 0; i < array.size(); i++) {
            sum2 += array.get( i);
        }
        return sum - sum2;
    }

    
    public static int findFirstMissing_Problem_1_67df1f1d_c1c0_4b8a_9e1d_e597b4874dec(ArrayList<Integer> array) {
        int first = array.get(0);
        int last = array.get(array.size() - 1);
        int sum = 0;
        for (int i = first; i <= last; i++) {
            sum += i;
        }
        int actualSum = array.stream().reduce(0L, (a, b) -> a + b);
        return sum - actualSum;
    }

    
    public static int findFirstMissing_Problem_0_0d7c77a7_af0a_4e49_a9c9_03902fd662d3(ArrayList<Integer> array) {
        int firstMissing = 1;
        for (int i : array) {
            if (i == firstMissing) {
                firstMissing++;
            }
        }
        return firstMissing;
    }

    
    public static int findFirstMissing_Problem_1_55e2ab10_eb88_4914_87c3_023146049e55(ArrayList<Integer> array) {
        int first = array.get(0);
        int last = array.get(array.size() - 1);
        int missing = first;
        for (int i = first; i <= last; i++) {
            if (!array.contains(i)) {
                missing = i;
                break;
            }
        }
        return missing;
    }

    
    public static int findFirstMissing_Problem_0_ad8ae82c_2c4c_414e_874a_132f7574684d(ArrayList<Integer> array) {
        int last = array.get(array.size() - 1);
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) != i) {
                return i;
            }
        }
        return last + 1;
    }

    
    public static int findFirstMissing_Problem_0_10bf45a1_3dfc_4ccd_ad2d_d1038cf4cd65(ArrayList<Integer> array) {
        int i = 0;
        for (int l : array) {
            if (l != i) {
                return i;
            }
            i++;
        }
        return i;
    }

    
    public static int findFirstMissing_Problem_2_b36d53db_67bd_4b43_abce_38e7a5642545(ArrayList<Integer> array) {
        int i = 0;
        for (int n : array) {
            if (n > i) {
                return i;
            }
            i++;
        }
        return i;
    }

    
    public static int findFirstMissing_Problem_2_30ac2d93_893e_424b_b1e2_8e462ed9a000(ArrayList<Integer> array) {
        if (array.size() == 0) {
            return 1;
        }
        if (array.size() == 1) {
            if (array.get(0) == 1) {
                return 2;
            } else {
                return 1;
            }
        }
        int min = array.get(0);
        int max = array.get(array.size() - 1);
        int diff = max - min;
        if (diff == array.size() - 1) {
            return max + 1;
        }
        int low = 0;
        int high = array.size() - 1;
        int mid = 0;
        while (low <= high) {
            mid = (low + high) / 2;
            if (array.get( mid) != mid + min) {
                if (mid > 0 && array.get( mid - 1) == mid - 1 + min) {
                    return mid + min;
                }
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return mid + min;
    }

    
    public static int findFirstMissing_Problem_0_1a95ed21_c992_43e3_b31f_606f01c3082d(ArrayList<Integer> array) {
        // Write your code here
        int firstMissing = 1;
        for (int i = 0; i < array.size(); i++) {
            if (array.get( i) != firstMissing) {
                break;
            }
            firstMissing++;
        }
        return firstMissing;
    }

    
    public static int findFirstMissing_Problem_2_5cf22ab0_7820_4968_a227_28451a8e8c99(ArrayList<Integer> array) {
        int first = array.get(0);
        int last = array.get(array.size() - 1);
        int missing = -1;
        for (int i = first; i <= last; i++) {
            if (!array.contains(i)) {
                missing = i;
                break;
            }
        }
        return missing;
    }

    
    public static int findFirstMissing_Problem_1_3521503d_88d1_4503_942c_c668b7488baa(ArrayList<Integer> array) {
        int firstMissing = Integer.MAX_VALUE;
        int lastMissing = Integer.MIN_VALUE;
        int currentMissing = Integer.MAX_VALUE;
        for(int i : array) {
            if(i == currentMissing) {
                currentMissing = lastMissing;
            } else {
                currentMissing = currentMissing;
            }
            firstMissing = Math.min(firstMissing, currentMissing);
            lastMissing = Math.max(lastMissing, currentMissing);
        }
        return firstMissing;
    }

    
    public static int findFirstMissing_Problem_1_608a7788_deb0_4a7e_afb8_42c5fcf5a2db(ArrayList<Integer> array) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i : array) {
            if(i < min) {
                min = i;
            }
            if(i > max) {
                max = i;
            }
        }
        int missing = max + 1;
        for(int i = min; i <= max; i++) {
            if(!array.contains(i)) {
                missing = i;
                break;
            }
        }
        return missing;
    }

    
    public static int findFirstMissing_Problem_0_f654f613_3b32_40f3_bd5c_a813d06879dd(ArrayList<Integer> array) {
        int firstMissing = 0;
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) != i) {
                firstMissing = i;
                break;
            }
        }
        return firstMissing;
    }

    
    public static int findFirstMissing_Problem_0_fcc36d7c_44b8_4ab2_80be_15d1b747816f(ArrayList<Integer> array) {
        int min = array.get(0);
        int max = array.get(array.size() - 1);
        int sum = 0;
        for (int i = 0; i < array.size(); i++) {
            sum += array.get(i);
        }
        int expectedSum = (max * (max + 1)) / 2;
        return expectedSum - sum;
    }

    
    public static int findFirstMissing_Problem_2_a206a9d2_9f9c_4b36_8c0d_cad6b1f196e0(ArrayList<Integer> array) {
        int i = 0;
        for (int num : array) {
            if (num != i) {
                return i;
            }
            i++;
        }
        return i;
    }

    
    public static int findFirstMissing_Problem_0_8fa8500e_9e3e_49f9_96e8_5471eed38db0(ArrayList<Integer> array) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i : array) {
            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }
        }
        int missing = max + 1;
        for (int i = min; i <= max; i++) {
            if (array.contains(i)) {
                continue;
            }
            missing = i;
            break;
        }
        return missing;
    }

    
    public static int findFirstMissing_Problem_2_0d7c77a7_af0a_4e49_a9c9_03902fd662d3(ArrayList<Integer> array) {
        int firstMissing = 1;
        for (int i : array) {
            if (i == firstMissing) {
                firstMissing++;
            }
        }
        return firstMissing;
    }

    
    public static int findFirstMissing_Problem_1_c1fbce78_2910_446f_af27_7d38ff8faf01(ArrayList<Integer> array) {
        int firstMissing = 0;
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) != i + 1) {
                firstMissing = i + 1;
                break;
            }
        }
        return firstMissing;
    }

    
    public static int findFirstMissing_Problem_1_9ca43649_03ad_46b1_8ce1_d6a87e09677b(ArrayList<Integer> array) {
        int result = 0;
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) != i + 1) {
                result = i + 1;
                break;
            }
        }
        return result;
    }

    
    public static int findFirstMissing_Problem_1_882b9a33_61db_475e_a293_797d45dd555e(ArrayList<Integer> array) {
        int firstMissing = 0;
        for(int i = 0; i < array.size(); i++) {
            if(array.get(i) != i) {
                firstMissing = i;
                break;
            }
        }
        return firstMissing;
    }

    
    public static int findFirstMissing_Problem_1_ad14191e_6d67_4d3f_b624_f10fa34365d0(ArrayList<Integer> array) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i : array) {
            min = Math.min(min, i);
            max = Math.max(max, i);
        }
        int result = max + 1;
        for(int i = min; i <= max; i++) {
            if(!array.contains(i)) {
                result = i;
                break;
            }
        }
        return result;
    }

    
    public static int findFirstMissing_Problem_1_e9126ed4_64ec_460a_ae18_3efb08d92d87(ArrayList<Integer> array) {
        int max = array.get(array.size() - 1);
        int min = array.get(0);
        int sum = 0;
        for (int i = min; i <= max; i++) {
            sum += i;
        }
        int actualSum = 0;
        for (int i = 0; i < array.size(); i++) {
            actualSum += array.get( i);
        }
        return sum - actualSum;
    }

    
    public static int findFirstMissing_Problem_1_7bfce69c_95b2_42b5_92b1_b2c60272d463(ArrayList<Integer> array) {
        int low = 0;
        int high = array.size() - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (array.get(mid) != mid) {
                if (mid == 0 || array.get((mid - 1)) == mid - 1) {
                    return mid;
                }
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        if (low == array.size()) {
            return array.size();
        }
        return -1;
    }

}
