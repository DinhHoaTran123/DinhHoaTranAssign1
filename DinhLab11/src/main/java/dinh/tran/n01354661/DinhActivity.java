
package dinh.tran.n01354661;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class DinhActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       final Button button = findViewById(R.id.mybutton_id);
        button.setOnClickListener(new View.OnClickListener() {
            public <MainActivity> void onClick(View v) {

                Toast.makeText(MainActivity.this, "Hello!", Toast.LENGTH_SHORT).show();
                //Website
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/"));
            }
        });
    }
}