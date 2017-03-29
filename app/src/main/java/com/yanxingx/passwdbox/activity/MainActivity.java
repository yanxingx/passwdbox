package com.yanxingx.passwdbox.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.yanxingx.passwdbox.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
    }
    private void initViews(){
        findViewById(R.id.addCouAndPasswd).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "heheheh°¡°¡°¡", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
