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
public class MPAPIEndpoints extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected MPAPIEndpoints(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native MPAPIEndpoints alloc();

	@Generated
	@Selector("baseURLStringWithPath:testing:")
	public static native String baseURLStringWithPathTesting(String path,
			boolean testing);

	@Generated
	@Selector("init")
	public native MPAPIEndpoints init();

	@Generated
	@Selector("setUsesHTTPS:")
	public static native void setUsesHTTPS(boolean usesHTTPS);
}