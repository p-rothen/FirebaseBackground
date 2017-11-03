package com.example.pedrorothen.firebasebackground

import android.util.Log
import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage

/**
 * Created by pedrorothen on 11/3/17.
 */
class FirebaseMessagingService: FirebaseMessagingService() {
    override fun onMessageReceived(p0: RemoteMessage?) {
        super.onMessageReceived(p0)
        Log.d(TAG, p0?.toString())
    }

    companion object {
        val TAG = "FirebaseMessagingServic"
    }
}