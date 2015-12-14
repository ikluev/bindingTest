package com.intel.mopub_ios_sdk.protocol;


import com.intel.inde.moe.natj.general.ann.Generated;
import com.intel.inde.moe.natj.general.ann.Library;
import com.intel.inde.moe.natj.general.ann.Runtime;
import com.intel.inde.moe.natj.objc.ObjCRuntime;
import com.intel.inde.moe.natj.objc.ann.IsOptional;
import com.intel.inde.moe.natj.objc.ann.ObjCProtocolName;
import com.intel.inde.moe.natj.objc.ann.Selector;
import com.intel.mopub_ios_sdk.MPStreamAdPlacer;
import ios.foundation.NSArray;
import ios.foundation.NSIndexPath;

@Generated
@Library("mopub_ios_sdk")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MPStreamAdPlacerDelegate")
public interface MPStreamAdPlacerDelegate {
	@Generated
	@IsOptional
	@Selector("adPlacer:didLoadAdAtIndexPath:")
	default void adPlacerDidLoadAdAtIndexPath(MPStreamAdPlacer adPlacer,
			NSIndexPath indexPath) {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("adPlacer:didRemoveAdsAtIndexPaths:")
	default void adPlacerDidRemoveAdsAtIndexPaths(MPStreamAdPlacer adPlacer,
			NSArray indexPaths) {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("nativeAdDidDismissModalForStreamAdPlacer:")
	default void nativeAdDidDismissModalForStreamAdPlacer(
			MPStreamAdPlacer adPlacer) {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("nativeAdWillLeaveApplicationFromStreamAdPlacer:")
	default void nativeAdWillLeaveApplicationFromStreamAdPlacer(
			MPStreamAdPlacer adPlacer) {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("nativeAdWillPresentModalForStreamAdPlacer:")
	default void nativeAdWillPresentModalForStreamAdPlacer(
			MPStreamAdPlacer adPlacer) {
		throw new java.lang.UnsupportedOperationException();
	}
}