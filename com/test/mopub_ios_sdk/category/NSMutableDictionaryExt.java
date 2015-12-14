package com.test.mopub_ios_sdk.category;


import com.intel.inde.moe.natj.general.NatJ;
import com.intel.inde.moe.natj.general.ann.Generated;
import com.intel.inde.moe.natj.general.ann.Library;
import com.intel.inde.moe.natj.general.ann.Mapped;
import com.intel.inde.moe.natj.general.ann.Runtime;
import com.intel.inde.moe.natj.objc.ObjCRuntime;
import com.intel.inde.moe.natj.objc.ann.ObjCCategory;
import com.intel.inde.moe.natj.objc.ann.Selector;
import com.intel.inde.moe.natj.objc.map.ObjCObjectMapper;
import ios.foundation.NSMutableDictionary;

@Generated
@Library("mopub_ios_sdk")
@Runtime(ObjCRuntime.class)
@ObjCCategory(NSMutableDictionary.class)
public final class NSMutableDictionaryExt {
	static {
		NatJ.register();
	}

	@Generated
	private NSMutableDictionaryExt() {
	}

	@Generated
	@Selector("mp_safeSetObject:forKey:")
	public static native void mp_safeSetObjectForKey(
			NSMutableDictionary _object,
			@Mapped(ObjCObjectMapper.class) Object obj,
			@Mapped(ObjCObjectMapper.class) Object key);

	@Generated
	@Selector("mp_safeSetObject:forKey:withDefault:")
	public static native void mp_safeSetObjectForKeyWithDefault(
			NSMutableDictionary _object,
			@Mapped(ObjCObjectMapper.class) Object obj,
			@Mapped(ObjCObjectMapper.class) Object key,
			@Mapped(ObjCObjectMapper.class) Object defaultObj);
}