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
import com.test.mopub_ios_sdk.protocol.MPInterstitialAdapterDelegate;
import ios.NSObject;
import ios.uikit.UIViewController;

@Generated
@Library("mopub_ios_sdk")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPBaseInterstitialAdapter extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected MPBaseInterstitialAdapter(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("_getAdWithConfiguration:")
	public native void _getAdWithConfiguration(MPAdConfiguration configuration);

	@Generated
	@Owned
	@Selector("alloc")
	public static native MPBaseInterstitialAdapter alloc();

	@Generated
	@Selector("delegate")
	@MappedReturn(ObjCObjectMapper.class)
	public native MPInterstitialAdapterDelegate delegate();

	@Generated
	@Selector("didStopLoading")
	public native void didStopLoading();

	@Generated
	@Selector("getAdWithConfiguration:")
	public native void getAdWithConfiguration(MPAdConfiguration configuration);

	@Generated
	@Selector("init")
	public native MPBaseInterstitialAdapter init();

	@Generated
	@Selector("initWithDelegate:")
	public native MPBaseInterstitialAdapter initWithDelegate(
			@Mapped(ObjCObjectMapper.class) MPInterstitialAdapterDelegate delegate);

	@Generated
	@Selector("setDelegate:")
	public native void setDelegate_unsafe(
			@Mapped(ObjCObjectMapper.class) MPInterstitialAdapterDelegate value);

	@Generated
	public void setDelegate(
			@Mapped(ObjCObjectMapper.class) MPInterstitialAdapterDelegate value) {
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
	@Selector("showInterstitialFromViewController:")
	public native void showInterstitialFromViewController(
			UIViewController controller);

	@Generated
	@Selector("trackClick")
	public native void trackClick();

	@Generated
	@Selector("trackImpression")
	public native void trackImpression();

	@Generated
	@Selector("unregisterDelegate")
	public native void unregisterDelegate();
}