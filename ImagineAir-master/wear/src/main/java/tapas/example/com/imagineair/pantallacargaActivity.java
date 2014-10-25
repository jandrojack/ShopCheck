package tapas.example.com.imagineair;

/**
 * Created by TickClick on 25/10/2014 for the FinappsParty
 */

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import java.util.Timer;
import java.util.TimerTask;

public class pantallacargaActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.pantallacarga);

        TimerTask task = new TimerTask() {
            @Override
            public void run() {

                Intent mainIntent = new Intent().setClass(
                        pantallacargaActivity.this, MainActivity.class);
                startActivity(mainIntent);

                // Cerramos la actividad para que el usuario no pueda
                // volver a ella presionando el boton Atras
                finish();
            }
        };

        // Simulación de un proceso de carga largo al iniciar la aplicación.
        Timer timer = new Timer();
        timer.schedule(task, 3000);
    }
}
