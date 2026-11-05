class Book {
    int ISBN;
    String title;
    double price;

    // Parameterized Constructor
    Book(int i, String t, double p) {
        ISBN = i;
        title = t;
        price = p;
    }

    // Display book details
    void display() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {

        Book b1 = new Book(101, "Java Programming", 450);
        Book b2 = new Book(102, "Python Basics", 500);

        b1.display();

        System.out.println();

        b2.display();
    }
}