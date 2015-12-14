package com.test.mopub_ios_sdk.category;


import com.intel.inde.moe.natj.general.NatJ;
import com.intel.inde.moe.natj.general.ann.Generated;
import com.intel.inde.moe.natj.general.ann.Library;
import com.intel.inde.moe.natj.general.ann.Runtime;
import com.intel.inde.moe.natj.objc.ObjCRuntime;
import com.intel.inde.moe.natj.objc.ann.ObjCCategory;
import com.intel.inde.moe.natj.objc.ann.Selector;
import ios.uikit.UIWebView;

@Generated
@Library("mopub_ios_sdk")
@Runtime(ObjCRuntime.class)
@ObjCCategory(UIWebView.class)
public final class UIWebViewExt {
	static {
		NatJ.register();
	}

	@Generated
	private UIWebViewExt() {
	}

	@Generated
	@Selector("disableJavaScriptDialogs")
	public static native void disableJavaScriptDialogs(UIWebView _object);

	@Generated
	@Selector("mp_setScrollable:")
	public static native void mp_setScrollable(UIWebView _object,
			boolean scrollable);
}