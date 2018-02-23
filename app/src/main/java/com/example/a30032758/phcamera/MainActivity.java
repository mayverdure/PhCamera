package com.example.a30032758.phcamera;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public final static String EXTRA_MYITEM = "com.example.a30032758.phcamera.MYITEM";

    @Override

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // リソースファイルres/values/sample_values.xmlの内容をString[]に入れる
        Resources res = getResources();
        String[] texts = res.getStringArray(R.array.sample_array);

        // 追加するアイテムを生成する
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                this, android.R.layout.simple_list_item_activated_1);
//        adapter.add("listview item 1");
//        adapter.add("listview item 2");
//        adapter.add("listview item 3");

        for (String str: texts){
            // ArrayAdapterにitemを追加する
            adapter.add(str);
        }

        // リストビューにアイテム (adapter) を追加
        ListView listView1 = (ListView) findViewById(R.id.list_view1);
        listView1.setAdapter(adapter);

        // アイテムクリック時ののイベントを追加
        listView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent,
                                    View view, int pos, long id) {


                // 選択アイテムを取得
                ListView listView = (ListView) parent;
                String item = (String) listView.getItemAtPosition(pos);

                Intent intent = new Intent(getApplicationContext(), CameraActivity.class);
                intent.putExtra(EXTRA_MYITEM, item);
                startActivity(intent);


//
//                // 通知ダイアログを表示
//                Toast.makeText(MainActivity.this,
//                        item, Toast.LENGTH_LONG
//                ).show();

            }
        });
    }


}
