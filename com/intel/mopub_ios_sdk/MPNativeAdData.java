package com.intel.mopub_ios_sdk;


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

@Generated
@Library("mopub_ios_sdk")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPNativeAdData extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected MPNativeAdData(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("ad")
	public native MPNativeAd ad();

	@Generated
	@Selector("adUnitID")
	public native String adUnitID();

	@Generated
	@Owned
	@Selector("alloc")
	public static native MPNativeAdData alloc();

	@Generated
	@Selector("init")
	public native MPNativeAdData init();

	@Generated
	@Selector("setAd:")
	public native void setAd(MPNativeAd value);

	@Generated
	@Selector("setAdUnitID:")
	public native void setAdUnitID(String value);
}