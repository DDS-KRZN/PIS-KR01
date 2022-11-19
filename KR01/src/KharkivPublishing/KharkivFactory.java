package KharkivPublishing;

import Interfaces.Book;
import Interfaces.Magazine;
import Interfaces.Poster;
import Interfaces.PublishingFactory;

public class KharkivFactory implements PublishingFactory {
    @Override
    public Book getBook() {
        return new KharkivBook();
    }

    @Override
    public Magazine getMagazine() {
        return new KharkivMagazine();
    }

    @Override
    public Poster getPoster() {
        return new KharkivPoster();
    }
}
