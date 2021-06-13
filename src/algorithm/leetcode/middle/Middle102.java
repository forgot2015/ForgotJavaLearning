package algorithm.leetcode.middle;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zongfulin
 * Date: 2021/6/14
 * Time: 00:19
 * Description:102. 二叉树的层序遍历
 * 给你一个二叉树，请你返回其按 层序遍历 得到的节点值。 （即逐层地，从左到右访问所有节点）。
 * <p>
 *  
 * <p>
 * 示例：
 * 二叉树：[3,9,20,null,null,15,7],
 * <p>
 * 3
 * / \
 * 9  20
 * /  \
 * 15   7
 * 返回其层序遍历结果：
 * <p>
 * [
 * [3],
 * [9,20],
 * [15,7]
 * ]
 * 通过次数324,377提交次数505,761
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/binary-tree-level-order-traversal
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Middle102 {
    public static void main(String[] args) {
        System.out.println(new Middle102().levelOrder(new TreeNode(2)));
    }

    public List<Integer> levelOrder(TreeNode root) {
        List<> lists = new ArrayList<>();
        return dfs(root, lists);
    }

    void dfs(TreeNode root, List<Integer> lists) {
        if (root == null) {
            return lists;
        }
        lists.add(root.val);
        dfs(root.left, lists);
        dfs(root.right, lists);
    }

}
