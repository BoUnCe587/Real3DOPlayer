package android.support.v7.internal.a;

import android.content.Context;
import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import java.util.Locale;

public class a implements TransformationMethod {
  private Locale a;
  
  public a(Context paramContext) { this.a = (paramContext.getResources().getConfiguration()).locale; }
  
  public CharSequence getTransformation(CharSequence paramCharSequence, View paramView) { return (paramCharSequence != null) ? paramCharSequence.toString().toUpperCase(this.a) : null; }
  
  public void onFocusChanged(View paramView, CharSequence paramCharSequence, boolean paramBoolean, int paramInt, Rect paramRect) {}
}