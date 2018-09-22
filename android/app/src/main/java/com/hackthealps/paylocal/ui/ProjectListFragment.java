package com.hackthealps.paylocal.ui;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProvider;
import android.arch.lifecycle.ViewModelProviders;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.hackthealps.paylocal.R;
import com.hackthealps.paylocal.databinding.FragmentEventListBinding;
import com.hackthealps.paylocal.model.EventModel;
import com.hackthealps.paylocal.ui.adapter.EventModelAdapter;
import com.hackthealps.paylocal.ui.callback.EventModelCallback;

import java.util.List;


public class ProjectListFragment extends Fragment {
    public static final String TAG = "ProjectListFragment";
    private EventModelAdapter projectAdapter;
    private FragmentEventListBinding binding;

    ViewModelProvider.Factory viewModelFactory;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
            @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_event_list, container, false);

        projectAdapter = new EventModelAdapter(projectClickCallback);
        binding.projectList.setAdapter(projectAdapter);
        binding.setIsLoading(true);

        return binding.getRoot();
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        final EventListViewModel viewModel = ViewModelProviders.of(this,
                viewModelFactory).get(EventListViewModel.class);

        observeViewModel(viewModel);
    }

    private void observeViewModel(EventListViewModel viewModel) {
        // Update the list when the data changes
        viewModel.getEventModelObservable().observe(this, new Observer<List<EventModel>>() {
            @Override
            public void onChanged(@Nullable List<EventModel> projects) {
                if (projects != null) {
                   projectAdapter.setEventModelList(projects);
                }
            }
        });
    }

    private final EventModelCallback projectClickCallback = new EventModelCallback() {
        @Override
        public void onClick(EventModel project) {
            //TODO: Change View Pager or so?
        }
    };
}