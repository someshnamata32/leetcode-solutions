/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    Map<TreeNode, TreeNode> parent = new HashMap<>();

    void makeParent(TreeNode node, TreeNode par){

        if(node == null)
            return;
        
        if(par != null)
            parent.put(node,par);
        
        makeParent(node.left, node);
        makeParent(node.right,node);
    }
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        
        List<Integer> ans = new ArrayList<>();

        makeParent(root, null);

        Queue<TreeNode> queue = new LinkedList<>();
        Set<TreeNode> vis = new HashSet<>();

        queue.add(target);
        vis.add(target);

        int distance = 0;

        while(!queue.isEmpty()){
            int size = queue.size();
            
            if(distance == k){

                for(TreeNode node : queue)
                    ans.add(node.val);
                
                return ans;
            }

            for(int i=0; i<size; i++){

                TreeNode node = queue.poll();

                if(node.left != null && !vis.contains(node.left)){
                    vis.add(node.left);
                    queue.add(node.left);
                }

                if(node.right != null && !vis.contains(node.right)){
                    vis.add(node.right);
                    queue.add(node.right);
                }

                if(parent.containsKey(node) && !vis.contains(parent.get(node))){
                    vis.add(parent.get(node));
                    queue.add(parent.get(node));
                }
            }
            distance++;
        }
        return ans;
    }
}