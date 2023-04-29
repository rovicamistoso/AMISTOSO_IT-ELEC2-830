package com.example.bottomnav2.;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.bottomnav2.R;
import com.example.bottomnav2.databinding.ActivitySecondBinding;
import com.example.bottomnav2.ui.home.ActivitySecondBinding;

public class SecondActivity extends AppCompatActivity {

    private ActivitySecondBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView textView = (TextView) findViewById(R.id.textView2);

        Intent intent = getIntent();
        String fromMain = intent.getStringExtra("PASS_ME");
        textView.setText(fromMain);
    }

}