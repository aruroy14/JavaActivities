package activities;

public class MyBook extends Book{
public void  setTitle(String titleValue)
{
 title=titleValue;	
}

public static void main(String args[])
{
	String title = "Book Title";
	MyBook newNovel = new MyBook();
	newNovel.setTitle(title);
	System.out.println("Title= "+newNovel.getTitle());
}
}
