package com.intel.mopub_ios_sdk.protocol;


import com.intel.inde.moe.natj.general.ann.Generated;
import com.intel.inde.moe.natj.general.ann.Library;
import com.intel.inde.moe.natj.general.ann.Runtime;
import com.intel.inde.moe.natj.objc.ObjCRuntime;
import com.intel.inde.moe.natj.objc.ann.ObjCProtocolName;
import com.intel.inde.moe.natj.objc.ann.Selector;
import com.intel.mopub_ios_sdk.MPBannerCustomEvent;
import ios.corelocation.CLLocation;
import ios.foundation.NSError;
import ios.uikit.UIView;
import ios.uikit.UIViewController;

@Generated
@Library("mopub_ios_sdk")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MPBannerCustomEventDelegate")
public interface MPBannerCustomEventDelegate {
	@Generated
	@Selector("bannerCustomEvent:didFailToLoadAdWithError:")
	void bannerCustomEventDidFailToLoadAdWithError(MPBannerCustomEvent event,
			NSError error);

	@Generated
	@Selector("bannerCustomEvent:didLoadAd:")
	void bannerCustomEventDidLoadAd(MPBannerCustomEvent event, UIView ad);

	@Generated
	@Selector("bannerCustomEventDidFinishAction:")
	void bannerCustomEventDidFinishAction(MPBannerCustomEvent event);

	@Generated
	@Selector("bannerCustomEventWillBeginAction:")
	void bannerCustomEventWillBeginAction(MPBannerCustomEvent event);

	@Generated
	@Selector("bannerCustomEventWillLeaveApplication:")
	void bannerCustomEventWillLeaveApplication(MPBannerCustomEvent event);

	@Generated
	@Selector("location")
	CLLocation location();

	@Generated
	@Selector("trackClick")
	void trackClick();

	@Generated
	@Selector("trackImpression")
	void trackImpression();

	@Generated
	@Selector("viewControllerForPresentingModalView")
	UIViewController viewControllerForPresentingModalView();
}