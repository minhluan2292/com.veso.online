package com.ironsource.sdk.c;

import android.app.Activity;
import android.text.TextUtils;
import android.util.Log;
import android.view.ViewGroup;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ironsource.sdk.a;
import com.ironsource.sdk.a.f;
import com.ironsource.sdk.b.b;
import com.ironsource.sdk.c.e;
import com.ironsource.sdk.utils.Logger;
import com.ironsource.sdk.utils.d;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class c implements e {
    /* access modifiers changed from: private */
    public static final String f = "c";
    /* access modifiers changed from: package-private */
    public final String a;
    public String b;
    /* access modifiers changed from: package-private */
    public WebView c;
    public b d;
    public a e;
    /* access modifiers changed from: private */
    public Activity g;

    public c(com.ironsource.sdk.b.a aVar, Activity activity, String str, a aVar2) {
        this.g = activity;
        b bVar = new b();
        this.d = bVar;
        bVar.d = str;
        this.a = str;
        this.d.a = aVar;
        this.e = aVar2;
    }

    static /* synthetic */ void a(c cVar, final String str) {
        Logger.i(f, "ISNAdViewWebPresenter | createWebView");
        WebView webView = new WebView(cVar.g);
        cVar.c = webView;
        webView.addJavascriptInterface(new b(cVar), "containerMsgHandler");
        cVar.c.setWebViewClient(new com.ironsource.sdk.b.c(new e.a() {
            public final void a(String str) {
                String a2 = c.f;
                Logger.i(a2, "ISNAdViewWebPresenter | WebViewClient | reportOnError: " + str);
                c.this.b(str, str);
            }

            public final void b(String str) {
                String a2 = c.f;
                Logger.i(a2, "ISNAdViewWebPresenter | WebViewClient | onRenderProcessGone: " + str);
                try {
                    ((ViewGroup) c.this.c.getParent()).removeView(c.this.c);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                c.this.c();
            }
        }));
        d.a(cVar.c);
        cVar.d.c = cVar.c;
    }

    static /* synthetic */ String b(c cVar, String str) {
        if (!str.startsWith(".")) {
            return str;
        }
        StringBuilder sb = new StringBuilder("file://");
        sb.append(cVar.b);
        String substring = str.substring(str.indexOf("/") + 1);
        sb.append(substring.substring(substring.indexOf("/")));
        return sb.toString();
    }

    /* access modifiers changed from: private */
    public synchronized void c() {
        a("", "");
    }

    public final synchronized void a(final String str, final String str2) {
        if (this.g != null) {
            Logger.i(f, "performCleanup");
            com.ironsource.environment.e.a.a.a(new Runnable() {
                public final void run() {
                    try {
                        if (c.this.c != null) {
                            c.this.c.destroy();
                        }
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("adViewId", c.this.a);
                        if (c.this.d != null) {
                            c.this.d.a(str, jSONObject);
                            b c2 = c.this.d;
                            c2.a = null;
                            c2.b = null;
                        }
                        b unused = c.this.d = null;
                        Activity unused2 = c.this.g = null;
                    } catch (Exception e) {
                        String a2 = c.f;
                        Log.e(a2, "performCleanup | could not destroy ISNAdView webView ID: " + c.this.a);
                        com.ironsource.sdk.a.d.a(f.o, (Map<String, Object>) new com.ironsource.sdk.a.a().a("callfailreason", e.getMessage()).a);
                        c.this.b(str2, e.getMessage());
                    }
                }
            });
        }
    }

    public final void a(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            b(str3, "action parameter empty");
            return;
        }
        String str4 = f;
        Logger.i(str4, "trying to perform WebView Action: " + str);
        try {
            if (str.equals("onPause")) {
                this.c.onPause();
            } else if (str.equals("onResume")) {
                this.c.onResume();
            } else {
                b(str3, "action not supported");
                return;
            }
            this.d.a(str2);
        } catch (Exception unused) {
            b(str3, "failed to perform action");
        }
    }

    public final void a(JSONObject jSONObject, String str, String str2) {
        try {
            this.d.b(str);
        } catch (Exception e2) {
            String str3 = f;
            Logger.i(str3, "sendHandleGetViewVisibility fail with reason: " + e2.getMessage());
        }
    }

    public final WebView b() {
        return this.c;
    }

    public final void b(String str, String str2) {
        b bVar = this.d;
        if (bVar != null) {
            bVar.a(str, str2);
        }
    }

    public final void b(JSONObject jSONObject, String str, String str2) {
        try {
            this.d.a(jSONObject.getString("params"), str, str2);
        } catch (Exception e2) {
            String str3 = f;
            Logger.i(str3, "sendMessageToAd fail message: " + e2.getMessage());
            throw e2;
        }
    }

    @JavascriptInterface
    public void handleMessageFromAd(String str) {
        b bVar = this.d;
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString(FirebaseAnalytics.Param.METHOD);
            if (TextUtils.isEmpty(optString) || !bVar.c(optString)) {
                bVar.a("containerSendMessage", jSONObject);
            } else if (optString.equalsIgnoreCase("handleGetViewVisibility")) {
                bVar.a(bVar.a(jSONObject).toString(), (String) null, (String) null);
            }
        } catch (JSONException e2) {
            String str2 = bVar.e;
            Log.e(str2, "ISNAdViewLogic | receiveMessageFromExternal | Error while trying handle message: " + str);
            e2.printStackTrace();
        }
    }
}
