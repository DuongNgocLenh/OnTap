package ntu.duongngoclenh.ontap_listview_danhba;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

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
        EditText timkiem = findViewById(R.id.TimKiem);
        ListView danhba = findViewById(R.id.danhba);
        ArrayList<String> ds = new ArrayList<String>();
        ds.add("Dương Ngọc Lệnh");
        ds.add("Nguyễn Hữu Hoài");
        ds.add("Bùi Lê Đăng Khoa");
        ds.add("Bùi Thanh Pháp");
        ds.add("Nguyễn Khánh Như");
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,ds);
        danhba.setAdapter(adapter);
        danhba.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String value = adapter.getItem(position);
                if(value.equals("Dương Ngọc Lệnh")){
                    Toast.makeText(MainActivity.this,"Đây là chủ danh bạ",Toast.LENGTH_SHORT).show();
                }else if(value.equals("Nguyễn Hữu Hooài")){
                    Toast.makeText(MainActivity.this,"Đây là con bìm bịp",Toast.LENGTH_SHORT).show();
                }else if (value.equals("Bùi Lê Đăng Khoa")){
                    Toast.makeText(MainActivity.this,"Đây là bạn đúp học",Toast.LENGTH_SHORT).show();
                }else if(value.equals("Bùi Thanh Pháp")){
                    Toast.makeText(MainActivity.this,"Đây là thanh niên nghiêm túc của năm",Toast.LENGTH_SHORT).show();
                } else if (value.equals("Nguyễn Khánh Như")) {
                    Toast.makeText(MainActivity.this,"Đây là bạn lười",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}