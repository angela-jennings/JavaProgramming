package day41_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LambdaExpression {
    public static void main(String[] args) {
        List<Integer>nums = new ArrayList<>(Arrays.asList(2, 4, 6));
        nums.forEach(n ->
                System.out.println(n*2));

    }
}
