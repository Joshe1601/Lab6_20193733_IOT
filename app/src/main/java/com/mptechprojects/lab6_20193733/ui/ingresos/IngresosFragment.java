package com.mptechprojects.lab6_20193733.ui.ingresos;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.mptechprojects.lab6_20193733.databinding.FragmentIngresosBinding;

public class IngresosFragment extends Fragment {

    private FragmentIngresosBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        IngresosViewModel ingresosViewModel =
                new ViewModelProvider(this).get(IngresosViewModel.class);

        binding = FragmentIngresosBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textIngresos;
        ingresosViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}