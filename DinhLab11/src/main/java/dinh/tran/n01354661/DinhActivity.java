
package dinh.tran.n01354661;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class DinhActivity extends AppCompatActivity {
    Button button1;
    private Button button2;
    EditText et;
    String st;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = findViewById(R.id.button1);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(DinhActivity.this, "DinhHoaTran - PhanMinhAnh", Toast.LENGTH_LONG).show();
                //Website
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/"));
                startActivities(new Intent[]{browserIntent});
            }
        });
        et=findViewById(R.id.edittext);

        button2 = findViewById(R.id.button2);

    button2.setOnClickListener(new View.OnClickListener()
    {
        @Override
        public void onClick(View v)
        {
            Intent i = new Intent(DinhActivity.this,TranActivity.class);
            st=et.getText().toString();
            i.putExtra("Value",st);
            startActivity(i);
            finish();
            Snackbar snackbar = Snackbar.make(v, "DinhHoaTran", Snackbar.LENGTH_LONG);
            snackbar.show();
            Intent screen2 = new Intent(DinhActivity.this, TranActivity.class);
            startActivity(screen2);
        }

    });



        }
}