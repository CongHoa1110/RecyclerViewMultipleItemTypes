package phanloi.recyclerviewmultipleitemtypes.adapter;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import phanloi.recyclerviewmultipleitemtypes.R;
import phanloi.recyclerviewmultipleitemtypes.model.Header;
import phanloi.recyclerviewmultipleitemtypes.model.Spacu;
import phanloi.recyclerviewmultipleitemtypes.viewholder.BaseViewHolder;
import phanloi.recyclerviewmultipleitemtypes.viewholder.CustomItemViewHolder;
import phanloi.recyclerviewmultipleitemtypes.viewholder.HeaderViewHolder;
import phanloi.recyclerviewmultipleitemtypes.viewholder.ImageItemViewHolder;
import phanloi.recyclerviewmultipleitemtypes.viewholder.ImageViewHolder;
import phanloi.recyclerviewmultipleitemtypes.viewholder.SpaViewholder;
import phanloi.recyclerviewmultipleitemtypes.viewholder.TextItemViewHolder;

public class SpaAdapter extends BaseAdapter<Spacu,RecyclerView.ViewHolder> {
   public static final int ITEM_HEADER = 0;
    public static final int ITEM_TEXT = 1;
    public static final int ITEM_IMAGE = 2;
    public static final int ITEM_ADS = 3;
    public static final int ITEM_CUSTOM = 4;
    public SpaAdapter(Activity activity, List<Spacu> data) {
        super(activity, data);
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        switch (viewType) {
            case ITEM_HEADER:
                return new HeaderViewHolder(layoutManager.inflate(R.layout.item_header, parent, false));
            case ITEM_IMAGE:
                return new ImageViewHolder(layoutManager.inflate(R.layout.item_image,parent,false));
            case ITEM_ADS:
                return new SpaViewholder(layoutManager.inflate(R.layout.item_spa, parent, false));
            default:
                throw new RuntimeException("Not support type=" + viewType);
        }
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        try {
            if (holder instanceof HeaderViewHolder) {
                ((HeaderViewHolder) holder).bindData(data.get(position));
            }
            if (holder instanceof SpaViewholder) {
                ((SpaViewholder) holder).bindData(data.get(position));
            }

             if (holder instanceof ImageViewHolder) {
                ((ImageViewHolder) holder).bindData(data.get(position));
            }

        } catch (Exception e) {
            e.printStackTrace();

            try {
                holder.itemView.setVisibility(View.GONE);
            } catch (Exception i) {
                e.printStackTrace();

            }
        }
    }

    @Override
    public int getItemViewType(int position) {
        return data.get(position).getType();
    }
}

