/*=====================================================================
□ Infomation
  ○ Data : 07.03.2018
  ○ Mail : eun1310434@naver.com
  ○ Blog : https://blog.naver.com/eun1310434
  ○ Reference : Do it android app Programming

□ Function
  ○ ListView에 Adapter를 적용하여 표현

□ Study
  ○
=====================================================================*/
package com.eun1310434.listview01;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText editTitle;
    EditText editContents;


    ListView listView;
    ListViewAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.listView);

        adapter = new ListViewAdapter(getApplicationContext());

        adapter.addItem(new ItemData("Title - 1", "Contents 1 : -", R.drawable.img_a));
        adapter.addItem(new ItemData("Title - 2", "Contents 2 : -", R.drawable.img_b));
        adapter.addItem(new ItemData("Title - 3", "Contents 3 : -", R.drawable.img_c));
        adapter.addItem(new ItemData("Title - 4", "Contents 4 : -", R.drawable.img_d));
        adapter.addItem(new ItemData("Title - 5", "Contents 5 : -", R.drawable.img_e));

        listView.setAdapter(adapter);


        editTitle = (EditText) findViewById(R.id.editTitle);
        editContents = (EditText) findViewById(R.id.editContents);

        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Title = editTitle.getText().toString();
                String Contents = "Contents "+(adapter.getCount()+1)+" : "+editContents.getText().toString();

                adapter.addItem(new ItemData(Title, Contents, R.drawable.img_c));
                adapter.notifyDataSetChanged(); // item 데이터가 변경된 것을 파악하여 수정
            }
        });


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                ItemData item = (ItemData) adapter.getItem(position);
                Toast.makeText(getApplicationContext(), "선택 : " + item.getTitle(), Toast.LENGTH_LONG).show();
            }
        });

    }
}
