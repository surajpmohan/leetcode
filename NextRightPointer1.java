/*
116. Populating Next Right Pointers in Each Node

Given a binary tree

struct TreeLinkNode {
  TreeLinkNode *left;
  TreeLinkNode *right;
  TreeLinkNode *next;
}
Populate each next pointer to point to its next right node. If there is no next right node, the next pointer should be set to NULL.
*/

/**
 * Definition for binary tree with next pointer.
 * public class TreeLinkNode {
 *     int val;
 *     TreeLinkNode left, right, next;
 *     TreeLinkNode(int x) { val = x; }
 * }
 */
public class Solution {
    public void connect(TreeLinkNode root) {
        populate(root, null, null);
    }
    
    public void populate(TreeLinkNode node, TreeLinkNode right, TreeLinkNode root) {
        if (node == null) {
            return;
        }
        if (right != null) {
            node.next = right;
        } else {
            if (root != null  && root.next != null) {
                node.next = root.next.left;
            }
        }
        populate(node.left, node.right, node);
        populate(node.right, null, node);
    }   
}
