package tapas.example.com.imagineair;

/**
 * Created by TickClick on 25/10/2014 for the FinappsParty
 */

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

public class CustomlistAdapter extends ArrayAdapter{

        String[] color_names;
        Integer[] image_id;
        Context context;

    public CustomlistAdapter(Activity context,Integer[] image_id, String[] text){
        super(context, R.layout.list_row, text);
        this.color_names = text;
        this.image_id = image_id;
        this.context = context;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context
        .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View single_row = inflater.inflate(R.layout.list_row, null,
        true);
        ImageView imageView = (ImageView) single_row.findViewById(R.id.imageView);
        imageView.setImageResource(image_id[position]);
        return single_row;
    }
}