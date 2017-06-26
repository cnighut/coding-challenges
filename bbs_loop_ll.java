/*Complete The function
Node is as follows:
class Node {
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}*/
class GfG{
	  int removeTheLoop(Node node) {
//add code here.

        Node ptr1 = node;
        Node ptr2 = node.next;
        
        
        while(ptr2 != null && ptr2.next != null){
            
            if(ptr1 == ptr2){
                break;
            }
            
            ptr1 = ptr1.next;
            ptr2 = ptr2.next.next;
        }
        
       
         if(ptr1 == ptr2){
              ptr1 = node;
         while(ptr2.next != ptr1){
	            ptr1 = ptr1.next;
	            ptr2 = ptr2.next;
	        }
		 //System.out.println("h3");
	        ptr2.next = null;
	        return 1;
         }return 0;
}
}
