//
// DO NOT EDIT THIS FILE, IT HAS BEEN GENERATED USING AndroidAnnotations.
//


package nabhack.tapsnap.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import nabhack.tapsnap.R.layout;

public final class ShareActivity_
    extends ShareActivity
{


    @Override
    public void onCreate(Bundle savedInstanceState) {
        init_(savedInstanceState);
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_share);
    }

    private void init_(Bundle savedInstanceState) {
    }

    private void afterSetContentView_() {
    }

    @Override
    public void setContentView(int layoutResID) {
        super.setContentView(layoutResID);
        afterSetContentView_();
    }

    @Override
    public void setContentView(View view, LayoutParams params) {
        super.setContentView(view, params);
        afterSetContentView_();
    }

    @Override
    public void setContentView(View view) {
        super.setContentView(view);
        afterSetContentView_();
    }

    public static ShareActivity_.IntentBuilder_ intent(Context context) {
        return new ShareActivity_.IntentBuilder_(context);
    }

    public static class IntentBuilder_ {

        private Context context_;
        private final Intent intent_;

        public IntentBuilder_(Context context) {
            context_ = context;
            intent_ = new Intent(context, ShareActivity_.class);
        }

        public Intent get() {
            return intent_;
        }

        public ShareActivity_.IntentBuilder_ flags(int flags) {
            intent_.setFlags(flags);
            return this;
        }

        public void start() {
            context_.startActivity(intent_);
        }

        public void startForResult(int requestCode) {
            if (context_ instanceof Activity) {
                ((Activity) context_).startActivityForResult(intent_, requestCode);
            } else {
                context_.startActivity(intent_);
            }
        }

    }

}