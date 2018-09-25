package prochain.com.android_vpn;

import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }




    private void setVpn()
    {
        Settings.Secure.putString(getContentResolver(), "http_proxy", "myproxy.com:3128");
        Settings.Secure.Rest
    }
}
