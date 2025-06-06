/* Тут нужно написать функцию которая будет проверять симметричны ли бинарные деревья.
 */


// Созданик узлов дерева и их значений.
public class Symmetric {
    int val;
    Symmetric left;
    Symmetric right;
    Symmetric() {
    }
    Symmetric(int val) {
        this.val = val;
    }
    Symmetric(int val, Symmetric left, Symmetric right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }


    static class Solution {
        public boolean isSymmetric(Symmetric root) {
            // Если оба дерева пусты, вернуть true
            if (root == null) return true;
            return isMirror(root.left, root.right);
        }

        private boolean isMirror(Symmetric left, Symmetric right) {
            // Если левая и правая часть пусты, то вернуть true, т.к они симметричны
            if (left == null && right == null) return true;

            // Если хотя бы одно из поддеревьев null, но не оба одновременно, то дерево не симметрично.
            if (left == null || right == null) return false;

            // Если значения узлов этих поддеревьев не равны, вернуть false.
            if (left.val != right.val) return false;

            // Сравнение поддеревьев с обоих сторон, так если они симметричны вернется true, иначе false.
            return isMirror(left.left, right.right) && isMirror(left.right, right.left);
        }
    }
    public static void main(String[] args) {
        Symmetric node = new Symmetric(1,
                new Symmetric(2, new Symmetric(3), new Symmetric(4)),
                new Symmetric(2, new Symmetric(4), new Symmetric(3))
        );

        Solution sol = new Solution();
        boolean result = sol.isSymmetric(node);
        System.out.println(result);

    }
}
