package ca.magniol.custommath;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import ca.magniol.myutils.MyMath;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int nombre;
        nombre = MyMath.Plus(2, 3);

    }

}
