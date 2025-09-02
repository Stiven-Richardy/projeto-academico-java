class Book {
    private String name;
    private Author authors[];
    private double price;
    private int qty = 0;

    public String getName() { return this.name; }
    public Author[] getAuthor() { return this.authors; }
    public double getPrice() { return this.price; }
    public int getQty() { return this.qty; }

    public void setPrice(double price) { this.price = price; }
    public void setQty(int qty) { this.qty = qty; }

    public Book(String name, Author[] authors, double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
    }

    public Book(String name, Author[] authors, double price, int qty) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }

    public String toString() {
        String authorString = "";
        for (Author author : authors) {
            authorString += author.toString();
        }
        return String.format("Book[name = %s, author = %s, price = R$%f, qty = %s]", this.name, authorString, this.price, this.qty);
    }

    public String getAuthorNames() {
        String authorNames = "";
        for (Author author : authors) {
            authorNames += author.getName() + ",";
        }
        authorNames = authorNames.substring(0, authorNames.length()-1);
        return authorNames;
    }
}

