package com.Algorithm.LeetCode;

public class LongestUncommonSubsequenceI {
    public static void main() {

    }

    public static int findLUSlength(String a, String b) {
        if (a.equals(b)) return -1;
        else return Math.max(a.length(), b.length());
    }
}

