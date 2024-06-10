package com.mptechprojects.lab6_20193733.ui.ingresos;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class IngresosViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public IngresosViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is home fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}