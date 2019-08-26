package com.phw.demo;

public class demo1 {
    public static void main(String[] args) {
        int[] nums={10,4,4,10,10,6,2,3};
        int[] nums1=nums.clone();
        int res=0;
        int res1=0;
        int a,b,max1,max2;
        for (int i = 0; i < nums.length; i++) {
            if(i%2!=0){
                if(i+1<nums.length){
                    a=nums[i-1]-nums[i];
                    b=nums[i+1]-nums[i];
                    if(a<=0&&b<=0){
                        max1=(Math.abs(a)>Math.abs(b)?Math.abs(a):Math.abs(b))+1;
                        nums[i]-=max1;
                    }else if(a>0&&b>0){
                        max1=0;
                    }else{
                        max1=Math.abs(a>b?b:a)+1;
                        nums[i]-=max1;
                    }
                    res+=max1;
                }else{
                    a=nums[i-1]-nums[i];
                    if(a>0){
                        max1=0;
                    }else{
                        max1=(Math.abs(a)+1);
                        nums[i]-=max1;
                    }
                    res+=max1;
                }
            }
        }
        for (int i = 0; i < nums1.length; i++) {
            if(i%2!=0){
                if(i+1<nums1.length){
                    a=nums1[i]-nums1[i-1];
                    b=nums1[i]-nums1[i+1];
                    if(a<=0&&b<=0){
                        max2=Math.abs(a)+Math.abs(b)+2;
                        nums1[i-1]=nums1[i-1]+a-1;
                        nums1[i+1]=nums1[i+1]+b-1;
                    }else if(a>0&&b>0){
                        max2=0;
                    }else{
                        if(a>b){
                            nums1[i+1]=nums1[i+1]+b-1;
                        }else{
                            nums1[i-1]=nums1[i-1]+a-1;
                        }
                        max2=Math.abs(a>b?b:a)+1;
                    }
                    res1+=max2;

                }else{
                    a=nums1[i]-nums1[i-1];
                    if(a>0){
                        max2=0;
                    }else{
                        max2=(Math.abs(a)+1);
                        nums1[i]-=max2;
                    }
                    res1+=max2;
                }
            }
        }
        System.out.println(res+" "+res1);
    }

}
