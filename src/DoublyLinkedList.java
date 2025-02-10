import java.util.Objects;

public class DoublyLinkedList {
    private NodeDoubly head;
    private NodeDoubly tail;

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void showAllValues() {
        if (Objects.isNull(this.head)) {
            System.out.println("Empty list");
        } else {
            NodeDoubly currentNode = this.head;
            while (Objects.nonNull(currentNode)) {
                System.out.println(currentNode.getValue());
                currentNode = currentNode.getNext();
            }
        }
    }

    public void addFront(Integer value) {
        NodeDoubly newNode = new NodeDoubly(value);
        if(Objects.isNull(this.head)) {
            this.head = newNode;
            this.tail = newNode;
        } else {
            if(Objects.isNull(this.head.getNext())) {
                this.tail = this.head;
            }
            newNode.setNext(this.head);
            this.head = newNode;
        }
    }

    public void addBack(Integer value) {
        NodeDoubly newNode = new NodeDoubly(value);

        if(Objects.isNull(this.head)) {
            this.head = newNode;
            this.tail = newNode;
        } else {
            if (this.head.equals(this.tail)) {
                this.head.setNext(newNode);
                newNode.setPrev(this.head);
                this.tail = newNode;
            } else {
                this.tail.setNext(newNode);
                newNode.setPrev(this.tail);
                this.tail = newNode;
            }
        }
    }

    public void removeFront() {
        if (Objects.isNull(this.head)) {
            System.out.println("Empty list");
        } else if (Objects.isNull(this.head.getNext())) {
            this.head = null;
            this.tail = null;
        } else {
            this.head = this.head.getNext();
            this.head.setPrev(null);
        }
    }

    public void removeBack() {
        if (Objects.isNull(this.head)) {
            System.out.println("Empty list");
        } else if (Objects.isNull(this.head.getNext()) || this.head.equals(this.tail)) {
            this.head = null;
            this.tail = null;
        } else {
            this.tail.getPrev().setNext(null);
            this.tail = this.tail.getPrev();
        }
    }
}

class NodeDoubly {
    private Integer value;
    private NodeDoubly next;

    private NodeDoubly prev;

    public NodeDoubly(Integer value) {
        this.value = value;
        this.next = null;
        this.prev = null;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public NodeDoubly getNext() {
        return next;
    }

    public void setNext(NodeDoubly next) {
        this.next = next;
    }

    public NodeDoubly getPrev() {
        return prev;
    }

    public void setPrev(NodeDoubly prev) {
        this.prev = prev;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NodeDoubly that = (NodeDoubly) o;
        return Objects.equals(value, that.value) && Objects.equals(next, that.next) && Objects.equals(prev, that.prev);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, next, prev);
    }
}
