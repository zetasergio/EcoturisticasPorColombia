package confortur.rutasecoturisticas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class Playa extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playa);

        Button btn_volver = (Button) findViewById(R.id.btn_volver);
        Button btn_cotizar = (Button) findViewById(R.id.btn_cotizar);

        btn_volver.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {

                Playa.this.startActivity(new Intent(Playa.this, Lugares.class));
                finish();
            }
        });

        btn_cotizar.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {

                Playa.this.startActivity(new Intent(Playa.this, Cotizar.class));
                finish();
            }
        });

    }
}