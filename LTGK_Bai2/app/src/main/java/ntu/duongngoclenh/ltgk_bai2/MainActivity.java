package ntu.duongngoclenh.ltgk_bai2;

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
        Button Cau1 = findViewById(R.id.Cau1);
        Button Cau2 = findViewById(R.id.Cau2);
        Button Cau3 = findViewById(R.id.Cau3);
        Button Cau4 = findViewById(R.id.Cau4);
        Cau1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cau1 = new Intent(MainActivity.this,Cau1.class);
                startActivity(cau1);
            }
        });
        Cau2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cau2 = new Intent(MainActivity.this,Cau2.class);
                startActivity(cau2);
            }
        });
        Cau3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cau3 = new Intent(MainActivity.this,Cau3.class);
                startActivity(cau3);
            }
        });
        Cau4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cau4 = new Intent(MainActivity.this,ThongTinSinhVien.class);
                startActivity(cau4);
            }
        });

    }
}