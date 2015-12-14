package com.intel.mopub_ios_sdk.protocol;


import com.intel.inde.moe.natj.general.ann.Generated;
import com.intel.inde.moe.natj.general.ann.Library;
import com.intel.inde.moe.natj.general.ann.Mapped;
import com.intel.inde.moe.natj.general.ann.Runtime;
import com.intel.inde.moe.natj.objc.ObjCRuntime;
import com.intel.inde.moe.natj.objc.ann.ObjCProtocolName;
import com.intel.inde.moe.natj.objc.ann.Selector;
import com.intel.inde.moe.natj.objc.map.ObjCObjectMapper;
import com.intel.mopub_ios_sdk.MPInterstitialCustomEvent;
import ios.corelocation.CLLocation;
import ios.foundation.NSError;

@Generated
@Library("mopub_ios_sdk")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MPInterstitialCustomEventDelegate")
public interface MPInterstitialCustomEventDelegate {
	@Generated
	@Selector("interstitialCustomEvent:didFailToLoadAdWithError:")
	void interstitialCustomEventDidFailToLoadAdWithError(
			MPInterstitialCustomEvent customEvent, NSError error);

	@Generated
	@Selector("interstitialCustomEvent:didLoadAd:")
	void interstitialCustomEventDidLoadAd(
			MPInterstitialCustomEvent customEvent,
			@Mapped(ObjCObjectMapper.class) Object ad);

	@Generated
	@Selector("interstitialCustomEventDidAppear:")
	void interstitialCustomEventDidAppear(MPInterstitialCustomEvent customEvent);

	@Generated
	@Selector("interstitialCustomEventDidDisappear:")
	void interstitialCustomEventDidDisappear(
			MPInterstitialCustomEvent customEvent);

	@Generated
	@Selector("interstitialCustomEventDidExpire:")
	void interstitialCustomEventDidExpire(MPInterstitialCustomEvent customEvent);

	@Generated
	@Selector("interstitialCustomEventDidReceiveTapEvent:")
	void interstitialCustomEventDidReceiveTapEvent(
			MPInterstitialCustomEvent customEvent);

	@Generated
	@Selector("interstitialCustomEventWillAppear:")
	void interstitialCustomEventWillAppear(MPInterstitialCustomEvent customEvent);

	@Generated
	@Selector("interstitialCustomEventWillDisappear:")
	void interstitialCustomEventWillDisappear(
			MPInterstitialCustomEvent customEvent);

	@Generated
	@Selector("interstitialCustomEventWillLeaveApplication:")
	void interstitialCustomEventWillLeaveApplication(
			MPInterstitialCustomEvent customEvent);

	@Generated
	@Selector("location")
	CLLocation location();

	@Generated
	@Selector("trackClick")
	void trackClick();

	@Generated
	@Selector("trackImpression")
	void trackImpression();
}