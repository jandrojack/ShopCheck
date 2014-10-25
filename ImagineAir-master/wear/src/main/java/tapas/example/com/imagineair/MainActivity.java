package tapas.example.com.imagineair;

/**
 * Created by TickClick on 25/10/2014 for the FinappsParty
 */

import android.os.Bundle;
import android.content.Intent;
import android.support.wearable.activity.InsetActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;


public class MainActivity extends InsetActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }
    @Override
    public void onReadyForContent() {

        LayoutInflater inflater = (LayoutInflater) this.getSystemService(LAYOUT_INFLATER_SERVICE);
        View myView  = inflater.inflate(R.layout.rect_activity_my, null);



        setContentView(myView);
        String[] values = new String[]{
                "MODA",
                "OCIO",
                "TECNOLOGIA",
                "GASTRONOMIA"
        };

        Integer [] images = new Integer[]{
                R.drawable.moda,
                R.drawable.ocio,
                R.drawable.tecnologia,
                R.drawable.gastronomia
        };

        CustomlistAdapter adapter = new CustomlistAdapter(this, images, values);
        ListView lv = (ListView) findViewById(R.id.actionsListView);
        lv.setAdapter(adapter);

            lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                String itemValue = (String) listView.getItemAtPosition(position);
                // Show Alert
                if (position == 0) {
                    Intent modaIntent = new Intent(MainActivity.this, ModaIntent.class);
                    MainActivity.this.startActivity(modaIntent);
                } else if (position == 1) {
                    Intent ocioIntent = new Intent(MainActivity.this, OcioIntent.class);
                    MainActivity.this.startActivity(ocioIntent);
                }else if (position == 2) {
                    Intent tecnologiaIntent = new Intent(MainActivity.this, TecnologiaIntent.class);
                    MainActivity.this.startActivity(tecnologiaIntent);
                }else if (position == 3) {
                    Intent gastronomiaIntent = new Intent(MainActivity.this, GastronomiaIntent.class);
                    MainActivity.this.startActivity(gastronomiaIntent);
                }
            }
        });
    }
}