package com.phw.demo;

public class demo1502 {
    int min;
    public static void main(String[] args) {
        String input="[1,7,0,7,-8, null,null]";
        TreeNode root=TreeNode.stringToTreeNode(input);
        System.out.println(root.output(root));
    }
    public static int maxLevelSum(TreeNode root){
        return 0;
    }

}
