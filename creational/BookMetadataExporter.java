package creational;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public abstract class BookMetadataExporter extends BookCollection {
    private BookMetadataFormatter bookMetadataFormatter;

    public void export(PrintStream stream) {
       bookMetadataFormatter = getBookMetadataFormatter();
       for (Book book : this.books) {
           bookMetadataFormatter.append(book);
       }
        String BookMetadata =  bookMetadataFormatter.getMetadataString();
//        stream.println(BookMetadata);
        File file = new File("Export-Data.txt");
        try {
            stream = new PrintStream(file);
            stream.println(BookMetadata);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }


    public abstract BookMetadataFormatter getBookMetadataFormatter();
}
