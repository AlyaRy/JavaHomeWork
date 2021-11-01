package com.pb.ryzhuk.HW5;
public class Library {
    public static void main(String[] args) {

        Book[] books = new Book[3];
        books[1] = new Book("Ворота Європи", "Сергій Плохий", 2014);
        books[2] = new Book("Сучасна теорія грошей", "Рандал Рей", 2012 );
        books[3] = new Book("капітал в 21 сторіччі", "Тома Пікетті", 2013);

        Reader[] readers = new Reader[3];
        readers[1] = new Reader("Рижук А.М.", 20022, "історична ",
                "28/05/01", "+380964046921");
        readers[2] = new Reader("Рижук Д.М.", 20023, "Економічна",
                "18/08/07", "+380975286727");
        readers[3] = new Reader("Рижук Л.В.", 19875, "Економічна",
                "03/11/83", "+380983175406");

        // вывод всех книг и читателей
        System.out.println("Книги: ");
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i].getBookInfo());
        }
        System.out.println("\nЧитачі: ");
        for (int i = 0; i < readers.length; i++) {
            System.out.println(readers[i].getReaderInfo());
        }
        // takeBook()
        System.out.println();
        readers[0].takeBook();
        readers[0].takeBook("Ворота Європи", "Сучасна теорія грошей", "Капітал в 21 сторіччі");
        readers[0].takeBook(books[1], books[2], books[3]);
        // returnBook()
        System.out.println();
        readers[0].returnBook();
        readers[0].returnBook("Ворота Європи", "Сучасна теорія грошей", "Капітал в 21 сторіччі");
        readers[2].returnBook(books[1], books[2], books[3]);
    }
}