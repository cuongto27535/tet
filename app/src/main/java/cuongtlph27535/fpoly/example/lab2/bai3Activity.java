package cuongtlph27535.fpoly.example.lab2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class bai3Activity extends AppCompatActivity {
EditText ma;
Button btn;
Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai3);
        btn=findViewById(R.id.btn_ktra);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ma=findViewById(R.id.ed_ma);
                Bundle bundle = new Bundle();
                bundle.putString("ma",ma.getText().toString());
                intent = new Intent(bai3Activity.this,Brodca3.class);
                intent.putExtra("o",bundle);
                sendBroadcast(intent);
            }
        });
    }
}