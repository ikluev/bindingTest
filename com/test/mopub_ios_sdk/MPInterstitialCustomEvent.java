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
import ios.NSObject;
import ios.foundation.NSDictionary;
import ios.uikit.UIViewController;

@Generated
@Library("mopub_ios_sdk")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPInterstitialCustomEvent extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected MPInterstitialCustomEvent(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native MPInterstitialCustomEvent alloc();

	@Generated
	@Selector("delegate")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object delegate();

	@Generated
	@Selector("enableAutomaticImpressionAndClickTracking")
	public native boolean enableAutomaticImpressionAndClickTracking();

	@Generated
	@Selector("init")
	public native MPInterstitialCustomEvent init();

	@Generated
	@Selector("requestInterstitialWithCustomEventInfo:")
	public native void requestInterstitialWithCustomEventInfo(NSDictionary info);

	@Generated
	@Selector("setDelegate:")
	public native void setDelegate_unsafe(
			@Mapped(ObjCObjectMapper.class) Object value);

	@Generated
	public void setDelegate(@Mapped(ObjCObjectMapper.class) Object value) {
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
	@Selector("showInterstitialFromRootViewController:")
	public native void showInterstitialFromRootViewController(
			UIViewController rootViewController);
}