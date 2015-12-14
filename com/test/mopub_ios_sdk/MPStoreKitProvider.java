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
import ios.storekit.SKStoreProductViewController;

@Generated
@Library("mopub_ios_sdk")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPStoreKitProvider extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected MPStoreKitProvider(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native MPStoreKitProvider alloc();

	@Generated
	@Selector("buildController")
	public static native SKStoreProductViewController buildController();

	@Generated
	@Selector("deviceHasStoreKit")
	public static native boolean deviceHasStoreKit();

	@Generated
	@Selector("init")
	public native MPStoreKitProvider init();
}