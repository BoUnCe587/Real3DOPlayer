package android.support.v4.widget;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public abstract class i extends b {
  private int j;
  
  private int k;
  
  private LayoutInflater l;
  
  public i(Context paramContext, int paramInt, Cursor paramCursor, boolean paramBoolean) {
    super(paramContext, paramCursor, paramBoolean);
    this.k = paramInt;
    this.j = paramInt;
    this.l = (LayoutInflater)paramContext.getSystemService("layout_inflater");
  }
  
  public View a(Context paramContext, Cursor paramCursor, ViewGroup paramViewGroup) { return this.l.inflate(this.j, paramViewGroup, false); }
  
  public View b(Context paramContext, Cursor paramCursor, ViewGroup paramViewGroup) { return this.l.inflate(this.k, paramViewGroup, false); }
}