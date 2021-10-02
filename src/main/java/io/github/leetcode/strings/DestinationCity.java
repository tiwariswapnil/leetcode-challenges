package io.github.leetcode.strings;

import java.util.HashMap;
import java.util.List;

public class DestinationCity {

    public String destCity(List<List<String>> paths) {
        HashMap<String, String> hm = new HashMap<>();

        int n = paths.size();

        for (int i = 0; i < n; i++) {
            hm.put(paths.get(i).get(0), paths.get(i).get(1));
        }

        String source = paths.get(0).get(0);

        while (hm.containsKey(source)) {
            source = hm.get(source);
        }

        return source;
    }

}
