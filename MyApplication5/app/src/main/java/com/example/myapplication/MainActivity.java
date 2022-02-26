package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText so_a,so_b, so_c;
    Button tinh,xoa;
    TextView sothunhat, sothuhai;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        so_a = (EditText) findViewById(R.id.so_a);
        so_b = (EditText) findViewById(R.id.so_b);
        so_c = (EditText) findViewById(R.id.so_c);
        tinh = (Button) findViewById(R.id.tinh);
        xoa = (Button) findViewById(R.id.xoa);
        sothunhat = (TextView) findViewById(R.id.sothunhat);
        sothuhai = (TextView) findViewById(R.id.sothuhai);
        // chuyển từ text sang String -> số
        // char
        String soa = so_a.getText().toString();
        String sob = so_b.getText().toString();// chuyển về kiểu String
        String soc = so_c.getText().toString();

        xoa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                so_a.setText("");
                so_b.setText("");
                so_c.setText("");
                sothunhat.setText("");
                sothuhai.setText("");
            }
        });

        tinh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(soa.isEmpty() || sob.isEmpty() || soc.isEmpty()){
                    Toast.makeText(MainActivity.this, "Bạn chưa nhâp hết cá giá trị", Toast.LENGTH_SHORT).show();
                }
                else{
                    double A = Double.parseDouble(soa);// chuyển từ kiểu String sang double
                    double B = Double.parseDouble(sob);
                    double C = Double.parseDouble(soc);
                    giatri gt = new giatri(A,B,C);
                   if(gt.kiemtra()==-1){
                       Toast.makeText(MainActivity.this, "Phương trình có 2 nghiệm phức", Toast.LENGTH_SHORT).show();
                   }
                   if(gt.kiemtra()==0){
                       sothunhat.setText(gt.nghiemduynhat()+"");
                       // muốn hiển thị giá trị lên TextView thì kiểu dữ liệu phải là String
                       // có 2 cách để chuyển từ kiểu dữ liệu số về kiểu dữ liệu String
                       // c1: giatri.toString()
                       // c2; giatri+ ""
                       Toast.makeText(MainActivity.this, "Phương trình có nghiệm duy nhất", Toast.LENGTH_SHORT).show();
                   }
                   if(gt.kiemtra()==1){
                       Toast.makeText(MainActivity.this, "Phương trình có 2 nghiệm phân biệt", Toast.LENGTH_SHORT).show();
                       sothunhat.setText(gt.nghiemphanbiet1()+"");
                       sothuhai.setText(gt.nghiemphanbiet2()+"");
                   }


                }

            }
        });


    }
}