package tests;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.EditText;
import android.widget.TextView;

import com.example.allen.labthree.MainActivity;
import com.example.allen.labthree.R;

/**
 * Created by allen on 2016/4/19.
 */
public class JUnit_test extends ActivityInstrumentationTestCase2<MainActivity> {
    MainActivity mainActivity;
    private static final String num1 = "4 ENTER";
    private static final String num2 = "3 ENTER";
    private static final String result = "7.0";
    public JUnit_test(){
        super(MainActivity.class);
    }

    public void test_first(){

        mainActivity = getActivity();
        sendKeys(num1);
        sendKeys(num2);
        sendKeys("ENTER");
        TextView addedNum = (TextView)mainActivity.findViewById(R.id.textView4);
        String add_result = addedNum.getText().toString();
        assertEquals(result, add_result);
       /*
        EditText number1 = (EditText) mainActivity.findViewById(R.id.editText);
        String num1 = number1.getText().toString();
        double n1 = Double.parseDouble(num1);

        EditText number2 = (EditText) mainActivity.findViewById(R.id.editText2);
        String num2 = number2.getText().toString();
        double n2 = Double.parseDouble(num2);

        EditText number3 = (EditText) mainActivity.findViewById(R.id.editText3);
        String num3 = number3.getText().toString();
        double n3 = Double.parseDouble(num3);

        double sum = n1 + n2;
        assertEquals(sum, n3);*/
    }
}
