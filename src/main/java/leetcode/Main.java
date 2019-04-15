package leetcode;


import java.util.Scanner;

/**
 * @author qiaoying
 * @date 2019-04-13 19:35
 */

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x){
        val = x;
    }
}


public class Main {



    public  int minTime(TreeNode root) {

        if(root==null) {
            return 0;
        }
        if(root.left==null) {
            return minTime(root.right)+1;
        }
        if(root.right==null) {
            return minTime(root.left)+1;
        }
        int right=minTime(root.right)+1;
        int left=minTime(root.left)+1;
        return left>right?right:left;

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());

        String input1 = sc.nextLine();
        String[] tmp1 = input1.split(" ");
        int num2 = Integer.parseInt(tmp1[0]);
        int num1 = Integer.valueOf(tmp1[1]);


        String input2 = sc.nextLine();
        String[] tmp2 = input2.split(" ");
        int num3 = Integer.valueOf(tmp2[0]);
        num2 = Integer.valueOf(tmp2[1]);

        String input3 = sc.nextLine();
        String[] tmp3 = input3.split(" ");
        int num4 = Integer.valueOf(tmp3[0]);
        num3 = Integer.valueOf(tmp3[1]);

        String input4 = sc.nextLine();
        String[] tmp4 = input4.split(" ");
        int num5 = Integer.valueOf(tmp4[0]);
        num2 = Integer.valueOf(tmp4[1]);

        String input5 = sc.nextLine();
        String[] tmp5 = input5.split(" ");
        int num6 = Integer.valueOf(tmp5[0]);
        num1 = Integer.valueOf(tmp5[1]);


        TreeNode node1 = new TreeNode(num1);
        TreeNode node2 = new TreeNode(num2);
        TreeNode node3 = new TreeNode(num3);
        TreeNode node4 = new TreeNode(num4);
        TreeNode node5 = new TreeNode(num5);
        TreeNode node6 = new TreeNode(num6);

        node5.left = node2;
        node2.left = node1;
        node2.right = node3;
        node1.left = node6;
        node3.left = node4;

        Main main = new Main();
        System.out.println(main.minTime(node5));






    }
}
