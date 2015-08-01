import java.util.*;
import java.io.*;

public class Book
{
	private String name;
	private Bag<Author> authors=new Bag<Author>();
	private double price;
	private int qtyInStock;
	public Book(String name,Author[] authors,double price,int qtyInStock)
	{
		this.name=name;
		for(int i=0;i<authors.length;i++)
		{
			this.authors.add(authors[i]);
		}	
		this.price=price;
		this.qtyInStock=qtyInStock;
	}
	public Book(String name,Author author,double price,int qtyInStock)
	{
		this.authors.add(author);
	}
	public String getName()
	{
		return this.name;
	}
	public Bag<Author> getAuthors()
	{
		return this.authors;
	}
	public double getPrice()
	{
		return this.price;
	}
	public int getQtyInStock()
	{
		return this.qtyInStock;
	}
	public void setPrice(double price)
	{
		this.price=price;
	}
	public void setQtyInStock(int qtyInStock)
	{
		this.qtyInStock=qtyInStock;
	}
	public String toString()
	{
		StringBuilder br=new StringBuilder();
		br.append("[");
		br.append(this.name);
		br.append("] by ");
		for(Author a:this.authors)
		{
			br.append(a);
			br.append(',');
		}
		br.append("Price : $");
		br.append(this.price);
		br.append(" No of books available :");
		br.append(this.qtyInStock);
		return br.toString();
	}
	public void printAuthors()
	{
		for(Author a:this.authors)
		{
			System.out.println(a);
		}
	}
	public void addAuthor(Author a)
	{
		this.authors.add(a);
	}
	public static void main(String args[]) throws Exception
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the book name");
		String bkname=br.readLine();
		System.out.println("Enter the price");
		double bkprice=Double.parseDouble(br.readLine());
		System.out.println("Enter the quantity available");
		int bkqty=Integer.parseInt(br.readLine());
		System.out.println("Enter the number of authors");
		int noauthors=Integer.parseInt(br.readLine());
		Author[] authors=new Author[noauthors];
		for(int i=0;i<noauthors;i++)
		{
			System.out.printf("Enter the name of author %d\n",i+1);
			String authorname=br.readLine();
			System.out.printf("Enter the email of author %d\n",i+1);
			String email=br.readLine();
			System.out.printf("Enter the gender of author %d\n",i+1);
			char gender=(char)br.read();
			br.read();
			authors[i]=new Author(authorname,email,gender);
		}
		Book b=new Book(bkname,authors,bkprice,bkqty);
		System.out.println(b);
	}
}

