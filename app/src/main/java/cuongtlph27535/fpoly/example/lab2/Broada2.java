package cuongtlph27535.fpoly.example.lab2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class Broada2 extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Bundle bundle = intent.getBundleExtra("key");
        String ten = bundle.getString("name");
        Toast.makeText(context, ten, Toast.LENGTH_SHORT).show();
    }
}
