package org.aplas.kuis;

import android.os.Parcel;
import android.os.Parcelable;

public class Protokol implements Parcelable {
    private String name;
    private String detail;
    private int photo;


    public Protokol(){

    }


    protected Protokol(Parcel in) {
        name = in.readString();
        detail = in.readString();
        photo = in.readInt();
    }

    public static final Creator<Protokol> CREATOR = new Creator<Protokol>() {
        @Override
        public Protokol createFromParcel(Parcel in) {
            return new Protokol(in);
        }

        @Override
        public Protokol[] newArray(int size) {
            return new Protokol[size];
        }
    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeString(detail);
        dest.writeInt(photo);
    }
}
