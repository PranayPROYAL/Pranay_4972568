package Exercise2;

public class PdfDocument implements Document{
    public void open() {
        System.out.println("Opening PDF file...");
    }
    public void close() {
        System.out.println("Closing PDF file");
    }
}
