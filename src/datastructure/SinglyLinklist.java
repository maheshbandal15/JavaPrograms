package datastructure;
class Node
{
	private int data;
	private Node link;
	Node()
	{
		this.data=0;
		this.link=null;
	}
	Node(int data, Node link)
	{
		this.data=data;
		this.link=link;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public Node getLink() {
		return link;
	}
	public void setLink(Node link) {
		this.link = link;
	}
}

class linklist
{
	private Node head,tail;
	public linklist()
	{
		this.head=null;
		this.tail=null;
	}
	public boolean isEmpty()
	{
		return head==null;
	}
	public void addNode(int val)
	{
		Node temp= new Node(val,null);
		if(isEmpty())
		{
			head=temp;
			tail=temp;
		}
		else
		{
			tail.setLink(temp);
			tail=temp;
		}
	}
	public void display()
	{
		Node temp=head;
		while(temp.getLink()!=null)
		{
			System.out.print(temp.getData()+"->");
			temp=temp.getLink();
		}
		System.out.println(temp.getData()+"->");
	}
	public boolean delete(int val)
	{
		Node temp=head,old=head;
		while(temp.getData()!=val)
		{
			if(null==temp.getLink())
				break;
			old=temp;
			temp=temp.getLink();
			
		}
		if(temp.getData()==val)
		{
			if(temp==head)
				head=temp.getLink();
			else
			old.setLink(temp.getLink());
			return true;
		}
		else
		{
			return false;
		}
		
	}
}
public class SinglyLinklist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		linklist list= new linklist();
		list.addNode(1);
		list.addNode(2);
		list.addNode(3);
		list.addNode(4);
		list.display();
		list.delete(3);
		list.display();
		
//		String str= new String("Mahesh");
		
	}

}
