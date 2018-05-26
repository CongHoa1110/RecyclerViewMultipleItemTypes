package phanloi.recyclerviewmultipleitemtypes.adapter;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;

import java.util.List;


public abstract class BaseAdapter<T, WH extends RecyclerView.ViewHolder> extends RecyclerView.Adapter<WH> {

    public final LayoutInflater layoutManager;
    public Activity activity;
    public List<T> data;
    private OnItemSelected onItemSelected;
    private OnlongItemSelected onItemLongClickListener;

    protected BaseAdapter(Activity activity, List<T> data) {
        this.activity = activity;
        this.data = data;
        this.layoutManager = LayoutInflater.from(activity);
    }

    @Override
    public void onBindViewHolder(final WH holder, int position) {
        try {
            if (holder.itemView != null){
                if (onItemSelected != null){
                    holder.itemView.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            onItemSelected.onSelected(holder.getAdapterPosition());
                        }
                    });
                }
                if (onItemLongClickListener != null){
                    holder.itemView.setOnLongClickListener(new View.OnLongClickListener() {
                        @Override
                        public boolean onLongClick(View view) {
                            onItemLongClickListener.onLongSelected(holder.getAdapterPosition());
                            return false;
                        }
                    });

                }
            }
        }catch (Exception e){
            e.printStackTrace();
            holder.itemView.setVisibility(View.GONE);
        }
    }

    @Override
    public int getItemCount() {
        return data != null ? data.size() : 0 ;
    }

    @Override
    public void onViewRecycled( WH holder) {
        super.onViewRecycled(holder);
    }

    public interface OnItemSelected {
        void onSelected(int position);
    }

    public interface OnlongItemSelected {
        void onLongSelected(int position);
    }

    public void setOnItemSelected(OnItemSelected onItemSelected) {
        this.onItemSelected = onItemSelected;
    }

    public void setOnItemLongClickListener(OnlongItemSelected onItemLongClickListener) {
        this.onItemLongClickListener = onItemLongClickListener;
    }

    public LayoutInflater getLayoutManager() {
        return layoutManager;
    }

}
