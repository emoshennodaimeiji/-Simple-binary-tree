package edu.zut.cn.tree;

public class Test {
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.preSelect();
        binaryTree.set(new Student(1,"葛德文"));
        binaryTree.preSelect();
        binaryTree.set(new Student(2,"菈妮"));
        binaryTree.set(new Student(0.5,"玛丽卡"));
        binaryTree.set(new Student(3,"菈塔恩"));
        binaryTree.preSelect();
        binaryTree.search(0.5);
        binaryTree.find(0.5);
        binaryTree.remove(0.5);
        binaryTree.del(3);
        binaryTree.preSelect();
    }
}
