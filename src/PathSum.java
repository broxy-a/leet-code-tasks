/*
 В этой задаче нужно найти путь от корня до листа, чтобы в сумме получить искомое число.
        5
      / \
     4   8
    /   / \
   11  13  4   result == true;
  /  \      \
 7    2      1

 */

public class PathSum {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        // Если корень пуст, значит и пути нету
        if (root == null) return false;

        // Переменная которая показывает сколько еще раз нужно идти вниз по дереву чтобы найти получить targetSum
        int findSum = targetSum - root.val;

        /*
        На каждом шаге вычитаем значение текущего узла из оставшийся суммы,
        и когда мы дойдем до листа,
        проверим не осталось ли у него детей и равно ли 0 findSum
        т.к это значит что сумма вдоль всего пути равна targetSum
         */
        if  (root.left == null && root.right == null && findSum == 0) return true;
        return hasPathSum(root.left, findSum) || hasPathSum(root.right, findSum);


    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(11);
        root.left.left.left = new TreeNode(7);
        root.left.left.right = new TreeNode(2);
        root.right.left = new TreeNode(13);
        root.right.right = new TreeNode(4);
        root.right.right.right = new TreeNode(1);

        PathSum ps = new PathSum();
        System.out.println(ps.hasPathSum(root, 22));

    }
}
