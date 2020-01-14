package com.example.lenovo.checkbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CheckBox c1,c2,c3;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        c1=findViewById(R.id.checkBox);
        c2=findViewById(R.id.checkBox2);
        c3=findViewById(R.id.checkBox3);
        btn=findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String o1="",o2="",o3="";

                if(c1.isChecked())
                    o1=c1.getText().toString();

                if(c2.isChecked())
                    o2=c2.getText().toString();

                if(c3.isChecked())
                    o3=c3.getText().toString();

                Toast.makeText(MainActivity.this, ""+o1+o2+o3, Toast.LENGTH_SHORT).show();
            }
        });


    }
}
