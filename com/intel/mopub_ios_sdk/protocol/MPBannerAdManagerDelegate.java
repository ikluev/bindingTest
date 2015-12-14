package com.intel.mopub_ios_sdk.protocol;


import com.intel.inde.moe.natj.general.ann.ByValue;
import com.intel.inde.moe.natj.general.ann.Generated;
import com.intel.inde.moe.natj.general.ann.Library;
import com.intel.inde.moe.natj.general.ann.MappedReturn;
import com.intel.inde.moe.natj.general.ann.Runtime;
import com.intel.inde.moe.natj.objc.ObjCRuntime;
import com.intel.inde.moe.natj.objc.ann.ObjCProtocolName;
import com.intel.inde.moe.natj.objc.ann.Selector;
import com.intel.inde.moe.natj.objc.map.ObjCObjectMapper;
import com.intel.mopub_ios_sdk.MPAdView;
import ios.coregraphics.struct.CGSize;
import ios.corelocation.CLLocation;
import ios.uikit.UIView;
import ios.uikit.UIViewController;

@Generated
@Library("mopub_ios_sdk")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MPBannerAdManagerDelegate")
public interface MPBannerAdManagerDelegate {
	@Generated
	@Selector("adUnitId")
	String adUnitId();

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
	@Selector("containerSize")
	@ByValue
	CGSize containerSize();

	@Generated
	@Selector("invalidateContentView")
	void invalidateContentView();

	@Generated
	@Selector("isTesting")
	boolean isTesting();

	@Generated
	@Selector("keywords")
	String keywords();

	@Generated
	@Selector("location")
	CLLocation location();

	@Generated
	@Selector("managerDidFailToLoadAd")
	void managerDidFailToLoadAd();

	@Generated
	@Selector("managerDidLoadAd:")
	void managerDidLoadAd(UIView ad);

	@Generated
	@Selector("userActionDidFinish")
	void userActionDidFinish();

	@Generated
	@Selector("userActionWillBegin")
	void userActionWillBegin();

	@Generated
	@Selector("userWillLeaveApplication")
	void userWillLeaveApplication();

	@Generated
	@Selector("viewControllerForPresentingModalView")
	UIViewController viewControllerForPresentingModalView();
}