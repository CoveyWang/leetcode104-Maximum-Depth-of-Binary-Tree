public class Main {

    public static void main(String[] args) {
	// write your code here
        Solution solution = new Solution();
        TreeNode treeNode1=new TreeNode(1);
        TreeNode treeNode2=new TreeNode(2);
        TreeNode treeNode3=new TreeNode(3);
        TreeNode treeNode4=new TreeNode(4);

        treeNode1.left=treeNode2;
        treeNode2.left=treeNode3;
        treeNode2.left=treeNode4;
        //treeNode1.left=treeNode2;
        System.out.println(solution.maxDepth(treeNode1));
    }
}
