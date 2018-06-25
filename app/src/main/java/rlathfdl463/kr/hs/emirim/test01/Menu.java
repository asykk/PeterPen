package rlathfdl463.kr.hs.emirim.test01;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

/**
 * Created by 해더니 on 2017-09-18.
 */

public class Menu extends AppCompatActivity{
        ImageButton start,my;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.menu);

            setTitle("MENU");
            start=(ImageButton)findViewById(R.id.piterStart);
            my=(ImageButton)findViewById(R.id.myStudy);

           start.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                        Intent intent = new Intent(
                                getApplicationContext(), // 현재 화면의 제어권자
                                set_time.class); // 다음 넘어갈 클래스 지정
                        startActivity(intent); // 다음 화면으로 넘어간다.
                }
            });

            my.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(
                            getApplicationContext(), // 현재 화면의 제어권자
                            SetCalendar.class); // 다음 넘어갈 클래스 지정
                    startActivity(intent); // 다음 화면으로 넘어간다.
                }
            });
        }
    }
