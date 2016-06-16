package foi.restaurant.com.flavourofindia.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.ArrayList;
import java.util.List;

import foi.restaurant.com.flavourofindia.R;

/**
 * Created by vikas on 4/21/2016.
 */
public class EventsAdapter extends BaseAdapter {
    private Context context;
    private List<String> categoryList = new ArrayList<>();
    LayoutInflater layoutInflater;

    public EventsAdapter(Context applicationContext) {
        layoutInflater = (LayoutInflater) applicationContext.
                getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    public EventsAdapter(Context context, List<String> categoryList) {
        this.context = context;
        this.categoryList = categoryList;
        layoutInflater = (LayoutInflater) context.
                getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return 7;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        convertView = layoutInflater.inflate(R.layout.events_item_layout, parent, false);

        return convertView;
    }
}