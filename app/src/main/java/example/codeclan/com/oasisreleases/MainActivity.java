package example.codeclan.com.oasisreleases;

import android.os.Bundle;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;
import java.util.ArrayList;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Releases release = new Releases();
        ArrayList<Cd> list = release.getList();

        ReleasesAdapter cDAdapter = new ReleasesAdapter(this, list);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(cDAdapter);
    }

    public void getCd(View listItem){
        Cd cd= (Cd) listItem.getTag();
        StringBuilder sb = new StringBuilder();
        sb.append("You clicked: ");
        sb.append(cd.getTitle());

        Snackbar snackbar = Snackbar.make(listItem, sb.toString(), Snackbar.LENGTH_LONG);
        snackbar.show();

        snackbar.setAction("Say Hello", this);

    }

    public void onClick(View v){
        Toast.makeText(this, "Hello form Snackbar", Toast.LENGTH_SHORT).show();
    }
}

