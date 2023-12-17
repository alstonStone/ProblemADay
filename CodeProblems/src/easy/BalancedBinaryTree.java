package easy;

import dataStructures.TreeNode;

public class BalancedBinaryTree {

    public boolean isBalanced(TreeNode root) {
        
		int lh;
		int rh;
		
		if(root == null) {
			return true;
		}
        lh = getHeight(root.left);
        rh = getHeight(root.right);
 
        if (Math.abs(lh - rh) <= 1 && isBalanced(root.left)
            && isBalanced(root.right))
            return true;
 
        /* If we reach here then tree is not height-balanced
         */
        return false;


    }

	private static int getHeight(TreeNode root) {

        /* base case tree is empty */
        if (root == null)
            return 0;
 
        /* If tree is not empty then height = 1 + max of
         left height and right heights */
        return 1
            + Math.max(getHeight(root.left),
                       getHeight(root.right));
	}
	


	
}
