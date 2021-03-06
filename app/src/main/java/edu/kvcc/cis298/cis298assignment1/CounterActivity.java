package edu.kvcc.cis298.cis298assignment1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Set;

public class CounterActivity extends AppCompatActivity {

    private Button mPlusButton;
    private Button mMinusButton;
    public int counter = 0;
    public String temp = "0";
    public TextView count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_counter);
        count = (TextView)findViewById(R.id.TextView);

        mPlusButton = (Button) findViewById(R.id.plus_button);
        mPlusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PlusButton();
            }
        });
        mMinusButton = (Button) findViewById(R.id.minus_button);
        mMinusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MinusButton();
            }
        });
    }

    public void PlusButton() {
        if (counter == 20) {
            Toast.makeText(CounterActivity.this, "Warning: Your count is above 20", Toast.LENGTH_SHORT).show();
            counter++;
            temp = String.valueOf(counter);
            count.setText(temp);
        } else {
            counter++;
            temp = String.valueOf(counter);
            count.setText(temp);
        }
    }

    public void MinusButton() {
        counter--;
        temp = Integer.toString(counter);
        count.setText(temp);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
