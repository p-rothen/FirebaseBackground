package com.example.pedrorothen.firebasebackground

import android.util.Log
import com.google.firebase.iid.FirebaseInstanceId
import com.google.firebase.iid.FirebaseInstanceIdService

/**
 * Created by pedrorothen on 11/3/17.
 */
class FirebaseInstanceIdService : FirebaseInstanceIdService() {
    override fun onTokenRefresh() {
        super.onTokenRefresh()
        Log.d(TAG, "onTokenRefresh: ${FirebaseInstanceId.getInstance().token}")
    }

    companion object {
        val TAG = "FirebaseInstanceIdServ"
    }
}