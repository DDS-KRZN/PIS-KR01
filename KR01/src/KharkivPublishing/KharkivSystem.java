package KharkivPublishing;

import Interfaces.Book;
import Interfaces.Magazine;
import Interfaces.Poster;
import KharkivPublishing.KharkivFactory;

public class KharkivSystem {
    public static void main(String[] args) {
        KharkivFactory kharkivFactory = new KharkivFactory();
        Book book = kharkivFactory.getBook();
        Magazine magazine = kharkivFactory.getMagazine();
        Poster poster = kharkivFactory.getPoster();

        book.bookInfo();
        magazine.magazineInfo();
        poster.posterInfo();
    }
}
