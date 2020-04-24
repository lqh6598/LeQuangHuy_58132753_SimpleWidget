package vn.edu.ntu.lequanghuy_58132753_simplewidget;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edtTen, edtNgaysinh,edtSothich;
    RadioGroup rgGioitinh;
    CheckBox cbXemphim, cbNghenhac,cbDicafe,cbOnha,cbNauan;
    Button btXacnhan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addView();
        addEvent();
    }

    private void addView() {
    edtTen = findViewById(R.id.edtTen);
    edtNgaysinh = findViewById(R.id.edtNgaysinh);
    edtSothich = findViewById(R.id.edtSothich);
    rgGioitinh = findViewById(R.id.rgGioitinh);
    cbXemphim = findViewById(R.id.cbXemphim);
    cbNghenhac = findViewById(R.id.cbNghenhac);
    cbDicafe = findViewById(R.id.cbDicafe);
    cbOnha = findViewById(R.id.cbOnha);
    cbNauan = findViewById(R.id.cbNauan);
    btXacnhan = findViewById(R.id.btXacnhan);
    }

    private void addEvent() {
        btXacnhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Xacnhan();
            }
        });
    }

    private void Xacnhan() {
        try{
            String info =edtTen.getText().toString()+"\nNgày sinh: "+edtNgaysinh.getText().toString()+"\n";
            switch (rgGioitinh.getCheckedRadioButtonId()){
                case R.id.rbNam:
                    info += "Giới tính: Nam\n";
                            break;
                case R.id.rbNu:
                    info += "Giới tính: Nữ\n";
                            break;
            }
            info +="Sở thích: ";
            if(cbXemphim.isChecked()){
                info +=cbXemphim.getText().toString()+";";
            }
            if(cbNghenhac.isChecked()){
                info +=cbNghenhac.getText().toString()+";";
            }
            if(cbDicafe.isChecked()){
                info +=cbDicafe.getText().toString()+";";
            }
            if(cbOnha.isChecked()){
                info += cbOnha.getText().toString()+";";
            }
            if(cbNauan.isChecked()){
                info +=cbNauan.getText().toString()+";";
            }
            info += edtSothich.getText().toString();
            Toast.makeText(getApplicationContext(),info,Toast.LENGTH_SHORT).show();


        }catch (Exception e){
            Toast.makeText(getApplicationContext(),"Lỗi",Toast.LENGTH_SHORT).show();
        }

    }
}
