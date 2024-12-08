package mbpp_304_find_Element;

public class mbpp_304_find_Element {

    
    public static int findElement_Problem_2_317990d1_c3b1_4491_8fd6_7c4a561d5a3c(ArrayList<Integer> arr, ArrayList<ArrayList<Integer>> ranges, int rotations, int index) {
        int result = 0;
        for(int i = 0; i < rotations; i++) {
            int indexOf = arr.indexOf(index);
            if(indexOf == -1) {
                return -1;
            }
            index = arr.get(indexOf);
            arr.remove(indexOf);
            arr.add(indexOf, index);
        }
        for(int i = 0; i < ranges.size(); i++) {
            if(ranges.get(i).contains(index)) {
                result = arr.get(i);
                break;
            }
        }
        return result;
    }

    
    public static int findElement_Problem_0_8e86af0b_0fc6_4437_9d88_7d58a1d90eef(ArrayList<Integer> arr, ArrayList<ArrayList<Integer>> ranges, int rotations, int index) {
        int n = arr.size();
        int r = rotations % n;
        int i = index - r;
        if (i < 0) {
            i = n + i;
        }
        return arr.get(i);
    }

    
    public static int findElement_Problem_0_43bbab34_1cee_4d00_b8ce_cb28fe4f57fd(ArrayList<Integer> arr, ArrayList<ArrayList<Integer>> ranges, int rotations, int index) {
        // Write your code here
        int n = arr.size();
        int m = ranges.size();
        int[] arr2 = new int[n];
        for (int i = 0; i < n; i++) {
            arr2[i] = arr.get(i);
        }
        for (int i = 0; i < m; i++) {
            int l = ranges.get(i).get(0).intValue();
            int r = ranges.get(i).get(1).intValue();
            int[] arr3 = new int[r - l + 1];
            for (int j = l; j <= r; j++) {
                arr3[j - l] = arr2[j];
            }
            Arrays.sort(arr3);
            for (int j = l; j <= r; j++) {
                arr2[j] = arr3[j - l];
            }
        }
        for (int i = 0; i < rotations; i++) {
            int temp = arr2[n - 1];
            for (int j = n - 1; j > 0; j--) {
                arr2[j] = arr2[j - 1];
            }
            arr2[0] = temp;
        }
        return arr2[ index];
    }

    
    public static int findElement_Problem_2_6af58afb_f29e_459b_88b2_9ff002fc596b(ArrayList<Integer> arr, ArrayList<ArrayList<Integer>> ranges, int rotations, int index) {
        // Write your code here
        int n = arr.size();
        int mod = rotations % n;
        int start = 0;
        int end = n - 1;
        int mid = 0;
        int ans = 0;
        while (start <= end) {
            mid = (start + end) / 2;
            if (mid + mod >= n) {
                ans = arr.get( (mid + mod - n));
            } else {
                ans = arr.get( (mid + mod));
            }
            if (ans == index) {
                break;
            } else if (ans > index) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }

    
    public static int findElement_Problem_2_9d25ff48_e3d9_4642_a70d_c6d30d8258aa(ArrayList<Integer> arr, ArrayList<ArrayList<Integer>> ranges, int rotations, int index) {
        int n = arr.size();
        int r = rotations % n;
        int i = index - r;
        if (i < 0) {
            i = n + i;
        }
        return arr.get(i);
    }

    
    public static int findElement_Problem_2_fe791a33_e298_45a3_bd02_69f8f9c24734(ArrayList<Integer> arr, ArrayList<ArrayList<Integer>> ranges, int rotations, int index) {
        for (ArrayList<Integer> range : ranges) {
            int start = range.get(0);
            int end = range.get(1);
            int temp = arr.get(start);
            for (int i = start; i < end; i++) {
                arr.set(i, arr.get((i + 1)));
            }
            arr.set(end, temp);
        }
        return arr.get((index - rotations));
    }

    
    public static int findElement_Problem_1_85b28b49_447d_47ba_98eb_2606a36f9425(ArrayList<Integer> arr, ArrayList<ArrayList<Integer>> ranges, int rotations, int index) {
        // Write your code here
        int n = arr.size();
        int m = ranges.size();
        int[] prefix = new int[n];
        for (int i = 0; i < m; i++) {
            int l = ranges.get(i).get(0).intValue();
            int r = ranges.get(i).get(1).intValue();
            prefix[l]++;
            if (r + 1 < n) {
                prefix[r + 1]--;
            }
        }
        for (int i = 1; i < n; i++) {
            prefix[i] += prefix[i - 1];
        }
        for (int i = 0; i < n; i++) {
            prefix[i] %= n;
        }
        for (int i = 1; i < n; i++) {
            prefix[i] += prefix[i - 1];
        }
        for (int i = 0; i < n; i++) {
            prefix[i] %= n;
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans += arr.get(i) * prefix[i];
        }
        int r = rotations % n;
        int x = ans % n;
        int y = (ans + r) % n;
        int z = (ans + n - r) % n;
        int p = (index - x + n) % n;
        int q = (index - y + n) % n;
        int s = (index - z + n) % n;
        int[] a = new int[] { p, q, s };
        Arrays.sort(a);
        return a[0];
    }

    
    public static int findElement_Problem_0_5e489799_92b8_419a_8cad_9cdfcc3de810(ArrayList<Integer> arr, ArrayList<ArrayList<Integer>> ranges, int rotations, int index) {
        // Initialize sum as 0
        int sum = 0;
        // Check which element needs to be added to sum.
        if (ranges.get(ranges.size() - 1).get(0) > index)
            sum = ranges.get(ranges.size() - 1).get(0);
        else
            sum = ranges.get(ranges.size() - 1).get(1);
        // Increment sum by index
        sum += index;
        // Compare sum to rotation limit
        if (sum > rotations)
            return 0;
        // If sum is greater than rotation limit, return -1 as no such element exists.
        else if(sum < rotations)
            return -1;
        // Else return the sum
        else
            return sum;
    }

    
    public static int findElement_Problem_1_43bbab34_1cee_4d00_b8ce_cb28fe4f57fd(ArrayList<Integer> arr, ArrayList<ArrayList<Integer>> ranges, int rotations, int index) {
        // Write your code here
        int n = arr.size();
        int m = ranges.size();
        int[] arr2 = new int[n];
        for (int i = 0; i < n; i++) {
            arr2[i] = arr.get(i);
        }
        for (int i = 0; i < m; i++) {
            int l = ranges.get(i).get(0).intValue();
            int r = ranges.get(i).get(1).intValue();
            int[] arr3 = new int[r - l + 1];
            for (int j = l; j <= r; j++) {
                arr3[j - l] = arr2[j];
            }
            Arrays.sort(arr3);
            for (int j = l; j <= r; j++) {
                arr2[j] = arr3[j - l];
            }
        }
        for (int i = 0; i < rotations; i++) {
            int temp = arr2[n - 1];
            for (int j = n - 1; j > 0; j--) {
                arr2[j] = arr2[j - 1];
            }
            arr2[0] = temp;
        }
        return arr2[ index];
    }

    
    public static int findElement_Problem_1_f942adac_28c7_4aee_8171_41159d622cea(ArrayList<Integer> arr, ArrayList<ArrayList<Integer>> ranges, int rotations, int index) {
        // Write your code here
        for (ArrayList<Integer> range : ranges) {
            int start = range.get(0);
            int end = range.get(1);
            int numRotations = rotations % (end - start + 1);
            Collections.rotate(arr.subList( start,  end + 1),  -numRotations);
        }
        return arr.get( index);
    }

    
    public static int findElement_Problem_1_8e86af0b_0fc6_4437_9d88_7d58a1d90eef(ArrayList<Integer> arr, ArrayList<ArrayList<Integer>> ranges, int rotations, int index) {
        int n = arr.size();
        int r = rotations % n;
        int i = index - r;
        if (i < 0) {
            i = n + i;
        }
        return arr.get(i);
    }

    
    public static int findElement_Problem_1_d416c2cc_e5a4_4c73_932c_7174bd298ec5(ArrayList<Integer> arr, ArrayList<ArrayList<Integer>> ranges, int rotations, int index) {
        // Write your code here
        int n = arr.size();
        int mod = rotations % n;
        int newIndex = (index + mod) % n;
        return arr.get(newIndex);
    }

    
    public static int findElement_Problem_1_eae7e2f8_5f80_401e_96cf_ed619b39044d(ArrayList<Integer> arr, ArrayList<ArrayList<Integer>> ranges, int rotations, int index) {
        int result = 0;
        for(int i = 0; i < ranges.size(); i++) {
            int start = ranges.get(i).get(0);
            int end = ranges.get(i).get(1);
            if(rotations >= start && rotations <= end) {
                result = arr.get(i);
                break;
            }
        }
        return result;
    }

    
    public static int findElement_Problem_0_41343975_9507_4563_8739_de8fd4fe3e73(ArrayList<Integer> arr, ArrayList<ArrayList<Integer>> ranges, int rotations, int index) {
        // Write your code here
        for (ArrayList<Integer> range : ranges) {
            int start = range.get(0);
            int end = range.get(1);
            int temp = arr.get( start);
            for (int i = start; i < end; i++) {
                arr.set( i, arr.get( (i + 1)));
            }
            arr.set( end, temp);
        }
        return arr.get( ((index + rotations) % arr.size()));
    }

    
    public static int findElement_Problem_2_f1dfc405_a088_4793_a362_556aac9f7c8b(ArrayList<Integer> arr, ArrayList<ArrayList<Integer>> ranges, int rotations, int index) {
        // Write your code here
        int n = arr.size();
        int mod = rotations % n;
        int start = 0;
        int end = n - 1;
        int mid = 0;
        int ans = 0;
        while (start <= end) {
            mid = (start + end) / 2;
            int midIndex = (mid + mod) % n;
            if (midIndex == index) {
                ans = arr.get( mid);
                break;
            } else if (midIndex > index) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        for (ArrayList<Integer> range : ranges) {
            int l = range.get(0);
            int r = range.get(1);
            int x = range.get(2);
            if (l <= index && index <= r) {
                ans += x;
            }
        }
        return ans;
    }

    
    public static int findElement_Problem_1_111e5610_1838_444b_9923_5456abc10024(ArrayList<Integer> arr, ArrayList<ArrayList<Integer>> ranges, int rotations, int index) {
        // Write your code here
        // Return the element at index after rotations
        int size = arr.size();
        int rot = rotations % size;
        int i = index - rot;
        if (i < 0) {
            i = size + i;
        }
        return arr.get( i);
    }

    
    public static int findElement_Problem_2_1460b97a_7e7c_4612_836a_a0c8a31e8afa(ArrayList<Integer> arr, ArrayList<ArrayList<Integer>> ranges, int rotations, int index) {
        // Write your code here
        int n = arr.size();
        int mod = rotations % n;
        if (mod == 0) {
            return arr.get( index);
        }
        int start = index - mod;
        if (start < 0) {
            start = n + start;
        }
        int end = index - 1;
        if (end < 0) {
            end = n + end;
        }
        if (start > end) {
            int temp = start;
            start = end;
            end = temp;
        }
        int ans = 0;
        for (int i = start; i <= end; i++) {
            ans += arr.get( i);
        }
        return ans;
    }

    
    public static int findElement_Problem_2_a97d7fa2_d6f2_4031_8001_3191c0abf10a(ArrayList<Integer> arr, ArrayList<ArrayList<Integer>> ranges, int rotations, int index) {
        // Write your code here
        // Return the element at index after rotations
        for (ArrayList<Integer> range : ranges) {
            int start = range.get(0);
            int end = range.get(1);
            int temp = arr.get( start);
            for (int i = start; i < end; i++) {
                arr.set( i, arr.get( (i + 1)));
            }
            arr.set( end, temp);
        }
        return arr.get( (index % arr.size()));
    }

    
    public static int findElement_Problem_0_993e597e_f02c_4ea7_8906_1255ee3a3772(ArrayList<Integer> arr, ArrayList<ArrayList<Integer>> ranges, int rotations, int index) {
        // Write your code here
        int size = arr.size();
        int mod = rotations % size;
        int newIndex = (index + mod) % size;
        return arr.get(newIndex);
    }

    
    public static int findElement_Problem_0_0f922595_12ad_43a7_b33c_39dfb43449f0(ArrayList<Integer> arr, ArrayList<ArrayList<Integer>> ranges, int rotations, int index) {
        for (int i = 0; i < rotations; i++) {
            int first = arr.get(0);
            arr.remove(0);
            arr.add(first);
        }
        return arr.get( index);
    }

    
    public static int findElement_Problem_0_a960e3b9_e112_4068_9763_6982e7700f9a(ArrayList<Integer> arr, ArrayList<ArrayList<Integer>> ranges, int rotations, int index) {
        // Write your code here
        for (ArrayList<Integer> range : ranges) {
            int start = range.get(0);
            int end = range.get(1);
            int temp = arr.get( start);
            for (int i = start; i < end; i++) {
                arr.set( i, arr.get( (i + 1)));
            }
            arr.set( end, temp);
        }
        return arr.get( (index - rotations));
    }

    
    public static int findElement_Problem_0_064e70a0_048d_4e9d_a03f_36cd65277c24(ArrayList<Integer> arr, ArrayList<ArrayList<Integer>> ranges, int rotations, int index) {
        // Write your code here
        int n = arr.size();
        int m = ranges.size();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = arr.get(i);
        }
        for (int i = 0; i < m; i++) {
            int l = ranges.get(i).get(0).intValue();
            int r = ranges.get(i).get(1).intValue();
            int k = ranges.get(i).get(2).intValue();
            for (int j = l; j <= r; j++) {
                a[j] += k;
            }
        }
        for (int i = 0; i < rotations; i++) {
            int temp = a[n - 1];
            for (int j = n - 1; j > 0; j--) {
                a[j] = a[j - 1];
            }
            a[0] = temp;
        }
        return a[ index];
    }

    
    public static int findElement_Problem_1_be5d0cba_7268_486f_be53_5b4eb6889163(ArrayList<Integer> arr, ArrayList<ArrayList<Integer>> ranges, int rotations, int index) {
        // Write your code here
        // Return the element at index after rotations
        for (int i = 0; i < rotations; i++) {
            ArrayList<Integer> range = ranges.get(i);
            int start = range.get(0);
            int end = range.get(1);
            int temp = arr.get( start);
            for (int j =  start; j < end; j++) {
                arr.set(j, arr.get(j + 1));
            }
            arr.set( end, temp);
        }
        return arr.get( index);
    }

    
    public static int findElement_Problem_1_e381e7a5_7850_486a_99f0_8cb6e1c80404(ArrayList<Integer> arr, ArrayList<ArrayList<Integer>> ranges, int rotations, int index) {
        for (int i = 0; i < rotations; i++) {
            ArrayList<Integer> range = ranges.get(i);
            int start = range.get(0);
            int end = range.get(1);
            ArrayList<Integer> temp = new ArrayList<>();
            for (int j =  end; j >= start; j--) {
                temp.add(arr.get(j));
            }
            for (int j =  start; j <= end; j++) {
                arr.set(j, temp.get(j -  start));
            }
        }
        return arr.get( index);
    }

    
    public static int findElement_Problem_1_bdcc7207_87ea_4cce_accc_15b7b35141ae(ArrayList<Integer> arr, ArrayList<ArrayList<Integer>> ranges, int rotations, int index) {
        // Write your code here
        int n = arr.size();
        int mod = rotations % n;
        int start = 0;
        int end = n - 1;
        int mid = 0;
        while (start <= end) {
            mid = (start + end) / 2;
            if (mid == index) {
                break;
            } else if (mid < index) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        int newIndex = (mid + mod) % n;
        return arr.get( newIndex);
    }

    
    public static int findElement_Problem_2_b503191e_7197_4e60_a137_ec24a20b9d56(ArrayList<Integer> arr, ArrayList<ArrayList<Integer>> ranges, int rotations, int index) {
        // Write your code here
        int n = arr.size();
        int k = rotations % n;
        int i = index - k;
        if (i < 0) {
            i = n + i;
        }
        return arr.get( i);
    }

    
    public static int findElement_Problem_2_0f922595_12ad_43a7_b33c_39dfb43449f0(ArrayList<Integer> arr, ArrayList<ArrayList<Integer>> ranges, int rotations, int index) {
        for (int i = 0; i < rotations; i++) {
            int first = arr.get(0);
            arr.remove(0);
            arr.add(first);
        }
        return arr.get( index);
    }

    
    public static int findElement_Problem_0_7017e681_46fc_47c8_b1ee_de3942d7c3e4(ArrayList<Integer> arr, ArrayList<ArrayList<Integer>> ranges, int rotations, int index) {
        // Write your code here
        int n = arr.size();
        int mod = rotations % n;
        int newIndex = (index - mod + n) % n;
        return arr.get( newIndex);
    }

    
    public static int findElement_Problem_2_81f842c1_e573_4f07_9625_6aa8884e84d6(ArrayList<Integer> arr, ArrayList<ArrayList<Integer>> ranges, int rotations, int index) {
        for (ArrayList<Integer> range : ranges) {
            int start = range.get(0);
            int end = range.get(1);
            int length = end - start + 1;
            int rotationsLeft = rotations % length;
            if (rotationsLeft == 0) {
                continue;
            }
            if (index >= start && index <= end) {
                if (index + rotationsLeft > end) {
                    index = start + (index + rotationsLeft - end - 1);
                } else {
                    index = index + rotationsLeft;
                }
            }
        }
        return arr.get( index);
    }

    
    public static int findElement_Problem_2_203eb4b1_0313_43d4_a5ad_81926ad3cef7(ArrayList<Integer> arr, ArrayList<ArrayList<Integer>> ranges, int rotations, int index) {
        int result = -1;
        for (int i = 0; i < ranges.size(); i++) {
            if (ranges.get(i).get(0) <= rotations && ranges.get(i).get(1) >= rotations) {
                result = arr.get(i);
                break;
            }
        }
        return result;
    }

    
    public static int findElement_Problem_0_bb6f95e5_7ea2_4764_85b0_7d915f061ff2(ArrayList<Integer> arr, ArrayList<ArrayList<Integer>> ranges, int rotations, int index) {
        int res = 0;
        int sum = 0;
        for (int i = 0; i < ranges.size(); i++) {
            if (ranges.get(i).size() <= rotations + 1) {
                continue;
            }
            sum += ranges.get(i).get(ranges.get(i).size() - 1);
            int left = ranges.get(i).get(0) - ranges.get(i).get(ranges.get(i).size() - 1);
            int right = ranges.get(i).get(0) + ranges.get(i).get(ranges.get(i).size() - 1);
            if (left >= index) {
                res += ranges.get(i).get(ranges.get(i).size() - 1);
            } else if (left > index && right < index) {
                res += ranges.get(i).get((ranges.get(i).size() - 1) / 2);
            } else {
                res += ranges.get(i).get((ranges.get(i).size() - 1) / 2);
            }
        }
        res += arr.get(arr.size() - 1);
        return sum;
    }

    
    public static int findElement_Problem_1_4dd446d5_d7c6_4a3c_a7fd_1da6da5254fe(ArrayList<Integer> arr, ArrayList<ArrayList<Integer>> ranges, int rotations, int index) {
        for (ArrayList<Integer> range : ranges) {
            int start = range.get(0);
            int end = range.get(1);
            int temp = arr.get(start);
            for (int i = start; i < end; i++) {
                arr.set(i, arr.get(i + 1));
            }
            arr.set(end, temp);
        }
        return arr.get(((index + rotations) % arr.size()));
    }

    
    public static int findElement_Problem_2_b4a1fc78_f060_4708_b5b8_c7b9d76939fc(ArrayList<Integer> arr, ArrayList<ArrayList<Integer>> ranges, int rotations, int index) {
        // Write your code here
        int n = arr.size();
        int m = ranges.size();
        for (int i = 0; i < m; i++) {
            int l = ranges.get(i).get(0).intValue();
            int r = ranges.get(i).get(1).intValue();
            int d = ranges.get(i).get(2).intValue();
            for (int j = l; j <= r; j++) {
                arr.set(j, arr.get(j) + d);
            }
        }
        int ans = arr.get( ((index + rotations) % n));
        return ans;
    }

    
    public static int findElement_Problem_1_169f2655_52af_498d_bee6_e34d9206df4e(ArrayList<Integer> arr, ArrayList<ArrayList<Integer>> ranges, int rotations, int index) {
        // Write your code here
        int n = arr.size();
        int r = rotations % n;
        int i = index;
        for (ArrayList<Integer> range : ranges) {
            int l = range.get(0);
            int k = range.get(1);
            if (l <= i && i <= k) {
                i = (i - l + k - l + 1) % (k - l + 1) + l;
            }
        }
        return arr.get( ((i + n - r) % n));
    }

    
    public static int findElement_Problem_2_537dae31_9efa_4edf_afbc_d46ee9324a8f(ArrayList<Integer> arr, ArrayList<ArrayList<Integer>> ranges, int rotations, int index) {
        // Write your code here
        for (ArrayList<Integer> range : ranges) {
            int start = range.get(0);
            int end = range.get(1);
            int temp = arr.get( start);
            for (int i = start; i < end; i++) {
                arr.set( i, arr.get( (i + 1)));
            }
            arr.set( end, temp);
        }
        return arr.get( ((index + rotations) % arr.size()));
    }

    
    public static int findElement_Problem_2_6acb6386_6f26_4293_b16b_4273797d7a02(ArrayList<Integer> arr, ArrayList<ArrayList<Integer>> ranges, int rotations, int index) {
        for (ArrayList<Integer> range : ranges) {
            int start = range.get(0);
            int end = range.get(1);
            int count = end - start + 1;
            rotations = rotations % count;
            if (rotations == 0) {
                continue;
            }
            int[] temp = new int[ count];
            for (int i = 0; i < count; i++) {
                temp[i] = arr.get( (start + i));
            }
            for (int i = 0; i < count; i++) {
                arr.set( (start + i), temp[ ((i + rotations) % count)]);
            }
        }
        return arr.get( index);
    }

    
    public static int findElement_Problem_0_bd11a820_2cb8_4972_86c0_1724f0e5f023(ArrayList<Integer> arr, ArrayList<ArrayList<Integer>> ranges, int rotations, int index) {
        // Write your code here
        int n = arr.size();
        int m = ranges.size();
        int[] prefix = new int[n];
        int[] suffix = new int[n];
        for (int i = 0; i < n; i++) {
            prefix[i] = 0;
            suffix[i] = 0;
        }
        for (int i = 0; i < m; i++) {
            int l = ranges.get(i).get(0);
            int r = ranges.get(i).get(1);
            prefix[l]++;
            suffix[r]++;
        }
        int[] prefixSum = new int[n];
        int[] suffixSum = new int[n];
        prefixSum[0] = prefix[0];
        suffixSum[n - 1] = suffix[n - 1];
        for (int i = 1; i < n; i++) {
            prefixSum[i] = prefixSum[i - 1] + prefix[i];
            suffixSum[n - i - 1] = suffixSum[n - i] + suffix[n - i - 1];
        }
        int[] rotationsArray = new int[n];
        for (int i = 0; i < n; i++) {
            rotationsArray[i] = prefixSum[i] - suffixSum[i];
        }
        int[] rotatedArray = new int[n];
        for (int i = 0; i < n; i++) {
            rotatedArray[i] = arr.get(((i + rotationsArray[i]) % n));
        }
        return rotatedArray[index];
    }

    
    public static int findElement_Problem_0_663ab26f_404b_4c72_b4cd_84ebbb26bc81(ArrayList<Integer> arr, ArrayList<ArrayList<Integer>> ranges, int rotations, int index) {
        // Write your code here
        int n = arr.size();
        int mod = rotations % n;
        int start = mod;
        int end = mod;
        for (ArrayList<Integer> range : ranges) {
            int l = range.get(0);
            int r = range.get(1);
            if (l <= start && r >= start) {
                start = r;
            }
            if (l <= end && r >= end) {
                end = l;
            }
        }
        int len = end - start + 1;
        int newIndex = (index + mod) % n;
        if (newIndex >= start && newIndex <= end) {
            return arr.get( (newIndex - start));
        } else {
            return arr.get( newIndex);
        }
    }

    
    public static int findElement_Problem_1_ba652ac5_d67e_465d_971b_47483bcf543a(ArrayList<Integer> arr, ArrayList<ArrayList<Integer>> ranges, int rotations, int index) {
        // Write your code here
        int n = arr.size();
        int m = ranges.size();
        int[] prefix = new int[n];
        int[] suffix = new int[n];
        for (int i = 0; i < m; i++) {
            int l = ranges.get(i).get(0).intValue();
            int r = ranges.get(i).get(1).intValue();
            prefix[l]++;
            if (r + 1 < n) {
                suffix[r + 1]++;
            }
        }
        for (int i = 1; i < n; i++) {
            prefix[i] += prefix[i - 1];
        }
        for (int i = n - 2; i >= 0; i--) {
            suffix[i] += suffix[i + 1];
        }
        int[] cnt = new int[n];
        for (int i = 0; i < n; i++) {
            cnt[i] = prefix[i] + suffix[i];
        }
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            int j =  ((i + rotations * cnt[i]) % n);
            ans[j] = arr.get(i);
        }
        return ans[ index];
    }

    
    public static int findElement_Problem_2_ae2a41c5_e845_4058_af7a_023431fac1f8(ArrayList<Integer> arr, ArrayList<ArrayList<Integer>> ranges, int rotations, int index) {
        // Write your code here
        for (ArrayList<Integer> range : ranges) {
            int start = range.get(0);
            int end = range.get(1);
            int count = range.get(2);
            if (index >= start && index <= end) {
                index = index + count;
                if (index > arr.size() - 1) {
                    index = index - arr.size();
                }
            }
        }
        return arr.get( (index + rotations) % arr.size());
    }

    
    public static int findElement_Problem_1_c8f795f6_3b44_4ab0_8dab_fb68f605f2db(ArrayList<Integer> arr, ArrayList<ArrayList<Integer>> ranges, int rotations, int index) {
        // Write your code here
        // Return the element at index after rotations
        int n = arr.size();
        int mod = rotations % n;
        int start = 0;
        int end = 0;
        for (int i = 0; i < ranges.size(); i++) {
            start = ranges.get(i).get(0);
            end = ranges.get(i).get(1);
            if (index >= start && index <= end) {
                break;
            }
        }
        int diff = end - start + 1;
        int rot = mod % diff;
        int newIndex = (index - start + rot) % diff + start;
        return arr.get( newIndex);
    }

    
    public static int findElement_Problem_0_9cf1cf59_fec5_4ae4_be75_66a595f40f74(ArrayList<Integer> arr, ArrayList<ArrayList<Integer>> ranges, int rotations, int index) {
        // Write your code here
        int n = arr.size();
        int mod = rotations % n;
        int newIndex = (index - mod + n) % n;
        return arr.get(newIndex);
    }

    
    public static int findElement_Problem_1_e77ee594_0935_46c8_bc84_ebb1128f3423(ArrayList<Integer> arr, ArrayList<ArrayList<Integer>> ranges, int rotations, int index) {
        for (int i = 0; i < rotations; i++) {
            int first = arr.get(0);
            arr.remove(0);
            arr.add(first);
        }
        return arr.get(index);
    }

    
    public static int findElement_Problem_1_c2429241_74d9_4df9_8e18_9830d321b091(ArrayList<Integer> arr, ArrayList<ArrayList<Integer>> ranges, int rotations, int index) {
        // Write your code here
        for (ArrayList<Integer> range : ranges) {
            int start = range.get(0);
            int end = range.get(1);
            int temp = arr.get(start);
            for (int i = start; i < end; i++) {
                arr.set(i, arr.get((i + 1)));
            }
            arr.set(end, temp);
        }
        return arr.get(((index + rotations) % arr.size()));
    }

    
    public static int findElement_Problem_0_649e2b3c_5bba_4041_8a0c_94be8b62213b(ArrayList<Integer> arr, ArrayList<ArrayList<Integer>> ranges, int rotations, int index) {
        for (ArrayList<Integer> range : ranges) {
            int start = range.get(0);
            int end = range.get(1);
            int diff = end - start + 1;
            int rotationsLeft = rotations % diff;
            if (index >= start && index <= end) {
                if (rotationsLeft == 0) {
                    return arr.get( index);
                } else {
                    int newIndex = index - rotationsLeft;
                    if (newIndex < start) {
                        newIndex = end - (rotationsLeft - (index - start) - 1);
                    }
                    return arr.get( newIndex);
                }
            }
        }
        return -1;
    }

    
    public static int findElement_Problem_0_282a0630_07e1_43b6_9058_adf6dc7156ee(ArrayList<Integer> arr, ArrayList<ArrayList<Integer>> ranges, int rotations, int index) {
        // Write your code here
        for(ArrayList<Integer> range : ranges) {
            int start = range.get(0);
            int end = range.get(1);
            int temp = arr.get(start);
            for(int i = start; i < end; i++) {
                arr.set(i, arr.get(i+1));
            }
            arr.set(end, temp);
        }
        index = (index + rotations) % arr.size();
        return arr.get(index);
    }

    
    public static int findElement_Problem_1_ba943222_ed88_45c5_880e_dc8135bb7145(ArrayList<Integer> arr, ArrayList<ArrayList<Integer>> ranges, int rotations, int index) {
        // Write your code here
        int n = arr.size();
        int r = rotations % n;
        int i = index % n;
        int j = (i + r) % n;
        int k = (i + n - r) % n;
        int ans = 0;
        if (ranges.get(0).get(0) <= j && j <= ranges.get(0).get(1)) {
            ans = arr.get(j);
        } else if (ranges.get(1).get(0) <= j && j <= ranges.get(1).get(1)) {
            ans = arr.get(k);
        }
        return ans;
    }

    
    public static int findElement_Problem_0_22cf64d0_28f2_42c3_b789_30663f69fe40(ArrayList<Integer> arr, ArrayList<ArrayList<Integer>> ranges, int rotations, int index) {
        // Write your code here
        int n = arr.size();
        int mod = rotations % n;
        int start = index - mod;
        if (start < 0) {
            start += n;
        }
        return arr.get( start);
    }

    
    public static int findElement_Problem_1_57234164_b03d_43be_89df_d55cf8b3dbd8(ArrayList<Integer> arr, ArrayList<ArrayList<Integer>> ranges, int rotations, int index) {
        int result = 0;
        for(int i = 0; i < rotations; i++) {
            for(int j = 0; j < ranges.size(); j++) {
                if(arr.get(j) > ranges.get(j).get(0) && arr.get(j) < ranges.get(j).get(1)) {
                    result = arr.get(j);
                    break;
                }
            }
            arr.add(arr.get(0));
            arr.remove(0);
        }
        return result;
    }

    
    public static int findElement_Problem_2_f82c11c9_b1fc_41b3_8564_855d612f0175(ArrayList<Integer> arr, ArrayList<ArrayList<Integer>> ranges, int rotations, int index) {
        // Write your code here
        for(int i = 0; i < rotations; i++) {
            for(int j = 0; j < ranges.size(); j++) {
                int start = ranges.get(j).get(0);
                int end = ranges.get(j).get(1);
                int temp = arr.get(start);
                for(int k = start; k < end; k++) {
                    arr.set(k, arr.get(k+1));
                }
                arr.set(end, temp);
            }
        }
        return arr.get(index);
    }

    
    public static int findElement_Problem_0_f05f2b62_c095_4221_98fd_7ee9dafdca42(ArrayList<Integer> arr, ArrayList<ArrayList<Integer>> ranges, int rotations, int index) {
        int size = arr.size();
        int start = rotations % size;
        int end = (start + size - 1) % size;
        int count = 0;
        for (ArrayList<Integer> range : ranges) {
            int rangeStart = range.get(0);
            int rangeEnd = range.get(1);
            if (rangeStart <= start && end <= rangeEnd) {
                count += size;
            } else if (rangeStart <= start && start <= rangeEnd) {
                count += rangeEnd - start + 1;
            } else if (rangeStart <= end && end <= rangeEnd) {
                count += end - rangeStart + 1;
            } else if (start <= rangeStart && rangeEnd <= end) {
                count += rangeEnd - rangeStart + 1;
            }
        }
        int newIndex = (index + count) % size;
        return arr.get( newIndex);
    }

    
    public static int findElement_Problem_1_37c5ef50_9641_4a6a_94c5_38a2c66a1425(ArrayList<Integer> arr, ArrayList<ArrayList<Integer>> ranges, int rotations, int index) {
        // Write your code here
        int n = arr.size();
        int mod = rotations % n;
        int start = mod;
        int end = n - mod;
        for (ArrayList<Integer> range : ranges) {
            int l = range.get(0);
            int r = range.get(1);
            if (l <= start && r >= start) {
                start = r + 1;
            }
            if (l <= end && r >= end) {
                end = l - 1;
            }
        }
        int ans = -1;
        if (index >= start && index <= end) {
            ans = arr.get( (index - start));
        }
        return ans;
    }

    
    public static int findElement_Problem_0_eae7e2f8_5f80_401e_96cf_ed619b39044d(ArrayList<Integer> arr, ArrayList<ArrayList<Integer>> ranges, int rotations, int index) {
        int result = 0;
        for(int i = 0; i < ranges.size(); i++) {
            int start = ranges.get(i).get(0);
            int end = ranges.get(i).get(1);
            if(rotations >= start && rotations <= end) {
                result = arr.get(i);
                break;
            }
        }
        return result;
    }

    
    public static int findElement_Problem_1_203eb4b1_0313_43d4_a5ad_81926ad3cef7(ArrayList<Integer> arr, ArrayList<ArrayList<Integer>> ranges, int rotations, int index) {
        int result = -1;
        for (int i = 0; i < ranges.size(); i++) {
            if (ranges.get(i).get(0) <= rotations && ranges.get(i).get(1) >= rotations) {
                result = arr.get(i);
                break;
            }
        }
        return result;
    }

    
    public static int findElement_Problem_1_e2b28267_957d_4a5e_9a43_35a6a753bb3a(ArrayList<Integer> arr, ArrayList<ArrayList<Integer>> ranges, int rotations, int index) {
        int n = arr.size();
        int mod = rotations % n;
        int start = (n - mod) % n;
        int end = (start + n - 1) % n;
        int i = index;
        for (ArrayList<Integer> range : ranges) {
            int l = range.get(0);
            int r = range.get(1);
            if (l <= start && r >= end) {
                i = (i + mod) % n;
            } else if (l <= start && r < end) {
                if (i >= l && i <= r) {
                    i = (i + mod) % n;
                }
            } else if (l > start && r >= end) {
                if (i >= l || i <= r) {
                    i = (i + mod) % n;
                }
            } else if (l > start && r < end) {
                if (i >= l && i <= r) {
                    i = (i + mod) % n;
                }
            }
        }
        return arr.get( i);
    }

    
    public static int findElement_Problem_0_f2fcb8c2_a7de_46f5_beda_5241666499fe(ArrayList<Integer> arr, ArrayList<ArrayList<Integer>> ranges, int rotations, int index) {
        // Write your code here
        int n = arr.size();
        int m = ranges.size();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = arr.get(i);
        }
        int[] l = new int[m];
        int[] r = new int[m];
        for (int i = 0; i < m; i++) {
            l[i] = ranges.get(i).get(0);
            r[i] = ranges.get(i).get(1);
        }
        int[] d = new int[n];
        for (int i = 0; i < m; i++) {
            d[l[i]] += 1;
            if (r[i] + 1 < n) {
                d[r[i] + 1] -= 1;
            }
        }
        for (int i = 1; i < n; i++) {
            d[i] += d[i - 1];
        }
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            b[i] = a[i];
        }
        for (int i = 0; i < n; i++) {
            a[((i + d[i]) % n)] = b[i];
        }
        return a[index];
    }

    
    public static int findElement_Problem_0_428c136c_b245_4085_a659_3a793bb40463(ArrayList<Integer> arr, ArrayList<ArrayList<Integer>> ranges, int rotations, int index) {
        int n = arr.size();
        int m = ranges.size();
        int[] prefix = new int[n];
        int[] suffix = new int[n];
        for (int i = 0; i < m; i++) {
            int l = ranges.get(i).get(0);
            int r = ranges.get(i).get(1);
            prefix[l]++;
            if (r + 1 < n) {
                suffix[(r + 1)]++;
            }
        }
        for (int i = 1; i < n; i++) {
            prefix[i] += prefix[i - 1];
            suffix[i] += suffix[i - 1];
        }
        int[] rotations_array = new int[n];
        for (int i = 0; i < n; i++) {
            rotations_array[i] = prefix[i] - suffix[i];
        }
        int[] sorted_array = new int[n];
        for (int i = 0; i < n; i++) {
            int new_index = (i + rotations_array[i]) % n;
            sorted_array[new_index] = arr.get(i);
        }
        return sorted_array[index];
    }

    
    public static int findElement_Problem_0_08410af7_e1e7_4515_8643_07b0e813eb2d(ArrayList<Integer> arr, ArrayList<ArrayList<Integer>> ranges, int rotations, int index) {
        int rs = 0, re = 0;
        int l = 0, r = ranges.get(ranges.size() - 1).get(rs);
        for(int i = 0; i < ranges.size(); i++) {
            if(ranges.get(i).size() <= rs) {
                break;
            }
            l = ranges.get(i).get(rs);
            r = ranges.get(i).get(re);
            if(l == r) {
                r++;
                if(index == r) {
                    return l;
                }
                index -= l - r;
                rs = i;
                re = i + 1;
            }
            r++;
        }
        throw new IllegalArgumentException("Invalid number of rotations: " + rotations);
    }

    
    public static int findElement_Problem_0_7759fca2_e2a3_4585_8104_2ecfac76b6ec(ArrayList<Integer> arr, ArrayList<ArrayList<Integer>> ranges, int rotations, int index) {
        // TODO
        return 0;
    }

    
    public static int findElement_Problem_0_74598e44_556f_4331_a4c3_e848d1cd7573(ArrayList<Integer> arr, ArrayList<ArrayList<Integer>> ranges, int rotations, int index) {
        int n = arr.size();
        int m = ranges.size();
        for (int i = 0; i < m; i++) {
            int l = ranges.get(i).get(0).intValue();
            int r = ranges.get(i).get(1).intValue();
            int k = ranges.get(i).get(2).intValue();
            for (int j = 0; j < k; j++) {
                int temp = arr.get(l);
                for (int x = l; x < r; x++) {
                    arr.set(x, arr.get(x + 1));
                }
                arr.set(r, temp);
            }
        }
        return arr.get( ((index + rotations) % n));
    }

    
    public static int findElement_Problem_0_ed70f509_8cbb_4e2f_942d_2d2bf8104b76(ArrayList<Integer> arr, ArrayList<ArrayList<Integer>> ranges, int rotations, int index) {
        // Write your code here
        int[] arr2 = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            arr2[i] = arr.get(i);
        }
        for (int i = 0; i < rotations; i++) {
            for (int j = 0; j < ranges.size(); j++) {
                int start = ranges.get(j).get(0);
                int end = ranges.get(j).get(1);
                int temp = arr2[ start];
                for (int k = start; k < end; k++) {
                    arr2[ k] = arr2[ (k + 1)];
                }
                arr2[ end] = temp;
            }
        }
        return arr2[ index];
    }

    
    public static int findElement_Problem_0_82e7ca02_7904_4533_ba63_d6a5e3d3b8f0(ArrayList<Integer> arr, ArrayList<ArrayList<Integer>> ranges, int rotations, int index) {
        // Write your code here
        for (ArrayList<Integer> range : ranges) {
            int start = range.get(0);
            int end = range.get(1);
            int rotations_per_range = rotations % (end - start + 1);
            for (int i = 0; i < rotations_per_range; i++) {
                int temp = arr.get( (end - 1));
                arr.remove( (end - 1));
                arr.add( start, temp);
            }
        }
        return arr.get( index);
    }

    
    public static int findElement_Problem_1_a3f8a52a_7f32_4ad8_9871_3c283d3add7b(ArrayList<Integer> arr, ArrayList<ArrayList<Integer>> ranges, int rotations, int index) {
        int result = 0;
        for (int i = 0; i < ranges.size(); i++) {
            int start = ranges.get(i).get(0);
            int end = ranges.get(i).get(1);
            if (index >= start && index <= end) {
                result = arr.get(i);
                break;
            }
        }
        return result;
    }

    
    public static int findElement_Problem_1_9c980417_f3dc_4784_84fd_0fc16e82c11f(ArrayList<Integer> arr, ArrayList<ArrayList<Integer>> ranges, int rotations, int index) {
        // Write your code here
        int n = arr.size();
        int mod = rotations % n;
        int start = 0;
        int end = n - 1;
        int mid = 0;
        while (start <= end) {
            mid = (start + end) / 2;
            if (mid == index) {
                break;
            } else if (mid < index) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        int ans = arr.get( ((mid + mod) % n));
        return ans;
    }

    
    public static int findElement_Problem_2_cbf83827_e3cc_4627_b6f2_a21d0791a43f(ArrayList<Integer> arr, ArrayList<ArrayList<Integer>> ranges, int rotations, int index) {
        // Write your code here
        int n = arr.size();
        int m = ranges.size();
        int[] a = new int[n];
        for(int i = 0; i < n; i++) {
            a[i] = arr.get(i);
        }
        for(int i = 0; i < m; i++) {
            int l = ranges.get(i).get(0).intValue();
            int r = ranges.get(i).get(1).intValue();
            int temp = a[l];
            for(int j = l; j < r; j++) {
                a[j] = a[j+1];
            }
            a[r] = temp;
        }
        return a[((index + rotations) % n)];
    }

    
    public static int findElement_Problem_1_49e9d528_81fb_4a5e_bb5e_8d9c996da078(ArrayList<Integer> arr, ArrayList<ArrayList<Integer>> ranges, int rotations, int index) {
        // Write your code here
        int n = arr.size();
        int r = rotations % n;
        int i = index - r;
        if (i < 0) {
            i += n;
        }
        return arr.get( i);
    }

    
    public static int findElement_Problem_0_5dc9b8ac_e716_4517_bd35_070529ef69e8(ArrayList<Integer> arr, ArrayList<ArrayList<Integer>> ranges, int rotations, int index) {
        for (ArrayList<Integer> range : ranges) {
            int start = range.get(0);
            int end = range.get(1);
            int temp = arr.get( start);
            for (int i = start; i < end; i++) {
                arr.set( i, arr.get( (i + 1)));
            }
            arr.set( end, temp);
        }
        return arr.get( ((index + rotations) % arr.size()));
    }

    
    public static int findElement_Problem_1_f578deca_044a_48c4_81b1_78f9d0a2210b(ArrayList<Integer> arr, ArrayList<ArrayList<Integer>> ranges, int rotations, int index) {
        // Write your code here
        int n = arr.size();
        int r = rotations % n;
        int i = index - r;
        if (i < 0) {
            i += n;
        }
        return arr.get( i);
    }

    
    public static int findElement_Problem_2_46d92681_b829_44e5_a81c_632d0f36d7bb(ArrayList<Integer> arr, ArrayList<ArrayList<Integer>> ranges, int rotations, int index) {
        int len = arr.size();
        int mod = rotations % len;
        int realIndex = (index + mod) % len;
        return arr.get( realIndex);
    }

    
    public static int findElement_Problem_0_5eab341c_ee20_443c_8ebe_57a843c08d91(ArrayList<Integer> arr, ArrayList<ArrayList<Integer>> ranges, int rotations, int index) {
        for (ArrayList<Integer> range : ranges) {
            int start = range.get(0);
            int end = range.get(1);
            int temp = arr.get(start);
            for (int i = start; i < end; i++) {
                arr.set(i, arr.get((i + 1)));
            }
            arr.set(end, temp);
        }
        return arr.get(((index + rotations) % arr.size()));
    }

    
    public static int findElement_Problem_2_5c7ae939_65a4_42b4_866a_c0cf961f3393(ArrayList<Integer> arr, ArrayList<ArrayList<Integer>> ranges, int rotations, int index) {
        // Write your code here
        int n = arr.size();
        int m = ranges.size();
        int[] cnt = new int[n];
        for (int i = 0; i < m; i++) {
            int l = ranges.get(i).get(0).intValue();
            int r = ranges.get(i).get(1).intValue();
            cnt[l]++;
            if (r + 1 < n) {
                cnt[r + 1]--;
            }
        }
        for (int i = 1; i < n; i++) {
            cnt[i] += cnt[i - 1];
        }
        for (int i = 0; i < n; i++) {
            cnt[i] = (cnt[i] +  rotations) % n;
        }
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            ans[(i + cnt[i]) % n] = arr.get(i);
        }
        return ans[ index];
    }

    
    public static int findElement_Problem_1_826f2137_b1e0_4adc_a66d_956635548f71(ArrayList<Integer> arr, ArrayList<ArrayList<Integer>> ranges, int rotations, int index) {
        int i = 0;
        boolean found = False;

        while (i < ranges.size() && !found) {
            int j = 0;

            while (j < ranges.get(i).size() && !found) {
                if (ranges.get(i).get(j) > index && ranges.get(i).get(j) < index + rotations) {
                    found = True;
                    System.out.println("Element is " + ranges.get(i).get(j));
                }
                j++;
            }
            i++;
        }

        if (!found) {
            System.out.println("Element is " + 0);
        }

        return 0;
    }

    
    public static int findElement_Problem_2_183e7f82_9032_4092_9059_ade8b2b696b9(ArrayList<Integer> arr, ArrayList<ArrayList<Integer>> ranges, int rotations, int index) {
        int result = 0;
        for (int i = 0; i < rotations; i++) {
            int indexOfElement = arr.indexOf(index);
            if (indexOfElement == -1) {
                return result;
            }
            index = arr.get(indexOfElement);
        }
        return index;
    }

    
    public static int findElement_Problem_0_268aeaaa_dfc5_4659_bb18_ae9d980ce872(ArrayList<Integer> arr, ArrayList<ArrayList<Integer>> ranges, int rotations, int index) {
        int size = arr.size();
        int mod = rotations % size;
        int start = index - mod;
        int end = index + (size - mod);
        int result = 0;
        for (ArrayList<Integer> range : ranges) {
            int rStart = range.get(0);
            int rEnd = range.get(1);
            if (rStart <= start && rEnd >= start) {
                result += (rEnd - start + 1);
            } else if (rStart <= end && rEnd >= end) {
                result += (end - rStart + 1);
            } else if (rStart >= start && rEnd <= end) {
                result += (rEnd - rStart + 1);
            }
        }
        return result;
    }

    
    public static int findElement_Problem_1_5646994d_447e_4082_aff9_0747c4898cca(ArrayList<Integer> arr, ArrayList<ArrayList<Integer>> ranges, int rotations, int index) {
        // Write your code here
        for(ArrayList<Integer> range: ranges) {
            int start = range.get(0);
            int end = range.get(1);
            int diff = end - start + 1;
            int rotations_left = rotations % diff;
            if(index >= start && index <= end) {
                if(index + rotations_left <= end) {
                    index += rotations_left;
                } else {
                    index = start + (rotations_left - (end - index) - 1);
                }
            }
        }
        return arr.get(index);
    }

    
    public static int findElement_Problem_2_277c9a60_4070_49eb_b11b_3d265788848a(ArrayList<Integer> arr, ArrayList<ArrayList<Integer>> ranges, int rotations, int index) {
        // Write your code here
        // Return the element at index after rotations
        int n = arr.size();
        int m = ranges.size();
        int[] range = new int[2];
        for (int i = 0; i < m; i++) {
            range[0] = ranges.get(i).get(0);
            range[1] = ranges.get(i).get(1);
            int diff = range[1] - range[0] + 1;
            int r = rotations % diff;
            if (r == 0) {
                continue;
            }
            int start = range[0];
            int end = range[1];
            int[] temp = new int[ diff];
            for (int j = 0; j < diff; j++) {
                temp[j] = arr.get( (start + j));
            }
            for (int j = 0; j < diff; j++) {
                arr.set( (start + j), temp[ ((j + r) % diff)]);
            }
        }
        return arr.get( index);
    }

}
