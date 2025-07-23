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

        System.out.println("___________________________");
//task 4.2
        VisitorCounter visitor1 = new VisitorCounter("Qais");
        VisitorCounter visitor2 = new VisitorCounter("Qassim");

        visitor1.recordVisit();
        visitor2.recordVisit();

        VisitorCounter.displayTotalVisitors();


    }


}
