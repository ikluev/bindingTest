package com.test.mopub_ios_sdk.protocol;


import com.intel.inde.moe.natj.general.ann.Generated;
import com.intel.inde.moe.natj.general.ann.Library;
import com.intel.inde.moe.natj.general.ann.MappedReturn;
import com.intel.inde.moe.natj.general.ann.Runtime;
import com.intel.inde.moe.natj.objc.ObjCRuntime;
import com.intel.inde.moe.natj.objc.ann.ObjCProtocolName;
import com.intel.inde.moe.natj.objc.ann.Selector;
import com.intel.inde.moe.natj.objc.map.ObjCObjectMapper;
import com.test.mopub_ios_sdk.MPAdConfiguration;

@Generated
@Library("mopub_ios_sdk")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MPPrivateInterstitialCustomEventDelegate")
public interface MPPrivateInterstitialCustomEventDelegate extends
		MPInterstitialCustomEventDelegate {
	@Generated
	@Selector("adUnitId")
	String adUnitId();

	@Generated
	@Selector("configuration")
	MPAdConfiguration configuration();

	@Generated
	@Selector("interstitialDelegate")
	@MappedReturn(ObjCObjectMapper.class)
	Object interstitialDelegate();
}