package com.phw.demo;

public class demo2 {
    public static void main(String[] args) {
        int[] mon={31,28,31,30,31,30,31,31,30,31,30,31};
        String date="2004-03-01";
        String[] s=date.split("-");
        int res=0;
        Boolean isR=(Integer.parseInt(s[0])%4==0&&Integer.parseInt(s[0])%100!=0)||(Integer.parseInt(s[0])%400==0);
        if(isR){
            mon[1]=29;
        }
        for (int i = 0; i < Integer.parseInt(s[1])-1; i++) {
            res+=mon[i];
        }
        res+=Integer.parseInt(s[2]);
        System.out.println(res);
    }
}
