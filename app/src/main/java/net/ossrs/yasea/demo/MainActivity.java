package net.ossrs.yasea.demo;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {


    Button streamLiveToYouTubeBtn;
    Button streamLiveToOtherServiceBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Set Typeface & Text Styling For StreamTeam Logo & "RTMP Camera" Sub Heading
        TextView streamTeamLogo = (TextView) findViewById(R.id.streamTeamLogo);
        TextView streamTeamSubHeader = (TextView) findViewById(R.id.streamTeamSubHeader);
        Typeface streamTeamTypeFace= Typeface.createFromAsset(getAssets(),"fonts/streamteam.ttf");
        streamTeamLogo.setTypeface(streamTeamTypeFace);
        streamTeamSubHeader.setTypeface(null, Typeface.BOLD_ITALIC);

        // Initialize Buttons, Make Button-Text Bold
        streamLiveToYouTubeBtn = (Button) findViewById(R.id.streamLiveToYouTubeBtn);
        streamLiveToOtherServiceBtn = (Button) findViewById(R.id.streamLiveToOtherServiceBtn);
        streamLiveToYouTubeBtn.setTypeface(null, Typeface.BOLD);
        streamLiveToOtherServiceBtn.setTypeface(null, Typeface.BOLD);

        streamLiveToYouTubeBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent youTubeActivityIntent = new Intent(getApplicationContext(), YouTubeActivity.class);
                // i.putExtra(EXTRA_FOO, "bar");
                startActivity(youTubeActivityIntent);
            }
        });

        streamLiveToOtherServiceBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent otherServiceActivityIntent = new Intent(getApplicationContext(), OtherServiceActivity.class);
                // i.putExtra(EXTRA_FOO, "bar");
                startActivity(otherServiceActivityIntent);
            }
        });
    }
}
