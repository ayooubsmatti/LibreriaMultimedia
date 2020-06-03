package es.ua.dccia.multimedia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    Button botonCancelar,botonAcceder;
    TextView registrarTextIntent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        botonAcceder = findViewById(R.id.acceder_button);
        botonAcceder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast toast = Toast.makeText(LoginActivity.this,
//                        "Funcion sin implementar todavia", Toast.LENGTH_SHORT);
//                toast.show();

                Intent intent = new Intent(getApplicationContext(), PrincipalActivity.class);
                startActivity(intent);

            }
        });

        botonCancelar = findViewById(R.id.cancelar_button);
        botonCancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               finish();
            }
        });


        registrarTextIntent = findViewById(R.id.registrar_text_intent);
        registrarTextIntent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), RegistroActivity.class);
                startActivity(intent);
            }
        });


    }
}