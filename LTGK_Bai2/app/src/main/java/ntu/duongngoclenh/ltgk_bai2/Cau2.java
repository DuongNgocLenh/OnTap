package ntu.duongngoclenh.ltgk_bai2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class Cau2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_cau2);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        ListView ds = findViewById(R.id.lvds);
        ArrayList<String> dulieu = new ArrayList<String>();
        dulieu.add("Bài tập 1");
        dulieu.add("Bài tập 2");
        dulieu.add("Bài tập 3");
        dulieu.add("Bài tập 4");
        dulieu.add("Bài tập 5");
        dulieu.add("Bài tập 6");
        dulieu.add("Thông tin sinh viên");
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,dulieu);
        ds.setAdapter(adapter);
        ds.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String value = adapter.getItem(position);
                if(value.equals("Bài tập 1")){
                    Toast.makeText(Cau2.this,"10 điểm",Toast.LENGTH_SHORT).show();
                }else if(value.equals("Thông tin sinh viên")){
                    Intent thongtin = new Intent(Cau2.this,ThongTinSinhVien.class);
                    startActivity(thongtin);
                }
            }
        });

    }
}