package ClassWork21.arry_tdd;

import java.util.Arrays;
import java.util.Objects;

public class ArrayTdd {

  int[] array;

    public ArrayTdd(int[] array) {
        this.array = array;
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ArrayTdd arrayTdd)) return false;
        return Objects.deepEquals(array, arrayTdd.array);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(array);
    }

    @Override
    public String toString() {
        return "ArrayTdd{" +
                "array=" + Arrays.toString(array) +
                '}';
    }



    //count positive numbers in array
    public int countPositive(int[] array) { // rot metoda,argument v nem
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
               count++;
            }

        }

    return count;

    }
}
