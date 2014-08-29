package pe.niyux.displaymetrics;

import android.app.Activity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.widget.TextView;

public class MainActivity extends Activity {

	TextView txtOutput;
	DisplayMetrics metrics = getResources().getDisplayMetrics();
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		txtOutput = (TextView) findViewById(R.id.txtOutput);
		
		String density = null;
		
		txtOutput.setText(metrics.toString()+" "+density);
		
	}
	
	private String getScreenDensity(){
		switch(metrics.densityDpi){
		case DisplayMetrics.DENSITY_400:
			return "400";
		case DisplayMetrics.DENSITY_HIGH:
			return "HDPI";
		case DisplayMetrics.DENSITY_LOW:
			return "LDPI";
		case DisplayMetrics.DENSITY_MEDIUM:
			return "MDPI";
		case DisplayMetrics.DENSITY_TV:
			return "TV";
		case DisplayMetrics.DENSITY_XHIGH:
			return "XHDPI";
		case DisplayMetrics.DENSITY_XXHIGH:
			return "XXHDPI";
		case DisplayMetrics.DENSITY_XXXHIGH:
			return "XXXHDPI";
		default:
			return "Not specified densityDpi: "+metrics.densityDpi;
		}
	}
}
