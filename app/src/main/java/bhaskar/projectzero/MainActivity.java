package bhaskar.projectzero;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

  private Button btnSpotify, btnScore, btnLibrary, btnBuildItBigger, btnXyzReader, btnCapstone;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
    setSupportActionBar(toolbar);

    btnSpotify = (Button) findViewById(R.id.button_spotify);
    btnScore = (Button) findViewById(R.id.button_scores_app);
    btnLibrary = (Button) findViewById(R.id.button_library_app);
    btnBuildItBigger = (Button) findViewById(R.id.button_build_it_bigger);
    btnXyzReader = (Button) findViewById(R.id.button_xyz_reader);
    btnCapstone = (Button) findViewById(R.id.button_capstone);

    btnSpotify.setOnClickListener(this);
    btnScore.setOnClickListener(this);
    btnLibrary.setOnClickListener(this);
    btnBuildItBigger.setOnClickListener(this);
    btnXyzReader.setOnClickListener(this);
    btnCapstone.setOnClickListener(this);

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

  @Override
  public void onClick(View v) {
    if(v.getId() == R.id.button_spotify){
      Toast.makeText(MainActivity.this, "This button will launch Spotify App!", Toast
          .LENGTH_SHORT).show();
    } else if(v.getId() == R.id.button_build_it_bigger){
      Toast.makeText(MainActivity.this, "This button will launch Build It Bigger App!", Toast
          .LENGTH_SHORT).show();
    }else if(v.getId() == R.id.button_scores_app){
      Toast.makeText(MainActivity.this, "This button will launch Scores App!", Toast
          .LENGTH_SHORT).show();
    }else if(v.getId() == R.id.button_library_app){
      Toast.makeText(MainActivity.this, "This button will launch Library App!", Toast
          .LENGTH_SHORT).show();
    }else if(v.getId() == R.id.button_xyz_reader){
      Toast.makeText(MainActivity.this, "This button will launch XYZ Reader App!", Toast
          .LENGTH_SHORT).show();
    }else if(v.getId() == R.id.button_capstone){
      Toast.makeText(MainActivity.this, "This button will launch My Capstone App!", Toast
          .LENGTH_SHORT).show();
    }
  }
}
