public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("The Hunger Games","Suzanne Collins", 192, true);
        Book book2 = new Book("Diary of a wimpy kid","Jeff Kinney",231,false);
        Textbook textbook1 = new Textbook("Calculus 1","Dr. pete",452,false,"Mathematics",3);
        book1.borrowBook();
        textbook1.borrowBook();

        book2.returnBook();

        book1.displayInfo();
        textbook1.displayInfo();

        System.out.println(book1.getPages());


    }
}
