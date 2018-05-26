package phanloi.recyclerviewmultipleitemtypes.viewholder;

import android.view.View;
import android.widget.TextView;

import butterknife.BindView;
import phanloi.recyclerviewmultipleitemtypes.R;
import phanloi.recyclerviewmultipleitemtypes.model.Header;
import phanloi.recyclerviewmultipleitemtypes.model.Spacu;

public class HeaderViewHolder extends BaseViewHolder<Spacu> {
    @BindView(R.id.txtHeader)
    TextView mTxtHeader;
    public HeaderViewHolder(View itemView) {
        super(itemView);
    }

    @Override
    public void bindData(Spacu object) {
        mTxtHeader.setText(object.getmAddress());
    }
}
