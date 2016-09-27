package app.orion.com.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button b1,b2,b3,b4,b5,b6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = (Button) findViewById(R.id.popular_movies_btn);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "This Button Will Launch Popular Movies App", Toast.LENGTH_SHORT).show();
            }
        });
        b2 = (Button) findViewById(R.id.stock_hawk_btn);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "This Button Will Launch Stock Hawk App", Toast.LENGTH_SHORT).show();
            }
        });
        b3 = (Button) findViewById(R.id.build_it_bigger_btn);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "This Button Will Launch Build it Bigger App", Toast.LENGTH_SHORT).show();
            }
        });
        b4 = (Button) findViewById(R.id.material_btn);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "This Button Will Launch Material App", Toast.LENGTH_SHORT).show();
            }
        });
        b5 = (Button) findViewById(R.id.ubiquitous_btn);
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "This Button Will Launch Go Ubiquitous App", Toast.LENGTH_SHORT).show();
            }
        });
        b6 = (Button) findViewById(R.id.capstone_btn);
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "This Button Will Launch Capstone  App", Toast.LENGTH_SHORT).show();
            }
        });
    }

}
