package phanloi.recyclerviewmultipleitemtypes;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import phanloi.recyclerviewmultipleitemtypes.adapter.MyAdapter;
import phanloi.recyclerviewmultipleitemtypes.adapter.SpaAdapter;
import phanloi.recyclerviewmultipleitemtypes.adapter.SpaceDividerItemDecoration;
import phanloi.recyclerviewmultipleitemtypes.model.Spacu;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.recyclerView)
    RecyclerView mRecyclerView;
    List<Spacu> spacuList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        mRecyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
       /* MyAdapter myAdapter = new MyAdapter();
        mRecyclerView.setAdapter(myAdapter);
        mRecyclerView.addItemDecoration(new SpaceDividerItemDecoration(getResources().getDimensionPixelOffset(R.dimen.divider)));
        myAdapter.setItemList(ItemBuilder.randomList(this));*/
        spacuList = getSpacuList();
        SpaAdapter adapter = new SpaAdapter(MainActivity.this, spacuList);
        mRecyclerView.setAdapter(adapter);
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
}
