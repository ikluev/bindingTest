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
import com.intel.mopub_ios_sdk.protocol.MPRewardedVideoAdapterDelegate;
import ios.NSObject;
import ios.uikit.UIViewController;

@Generated
@Library("mopub_ios_sdk")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPRewardedVideoAdapter extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected MPRewardedVideoAdapter(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native MPRewardedVideoAdapter alloc();

	@Generated
	@Selector("delegate")
	@MappedReturn(ObjCObjectMapper.class)
	public native MPRewardedVideoAdapterDelegate delegate();

	@Generated
	@Selector("getAdWithConfiguration:")
	public native void getAdWithConfiguration(MPAdConfiguration configuration);

	@Generated
	@Selector("handleAdPlayedForCustomEventNetwork")
	public native void handleAdPlayedForCustomEventNetwork();

	@Generated
	@Selector("hasAdAvailable")
	public native boolean hasAdAvailable();

	@Generated
	@Selector("init")
	public native MPRewardedVideoAdapter init();

	@Generated
	@Selector("initWithDelegate:")
	public native MPRewardedVideoAdapter initWithDelegate(
			@Mapped(ObjCObjectMapper.class) MPRewardedVideoAdapterDelegate delegate);

	@Generated
	@Selector("presentRewardedVideoFromViewController:")
	public native void presentRewardedVideoFromViewController(
			UIViewController viewController);

	@Generated
	@Selector("setDelegate:")
	public native void setDelegate_unsafe(
			@Mapped(ObjCObjectMapper.class) MPRewardedVideoAdapterDelegate value);

	@Generated
	public void setDelegate(
			@Mapped(ObjCObjectMapper.class) MPRewardedVideoAdapterDelegate value) {
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