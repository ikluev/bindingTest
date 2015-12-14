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
import com.test.mopub_ios_sdk.protocol.MPAdServerCommunicatorDelegate;
import com.test.mopub_ios_sdk.protocol.MPInterstitialAdManagerDelegate;
import com.test.mopub_ios_sdk.protocol.MPInterstitialAdapterDelegate;
import ios.NSObject;
import ios.corelocation.CLLocation;
import ios.foundation.NSError;
import ios.uikit.UIViewController;

@Generated
@Library("mopub_ios_sdk")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPInterstitialAdManager extends NSObject implements
		MPAdServerCommunicatorDelegate, MPInterstitialAdapterDelegate {
	static {
		NatJ.register();
	}

	@Generated
	protected MPInterstitialAdManager(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("adapter:didFailToLoadAdWithError:")
	public native void adapterDidFailToLoadAdWithError(
			MPBaseInterstitialAdapter adapter, NSError error);

	@Generated
	@Selector("adapterDidFinishLoadingAd:")
	public native void adapterDidFinishLoadingAd(
			MPBaseInterstitialAdapter adapter);

	@Generated
	@Owned
	@Selector("alloc")
	public static native MPInterstitialAdManager alloc();

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
	public native MPInterstitialAdManagerDelegate delegate();

	@Generated
	@Selector("init")
	public native MPInterstitialAdManager init();

	@Generated
	@Selector("initWithDelegate:")
	public native MPInterstitialAdManager initWithDelegate(
			@Mapped(ObjCObjectMapper.class) MPInterstitialAdManagerDelegate delegate);

	@Generated
	@Selector("interstitialAdController")
	public native MPInterstitialAdController interstitialAdController();

	@Generated
	@Selector("interstitialDelegate")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object interstitialDelegate();

	@Generated
	@Selector("interstitialDidAppearForAdapter:")
	public native void interstitialDidAppearForAdapter(
			MPBaseInterstitialAdapter adapter);

	@Generated
	@Selector("interstitialDidDisappearForAdapter:")
	public native void interstitialDidDisappearForAdapter(
			MPBaseInterstitialAdapter adapter);

	@Generated
	@Selector("interstitialDidExpireForAdapter:")
	public native void interstitialDidExpireForAdapter(
			MPBaseInterstitialAdapter adapter);

	@Generated
	@Selector("interstitialDidReceiveTapEventForAdapter:")
	public native void interstitialDidReceiveTapEventForAdapter(
			MPBaseInterstitialAdapter adapter);

	@Generated
	@Selector("interstitialWillAppearForAdapter:")
	public native void interstitialWillAppearForAdapter(
			MPBaseInterstitialAdapter adapter);

	@Generated
	@Selector("interstitialWillDisappearForAdapter:")
	public native void interstitialWillDisappearForAdapter(
			MPBaseInterstitialAdapter adapter);

	@Generated
	@Selector("interstitialWillLeaveApplicationForAdapter:")
	public native void interstitialWillLeaveApplicationForAdapter(
			MPBaseInterstitialAdapter adapter);

	@Generated
	@Selector("loadInterstitialWithAdUnitID:keywords:location:testing:")
	public native void loadInterstitialWithAdUnitIDKeywordsLocationTesting(
			String ID, String keywords, CLLocation location, boolean testing);

	@Generated
	@Selector("location")
	public native CLLocation location();

	@Generated
	@Selector("presentInterstitialFromViewController:")
	public native void presentInterstitialFromViewController(
			UIViewController controller);

	@Generated
	@Selector("ready")
	public native boolean ready();

	@Generated
	@Selector("setDelegate:")
	public native void setDelegate_unsafe(
			@Mapped(ObjCObjectMapper.class) MPInterstitialAdManagerDelegate value);

	@Generated
	public void setDelegate(
			@Mapped(ObjCObjectMapper.class) MPInterstitialAdManagerDelegate value) {
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