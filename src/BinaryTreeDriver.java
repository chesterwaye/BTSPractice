public class BinaryTreeDriver {

    public static void main(String[] args) {

        BinaryTree theTree = new BinaryTree();

        theTree.addNode(50, "Boss");
        theTree.addNode(25, "VP");
        theTree.addNode(15, "Office Manager");
        theTree.addNode(30, "Secretary");
        theTree.addNode(75, "Preacher");
        theTree.addNode(85, "Deacan");

               /*           50
                           .  .
                          .    .
                         25    75
                        .   .     .
                       .     .      .
                      15     30     85*/
        System.out.println("In-order Traversal ");
        theTree.inorderTraverseTree( theTree.root);

        System.out.println("\npre-order Traversal ");
        theTree.preorderTraverseTree(theTree.root);

        System.out.println("\npost-order Traversal ");
        theTree.postorderTraverseTree(theTree.root);

    }
}
