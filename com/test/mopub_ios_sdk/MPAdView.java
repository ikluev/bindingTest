package com.test.mopub_ios_sdk;


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
import com.test.mopub_ios_sdk.protocol.MPAdViewDelegate;
import ios.coregraphics.struct.CGRect;
import ios.coregraphics.struct.CGSize;
import ios.corelocation.CLLocation;
import ios.foundation.NSCoder;
import ios.uikit.UIView;

@Generated
@Library("mopub_ios_sdk")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPAdView extends UIView {
	static {
		NatJ.register();
	}

	@Generated
	protected MPAdView(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("adContentViewSize")
	@ByValue
	public native CGSize adContentViewSize();

	@Generated
	@Selector("adUnitId")
	public native String adUnitId();

	@Generated
	@Owned
	@Selector("alloc")
	public static native MPAdView alloc();

	@Generated
	@Selector("allowedNativeAdsOrientation")
	public native int allowedNativeAdsOrientation();

	@Generated
	@Selector("delegate")
	@MappedReturn(ObjCObjectMapper.class)
	public native MPAdViewDelegate delegate();

	@Generated
	@Selector("forceRefreshAd")
	public native void forceRefreshAd();

	@Generated
	@Selector("init")
	public native MPAdView init();

	@Generated
	@Selector("initWithAdUnitId:size:")
	public native MPAdView initWithAdUnitIdSize(String adUnitId,
			@ByValue CGSize size);

	@Generated
	@Selector("initWithCoder:")
	public native MPAdView initWithCoder(NSCoder aDecoder);

	@Generated
	@Selector("initWithFrame:")
	public native MPAdView initWithFrame(@ByValue CGRect frame);

	@Generated
	@Selector("isTesting")
	public native boolean isTesting();

	@Generated
	@Selector("keywords")
	public native String keywords();

	@Generated
	@Selector("loadAd")
	public native void loadAd();

	@Generated
	@Selector("location")
	public native CLLocation location();

	@Generated
	@Selector("lockNativeAdsToOrientation:")
	public native void lockNativeAdsToOrientation(int orientation);

	@Generated
	@Selector("rotateToOrientation:")
	public native void rotateToOrientation(@NInt long newOrientation);

	@Generated
	@Selector("setAdUnitId:")
	public native void setAdUnitId(String value);

	@Generated
	@Selector("setDelegate:")
	public native void setDelegate_unsafe(
			@Mapped(ObjCObjectMapper.class) MPAdViewDelegate value);

	@Generated
	public void setDelegate(
			@Mapped(ObjCObjectMapper.class) MPAdViewDelegate value) {
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
	@Selector("setKeywords:")
	public native void setKeywords(String value);

	@Generated
	@Selector("setLocation:")
	public native void setLocation(CLLocation value);

	@Generated
	@Selector("setTesting:")
	public native void setTesting(boolean value);

	@Generated
	@Selector("startAutomaticallyRefreshingContents")
	public native void startAutomaticallyRefreshingContents();

	@Generated
	@Selector("stopAutomaticallyRefreshingContents")
	public native void stopAutomaticallyRefreshingContents();

	@Generated
	@Selector("unlockNativeAdsOrientation")
	public native void unlockNativeAdsOrientation();
}