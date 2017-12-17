package net.ossrs.yasea.demo;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class OtherServiceActivity extends Activity {


    EditText streamingServerUrlEditText;
    String SERVER_URL_EXTRA = "SERVER_URL_EXTRA";
    String streamingServerUrlStr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other_service);

        streamingServerUrlEditText = (EditText) findViewById(R.id.streamingServerUrlEditText);
        Button streamLiveToOtherServiceBtn2 = (Button) findViewById(R.id.streamLiveToOtherServiceBtn2);

        streamingServerUrlEditText.setTypeface(null, Typeface.BOLD);
        streamLiveToOtherServiceBtn2.setTypeface(null, Typeface.BOLD);

        streamLiveToOtherServiceBtn2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                streamingServerUrlStr = streamingServerUrlEditText.getText().toString();
                Intent rtmpCameraActivityIntent = new Intent(getApplicationContext(), RTMPCameraActivity.class);
                rtmpCameraActivityIntent.putExtra(SERVER_URL_EXTRA, streamingServerUrlStr);
                startActivity(rtmpCameraActivityIntent);
            }
        });
    }
}
