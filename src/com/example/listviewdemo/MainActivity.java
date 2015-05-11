package com.example.listviewdemo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;
/**
 * 1������һ������ ����ListView
 * 2���ҵ�����Դ
 * 3������������ ��������Դ�����������а�
 * 4���ҵ���ʾ���ݵ� View ����3��������
 */
public class MainActivity extends Activity {
	ListView lv;
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		List list = new ArrayList();
		
			Map mp1 = new HashMap();
				mp1.put("name", R.drawable.ic_launcher);
				mp1.put("count", 123456);
				mp1.put("counts", 111);
		list.add(mp1);
		
			Map mp2 = new HashMap();
			mp2.put("name", R.drawable.ic_launcher);
			mp2.put("count", 456);
			mp2.put("counts", 222);
		list.add(mp2);
			Map mp3 = new HashMap();
			mp3.put("name", R.drawable.ic_launcher);
			mp3.put("count", 1234);
			mp3.put("counts", 333);
		list.add(mp3);
		
		SimpleAdapter aAdapter = new SimpleAdapter(
				MainActivity.this,
				list, 
				R.layout.item, 
				new String[]{"name","count","counts"},
				new int[]{R.id.name,R.id.count,R.id.counts});
				
		lv = (ListView) findViewById(R.id.main_lv_show);
		
		lv.setAdapter(aAdapter);
		
		lv.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				Toast.makeText(MainActivity.this, position + " id " +id, Toast.LENGTH_LONG).show();
			}
		});
	}


}
