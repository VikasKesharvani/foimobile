package foi.restaurant.com.flavourofindia.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import foi.restaurant.com.flavourofindia.R;
import foi.restaurant.com.flavourofindia.adapter.EventsAdapter;

/**
 * Created by vikas on 4/21/2016.
 */
public class EventsFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_events_laoyout, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        GridView gridView = (GridView) view.findViewById(R.id.events_grid_view);
        gridView.setAdapter(new EventsAdapter(getContext()));
    }
}
