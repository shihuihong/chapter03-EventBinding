package com.example.eventbinding;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity {
// private Button myBtn;
	public void onCreate (Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
//    myBtn=(Button)findviewById(R.id.mybtn);
//		 myBtn.setOnClickcListenner(new OnClickListener){
//			 public void onClisten(View v){
//				  Toast.makeText(MainActivitytis.this,"�������еĴ�����",
//						      Toast.LENGTH_SHORT).show();
//			 }
//		 });


	}
 public void clickEventHandler(View source){
	 Toast.makeText(this,"�Զ����¼�������",Toast.LENGTH_SHORT).show();
 }
}
