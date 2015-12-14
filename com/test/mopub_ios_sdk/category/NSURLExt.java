package com.test.mopub_ios_sdk.category;


import com.intel.inde.moe.natj.general.NatJ;
import com.intel.inde.moe.natj.general.ann.Generated;
import com.intel.inde.moe.natj.general.ann.Library;
import com.intel.inde.moe.natj.general.ann.Runtime;
import com.intel.inde.moe.natj.objc.ObjCRuntime;
import com.intel.inde.moe.natj.objc.ann.ObjCCategory;
import com.intel.inde.moe.natj.objc.ann.Selector;
import ios.foundation.NSArray;
import ios.foundation.NSDictionary;
import ios.foundation.NSURL;

@Generated
@Library("mopub_ios_sdk")
@Runtime(ObjCRuntime.class)
@ObjCCategory(NSURL.class)
public final class NSURLExt {
	static {
		NatJ.register();
	}

	@Generated
	private NSURLExt() {
	}

	@Generated
	@Selector("mp_MoPubShareHostCommand")
	public static native int mp_MoPubShareHostCommand(NSURL _object);

	@Generated
	@Selector("mp_hasTelephonePromptScheme")
	public static native boolean mp_hasTelephonePromptScheme(NSURL _object);

	@Generated
	@Selector("mp_hasTelephoneScheme")
	public static native boolean mp_hasTelephoneScheme(NSURL _object);

	@Generated
	@Selector("mp_isMoPubScheme")
	public static native boolean mp_isMoPubScheme(NSURL _object);

	@Generated
	@Selector("mp_isMoPubShareScheme")
	public static native boolean mp_isMoPubShareScheme(NSURL _object);

	@Generated
	@Selector("mp_isSafeForLoadingWithoutUserAction")
	public static native boolean mp_isSafeForLoadingWithoutUserAction(
			NSURL _object);

	@Generated
	@Selector("mp_mopubHostCommand")
	public static native int mp_mopubHostCommand(NSURL _object);

	@Generated
	@Selector("mp_queryAsDictionary")
	public static native NSDictionary mp_queryAsDictionary(NSURL _object);

	@Generated
	@Selector("mp_queryParameterForKey:")
	public static native String mp_queryParameterForKey(NSURL _object,
			String key);

	@Generated
	@Selector("mp_queryParametersForKey:")
	public static native NSArray mp_queryParametersForKey(NSURL _object,
			String key);
}