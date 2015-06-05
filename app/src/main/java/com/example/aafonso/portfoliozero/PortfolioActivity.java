package com.example.aafonso.portfoliozero;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class PortfolioActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_portfolio);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_portfolio, menu);
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

    public void showToast(View view){

        switch(view.getId()){
            case R.id.button:
                Toast.makeText(this,"This button will launch my Spotify streamer app ",Toast.LENGTH_LONG).show();
                break;
            case R.id.button2:
                Toast.makeText(this,"This button will launch my Scores app",Toast.LENGTH_LONG).show();
                break;
            case R.id.button3:
                Toast.makeText(this,"This button will launch my Library app",Toast.LENGTH_LONG).show();
                break;
            case R.id.button4:
                Toast.makeText(this,"This button will launch my Build It Bigger app",Toast.LENGTH_LONG).show();
                break;
            case R.id.button5:
                Toast.makeText(this,"This button will launch my XYZ Reader app",Toast.LENGTH_LONG).show();
                break;
            case R.id.button6:
                Toast.makeText(this,"This button will launch my capstone app",Toast.LENGTH_LONG).show();
                break;
        }
    }
}
