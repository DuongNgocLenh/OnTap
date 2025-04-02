package ntu.duongngoclenh.ltgk_bai2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Cau1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_cau1);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        EditText soA = findViewById(R.id.edtA);
        EditText soB = findViewById(R.id.edtB);
        EditText kq = findViewById(R.id.edtKQ);
        Button tinh = findViewById(R.id.btnTinh);

        tinh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1 = Integer.parseInt(soA.getText().toString());
                int num2 = Integer.parseInt(soB.getText().toString());
                int ketqua = num1+num2;
                kq.setText(String.valueOf(ketqua));
            }
        });
    }
}