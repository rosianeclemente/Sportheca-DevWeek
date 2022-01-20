package com.example.sportheca.domain;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

public class Pleace implements Parcelable {
    @SerializedName("nome")
    private String name;
    @SerializedName("imagem")
    private String image;

    protected Pleace(Parcel in) {
        name = in.readString();
        image = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeString(image);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<Pleace> CREATOR = new Creator<Pleace>() {
        @Override
        public Pleace createFromParcel(Parcel in) {
            return new Pleace(in);
        }

        @Override
        public Pleace[] newArray(int size) {
            return new Pleace[size];
        }
    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
