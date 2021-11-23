package org.project;

public class ReturnArray {
    public static void main(String[] args) {
        char[] array1 = new char[5];
        int d;
        int[] array = getArray();
        convert(array, array1);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < 5; i++) {
            System.out.print(array1[i] + " ");
        }
    }

    public static void convert(int[] array, char[] array1) {
        for (int a = 0; a < 5; a++) {
            array1[a] = (char) array[a];
        }
    }

    public static int[] getArray() {
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 255);
        }
        System.out.println();
        return array;
    }
}





