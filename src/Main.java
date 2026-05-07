void main() {
    //Задача 1
    System.out.println("--|| Задача 1 ||--");

    int[] nums = new int[3];
    nums[0] = 1;
    nums[1] = 2;
    nums[2] = 3;

    float[] nums2 = {1.57f, 7.654f, 9.986f};

    double[] nums3 = {2.345d, 7.12345678d, 4.34d, 8.9234d};

    System.out.println();


    //Задача 2
    System.out.println("--|| Задача 2 ||--");

    System.out.println("Массив 1: " + nums[0] + ", " + nums[1] + ", " + nums[2]);
    System.out.println("Массив 2: " + nums2[0] + ", " + nums2[1] + ", " + nums2[2]);
    System.out.println("Массив 3: " + nums3[0] + ", " + nums3[1] + ", " + nums3[2] + ", " + nums3[3]);

    System.out.println();


    //Задача 3
    System.out.println("--|| Задача 3 ||--");

    System.out.println("Массив 1: " + nums[2] + ", " + nums[1] + ", " + nums[0]);
    System.out.println("Массив 2: " + nums2[2] + ", " + nums2[1] + ", " + nums2[0]);
    System.out.println("Массив 3: " + nums3[3] + ", " + nums3[2] + ", " + nums3[1] + ", " + nums3[0]);

    System.out.println();


    //Задача 4
    System.out.println("--|| Задача 4 ||--");

    for (int i = 0; i < nums.length; i++) {
        if (nums[i] % 2 != 0) {
            nums[i] += 1;
        }
    }

    System.out.println(Arrays.toString(nums));
}
