package com.intel.mopub_ios_sdk.category;


import com.intel.inde.moe.natj.general.NatJ;
import com.intel.inde.moe.natj.general.ann.Generated;
import com.intel.inde.moe.natj.general.ann.Library;
import com.intel.inde.moe.natj.general.ann.Runtime;
import com.intel.inde.moe.natj.objc.ObjCRuntime;
import com.intel.inde.moe.natj.objc.ann.ObjCCategory;
import com.intel.inde.moe.natj.objc.ann.Selector;
import ios.foundation.NSString;

@Generated
@Library("mopub_ios_sdk")
@Runtime(ObjCRuntime.class)
@ObjCCategory(NSString.class)
public final class NSStringExt {
	static {
		NatJ.register();
	}

	@Generated
	private NSStringExt() {
	}

	@Generated
	@Selector("mp_URLEncodedString")
	public static native String mp_URLEncodedString(String _object);
}