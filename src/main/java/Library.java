import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> listBooks;

    public Library(){
        this.listBooks = new ArrayList<>();
    }

    public void AddBook(Book book){
        listBooks.add(book);
        System.out.println("El Libro: "+book.getTitle()+ " Ha sido agregado");
    }

    public void showBookAvailable(){
        System.out.println("Libros disponibles");
        for(int i=0; i < listBooks.size(); i++){
            listBooks.get(i).showInfo();
        }
    }

}
