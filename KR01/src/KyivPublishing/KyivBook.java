package KyivPublishing;

import Interfaces.Book;

public class KyivBook implements Book {
    @Override
    public void bookInfo() {
        System.out.println("Kyiv "+name+", "+yearPublishing);
    }
}
