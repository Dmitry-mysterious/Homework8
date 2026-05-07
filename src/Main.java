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

    System.out.print("Массив 1: ");
    for (int i = 0; i < nums.length; i++) {
        System.out.print(nums[i]);
        if (i < nums.length - 1) System.out.print(", ");
    }

    System.out.println();

    System.out.print("Массив 2: ");
    for (int i = 0; i < nums2.length; i++) {
        System.out.print(nums2[i]);
        if (i < nums2.length - 1) System.out.print(", ");
    }

    System.out.println();

    System.out.print("Массив 3: ");
    for (int i = 0; i < nums3.length; i++) {
        System.out.print(nums3[i]);
        if (i < nums3.length - 1) System.out.print(", ");
    }

    System.out.println();


    //Задача 3
    System.out.println("--|| Задача 3 ||--");

    System.out.print("Массив 1: ");
    for (int i = nums.length - 1; i >= 0; i--) {
        System.out.print(nums[i]);
        if (i > 0) System.out.print(", ");
    }

    System.out.println();

    System.out.print("Массив 2: ");
    for (int i = nums2.length - 1; i >= 0; i--) {
        System.out.print(nums2[i]);
        if (i > 0) System.out.print(", ");
    }

    System.out.println();

    System.out.print("Массив 3: ");
    for (int i = nums3.length - 1; i >= 0; i--) {
        System.out.print(nums3[i]);
        if (i > 0) System.out.print(", ");
    }

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
