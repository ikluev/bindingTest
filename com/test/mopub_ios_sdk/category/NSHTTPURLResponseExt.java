package com.test.mopub_ios_sdk.category;


import com.intel.inde.moe.natj.general.NatJ;
import com.intel.inde.moe.natj.general.ann.Generated;
import com.intel.inde.moe.natj.general.ann.Library;
import com.intel.inde.moe.natj.general.ann.NUInt;
import com.intel.inde.moe.natj.general.ann.Runtime;
import com.intel.inde.moe.natj.objc.ObjCRuntime;
import com.intel.inde.moe.natj.objc.ann.ObjCCategory;
import com.intel.inde.moe.natj.objc.ann.Selector;
import ios.foundation.NSHTTPURLResponse;

@Generated
@Library("mopub_ios_sdk")
@Runtime(ObjCRuntime.class)
@ObjCCategory(NSHTTPURLResponse.class)
public final class NSHTTPURLResponseExt {
	static {
		NatJ.register();
	}

	@Generated
	private NSHTTPURLResponseExt() {
	}

	@Generated
	@Selector("stringEncodingFromContentType:")
	@NUInt
	public static native long stringEncodingFromContentType(
			NSHTTPURLResponse _object, String contentType);
}