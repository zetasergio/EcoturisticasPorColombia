package confortur.rutasecoturisticas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        Button btn_cotizar = (Button) findViewById(R.id.btn_cotizar);

        btn_cotizar.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {

                Menu.this.startActivity(new Intent(Menu.this, Buscar.class));
                finish();
            }
        });

        Button btn_viajar = (Button) findViewById(R.id.btn_viajar);

        btn_viajar.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {

                Menu.this.startActivity(new Intent(Menu.this, Guiar.class));

            }
        });

    }
}
