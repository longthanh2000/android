package com.example.baikiemtra2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    EditText XA,YA, XB, YB, XC, YC;
    Button cal;
    TextView chuvi, dientich;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        XA = (EditText) findViewById(R.id.XA);
        YA = (EditText) findViewById(R.id.YA);
        XB = (EditText) findViewById(R.id.XB);
        YB = (EditText) findViewById(R.id.YB);
        XC = (EditText) findViewById(R.id.XC);
        YC = (EditText) findViewById(R.id.YC);
        cal = (Button) findViewById(R.id.cal);
        chuvi = (TextView) findViewById(R.id.chuvi);
        dientich = (TextView) findViewById(R.id.dientich);

        cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Xa = XA.getText().toString();
                String Ya = YA.getText().toString();
                String Xb = XB.getText().toString();
                String Yb = YB.getText().toString();
                String Xc = XC.getText().toString();
                String Yc = YC.getText().toString();
                if(Xa.isEmpty() | Ya.isEmpty() | Xb.isEmpty() | Yb.isEmpty() | Xc.isEmpty() | Yc.isEmpty()){
                    Toast.makeText(MainActivity.this, "Bạn chưa nhập đầy đủ thông tin toạ độ", Toast.LENGTH_SHORT).show();
                }
                else {
                    Double xa = Double.parseDouble(Xa);
                    Double ya = Double.parseDouble(Ya);
                    Double xb = Double.parseDouble(Xb);
                    Double yb = Double.parseDouble(Yb);
                    Double xc = Double.parseDouble(Xc);
                    Double yc = Double.parseDouble(Yc);

                    diem diemA = new diem(xa,ya);
                    diem diemB = new diem(xb,yb);
                    diem diemC = new diem(xc,yc);

                    tamgiac tg = new tamgiac(diemA, diemB, diemC);

                    chuvi.setText(tg.chuvi()+ "");
                    dientich.setText(tg.dientich() + "");

                }
            }
        });

    }
}