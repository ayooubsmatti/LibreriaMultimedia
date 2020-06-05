package es.ua.dccia.multimedia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class PrincipalActivity extends AppCompatActivity {
    TextView texto_texto;
    Button loginActivityButton,aboutActivityButton;
    ListView listView;
    MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

//        texto_texto = findViewById(R.id.texto);
//        texto_texto.append(" * Actividad creada * ");

        loginActivityButton = findViewById(R.id.login_activity_button);
        loginActivityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
                startActivity(intent);
            }
        });

        aboutActivityButton = findViewById(R.id.acerca_activity_button);
        aboutActivityButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), AboutActivity.class);
                startActivity(intent);
            }
        });


        final List<Medio> medioList = inicializaMedios();
        MedioAdapter medioAdapter = new MedioAdapter(this, (ArrayList<Medio>) medioList);

        // Get a reference to the ListView, and attach the adapter to the listView.
        listView = (ListView)findViewById(R.id.listview_medio);
        listView.setAdapter(medioAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Medio m = medioList.get(position);


                Intent i = new Intent(getApplicationContext(), ReproductorActivity.class);
                i.putExtra(ReproductorActivity.EXTRA_TITULO, m.getTitulo());
                i.putExtra(ReproductorActivity.EXTRA_AUTOR, m.getAutor());
                i.putExtra(ReproductorActivity.EXTRA_VIDEO,m.getmVideoResourceId());
                startActivity(i);
            }
        });

        mp = MediaPlayer.create(this, R.raw.music);

    }


    @Override
    protected void onStart() {
        super.onStart();
        mp.start();
    }

    @Override
    protected void onPause() {
        super.onPause();
        mp.pause();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mp.release();
    }

    private List<Medio> inicializaMedios() {
        List<Medio> medios = new ArrayList<Medio>();
        medios.add(new Medio("Nebraska", "Alexander Payne",R.drawable.logo_hdpi,R.raw.videoone));
        medios.add(new Medio("El Lobo de Wall Street", "Martin Scorsese",R.drawable.logo_hdpi,R.raw.videotwo));
        medios.add(new Medio("A proposito de Llewyn Davis", "Joel & Ethan Coen",R.drawable.logo_hdpi,R.raw.videothree));
        medios.add(new Medio("La Gran Estafa Americana", "David O. Russell",R.drawable.logo_hdpi,R.raw.videofour));
        return medios;
    }

}
