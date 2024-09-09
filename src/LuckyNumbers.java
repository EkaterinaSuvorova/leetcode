import java.util.*;
import java.util.stream.Collectors;

public class LuckyNumbers {
    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> minRow = new ArrayList<>();
        for (int[] ints : matrix) {
            minRow.add(Arrays.stream(ints).min().getAsInt());
        }

        List<Integer> maxCol = new ArrayList<>();
        for (int j = 0; j < matrix[0].length; j++) {
            int finalJ = j;

            OptionalInt maxInColumn = Arrays.stream(matrix).mapToInt(ints -> ints[finalJ])
                    .max();

            maxInColumn.ifPresent(maxCol::add);
        }
        return minRow.stream()
                .distinct()
                .filter(maxCol::contains)
                .collect(Collectors.toList());
    }

}
