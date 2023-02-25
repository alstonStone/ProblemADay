package easy;

import dataStructures.TreeNode;

public class SameTree {

    static boolean sameTree = true;

    public boolean isSameTree(TreeNode p, TreeNode q) {
        sameTree = true;
        parseTwoTrees(p,q);
        return sameTree;
    }


    public void parseTwoTrees(TreeNode node1, TreeNode node2){
        if(node1 == null || node2 == null){
            if(node1 == null && node2 == null){
                if(sameTree){
                    sameTree = true;
                }else{
                    sameTree = false;
                }
                
                return;
            }else if(node1 != null && node2 == null){
                sameTree = false;
                return;
            }else if(node1 == null && node2 != null){
                sameTree = false;
                return;
            }
            return;
        }else if(node1.val != node2.val){
            sameTree = false;
            return;
        }

        parseTwoTrees(node1.left, node2.left);
        parseTwoTrees(node1.right, node2.right);
    }

}