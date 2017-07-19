package com.qcc.study.design.composite;

import java.util.Vector;

/**
 * @author: qiancc
 * 2017年07月19日
 *
 * 组合模式:
 * 又叫部分/整体模式,多用于处理树型结构的问题
 * 将多个对象组合在一起进行操作,常用于表示树型结构中,例如二叉树以及树
 *
 */
public class TreeNode {
    private String name;
    private Vector<TreeNode> childs = new Vector<>();
    private TreeNode parent;

    public TreeNode(String name) {
        this.name = name;
    }

    public TreeNode(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Vector<TreeNode> getChilds() {
        return childs;
    }

    public void setChilds(Vector<TreeNode> childs) {
        this.childs = childs;
    }

    public TreeNode getParent() {
        return parent;
    }

    public void setParent(TreeNode parent) {
        this.parent = parent;
    }

    public void add(TreeNode treeNode){
        childs.add(treeNode);
    }

    public void remove(TreeNode treeNode) {
        childs.remove(treeNode);
    }
}
