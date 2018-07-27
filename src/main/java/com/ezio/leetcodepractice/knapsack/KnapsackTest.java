package com.ezio.leetcodepractice.knapsack;


/**
 * Here be dragons
 * Created by haotian on 2018/7/24 下午8:59
 */

public class KnapsackTest {

    public static void main(String[] args) {

        Knapsack k = new Knapsack(10, 9);
        Knapsack k1 = new Knapsack(1, 6);
        Knapsack k2 = new Knapsack(2, 10);
        Knapsack k3 = new Knapsack(3, 12);

        Knapsack[] bags = new Knapsack[] {k,k1, k2, k3};

        KnapsackProblem knapsackProblem = new KnapsackProblem(bags, 5);

        System.err.println(knapsackProblem);
    }
}
