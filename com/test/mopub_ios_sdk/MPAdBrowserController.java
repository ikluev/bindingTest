package com.test.mopub_ios_sdk;


import com.intel.inde.moe.natj.general.NatJ;
import com.intel.inde.moe.natj.general.Pointer;
import com.intel.inde.moe.natj.general.ann.Generated;
import com.intel.inde.moe.natj.general.ann.Library;
import com.intel.inde.moe.natj.general.ann.Mapped;
import com.intel.inde.moe.natj.general.ann.MappedReturn;
import com.intel.inde.moe.natj.general.ann.NInt;
import com.intel.inde.moe.natj.general.ann.Owned;
import com.intel.inde.moe.natj.general.ann.Runtime;
import com.intel.inde.moe.natj.objc.ObjCRuntime;
import com.intel.inde.moe.natj.objc.ann.IsOptional;
import com.intel.inde.moe.natj.objc.ann.ObjCClassBinding;
import com.intel.inde.moe.natj.objc.ann.Selector;
import com.intel.inde.moe.natj.objc.map.ObjCObjectMapper;
import com.test.mopub_ios_sdk.protocol.MPAdBrowserControllerDelegate;
import ios.coregraphics.opaque.CGContextRef;
import ios.foundation.NSBundle;
import ios.foundation.NSCoder;
import ios.foundation.NSError;
import ios.foundation.NSURL;
import ios.foundation.NSURLRequest;
import ios.uikit.UIActionSheet;
import ios.uikit.UIActivityIndicatorView;
import ios.uikit.UIBarButtonItem;
import ios.uikit.UIImage;
import ios.uikit.UIViewController;
import ios.uikit.UIWebView;
import ios.uikit.protocol.UIActionSheetDelegate;
import ios.uikit.protocol.UIWebViewDelegate;

