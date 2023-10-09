class BSTNode {
    constructor(val) {
        this.val = val;
        /* These properties are how this node is connected to other nodes to form
        the tree. Similar to .next in a SinglyLinkedList except a BST node can
        be connected to two other nodes. To start, new nodes will not be
        connected to any other nodes, these properties will be set after
        the new node is instantiated.*/
        this.left = null;
        this.right = null;
    }
}

class BST {
    constructor() {
        /* Just like the head of a linked list, this is the start of our tree which
        branches downward from here. */
        this.root = null;
    }

    isEmpty() {
        return this.root === null;
    }

    getSmallestFromSubtree() {
        if (!this.isEmpty()){
            var runner = this.root
            while( runner.left != null ){
                if (runner.left) {
                    runner = runner.left
                }
                console.log(runner)
            }
            console.log(runner.val)
        }
    }

    getLargestFromSubtree(current) {}
}

var node1 = new BSTNode(75);
var node2 =  new BSTNode(44);
var node3 =  new BSTNode(78);
var node4 =  new BSTNode(36);

node1.left = node2;
node1.right = node3;
node2.left = node4;

var bst = new BST();

bst.root = node1;

console.log(bst.isEmpty())

bst.getSmallestFromSubtree();


