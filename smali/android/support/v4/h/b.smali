.class public Landroid/support/v4/h/b;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/support/v4/h/b$c;,
        Landroid/support/v4/h/b$b;,
        Landroid/support/v4/h/b$a;
    }
.end annotation


# static fields
.field static final a:Landroid/support/v4/h/b$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x11

    if-lt v0, v1, :cond_0

    new-instance v0, Landroid/support/v4/h/b$c;

    invoke-direct {v0}, Landroid/support/v4/h/b$c;-><init>()V

    sput-object v0, Landroid/support/v4/h/b;->a:Landroid/support/v4/h/b$a;

    :goto_0
    return-void

    :cond_0
    new-instance v0, Landroid/support/v4/h/b$b;

    invoke-direct {v0}, Landroid/support/v4/h/b$b;-><init>()V

    sput-object v0, Landroid/support/v4/h/b;->a:Landroid/support/v4/h/b$a;

    goto :goto_0
.end method

.method public static a(II)I
    .locals 1

    sget-object v0, Landroid/support/v4/h/b;->a:Landroid/support/v4/h/b$a;

    invoke-interface {v0, p0, p1}, Landroid/support/v4/h/b$a;->a(II)I

    move-result v0

    return v0
.end method
