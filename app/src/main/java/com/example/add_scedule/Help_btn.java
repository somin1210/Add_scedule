package com.example.add_scedule;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class Help_btn  extends AppCompatActivity {
    Button btn_help;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_help = (Button) findViewById(R.id.btn_help);
        btn_help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder d = new AlertDialog.Builder(Help_btn.this);

                d.setTitle("기념일 알림 기능");
                d.setMessage("기념일 알림 기능 활성화시 시정 시간 외에도 2차례 알림이 추가로 울립니다.");

                d.show();
            }
        });
    }
}
