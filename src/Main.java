import java.util.Arrays;

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
        /*DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        doublyLinkedList.addBack(1);
        doublyLinkedList.addBack(2);
        doublyLinkedList.addBack(3);
        doublyLinkedList.removeBack();
        doublyLinkedList.removeBack();
        doublyLinkedList.removeBack();
        doublyLinkedList.showAllValues();*/

        // Testing bubble sort
        /*BublleSort bublleSort = new BublleSort();
        int[] array = {1, 2, 3, 5, 4};
        int[] arraySorted = bublleSort.sort(array);
        System.out.println(Arrays.toString(arraySorted));*/

        // Testing quick sort
        /*QuickSort quickSort = new QuickSort();
        int[] array = {4, 2, 8, 7, 1, 5, 3, 6};
        int[] arraySorted = quickSort.sort(array);
        System.out.println(Arrays.toString(arraySorted));*/

        // Testing merge sort
        /*MergeSort mergeSort = new MergeSort();
        int[] array = {4, 2, 8, 7, 1, 5, 3, 6};
        int[] arraySorted = mergeSort.sort(array);
        System.out.println(Arrays.toString(arraySorted));*/

        // Testing Binary Tree
        BinaryTree binaryTree = new BinaryTree(new NodeBinaryTree(30));
        binaryTree.insert(15);
        binaryTree.insert(45);
        binaryTree.insert(7);
        binaryTree.insert(19);

        System.out.println(binaryTree.search(8));
    }
}