package com.interview.exercise.exercise435;


import java.util.*;


class Pair<F, S> {
    private F first;
    private S second;

    public Pair(F first, S second) {
        this.first = first;
        this.second = second;
    }

    public F getFirst() {
        return first;
    }

    public S getSecond() {
        return second;
    }

    public void setFirst(F first) {
        this.first = first;
    }

    public void setSecond(S second) {
        this.second = second;
    }
}

class UnionFind {
    private int[] parent;
    private int[] rank;

    public UnionFind(int n) {
        parent = new int[n];
        rank = new int[n];
        for (int i = 0; i < n; i++) {
            parent[i] = i;
            rank[i] = 1;
        }
    }

    public int find(int x) {
        if (parent[x] != x) {
            parent[x] = find(parent[x]);
        }
        return parent[x];
    }

    public void union(int x, int y) {
        int rootX = find(x);
        int rootY = find(y);

        if (rootX != rootY) {
            if (rank[rootX] > rank[rootY]) {
                parent[rootY] = rootX;
            } else if (rank[rootX] < rank[rootY]) {
                parent[rootX] = rootY;
            } else {
                parent[rootY] = rootX;
                rank[rootX]++;
            }
        }
    }
}

public class ProductCategories {
    public static List<List<Integer>> findCategories(List<Pair<Integer, Integer>> productPairs) {
        Set<Integer> products = new HashSet<>();
        for (Pair<Integer, Integer> pair : productPairs) {
            products.add(pair.getFirst());
            products.add(pair.getSecond());
        }

        int numProducts = products.size();
        UnionFind uf = new UnionFind(numProducts);

        for (Pair<Integer, Integer> pair : productPairs) {
            uf.union(pair.getFirst() - 1, pair.getSecond() - 1);
        }

        Map<Integer, List<Integer>> categories = new HashMap<>();
        for (int i = 0; i < numProducts; i++) {
            int root = uf.find(i);
            categories.putIfAbsent(root, new ArrayList<>());
            categories.get(root).add(i + 1);
        }

        return new ArrayList<>(categories.values());
    }

    public static void main(String[] args) {
        List<Pair<Integer, Integer>> productPairs = Arrays.asList(
                new Pair<>(1, 5),
                new Pair<>(7, 2),
                new Pair<>(3, 4),
                new Pair<>(4, 8),
                new Pair<>(6, 3),
                new Pair<>(5, 2)
        );

        List<List<Integer>> categories = findCategories(productPairs);

        for (List<Integer> category : categories) {
            System.out.println(category);
        }
    }
}

