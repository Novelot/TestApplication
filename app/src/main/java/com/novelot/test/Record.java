package com.novelot.test;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by V on 2015/6/17.
 */
public class Record implements Parcelable {

    private int eventCode;
    private static Parcelable.Creator CREATOR = new Parcelable.Creator() {
        @Override
        public Record createFromParcel(Parcel source) {
            return new Record(source);
        }

        @Override
        public Record[] newArray(int size) {
            return new Record[size];
        }
    };

    public Record(Parcel source) {
        eventCode = source.readInt();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(eventCode);
    }
}
