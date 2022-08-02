package org.example.MyWitcher.algorithms.tree;

import org.example.MyWitcher.algorithms.stack_queue.queue.QueueImpl;
import org.example.MyWitcher.algorithms.stack_queue.stack.StackImpl;

// Алгоритм обход в глубину
public class Main {
    public static void main(String[] args) {
        Tree root =
                new Tree(20,
                        new Tree(7,
                                new Tree(4, null, new Tree(6)), new Tree(9)),
                        new Tree(35,
                                new Tree(31, new Tree(28), null),
                                new Tree(40, new Tree(38), new Tree(52))));
//        System.out.println(root.sum());
//        System.out.println(sumRecursive(root));
//        System.out.println(sumDeep(root));
        System.out.println(sumWide(root));
    }

    private static class Tree {
        int value;
        Tree left;
        Tree right;

        public Tree(int value) {
            this.value = value;
        }

        public Tree(int value, Tree left, Tree right) {
            this.value = value;
            this.left = left;
            this.right = right;
        }

        // Пример суммы дерева через функцию
        public int sum(){
            int sum = value;
            if (left != null)
                sum += left.sum();
            if (right != null)
                sum += right.sum();
            return sum;
        }
    }

    // Пример суммы дерева через рекурсию
    public static int sumRecursive(Tree root){
        int sum = root.value;
        if (root.left != null)
            sum += sumRecursive(root.left);
        if (root.right != null)
            sum += sumRecursive(root.right);
        return sum;
    }

    // Пример суммы дерева через Stack - обход дерева в глубину
    public static int sumDeep(Tree root){
        StackImpl<Tree> stack = new StackImpl<>();
        stack.push(root);

        int sum = 0;
        while (!stack.isEmpty()){
            Tree node = stack.pop();
            System.out.println(node.value);

            sum += node.value;

            if (node.right != null){
                stack.push(node.right);
            }
            if (node.left != null){
                stack.push(node.left);
            }
        }
        return sum;
    }

    // Пример суммы дерева через Queue - обход дерева в ширину
    public static int sumWide(Tree root){
        QueueImpl<Tree> queue = new QueueImpl<>();
        queue.add(root);

        int sum = 0;
        while (!queue.isEmpty()){
            Tree node = queue.remove();
            System.out.println(node.value);
            sum += node.value;

            if (node.left != null){
                queue.add(node.left);
            }
            if (node.right != null){
                queue.add(node.right);
            }
        }
        return sum;
    }

    /**
     * Разница обхода алгоритма в ширину и в глубину
     * в ширину найдет ближайший к искомому
     * в глубину будет искать внутрь
     * */
}
