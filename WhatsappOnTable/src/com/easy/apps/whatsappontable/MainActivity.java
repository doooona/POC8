package com.easy.apps.whatsappontable;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {
	private static final String WHATS_URL = "http://www.whatsapp.com/android/";
	private static final String BACKUP_URL = "https://play.google.com/store/apps/details?id=com.keramidas.TitaniumBackup";
	private Button waht_btn;
	private Button backup_btn;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		waht_btn = (Button)this.findViewById(R.id.button1);
		
		waht_btn.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(WHATS_URL));
				startActivity(browserIntent);
			}
			
		});
		
		backup_btn = (Button)this.findViewById(R.id.button2);
		
		backup_btn.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				try {
					startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(BACKUP_URL)));
				} catch (Exception e) {
				   e.printStackTrace();
				}
			}
			
		});
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
