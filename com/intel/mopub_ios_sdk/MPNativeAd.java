package com.intel.mopub_ios_sdk;


import com.intel.inde.moe.natj.general.NatJ;
import com.intel.inde.moe.natj.general.Pointer;
import com.intel.inde.moe.natj.general.ann.ByValue;
import com.intel.inde.moe.natj.general.ann.Generated;
import com.intel.inde.moe.natj.general.ann.Library;
import com.intel.inde.moe.natj.general.ann.Mapped;
import com.intel.inde.moe.natj.general.ann.MappedReturn;
import com.intel.inde.moe.natj.general.ann.Owned;
import com.intel.inde.moe.natj.general.ann.Runtime;
import com.intel.inde.moe.natj.general.ptr.Ptr;
import com.intel.inde.moe.natj.objc.ObjCRuntime;
import com.intel.inde.moe.natj.objc.ann.ObjCClassBinding;
import com.intel.inde.moe.natj.objc.ann.Selector;
import com.intel.inde.moe.natj.objc.map.ObjCObjectMapper;
import com.intel.mopub_ios_sdk.protocol.MPNativeAdAdapter;
import com.intel.mopub_ios_sdk.protocol.MPNativeAdDelegate;
import com.intel.mopub_ios_sdk.protocol.MPNativeAdRenderer;
import ios.NSObject;
import ios.coregraphics.struct.CGSize;
import ios.foundation.NSDate;
import ios.foundation.NSDictionary;
import ios.foundation.NSError;
import ios.foundation.NSMutableSet;
import ios.foundation.NSURL;
import ios.uikit.UIView;

@Generated
@Library("mopub_ios_sdk")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPNativeAd extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected MPNativeAd(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native MPNativeAd alloc();

	@Generated
	@Selector("associatedView")
	public native MPNativeView associatedView();

	@Generated
	@Selector("clickTrackerURLs")
	public native NSMutableSet clickTrackerURLs();

	@Generated
	@Selector("creationDate")
	public native NSDate creationDate();

	@Generated
	@Selector("delegate")
	@MappedReturn(ObjCObjectMapper.class)
	public native MPNativeAdDelegate delegate();

	@Generated
	@Selector("impressionTrackerURLs")
	public native NSMutableSet impressionTrackerURLs();

	@Generated
	@Selector("init")
	public native MPNativeAd init();

	@Generated
	@Selector("initWithAdAdapter:")
	public native MPNativeAd initWithAdAdapter(
			@Mapped(ObjCObjectMapper.class) MPNativeAdAdapter adAdapter);

	@Generated
	@Selector("properties")
	public native NSDictionary properties();

	@Generated
	@Selector("renderer")
	@MappedReturn(ObjCObjectMapper.class)
	public native MPNativeAdRenderer renderer();

	@Generated
	@Selector("retrieveAdViewWithError:")
	public native UIView retrieveAdViewWithError(Ptr<NSError> error);

	@Generated
	@Selector("setAssociatedView:")
	public native void setAssociatedView(MPNativeView value);

	@Generated
	@Selector("setDelegate:")
	public native void setDelegate_unsafe(
			@Mapped(ObjCObjectMapper.class) MPNativeAdDelegate value);

	@Generated
	public void setDelegate(
			@Mapped(ObjCObjectMapper.class) MPNativeAdDelegate value) {
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
	@Selector("setRenderer:")
	public native void setRenderer(
			@Mapped(ObjCObjectMapper.class) MPNativeAdRenderer value);

	@Generated
	@Selector("trackMetricForURL:")
	public native void trackMetricForURL(NSURL URL);

	@Generated
	@Selector("updateAdViewSize:")
	public native void updateAdViewSize(@ByValue CGSize size);
}