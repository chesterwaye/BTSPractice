public class BinaryTree {

    Node root;

    public void addNode(int key, String name) {

        //Create a new Node and initialize it

        Node newNode = new Node(key, name);

        //if there is no root this becomes the root
        if (root == null) {
            root = newNode;
        } else {

            //Set root as the Node we will start
            //with as we traverse the tree
            Node focusNode = root;

            //Future parent for our new Node
            Node parent;

            while (true) {

                //root is the top parent so we start there
                parent = focusNode;

                //check if the new node should go on the left side of the parent
                if (key < focusNode.key) {

                    //Switch focus to the left child
                    focusNode = focusNode.leftChild;

                    //if the left child has no children
                    if (focusNode == null) {

                        //then place the new node on the left of it
                        parent.leftChild = newNode;
                        return; // all done
                    }
                } else { // if we get here put the node on the rigght

                    focusNode = focusNode.rightChild;

                    //if the right child has no children
                    if (focusNode == null) {
                        //then place the new node on the right of it
                        parent.rightChild = newNode;
                        return; // All Done
                    }
                }
            }
        }
    }

    /**Method: inorderTraverseTree
     * @param focusNode - The current node
     * In-order- Left subtree, current node, right subtree
     */
    //All nodes are visited in ascending order
    //recursion is used to go to one node and
    //then go to its child nodes and so forth
    public void inorderTraverseTree(Node focusNode) {

        if (focusNode != null) {

            //Traverse the left node
            inorderTraverseTree(focusNode.leftChild);

            //visit the currently focused on node
            System.out.print(focusNode);

            //Traverse the right node
            inorderTraverseTree(focusNode.rightChild);
        }


    }

    /**Method: preorderTraverseTree
     * @param focusNode - start with this node
     * Pre-order - Current node, left subtree, right subtree
     */
    public void preorderTraverseTree(Node focusNode) {

        if (focusNode != null) {

            //visit the currently focused on node
            System.out.print(focusNode);

            //Traverse the left node
            preorderTraverseTree(focusNode.leftChild);

            //Traverse the right node
            preorderTraverseTree(focusNode.rightChild);
        }


    }

    public void postorderTraverseTree(Node focusNode) {

        if (focusNode != null) {

            //Traverse the left node
            postorderTraverseTree(focusNode.leftChild);

            //Traverse the right node
            postorderTraverseTree(focusNode.rightChild);

            //visit the currently focused on node
            System.out.print(focusNode);

        }


    }
}
