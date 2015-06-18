package com.novelot.test;

import android.app.Activity;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.StrictMode;
import android.os.SystemClock;
import android.util.Log;

import java.util.Calendar;

public class MainActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


//        JobInfo uploadTask = new JobInfo.Builder(mJobId, mServiceComponent /* JobService component */)
//                .setRequiredNetworkCapabilities(JobInfo.NetworkType.UNMETERED)
//                .build();
//        JobScheduler jobScheduler = (JobScheduler) context.getSystemService(Context.JOB_SCHEDULER_SERVICE);
//        jobScheduler.schedule(uploadTask);

//        JobInfo jobInfo = new JobInfo.Builder(127,new ComponentName(getApplication(),TestJobService.class))
//                .setRequiredNetworkType(JobInfo.NETWORK_TYPE_UNMETERED)
//                .setRequiresDeviceIdle(true)
//                .build();
//        JobScheduler jobScheduler =
//                (JobScheduler) getSystemService(Context.JOB_SCHEDULER_SERVICE);
//        jobScheduler.schedule(jobInfo);

//        Calendar cal = Calendar.getInstance();
//        cal.set
        Log.e("job", "job");
        long time = SystemClock.currentThreadTimeMillis() + 1000 * 2 * 30;
        Intent intent = new Intent(getApplication(), TestIntentService.class);
        PendingIntent pendingIntent = PendingIntent.getService(getApplication(), 0, intent, PendingIntent.FLAG_UPDATE_CURRENT);
        AlarmManager alarmManager = (AlarmManager) getSystemService(Context.ALARM_SERVICE);
        alarmManager.set(AlarmManager.RTC_WAKEUP, time, pendingIntent);
        finish();
    }


}
