package pe.niyux.displaymetrics;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.widget.TextView;

public class MainActivity extends Activity {

	TextView txtScreenDensity;
	TextView txtDensity;
	TextView txtScaleDensity;
	TextView txtPixelWidth;
	TextView txtPixelHeight;
	TextView txtXdpi;
	TextView txtYdpi;

	DisplayMetrics metrics;
	Resources res;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		getAndSetWidgets();

		res = getResources();
		metrics = getResources().getDisplayMetrics();

		txtScreenDensity.setText(getScreenDensity());
		txtDensity.setText(String.valueOf(metrics.density));
		txtScaleDensity.setText(String.valueOf(metrics.scaledDensity));
		txtPixelWidth.setText(String.valueOf(metrics.widthPixels));
		txtPixelHeight.setText(String.valueOf(metrics.heightPixels));
		txtXdpi.setText(String.valueOf(metrics.xdpi));
		txtYdpi.setText(String.valueOf(metrics.ydpi));

	}

	private void getAndSetWidgets() {
		txtScreenDensity = (TextView) findViewById(R.id.txtScreenDensity);
		txtDensity = (TextView) findViewById(R.id.txtDensity);
		txtScaleDensity = (TextView) findViewById(R.id.txtScaleDensity);
		txtPixelWidth = (TextView) findViewById(R.id.txtPixelWidth);
		txtPixelHeight = (TextView) findViewById(R.id.txtPixelHeight);
		txtXdpi = (TextView) findViewById(R.id.txtXdpi);
		txtYdpi = (TextView) findViewById(R.id.txtYdpi);
	}

	private String getScreenDensity() {
		switch (metrics.densityDpi) {
		case DisplayMetrics.DENSITY_400:
			return res.getString(R.string.label_density_400);
		case DisplayMetrics.DENSITY_HIGH:
			return res.getString(R.string.label_density_high);
		case DisplayMetrics.DENSITY_LOW:
			return res.getString(R.string.label_density_low);
		case DisplayMetrics.DENSITY_MEDIUM:
			return res.getString(R.string.label_density_medium);
		case DisplayMetrics.DENSITY_TV:
			return res.getString(R.string.label_density_tv);
		case DisplayMetrics.DENSITY_XHIGH:
			return res.getString(R.string.label_density_xhigh);
		case DisplayMetrics.DENSITY_XXHIGH:
			return res.getString(R.string.label_density_xxhigh);
		case DisplayMetrics.DENSITY_XXXHIGH:
			return res.getString(R.string.label_density_xxxhigh);
		default:
			return res.getString(R.string.label_density_not_specified)
					+ metrics.densityDpi;
		}
	}
}
