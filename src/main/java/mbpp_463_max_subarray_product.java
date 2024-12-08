package mbpp_463_max_subarray_product;

public class mbpp_463_max_subarray_product {

    
    public static int maxSubarrayProduct_Problem_0_0e23ad17_eb1e_41e2_a8a5_e6589140fb38(ArrayList<Integer> arr) {
        int max = arr.get(0);
        int min = arr.get(0);
        int result = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            int temp = max;
            max = Math.max(Math.max(max * arr.get(i), min * arr.get(i)), arr.get(i));
            min = Math.min(Math.min(temp * arr.get(i), min * arr.get(i)), arr.get(i));
            if (max > result) {
                result = max;
            }
        }
        return result;
    }

    
    public static int maxSubarrayProduct_Problem_2_c070547f_3247_4817_8561_379d44ed0d3b(ArrayList<Integer> arr) {
        int maxProduct = Integer.MIN_VALUE;
        int maxProductIndex = 0;
        int maxProductSubArrayIndex = 0;
        int maxProductSubArrayProduct = Integer.MIN_VALUE;
        for(int i = 0; i < arr.size(); i++) {
            int product = arr.get(i);
            for(int j = i + 1; j < arr.size(); j++) {
                int subArrayProduct = arr.get(j) * arr.get(i);
                if(subArrayProduct > maxProductSubArrayProduct) {
                    maxProductSubArrayProduct = subArrayProduct;
                    maxProductSubArrayIndex = j;
                }
            }
            if(product > maxProduct) {
                maxProduct = product;
                maxProductIndex = i;
            }
        }
        return maxProduct;
    }

    
    public static int maxSubarrayProduct_Problem_2_ff62a858_a7cf_4f5d_b9c0_93607005d9e5(ArrayList<Integer> arr) {
        int max = 0;
        int maxSubarrayProduct_Problem_2_ff62a858_a7cf_4f5d_b9c0_93607005d9e5 = 0;
        for(int i = 0; i < arr.size(); i++) {
            int product = 1;
            for(int j = i; j < arr.size(); j++) {
                product *= arr.get(j);
            }
            if(product > max) {
                max = product;
                maxSubarrayProduct_Problem_2_ff62a858_a7cf_4f5d_b9c0_93607005d9e5 = product;
            }
        }
        return maxSubarrayProduct_Problem_2_ff62a858_a7cf_4f5d_b9c0_93607005d9e5;
    }

    
    public static int maxSubarrayProduct_Problem_1_d1ea9a41_164f_454b_b898_6c583a92d914(ArrayList<Integer> arr) {
        int max = arr.get(0);
        int min = arr.get(0);
        int product = arr.get(0);
        for(int i = 1; i < arr.size(); i++) {
            int curr = arr.get(i);
            if(curr > max) {
                max = curr;
            }
            if(curr < min) {
                min = curr;
            }
            product = product * curr;
        }
        return product;
    }

    
    public static int maxSubarrayProduct_Problem_0_b5125cd7_11c2_4e77_a5a2_51235eea3507(ArrayList<Integer> arr) {
        int maxProduct = Integer.MIN_VALUE;
        int maxProductIndex = 0;
        int maxProductValue = 0;
        int maxProductValueIndex = 0;
        for(int i = 0; i < arr.size(); i++) {
            int product = arr.get(i);
            for(int j = i; j < arr.size(); j++) {
                int value = arr.get(j);
                int productValue = product * value;
                if(productValue > maxProductValue) {
                    maxProductValue = productValue;
                    maxProductIndex = j;
                }
            }
        }
        return maxProduct;
    }

    
    public static int maxSubarrayProduct_Problem_1_0e23ad17_eb1e_41e2_a8a5_e6589140fb38(ArrayList<Integer> arr) {
        int max = arr.get(0);
        int min = arr.get(0);
        int result = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            int temp = max;
            max = Math.max(Math.max(max * arr.get(i), min * arr.get(i)), arr.get(i));
            min = Math.min(Math.min(temp * arr.get(i), min * arr.get(i)), arr.get(i));
            if (max > result) {
                result = max;
            }
        }
        return result;
    }

    
    public static int maxSubarrayProduct_Problem_0_6ad1caec_24cd_4154_a983_5ec27bb9ccad(ArrayList<Integer> arr) {
        int max_ending_here = 1;
        int min_ending_here = 1;
        int max_so_far = 1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                max_ending_here = max_ending_here * arr.get(i);
                min_ending_here = Math.min(min_ending_here * arr.get(i), 1);
            } else if (arr.get(i) == 0) {
                max_ending_here = 1;
                min_ending_here = 1;
            } else {
                int temp = max_ending_here;
                max_ending_here = Math.max(min_ending_here * arr.get(i), 1);
                min_ending_here = temp * arr.get(i);
            }
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        return max_so_far;
    }

    
    public static int maxSubarrayProduct_Problem_1_bafb4177_2208_4ad4_be0c_f88289edcc72(ArrayList<Integer> arr) {
        int max = 0;
        int maxProduct = Integer.MIN_VALUE;
        int product = 1;
        int sum = 0;
        int sumProduct = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            sumProduct += arr.get(i);
            product = sumProduct * sum;
            if(product > maxProduct) {
                maxProduct = product;
                max = sumProduct;
            }
        }
        return max;
    }

    
    public static int maxSubarrayProduct_Problem_1_fb52a086_ce28_4bba_a1b6_80d7679f7c79(ArrayList<Integer> arr) {
        int max_ending_here = 1;
        int min_ending_here = 1;
        int max_so_far = 1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                max_ending_here = max_ending_here * arr.get(i);
                min_ending_here = Math.min(min_ending_here * arr.get(i), 1);
            } else if (arr.get(i) == 0) {
                max_ending_here = 1;
                min_ending_here = 1;
            } else {
                int temp = max_ending_here;
                max_ending_here = Math.max(min_ending_here * arr.get(i), 1);
                min_ending_here = temp * arr.get(i);
            }
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        return max_so_far;
    }

    
    public static int maxSubarrayProduct_Problem_2_d7defdf8_5789_404f_9337_9e02eab81083(ArrayList<Integer> arr) {
        int maxProduct = 1;
        int minProduct = 1;
        int maxSoFar = 1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                maxProduct = maxProduct * arr.get(i);
                minProduct = Math.min(minProduct * arr.get(i), 1);
            } else if (arr.get(i) == 0) {
                maxProduct = 1;
                minProduct = 1;
            } else {
                int temp = maxProduct;
                maxProduct = Math.max(minProduct * arr.get(i), 1);
                minProduct = temp * arr.get(i);
            }
            if (maxSoFar < maxProduct) {
                maxSoFar = maxProduct;
            }
        }
        return maxSoFar;
    }

    
    public static int maxSubarrayProduct_Problem_1_bae10227_bf81_433f_9dd5_5f4c44a63eb0(ArrayList<Integer> arr) {
        int max_ending_here = 1;
        int min_ending_here = 1;
        int max_so_far = 1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                max_ending_here = max_ending_here * arr.get(i);
                min_ending_here = Math.min(min_ending_here * arr.get(i), 1);
            } else if (arr.get(i) == 0) {
                max_ending_here = 1;
                min_ending_here = 1;
            } else {
                int temp = max_ending_here;
                max_ending_here = Math.max(min_ending_here * arr.get(i), 1);
                min_ending_here = temp * arr.get(i);
            }
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        return max_so_far;
    }

    
    public static int maxSubarrayProduct_Problem_0_bc05a00c_2e8c_4445_8960_a1e01bc312d5(ArrayList<Integer> arr) {
        int max_ending_here = 1;
        int min_ending_here = 1;
        int max_so_far = 1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                max_ending_here = max_ending_here * arr.get(i);
                min_ending_here = Math.min(min_ending_here * arr.get(i), 1);
            } else if (arr.get(i) == 0) {
                max_ending_here = 1;
                min_ending_here = 1;
            } else {
                int temp = max_ending_here;
                max_ending_here = Math.max(min_ending_here * arr.get(i), 1);
                min_ending_here = temp * arr.get(i);
            }
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        return max_so_far;
    }

    
    public static int maxSubarrayProduct_Problem_1_98822e24_7474_4560_80dc_a5b6d03b0ea0(ArrayList<Integer> arr) {
        int max_ending_here = 1;
        int min_ending_here = 1;
        int max_so_far = 1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                max_ending_here = max_ending_here * arr.get(i);
                min_ending_here = Math.min(min_ending_here * arr.get(i), 1);
            } else if (arr.get(i) == 0) {
                max_ending_here = 1;
                min_ending_here = 1;
            } else {
                int temp = max_ending_here;
                max_ending_here = Math.max(min_ending_here * arr.get(i), 1);
                min_ending_here = temp * arr.get(i);
            }
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        return max_so_far;
    }

    
    public static int maxSubarrayProduct_Problem_2_3436c874_8bab_4d96_ad3c_6959031db3dc(ArrayList<Integer> arr) {
        int max_ending_here = 1;
        int min_ending_here = 1;
        int max_so_far = 1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                max_ending_here = max_ending_here * arr.get(i);
                min_ending_here = Math.min(min_ending_here * arr.get(i), 1);
            } else if (arr.get(i) == 0) {
                max_ending_here = 1;
                min_ending_here = 1;
            } else {
                int temp = max_ending_here;
                max_ending_here = Math.max(min_ending_here * arr.get(i), 1);
                min_ending_here = temp * arr.get(i);
            }
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        return max_so_far;
    }

    
    public static int maxSubarrayProduct_Problem_1_3e3ff12d_6b0f_49a2_aad7_dc3274ba4e3c(ArrayList<Integer> arr) {
        int max_ending_here = 1;
        int min_ending_here = 1;
        int max_so_far = 1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                max_ending_here = max_ending_here * arr.get(i);
                min_ending_here = Math.min(min_ending_here * arr.get(i), 1);
            } else if (arr.get(i) == 0) {
                max_ending_here = 1;
                min_ending_here = 1;
            } else {
                int temp = max_ending_here;
                max_ending_here = Math.max(min_ending_here * arr.get(i), 1);
                min_ending_here = temp * arr.get(i);
            }
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        return max_so_far;
    }

    
    public static int maxSubarrayProduct_Problem_1_3aa96217_b5f2_486b_aa71_30ab55ef0c8c(ArrayList<Integer> arr) {
        int maxProduct = 1;
        int minProduct = 1;
        int maxSoFar = 1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                maxProduct = maxProduct * arr.get(i);
                minProduct = Math.min(minProduct * arr.get(i), 1);
            } else if (arr.get(i) == 0) {
                maxProduct = 1;
                minProduct = 1;
            } else {
                int temp = maxProduct;
                maxProduct = Math.max(minProduct * arr.get(i), 1);
                minProduct = temp * arr.get(i);
            }
            if (maxSoFar < maxProduct) {
                maxSoFar = maxProduct;
            }
        }
        return maxSoFar;
    }

    
    public static int maxSubarrayProduct_Problem_0_b9cc5ab9_5c1b_4ee3_b61d_835a9e234c14(ArrayList<Integer> arr) {
        int max_ending_here = 1;
        int min_ending_here = 1;
        int max_so_far = 1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                max_ending_here = max_ending_here * arr.get(i);
                min_ending_here = Math.min(min_ending_here * arr.get(i), 1);
            } else if (arr.get(i) == 0) {
                max_ending_here = 1;
                min_ending_here = 1;
            } else {
                int temp = max_ending_here;
                max_ending_here = Math.max(min_ending_here * arr.get(i), 1);
                min_ending_here = temp * arr.get(i);
            }
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        return max_so_far;
    }

    
    public static int maxSubarrayProduct_Problem_0_6ed89a32_9f3c_434f_85a0_7939779c1b78(ArrayList<Integer> arr) {
        int max_ending_here = 1;
        int min_ending_here = 1;
        int max_so_far = 1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                max_ending_here = max_ending_here * arr.get(i);
                min_ending_here = Math.min(min_ending_here * arr.get(i), 1);
            } else if (arr.get(i) == 0) {
                max_ending_here = 1;
                min_ending_here = 1;
            } else {
                int temp = max_ending_here;
                max_ending_here = Math.max(min_ending_here * arr.get(i), 1);
                min_ending_here = temp * arr.get(i);
            }
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        return max_so_far;
    }

    
    public static int maxSubarrayProduct_Problem_2_79a16fa0_c2d4_43e4_ac1f_1d8488e82045(ArrayList<Integer> arr) {
        int maxProduct = 0;
        int currentProduct = 1;
        for (int i = 0; i < arr.size(); i++) {
            currentProduct *= arr.get(i);
            maxProduct = Math.max(maxProduct, currentProduct);
            if (currentProduct == 0) {
                currentProduct = 1;
            }
        }
        currentProduct = 1;
        for (int i = arr.size() - 1; i >= 0; i--) {
            currentProduct *= arr.get(i);
            maxProduct = Math.max(maxProduct, currentProduct);
            if (currentProduct == 0) {
                currentProduct = 1;
            }
        }
        return maxProduct;
    }

    
    public static int maxSubarrayProduct_Problem_1_b9cc5ab9_5c1b_4ee3_b61d_835a9e234c14(ArrayList<Integer> arr) {
        int max_ending_here = 1;
        int min_ending_here = 1;
        int max_so_far = 1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                max_ending_here = max_ending_here * arr.get(i);
                min_ending_here = Math.min(min_ending_here * arr.get(i), 1);
            } else if (arr.get(i) == 0) {
                max_ending_here = 1;
                min_ending_here = 1;
            } else {
                int temp = max_ending_here;
                max_ending_here = Math.max(min_ending_here * arr.get(i), 1);
                min_ending_here = temp * arr.get(i);
            }
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        return max_so_far;
    }

    
    public static int maxSubarrayProduct_Problem_0_9143e7c3_ff8b_4c93_b4e2_b0244c3968e9(ArrayList<Integer> arr) {
        int max_ending_here = 1;
        int min_ending_here = 1;
        int max_so_far = 1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                max_ending_here = max_ending_here * arr.get(i);
                min_ending_here = Math.min(min_ending_here * arr.get(i), 1);
            } else if (arr.get(i) == 0) {
                max_ending_here = 1;
                min_ending_here = 1;
            } else {
                int temp = max_ending_here;
                max_ending_here = Math.max(min_ending_here * arr.get(i), 1);
                min_ending_here = temp * arr.get(i);
            }
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        return max_so_far;
    }

    
    public static int maxSubarrayProduct_Problem_2_8bfce62a_e749_4a27_9313_2f701db6d224(ArrayList<Integer> arr) {
        int maxProduct = 1;
        int minProduct = 1;
        int maxSoFar = 1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                maxProduct = maxProduct * arr.get(i);
                minProduct = Math.min(minProduct * arr.get(i), 1);
            } else if (arr.get(i) == 0) {
                maxProduct = 1;
                minProduct = 1;
            } else {
                int temp = maxProduct;
                maxProduct = Math.max(minProduct * arr.get(i), 1);
                minProduct = temp * arr.get(i);
            }
            if (maxSoFar < maxProduct) {
                maxSoFar = maxProduct;
            }
        }
        return maxSoFar;
    }

    
    public static int maxSubarrayProduct_Problem_2_85a96d09_eaea_43bc_9b4e_8483a7c070a5(ArrayList<Integer> arr) {
        int max = 0;
        int maxProduct = Integer.MIN_VALUE;
        int product = Integer.MIN_VALUE;
        int sum = 0;
        int sumProduct = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            sumProduct += arr.get(i);
            product = sumProduct * sum;
            if(product > maxProduct) {
                max = product;
                maxProduct = product;
            }
        }
        return maxProduct;
    }

    
    public static int maxSubarrayProduct_Problem_0_706bdf6f_b720_4090_be47_51b454fda2b4(ArrayList<Integer> arr) {
        int max = arr.get(0);
        int min = arr.get(0);
        int result = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            int temp = max;
            max = Math.max(Math.max(max * arr.get(i), min * arr.get(i)), arr.get(i));
            min = Math.min(Math.min(temp * arr.get(i), min * arr.get(i)), arr.get(i));
            if (max > result) {
                result = max;
            }
        }
        return result;
    }

    
    public static int maxSubarrayProduct_Problem_2_a9593238_8e10_412e_8364_86f3fba551cf(ArrayList<Integer> arr) {
        int max_ending_here = 1;
        int min_ending_here = 1;
        int max_so_far = 1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                max_ending_here = max_ending_here * arr.get(i);
                min_ending_here = Math.min(min_ending_here * arr.get(i), 1);
            } else if (arr.get(i) == 0) {
                max_ending_here = 1;
                min_ending_here = 1;
            } else {
                int temp = max_ending_here;
                max_ending_here = Math.max(min_ending_here * arr.get(i), 1);
                min_ending_here = temp * arr.get(i);
            }
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        return max_so_far;
    }

    
    public static int maxSubarrayProduct_Problem_1_cfa56a3e_c6c8_409c_bc2e_3e68b5f4de03(ArrayList<Integer> arr) {
        // Write your code here.
        int max_ending_here = 1;
        int min_ending_here = 1;
        int max_so_far = 1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                max_ending_here = max_ending_here * arr.get(i);
                min_ending_here = Math.min(min_ending_here * arr.get(i), 1);
            } else if (arr.get(i) == 0) {
                max_ending_here = 1;
                min_ending_here = 1;
            } else {
                int temp = max_ending_here;
                max_ending_here = Math.max(min_ending_here * arr.get(i), 1);
                min_ending_here = temp * arr.get(i);
            }
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        return max_so_far;
    }

    
    public static int maxSubarrayProduct_Problem_0_7321d927_a8ad_4477_beaa_728410862acb(ArrayList<Integer> arr) {
        int max = arr.get(0);
        int min = arr.get(0);
        int result = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            int temp = max;
            max = Math.max(Math.max(max * arr.get(i), min * arr.get(i)), arr.get(i));
            min = Math.min(Math.min(temp * arr.get(i), min * arr.get(i)), arr.get(i));
            if (max > result) {
                result = max;
            }
        }
        return result;
    }

    
    public static int maxSubarrayProduct_Problem_2_75c95bf5_4969_44bd_9a0a_16ffea113b72(ArrayList<Integer> arr) {
        int maxProduct = 1;
        int minProduct = 1;
        int maxSoFar = 1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                maxProduct = maxProduct * arr.get(i);
                minProduct = Math.min(minProduct * arr.get(i), 1);
            } else if (arr.get(i) == 0) {
                maxProduct = 1;
                minProduct = 1;
            } else {
                int temp = maxProduct;
                maxProduct = Math.max(minProduct * arr.get(i), 1);
                minProduct = temp * arr.get(i);
            }
            if (maxSoFar < maxProduct) {
                maxSoFar = maxProduct;
            }
        }
        return maxSoFar;
    }

    
    public static int maxSubarrayProduct_Problem_2_60d81155_9c15_44ab_8187_478c16613fff(ArrayList<Integer> arr) {
        int max = arr.get(0);
        int min = arr.get(0);
        int result = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            int temp = max;
            max = Math.max(Math.max(max * arr.get(i), min * arr.get(i)), arr.get(i));
            min = Math.min(Math.min(temp * arr.get(i), min * arr.get(i)), arr.get(i));
            if (max > result) {
                result = max;
            }
        }
        return result;
    }

    
    public static int maxSubarrayProduct_Problem_0_d7defdf8_5789_404f_9337_9e02eab81083(ArrayList<Integer> arr) {
        int maxProduct = 1;
        int minProduct = 1;
        int maxSoFar = 1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                maxProduct = maxProduct * arr.get(i);
                minProduct = Math.min(minProduct * arr.get(i), 1);
            } else if (arr.get(i) == 0) {
                maxProduct = 1;
                minProduct = 1;
            } else {
                int temp = maxProduct;
                maxProduct = Math.max(minProduct * arr.get(i), 1);
                minProduct = temp * arr.get(i);
            }
            if (maxSoFar < maxProduct) {
                maxSoFar = maxProduct;
            }
        }
        return maxSoFar;
    }

    
    public static int maxSubarrayProduct_Problem_1_ad41b088_91f5_4f61_9637_4f85a8c3b973(ArrayList<Integer> arr) {
        int max = arr.get(0);
        int min = arr.get(0);
        int max_so_far = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            int temp = max;
            max = Math.max(Math.max(max * arr.get(i), min * arr.get(i)), arr.get(i));
            min = Math.min(Math.min(temp * arr.get(i), min * arr.get(i)), arr.get(i));
            max_so_far = Math.max(max, max_so_far);
        }
        return max_so_far;
    }

    
    public static int maxSubarrayProduct_Problem_2_bafb4177_2208_4ad4_be0c_f88289edcc72(ArrayList<Integer> arr) {
        int max = 0;
        int maxProduct = Integer.MIN_VALUE;
        int product = 1;
        int sum = 0;
        int sumProduct = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            sumProduct += arr.get(i);
            product = sumProduct * sum;
            if(product > maxProduct) {
                maxProduct = product;
                max = sumProduct;
            }
        }
        return max;
    }

    
    public static int maxSubarrayProduct_Problem_2_6628188c_6cb4_4658_98a6_a6233825d142(ArrayList<Integer> arr) {
        int max = 0;
        int maxProduct = Integer.MIN_VALUE;
        int product = 0;
        int sum = 0;
        int sumProduct = 0;
        for(int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            sumProduct += arr.get(i);
            product = sumProduct * sum;
            if(product > maxProduct) {
                max = product;
                maxProduct = product;
            }
        }
        return max;
    }

    
    public static int maxSubarrayProduct_Problem_2_3db8593d_6414_47d6_8cd2_bdd4c945d48d(ArrayList<Integer> arr) {
        int max_ending_here = 1;
        int min_ending_here = 1;
        int max_so_far = 1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                max_ending_here = max_ending_here * arr.get(i);
                min_ending_here = Math.min(min_ending_here * arr.get(i), 1);
            } else if (arr.get(i) == 0) {
                max_ending_here = 1;
                min_ending_here = 1;
            } else {
                int temp = max_ending_here;
                max_ending_here = Math.max(min_ending_here * arr.get(i), 1);
                min_ending_here = temp * arr.get(i);
            }
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        return max_so_far;
    }

    
    public static int maxSubarrayProduct_Problem_1_6f854efb_64f0_49b2_a8bb_28c22905e0d9(ArrayList<Integer> arr) {
        int maxProduct = 1;
        int minProduct = 1;
        int maxSoFar = 1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                maxProduct = maxProduct * arr.get(i);
                minProduct = Math.min(minProduct * arr.get(i), 1);
            } else if (arr.get(i) == 0) {
                maxProduct = 1;
                minProduct = 1;
            } else {
                int temp = maxProduct;
                maxProduct = Math.max(minProduct * arr.get(i), 1);
                minProduct = temp * arr.get(i);
            }
            if (maxSoFar < maxProduct) {
                maxSoFar = maxProduct;
            }
        }
        return maxSoFar;
    }

    
    public static int maxSubarrayProduct_Problem_0_2deca374_ca41_4f86_ad4e_a9f0e3675071(ArrayList<Integer> arr) {
        int max = arr.get(0);
        int min = arr.get(0);
        int result = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            int temp = max;
            max = Math.max(Math.max(max * arr.get(i), min * arr.get(i)), arr.get(i));
            min = Math.min(Math.min(temp * arr.get(i), min * arr.get(i)), arr.get(i));
            if (max > result) {
                result = max;
            }
        }
        return result;
    }

    
    public static int maxSubarrayProduct_Problem_2_cdcfb7ed_573e_4c18_a4d7_84793a3e4d09(ArrayList<Integer> arr) {
        int max_ending_here = 1;
        int min_ending_here = 1;
        int max_so_far = 1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                max_ending_here = max_ending_here * arr.get(i);
                min_ending_here = Math.min(min_ending_here * arr.get(i), 1);
            } else if (arr.get(i) == 0) {
                max_ending_here = 1;
                min_ending_here = 1;
            } else {
                int temp = max_ending_here;
                max_ending_here = Math.max(min_ending_here * arr.get(i), 1);
                min_ending_here = temp * arr.get(i);
            }
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        return max_so_far;
    }

    
    public static int maxSubarrayProduct_Problem_0_a9a37441_3032_4ca3_9447_02b5c57bd18a(ArrayList<Integer> arr) {
        int max_ending_here = 1;
        int min_ending_here = 1;
        int max_so_far = 1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                max_ending_here = max_ending_here * arr.get(i);
                min_ending_here = Math.min(min_ending_here * arr.get(i), 1);
            } else if (arr.get(i) == 0) {
                max_ending_here = 1;
                min_ending_here = 1;
            } else {
                int temp = max_ending_here;
                max_ending_here = Math.max(min_ending_here * arr.get(i), 1);
                min_ending_here = temp * arr.get(i);
            }
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        return max_so_far;
    }

    
    public static int maxSubarrayProduct_Problem_2_b302823d_d6a9_452b_a161_f64072a7b545(ArrayList<Integer> arr) {
        int maxProduct = Integer.MIN_VALUE;
        int maxSubarray = 0;
        int currentProduct = 0;
        int currentSubarray = 0;
        for(int i = 0; i < arr.size(); i++) {
            currentProduct = arr.get(i);
            currentSubarray = 1;
            for(int j = i; j < arr.size(); j++) {
                currentProduct *= arr.get(j);
                currentSubarray++;
                if(currentProduct > maxProduct) {
                    maxProduct = currentProduct;
                    maxSubarray = currentSubarray;
                }
            }
        }
        return maxProduct;
    }

    
    public static int maxSubarrayProduct_Problem_2_cff3712b_3934_4ecb_a79d_e6421eecdd65(ArrayList<Integer> arr) {
        int maxProduct = Integer.MIN_VALUE;
        int maxProductIndex = 0;
        int maxProductValue = 0;
        for(int i = 0; i < arr.size(); i++) {
            int product = arr.get(i);
            for(int j = i; j < arr.size(); j++) {
                product *= arr.get(j);
                if(product > maxProduct) {
                    maxProduct = product;
                    maxProductIndex = j;
                    maxProductValue = arr.get(j);
                }
            }
        }
        return maxProduct;
    }

    
    public static int maxSubarrayProduct_Problem_2_0f3f841c_920e_4a98_8f31_06cf98adef41(ArrayList<Integer> arr) {
        int max = 0;
        int maxProduct = 0;
        int product = 1;
        for(int i = 0; i < arr.size(); i++) {
            product = arr.get(i);
            for(int j = i; j < arr.size(); j++) {
                product = product * arr.get(j);
                if(product > maxProduct) {
                    max = product;
                    maxProduct = product;
                }
            }
        }
        return maxProduct;
    }

    
    public static int maxSubarrayProduct_Problem_0_d1068d18_2bed_4007_8e66_24ad363f6097(ArrayList<Integer> arr) {
        int max = arr.get(0);
        int min = arr.get(0);
        int result = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            int temp = max;
            max = Math.max(Math.max(max * arr.get(i), min * arr.get(i)), arr.get(i));
            min = Math.min(Math.min(temp * arr.get(i), min * arr.get(i)), arr.get(i));
            if (max > result) {
                result = max;
            }
        }
        return result;
    }

    
    public static int maxSubarrayProduct_Problem_2_56be2530_d269_4945_b633_a3c16d764a89(ArrayList<Integer> arr) {
        int maxProduct = Integer.MIN_VALUE;
        int maxSubarray = 0;
        int currentProduct = 0;
        for(int i = 0; i < arr.size(); i++) {
            currentProduct = arr.get(i);
            for(int j = i; j < arr.size(); j++) {
                currentProduct *= arr.get(j);
                if(currentProduct > maxProduct) {
                    maxProduct = currentProduct;
                    maxSubarray = i;
                }
            }
        }
        return maxProduct;
    }

}
