package cuongtlph27535.fpoly.example.lab2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class Brodca3 extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Bundle bundle = intent.getBundleExtra("o");
        String ma = bundle.getString("ma");
        if(ma.equals("MEM537128")){
            Toast.makeText(context, " Khuyến mãi 10%", Toast.LENGTH_SHORT).show();
        }else if(ma.equals("MEM537129")){
            Toast.makeText(context, " Khuyến mãi 20%", Toast.LENGTH_SHORT).show();
        }else if(ma.equals("VIP537128")){
            Toast.makeText(context, " Khuyến mãi 30%", Toast.LENGTH_SHORT).show();
        }else if(ma.equals("VIP537129")){
            Toast.makeText(context, " Khuyến mãi 50%", Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(context, "Loi ! nhap lai", Toast.LENGTH_SHORT).show();
        }
    }
}
