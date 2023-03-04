//1. BuildTree Preorder

// public class a {
//     static class Node{
//         int data;
//         Node left;
//         Node right;

//         Node(int data) {
//             this.data = data;
//             this.left = null;
//             this.right = null;
//         }
//     }

//     static class BinaryTree{
//         static int idx = -1;
//         public static Node buildTree(int nodes[]){
//             idx++;
//             if(nodes[idx] == -1) {
//                 return null;
//             }

//             Node newNode = new Node(nodes[idx]);
//             newNode.left = buildTree(nodes);
//             newNode.right = buildTree(nodes);
            
//             return newNode;
//         }
//     }
// public static void main(String args[]){
//    int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};        
//    BinaryTree tree = new BinaryTree();
//    Node root = tree.buildTree(nodes);
//    System.out.print(root.data);
// }
// }



//2. preOrder

// public class a {
//     static class Node{
//         int data;
//         Node left;
//         Node right;

//         Node(int data) {
//             this.data = data;
//             this.left = null;
//             this.right = null;
//         }
//     }

//     static class BinaryTree{
//         static int idx = -1;
//         public static Node buildTree(int nodes[]){
//             idx++;
//             if(nodes[idx] == -1) {
//                 return null;
//             }

//             Node newNode = new Node(nodes[idx]);
//             newNode.left = buildTree(nodes);
//             newNode.right = buildTree(nodes);
            
//             return newNode;
//         }

//         public static void preOrder(Node root){
//             if(root == null){
//                 return;
//             }

//             System.out.print(root.data+" ");
//             preOrder(root.left);
//             preOrder(root.right);
//         }
//     }
// public static void main(String args[]){
//    int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};        
//    BinaryTree tree = new BinaryTree();
//    Node root = tree.buildTree(nodes);
//    tree.preOrder(root);
// }

// }



//3. inOrder

// public class a {
//     static class Node{
//         int data;
//         Node left;
//         Node right;

//         Node(int data) {
//             this.data = data;
//             this.left = null;
//             this.right = null;
//         }
//     }

//     static class BinaryTree{
//         static int idx = -1;
//         public static Node buildTree(int nodes[]){
//             idx++;
//             if(nodes[idx] == -1) {
//                 return null;
//             }

//             Node newNode = new Node(nodes[idx]);
//             newNode.left = buildTree(nodes);
//             newNode.right = buildTree(nodes);
            
//             return newNode;
//         }

//         public static void inOrder(Node root){
//             if(root == null){
//                 return;
//             }

//             inOrder(root.left);
//             System.out.print(root.data+" ");
//             inOrder(root.right);
//         }
//     }
// public static void main(String args[]){
//    int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};        
//    BinaryTree tree = new BinaryTree();
//    Node root = tree.buildTree(nodes);
//    tree.inOrder(root);
// }

// }



//4. postOrder

public class a {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree{
        static int idx = -1;
        public static Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            
            return newNode;
        }

        public static void postOrder(Node root) {
            if(root == null){
                return;
            }

            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data+" ");
        }
    }
public static void main(String args[]){
   int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};        
   BinaryTree tree = new BinaryTree();
   Node root = tree.buildTree(nodes);
   tree.postOrder(root);
}

}