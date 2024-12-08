package mbpp_62_smallest_num;

public class mbpp_62_smallest_num {

    
    public static int smallestNum_Problem_1_f9b545a4_a1fb_48e3_9d72_799f113d53e0(ArrayList<Integer> xs) {
        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;
        int ans = Integer.MAX_VALUE;
        for(Integer x : xs) {
            int cur = x<low?low:x;
            x=x>high?high:x;
            if (low!=Integer.MAX_VALUE && high!=Integer.MIN_VALUE && (x-cur)<ans) {
                ans = (x-cur);
            }
            low = cur;
            high = x;
        }
        return ans;
    }

    
    public static int smallestNum_Problem_2_8fdb61ad_6d79_46c4_9a72_caf89713fb92(ArrayList<Integer> xs) {
        // Use Java 8 stream API to find smallest number
        return Collections.min(xs);
    }

    
    public static int smallestNum_Problem_1_79827702_c489_483d_8084_a90d1568b9bb(ArrayList<Integer> xs) {
        if(xs.size() < 1)
            return 0;
        int minNum = xs.get(0);
        for(Integer num : xs) {
            if(num < minNum)
                minNum = num;
        }
        return minNum;
    }

    
    public static int smallestNum_Problem_1_61841fd8_238e_4455_a6e1_14d6ec3f91f3(ArrayList<Integer> xs) {
        int min = xs.get(0);
        for (int i = 1; i < xs.size(); i++) {
            min = Math.min(min, xs.get(i));
        }
        return min;
    }

    
    public static int smallestNum_Problem_0_2a6fb586_dec2_4f7b_a5d3_fd0563d7d9f1(ArrayList<Integer> xs) {
        int minNum = xs.get(0); // Initialize minNum to first element of ArrayList
        for (Integer num : xs) {
            if (num < minNum) {
                minNum = num;
            }
        }
        return minNum;
    }

    
    public static int smallestNum_Problem_0_b208da69_b1e6_497b_8069_356385b0f92c(ArrayList<Integer> xs) {
        int lowest = Integer.MAX_VALUE;
        for (Integer val : xs) {
            if (lowest > val) {
                lowest = val;
            }
        }
        return lowest;
    }

    
    public static int smallestNum_Problem_0_22f405af_5af6_40c8_af4d_aea5c1e4e696(ArrayList<Integer> xs) {
        int min = xs.get(0);
        for (int i = 1; i < xs.size(); i++) {
            if (xs.get(i) < min) {
                min = xs.get(i);
            }
        }
        return min;
    }

    
    public static int smallestNum_Problem_1_5a316eca_91e8_4d9e_b5f8_9e9261f50c82(ArrayList<Integer> xs) {
        int smallest = Integer.MAX_VALUE;
        for (Integer num : xs) {
            if (smallest > num) {
                smallest = num;
            }
        }
        return smallest;
    }

    
    public static int smallestNum_Problem_2_29ac4c46_4c68_457e_b836_3e41e642bc6f(ArrayList<Integer> xs) {
        int smallest = Integer.MAX_VALUE;
        for (int num: xs) {
            if (num < smallest) {
                smallest = num;
            }
        }
        return smallest;
    }

    
    public static int smallestNum_Problem_2_2a6fb586_dec2_4f7b_a5d3_fd0563d7d9f1(ArrayList<Integer> xs) {
        int minNum = xs.get(0); // Initialize minNum to first element of ArrayList
        for (Integer num : xs) {
            if (num < minNum) {
                minNum = num;
            }
        }
        return minNum;
    }

    
    public static int smallestNum_Problem_1_6da02128_b831_46e0_9156_ea66e16e72e7(ArrayList<Integer> xs) {
        // Write your code here.
        int smallest = Integer.MAX_VALUE;
        for (Integer num : xs) {
            if (num < smallest)
                smallest = num;
        }
        return smallest;
    }

    
    public static int smallestNum_Problem_0_3ee6ca9a_6c64_4837_b51c_8690234a8d36(ArrayList<Integer> xs) {
        int min = xs.stream().min(Integer::compareTo).get();
        int max = xs.stream().max(Integer::compareTo).get();
        return min > max ? min : max;
    }

    
    public static int smallestNum_Problem_2_8932e98d_c79e_42c4_8797_dd59544f3e1b(ArrayList<Integer> xs) {
        int min = Integer.MAX_VALUE;
        for (Integer x : xs) {
            if (x < min) {
                min = x;
            }
        }
        return min;
    }

    
    public static int smallestNum_Problem_1_04b5c466_5229_462d_b280_06c71e8001a6(ArrayList<Integer> xs) {
        int smallest = xs.get(0); // initialize smallest to first element
        for (Integer x : xs) {
            if (x < smallest) {
                smallest = x;
            }
        }
        return smallest;
    }

    
    public static int smallestNum_Problem_2_df74b85c_f9bb_4c54_9cb7_ddc2ee9e5a33(ArrayList<Integer> xs) {
        int min = xs.get(0);
        for (Integer x : xs) {
            if (x < min) min = x;
        }
        return min;
    }

    
    public static int smallestNum_Problem_1_6ab86d55_1330_4aeb_97d2_035ba6709a8d(ArrayList<Integer> xs) {
        int minNum = xs.get(0); // First element in the list is the smallest number

        for (int i = 1; i < xs.size(); i++) { // Iterate from 2nd to the last element
            if (xs.get(i) < minNum) {
                minNum = xs.get(i);
            }
        }
        return minNum;
    }

    
    public static int smallestNum_Problem_2_c079d327_15b4_4a22_a976_2911e49420cd(ArrayList<Integer> xs) {
        int lowest = 0;
        for (int x : xs) {
            if (x < lowest)
                lowest = x;
        }
        return lowest;
    }

    
    public static int smallestNum_Problem_0_79827702_c489_483d_8084_a90d1568b9bb(ArrayList<Integer> xs) {
        if(xs.size() < 1)
            return 0;
        int minNum = xs.get(0);
        for(Integer num : xs) {
            if(num < minNum)
                minNum = num;
        }
        return minNum;
    }

    
    public static int smallestNum_Problem_0_8932e98d_c79e_42c4_8797_dd59544f3e1b(ArrayList<Integer> xs) {
        int min = Integer.MAX_VALUE;
        for (Integer x : xs) {
            if (x < min) {
                min = x;
            }
        }
        return min;
    }

    
    public static int smallestNum_Problem_2_a1a43909_88d0_42f9_aec3_de3791f81ca3(ArrayList<Integer> xs) {
        int min = Integer.MAX_VALUE;
        for (Integer x : xs) {
            if (x < min) {
                min = x;
            }
        }
        return min;
    }

    
    public static int smallestNum_Problem_0_23423810_1b88_4531_b67d_4e10ed21137d(ArrayList<Integer> xs) {
        // Write your code here
        int minValue = xs.get(0);
        for (Integer i : xs) {
            if (i.compareTo(minValue) < 0) {
                minValue = i;
            }
        }
        return minValue;
    }

    
    public static int smallestNum_Problem_2_dafbd610_6779_4c0d_a17d_4f32cc7d6a64(ArrayList<Integer> xs) {
        // write code here
        int smallestNum_Problem_2_dafbd610_6779_4c0d_a17d_4f32cc7d6a64 = xs.get(xs.size()-1);
        for (int i = xs.size()-2; i >= 0; i--) {
            if (xs.get(i) < smallestNum_Problem_2_dafbd610_6779_4c0d_a17d_4f32cc7d6a64) {
                smallestNum_Problem_2_dafbd610_6779_4c0d_a17d_4f32cc7d6a64 = xs.get(i);
            }
        }
        return smallestNum_Problem_2_dafbd610_6779_4c0d_a17d_4f32cc7d6a64;
    }

    
    public static int smallestNum_Problem_0_04b5c466_5229_462d_b280_06c71e8001a6(ArrayList<Integer> xs) {
        int smallest = xs.get(0); // initialize smallest to first element
        for (Integer x : xs) {
            if (x < smallest) {
                smallest = x;
            }
        }
        return smallest;
    }

    
    public static int smallestNum_Problem_1_c30b5e9a_3eb0_4030_9afd_f670e25da706(ArrayList<Integer> xs) {
        int smallest = Integer.MAX_VALUE;
        for (Integer value : xs) {
            if (value < smallest) {
                smallest = value;
            }
        }
        return smallest;
    }

    
    public static int smallestNum_Problem_1_a1a43909_88d0_42f9_aec3_de3791f81ca3(ArrayList<Integer> xs) {
        int min = Integer.MAX_VALUE;
        for (Integer x : xs) {
            if (x < min) {
                min = x;
            }
        }
        return min;
    }

}
