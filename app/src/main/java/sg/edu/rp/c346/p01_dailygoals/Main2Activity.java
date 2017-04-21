package sg.edu.rp.c346.p01_dailygoals;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        // Get the intent so as to get the "things" inside the intent
        Intent i = getIntent();
        // Get the String array named "info" we passed in
        String[] info = i.getStringArrayExtra("info");
        // Get the TextView object
        TextView tv1 = (TextView) findViewById(R.id.textView1);
        // Display the name and age on the TextView
        tv1.setText(info[0]);

        TextView tv2 = (TextView) findViewById(R.id.textView2);
        // Display the name and age on the TextView
        tv2.setText(info[1]);

        TextView tv3 = (TextView) findViewById(R.id.textView3);
        // Display the name and age on the TextView
        tv3.setText(info[2]);

        TextView tv4 = (TextView) findViewById(R.id.textView4);
        // Display the name and age on the TextView
        tv4.setText(info[3]);


        Button button = (Button)findViewById(R.id.button2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Main2Activity.this,
                        MainActivity.class);
                startActivity(i);
                setContentView(R.layout.activity_main);
            }
        });
    }
}
