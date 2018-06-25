package rlathfdl463.kr.hs.emirim.test01;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;
import java.util.ArrayList;

/**
 * Created by 해더니 on 2017-09-18.
 */

public class SetCalendar extends ListActivity {
    ArrayList<String> listItems=new ArrayList<String>();

    //리스트의 데이터를 다루는 어댑터 선언
    ArrayAdapter<String> adapter;
    ImageButton gotostudy,gotowrite;
    EditText add1;
    String list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.set_calendar);

        setTitle("학습현황");
        add1 =(EditText)findViewById(R.id.add1);
        adapter=new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,
                listItems);
        setListAdapter(adapter);

        gotostudy=(ImageButton)findViewById(R.id.gotoStudy);
        gotowrite=(ImageButton)findViewById(R.id.gotoWrite);

        gotostudy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(
                        getApplicationContext(), // 현재 화면의 제어권자
                        set_time.class); // 다음 넘어갈 클래스 지정
                startActivity(intent); // 다음 화면으로 넘어간다.
            }
        });

        gotowrite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"서비스가 준비중입니다!",Toast.LENGTH_SHORT).show();
            }
        });
    }
    //동적으로 리스트에 원소를 추가하기위한 메소드
    public void addItems(View v) {
        list = add1.getText().toString();
        listItems.add(list);
        adapter.notifyDataSetChanged();
    }
}



