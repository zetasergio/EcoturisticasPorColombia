package confortur.rutasecoturisticas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Lugares extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lugares);

        Button btn_playa = (Button) findViewById(R.id.btn_playa);

        btn_playa.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {

                Lugares.this.startActivity(new Intent(Lugares.this, Playa.class));
                finish();
            }
        });


    }
}
