package com.razzdrawon.pharma_survey.view;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.razzdrawon.pharma_survey.R;
import com.razzdrawon.pharma_survey.databinding.ActivityServiceBinding;
import com.razzdrawon.pharma_survey.model.Option;
import com.razzdrawon.pharma_survey.model.QuestionItem;
import com.razzdrawon.pharma_survey.model.Section;
import com.razzdrawon.pharma_survey.model.Survey;
import com.razzdrawon.pharma_survey.viewmodel.ServiceViewModel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ServiceActivity extends AppCompatActivity {

    private ActivityServiceBinding binding;
    private ServiceViewModel serviceViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initDataBinding();

        setUpServiceSpinners(binding.spnTypeService, binding.spnService);



    }

    private void setUpServiceSpinners(Spinner spnTypeService, Spinner spnService) {

        ArrayAdapter<String> adapterType = new ArrayAdapter<String>(this, R.layout.spinner_item, getResources().getStringArray(R.array.stablishment_array));
        spnTypeService.setAdapter(adapterType);

        ArrayAdapter<String> adapterService = new ArrayAdapter<String>(this, R.layout.spinner_item, getResources().getStringArray(R.array.type_service_array));
        spnService.setAdapter(adapterService);
    }

    private void initDataBinding () {
        binding = DataBindingUtil.setContentView(this, R.layout.activity_service);
        serviceViewModel = new ServiceViewModel();
        binding.setHandler(serviceViewModel);
    }

}
