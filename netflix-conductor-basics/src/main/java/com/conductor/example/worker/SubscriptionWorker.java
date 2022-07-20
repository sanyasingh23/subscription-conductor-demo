package com.conductor.example.worker;

import com.conductor.example.resource.Subscription;
import com.conductor.example.worker.decisiontask.InputParam;
import com.conductor.example.worker.decisiontask.WorkerTask;
import com.netflix.conductor.client.worker.Worker;
import com.netflix.conductor.common.metadata.tasks.Task;
import com.netflix.conductor.common.metadata.tasks.TaskResult;
import jdk.internal.loader.AbstractClassLoaderValue;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class SubscriptionWorker implements Worker {
    private static final String TYPE_DEF = "subscription";

    @Override
    public String getTaskDefName() {
        return TYPE_DEF;
    }

    @Override
    public TaskResult execute(Task task) {
        System.out.println("Subscription Task Completed for " + task.getInputData().get("name"));
        return TaskResult.complete();
    }

    @WorkerTask("get_user_details")
    public Subscription getUserDetails(@InputParam("subscription") Subscription subscription) {

        return subscription;
    }

}
