package KharkivPublishing;

import Interfaces.Poster;

public class KharkivPoster implements Poster {
    public void posterInfo() {
        System.out.println("Kharkiv "+name+", "+yearPublishing);
    }
}
