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
@ObjCProtocolName("MPPrivateBannerCustomEventDelegate")
public interface MPPrivateBannerCustomEventDelegate extends
		MPBannerCustomEventDelegate {
	@Generated
	@Selector("adUnitId")
	String adUnitId();

	@Generated
	@Selector("bannerDelegate")
	@MappedReturn(ObjCObjectMapper.class)
	Object bannerDelegate();

	@Generated
	@Selector("configuration")
	MPAdConfiguration configuration();
}