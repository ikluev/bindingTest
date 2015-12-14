package com.test.mopub_ios_sdk.protocol;


import com.intel.inde.moe.natj.general.ann.Generated;
import com.intel.inde.moe.natj.general.ann.Library;
import com.intel.inde.moe.natj.general.ann.Runtime;
import com.intel.inde.moe.natj.objc.ObjCRuntime;
import com.intel.inde.moe.natj.objc.ann.ObjCProtocolName;
import com.intel.inde.moe.natj.objc.ann.Selector;
import com.test.mopub_ios_sdk.MPInterstitialViewController;
import ios.corelocation.CLLocation;

@Generated
@Library("mopub_ios_sdk")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MPInterstitialViewControllerDelegate")
public interface MPInterstitialViewControllerDelegate {
	@Generated
	@Selector("adUnitId")
	String adUnitId();

	@Generated
	@Selector("interstitialDidAppear:")
	void interstitialDidAppear(MPInterstitialViewController interstitial);

	@Generated
	@Selector("interstitialDidDisappear:")
	void interstitialDidDisappear(MPInterstitialViewController interstitial);

	@Generated
	@Selector("interstitialDidFailToLoadAd:")
	void interstitialDidFailToLoadAd(MPInterstitialViewController interstitial);

	@Generated
	@Selector("interstitialDidLoadAd:")
	void interstitialDidLoadAd(MPInterstitialViewController interstitial);

	@Generated
	@Selector("interstitialDidReceiveTapEvent:")
	void interstitialDidReceiveTapEvent(
			MPInterstitialViewController interstitial);

	@Generated
	@Selector("interstitialWillAppear:")
	void interstitialWillAppear(MPInterstitialViewController interstitial);

	@Generated
	@Selector("interstitialWillDisappear:")
	void interstitialWillDisappear(MPInterstitialViewController interstitial);

	@Generated
	@Selector("interstitialWillLeaveApplication:")
	void interstitialWillLeaveApplication(
			MPInterstitialViewController interstitial);

	@Generated
	@Selector("location")
	CLLocation location();
}