package com.hackthealps.paylocal.ui.adapter;

import android.databinding.DataBindingUtil;
import android.support.annotation.Nullable;
import android.support.v7.util.DiffUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.hackthealps.paylocal.R;
import com.hackthealps.paylocal.databinding.EventListItemBinding;
import com.hackthealps.paylocal.model.EventModel;
import com.hackthealps.paylocal.ui.callback.EventModelCallback;

import java.util.List;
import java.util.Objects;

public class EventModelAdapter extends RecyclerView.Adapter<EventModelAdapter.EventModelViewHolder> {

    List<? extends EventModel> eventModelList;

    @Nullable
    private final EventModelCallback eventModelCallback;

    public EventModelAdapter(@Nullable EventModelCallback EventModelCallback) {
        this.eventModelCallback = EventModelCallback;
    }

    public void setEventModelList(final List<? extends EventModel> projectList) {
        if (this.eventModelList == null) {
            this.eventModelList = projectList;
            notifyItemRangeInserted(0, projectList.size());
        } else {
            DiffUtil.DiffResult result = DiffUtil.calculateDiff(new DiffUtil.Callback() {
                @Override
                public int getOldListSize() {
                    return EventModelAdapter.this.eventModelList.size();
                }

                @Override
                public int getNewListSize() {
                    return projectList.size();
                }

                @Override
                public boolean areItemsTheSame(int oldItemPosition, int newItemPosition) {
                    return EventModelAdapter.this.eventModelList.get(oldItemPosition).getTitle() ==
                            projectList.get(newItemPosition).getTitle();
                }

                @Override
                public boolean areContentsTheSame(int oldItemPosition, int newItemPosition) {
                    EventModel project = projectList.get(newItemPosition);
                    EventModel old = projectList.get(oldItemPosition);
                    return Objects.equals(project.getTitle(), old.getTitle());;
                }
            });
            this.eventModelList = projectList;
            result.dispatchUpdatesTo(this);
        }
    }

    @Override
    public EventModelViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        EventListItemBinding binding = DataBindingUtil
                .inflate(LayoutInflater.from(parent.getContext()), R.layout.event_list_item,
                        parent, false);

        binding.setCallback(eventModelCallback);

        return new EventModelViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(EventModelViewHolder holder, int position) {
        holder.binding.setProject(eventModelList.get(position));
        holder.binding.executePendingBindings();
    }

    @Override
    public int getItemCount() {
        return eventModelList == null ? 0 : eventModelList.size();
    }

    static class EventModelViewHolder extends RecyclerView.ViewHolder {

        final EventListItemBinding binding;

        public EventModelViewHolder(EventListItemBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}