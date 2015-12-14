package com.intel.mopub_ios_sdk.protocol;


import com.intel.inde.moe.natj.general.ann.Generated;
import com.intel.inde.moe.natj.general.ann.Library;
import com.intel.inde.moe.natj.general.ann.Runtime;
import com.intel.inde.moe.natj.objc.ObjCRuntime;
import com.intel.inde.moe.natj.objc.ann.ObjCProtocolName;
import com.intel.inde.moe.natj.objc.ann.Selector;
import com.intel.mopub_ios_sdk.MPNativeAd;
import com.intel.mopub_ios_sdk.MPNativeCustomEvent;
import ios.foundation.NSError;

@Generated
@Library("mopub_ios_sdk")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MPNativeCustomEventDelegate")
public interface MPNativeCustomEventDelegate {
	@Generated
	@Selector("nativeCustomEvent:didFailToLoadAdWithError:")
	void nativeCustomEventDidFailToLoadAdWithError(MPNativeCustomEvent event,
			NSError error);

	@Generated
	@Selector("nativeCustomEvent:didLoadAd:")
	void nativeCustomEventDidLoadAd(MPNativeCustomEvent event,
			MPNativeAd adObject);
}