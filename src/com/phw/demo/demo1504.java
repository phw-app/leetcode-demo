package com.phw.demo;

public class demo1504 {
    public static void main(String[] args) {
        String s="xbylisvborylklftlkcioajuxwdhahdgezvyjbgaznzayfwsaumeccpfwamfzmkinezzwobllyxktqeibfoupcpptncggrdqbkji";
        char maxChar='a';
        int index=0;
        StringBuffer sb=new StringBuffer();
        String ab="abcdefghijklmnopqrstuvwxyz";
        int n=0;
        for(int i=0;i<ab.length();i++){
            if(s.contains(ab.charAt(i)+"")){
                n++;
            }
        }
        if(n==1){
            System.out.println(s);
        }else{
            for (int i = 0; i < s.length(); i++) {
                if(s.charAt(i)>maxChar){
                    maxChar=s.charAt(i);
                    index=i;
                    sb=new StringBuffer();
                }else if(s.charAt(i)==maxChar){
                    if(i-index!=1){
                        for (int j = 1; j < s.length()-i; j++) {
                            if(s.charAt(index+j)<s.charAt(i+j)){
                                maxChar=s.charAt(i);
                                index=i;
                                sb=new StringBuffer();
                                break;
                            }else if(s.charAt(index+j)==s.charAt(i+j)){
                                continue;
                            }else{
                                break;
                            }
                        }
                    }
                }
                sb.append(s.charAt(i));
            }
        }
        System.out.println(sb.toString());
    }
}
