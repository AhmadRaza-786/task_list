package com.example.tasklist.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tasklist.R;
import com.example.tasklist.model.Task;

import java.util.List;

public class AddTaskAdapter extends RecyclerView.Adapter<AddTaskAdapter.MyViewHolder> {

    private List<Task> listTask;
    public AddTaskAdapter(List<Task> list) {
        this.listTask = list;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemList = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_add_task, parent, false);
        return new MyViewHolder(itemList);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Task task = listTask.get(position);
        holder.taskText.setText(task.getTaskName());

    }

    @Override
    public int getItemCount() {
        return this.listTask.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        private TextView taskText;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            taskText = itemView.findViewById(R.id.textTask);
        }
    }
}
