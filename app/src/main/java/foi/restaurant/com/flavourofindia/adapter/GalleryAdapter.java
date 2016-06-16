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
 * Created by Saurabh on 4/20/2016.
 */
public class GalleryAdapter extends BaseAdapter {
    private Context context;
    private List<String> categoryList = new ArrayList<>();
    LayoutInflater layoutInflater;

    public GalleryAdapter(Context applicationContext) {
        layoutInflater = (LayoutInflater) applicationContext.
                getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    public GalleryAdapter(Context context, List<String> categoryList) {
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

        convertView = layoutInflater.inflate(R.layout.custom_gallery_view, parent, false);

        return convertView;
    }
}
