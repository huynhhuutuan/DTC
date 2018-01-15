package com.crashlytics.android.beta;

import android.annotation.TargetApi;
import android.app.Activity;
import io.fabric.sdk.android.ActivityLifecycleManager;
import io.fabric.sdk.android.ActivityLifecycleManager.Callbacks;
import java.util.concurrent.ExecutorService;

@TargetApi(14)
class ActivityLifecycleCheckForUpdatesController extends AbstractCheckForUpdatesController {
    private final Callbacks callbacks = new C08671();
    private final ExecutorService executorService;

    class C08671 extends Callbacks {

        class C02441 implements Runnable {
            C02441() {
            }

            public void run() {
                ActivityLifecycleCheckForUpdatesController.this.checkForUpdates();
            }
        }

        C08671() {
        }

        public void onActivityStarted(Activity activity) {
            if (ActivityLifecycleCheckForUpdatesController.this.signalExternallyReady()) {
                ActivityLifecycleCheckForUpdatesController.this.executorService.submit(new C02441());
            }
        }
    }

    public ActivityLifecycleCheckForUpdatesController(ActivityLifecycleManager lifecycleManager, ExecutorService executorService) {
        this.executorService = executorService;
        lifecycleManager.registerCallbacks(this.callbacks);
    }

    public boolean isActivityLifecycleTriggered() {
        return true;
    }
}
