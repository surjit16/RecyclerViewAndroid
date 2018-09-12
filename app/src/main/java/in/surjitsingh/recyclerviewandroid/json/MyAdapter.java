package in.surjitsingh.recyclerviewandroid.json;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import in.surjitsingh.recyclerviewandroid.R;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.RecyclerVH> {

    List<JsonData> dataList;
    Context context;

    MyAdapter(Context context, List<JsonData> list) {
        this.context = context;
        this.dataList = list;
    }

    @NonNull
    @Override
    public RecyclerVH onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater = LayoutInflater.from(viewGroup.getContext());
        View view = layoutInflater.inflate(R.layout.view_json_rv_list_item, viewGroup, false);
        return new RecyclerVH(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerVH recyclerVH, final int i) {
        JsonData curr = dataList.get(i);
        recyclerVH.name.setText(curr.getName());
        recyclerVH.about.setText(curr.getAbout());
        recyclerVH.mob.setText(curr.getMob());
        recyclerVH.imageView.setImageResource(curr.getImgID());
        recyclerVH.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "You Clicked " + i, Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }

    public class RecyclerVH extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView name, about, mob;

        public RecyclerVH(@NonNull View itemView) {
            super(itemView);

            name = itemView.findViewById(R.id.name);
            about = itemView.findViewById(R.id.about);
            mob = itemView.findViewById(R.id.mob);
            imageView = itemView.findViewById(R.id.img);
        }
    }
}
