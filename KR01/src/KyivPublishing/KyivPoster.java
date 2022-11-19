package KyivPublishing;

import Interfaces.Poster;

public class KyivPoster implements Poster {
    @Override
    public void posterInfo() {
        System.out.println("Kyiv "+name+", "+yearPublishing);
    }
}
