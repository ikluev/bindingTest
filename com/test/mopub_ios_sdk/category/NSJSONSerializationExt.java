package com.test.mopub_ios_sdk.category;


import com.intel.inde.moe.natj.general.NatJ;
import com.intel.inde.moe.natj.general.ann.Generated;
import com.intel.inde.moe.natj.general.ann.Library;
import com.intel.inde.moe.natj.general.ann.MappedReturn;
import com.intel.inde.moe.natj.general.ann.NUInt;
import com.intel.inde.moe.natj.general.ann.Runtime;
import com.intel.inde.moe.natj.general.ptr.Ptr;
import com.intel.inde.moe.natj.objc.ObjCRuntime;
import com.intel.inde.moe.natj.objc.ann.CategoryClassMethod;
import com.intel.inde.moe.natj.objc.ann.ObjCCategory;
import com.intel.inde.moe.natj.objc.ann.Selector;
import com.intel.inde.moe.natj.objc.map.ObjCObjectMapper;
import ios.foundation.NSData;
import ios.foundation.NSError;
import ios.foundation.NSJSONSerialization;

@Generated
@Library("mopub_ios_sdk")
@Runtime(ObjCRuntime.class)
@ObjCCategory(NSJSONSerialization.class)
public final class NSJSONSerializationExt {
	static {
		NatJ.register();
	}

	@Generated
	private NSJSONSerializationExt() {
	}

	@Generated
	@Selector("mp_JSONObjectWithData:options:clearNullObjects:error:")
	@CategoryClassMethod
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object mp_JSONObjectWithDataOptionsClearNullObjectsError(
			NSData data, @NUInt long opt, boolean clearNulls, Ptr<NSError> error);
}