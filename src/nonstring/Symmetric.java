package nonstring;
import javax.swing.tree.TreeNode;


public class Symmetric {
	
	public class TreeNode {
	    int val;
	     TreeNode left;
	     TreeNode right;
	     TreeNode(int x) { val = x; }
	 }
	
    public boolean isSymmetric(TreeNode root) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(root == null) return true;
        if(root.left == null && root.right == null) return true;
        if(root.left == null || root.right == null) return false;
        
        return isSymmetric2(root.left, root.right);
    }
    
    public boolean isSymmetric2(TreeNode left, TreeNode right) {
        if(left == null && right == null) {
            return true;
        } else if(left == null || right == null) {
            return false;
        }
        
        boolean checkLeft = isSymmetric2(left.left, right.right);
        boolean checkRight = isSymmetric2(left.right, right.left);
        
        if(checkLeft && checkRight && left.val == right.val) {
            return true;
        } else {
            return false;
        }
    }
}