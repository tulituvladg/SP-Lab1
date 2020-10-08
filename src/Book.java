import java.util.ArrayList;

public class Book {
String bookName;
String paragraph;
String image;
String table;
ArrayList<String> paragraphList=new ArrayList<>();
ArrayList<String> imageList=new ArrayList<>();
ArrayList<String> tableList=new ArrayList<>();

    public Book(String bookName)
    {
        this.bookName=bookName;
    }

    public void createNewParagraph(String paragraphName)
    {
        paragraphList.add(paragraphName);
    }

    public void createNewImage(String imageName)
    {
        imageList.add(imageName);
    }

    public void createNewTable(String tableName)
    {
        tableList.add(tableName);
    }

    public void print()
    {
        for (String tempString:paragraphList)
        {
            System.out.println(tempString);
        }

        for (String tempString:imageList)
        {
            System.out.println(tempString);
        }

        for (String tempString:tableList)
        {
            System.out.println(tempString);
        }
    }
}
