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
import com.intel.mopub_ios_sdk.protocol.MPInterstitialAdapterDelegate;
import com.intel.mopub_ios_sdk.protocol.MPPrivateInterstitialCustomEventDelegate;
import ios.corelocation.CLLocation;
import ios.foundation.NSError;

@Generated
@Library("mopub_ios_sdk")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPInterstitialCustomEventAdapter extends MPBaseInterstitialAdapter
		implements MPPrivateInterstitialCustomEventDelegate {
	static {
		NatJ.register();
	}

	@Generated
	protected MPInterstitialCustomEventAdapter(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("adUnitId")
	public native String adUnitId();

	@Generated
	@Owned
	@Selector("alloc")
	public static native MPInterstitialCustomEventAdapter alloc();

	@Generated
	@Selector("configuration")
	public native MPAdConfiguration configuration();

	@Generated
	@Selector("init")
	public native MPInterstitialCustomEventAdapter init();

	@Generated
	@Selector("initWithDelegate:")
	public native MPInterstitialCustomEventAdapter initWithDelegate(
			@Mapped(ObjCObjectMapper.class) MPInterstitialAdapterDelegate delegate);

	@Generated
	@Selector("interstitialCustomEvent:didFailToLoadAdWithError:")
	public native void interstitialCustomEventDidFailToLoadAdWithError(
			MPInterstitialCustomEvent customEvent, NSError error);

	@Generated
	@Selector("interstitialCustomEvent:didLoadAd:")
	public native void interstitialCustomEventDidLoadAd(
			MPInterstitialCustomEvent customEvent,
			@Mapped(ObjCObjectMapper.class) Object ad);

	@Generated
	@Selector("interstitialCustomEventDidAppear:")
	public native void interstitialCustomEventDidAppear(
			MPInterstitialCustomEvent customEvent);

	@Generated
	@Selector("interstitialCustomEventDidDisappear:")
	public native void interstitialCustomEventDidDisappear(
			MPInterstitialCustomEvent customEvent);

	@Generated
	@Selector("interstitialCustomEventDidExpire:")
	public native void interstitialCustomEventDidExpire(
			MPInterstitialCustomEvent customEvent);

	@Generated
	@Selector("interstitialCustomEventDidReceiveTapEvent:")
	public native void interstitialCustomEventDidReceiveTapEvent(
			MPInterstitialCustomEvent customEvent);

	@Generated
	@Selector("interstitialCustomEventWillAppear:")
	public native void interstitialCustomEventWillAppear(
			MPInterstitialCustomEvent customEvent);

	@Generated
	@Selector("interstitialCustomEventWillDisappear:")
	public native void interstitialCustomEventWillDisappear(
			MPInterstitialCustomEvent customEvent);

	@Generated
	@Selector("interstitialCustomEventWillLeaveApplication:")
	public native void interstitialCustomEventWillLeaveApplication(
			MPInterstitialCustomEvent customEvent);

	@Generated
	@Selector("interstitialDelegate")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object interstitialDelegate();

	@Generated
	@Selector("location")
	public native CLLocation location();

	@Generated
	@Selector("trackClick")
	public native void trackClick();

	@Generated
	@Selector("trackImpression")
	public native void trackImpression();
}