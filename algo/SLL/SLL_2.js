

// Singly Linked List
// don't use 'let' or 'const' for algos - for now...
// pointers
// memory locations
// garbage collection
// OOP

// pass by value / copy
var x = 10;
var y = x;

x += 30;
y += 10;

// console.log(x); // 40
// console.log(y); // 20

// ----------
// pass by reference
var a = [1, 2, 3, 4];
var b = a;

a.push(10);
b.push(20);

// console.log(a); // [1,2,3,4,10]
// console.log(b); // [1,2,3,4,10,20]

// Object Literal
var person = {
    name: "Bob",
    favFood: "🍕",
    age: 28,
};

// var somePerson = new Person( )

var n1 = {
    value: 11,
    next: null,
};

var n2 = {
    value: 22,
    next: null,
};

var n3 = {
    value: 33,
    next: null,
};

n1.next = n2;
// n2.next = n3
n1.next.next = n3;
// console.log(n1);

// Classes (Car)? blueprints
// create new Objects // DRY
// reuse

// -> constructor
// (java: member variables)
// what a class HAS
// - creates defaults
// define the object
// attributes
// doors

// -> methods - (class functions)
// what a class can DO - actions
// drive()
// honk()
// seeMilage()

var n4 = {
    value: 45,
    next: null,
};

// class for the Node
class Node {
    constructor(value) {
        this.value = value;
        this.next = null;
    }
}

var n5 = new Node(99);
// console.log(n5);

var n6 = new Node(100);
// console.log(n6);

n5.next = n6;
console.log(n5);

// class for the SLL
// what will hold all the nodes
class SLL {
    constructor() {
        this.head = null;
    }

    // -- methods --
    isEmpty() {
        if (this.head) {
            return false;
        } else {
            return true;
        }
    }


    addToFront(n) {
        n.next = this.head;
        this.head = n;
    }

    read(){
        var runner = this.head;
        while ( runner != null){
            console.log(runner.value);
            runner = runner.next;
            // console.log(runner)
        }
    }

    contains(value) {
		// start at the head
		var runner = this.head;
		// while we have a runner
		while (runner) {
			if (runner.value === value) {
				return true;
			}
			// otherwise advance the runner
			runner = runner.next;
		}
		// if the while loop completes, return false
		return false;
	}

    delete(data){
        if(this.contains(data)){
            var runner = this.head;
                if( data == this.head.value){
                    this.head = null
                }
                else{
                    while( runner.next.value != data){
                        
                        runner = runner.next
                        if(!runner){
                            return 0;
                        }
                        
                    }
                    var temp = runner.next
                    runner.next = temp.next
                    temp.next = null
                }

        }
        return 0;

    }


}

var myCoolSLL = new SLL();
console.log(myCoolSLL);

myCoolSLL.head = n1
console.log(myCoolSLL);

myCoolSLL.addToFront(n4);
myCoolSLL.addToFront(n5);
myCoolSLL.addToFront(n6);
console.log(myCoolSLL);

console.log('++++++++++++++++++++')

console.log(myCoolSLL.read());

console.log('++++++++++++++++++++')
myCoolSLL.delete(45);
console.log('++++++++++++++++++++')
console.log(myCoolSLL.read());


var newSLL = new SLL();
console.log(newSLL);

newSLL.head = n1
console.log(newSLL);

newSLL.delete(11);
console.log(newSLL);



