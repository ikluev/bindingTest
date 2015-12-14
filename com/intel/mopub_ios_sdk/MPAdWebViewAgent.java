package com.intel.mopub_ios_sdk;


import com.intel.inde.moe.natj.general.NatJ;
import com.intel.inde.moe.natj.general.Pointer;
import com.intel.inde.moe.natj.general.ann.ByValue;
import com.intel.inde.moe.natj.general.ann.Generated;
import com.intel.inde.moe.natj.general.ann.Library;
import com.intel.inde.moe.natj.general.ann.Mapped;
import com.intel.inde.moe.natj.general.ann.MappedReturn;
import com.intel.inde.moe.natj.general.ann.NInt;
import com.intel.inde.moe.natj.general.ann.NUInt;
import com.intel.inde.moe.natj.general.ann.Owned;
import com.intel.inde.moe.natj.general.ann.Runtime;
import com.intel.inde.moe.natj.objc.ObjCRuntime;
import com.intel.inde.moe.natj.objc.ann.IsOptional;
import com.intel.inde.moe.natj.objc.ann.ObjCClassBinding;
import com.intel.inde.moe.natj.objc.ann.Selector;
import com.intel.inde.moe.natj.objc.map.ObjCObjectMapper;
import com.intel.mopub_ios_sdk.protocol.MPAdDestinationDisplayAgentDelegate;
import com.intel.mopub_ios_sdk.protocol.MPAdWebViewAgentDelegate;
import ios.NSObject;
import ios.coregraphics.struct.CGRect;
import ios.foundation.NSError;
import ios.foundation.NSURLRequest;
import ios.uikit.UIViewController;
import ios.uikit.UIWebView;
import ios.uikit.protocol.UIWebViewDelegate;

@Generated
@Library("mopub_ios_sdk")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPAdWebViewAgent extends NSObject implements UIWebViewDelegate,
		MPAdDestinationDisplayAgentDelegate {
	static {
		NatJ.register();
	}

	@Generated
	protected MPAdWebViewAgent(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native MPAdWebViewAgent alloc();

	@Generated
	@Selector("delegate")
	@MappedReturn(ObjCObjectMapper.class)
	public native MPAdWebViewAgentDelegate delegate();

	@Generated
	@Selector("disableRequestHandling")
	public native void disableRequestHandling();

	@Generated
	@Selector("displayAgentDidDismissModal")
	public native void displayAgentDidDismissModal();

	@Generated
	@Selector("displayAgentWillLeaveApplication")
	public native void displayAgentWillLeaveApplication();

	@Generated
	@Selector("displayAgentWillPresentModal")
	public native void displayAgentWillPresentModal();

	@Generated
	@Selector("enableRequestHandling")
	public native void enableRequestHandling();

	@Generated
	@Selector("forceRedraw")
	public native void forceRedraw();

	@Generated
	@Selector("init")
	public native MPAdWebViewAgent init();

	@Generated
	@Selector("initWithAdWebViewFrame:delegate:")
	public native MPAdWebViewAgent initWithAdWebViewFrameDelegate(
			@ByValue CGRect frame,
			@Mapped(ObjCObjectMapper.class) MPAdWebViewAgentDelegate delegate);

	@Generated
	@Selector("invokeJavaScriptForEvent:")
	public native void invokeJavaScriptForEvent(@NUInt long event);

	@Generated
	@Selector("loadConfiguration:")
	public native void loadConfiguration(MPAdConfiguration configuration);

	@Generated
	@Selector("rotateToOrientation:")
	public native void rotateToOrientation(@NInt long orientation);

	@Generated
	@Selector("setDelegate:")
	public native void setDelegate_unsafe(
			@Mapped(ObjCObjectMapper.class) MPAdWebViewAgentDelegate value);

	@Generated
	public void setDelegate(
			@Mapped(ObjCObjectMapper.class) MPAdWebViewAgentDelegate value) {
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
	@Selector("setView:")
	public native void setView(MPAdWebView value);

	@Generated
	@Selector("view")
	public native MPAdWebView view();

	@Generated
	@Selector("viewControllerForPresentingModalView")
	public native UIViewController viewControllerForPresentingModalView();

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
}