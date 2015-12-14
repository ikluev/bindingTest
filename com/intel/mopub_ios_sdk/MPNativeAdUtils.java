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
import ios.foundation.NSMutableArray;

@Generated
@Library("mopub_ios_sdk")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPNativeAdUtils extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected MPNativeAdUtils(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("addURLString:toURLArray:")
	public static native boolean addURLStringToURLArray(String urlString,
			NSMutableArray urlArray);

	@Generated
	@Owned
	@Selector("alloc")
	public static native MPNativeAdUtils alloc();

	@Generated
	@Selector("init")
	public native MPNativeAdUtils init();
}