fun main() {
    val library = Library()

    //Manually Adding books to the library
    library.addABook(Book("Maa", "Anisur Rahman"))
    library.addABook(Book("Himu", "Humayun Ahmed"))
    library.addABook(Book("Bhoy", "Humayun Ahmed"))

    // Display available books
    library.BooksForDisplay()

    // Borrow a book

    library.BooksForBorrow("maa")
    library.BooksForDisplay()
//
    // Return a book
    library.returnBook("Maa")
    library.BooksForDisplay()
}