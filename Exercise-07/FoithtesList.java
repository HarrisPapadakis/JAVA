public class FoithtesList
{
   private Node head;
   private Node next;
   
   public FoithtesList()
   {
       this.head=null;
       this.next=null;
   }
   
   public void insert(Node newNode)
   {
       if(head != null)
       {   
          newNode.setNext(head);
          head=newNode;
       }
       else
          head=newNode;
   }
   
   public void insertAverage(Node newNode)
   {
       Node current = head;
       Node previous = null;
       if (head==null)
           head=newNode;
       else
       {
           if(head.getData().getAverage() > newNode.getData().getAverage())
           {
               newNode.setNext(head);
               head=newNode;  
           }
           else
           {
               while(current!=null && current.getData().getAverage() <= newNode.getData().getAverage())
               {
                   previous = current;
                   current=current.getNext();
               }
               if(current==null)    
                   previous.setNext(newNode);              
               else 
               {
                   if(previous == null)
                   {
                       previous = newNode;
                       newNode.setNext(current);
                   }
                   else
                   {
                       newNode.setNext(current);
                       previous.setNext(newNode);
                   }
               }
           }
       }
   } 
   public void insertAlphabetical(Node newNode)
   {
       Node current,previous;
       current = head;
       previous = null;
       if(head==null)
           head=newNode;
       else
       { 
           if(head.getData().getEpvnymo().compareTo(newNode.getData().getEpvnymo())>0)
           {
               newNode.setNext(head);
               head=newNode;
           }
           else
           {
               while(current!=null && current.getData().getEpvnymo().compareTo(newNode.getData().getEpvnymo())<=0 )
               {
                   previous=current;
                   current=current.getNext();
               }
               if(current==null) 
                   previous.setNext(newNode);
               else 
               {
                   if(previous == null)
                   {
                       previous = newNode;
                       newNode.setNext(current);
                   }
                   else
                   {    
                       newNode.setNext(current);
                       previous.setNext(newNode);
                   }
               }
           }
       }
   }
   public void print()
   {
       Node current;
       current=head;
       
       while(current!=null)
       {
       current.print();
       current=current.getNext();
       }

    }             
}