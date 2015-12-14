package com.intel.mopub_ios_sdk;


import com.intel.inde.moe.natj.general.NatJ;
import com.intel.inde.moe.natj.general.Pointer;
import com.intel.inde.moe.natj.general.ann.Generated;
import com.intel.inde.moe.natj.general.ann.Library;
import com.intel.inde.moe.natj.general.ann.Mapped;
import com.intel.inde.moe.natj.general.ann.MappedReturn;
import com.intel.inde.moe.natj.general.ann.Owned;
import com.intel.inde.moe.natj.general.ann.Runtime;
import com.intel.inde.moe.natj.objc.ObjCRuntime;
import com.intel.inde.moe.natj.objc.ann.ObjCClassBinding;
import com.intel.inde.moe.natj.objc.ann.Selector;
import com.intel.inde.moe.natj.objc.map.ObjCObjectMapper;
import com.intel.mopub_ios_sdk.protocol.MPBannerAdapterDelegate;
import com.intel.mopub_ios_sdk.protocol.MPPrivateBannerCustomEventDelegate;
import ios.corelocation.CLLocation;
import ios.foundation.NSError;
import ios.uikit.UIView;
import ios.uikit.UIViewController;

@Generated
@Library("mopub_ios_sdk")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPBannerCustomEventAdapter extends MPBaseBannerAdapter implements
		MPPrivateBannerCustomEventDelegate {
	static {
		NatJ.register();
	}

	@Generated
	protected MPBannerCustomEventAdapter(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("adUnitId")
	public native String adUnitId();

	@Generated
	@Owned
	@Selector("alloc")
	public static native MPBannerCustomEventAdapter alloc();

	@Generated
	@Selector("bannerCustomEvent:didFailToLoadAdWithError:")
	public native void bannerCustomEventDidFailToLoadAdWithError(
			MPBannerCustomEvent event, NSError error);

	@Generated
	@Selector("bannerCustomEvent:didLoadAd:")
	public native void bannerCustomEventDidLoadAd(MPBannerCustomEvent event,
			UIView ad);

	@Generated
	@Selector("bannerCustomEventDidFinishAction:")
	public native void bannerCustomEventDidFinishAction(
			MPBannerCustomEvent event);

	@Generated
	@Selector("bannerCustomEventWillBeginAction:")
	public native void bannerCustomEventWillBeginAction(
			MPBannerCustomEvent event);

	@Generated
	@Selector("bannerCustomEventWillLeaveApplication:")
	public native void bannerCustomEventWillLeaveApplication(
			MPBannerCustomEvent event);

	@Generated
	@Selector("bannerDelegate")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object bannerDelegate();

	@Generated
	@Selector("configuration")
	public native MPAdConfiguration configuration();

	@Generated
	@Selector("init")
	public native MPBannerCustomEventAdapter init();

	@Generated
	@Selector("initWithDelegate:")
	public native MPBannerCustomEventAdapter initWithDelegate(
			@Mapped(ObjCObjectMapper.class) MPBannerAdapterDelegate delegate);

	@Generated
	@Selector("location")
	public native CLLocation location();

	@Generated
	@Selector("trackClick")
	public native void trackClick();

	@Generated
	@Selector("trackImpression")
	public native void trackImpression();

	@Generated
	@Selector("viewControllerForPresentingModalView")
	public native UIViewController viewControllerForPresentingModalView();
}