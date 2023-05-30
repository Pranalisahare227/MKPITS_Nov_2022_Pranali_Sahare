class node {
    int value;
    node next;
}

public class Single_Linked_List {
    node head;
    node tail;
    int size;

    public void CreateSll(int nodeValue) {
        node newNode = new node();
        newNode.value = nodeValue;
        newNode.value=nodeValue;
        newNode.next=null;
        head=newNode;
        tail=newNode;
        size=1;
    }

    public void insertSll(int nodeValue){ //assume node inserted at last
        node newNode=new node();
        newNode.value=nodeValue;
        newNode.next=null;
        tail.next=newNode;
        tail=newNode;
        size++;

    }

    public void travarsal()
    {
       node tempNode = head;
       for (int i=0; i<size; i++) {
          System.out.print(tempNode.value);
          if (i !=size -1) {
              System.out.print(" -> ");
          }
          tempNode = tempNode.next;
       }
       System.out.println("\n");
    }


    public static void main(String[] args) {
        Single_Linked_List ob = new Single_Linked_List();
        ob.CreateSll(2);
        ob.insertSll(12);
        ob.insertSll(13);
        ob.insertSll(14);
        ob.insertSll(76);
        ob.travarsal();

    }


}