package KyivPublishing;

import Interfaces.Magazine;

public class KyivMagazine implements Magazine {
    @Override
    public void magazineInfo() {
        System.out.println("Kyiv "+name+", "+yearPublishing);
    }
}
