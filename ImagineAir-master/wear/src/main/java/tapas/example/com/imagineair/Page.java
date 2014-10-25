package tapas.example.com.imagineair;

/**
 * Created by TickClick on 25/10/2014 for the FinappsParty
 */

import android.support.wearable.view.CardFragment;
import android.view.Gravity;

public class Page {

    private String nombreTienda;
    private String descripcion;
    private int imagen;

    int cardGravity = Gravity.CENTER;
    boolean expansionEnabled = false;
    float expansionFactor = 1.0f;
    int expansionDirection = CardFragment.EXPAND_DOWN;

    public Page(String nombreTienda, String descripcion, int imagen) {
        this.nombreTienda = nombreTienda;
        this.descripcion = descripcion;
        this.imagen = imagen;
    }

    public String getNombreTienda() {
        return nombreTienda;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getImagen() {
        return imagen;
    }
}
