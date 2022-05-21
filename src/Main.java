public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Lev", "TolstoyW");
        Author author2 = new Author("Alexandr", "Pushkin");


        Book book1 = new Book("Война и мир", author1, 1900);
        Book book2 = new Book("У лукоморья", author2, 1901);

        book2.setYear(1902);


    }
}