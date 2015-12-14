package com.intel.mopub_ios_sdk.protocol;


import com.intel.inde.moe.natj.general.ann.Generated;
import com.intel.inde.moe.natj.general.ann.Library;
import com.intel.inde.moe.natj.general.ann.Runtime;
import com.intel.inde.moe.natj.objc.ObjCRuntime;
import com.intel.inde.moe.natj.objc.ann.IsOptional;
import com.intel.inde.moe.natj.objc.ann.ObjCProtocolName;
import com.intel.inde.moe.natj.objc.ann.Selector;
import com.intel.mopub_ios_sdk.MPNativeAd;
import ios.uikit.UIViewController;

@Generated
@Library("mopub_ios_sdk")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MPNativeAdDelegate")
public interface MPNativeAdDelegate {
	@Generated
	@IsOptional
	@Selector("didDismissModalForNativeAd:")
	default void didDismissModalForNativeAd(MPNativeAd nativeAd) {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@Selector("viewControllerForPresentingModalView")
	UIViewController viewControllerForPresentingModalView();

	@Generated
	@IsOptional
	@Selector("willLeaveApplicationFromNativeAd:")
	default void willLeaveApplicationFromNativeAd(MPNativeAd nativeAd) {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("willPresentModalForNativeAd:")
	default void willPresentModalForNativeAd(MPNativeAd nativeAd) {
		throw new java.lang.UnsupportedOperationException();
	}
}