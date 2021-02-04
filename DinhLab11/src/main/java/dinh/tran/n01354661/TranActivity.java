package dinh.tran.n01354661;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.snackbar.Snackbar;

public class TranActivity extends AppCompatActivity {
    TextView tv;
    String st;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tran);
        tv = findViewById(R.id.textView2);
        st=getIntent().getExtras().getString("Value");
        tv.setText(st);
    }
    @Override
    protected void onStart()

    {
        super.onStart();

        Snackbar snackbar = Snackbar.make(findViewById(R.id.TranActivity) , "DinhHoaTran", Snackbar.LENGTH_LONG);
        snackbar.show();

    }

}