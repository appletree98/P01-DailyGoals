package sg.edu.rp.c346.p01_dailygoals;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button)findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText et = (EditText)findViewById(R.id.editText);

                RadioGroup question1 = (RadioGroup) findViewById(R.id.radioGroup);
                String answer1 = ((RadioButton) findViewById(question1.getCheckedRadioButtonId())).getText().toString();

                RadioGroup question2 = (RadioGroup) findViewById(R.id.radioGroup2);
                String answer2 = ((RadioButton) findViewById(question2.getCheckedRadioButtonId())).getText().toString();

                RadioGroup question3 = (RadioGroup) findViewById(R.id.radioGroup3);
                String answer3 = ((RadioButton) findViewById(question3.getCheckedRadioButtonId())).getText().toString();

                // Put the 3 values into an array
                String[] info = {answer1,answer2,answer3,et.getText().toString()};

                // Create an intent to start another activity called
                //  DemoActivities (which we would create later)
                Intent i = new Intent(MainActivity.this,
                        Main2Activity.class);
                // Pass the String array holding the name & age to new activity
                i.putExtra("info", info);
                // Start the new activity
                startActivity(i);

            }
        });
    }
}
