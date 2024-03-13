
    Node<String> n0 = new Node<String>("y");
    Node<String> n1 = new Node<String>("k", n0);
    Node<String> n2 = new Node<String>("c", n1);
    Node<String> n3 = new Node<String>("i", n2);
    Node<String> n4 = new Node<String>("p", n3);

    Node<String> firstNode = n4;              // line 1
    Node<String> current = firstNode;         // line 2
    current = current.next;                   // line 3
    firstNode = firstNode.next;               // line 4
    current.next.data = "n";                  // line 5
    current.next = current.next.next.next;    // line 6
    firstNode.data = "b";                     // line 7
    current = current.next;                   // line 8
    firstNode.next = current.next;            // line 9

