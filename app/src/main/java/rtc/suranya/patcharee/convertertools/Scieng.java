package rtc.suranya.patcharee.convertertools;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class Scieng extends AppCompatActivity implements View.OnClickListener {

    private ImageView cat2ImageView, cat3ImageView, cat4ImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scieng);

        //Bind Widget
        cat2ImageView = (ImageView) findViewById(R.id.imageView7);
        cat3ImageView = (ImageView) findViewById(R.id.imageView8);
        cat4ImageView = (ImageView) findViewById(R.id.imageView9);

        cat2ImageView.setOnClickListener(this);
        cat3ImageView.setOnClickListener(this);
        cat4ImageView.setOnClickListener(this);

    }   // Main Method

    @Override
    public void onClick(View view) {

        int i = 2;

        switch (view.getId()) {
            case R.id.imageView7:
                i = 2;
                break;
            case R.id.imageView8:
                i = 3;
                break;
            case R.id.imageView9:
                i = 4;
                break;
        }

        Intent intent = new Intent(Scieng.this, Calculate.class);
        intent.putExtra("Cat", i);
        startActivity(intent);

    }   // onClick

}   // Main Class
