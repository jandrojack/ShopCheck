package tapas.example.com.imagineair;

/**
 * Created by TickClick on 25/10/2014 for the FinappsParty
 */

import android.app.Fragment;
import android.app.FragmentManager;
import android.support.wearable.view.CardFragment;
import android.support.wearable.view.FragmentGridPagerAdapter;
import android.support.wearable.view.ImageReference;

public class ModaAdapter extends FragmentGridPagerAdapter {

    public ModaAdapter(FragmentManager fm) {
        super(fm);
    }

    static final int[][] BG_IMAGES = new int[][] {
            {
                R.drawable.shopcheck_bg,
            },
    };

    // DE NORMAL, ESTA MATRIZ SE CREA A PARTIR DE UN FICHERO EN EL SERVIDOR O UNA BASE DE DATOS.
    // PARA LAS PRUEBAS, LA CREAMOS AQUÍ
    private final Page[][] PAGES = {
            {
                    new Page("Bershka","www.bershka.com", R.drawable.bershka),
                    new Page("Batamanta gratis","Haz una compra mayor a 50 euros y te regalamos una batamanta",R.drawable.bershka),
            },
            {
                    new Page("Gucci","www.gucci.com",R.drawable.gucci),
                    new Page("Sin ofertas","Ahora mismo no disponemos de ninguna oferta nueva",R.drawable.gucci),
            },
            {
                    new Page("Mango","www.mango.com",R.drawable.mango),
                    new Page("Oferta 001","0000 0001",R.drawable.mango),
                    new Page("Oferta 010","0000 0010",R.drawable.mango),
                    new Page("Oferta 011","0000 0011",R.drawable.mango),
                    new Page("Oferta 100","0000 0100",R.drawable.mango),
            },
            {
                    new Page("Sprinter","www.sprinter.es",R.drawable.sprinter),
                    new Page("SprintXeuro","Haz un sprint y si quedas entre los 10 primeros te llevas descuento",R.drawable.sprinter),
            },
            {
                    new Page("TOUS","www.tous.com",R.drawable.tous),
                    new Page("Oferta 1","Pulsera de oro blanco por solo 492850282042 euros",R.drawable.tous),
                    new Page("Oferta 2","Pulsera de oro blanco de los chinos por 1 euro",R.drawable.tous),
            },
            {
                    new Page("Converse","www.converse.com",R.drawable.converse),
                    new Page("Outlet","Nos deshacemos del inventario viejo. Aprovecha esta inigualable oferta.",R.drawable.converse),
            },

    };

    @Override
    public Fragment getFragment(int row, int col) {
        Page page = PAGES[row][col];
        String title = page.getNombreTienda();
        String text = page.getDescripcion();
        int image = page.getImagen();
        CardFragment fragment = CardFragment.create(title, text, image);  //ESTA ES LA IMAGEN
        // Advanced settings
        fragment.setCardGravity(page.cardGravity);
        fragment.setExpansionEnabled(page.expansionEnabled);
        fragment.setExpansionDirection(page.expansionDirection);
        fragment.setExpansionFactor(page.expansionFactor);
        return fragment;
    }

    @Override
    public ImageReference getBackground(int row, int column) {
        return ImageReference.forDrawable(BG_IMAGES[0][0]);
    }

    @Override
    public int getRowCount() {
        return PAGES.length;
    }

    @Override
    public int getColumnCount(int rowNum) {
        return PAGES[rowNum].length;
    }
}

