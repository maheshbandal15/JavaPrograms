package datastructure;

class DNode
{
	private int data;
	private DNode pre;
	private DNode next;	
	public DNode(int data, DNode pre, DNode next) {
		super();
		this.data = data;
		this.pre = pre;
		this.next = next;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public DNode getPre() {
		return pre;
	}
	public void setPre(DNode pre) {
		this.pre = pre;
	}
	public DNode getNext() {
		return next;
	}
	public void setNext(DNode next) {
		this.next = next;
	}
}
class doublylinklist1
{
	private DNode head,tail;
	public doublylinklist1() {
		head=null;
		tail=null;
	}
	public boolean isEmpty()
	{
		return head==null;
	}
	public void addNode(int val)
	{
		DNode temp= new DNode(val,tail,head);
		if(isEmpty())
		{
			head=temp;
			tail=temp;
		}
		else
		{
//			tail.setPre(tail);
			tail.setNext(temp);
			tail=temp;
//			head.setPre(temp);
		}
		
	}
	public void display()
	{
		DNode temp=head;
		
		while(temp.getNext()!=head)
		{
			System.out.print(temp.getData()+"->");
			temp=temp.getNext();
		}
		System.out.println(temp.getData()+"->");
	}
	public void reverseDisp()
	{
		DNode temp=tail;
		while(temp.getPre()!=null)
		{
			System.out.print(temp.getData()+"->");
			temp=temp.getPre();
		}
		System.out.println(temp.getData()+"->");
	}
}
public class DoublyLinklist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		doublylinklist1 list= new doublylinklist1();
		list.addNode(1);
		list.addNode(2);
		list.addNode(3);
		list.addNode(4);
		list.display();
		list.reverseDisp();
//		list.delete(3);
//		list.display();
	}

}
