public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Lev", "TolstoyW");
        System.out.println(author1);
        Book book1 = new Book("Война и мир", author1, 1900);
        System.out.println(book1);



    }
}