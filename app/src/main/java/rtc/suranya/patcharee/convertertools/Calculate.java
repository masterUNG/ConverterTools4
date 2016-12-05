package rtc.suranya.patcharee.convertertools;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
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
    private MyConstant myConstant;
    private String[] strings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculate);

        indexCatAnInt = getIntent().getIntExtra("Cat", 0);
        Log.d("5decV1", "indexCat ==> " + indexCatAnInt);
        myConstant = new MyConstant();

        //Bind Widget
        editText = (EditText) findViewById(R.id.editText);
        topSpinner = (Spinner) findViewById(R.id.spinner);
        backSpinner = (Spinner) findViewById(R.id.spinner2);
        textView = (TextView) findViewById(R.id.textView2);

        //String for Spinner
        switch (indexCatAnInt) {
            case 0:
                strings = myConstant.getUnit0Strings();
                break;
            case 1:
                strings = myConstant.getUnit1Strings();
                break;
            case 2:
                strings = myConstant.getUnit2Strings();
                break;
            case 3:
                strings = myConstant.getUnit3Strings();
                break;
            case 4:
                strings = myConstant.getUnit4Strings();
                break;

        }

        ArrayAdapter<String> stringArrayAdapter = new ArrayAdapter<String>(Calculate.this,
                android.R.layout.simple_list_item_1, strings);
        topSpinner.setAdapter(stringArrayAdapter);
        backSpinner.setAdapter(stringArrayAdapter);

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
