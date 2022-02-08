// Generated by view binder compiler. Do not edit!
package com.example.logisticaliot.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.logisticaliot.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityDisplayBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final Button ControlBtn;

  @NonNull
  public final Button DataBtn;

  @NonNull
  public final Button MapBtn;

  @NonNull
  public final Button ReloadBtn;

  @NonNull
  public final WebView webview;

  private ActivityDisplayBinding(@NonNull RelativeLayout rootView, @NonNull Button ControlBtn,
      @NonNull Button DataBtn, @NonNull Button MapBtn, @NonNull Button ReloadBtn,
      @NonNull WebView webview) {
    this.rootView = rootView;
    this.ControlBtn = ControlBtn;
    this.DataBtn = DataBtn;
    this.MapBtn = MapBtn;
    this.ReloadBtn = ReloadBtn;
    this.webview = webview;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityDisplayBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityDisplayBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_display, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityDisplayBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.Control_Btn;
      Button ControlBtn = ViewBindings.findChildViewById(rootView, id);
      if (ControlBtn == null) {
        break missingId;
      }

      id = R.id.Data_Btn;
      Button DataBtn = ViewBindings.findChildViewById(rootView, id);
      if (DataBtn == null) {
        break missingId;
      }

      id = R.id.Map_Btn;
      Button MapBtn = ViewBindings.findChildViewById(rootView, id);
      if (MapBtn == null) {
        break missingId;
      }

      id = R.id.Reload_Btn;
      Button ReloadBtn = ViewBindings.findChildViewById(rootView, id);
      if (ReloadBtn == null) {
        break missingId;
      }

      id = R.id.webview;
      WebView webview = ViewBindings.findChildViewById(rootView, id);
      if (webview == null) {
        break missingId;
      }

      return new ActivityDisplayBinding((RelativeLayout) rootView, ControlBtn, DataBtn, MapBtn,
          ReloadBtn, webview);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}