package com.mptechprojects.lab6_20193733.ui.resumen;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.mptechprojects.lab6_20193733.databinding.FragmentResumenBinding;

public class ResumenFragment extends Fragment {

    private FragmentResumenBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        ResumenViewModel resumenViewModel =
                new ViewModelProvider(this).get(ResumenViewModel.class);

        binding = FragmentResumenBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textResumen;
        resumenViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}