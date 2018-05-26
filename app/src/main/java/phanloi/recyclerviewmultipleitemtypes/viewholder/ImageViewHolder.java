package phanloi.recyclerviewmultipleitemtypes.viewholder;

import android.view.View;
import android.widget.ImageView;

import butterknife.BindView;
import phanloi.recyclerviewmultipleitemtypes.R;
import phanloi.recyclerviewmultipleitemtypes.model.Spacu;

public class ImageViewHolder extends BaseViewHolder<Spacu> {
    @BindView(R.id.imageView)
    ImageView mImageView;
    public ImageViewHolder(View itemView) {
        super(itemView);
    }

    @Override
    public void bindData(Spacu object) {
        mImageView.setImageResource(object.getmAvata());
    }
}
