package es.ua.dccia.multimedia;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.ArrayList;

public class MedioAdapter extends ArrayAdapter<Medio> {

    private static final String LOG_TAG = MedioAdapter.class.getSimpleName();

    public MedioAdapter(Activity context, ArrayList<Medio> medios) {

        super(context, 0,medios);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;

        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.item, parent, false);
        }

        // Get the {@link AndroidFlavor} object located at this position in the list
        Medio currentMedio = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView nameTitulo = (TextView) listItemView.findViewById(R.id.titulo_text);
        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView
        nameTitulo.setText(currentMedio.getTitulo());

        TextView nameAutor = (TextView) listItemView.findViewById(R.id.autor_text);
        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView
        nameAutor.setText(currentMedio.getAutor());



//        // Find the ImageView in the list_item.xml layout with the ID list_item_icon
        ImageView iconView = (ImageView) listItemView.findViewById(R.id.list_item_icon);
        // Get the image resource ID from the current AndroidFlavor object and
        // set the image to iconView
        iconView.setImageResource(currentMedio.getmImagenResourceId());

        return listItemView;
    }

}
