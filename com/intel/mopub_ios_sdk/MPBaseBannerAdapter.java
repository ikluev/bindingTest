package com.intel.mopub_ios_sdk;


import com.intel.inde.moe.natj.general.NatJ;
import com.intel.inde.moe.natj.general.Pointer;
import com.intel.inde.moe.natj.general.ann.ByValue;
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
import com.intel.mopub_ios_sdk.protocol.MPBannerAdapterDelegate;
import ios.NSObject;
import ios.coregraphics.struct.CGSize;
import ios.foundation.NSURL;

@Generated
@Library("mopub_ios_sdk")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPBaseBannerAdapter extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected MPBaseBannerAdapter(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("_getAdWithConfiguration:containerSize:")
	public native void _getAdWithConfigurationContainerSize(
			MPAdConfiguration configuration, @ByValue CGSize size);

	@Generated
	@Owned
	@Selector("alloc")
	public static native MPBaseBannerAdapter alloc();

	@Generated
	@Selector("clickTrackingURL")
	public native NSURL clickTrackingURL();

	@Generated
	@Selector("delegate")
	@MappedReturn(ObjCObjectMapper.class)
	public native MPBannerAdapterDelegate delegate();

	@Generated
	@Selector("didDisplayAd")
	public native void didDisplayAd();

	@Generated
	@Selector("didStopLoading")
	public native void didStopLoading();

	@Generated
	@Selector("getAdWithConfiguration:containerSize:")
	public native void getAdWithConfigurationContainerSize(
			MPAdConfiguration configuration, @ByValue CGSize size);

	@Generated
	@Selector("impressionTrackingURL")
	public native NSURL impressionTrackingURL();

	@Generated
	@Selector("init")
	public native MPBaseBannerAdapter init();

	@Generated
	@Selector("initWithDelegate:")
	public native MPBaseBannerAdapter initWithDelegate(
			@Mapped(ObjCObjectMapper.class) MPBannerAdapterDelegate delegate);

	@Generated
	@Selector("rotateToOrientation:")
	public native void rotateToOrientation(@NInt long newOrientation);

	@Generated
	@Selector("setClickTrackingURL:")
	public native void setClickTrackingURL(NSURL value);

	@Generated
	@Selector("setDelegate:")
	public native void setDelegate_unsafe(
			@Mapped(ObjCObjectMapper.class) MPBannerAdapterDelegate value);

	@Generated
	public void setDelegate(
			@Mapped(ObjCObjectMapper.class) MPBannerAdapterDelegate value) {
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
	@Selector("setImpressionTrackingURL:")
	public native void setImpressionTrackingURL(NSURL value);

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