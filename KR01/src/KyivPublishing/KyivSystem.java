package KyivPublishing;

import Interfaces.Book;
import Interfaces.Magazine;
import Interfaces.Poster;

public class KyivSystem {
    public static void main(String[] args) {
        KyivFactory kyivFactory = new KyivFactory();
        Book book = kyivFactory.getBook();
        Magazine magazine = kyivFactory.getMagazine();
        Poster poster = kyivFactory.getPoster();

        book.bookInfo();
        magazine.magazineInfo();
        poster.posterInfo();
    }
}
