package com.intel.mopub_ios_sdk;


import com.intel.inde.moe.natj.general.NatJ;
import com.intel.inde.moe.natj.general.Pointer;
import com.intel.inde.moe.natj.general.ann.Generated;
import com.intel.inde.moe.natj.general.ann.Library;
import com.intel.inde.moe.natj.general.ann.Owned;
import com.intel.inde.moe.natj.general.ann.Runtime;
import com.intel.inde.moe.natj.objc.ObjCRuntime;
import com.intel.inde.moe.natj.objc.ann.ObjCClassBinding;
import com.intel.inde.moe.natj.objc.ann.Selector;
import com.intel.mopub_ios_sdk.protocol.MPAdWebViewAgentDelegate;
import ios.corelocation.CLLocation;
import ios.foundation.NSBundle;
import ios.foundation.NSCoder;
import ios.uikit.UIViewController;

@Generated
@Library("mopub_ios_sdk")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPHTMLInterstitialViewController extends
		MPInterstitialViewController implements MPAdWebViewAgentDelegate {
	static {
		NatJ.register();
	}

	@Generated
	protected MPHTMLInterstitialViewController(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("adActionDidFinish:")
	public native void adActionDidFinish(MPAdWebView ad);

	@Generated
	@Selector("adActionWillBegin:")
	public native void adActionWillBegin(MPAdWebView ad);

	@Generated
	@Selector("adActionWillLeaveApplication:")
	public native void adActionWillLeaveApplication(MPAdWebView ad);

	@Generated
	@Selector("adDidClose:")
	public native void adDidClose(MPAdWebView ad);

	@Generated
	@Selector("adDidFailToLoadAd:")
	public native void adDidFailToLoadAd(MPAdWebView ad);

	@Generated
	@Selector("adDidFinishLoadingAd:")
	public native void adDidFinishLoadingAd(MPAdWebView ad);

	@Generated
	@Selector("adUnitId")
	public native String adUnitId();

	@Generated
	@Owned
	@Selector("alloc")
	public static native MPHTMLInterstitialViewController alloc();

	@Generated
	@Selector("backingViewAgent")
	public native MPAdWebViewAgent backingViewAgent();

	@Generated
	@Selector("init")
	public native MPHTMLInterstitialViewController init();

	@Generated
	@Selector("initWithCoder:")
	public native MPHTMLInterstitialViewController initWithCoder(
			NSCoder aDecoder);

	@Generated
	@Selector("initWithNibName:bundle:")
	public native MPHTMLInterstitialViewController initWithNibNameBundle(
			String nibNameOrNil, NSBundle nibBundleOrNil);

	@Generated
	@Selector("loadConfiguration:")
	public native void loadConfiguration(MPAdConfiguration configuration);

	@Generated
	@Selector("location")
	public native CLLocation location();

	@Generated
	@Selector("setBackingViewAgent:")
	public native void setBackingViewAgent(MPAdWebViewAgent value);

	@Generated
	@Selector("viewControllerForPresentingModalView")
	public native UIViewController viewControllerForPresentingModalView();
}