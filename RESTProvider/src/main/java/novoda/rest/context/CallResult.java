
package novoda.rest.context;

import novoda.rest.services.CallInfo;

import android.os.Parcel;
import android.os.Parcelable;

public class CallResult implements Parcelable {

    public static final int RESULT_OK = 0;

    public static final int RESULT_CANCEL = 1;

    public static final int RESULT_ERROR = 2;

    public int status;

    public String message;

    public CallInfo call;

    private CallResult(Parcel parcel) {
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel arg0, int arg1) {
    }

    public static final Parcelable.Creator<CallResult> CREATOR = new Parcelable.Creator<CallResult>() {
        @Override
        public CallResult createFromParcel(Parcel parcel) {
            return new CallResult(parcel);
        }

        @Override
        public CallResult[] newArray(int size) {
            return new CallResult[size];
        }
    };
}
