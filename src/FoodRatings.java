import java.util.*;

public class FoodRatings {
    private Map<String, Map<String, Integer>> map;
    public FoodRatings(String[] foods, String[] cuisines, int[] ratings) {
        map = new HashMap<>();
        for (int i = 0; i < foods.length; i++) {
            Map<String, Integer> cuisine = map.get(cuisines[i]);
            if (Objects.isNull(cuisine)) {
                cuisine = new HashMap<>();
                map.put(cuisines[i], cuisine);
            }
            cuisine.put(foods[i], ratings[i]);
        }
    }

    public void changeRating(String food, int newRating) {
        Collection<Map<String, Integer>> cuisines = map.values();
        for (Map<String, Integer> cuisine : cuisines) {
            if (!Objects.isNull(cuisine.get(food))) {
                cuisine.put(food, newRating);
                return;
            }
        }
    }

    public String highestRated(String cuisine) {
        Map<String, Integer> foods = map.get(cuisine);
        int max = 0;
        String food = null;
        if (!Objects.isNull(foods)) {
            for (Map.Entry<String, Integer> entry : foods.entrySet()) {
                if (entry.getValue() > max) {
                    max = entry.getValue();
                    food = entry.getKey();
                } else if (entry.getValue() == max && entry.getKey().compareTo(food) < 0) {
                    food = entry.getKey();
                }
            }
            System.out.println(food + ":" + max);
            return food;
        }
        return null;
    }
}
