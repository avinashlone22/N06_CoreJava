package in.bkcmet.library;

public class Library {
public String libraryName;

private long userId;
String bookName;
public void displayPublic()
{
	System.out.println("library name " +libraryName);
}
private void displayPrivate()
{
 System.out.println("user id "+userId);
}
void displayDefault()
{
	System.out.println("book name "+bookName);
}

}
