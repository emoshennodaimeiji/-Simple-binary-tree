package edu.zut.cn.tree;

public class BinaryTree {
    private Student root;
    public void setRoot(Student student){
        this.root = student;
    }

    public void set(Student student){//插入
        if(root==null){
            this.setRoot(student);
            return;
        }
        Student temp = root;
        while (true){
            if(temp==null){
                break;
            }
            if(student.id<temp.id){
                if(temp.left==null){//如果左节点为空，则直接赋值
                    temp.left = student;
                    return;
                }
                temp = temp.left;//若不为空，则进入下一次循环
            }else {
                if(temp.right==null){//同理
                    temp.right = student;
                    return;
                }
                temp = temp.right;
            }
        }
    }

    public void search(double id){//根据id查找
        if(root==null){
            System.out.println("空树");
            return;
        }
        Student temp = this.root;
        while (true){
            if(temp==null){
                System.out.println("未找到");
                return;
            }
            if(temp.id==id){
                System.out.println(temp);
                return;
            }
            if(id<temp.id){
                temp = temp.left;
            }else {
                temp = temp.right;
            }
        }
    }

    public void remove(double id){//根据id删除
        if(root==null){
            System.out.println("空树");
            return;
        }
        Student temp = root;
        while (true){
           if(id<temp.id&&temp.left!=null){
               if(temp.left.id==id){
                   temp.left = null;
                   return;
               }
               temp = temp.left;
           }else if(id>temp.id&&temp.right!=null){
               if(temp.right.id==id){
                   temp.right = null;
                   return;
               }
               temp = temp.right;
           }else if(id==temp.id){
               System.out.println("为根节点，无法删除");
               return;
           }else {
               System.out.println("未找到，无法删除");
               return;
           }
        }
    }

    public void del(double id){//用节点中方法删除
        if(root!=null){
            this.root.del(id);
        }else {
            System.out.println("空树，无法删除");
        }
    }

    public void find(double id){//用节点中方法查找
        if(root!=null){
            this.root.find(id);
        }else {
            System.out.println("空树，无法查找");
        }
    }

    public void preSelect(){//用节点中方法遍历
        if(root!=null){
            this.root.preprint();
        }else {
            System.out.println("空树，无法遍历");
        }
    }
}
