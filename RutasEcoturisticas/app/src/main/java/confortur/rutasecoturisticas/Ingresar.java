package confortur.rutasecoturisticas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Ingresar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ingresar);

        Button btn_ingresar = (Button) findViewById(R.id.btn_ingresar);

        btn_ingresar.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {

                Ingresar.this.startActivity(new Intent(Ingresar.this, Menu.class));
                finish();
            }
        });

        Button btn_registrar = (Button) findViewById(R.id.btn_registrar);

        btn_registrar.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {

                Ingresar.this.startActivity(new Intent(Ingresar.this, Registrar.class));
                finish();
            }
        });
    }
}
