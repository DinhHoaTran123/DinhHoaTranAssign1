
package dinh.tran.n01354661;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class DinhActivity extends AppCompatActivity {
    Button button1;
    Button mybutton_id;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       button1 = findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener(){
        @Override
            public  void onClick(View view) {

                Toast.makeText(DinhActivity.this,"DinhHoaTran - PhanMinhAnh",Toast.LENGTH_LONG).show();
                //Website
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/"));
            }
        });
    }
}