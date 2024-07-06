package ISP;

import ISP.Ejemplo2.CancionCaset;
import ISP.Ejemplo2.CancionCd;
import ISP.Ejemplo2.CancionPlataforma;
import ISP.Ejemplo2.CancionVinilo;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        CancionPlataforma cancion1 = new CancionPlataforma();
        cancion1.reproducir();
        CancionCd cd = new CancionCd();
        cd.girar();
        CancionVinilo vinilo = new CancionVinilo();
        vinilo.bajarAguja();
        CancionCaset caset = new CancionCaset();
        caset.rebobinar();

        List<CancionPlataforma> list = new ArrayList<>();
        list.iterator();
        list.size();
        list.isEmpty();
        list.toArray();
    }
}
