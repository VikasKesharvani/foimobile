package foi.restaurant.com.flavourofindia.adapter;

import android.support.v4.app.FragmentManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import foi.restaurant.com.flavourofindia.R;

/**
 * Created by vikas on 4/20/2016.
 */
public class GuestCommentAdapter extends RecyclerView.Adapter<GuestCommentAdapter.MyViewHolder> {

    private FragmentManager supportFragmentManager;
    private List<String> recipeList;

    public GuestCommentAdapter(FragmentManager supportFragmentManager) {
        this.supportFragmentManager = supportFragmentManager;
    }

    @Override
    public GuestCommentAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.guest_comments_list_item_layout, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(GuestCommentAdapter.MyViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 3;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public MyViewHolder(View itemView) {
            super(itemView);
        }
    }
}