package javaprj.day0128;

import java.util.*;

public class Main {

    private static void dfs(int[][] graph, boolean[] visited, int vertex) {
        visited[vertex] = true;
        System.out.print(vertex + " ");

        for (int i = 0; i < graph.length; i++) {
            if (graph[vertex][i] == 1 && !visited[i]) {
                dfs(graph, visited, i);
            }
        }
    }

    public static void main(String[] args) {
        // 정점의 수
        int vertices = 4;

        // 인접 행렬 초기화
        int[][] graph = new int[vertices][vertices];

        // 간선 추가
        graph[0][1] = 1;
        graph[0][2] = 1;
        graph[1][2] = 1;
        graph[2][0] = 1;
        graph[2][3] = 1;
        graph[3][3] = 1;

        boolean[] visited = new boolean[vertices];

        // DFS 탐색 시작 (시작 정점: 2)
        System.out.println("DFS 탐색 결과 (시작 정점: 2):");
        dfs(graph, visited, 2);
    }
}

