package com.fatihsoysal.fatih.radiobutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    RadioButton erkek,kadin;
    TextView tv;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        erkek=(RadioButton)findViewById(R.id.erkek);
        kadin=(RadioButton)findViewById(R.id.kadin);
        button=(Button)findViewById(R.id.button);
        tv=(TextView)findViewById(R.id.textView2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (erkek.isChecked()){
                    tv.setText("Yapılan Seçim: Erkek");
                }
                else if (kadin.isChecked()){
                    tv.setText("Yapılan Seçim: Kadın");
                }
                else{
                    Log.i("HATA", "Herhangi bir seçim yapılmadı!");
                }
            }
        });


    }
}
