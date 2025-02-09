import java.util.Objects;

public class SinglyLinkedList {
    private Node head;

    public SinglyLinkedList() {
        this.head = null;
    }

    public void showAllValues() {
        if (Objects.isNull(this.head)) {
            System.out.println("Empty list");
        } else {
            Node currentNode = this.head;
            while (Objects.nonNull(currentNode)) {
                System.out.println(currentNode.getValue());
                currentNode = currentNode.getNext();
            }
        }
    }

    public void addFront(Integer value) {
        Node newNode = new Node(value);
        if (Objects.nonNull(this.head)) {
            newNode.setNext(this.head);
        }

        this.head = newNode;
    }

    public void addBack(Integer value) {
        Node newNode = new Node(value);
        if (Objects.isNull(this.head)) {
            this.head = newNode;
        } else {
            Node currentNode = this.head;
            while (Objects.nonNull(currentNode.getNext())) {
                currentNode = currentNode.getNext();
            }
            currentNode.setNext(newNode);
        }
    }

    public void removeFront() {
        if (Objects.isNull(this.head)) {
            System.out.println("Empty list");
        } else if (Objects.isNull(this.head.getNext())) {
            this.head = null;
        } else {
            this.head = this.head.getNext();
        }
    }

    public void removeBack() {
        if (Objects.isNull(this.head)) {
            System.out.println("Empty list");
        } else if (Objects.isNull(this.head.getNext())) {
            this.head = null;
        } else {
            Node currentNode = this.head;
            while (Objects.nonNull(currentNode.getNext().getNext())) {
                currentNode = currentNode.getNext();
            }
            currentNode.setNext(null);
        }
    }
}

class Node {
    private Integer value;
    private Node next;

    public Node(Integer value) {
        this.value = value;
        this.next = null;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
