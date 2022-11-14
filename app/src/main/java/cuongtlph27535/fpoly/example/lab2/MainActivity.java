package cuongtlph27535.fpoly.example.lab2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        phanQuyen();
        Intent intent = new Intent(this,Broadca.class);
        sendBroadcast(intent);
    }
    public boolean phanQuyen(){
        if(Build.VERSION.SDK_INT >=23){
            //1. neu ca quen da dc gan thi return true
            if(checkSelfPermission(Manifest.permission.READ_PHONE_NUMBERS)== PackageManager.PERMISSION_GRANTED && checkSelfPermission(Manifest.permission.READ_PHONE_STATE)==PackageManager.PERMISSION_GRANTED){
                return true;
            }
            //2.neu ca quyen chua dc gan thif xin nguoi dung cap quyen thi return false
            else {
                ActivityCompat.requestPermissions(MainActivity.this,new String[]{Manifest.permission.READ_PHONE_NUMBERS,Manifest.permission.READ_PHONE_STATE},1);
                return false;
            }
        }
        else {
            return true;
        }
    }
}