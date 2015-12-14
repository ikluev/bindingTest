package com.intel.mopub_ios_sdk.protocol;


import com.intel.inde.moe.natj.general.ann.Generated;
import com.intel.inde.moe.natj.general.ann.Library;
import com.intel.inde.moe.natj.general.ann.Mapped;
import com.intel.inde.moe.natj.general.ann.Runtime;
import com.intel.inde.moe.natj.objc.ObjCRuntime;
import com.intel.inde.moe.natj.objc.ann.IsOptional;
import com.intel.inde.moe.natj.objc.ann.ObjCProtocolName;
import com.intel.inde.moe.natj.objc.ann.Selector;
import com.intel.inde.moe.natj.objc.map.ObjCObjectMapper;
import ios.uikit.UIViewController;

@Generated
@Library("mopub_ios_sdk")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MPNativeAdAdapterDelegate")
public interface MPNativeAdAdapterDelegate {
	@Generated
	@IsOptional
	@Selector("nativeAdDidClick:")
	default void nativeAdDidClick(
			@Mapped(ObjCObjectMapper.class) Object adAdapter) {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@Selector("nativeAdDidDismissModalForAdapter:")
	void nativeAdDidDismissModalForAdapter(
			@Mapped(ObjCObjectMapper.class) Object adapter);

	@Generated
	@Selector("nativeAdWillLeaveApplicationFromAdapter:")
	void nativeAdWillLeaveApplicationFromAdapter(
			@Mapped(ObjCObjectMapper.class) Object adapter);

	@Generated
	@IsOptional
	@Selector("nativeAdWillLogImpression:")
	default void nativeAdWillLogImpression(
			@Mapped(ObjCObjectMapper.class) Object adAdapter) {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@Selector("nativeAdWillPresentModalForAdapter:")
	void nativeAdWillPresentModalForAdapter(
			@Mapped(ObjCObjectMapper.class) Object adapter);

	@Generated
	@Selector("viewControllerForPresentingModalView")
	UIViewController viewControllerForPresentingModalView();
}