import java.util.*;

class Bag<Item> implements Iterable<Item>
{
	private Node head;
	private class Node
	{
		Item data;
		Node next;
		public Node(Item data)
		{
			this.data=data;
			this.next=null;
		}
	}
	public void add(Item data)
	{
		Node temp=head;
		head=new Node(data);
		head.next=temp;
	}
	private class BagIterator implements Iterator<Item>
	{
		Node temp=head;
		public boolean hasNext()
		{
			return temp!=null;
		}
		public Item next()
		{
			Item data=temp.data;
			temp=temp.next;
			return data;
		}
		public void remove()
		{

		}
	}
	public Iterator<Item> iterator()
	{
		return new BagIterator();
	}
}

