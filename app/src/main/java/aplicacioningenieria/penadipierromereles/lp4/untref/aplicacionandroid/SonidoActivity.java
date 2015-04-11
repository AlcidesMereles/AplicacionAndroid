package aplicacioningenieria.penadipierromereles.lp4.untref.aplicacionandroid;

        import android.content.Intent;
        import android.os.Bundle;
        import android.support.v7.app.ActionBarActivity;
        import android.view.View;
        import android.widget.Button;

public class SonidoActivity extends ActionBarActivity {
    private Button btnRealidad;
    private Button btnAmigos;
    private Button btnPadres;
    private Button btnNovia;
    private Button btnRegresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sonido);

        /*Conecto el comportamiento de la variable con el boton de la interfaz*/
        btnAmigos = (Button)findViewById(R.id.btnAmigos);
        btnPadres = (Button)findViewById(R.id.btnPadres);
        btnNovia = (Button)findViewById(R.id.btnNovia);
        btnRealidad = (Button)findViewById(R.id.btnRealidad);
        btnRegresar = (Button)findViewById(R.id.btnRegresar);


        //Evento de CLick del boton "Tus Amigos"
        btnAmigos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Creo el intent para acceder a la Activity de la pagina "Como te ven tus amigos"
                Intent intent = new Intent(SonidoActivity.this, AmigosSonidoActivity.class);

                //Inicio la nueva Activity
                startActivity(intent);
            }
        });

        //Evento de CLick del boton "Tus Padres"
        btnPadres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Creo el intent para acceder a la Activity de la pagina "Como te ven tus padres"
                Intent intent = new Intent(SonidoActivity.this, PadresSonidoActivity.class);

                //Inicio la nueva Activity
                startActivity(intent);
            }
        });

        //Evento de CLick del boton "Tu Novia"
        btnNovia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Creo el intent para acceder a la Activity de la pagina "Como te ve tu novia"
                Intent intent = new Intent(SonidoActivity.this, NoviaSonidoActivity.class);

                //Inicio la nueva Activity
                startActivity(intent);
            }
        });

        //Evento de CLick del boton "Como te ves en realidad"
        btnRealidad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Creo el intent para acceder a la Activity de la pagina "Como te ves en realidad"
                Intent intent = new Intent(SonidoActivity.this, RealidadSonidoActivity.class);

                //Inicio la nueva Activity
                startActivity(intent);
            }
        });

        //Evento de CLick del boton Regresar
        btnRegresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Creo el intent para acceder a la Activity de la pagina principal
                Intent intent = new Intent(SonidoActivity.this, MainActivity.class);

                //Inicio la nueva Activity
                startActivity(intent);
            }
        });
    }

}

