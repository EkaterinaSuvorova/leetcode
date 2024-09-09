import java.util.*;

public class DestCity {
    public static void main(String[] args) {
        List<List<String>> paths = new ArrayList<>(Arrays.asList(Arrays.asList("B","C"), Arrays.asList("D","B"),Arrays.asList("C","A")));
        System.out.println(destCity(paths));
    }

    public static String destCity(List<List<String>> paths) {
        Map<String, String> destinations = new HashMap<>();
        for (List<String> path : paths) {
            destinations.put(path.get(0), path.get(path.size() - 1));
        }
        for (String dest : destinations.values()) {
            if (destinations.get(dest) == null) {
                return dest;
            }
        }
        return null;
    }
}
