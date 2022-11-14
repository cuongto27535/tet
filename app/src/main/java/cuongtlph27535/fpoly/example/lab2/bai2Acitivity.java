package cuongtlph27535.fpoly.example.lab2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class bai2Acitivity extends AppCompatActivity {
    EditText name;
    Button btn;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai2_acitivity);

        btn=findViewById(R.id.btn2);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name = findViewById(R.id.ed_name);
                String ten = name.getText().toString();
                Bundle bundle = new Bundle();
                bundle.putString("name",ten);
                intent = new Intent(bai2Acitivity.this, Broada2.class);
                intent.putExtra("key",bundle);
                sendBroadcast(intent);
            }
        });
    }
}