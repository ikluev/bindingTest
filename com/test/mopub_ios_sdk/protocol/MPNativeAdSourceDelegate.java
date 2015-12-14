package com.test.mopub_ios_sdk.protocol;


import com.intel.inde.moe.natj.general.ann.Generated;
import com.intel.inde.moe.natj.general.ann.Library;
import com.intel.inde.moe.natj.general.ann.Runtime;
import com.intel.inde.moe.natj.objc.ObjCRuntime;
import com.intel.inde.moe.natj.objc.ann.ObjCProtocolName;
import com.intel.inde.moe.natj.objc.ann.Selector;
import com.test.mopub_ios_sdk.MPNativeAdSource;

@Generated
@Library("mopub_ios_sdk")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MPNativeAdSourceDelegate")
public interface MPNativeAdSourceDelegate {
	@Generated
	@Selector("adSourceDidFinishRequest:")
	void adSourceDidFinishRequest(MPNativeAdSource source);
}