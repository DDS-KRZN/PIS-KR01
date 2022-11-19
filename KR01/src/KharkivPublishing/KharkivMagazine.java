package KharkivPublishing;

import Interfaces.Magazine;

public class KharkivMagazine implements Magazine {
    public void magazineInfo() {
        System.out.println("Kharkiv "+name+", "+yearPublishing);
    }
}
