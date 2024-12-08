import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    private List<String> lendtBooks;

    public void user(String name){
        this.name = name;
        lendtBooks = new ArrayList<>();
    }

    public void takeBook(Book book){
        if(book.lendBook()){
            lendtBooks.add(book.getTitle());
            System.out.println(this.name + " tomo prestado, el libro: "+book.getTitle());
        }else{
            System.out.println("No ha tomado este libro prestamo ");
        }
    }

    public void returnBook(Book book){
        if(lendtBooks.contains(book.getTitle())){
            book.returnBook();
            System.out.println("El usuario: "+this.name + " ha devuelto, el libro: "+book.getTitle());
        }else{
            System.out.println("El usuario: " + this.name + " aun no ha devuelto, el libro: "+book.getTitle());
        }
    }

    public void showInfo(Book book){
        System.out.println("Usuario: " + this.name + " Tiene prestado, el libro: " +book.getTitle() );
    }

    public void getName() {
        System.out.println("Usuario: "+this.name);
    }
}
