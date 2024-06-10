package com.mptechprojects.lab6_20193733.ui.egresos;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class EgresosViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public EgresosViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is dashboard fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}