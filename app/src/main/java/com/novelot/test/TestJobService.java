package com.novelot.test;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Log;

/**
 * Created by V on 2015/6/18.
 */
public class TestJobService extends JobService {
    public TestJobService() {
        super();
    }

    int i ;
    @Override
    public boolean onStartJob(JobParameters params) {
        Log.v("job",""+i++);
        return true;
    }

    @Override
    public boolean onStopJob(JobParameters params) {
        return true;
    }
}
