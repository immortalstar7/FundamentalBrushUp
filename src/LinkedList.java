public class LinkedList {
    
    public static void main(String[] args) {
         LinkedList linkedList = new LinkedList();        
         linkedList.addElement( new LinkedList.Node("1"));
         linkedList.addElement( new LinkedList.Node("2"));
         linkedList.addElement( new LinkedList.Node("3"));
         linkedList.addElement( new LinkedList.Node("4"));
         linkedList.addElement( new LinkedList.Node("5"));
         linkedList.addElement( new LinkedList.Node("6"));
         linkedList.addElement( new LinkedList.Node("7"));
         linkedList.addElement( new LinkedList.Node("8"));
         linkedList.addElement( new LinkedList.Node("9"));
         linkedList.addElement( new LinkedList.Node("10"));
         linkedList.addElement( new LinkedList.Node("11"));
         
         
         printMiddleElement(linkedList);
    }
 
    private static void printMiddleElement(LinkedList linkedList) {
        
        
    LinkedList.Node slowPointer = linkedList.getHeaderElement();
    LinkedList.Node fastPointer = linkedList.getHeaderElement();
     
    if(linkedList!=null){
            
      while (fastPointer != null && fastPointer.next() != null)
      {
             fastPointer = fastPointer.next().next();
            slowPointer = slowPointer.next();
      }
            
    System.out.println("Middle element of linked list is " + slowPointer.value());
            
    }
 }    
 
}
class LinkedList{
    private Node headerElement;
    private Node tailorElement;
  
    public LinkedList(){
        this.headerElement = new Node("HeaderElement");
        tailorElement = headerElement;
    }
  
    public Node getHeaderElement(){
        return headerElement;
    }
  
    public void addElement(Node node){
        tailorElement.next = node;
        tailorElement = node;
    }
  
  
    public static class Node{
        private Node next;
        private String value;
 
        public Node(String value){
            this.value = value;
        }
      
        public String value() {
            return value;
        }
 
        public Node next() {
            return next;
        }
      
        public String toString(){
            return this.value;
        }
    }
}
 