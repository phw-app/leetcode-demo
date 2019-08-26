package com.phw.demo;

import java.util.Arrays;

public class demo {
    public static void main(String[] args) {
        String s = "GLRLLGLL";
        int ll = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'L') {
                ll++;
            }
            if (s.charAt(i) == 'R') {
                ll--;
            }
        }
        if (ll % 4 == 0) {
            System.out.println(ret(s));
        } else {
            int n;
            String news = "";
            if (ll % 4 == 2) {
                n = 2;
            } else {
                n = 4;
            }
            for (int i = 0; i < n; i++) {
                news.concat(s);
            }
            System.out.println(ret(news));
        }
    }

    public static boolean ret(String news) {
        int[] re = {0, 0};
        int x = 1;
        int y = 0;
        for (int i = 0; i < news.length(); i++) {
            if (news.charAt(i) == 'G') {
                re[0] += x;
                re[1] += y;
            }
            if (news.charAt(i) == 'L') {
                if (y == 0 && x == 1) {
                    y = 1;
                    x = 0;
                }
                else if (y == 0 && x == -1) {
                    y = -1;
                    x = 0;
                }
                else if (y == 1 && x == 0) {
                    x = -1;
                    y = 0;
                }
                else if (y == -1 && x == 0) {
                    y = 0;
                    x = 1;
                }
            }
            if (news.charAt(i) == 'R') {
                if (y == 0 && x == 1) {
                    y = -1;
                    x = 0;
                }
                else if (y == 0 && x == -1) {
                    y = 1;
                    x = 0;
                }
                else if (y == 1 && x == 0) {
                    x = 1;
                    y = 0;
                }
                else if (y == -1 && x == 0) {
                    y = 0;
                    x = -1;
                }
            }
        }
        if(re[0]==0&&re[1]==0){
            return true;
        }else{
            return false;
        }
    }
}
