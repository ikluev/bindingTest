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
import com.test.mopub_ios_sdk.protocol.MPRewardedVideoCustomEventDelegate;
import ios.NSObject;
import ios.foundation.NSDictionary;
import ios.uikit.UIViewController;

@Generated
@Library("mopub_ios_sdk")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPRewardedVideoCustomEvent extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected MPRewardedVideoCustomEvent(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native MPRewardedVideoCustomEvent alloc();

	@Generated
	@Selector("delegate")
	@MappedReturn(ObjCObjectMapper.class)
	public native MPRewardedVideoCustomEventDelegate delegate();

	@Generated
	@Selector("enableAutomaticImpressionAndClickTracking")
	public native boolean enableAutomaticImpressionAndClickTracking();

	@Generated
	@Selector("handleAdPlayedForCustomEventNetwork")
	public native void handleAdPlayedForCustomEventNetwork();

	@Generated
	@Selector("handleCustomEventInvalidated")
	public native void handleCustomEventInvalidated();

	@Generated
	@Selector("hasAdAvailable")
	public native boolean hasAdAvailable();

	@Generated
	@Selector("init")
	public native MPRewardedVideoCustomEvent init();

	@Generated
	@Selector("presentRewardedVideoFromViewController:")
	public native void presentRewardedVideoFromViewController(
			UIViewController viewController);

	@Generated
	@Selector("requestRewardedVideoWithCustomEventInfo:")
	public native void requestRewardedVideoWithCustomEventInfo(NSDictionary info);

	@Generated
	@Selector("setDelegate:")
	public native void setDelegate_unsafe(
			@Mapped(ObjCObjectMapper.class) MPRewardedVideoCustomEventDelegate value);

	@Generated
	public void setDelegate(
			@Mapped(ObjCObjectMapper.class) MPRewardedVideoCustomEventDelegate value) {
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