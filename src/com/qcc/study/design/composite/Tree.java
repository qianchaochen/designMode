package com.qcc.study.design.composite;

/**
 * @author: qiancc
 * 2017年07月19日
 */
public class Tree {

    private TreeNode root = null;
    public Tree(String name){
//        root.setName(name);
        root = new TreeNode(name);
    }

    public static void main(String[] args) {

        Tree tree = new Tree("A");
        TreeNode nodeB = new TreeNode("B");
        TreeNode nodeC = new TreeNode("C");
        nodeB.getChilds().add(nodeC);

        tree.root.getChilds().add(nodeB);

        System.out.println(tree);
    }

}
