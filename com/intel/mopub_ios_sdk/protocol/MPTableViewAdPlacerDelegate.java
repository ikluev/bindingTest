package com.intel.mopub_ios_sdk.protocol;


import com.intel.inde.moe.natj.general.ann.Generated;
import com.intel.inde.moe.natj.general.ann.Library;
import com.intel.inde.moe.natj.general.ann.Runtime;
import com.intel.inde.moe.natj.objc.ObjCRuntime;
import com.intel.inde.moe.natj.objc.ann.IsOptional;
import com.intel.inde.moe.natj.objc.ann.ObjCProtocolName;
import com.intel.inde.moe.natj.objc.ann.Selector;
import com.intel.mopub_ios_sdk.MPTableViewAdPlacer;

@Generated
@Library("mopub_ios_sdk")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MPTableViewAdPlacerDelegate")
public interface MPTableViewAdPlacerDelegate {
	@Generated
	@IsOptional
	@Selector("nativeAdDidDismissModalForTableViewAdPlacer:")
	default void nativeAdDidDismissModalForTableViewAdPlacer(
			MPTableViewAdPlacer placer) {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("nativeAdWillLeaveApplicationFromTableViewAdPlacer:")
	default void nativeAdWillLeaveApplicationFromTableViewAdPlacer(
			MPTableViewAdPlacer placer) {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("nativeAdWillPresentModalForTableViewAdPlacer:")
	default void nativeAdWillPresentModalForTableViewAdPlacer(
			MPTableViewAdPlacer placer) {
		throw new java.lang.UnsupportedOperationException();
	}
}