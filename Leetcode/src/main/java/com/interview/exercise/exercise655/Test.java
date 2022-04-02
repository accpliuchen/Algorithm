package com.interview.exercise.exercise655;

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
    this.val = val;
    this.left = left;
    this.right = right;
   }
}


//https://blog.csdn.net/weixin_45176257/article/details/106486613

public class Test{
    public static void main(String[] args) {

    }
}

//public class Test {
//    int a=1;
//    int b=2;
//
//    Test func(Test obj){
//        Test obj3=new Test();
//        obj3=obj;
//        obj3.a=obj.a++ + ++obj.b;
//        obj.b=obj.b;
//        return obj3;
//    }
//
//    public static void main(String[] args) {
//
//        Test obj1=new Test();
//        Test obj2=obj1.func(obj1);
//
//        System.out.println("obj1.a =" + obj1.a+"");
//        System.out.println("obj2.a =" + obj2.a+"");
//    }
//}
