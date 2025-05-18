public class Node
{
   private Foithths data;
   private Node next;
   
   public Node(Foithths data)
   {
       this.data=data;
   }
   
   public Foithths getData()
   {
       return data;
   }
   
   public Node getNext()
   {
       return next;
   }
   
   public void setData(Foithths newData)
   {
       this.data=newData;
   }
   
   public void setNext(Node newNext)
   {
       this.next=newNext;
   }
   
   public void print()
   {
       data.print();
   }
}
   