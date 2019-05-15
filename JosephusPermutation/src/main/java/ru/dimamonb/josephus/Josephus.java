package ru.dimamonb.josephus;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Josephus {

    public static int joseph(int size, int k) {
        return size > 1 ? (joseph(size - 1, k) + k - 1) % size + 1 : 1;
    }

    public static int joseph1(int size, int k) {
        return size > 1 ? (joseph(size - 1, k) + k - 1) % size + 1 : 1;
    }

    public static <T> List<T> josephusPermutation(final List<T> items, final int k) {
        List<T> result = new ArrayList<>();
        int idx = 0;
        while (!items.isEmpty()) {
            idx = (idx + k - 1)%items.size();
            result.add(items.get(idx));
            items.remove(idx);
        }
        return result;
    }

    public static void main(String[] args) {
        josephusPermutation(new ArrayList(Arrays.asList()), 3);
    }
}
