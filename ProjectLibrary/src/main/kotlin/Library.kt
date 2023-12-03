data class Book(val title: String, val author: String, var isAvailable: Boolean = true)

class Library {
    private val books = mutableListOf<Book>()

    fun addABook(book: Book) {
        books.add(book)
    }

    fun BooksForDisplay() {
        if (books.isEmpty()) {
            println("No books in the Library.")
        } else {
            println("There are Books available in the library:")
            for ((index, book) in books.withIndex()) {
                val availability = if (book.isAvailable) " Book is Available" else "Book is Not Available"
                println("${index + 1}. ${book.title} by ${book.author} - $availability")
            }
        }
    }

    fun BooksForBorrow(title: String) {
        val book = books.find { it.title.equals(title, ignoreCase = true) }
        if (book != null && book.isAvailable) {
            book.isAvailable = false
            println("'${book.title}' by ${book.author} is borrowed from the Library.")
        } else {
            println(" the book '$title' is either not available or does not exist in this the library.")
        }
    }

    fun returnBook(title: String) {
        val book = books.find { it.title.equals(title, ignoreCase = true) }
        if (book != null && !book.isAvailable) {
            book.isAvailable = true
            println("'${book.title}' by ${book.author} is returned successfully!!.")
        } else {
            println("Sorry, the book '$title' cannot be returned.")
        }
    }
}


