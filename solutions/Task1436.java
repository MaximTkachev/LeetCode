package solutions;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task1436 {

    public String destCity(List<List<String>> paths) {
        Map<String, String> map = new HashMap<>();
        String leaf = paths.get(0).get(1);

        for (List<String> list : paths) {
            String from = list.get(0);
            String to = list.get(1);
            map.put(from, to);

            if (from.equals(leaf)) {
                leaf = replaceHead(map, leaf);
            }
        }

        return leaf;
    }

    private static String replaceHead(Map<String, String> map, String node) {
        String leaf = map.get(node);
        if (leaf == null) {
            return node;
        }
        return replaceHead(map, leaf);
    }
}
