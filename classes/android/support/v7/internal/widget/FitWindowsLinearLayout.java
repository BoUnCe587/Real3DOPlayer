package android.support.v7.internal.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.LinearLayout;

public class FitWindowsLinearLayout extends LinearLayout implements g {
  private g.a a;
  
  public FitWindowsLinearLayout(Context paramContext) { super(paramContext); }
  
  public FitWindowsLinearLayout(Context paramContext, AttributeSet paramAttributeSet) { super(paramContext, paramAttributeSet); }
  
  protected boolean fitSystemWindows(Rect paramRect) {
    if (this.a != null)
      this.a.a(paramRect); 
    return super.fitSystemWindows(paramRect);
  }
  
  public void setOnFitSystemWindowsListener(g.a parama) { this.a = parama; }
}