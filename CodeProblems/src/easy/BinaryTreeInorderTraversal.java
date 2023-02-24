package easy;

import java.util.ArrayList;
import java.util.List;

import dataStructures.TreeNode;




public class BinaryTreeInorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        parseTree(root,result);
        return (result);
    }

    public void parseTree(TreeNode node, List<Integer> returnList){

        if(node == null){
            return;
        }

        parseTree(node.left, returnList);
        returnList.add(node.val);
        parseTree(node.right,returnList);


    }

}
