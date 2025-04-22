package ntu.duongngoclenh.luyentaplan3;

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
        ListView danhba = findViewById(R.id.lvdanhba);
        ArrayList<String> dulieu = new ArrayList<String>();
        dulieu.add("Dương Ngọc Lệnh");
        dulieu.add("Bùi Thanh Pháp");
        dulieu.add("Bùi Lê Đăng Khoa");
        dulieu.add("Nguyễn Hữu Hoài");
        dulieu.add("Nguyễn Khánh Như");
        dulieu.add("Thông tin chủ danh bạ");
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,dulieu);
        danhba.setAdapter(adapter);
        danhba.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String giatri = adapter.getItem(position);
                if(giatri.equals("Dương Ngọc Lệnh")){
                    Toast.makeText(Cau2.this,"Đây là chủ danh bạ",Toast.LENGTH_SHORT).show();
                }else if(giatri.equals("Bùi Thanh Pháp")){
                    Toast.makeText(Cau2.this,"Đây là thanh niên nghiêm túc",Toast.LENGTH_SHORT).show();
                }else if(giatri.equals("Bùi Lê Đăng Khoa")){
                    Toast.makeText(Cau2.this,"Đây là bạn Khoa",Toast.LENGTH_SHORT).show();
                }else if(giatri.equals("Nguyễn Hữu Hoài")){
                    Toast.makeText(Cau2.this,"Đây là con bìm bịp",Toast.LENGTH_SHORT).show();
                }else if(giatri.equals("Nguyễn Khánh Như")){
                    Toast.makeText(Cau2.this,"Đây là bạn lười",Toast.LENGTH_SHORT).show();
                }else if(giatri.equals("Thông tin chủ danh bạ")){
                    Intent thongtin = new Intent(Cau2.this, Cau3.class);
                    startActivity(thongtin);
                }
            }
        });
    }
}