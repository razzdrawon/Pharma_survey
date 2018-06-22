package com.razzdrawon.pharma_survey.view;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.razzdrawon.pharma_survey.R;
import com.razzdrawon.pharma_survey.databinding.ActivityServiceBinding;
import com.razzdrawon.pharma_survey.viewmodel.ServiceViewModel;

import java.util.ArrayList;
import java.util.List;

public class ServiceActivity extends AppCompatActivity {

    private ActivityServiceBinding binding;
    private ServiceViewModel serviceViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initDataBinding();

        setUpServiceSpinner(binding.spnService);
    }

    private void setUpServiceSpinner(Spinner spnService) {

        List<String> list = new ArrayList<String>();
        list.add("Instituto Nacional de Pediatria");
        list.add("Hospital General de Mexico");
        list.add("Hospital Infantil de Mexico");
        list.add("Hospital ABC");
        list.add("Hospital Medica Sur");

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.spinner_item, list);
        spnService.setAdapter(adapter);
    }

    private void initDataBinding () {
        binding = DataBindingUtil.setContentView(this, R.layout.activity_service);
        serviceViewModel = new ServiceViewModel();
        binding.setHandler(serviceViewModel);
    }
}
