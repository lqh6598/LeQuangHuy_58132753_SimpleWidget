package vn.edu.ntu.lequanghuy_58132753_simplewidget;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;

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
    cbDicafe = findViewById(R.id.cbXemphim);
    cbOnha = findViewById(R.id.cbOnha);
    cbNauan = findViewById(R.id.cbNauan);
    btXacnhan = findViewById(R.id.btXacnhan);
    }

    private void addEvent() {

    }
}
