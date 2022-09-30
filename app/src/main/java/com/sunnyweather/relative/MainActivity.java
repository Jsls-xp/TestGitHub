package com.sunnyweather.relative;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    View blur, precious;
    TextView tv1, tv2;
    ImageView iv1, iv2;
    Button bt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView bt = findViewById(R.id.bt);
        bt.setOnClickListener(this);

        blur = findViewById(R.id.blur);
        ((TextView) blur.findViewById(R.id.tv)).setText("模糊定位");
        blur.setOnClickListener(this);

        precious = findViewById(R.id.precious);
        ((TextView) precious.findViewById(R.id.tv)).setText("精准定位");
        precious.setOnClickListener(this);
        setVisible(blur, false);
        setVisible(precious, true);
    }

    @SuppressLint("ResourceAsColor")
    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.blur:
                setVisible(blur, true);
                setVisible(precious, false);
                break;
            case R.id.precious:
                setVisible(blur, false);
                setVisible(precious, true);
                break;

            case R.id.bt:
                Toast.makeText(this, "hhh", Toast.LENGTH_SHORT).show();
                break;
        }
    }

    public void setVisible(View view, boolean b) {
        view.setSelected(b);
        TextView tv = view.findViewById(R.id.tv);
        ImageView iv = view.findViewById(R.id.iv);
        tv.setSelected(b);
        iv.setVisibility(b ? View.VISIBLE : View.GONE);

    }

    public void add(){
        Log.e("TAG","add");

        Log.e("TAG","add");
        Log.e("TAG","add");

        Log.e("TAG","add");
    }

    public void test(){
        Log.e("TAG","test");
        Log.e("TAG","test");
        Log.e("TAG","test");
    }

    public void reset(){
        Log.e("TAG","test");
        Log.e("TAG","test2");
        Log.e("TAG","test3");
        Log.e("TAG","test4");

        Log.e("TAG","test5");
        Log.e("TAG","test6");
        Log.e("TAG","test7");
    }
}