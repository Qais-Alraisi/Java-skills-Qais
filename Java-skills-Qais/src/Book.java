public class Book {
    protected String _title;
    protected String _author;
    protected int _pages;
    protected boolean _isAvailable = true;

    public Book(String title, String author, int pages, boolean isAvailable) {
        _title = title;
        _author = author;
        _pages = pages;
        _isAvailable = isAvailable;
    }

    public void borrowBook(){
        if (_isAvailable){
            _isAvailable = false;
            System.out.println(_title +" has been borrowed.");
        } else {
            System.out.println(_title +" has been borrowed.");
        }
    }

    public void returnBook(){
        _isAvailable = true;
        System.out.println(_title +" has been returned.");
    }

    public void displayInfo(){
        System.out.println("Title: " + _title);
        System.out.println("Author: " + _author);
        System.out.println("Pages: " + _pages);
        System.out.println("Available: " + _isAvailable);
    }

    public String getTitle() {
        return _title;
    }

    public String getAuthor() {
        return _author;
    }
    public int getPages() {
        return _pages;
    }

    public boolean isAvailable() {
        return _isAvailable;
    }

}
