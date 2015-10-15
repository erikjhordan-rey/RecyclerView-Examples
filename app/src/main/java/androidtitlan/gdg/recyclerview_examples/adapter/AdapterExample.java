package androidtitlan.gdg.recyclerview_examples.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import androidtitlan.gdg.recyclerview_examples.R;
import androidtitlan.gdg.recyclerview_examples.model.Picture;
import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by Jhordan on 13/10/15.
 */
public class AdapterExample extends RecyclerView.Adapter<AdapterExample.ExampleHolder> {


    private ArrayList<Picture> pictureArrayList;

    public AdapterExample(){}

    public AdapterExample(ArrayList<Picture> pictureArrayList) {
        this.pictureArrayList = pictureArrayList;
    }

    @Override
    public ExampleHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.simple_item, parent, false);
        return new ExampleHolder(view);
    }

    @Override
    public void onBindViewHolder(ExampleHolder holder, int position) {
        Picture picture = pictureArrayList.get(position);
        holder.title.setText(picture.getName());
        holder.imageView.setImageResource(picture.getImage());


    }


    @Override
    public int getItemCount() {
        return pictureArrayList.size();
    }


    public static class ExampleHolder extends RecyclerView.ViewHolder {

        @Bind(R.id.txt_title) TextView title;
        @Bind(R.id.imageView) ImageView imageView;

        public ExampleHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }

    }
}
