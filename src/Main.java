public class Main {

    private static BinarySearch binarySearch = new BinarySearch();

    public static void main(String[] args) {
        // Testing binary search
        /*int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9 , 10};
        System.out.println(binarySearch.search(intArray, 5));*/

        // Testing singly linked list
        /*SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.addBack(3);
        singlyLinkedList.addBack(2);
        singlyLinkedList.addBack(1);
        singlyLinkedList.removeBack();
        singlyLinkedList.removeFront();
        singlyLinkedList.showAllValues();*/

        // Testing doubly linked list
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        doublyLinkedList.addBack(1);
        doublyLinkedList.addBack(2);
        doublyLinkedList.addBack(3);
        doublyLinkedList.removeBack();
        doublyLinkedList.removeBack();
        doublyLinkedList.removeBack();

        doublyLinkedList.showAllValues();
    }
}