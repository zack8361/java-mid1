package kongCT;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class 여행경로 {
    private static boolean[] visited;
    private static String[][] map;
    private static List<String> list;
    public static void main(String[] args) {
        String[][] tickets = {{"ICN", "JFK"}, {"HND", "IAD"}, {"JFK", "HND"}};
        System.out.println(solution(tickets));
    }

    private static String[] solution(String[][] tickets) {
        visited = new boolean[tickets.length];
        list = new ArrayList<>(tickets.length);
        map = tickets;
        list.add(map[0][0]);
        dfs(map[0][1]);
        String[] answer = new String[list.size()];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }


        return answer;

    }

    private static void dfs(String str) {
        list.add(str);

        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                if(!visited[i] && map[i][0].equals(str)){
                    visited[i] = true;
                    dfs(map[i][1]);
                }
            }
        }
    }
}
