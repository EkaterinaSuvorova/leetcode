import java.util.HashSet;
import java.util.Set;

public class IsPathCrossing {
    public static void main(String[] args) {
        String path1 = "NES";
        String path2 = "NESWW";
        String path3 = "ENNNNNNNNNNNEEEEEEEEEESSSSSSSSS";
        //System.out.println(isPathCrossing(path1));
        //System.out.println(isPathCrossing(path2));
        System.out.println(isPathCrossing(path3));
    }

    public static boolean isPathCrossing(String path) {
        Set<String> visited = new HashSet<>();
        int x = 0, y = 0;
        char[] pathArr = path.toCharArray();
        visited.add(String.format("%d %d", x, y));

        for (int i = 0; i < path.length(); i++) {
            switch (pathArr[i]) {
                case 'N':
                    y++;
                    break;
                case 'S':
                    y--;
                    break;
                case 'E':
                    x++;
                    break;
                case 'W':
                    x--;
                    break;
            }
            if (visited.contains(String.format("%d %d", x, y))) {
                return true;
            } else {
                visited.add(String.format("%d %d", x, y));
            }

        }
        return false;
    }
}
