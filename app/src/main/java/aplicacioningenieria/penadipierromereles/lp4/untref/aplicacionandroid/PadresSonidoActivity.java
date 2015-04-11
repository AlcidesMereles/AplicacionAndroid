package aplicacioningenieria.penadipierromereles.lp4.untref.aplicacionandroid;

        import android.content.Intent;
        import android.os.Bundle;
        import android.support.v7.app.ActionBarActivity;
        import android.view.View;
        import android.widget.Button;


public class PadresSonidoActivity extends ActionBarActivity {

    private Button btnRegresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_padres_sonido);

        btnRegresar = (Button)findViewById(R.id.btnRegresar);

        //Evento de CLick del boton Regresar
        btnRegresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Creo el intent para acceder a la Activity de la pagina principal
                Intent intent = new Intent(PadresSonidoActivity.this, SonidoActivity.class);

                //Inicio la nueva Activity
                startActivity(intent);
            }
        });
    }
}
