package practice;

import nod.Nod;

import java.io.NotActiveException;
import java.util.List;

public class MyLinkedListImpl implements MyLinkedList{

    private Node head;
    private Node tail;
    private int size;

    public MyLinkedListImpl(String data){
        this.head = new Node(data,null,null);
        this.tail = this.head;
        size=1;

    }

    @Override
    public boolean add(String data) {
        Node node1 = new Node(data,tail,null);
        this.tail.next = node1;
        this.tail = node1;
        size++;
        return true;
    }

    @Override
    public boolean add(int index, String data) throws IndexOutOfBoundsException {
        if(index>size){
            throw new IndexOutOfBoundsException("Index " + index + " is out of bound " + size);
        }

        Node temp = this.head;
        Node node2 = new Node(data,null,null);
        for (int i = 0; i <= index; i++) {
          if (i == index){
            node2.prev = temp.prev;
            temp.prev = node2;
            Node b = node2.prev;
            b.next = node2;
            node2.next = temp;
            size++;
            return true;
          }else {
              temp = temp.next;
          }

        }
        return false;
    }

    @Override
    public boolean set(int index, String data) throws IndexOutOfBoundsException {
        if(index>size){
            throw new IndexOutOfBoundsException("Index " + index + " is out of bound " + size);

        }
        Node temp = this.head;
        Node newNode = new Node(data,null,null);
        for (int i = 0; i < index; i++) {
            if(i == index){
              newNode.prev = temp.prev;
              Node b = newNode.prev;
              b.next = newNode;
              newNode.next = temp.next;
              Node d = newNode.next;
              d.prev = newNode;
              return  true;
            }else {
                temp = temp.next;
            }

        }

        return false;
    }

    @Override
    public boolean addFirst(String data) {
        Node newNode = new Node(data,null,null);
        head.prev = newNode;
        newNode.next = head;
        this.head = newNode;
        size++;
        return true;
    }

    @Override
    public boolean addLast(String data) {
        return add(data);
    }

    @Override
    public boolean addAll(List<String> list) {
        for (int i = 0; i < list.size(); i++) {
          add(list.get(i));
        }
        return true;
    }

    @Override
    public boolean contains(String data) {
        Node temp = head;
        for (int i = 0; i < size; i++) {
            if (temp.data.equals(data)) {
               return true;
            }else {
                temp = temp.next;
            }
        }
        return false;
    }

    @Override
    public String get(int index) throws IndexOutOfBoundsException {
        if(index < 0 || index>size){
            throw new IndexOutOfBoundsException("Index " + index + " is out of bound " + size);
        }
        Node temp = head;
        for (int i = 0; i <=index ; i++) {
            if(i == index){
                return temp.data;
            }else{
                temp = temp.next;
            }

        }
        return null;
    }

    @Override
    public String getFirst() {
        return null;
    }

    @Override
    public String getLast() {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public int indexOf(String data) {
        return 0;
    }

    @Override
    public int firstIndexOf(String data) {
        return 0;
    }

    @Override
    public int lastIndexOf(String data) {
        return 0;
    }

    private static class Node {
        String data;
        Node prev;
        Node next;

        public Node(String data, Node prev, Node next) {
            this.data = data;
            this.prev = prev;
            this.next = next;
        }
    }
}
