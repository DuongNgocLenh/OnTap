package ntu.duongngoclenh.ltgk_bai1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        Button cau1,cau2,cau3,cau4;
        cau1 = findViewById(R.id.btn1);
        cau2 = findViewById(R.id.btn2);
        cau3 = findViewById(R.id.btn3);
        cau4 = findViewById(R.id.btn4);
        cau1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mh1 = new Intent(MainActivity.this,Cau1.class);
                startActivity(mh1);
            }
        });
        cau2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mh2 = new Intent(MainActivity.this,Cau2.class);
                startActivity(mh2);
            }
        });
        cau3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mh3 = new Intent(MainActivity.this,Cau3.class);
                startActivity(mh3);
            }
        });
        cau4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mh4 = new Intent(MainActivity.this,Cau4.class);
                startActivity(mh4);
            }
        });
    }
}