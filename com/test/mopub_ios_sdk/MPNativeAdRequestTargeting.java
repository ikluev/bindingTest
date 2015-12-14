package com.test.mopub_ios_sdk;


import com.intel.inde.moe.natj.general.NatJ;
import com.intel.inde.moe.natj.general.Pointer;
import com.intel.inde.moe.natj.general.ann.Generated;
import com.intel.inde.moe.natj.general.ann.Library;
import com.intel.inde.moe.natj.general.ann.Owned;
import com.intel.inde.moe.natj.general.ann.Runtime;
import com.intel.inde.moe.natj.objc.ObjCRuntime;
import com.intel.inde.moe.natj.objc.ann.ObjCClassBinding;
import com.intel.inde.moe.natj.objc.ann.Selector;
import ios.NSObject;
import ios.corelocation.CLLocation;
import ios.foundation.NSSet;

@Generated
@Library("mopub_ios_sdk")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPNativeAdRequestTargeting extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected MPNativeAdRequestTargeting(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native MPNativeAdRequestTargeting alloc();

	@Generated
	@Selector("desiredAssets")
	public native NSSet desiredAssets();

	@Generated
	@Selector("init")
	public native MPNativeAdRequestTargeting init();

	@Generated
	@Selector("keywords")
	public native String keywords();

	@Generated
	@Selector("location")
	public native CLLocation location();

	@Generated
	@Selector("setDesiredAssets:")
	public native void setDesiredAssets(NSSet value);

	@Generated
	@Selector("setKeywords:")
	public native void setKeywords(String value);

	@Generated
	@Selector("setLocation:")
	public native void setLocation(CLLocation value);

	@Generated
	@Selector("targeting")
	public static native MPNativeAdRequestTargeting targeting();
}