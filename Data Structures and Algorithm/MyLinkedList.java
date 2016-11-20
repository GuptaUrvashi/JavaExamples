package com.urvashigupta;

class MyLinkedListCreate{
    private Node head;
    private Node tail;

    public MyLinkedListCreate(){
        this.head = new Node("head");
        this.tail = head;
    }

    public Node head(){
        return this.head;
    }

    public void add(Node node){
        this.tail.next = node;
        this.tail = node;
    }

    public static class Node{
        private Node next;
        private String data;

        public Node(String data){
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public String getData() {
            return data;
        }

        public void setData(String data) {
            this.data = data;
        }

        public String toString(){
            return this.data;
        }
    }
}


public class MyLinkedList {
    public static void main(String[] args) {
        MyLinkedListCreate myLinkedListCreate = new MyLinkedListCreate();
        MyLinkedListCreate.Node head = myLinkedListCreate.head(); //adding head
        myLinkedListCreate.add(new MyLinkedListCreate.Node("1")); //next 5 elements
        myLinkedListCreate.add(new MyLinkedListCreate.Node("2"));
        myLinkedListCreate.add(new MyLinkedListCreate.Node("3"));
        myLinkedListCreate.add(new MyLinkedListCreate.Node("4"));
        myLinkedListCreate.add(new MyLinkedListCreate.Node("5"));

        //find middle element in single pass
        MyLinkedListCreate.Node current = head;
        MyLinkedListCreate.Node middle = head;
        int length = 0;

        while(current.getNext() != null){
            length++;

            if(length%2 == 0){
                middle = middle.getNext();
            }
            current = current.getNext();
        }

        if(length%2 == 1){
            middle = middle.getNext();
        }

        System.out.println("Length of Linked List: " + length);
        System.out.println("Middle element: " +middle);
    }

}
