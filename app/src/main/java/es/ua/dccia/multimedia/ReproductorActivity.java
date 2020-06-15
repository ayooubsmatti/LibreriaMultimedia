package es.ua.dccia.multimedia;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

public class ReproductorActivity extends AppCompatActivity {
    public static final String EXTRA_TITULO = "titulo";
    public static final String EXTRA_AUTOR = "autor";
    public static final String EXTRA_VIDEO = "mVideoResourceId";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reproductor);

        TextView tvTitulo = (TextView)findViewById(R.id.titulo_text_reproducer);
        tvTitulo.setText(getIntent().getStringExtra(EXTRA_TITULO));
        TextView tvAutor = (TextView)findViewById(R.id.autor_text_reproducer);
        tvAutor.setText(getIntent().getStringExtra(EXTRA_AUTOR));
        String titulo = (String) tvTitulo.getText();

        VideoView videoView = (VideoView) findViewById(R.id.video_view);
        int videoUrlId = 0;
        if (titulo.equals("Nebraska")){
            videoUrlId= R.raw.videoone;
        }else if (titulo.equals("El Lobo de Wall Street")){
            videoUrlId= R.raw.videotwo;
        }else if (titulo.equals("A proposito de Llewyn Davis")){
            videoUrlId= R.raw.videothree;
        }else if (titulo.equals("La Gran Estafa Americana")){
            videoUrlId= R.raw.videofour;
        }

        String videoPath ="";
        videoPath = "android.resource://"+ getPackageName() +"/" + videoUrlId;
        Log.v("vedioayoub",""+ videoUrlId);
        Uri uri = Uri.parse(videoPath);
        videoView.setVideoURI(uri);
        MediaController mediaController  = new MediaController(this);
        videoView.setMediaController(mediaController);
        mediaController.setAnchorView(videoView);
    }
}