package com.mptechprojects.lab6_20193733.ui.egresos;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.mptechprojects.lab6_20193733.databinding.FragmentEgresosBinding;
import com.mptechprojects.lab6_20193733.databinding.FragmentIngresosBinding;

public class EgresosFragment extends Fragment {

    private FragmentEgresosBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        EgresosViewModel egresosViewModel = new ViewModelProvider(this).get(EgresosViewModel.class);

        binding = FragmentEgresosBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textEgresos;
        egresosViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}