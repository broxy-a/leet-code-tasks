/* В этой задаче требуется проверить идентичные ли бинарные деревья
* 1        1
 / \      / \   -> true
 2  3    2   3
 * Как видно из схемы, идентичность деревьев определяется:
 * Структурой (расположением узлов)
 * Значениями соответствующих узлов
 */

// Класс для постройки дерева
public class TreeNodeSame {
    int val;
      TreeNodeSame left;
      TreeNodeSame right; // Левые, правые поддеревья и val - значение.
      TreeNodeSame() {}
      TreeNodeSame(int val) { this.val = val; }
      TreeNodeSame(int val, TreeNodeSame left, TreeNodeSame right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }


      static class Solution {
          public boolean isSameTree(TreeNodeSame p, TreeNodeSame q) {
              // Если узлы p и q равны null, значит это конец, вернуть true
              if (p == null && q == null) return true;

              // Если один из узлов не равен null, вернуть false, т.к они не одинаковые
              if (p != null && q == null || p == null && q != null) return false;

              // Если значения узлов не равны, вернуть false
              if (p.val != q.val) return false;

              // Рекурсивная проверка: оба дерева должны быть идентичны.
              return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
          }
      }

      public static void main(String[] args) {
          TreeNodeSame n = new TreeNodeSame(1);
          n.left = new TreeNodeSame(2);
          n.right = new TreeNodeSame(3);

          TreeNodeSame n1 = new TreeNodeSame(1);
          n1.left = new TreeNodeSame(2);
          n1.right = new TreeNodeSame(3);

          Solution s = new Solution();
          boolean result = s.isSameTree(n, n1);
          System.out.println(result);

          TreeNodeSame n2 = new TreeNodeSame(1);
          n2.left = new TreeNodeSame(2);
          n2.right = new TreeNodeSame(1);

          TreeNodeSame n3 = new TreeNodeSame(1);
          n3.left = new TreeNodeSame(1);
          n3.right = new TreeNodeSame(2);

          Solution s1 = new Solution();
          boolean result1 = s1.isSameTree(n2, n3);
          System.out.println(result1);

      }
}
