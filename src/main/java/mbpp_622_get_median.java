package mbpp_622_get_median;

public class mbpp_622_get_median {

    
    public static float getMedian_Problem_2_10aec405_4f20_476d_8676_efa32722ccbe(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0;
        int j = 0;
        int count = 0;
        int m1 = -1;
        int m2 = -1;
        while (count <= n) {
            count++;
            if (i == n) {
                m1 = m2;
                m2 = arr2.get( j);
                j++;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get( i);
                i++;
            } else if (arr1.get( i) < arr2.get( j)) {
                m1 = m2;
                m2 = arr1.get( i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get( j);
                j++;
            }
        }
        return (m1 + m2) / 2;
    }

    
    public static float getMedian_Problem_2_6dffef1f_bbcb_41a1_846c_0c01e0480c2d(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if(arr1.size() != arr2.size()) {
            throw new IllegalArgumentException("The two lists must be of same size");
        }
        if(arr1.size() == 0) {
            return 0;
        }
        if(arr1.size() == 1) {
            return arr1.get(0);
        }
        if(arr1.size() == 2) {
            return (arr1.get(0) + arr2.get(0)) / 2;
        }
        int mid = arr1.size() / 2;
        int i = 0;
        int j = 0;
        while(i < mid) {
            if(arr1.get(i) < arr2.get(j)) {
                i++;
            } else if(arr1.get(i) > arr2.get(j)) {
                j++;
            } else {
                i++;
                j++;
            }
        }
        if(arr1.size() % 2 == 1) {
            return arr1.get(i);
        } else {
            return (arr1.get(i) + arr2.get(j)) / 2;
        }
    }

    
    public static float getMedian_Problem_0_27a600a8_cb5e_4e2f_b6b6_df2572b09964(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0;
        int j = 0;
        int count;
        int m1 = -1, m2 = -1;
        for (count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(0);
                break;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(0);
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2;
    }

    
    public static float getMedian_Problem_2_82d86032_64ed_47df_8c01_602dedc61930(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        float median = 0;
        int i = 0, j = 0;
        int count = 0;
        while (count < n) {
            if (arr1.get(i) < arr2.get(j)) {
                median = arr1.get(i);
                i++;
            } else {
                median = arr2.get(j);
                j++;
            }
            count++;
        }
        return median;
    }

    
    public static float getMedian_Problem_1_a070a27b_a7a0_4c29_9d6a_8727e10dfbae(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if (arr1.size() != arr2.size()) {
            throw new IllegalArgumentException("Arrays must be of same size");
        }
        if (arr1.size() == 0) {
            return 0;
        }
        if (arr1.size() == 1) {
            return arr1.get(0);
        }
        if (arr1.size() == 2) {
            return (arr1.get(0) + arr2.get(0)) / 2;
        }
        int mid = arr1.size() / 2;
        int i = 0;
        int j = 0;
        while (i < mid) {
            if (arr1.get(i) > arr2.get(j)) {
                i++;
            } else if (arr1.get(i) < arr2.get(j)) {
                j++;
            } else {
                i++;
                j++;
            }
        }
        if (arr1.size() % 2 == 0) {
            return (arr1.get(i) + arr2.get(j)) / 2;
        } else {
            return arr1.get(i);
        }
    }

    
    public static float getMedian_Problem_2_20c18795_6088_4533_a555_abbfef479f68(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int m1 = -1, m2 = -1;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_2_dbdc6eaf_9650_499f_abdd_039648c47b51(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if (arr1.size() != arr2.size()) {
            throw new IllegalArgumentException("The two arrays are not of same size");
        }
        if (arr1.size() == 0) {
            throw new IllegalArgumentException("The two arrays are empty");
        }
        if (arr1.size() == 1) {
            return arr1.get(0);
        }
        if (arr1.size() == 2) {
            return (arr1.get(0) + arr2.get(0)) / 2;
        }
        int mid = arr1.size() / 2;
        if (arr1.size() % 2 == 0) {
            return (arr1.get(mid) + arr2.get(mid)) / 2;
        } else {
            return arr1.get(mid);
        }
    }

    
    public static float getMedian_Problem_1_4e49bf07_d83c_445c_b7b3_7a3ede714cc4(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        float median = 0;
        int i = 0;
        int j = 0;
        int count = 0;
        int m1 = -1;
        int m2 = -1;
        while (count <= n) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(0).intValue();
                break;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(0).intValue();
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i).intValue();
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j).intValue();
                j++;
            }
            count++;
        }
        if (n % 2 == 0) {
            median =  (m1 + m2) / 2;
        } else {
            median = m2;
        }
        return median;
    }

    
    public static float getMedian_Problem_1_345d8077_058a_4ebc_bc8e_d1f025466cdc(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        float median = 0;
        int i = 0, j = 0;
        int count = 0;
        while (count < n) {
            if (arr1.get(i) < arr2.get(j)) {
                median = arr1.get(i);
                i++;
            } else {
                median = arr2.get(j);
                j++;
            }
            count++;
        }
        return median;
    }

    
    public static float getMedian_Problem_0_31c019e6_4452_464d_9d4a_fb7efa9ed48c(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        float median = 0;
        int i = 0, j = 0;
        for (int k = 0; k <= n; k++) {
            if (i == n) {
                median = arr2.get(0);
                break;
            }
            if (j == n) {
                median = arr1.get(0);
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                median = arr1.get(i);
                i++;
            } else {
                median = arr2.get(j);
                j++;
            }
        }
        return median;
    }

    
    public static float getMedian_Problem_2_105a9f5d_0baa_4c16_a8ca_115c6fa28f25(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int size = arr1.size();
        int size2 = arr2.size();
        int size3 = size + size2;
        if (size3 % 2 == 0) {
            return  ((arr1.get(size / 2) + arr2.get(size2 / 2)) / 2);
        } else {
            return  (arr1.get(size / 2));
        }
    }

    
    public static float getMedian_Problem_0_a605d765_92c1_4c4f_bba5_9d177a1db0f7(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int m1 = -1, m2 = -1;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(0);
                break;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(0);
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_2_a5a0aee0_2110_42ca_9e01_49e16f3deb57(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        float median = 0;
        int i = 0, j = 0;
        int count = 0;
        while (count < n) {
            if (i == n) {
                median += arr2.get(j);
                j++;
            } else if (j == n) {
                median += arr1.get(i);
                i++;
            } else if (arr1.get(i) < arr2.get(j)) {
                median += arr1.get(i);
                i++;
            } else {
                median += arr2.get(j);
                j++;
            }
            count++;
        }
        return median / 2;
    }

    
    public static float getMedian_Problem_1_237a89d9_e3a5_4f0c_9e04_862c25dce8eb(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int count;
        int m1 = -1, m2 = -1;
        for (count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(0);
                break;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(0);
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2;
    }

    
    public static float getMedian_Problem_0_195fa5f4_4898_46e1_bb7e_8f8ee10272d9(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if (arr1.isEmpty() && arr2.isEmpty()) {
            return 0;
        }
        int lower = Math.min(arr1.get(0), arr2.get(0));
        int upper = Math.max(arr1.get(0), arr2.get(0));
        float median = 0;
        if (arr1.get(0) <= arr2.get(0)) {
            median =  (lower + upper / 2); // int overflow is okay here.
        } else {
            median =  (upper + lower / 2); // int overflow is okay here.
        }
        for (int i = 1; i < n; i++) {
            lower = Math.min(lower, arr1.get(i));
            upper = Math.max(upper, arr1.get(i));
            median =  (median +  (arr2.get(i) - lower)); // int overflow is okay here.
        }
        return median;
    }

    
    public static float getMedian_Problem_2_9aa7b2e5_3bb5_42d9_b2d2_770e94133fe7(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if (n <= 0) {
            return Integer.MAX_VALUE;
        }
        int largest = arr1.get(arr1.size() - 1);
        if (arr1.isEmpty() || arr2.isEmpty()) {
            return 0;
        }
        if (arr1.size() >= arr2.size()) {
            return arr2.get(arr2.size() - 1);
        }
        int smallest = arr2.get(arr2.size() - 1);
        int mid = smallest + (largest - smallest) / 2;
        if (arr1.get(arr1.size() - 1) > largest) {
            mid = arr2.get(arr2.size() - 1);
        } else if (arr2.get(arr2.size() - 1) > largest) {
            mid = arr1.get(arr1.size() - 1);
        }
        float avg =  mid / n;
        return avg;
    }

    
    public static float getMedian_Problem_0_d4568430_48e4_4245_a39a_0850b623d425(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int mid = (arr1.size() + arr2.size()) / 2;
        if (arr1.size() == arr2.size()) {
            return (arr1.get(mid) + arr2.get(mid)) / 2.0;
        } else if (arr1.size() > arr2.size()) {
            return arr1.get(mid);
        } else {
            return arr2.get(mid);
        }
    }

    
    public static float getMedian_Problem_0_cc2a23ad_3b4a_4eea_b543_95c260625884(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        float median = 0;
        int i = 0, j = 0;
        int count = 0;
        while (count < n) {
            if (arr1.get(i) < arr2.get(j)) {
                median = arr1.get(i);
                i++;
            } else {
                median = arr2.get(j);
                j++;
            }
            count++;
        }
        return median;
    }

    
    public static float getMedian_Problem_1_f6f8a880_7e82_498a_952e_d2e6a37b230f(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int count;
        int m1 = -1, m2 = -1;
        for (count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(0);
                break;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(0);
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_0_10aec405_4f20_476d_8676_efa32722ccbe(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0;
        int j = 0;
        int count = 0;
        int m1 = -1;
        int m2 = -1;
        while (count <= n) {
            count++;
            if (i == n) {
                m1 = m2;
                m2 = arr2.get( j);
                j++;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get( i);
                i++;
            } else if (arr1.get( i) < arr2.get( j)) {
                m1 = m2;
                m2 = arr1.get( i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get( j);
                j++;
            }
        }
        return (m1 + m2) / 2;
    }

    
    public static float getMedian_Problem_2_17ae4227_9c6f_45c1_b862_516fc35028ab(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int count;
        int m1 = -1, m2 = -1;
        for (count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(0);
                break;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(0);
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_1_727addcf_e2c0_4f89_85d7_062a978dc52c(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int mid = (arr1.size() + arr2.size()) / 2;
        if (arr1.size() > arr2.size()) {
            return getMedian_Problem_1_727addcf_e2c0_4f89_85d7_062a978dc52c(arr1, arr2, mid);
        } else {
            return getMedian_Problem_1_727addcf_e2c0_4f89_85d7_062a978dc52c(arr2, arr1, mid);
        }
    }

    
    public static float getMedian_Problem_0_e3a95816_b8f9_4802_a4d8_b9a7df697b45(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        // if n is odd, then median is middle element of sorted array
        // if n is even, then median is average of middle two elements of sorted array
        int median1 = 0, median2 = 0;
        int i = 0, j = 0;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                median1 = median2;
                median2 = arr2.get(0);
                break;
            } else if (j == n) {
                median1 = median2;
                median2 = arr1.get(0);
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                median1 = median2;
                median2 = arr1.get(i);
                i++;
            } else {
                median1 = median2;
                median2 = arr2.get(j);
                j++;
            }
        }
        return (median1 + median2) / 2;
    }

    
    public static float getMedian_Problem_1_72732fe4_7cee_4457_b60c_8b5e14b09b4a(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int mid1 = arr1.size() / 2;
        int mid2 = arr2.size() / 2;
        ArrayList<Integer> arr1Mid = new ArrayList<Integer>();
        ArrayList<Integer> arr2Mid = new ArrayList<Integer>();

        for (int i = 0; i < mid1; i++)
            arr1Mid.add(arr1.get(i));

        for (int i = 0; i < mid2; i++)
            arr2Mid.add(arr2.get(i));

        int sumOf1 = 0, sumOf2 = 0;

        for (int i = 0; i < mid1; i++)
            sumOf1 += arr1Mid.get(i);

        for (int i = 0; i < mid2; i++)
            sumOf2 += arr2Mid.get(i);

        if (mid1 == mid2) {
            if (sumOf1 < sumOf2)
                return arr1.get(mid1);
            else
                return arr2.get(mid1);
        }
        if (sumOf1 < sumOf2)
            return arr1.get(mid1);
        else
            return arr2.get(mid2);
    }

    
    public static float getMedian_Problem_0_5aa98be7_3399_4fc8_a9b6_628a8e0ae8ab(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int m1 = -1, m2 = -1;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_1_e3b3fea4_3d05_4186_beb5_833bf0f12bf0(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int m1 = -1, m2 = -1;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2;
    }

    
    public static float getMedian_Problem_1_72649417_907d_44a5_a548_0bd6e0d3246d(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        float median = 0;
        int i = 0, j = 0;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                median = arr2.get(0);
                break;
            }
            if (j == n) {
                median = arr1.get(0);
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                median = arr1.get(i);
                i++;
            } else {
                median = arr2.get(j);
                j++;
            }
        }
        return median;
    }

    
    public static float getMedian_Problem_1_66b134cd_869c_4cca_9273_4626db965f70(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if (arr1.size() != arr2.size()) {
            throw new IllegalArgumentException("The two arrays are not of same size");
        }
        if (arr1.size() == 0) {
            return 0;
        }
        if (arr1.size() == 1) {
            return arr1.get(0);
        }
        if (arr1.size() == 2) {
            return (arr1.get(0) + arr2.get(0)) / 2;
        }
        int mid = arr1.size() / 2;
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < mid) {
            if (arr1.get(i) < arr2.get(j)) {
                i++;
            } else if (arr1.get(i) > arr2.get(j)) {
                j++;
            } else {
                i++;
                j++;
            }
            k++;
        }
        if (arr1.size() % 2 == 0) {
            return (arr1.get(i) + arr2.get(j)) / 2;
        } else {
            return arr1.get(i);
        }
    }

    
    public static float getMedian_Problem_1_009b97f6_aa5d_42c2_9411_114fd9b06515(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int m1 = -1, m2 = -1;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_1_7b2ae845_ecb0_42b8_a3ff_e4a5b8b16bde(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        // TODO Auto-generated method stub
        return 0;
    }

    
    public static float getMedian_Problem_2_2258b35a_8c7d_4196_af52_0e8429e34c46(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int size = arr1.size();
        if (size != arr2.size()) {
            throw new IllegalArgumentException("The two arrays are not of same size");
        }
        if (size == 0) {
            throw new IllegalArgumentException("The two arrays are empty");
        }
        if (size == 1) {
            return  arr1.get(0) / n;
        }
        int mid = size / 2;
        if (size % 2 == 0) {
            return  (arr1.get(mid) + arr2.get(mid)) / n;
        } else {
            return  (arr1.get(mid) + arr2.get(mid - 1)) / n;
        }
    }

    
    public static float getMedian_Problem_1_6de22b45_374c_4d95_a6ea_e54ecb4ece97(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        float median = 0;
        int i = 0;
        int j = 0;
        int count = 0;
        while (count < n) {
            if (i == n) {
                median = arr2.get(j);
                break;
            }
            if (j == n) {
                median = arr1.get(i);
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                median = arr1.get(i);
                i++;
            } else {
                median = arr2.get(j);
                j++;
            }
            count++;
        }
        return median;
    }

    
    public static float getMedian_Problem_0_67151c45_0a35_441d_8a7e_f54032b7d85b(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int m1 = -1, m2 = -1;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_0_c6894179_2097_40d7_b915_54d11e7ece9f(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        // Code goes here
        int median = 0;
        
        if(arr1.size() == 0 || arr2.size() == 0)
            return 0;
        
        if(arr1.size() > arr2.size())
            n = arr1.size();
        else
            n = arr2.size();
        
        for(int i = 0; i < n; i++) {
            median += arr1.get(i) + arr2.get(i);
        }
        
        int half = n/2;
        median /= half;
        return Float.parseFloat(Float.toString(median));
    }

    
    public static float getMedian_Problem_2_b877302c_8bcc_4c10_b2b2_2dd07b053700(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if(arr1.size() != arr2.size()) {
            return -1;
        }
        if(arr1.size() == 1) {
            return arr1.get(0);
        }
        if(arr1.size() == 2) {
            return (arr1.get(0) + arr2.get(0)) / 2;
        }
        int mid = arr1.size() / 2;
        if(arr1.size() % 2 == 0) {
            return (arr1.get(mid) + arr2.get(mid)) / 2;
        }
        return arr1.get(mid);
    }

    
    public static float getMedian_Problem_2_04c9c1c7_2cbf_4436_a194_0d9df7e1acb9(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0;
        int j = 0;
        int count;
        int m1 = -1, m2 = -1;
        for (count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(j);
                break;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(i);
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_2_9682ce5c_2e08_4612_9262_49cf25840295(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0;
        int j = 0;
        int count;
        int m1 = -1, m2 = -1;
        for (count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(0);
                break;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(0);
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_2_e2aae2a3_d103_494f_85ca_1268f6080040(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if (arr1.size() != arr2.size()) {
            throw new IllegalArgumentException("The two arrays should be of same size");
        }
        if (arr1.size() == 0) {
            return 0;
        }
        if (arr1.size() == 1) {
            return arr1.get(0);
        }
        if (arr1.size() == 2) {
            return (arr1.get(0) + arr1.get(1)) / 2;
        }
        int mid = arr1.size() / 2;
        int left = 0;
        int right = arr1.size() - 1;
        while (left < right) {
            if (arr1.get(left) < arr1.get(right)) {
                if (arr1.get(left) < arr2.get(mid)) {
                    left++;
                } else if (arr1.get(right) < arr2.get(mid)) {
                    right--;
                } else {
                    return arr1.get(left);
                }
            } else {
                if (arr1.get(left) < arr2.get(mid)) {
                    left++;
                } else if (arr1.get(right) < arr2.get(mid)) {
                    right--;
                } else {
                    return arr2.get(mid);
                }
            }
        }
        if (arr1.get(left) < arr2.get(mid)) {
            return arr1.get(left);
        } else {
            return arr2.get(mid);
        }
    }

    
    public static float getMedian_Problem_2_abc93be9_1578_494a_8ad5_28f314e02b6c(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if (arr1.size() != arr2.size()) {
            throw new IllegalArgumentException("The two arrays should be of same size");
        }
        if (arr1.size() == 0) {
            return 0;
        }
        if (arr1.size() == 1) {
            return arr1.get(0);
        }
        if (arr1.size() == 2) {
            return (arr1.get(0) + arr2.get(0)) / 2;
        }
        int mid = arr1.size() / 2;
        if (arr1.size() % 2 == 0) {
            return (arr1.get(mid) + arr2.get(mid)) / 2;
        } else {
            return arr1.get(mid);
        }
    }

    
    public static float getMedian_Problem_0_80dc2bb8_b608_4ca5_ad2d_97115bc463c7(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0;
        int j = 0;
        int count;
        int m1 = -1;
        int m2 = -1;
        for (count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(j);
                break;
            }
            else if (j == n) {
                m1 = m2;
                m2 = arr1.get(i);
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            }
            else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_0_b05d0ff8_6115_446b_bb8e_60f02296a78e(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int sum = 0;
        while (i < arr1.size() && j < arr2.size()) {
            if (arr1.get(i) < arr2.get(j)) {
                sum += arr1.get(i);
                i++;
            } else if (arr1.get(i) > arr2.get(j)) {
                sum += arr2.get(j);
                j++;
            } else {
                sum += arr1.get(i);
                i++;
                j++;
            }
        }
        if (i == arr1.size()) {
            while (j < arr2.size()) {
                sum += arr2.get(j);
                j++;
            }
        } else if (j == arr2.size()) {
            while (i < arr1.size()) {
                sum += arr1.get(i);
                i++;
            }
        }
        return  sum / n;
    }

    
    public static float getMedian_Problem_2_4f881abf_5880_4177_8c6f_a33cecd1fd48(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        float median = 0;
        int i = 0, j = 0;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                median = arr2.get(0);
                break;
            }
            if (j == n) {
                median = arr1.get(0);
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                median = arr1.get(i);
                i++;
            } else {
                median = arr2.get(j);
                j++;
            }
        }
        return median;
    }

    
    public static float getMedian_Problem_1_d660a810_7ac3_4dbd_8123_de2709d519c5(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if (arr1.size() != arr2.size()) {
            throw new IllegalArgumentException("The two arrays are not of same size");
        }
        if (arr1.size() == 0) {
            throw new IllegalArgumentException("The two arrays are empty");
        }
        if (arr1.size() == 1) {
            return  arr1.get(0);
        }
        if (arr1.size() == 2) {
            return  ((arr1.get(0) + arr2.get(0)) / 2);
        }
        int mid = arr1.size() / 2;
        int mid2 = arr2.size() / 2;
        if (arr1.size() % 2 == 0) {
            return  ((arr1.get(mid) + arr2.get(mid2)) / 2);
        } else {
            return  arr1.get(mid);
        }
    }

    
    public static float getMedian_Problem_1_0bd0540a_1f91_41d9_84d1_545bbd115531(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        float median = 0;
        int i = 0, j = 0;
        int count = 0;
        int m1 = -1, m2 = -1;
        for (count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(0);
                break;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(0);
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        median = (m1 + m2) / 2;
        return median;
    }

    
    public static float getMedian_Problem_0_1384f5fb_0afe_4353_b147_2a765c05480b(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if(arr1.size() != arr2.size()) {
            throw new IllegalArgumentException("The two arrays are not of same size");
        }
        if(arr1.size() == 0) {
            return 0;
        }
        if(arr1.size() == 1) {
            return arr1.get(0);
        }
        if(arr1.size() == 2) {
            return (arr1.get(0) + arr2.get(0)) / 2;
        }
        int mid = arr1.size() / 2;
        if(arr1.size() % 2 == 0) {
            return (arr1.get(mid) + arr2.get(mid)) / 2;
        }
        return arr1.get(mid);
    }

    
    public static float getMedian_Problem_1_679d8a51_9506_48a6_8964_18921f0183b6(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if(arr1.size() != arr2.size()) {
            throw new IllegalArgumentException("The two lists are not of same size");
        }
        if(arr1.size() == 0) {
            return 0;
        }
        if(arr1.size() == 1) {
            return arr1.get(0);
        }
        if(arr1.size() == 2) {
            return (arr1.get(0) + arr2.get(0)) / 2;
        }
        int mid = arr1.size() / 2;
        if(arr1.size() % 2 == 0) {
            return (arr1.get(mid) + arr2.get(mid)) / 2;
        }
        return arr1.get(mid);
    }

    
    public static float getMedian_Problem_0_d660a810_7ac3_4dbd_8123_de2709d519c5(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if (arr1.size() != arr2.size()) {
            throw new IllegalArgumentException("The two arrays are not of same size");
        }
        if (arr1.size() == 0) {
            throw new IllegalArgumentException("The two arrays are empty");
        }
        if (arr1.size() == 1) {
            return  arr1.get(0);
        }
        if (arr1.size() == 2) {
            return  ((arr1.get(0) + arr2.get(0)) / 2);
        }
        int mid = arr1.size() / 2;
        int mid2 = arr2.size() / 2;
        if (arr1.size() % 2 == 0) {
            return  ((arr1.get(mid) + arr2.get(mid2)) / 2);
        } else {
            return  arr1.get(mid);
        }
    }

    
    public static float getMedian_Problem_0_c2c5f034_662d_4d0e_9e9f_41aa59860b92(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if(arr1.size() != arr2.size()) {
            return -1;
        }
        if(arr1.size() == 1) {
            return arr1.get(0);
        }
        if(arr1.size() == 2) {
            return (arr1.get(0) + arr2.get(0))/2;
        }
        int mid = arr1.size()/2;
        if(arr1.size() % 2 == 0) {
            return (arr1.get(mid) + arr2.get(mid))/2;
        }
        return arr1.get(mid);
    }

    
    public static float getMedian_Problem_0_d9f8e44e_932e_4a39_aa58_75706b1689ef(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int mid = (((n + 1) >> 1) + 0.5); // mid point
        int sum = 0;
        for(int i = 0; i < n; i++) {
            sum = sum + arr1.get(i) + arr2.get(i);
        }
        float ans =  ((sum) / n);
        return ans;
    }

    
    public static float getMedian_Problem_1_6e27a001_af80_4a69_9700_40ac76eca3dd(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        float median;
        if (arr1.size() >= arr2.size()) {
            ArrayList<Integer> temp = arr2;
            arr2 = arr1;
            arr1 = temp;
        }
        int half = arr1.size() / 2;
        median = ( arr1.get(half) +  arr2.get(half)) / 2;
        return median;
    }

    
    public static float getMedian_Problem_2_da0e76df_8099_4921_bd98_3fa223a96866(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        float median = 0;
        for (int i = 0; i < n; i++) {
            if (arr1.get(i) > arr2.get(i)) {
                median = arr1.get(i);
                break;
            } else if (arr1.get(i) < arr2.get(i)) {
                median = arr2.get(i);
                break;
            } else {
                median = arr1.get(i);
            }
        }
        return median;
    }

    
    public static float getMedian_Problem_1_3d829aee_fe40_4a3b_beb2_9009eea39e04(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if (arr1.size() != arr2.size()) {
            throw new IllegalArgumentException("The two arrays should be of same size");
        }
        if (arr1.size() == 0) {
            return 0;
        }
        if (arr1.size() == 1) {
            return arr1.get(0);
        }
        if (arr1.size() == 2) {
            return (arr1.get(0) + arr1.get(1)) / 2;
        }
        int mid = arr1.size() / 2;
        if (arr1.size() % 2 == 0) {
            return (arr1.get(mid) + arr2.get(mid)) / 2;
        } else {
            return arr1.get(mid);
        }
    }

    
    public static float getMedian_Problem_2_5da7ae3c_13f1_42ee_9ceb_b83c617392f1(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if (arr1.size() == 0 && arr2.size() == 0) {
            return  n/2;
        } else if (arr1.size() == 0 && arr2.size() > 0) {
            return arr2.get( (n/2));
        } else if (arr1.size() > 0 && arr2.size() == 0) {
            return arr1.get( (n/2));
        } else if (arr1.size() == arr2.size()) {
            return getMedian_Problem_2_5da7ae3c_13f1_42ee_9ceb_b83c617392f1(arr1, arr2, n/2);
        } else {
            return getMedian_Problem_2_5da7ae3c_13f1_42ee_9ceb_b83c617392f1(arr1, arr2, n/2);
        }
    }

    
    public static float getMedian_Problem_0_3fff20dc_cac5_4011_9818_82c7dc027f47(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0;
        int j = 0;
        int median = 0;
        for (int k = 0; k <= n; k++) {
            if (i == n) {
                median = arr2.get(0);
                break;
            }
            if (j == n) {
                median = arr1.get(0);
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                median = arr1.get(i);
                i++;
            } else {
                median = arr2.get(j);
                j++;
            }
        }
        return median;
    }

    
    public static float getMedian_Problem_2_a3290dc7_154b_4eab_a7cf_74ed5e15d44b(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if (arr1.size() != arr2.size()) {
            throw new IllegalArgumentException("The two array lists should be of same size");
        }
        if (arr1.size() == 0) {
            return 0;
        }
        if (arr1.size() == 1) {
            return arr1.get(0);
        }
        if (arr1.size() == 2) {
            return (arr1.get(0) + arr2.get(0)) / 2;
        }
        int mid = arr1.size() / 2;
        int left = 0;
        int right = arr1.size() - 1;
        while (left <= right) {
            if (arr1.get(left) < arr2.get(mid)) {
                left++;
            } else if (arr1.get(right) > arr2.get(mid)) {
                right--;
            } else {
                break;
            }
        }
        if (left == right) {
            return arr1.get(left);
        }
        if (left == 0) {
            return arr2.get(mid);
        }
        if (right == arr1.size() - 1) {
            return arr1.get(right);
        }
        return (arr1.get(left) + arr2.get(mid)) / 2;
    }

    
    public static float getMedian_Problem_1_85f7b80c_2eb9_4520_b3d7_51a4fd53b21e(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0;
        int j = 0;
        int count;
        int m1 = -1;
        int m2 = -1;
        for (count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(j);
                break;
            }
            else if (j == n) {
                m1 = m2;
                m2 = arr1.get(i);
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            }
            else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_2_0e7f4001_594f_463f_b498_2a232a932d3a(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int median = 0;
        int i = 0;
        int j = 0;
        int count;
        for (count = 0; count <= n; count++) {
            if (i == n) {
                median = arr2.get(j);
                break;
            }
            if (j == n) {
                median = arr1.get(i);
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                median = arr1.get(i);
                i++;
            } else {
                median = arr2.get(j);
                j++;
            }
        }
        if (n % 2 == 0) {
            if (i == n) {
                return (median + arr2.get(j)) / 2;
            }
            if (j == n) {
                return (median + arr1.get(i)) / 2;
            }
            return (median + Math.min(arr1.get(i), arr2.get(j))) / 2;
        }
        return median;
    }

    
    public static float getMedian_Problem_0_9aa7b2e5_3bb5_42d9_b2d2_770e94133fe7(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if (n <= 0) {
            return Integer.MAX_VALUE;
        }
        int largest = arr1.get(arr1.size() - 1);
        if (arr1.isEmpty() || arr2.isEmpty()) {
            return 0;
        }
        if (arr1.size() >= arr2.size()) {
            return arr2.get(arr2.size() - 1);
        }
        int smallest = arr2.get(arr2.size() - 1);
        int mid = smallest + (largest - smallest) / 2;
        if (arr1.get(arr1.size() - 1) > largest) {
            mid = arr2.get(arr2.size() - 1);
        } else if (arr2.get(arr2.size() - 1) > largest) {
            mid = arr1.get(arr1.size() - 1);
        }
        float avg =  mid / n;
        return avg;
    }

    
    public static float getMedian_Problem_1_115ea3fb_2677_41a6_9fe9_f4e4e779ba75(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        // initialize variables
        float med = 0;
        double mid;
        int arr1Sum = 0;
        int arr2Sum = 0;
        // calculate the sums for each array
        for (int i = 0; i < n; i++)
            arr1Sum += arr1.get(i);
        for (int i = 0; i < n; i++)
            arr2Sum += arr2.get(i);
        // calculate the mid-point
        mid =  (((double)arr1Sum + arr2Sum) / 2);
        // calculate the median
        if (arr1Sum > arr2Sum)
            med =  mid;
        else
            med =  (2 * mid);
        return med;
    }

    
    public static float getMedian_Problem_1_eab93532_44c4_4283_abcb_cac3cafb5986(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        float median;
        if (arr1.size() > arr2.size()) {
            median =  getMedian_Problem_1_eab93532_44c4_4283_abcb_cac3cafb5986(arr2, arr1, n);
        } else {
            median =  getMedian_Problem_1_eab93532_44c4_4283_abcb_cac3cafb5986(arr1, arr2, n);
        }
        return median;
    }

    
    public static float getMedian_Problem_1_9aa7b2e5_3bb5_42d9_b2d2_770e94133fe7(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if (n <= 0) {
            return Integer.MAX_VALUE;
        }
        int largest = arr1.get(arr1.size() - 1);
        if (arr1.isEmpty() || arr2.isEmpty()) {
            return 0;
        }
        if (arr1.size() >= arr2.size()) {
            return arr2.get(arr2.size() - 1);
        }
        int smallest = arr2.get(arr2.size() - 1);
        int mid = smallest + (largest - smallest) / 2;
        if (arr1.get(arr1.size() - 1) > largest) {
            mid = arr2.get(arr2.size() - 1);
        } else if (arr2.get(arr2.size() - 1) > largest) {
            mid = arr1.get(arr1.size() - 1);
        }
        float avg =  mid / n;
        return avg;
    }

    
    public static float getMedian_Problem_1_105a9f5d_0baa_4c16_a8ca_115c6fa28f25(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int size = arr1.size();
        int size2 = arr2.size();
        int size3 = size + size2;
        if (size3 % 2 == 0) {
            return  ((arr1.get(size / 2) + arr2.get(size2 / 2)) / 2);
        } else {
            return  (arr1.get(size / 2));
        }
    }

    
    public static float getMedian_Problem_1_dbdc6eaf_9650_499f_abdd_039648c47b51(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if (arr1.size() != arr2.size()) {
            throw new IllegalArgumentException("The two arrays are not of same size");
        }
        if (arr1.size() == 0) {
            throw new IllegalArgumentException("The two arrays are empty");
        }
        if (arr1.size() == 1) {
            return arr1.get(0);
        }
        if (arr1.size() == 2) {
            return (arr1.get(0) + arr2.get(0)) / 2;
        }
        int mid = arr1.size() / 2;
        if (arr1.size() % 2 == 0) {
            return (arr1.get(mid) + arr2.get(mid)) / 2;
        } else {
            return arr1.get(mid);
        }
    }

    
    public static float getMedian_Problem_2_1296c4ec_cadc_4ec2_b651_b7af90c1eeaf(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0;
        int j = 0;
        int count;
        int m1 = -1, m2 = -1;
        for (count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(j);
                break;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(i);
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_2_b8006c2e_7188_4813_adb8_b0135858922c(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int median = 0;
        int i = 0;
        int j = 0;
        int count = 0;
        int m1 = -1;
        int m2 = -1;
        while (count <= n) {
            count++;
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        median = (m1 + m2) / 2;
        return median;
    }

    
    public static float getMedian_Problem_0_6adad529_3508_4c9a_83e4_2c350e4ca8f6(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if (arr1.size() != arr2.size()) {
            throw new IllegalArgumentException("The two arrays should be of same size");
        }
        if (arr1.size() == 0) {
            return 0;
        }
        if (arr1.size() == 1) {
            return arr1.get(0);
        }
        if (arr1.size() == 2) {
            return (arr1.get(0) + arr2.get(0)) / 2;
        }
        int mid = arr1.size() / 2;
        int left = 0;
        int right = arr1.size() - 1;
        while (left <= right) {
            if (arr1.get(left) < arr1.get(right)) {
                if (arr1.get(left) < arr2.get(mid)) {
                    left++;
                } else if (arr1.get(right) < arr2.get(mid)) {
                    right--;
                } else {
                    return arr1.get(left);
                }
            } else {
                if (arr1.get(left) < arr2.get(mid)) {
                    left++;
                } else if (arr1.get(right) < arr2.get(mid)) {
                    right--;
                } else {
                    return arr2.get(mid);
                }
            }
        }
        return (arr1.get(left) + arr2.get(left)) / 2;
    }

    
    public static float getMedian_Problem_0_d8b4ae7e_8f66_4396_8e91_deef10938e64(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        float median = 0;
        int i = 0, j = 0;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                median = arr2.get(0);
                break;
            }
            if (j == n) {
                median = arr1.get(0);
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                median = arr1.get(i);
                i++;
            } else {
                median = arr2.get(j);
                j++;
            }
        }
        return median;
    }

    
    public static float getMedian_Problem_1_6adad529_3508_4c9a_83e4_2c350e4ca8f6(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if (arr1.size() != arr2.size()) {
            throw new IllegalArgumentException("The two arrays should be of same size");
        }
        if (arr1.size() == 0) {
            return 0;
        }
        if (arr1.size() == 1) {
            return arr1.get(0);
        }
        if (arr1.size() == 2) {
            return (arr1.get(0) + arr2.get(0)) / 2;
        }
        int mid = arr1.size() / 2;
        int left = 0;
        int right = arr1.size() - 1;
        while (left <= right) {
            if (arr1.get(left) < arr1.get(right)) {
                if (arr1.get(left) < arr2.get(mid)) {
                    left++;
                } else if (arr1.get(right) < arr2.get(mid)) {
                    right--;
                } else {
                    return arr1.get(left);
                }
            } else {
                if (arr1.get(left) < arr2.get(mid)) {
                    left++;
                } else if (arr1.get(right) < arr2.get(mid)) {
                    right--;
                } else {
                    return arr2.get(mid);
                }
            }
        }
        return (arr1.get(left) + arr2.get(left)) / 2;
    }

    
    public static float getMedian_Problem_2_466dce18_9f22_4526_aac0_b4ffd5a38917(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        float median = 0;
        int i = 0, j = 0;
        for (int k = 0; k <= n; k++) {
            if (i == n) {
                median = arr2.get(j);
                break;
            }
            if (j == n) {
                median = arr1.get(i);
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                median = arr1.get(i);
                i++;
            } else {
                median = arr2.get(j);
                j++;
            }
        }
        return median;
    }

    
    public static float getMedian_Problem_1_d6f08a87_b70f_4881_ac4b_65431f43d426(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int sum = 0;
        int mid = 0;
        float median;
        int temp;
        for(int i = 0; i < n; i++) {
            sum += arr1.get(i);
        }
        mid = sum / n;
        sum = 0;
        for(int i = 0; i < n; i++) {
            sum += arr2.get(i);
        }
        temp = sum / n;
        median =  mid +  temp;
        return median;
    }

    
    public static float getMedian_Problem_1_a605d765_92c1_4c4f_bba5_9d177a1db0f7(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int m1 = -1, m2 = -1;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(0);
                break;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(0);
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_0_68247956_7a8f_4e1c_b3f7_1256cef3d28a(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int m1 = -1, m2 = -1;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
            else if (j == n) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            }
            else if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            }
            else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_1_215bca0e_432a_4f5c_839b_60ffc59df268(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int size = arr1.size();
        while (i < size && j < size) {
            if (arr1.get(i) < arr2.get(j)) {
                i++;
            } else if (arr1.get(i) > arr2.get(j)) {
                j++;
            } else {
                i++;
                j++;
            }
        }
        if (i == size) {
            return arr2.get(j - 1);
        } else if (j == size) {
            return arr1.get(i - 1);
        } else {
            return (arr1.get(i - 1) + arr2.get(j - 1)) / 2.0;
        }
    }

    
    public static float getMedian_Problem_2_2ffd29b1_0607_4bb4_af52_f9d7cb7af1a5(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if(arr1.size() != arr2.size()) {
            throw new IllegalArgumentException("The two arrays must be of same size");
        }
        if(arr1.size() == 1) {
            return arr1.get(0);
        }
        if(arr1.size() == 2) {
            return (arr1.get(0) + arr2.get(0))/2;
        }
        int mid = arr1.size()/2;
        if(arr1.size()%2 == 0) {
            return (arr1.get(mid) + arr2.get(mid))/2;
        }
        return arr1.get(mid);
    }

    
    public static float getMedian_Problem_2_2a5a255a_6d90_49d6_b892_4613cf4ee6bd(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if (arr1.size() != arr2.size()) {
            throw new IllegalArgumentException("The two arrays are not of same size");
        }
        if (arr1.size() == 0) {
            throw new IllegalArgumentException("The two arrays are empty");
        }
        if (arr1.size() == 1) {
            return arr1.get(0);
        }
        if (arr1.size() == 2) {
            return (arr1.get(0) + arr2.get(0)) / 2.0;
        }
        int mid = arr1.size() / 2;
        if (arr1.size() % 2 == 0) {
            return (arr1.get(mid) + arr2.get(mid)) / 2.0;
        } else {
            return arr1.get(mid);
        }
    }

    
    public static float getMedian_Problem_2_b27cb000_7c0a_4950_b127_cc313e9a9e9a(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int leftIndex=Integer.MAX_VALUE;
        int rightIndex=0;
        int size=arr1.size()+arr2.size();
        for(int i=0;i<n;i++)
        {
            if(i>leftIndex&&i<rightIndex)
            {
                if(arr1.get(i)<arr2.get(i))
                    return (arr1.get(i)<arr2.get(i))?arr1.get(i):arr2.get(i);
                else
                    return (arr1.get(i)<arr2.get(i))?arr2.get(i):arr1.get(i);
            }
            else if(arr1.get(i)<arr2.get(i))
            {
                leftIndex=i;
            }
            else if(arr1.get(i)>arr2.get(i))
            {
                rightIndex=i;
            }
        }
        return (arr1.get(leftIndex)>arr2.get(rightIndex))?arr1.get(leftIndex):arr2.get(rightIndex);
    }

    
    public static float getMedian_Problem_2_5864b4f7_64fc_467c_b82f_84d49b7eeaf8(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int m1 = -1, m2 = -1;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_2_442d8240_7a54_499a_9efb_576380e54952(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int m1 = -1, m2 = -1;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_1_ff689b4e_f4c2_457c_9f70_4cf507b895a3(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        float median = 0;
        int i = 0, j = 0;
        int count;
        for (count = 0; count <= n; count++) {
            if (i == n) {
                median = arr2.get(0);
                break;
            } else if (j == n) {
                median = arr1.get(0);
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                median = arr1.get(i);
                i++;
            } else {
                median = arr2.get(j);
                j++;
            }
        }
        return median;
    }

    
    public static float getMedian_Problem_2_0a37d382_b353_4a42_a514_61e8c8c88e5c(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        float median = 0;
        int i = 0, j = 0;
        int count = 0;
        while (count < n) {
            if (arr1.get(i) < arr2.get(j)) {
                median = arr1.get(i);
                i++;
            } else {
                median = arr2.get(j);
                j++;
            }
            count++;
        }
        return median;
    }

    
    public static float getMedian_Problem_0_e6381e31_439e_4840_bfc4_ad8ead9fe210(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int m1 = -1, m2 = -1;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_0_708091ce_5384_466d_ad24_d10729946a29(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if (arr1.isEmpty() && arr2.isEmpty()) {
            System.out.println("Empty list");
            return 0;
        }
        if (arr1.isEmpty() && arr2.size() == n) {
            return arr2.get(0);
        }
        if (arr1.size() == n && arr2.isEmpty()) {
            return arr1.get(0);
        }
        if (arr1.size() == n && arr2.size() == n) {
            int sum = 0;
            Integer num1 = arr1.get(arr1.size() - 1);
            Integer num2 = arr2.get(arr2.size() - 1);
            sum += num1;
            sum += num2;
            return (sum / 2);
        }
        return Float.POSITIVE_INFINITY;
    }

    
    public static float getMedian_Problem_2_5b8dea58_f316_41f4_9102_b71dfaf392b4(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if (arr1.size() != arr2.size()) {
            throw new IllegalArgumentException("Array lists should be of same size");
        }
        if (arr1.size() == 1) {
            return arr1.get(0);
        }
        if (arr1.size() == 2) {
            return (arr1.get(0) + arr2.get(0)) / 2;
        }
        int mid = arr1.size() / 2;
        int i = 0;
        int j = 0;
        while (i < mid) {
            if (arr1.get(i) < arr2.get(j)) {
                i++;
            } else if (arr1.get(i) > arr2.get(j)) {
                j++;
            } else {
                i++;
                j++;
            }
        }
        if (i == mid) {
            return arr1.get(i);
        } else if (j == mid) {
            return arr2.get(j);
        } else {
            return (arr1.get(i) + arr2.get(j)) / 2;
        }
    }

    
    public static float getMedian_Problem_2_e007e0ae_37de_4c14_9e15_e0689d2c35d6(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int mid = (arr1.size() + arr2.size()) / 2;
        if (arr1.size() > arr2.size()) {
            return getMedian_Problem_2_e007e0ae_37de_4c14_9e15_e0689d2c35d6(arr1, arr2, mid);
        } else {
            return getMedian_Problem_2_e007e0ae_37de_4c14_9e15_e0689d2c35d6(arr2, arr1, mid);
        }
    }

    
    public static float getMedian_Problem_0_b88bf0af_2ab2_4dd4_b8bb_9b08cee6a5be(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int k = 0;
        while (i < arr1.size() && j < arr2.size()) {
            if (arr1.get(i) < arr2.get(j)) {
                i++;
            } else if (arr1.get(i) > arr2.get(j)) {
                j++;
            } else {
                k++;
                i++;
                j++;
            }
        }
        if (k == n / 2) {
            return  (arr1.get(i - 1) + arr2.get(j - 1)) / 2;
        } else if (k < n / 2) {
            return  arr1.get(i - 1);
        } else {
            return  arr2.get(j - 1);
        }
    }

    
    public static float getMedian_Problem_1_85e8c9c6_39d8_4657_8f13_faf3a833a234(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int m1 = -1, m2 = -1;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_1_6bbb5aff_8e4c_43bf_b2b5_ff04ed94b365(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0;
        int j = 0;
        int m1 = -1;
        int m2 = -1;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(0);
                break;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(0);
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_0_21b72bf6_5d2a_4d29_bd7e_22ca3b519a2f(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        float f1, f2;
        if (arr1.size() == 0 || arr2.size() == 0) {
            return 0;
        }
        if (arr1.size() > arr2.size()) {
            f1 = getMedian_Problem_0_21b72bf6_5d2a_4d29_bd7e_22ca3b519a2f(arr1, arr2, arr1.size());
        } else {
            f2 = getMedian_Problem_0_21b72bf6_5d2a_4d29_bd7e_22ca3b519a2f(arr1, arr2, arr2.size());
        }
        ArrayList<Integer> list1 = new ArrayList<>(arr1);
        ArrayList<Integer> list2 = new ArrayList<>(arr2);
        float f3;
        if (list1.size() % 2 == 0 && list2.size() % 2 == 0) {
            f3 = (list1.get(list1.size() / 2)) + (list2.get(list2.size() / 2)) / 2.0;
            return f3;
        }
        if (list1.size() % 2 == 0) {
            f1 = getMedian_Problem_0_21b72bf6_5d2a_4d29_bd7e_22ca3b519a2f(arr1, arr2, arr1.size() / 2);
            f2 = getMedian_Problem_0_21b72bf6_5d2a_4d29_bd7e_22ca3b519a2f(arr1, arr2, arr2.size() / 2);
        } else {
            f1 = getMedian_Problem_0_21b72bf6_5d2a_4d29_bd7e_22ca3b519a2f(arr1, arr2, arr1.size() / 2);
            f2 = getMedian_Problem_0_21b72bf6_5d2a_4d29_bd7e_22ca3b519a2f(arr1, arr2, arr2.size() / 2);
        }
        if (f1 < f2) {
            return f1;
        } else {
            return f2;
        }
    }

    
    public static float getMedian_Problem_2_00ee4a08_3264_483c_9778_f3756246d69b(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int count;
        int m1 = -1, m2 = -1;
        for (count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(0);
                break;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(0);
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_1_2258b35a_8c7d_4196_af52_0e8429e34c46(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int size = arr1.size();
        if (size != arr2.size()) {
            throw new IllegalArgumentException("The two arrays are not of same size");
        }
        if (size == 0) {
            throw new IllegalArgumentException("The two arrays are empty");
        }
        if (size == 1) {
            return  arr1.get(0) / n;
        }
        int mid = size / 2;
        if (size % 2 == 0) {
            return  (arr1.get(mid) + arr2.get(mid)) / n;
        } else {
            return  (arr1.get(mid) + arr2.get(mid - 1)) / n;
        }
    }

    
    public static float getMedian_Problem_2_0b4f1f9d_d955_4591_9243_04d8b7176048(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        float median = 0;
        int i = 0;
        int j = 0;
        int count = 0;
        int m1 = -1;
        int m2 = -1;
        while (count <= n) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(0).intValue();
                break;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(0).intValue();
                break;
            }
            if (arr1.get(i).intValue() < arr2.get(j).intValue()) {
                m1 = m2;
                m2 = arr1.get(i).intValue();
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j).intValue();
                j++;
            }
            count++;
        }
        median = (m1 + m2) / 2.0;
        return median;
    }

    
    public static float getMedian_Problem_1_b6c2991e_0f6d_44e4_a682_24087e4863ef(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if (arr1.size() != arr2.size()) {
            throw new IllegalArgumentException("Array lists are not of same size");
        }
        if (arr1.size() == 0) {
            throw new IllegalArgumentException("Array lists are empty");
        }
        if (arr1.size() == 1) {
            return arr1.get(0);
        }
        if (arr1.size() == 2) {
            return (arr1.get(0) + arr1.get(1)) / 2.0;
        }
        int mid = arr1.size() / 2;
        if (arr1.size() % 2 == 0) {
            return (arr1.get(mid) + arr2.get(mid)) / 2.0;
        } else {
            return arr1.get(mid);
        }
    }

    
    public static float getMedian_Problem_1_6dffef1f_bbcb_41a1_846c_0c01e0480c2d(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if(arr1.size() != arr2.size()) {
            throw new IllegalArgumentException("The two lists must be of same size");
        }
        if(arr1.size() == 0) {
            return 0;
        }
        if(arr1.size() == 1) {
            return arr1.get(0);
        }
        if(arr1.size() == 2) {
            return (arr1.get(0) + arr2.get(0)) / 2;
        }
        int mid = arr1.size() / 2;
        int i = 0;
        int j = 0;
        while(i < mid) {
            if(arr1.get(i) < arr2.get(j)) {
                i++;
            } else if(arr1.get(i) > arr2.get(j)) {
                j++;
            } else {
                i++;
                j++;
            }
        }
        if(arr1.size() % 2 == 1) {
            return arr1.get(i);
        } else {
            return (arr1.get(i) + arr2.get(j)) / 2;
        }
    }

    
    public static float getMedian_Problem_1_e007e0ae_37de_4c14_9e15_e0689d2c35d6(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int mid = (arr1.size() + arr2.size()) / 2;
        if (arr1.size() > arr2.size()) {
            return getMedian_Problem_1_e007e0ae_37de_4c14_9e15_e0689d2c35d6(arr1, arr2, mid);
        } else {
            return getMedian_Problem_1_e007e0ae_37de_4c14_9e15_e0689d2c35d6(arr2, arr1, mid);
        }
    }

    
    public static float getMedian_Problem_2_5d7845e6_3610_4187_a230_7ed5bf251366(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        // Write your code here
        
        int minVal = arr1.get(0);
        int maxVal = arr2.get(0);
        
        if(arr1.size() > arr2.size()){
            minVal = arr2.get(arr2.size()-1);
            maxVal = arr1.get(arr1.size()-1);
        }
        else{
            minVal = arr1.get(arr1.size()-1);
            maxVal = arr2.get(arr2.size()-1);
        }
        
        float midVal = (minVal+maxVal)/2;
        
        for(int i = 0; i < n; i++){
            if(arr1.get(i) < midVal && arr2.get(i) < midVal){
                arr1.remove(i);
                arr2.remove(i);
            }
            if(arr1.get(i) > midVal && arr2.get(i) > midVal){
                arr1.remove(i);
                arr2.remove(i);
            }
        }
        
        float median = ((arr1.get(0) + arr2.get(0) / 2))/2;
        
        return median;
    }

    
    public static float getMedian_Problem_0_e33627c0_09dc_4219_9a63_bf2884913d1c(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if (arr1.size() == arr2.size()) {
            int sum = 0;
            for (int i = 0; i < arr1.size(); i++) {
                sum += arr1.get(i);
            }
            for (int i = 0; i < arr2.size(); i++) {
                sum += arr2.get(i);
            }
            if (n % 2 == 0) {
                return  (sum / 2);
            } else {
                return  (sum / 2 + arr1.get(arr1.size() / 2));
            }
        } else {
            return  (arr1.get(arr1.size() / 2) + arr2.get(arr2.size() / 2));
        }
    }

    
    public static float getMedian_Problem_0_be5615e8_6129_46c0_a560_92edac9efb3f(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if(arr1.size() != arr2.size()) {
            throw new IllegalArgumentException("The two array lists should be of same size");
        }
        if(arr1.size() == 0) {
            return 0;
        }
        if(arr1.size() == 1) {
            return arr1.get(0);
        }
        if(arr1.size() == 2) {
            return (arr1.get(0) + arr2.get(0)) / 2;
        }
        int mid = arr1.size() / 2;
        if(arr1.size() % 2 == 0) {
            return (arr1.get(mid) + arr2.get(mid)) / 2;
        }
        return arr1.get(mid);
    }

    
    public static float getMedian_Problem_1_0b4f1f9d_d955_4591_9243_04d8b7176048(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        float median = 0;
        int i = 0;
        int j = 0;
        int count = 0;
        int m1 = -1;
        int m2 = -1;
        while (count <= n) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(0).intValue();
                break;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(0).intValue();
                break;
            }
            if (arr1.get(i).intValue() < arr2.get(j).intValue()) {
                m1 = m2;
                m2 = arr1.get(i).intValue();
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j).intValue();
                j++;
            }
            count++;
        }
        median = (m1 + m2) / 2.0;
        return median;
    }

    
    public static float getMedian_Problem_0_e2aae2a3_d103_494f_85ca_1268f6080040(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if (arr1.size() != arr2.size()) {
            throw new IllegalArgumentException("The two arrays should be of same size");
        }
        if (arr1.size() == 0) {
            return 0;
        }
        if (arr1.size() == 1) {
            return arr1.get(0);
        }
        if (arr1.size() == 2) {
            return (arr1.get(0) + arr1.get(1)) / 2;
        }
        int mid = arr1.size() / 2;
        int left = 0;
        int right = arr1.size() - 1;
        while (left < right) {
            if (arr1.get(left) < arr1.get(right)) {
                if (arr1.get(left) < arr2.get(mid)) {
                    left++;
                } else if (arr1.get(right) < arr2.get(mid)) {
                    right--;
                } else {
                    return arr1.get(left);
                }
            } else {
                if (arr1.get(left) < arr2.get(mid)) {
                    left++;
                } else if (arr1.get(right) < arr2.get(mid)) {
                    right--;
                } else {
                    return arr2.get(mid);
                }
            }
        }
        if (arr1.get(left) < arr2.get(mid)) {
            return arr1.get(left);
        } else {
            return arr2.get(mid);
        }
    }

    
    public static float getMedian_Problem_0_65792403_166e_459f_8ac0_fa175807a2dd(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0;
        int j = 0;
        int m1 = -1;
        int m2 = -1;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(0);
                break;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(0);
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_2_44b5dd90_5406_4756_ac4c_03ab7584e9a9(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int m1 = -1, m2 = -1;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(0);
                break;
            }
            else if (j == n) {
                m1 = m2;
                m2 = arr1.get(0);
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            }
            else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_0_da0e76df_8099_4921_bd98_3fa223a96866(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        float median = 0;
        for (int i = 0; i < n; i++) {
            if (arr1.get(i) > arr2.get(i)) {
                median = arr1.get(i);
                break;
            } else if (arr1.get(i) < arr2.get(i)) {
                median = arr2.get(i);
                break;
            } else {
                median = arr1.get(i);
            }
        }
        return median;
    }

    
    public static float getMedian_Problem_1_1f4e3e72_a64c_483f_bc86_6c9b3fd3ea2a(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        float temp;
        if (arr1.size() < arr2.size()) {
            temp = arr1.get((arr1.size() / 2));
            arr1.remove((arr1.size() / 2));
            arr2.remove((arr2.size() / 2));
            return temp;
        }
        temp = arr2.get((arr2.size() / 2));
        arr1.remove((arr2.size() / 2));
        arr2.remove((arr1.size() / 2));
        return temp;
    }

    
    public static float getMedian_Problem_2_6adad529_3508_4c9a_83e4_2c350e4ca8f6(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if (arr1.size() != arr2.size()) {
            throw new IllegalArgumentException("The two arrays should be of same size");
        }
        if (arr1.size() == 0) {
            return 0;
        }
        if (arr1.size() == 1) {
            return arr1.get(0);
        }
        if (arr1.size() == 2) {
            return (arr1.get(0) + arr2.get(0)) / 2;
        }
        int mid = arr1.size() / 2;
        int left = 0;
        int right = arr1.size() - 1;
        while (left <= right) {
            if (arr1.get(left) < arr1.get(right)) {
                if (arr1.get(left) < arr2.get(mid)) {
                    left++;
                } else if (arr1.get(right) < arr2.get(mid)) {
                    right--;
                } else {
                    return arr1.get(left);
                }
            } else {
                if (arr1.get(left) < arr2.get(mid)) {
                    left++;
                } else if (arr1.get(right) < arr2.get(mid)) {
                    right--;
                } else {
                    return arr2.get(mid);
                }
            }
        }
        return (arr1.get(left) + arr2.get(left)) / 2;
    }

    
    public static float getMedian_Problem_1_4c66efc8_ae0b_411f_b155_4b7c11b6b13b(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if (arr1.size() != arr2.size()) {
            throw new IllegalArgumentException("Array lists are not of same size");
        }
        if (arr1.size() == 0) {
            return 0;
        }
        if (arr1.size() == 1) {
            return arr1.get(0);
        }
        if (arr1.size() == 2) {
            return (arr1.get(0) + arr2.get(0)) / 2;
        }
        int mid = arr1.size() / 2;
        if (arr1.size() % 2 == 0) {
            return (arr1.get(mid) + arr2.get(mid)) / 2;
        } else {
            return arr1.get(mid);
        }
    }

    
    public static float getMedian_Problem_2_a72e3a68_b08e_4bff_a376_98baac154dcd(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i =  Math.ceil(n / 2);
        int l1 = Math.min(arr1.size(), i);
        int l2 = Math.min(arr2.size(), i);
        if (l1 < l2) {
            return getMedian_Problem_2_a72e3a68_b08e_4bff_a376_98baac154dcd(arr1, arr2, l1);
        }
        return getMedian_Problem_2_a72e3a68_b08e_4bff_a376_98baac154dcd(arr2, arr1, l2);
    }

    
    public static float getMedian_Problem_2_9f232f7a_dea2_4e60_9bfd_ba8c9a77a38d(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if (arr1.size() == arr2.size()) {
            int i = 0;
            int j = 0;
            int k = 0;
            while (i < arr1.size() && j < arr2.size()) {
                if (arr1.get(i) < arr2.get(j)) {
                    i++;
                } else if (arr1.get(i) > arr2.get(j)) {
                    j++;
                } else {
                    k++;
                    i++;
                    j++;
                }
            }
            if (k == n / 2) {
                return  (arr1.get(i - 1) + arr2.get(j - 1)) / 2;
            } else if (k < n / 2) {
                return arr1.get(i - 1);
            } else {
                return arr2.get(j - 1);
            }
        } else {
            return -1;
        }
    }

    
    public static float getMedian_Problem_0_2a5a255a_6d90_49d6_b892_4613cf4ee6bd(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if (arr1.size() != arr2.size()) {
            throw new IllegalArgumentException("The two arrays are not of same size");
        }
        if (arr1.size() == 0) {
            throw new IllegalArgumentException("The two arrays are empty");
        }
        if (arr1.size() == 1) {
            return arr1.get(0);
        }
        if (arr1.size() == 2) {
            return (arr1.get(0) + arr2.get(0)) / 2.0;
        }
        int mid = arr1.size() / 2;
        if (arr1.size() % 2 == 0) {
            return (arr1.get(mid) + arr2.get(mid)) / 2.0;
        } else {
            return arr1.get(mid);
        }
    }

    
    public static float getMedian_Problem_2_b05d0ff8_6115_446b_bb8e_60f02296a78e(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int sum = 0;
        while (i < arr1.size() && j < arr2.size()) {
            if (arr1.get(i) < arr2.get(j)) {
                sum += arr1.get(i);
                i++;
            } else if (arr1.get(i) > arr2.get(j)) {
                sum += arr2.get(j);
                j++;
            } else {
                sum += arr1.get(i);
                i++;
                j++;
            }
        }
        if (i == arr1.size()) {
            while (j < arr2.size()) {
                sum += arr2.get(j);
                j++;
            }
        } else if (j == arr2.size()) {
            while (i < arr1.size()) {
                sum += arr1.get(i);
                i++;
            }
        }
        return  sum / n;
    }

    
    public static float getMedian_Problem_0_9682ce5c_2e08_4612_9262_49cf25840295(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0;
        int j = 0;
        int count;
        int m1 = -1, m2 = -1;
        for (count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(0);
                break;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(0);
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_1_a291cc4d_5bcd_47de_974c_9457214aaac6(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if (arr1.size() != arr2.size()) {
            throw new IllegalArgumentException("The two arrays should be of same size");
        }
        if (arr1.size() == 0) {
            return 0;
        }
        if (arr1.size() == 1) {
            return arr1.get(0);
        }
        if (arr1.size() == 2) {
            return (arr1.get(0) + arr2.get(0)) / 2;
        }
        int mid = arr1.size() / 2;
        if (arr1.size() % 2 == 0) {
            return (arr1.get(mid) + arr2.get(mid)) / 2;
        } else {
            return arr1.get(mid);
        }
    }

    
    public static float getMedian_Problem_1_e8d893bd_b94b_41e8_9a01_6cb81ff4ac22(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int count;
        int m1 = -1, m2 = -1;
        for (count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(0);
                break;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(0);
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_2_fc6e0b59_7d7e_494c_98dd_ade7a1e1f0ed(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if (arr1.size() != arr2.size()) {
            throw new IllegalArgumentException("The two arrays must be of same size");
        }
        if (arr1.size() == 0) {
            throw new IllegalArgumentException("The two arrays cannot be empty");
        }
        if (arr1.size() == 1) {
            return arr1.get(0);
        }
        if (arr1.size() == 2) {
            return (arr1.get(0) + arr2.get(0)) / 2;
        }
        int mid = arr1.size() / 2;
        int i = 0;
        int j = 0;
        while (i < mid) {
            if (arr1.get(i) < arr2.get(j)) {
                i++;
            } else if (arr1.get(i) > arr2.get(j)) {
                j++;
            } else {
                i++;
                j++;
            }
        }
        if (arr1.size() % 2 == 0) {
            return (arr1.get(i) + arr2.get(j)) / 2;
        } else {
            return arr1.get(i);
        }
    }

    
    public static float getMedian_Problem_1_a638c70b_3c62_456e_9021_e11979d49504(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if (arr1.size() != arr2.size()) {
            throw new IllegalArgumentException("Arrays must be of same size");
        }
        if (arr1.size() == 0) {
            return 0;
        }
        if (arr1.size() == 1) {
            return arr1.get(0);
        }
        if (arr1.size() == 2) {
            return (arr1.get(0) + arr2.get(0)) / 2;
        }
        int mid = arr1.size() / 2;
        int i = 0;
        int j = 0;
        while (i < mid) {
            if (arr1.get(i) < arr2.get(j)) {
                i++;
            } else if (arr1.get(i) > arr2.get(j)) {
                j++;
            } else {
                i++;
                j++;
            }
        }
        if (arr1.size() % 2 == 0) {
            return (arr1.get(i) + arr2.get(j)) / 2;
        } else {
            return arr1.get(i);
        }
    }

    
    public static float getMedian_Problem_1_44c4b493_a267_47cb_adbe_79f8605b0481(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if(arr1.size() != arr2.size()) {
            throw new IllegalArgumentException("The two arrays are not of same size");
        }
        if(arr1.size() == 1) {
            return arr1.get(0);
        }
        if(arr1.size() == 2) {
            return (arr1.get(0) + arr2.get(0)) / 2.0;
        }
        int mid = arr1.size() / 2;
        if(arr1.size() % 2 == 0) {
            return (arr1.get(mid) + arr2.get(mid)) / 2.0;
        }
        return arr1.get(mid);
    }

    
    public static float getMedian_Problem_2_e1333cfa_a8e7_4b0a_837e_ec8d5098f9a5(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int sum = 0;
        int mid;
        float median;
        for(int i = 0; i < n; i++) {
            sum += arr1.get(i);
            sum += arr2.get(i);
        }
        mid = sum / 2;
        median =  Math.ceil(sum / 2);
        return median;
    }

    
    public static float getMedian_Problem_0_13b6cba2_a853_4028_bcaa_856bfd70fa87(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        float median = 0;
        int i = 0;
        int j = 0;
        int count;
        for (count = 0; count <= n; count++) {
            if (i == n) {
                median = arr2.get(0);
                break;
            }
            if (j == n) {
                median = arr1.get(0);
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                median = arr1.get(i);
                i++;
            } else {
                median = arr2.get(j);
                j++;
            }
        }
        return median;
    }

    
    public static float getMedian_Problem_0_a070a27b_a7a0_4c29_9d6a_8727e10dfbae(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if (arr1.size() != arr2.size()) {
            throw new IllegalArgumentException("Arrays must be of same size");
        }
        if (arr1.size() == 0) {
            return 0;
        }
        if (arr1.size() == 1) {
            return arr1.get(0);
        }
        if (arr1.size() == 2) {
            return (arr1.get(0) + arr2.get(0)) / 2;
        }
        int mid = arr1.size() / 2;
        int i = 0;
        int j = 0;
        while (i < mid) {
            if (arr1.get(i) > arr2.get(j)) {
                i++;
            } else if (arr1.get(i) < arr2.get(j)) {
                j++;
            } else {
                i++;
                j++;
            }
        }
        if (arr1.size() % 2 == 0) {
            return (arr1.get(i) + arr2.get(j)) / 2;
        } else {
            return arr1.get(i);
        }
    }

    
    public static float getMedian_Problem_1_36de7655_aea4_4fa5_a08c_30fcfafb17d2(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        float median = 0;
        int i = 0, j = 0;
        int count;
        for (count = 0; count <= n; count++) {
            if (i == n) {
                median = arr2.get(0);
                break;
            }
            if (j == n) {
                median = arr1.get(0);
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                median = arr1.get(i);
                i++;
            } else {
                median = arr2.get(j);
                j++;
            }
        }
        return median;
    }

    
    public static float getMedian_Problem_2_efe02e9a_c3b7_4140_9a0d_20ed54a5b7fd(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int median = 0;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                median = arr2.get(0);
                break;
            }
            if (j == n) {
                median = arr1.get(0);
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                median = arr1.get(i);
                i++;
            } else {
                median = arr2.get(j);
                j++;
            }
        }
        return median;
    }

    
    public static float getMedian_Problem_0_85f7b80c_2eb9_4520_b3d7_51a4fd53b21e(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0;
        int j = 0;
        int count;
        int m1 = -1;
        int m2 = -1;
        for (count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(j);
                break;
            }
            else if (j == n) {
                m1 = m2;
                m2 = arr1.get(i);
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            }
            else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_0_5ffce3f5_02ca_462e_a18b_948126569990(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int size = arr1.size();
        int size2 = arr2.size();
        int size3 = size + size2;
        if (size3 % 2 == 0) {
            return  ((arr1.get(i) + arr2.get(j)) / 2);
        } else {
            return  arr1.get(i);
        }
    }

    
    public static float getMedian_Problem_0_de8bea11_1db4_4cde_89af_50e5cb730fab(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        float median;
        int mid;
        int sum;
        int min;
        int max;
        if (arr1.size() > arr2.size()) {
            min = arr1.get(arr1.size() - 1);
            max = arr2.get(arr2.size() - 1);
            mid = (min + max) / 2;
            sum = arr1.get(arr1.size() - 1) + arr2.get(arr2.size() - 1);
            median =  (sum / 2);
        } else if (arr1.size() < arr2.size()) {
            min = arr2.get(arr2.size() - 1);
            max = arr1.get(arr1.size() - 1);
            mid = (min + max) / 2;
            sum = arr1.get(arr1.size() - 1) + arr2.get(arr2.size() - 1);
            median =  (sum / 2);
        } else {
            min = arr1.get(arr1.size() - 1);
            max = arr2.get(arr2.size() - 1);
            mid = (min + max) / 2;
            sum = arr1.get(arr1.size() - 1) + arr2.get(arr2.size() - 1);
            median =  (sum / 2);
        }
        return median;
    }

    
    public static float getMedian_Problem_0_4fbcde55_3091_4485_b55b_3ac1f93629ad(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        float median = 0;
        int i = 0, j = 0;
        for (int k = 0; k <= n; k++) {
            if (i == n) {
                median = arr2.get(0);
                break;
            }
            if (j == n) {
                median = arr1.get(0);
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                median = arr1.get(i);
                i++;
            } else {
                median = arr2.get(j);
                j++;
            }
        }
        return median;
    }

    
    public static float getMedian_Problem_1_dc3cff7d_629b_4db3_b22f_478ff1ffe04c(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        float median = 0;
        int i = 0, j = 0;
        int m1 = -1, m2 = -1;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(0).intValue();
                break;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(0).intValue();
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i).intValue();
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j).intValue();
                j++;
            }
        }
        median = (m1 + m2) / 2;
        return median;
    }

    
    public static float getMedian_Problem_0_7d9c6a75_ff21_4ca1_b386_0bc313908b1d(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if (arr1.size() != arr2.size()) {
            throw new IllegalArgumentException("The two arrays must be of same size");
        }
        if (arr1.size() == 1) {
            return arr1.get(0);
        }
        if (arr1.size() == 2) {
            return (arr1.get(0) + arr2.get(0)) / 2;
        }
        int mid = arr1.size() / 2;
        int left = 0;
        int right = arr1.size() - 1;
        while (left <= right) {
            if (arr1.get(mid) < arr2.get(mid)) {
                left = mid + 1;
            } else if (arr1.get(mid) > arr2.get(mid)) {
                right = mid - 1;
            } else {
                return arr1.get(mid);
            }
            mid = (left + right) / 2;
        }
        return arr1.get(mid);
    }

    
    public static float getMedian_Problem_1_ba763a9d_4e60_4f5c_941c_3b28111bc9b4(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int m1 = -1, m2 = -1;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get( j);
                j++;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get( i);
                i++;
            } else if (arr1.get( i) < arr2.get( j)) {
                m1 = m2;
                m2 = arr1.get( i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get( j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_0_47d87e3a_0566_4a5a_aa69_c1c8bc10cdc1(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if (arr1.size() != arr2.size()) {
            return -1;
        }
        if (arr1.size() == 1) {
            return arr1.get(0);
        }
        if (arr2.size() == 1) {
            return arr2.get(0);
        }
        int mid = arr1.size() / 2;
        if (arr1.size() % 2 == 0) {
            return (arr1.get(mid) + arr2.get(mid)) / 2.0;
        } else {
            return arr1.get(mid);
        }
    }

    
    public static float getMedian_Problem_0_4a93b853_ceb4_4432_9b4f_b16221e7699c(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        ArrayList<Integer> list = new ArrayList<>();
        if (arr1.size() <= arr2.size()) {
            for (int i = 0; i < arr1.size(); i++) {
                list.add(arr1.get(i));
            }
            for (int i = 0; i < arr2.size(); i++) {
                list.add(arr2.get(i));
            }
            int index = list.size() / 2;
            float median;
            if (list.size() % 2 == 1) {
                median = list.get(index);
            } else {
                median = ((list.get(index) + list.get(index + 1))) / 2;
            }
            return median;
        }
        return -1;
    }

    
    public static float getMedian_Problem_1_5a470991_daf1_438c_9662_80b5ccc9b421(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        float median;
        if (arr1.size() > arr2.size()) {
            median =  getMedian_Problem_1_5a470991_daf1_438c_9662_80b5ccc9b421(arr2, arr1, n);
        } else {
            median =  getMedian_Problem_1_5a470991_daf1_438c_9662_80b5ccc9b421(arr1, arr2, n);
        }
        return median;
    }

    
    public static float getMedian_Problem_1_6d061ff0_dd62_46d1_bd2e_0e1db47f7469(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int sum = 0;
        int mid = n/2;
        int sum1 = 0;
        int sum2 = 0;
        for(int i = 0; i < n; i++) {
            sum += arr1.get(i);
            sum1 += arr2.get(i);
        }
        float median =  sum/n;
        float median1 =  sum1/n;
        float median2 =  sum2/n;
        if(sum%2 == 0) {
            return median;
        } else {
            return median1;
        }
    }

    
    public static float getMedian_Problem_1_c8209fd3_7c58_4ca8_9592_6d10dce34f0e(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        // Your code here
        int i=0,j=0,k=0;
        int[] arr3 = new int[2*n];
        while(i<n && j<n){
            if(arr1.get(i)<arr2.get(j)){
                arr3[k]=arr1.get(i);
                i++;
            }
            else{
                arr3[k]=arr2.get(j);
                j++;
            }
            k++;
        }
        while(i<n){
            arr3[k]=arr1.get(i);
            i++;
            k++;
        }
        while(j<n){
            arr3[k]=arr2.get(j);
            j++;
            k++;
        }
        return (arr3[(n-1)]+arr3[n])/2;
    }

    
    public static float getMedian_Problem_0_c1baa561_a670_4c3c_be23_12620344b861(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        float median = 0;
        int i = 0, j = 0;
        for (int k = 0; k <= n; k++) {
            if (i == n) {
                median = arr2.get(j);
                break;
            }
            if (j == n) {
                median = arr1.get(i);
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                median = arr1.get(i);
                i++;
            } else {
                median = arr2.get(j);
                j++;
            }
        }
        return median;
    }

    
    public static float getMedian_Problem_1_eb65d6d0_d6b9_4038_90f2_ed7426f4fc82(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int m1 = -1, m2 = -1;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_1_22820c53_03cf_4665_9514_ec828a5f0d54(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        float median = 0;
        int i = 0, j = 0;
        for (int k = 0; k <= n; k++) {
            if (i == n) {
                median = arr2.get(j);
                break;
            }
            if (j == n) {
                median = arr1.get(i);
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                median = arr1.get(i);
                i++;
            } else {
                median = arr2.get(j);
                j++;
            }
        }
        return median;
    }

    
    public static float getMedian_Problem_1_77a3a3f1_d134_4569_84bb_eae7c2918609(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        float median = 0;
        int i = 0, j = 0;
        for (int k = 0; k <= n; k++) {
            if (i == n) {
                median = arr2.get(j);
                break;
            }
            if (j == n) {
                median = arr1.get(i);
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                median = arr1.get(i);
                i++;
            } else {
                median = arr2.get(j);
                j++;
            }
        }
        return median;
    }

    
    public static float getMedian_Problem_1_009bace1_b805_48aa_aad6_6f7a0b8e435c(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        float median = 0;
        int mid1 = arr1.get((n/2));
        int mid2 = arr2.get((n/2));
        if(mid1 < mid2)
            median = mid1;
        else
            median = mid2;
        
        return median;
    }

    
    public static float getMedian_Problem_0_2258b35a_8c7d_4196_af52_0e8429e34c46(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int size = arr1.size();
        if (size != arr2.size()) {
            throw new IllegalArgumentException("The two arrays are not of same size");
        }
        if (size == 0) {
            throw new IllegalArgumentException("The two arrays are empty");
        }
        if (size == 1) {
            return  arr1.get(0) / n;
        }
        int mid = size / 2;
        if (size % 2 == 0) {
            return  (arr1.get(mid) + arr2.get(mid)) / n;
        } else {
            return  (arr1.get(mid) + arr2.get(mid - 1)) / n;
        }
    }

    
    public static float getMedian_Problem_2_e381dd11_fc58_4612_9b53_6fa8bd0f8ee8(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if(arr1.size() != arr2.size()) {
            throw new IllegalArgumentException("The two lists must be of same size");
        }
        if(arr1.size() == 0) {
            return 0;
        }
        if(arr1.size() == 1) {
            return arr1.get(0);
        }
        if(arr1.size() == 2) {
            return (arr1.get(0) + arr2.get(0)) / 2;
        }
        int mid = arr1.size() / 2;
        int i = 0;
        int j = 0;
        while(i < mid) {
            if(arr1.get(i) < arr2.get(j)) {
                i++;
            } else if(arr1.get(i) > arr2.get(j)) {
                j++;
            } else {
                i++;
                j++;
            }
        }
        if(arr1.size() % 2 == 0) {
            return (arr1.get(i) + arr2.get(j)) / 2;
        } else {
            return arr1.get(i);
        }
    }

    
    public static float getMedian_Problem_1_6d232e17_43f6_403b_8013_0fdad622e3f9(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int first = 0;
        int second = 0;
        if(arr1.isEmpty() || arr2.isEmpty()){
            return 0;
        }
        if(arr1.size() < arr2.size()){
            first = arr1.get(0);
            second = arr2.get(arr2.size()-1);
        }
        else{
            first = arr2.get(0);
            second = arr1.get(arr1.size()-1);
        }
        if(first > second){
            return first;
        }
        if(first == second){
            return first;
        }
        int half = (first + second)/2;
        return half;
    }

    
    public static float getMedian_Problem_1_7bb4014f_f82a_47f8_860e_0cffdbb7fc68(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0;
        int j = 0;
        int m1 = -1;
        int m2 = -1;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(0);
                break;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(0);
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_0_fc6e0b59_7d7e_494c_98dd_ade7a1e1f0ed(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if (arr1.size() != arr2.size()) {
            throw new IllegalArgumentException("The two arrays must be of same size");
        }
        if (arr1.size() == 0) {
            throw new IllegalArgumentException("The two arrays cannot be empty");
        }
        if (arr1.size() == 1) {
            return arr1.get(0);
        }
        if (arr1.size() == 2) {
            return (arr1.get(0) + arr2.get(0)) / 2;
        }
        int mid = arr1.size() / 2;
        int i = 0;
        int j = 0;
        while (i < mid) {
            if (arr1.get(i) < arr2.get(j)) {
                i++;
            } else if (arr1.get(i) > arr2.get(j)) {
                j++;
            } else {
                i++;
                j++;
            }
        }
        if (arr1.size() % 2 == 0) {
            return (arr1.get(i) + arr2.get(j)) / 2;
        } else {
            return arr1.get(i);
        }
    }

    
    public static float getMedian_Problem_0_c8209fd3_7c58_4ca8_9592_6d10dce34f0e(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        // Your code here
        int i=0,j=0,k=0;
        int[] arr3 = new int[2*n];
        while(i<n && j<n){
            if(arr1.get(i)<arr2.get(j)){
                arr3[k]=arr1.get(i);
                i++;
            }
            else{
                arr3[k]=arr2.get(j);
                j++;
            }
            k++;
        }
        while(i<n){
            arr3[k]=arr1.get(i);
            i++;
            k++;
        }
        while(j<n){
            arr3[k]=arr2.get(j);
            j++;
            k++;
        }
        return (arr3[(n-1)]+arr3[n])/2;
    }

    
    public static float getMedian_Problem_1_cfd92b6c_3875_4fae_b77a_d08860a8c482(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int m1 = -1, m2 = -1;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_2_5328a13b_f676_4440_8b4e_d50c125e3071(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if (arr1.size() > arr2.size()) {
            return getMedian_Problem_2_5328a13b_f676_4440_8b4e_d50c125e3071(arr2, arr1, n);
        }
        int mid = arr1.size() / 2;
        int m1 = arr1.get(mid);
        int m2 = arr2.get(mid);
        if (m1 == m2)
            return m1;
        if (m2 < m1)
            return getMedian_Problem_2_5328a13b_f676_4440_8b4e_d50c125e3071(arr2, arr1, n);
        return getMedian_Problem_2_5328a13b_f676_4440_8b4e_d50c125e3071(arr1, arr2, n);
    }

    
    public static float getMedian_Problem_2_59f5b2b0_eb45_4560_90fa_3f9c857628f7(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int m1 = -1, m2 = -1;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_2_9177488e_8182_4414_af62_c5ba799b53c5(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if(arr1.size() != arr2.size()) {
            throw new IllegalArgumentException("The two arrays are not of same size");
        }
        if(arr1.size() == 1) {
            return arr1.get(0);
        }
        if(arr1.size() == 2) {
            return (arr1.get(0) + arr2.get(0)) / 2.0;
        }
        int mid = arr1.size() / 2;
        if(arr1.size() % 2 == 0) {
            return (arr1.get(mid) + arr2.get(mid)) / 2.0;
        }
        return arr1.get(mid);
    }

    
    public static float getMedian_Problem_1_708091ce_5384_466d_ad24_d10729946a29(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if (arr1.isEmpty() && arr2.isEmpty()) {
            System.out.println("Empty list");
            return 0;
        }
        if (arr1.isEmpty() && arr2.size() == n) {
            return arr2.get(0);
        }
        if (arr1.size() == n && arr2.isEmpty()) {
            return arr1.get(0);
        }
        if (arr1.size() == n && arr2.size() == n) {
            int sum = 0;
            Integer num1 = arr1.get(arr1.size() - 1);
            Integer num2 = arr2.get(arr2.size() - 1);
            sum += num1;
            sum += num2;
            return (sum / 2);
        }
        return Float.POSITIVE_INFINITY;
    }

    
    public static float getMedian_Problem_0_340779c8_41f0_42df_8355_85c74151cddf(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        float median = 0;
        if (arr1.size() > arr2.size()) {
            median = arr1.get( (n/2));
        } else {
            median = arr2.get( (n/2));
        }
        return median;
    }

    
    public static float getMedian_Problem_0_b877302c_8bcc_4c10_b2b2_2dd07b053700(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if(arr1.size() != arr2.size()) {
            return -1;
        }
        if(arr1.size() == 1) {
            return arr1.get(0);
        }
        if(arr1.size() == 2) {
            return (arr1.get(0) + arr2.get(0)) / 2;
        }
        int mid = arr1.size() / 2;
        if(arr1.size() % 2 == 0) {
            return (arr1.get(mid) + arr2.get(mid)) / 2;
        }
        return arr1.get(mid);
    }

    
    public static float getMedian_Problem_0_96c8a81e_3c8e_4a7e_98fa_31a4915cd204(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0;
        int j = 0;
        int count;
        int m1 = -1, m2 = -1;
        for (count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(0);
                break;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(0);
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2;
    }

    
    public static float getMedian_Problem_0_8f655b17_bcb1_4cbb_b59d_05ecc310d42f(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int m1 = -1, m2 = -1;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

    
    public static float getMedian_Problem_0_6fa96156_d28b_4187_a71d_ebfa26958100(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0;
        int j = 0;
        int count;
        int m1 = -1, m2 = -1;
        for (count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(0);
                break;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(0);
                break;
            }
            if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2;
    }

    
    public static float getMedian_Problem_0_12031f5a_6f71_4648_bc2e_5d5bbee84998(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        if (arr1.size() == 0 || arr2.size() == 0) {
            return  1.0;
        }
        int mid1 =  Math.floor(n / 2);
        int mid2 =  Math.floor(n / 2);

        if (arr1.get(mid1) < arr2.get(mid2)) {
            return getMedian_Problem_0_12031f5a_6f71_4648_bc2e_5d5bbee84998(arr1, arr2, mid1);
        } else {
            return getMedian_Problem_0_12031f5a_6f71_4648_bc2e_5d5bbee84998(arr1, arr2, mid2);
        }
    }

    
    public static float getMedian_Problem_1_c6894179_2097_40d7_b915_54d11e7ece9f(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        // Code goes here
        int median = 0;
        
        if(arr1.size() == 0 || arr2.size() == 0)
            return 0;
        
        if(arr1.size() > arr2.size())
            n = arr1.size();
        else
            n = arr2.size();
        
        for(int i = 0; i < n; i++) {
            median += arr1.get(i) + arr2.get(i);
        }
        
        int half = n/2;
        median /= half;
        return Float.parseFloat(Float.toString(median));
    }

    
    public static float getMedian_Problem_0_fbf91551_1a10_4347_ae8c_06cf9d4d8760(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int size = arr1.size();
        int size2 = arr2.size();
        int size3 = size + size2;
        if (size3 % 2 == 0) {
            return  ((arr1.get(i) + arr2.get(j)) / 2);
        } else {
            return  arr1.get(i);
        }
    }

    
    public static float getMedian_Problem_2_5aa98be7_3399_4fc8_a9b6_628a8e0ae8ab(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n) {
        int i = 0, j = 0;
        int m1 = -1, m2 = -1;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            } else if (j == n) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else if (arr1.get(i) < arr2.get(j)) {
                m1 = m2;
                m2 = arr1.get(i);
                i++;
            } else {
                m1 = m2;
                m2 = arr2.get(j);
                j++;
            }
        }
        return (m1 + m2) / 2.0;
    }

}
