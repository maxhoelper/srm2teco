package mbpp_101_kth_element;

public class mbpp_101_kth_element {

    
    public static int kthElement_Problem_2_2d59d779_b240_45a7_b8ca_243697bc3e8c(ArrayList<Integer> arr, int k) {
        int sum = 0;
        int lastElement = arr.get(arr.size() - 1);
        int currentElement = arr.get(0);
        int count = 0;
        for(int i = 1; i < arr.size(); i++) {
            sum += currentElement;
            currentElement = arr.get(i);
            if(sum == k) {
                count++;
            }
        }
        return count;
    }

    
    public static int kthElement_Problem_2_4d74c808_5f24_44b4_b282_f156c0c7cb50(ArrayList<Integer> arr, int k) {
        int result = -1;
        int count = 0;
        for (Integer i : arr) {
            if (count == k - 1) {
                result = i;
                break;
            }
            count++;
        }
        return result;
    }

    
    public static int kthElement_Problem_1_580a8159_0c1e_49b2_8050_f6456376b0cf(ArrayList<Integer> arr, int k) {
        // Write your code here
        // To print results to the standard output you can use System.out.println()
        // Example: System.out.println("Hello world!");
        return arr.get( k - 1);
    }

    
    public static int kthElement_Problem_0_6bc3b413_e1c6_4cdd_9cb0_2c452b403fa2(ArrayList<Integer> arr, int k) {
        Collections.sort(arr);
        int lastElem = arr.get(arr.size() - 1);
        int currElem = lastElem;
        int count = 0;
        for (int elem : arr) {
            currElem = elem;
            count++;
            if (count == k) {
                break;
            }
        }
        return currElem;
    }

    
    public static int kthElement_Problem_1_af09fbf7_50b9_4de1_b363_7cfc18acc71b(ArrayList<Integer> arr, int k) {
        int result = 0;
        int sum = 0;
        for(int i = 1; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum == k) {
                result = arr.get(i);
                break;
            }
        }
        return result;
    }

    
    public static int kthElement_Problem_1_d126c6ac_0ebe_4dbf_acc7_8925450cfbed(ArrayList<Integer> arr, int k) {
        // Declare and initialise variables
        int size = arr.size();
        int count = 0;
        int kthElement_Problem_1_d126c6ac_0ebe_4dbf_acc7_8925450cfbed = 0;
        int firstElement = arr.get(0);
        int lastElement = arr.get(size);
        int midElement = firstElement;

        // Perform binary search for desired value
        while (count < size - 1) {
            midElement = (firstElement + lastElement) / 2;
            if (midElement > lastElement) lastElement = midElement;
            else if (midElement < firstElement) firstElement = midElement;
            else { // Found element
                kthElement_Problem_1_d126c6ac_0ebe_4dbf_acc7_8925450cfbed = midElement;
                count++;
            }
        }

        // Return kth element
        return kthElement_Problem_1_d126c6ac_0ebe_4dbf_acc7_8925450cfbed;
    }

    
    public static int kthElement_Problem_0_be2adfdb_646a_4be0_8286_7804d75a89a7(ArrayList<Integer> arr, int k) {
        // your code goes here
        int pivot = arr.get(arr.size()/2);
        int start = 0, end = arr.size()-1;
        while(arr.get(start) < pivot && start < end) start++;
        while(arr.get(end) > pivot && start < end) end--;
        if(arr.get(start) < pivot && arr.get(end) > pivot) {
            if(k < arr.get(start)) return kthElement_Problem_0_be2adfdb_646a_4be0_8286_7804d75a89a7(arr,k);
            else if(k > arr.get(start)) return kthElement_Problem_0_be2adfdb_646a_4be0_8286_7804d75a89a7(arr,k-arr.get(start)-1);
            else return arr.get(start);
        }
        else if(arr.get(start) < pivot && k < arr.get(start)) return kthElement_Problem_0_be2adfdb_646a_4be0_8286_7804d75a89a7(arr,k);
        else if(arr.get(end) > pivot && k > arr.get(end)) return kthElement_Problem_0_be2adfdb_646a_4be0_8286_7804d75a89a7(arr,k-arr.get(end)-1);
        else return arr.get(end);
    }

    
    public static int kthElement_Problem_1_6cc42d17_cdde_4a66_b12a_97566e7f14d7(ArrayList<Integer> arr, int k) {
        Integer result = 0L;
        if (arr.isEmpty()) {
            return result;
        }
        int i = 0;
        int n = arr.size()-1;
        while(i<n && arr.get(i)<k) {
            i++;
        }
        if (i<n && arr.get(i) == k) {
            result = arr.get(i);
        } else {
            int j = i-1;
            while(j>=0 && arr.get(j)>k) {
                j--;
            }
            result = arr.get(j+1);
        }
        return result;
    }

    
    public static int kthElement_Problem_2_585bbaf7_3c07_482b_a614_e8024ac38b65(ArrayList<Integer> arr, int k) {
        // Write your code here
        // To print results to the standard output you can use System.out.println()
        // Example: System.out.println("Hello world!");
        return arr.get(k-1);
    }

    
    public static int kthElement_Problem_0_e3cedc1f_c647_433b_8efe_833bb40c067d(ArrayList<Integer> arr, int k) {
        // Your code here
        int kth = arr.indexOf(k);
        if(kth != -1){
            return arr.get(kth);
        }
        else{
            return -1;
        }
    }

    
    public static int kthElement_Problem_2_f8b9ca0f_47f9_44cf_8704_4ead071dfac1(ArrayList<Integer> arr, int k) {
        // Write your code here
        // To print results to the standard output you can use System.out.println()
        // Example: System.out.println("Hello world!");
        return arr.get(k-1);
    }

    
    public static int kthElement_Problem_2_e5376d05_b6f1_4343_a6f6_1e6e85ed1a66(ArrayList<Integer> arr, int k) {
        // Write your code here
        // To print results to the standard output you can use System.out.println()
        // Example: System.out.println("Hello world!");
        return arr.get(k-1);
    }

    
    public static int kthElement_Problem_2_88f1823a_e4a9_4986_b417_12d60b1f55e3(ArrayList<Integer> arr, int k) {
        // your code goes here
        Collections.sort(arr);
        for(int i=0;i<arr.size();i++){
            if(k==arr.get(i)){
                return arr.get(i);
            }
        }
        return 0;
    }

    
    public static int kthElement_Problem_1_be3286a0_d0a0_4df9_9fef_a507d1d120a4(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 1; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum == k) {
                return arr.get(i);
            }
        }
        return -1;
    }

    
    public static int kthElement_Problem_1_6d8a4993_d4f7_415e_aba0_c0ccad5d4619(ArrayList<Integer> arr, int k) {
        // Write your code here
        // To print results to the standard output you can use System.out.println()
        // Example: System.out.println("Hello world!");
        return arr.get(k-1);
    }

    
    public static int kthElement_Problem_0_901a3da0_4e0f_4c65_a2dc_14d033ef93f9(ArrayList<Integer> arr, int k) {
        int result = 0;
        if(arr.size()==0 || k<=0) return result;
        int index = arr.size()-1;
        while(index>=0 && arr.get(index) != k) index--;
        return arr.get(index);
    }

    
    public static int kthElement_Problem_2_762164ae_3f43_47f8_b48b_b12f4cd83c72(ArrayList<Integer> arr, int k) {
        // Write your code here
        // To print results to the standard output you can use System.out.println()
        // Example: System.out.println("Hello world!");
        return arr.get(k-1);
    }

    
    public static int kthElement_Problem_2_ffef77ca_04d6_487a_bef9_dad2958d464f(ArrayList<Integer> arr, int k) {
        int sum = 0;
        int count = 0;
        for(int i = 1; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum == k) {
                count++;
            }
        }
        return count;
    }

    
    public static int kthElement_Problem_0_93c733f3_ffc9_43e0_8d0b_55bb9c33f2bd(ArrayList<Integer> arr, int k) {
        return arr.get(k - 1);
    }

    
    public static int kthElement_Problem_0_8179afbe_d867_410a_8eb0_22f753a334a9(ArrayList<Integer> arr, int k) {
        int result = -1;
        int sum = 0;
        int temp;
        for(int i = 1; i < arr.size(); i++) {
            temp = arr.get(i);
            sum += temp;
            if(sum == k) {
                result = temp;
                break;
            }
        }
        return result;
    }

    
    public static int kthElement_Problem_2_d92da836_3df6_44a1_a204_5ee4f9da4711(ArrayList<Integer> arr, int k) {
        int sum = 0;
        int sumOfSquares = 0;
        for(int i = 1; i < arr.size(); i++) {
            sum += arr.get(i);
            sumOfSquares += arr.get(i) * arr.get(i);
        }
        int kthElement_Problem_2_d92da836_3df6_44a1_a204_5ee4f9da4711 = sum / k;
        int kthElement_Problem_2_d92da836_3df6_44a1_a204_5ee4f9da4711OfSquares = sumOfSquares / k;
        return kthElement_Problem_2_d92da836_3df6_44a1_a204_5ee4f9da4711 * kthElement_Problem_2_d92da836_3df6_44a1_a204_5ee4f9da4711OfSquares;
    }

    
    public static int kthElement_Problem_1_eb91f602_2a20_444f_9605_3600c7f1c614(ArrayList<Integer> arr, int k) {
        if (k > arr.size())
            return -1;
        int len = arr.size();
        if (k == 0 || k > len) {
            return -1;
        }
        int curr = -1;
        int prev = arr.get(0);
        int ans = 0;
        int m = len / 2;
        for (int i = 0; i < m; i++) {
            if (k > 1) {
                k--;
            }
            int next = arr.get(i);
            int diff = (next - prev);
            if (diff < 0 || diff > curr) {
                ans = next;
                curr = diff;
            }
            prev = next;
        }
        return ans;
    }

    
    public static int kthElement_Problem_0_9b374ab8_6db0_4fd5_8c8e_afb22dd20cbe(ArrayList<Integer> arr, int k) {
        int sum = 0;
        int max = arr.get(0);
        int min = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            sum += arr.get(i);
            if (sum > k) {
                max = arr.get(i);
            } else if (sum < k) {
                min = arr.get(i);
            }
        }
        return max;
    }

    
    public static int kthElement_Problem_0_3b721bb6_552f_40c4_8943_421413977f2a(ArrayList<Integer> arr, int k) {
        // Write your code here
        return arr.get(k-1);
    }

    
    public static int kthElement_Problem_0_7a5dbde1_41da_4d32_ab3b_98692226ad38(ArrayList<Integer> arr, int k) {
        int i = 0, j = arr.size() - 1;
        while (i < j) {
            int mid = arr.get(i + (j - i) / 2);
            if (mid == k) return mid;
            if (mid > k) {
                j = i + (j - i) / 2;
            } else {
                i = i + (j - i) / 2 + 1;
            }
        }
        return arr.get(i);
    }

    
    public static int kthElement_Problem_1_0bbc14c1_4be9_40c3_942e_aabc934caee8(ArrayList<Integer> arr, int k) {
        int sum = 0;
        int temp = 0;
        for(int i = 1; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum == k) {
                temp = arr.get(i);
                break;
            }
        }
        return temp;
    }

    
    public static int kthElement_Problem_1_4181106f_0acf_49cb_b0c1_577ae451dcf6(ArrayList<Integer> arr, int k) {
        int min = arr.get(0);
        int max = arr.get(0);

        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) < min) min = arr.get(i);
            if (arr.get(i) > max) max = arr.get(i);
        }

        int mid = (max + min) / 2;
        int count = 0;

        while (k >= count) {
            if (mid < arr.get(arr.size() - 1))
                mid = (mid + max) / 2; // find the mid point of the array list
            else
                mid = (mid - min) / 2;
            count++;
        }

        return mid;
    }

    
    public static int kthElement_Problem_1_aa7a97e8_8d79_4ff6_8782_d0c6af497f77(ArrayList<Integer> arr, int k) {
        int i = 0, j = 0;
        while (i < arr.size()) {
            j = arr.indexOf(arr.get(i));
            if (i == j) {
                i++;
                continue;
            }
            if (i < k) {
                arr.add(arr.get(j));
                arr.remove(j);
                i++;
                j--;
                continue;
            }
            break;
        }
        if (i < k) {
            return arr.get(0);
        }
        return arr.get(arr.size() - 1);
    }

    
    public static int kthElement_Problem_0_8ba18f07_90ba_4f82_8951_eed5e373655a(ArrayList<Integer> arr, int k) {
        // Write your code here
        // To print results to the standard output you can use System.out.println()
        // Example: System.out.println("Hello world!");
        int result = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == k) {
                result = arr.get(i);
            }
        }
        return result;
    }

    
    public static int kthElement_Problem_1_ac8cf698_1ee6_4abc_9673_1179dc587346(ArrayList<Integer> arr, int k) {
        // Write your code here
        return arr.get(k-1);
    }

    
    public static int kthElement_Problem_0_2ae6f64b_d6d7_4bc4_8930_2a0f822fc158(ArrayList<Integer> arr, int k) {
        int firstElement = arr.get(0);
        int lastElement = arr.get(arr.size()-1);
        int firstElementIndex = arr.indexOf(firstElement);
        int lastElementIndex = arr.lastIndexOf(lastElement);
        return ((firstElementIndex+lastElementIndex)/2)+(k-firstElementIndex)/arr.size()+1;
    }

    
    public static int kthElement_Problem_1_e7d7c7e2_c70a_4795_aa35_3c3e1c5c2995(ArrayList<Integer> arr, int k) {
        // Write your code here
        // To print results to the standard output you can use System.out.println()
        // Example: System.out.println("Hello world!");
        int result = 0;
        if (arr.size() >= k) {
            result = arr.get( k - 1);
        }
        return result;
    }

    
    public static int kthElement_Problem_2_20f73132_3753_4773_8d5e_eab8efc45b16(ArrayList<Integer> arr, int k) {
        return arr.get( k - 1);
    }

    
    public static int kthElement_Problem_1_322f4598_bbd8_4144_ace1_186b31238e14(ArrayList<Integer> arr, int k) {
        // your code goes here
        int i = 0;
        int j = arr.size() - 1;
        int x = 0;
        int y = 0;
        while (i <= j) {
            x = arr.get(i);
            y = arr.get(j);
            if (x > y) {
                i++;
            } else if (x < y) {
                j--;
            } else {
                if (k == 1) {
                    return arr.get(i);
                }
                k--;
                i++;
                j--;
            }
        }
        return x;
    }

    
    public static int kthElement_Problem_1_d15a3b06_6e4c_47a3_bd7f_0ed4050e16c4(ArrayList<Integer> arr, int k) {
        int n = arr.size();
        int start = 0;
        int end = n - 1;
        while (start < end) {
            int mid = start + ((end - start) / 2);
            if (arr.get(mid) == k) {
                return arr.get(mid);
            }
            if (arr.get(mid) < k) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        if (start == end) {
            return arr.get(start);
        }
        return -1;
    }

    
    public static int kthElement_Problem_0_f1e60fc7_052c_419a_b148_2eef48050c1a(ArrayList<Integer> arr, int k) {
        // Write your code here
        // To print results to the standard output you can use System.out.println()
        // Example: System.out.println("Hello world!");
        return arr.get(k-1);
    }

    
    public static int kthElement_Problem_0_18c9c29d_2bc0_4ebc_be6e_3da0c9ed0d5f(ArrayList<Integer> arr, int k) {
        // Write your code here
        // To print results to the standard output you can use System.out.println()
        // Example: System.out.println("Hello world!");
        return arr.get(k-1);
    }

    
    public static int kthElement_Problem_2_f0edd23e_7eaa_4cc0_b89d_1a5a9a154e36(ArrayList<Integer> arr, int k) {
        // Write your code here
        // To print results to the standard output you can use System.out.println()
        // Example: System.out.println("Hello world!");
        return arr.get(k-1);
    }

    
    public static int kthElement_Problem_1_23e30f0c_993b_407e_96f8_5d26260ba4e4(ArrayList<Integer> arr, int k) {
        //Your code here
        return 0;
    }

    
    public static int kthElement_Problem_1_bd661d08_91c5_4020_a07b_cf439f427626(ArrayList<Integer> arr, int k) {
        int count = 0;
        for(int i: arr) {
            count ++;
            if(count == k) return i;
        }
        return -1;
    }

    
    public static int kthElement_Problem_0_454b2595_2122_4d75_9350_a4e259021cfa(ArrayList<Integer> arr, int k) {
        // Write your code here
        return arr.get(k-1);
    }

    
    public static int kthElement_Problem_1_43d47d6d_f584_4c4b_ae77_afd447835d66(ArrayList<Integer> arr, int k) {
        // Write your code here
        return arr.get(k-1);
    }

    
    public static int kthElement_Problem_1_88f1823a_e4a9_4986_b417_12d60b1f55e3(ArrayList<Integer> arr, int k) {
        // your code goes here
        Collections.sort(arr);
        for(int i=0;i<arr.size();i++){
            if(k==arr.get(i)){
                return arr.get(i);
            }
        }
        return 0;
    }

    
    public static int kthElement_Problem_1_6be018ec_9d7b_4d7f_b443_be694bcdb177(ArrayList<Integer> arr, int k) {
        int sum = 0;
        int sumOfSquares = 0;
        int kthElement_Problem_1_6be018ec_9d7b_4d7f_b443_be694bcdb177 = -1;
        for(int i = 1; i < arr.size(); i++) {
            sum += arr.get(i);
            sumOfSquares += arr.get(i) * arr.get(i);
            if(sum == k) {
                kthElement_Problem_1_6be018ec_9d7b_4d7f_b443_be694bcdb177 = i;
                break;
            }
        }
        return kthElement_Problem_1_6be018ec_9d7b_4d7f_b443_be694bcdb177;
    }

    
    public static int kthElement_Problem_0_e7d7c7e2_c70a_4795_aa35_3c3e1c5c2995(ArrayList<Integer> arr, int k) {
        // Write your code here
        // To print results to the standard output you can use System.out.println()
        // Example: System.out.println("Hello world!");
        int result = 0;
        if (arr.size() >= k) {
            result = arr.get( k - 1);
        }
        return result;
    }

    
    public static int kthElement_Problem_0_45e4c34e_6f98_4bf8_a0e0_4705554bf7a4(ArrayList<Integer> arr, int k) {
        int nthElem = -1;
        for (int i : arr) {
            nthElem = i;
        }
        return nthElem;
    }

    
    public static int kthElement_Problem_2_c67f2ee6_a3c4_4dee_a8f7_c308adc225f4(ArrayList<Integer> arr, int k) {
        // Write your code here
        // To print results to the standard output you can use System.out.println()
        // Example: System.out.println("Hello world!");
        return arr.get(k-1);
    }

    
    public static int kthElement_Problem_2_8d9d293d_1e47_4cc6_88dd_f0c54cf9ba86(ArrayList<Integer> arr, int k) {
        int sum = 0;
        int count = 0;
        for(int i = 1; i < arr.size(); i++) {
            sum += arr.get(i);
            count++;
            if(count == k) {
                return sum;
            }
        }
        return -1;
    }

    
    public static int kthElement_Problem_1_8af8cedf_8ae7_4c1a_a8ea_1d3aa5555ea1(ArrayList<Integer> arr, int k) {
        // Write your code here
        return arr.get(k-1);
    }

    
    public static int kthElement_Problem_2_cc890280_d125_4926_88c3_234a7770bdd9(ArrayList<Integer> arr, int k) {
        if(k > arr.size()) return -1;
        
        for(int i = 0; i < arr.size(); i++) {
            if(k == arr.get(i)) return i+1;
        }
        return -1;
    }

    
    public static int kthElement_Problem_1_4d74c808_5f24_44b4_b282_f156c0c7cb50(ArrayList<Integer> arr, int k) {
        int result = -1;
        int count = 0;
        for (Integer i : arr) {
            if (count == k - 1) {
                result = i;
                break;
            }
            count++;
        }
        return result;
    }

    
    public static int kthElement_Problem_1_d8b81607_5721_4097_a58b_e843f0fefeb3(ArrayList<Integer> arr, int k) {
        int i = 0;
        int j = arr.size() - 1;
        while(j > i) {
            int mid = (j + i) / 2;
            if(arr.get(mid) == k) {
                return arr.get(mid);
            } else if(arr.get(mid) < k) {
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }
        return -1;
    }

    
    public static int kthElement_Problem_1_c6ebfc35_7ed7_4208_bf11_4ae941379bd3(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 1; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum == k) {
                return arr.get(i);
            }
        }
        return -1;
    }

    
    public static int kthElement_Problem_2_489d0124_a731_42a9_82c2_d257db13b699(ArrayList<Integer> arr, int k) {
        return arr.get( (k-1));
    }

    
    public static int kthElement_Problem_1_fb2b0494_f510_4bff_9d42_9ae7f229ff56(ArrayList<Integer> arr, int k) {
        // Write your code here
        // To print results to the standard output you can use System.out.println()
        // Example: System.out.println("Hello world!");
        Collections.sort(arr);
        return arr.get(k-1);
    }

    
    public static int kthElement_Problem_1_b083aeea_ff8d_438b_b177_c2d00e6b01d2(ArrayList<Integer> arr, int k) {
        return arr.get(k - 1);
    }

    
    public static int kthElement_Problem_2_790a2d74_fb6a_4ec9_9e18_633e5f6051c1(ArrayList<Integer> arr, int k) {
        // Write your code here
        // To print results to the standard output you can use System.out.println()
        // Example: System.out.println("Hello world!");
        return arr.get(k-1);
    }

    
    public static int kthElement_Problem_0_66d85690_26f1_4214_9bca_cae995f38bd8(ArrayList<Integer> arr, int k) {
        int res = arr.get(0); // first element
        if (k == 0) return res;
        int next = 0;
        for (int i = 1; i < k; i++) // loop from i = 1 to k = length-1 to find kth element
        {
            next = arr.get(i); // next element in i
            if (next < res)
            {
                int temp = res; // store previous value in temp
                res = next; // update res 
                k = i; // update k 
            }
        }
        return res;
    }

    
    public static int kthElement_Problem_0_defd7a59_331c_4920_ada2_1aa0f04093da(ArrayList<Integer> arr, int k) {
        return arr.get(k-1);
    }

    
    public static int kthElement_Problem_2_bd22913e_3e5d_485c_b87a_8a7320cc8269(ArrayList<Integer> arr, int k) {
        // Write your code here
        // To print results to the standard output you can use System.out.println()
        // Example: System.out.println("Hello world!");
        return arr.get(k-1);
    }

    
    public static int kthElement_Problem_2_ad19bc56_1c31_4e56_891f_0fc2b2910d2d(ArrayList<Integer> arr, int k) {
        int result = -1;
        int sum = 0;
        for(int i = 1; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum == k) {
                result = arr.get(i-1);
                break;
            }
        }
        return result;
    }

    
    public static int kthElement_Problem_1_c7c4f2a2_8a9f_4e69_aff2_ccfe62b33859(ArrayList<Integer> arr, int k) {
        int count = 0;
        for (Integer i : arr) {
            count++;
            if (count == k) {
                return i;
            }
        }
        return -1;
    }

    
    public static int kthElement_Problem_1_50cf23eb_e7bf_4b3e_8b08_d433ffa5baec(ArrayList<Integer> arr, int k) {
        int counter = arr.get(0);
        for (int i : arr)
            counter -= i;
        return k * counter;
    }

    
    public static int kthElement_Problem_1_e87d3860_bc1c_420c_96ec_8454770b3531(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if (sum >= k) {
                return arr.get(i);
            }
        }
        return arr.get(arr.size() - 1);
    }

    
    public static int kthElement_Problem_0_a748ad2a_6af3_4887_ba1e_dd3d363b4a3b(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 1; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum == k) {
                return arr.get(i);
            }
        }
        return -1;
    }

    
    public static int kthElement_Problem_1_f4c474ff_3019_445a_a356_c1fee8054deb(ArrayList<Integer> arr, int k) {
        int ans = 1L;
        int l = arr.size() - 1;
        int m = l - k;
        int temp = 0;
        for(int i = 0; i < k; i++) {
            temp += arr.get(i);
        }
        temp = temp / k;
        ans = temp * (k + 1);
        return ans;
    }

    
    public static int kthElement_Problem_0_fda6d31c_f69a_4af9_9997_d2f6cc9a21d9(ArrayList<Integer> arr, int k) {
        return arr.get(k-1);
    }

    
    public static int kthElement_Problem_0_a8a0adfd_bb6a_44e5_9c9f_168314b6e280(ArrayList<Integer> arr, int k) {
        int sum = 0;
        int max = arr.get(0);
        int min = arr.get(0);
        int mid = 0;
        for(int i = 1; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum > k) {
                max = arr.get(i);
            }
            else if(sum < k) {
                min = arr.get(i);
            }
            else if(sum == k) {
                mid = arr.get(i);
            }
        }
        return mid;
    }

    
    public static int kthElement_Problem_0_be3286a0_d0a0_4df9_9fef_a507d1d120a4(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 1; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum == k) {
                return arr.get(i);
            }
        }
        return -1;
    }

    
    public static int kthElement_Problem_2_901a3da0_4e0f_4c65_a2dc_14d033ef93f9(ArrayList<Integer> arr, int k) {
        int result = 0;
        if(arr.size()==0 || k<=0) return result;
        int index = arr.size()-1;
        while(index>=0 && arr.get(index) != k) index--;
        return arr.get(index);
    }

    
    public static int kthElement_Problem_1_7af08916_84b4_4311_83ee_15a3e2f3e1d7(ArrayList<Integer> arr, int k) {
        // Write your code here
        return arr.get(k-1);
    }

    
    public static int kthElement_Problem_0_8d77793f_a35b_4faa_b554_36a5a4e49717(ArrayList<Integer> arr, int k) {
        int j = 0;
        for(int i = 0;i < arr.size();i++) {
            if(j == k) {
                return arr.get(i);
            }
            j++;
        }
        throw new IllegalArgumentException();
    }

    
    public static int kthElement_Problem_2_5e31a264_a45d_49f1_beaf_3eca78019d8c(ArrayList<Integer> arr, int k) {
        int count = 0;
        int firstVal = arr.get(0);
        int lastVal = arr.get(arr.size() - 1);
        int middleVal = (firstVal + lastVal) / 2;

        // if the k is 0, the given array is empty and 0 index is returned
        if (k == 0) {
            return firstVal;
        }

        // If k is less than the length of the array arr, then return -1
        if (k >= arr.size()) {
            return -1;
        }

        int previousVal = firstVal;
        // If k is even, then the middle value is the kth element of the given array.
        if (k % 2 == 0) {
            return middleVal;
        }

        // For every odd k, calculate the difference between previous kth element and middle value
        // and increment the count as per formula above
        for (int i = 1; i <= k; i++) {
            int temp = previousVal - middleVal;
            previousVal = middleVal;
            middleVal = temp;
            count++;
        }

        // If the kth element is not in the given array, then return -1
        if (count < k) {
            return -1;
        }

        // If the kth element is found at index k, then return the kth element
        return middleVal;
    }

    
    public static int kthElement_Problem_1_0e56e65a_c2ab_46fc_9ec9_32d11d309014(ArrayList<Integer> arr, int k) {
        // Write your code here
        // To print results to the standard output you can use System.out.println()
        // Example: System.out.println("Hello world!");
        return arr.get(k-1);
    }

    
    public static int kthElement_Problem_1_8dab18d0_b7c6_4271_94a2_f4ed1f540ec2(ArrayList<Integer> arr, int k) {
        Collections.sort(arr);
        return arr.get( k - 1);
    }

    
    public static int kthElement_Problem_2_14e6879d_36ee_42af_a16d_aff5a3d41ed7(ArrayList<Integer> arr, int k) {
        // Write your code here
        // To print results to the standard output you can use System.out.println()
        // Example: System.out.println("Hello world!");
        return arr.get(k-1);
    }

    
    public static int kthElement_Problem_0_dfed0aed_b537_4372_9147_857d54b7d2fc(ArrayList<Integer> arr, int k) {
        // Write your code here
        // To print results to the standard output you can use System.out.println()
        // Example: System.out.println("Hello world!");
        return arr.get(k-1);
    }

    
    public static int kthElement_Problem_2_d00a6eaa_e70d_425a_b11f_91db2e36e449(ArrayList<Integer> arr, int k) {
        int n = arr.size();
        int prev = 0;
        int cur = 0;
        int result = 0;
        for(int i = 0; i < n; ++i) {
            prev = cur;
            cur = arr.get(i);
            if(k == 1) {
                result = cur;
                break;
            }
            else if(k < (n - i)) {
                result = cur;
                k = k - 1;
            }
            else {
                k = k - (n - i);
                result = prev;
            }
        }
        return result;
    }

    
    public static int kthElement_Problem_2_2768b22c_f3b1_4e96_98a7_f316516c28a4(ArrayList<Integer> arr, int k) {
        int sum = 0;
        int count = 0;
        for(int i = 1; i < arr.size(); i++) {
            sum += arr.get(i);
            count++;
            if(sum == k) {
                return arr.get(i);
            }
        }
        return -1;
    }

    
    public static int kthElement_Problem_0_cb55d6d0_0325_4a3d_97ac_198c4d3ab3d0(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 1; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum == k) {
                return arr.get(i-1);
            }
        }
        return -1;
    }

    
    public static int kthElement_Problem_1_cc890280_d125_4926_88c3_234a7770bdd9(ArrayList<Integer> arr, int k) {
        if(k > arr.size()) return -1;
        
        for(int i = 0; i < arr.size(); i++) {
            if(k == arr.get(i)) return i+1;
        }
        return -1;
    }

    
    public static int kthElement_Problem_1_cb4748ca_0b62_42c5_88c3_ba8ffaf7c7c0(ArrayList<Integer> arr, int k) {
        int sum=0;
        for(int i=1; i<arr.size(); i++) {
            sum+=arr.get(i);
            if(i==k) {
                return sum;
            }
        }
        return -1;
    }

    
    public static int kthElement_Problem_1_bfe3c674_cbf0_4224_a2d9_14e58db0f21c(ArrayList<Integer> arr, int k) {
        // Write your code here
        // To print results to the standard output you can use System.out.println()
        // Example: System.out.println("Hello world!");
        return arr.get(k-1);
    }

    
    public static int kthElement_Problem_2_01f2da3d_6ade_4701_b9d6_b8d2a21fad43(ArrayList<Integer> arr, int k) {
        int sum = 0;
        int max = arr.get(0);
        int min = arr.get(0);
        for(int i = 1; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum > k) {
                max = arr.get(i);
            }
            if(sum < k) {
                min = arr.get(i);
            }
        }
        return max;
    }

    
    public static int kthElement_Problem_0_79ee9778_93b3_454c_b87b_2f36da3c3674(ArrayList<Integer> arr, int k) {
        int sum = 0;
        int count = 0;
        for(int i = 1; i < arr.size(); i++) {
            sum += arr.get(i);
            count++;
            if(count == k) {
                return sum;
            }
        }
        return -1;
    }

    
    public static int kthElement_Problem_1_b0d3574e_3c6b_4fe0_984c_ba5e4280e9ac(ArrayList<Integer> arr, int k) {
        return arr.get( k - 1);
    }

    
    public static int kthElement_Problem_0_97ba9a00_c20d_47d9_bb32_1d08f977f581(ArrayList<Integer> arr, int k) {
        // Write your code here
        // To print results to the standard output you can use System.out.println()
        // Example: System.out.println("Hello world!");
        return arr.get(k-1);
    }

    
    public static int kthElement_Problem_0_1e2596dd_72ef_47db_8a23_109ee04c76b1(ArrayList<Integer> arr, int k) {
        // Write your code here
        // To print results to the standard output you can use System.out.println()
        // Example: System.out.println("Hello world!");
        return arr.get(k-1);
    }

    
    public static int kthElement_Problem_1_15fbecc2_cc0b_4c37_92ba_31189eeed3e9(ArrayList<Integer> arr, int k) {
        // Write your code here
        return arr.get(k-1);
    }

    
    public static int kthElement_Problem_1_8179afbe_d867_410a_8eb0_22f753a334a9(ArrayList<Integer> arr, int k) {
        int result = -1;
        int sum = 0;
        int temp;
        for(int i = 1; i < arr.size(); i++) {
            temp = arr.get(i);
            sum += temp;
            if(sum == k) {
                result = temp;
                break;
            }
        }
        return result;
    }

    
    public static int kthElement_Problem_2_14077ebb_ae1a_44ba_853b_f9b5f7530e11(ArrayList<Integer> arr, int k) {
        int sum = 0;
        int n = arr.size();
        for (int i = 0; i < n; i++) {
            sum += arr.get(i);
            if (k == sum) {
                return k + 1;
            }
        }
        return -1;
    }

    
    public static int kthElement_Problem_1_d92da836_3df6_44a1_a204_5ee4f9da4711(ArrayList<Integer> arr, int k) {
        int sum = 0;
        int sumOfSquares = 0;
        for(int i = 1; i < arr.size(); i++) {
            sum += arr.get(i);
            sumOfSquares += arr.get(i) * arr.get(i);
        }
        int kthElement_Problem_1_d92da836_3df6_44a1_a204_5ee4f9da4711 = sum / k;
        int kthElement_Problem_1_d92da836_3df6_44a1_a204_5ee4f9da4711OfSquares = sumOfSquares / k;
        return kthElement_Problem_1_d92da836_3df6_44a1_a204_5ee4f9da4711 * kthElement_Problem_1_d92da836_3df6_44a1_a204_5ee4f9da4711OfSquares;
    }

    
    public static int kthElement_Problem_2_3d84d88a_898d_4021_82b0_7f3a413559c1(ArrayList<Integer> arr, int k) {
        return arr.stream()
            .skip(k)
            .findFirst()
            .get();
    }

    
    public static int kthElement_Problem_0_c24e1253_77f3_4a38_b256_28a793792dc0(ArrayList<Integer> arr, int k) {
        // Write your code here
        // To print results to the standard output you can use System.out.println()
        // Example: System.out.println("Hello world!");
        return arr.get(k-1);
    }

    
    public static int kthElement_Problem_1_c37cbdcb_d715_4c8f_8a64_2fac3a5556b5(ArrayList<Integer> arr, int k) {
        // Write your code here
        // To print results to the standard output you can use System.out.println()
        // Example: System.out.println("Hello world!");
        return arr.get(k-1);
    }

    
    public static int kthElement_Problem_0_2d59d779_b240_45a7_b8ca_243697bc3e8c(ArrayList<Integer> arr, int k) {
        int sum = 0;
        int lastElement = arr.get(arr.size() - 1);
        int currentElement = arr.get(0);
        int count = 0;
        for(int i = 1; i < arr.size(); i++) {
            sum += currentElement;
            currentElement = arr.get(i);
            if(sum == k) {
                count++;
            }
        }
        return count;
    }

    
    public static int kthElement_Problem_2_f4c474ff_3019_445a_a356_c1fee8054deb(ArrayList<Integer> arr, int k) {
        int ans = 1L;
        int l = arr.size() - 1;
        int m = l - k;
        int temp = 0;
        for(int i = 0; i < k; i++) {
            temp += arr.get(i);
        }
        temp = temp / k;
        ans = temp * (k + 1);
        return ans;
    }

    
    public static int kthElement_Problem_1_b459d705_156e_45d9_98a9_3212b3c6a402(ArrayList<Integer> arr, int k) {
        int sum = 0;
        int temp = 0;
        for(int i = 1; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum == k) {
                temp = arr.get(i);
                break;
            }
        }
        return temp;
    }

    
    public static int kthElement_Problem_1_3feb1da0_a1f3_449e_ac41_889ee793946a(ArrayList<Integer> arr, int k) {
        return arr.stream()
                .distinct()
                .filter(x -> k % 2 == 1)
                .skip(k % 2)
                .findFirst()
                .orElseThrow(RuntimeException::new);
    }

    
    public static int kthElement_Problem_2_80dd77a3_df85_4559_b0b3_9fe3f502662b(ArrayList<Integer> arr, int k) {
        int result = -1;
        int sum = 0;
        int temp = 0;
        for(int i = 1; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum == k) {
                result = arr.get(i);
                break;
            }
        }
        return result;
    }

    
    public static int kthElement_Problem_1_23a11f8d_5f92_45f9_8bb4_050aa31c276b(ArrayList<Integer> arr, int k) {
        // Write your code here
        int kthElement_Problem_1_23a11f8d_5f92_45f9_8bb4_050aa31c276b = 0;
        if(arr.size() >= k) {
            kthElement_Problem_1_23a11f8d_5f92_45f9_8bb4_050aa31c276b = arr.get(k-1);
        }
        return kthElement_Problem_1_23a11f8d_5f92_45f9_8bb4_050aa31c276b;
    }

    
    public static int kthElement_Problem_0_93c567b7_665e_4976_9289_c5ed96040282(ArrayList<Integer> arr, int k) {
        return arr.get(k - 1);
    }

    
    public static int kthElement_Problem_0_cecf0141_159e_4c5a_9c9a_7d6dc9a5c52b(ArrayList<Integer> arr, int k) {
        int res = 0;
        int count = 0;
        for (int i = 0; i < k; i++) {
            count = count + 1;
            if (i == k - 1)
                res = arr.get(i);
            else
                res = res + arr.get(i);
        }
        return res;
    }

    
    public static int kthElement_Problem_2_0cbfe5ca_2b73_42ac_be5a_f95c2ff94164(ArrayList<Integer> arr, int k) {
        if(arr == null || arr.isEmpty() || k < 1 || arr.size() < k) {
            return -1;
        }
        int temp = arr.get(arr.size()-1);
        int count = 0;
        for(int i = arr.size()-1; i >= 0; i--) {
            if(arr.get(i) == temp) {
                count++;
                if(count == k) {
                    return temp;
                }
            }
            else {
                count = 0;
            }
        }
        return -1;
    }

    
    public static int kthElement_Problem_0_603eaada_c29b_4f27_bdd9_07638ae8e0c1(ArrayList<Integer> arr, int k) {
        int index = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            index += arr.get(i);
            if(index >= k) {
                return arr.get(i + 1);
            }
        }
        return arr.get(arr.size() - 1);
    }

    
    public static int kthElement_Problem_1_d1f080c3_056c_48ae_8609_45f301b114ce(ArrayList<Integer> arr, int k) {
        int count = 0;
        int result = -1;
        while(count<k) {
            count+=1;
            if(count==arr.size()) {
                return result;
            }
            result = arr.get(count-1);
        }
        return result;
    }

    
    public static int kthElement_Problem_0_095ec8bc_bd95_4699_986f_63a03b74949a(ArrayList<Integer> arr, int k) {
        return arr.get(k-1);
    }

    
    public static int kthElement_Problem_1_6898ec70_b854_4fbc_8363_217c5f880f01(ArrayList<Integer> arr, int k) {
        if (k > arr.size())
            throw new IllegalArgumentException("k value is greater than the size of array");
        int firstElement = arr.get(0);
        int secondElement = arr.get(1);
        int index = 2; //kth is the first element
        int count = 0;
        while (index != arr.size()) {
            count += (firstElement + secondElement) * (index - 1);
            firstElement = secondElement;
            secondElement = arr.get(index++);
        }
        return count;
    }

    
    public static int kthElement_Problem_0_e62d29a4_d1db_4f6b_9ede_4c56f4b9ea68(ArrayList<Integer> arr, int k) {
        int size = arr.size();
        if (size == 0) {
            return -1;
        }
        return arr.get( k - 1);
    }

    
    public static int kthElement_Problem_2_ef50b97d_bc22_4cf9_a368_ba03fd59e36a(ArrayList<Integer> arr, int k) {
        // Your code goes here.
        return 0;
    }

    
    public static int kthElement_Problem_0_8cb74768_ace6_4424_a7db_1f83c890f670(ArrayList<Integer> arr, int k) {
        Integer[] a = new Integer[arr.size()];
        for (int i = 0; i < a.length; i++) {
            a[i] = arr.get(i);
        }
        int mid = arr.size() / 2;
        if (arr.size() % 2 != 0) {
            mid++;
        }
        Arrays.sort(a);
        for (int i = 0; i < mid; i++) {
            int tmp = a[i];
            for (int j = i + 1; j < mid; j++) {
                if (tmp < a[j]) {
                    tmp = j;
                }
            }
            if (i == k) {
                return tmp;
            }
        }
        return -1;
    }

    
    public static int kthElement_Problem_0_5faeff5c_4216_4e46_9404_9f2796de445d(ArrayList<Integer> arr, int k) {
        // Write your code here
        int kth = arr.get(k-1);
        return kth;
    }

    
    public static int kthElement_Problem_0_23284c12_a6cd_482e_9f6b_54f810cc19a7(ArrayList<Integer> arr, int k) {
        int result = 0;
        int i = 0;
        for(Integer l : arr) {
            if(i == k - 1) {
                result = l;
                break;
            }
            i++;
        }
        return result;
    }

    
    public static int kthElement_Problem_0_f1c7bd0a_615b_42ba_9079_40f1897f1785(ArrayList<Integer> arr, int k) {
        // Write your code here
        // To print results to the standard output you can use System.out.println()
        // Example: System.out.println("Hello world!");
        return arr.get(k-1);
    }

    
    public static int kthElement_Problem_1_596c0ac1_5174_4b3d_a732_31dadc46f569(ArrayList<Integer> arr, int k) {
        if (arr.size() == 0 || k < 1 || k >= arr.size()) {
            throw new IllegalArgumentException("The length of given array list should be greater than 0 and less than or equal to n");
        }

        int mid = arr.size() / 2;
        Integer arrMidVal = arr.get(mid);

        if (k < mid && k > arrMidVal) {
            int midVal = kthElement_Problem_1_596c0ac1_5174_4b3d_a732_31dadc46f569(arr, k - mid);
            int kthVal = arrMidVal;
            if (k == mid) {
                return kthVal;
            } else {
                return kthVal + kthElement_Problem_1_596c0ac1_5174_4b3d_a732_31dadc46f569(arr, k - 1);
            }
        } else if (k == mid) {
            return arrMidVal;
        } else {
            return kthElement_Problem_1_596c0ac1_5174_4b3d_a732_31dadc46f569(arr, k - 1);
        }
    }

    
    public static int kthElement_Problem_2_23a11f8d_5f92_45f9_8bb4_050aa31c276b(ArrayList<Integer> arr, int k) {
        // Write your code here
        int kthElement_Problem_2_23a11f8d_5f92_45f9_8bb4_050aa31c276b = 0;
        if(arr.size() >= k) {
            kthElement_Problem_2_23a11f8d_5f92_45f9_8bb4_050aa31c276b = arr.get(k-1);
        }
        return kthElement_Problem_2_23a11f8d_5f92_45f9_8bb4_050aa31c276b;
    }

    
    public static int kthElement_Problem_2_50cf23eb_e7bf_4b3e_8b08_d433ffa5baec(ArrayList<Integer> arr, int k) {
        int counter = arr.get(0);
        for (int i : arr)
            counter -= i;
        return k * counter;
    }

    
    public static int kthElement_Problem_0_49ff3f85_2afc_441b_b418_84f9c337984b(ArrayList<Integer> arr, int k) {
        // Write your code here
        return arr.get(k-1);
    }

    
    public static int kthElement_Problem_2_728ca438_d329_49f7_aa7e_8ee10cdd646b(ArrayList<Integer> arr, int k) {
        int sum = 0;
        int total = 0L;
        for (int i = 0; i < k; i++) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int kthElement_Problem_2_5bf1cf9d_8f08_416a_a624_77a7b3998363(ArrayList<Integer> arr, int k) {
        int start = 0, end = arr.size() - 1;
        int mid = (start + end) / 2;
        while (start <= end) {
            if (arr.get(mid) < k) {
                start = mid + 1;
            } else if (arr.get(mid) > k) {
                end = mid - 1;
            } else {
                break;
            }
            mid = (start + end) / 2;
        }
        return arr.get(mid);
    }

    
    public static int kthElement_Problem_0_c31a7321_2636_4076_b7e5_68c314ebf8d6(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 0; i != k; ++i) {
            sum += arr.get(i);
        }
        return sum;
    }

    
    public static int kthElement_Problem_2_095ec8bc_bd95_4699_986f_63a03b74949a(ArrayList<Integer> arr, int k) {
        return arr.get(k-1);
    }

    
    public static int kthElement_Problem_1_ef50b97d_bc22_4cf9_a368_ba03fd59e36a(ArrayList<Integer> arr, int k) {
        // Your code goes here.
        return 0;
    }

    
    public static int kthElement_Problem_1_81b402f8_ecb5_4a64_bf2a_421c275e64f5(ArrayList<Integer> arr, int k) {
        int sum = 0;
        for(int i = 1; i < arr.size(); i++) {
            sum += arr.get(i);
            if(sum == k) {
                return arr.get(i);
            }
        }
        return -1;
    }

    
    public static int kthElement_Problem_2_55201749_5ef0_41c1_9de7_35683e0b0a76(ArrayList<Integer> arr, int k) {
        int sum = 0;
        int count = 0;
        for(int i = 1; i < arr.size(); i++) {
            sum += arr.get(i);
            count++;
            if(sum == k) {
                return arr.get(i);
            }
        }
        return -1;
    }

}
