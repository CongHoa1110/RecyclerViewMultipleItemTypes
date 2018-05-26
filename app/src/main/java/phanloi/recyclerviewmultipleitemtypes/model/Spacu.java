package phanloi.recyclerviewmultipleitemtypes.model;

import android.os.Parcel;
import android.os.Parcelable;

import org.json.JSONException;
import org.json.JSONObject;

import static phanloi.recyclerviewmultipleitemtypes.adapter.SpaAdapter.ITEM_ADS;
import static phanloi.recyclerviewmultipleitemtypes.adapter.SpaAdapter.ITEM_HEADER;
import static phanloi.recyclerviewmultipleitemtypes.adapter.SpaAdapter.ITEM_IMAGE;

public class Spacu implements Parcelable {
    private String mName;
    private String mAddress;
    private String mNumberPhone;
    private int mAvata;
    public static final int ITEM_HEADE = 0;
    public static final int ITEM_TEXT = 1;
    public static final int ITEM_IMAG = 2;
    public static final int ITEM_AD = 3;
    private int type;

    public int getType() {
        switch (type) {
            case ITEM_HEADE:
                return ITEM_HEADER;
            case ITEM_IMAG:
                return ITEM_IMAGE;
            case ITEM_AD:
                return ITEM_ADS;
            default:
                return ITEM_HEADER;
        }
    }

    public Spacu setType(int type) {
        this.type = type;
        return this;
    }

    public String getmName() {
        return mName;
    }

    public Spacu setmName(String mName) {
        this.mName = mName;
        return this;
    }

    public String getmAddress() {
        return mAddress;
    }

    public Spacu setmAddress(String mAddress) {
        this.mAddress = mAddress;
        return this;
    }

    public String getmNumberPhone() {
        return mNumberPhone;
    }

    public Spacu setmNumberPhone(String mNumberPhone) {
        this.mNumberPhone = mNumberPhone;
        return this;
    }

    public int getmAvata() {
        return mAvata;
    }

    public Spacu setmAvata(int mAvata) {
        this.mAvata = mAvata;
        return this;
    }

    public static Creator<Spacu> getCREATOR() {
        return CREATOR;
    }

    public Spacu(String mName, String mAddress, String mNumberPhone, int mAvata, int type) {
        this.mName = mName;
        this.mAddress = mAddress;
        this.mNumberPhone = mNumberPhone;
        this.mAvata = mAvata;
        this.type = type;
    }

    protected Spacu(Parcel in) {
        mName = in.readString();
        mAddress = in.readString();

        mNumberPhone = in.readString();
        mAvata = in.readInt();
    }

    public Spacu(JSONObject object) {
        try {
            this.mAddress = object.getString("address");
            this.mName = object.getString("name");
            this.mNumberPhone = object.getString("numberphone");
            this.mAvata = object.getInt("numberphone");
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public static final Creator<Spacu> CREATOR = new Creator<Spacu>() {
        @Override
        public Spacu createFromParcel(Parcel in) {
            return new Spacu(in);
        }

        @Override
        public Spacu[] newArray(int size) {
            return new Spacu[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(mName);
        parcel.writeString(mAddress);
        parcel.writeString(mNumberPhone);
        parcel.writeInt(mAvata);
    }

    @Override
    public String toString() {
        return "Spacu{" + "mName='" + mName + '\'' + ", mAddress='" + mAddress + '\'' + ", mNumberPhone='" + mNumberPhone + '\'' + ", mAvata=" + mAvata + ", type=" + type + '}';
    }
}
