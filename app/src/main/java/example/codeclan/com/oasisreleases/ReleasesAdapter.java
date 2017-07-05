package example.codeclan.com.oasisreleases;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by user on 05/07/2017.
 */

public class ReleasesAdapter extends ArrayAdapter<Cd> {

    public ReleasesAdapter(Context context, ArrayList<Cd> releases){
        super(context, 0, releases);
    }

    @Override
    public View getView(int position, View listItemView, ViewGroup parent){
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.releases_item, parent, false);
        }
        Cd currentCd = getItem(position);

        TextView ranking = (TextView) listItemView.findViewById(R.id.ranking);
        ranking.setText(currentCd.getRanking().toString());

        TextView title = (TextView) listItemView.findViewById(R.id.title);
        title.setText(currentCd.getTitle());

        TextView year = (TextView) listItemView.findViewById(R.id.year);
        year.setText(currentCd.getYear().toString());

        listItemView.setTag(currentCd);

        return listItemView;
    }
}


