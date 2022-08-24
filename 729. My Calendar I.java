class TreeNode {
    int start;
    int end;
    TreeNode left;
    TreeNode right;
    public TreeNode(int start, int end) {
        this.start = start;
        this.end = end;
        left = null;
        right = null;
    }
}

class MyCalendar {
    TreeNode root;
    
    public MyCalendar() {
        root = null;
    }
    
    public boolean insert (TreeNode node, int start, int end) {
        if (end <= node.start) {
            if (node.left == null) {
                node.left = new TreeNode(start, end);
                return true;
            } else {
                return insert(node.left, start, end);
            }
        } else if (start >= node.end) {
            if (node.right == null) {
                node.right = new TreeNode(start, end);
                return true;
            } else {
                return insert(node.right, start, end);
            }
        }
        return false;
    }
    
    public boolean book(int start, int end) {
        if (root == null) {
            root = new TreeNode(start, end);
            return true;
        } else {
            return insert(root, start, end);
        }
    }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(start,end);
 */
