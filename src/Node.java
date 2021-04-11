public class Node {

    int key;
    String name;

    Node leftChild;
    Node rightChild;

    Node(int key, String name) {
        this.key = key;
        this.name = name;
    }

    public String toString() {

        return name + " has the key " + key + "\n";

	        /* return name + " has the key " + key + "\nLeft Child: " + leftChild +

	         * "\nRight Child: " + rightChild + "\n";

	         */
    }
}
