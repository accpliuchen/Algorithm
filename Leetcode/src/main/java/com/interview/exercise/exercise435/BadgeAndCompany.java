package com.interview.exercise.exercise435;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BadgeAndCompany {
    public static void main(String[] args) {
        String[][] badgeRecords = {
                { "Martha", "exit" },
                { "Paul", "enter" },
                { "Martha", "enter" },
                { "Martha", "exit" },
                { "Jennifer", "enter" },
                { "Paul", "enter" },
                { "Curtis", "enter" },
                { "Paul", "exit" },
                { "Martha", "enter" },
                { "Martha", "exit" },
                { "Jennifer", "exit" },
                { "Paul", "exit" }
        };

        List<String[]> missingBadgeUsage = findMissingBadgeUsage(badgeRecords);

        for (String[] record : missingBadgeUsage) {
            System.out.println(record[0] + " - " + record[1]);
        }
    }

    public static List<String[]> findMissingBadgeUsage(String[][] badgeRecords) {
        Set<String> enterRecords = new HashSet<>();
        Set<String> exitRecords = new HashSet<>();
        Map<String, Integer> mapRecords = new HashMap<>();

        for (String[] record : badgeRecords) {
            String employee = record[0];
            String action = record[1];

            if (action.equals("enter")) {
                if (mapRecords.containsKey(employee) && !enterRecords.contains(employee)) {
                    if (mapRecords.get(employee) == 1) {
                        enterRecords.add(employee);
                    } else {
                        mapRecords.put(employee, mapRecords.getOrDefault(employee, 0) + 1);
                    }
                } else {
                    mapRecords.put(employee, mapRecords.getOrDefault(employee, 0) + 1);
                }
            } else if (action.equals("exit")) {
                if (mapRecords.containsKey(employee) && !exitRecords.contains(employee)) {
                    if (mapRecords.get(employee) == -1) {
                        exitRecords.add(employee);
                    } else {
                        mapRecords.put(employee, mapRecords.getOrDefault(employee, 0) - 1);
                    }
                } else {
                    mapRecords.put(employee, mapRecords.getOrDefault(employee, 0) - 1);
                }
            }

            System.out.println(employee + "   " + mapRecords.get(employee));
        }

        List<String[]> missingBadgeUsage = new ArrayList<>();

        for (String employee : enterRecords) {
            missingBadgeUsage.add(new String[] { employee, "enter" });
        }

        for (String employee : exitRecords) {
            missingBadgeUsage.add(new String[] { employee, "exit" });
        }

        for (Map.Entry<String, Integer> entry : mapRecords.entrySet()) {
            if (entry.getValue() != 0) {
                missingBadgeUsage.add(new String[] { entry.getKey(), entry.getValue() == 1 ? "enter" : "exit" });
            }
        }

        return missingBadgeUsage;
    }
}