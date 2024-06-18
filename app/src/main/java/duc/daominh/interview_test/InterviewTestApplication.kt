package duc.daominh.interview_test

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class InterviewTestApplication : Application() {
    companion object {
        val DEBUG_TAG = InterviewTestApplication.javaClass.simpleName
        val INTERNET_NOT_AVAILABLE_MESSAGE = "Internet is not available"
    }
}