package me.dharanaditya.jokeviewer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class JokeActivity extends AppCompatActivity {
    private static final String STATE_JOKE = JokeActivity.class.getPackage().getName() + ".STATE_JOKE";
    TextView jokeTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);
        jokeTextView = findViewById(R.id.tv_joke_display);

        if (savedInstanceState != null) {
            jokeTextView.setText(savedInstanceState.getString(STATE_JOKE));
        }

        Intent resultIntent = getIntent();
        if (resultIntent != null) {
            if (resultIntent.hasExtra(Intent.EXTRA_TEXT)){
                String joke = resultIntent.getStringExtra(Intent.EXTRA_TEXT);
                jokeTextView.setText(joke);
            }
            else {
                Toast.makeText(this, R.string.no_joke, Toast.LENGTH_SHORT).show();
            }
        }
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString(STATE_JOKE,jokeTextView.getText().toString());
    }
}
