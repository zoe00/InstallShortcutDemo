package install.shortcut.demo;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

public class ShortcutAd extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);        
		setContentView(R.layout.shortcut_splash); 
		Ad ad = new Ad();
		ad.setUrl("https://www.google.com");
		Intent resultIntent = new Intent(Intent.ACTION_VIEW);
		resultIntent.setData(Uri.parse(ad.getUrl()));	
		startActivity(resultIntent);
		finish();
	}

}
