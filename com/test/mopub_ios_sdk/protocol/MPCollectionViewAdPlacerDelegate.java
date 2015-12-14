package com.test.mopub_ios_sdk.protocol;


import com.intel.inde.moe.natj.general.ann.Generated;
import com.intel.inde.moe.natj.general.ann.Library;
import com.intel.inde.moe.natj.general.ann.Runtime;
import com.intel.inde.moe.natj.objc.ObjCRuntime;
import com.intel.inde.moe.natj.objc.ann.IsOptional;
import com.intel.inde.moe.natj.objc.ann.ObjCProtocolName;
import com.intel.inde.moe.natj.objc.ann.Selector;
import com.test.mopub_ios_sdk.MPCollectionViewAdPlacer;

@Generated
@Library("mopub_ios_sdk")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MPCollectionViewAdPlacerDelegate")
public interface MPCollectionViewAdPlacerDelegate {
	@Generated
	@IsOptional
	@Selector("nativeAdDidDismissModalForCollectionViewAdPlacer:")
	default void nativeAdDidDismissModalForCollectionViewAdPlacer(
			MPCollectionViewAdPlacer placer) {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("nativeAdWillLeaveApplicationFromCollectionViewAdPlacer:")
	default void nativeAdWillLeaveApplicationFromCollectionViewAdPlacer(
			MPCollectionViewAdPlacer placer) {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("nativeAdWillPresentModalForCollectionViewAdPlacer:")
	default void nativeAdWillPresentModalForCollectionViewAdPlacer(
			MPCollectionViewAdPlacer placer) {
		throw new java.lang.UnsupportedOperationException();
	}
}