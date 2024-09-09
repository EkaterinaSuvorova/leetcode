import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class RandomizedSet {
    private Set<Integer> set;
    public RandomizedSet() {
        set = new HashSet<>();
    }

    public boolean insert(int val) {
        return set.add(val);
    }

    public boolean remove(int val) {
        return set.remove(val);
    }

    public int getRandom() {
        int index = new Random().nextInt(set.size());
        int i = 0;
        Iterator<Integer> it = set.iterator();
        while (i < index) {
            it.next();
            i++;
        }
        return it.next();
    }
}
