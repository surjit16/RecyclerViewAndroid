package in.surjitsingh.recyclerviewandroid.json;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutCompat;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

import in.surjitsingh.recyclerviewandroid.R;

public class JSONRVActivity extends AppCompatActivity {

    // GO TO myjson.com to create own json
    String jsonLink = "https://api.myjson.com/bins/k2upk";
    int[] img = {
            R.drawable.ic_arrow_back_black,
            R.drawable.ic_close,
            R.drawable.ic_s,
            R.drawable.ic_p,
            R.drawable.ic_per,
            R.drawable.ic_cellphone,
            R.drawable.ic_settings_black_24dp,
            R.drawable.ic_binary_code,
            R.drawable.ic_launcher_background
    };


    RecyclerView recyclerView;
    MyAdapter myAdapter;
    List<JsonData> dataList;
    View pbView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jsonrv);
        pbView = findViewById(R.id.pbView);
        pbView.setVisibility(View.VISIBLE);
        recyclerView = findViewById(R.id.jsonRV);
        dataList = new ArrayList<>();

        JsonObjectRequest request = new JsonObjectRequest(Request.Method.GET, jsonLink, null, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                try {
                    JSONArray array = response.getJSONArray("student");
                    Log.e("AAAAAAA", "A1 "+array.length()+" "+array.getJSONObject(0).getString("name"));
                    Log.e("AAAAAAA", "A2 "+array.length()+" "+array.getJSONObject(0).getString("mob"));
                    Log.e("AAAAAAA", "A3 "+array.length()+" "+array.getJSONObject(0).getString("about"));
                    JsonData person;
                    for (int i = 0; i < array.length(); i++) {
                        JSONObject jsonObject = array.getJSONObject(i);
                        person = new JsonData(img[i], jsonObject.getString("name"), jsonObject.getInt("mob") + "", jsonObject.getString("about"));
                        dataList.add(person);
                    }
                    myAdapter.notifyDataSetChanged();
                    pbView.setVisibility(View.GONE);
                } catch (JSONException e) {
                    e.printStackTrace();
                    Toast.makeText(JSONRVActivity.this, " Eoorrr ", Toast.LENGTH_SHORT).show();
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(JSONRVActivity.this, "Erorrrrrrrrr", Toast.LENGTH_SHORT).show();
            }
        });


        LinearLayoutManager manager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(manager);

        myAdapter = new MyAdapter(this, dataList);
        recyclerView.setAdapter(myAdapter);
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayoutCompat.VERTICAL));

        RequestQueue requestQueue = Volley.newRequestQueue(this);
        requestQueue.add(request);
    }
}
