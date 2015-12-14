package com.intel.mopub_ios_sdk.protocol;


import com.intel.inde.moe.natj.general.ann.Generated;
import com.intel.inde.moe.natj.general.ann.Library;
import com.intel.inde.moe.natj.general.ann.Runtime;
import com.intel.inde.moe.natj.objc.ObjCRuntime;
import com.intel.inde.moe.natj.objc.ann.IsOptional;
import com.intel.inde.moe.natj.objc.ann.ObjCProtocolName;
import com.intel.inde.moe.natj.objc.ann.Selector;
import com.intel.mopub_ios_sdk.MPInterstitialAdController;

@Generated
@Library("mopub_ios_sdk")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MPInterstitialAdControllerDelegate")
public interface MPInterstitialAdControllerDelegate {
	@Generated
	@IsOptional
	@Selector("interstitialDidAppear:")
	default void interstitialDidAppear(MPInterstitialAdController interstitial) {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("interstitialDidDisappear:")
	default void interstitialDidDisappear(
			MPInterstitialAdController interstitial) {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("interstitialDidExpire:")
	default void interstitialDidExpire(MPInterstitialAdController interstitial) {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("interstitialDidFailToLoadAd:")
	default void interstitialDidFailToLoadAd(
			MPInterstitialAdController interstitial) {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("interstitialDidLoadAd:")
	default void interstitialDidLoadAd(MPInterstitialAdController interstitial) {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("interstitialDidReceiveTapEvent:")
	default void interstitialDidReceiveTapEvent(
			MPInterstitialAdController interstitial) {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("interstitialWillAppear:")
	default void interstitialWillAppear(MPInterstitialAdController interstitial) {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("interstitialWillDisappear:")
	default void interstitialWillDisappear(
			MPInterstitialAdController interstitial) {
		throw new java.lang.UnsupportedOperationException();
	}
}