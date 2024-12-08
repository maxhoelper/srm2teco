package mbpp_734_sum_Of_Subarray_Prod;

public class mbpp_734_sum_Of_Subarray_Prod {

    
    public static int sumOfSubarrayProd_Problem_2_c002740e_98ad_417f_bb03_4df8b093dc53(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_29b31468_32f9_428f_ad36_62694858408a(ArrayList<Integer> arr) {
        if (arr.isEmpty()) {
            return 0L;
        }
        if (arr.size() == 1) {
            return arr.get(0);
        }

        int result = 0;
        int lastElement = arr.get(arr.size() - 1);
        for (int i = 0; i < arr.size() - 1; i++) {
            int firstElement = arr.get(i);
            int product = firstElement * lastElement;
            result += product;
            lastElement = arr.get(i + 1);
        }
        return result;
    }

    
    public static int sumOfSubarrayProd_Problem_0_60d1e69a_f6b3_4f2d_a144_4c1059fc61a7(ArrayList<Integer> arr) {
        int sum = 0;
        int product = 1;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                for (int k = j + 1; k < arr.size(); k++) {
                    int index = i + j + k;
                    sum += arr.get(index) * product;
                    product *= arr.get(index);
                }
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_dd4cc812_eee5_4ac7_9adf_0b9bf57a3238(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_53f1118a_1a14_41bc_aa6e_e2eadd10b9ab(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            int prod = 1;
            for (int j = i; j < arr.size(); j++) {
                prod *= arr.get(j);
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_8eaf6f35_071a_4321_bd39_cfb7853a53ea(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_2a59201b_d3b7_4764_8a49_0aa55672a5c2(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            int prod = 1;
            for (int j = i; j < arr.size(); j++) {
                prod *= arr.get(j);
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_97c28585_6ab6_413f_a30b_e6f549f0af47(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_0160089e_1b99_4450_9a4b_6814634bcd96(ArrayList<Integer> arr) {
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_44dea68a_9e76_441a_8973_8abfd77f6f00(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_25a40014_68a2_452a_9793_777e7bc9862e(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_69f72949_5758_49d7_ae92_20afbbfbe4e3(ArrayList<Integer> arr) {
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_2ea17794_ec60_45dd_a421_e2c1bcb80c4e(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_bfdc069b_50d9_4214_a09e_ef1e2f40afa8(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_1c312748_1af6_4b73_a999_6d8037bbac94(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_e328487e_f8ff_4837_ac14_5ef7d12ada2d(ArrayList<Integer> arr) {
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i+1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_005f9c2b_8a2c_4317_9665_d75bd25d9c09(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_79be517d_7cc5_4fec_aeb1_0ea18e4622c4(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_a58f251f_a538_43b0_a131_e81fecc4eed9(ArrayList<Integer> arr) {
        int sum = 0;
        for(Integer i : arr) {
            for(Integer j : arr) {
                int product = 1;
                for(int k = 0; k < arr.size(); k++) {
                    product = product * i;
                }
                sum += product;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_e1f104fc_7682_45b2_9ec4_483b0fda816b(ArrayList<Integer> arr) {
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i; j < arr.size(); j++) {
                int prod = 1;
                for(int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_eaf7c1d4_7541_46ac_be99_ee40a8a62210(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_854d0a57_e193_4bc6_a0cf_a1c78db6eff6(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_49439b4d_4eb7_43af_b8f4_1920a4c27587(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_52a145b9_66cf_46cc_954b_5bbff4ead3d3(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_2791ae15_3dd7_4f19_b1ec_a28bd355de7c(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_bb83d460_a54d_40c2_9201_31fecc1184fa(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_cb588ed5_68d3_4260_a807_9fdd4d8925e2(ArrayList<Integer> arr) {
        int sum = 0;
        // System.out.println(arr);
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int mult = arr.get(i) * arr.get(j);
                sum += mult;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_bee9f261_b3c4_40cc_974b_e455cc96da4d(ArrayList<Integer> arr) {
        int ans = 1;
        
        
        return ans;
        
    }

    
    public static int sumOfSubarrayProd_Problem_0_0612a4e8_0f76_422f_baca_540684409fdc(ArrayList<Integer> arr) {
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_dd26ff2b_b395_4569_8277_d932cfa2015d(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_d9bd9dce_0fb4_404b_938e_e387aa86f28e(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_4da2c06d_012f_409b_8416_20ead9eef558(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_69f72949_5758_49d7_ae92_20afbbfbe4e3(ArrayList<Integer> arr) {
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_9159493b_5058_4050_af56_63a2f63d5912(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_46daf0ec_27c2_4b88_9684_af30dc366eb1(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_13de95a4_341b_4690_81cd_2b47adc49072(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_413ca459_6010_44f0_9287_0af2e31fe965(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_fcf9c9b6_a86a_4b65_b795_ed4c9d3ece73(ArrayList<Integer> arr) {
        int sum = 0;
        int product = 1;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i; j < arr.size(); j++) {
                product = product * arr.get(i);
                sum += product;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_7059db19_534d_4b05_b6f4_55ad1e88f819(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_6b9a95ea_74f3_4cc3_a6c2_48c27579c88b(ArrayList<Integer> arr) {
        int res = 0;
        int prod = 1;
        int sum = 0;
        int l = arr.size();
        int[] dp = new int[l+1];
        for(int i = 0; i <= l; i++) {
            dp[i] = Math.min(i+100, l);
        }
        for(int i = 0; i < l; i++) {
            prod *= arr.get(i);
            for(int j = i; j <= i; j++) {
                sum += (dp[j-i] * prod);
            }
            res += sum;
            sum = 0;
        }
        return res;
    }

    
    public static int sumOfSubarrayProd_Problem_2_62d9ec60_56f6_46a9_81e2_a580c26a79d6(ArrayList<Integer> arr) {
        int sum = 0;
        int n = arr.size();
        // to find products of all possible subarray lists of a given array list
        for (int k = 0; k < n; k++) {
            // to find sum of products of all possible subarray lists
            for (int i = 0; i < n - k; i++) {
                for (int j = i + 1; j < n; j++) {
                    sum = sum + arr.get(i) * arr.get(j);
                }
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_9a949818_41a1_47d7_93b0_2b5fc24c70bd(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_bfdc069b_50d9_4214_a09e_ef1e2f40afa8(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_2c6fab5a_4582_467f_91af_e3d53a3a5091(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_0d8df97c_4160_4665_b7b4_4685fab0f99e(ArrayList<Integer> arr) {
        // your code here
        return 0;
    }

    
    public static int sumOfSubarrayProd_Problem_1_8c36ebff_5e83_472e_a78a_708d15e2704d(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_c04a1ff1_e3f0_4d50_a071_9702cd83f489(ArrayList<Integer> arr) {
        int N = arr.size();
        int sum = 0;
        for(int i = 1; i < N; i++) {
            sum = sum + arr.get(i) * arr.get(i-1);
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_cde93b53_ad97_48d5_bd57_e4ae240f8b58(ArrayList<Integer> arr) {
        int ans = 0;
        for (int i = 0; i < arr.size(); i++) {
            int curSum = 0;
            for (int j = 0; j < arr.size(); j++) {
                if (i != j) {
                    curSum = curSum + arr.get(j) * (arr.get(i + j) / 2);
                }
            }
            ans += curSum;
        }
        return ans;
    }

    
    public static int sumOfSubarrayProd_Problem_0_ce1fca36_471d_4f4e_8676_1f2a6d522b52(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_1f3ad6aa_2c6f_45b5_8d84_1474b2ad349b(ArrayList<Integer> arr) {
        int result=0;
        for(int i=0; i<arr.size(); i++)
            for(int j=i+1; j<arr.size(); j++)
                for(int k=j+1; k<arr.size(); k++)
                    if(arr.get(i)>arr.get(j) && arr.get(i)>arr.get(k))
                        result+=arr.get(i)*arr.get(j)*arr.get(k);
    return result;
    }

    
    public static int sumOfSubarrayProd_Problem_1_0c7955b0_0044_49a3_bb08_de5d6381b6a2(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_459d6f86_6aaa_421f_b1be_c30e12d229fe(ArrayList<Integer> arr) {
        int sum = 0;
        int product = 1;
        int temp = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i; j < arr.size(); j++) {
                temp = arr.get(i) * arr.get(j);
                sum += temp;
                product *= temp;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_0b0d663b_abd5_4def_8616_011e99758b01(ArrayList<Integer> arr) {
        int sum = 0;
        int product = 1;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
                product *= arr.get(i);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_ed5c2f64_7558_4ad8_ac60_03127ae75ba9(ArrayList<Integer> arr) {
        int result = 0;
        int i = 0;
        while (i < arr.size()) {
            int j = i;
            while (j < arr.size() && j + 1 < arr.size()) {
                result += (arr.get(i) * arr.get(j + 1) );
                j++;
            }
            i++;
        }
        return result;
    }

    
    public static int sumOfSubarrayProd_Problem_1_4177f286_4f04_4772_929e_e9b3d2de696a(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_ce8bee6c_a190_419d_9f7a_1ff707d1d089(ArrayList<Integer> arr) {
        int ans = 0;
        int n = arr.size();
        int cur = 0;
        for(int i = 0; i <n; i++) {
            for(int j = 0; j <n; j++) {
                cur = cur + arr.get(i) * arr.get(j);
            }
            ans = ans + cur;
            cur = 0;
        }
        return ans;
    }

    
    public static int sumOfSubarrayProd_Problem_0_cd6a33ec_71de_4b31_9285_b5ec65f08b9b(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_cf4ac11d_2f53_4e07_8169_a13a73302e7a(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_9c84ed62_3cb3_40bf_844e_94c3ac9cf6f7(ArrayList<Integer> arr) {
        int product = 1;
        for (Integer i : arr) {
            product *= i;
        }
        return product;
    }

    
    public static int sumOfSubarrayProd_Problem_2_5316c09c_4f40_4187_b5f0_913ab7d39046(ArrayList<Integer> arr) {
        // write your code here
        return 0;
    }

    
    public static int sumOfSubarrayProd_Problem_0_6992aca9_bbdd_446c_98a7_884124a0df31(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i; j < arr.size(); j++) {
                for (int k = i; k < arr.size(); k++) {
                    for (int l = j; l < arr.size(); l++) {
                        sum += arr.get(i) * arr.get(j) * arr.get(k) * arr.get(l);
                    }
                }
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_da991208_b502_41f2_9da6_fb842ca69b5a(ArrayList<Integer> arr) {
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_05781bff_9438_4968_9e0a_9582ec6e3a14(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            int prod = 1;
            for (int j = i; j < arr.size(); j++) {
                prod *= arr.get(j);
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_fca91474_4313_4600_900e_ed5fedf87fdd(ArrayList<Integer> arr) {
        int sum = 0;
        
        int n = arr.size();
        
        // Iterate over all subarrays of length n
        for(int i=0; i<n; i++) {
            // For each subarray, iterate over all possible subarrays
            for(int j=i; j<n; j++) {
                
                // For each possible subarray, find the product of all elements
                for(int k=0; k<n; k++) {
                    
                    // Add to the total sum
                    sum = sum + arr.get(i) * arr.get(j) * arr.get(k);
                }
            }
        }
        
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_e6acfab3_fd66_47fa_b353_3051bfcea7c3(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i) * arr.get(i);
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_95a7a4f5_310e_4c04_a42e_8a68eae6c46e(ArrayList<Integer> arr) {
        int sum = 0;
        int product = 1;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i; j < arr.size(); j++) {
                for(int k = j; k < arr.size(); k++) {
                    for(int l = k; l < arr.size(); l++) {
                        sum += arr.get(i) * arr.get(j) * arr.get(k) * arr.get(l);
                        product *= arr.get(k);
                    }
                }
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_6ea59151_1f8a_4584_8a40_476e2c5b03cb(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_d6bb4099_7dcf_4763_b01c_66b7830663d7(ArrayList<Integer> arr) {
        // Write your code here
        int sum = 0;
        int maxSize = arr.size();
        int curSubSize = 1;
        int curProduct = 1;
        int product = 1;

        while(curSubSize <= maxSize) {
            for(int i=0; i<arr.size(); i++) {
                int num = arr.get(i);
                curProduct = num * product;
                if(curProduct > 0) {
                    sum += curProduct;
                }
                product = product * num;
            }
            curSubSize++;
        }

        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_f47c0bce_3d41_47d5_9737_a3e8d0fed0c2(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_d8014098_9fd5_4550_b563_28ed29c74653(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_5c808fc3_35f6_40d2_9fd6_12efa245617a(ArrayList<Integer> arr) {
        int sum = 0;
        for(int i=0;i<arr.size();i++){
            for(int j=i+1;j<arr.size();j++){
                for(int k=j+1;k<arr.size();k++){
                    for(int l=k+1;l<arr.size();l++){
                        sum+=arr.get(i)*arr.get(j)*arr.get(k)*arr.get(l);
                    }
                }
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_a5ecc981_b934_4293_b7cf_7ce55d404db1(ArrayList<Integer> arr) {
        int sum = 0;
        int product = 1;
        int sumOfProducts = 0;
        for(int i = 0; i< arr.size(); i++) {
            for(int j = i; j < arr.size(); j++) {
                sumOfProducts = sumOfProducts * arr.get(i);
                sum = sum + arr.get(j) * product;
                product = product * arr.get(j);
            }
        }
        return sumOfProducts;
    }

    
    public static int sumOfSubarrayProd_Problem_2_304b7484_4193_4896_9286_c9f97730086e(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_005f9c2b_8a2c_4317_9665_d75bd25d9c09(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_30176064_363a_42b4_84c9_cf43d48fd621(ArrayList<Integer> arr) {
        int sum = 0;
        int n = arr.size();
        for (int i = 1; i < n; i++) {
            sum *= i;
            for (int j = i; j < n; j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_e886fb8b_f4b3_489c_8dc9_2c97f2856a2b(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_4efeddb8_ba1a_4859_8ff7_03c682ab31d6(ArrayList<Integer> arr) {
        int result = 1;
        for (int i : arr) {
            int product = 1;
            int index = 0;
            while (index < i) {
                product = product * i;
                index++;
            }
            result = result + product;
        }
        return result;
    }

    
    public static int sumOfSubarrayProd_Problem_2_98eb3485_988f_4803_9d5c_1fb983bad577(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_b1f69cf3_27a0_45a3_99e3_38b3db2d426f(ArrayList<Integer> arr) {
        int ans = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                ans += arr.get(i) * arr.get(j);
            }
        }
        return ans;
    }

    
    public static int sumOfSubarrayProd_Problem_0_2066e60b_c8fe_4d98_b8e8_7419a124d2d0(ArrayList<Integer> arr) {
        int product=0;
        for(int i=0;i<arr.size();i++)
        {
            for(int j=i+1;j<arr.size();j++)
            {
                for(int k=0;k<arr.size();k++)
                {
                    product=product*arr.get(i)*(arr.get(j)*(arr.get(k)));
                }
            }
        }
        return product;
    }

    
    public static int sumOfSubarrayProd_Problem_1_752e5227_df20_4a34_beea_4bdaf8c0201c(ArrayList<Integer> arr) {
        int sum = 0;
        int product = 1;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i; j < arr.size(); j++) {
                sum = sum + arr.get(i) * arr.get(j);
                product = product * arr.get(i);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_0d20ed59_fce1_476a_b5e4_13c937255cc6(ArrayList<Integer> arr) {
        int sum = 0;
        int product = 1;
        int sumOfSubarrayProd_Problem_2_0d20ed59_fce1_476a_b5e4_13c937255cc6 = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i; j < arr.size(); j++) {
                sumOfSubarrayProd_Problem_2_0d20ed59_fce1_476a_b5e4_13c937255cc6 += arr.get(i) * arr.get(j);
            }
            sum += arr.get(i);
            product *= arr.get(i);
        }
        sumOfSubarrayProd_Problem_2_0d20ed59_fce1_476a_b5e4_13c937255cc6 = sumOfSubarrayProd_Problem_2_0d20ed59_fce1_476a_b5e4_13c937255cc6 * product;
        return sumOfSubarrayProd_Problem_2_0d20ed59_fce1_476a_b5e4_13c937255cc6;
    }

    
    public static int sumOfSubarrayProd_Problem_0_f57ef3ff_3ec0_4f08_a8bb_fc42603b747c(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_75ff3e19_752e_433c_af2f_5a57884d3046(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_469eb206_98f0_4a81_8c48_6aed174bc6a9(ArrayList<Integer> arr) {
        
        int sum = 0;
        for(int i: arr) {
            sum += i;
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_679a8f9e_d0fb_4666_8016_de99bf29ca8b(ArrayList<Integer> arr) {
        int sum = 0;
        int prod = 1;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i; j < arr.size(); j++) {
                prod = prod * arr.get(i);
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_7174f099_74aa_401d_883e_28dbbf7c08f6(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_3c3e2fad_3ca8_4597_b923_5f1d4f84adfa(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_7e622fa2_000b_4fd4_8e8c_52ed979ce2f2(ArrayList<Integer> arr) {
        int sum = 0;
        
        // First pass: we find the number of elements that make up the first subarray
        int k = arr.size(); 

        // Now we find the sum of all possible subarrays. We will use subarrays that consist of
        // consecutive elements
        for (int i = 1; i < k; i++) {
            sum = sum + arr.get(i - 1) * arr.get(i);
        }
        
        // Second pass: we find the number of elements that make up the second subarray
        // Same as in the first pass, except for i = k - 1
        for (int i = k - 1; i >= 0; i--) {
            sum = sum + arr.get(i) * arr.get(k - 1);
        }
        
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_689acec4_83d3_427d_b5ac_affd773bed53(ArrayList<Integer> arr) {
        int result = 0;
        for (int i = 1; i < arr.size(); i++) {
            for (int j = 1; j < arr.size(); j++) {
                if (j - 1 > i)
                    result += arr.get(i) * arr.get(j);
            }
        }
        return result;
    }

    
    public static int sumOfSubarrayProd_Problem_2_97c28585_6ab6_413f_a30b_e6f549f0af47(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_4cbc3b23_298f_471f_b315_14367f7b5302(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_a00d17e1_d1c2_4d0f_b1a3_f4a2d018ed77(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_5eb78e35_4801_4f5c_80f7_ff40a8e01e71(ArrayList<Integer> arr) {
        int result = 0;
        int n = arr.size();
        int m = 2;

        //To find the sum of all possible subarray lists 
        while(m * n <= arr.size()){
            for(int i = n; i >= 0; i--){
                if(arr.get(i) >= m){
                    result = result + arr.get(i);
                }
            }
            n++;
            m++;
        }
        return result;
    }

    
    public static int sumOfSubarrayProd_Problem_1_357b079e_fd22_456e_9584_081e26bbb4a0(ArrayList<Integer> arr) {
        int sum = 0;
        final int n = arr.size();
        // Use two pointers, i and j to iterate through the array
        // Do not use any nested loops because we are looking for all possible subarrays. Hence complexity is O(n^2)
        
        // Start from beginning of array and increment i by 1 until it reaches end of array
        for(int i = 0; i < n; i++) {
            // j will start from beginning of array and increment j by 1 until it reaches end of array
            for(int j = 0; j < n; j++) {
                if(i == j)
                    continue;
                else {
                    // Calculate sum for current subarray using product of i and j
                    int p = i * j;
                    sum += p;
                    // Skip this element because we are already processing this subarray
                    continue;
                }
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_de788be9_d66b_4a83_af4a_020e4b8799e7(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_8aa0f381_3608_4e7a_8efc_3affb57b3e98(ArrayList<Integer> arr) {
        int result = 1;
        int prev = 0;
        for( int i = 1 ; i <arr.size() ; i++ ) {
            int sum = 0;
            for( int j = 1 ; j < arr.size() - i ; j++ ) {
                sum += prev * arr.get(j);
            }
            result += sum;
            prev = arr.get(i);
        }
        return result;
    }

    
    public static int sumOfSubarrayProd_Problem_0_1fb80750_0969_4526_9656_4da147fe7835(ArrayList<Integer> arr) {
        int ans = 0;
        // O(n)
        for(int i = 0; i < arr.size(); i++) {
            // O(n)
            for(int j = i + 1; j < arr.size(); j++) {
                // O(1)
                int product = 1;
                // O(n)
                for(int k = 0; k < arr.size(); k++) {
                    // O(n)
                    product *= arr.get(k);
                }
                // O(n^2)
                ans += product;
            }
        }
        return ans;
    }

    
    public static int sumOfSubarrayProd_Problem_2_de5b5758_e217_4e26_80a7_e3513202dcf1(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_4efeddb8_ba1a_4859_8ff7_03c682ab31d6(ArrayList<Integer> arr) {
        int result = 1;
        for (int i : arr) {
            int product = 1;
            int index = 0;
            while (index < i) {
                product = product * i;
                index++;
            }
            result = result + product;
        }
        return result;
    }

    
    public static int sumOfSubarrayProd_Problem_2_ce1fca36_471d_4f4e_8676_1f2a6d522b52(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_95a7a4f5_310e_4c04_a42e_8a68eae6c46e(ArrayList<Integer> arr) {
        int sum = 0;
        int product = 1;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i; j < arr.size(); j++) {
                for(int k = j; k < arr.size(); k++) {
                    for(int l = k; l < arr.size(); l++) {
                        sum += arr.get(i) * arr.get(j) * arr.get(k) * arr.get(l);
                        product *= arr.get(k);
                    }
                }
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_67ef55ae_e9de_4fd8_ab72_89d487d37006(ArrayList<Integer> arr) {
        if (arr == null || arr.size() == 0) {
            return 0;
        }
        int N = arr.size();
        int[] n = new int[N];
        int ret = 0;
        for (int i = 0; i < N; i++) {
            n[i] = arr.get(i);
        }

        // System.out.println("n: " + Arrays.toString(n));
        for (int i = 1; i < N; i++) {
            for (int j = i; j < N; j++) {
                ret += n[i] * n[j];
            }
        }
        return ret;
    }

    
    public static int sumOfSubarrayProd_Problem_1_822cf1f0_9130_4e42_9675_bb91498ee3b0(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_4f1fa356_346b_4a02_83e5_c21c5b66cc7b(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_0cccd6a7_06a9_4184_9e88_fd311f42718f(ArrayList<Integer> arr) {
        int sum = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_7b2bdf20_ff24_4922_8dcc_8f0834525e8c(ArrayList<Integer> arr) {
        int sum = 0;
        int product = 1;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
                product *= arr.get(i);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_1c21af3f_3d77_4c13_ad87_08c9c1566839(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            int prod = 1;
            for (int j = i; j < arr.size(); j++) {
                prod *= arr.get(j);
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_b41ffe98_4f42_4a4f_9cce_986346a29bc7(ArrayList<Integer> arr) {
        int sum = 0;
        int product = 1;
        for (int i = 0; i < arr.size(); i++) {
            int j = i;
            while (j + 1 < arr.size() && arr.get(j + 1) > arr.get(j)) {
                j++;
            }
            int k = j;
            while (k + 1 < arr.size() && arr.get(k + 1) > arr.get(k)) {
                k++;
            }
            int l = k;
            while (l + 1 < arr.size() && arr.get(l + 1) > arr.get(l)) {
                l++;
            }
            sum += product * (arr.get(i) - arr.get(j)) * (arr.get(k) - arr.get(l));
            product = product * arr.get(i);
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_071a5074_b215_49e3_9f34_988c43c6f6fc(ArrayList<Integer> arr) {
        int sum = 0;
        int product = 1;
        int temp = 0;
        int sumOfSubarrayProd_Problem_1_071a5074_b215_49e3_9f34_988c43c6f6fc = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i; j < arr.size(); j++) {
                temp = 1;
                for(int k = i; k < j; k++) {
                    temp *= arr.get(k);
                }
                sum += temp;
                product *= temp;
            }
            sumOfSubarrayProd_Problem_1_071a5074_b215_49e3_9f34_988c43c6f6fc += sum;
            sum = 0;
        }
        return sumOfSubarrayProd_Problem_1_071a5074_b215_49e3_9f34_988c43c6f6fc;
    }

    
    public static int sumOfSubarrayProd_Problem_0_440dccbd_ab3b_4284_8728_35b66219308b(ArrayList<Integer> arr) {
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_0d20ed59_fce1_476a_b5e4_13c937255cc6(ArrayList<Integer> arr) {
        int sum = 0;
        int product = 1;
        int sumOfSubarrayProd_Problem_0_0d20ed59_fce1_476a_b5e4_13c937255cc6 = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i; j < arr.size(); j++) {
                sumOfSubarrayProd_Problem_0_0d20ed59_fce1_476a_b5e4_13c937255cc6 += arr.get(i) * arr.get(j);
            }
            sum += arr.get(i);
            product *= arr.get(i);
        }
        sumOfSubarrayProd_Problem_0_0d20ed59_fce1_476a_b5e4_13c937255cc6 = sumOfSubarrayProd_Problem_0_0d20ed59_fce1_476a_b5e4_13c937255cc6 * product;
        return sumOfSubarrayProd_Problem_0_0d20ed59_fce1_476a_b5e4_13c937255cc6;
    }

    
    public static int sumOfSubarrayProd_Problem_2_09046656_34fc_419e_9d36_e72e92a5ba2b(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_ac356ccb_9899_43ab_9107_16df491147f5(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_09c6f318_591e_43e3_822c_fcb1c575426e(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            int prod = 1;
            for (int j = i; j < arr.size(); j++) {
                prod *= arr.get(j);
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_75ff3e19_752e_433c_af2f_5a57884d3046(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_357b079e_fd22_456e_9584_081e26bbb4a0(ArrayList<Integer> arr) {
        int sum = 0;
        final int n = arr.size();
        // Use two pointers, i and j to iterate through the array
        // Do not use any nested loops because we are looking for all possible subarrays. Hence complexity is O(n^2)
        
        // Start from beginning of array and increment i by 1 until it reaches end of array
        for(int i = 0; i < n; i++) {
            // j will start from beginning of array and increment j by 1 until it reaches end of array
            for(int j = 0; j < n; j++) {
                if(i == j)
                    continue;
                else {
                    // Calculate sum for current subarray using product of i and j
                    int p = i * j;
                    sum += p;
                    // Skip this element because we are already processing this subarray
                    continue;
                }
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_0160089e_1b99_4450_9a4b_6814634bcd96(ArrayList<Integer> arr) {
        int sum = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_21baf8e5_ed65_486e_b1f9_a2ef56687346(ArrayList<Integer> arr) {
        int sum = 0;
        if (arr.size() <= 1) {
            return 0;
        }
        for (int i = 0; i < arr.size(); i++) {
            int product = 1;
            for (int j = i; j < arr.size(); j++) {
                product *= arr.get(i);
            }
            sum += product;
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_b41ffe98_4f42_4a4f_9cce_986346a29bc7(ArrayList<Integer> arr) {
        int sum = 0;
        int product = 1;
        for (int i = 0; i < arr.size(); i++) {
            int j = i;
            while (j + 1 < arr.size() && arr.get(j + 1) > arr.get(j)) {
                j++;
            }
            int k = j;
            while (k + 1 < arr.size() && arr.get(k + 1) > arr.get(k)) {
                k++;
            }
            int l = k;
            while (l + 1 < arr.size() && arr.get(l + 1) > arr.get(l)) {
                l++;
            }
            sum += product * (arr.get(i) - arr.get(j)) * (arr.get(k) - arr.get(l));
            product = product * arr.get(i);
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_b20f774b_1bd1_4a8e_8883_00c1470253c2(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_a7022ab0_379b_40a5_a4bf_bd1814779f68(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_b8d780f8_08bf_446d_ac4b_cfea79968181(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_f8880daa_12fd_45a0_85c6_87d9db97a1b4(ArrayList<Integer> arr) {
        int prod = 0;
        boolean flag = False;
        for(int i=0; i<arr.size(); i++){
            flag = True;
            for(int j=i+1; j<arr.size(); j++){
                if(arr.get(i)*arr.get(j) == 0){
                    flag = False;
                    break;
                }
            }
            if(flag){
                prod += arr.get(i);
            }
        }
        return prod;
    }

    
    public static int sumOfSubarrayProd_Problem_1_de5b5758_e217_4e26_80a7_e3513202dcf1(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_daab436f_f418_4a6f_9117_2010e4a796b8(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_94495d58_b237_457a_a4ff_c0f0b0e83cb6(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_b1fd710d_b88d_4b05_9f44_c17383b0af2a(ArrayList<Integer> arr) {
        int n = arr.size();
        int sum = 0;
        int result = 0;

        //System.out.println("The array is " + Arrays.toString(arr));

        for (int i = 0; i < n; i++) {
            int prod = 0;

            for (int j = i; j < n; j++) {
                prod += arr.get(i);
                result += (prod * arr.get(j));
            }

            sum += result;
            result = 0;
        }
        System.out.println(sum);
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_d85d4c1b_11e8_415a_a56c_1b46454ae603(ArrayList<Integer> arr) {
        if (arr.isEmpty()) return 0;
        int sum = 0;
        for (int a: arr) {
            for (int b: arr) {
                for (int c: arr) {
                    sum += a * b * c;
                }
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_670f4971_ec48_4bc7_aaf4_5bb0848903d9(ArrayList<Integer> arr) {
        int sum = 0;
        int size = arr.size();
        int limit = size - 1;

        // loop over all possible subarrays
        for (int i = size - 1; i >= 0; i--) {
            int k = i + 1;

            // loop over all possible sub-sub-arrays
            for (int j = i - 1; j >= k; j--) {
                sum += arr.get(j) * arr.get(k);

                // stop when array is exhausted
                if (j == 0) break;

                // continue looping for the remaining elements
                k--;
            }

            // stop when sub-array is exhausted
            if (k == 0) break;

            // continue looping for the remaining elements
            i--;
        }

        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_e053f9fd_56c9_4c24_888c_e154d2ed9f5d(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            int prod = 1;
            for (int j = i; j < arr.size(); j++) {
                prod *= arr.get(j);
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_38d8dc28_ae25_4968_ac18_70e9242f2cba(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_60d1e69a_f6b3_4f2d_a144_4c1059fc61a7(ArrayList<Integer> arr) {
        int sum = 0;
        int product = 1;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                for (int k = j + 1; k < arr.size(); k++) {
                    int index = i + j + k;
                    sum += arr.get(index) * product;
                    product *= arr.get(index);
                }
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_dd26ff2b_b395_4569_8277_d932cfa2015d(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_ff995f92_9451_47a5_b5d7_b3cc52fd424d(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_7059db19_534d_4b05_b6f4_55ad1e88f819(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_ab563eb0_03b8_493c_beb9_c2a23a17811b(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_6cb27b44_049b_4996_ae9f_25d34a53f54b(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_eccafd74_b1e8_4a42_a3d1_1efaffe9f798(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_a4171056_b4f0_43ac_ae51_e5324435a10a(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_5fae3858_96de_474f_bd3c_101e29163c1a(ArrayList<Integer> arr) {
        int sum = 0;
        for(int i=0;i<arr.size()-1;i++){
            int arrSum = 0;
            for(int j=0;j<arr.size()-i;j++){
                arrSum += arr.get(i+j);
            }
            sum += arrSum;
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_10e56f1a_34d7_4ed9_b891_36ff448bd45d(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                for (int k = j + 1; k < arr.size(); k++) {
                    sum += arr.get(i) * arr.get(j) * arr.get(k);
                }
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_9e874333_b12a_4cd0_ac39_e5cf485160db(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_af794d66_2f09_4db8_b90a_4b2763887cd9(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_08186fca_889f_4356_84fa_2042a132f873(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_a00d17e1_d1c2_4d0f_b1a3_f4a2d018ed77(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_86fe3e0b_d973_4498_865a_6b516cb8ba5e(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_cb588ed5_68d3_4260_a807_9fdd4d8925e2(ArrayList<Integer> arr) {
        int sum = 0;
        // System.out.println(arr);
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int mult = arr.get(i) * arr.get(j);
                sum += mult;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_01e2617f_ba47_47b9_86da_254f16e55020(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_ad1b0f50_3153_4f9c_a8e9_369928c1c5d4(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_b6303639_f59a_46ab_984f_73e5726e48fb(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            int prod = 1;
            for (int j = i; j < arr.size(); j++) {
                prod *= arr.get(j);
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_bee9daa3_b386_458f_9bf7_62e5bb122132(ArrayList<Integer> arr) {
        int subarrayProd = 1;
        int result = 0;
        for (int i = 1; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                subarrayProd *= arr.get(i);
                subarrayProd *= arr.get(j);
                result += subarrayProd;
            }
        }
        return result;
    }

    
    public static int sumOfSubarrayProd_Problem_2_6d7f0b8f_e961_482c_bf3d_aa72a5478439(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_96e01ff8_699a_4f9a_89ea_8f0beaf89040(ArrayList<Integer> arr) {
        int sum = 0;
        for(int i = 0; i< arr.size()-1; i++) {
            sum+=arr.get(i);
            for(int j = i+1; j < arr.size(); j++) {
                sum+=arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_752e5227_df20_4a34_beea_4bdaf8c0201c(ArrayList<Integer> arr) {
        int sum = 0;
        int product = 1;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i; j < arr.size(); j++) {
                sum = sum + arr.get(i) * arr.get(j);
                product = product * arr.get(i);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_9c067e79_65f3_4bab_8b88_d01ddba88911(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_c84e3554_289a_4eb7_8d5e_a5532bdc4ebb(ArrayList<Integer> arr) {
        int sum = 0;
        int product = 1;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
                product *= arr.get(i);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_46917396_9cbd_4109_a032_dbcd8fedfdbf(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_7f11d78f_9131_414e_811f_e873da76720f(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                for (int k = j + 1; k < arr.size(); k++) {
                    for (int l = k + 1; l < arr.size(); l++) {
                        sum += arr.get(i) * arr.get(j) * arr.get(k) * arr.get(l);
                    }
                }
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_42e8f39d_6190_4a46_b02c_65a507554b72(ArrayList<Integer> arr) {
        int sum = 0;
        final int N = arr.size();
        int[] nums = new int[N];
        Arrays.fill(nums, Integer.MAX_VALUE);
        for(int i = 0; i < N; i++) {
            for(int j = i; j < N; j++){
                nums[i] = Math.max(0, nums[i] + arr.get(i));
                nums[j] = Math.max(0, nums[j] + arr.get(j));
                sum += nums[i];
                sum += nums[j];
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_cde93b53_ad97_48d5_bd57_e4ae240f8b58(ArrayList<Integer> arr) {
        int ans = 0;
        for (int i = 0; i < arr.size(); i++) {
            int curSum = 0;
            for (int j = 0; j < arr.size(); j++) {
                if (i != j) {
                    curSum = curSum + arr.get(j) * (arr.get(i + j) / 2);
                }
            }
            ans += curSum;
        }
        return ans;
    }

    
    public static int sumOfSubarrayProd_Problem_1_59203117_f2b2_4d18_b13e_4ea7951189e9(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_a32192cf_4189_4425_ba91_ba645a47def7(ArrayList<Integer> arr) {
        // write your code here
        int sum = 0;
        int n = arr.size();
        for(int i = 0; i<n; i++) {
            for(int j=0; j<n; j++) {
                for(int k=0; k<n; k++) {
                    for(int l=0; l<n; l++) {
                        sum+=arr.get(i)*arr.get(j)*arr.get(k)*arr.get(l);
                    }
                }
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_73a52c84_024b_40da_9c7d_f2bd63c7ea6f(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_94495d58_b237_457a_a4ff_c0f0b0e83cb6(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_459d6f86_6aaa_421f_b1be_c30e12d229fe(ArrayList<Integer> arr) {
        int sum = 0;
        int product = 1;
        int temp = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i; j < arr.size(); j++) {
                temp = arr.get(i) * arr.get(j);
                sum += temp;
                product *= temp;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_eb273a75_1013_48a1_b0dc_521c6101f3c0(ArrayList<Integer> arr) {
        int N = arr.size();
        if (N == 0) return 0;
        int arrSum = 0; // sum of product of all subarray
        int retVal = 0;
        int i = N - 1;
        int j = N - 1;
        List<ArrayList<Integer>> sublists = new ArrayList<ArrayList<Integer>>();
        do {
            if (i == 0 || j == 0) {
                // no subarrays
                arrSum += arr.get(i);
            } else if (i - j > 1) {
                ArrayList<Integer> a = new ArrayList<Integer>(Arrays.asList(arr.get(i), arr.get(j)));
                sublists.add(a);
            }
            j--;
            if (j >= 0) {
                i--;
            }
        } while (i >= 0);
        // iterate over sublists
        for (ArrayList<Integer> sublist : sublists) {
            retVal += sublist.get(0);
            for (int k = 1; k < sublist.size(); k++) {
                retVal += sublist.get(k) * arr.get(i - k + j);
            }
        }
        return retVal;
    }

    
    public static int sumOfSubarrayProd_Problem_0_6ae06bf3_86ba_4e12_84b5_38ca9236d4f3(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_b88c6a72_cca8_4d47_b20f_0bf32b682f8f(ArrayList<Integer> arr) {
        int sum = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_708cec8b_8261_4e7f_aa9f_8e7d2e79bbc3(ArrayList<Integer> arr) {
        int sum = 0;
        for (Integer l : arr) {
            sum += l;
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_34cb20ef_9dfd_4458_b6af_04c6b2ec2629(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_2f8b16d9_6026_4ef5_9b3f_d2884e208c2f(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_854d0a57_e193_4bc6_a0cf_a1c78db6eff6(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_90e831f1_fb64_43db_bdff_260f73ab4940(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_e8f8e90b_9bf2_4f27_893d_15a2e28a58e8(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                sum += arr.get(i) * arr.get(j);
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_e484260c_34ea_4c44_b953_fdb808c25d8a(ArrayList<Integer> arr) {
        int sum = 0;
        int product = 1;
        for (int i = 0; i < arr.size(); i++) {
            int subArrSum = 0;
            for (int j = i; j < arr.size(); j++) {
                subArrSum += arr.get(j);
            }
            sum += subArrSum * product;
            product *= arr.get(i);
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_2_9b5efd85_90b9_4e75_8688_b3e9652e3b44(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr.get(k);
                }
                sum += prod;
            }
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_1_d54e788a_0d67_460b_8b10_aaa1ef50a276(ArrayList<Integer> arr) {
        ArrayList<Integer> sublist = new ArrayList<Integer>();
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i+1; j < arr.size(); j++) {
                sublist.add(arr.get(i) * arr.get(j));
            }
        }
        for (int i = 0; i < sublist.size(); i++) {
            sum = sum + sublist.get(i);
        }
        return sum;
    }

    
    public static int sumOfSubarrayProd_Problem_0_d6bb4099_7dcf_4763_b01c_66b7830663d7(ArrayList<Integer> arr) {
        // Write your code here
        int sum = 0;
        int maxSize = arr.size();
        int curSubSize = 1;
        int curProduct = 1;
        int product = 1;

        while(curSubSize <= maxSize) {
            for(int i=0; i<arr.size(); i++) {
                int num = arr.get(i);
                curProduct = num * product;
                if(curProduct > 0) {
                    sum += curProduct;
                }
                product = product * num;
            }
            curSubSize++;
        }

        return sum;
    }

}
