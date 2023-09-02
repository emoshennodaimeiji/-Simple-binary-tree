package edu.zut.cn.tree;

public class Student {
    double id;
    String name;
    Student left;
    Student right;

    public Student(double id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public void preprint(){//遍历，类似于递归
        System.out.println(this);//先打印自身
        if(this.left!=null){//若左节点不为空，调用左节点的prePrint方法
            this.left.preprint();
        }
        if(this.right!=null){//同理，调用右节点方法
            this.right.preprint();
        }
    }

    public void del(double id){//删除方法
        if(this.left!=null&&this.left.id==id){
            this.left = null;
            return;
        }
        if(this.right!=null&&this.right.id==id){
            this.right = null;
            return;
        }
        if(this.left!=null){
            this.left.del(id);
        }
        if(this.right!=null){
            this.right.del(id);
        }
    }

    public void find(double id){//查找方法
        if(this.id==id){
            System.out.println(this);
            return;
        }
        if(this.left!=null){
            this.left.find(id);
        }
        if(this.right!=null){
            this.right.find(id);
        }
    }
}
