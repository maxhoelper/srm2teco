package mbpp_476_big_sum;

public class mbpp_476_big_sum {

    
    public static int bigSum_Problem_0_d5fa0a49_effe_4f9d_9c5b_2438f696ee4f(ArrayList<Integer> nums) {
        int sum = 0;
        if (nums.size() > 0) {
            int min = nums.get(0);
            int max = nums.get(0);
            for (int i = 1; i < nums.size(); i++) {
                if (nums.get(i) < min) min = nums.get(i);
                if (nums.get(i) > max) max = nums.get(i);
            }
            sum = max + min;
        }
        return sum;
    }

    
    public static int bigSum_Problem_0_5a6f31ed_e8f7_49ca_adf6_4e69c80d4a3f(ArrayList<Integer> nums) {
        int sum = 0;
        for(Integer num : nums) {
            sum += num;
        }
        return sum;
    }

    
    public static int bigSum_Problem_0_8372870d_4020_4adc_9a8e_eb54ce7ff29c(ArrayList<Integer> nums) {
        int largest = Collections.max(nums);
        int smallest = Collections.min(nums);
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_33fe8a0c_532d_4ed2_a87e_ffe0e0b9691f(ArrayList<Integer> nums) {
        // Write your logic here
        int sum = 0;
        for(int num : nums) {
            sum = sum + num;
        }
        return sum;
    }

    
    public static int bigSum_Problem_0_115da78e_2b45_402a_abd8_22377c40a217(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_d8210b92_1ca1_4f11_9797_d906d29d035d(ArrayList<Integer> nums) {
        if (nums.size() == 0)
            return 0L;
        int largestNum = nums.get(0);
        for (int i = 1; i < nums.size(); i++) {
            if (nums.get(i) > largestNum) {
                largestNum = nums.get(i);
            }
        }
        int smallestNum = nums.get(0);
        for (int i = 1; i < nums.size(); i++) {
            if (nums.get(i) < smallestNum) {
                smallestNum = nums.get(i);
            }
        }
        return largestNum + smallestNum;
    }

    
    public static int bigSum_Problem_1_243e7b94_9d1d_4afb_94d7_508058a22b95(ArrayList<Integer> nums) {
        int result = 0, largest = Integer.MIN_VALUE, smallest = Integer.MAX_VALUE;
        for (int i : nums) {
            if (i > largest) {
                largest = i;
            } else if (i < smallest) {
                smallest = i;
            }
        }
        largest = largest + 1;
        smallest = smallest - 1;
        for (int i : nums) {
            if (i > largest) {
                largest = i;
            } else if (i < smallest) {
                smallest = i;
            }
        }
        for (int i : nums) {
            if (i > largest) {
                result = largest - i;
            } else if (i < smallest) {
                result = i - smallest;
            }
        }
        return result;
    }

    
    public static int bigSum_Problem_2_7873fc2b_d7f9_43c8_a7cb_1cddf6c426ed(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_6e8779c2_5cba_45ba_b109_2617a2bee021(ArrayList<Integer> nums) {
        int result = 0, largest = nums.stream().mapToInteger(Integer::intValue).max().getAsInteger();
        largest = Math.max(largest, 0L);
        for (int i : nums) {
            result += i;
        }
        result = result - largest + largest;
        return result;
    }

    
    public static int bigSum_Problem_2_953c71f6_9f80_4134_8bd5_9255eb56a661(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_30bdc273_67cc_4b56_9739_e412e950608e(ArrayList<Integer> nums) {
        return nums.stream().mapToInteger(num -> num).max().getAsInteger();
    }

    
    public static int bigSum_Problem_0_2acfc1c2_82a1_4389_bce6_433c8bedca1c(ArrayList<Integer> nums) {
        int min = Integer.MIN_VALUE, max = Integer.MAX_VALUE;
        for (int i : nums) {
            if (i < min) min = i;
            if (i > max) max = i;
        }
        System.out.println("Smallest is " + min);
        System.out.println("Largest is " + max);
        int sum = 0;
        for (int i : nums) {
            sum += i;
        }
        System.out.println("Sum is " + sum);
        return sum;
    }

    
    public static int bigSum_Problem_2_971eb93e_6221_439a_8038_c5a1dc5d5dd0(ArrayList<Integer> nums) {
        int sum = 0;
        for(int num : nums) {
            sum += num;
        }
        return sum;
    }

    
    public static int bigSum_Problem_2_cf26af45_d1a9_42f2_a7e8_987ec359fbee(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE, smallest = Integer.MAX_VALUE;
        for (int n : nums) {
            if (n >= largest) {
                largest = n;
            }
            if (n <= smallest) {
                smallest = n;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_802c3be5_5d9e_4895_8114_e58d8533227d(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element
        int smallest = nums.get(0); // initialize smallest to first element
        for (int i = 1; i < nums.size(); i++) {
            if (nums.get(i) > largest) {
                largest = nums.get(i);
            }
            if (nums.get(i) < smallest) {
                smallest = nums.get(i);
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_4f06707d_79d8_4ab3_8954_1504ac810ec4(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int num : nums) {
            if(num > largest) {
                largest = num;
            }
            if(num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_1_923f4a3c_7ac2_44c9_9ea7_02a4494d2767(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element
        int smallest = nums.get(0); // initialize smallest to first element
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            } else if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_4cb6717f_feb9_4390_beae_797c4fc2cd59(ArrayList<Integer> nums) {
        int sum=0;
        for (Integer i : nums) {
            sum+=i;
        }
        return sum;
    }

    
    public static int bigSum_Problem_0_774ff8f2_335f_421a_b574_517f5f506e7d(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_1_c0fb9a15_d58c_4a45_b82f_6874f7023729(ArrayList<Integer> nums) {
        int largest = Integer.MAX_VALUE;
        int smallest = Integer.MIN_VALUE;
        for (Integer n : nums) {
            largest = Math.max(largest, n);
            smallest = Math.min(smallest, n);
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_551ebb76_b8a5_4392_a980_83a7fca3e29d(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        return min + max;
    }

    
    public static int bigSum_Problem_1_2eb78fe4_92f3_4a69_9f13_d709c25067d2(ArrayList<Integer> nums) {
        Integer sum = nums.stream().reduce((a, b) -> a + b).get();
        return sum;
    }

    
    public static int bigSum_Problem_2_b6b77ee2_488e_4c30_9c98_79023b809aa5(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int num : nums) {
            if(num > largest) {
                largest = num;
            }
            if(num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_1caf684f_3242_4c60_95fa_820f63050dc6(ArrayList<Integer> nums) {
        int bigsum = nums.get(0);
        int smallsum = nums.get(0);
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) > bigsum) {
                bigsum = nums.get(i);
            } else if (nums.get(i) < smallsum) {
                smallsum = nums.get(i);
            }
        }
        return bigsum + smallsum;
    }

    
    public static int bigSum_Problem_0_7b2d531e_37d2_4572_9dcc_f70e26a4fabd(ArrayList<Integer> nums) {
        int big = nums.stream().mapToInteger(Integer::intValue).max().getAsInteger();
        int smal = nums.stream().mapToInteger(Integer::intValue).min().getAsInteger();
        int sum;
        sum = big + smal;
        return sum;
    }

    
    public static int bigSum_Problem_1_b212aecb_ab8e_4606_8423_3cbccf37ec28(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int num : nums) {
            if(num > largest) {
                largest = num;
            }
            if(num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_1_a442415a_ed04_480e_a99b_04e97cf362b7(ArrayList<Integer> nums) {
        int biggest = nums.get(0);
        int smallest = nums.get(0);
        for(int num : nums) {
            if(num > biggest)
                biggest = num;
            else if(num < smallest)
                smallest = num;
        }
        return biggest + smallest;
    }

    
    public static int bigSum_Problem_2_42b9527e_fa56_4d20_a4ad_aef7a7655722(ArrayList<Integer> nums) {
        int largest = nums.get(0), smallest = nums.get(0);
        for (int num: nums) {
            if (largest < num)
                largest = num;
            if (smallest > num)
                smallest = num;
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_ed847d0c_4dda_41c7_87c5_f7f4e9646077(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_0eec1441_4a25_4a31_ad96_31fa24b674bf(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            } else if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_1_03b8335e_3887_47c2_86ab_3e7b83e94908(ArrayList<Integer> nums) {
        int sum = 0;
        int largest = nums.get(0);
        int smallest = nums.get(0);
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
            sum += num;
        }
        return sum;
    }

    
    public static int bigSum_Problem_2_32d1ebbc_db3d_4cd8_ba69_a1df397c4f56(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums)
            if (num > largest)
                largest = num;
            else if (num < smallest)
                smallest = num;
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_4f06707d_79d8_4ab3_8954_1504ac810ec4(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int num : nums) {
            if(num > largest) {
                largest = num;
            }
            if(num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_325b1edf_d68a_4b20_b2f3_89bffc9dcb36(ArrayList<Integer> nums) {
        int biggest = nums.get(0), smallest = nums.get(0);
        for (int num : nums) {
            if (num > biggest) {
                biggest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return biggest + smallest;
    }

    
    public static int bigSum_Problem_0_3b98f90a_cc28_405d_94a7_6a7e11e6695a(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_1_9da24810_09d7_4286_b2b5_ad74514194db(ArrayList<Integer> nums) {
        // Write your code here
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for(int num:nums){
            if(num<min) min = num;
            if(num>max) max = num;
        }
        int sum=max+min;
        System.out.println("Big Sum is: "+sum);
        return sum;
    }

    
    public static int bigSum_Problem_0_b81be4b9_7a7d_414a_9c7d_994f11fc3501(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element of array
        int smallest = nums.get(0); // initialize smallest to first element of array
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_43b0e701_eb83_4a9e_8e81_30bd910cdffb(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element of array
        int smallest = nums.get(0); // initialize smallest to first element of array
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_1_7873fc2b_d7f9_43c8_a7cb_1cddf6c426ed(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_1_3b5d40e9_5e5d_44b6_b3db_52307ae097bf(ArrayList<Integer> nums) {
        int sum = 0;
        for (int num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static int bigSum_Problem_0_9b909b21_5395_4a30_ac23_564b0caf1112(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_5d133b71_e169_4143_a5e7_bf5b9ad736c5(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            } else if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_9f444b84_20cd_4bb3_9fc8_551ea7367c8b(ArrayList<Integer> nums) {
        int largest = nums.get(0);
        int smallest = nums.get(0);
        for (int i = 1; i < nums.size(); i++) {
            if (nums.get(i) > largest) {
                largest = nums.get(i);
            }
            if (nums.get(i) < smallest) {
                smallest = nums.get(i);
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_08cb592e_a94d_42c4_a406_0bb433256e3c(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_1_987ff8fe_38aa_46a4_b0ab_68d7b313b28e(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element of array
        int smallest = nums.get(0); // initialize smallest to first element of array
        for (int num : nums) { // loop through all elements in array
            if (num > largest) { // if current element is greater than largest
                largest = num; // update largest to current element
            } else if (num < smallest) { // if current element is smaller than smallest
                smallest = num; // update smallest to current element
            }
        }
        return largest + smallest; // return sum of largest and smallest
    }

    
    public static int bigSum_Problem_1_7505ef41_1c6c_4f42_a5b6_0c84d015d721(ArrayList<Integer> nums) {
        // Write your code here
        int largest = nums.get(0);
        int smallest = nums.get(0);
        for (Integer num : nums) {
            if (num > largest) {
                largest = num;
            } else if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_508c73ca_c948_4300_88e0_242235e3724f(ArrayList<Integer> nums) {
        int biggest = Collections.max(nums);
        int smallest = Collections.min(nums);
        int sum = biggest + smallest;
        return sum;
    }

    
    public static int bigSum_Problem_2_dfce95a6_4561_4bd4_8404_267407d5e553(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element
        int smallest = nums.get(0); // initialize smallest to first element
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            } else if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_1_3477561c_2a28_4367_8588_6c4644acd129(ArrayList<Integer> nums) {
        int largest = nums.get(0), smallest = nums.get(0);
        for (Integer num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_2eb78fe4_92f3_4a69_9f13_d709c25067d2(ArrayList<Integer> nums) {
        Integer sum = nums.stream().reduce((a, b) -> a + b).get();
        return sum;
    }

    
    public static int bigSum_Problem_2_015c18cc_232d_4688_b572_8619e6c61850(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element
        int smallest = nums.get(0); // initialize smallest to first element
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            } else if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_e844b1c7_e090_4ca3_a2ba_283627d69039(ArrayList<Integer> nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return sum;
    }

    
    public static int bigSum_Problem_0_3c2de888_ea51_45e0_91a3_078854a4737c(ArrayList<Integer> nums) {
        int result = 0;
        for (Integer num : nums) {
            if (num > result) {
                result = num;
            }
        }
        return result;
    }

    
    public static int bigSum_Problem_1_c1e6a94e_a526_4cdb_885c_d62b39380a52(ArrayList<Integer> nums) {
        if (nums.size() <= 1) return 0;

        // sort and return the result
        Collections.sort(nums);
        return nums.get(nums.size() - 1);
    }

    
    public static int bigSum_Problem_0_6ca5a245_3b61_4303_85d0_c4e4a422dd2e(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_1_f37d514f_d105_472f_8205_334d7f86f9ee(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_a2f0fad7_5997_4b64_99e7_cc742d18bb84(ArrayList<Integer> nums) {
        int largest = 0, smallest = 0;
        for (Integer x : nums) {
            if (largest < x) largest = x;
            if (smallest > x) smallest = x;
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_1_9f444b84_20cd_4bb3_9fc8_551ea7367c8b(ArrayList<Integer> nums) {
        int largest = nums.get(0);
        int smallest = nums.get(0);
        for (int i = 1; i < nums.size(); i++) {
            if (nums.get(i) > largest) {
                largest = nums.get(i);
            }
            if (nums.get(i) < smallest) {
                smallest = nums.get(i);
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_cf5f6a0b_375b_4d8e_ad87_5cf5f23dbff4(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element
        int smallest = nums.get(0);
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_ee58e167_406d_456c_b1e1_e3588d2c8611(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_1_3c1302c2_2d5a_49e6_bc32_a692ead6a6c5(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_03b8335e_3887_47c2_86ab_3e7b83e94908(ArrayList<Integer> nums) {
        int sum = 0;
        int largest = nums.get(0);
        int smallest = nums.get(0);
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
            sum += num;
        }
        return sum;
    }

    
    public static int bigSum_Problem_2_50b7ff72_6353_4891_ad10_ce41db01136a(ArrayList<Integer> nums) {
        int biggest = nums.get(0);
        int smallest = nums.get(0);

        for (int i = 1; i < nums.size(); i++) {
            if (biggest < nums.get(i)) {
                biggest = nums.get(i);
            }

            if (smallest > nums.get(i)) {
                smallest = nums.get(i);
            }
        }

        return biggest + smallest;
    }

    
    public static int bigSum_Problem_1_31403cdd_8ad1_41a6_b20e_757cb92426b3(ArrayList<Integer> nums) {
        int largest = nums.stream().max(Integer::compareTo).get();
        int smallest = nums.stream().min(Integer::compareTo).get();
        return largest + smallest;
    }

    
    public static int bigSum_Problem_1_59a8e066_0b9c_4c09_b72e_e3753bda5012(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int i : nums) {
            if (i > largest) largest = i;
            if (i < smallest) smallest = i;
        }
        int sum = 0;
        for (int i : nums) {
            if (largest >= i) sum += i;
            if (smallest <= i) sum += i;
        }
        return sum;
    }

    
    public static int bigSum_Problem_0_8a8e681c_6921_4e9d_bbec_87adf6e21468(ArrayList<Integer> nums) {
        int largest = nums.stream().mapToInteger(num -> num).max().getAsInteger();
        int smallest = nums.stream().mapToInteger(num -> num).min().getAsInteger();
        int sum = largest + smallest;
        return sum;
    }

    
    public static int bigSum_Problem_0_3ee54f9e_8575_4bb7_8e03_7fd0d9b59196(ArrayList<Integer> nums) {
        int largest = nums.stream().mapToInteger(n -> n).max().getAsInteger();
        int smallest = nums.stream().mapToInteger(n -> n).min().getAsInteger();
        return (largest + smallest);
    }

    
    public static int bigSum_Problem_1_6b60123a_a150_4da5_9068_276597cc239a(ArrayList<Integer> nums) {
        int sum = 0;
        for (Integer num : nums) {
            sum += num;
        }
        return sum;
    }

    
    public static int bigSum_Problem_2_3ee54f9e_8575_4bb7_8e03_7fd0d9b59196(ArrayList<Integer> nums) {
        int largest = nums.stream().mapToInteger(n -> n).max().getAsInteger();
        int smallest = nums.stream().mapToInteger(n -> n).min().getAsInteger();
        return (largest + smallest);
    }

    
    public static int bigSum_Problem_2_9da24810_09d7_4286_b2b5_ad74514194db(ArrayList<Integer> nums) {
        // Write your code here
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for(int num:nums){
            if(num<min) min = num;
            if(num>max) max = num;
        }
        int sum=max+min;
        System.out.println("Big Sum is: "+sum);
        return sum;
    }

    
    public static int bigSum_Problem_0_5caf4c13_f13f_4455_996c_20db992c3bc9(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_27e0ce12_4b8a_40ff_a14a_133aa7db2fda(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_8bb62bec_fe7e_479e_a9b2_53ede1ab1027(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_95aa5744_849d_4d65_8604_b53f70872eda(ArrayList<Integer> nums) {
        int largest = nums.get(0); //set largest as first value
        int smallest = nums.get(0);
        for (Integer n : nums) {
            if (n > largest) {
                largest = n;
            }
            if (n < smallest) {
                smallest = n;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_1079d57d_23b1_4f30_a68d_27775ac9868b(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i : nums) {
            if (i < min) min = i;
            if (i > max) max = i;
        }
        return max+min;
    }

    
    public static int bigSum_Problem_0_c01d404f_b492_4231_8cee_89463d63a5b4(ArrayList<Integer> nums) {
        int largest = nums.stream().mapToInteger(Integer::intValue).max().getAsInteger();
        int smallest = nums.stream().mapToInteger(Integer::intValue).min().getAsInteger();
        return largest + smallest;
    }

    
    public static int bigSum_Problem_1_8f438ba9_27a8_4543_82c8_822400675b0b(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_852a3b51_ca97_4968_884a_8d9c633dbef2(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (largest < num) largest = num;
            if (smallest > num) smallest = num;
        }
        return (largest + smallest);
    }

    
    public static int bigSum_Problem_1_a470b9ea_4c8c_4458_a678_880fc084a14f(ArrayList<Integer> nums) {
        int largest = nums.stream().reduce(Math::max).get();
        int smallest = nums.stream().reduce(Math::min).get();
        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_3b5d40e9_5e5d_44b6_b3db_52307ae097bf(ArrayList<Integer> nums) {
        int sum = 0;
        for (int num : nums) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum;
    }

    
    public static int bigSum_Problem_0_591a582b_d060_4618_8374_ba4c8895c0e0(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_8bc803df_0b9e_4b3c_ab5d_ef432b1c0375(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first number
        int smallest = nums.get(0); // initialize smallest to first number
        for (Integer num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_3da632af_a84e_4bc3_a711_ae634f616f1b(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_1_65991464_83cd_45b3_ae5b_e4ee7e9f02ce(ArrayList<Integer> nums) {
        int sum=0;
        for(int i=0;i<nums.size();i++){
            sum = sum + nums.get(i);
        }
        return sum;
    }

    
    public static int bigSum_Problem_1_eb8b9ab2_9b73_4a35_a582_eb236ed80dc1(ArrayList<Integer> nums) {
        int bigSum_Problem_1_eb8b9ab2_9b73_4a35_a582_eb236ed80dc1 = 0;
        // TODO Auto-generated method stub
        if(nums.size()<1)
            return 0;
        for(int i=0; i<nums.size(); i++)
        {
            bigSum_Problem_1_eb8b9ab2_9b73_4a35_a582_eb236ed80dc1 = bigSum_Problem_1_eb8b9ab2_9b73_4a35_a582_eb236ed80dc1 + nums.get(i);
        }
        return bigSum_Problem_1_eb8b9ab2_9b73_4a35_a582_eb236ed80dc1;
    }

    
    public static int bigSum_Problem_1_e208f0db_4885_4fee_970b_beed0f63f772(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_dfc77c07_ae9f_485a_ada3_d33d30e8a668(ArrayList<Integer> nums) {
        int largest = Collections.max(nums);
        int smallest = Collections.min(nums);
        System.out.println("Largest: " + largest);
        System.out.println("Smallest: " + smallest);
        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_8dba49d4_2313_4760_ab99_371d86021c30(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element
        int smallest = nums.get(0); // initialize smallest to first element
        for (Integer num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_ee58e167_406d_456c_b1e1_e3588d2c8611(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_4a96765b_b20f_439b_92b5_7e00eac2779e(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int num : nums) {
            if(num > largest) {
                largest = num;
            }
            if(num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_1_e52977ab_5f35_4573_8179_bbc80fac7142(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            } else if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_9331b3e7_dea5_4622_82a8_ca37d01f4676(ArrayList<Integer> nums) {
        if (nums == null || nums.size() == 0) return 0L;
        int max = nums.stream().max(Integer::compare).get();
        int min = nums.stream().min(Integer::compare).get();
        return max + min;
    }

    
    public static int bigSum_Problem_0_85795c08_7143_49e3_b09e_b1a80cfc51fd(ArrayList<Integer> nums) {
        int sumLargest = nums.stream().mapToInteger(num -> num).max().getAsInteger();
        int sumSmallest = nums.stream().mapToInteger(num -> num).min().getAsInteger();
        return sumLargest + sumSmallest;
    }

    
    public static int bigSum_Problem_1_63a22bbd_197f_4e26_a71c_f0d044ddc9ca(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element of array
        int smallest = nums.get(0);
        for (int i = 1; i < nums.size(); i++) {
            if (nums.get(i) > largest) {
                largest = nums.get(i);
            }
            if (nums.get(i) < smallest) {
                smallest = nums.get(i);
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_1_dfce95a6_4561_4bd4_8404_267407d5e553(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element
        int smallest = nums.get(0); // initialize smallest to first element
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            } else if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_68ea001a_02c0_4574_bd9f_5b8bd19152fc(ArrayList<Integer> nums) {
        int largestSoFar = Integer.MIN_VALUE;
        int smallestSoFar = Integer.MAX_VALUE;

        for(Integer num : nums) {
            largestSoFar = Math.max(largestSoFar, num);
            smallestSoFar = Math.min(smallestSoFar, num);
        }

        return largestSoFar + smallestSoFar;
    }

    
    public static int bigSum_Problem_0_0c8c1f7e_dba0_416a_bfa3_bb6220cd0e58(ArrayList<Integer> nums) {
        // Initialize min and max values to positive infinity
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int sum = 0;
        // Iterate through the list and compute the sum and max/min values
        for (Integer num : nums) {
            sum = sum + num;
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        // Return the sum and the max/min values
        return sum;
    }

    
    public static int bigSum_Problem_1_1ab86fe2_8bc6_46e6_8d7d_0309c0e4860a(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element
        int smallest = nums.get(0); // initialize smallest to first element
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_47dd5cdb_078a_4a0b_b851_c3c854ed7024(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_a819474f_a712_4c04_836f_d4063171a9fc(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_9f20a5df_e5ed_4ba7_92e6_a2f247797028(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_9ba275dd_7fa0_4d5d_a284_9f7f8ff57c75(ArrayList<Integer> nums) {
        int sum = 0;
        for (Integer num : nums) {
            if (num > sum) {
                sum = num;
            }
        }
        return sum;
    }

    
    public static int bigSum_Problem_2_8bb62bec_fe7e_479e_a9b2_53ede1ab1027(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_00e890e5_0c5f_4edb_af18_ffef237989e1(ArrayList<Integer> nums) {
        int largestNum = nums.get(0); // initialize with first element of list
        int smallestNum = nums.get(0); // initialize with first element of list
        for (Integer num : nums) {
            if (num > largestNum) {
                largestNum = num;
            } else if (num < smallestNum) {
                smallestNum = num;
            }
        }
        return largestNum + smallestNum;
    }

    
    public static int bigSum_Problem_1_33fe8a0c_532d_4ed2_a87e_ffe0e0b9691f(ArrayList<Integer> nums) {
        // Write your logic here
        int sum = 0;
        for(int num : nums) {
            sum = sum + num;
        }
        return sum;
    }

    
    public static int bigSum_Problem_2_6ca5a245_3b61_4303_85d0_c4e4a422dd2e(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_1_f9da6d5f_a7f6_4630_85e8_6142181abeb3(ArrayList<Integer> nums) {
        // write your solution here
        int biggest = nums.get(0),smallest = nums.get(0);
        for(int i = 1; i<nums.size();i++){
            if(biggest>nums.get(i)){
                biggest = nums.get(i);
            }
            if(smallest<nums.get(i)){
                smallest = nums.get(i);
            }
        }
        int sum = biggest+smallest;
        return sum;
    }

    
    public static int bigSum_Problem_1_3dc76a91_3e65_43d1_bd19_cac7e9a4e95c(ArrayList<Integer> nums) {
        int max = nums.get(0);
        for (int i = 1; i < nums.size(); i++) {
            if (nums.get(i) > max) {
                max = nums.get(i);
            }
        }
        int min = 0;
        for (int i = 1; i < nums.size(); i++) {
            if (nums.get(i) < min) {
                min = nums.get(i);
            }
        }
        return max+min;
    }

    
    public static int bigSum_Problem_0_825b8769_b101_44ca_a50e_1a6d13ff42e3(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_1_ad2d827a_2dfa_46e7_8797_731445d24893(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element
        int smallest = nums.get(0); // initialize smallest to first element
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_1b3970a9_359c_4a40_b34e_5d92bf0ed8b0(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < nums.size(); i++) {
            largest += nums.get(i);
            smallest += nums.get(i);
        }
        return largest - smallest;
    }

    
    public static int bigSum_Problem_0_8725898e_f110_4eb8_87d6_7beafd509438(ArrayList<Integer> nums) {
        // write your code here
        int max = nums.get(0);
        int min = nums.get(0);
        for (int i = 1; i < nums.size(); i++) {
            if (nums.get(i) > max) {
                max = nums.get(i);
            }
            if (nums.get(i) < min) {
                min = nums.get(i);
            }
        }
        return (max + min);
    }

    
    public static int bigSum_Problem_1_621fe5ae_a915_48cc_934f_dfa9868bf7db(ArrayList<Integer> nums) {
        int largest = nums.get(0), smallest = nums.get(0);
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) > largest) {
                largest = nums.get(i);
            }
            if (nums.get(i) < smallest) {
                smallest = nums.get(i);
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_5abcce87_d3e3_465a_8992_e31ae7b5d04d(ArrayList<Integer> nums) {
        int sum = 0;
        for(int i = 0; i < nums.size(); i++){
            sum += nums.get(i);
        }
        return sum;
    }

    
    public static int bigSum_Problem_1_ee58e167_406d_456c_b1e1_e3588d2c8611(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_1_254da1bb_8200_47c0_9197_39c12107207e(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int num : nums) {
            if(num > largest) {
                largest = num;
            }
            if(num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_1_a61e6c5c_bc31_4782_8e2c_faddc7a17014(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element
        int smallest = nums.get(0); // initialize smallest to first element
        for (int num : nums) { // loop through all elements
            if (num > largest) { // if current element is greater than largest
                largest = num; // update largest to current element
            } else if (num < smallest) { // if current element is smaller than smallest
                smallest = num; // update smallest to current element
            }
        }
        return largest + smallest; // return sum of largest and smallest
    }

    
    public static int bigSum_Problem_2_d727d436_8ea7_4809_8a9e_2726c0b8b52a(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        int sum = 0;
        for (int n : nums) {
            if (n > largest) {
                largest = n;
            } else if (n < smallest) {
                smallest = n;
            }
            sum += n;
        }
        return sum;
    }

    
    public static int bigSum_Problem_1_a9fbb99f_e956_47e2_a9ee_d5b8f583714a(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int num : nums) {
            if(num > largest) {
                largest = num;
            }
            if(num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_a159a8de_7f3d_4486_8fd6_a552100403cc(ArrayList<Integer> nums) {
        return nums.stream().mapToInteger(n -> n).sum();
    }

    
    public static int bigSum_Problem_1_1079d57d_23b1_4f30_a68d_27775ac9868b(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i : nums) {
            if (i < min) min = i;
            if (i > max) max = i;
        }
        return max+min;
    }

    
    public static int bigSum_Problem_1_fcba2e98_c37f_4f6c_b14a_3faf24ff4260(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element
        int smallest = nums.get(0); // initialize smallest to first element
        for (int num : nums) { // for each element in the array
            if (num > largest) { // if the current element is greater than the largest
                largest = num; // then update the largest
            } else if (num < smallest) { // if the current element is smaller than the smallest
                smallest = num; // then update the smallest
            }
        }
        return largest + smallest; // return the sum of the largest and smallest elements
    }

    
    public static int bigSum_Problem_0_751f801e_0ee4_4d68_a87e_1706396b183e(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_1_5b3bdb22_be94_4b51_ba78_12f55fe46821(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        return min + max;
    }

    
    public static int bigSum_Problem_0_a34c664c_1373_48b8_9760_f02951d11196(ArrayList<Integer> nums) {
        int largest = nums.get(0),
                smallest = nums.get(0);
        for (int num: nums) {
            if (largest < num)
                largest = num;
            if (smallest > num)
                smallest = num;
        }
        return smallest + largest;
    }

    
    public static int bigSum_Problem_1_802c3be5_5d9e_4895_8114_e58d8533227d(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element
        int smallest = nums.get(0); // initialize smallest to first element
        for (int i = 1; i < nums.size(); i++) {
            if (nums.get(i) > largest) {
                largest = nums.get(i);
            }
            if (nums.get(i) < smallest) {
                smallest = nums.get(i);
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_1_86d7fc65_d7d8_4b25_a113_1da567d59c6e(ArrayList<Integer> nums) {
        int sum = 0;
        for(Integer num : nums) {
            sum += num;
        }
        return sum;
    }

    
    public static int bigSum_Problem_0_9f21ba53_5d02_4fba_8373_4aecabcb033e(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element of array
        int smallest = nums.get(0); // initialize smallest to first element of array
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_7f07df1a_804c_4325_97be_247b16f9e2d2(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_054382ce_c91a_4f11_8955_05a31e14b0fa(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element of list
        int smallest = nums.get(0);
        for (int i = 1; i < nums.size(); i++) {
            if (nums.get(i) > largest) {
                largest = nums.get(i);
            }
            if (nums.get(i) < smallest) {
                smallest = nums.get(i);
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_fe5fae3d_c424_4cd0_ac60_4ead7a54eaab(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_1_8725898e_f110_4eb8_87d6_7beafd509438(ArrayList<Integer> nums) {
        // write your code here
        int max = nums.get(0);
        int min = nums.get(0);
        for (int i = 1; i < nums.size(); i++) {
            if (nums.get(i) > max) {
                max = nums.get(i);
            }
            if (nums.get(i) < min) {
                min = nums.get(i);
            }
        }
        return (max + min);
    }

    
    public static int bigSum_Problem_2_fa7e9b56_22c7_441e_8a89_ec74bf23e64a(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int num : nums) {
            if(num > largest) {
                largest = num;
            }
            if(num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_d01c0220_9805_496c_8186_4cecabb4578b(ArrayList<Integer> nums) {
        if (nums == null || nums.size() == 0) return 0;
        int largest = Collections.max(nums);
        int smallest = Collections.min(nums);
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_070f6148_510d_4dad_a769_919beefc8059(ArrayList<Integer> nums) {
        int sum = 0;
        for(int n: nums){
            sum = sum + n;
        }
        return sum;
    }

    
    public static int bigSum_Problem_2_a9ccf2fa_782c_45b5_9163_cc95c347755b(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_367743d2_b5bb_4004_9261_bc2ac2030bd2(ArrayList<Integer> nums) {
        Integer result = Integer.MIN_VALUE;
        for (Integer n : nums) {
            result += n;
        }
        return result;
    }

    
    public static int bigSum_Problem_1_fa12a535_7e8a_4c23_8ded_f6d53b97404d(ArrayList<Integer> nums) {
        int largest = nums.stream().max(Integer::compareTo).get();
        int smallest = nums.stream().min(Integer::compareTo).get();
        return largest + smallest;
    }

    
    public static int bigSum_Problem_1_6d994f76_daa7_4286_84da_91e3f797d744(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_1_adc0ce5c_0e68_447a_97cd_9db2b9e2e9dc(ArrayList<Integer> nums) {
        int largest = nums.get(0); //first number
        int smallest = nums.get(0);
        for(int i =1; i<nums.size(); i++){
            if(nums.get(i) > largest){
                largest = nums.get(i);
            }
            if(nums.get(i) < smallest){
                smallest = nums.get(i);
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_663c38c3_66b2_49f1_9190_028e7904376d(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element
        int smallest = nums.get(0); // initialize smallest to first element
        for (Integer num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_1_441ba183_52f0_4ad7_8e2d_6c1970d72883(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element
        int smallest = nums.get(0); // initialize smallest to first element
        for(int i = 1; i < nums.size(); i++) {
            if(nums.get(i) > largest) {
                largest = nums.get(i);
            }
            if(nums.get(i) < smallest) {
                smallest = nums.get(i);
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_0_101bd9af_cd7f_4ddc_a7a4_9fcdffa9a1b4(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element of array
        int smallest = nums.get(0); // initialize smallest to first element of array
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            } else if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_1_106f4603_7bdf_4cf2_9bb8_cae4e231f256(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_550f35fa_6eec_46ea_92f2_79912f07f896(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_2acfc1c2_82a1_4389_bce6_433c8bedca1c(ArrayList<Integer> nums) {
        int min = Integer.MIN_VALUE, max = Integer.MAX_VALUE;
        for (int i : nums) {
            if (i < min) min = i;
            if (i > max) max = i;
        }
        System.out.println("Smallest is " + min);
        System.out.println("Largest is " + max);
        int sum = 0;
        for (int i : nums) {
            sum += i;
        }
        System.out.println("Sum is " + sum);
        return sum;
    }

    
    public static int bigSum_Problem_1_d621ee3b_5a3f_4ae3_8559_4e7ac120ab7c(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first number
        int smallest = nums.get(0); // initialize smallest to first number
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_65c609e6_5bc9_4746_948a_d8600fd6bded(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (num > largest) {
                largest = num;
            } else if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

    
    public static int bigSum_Problem_2_40e5fb77_0248_4067_adb5_10941c5e205e(ArrayList<Integer> nums) {
        int sum=0;
        for(int i=0;i<nums.size();i++) {
            sum+=nums.get(i);
        }
        return sum;
    }

    
    public static int bigSum_Problem_2_bb600afa_8b4f_4ae2_849b_ec137ae6cf1f(ArrayList<Integer> nums) {
        int sum = 0;
        for(int i = 0; i < nums.size(); i++) {
            sum += nums.get(i);
        }
        return sum;
    }

    
    public static int bigSum_Problem_0_fdd26027_0a07_44c1_a4b9_0ff4032a4bee(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element
        int smallest = nums.get(0); // initialize smallest to first element
        for (int num : nums) { // for each element in the array
            if (num > largest) { // if the current element is greater than the largest
                largest = num; // update the largest to the current element
            }
            if (num < smallest) { // if the current element is smaller than the smallest
                smallest = num; // update the smallest to the current element
            }
        }
        return largest + smallest; // return the sum of the largest and smallest elements
    }

    
    public static int bigSum_Problem_0_f61d9cf9_308a_4d46_8857_8ca7e0541ea9(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element
        int smallest = nums.get(0); // initialize smallest to first element
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest + smallest;
    }

}
