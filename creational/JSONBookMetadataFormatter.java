package creational;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.ArrayList;
import java.util.List;

public class JSONBookMetadataFormatter implements BookMetadataFormatter {

    private BOOKS jsonBooks;
    private List<JSONBook> books;

    public JSONBookMetadataFormatter() {
        books = new ArrayList<>();
    }


    @Override
    public BookMetadataFormatter reset() {
        books.clear();
        return this;
    }

    @Override
    public BookMetadataFormatter append(Book b) {
        JSONBook book = new JSONBook();
        book.setISBN(b.getISBN());
        book.setTitle(b.getTitle());
        book.setPublisher(b.getPublisher());
        book.setAuthors(List.of(b.getAuthors()));
        books.add(book);
        return this;
    }

    @Override
    public String getMetadataString() {

        jsonBooks = new BOOKS();
        jsonBooks.setBooks(books);
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(jsonBooks);
        return json;
    }
}

class BOOKS {
    private List<JSONBook> books;

    public void setBooks(List<JSONBook> books) {
        this.books = books;
    }
}
class JSONBook {
    private String ISBN;
    private String title;
    private String publisher;
    private List<String> authors = new ArrayList<>();

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public List<String> getAuthors() {
        return authors;
    }

    public void setAuthors(List<String> authors) {
        this.authors = authors;
    }
}
