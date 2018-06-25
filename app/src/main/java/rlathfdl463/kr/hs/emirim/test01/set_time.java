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
 * Created by 강소연 on 2017-09-14.
 */

public class set_time extends AppCompatActivity {
    ImageButton ok;
    EditText h,m;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.set_time);

        setTitle("PITERPAN START");

        ok=(ImageButton)findViewById(R.id.start);
        m=(EditText)findViewById(R.id.m);

        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(m.getText().toString().equals("")){
                    Toast.makeText(getApplicationContext(), "시간을 설정해 주세요!", Toast.LENGTH_SHORT).show();
                }
                else {
                    Intent intent = new Intent(
                            getApplicationContext(), // 현재 화면의 제어권자
                            MainActivity.class); // 다음 넘어갈 클래스 지정
                    intent.putExtra("m", m.getText().toString());
                    startActivity(intent); // 다음 화면으로 넘어간다
                }
            }
        });
    }
}