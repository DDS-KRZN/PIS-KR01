package KyivPublishing;

import Interfaces.Book;
import Interfaces.Magazine;
import Interfaces.Poster;
import Interfaces.PublishingFactory;
import KharkivPublishing.KharkivBook;
import KharkivPublishing.KharkivMagazine;

public class KyivFactory implements PublishingFactory {
    @Override
    public Book getBook() {
        return new KyivBook();
    }

    @Override
    public Magazine getMagazine() {
        return new KyivMagazine();
    }

    @Override
    public Poster getPoster() {
        return new KyivPoster();
    }
}
