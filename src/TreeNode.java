import java.util.ArrayList;
import java.util.List;


/* В этой задаче требуется пройти по бинарному дереву
   сделать это надо с помощью метода inorder traversal —
   то есть пройтись по каждому узлу дерева в порядке:
   левый — корень — правый
*/

// Класс для представления узла бинарного дерева.
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val;}

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution {
    // Метод для вывода результата.
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) return result;
        inorder(root, result);
        return result;

    }

    // Рекурсивная функция, где и происходит основаная логика
    private void inorder (TreeNode node, List<Integer> result) {
        // Базовый случай для рекурсии
        if (node == null) return;

        // Обработка левого поддерева
        if (node.left != null) {
            inorder(node.left, result);
            // Рекурсивно обходим левое поддерево (до самого "дна")
        }

        // Между этим записываем результат в список
        result.add(node.val);

        if (node.right != null) {
            inorder(node.right, result);
        }
    }
    public static void main(String[] args) {
        TreeNode n = new TreeNode(1);
        n.right = new TreeNode(2);
        n.right.left = new TreeNode(3);


        Solution s = new Solution();
        List<Integer> result1 = s.inorderTraversal(n);
        System.out.println(result1);


        TreeNode n1 = new TreeNode(1);
        n1.left = new TreeNode(2);
        n1.left.left = new TreeNode(4);
        n1.left.right = new TreeNode(5);
        n1.left.right.left = new TreeNode(6);
        n1.left.right.right = new TreeNode(7);

        n1.right = new TreeNode(3);
        n1.right.right = new TreeNode(8);
        n1.right.right.left = new TreeNode(9);

        Solution s1 = new Solution();
        List<Integer> result2 = s1.inorderTraversal(n1);
        System.out.println(result2);
    }
}
