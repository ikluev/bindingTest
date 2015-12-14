package com.intel.mopub_ios_sdk.protocol;


import com.intel.inde.moe.natj.general.ann.Generated;
import com.intel.inde.moe.natj.general.ann.Library;
import com.intel.inde.moe.natj.general.ann.Runtime;
import com.intel.inde.moe.natj.objc.ObjCRuntime;
import com.intel.inde.moe.natj.objc.ann.IsOptional;
import com.intel.inde.moe.natj.objc.ann.ObjCProtocolName;
import com.intel.inde.moe.natj.objc.ann.Selector;
import com.intel.mopub_ios_sdk.MPAdView;
import ios.uikit.UIViewController;

@Generated
@Library("mopub_ios_sdk")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MPAdViewDelegate")
public interface MPAdViewDelegate {
	@Generated
	@IsOptional
	@Selector("adViewDidFailToLoadAd:")
	default void adViewDidFailToLoadAd(MPAdView view) {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("adViewDidLoadAd:")
	default void adViewDidLoadAd(MPAdView view) {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("didDismissModalViewForAd:")
	default void didDismissModalViewForAd(MPAdView view) {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@Selector("viewControllerForPresentingModalView")
	UIViewController viewControllerForPresentingModalView();

	@Generated
	@IsOptional
	@Selector("willLeaveApplicationFromAd:")
	default void willLeaveApplicationFromAd(MPAdView view) {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("willPresentModalViewForAd:")
	default void willPresentModalViewForAd(MPAdView view) {
		throw new java.lang.UnsupportedOperationException();
	}
}