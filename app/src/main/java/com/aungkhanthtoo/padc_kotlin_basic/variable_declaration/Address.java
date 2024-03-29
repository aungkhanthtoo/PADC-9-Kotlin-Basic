package com.aungkhanthtoo.padc_kotlin_basic.variable_declaration;


import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

/**
 * Created with love by A.K.HTOO on 7/21/2019.
 */

public class Address {
    @NonNull
    private final String mHome;
    @Nullable
    private final String mOffice;

    public Address(@NonNull String mHome,@Nullable String mOffice) {
        this.mHome = mHome;
        this.mOffice = mOffice;
    }

    @NonNull
    public String getHome() {
        return mHome;
    }

    @Nullable
    public String getOffice() {
        return mOffice;
    }

    @Override
    public String toString() {
        return "Address{" +
                "mHome='" + mHome + '\'' +
                ", mOffice='" + mOffice + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return mHome.equals(address.mHome) &&
                mOffice.equals(address.mOffice);
    }
}
