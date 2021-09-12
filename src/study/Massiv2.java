package study;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Massiv2 {
    public void testArray2() {
        int array2[] = new int[]{7, 20, 81, -28, -5};
        boolean isSorted = false;
        int num;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < array2.length - 1; i++) {
                if (array2[i] > array2[i + 1]) {
                    isSorted = false;
                    num = array2[i];
                    array2[i] = array2[i + 1];
                    array2[i + 1] = num;
                }
            }
        }
        System.out.println(Arrays.toString(array2));
    }
}


