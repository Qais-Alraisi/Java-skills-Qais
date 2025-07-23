public class Textbook extends Book{
    private String _subject;
    private int _edition;

    public Textbook(String title, String author, int pages,Boolean isAvailable, String subject, int edition) {
        super(title, author, pages, isAvailable);
        _subject = subject;
        _edition = edition;
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Subject: " + _subject);
        System.out.println("Edition: " + _edition);
    }

    public String getSubject(){
        return _subject;
    }

    public int getEdition(){
        return _edition;
    }

}
