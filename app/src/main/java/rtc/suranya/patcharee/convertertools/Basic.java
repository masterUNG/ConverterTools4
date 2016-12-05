package rtc.suranya.patcharee.convertertools;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class Basic extends AppCompatActivity implements View.OnClickListener {

    private ImageView cat0ImageView, cat1ImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic);


        cat0ImageView = (ImageView) findViewById(R.id.imageView5);
        cat1ImageView = (ImageView) findViewById(R.id.imageView6);

        cat0ImageView.setOnClickListener(this);
        cat1ImageView.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {

        int i = 0;
        switch (view.getId()) {
            case R.id.imageView5:
                i = 0;
                break;
            case R.id.imageView6:
                i = 1;
                break;

        }

        Intent intent = new Intent(Basic.this, Calculate.class);
        intent.putExtra("Cat", i);
        startActivity(intent);


    }
}
