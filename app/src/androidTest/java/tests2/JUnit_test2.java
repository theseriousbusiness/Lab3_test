package tests2;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.TextView;

import com.example.rrivasfe.lab3.MainActivity;
import com.example.rrivasfe.lab3.R;

/**
 * Created by rrivasfe on 4/15/2016.
 */
public class JUnit_test2 extends ActivityInstrumentationTestCase2<MainActivity> {

    MainActivity mainActivity;
    public JUnit_test2()
    {
        super(MainActivity.class);
    }

    public void test_first()
    {
        mainActivity = getActivity();

        TextView textView = (TextView) mainActivity.findViewById(R.id.tv1);
        String tester = textView.getText().toString();

        assertEquals("Hello World!", tester);
    }
}
