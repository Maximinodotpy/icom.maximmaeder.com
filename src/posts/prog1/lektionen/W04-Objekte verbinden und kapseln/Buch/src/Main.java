void main() {
    Book hobbit = new Book("The Hobbit", null, 0);
    hobbit.setAuthor("J. R. R. Tolkien");
    hobbit.setPageCount(275);
    IO.println(hobbit.getName() + " wurde von " + hobbit.getAuthor() + " geschrieben.");
    IO.println("Es enthält " + hobbit.getPageCount() + " Seiten");
    IO.println();
    Book javaBook = new Book("Building Java Programs", "S. Reges & M. Stepp", 1204);
    IO.println(javaBook.format());
}
