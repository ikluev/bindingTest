package com.test.mopub_ios_sdk;


import com.intel.inde.moe.natj.general.NatJ;
import com.intel.inde.moe.natj.general.Pointer;
import com.intel.inde.moe.natj.general.ann.Generated;
import com.intel.inde.moe.natj.general.ann.Library;
import com.intel.inde.moe.natj.general.ann.Mapped;
import com.intel.inde.moe.natj.general.ann.MappedReturn;
import com.intel.inde.moe.natj.general.ann.Owned;
import com.intel.inde.moe.natj.general.ann.Runtime;
import com.intel.inde.moe.natj.objc.Class;
import com.intel.inde.moe.natj.objc.ObjCRuntime;
import com.intel.inde.moe.natj.objc.ann.ObjCClassBinding;
import com.intel.inde.moe.natj.objc.ann.Selector;
import com.intel.inde.moe.natj.objc.map.ObjCObjectMapper;
import com.test.mopub_ios_sdk.protocol.MPObjectMapper;
import ios.NSObject;

@Generated
@Library("mopub_ios_sdk")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPDurationStringToTimeIntervalMapper extends NSObject implements
		MPObjectMapper {
	static {
		NatJ.register();
	}

	@Generated
	protected MPDurationStringToTimeIntervalMapper(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native MPDurationStringToTimeIntervalMapper alloc();

	@Generated
	@Selector("init")
	public native MPDurationStringToTimeIntervalMapper init();

	@Generated
	@Selector("mappedObjectFromSourceObject:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object mappedObjectFromSourceObject(
			@Mapped(ObjCObjectMapper.class) Object object);

	@Generated
	@Selector("requiredSourceObjectClass")
	public native Class requiredSourceObjectClass();
}