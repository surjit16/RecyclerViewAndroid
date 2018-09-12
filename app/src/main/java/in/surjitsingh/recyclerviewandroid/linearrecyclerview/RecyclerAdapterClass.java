package in.surjitsingh.recyclerviewandroid.linearrecyclerview;

import android.content.Context;
import android.media.Image;
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
import in.surjitsingh.recyclerviewandroid.d.Data;

public class RecyclerAdapterClass extends RecyclerView.Adapter<RecyclerAdapterClass.RecyclerVH> {

    List<Data> dataList;
    Context context;

    RecyclerAdapterClass(Context context, List<Data> list) {
        this.context = context;
        this.dataList = list;
    }

    @NonNull
    @Override
    public RecyclerVH onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater = LayoutInflater.from(viewGroup.getContext());
        View view = layoutInflater.inflate(R.layout.view_linear_rv_list_item, viewGroup, false);
        return new RecyclerVH(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerVH recyclerVH, final int i) {
        Data curr = dataList.get(i);
        recyclerVH.title.setText(curr.getTitle());
        recyclerVH.desc.setText(curr.getDesc());
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
        TextView title, desc;

        public RecyclerVH(@NonNull View itemView) {
            super(itemView);

            title = itemView.findViewById(R.id.title);
            desc = itemView.findViewById(R.id.desc);
            imageView = itemView.findViewById(R.id.img);
        }
    }
}
