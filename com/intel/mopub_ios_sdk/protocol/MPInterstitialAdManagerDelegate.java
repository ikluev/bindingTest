package com.intel.mopub_ios_sdk.protocol;


import com.intel.inde.moe.natj.general.ann.Generated;
import com.intel.inde.moe.natj.general.ann.Library;
import com.intel.inde.moe.natj.general.ann.MappedReturn;
import com.intel.inde.moe.natj.general.ann.Runtime;
import com.intel.inde.moe.natj.objc.ObjCRuntime;
import com.intel.inde.moe.natj.objc.ann.ObjCProtocolName;
import com.intel.inde.moe.natj.objc.ann.Selector;
import com.intel.inde.moe.natj.objc.map.ObjCObjectMapper;
import com.intel.mopub_ios_sdk.MPInterstitialAdController;
import com.intel.mopub_ios_sdk.MPInterstitialAdManager;
import ios.corelocation.CLLocation;
import ios.foundation.NSError;

@Generated
@Library("mopub_ios_sdk")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MPInterstitialAdManagerDelegate")
public interface MPInterstitialAdManagerDelegate {
	@Generated
	@Selector("interstitialAdController")
	MPInterstitialAdController interstitialAdController();

	@Generated
	@Selector("interstitialDelegate")
	@MappedReturn(ObjCObjectMapper.class)
	Object interstitialDelegate();

	@Generated
	@Selector("location")
	CLLocation location();

	@Generated
	@Selector("manager:didFailToLoadInterstitialWithError:")
	void managerDidFailToLoadInterstitialWithError(
			MPInterstitialAdManager manager, NSError error);

	@Generated
	@Selector("managerDidDismissInterstitial:")
	void managerDidDismissInterstitial(MPInterstitialAdManager manager);

	@Generated
	@Selector("managerDidExpireInterstitial:")
	void managerDidExpireInterstitial(MPInterstitialAdManager manager);

	@Generated
	@Selector("managerDidLoadInterstitial:")
	void managerDidLoadInterstitial(MPInterstitialAdManager manager);

	@Generated
	@Selector("managerDidPresentInterstitial:")
	void managerDidPresentInterstitial(MPInterstitialAdManager manager);

	@Generated
	@Selector("managerDidReceiveTapEventFromInterstitial:")
	void managerDidReceiveTapEventFromInterstitial(
			MPInterstitialAdManager manager);

	@Generated
	@Selector("managerWillDismissInterstitial:")
	void managerWillDismissInterstitial(MPInterstitialAdManager manager);

	@Generated
	@Selector("managerWillPresentInterstitial:")
	void managerWillPresentInterstitial(MPInterstitialAdManager manager);
}