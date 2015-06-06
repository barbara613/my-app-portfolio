package ca.lifehypnosis.barbara.nanodegree;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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

    public void onSpotifyClicked(View view) {
        showToast("Spotify", (int)view.getX(), (int)view.getY());
    }
    public void onScoresClicked(View view) {
        showToast("Scores", (int) view.getX(), (int) view.getY());
    }

    public void onLibraryClicked(View view) {
        showToast("Library", (int) view.getX(), (int) view.getY());
    }

    public void onBuildItClicked(View view) {
        showToast("Build it", (int) view.getX(), (int) view.getY());
    }

    public void onXYZClicked(View view) {
        showToast("XYZ", (int) view.getX(), (int) view.getY());
    }

    public void onCapstoneClicked(View view) {
        showToast("Capstone", (int)view.getX(), (int)view.getY());
    }

    private void showToast(String appName, int x, int y) {
        Toast toast = Toast.makeText(getApplicationContext(), "This button will launch my " + appName + " App",
                Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.NO_GRAVITY, x, y);
        toast.show();
    }
}
