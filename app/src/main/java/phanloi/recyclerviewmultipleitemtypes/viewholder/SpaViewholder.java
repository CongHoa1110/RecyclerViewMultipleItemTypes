package phanloi.recyclerviewmultipleitemtypes.viewholder;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.BindView;
import phanloi.recyclerviewmultipleitemtypes.R;
import phanloi.recyclerviewmultipleitemtypes.model.Spacu;

public class SpaViewholder extends BaseViewHolder<Spacu> {
    @BindView(R.id.txt_name)
    TextView txtName;
    @BindView(R.id.txt_address)
    TextView txt_address;
    @BindView(R.id.txt_number)
    TextView txt_number;
    @BindView(R.id.img_avata)
    ImageView img_avata;

    public SpaViewholder(View itemView) {
        super(itemView);
    }

    @Override
    public void bindData(Spacu object) {
        txtName.setText(object.getmName());
        txt_address.setText(object.getmAddress());
        txt_number.setText(object.getmNumberPhone());
        img_avata.setImageResource(object.getmAvata());
    }
}