@Generated
@Library("mopub_ios_sdk")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPAdBrowserController extends UIViewController implements
		UIWebViewDelegate, UIActionSheetDelegate {
	static {
		NatJ.register();
	}

	@Generated
	protected MPAdBrowserController(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("URL")
	public native NSURL URL();

	@Generated
	@IsOptional
	@Selector("actionSheet:clickedButtonAtIndex:")
	public native void actionSheetClickedButtonAtIndex(
			UIActionSheet actionSheet, @NInt long buttonIndex);

	@Generated
	@IsOptional
	@Selector("actionSheet:didDismissWithButtonIndex:")
	public native void actionSheetDidDismissWithButtonIndex(
			UIActionSheet actionSheet, @NInt long buttonIndex);

	@Generated
	@IsOptional
	@Selector("actionSheet:willDismissWithButtonIndex:")
	public native void actionSheetWillDismissWithButtonIndex(
			UIActionSheet actionSheet, @NInt long buttonIndex);

	@Generated
	@IsOptional
	@Selector("actionSheetCancel:")
	public native void actionSheetCancel(UIActionSheet actionSheet);

	@Generated
	@Owned
	@Selector("alloc")
	public static native MPAdBrowserController alloc();

	@Generated
	@Selector("back")
	public native void back();

	@Generated
	@Selector("backArrowImage")
	public native UIImage backArrowImage();

	@Generated
	@Selector("backButton")
	public native UIBarButtonItem backButton();

	@Generated
	@Selector("createContext")
	public native CGContextRef createContext();

	@Generated
	@Selector("delegate")
	@MappedReturn(ObjCObjectMapper.class)
	public native MPAdBrowserControllerDelegate delegate();

	@Generated
	@IsOptional
	@Selector("didPresentActionSheet:")
	public native void didPresentActionSheet(UIActionSheet actionSheet);

	@Generated
	@Selector("done")
	public native void done();

	@Generated
	@Selector("doneButton")
	public native UIBarButtonItem doneButton();

	@Generated
	@Selector("forward")
	public native void forward();

	@Generated
	@Selector("forwardArrowImage")
	public native UIImage forwardArrowImage();

	@Generated
	@Selector("forwardButton")
	public native UIBarButtonItem forwardButton();

	@Generated
	@Selector("init")
	public native MPAdBrowserController init();

	@Generated
	@Selector("initWithCoder:")
	public native MPAdBrowserController initWithCoder(NSCoder aDecoder);

	@Generated
	@Selector("initWithNibName:bundle:")
	public native MPAdBrowserController initWithNibNameBundle(
			String nibNameOrNil, NSBundle nibBundleOrNil);

	@Generated
	@Selector("initWithURL:HTMLString:delegate:")
	public native MPAdBrowserController initWithURLHTMLStringDelegate(
			NSURL URL,
			String HTMLString,
			@Mapped(ObjCObjectMapper.class) MPAdBrowserControllerDelegate delegate);

	@Generated
	@Selector("refresh")
	public native void refresh();

	@Generated
	@Selector("refreshButton")
	public native UIBarButtonItem refreshButton();

	@Generated
	@Selector("safari")
	public native void safari();

	@Generated
	@Selector("safariButton")
	public native UIBarButtonItem safariButton();

	@Generated
	@Selector("setBackButton:")
	public native void setBackButton(UIBarButtonItem value);

	@Generated
	@Selector("setDelegate:")
	public native void setDelegate_unsafe(
			@Mapped(ObjCObjectMapper.class) MPAdBrowserControllerDelegate value);

	@Generated
	public void setDelegate(
			@Mapped(ObjCObjectMapper.class) MPAdBrowserControllerDelegate value) {
		Object __old = delegate();
		if (value != null) {
			com.intel.inde.moe.natj.objc.ObjCRuntime.associateObjCObject(this,
					value);
		}
		setDelegate_unsafe(value);
		if (__old != null) {
			com.intel.inde.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this,
					__old);
		}
	}

	@Generated
	@Selector("setDoneButton:")
	public native void setDoneButton(UIBarButtonItem value);

	@Generated
	@Selector("setForwardButton:")
	public native void setForwardButton(UIBarButtonItem value);

	@Generated
	@Selector("setRefreshButton:")
	public native void setRefreshButton(UIBarButtonItem value);

	@Generated
	@Selector("setSafariButton:")
	public native void setSafariButton(UIBarButtonItem value);

	@Generated
	@Selector("setSpinner:")
	public native void setSpinner(UIActivityIndicatorView value);

	@Generated
	@Selector("setSpinnerItem:")
	public native void setSpinnerItem(UIBarButtonItem value);

	@Generated
	@Selector("setURL:")
	public native void setURL(NSURL value);

	@Generated
	@Selector("setWebView:")
	public native void setWebView(UIWebView value);

	@Generated
	@Selector("spinner")
	public native UIActivityIndicatorView spinner();

	@Generated
	@Selector("spinnerItem")
	public native UIBarButtonItem spinnerItem();

	@Generated
	@Selector("webView")
	public native UIWebView webView();

	@Generated
	@IsOptional
	@Selector("webView:didFailLoadWithError:")
	public native void webViewDidFailLoadWithError(UIWebView webView,
			NSError error);

	@Generated
	@IsOptional
	@Selector("webView:shouldStartLoadWithRequest:navigationType:")
	public native boolean webViewShouldStartLoadWithRequestNavigationType(
			UIWebView webView, NSURLRequest request, @NInt long navigationType);

	@Generated
	@IsOptional
	@Selector("webViewDidFinishLoad:")
	public native void webViewDidFinishLoad(UIWebView webView);

	@Generated
	@IsOptional
	@Selector("webViewDidStartLoad:")
	public native void webViewDidStartLoad(UIWebView webView);

	@Generated
	@IsOptional
	@Selector("willPresentActionSheet:")
	public native void willPresentActionSheet(UIActionSheet actionSheet);
}