package rohit.maurya.customalertdialog;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.widget.Toast;

import com.github.vignesh_iopex.confirmdialog.Confirm;
import com.github.vignesh_iopex.confirmdialog.Dialog;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Confirm.using(MainActivity.this).ask("Fire missles?").onPositive("Yes", new Dialog.OnClickListener() {
                    @Override public void onClick(Dialog dialog, int which) {
                        Toast.makeText(MainActivity.this, "On yes is clicked.", Toast.LENGTH_SHORT).show();
                    }}).onNegative("No",  new Dialog.OnClickListener() {
                    @Override public void onClick(Dialog dialog, int which) {
                        Toast.makeText(MainActivity.this, "On no is clicked.", Toast.LENGTH_SHORT).show();
                    }}).build().show();
            }
        },3210);
    }
}
