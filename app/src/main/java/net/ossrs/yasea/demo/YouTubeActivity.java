package net.ossrs.yasea.demo;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class YouTubeActivity extends Activity {


    EditText serverUrlEditText;
    EditText streamNameKeyEditText;

    String SERVER_URL_EXTRA = "SERVER_URL_EXTRA";
    String STREAM_NAME_KEY_EXTRA = "STREAM_NAME_KEY_EXTRA";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_you_tube);

        serverUrlEditText = (EditText) findViewById(R.id.serverUrlEditText);
        streamNameKeyEditText = (EditText) findViewById(R.id.streamNameKeyEditText);
        Button streamLiveToYouTubeBtn2 = (Button) findViewById(R.id.streamLiveToYouTubeBtn2);


        serverUrlEditText.setTypeface(null, Typeface.BOLD);
        streamNameKeyEditText.setTypeface(null, Typeface.BOLD);
        streamLiveToYouTubeBtn2.setTypeface(null, Typeface.BOLD);

        streamLiveToYouTubeBtn2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                String serverUrlStr = serverUrlEditText.getText().toString();
                String streamNameKeyStr = streamNameKeyEditText.getText().toString();

                Intent rtmpCameraActivityIntent = new Intent(getApplicationContext(), RTMPCameraActivity.class);
                rtmpCameraActivityIntent.putExtra(SERVER_URL_EXTRA, serverUrlStr);
                rtmpCameraActivityIntent.putExtra(STREAM_NAME_KEY_EXTRA, streamNameKeyStr);

                startActivity(rtmpCameraActivityIntent);
            }
        });
    }
}
