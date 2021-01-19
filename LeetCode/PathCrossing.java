package LeetCode;

import java.util.HashSet;
import java.util.Set;

public class PathCrossing {

    public static boolean pathCrossing(String str) {
        char[] location = str.toCharArray();
        Set<String> set = new HashSet<String>();

        int x = 0;
        int y = 0;
        set.add(x + "," + y);
        for (int i = 0; i < location.length; i++) {
            if (location[i] == 'N') {
                y++;
            } else if (location[i] == 'E') {
                x--;
            } else if (location[i] == 'W') {
                x++;
            } else {
                y--;
            }
            if (!set.add(x + "," + y)) {
                return true;
            }

        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(pathCrossing("NESWW"));
    }
}

//second way using string builder
   /* public boolean isPathCrossing(String path) {
        int x = 0;
        int y = 0;
        Set<String> set = new HashSet<>();
        String initial = "(0,0)";
        set.add(initial);
        for (char ch: path.toCharArray()) {
            if (ch == 'N')
                y += 1;
            else if (ch == 'S')
                y -= 1;
            else if (ch == 'W')
                x -= 1;
            else
                x += 1;
            StringBuilder sb = new StringBuilder();
            sb.append("(");
            sb.append(x);
            sb.append(",");
            sb.append(y);
            sb.append(")");
            String currentPath = sb.toString();
            if (set.contains(currentPath))
                return true;
            else
                set.add(currentPath);
        }
        return false;
    }
}*/