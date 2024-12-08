public class Book {
    private String Title;
    private String Author;
    private int QuantityAvailable;

    public void Book(String title,String author, Integer quantityAvailable){
        this.Title = title;
        this.Author = author;
        this.QuantityAvailable = quantityAvailable;
    }

    public void getBook(){
        System.out.println("Nombre del libro: " +this.Title+ ", Autor: " +this.Author+ ", Cantidad disponible: " +this.QuantityAvailable );
    }

    public boolean lendBook(){
        if(QuantityAvailable >= 1){
            this.QuantityAvailable--;
        }

        return true;
    }

    public boolean returnBook(){
       this.QuantityAvailable ++;
       return true;
    }

    public String getTitle(){
        return this.Title;
    }

    public int getQuantity(){
        return this.QuantityAvailable;
    }

    public void showInfo(){

        System.out.println("Libro: "+this.Title+", Autor: "+this.Author+", cantidad disponible: "+this.QuantityAvailable);

    }

}
