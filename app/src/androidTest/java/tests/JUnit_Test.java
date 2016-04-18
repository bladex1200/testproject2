package tests;
import android.test.ActivityInstrumentationTestCase2;
import android.widget.TextView;

import jeremysiocon.testproject2.MainActivity;
import jeremysiocon.testproject2.R;

/**
 * Created by Jeremy on 4/14/2016.
 */
public class JUnit_Test extends ActivityInstrumentationTestCase2<MainActivity>{

    MainActivity testActivity;
    public JUnit_Test() {

        super(MainActivity.class);
    }

    public void test_first () {

        testActivity = getActivity();

        TextView testView = (TextView) testActivity.findViewById(R.id.tv1);
        String tester = testView.getText().toString();

        assertEquals("Bye World", tester);
    }


}
