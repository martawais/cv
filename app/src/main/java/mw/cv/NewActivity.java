package mw.cv;

import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Created by mstowska on 7/6/2016.
 */
public class NewActivity  extends AppCompatActivity {

    private RelativeLayout myRelativeLayout;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);
        final Context context = getApplication();

        TextView added_doswiadczenie = (TextView) findViewById(R.id.added_doswiadczenie);
        myRelativeLayout = (RelativeLayout) findViewById(R.id.relativeLayout);

        if (isLargeDevice(getBaseContext())) {
            this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_SENSOR);
        } else {
            this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        }





/*
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.pdf);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            try {
                myRelativeLayout.setDrawingCacheEnabled(true);
                Bitmap bitmap = myRelativeLayout.getDrawingCache();
                File file;
                File f = null;
                if (android.os.Environment.getExternalStorageState().equals(android.os.Environment.MEDIA_MOUNTED))
                {
                    file =new File(android.os.Environment.getExternalStorageDirectory(),"TTImages_cache");
                    if(!file.exists())
                    {
                        file.mkdirs();

                    }
                    f = new File(file.getAbsolutePath()+"/"+ "filename"+".png");
                }
                FileOutputStream ostream = new FileOutputStream(f);
                bitmap.compress(Bitmap.CompressFormat.PNG, 10, ostream);
                ostream.close();

            }
            catch (Exception e){
                e.printStackTrace();
            }

            }
        });*/

    }



    private boolean isLargeDevice(Context context) {
        int screenLayout = context.getResources().getConfiguration().screenLayout;
        screenLayout &= Configuration.SCREENLAYOUT_SIZE_MASK;

        switch (screenLayout) {
            case Configuration.SCREENLAYOUT_SIZE_SMALL:
            case Configuration.SCREENLAYOUT_SIZE_NORMAL:
                return false;
            case Configuration.SCREENLAYOUT_SIZE_LARGE:
            case Configuration.SCREENLAYOUT_SIZE_XLARGE:
                return true;
            default:
                return false;
        }
    }
}
