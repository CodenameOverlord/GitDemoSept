import java.util.Comparator;

public class CarMaxSpeedComparator implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2) {
        return o1.getMaxSpeed() - o2.getMaxSpeed();
    }
}
