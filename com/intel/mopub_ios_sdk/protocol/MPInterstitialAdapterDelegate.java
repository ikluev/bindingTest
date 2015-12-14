package com.intel.mopub_ios_sdk.protocol;


import com.intel.inde.moe.natj.general.ann.Generated;
import com.intel.inde.moe.natj.general.ann.Library;
import com.intel.inde.moe.natj.general.ann.MappedReturn;
import com.intel.inde.moe.natj.general.ann.Runtime;
import com.intel.inde.moe.natj.objc.ObjCRuntime;
import com.intel.inde.moe.natj.objc.ann.ObjCProtocolName;
import com.intel.inde.moe.natj.objc.ann.Selector;
import com.intel.inde.moe.natj.objc.map.ObjCObjectMapper;
import com.intel.mopub_ios_sdk.MPBaseInterstitialAdapter;
import com.intel.mopub_ios_sdk.MPInterstitialAdController;
import ios.corelocation.CLLocation;
import ios.foundation.NSError;

@Generated
@Library("mopub_ios_sdk")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MPInterstitialAdapterDelegate")
public interface MPInterstitialAdapterDelegate {
	@Generated
	@Selector("adapter:didFailToLoadAdWithError:")
	void adapterDidFailToLoadAdWithError(MPBaseInterstitialAdapter adapter,
			NSError error);

	@Generated
	@Selector("adapterDidFinishLoadingAd:")
	void adapterDidFinishLoadingAd(MPBaseInterstitialAdapter adapter);

	@Generated
	@Selector("interstitialAdController")
	MPInterstitialAdController interstitialAdController();

	@Generated
	@Selector("interstitialDelegate")
	@MappedReturn(ObjCObjectMapper.class)
	Object interstitialDelegate();

	@Generated
	@Selector("interstitialDidAppearForAdapter:")
	void interstitialDidAppearForAdapter(MPBaseInterstitialAdapter adapter);

	@Generated
	@Selector("interstitialDidDisappearForAdapter:")
	void interstitialDidDisappearForAdapter(MPBaseInterstitialAdapter adapter);

	@Generated
	@Selector("interstitialDidExpireForAdapter:")
	void interstitialDidExpireForAdapter(MPBaseInterstitialAdapter adapter);

	@Generated
	@Selector("interstitialDidReceiveTapEventForAdapter:")
	void interstitialDidReceiveTapEventForAdapter(
			MPBaseInterstitialAdapter adapter);

	@Generated
	@Selector("interstitialWillAppearForAdapter:")
	void interstitialWillAppearForAdapter(MPBaseInterstitialAdapter adapter);

	@Generated
	@Selector("interstitialWillDisappearForAdapter:")
	void interstitialWillDisappearForAdapter(MPBaseInterstitialAdapter adapter);

	@Generated
	@Selector("interstitialWillLeaveApplicationForAdapter:")
	void interstitialWillLeaveApplicationForAdapter(
			MPBaseInterstitialAdapter adapter);

	@Generated
	@Selector("location")
	CLLocation location();
}