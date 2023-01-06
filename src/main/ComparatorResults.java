package src.main;
import java.util.Comparator;

public class ComparatorResults implements Comparator<Athlete>{
    @Override
    public int compare(Athlete o1, Athlete o2) {
        return o1.getResult() - o2.getResult();
    }
}
