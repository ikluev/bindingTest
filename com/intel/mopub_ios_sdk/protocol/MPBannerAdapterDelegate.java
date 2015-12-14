package com.intel.mopub_ios_sdk.protocol;


import com.intel.inde.moe.natj.general.ann.Generated;
import com.intel.inde.moe.natj.general.ann.Library;
import com.intel.inde.moe.natj.general.ann.MappedReturn;
import com.intel.inde.moe.natj.general.ann.Runtime;
import com.intel.inde.moe.natj.objc.ObjCRuntime;
import com.intel.inde.moe.natj.objc.ann.ObjCProtocolName;
import com.intel.inde.moe.natj.objc.ann.Selector;
import com.intel.inde.moe.natj.objc.map.ObjCObjectMapper;
import com.intel.mopub_ios_sdk.MPAdView;
import com.intel.mopub_ios_sdk.MPBaseBannerAdapter;
import ios.corelocation.CLLocation;
import ios.foundation.NSError;
import ios.uikit.UIView;
import ios.uikit.UIViewController;

@Generated
@Library("mopub_ios_sdk")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MPBannerAdapterDelegate")
public interface MPBannerAdapterDelegate {
	@Generated
	@Selector("adapter:didFailToLoadAdWithError:")
	void adapterDidFailToLoadAdWithError(MPBaseBannerAdapter adapter,
			NSError error);

	@Generated
	@Selector("adapter:didFinishLoadingAd:")
	void adapterDidFinishLoadingAd(MPBaseBannerAdapter adapter, UIView ad);

	@Generated
	@Selector("allowedNativeAdsOrientation")
	int allowedNativeAdsOrientation();

	@Generated
	@Selector("banner")
	MPAdView banner();

	@Generated
	@Selector("bannerDelegate")
	@MappedReturn(ObjCObjectMapper.class)
	Object bannerDelegate();

	@Generated
	@Selector("location")
	CLLocation location();

	@Generated
	@Selector("userActionDidFinishForAdapter:")
	void userActionDidFinishForAdapter(MPBaseBannerAdapter adapter);

	@Generated
	@Selector("userActionWillBeginForAdapter:")
	void userActionWillBeginForAdapter(MPBaseBannerAdapter adapter);

	@Generated
	@Selector("userWillLeaveApplicationFromAdapter:")
	void userWillLeaveApplicationFromAdapter(MPBaseBannerAdapter adapter);

	@Generated
	@Selector("viewControllerForPresentingModalView")
	UIViewController viewControllerForPresentingModalView();
}