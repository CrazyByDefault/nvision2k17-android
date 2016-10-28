package in.org.nvision.nvision;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        ImageView hackImage = (ImageView) findViewById(R.id.hackImage);
        Resources resources = getBaseContext().getResources();
        //Bitmap hackPic = BitmapFactory.decodeResource(resources , R.drawable.hack);
        hackImage.setImageResource(R.drawable.hack_opt);

        ImageView driftImage = (ImageView) findViewById(R.id.driftImage);
        //Bitmap driftPic = BitmapFactory.decodeResource(resources, R.drawable.drift);
        driftImage.setImageResource(R.drawable.drift_opt);
    }
}
