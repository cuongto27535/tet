package cuongtlph27535.fpoly.example.lab2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import android.widget.Toast;

public class Broadca extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        //1.goi service
        TelephonyManager telephonyManager=(TelephonyManager)context.getSystemService(Context.TELEPHONY_SERVICE);
        //2.tao object lang nghe
        MyphoneState2 myphoneState2 = new MyphoneState2(context);
        //3.bat dau lang nghe

    }
    public class  MyphoneState2 extends PhoneStateListener{
        Context context;
        // ham khoi tao
        public MyphoneState2(Context context){
            this.context = context;
        }

        @Override
        public void onCallStateChanged(int state, String phoneNumber) {
            if(state ==1 ){
                Toast.makeText(context,"co cuoc goi den", Toast.LENGTH_SHORT).show();
            }
            super.onCallStateChanged(state, phoneNumber);
        }
    }
}
