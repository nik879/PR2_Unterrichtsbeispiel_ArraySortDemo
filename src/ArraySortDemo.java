import java.util.ArrayList;
import java.util.Arrays;

public class ArraySortDemo {
    public static void main(String[] args) {
        int[] nums = {7, -10, 23, 66, -5, 100};
        System.out.println(Arrays.toString(nums));

        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));

        String[] names = {"John", "Eva", "Bruce", "Eliah", "Keanu"};
        System.out.println(Arrays.toString(names));

        Arrays.sort(names);
        System.out.println(Arrays.toString(names));

        House[] Houses = {
                new House(5, "white", 90, 1980),
                new House(7, "blue", 160, 1980),
                new House(9, "yellow", 250, 1980),
                new House(4, "red", 80, 1980)
        };

        System.out.println(Arrays.toString(Houses));
        Arrays.sort(Houses);
        System.out.println(Arrays.toString(Houses));


    }
}
