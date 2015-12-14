package com.test.mopub_ios_sdk;


import com.intel.inde.moe.natj.general.NatJ;
import com.intel.inde.moe.natj.general.Pointer;
import com.intel.inde.moe.natj.general.ann.Generated;
import com.intel.inde.moe.natj.general.ann.Library;
import com.intel.inde.moe.natj.general.ann.Mapped;
import com.intel.inde.moe.natj.general.ann.MappedReturn;
import com.intel.inde.moe.natj.general.ann.Owned;
import com.intel.inde.moe.natj.general.ann.Runtime;
import com.intel.inde.moe.natj.objc.Class;
import com.intel.inde.moe.natj.objc.ObjCRuntime;
import com.intel.inde.moe.natj.objc.ann.ObjCClassBinding;
import com.intel.inde.moe.natj.objc.ann.Selector;
import com.intel.inde.moe.natj.objc.map.ObjCObjectMapper;
import com.test.mopub_ios_sdk.protocol.MPRewardedVideoAdManagerDelegate;
import ios.NSObject;
import ios.foundation.NSArray;
import ios.uikit.UIViewController;

@Generated
@Library("mopub_ios_sdk")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPRewardedVideoAdManager extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected MPRewardedVideoAdManager(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("adUnitID")
	public native String adUnitID();

	@Generated
	@Owned
	@Selector("alloc")
	public static native MPRewardedVideoAdManager alloc();

	@Generated
	@Selector("customEventClass")
	public native Class customEventClass();

	@Generated
	@Selector("delegate")
	@MappedReturn(ObjCObjectMapper.class)
	public native MPRewardedVideoAdManagerDelegate delegate();

	@Generated
	@Selector("handleAdPlayedForCustomEventNetwork")
	public native void handleAdPlayedForCustomEventNetwork();

	@Generated
	@Selector("hasAdAvailable")
	public native boolean hasAdAvailable();

	@Generated
	@Selector("init")
	public native MPRewardedVideoAdManager init();

	@Generated
	@Selector("initWithAdUnitID:delegate:")
	public native MPRewardedVideoAdManager initWithAdUnitIDDelegate(
			String adUnitID,
			@Mapped(ObjCObjectMapper.class) MPRewardedVideoAdManagerDelegate delegate);

	@Generated
	@Selector("loadRewardedVideoAd")
	public native void loadRewardedVideoAd();

	@Generated
	@Selector("mediationSettings")
	public native NSArray mediationSettings();

	@Generated
	@Selector("presentRewardedVideoAdFromViewController:")
	public native void presentRewardedVideoAdFromViewController(
			UIViewController viewController);

	@Generated
	@Selector("setDelegate:")
	public native void setDelegate_unsafe(
			@Mapped(ObjCObjectMapper.class) MPRewardedVideoAdManagerDelegate value);

	@Generated
	public void setDelegate(
			@Mapped(ObjCObjectMapper.class) MPRewardedVideoAdManagerDelegate value) {
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
	@Selector("setMediationSettings:")
	public native void setMediationSettings(NSArray value);
}