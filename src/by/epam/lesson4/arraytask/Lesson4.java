package by.epam.lesson4.arraytask;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lesson4 {
    /**
     * Выполнены следующие задачи: task1-task20, sorting;
     * @author Tatsiana Tkachova
     */
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();
        task11();
        task12();
        task13();
        task14();
        task15();
        task16();
        task17();
        task18();
        task19();
        task20();
        int[] array = {1, 45, 32, 47, 98, 0, 6, 33, 21, 14};
        insertionSort(array);
        System.out.println("Sorted array is: ");
        System.out.println(Arrays.toString(array));


    }

    public static void task1() {
        int[] array = new int[9];
        int k = 9;
        int sum = 0;
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
            if (array[i] % k == 0) {
                sum = sum + array[i];
            }
        }
        System.out.println("Sum of array elements divisible by 9 is  " + sum + ".");
    }

    public static void task2() {
        int[] array = {4, 0, 9, 4, 0, 45, 1, 0, 0, 0};
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                count++;
            }
        }
        int[] zeroPositionsArray = new int[count];
        for (int i = 0, j = 0; i < array.length; i++) {
            if (array[i] == 0) {
                zeroPositionsArray[j++] = i;
            }
        }
        for (int i = 0; i < zeroPositionsArray.length; i++) {
            System.out.printf("{%d}", zeroPositionsArray[i]);
        }
    }

    public static void task3() {
        int[] array = {2, 0, 5, 8, 0, -5};
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                System.out.println("Positive number occurs first.");
                break;
            } else if (array[i] < 0) {
                System.out.println("Negative number occurs first");
                break;
            } else if (array[i] == 0) {
                continue;
            }
        }
    }

    public static void task4() {
        int[] array = {2, 4, 7, 8, 10, 12, 90, 900};
        int flag = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[i - 1]) {
                flag++;
                continue;
            } else if (array[i] < array[i - 1]) {
                System.out.println("The sequence is not increasing");
                break;
            }
        }
        if (flag == array.length - 1) {
            System.out.println("The sequence is increasing");
        }
    }

    public static void task5() {
        int[] array = new int[10];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                count++;
            }
        }
        int[] evenPositionsArray = new int[count];
        for (int i = 0, j = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                evenPositionsArray[j++] = array[i];
            }
        }
        if (evenPositionsArray.length == 0) {
            System.out.println("There are no even numbers in this sequence of numbers!");
        } else {
            for (int i = 0; i < evenPositionsArray.length; i++) {
                System.out.printf("{%d}", evenPositionsArray[i]);
            }
        }
    }

    public static void task6() {
        int[] array = new int[10];
        int max = array[0];
        int min = array[0];
        int axisLength;
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(200) - 100;
            System.out.printf("[%d]", array[i]);
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (min > array[i]) {
                min = array[i];
            }
        }
        axisLength = max - min;
        System.out.println();
        System.out.println("axis length is " + axisLength + " .");
    }

    public static void task7() {
        int[] array = new int[10];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        int z = 50;
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > z) {
                count++;
                array[i] = z;
            }
        }
        if (count == 0) {
            System.out.println("All members of the sequence are less than " + z + ".");
            for (int i = 0; i < array.length; i++) {
                System.out.printf("[%d]", array[i]);
            }
        } else if (count > 0) {
            System.out.println(count + " sequence's members have been replaced by a number " + z + ".");
            for (int i = 0; i < array.length; i++) {
                System.out.printf("[%d]", array[i]);
            }
        }
    }

    public static void task8() {
        int n = 15;
        int countPlus = 0;
        int countMinus = 0;
        int countZero = 0;
        int[] array = new int[n];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(201) - 100;
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                countMinus++;
            } else if (array[i] == 0) {
                countZero++;
            } else if (array[i] > 0) {
                countPlus++;
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.printf("[%d]", array[i]);
        }
        System.out.println(" there ara :");
        System.out.print(countMinus + " negative numbers in the array;");
        System.out.print(countPlus + " positive numbers in the array;");
        System.out.print(countZero + " zero.");
    }

    public static void task9() {
        int[] array = new int[10];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1000);
            System.out.printf("[%d]", array[i]);
        }
        System.out.println();
        int max = array[0];
        int min = array[0];
        int indexMax = 0;
        int indexMin = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                indexMax = i;
            }
            if (array[i] < min) {
                min = array[i];
                indexMin = i;
            }
        }
        array[indexMax] = min;
        array[indexMin] = max;
        for (int i = 0; i < array.length; i++) {
            if (i == indexMin || i == indexMax) {
                System.out.printf("{%d}", array[i]);
            } else {
                System.out.printf("[%d]", array[i]);
            }
        }
    }

    public static void task10() {
        int[] array = new int[20];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(20) - 10;
            System.out.printf("[%d]", array[i]);
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            if (array[i] > i) {
                System.out.printf("{%d}", array[i]);
            }
        }
    }

    public static void task11() {
        int[] array = new int[20];
        int m = 9;
        int l = 7;
        int count = 0;
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10000);
            System.out.printf("[%d]", array[i]);
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            if (l > 0 && l < (m - 1)) {
                if (array[i] % m == l) {
                    count++;
                }
            } else {
                System.out.println("the conditions do not satisfy the conditions specified in the task №11");
            }
        }
        int[] tempArray = new int[count];
        for (int i = 0, j = 0; i < array.length; i++) {
            if (array[i] % m == l) {
                tempArray[j++] = array[i];
            }
        }
        if (tempArray.length != 0) {
            System.out.println("The following numbers when divided by " + m + " have a remainder " + l + ".");
            for (int i = 0; i < tempArray.length; i++) {
                System.out.printf("{%d}", tempArray[i]);
            }
        } else if (tempArray.length == 0) {
            System.out.println("There are not numbers when divided by " + m + " and have a remainder " + l + ".");
        }
    }

    public static void task12() {
        double[] array = new double[9];
        Random random = new Random();
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextDouble(10) - 10;
            System.out.printf("[%4.2f]", array[i]);
        }
        for (int i = 0; i < array.length; i++) {
            if (isPrime(i)) {
                sum = sum + array[i];
            }
        }
        System.out.println();
        System.out.println(sum);
    }

    public static boolean isPrime (int number) {
        if (number == 2)
            return true;
        if (number < 2 || number % 2 == 0)
            return false;
        for (int i = 3; i * i <= number; i += 2)
            if (number % i == 0)
                return false;
        return true;
    }

    public static void task13() {
        int[] array = new int[20];
        int m = 12;
        int l = 300;
        int n = 700;
        int count = 0;
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1000);
            System.out.printf("[%d]", array[i]);
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            if (array[i] % m == 0 && array[i] >= l && array[i] <= n) {
                count++;
            }
        }
        System.out.println("In the specified sequence, the number of numbers that are divisible by of the number " + m
                + " and are in the interval from " + l + " to " + n + " are: " + count + " .");
    }

    public static void task14() {
        int[] array = new int[21];
        int maxEven = array[0];
        int minOdd = 0;
        int diff;
        Random random = new Random();
        for (int i = 1; i < array.length; i++) {
            array[i] = random.nextInt(2000) - 1000;
            System.out.printf("[%d]", array[i]);
            if (i % 2 == 0 && array[i] > maxEven) {
                maxEven = array[i];
            }
            if (i % 2 != 0 && minOdd > array[i]) {
                minOdd = array[i];
            }
        }

        diff = maxEven - minOdd;
        System.out.println();
        System.out.println(diff);
        System.out.println(minOdd);
        System.out.println(maxEven);
    }

    public static void task15() {
        int[] array = new int[20];
        int count = 0;
        int c = 100;
        int d = 300;
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(500);
            System.out.printf("[%d]", array[i]);
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= c && array[i] <= d) {
                count++;
            }
        }
        int[] numInSegmentArray = new int[count];
        for (int i = 0, j = 0; i < array.length; i++) {
            if (array[i] >= c && array[i] <= d) {
                numInSegmentArray[j++] = i;
            }
        }
        System.out.println("Sequence elements that belong to a segment [" + c + ", " + d + "]: ");
        for (int i = 0; i < numInSegmentArray.length; i++) {
            System.out.printf("{%d}", numInSegmentArray[i]);
        }
    }

    public static void task16() {
        int n = 20;
        double[] array = new double[n];
        double[] modifedArray = new double[(array.length) / 2];
        double max = modifedArray[0];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextDouble(2000) - 1000;
            System.out.printf("[%.2f]", array[i]);
        }
        for (int i = 0, j = array.length - 1; i < (array.length) / 2; i++) {
            modifedArray[i] = array[i] + array[j];
            j--;
        }
        System.out.println();
        for (int i = 0; i < modifedArray.length; i++) {
            System.out.printf("[%.2f]", modifedArray[i]);
            ;
            if (max < modifedArray[i]) {
                max = modifedArray[i];
            }
        }
        ;
        System.out.println();
        System.out.printf("%.2f", max);
    }

    public static void task17() {
        int n = 20;
        int[] array = new int[n];
        int min = array[0];
        int count = 0;
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
            System.out.printf("[%d]", array[i]);
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] == min) {
                count++;
            }
        }
        int[] modifiedArray = new int[n - count];
        for (int i = 0, j = 0; i < array.length; i++) {
            if (array[i] != min) {
                modifiedArray[j] = array[i];
                j++;
            }
        }
        System.out.println();
        for (int i = 0; i < modifiedArray.length; i++) {
            System.out.printf("[%d]", modifiedArray[i]);
        }
    }

    public static void task18() {
        int[] array = new int[10];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter the first two digits of the code (from 1 to 6)");
        for (int i = 0; i < 2; i++) {
            System.out.print("array[" + i + "]=");
            while (!scanner.hasNextInt()) {
                scanner.nextLine();
                System.out.print("array[" + i + "]=");
            }
            array[i] = scanner.nextInt();
        }
        if (array[0] <= 6 && array[0] >= 1
                && array[1] <= 6 && array[1] >= 1
                && array[0] + array[1] <= 10 && array[0] + array[1] >= 4) {
            for (int i = 2; i < array.length; i++) {
                array[i] = 10 - array[i - 1] - array[i - 2];
            }
            System.out.println("The code is: ");
            for (int i = 0; i < array.length; i++) {
                System.out.printf("[%d]", array[i]);
            }
        } else {
            System.out.println("sorry, you entered an invalid value, please try again");
            task18();
        }

    }

    public static void task19() {
        int[] array = new int[15];
        int[] frequencyArray = new int[array.length];
        int count = 0;
        int frequency = frequencyArray[0];
        int num = array[0];

        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
            System.out.printf("[%d]", array[i]);
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) {
                    frequencyArray[count]++;
                }
            }
            count++;
        }
        for (int i = 0; i < frequencyArray.length; i++) {
            if (frequencyArray[i] > frequency) {
                frequency = frequencyArray[i];
                num = array[i];
            }
            if (frequency == frequencyArray[i] && array[i] < num) {
                num = array[i];
            }
        }
        System.out.println();
        System.out.print("Most frequently occurring smallest number is " + num);
    }

    public static void task20() {
        int[] array = new int[20];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100) - 100;
            System.out.printf("[%d]", array[i]);
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                array[i] = 0;
            }
            System.out.printf("[%d]", array[i]);
        }
    }

    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int current = array[i];
            int j = i;
            while (j > 0 && array[j - 1] > current) {
                array[j] = array[j - 1];
                j--;
            }
            array[j] = current;
        }
    }


}


