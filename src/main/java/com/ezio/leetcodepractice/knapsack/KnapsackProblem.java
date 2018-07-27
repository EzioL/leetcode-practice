package com.ezio.leetcodepractice.knapsack;

import com.google.common.collect.Lists;
import java.util.List;
import lombok.Data;

/**
 * Here be dragons
 * Created by haotian on 2018/7/25 下午3:48
 */
@Data
public class KnapsackProblem {

    private Knapsack[] bags;

    private int totalWeight;

    private int bagCount;

    private int[][] bestValues;

    private int bestValue;

    private List<Knapsack> resultBags;

    public KnapsackProblem(Knapsack[] bags, int totalWeight) {
        this.bags = bags;
        this.totalWeight = totalWeight;
        this.bagCount = bags.length;
        bestValues = new int[bagCount + 1][totalWeight + 1];
        solve();
    }

    public void solve() {

        for (int w = 0; w <= totalWeight; w++) {
            for (int c = 0; c <= bagCount; c++) {
                if (w == 0 || c == 0) {
                    bestValues[c][w] = 0;
                } else {
                    Knapsack iBag = bags[c - 1];

                    if (w < iBag.getWeight()) {
                        bestValues[c][w] = bestValues[c - 1][w];
                    } else {
                        int iweight = iBag.getWeight();
                        int ivalue = iBag.getValue();
                        bestValues[c][w] =
                            Math.max(bestValues[c - 1][w], ivalue + bestValues[c - 1][w - iweight]);
                    }
                }
            }
        }
        resultBags = Lists.newArrayList();

        int tempWeight = totalWeight;
        for (int i = bagCount; i > 0; i--) {
            if (bestValues[i][tempWeight] > bestValues[i - 1][tempWeight]) {
                resultBags.add(bags[i - 1]);
                tempWeight = tempWeight - bags[i - 1].getWeight();
            }

            if (tempWeight == 0) {
                break;
            }
        }
        bestValue = bestValues[bagCount][totalWeight];
    }
}
