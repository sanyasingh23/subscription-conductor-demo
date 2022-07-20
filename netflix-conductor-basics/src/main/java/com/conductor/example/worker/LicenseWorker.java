package com.conductor.example.worker;

import com.netflix.conductor.client.worker.Worker;
import com.netflix.conductor.common.metadata.tasks.Task;
import com.netflix.conductor.common.metadata.tasks.TaskResult;
import org.springframework.stereotype.Service;

import java.lang.reflect.Method;

@Service
public class LicenseWorker implements Worker {
    private static final String TYPE_DEF = "license_1";

    @Override
    public String getTaskDefName() {
        return TYPE_DEF;
    }

    @Override
    public TaskResult execute(Task task) {
        System.out.println("License Task - 1 Completed for " + task.getInputData().get("productType"));
        return TaskResult.complete();
    }


}
