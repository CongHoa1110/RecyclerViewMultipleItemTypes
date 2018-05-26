package phanloi.recyclerviewmultipleitemtypes;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import phanloi.recyclerviewmultipleitemtypes.adapter.BaseAdapter;
import phanloi.recyclerviewmultipleitemtypes.adapter.DividerItemDecorationn;
import phanloi.recyclerviewmultipleitemtypes.adapter.SpaAdapter;
import phanloi.recyclerviewmultipleitemtypes.model.Spacu;

public class MainActivity extends AppCompatActivity implements SpaAdapter.OnItemSelected{

    @BindView(R.id.recyclerView)
    RecyclerView mRecyclerView;
    List<Spacu> spacuList;
    SpaAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        mRecyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
       /* MyAdapter myAdapter = new MyAdapter();
        mRecyclerView.setAdapter(myAdapter);
        mRecyclerView.addItemDecoration(new DividerItemDecorationn(getResources().getDimensionPixelOffset(R.dimen.divider)));
        myAdapter.setItemList(ItemBuilder.randomList(this));*/
        spacuList = getSpacuList();

        adapter = new SpaAdapter(MainActivity.this, spacuList);
        mRecyclerView.setAdapter(adapter);
        mRecyclerView.addItemDecoration(
                new DividerItemDecorationn(MainActivity.this, null));
       /* mRecyclerView.addItemDecoration(
                new DividerItemDecorationn(getResources().getDrawable(R.drawable.sample),
                        false, false));*/
     /*   mRecyclerView.addItemDecoration(
                new DividerItemDecorationn(MainActivity.this, R.drawable.sample,
                        false, false));*/
       /* mRecyclerView.addItemDecoration(
                new SpaceItemDecoration(MainActivity.this, R.dimen.adsPadding,
                        true , true));*/

        //add drive google


    }

    private List<Spacu> getSpacuList() {
        List<Spacu> spacuList = new ArrayList<>();
        spacuList.add(new Spacu("linhspa","HaNoi","0900550555",R.drawable.sample,0));
        spacuList.add(new Spacu("linhspa","HaNoi","0900550555",R.drawable.sample,2));
        spacuList.add(new Spacu("linhspa","HaNoi","0900550555",R.drawable.sample,3));
        spacuList.add(new Spacu("linhspa","HaNoi","0900550555",R.drawable.sample,3));
        spacuList.add(new Spacu("linhspa","HaNoi","0900550555",R.drawable.sample,3));
        spacuList.add(new Spacu("linhspa","HaNoi","0900550555",R.drawable.sample,3));
        spacuList.add(new Spacu("linhspa","HaNoi","0900550555",R.drawable.sample,3));
        spacuList.add(new Spacu("linhspa","HaNoi","0900550555",R.drawable.sample,3));
        spacuList.add(new Spacu("linhspa","HaNoi","0900550555",R.drawable.sample,3));
        spacuList.add(new Spacu("linhspa","HaNoi","0900550555",R.drawable.sample,3));
        spacuList.add(new Spacu("linhspa","HaNoi","0900550555",R.drawable.sample,3));
        spacuList.add(new Spacu("linhspa","HaNoi","0900550555",R.drawable.sample,3));
        spacuList.add(new Spacu("linhspa","HaNoi","0900550555",R.drawable.sample,3));
        spacuList.add(new Spacu("linhspa","HaNoi","0900550555",R.drawable.sample,3));
        spacuList.add(new Spacu("linhspa","HaNoi","0900550555",R.drawable.sample,3));
        spacuList.add(new Spacu("linhspa","HaNoi","0900550555",R.drawable.sample,3));
        return spacuList;
    }

    @Override
    public void onSelected(int position) {
        Toast.makeText(this, spacuList.get(position).getmName(), Toast.LENGTH_SHORT).show();
    }
}
