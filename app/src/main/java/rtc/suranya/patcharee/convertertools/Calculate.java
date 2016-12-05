package rtc.suranya.patcharee.convertertools;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class Calculate extends AppCompatActivity {

    //Explicit
    private int indexCatAnInt;
    private EditText editText;
    private Spinner topSpinner, backSpinner;
    private TextView textView;
    private String string;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculate);

        indexCatAnInt = getIntent().getIntExtra("Cat", 0);
        Log.d("5decV1", "indexCat ==> " + indexCatAnInt);

        //Bind Widget
        editText = (EditText) findViewById(R.id.editText);
        topSpinner = (Spinner) findViewById(R.id.spinner);
        backSpinner = (Spinner) findViewById(R.id.spinner2);
        textView = (TextView) findViewById(R.id.textView2);

    }   // Main Method

    public void clickCalculate(View view) {

        string = editText.getText().toString().trim();

        if (string.equals("")) {
            //Have Space
            Toast.makeText(Calculate.this, "โปรดกรอง ค่าที่ต้องการจะแปลง", Toast.LENGTH_SHORT).show();
        } else {
            //No Space
        }

    }

}   // Main Class
