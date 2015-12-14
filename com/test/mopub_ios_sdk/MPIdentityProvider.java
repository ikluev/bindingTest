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

@Generated
@Library("mopub_ios_sdk")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPIdentityProvider extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected MPIdentityProvider(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("advertisingTrackingEnabled")
	public static native boolean advertisingTrackingEnabled();

	@Generated
	@Owned
	@Selector("alloc")
	public static native MPIdentityProvider alloc();

	@Generated
	@Selector("identifier")
	public static native String identifier();

	@Generated
	@Selector("init")
	public native MPIdentityProvider init();

	@Generated
	@Selector("obfuscatedIdentifier")
	public static native String obfuscatedIdentifier();
}