package mbpp_468_max_product;

public class mbpp_468_max_product {

    
    public static int maxProduct_Problem_0_2e6d8b5f_1769_4871_b93d_3098491d3c93(ArrayList<Integer> arr) {
        int max = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if(product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_2_bbb3e42f_d43e_41e7_bd71_4feba6a1ccf4(ArrayList<Integer> arr) {
        int max = 0;
        int product = 1;
        for (int i = 0; i < arr.size(); i++) {
            product *= arr.get(i);
            max = Math.max(max, product);
        }
        return max;
    }

    
    public static int maxProduct_Problem_2_5a852c74_ea37_4657_9c10_f2f8ddde9a69(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if (product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_2_f4a6270d_cc57_444a_9bdb_786d3abde768(ArrayList<Integer> arr) {
        int[] max = new int[arr.size()];
        int[] min = new int[arr.size()];
        max[0] = arr.get(0);
        min[0] = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            int curr = arr.get(i);
            int currMax = max[i - 1] * curr;
            int currMin = min[i - 1] * curr;
            max[i] = Math.max(Math.max(currMax, currMin), curr);
            min[i] = Math.min(Math.min(currMax, currMin), curr);
        }
        int maxProduct_Problem_2_f4a6270d_cc57_444a_9bdb_786d3abde768 = Integer.MIN_VALUE;
        for (int i = 0; i < arr.size(); i++) {
            maxProduct_Problem_2_f4a6270d_cc57_444a_9bdb_786d3abde768 = Math.max(maxProduct_Problem_2_f4a6270d_cc57_444a_9bdb_786d3abde768, max[i]);
        }
        return maxProduct_Problem_2_f4a6270d_cc57_444a_9bdb_786d3abde768;
    }

    
    public static int maxProduct_Problem_0_24a6bae6_e513_4479_8c17_7fe5bb90e43a(ArrayList<Integer> arr) {
        // Write your code here
        int max = 0;
        int product = 1;
        for(int i = 0; i < arr.size(); i++) {
            product = 1;
            for(int j = i; j < arr.size(); j++) {
                product *= arr.get(j);
                if(product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_0_9ba1955b_e753_40db_9270_9bd371e4697e(ArrayList<Integer> arr) {
        // Write your code here
        int n = arr.size();
        int[] dp = new int[n];
        dp[0] = arr.get(0);
        for(int i = 1; i < n; i++) {
            int max = Integer.MIN_VALUE;
            for(int j = 0; j < i; j++) {
                if(arr.get(i) > arr.get(j)) {
                    max = Math.max(max, dp[j]);
                }
            }
            dp[i] = max == Integer.MIN_VALUE ? arr.get(i) : max * arr.get(i);
        }
        int ans = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++) {
            ans = Math.max(ans, dp[i]);
        }
        return ans;
    }

    
    public static int maxProduct_Problem_2_24a6bae6_e513_4479_8c17_7fe5bb90e43a(ArrayList<Integer> arr) {
        // Write your code here
        int max = 0;
        int product = 1;
        for(int i = 0; i < arr.size(); i++) {
            product = 1;
            for(int j = i; j < arr.size(); j++) {
                product *= arr.get(j);
                if(product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_0_79c3d0b1_116b_4114_b055_e3f28723666e(ArrayList<Integer> arr) {
        int max = 0;
        int product = 1;
        for (int i = 0; i < arr.size(); i++) {
            product *= arr.get(i);
            max = Math.max(max, product);
            product = 1;
        }
        return max;
    }

    
    public static int maxProduct_Problem_2_e0b7bf99_c7ca_4742_8d6b_aa59984889e0(ArrayList<Integer> arr) {
        int[] dp = new int[arr.size()];
        int[] dp2 = new int[arr.size()];
        dp[0] = arr.get(0);
        dp2[0] = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            int max = arr.get(i);
            int min = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(j) < arr.get(i)) {
                    max = Math.max(max, dp[j] * arr.get(i));
                    min = Math.min(min, dp2[j] * arr.get(i));
                }
            }
            dp[i] = max;
            dp2[i] = min;
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.size(); i++) {
            max = Math.max(max, dp[i]);
        }
        return max;
    }

    
    public static int maxProduct_Problem_0_44e449f9_a2c2_454a_b8b5_265d9c9a7b1f(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if (product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_2_8e57a5d1_ef29_4a3e_929b_2e52c1fa709b(ArrayList<Integer> arr) {
        ArrayList<Integer> subSeq = new ArrayList<Integer>();
        int maxProd = 0;

        for(int i = 0; i < arr.size() - 1; i++) {
            int product = arr.get(i) * arr.get(i + 1);
            subSeq.add(product);
        }
        int lastProd = subSeq.get(subSeq.size() - 1);

        int lastProdSum = lastProd;
        for(int p : subSeq) {
            lastProdSum *= p;
        }

        if (lastProdSum > maxProd) {
            maxProd = lastProdSum;
        }
        return maxProd;
    }

    
    public static int maxProduct_Problem_1_8c23d201_5a94_4e05_b2ce_e4405998d630(ArrayList<Integer> arr) {
        int max = 0;
        int[] dp = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            dp[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(i) > arr.get(j)) {
                    dp[i] = Math.max(dp[i], dp[j] * arr.get(i));
                }
            }
            max = Math.max(max, dp[i]);
        }
        return max;
    }

    
    public static int maxProduct_Problem_0_472f317a_49f9_4b41_b23e_3a2d31b23854(ArrayList<Integer> arr) {
        int max = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            int curr = arr.get(i);
            max = Math.max(max, curr * arr.get(i - 1));
        }
        return max;
    }

    
    public static int maxProduct_Problem_0_eb111817_5e42_4068_8a64_4e2ac3d3b4a0(ArrayList<Integer> arr) {
        int max = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i+1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if(product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_2_f84e5a23_31c9_4923_86c8_301b8147ca8f(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if (product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_2_006bbff1_89e0_4d84_98e0_87010b27f8e2(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if (product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_2_2eda1a70_ed5f_4a4e_85a0_f6bb28d7d7ed(ArrayList<Integer> arr) {
        int max = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if(product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_2_5ad82fab_39ca_4aa9_8250_e74963bf9f86(ArrayList<Integer> arr) {
        int max = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if(product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_1_20b18792_a1d0_47cc_8cf1_34196b0cbc00(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if (product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_2_7b03ab77_6909_44ea_8f28_888dfe9716dd(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            int product = 1;
            for (int j = i; j < arr.size(); j++) {
                product *= arr.get(j);
                if (product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_2_ee3c4542_b9ba_46ef_8235_fd42087b4fec(ArrayList<Integer> arr) {
        int max = 0;
        int product = 1;
        for(int i = 0; i < arr.size(); i++) {
            product *= arr.get(i);
            if(product > max) {
                max = product;
            }
            product = 1;
        }
        return max;
    }

    
    public static int maxProduct_Problem_2_ce26a9a6_2ba6_4b57_a10f_6d31450acb07(ArrayList<Integer> arr) {
        int maxProd = 1;
        int maxVal = arr.get(0);
        
        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i) > maxVal) {
                maxVal = arr.get(i);
                maxProd = maxVal;
            }
            else if (arr.get(i) == maxVal && arr.get(i-1) > maxVal) {
                maxProd = Math.max(maxProd, arr.get(i));
            }
        }
        
        return maxProd;
    }

    
    public static int maxProduct_Problem_1_6f1f2ca9_9b7a_4e41_a516_ce90bb9b8751(ArrayList<Integer> arr) {
        int max = 0;
        int product = 1;
        for (int i = 0; i < arr.size(); i++) {
            product *= arr.get(i);
            max = Math.max(max, product);
        }
        return max;
    }

    
    public static int maxProduct_Problem_1_1cd939ee_0bed_41fb_9c3f_8404c430fa0c(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if (product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_0_f01146ed_f095_4618_bca0_0237daa5eeba(ArrayList<Integer> arr) {
        int max = 0;
        for(int i = 0; i < arr.size(); i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if(product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_2_e676f8e8_d791_4cb1_ab65_8356af8c8891(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if (product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_0_ce87a1c8_244c_4559_9d1f_38de1e8df2b9(ArrayList<Integer> arr) {
        int max = 0;
        int product = 1;
        for(int i = 0; i < arr.size(); i++) {
            product *= arr.get(i);
            if(product > max) {
                max = product;
            }
            product = 1;
        }
        return max;
    }

    
    public static int maxProduct_Problem_1_c5e69e6d_c318_4be4_b1fa_834f57456654(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if (product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_1_cc28c99d_6c5c_4af4_bfc6_92988b36b9d2(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if (product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_2_ce87a1c8_244c_4559_9d1f_38de1e8df2b9(ArrayList<Integer> arr) {
        int max = 0;
        int product = 1;
        for(int i = 0; i < arr.size(); i++) {
            product *= arr.get(i);
            if(product > max) {
                max = product;
            }
            product = 1;
        }
        return max;
    }

    
    public static int maxProduct_Problem_0_7507fe09_888e_4b62_acb0_8dbd4fbfda4f(ArrayList<Integer> arr) {
        int max = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if(product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_0_2d7e92cf_fabb_4446_b229_db1b20cbcb4d(ArrayList<Integer> arr) {
        int maxProduct_Problem_0_2d7e92cf_fabb_4446_b229_db1b20cbcb4d = 1;
        int prev = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            int curr = arr.get(i);
            if (curr > prev) {
                maxProduct_Problem_0_2d7e92cf_fabb_4446_b229_db1b20cbcb4d *= curr;
            }
            prev = curr;
        }
        return maxProduct_Problem_0_2d7e92cf_fabb_4446_b229_db1b20cbcb4d;
    }

    
    public static int maxProduct_Problem_2_1cd939ee_0bed_41fb_9c3f_8404c430fa0c(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if (product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_0_0e0819ba_2155_4bb1_997b_8a602f86e4a6(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if (product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_0_756a1ba4_0cff_44b0_b665_924ae22d330d(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) < arr.get(j)) {
                    int prod = arr.get(i) * arr.get(j);
                    if (prod > max) {
                        max = prod;
                    }
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_0_ecfa9e59_a143_4a35_81c3_086c3542df76(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if (product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_2_80d31293_b52e_4787_b853_1adf8c61923a(ArrayList<Integer> arr) {
        int max = 0;
        int product = 1;
        for (int i = 0; i < arr.size(); i++) {
            product *= arr.get(i);
            max = Math.max(max, product);
            product = 1;
        }
        return max;
    }

    
    public static int maxProduct_Problem_1_acc18d1f_9be0_4d11_93dc_3fbe86873bf9(ArrayList<Integer> arr) {
        int max = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            int curr = arr.get(i);
            max = Math.max(max, curr * arr.get(i - 1));
        }
        return max;
    }

    
    public static int maxProduct_Problem_2_81f316e5_b1bf_4727_86f5_01a15731f2f9(ArrayList<Integer> arr) {
        int max = 0;
        int product = 1;
        for(int i = 0; i < arr.size(); i++) {
            product *= arr.get(i);
            if(product > max) {
                max = product;
            }
            product = 1;
        }
        return max;
    }

    
    public static int maxProduct_Problem_0_b6db003e_8dcb_4ade_81ef_cc2c9d982354(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if (product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_1_db97e93f_8c83_4877_b095_211e0daa3f5e(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if (product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_0_c5d56a25_e396_4346_b81e_43ef9e01421e(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if (product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_0_e1dab0f3_b061_43d6_837a_e177430b9e72(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(j) > arr.get(i)) {
                    int product = arr.get(i) * arr.get(j);
                    if (product > max) {
                        max = product;
                    }
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_1_2d7e92cf_fabb_4446_b229_db1b20cbcb4d(ArrayList<Integer> arr) {
        int maxProduct_Problem_1_2d7e92cf_fabb_4446_b229_db1b20cbcb4d = 1;
        int prev = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            int curr = arr.get(i);
            if (curr > prev) {
                maxProduct_Problem_1_2d7e92cf_fabb_4446_b229_db1b20cbcb4d *= curr;
            }
            prev = curr;
        }
        return maxProduct_Problem_1_2d7e92cf_fabb_4446_b229_db1b20cbcb4d;
    }

    
    public static int maxProduct_Problem_2_28852b94_7e18_463a_847c_01be39bf5107(ArrayList<Integer> arr) {
        int max = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            max = Math.max(max * arr.get(i), arr.get(i));
        }
        return max;
    }

    
    public static int maxProduct_Problem_2_ecfa9e59_a143_4a35_81c3_086c3542df76(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if (product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_2_7b9f25a2_ad84_4080_b71e_7b38f18ee0c1(ArrayList<Integer> arr) {
        int max = 1;
        int min = 1;
        int maxProduct_Problem_2_7b9f25a2_ad84_4080_b71e_7b38f18ee0c1 = 1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                max = max * arr.get(i);
                min = Math.min(min * arr.get(i), 1);
            } else if (arr.get(i) == 0) {
                max = 1;
                min = 1;
            } else {
                int temp = max;
                max = Math.max(min * arr.get(i), 1);
                min = temp * arr.get(i);
            }
            if (maxProduct_Problem_2_7b9f25a2_ad84_4080_b71e_7b38f18ee0c1 < max) {
                maxProduct_Problem_2_7b9f25a2_ad84_4080_b71e_7b38f18ee0c1 = max;
            }
        }
        return maxProduct_Problem_2_7b9f25a2_ad84_4080_b71e_7b38f18ee0c1;
    }

    
    public static int maxProduct_Problem_0_97589653_f718_42d6_bc54_2c5ba6c6c86c(ArrayList<Integer> arr) {
        int max = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if(product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_2_246f71ef_98e5_406f_811f_d61999728a45(ArrayList<Integer> arr) {
        int max = 0;
        int product = 1;
        for(int i = 0; i < arr.size(); i++) {
            product *= arr.get(i);
            if(product > max) {
                max = product;
            }
            product = 1;
        }
        return max;
    }

    
    public static int maxProduct_Problem_2_f0f51537_f639_4f3e_8d51_8bced449ac70(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if (product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_0_74285bc7_f20d_4eed_a5e1_2a4d256d3a7a(ArrayList<Integer> arr) {
        int max_prod = 0;
        for (int i = 0; i < arr.size(); i++) {
            int prod = arr.get(i);
            for (int j = i; j < arr.size(); j++) {
                prod = prod * arr.get(j);
                arr.set(j, prod);
            }
            if (prod > max_prod) {
                max_prod = prod;
            }
        }
        return max_prod;
    }

    
    public static int maxProduct_Problem_1_1aff1433_b748_4ae9_b3b3_bbc834b7ae80(ArrayList<Integer> arr) {
        int max = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if(product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_2_d76e5cd2_4b11_495f_ae4b_737fb7c82e68(ArrayList<Integer> arr) {
        ArrayList <Integer> sub = new ArrayList <Integer>();
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (sub.contains(arr.get(i))) continue;
            int x = i;
            int y = i + 1;
            while (y < arr.size() && arr.get(x) * arr.get(y) <= 0) {
                x = x + 1;
                y = y + 1;
            }
            max = Math.max(max, arr.get(x) * arr.get(y));
            sub.add(arr.get(i));
        }
        return max;
    }

    
    public static int maxProduct_Problem_0_d3df6e5d_e9af_484f_8d4e_d4850d06e7b1(ArrayList<Integer> arr) {
        int max = 0;
        int prod = 1;
        for (int i = 0; i < arr.size() - 1; i++) {
            prod *= arr.get(i);
            max = Math.max(prod, max);
        }
        return max;
    }

    
    public static int maxProduct_Problem_1_eaf04120_96fe_4a2a_83e1_a7d89206d5a8(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if (product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_2_74c04917_6b11_4e31_903b_fd7ea04f4841(ArrayList<Integer> arr) {
        int max = 0;
        int product = 1;
        for (int i = 0; i < arr.size(); i++) {
            product *= arr.get(i);
            max = Math.max(max, product);
        }
        return max;
    }

    
    public static int maxProduct_Problem_2_7daabef7_07a8_42c5_9404_2dfe073f54fc(ArrayList<Integer> arr) {
        int max = 0;
        int product = 1;
        for (int i = 0; i < arr.size(); i++) {
            product *= arr.get(i);
            if (product > max) {
                max = product;
            }
            product = 1;
        }
        return max;
    }

    
    public static int maxProduct_Problem_0_7b03ab77_6909_44ea_8f28_888dfe9716dd(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            int product = 1;
            for (int j = i; j < arr.size(); j++) {
                product *= arr.get(j);
                if (product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_0_fecfe0ff_1716_4461_adbf_a2d5f6a0ce97(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            int product = 1;
            for (int j = i; j < arr.size(); j++) {
                product *= arr.get(j);
                max = Math.max(max, product);
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_2_600b332f_b333_4755_82ef_35437be7ccf8(ArrayList<Integer> arr) {
        int n = arr.size();
        int[] dp = new int[n];
        dp[0] = arr.get(0);
        for (int i = 1; i < n; i++) {
            dp[i] = arr.get(i);
            for (int j = 0; j < i; j++) {
                if (arr.get(i) > arr.get(j)) {
                    dp[i] = Math.max(dp[i], dp[j] * arr.get(i));
                }
            }
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans = Math.max(ans, dp[i]);
        }
        return ans;
    }

    
    public static int maxProduct_Problem_0_7b9f25a2_ad84_4080_b71e_7b38f18ee0c1(ArrayList<Integer> arr) {
        int max = 1;
        int min = 1;
        int maxProduct_Problem_0_7b9f25a2_ad84_4080_b71e_7b38f18ee0c1 = 1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                max = max * arr.get(i);
                min = Math.min(min * arr.get(i), 1);
            } else if (arr.get(i) == 0) {
                max = 1;
                min = 1;
            } else {
                int temp = max;
                max = Math.max(min * arr.get(i), 1);
                min = temp * arr.get(i);
            }
            if (maxProduct_Problem_0_7b9f25a2_ad84_4080_b71e_7b38f18ee0c1 < max) {
                maxProduct_Problem_0_7b9f25a2_ad84_4080_b71e_7b38f18ee0c1 = max;
            }
        }
        return maxProduct_Problem_0_7b9f25a2_ad84_4080_b71e_7b38f18ee0c1;
    }

    
    public static int maxProduct_Problem_1_5ad82fab_39ca_4aa9_8250_e74963bf9f86(ArrayList<Integer> arr) {
        int max = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if(product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_1_1baf78e3_8958_470e_96cc_94d3651960d5(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            int product = 1;
            for (int j = i; j < arr.size(); j++) {
                product *= arr.get(j);
                if (product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_0_f99105ca_977b_4944_bdc3_b7aa03e9b642(ArrayList<Integer> arr) {
        int len = arr.size();
        int max = 0;
        int prod = 1;
        if (len < 2) return -1;
        // sort the array by descending order
        Collections.sort(arr);

        // the product for the last element will be the result
        max = prod;
        // the product for remaining elements is the max
        for (int i = len-1; i >= 0; i--) {
            prod = prod * arr.get(i);
            // if the prod > max, then update max
            if (prod > max) {
                max = prod;
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_2_dcfb4548_2e6a_4d64_86f1_4f77f25b5661(ArrayList<Integer> arr) {
        int max = 0;
        int product = 1;
        for(int i = 0; i < arr.size(); i++) {
            product *= arr.get(i);
            if(product > max) {
                max = product;
            }
            product = 1;
        }
        return max;
    }

    
    public static int maxProduct_Problem_1_4702c30d_595d_4300_8b9f_518df228e5d2(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            int product = 1;
            for (int j = i; j < arr.size(); j++) {
                product *= arr.get(j);
                if (product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_0_e2de7bf4_1df6_4927_ab66_ae118649fc7c(ArrayList<Integer> arr) {
        int max = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            max = Math.max(max * arr.get(i), arr.get(i));
        }
        return max;
    }

    
    public static int maxProduct_Problem_0_246f71ef_98e5_406f_811f_d61999728a45(ArrayList<Integer> arr) {
        int max = 0;
        int product = 1;
        for(int i = 0; i < arr.size(); i++) {
            product *= arr.get(i);
            if(product > max) {
                max = product;
            }
            product = 1;
        }
        return max;
    }

    
    public static int maxProduct_Problem_1_4e8db918_a42e_4db7_ab12_05debdbe171b(ArrayList<Integer> arr) {
        int max = 0;
        int product = 1;
        for (int i = 0; i < arr.size(); i++) {
            product = 1;
            for (int j = i; j < arr.size(); j++) {
                product *= arr.get(j);
                if (product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_2_97589653_f718_42d6_bc54_2c5ba6c6c86c(ArrayList<Integer> arr) {
        int max = 0;
        for(int i = 0; i < arr.size() - 1; i++) {
            for(int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if(product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_2_ccebded7_3ecd_4b99_820b_d3cc27a8e6de(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if (product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_0_b2f83607_f50a_4d23_86f3_e3411e2a30ca(ArrayList<Integer> arr) {
        int max = 0;
        int product = 1;
        for(int i = 0; i < arr.size(); i++) {
            product *= arr.get(i);
            max = Math.max(max, product);
            product = 1;
        }
        return max;
    }

    
    public static int maxProduct_Problem_0_1502d3c4_9391_4586_abaf_0e486fb49caa(ArrayList<Integer> arr) {
        int max = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            max = Math.max(max, arr.get(i) * arr.get(i));
        }
        return max;
    }

    
    public static int maxProduct_Problem_0_5bb7b264_a5be_4719_acc7_7f7c65b96275(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if (product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_1_503b9334_994c_46b4_b491_7d4d55495faf(ArrayList<Integer> arr) {
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.size(); i++) {
            if(arr.subList(i, i+1).stream().mapToInteger(Integer::intValue).sum() > max)
                max = arr.subList(i, i+1).stream().mapToInteger(Integer::intValue).sum();
        }
        return max;
    }

    
    public static int maxProduct_Problem_0_4f210409_4f7a_473b_b07d_4c2ace086539(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int product = arr.get(i) * arr.get(j);
                if (product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_1_f99105ca_977b_4944_bdc3_b7aa03e9b642(ArrayList<Integer> arr) {
        int len = arr.size();
        int max = 0;
        int prod = 1;
        if (len < 2) return -1;
        // sort the array by descending order
        Collections.sort(arr);

        // the product for the last element will be the result
        max = prod;
        // the product for remaining elements is the max
        for (int i = len-1; i >= 0; i--) {
            prod = prod * arr.get(i);
            // if the prod > max, then update max
            if (prod > max) {
                max = prod;
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_2_53ff8cc9_aafa_4c87_b8ba_96107f85d12c(ArrayList<Integer> arr) {
        int max = 0;
        int product = 1;
        for (int i = 0; i < arr.size(); i++) {
            product *= arr.get(i);
            if (product > max) {
                max = product;
            }
        }
        return max;
    }

    
    public static int maxProduct_Problem_1_4e6e9f3a_c7e5_497e_b7dd_4345b927f32c(ArrayList<Integer> arr) {
        int max = arr.get(0);
        int min = arr.get(0);
        int result = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            int temp = max;
            max = Math.max(Math.max(max * arr.get(i), min * arr.get(i)), arr.get(i));
            min = Math.min(Math.min(temp * arr.get(i), min * arr.get(i)), arr.get(i));
            result = Math.max(result, max);
        }
        return result;
    }

}
