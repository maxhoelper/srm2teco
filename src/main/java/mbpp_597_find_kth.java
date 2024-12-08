package mbpp_597_find_kth;

public class mbpp_597_find_kth {

    
    public static int findKth_Problem_1_e97b2b6b_e7f7_494e_82a1_b7f6178f2de9(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int result = -1;
        if(arr1==null || arr2==null || k==0)
            return result;
        if(k<arr1.size())
            k = arr1.size();
        else if(k>arr2.size())
            k = arr2.size();

        for(int i=0; i<arr1.size(); i++)
        {
            for(int j=i; j<arr1.size(); j++)
            {
                int temp1 = arr1.get(i);
                int temp2 = arr2.get(j);
                if(temp1<temp2)
                {
                    int temp = temp1;
                    temp1 = temp2;
                    temp2 = temp;
                }
                int difference = arr1.get(i)+arr2.get(j)-k;
                if(difference<0)
                {
                    difference = difference*-1;
                }
                if(result==-1)
                {
                    result = temp1;
                }
                else if(temp1>result)
                {
                    result = temp1;
                }
                else if(temp2>result)
                {
                    result = temp2;
                }
            }
        }
        return result;
    }

    
    public static int findKth_Problem_0_974500d8_b718_475f_8173_7d41d6d516ae(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        // Write your code here
        return 0;
    }

    
    public static int findKth_Problem_2_15fcd6a2_4c0a_467c_a5cc_44b6a78ec625(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int i = 0;
        int j = 0;
        while (k > 0) {
            if (i >= arr1.size()) {
                return arr2.get(j + k - 1);
            }
            if (j >= arr2.size()) {
                return arr1.get(i + k - 1);
            }
            if (arr1.get(i) < arr2.get(j)) {
                i++;
            } else {
                j++;
            }
            k--;
        }
        return Math.min(arr1.get(i), arr2.get(j));
    }

    
    public static int findKth_Problem_1_eed8f161_5712_4a44_be7e_1c63a16b2669(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int n = arr1.size();
        int m = arr2.size();
        if (n == 0) return arr2.get(k - 1);
        if (m == 0) return arr1.get(k - 1);
        if (k == 1) return Math.min(arr1.get(0), arr2.get(0));
        if (k == n + m) return Math.max(arr1.get(n - 1), arr2.get(m - 1));
        int i = Math.min(k / 2, n);
        int j = Math.min(k / 2, m);
        if (arr1.get(i - 1) < arr2.get(j - 1)) {
            return findKth_Problem_1_eed8f161_5712_4a44_be7e_1c63a16b2669(new ArrayList<Integer>(arr1.subList(i, n)), arr2, k - i);
        } else {
            return findKth_Problem_1_eed8f161_5712_4a44_be7e_1c63a16b2669(arr1, new ArrayList<Integer>(arr2.subList(j, m)), k - j);
        }
    }

    
    public static int findKth_Problem_0_09b007d3_8559_4859_bec2_722e7f6abc53(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int i = 0;
        int j = 0;
        int count = 0;
        while (i < arr1.size() && j < arr2.size()) {
            if (arr1.get(i) < arr2.get(j)) {
                count++;
                if (count == k) {
                    return arr1.get(i);
                }
                i++;
            } else {
                count++;
                if (count == k) {
                    return arr2.get(j);
                }
                j++;
            }
        }
        while (i < arr1.size()) {
            count++;
            if (count == k) {
                return arr1.get(i);
            }
            i++;
        }
        while (j < arr2.size()) {
            count++;
            if (count == k) {
                return arr2.get(j);
            }
            j++;
        }
        return -1;
    }

    
    public static int findKth_Problem_0_5254dbf1_4e45_4528_9e35_d30bb16393e0(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        // Write your code here
        int i = 0;
        int j = 0;
        int count = 0;
        while (i < arr1.size() && j < arr2.size()) {
            if (arr1.get(i) < arr2.get(j)) {
                count++;
                if (count == k) {
                    return arr1.get(i);
                }
                i++;
            } else {
                count++;
                if (count == k) {
                    return arr2.get(j);
                }
                j++;
            }
        }
        while (i < arr1.size()) {
            count++;
            if (count == k) {
                return arr1.get(i);
            }
            i++;
        }
        while (j < arr2.size()) {
            count++;
            if (count == k) {
                return arr2.get(j);
            }
            j++;
        }
        return -1;
    }

    
    public static int findKth_Problem_0_e0843e84_2bad_4635_9cd4_16c1d8684802(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int n = arr1.size();
        int m = arr2.size();
        if (k > n + m) {
            return -1;
        }
        if (k == n + m) {
            return Math.max(arr1.get(n - 1), arr2.get(m - 1));
        }
        if (k == 1) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int i =  Math.min(k / 2, n);
        int j =  (k - i);
        if (arr1.get(i - 1) < arr2.get(j - 1)) {
            return findKth_Problem_0_e0843e84_2bad_4635_9cd4_16c1d8684802(new ArrayList<Integer>(arr1.subList(i, n)), arr2, k - i);
        } else if (arr1.get(i - 1) > arr2.get(j - 1)) {
            return findKth_Problem_0_e0843e84_2bad_4635_9cd4_16c1d8684802(arr1, new ArrayList<Integer>(arr2.subList(j, m)), k - j);
        } else {
            return arr1.get(i - 1);
        }
    }

    
    public static int findKth_Problem_1_27fb1526_69ab_473f_adb9_9aecb0631c92(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int i = 0;
        int j = 0;
        int count = 0;
        while (i < arr1.size() && j < arr2.size()) {
            if (arr1.get(i) < arr2.get(j)) {
                if (count == k) {
                    return arr1.get(i);
                }
                i++;
                count++;
            } else {
                if (count == k) {
                    return arr2.get(j);
                }
                j++;
                count++;
            }
        }
        while (i < arr1.size()) {
            if (count == k) {
                return arr1.get(i);
            }
            i++;
            count++;
        }
        while (j < arr2.size()) {
            if (count == k) {
                return arr2.get(j);
            }
            j++;
            count++;
        }
        return -1;
    }

    
    public static int findKth_Problem_1_429813f2_765e_4c96_b45d_15062e87bf39(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        // Write your code here
        return 0;
    }

    
    public static int findKth_Problem_2_a6339143_f507_43f0_b684_acedf537b407(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int sum = 0; //sum of all elements
        int index = 0;
        for(int i = 0; i < arr1.size(); i++) {
            sum += arr1.get(i);
            if(sum > k) {
                index = i; //index where sum will be greater than k
            }
        }
        
        sum = 0;
        for(int i = 0; i < arr2.size(); i++) {
            sum += arr2.get(i);
            if(sum > k) {
                index = i; //index where sum will be greater than k
            }
        }
        
        
        
        
        return arr1.get(index); //return kth element from the array list
    }

    
    public static int findKth_Problem_1_57accfab_e274_4a9b_9eee_f62f07ab173f(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get(k - 1);
        }
        if (arr2.size() == 0) {
            return arr1.get(k - 1);
        }
        if (k == 1) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int k1 = Math.min(k / 2, arr1.size());
        int k2 = Math.min(k / 2, arr2.size());
        if (arr1.get(k1 - 1) < arr2.get(k2 - 1)) {
            return findKth_Problem_1_57accfab_e274_4a9b_9eee_f62f07ab173f(new ArrayList<Integer>(arr1.subList(k1, arr1.size())), arr2, k - k1);
        } else {
            return findKth_Problem_1_57accfab_e274_4a9b_9eee_f62f07ab173f(arr1, new ArrayList<Integer>(arr2.subList(k2, arr2.size())), k - k2);
        }
    }

    
    public static int findKth_Problem_2_a1a1120b_29e9_46a6_af96_1bd65daf6597(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get(k - 1);
        }
        if (arr2.size() == 0) {
            return arr1.get(k - 1);
        }
        if (k == 1) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int mid1 = arr1.size() / 2;
        int mid2 = arr2.size() / 2;
        if (mid1 + mid2 < k) {
            if (arr1.get(mid1) > arr2.get(mid2)) {
                return findKth_Problem_2_a1a1120b_29e9_46a6_af96_1bd65daf6597(arr1, new ArrayList<Integer>(arr2.subList(mid2 + 1, arr2.size())), k - mid2 - 1);
            } else {
                return findKth_Problem_2_a1a1120b_29e9_46a6_af96_1bd65daf6597(new ArrayList<Integer>(arr1.subList(mid1 + 1, arr1.size())), arr2, k - mid1 - 1);
            }
        } else {
            if (arr1.get(mid1) > arr2.get(mid2)) {
                return findKth_Problem_2_a1a1120b_29e9_46a6_af96_1bd65daf6597(new ArrayList<Integer>(arr1.subList(0, mid1)), arr2, k);
            } else {
                return findKth_Problem_2_a1a1120b_29e9_46a6_af96_1bd65daf6597(arr1, new ArrayList<Integer>(arr2.subList(0, mid2)), k);
            }
        }
    }

    
    public static int findKth_Problem_0_775e622c_fb0f_4970_80f8_f2a5cf86446e(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get(k);
        }
        if (arr2.size() == 0) {
            return arr1.get(k);
        }
        if (k == 0) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int i = Math.min(k/2, arr1.size() - 1);
        int j = Math.min(k/2, arr2.size() - 1);
        if (arr1.get(i) < arr2.get(j)) {
            return findKth_Problem_0_775e622c_fb0f_4970_80f8_f2a5cf86446e(new ArrayList<Integer>(arr1.subList(i + 1, arr1.size())), arr2, k - i - 1);
        } else {
            return findKth_Problem_0_775e622c_fb0f_4970_80f8_f2a5cf86446e(arr1, new ArrayList<Integer>(arr2.subList(j + 1, arr2.size())), k - j - 1);
        }
    }

    
    public static int findKth_Problem_2_fda6408e_da5d_43d2_bb20_c7e587d09a06(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if(k == 0 || k > arr1.size()) {
            throw new IllegalArgumentException("Invalid value for k");
        }
        if(k > arr2.size()) {
            throw new IllegalArgumentException("Invalid value for k");
        }
        if(arr1 == null || arr2 == null || arr1.size() == 0 || arr2.size() == 0) {
            throw new IllegalArgumentException("Array lists are empty");
        }

        int lower = Math.min(arr1.get(0), arr2.get(0));
        int upper = Math.max(arr1.get(arr1.size()-1), arr2.get(arr2.size()-1));
        int middle = (lower + upper) / 2;
        int i = 0;
        while(i == 0 && k < arr1.size()) {
            if(arr1.get(i) == middle || arr2.get(i) == middle) {
                k++;
            }
            else {
                i++;
            }
        }
        while(i < arr1.size() && k == arr1.size()) {
            if(arr1.get(i) == middle) {
                k++;
            }
            else {
                i++;
            }
        }
        while(i < arr2.size() && k == arr2.size()) {
            if(arr2.get(i) == middle) {
                k++;
            }
            else {
                i++;
            }
        }
        if(k > arr1.size()) {
            k = arr1.size();
        }
        if(k > arr2.size()) {
            k = arr2.size();
        }
        return middle;
    }

    
    public static int findKth_Problem_1_7abe2e27_49a1_45b7_872e_416f74c61ca5(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int n = arr1.size();
        int m = arr2.size();
        if (k > n + m) {
            return -1;
        }
        if (k == 0) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        if (k == n + m) {
            return Math.max(arr1.get(n - 1), arr2.get(m - 1));
        }
        int i =  Math.min(k - 1, n - 1);
        int j =  (k - i - 2);
        if (arr1.get(i) < arr2.get(j)) {
            ArrayList<Integer> newArr1 = new ArrayList<Integer>(arr1.subList(i + 1, n));
            return findKth_Problem_1_7abe2e27_49a1_45b7_872e_416f74c61ca5(newArr1, arr2, k - i - 1);
        } else if (arr1.get(i) > arr2.get(j)) {
            ArrayList<Integer> newArr2 = new ArrayList<Integer>(arr2.subList(j + 1, m));
            return findKth_Problem_1_7abe2e27_49a1_45b7_872e_416f74c61ca5(arr1, newArr2, k - j - 1);
        } else {
            return arr1.get(i);
        }
    }

    
    public static int findKth_Problem_0_2f425929_9057_46b5_9a6a_10e237b27b38(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int maxIndex1 = 0;
        int maxIndex2 = 0;
        int maxIndex = -1;
        for (int i = 0; i < arr1.size(); i++) {
            if (arr1.get(i) > maxIndex1) {
                maxIndex1 = arr1.get(i);
            }
        }
        for (int j = 0; j < arr2.size(); j++) {
            if (arr2.get(j) > maxIndex2) {
                maxIndex2 = arr2.get(j);
            }
        }
        if (maxIndex1 < maxIndex2) {
            maxIndex = maxIndex1;
        } else {
            maxIndex = maxIndex2;
        }
        int maxArr1Index = arr1.indexOf(maxIndex + 1);
        int maxArr2Index = arr2.indexOf(maxIndex + 1);
        int maxDiff = Math.abs(maxArr1Index - maxArr2Index);
        while (k > maxDiff) {
            maxIndex++;
            maxArr1Index = arr1.indexOf(maxIndex + 1);
            maxArr2Index = arr2.indexOf(maxIndex + 1);
            maxDiff = Math.abs(maxArr1Index - maxArr2Index);
        }
        return maxIndex;
    }

    
    public static int findKth_Problem_1_4afe2e96_ad68_46d5_a8fb_5b3d766d4de1(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int kth = 0;
        int prev = -99999999;
        for (int i = 0; i < arr1.size(); i++) {
            if (prev <= arr1.get(i)) {
                kth = arr1.get(i);
            }
            prev = arr2.get(i);
        }
        return kth;
    }

    
    public static int findKth_Problem_0_7abe2e27_49a1_45b7_872e_416f74c61ca5(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int n = arr1.size();
        int m = arr2.size();
        if (k > n + m) {
            return -1;
        }
        if (k == 0) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        if (k == n + m) {
            return Math.max(arr1.get(n - 1), arr2.get(m - 1));
        }
        int i =  Math.min(k - 1, n - 1);
        int j =  (k - i - 2);
        if (arr1.get(i) < arr2.get(j)) {
            ArrayList<Integer> newArr1 = new ArrayList<Integer>(arr1.subList(i + 1, n));
            return findKth_Problem_0_7abe2e27_49a1_45b7_872e_416f74c61ca5(newArr1, arr2, k - i - 1);
        } else if (arr1.get(i) > arr2.get(j)) {
            ArrayList<Integer> newArr2 = new ArrayList<Integer>(arr2.subList(j + 1, m));
            return findKth_Problem_0_7abe2e27_49a1_45b7_872e_416f74c61ca5(arr1, newArr2, k - j - 1);
        } else {
            return arr1.get(i);
        }
    }

    
    public static int findKth_Problem_2_c7aec5b7_dc3a_4105_9bd0_6eb1a4d02500(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int i = 0;
        int j = 0;
        while (k > 0) {
            if (arr1.get(i) < arr2.get(j)) {
                i++;
            } else {
                j++;
            }
            k--;
        }
        return Math.min(arr1.get(i), arr2.get(j));
    }

    
    public static int findKth_Problem_2_3131093a_ad34_46b4_a231_bf290ca43946(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get(k-1);
        }
        if (arr2.size() == 0) {
            return arr1.get(k-1);
        }
        if (k == 1) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int mid1 = arr1.size() >= k/2 ? arr1.get(k/2-1) : Integer.MAX_VALUE;
        int mid2 = arr2.size() >= k/2 ? arr2.get(k/2-1) : Integer.MAX_VALUE;
        if (mid1 < mid2) {
            return findKth_Problem_2_3131093a_ad34_46b4_a231_bf290ca43946(new ArrayList<Integer>(arr1.subList(k/2, arr1.size())), arr2, k - k/2);
        } else {
            return findKth_Problem_2_3131093a_ad34_46b4_a231_bf290ca43946(arr1, new ArrayList<Integer>(arr2.subList(k/2, arr2.size())), k - k/2);
        }
    }

    
    public static int findKth_Problem_0_5cc86954_0eef_44b8_8cb4_ef5670fecc02(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        // Write your code here
        int n1 = arr1.size();
        int n2 = arr2.size();
        if (n1 == 0) {
            return arr2.get( k - 1);
        }
        if (n2 == 0) {
            return arr1.get( k - 1);
        }
        if (k == 1) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int i = Math.min(n1,  k / 2);
        int j = Math.min(n2,  k / 2);
        if (arr1.get(i - 1) > arr2.get(j - 1)) {
            return findKth_Problem_0_5cc86954_0eef_44b8_8cb4_ef5670fecc02(arr1, new ArrayList<Integer>(arr2.subList(j, n2)), k - j);
        } else {
            return findKth_Problem_0_5cc86954_0eef_44b8_8cb4_ef5670fecc02(new ArrayList<Integer>(arr1.subList(i, n1)), arr2, k - i);
        }
    }

    
    public static int findKth_Problem_1_6590173f_2d4f_4895_93f6_c5dfb72e655a(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get(k);
        }
        if (arr2.size() == 0) {
            return arr1.get(k);
        }
        if (k == 0) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int mid1 = Math.min(k/2, arr1.size() - 1);
        int mid2 = Math.min(k/2, arr2.size() - 1);
        if (arr1.get(mid1) < arr2.get(mid2)) {
            return findKth_Problem_1_6590173f_2d4f_4895_93f6_c5dfb72e655a(new ArrayList<Integer>(arr1.subList(mid1 + 1, arr1.size())), arr2, k - mid1 - 1);
        }
        else {
            return findKth_Problem_1_6590173f_2d4f_4895_93f6_c5dfb72e655a(arr1, new ArrayList<Integer>(arr2.subList(mid2 + 1, arr2.size())), k - mid2 - 1);
        }
    }

    
    public static int findKth_Problem_0_9b1f73ab_1904_40ca_9fc5_bf359469c1f0(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        // Write your code here
        int i = 0;
        int j = 0;
        int count = 0;
        while (i < arr1.size() && j < arr2.size()) {
            if (arr1.get(i) < arr2.get(j)) {
                count++;
                if (count == k) {
                    return arr1.get(i);
                }
                i++;
            } else {
                count++;
                if (count == k) {
                    return arr2.get(j);
                }
                j++;
            }
        }
        while (i < arr1.size()) {
            count++;
            if (count == k) {
                return arr1.get(i);
            }
            i++;
        }
        while (j < arr2.size()) {
            count++;
            if (count == k) {
                return arr2.get(j);
            }
            j++;
        }
        return -1;
    }

    
    public static int findKth_Problem_1_9a2e175d_faaf_40da_8637_a786b87a597b(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get(k);
        }
        if (arr2.size() == 0) {
            return arr1.get(k);
        }
        if (k == 0) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int mid1 = Math.min(k/2, arr1.size() - 1);
        int mid2 = Math.min(k/2, arr2.size() - 1);
        if (arr1.get(mid1) < arr2.get(mid2)) {
            return findKth_Problem_1_9a2e175d_faaf_40da_8637_a786b87a597b(new ArrayList<Integer>(arr1.subList(mid1 + 1, arr1.size())), arr2, k - mid1 - 1);
        } else {
            return findKth_Problem_1_9a2e175d_faaf_40da_8637_a786b87a597b(arr1, new ArrayList<Integer>(arr2.subList(mid2 + 1, arr2.size())), k - mid2 - 1);
        }
    }

    
    public static int findKth_Problem_1_a7ef273f_8f7d_455b_b2f6_11cb9ef4a8f3(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get(k - 1);
        }
        if (arr2.size() == 0) {
            return arr1.get(k - 1);
        }
        if (k == 1) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int mid1 = arr1.get(Math.min(k / 2, arr1.size()) - 1);
        int mid2 = arr2.get(Math.min(k / 2, arr2.size()) - 1);
        if (mid1 < mid2) {
            return findKth_Problem_1_a7ef273f_8f7d_455b_b2f6_11cb9ef4a8f3(new ArrayList<Integer>(arr1.subList(Math.min(k / 2, arr1.size()), arr1.size())), arr2, k - Math.min(k / 2, arr1.size()));
        } else {
            return findKth_Problem_1_a7ef273f_8f7d_455b_b2f6_11cb9ef4a8f3(arr1, new ArrayList<Integer>(arr2.subList(Math.min(k / 2, arr2.size()), arr2.size())), k - Math.min(k / 2, arr2.size()));
        }
    }

    
    public static int findKth_Problem_0_51f89652_1826_422c_a27a_2ed5702048e6(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int n = arr1.size();
        int m = arr2.size();
        if (k > (n + m)) {
            return -1;
        }
        if (k == 1) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        if (n == 0) {
            return arr2.get( k - 1);
        }
        if (m == 0) {
            return arr1.get( k - 1);
        }
        int i =  Math.min(k / 2, n);
        int j =  Math.min(k / 2, m);
        if (arr1.get(i - 1) > arr2.get(j - 1)) {
            return findKth_Problem_0_51f89652_1826_422c_a27a_2ed5702048e6(arr1, new ArrayList<Integer>(arr2.subList(j, m)), k - j);
        } else {
            return findKth_Problem_0_51f89652_1826_422c_a27a_2ed5702048e6(new ArrayList<Integer>(arr1.subList(i, n)), arr2, k - i);
        }
    }

    
    public static int findKth_Problem_2_2c714dda_fbac_4579_a457_8d1d0f4c9d1e(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get(k);
        }
        if (arr2.size() == 0) {
            return arr1.get(k);
        }
        if (k == 0) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        if (arr1.size() == 1 && arr2.size() == 1) {
            return Math.max(arr1.get(0), arr2.get(0));
        }
        int mid1 = arr1.get(arr1.size() / 2);
        int mid2 = arr2.get(arr2.size() / 2);
        if (mid1 < mid2) {
            if (k <= arr1.size() / 2 + arr2.size() / 2) {
                return findKth_Problem_2_2c714dda_fbac_4579_a457_8d1d0f4c9d1e(new ArrayList<Integer>(arr1.subList(0, arr1.size() / 2)), arr2, k);
            } else {
                return findKth_Problem_2_2c714dda_fbac_4579_a457_8d1d0f4c9d1e(arr1, new ArrayList<Integer>(arr2.subList(arr2.size() / 2, arr2.size())), k - arr2.size() / 2);
            }
        } else {
            if (k <= arr1.size() / 2 + arr2.size() / 2) {
                return findKth_Problem_2_2c714dda_fbac_4579_a457_8d1d0f4c9d1e(arr1, new ArrayList<Integer>(arr2.subList(0, arr2.size() / 2)), k);
            } else {
                return findKth_Problem_2_2c714dda_fbac_4579_a457_8d1d0f4c9d1e(new ArrayList<Integer>(arr1.subList(arr1.size() / 2, arr1.size())), arr2, k - arr1.size() / 2);
            }
        }
    }

    
    public static int findKth_Problem_1_69da18ed_b330_4f12_89b1_0f672d3ac3a9(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int i = 0, j = arr2.size() - 1;
        while (i < j) {
            if (arr2.get(i) > arr2.get(j)) {
                int temp = arr1.get(i);
                arr1.set(i++, arr2.get(j));
                arr2.set(j--, temp);
            }
            else {
                i++;
            }
        }
        return arr1.get(j);
    }

    
    public static int findKth_Problem_0_e97b2b6b_e7f7_494e_82a1_b7f6178f2de9(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int result = -1;
        if(arr1==null || arr2==null || k==0)
            return result;
        if(k<arr1.size())
            k = arr1.size();
        else if(k>arr2.size())
            k = arr2.size();

        for(int i=0; i<arr1.size(); i++)
        {
            for(int j=i; j<arr1.size(); j++)
            {
                int temp1 = arr1.get(i);
                int temp2 = arr2.get(j);
                if(temp1<temp2)
                {
                    int temp = temp1;
                    temp1 = temp2;
                    temp2 = temp;
                }
                int difference = arr1.get(i)+arr2.get(j)-k;
                if(difference<0)
                {
                    difference = difference*-1;
                }
                if(result==-1)
                {
                    result = temp1;
                }
                else if(temp1>result)
                {
                    result = temp1;
                }
                else if(temp2>result)
                {
                    result = temp2;
                }
            }
        }
        return result;
    }

    
    public static int findKth_Problem_0_87aa317a_fe66_48f6_894b_870e7027546f(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int i = 0, j = 0;
        while (i < arr1.size() && j < arr2.size()) {
            if (arr1.get(i) < arr2.get(j)) {
                if (i + j + 1 == k) return arr1.get(i);
                i++;
            } else {
                if (i + j + 1 == k) return arr2.get(j);
                j++;
            }
        }
        if (i < arr1.size()) return arr1.get( (k - j - 1));
        else return arr2.get( (k - i - 1));
    }

    
    public static int findKth_Problem_0_57accfab_e274_4a9b_9eee_f62f07ab173f(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get(k - 1);
        }
        if (arr2.size() == 0) {
            return arr1.get(k - 1);
        }
        if (k == 1) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int k1 = Math.min(k / 2, arr1.size());
        int k2 = Math.min(k / 2, arr2.size());
        if (arr1.get(k1 - 1) < arr2.get(k2 - 1)) {
            return findKth_Problem_0_57accfab_e274_4a9b_9eee_f62f07ab173f(new ArrayList<Integer>(arr1.subList(k1, arr1.size())), arr2, k - k1);
        } else {
            return findKth_Problem_0_57accfab_e274_4a9b_9eee_f62f07ab173f(arr1, new ArrayList<Integer>(arr2.subList(k2, arr2.size())), k - k2);
        }
    }

    
    public static int findKth_Problem_1_974500d8_b718_475f_8173_7d41d6d516ae(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        // Write your code here
        return 0;
    }

    
    public static int findKth_Problem_2_6f313497_4df7_4ff0_ad55_bf394a57c16a(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int middleElement1 = arr1.get(arr1.size()/2);
        int middleElement2 = arr2.get(arr2.size()/2);
        if (k == 0) return 0;
        if (k == 1) return middleElement1;
        if (k > 1 && k <= arr1.size()) 
            return middleElement1 + (k-1) * findKth_Problem_2_6f313497_4df7_4ff0_ad55_bf394a57c16a(arr1, arr2, k/2);
        else 
            return findKth_Problem_2_6f313497_4df7_4ff0_ad55_bf394a57c16a(arr1, arr2, k/2);
    }

    
    public static int findKth_Problem_0_ec7a9aaf_7fdb_49a3_89bf_2918123c144b(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get(k);
        }
        if (arr2.size() == 0) {
            return arr1.get(k);
        }
        if (k == 0) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        if (arr1.size() > arr2.size()) {
            return findKth_Problem_0_ec7a9aaf_7fdb_49a3_89bf_2918123c144b(arr2, arr1, k);
        }
        int i = Math.min(arr1.size() - 1, k / 2);
        int j = Math.min(arr2.size() - 1, k / 2);
        if (arr1.get(i) > arr2.get(j)) {
            return findKth_Problem_0_ec7a9aaf_7fdb_49a3_89bf_2918123c144b(arr1, new ArrayList<Integer>(arr2.subList(j + 1, arr2.size())), k - j - 1);
        }
        else {
            return findKth_Problem_0_ec7a9aaf_7fdb_49a3_89bf_2918123c144b(new ArrayList<Integer>(arr1.subList(i + 1, arr1.size())), arr2, k - i - 1);
        }
    }

    
    public static int findKth_Problem_2_d181ce19_34ec_4785_9fee_23b31cce6d78(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int i = 0;
        int j = 0;
        while (k > 0) {
            if (i < arr1.size() && j < arr2.size()) {
                if (arr1.get( i) < arr2.get( j)) {
                    i++;
                } else {
                    j++;
                }
            } else if (i < arr1.size()) {
                i++;
            } else {
                j++;
            }
            k--;
        }
        if (i < arr1.size() && j < arr2.size()) {
            return Math.min(arr1.get( i), arr2.get( j));
        } else if (i < arr1.size()) {
            return arr1.get( i);
        } else {
            return arr2.get( j);
        }
    }

    
    public static int findKth_Problem_0_bb2ba83b_7b1f_4491_885e_3a2364276615(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        //Code Here
        if (arr1 == null || arr1.isEmpty() || arr2 == null || arr2.isEmpty()) {
            return 0;
        }
        int low = 0;
        int high = arr1.size();
        if (k <= high) {
            while (low <= high) {
                int mid = low + (high - low) / 2;
                if (mid == k) {
                    return arr1.get(mid);
                }
                else if (mid > k) {
                    low = mid + 1;
                }
                else {
                    high = mid - 1;
                }
            }
        }
        else {
            return 0;
        }
        return 0;
    }

    
    public static int findKth_Problem_2_65210f31_d970_436a_8b8e_633e1b6bf63e(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get(k);
        }
        if (arr2.size() == 0) {
            return arr1.get(k);
        }
        if (k == 0) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int mid1 = arr1.size() / 2;
        int mid2 = arr2.size() / 2;
        if (mid1 + mid2 < k) {
            if (arr1.get(mid1) > arr2.get(mid2)) {
                return findKth_Problem_2_65210f31_d970_436a_8b8e_633e1b6bf63e(arr1, new ArrayList<Integer>(arr2.subList(mid2 + 1, arr2.size())), k - mid2 - 1);
            } else {
                return findKth_Problem_2_65210f31_d970_436a_8b8e_633e1b6bf63e(new ArrayList<Integer>(arr1.subList(mid1 + 1, arr1.size())), arr2, k - mid1 - 1);
            }
        } else {
            if (arr1.get(mid1) > arr2.get(mid2)) {
                return findKth_Problem_2_65210f31_d970_436a_8b8e_633e1b6bf63e(new ArrayList<Integer>(arr1.subList(0, mid1)), arr2, k);
            } else {
                return findKth_Problem_2_65210f31_d970_436a_8b8e_633e1b6bf63e(arr1, new ArrayList<Integer>(arr2.subList(0, mid2)), k);
            }
        }
    }

    
    public static int findKth_Problem_2_25fe0547_3a3b_40e6_b8ee_6f57610960f7(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int i = 0;
        int j = 0;
        while (k > 0) {
            if (i >= arr1.size()) {
                j++;
            } else if (j >= arr2.size()) {
                i++;
            } else if (arr1.get(i) < arr2.get(j)) {
                i++;
            } else {
                j++;
            }
            k--;
        }
        if (i >= arr1.size()) {
            return arr2.get(j);
        } else if (j >= arr2.size()) {
            return arr1.get(i);
        } else {
            return Math.min(arr1.get(i), arr2.get(j));
        }
    }

    
    public static int findKth_Problem_1_b5f002e0_3d9f_4d96_99e6_0b31b7a74240(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        // Write your code here
        int i = 0;
        int j = 0;
        int count = 0;
        while (i < arr1.size() && j < arr2.size()) {
            if (arr1.get( i) < arr2.get( j)) {
                count++;
                if (count == k) {
                    return arr1.get( i);
                }
                i++;
            } else {
                count++;
                if (count == k) {
                    return arr2.get( j);
                }
                j++;
            }
        }
        while (i < arr1.size()) {
            count++;
            if (count == k) {
                return arr1.get( i);
            }
            i++;
        }
        while (j < arr2.size()) {
            count++;
            if (count == k) {
                return arr2.get( j);
            }
            j++;
        }
        return -1;
    }

    
    public static int findKth_Problem_1_76efe490_576a_421c_b5d4_27576741d7ea(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int n = arr1.size();
        int m = arr2.size();
        int i = 0;
        int j = 0;
        int count = 0;
        int ans = 0;
        while (i < n && j < m) {
            if (arr1.get(i) < arr2.get(j)) {
                ans = arr1.get(i);
                i++;
            } else {
                ans = arr2.get(j);
                j++;
            }
            count++;
            if (count == k) {
                return ans;
            }
        }
        while (i < n) {
            ans = arr1.get(i);
            i++;
            count++;
            if (count == k) {
                return ans;
            }
        }
        while (j < m) {
            ans = arr2.get(j);
            j++;
            count++;
            if (count == k) {
                return ans;
            }
        }
        return ans;
    }

    
    public static int findKth_Problem_0_bd209dbb_74bf_4a96_aec4_75c4e0c100c1(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int count = 0;
        int i = 0;
        int j = 0;
        while (i < arr1.size() && j < arr2.size()) {
            if (arr1.get(i) < arr2.get(j)) {
                i++;
            } else if (arr1.get(i) > arr2.get(j)) {
                j++;
            } else {
                count++;
                if (count == k) {
                    return arr1.get(i);
                }
                i++;
                j++;
            }
        }
        return -1;
    }

    
    public static int findKth_Problem_1_c55c845e_d816_421e_bb41_ce3f0d29f458(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get(k - 1);
        }
        if (arr2.size() == 0) {
            return arr1.get(k - 1);
        }
        if (k == 1) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int mid1 = arr1.size() >= k / 2 ? arr1.get(k / 2 - 1) : Integer.MAX_VALUE;
        int mid2 = arr2.size() >= k / 2 ? arr2.get(k / 2 - 1) : Integer.MAX_VALUE;
        if (mid1 < mid2) {
            return findKth_Problem_1_c55c845e_d816_421e_bb41_ce3f0d29f458(new ArrayList<Integer>(arr1.subList(k / 2, arr1.size())), arr2, k - k / 2);
        } else {
            return findKth_Problem_1_c55c845e_d816_421e_bb41_ce3f0d29f458(arr1, new ArrayList<Integer>(arr2.subList(k / 2, arr2.size())), k - k / 2);
        }
    }

    
    public static int findKth_Problem_1_65298a7d_fb35_4bf8_8728_dcc8fa602857(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int i = 0;
        int j = 0;
        int count = 0;
        while (i < arr1.size() && j < arr2.size()) {
            if (arr1.get(i) < arr2.get(j)) {
                if (count == k) {
                    return arr1.get(i);
                }
                i++;
            } else {
                if (count == k) {
                    return arr2.get(j);
                }
                j++;
            }
            count++;
        }
        while (i < arr1.size()) {
            if (count == k) {
                return arr1.get(i);
            }
            i++;
            count++;
        }
        while (j < arr2.size()) {
            if (count == k) {
                return arr2.get(j);
            }
            j++;
            count++;
        }
        return -1;
    }

    
    public static int findKth_Problem_1_cb099428_1c24_466a_9907_6677fd1cd20c(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (k <= 0) {
            return -1;
        }
        if (arr1.size() == 0) {
            return arr2.get(k - 1);
        }
        if (arr2.size() == 0) {
            return arr1.get(k - 1);
        }
        if (k == 1) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int mid1 = arr1.size() >= k / 2 ? arr1.get(k / 2 - 1) : Integer.MAX_VALUE;
        int mid2 = arr2.size() >= k / 2 ? arr2.get(k / 2 - 1) : Integer.MAX_VALUE;
        if (mid1 < mid2) {
            return findKth_Problem_1_cb099428_1c24_466a_9907_6677fd1cd20c(new ArrayList<Integer>(arr1.subList(k / 2, arr1.size())), arr2, k - k / 2);
        } else {
            return findKth_Problem_1_cb099428_1c24_466a_9907_6677fd1cd20c(arr1, new ArrayList<Integer>(arr2.subList(k / 2, arr2.size())), k - k / 2);
        }
    }

    
    public static int findKth_Problem_2_fd5eee6d_857a_4317_a63d_c14e6fb7464f(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (k > arr1.size() + arr2.size()) {
            return -1;
        }
        int i = 0;
        int j = 0;
        int count = 0;
        while (i < arr1.size() && j < arr2.size()) {
            if (arr1.get(i) < arr2.get(j)) {
                count++;
                if (count == k) {
                    return arr1.get(i);
                }
                i++;
            } else {
                count++;
                if (count == k) {
                    return arr2.get(j);
                }
                j++;
            }
        }
        while (i < arr1.size()) {
            count++;
            if (count == k) {
                return arr1.get(i);
            }
            i++;
        }
        while (j < arr2.size()) {
            count++;
            if (count == k) {
                return arr2.get(j);
            }
            j++;
        }
        return -1;
    }

    
    public static int findKth_Problem_2_a2e4e944_a916_40ab_b7cf_d6af2c5dea45(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int i = 0;
        int j = 0;
        while (k > 0) {
            if (i >= arr1.size()) {
                return arr2.get(j +  k - 1);
            }
            if (j >= arr2.size()) {
                return arr1.get(i +  k - 1);
            }
            if (arr1.get(i) < arr2.get(j)) {
                i++;
            } else {
                j++;
            }
            k--;
        }
        return Math.min(arr1.get(i), arr2.get(j));
    }

    
    public static int findKth_Problem_1_a9811eb7_5c85_4030_a378_98da5e9dba77(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int i = 0;
        int j = 0;
        while (k > 0) {
            if (i >= arr1.size()) {
                return arr2.get( (j + k - 1));
            }
            if (j >= arr2.size()) {
                return arr1.get( (i + k - 1));
            }
            if (arr1.get( i) < arr2.get( j)) {
                i++;
            } else {
                j++;
            }
            k--;
        }
        if (i >= arr1.size()) {
            return arr2.get( (j + k - 1));
        }
        if (j >= arr2.size()) {
            return arr1.get( (i + k - 1));
        }
        return Math.min(arr1.get( i), arr2.get( j));
    }

    
    public static int findKth_Problem_2_efdecb5a_3789_401f_adb0_1135f9c8ce83(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (k == 1) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int a = arr1.get( Math.min(k / 2, arr1.size()) - 1);
        int b = arr2.get( Math.min(k / 2, arr2.size()) - 1);
        if (a < b) {
            return findKth_Problem_2_efdecb5a_3789_401f_adb0_1135f9c8ce83(new ArrayList<Integer>(arr1.subList( Math.min(k / 2, arr1.size()), arr1.size())), arr2, k - Math.min(k / 2, arr1.size()));
        } else {
            return findKth_Problem_2_efdecb5a_3789_401f_adb0_1135f9c8ce83(arr1, new ArrayList<Integer>(arr2.subList( Math.min(k / 2, arr2.size()), arr2.size())), k - Math.min(k / 2, arr2.size()));
        }
    }

    
    public static int findKth_Problem_1_bf55a5f8_d525_445b_8a95_44f4b95934bd(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get( k);
        }
        if (arr2.size() == 0) {
            return arr1.get( k);
        }
        if (k == 0) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int mid1 = arr1.size() / 2;
        int mid2 = arr2.size() / 2;
        if (mid1 + mid2 < k) {
            if (arr1.get( mid1) > arr2.get( mid2)) {
                return findKth_Problem_1_bf55a5f8_d525_445b_8a95_44f4b95934bd(arr1, new ArrayList<Integer>(arr2.subList( mid2 + 1, arr2.size())), k - mid2 - 1);
            } else {
                return findKth_Problem_1_bf55a5f8_d525_445b_8a95_44f4b95934bd(new ArrayList<Integer>(arr1.subList( mid1 + 1, arr1.size())), arr2, k - mid1 - 1);
            }
        } else {
            if (arr1.get( mid1) > arr2.get( mid2)) {
                return findKth_Problem_1_bf55a5f8_d525_445b_8a95_44f4b95934bd(new ArrayList<Integer>(arr1.subList(0,  mid1)), arr2, k);
            } else {
                return findKth_Problem_1_bf55a5f8_d525_445b_8a95_44f4b95934bd(arr1, new ArrayList<Integer>(arr2.subList(0,  mid2)), k);
            }
        }
    }

    
    public static int findKth_Problem_1_390ef899_8fab_4147_9157_e64110efffe9(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        // Write your code here
        int i = 0;
        int j = 0;
        int count = 0;
        while (i < arr1.size() && j < arr2.size()) {
            if (arr1.get(i) < arr2.get(j)) {
                count++;
                if (count == k) {
                    return arr1.get(i);
                }
                i++;
            } else {
                count++;
                if (count == k) {
                    return arr2.get(j);
                }
                j++;
            }
        }
        while (i < arr1.size()) {
            count++;
            if (count == k) {
                return arr1.get(i);
            }
            i++;
        }
        while (j < arr2.size()) {
            count++;
            if (count == k) {
                return arr2.get(j);
            }
            j++;
        }
        return -1;
    }

    
    public static int findKth_Problem_1_3a0bc393_489c_46c0_b58b_963d2c6a2f0f(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get(k - 1);
        }
        if (arr2.size() == 0) {
            return arr1.get(k - 1);
        }
        if (k == 1) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        if (arr1.size() > arr2.size()) {
            return findKth_Problem_1_3a0bc393_489c_46c0_b58b_963d2c6a2f0f(arr2, arr1, k);
        }
        int i = Math.min(k / 2, arr1.size());
        int j = Math.min(k / 2, arr2.size());
        if (arr1.get(i - 1) < arr2.get(j - 1)) {
            return findKth_Problem_1_3a0bc393_489c_46c0_b58b_963d2c6a2f0f(new ArrayList<Integer>(arr1.subList(i, arr1.size())), arr2, k - i);
        } else {
            return findKth_Problem_1_3a0bc393_489c_46c0_b58b_963d2c6a2f0f(arr1, new ArrayList<Integer>(arr2.subList(j, arr2.size())), k - j);
        }
    }

    
    public static int findKth_Problem_2_03ca634e_d177_46d5_9d34_e6f28b5a3de2(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get(k);
        }
        if (arr2.size() == 0) {
            return arr1.get(k);
        }
        if (k == 0) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int mid1 = arr1.get(Math.min(k/2, arr1.size() - 1));
        int mid2 = arr2.get(Math.min(k/2, arr2.size() - 1));
        if (mid1 < mid2) {
            return findKth_Problem_2_03ca634e_d177_46d5_9d34_e6f28b5a3de2(new ArrayList<Integer>(arr1.subList(Math.min(k/2, arr1.size() - 1), arr1.size())), arr2, k - Math.min(k/2, arr1.size() - 1));
        } else {
            return findKth_Problem_2_03ca634e_d177_46d5_9d34_e6f28b5a3de2(arr1, new ArrayList<Integer>(arr2.subList(Math.min(k/2, arr2.size() - 1), arr2.size())), k - Math.min(k/2, arr2.size() - 1));
        }
    }

    
    public static int findKth_Problem_0_ef43bfc7_db2f_486e_afbc_f2e0333941ad(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get(k - 1);
        }
        if (arr2.size() == 0) {
            return arr1.get(k - 1);
        }
        if (k == 1) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int mid1 = arr1.size() >= k / 2 ? arr1.get(k / 2 - 1) : Integer.MAX_VALUE;
        int mid2 = arr2.size() >= k / 2 ? arr2.get(k / 2 - 1) : Integer.MAX_VALUE;
        if (mid1 < mid2) {
            return findKth_Problem_0_ef43bfc7_db2f_486e_afbc_f2e0333941ad(new ArrayList<Integer>(arr1.subList(k / 2, arr1.size())), arr2, k - k / 2);
        } else {
            return findKth_Problem_0_ef43bfc7_db2f_486e_afbc_f2e0333941ad(arr1, new ArrayList<Integer>(arr2.subList(k / 2, arr2.size())), k - k / 2);
        }
    }

    
    public static int findKth_Problem_2_80703a9d_a1a3_4645_9949_527b72ced8fa(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int count = 0;
        int i = 0;
        int j = 0;
        while (count < k) {
            if (arr1.get(i) < arr2.get(j)) {
                i++;
            } else if (arr1.get(i) > arr2.get(j)) {
                j++;
            } else {
                count++;
                i++;
                j++;
            }
        }
        return arr1.get(i);
    }

    
    public static int findKth_Problem_0_9b269922_6b6f_418e_a27b_0a805e4d6645(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (k > arr1.size() + arr2.size()) {
            return -1;
        }
        if (arr1.size() == 0) {
            return arr2.get(k - 1);
        }
        if (arr2.size() == 0) {
            return arr1.get(k - 1);
        }
        if (k == 1) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int a = arr1.get(0);
        int b = arr2.get(0);
        if (a < b) {
            arr1.remove(0);
        } else {
            arr2.remove(0);
        }
        return findKth_Problem_0_9b269922_6b6f_418e_a27b_0a805e4d6645(arr1, arr2, k - 1);
    }

    
    public static int findKth_Problem_2_1c443cd2_9aa6_4564_a069_df2c6d26bc52(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int n = arr1.size();
        int m = arr2.size();
        if (k > n + m) {
            return -1;
        }
        if (n == 0) {
            return arr2.get( k - 1);
        }
        if (m == 0) {
            return arr1.get( k - 1);
        }
        if (k == 1) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int i = Math.min(n,  k / 2);
        int j = Math.min(m,  k / 2);
        if (arr1.get(i - 1) > arr2.get(j - 1)) {
            return findKth_Problem_2_1c443cd2_9aa6_4564_a069_df2c6d26bc52(arr1, new ArrayList<Integer>(arr2.subList(j, m)), k - j);
        } else {
            return findKth_Problem_2_1c443cd2_9aa6_4564_a069_df2c6d26bc52(new ArrayList<Integer>(arr1.subList(i, n)), arr2, k - i);
        }
    }

    
    public static int findKth_Problem_0_a0e753e2_f1ad_442f_816f_37e70c5566dc(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if(arr1.isEmpty()) return -1;
        if(arr2.isEmpty()) return -1;
        int l1 = arr1.get(0), l2 = arr2.get(0);
        int curr = l1-l2;
        int prevVal;
        while(k > curr) {
            prevVal = arr1.get(arr1.size()-1);
            arr1.remove(prevVal);
            arr2.remove(prevVal);
            curr -= prevVal;
            k -= prevVal;
        }
        return arr2.get(arr2.size()-1);
    }

    
    public static int findKth_Problem_1_4e47c23d_4351_4d6e_975e_c02d28c05784(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int n = arr1.size();
        int m = arr2.size();
        if (k > (n + m)) {
            return -1;
        }
        if (n == 0) {
            return arr2.get( k - 1);
        }
        if (m == 0) {
            return arr1.get( k - 1);
        }
        if (k == 1) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int i = Math.min(n, k / 2);
        int j = Math.min(m, k / 2);
        if (arr1.get( i - 1) > arr2.get( j - 1)) {
            return findKth_Problem_1_4e47c23d_4351_4d6e_975e_c02d28c05784(arr1, new ArrayList<Integer>(arr2.subList( j,  m)), k - j);
        } else {
            return findKth_Problem_1_4e47c23d_4351_4d6e_975e_c02d28c05784(new ArrayList<Integer>(arr1.subList( i,  n)), arr2, k - i);
        }
    }

    
    public static int findKth_Problem_2_2431c364_9afd_4967_bb24_eec16df905b9(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        // Write - Your - Code
        int i = 0;
        int j = 0;
        int kth = 0;
        while (i < arr1.size() && j < arr2.size()) {
            if (arr1.get(i) < arr2.get(j)) {
                kth = arr1.get(i);
                i++;
            } else {
                kth = arr2.get(j);
                j++;
            }
            if (k == 1) {
                return kth;
            }
            k--;
        }
        while (i < arr1.size()) {
            kth = arr1.get(i);
            i++;
            if (k == 1) {
                return kth;
            }
            k--;
        }
        while (j < arr2.size()) {
            kth = arr2.get(j);
            j++;
            if (k == 1) {
                return kth;
            }
            k--;
        }
        return kth;
    }

    
    public static int findKth_Problem_0_c067569b_38cf_426a_bb0d_434086d63198(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        // Write your code here
        int n = arr1.size();
        int m = arr2.size();
        int i = 0;
        int j = 0;
        int count = 0;
        while (i < n && j < m) {
            if (arr1.get(i) < arr2.get(j)) {
                if (count == k - 1) {
                    return arr1.get(i);
                }
                i++;
                count++;
            } else {
                if (count == k - 1) {
                    return arr2.get(j);
                }
                j++;
                count++;
            }
        }
        while (i < n) {
            if (count == k - 1) {
                return arr1.get(i);
            }
            i++;
            count++;
        }
        while (j < m) {
            if (count == k - 1) {
                return arr2.get(j);
            }
            j++;
            count++;
        }
        return -1;
    }

    
    public static int findKth_Problem_0_ad3d5de1_1e45_476f_bc87_bfc5aa822f3e(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int firstVal = arr1.get(0), secondVal = arr2.get(0), thirdVal = 0, fourthVal = 0;
        int currentVal = 0;
        while (k >= 1) {
            currentVal = firstVal + secondVal;
            if (currentVal > arr1.get(arr1.size() - 1)) {
                currentVal = arr1.get(arr1.size() - 1);
            }
            firstVal = currentVal;
            currentVal = thirdVal + fourthVal;
            if (currentVal > arr2.get(arr2.size() - 1)) {
                currentVal = arr2.get(arr2.size() - 1);
            }
            secondVal = currentVal;
            thirdVal = currentVal - firstVal;
            if (thirdVal > arr1.get(arr1.size() - 1)) {
                thirdVal = arr1.get(arr1.size() - 1);
            }
            fourthVal = currentVal - secondVal;
            if (fourthVal > arr2.get(arr2.size() - 1)) {
                fourthVal = arr2.get(arr2.size() - 1);
            }
            k--;
        }
        return currentVal;
    }

    
    public static int findKth_Problem_0_aaa83284_40ad_4408_8106_9c4451a5753f(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int i = 0, j = 0;
        int ans = 0;
        while (k > 0) {
            if (i < arr1.size() && j < arr2.size()) {
                if (arr1.get(i) < arr2.get(j)) {
                    ans = arr1.get(i);
                    i++;
                } else {
                    ans = arr2.get(j);
                    j++;
                }
            } else if (i < arr1.size()) {
                ans = arr1.get(i);
                i++;
            } else {
                ans = arr2.get(j);
                j++;
            }
            k--;
        }
        return ans;
    }

    
    public static int findKth_Problem_1_e8fcef0d_b2b0_49ef_b883_b975fa5067f9(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int result = 0;
        int i = 0;
        int firstArr1 = arr1.get(0);
        int firstArr2 = arr2.get(0);
        while (i < k) {
            if (firstArr1 < firstArr2)
                result = firstArr1;
            else
                result = firstArr2;
            i++;
            firstArr1 = arr1.get(i);
            firstArr2 = arr2.get(i);
        }
        return result;
    }

    
    public static int findKth_Problem_0_641476ec_1b4b_48e7_a502_1cbfcbec3ab9(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        // Write your code here.
        int i = 0;
        int j = 0;
        int count = 0;
        while (i < arr1.size() && j < arr2.size()) {
            if (arr1.get(i) < arr2.get(j)) {
                count++;
                if (count == k) {
                    return arr1.get(i);
                }
                i++;
            } else {
                count++;
                if (count == k) {
                    return arr2.get(j);
                }
                j++;
            }
        }
        while (i < arr1.size()) {
            count++;
            if (count == k) {
                return arr1.get(i);
            }
            i++;
        }
        while (j < arr2.size()) {
            count++;
            if (count == k) {
                return arr2.get(j);
            }
            j++;
        }
        return -1;
    }

    
    public static int findKth_Problem_0_fda6408e_da5d_43d2_bb20_c7e587d09a06(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if(k == 0 || k > arr1.size()) {
            throw new IllegalArgumentException("Invalid value for k");
        }
        if(k > arr2.size()) {
            throw new IllegalArgumentException("Invalid value for k");
        }
        if(arr1 == null || arr2 == null || arr1.size() == 0 || arr2.size() == 0) {
            throw new IllegalArgumentException("Array lists are empty");
        }

        int lower = Math.min(arr1.get(0), arr2.get(0));
        int upper = Math.max(arr1.get(arr1.size()-1), arr2.get(arr2.size()-1));
        int middle = (lower + upper) / 2;
        int i = 0;
        while(i == 0 && k < arr1.size()) {
            if(arr1.get(i) == middle || arr2.get(i) == middle) {
                k++;
            }
            else {
                i++;
            }
        }
        while(i < arr1.size() && k == arr1.size()) {
            if(arr1.get(i) == middle) {
                k++;
            }
            else {
                i++;
            }
        }
        while(i < arr2.size() && k == arr2.size()) {
            if(arr2.get(i) == middle) {
                k++;
            }
            else {
                i++;
            }
        }
        if(k > arr1.size()) {
            k = arr1.size();
        }
        if(k > arr2.size()) {
            k = arr2.size();
        }
        return middle;
    }

    
    public static int findKth_Problem_1_fa193b2c_f92f_4328_909e_7a4faa14b232(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int i = 0, j = 0;
        int n = arr1.size(), m = arr2.size();
        while (i < n && j < m) {
            if (arr1.get(i) < arr2.get(j)) {
                if (k == 1) {
                    return arr1.get(i);
                }
                i++;
                k--;
            } else {
                if (k == 1) {
                    return arr2.get(j);
                }
                j++;
                k--;
            }
        }
        while (i < n) {
            if (k == 1) {
                return arr1.get(i);
            }
            i++;
            k--;
        }
        while (j < m) {
            if (k == 1) {
                return arr2.get(j);
            }
            j++;
            k--;
        }
        return -1;
    }

    
    public static int findKth_Problem_2_c15ab229_3d29_4f5c_8ac6_efe372cd2a41(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get(k);
        }
        if (arr2.size() == 0) {
            return arr1.get(k);
        }
        if (k == 0) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        if (arr1.size() == 1 && arr2.size() == 1) {
            return Math.max(arr1.get(0), arr2.get(0));
        }
        int mid1 = arr1.size() / 2;
        int mid2 = arr2.size() / 2;
        if (mid1 + mid2 < k) {
            if (arr1.get(mid1) > arr2.get(mid2)) {
                arr2 = new ArrayList<Integer>(arr2.subList(mid2 + 1, arr2.size()));
                return findKth_Problem_2_c15ab229_3d29_4f5c_8ac6_efe372cd2a41(arr1, arr2, k - mid2 - 1);
            } else {
                arr1 = new ArrayList<Integer>(arr1.subList(mid1 + 1, arr1.size()));
                return findKth_Problem_2_c15ab229_3d29_4f5c_8ac6_efe372cd2a41(arr1, arr2, k - mid1 - 1);
            }
        } else {
            if (arr1.get(mid1) > arr2.get(mid2)) {
                arr1 = new ArrayList<Integer>(arr1.subList(0, mid1));
                return findKth_Problem_2_c15ab229_3d29_4f5c_8ac6_efe372cd2a41(arr1, arr2, k);
            } else {
                arr2 = new ArrayList<Integer>(arr2.subList(0, mid2));
                return findKth_Problem_2_c15ab229_3d29_4f5c_8ac6_efe372cd2a41(arr1, arr2, k);
            }
        }
    }

    
    public static int findKth_Problem_1_aa7981d8_ef18_4579_aef8_a2e11a60cc38(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int n = arr1.size();
        int m = arr2.size();
        if (k > n + m) {
            return -1;
        }
        if (k == 1) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int i = Math.min(k / 2, n);
        int j = Math.min(k / 2, m);
        if (arr1.get( i - 1) > arr2.get( j - 1)) {
            return findKth_Problem_1_aa7981d8_ef18_4579_aef8_a2e11a60cc38(arr1, new ArrayList<Integer>(arr2.subList( j,  m)), k - j);
        } else {
            return findKth_Problem_1_aa7981d8_ef18_4579_aef8_a2e11a60cc38(new ArrayList<Integer>(arr1.subList( i,  n)), arr2, k - i);
        }
    }

    
    public static int findKth_Problem_1_f2dd8c40_9cdf_4f2b_9bac_c614e4e4ccb0(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int i = 0;
        int j = 0;
        while (k > 0) {
            if (i == arr1.size()) {
                j++;
            } else if (j == arr2.size()) {
                i++;
            } else if (arr1.get(i) < arr2.get(j)) {
                i++;
            } else {
                j++;
            }
            k--;
        }
        if (i == arr1.size()) {
            return arr2.get(j);
        } else if (j == arr2.size()) {
            return arr1.get(i);
        } else {
            return Math.min(arr1.get(i), arr2.get(j));
        }
    }

    
    public static int findKth_Problem_0_bf55a5f8_d525_445b_8a95_44f4b95934bd(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get( k);
        }
        if (arr2.size() == 0) {
            return arr1.get( k);
        }
        if (k == 0) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int mid1 = arr1.size() / 2;
        int mid2 = arr2.size() / 2;
        if (mid1 + mid2 < k) {
            if (arr1.get( mid1) > arr2.get( mid2)) {
                return findKth_Problem_0_bf55a5f8_d525_445b_8a95_44f4b95934bd(arr1, new ArrayList<Integer>(arr2.subList( mid2 + 1, arr2.size())), k - mid2 - 1);
            } else {
                return findKth_Problem_0_bf55a5f8_d525_445b_8a95_44f4b95934bd(new ArrayList<Integer>(arr1.subList( mid1 + 1, arr1.size())), arr2, k - mid1 - 1);
            }
        } else {
            if (arr1.get( mid1) > arr2.get( mid2)) {
                return findKth_Problem_0_bf55a5f8_d525_445b_8a95_44f4b95934bd(new ArrayList<Integer>(arr1.subList(0,  mid1)), arr2, k);
            } else {
                return findKth_Problem_0_bf55a5f8_d525_445b_8a95_44f4b95934bd(arr1, new ArrayList<Integer>(arr2.subList(0,  mid2)), k);
            }
        }
    }

    
    public static int findKth_Problem_0_e5fe3832_65b1_4a26_b630_81f4b0e701b4(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (k > arr1.size() + arr2.size()) {
            return -1;
        }
        if (arr1.size() == 0) {
            return arr2.get(k - 1);
        }
        if (arr2.size() == 0) {
            return arr1.get(k - 1);
        }
        if (k == 1) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int mid1 = Math.min(k / 2, arr1.size());
        int mid2 = Math.min(k / 2, arr2.size());
        if (arr1.get(mid1 - 1) < arr2.get(mid2 - 1)) {
            return findKth_Problem_0_e5fe3832_65b1_4a26_b630_81f4b0e701b4(new ArrayList<Integer>(arr1.subList(mid1, arr1.size())), arr2, k - mid1);
        } else {
            return findKth_Problem_0_e5fe3832_65b1_4a26_b630_81f4b0e701b4(arr1, new ArrayList<Integer>(arr2.subList(mid2, arr2.size())), k - mid2);
        }
    }

    
    public static int findKth_Problem_2_d4669cc5_5116_4be4_958f_8d5698f55d9e(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int n = arr1.size();
        int m = arr2.size();
        if (k > (n + m)) {
            return -1;
        }
        if (k == 1) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int i = Math.min(n,  k / 2);
        int j = Math.min(m,  k / 2);
        if (arr1.get(i - 1) > arr2.get(j - 1)) {
            ArrayList<Integer> new_arr = new ArrayList<Integer>(arr2.subList(j, m));
            return findKth_Problem_2_d4669cc5_5116_4be4_958f_8d5698f55d9e(arr1, new_arr, k - j);
        } else {
            ArrayList<Integer> new_arr = new ArrayList<Integer>(arr1.subList(i, n));
            return findKth_Problem_2_d4669cc5_5116_4be4_958f_8d5698f55d9e(new_arr, arr2, k - i);
        }
    }

    
    public static int findKth_Problem_1_0011f485_8be0_4ada_9b11_c907e18c9b11(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (k == 0) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        if (k == 1) {
            return Math.max(arr1.get(0), arr2.get(0));
        }
        if (arr1.size() == 0) {
            return arr2.get(k - 1);
        }
        if (arr2.size() == 0) {
            return arr1.get(k - 1);
        }
        if (arr1.get(0) < arr2.get(0)) {
            arr1.remove(0);
            return findKth_Problem_1_0011f485_8be0_4ada_9b11_c907e18c9b11(arr1, arr2, k - 1);
        } else {
            arr2.remove(0);
            return findKth_Problem_1_0011f485_8be0_4ada_9b11_c907e18c9b11(arr1, arr2, k - 1);
        }
    }

    
    public static int findKth_Problem_2_1be5851c_2a18_4a85_a8da_522865976ead(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get(k);
        }
        if (arr2.size() == 0) {
            return arr1.get(k);
        }
        if (k == 0) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int mid1 = arr1.get(Math.min(k/2, arr1.size()-1));
        int mid2 = arr2.get(Math.min(k/2, arr2.size()-1));
        if (mid1 < mid2) {
            return findKth_Problem_2_1be5851c_2a18_4a85_a8da_522865976ead(new ArrayList<Integer>(arr1.subList(Math.min(k/2, arr1.size()-1), arr1.size())), arr2, k - Math.min(k/2, arr1.size()-1));
        } else {
            return findKth_Problem_2_1be5851c_2a18_4a85_a8da_522865976ead(arr1, new ArrayList<Integer>(arr2.subList(Math.min(k/2, arr2.size()-1), arr2.size())), k - Math.min(k/2, arr2.size()-1));
        }
    }

    
    public static int findKth_Problem_1_3d7c0156_bfbb_4bb4_8a0b_642610e02f90(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int count = 0;
        int i = 0;
        int j = 0;
        while (i < arr1.size() && j < arr2.size()) {
            if (arr1.get(i) < arr2.get(j)) {
                i++;
            } else if (arr1.get(i) > arr2.get(j)) {
                j++;
            } else {
                count++;
                if (count == k) {
                    return arr1.get(i);
                }
                i++;
                j++;
            }
        }
        return -1;
    }

    
    public static int findKth_Problem_2_c6218613_4064_41c3_92ac_506de1acfa12(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int count = 0;
        int i = 0;
        int j = 0;
        int size = arr1.size();
        while (i < size && j < size) {
            if (arr1.get(i) < arr2.get(j)) {
                i++;
            } else if (arr1.get(i) > arr2.get(j)) {
                j++;
            } else {
                count++;
                if (count == k) {
                    return arr1.get(i);
                }
                i++;
                j++;
            }
        }
        return -1;
    }

    
    public static int findKth_Problem_0_3efb9273_9981_4d1b_8aff_fabc0283cc54(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) return arr2.get(k);
        if (arr2.size() == 0) return arr1.get(k);
        if (k == 0) return Math.min(arr1.get(0), arr2.get(0));
        if (k == arr1.size() + arr2.size() - 1) return Math.max(arr1.get(arr1.size() - 1), arr2.get(arr2.size() - 1));
        int mid1 = arr1.get((k / 2));
        int mid2 = arr2.get((k / 2));
        if (mid1 < mid2) {
            return findKth_Problem_0_3efb9273_9981_4d1b_8aff_fabc0283cc54(new ArrayList<Integer>(arr1.subList((k / 2) + 1, arr1.size())), arr2, k - (k / 2) - 1);
        } else {
            return findKth_Problem_0_3efb9273_9981_4d1b_8aff_fabc0283cc54(arr1, new ArrayList<Integer>(arr2.subList((k / 2) + 1, arr2.size())), k - (k / 2) - 1);
        }
    }

    
    public static int findKth_Problem_0_e8fcef0d_b2b0_49ef_b883_b975fa5067f9(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int result = 0;
        int i = 0;
        int firstArr1 = arr1.get(0);
        int firstArr2 = arr2.get(0);
        while (i < k) {
            if (firstArr1 < firstArr2)
                result = firstArr1;
            else
                result = firstArr2;
            i++;
            firstArr1 = arr1.get(i);
            firstArr2 = arr2.get(i);
        }
        return result;
    }

    
    public static int findKth_Problem_0_ac131d76_198d_468c_8557_7dfe2a27f293(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int ans = 0;
        int min = arr1.get(0), max = arr1.get(arr1.size()-1);
        int size1 = arr1.size();
        int size2 = arr2.size();
        while (ans < k) {
            if (min == max) {
                ans += 1;
                min += 1;
            }
            else {
                int mid = (min + max)/2;
                if (k - mid == 0)
                    ans = mid - 1;
                else if (k - mid < 0)
                    ans = mid + 1;
                else
                    ans = findKth_Problem_0_ac131d76_198d_468c_8557_7dfe2a27f293(arr1, arr2, k - mid);
            }
            min = arr1.get(size1 - 1);
            max = arr1.get(0);
        }
        return ans;
    }

    
    public static int findKth_Problem_1_195bcf66_4f40_4663_b57c_35c8980a49e2(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() <= 1 && arr2.size() <= 1) {
            return -1;
        }
        int low = arr1.get(0);
        int high = arr2.get(0);
        int mid = (low + high) / 2;
        int prev = 0;
        int next = 0;
        for (int i = 1; i < arr1.size(); i++) {
            if (mid >= arr1.get(i) && mid <= arr2.get(i)) {
                return mid;
            }
            else if (mid >= arr1.get(i)) {
                prev = mid;
                mid = (mid + arr2.get(i)) / 2;
            }
            else {
                next = mid + arr1.get(i);
            }
        }
        if (prev + 1 == next) {
            return prev;
        }
        int mid2 = (prev + next) / 2;
        return mid2;
    }

    
    public static int findKth_Problem_1_e30523bd_30ce_4688_aeee_9560f38da224(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) return arr2.get(k);
        if (arr2.size() == 0) return arr1.get(k);
        if (k == 0) return Math.min(arr1.get(0), arr2.get(0));
        int i = Math.min(arr1.size() - 1, k / 2);
        int j = Math.min(arr2.size() - 1, k / 2);
        if (arr1.get(i) > arr2.get(j)) {
            return findKth_Problem_1_e30523bd_30ce_4688_aeee_9560f38da224(arr1, new ArrayList<Integer>(arr2.subList(j + 1, arr2.size())), k - j - 1);
        } else {
            return findKth_Problem_1_e30523bd_30ce_4688_aeee_9560f38da224(new ArrayList<Integer>(arr1.subList(i + 1, arr1.size())), arr2, k - i - 1);
        }
    }

    
    public static int findKth_Problem_2_1d8ddbf2_e711_45de_9f23_d24023c1bf9d(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get(k - 1);
        }
        if (arr2.size() == 0) {
            return arr1.get(k - 1);
        }
        if (k == 1) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        if (arr1.size() == 1 && arr2.size() == 1) {
            return Math.max(arr1.get(0), arr2.get(0));
        }
        int mid1 = arr1.size() / 2;
        int mid2 = arr2.size() / 2;
        if (arr1.get(mid1) <= arr2.get(mid2)) {
            if (k <= mid1 + mid2 + 1) {
                return findKth_Problem_2_1d8ddbf2_e711_45de_9f23_d24023c1bf9d(new ArrayList<Integer>(arr1.subList(0, mid1)), arr2, k);
            } else {
                return findKth_Problem_2_1d8ddbf2_e711_45de_9f23_d24023c1bf9d(arr1, new ArrayList<Integer>(arr2.subList(mid2 + 1, arr2.size())), k - mid2 - 1);
            }
        } else {
            if (k <= mid1 + mid2 + 1) {
                return findKth_Problem_2_1d8ddbf2_e711_45de_9f23_d24023c1bf9d(arr1, new ArrayList<Integer>(arr2.subList(0, mid2)), k);
            } else {
                return findKth_Problem_2_1d8ddbf2_e711_45de_9f23_d24023c1bf9d(new ArrayList<Integer>(arr1.subList(mid1 + 1, arr1.size())), arr2, k - mid1 - 1);
            }
        }
    }

    
    public static int findKth_Problem_1_b41755da_db68_4eb2_afde_5e8174db2ce8(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int count = 0;
        int i = 0;
        int j = 0;
        while (i < arr1.size() && j < arr2.size()) {
            if (arr1.get(i) < arr2.get(j)) {
                i++;
            } else if (arr1.get(i) > arr2.get(j)) {
                j++;
            } else {
                count++;
                if (count == k) {
                    return arr1.get(i);
                }
                i++;
                j++;
            }
        }
        return -1;
    }

    
    public static int findKth_Problem_2_f1cd36f9_1c4c_4f47_bc5e_430399abd47e(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int i = 0;
        int j = 0;
        int count = 0;
        while (i < arr1.size() && j < arr2.size()) {
            if (arr1.get(i) < arr2.get(j)) {
                if (count == k) {
                    return arr1.get(i);
                }
                i++;
                count++;
            } else {
                if (count == k) {
                    return arr2.get(j);
                }
                j++;
                count++;
            }
        }
        while (i < arr1.size()) {
            if (count == k) {
                return arr1.get(i);
            }
            i++;
            count++;
        }
        while (j < arr2.size()) {
            if (count == k) {
                return arr2.get(j);
            }
            j++;
            count++;
        }
        return -1;
    }

    
    public static int findKth_Problem_2_e9061600_9b5b_4e13_b18c_36abec9e8f59(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if(k == 0)
            return -1;
        // Find the middle index
        int mid = (arr1.size()+arr2.size())/2;
        if(arr1.size() > arr2.size())
            return findKth_Problem_2_e9061600_9b5b_4e13_b18c_36abec9e8f59(arr1, arr2, k-1);
        else
            return findKth_Problem_2_e9061600_9b5b_4e13_b18c_36abec9e8f59(arr2, arr1, k-1);
    }

    
    public static int findKth_Problem_0_4a09308c_8f41_4f3d_a0c2_a9626a8b2e21(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int low = arr1.get(0); // initialize low to first element of first array
        int high = arr2.get(arr2.size()-1); // initialize high to last element of second array
        int mid = (low+high)/2;
        int count = 0;
        while(low<=high) {
            count++;
            if(count==k) {
                return mid;
            }
            if(count>k) {
                low = mid+1;
            }
            else {
                high = mid-1;
            }
            mid = (low+high)/2;
        }
        return -1;
    }

    
    public static int findKth_Problem_1_28a1eada_e86d_4ed1_8fac_244534784fca(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int i = 0;
        int j = 0;
        int count = 0;
        while (i < arr1.size() && j < arr2.size()) {
            if (arr1.get(i) < arr2.get(j)) {
                count++;
                if (count == k) {
                    return arr1.get(i);
                }
                i++;
            } else {
                count++;
                if (count == k) {
                    return arr2.get(j);
                }
                j++;
            }
        }
        while (i < arr1.size()) {
            count++;
            if (count == k) {
                return arr1.get(i);
            }
            i++;
        }
        while (j < arr2.size()) {
            count++;
            if (count == k) {
                return arr2.get(j);
            }
            j++;
        }
        return -1;
    }

    
    public static int findKth_Problem_2_39ee3e07_9f71_4249_a0fd_99a8d24ef171(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int i = 0;
        int j = 0;
        while (i < arr1.size() && j < arr2.size()) {
            if (arr1.get( i) < arr2.get( j)) {
                if (k == 1) {
                    return arr1.get( i);
                }
                i++;
                k--;
            } else {
                if (k == 1) {
                    return arr2.get( j);
                }
                j++;
                k--;
            }
        }
        if (i == arr1.size()) {
            return arr2.get( (j + k - 1));
        } else {
            return arr1.get( (i + k - 1));
        }
    }

    
    public static int findKth_Problem_1_7ebb8b0c_1628_4ab0_bf29_edc57704e9c8(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int i = 0;
        int j = 0;
        int count = 0;
        int last = 0;
        while (i < arr1.size() && j < arr2.size()) {
            if (arr1.get(i) < arr2.get(j)) {
                last = arr1.get(i);
                i++;
            } else {
                last = arr2.get(j);
                j++;
            }
            count++;
            if (count == k) {
                break;
            }
        }
        if (i == arr1.size()) {
            while (j < arr2.size()) {
                last = arr2.get(j);
                j++;
                count++;
                if (count == k) {
                    break;
                }
            }
        }
        if (j == arr2.size()) {
            while (i < arr1.size()) {
                last = arr1.get(i);
                i++;
                count++;
                if (count == k) {
                    break;
                }
            }
        }
        return last;
    }

    
    public static int findKth_Problem_1_f288f55c_1332_45a7_8ace_dc1605bcd6d9(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get(k);
        }
        if (arr2.size() == 0) {
            return arr1.get(k);
        }
        if (k == 0) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        if (arr1.size() == 1 && arr2.size() == 1) {
            return Math.max(arr1.get(0), arr2.get(0));
        }
        int mid1 = arr1.get(arr1.size()/2);
        int mid2 = arr2.get(arr2.size()/2);
        if (mid1 < mid2) {
            if (k <= arr1.size()/2 + arr2.size()/2) {
                return findKth_Problem_1_f288f55c_1332_45a7_8ace_dc1605bcd6d9(new ArrayList<Integer>(arr1.subList(0, arr1.size()/2)), arr2, k);
            } else {
                return findKth_Problem_1_f288f55c_1332_45a7_8ace_dc1605bcd6d9(arr1, new ArrayList<Integer>(arr2.subList(arr2.size()/2, arr2.size())), k - arr2.size()/2);
            }
        } else {
            if (k <= arr1.size()/2 + arr2.size()/2) {
                return findKth_Problem_1_f288f55c_1332_45a7_8ace_dc1605bcd6d9(arr1, new ArrayList<Integer>(arr2.subList(0, arr2.size()/2)), k);
            } else {
                return findKth_Problem_1_f288f55c_1332_45a7_8ace_dc1605bcd6d9(new ArrayList<Integer>(arr1.subList(arr1.size()/2, arr1.size())), arr2, k - arr1.size()/2);
            }
        }
    }

    
    public static int findKth_Problem_2_4cbff54e_b122_4bc3_a2c6_807a0cba9bcd(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get(k);
        }
        if (arr2.size() == 0) {
            return arr1.get(k);
        }
        if (k == 0) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        if (arr1.size() == 1 && arr2.size() == 1) {
            return Math.max(arr1.get(0), arr2.get(0));
        }
        int mid1 = arr1.size() / 2;
        int mid2 = arr2.size() / 2;
        if (mid1 + mid2 < k) {
            if (arr1.get(mid1) > arr2.get(mid2)) {
                return findKth_Problem_2_4cbff54e_b122_4bc3_a2c6_807a0cba9bcd(arr1, new ArrayList<Integer>(arr2.subList(mid2 + 1, arr2.size())), k - mid2 - 1);
            } else {
                return findKth_Problem_2_4cbff54e_b122_4bc3_a2c6_807a0cba9bcd(new ArrayList<Integer>(arr1.subList(mid1 + 1, arr1.size())), arr2, k - mid1 - 1);
            }
        } else {
            if (arr1.get(mid1) > arr2.get(mid2)) {
                return findKth_Problem_2_4cbff54e_b122_4bc3_a2c6_807a0cba9bcd(new ArrayList<Integer>(arr1.subList(0, mid1)), arr2, k);
            } else {
                return findKth_Problem_2_4cbff54e_b122_4bc3_a2c6_807a0cba9bcd(arr1, new ArrayList<Integer>(arr2.subList(0, mid2)), k);
            }
        }
    }

    
    public static int findKth_Problem_0_3986b35d_864c_4ae3_a2ef_d56fcb34cbea(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        // Write your code here
        // Return the kth element from the two sorted arrays arr1 and arr2.
        // arr1 and arr2 can have different sizes.
        // k starts from 1.
        // If k is larger than the combined size of the two arrays, return -1.
        if (k > arr1.size() + arr2.size()) {
            return -1;
        }
        int i = 0;
        int j = 0;
        int kth = 0;
        while (i < arr1.size() && j < arr2.size()) {
            if (arr1.get(i) < arr2.get(j)) {
                kth = arr1.get(i);
                i++;
            } else {
                kth = arr2.get(j);
                j++;
            }
            k--;
            if (k == 0) {
                return kth;
            }
        }
        while (i < arr1.size()) {
            kth = arr1.get(i);
            i++;
            k--;
            if (k == 0) {
                return kth;
            }
        }
        while (j < arr2.size()) {
            kth = arr2.get(j);
            j++;
            k--;
            if (k == 0) {
                return kth;
            }
        }
        return kth;
    }

    
    public static int findKth_Problem_0_09578403_42cc_4708_abc7_8a18272c644a(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        // Write your code here
        return 0;
    }

    
    public static int findKth_Problem_0_c1fe38b7_7e78_4364_9dda_16c243919f55(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int i = 0, j = 0;
        while (i < arr1.size() && j < arr2.size()) {
            if (arr1.get(i) < arr2.get(j)) {
                if (i + j + 1 == k) {
                    return arr1.get(i);
                }
                i++;
            } else {
                if (i + j + 1 == k) {
                    return arr2.get(j);
                }
                j++;
            }
        }
        if (i < arr1.size()) {
            return arr1.get( (k - j - 1));
        }
        return arr2.get( (k - i - 1));
    }

    
    public static int findKth_Problem_1_f3b2cc1f_5b91_455c_b31e_1d156cf68471(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get(k);
        }
        if (arr2.size() == 0) {
            return arr1.get(k);
        }
        if (k == 0) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int mid1 = arr1.get((k/2));
        int mid2 = arr2.get((k/2));
        if (mid1 < mid2) {
            return findKth_Problem_1_f3b2cc1f_5b91_455c_b31e_1d156cf68471(new ArrayList<Integer>(arr1.subList((k/2), arr1.size())), arr2, k - k/2);
        } else {
            return findKth_Problem_1_f3b2cc1f_5b91_455c_b31e_1d156cf68471(arr1, new ArrayList<Integer>(arr2.subList((k/2), arr2.size())), k - k/2);
        }
    }

    
    public static int findKth_Problem_2_3986b35d_864c_4ae3_a2ef_d56fcb34cbea(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        // Write your code here
        // Return the kth element from the two sorted arrays arr1 and arr2.
        // arr1 and arr2 can have different sizes.
        // k starts from 1.
        // If k is larger than the combined size of the two arrays, return -1.
        if (k > arr1.size() + arr2.size()) {
            return -1;
        }
        int i = 0;
        int j = 0;
        int kth = 0;
        while (i < arr1.size() && j < arr2.size()) {
            if (arr1.get(i) < arr2.get(j)) {
                kth = arr1.get(i);
                i++;
            } else {
                kth = arr2.get(j);
                j++;
            }
            k--;
            if (k == 0) {
                return kth;
            }
        }
        while (i < arr1.size()) {
            kth = arr1.get(i);
            i++;
            k--;
            if (k == 0) {
                return kth;
            }
        }
        while (j < arr2.size()) {
            kth = arr2.get(j);
            j++;
            k--;
            if (k == 0) {
                return kth;
            }
        }
        return kth;
    }

    
    public static int findKth_Problem_0_59428adf_8c31_4813_874c_6156103d03db(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get(k);
        }
        if (arr2.size() == 0) {
            return arr1.get(k);
        }
        if (k == 0) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        if (k == arr1.size() + arr2.size() - 1) {
            return Math.max(arr1.get(arr1.size() - 1), arr2.get(arr2.size() - 1));
        }
        int mid1 = arr1.get((k / 2));
        int mid2 = arr2.get((k / 2));
        if (mid1 < mid2) {
            return findKth_Problem_0_59428adf_8c31_4813_874c_6156103d03db(new ArrayList<Integer>(arr1.subList((k / 2), arr1.size())), arr2, k - k / 2);
        } else {
            return findKth_Problem_0_59428adf_8c31_4813_874c_6156103d03db(arr1, new ArrayList<Integer>(arr2.subList((k / 2), arr2.size())), k - k / 2);
        }
    }

    
    public static int findKth_Problem_2_888e2b57_5c96_47de_b9bb_0c8391c1117a(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int i = 0;
        int j = 0;
        int count = 0;
        while (i < arr1.size() && j < arr2.size()) {
            if (arr1.get(i) < arr2.get(j)) {
                count++;
                if (count == k) {
                    return arr1.get(i);
                }
                i++;
            } else {
                count++;
                if (count == k) {
                    return arr2.get(j);
                }
                j++;
            }
        }
        while (i < arr1.size()) {
            count++;
            if (count == k) {
                return arr1.get(i);
            }
            i++;
        }
        while (j < arr2.size()) {
            count++;
            if (count == k) {
                return arr2.get(j);
            }
            j++;
        }
        return -1;
    }

    
    public static int findKth_Problem_1_77a55f81_8838_43e8_8c42_b21bbbd1f633(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        // Write your code here
        if (arr1.size() == 0) {
            return arr2.get( k - 1);
        }
        if (arr2.size() == 0) {
            return arr1.get( k - 1);
        }
        if (k == 1) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int mid1 = arr1.get( Math.min(k / 2, arr1.size()) - 1);
        int mid2 = arr2.get( Math.min(k / 2, arr2.size()) - 1);
        if (mid1 < mid2) {
            return findKth_Problem_1_77a55f81_8838_43e8_8c42_b21bbbd1f633(new ArrayList<Integer>(arr1.subList( Math.min(k / 2, arr1.size()), arr1.size())), arr2, k - Math.min(k / 2, arr1.size()));
        } else {
            return findKth_Problem_1_77a55f81_8838_43e8_8c42_b21bbbd1f633(arr1, new ArrayList<Integer>(arr2.subList( Math.min(k / 2, arr2.size()), arr2.size())), k - Math.min(k / 2, arr2.size()));
        }
    }

    
    public static int findKth_Problem_1_2a8ba2bc_92d9_4022_ac96_f6c548347021(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get(k);
        }
        if (arr2.size() == 0) {
            return arr1.get(k);
        }
        if (k == 0) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        if (arr1.size() == 1 && arr2.size() == 1) {
            return Math.max(arr1.get(0), arr2.get(0));
        }
        int mid1 = Math.ceil((double)arr1.size() / 2);
        int mid2 = Math.ceil((double)arr2.size() / 2);
        if (arr1.get(mid1) < arr2.get(mid2)) {
            if (mid1 + mid2 > k) {
                return findKth_Problem_1_2a8ba2bc_92d9_4022_ac96_f6c548347021(arr1, new ArrayList<Integer>(arr2.subList(0, mid2)), k);
            } else {
                return findKth_Problem_1_2a8ba2bc_92d9_4022_ac96_f6c548347021(new ArrayList<Integer>(arr1.subList(mid1, arr1.size())), arr2, k - mid1);
            }
        } else {
            if (mid1 + mid2 > k) {
                return findKth_Problem_1_2a8ba2bc_92d9_4022_ac96_f6c548347021(new ArrayList<Integer>(arr1.subList(0, mid1)), arr2, k);
            } else {
                return findKth_Problem_1_2a8ba2bc_92d9_4022_ac96_f6c548347021(arr1, new ArrayList<Integer>(arr2.subList(mid2, arr2.size())), k - mid2);
            }
        }
    }

    
    public static int findKth_Problem_2_205251e3_7b32_4971_b5e1_969ccf3621e7(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        // Write your code here
        int n = arr1.size();
        int m = arr2.size();
        int i = 0;
        int j = 0;
        int count = 0;
        while (i < n && j < m) {
            if (arr1.get(i) < arr2.get(j)) {
                count++;
                if (count == k) {
                    return arr1.get(i);
                }
                i++;
            } else {
                count++;
                if (count == k) {
                    return arr2.get(j);
                }
                j++;
            }
        }
        while (i < n) {
            count++;
            if (count == k) {
                return arr1.get(i);
            }
            i++;
        }
        while (j < m) {
            count++;
            if (count == k) {
                return arr2.get(j);
            }
            j++;
        }
        return -1;
    }

    
    public static int findKth_Problem_2_974500d8_b718_475f_8173_7d41d6d516ae(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        // Write your code here
        return 0;
    }

    
    public static int findKth_Problem_0_b24c9d76_74f8_4c05_86be_adab2bbbc045(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get(k - 1);
        }
        if (arr2.size() == 0) {
            return arr1.get(k - 1);
        }
        if (k == 1) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int mid1 = arr1.get(Math.min(k/2, arr1.size()) - 1);
        int mid2 = arr2.get(Math.min(k/2, arr2.size()) - 1);
        if (mid1 < mid2) {
            return findKth_Problem_0_b24c9d76_74f8_4c05_86be_adab2bbbc045(new ArrayList<Integer>(arr1.subList(Math.min(k/2, arr1.size()), arr1.size())), arr2, k - Math.min(k/2, arr1.size()));
        } else {
            return findKth_Problem_0_b24c9d76_74f8_4c05_86be_adab2bbbc045(arr1, new ArrayList<Integer>(arr2.subList(Math.min(k/2, arr2.size()), arr2.size())), k - Math.min(k/2, arr2.size()));
        }
    }

    
    public static int findKth_Problem_1_4ae2636e_5037_462b_945f_6a186c3afe6a(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int n = arr1.size();
        int m = arr2.size();
        if (n >= m) {
            arr1.add(arr2.get(m - 1));
            arr2.remove(m - 1);
        }
        int index = 0;
        int kth = -1;
        int count = 0;
        int flag = 0;
        for (int i = 0; i < n; i++) {
            count++;
            if (count > k) {
                count = 1;
                flag++;
                index++;
            }
            if (i == 0) {
                kth = arr1.get(i);
                kth = (arr2.get(m));
                kth = (arr1.get(m));
            }
            if (arr1.get(i) == arr2.get(m)) {
                kth = (arr1.get(m));
                kth = (arr2.get(m));
            }
            if (arr1.get(i) > arr2.get(m)) {
                kth = (arr1.get(m));
                kth = (arr2.get(m));
            }
            if (flag == (n - 1)) {
                return kth;
            }
        }
        return -1;
    }

    
    public static int findKth_Problem_2_4dd7d11f_8a60_4d2e_9cf3_22d1d52bc8ff(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int result = 0;
        int comp = 0;
        int l1 = arr1.size();
        int l2 = arr2.size();
        if (k < arr1.get(0))
            return arr1.get(0);
        if (k < arr2.get(0))
            return arr2.get(0);
        if (arr1.get(0) == arr2.get(0)) {
            while (comp < l1) {
                if (arr1.get(comp) <= k)
                    result |= (1L << (arr1.get(comp) + 1));
                comp++;
            }
            while (comp < l2) {
                if (arr2.get(comp) <= k)
                    result |= (1L << (arr2.get(comp) + 1));
                comp++;
            }
        }
        if (comp == l1) {
            while (comp < l2) {
                if (arr2.get(comp) <= k)
                    result |= (1L << (arr2.get(comp) + 1));
                comp++;
            }
        }
        if (comp == l2) {
            while (comp < l1) {
                if (arr1.get(comp) <= k)
                    result |= (1L << (arr1.get(comp) + 1));
                comp++;
            }
        }
        return result;
    }

    
    public static int findKth_Problem_1_e2c77df5_4c96_43f7_9e4a_1b7db8277200(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int low=arr1.get(0),high=arr1.get(arr1.size()-1),middle=arr1.get(0);
        int i=1;
        while(low<=high){
            middle=(low+high)/2;
            if(arr2.contains(middle)){
                low=middle;
            }
            else if(arr2.contains(middle+1)){
                high=middle-1;
            }
            else{
                i++;
            }
        }
        return k;
    }

    
    public static int findKth_Problem_0_e9061600_9b5b_4e13_b18c_36abec9e8f59(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if(k == 0)
            return -1;
        // Find the middle index
        int mid = (arr1.size()+arr2.size())/2;
        if(arr1.size() > arr2.size())
            return findKth_Problem_0_e9061600_9b5b_4e13_b18c_36abec9e8f59(arr1, arr2, k-1);
        else
            return findKth_Problem_0_e9061600_9b5b_4e13_b18c_36abec9e8f59(arr2, arr1, k-1);
    }

    
    public static int findKth_Problem_1_5ccc651d_6fed_4d6e_bfbd_e7de6c56c178(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int i = 0;
        int j = 0;
        int count = 0;
        while (i < arr1.size() && j < arr2.size()) {
            if (arr1.get(i) < arr2.get(j)) {
                i++;
            } else if (arr1.get(i) > arr2.get(j)) {
                j++;
            } else {
                count++;
                if (count == k) {
                    return arr1.get(i);
                }
                i++;
                j++;
            }
        }
        return -1;
    }

    
    public static int findKth_Problem_1_fd5eee6d_857a_4317_a63d_c14e6fb7464f(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (k > arr1.size() + arr2.size()) {
            return -1;
        }
        int i = 0;
        int j = 0;
        int count = 0;
        while (i < arr1.size() && j < arr2.size()) {
            if (arr1.get(i) < arr2.get(j)) {
                count++;
                if (count == k) {
                    return arr1.get(i);
                }
                i++;
            } else {
                count++;
                if (count == k) {
                    return arr2.get(j);
                }
                j++;
            }
        }
        while (i < arr1.size()) {
            count++;
            if (count == k) {
                return arr1.get(i);
            }
            i++;
        }
        while (j < arr2.size()) {
            count++;
            if (count == k) {
                return arr2.get(j);
            }
            j++;
        }
        return -1;
    }

    
    public static int findKth_Problem_2_e2c77df5_4c96_43f7_9e4a_1b7db8277200(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int low=arr1.get(0),high=arr1.get(arr1.size()-1),middle=arr1.get(0);
        int i=1;
        while(low<=high){
            middle=(low+high)/2;
            if(arr2.contains(middle)){
                low=middle;
            }
            else if(arr2.contains(middle+1)){
                high=middle-1;
            }
            else{
                i++;
            }
        }
        return k;
    }

    
    public static int findKth_Problem_2_4e27b670_589d_4abf_ba8a_22708d909c53(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get(k - 1);
        }
        if (arr2.size() == 0) {
            return arr1.get(k - 1);
        }
        if (k == 1) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int mid1 = arr1.get(arr1.size() / 2);
        int mid2 = arr2.get(arr2.size() / 2);
        if (mid1 < mid2) {
            ArrayList<Integer> newArr1 = new ArrayList<Integer>(arr1.subList(arr1.size() / 2 + 1, arr1.size()));
            ArrayList<Integer> newArr2 = new ArrayList<Integer>(arr2.subList(0, arr2.size() / 2));
            return findKth_Problem_2_4e27b670_589d_4abf_ba8a_22708d909c53(newArr1, newArr2, k - arr1.size() / 2 - 1);
        } else {
            ArrayList<Integer> newArr1 = new ArrayList<Integer>(arr1.subList(0, arr1.size() / 2));
            ArrayList<Integer> newArr2 = new ArrayList<Integer>(arr2.subList(arr2.size() / 2 + 1, arr2.size()));
            return findKth_Problem_2_4e27b670_589d_4abf_ba8a_22708d909c53(newArr1, newArr2, k - arr2.size() / 2 - 1);
        }
    }

    
    public static int findKth_Problem_1_58fd0016_9ec3_4068_acdf_b7e71652f9b3(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        // Your code goes here
        int x = arr1.get(0); 
        int y = 0;
        for(int i = 1; i < arr2.size(); i++){
            if(arr2.get(i) == x){
                y = i-1;
            }
        }
        if(arr2.get(y) < k){
            return arr2.get(y);
        }
        else{
            return arr2.get(y+1);
        }
    }

    
    public static int findKth_Problem_1_93827ce6_889f_49ef_b738_c226c0f63560(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int res = 0;
        for(int i = 0; i < k; i++) {
            if(arr1.get(i) > arr2.get(i))
                return res + 1;
            else
                res = (res + arr1.get(i)) + arr2.get(i);
        }
        return res;
    }

    
    public static int findKth_Problem_2_b74bd53f_927b_45d1_813e_938b2fecde75(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get(k);
        }
        if (arr2.size() == 0) {
            return arr1.get(k);
        }
        if (k == 0) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        if (arr1.size() > arr2.size()) {
            return findKth_Problem_2_b74bd53f_927b_45d1_813e_938b2fecde75(arr2, arr1, k);
        }
        int index1 = Math.min(k/2, arr1.size() - 1);
        int index2 = k - index1 - 1;
        if (arr1.get(index1) < arr2.get(index2)) {
            return findKth_Problem_2_b74bd53f_927b_45d1_813e_938b2fecde75(new ArrayList<Integer>(arr1.subList(index1 + 1, arr1.size())), arr2, k - index1 - 1);
        } else {
            return findKth_Problem_2_b74bd53f_927b_45d1_813e_938b2fecde75(arr1, new ArrayList<Integer>(arr2.subList(index2 + 1, arr2.size())), k - index2 - 1);
        }
    }

    
    public static int findKth_Problem_1_51f89652_1826_422c_a27a_2ed5702048e6(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int n = arr1.size();
        int m = arr2.size();
        if (k > (n + m)) {
            return -1;
        }
        if (k == 1) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        if (n == 0) {
            return arr2.get( k - 1);
        }
        if (m == 0) {
            return arr1.get( k - 1);
        }
        int i =  Math.min(k / 2, n);
        int j =  Math.min(k / 2, m);
        if (arr1.get(i - 1) > arr2.get(j - 1)) {
            return findKth_Problem_1_51f89652_1826_422c_a27a_2ed5702048e6(arr1, new ArrayList<Integer>(arr2.subList(j, m)), k - j);
        } else {
            return findKth_Problem_1_51f89652_1826_422c_a27a_2ed5702048e6(new ArrayList<Integer>(arr1.subList(i, n)), arr2, k - i);
        }
    }

    
    public static int findKth_Problem_2_20e2f203_6dc8_4488_86d3_75a88b9d9c60(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int n = arr1.size();
        int m = arr2.size();
        if (k > n + m) {
            return -1;
        }
        if (n == 0) {
            return arr2.get(k - 1);
        }
        if (m == 0) {
            return arr1.get(k - 1);
        }
        if (k == 1) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        int i = Math.min(n, k / 2);
        int j = Math.min(m, k / 2);
        if (arr1.get(i - 1) > arr2.get(j - 1)) {
            return findKth_Problem_2_20e2f203_6dc8_4488_86d3_75a88b9d9c60(arr1, new ArrayList<Integer>(arr2.subList(j, m)), k - j);
        } else {
            return findKth_Problem_2_20e2f203_6dc8_4488_86d3_75a88b9d9c60(new ArrayList<Integer>(arr1.subList(i, n)), arr2, k - i);
        }
    }

    
    public static int findKth_Problem_0_7ebb8b0c_1628_4ab0_bf29_edc57704e9c8(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int i = 0;
        int j = 0;
        int count = 0;
        int last = 0;
        while (i < arr1.size() && j < arr2.size()) {
            if (arr1.get(i) < arr2.get(j)) {
                last = arr1.get(i);
                i++;
            } else {
                last = arr2.get(j);
                j++;
            }
            count++;
            if (count == k) {
                break;
            }
        }
        if (i == arr1.size()) {
            while (j < arr2.size()) {
                last = arr2.get(j);
                j++;
                count++;
                if (count == k) {
                    break;
                }
            }
        }
        if (j == arr2.size()) {
            while (i < arr1.size()) {
                last = arr1.get(i);
                i++;
                count++;
                if (count == k) {
                    break;
                }
            }
        }
        return last;
    }

    
    public static int findKth_Problem_1_09b007d3_8559_4859_bec2_722e7f6abc53(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        int i = 0;
        int j = 0;
        int count = 0;
        while (i < arr1.size() && j < arr2.size()) {
            if (arr1.get(i) < arr2.get(j)) {
                count++;
                if (count == k) {
                    return arr1.get(i);
                }
                i++;
            } else {
                count++;
                if (count == k) {
                    return arr2.get(j);
                }
                j++;
            }
        }
        while (i < arr1.size()) {
            count++;
            if (count == k) {
                return arr1.get(i);
            }
            i++;
        }
        while (j < arr2.size()) {
            count++;
            if (count == k) {
                return arr2.get(j);
            }
            j++;
        }
        return -1;
    }

    
    public static int findKth_Problem_0_2a8ba2bc_92d9_4022_ac96_f6c548347021(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int k) {
        if (arr1.size() == 0) {
            return arr2.get(k);
        }
        if (arr2.size() == 0) {
            return arr1.get(k);
        }
        if (k == 0) {
            return Math.min(arr1.get(0), arr2.get(0));
        }
        if (arr1.size() == 1 && arr2.size() == 1) {
            return Math.max(arr1.get(0), arr2.get(0));
        }
        int mid1 = Math.ceil((double)arr1.size() / 2);
        int mid2 = Math.ceil((double)arr2.size() / 2);
        if (arr1.get(mid1) < arr2.get(mid2)) {
            if (mid1 + mid2 > k) {
                return findKth_Problem_0_2a8ba2bc_92d9_4022_ac96_f6c548347021(arr1, new ArrayList<Integer>(arr2.subList(0, mid2)), k);
            } else {
                return findKth_Problem_0_2a8ba2bc_92d9_4022_ac96_f6c548347021(new ArrayList<Integer>(arr1.subList(mid1, arr1.size())), arr2, k - mid1);
            }
        } else {
            if (mid1 + mid2 > k) {
                return findKth_Problem_0_2a8ba2bc_92d9_4022_ac96_f6c548347021(new ArrayList<Integer>(arr1.subList(0, mid1)), arr2, k);
            } else {
                return findKth_Problem_0_2a8ba2bc_92d9_4022_ac96_f6c548347021(arr1, new ArrayList<Integer>(arr2.subList(mid2, arr2.size())), k - mid2);
            }
        }
    }

}
