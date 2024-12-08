public class Main {
    public static void main(String[] args){

        User juan = new User();
       juan.user("Juan");
       juan.getName();

       Book book1 = new Book();
       Book book2 = new Book();
       Book book3 = new Book();

        book1.Book("principito","Juan Bosch",3);
        book2.Book("Pepito","Joaquin balaguer",20);
        book3.Book("La mañosa","Juan bosch",3);

        book1.showInfo();

        System.out.println("---------Proceso de tomar un libro prestado----------");

        juan.takeBook(book1);

        juan.showInfo(book1);

        book1.showInfo();

        System.out.println("---------proceso de devolver libro----------");

        juan.returnBook(book1);

        book1.showInfo();

        System.out.println("---------Libros disponibles----------");

       Library library = new Library();

        library.AddBook(book1);

        library.AddBook(book2);

        library.AddBook(book3);


        library.showBookAvailable();





    }
}
