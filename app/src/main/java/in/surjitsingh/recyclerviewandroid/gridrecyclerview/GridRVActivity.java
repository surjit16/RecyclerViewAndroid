package in.surjitsingh.recyclerviewandroid.gridrecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutCompat;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import in.surjitsingh.recyclerviewandroid.R;
import in.surjitsingh.recyclerviewandroid.d.Data;

public class GridRVActivity extends AppCompatActivity {

    RecyclerView gRecyclerView;
    RAdapterClass adapter;
    List<Data> dataList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_rv);

        gRecyclerView = findViewById(R.id.gridRV);

        GridLayoutManager manager = new GridLayoutManager(this, 3);

        gRecyclerView.setLayoutManager(manager);

        dataList = new ArrayList<>();
        dataList.add(new Data(R.drawable.ic_cellphone, "Cellphone", "This is CellPhone Description"));
        dataList.add(new Data(R.drawable.ic_launcher_background, "Background", "This is Background Description"));
        dataList.add(new Data(R.drawable.ic_p, "P Symbol", "This is P Symbol Description"));
        dataList.add(new Data(R.drawable.ic_s, "S Symbol", "This is P Symbol Description"));
        dataList.add(new Data(R.drawable.ic_per, "Persons", "This is Persons Description"));
        dataList.add(new Data(R.drawable.ic_binary_code, "Binary Code", "This is Binary Code Description"));
        dataList.add(new Data(R.drawable.ic_settings_black_24dp, "Settings", "This is Settings Description"));
        dataList.add(new Data(R.drawable.ic_close, "Close", "This is Close Description"));
        dataList.add(new Data(R.drawable.ic_adb_black_24dp, "ADB", "This is ADB Description"));

        adapter = new RAdapterClass(this, dataList);
        gRecyclerView.setAdapter(adapter);

        gRecyclerView.addItemDecoration(new DividerItemDecoration(this, GridLayoutManager.VERTICAL));

    }
}
