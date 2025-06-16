/* В этой задаче нужно вернуть самый длинный путь от корня дерева до самого дальнего узла
      3
     / \
    9  20    -> root = 3;
       / \
      15  7

 */

public class MaximumDepth {
    int val;
      MaximumDepth left;
      MaximumDepth right;
      MaximumDepth() {}
      MaximumDepth(int val) { this.val = val; }
       MaximumDepth(int val, MaximumDepth left, MaximumDepth right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }

      public static int maxDepth(MaximumDepth root) {
          // Если корень пуст то вернуть 0
          if (root == null) {
              return 0;
          } else {
              // Иначе вернуть максимальную глубину одного из поддеревьев.
              return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
          }
      }

      public static void main(String[] args) {
          MaximumDepth root = new MaximumDepth(3);
          root.left = new MaximumDepth(9);
          root.right = new MaximumDepth(20);
          root.right.left = new MaximumDepth(15);
          root.right.right = new MaximumDepth(7);

          System.out.println(maxDepth(root));
      }
}
