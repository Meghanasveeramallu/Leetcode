# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution(object):
    def inorderTraversal(self, root):
        """
        :type root: TreeNode
        :rtype: List[int]
        """
        l=[]
        return self.InOrder(root,l)
    def InOrder(self,root,l):
        if root:
            if root.left:
                self.InOrder(root.left,l)
            l.append(root.val)
            if root.right:
                self.InOrder(root.right,l)
