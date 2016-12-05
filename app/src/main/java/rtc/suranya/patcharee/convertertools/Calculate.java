package rtc.suranya.patcharee.convertertools;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class Calculate extends AppCompatActivity {

    //Explicit
    private int indexCatAnInt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculate);

        indexCatAnInt = getIntent().getIntExtra("Cat", 0);
        Log.d("5decV1", "indexCat ==> " + indexCatAnInt);

    }   // Main Method

}   // Main Class
