package com.test.mopub_ios_sdk.protocol;


import com.intel.inde.moe.natj.general.ann.Generated;
import com.intel.inde.moe.natj.general.ann.Library;
import com.intel.inde.moe.natj.general.ann.Mapped;
import com.intel.inde.moe.natj.general.ann.MappedReturn;
import com.intel.inde.moe.natj.general.ann.Runtime;
import com.intel.inde.moe.natj.objc.Class;
import com.intel.inde.moe.natj.objc.ObjCRuntime;
import com.intel.inde.moe.natj.objc.ann.ObjCProtocolName;
import com.intel.inde.moe.natj.objc.ann.Selector;
import com.intel.inde.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("mopub_ios_sdk")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MPObjectMapper")
public interface MPObjectMapper {
	@Generated
	@Selector("mappedObjectFromSourceObject:")
	@MappedReturn(ObjCObjectMapper.class)
	Object mappedObjectFromSourceObject(
			@Mapped(ObjCObjectMapper.class) Object object);

	@Generated
	@Selector("requiredSourceObjectClass")
	Class requiredSourceObjectClass();
}