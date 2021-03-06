package com.test.mopub_ios_sdk;


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
import com.test.mopub_ios_sdk.protocol.MPInterstitialViewControllerDelegate;
import ios.corelocation.CLLocation;

@Generated
@Library("mopub_ios_sdk")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPHTMLInterstitialCustomEvent extends MPInterstitialCustomEvent
		implements MPInterstitialViewControllerDelegate {
	static {
		NatJ.register();
	}

	@Generated
	protected MPHTMLInterstitialCustomEvent(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("adUnitId")
	public native String adUnitId();

	@Generated
	@Owned
	@Selector("alloc")
	public static native MPHTMLInterstitialCustomEvent alloc();

	@Generated
	@Selector("delegate")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object delegate();

	@Generated
	@Selector("init")
	public native MPHTMLInterstitialCustomEvent init();

	@Generated
	@Selector("interstitialDidAppear:")
	public native void interstitialDidAppear(
			MPInterstitialViewController interstitial);

	@Generated
	@Selector("interstitialDidDisappear:")
	public native void interstitialDidDisappear(
			MPInterstitialViewController interstitial);

	@Generated
	@Selector("interstitialDidFailToLoadAd:")
	public native void interstitialDidFailToLoadAd(
			MPInterstitialViewController interstitial);

	@Generated
	@Selector("interstitialDidLoadAd:")
	public native void interstitialDidLoadAd(
			MPInterstitialViewController interstitial);

	@Generated
	@Selector("interstitialDidReceiveTapEvent:")
	public native void interstitialDidReceiveTapEvent(
			MPInterstitialViewController interstitial);

	@Generated
	@Selector("interstitialWillAppear:")
	public native void interstitialWillAppear(
			MPInterstitialViewController interstitial);

	@Generated
	@Selector("interstitialWillDisappear:")
	public native void interstitialWillDisappear(
			MPInterstitialViewController interstitial);

	@Generated
	@Selector("interstitialWillLeaveApplication:")
	public native void interstitialWillLeaveApplication(
			MPInterstitialViewController interstitial);

	@Generated
	@Selector("location")
	public native CLLocation location();

	@Generated
	@Selector("setDelegate:")
	public native void setDelegate_unsafe(
			@Mapped(ObjCObjectMapper.class) Object value);

	@Generated
	public void setDelegate(@Mapped(ObjCObjectMapper.class) Object value) {
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
}