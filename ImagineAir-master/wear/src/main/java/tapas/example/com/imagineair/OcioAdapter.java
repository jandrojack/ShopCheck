package tapas.example.com.imagineair;

/**
 * Created by TickClick on 25/10/2014 for the FinappsParty
 */

import android.app.Fragment;
import android.app.FragmentManager;
import android.support.wearable.view.CardFragment;
import android.support.wearable.view.FragmentGridPagerAdapter;
import android.support.wearable.view.ImageReference;

public class OcioAdapter extends FragmentGridPagerAdapter {


    public OcioAdapter(FragmentManager fm) {
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
                    new Page("Bolera","No Web", R.drawable.bolera),
                    new Page("2x1","Grupos de 5 personas, paga una partida y la segunda de regalo", R.drawable.bolera),
                    new Page("Amigos","Trae a 6 amigos, y la partida sale a mitad de precio", R.drawable.bolera),
            },
            {
                    new Page("Cines Box","www.boxcinema.net", R.drawable.cines),
                    new Page("Oferta Parejas","Entradas 2X1 en la sesion de la 01:00am", R.drawable.cines),
                    new Page("Dia del espectador","Miercoles un euro menos", R.drawable.cines),
                    new Page("Fiesta del cine","27, 28 y 29 de octubre a solo 2'90", R.drawable.cines),
            },
            {
                    new Page("FNAC","www.fnac.com", R.drawable.fnac),
                    new Page("Sin ofertas","Ahora mismo no contamos con ninguna oferta nueva", R.drawable.fnac),
            },
            {
                    new Page("Recreativos","No Web", R.drawable.recreativo),
                    new Page("10x9","La decima partida te sale gratis, y el juego que elijas", R.drawable.recreativo),
                    new Page("Lorem Ipsum","dolore sit amet", R.drawable.recreativo),
            },

    };


    @Override
    public Fragment getFragment(int row, int col) {
        Page page = PAGES[row][col];
        String title = page.getNombreTienda();
        String text = page.getDescripcion();
        int image = page.getImagen();
        CardFragment fragment = CardFragment.create(title, text, image);
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

