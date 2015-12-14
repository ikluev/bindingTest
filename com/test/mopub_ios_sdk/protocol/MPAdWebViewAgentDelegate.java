package com.test.mopub_ios_sdk.protocol;


import com.intel.inde.moe.natj.general.ann.Generated;
import com.intel.inde.moe.natj.general.ann.Library;
import com.intel.inde.moe.natj.general.ann.Runtime;
import com.intel.inde.moe.natj.objc.ObjCRuntime;
import com.intel.inde.moe.natj.objc.ann.ObjCProtocolName;
import com.intel.inde.moe.natj.objc.ann.Selector;
import com.test.mopub_ios_sdk.MPAdWebView;
import ios.corelocation.CLLocation;
import ios.uikit.UIViewController;

@Generated
@Library("mopub_ios_sdk")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MPAdWebViewAgentDelegate")
public interface MPAdWebViewAgentDelegate {
	@Generated
	@Selector("adActionDidFinish:")
	void adActionDidFinish(MPAdWebView ad);

	@Generated
	@Selector("adActionWillBegin:")
	void adActionWillBegin(MPAdWebView ad);

	@Generated
	@Selector("adActionWillLeaveApplication:")
	void adActionWillLeaveApplication(MPAdWebView ad);

	@Generated
	@Selector("adDidClose:")
	void adDidClose(MPAdWebView ad);

	@Generated
	@Selector("adDidFailToLoadAd:")
	void adDidFailToLoadAd(MPAdWebView ad);

	@Generated
	@Selector("adDidFinishLoadingAd:")
	void adDidFinishLoadingAd(MPAdWebView ad);

	@Generated
	@Selector("adUnitId")
	String adUnitId();

	@Generated
	@Selector("location")
	CLLocation location();

	@Generated
	@Selector("viewControllerForPresentingModalView")
	UIViewController viewControllerForPresentingModalView();
}