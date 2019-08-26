package com.phw.demo;

public class demo3 {
    public static void main(String[] args) {
        String text="adaaava";
        char a=text.charAt(0);
        int maxL=1;
        int maxN=1;
        int max=1;
        boolean con=false;
        for (int i = 1; i <text.length() ; i++) {
            if(text.charAt(i)==a){
                maxN++;
                if(!con){
                    max++;
                }
            }else{
                maxL=maxN;
                maxN=1;
                if(i<text.length()-2){
                    if(text.charAt(i+2)==a){
                        con=true;
                    }else{

                    }
                }
            }
        }
    }
}
