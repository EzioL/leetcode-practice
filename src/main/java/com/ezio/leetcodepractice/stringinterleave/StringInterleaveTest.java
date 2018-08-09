package com.ezio.leetcodepractice.stringinterleave;

/**
 * Here be dragons
 * Created by haotian on 2018/7/24 下午8:59
 */

public class StringInterleaveTest {

    public static void main(String[] args) {
        String s1 = "aabcc";
        String s2 = "dbbca";
        //String s3 = "aadbbcbcac";
         String s3 = "accabdbbca";

        StringInterleaveProblem problem = new StringInterleaveProblem(s1,s2,s3);

        System.err.println(problem);
    }
}
