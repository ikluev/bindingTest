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
import com.test.mopub_ios_sdk.protocol.MPInterstitialAdControllerDelegate;
import ios.corelocation.CLLocation;
import ios.foundation.NSBundle;
import ios.foundation.NSCoder;
import ios.foundation.NSMutableArray;
import ios.uikit.UIViewController;

@Generated
@Library("mopub_ios_sdk")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPInterstitialAdController extends UIViewController {
	static {
		NatJ.register();
	}

	@Generated
	protected MPInterstitialAdController(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("adUnitId")
	public native String adUnitId();

	@Generated
	@Owned
	@Selector("alloc")
	public static native MPInterstitialAdController alloc();

	@Generated
	@Selector("delegate")
	@MappedReturn(ObjCObjectMapper.class)
	public native MPInterstitialAdControllerDelegate delegate();

	@Generated
	@Selector("init")
	public native MPInterstitialAdController init();

	@Generated
	@Selector("initWithCoder:")
	public native MPInterstitialAdController initWithCoder(NSCoder aDecoder);

	@Generated
	@Selector("initWithNibName:bundle:")
	public native MPInterstitialAdController initWithNibNameBundle(
			String nibNameOrNil, NSBundle nibBundleOrNil);

	@Generated
	@Selector("interstitialAdControllerForAdUnitId:")
	public static native MPInterstitialAdController interstitialAdControllerForAdUnitId(
			String adUnitId);

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
	@Selector("ready")
	public native boolean ready();

	@Generated
	@Selector("removeSharedInterstitialAdController:")
	public static native void removeSharedInterstitialAdController(
			MPInterstitialAdController controller);

	@Generated
	@Selector("setAdUnitId:")
	public native void setAdUnitId(String value);

	@Generated
	@Selector("setDelegate:")
	public native void setDelegate_unsafe(
			@Mapped(ObjCObjectMapper.class) MPInterstitialAdControllerDelegate value);

	@Generated
	public void setDelegate(
			@Mapped(ObjCObjectMapper.class) MPInterstitialAdControllerDelegate value) {
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
	@Selector("sharedInterstitialAdControllers")
	public static native NSMutableArray sharedInterstitialAdControllers();

	@Generated
	@Selector("showFromViewController:")
	public native void showFromViewController(UIViewController controller);
}