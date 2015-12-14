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
import com.intel.inde.moe.natj.objc.ann.IsOptional;
import com.intel.inde.moe.natj.objc.ann.ObjCClassBinding;
import com.intel.inde.moe.natj.objc.ann.Selector;
import com.intel.inde.moe.natj.objc.map.ObjCObjectMapper;
import com.intel.mopub_ios_sdk.protocol.MPNativeAdAdapter;
import com.intel.mopub_ios_sdk.protocol.MPNativeAdAdapterDelegate;
import ios.NSObject;
import ios.foundation.NSArray;
import ios.foundation.NSDictionary;
import ios.foundation.NSMutableDictionary;
import ios.foundation.NSURL;
import ios.uikit.UIView;
import ios.uikit.UIViewController;

@Generated
@Library("mopub_ios_sdk")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPMoPubNativeAdAdapter extends NSObject implements
		MPNativeAdAdapter {
	static {
		NatJ.register();
	}

	@Generated
	protected MPMoPubNativeAdAdapter(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native MPMoPubNativeAdAdapter alloc();

	@Generated
	@Selector("clickTrackerURLs")
	public native NSArray clickTrackerURLs();

	@Generated
	@Selector("defaultActionURL")
	public native NSURL defaultActionURL();

	@Generated
	@Selector("delegate")
	@MappedReturn(ObjCObjectMapper.class)
	public native MPNativeAdAdapterDelegate delegate();

	@Generated
	@IsOptional
	@Selector("displayContentForDAAIconTap")
	public native void displayContentForDAAIconTap();

	@Generated
	@IsOptional
	@Selector("displayContentForURL:rootViewController:")
	public native void displayContentForURLRootViewController(NSURL URL,
			UIViewController controller);

	@Generated
	@IsOptional
	@Selector("enableThirdPartyClickTracking")
	public native boolean enableThirdPartyClickTracking();

	@Generated
	@Selector("impressionTrackerURLs")
	public native NSArray impressionTrackerURLs();

	@Generated
	@Selector("init")
	public native MPMoPubNativeAdAdapter init();

	@Generated
	@Selector("initWithAdProperties:")
	public native MPMoPubNativeAdAdapter initWithAdProperties(
			NSMutableDictionary properties);

	@Generated
	@IsOptional
	@Selector("mainMediaView")
	public native UIView mainMediaView();

	@Generated
	@IsOptional
	@Selector("privacyInformationIconView")
	public native UIView privacyInformationIconView();

	@Generated
	@Selector("properties")
	public native NSDictionary properties();

	@Generated
	@Selector("setDelegate:")
	public native void setDelegate_unsafe(
			@Mapped(ObjCObjectMapper.class) MPNativeAdAdapterDelegate value);

	@Generated
	public void setDelegate(
			@Mapped(ObjCObjectMapper.class) MPNativeAdAdapterDelegate value) {
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
	@IsOptional
	@Selector("trackClick")
	public native void trackClick();

	@Generated
	@IsOptional
	@Selector("willAttachToView:")
	public native void willAttachToView(UIView view);
}