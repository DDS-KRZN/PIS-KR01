package KharkivPublishing;

import Interfaces.Book;

public class KharkivBook implements Book {
    public void bookInfo() {
        System.out.println("Kharkiv "+name+", "+yearPublishing);
    }
}
