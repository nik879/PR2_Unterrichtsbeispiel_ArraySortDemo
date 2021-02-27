import java.util.Comparator;

public class HouseColorYearComparator implements Comparator<House> {


    @Override
    public int compare(House o1, House o2) {
        //criteria 1: color
        int resultcolor = o1.getColor().compareTo(o2.getColor());
        if (resultcolor == 0) {
            //criteria 2:year
            return Integer.compare(o1.getYear(), o2.getYear());
        }
        return resultcolor;
    }
}
