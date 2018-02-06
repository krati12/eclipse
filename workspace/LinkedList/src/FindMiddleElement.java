import java.util.HashSet;

public class FindMiddleElement {
	static Node head;
	public void push(int data){
		Node node = new Node(data);
		node.next = head;
		head = node;
				
		
	}
	public void printmiddle(){
		Node fast = head;
		Node slow = head;
		if(head!=null){
			while(fast!=null&&fast.next!=null){
				slow = slow.next;
				fast = fast.next.next;
				
			}
			System.out.println("Middle Element"+slow.data);
			
		}
		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindMiddleElement list = new FindMiddleElement();
		list.push(55);
		list.push(44);
		list.push(33);
		list.push(22);
		list.printmiddle();
		/*Create loop for testing */
        list.head.next.next.next = list.head;
  
        if (detectLoop(head))
            System.out.println("Loop found");
        else
            System.out.println("No Loop");
		
		

	}
	private static boolean detectLoop(Node head2) {
		// TODO Auto-generated method stub
	
		HashSet<Node> set = new HashSet<Node>();
		while(head2!=null){
		
			if(set.contains(head2)){
				
				return true;
				
				
			}
			set.add(head2);
			head2= head2.next;
			
		}
		return false;
	}


}
