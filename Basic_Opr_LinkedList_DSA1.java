
class Node {
    int value;
    Node next;
}
public class Basic_Opr_LinkedList_DSA1 {
    Node head;
    Node tail;
    int size;

    public Basic_Opr_LinkedList_DSA1() {
        this.size = 0;
    }

    public void CreateSll(int nodeValue) {
        Node newNode = new Node();
        newNode.value = nodeValue;
//       newNode.value=nodeValue;
        newNode.next=null;
        head=newNode;
        tail=newNode;
        size++;
    }

    public void insertSll(int nodeValue){ //assume node inserted at last
        Node newNode=new Node();
        newNode.value=nodeValue;
        newNode.next=null;
        tail.next=newNode;
        tail=newNode;
        size++;
    }

    public void travarsal()
    {
        Node tempNode = head;
        for (int i=0; i<size; i++) {
            System.out.print(tempNode.value);
            if (i !=size -1) {
                System.out.print(" -> ");
            }
            tempNode = tempNode.next;
        }
        System.out.println("\n");
    }

    boolean searchNode(int nodeValue)  {
        if (head != null)  {
            Node tempNode = head;
            for (int i=0; i<size; i++) {
                if (tempNode.value == nodeValue) {
                    System.out.print("Found the node at location: " +i+"\n");
                    return true;
                }
                tempNode = tempNode.next;
            }
        }
        System.out.print("Node  not found! ");
        return false;
    }


    public static void main(String[] args) {
        Basic_Opr_LinkedList_DSA1 ob = new Basic_Opr_LinkedList_DSA1();

        ob.CreateSll(2);
        ob.insertSll(12);
        ob.insertSll(13);
        ob.insertSll(14);
        ob.insertSll(76);
        ob.travarsal();
        ob.searchNode(14);



    }


}



