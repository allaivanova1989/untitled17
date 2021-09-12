package study;

public class Massiv {
    public void TestArray() {
        int[] array = new int[]{5, 23, 102, -12, -38, 17};
        int min;
        int max;
        min = max = array[0];

        for (int i = 1; i < 6; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println(" Maximum number is :" + max);
        System.out.println(" Minimum number is :" + min);
    }
}




