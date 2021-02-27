import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ListSortDemo {
    public static void main(String[] args) {
        ArrayList<House> houselist = new ArrayList<>();
        houselist.add(new House(5, "white", 90, 1980));

        houselist.add(new House(7, "blue", 160, 1980));

        houselist.add(new House(9, "red", 250, 1981));

        houselist.add(new House(4, "red", 80, 1980));

        System.out.println("List sorting of houses");
        System.out.println(houselist);
        Collections.sort(houselist);
        System.out.println(houselist);

//        Collections.sort(houselist, new HouseColorDescComparator());
        houselist.sort(new HouseColorDescComparator());

        System.out.println(houselist);

        houselist.sort(new HouseColorYearComparator());
        System.out.println(houselist);
    }
}
