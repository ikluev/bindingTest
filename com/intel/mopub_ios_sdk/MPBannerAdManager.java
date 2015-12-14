package com.intel.mopub_ios_sdk;


import com.intel.inde.moe.natj.general.NatJ;
import com.intel.inde.moe.natj.general.Pointer;
import com.intel.inde.moe.natj.general.ann.Generated;
import com.intel.inde.moe.natj.general.ann.Library;
import com.intel.inde.moe.natj.general.ann.Mapped;
import com.intel.inde.moe.natj.general.ann.MappedReturn;
import com.intel.inde.moe.natj.general.ann.NInt;
import com.intel.inde.moe.natj.general.ann.Owned;
import com.intel.inde.moe.natj.general.ann.Runtime;
import com.intel.inde.moe.natj.objc.ObjCRuntime;
import com.intel.inde.moe.natj.objc.ann.ObjCClassBinding;
import com.intel.inde.moe.natj.objc.ann.Selector;
import com.intel.inde.moe.natj.objc.map.ObjCObjectMapper;
import com.intel.mopub_ios_sdk.protocol.MPAdServerCommunicatorDelegate;
import com.intel.mopub_ios_sdk.protocol.MPBannerAdManagerDelegate;
import com.intel.mopub_ios_sdk.protocol.MPBannerAdapterDelegate;
import ios.NSObject;
import ios.corelocation.CLLocation;
import ios.foundation.NSError;
import ios.uikit.UIView;
import ios.uikit.UIViewController;

@Generated
@Library("mopub_ios_sdk")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPBannerAdManager extends NSObject implements
		MPAdServerCommunicatorDelegate, MPBannerAdapterDelegate {
	static {
		NatJ.register();
	}

	@Generated
	protected MPBannerAdManager(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("adapter:didFailToLoadAdWithError:")
	public native void adapterDidFailToLoadAdWithError(
			MPBaseBannerAdapter adapter, NSError error);

	@Generated
	@Selector("adapter:didFinishLoadingAd:")
	public native void adapterDidFinishLoadingAd(MPBaseBannerAdapter adapter,
			UIView ad);

	@Generated
	@Owned
	@Selector("alloc")
	public static native MPBannerAdManager alloc();

	@Generated
	@Selector("allowedNativeAdsOrientation")
	public native int allowedNativeAdsOrientation();

	@Generated
	@Selector("banner")
	public native MPAdView banner();

	@Generated
	@Selector("bannerDelegate")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object bannerDelegate();

	@Generated
	@Selector("communicatorDidFailWithError:")
	public native void communicatorDidFailWithError(NSError error);

	@Generated
	@Selector("communicatorDidReceiveAdConfiguration:")
	public native void communicatorDidReceiveAdConfiguration(
			MPAdConfiguration configuration);

	@Generated
	@Selector("delegate")
	@MappedReturn(ObjCObjectMapper.class)
	public native MPBannerAdManagerDelegate delegate();

	@Generated
	@Selector("forceRefreshAd")
	public native void forceRefreshAd();

	@Generated
	@Selector("init")
	public native MPBannerAdManager init();

	@Generated
	@Selector("initWithDelegate:")
	public native MPBannerAdManager initWithDelegate(
			@Mapped(ObjCObjectMapper.class) MPBannerAdManagerDelegate delegate);

	@Generated
	@Selector("loadAd")
	public native void loadAd();

	@Generated
	@Selector("location")
	public native CLLocation location();

	@Generated
	@Selector("rotateToOrientation:")
	public native void rotateToOrientation(@NInt long orientation);

	@Generated
	@Selector("setDelegate:")
	public native void setDelegate_unsafe(
			@Mapped(ObjCObjectMapper.class) MPBannerAdManagerDelegate value);

	@Generated
	public void setDelegate(
			@Mapped(ObjCObjectMapper.class) MPBannerAdManagerDelegate value) {
		Object __old = delegate();
		if (value != null) {
			com.intel.inde.moe.natj.objc.ObjCRuntime.associateObjCObject(this,
					value);
		}
		setDelegate_unsafe(value);
		if (__old != null) {
			com.intel.inde.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this,
					__old);
		}
	}

	@Generated
	@Selector("startAutomaticallyRefreshingContents")
	public native void startAutomaticallyRefreshingContents();

	@Generated
	@Selector("stopAutomaticallyRefreshingContents")
	public native void stopAutomaticallyRefreshingContents();

	@Generated
	@Selector("userActionDidFinishForAdapter:")
	public native void userActionDidFinishForAdapter(MPBaseBannerAdapter adapter);

	@Generated
	@Selector("userActionWillBeginForAdapter:")
	public native void userActionWillBeginForAdapter(MPBaseBannerAdapter adapter);

	@Generated
	@Selector("userWillLeaveApplicationFromAdapter:")
	public native void userWillLeaveApplicationFromAdapter(
			MPBaseBannerAdapter adapter);

	@Generated
	@Selector("viewControllerForPresentingModalView")
	public native UIViewController viewControllerForPresentingModalView();
}